.class public Landroid/gov/nist/javax/sip/header/MimeVersion;
.super Landroid/gov/nist/javax/sip/header/SIPHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/MimeVersionHeader;


# static fields
.field private static final serialVersionUID:J = -0x6e59b8a2cb581754L


# instance fields
.field protected majorVersion:I

.field protected minorVersion:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "MIME-Version"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/MimeVersion;->majorVersion:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    const-string v0, "."

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget p0, p0, Landroid/gov/nist/javax/sip/header/MimeVersion;->minorVersion:I

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public getMajorVersion()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/MimeVersion;->majorVersion:I

    .line 2
    .line 3
    return p0
.end method

.method public getMinorVersion()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/MimeVersion;->minorVersion:I

    .line 2
    .line 3
    return p0
.end method

.method public setMajorVersion(I)V
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Landroid/gov/nist/javax/sip/header/MimeVersion;->majorVersion:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "JAIN-SIP Exception, MimeVersion, setMajorVersion(), the majorVersion parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setMinorVersion(I)V
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Landroid/gov/nist/javax/sip/header/MimeVersion;->minorVersion:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "JAIN-SIP Exception, MimeVersion, setMinorVersion(), the minorVersion parameter is null"

    .line 7
    .line 8
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
