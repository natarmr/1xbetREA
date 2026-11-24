.class public Landroid/gov/nist/javax/sip/header/RequestLine;
.super Landroid/gov/nist/javax/sip/header/SIPObject;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/header/SipRequestLine;


# static fields
.field private static final serialVersionUID:J = -0x2d9bbb31060a5df9L


# instance fields
.field protected method:Ljava/lang/String;

.field protected sipVersion:Ljava/lang/String;

.field protected uri:Landroid/gov/nist/javax/sip/address/GenericURI;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/SIPObject;-><init>()V

    .line 14
    const-string v0, "SIP/2.0"

    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/address/GenericURI;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/SIPObject;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->method:Ljava/lang/String;

    .line 7
    .line 8
    const-string p1, "SIP/2.0"

    .line 9
    .line 10
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 11
    .line 12
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
    check-cast v0, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

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
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/RequestLine;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 1

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/RequestLine;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->method:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/address/GenericURI;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, "\r\n"

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p0, p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    return v0

    .line 24
    :cond_2
    check-cast p1, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 25
    .line 26
    iget-object v2, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->method:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v3, p1, Landroid/gov/nist/javax/sip/header/RequestLine;->method:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    if-eqz v3, :cond_4

    .line 33
    .line 34
    return v0

    .line 35
    :cond_3
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_4

    .line 40
    .line 41
    return v0

    .line 42
    :cond_4
    iget-object v2, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v3, p1, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 45
    .line 46
    if-nez v2, :cond_5

    .line 47
    .line 48
    if-eqz v3, :cond_6

    .line 49
    .line 50
    return v0

    .line 51
    :cond_5
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_6

    .line 56
    .line 57
    return v0

    .line 58
    :cond_6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 59
    .line 60
    iget-object p1, p1, Landroid/gov/nist/javax/sip/header/RequestLine;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 61
    .line 62
    if-nez p0, :cond_7

    .line 63
    .line 64
    if-eqz p1, :cond_8

    .line 65
    .line 66
    return v0

    .line 67
    :cond_7
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/GenericURI;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_8

    .line 72
    .line 73
    return v0

    .line 74
    :cond_8
    return v1
.end method

.method public getMethod()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->method:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSipVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUri()Landroid/gov/nist/javax/sip/address/GenericURI;
    .locals 0

    .line 6
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    return-object p0
.end method

.method public bridge synthetic getUri()Landroid/javax/sip/address/URI;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/RequestLine;->getUri()Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getVersionMajor()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    move-object v2, v1

    .line 9
    move v1, v0

    .line 10
    :goto_0
    iget-object v3, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_5

    .line 17
    .line 18
    iget-object v3, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/16 v4, 0x2e

    .line 25
    .line 26
    if-ne v3, v4, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget-object v3, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v4, ""

    .line 38
    .line 39
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :cond_3
    :goto_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    const/16 v4, 0x2f

    .line 77
    .line 78
    if-ne v3, v4, :cond_4

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    :goto_2
    return-object v2
.end method

.method public getVersionMinor()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    move-object v2, v1

    .line 9
    move v1, v0

    .line 10
    :goto_0
    iget-object v3, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_4

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-object v3, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v4, ""

    .line 27
    .line 28
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :cond_2
    :goto_1
    iget-object v3, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/16 v4, 0x2e

    .line 66
    .line 67
    if-ne v3, v4, :cond_3

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    return-object v2
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->method:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSipVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->sipVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setUri(Landroid/javax/sip/address/URI;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 2
    .line 3
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/RequestLine;->uri:Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 4
    .line 5
    return-void
.end method
