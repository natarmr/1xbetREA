.class public Landroid/gov/nist/core/Debug;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static debug:Z = false

.field public static parserDebug:Z = false

.field static stackLogger:Landroid/gov/nist/core/StackLogger;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static logError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/Debug;->parserDebug:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Landroid/gov/nist/core/Debug;->debug:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    sget-object v0, Landroid/gov/nist/core/Debug;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Landroid/gov/nist/core/Debug;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    invoke-interface {v0, p0, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public static printStackTrace(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/Debug;->parserDebug:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Landroid/gov/nist/core/Debug;->debug:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    sget-object v0, Landroid/gov/nist/core/Debug;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-string v1, "Stack Trace"

    .line 14
    .line 15
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public static println(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Landroid/gov/nist/core/Debug;->parserDebug:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Landroid/gov/nist/core/Debug;->debug:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    sget-object v0, Landroid/gov/nist/core/Debug;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Landroid/gov/nist/core/Debug;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, "\n"

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public static setStackLogger(Landroid/gov/nist/core/StackLogger;)V
    .locals 0

    .line 1
    sput-object p0, Landroid/gov/nist/core/Debug;->stackLogger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-void
.end method
