.class public abstract La/fka;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/mn9;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/mn9;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/fka;->a:La/zfn;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(ILa/fet;La/mm40;)V
    .locals 16

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    const v2, 0x7acd1f02

    .line 8
    .line 9
    .line 10
    invoke-virtual {v6, v2}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v2, v0, 0x3

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    move v2, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v8

    .line 23
    :goto_0
    and-int/lit8 v5, v0, 0x1

    .line 24
    .line 25
    invoke-virtual {v6, v5, v2}, La/fet;->U(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_c

    .line 30
    .line 31
    sget-object v2, La/fka;->a:La/zfn;

    .line 32
    .line 33
    invoke-virtual {v6, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, La/l7m0;

    .line 38
    .line 39
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    sget-object v10, La/ukd;->a:La/cl5;

    .line 52
    .line 53
    if-nez v7, :cond_1

    .line 54
    .line 55
    if-ne v9, v10, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance v9, La/kk7;

    .line 58
    .line 59
    const/16 v7, 0x1c

    .line 60
    .line 61
    invoke-direct {v9, v2, v7}, La/kk7;-><init>(La/l7m0;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 68
    .line 69
    invoke-static {v5, v9, v6}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    if-nez v9, :cond_3

    .line 86
    .line 87
    if-ne v11, v10, :cond_4

    .line 88
    .line 89
    :cond_3
    new-instance v11, La/kk7;

    .line 90
    .line 91
    const/16 v9, 0x1d

    .line 92
    .line 93
    invoke-direct {v11, v2, v9}, La/kk7;-><init>(La/l7m0;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 100
    .line 101
    invoke-static {v7, v11, v6}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    if-nez v11, :cond_5

    .line 118
    .line 119
    if-ne v12, v10, :cond_6

    .line 120
    .line 121
    :cond_5
    new-instance v12, La/eka;

    .line 122
    .line 123
    invoke-direct {v12, v2, v8}, La/eka;-><init>(La/l7m0;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 130
    .line 131
    invoke-static {v9, v12, v6}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v13

    .line 147
    if-nez v12, :cond_7

    .line 148
    .line 149
    if-ne v13, v10, :cond_8

    .line 150
    .line 151
    :cond_7
    new-instance v13, La/eka;

    .line 152
    .line 153
    invoke-direct {v13, v2, v4}, La/eka;-><init>(La/l7m0;B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_8
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 160
    .line 161
    invoke-static {v11, v13, v6}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    if-nez v13, :cond_9

    .line 178
    .line 179
    if-ne v14, v10, :cond_a

    .line 180
    .line 181
    :cond_9
    new-instance v14, La/eka;

    .line 182
    .line 183
    invoke-direct {v14, v2, v3}, La/eka;-><init>(La/l7m0;B)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_a
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 190
    .line 191
    invoke-static {v12, v14, v6}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    check-cast v3, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_b

    .line 206
    .line 207
    invoke-virtual {v6}, La/fet;->u()La/yfe0;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-eqz v2, :cond_d

    .line 212
    .line 213
    new-instance v3, La/dka;

    .line 214
    .line 215
    invoke-direct {v3, v1, v0, v4}, La/dka;-><init>(La/mm40;IB)V

    .line 216
    .line 217
    .line 218
    :goto_1
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 219
    .line 220
    return-void

    .line 221
    :cond_b
    new-instance v3, La/v7i0;

    .line 222
    .line 223
    const/16 v4, 0x12

    .line 224
    .line 225
    invoke-direct {v3, v7, v4}, La/v7i0;-><init>(La/l7m0;B)V

    .line 226
    .line 227
    .line 228
    const v4, -0x1b7702dc

    .line 229
    .line 230
    .line 231
    invoke-static {v4, v3, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    new-instance v4, La/v7i0;

    .line 236
    .line 237
    const/16 v5, 0x13

    .line 238
    .line 239
    invoke-direct {v4, v9, v5}, La/v7i0;-><init>(La/l7m0;B)V

    .line 240
    .line 241
    .line 242
    const v5, -0x7d280c55

    .line 243
    .line 244
    .line 245
    invoke-static {v5, v4, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    new-instance v5, La/v7i0;

    .line 250
    .line 251
    const/16 v7, 0x10

    .line 252
    .line 253
    invoke-direct {v5, v11, v7}, La/v7i0;-><init>(La/l7m0;B)V

    .line 254
    .line 255
    .line 256
    const v7, -0x3e9450b6

    .line 257
    .line 258
    .line 259
    invoke-static {v7, v5, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    new-instance v7, La/v7i0;

    .line 264
    .line 265
    const/16 v9, 0x11

    .line 266
    .line 267
    invoke-direct {v7, v2, v9}, La/v7i0;-><init>(La/l7m0;B)V

    .line 268
    .line 269
    .line 270
    const v2, -0x9517

    .line 271
    .line 272
    .line 273
    invoke-static {v2, v7, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const/16 v7, 0x6db6

    .line 278
    .line 279
    move-object v15, v5

    .line 280
    move-object v5, v2

    .line 281
    move-object v2, v3

    .line 282
    move-object v3, v4

    .line 283
    move-object v4, v15

    .line 284
    invoke-static/range {v1 .. v7}, La/fka;->b(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 285
    .line 286
    .line 287
    goto :goto_2

    .line 288
    :cond_c
    invoke-virtual/range {p1 .. p1}, La/fet;->X()V

    .line 289
    .line 290
    .line 291
    :goto_2
    invoke-virtual/range {p1 .. p1}, La/fet;->u()La/yfe0;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    if-eqz v2, :cond_d

    .line 296
    .line 297
    new-instance v3, La/dka;

    .line 298
    .line 299
    invoke-direct {v3, v1, v0, v8}, La/dka;-><init>(La/mm40;IB)V

    .line 300
    .line 301
    .line 302
    goto :goto_1

    .line 303
    :cond_d
    return-void
.end method

.method public static final b(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V
    .locals 14

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move/from16 v6, p6

    .line 4
    .line 5
    const v1, -0x2b0a2b2e

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, v6, 0x6

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x2

    .line 24
    :goto_0
    or-int/2addr v1, v6

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v6

    .line 27
    :goto_1
    and-int/lit8 v2, v6, 0x30

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    const/16 v2, 0x20

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/16 v2, 0x10

    .line 41
    .line 42
    :goto_2
    or-int/2addr v1, v2

    .line 43
    :cond_3
    and-int/lit16 v2, v6, 0x180

    .line 44
    .line 45
    move-object/from16 v10, p2

    .line 46
    .line 47
    if-nez v2, :cond_5

    .line 48
    .line 49
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    const/16 v2, 0x100

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    const/16 v2, 0x80

    .line 59
    .line 60
    :goto_3
    or-int/2addr v1, v2

    .line 61
    :cond_5
    and-int/lit16 v2, v6, 0xc00

    .line 62
    .line 63
    move-object/from16 v11, p3

    .line 64
    .line 65
    if-nez v2, :cond_7

    .line 66
    .line 67
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_6

    .line 72
    .line 73
    const/16 v2, 0x800

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_6
    const/16 v2, 0x400

    .line 77
    .line 78
    :goto_4
    or-int/2addr v1, v2

    .line 79
    :cond_7
    and-int/lit16 v2, v6, 0x6000

    .line 80
    .line 81
    move-object/from16 v12, p4

    .line 82
    .line 83
    if-nez v2, :cond_9

    .line 84
    .line 85
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_8

    .line 90
    .line 91
    const/16 v2, 0x4000

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_8
    const/16 v2, 0x2000

    .line 95
    .line 96
    :goto_5
    or-int/2addr v1, v2

    .line 97
    :cond_9
    and-int/lit16 v2, v1, 0x2493

    .line 98
    .line 99
    const/16 v3, 0x2492

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    if-eq v2, v3, :cond_a

    .line 103
    .line 104
    move v2, v4

    .line 105
    goto :goto_6

    .line 106
    :cond_a
    const/4 v2, 0x0

    .line 107
    :goto_6
    and-int/2addr v1, v4

    .line 108
    invoke-virtual {v0, v1, v2}, La/fet;->U(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_b

    .line 113
    .line 114
    sget-object v1, La/bmd;->n:La/zfn;

    .line 115
    .line 116
    sget-object v2, La/k6z;->a:La/k6z;

    .line 117
    .line 118
    invoke-virtual {v1, v2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    new-instance v7, La/bka;

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    move-object v8, p0

    .line 126
    move-object v9, p1

    .line 127
    invoke-direct/range {v7 .. v13}, La/bka;-><init>(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;B)V

    .line 128
    .line 129
    .line 130
    const v2, -0x5a63b7ee

    .line 131
    .line 132
    .line 133
    invoke-static {v2, v7, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    const/16 v3, 0x38

    .line 138
    .line 139
    invoke-static {v1, v2, v0, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 140
    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_b
    invoke-virtual {v0}, La/fet;->X()V

    .line 144
    .line 145
    .line 146
    :goto_7
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    if-eqz v8, :cond_c

    .line 151
    .line 152
    new-instance v0, La/cka;

    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    move-object v1, p0

    .line 156
    move-object v2, p1

    .line 157
    move-object/from16 v3, p2

    .line 158
    .line 159
    move-object/from16 v4, p3

    .line 160
    .line 161
    move-object/from16 v5, p4

    .line 162
    .line 163
    invoke-direct/range {v0 .. v7}, La/cka;-><init>(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;IB)V

    .line 164
    .line 165
    .line 166
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 167
    .line 168
    :cond_c
    return-void
.end method
