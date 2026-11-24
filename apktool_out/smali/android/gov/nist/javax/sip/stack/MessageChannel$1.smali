.class Landroid/gov/nist/javax/sip/stack/MessageChannel$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/ThreadAffinityTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;Landroid/javax/sip/address/Hop;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/MessageChannel;

.field final synthetic val$channel:Landroid/gov/nist/javax/sip/stack/RawMessageChannel;

.field final synthetic val$sipMessage:Landroid/gov/nist/javax/sip/message/SIPMessage;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/MessageChannel;Landroid/gov/nist/javax/sip/stack/RawMessageChannel;Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel$1;->this$0:Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 2
    .line 3
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel$1;->val$channel:Landroid/gov/nist/javax/sip/stack/RawMessageChannel;

    .line 4
    .line 5
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel$1;->val$sipMessage:Landroid/gov/nist/javax/sip/message/SIPMessage;

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
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel$1;->val$sipMessage:Landroid/gov/nist/javax/sip/message/SIPMessage;

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
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel$1;->val$channel:Landroid/gov/nist/javax/sip/stack/RawMessageChannel;

    .line 2
    .line 3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageChannel$1;->val$sipMessage:Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->clone()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 10
    .line 11
    invoke-interface {v0, p0}, Landroid/gov/nist/javax/sip/stack/RawMessageChannel;->processMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p0

    .line 16
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x4

    .line 21
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "Error self routing message cause by: "

    .line 32
    .line 33
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
