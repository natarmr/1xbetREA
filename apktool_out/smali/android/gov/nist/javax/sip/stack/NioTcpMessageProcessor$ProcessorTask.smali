.class Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProcessorTask"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accept(Ljava/nio/channels/SelectionKey;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/nio/channels/ServerSocketChannel;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/nio/channels/ServerSocketChannel;->accept()Ljava/nio/channels/SocketChannel;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Ljava/nio/channels/SelectableChannel;->configureBlocking(Z)Ljava/nio/channels/SelectableChannel;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/16 v1, 0x20

    .line 20
    .line 21
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v3, "got a new connection! "

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 49
    .line 50
    invoke-virtual {v0, v0, p1}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->createMessageChannel(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;Ljava/nio/channels/SocketChannel;)Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "Adding to selector "

    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 85
    .line 86
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 87
    .line 88
    const/4 v0, 0x1

    .line 89
    invoke-virtual {p1, p0, v0}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public connect(Ljava/nio/channels/SelectionKey;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/nio/channels/SocketChannel;

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 8
    .line 9
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->nioHandler:Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->getMessageChannel(Ljava/nio/channels/SocketChannel;)Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const-string v4, " socket "

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v5, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v6, "Attempting Connect on  "

    .line 36
    .line 37
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v2, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    if-nez v1, :cond_2

    .line 57
    .line 58
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, "Dead socketChannel"

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v2, ":"

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/net/Socket;->getPort()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->finishConnect()Z

    .line 124
    .line 125
    .line 126
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_3

    .line 135
    .line 136
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const-string v4, "Connected Succesfully"

    .line 141
    .line 142
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :catch_0
    move-exception v2

    .line 147
    goto :goto_2

    .line 148
    :cond_3
    :goto_0
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 149
    .line 150
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 151
    .line 152
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSelfRoutingThreadpoolExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-eqz v2, :cond_4

    .line 157
    .line 158
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 159
    .line 160
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 161
    .line 162
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSelfRoutingThreadpoolExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    new-instance v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$1;

    .line 167
    .line 168
    invoke-direct {v4, p0, v1}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$1;-><init>(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_4
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->triggerConnectSuccess()V

    .line 176
    .line 177
    .line 178
    :goto_1
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 179
    .line 180
    invoke-static {v2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$100(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)Ljava/util/Map;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-eqz v2, :cond_8

    .line 189
    .line 190
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 191
    .line 192
    invoke-static {v2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$100(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)Ljava/util/Map;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Ljava/util/Queue;

    .line 201
    .line 202
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-lez v2, :cond_8

    .line 207
    .line 208
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const-string v4, "Pending Data Available, setting WRITE opts."

    .line 223
    .line 224
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :cond_5
    const/4 v2, 0x4

    .line 228
    invoke-virtual {p1, v2}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :goto_2
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-interface {v4, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_6

    .line 241
    .line 242
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    const-string v4, "Cant connect "

    .line 247
    .line 248
    invoke-interface {v3, v4, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 249
    .line 250
    .line 251
    :cond_6
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 252
    .line 253
    .line 254
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 255
    .line 256
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 257
    .line 258
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSelfRoutingThreadpoolExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 263
    .line 264
    if-eqz p1, :cond_7

    .line 265
    .line 266
    iget-object p1, v2, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 267
    .line 268
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSelfRoutingThreadpoolExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    new-instance v2, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;

    .line 273
    .line 274
    invoke-direct {v2, p0, v1, v0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;-><init>(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;Ljava/nio/channels/SocketChannel;)V

    .line 275
    .line 276
    .line 277
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 278
    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_7
    invoke-static {v2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$100(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)Ljava/util/Map;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    check-cast p0, Ljava/util/Queue;

    .line 290
    .line 291
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->triggerConnectFailure(Ljava/util/Queue;)V

    .line 292
    .line 293
    .line 294
    :cond_8
    :goto_3
    return-void
.end method

.method public read(Ljava/nio/channels/SelectionKey;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/nio/channels/SocketChannel;

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 8
    .line 9
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->nioHandler:Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->getMessageChannel(Ljava/nio/channels/SocketChannel;)Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const-string v4, " socket "

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v5, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v6, "Got something on nioTcpMessageChannel "

    .line 36
    .line 37
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v2, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    if-nez v1, :cond_2

    .line 57
    .line 58
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v3, "Dead socketChannel"

    .line 75
    .line 76
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v3, ":"

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v3}, Ljava/net/Socket;->getPort()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 120
    .line 121
    .line 122
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 123
    .line 124
    invoke-static {p0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$100(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_2
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->readChannel()V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public run()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    :goto_0
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/16 v3, 0x40

    .line 8
    .line 9
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v4, "Selector thread cycle begin..."

    .line 20
    .line 21
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logTrace(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    move v2, v0

    .line 25
    :cond_2
    :goto_1
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 26
    .line 27
    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->changeRequests:Ljava/util/Queue;

    .line 28
    .line 29
    invoke-interface {v4}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/16 v5, 0x20

    .line 34
    .line 35
    if-eqz v4, :cond_8

    .line 36
    .line 37
    const/16 v4, 0x2710

    .line 38
    .line 39
    if-ge v2, v4, :cond_8

    .line 40
    .line 41
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 42
    .line 43
    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->changeRequests:Ljava/util/Queue;

    .line 44
    .line 45
    invoke-interface {v4}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    const-string v7, " selector = "

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    new-instance v8, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v9, "ChangeRequest "

    .line 72
    .line 73
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v9, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 83
    .line 84
    iget-object v9, v9, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 85
    .line 86
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-interface {v6, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    :try_start_0
    iget v6, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;->type:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    const-string v8, " blocking="

    .line 99
    .line 100
    const/4 v9, 0x1

    .line 101
    if-eq v6, v9, :cond_6

    .line 102
    .line 103
    const/4 v9, 0x2

    .line 104
    if-eq v6, v9, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    :try_start_1
    iget-object v6, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;->socket:Ljava/nio/channels/SocketChannel;

    .line 108
    .line 109
    iget-object v9, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 110
    .line 111
    iget-object v9, v9, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 112
    .line 113
    invoke-virtual {v6, v9}, Ljava/nio/channels/SelectableChannel;->keyFor(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    if-eqz v6, :cond_2

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-nez v9, :cond_5

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_5
    iget v9, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;->ops:I

    .line 127
    .line 128
    invoke-virtual {v6, v9}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    invoke-interface {v9, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_2

    .line 140
    .line 141
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    new-instance v9, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v10, "Change opts "

    .line 151
    .line 152
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    iget-object v7, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 162
    .line 163
    iget-object v7, v7, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 164
    .line 165
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v7, " key = "

    .line 169
    .line 170
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;->socket:Ljava/nio/channels/SocketChannel;

    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/nio/channels/SelectableChannel;->isBlocking()Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-interface {v5, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 193
    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :catch_0
    move-exception v4

    .line 198
    goto :goto_2

    .line 199
    :cond_6
    :try_start_2
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-eqz v5, :cond_7

    .line 208
    .line 209
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    new-instance v6, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const-string v9, "NIO register "

    .line 219
    .line 220
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    iget-object v7, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 230
    .line 231
    iget-object v7, v7, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 232
    .line 233
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    iget-object v7, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;->socket:Ljava/nio/channels/SocketChannel;

    .line 240
    .line 241
    invoke-virtual {v7}, Ljava/nio/channels/SelectableChannel;->isBlocking()Z

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-interface {v5, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    :cond_7
    iget-object v5, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;->socket:Ljava/nio/channels/SocketChannel;

    .line 256
    .line 257
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 258
    .line 259
    iget-object v6, v6, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 260
    .line 261
    iget v7, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;->ops:I

    .line 262
    .line 263
    invoke-virtual {v5, v6, v7}, Ljava/nio/channels/SelectableChannel;->register(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;
    :try_end_2
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 264
    .line 265
    .line 266
    goto/16 :goto_1

    .line 267
    .line 268
    :catch_1
    :try_start_3
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    new-instance v6, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v7, "Socket closed before register ops "

    .line 278
    .line 279
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ChangeRequest;->socket:Ljava/nio/channels/SocketChannel;

    .line 283
    .line 284
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-interface {v5, v4}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 292
    .line 293
    .line 294
    goto/16 :goto_1

    .line 295
    .line 296
    :goto_2
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    const-string v6, "Problem setting changes"

    .line 301
    .line 302
    invoke-interface {v5, v6, v4}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_1

    .line 306
    .line 307
    :cond_8
    const/16 v2, 0x10

    .line 308
    .line 309
    :try_start_4
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-interface {v4, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-eqz v4, :cond_9

    .line 318
    .line 319
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    const-string v6, "Before select"

    .line 324
    .line 325
    invoke-interface {v4, v6}, Landroid/gov/nist/core/StackLogger;->logTrace(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :cond_9
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 329
    .line 330
    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 331
    .line 332
    invoke-virtual {v4}, Ljava/nio/channels/Selector;->isOpen()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-nez v4, :cond_a

    .line 337
    .line 338
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-interface {v3, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    if-eqz v3, :cond_17

    .line 347
    .line 348
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    const-string v4, "Selector is closed "

    .line 353
    .line 354
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_8

    .line 358
    .line 359
    :cond_a
    iget-object v4, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 360
    .line 361
    iget-object v4, v4, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/nio/channels/Selector;->select()I

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-interface {v4, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-eqz v3, :cond_b

    .line 376
    .line 377
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    new-instance v4, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 384
    .line 385
    .line 386
    const-string v6, "After select:"

    .line 387
    .line 388
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    const-string v6, ".CRs:"

    .line 395
    .line 396
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 400
    .line 401
    iget-object v6, v6, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->changeRequests:Ljava/util/Queue;

    .line 402
    .line 403
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logTrace(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/nio/channels/CancelledKeyException; {:try_start_4 .. :try_end_4} :catch_2

    .line 415
    .line 416
    .line 417
    goto :goto_3

    .line 418
    :catch_2
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-interface {v3, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_b

    .line 427
    .line 428
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    const-string v4, "Looks like remote side closed a connection"

    .line 433
    .line 434
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    :cond_b
    :goto_3
    if-gtz v1, :cond_c

    .line 438
    .line 439
    :try_start_5
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-interface {v3, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    if-eqz v3, :cond_0

    .line 448
    .line 449
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    const-string v4, "null selectedKeys "

    .line 454
    .line 455
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :catch_3
    move-exception v2

    .line 461
    goto/16 :goto_7

    .line 462
    .line 463
    :cond_c
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 464
    .line 465
    iget-object v3, v3, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->selector:Ljava/nio/channels/Selector;

    .line 466
    .line 467
    invoke-virtual {v3}, Ljava/nio/channels/Selector;->selectedKeys()Ljava/util/Set;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    :cond_d
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    if-eqz v4, :cond_0

    .line 480
    .line 481
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    check-cast v4, Ljava/nio/channels/SelectionKey;
    :try_end_5
    .catch Ljava/nio/channels/ClosedSelectorException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 486
    .line 487
    :try_start_6
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 488
    .line 489
    .line 490
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 491
    .line 492
    .line 493
    move-result-object v6

    .line 494
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    if-eqz v6, :cond_e

    .line 499
    .line 500
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 501
    .line 502
    .line 503
    move-result-object v6

    .line 504
    new-instance v7, Ljava/lang/StringBuilder;

    .line 505
    .line 506
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 507
    .line 508
    .line 509
    const-string v8, "We got selkey "

    .line 510
    .line 511
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    goto :goto_5

    .line 525
    :catch_4
    move-exception v4

    .line 526
    goto/16 :goto_6

    .line 527
    .line 528
    :cond_e
    :goto_5
    invoke-virtual {v4}, Ljava/nio/channels/SelectionKey;->isValid()Z

    .line 529
    .line 530
    .line 531
    move-result v6

    .line 532
    if-nez v6, :cond_f

    .line 533
    .line 534
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 539
    .line 540
    .line 541
    move-result v6

    .line 542
    if-eqz v6, :cond_d

    .line 543
    .line 544
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 545
    .line 546
    .line 547
    move-result-object v6

    .line 548
    new-instance v7, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 551
    .line 552
    .line 553
    const-string v8, "Invalid key found "

    .line 554
    .line 555
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-interface {v6, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    goto :goto_4

    .line 569
    :cond_f
    invoke-virtual {v4}, Ljava/nio/channels/SelectionKey;->isAcceptable()Z

    .line 570
    .line 571
    .line 572
    move-result v6

    .line 573
    if-eqz v6, :cond_11

    .line 574
    .line 575
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 576
    .line 577
    .line 578
    move-result-object v6

    .line 579
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 580
    .line 581
    .line 582
    move-result v6

    .line 583
    if-eqz v6, :cond_10

    .line 584
    .line 585
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 586
    .line 587
    .line 588
    move-result-object v6

    .line 589
    new-instance v7, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    const-string v8, "Accept "

    .line 595
    .line 596
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v7

    .line 606
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    :cond_10
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->accept(Ljava/nio/channels/SelectionKey;)V

    .line 610
    .line 611
    .line 612
    goto/16 :goto_4

    .line 613
    .line 614
    :cond_11
    invoke-virtual {v4}, Ljava/nio/channels/SelectionKey;->isReadable()Z

    .line 615
    .line 616
    .line 617
    move-result v6

    .line 618
    if-eqz v6, :cond_13

    .line 619
    .line 620
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 625
    .line 626
    .line 627
    move-result v6

    .line 628
    if-eqz v6, :cond_12

    .line 629
    .line 630
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    new-instance v7, Ljava/lang/StringBuilder;

    .line 635
    .line 636
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 637
    .line 638
    .line 639
    const-string v8, "Read "

    .line 640
    .line 641
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v7

    .line 651
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    :cond_12
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->read(Ljava/nio/channels/SelectionKey;)V

    .line 655
    .line 656
    .line 657
    goto/16 :goto_4

    .line 658
    .line 659
    :cond_13
    invoke-virtual {v4}, Ljava/nio/channels/SelectionKey;->isWritable()Z

    .line 660
    .line 661
    .line 662
    move-result v6

    .line 663
    if-eqz v6, :cond_15

    .line 664
    .line 665
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 666
    .line 667
    .line 668
    move-result-object v6

    .line 669
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 670
    .line 671
    .line 672
    move-result v6

    .line 673
    if-eqz v6, :cond_14

    .line 674
    .line 675
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    new-instance v7, Ljava/lang/StringBuilder;

    .line 680
    .line 681
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 682
    .line 683
    .line 684
    const-string v8, "Write "

    .line 685
    .line 686
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v7

    .line 696
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    :cond_14
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->write(Ljava/nio/channels/SelectionKey;)V

    .line 700
    .line 701
    .line 702
    goto/16 :goto_4

    .line 703
    .line 704
    :cond_15
    invoke-virtual {v4}, Ljava/nio/channels/SelectionKey;->isConnectable()Z

    .line 705
    .line 706
    .line 707
    move-result v6

    .line 708
    if-eqz v6, :cond_d

    .line 709
    .line 710
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 711
    .line 712
    .line 713
    move-result-object v6

    .line 714
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 715
    .line 716
    .line 717
    move-result v6

    .line 718
    if-eqz v6, :cond_16

    .line 719
    .line 720
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 721
    .line 722
    .line 723
    move-result-object v6

    .line 724
    new-instance v7, Ljava/lang/StringBuilder;

    .line 725
    .line 726
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 727
    .line 728
    .line 729
    const-string v8, "Connect "

    .line 730
    .line 731
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v7

    .line 741
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    :cond_16
    invoke-virtual {p0, v4}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->connect(Ljava/nio/channels/SelectionKey;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 745
    .line 746
    .line 747
    goto/16 :goto_4

    .line 748
    .line 749
    :goto_6
    :try_start_7
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 750
    .line 751
    .line 752
    move-result-object v6

    .line 753
    const-string v7, "Problem processing selection key event"

    .line 754
    .line 755
    invoke-interface {v6, v7, v4}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_7
    .catch Ljava/nio/channels/ClosedSelectorException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 756
    .line 757
    .line 758
    goto/16 :goto_4

    .line 759
    .line 760
    :goto_7
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    const-string v4, "Problem in the selector loop"

    .line 765
    .line 766
    invoke-interface {v3, v4, v2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 767
    .line 768
    .line 769
    goto/16 :goto_0

    .line 770
    .line 771
    :catch_5
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 772
    .line 773
    .line 774
    move-result-object p0

    .line 775
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 776
    .line 777
    .line 778
    move-result p0

    .line 779
    if-eqz p0, :cond_17

    .line 780
    .line 781
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 782
    .line 783
    .line 784
    move-result-object p0

    .line 785
    const-string v0, "Selector is closed"

    .line 786
    .line 787
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    :cond_17
    :goto_8
    return-void

    .line 791
    :catch_6
    move-exception p0

    .line 792
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    const-string v1, "problem in select"

    .line 797
    .line 798
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 799
    .line 800
    .line 801
    return-void
.end method

.method public write(Ljava/nio/channels/SelectionKey;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->channel()Ljava/nio/channels/SelectableChannel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/nio/channels/SocketChannel;

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 8
    .line 9
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->nioHandler:Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->getMessageChannel(Ljava/nio/channels/SocketChannel;)Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const-string v4, " socket "

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v5, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v6, "Need to write something on nioTcpMessageChannel "

    .line 36
    .line 37
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v2, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    const-string v2, ":"

    .line 57
    .line 58
    const-string v5, "Dead socketChannel"

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v1, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    new-instance v3, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Ljava/net/Socket;->getPort()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 120
    .line 121
    invoke-static {p0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$100(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/nio/channels/SelectionKey;->cancel()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_2
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 133
    .line 134
    invoke-static {v6}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$100(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    check-cast v6, Ljava/util/Queue;

    .line 143
    .line 144
    const-string v7, "We wrote away all data. Setting READ interest. Queue is emtpy now size ="

    .line 145
    .line 146
    const/4 v8, 0x1

    .line 147
    if-eqz v6, :cond_b

    .line 148
    .line 149
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    if-eqz v9, :cond_3

    .line 154
    .line 155
    goto/16 :goto_2

    .line 156
    .line 157
    :cond_3
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    invoke-interface {v9, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-eqz v9, :cond_4

    .line 166
    .line 167
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    new-instance v10, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    const-string v11, "Queued items for writing "

    .line 174
    .line 175
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_4
    const/4 v9, 0x0

    .line 193
    :goto_0
    invoke-interface {v6}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    if-eqz v10, :cond_7

    .line 198
    .line 199
    const/16 v10, 0x2710

    .line 200
    .line 201
    if-ge v9, v10, :cond_7

    .line 202
    .line 203
    invoke-interface {v6}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    check-cast v10, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$PendingData;

    .line 208
    .line 209
    iget-object v10, v10, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$PendingData;->buffer:Ljava/nio/ByteBuffer;

    .line 210
    .line 211
    :try_start_0
    invoke-virtual {v0, v10}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10}, Ljava/nio/Buffer;->remaining()I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    if-lez v10, :cond_5

    .line 219
    .line 220
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-interface {p0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-eqz p0, :cond_7

    .line 229
    .line 230
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    const-string v1, "Socket buffer filled and more is remaining"

    .line 237
    .line 238
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v1, " remain = "

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_5
    invoke-interface {v6}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    add-int/lit8 v9, v9, 0x1

    .line 268
    .line 269
    goto :goto_0

    .line 270
    :catch_0
    move-exception p1

    .line 271
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-interface {v7, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_6

    .line 280
    .line 281
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    new-instance v7, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    invoke-virtual {v4}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-virtual {v2}, Ljava/net/Socket;->getPort()I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    const-string v2, " : error message "

    .line 322
    .line 323
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-interface {v3, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :cond_6
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->close()V

    .line 341
    .line 342
    .line 343
    invoke-interface {v6}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 347
    .line 348
    invoke-static {p0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$100(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)Ljava/util/Map;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :cond_7
    :goto_1
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    if-eqz p0, :cond_9

    .line 361
    .line 362
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-interface {p0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 367
    .line 368
    .line 369
    move-result p0

    .line 370
    if-eqz p0, :cond_8

    .line 371
    .line 372
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    new-instance v0, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    :cond_8
    invoke-virtual {p1, v8}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 396
    .line 397
    .line 398
    :cond_9
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    invoke-interface {p0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 403
    .line 404
    .line 405
    move-result p0

    .line 406
    if-eqz p0, :cond_a

    .line 407
    .line 408
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    const-string p1, "Done writing"

    .line 413
    .line 414
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    :cond_a
    return-void

    .line 418
    :cond_b
    :goto_2
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    invoke-interface {p0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 423
    .line 424
    .line 425
    move-result p0

    .line 426
    if-eqz p0, :cond_c

    .line 427
    .line 428
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    const-string v0, "The queue was empty on write."

    .line 433
    .line 434
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    :cond_c
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    invoke-interface {p0, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 442
    .line 443
    .line 444
    move-result p0

    .line 445
    if-eqz p0, :cond_d

    .line 446
    .line 447
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    new-instance v0, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    :cond_d
    invoke-virtual {p1, v8}, Ljava/nio/channels/SelectionKey;->interestOps(I)Ljava/nio/channels/SelectionKey;

    .line 471
    .line 472
    .line 473
    return-void
.end method
