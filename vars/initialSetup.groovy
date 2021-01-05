def call(Map stageParams,env) {

    if (env.techStack=="java"){
		bat "mvn clean compile"
	}
	if (env.techStack=="dotnet"){
		bat "dotnet restore"
	}
	if (env.techStack=="nodejs"){
		bat "npm install"
	}
  }
