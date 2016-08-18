@extends('main')
@section('title', '| All Posts')
@section('content')

	<div class="row">
		<div class="col-md-10">
			<h1>All Posts</h1>
		</div>
		<div class="col-md-2">
			<a href="{{ route('posts.create') }}" class="btn btn-lg btn-block btn-primary btn-margin-spacing">Create New Post</a>
		</div>
		<div class="col-md-12">
			<hr>	
		</div>
		<hr>
	</div> <!--end of row -->
	<div class="row">
		<div class="col-md-12">
			<table class="table">
				<thead>
					<th>#</th>
					<th>Title</th>
					<th>body</th>
					<th>created at</th>
					<th></th>
				</thead>
				<tbody>
					@foreach($posts as $post)
						<tr>
							<th>{{ $post->id }}</th>
							<td>{{ substr($post->title,0, 50) }}{{ strlen($post->title) > 50 ? "..." : "" }}</td>
							<td>{{ substr($post->body, 0, 50) }}{{ strlen($post->body) > 50 ? "..." : "" }}</td>
							<td>{{ date('M j, Y', strtotime($post->created_at)) }}</td>
							<td><a href=" {{ route('posts.show', $post->id) }} " class="btn btn-success btn-sm fa fa-eye"></a> 
								<a href=" {{ route('posts.edit', $post->id)}} " class="btn btn-warning btn-sm fa fa-pencil"></a>
							</td>
						</tr>
					@endforeach

				</tbody>
			</table>
			<div class="text-center">
				{!! $posts->links(); !!}
			</div>
		</div>
	</div>
@endsection