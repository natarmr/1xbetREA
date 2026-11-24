.class public Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "PingTimer"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

.field threadHandle:Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->threadHandle:Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public runTask()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->threadHandle:Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/gov/nist/core/ThreadAuditor;->addCurrentThread()Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->threadHandle:Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->threadHandle:Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->ping()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;

    .line 45
    .line 46
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 47
    .line 48
    iget-object v3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->threadHandle:Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 49
    .line 50
    invoke-direct {v1, v2, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;->threadHandle:Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;->getPingIntervalInMillisecs()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-interface {v0, v1, v2, v3}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method
