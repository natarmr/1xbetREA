.class Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/RunnableScheduledFuture;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MDCFuture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/RunnableScheduledFuture<",
        "TV;>;"
    }
.end annotation


# instance fields
.field done:Z

.field runnable:Ljava/lang/Runnable;

.field task:Ljava/util/concurrent/RunnableScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/RunnableScheduledFuture<",
            "TV;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor;Ljava/lang/Runnable;Ljava/util/concurrent/RunnableScheduledFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "Ljava/util/concurrent/RunnableScheduledFuture<",
            "TV;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->this$0:Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->done:Z

    .line 8
    .line 9
    iput-object p3, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    .line 10
    .line 11
    iput-object p2, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->runnable:Ljava/lang/Runnable;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ljava/util/concurrent/Delayed;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->compareTo(Ljava/util/concurrent/Delayed;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public compareTo(Ljava/util/concurrent/Delayed;)I
    .locals 0

    .line 8
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public get()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TV;"
        }
    .end annotation

    .line 8
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    invoke-interface {p0, p1, p2, p3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getDelay(Ljava/util/concurrent/TimeUnit;)J
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public getRunnable()Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->runnable:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method public isCancelled()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isDone()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isPeriodic()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/concurrent/RunnableScheduledFuture;->isPeriodic()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public run()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/MDCScheduledTHExecutor$MDCFuture;->task:Ljava/util/concurrent/RunnableScheduledFuture;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/concurrent/RunnableFuture;->run()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
