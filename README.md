# processing-library-template-gradle

Processing library template using gradle.

## Development

### Download template

```bash
mkdir YOUR_LIBRARY_NAME
cd YOUR_LIBRARY_NAME
git clone https://github.com/endoh0509/processing-library-template-gradle.git .
``` 

### Edit settings.gradle

```settings.gradle
rootProject.name='YOUR_LIBRARY_NAME'
```

### Edit build.gradle

```build.gradle
group 'YOUR_LIBRARY_NAME'
```

### Edit library.properties

Please write to us with information about your library.

### Write library source code

Edit `src/main/java/*`

## Build

```bash
./gradlew -q
```

### Build with GitHub Actions

Push the tag to the GitHub repository. Then the Release workflow will run and the build result will be uploaded to the Releases page on GitHub.

## Generate JavaDoc

```bash
./gradlew javadoc
```

## Installation

Copy this directory into `processing/libraries`

## License

MIT License
