.class Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TransactionSemaphore"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x16ad7df07e3eb884L


# instance fields
.field lock:Ljava/util/concurrent/locks/ReentrantLock;

.field sem:Ljava/util/concurrent/Semaphore;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->sem:Ljava/util/concurrent/Semaphore;

    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 10
    .line 11
    iget-object p1, p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 12
    .line 13
    check-cast p1, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/SipStackImpl;->isReEntrantListener()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance p1, Ljava/util/concurrent/Semaphore;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, v0, v0}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->sem:Ljava/util/concurrent/Semaphore;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public acquire()Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 4
    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->isReEntrantListener()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->sem:Ljava/util/concurrent/Semaphore;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "Unexpected exception acquiring sem"

    .line 32
    .line 33
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public release()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 4
    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->isReEntrantListener()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->sem:Ljava/util/concurrent/Semaphore;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p0

    .line 34
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "Unexpected exception releasing sem"

    .line 39
    .line 40
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public tryAcquire()Z
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 2
    .line 3
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 4
    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipStackImpl;->isReEntrantListener()Z

    .line 8
    .line 9
    .line 10
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 16
    .line 17
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 18
    .line 19
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 20
    .line 21
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxListenerResponseTime:I

    .line 22
    .line 23
    int-to-long v2, p0

    .line 24
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock(JLjava/util/concurrent/TimeUnit;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->sem:Ljava/util/concurrent/Semaphore;

    .line 30
    .line 31
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$TransactionSemaphore;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 32
    .line 33
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 34
    .line 35
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxListenerResponseTime:I

    .line 36
    .line 37
    int-to-long v2, p0

    .line 38
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 39
    .line 40
    .line 41
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 42
    return p0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "Unexpected exception trying acquiring sem"

    .line 49
    .line 50
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return p0
.end method
