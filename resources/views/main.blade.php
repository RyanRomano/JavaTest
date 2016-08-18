<!DOCTYPE html>
<html lang="en">

  <head>
    <!-- _head.blade.php file - contains header markup -->
    @include('partials._head')
  
  </head>

  <body>
    <!-- _nav.blade.php file contains navigation -->
    @include('partials._nav')

    <div class="container">

      <!-- MAIN PAGE CONTENT -->
      @include('partials._messages')

      {{Auth::check() ? "Logged in" : "Logged out"}}

      @yield('content')
      <!-- _footer.blade.php contains footer -->
      @include('partials._footer')

    </div> <!-- END CONTAINER-->

    @include('partials._js')
    @yield('scripts')
    
  </body>

</html>