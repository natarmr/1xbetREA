.class public Landroid/gov/nist/javax/sip/header/Challenge;
.super Landroid/gov/nist/javax/sip/header/SIPObject;
.source "SourceFile"


# static fields
.field private static ALGORITHM:Ljava/lang/String; = "algorithm"

.field private static DOMAIN:Ljava/lang/String; = "domain"

.field private static OPAQUE:Ljava/lang/String; = "opaque"

.field private static QOP:Ljava/lang/String; = "qop"

.field private static REALM:Ljava/lang/String; = "realm"

.field private static RESPONSE:Ljava/lang/String; = "response"

.field private static SIGNATURE:Ljava/lang/String; = "signature"

.field private static SIGNED_BY:Ljava/lang/String; = "signed-by"

.field private static STALE:Ljava/lang/String; = "stale"

.field private static URI:Ljava/lang/String; = "uri"

.field private static final serialVersionUID:J = 0x151e737cde1170L


# instance fields
.field protected authParams:Landroid/gov/nist/core/NameValueList;

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
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

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
    check-cast v0, Landroid/gov/nist/javax/sip/header/Challenge;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

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
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Challenge;->scheme:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, " "

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->encode()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->ALGORITHM:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getAuthParams()Landroid/gov/nist/core/NameValueList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDomain()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->DOMAIN:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getOpaque()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->OPAQUE:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public getQOP()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->QOP:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getRealm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->REALM:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getResponse()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->RESPONSE:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getScheme()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->SIGNATURE:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getSignedBy()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->SIGNED_BY:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getStale()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->STALE:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public getURI()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/header/Challenge;->URI:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/gov/nist/core/NameValueList;->getValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public hasParameter(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->getNameValue(Ljava/lang/String;)Landroid/gov/nist/core/NameValue;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public hasParameters()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public removeParameter(Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->delete(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public removeParameters()V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/core/NameValueList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 7
    .line 8
    return-void
.end method

.method public setAuthParams(Landroid/gov/nist/core/NameValueList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    return-void
.end method

.method public setParameter(Landroid/gov/nist/core/NameValue;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Challenge;->authParams:Landroid/gov/nist/core/NameValueList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->set(Landroid/gov/nist/core/NameValue;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setScheme(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Challenge;->scheme:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
