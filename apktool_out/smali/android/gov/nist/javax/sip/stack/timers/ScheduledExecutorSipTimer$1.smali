.class Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;->schedulePurgeTaskIfNeeded()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer$1;->this$0:Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "Purging canceled timer tasks..."

    .line 18
    .line 19
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer$1;->this$0:Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;

    .line 23
    .line 24
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;->threadPoolExecutor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->purge()V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "Purging canceled timer tasks completed."

    .line 44
    .line 45
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :catch_0
    move-exception p0

    .line 50
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/timers/ScheduledExecutorSipTimer;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "failed to execute purge"

    .line 55
    .line 56
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
