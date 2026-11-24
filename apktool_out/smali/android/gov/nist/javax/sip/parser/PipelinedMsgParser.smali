.class public final Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;,
        Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;
    }
.end annotation


# static fields
.field private static final CRLF:Ljava/lang/String; = "\r\n"

.field private static logger:Landroid/gov/nist/core/StackLogger;

.field private static uid:I


# instance fields
.field isRunning:Z

.field private maxMessageSize:I

.field private messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;",
            ">;"
        }
    .end annotation
.end field

.field private mythread:Ljava/lang/Thread;

.field private rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

.field protected sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

.field private sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

.field private sizeCounter:I

.field private smp:Landroid/gov/nist/javax/sip/parser/MessageParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->uid:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 52
    iput-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->smp:Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 53
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->isRunning:Z

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/Pipeline;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    .line 56
    invoke-direct/range {v0 .. v5}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/SIPMessageListener;Landroid/gov/nist/javax/sip/parser/Pipeline;ZI)V

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/SIPMessageListener;Landroid/gov/nist/javax/sip/parser/Pipeline;I)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    .line 55
    invoke-direct/range {v0 .. v5}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/SIPMessageListener;Landroid/gov/nist/javax/sip/parser/Pipeline;ZI)V

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/parser/SIPMessageListener;Landroid/gov/nist/javax/sip/parser/Pipeline;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageParserFactory()Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    invoke-interface {p4, p1}, Landroid/gov/nist/javax/sip/parser/MessageParserFactory;->createMessageParser(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->smp:Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 15
    .line 16
    iput-object p2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 17
    .line 18
    iput-object p3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 19
    .line 20
    iput p5, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->maxMessageSize:I

    .line 21
    .line 22
    new-instance p1, Ljava/lang/Thread;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 28
    .line 29
    new-instance p0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string p2, "PipelineThread-"

    .line 32
    .line 33
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->getNewUid()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static synthetic access$000(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)Ljava/lang/Thread;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 2
    .line 3
    return-object p0
.end method

.method private cleanMessageOrderingMap()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 12
    .line 13
    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v2, "cleaned the messagesOrderingMap "

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, " threadname "

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw p0
.end method

.method private static declared-synchronized getNewUid()I
    .locals 3

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->uid:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    sput v2, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->uid:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v1
.end method

.method private readLine(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 10

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [B

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, v3

    .line 10
    move v5, v4

    .line 11
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    const/4 v7, -0x1

    .line 16
    if-eq v6, v7, :cond_8

    .line 17
    .line 18
    and-int/lit16 v6, v6, 0xff

    .line 19
    .line 20
    int-to-char v7, v6

    .line 21
    iget v8, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->maxMessageSize:I

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    if-lez v8, :cond_2

    .line 25
    .line 26
    iget v8, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sizeCounter:I

    .line 27
    .line 28
    sub-int/2addr v8, v9

    .line 29
    iput v8, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sizeCounter:I

    .line 30
    .line 31
    if-lez v8, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    const-string p0, "Max size exceeded!"

    .line 35
    .line 36
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :cond_2
    :goto_2
    const/16 v8, 0xd

    .line 42
    .line 43
    if-eq v7, v8, :cond_3

    .line 44
    .line 45
    add-int/lit8 v8, v4, 0x1

    .line 46
    .line 47
    int-to-byte v6, v6

    .line 48
    aput-byte v6, v1, v4

    .line 49
    .line 50
    move v4, v8

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    if-nez v4, :cond_4

    .line 53
    .line 54
    add-int/lit8 v6, v5, 0x1

    .line 55
    .line 56
    aput-byte v8, v2, v5

    .line 57
    .line 58
    move v5, v6

    .line 59
    :cond_4
    :goto_3
    const/16 v6, 0xa

    .line 60
    .line 61
    if-ne v7, v6, :cond_7

    .line 62
    .line 63
    if-ne v4, v9, :cond_5

    .line 64
    .line 65
    if-lez v5, :cond_5

    .line 66
    .line 67
    add-int/lit8 p0, v5, 0x1

    .line 68
    .line 69
    aput-byte v6, v2, v5

    .line 70
    .line 71
    move v5, p0

    .line 72
    :cond_5
    const-string p0, "UTF-8"

    .line 73
    .line 74
    if-ne v4, v9, :cond_6

    .line 75
    .line 76
    if-lez v5, :cond_6

    .line 77
    .line 78
    new-instance p1, Ljava/lang/String;

    .line 79
    .line 80
    invoke-direct {p1, v2, v3, v5, p0}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_6
    new-instance p1, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p1, v1, v3, v4, p0}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_7
    if-ne v4, v0, :cond_0

    .line 91
    .line 92
    add-int/lit16 v6, v0, 0x400

    .line 93
    .line 94
    new-array v7, v6, [B

    .line 95
    .line 96
    invoke-static {v1, v3, v7, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    .line 98
    .line 99
    move v0, v6

    .line 100
    move-object v1, v7

    .line 101
    goto :goto_0

    .line 102
    :cond_8
    const-string p0, "End of stream"

    .line 103
    .line 104
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 7
    .line 8
    iput-object v1, v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 9
    .line 10
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 11
    .line 12
    iput-object p0, v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 13
    .line 14
    new-instance p0, Ljava/lang/Thread;

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "PipelineThread"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public close()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->isRunning:Z

    .line 3
    .line 4
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v3, "Closing pipelinedmsgparser "

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v3, " threadname "

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 54
    .line 55
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v2, "Couldn\'t close the rawInputStream "

    .line 66
    .line 67
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v2, " threadname "

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v2, " already closed ? "

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    :goto_0
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->getPostParseExecutor()Ljava/util/concurrent/ExecutorService;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->cleanMessageOrderingMap()V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 118
    .line 119
    monitor-enter v0

    .line 120
    :try_start_1
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 123
    .line 124
    .line 125
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 128
    .line 129
    .line 130
    monitor-exit v0

    .line 131
    goto :goto_1

    .line 132
    :catchall_0
    move-exception p0

    .line 133
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    throw p0

    .line 135
    :cond_2
    :goto_1
    return-void
.end method

.method public processInput()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public run()V
    .locals 12

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 2
    .line 3
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->isRunning:Z

    .line 7
    .line 8
    :cond_0
    :goto_0
    iget-boolean v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->isRunning:Z

    .line 9
    .line 10
    if-eqz v3, :cond_26

    .line 11
    .line 12
    iget v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->maxMessageSize:I

    .line 13
    .line 14
    iput v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sizeCounter:I

    .line 15
    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v4, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    const/16 v5, 0x20

    .line 24
    .line 25
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    sget-object v4, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 32
    .line 33
    const-string v6, "Starting to parse."

    .line 34
    .line 35
    invoke-interface {v4, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    goto/16 :goto_17

    .line 41
    .line 42
    :cond_1
    :goto_1
    const/4 v4, 0x0

    .line 43
    :goto_2
    move v6, v4

    .line 44
    :cond_2
    :goto_3
    const-wide/32 v7, 0xfa00

    .line 45
    .line 46
    .line 47
    :try_start_1
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->readLine(Ljava/io/InputStream;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    const-string v10, "\n"

    .line 52
    .line 53
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-eqz v10, :cond_3

    .line 58
    .line 59
    sget-object v9, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 60
    .line 61
    invoke-interface {v9, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_2

    .line 66
    .line 67
    sget-object v9, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 68
    .line 69
    const-string v10, "Discarding blank line"

    .line 70
    .line 71
    invoke-interface {v9, v10}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    const-string v10, "\r\n"

    .line 76
    .line 77
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-eqz v10, :cond_8

    .line 82
    .line 83
    if-eqz v6, :cond_5

    .line 84
    .line 85
    sget-object v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 86
    .line 87
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_4

    .line 92
    .line 93
    sget-object v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 94
    .line 95
    const-string v9, "KeepAlive Double CRLF received, sending single CRLF as defined per RFC 5626 Section 4.4.1"

    .line 96
    .line 97
    invoke-interface {v6, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sget-object v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 101
    .line 102
    const-string v9, "~~~ setting isPreviousLineCRLF=false"

    .line 103
    .line 104
    invoke-interface {v6, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    .line 107
    :cond_4
    :try_start_2
    iget-object v6, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 108
    .line 109
    invoke-interface {v6}, Landroid/gov/nist/javax/sip/parser/SIPMessageListener;->sendSingleCLRF()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catch_0
    move-exception v6

    .line 114
    :try_start_3
    sget-object v9, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 115
    .line 116
    const-string v10, "A problem occured while trying to send a single CLRF in response to a double CLRF"

    .line 117
    .line 118
    invoke-interface {v9, v10, v6}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    sget-object v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 123
    .line 124
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_6

    .line 129
    .line 130
    sget-object v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 131
    .line 132
    const-string v9, "Received CRLF"

    .line 133
    .line 134
    invoke-interface {v6, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_6
    iget-object v6, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 138
    .line 139
    if-eqz v6, :cond_7

    .line 140
    .line 141
    instance-of v9, v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 142
    .line 143
    if-eqz v9, :cond_7

    .line 144
    .line 145
    check-cast v6, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 146
    .line 147
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->cancelPingKeepAliveTimeoutTaskIfStarted()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 148
    .line 149
    .line 150
    :cond_7
    move v6, v2

    .line 151
    goto :goto_3

    .line 152
    :cond_8
    :try_start_4
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    iget-object v6, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 156
    .line 157
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/parser/Pipeline;->startTimer()V

    .line 158
    .line 159
    .line 160
    sget-object v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 161
    .line 162
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_9

    .line 167
    .line 168
    sget-object v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 169
    .line 170
    const-string v9, "Reading Input stream."

    .line 171
    .line 172
    invoke-interface {v6, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 173
    .line 174
    .line 175
    :cond_9
    move v6, v4

    .line 176
    :cond_a
    :try_start_5
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->readLine(Ljava/io/InputStream;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    add-int/2addr v6, v10

    .line 185
    iget v10, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->maxMessageSize:I

    .line 186
    .line 187
    if-lez v10, :cond_c

    .line 188
    .line 189
    div-int/lit8 v10, v10, 0x2

    .line 190
    .line 191
    if-gt v6, v10, :cond_b

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_b
    new-instance v1, Ljava/io/IOException;

    .line 195
    .line 196
    new-instance v2, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v3, "Pre-content-length headers size exceeded. The size of the message of the headers prior to Content-Length is too large. This must be an invalid message. Limit is MAX_MESSAGE_SIZE/2="

    .line 202
    .line 203
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    iget v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->maxMessageSize:I

    .line 207
    .line 208
    div-int/lit8 v3, v3, 0x2

    .line 209
    .line 210
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v1

    .line 221
    :cond_c
    :goto_4
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    const-string v11, ""

    .line 229
    .line 230
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v10
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 234
    if-eqz v10, :cond_a

    .line 235
    .line 236
    :try_start_6
    iget-object v6, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 237
    .line 238
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/parser/Pipeline;->stopTimer()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 242
    .line 243
    .line 244
    :try_start_7
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    if-eqz v6, :cond_d

    .line 249
    .line 250
    new-instance v6, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    const-string v7, "About to parse : "

    .line 256
    .line 257
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    invoke-interface {v1, v6}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/text/ParseException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 272
    .line 273
    .line 274
    goto :goto_5

    .line 275
    :catch_1
    move-exception v4

    .line 276
    goto/16 :goto_e

    .line 277
    .line 278
    :cond_d
    :goto_5
    :try_start_8
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    const-string v7, "UTF-8"

    .line 283
    .line 284
    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 285
    .line 286
    .line 287
    move-result-object v6
    :try_end_8
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/text/ParseException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 288
    goto :goto_6

    .line 289
    :catch_2
    :try_start_9
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    :goto_6
    iget-object v7, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->smp:Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 298
    .line 299
    iget-object v8, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 300
    .line 301
    invoke-interface {v7, v6, v4, v4, v8}, Landroid/gov/nist/javax/sip/parser/MessageParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    if-nez v6, :cond_e

    .line 306
    .line 307
    iget-object v4, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 308
    .line 309
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/parser/Pipeline;->stopTimer()V
    :try_end_9
    .catch Ljava/text/ParseException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 310
    .line 311
    .line 312
    goto/16 :goto_0

    .line 313
    .line 314
    :cond_e
    :try_start_a
    sget-object v3, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 315
    .line 316
    invoke-interface {v3, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_f

    .line 321
    .line 322
    sget-object v3, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 323
    .line 324
    const-string v7, "Completed parsing message"

    .line 325
    .line 326
    invoke-interface {v3, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :cond_f
    const-string v3, "Content-Length"

    .line 330
    .line 331
    invoke-virtual {v6, v3}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderAsFormattedString(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    const/16 v8, 0x1e

    .line 340
    .line 341
    if-gt v7, v8, :cond_1d

    .line 342
    .line 343
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getContentLength()Landroid/javax/sip/header/ContentLengthHeader;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    check-cast v3, Landroid/gov/nist/javax/sip/header/ContentLength;

    .line 348
    .line 349
    if-eqz v3, :cond_10

    .line 350
    .line 351
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/ContentLength;->getContentLength()I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    goto :goto_7

    .line 356
    :cond_10
    move v3, v4

    .line 357
    :goto_7
    sget-object v7, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 358
    .line 359
    invoke-interface {v7, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    if-eqz v7, :cond_11

    .line 364
    .line 365
    sget-object v7, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 366
    .line 367
    new-instance v8, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    const-string v9, "Content length = "

    .line 373
    .line 374
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v8

    .line 384
    invoke-interface {v7, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    :cond_11
    iget v7, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->maxMessageSize:I

    .line 388
    .line 389
    if-lez v7, :cond_13

    .line 390
    .line 391
    if-gt v3, v7, :cond_12

    .line 392
    .line 393
    goto :goto_8

    .line 394
    :cond_12
    new-instance v1, Ljava/lang/RuntimeException;

    .line 395
    .line 396
    new-instance v2, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const-string v4, "Max content size Exceeded! :"

    .line 402
    .line 403
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    const-string v3, " allowed max size is "

    .line 410
    .line 411
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    iget v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->maxMessageSize:I

    .line 415
    .line 416
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v1

    .line 427
    :cond_13
    :goto_8
    if-nez v3, :cond_14

    .line 428
    .line 429
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->removeContent()V

    .line 430
    .line 431
    .line 432
    goto :goto_c

    .line 433
    :cond_14
    if-eqz v7, :cond_15

    .line 434
    .line 435
    iget v7, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sizeCounter:I

    .line 436
    .line 437
    if-ge v3, v7, :cond_18

    .line 438
    .line 439
    :cond_15
    new-array v7, v3, [B

    .line 440
    .line 441
    :goto_9
    if-ge v4, v3, :cond_17

    .line 442
    .line 443
    iget-object v8, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 444
    .line 445
    invoke-virtual {v8}, Landroid/gov/nist/javax/sip/parser/Pipeline;->startTimer()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 446
    .line 447
    .line 448
    sub-int v8, v3, v4

    .line 449
    .line 450
    :try_start_b
    invoke-virtual {v0, v7, v4, v8}, Ljava/io/InputStream;->read([BII)I

    .line 451
    .line 452
    .line 453
    move-result v8
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 454
    iget-object v9, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 455
    .line 456
    if-lez v8, :cond_16

    .line 457
    .line 458
    add-int/2addr v4, v8

    .line 459
    :try_start_c
    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/parser/Pipeline;->stopTimer()V

    .line 460
    .line 461
    .line 462
    goto :goto_9

    .line 463
    :cond_16
    invoke-virtual {v9}, Landroid/gov/nist/javax/sip/parser/Pipeline;->stopTimer()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 464
    .line 465
    .line 466
    goto :goto_b

    .line 467
    :catchall_1
    move-exception v1

    .line 468
    goto :goto_a

    .line 469
    :catch_3
    move-exception v3

    .line 470
    :try_start_d
    const-string v4, "Exception Reading Content"

    .line 471
    .line 472
    invoke-interface {v1, v4, v3}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 473
    .line 474
    .line 475
    :try_start_e
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 476
    .line 477
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/parser/Pipeline;->stopTimer()V

    .line 478
    .line 479
    .line 480
    goto :goto_b

    .line 481
    :goto_a
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 482
    .line 483
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/parser/Pipeline;->stopTimer()V

    .line 484
    .line 485
    .line 486
    throw v1

    .line 487
    :cond_17
    :goto_b
    invoke-virtual {v6, v7}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setMessageContent([B)V

    .line 488
    .line 489
    .line 490
    :cond_18
    :goto_c
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 491
    .line 492
    if-eqz v3, :cond_0

    .line 493
    .line 494
    :try_start_f
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->getPostParseExecutor()Ljava/util/concurrent/ExecutorService;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    if-nez v3, :cond_1a

    .line 499
    .line 500
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 501
    .line 502
    iget-object v3, v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 503
    .line 504
    if-eqz v3, :cond_19

    .line 505
    .line 506
    invoke-interface {v3, v6}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->beforeMessage(Landroid/javax/sip/message/Message;)V

    .line 507
    .line 508
    .line 509
    :cond_19
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 510
    .line 511
    invoke-interface {v3, v6}, Landroid/gov/nist/javax/sip/parser/SIPMessageListener;->processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 512
    .line 513
    .line 514
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 515
    .line 516
    iget-object v3, v3, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 517
    .line 518
    if-eqz v3, :cond_0

    .line 519
    .line 520
    invoke-interface {v3, v6}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->afterMessage(Landroid/javax/sip/message/Message;)V

    .line 521
    .line 522
    .line 523
    goto/16 :goto_0

    .line 524
    .line 525
    :cond_1a
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-interface {v3}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    iget-object v4, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 534
    .line 535
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;

    .line 540
    .line 541
    if-nez v4, :cond_1c

    .line 542
    .line 543
    new-instance v4, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;

    .line 544
    .line 545
    invoke-direct {v4, p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;-><init>(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)V

    .line 546
    .line 547
    .line 548
    iget-object v7, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 549
    .line 550
    invoke-virtual {v7, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    check-cast v7, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;

    .line 555
    .line 556
    if-nez v7, :cond_1b

    .line 557
    .line 558
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    if-eqz v5, :cond_1c

    .line 563
    .line 564
    new-instance v5, Ljava/lang/StringBuilder;

    .line 565
    .line 566
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 567
    .line 568
    .line 569
    const-string v7, "new CallIDOrderingStructure added for message "

    .line 570
    .line 571
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v5

    .line 581
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    goto :goto_d

    .line 585
    :cond_1b
    move-object v4, v7

    .line 586
    :cond_1c
    :goto_d
    invoke-virtual {v4}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;->getMessagesForCallID()Ljava/util/Queue;

    .line 587
    .line 588
    .line 589
    move-result-object v5

    .line 590
    invoke-interface {v5, v6}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->getPostParseExecutor()Ljava/util/concurrent/ExecutorService;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    new-instance v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;

    .line 598
    .line 599
    invoke-direct {v6, p0, v4, v3}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$Dispatch;-><init>(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_9
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 603
    .line 604
    .line 605
    goto/16 :goto_0

    .line 606
    .line 607
    :cond_1d
    :try_start_10
    new-instance v1, Ljava/lang/RuntimeException;

    .line 608
    .line 609
    new-instance v2, Ljava/lang/StringBuilder;

    .line 610
    .line 611
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 612
    .line 613
    .line 614
    const-string v4, "Bad content lenght header "

    .line 615
    .line 616
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    throw v1

    .line 630
    :goto_e
    sget-object v6, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 631
    .line 632
    invoke-interface {v6, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 633
    .line 634
    .line 635
    move-result v5

    .line 636
    if-eqz v5, :cond_0

    .line 637
    .line 638
    sget-object v5, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 639
    .line 640
    new-instance v6, Ljava/lang/StringBuilder;

    .line 641
    .line 642
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 643
    .line 644
    .line 645
    const-string v7, "Detected a parsing issue "

    .line 646
    .line 647
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    const-string v3, " "

    .line 658
    .line 659
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    invoke-interface {v5, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    goto/16 :goto_0

    .line 677
    .line 678
    :catch_4
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->getPostParseExecutor()Ljava/util/concurrent/ExecutorService;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    if-eqz v1, :cond_1f

    .line 683
    .line 684
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->isRunning:Z

    .line 685
    .line 686
    if-eqz v1, :cond_1f

    .line 687
    .line 688
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 689
    .line 690
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    if-eqz v1, :cond_1e

    .line 695
    .line 696
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 697
    .line 698
    new-instance v2, Ljava/lang/StringBuilder;

    .line 699
    .line 700
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 701
    .line 702
    .line 703
    const-string v3, "waiting for messagesOrderingMap "

    .line 704
    .line 705
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    const-string v3, " threadname "

    .line 712
    .line 713
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 717
    .line 718
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v3

    .line 722
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    :cond_1e
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 733
    .line 734
    monitor-enter v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 735
    :try_start_11
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 736
    .line 737
    invoke-virtual {v2, v7, v8}, Ljava/lang/Object;->wait(J)V
    :try_end_11
    .catch Ljava/lang/InterruptedException; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 738
    .line 739
    .line 740
    goto :goto_f

    .line 741
    :catchall_2
    move-exception v2

    .line 742
    goto :goto_10

    .line 743
    :catch_5
    :goto_f
    :try_start_12
    monitor-exit v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 744
    :try_start_13
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 745
    .line 746
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    if-eqz v1, :cond_1f

    .line 751
    .line 752
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 753
    .line 754
    new-instance v2, Ljava/lang/StringBuilder;

    .line 755
    .line 756
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 757
    .line 758
    .line 759
    const-string v3, "got notified for messagesOrderingMap "

    .line 760
    .line 761
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 765
    .line 766
    .line 767
    const-string v3, " threadname "

    .line 768
    .line 769
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 773
    .line 774
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 786
    .line 787
    .line 788
    goto :goto_11

    .line 789
    :goto_10
    :try_start_14
    monitor-exit v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    .line 790
    :try_start_15
    throw v2

    .line 791
    :cond_1f
    :goto_11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 792
    .line 793
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/parser/Pipeline;->stopTimer()V

    .line 794
    .line 795
    .line 796
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 797
    .line 798
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 799
    .line 800
    .line 801
    move-result v1

    .line 802
    if-eqz v1, :cond_20

    .line 803
    .line 804
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 805
    .line 806
    new-instance v2, Ljava/lang/StringBuilder;

    .line 807
    .line 808
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 809
    .line 810
    .line 811
    const-string v3, "thread ending for threadname "

    .line 812
    .line 813
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 817
    .line 818
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    :cond_20
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 833
    .line 834
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 835
    .line 836
    .line 837
    move-result v1

    .line 838
    if-eqz v1, :cond_21

    .line 839
    .line 840
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 841
    .line 842
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->logStackTrace(I)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 843
    .line 844
    .line 845
    :cond_21
    :try_start_16
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->cleanMessageOrderingMap()V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed()Z

    .line 849
    .line 850
    .line 851
    move-result p0

    .line 852
    if-nez p0, :cond_27

    .line 853
    .line 854
    :goto_12
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_6

    .line 855
    .line 856
    .line 857
    goto/16 :goto_16

    .line 858
    .line 859
    :catch_6
    move-exception p0

    .line 860
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 861
    .line 862
    .line 863
    goto/16 :goto_16

    .line 864
    .line 865
    :catch_7
    :try_start_17
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->getPostParseExecutor()Ljava/util/concurrent/ExecutorService;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    if-eqz v1, :cond_23

    .line 870
    .line 871
    iget-boolean v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->isRunning:Z

    .line 872
    .line 873
    if-eqz v1, :cond_23

    .line 874
    .line 875
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 876
    .line 877
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 878
    .line 879
    .line 880
    move-result v1

    .line 881
    if-eqz v1, :cond_22

    .line 882
    .line 883
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 884
    .line 885
    new-instance v2, Ljava/lang/StringBuilder;

    .line 886
    .line 887
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 888
    .line 889
    .line 890
    const-string v3, "waiting for messagesOrderingMap "

    .line 891
    .line 892
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    const-string v3, " threadname "

    .line 899
    .line 900
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 904
    .line 905
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v3

    .line 909
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    :cond_22
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 920
    .line 921
    monitor-enter v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 922
    :try_start_18
    iget-object v2, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->messagesOrderingMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 923
    .line 924
    invoke-virtual {v2, v7, v8}, Ljava/lang/Object;->wait(J)V
    :try_end_18
    .catch Ljava/lang/InterruptedException; {:try_start_18 .. :try_end_18} :catch_8
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    .line 925
    .line 926
    .line 927
    goto :goto_13

    .line 928
    :catchall_3
    move-exception v2

    .line 929
    goto :goto_14

    .line 930
    :catch_8
    :goto_13
    :try_start_19
    monitor-exit v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    .line 931
    :try_start_1a
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 932
    .line 933
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 934
    .line 935
    .line 936
    move-result v1

    .line 937
    if-eqz v1, :cond_23

    .line 938
    .line 939
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 940
    .line 941
    new-instance v2, Ljava/lang/StringBuilder;

    .line 942
    .line 943
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 944
    .line 945
    .line 946
    const-string v3, "got notified for messagesOrderingMap "

    .line 947
    .line 948
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 949
    .line 950
    .line 951
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 952
    .line 953
    .line 954
    const-string v3, " threadname "

    .line 955
    .line 956
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 957
    .line 958
    .line 959
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 960
    .line 961
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v3

    .line 965
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    .line 973
    .line 974
    .line 975
    goto :goto_15

    .line 976
    :goto_14
    :try_start_1b
    monitor-exit v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    .line 977
    :try_start_1c
    throw v2

    .line 978
    :cond_23
    :goto_15
    iget-object v1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->rawInputStream:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 979
    .line 980
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/parser/Pipeline;->stopTimer()V

    .line 981
    .line 982
    .line 983
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 984
    .line 985
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 986
    .line 987
    .line 988
    move-result v1

    .line 989
    if-eqz v1, :cond_24

    .line 990
    .line 991
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 992
    .line 993
    new-instance v2, Ljava/lang/StringBuilder;

    .line 994
    .line 995
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 996
    .line 997
    .line 998
    const-string v3, "thread ending for threadname "

    .line 999
    .line 1000
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1001
    .line 1002
    .line 1003
    iget-object v3, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->mythread:Ljava/lang/Thread;

    .line 1004
    .line 1005
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    :cond_24
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1020
    .line 1021
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v1

    .line 1025
    if-eqz v1, :cond_25

    .line 1026
    .line 1027
    sget-object v1, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1028
    .line 1029
    invoke-interface {v1, v5}, Landroid/gov/nist/core/StackLogger;->logStackTrace(I)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    .line 1030
    .line 1031
    .line 1032
    :cond_25
    :try_start_1d
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->cleanMessageOrderingMap()V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed()Z

    .line 1036
    .line 1037
    .line 1038
    move-result p0

    .line 1039
    if-nez p0, :cond_27

    .line 1040
    .line 1041
    goto/16 :goto_12

    .line 1042
    .line 1043
    :catch_9
    :cond_26
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->cleanMessageOrderingMap()V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed()Z

    .line 1047
    .line 1048
    .line 1049
    move-result p0
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_6

    .line 1050
    if-nez p0, :cond_27

    .line 1051
    .line 1052
    goto/16 :goto_12

    .line 1053
    .line 1054
    :cond_27
    :goto_16
    return-void

    .line 1055
    :goto_17
    :try_start_1e
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->cleanMessageOrderingMap()V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->isClosed()Z

    .line 1059
    .line 1060
    .line 1061
    move-result p0

    .line 1062
    if-nez p0, :cond_28

    .line 1063
    .line 1064
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->close()V
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_a

    .line 1065
    .line 1066
    .line 1067
    goto :goto_18

    .line 1068
    :catch_a
    move-exception p0

    .line 1069
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 1070
    .line 1071
    .line 1072
    :cond_28
    :goto_18
    throw v1
.end method

.method public setMessageListener(Landroid/gov/nist/javax/sip/parser/SIPMessageListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;->sipMessageListener:Landroid/gov/nist/javax/sip/parser/SIPMessageListener;

    .line 2
    .line 3
    return-void
.end method
