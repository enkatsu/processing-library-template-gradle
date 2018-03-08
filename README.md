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

### Write library source code

Edit `src/main/java/*`

## Build

```bash
gradle -q
```

## Generate JavaDoc

```bash
gradle javadoc
```

## Installation

Copy this directory into `processing/libraries`

## License

MIT License
