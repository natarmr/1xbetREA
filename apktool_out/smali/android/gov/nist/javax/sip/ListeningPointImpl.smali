.class public Landroid/gov/nist/javax/sip/ListeningPointImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/ListeningPoint;
.implements Landroid/gov/nist/javax/sip/ListeningPointExt;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field protected messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

.field port:I

.field protected sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

.field protected sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

.field protected transport:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/javax/sip/SipStack;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 5
    .line 6
    iput-object p1, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 7
    .line 8
    iput p2, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->port:I

    .line 9
    .line 10
    iput-object p3, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->transport:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public static makeKey(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, ":"

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p0, "/"

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 4
    .line 5
    iget v2, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->port:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Landroid/gov/nist/javax/sip/ListeningPointImpl;-><init>(Landroid/javax/sip/SipStack;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 12
    .line 13
    iput-object p0, v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 14
    .line 15
    return-object v0
.end method

.method public createContactHeader()Landroid/javax/sip/header/ContactHeader;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getIPAddress()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getPort()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 10
    .line 11
    invoke-direct {v2}, Landroid/gov/nist/javax/sip/address/SipUri;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v2, v0}, Landroid/javax/sip/address/SipURI;->setHost(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v2, v1}, Landroid/javax/sip/address/SipURI;->setPort(I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->transport:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {v2, p0}, Landroid/javax/sip/address/SipURI;->setTransportParam(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Landroid/gov/nist/javax/sip/header/Contact;

    .line 26
    .line 27
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/Contact;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setURI(Landroid/javax/sip/address/URI;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/Contact;->setAddress(Landroid/javax/sip/address/Address;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :catch_0
    const-string p0, "Unexpected exception"

    .line 43
    .line 44
    sget-object v0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    invoke-static {p0, v0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public createViaHeader()Landroid/javax/sip/header/ViaHeader;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getViaHeader()Landroid/gov/nist/javax/sip/header/Via;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getIPAddress()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getKey()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getIPAddress()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->port:I

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->transport:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1, p0}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->makeKey(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getMessageProcessor()Landroid/gov/nist/javax/sip/stack/MessageProcessor;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSentBy()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getSentBy()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getTransport()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getViaHeader()Landroid/gov/nist/javax/sip/header/Via;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getViaHeader()Landroid/gov/nist/javax/sip/header/Via;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public isSentBySet()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->isSentBySet()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public removeSipProvider()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 3
    .line 4
    return-void
.end method

.method public sendHeartbeat(Ljava/lang/String;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipStack:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAlive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Landroid/gov/nist/core/HostPort;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/gov/nist/core/HostPort;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroid/gov/nist/core/Host;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Landroid/gov/nist/core/HostPort;->setPort(I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->createMessageChannel(Landroid/gov/nist/core/HostPort;)Landroid/gov/nist/javax/sip/stack/MessageChannel;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance p1, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->setNullRequest()V

    .line 38
    .line 39
    .line 40
    instance-of p2, p0, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    move-object p2, p0

    .line 45
    check-cast p2, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;

    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->getKeepAliveTimeout()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/16 v2, 0x0

    .line 52
    .line 53
    cmp-long v2, v0, v2

    .line 54
    .line 55
    if-lez v2, :cond_1

    .line 56
    .line 57
    invoke-virtual {p2, v0, v1}, Landroid/gov/nist/javax/sip/stack/ConnectionOrientedMessageChannel;->rescheduleKeepAliveTimeout(J)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/MessageChannel;->sendMessage(Landroid/gov/nist/javax/sip/message/SIPMessage;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public setSentBy(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->setSentBy(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSipProvider(Landroid/gov/nist/javax/sip/SipProviderImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 2
    .line 3
    return-void
.end method
