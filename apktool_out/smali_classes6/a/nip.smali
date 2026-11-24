.class public abstract La/nip;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/dfp;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/dfp;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/nip;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(FJLa/e2d;La/ugd;La/fet;I)V
    .locals 19

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move-object/from16 v0, p5

    .line 8
    .line 9
    move/from16 v2, p6

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const v3, 0x6d2a7427

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v3}, La/fet;->g0(I)La/fet;

    .line 18
    .line 19
    .line 20
    and-int/lit8 v3, v2, 0x6

    .line 21
    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/fet;->d(F)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v3, 0x2

    .line 33
    :goto_0
    or-int/2addr v3, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v3, v2

    .line 36
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 37
    .line 38
    move-wide/from16 v8, p1

    .line 39
    .line 40
    if-nez v6, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0, v8, v9}, La/fet;->f(J)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    const/16 v6, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v6, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v3, v6

    .line 54
    :cond_3
    and-int/lit16 v6, v2, 0x180

    .line 55
    .line 56
    const/16 v7, 0x100

    .line 57
    .line 58
    if-nez v6, :cond_5

    .line 59
    .line 60
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    move v6, v7

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v6, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v3, v6

    .line 71
    :cond_5
    and-int/lit16 v6, v2, 0xc00

    .line 72
    .line 73
    if-nez v6, :cond_7

    .line 74
    .line 75
    invoke-virtual {v0, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_6

    .line 80
    .line 81
    const/16 v6, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v6, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v3, v6

    .line 87
    :cond_7
    and-int/lit16 v6, v3, 0x493

    .line 88
    .line 89
    const/16 v10, 0x492

    .line 90
    .line 91
    const/4 v11, 0x0

    .line 92
    const/4 v12, 0x1

    .line 93
    if-eq v6, v10, :cond_8

    .line 94
    .line 95
    move v6, v12

    .line 96
    goto :goto_5

    .line 97
    :cond_8
    move v6, v11

    .line 98
    :goto_5
    and-int/lit8 v10, v3, 0x1

    .line 99
    .line 100
    invoke-virtual {v0, v10, v6}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_d

    .line 105
    .line 106
    sget-object v6, La/bmd;->h:La/zfn;

    .line 107
    .line 108
    invoke-virtual {v0, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, La/w6k;

    .line 113
    .line 114
    invoke-interface {v6, v1}, La/w6k;->w0(F)F

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    const/4 v10, 0x0

    .line 119
    cmpg-float v13, v6, v10

    .line 120
    .line 121
    if-gez v13, :cond_9

    .line 122
    .line 123
    move v6, v10

    .line 124
    :cond_9
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    and-int/lit16 v13, v3, 0x380

    .line 129
    .line 130
    if-ne v13, v7, :cond_a

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_a
    move v12, v11

    .line 134
    :goto_6
    invoke-virtual {v0, v6}, La/fet;->d(F)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    or-int/2addr v7, v12

    .line 139
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    if-nez v7, :cond_b

    .line 144
    .line 145
    sget-object v7, La/ukd;->a:La/cl5;

    .line 146
    .line 147
    if-ne v12, v7, :cond_c

    .line 148
    .line 149
    :cond_b
    new-instance v12, La/lip;

    .line 150
    .line 151
    const/4 v7, 0x0

    .line 152
    invoke-direct {v12, v4, v6, v7, v11}, La/lip;-><init>(La/e2d;FLa/yje;B)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_c
    check-cast v12, Lkotlin/jvm/functions/Function2;

    .line 159
    .line 160
    invoke-static {v0, v10, v12}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    new-instance v6, La/zv;

    .line 164
    .line 165
    const/4 v7, 0x7

    .line 166
    invoke-direct {v6, v1, v4, v5, v7}, La/zv;-><init>(FLjava/lang/Object;La/ugd;B)V

    .line 167
    .line 168
    .line 169
    const v7, -0xe88ee94

    .line 170
    .line 171
    .line 172
    invoke-static {v7, v6, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    shl-int/lit8 v3, v3, 0x3

    .line 177
    .line 178
    and-int/lit16 v3, v3, 0x380

    .line 179
    .line 180
    const/high16 v6, 0xc00000

    .line 181
    .line 182
    or-int v17, v3, v6

    .line 183
    .line 184
    const/16 v18, 0x7b

    .line 185
    .line 186
    const/4 v6, 0x0

    .line 187
    const/4 v7, 0x0

    .line 188
    const-wide/16 v10, 0x0

    .line 189
    .line 190
    const/4 v12, 0x0

    .line 191
    const/4 v13, 0x0

    .line 192
    const/4 v14, 0x0

    .line 193
    move-object/from16 v16, v0

    .line 194
    .line 195
    invoke-static/range {v6 .. v18}, La/gmn0;->a(La/mm40;La/yjj0;JJFFLa/dn8;La/ugd;La/fet;II)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_d
    invoke-virtual/range {p5 .. p5}, La/fet;->X()V

    .line 200
    .line 201
    .line 202
    :goto_7
    invoke-virtual/range {p5 .. p5}, La/fet;->u()La/yfe0;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    if-eqz v8, :cond_e

    .line 207
    .line 208
    new-instance v0, La/czl;

    .line 209
    .line 210
    const/4 v7, 0x1

    .line 211
    move v6, v2

    .line 212
    move-wide/from16 v2, p1

    .line 213
    .line 214
    invoke-direct/range {v0 .. v7}, La/czl;-><init>(FJLjava/lang/Object;La/ugd;IB)V

    .line 215
    .line 216
    .line 217
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 218
    .line 219
    :cond_e
    return-void
.end method

.method public static final b(La/mm40;La/kip;La/ugd;La/fet;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    const v4, -0x2bbac608

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v4}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v4, 0x2

    .line 24
    :goto_0
    or-int v4, p4, v4

    .line 25
    .line 26
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/16 v6, 0x20

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    move v5, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v5, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v4, v5

    .line 39
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    const/16 v5, 0x100

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v5, 0x80

    .line 49
    .line 50
    :goto_2
    or-int/2addr v4, v5

    .line 51
    and-int/lit16 v5, v4, 0x93

    .line 52
    .line 53
    const/16 v7, 0x92

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x1

    .line 57
    if-eq v5, v7, :cond_3

    .line 58
    .line 59
    move v5, v9

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    move v5, v8

    .line 62
    :goto_3
    and-int/lit8 v7, v4, 0x1

    .line 63
    .line 64
    invoke-virtual {v0, v7, v5}, La/fet;->U(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_9

    .line 69
    .line 70
    and-int/lit8 v5, v4, 0x70

    .line 71
    .line 72
    if-eq v5, v6, :cond_4

    .line 73
    .line 74
    move v5, v8

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    move v5, v9

    .line 77
    :goto_4
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const/4 v7, 0x3

    .line 82
    if-nez v5, :cond_5

    .line 83
    .line 84
    sget-object v5, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-ne v6, v5, :cond_6

    .line 87
    .line 88
    :cond_5
    new-instance v6, La/qf6;

    .line 89
    .line 90
    invoke-direct {v6, v2, v7}, La/qf6;-><init>(Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    check-cast v6, La/tj30;

    .line 97
    .line 98
    iget-wide v10, v0, La/fet;->T:J

    .line 99
    .line 100
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-static {v0, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 113
    .line 114
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, La/fet;->i0()V

    .line 118
    .line 119
    .line 120
    iget-boolean v12, v0, La/fet;->S:Z

    .line 121
    .line 122
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 123
    .line 124
    if-eqz v12, :cond_7

    .line 125
    .line 126
    invoke-virtual {v0, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_7
    invoke-virtual {v0}, La/fet;->r0()V

    .line 131
    .line 132
    .line 133
    :goto_5
    sget-object v12, La/gqw0;->x:La/shd;

    .line 134
    .line 135
    invoke-static {v0, v6, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    sget-object v6, La/gqw0;->w:La/shd;

    .line 139
    .line 140
    invoke-static {v0, v10, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    sget-object v10, La/gqw0;->y:La/shd;

    .line 148
    .line 149
    invoke-static {v0, v5, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 153
    .line 154
    .line 155
    sget-object v5, La/gqw0;->v:La/shd;

    .line 156
    .line 157
    invoke-static {v0, v11, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    sget-object v11, La/jm40;->b:La/jm40;

    .line 161
    .line 162
    const-string v14, "content"

    .line 163
    .line 164
    invoke-static {v11, v14}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    sget-object v14, La/gqw0;->a:La/zx7;

    .line 169
    .line 170
    invoke-static {v14, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    move/from16 v16, v7

    .line 175
    .line 176
    iget-wide v7, v0, La/fet;->T:J

    .line 177
    .line 178
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-static {v0, v11}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    invoke-virtual {v0}, La/fet;->i0()V

    .line 191
    .line 192
    .line 193
    iget-boolean v15, v0, La/fet;->S:Z

    .line 194
    .line 195
    if-eqz v15, :cond_8

    .line 196
    .line 197
    invoke-virtual {v0, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_8
    invoke-virtual {v0}, La/fet;->r0()V

    .line 202
    .line 203
    .line 204
    :goto_6
    invoke-static {v0, v14, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v0, v8, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v7, v0, v10, v0}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v0, v11, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 214
    .line 215
    .line 216
    const/4 v15, 0x0

    .line 217
    new-array v5, v15, [La/l5d0;

    .line 218
    .line 219
    shr-int/lit8 v4, v4, 0x3

    .line 220
    .line 221
    and-int/lit8 v4, v4, 0x70

    .line 222
    .line 223
    invoke-static {v5, v3, v0, v4}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_9
    invoke-virtual {v0}, La/fet;->X()V

    .line 234
    .line 235
    .line 236
    :goto_7
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    if-eqz v6, :cond_a

    .line 241
    .line 242
    new-instance v0, La/ann;

    .line 243
    .line 244
    const/16 v5, 0x14

    .line 245
    .line 246
    move/from16 v4, p4

    .line 247
    .line 248
    invoke-direct/range {v0 .. v5}, La/ann;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 249
    .line 250
    .line 251
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 252
    .line 253
    :cond_a
    return-void
.end method

.method public static final c(La/mm40;La/e2d;La/fet;I)La/mm40;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, La/wzk0;->a(La/fet;)La/sjj;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const/high16 v2, 0x44c80000    # 1600.0f

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x4

    .line 17
    invoke-static {v1, v2, v3, v4}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p1, La/e2d;->h:La/zbk;

    .line 22
    .line 23
    invoke-virtual {v2}, La/zbk;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 28
    .line 29
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    sget-object v6, La/ma80;->a:La/ma80;

    .line 40
    .line 41
    and-int/lit8 v2, p3, 0x70

    .line 42
    .line 43
    xor-int/lit8 v2, v2, 0x30

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    const/16 v5, 0x20

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    if-le v2, v5, :cond_0

    .line 50
    .line 51
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-nez v9, :cond_1

    .line 56
    .line 57
    :cond_0
    and-int/lit8 v9, p3, 0x30

    .line 58
    .line 59
    if-ne v9, v5, :cond_2

    .line 60
    .line 61
    :cond_1
    move v9, v4

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v9, v8

    .line 64
    :goto_0
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    sget-object v11, La/ukd;->a:La/cl5;

    .line 69
    .line 70
    if-nez v9, :cond_3

    .line 71
    .line 72
    if-ne v10, v11, :cond_4

    .line 73
    .line 74
    :cond_3
    new-instance v10, La/o6n;

    .line 75
    .line 76
    const/4 v9, 0x3

    .line 77
    invoke-direct {v10, p1, v9}, La/o6n;-><init>(La/e2d;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 84
    .line 85
    invoke-static {v10, p2}, La/uel;->b(Lkotlin/jvm/functions/Function1;La/fet;)La/wel;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    if-le v2, v5, :cond_5

    .line 90
    .line 91
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_6

    .line 96
    .line 97
    :cond_5
    and-int/lit8 v2, p3, 0x30

    .line 98
    .line 99
    if-ne v2, v5, :cond_7

    .line 100
    .line 101
    :cond_6
    move v2, v4

    .line 102
    goto :goto_1

    .line 103
    :cond_7
    move v2, v8

    .line 104
    :goto_1
    and-int/lit16 v5, p3, 0x380

    .line 105
    .line 106
    xor-int/lit16 v5, v5, 0x180

    .line 107
    .line 108
    const/16 v10, 0x100

    .line 109
    .line 110
    if-le v5, v10, :cond_8

    .line 111
    .line 112
    invoke-virtual {p2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_9

    .line 117
    .line 118
    :cond_8
    and-int/lit16 v5, p3, 0x180

    .line 119
    .line 120
    if-ne v5, v10, :cond_a

    .line 121
    .line 122
    :cond_9
    move v5, v4

    .line 123
    goto :goto_2

    .line 124
    :cond_a
    move v5, v8

    .line 125
    :goto_2
    or-int/2addr v2, v5

    .line 126
    and-int/lit16 v5, p3, 0x1c00

    .line 127
    .line 128
    xor-int/lit16 v5, v5, 0xc00

    .line 129
    .line 130
    const/16 v10, 0x800

    .line 131
    .line 132
    if-le v5, v10, :cond_b

    .line 133
    .line 134
    invoke-virtual {p2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-nez v5, :cond_d

    .line 139
    .line 140
    :cond_b
    and-int/lit16 p3, p3, 0xc00

    .line 141
    .line 142
    if-ne p3, v10, :cond_c

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_c
    move v4, v8

    .line 146
    :cond_d
    :goto_3
    or-int p3, v2, v4

    .line 147
    .line 148
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-nez p3, :cond_e

    .line 153
    .line 154
    if-ne v2, v11, :cond_f

    .line 155
    .line 156
    :cond_e
    new-instance v2, La/gv2;

    .line 157
    .line 158
    invoke-direct {v2, p1, v0, v1, v3}, La/gv2;-><init>(La/e2d;La/sjj;La/nul0;La/yje;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_f
    move-object v10, v2

    .line 165
    check-cast v10, La/xdr;

    .line 166
    .line 167
    const/16 v11, 0xb8

    .line 168
    .line 169
    const/4 v8, 0x0

    .line 170
    move-object v5, v9

    .line 171
    const/4 v9, 0x0

    .line 172
    move-object v4, p0

    .line 173
    invoke-static/range {v4 .. v11}, La/uel;->a(La/mm40;La/wel;La/ma80;ZZLa/xdr;La/xdr;I)La/mm40;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0
.end method

.method public static final d(La/oyq0;La/sjj;La/fet;I)La/e2d;
    .locals 3

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x6

    .line 6
    invoke-static {p0, p0, p2}, La/ob3;->d(IILa/fet;)La/oyq0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    invoke-static {p2}, La/wzk0;->a(La/fet;)La/sjj;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_1
    const/high16 p3, 0x3f800000    # 1.0f

    .line 19
    .line 20
    const/high16 v0, 0x44c80000    # 1600.0f

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x4

    .line 24
    invoke-static {p3, v0, v1, v2}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    or-int/2addr v0, v1

    .line 37
    invoke-virtual {p2, p3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    or-int/2addr v0, v1

    .line 42
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    sget-object v0, La/ukd;->a:La/cl5;

    .line 49
    .line 50
    if-ne v1, v0, :cond_3

    .line 51
    .line 52
    :cond_2
    new-instance v1, La/e2d;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1, p3}, La/e2d;-><init>(La/oyq0;La/sjj;La/nul0;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    check-cast v1, La/e2d;

    .line 61
    .line 62
    return-object v1
.end method

.method public static final e(La/oyq0;FLa/sjj;La/nul0;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, La/mip;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/mip;

    .line 7
    .line 8
    iget v1, v0, La/mip;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/mip;->n:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/mip;

    .line 22
    .line 23
    invoke-direct {v0, p4}, La/zje;-><init>(La/yje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v6, La/mip;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/mip;->n:I

    .line 32
    .line 33
    const/4 v2, 0x3

    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v4, :cond_2

    .line 41
    .line 42
    if-ne v1, v3, :cond_1

    .line 43
    .line 44
    iget-object p0, v6, La/mip;->k:La/jie0;

    .line 45
    .line 46
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_2
    iget p1, v6, La/mip;->l:F

    .line 58
    .line 59
    iget-object p0, v6, La/mip;->k:La/jie0;

    .line 60
    .line 61
    iget-object p3, v6, La/mip;->j:La/nul0;

    .line 62
    .line 63
    iget-object p2, v6, La/mip;->i:La/oyq0;

    .line 64
    .line 65
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object p4, p0

    .line 69
    move-object p0, p2

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 75
    .line 76
    .line 77
    move-result p4

    .line 78
    const v1, 0x3c23d70a    # 0.01f

    .line 79
    .line 80
    .line 81
    cmpg-float p4, p4, v1

    .line 82
    .line 83
    if-ltz p4, :cond_9

    .line 84
    .line 85
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    const/high16 v1, 0x3f800000    # 1.0f

    .line 90
    .line 91
    cmpg-float p4, p4, v1

    .line 92
    .line 93
    if-nez p4, :cond_4

    .line 94
    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_4
    new-instance p4, La/jie0;

    .line 98
    .line 99
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iput p1, p4, La/jie0;->a:F

    .line 103
    .line 104
    if-eqz p2, :cond_5

    .line 105
    .line 106
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    cmpl-float v1, v7, v1

    .line 111
    .line 112
    if-lez v1, :cond_5

    .line 113
    .line 114
    new-instance v1, La/jie0;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    const/16 v7, 0x1c

    .line 120
    .line 121
    invoke-static {v8, p1, v7}, La/x4d0;->d(FFI)La/l73;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    new-instance v9, La/ib3;

    .line 126
    .line 127
    invoke-direct {v9, v1, p0, p4, v2}, La/ib3;-><init>(La/jie0;La/oyq0;La/jie0;B)V

    .line 128
    .line 129
    .line 130
    iput-object p0, v6, La/mip;->i:La/oyq0;

    .line 131
    .line 132
    iput-object p3, v6, La/mip;->j:La/nul0;

    .line 133
    .line 134
    iput-object p4, v6, La/mip;->k:La/jie0;

    .line 135
    .line 136
    iput p1, v6, La/mip;->l:F

    .line 137
    .line 138
    iput v4, v6, La/mip;->n:I

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    invoke-static {v7, p2, v1, v9, v6}, La/hhm0;->o(La/l73;La/sjj;ZLkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    if-ne p2, v0, :cond_5

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_5
    :goto_2
    if-eqz p3, :cond_8

    .line 149
    .line 150
    iget-object p2, p0, La/oyq0;->c:La/agk0;

    .line 151
    .line 152
    invoke-virtual {p2}, La/agk0;->l()F

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    cmpg-float v1, v1, v8

    .line 157
    .line 158
    if-gez v1, :cond_8

    .line 159
    .line 160
    invoke-virtual {p2}, La/agk0;->l()F

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    iget v4, p0, La/oyq0;->a:F

    .line 165
    .line 166
    cmpl-float v1, v1, v4

    .line 167
    .line 168
    if-lez v1, :cond_8

    .line 169
    .line 170
    invoke-virtual {p2}, La/agk0;->l()F

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    const/16 v1, 0x1e

    .line 175
    .line 176
    invoke-static {p2, v8, v1}, La/x4d0;->d(FFI)La/l73;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    const/high16 v4, 0x3f000000    # 0.5f

    .line 185
    .line 186
    cmpg-float p2, p2, v4

    .line 187
    .line 188
    if-gez p2, :cond_6

    .line 189
    .line 190
    move p2, v8

    .line 191
    :goto_3
    move v4, v2

    .line 192
    goto :goto_4

    .line 193
    :cond_6
    iget p2, p0, La/oyq0;->a:F

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :goto_4
    new-instance v2, Ljava/lang/Float;

    .line 197
    .line 198
    invoke-direct {v2, p2}, Ljava/lang/Float;-><init>(F)V

    .line 199
    .line 200
    .line 201
    move-object p2, v5

    .line 202
    new-instance v5, La/jb3;

    .line 203
    .line 204
    invoke-direct {v5, p0, v4}, La/jb3;-><init>(La/oyq0;B)V

    .line 205
    .line 206
    .line 207
    iput-object p2, v6, La/mip;->i:La/oyq0;

    .line 208
    .line 209
    iput-object p2, v6, La/mip;->j:La/nul0;

    .line 210
    .line 211
    iput-object p4, v6, La/mip;->k:La/jie0;

    .line 212
    .line 213
    iput p1, v6, La/mip;->l:F

    .line 214
    .line 215
    iput v3, v6, La/mip;->n:I

    .line 216
    .line 217
    const/4 v4, 0x0

    .line 218
    const/4 v7, 0x4

    .line 219
    move-object v3, p3

    .line 220
    invoke-static/range {v1 .. v7}, La/hhm0;->q(La/l73;Ljava/lang/Float;La/j73;ZLkotlin/jvm/functions/Function1;La/zje;I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    if-ne p0, v0, :cond_7

    .line 225
    .line 226
    :goto_5
    return-object v0

    .line 227
    :cond_7
    move-object p0, p4

    .line 228
    :goto_6
    move-object p4, p0

    .line 229
    :cond_8
    iget p0, p4, La/jie0;->a:F

    .line 230
    .line 231
    invoke-static {v8, p0}, La/wpm0;->g(FF)J

    .line 232
    .line 233
    .line 234
    move-result-wide p0

    .line 235
    new-instance p2, La/g6u0;

    .line 236
    .line 237
    invoke-direct {p2, p0, p1}, La/g6u0;-><init>(J)V

    .line 238
    .line 239
    .line 240
    return-object p2

    .line 241
    :cond_9
    :goto_7
    new-instance p0, La/g6u0;

    .line 242
    .line 243
    const-wide/16 p1, 0x0

    .line 244
    .line 245
    invoke-direct {p0, p1, p2}, La/g6u0;-><init>(J)V

    .line 246
    .line 247
    .line 248
    return-object p0
.end method
