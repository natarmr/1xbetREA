.class public Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;
.super Landroid/gov/nist/javax/sdp/fields/SDPObject;
.source "SourceFile"


# instance fields
.field protected offset:Landroid/gov/nist/javax/sdp/fields/TypedTime;

.field protected sign:Ljava/lang/String;

.field protected time:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/gov/nist/javax/sdp/fields/SDPObject;-><init>()V

    .line 2
    .line 3
    .line 4
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
    check-cast v0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;

    .line 6
    .line 7
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->offset:Landroid/gov/nist/javax/sdp/fields/TypedTime;

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
    check-cast p0, Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 16
    .line 17
    iput-object p0, v0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->offset:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method

.method public encode()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->time:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, " "

    .line 8
    .line 9
    invoke-static {v0, v1}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->sign:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->sign:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->offset:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/gov/nist/javax/sdp/fields/TypedTime;->encode()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public getOffset()Landroid/gov/nist/javax/sdp/fields/TypedTime;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->offset:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->time:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public setOffset(Landroid/gov/nist/javax/sdp/fields/TypedTime;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->offset:Landroid/gov/nist/javax/sdp/fields/TypedTime;

    .line 2
    .line 3
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->sign:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroid/gov/nist/javax/sdp/fields/ZoneAdjustment;->time:J

    .line 2
    .line 3
    return-void
.end method
