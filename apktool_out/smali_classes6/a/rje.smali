.class public abstract La/rje;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/oje;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    sget-object v0, La/pnh0;->a:La/pnh0;

    .line 2
    .line 3
    sget-object v0, La/k13;->a:La/zfn;

    .line 4
    .line 5
    sget-object v0, La/pnh0;->a:La/pnh0;

    .line 6
    .line 7
    sget-object v0, La/pnh0;->a:La/pnh0;

    .line 8
    .line 9
    new-instance v1, La/oje;

    .line 10
    .line 11
    sget-wide v2, La/y3d;->c:J

    .line 12
    .line 13
    sget-wide v4, La/y3d;->b:J

    .line 14
    .line 15
    const v0, 0x3ec28f5c    # 0.38f

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v4, v5}, La/y3d;->c(FJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v8

    .line 22
    invoke-static {v0, v4, v5}, La/y3d;->c(FJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v10

    .line 26
    move-wide v6, v4

    .line 27
    invoke-direct/range {v1 .. v11}, La/oje;-><init>(JJJJJ)V

    .line 28
    .line 29
    .line 30
    sput-object v1, La/rje;->a:La/oje;

    .line 31
    .line 32
    return-void
.end method

.method public static final a(La/oje;La/mm40;La/ugd;La/fet;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    const v2, -0x1f76910f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v2, v4, 0x6

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v2, 0x2

    .line 28
    :goto_0
    or-int/2addr v2, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v4

    .line 31
    :goto_1
    and-int/lit8 v5, v4, 0x30

    .line 32
    .line 33
    move-object/from16 v6, p1

    .line 34
    .line 35
    if-nez v5, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    const/16 v5, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v5, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v2, v5

    .line 49
    :cond_3
    and-int/lit16 v5, v4, 0x180

    .line 50
    .line 51
    if-nez v5, :cond_5

    .line 52
    .line 53
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    const/16 v5, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v5, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v2, v5

    .line 65
    :cond_5
    and-int/lit16 v5, v2, 0x93

    .line 66
    .line 67
    const/16 v7, 0x92

    .line 68
    .line 69
    const/4 v14, 0x0

    .line 70
    const/4 v15, 0x1

    .line 71
    if-eq v5, v7, :cond_6

    .line 72
    .line 73
    move v5, v15

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    move v5, v14

    .line 76
    :goto_4
    and-int/lit8 v7, v2, 0x1

    .line 77
    .line 78
    invoke-virtual {v0, v7, v5}, La/fet;->U(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_8

    .line 83
    .line 84
    sget-object v5, La/qje;->a:La/yx7;

    .line 85
    .line 86
    const/high16 v5, 0x40800000    # 4.0f

    .line 87
    .line 88
    invoke-static {v5}, La/vgg0;->a(F)La/ugg0;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const-wide/16 v11, 0x0

    .line 93
    .line 94
    const/16 v13, 0x1c

    .line 95
    .line 96
    const/high16 v7, 0x40400000    # 3.0f

    .line 97
    .line 98
    const-wide/16 v9, 0x0

    .line 99
    .line 100
    invoke-static/range {v6 .. v13}, La/bww;->U(La/mm40;FLa/ugg0;JJI)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-wide v6, v1, La/oje;->a:J

    .line 105
    .line 106
    sget-object v8, La/jd8;->n:La/ljc;

    .line 107
    .line 108
    invoke-static {v5, v6, v7, v8}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    sget-object v6, La/enx;->b:La/enx;

    .line 113
    .line 114
    invoke-static {v5, v6}, La/q8a;->y0(La/mm40;La/enx;)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    const/4 v6, 0x0

    .line 119
    sget v7, La/qje;->d:F

    .line 120
    .line 121
    invoke-static {v5, v6, v7, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-static {v0}, La/wha0;->T(La/fet;)La/rah0;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const/16 v7, 0xe

    .line 130
    .line 131
    invoke-static {v5, v6, v14, v7}, La/wha0;->a0(La/mm40;La/rah0;ZI)La/mm40;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    shl-int/lit8 v2, v2, 0x3

    .line 136
    .line 137
    and-int/lit16 v2, v2, 0x1c00

    .line 138
    .line 139
    sget-object v6, La/uc9;->c:La/mw3;

    .line 140
    .line 141
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 142
    .line 143
    invoke-static {v6, v7, v0, v14}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    iget-wide v7, v0, La/fet;->T:J

    .line 148
    .line 149
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-static {v0, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 162
    .line 163
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, La/fet;->i0()V

    .line 167
    .line 168
    .line 169
    iget-boolean v9, v0, La/fet;->S:Z

    .line 170
    .line 171
    if-eqz v9, :cond_7

    .line 172
    .line 173
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 174
    .line 175
    invoke-virtual {v0, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_7
    invoke-virtual {v0}, La/fet;->r0()V

    .line 180
    .line 181
    .line 182
    :goto_5
    sget-object v9, La/gqw0;->x:La/shd;

    .line 183
    .line 184
    invoke-static {v0, v6, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    sget-object v6, La/gqw0;->w:La/shd;

    .line 188
    .line 189
    invoke-static {v0, v8, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    sget-object v7, La/gqw0;->y:La/shd;

    .line 197
    .line 198
    invoke-static {v0, v6, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 202
    .line 203
    .line 204
    sget-object v6, La/gqw0;->v:La/shd;

    .line 205
    .line 206
    invoke-static {v0, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    shr-int/lit8 v2, v2, 0x6

    .line 210
    .line 211
    and-int/lit8 v2, v2, 0x70

    .line 212
    .line 213
    or-int/lit8 v2, v2, 0x6

    .line 214
    .line 215
    sget-object v5, La/y5d;->a:La/y5d;

    .line 216
    .line 217
    invoke-static {v2, v3, v5, v0, v15}, La/vqd;->t(ILa/ugd;La/y5d;La/fet;Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_8
    invoke-virtual {v0}, La/fet;->X()V

    .line 222
    .line 223
    .line 224
    :goto_6
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    if-eqz v6, :cond_9

    .line 229
    .line 230
    new-instance v0, La/zuc;

    .line 231
    .line 232
    const/16 v5, 0x9

    .line 233
    .line 234
    move-object/from16 v2, p1

    .line 235
    .line 236
    invoke-direct/range {v0 .. v5}, La/zuc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 237
    .line 238
    .line 239
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 240
    .line 241
    :cond_9
    return-void
.end method

.method public static final b(La/mm40;La/oje;Lkotlin/jvm/functions/Function1;La/fet;II)V
    .locals 9

    .line 1
    const v0, -0x2548d191

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    or-int/lit8 v1, p4, 0x6

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, 0x2

    .line 23
    :goto_0
    or-int/2addr v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p5, 0x2

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    or-int/lit8 v1, v1, 0x30

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    const/16 v3, 0x20

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    const/16 v3, 0x10

    .line 41
    .line 42
    :goto_2
    or-int/2addr v1, v3

    .line 43
    :goto_3
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    const/16 v3, 0x100

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_4
    const/16 v3, 0x80

    .line 53
    .line 54
    :goto_4
    or-int/2addr v1, v3

    .line 55
    and-int/lit16 v3, v1, 0x93

    .line 56
    .line 57
    const/16 v4, 0x92

    .line 58
    .line 59
    if-eq v3, v4, :cond_5

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    const/4 v3, 0x0

    .line 64
    :goto_5
    and-int/lit8 v4, v1, 0x1

    .line 65
    .line 66
    invoke-virtual {p3, v4, v3}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_8

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    sget-object p0, La/jm40;->b:La/jm40;

    .line 75
    .line 76
    :cond_6
    if-eqz v2, :cond_7

    .line 77
    .line 78
    sget-object p1, La/rje;->a:La/oje;

    .line 79
    .line 80
    :cond_7
    new-instance v0, La/ab4;

    .line 81
    .line 82
    const/16 v2, 0x1b

    .line 83
    .line 84
    invoke-direct {v0, v2, p1, p2}, La/ab4;-><init>(BLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 85
    .line 86
    .line 87
    const v2, -0xeebf658

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v0, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    shr-int/lit8 v2, v1, 0x3

    .line 95
    .line 96
    and-int/lit8 v2, v2, 0xe

    .line 97
    .line 98
    or-int/lit16 v2, v2, 0x180

    .line 99
    .line 100
    shl-int/lit8 v1, v1, 0x3

    .line 101
    .line 102
    and-int/lit8 v1, v1, 0x70

    .line 103
    .line 104
    or-int/2addr v1, v2

    .line 105
    invoke-static {p1, p0, v0, p3, v1}, La/rje;->a(La/oje;La/mm40;La/ugd;La/fet;I)V

    .line 106
    .line 107
    .line 108
    :goto_6
    move-object v3, p0

    .line 109
    move-object v4, p1

    .line 110
    goto :goto_7

    .line 111
    :cond_8
    invoke-virtual {p3}, La/fet;->X()V

    .line 112
    .line 113
    .line 114
    goto :goto_6

    .line 115
    :goto_7
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-eqz p0, :cond_9

    .line 120
    .line 121
    new-instance v2, La/l51;

    .line 122
    .line 123
    const/4 v8, 0x3

    .line 124
    move-object v5, p2

    .line 125
    move v6, p4

    .line 126
    move v7, p5

    .line 127
    invoke-direct/range {v2 .. v8}, La/l51;-><init>(La/mm40;Ljava/lang/Object;Ljava/lang/Object;IIB)V

    .line 128
    .line 129
    .line 130
    iput-object v2, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 131
    .line 132
    :cond_9
    return-void
.end method

.method public static final c(Ljava/lang/String;ZLa/oje;La/mm40;La/xdr;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 35

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    move-object/from16 v7, p4

    .line 6
    .line 7
    move-object/from16 v8, p5

    .line 8
    .line 9
    move-object/from16 v9, p6

    .line 10
    .line 11
    move/from16 v10, p7

    .line 12
    .line 13
    const v0, -0x774762b3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, v10, 0x6

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x2

    .line 34
    :goto_0
    or-int/2addr v0, v10

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v10

    .line 37
    :goto_1
    and-int/lit8 v3, v10, 0x30

    .line 38
    .line 39
    const/16 v4, 0x20

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    invoke-virtual {v9, v1}, La/fet;->h(Z)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    move v3, v4

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v3, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v3

    .line 54
    :cond_3
    and-int/lit16 v3, v10, 0x180

    .line 55
    .line 56
    if-nez v3, :cond_5

    .line 57
    .line 58
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    const/16 v3, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v3, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v0, v3

    .line 70
    :cond_5
    and-int/lit16 v3, v10, 0xc00

    .line 71
    .line 72
    if-nez v3, :cond_7

    .line 73
    .line 74
    move-object/from16 v3, p3

    .line 75
    .line 76
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_6

    .line 81
    .line 82
    const/16 v5, 0x800

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    const/16 v5, 0x400

    .line 86
    .line 87
    :goto_4
    or-int/2addr v0, v5

    .line 88
    goto :goto_5

    .line 89
    :cond_7
    move-object/from16 v3, p3

    .line 90
    .line 91
    :goto_5
    and-int/lit16 v5, v10, 0x6000

    .line 92
    .line 93
    if-nez v5, :cond_9

    .line 94
    .line 95
    invoke-virtual {v9, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_8

    .line 100
    .line 101
    const/16 v5, 0x4000

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/16 v5, 0x2000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v0, v5

    .line 107
    :cond_9
    const/high16 v5, 0x30000

    .line 108
    .line 109
    and-int/2addr v5, v10

    .line 110
    const/high16 v12, 0x20000

    .line 111
    .line 112
    if-nez v5, :cond_b

    .line 113
    .line 114
    invoke-virtual {v9, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_a

    .line 119
    .line 120
    move v5, v12

    .line 121
    goto :goto_7

    .line 122
    :cond_a
    const/high16 v5, 0x10000

    .line 123
    .line 124
    :goto_7
    or-int/2addr v0, v5

    .line 125
    :cond_b
    move v13, v0

    .line 126
    const v0, 0x12493

    .line 127
    .line 128
    .line 129
    and-int/2addr v0, v13

    .line 130
    const v5, 0x12492

    .line 131
    .line 132
    .line 133
    const/4 v15, 0x1

    .line 134
    if-eq v0, v5, :cond_c

    .line 135
    .line 136
    move v0, v15

    .line 137
    goto :goto_8

    .line 138
    :cond_c
    const/4 v0, 0x0

    .line 139
    :goto_8
    and-int/lit8 v5, v13, 0x1

    .line 140
    .line 141
    invoke-virtual {v9, v5, v0}, La/fet;->U(IZ)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_16

    .line 146
    .line 147
    sget-object v0, La/qje;->a:La/yx7;

    .line 148
    .line 149
    sget v5, La/qje;->c:F

    .line 150
    .line 151
    new-instance v14, La/qw3;

    .line 152
    .line 153
    new-instance v11, La/jf4;

    .line 154
    .line 155
    const/16 v3, 0xe

    .line 156
    .line 157
    invoke-direct {v11, v3}, La/jf4;-><init>(B)V

    .line 158
    .line 159
    .line 160
    invoke-direct {v14, v5, v15, v11}, La/qw3;-><init>(FZLa/rw3;)V

    .line 161
    .line 162
    .line 163
    and-int/lit8 v11, v13, 0x70

    .line 164
    .line 165
    if-ne v11, v4, :cond_d

    .line 166
    .line 167
    move v4, v15

    .line 168
    goto :goto_9

    .line 169
    :cond_d
    const/4 v4, 0x0

    .line 170
    :goto_9
    const/high16 v11, 0x70000

    .line 171
    .line 172
    and-int/2addr v11, v13

    .line 173
    if-ne v11, v12, :cond_e

    .line 174
    .line 175
    move v11, v15

    .line 176
    goto :goto_a

    .line 177
    :cond_e
    const/4 v11, 0x0

    .line 178
    :goto_a
    or-int/2addr v4, v11

    .line 179
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    if-nez v4, :cond_f

    .line 184
    .line 185
    sget-object v4, La/ukd;->a:La/cl5;

    .line 186
    .line 187
    if-ne v11, v4, :cond_10

    .line 188
    .line 189
    :cond_f
    new-instance v11, La/jw7;

    .line 190
    .line 191
    const/4 v4, 0x7

    .line 192
    invoke-direct {v11, v1, v8, v4}, La/jw7;-><init>(ZLkotlin/jvm/functions/Function0;B)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_10
    move-object v4, v11

    .line 199
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 200
    .line 201
    move v11, v5

    .line 202
    const/16 v5, 0xc

    .line 203
    .line 204
    move v12, v3

    .line 205
    const/4 v3, 0x0

    .line 206
    move/from16 v18, v12

    .line 207
    .line 208
    move v12, v11

    .line 209
    move-object v11, v0

    .line 210
    move-object/from16 v0, p3

    .line 211
    .line 212
    invoke-static/range {v0 .. v5}, La/y860;->Y(La/mm40;ZLjava/lang/String;La/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    const/high16 v0, 0x3f800000    # 1.0f

    .line 217
    .line 218
    invoke-static {v3, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    const/high16 v2, 0x42e00000    # 112.0f

    .line 223
    .line 224
    const/high16 v3, 0x438c0000    # 280.0f

    .line 225
    .line 226
    const/high16 v4, 0x42400000    # 48.0f

    .line 227
    .line 228
    invoke-static {v1, v2, v4, v3, v4}, La/o7k0;->q(La/mm40;FFFF)La/mm40;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    const/4 v2, 0x0

    .line 233
    const/4 v3, 0x2

    .line 234
    invoke-static {v1, v12, v2, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    const/16 v2, 0x36

    .line 239
    .line 240
    invoke-static {v14, v11, v9, v2}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    iget-wide v3, v9, La/fet;->T:J

    .line 245
    .line 246
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-static {v9, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 259
    .line 260
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v9}, La/fet;->i0()V

    .line 264
    .line 265
    .line 266
    iget-boolean v5, v9, La/fet;->S:Z

    .line 267
    .line 268
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 269
    .line 270
    if-eqz v5, :cond_11

    .line 271
    .line 272
    invoke-virtual {v9, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 273
    .line 274
    .line 275
    goto :goto_b

    .line 276
    :cond_11
    invoke-virtual {v9}, La/fet;->r0()V

    .line 277
    .line 278
    .line 279
    :goto_b
    sget-object v5, La/gqw0;->x:La/shd;

    .line 280
    .line 281
    invoke-static {v9, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    sget-object v2, La/gqw0;->w:La/shd;

    .line 285
    .line 286
    invoke-static {v9, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    sget-object v4, La/gqw0;->y:La/shd;

    .line 294
    .line 295
    invoke-static {v9, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 296
    .line 297
    .line 298
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 299
    .line 300
    .line 301
    sget-object v3, La/gqw0;->v:La/shd;

    .line 302
    .line 303
    invoke-static {v9, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 304
    .line 305
    .line 306
    if-nez v7, :cond_12

    .line 307
    .line 308
    const v1, -0x5f3ebcd6

    .line 309
    .line 310
    .line 311
    invoke-virtual {v9, v1}, La/fet;->e0(I)V

    .line 312
    .line 313
    .line 314
    const/4 v1, 0x0

    .line 315
    invoke-virtual {v9, v1}, La/fet;->r(Z)V

    .line 316
    .line 317
    .line 318
    goto :goto_e

    .line 319
    :cond_12
    const v1, -0x5f3ebcd5

    .line 320
    .line 321
    .line 322
    invoke-virtual {v9, v1}, La/fet;->e0(I)V

    .line 323
    .line 324
    .line 325
    sget v20, La/qje;->e:F

    .line 326
    .line 327
    const/16 v21, 0x0

    .line 328
    .line 329
    const/16 v24, 0x2

    .line 330
    .line 331
    sget-object v19, La/jm40;->b:La/jm40;

    .line 332
    .line 333
    move/from16 v22, v20

    .line 334
    .line 335
    move/from16 v23, v20

    .line 336
    .line 337
    invoke-static/range {v19 .. v24}, La/o7k0;->k(La/mm40;FFFFI)La/mm40;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    sget-object v12, La/gqw0;->a:La/zx7;

    .line 342
    .line 343
    const/4 v14, 0x0

    .line 344
    invoke-static {v12, v14}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 345
    .line 346
    .line 347
    move-result-object v12

    .line 348
    move-object/from16 v17, v1

    .line 349
    .line 350
    iget-wide v0, v9, La/fet;->T:J

    .line 351
    .line 352
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    move-object/from16 v14, v17

    .line 361
    .line 362
    invoke-static {v9, v14}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 363
    .line 364
    .line 365
    move-result-object v14

    .line 366
    invoke-virtual {v9}, La/fet;->i0()V

    .line 367
    .line 368
    .line 369
    iget-boolean v15, v9, La/fet;->S:Z

    .line 370
    .line 371
    if-eqz v15, :cond_13

    .line 372
    .line 373
    invoke-virtual {v9, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 374
    .line 375
    .line 376
    goto :goto_c

    .line 377
    :cond_13
    invoke-virtual {v9}, La/fet;->r0()V

    .line 378
    .line 379
    .line 380
    :goto_c
    invoke-static {v9, v12, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 381
    .line 382
    .line 383
    invoke-static {v9, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v0, v9, v4, v9}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v9, v14, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 390
    .line 391
    .line 392
    if-eqz p1, :cond_14

    .line 393
    .line 394
    iget-wide v0, v6, La/oje;->c:J

    .line 395
    .line 396
    goto :goto_d

    .line 397
    :cond_14
    iget-wide v0, v6, La/oje;->e:J

    .line 398
    .line 399
    :goto_d
    new-instance v2, La/y3d;

    .line 400
    .line 401
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 402
    .line 403
    .line 404
    const/4 v14, 0x0

    .line 405
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-interface {v7, v2, v9, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    const/4 v0, 0x1

    .line 413
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v9, v14}, La/fet;->r(Z)V

    .line 417
    .line 418
    .line 419
    :goto_e
    if-eqz p1, :cond_15

    .line 420
    .line 421
    iget-wide v0, v6, La/oje;->b:J

    .line 422
    .line 423
    :goto_f
    move-wide/from16 v21, v0

    .line 424
    .line 425
    goto :goto_10

    .line 426
    :cond_15
    iget-wide v0, v6, La/oje;->d:J

    .line 427
    .line 428
    goto :goto_f

    .line 429
    :goto_10
    sget-byte v30, La/qje;->b:B

    .line 430
    .line 431
    sget-wide v23, La/qje;->h:J

    .line 432
    .line 433
    sget-object v25, La/qje;->i:La/psq;

    .line 434
    .line 435
    sget-wide v32, La/qje;->j:J

    .line 436
    .line 437
    sget-wide v27, La/qje;->k:J

    .line 438
    .line 439
    new-instance v11, La/y9q0;

    .line 440
    .line 441
    const/16 v31, 0x0

    .line 442
    .line 443
    const v34, 0xfd7f78

    .line 444
    .line 445
    .line 446
    const/16 v26, 0x0

    .line 447
    .line 448
    const/16 v29, 0x0

    .line 449
    .line 450
    move-object/from16 v20, v11

    .line 451
    .line 452
    invoke-direct/range {v20 .. v34}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 453
    .line 454
    .line 455
    new-instance v10, La/x7z;

    .line 456
    .line 457
    const/4 v0, 0x1

    .line 458
    const/high16 v14, 0x3f800000    # 1.0f

    .line 459
    .line 460
    invoke-direct {v10, v14, v0}, La/x7z;-><init>(FZ)V

    .line 461
    .line 462
    .line 463
    const/high16 v1, 0x180000

    .line 464
    .line 465
    and-int/lit8 v2, v13, 0xe

    .line 466
    .line 467
    or-int v20, v2, v1

    .line 468
    .line 469
    const/16 v21, 0x3b8

    .line 470
    .line 471
    const/4 v12, 0x0

    .line 472
    const/4 v13, 0x0

    .line 473
    const/4 v14, 0x0

    .line 474
    const/4 v15, 0x1

    .line 475
    const/16 v16, 0x0

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    const/16 v18, 0x0

    .line 480
    .line 481
    move-object/from16 v19, v9

    .line 482
    .line 483
    move-object/from16 v9, p0

    .line 484
    .line 485
    invoke-static/range {v9 .. v21}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 486
    .line 487
    .line 488
    move-object/from16 v9, v19

    .line 489
    .line 490
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 491
    .line 492
    .line 493
    goto :goto_11

    .line 494
    :cond_16
    invoke-virtual {v9}, La/fet;->X()V

    .line 495
    .line 496
    .line 497
    :goto_11
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    if-eqz v9, :cond_17

    .line 502
    .line 503
    new-instance v0, La/ig2;

    .line 504
    .line 505
    move-object/from16 v1, p0

    .line 506
    .line 507
    move/from16 v2, p1

    .line 508
    .line 509
    move-object/from16 v4, p3

    .line 510
    .line 511
    move-object v3, v6

    .line 512
    move-object v5, v7

    .line 513
    move-object v6, v8

    .line 514
    move/from16 v7, p7

    .line 515
    .line 516
    invoke-direct/range {v0 .. v7}, La/ig2;-><init>(Ljava/lang/String;ZLa/oje;La/mm40;La/xdr;Lkotlin/jvm/functions/Function0;I)V

    .line 517
    .line 518
    .line 519
    iput-object v0, v9, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 520
    .line 521
    :cond_17
    return-void
.end method
