.class public Landroid/gov/nist/core/CommonLoggerLog4j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/core/StackLogger;


# instance fields
.field private logger:La/yv00;


# direct methods
.method public constructor <init>(La/yv00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 5
    .line 6
    return-void
.end method

.method public static intToLevel(I)La/dkz;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eq p0, v0, :cond_5

    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    if-eq p0, v0, :cond_4

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    if-eq p0, v0, :cond_3

    .line 10
    .line 11
    const/16 v0, 0x10

    .line 12
    .line 13
    if-eq p0, v0, :cond_2

    .line 14
    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x40

    .line 20
    .line 21
    if-eq p0, v0, :cond_0

    .line 22
    .line 23
    sget-object p0, La/dkz;->g:La/dkz;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object p0, La/dkz;->m:La/dkz;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object p0, La/dkz;->l:La/dkz;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    sget-object p0, La/dkz;->k:La/dkz;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    sget-object p0, La/dkz;->j:La/dkz;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_4
    sget-object p0, La/dkz;->i:La/dkz;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_5
    sget-object p0, La/dkz;->h:La/dkz;

    .line 42
    .line 43
    return-object p0
.end method

.method public static levelToInt(La/dkz;)I
    .locals 1

    .line 1
    sget-object v0, La/dkz;->k:La/dkz;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/lwb0;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x10

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    sget-object v0, La/dkz;->i:La/dkz;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/lwb0;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x4

    .line 21
    return p0

    .line 22
    :cond_1
    sget-object v0, La/dkz;->l:La/dkz;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/lwb0;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const/16 p0, 0x20

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    sget-object v0, La/dkz;->j:La/dkz;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, La/lwb0;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    const/16 p0, 0x8

    .line 42
    .line 43
    return p0

    .line 44
    :cond_3
    sget-object v0, La/dkz;->m:La/dkz;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, La/lwb0;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    const/16 p0, 0x40

    .line 53
    .line 54
    return p0

    .line 55
    :cond_4
    sget-object v0, La/dkz;->h:La/dkz;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, La/lwb0;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_5

    .line 62
    .line 63
    const/4 p0, 0x2

    .line 64
    return p0

    .line 65
    :cond_5
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method private setTraceLevel(I)V
    .locals 0

    return-void
.end method


# virtual methods
.method public addAppender(La/dp3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public disableLogging()V
    .locals 0

    return-void
.end method

.method public enableLogging()V
    .locals 0

    return-void
.end method

.method public getLineCount()I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public getLogger()La/yv00;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLoggerName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

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
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    invoke-static {p0}, Landroid/gov/nist/core/CommonLoggerLog4j;->levelToInt(La/dkz;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public isLoggingEnabled()Z
    .locals 0

    .line 69
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 70
    iget-object p0, p0, La/yv00;->b:La/zv00;

    .line 71
    invoke-interface {p0}, La/zv00;->e()Z

    move-result p0

    return p0
.end method

.method public isLoggingEnabled(I)Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/gov/nist/core/CommonLoggerLog4j;->intToLevel(I)La/dkz;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, La/yv00;->b:La/zv00;

    .line 8
    .line 9
    iget p1, p1, La/lwb0;->a:I

    .line 10
    .line 11
    const/16 v0, 0x1388

    .line 12
    .line 13
    if-eq p1, v0, :cond_5

    .line 14
    .line 15
    const/16 v0, 0x2710

    .line 16
    .line 17
    if-eq p1, v0, :cond_4

    .line 18
    .line 19
    const/16 v0, 0x4e20

    .line 20
    .line 21
    if-eq p1, v0, :cond_3

    .line 22
    .line 23
    const/16 v0, 0x7530

    .line 24
    .line 25
    if-eq p1, v0, :cond_2

    .line 26
    .line 27
    const v0, 0x9c40

    .line 28
    .line 29
    .line 30
    if-eq p1, v0, :cond_1

    .line 31
    .line 32
    const v0, 0xc350

    .line 33
    .line 34
    .line 35
    if-eq p1, v0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_0
    invoke-interface {p0}, La/zv00;->i()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_1
    invoke-interface {p0}, La/zv00;->i()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :cond_2
    invoke-interface {p0}, La/zv00;->a()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0

    .line 54
    :cond_3
    invoke-interface {p0}, La/zv00;->e()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_4
    invoke-interface {p0}, La/zv00;->b()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0

    .line 64
    :cond_5
    invoke-interface {p0}, La/zv00;->f()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0
.end method

.method public logDebug(Ljava/lang/String;)V
    .locals 0

    .line 10
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    invoke-virtual {p0, p1}, La/yv00;->a(Ljava/lang/String;)V

    return-void
.end method

.method public logDebug(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    invoke-virtual {p0, p2, v0, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public logError(Ljava/lang/String;)V
    .locals 2

    .line 12
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    const/4 v0, 0x0

    const/16 v1, 0x28

    .line 13
    invoke-virtual {p0, v0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    return-void
.end method

.method public logError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/CommonLoggerLog4j;->getLogger()La/yv00;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p2, 0x0

    .line 6
    const/16 v0, 0x28

    .line 7
    .line 8
    invoke-virtual {p0, p2, v0, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public logException(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    const/16 v0, 0x28

    .line 5
    .line 6
    const-string v1, "Error"

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public logFatalError(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    sget-object v0, La/yv00;->c:La/p96;

    .line 4
    .line 5
    const/16 v1, 0x28

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public logInfo(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/CommonLoggerLog4j;->getLogger()La/yv00;

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

    .line 86
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/CommonLoggerLog4j;->logStackTrace(I)V

    return-void
.end method

.method public logStackTrace(I)V
    .locals 5

    .line 1
    new-instance p1, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/PrintWriter;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/lang/Exception;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    :goto_0
    array-length v3, v1

    .line 22
    if-ge v2, v3, :cond_0

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v4, "["

    .line 27
    .line 28
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    aget-object v4, v1, v2

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v4, ":"

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    aget-object v4, v1, v2

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v4, "]"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v0, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v0}, Ljava/io/PrintWriter;->close()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, La/yv00;->a(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public logTrace(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/yv00;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public logWarning(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/CommonLoggerLog4j;->getLogger()La/yv00;

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
    .locals 2

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/CommonLoggerLog4j;->logger:La/yv00;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Build timestamp: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v1, 0x14

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1, p1}, La/yv00;->b(La/p96;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setStackProperties(Ljava/util/Properties;)V
    .locals 0

    return-void
.end method
