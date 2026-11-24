.class public Landroid/gov/nist/core/CommonLogger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/core/StackLogger;


# static fields
.field public static legacyLogger:Landroid/gov/nist/core/StackLogger; = null

.field public static useLegacyLogger:Z = true


# instance fields
.field private name:Ljava/lang/String;

.field private otherLogger:Landroid/gov/nist/core/StackLogger;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/gov/nist/core/CommonLogger;->name:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/String;)Landroid/gov/nist/core/StackLogger;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static getLogger(Ljava/lang/String;)Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 10
    new-instance v0, Landroid/gov/nist/core/CommonLogger;

    invoke-direct {v0, p0}, Landroid/gov/nist/core/CommonLogger;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static init(Ljava/util/Properties;)V
    .locals 0

    return-void
.end method

.method private logger()Landroid/gov/nist/core/StackLogger;
    .locals 3

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/CommonLogger;->useLegacyLogger:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Landroid/gov/nist/core/CommonLogger;->legacyLogger:Landroid/gov/nist/core/StackLogger;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/gov/nist/core/CommonLoggerLog4j;

    .line 10
    .line 11
    iget-object p0, p0, Landroid/gov/nist/core/CommonLogger;->name:Ljava/lang/String;

    .line 12
    .line 13
    sget v1, La/yv00;->d:I

    .line 14
    .line 15
    invoke-static {p0}, La/xu00;->a(Ljava/lang/String;)La/yv00;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Landroid/gov/nist/core/CommonLoggerLog4j;-><init>(La/yv00;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v0

    .line 23
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/core/CommonLogger;->otherLogger:Landroid/gov/nist/core/StackLogger;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    new-instance v0, Landroid/gov/nist/core/CommonLoggerLog4j;

    .line 28
    .line 29
    iget-object v1, p0, Landroid/gov/nist/core/CommonLogger;->name:Ljava/lang/String;

    .line 30
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
    invoke-direct {v0, v1}, Landroid/gov/nist/core/CommonLoggerLog4j;-><init>(La/yv00;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroid/gov/nist/core/CommonLogger;->otherLogger:Landroid/gov/nist/core/StackLogger;

    .line 41
    .line 42
    :cond_2
    return-object v0
.end method


# virtual methods
.method public disableLogging()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->disableLogging()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public enableLogging()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->enableLogging()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getLineCount()I
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->getLineCount()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getLoggerName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->getLoggerName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public isLoggingEnabled()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isLoggingEnabled(I)Z
    .locals 0

    .line 10
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    move-result-object p0

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    move-result p0

    return p0
.end method

.method public logDebug(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public logDebug(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public logError(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public logError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public logException(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logException(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public logFatalError(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logFatalError(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public logInfo(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public logStackTrace()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public logStackTrace(I)V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    move-result-object p0

    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logStackTrace(I)V

    return-void
.end method

.method public logTrace(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logTrace(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public logWarning(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBuildTimeStamp(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/CommonLogger;->logger()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->setBuildTimeStamp(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setStackProperties(Ljava/util/Properties;)V
    .locals 0

    .line 1
    sget-object p0, Landroid/gov/nist/core/CommonLogger;->legacyLogger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->setStackProperties(Ljava/util/Properties;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
