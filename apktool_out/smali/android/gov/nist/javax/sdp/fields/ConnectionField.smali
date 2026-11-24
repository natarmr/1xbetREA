.class public Landroid/gov/nist/javax/sdp/fields/ConnectionField;
.super Landroid/gov/nist/javax/sdp/fields/SDPField;
.source "SourceFile"

# interfaces
.implements La/j1e;


# instance fields
.field protected address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

.field protected addrtype:Ljava/lang/String;

.field protected nettype:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "c="

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
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
    check-cast v0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->nettype:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "c="

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->nettype:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->addrtype:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, " "

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {v1, v2}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->addrtype:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-static {v1, v2}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->encode()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_2
    const-string p0, "\r\n"

    .line 62
    .line 63
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->getConnectionAddress()Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->getAddress()Landroid/gov/nist/core/Host;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroid/gov/nist/core/Host;->getAddress()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public getAddressType()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->getAddrtype()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getAddrtype()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->addrtype:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getConnectionAddress()Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNettype()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->nettype:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNetworkType()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->getNettype()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public setAddrType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->addrtype:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setAddress(Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;)V
    .locals 0

    .line 57
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    return-void
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 13
    .line 14
    new-instance v0, Landroid/gov/nist/core/Host;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->setAddress(Landroid/gov/nist/core/Host;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->getAddress()Landroid/gov/nist/core/Host;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Landroid/gov/nist/core/Host;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Landroid/gov/nist/core/Host;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->setAddress(Landroid/gov/nist/core/Host;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0, p1}, Landroid/gov/nist/core/Host;->setAddress(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->address:Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->setAddress(Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    const-string p0, "the addr is null"

    .line 52
    .line 53
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public setAddressType(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->addrtype:Ljava/lang/String;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "the type is null"

    .line 7
    .line 8
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setNettype(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->nettype:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setNetworkType(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->setNettype(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const-string p0, "the type is null"

    .line 8
    .line 9
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/ConnectionField;->encode()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
