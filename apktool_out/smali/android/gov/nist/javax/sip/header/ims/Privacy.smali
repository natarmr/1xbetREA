.class public Landroid/gov/nist/javax/sip/header/ims/Privacy;
.super Landroid/gov/nist/javax/sip/header/SIPHeader;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/header/ims/PrivacyHeader;
.implements Landroid/gov/nist/javax/sip/header/ims/SIPHeaderNamesIms;
.implements Landroid/javax/sip/header/ExtensionHeader;


# instance fields
.field private privacy:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Privacy"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ims/Privacy;-><init>()V

    .line 8
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/ims/Privacy;->privacy:Ljava/lang/String;

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
    check-cast v0, Landroid/gov/nist/javax/sip/header/ims/Privacy;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ims/Privacy;->privacy:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/ims/Privacy;->privacy:Ljava/lang/String;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ims/Privacy;->privacy:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/gov/nist/javax/sip/header/ims/PrivacyHeader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/gov/nist/javax/sip/header/ims/PrivacyHeader;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/ims/Privacy;->getPrivacy()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p1}, Landroid/gov/nist/javax/sip/header/ims/PrivacyHeader;->getPrivacy()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public getPrivacy()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ims/Privacy;->privacy:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setPrivacy(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/ims/Privacy;->privacy:Ljava/lang/String;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "JAIN-SIP Exception,  Privacy, setPrivacy(), privacy value is null or empty"

    .line 11
    .line 12
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance p0, Ljava/text/ParseException;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method
