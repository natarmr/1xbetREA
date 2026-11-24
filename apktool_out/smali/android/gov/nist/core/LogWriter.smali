.class public Landroid/gov/nist/core/LogWriter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/core/StackLogger;


# instance fields
.field private buildTimeStamp:Ljava/lang/String;

.field private configurationProperties:Ljava/util/Properties;

.field private lineCount:I

.field private logFileName:Ljava/lang/String;

.field private logger:La/yv00;

.field private volatile needsLogging:Z

.field private stackName:Ljava/lang/String;

.field protected traceLevel:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/core/LogWriter;->logFileName:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 9
    .line 10
    iput v0, p0, Landroid/gov/nist/core/LogWriter;->traceLevel:I

    .line 11
    .line 12
    return-void
.end method

.method private countLines(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    array-length v1, p1

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    aget-char v1, p1, v0

    .line 10
    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Landroid/gov/nist/core/LogWriter;->lineCount:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    iput v1, p0, Landroid/gov/nist/core/LogWriter;->lineCount:I

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-void
.end method

.method private enhanceMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance p0, Ljava/lang/Exception;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x3

    .line 11
    aget-object p0, p0, v0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, "."

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, "("

    .line 46
    .line 47
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, ":"

    .line 54
    .line 55
    const-string v1, ") ["

    .line 56
    .line 57
    invoke-static {p0, v0, v1, p1, v3}, La/w6x;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 58
    .line 59
    .line 60
    const-string p0, "]"

    .line 61
    .line 62
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method private setTraceLevel(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/core/LogWriter;->traceLevel:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public addAppender(La/dp3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public disableLogging()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 3
    .line 4
    return-void
.end method

.method public enableLogging()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 3
    .line 4
    return-void
.end method

.method public getLevel(I)La/dkz;
    .locals 0

    .line 1
    const/16 p0, 0x10

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    sget-object p0, La/dkz;->k:La/dkz;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x4

    .line 9
    if-ne p1, p0, :cond_1

    .line 10
    .line 11
    sget-object p0, La/dkz;->i:La/dkz;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    const/16 p0, 0x20

    .line 15
    .line 16
    if-ne p1, p0, :cond_2

    .line 17
    .line 18
    sget-object p0, La/dkz;->l:La/dkz;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_2
    const/16 p0, 0x40

    .line 22
    .line 23
    if-ne p1, p0, :cond_3

    .line 24
    .line 25
    sget-object p0, La/dkz;->n:La/dkz;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    sget-object p0, La/dkz;->g:La/dkz;

    .line 29
    .line 30
    return-object p0
.end method

.method public getLineCount()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/core/LogWriter;->lineCount:I

    .line 2
    .line 3
    return p0
.end method

.method public getLogPriority()La/lwb0;
    .locals 1

    .line 1
    iget p0, p0, Landroid/gov/nist/core/LogWriter;->traceLevel:I

    .line 2
    .line 3
    const/16 v0, 0x10

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    sget-object p0, La/lwb0;->e:La/dkz;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 v0, 0x4

    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    sget-object p0, La/lwb0;->d:La/dkz;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    const/16 v0, 0x20

    .line 17
    .line 18
    if-ne p0, v0, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    const/16 v0, 0x40

    .line 22
    .line 23
    if-ne p0, v0, :cond_3

    .line 24
    .line 25
    :goto_0
    sget-object p0, La/lwb0;->f:La/dkz;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    sget-object p0, La/lwb0;->c:La/dkz;

    .line 29
    .line 30
    return-object p0
.end method

.method public getLogger()La/yv00;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLoggerName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/yv00;->a:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public getTraceLevel()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/core/LogWriter;->traceLevel:I

    .line 2
    .line 3
    return p0
.end method

.method public isLoggingEnabled()Z
    .locals 0

    .line 13
    iget-boolean p0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    return p0
.end method

.method public isLoggingEnabled(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Landroid/gov/nist/core/LogWriter;->traceLevel:I

    .line 6
    .line 7
    if-gt p1, p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public logDebug(Ljava/lang/String;)V
    .locals 3

    .line 73
    iget-boolean v0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    if-eqz v0, :cond_1

    .line 74
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->enhanceMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 75
    iget v0, p0, Landroid/gov/nist/core/LogWriter;->lineCount:I

    if-nez v0, :cond_0

    .line 76
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "BUILD TIMESTAMP = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->buildTimeStamp:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/yv00;->a(Ljava/lang/String;)V

    .line 77
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Config Propeties = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->configurationProperties:Ljava/util/Properties;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La/yv00;->a(Ljava/lang/String;)V

    .line 78
    :cond_0
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->countLines(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    move-result-object p0

    invoke-virtual {p0, p1}, La/yv00;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public logDebug(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-boolean p2, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->enhanceMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p2, p0, Landroid/gov/nist/core/LogWriter;->lineCount:I

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "BUILD TIMESTAMP = "

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroid/gov/nist/core/LogWriter;->buildTimeStamp:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p2, v0}, La/yv00;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "Config Propeties = "

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Landroid/gov/nist/core/LogWriter;->configurationProperties:Ljava/util/Properties;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p2, v0}, La/yv00;->a(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->countLines(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const/4 p2, 0x0

    .line 67
    const/16 v0, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, p2, v0, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public logError(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->enhanceMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->countLines(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    const/16 v1, 0x28

    .line 14
    .line 15
    invoke-virtual {v0, p0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public logError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 19
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    move-result-object p0

    const/4 p2, 0x0

    const/16 v0, 0x28

    .line 20
    invoke-virtual {p0, p2, v0, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    return-void
.end method

.method public logException(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    const/16 v1, 0x28

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public logFatalError(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->enhanceMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->countLines(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, La/yv00;->c:La/p96;

    .line 13
    .line 14
    const/16 v1, 0x28

    .line 15
    .line 16
    invoke-virtual {v0, p0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public logInfo(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public logStackTrace()V
    .locals 1

    const/16 v0, 0x20

    .line 159
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/LogWriter;->logStackTrace(I)V

    return-void
.end method

.method public logStackTrace(I)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    new-instance v0, Ljava/io/StringWriter;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/io/PrintWriter;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/lang/Exception;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x1

    .line 25
    :goto_0
    array-length v4, v2

    .line 26
    if-ge v3, v4, :cond_0

    .line 27
    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v5, "["

    .line 31
    .line 32
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    aget-object v5, v2, v3

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v5, ":"

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    aget-object v5, v2, v3

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v5, "]"

    .line 59
    .line 60
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/LogWriter;->getLevel(I)La/dkz;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogPriority()La/lwb0;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget v2, p1, La/lwb0;->a:I

    .line 93
    .line 94
    iget v1, v1, La/lwb0;->a:I

    .line 95
    .line 96
    if-lt v2, v1, :cond_7

    .line 97
    .line 98
    iget-object p0, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget v1, p1, La/lwb0;->a:I

    .line 104
    .line 105
    const/16 v2, 0x1388

    .line 106
    .line 107
    if-eq v1, v2, :cond_5

    .line 108
    .line 109
    const/16 v2, 0x26ac

    .line 110
    .line 111
    if-eq v1, v2, :cond_5

    .line 112
    .line 113
    const/16 v2, 0x2710

    .line 114
    .line 115
    if-eq v1, v2, :cond_4

    .line 116
    .line 117
    const/16 v2, 0x4e20

    .line 118
    .line 119
    if-eq v1, v2, :cond_3

    .line 120
    .line 121
    const/16 v2, 0x7530

    .line 122
    .line 123
    if-eq v1, v2, :cond_2

    .line 124
    .line 125
    const v2, 0x9c40

    .line 126
    .line 127
    .line 128
    const/16 v3, 0x28

    .line 129
    .line 130
    if-eq v1, v2, :cond_6

    .line 131
    .line 132
    const v2, 0xc350

    .line 133
    .line 134
    .line 135
    if-ne v1, v2, :cond_1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    const-string p0, "Unknown Priority "

    .line 139
    .line 140
    invoke-static {p1, p0}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_2
    const/16 v3, 0x1e

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    const/16 v3, 0x14

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_4
    const/16 v3, 0xa

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_5
    const/4 v3, 0x0

    .line 154
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 155
    invoke-virtual {p0, p1, v3, v0}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_7
    return-void
.end method

.method public logTrace(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->enhanceMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v0, p0, Landroid/gov/nist/core/LogWriter;->lineCount:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "BUILD TIMESTAMP = "

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->buildTimeStamp:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, La/yv00;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v2, "Config Propeties = "

    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->configurationProperties:Ljava/util/Properties;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, La/yv00;->a(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-direct {p0, p1}, Landroid/gov/nist/core/LogWriter;->countLines(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const/4 v0, 0x0

    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-virtual {p0, v0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
.end method

.method public logWarning(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setBuildTimeStamp(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/core/LogWriter;->buildTimeStamp:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setStackProperties(Ljava/util/Properties;)V
    .locals 7

    .line 1
    iput-object p1, p0, Landroid/gov/nist/core/LogWriter;->configurationProperties:Ljava/util/Properties;

    .line 2
    .line 3
    const-string v0, "android.gov.nist.javax.sip.TRACE_LEVEL"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "android.gov.nist.javax.sip.DEBUG_LOG"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, Landroid/gov/nist/core/LogWriter;->logFileName:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "android.javax.sip.STACK_NAME"

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Landroid/gov/nist/core/LogWriter;->stackName:Ljava/lang/String;

    .line 24
    .line 25
    const-string v2, "android.gov.nist.javax.sip.LOG4J_LOGGER_NAME"

    .line 26
    .line 27
    invoke-virtual {p1, v2, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget v2, La/yv00;->d:I

    .line 32
    .line 33
    invoke-static {v1}, La/xu00;->a(Ljava/lang/String;)La/yv00;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-eqz v0, :cond_d

    .line 41
    .line 42
    const-string v2, "LOG4J"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    sput-boolean v1, Landroid/gov/nist/core/CommonLogger;->useLegacyLogger:Z

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    :try_start_0
    const-string v2, "TRACE"

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/4 v3, 0x4

    .line 60
    const/16 v4, 0x10

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    const/16 v6, 0x20

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    sput-boolean v5, Landroid/gov/nist/core/Debug;->debug:Z

    .line 68
    .line 69
    invoke-static {p0}, Landroid/gov/nist/core/Debug;->setStackLogger(Landroid/gov/nist/core/StackLogger;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    move v2, v6

    .line 73
    goto :goto_2

    .line 74
    :catch_0
    move-exception p1

    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :cond_1
    const-string v2, "DEBUG"

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const-string v2, "INFO"

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    move v2, v4

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    const-string v2, "ERROR"

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    move v2, v3

    .line 105
    goto :goto_2

    .line 106
    :cond_4
    const-string v2, "NONE"

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_6

    .line 113
    .line 114
    const-string v2, "OFF"

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_5

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-le v2, v6, :cond_7

    .line 128
    .line 129
    sput-boolean v5, Landroid/gov/nist/core/Debug;->debug:Z

    .line 130
    .line 131
    invoke-static {p0}, Landroid/gov/nist/core/Debug;->setStackLogger(Landroid/gov/nist/core/StackLogger;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    :goto_1
    move v2, v1

    .line 136
    :cond_7
    :goto_2
    invoke-direct {p0, v2}, Landroid/gov/nist/core/LogWriter;->setTraceLevel(I)V

    .line 137
    .line 138
    .line 139
    iput-boolean v5, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 140
    .line 141
    iget v2, p0, Landroid/gov/nist/core/LogWriter;->traceLevel:I

    .line 142
    .line 143
    if-ne v2, v6, :cond_8

    .line 144
    .line 145
    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_8
    if-ne v2, v4, :cond_9

    .line 152
    .line 153
    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_9
    if-ne v2, v3, :cond_a

    .line 160
    .line 161
    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_a
    if-nez v2, :cond_b

    .line 168
    .line 169
    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iput-boolean v1, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 175
    .line 176
    :cond_b
    :goto_3
    iget-boolean v2, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 177
    .line 178
    if-eqz v2, :cond_c

    .line 179
    .line 180
    iget-object v2, p0, Landroid/gov/nist/core/LogWriter;->logFileName:Ljava/lang/String;

    .line 181
    .line 182
    if-eqz v2, :cond_c

    .line 183
    .line 184
    const-string v2, "android.gov.nist.javax.sip.DEBUG_LOG_OVERWRITE"

    .line 185
    .line 186
    invoke-virtual {p1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    .line 196
    .line 197
    const/4 p1, 0x0

    .line 198
    :try_start_1
    new-instance v2, La/bek;

    .line 199
    .line 200
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 201
    .line 202
    .line 203
    :goto_4
    move-object p1, v2

    .line 204
    goto :goto_5

    .line 205
    :catch_1
    move-exception v2

    .line 206
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :catch_2
    new-instance v2, Ljava/io/File;

    .line 211
    .line 212
    iget-object v3, p0, Landroid/gov/nist/core/LogWriter;->logFileName:Ljava/lang/String;

    .line 213
    .line 214
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 225
    .line 226
    .line 227
    :try_start_3
    new-instance v2, La/bek;

    .line 228
    .line 229
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :catch_3
    move-exception v2

    .line 234
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 235
    .line 236
    .line 237
    :goto_5
    if-eqz p1, :cond_c

    .line 238
    .line 239
    iget-object p1, p0, Landroid/gov/nist/core/LogWriter;->logger:La/yv00;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 246
    .line 247
    .line 248
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 249
    .line 250
    const-string v2, "LogWriter: Bad integer "

    .line 251
    .line 252
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 260
    .line 261
    const-string v0, "logging dislabled "

    .line 262
    .line 263
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    iput-boolean v1, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 267
    .line 268
    :cond_c
    :goto_7
    return-void

    .line 269
    :cond_d
    iput-boolean v1, p0, Landroid/gov/nist/core/LogWriter;->needsLogging:Z

    .line 270
    .line 271
    return-void
.end method
