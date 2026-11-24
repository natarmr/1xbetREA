.class public abstract Landroid/gov/nist/javax/sip/header/ims/AddressHeaderIms;
.super Landroid/gov/nist/javax/sip/header/SIPHeader;
.source "SourceFile"


# instance fields
.field protected address:Landroid/gov/nist/javax/sip/address/AddressImpl;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/header/SIPHeader;-><init>(Ljava/lang/String;)V

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
    check-cast v0, Landroid/gov/nist/javax/sip/header/ims/AddressHeaderIms;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ims/AddressHeaderIms;->address:Landroid/gov/nist/javax/sip/address/AddressImpl;

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
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/ims/AddressHeaderIms;->address:Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public abstract encodeBody()Ljava/lang/String;
.end method

.method public getAddress()Landroid/javax/sip/address/Address;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ims/AddressHeaderIms;->address:Landroid/gov/nist/javax/sip/address/AddressImpl;

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
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/ims/AddressHeaderIms;->address:Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 4
    .line 5
    return-void
.end method
