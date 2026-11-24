.class public final La/hy6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hzc;


# instance fields
.field public final a:La/gzc;

.field public final b:La/gzc;

.field public final c:La/gzc;


# direct methods
.method public constructor <init>()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/gzc;

    .line 4
    .line 5
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 6
    .line 7
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v2, v2, La/taq0;->b:Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 12
    .line 13
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getCoefHigher-0d7_KjU()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    sget-object v10, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 18
    .line 19
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    sget-object v2, La/qmk;->a:La/zcl;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/high16 v9, 0x41900000    # 18.0f

    .line 27
    .line 28
    const v2, 0x7f0807dc

    .line 29
    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-direct/range {v1 .. v9}, La/gzc;-><init>(IJJFFF)V

    .line 33
    .line 34
    .line 35
    new-instance v11, La/gzc;

    .line 36
    .line 37
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v2, v2, La/taq0;->b:Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 42
    .line 43
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getCoefLower-0d7_KjU()J

    .line 44
    .line 45
    .line 46
    move-result-wide v13

    .line 47
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v15

    .line 51
    const/16 v18, 0x0

    .line 52
    .line 53
    const/high16 v19, 0x41900000    # 18.0f

    .line 54
    .line 55
    const v12, 0x7f0807d8

    .line 56
    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    invoke-direct/range {v11 .. v19}, La/gzc;-><init>(IJJFFF)V

    .line 61
    .line 62
    .line 63
    new-instance v12, La/gzc;

    .line 64
    .line 65
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 66
    .line 67
    .line 68
    move-result-wide v14

    .line 69
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 70
    .line 71
    .line 72
    move-result-wide v16

    .line 73
    const/16 v19, 0x0

    .line 74
    .line 75
    const/high16 v20, 0x41a00000    # 20.0f

    .line 76
    .line 77
    const v13, 0x7f08097e

    .line 78
    .line 79
    .line 80
    invoke-direct/range {v12 .. v20}, La/gzc;-><init>(IJJFFF)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v1, v0, La/hy6;->a:La/gzc;

    .line 87
    .line 88
    iput-object v11, v0, La/hy6;->b:La/gzc;

    .line 89
    .line 90
    iput-object v12, v0, La/hy6;->c:La/gzc;

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final a()La/gzc;
    .locals 0

    .line 1
    iget-object p0, p0, La/hy6;->c:La/gzc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/gzc;
    .locals 0

    .line 1
    iget-object p0, p0, La/hy6;->b:La/gzc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/gzc;
    .locals 0

    .line 1
    iget-object p0, p0, La/hy6;->a:La/gzc;

    .line 2
    .line 3
    return-object p0
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
    instance-of v1, p1, La/hy6;

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
    check-cast p1, La/hy6;

    .line 12
    .line 13
    iget-object v1, p0, La/hy6;->a:La/gzc;

    .line 14
    .line 15
    iget-object v3, p1, La/hy6;->a:La/gzc;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/hy6;->b:La/gzc;

    .line 25
    .line 26
    iget-object v3, p1, La/hy6;->b:La/gzc;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, La/hy6;->c:La/gzc;

    .line 36
    .line 37
    iget-object p1, p1, La/hy6;->c:La/gzc;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La/hy6;->a:La/gzc;

    .line 2
    .line 3
    invoke-virtual {v0}, La/gzc;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/hy6;->b:La/gzc;

    .line 10
    .line 11
    invoke-virtual {v1}, La/gzc;->hashCode()I

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
    iget-object p0, p0, La/hy6;->c:La/gzc;

    .line 19
    .line 20
    invoke-virtual {p0}, La/gzc;->hashCode()I

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
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MediumCustomBackgroundCoefIconsStyle(coefUpParams="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/hy6;->a:La/gzc;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", coefDownParams="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/hy6;->b:La/gzc;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", blockParams="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/hy6;->c:La/gzc;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
