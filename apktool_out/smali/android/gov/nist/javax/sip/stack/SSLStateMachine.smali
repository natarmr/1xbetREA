.class public Landroid/gov/nist/javax/sip/stack/SSLStateMachine;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;,
        Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;
    }
.end annotation


# static fields
.field public static final EMPTY_BUFFER:Ljava/nio/ByteBuffer;

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field protected channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

.field protected pendingOutboundBuffers:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;",
            ">;"
        }
    .end annotation
.end field

.field protected sslEngine:Ljavax/net/ssl/SSLEngine;

.field protected tlsRecordBuffer:Ljava/nio/ByteBuffer;

.field private unwrapLock:Ljava/lang/Object;

.field private wrapLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/SSLEngine;Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->unwrapLock:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->wrapLock:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 26
    .line 27
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 28
    .line 29
    return-void
.end method

.method private clearBuffer()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 5
    .line 6
    const/16 v0, 0x20

    .line 7
    .line 8
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 15
    .line 16
    const-string v0, "Buffer cleared"

    .line 17
    .line 18
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private normalizeTlsRecordBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 7
    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "Normalize buffer "

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, " into record buffer "

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    return-object p0
.end method

.method private runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;)V
    .locals 4

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Running delegated task for "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v0, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_TASK:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 35
    .line 36
    if-ne p1, v0, :cond_4

    .line 37
    .line 38
    :goto_0
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljavax/net/ssl/SSLEngine;->getDelegatedTask()Ljava/lang/Runnable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljavax/net/ssl/SSLEngine;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 57
    .line 58
    invoke-interface {p1, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v1, "Handshake status after delegated tasks "

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    sget-object p1, Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;->NEED_TASK:Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 84
    .line 85
    if-eq p0, p1, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const-string p0, "handshake shouldn\'t need additional tasks"

    .line 89
    .line 90
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_1
    return-void
.end method

.method private startBuffer(Ljava/nio/ByteBuffer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->getInstance()Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x81f6

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 24
    .line 25
    .line 26
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v2, "Allocated record buffer for reading "

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->tlsRecordBuffer:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, " for src = "

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method private unwrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->unwrapLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :cond_0
    :goto_0
    :try_start_0
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->normalizeTlsRecordBuffer(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    const/16 v2, 0x20

    .line 11
    .line 12
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 19
    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v4, "Unwrap src "

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v4, " dst "

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_1
    :goto_1
    :try_start_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 53
    .line 54
    invoke-virtual {v1, p1, p2}, Ljavax/net/ssl/SSLEngine;->unwrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    .line 55
    .line 56
    .line 57
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    :try_start_2
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 59
    .line 60
    invoke-interface {v3, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 67
    .line 68
    new-instance v4, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v5, "Unwrap result "

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v5, " buffers size "

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 87
    .line 88
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v5, " src="

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v5, " dst="

    .line 104
    .line 105
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    sget-object v4, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_UNDERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    .line 123
    .line 124
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_4

    .line 129
    .line 130
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 131
    .line 132
    invoke-interface {p2, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_3

    .line 137
    .line 138
    sget-object p2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 139
    .line 140
    const-string v1, "Buffer underflow, wait for the next inbound chunk of data to feed the SSL engine"

    .line 141
    .line 142
    invoke-interface {p2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_3
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->startBuffer(Ljava/nio/ByteBuffer;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_3

    .line 149
    .line 150
    :cond_4
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->clearBuffer()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->getStatus()Ljavax/net/ssl/SSLEngineResult$Status;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    sget-object v4, Ljavax/net/ssl/SSLEngineResult$Status;->BUFFER_OVERFLOW:Ljavax/net/ssl/SSLEngineResult$Status;

    .line 158
    .line 159
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_6

    .line 164
    .line 165
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 166
    .line 167
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_5

    .line 172
    .line 173
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 174
    .line 175
    new-instance v3, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string v4, "Buffer overflow , must prepare the buffer again. outNetBuffer remaining: "

    .line 181
    .line 182
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v4, " outNetBuffer postion: "

    .line 193
    .line 194
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v4, " Packet buffer size: "

    .line 205
    .line 206
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 210
    .line 211
    invoke-virtual {v4}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-interface {v4}, Ljavax/net/ssl/SSLSession;->getPacketBufferSize()I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v4, " new buffer size: "

    .line 223
    .line 224
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 228
    .line 229
    invoke-virtual {v4}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-interface {v4}, Ljavax/net/ssl/SSLSession;->getPacketBufferSize()I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    invoke-interface {v1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    :cond_5
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 255
    .line 256
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-interface {v1}, Ljavax/net/ssl/SSLSession;->getPacketBufferSize()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    invoke-interface {p2, v1}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->prepareAppDataBuffer(I)Ljava/nio/ByteBuffer;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 271
    .line 272
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_0

    .line 277
    .line 278
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 279
    .line 280
    new-instance v2, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 283
    .line 284
    .line 285
    const-string v3, " new outNetBuffer remaining: "

    .line 286
    .line 287
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v3, " new outNetBuffer postion: "

    .line 298
    .line 299
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :cond_6
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->bytesProduced()I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-lez v3, :cond_7

    .line 323
    .line 324
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 328
    .line 329
    .line 330
    move-result v3

    .line 331
    new-array v3, v3, [B

    .line 332
    .line 333
    invoke-virtual {p2, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 334
    .line 335
    .line 336
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 337
    .line 338
    invoke-interface {v4, v3}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->addPlaintextBytes([B)V

    .line 339
    .line 340
    .line 341
    :cond_7
    sget-object v3, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$1;->$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus:[I

    .line 342
    .line 343
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    aget v3, v3, v4

    .line 352
    .line 353
    const/4 v4, 0x1

    .line 354
    if-eq v3, v4, :cond_14

    .line 355
    .line 356
    const/4 v5, 0x2

    .line 357
    if-eq v3, v5, :cond_11

    .line 358
    .line 359
    const/4 v5, 0x3

    .line 360
    if-eq v3, v5, :cond_10

    .line 361
    .line 362
    const/4 v1, 0x4

    .line 363
    if-eq v3, v1, :cond_a

    .line 364
    .line 365
    const/4 v1, 0x5

    .line 366
    if-eq v3, v1, :cond_8

    .line 367
    .line 368
    goto/16 :goto_0

    .line 369
    .line 370
    :cond_8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->wrapRemaining()V

    .line 371
    .line 372
    .line 373
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 374
    .line 375
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-eqz v1, :cond_9

    .line 380
    .line 381
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 382
    .line 383
    new-instance v2, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 386
    .line 387
    .line 388
    const-string v3, "Not handshaking, but has remaining: "

    .line 389
    .line 390
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    const-string v3, " buffer "

    .line 401
    .line 402
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    :cond_9
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-eqz v1, :cond_13

    .line 420
    .line 421
    goto/16 :goto_0

    .line 422
    .line 423
    :cond_a
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 424
    .line 425
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-eqz v1, :cond_b

    .line 430
    .line 431
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 432
    .line 433
    const-string v3, "Handshaking just finnished, but has remaining. Will try to wrap the queues app items."

    .line 434
    .line 435
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    :cond_b
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->wrapRemaining()V

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    if-eqz v1, :cond_c

    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :cond_c
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 450
    .line 451
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 452
    .line 453
    .line 454
    move-result p1

    .line 455
    if-eqz p1, :cond_d

    .line 456
    .line 457
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 458
    .line 459
    const-string p2, "Handshake passed"

    .line 460
    .line 461
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    :cond_d
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 465
    .line 466
    instance-of p2, p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 467
    .line 468
    if-eqz p2, :cond_13

    .line 469
    .line 470
    check-cast p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 471
    .line 472
    invoke-virtual {p1, v4}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->setHandshakeCompleted(Z)V

    .line 473
    .line 474
    .line 475
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 476
    .line 477
    invoke-virtual {p1}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    if-eqz p1, :cond_f

    .line 482
    .line 483
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->Disabled:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 484
    .line 485
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 486
    .line 487
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 488
    .line 489
    .line 490
    move-result-object p2

    .line 491
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 492
    .line 493
    .line 494
    move-result-object p2

    .line 495
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result p1

    .line 499
    if-nez p1, :cond_e

    .line 500
    .line 501
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->DisabledAll:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 502
    .line 503
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 504
    .line 505
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 506
    .line 507
    .line 508
    move-result-object p2

    .line 509
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 510
    .line 511
    .line 512
    move-result-object p2

    .line 513
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 517
    if-nez p1, :cond_e

    .line 518
    .line 519
    :try_start_3
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 520
    .line 521
    check-cast p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 522
    .line 523
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 528
    .line 529
    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 530
    .line 531
    .line 532
    move-result-object p2

    .line 533
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 534
    .line 535
    .line 536
    move-result-object p2

    .line 537
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setPeerCertificates([Ljava/security/cert/Certificate;)V
    :try_end_3
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 538
    .line 539
    .line 540
    goto :goto_2

    .line 541
    :catch_0
    :try_start_4
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 542
    .line 543
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 544
    .line 545
    .line 546
    move-result p1

    .line 547
    if-eqz p1, :cond_e

    .line 548
    .line 549
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 550
    .line 551
    const-string p2, "sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled"

    .line 552
    .line 553
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    :cond_e
    :goto_2
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 557
    .line 558
    check-cast p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 559
    .line 560
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 565
    .line 566
    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 567
    .line 568
    .line 569
    move-result-object p2

    .line 570
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 571
    .line 572
    .line 573
    move-result-object p2

    .line 574
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setLocalCertificates([Ljava/security/cert/Certificate;)V

    .line 575
    .line 576
    .line 577
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 578
    .line 579
    check-cast p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 580
    .line 581
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 586
    .line 587
    invoke-virtual {p2}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 588
    .line 589
    .line 590
    move-result-object p2

    .line 591
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object p2

    .line 595
    invoke-virtual {p1, p2}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setCipherSuite(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 596
    .line 597
    .line 598
    :cond_f
    :try_start_5
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 599
    .line 600
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 601
    .line 602
    .line 603
    move-result-object p1

    .line 604
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->getTlsSecurityPolicy()Landroid/gov/nist/javax/sip/TlsSecurityPolicy;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 609
    .line 610
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->getEncapsulatedClientTransaction()Landroid/gov/nist/javax/sip/ClientTransactionExt;

    .line 611
    .line 612
    .line 613
    move-result-object p0

    .line 614
    invoke-interface {p1, p0}, Landroid/gov/nist/javax/sip/TlsSecurityPolicy;->enforceTlsPolicy(Landroid/gov/nist/javax/sip/ClientTransactionExt;)V
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 615
    .line 616
    .line 617
    :try_start_6
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 618
    .line 619
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 620
    .line 621
    .line 622
    move-result p0

    .line 623
    if-eqz p0, :cond_13

    .line 624
    .line 625
    sget-object p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 626
    .line 627
    const-string p1, "TLS Security policy passed"

    .line 628
    .line 629
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    goto :goto_3

    .line 633
    :catch_1
    move-exception p0

    .line 634
    new-instance p1, Ljava/io/IOException;

    .line 635
    .line 636
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw p1

    .line 644
    :cond_10
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;)V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_0

    .line 648
    .line 649
    :cond_11
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 650
    .line 651
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    if-eqz v1, :cond_12

    .line 656
    .line 657
    sget-object v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 658
    .line 659
    new-instance v2, Ljava/lang/StringBuilder;

    .line 660
    .line 661
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 662
    .line 663
    .line 664
    const-string v3, "Unwrap has remaining: "

    .line 665
    .line 666
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    const-string v3, " buffer "

    .line 677
    .line 678
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    :cond_12
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 692
    .line 693
    .line 694
    move-result v1

    .line 695
    if-eqz v1, :cond_13

    .line 696
    .line 697
    goto/16 :goto_0

    .line 698
    .line 699
    :cond_13
    :goto_3
    monitor-exit v0

    .line 700
    return-void

    .line 701
    :cond_14
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->wrapNonAppData()V

    .line 702
    .line 703
    .line 704
    goto/16 :goto_0

    .line 705
    .line 706
    :catch_2
    move-exception p0

    .line 707
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 708
    .line 709
    invoke-interface {p1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 710
    .line 711
    .line 712
    move-result p1

    .line 713
    if-eqz p1, :cond_15

    .line 714
    .line 715
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 716
    .line 717
    new-instance p2, Ljava/lang/StringBuilder;

    .line 718
    .line 719
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 720
    .line 721
    .line 722
    const-string v1, "A problem occured while trying to unwrap the message "

    .line 723
    .line 724
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object p2

    .line 738
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    :cond_15
    throw p0

    .line 742
    :goto_4
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 743
    throw p0
.end method

.method private wrapNonAppData()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->prepareEncryptedDataBuffer()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 8
    .line 9
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->EMPTY_BUFFER:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v1, v2, v0}, Ljavax/net/ssl/SSLEngine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    const/16 v3, 0x20

    .line 18
    .line 19
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 26
    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v5, "NonAppWrap result "

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v5, " buffers size "

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 46
    .line 47
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->bytesProduced()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-lez v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    new-array v2, v2, [B

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sendSSLMetadata([B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 83
    .line 84
    .line 85
    :cond_2
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$1;->$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus:[I

    .line 86
    .line 87
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    aget v2, v2, v4

    .line 96
    .line 97
    const/4 v4, 0x3

    .line 98
    if-eq v2, v4, :cond_6

    .line 99
    .line 100
    const/4 v4, 0x4

    .line 101
    if-eq v2, v4, :cond_3

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_3
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 106
    .line 107
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 114
    .line 115
    const-string v4, "Handshake complete!"

    .line 116
    .line 117
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 121
    .line 122
    instance-of v4, v2, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 123
    .line 124
    if-eqz v4, :cond_7

    .line 125
    .line 126
    check-cast v2, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    invoke-virtual {v2, v4}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->setHandshakeCompleted(Z)V

    .line 130
    .line 131
    .line 132
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-eqz v2, :cond_7

    .line 139
    .line 140
    sget-object v2, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->Disabled:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 141
    .line 142
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 143
    .line 144
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_5

    .line 157
    .line 158
    sget-object v2, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->DisabledAll:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 159
    .line 160
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 161
    .line 162
    invoke-interface {v4}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-nez v2, :cond_5

    .line 175
    .line 176
    :try_start_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 177
    .line 178
    check-cast v2, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 179
    .line 180
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-interface {v4}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-virtual {v2, v4}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setPeerCertificates([Ljava/security/cert/Certificate;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :catchall_0
    move-exception p0

    .line 199
    throw p0

    .line 200
    :catch_0
    move-exception p0

    .line 201
    throw p0

    .line 202
    :catch_1
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 203
    .line 204
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_5

    .line 209
    .line 210
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 211
    .line 212
    const-string v3, "sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled"

    .line 213
    .line 214
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :cond_5
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 218
    .line 219
    check-cast v2, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 220
    .line 221
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 226
    .line 227
    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-interface {v3}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setLocalCertificates([Ljava/security/cert/Certificate;)V

    .line 236
    .line 237
    .line 238
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 239
    .line 240
    check-cast v2, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 241
    .line 242
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 247
    .line 248
    invoke-virtual {v3}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-interface {v3}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v2, v3}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setCipherSuite(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_6
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;)V

    .line 261
    .line 262
    .line 263
    :cond_7
    :goto_1
    invoke-virtual {v1}, Ljavax/net/ssl/SSLEngineResult;->bytesProduced()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-nez v1, :cond_0

    .line 268
    .line 269
    return-void
.end method


# virtual methods
.method public sendSSLMetadata([B)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->sendEncryptedData([B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public unwrap(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 744
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->prepareAppDataBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 745
    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->unwrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;)V
    .locals 6

    .line 1
    const-string v0, "Wrapping "

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->wrapLock:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 17
    .line 18
    new-instance v4, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, ", buffers size "

    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 54
    .line 55
    new-instance v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;

    .line 56
    .line 57
    invoke-direct {v2, p1, p3}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;-><init>(Ljava/nio/ByteBuffer;Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v2}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    if-nez p1, :cond_2

    .line 72
    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_2
    :try_start_1
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 76
    .line 77
    invoke-static {p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->access$000(Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;)Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p3, v0, p2}, Ljavax/net/ssl/SSLEngine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 86
    .line 87
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 94
    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v4, "Wrap result "

    .line 101
    .line 102
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v4, " buffers size "

    .line 109
    .line 110
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catchall_1
    move-exception p2

    .line 131
    goto/16 :goto_6

    .line 132
    .line 133
    :cond_3
    :goto_2
    :try_start_2
    invoke-static {p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->access$000(Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;)Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_4

    .line 142
    .line 143
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 149
    .line 150
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 157
    .line 158
    new-instance v2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v4, "REMOVED item from encryption queue because it has no more data, all is done, buffers size now is "

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 169
    .line 170
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v4, " current buffer is "

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_4
    invoke-static {p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->access$000(Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;)Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 201
    .line 202
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_5

    .line 207
    .line 208
    sget-object v2, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 209
    .line 210
    new-instance v4, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v5, "Remaining "

    .line 216
    .line 217
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v0, " queue size is "

    .line 224
    .line 225
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_5
    invoke-virtual {p3}, Ljavax/net/ssl/SSLEngineResult;->bytesProduced()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-lez v0, :cond_7

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 254
    .line 255
    .line 256
    move-result p3

    .line 257
    new-array p3, p3, [B

    .line 258
    .line 259
    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->getCallBack()Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-eqz v0, :cond_6

    .line 267
    .line 268
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->getCallBack()Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-interface {p1, p3}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;->doSend([B)V

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_6
    invoke-virtual {p0, p3}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sendSSLMetadata([B)V

    .line 277
    .line 278
    .line 279
    :goto_3
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 280
    .line 281
    .line 282
    goto/16 :goto_1

    .line 283
    .line 284
    :cond_7
    sget-object v0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$1;->$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus:[I

    .line 285
    .line 286
    invoke-virtual {p3}, Ljavax/net/ssl/SSLEngineResult;->getHandshakeStatus()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    aget v0, v0, v2

    .line 295
    .line 296
    const/4 v2, 0x1

    .line 297
    if-eq v0, v2, :cond_b

    .line 298
    .line 299
    const/4 p1, 0x2

    .line 300
    if-eq v0, p1, :cond_c

    .line 301
    .line 302
    const/4 p1, 0x3

    .line 303
    if-eq v0, p1, :cond_a

    .line 304
    .line 305
    const/4 p1, 0x4

    .line 306
    if-eq v0, p1, :cond_8

    .line 307
    .line 308
    const/4 p1, 0x5

    .line 309
    if-eq v0, p1, :cond_c

    .line 310
    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :cond_8
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 314
    .line 315
    instance-of p3, p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 316
    .line 317
    if-eqz p3, :cond_1

    .line 318
    .line 319
    check-cast p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 320
    .line 321
    invoke-virtual {p1, v2}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->setHandshakeCompleted(Z)V

    .line 322
    .line 323
    .line 324
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 325
    .line 326
    invoke-virtual {p1}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    if-eqz p1, :cond_1

    .line 331
    .line 332
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->Disabled:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 333
    .line 334
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 335
    .line 336
    invoke-interface {p3}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 337
    .line 338
    .line 339
    move-result-object p3

    .line 340
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 341
    .line 342
    .line 343
    move-result-object p3

    .line 344
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    if-nez p1, :cond_9

    .line 349
    .line 350
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->DisabledAll:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 351
    .line 352
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 353
    .line 354
    invoke-interface {p3}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->getSIPStack()Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 355
    .line 356
    .line 357
    move-result-object p3

    .line 358
    invoke-virtual {p3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 359
    .line 360
    .line 361
    move-result-object p3

    .line 362
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 366
    if-nez p1, :cond_9

    .line 367
    .line 368
    :try_start_3
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 369
    .line 370
    check-cast p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 371
    .line 372
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 377
    .line 378
    invoke-virtual {p3}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 379
    .line 380
    .line 381
    move-result-object p3

    .line 382
    invoke-interface {p3}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 383
    .line 384
    .line 385
    move-result-object p3

    .line 386
    invoke-virtual {p1, p3}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setPeerCertificates([Ljava/security/cert/Certificate;)V
    :try_end_3
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 387
    .line 388
    .line 389
    goto :goto_4

    .line 390
    :catch_0
    :try_start_4
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 391
    .line 392
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    if-eqz p1, :cond_9

    .line 397
    .line 398
    sget-object p1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 399
    .line 400
    const-string p3, "sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled"

    .line 401
    .line 402
    invoke-interface {p1, p3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    :cond_9
    :goto_4
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 406
    .line 407
    check-cast p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 408
    .line 409
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 414
    .line 415
    invoke-virtual {p3}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 416
    .line 417
    .line 418
    move-result-object p3

    .line 419
    invoke-interface {p3}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 420
    .line 421
    .line 422
    move-result-object p3

    .line 423
    invoke-virtual {p1, p3}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setLocalCertificates([Ljava/security/cert/Certificate;)V

    .line 424
    .line 425
    .line 426
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 427
    .line 428
    check-cast p1, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 429
    .line 430
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->getHandshakeCompletedListener()Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->sslEngine:Ljavax/net/ssl/SSLEngine;

    .line 435
    .line 436
    invoke-virtual {p3}, Ljavax/net/ssl/SSLEngine;->getSession()Ljavax/net/ssl/SSLSession;

    .line 437
    .line 438
    .line 439
    move-result-object p3

    .line 440
    invoke-interface {p3}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object p3

    .line 444
    invoke-virtual {p1, p3}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->setCipherSuite(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    goto/16 :goto_1

    .line 448
    .line 449
    :cond_a
    invoke-direct {p0, p3}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->runDelegatedTasks(Ljavax/net/ssl/SSLEngineResult;)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_1

    .line 453
    .line 454
    :cond_b
    invoke-static {p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->access$000(Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;)Ljava/nio/ByteBuffer;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 459
    .line 460
    .line 461
    move-result p1

    .line 462
    if-eqz p1, :cond_c

    .line 463
    .line 464
    goto/16 :goto_1

    .line 465
    .line 466
    :cond_c
    :goto_5
    monitor-exit v1

    .line 467
    return-void

    .line 468
    :goto_6
    invoke-static {p1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->access$000(Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;)Ljava/nio/ByteBuffer;

    .line 469
    .line 470
    .line 471
    move-result-object p3

    .line 472
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 473
    .line 474
    .line 475
    move-result p3

    .line 476
    if-nez p3, :cond_d

    .line 477
    .line 478
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 479
    .line 480
    invoke-interface {p3}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    sget-object p3, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 484
    .line 485
    invoke-interface {p3, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 486
    .line 487
    .line 488
    move-result p3

    .line 489
    if-eqz p3, :cond_d

    .line 490
    .line 491
    sget-object p3, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->logger:Landroid/gov/nist/core/StackLogger;

    .line 492
    .line 493
    new-instance v0, Ljava/lang/StringBuilder;

    .line 494
    .line 495
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 496
    .line 497
    .line 498
    const-string v2, "REMOVED item from encryption queue because it has no more data, all is done, buffers size now is "

    .line 499
    .line 500
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->pendingOutboundBuffers:Ljava/util/Queue;

    .line 504
    .line 505
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 506
    .line 507
    .line 508
    move-result p0

    .line 509
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    const-string p0, " current buffer is "

    .line 513
    .line 514
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    invoke-interface {p3, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    :cond_d
    throw p2

    .line 528
    :goto_7
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 529
    throw p0
.end method

.method public wrapRemaining()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->channel:Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;

    .line 2
    .line 3
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/NioTlsChannelInterface;->prepareEncryptedDataBuffer()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p0, v1, v0, v1}, Landroid/gov/nist/javax/sip/stack/SSLStateMachine;->wrap(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
