.class public Landroid/gov/nist/javax/sip/header/ContentType;
.super Landroid/gov/nist/javax/sip/header/ParametersHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/ContentTypeHeader;


# static fields
.field private static final serialVersionUID:J = 0x759fac0f0cc76fd2L


# instance fields
.field protected mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    const-string v0, "Content-Type"

    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/ContentType;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/gov/nist/javax/sip/header/ContentType;->setContentType(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
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
    check-cast v0, Landroid/gov/nist/javax/sip/header/ContentType;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

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
    check-cast p0, Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public compareMediaRange(Ljava/lang/String;)I
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 7
    .line 8
    iget-object v1, v1, Landroid/gov/nist/javax/sip/header/MediaRange;->type:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "/"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 19
    .line 20
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/MediaRange;->subtype:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public encodeBody()Ljava/lang/String;
    .locals 1

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ContentType;->encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/MediaRange;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->hasParameters()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, ";"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ParametersHeader;->parameters:Landroid/gov/nist/core/NameValueList;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/NameValueList;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Landroid/javax/sip/header/ContentTypeHeader;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Landroid/javax/sip/header/ContentTypeHeader;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/ContentType;->getContentType()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Landroid/javax/sip/header/MediaType;->getContentType()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/ContentType;->getContentSubType()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1}, Landroid/javax/sip/header/MediaType;->getContentSubType()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->equalParameters(Landroid/javax/sip/header/Parameters;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_0
    return v1
.end method

.method public getCharset()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "charset"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/ParametersHeader;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getContentSubType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/MediaRange;->getSubtype()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/MediaRange;->getType()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getMediaRange()Landroid/gov/nist/javax/sip/header/MediaRange;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMediaSubType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 2
    .line 3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/MediaRange;->subtype:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public getMediaType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 2
    .line 3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/MediaRange;->type:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public setContentSubType(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/MediaRange;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/MediaRange;->setSubtype(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "null arg"

    .line 19
    .line 20
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setContentType(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/MediaRange;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/MediaRange;->setType(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const-string p0, "null arg"

    .line 19
    .line 20
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setContentType(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 24
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    if-nez v0, :cond_0

    .line 25
    new-instance v0, Landroid/gov/nist/javax/sip/header/MediaRange;

    invoke-direct {v0}, Landroid/gov/nist/javax/sip/header/MediaRange;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 26
    :cond_0
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/header/MediaRange;->setType(Ljava/lang/String;)V

    .line 27
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/header/MediaRange;->setSubtype(Ljava/lang/String;)V

    return-void
.end method

.method public setMediaRange(Landroid/gov/nist/javax/sip/header/MediaRange;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/ContentType;->mediaRange:Landroid/gov/nist/javax/sip/header/MediaRange;

    .line 2
    .line 3
    return-void
.end method
