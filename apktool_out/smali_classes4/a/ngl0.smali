.class public final La/ngl0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/String;

.field public final d:La/mgl0;

.field public final e:La/j700;

.field public final f:Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;La/mgl0;La/j700;Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;ZZZZZLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ngl0;->a:Ljava/util/List;

    .line 14
    .line 15
    iput-object p2, p0, La/ngl0;->b:Ljava/util/List;

    .line 16
    .line 17
    iput-object p3, p0, La/ngl0;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, La/ngl0;->d:La/mgl0;

    .line 20
    .line 21
    iput-object p5, p0, La/ngl0;->e:La/j700;

    .line 22
    .line 23
    iput-object p6, p0, La/ngl0;->f:Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 24
    .line 25
    iput-boolean p7, p0, La/ngl0;->g:Z

    .line 26
    .line 27
    iput-boolean p8, p0, La/ngl0;->h:Z

    .line 28
    .line 29
    iput-boolean p9, p0, La/ngl0;->i:Z

    .line 30
    .line 31
    iput-boolean p10, p0, La/ngl0;->j:Z

    .line 32
    .line 33
    iput-boolean p11, p0, La/ngl0;->k:Z

    .line 34
    .line 35
    iput-object p12, p0, La/ngl0;->l:Ljava/lang/String;

    .line 36
    .line 37
    iput-boolean p13, p0, La/ngl0;->m:Z

    .line 38
    .line 39
    return-void
.end method

