.class public abstract Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;
.super Landroid/gov/nist/javax/sip/stack/MessageChannel;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/parser/SIPMessageListener;
.implements Ljava/lang/Runnable;
.implements Landroid/gov/nist/javax/sip/stack/RawMessageChannel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;
    }
.end annotation


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field protected isCached:Z

.field protected isRunning:Z

.field private keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

.field private keepAliveTimeout:J

.field protected key:Ljava/lang/String;

.field private volatile lastKeepAliveReceivedTime:J

.field protected myAddress:Ljava/lang/String;

.field protected myClientInputStream:Ljava/io/InputStream;

.field protected myParser:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

.field protected myPort:I

.field protected mySock:Ljava/net/Socket;

.field protected mythread:Ljava/lang/Thread;

.field protected peerAddress:Ljava/net/InetAddress;

.field protected peerAddressAdvertisedInHeaders:Ljava/lang/String;

.field protected peerPort:I

.field protected peerPortAdvertisedInHeaders:I

.field protected peerProtocol:Ljava/lang/String;

.field private pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

.field protected sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isRunning:Z

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPortAdvertisedInHeaders:I

    .line 9
    .line 10
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getReliableConnectionKeepAliveTimeout()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    int-to-long v1, p1

    .line 17
    iput-wide v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 18
    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long p1, v1, v3

    .line 22
    .line 23
    if-lez p1, :cond_0

    .line 24
    .line 25
    new-instance p1, Ljava/util/concurrent/Semaphore;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public static synthetic access$000()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public cancelPingKeepAliveTimeoutTaskIfStarted()V
    .locals 5

    .line 1
    const-string v0, "~~~ cancelPingKeepAliveTimeoutTaskIfStarted for MessageChannel(key="

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->getSipTimerTask()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :try_start_1
    sget-object v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 19
    .line 20
    const/16 v2, 0x20

    .line 21
    .line 22
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    sget-object v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, "), clientAddress="

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, ", clientPort="

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", timeout="

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-wide v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 66
    .line 67
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, ")"

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto :goto_1

    .line 85
    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 92
    .line 93
    invoke-interface {v0, v1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :goto_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :catch_0
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 109
    .line 110
    const-string v0, "Couldn\'t acquire keepAliveSemaphore"

    .line 111
    .line 112
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_1
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, v0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->close(ZZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public abstract close(ZZ)V
.end method

.method public getKeepAliveTimeout()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 7
    .line 8
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getTransport()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getKey(Ljava/net/InetAddress;ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 19
    .line 20
    return-object v0
.end method

.method public getPeerAddress()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getHost()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public getPeerInetAddress()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPeerPacketSourceAddress()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPeerPacketSourcePort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 2
    .line 3
    return p0
.end method

.method public getPeerPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 2
    .line 3
    return p0
.end method

.method public getPeerProtocol()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerProtocol:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    return-object p0
.end method

.method public getViaHost()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getViaPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myPort:I

    .line 2
    .line 3
    return p0
.end method

.method public isReliable()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 13

    .line 1
    const-string v0, "rport"

    .line 2
    .line 3
    const-string v1, "Dropping response message with invalid tag >>> "

    .line 4
    .line 5
    const-string v2, "setting rport since viaPort "

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFrom()Landroid/javax/sip/header/FromHeader;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTo()Landroid/javax/sip/header/ToHeader;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    :cond_0
    move-object v7, p1

    .line 38
    goto/16 :goto_c

    .line 39
    .line 40
    :cond_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 41
    .line 42
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setRemoteAddress(Ljava/net/InetAddress;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getPeerPort()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setRemotePort(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setLocalAddress(Ljava/net/InetAddress;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPort()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setLocalPort(I)V

    .line 68
    .line 69
    .line 70
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 71
    .line 72
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setPeerPacketSourceAddress(Ljava/net/InetAddress;)V

    .line 73
    .line 74
    .line 75
    iget v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 76
    .line 77
    invoke-virtual {p1, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setPeerPacketSourcePort(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getViaHeaders()Landroid/gov/nist/javax/sip/header/ViaList;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    instance-of v4, p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 85
    .line 86
    const/16 v5, 0x20

    .line 87
    .line 88
    if-eqz v4, :cond_e

    .line 89
    .line 90
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Landroid/gov/nist/javax/sip/header/Via;

    .line 95
    .line 96
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 97
    .line 98
    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addressResolver:Landroid/gov/nist/core/net/AddressResolver;

    .line 99
    .line 100
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/Via;->getHop()Landroid/javax/sip/address/Hop;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-interface {v4, v6}, Landroid/gov/nist/core/net/AddressResolver;->resolveAddress(Landroid/javax/sip/address/Hop;)Landroid/javax/sip/address/Hop;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    iput-object v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerProtocol:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    sget-object v7, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 119
    .line 120
    invoke-interface {v7, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    const-string v8, " key "

    .line 125
    .line 126
    const-string v9, " for this channel "

    .line 127
    .line 128
    if-eqz v7, :cond_2

    .line 129
    .line 130
    sget-object v7, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 131
    .line 132
    new-instance v10, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v11, "hop port = "

    .line 135
    .line 136
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v11, " for request "

    .line 143
    .line 144
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget-object v11, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-interface {v7, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_2
    if-gtz v6, :cond_3

    .line 172
    .line 173
    const/16 v6, 0x13c4

    .line 174
    .line 175
    iput v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPortAdvertisedInHeaders:I

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_3
    iput v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPortAdvertisedInHeaders:I

    .line 179
    .line 180
    :goto_0
    sget-object v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 181
    .line 182
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-eqz v6, :cond_4

    .line 187
    .line 188
    sget-object v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 189
    .line 190
    new-instance v7, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v10, "3.Storing peerPortAdvertisedInHeaders = "

    .line 193
    .line 194
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget v10, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPortAdvertisedInHeaders:I

    .line 198
    .line 199
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    iget-object v10, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    :cond_4
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddressAdvertisedInHeaders:Ljava/lang/String;

    .line 224
    .line 225
    if-nez v6, :cond_5

    .line 226
    .line 227
    invoke-interface {v4}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    iput-object v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddressAdvertisedInHeaders:Ljava/lang/String;

    .line 232
    .line 233
    sget-object v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 234
    .line 235
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    if-eqz v6, :cond_5

    .line 240
    .line 241
    sget-object v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 242
    .line 243
    new-instance v7, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    const-string v10, "3.Storing peerAddressAdvertisedInHeaders = "

    .line 246
    .line 247
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-object v10, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddressAdvertisedInHeaders:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    iget-object v8, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 265
    .line 266
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :cond_5
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 277
    .line 278
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isPatchReceivedRport()Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    const/4 v7, 0x1

    .line 283
    if-nez v6, :cond_b

    .line 284
    .line 285
    :try_start_0
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->mySock:Ljava/net/Socket;

    .line 286
    .line 287
    if-eqz v6, :cond_6

    .line 288
    .line 289
    invoke-virtual {v6}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    iput-object v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 294
    .line 295
    goto :goto_1

    .line 296
    :catch_0
    move-exception v0

    .line 297
    goto :goto_2

    .line 298
    :cond_6
    :goto_1
    invoke-virtual {v3, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->hasParameter(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    iget-object v8, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 303
    .line 304
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isPatchRport()Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-eqz v8, :cond_8

    .line 309
    .line 310
    if-nez v6, :cond_8

    .line 311
    .line 312
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    iget v9, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 317
    .line 318
    if-eq v8, v9, :cond_8

    .line 319
    .line 320
    sget-object v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 321
    .line 322
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-eqz v6, :cond_7

    .line 327
    .line 328
    sget-object v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 329
    .line 330
    new-instance v8, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    const-string v2, " different than peerPacketSourcePort "

    .line 343
    .line 344
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 348
    .line 349
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    const-string v2, " so that the response can be routed back"

    .line 353
    .line 354
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-interface {v6, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    :cond_7
    move v6, v7

    .line 365
    :cond_8
    if-nez v6, :cond_9

    .line 366
    .line 367
    invoke-interface {v4}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 372
    .line 373
    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-nez v2, :cond_a

    .line 382
    .line 383
    :cond_9
    const-string v2, "received"

    .line 384
    .line 385
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 386
    .line 387
    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-virtual {v3, v2, v4}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    :cond_a
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 395
    .line 396
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-virtual {v3, v0, v2}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 401
    .line 402
    .line 403
    goto :goto_3

    .line 404
    :goto_2
    invoke-static {v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 405
    .line 406
    .line 407
    goto :goto_3

    .line 408
    :cond_b
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 409
    .line 410
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_c

    .line 415
    .line 416
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 417
    .line 418
    const-string v2, "We did not use recived and rport"

    .line 419
    .line 420
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    :cond_c
    :goto_3
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isCached:Z

    .line 424
    .line 425
    if-nez v0, :cond_e

    .line 426
    .line 427
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->mySock:Ljava/net/Socket;

    .line 428
    .line 429
    if-eqz v0, :cond_e

    .line 430
    .line 431
    iput-boolean v7, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isCached:Z

    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, Ljava/net/InetSocketAddress;

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->mySock:Ljava/net/Socket;

    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-static {v2, v0}, Landroid/gov/nist/javax/sip/stack/IOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 454
    .line 455
    instance-of v3, v2, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 456
    .line 457
    if-eqz v3, :cond_d

    .line 458
    .line 459
    check-cast v2, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 460
    .line 461
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->nioHandler:Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 462
    .line 463
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->mySock:Ljava/net/Socket;

    .line 464
    .line 465
    invoke-virtual {v3}, Ljava/net/Socket;->getChannel()Ljava/nio/channels/SocketChannel;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v2, v0, v3}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->putSocket(Ljava/lang/String;Ljava/nio/channels/SocketChannel;)V

    .line 470
    .line 471
    .line 472
    goto :goto_4

    .line 473
    :cond_d
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 474
    .line 475
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->ioHandler:Landroid/gov/nist/javax/sip/stack/IOHandler;

    .line 476
    .line 477
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->mySock:Ljava/net/Socket;

    .line 478
    .line 479
    invoke-virtual {v2, v0, v3}, Landroid/gov/nist/javax/sip/stack/IOHandler;->putSocket(Ljava/lang/String;Ljava/net/Socket;)V

    .line 480
    .line 481
    .line 482
    :goto_4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 483
    .line 484
    check-cast v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 485
    .line 486
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->cacheMessageChannel(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;)V

    .line 487
    .line 488
    .line 489
    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 490
    .line 491
    .line 492
    move-result-wide v11

    .line 493
    instance-of v0, p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 494
    .line 495
    const-string v2, "Message size exceeded"

    .line 496
    .line 497
    const/4 v3, 0x0

    .line 498
    if-eqz v0, :cond_18

    .line 499
    .line 500
    move-object v0, p1

    .line 501
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 502
    .line 503
    sget-object v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 504
    .line 505
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-eqz v1, :cond_f

    .line 510
    .line 511
    sget-object v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 512
    .line 513
    const-string v4, "----Processing Message---"

    .line 514
    .line 515
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    :cond_f
    sget-object v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 519
    .line 520
    const/16 v4, 0x10

    .line 521
    .line 522
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    if-eqz v1, :cond_10

    .line 527
    .line 528
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 529
    .line 530
    iget-object v6, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverLogger:Landroid/gov/nist/core/ServerLogger;

    .line 531
    .line 532
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPeerHostPort()Landroid/gov/nist/core/HostPort;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-virtual {v1}, Landroid/gov/nist/core/HostPort;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    new-instance v1, Ljava/lang/StringBuilder;

    .line 541
    .line 542
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 543
    .line 544
    .line 545
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 546
    .line 547
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    invoke-virtual {v4}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    const-string v4, ":"

    .line 559
    .line 560
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 564
    .line 565
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v9

    .line 576
    const/4 v10, 0x0

    .line 577
    move-object v7, p1

    .line 578
    invoke-interface/range {v6 .. v12}, Landroid/gov/nist/core/ServerLogger;->logMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/String;Ljava/lang/String;ZJ)V

    .line 579
    .line 580
    .line 581
    goto :goto_5

    .line 582
    :cond_10
    move-object v7, p1

    .line 583
    :goto_5
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 584
    .line 585
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxMessageSize()I

    .line 586
    .line 587
    .line 588
    move-result p1

    .line 589
    if-lez p1, :cond_13

    .line 590
    .line 591
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getSize()I

    .line 592
    .line 593
    .line 594
    move-result p1

    .line 595
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    if-nez v1, :cond_11

    .line 600
    .line 601
    move v1, v3

    .line 602
    goto :goto_6

    .line 603
    :cond_11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    invoke-interface {v1}, Landroid/javax/sip/header/ContentLengthHeader;->getContentLength()I

    .line 608
    .line 609
    .line 610
    move-result v1

    .line 611
    :goto_6
    add-int/2addr p1, v1

    .line 612
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 613
    .line 614
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxMessageSize()I

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    if-gt p1, v1, :cond_12

    .line 619
    .line 620
    goto :goto_7

    .line 621
    :cond_12
    const/16 p1, 0x201

    .line 622
    .line 623
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getTransport()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->encodeAsBytes(Ljava/lang/String;)[B

    .line 632
    .line 633
    .line 634
    move-result-object p1

    .line 635
    invoke-virtual {p0, p1, v3}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sendMessage([BZ)V

    .line 636
    .line 637
    .line 638
    new-instance p0, Ljava/lang/Exception;

    .line 639
    .line 640
    invoke-direct {p0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw p0

    .line 644
    :cond_13
    :goto_7
    move-object p1, v7

    .line 645
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 646
    .line 647
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestLine()Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/header/RequestLine;->getSipVersion()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object p1

    .line 655
    const-string v1, "SIP/2.0"

    .line 656
    .line 657
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    if-eqz v1, :cond_17

    .line 662
    .line 663
    move-object p1, v7

    .line 664
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 665
    .line 666
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object p1

    .line 670
    move-object v1, v7

    .line 671
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 672
    .line 673
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeqHeader()Landroid/javax/sip/header/CSeqHeader;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    invoke-interface {v1}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 682
    .line 683
    .line 684
    move-result v1

    .line 685
    if-eqz v1, :cond_16

    .line 686
    .line 687
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 688
    .line 689
    invoke-virtual {p1, v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->newSIPServerRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;

    .line 690
    .line 691
    .line 692
    move-result-object p1

    .line 693
    if-eqz p1, :cond_15

    .line 694
    .line 695
    :try_start_1
    invoke-interface {p1, v0, p0}, Landroid/gov/nist/javax/sip/stack/ServerRequestInterface;->processRequest(Landroid/gov/nist/javax/sip/message/SIPRequest;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 696
    .line 697
    .line 698
    instance-of p0, p1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 699
    .line 700
    if-eqz p0, :cond_1f

    .line 701
    .line 702
    move-object p0, p1

    .line 703
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 704
    .line 705
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 706
    .line 707
    .line 708
    move-result p0

    .line 709
    if-nez p0, :cond_1f

    .line 710
    .line 711
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 712
    .line 713
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->releaseSem()V

    .line 714
    .line 715
    .line 716
    goto/16 :goto_d

    .line 717
    .line 718
    :catchall_0
    move-exception v0

    .line 719
    move-object p0, v0

    .line 720
    instance-of v0, p1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 721
    .line 722
    if-eqz v0, :cond_14

    .line 723
    .line 724
    move-object v0, p1

    .line 725
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 726
    .line 727
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    if-nez v0, :cond_14

    .line 732
    .line 733
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 734
    .line 735
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->releaseSem()V

    .line 736
    .line 737
    .line 738
    :cond_14
    throw p0

    .line 739
    :cond_15
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 740
    .line 741
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 742
    .line 743
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 744
    .line 745
    .line 746
    move-result p1

    .line 747
    if-nez p1, :cond_1f

    .line 748
    .line 749
    const/16 p1, 0x1f7

    .line 750
    .line 751
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 752
    .line 753
    .line 754
    move-result-object p1

    .line 755
    new-instance v0, Landroid/gov/nist/javax/sip/header/RetryAfter;

    .line 756
    .line 757
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/RetryAfter;-><init>()V

    .line 758
    .line 759
    .line 760
    :try_start_2
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 761
    .line 762
    .line 763
    move-result-wide v1

    .line 764
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 765
    .line 766
    mul-double/2addr v1, v3

    .line 767
    double-to-int v1, v1

    .line 768
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/header/RetryAfter;->setRetryAfter(I)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setHeader(Landroid/javax/sip/header/Header;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 775
    .line 776
    .line 777
    :catch_1
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 778
    .line 779
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 780
    .line 781
    .line 782
    move-result p0

    .line 783
    if-eqz p0, :cond_1f

    .line 784
    .line 785
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 786
    .line 787
    const-string p1, "Dropping message -- could not acquire semaphore"

    .line 788
    .line 789
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    goto/16 :goto_d

    .line 793
    .line 794
    :cond_16
    const/16 v1, 0x190

    .line 795
    .line 796
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(I)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getTransport()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->encodeAsBytes(Ljava/lang/String;)[B

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-virtual {p0, v0, v3}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sendMessage([BZ)V

    .line 809
    .line 810
    .line 811
    new-instance p0, Ljava/lang/Exception;

    .line 812
    .line 813
    new-instance v0, Ljava/lang/StringBuilder;

    .line 814
    .line 815
    const-string v1, "Bad CSeq method"

    .line 816
    .line 817
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    const-string v1, " method "

    .line 824
    .line 825
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object p1

    .line 835
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    throw p0

    .line 839
    :cond_17
    move-object v0, v7

    .line 840
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 841
    .line 842
    const/16 v1, 0x1f9

    .line 843
    .line 844
    const-string v2, "Bad SIP version "

    .line 845
    .line 846
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object p1

    .line 850
    invoke-virtual {v0, v1, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->createResponse(ILjava/lang/String;)Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 851
    .line 852
    .line 853
    move-result-object p1

    .line 854
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getTransport()Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPResponse;->encodeAsBytes(Ljava/lang/String;)[B

    .line 859
    .line 860
    .line 861
    move-result-object p1

    .line 862
    invoke-virtual {p0, p1, v3}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sendMessage([BZ)V

    .line 863
    .line 864
    .line 865
    new-instance p0, Ljava/lang/Exception;

    .line 866
    .line 867
    const-string p1, "Bad version "

    .line 868
    .line 869
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    throw p0

    .line 873
    :cond_18
    move-object v7, p1

    .line 874
    move-object p1, v7

    .line 875
    check-cast p1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 876
    .line 877
    :try_start_3
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPResponse;->checkHeaders()V
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 878
    .line 879
    .line 880
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 881
    .line 882
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxMessageSize()I

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    if-lez v0, :cond_1a

    .line 887
    .line 888
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getSize()I

    .line 889
    .line 890
    .line 891
    move-result v0

    .line 892
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 893
    .line 894
    .line 895
    move-result-object v4

    .line 896
    if-nez v4, :cond_19

    .line 897
    .line 898
    goto :goto_8

    .line 899
    :cond_19
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 900
    .line 901
    .line 902
    move-result-object v3

    .line 903
    invoke-interface {v3}, Landroid/javax/sip/header/ContentLengthHeader;->getContentLength()I

    .line 904
    .line 905
    .line 906
    move-result v3

    .line 907
    :goto_8
    add-int/2addr v0, v3

    .line 908
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 909
    .line 910
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxMessageSize()I

    .line 911
    .line 912
    .line 913
    move-result v3

    .line 914
    if-le v0, v3, :cond_1a

    .line 915
    .line 916
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 917
    .line 918
    invoke-interface {p0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 919
    .line 920
    .line 921
    move-result p0

    .line 922
    if-eqz p0, :cond_1f

    .line 923
    .line 924
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 925
    .line 926
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    goto/16 :goto_d

    .line 930
    .line 931
    :cond_1a
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 932
    .line 933
    invoke-virtual {v0, p1, p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->newSIPServerResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;)Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;

    .line 934
    .line 935
    .line 936
    move-result-object v2

    .line 937
    if-eqz v2, :cond_1e

    .line 938
    .line 939
    :try_start_4
    instance-of v0, v2, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 940
    .line 941
    if-eqz v0, :cond_1c

    .line 942
    .line 943
    move-object v0, v2

    .line 944
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 945
    .line 946
    invoke-interface {v0, p1}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->checkFromTag(Landroid/gov/nist/javax/sip/message/SIPResponse;)Z

    .line 947
    .line 948
    .line 949
    move-result v0

    .line 950
    if-nez v0, :cond_1c

    .line 951
    .line 952
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 953
    .line 954
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 955
    .line 956
    .line 957
    move-result p0

    .line 958
    if-eqz p0, :cond_1b

    .line 959
    .line 960
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 961
    .line 962
    new-instance v0, Ljava/lang/StringBuilder;

    .line 963
    .line 964
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 968
    .line 969
    .line 970
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object p1

    .line 974
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 975
    .line 976
    .line 977
    goto :goto_9

    .line 978
    :catchall_1
    move-exception v0

    .line 979
    move-object p0, v0

    .line 980
    goto :goto_b

    .line 981
    :cond_1b
    :goto_9
    instance-of p0, v2, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 982
    .line 983
    if-eqz p0, :cond_1f

    .line 984
    .line 985
    move-object p0, v2

    .line 986
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 987
    .line 988
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 989
    .line 990
    .line 991
    move-result p0

    .line 992
    if-nez p0, :cond_1f

    .line 993
    .line 994
    :goto_a
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 995
    .line 996
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->releaseSem()V

    .line 997
    .line 998
    .line 999
    goto/16 :goto_d

    .line 1000
    .line 1001
    :cond_1c
    :try_start_5
    invoke-interface {v2, p1, p0}, Landroid/gov/nist/javax/sip/stack/ServerResponseInterface;->processResponse(Landroid/gov/nist/javax/sip/message/SIPResponse;Landroid/gov/nist/javax/sip/stack/MessageChannel;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 1002
    .line 1003
    .line 1004
    instance-of p0, v2, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 1005
    .line 1006
    if-eqz p0, :cond_1f

    .line 1007
    .line 1008
    move-object p0, v2

    .line 1009
    check-cast p0, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 1010
    .line 1011
    invoke-interface {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 1012
    .line 1013
    .line 1014
    move-result p0

    .line 1015
    if-nez p0, :cond_1f

    .line 1016
    .line 1017
    goto :goto_a

    .line 1018
    :goto_b
    instance-of p1, v2, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 1019
    .line 1020
    if-eqz p1, :cond_1d

    .line 1021
    .line 1022
    move-object p1, v2

    .line 1023
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 1024
    .line 1025
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->passToListener()Z

    .line 1026
    .line 1027
    .line 1028
    move-result p1

    .line 1029
    if-nez p1, :cond_1d

    .line 1030
    .line 1031
    check-cast v2, Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 1032
    .line 1033
    invoke-interface {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->releaseSem()V

    .line 1034
    .line 1035
    .line 1036
    :cond_1d
    throw p0

    .line 1037
    :cond_1e
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1038
    .line 1039
    invoke-interface {p0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 1040
    .line 1041
    .line 1042
    move-result p0

    .line 1043
    if-eqz p0, :cond_1f

    .line 1044
    .line 1045
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1046
    .line 1047
    const-string p1, "null sipServerResponse as could not acquire semaphore or the valve dropped the message."

    .line 1048
    .line 1049
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    goto :goto_d

    .line 1053
    :catchall_2
    move-exception v0

    .line 1054
    move-object p0, v0

    .line 1055
    throw p0

    .line 1056
    :catch_2
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1057
    .line 1058
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1059
    .line 1060
    .line 1061
    move-result p0

    .line 1062
    if-eqz p0, :cond_1f

    .line 1063
    .line 1064
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1065
    .line 1066
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1067
    .line 1068
    const-string v1, "Dropping Badly formatted response message >>> "

    .line 1069
    .line 1070
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1077
    .line 1078
    .line 1079
    move-result-object p1

    .line 1080
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_d

    .line 1084
    :goto_c
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1085
    .line 1086
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1087
    .line 1088
    .line 1089
    move-result p0

    .line 1090
    if-eqz p0, :cond_1f

    .line 1091
    .line 1092
    invoke-virtual {v7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encode()Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object p0

    .line 1096
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1097
    .line 1098
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1099
    .line 1100
    const-string v1, "bad message "

    .line 1101
    .line 1102
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object p0

    .line 1112
    invoke-interface {p1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1116
    .line 1117
    const-string p1, ">>> Dropped Bad Msg"

    .line 1118
    .line 1119
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1120
    .line 1121
    .line 1122
    :cond_1f
    :goto_d
    return-void
.end method

.method public processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/net/InetAddress;)V
    .locals 0

    .line 1123
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 1124
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 1125
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    const/4 p2, 0x4

    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1126
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    const-string p2, "ERROR processing self routing"

    invoke-interface {p1, p2, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public rescheduleKeepAliveTimeout(J)V
    .locals 10

    .line 1
    const-string v0, "~~~ cancelPingKeepAliveTimeout for MessageChannel(key="

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    const/16 v3, 0x20

    .line 11
    .line 12
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-string v4, ", timeout="

    .line 17
    .line 18
    const-string v5, ", clientPort="

    .line 19
    .line 20
    const-string v6, "), clientAddress="

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v7, "~~~ rescheduleKeepAliveTimeout for MessageChannel(key="

    .line 27
    .line 28
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v7, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v7, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 40
    .line 41
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v7, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 48
    .line 49
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-wide v7, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 56
    .line 57
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v7, "): newKeepAliveTimeout="

    .line 61
    .line 62
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-wide v7, 0x7fffffffffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    cmp-long v2, p1, v7

    .line 78
    .line 79
    if-nez v2, :cond_0

    .line 80
    .line 81
    const-string p1, "Long.MAX_VALUE"

    .line 82
    .line 83
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    :cond_1
    :goto_0
    :try_start_0
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    .line 94
    .line 95
    :try_start_1
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    .line 97
    const-string p2, " seconds"

    .line 98
    .line 99
    const-wide/16 v7, 0x3e8

    .line 100
    .line 101
    const-string v2, ", scheduling pingKeepAliveTimeoutTask to execute after "

    .line 102
    .line 103
    if-nez p1, :cond_3

    .line 104
    .line 105
    :try_start_2
    new-instance p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;

    .line 106
    .line 107
    invoke-direct {p1, p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 111
    .line 112
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 113
    .line 114
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-wide v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 124
    .line 125
    div-long/2addr v2, v7

    .line 126
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :catchall_0
    move-exception p1

    .line 143
    goto/16 :goto_3

    .line 144
    .line 145
    :cond_2
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 146
    .line 147
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 152
    .line 153
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 154
    .line 155
    invoke-interface {p1, p2, v0, v1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 160
    .line 161
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_4

    .line 166
    .line 167
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 168
    .line 169
    new-instance v9, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 183
    .line 184
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 191
    .line 192
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    iget-wide v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 199
    .line 200
    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v0, ")"

    .line 204
    .line 205
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :cond_4
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 216
    .line 217
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 222
    .line 223
    invoke-interface {p1, v0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 224
    .line 225
    .line 226
    new-instance p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;

    .line 227
    .line 228
    invoke-direct {p1, p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$KeepAliveTimeoutTimerTask;-><init>(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;)V

    .line 229
    .line 230
    .line 231
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 232
    .line 233
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 234
    .line 235
    invoke-interface {p1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-eqz p1, :cond_5

    .line 240
    .line 241
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    iget-wide v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 245
    .line 246
    div-long/2addr v2, v7

    .line 247
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    sget-object p1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_5
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 263
    .line 264
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 269
    .line 270
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 271
    .line 272
    invoke-interface {p1, p2, v0, v1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 273
    .line 274
    .line 275
    :goto_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 276
    .line 277
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :goto_3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 282
    .line 283
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 284
    .line 285
    .line 286
    throw p1

    .line 287
    :catch_0
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 288
    .line 289
    const-string p1, "Couldn\'t acquire keepAliveSemaphore"

    .line 290
    .line 291
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method public run()V
    .locals 8

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myClientInputStream:Ljava/io/InputStream;

    .line 4
    .line 5
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 6
    .line 7
    iget v3, v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->readTimeout:I

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v0, v1, v3, v2}, Landroid/gov/nist/javax/sip/parser/Pipeline;-><init>(Ljava/io/InputStream;ILandroid/gov/nist/javax/sip/stack/timers/SipTimer;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 17
    .line 18
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxMessageSize()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {v1, v2, p0, v0, v3}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/SIPMessageListener;Landroid/gov/nist/javax/sip/parser/Pipeline;I)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myParser:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->processInput()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 33
    .line 34
    check-cast v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 35
    .line 36
    iget v2, v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->useCount:I

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    add-int/2addr v2, v3

    .line 40
    iput v2, v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->useCount:I

    .line 41
    .line 42
    iput-boolean v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isRunning:Z

    .line 43
    .line 44
    :goto_0
    const/4 v1, -0x1

    .line 45
    const/4 v2, 0x0

    .line 46
    const/16 v4, 0x1000

    .line 47
    .line 48
    :try_start_0
    new-array v5, v4, [B

    .line 49
    .line 50
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myClientInputStream:Ljava/io/InputStream;

    .line 51
    .line 52
    invoke-virtual {v6, v5, v2, v4}, Ljava/io/InputStream;->read([BII)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-ne v4, v1, :cond_1

    .line 57
    .line 58
    const-string v4, "\r\n\r\n"

    .line 59
    .line 60
    const-string v5, "UTF-8"

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v0, v4}, Landroid/gov/nist/javax/sip/parser/Pipeline;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 67
    .line 68
    .line 69
    :try_start_1
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 70
    .line 71
    iget v4, v4, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxConnections:I

    .line 72
    .line 73
    if-eq v4, v1, :cond_0

    .line 74
    .line 75
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 76
    .line 77
    monitor-enter v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    :try_start_2
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 79
    .line 80
    move-object v5, v4

    .line 81
    check-cast v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 82
    .line 83
    iget v6, v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->nConnections:I

    .line 84
    .line 85
    sub-int/2addr v6, v3

    .line 86
    iput v6, v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->nConnections:I

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->notify()V

    .line 89
    .line 90
    .line 91
    monitor-exit v1

    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v4

    .line 94
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    :try_start_3
    throw v4

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    goto/16 :goto_6

    .line 98
    .line 99
    :catch_0
    move-exception v1

    .line 100
    goto :goto_3

    .line 101
    :cond_0
    :goto_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->close()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 105
    .line 106
    .line 107
    :catch_1
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isRunning:Z

    .line 108
    .line 109
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 110
    .line 111
    check-cast v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->remove(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 117
    .line 118
    check-cast v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 119
    .line 120
    iget v1, v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->useCount:I

    .line 121
    .line 122
    sub-int/2addr v1, v3

    .line 123
    iput v1, v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->useCount:I

    .line 124
    .line 125
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myParser:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 126
    .line 127
    if-eqz p0, :cond_5

    .line 128
    .line 129
    :goto_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->close()V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_8

    .line 133
    .line 134
    :catch_2
    move-exception v4

    .line 135
    goto :goto_4

    .line 136
    :cond_1
    :try_start_4
    invoke-virtual {v0, v5, v2, v4}, Landroid/gov/nist/javax/sip/parser/Pipeline;->write([BII)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :goto_3
    :try_start_5
    sget-object v4, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 141
    .line 142
    invoke-static {v1, v4}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;Landroid/gov/nist/core/StackLogger;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :goto_4
    :try_start_6
    const-string v5, "\r\n\r\n"

    .line 147
    .line 148
    const-string v6, "UTF-8"

    .line 149
    .line 150
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v0, v5}, Landroid/gov/nist/javax/sip/parser/Pipeline;->write([B)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 155
    .line 156
    .line 157
    :catch_3
    :try_start_7
    sget-object v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 158
    .line 159
    const/16 v6, 0x20

    .line 160
    .line 161
    invoke-interface {v5, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_2

    .line 166
    .line 167
    sget-object v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 168
    .line 169
    new-instance v6, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v7, "IO issue while closing socket "

    .line 175
    .line 176
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-interface {v5, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 191
    .line 192
    .line 193
    :cond_2
    :try_start_8
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 194
    .line 195
    iget v4, v4, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxConnections:I

    .line 196
    .line 197
    if-eq v4, v1, :cond_3

    .line 198
    .line 199
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 200
    .line 201
    monitor-enter v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 202
    :try_start_9
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 203
    .line 204
    move-object v5, v4

    .line 205
    check-cast v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 206
    .line 207
    iget v6, v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->nConnections:I

    .line 208
    .line 209
    sub-int/2addr v6, v3

    .line 210
    iput v6, v5, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->nConnections:I

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/Object;->notify()V

    .line 213
    .line 214
    .line 215
    monitor-exit v1

    .line 216
    goto :goto_5

    .line 217
    :catchall_2
    move-exception v0

    .line 218
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 219
    :try_start_a
    throw v0

    .line 220
    :cond_3
    :goto_5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->close()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :goto_6
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isRunning:Z

    .line 228
    .line 229
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 230
    .line 231
    check-cast v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 232
    .line 233
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->remove(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;)V

    .line 234
    .line 235
    .line 236
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 237
    .line 238
    check-cast v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 239
    .line 240
    iget v2, v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->useCount:I

    .line 241
    .line 242
    sub-int/2addr v2, v3

    .line 243
    iput v2, v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->useCount:I

    .line 244
    .line 245
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myParser:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 246
    .line 247
    if-eqz p0, :cond_4

    .line 248
    .line 249
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->close()V

    .line 250
    .line 251
    .line 252
    :cond_4
    throw v0

    .line 253
    :catch_4
    :goto_7
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isRunning:Z

    .line 254
    .line 255
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 256
    .line 257
    check-cast v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 258
    .line 259
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->remove(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;)V

    .line 260
    .line 261
    .line 262
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 263
    .line 264
    check-cast v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 265
    .line 266
    iget v1, v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->useCount:I

    .line 267
    .line 268
    sub-int/2addr v1, v3

    .line 269
    iput v1, v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->useCount:I

    .line 270
    .line 271
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myParser:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 272
    .line 273
    if-eqz p0, :cond_5

    .line 274
    .line 275
    goto/16 :goto_2

    .line 276
    .line 277
    :cond_5
    :goto_8
    return-void
.end method

.method public sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 8

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

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
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->isNullRequest()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "sendMessage:: "

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFirstLine()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, " cseq method = "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v3}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageProcessors()[Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    array-length v2, v0

    .line 65
    const/4 v3, 0x0

    .line 66
    :goto_0
    if-ge v3, v2, :cond_2

    .line 67
    .line 68
    aget-object v4, v0, v3

    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v5}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getPeerAddress()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_1

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getPeerPort()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-ne v5, v6, :cond_1

    .line 97
    .line 98
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getTransport()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getPeerProtocol()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_1

    .line 111
    .line 112
    new-instance v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$1;

    .line 113
    .line 114
    invoke-direct {v0, p0, p1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel$1;-><init>(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSelfRoutingThreadpoolExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 126
    .line 127
    .line 128
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 129
    .line 130
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_5

    .line 135
    .line 136
    sget-object p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 137
    .line 138
    const-string p1, "Self routing message"

    .line 139
    .line 140
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_2
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getTransport()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->encodeAsBytes(Ljava/lang/String;)[B

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 156
    .line 157
    .line 158
    move-result-wide v6

    .line 159
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPortAdvertisedInHeaders:I

    .line 160
    .line 161
    if-gtz v2, :cond_4

    .line 162
    .line 163
    instance-of v2, p1, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 164
    .line 165
    if-eqz v2, :cond_4

    .line 166
    .line 167
    move-object v2, p1

    .line 168
    check-cast v2, Landroid/gov/nist/javax/sip/message/SIPResponse;

    .line 169
    .line 170
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostVia()Landroid/gov/nist/javax/sip/header/Via;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getRPort()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-lez v3, :cond_4

    .line 179
    .line 180
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-gtz v3, :cond_3

    .line 185
    .line 186
    const/16 v3, 0x13c4

    .line 187
    .line 188
    iput v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPortAdvertisedInHeaders:I

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_3
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    iput v3, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPortAdvertisedInHeaders:I

    .line 196
    .line 197
    :goto_1
    sget-object v3, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 198
    .line 199
    invoke-interface {v3, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_4

    .line 204
    .line 205
    sget-object v1, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 206
    .line 207
    new-instance v3, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string v4, "1.Storing peerPortAdvertisedInHeaders = "

    .line 210
    .line 211
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPortAdvertisedInHeaders:I

    .line 215
    .line 216
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v4, " for via port = "

    .line 220
    .line 221
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v4, " via rport = "

    .line 232
    .line 233
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/header/Via;->getRPort()I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v2, " and peer port = "

    .line 244
    .line 245
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 249
    .line 250
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v2, " for this channel "

    .line 254
    .line 255
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v2, " key "

    .line 262
    .line 263
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :cond_4
    instance-of v1, p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 279
    .line 280
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sendMessage([BZ)V

    .line 281
    .line 282
    .line 283
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 284
    .line 285
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setRemoteAddress(Ljava/net/InetAddress;)V

    .line 286
    .line 287
    .line 288
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 289
    .line 290
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setRemotePort(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setLocalAddress(Ljava/net/InetAddress;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->getPort()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setLocalPort(I)V

    .line 309
    .line 310
    .line 311
    sget-object v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 312
    .line 313
    const/16 v1, 0x10

    .line 314
    .line 315
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_5

    .line 320
    .line 321
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 322
    .line 323
    iget v5, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 324
    .line 325
    move-object v2, p0

    .line 326
    move-object v3, p1

    .line 327
    invoke-virtual/range {v2 .. v7}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->logMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/net/InetAddress;IJ)V

    .line 328
    .line 329
    .line 330
    :cond_5
    return-void
.end method

.method public abstract sendMessage([BZ)V
.end method

.method public sendSingleCLRF()V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->lastKeepAliveReceivedTime:J

    .line 6
    .line 7
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->mySock:Ljava/net/Socket;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "\r\n"

    .line 18
    .line 19
    const-string v1, "UTF-8"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->sendMessage([BZ)V

    .line 27
    .line 28
    .line 29
    :cond_0
    monitor-enter p0

    .line 30
    :try_start_0
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isRunning:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 35
    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    cmp-long v2, v0, v2

    .line 39
    .line 40
    if-lez v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->rescheduleKeepAliveTimeout(J)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw v0
.end method

.method public setKeepAliveTimeout(J)V
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->cancelPingKeepAliveTimeoutTaskIfStarted()V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-nez v2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getReliableConnectionKeepAliveTimeout()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    int-to-long p1, p1

    .line 23
    :cond_1
    sget-object v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 24
    .line 25
    const/16 v3, 0x20

    .line 26
    .line 27
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    sget-object v2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 34
    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v4, "~~~ setKeepAliveTimeout for MessageChannel(key="

    .line 38
    .line 39
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v4, "), clientAddress="

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v4, ", clientPort="

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget v4, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v4, ", timeout="

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v4, ")"

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveTimeout:J

    .line 88
    .line 89
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 90
    .line 91
    if-nez v2, :cond_3

    .line 92
    .line 93
    new-instance v2, Ljava/util/concurrent/Semaphore;

    .line 94
    .line 95
    const/4 v3, 0x1

    .line 96
    invoke-direct {v2, v3}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 97
    .line 98
    .line 99
    iput-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->keepAliveSemaphore:Ljava/util/concurrent/Semaphore;

    .line 100
    .line 101
    :cond_3
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->pingKeepAliveTimeoutTask:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 102
    .line 103
    if-eqz v2, :cond_4

    .line 104
    .line 105
    cmp-long v0, p1, v0

    .line 106
    .line 107
    if-lez v0, :cond_4

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->rescheduleKeepAliveTimeout(J)V

    .line 110
    .line 111
    .line 112
    :cond_4
    return-void
.end method

.method public uncache()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isCached:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->isRunning:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 10
    .line 11
    check-cast v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageProcessor;->remove(Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
