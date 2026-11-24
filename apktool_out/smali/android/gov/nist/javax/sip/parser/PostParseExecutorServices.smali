.class public Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices$NamedThreadFactory;
    }
.end annotation


# static fields
.field private static postParseExecutor:Ljava/util/concurrent/ExecutorService;

.field public static staticQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public static staticQueueAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;


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

.method public static getPostParseExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->postParseExecutor:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public static setPostParseExcutorSize(Landroid/gov/nist/javax/sip/SipStackImpl;II)V
    .locals 9

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->postParseExecutor:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->staticQueueAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
    :cond_1
    if-gtz p1, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    sput-object p0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->postParseExecutor:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->staticQueue:Ljava/util/concurrent/BlockingQueue;

    .line 27
    .line 28
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 29
    .line 30
    sget-object v7, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->staticQueue:Ljava/util/concurrent/BlockingQueue;

    .line 31
    .line 32
    new-instance v8, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices$NamedThreadFactory;

    .line 33
    .line 34
    invoke-direct {v8}, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices$NamedThreadFactory;-><init>()V

    .line 35
    .line 36
    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 40
    .line 41
    move v3, p1

    .line 42
    move v2, p1

    .line 43
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 44
    .line 45
    .line 46
    sput-object v1, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->postParseExecutor:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getStackCongestionControlTimeout()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-lez p0, :cond_3

    .line 53
    .line 54
    new-instance p0, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 55
    .line 56
    sget-object p1, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->staticQueue:Ljava/util/concurrent/BlockingQueue;

    .line 57
    .line 58
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;-><init>(Ljava/util/Queue;)V

    .line 59
    .line 60
    .line 61
    sput-object p0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->staticQueueAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 62
    .line 63
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->setTimeout(I)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->staticQueueAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 67
    .line 68
    const/16 p1, 0x7d0

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->start(I)V

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_0
    return-void
.end method

.method public static shutdownThreadpool()V
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->postParseExecutor:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->postParseExecutor:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    :cond_0
    sget-object v0, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->staticQueueAuditor:Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/BlockingQueueDispatchAuditor;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    :cond_1
    return-void
.end method
