.class public final La/dp20;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(FFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/dp20;->a:F

    .line 5
    .line 6
    iput p2, p0, La/dp20;->b:F

    .line 7
    .line 8
    iput p3, p0, La/dp20;->c:F

    .line 9
    .line 10
    sget-object p1, La/qmk;->a:La/zcl;

    .line 11
    .line 12
    const/high16 p1, 0x41c00000    # 24.0f

    .line 13
    .line 14
    mul-float/2addr p1, p3

    .line 15
    iput p1, p0, La/dp20;->d:F

    .line 16
    .line 17
    const/high16 p1, 0x41a00000    # 20.0f

    .line 18
    .line 19
    mul-float/2addr p1, p3

    .line 20
    iput p1, p0, La/dp20;->e:F

    .line 21
    .line 22
    const/high16 p1, 0x41800000    # 16.0f

    .line 23
    .line 24
    mul-float/2addr p1, p3

    .line 25
    iput p1, p0, La/dp20;->f:F

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(FF)J
    .locals 4

    .line 1
    const/high16 v0, 0x42c80000    # 100.0f

    .line 2
    .line 3
    div-float/2addr p1, v0

    .line 4
    iget v1, p0, La/dp20;->a:F

    .line 5
    .line 6
    mul-float/2addr p1, v1

    .line 7
    iget p0, p0, La/dp20;->b:F

    .line 8
    .line 9
    div-float/2addr p2, v0

    .line 10
    mul-float/2addr p2, p0

    .line 11
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    int-to-long p0, p0

    .line 16
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    int-to-long v0, p2

    .line 21
    const/16 p2, 0x20

    .line 22
    .line 23
    shl-long/2addr p0, p2

    .line 24
    const-wide v2, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v0, v2

    .line 30
    or-long/2addr p0, v0

    .line 31
    return-wide p0
.end method

.method public final b(J)J
    .locals 4

    .line 1
    invoke-static {p1, p2}, La/adl;->a(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget p0, p0, La/dp20;->c:F

    .line 6
    .line 7
    mul-float/2addr v0, p0

    .line 8
    invoke-static {p1, p2}, La/adl;->b(J)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    mul-float/2addr p1, p0

    .line 13
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    int-to-long v0, p0

    .line 18
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    int-to-long p0, p0

    .line 23
    const/16 p2, 0x20

    .line 24
    .line 25
    shl-long/2addr v0, p2

    .line 26
    const-wide v2, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr p0, v2

    .line 32
    or-long/2addr p0, v0

    .line 33
    return-wide p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/dp20;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/dp20;

    .line 10
    .line 11
    iget v0, p0, La/dp20;->a:F

    .line 12
    .line 13
    iget v1, p1, La/dp20;->a:F

    .line 14
    .line 15
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget v0, p0, La/dp20;->b:F

    .line 23
    .line 24
    iget v1, p1, La/dp20;->b:F

    .line 25
    .line 26
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget p0, p0, La/dp20;->c:F

    .line 34
    .line 35
    iget p1, p1, La/dp20;->c:F

    .line 36
    .line 37
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/dp20;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget v2, p0, La/dp20;->b:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p0, p0, La/dp20;->c:F

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, La/dp20;->a:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, La/dp20;->b:F

    .line 8
    .line 9
    invoke-static {v1}, La/ycl;->c(F)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", height="

    .line 14
    .line 15
    const-string v3, ", scaleFactor="

    .line 16
    .line 17
    const-string v4, "MapGeometry(width="

    .line 18
    .line 19
    invoke-static {v4, v0, v2, v1, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, ")"

    .line 24
    .line 25
    iget p0, p0, La/dp20;->c:F

    .line 26
    .line 27
    invoke-static {v0, p0, v1}, La/kng0;->o(Ljava/lang/StringBuilder;FLjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
