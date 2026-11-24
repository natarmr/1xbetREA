.class public Landroid/gov/nist/javax/sip/parser/NioPipelineParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;,
        Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;
    }
.end annotation


# static fields
.field private static final CRLF:Ljava/lang/String; = "\r\n"

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field callId:Ljava/lang/String;

.field contentLength:I

.field contentReadSoFar:I

.field currentStreamEnded:Z

.field isRunning:Z

.field private maxMessageSize:I

.field message:Ljava/lang/StringBuilder;

.field messageBody:[B

.field partialLine:Ljava/lang/String;

.field partialLineRead:Z

.field readingHeaderLines:Z

.field readingMessageBodyContents:Z

.field protected sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

.field private sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

.field private sizeCounter:I

.field private smp:Landroid/gov/nist/javax/sip/parser/MessageParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->smp:Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->isRunning:Z

    .line 9
    .line 10
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->currentStreamEnded:Z

    .line 11
    .line 12
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readingMessageBodyContents:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readingHeaderLines:Z

    .line 16
    .line 17
    iput-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLineRead:Z

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    iput-object v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLine:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->message:Ljava/lang/StringBuilder;

    .line 29
    .line 30
    iput-object v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->messageBody:[B

    .line 31
    .line 32
    iput v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentLength:I

    .line 33
    .line 34
    iput v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentReadSoFar:I

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/SIPMessageListener;I)V
    .locals 1

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, p2, v0, p3}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/SIPMessageListener;ZI)V

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/SIPMessageListener;ZI)V
    .locals 0

    .line 37
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;-><init>()V

    .line 38
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 39
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageParserFactory()Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    move-result-object p3

    invoke-interface {p3, p1}, Landroid/gov/nist/javax/sip/parser/MessageParserFactory;->createMessageParser(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Landroid/gov/nist/javax/sip/parser/MessageParser;

    move-result-object p1

    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->smp:Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 40
    iput-object p2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 41
    iput p4, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->maxMessageSize:I

    .line 42
    iput p4, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sizeCounter:I

    return-void
.end method

.method public static synthetic access$000()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/parser/MessageParser;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->smp:Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    return-object p0
.end method

.method private checkLimits()V
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->maxMessageSize:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sizeCounter:I

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 11
    .line 12
    iget p0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->maxMessageSize:I

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Max Message Size Exceeded "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    :goto_0
    return-void
.end method

.method private readChunk(Ljava/io/InputStream;[BII)I
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3, p4}, Ljava/io/InputStream;->read([BII)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sizeCounter:I

    .line 6
    .line 7
    sub-int/2addr p2, p1

    .line 8
    iput p2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sizeCounter:I

    .line 9
    .line 10
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->checkLimits()V

    .line 11
    .line 12
    .line 13
    return p1
.end method

.method private readLine(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLineRead:Z

    .line 3
    .line 4
    const/16 v1, 0x400

    .line 5
    .line 6
    new-array v2, v1, [B

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    new-array v3, v3, [B

    .line 10
    .line 11
    move v4, v0

    .line 12
    move v5, v4

    .line 13
    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readSingleByte(Ljava/io/InputStream;)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    const/4 v7, -0x1

    .line 18
    const/4 v8, 0x1

    .line 19
    if-ne v6, v7, :cond_1

    .line 20
    .line 21
    iput-boolean v8, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLineRead:Z

    .line 22
    .line 23
    iput-boolean v8, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->currentStreamEnded:Z

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    and-int/lit16 v6, v6, 0xff

    .line 27
    .line 28
    int-to-char v7, v6

    .line 29
    const/16 v9, 0xd

    .line 30
    .line 31
    if-eq v7, v9, :cond_2

    .line 32
    .line 33
    add-int/lit8 v9, v4, 0x1

    .line 34
    .line 35
    int-to-byte v6, v6

    .line 36
    aput-byte v6, v2, v4

    .line 37
    .line 38
    move v4, v9

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-nez v4, :cond_3

    .line 41
    .line 42
    add-int/lit8 v6, v5, 0x1

    .line 43
    .line 44
    aput-byte v9, v3, v5

    .line 45
    .line 46
    move v5, v6

    .line 47
    :cond_3
    :goto_1
    const/16 v6, 0xa

    .line 48
    .line 49
    if-ne v7, v6, :cond_7

    .line 50
    .line 51
    if-ne v4, v8, :cond_4

    .line 52
    .line 53
    if-lez v5, :cond_4

    .line 54
    .line 55
    add-int/lit8 p0, v5, 0x1

    .line 56
    .line 57
    aput-byte v6, v3, v5

    .line 58
    .line 59
    move v5, p0

    .line 60
    :cond_4
    :goto_2
    const-string p0, "UTF-8"

    .line 61
    .line 62
    if-ne v4, v8, :cond_5

    .line 63
    .line 64
    if-lez v5, :cond_5

    .line 65
    .line 66
    new-instance p1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct {p1, v3, v0, v5, p0}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_5
    new-instance p1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct {p1, v2, v0, v4, p0}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    if-ne v5, v8, :cond_6

    .line 78
    .line 79
    const-string p0, "\r"

    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_6
    return-object p1

    .line 87
    :cond_7
    if-ne v4, v1, :cond_0

    .line 88
    .line 89
    add-int/lit16 v6, v1, 0x400

    .line 90
    .line 91
    new-array v7, v6, [B

    .line 92
    .line 93
    invoke-static {v2, v0, v7, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 94
    .line 95
    .line 96
    move v1, v6

    .line 97
    move-object v2, v7

    .line 98
    goto :goto_0
.end method

.method private readMessageBody(Ljava/io/InputStream;)V
    .locals 7

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    iget v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentLength:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    iget-object v4, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->messageBody:[B

    .line 10
    .line 11
    iget v5, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentReadSoFar:I

    .line 12
    .line 13
    sub-int/2addr v1, v5

    .line 14
    invoke-direct {p0, p1, v4, v5, v1}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readChunk(Ljava/io/InputStream;[BII)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v1, -0x1

    .line 19
    if-ne p1, v1, :cond_1

    .line 20
    .line 21
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->currentStreamEnded:Z

    .line 22
    .line 23
    :cond_0
    move p1, v3

    .line 24
    :cond_1
    iget v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentReadSoFar:I

    .line 25
    .line 26
    add-int/2addr v1, p1

    .line 27
    iput v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentReadSoFar:I

    .line 28
    .line 29
    iget p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentLength:I

    .line 30
    .line 31
    if-ne v1, p1, :cond_4

    .line 32
    .line 33
    iget p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->maxMessageSize:I

    .line 34
    .line 35
    iput p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sizeCounter:I

    .line 36
    .line 37
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readingHeaderLines:Z

    .line 38
    .line 39
    iput-boolean v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readingMessageBodyContents:Z

    .line 40
    .line 41
    iget-object p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->message:Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->message:Ljava/lang/StringBuilder;

    .line 53
    .line 54
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->messageBody:[B

    .line 55
    .line 56
    iget-object v4, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSelfRoutingThreadpoolExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->callId:Ljava/lang/String;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-lt v3, v2, :cond_2

    .line 77
    .line 78
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getSelfRoutingThreadpoolExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-instance v3, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;

    .line 85
    .line 86
    new-instance v4, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;

    .line 87
    .line 88
    invoke-direct {v4, p1, v1}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;-><init>(Ljava/lang/String;[B)V

    .line 89
    .line 90
    .line 91
    invoke-direct {v3, p0, v4, v0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser$Dispatch;-><init>(Landroid/gov/nist/javax/sip/parser/NioPipelineParser;Landroid/gov/nist/javax/sip/parser/NioPipelineParser$UnparsedMessage;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    const-string p0, "received message with no Call-ID"

    .line 99
    .line 100
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    const/4 v2, 0x0

    .line 105
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    iget-object v5, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->smp:Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 110
    .line 111
    invoke-interface {v5, v4, v3, v3, v2}, Landroid/gov/nist/javax/sip/parser/MessageParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2, v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMessageContent([B)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catch_0
    move-exception v1

    .line 120
    sget-object v4, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 121
    .line 122
    new-instance v5, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v6, "Parsing issue !  "

    .line 125
    .line 126
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    new-instance v6, Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-direct {v6, p1}, Ljava/lang/String;-><init>([B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string p1, " "

    .line 142
    .line 143
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-interface {v4, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :goto_0
    iput v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentLength:I

    .line 161
    .line 162
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->processSIPMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 163
    .line 164
    .line 165
    :cond_4
    return-void
.end method

.method private readMessageSipHeaderLines(Ljava/io/InputStream;Z)Z
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readLine(Ljava/io/InputStream;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLineRead:Z

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLine:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v1, p1}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLine:Ljava/lang/String;

    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    invoke-static {v1, p1}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, ""

    .line 24
    .line 25
    iput-object v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLine:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "\r\n"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v3, 0x1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    iget-object p2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->message:Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    sget-object v0, Landroid/gov/nist/javax/sip/header/ContentLength;->NAME_LOWER:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    add-int/2addr p2, v3

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentLength:I

    .line 71
    .line 72
    return v2

    .line 73
    :cond_1
    sget-object v0, Landroid/gov/nist/javax/sip/header/CallID;->NAME_LOWER:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    add-int/2addr p2, v3

    .line 86
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->callId:Ljava/lang/String;

    .line 95
    .line 96
    :cond_2
    return v2

    .line 97
    :cond_3
    const/16 p1, 0x20

    .line 98
    .line 99
    if-eqz p2, :cond_5

    .line 100
    .line 101
    sget-object p2, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 102
    .line 103
    invoke-interface {p2, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eqz p2, :cond_4

    .line 108
    .line 109
    sget-object p2, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 110
    .line 111
    const-string v1, "KeepAlive Double CRLF received, sending single CRLF as defined per RFC 5626 Section 4.4.1"

    .line 112
    .line 113
    invoke-interface {p2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sget-object p2, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 117
    .line 118
    const-string v1, "~~~ setting isPreviousLineCRLF=false"

    .line 119
    .line 120
    invoke-interface {p2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    :try_start_0
    iget-object p2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 124
    .line 125
    invoke-interface {p2}, Landroid/gov/nist/javax/sip/parser/SIPMessageListener;->sendSingleCLRF()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :catch_0
    move-exception p2

    .line 130
    sget-object v1, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 131
    .line 132
    const-string v4, "A problem occured while trying to send a single CLRF in response to a double CLRF"

    .line 133
    .line 134
    invoke-interface {v1, v4, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 135
    .line 136
    .line 137
    :goto_0
    move p2, v2

    .line 138
    goto :goto_1

    .line 139
    :cond_5
    sget-object p2, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 140
    .line 141
    invoke-interface {p2, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    if-eqz p2, :cond_6

    .line 146
    .line 147
    sget-object p2, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 148
    .line 149
    const-string v1, "Received CRLF"

    .line 150
    .line 151
    invoke-interface {p2, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    iget-object p2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 155
    .line 156
    if-eqz p2, :cond_7

    .line 157
    .line 158
    instance-of v1, p2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 159
    .line 160
    if-eqz v1, :cond_7

    .line 161
    .line 162
    check-cast p2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 163
    .line 164
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->cancelPingKeepAliveTimeoutTaskIfStarted()V

    .line 165
    .line 166
    .line 167
    :cond_7
    move p2, v3

    .line 168
    :goto_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->message:Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-lez v1, :cond_9

    .line 175
    .line 176
    iput-boolean v3, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readingMessageBodyContents:Z

    .line 177
    .line 178
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readingHeaderLines:Z

    .line 179
    .line 180
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->partialLineRead:Z

    .line 181
    .line 182
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->message:Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    sget-object v0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 188
    .line 189
    invoke-interface {v0, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_8

    .line 194
    .line 195
    sget-object p1, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 196
    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v1, "Content Length parsed is "

    .line 200
    .line 201
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentLength:I

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_8
    iput v2, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentReadSoFar:I

    .line 217
    .line 218
    iget p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->contentLength:I

    .line 219
    .line 220
    new-array p1, p1, [B

    .line 221
    .line 222
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->messageBody:[B

    .line 223
    .line 224
    :cond_9
    return p2
.end method

.method private readSingleByte(Ljava/io/InputStream;)I
    .locals 1

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sizeCounter:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sizeCounter:I

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->checkLimits()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method


# virtual methods
.method public declared-synchronized addBytes([B)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->currentStreamEnded:Z

    .line 4
    .line 5
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readStream(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public processSIPMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/gov/nist/javax/sip/parser/SIPMessageListener;->processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    sget-object p1, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 9
    .line 10
    const-string v0, "Can\'t process message"

    .line 11
    .line 12
    invoke-interface {p1, v0, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public readStream(Ljava/io/InputStream;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_0
    :goto_0
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->currentStreamEnded:Z

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    return-void

    .line 7
    :cond_1
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readingHeaderLines:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    invoke-direct {p0, p1, v0}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readMessageSipHeaderLines(Ljava/io/InputStream;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    :cond_2
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readingMessageBodyContents:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->readMessageBody(Ljava/io/InputStream;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0
.end method

.method public setMessageListener(Landroid/gov/nist/javax/sip/parser/SIPMessageListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/NioPipelineParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 2
    .line 3
    return-void
.end method
