# test-github-action

You can configure a GitHub Actions workflow to be triggered when an event occurs in your repository,
such as a pull request being opened or an issue being created. Your workflow contains one or more jobs
which can run in sequential order or in parallel. Each job will run inside its own virtual machine runner,
or inside a container, and has one or more steps that either run a script that you define or run an action,
which is a reusable extension that can simplify your workflow.

Workflows are defined in the .github/workflows.
A repository can have multiple workflows, each of which can perform a different set of tasks.
For example, you can have one workflow to build and test pull requests, another workflow to deploy your application
every time a release is created, and still another workflow that adds a label every time someone opens a new issue.

