.class public final La/t6k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j53;

.field public final b:La/j53;

.field public final c:F


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, La/j53;

    .line 2
    .line 3
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 4
    .line 5
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, La/taq0;->b:Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getCoefHigher-0d7_KjU()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    sget-object v3, La/qmk;->a:La/zcl;

    .line 16
    .line 17
    const v3, 0x7f0807dc

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, La/j53;-><init>(IJ)V

    .line 21
    .line 22
    .line 23
    new-instance v1, La/j53;

    .line 24
    .line 25
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v2, v2, La/taq0;->b:Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 30
    .line 31
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getCoefLower-0d7_KjU()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const v4, 0x7f0807d8

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v4, v2, v3}, La/j53;-><init>(IJ)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, La/t6k;->a:La/j53;

    .line 45
    .line 46
    iput-object v1, p0, La/t6k;->b:La/j53;

    .line 47
    .line 48
    const/high16 v0, 0x40000000    # 2.0f

    .line 49
    .line 50
    iput v0, p0, La/t6k;->c:F

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/t6k;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/t6k;

    .line 10
    .line 11
    iget-object v0, p0, La/t6k;->a:La/j53;

    .line 12
    .line 13
    iget-object v1, p1, La/t6k;->a:La/j53;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/t6k;->b:La/j53;

    .line 23
    .line 24
    iget-object v1, p1, La/t6k;->b:La/j53;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget p0, p0, La/t6k;->c:F

    .line 34
    .line 35
    iget p1, p1, La/t6k;->c:F

    .line 36
    .line 37
    invoke-static {p0, p1}, La/ycl;->b(FF)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

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
    .locals 2

    .line 1
    iget-object v0, p0, La/t6k;->a:La/j53;

    .line 2
    .line 3
    invoke-virtual {v0}, La/j53;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/t6k;->b:La/j53;

    .line 10
    .line 11
    invoke-virtual {v1}, La/j53;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget p0, p0, La/t6k;->c:F

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, La/t6k;->c:F

    .line 2
    .line 3
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "DeltaParams(arrowIconUpParamsStyle="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, La/t6k;->a:La/j53;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ", arrowIconDownParamsStyle="

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/t6k;->b:La/j53;

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, ", spaceBetweenDeltaAndIcon="

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, ")"

    .line 35
    .line 36
    invoke-static {v1, v0, p0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
