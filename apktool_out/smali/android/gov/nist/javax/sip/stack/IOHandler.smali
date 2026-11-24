.class public Landroid/gov/nist/javax/sip/stack/IOHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TCP:Ljava/lang/String; = "tcp"

.field private static final TLS:Ljava/lang/String; = "tls"

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

.field private final socketCreationMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Semaphore;",
            ">;"
        }
    .end annotation
.end field

.field private final socketTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketCreationMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    check-cast p1, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 19
    .line 20
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 21
    .line 22
    return-void
.end method

.method private enterIOCriticalSection(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "Could not acquire IO Semaphore\'"

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketCreationMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/util/concurrent/Semaphore;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    new-instance v1, Ljava/util/concurrent/Semaphore;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v2, v2}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketCreationMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/concurrent/Semaphore;

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    sget-object p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    const/16 v2, 0x20

    .line 32
    .line 33
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    sget-object p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 40
    .line 41
    const-string v2, "new Semaphore added for key "

    .line 42
    .line 43
    invoke-static {v2, p1, p0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v1, p0

    .line 48
    :cond_1
    :goto_0
    :try_start_0
    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 49
    .line 50
    const-wide/16 v2, 0xa

    .line 51
    .line 52
    invoke-virtual {v1, v2, v3, p0}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 60
    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p1, "\' after 10 seconds -- giving up "

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :catch_0
    const-string p0, "exception in acquiring sem"

    .line 83
    .line 84
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method private leaveIOCriticalSection(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketCreationMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/concurrent/Semaphore;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static makeKey(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ":"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method private writeChunks(Ljava/io/OutputStream;[BI)V
    .locals 2

    .line 1
    monitor-enter p1

    .line 2
    const/4 p0, 0x0

    .line 3
    :goto_0
    if-ge p0, p3, :cond_1

    .line 4
    .line 5
    add-int/lit16 v0, p0, 0x2000

    .line 6
    .line 7
    if-ge v0, p3, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x2000

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sub-int v1, p3, p0

    .line 13
    .line 14
    :goto_1
    :try_start_0
    invoke-virtual {p1, p2, p0, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 15
    .line 16
    .line 17
    move p0, v0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p0
.end method


# virtual methods
.method public closeAll()V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Closing "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, " sockets from IOHandler"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->elements()Ljava/util/Enumeration;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :catch_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/net/Socket;

    .line 58
    .line 59
    :try_start_0
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void
.end method

.method public getLocalAddressForTcpDst(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/SocketAddress;
    .locals 2

    .line 1
    invoke-static {p1, p2}, Landroid/gov/nist/javax/sip/stack/IOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/IOHandler;->getSocket(Ljava/lang/String;)Ljava/net/Socket;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNetworkLayer()Landroid/gov/nist/core/net/NetworkLayer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1, p1, p2, p3, p4}, Landroid/gov/nist/core/net/NetworkLayer;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/IOHandler;->putSocket(Ljava/lang/String;Ljava/net/Socket;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v1}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public getLocalAddressForTlsDst(Ljava/net/InetAddress;ILjava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;)Ljava/net/SocketAddress;
    .locals 5

    .line 1
    invoke-static {p1, p2}, Landroid/gov/nist/javax/sip/stack/IOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/IOHandler;->getSocket(Ljava/lang/String;)Ljava/net/Socket;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNetworkLayer()Landroid/gov/nist/core/net/NetworkLayer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1, p1, p2, p3}, Landroid/gov/nist/core/net/NetworkLayer;->createSSLSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljavax/net/ssl/SSLSocket;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object p3, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    const/16 v2, 0x20

    .line 24
    .line 25
    invoke-interface {p3, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-eqz p3, :cond_0

    .line 30
    .line 31
    sget-object p3, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v4, "inaddr = "

    .line 36
    .line 37
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p3, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 51
    .line 52
    new-instance p3, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v3, "port = "

    .line 55
    .line 56
    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    new-instance p1, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 70
    .line 71
    invoke-direct {p1, p4, v1}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;-><init>(Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;Ljava/net/Socket;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p4, p1}, Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;->setHandshakeCompletedListener(Ljavax/net/ssl/HandshakeCompletedListener;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p1}, Ljavax/net/ssl/SSLSocket;->addHandshakeCompletedListener(Ljavax/net/ssl/HandshakeCompletedListener;)V

    .line 78
    .line 79
    .line 80
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 81
    .line 82
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/SipStackImpl;->getEnabledProtocols()[Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {v1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 90
    .line 91
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/SipStackImpl;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {v1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->startHandshakeWatchdog()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x1

    .line 105
    invoke-virtual {p4, p1}, Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;->setHandshakeCompleted(Z)V

    .line 106
    .line 107
    .line 108
    sget-object p1, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 109
    .line 110
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_1

    .line 115
    .line 116
    sget-object p1, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 117
    .line 118
    const-string p2, "Handshake passed"

    .line 119
    .line 120
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    :try_start_0
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->getTlsSecurityPolicy()Landroid/gov/nist/javax/sip/TlsSecurityPolicy;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p4}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getEncapsulatedClientTransaction()Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-interface {p1, p2}, Landroid/gov/nist/javax/sip/TlsSecurityPolicy;->enforceTlsPolicy(Landroid/gov/nist/javax/sip/ClientTransactionExt;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    sget-object p1, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 137
    .line 138
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_2

    .line 143
    .line 144
    sget-object p1, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 145
    .line 146
    const-string p2, "TLS Security policy passed"

    .line 147
    .line 148
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_2
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/IOHandler;->putSocket(Ljava/lang/String;Ljava/net/Socket;)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :catch_0
    move-exception p0

    .line 156
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 p0, 0x0

    .line 164
    return-object p0

    .line 165
    :cond_3
    :goto_0
    invoke-virtual {v1}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0
.end method

.method public getSocket(Ljava/lang/String;)Ljava/net/Socket;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/net/Socket;

    .line 8
    .line 9
    return-object p0
.end method

.method public putSocket(Ljava/lang/String;Ljava/net/Socket;)V
    .locals 2

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const-string v1, "adding socket for key "

    .line 14
    .line 15
    invoke-static {v1, p1, v0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public removeSocket(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketCreationMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/concurrent/Semaphore;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    sget-object p0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    const-string v0, "removed Socket and Semaphore for key "

    .line 32
    .line 33
    invoke-static {v0, p1, p0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public sendBytes(Ljava/net/InetAddress;Ljava/net/InetAddress;ILjava/lang/String;[BZLandroid/gov/nist/javax/sip/stack/MessageChannel;)Ljava/net/Socket;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    move/from16 v5, p3

    .line 8
    .line 9
    move-object/from16 v3, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move/from16 v7, p6

    .line 14
    .line 15
    const-string v8, "UTF-8"

    .line 16
    .line 17
    const-string v9, " for message "

    .line 18
    .line 19
    const-string v10, " "

    .line 20
    .line 21
    if-eqz v7, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    move v12, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v12, 0x1

    .line 27
    :goto_0
    array-length v13, v6

    .line 28
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 29
    .line 30
    const/16 v14, 0x20

    .line 31
    .line 32
    invoke-interface {v0, v14}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const-string v15, " isClient "

    .line 37
    .line 38
    const-string v11, " port = "

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 43
    .line 44
    const-string v14, "sendBytes "

    .line 45
    .line 46
    move-object/from16 v18, v8

    .line 47
    .line 48
    const-string v8, " local inAddr "

    .line 49
    .line 50
    invoke-static {v14, v3, v8}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v14

    .line 58
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v14, " remote inAddr "

    .line 62
    .line 63
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v14, " length = "

    .line 77
    .line 78
    invoke-static {v5, v13, v14, v15, v8}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-interface {v0, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    move-object/from16 v18, v8

    .line 93
    .line 94
    :goto_1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 95
    .line 96
    const/16 v8, 0x10

    .line 97
    .line 98
    invoke-interface {v0, v8}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isLogStackTraceOnMessageSend()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 113
    .line 114
    invoke-interface {v0, v8}, Landroid/gov/nist/core/StackLogger;->logStackTrace(I)V

    .line 115
    .line 116
    .line 117
    :cond_2
    const-string v0, "tcp"

    .line 118
    .line 119
    invoke-virtual {v3, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    const-string v8, "port = "

    .line 124
    .line 125
    const-string v14, "inaddr = "

    .line 126
    .line 127
    const-string v7, ":"

    .line 128
    .line 129
    move-object/from16 v19, v7

    .line 130
    .line 131
    const-string v7, "Could not connect to "

    .line 132
    .line 133
    const/16 v20, 0x0

    .line 134
    .line 135
    const/16 v21, 0x0

    .line 136
    .line 137
    if-nez v0, :cond_d

    .line 138
    .line 139
    move-object/from16 v22, v7

    .line 140
    .line 141
    invoke-static/range {p2 .. p3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-direct {v1, v7}, Landroid/gov/nist/javax/sip/stack/IOHandler;->enterIOCriticalSection(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    move-object/from16 v23, v15

    .line 149
    .line 150
    :try_start_0
    invoke-virtual {v1, v7}, Landroid/gov/nist/javax/sip/stack/IOHandler;->getSocket(Ljava/lang/String;)Ljava/net/Socket;

    .line 151
    .line 152
    .line 153
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    move-object/from16 v16, v0

    .line 155
    .line 156
    move/from16 v15, v21

    .line 157
    .line 158
    :goto_2
    if-ge v15, v12, :cond_9

    .line 159
    .line 160
    if-nez v16, :cond_5

    .line 161
    .line 162
    :try_start_1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 163
    .line 164
    const/16 v12, 0x20

    .line 165
    .line 166
    invoke-interface {v0, v12}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_3

    .line 171
    .line 172
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 173
    .line 174
    new-instance v12, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    invoke-interface {v0, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 193
    .line 194
    new-instance v12, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-interface {v0, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :catchall_0
    move-exception v0

    .line 214
    goto/16 :goto_b

    .line 215
    .line 216
    :cond_3
    :goto_3
    :try_start_2
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 217
    .line 218
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNetworkLayer()Landroid/gov/nist/core/net/NetworkLayer;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-interface {v0, v4, v5, v2}, Landroid/gov/nist/core/net/NetworkLayer;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljava/net/Socket;

    .line 223
    .line 224
    .line 225
    move-result-object v0
    :try_end_2
    .catch Ljava/net/SocketException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 226
    :try_start_3
    sget-object v2, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 227
    .line 228
    const/16 v12, 0x20

    .line 229
    .line 230
    invoke-interface {v2, v12}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-eqz v2, :cond_4

    .line 235
    .line 236
    sget-object v2, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 237
    .line 238
    new-instance v8, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string v9, "local inaddr = "

    .line 244
    .line 245
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-virtual {v9}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-interface {v2, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :catch_0
    move-object/from16 v16, v0

    .line 268
    .line 269
    goto/16 :goto_8

    .line 270
    .line 271
    :cond_4
    :goto_4
    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-direct {v1, v2, v6, v13}, Landroid/gov/nist/javax/sip/stack/IOHandler;->writeChunks(Ljava/io/OutputStream;[BI)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v7, v0}, Landroid/gov/nist/javax/sip/stack/IOHandler;->putSocket(Ljava/lang/String;Ljava/net/Socket;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 279
    .line 280
    .line 281
    move-object/from16 v16, v0

    .line 282
    .line 283
    goto/16 :goto_7

    .line 284
    .line 285
    :catch_1
    move-exception v0

    .line 286
    :try_start_4
    sget-object v8, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 287
    .line 288
    new-instance v12, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const-string v13, "Problem connecting "

    .line 294
    .line 295
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    new-instance v13, Ljava/lang/String;

    .line 317
    .line 318
    move-object/from16 v14, v18

    .line 319
    .line 320
    invoke-direct {v13, v6, v14}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    invoke-interface {v8, v12}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v7}, Landroid/gov/nist/javax/sip/stack/IOHandler;->removeSocket(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    new-instance v8, Ljava/net/SocketException;

    .line 337
    .line 338
    new-instance v12, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object v13

    .line 347
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v0, " Problem connecting "

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    new-instance v0, Ljava/lang/String;

    .line 394
    .line 395
    invoke-direct {v0, v6, v14}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-direct {v8, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v8
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 409
    :cond_5
    :try_start_5
    invoke-virtual/range {v16 .. v16}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-direct {v1, v0, v6, v13}, Landroid/gov/nist/javax/sip/stack/IOHandler;->writeChunks(Ljava/io/OutputStream;[BI)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 414
    .line 415
    .line 416
    goto :goto_7

    .line 417
    :catch_2
    move-exception v0

    .line 418
    move-object/from16 v21, v0

    .line 419
    .line 420
    :try_start_6
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 421
    .line 422
    move-object/from16 v24, v9

    .line 423
    .line 424
    const/16 v9, 0x8

    .line 425
    .line 426
    invoke-interface {v0, v9}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-eqz v0, :cond_6

    .line 431
    .line 432
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 433
    .line 434
    new-instance v9, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 437
    .line 438
    .line 439
    move-object/from16 v25, v10

    .line 440
    .line 441
    const-string v10, "IOException occured retryCount "

    .line 442
    .line 443
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    invoke-interface {v0, v9}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 454
    .line 455
    .line 456
    goto :goto_5

    .line 457
    :cond_6
    move-object/from16 v25, v10

    .line 458
    .line 459
    :goto_5
    :try_start_7
    invoke-virtual/range {v16 .. v16}, Ljava/net/Socket;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 460
    .line 461
    .line 462
    :catch_3
    add-int/lit8 v15, v15, 0x1

    .line 463
    .line 464
    if-eqz p6, :cond_8

    .line 465
    .line 466
    if-lt v15, v12, :cond_7

    .line 467
    .line 468
    :try_start_8
    invoke-virtual {v1, v7}, Landroid/gov/nist/javax/sip/stack/IOHandler;->removeSocket(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    goto :goto_6

    .line 472
    :catch_4
    move-object/from16 v16, v20

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_7
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 476
    .line 477
    invoke-virtual {v0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    :goto_6
    move-object/from16 v16, v20

    .line 481
    .line 482
    move-object/from16 v9, v24

    .line 483
    .line 484
    move-object/from16 v10, v25

    .line 485
    .line 486
    goto/16 :goto_2

    .line 487
    .line 488
    :cond_8
    invoke-virtual {v1, v7}, Landroid/gov/nist/javax/sip/stack/IOHandler;->removeSocket(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    throw v21
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 492
    :cond_9
    :goto_7
    invoke-direct {v1, v7}, Landroid/gov/nist/javax/sip/stack/IOHandler;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    goto :goto_9

    .line 496
    :catch_5
    :goto_8
    :try_start_9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 497
    .line 498
    const/4 v2, 0x4

    .line 499
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-eqz v0, :cond_a

    .line 504
    .line 505
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 506
    .line 507
    new-instance v2, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const-string v6, "Problem sending: sendBytes "

    .line 513
    .line 514
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    const-string v3, " inAddr "

    .line 521
    .line 522
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    const-string v3, " remoteHost "

    .line 539
    .line 540
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {p7 .. p7}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPeerAddress()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    const-string v3, " remotePort "

    .line 551
    .line 552
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {p7 .. p7}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPeerPort()I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    const-string v3, " peerPacketPort "

    .line 563
    .line 564
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {p7 .. p7}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPeerPacketSourcePort()I

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    move-object/from16 v3, v23

    .line 575
    .line 576
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    move/from16 v3, p6

    .line 580
    .line 581
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    :cond_a
    invoke-virtual {v1, v7}, Landroid/gov/nist/javax/sip/stack/IOHandler;->removeSocket(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 592
    .line 593
    .line 594
    goto :goto_7

    .line 595
    :goto_9
    if-nez v16, :cond_c

    .line 596
    .line 597
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 598
    .line 599
    const/4 v2, 0x4

    .line 600
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    if-eqz v0, :cond_b

    .line 605
    .line 606
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 607
    .line 608
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/IOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 609
    .line 610
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->toString()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 618
    .line 619
    new-instance v1, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    move-object/from16 v7, v22

    .line 622
    .line 623
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    move-object/from16 v9, v19

    .line 630
    .line 631
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_b
    move-object/from16 v9, v19

    .line 646
    .line 647
    move-object/from16 v7, v22

    .line 648
    .line 649
    :goto_a
    invoke-static {v7, v4, v9, v5}, La/ohq;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 650
    .line 651
    .line 652
    return-object v20

    .line 653
    :cond_c
    return-object v16

    .line 654
    :goto_b
    invoke-direct {v1, v7}, Landroid/gov/nist/javax/sip/stack/IOHandler;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    throw v0

    .line 658
    :cond_d
    move-object/from16 v9, v19

    .line 659
    .line 660
    const-string v0, "tls"

    .line 661
    .line 662
    invoke-virtual {v3, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    if-nez v0, :cond_15

    .line 667
    .line 668
    invoke-static/range {p2 .. p3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->enterIOCriticalSection(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    :try_start_a
    invoke-virtual {v1, v3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->getSocket(Ljava/lang/String;)Ljava/net/Socket;

    .line 676
    .line 677
    .line 678
    move-result-object v0
    :try_end_a
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 679
    move-object v10, v0

    .line 680
    move/from16 v11, v21

    .line 681
    .line 682
    :goto_c
    if-ge v11, v12, :cond_13

    .line 683
    .line 684
    if-nez v10, :cond_11

    .line 685
    .line 686
    :try_start_b
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 687
    .line 688
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNetworkLayer()Landroid/gov/nist/core/net/NetworkLayer;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-interface {v0, v4, v5, v2}, Landroid/gov/nist/core/net/NetworkLayer;->createSSLSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljavax/net/ssl/SSLSocket;

    .line 693
    .line 694
    .line 695
    move-result-object v10

    .line 696
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 697
    .line 698
    const/16 v12, 0x20

    .line 699
    .line 700
    invoke-interface {v0, v12}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    if-eqz v0, :cond_e

    .line 705
    .line 706
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 707
    .line 708
    new-instance v2, Ljava/lang/StringBuilder;

    .line 709
    .line 710
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 727
    .line 728
    new-instance v2, Ljava/lang/StringBuilder;

    .line 729
    .line 730
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    goto :goto_d

    .line 747
    :catchall_1
    move-exception v0

    .line 748
    goto/16 :goto_11

    .line 749
    .line 750
    :catch_6
    move-exception v0

    .line 751
    goto/16 :goto_10

    .line 752
    .line 753
    :cond_e
    :goto_d
    new-instance v0, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 754
    .line 755
    move-object/from16 v2, p7

    .line 756
    .line 757
    check-cast v2, Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;

    .line 758
    .line 759
    invoke-direct {v0, v2, v10}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;-><init>(Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;Ljava/net/Socket;)V

    .line 760
    .line 761
    .line 762
    move-object/from16 v2, p7

    .line 763
    .line 764
    check-cast v2, Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;

    .line 765
    .line 766
    invoke-virtual {v2, v0}, Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;->setHandshakeCompletedListener(Ljavax/net/ssl/HandshakeCompletedListener;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v10, v0}, Ljavax/net/ssl/SSLSocket;->addHandshakeCompletedListener(Ljavax/net/ssl/HandshakeCompletedListener;)V

    .line 770
    .line 771
    .line 772
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 773
    .line 774
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/SipStackImpl;->getEnabledProtocols()[Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    invoke-virtual {v10, v2}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->startHandshakeWatchdog()V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v10}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 785
    .line 786
    .line 787
    move-object/from16 v0, p7

    .line 788
    .line 789
    check-cast v0, Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;

    .line 790
    .line 791
    const/4 v15, 0x1

    .line 792
    invoke-virtual {v0, v15}, Landroid/gov/nist/javax/sip/stack/TLSMessageChannel;->setHandshakeCompleted(Z)V

    .line 793
    .line 794
    .line 795
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 796
    .line 797
    const/16 v12, 0x20

    .line 798
    .line 799
    invoke-interface {v0, v12}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    if-eqz v0, :cond_f

    .line 804
    .line 805
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 806
    .line 807
    const-string v2, "Handshake passed"

    .line 808
    .line 809
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_b
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_b .. :try_end_b} :catch_6
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 810
    .line 811
    .line 812
    :cond_f
    :try_start_c
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 813
    .line 814
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->getTlsSecurityPolicy()Landroid/gov/nist/javax/sip/TlsSecurityPolicy;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    invoke-virtual/range {p7 .. p7}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getEncapsulatedClientTransaction()Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-interface {v0, v2}, Landroid/gov/nist/javax/sip/TlsSecurityPolicy;->enforceTlsPolicy(Landroid/gov/nist/javax/sip/ClientTransactionExt;)V
    :try_end_c
    .catch Ljava/lang/SecurityException; {:try_start_c .. :try_end_c} :catch_7
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_b
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 823
    .line 824
    .line 825
    :try_start_d
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 826
    .line 827
    const/16 v2, 0x20

    .line 828
    .line 829
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    if-eqz v0, :cond_10

    .line 834
    .line 835
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 836
    .line 837
    const-string v2, "TLS Security policy passed"

    .line 838
    .line 839
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    :cond_10
    invoke-virtual {v10}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    invoke-direct {v1, v0, v6, v13}, Landroid/gov/nist/javax/sip/stack/IOHandler;->writeChunks(Ljava/io/OutputStream;[BI)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v1, v3, v10}, Landroid/gov/nist/javax/sip/stack/IOHandler;->putSocket(Ljava/lang/String;Ljava/net/Socket;)V

    .line 850
    .line 851
    .line 852
    goto :goto_e

    .line 853
    :catch_7
    move-exception v0

    .line 854
    new-instance v2, Ljava/io/IOException;

    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    throw v2
    :try_end_d
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_d .. :try_end_d} :catch_6
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_b
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 864
    :cond_11
    const/4 v15, 0x1

    .line 865
    const/16 v17, 0x20

    .line 866
    .line 867
    :try_start_e
    invoke-virtual {v10}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-direct {v1, v0, v6, v13}, Landroid/gov/nist/javax/sip/stack/IOHandler;->writeChunks(Ljava/io/OutputStream;[BI)V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_8
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 872
    .line 873
    .line 874
    goto :goto_e

    .line 875
    :catch_8
    move-exception v0

    .line 876
    :try_start_f
    sget-object v16, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 877
    .line 878
    invoke-interface/range {v16 .. v16}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 879
    .line 880
    .line 881
    move-result v16

    .line 882
    if-eqz v16, :cond_12

    .line 883
    .line 884
    sget-object v15, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 885
    .line 886
    invoke-interface {v15, v0}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 887
    .line 888
    .line 889
    :cond_12
    invoke-virtual {v1, v3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->removeSocket(Ljava/lang/String;)V
    :try_end_f
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_f .. :try_end_f} :catch_6
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_b
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 890
    .line 891
    .line 892
    :try_start_10
    sget-object v0, Landroid/gov/nist/javax/sip/stack/IOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 893
    .line 894
    const-string v15, "Closing socket"

    .line 895
    .line 896
    invoke-interface {v0, v15}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v10}, Ljava/net/Socket;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 900
    .line 901
    .line 902
    :catch_9
    add-int/lit8 v11, v11, 0x1

    .line 903
    .line 904
    move-object/from16 v10, v20

    .line 905
    .line 906
    goto/16 :goto_c

    .line 907
    .line 908
    :cond_13
    :goto_e
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    goto :goto_f

    .line 912
    :catch_a
    move-object/from16 v10, v20

    .line 913
    .line 914
    :catch_b
    :try_start_11
    invoke-virtual {v1, v3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->removeSocket(Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 915
    .line 916
    .line 917
    goto :goto_e

    .line 918
    :goto_f
    if-eqz v10, :cond_14

    .line 919
    .line 920
    return-object v10

    .line 921
    :cond_14
    invoke-static {v7, v4, v9, v5}, La/ohq;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 922
    .line 923
    .line 924
    return-object v20

    .line 925
    :goto_10
    :try_start_12
    invoke-virtual {v1, v3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->removeSocket(Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 929
    :goto_11
    invoke-direct {v1, v3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    throw v0

    .line 933
    :cond_15
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/IOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 934
    .line 935
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNetworkLayer()Landroid/gov/nist/core/net/NetworkLayer;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    invoke-interface {v0}, Landroid/gov/nist/core/net/NetworkLayer;->createDatagramSocket()Ljava/net/DatagramSocket;

    .line 940
    .line 941
    .line 942
    move-result-object v7

    .line 943
    invoke-virtual {v7, v4, v5}, Ljava/net/DatagramSocket;->connect(Ljava/net/InetAddress;I)V

    .line 944
    .line 945
    .line 946
    new-instance v0, Ljava/net/DatagramPacket;

    .line 947
    .line 948
    const/4 v2, 0x0

    .line 949
    move-object v1, v6

    .line 950
    move v3, v13

    .line 951
    invoke-direct/range {v0 .. v5}, Ljava/net/DatagramPacket;-><init>([BIILjava/net/InetAddress;I)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v7, v0}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v7}, Ljava/net/DatagramSocket;->close()V

    .line 958
    .line 959
    .line 960
    return-object v20
.end method
