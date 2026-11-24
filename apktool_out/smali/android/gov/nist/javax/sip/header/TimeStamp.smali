.class public Landroid/gov/nist/javax/sip/header/TimeStamp;
.super Landroid/gov/nist/javax/sip/header/SIPHeader;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/TimeStampHeader;


# static fields
.field private static final serialVersionUID:J = -0x3381440765137350L


# instance fields
.field protected delay:I

.field protected delayFloat:F

.field protected timeStamp:J

.field private timeStampFloat:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "Timestamp"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/SIPHeader;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStamp:J

    .line 9
    .line 10
    const/high16 v0, -0x40800000    # -1.0f

    .line 11
    .line 12
    iput v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delayFloat:F

    .line 13
    .line 14
    iput v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStampFloat:F

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    iput v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delay:I

    .line 18
    .line 19
    return-void
.end method

.method private getDelayAsString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delay:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v2, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delayFloat:F

    .line 7
    .line 8
    const/high16 v3, -0x40800000    # -1.0f

    .line 9
    .line 10
    cmpl-float v2, v2, v3

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    const-string p0, ""

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delayFloat:F

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method private getTimeStampAsString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStamp:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-nez v4, :cond_0

    .line 8
    .line 9
    iget v4, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStampFloat:F

    .line 10
    .line 11
    const/high16 v5, -0x40800000    # -1.0f

    .line 12
    .line 13
    cmpl-float v4, v4, v5

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    const-string p0, ""

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    cmp-long v2, v0, v2

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStampFloat:F

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method


# virtual methods
.method public encodeBody(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/TimeStamp;->getTimeStampAsString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/header/TimeStamp;->getDelayAsString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    const-string v0, " "

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_2
    return-object p1
.end method

.method public getDelay()F
    .locals 2

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delayFloat:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v1, v0, v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delay:I

    .line 10
    .line 11
    int-to-float p0, p0

    .line 12
    return p0

    .line 13
    :cond_0
    return v0
.end method

.method public getTime()J
    .locals 4

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStamp:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget p0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStampFloat:F

    .line 10
    .line 11
    float-to-long v0, p0

    .line 12
    :cond_0
    return-wide v0
.end method

.method public getTimeDelay()I
    .locals 2

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delay:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget p0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delayFloat:F

    .line 7
    .line 8
    float-to-int p0, p0

    .line 9
    return p0

    .line 10
    :cond_0
    return v0
.end method

.method public getTimeStamp()F
    .locals 2

    .line 1
    iget v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStampFloat:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v1, v0, v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStamp:J

    .line 10
    .line 11
    long-to-float p0, v0

    .line 12
    return p0

    .line 13
    :cond_0
    return v0
.end method

.method public hasDelay()Z
    .locals 1

    .line 1
    iget p0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delay:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public removeDelay()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delay:I

    .line 3
    .line 4
    return-void
.end method

.method public setDelay(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-gez v0, :cond_1

    .line 5
    .line 6
    const/high16 v0, -0x40800000    # -1.0f

    .line 7
    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "JAIN-SIP Exception, TimeStamp, setDelay(), the delay parameter is <0"

    .line 14
    .line 15
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    :goto_0
    iput p1, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delayFloat:F

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    iput p1, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delay:I

    .line 23
    .line 24
    return-void
.end method

.method public setTime(J)V
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStamp:J

    .line 8
    .line 9
    const/high16 p1, -0x40800000    # -1.0f

    .line 10
    .line 11
    iput p1, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStampFloat:F

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "Illegal timestamp"

    .line 15
    .line 16
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setTimeDelay(I)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-lt p1, v0, :cond_0

    .line 3
    .line 4
    iput p1, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delay:I

    .line 5
    .line 6
    const/high16 p1, -0x40800000    # -1.0f

    .line 7
    .line 8
    iput p1, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->delayFloat:F

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p0, Landroid/javax/sip/InvalidArgumentException;

    .line 12
    .line 13
    const-string v0, "Value out of range "

    .line 14
    .line 15
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {p0, p1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
.end method

.method public setTimeStamp(F)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStamp:J

    .line 9
    .line 10
    iput p1, p0, Landroid/gov/nist/javax/sip/header/TimeStamp;->timeStampFloat:F

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "JAIN-SIP Exception, TimeStamp, setTimeStamp(), the timeStamp parameter is <0"

    .line 14
    .line 15
    invoke-static {p0}, La/itt0;->r(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
