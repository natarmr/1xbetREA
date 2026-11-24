.class public final La/rr9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/rr9;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/rr9;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/rr9;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/rr9;

    .line 10
    .line 11
    iget-wide v0, p1, La/rr9;->a:J

    .line 12
    .line 13
    sget v2, La/y3d;->h:I

    .line 14
    .line 15
    iget-wide v2, p0, La/rr9;->a:J

    .line 16
    .line 17
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-wide v0, p0, La/rr9;->b:J

    .line 25
    .line 26
    iget-wide p0, p1, La/rr9;->b:J

    .line 27
    .line 28
    invoke-static {v0, v1, p0, p1}, La/h2t0;->a(JJ)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    :goto_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const v0, 0x7f0807fb

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    mul-int/2addr v0, v1

    .line 11
    sget v2, La/y3d;->h:I

    .line 12
    .line 13
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 14
    .line 15
    iget-wide v2, p0, La/rr9;->a:J

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-wide v1, p0, La/rr9;->b:J

    .line 22
    .line 23
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    add-int/2addr p0, v0

    .line 28
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p0, La/rr9;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/rr9;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, ", imageTintColor="

    .line 14
    .line 15
    const-string v2, ", backgroundTint="

    .line 16
    .line 17
    const v3, 0x7f0807fb

    .line 18
    .line 19
    .line 20
    const-string v4, "CallbackHistorySettingsLeftStyle(iconResId="

    .line 21
    .line 22
    invoke-static {v3, v4, v1, v0, v2}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, ")"

    .line 27
    .line 28
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
