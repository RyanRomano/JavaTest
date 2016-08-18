<?php


namespace App\Http\Controllers;

use App\Post;

class PagesController extends Controller
{
	public function getIndex(){
		$posts = Post::orderBy('created_at', 'desc')->limit(4)->get();
		return view('pages.welcome')->withPosts($posts);
			#process data or params
			#talk to model
			#receive from model
			#compile /process data from model
			#pass that data to correct view		
	}

	public function getAbout(){

		$firstName = 'Ryan';
		$lastName = 'Romano';
		$fullname = $firstName . " " . $lastName;
		$email = 'ryanaromano@gmail.com';
		$data = [];
		$data['email'] = $email;
		$data['fullname'] = $fullname;
		return view('pages.about')->withData($data);

	}

	public function getContact(){
		return view('pages.contact');
	}
}





?>