.class public final synthetic La/uz30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fqj0;


# direct methods
.method public synthetic constructor <init>(ILa/fqj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, La/uz30;->a:B

    iput-object p2, p0, La/uz30;->b:La/fqj0;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v6, p3

    .line 16
    .line 17
    check-cast v6, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    and-int/lit8 v1, v3, 0x30

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v6, v2}, La/fet;->e(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const/16 v1, 0x20

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v1, 0x10

    .line 44
    .line 45
    :goto_0
    or-int/2addr v3, v1

    .line 46
    :cond_1
    and-int/lit16 v1, v3, 0x91

    .line 47
    .line 48
    const/16 v4, 0x90

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x1

    .line 52
    if-eq v1, v4, :cond_2

    .line 53
    .line 54
    move v1, v10

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v1, v9

    .line 57
    :goto_1
    and-int/2addr v3, v10

    .line 58
    invoke-virtual {v6, v3, v1}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_c

    .line 63
    .line 64
    rem-int/lit8 v1, v2, 0x2

    .line 65
    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    move v1, v10

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v1, v9

    .line 71
    :goto_2
    sget-object v11, La/jm40;->b:La/jm40;

    .line 72
    .line 73
    const/high16 v3, 0x3f800000    # 1.0f

    .line 74
    .line 75
    invoke-static {v11, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    sget-object v5, La/qmk;->a:La/zcl;

    .line 80
    .line 81
    const/high16 v5, 0x42700000    # 60.0f

    .line 82
    .line 83
    invoke-static {v4, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 88
    .line 89
    invoke-virtual {v6, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 94
    .line 95
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    if-nez v2, :cond_4

    .line 100
    .line 101
    sget-object v5, La/qmk;->i:La/zcl;

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    sget-object v5, La/qmk;->a:La/zcl;

    .line 105
    .line 106
    :goto_3
    if-nez v2, :cond_5

    .line 107
    .line 108
    sget-object v12, La/qmk;->i:La/zcl;

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    sget-object v12, La/qmk;->a:La/zcl;

    .line 112
    .line 113
    :goto_4
    iget-byte v13, v0, La/uz30;->a:B

    .line 114
    .line 115
    sub-int/2addr v13, v10

    .line 116
    if-ne v2, v13, :cond_6

    .line 117
    .line 118
    sget-object v14, La/qmk;->i:La/zcl;

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_6
    sget-object v14, La/qmk;->a:La/zcl;

    .line 122
    .line 123
    :goto_5
    if-ne v2, v13, :cond_7

    .line 124
    .line 125
    sget-object v15, La/qmk;->i:La/zcl;

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    sget-object v15, La/qmk;->a:La/zcl;

    .line 129
    .line 130
    :goto_6
    new-instance v3, La/ugg0;

    .line 131
    .line 132
    invoke-direct {v3, v5, v12, v15, v14}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v4, v7, v8, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    sget-object v4, La/gqw0;->a:La/zx7;

    .line 140
    .line 141
    invoke-static {v4, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    iget-wide v7, v6, La/fet;->T:J

    .line 146
    .line 147
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-static {v6, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6}, La/fet;->i0()V

    .line 165
    .line 166
    .line 167
    iget-boolean v8, v6, La/fet;->S:Z

    .line 168
    .line 169
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 170
    .line 171
    if-eqz v8, :cond_8

    .line 172
    .line 173
    invoke-virtual {v6, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 174
    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_8
    invoke-virtual {v6}, La/fet;->r0()V

    .line 178
    .line 179
    .line 180
    :goto_7
    sget-object v8, La/gqw0;->x:La/shd;

    .line 181
    .line 182
    invoke-static {v6, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    sget-object v4, La/gqw0;->w:La/shd;

    .line 186
    .line 187
    invoke-static {v6, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    sget-object v7, La/gqw0;->y:La/shd;

    .line 195
    .line 196
    invoke-static {v6, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 200
    .line 201
    .line 202
    sget-object v5, La/gqw0;->v:La/shd;

    .line 203
    .line 204
    invoke-static {v6, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 208
    .line 209
    const/high16 v14, 0x41400000    # 12.0f

    .line 210
    .line 211
    const/high16 v15, 0x41200000    # 10.0f

    .line 212
    .line 213
    invoke-static {v3, v14, v15}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    sget-object v14, La/gqw0;->k:La/yx7;

    .line 218
    .line 219
    sget-object v15, La/uc9;->a:La/lw3;

    .line 220
    .line 221
    const/16 v10, 0x30

    .line 222
    .line 223
    invoke-static {v15, v14, v6, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    iget-wide v14, v6, La/fet;->T:J

    .line 228
    .line 229
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 230
    .line 231
    .line 232
    move-result v14

    .line 233
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 234
    .line 235
    .line 236
    move-result-object v15

    .line 237
    invoke-static {v6, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v6}, La/fet;->i0()V

    .line 242
    .line 243
    .line 244
    iget-boolean v9, v6, La/fet;->S:Z

    .line 245
    .line 246
    if-eqz v9, :cond_9

    .line 247
    .line 248
    invoke-virtual {v6, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_9
    invoke-virtual {v6}, La/fet;->r0()V

    .line 253
    .line 254
    .line 255
    :goto_8
    invoke-static {v6, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v6, v15, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v14, v6, v7, v6}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v6, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 265
    .line 266
    .line 267
    const/high16 v3, 0x42200000    # 40.0f

    .line 268
    .line 269
    invoke-static {v11, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    sget-object v4, La/qmk;->m:La/zcl;

    .line 274
    .line 275
    sget-object v5, La/vgg0;->a:La/ugg0;

    .line 276
    .line 277
    invoke-static {v4, v4, v4, v4, v3}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    iget-object v0, v0, La/uz30;->b:La/fqj0;

    .line 282
    .line 283
    invoke-static {v3, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    const/4 v4, 0x0

    .line 288
    invoke-static {v4, v6, v3}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 289
    .line 290
    .line 291
    const/4 v15, 0x0

    .line 292
    const/16 v16, 0xe

    .line 293
    .line 294
    const/high16 v12, 0x41400000    # 12.0f

    .line 295
    .line 296
    move v3, v13

    .line 297
    const/4 v13, 0x0

    .line 298
    const/4 v14, 0x0

    .line 299
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    sget-object v5, La/qmk;->i:La/zcl;

    .line 304
    .line 305
    invoke-static {v5, v5, v5, v5, v4}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    if-eqz v1, :cond_a

    .line 310
    .line 311
    const/high16 v1, 0x43000000    # 128.0f

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_a
    const/high16 v1, 0x42c00000    # 96.0f

    .line 315
    .line 316
    :goto_9
    invoke-static {v4, v1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    const/high16 v4, 0x41800000    # 16.0f

    .line 321
    .line 322
    invoke-static {v1, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-static {v1, v0}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    const/4 v4, 0x0

    .line 331
    invoke-static {v4, v6, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 332
    .line 333
    .line 334
    const/4 v0, 0x1

    .line 335
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 336
    .line 337
    .line 338
    if-eq v2, v3, :cond_b

    .line 339
    .line 340
    const v0, 0x6931dc42

    .line 341
    .line 342
    .line 343
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 344
    .line 345
    .line 346
    const/4 v15, 0x0

    .line 347
    const/16 v16, 0xe

    .line 348
    .line 349
    const/high16 v12, 0x42700000    # 60.0f

    .line 350
    .line 351
    const/4 v13, 0x0

    .line 352
    const/4 v14, 0x0

    .line 353
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    const/high16 v1, 0x3f800000    # 1.0f

    .line 358
    .line 359
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    sget-object v1, La/gqw0;->i:La/zx7;

    .line 364
    .line 365
    sget-object v2, La/jr8;->a:La/jr8;

    .line 366
    .line 367
    invoke-virtual {v2, v0, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    const/4 v7, 0x6

    .line 372
    const/4 v8, 0x4

    .line 373
    sget-object v3, La/zfi0;->a:La/zfi0;

    .line 374
    .line 375
    const/4 v5, 0x0

    .line 376
    invoke-static/range {v3 .. v8}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 377
    .line 378
    .line 379
    const/4 v4, 0x0

    .line 380
    invoke-virtual {v6, v4}, La/fet;->r(Z)V

    .line 381
    .line 382
    .line 383
    :goto_a
    const/4 v0, 0x1

    .line 384
    goto :goto_b

    .line 385
    :cond_b
    const/4 v4, 0x0

    .line 386
    const v0, 0x6936a636

    .line 387
    .line 388
    .line 389
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v6, v4}, La/fet;->r(Z)V

    .line 393
    .line 394
    .line 395
    goto :goto_a

    .line 396
    :goto_b
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 397
    .line 398
    .line 399
    goto :goto_c

    .line 400
    :cond_c
    invoke-virtual {v6}, La/fet;->X()V

    .line 401
    .line 402
    .line 403
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 404
    .line 405
    return-object v0
.end method
