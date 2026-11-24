.class public Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;
.super Landroid/gov/nist/javax/sip/stack/MessageProcessor;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor$SocketIOExceptionEvent;
    }
.end annotation


# static fields
.field private static final HIGHWAT:I = 0x1388

.field private static final LOWAT:I = 0x9c4

.field private static final MAX_EXCEPTIONS_TO_REPORT:I = 0xa

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field congestionAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

.field private exceptionsReportedCounter:I

.field protected isRunning:Z

.field private maxMessageSize:I

.field protected messageChannels:Ljava/util/LinkedList;

.field protected messageQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Landroid/gov/nist/javax/sip/stack/DatagramQueuedMessageDispatch;",
            ">;"
        }
    .end annotation
.end field

.field private port:I

.field protected sock:Ljava/net/DatagramSocket;

.field protected threadPoolSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/net/InetAddress;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;I)V
    .locals 3

    .line 1
    const-string v0, "udp"

    .line 2
    .line 3
    invoke-direct {p0, p1, p3, v0, p2}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;-><init>(Ljava/net/InetAddress;ILjava/lang/String;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->MAX_DATAGRAM_SIZE:Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->maxMessageSize:I

    .line 13
    .line 14
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxMessageSize()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ge v1, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxMessageSize()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-lez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxMessageSize()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->maxMessageSize:I

    .line 37
    .line 38
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 39
    .line 40
    const/16 v1, 0x20

    .line 41
    .line 42
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    sget-object v0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 49
    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v2, "Max Message size is "

    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->maxMessageSize:I

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->messageQueue:Ljava/util/concurrent/BlockingQueue;

    .line 75
    .line 76
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getStackCongestionControlTimeout()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-lez v0, :cond_2

    .line 81
    .line 82
    new-instance v0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 83
    .line 84
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->messageQueue:Ljava/util/concurrent/BlockingQueue;

    .line 85
    .line 86
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;-><init>(Ljava/util/Queue;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->congestionAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 90
    .line 91
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getStackCongestionControlTimeout()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->setTimeout(I)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->congestionAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 99
    .line 100
    const/16 v1, 0x7d0

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->start(I)V

    .line 103
    .line 104
    .line 105
    :cond_2
    iput p3, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->port:I

    .line 106
    .line 107
    :try_start_0
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNetworkLayer()Landroid/gov/nist/core/net/NetworkLayer;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v0, p3, p1}, Landroid/gov/nist/core/net/NetworkLayer;->createDatagramSocket(ILjava/net/InetAddress;)Ljava/net/DatagramSocket;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->sock:Ljava/net/DatagramSocket;

    .line 116
    .line 117
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getReceiveUdpBufferSize()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    invoke-virtual {p3, v0}, Ljava/net/DatagramSocket;->setReceiveBufferSize(I)V

    .line 122
    .line 123
    .line 124
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->sock:Ljava/net/DatagramSocket;

    .line 125
    .line 126
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSendUdpBufferSize()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-virtual {p3, v0}, Ljava/net/DatagramSocket;->setSendBufferSize(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    if-eqz p3, :cond_3

    .line 138
    .line 139
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    invoke-virtual {p3}, Landroid/gov/nist/core/ThreadAuditor;->isEnabled()Z

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    if-eqz p3, :cond_3

    .line 148
    .line 149
    iget-object p3, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->sock:Ljava/net/DatagramSocket;

    .line 150
    .line 151
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p2}, Landroid/gov/nist/core/ThreadAuditor;->getPingIntervalInMillisecs()J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    long-to-int p2, v0

    .line 160
    invoke-virtual {p3, p2}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :catch_0
    move-exception p1

    .line 165
    goto :goto_2

    .line 166
    :cond_3
    :goto_0
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    const-string p3, "0.0.0.0"

    .line 171
    .line 172
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    if-nez p2, :cond_5

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string p2, "::0"

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_4

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_4
    return-void

    .line 192
    :cond_5
    :goto_1
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->sock:Ljava/net/DatagramSocket;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/net/DatagramSocket;->getLocalAddress()Ljava/net/InetAddress;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->setIpAddress(Ljava/net/InetAddress;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :goto_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->congestionAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 203
    .line 204
    if-eqz p0, :cond_6

    .line 205
    .line 206
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->stop()V

    .line 207
    .line 208
    .line 209
    :cond_6
    new-instance p0, Ljava/io/IOException;

    .line 210
    .line 211
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    throw p0
.end method

.method public static synthetic access$000(Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;)I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->port:I

    .line 2
    .line 3
    return p0
.end method

.method private reportSockeException(Ljava/lang/Exception;)V
    .locals 8

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->exceptionsReportedCounter:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    if-ge v0, v1, :cond_2

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    add-int/2addr v0, v2

    .line 9
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->exceptionsReportedCounter:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->sock:Ljava/net/DatagramSocket;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/net/DatagramSocket;->getLocalAddress()Ljava/net/InetAddress;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->getPort()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    const-string v2, "(Flooding checker active, no more socket IO-exceptions will be reported)"

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string v2, ""

    .line 47
    .line 48
    :goto_1
    const-string v5, "\' on UDP receive socket on "

    .line 49
    .line 50
    const-string v6, ":"

    .line 51
    .line 52
    const-string v7, "Caught \'"

    .line 53
    .line 54
    invoke-static {v7, v0, v5, v1, v6}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, ", message \'"

    .line 59
    .line 60
    const-string v5, "\'. Trying to ignore it ... "

    .line 61
    .line 62
    invoke-static {v3, v1, v4, v5, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v1, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 73
    .line 74
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object v1, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 78
    .line 79
    invoke-interface {v1, p1}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSipListener()Landroid/javax/sip/SipListener;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_2

    .line 89
    .line 90
    new-instance v1, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor$SocketIOExceptionEvent;

    .line 91
    .line 92
    invoke-direct {v1, p0, v0}, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor$SocketIOExceptionEvent;-><init>(Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v1}, Landroid/javax/sip/SipListener;->processIOException(Landroid/javax/sip/IOExceptionEvent;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void
.end method


# virtual methods
.method public createMessageChannel(Landroid/gov/nist/core/HostPort;)Landroid/gov/nist/javax/sip/stack/MessageChannel;
    .locals 3

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/UDPMessageChannel;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/gov/nist/core/HostPort;->getInetAddress()Ljava/net/InetAddress;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Landroid/gov/nist/core/HostPort;->getPort()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1, v2, p0}, Landroid/gov/nist/javax/sip/stack/UDPMessageChannel;-><init>(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public createMessageChannel(Ljava/net/InetAddress;I)Landroid/gov/nist/javax/sip/stack/MessageChannel;
    .locals 2

    .line 17
    new-instance v0, Landroid/gov/nist/javax/sip/stack/UDPMessageChannel;

    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    invoke-direct {v0, p1, p2, v1, p0}, Landroid/gov/nist/javax/sip/stack/UDPMessageChannel;-><init>(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;)V

    return-object v0
.end method

.method public getDefaultTargetPort()I
    .locals 0

    const/16 p0, 0x13c4

    return p0
.end method

.method public getMaximumMessageSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getReceiveUdpBufferSize()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->port:I

    .line 2
    .line 3
    return p0
.end method

.method public getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "udp"

    .line 2
    .line 3
    return-object p0
.end method

.method public inUse()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->messageQueue:Ljava/util/concurrent/BlockingQueue;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    xor-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
.end method

.method public isSecure()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public run()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->messageChannels:Ljava/util/LinkedList;

    .line 7
    .line 8
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 9
    .line 10
    iget v1, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, -0x1

    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    move v0, v2

    .line 17
    :goto_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 18
    .line 19
    iget v4, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I

    .line 20
    .line 21
    if-ge v0, v4, :cond_0

    .line 22
    .line 23
    new-instance v1, Landroid/gov/nist/javax/sip/stack/UDPMessageChannel;

    .line 24
    .line 25
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 26
    .line 27
    new-instance v5, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 33
    .line 34
    check-cast v6, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 35
    .line 36
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/SipStackImpl;->getStackName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v6, "-UDPMessageChannelThread-"

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-direct {v1, v4, p0, v5}, Landroid/gov/nist/javax/sip/stack/UDPMessageChannel;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->messageChannels:Ljava/util/LinkedList;

    .line 59
    .line 60
    invoke-virtual {v4, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move-object v0, v1

    .line 67
    :cond_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/gov/nist/core/ThreadAuditor;->addCurrentThread()Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    const/4 v0, 0x0

    .line 85
    :catch_0
    :goto_1
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->isRunning:Z

    .line 86
    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    :try_start_0
    invoke-virtual {v0}, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->ping()V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catch_1
    move-exception v1

    .line 96
    goto :goto_4

    .line 97
    :catch_2
    move-exception v1

    .line 98
    goto :goto_5

    .line 99
    :catch_3
    move-exception v1

    .line 100
    goto :goto_6

    .line 101
    :cond_3
    :goto_2
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->maxMessageSize:I

    .line 102
    .line 103
    new-array v4, v1, [B

    .line 104
    .line 105
    new-instance v5, Ljava/net/DatagramPacket;

    .line 106
    .line 107
    invoke-direct {v5, v4, v1}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->sock:Ljava/net/DatagramSocket;

    .line 111
    .line 112
    invoke-virtual {v1, v5}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 116
    .line 117
    iget v1, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I

    .line 118
    .line 119
    if-eq v1, v3, :cond_4

    .line 120
    .line 121
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->messageQueue:Ljava/util/concurrent/BlockingQueue;

    .line 122
    .line 123
    new-instance v4, Landroid/gov/nist/javax/sip/stack/DatagramQueuedMessageDispatch;

    .line 124
    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 126
    .line 127
    .line 128
    move-result-wide v6

    .line 129
    invoke-direct {v4, v5, v6, v7}, Landroid/gov/nist/javax/sip/stack/DatagramQueuedMessageDispatch;-><init>(Ljava/net/DatagramPacket;J)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v1, v4}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    new-instance v1, Landroid/gov/nist/javax/sip/stack/UDPMessageChannel;

    .line 137
    .line 138
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 139
    .line 140
    invoke-direct {v1, v4, p0, v5}, Landroid/gov/nist/javax/sip/stack/UDPMessageChannel;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;Ljava/net/DatagramPacket;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->exceptionsReportedCounter:I
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :goto_4
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->reportSockeException(Ljava/lang/Exception;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :goto_5
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->reportSockeException(Ljava/lang/Exception;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :goto_6
    iget-boolean v4, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->isRunning:Z

    .line 155
    .line 156
    if-nez v4, :cond_5

    .line 157
    .line 158
    sget-object p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 159
    .line 160
    const/16 v0, 0x20

    .line 161
    .line 162
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_6

    .line 167
    .line 168
    sget-object p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 169
    .line 170
    const-string v0, "UDPMessageProcessor: Stopping"

    .line 171
    .line 172
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_5
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->reportSockeException(Ljava/lang/Exception;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_6
    :goto_7
    return-void
.end method

.method public start()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->isRunning:Z

    .line 3
    .line 4
    new-instance v1, Ljava/lang/Thread;

    .line 5
    .line 6
    invoke-direct {v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "MessageProcessorThread-UDP-"

    .line 15
    .line 16
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v2, 0x2f

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->getPort()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadPriority()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {v1, p0}, Ljava/lang/Thread;->setPriority(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public stop()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->isRunning:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->sock:Ljava/net/DatagramSocket;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->messageChannels:Ljava/util/LinkedList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->close()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getStackCongestionControlTimeout()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-lez v0, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->congestionAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->stop()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method
