.class public final Landroid/gov/nist/core/HostPort;
.super Landroid/gov/nist/core/GenericObject;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x629463c90d3e66ebL


# instance fields
.field protected host:Landroid/gov/nist/core/Host;

.field protected port:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/core/GenericObject;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/core/HostPort;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/core/Host;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/core/HostPort;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/Host;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const-string v0, ":"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget p0, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :cond_0
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
    const-class v1, Landroid/gov/nist/core/HostPort;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    check-cast p1, Landroid/gov/nist/core/HostPort;

    .line 15
    .line 16
    iget v1, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 17
    .line 18
    iget v2, p1, Landroid/gov/nist/core/HostPort;->port:I

    .line 19
    .line 20
    if-ne v1, v2, :cond_2

    .line 21
    .line 22
    iget-object p0, p0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 23
    .line 24
    iget-object p1, p1, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/Host;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    return v0
.end method

.method public getHost()Landroid/gov/nist/core/Host;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInetAddress()Ljava/net/InetAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

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
    invoke-virtual {p0}, Landroid/gov/nist/core/Host;->getInetAddress()Ljava/net/InetAddress;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 2
    .line 3
    return p0
.end method

.method public hasPort()Z
    .locals 1

    .line 1
    iget p0, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/gov/nist/core/Host;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public merge(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/gov/nist/core/GenericObject;->merge(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    check-cast p1, Landroid/gov/nist/core/HostPort;

    .line 10
    .line 11
    iget p1, p1, Landroid/gov/nist/core/HostPort;->port:I

    .line 12
    .line 13
    iput p1, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public removePort()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 3
    .line 4
    return-void
.end method

.method public setHost(Landroid/gov/nist/core/Host;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/core/HostPort;->host:Landroid/gov/nist/core/Host;

    .line 2
    .line 3
    return-void
.end method

.method public setPort(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/core/HostPort;->port:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
