.class public Landroid/gov/nist/javax/sip/stack/NIOHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field protected channelMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/nio/channels/SocketChannel;",
            "Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;",
            ">;"
        }
    .end annotation
.end field

.field keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

.field private messageProcessor:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

.field private sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

.field private final socketTable:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/nio/channels/SocketChannel;",
            ">;"
        }
    .end annotation
.end field

.field protected socketTimeoutAuditor:Landroid/gov/nist/javax/sip/stack/SocketTimeoutAuditor;

.field private stopped:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTimeoutAuditor:Landroid/gov/nist/javax/sip/stack/SocketTimeoutAuditor;

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->stopped:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 28
    .line 29
    new-instance v0, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 35
    .line 36
    move-object v0, p1

    .line 37
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 38
    .line 39
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 40
    .line 41
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->messageProcessor:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 42
    .line 43
    iget-wide v0, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->nioSocketMaxIdleTime:J

    .line 44
    .line 45
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-lez v0, :cond_0

    .line 50
    .line 51
    if-eqz p2, :cond_0

    .line 52
    .line 53
    new-instance p2, Landroid/gov/nist/javax/sip/stack/SocketTimeoutAuditor;

    .line 54
    .line 55
    iget-wide v0, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->nioSocketMaxIdleTime:J

    .line 56
    .line 57
    invoke-direct {p2, v0, v1, p0}, Landroid/gov/nist/javax/sip/stack/SocketTimeoutAuditor;-><init>(JLandroid/gov/nist/javax/sip/stack/NIOHandler;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTimeoutAuditor:Landroid/gov/nist/javax/sip/stack/SocketTimeoutAuditor;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTimeoutAuditor:Landroid/gov/nist/javax/sip/stack/SocketTimeoutAuditor;

    .line 67
    .line 68
    iget-wide v4, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->nioSocketMaxIdleTime:J

    .line 69
    .line 70
    move-wide v6, v4

    .line 71
    invoke-interface/range {v2 .. v7}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->scheduleWithFixedDelay(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;JJ)Z

    .line 72
    .line 73
    .line 74
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

.method private openOutgoingConnection(Ljava/net/InetAddress;Ljava/net/InetAddress;IZLjava/lang/String;)Ljava/nio/channels/SocketChannel;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    const-string v7, "sending to "

    .line 14
    .line 15
    const-string v8, "inaddr = "

    .line 16
    .line 17
    const-string v9, "Problem OpeningConn:  inAddr "

    .line 18
    .line 19
    const-string v10, "Problem connecting "

    .line 20
    .line 21
    const-string v0, "port = "

    .line 22
    .line 23
    const/16 v11, 0x10

    .line 24
    .line 25
    const/16 v12, 0x20

    .line 26
    .line 27
    const/4 v13, 0x1

    .line 28
    const/4 v14, 0x0

    .line 29
    :try_start_0
    iget-object v15, v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 30
    .line 31
    invoke-virtual {v15, v6}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->enterIOCriticalSection(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 32
    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v1, v6}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->getSocket(Ljava/lang/String;)Ljava/nio/channels/SocketChannel;

    .line 35
    .line 36
    .line 37
    move-result-object v15

    .line 38
    if-eqz v15, :cond_1

    .line 39
    .line 40
    invoke-virtual {v15}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    .line 41
    .line 42
    .line 43
    move-result v16

    .line 44
    if-eqz v16, :cond_0

    .line 45
    .line 46
    invoke-virtual {v15}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 47
    .line 48
    .line 49
    move-result v16

    .line 50
    if-nez v16, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move/from16 v17, v14

    .line 55
    .line 56
    move v14, v13

    .line 57
    move/from16 v13, v17

    .line 58
    .line 59
    goto/16 :goto_9

    .line 60
    .line 61
    :catch_0
    move-exception v0

    .line 62
    move v10, v13

    .line 63
    move v11, v14

    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_0
    :goto_0
    invoke-virtual {v15}, Ljava/nio/channels/SocketChannel;->isConnectionPending()Z

    .line 67
    .line 68
    .line 69
    move-result v16

    .line 70
    if-nez v16, :cond_1

    .line 71
    .line 72
    invoke-direct {v1, v6, v14}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->removeSocket(Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    const/4 v15, 0x0

    .line 76
    :cond_1
    if-nez v15, :cond_5

    .line 77
    .line 78
    if-nez v15, :cond_3

    .line 79
    .line 80
    :try_start_2
    sget-object v15, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 81
    .line 82
    invoke-interface {v15, v12}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    if-eqz v15, :cond_2

    .line 87
    .line 88
    sget-object v15, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 89
    .line 90
    new-instance v12, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v12, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    invoke-interface {v15, v12}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget-object v12, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 106
    .line 107
    new-instance v15, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v12, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    move v14, v13

    .line 125
    goto/16 :goto_9

    .line 126
    .line 127
    :catch_1
    move-exception v0

    .line 128
    move v10, v13

    .line 129
    :goto_1
    move v11, v10

    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :cond_2
    :goto_2
    :try_start_3
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->messageProcessor:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 133
    .line 134
    new-instance v12, Ljava/net/InetSocketAddress;

    .line 135
    .line 136
    invoke-direct {v12, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 137
    .line 138
    .line 139
    iget-object v15, v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->messageProcessor:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 140
    .line 141
    iget-object v15, v15, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 142
    .line 143
    iget v15, v15, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->connTimeout:I

    .line 144
    .line 145
    invoke-virtual {v0, v12, v2, v15}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->connect(Ljava/net/InetSocketAddress;Ljava/net/InetAddress;I)Ljava/nio/channels/SocketChannel;

    .line 146
    .line 147
    .line 148
    move-result-object v15
    :try_end_3
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 149
    :try_start_4
    invoke-virtual {v1, v6, v15}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->putSocket(Ljava/lang/String;Ljava/nio/channels/SocketChannel;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    move v14, v13

    .line 153
    goto :goto_3

    .line 154
    :catch_2
    move-exception v0

    .line 155
    sget-object v12, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 156
    .line 157
    invoke-interface {v12, v11}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 158
    .line 159
    .line 160
    move-result v12
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 161
    const-string v15, " "

    .line 162
    .line 163
    if-eqz v12, :cond_4

    .line 164
    .line 165
    :try_start_5
    sget-object v12, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 166
    .line 167
    new-instance v11, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-interface {v12, v10}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :cond_4
    invoke-direct {v1, v6, v14}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->removeSocket(Ljava/lang/String;Z)V

    .line 195
    .line 196
    .line 197
    new-instance v10, Ljava/net/SocketException;

    .line 198
    .line 199
    new-instance v11, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v0, " Problem connecting "

    .line 232
    .line 233
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-direct {v10, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v10
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 259
    :cond_5
    :goto_3
    if-eqz v14, :cond_6

    .line 260
    .line 261
    invoke-direct {v1, v6, v13}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->removeSocket(Ljava/lang/String;Z)V

    .line 262
    .line 263
    .line 264
    :cond_6
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 265
    .line 266
    invoke-virtual {v0, v6}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    return-object v15

    .line 270
    :catchall_2
    move-exception v0

    .line 271
    move v13, v14

    .line 272
    goto/16 :goto_9

    .line 273
    .line 274
    :catch_3
    move-exception v0

    .line 275
    move v10, v14

    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :goto_4
    :try_start_6
    sget-object v12, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 279
    .line 280
    const/16 v15, 0x10

    .line 281
    .line 282
    invoke-interface {v12, v15}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 283
    .line 284
    .line 285
    move-result v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 286
    const-string v15, " port = "

    .line 287
    .line 288
    if-eqz v12, :cond_7

    .line 289
    .line 290
    :try_start_7
    sget-object v12, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 291
    .line 292
    new-instance v13, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v13, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v9, " retry "

    .line 311
    .line 312
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    invoke-interface {v12, v9}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :catchall_3
    move-exception v0

    .line 327
    :goto_5
    move v14, v10

    .line 328
    move v13, v11

    .line 329
    goto/16 :goto_9

    .line 330
    .line 331
    :cond_7
    :goto_6
    invoke-direct {v1, v6, v14}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->removeSocket(Ljava/lang/String;Z)V

    .line 332
    .line 333
    .line 334
    if-nez v5, :cond_f

    .line 335
    .line 336
    if-gtz v4, :cond_8

    .line 337
    .line 338
    const/16 v0, 0x13c4

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_8
    move v0, v4

    .line 342
    :goto_7
    invoke-static {v3, v0}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 346
    :try_start_8
    invoke-virtual {v1, v4}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->getSocket(Ljava/lang/String;)Ljava/nio/channels/SocketChannel;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    if-eqz v5, :cond_9

    .line 351
    .line 352
    invoke-virtual {v5}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    .line 353
    .line 354
    .line 355
    move-result v6

    .line 356
    if-eqz v6, :cond_9

    .line 357
    .line 358
    invoke-virtual {v5}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    if-nez v6, :cond_b

    .line 363
    .line 364
    goto :goto_8

    .line 365
    :catchall_4
    move-exception v0

    .line 366
    move-object v6, v4

    .line 367
    goto :goto_5

    .line 368
    :cond_9
    :goto_8
    invoke-direct {v1, v4, v14}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->removeSocket(Ljava/lang/String;Z)V

    .line 369
    .line 370
    .line 371
    sget-object v5, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 372
    .line 373
    const/16 v6, 0x20

    .line 374
    .line 375
    invoke-interface {v5, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-eqz v5, :cond_a

    .line 380
    .line 381
    sget-object v5, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 382
    .line 383
    new-instance v6, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    invoke-interface {v5, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    :cond_a
    iget-object v5, v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->messageProcessor:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 405
    .line 406
    new-instance v6, Ljava/net/InetSocketAddress;

    .line 407
    .line 408
    invoke-direct {v6, v3, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 409
    .line 410
    .line 411
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->messageProcessor:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 412
    .line 413
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 414
    .line 415
    iget v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->connTimeout:I

    .line 416
    .line 417
    invoke-virtual {v5, v6, v2, v0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->connect(Ljava/net/InetSocketAddress;Ljava/net/InetAddress;I)Ljava/nio/channels/SocketChannel;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    invoke-virtual {v1, v4, v5}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->putSocket(Ljava/lang/String;Ljava/nio/channels/SocketChannel;)V

    .line 422
    .line 423
    .line 424
    :cond_b
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 425
    .line 426
    const/16 v6, 0x20

    .line 427
    .line 428
    invoke-interface {v0, v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-eqz v0, :cond_c

    .line 433
    .line 434
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 435
    .line 436
    new-instance v2, Ljava/lang/StringBuilder;

    .line 437
    .line 438
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 449
    .line 450
    .line 451
    :cond_c
    if-eqz v10, :cond_e

    .line 452
    .line 453
    if-eqz v11, :cond_d

    .line 454
    .line 455
    const/4 v2, 0x1

    .line 456
    invoke-direct {v1, v4, v2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->removeSocket(Ljava/lang/String;Z)V

    .line 457
    .line 458
    .line 459
    :cond_d
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 460
    .line 461
    invoke-virtual {v0, v4}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    :cond_e
    return-object v5

    .line 465
    :cond_f
    :try_start_9
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 466
    .line 467
    const-string v3, "IOException occured at "

    .line 468
    .line 469
    invoke-interface {v2, v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 470
    .line 471
    .line 472
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 473
    :goto_9
    if-eqz v14, :cond_11

    .line 474
    .line 475
    if-eqz v13, :cond_10

    .line 476
    .line 477
    const/4 v2, 0x1

    .line 478
    invoke-direct {v1, v6, v2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->removeSocket(Ljava/lang/String;Z)V

    .line 479
    .line 480
    .line 481
    :cond_10
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 482
    .line 483
    invoke-virtual {v1, v6}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :cond_11
    throw v0
.end method

.method private removeSocket(Ljava/lang/String;Z)V
    .locals 10

    .line 1
    const-string v0, "removed Semaphore for key "

    .line 2
    .line 3
    const-string v1, "removed Socket for key "

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 9
    .line 10
    invoke-virtual {v4, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->enterIOCriticalSection(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    :try_start_1
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {v5, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Ljava/nio/channels/SocketChannel;

    .line 21
    .line 22
    sget-object v6, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 23
    .line 24
    invoke-interface {v6, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 25
    .line 26
    .line 27
    move-result v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    const-string v7, ", removed:"

    .line 29
    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    move v6, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v6, v3

    .line 37
    :goto_0
    :try_start_2
    sget-object v8, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 38
    .line 39
    new-instance v9, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v8, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p2

    .line 62
    move v3, v4

    .line 63
    goto :goto_3

    .line 64
    :catch_0
    move-exception p2

    .line 65
    move v3, v4

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    :goto_1
    if-eqz p2, :cond_3

    .line 68
    .line 69
    iget-object p2, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->remove(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object p2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 75
    .line 76
    invoke-interface {p2, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_3

    .line 81
    .line 82
    if-eqz v5, :cond_2

    .line 83
    .line 84
    move v3, v4

    .line 85
    :cond_2
    sget-object p2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 86
    .line 87
    new-instance v1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-interface {p2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    .line 107
    .line 108
    :cond_3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :catchall_1
    move-exception p2

    .line 115
    goto :goto_3

    .line 116
    :catch_1
    move-exception p2

    .line 117
    :goto_2
    :try_start_3
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 118
    .line 119
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 126
    .line 127
    const-string v1, "Failed on putting socket"

    .line 128
    .line 129
    invoke-interface {v0, v1, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 130
    .line 131
    .line 132
    :cond_4
    if-eqz v3, :cond_5

    .line 133
    .line 134
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 135
    .line 136
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    return-void

    .line 140
    :goto_3
    if-eqz v3, :cond_6

    .line 141
    .line 142
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_6
    throw p2
.end method

.method private writeChunks(Ljava/nio/channels/SocketChannel;[BI)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->messageProcessor:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->send(Ljava/nio/channels/SocketChannel;[B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public closeAll()V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

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
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

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
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

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
    check-cast v0, Ljava/nio/channels/SocketChannel;

    .line 58
    .line 59
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
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

.method public createOrReuseSocket(Ljava/net/InetAddress;I)Ljava/nio/channels/SocketChannel;
    .locals 9

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->stopped:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    invoke-static {p1, p2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    invoke-virtual {p0, v7}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->getSocket(Ljava/lang/String;)Ljava/nio/channels/SocketChannel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/16 v8, 0x20

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    :cond_1
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->isConnectionPending()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 42
    .line 43
    invoke-interface {v2, v8}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 50
    .line 51
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v4, "Channel disconnected "

    .line 54
    .line 55
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v1, v0

    .line 70
    :cond_3
    :goto_0
    if-nez v1, :cond_4

    .line 71
    .line 72
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->messageProcessor:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const/4 v6, 0x0

    .line 79
    move-object v2, p0

    .line 80
    move-object v4, p1

    .line 81
    move v5, p2

    .line 82
    invoke-direct/range {v2 .. v7}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->openOutgoingConnection(Ljava/net/InetAddress;Ljava/net/InetAddress;IZLjava/lang/String;)Ljava/nio/channels/SocketChannel;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_4
    sget-object p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 87
    .line 88
    invoke-interface {p0, v8}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_5

    .line 93
    .line 94
    sget-object p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 95
    .line 96
    new-instance p1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string p2, "Returning socket "

    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p2, " channel = "

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    return-object v1
.end method

.method public getCurrentChannelSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getMessageChannel(Ljava/nio/channels/SocketChannel;)Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 8
    .line 9
    return-object p0
.end method

.method public getSocket(Ljava/lang/String;)Ljava/nio/channels/SocketChannel;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 8
    .line 9
    return-object p0
.end method

.method public putMessageChannel(Ljava/nio/channels/SocketChannel;Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public putSocket(Ljava/lang/String;Ljava/nio/channels/SocketChannel;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->stopped:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 11
    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 21
    .line 22
    const-string v2, "adding socket for key "

    .line 23
    .line 24
    invoke-static {v2, p1, v0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :try_start_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->enterIOCriticalSection(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-virtual {v2, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p2

    .line 46
    goto :goto_1

    .line 47
    :catch_0
    move-exception p2

    .line 48
    :try_start_1
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 49
    .line 50
    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 57
    .line 58
    const-string v2, "Failed on putting socket"

    .line 59
    .line 60
    invoke-interface {v1, v2, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    :cond_2
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_0
    return-void

    .line 71
    :goto_1
    if-eqz v0, :cond_4

    .line 72
    .line 73
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->keyedSemaphore:Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/KeyedSemaphore;->leaveIOCriticalSection(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    throw p2
.end method

.method public removeMessageChannel(Ljava/nio/channels/SocketChannel;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeSocket(Ljava/nio/channels/SocketChannel;)V
    .locals 7

    .line 148
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    const-string v2, " socketChannel = "

    if-eqz v0, :cond_0

    .line 149
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Trying to remove cached socketChannel without key"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 150
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 151
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    .line 152
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 153
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/nio/channels/SocketChannel;

    .line 154
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 155
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 156
    :cond_2
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 157
    sget-object v4, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    invoke-interface {v4, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 158
    sget-object v4, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Removing cached socketChannel without key"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " key = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    :cond_3
    const/4 v4, 0x1

    .line 159
    invoke-direct {p0, v3, v4}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->removeSocket(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public sendBytes(Ljava/net/InetAddress;Ljava/net/InetAddress;ILjava/lang/String;[BZLandroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;)Ljava/nio/channels/SocketChannel;
    .locals 11

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move-object/from16 v7, p7

    .line 4
    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->stopped:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v8, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v8

    .line 15
    :cond_0
    array-length v9, v6

    .line 16
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 17
    .line 18
    const/16 v2, 0x20

    .line 19
    .line 20
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 27
    .line 28
    const-string v2, "sendBytes "

    .line 29
    .line 30
    const-string v4, " inAddr "

    .line 31
    .line 32
    invoke-static {v2, p4, v4}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v4, " port = "

    .line 44
    .line 45
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v4, " length = "

    .line 52
    .line 53
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v4, " retry "

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    move/from16 v4, p6

    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    move/from16 v4, p6

    .line 78
    .line 79
    :goto_0
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 80
    .line 81
    const/16 v2, 0x10

    .line 82
    .line 83
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isLogStackTraceOnMessageSend()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 98
    .line 99
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logStackTrace(I)V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-static/range {p2 .. p3}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {p0, v5}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->getSocket(Ljava/lang/String;)Ljava/nio/channels/SocketChannel;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_4

    .line 123
    .line 124
    :cond_3
    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->isConnectionPending()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-nez v2, :cond_4

    .line 129
    .line 130
    move-object v10, v8

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    move-object v10, v1

    .line 133
    :goto_1
    if-nez v10, :cond_5

    .line 134
    .line 135
    move-object v0, p0

    .line 136
    move-object v1, p1

    .line 137
    move-object v2, p2

    .line 138
    move v3, p3

    .line 139
    invoke-direct/range {v0 .. v5}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->openOutgoingConnection(Ljava/net/InetAddress;Ljava/net/InetAddress;IZLjava/lang/String;)Ljava/nio/channels/SocketChannel;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    iput p3, v7, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 144
    .line 145
    const/4 v1, 0x1

    .line 146
    goto :goto_2

    .line 147
    :cond_5
    const/4 v1, 0x0

    .line 148
    :goto_2
    if-eqz v10, :cond_7

    .line 149
    .line 150
    if-eqz v1, :cond_6

    .line 151
    .line 152
    instance-of v1, v7, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 153
    .line 154
    if-eqz v1, :cond_6

    .line 155
    .line 156
    new-instance v1, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 157
    .line 158
    move-object v4, v7

    .line 159
    check-cast v4, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 160
    .line 161
    invoke-direct {v1, v4, v10}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;-><init>(Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;Ljava/nio/channels/SocketChannel;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v1}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->setHandshakeCompletedListener(Ljavax/net/ssl/HandshakeCompletedListener;)V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    invoke-direct {p0, v10, v6, v9}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->writeChunks(Ljava/nio/channels/SocketChannel;[BI)V

    .line 169
    .line 170
    .line 171
    :cond_7
    :goto_3
    if-nez v10, :cond_9

    .line 172
    .line 173
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 174
    .line 175
    const/4 v4, 0x4

    .line 176
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    const-string v4, ":"

    .line 181
    .line 182
    const-string v5, "Could not connect to "

    .line 183
    .line 184
    if-eqz v1, :cond_8

    .line 185
    .line 186
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 187
    .line 188
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 198
    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_8
    invoke-static {v5, p2, v4, p3}, La/ohq;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 221
    .line 222
    .line 223
    return-object v8

    .line 224
    :cond_9
    return-object v10
.end method

.method public stop()V
    .locals 6

    .line 1
    const-string v0, "existing socket in NIOHandler "

    .line 2
    .line 3
    const-string v1, "keys to check for inactivity removal "

    .line 4
    .line 5
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->stopped:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->socketTable:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ljava/util/Map$Entry;

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Ljava/nio/channels/SocketChannel;

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 100
    .line 101
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 102
    .line 103
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_1

    .line 108
    .line 109
    sget-object v2, Landroid/gov/nist/javax/sip/stack/NIOHandler;->logger:Landroid/gov/nist/core/StackLogger;

    .line 110
    .line 111
    new-instance v4, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v5, "stop() : Removing socket "

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v5, v0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->key:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v5, " socketChannel = "

    .line 127
    .line 128
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->close()V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NIOHandler;->channelMap:Ljava/util/HashMap;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    goto :goto_0

    .line 160
    :catch_0
    :cond_2
    return-void
.end method
