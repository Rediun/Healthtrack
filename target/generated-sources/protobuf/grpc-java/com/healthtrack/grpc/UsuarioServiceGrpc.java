package com.healthtrack.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: usuario.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsuarioServiceGrpc {

  private UsuarioServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "UsuarioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioRequest,
      com.healthtrack.grpc.UsuarioResponse> getCrearUsuarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CrearUsuario",
      requestType = com.healthtrack.grpc.UsuarioRequest.class,
      responseType = com.healthtrack.grpc.UsuarioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioRequest,
      com.healthtrack.grpc.UsuarioResponse> getCrearUsuarioMethod() {
    io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioRequest, com.healthtrack.grpc.UsuarioResponse> getCrearUsuarioMethod;
    if ((getCrearUsuarioMethod = UsuarioServiceGrpc.getCrearUsuarioMethod) == null) {
      synchronized (UsuarioServiceGrpc.class) {
        if ((getCrearUsuarioMethod = UsuarioServiceGrpc.getCrearUsuarioMethod) == null) {
          UsuarioServiceGrpc.getCrearUsuarioMethod = getCrearUsuarioMethod =
              io.grpc.MethodDescriptor.<com.healthtrack.grpc.UsuarioRequest, com.healthtrack.grpc.UsuarioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CrearUsuario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthtrack.grpc.UsuarioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthtrack.grpc.UsuarioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsuarioServiceMethodDescriptorSupplier("CrearUsuario"))
              .build();
        }
      }
    }
    return getCrearUsuarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioIdRequest,
      com.healthtrack.grpc.UsuarioResponse> getObtenerUsuarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtenerUsuario",
      requestType = com.healthtrack.grpc.UsuarioIdRequest.class,
      responseType = com.healthtrack.grpc.UsuarioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioIdRequest,
      com.healthtrack.grpc.UsuarioResponse> getObtenerUsuarioMethod() {
    io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioIdRequest, com.healthtrack.grpc.UsuarioResponse> getObtenerUsuarioMethod;
    if ((getObtenerUsuarioMethod = UsuarioServiceGrpc.getObtenerUsuarioMethod) == null) {
      synchronized (UsuarioServiceGrpc.class) {
        if ((getObtenerUsuarioMethod = UsuarioServiceGrpc.getObtenerUsuarioMethod) == null) {
          UsuarioServiceGrpc.getObtenerUsuarioMethod = getObtenerUsuarioMethod =
              io.grpc.MethodDescriptor.<com.healthtrack.grpc.UsuarioIdRequest, com.healthtrack.grpc.UsuarioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ObtenerUsuario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthtrack.grpc.UsuarioIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthtrack.grpc.UsuarioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsuarioServiceMethodDescriptorSupplier("ObtenerUsuario"))
              .build();
        }
      }
    }
    return getObtenerUsuarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioRequest,
      com.healthtrack.grpc.UsuarioResponse> getActualizarUsuarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActualizarUsuario",
      requestType = com.healthtrack.grpc.UsuarioRequest.class,
      responseType = com.healthtrack.grpc.UsuarioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioRequest,
      com.healthtrack.grpc.UsuarioResponse> getActualizarUsuarioMethod() {
    io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioRequest, com.healthtrack.grpc.UsuarioResponse> getActualizarUsuarioMethod;
    if ((getActualizarUsuarioMethod = UsuarioServiceGrpc.getActualizarUsuarioMethod) == null) {
      synchronized (UsuarioServiceGrpc.class) {
        if ((getActualizarUsuarioMethod = UsuarioServiceGrpc.getActualizarUsuarioMethod) == null) {
          UsuarioServiceGrpc.getActualizarUsuarioMethod = getActualizarUsuarioMethod =
              io.grpc.MethodDescriptor.<com.healthtrack.grpc.UsuarioRequest, com.healthtrack.grpc.UsuarioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActualizarUsuario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthtrack.grpc.UsuarioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthtrack.grpc.UsuarioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsuarioServiceMethodDescriptorSupplier("ActualizarUsuario"))
              .build();
        }
      }
    }
    return getActualizarUsuarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioIdRequest,
      com.healthtrack.grpc.Empty> getEliminarUsuarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EliminarUsuario",
      requestType = com.healthtrack.grpc.UsuarioIdRequest.class,
      responseType = com.healthtrack.grpc.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioIdRequest,
      com.healthtrack.grpc.Empty> getEliminarUsuarioMethod() {
    io.grpc.MethodDescriptor<com.healthtrack.grpc.UsuarioIdRequest, com.healthtrack.grpc.Empty> getEliminarUsuarioMethod;
    if ((getEliminarUsuarioMethod = UsuarioServiceGrpc.getEliminarUsuarioMethod) == null) {
      synchronized (UsuarioServiceGrpc.class) {
        if ((getEliminarUsuarioMethod = UsuarioServiceGrpc.getEliminarUsuarioMethod) == null) {
          UsuarioServiceGrpc.getEliminarUsuarioMethod = getEliminarUsuarioMethod =
              io.grpc.MethodDescriptor.<com.healthtrack.grpc.UsuarioIdRequest, com.healthtrack.grpc.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EliminarUsuario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthtrack.grpc.UsuarioIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.healthtrack.grpc.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsuarioServiceMethodDescriptorSupplier("EliminarUsuario"))
              .build();
        }
      }
    }
    return getEliminarUsuarioMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsuarioServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsuarioServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsuarioServiceStub>() {
        @java.lang.Override
        public UsuarioServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsuarioServiceStub(channel, callOptions);
        }
      };
    return UsuarioServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsuarioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsuarioServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsuarioServiceBlockingStub>() {
        @java.lang.Override
        public UsuarioServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsuarioServiceBlockingStub(channel, callOptions);
        }
      };
    return UsuarioServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsuarioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsuarioServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsuarioServiceFutureStub>() {
        @java.lang.Override
        public UsuarioServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsuarioServiceFutureStub(channel, callOptions);
        }
      };
    return UsuarioServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void crearUsuario(com.healthtrack.grpc.UsuarioRequest request,
        io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCrearUsuarioMethod(), responseObserver);
    }

    /**
     */
    default void obtenerUsuario(com.healthtrack.grpc.UsuarioIdRequest request,
        io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getObtenerUsuarioMethod(), responseObserver);
    }

    /**
     */
    default void actualizarUsuario(com.healthtrack.grpc.UsuarioRequest request,
        io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActualizarUsuarioMethod(), responseObserver);
    }

    /**
     */
    default void eliminarUsuario(com.healthtrack.grpc.UsuarioIdRequest request,
        io.grpc.stub.StreamObserver<com.healthtrack.grpc.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEliminarUsuarioMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UsuarioService.
   */
  public static abstract class UsuarioServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsuarioServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UsuarioService.
   */
  public static final class UsuarioServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UsuarioServiceStub> {
    private UsuarioServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsuarioServiceStub(channel, callOptions);
    }

    /**
     */
    public void crearUsuario(com.healthtrack.grpc.UsuarioRequest request,
        io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCrearUsuarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obtenerUsuario(com.healthtrack.grpc.UsuarioIdRequest request,
        io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getObtenerUsuarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void actualizarUsuario(com.healthtrack.grpc.UsuarioRequest request,
        io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActualizarUsuarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void eliminarUsuario(com.healthtrack.grpc.UsuarioIdRequest request,
        io.grpc.stub.StreamObserver<com.healthtrack.grpc.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEliminarUsuarioMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UsuarioService.
   */
  public static final class UsuarioServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsuarioServiceBlockingStub> {
    private UsuarioServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsuarioServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.healthtrack.grpc.UsuarioResponse crearUsuario(com.healthtrack.grpc.UsuarioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCrearUsuarioMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.healthtrack.grpc.UsuarioResponse obtenerUsuario(com.healthtrack.grpc.UsuarioIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getObtenerUsuarioMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.healthtrack.grpc.UsuarioResponse actualizarUsuario(com.healthtrack.grpc.UsuarioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActualizarUsuarioMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.healthtrack.grpc.Empty eliminarUsuario(com.healthtrack.grpc.UsuarioIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEliminarUsuarioMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UsuarioService.
   */
  public static final class UsuarioServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsuarioServiceFutureStub> {
    private UsuarioServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsuarioServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsuarioServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthtrack.grpc.UsuarioResponse> crearUsuario(
        com.healthtrack.grpc.UsuarioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCrearUsuarioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthtrack.grpc.UsuarioResponse> obtenerUsuario(
        com.healthtrack.grpc.UsuarioIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getObtenerUsuarioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthtrack.grpc.UsuarioResponse> actualizarUsuario(
        com.healthtrack.grpc.UsuarioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActualizarUsuarioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.healthtrack.grpc.Empty> eliminarUsuario(
        com.healthtrack.grpc.UsuarioIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEliminarUsuarioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREAR_USUARIO = 0;
  private static final int METHODID_OBTENER_USUARIO = 1;
  private static final int METHODID_ACTUALIZAR_USUARIO = 2;
  private static final int METHODID_ELIMINAR_USUARIO = 3;

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
        case METHODID_CREAR_USUARIO:
          serviceImpl.crearUsuario((com.healthtrack.grpc.UsuarioRequest) request,
              (io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse>) responseObserver);
          break;
        case METHODID_OBTENER_USUARIO:
          serviceImpl.obtenerUsuario((com.healthtrack.grpc.UsuarioIdRequest) request,
              (io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse>) responseObserver);
          break;
        case METHODID_ACTUALIZAR_USUARIO:
          serviceImpl.actualizarUsuario((com.healthtrack.grpc.UsuarioRequest) request,
              (io.grpc.stub.StreamObserver<com.healthtrack.grpc.UsuarioResponse>) responseObserver);
          break;
        case METHODID_ELIMINAR_USUARIO:
          serviceImpl.eliminarUsuario((com.healthtrack.grpc.UsuarioIdRequest) request,
              (io.grpc.stub.StreamObserver<com.healthtrack.grpc.Empty>) responseObserver);
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
          getCrearUsuarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthtrack.grpc.UsuarioRequest,
              com.healthtrack.grpc.UsuarioResponse>(
                service, METHODID_CREAR_USUARIO)))
        .addMethod(
          getObtenerUsuarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthtrack.grpc.UsuarioIdRequest,
              com.healthtrack.grpc.UsuarioResponse>(
                service, METHODID_OBTENER_USUARIO)))
        .addMethod(
          getActualizarUsuarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthtrack.grpc.UsuarioRequest,
              com.healthtrack.grpc.UsuarioResponse>(
                service, METHODID_ACTUALIZAR_USUARIO)))
        .addMethod(
          getEliminarUsuarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.healthtrack.grpc.UsuarioIdRequest,
              com.healthtrack.grpc.Empty>(
                service, METHODID_ELIMINAR_USUARIO)))
        .build();
  }

  private static abstract class UsuarioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsuarioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.healthtrack.grpc.Usuario.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsuarioService");
    }
  }

  private static final class UsuarioServiceFileDescriptorSupplier
      extends UsuarioServiceBaseDescriptorSupplier {
    UsuarioServiceFileDescriptorSupplier() {}
  }

  private static final class UsuarioServiceMethodDescriptorSupplier
      extends UsuarioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UsuarioServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UsuarioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsuarioServiceFileDescriptorSupplier())
              .addMethod(getCrearUsuarioMethod())
              .addMethod(getObtenerUsuarioMethod())
              .addMethod(getActualizarUsuarioMethod())
              .addMethod(getEliminarUsuarioMethod())
              .build();
        }
      }
    }
    return result;
  }
}
