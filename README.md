# pong-clone

This is a collaborative learning-focused project for beginning CS students at Wright State.

## Getting Started

1. Install the jdk, git, and whatever programming IDE or text editor you want (see here for instructions: https://github.com/mkijowski/wsu-cs-remote-setup)

2. Get a GitHub account (these are free). Consider choosing a professional-ish sounding username.

3. Fork this project (the fork button is in the upper right corner of this page). This creates a copy of the repository within your own GitHub account for you to work on independently, so that multiple developers can be working on different parts of the application at the same time.

4. Clone your fork to your local system by opening up a terminal and using this command: `git clone <REPOSITORY_URL>`  You can find the repository URL by clicking on the green "Code" button. Create a connection between your local repository and the main one in my GitHub account by typing the line below from the terminal. Note that the REPOSITORY_URL below is the one of the <b>original</b> repo, whereas the one from the clone command is the URL of your <b>fork</b>.

 * `git remote add upstream <REPOSITORY_URL>`
 
 ## Contributing

1. Pick an issue from the "Issues" list at the top of this page that you'd like to work on and post a comment saying that you want to give it a shot. I will then put you in as the assignee.

2. Make sure you are working on an up-to-date version of the project. To do this:

 * Check out master in your local repository: `git checkout master`
 
 * Pull the lastest version of master from the upstream repository: `git pull upstream master`
 
 * Push the latest version of master to your local repo with: `git push origin master`
 
 * Create a new branch to work on your issue in: `git checkout -b <branch_name>`

3. Play around with the code and fix/implement the issue you picked. NOTE: We're writing Pong here. This is a *very* low-stakes development project. Don't worry if you don't understand all aspects of the code -- just play around with it and see what you can do.

4. When you think you have finished the issue, *test your work locally*.

5. Once you feel good about it, commit your work to your forked version of the repo. You can use these commands:

  * `git commit -a`
  * This opens a text editor. Type in a commit message explaining what you did and then save it. Be sure to reference the issue number in your commit message (i.e. "fixes/implements issue #4").
  * `git push`
  
6. Finally, generate a pull request (the link for this is at the top of your forked repository page).

Happy hacking!!
