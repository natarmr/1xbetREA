.class Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/ThreadAffinityTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

.field final synthetic val$channel:Landroid/gov/nist/javax/sip/stack/RawMessageChannel;

.field final synthetic val$messageToSend:Landroid/gov/nist/javax/sip/message/SIPMessage;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;Landroid/gov/nist/javax/sip/stack/RawMessageChannel;Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$1;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 2
    .line 3
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$1;->val$channel:Landroid/gov/nist/javax/sip/stack/RawMessageChannel;

    .line 4
    .line 5
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$1;->val$messageToSend:Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$1;->val$messageToSend:Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

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

.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$1;->val$channel:Landroid/gov/nist/javax/sip/stack/RawMessageChannel;

    .line 2
    .line 3
    check-cast v0, Landroid/gov/nist/javax/sip/stack/TCPMessageChannel;

    .line 4
    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$1;->val$messageToSend:Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->clone()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 12
    .line 13
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl$1;->this$0:Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->getPeerInetAddress()Ljava/net/InetAddress;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, v1, p0}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/net/InetAddress;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p0

    .line 24
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPTransactionImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "Error self routing TCP message cause by: "

    .line 40
    .line 41
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method
