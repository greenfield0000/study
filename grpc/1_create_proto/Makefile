build_java: rm_java_dir
	mkdir -p java && protoc --java_out=./java hello_world.proto

build_golang: rm_golang_dir
	mkdir -p golang && protoc --go_out=./golang hello_world.proto

rm_java_dir: 
	rm -r java

rm_golang_dir:
	rm -r golang
