.class public final La/mbp0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

.field public final c:La/o9p0;

.field public final d:Ljava/util/Map;

.field public final e:Z

.field public final f:La/sff0;

.field public final g:La/v8d;

.field public final h:La/fbp0;

.field public final i:Z

.field public final j:Ljava/util/List;

.field public final k:La/e9p0;

.field public final l:La/obp0;

.field public final m:Ljava/lang/Integer;

.field public final n:Ljava/util/List;

.field public final o:Z


# direct methods
.method public constructor <init>(ZLorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;La/o9p0;Ljava/util/Map;ZLa/sff0;La/v8d;La/fbp0;ZLjava/util/List;La/e9p0;La/obp0;Ljava/lang/Integer;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-boolean p1, p0, La/mbp0;->a:Z

    .line 14
    .line 15
    iput-object p2, p0, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 16
    .line 17
    iput-object p3, p0, La/mbp0;->c:La/o9p0;

    .line 18
    .line 19
    iput-object p4, p0, La/mbp0;->d:Ljava/util/Map;

    .line 20
    .line 21
    iput-boolean p5, p0, La/mbp0;->e:Z

    .line 22
    .line 23
    iput-object p6, p0, La/mbp0;->f:La/sff0;

    .line 24
    .line 25
    iput-object p7, p0, La/mbp0;->g:La/v8d;

    .line 26
    .line 27
    iput-object p8, p0, La/mbp0;->h:La/fbp0;

    .line 28
    .line 29
    iput-boolean p9, p0, La/mbp0;->i:Z

    .line 30
    .line 31
    iput-object p10, p0, La/mbp0;->j:Ljava/util/List;

    .line 32
    .line 33
    iput-object p11, p0, La/mbp0;->k:La/e9p0;

    .line 34
    .line 35
    iput-object p12, p0, La/mbp0;->l:La/obp0;

    .line 36
    .line 37
    iput-object p13, p0, La/mbp0;->m:Ljava/lang/Integer;

    .line 38
    .line 39
    iput-object p14, p0, La/mbp0;->n:Ljava/util/List;

    .line 40
    .line 41
    iput-boolean p15, p0, La/mbp0;->o:Z

    .line 42
    .line 43
    return-void
.end method

.method public static a(La/mbp0;ZLa/o9p0;Ljava/util/Map;La/fbp0;La/e9p0;La/obp0;Ljava/lang/Integer;Ljava/util/ArrayList;I)La/mbp0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p9

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-boolean v2, v0, La/mbp0;->a:Z

    .line 10
    .line 11
    move v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    iget-object v5, v0, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 16
    .line 17
    and-int/lit8 v2, v1, 0x4

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v0, La/mbp0;->c:La/o9p0;

    .line 22
    .line 23
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object/from16 v6, p2

    .line 26
    .line 27
    :goto_1
    and-int/lit8 v2, v1, 0x8

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-object v2, v0, La/mbp0;->d:Ljava/util/Map;

    .line 32
    .line 33
    move-object v7, v2

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object/from16 v7, p3

    .line 36
    .line 37
    :goto_2
    iget-boolean v8, v0, La/mbp0;->e:Z

    .line 38
    .line 39
    iget-object v9, v0, La/mbp0;->f:La/sff0;

    .line 40
    .line 41
    iget-object v10, v0, La/mbp0;->g:La/v8d;

    .line 42
    .line 43
    and-int/lit16 v2, v1, 0x80

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    iget-object v2, v0, La/mbp0;->h:La/fbp0;

    .line 48
    .line 49
    move-object v11, v2

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object/from16 v11, p4

    .line 52
    .line 53
    :goto_3
    iget-boolean v12, v0, La/mbp0;->i:Z

    .line 54
    .line 55
    iget-object v13, v0, La/mbp0;->j:Ljava/util/List;

    .line 56
    .line 57
    and-int/lit16 v2, v1, 0x400

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    iget-object v2, v0, La/mbp0;->k:La/e9p0;

    .line 62
    .line 63
    move-object v14, v2

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move-object/from16 v14, p5

    .line 66
    .line 67
    :goto_4
    and-int/lit16 v2, v1, 0x800

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    iget-object v2, v0, La/mbp0;->l:La/obp0;

    .line 72
    .line 73
    move-object v15, v2

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    move-object/from16 v15, p6

    .line 76
    .line 77
    :goto_5
    and-int/lit16 v2, v1, 0x1000

    .line 78
    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    iget-object v2, v0, La/mbp0;->m:Ljava/lang/Integer;

    .line 82
    .line 83
    move-object/from16 v16, v2

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_6
    move-object/from16 v16, p7

    .line 87
    .line 88
    :goto_6
    and-int/lit16 v1, v1, 0x2000

    .line 89
    .line 90
    if-eqz v1, :cond_7

    .line 91
    .line 92
    iget-object v1, v0, La/mbp0;->n:Ljava/util/List;

    .line 93
    .line 94
    move-object/from16 v17, v1

    .line 95
    .line 96
    goto :goto_7

    .line 97
    :cond_7
    move-object/from16 v17, p8

    .line 98
    .line 99
    :goto_7
    iget-boolean v1, v0, La/mbp0;->o:Z

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v3, La/mbp0;

    .line 117
    .line 118
    move/from16 v18, v1

    .line 119
    .line 120
    invoke-direct/range {v3 .. v18}, La/mbp0;-><init>(ZLorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;La/o9p0;Ljava/util/Map;ZLa/sff0;La/v8d;La/fbp0;ZLjava/util/List;La/e9p0;La/obp0;Ljava/lang/Integer;Ljava/util/List;Z)V

    .line 121
    .line 122
    .line 123
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
    instance-of v0, p1, La/mbp0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/mbp0;

    .line 12
    .line 13
    iget-boolean v0, p0, La/mbp0;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/mbp0;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 22
    .line 23
    iget-object v1, p1, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/mbp0;->c:La/o9p0;

    .line 34
    .line 35
    iget-object v1, p1, La/mbp0;->c:La/o9p0;

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
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, La/mbp0;->d:Ljava/util/Map;

    .line 46
    .line 47
    iget-object v1, p1, La/mbp0;->d:Ljava/util/Map;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-boolean v0, p0, La/mbp0;->e:Z

    .line 58
    .line 59
    iget-boolean v1, p1, La/mbp0;->e:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-object v0, p0, La/mbp0;->f:La/sff0;

    .line 66
    .line 67
    iget-object v1, p1, La/mbp0;->f:La/sff0;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, La/sff0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/mbp0;->g:La/v8d;

    .line 77
    .line 78
    iget-object v1, p1, La/mbp0;->g:La/v8d;

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-object v0, p0, La/mbp0;->h:La/fbp0;

    .line 88
    .line 89
    iget-object v1, p1, La/mbp0;->h:La/fbp0;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-boolean v0, p0, La/mbp0;->i:Z

    .line 99
    .line 100
    iget-boolean v1, p1, La/mbp0;->i:Z

    .line 101
    .line 102
    if-eq v0, v1, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-object v0, p0, La/mbp0;->j:Ljava/util/List;

    .line 106
    .line 107
    iget-object v1, p1, La/mbp0;->j:Ljava/util/List;

    .line 108
    .line 109
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_b

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_b
    iget-object v0, p0, La/mbp0;->k:La/e9p0;

    .line 117
    .line 118
    iget-object v1, p1, La/mbp0;->k:La/e9p0;

    .line 119
    .line 120
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_c

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_c
    iget-object v0, p0, La/mbp0;->l:La/obp0;

    .line 128
    .line 129
    iget-object v1, p1, La/mbp0;->l:La/obp0;

    .line 130
    .line 131
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_d

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_d
    iget-object v0, p0, La/mbp0;->m:Ljava/lang/Integer;

    .line 139
    .line 140
    iget-object v1, p1, La/mbp0;->m:Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_e

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_e
    iget-object v0, p0, La/mbp0;->n:Ljava/util/List;

    .line 150
    .line 151
    iget-object v1, p1, La/mbp0;->n:Ljava/util/List;

    .line 152
    .line 153
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_f

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_f
    iget-boolean p0, p0, La/mbp0;->o:Z

    .line 161
    .line 162
    iget-boolean p1, p1, La/mbp0;->o:Z

    .line 163
    .line 164
    if-eq p0, p1, :cond_10

    .line 165
    .line 166
    :goto_0
    const/4 p0, 0x0

    .line 167
    return p0

    .line 168
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 169
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/mbp0;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v2, p0, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 11
    .line 12
    invoke-virtual {v2}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/4 v0, 0x0

    .line 19
    iget-object v3, p0, La/mbp0;->c:La/o9p0;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    move v3, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v3}, La/o9p0;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    :goto_0
    add-int/2addr v2, v3

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget-object v3, p0, La/mbp0;->d:Ljava/util/Map;

    .line 32
    .line 33
    invoke-static {v3, v2, v1}, La/ohs0;->f(Ljava/util/Map;II)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-boolean v3, p0, La/mbp0;->e:Z

    .line 38
    .line 39
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iget-object v3, p0, La/mbp0;->f:La/sff0;

    .line 44
    .line 45
    invoke-static {v3, v2, v1}, La/cs0;->c(La/sff0;II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-object v3, p0, La/mbp0;->g:La/v8d;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    add-int/2addr v3, v2

    .line 56
    mul-int/2addr v3, v1

    .line 57
    iget-object v2, p0, La/mbp0;->h:La/fbp0;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/2addr v2, v3

    .line 64
    mul-int/2addr v2, v1

    .line 65
    iget-boolean v3, p0, La/mbp0;->i:Z

    .line 66
    .line 67
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iget-object v3, p0, La/mbp0;->j:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {v2, v1, v3}, La/dw9;->a(IILjava/util/List;)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    iget-object v3, p0, La/mbp0;->k:La/e9p0;

    .line 78
    .line 79
    if-nez v3, :cond_1

    .line 80
    .line 81
    move v3, v0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v3}, La/e9p0;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    :goto_1
    add-int/2addr v2, v3

    .line 88
    mul-int/2addr v2, v1

    .line 89
    iget-object v3, p0, La/mbp0;->l:La/obp0;

    .line 90
    .line 91
    if-nez v3, :cond_2

    .line 92
    .line 93
    move v3, v0

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v3}, La/obp0;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :goto_2
    add-int/2addr v2, v3

    .line 100
    mul-int/2addr v2, v1

    .line 101
    iget-object v3, p0, La/mbp0;->m:Ljava/lang/Integer;

    .line 102
    .line 103
    if-nez v3, :cond_3

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    :goto_3
    add-int/2addr v2, v0

    .line 111
    mul-int/2addr v2, v1

    .line 112
    iget-object v0, p0, La/mbp0;->n:Ljava/util/List;

    .line 113
    .line 114
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-boolean p0, p0, La/mbp0;->o:Z

    .line 119
    .line 120
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    add-int/2addr p0, v0

    .line 125
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TeamDetailsStateModel(connected="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, La/mbp0;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", params="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", teamDetails="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/mbp0;->c:La/o9p0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", sportMap="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/mbp0;->d:Ljava/util/Map;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", tablet="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, La/mbp0;->e:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", remoteConfigModel="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/mbp0;->f:La/sff0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", commonConfigModel="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/mbp0;->g:La/v8d;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", currentSegment="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/mbp0;->h:La/fbp0;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", bettingDisabled="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", specialEventList="

    .line 89
    .line 90
    const-string v2, ", eventsScenarioModel="

    .line 91
    .line 92
    iget-object v3, p0, La/mbp0;->j:Ljava/util/List;

    .line 93
    .line 94
    iget-boolean v4, p0, La/mbp0;->i:Z

    .line 95
    .line 96
    invoke-static {v0, v1, v3, v2, v4}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, La/mbp0;->k:La/e9p0;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, ", teamScenarioModel="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, La/mbp0;->l:La/obp0;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", selectedDateIndex="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v1, ", allLineups="

    .line 120
    .line 121
    const-string v2, ", supportRtl="

    .line 122
    .line 123
    iget-object v3, p0, La/mbp0;->m:Ljava/lang/Integer;

    .line 124
    .line 125
    iget-object v4, p0, La/mbp0;->n:Ljava/util/List;

    .line 126
    .line 127
    invoke-static {v0, v3, v1, v4, v2}, La/cs0;->z(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string v1, ")"

    .line 131
    .line 132
    iget-boolean p0, p0, La/mbp0;->o:Z

    .line 133
    .line 134
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0
.end method
