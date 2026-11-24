.class public Landroid/gov/nist/javax/sip/header/Credentials;
.super Landroid/gov/nist/javax/sip/header/SIPObject;
.source "SourceFile"


# static fields
.field private static CNONCE:Ljava/lang/String; = "cnonce"

.field private static DOMAIN:Ljava/lang/String; = "domain"

.field private static NONCE:Ljava/lang/String; = "nonce"

.field private static OPAQUE:Ljava/lang/String; = "opaque"

.field private static REALM:Ljava/lang/String; = "realm"

.field private static RESPONSE:Ljava/lang/String; = "response"

.field private static URI:Ljava/lang/String; = "uri"

.field private static USERNAME:Ljava/lang/String; = "username"

.field private static final serialVersionUID:J = -0x57ec8c1393353a04L


# instance fields
.field protected parameters:Landroid/gov/nist/core/NameValueList;

.field protected scheme:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/SIPObject;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Credentials;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 10
    .line 11
    const-string p0, ","

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/gov/nist/core/NameValueList;->setSeparator(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
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
    check-cast v0, Landroid/gov/nist/javax/sip/header/Credentials;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Credentials;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/core/NameValueList;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/Credentials;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Credentials;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Credentials;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/gov/nist/core/NameValueList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, " "

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Credentials;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->encode()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    return-object v0
.end method

.method public getCredentials()Landroid/gov/nist/core/NameValueList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Credentials;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getScheme()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Credentials;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setCredentials(Landroid/gov/nist/core/NameValueList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Credentials;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-void
.end method

.method public setScheme(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Credentials;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
