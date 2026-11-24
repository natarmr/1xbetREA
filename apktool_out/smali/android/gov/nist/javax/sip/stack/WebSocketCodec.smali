.class public Landroid/gov/nist/javax/sip/stack/WebSocketCodec;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final OPCODE_BINARY:B = 0x2t

.field private static final OPCODE_CLOSE:B = 0x8t

.field private static final OPCODE_CONT:B = 0x0t

.field private static final OPCODE_PING:B = 0x9t

.field private static final OPCODE_PONG:B = 0xat

.field private static final OPCODE_TEXT:B = 0x1t

.field private static logger:Landroid/gov/nist/core/StackLogger;

.field private static final trivialMask:[B


# instance fields
.field private final allowExtensions:Z

.field private closeOpcodeReceived:Z

.field private decodeBuffer:[B

.field private fragmentedFramesCount:I

.field private frameFinalFlag:Z

.field private frameOpcode:I

.field private framePayloadLength:J

.field private frameRsv:I

.field private final maskedPayload:Z

.field private maskingKey:[B

.field private payloadStartIndex:I

.field private readIndex:I

.field private totalPacketLength:J

.field private writeIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->trivialMask:[B

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data
.end method

.method public constructor <init>(ZZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->maskingKey:[B

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->payloadStartIndex:I

    .line 11
    .line 12
    const/16 v0, 0x800

    .line 13
    .line 14
    new-array v0, v0, [B

    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 20
    .line 21
    const-wide/16 v0, -0x1

    .line 22
    .line 23
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->totalPacketLength:J

    .line 24
    .line 25
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->maskedPayload:Z

    .line 26
    .line 27
    iput-boolean p2, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->allowExtensions:Z

    .line 28
    .line 29
    return-void
.end method

.method public static applyMask([BII[B)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    sub-int v1, p2, p1

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    add-int v1, p1, v0

    .line 7
    .line 8
    aget-byte v2, p0, v1

    .line 9
    .line 10
    rem-int/lit8 v3, v0, 0x4

    .line 11
    .line 12
    aget-byte v3, p3, v3

    .line 13
    .line 14
    xor-int/2addr v2, v3

    .line 15
    int-to-byte v2, v2

    .line 16
    aput-byte v2, p0, v1

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public static encode([BIZZ)[B
    .locals 1

    const/4 v0, 0x1

    .line 161
    invoke-static {p0, p1, p2, p3, v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->encode([BIZZB)[B

    move-result-object p0

    return-object p0
.end method

.method public static encode([BIZZB)[B
    .locals 8

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    int-to-long v1, v1

    .line 8
    sget-object v3, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    const/16 v4, 0x20

    .line 11
    .line 12
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    sget-object v3, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 19
    .line 20
    new-instance v4, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v5, "Encoding WebSocket Frame opCode="

    .line 23
    .line 24
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v5, " length="

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    const/16 v3, 0x80

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    move p2, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move p2, v4

    .line 53
    :goto_0
    const/16 v5, 0x8

    .line 54
    .line 55
    rem-int/2addr p1, v5

    .line 56
    shl-int/lit8 p1, p1, 0x4

    .line 57
    .line 58
    or-int/2addr p1, p2

    .line 59
    rem-int/2addr p4, v3

    .line 60
    or-int/2addr p1, p4

    .line 61
    const-wide/16 v6, 0x7d

    .line 62
    .line 63
    cmp-long p2, v1, v6

    .line 64
    .line 65
    if-gtz p2, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 68
    .line 69
    .line 70
    long-to-int p1, v1

    .line 71
    int-to-byte p1, p1

    .line 72
    if-eqz p3, :cond_2

    .line 73
    .line 74
    or-int/2addr p1, v3

    .line 75
    :cond_2
    int-to-byte p1, p1

    .line 76
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_3
    const-wide/32 v6, 0xffff

    .line 81
    .line 82
    .line 83
    cmp-long p2, v1, v6

    .line 84
    .line 85
    if-gtz p2, :cond_5

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 88
    .line 89
    .line 90
    if-eqz p3, :cond_4

    .line 91
    .line 92
    const/16 p1, 0xfe

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const/16 p1, 0x7e

    .line 96
    .line 97
    :goto_1
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 98
    .line 99
    .line 100
    ushr-long p1, v1, v5

    .line 101
    .line 102
    long-to-int p1, p1

    .line 103
    int-to-byte p1, p1

    .line 104
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 105
    .line 106
    .line 107
    long-to-int p1, v1

    .line 108
    int-to-byte p1, p1

    .line 109
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 114
    .line 115
    .line 116
    if-eqz p3, :cond_6

    .line 117
    .line 118
    const/16 p1, 0xff

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    const/16 p1, 0x7f

    .line 122
    .line 123
    :goto_2
    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 124
    .line 125
    .line 126
    move p1, v4

    .line 127
    :goto_3
    if-ge p1, v5, :cond_7

    .line 128
    .line 129
    rsub-int/lit8 p2, p1, 0x7

    .line 130
    .line 131
    mul-int/2addr p2, v5

    .line 132
    ushr-long v6, v1, p2

    .line 133
    .line 134
    long-to-int p2, v6

    .line 135
    int-to-byte p2, p2

    .line 136
    invoke-virtual {v0, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 p1, p1, 0x1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_7
    :goto_4
    if-eqz p3, :cond_8

    .line 143
    .line 144
    sget-object p1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->trivialMask:[B

    .line 145
    .line 146
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 147
    .line 148
    .line 149
    array-length p2, p0

    .line 150
    invoke-static {p0, v4, p2, p1}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->applyMask([BII[B)V

    .line 151
    .line 152
    .line 153
    :cond_8
    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0
.end method

.method private protocolChecks()V
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/16 v2, 0x9

    .line 5
    .line 6
    if-le v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameFinalFlag:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "fragmented control frame"

    .line 13
    .line 14
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    if-eq v0, v1, :cond_4

    .line 22
    .line 23
    if-eq v0, v2, :cond_4

    .line 24
    .line 25
    const/16 v1, 0xa

    .line 26
    .line 27
    if-eq v0, v1, :cond_4

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "control frame using reserved opcode "

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    if-eq v0, v1, :cond_2

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    if-eq v0, v1, :cond_2

    .line 56
    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v1, "data frame using reserved opcode "

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->fragmentedFramesCount:I

    .line 77
    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 81
    .line 82
    if-nez v0, :cond_3

    .line 83
    .line 84
    const-string v0, "received continuation data frame outside fragmented message"

    .line 85
    .line 86
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->fragmentedFramesCount:I

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    if-eq v0, v2, :cond_4

    .line 98
    .line 99
    const-string v0, "received non-continuation data frame while inside fragmented message"

    .line 100
    .line 101
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    return-void
.end method

.method private protocolViolation(Ljava/lang/String;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method private readNextByte()B
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readIndex:I

    .line 2
    .line 3
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 8
    .line 9
    add-int/lit8 v2, v0, 0x1

    .line 10
    .line 11
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readIndex:I

    .line 12
    .line 13
    aget-byte p0, v1, v0

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    invoke-static {}, La/v4i0;->e()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method private unmask([BII)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->maskingKey:[B

    .line 2
    .line 3
    invoke-static {p1, p2, p3, p0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->applyMask([BII[B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public decode(Ljava/io/InputStream;)[B
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    iget v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 7
    .line 8
    sub-int/2addr v1, v2

    .line 9
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->available()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    add-int/lit8 v3, v1, -0x1

    .line 14
    .line 15
    const/16 v4, 0x20

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-le v2, v3, :cond_2

    .line 19
    .line 20
    iget-object v3, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 21
    .line 22
    array-length v3, v3

    .line 23
    mul-int/lit8 v3, v3, 0x2

    .line 24
    .line 25
    mul-int/lit8 v6, v2, 0x4

    .line 26
    .line 27
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    sget-object v6, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    invoke-interface {v6, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    sget-object v6, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 40
    .line 41
    new-instance v7, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v8, "Increasing buffer size from "

    .line 44
    .line 45
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v8, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 49
    .line 50
    array-length v8, v8

    .line 51
    const-string v9, " avail "

    .line 52
    .line 53
    const-string v10, " newSize "

    .line 54
    .line 55
    invoke-static {v8, v2, v9, v10, v7}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v6, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    new-array v2, v3, [B

    .line 69
    .line 70
    iget-object v3, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 71
    .line 72
    iget v6, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 73
    .line 74
    invoke-static {v3, v5, v2, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 75
    .line 76
    .line 77
    iput-object v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 78
    .line 79
    :cond_2
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 80
    .line 81
    iget v3, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 82
    .line 83
    move-object/from16 v6, p1

    .line 84
    .line 85
    invoke-virtual {v6, v2, v3, v1}, Ljava/io/InputStream;->read([BII)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-gez v1, :cond_3

    .line 90
    .line 91
    move v1, v5

    .line 92
    :cond_3
    iget v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 93
    .line 94
    add-int/2addr v2, v1

    .line 95
    iput v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/io/InputStream;->available()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-gtz v1, :cond_0

    .line 102
    .line 103
    iput v5, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readIndex:I

    .line 104
    .line 105
    iget v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 106
    .line 107
    const-string v2, "Abort decode. Write index is at "

    .line 108
    .line 109
    const/4 v3, 0x4

    .line 110
    const/4 v6, 0x0

    .line 111
    if-ge v1, v3, :cond_5

    .line 112
    .line 113
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 114
    .line 115
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 122
    .line 123
    new-instance v3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget v0, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 129
    .line 130
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_4
    return-object v6

    .line 141
    :cond_5
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readNextByte()B

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    and-int/lit16 v7, v1, 0x80

    .line 146
    .line 147
    const/4 v8, 0x1

    .line 148
    if-eqz v7, :cond_6

    .line 149
    .line 150
    move v7, v8

    .line 151
    goto :goto_0

    .line 152
    :cond_6
    move v7, v5

    .line 153
    :goto_0
    iput-boolean v7, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameFinalFlag:Z

    .line 154
    .line 155
    and-int/lit8 v7, v1, 0x70

    .line 156
    .line 157
    shr-int/2addr v7, v3

    .line 158
    iput v7, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameRsv:I

    .line 159
    .line 160
    and-int/lit8 v1, v1, 0xf

    .line 161
    .line 162
    iput v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 163
    .line 164
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 165
    .line 166
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_7

    .line 171
    .line 172
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 173
    .line 174
    new-instance v7, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v9, "Decoding WebSocket Frame opCode="

    .line 177
    .line 178
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    iget v9, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 182
    .line 183
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-interface {v1, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :cond_7
    iget v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameOpcode:I

    .line 194
    .line 195
    const/16 v7, 0x8

    .line 196
    .line 197
    if-ne v1, v7, :cond_8

    .line 198
    .line 199
    iput-boolean v8, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->closeOpcodeReceived:Z

    .line 200
    .line 201
    :cond_8
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readNextByte()B

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    and-int/lit16 v9, v1, 0x80

    .line 206
    .line 207
    if-eqz v9, :cond_9

    .line 208
    .line 209
    move v9, v8

    .line 210
    goto :goto_1

    .line 211
    :cond_9
    move v9, v5

    .line 212
    :goto_1
    const/16 v10, 0x7f

    .line 213
    .line 214
    and-int/2addr v1, v10

    .line 215
    iget v11, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameRsv:I

    .line 216
    .line 217
    if-eqz v11, :cond_a

    .line 218
    .line 219
    iget-boolean v11, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->allowExtensions:Z

    .line 220
    .line 221
    if-nez v11, :cond_a

    .line 222
    .line 223
    new-instance v1, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v2, "RSV != 0 and no extension negotiated, RSV:"

    .line 226
    .line 227
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->frameRsv:I

    .line 231
    .line 232
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-object v6

    .line 243
    :cond_a
    iget-boolean v11, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->maskedPayload:Z

    .line 244
    .line 245
    if-eqz v11, :cond_b

    .line 246
    .line 247
    if-nez v9, :cond_b

    .line 248
    .line 249
    const-string v1, "unmasked client to server frame"

    .line 250
    .line 251
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-object v6

    .line 255
    :cond_b
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolChecks()V

    .line 256
    .line 257
    .line 258
    const/16 v11, 0x7e

    .line 259
    .line 260
    const-wide/16 v12, 0x0

    .line 261
    .line 262
    if-ne v1, v11, :cond_c

    .line 263
    .line 264
    :try_start_0
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readNextByte()B

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    and-int/lit16 v1, v1, 0xff

    .line 269
    .line 270
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readNextByte()B

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    and-int/lit16 v10, v10, 0xff

    .line 275
    .line 276
    shl-int/2addr v1, v7

    .line 277
    or-int/2addr v1, v10

    .line 278
    int-to-long v10, v1

    .line 279
    iput-wide v10, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->framePayloadLength:J

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_c
    if-ne v1, v10, :cond_e

    .line 283
    .line 284
    move v1, v5

    .line 285
    move-wide v10, v12

    .line 286
    :goto_2
    if-ge v1, v7, :cond_d

    .line 287
    .line 288
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readNextByte()B

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    and-int/lit16 v14, v14, 0xff

    .line 293
    .line 294
    int-to-long v14, v14

    .line 295
    rsub-int/lit8 v16, v1, 0x7

    .line 296
    .line 297
    mul-int/lit8 v16, v16, 0x8

    .line 298
    .line 299
    shl-long v14, v14, v16

    .line 300
    .line 301
    or-long/2addr v10, v14

    .line 302
    add-int/lit8 v1, v1, 0x1

    .line 303
    .line 304
    goto :goto_2

    .line 305
    :cond_d
    iput-wide v10, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->framePayloadLength:J

    .line 306
    .line 307
    const-wide/32 v14, 0x10000

    .line 308
    .line 309
    .line 310
    cmp-long v1, v10, v14

    .line 311
    .line 312
    if-gez v1, :cond_f

    .line 313
    .line 314
    new-instance v1, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 317
    .line 318
    .line 319
    const-string v2, "invalid data frame length (not using minimal length encoding): "

    .line 320
    .line 321
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    iget-wide v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->framePayloadLength:J

    .line 325
    .line 326
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    return-object v6

    .line 337
    :cond_e
    int-to-long v10, v1

    .line 338
    iput-wide v10, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->framePayloadLength:J

    .line 339
    .line 340
    :cond_f
    :goto_3
    cmp-long v1, v10, v12

    .line 341
    .line 342
    if-gez v1, :cond_10

    .line 343
    .line 344
    new-instance v1, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 347
    .line 348
    .line 349
    const-string v7, "Negative payload size: "

    .line 350
    .line 351
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    iget-wide v10, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->framePayloadLength:J

    .line 355
    .line 356
    invoke-virtual {v1, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->protocolViolation(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    :cond_10
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 367
    .line 368
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_11

    .line 373
    .line 374
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 375
    .line 376
    new-instance v7, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 379
    .line 380
    .line 381
    const-string v10, "Decoding WebSocket Frame length="

    .line 382
    .line 383
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    iget-wide v10, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->framePayloadLength:J

    .line 387
    .line 388
    invoke-virtual {v7, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    invoke-interface {v1, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    :cond_11
    if-eqz v9, :cond_12

    .line 399
    .line 400
    move v1, v5

    .line 401
    :goto_4
    if-ge v1, v3, :cond_12

    .line 402
    .line 403
    iget-object v7, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->maskingKey:[B

    .line 404
    .line 405
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readNextByte()B

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    aput-byte v10, v7, v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 410
    .line 411
    add-int/lit8 v1, v1, 0x1

    .line 412
    .line 413
    goto :goto_4

    .line 414
    :cond_12
    iget v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->readIndex:I

    .line 415
    .line 416
    iput v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->payloadStartIndex:I

    .line 417
    .line 418
    int-to-long v10, v1

    .line 419
    iget-wide v12, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->framePayloadLength:J

    .line 420
    .line 421
    add-long/2addr v10, v12

    .line 422
    iput-wide v10, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->totalPacketLength:J

    .line 423
    .line 424
    iget v3, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 425
    .line 426
    int-to-long v14, v3

    .line 427
    cmp-long v3, v14, v10

    .line 428
    .line 429
    if-gez v3, :cond_14

    .line 430
    .line 431
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 432
    .line 433
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    if-eqz v1, :cond_13

    .line 438
    .line 439
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 440
    .line 441
    new-instance v3, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    iget v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 447
    .line 448
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    const-string v2, " and totalPacketLength is "

    .line 452
    .line 453
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    iget-wide v4, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->totalPacketLength:J

    .line 457
    .line 458
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    :cond_13
    return-object v6

    .line 469
    :cond_14
    if-eqz v9, :cond_15

    .line 470
    .line 471
    iget-object v2, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 472
    .line 473
    int-to-long v6, v1

    .line 474
    add-long/2addr v6, v12

    .line 475
    long-to-int v3, v6

    .line 476
    invoke-direct {v0, v2, v1, v3}, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->unmask([BII)V

    .line 477
    .line 478
    .line 479
    :cond_15
    iget-wide v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->framePayloadLength:J

    .line 480
    .line 481
    long-to-int v3, v1

    .line 482
    new-array v3, v3, [B

    .line 483
    .line 484
    iget-object v6, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 485
    .line 486
    iget v7, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->payloadStartIndex:I

    .line 487
    .line 488
    long-to-int v1, v1

    .line 489
    invoke-static {v6, v7, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 490
    .line 491
    .line 492
    :goto_5
    int-to-long v1, v8

    .line 493
    iget v5, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 494
    .line 495
    int-to-long v6, v5

    .line 496
    iget-wide v9, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->totalPacketLength:J

    .line 497
    .line 498
    sub-long/2addr v6, v9

    .line 499
    cmp-long v1, v1, v6

    .line 500
    .line 501
    if-gez v1, :cond_16

    .line 502
    .line 503
    iget-object v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->decodeBuffer:[B

    .line 504
    .line 505
    long-to-int v2, v9

    .line 506
    add-int/2addr v2, v8

    .line 507
    aget-byte v2, v1, v2

    .line 508
    .line 509
    aput-byte v2, v1, v8

    .line 510
    .line 511
    add-int/lit8 v8, v8, 0x1

    .line 512
    .line 513
    goto :goto_5

    .line 514
    :cond_16
    int-to-long v1, v5

    .line 515
    sub-long/2addr v1, v9

    .line 516
    long-to-int v1, v1

    .line 517
    iput v1, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 518
    .line 519
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 520
    .line 521
    invoke-interface {v1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 522
    .line 523
    .line 524
    move-result v1

    .line 525
    if-eqz v1, :cond_17

    .line 526
    .line 527
    sget-object v1, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->logger:Landroid/gov/nist/core/StackLogger;

    .line 528
    .line 529
    new-instance v2, Ljava/lang/StringBuilder;

    .line 530
    .line 531
    const-string v4, "writeIndex = "

    .line 532
    .line 533
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    iget v4, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->writeIndex:I

    .line 537
    .line 538
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    const-string v4, " "

    .line 542
    .line 543
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    iget-wide v4, v0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->totalPacketLength:J

    .line 547
    .line 548
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    :cond_17
    return-object v3

    .line 559
    :catch_0
    return-object v6
.end method

.method public isCloseOpcodeReceived()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/WebSocketCodec;->closeOpcodeReceived:Z

    .line 2
    .line 3
    return p0
.end method
