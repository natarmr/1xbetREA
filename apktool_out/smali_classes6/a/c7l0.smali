.class public final La/c7l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b8l0;


# instance fields
.field public final a:La/a2l0;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:La/uf5;

.field public final f:Z

.field public final g:Ljava/lang/Integer;

.field public final h:La/t1l0;

.field public final i:La/x2l0;


# direct methods
.method public constructor <init>(La/a2l0;ILjava/lang/String;Ljava/lang/Integer;La/uf5;ZLjava/lang/Integer;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p6

    .line 6
    .line 7
    move/from16 v3, p8

    .line 8
    .line 9
    and-int/lit8 v4, v3, 0x4

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v9, p3

    .line 16
    .line 17
    :goto_0
    and-int/lit8 v4, v3, 0x8

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v10, p4

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v4, v3, 0x20

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    const/4 v12, 0x0

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move-object/from16 v12, p5

    .line 32
    .line 33
    :goto_2
    and-int/lit16 v3, v3, 0x80

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    const/4 v14, 0x0

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move-object/from16 v14, p7

    .line 40
    .line 41
    :goto_3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    move-object/from16 v3, p1

    .line 45
    .line 46
    iput-object v3, v0, La/c7l0;->a:La/a2l0;

    .line 47
    .line 48
    iput v1, v0, La/c7l0;->b:I

    .line 49
    .line 50
    iput-object v9, v0, La/c7l0;->c:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v10, v0, La/c7l0;->d:Ljava/lang/Integer;

    .line 53
    .line 54
    iput-object v12, v0, La/c7l0;->e:La/uf5;

    .line 55
    .line 56
    iput-boolean v2, v0, La/c7l0;->f:Z

    .line 57
    .line 58
    iput-object v14, v0, La/c7l0;->g:Ljava/lang/Integer;

    .line 59
    .line 60
    sget-object v7, La/p1l0;->c:La/p1l0;

    .line 61
    .line 62
    sget-object v3, La/s6t0;->a:La/pz40;

    .line 63
    .line 64
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v3, v3, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 69
    .line 70
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    new-instance v8, La/y3d;

    .line 75
    .line 76
    invoke-direct {v8, v3, v4}, La/y3d;-><init>(J)V

    .line 77
    .line 78
    .line 79
    if-eqz v14, :cond_4

    .line 80
    .line 81
    new-instance v3, La/gpe;

    .line 82
    .line 83
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 88
    .line 89
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    invoke-direct {v3, v5, v6}, La/gpe;-><init>(J)V

    .line 94
    .line 95
    .line 96
    move-object v13, v3

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    const/4 v13, 0x0

    .line 99
    :goto_4
    new-instance v6, La/t1l0;

    .line 100
    .line 101
    const/4 v11, 0x0

    .line 102
    invoke-direct/range {v6 .. v14}, La/t1l0;-><init>(La/p1l0;La/y3d;Ljava/lang/String;Ljava/lang/Integer;La/y3d;La/uf5;La/gpe;Ljava/lang/Integer;)V

    .line 103
    .line 104
    .line 105
    iput-object v6, v0, La/c7l0;->h:La/t1l0;

    .line 106
    .line 107
    new-instance v3, La/kpe;

    .line 108
    .line 109
    invoke-direct {v3}, La/kpe;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance v4, La/zb;

    .line 113
    .line 114
    const/4 v5, 0x7

    .line 115
    const/4 v15, 0x0

    .line 116
    invoke-direct {v4, v15, v15, v5}, La/zb;-><init>(La/y3d;La/y3d;I)V

    .line 117
    .line 118
    .line 119
    new-instance v5, La/x2l0;

    .line 120
    .line 121
    invoke-direct {v5, v3, v1, v4, v2}, La/x2l0;-><init>(La/ope;ILa/zb;Z)V

    .line 122
    .line 123
    .line 124
    iput-object v5, v0, La/c7l0;->i:La/x2l0;

    .line 125
    .line 126
    return-void
.end method


# virtual methods
.method public final a()La/u1l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/c7l0;->h:La/t1l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()La/g3l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/c7l0;->i:La/x2l0;

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
    instance-of v0, p1, La/c7l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/c7l0;

    .line 10
    .line 11
    iget-object v0, p0, La/c7l0;->a:La/a2l0;

    .line 12
    .line 13
    iget-object v1, p1, La/c7l0;->a:La/a2l0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/a2l0;->equals(Ljava/lang/Object;)Z

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
    iget v0, p0, La/c7l0;->b:I

    .line 23
    .line 24
    iget v1, p1, La/c7l0;->b:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/c7l0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/c7l0;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, La/c7l0;->d:Ljava/lang/Integer;

    .line 41
    .line 42
    iget-object v1, p1, La/c7l0;->d:Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object v0, p0, La/c7l0;->e:La/uf5;

    .line 52
    .line 53
    iget-object v1, p1, La/c7l0;->e:La/uf5;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-boolean v0, p0, La/c7l0;->f:Z

    .line 63
    .line 64
    iget-boolean v1, p1, La/c7l0;->f:Z

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-object p0, p0, La/c7l0;->g:Ljava/lang/Integer;

    .line 70
    .line 71
    iget-object p1, p1, La/c7l0;->g:Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_8

    .line 78
    .line 79
    :goto_0
    const/4 p0, 0x0

    .line 80
    return p0

    .line 81
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 82
    return p0
.end method

.method public final getTitle()La/f2l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/c7l0;->a:La/a2l0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/c7l0;->a:La/a2l0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/a2l0;->hashCode()I

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
    iget v2, p0, La/c7l0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p0, La/c7l0;->c:Ljava/lang/String;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_0
    add-int/2addr v0, v3

    .line 28
    mul-int/2addr v0, v1

    .line 29
    iget-object v3, p0, La/c7l0;->d:Ljava/lang/Integer;

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    move v3, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    :goto_1
    add-int/2addr v0, v3

    .line 40
    mul-int/lit16 v0, v0, 0x3c1

    .line 41
    .line 42
    iget-object v3, p0, La/c7l0;->e:La/uf5;

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    move v3, v2

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    :goto_2
    add-int/2addr v0, v3

    .line 53
    mul-int/2addr v0, v1

    .line 54
    iget-boolean v3, p0, La/c7l0;->f:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object p0, p0, La/c7l0;->g:Ljava/lang/Integer;

    .line 61
    .line 62
    if-nez p0, :cond_3

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    :goto_3
    add-int/2addr v0, v2

    .line 70
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

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
    iget-object v1, p0, La/c7l0;->a:La/a2l0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", counterValue="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, La/c7l0;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", iconUrl="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", iconResId="

    .line 29
    .line 30
    const-string v2, ", iconColor=null, badgeStyle="

    .line 31
    .line 32
    iget-object v3, p0, La/c7l0;->d:Ljava/lang/Integer;

    .line 33
    .line 34
    iget-object v4, p0, La/c7l0;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/c7l0;->e:La/uf5;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", expanded="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-boolean v1, p0, La/c7l0;->f:Z

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", iconCounterValue="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, ")"

    .line 60
    .line 61
    iget-object p0, p0, La/c7l0;->g:Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-static {v0, p0, v1}, La/dw9;->q(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
