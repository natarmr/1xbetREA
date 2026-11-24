.class public final La/s6l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/y1l0;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Integer;

.field public final d:La/y3d;

.field public final e:La/uf5;

.field public final f:Z

.field public final g:Ljava/lang/Integer;

.field public final h:La/r1l0;

.field public final i:La/q2l0;


# direct methods
.method public constructor <init>(La/y1l0;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;ZLjava/lang/Integer;I)V
    .locals 14

    .line 1
    move/from16 v0, p6

    .line 2
    .line 3
    and-int/lit8 v1, p8, 0x2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object v8, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v8, p2

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v1, p8, 0x4

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    move-object v9, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object/from16 v9, p3

    .line 19
    .line 20
    :goto_1
    and-int/lit8 v1, p8, 0x8

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    move-object v10, v2

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    move-object/from16 v10, p4

    .line 27
    .line 28
    :goto_2
    and-int/lit8 v1, p8, 0x10

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    move-object v11, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    move-object/from16 v11, p5

    .line 35
    .line 36
    :goto_3
    and-int/lit8 v1, p8, 0x40

    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    move-object v13, v2

    .line 41
    goto :goto_4

    .line 42
    :cond_4
    move-object/from16 v13, p7

    .line 43
    .line 44
    :goto_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    move-object v1, p1

    .line 48
    iput-object v1, p0, La/s6l0;->a:La/y1l0;

    .line 49
    .line 50
    iput-object v8, p0, La/s6l0;->b:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v9, p0, La/s6l0;->c:Ljava/lang/Integer;

    .line 53
    .line 54
    iput-object v10, p0, La/s6l0;->d:La/y3d;

    .line 55
    .line 56
    iput-object v11, p0, La/s6l0;->e:La/uf5;

    .line 57
    .line 58
    iput-boolean v0, p0, La/s6l0;->f:Z

    .line 59
    .line 60
    iput-object v13, p0, La/s6l0;->g:Ljava/lang/Integer;

    .line 61
    .line 62
    sget-object v4, La/p1l0;->c:La/p1l0;

    .line 63
    .line 64
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 65
    .line 66
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 71
    .line 72
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    new-instance v1, La/y3d;

    .line 77
    .line 78
    invoke-direct {v1, v5, v6}, La/y3d;-><init>(J)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 86
    .line 87
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    if-eqz v13, :cond_5

    .line 92
    .line 93
    new-instance v3, La/gpe;

    .line 94
    .line 95
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 100
    .line 101
    move-object p1, v4

    .line 102
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    invoke-direct {v3, v4, v5}, La/gpe;-><init>(J)V

    .line 107
    .line 108
    .line 109
    move-object v12, v3

    .line 110
    goto :goto_5

    .line 111
    :cond_5
    move-object p1, v4

    .line 112
    move-object v12, v2

    .line 113
    :goto_5
    new-instance v3, La/r1l0;

    .line 114
    .line 115
    move-object v4, p1

    .line 116
    move-object v5, v1

    .line 117
    invoke-direct/range {v3 .. v13}, La/r1l0;-><init>(La/p1l0;La/y3d;JLjava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;La/gpe;Ljava/lang/Integer;)V

    .line 118
    .line 119
    .line 120
    iput-object v3, p0, La/s6l0;->h:La/r1l0;

    .line 121
    .line 122
    new-instance v1, La/q2l0;

    .line 123
    .line 124
    new-instance v3, La/zb;

    .line 125
    .line 126
    const/4 v4, 0x7

    .line 127
    invoke-direct {v3, v2, v2, v4}, La/zb;-><init>(La/y3d;La/y3d;I)V

    .line 128
    .line 129
    .line 130
    invoke-direct {v1, v3, v0}, La/q2l0;-><init>(La/zb;Z)V

    .line 131
    .line 132
    .line 133
    iput-object v1, p0, La/s6l0;->i:La/q2l0;

    .line 134
    .line 135
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/s6l0;->h:La/r1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/s6l0;->i:La/q2l0;

    .line 2
    .line 3
    return-object p0
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
    instance-of v0, p1, La/s6l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/s6l0;

    .line 10
    .line 11
    iget-object v0, p0, La/s6l0;->a:La/y1l0;

    .line 12
    .line 13
    iget-object v1, p1, La/s6l0;->a:La/y1l0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/y1l0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/s6l0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/s6l0;->b:Ljava/lang/String;

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
    iget-object v0, p0, La/s6l0;->c:Ljava/lang/Integer;

    .line 34
    .line 35
    iget-object v1, p1, La/s6l0;->c:Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/s6l0;->d:La/y3d;

    .line 45
    .line 46
    iget-object v1, p1, La/s6l0;->d:La/y3d;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/s6l0;->e:La/uf5;

    .line 56
    .line 57
    iget-object v1, p1, La/s6l0;->e:La/uf5;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-boolean v0, p0, La/s6l0;->f:Z

    .line 67
    .line 68
    iget-boolean v1, p1, La/s6l0;->f:Z

    .line 69
    .line 70
    if-eq v0, v1, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget-object p0, p0, La/s6l0;->g:Ljava/lang/Integer;

    .line 74
    .line 75
    iget-object p1, p1, La/s6l0;->g:Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_8

    .line 82
    .line 83
    :goto_0
    const/4 p0, 0x0

    .line 84
    return p0

    .line 85
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 86
    return p0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/s6l0;->a:La/y1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, La/s6l0;->a:La/y1l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/y1l0;->hashCode()I

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, La/s6l0;->b:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-object v3, p0, La/s6l0;->c:Ljava/lang/Integer;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    move v3, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :goto_1
    add-int/2addr v0, v3

    .line 34
    mul-int/2addr v0, v1

    .line 35
    iget-object v3, p0, La/s6l0;->d:La/y3d;

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    iget-wide v3, v3, La/y3d;->a:J

    .line 42
    .line 43
    sget-object v5, La/h2t0;->b:La/g2t0;

    .line 44
    .line 45
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_2
    add-int/2addr v0, v3

    .line 50
    mul-int/2addr v0, v1

    .line 51
    iget-object v3, p0, La/s6l0;->e:La/uf5;

    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    move v3, v2

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    :goto_3
    add-int/2addr v0, v3

    .line 62
    mul-int/2addr v0, v1

    .line 63
    iget-boolean v3, p0, La/s6l0;->f:Z

    .line 64
    .line 65
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-object p0, p0, La/s6l0;->g:Ljava/lang/Integer;

    .line 70
    .line 71
    if-nez p0, :cond_4

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    :goto_4
    add-int/2addr v0, v2

    .line 79
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChampionshipCounterWithAccordion(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/s6l0;->a:La/y1l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", iconUrl="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/s6l0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", iconResId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/s6l0;->c:Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", iconColor="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/s6l0;->d:La/y3d;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", badgeStyle="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/s6l0;->e:La/uf5;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", expanded="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, La/s6l0;->f:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", iconCounterValue="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ")"

    .line 69
    .line 70
    iget-object p0, p0, La/s6l0;->g:Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-static {v0, p0, v1}, La/dw9;->q(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method
