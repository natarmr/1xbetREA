.class public Landroid/gov/nist/javax/sip/header/Via;
.super Landroid/gov/nist/javax/sip/header/ParametersHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/ViaHeader;
.implements Landroid/gov/nist/javax/sip/header/ViaHeaderExt;


# static fields
.field public static final BRANCH:Ljava/lang/String; = "branch"

.field public static final MADDR:Ljava/lang/String; = "maddr"

.field public static final RECEIVED:Ljava/lang/String; = "received"

.field public static final RPORT:Ljava/lang/String; = "rport"

.field public static final TTL:Ljava/lang/String; = "ttl"

.field private static final serialVersionUID:J = 0x494c77f8c8b074d2L


# instance fields
.field protected comment:Ljava/lang/String;

.field protected sentBy:Landroid/gov/nist/core/HostPort;

.field protected sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Via"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/gov/nist/javax/sip/header/Protocol;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/Protocol;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/header/Via;

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/gov/nist/javax/sip/header/Protocol;

    .line 16
    .line 17
    iput-object v1, v0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/gov/nist/core/HostPort;->clone()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroid/gov/nist/core/HostPort;

    .line 28
    .line 29
    iput-object v1, v0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getRPort()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, -0x1

    .line 36
    if-eq v1, v2, :cond_2

    .line 37
    .line 38
    const-string v1, "rport"

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getRPort()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-virtual {v0, v1, p0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object v0
.end method

.method public encodeBody()Ljava/lang/String;
    .locals 1

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/Via;->encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/Protocol;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    const-string v0, " "

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/gov/nist/core/HostPort;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/gov/nist/core/NameValueList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const-string v1, ";"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Landroid/gov/nist/core/NameValueList;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Via;->comment:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, "("

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->comment:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p0, ")"

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroid/javax/sip/header/ViaHeader;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Landroid/javax/sip/header/ViaHeader;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getProtocol()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1}, Landroid/javax/sip/header/ViaHeader;->getProtocol()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getTransport()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {p1}, Landroid/javax/sip/header/ViaHeader;->getTransport()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getHost()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {p1}, Landroid/javax/sip/header/ViaHeader;->getHost()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getPort()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-interface {p1}, Landroid/javax/sip/header/ViaHeader;->getPort()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-ne v1, v3, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->equalParameters(Landroid/javax/sip/header/Parameters;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    return v0

    .line 71
    :cond_1
    return v2
.end method

.method public getBranch()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "branch"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getComment()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->comment:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHop()Landroid/javax/sip/address/Hop;
    .locals 3

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/stack/HopImpl;

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/gov/nist/core/HostPort;->getHost()Landroid/gov/nist/core/Host;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/gov/nist/core/Host;->getHostname()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/gov/nist/core/HostPort;->getPort()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Protocol;->getTransport()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, v1, v2, p0}, Landroid/gov/nist/javax/sip/stack/HopImpl;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public getHost()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->getHost()Landroid/gov/nist/core/Host;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/core/Host;->getHostname()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public getMAddr()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "maddr"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->getPort()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Protocol;->getProtocol()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getProtocolVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Protocol;->getProtocolVersion()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getRPort()I
    .locals 1

    .line 1
    const-string v0, "rport"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, -0x1

    .line 27
    return p0
.end method

.method public getReceived()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "received"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSentBy()Landroid/gov/nist/core/HostPort;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSentByField()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->encode()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getSentProtocol()Landroid/gov/nist/javax/sip/header/Protocol;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSentProtocolField()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Protocol;->encode()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getTTL()I
    .locals 1

    .line 1
    const-string v0, "ttl"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameterAsInt(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Protocol;->getTransport()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getViaParms()Landroid/gov/nist/core/NameValueList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasComment()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->comment:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public hasPort()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/Via;->getSentBy()Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->hasPort()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public removeComment()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->comment:Ljava/lang/String;

    .line 3
    .line 4
    return-void
.end method

.method public removePort()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->removePort()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBranch(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "branch"

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "JAIN-SIP Exception, Via, setBranch(), the branch parameter is null or length 0."

    .line 16
    .line 17
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setComment(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Via;->comment:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setHost(Landroid/gov/nist/core/Host;)V
    .locals 1

    .line 29
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Landroid/gov/nist/core/HostPort;

    invoke-direct {v0}, Landroid/gov/nist/core/HostPort;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 31
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    return-void
.end method

.method public setHost(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/core/HostPort;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/core/HostPort;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 11
    .line 12
    :cond_0
    :try_start_0
    new-instance v0, Landroid/gov/nist/core/Host;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    const-string p0, " host parameter is null"

    .line 24
    .line 25
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setMAddr(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroid/gov/nist/core/Host;

    .line 4
    .line 5
    invoke-direct {v0}, Landroid/gov/nist/core/Host;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/Host;->setAddress(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Landroid/gov/nist/core/NameValue;

    .line 12
    .line 13
    const-string v1, "maddr"

    .line 14
    .line 15
    invoke-direct {p1, v1, v0}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Landroid/gov/nist/core/NameValue;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "JAIN-SIP Exception, Via, setMAddr(), the mAddr parameter is null."

    .line 23
    .line 24
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setPort(I)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    const v0, 0xffff

    .line 8
    .line 9
    .line 10
    if-gt p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "Port value out of range -1, [1..65535]"

    .line 14
    .line 15
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    new-instance v0, Landroid/gov/nist/core/HostPort;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/gov/nist/core/HostPort;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 29
    .line 30
    :cond_2
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/HostPort;->setPort(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public setProtocol(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sip/header/Protocol;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/Protocol;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/Protocol;->setProtocol(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "JAIN-SIP Exception, Via, setProtocol(), the protocol parameter is null."

    .line 19
    .line 20
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setProtocolVersion(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/header/Protocol;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/Protocol;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/Protocol;->setProtocolVersion(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setRPort()V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "rport"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catch_0
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setReceived(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "received"

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "JAIN-SIP Exception, Via, setReceived(), the received parameter is null."

    .line 10
    .line 11
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setSentBy(Landroid/gov/nist/core/HostPort;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Via;->sentBy:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    return-void
.end method

.method public setSentProtocol(Landroid/gov/nist/javax/sip/header/Protocol;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 2
    .line 3
    return-void
.end method

.method public setTTL(I)V
    .locals 2

    .line 1
    if-gez p1, :cond_1

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string p0, "JAIN-SIP Exception, Via, setTTL(), the ttl parameter is < 0"

    .line 8
    .line 9
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Landroid/gov/nist/core/NameValue;

    .line 14
    .line 15
    const-string v1, "ttl"

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {v0, v1, p1}, Landroid/gov/nist/core/NameValue;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->setParameter(Landroid/gov/nist/core/NameValue;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setTransport(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sip/header/Protocol;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/Protocol;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Via;->sentProtocol:Landroid/gov/nist/javax/sip/header/Protocol;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/Protocol;->setTransport(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "JAIN-SIP Exception, Via, setTransport(), the transport parameter is null."

    .line 19
    .line 20
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
