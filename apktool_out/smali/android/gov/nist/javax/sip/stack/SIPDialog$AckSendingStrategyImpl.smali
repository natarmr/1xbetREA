.class public Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/AckSendingStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AckSendingStrategyImpl"
.end annotation


# instance fields
.field private hop:Landroid/javax/sip/address/Hop;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->hop:Landroid/javax/sip/address/Hop;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public getLastHop()Landroid/javax/sip/address/Hop;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->hop:Landroid/javax/sip/address/Hop;

    .line 2
    .line 3
    return-object p0
.end method

.method public send(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$000(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getNextHop(Landroid/gov/nist/javax/sip/message/SIPRequest;)Landroid/javax/sip/address/Hop;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->hop:Landroid/javax/sip/address/Hop;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/16 v1, 0x20

    .line 20
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
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "hop = "

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->hop:Landroid/javax/sip/address/Hop;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 51
    .line 52
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$200(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->hop:Landroid/javax/sip/address/Hop;

    .line 57
    .line 58
    invoke-interface {v1}, Landroid/javax/sip/address/Hop;->getTransport()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getListeningPoint(Ljava/lang/String;)Landroid/javax/sip/ListeningPoint;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->hop:Landroid/javax/sip/address/Hop;

    .line 71
    .line 72
    invoke-interface {v1}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->hop:Landroid/javax/sip/address/Hop;

    .line 85
    .line 86
    invoke-interface {p0}, Landroid/javax/sip/address/Hop;->getPort()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-virtual {v0, v1, p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->createMessageChannel(Ljava/net/InetAddress;I)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    new-instance p1, Landroid/javax/sip/SipException;

    .line 99
    .line 100
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$AckSendingStrategyImpl;->hop:Landroid/javax/sip/address/Hop;

    .line 101
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v1, "No listening point for this provider registered at "

    .line 105
    .line 106
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-direct {p1, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_2
    const-string p0, "No route!"

    .line 121
    .line 122
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method
