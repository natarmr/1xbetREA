.class public Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;
.super Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;
.source "SourceFile"


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field client:Z

.field private codec:Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

.field httpClientRequestSent:Ljava/util/concurrent/atomic/AtomicBoolean;

.field httpHostHeader:Ljava/lang/String;

.field httpInput:Ljava/lang/String;

.field httpLocation:Ljava/lang/String;

.field httpMethod:Ljava/lang/String;

.field readingHttp:Z

.field private stack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;Ljava/nio/channels/SocketChannel;)V
    .locals 2

    .line 1
    invoke-direct {p0, p2, p3}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;-><init>(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;Ljava/nio/channels/SocketChannel;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1, v1}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;-><init>(ZZ)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->codec:Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    .line 11
    .line 12
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->readingHttp:Z

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpInput:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpClientRequestSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->stack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 27
    .line 28
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->myClientInputStream:Ljava/io/InputStream;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;-><init>(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)V

    .line 42
    new-instance p1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p2}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;-><init>(ZZ)V

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->codec:Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    .line 43
    iput-boolean p2, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->readingHttp:Z

    .line 44
    const-string p1, ""

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpInput:Ljava/lang/String;

    .line 45
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p4, 0x0

    invoke-direct {p1, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpClientRequestSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    iput-boolean p2, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->client:Z

    .line 47
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->stack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 48
    new-instance p1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    invoke-direct {p1, p4, p2}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;-><init>(ZZ)V

    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->codec:Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    return-void
.end method

.method public static wrapBufferIntoWebSocketFrame([BZ)[B
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-static {p0, v0, v1, p1}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->encode([BIZZ)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method


# virtual methods
.method public addBytes([B)V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->readingHttp:Z

    .line 7
    .line 8
    if-eqz v1, :cond_6

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v1

    .line 13
    :goto_0
    array-length v4, p1

    .line 14
    add-int/lit8 v4, v4, -0x3

    .line 15
    .line 16
    if-ge v3, v4, :cond_2

    .line 17
    .line 18
    aget-byte v4, p1, v3

    .line 19
    .line 20
    const/16 v5, 0xd

    .line 21
    .line 22
    if-ne v4, v5, :cond_1

    .line 23
    .line 24
    add-int/lit8 v4, v3, 0x1

    .line 25
    .line 26
    aget-byte v4, p1, v4

    .line 27
    .line 28
    const/16 v6, 0xa

    .line 29
    .line 30
    if-ne v4, v6, :cond_1

    .line 31
    .line 32
    add-int/lit8 v4, v3, 0x2

    .line 33
    .line 34
    aget-byte v4, p1, v4

    .line 35
    .line 36
    if-ne v4, v5, :cond_1

    .line 37
    .line 38
    add-int/lit8 v4, v3, 0x3

    .line 39
    .line 40
    aget-byte v4, p1, v4

    .line 41
    .line 42
    if-ne v4, v6, :cond_1

    .line 43
    .line 44
    add-int/lit8 v2, v3, 0x4

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    array-length v4, p1

    .line 51
    sub-int/2addr v4, v3

    .line 52
    add-int/lit8 v4, v4, -0x4

    .line 53
    .line 54
    new-array v5, v4, [B

    .line 55
    .line 56
    move v6, v1

    .line 57
    :goto_1
    if-ge v6, v4, :cond_0

    .line 58
    .line 59
    add-int v7, v2, v6

    .line 60
    .line 61
    aget-byte v7, p1, v7

    .line 62
    .line 63
    aput-byte v7, v5, v6

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    move-object v2, v5

    .line 69
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpInput:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {p1, v3, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpInput:Ljava/lang/String;

    .line 84
    .line 85
    const-string p1, "\r\n"

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    const-string p1, "\n"

    .line 94
    .line 95
    invoke-virtual {v0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    :cond_3
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->readingHttp:Z

    .line 102
    .line 103
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpInput:Ljava/lang/String;

    .line 104
    .line 105
    const-string v3, "HTTP"

    .line 106
    .line 107
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_4

    .line 112
    .line 113
    new-instance p1, Landroid/gov/nist/javax/sip/stack/WebSocketHttpHandshake;

    .line 114
    .line 115
    invoke-direct {p1}, Landroid/gov/nist/javax/sip/stack/WebSocketHttpHandshake;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/stack/WebSocketHttpHandshake;->createHttpResponse(Ljava/lang/String;)[B

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p0, p1, v1}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->sendNonWebSocketMessage([BZ)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    sget-object p1, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 127
    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v1, "HTTP Response. We are websocket client.\n"

    .line 131
    .line 132
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpInput:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_5
    :goto_2
    if-eqz v2, :cond_9

    .line 148
    .line 149
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->addBytes([B)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_6
    if-nez v1, :cond_9

    .line 154
    .line 155
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 156
    .line 157
    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 158
    .line 159
    .line 160
    :goto_3
    iget-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->codec:Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    .line 161
    .line 162
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decode(Ljava/io/InputStream;)[B

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->codec:Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    .line 167
    .line 168
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->isCloseOpcodeReceived()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    sget-object p1, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 175
    .line 176
    const-string v0, "Websocket close, sending polite close response"

    .line 177
    .line 178
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const/4 p1, 0x2

    .line 182
    new-array p1, p1, [B

    .line 183
    .line 184
    fill-array-data p1, :array_0

    .line 185
    .line 186
    .line 187
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 192
    .line 193
    invoke-virtual {p0, p1}, Ljava/nio/channels/SocketChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_7
    if-nez p1, :cond_8

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_8
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->nioParser:Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 201
    .line 202
    invoke-virtual {v1, p1}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->addBytes([B)V

    .line 203
    .line 204
    .line 205
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 206
    .line 207
    new-instance v2, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string v3, "Nio websocket bytes were added "

    .line 210
    .line 211
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    array-length p1, p1

    .line 215
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-interface {v1, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_9
    :goto_4
    return-void

    .line 227
    :array_0
    .array-data 1
        -0x78t
        0x0t
    .end array-data
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->transport:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public onNewSocket([B)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->onNewSocket([B)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->stack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isPatchWebSocketHeaders()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 20
    .line 21
    const-string v1, "Patching WebSocket headers"

    .line 22
    .line 23
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    instance-of v0, p1, Landroid/javax/sip/message/Request;

    .line 27
    .line 28
    const-string v1, "Contact"

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/javax/sip/header/ContactHeader;

    .line 37
    .line 38
    const-string v1, "Record-Route"

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Landroid/javax/sip/header/RecordRouteHeader;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getTopmostViaHeader()Landroid/javax/sip/header/ViaHeader;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/javax/sip/address/SipURI;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->rewriteUri(Landroid/javax/sip/address/SipURI;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-interface {v1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Landroid/javax/sip/address/SipURI;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->rewriteUri(Landroid/javax/sip/address/SipURI;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_0
    invoke-interface {v2}, Landroid/javax/sip/header/ViaHeader;->getHost()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, ".invalid"

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getPeerAddress()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v2, v0}, Landroid/javax/sip/header/ViaHeader;->setHost(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getPeerPort()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-interface {v2, v0}, Landroid/javax/sip/header/ViaHeader;->setPort(I)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-virtual {p1, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Landroid/javax/sip/header/ContactHeader;

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-interface {v0}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Landroid/javax/sip/address/SipURI;

    .line 125
    .line 126
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->rewriteUri(Landroid/javax/sip/address/SipURI;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    :goto_1
    invoke-super {p0, p1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public rewriteUri(Landroid/javax/sip/address/SipURI;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getHost()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ".invalid"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getPeerAddress()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Landroid/javax/sip/address/SipURI;->setHost(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    sget-object v1, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 23
    .line 24
    const-string v2, "Cant parse address"

    .line 25
    .line 26
    invoke-interface {v1, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getPeerPort()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-interface {p1, p0}, Landroid/javax/sip/address/SipURI;->setPort(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/net/InetAddress;I)V
    .locals 3

    .line 1
    instance-of v0, p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->client:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpClientRequestSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/javax/sip/address/SipURI;

    .line 27
    .line 28
    const-string v1, "Host"

    .line 29
    .line 30
    invoke-interface {v0, v1}, Landroid/javax/sip/address/SipURI;->getHeader(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpHostHeader:Ljava/lang/String;

    .line 35
    .line 36
    const-string v1, "Location"

    .line 37
    .line 38
    invoke-interface {v0, v1}, Landroid/javax/sip/address/SipURI;->getHeader(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpLocation:Ljava/lang/String;

    .line 43
    .line 44
    invoke-interface {v0}, Landroid/javax/sip/address/SipURI;->getMethodParam()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpMethod:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpMethod:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, " "

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpLocation:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, " HTTP/1.1\r\nHost: "

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpHostHeader:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, "\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==\r\nSec-WebSocket-Protocol: sip\r\nSec-WebSocket-Version: 13\r\n\r\n"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-super {p0, v0, p2, p3, v2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->sendTCPMessage([BLjava/net/InetAddress;IZ)V

    .line 94
    .line 95
    .line 96
    const-wide/16 v0, 0x96

    .line 97
    .line 98
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catch_0
    move-exception v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 104
    .line 105
    .line 106
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/net/InetAddress;I)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public sendMessage([BLjava/net/InetAddress;IZ)V
    .locals 0

    .line 110
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->sendWrapped([BLjava/net/InetAddress;IZ)V

    return-void
.end method

.method public sendMessage([BZ)V
    .locals 3

    .line 111
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    const/16 v1, 0x20

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "sendMessage isClient  = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " this = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 113
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->lastActivityTimeStamp:J

    .line 114
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    check-cast v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->nioHandler:Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 115
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 116
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    iget v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    invoke-static {v1, v2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->putSocket(Ljava/lang/String;Ljava/nio/channels/SocketChannel;)V

    .line 117
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    iget v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    invoke-virtual {p0, p1, v0, v1, p2}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->sendWrapped([BLjava/net/InetAddress;IZ)V

    return-void
.end method

.method public sendNonWebSocketMessage([BZ)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

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
    sget-object v0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "sendMessage isClient  = "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, " this = "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->lastActivityTimeStamp:J

    .line 43
    .line 44
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 45
    .line 46
    check-cast v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 47
    .line 48
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->nioHandler:Landroid/gov/nist/javax/sip/stack/NIOHandler;

    .line 49
    .line 50
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->isConnected()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->isOpen()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 69
    .line 70
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 71
    .line 72
    invoke-static {v1, v2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->makeKey(Ljava/net/InetAddress;I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->socketChannel:Ljava/nio/channels/SocketChannel;

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/NIOHandler;->putSocket(Ljava/lang/String;Ljava/nio/channels/SocketChannel;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerAddress:Ljava/net/InetAddress;

    .line 82
    .line 83
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->peerPort:I

    .line 84
    .line 85
    invoke-super {p0, p1, v0, v1, p2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->sendTCPMessage([BLjava/net/InetAddress;IZ)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public sendWrapped([BLjava/net/InetAddress;IZ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->client:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->readingHttp:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->httpClientRequestSent:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "null null HTTP/1.1\r\nHost: null \r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==\r\nSec-WebSocket-Protocol: sip\r\nSec-WebSocket-Version: 13\r\n\r\n"

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-super {p0, v0, p2, p3, v2}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->sendTCPMessage([BLjava/net/InetAddress;IZ)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v0, 0x96

    .line 29
    .line 30
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    :cond_0
    :goto_0
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->client:Z

    .line 39
    .line 40
    invoke-static {p1, v0}, Landroid/gov/nist/javax/sip/stack/NioWebSocketMessageChannel;->wrapBufferIntoWebSocketFrame([BZ)[B

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-super {p0, p1, p2, p3, p4}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->sendTCPMessage([BLjava/net/InetAddress;IZ)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
