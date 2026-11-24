.class public abstract Landroid/gov/nist/javax/sip/header/AddressParametersHeader;
.super Landroid/gov/nist/javax/sip/header/ParametersHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/Parameters;


# instance fields
.field protected address:Landroid/gov/nist/javax/sip/address/AddressImpl;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/header/ParametersHeader;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/header/ParametersHeader;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->address:Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/address/AddressImpl;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->address:Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroid/javax/sip/header/HeaderAddress;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    instance-of v1, p1, Landroid/javax/sip/header/Parameters;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast p1, Landroid/javax/sip/header/HeaderAddress;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p1}, Landroid/javax/sip/header/HeaderAddress;->getAddress()Landroid/javax/sip/address/Address;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v1, v3}, Landroid/javax/sip/address/Address;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    check-cast p1, Landroid/javax/sip/header/Parameters;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->equalParameters(Landroid/javax/sip/header/Parameters;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    return v0

    .line 39
    :cond_1
    return v2
.end method

.method public getAddress()Landroid/javax/sip/address/Address;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->address:Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public setAddress(Landroid/javax/sip/address/Address;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->address:Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 4
    .line 5
    return-void
.end method
