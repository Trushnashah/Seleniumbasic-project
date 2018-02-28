package com.maven.practice;


import org.testng.annotations.Test;


public class MavenTestcasesProject {

	
	@Test
	public void testcase1() {
	System.out.println("This is for Maven");
//Trushna shah
	//Branching practice
	
	/*
	 * 
	 * 
	 * C:\Trushna\Git>git checkout -b "Tru_local"
	 
	Switched to a new branch 'Tru_local'

	C:\Trushna\Git>git branch
	* Tru_local
	  master

	C:\Trushna\Git>git branch
	* Tru_local
	  master

	C:\Trushna\Git>git status
	On branch Tru_local
	Changes not staged for commit:
	  (use "git add <file>..." to update what will be committed)
	  (use "git checkout -- <file>..." to discard changes in working directory)

	        modified:   NewMavenGit/Seleniumbasic-project/MavenDemo/src/test/java/com/maven/practice/MavenTestcasesProject.java

	no changes added to commit (use "git add" and/or "git commit -a")

	C:\Trushna\Git>git add .

	C:\Trushna\Git>git status
	On branch Tru_local
	Changes to be committed:
	  (use "git reset HEAD <file>..." to unstage)

	        modified:   NewMavenGit/Seleniumbasic-project/MavenDemo/src/test/java/com/maven/practice/MavenTestcasesProject.java


	C:\Trushna\Git>git commit -m "branch"
	[Tru_local c6db008] branch
	 1 file changed, 1 insertion(+)

	C:\Trushna\Git>git push
	fatal: The current branch Tru_local has no upstream branch.
	To push the current branch and set the remote as upstream, use

	    git push --set-upstream origin Tru_local


	C:\Trushna\Git>git push origin Tru_local
	Counting objects: 12, done.
	Delta compression using up to 4 threads.
	Compressing objects: 100% (7/7), done.
	Writing objects: 100% (12/12), 891 bytes | 127.00 KiB/s, done.
	Total 12 (delta 2), reused 0 (delta 0)
	remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
	To https://github.com/Trushnashah/Seleniumbasic-project.git
	 * [new branch]      Tru_local -> Tru_local

	C:\Trushna\Git>git status
	On branch Tru_local
	nothing to commit, working tree clean

	C:\Trushna\Git>git pull
	remote: Counting objects: 1, done.
	remote: Total 1 (delta 0), reused 0 (delta 0), pack-reused 0
	Unpacking objects: 100% (1/1), done.
	From https://github.com/Trushnashah/Seleniumbasic-project
	   49d4161..bc329d1  master     -> origin/master
	There is no tracking information for the current branch.
	Please specify which branch you want to merge with.
	See git-pull(1) for details.

	    git pull <remote> <branch>

	If you wish to set tracking information for this branch you can do so with:

	    git branch --set-upstream-to=<remote>/<branch> Tru_local


	C:\Trushna\Git>git pull origin master
	From https://github.com/Trushnashah/Seleniumbasic-project
	 * branch            master     -> FETCH_HEAD
	Updating c6db008..bc329d1
	Fast-forward

	C:\Trushna\Git>git status
	On branch Tru_local
	nothing to commit, working tree clean

	C:\Trushna\Git>git branch
	* Tru_local
	  master

	C:\Trushna\Git>git checkout master
	Switched to branch 'master'
	Your branch is behind 'origin/master' by 2 commits, and can be fast-forwarded.
	  (use "git pull" to update your local branch)

	C:\Trushna\Git>git branch
	  Tru_local
	* master

	C:\Trushna\Git>git pull
	Updating 49d4161..bc329d1
	Fast-forward
	 .../src/test/java/com/maven/practice/MavenTestcasesProject.java          | 1 +
	 1 file changed, 1 insertion(+)

	C:\Trushna\Git>git status
	On branch master
	Your branch is up to date with 'origin/master'.

	nothing to commit, working tree clean

	C:\Trushna\Git>git checkout Tru_local
	Switched to branch 'Tru_local'

	C:\Trushna\Git>git branch
	* Tru_local
	  master

	C:\Trushna\Git>git pull
	There is no tracking information for the current branch.
	Please specify which branch you want to merge with.
	See git-pull(1) for details.

	    git pull <remote> <branch>

	If you wish to set tracking information for this branch you can do so with:

	    git branch --set-upstream-to=<remote>/<branch> Tru_local


	C:\Trushna\Git>git branch
	* Tru_local
	  master

	}
	}

*/