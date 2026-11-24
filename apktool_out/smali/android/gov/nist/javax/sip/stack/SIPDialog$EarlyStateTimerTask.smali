.class Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "EarlyStateTimerTask"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public runTask()V
    .locals 3

    .line 1
    const-string v0, "EarlyStateTimerTask : Dialog state is "

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Landroid/javax/sip/DialogState;->EARLY:Landroid/javax/sip/DialogState;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/javax/sip/DialogState;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    invoke-static {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$300(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/16 v2, 0x20

    .line 29
    .line 30
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$EarlyStateTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getState()Landroid/javax/sip/DialogState;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {v1, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void

    .line 62
    :catch_0
    move-exception p0

    .line 63
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "Unexpected exception delivering event"

    .line 68
    .line 69
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
