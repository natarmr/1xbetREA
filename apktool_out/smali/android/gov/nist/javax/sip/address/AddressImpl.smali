.class public final Landroid/gov/nist/javax/sip/address/AddressImpl;
.super Landroid/gov/nist/javax/sip/address/NetObject;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/address/Address;


# static fields
.field public static final ADDRESS_SPEC:I = 0x2

.field public static final NAME_ADDR:I = 0x1

.field public static final WILD_CARD:I = 0x3

.field private static final serialVersionUID:J = 0x5f6385b6042972bL


# instance fields
.field protected address:Landroid/gov/nist/javax/sip/address/GenericURI;

.field protected addressType:I

.field protected displayName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/address/NetObject;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 6
    .line 7
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
    check-cast v0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

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
    check-cast p0, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/address/AddressImpl;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/16 p0, 0x2a

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string v0, "\""

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, " "

    .line 24
    .line 25
    invoke-static {p1, v1, v0, v2}, La/hne;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 29
    .line 30
    if-eqz v0, :cond_5

    .line 31
    .line 32
    iget v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    if-eq v0, v1, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    :cond_2
    const-string v0, "<"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :cond_3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/GenericURI;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_4

    .line 54
    .line 55
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 56
    .line 57
    if-eqz p0, :cond_5

    .line 58
    .line 59
    :cond_4
    const-string p0, ">"

    .line 60
    .line 61
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_5
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Landroid/javax/sip/address/Address;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Landroid/javax/sip/address/Address;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/AddressImpl;->getURI()Landroid/javax/sip/address/URI;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p1}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public getAddressType()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 2
    .line 3
    return p0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHost()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    instance-of v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/SipUri;->getHostPort()Landroid/gov/nist/core/HostPort;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->getHost()Landroid/gov/nist/core/Host;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/gov/nist/core/Host;->getHostname()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string p0, "address is not a SipUri"

    .line 23
    .line 24
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public getHostPort()Landroid/gov/nist/core/HostPort;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    instance-of v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/SipUri;->getHostPort()Landroid/gov/nist/core/HostPort;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "address is not a SipUri"

    .line 15
    .line 16
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public getPort()I
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    instance-of v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/SipUri;->getHostPort()Landroid/gov/nist/core/HostPort;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/gov/nist/core/HostPort;->getPort()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const-string p0, "address is not a SipUri"

    .line 19
    .line 20
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public getURI()Landroid/javax/sip/address/URI;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUserAtHostPort()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    instance-of v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/SipUri;->getUserAtHostPort()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/GenericURI;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public hasDisplayName()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

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

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/GenericURI;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isSIPAddress()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    instance-of p0, p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 4
    .line 5
    return p0
.end method

.method public isWildcard()Z
    .locals 1

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-ne p0, v0, :cond_0

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

.method public match(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroid/javax/sip/address/Address;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/gov/nist/core/GenericObject;->getMatcher()Landroid/gov/nist/core/Match;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/gov/nist/core/GenericObject;->getMatcher()Landroid/gov/nist/core/Match;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/AddressImpl;->encode()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p1, p0}, Landroid/gov/nist/core/Match;->match(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_2
    iget-object v1, p1, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    iget-object v3, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    return v2

    .line 41
    :cond_3
    if-nez v1, :cond_4

    .line 42
    .line 43
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 44
    .line 45
    iget-object p1, p1, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/NetObject;->match(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_4
    iget-object v3, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 61
    .line 62
    iget-object p1, p1, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/NetObject;->match(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_5

    .line 69
    .line 70
    return v0

    .line 71
    :cond_5
    return v2
.end method

.method public removeDisplayName()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 3
    .line 4
    return-void
.end method

.method public removeParameter(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    instance-of v0, p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/SipUri;->removeParameter(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "address is not a SipUri"

    .line 14
    .line 15
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setAddess(Landroid/javax/sip/address/URI;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 4
    .line 5
    return-void
.end method

.method public setAddressType(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 2
    .line 3
    return-void
.end method

.method public setDisplayName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->displayName:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput p1, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 5
    .line 6
    return-void
.end method

.method public setURI(Landroid/javax/sip/address/URI;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 4
    .line 5
    return-void
.end method

.method public setUser(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    check-cast p0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/SipUri;->setUser(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setWildCardFlag()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->addressType:I

    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/SipUri;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/address/AddressImpl;->address:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 10
    .line 11
    const-string p0, "*"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/address/SipUri;->setUser(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
