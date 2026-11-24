.class public final Landroid/gov/nist/javax/sip/header/AlertInfo;
.super Landroid/gov/nist/javax/sip/header/ParametersHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/AlertInfoHeader;


# static fields
.field private static final serialVersionUID:J = 0x39ba1254fc6b29efL


# instance fields
.field protected string:Ljava/lang/String;

.field protected uri:Landroid/gov/nist/javax/sip/address/GenericURI;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Alert-Info"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/gov/nist/javax/sip/header/AlertInfo;

    .line 6
    .line 7
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/gov/nist/core/GenericObject;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/AlertInfo;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->string:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/AlertInfo;->string:Ljava/lang/String;

    .line 25
    .line 26
    :cond_1
    return-object v0
.end method

.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "<"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/address/GenericURI;->encode()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ">"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->string:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/gov/nist/core/NameValueList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    const-string v0, ";"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/gov/nist/core/NameValueList;->encode()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :cond_2
    return-object p1
.end method

.method public getAlertInfo()Landroid/javax/sip/address/URI;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 7
    .line 8
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->string:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/address/GenericURI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :catch_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public setAlertInfo(Landroid/javax/sip/address/URI;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 4
    .line 5
    return-void
.end method

.method public setAlertInfo(Ljava/lang/String;)V
    .locals 0

    .line 6
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/AlertInfo;->string:Ljava/lang/String;

    return-void
.end method
