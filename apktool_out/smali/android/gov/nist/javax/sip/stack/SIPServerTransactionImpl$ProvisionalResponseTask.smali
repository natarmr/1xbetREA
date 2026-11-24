.class Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProvisionalResponseTask"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

.field ticks:I

.field ticksLeft:I


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->ticks:I

    .line 8
    .line 9
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->ticksLeft:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getRequest()Landroid/javax/sip/message/Request;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    instance-of v0, p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallIdHeader()Landroid/javax/sip/header/CallIdHeader;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method

.method public runTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->isTerminated()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 10
    .line 11
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->ticksLeft:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, -0x1

    .line 24
    .line 25
    iput v1, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->ticksLeft:I

    .line 26
    .line 27
    const/4 v2, -0x1

    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->access$000(Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;)V

    .line 31
    .line 32
    .line 33
    iget v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->ticks:I

    .line 34
    .line 35
    mul-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->ticksLeft:I

    .line 38
    .line 39
    iput v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->ticks:I

    .line 40
    .line 41
    const/16 v1, 0x40

    .line 42
    .line 43
    if-lt v0, v1, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 46
    .line 47
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0, p0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->setState(I)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl$ProvisionalResponseTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPServerTransactionImpl;->fireTimeoutTimer()V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void
.end method
