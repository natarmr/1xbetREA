.class public abstract La/i5m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/ugg0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->m:La/zcl;

    .line 2
    .line 3
    sget-object v1, La/vgg0;->a:La/ugg0;

    .line 4
    .line 5
    new-instance v1, La/ugg0;

    .line 6
    .line 7
    invoke-direct {v1, v0, v0, v0, v0}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 8
    .line 9
    .line 10
    sput-object v1, La/i5m;->a:La/ugg0;

    .line 11
    .line 12
    return-void
.end method

.method public static final a(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;Z)V
    .locals 18

    .line 1
    move-object/from16 v5, p1

    .line 2
    .line 3
    move-object/from16 v8, p3

    .line 4
    .line 5
    move/from16 v9, p4

    .line 6
    .line 7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, 0x544be358

    .line 11
    .line 12
    .line 13
    invoke-virtual {v5, v0}, La/fet;->g0(I)La/fet;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p1 .. p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int v0, p0, v0

    .line 26
    .line 27
    invoke-virtual {v5, v9}, La/fet;->h(Z)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v1

    .line 39
    invoke-virtual {v5, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    const/16 v1, 0x100

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v1, 0x80

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v1

    .line 51
    and-int/lit16 v1, v0, 0x93

    .line 52
    .line 53
    const/16 v3, 0x92

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    if-eq v1, v3, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    move v1, v4

    .line 61
    :goto_3
    and-int/lit8 v3, v0, 0x1

    .line 62
    .line 63
    invoke-virtual {v5, v3, v1}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_a

    .line 68
    .line 69
    sget-object v1, La/qmk;->a:La/zcl;

    .line 70
    .line 71
    const/high16 v1, 0x41e00000    # 28.0f

    .line 72
    .line 73
    move-object/from16 v11, p2

    .line 74
    .line 75
    invoke-static {v11, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v1, v8}, La/feb;->O(La/mm40;Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 84
    .line 85
    invoke-static {v3, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    iget-wide v12, v5, La/fet;->T:J

    .line 90
    .line 91
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 104
    .line 105
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, La/fet;->i0()V

    .line 109
    .line 110
    .line 111
    iget-boolean v13, v5, La/fet;->S:Z

    .line 112
    .line 113
    sget-object v14, La/e7z;->u1:La/pcy;

    .line 114
    .line 115
    if-eqz v13, :cond_4

    .line 116
    .line 117
    invoke-virtual {v5, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    invoke-virtual {v5}, La/fet;->r0()V

    .line 122
    .line 123
    .line 124
    :goto_4
    sget-object v13, La/gqw0;->x:La/shd;

    .line 125
    .line 126
    invoke-static {v5, v6, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    sget-object v6, La/gqw0;->w:La/shd;

    .line 130
    .line 131
    invoke-static {v5, v12, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    sget-object v12, La/gqw0;->y:La/shd;

    .line 139
    .line 140
    invoke-static {v5, v7, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 144
    .line 145
    .line 146
    sget-object v7, La/gqw0;->v:La/shd;

    .line 147
    .line 148
    invoke-static {v5, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    const/high16 v1, 0x41900000    # 18.0f

    .line 152
    .line 153
    sget-object v15, La/jm40;->b:La/jm40;

    .line 154
    .line 155
    invoke-static {v15, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    sget-object v10, La/i5m;->a:La/ugg0;

    .line 160
    .line 161
    invoke-static {v1, v10}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    sget-object v10, La/m8m0;->a:La/zfn;

    .line 166
    .line 167
    invoke-virtual {v5, v10}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v16

    .line 171
    check-cast v16, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 172
    .line 173
    move-object/from16 v17, v3

    .line 174
    .line 175
    invoke-virtual/range {v16 .. v16}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite20-0d7_KjU()J

    .line 176
    .line 177
    .line 178
    move-result-wide v2

    .line 179
    move/from16 v16, v0

    .line 180
    .line 181
    sget-object v0, La/jd8;->n:La/ljc;

    .line 182
    .line 183
    invoke-static {v1, v2, v3, v0}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    move-object/from16 v1, v17

    .line 188
    .line 189
    invoke-static {v1, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    iget-wide v2, v5, La/fet;->T:J

    .line 194
    .line 195
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-static {v5, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v5}, La/fet;->i0()V

    .line 208
    .line 209
    .line 210
    iget-boolean v4, v5, La/fet;->S:Z

    .line 211
    .line 212
    if-eqz v4, :cond_5

    .line 213
    .line 214
    invoke-virtual {v5, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_5
    invoke-virtual {v5}, La/fet;->r0()V

    .line 219
    .line 220
    .line 221
    :goto_5
    invoke-static {v5, v1, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v5, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v2, v5, v12, v5}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v5, v0, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x41400000    # 12.0f

    .line 234
    .line 235
    invoke-static {v15, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    const-string v1, "FavoriteButtonTestTag"

    .line 240
    .line 241
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    and-int/lit8 v1, v16, 0x70

    .line 246
    .line 247
    const/16 v2, 0x20

    .line 248
    .line 249
    if-ne v1, v2, :cond_6

    .line 250
    .line 251
    const/4 v1, 0x1

    .line 252
    goto :goto_6

    .line 253
    :cond_6
    const/4 v1, 0x0

    .line 254
    :goto_6
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    if-nez v1, :cond_7

    .line 259
    .line 260
    sget-object v1, La/ukd;->a:La/cl5;

    .line 261
    .line 262
    if-ne v2, v1, :cond_8

    .line 263
    .line 264
    :cond_7
    new-instance v2, La/z;

    .line 265
    .line 266
    const/16 v1, 0x14

    .line 267
    .line 268
    invoke-direct {v2, v1, v9}, La/z;-><init>(BZ)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v5, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 275
    .line 276
    const/4 v1, 0x0

    .line 277
    invoke-static {v0, v1, v2}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    if-eqz v9, :cond_9

    .line 282
    .line 283
    const v0, 0x7f08090a

    .line 284
    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_9
    const v0, 0x7f08090b

    .line 288
    .line 289
    .line 290
    :goto_7
    invoke-static {v0, v1, v5}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v5, v10}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 299
    .line 300
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 301
    .line 302
    .line 303
    move-result-wide v3

    .line 304
    const/16 v6, 0x38

    .line 305
    .line 306
    const/4 v7, 0x0

    .line 307
    const/4 v1, 0x0

    .line 308
    invoke-static/range {v0 .. v7}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 309
    .line 310
    .line 311
    const/4 v0, 0x1

    .line 312
    invoke-virtual {v5, v0}, La/fet;->r(Z)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5, v0}, La/fet;->r(Z)V

    .line 316
    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_a
    move-object/from16 v11, p2

    .line 320
    .line 321
    invoke-virtual {v5}, La/fet;->X()V

    .line 322
    .line 323
    .line 324
    :goto_8
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    if-eqz v6, :cond_b

    .line 329
    .line 330
    new-instance v0, La/a5a;

    .line 331
    .line 332
    const/4 v5, 0x2

    .line 333
    move/from16 v4, p0

    .line 334
    .line 335
    move-object v3, v8

    .line 336
    move v2, v9

    .line 337
    move-object v1, v11

    .line 338
    invoke-direct/range {v0 .. v5}, La/a5a;-><init>(La/mm40;ZLkotlin/jvm/functions/Function0;IB)V

    .line 339
    .line 340
    .line 341
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 342
    .line 343
    :cond_b
    return-void
.end method
