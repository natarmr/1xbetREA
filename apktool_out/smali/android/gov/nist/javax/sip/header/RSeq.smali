.class public Landroid/gov/nist/javax/sip/header/RSeq;
.super Landroid/gov/nist/javax/sip/header/SIPHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/RSeqHeader;


# static fields
.field private static final serialVersionUID:J = 0x79a63e78c9b0a382L


# instance fields
.field protected sequenceNumber:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "RSeq"

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
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RSeq;->sequenceNumber:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public getSeqNumber()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RSeq;->sequenceNumber:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getSequenceNumber()I
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/RSeq;->sequenceNumber:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    return p0
.end method

.method public setSeqNumber(J)V
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
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/header/RSeq;->sequenceNumber:J

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 20
    .line 21
    const-string v0, "Bad seq number "

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

.method public setSequenceNumber(I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sip/header/RSeq;->setSeqNumber(J)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
