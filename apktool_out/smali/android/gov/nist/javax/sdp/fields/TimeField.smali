.class public Landroid/gov/nist/javax/sdp/fields/TimeField;
.super Landroid/gov/nist/javax/sdp/fields/SDPField;
.source "SourceFile"

# interfaces
.implements La/qgq0;


# instance fields
.field protected startTime:J

.field protected stopTime:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "t="

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sdp/fields/SDPField;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public encode()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "t="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->startTime:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->stopTime:J

    .line 19
    .line 20
    const-string p0, "\r\n"

    .line 21
    .line 22
    invoke-static {v1, v2, p0, v0}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public getStart()Ljava/util/Date;
    .locals 4

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->startTime:J

    .line 2
    .line 3
    new-instance p0, Ljava/util/Date;

    .line 4
    .line 5
    const-wide v2, 0x83aa7e80L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    const-wide/16 v2, 0x3e8

    .line 12
    .line 13
    mul-long/2addr v0, v2

    .line 14
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public getStartTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->startTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getStop()Ljava/util/Date;
    .locals 4

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->stopTime:J

    .line 2
    .line 3
    new-instance p0, Ljava/util/Date;

    .line 4
    .line 5
    const-wide v2, 0x83aa7e80L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    const-wide/16 v2, 0x3e8

    .line 12
    .line 13
    mul-long/2addr v0, v2

    .line 14
    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public getStopTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->stopTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getTypedTime()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public isZero()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/TimeField;->getStartTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/TimeField;->getStopTime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    cmp-long p0, v0, v2

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public setStart(Ljava/util/Date;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    div-long/2addr v0, v2

    .line 10
    const-wide v2, 0x83aa7e80L

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    add-long/2addr v0, v2

    .line 16
    iput-wide v0, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->startTime:J

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "The date is null"

    .line 20
    .line 21
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->startTime:J

    .line 2
    .line 3
    return-void
.end method

.method public setStop(Ljava/util/Date;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    div-long/2addr v0, v2

    .line 10
    const-wide v2, 0x83aa7e80L

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    add-long/2addr v0, v2

    .line 16
    iput-wide v0, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->stopTime:J

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "The date is null"

    .line 20
    .line 21
    invoke-static {p0}, La/ohq;->s(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setStopTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroid/gov/nist/javax/sdp/fields/TimeField;->stopTime:J

    .line 2
    .line 3
    return-void
.end method

.method public setTypedTime(Z)V
    .locals 0

    return-void
.end method

.method public setZero()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sdp/fields/TimeField;->setStopTime(J)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Landroid/gov/nist/javax/sdp/fields/TimeField;->setStartTime(J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