.method public static a(La/ngl0;Ljava/util/List;Ljava/util/List;Ljava/lang/String;La/mgl0;Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;ZZZZI)La/ngl0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p10

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/ngl0;->a:Ljava/util/List;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v0, La/ngl0;->b:Ljava/util/List;

    .line 20
    .line 21
    move-object v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v5, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, La/ngl0;->c:Ljava/lang/String;

    .line 30
    .line 31
    move-object v6, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    and-int/lit8 v2, v1, 0x8

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-object v2, v0, La/ngl0;->d:La/mgl0;

    .line 40
    .line 41
    move-object v7, v2

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move-object/from16 v7, p4

    .line 44
    .line 45
    :goto_3
    iget-object v8, v0, La/ngl0;->e:La/j700;

    .line 46
    .line 47
    and-int/lit8 v2, v1, 0x20

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    iget-object v2, v0, La/ngl0;->f:Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 52
    .line 53
    move-object v9, v2

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    move-object/from16 v9, p5

    .line 56
    .line 57
    :goto_4
    and-int/lit8 v2, v1, 0x40

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    iget-boolean v2, v0, La/ngl0;->g:Z

    .line 62
    .line 63
    move v10, v2

    .line 64
    goto :goto_5

    .line 65
    :cond_5
    move/from16 v10, p6

    .line 66
    .line 67
    :goto_5
    and-int/lit16 v2, v1, 0x80

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    if-eqz v2, :cond_6

    .line 71
    .line 72
    iget-boolean v2, v0, La/ngl0;->h:Z

    .line 73
    .line 74
    move v11, v2

    .line 75
    goto :goto_6

    .line 76
    :cond_6
    move v11, v3

    .line 77
    :goto_6
    and-int/lit16 v2, v1, 0x100

    .line 78
    .line 79
    if-eqz v2, :cond_7

    .line 80
    .line 81
    iget-boolean v2, v0, La/ngl0;->i:Z

    .line 82
    .line 83
    move v12, v2

    .line 84
    goto :goto_7

    .line 85
    :cond_7
    move/from16 v12, p7

    .line 86
    .line 87
    :goto_7
    and-int/lit16 v2, v1, 0x200

    .line 88
    .line 89
    if-eqz v2, :cond_8

    .line 90
    .line 91
    iget-boolean v2, v0, La/ngl0;->j:Z

    .line 92
    .line 93
    move v13, v2

    .line 94
    goto :goto_8

    .line 95
    :cond_8
    move/from16 v13, p8

    .line 96
    .line 97
    :goto_8
    and-int/lit16 v2, v1, 0x400

    .line 98
    .line 99
    if-eqz v2, :cond_9

    .line 100
    .line 101
    iget-boolean v3, v0, La/ngl0;->k:Z

    .line 102
    .line 103
    :cond_9
    move v14, v3

    .line 104
    iget-object v15, v0, La/ngl0;->l:Ljava/lang/String;

    .line 105
    .line 106
    and-int/lit16 v1, v1, 0x1000

    .line 107
    .line 108
    if-eqz v1, :cond_a

    .line 109
    .line 110
    iget-boolean v1, v0, La/ngl0;->m:Z

    .line 111
    .line 112
    move/from16 v16, v1

    .line 113
    .line 114
    goto :goto_9

    .line 115
    :cond_a
    move/from16 v16, p9

    .line 116
    .line 117
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance v3, La/ngl0;

    .line 133
    .line 134
    invoke-direct/range {v3 .. v16}, La/ngl0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;La/mgl0;La/j700;Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;ZZZZZLjava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    return-object v3
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/ngl0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ngl0;

    .line 12
    .line 13
    iget-object v0, p0, La/ngl0;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, La/ngl0;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/ngl0;->b:Ljava/util/List;

    .line 26
    .line 27
    iget-object v1, p1, La/ngl0;->b:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-object v0, p0, La/ngl0;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v1, p1, La/ngl0;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v0, p0, La/ngl0;->d:La/mgl0;

    .line 48
    .line 49
    iget-object v1, p1, La/ngl0;->d:La/mgl0;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-object v0, p0, La/ngl0;->e:La/j700;

    .line 59
    .line 60
    iget-object v1, p1, La/ngl0;->e:La/j700;

    .line 61
    .line 62
    if-eq v0, v1, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object v0, p0, La/ngl0;->f:Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 66
    .line 67
    iget-object v1, p1, La/ngl0;->f:Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget-boolean v0, p0, La/ngl0;->g:Z

    .line 77
    .line 78
    iget-boolean v1, p1, La/ngl0;->g:Z

    .line 79
    .line 80
    if-eq v0, v1, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget-boolean v0, p0, La/ngl0;->h:Z

    .line 84
    .line 85
    iget-boolean v1, p1, La/ngl0;->h:Z

    .line 86
    .line 87
    if-eq v0, v1, :cond_9

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    iget-boolean v0, p0, La/ngl0;->i:Z

    .line 91
    .line 92
    iget-boolean v1, p1, La/ngl0;->i:Z

    .line 93
    .line 94
    if-eq v0, v1, :cond_a

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_a
    iget-boolean v0, p0, La/ngl0;->j:Z

    .line 98
    .line 99
    iget-boolean v1, p1, La/ngl0;->j:Z

    .line 100
    .line 101
    if-eq v0, v1, :cond_b

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_b
    iget-boolean v0, p0, La/ngl0;->k:Z

    .line 105
    .line 106
    iget-boolean v1, p1, La/ngl0;->k:Z

    .line 107
    .line 108
    if-eq v0, v1, :cond_c

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_c
    iget-object v0, p0, La/ngl0;->l:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v1, p1, La/ngl0;->l:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_d

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_d
    iget-boolean p0, p0, La/ngl0;->m:Z

    .line 123
    .line 124
    iget-boolean p1, p1, La/ngl0;->m:Z

    .line 125
    .line 126
    if-eq p0, p1, :cond_e

    .line 127
    .line 128
    :goto_0
    const/4 p0, 0x0

    .line 129
    return p0

    .line 130
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 131
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ngl0;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/ngl0;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/ngl0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/ngl0;->d:La/mgl0;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2}, La/mgl0;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :goto_0
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-object v2, p0, La/ngl0;->e:La/j700;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, La/ngl0;->f:Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 43
    .line 44
    invoke-virtual {v0}, Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-boolean v2, p0, La/ngl0;->g:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, La/ngl0;->h:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, La/ngl0;->i:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-boolean v2, p0, La/ngl0;->j:Z

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v2, p0, La/ngl0;->k:Z

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v2, p0, La/ngl0;->l:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-boolean p0, p0, La/ngl0;->m:Z

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    add-int/2addr p0, v0

    .line 93
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", allSportItems="

    .line 2
    .line 3
    const-string v1, ", query="

    .line 4
    .line 5
    const-string v2, "SportItemsState(sportModelItems="

    .line 6
    .line 7
    iget-object v3, p0, La/ngl0;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, La/ngl0;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, La/w6x;->t(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/ngl0;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", config="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/ngl0;->d:La/mgl0;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", screenType="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/ngl0;->e:La/j700;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", selection="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/ngl0;->f:Lorg/xplatform/feed/linelive/presentation/feeds/child/sports/models/SportItemsSelectionState;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", showRefreshing="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", showShimmers="

    .line 56
    .line 57
    const-string v2, ", scrollToTop="

    .line 58
    .line 59
    iget-boolean v3, p0, La/ngl0;->g:Z

    .line 60
    .line 61
    iget-boolean v4, p0, La/ngl0;->h:Z

    .line 62
    .line 63
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", showConnectionError="

    .line 67
    .line 68
    const-string v2, ", showLoadingError="

    .line 69
    .line 70
    iget-boolean v3, p0, La/ngl0;->i:Z

    .line 71
    .line 72
    iget-boolean v4, p0, La/ngl0;->j:Z

    .line 73
    .line 74
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 75
    .line 76
    .line 77
    const-string v1, ", subtitleText="

    .line 78
    .line 79
    const-string v2, ", showSelectionButton="

    .line 80
    .line 81
    iget-object v3, p0, La/ngl0;->l:Ljava/lang/String;

    .line 82
    .line 83
    iget-boolean v4, p0, La/ngl0;->k:Z

    .line 84
    .line 85
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 86
    .line 87
    .line 88
    const-string v1, ")"

    .line 89
    .line 90
    iget-boolean p0, p0, La/ngl0;->m:Z

    .line 91
    .line 92
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method
