PROTO_DIR := protos
OUT_DIR := generated

# Путь к protoc-gen-* плагинам (если нужны вручную)
PROTOC_GEN_GRPC_WEB := protoc-gen-grpc-web

all: java go dart ts

java:
	protoc -I=$(PROTO_DIR) $(PROTO_DIR)/*.proto \
		--java_out=$(OUT_DIR)/java \
		--grpc-java_out=$(OUT_DIR)/java

go:
	protoc -I=$(PROTO_DIR) $(PROTO_DIR)/*.proto \
		--go_out=$(OUT_DIR)/go \
		--go-grpc_out=$(OUT_DIR)/go

dart:
	protoc -I=$(PROTO_DIR) $(PROTO_DIR)/*.proto \
		--dart_out=grpc:$(OUT_DIR)/dart

ts:
	protoc -I=$(PROTO_DIR) $(PROTO_DIR)/*.proto \
		--js_out=import_style=commonjs:$(OUT_DIR)/ts \
		--grpc-web_out=import_style=typescript,mode=grpcwebtext:$(OUT_DIR)/ts

clean:
	rm -rf $(OUT_DIR)

