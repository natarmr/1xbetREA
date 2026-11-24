.class public final La/u81;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mlr;

.field public final b:La/f02;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:J

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:La/ql5;

.field public final n:La/sff0;

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:I

.field public final s:Z

.field public final t:La/ax0;

.field public final u:Ljava/util/Set;


# direct methods
.method public constructor <init>(La/mlr;La/f02;ZZZZLjava/lang/String;Ljava/lang/String;JZZZLa/ql5;La/sff0;ZZZIZLa/ax0;Ljava/util/Set;)V
    .locals 0

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La/u81;->a:La/mlr;

    .line 3
    iput-object p2, p0, La/u81;->b:La/f02;

    .line 4
    iput-boolean p3, p0, La/u81;->c:Z

    .line 5
    iput-boolean p4, p0, La/u81;->d:Z

    .line 6
    iput-boolean p5, p0, La/u81;->e:Z

    .line 7
    iput-boolean p6, p0, La/u81;->f:Z

    .line 8
    iput-object p7, p0, La/u81;->g:Ljava/lang/String;

    .line 9
    iput-object p8, p0, La/u81;->h:Ljava/lang/String;

    .line 10
    iput-wide p9, p0, La/u81;->i:J

    .line 11
    iput-boolean p11, p0, La/u81;->j:Z

    .line 12
    iput-boolean p12, p0, La/u81;->k:Z

    .line 13
    iput-boolean p13, p0, La/u81;->l:Z

    .line 14
    iput-object p14, p0, La/u81;->m:La/ql5;

    .line 15
    iput-object p15, p0, La/u81;->n:La/sff0;

    move/from16 p1, p16

    .line 16
    iput-boolean p1, p0, La/u81;->o:Z

    move/from16 p1, p17

    .line 17
    iput-boolean p1, p0, La/u81;->p:Z

    move/from16 p1, p18

    .line 18
    iput-boolean p1, p0, La/u81;->q:Z

    move/from16 p1, p19

    .line 19
    iput p1, p0, La/u81;->r:I

    move/from16 p1, p20

    .line 20
    iput-boolean p1, p0, La/u81;->s:Z

    move-object/from16 p1, p21

    .line 21
    iput-object p1, p0, La/u81;->t:La/ax0;

    move-object/from16 p1, p22

    .line 22
    iput-object p1, p0, La/u81;->u:Ljava/util/Set;

    return-void
.end method

