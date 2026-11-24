.class public Landroid/gov/nist/javax/sip/header/RAck;
.super Landroid/gov/nist/javax/sip/header/SIPHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/RAckHeader;


# static fields
.field private static final serialVersionUID:J = 0xa533768a7c9b3d6L


# instance fields
.field protected cSeqNumber:J

.field protected method:Ljava/lang/String;

.field protected rSeqNumber:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "RAck"

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
    .locals 3

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RAck;->rSeqNumber:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    const-string v0, " "

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, Landroid/gov/nist/javax/sip/header/RAck;->cSeqNumber:J

    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/RAck;->method:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public getCSeqNumber()I
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RAck;->cSeqNumber:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    return p0
.end method

.method public getCSeqNumberLong()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RAck;->cSeqNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getCSequenceNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RAck;->cSeqNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/header/RAck;->method:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRSeqNumber()I
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RAck;->rSeqNumber:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    return p0
.end method

.method public getRSequenceNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RAck;->rSeqNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public setCSeqNumber(I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/header/RAck;->setCSequenceNumber(J)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setCSequenceNumber(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const-wide v0, 0x80000000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/header/RAck;->cSeqNumber:J

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 20
    .line 21
    const-string v0, "Bad CSeq # "

    .line 22
    .line 23
    invoke-static {p1, p2, v0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/header/RAck;->method:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setRSeqNumber(I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/header/RAck;->setRSequenceNumber(J)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setRSequenceNumber(J)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RAck;->cSeqNumber:J

    .line 8
    .line 9
    const-wide v2, 0x80000000L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-gtz v0, :cond_0

    .line 17
    .line 18
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/header/RAck;->rSeqNumber:J

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 22
    .line 23
    const-string v0, "Bad rSeq # "

    .line 24
    .line 25
    invoke-static {p1, p2, v0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method
