package org.example.mediaappgrpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CreatorServiceGrpc {

  private CreatorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.mediaappgrpc.proto.CreatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.CreatorIdRequest,
      org.example.mediaappgrpc.proto.Creator> getGetCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCreator",
      requestType = org.example.mediaappgrpc.proto.CreatorIdRequest.class,
      responseType = org.example.mediaappgrpc.proto.Creator.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.CreatorIdRequest,
      org.example.mediaappgrpc.proto.Creator> getGetCreatorMethod() {
    io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.CreatorIdRequest, org.example.mediaappgrpc.proto.Creator> getGetCreatorMethod;
    if ((getGetCreatorMethod = CreatorServiceGrpc.getGetCreatorMethod) == null) {
      synchronized (CreatorServiceGrpc.class) {
        if ((getGetCreatorMethod = CreatorServiceGrpc.getGetCreatorMethod) == null) {
          CreatorServiceGrpc.getGetCreatorMethod = getGetCreatorMethod =
              io.grpc.MethodDescriptor.<org.example.mediaappgrpc.proto.CreatorIdRequest, org.example.mediaappgrpc.proto.Creator>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.mediaappgrpc.proto.CreatorIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.mediaappgrpc.proto.Creator.getDefaultInstance()))
              .setSchemaDescriptor(new CreatorServiceMethodDescriptorSupplier("getCreator"))
              .build();
        }
      }
    }
    return getGetCreatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.CreatorIdRequest,
      org.example.mediaappgrpc.proto.VideoStream> getGetCreatorVideosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCreatorVideos",
      requestType = org.example.mediaappgrpc.proto.CreatorIdRequest.class,
      responseType = org.example.mediaappgrpc.proto.VideoStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.CreatorIdRequest,
      org.example.mediaappgrpc.proto.VideoStream> getGetCreatorVideosMethod() {
    io.grpc.MethodDescriptor<org.example.mediaappgrpc.proto.CreatorIdRequest, org.example.mediaappgrpc.proto.VideoStream> getGetCreatorVideosMethod;
    if ((getGetCreatorVideosMethod = CreatorServiceGrpc.getGetCreatorVideosMethod) == null) {
      synchronized (CreatorServiceGrpc.class) {
        if ((getGetCreatorVideosMethod = CreatorServiceGrpc.getGetCreatorVideosMethod) == null) {
          CreatorServiceGrpc.getGetCreatorVideosMethod = getGetCreatorVideosMethod =
              io.grpc.MethodDescriptor.<org.example.mediaappgrpc.proto.CreatorIdRequest, org.example.mediaappgrpc.proto.VideoStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCreatorVideos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.mediaappgrpc.proto.CreatorIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.mediaappgrpc.proto.VideoStream.getDefaultInstance()))
              .setSchemaDescriptor(new CreatorServiceMethodDescriptorSupplier("getCreatorVideos"))
              .build();
        }
      }
    }
    return getGetCreatorVideosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreatorServiceStub>() {
        @java.lang.Override
        public CreatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreatorServiceStub(channel, callOptions);
        }
      };
    return CreatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreatorServiceBlockingStub>() {
        @java.lang.Override
        public CreatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CreatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreatorServiceFutureStub>() {
        @java.lang.Override
        public CreatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreatorServiceFutureStub(channel, callOptions);
        }
      };
    return CreatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getCreator(org.example.mediaappgrpc.proto.CreatorIdRequest request,
        io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Creator> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCreatorMethod(), responseObserver);
    }

    /**
     */
    default void getCreatorVideos(org.example.mediaappgrpc.proto.CreatorIdRequest request,
        io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.VideoStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCreatorVideosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CreatorService.
   */
  public static abstract class CreatorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CreatorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CreatorService.
   */
  public static final class CreatorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CreatorServiceStub> {
    private CreatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCreator(org.example.mediaappgrpc.proto.CreatorIdRequest request,
        io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Creator> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCreatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCreatorVideos(org.example.mediaappgrpc.proto.CreatorIdRequest request,
        io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.VideoStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCreatorVideosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CreatorService.
   */
  public static final class CreatorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CreatorServiceBlockingStub> {
    private CreatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.mediaappgrpc.proto.Creator getCreator(org.example.mediaappgrpc.proto.CreatorIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCreatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.mediaappgrpc.proto.VideoStream getCreatorVideos(org.example.mediaappgrpc.proto.CreatorIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCreatorVideosMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CreatorService.
   */
  public static final class CreatorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CreatorServiceFutureStub> {
    private CreatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.mediaappgrpc.proto.Creator> getCreator(
        org.example.mediaappgrpc.proto.CreatorIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCreatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.mediaappgrpc.proto.VideoStream> getCreatorVideos(
        org.example.mediaappgrpc.proto.CreatorIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCreatorVideosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CREATOR = 0;
  private static final int METHODID_GET_CREATOR_VIDEOS = 1;

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
        case METHODID_GET_CREATOR:
          serviceImpl.getCreator((org.example.mediaappgrpc.proto.CreatorIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.Creator>) responseObserver);
          break;
        case METHODID_GET_CREATOR_VIDEOS:
          serviceImpl.getCreatorVideos((org.example.mediaappgrpc.proto.CreatorIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.mediaappgrpc.proto.VideoStream>) responseObserver);
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
          getGetCreatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.mediaappgrpc.proto.CreatorIdRequest,
              org.example.mediaappgrpc.proto.Creator>(
                service, METHODID_GET_CREATOR)))
        .addMethod(
          getGetCreatorVideosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.mediaappgrpc.proto.CreatorIdRequest,
              org.example.mediaappgrpc.proto.VideoStream>(
                service, METHODID_GET_CREATOR_VIDEOS)))
        .build();
  }

  private static abstract class CreatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CreatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.mediaappgrpc.proto.Schema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CreatorService");
    }
  }

  private static final class CreatorServiceFileDescriptorSupplier
      extends CreatorServiceBaseDescriptorSupplier {
    CreatorServiceFileDescriptorSupplier() {}
  }

  private static final class CreatorServiceMethodDescriptorSupplier
      extends CreatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CreatorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CreatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreatorServiceFileDescriptorSupplier())
              .addMethod(getGetCreatorMethod())
              .addMethod(getGetCreatorVideosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
