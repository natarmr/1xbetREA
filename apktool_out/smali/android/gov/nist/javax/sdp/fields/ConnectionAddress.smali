.class public Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;
.super Landroid/gov/nist/javax/sdp/fields/SDPObject;
.source "SourceFile"


# instance fields
.field protected address:Landroid/gov/nist/core/Host;

.field protected port:I

.field protected ttl:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sdp/fields/SDPObject;-><init>()V

    .line 2
    .line 3
    .line 4
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
    check-cast v0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->address:Landroid/gov/nist/core/Host;

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
    iput-object p0, v0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->address:Landroid/gov/nist/core/Host;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->address:Landroid/gov/nist/core/Host;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/gov/nist/core/Host;->encode()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/gov/nist/core/Host;->isIPv6Reference(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {v1, v1, v0}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v0, ""

    .line 22
    .line 23
    :cond_1
    :goto_0
    iget v1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->ttl:I

    .line 24
    .line 25
    const-string v2, "/"

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget v3, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->port:I

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->ttl:I

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->port:I

    .line 53
    .line 54
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_2
    if-eqz v1, :cond_3

    .line 63
    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->ttl:I

    .line 76
    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_3
    return-object v0
.end method

.method public getAddress()Landroid/gov/nist/core/Host;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->address:Landroid/gov/nist/core/Host;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->port:I

    .line 2
    .line 3
    return p0
.end method

.method public getTtl()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->ttl:I

    .line 2
    .line 3
    return p0
.end method

.method public setAddress(Landroid/gov/nist/core/Host;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->address:Landroid/gov/nist/core/Host;

    .line 2
    .line 3
    return-void
.end method

.method public setPort(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->port:I

    .line 2
    .line 3
    return-void
.end method

.method public setTtl(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sdp/fields/ConnectionAddress;->ttl:I

    .line 2
    .line 3
    return-void
.end method
