package org.example.mediaappgrpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VideoServiceGrpc {

  private VideoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.mediaappgrpc.proto.VideoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.UploadVideoRequest,
      org.example.mediaappgrpc.proto.Video> getUploadVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadVideo",
      requestType = org.example.mediaappgrpc.proto.UploadVideoRequest.class,
      responseType = org.example.mediaappgrpc.proto.Video.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.UploadVideoRequest,
      org.example.mediaappgrpc.proto.Video> getUploadVideoMethod() {
    io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.UploadVideoRequest, org.example.mediaappgrpc.proto.Video> getUploadVideoMethod;
    if ((getUploadVideoMethod = VideoServiceGrpc.getUploadVideoMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getUploadVideoMethod = VideoServiceGrpc.getUploadVideoMethod) == null) {
          VideoServiceGrpc.getUploadVideoMethod = getUploadVideoMethod =
              io.grpc.MethodDescriptor.<org.example.mediaappgrpc.proto.UploadVideoRequest, org.example.mediaappgrpc.proto.Video>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.mediaappgrpc.proto.UploadVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.mediaappgrpc.proto.Video.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("uploadVideo"))
              .build();
        }
      }
    }
    return getUploadVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.VideoIdRequest,
      org.example.mediaappgrpc.proto.Video> getGetVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVideo",
      requestType = org.example.mediaappgrpc.proto.VideoIdRequest.class,
      responseType = org.example.mediaappgrpc.proto.Video.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.VideoIdRequest,
      org.example.mediaappgrpc.proto.Video> getGetVideoMethod() {
    io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.VideoIdRequest, org.example.mediaappgrpc.proto.Video> getGetVideoMethod;
    if ((getGetVideoMethod = VideoServiceGrpc.getGetVideoMethod) == null) {
      synchronized (VideoServiceGrpc.class) {
        if ((getGetVideoMethod = VideoServiceGrpc.getGetVideoMethod) == null) {
          VideoServiceGrpc.getGetVideoMethod = getGetVideoMethod =
              io.grpc.MethodDescriptor.<org.example.mediaappgrpc.proto.VideoIdRequest, org.example.mediaappgrpc.proto.Video>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.mediaappgrpc.proto.VideoIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.mediaappgrpc.proto.Video.getDefaultInstance()))
              .setSchemaDescriptor(new VideoServiceMethodDescriptorSupplier("getVideo"))
              .build();
        }
      }
    }
    return getGetVideoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceStub>() {
        @java.lang.Override
        public VideoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceStub(channel, callOptions);
        }
      };
    return VideoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceBlockingStub>() {
        @java.lang.Override
        public VideoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceBlockingStub(channel, callOptions);
        }
      };
    return VideoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoServiceFutureStub>() {
        @java.lang.Override
        public VideoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoServiceFutureStub(channel, callOptions);
        }
      };
    return VideoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void uploadVideo(org.example.mediaappgrpc.proto.UploadVideoRequest request,
        io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Video> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadVideoMethod(), responseObserver);
    }

    /**
     */
    default void getVideo(org.example.mediaappgrpc.proto.VideoIdRequest request,
        io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Video> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVideoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VideoService.
   */
  public static abstract class VideoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VideoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VideoService.
   */
  public static final class VideoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VideoServiceStub> {
    private VideoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceStub(channel, callOptions);
    }

    /**
     */
    public void uploadVideo(org.example.mediaappgrpc.proto.UploadVideoRequest request,
        io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Video> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVideo(org.example.mediaappgrpc.proto.VideoIdRequest request,
        io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Video> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVideoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VideoService.
   */
  public static final class VideoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VideoServiceBlockingStub> {
    private VideoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.mediaappgrpc.proto.Video uploadVideo(org.example.mediaappgrpc.proto.UploadVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadVideoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.mediaappgrpc.proto.Video getVideo(org.example.mediaappgrpc.proto.VideoIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVideoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VideoService.
   */
  public static final class VideoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VideoServiceFutureStub> {
    private VideoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.mediaappgrpc.proto.Video> uploadVideo(
        org.example.mediaappgrpc.proto.UploadVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadVideoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.mediaappgrpc.proto.Video> getVideo(
        org.example.mediaappgrpc.proto.VideoIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVideoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_VIDEO = 0;
  private static final int METHODID_GET_VIDEO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_VIDEO:
          serviceImpl.uploadVideo((org.example.mediaappgrpc.proto.UploadVideoRequest) request,
              (io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Video>) responseObserver);
          break;
        case METHODID_GET_VIDEO:
          serviceImpl.getVideo((org.example.mediaappgrpc.proto.VideoIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Video>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUploadVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.mediaappgrpc.proto.UploadVideoRequest,
              org.example.mediaappgrpc.proto.Video>(
                service, METHODID_UPLOAD_VIDEO)))
        .addMethod(
          getGetVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.mediaappgrpc.proto.VideoIdRequest,
              org.example.mediaappgrpc.proto.Video>(
                service, METHODID_GET_VIDEO)))
        .build();
  }

  private static abstract class VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.mediaappgrpc.proto.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoService");
    }
  }

  private static final class VideoServiceFileDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier {
    VideoServiceFileDescriptorSupplier() {}
  }

  private static final class VideoServiceMethodDescriptorSupplier
      extends VideoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VideoServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VideoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoServiceFileDescriptorSupplier())
              .addMethod(getUploadVideoMethod())
              .addMethod(getGetVideoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
