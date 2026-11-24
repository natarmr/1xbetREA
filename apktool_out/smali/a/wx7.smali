.class public final La/wx7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/u12;


# instance fields
.field public final a:F

.field public final b:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/wx7;->a:F

    .line 5
    .line 6
    iput p2, p0, La/wx7;->b:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(JJLa/k6z;)J
    .locals 3

    .line 1
    const/16 p5, 0x20

    .line 2
    .line 3
    shr-long v0, p3, p5

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    shr-long v1, p1, p5

    .line 7
    .line 8
    long-to-int v1, v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    const-wide v1, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p3, v1

    .line 16
    long-to-int p3, p3

    .line 17
    and-long/2addr p1, v1

    .line 18
    long-to-int p1, p1

    .line 19
    sub-int/2addr p3, p1

    .line 20
    int-to-long p1, v0

    .line 21
    shl-long/2addr p1, p5

    .line 22
    int-to-long p3, p3

    .line 23
    and-long/2addr p3, v1

    .line 24
    or-long/2addr p1, p3

    .line 25
    shr-long p3, p1, p5

    .line 26
    .line 27
    long-to-int p3, p3

    .line 28
    int-to-float p3, p3

    .line 29
    const/high16 p4, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr p3, p4

    .line 32
    and-long/2addr p1, v1

    .line 33
    long-to-int p1, p1

    .line 34
    int-to-float p1, p1

    .line 35
    div-float/2addr p1, p4

    .line 36
    iget p2, p0, La/wx7;->a:F

    .line 37
    .line 38
    const/high16 p4, 0x3f800000    # 1.0f

    .line 39
    .line 40
    add-float/2addr p2, p4

    .line 41
    mul-float/2addr p2, p3

    .line 42
    iget p0, p0, La/wx7;->b:F

    .line 43
    .line 44
    add-float/2addr p4, p0

    .line 45
    mul-float/2addr p4, p1

    .line 46
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    int-to-long p2, p0

    .line 55
    shl-long/2addr p2, p5

    .line 56
    int-to-long p0, p1

    .line 57
    and-long/2addr p0, v1

    .line 58
    or-long/2addr p0, p2

    .line 59
    return-wide p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/wx7;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/wx7;

    .line 12
    .line 13
    iget v1, p0, La/wx7;->a:F

    .line 14
    .line 15
    iget v3, p1, La/wx7;->a:F

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget p0, p0, La/wx7;->b:F

    .line 25
    .line 26
    iget p1, p1, La/wx7;->b:F

    .line 27
    .line 28
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, La/wx7;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget p0, p0, La/wx7;->b:F

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ", verticalBias="

    .line 2
    .line 3
    const-string v1, ")"

    .line 4
    .line 5
    iget v2, p0, La/wx7;->a:F

    .line 6
    .line 7
    iget p0, p0, La/wx7;->b:F

    .line 8
    .line 9
    const-string v3, "BiasAbsoluteAlignment(horizontalBias="

    .line 10
    .line 11
    invoke-static {v2, p0, v3, v0, v1}, La/rw2;->i(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
