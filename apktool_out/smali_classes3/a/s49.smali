.class public final synthetic La/s49;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pl7;La/wom;La/w2d;Lkotlin/jvm/functions/Function0;La/xcz;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/s49;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/s49;->c:Ljava/lang/Object;

    iput-object p2, p0, La/s49;->d:Ljava/lang/Object;

    iput-object p3, p0, La/s49;->e:Ljava/lang/Object;

    iput-object p4, p0, La/s49;->b:Ljava/lang/Object;

    iput-object p5, p0, La/s49;->f:Ljava/lang/Object;

    iput-object p6, p0, La/s49;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/v3w0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/s49;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/s49;->g:Ljava/lang/Object;

    iput-object p2, p0, La/s49;->b:Ljava/lang/Object;

    iput-object p3, p0, La/s49;->c:Ljava/lang/Object;

    iput-object p4, p0, La/s49;->d:Ljava/lang/Object;

    iput-object p5, p0, La/s49;->e:Ljava/lang/Object;

    iput-object p6, p0, La/s49;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p7, p0, La/s49;->a:B

    iput-object p1, p0, La/s49;->b:Ljava/lang/Object;

    iput-object p2, p0, La/s49;->c:Ljava/lang/Object;

    iput-object p3, p0, La/s49;->d:Ljava/lang/Object;

    iput-object p4, p0, La/s49;->e:Ljava/lang/Object;

    iput-object p5, p0, La/s49;->f:Ljava/lang/Object;

    iput-object p6, p0, La/s49;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;La/eke;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 4
    const/4 v0, 0x0

    iput-byte v0, p0, La/s49;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/s49;->b:Ljava/lang/Object;

    iput-object p2, p0, La/s49;->g:Ljava/lang/Object;

    iput-object p3, p0, La/s49;->c:Ljava/lang/Object;

    iput-object p4, p0, La/s49;->d:Ljava/lang/Object;

    iput-object p5, p0, La/s49;->e:Ljava/lang/Object;

    iput-object p6, p0, La/s49;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/s49;->a:B

    .line 4
    .line 5
    sget-object v2, La/jr8;->a:La/jr8;

    .line 6
    .line 7
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 8
    .line 9
    sget-object v8, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    const/16 v9, 0x12

    .line 12
    .line 13
    sget-object v10, La/ukd;->a:La/cl5;

    .line 14
    .line 15
    iget-object v13, v0, La/s49;->c:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v14, 0x2

    .line 18
    iget-object v15, v0, La/s49;->g:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v5, v0, La/s49;->f:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v12, v0, La/s49;->e:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v11, v0, La/s49;->d:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v3, v0, La/s49;->b:Ljava/lang/Object;

    .line 27
    .line 28
    const/16 v19, 0x1

    .line 29
    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    check-cast v3, La/l7m0;

    .line 34
    .line 35
    check-cast v13, La/yjt;

    .line 36
    .line 37
    check-cast v11, La/l7m0;

    .line 38
    .line 39
    check-cast v12, La/fpk0;

    .line 40
    .line 41
    check-cast v5, La/f3d;

    .line 42
    .line 43
    check-cast v15, La/qno0;

    .line 44
    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    check-cast v0, La/mm40;

    .line 48
    .line 49
    move-object/from16 v1, p2

    .line 50
    .line 51
    check-cast v1, La/fet;

    .line 52
    .line 53
    move-object/from16 v2, p3

    .line 54
    .line 55
    check-cast v2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    sget-object v16, La/fpk0;->V1:La/zie0;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    and-int/lit8 v16, v2, 0x6

    .line 67
    .line 68
    if-nez v16, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v16

    .line 74
    if-eqz v16, :cond_0

    .line 75
    .line 76
    const/16 v16, 0x4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move/from16 v16, v14

    .line 80
    .line 81
    :goto_0
    or-int v2, v2, v16

    .line 82
    .line 83
    :cond_1
    and-int/lit8 v4, v2, 0x13

    .line 84
    .line 85
    if-eq v4, v9, :cond_2

    .line 86
    .line 87
    move/from16 v4, v19

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const/4 v4, 0x0

    .line 91
    :goto_1
    and-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    invoke-virtual {v1, v2, v4}, La/fet;->U(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_e

    .line 98
    .line 99
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, La/kwk0;

    .line 104
    .line 105
    iget-object v2, v2, La/kwk0;->b:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, La/kwk0;

    .line 112
    .line 113
    iget v4, v4, La/kwk0;->a:I

    .line 114
    .line 115
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    if-nez v9, :cond_3

    .line 124
    .line 125
    if-ne v6, v10, :cond_4

    .line 126
    .line 127
    :cond_3
    new-instance v6, La/l82;

    .line 128
    .line 129
    const/4 v9, 0x3

    .line 130
    invoke-direct {v6, v2, v9}, La/l82;-><init>(Ljava/util/ArrayList;B)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    invoke-static {v4, v6, v1, v9, v14}, La/zk80;->b(ILkotlin/jvm/functions/Function0;La/fet;II)La/kwj;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    check-cast v6, La/kwk0;

    .line 148
    .line 149
    iget v6, v6, La/kwk0;->a:I

    .line 150
    .line 151
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-virtual {v1, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    invoke-virtual {v1, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    or-int/2addr v9, v14

    .line 164
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    if-nez v9, :cond_6

    .line 169
    .line 170
    if-ne v14, v10, :cond_5

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_5
    move-object/from16 v16, v2

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_6
    :goto_2
    new-instance v14, La/eyj;

    .line 177
    .line 178
    const/16 v9, 0xa

    .line 179
    .line 180
    move-object/from16 v16, v2

    .line 181
    .line 182
    const/4 v2, 0x0

    .line 183
    invoke-direct {v14, v9, v2, v4, v3}, La/eyj;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :goto_3
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 190
    .line 191
    invoke-static {v1, v6, v14}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    if-ne v2, v10, :cond_7

    .line 199
    .line 200
    new-instance v2, La/rai0;

    .line 201
    .line 202
    const/16 v3, 0x1a

    .line 203
    .line 204
    invoke-direct {v2, v13, v3}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 211
    .line 212
    invoke-static {v0, v2}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 217
    .line 218
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 223
    .line 224
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 225
    .line 226
    .line 227
    move-result-wide v2

    .line 228
    sget-object v6, La/jd8;->n:La/ljc;

    .line 229
    .line 230
    invoke-static {v0, v2, v3, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    sget-object v2, La/uc9;->c:La/mw3;

    .line 235
    .line 236
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 237
    .line 238
    const/4 v9, 0x0

    .line 239
    invoke-static {v2, v3, v1, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    iget-wide v13, v1, La/fet;->T:J

    .line 244
    .line 245
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 258
    .line 259
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, La/fet;->i0()V

    .line 263
    .line 264
    .line 265
    iget-boolean v9, v1, La/fet;->S:Z

    .line 266
    .line 267
    if-eqz v9, :cond_8

    .line 268
    .line 269
    invoke-virtual {v1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_8
    invoke-virtual {v1}, La/fet;->r0()V

    .line 274
    .line 275
    .line 276
    :goto_4
    sget-object v7, La/gqw0;->x:La/shd;

    .line 277
    .line 278
    invoke-static {v1, v2, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 279
    .line 280
    .line 281
    sget-object v2, La/gqw0;->w:La/shd;

    .line 282
    .line 283
    invoke-static {v1, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    sget-object v3, La/gqw0;->y:La/shd;

    .line 291
    .line 292
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 296
    .line 297
    .line 298
    sget-object v2, La/gqw0;->v:La/shd;

    .line 299
    .line 300
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    move/from16 v2, v19

    .line 308
    .line 309
    if-le v0, v2, :cond_d

    .line 310
    .line 311
    const v0, 0x3d54eb33

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 315
    .line 316
    .line 317
    sget-object v0, La/qmk;->a:La/zcl;

    .line 318
    .line 319
    const/high16 v0, 0x41000000    # 8.0f

    .line 320
    .line 321
    invoke-static {v8, v0}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 322
    .line 323
    .line 324
    move-result-object v20

    .line 325
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    check-cast v0, La/mwk0;

    .line 330
    .line 331
    iget-object v0, v0, La/mwk0;->b:La/a4x;

    .line 332
    .line 333
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, La/mwk0;

    .line 338
    .line 339
    iget-object v2, v2, La/mwk0;->c:La/dxh0;

    .line 340
    .line 341
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    if-nez v3, :cond_9

    .line 350
    .line 351
    if-ne v6, v10, :cond_a

    .line 352
    .line 353
    :cond_9
    new-instance v6, La/f7f0;

    .line 354
    .line 355
    const/16 v3, 0xe

    .line 356
    .line 357
    invoke-direct {v6, v11, v3}, La/f7f0;-><init>(La/l7m0;B)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    :cond_a
    move-object/from16 v25, v6

    .line 364
    .line 365
    check-cast v25, Lkotlin/jvm/functions/Function0;

    .line 366
    .line 367
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    if-nez v3, :cond_c

    .line 376
    .line 377
    if-ne v6, v10, :cond_b

    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_b
    const/4 v9, 0x0

    .line 381
    goto :goto_6

    .line 382
    :cond_c
    :goto_5
    new-instance v6, La/dpk0;

    .line 383
    .line 384
    const/4 v9, 0x0

    .line 385
    invoke-direct {v6, v12, v9}, La/dpk0;-><init>(La/fpk0;B)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    :goto_6
    move-object/from16 v26, v6

    .line 392
    .line 393
    check-cast v26, Lkotlin/jvm/functions/Function1;

    .line 394
    .line 395
    const/16 v28, 0x180

    .line 396
    .line 397
    const/16 v29, 0x10

    .line 398
    .line 399
    sget-object v22, La/gxh0;->a:La/gxh0;

    .line 400
    .line 401
    const/16 v24, 0x0

    .line 402
    .line 403
    move-object/from16 v21, v0

    .line 404
    .line 405
    move-object/from16 v27, v1

    .line 406
    .line 407
    move-object/from16 v23, v2

    .line 408
    .line 409
    invoke-static/range {v20 .. v29}, La/ibc;->n(La/mm40;La/a4x;La/hxh0;La/dxh0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 410
    .line 411
    .line 412
    move-object/from16 v0, v27

    .line 413
    .line 414
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 415
    .line 416
    .line 417
    :goto_7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 418
    .line 419
    goto :goto_8

    .line 420
    :cond_d
    move-object v0, v1

    .line 421
    const/4 v9, 0x0

    .line 422
    const v1, 0x3d5d37e9

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 429
    .line 430
    .line 431
    goto :goto_7

    .line 432
    :goto_8
    invoke-static {v8, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    iget-object v2, v5, La/f3d;->g:La/a8z;

    .line 437
    .line 438
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    check-cast v2, La/vj50;

    .line 443
    .line 444
    const/4 v3, 0x1

    .line 445
    invoke-static {v1, v3, v2}, La/fww;->z(La/mm40;ZLa/vj50;)La/mm40;

    .line 446
    .line 447
    .line 448
    move-result-object v21

    .line 449
    new-instance v1, La/n82;

    .line 450
    .line 451
    move-object/from16 v2, v16

    .line 452
    .line 453
    const/4 v6, 0x4

    .line 454
    invoke-direct {v1, v12, v2, v15, v6}, La/n82;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 455
    .line 456
    .line 457
    const v2, -0x6de42228

    .line 458
    .line 459
    .line 460
    invoke-static {v2, v1, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 461
    .line 462
    .line 463
    move-result-object v33

    .line 464
    const/16 v36, 0x6000

    .line 465
    .line 466
    const/16 v37, 0x3eec

    .line 467
    .line 468
    const/16 v22, 0x0

    .line 469
    .line 470
    const/16 v23, 0x0

    .line 471
    .line 472
    const/16 v24, 0x0

    .line 473
    .line 474
    const/16 v25, 0x0

    .line 475
    .line 476
    const/16 v26, 0x0

    .line 477
    .line 478
    const/16 v27, 0x0

    .line 479
    .line 480
    const/16 v28, 0x0

    .line 481
    .line 482
    const/16 v29, 0x0

    .line 483
    .line 484
    const/16 v30, 0x0

    .line 485
    .line 486
    const/16 v31, 0x0

    .line 487
    .line 488
    const/16 v32, 0x0

    .line 489
    .line 490
    const v35, 0x6006000

    .line 491
    .line 492
    .line 493
    move-object/from16 v34, v0

    .line 494
    .line 495
    move-object/from16 v20, v4

    .line 496
    .line 497
    invoke-static/range {v20 .. v37}, La/q5x;->e(La/xk80;La/mm40;La/hh80;La/yi80;IFLa/yx7;La/afk0;ZLkotlin/jvm/functions/Function1;La/vj50;La/ifk0;La/vf80;La/ugd;La/fet;III)V

    .line 498
    .line 499
    .line 500
    const/4 v2, 0x1

    .line 501
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 502
    .line 503
    .line 504
    goto :goto_9

    .line 505
    :cond_e
    move-object v0, v1

    .line 506
    invoke-virtual {v0}, La/fet;->X()V

    .line 507
    .line 508
    .line 509
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 510
    .line 511
    return-object v0

    .line 512
    :pswitch_0
    const/4 v6, 0x4

    .line 513
    check-cast v3, La/l7m0;

    .line 514
    .line 515
    check-cast v13, La/fli;

    .line 516
    .line 517
    move-object/from16 v21, v11

    .line 518
    .line 519
    check-cast v21, La/mm40;

    .line 520
    .line 521
    move-object/from16 v22, v12

    .line 522
    .line 523
    check-cast v22, Landroidx/fragment/app/Fragment;

    .line 524
    .line 525
    check-cast v5, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 526
    .line 527
    move-object/from16 v24, v15

    .line 528
    .line 529
    check-cast v24, Lkotlin/jvm/functions/Function1;

    .line 530
    .line 531
    move-object/from16 v0, p1

    .line 532
    .line 533
    check-cast v0, Ljava/lang/Long;

    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 536
    .line 537
    .line 538
    move-result-wide v0

    .line 539
    move-object/from16 v2, p2

    .line 540
    .line 541
    check-cast v2, La/fet;

    .line 542
    .line 543
    move-object/from16 v4, p3

    .line 544
    .line 545
    check-cast v4, Ljava/lang/Integer;

    .line 546
    .line 547
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    and-int/lit8 v7, v4, 0x6

    .line 552
    .line 553
    if-nez v7, :cond_10

    .line 554
    .line 555
    invoke-virtual {v2, v0, v1}, La/fet;->f(J)Z

    .line 556
    .line 557
    .line 558
    move-result v7

    .line 559
    if-eqz v7, :cond_f

    .line 560
    .line 561
    move v11, v6

    .line 562
    goto :goto_a

    .line 563
    :cond_f
    move v11, v14

    .line 564
    :goto_a
    or-int/2addr v4, v11

    .line 565
    :cond_10
    and-int/lit8 v6, v4, 0x13

    .line 566
    .line 567
    if-eq v6, v9, :cond_11

    .line 568
    .line 569
    const/4 v6, 0x1

    .line 570
    :goto_b
    const/4 v7, 0x1

    .line 571
    goto :goto_c

    .line 572
    :cond_11
    const/4 v6, 0x0

    .line 573
    goto :goto_b

    .line 574
    :goto_c
    and-int/2addr v4, v7

    .line 575
    invoke-virtual {v2, v4, v6}, La/fet;->U(IZ)Z

    .line 576
    .line 577
    .line 578
    move-result v4

    .line 579
    if-eqz v4, :cond_13

    .line 580
    .line 581
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    check-cast v3, La/lz20;

    .line 586
    .line 587
    instance-of v4, v3, La/kz20;

    .line 588
    .line 589
    if-eqz v4, :cond_12

    .line 590
    .line 591
    check-cast v3, La/kz20;

    .line 592
    .line 593
    iget-object v3, v3, La/kz20;->m:La/lm6;

    .line 594
    .line 595
    if-eqz v3, :cond_12

    .line 596
    .line 597
    iget-boolean v3, v3, La/lm6;->b:Z

    .line 598
    .line 599
    if-ne v3, v7, :cond_12

    .line 600
    .line 601
    const v0, -0x3ae02152

    .line 602
    .line 603
    .line 604
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 605
    .line 606
    .line 607
    iget-object v0, v13, La/fli;->q:La/gl5;

    .line 608
    .line 609
    new-instance v1, Lorg/xplatform/sportgame/markets/betbuilder/api/navigation/BetBuilderMarketsParams;

    .line 610
    .line 611
    iget-wide v3, v5, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->d:J

    .line 612
    .line 613
    invoke-direct {v1, v3, v4}, Lorg/xplatform/sportgame/markets/betbuilder/api/navigation/BetBuilderMarketsParams;-><init>(J)V

    .line 614
    .line 615
    .line 616
    const/16 v26, 0x200

    .line 617
    .line 618
    move-object/from16 v20, v0

    .line 619
    .line 620
    move-object/from16 v23, v1

    .line 621
    .line 622
    move-object/from16 v25, v2

    .line 623
    .line 624
    invoke-virtual/range {v20 .. v26}, La/gl5;->f(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/betbuilder/api/navigation/BetBuilderMarketsParams;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 625
    .line 626
    .line 627
    const/4 v9, 0x0

    .line 628
    invoke-virtual {v2, v9}, La/fet;->r(Z)V

    .line 629
    .line 630
    .line 631
    goto :goto_d

    .line 632
    :cond_12
    const v3, -0x3ad87b5b

    .line 633
    .line 634
    .line 635
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 636
    .line 637
    .line 638
    iget-object v3, v13, La/fli;->p:La/kl5;

    .line 639
    .line 640
    new-instance v31, Lorg/xplatform/sportgame/markets/categories/api/navigation/CategoryMarketsParams;

    .line 641
    .line 642
    iget-wide v6, v5, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->d:J

    .line 643
    .line 644
    iget-wide v4, v5, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->a:J

    .line 645
    .line 646
    move-wide/from16 v36, v0

    .line 647
    .line 648
    move-wide/from16 v34, v4

    .line 649
    .line 650
    move-wide/from16 v32, v6

    .line 651
    .line 652
    invoke-direct/range {v31 .. v37}, Lorg/xplatform/sportgame/markets/categories/api/navigation/CategoryMarketsParams;-><init>(JJJ)V

    .line 653
    .line 654
    .line 655
    const/16 v26, 0x200

    .line 656
    .line 657
    move-object/from16 v25, v2

    .line 658
    .line 659
    move-object/from16 v20, v3

    .line 660
    .line 661
    move-object/from16 v23, v31

    .line 662
    .line 663
    invoke-virtual/range {v20 .. v26}, La/kl5;->a(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/categories/api/navigation/CategoryMarketsParams;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 664
    .line 665
    .line 666
    const/4 v9, 0x0

    .line 667
    invoke-virtual {v2, v9}, La/fet;->r(Z)V

    .line 668
    .line 669
    .line 670
    goto :goto_d

    .line 671
    :cond_13
    invoke-virtual {v2}, La/fet;->X()V

    .line 672
    .line 673
    .line 674
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 675
    .line 676
    return-object v0

    .line 677
    :pswitch_1
    const/4 v6, 0x4

    .line 678
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 679
    .line 680
    move-object/from16 v32, v13

    .line 681
    .line 682
    check-cast v32, La/xcz;

    .line 683
    .line 684
    check-cast v11, La/l7m0;

    .line 685
    .line 686
    check-cast v12, La/l7m0;

    .line 687
    .line 688
    check-cast v5, La/l7m0;

    .line 689
    .line 690
    check-cast v15, La/l7m0;

    .line 691
    .line 692
    move-object/from16 v0, p1

    .line 693
    .line 694
    check-cast v0, La/ir8;

    .line 695
    .line 696
    move-object/from16 v1, p2

    .line 697
    .line 698
    check-cast v1, La/fet;

    .line 699
    .line 700
    move-object/from16 v2, p3

    .line 701
    .line 702
    check-cast v2, Ljava/lang/Integer;

    .line 703
    .line 704
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    and-int/lit8 v4, v2, 0x6

    .line 712
    .line 713
    if-nez v4, :cond_15

    .line 714
    .line 715
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v4

    .line 719
    if-eqz v4, :cond_14

    .line 720
    .line 721
    goto :goto_e

    .line 722
    :cond_14
    move v6, v14

    .line 723
    :goto_e
    or-int/2addr v2, v6

    .line 724
    :cond_15
    and-int/lit8 v4, v2, 0x13

    .line 725
    .line 726
    if-eq v4, v9, :cond_16

    .line 727
    .line 728
    const/4 v4, 0x1

    .line 729
    :goto_f
    const/16 v19, 0x1

    .line 730
    .line 731
    goto :goto_10

    .line 732
    :cond_16
    const/4 v4, 0x0

    .line 733
    goto :goto_f

    .line 734
    :goto_10
    and-int/lit8 v2, v2, 0x1

    .line 735
    .line 736
    invoke-virtual {v1, v2, v4}, La/fet;->U(IZ)Z

    .line 737
    .line 738
    .line 739
    move-result v2

    .line 740
    if-eqz v2, :cond_1f

    .line 741
    .line 742
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    check-cast v2, La/l7m0;

    .line 747
    .line 748
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    check-cast v2, La/kje;

    .line 753
    .line 754
    instance-of v4, v2, La/zie;

    .line 755
    .line 756
    if-eqz v4, :cond_19

    .line 757
    .line 758
    const v4, -0x5b3aa09e

    .line 759
    .line 760
    .line 761
    invoke-virtual {v1, v4}, La/fet;->e0(I)V

    .line 762
    .line 763
    .line 764
    sget-object v4, La/gqw0;->e:La/zx7;

    .line 765
    .line 766
    invoke-interface {v0, v8, v4}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-static {v0}, La/knm0;->r(La/mm40;)La/mm40;

    .line 771
    .line 772
    .line 773
    move-result-object v4

    .line 774
    sget-object v0, La/qmk;->a:La/zcl;

    .line 775
    .line 776
    const/high16 v8, 0x42000000    # 32.0f

    .line 777
    .line 778
    const/4 v9, 0x7

    .line 779
    const/4 v5, 0x0

    .line 780
    const/4 v6, 0x0

    .line 781
    const/4 v7, 0x0

    .line 782
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 783
    .line 784
    .line 785
    move-result-object v20

    .line 786
    check-cast v2, La/zie;

    .line 787
    .line 788
    iget-object v0, v2, La/zie;->a:La/mdm;

    .line 789
    .line 790
    invoke-virtual {v1, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v2

    .line 794
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v4

    .line 798
    if-nez v2, :cond_17

    .line 799
    .line 800
    if-ne v4, v10, :cond_18

    .line 801
    .line 802
    :cond_17
    new-instance v4, La/i8v;

    .line 803
    .line 804
    const/16 v2, 0x1d

    .line 805
    .line 806
    invoke-direct {v4, v3, v2}, La/i8v;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    :cond_18
    move-object/from16 v23, v4

    .line 813
    .line 814
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 815
    .line 816
    const/16 v25, 0x0

    .line 817
    .line 818
    const/16 v26, 0x4

    .line 819
    .line 820
    const/16 v22, 0x0

    .line 821
    .line 822
    move-object/from16 v21, v0

    .line 823
    .line 824
    move-object/from16 v24, v1

    .line 825
    .line 826
    invoke-static/range {v20 .. v26}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 827
    .line 828
    .line 829
    move-object/from16 v0, v24

    .line 830
    .line 831
    const/4 v9, 0x0

    .line 832
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 833
    .line 834
    .line 835
    goto/16 :goto_13

    .line 836
    .line 837
    :cond_19
    move-object v0, v1

    .line 838
    const/4 v9, 0x0

    .line 839
    sget-object v1, La/dje;->a:La/dje;

    .line 840
    .line 841
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    if-eqz v1, :cond_1a

    .line 846
    .line 847
    const v1, -0x5b320c95

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 851
    .line 852
    .line 853
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    iget v1, v1, La/wfn;->d:F

    .line 858
    .line 859
    const/4 v2, 0x0

    .line 860
    invoke-static {v8, v1, v2, v14}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    invoke-static {v9, v0, v1}, La/k9x;->b(ILa/fet;La/mm40;)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 868
    .line 869
    .line 870
    goto/16 :goto_13

    .line 871
    .line 872
    :cond_1a
    sget-object v1, La/fje;->a:La/fje;

    .line 873
    .line 874
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v1

    .line 878
    if-eqz v1, :cond_1e

    .line 879
    .line 880
    const v1, -0x5b2c132b

    .line 881
    .line 882
    .line 883
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 884
    .line 885
    .line 886
    const/high16 v1, 0x3f800000    # 1.0f

    .line 887
    .line 888
    invoke-static {v8, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    const-string v2, "BET_DETAILS_LAZY_ROW_TAG"

    .line 893
    .line 894
    invoke-static {v1, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 895
    .line 896
    .line 897
    move-result-object v31

    .line 898
    const v1, 0x4761d6ec

    .line 899
    .line 900
    .line 901
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 902
    .line 903
    .line 904
    sget-object v1, La/qmk;->a:La/zcl;

    .line 905
    .line 906
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    iget v1, v1, La/wfn;->d:F

    .line 911
    .line 912
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    iget v2, v2, La/wfn;->d:F

    .line 917
    .line 918
    new-instance v4, La/lh80;

    .line 919
    .line 920
    const/high16 v5, 0x41400000    # 12.0f

    .line 921
    .line 922
    const/high16 v6, 0x42000000    # 32.0f

    .line 923
    .line 924
    invoke-direct {v4, v1, v5, v2, v6}, La/lh80;-><init>(FFFF)V

    .line 925
    .line 926
    .line 927
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    check-cast v1, La/l7m0;

    .line 932
    .line 933
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    check-cast v1, Ljava/util/Collection;

    .line 938
    .line 939
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 940
    .line 941
    .line 942
    move-result v1

    .line 943
    if-nez v1, :cond_1b

    .line 944
    .line 945
    const v1, 0x633bf1a1

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 949
    .line 950
    .line 951
    const/4 v9, 0x0

    .line 952
    :goto_11
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 953
    .line 954
    .line 955
    move-object/from16 v33, v4

    .line 956
    .line 957
    goto :goto_12

    .line 958
    :cond_1b
    const/4 v9, 0x0

    .line 959
    const v1, 0x633d548e

    .line 960
    .line 961
    .line 962
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 963
    .line 964
    .line 965
    invoke-static {v4, v0}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 966
    .line 967
    .line 968
    move-result-object v4

    .line 969
    goto :goto_11

    .line 970
    :goto_12
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 971
    .line 972
    .line 973
    new-instance v1, La/qw3;

    .line 974
    .line 975
    new-instance v2, La/jf4;

    .line 976
    .line 977
    const/16 v4, 0xe

    .line 978
    .line 979
    invoke-direct {v2, v4}, La/jf4;-><init>(B)V

    .line 980
    .line 981
    .line 982
    const/high16 v4, 0x41000000    # 8.0f

    .line 983
    .line 984
    const/4 v7, 0x1

    .line 985
    invoke-direct {v1, v4, v7, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v0, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v4

    .line 996
    or-int/2addr v2, v4

    .line 997
    invoke-virtual {v0, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v4

    .line 1001
    or-int/2addr v2, v4

    .line 1002
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v4

    .line 1006
    if-nez v2, :cond_1c

    .line 1007
    .line 1008
    if-ne v4, v10, :cond_1d

    .line 1009
    .line 1010
    :cond_1c
    new-instance v4, La/k9v;

    .line 1011
    .line 1012
    const/4 v2, 0x6

    .line 1013
    invoke-direct {v4, v11, v3, v12, v2}, La/k9v;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;B)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1017
    .line 1018
    .line 1019
    :cond_1d
    move-object/from16 v39, v4

    .line 1020
    .line 1021
    check-cast v39, Lkotlin/jvm/functions/Function1;

    .line 1022
    .line 1023
    const/16 v41, 0x6

    .line 1024
    .line 1025
    const/16 v42, 0x1e8

    .line 1026
    .line 1027
    const/16 v35, 0x0

    .line 1028
    .line 1029
    const/16 v36, 0x0

    .line 1030
    .line 1031
    const/16 v37, 0x0

    .line 1032
    .line 1033
    const/16 v38, 0x0

    .line 1034
    .line 1035
    move-object/from16 v40, v0

    .line 1036
    .line 1037
    move-object/from16 v34, v1

    .line 1038
    .line 1039
    invoke-static/range {v31 .. v42}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1040
    .line 1041
    .line 1042
    const/4 v9, 0x0

    .line 1043
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_13

    .line 1047
    :cond_1e
    const/4 v9, 0x0

    .line 1048
    const v1, 0x47613bbc

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v1, v0, v9}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    throw v0

    .line 1056
    :cond_1f
    move-object v0, v1

    .line 1057
    invoke-virtual {v0}, La/fet;->X()V

    .line 1058
    .line 1059
    .line 1060
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1061
    .line 1062
    return-object v0

    .line 1063
    :pswitch_2
    move-object v2, v3

    .line 1064
    check-cast v2, Ljava/util/Set;

    .line 1065
    .line 1066
    move-object v4, v11

    .line 1067
    check-cast v4, Ljava/util/Set;

    .line 1068
    .line 1069
    check-cast v12, La/pz40;

    .line 1070
    .line 1071
    move-object v7, v5

    .line 1072
    check-cast v7, Ljava/util/List;

    .line 1073
    .line 1074
    check-cast v15, La/ob50;

    .line 1075
    .line 1076
    move-object/from16 v8, p2

    .line 1077
    .line 1078
    check-cast v8, La/fet;

    .line 1079
    .line 1080
    move-object/from16 v1, p3

    .line 1081
    .line 1082
    check-cast v1, Ljava/lang/Integer;

    .line 1083
    .line 1084
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    and-int/lit8 v3, v1, 0x11

    .line 1089
    .line 1090
    const/16 v5, 0x10

    .line 1091
    .line 1092
    if-eq v3, v5, :cond_20

    .line 1093
    .line 1094
    const/4 v3, 0x1

    .line 1095
    :goto_14
    const/16 v19, 0x1

    .line 1096
    .line 1097
    goto :goto_15

    .line 1098
    :cond_20
    const/4 v3, 0x0

    .line 1099
    goto :goto_14

    .line 1100
    :goto_15
    and-int/lit8 v1, v1, 0x1

    .line 1101
    .line 1102
    invoke-virtual {v8, v1, v3}, La/fet;->U(IZ)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v1

    .line 1106
    if-eqz v1, :cond_27

    .line 1107
    .line 1108
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v1

    .line 1112
    iget-object v3, v0, La/s49;->c:Ljava/lang/Object;

    .line 1113
    .line 1114
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v0

    .line 1118
    or-int/2addr v0, v1

    .line 1119
    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v1

    .line 1123
    or-int/2addr v0, v1

    .line 1124
    invoke-virtual {v8, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v1

    .line 1128
    or-int/2addr v0, v1

    .line 1129
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    if-nez v0, :cond_21

    .line 1134
    .line 1135
    if-ne v1, v10, :cond_22

    .line 1136
    .line 1137
    :cond_21
    new-instance v1, La/dc0;

    .line 1138
    .line 1139
    const/16 v6, 0x1a

    .line 1140
    .line 1141
    move-object v5, v12

    .line 1142
    invoke-direct/range {v1 .. v6}, La/dc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1146
    .line 1147
    .line 1148
    :cond_22
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1149
    .line 1150
    invoke-static {v3, v1, v8}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 1151
    .line 1152
    .line 1153
    const v0, 0x156519fd

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 1157
    .line 1158
    .line 1159
    instance-of v0, v7, Ljava/util/RandomAccess;

    .line 1160
    .line 1161
    if-eqz v0, :cond_24

    .line 1162
    .line 1163
    new-instance v0, La/iz40;

    .line 1164
    .line 1165
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1166
    .line 1167
    .line 1168
    move-result v1

    .line 1169
    invoke-direct {v0, v1}, La/iz40;-><init>(I)V

    .line 1170
    .line 1171
    .line 1172
    new-instance v1, Ljava/util/ArrayList;

    .line 1173
    .line 1174
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1175
    .line 1176
    .line 1177
    move-result v2

    .line 1178
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1179
    .line 1180
    .line 1181
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 1182
    .line 1183
    .line 1184
    move-result v2

    .line 1185
    const/4 v3, 0x0

    .line 1186
    :goto_16
    if-ge v3, v2, :cond_25

    .line 1187
    .line 1188
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v4

    .line 1192
    invoke-virtual {v0, v4}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v5

    .line 1196
    if-eqz v5, :cond_23

    .line 1197
    .line 1198
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1199
    .line 1200
    .line 1201
    :cond_23
    add-int/lit8 v3, v3, 0x1

    .line 1202
    .line 1203
    goto :goto_16

    .line 1204
    :cond_24
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    :cond_25
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1209
    .line 1210
    .line 1211
    move-result v0

    .line 1212
    if-nez v0, :cond_26

    .line 1213
    .line 1214
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1215
    .line 1216
    .line 1217
    move-result v0

    .line 1218
    invoke-interface {v1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    :goto_17
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1223
    .line 1224
    .line 1225
    move-result v1

    .line 1226
    if-eqz v1, :cond_26

    .line 1227
    .line 1228
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    check-cast v1, La/pb50;

    .line 1233
    .line 1234
    new-instance v2, La/ob50;

    .line 1235
    .line 1236
    new-instance v3, La/rgh;

    .line 1237
    .line 1238
    const/4 v4, 0x6

    .line 1239
    invoke-direct {v3, v1, v15, v4}, La/rgh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1240
    .line 1241
    .line 1242
    const v1, -0x13b7f6f4

    .line 1243
    .line 1244
    .line 1245
    invoke-static {v1, v3, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v1

    .line 1249
    invoke-direct {v2, v15, v1}, La/ob50;-><init>(La/ob50;La/ugd;)V

    .line 1250
    .line 1251
    .line 1252
    move-object v15, v2

    .line 1253
    goto :goto_17

    .line 1254
    :cond_26
    const/4 v9, 0x0

    .line 1255
    invoke-virtual {v8, v9}, La/fet;->r(Z)V

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v15, v9, v8}, La/ob50;->a(ILa/fet;)V

    .line 1259
    .line 1260
    .line 1261
    goto :goto_18

    .line 1262
    :cond_27
    invoke-virtual {v8}, La/fet;->X()V

    .line 1263
    .line 1264
    .line 1265
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1266
    .line 1267
    return-object v0

    .line 1268
    :pswitch_3
    const/4 v6, 0x4

    .line 1269
    check-cast v3, La/l7m0;

    .line 1270
    .line 1271
    check-cast v13, La/l7m0;

    .line 1272
    .line 1273
    check-cast v11, La/f3d;

    .line 1274
    .line 1275
    check-cast v12, La/l7m0;

    .line 1276
    .line 1277
    check-cast v5, La/y82;

    .line 1278
    .line 1279
    check-cast v15, La/qno0;

    .line 1280
    .line 1281
    move-object/from16 v0, p1

    .line 1282
    .line 1283
    check-cast v0, La/mm40;

    .line 1284
    .line 1285
    move-object/from16 v1, p2

    .line 1286
    .line 1287
    check-cast v1, La/fet;

    .line 1288
    .line 1289
    move-object/from16 v2, p3

    .line 1290
    .line 1291
    check-cast v2, Ljava/lang/Integer;

    .line 1292
    .line 1293
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1294
    .line 1295
    .line 1296
    move-result v2

    .line 1297
    sget-object v4, La/y82;->V1:La/qek0;

    .line 1298
    .line 1299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    and-int/lit8 v4, v2, 0x6

    .line 1303
    .line 1304
    if-nez v4, :cond_29

    .line 1305
    .line 1306
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1307
    .line 1308
    .line 1309
    move-result v4

    .line 1310
    if-eqz v4, :cond_28

    .line 1311
    .line 1312
    goto :goto_19

    .line 1313
    :cond_28
    move v6, v14

    .line 1314
    :goto_19
    or-int/2addr v2, v6

    .line 1315
    :cond_29
    and-int/lit8 v4, v2, 0x13

    .line 1316
    .line 1317
    if-eq v4, v9, :cond_2a

    .line 1318
    .line 1319
    const/4 v4, 0x1

    .line 1320
    :goto_1a
    const/16 v19, 0x1

    .line 1321
    .line 1322
    goto :goto_1b

    .line 1323
    :cond_2a
    const/4 v4, 0x0

    .line 1324
    goto :goto_1a

    .line 1325
    :goto_1b
    and-int/lit8 v2, v2, 0x1

    .line 1326
    .line 1327
    invoke-virtual {v1, v2, v4}, La/fet;->U(IZ)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v2

    .line 1331
    if-eqz v2, :cond_31

    .line 1332
    .line 1333
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v2

    .line 1337
    check-cast v2, La/q4i0;

    .line 1338
    .line 1339
    iget-object v3, v2, La/q4i0;->b:Ljava/util/ArrayList;

    .line 1340
    .line 1341
    iget v4, v2, La/q4i0;->a:I

    .line 1342
    .line 1343
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v6

    .line 1347
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v7

    .line 1351
    if-nez v6, :cond_2c

    .line 1352
    .line 1353
    if-ne v7, v10, :cond_2b

    .line 1354
    .line 1355
    goto :goto_1c

    .line 1356
    :cond_2b
    const/4 v9, 0x0

    .line 1357
    goto :goto_1d

    .line 1358
    :cond_2c
    :goto_1c
    new-instance v7, La/l82;

    .line 1359
    .line 1360
    const/4 v9, 0x0

    .line 1361
    invoke-direct {v7, v3, v9}, La/l82;-><init>(Ljava/util/ArrayList;B)V

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1365
    .line 1366
    .line 1367
    :goto_1d
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 1368
    .line 1369
    invoke-static {v4, v7, v1, v9, v14}, La/zk80;->b(ILkotlin/jvm/functions/Function0;La/fet;II)La/kwj;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v6

    .line 1373
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v4

    .line 1377
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v7

    .line 1381
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1382
    .line 1383
    .line 1384
    move-result v8

    .line 1385
    or-int/2addr v7, v8

    .line 1386
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v8

    .line 1390
    if-nez v7, :cond_2d

    .line 1391
    .line 1392
    if-ne v8, v10, :cond_2e

    .line 1393
    .line 1394
    :cond_2d
    new-instance v8, La/y32;

    .line 1395
    .line 1396
    const/4 v7, 0x0

    .line 1397
    invoke-direct {v8, v6, v2, v7, v14}, La/y32;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1401
    .line 1402
    .line 1403
    :cond_2e
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 1404
    .line 1405
    invoke-static {v1, v4, v8}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1406
    .line 1407
    .line 1408
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1409
    .line 1410
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1415
    .line 1416
    .line 1417
    move-result v2

    .line 1418
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v4

    .line 1422
    if-nez v2, :cond_2f

    .line 1423
    .line 1424
    if-ne v4, v10, :cond_30

    .line 1425
    .line 1426
    :cond_2f
    new-instance v4, La/yd1;

    .line 1427
    .line 1428
    const/16 v2, 0xe

    .line 1429
    .line 1430
    invoke-direct {v4, v13, v2}, La/yd1;-><init>(La/l7m0;B)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1434
    .line 1435
    .line 1436
    :cond_30
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 1437
    .line 1438
    invoke-static {v0, v4}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 1443
    .line 1444
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v2

    .line 1448
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1449
    .line 1450
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 1451
    .line 1452
    .line 1453
    move-result-wide v7

    .line 1454
    sget-object v2, La/jd8;->n:La/ljc;

    .line 1455
    .line 1456
    invoke-static {v0, v7, v8, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v2

    .line 1464
    check-cast v2, Ljava/lang/Boolean;

    .line 1465
    .line 1466
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1467
    .line 1468
    .line 1469
    move-result v2

    .line 1470
    iget-object v4, v11, La/f3d;->g:La/a8z;

    .line 1471
    .line 1472
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v4

    .line 1476
    check-cast v4, La/vj50;

    .line 1477
    .line 1478
    invoke-static {v0, v2, v4}, La/fww;->z(La/mm40;ZLa/vj50;)La/mm40;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v32

    .line 1482
    new-instance v0, La/n82;

    .line 1483
    .line 1484
    const/4 v9, 0x0

    .line 1485
    invoke-direct {v0, v5, v3, v15, v9}, La/n82;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1486
    .line 1487
    .line 1488
    const v2, -0x2399d003

    .line 1489
    .line 1490
    .line 1491
    invoke-static {v2, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v44

    .line 1495
    const/16 v47, 0x6000

    .line 1496
    .line 1497
    const/16 v48, 0x3eec

    .line 1498
    .line 1499
    const/16 v33, 0x0

    .line 1500
    .line 1501
    const/16 v34, 0x0

    .line 1502
    .line 1503
    const/16 v35, 0x0

    .line 1504
    .line 1505
    const/16 v36, 0x0

    .line 1506
    .line 1507
    const/16 v37, 0x0

    .line 1508
    .line 1509
    const/16 v38, 0x0

    .line 1510
    .line 1511
    const/16 v39, 0x0

    .line 1512
    .line 1513
    const/16 v40, 0x0

    .line 1514
    .line 1515
    const/16 v41, 0x0

    .line 1516
    .line 1517
    const/16 v42, 0x0

    .line 1518
    .line 1519
    const/16 v43, 0x0

    .line 1520
    .line 1521
    const v46, 0x6006000

    .line 1522
    .line 1523
    .line 1524
    move-object/from16 v45, v1

    .line 1525
    .line 1526
    move-object/from16 v31, v6

    .line 1527
    .line 1528
    invoke-static/range {v31 .. v48}, La/q5x;->e(La/xk80;La/mm40;La/hh80;La/yi80;IFLa/yx7;La/afk0;ZLkotlin/jvm/functions/Function1;La/vj50;La/ifk0;La/vf80;La/ugd;La/fet;III)V

    .line 1529
    .line 1530
    .line 1531
    goto :goto_1e

    .line 1532
    :cond_31
    move-object/from16 v45, v1

    .line 1533
    .line 1534
    invoke-virtual/range {v45 .. v45}, La/fet;->X()V

    .line 1535
    .line 1536
    .line 1537
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1538
    .line 1539
    return-object v0

    .line 1540
    :pswitch_4
    const/4 v6, 0x4

    .line 1541
    check-cast v3, La/l7m0;

    .line 1542
    .line 1543
    check-cast v13, La/l7m0;

    .line 1544
    .line 1545
    check-cast v11, La/l7m0;

    .line 1546
    .line 1547
    check-cast v12, La/f3d;

    .line 1548
    .line 1549
    check-cast v5, La/y82;

    .line 1550
    .line 1551
    check-cast v15, La/l7m0;

    .line 1552
    .line 1553
    move-object/from16 v0, p1

    .line 1554
    .line 1555
    check-cast v0, La/mm40;

    .line 1556
    .line 1557
    move-object/from16 v1, p2

    .line 1558
    .line 1559
    check-cast v1, La/fet;

    .line 1560
    .line 1561
    move-object/from16 v2, p3

    .line 1562
    .line 1563
    check-cast v2, Ljava/lang/Integer;

    .line 1564
    .line 1565
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1566
    .line 1567
    .line 1568
    move-result v2

    .line 1569
    sget-object v4, La/y82;->V1:La/qek0;

    .line 1570
    .line 1571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1572
    .line 1573
    .line 1574
    and-int/lit8 v4, v2, 0x6

    .line 1575
    .line 1576
    if-nez v4, :cond_33

    .line 1577
    .line 1578
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v4

    .line 1582
    if-eqz v4, :cond_32

    .line 1583
    .line 1584
    goto :goto_1f

    .line 1585
    :cond_32
    move v6, v14

    .line 1586
    :goto_1f
    or-int/2addr v2, v6

    .line 1587
    :cond_33
    and-int/lit8 v4, v2, 0x13

    .line 1588
    .line 1589
    if-eq v4, v9, :cond_34

    .line 1590
    .line 1591
    const/4 v4, 0x1

    .line 1592
    goto :goto_20

    .line 1593
    :cond_34
    const/4 v4, 0x0

    .line 1594
    :goto_20
    and-int/lit8 v6, v2, 0x1

    .line 1595
    .line 1596
    invoke-virtual {v1, v6, v4}, La/fet;->U(IZ)Z

    .line 1597
    .line 1598
    .line 1599
    move-result v4

    .line 1600
    if-eqz v4, :cond_39

    .line 1601
    .line 1602
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v3

    .line 1606
    move-object/from16 v21, v3

    .line 1607
    .line 1608
    check-cast v21, La/y72;

    .line 1609
    .line 1610
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v3

    .line 1614
    check-cast v3, Ljava/lang/Boolean;

    .line 1615
    .line 1616
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1617
    .line 1618
    .line 1619
    move-result v22

    .line 1620
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v3

    .line 1624
    check-cast v3, Ljava/lang/Boolean;

    .line 1625
    .line 1626
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1627
    .line 1628
    .line 1629
    move-result v23

    .line 1630
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v3

    .line 1634
    check-cast v3, Ljava/lang/Boolean;

    .line 1635
    .line 1636
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1637
    .line 1638
    .line 1639
    move-result v24

    .line 1640
    iget-object v3, v12, La/f3d;->h:La/a8z;

    .line 1641
    .line 1642
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v3

    .line 1646
    move-object/from16 v25, v3

    .line 1647
    .line 1648
    check-cast v25, La/vj50;

    .line 1649
    .line 1650
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1651
    .line 1652
    .line 1653
    move-result v3

    .line 1654
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v4

    .line 1658
    if-nez v3, :cond_35

    .line 1659
    .line 1660
    if-ne v4, v10, :cond_36

    .line 1661
    .line 1662
    :cond_35
    new-instance v4, La/m82;

    .line 1663
    .line 1664
    invoke-direct {v4, v5, v14}, La/m82;-><init>(La/y82;B)V

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1668
    .line 1669
    .line 1670
    :cond_36
    move-object/from16 v26, v4

    .line 1671
    .line 1672
    check-cast v26, Lkotlin/jvm/functions/Function0;

    .line 1673
    .line 1674
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1675
    .line 1676
    .line 1677
    move-result v3

    .line 1678
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v4

    .line 1682
    if-nez v3, :cond_37

    .line 1683
    .line 1684
    if-ne v4, v10, :cond_38

    .line 1685
    .line 1686
    :cond_37
    new-instance v4, La/j82;

    .line 1687
    .line 1688
    const/4 v7, 0x1

    .line 1689
    invoke-direct {v4, v5, v7}, La/j82;-><init>(La/y82;B)V

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1693
    .line 1694
    .line 1695
    :cond_38
    move-object/from16 v27, v4

    .line 1696
    .line 1697
    check-cast v27, Lkotlin/jvm/functions/Function2;

    .line 1698
    .line 1699
    const/16 v18, 0xe

    .line 1700
    .line 1701
    and-int/lit8 v29, v2, 0xe

    .line 1702
    .line 1703
    move-object/from16 v20, v0

    .line 1704
    .line 1705
    move-object/from16 v28, v1

    .line 1706
    .line 1707
    invoke-static/range {v20 .. v29}, La/y0x0;->c(La/mm40;La/y72;ZZZLa/vj50;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 1708
    .line 1709
    .line 1710
    goto :goto_21

    .line 1711
    :cond_39
    move-object/from16 v28, v1

    .line 1712
    .line 1713
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 1714
    .line 1715
    .line 1716
    :goto_21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1717
    .line 1718
    return-object v0

    .line 1719
    :pswitch_5
    const/4 v6, 0x4

    .line 1720
    move-object/from16 v22, v13

    .line 1721
    .line 1722
    check-cast v22, La/pl7;

    .line 1723
    .line 1724
    move-object/from16 v34, v11

    .line 1725
    .line 1726
    check-cast v34, La/wom;

    .line 1727
    .line 1728
    move-object/from16 v35, v12

    .line 1729
    .line 1730
    check-cast v35, La/w2d;

    .line 1731
    .line 1732
    move-object/from16 v37, v3

    .line 1733
    .line 1734
    check-cast v37, Lkotlin/jvm/functions/Function0;

    .line 1735
    .line 1736
    move-object/from16 v23, v5

    .line 1737
    .line 1738
    check-cast v23, La/xcz;

    .line 1739
    .line 1740
    move-object/from16 v24, v15

    .line 1741
    .line 1742
    check-cast v24, Lkotlin/jvm/functions/Function1;

    .line 1743
    .line 1744
    move-object/from16 v0, p1

    .line 1745
    .line 1746
    check-cast v0, La/hh80;

    .line 1747
    .line 1748
    move-object/from16 v1, p2

    .line 1749
    .line 1750
    check-cast v1, La/fet;

    .line 1751
    .line 1752
    move-object/from16 v3, p3

    .line 1753
    .line 1754
    check-cast v3, Ljava/lang/Integer;

    .line 1755
    .line 1756
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1757
    .line 1758
    .line 1759
    move-result v3

    .line 1760
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1761
    .line 1762
    .line 1763
    and-int/lit8 v4, v3, 0x6

    .line 1764
    .line 1765
    if-nez v4, :cond_3b

    .line 1766
    .line 1767
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1768
    .line 1769
    .line 1770
    move-result v4

    .line 1771
    if-eqz v4, :cond_3a

    .line 1772
    .line 1773
    move v11, v6

    .line 1774
    goto :goto_22

    .line 1775
    :cond_3a
    move v11, v14

    .line 1776
    :goto_22
    or-int/2addr v3, v11

    .line 1777
    :cond_3b
    and-int/lit8 v4, v3, 0x13

    .line 1778
    .line 1779
    if-eq v4, v9, :cond_3c

    .line 1780
    .line 1781
    const/4 v4, 0x1

    .line 1782
    :goto_23
    const/16 v19, 0x1

    .line 1783
    .line 1784
    goto :goto_24

    .line 1785
    :cond_3c
    const/4 v4, 0x0

    .line 1786
    goto :goto_23

    .line 1787
    :goto_24
    and-int/lit8 v3, v3, 0x1

    .line 1788
    .line 1789
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 1790
    .line 1791
    .line 1792
    move-result v3

    .line 1793
    if-eqz v3, :cond_40

    .line 1794
    .line 1795
    invoke-interface/range {v22 .. v22}, La/pl7;->d()Z

    .line 1796
    .line 1797
    .line 1798
    move-result v32

    .line 1799
    invoke-interface/range {v22 .. v22}, La/pl7;->d()Z

    .line 1800
    .line 1801
    .line 1802
    move-result v3

    .line 1803
    xor-int/lit8 v33, v3, 0x1

    .line 1804
    .line 1805
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 1806
    .line 1807
    invoke-static {v3, v0}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    const-string v4, "PULL_TO_REFRESH_HISTORY_BOX"

    .line 1812
    .line 1813
    invoke-static {v0, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v31

    .line 1817
    new-instance v21, La/x2g;

    .line 1818
    .line 1819
    const/16 v26, 0x19

    .line 1820
    .line 1821
    move-object/from16 v25, v37

    .line 1822
    .line 1823
    invoke-direct/range {v21 .. v26}, La/x2g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1824
    .line 1825
    .line 1826
    move-object/from16 v0, v21

    .line 1827
    .line 1828
    const v4, 0x2cc14d71

    .line 1829
    .line 1830
    .line 1831
    invoke-static {v4, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v39

    .line 1835
    const v41, 0x6008000

    .line 1836
    .line 1837
    .line 1838
    const/16 v36, 0x0

    .line 1839
    .line 1840
    const/16 v38, 0x0

    .line 1841
    .line 1842
    move-object/from16 v40, v1

    .line 1843
    .line 1844
    invoke-static/range {v31 .. v41}, La/bdx;->B(La/mm40;ZZLa/wom;La/w2d;La/u12;Lkotlin/jvm/functions/Function0;La/ydr;La/ugd;La/fet;I)V

    .line 1845
    .line 1846
    .line 1847
    move-object/from16 v0, v40

    .line 1848
    .line 1849
    invoke-interface/range {v22 .. v22}, La/pl7;->c()Z

    .line 1850
    .line 1851
    .line 1852
    move-result v1

    .line 1853
    if-eqz v1, :cond_3f

    .line 1854
    .line 1855
    const v1, -0x51b15a14

    .line 1856
    .line 1857
    .line 1858
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 1859
    .line 1860
    .line 1861
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v1

    .line 1865
    if-ne v1, v10, :cond_3d

    .line 1866
    .line 1867
    new-instance v1, La/th50;

    .line 1868
    .line 1869
    const/16 v5, 0x10

    .line 1870
    .line 1871
    invoke-direct {v1, v5}, La/th50;-><init>(B)V

    .line 1872
    .line 1873
    .line 1874
    invoke-virtual {v0, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1875
    .line 1876
    .line 1877
    :cond_3d
    move-object/from16 v42, v1

    .line 1878
    .line 1879
    check-cast v42, Lkotlin/jvm/functions/Function0;

    .line 1880
    .line 1881
    const/16 v43, 0xe

    .line 1882
    .line 1883
    const/16 v39, 0x0

    .line 1884
    .line 1885
    const/16 v40, 0x0

    .line 1886
    .line 1887
    const/16 v41, 0x0

    .line 1888
    .line 1889
    move-object/from16 v38, v3

    .line 1890
    .line 1891
    invoke-static/range {v38 .. v43}, La/y860;->Y(La/mm40;ZLjava/lang/String;La/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v1

    .line 1895
    sget-object v3, La/m8m0;->a:La/zfn;

    .line 1896
    .line 1897
    invoke-virtual {v0, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v4

    .line 1901
    check-cast v4, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1902
    .line 1903
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getOverlayBackground40-0d7_KjU()J

    .line 1904
    .line 1905
    .line 1906
    move-result-wide v4

    .line 1907
    sget-object v6, La/jd8;->n:La/ljc;

    .line 1908
    .line 1909
    invoke-static {v1, v4, v5, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v1

    .line 1913
    sget-object v4, La/gqw0;->a:La/zx7;

    .line 1914
    .line 1915
    const/4 v9, 0x0

    .line 1916
    invoke-static {v4, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v4

    .line 1920
    iget-wide v5, v0, La/fet;->T:J

    .line 1921
    .line 1922
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 1923
    .line 1924
    .line 1925
    move-result v5

    .line 1926
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v6

    .line 1930
    invoke-static {v0, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v1

    .line 1934
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 1935
    .line 1936
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1937
    .line 1938
    .line 1939
    invoke-virtual {v0}, La/fet;->i0()V

    .line 1940
    .line 1941
    .line 1942
    iget-boolean v9, v0, La/fet;->S:Z

    .line 1943
    .line 1944
    if-eqz v9, :cond_3e

    .line 1945
    .line 1946
    invoke-virtual {v0, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1947
    .line 1948
    .line 1949
    goto :goto_25

    .line 1950
    :cond_3e
    invoke-virtual {v0}, La/fet;->r0()V

    .line 1951
    .line 1952
    .line 1953
    :goto_25
    sget-object v7, La/gqw0;->x:La/shd;

    .line 1954
    .line 1955
    invoke-static {v0, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1956
    .line 1957
    .line 1958
    sget-object v4, La/gqw0;->w:La/shd;

    .line 1959
    .line 1960
    invoke-static {v0, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1961
    .line 1962
    .line 1963
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v4

    .line 1967
    sget-object v5, La/gqw0;->y:La/shd;

    .line 1968
    .line 1969
    invoke-static {v0, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1970
    .line 1971
    .line 1972
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 1973
    .line 1974
    .line 1975
    sget-object v4, La/gqw0;->v:La/shd;

    .line 1976
    .line 1977
    invoke-static {v0, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1978
    .line 1979
    .line 1980
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 1981
    .line 1982
    invoke-virtual {v2, v8, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v1

    .line 1986
    new-instance v2, La/dkm;

    .line 1987
    .line 1988
    invoke-virtual {v0, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v3

    .line 1992
    check-cast v3, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1993
    .line 1994
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 1995
    .line 1996
    .line 1997
    move-result-wide v3

    .line 1998
    new-instance v5, La/y3d;

    .line 1999
    .line 2000
    invoke-direct {v5, v3, v4}, La/y3d;-><init>(J)V

    .line 2001
    .line 2002
    .line 2003
    const/4 v3, 0x3

    .line 2004
    const/4 v7, 0x0

    .line 2005
    invoke-direct {v2, v7, v5, v3}, La/dkm;-><init>(La/ycl;La/y3d;I)V

    .line 2006
    .line 2007
    .line 2008
    const/4 v9, 0x0

    .line 2009
    invoke-static {v1, v2, v0, v9, v9}, La/kpb;->j(La/mm40;La/dkm;La/fet;II)V

    .line 2010
    .line 2011
    .line 2012
    const/4 v7, 0x1

    .line 2013
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 2014
    .line 2015
    .line 2016
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 2017
    .line 2018
    .line 2019
    goto :goto_26

    .line 2020
    :cond_3f
    const/4 v9, 0x0

    .line 2021
    const v1, -0x51aa5b77

    .line 2022
    .line 2023
    .line 2024
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 2025
    .line 2026
    .line 2027
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 2028
    .line 2029
    .line 2030
    goto :goto_26

    .line 2031
    :cond_40
    move-object v0, v1

    .line 2032
    invoke-virtual {v0}, La/fet;->X()V

    .line 2033
    .line 2034
    .line 2035
    :goto_26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2036
    .line 2037
    return-object v0

    .line 2038
    :pswitch_6
    check-cast v15, La/v3w0;

    .line 2039
    .line 2040
    move-object/from16 v35, v3

    .line 2041
    .line 2042
    check-cast v35, Lkotlin/jvm/functions/Function0;

    .line 2043
    .line 2044
    move-object/from16 v36, v13

    .line 2045
    .line 2046
    check-cast v36, Lkotlin/jvm/functions/Function0;

    .line 2047
    .line 2048
    move-object/from16 v37, v11

    .line 2049
    .line 2050
    check-cast v37, Lkotlin/jvm/functions/Function0;

    .line 2051
    .line 2052
    move-object/from16 v38, v12

    .line 2053
    .line 2054
    check-cast v38, Lkotlin/jvm/functions/Function0;

    .line 2055
    .line 2056
    move-object/from16 v39, v5

    .line 2057
    .line 2058
    check-cast v39, Lkotlin/jvm/functions/Function0;

    .line 2059
    .line 2060
    move-object/from16 v0, p1

    .line 2061
    .line 2062
    check-cast v0, La/u63;

    .line 2063
    .line 2064
    move-object/from16 v1, p2

    .line 2065
    .line 2066
    check-cast v1, La/fet;

    .line 2067
    .line 2068
    move-object/from16 v3, p3

    .line 2069
    .line 2070
    check-cast v3, Ljava/lang/Integer;

    .line 2071
    .line 2072
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2073
    .line 2074
    .line 2075
    move-result v3

    .line 2076
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2077
    .line 2078
    .line 2079
    and-int/lit8 v0, v3, 0x11

    .line 2080
    .line 2081
    const/16 v5, 0x10

    .line 2082
    .line 2083
    if-eq v0, v5, :cond_41

    .line 2084
    .line 2085
    const/4 v0, 0x1

    .line 2086
    :goto_27
    const/16 v19, 0x1

    .line 2087
    .line 2088
    goto :goto_28

    .line 2089
    :cond_41
    const/4 v0, 0x0

    .line 2090
    goto :goto_27

    .line 2091
    :goto_28
    and-int/lit8 v3, v3, 0x1

    .line 2092
    .line 2093
    invoke-virtual {v1, v3, v0}, La/fet;->U(IZ)Z

    .line 2094
    .line 2095
    .line 2096
    move-result v0

    .line 2097
    if-eqz v0, :cond_43

    .line 2098
    .line 2099
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 2100
    .line 2101
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 2102
    .line 2103
    const/4 v9, 0x0

    .line 2104
    invoke-static {v3, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v3

    .line 2108
    iget-wide v4, v1, La/fet;->T:J

    .line 2109
    .line 2110
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 2111
    .line 2112
    .line 2113
    move-result v4

    .line 2114
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v5

    .line 2118
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v0

    .line 2122
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 2123
    .line 2124
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2125
    .line 2126
    .line 2127
    invoke-virtual {v1}, La/fet;->i0()V

    .line 2128
    .line 2129
    .line 2130
    iget-boolean v6, v1, La/fet;->S:Z

    .line 2131
    .line 2132
    if-eqz v6, :cond_42

    .line 2133
    .line 2134
    invoke-virtual {v1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 2135
    .line 2136
    .line 2137
    goto :goto_29

    .line 2138
    :cond_42
    invoke-virtual {v1}, La/fet;->r0()V

    .line 2139
    .line 2140
    .line 2141
    :goto_29
    sget-object v6, La/gqw0;->x:La/shd;

    .line 2142
    .line 2143
    invoke-static {v1, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2144
    .line 2145
    .line 2146
    sget-object v3, La/gqw0;->w:La/shd;

    .line 2147
    .line 2148
    invoke-static {v1, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2149
    .line 2150
    .line 2151
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v3

    .line 2155
    sget-object v4, La/gqw0;->y:La/shd;

    .line 2156
    .line 2157
    invoke-static {v1, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2158
    .line 2159
    .line 2160
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 2161
    .line 2162
    .line 2163
    sget-object v3, La/gqw0;->v:La/shd;

    .line 2164
    .line 2165
    invoke-static {v1, v0, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2166
    .line 2167
    .line 2168
    iget-boolean v0, v15, La/v3w0;->b:Z

    .line 2169
    .line 2170
    iget-object v3, v15, La/v3w0;->c:La/w3w0;

    .line 2171
    .line 2172
    iget-boolean v4, v15, La/v3w0;->d:Z

    .line 2173
    .line 2174
    sget-object v5, La/gqw0;->h:La/zx7;

    .line 2175
    .line 2176
    invoke-virtual {v2, v8, v5}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v31

    .line 2180
    const/16 v41, 0x0

    .line 2181
    .line 2182
    move/from16 v32, v0

    .line 2183
    .line 2184
    move-object/from16 v40, v1

    .line 2185
    .line 2186
    move-object/from16 v33, v3

    .line 2187
    .line 2188
    move/from16 v34, v4

    .line 2189
    .line 2190
    invoke-static/range {v31 .. v41}, La/rq8;->g(La/mm40;ZLa/w3w0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 2191
    .line 2192
    .line 2193
    move-object/from16 v0, v40

    .line 2194
    .line 2195
    const/4 v7, 0x1

    .line 2196
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 2197
    .line 2198
    .line 2199
    goto :goto_2a

    .line 2200
    :cond_43
    move-object v0, v1

    .line 2201
    invoke-virtual {v0}, La/fet;->X()V

    .line 2202
    .line 2203
    .line 2204
    :goto_2a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2205
    .line 2206
    return-object v0

    .line 2207
    :pswitch_7
    move-object v9, v3

    .line 2208
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 2209
    .line 2210
    move-object v0, v15

    .line 2211
    check-cast v0, La/eke;

    .line 2212
    .line 2213
    move-object/from16 v22, v13

    .line 2214
    .line 2215
    check-cast v22, Lkotlin/jvm/functions/Function0;

    .line 2216
    .line 2217
    move-object/from16 v23, v11

    .line 2218
    .line 2219
    check-cast v23, Lkotlin/jvm/functions/Function0;

    .line 2220
    .line 2221
    move-object/from16 v24, v12

    .line 2222
    .line 2223
    check-cast v24, Lkotlin/jvm/functions/Function0;

    .line 2224
    .line 2225
    move-object/from16 v25, v5

    .line 2226
    .line 2227
    check-cast v25, Lkotlin/jvm/functions/Function0;

    .line 2228
    .line 2229
    move-object/from16 v1, p1

    .line 2230
    .line 2231
    check-cast v1, La/u63;

    .line 2232
    .line 2233
    move-object/from16 v15, p2

    .line 2234
    .line 2235
    check-cast v15, La/fet;

    .line 2236
    .line 2237
    move-object/from16 v3, p3

    .line 2238
    .line 2239
    check-cast v3, Ljava/lang/Integer;

    .line 2240
    .line 2241
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2242
    .line 2243
    .line 2244
    move-result v3

    .line 2245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2246
    .line 2247
    .line 2248
    and-int/lit8 v1, v3, 0x11

    .line 2249
    .line 2250
    const/16 v5, 0x10

    .line 2251
    .line 2252
    if-eq v1, v5, :cond_44

    .line 2253
    .line 2254
    const/4 v1, 0x1

    .line 2255
    :goto_2b
    const/16 v19, 0x1

    .line 2256
    .line 2257
    goto :goto_2c

    .line 2258
    :cond_44
    const/4 v1, 0x0

    .line 2259
    goto :goto_2b

    .line 2260
    :goto_2c
    and-int/lit8 v3, v3, 0x1

    .line 2261
    .line 2262
    invoke-virtual {v15, v3, v1}, La/fet;->U(IZ)Z

    .line 2263
    .line 2264
    .line 2265
    move-result v1

    .line 2266
    if-eqz v1, :cond_46

    .line 2267
    .line 2268
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 2269
    .line 2270
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 2271
    .line 2272
    const/4 v4, 0x0

    .line 2273
    invoke-static {v3, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v3

    .line 2277
    iget-wide v4, v15, La/fet;->T:J

    .line 2278
    .line 2279
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 2280
    .line 2281
    .line 2282
    move-result v4

    .line 2283
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 2284
    .line 2285
    .line 2286
    move-result-object v5

    .line 2287
    invoke-static {v15, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v1

    .line 2291
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 2292
    .line 2293
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2294
    .line 2295
    .line 2296
    invoke-virtual {v15}, La/fet;->i0()V

    .line 2297
    .line 2298
    .line 2299
    iget-boolean v6, v15, La/fet;->S:Z

    .line 2300
    .line 2301
    if-eqz v6, :cond_45

    .line 2302
    .line 2303
    invoke-virtual {v15, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 2304
    .line 2305
    .line 2306
    goto :goto_2d

    .line 2307
    :cond_45
    invoke-virtual {v15}, La/fet;->r0()V

    .line 2308
    .line 2309
    .line 2310
    :goto_2d
    sget-object v6, La/gqw0;->x:La/shd;

    .line 2311
    .line 2312
    invoke-static {v15, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2313
    .line 2314
    .line 2315
    sget-object v3, La/gqw0;->w:La/shd;

    .line 2316
    .line 2317
    invoke-static {v15, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2318
    .line 2319
    .line 2320
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2321
    .line 2322
    .line 2323
    move-result-object v3

    .line 2324
    sget-object v4, La/gqw0;->y:La/shd;

    .line 2325
    .line 2326
    invoke-static {v15, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2327
    .line 2328
    .line 2329
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 2330
    .line 2331
    .line 2332
    sget-object v3, La/gqw0;->v:La/shd;

    .line 2333
    .line 2334
    invoke-static {v15, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2335
    .line 2336
    .line 2337
    sget-object v1, La/gqw0;->c:La/zx7;

    .line 2338
    .line 2339
    invoke-virtual {v2, v8, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v26

    .line 2343
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2344
    .line 2345
    const/16 v30, 0x0

    .line 2346
    .line 2347
    const/16 v31, 0x9

    .line 2348
    .line 2349
    const/16 v27, 0x0

    .line 2350
    .line 2351
    const/high16 v28, 0x41000000    # 8.0f

    .line 2352
    .line 2353
    const/high16 v29, 0x41800000    # 16.0f

    .line 2354
    .line 2355
    invoke-static/range {v26 .. v31}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v10

    .line 2359
    new-instance v1, La/m87;

    .line 2360
    .line 2361
    const/16 v3, 0x17

    .line 2362
    .line 2363
    invoke-direct {v1, v0, v3}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 2364
    .line 2365
    .line 2366
    const v3, 0x6bbbe1b7

    .line 2367
    .line 2368
    .line 2369
    invoke-static {v3, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v14

    .line 2373
    const/high16 v16, 0x180000

    .line 2374
    .line 2375
    const/16 v17, 0x3c

    .line 2376
    .line 2377
    const/4 v11, 0x0

    .line 2378
    const/4 v12, 0x0

    .line 2379
    const/4 v13, 0x0

    .line 2380
    invoke-static/range {v9 .. v17}, La/zvw;->d(Lkotlin/jvm/functions/Function0;La/mm40;ZLa/wvw;La/yjj0;La/ugd;La/fet;II)V

    .line 2381
    .line 2382
    .line 2383
    move-object/from16 v26, v15

    .line 2384
    .line 2385
    iget-boolean v0, v0, La/eke;->c:Z

    .line 2386
    .line 2387
    sget-object v1, La/gqw0;->h:La/zx7;

    .line 2388
    .line 2389
    invoke-virtual {v2, v8, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v20

    .line 2393
    const/16 v27, 0x0

    .line 2394
    .line 2395
    move/from16 v21, v0

    .line 2396
    .line 2397
    invoke-static/range {v20 .. v27}, La/jd8;->n(La/mm40;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 2398
    .line 2399
    .line 2400
    const/4 v7, 0x1

    .line 2401
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 2402
    .line 2403
    .line 2404
    goto :goto_2e

    .line 2405
    :cond_46
    invoke-virtual {v15}, La/fet;->X()V

    .line 2406
    .line 2407
    .line 2408
    :goto_2e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2409
    .line 2410
    return-object v0

    .line 2411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
