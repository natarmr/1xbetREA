.class public final La/g72;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Date;

.field public final c:Z

.field public final d:La/f72;

.field public final e:La/j8l0;

.field public final f:La/zvh0;

.field public final g:La/v5l0;

.field public final h:La/i8l0;

.field public final i:La/h8l0;

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:I

.field public final n:Z

.field public final o:Z

.field public final p:Ljava/util/Set;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;ZLa/f72;La/j8l0;La/zvh0;La/v5l0;La/i8l0;La/h8l0;ZZZIZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/g72;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p2, p0, La/g72;->b:Ljava/util/Date;

    .line 19
    .line 20
    iput-boolean p3, p0, La/g72;->c:Z

    .line 21
    .line 22
    iput-object p4, p0, La/g72;->d:La/f72;

    .line 23
    .line 24
    iput-object p5, p0, La/g72;->e:La/j8l0;

    .line 25
    .line 26
    iput-object p6, p0, La/g72;->f:La/zvh0;

    .line 27
    .line 28
    iput-object p7, p0, La/g72;->g:La/v5l0;

    .line 29
    .line 30
    iput-object p8, p0, La/g72;->h:La/i8l0;

    .line 31
    .line 32
    iput-object p9, p0, La/g72;->i:La/h8l0;

    .line 33
    .line 34
    iput-boolean p10, p0, La/g72;->j:Z

    .line 35
    .line 36
    iput-boolean p11, p0, La/g72;->k:Z

    .line 37
    .line 38
    iput-boolean p12, p0, La/g72;->l:Z

    .line 39
    .line 40
    iput p13, p0, La/g72;->m:I

    .line 41
    .line 42
    iput-boolean p14, p0, La/g72;->n:Z

    .line 43
    .line 44
    iput-boolean p15, p0, La/g72;->o:Z

    .line 45
    .line 46
    move-object/from16 p1, p16

    .line 47
    .line 48
    iput-object p1, p0, La/g72;->p:Ljava/util/Set;

    .line 49
    .line 50
    move-object/from16 p1, p17

    .line 51
    .line 52
    iput-object p1, p0, La/g72;->q:Ljava/util/List;

    .line 53
    .line 54
    move-object/from16 p1, p18

    .line 55
    .line 56
    iput-object p1, p0, La/g72;->r:Ljava/util/Set;

    .line 57
    .line 58
    return-void
.end method

