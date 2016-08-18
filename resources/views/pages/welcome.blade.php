@extends('main')
@section('title', ' | Homepage')
@section('content')
  <div class="row">
    <div class="col-md-12">
      <div class="jumbotron">
        <h1 class="fa fa-reddit-alien"> Welcome to My Blog!</h1>
        <p class="lead">Thank you so much for visiting. This is my test website built with Laravel. Please read my popular post!</p>
        <p><a class="btn btn-primary btn-lg" href="/blog" role="button">Recent Blog Posts</a></p>
      </div>
    </div>
  </div>
  <!-- end of header .row -->

  <div class="row">
    <div class="col-md-8"><!--posts start-->
      @foreach($posts as $post)
        <div class="post">
          <h3> {{ substr($post->title, 0, 30) }} {{ strlen($post->body) > 30 ? "..." : "" }} </h3>
          <p> {{ substr($post->body, 0, 200) }} {{ strlen($post->body) > 250 ? "..." : "" }}</p>
          <a href="{{url('blog/'.$post->slug)}}" class="btn btn-primary">Read More</a>
        </div>

        <hr>
      @endforeach
      
    </div><!--Posts end -->

    <div class="col-md-3 col-md-offset-1">
      <h2>Sidebar</h2>
    </div>
  </div>
@endsection<!-- END CONTENT -->