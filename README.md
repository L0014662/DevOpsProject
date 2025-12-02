# DevOpsProject
The DevOps Project for a program with simple mathematical functions (add, multiply and divide).
# Repo Owner
Ben O'Donnell
---
# Branching Strategy

For this project, I've decided to use **Trunk-Based Development (TBD)** that makes use of short-lived branches for features that is later merged back into the `main` branch.
This strategy allows for smaller and frequent changes as opposed to larger risker merges, less likely to cause merge conflicts and is suitable for the Continuous Integration workflow. Branches should be deleted after in order to keep the repo clean.

### Branch Naming Convention
```as
- feature/<task-name>
- fix/<bug-name>
- test/<testing-task>
- docs/<documentation-change>
```
Examples:
```as
- feature/add-tests
- docs/update-readme
- fix/division-by-zero
```
### Commit Messages

Commit messages should follow this format:
```as
<type>: <description>
```

Examples:
```as
-test: add multiply function edge case tests
-docs: create SECURITY.md and CODE_OF_CONDUCT.md
-ci: configure JavaDoc workflow
```

Acceptable Commit types:
```as
- `feat`
- `fix`
- `docs`
- `ci`
- `test`
- `refactor`
```
---
# Current Implementation

This repo features the following workflows:

### Continuous Integration (CI)
A 'ci.yml' that triggers on push and pull request and uses Maven to build the project, run JUnit tests, generate test reports and JaCoCo coverage results.

### Unit Testing (JUnit 5)
The tests covers the Addition (positive and negative values, handling zero), Multiplication (positive and negative values) and Division (divide by zero handling) functions of the program.
Coverage was increased the more functions added to the program with it initally starting at 20% coverage before reaching up 60% coverage with the Multiply/divide tests.

### Automated Documentation
A 'javadoc.yml' is included which allows Github Actions to automatically generate a JavaDoc on every push/pull and makes sure that current documentation matches the current code.

### Code Formatting & Style Enforcement
Spotless is used to implement linting into the project which helps to clean whitespaces and enforces formatting standards.
If formatting fails, the workflow block emerges.

To fix formatting locally:
```as
mvn spotless:apply
```
---

# License

This project is released under the **MIT License**.  
See: [`LICENSE.md`](./LICENSE.md)

---
