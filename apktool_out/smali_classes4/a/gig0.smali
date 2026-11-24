.class public final La/gig0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:S

.field public final b:S

.field public final c:F

.field public final d:F


# direct methods
.method public synthetic constructor <init>()V
    .locals 3

    const/16 v0, 0x1f4

    const-wide/16 v1, 0x258

    .line 19
    invoke-direct {p0, v0, v1, v2}, La/gig0;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, La/gig0;->a:S

    .line 5
    .line 6
    long-to-int p1, p2

    .line 7
    iput-short p1, p0, La/gig0;->b:S

    .line 8
    .line 9
    const/high16 p1, 0x437a0000    # 250.0f

    .line 10
    .line 11
    iput p1, p0, La/gig0;->c:F

    .line 12
    .line 13
    const p1, 0x3f07ae14    # 0.53f

    .line 14
    .line 15
    .line 16
    iput p1, p0, La/gig0;->d:F

    .line 17
    .line 18
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
    instance-of v0, p1, La/gig0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/gig0;

    .line 10
    .line 11
    iget-short v0, p0, La/gig0;->a:S

    .line 12
    .line 13
    iget-short v1, p1, La/gig0;->a:S

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-short v0, p0, La/gig0;->b:S

    .line 19
    .line 20
    int-to-long v0, v0

    .line 21
    iget-short v2, p1, La/gig0;->b:S

    .line 22
    .line 23
    int-to-long v2, v2

    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget v0, p0, La/gig0;->c:F

    .line 30
    .line 31
    iget v1, p1, La/gig0;->c:F

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget p0, p0, La/gig0;->d:F

    .line 41
    .line 42
    iget p1, p1, La/gig0;->d:F

    .line 43
    .line 44
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_5

    .line 49
    .line 50
    :goto_0
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-short v0, p0, La/gig0;->a:S

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-short v2, p0, La/gig0;->b:S

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v2, p0, La/gig0;->c:F

    .line 18
    .line 19
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget p0, p0, La/gig0;->d:F

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    add-int/2addr p0, v0

    .line 30
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-short v0, p0, La/gig0;->b:S

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-string v2, "RpsAnimationParams(duration="

    .line 5
    .line 6
    const-string v3, ", totalDuration="

    .line 7
    .line 8
    iget-short v4, p0, La/gig0;->a:S

    .line 9
    .line 10
    invoke-static {v4, v0, v1, v2, v3}, La/vqd;->q(IJLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, ", springStiffness="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget v1, p0, La/gig0;->c:F

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", springDampingRatio="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget p0, p0, La/gig0;->d:F

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, ")"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
