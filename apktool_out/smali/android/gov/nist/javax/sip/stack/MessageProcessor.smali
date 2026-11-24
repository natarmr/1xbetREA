.class public abstract Landroid/gov/nist/javax/sip/stack/MessageProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final IN6_ADDR_ANY:Ljava/lang/String; = "::0"

.field protected static final IN_ADDR_ANY:Ljava/lang/String; = "0.0.0.0"

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private ipAddress:Ljava/net/InetAddress;

.field private listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

.field private port:I

.field private savedIpAddress:Ljava/lang/String;

.field private sentBy:Ljava/lang/String;

.field private sentByHostPort:Landroid/gov/nist/core/HostPort;

.field private sentBySet:Z

.field protected sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

.field protected transport:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->transport:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/net/InetAddress;ILjava/lang/String;Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p4}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->initialize(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static getDefaultPort(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "TLS"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/16 p0, 0x13c5

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/16 p0, 0x13c4

    .line 13
    .line 14
    return p0
.end method


# virtual methods
.method public abstract createMessageChannel(Landroid/gov/nist/core/HostPort;)Landroid/gov/nist/javax/sip/stack/MessageChannel;
.end method

.method public abstract createMessageChannel(Ljava/net/InetAddress;I)Landroid/gov/nist/javax/sip/stack/MessageChannel;
.end method

.method public abstract getDefaultTargetPort()I
.end method

.method public getIpAddress()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->ipAddress:Ljava/net/InetAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getListeningPoint()Landroid/gov/nist/javax/sip/ListeningPointImpl;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 6
    .line 7
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "getListeningPoint"

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " returning null listeningpoint"

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 38
    .line 39
    return-object p0
.end method

.method public abstract getMaximumMessageSize()I
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->port:I

    .line 2
    .line 3
    return p0
.end method

.method public abstract getSIPStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
.end method

.method public getSavedIpAddress()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->savedIpAddress:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSentBy()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentBy:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentByHostPort:Landroid/gov/nist/core/HostPort;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/gov/nist/core/HostPort;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentBy:Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->transport:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getViaHeader()Landroid/gov/nist/javax/sip/header/Via;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Landroid/gov/nist/javax/sip/header/Via;

    .line 3
    .line 4
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/header/Via;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentByHostPort:Landroid/gov/nist/core/HostPort;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/Via;->setSentBy(Landroid/gov/nist/core/HostPort;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getTransport()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sip/header/Via;->setTransport(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :catch_0
    move-exception p0

    .line 23
    goto :goto_0

    .line 24
    :catch_1
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    new-instance v2, Landroid/gov/nist/core/Host;

    .line 27
    .line 28
    invoke-direct {v2}, Landroid/gov/nist/core/Host;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getIpAddress()Ljava/net/InetAddress;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Landroid/gov/nist/core/Host;->setHostname(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/Via;->setHost(Landroid/gov/nist/core/Host;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/header/Via;->setPort(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getTransport()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v1, p0}, Landroid/gov/nist/javax/sip/header/Via;->setTransport(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 65
    .line 66
    .line 67
    return-object v0
.end method

.method public abstract inUse()Z
.end method

.method public final initialize(Ljava/net/InetAddress;ILandroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V
    .locals 1

    .line 1
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->savedIpAddress:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->ipAddress:Ljava/net/InetAddress;

    .line 10
    .line 11
    iput p2, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->port:I

    .line 12
    .line 13
    new-instance p3, Landroid/gov/nist/core/HostPort;

    .line 14
    .line 15
    invoke-direct {p3}, Landroid/gov/nist/core/HostPort;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentByHostPort:Landroid/gov/nist/core/HostPort;

    .line 19
    .line 20
    new-instance v0, Landroid/gov/nist/core/Host;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v0, p1}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3, v0}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentByHostPort:Landroid/gov/nist/core/HostPort;

    .line 33
    .line 34
    invoke-virtual {p0, p2}, Landroid/gov/nist/core/HostPort;->setPort(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public abstract isSecure()Z
.end method

.method public isSentBySet()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentBySet:Z

    .line 2
    .line 3
    return p0
.end method

.method public setIpAddress(Ljava/net/InetAddress;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentByHostPort:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    new-instance v1, Landroid/gov/nist/core/Host;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->ipAddress:Ljava/net/InetAddress;

    .line 16
    .line 17
    return-void
.end method

.method public setListeningPoint(Landroid/gov/nist/javax/sip/ListeningPointImpl;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "setListeningPoint"

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, " listeningPoint = "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getPort()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->getPort()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eq v0, v1, :cond_1

    .line 47
    .line 48
    const-string v0, "lp mismatch with provider"

    .line 49
    .line 50
    sget-object v1, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->logger:Landroid/gov/nist/core/StackLogger;

    .line 51
    .line 52
    invoke-static {v0, v1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->listeningPoint:Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 56
    .line 57
    return-void
.end method

.method public setSentBy(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/gov/nist/core/HostPort;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/gov/nist/core/HostPort;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentByHostPort:Landroid/gov/nist/core/HostPort;

    .line 16
    .line 17
    new-instance v1, Landroid/gov/nist/core/Host;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v1, Landroid/gov/nist/core/HostPort;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/gov/nist/core/HostPort;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentByHostPort:Landroid/gov/nist/core/HostPort;

    .line 32
    .line 33
    new-instance v2, Landroid/gov/nist/core/Host;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-direct {v2, v3}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v0, 0x1

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentByHostPort:Landroid/gov/nist/core/HostPort;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroid/gov/nist/core/HostPort;->setPort(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    :goto_0
    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentBySet:Z

    .line 63
    .line 64
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->sentBy:Ljava/lang/String;

    .line 65
    .line 66
    return-void

    .line 67
    :catch_0
    const-string p0, "Bad format encountered at "

    .line 68
    .line 69
    invoke-static {v0, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method
