.class Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MaxTxLifeTimeListener"
.end annotation


# instance fields
.field sipTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->sipTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

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
    .locals 4

    .line 1
    const-string v0, "Fired MaxTxLifeTimeListener for tx "

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->sipTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, " , tx id "

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->sipTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 35
    .line 36
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTransactionId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, " , state "

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->sipTransaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 49
    .line 50
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->raiseErrorEvent(I)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$LingerTimer;

    .line 71
    .line 72
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 73
    .line 74
    invoke-direct {v0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$LingerTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 78
    .line 79
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getConnectionLingerTimer()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 88
    .line 89
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 96
    .line 97
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getConnectionLingerTimer()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    mul-int/lit16 v2, v2, 0x3e8

    .line 104
    .line 105
    int-to-long v2, v2

    .line 106
    invoke-interface {v1, v0, v2, v3}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$LingerTimer;->runTask()V

    .line 111
    .line 112
    .line 113
    :goto_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    invoke-static {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$102(Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;)Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$MaxTxLifeTimeListener;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catch_0
    move-exception p0

    .line 121
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v1, "unexpected exception"

    .line 126
    .line 127
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method
