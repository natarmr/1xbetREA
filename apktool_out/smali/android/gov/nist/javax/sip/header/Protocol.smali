.class public Landroid/gov/nist/javax/sip/header/Protocol;
.super Landroid/gov/nist/javax/sip/header/SIPObject;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1ec381b4ff51f3c0L


# instance fields
.field protected protocolName:Ljava/lang/String;

.field protected protocolVersion:Ljava/lang/String;

.field protected transport:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/SIPObject;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "SIP"

    .line 5
    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolName:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "2.0"

    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolVersion:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "UDP"

    .line 13
    .line 14
    iput-object v0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->transport:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public encode()Ljava/lang/String;
    .locals 1

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/header/Protocol;->encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public encode(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/javax/sip/Utils;->toUpperCase(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    const-string v0, "/"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolVersion:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->transport:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method public getProtocol()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolName:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x2f

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolVersion:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public getProtocolName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProtocolVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/Protocol;->transport:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setProtocol(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolName:Ljava/lang/String;

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolVersion:Ljava/lang/String;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "Missing \'/\' in protocol"

    .line 26
    .line 27
    invoke-static {v1, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public setProtocolName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setProtocolVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Protocol;->protocolVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTransport(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/Protocol;->transport:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
