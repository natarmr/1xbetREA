.class public interface abstract Landroid/gov/nist/core/net/NetworkLayer;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract createDatagramSocket()Ljava/net/DatagramSocket;
.end method

.method public abstract createDatagramSocket(ILjava/net/InetAddress;)Ljava/net/DatagramSocket;
.end method

.method public abstract createSSLServerSocket(IILjava/net/InetAddress;)Ljavax/net/ssl/SSLServerSocket;
.end method

.method public abstract createSSLSocket(Ljava/net/InetAddress;I)Ljavax/net/ssl/SSLSocket;
.end method

.method public abstract createSSLSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljavax/net/ssl/SSLSocket;
.end method

.method public abstract createServerSocket(IILjava/net/InetAddress;)Ljava/net/ServerSocket;
.end method

.method public abstract createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
.end method

.method public abstract createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljava/net/Socket;
.end method

.method public abstract createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
.end method

.method public abstract setSipStack(Landroid/gov/nist/javax/sip/SipStackImpl;)V
.end method
