.class public Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;
.super Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$SSLReconnectedException;
    }
.end annotation


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private appBufferMax:I

.field private handshakeCompleted:Z

.field private handshakeCompletedListener:Ljavax/net/ssl/HandshakeCompletedListener;

.field private netBufferMax:I

.field sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;Ljava/nio/channels/SocketChannel;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;-><init>(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;Ljava/nio/channels/SocketChannel;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->handshakeCompleted:Z

    .line 6
    .line 7
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myClientInputStream:Ljava/io/InputStream;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->init(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->createBuffers()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p0

    .line 27
    const-string p1, "Can\'t do TLS init"

    .line 28
    .line 29
    invoke-static {p1, p0}, La/csj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public constructor <init>(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;-><init>(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)V

    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->handshakeCompleted:Z

    const/4 p1, 0x1

    .line 36
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->init(Z)V

    .line 37
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->createBuffers()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 38
    const-string p1, "Can\'t init the TLS channel"

    invoke-static {p1, p0}, La/csj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic access$001(Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;[BZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->sendMessage([BZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$101(Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;[BLjava/net/InetAddress;IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->sendMessage([BLjava/net/InetAddress;IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private checkSocketState()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    const/16 v1, 0x20

    .line 22
    .line 23
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "Need to reset SSL engine for socket "

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 51
    .line 52
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getUseClientMode()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->init(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catch_0
    move-exception p0

    .line 63
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 64
    .line 65
    const-string v1, "Cannot reset SSL engine"

    .line 66
    .line 67
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Ljava/io/IOException;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_2
    return-void
.end method


# virtual methods
.method public addBytes([B)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Adding TLS bytes for decryption "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    array-length v2, p1

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    array-length v0, p1

    .line 32
    if-gtz v0, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->unwrap(Ljava/nio/ByteBuffer;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public addPlaintextBytes([B)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->nioParser:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->addBytes([B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public createBuffers()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljavax/net/ssl/SSLSession;->getApplicationBufferSize()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->appBufferMax:I

    .line 14
    .line 15
    invoke-interface {v0}, Ljavax/net/ssl/SSLSession;->getPacketBufferSize()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->netBufferMax:I

    .line 20
    .line 21
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "appBufferMax="

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->appBufferMax:I

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, " netBufferMax="

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->netBufferMax:I

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void
.end method

.method public bridge synthetic getEncapsulatedClientTransaction()Landroid/gov/nist/javax/sip/ClientTransactionExt;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getEncapsulatedClientTransaction()Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->handshakeCompletedListener:Ljavax/net/ssl/HandshakeCompletedListener;

    .line 2
    .line 3
    check-cast p0, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 4
    .line 5
    return-object p0
.end method

.method public getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
    .locals 0

    .line 8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;

    move-result-object p0

    return-object p0
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "TLS"

    .line 2
    .line 3
    return-object p0
.end method

.method public init(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    check-cast v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageProcessor;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageProcessor;->sslClientCtx:Ljavax/net/ssl/SSLContext;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageProcessor;->sslServerCtx:Ljavax/net/ssl/SSLContext;

    .line 11
    .line 12
    :goto_0
    new-instance v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->createSSLEngine()Ljavax/net/ssl/SSLEngine;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {v1, v0, p0}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;-><init>(Ljavax/net/ssl/SSLEngine;Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 22
    .line 23
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljavax/net/ssl/SSLEngine;->setUseClientMode(Z)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 29
    .line 30
    check-cast p1, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->getConfigurationProperties()Ljava/util/Properties;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "Enabled"

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    move-object p1, v0

    .line 47
    :cond_1
    const-string v1, "Disabled"

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x0

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    const-string v1, "DisabledAll"

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v1, 0x1

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 73
    .line 74
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Ljavax/net/ssl/SSLEngine;->setNeedClientAuth(Z)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const-string v0, "Want"

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 89
    .line 90
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 91
    .line 92
    invoke-virtual {p1, v2}, Ljavax/net/ssl/SSLEngine;->setNeedClientAuth(Z)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 96
    .line 97
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 98
    .line 99
    invoke-virtual {p1, v1}, Ljavax/net/ssl/SSLEngine;->setWantClientAuth(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    const-string p0, "Invalid parameter for TLS authentication: "

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_5
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 114
    .line 115
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 116
    .line 117
    invoke-virtual {p1, v2}, Ljavax/net/ssl/SSLEngine;->setNeedClientAuth(Z)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 121
    .line 122
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 123
    .line 124
    invoke-virtual {p1, v2}, Ljavax/net/ssl/SSLEngine;->setWantClientAuth(Z)V

    .line 125
    .line 126
    .line 127
    :goto_2
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 128
    .line 129
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 130
    .line 131
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 132
    .line 133
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->getEnabledProtocols()[Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLEngine;->setEnabledProtocols([Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 143
    .line 144
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 145
    .line 146
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 147
    .line 148
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLEngine;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-nez p1, :cond_6

    .line 162
    .line 163
    new-instance p1, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->getSocketChannel()Ljava/nio/channels/SocketChannel;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-direct {p1, p0, v0}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;-><init>(Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;Ljava/nio/channels/SocketChannel;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->setHandshakeCompletedListener(Ljavax/net/ssl/HandshakeCompletedListener;)V

    .line 173
    .line 174
    .line 175
    :cond_6
    return-void
.end method

.method public isHandshakeCompleted()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->handshakeCompleted:Z

    .line 2
    .line 3
    return p0
.end method

.method public isSecure()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public onNewSocket([B)V
    .locals 4

    .line 1
    const-string v0, "New socket for "

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->onNewSocket([B)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 7
    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "UTF-8"

    .line 21
    .line 22
    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, " last message = "

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->init(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->createBuffers()V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-virtual {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sendMessage([BZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catch_0
    move-exception p0

    .line 65
    sget-object p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 66
    .line 67
    const-string v0, "Cant reinit"

    .line 68
    .line 69
    invoke-interface {p1, v0, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public prepareAppDataBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->getInstance()Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->appBufferMax:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public prepareAppDataBuffer(I)Ljava/nio/ByteBuffer;
    .locals 0

    .line 12
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->getInstance()Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method public prepareEncryptedDataBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->getInstance()Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->netBufferMax:I

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public sendEncryptedData([B)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "sendEncryptedData  this = "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, " peerPort = "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, " addr = "

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->lastActivityTimeStamp:J

    .line 55
    .line 56
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 57
    .line 58
    check-cast v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 59
    .line 60
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->nioHandler:Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 61
    .line 62
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 81
    .line 82
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 83
    .line 84
    invoke-static {v1, v2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->putSocket(Ljava/lang/String;Ljava/nio/channels/SocketChannel;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 94
    .line 95
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    invoke-super {p0, p1, v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->sendMessage([BLjava/net/InetAddress;IZ)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public sendMessage([BLjava/net/InetAddress;IZ)V
    .locals 3

    .line 36
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->checkSocketState()V

    .line 37
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 38
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->getInstance()Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    move-result-object v1

    iget v2, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->netBufferMax:I

    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    new-instance v2, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;

    invoke-direct {v2, p0, p2, p3, p4}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;-><init>(Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;Ljava/net/InetAddress;IZ)V

    invoke-virtual {v0, p1, v1, v2}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;)V

    return-void
.end method

.method public sendMessage([BZ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->checkSocketState()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sslStateMachine:Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 9
    .line 10
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->getInstance()Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->netBufferMax:I

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$1;

    .line 21
    .line 22
    invoke-direct {v2, p0, p2}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$1;-><init>(Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, v1, v2}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p0

    .line 30
    const-string p1, "Can\'t send message"

    .line 31
    .line 32
    invoke-static {p1, p0}, La/csj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setHandshakeCompleted(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->handshakeCompleted:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHandshakeCompletedListener(Ljavax/net/ssl/HandshakeCompletedListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->handshakeCompletedListener:Ljavax/net/ssl/HandshakeCompletedListener;

    .line 2
    .line 3
    return-void
.end method
