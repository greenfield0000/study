PROTOC := protoc
PROTO_DIR := protos
OUT_DIR := generated

GRPC_JAVA_PLUGIN := $(shell which protoc-gen-grpc-java)
GRPC_GOLANG_PLUGIN := $(shell which protoc-gen-grpc-go)
PROTO_FILES := $(wildcard $(PROTO_DIR)/*.proto)

# Подкаталоги для разных языков
JAVA_OUT := $(OUT_DIR)/java
GO_OUT := $(OUT_DIR)/go
DART_OUT := $(OUT_DIR)/dart
TS_OUT := $(OUT_DIR)/ts

all: clean prepare java go dart ts

prepare:
	@mkdir -p $(JAVA_OUT) $(GO_OUT) $(DART_OUT) $(TS_OUT)

java:
	@echo " "
	@echo "Generating Java gRPC code..."
	$(PROTOC) \
		--plugin=protoc-gen-grpc-java=$(GRPC_JAVA_PLUGIN) \
		--proto_path=$(PROTO_DIR) \
		--java_out=$(JAVA_OUT) \
		--grpc-java_out=$(JAVA_OUT) \
		$(PROTO_FILES)

go:
	@echo " "
	@echo "Generating Golang gRPC code..."
	$(PROTOC) \
		--proto_path=$(PROTO_DIR) \
		--go_out=$(OUT_DIR) \
		--go-grpc_out=$(OUT_DIR) \
		$(PROTO_FILES)

dart:
	@echo " "
	@echo "Generating Dart gRPC code..."
	$(PROTOC) \
		--proto_path=$(PROTO_DIR) \
		--dart_out=grpc:$(DART_OUT) \
		$(PROTO_FILES)

ts:
	@echo " "
	@echo "Generating Typescript gRPC code..."
	$(PROTOC) \
		--proto_path=$(PROTO_DIR) \
		--js_out=import_style=commonjs:$(TS_OUT) \
		--grpc-web_out=import_style=typescript,mode=grpcwebtext:$(TS_OUT) \
		$(PROTO_FILES)

clean:
	@rm -rf $(OUT_DIR)
