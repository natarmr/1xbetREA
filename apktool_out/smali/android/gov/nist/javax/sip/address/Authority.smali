.class public Landroid/gov/nist/javax/sip/address/Authority;
.super Landroid/gov/nist/javax/sip/address/NetObject;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x318c6e34baa9fca6L


# instance fields
.field protected hostPort:Landroid/gov/nist/core/HostPort;

.field protected userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/address/NetObject;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/address/Authority;

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/gov/nist/core/HostPort;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/gov/nist/core/HostPort;

    .line 16
    .line 17
    iput-object v1, v0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 18
    .line 19
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 28
    .line 29
    iput-object p0, v0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 30
    .line 31
    :cond_1
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/Authority;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/UserInfo;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    const-string v0, "@"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/HostPort;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/HostPort;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    return v0

    .line 16
    :cond_1
    check-cast p1, Landroid/gov/nist/javax/sip/address/Authority;

    .line 17
    .line 18
    iget-object v1, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 19
    .line 20
    iget-object v2, p1, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/gov/nist/core/HostPort;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    return v0

    .line 29
    :cond_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    iget-object p1, p1, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/UserInfo;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_3

    .line 42
    .line 43
    return v0

    .line 44
    :cond_3
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method public getHost()Landroid/gov/nist/core/Host;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

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
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->getHost()Landroid/gov/nist/core/Host;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getHostPort()Landroid/gov/nist/core/HostPort;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

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
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/UserInfo;->password:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

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

.method public getUser()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/UserInfo;->user:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public getUserInfo()Landroid/gov/nist/javax/sip/address/UserInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

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
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    const-string p0, "Null hostPort cannot compute hashcode"

    .line 15
    .line 16
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public removePort()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->removePort()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public removeUserInfo()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 3
    .line 4
    return-void
.end method

.method public setHost(Landroid/gov/nist/core/Host;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

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
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/HostPort;->setHost(Landroid/gov/nist/core/Host;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setHostPort(Landroid/gov/nist/core/HostPort;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 2
    .line 3
    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/UserInfo;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/UserInfo;->setPassword(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setPort(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

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
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->hostPort:Landroid/gov/nist/core/HostPort;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/HostPort;->setPort(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setUser(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/UserInfo;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/UserInfo;->setUser(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setUserInfo(Landroid/gov/nist/javax/sip/address/UserInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/Authority;->userInfo:Landroid/gov/nist/javax/sip/address/UserInfo;

    .line 2
    .line 3
    return-void
.end method