.method public static a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p13

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/g72;->a:Ljava/lang/String;

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
    iget-object v2, v0, La/g72;->b:Ljava/util/Date;

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
    iget-boolean v2, v0, La/g72;->c:Z

    .line 30
    .line 31
    move v6, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v2, v1, 0x10

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget-object v2, v0, La/g72;->d:La/f72;

    .line 43
    .line 44
    move-object v7, v2

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    move-object/from16 v7, p4

    .line 47
    .line 48
    :goto_3
    iget-object v8, v0, La/g72;->e:La/j8l0;

    .line 49
    .line 50
    iget-object v9, v0, La/g72;->f:La/zvh0;

    .line 51
    .line 52
    iget-object v10, v0, La/g72;->g:La/v5l0;

    .line 53
    .line 54
    iget-object v11, v0, La/g72;->h:La/i8l0;

    .line 55
    .line 56
    iget-object v12, v0, La/g72;->i:La/h8l0;

    .line 57
    .line 58
    and-int/lit16 v2, v1, 0x400

    .line 59
    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    iget-boolean v2, v0, La/g72;->j:Z

    .line 63
    .line 64
    move v13, v2

    .line 65
    goto :goto_4

    .line 66
    :cond_4
    move/from16 v13, p5

    .line 67
    .line 68
    :goto_4
    and-int/lit16 v2, v1, 0x800

    .line 69
    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    iget-boolean v2, v0, La/g72;->k:Z

    .line 73
    .line 74
    move v14, v2

    .line 75
    goto :goto_5

    .line 76
    :cond_5
    move/from16 v14, p6

    .line 77
    .line 78
    :goto_5
    and-int/lit16 v2, v1, 0x1000

    .line 79
    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    iget-boolean v2, v0, La/g72;->l:Z

    .line 83
    .line 84
    move v15, v2

    .line 85
    goto :goto_6

    .line 86
    :cond_6
    move/from16 v15, p7

    .line 87
    .line 88
    :goto_6
    iget v2, v0, La/g72;->m:I

    .line 89
    .line 90
    and-int/lit16 v3, v1, 0x4000

    .line 91
    .line 92
    if-eqz v3, :cond_7

    .line 93
    .line 94
    iget-boolean v3, v0, La/g72;->n:Z

    .line 95
    .line 96
    move/from16 v17, v3

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_7
    move/from16 v17, p8

    .line 100
    .line 101
    :goto_7
    const v3, 0x8000

    .line 102
    .line 103
    .line 104
    and-int/2addr v3, v1

    .line 105
    if-eqz v3, :cond_8

    .line 106
    .line 107
    iget-boolean v3, v0, La/g72;->o:Z

    .line 108
    .line 109
    move/from16 v18, v3

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_8
    move/from16 v18, p9

    .line 113
    .line 114
    :goto_8
    const/high16 v3, 0x10000

    .line 115
    .line 116
    and-int/2addr v3, v1

    .line 117
    if-eqz v3, :cond_9

    .line 118
    .line 119
    iget-object v3, v0, La/g72;->p:Ljava/util/Set;

    .line 120
    .line 121
    move-object/from16 v19, v3

    .line 122
    .line 123
    goto :goto_9

    .line 124
    :cond_9
    move-object/from16 v19, p10

    .line 125
    .line 126
    :goto_9
    const/high16 v3, 0x20000

    .line 127
    .line 128
    and-int/2addr v3, v1

    .line 129
    if-eqz v3, :cond_a

    .line 130
    .line 131
    iget-object v3, v0, La/g72;->q:Ljava/util/List;

    .line 132
    .line 133
    move-object/from16 v20, v3

    .line 134
    .line 135
    goto :goto_a

    .line 136
    :cond_a
    move-object/from16 v20, p11

    .line 137
    .line 138
    :goto_a
    const/high16 v3, 0x40000

    .line 139
    .line 140
    and-int/2addr v1, v3

    .line 141
    if-eqz v1, :cond_b

    .line 142
    .line 143
    iget-object v1, v0, La/g72;->r:Ljava/util/Set;

    .line 144
    .line 145
    move-object/from16 v21, v1

    .line 146
    .line 147
    goto :goto_b

    .line 148
    :cond_b
    move-object/from16 v21, p12

    .line 149
    .line 150
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v3, La/g72;

    .line 166
    .line 167
    move/from16 v16, v2

    .line 168
    .line 169
    invoke-direct/range {v3 .. v21}, La/g72;-><init>(Ljava/lang/String;Ljava/util/Date;ZLa/f72;La/j8l0;La/zvh0;La/v5l0;La/i8l0;La/h8l0;ZZZIZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;)V

    .line 170
    .line 171
    .line 172
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
    instance-of v0, p1, La/g72;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/g72;

    .line 12
    .line 13
    iget-object v0, p0, La/g72;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/g72;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/g72;->b:Ljava/util/Date;

    .line 26
    .line 27
    iget-object v1, p1, La/g72;->b:Ljava/util/Date;

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
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-boolean v0, p0, La/g72;->c:Z

    .line 38
    .line 39
    iget-boolean v1, p1, La/g72;->c:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, La/g72;->d:La/f72;

    .line 46
    .line 47
    iget-object v1, p1, La/g72;->d:La/f72;

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
    iget-object v0, p0, La/g72;->e:La/j8l0;

    .line 58
    .line 59
    iget-object v1, p1, La/g72;->e:La/j8l0;

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-object v0, p0, La/g72;->f:La/zvh0;

    .line 66
    .line 67
    iget-object v1, p1, La/g72;->f:La/zvh0;

    .line 68
    .line 69
    if-eq v0, v1, :cond_7

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_7
    iget-object v0, p0, La/g72;->g:La/v5l0;

    .line 74
    .line 75
    iget-object v1, p1, La/g72;->g:La/v5l0;

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-object v0, p0, La/g72;->h:La/i8l0;

    .line 81
    .line 82
    iget-object v1, p1, La/g72;->h:La/i8l0;

    .line 83
    .line 84
    if-eq v0, v1, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-object v0, p0, La/g72;->i:La/h8l0;

    .line 88
    .line 89
    iget-object v1, p1, La/g72;->i:La/h8l0;

    .line 90
    .line 91
    if-eq v0, v1, :cond_a

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_a
    iget-boolean v0, p0, La/g72;->j:Z

    .line 95
    .line 96
    iget-boolean v1, p1, La/g72;->j:Z

    .line 97
    .line 98
    if-eq v0, v1, :cond_b

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_b
    iget-boolean v0, p0, La/g72;->k:Z

    .line 102
    .line 103
    iget-boolean v1, p1, La/g72;->k:Z

    .line 104
    .line 105
    if-eq v0, v1, :cond_c

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_c
    iget-boolean v0, p0, La/g72;->l:Z

    .line 109
    .line 110
    iget-boolean v1, p1, La/g72;->l:Z

    .line 111
    .line 112
    if-eq v0, v1, :cond_d

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_d
    iget v0, p0, La/g72;->m:I

    .line 116
    .line 117
    iget v1, p1, La/g72;->m:I

    .line 118
    .line 119
    if-eq v0, v1, :cond_e

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_e
    iget-boolean v0, p0, La/g72;->n:Z

    .line 123
    .line 124
    iget-boolean v1, p1, La/g72;->n:Z

    .line 125
    .line 126
    if-eq v0, v1, :cond_f

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_f
    iget-boolean v0, p0, La/g72;->o:Z

    .line 130
    .line 131
    iget-boolean v1, p1, La/g72;->o:Z

    .line 132
    .line 133
    if-eq v0, v1, :cond_10

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_10
    iget-object v0, p0, La/g72;->p:Ljava/util/Set;

    .line 137
    .line 138
    iget-object v1, p1, La/g72;->p:Ljava/util/Set;

    .line 139
    .line 140
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_11

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_11
    iget-object v0, p0, La/g72;->q:Ljava/util/List;

    .line 148
    .line 149
    iget-object v1, p1, La/g72;->q:Ljava/util/List;

    .line 150
    .line 151
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_12

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_12
    iget-object p0, p0, La/g72;->r:Ljava/util/Set;

    .line 159
    .line 160
    iget-object p1, p1, La/g72;->r:Ljava/util/Set;

    .line 161
    .line 162
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-nez p0, :cond_13

    .line 167
    .line 168
    :goto_0
    const/4 p0, 0x0

    .line 169
    return p0

    .line 170
    :cond_13
    :goto_1
    const/4 p0, 0x1

    .line 171
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/g72;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v3, p0, La/g72;->b:Ljava/util/Date;

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
    invoke-virtual {v3}, Ljava/util/Date;->hashCode()I

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
    iget-boolean v3, p0, La/g72;->c:Z

    .line 24
    .line 25
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v2, p0, La/g72;->d:La/f72;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v0

    .line 40
    mul-int/2addr v2, v1

    .line 41
    iget-object v0, p0, La/g72;->e:La/j8l0;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v0, v2

    .line 48
    mul-int/2addr v0, v1

    .line 49
    iget-object v2, p0, La/g72;->f:La/zvh0;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    add-int/2addr v2, v0

    .line 56
    mul-int/2addr v2, v1

    .line 57
    iget-object v0, p0, La/g72;->g:La/v5l0;

    .line 58
    .line 59
    invoke-static {v0, v2, v1}, La/axq;->c(La/v5l0;II)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v2, p0, La/g72;->h:La/i8l0;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    add-int/2addr v2, v0

    .line 70
    mul-int/2addr v2, v1

    .line 71
    iget-object v0, p0, La/g72;->i:La/h8l0;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    add-int/2addr v0, v2

    .line 78
    mul-int/2addr v0, v1

    .line 79
    iget-boolean v2, p0, La/g72;->j:Z

    .line 80
    .line 81
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-boolean v2, p0, La/g72;->k:Z

    .line 86
    .line 87
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-boolean v2, p0, La/g72;->l:Z

    .line 92
    .line 93
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget v2, p0, La/g72;->m:I

    .line 98
    .line 99
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-boolean v2, p0, La/g72;->n:Z

    .line 104
    .line 105
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-boolean v2, p0, La/g72;->o:Z

    .line 110
    .line 111
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v2, p0, La/g72;->p:Ljava/util/Set;

    .line 116
    .line 117
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iget-object v2, p0, La/g72;->q:Ljava/util/List;

    .line 122
    .line 123
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iget-object p0, p0, La/g72;->r:Ljava/util/Set;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    add-int/2addr p0, v0

    .line 134
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AltChampResultsState(searchQuery="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/g72;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", choosenDate="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/g72;->b:Ljava/util/Date;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", connected="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, La/g72;->c:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", isLoading=false, champsState="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/g72;->d:La/f72;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", sportFeedListStyle="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/g72;->e:La/j8l0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", segmentControlStyleModel="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/g72;->f:La/zvh0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", sportEventCardStyle="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/g72;->g:La/v5l0;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", sportFeedListIconStyle="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/g72;->h:La/i8l0;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", sportFeedHeaderStyle="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, La/g72;->i:La/h8l0;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", isSearchActive="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-boolean v1, p0, La/g72;->j:Z

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", refresh="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, ", scrollTop="

    .line 109
    .line 110
    const-string v2, ", lottieType="

    .line 111
    .line 112
    iget-boolean v3, p0, La/g72;->k:Z

    .line 113
    .line 114
    iget-boolean v4, p0, La/g72;->l:Z

    .line 115
    .line 116
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 117
    .line 118
    .line 119
    const-string v1, ", expandedInitedSport="

    .line 120
    .line 121
    const-string v2, ", selectionEnable="

    .line 122
    .line 123
    iget v3, p0, La/g72;->m:I

    .line 124
    .line 125
    iget-boolean v4, p0, La/g72;->n:Z

    .line 126
    .line 127
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 128
    .line 129
    .line 130
    iget-boolean v1, p0, La/g72;->o:Z

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, ", selectedIds="

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget-object v1, p0, La/g72;->p:Ljava/util/Set;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v1, ", favoriteChampModels="

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-object v1, p0, La/g72;->q:Ljava/util/List;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v1, ", expandedIds="

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    iget-object p0, p0, La/g72;->r:Ljava/util/Set;

    .line 161
    .line 162
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string p0, ")"

    .line 166
    .line 167
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0
.end method