.method public static a(La/u81;La/f02;ZZZLjava/lang/String;Ljava/lang/String;JZZLa/ql5;ZZZILa/ax0;I)La/u81;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p17

    .line 4
    .line 5
    iget-object v2, v0, La/u81;->a:La/mlr;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, La/u81;->b:La/f02;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    iget-boolean v4, v0, La/u81;->c:Z

    .line 17
    .line 18
    and-int/lit8 v5, v1, 0x8

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    iget-boolean v5, v0, La/u81;->d:Z

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move/from16 v5, p2

    .line 26
    .line 27
    :goto_1
    and-int/lit8 v6, v1, 0x10

    .line 28
    .line 29
    if-eqz v6, :cond_2

    .line 30
    .line 31
    iget-boolean v6, v0, La/u81;->e:Z

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move/from16 v6, p3

    .line 35
    .line 36
    :goto_2
    and-int/lit8 v7, v1, 0x20

    .line 37
    .line 38
    if-eqz v7, :cond_3

    .line 39
    .line 40
    iget-boolean v7, v0, La/u81;->f:Z

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move/from16 v7, p4

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v8, v1, 0x40

    .line 46
    .line 47
    if-eqz v8, :cond_4

    .line 48
    .line 49
    iget-object v8, v0, La/u81;->g:Ljava/lang/String;

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_4
    move-object/from16 v8, p5

    .line 53
    .line 54
    :goto_4
    and-int/lit16 v9, v1, 0x80

    .line 55
    .line 56
    if-eqz v9, :cond_5

    .line 57
    .line 58
    iget-object v9, v0, La/u81;->h:Ljava/lang/String;

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_5
    move-object/from16 v9, p6

    .line 62
    .line 63
    :goto_5
    and-int/lit16 v10, v1, 0x100

    .line 64
    .line 65
    if-eqz v10, :cond_6

    .line 66
    .line 67
    iget-wide v10, v0, La/u81;->i:J

    .line 68
    .line 69
    goto :goto_6

    .line 70
    :cond_6
    move-wide/from16 v10, p7

    .line 71
    .line 72
    :goto_6
    iget-boolean v12, v0, La/u81;->j:Z

    .line 73
    .line 74
    and-int/lit16 v13, v1, 0x400

    .line 75
    .line 76
    if-eqz v13, :cond_7

    .line 77
    .line 78
    iget-boolean v13, v0, La/u81;->k:Z

    .line 79
    .line 80
    goto :goto_7

    .line 81
    :cond_7
    move/from16 v13, p9

    .line 82
    .line 83
    :goto_7
    and-int/lit16 v14, v1, 0x800

    .line 84
    .line 85
    if-eqz v14, :cond_8

    .line 86
    .line 87
    iget-boolean v14, v0, La/u81;->l:Z

    .line 88
    .line 89
    goto :goto_8

    .line 90
    :cond_8
    move/from16 v14, p10

    .line 91
    .line 92
    :goto_8
    and-int/lit16 v15, v1, 0x1000

    .line 93
    .line 94
    if-eqz v15, :cond_9

    .line 95
    .line 96
    iget-object v15, v0, La/u81;->m:La/ql5;

    .line 97
    .line 98
    :goto_9
    move-object/from16 v16, v2

    .line 99
    .line 100
    goto :goto_a

    .line 101
    :cond_9
    move-object/from16 v15, p11

    .line 102
    .line 103
    goto :goto_9

    .line 104
    :goto_a
    iget-object v2, v0, La/u81;->n:La/sff0;

    .line 105
    .line 106
    move-object/from16 v17, v2

    .line 107
    .line 108
    and-int/lit16 v2, v1, 0x4000

    .line 109
    .line 110
    if-eqz v2, :cond_a

    .line 111
    .line 112
    iget-boolean v2, v0, La/u81;->o:Z

    .line 113
    .line 114
    goto :goto_b

    .line 115
    :cond_a
    move/from16 v2, p12

    .line 116
    .line 117
    :goto_b
    const v18, 0x8000

    .line 118
    .line 119
    .line 120
    and-int v18, v1, v18

    .line 121
    .line 122
    if-eqz v18, :cond_b

    .line 123
    .line 124
    iget-boolean v1, v0, La/u81;->p:Z

    .line 125
    .line 126
    goto :goto_c

    .line 127
    :cond_b
    move/from16 v1, p13

    .line 128
    .line 129
    :goto_c
    const/high16 v18, 0x10000

    .line 130
    .line 131
    and-int v18, p17, v18

    .line 132
    .line 133
    move/from16 p1, v1

    .line 134
    .line 135
    if-eqz v18, :cond_c

    .line 136
    .line 137
    iget-boolean v1, v0, La/u81;->q:Z

    .line 138
    .line 139
    move/from16 v18, v1

    .line 140
    .line 141
    goto :goto_d

    .line 142
    :cond_c
    move/from16 v18, p14

    .line 143
    .line 144
    :goto_d
    const/high16 v1, 0x20000

    .line 145
    .line 146
    and-int v1, p17, v1

    .line 147
    .line 148
    if-eqz v1, :cond_d

    .line 149
    .line 150
    iget v1, v0, La/u81;->r:I

    .line 151
    .line 152
    move/from16 v19, v1

    .line 153
    .line 154
    goto :goto_e

    .line 155
    :cond_d
    move/from16 v19, p15

    .line 156
    .line 157
    :goto_e
    const/high16 v1, 0x40000

    .line 158
    .line 159
    and-int v1, p17, v1

    .line 160
    .line 161
    if-eqz v1, :cond_e

    .line 162
    .line 163
    iget-boolean v1, v0, La/u81;->s:Z

    .line 164
    .line 165
    :goto_f
    move/from16 v20, v1

    .line 166
    .line 167
    goto :goto_10

    .line 168
    :cond_e
    const/4 v1, 0x0

    .line 169
    goto :goto_f

    .line 170
    :goto_10
    const/high16 v1, 0x80000

    .line 171
    .line 172
    and-int v1, p17, v1

    .line 173
    .line 174
    if-eqz v1, :cond_f

    .line 175
    .line 176
    iget-object v1, v0, La/u81;->t:La/ax0;

    .line 177
    .line 178
    move-object/from16 v21, v1

    .line 179
    .line 180
    goto :goto_11

    .line 181
    :cond_f
    move-object/from16 v21, p16

    .line 182
    .line 183
    :goto_11
    iget-object v1, v0, La/u81;->u:Ljava/util/Set;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    new-instance v0, La/u81;

    .line 198
    .line 199
    move-object/from16 v22, v1

    .line 200
    .line 201
    move-object/from16 v1, v16

    .line 202
    .line 203
    move/from16 v16, v2

    .line 204
    .line 205
    move-object v2, v3

    .line 206
    move v3, v4

    .line 207
    move v4, v5

    .line 208
    move v5, v6

    .line 209
    move v6, v7

    .line 210
    move-object v7, v8

    .line 211
    move-object v8, v9

    .line 212
    move-wide v9, v10

    .line 213
    move v11, v12

    .line 214
    move v12, v13

    .line 215
    move v13, v14

    .line 216
    move-object v14, v15

    .line 217
    move-object/from16 v15, v17

    .line 218
    .line 219
    move/from16 v17, p1

    .line 220
    .line 221
    invoke-direct/range {v0 .. v22}, La/u81;-><init>(La/mlr;La/f02;ZZZZLjava/lang/String;Ljava/lang/String;JZZZLa/ql5;La/sff0;ZZZIZLa/ax0;Ljava/util/Set;)V

    .line 222
    .line 223
    .line 224
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/u81;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/u81;

    .line 12
    .line 13
    iget-object v0, p0, La/u81;->a:La/mlr;

    .line 14
    .line 15
    iget-object v1, p1, La/u81;->a:La/mlr;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/mlr;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/u81;->b:La/f02;

    .line 26
    .line 27
    iget-object v1, p1, La/u81;->b:La/f02;

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
    iget-boolean v0, p0, La/u81;->c:Z

    .line 38
    .line 39
    iget-boolean v1, p1, La/u81;->c:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-boolean v0, p0, La/u81;->d:Z

    .line 46
    .line 47
    iget-boolean v1, p1, La/u81;->d:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    iget-boolean v0, p0, La/u81;->e:Z

    .line 54
    .line 55
    iget-boolean v1, p1, La/u81;->e:Z

    .line 56
    .line 57
    if-eq v0, v1, :cond_6

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_6
    iget-boolean v0, p0, La/u81;->f:Z

    .line 62
    .line 63
    iget-boolean v1, p1, La/u81;->f:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_7

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_7
    iget-object v0, p0, La/u81;->g:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, p1, La/u81;->g:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_8
    iget-object v0, p0, La/u81;->h:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p1, La/u81;->h:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_9

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_9
    iget-wide v0, p0, La/u81;->i:J

    .line 94
    .line 95
    iget-wide v2, p1, La/u81;->i:J

    .line 96
    .line 97
    cmp-long v0, v0, v2

    .line 98
    .line 99
    if-eqz v0, :cond_a

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :cond_a
    iget-boolean v0, p0, La/u81;->j:Z

    .line 104
    .line 105
    iget-boolean v1, p1, La/u81;->j:Z

    .line 106
    .line 107
    if-eq v0, v1, :cond_b

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_b
    iget-boolean v0, p0, La/u81;->k:Z

    .line 111
    .line 112
    iget-boolean v1, p1, La/u81;->k:Z

    .line 113
    .line 114
    if-eq v0, v1, :cond_c

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_c
    iget-boolean v0, p0, La/u81;->l:Z

    .line 118
    .line 119
    iget-boolean v1, p1, La/u81;->l:Z

    .line 120
    .line 121
    if-eq v0, v1, :cond_d

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_d
    iget-object v0, p0, La/u81;->m:La/ql5;

    .line 125
    .line 126
    iget-object v1, p1, La/u81;->m:La/ql5;

    .line 127
    .line 128
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_e

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_e
    iget-object v0, p0, La/u81;->n:La/sff0;

    .line 136
    .line 137
    iget-object v1, p1, La/u81;->n:La/sff0;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, La/sff0;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_f

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_f
    iget-boolean v0, p0, La/u81;->o:Z

    .line 147
    .line 148
    iget-boolean v1, p1, La/u81;->o:Z

    .line 149
    .line 150
    if-eq v0, v1, :cond_10

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_10
    iget-boolean v0, p0, La/u81;->p:Z

    .line 154
    .line 155
    iget-boolean v1, p1, La/u81;->p:Z

    .line 156
    .line 157
    if-eq v0, v1, :cond_11

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_11
    iget-boolean v0, p0, La/u81;->q:Z

    .line 161
    .line 162
    iget-boolean v1, p1, La/u81;->q:Z

    .line 163
    .line 164
    if-eq v0, v1, :cond_12

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_12
    iget v0, p0, La/u81;->r:I

    .line 168
    .line 169
    iget v1, p1, La/u81;->r:I

    .line 170
    .line 171
    if-eq v0, v1, :cond_13

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_13
    iget-boolean v0, p0, La/u81;->s:Z

    .line 175
    .line 176
    iget-boolean v1, p1, La/u81;->s:Z

    .line 177
    .line 178
    if-eq v0, v1, :cond_14

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_14
    iget-object v0, p0, La/u81;->t:La/ax0;

    .line 182
    .line 183
    iget-object v1, p1, La/u81;->t:La/ax0;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, La/ax0;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_15

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_15
    iget-object p0, p0, La/u81;->u:Ljava/util/Set;

    .line 193
    .line 194
    iget-object p1, p1, La/u81;->u:Ljava/util/Set;

    .line 195
    .line 196
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-nez p0, :cond_16

    .line 201
    .line 202
    :goto_0
    const/4 p0, 0x0

    .line 203
    return p0

    .line 204
    :cond_16
    :goto_1
    const/4 p0, 0x1

    .line 205
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/u81;->a:La/mlr;

    .line 2
    .line 3
    invoke-virtual {v0}, La/mlr;->hashCode()I

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
    iget-object v3, p0, La/u81;->b:La/f02;

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
    invoke-virtual {v3}, La/f02;->hashCode()I

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
    iget-boolean v3, p0, La/u81;->c:Z

    .line 24
    .line 25
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-boolean v3, p0, La/u81;->d:Z

    .line 30
    .line 31
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-boolean v3, p0, La/u81;->e:Z

    .line 36
    .line 37
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v3, p0, La/u81;->f:Z

    .line 42
    .line 43
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v3, p0, La/u81;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object v3, p0, La/u81;->h:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-wide v3, p0, La/u81;->i:J

    .line 60
    .line 61
    invoke-static {v0, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-boolean v3, p0, La/u81;->j:Z

    .line 66
    .line 67
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-boolean v3, p0, La/u81;->k:Z

    .line 72
    .line 73
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-boolean v3, p0, La/u81;->l:Z

    .line 78
    .line 79
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v3, p0, La/u81;->m:La/ql5;

    .line 84
    .line 85
    if-nez v3, :cond_1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    invoke-virtual {v3}, La/ql5;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    :goto_1
    add-int/2addr v0, v2

    .line 93
    mul-int/2addr v0, v1

    .line 94
    iget-object v2, p0, La/u81;->n:La/sff0;

    .line 95
    .line 96
    invoke-static {v2, v0, v1}, La/cs0;->c(La/sff0;II)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-boolean v2, p0, La/u81;->o:Z

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-boolean v2, p0, La/u81;->p:Z

    .line 107
    .line 108
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-boolean v2, p0, La/u81;->q:Z

    .line 113
    .line 114
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget v2, p0, La/u81;->r:I

    .line 119
    .line 120
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-boolean v2, p0, La/u81;->s:Z

    .line 125
    .line 126
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget-object v2, p0, La/u81;->t:La/ax0;

    .line 131
    .line 132
    invoke-virtual {v2}, La/ax0;->hashCode()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    add-int/2addr v2, v0

    .line 137
    mul-int/2addr v2, v1

    .line 138
    iget-object p0, p0, La/u81;->u:Ljava/util/Set;

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    add-int/2addr p0, v2

    .line 145
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AggregatorMultiModeGameStateModel(game="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/u81;->a:La/mlr;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", webGameResult="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/u81;->b:La/f02;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", fromMainScreen="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", isDemo="

    .line 29
    .line 30
    const-string v2, ", isLoading="

    .line 31
    .line 32
    iget-boolean v3, p0, La/u81;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/u81;->d:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", isFavorite="

    .line 40
    .line 41
    const-string v2, ", gameUrl="

    .line 42
    .line 43
    iget-boolean v3, p0, La/u81;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, La/u81;->f:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", lobbyUrl="

    .line 51
    .line 52
    const-string v2, ", balanceId="

    .line 53
    .line 54
    iget-object v3, p0, La/u81;->g:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v4, p0, La/u81;->h:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", debugAllowed="

    .line 62
    .line 63
    iget-wide v2, p0, La/u81;->i:J

    .line 64
    .line 65
    iget-boolean v4, p0, La/u81;->j:Z

    .line 66
    .line 67
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", isFullScreen="

    .line 71
    .line 72
    const-string v2, ", isAuth="

    .line 73
    .line 74
    iget-boolean v3, p0, La/u81;->k:Z

    .line 75
    .line 76
    iget-boolean v4, p0, La/u81;->l:Z

    .line 77
    .line 78
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 79
    .line 80
    .line 81
    const-string v1, ", balanceModel="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, La/u81;->m:La/ql5;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v1, ", remoteConfigModel="

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, La/u81;->n:La/sff0;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ", isAlreadyShownUnknownError="

    .line 102
    .line 103
    const-string v2, ", disabledHandleAction="

    .line 104
    .line 105
    iget-boolean v3, p0, La/u81;->o:Z

    .line 106
    .line 107
    iget-boolean v4, p0, La/u81;->p:Z

    .line 108
    .line 109
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 110
    .line 111
    .line 112
    const-string v1, ", changeGameModeAfterPayment="

    .line 113
    .line 114
    const-string v2, ", playForRealTimeout="

    .line 115
    .line 116
    iget v3, p0, La/u81;->r:I

    .line 117
    .line 118
    iget-boolean v4, p0, La/u81;->q:Z

    .line 119
    .line 120
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 121
    .line 122
    .line 123
    const-string v1, ", taxInfoVisible="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-boolean v1, p0, La/u81;->s:Z

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", aggregatorGameWebViewState="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, La/u81;->t:La/ax0;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", currentLimitedListeners="

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object p0, p0, La/u81;->u:Ljava/util/Set;

    .line 149
    .line 150
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string p0, ")"

    .line 154
    .line 155
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0
.end method
