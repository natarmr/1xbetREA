.class public final La/pbp0;
.super La/guy;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/lwf;

.field public final synthetic d:La/nie0;

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:La/l7m0;

.field public final synthetic h:La/l7m0;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/wdr;


# direct methods
.method public constructor <init>(La/pz40;La/lwf;La/nie0;La/edt0;FFLa/l7m0;La/l7m0;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/pbp0;->a:B

    .line 27
    iput-object p1, p0, La/pbp0;->b:La/pz40;

    iput-object p2, p0, La/pbp0;->c:La/lwf;

    iput-object p3, p0, La/pbp0;->d:La/nie0;

    iput-object p4, p0, La/pbp0;->i:Ljava/lang/Object;

    iput p5, p0, La/pbp0;->e:F

    iput p6, p0, La/pbp0;->f:F

    iput-object p7, p0, La/pbp0;->g:La/l7m0;

    iput-object p8, p0, La/pbp0;->h:La/l7m0;

    iput-object p9, p0, La/pbp0;->j:La/wdr;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method

.method public constructor <init>(La/pz40;La/lwf;La/nie0;La/qbp0;FFLkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/pbp0;->a:B

    .line 3
    .line 4
    iput-object p1, p0, La/pbp0;->b:La/pz40;

    .line 5
    .line 6
    iput-object p2, p0, La/pbp0;->c:La/lwf;

    .line 7
    .line 8
    iput-object p3, p0, La/pbp0;->d:La/nie0;

    .line 9
    .line 10
    iput-object p4, p0, La/pbp0;->i:Ljava/lang/Object;

    .line 11
    .line 12
    iput p5, p0, La/pbp0;->e:F

    .line 13
    .line 14
    iput p6, p0, La/pbp0;->f:F

    .line 15
    .line 16
    iput-object p7, p0, La/pbp0;->j:La/wdr;

    .line 17
    .line 18
    iput-object p8, p0, La/pbp0;->g:La/l7m0;

    .line 19
    .line 20
    iput-object p9, p0, La/pbp0;->h:La/l7m0;

    .line 21
    .line 22
    const/4 p1, 0x3

    .line 23
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pbp0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/pbp0;->j:La/wdr;

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 10
    .line 11
    const/high16 v5, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iget v6, v0, La/pbp0;->f:F

    .line 14
    .line 15
    iget v7, v0, La/pbp0;->e:F

    .line 16
    .line 17
    sget-object v8, La/cmd;->b:La/cmd;

    .line 18
    .line 19
    sget-object v9, La/cmd;->a:La/cmd;

    .line 20
    .line 21
    iget-object v10, v0, La/pbp0;->d:La/nie0;

    .line 22
    .line 23
    iget-object v11, v0, La/pbp0;->c:La/lwf;

    .line 24
    .line 25
    iget-object v12, v0, La/pbp0;->b:La/pz40;

    .line 26
    .line 27
    const/4 v13, 0x0

    .line 28
    iget-object v15, v0, La/pbp0;->i:Ljava/lang/Object;

    .line 29
    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    check-cast v1, La/nt40;

    .line 36
    .line 37
    move-object/from16 v1, p2

    .line 38
    .line 39
    check-cast v1, La/fet;

    .line 40
    .line 41
    move-object/from16 v16, p3

    .line 42
    .line 43
    check-cast v16, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    check-cast v15, La/edt0;

    .line 49
    .line 50
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-interface {v12, v14}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v11, v10, La/nie0;->a:Ljava/lang/Object;

    .line 59
    .line 60
    if-ne v11, v9, :cond_0

    .line 61
    .line 62
    iput-object v8, v10, La/nie0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    :cond_0
    const v8, -0x7dc1df14

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v8}, La/fet;->e0(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v15, v7, v6, v1, v13}, La/aad;->c(La/edt0;FFLa/fet;I)V

    .line 71
    .line 72
    .line 73
    sget-object v6, La/jm40;->b:La/jm40;

    .line 74
    .line 75
    invoke-static {v6, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    sget-object v7, La/ft40;->a:La/ft40;

    .line 80
    .line 81
    invoke-static {v5, v7}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    sget-object v7, La/gqw0;->b:La/zx7;

    .line 86
    .line 87
    invoke-static {v7, v13}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget-wide v8, v1, La/fet;->T:J

    .line 92
    .line 93
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-static {v1, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 106
    .line 107
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, La/fet;->i0()V

    .line 111
    .line 112
    .line 113
    iget-boolean v10, v1, La/fet;->S:Z

    .line 114
    .line 115
    if-eqz v10, :cond_1

    .line 116
    .line 117
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 122
    .line 123
    .line 124
    :goto_0
    sget-object v10, La/gqw0;->x:La/shd;

    .line 125
    .line 126
    invoke-static {v1, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    sget-object v7, La/gqw0;->w:La/shd;

    .line 130
    .line 131
    invoke-static {v1, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    sget-object v9, La/gqw0;->y:La/shd;

    .line 139
    .line 140
    invoke-static {v1, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 144
    .line 145
    .line 146
    sget-object v8, La/gqw0;->v:La/shd;

    .line 147
    .line 148
    invoke-static {v1, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    sget-object v5, La/o7k0;->c:La/n0q;

    .line 152
    .line 153
    iget-object v11, v0, La/pbp0;->g:La/l7m0;

    .line 154
    .line 155
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    if-nez v12, :cond_2

    .line 164
    .line 165
    if-ne v13, v3, :cond_3

    .line 166
    .line 167
    :cond_2
    new-instance v13, La/eb3;

    .line 168
    .line 169
    const/16 v3, 0xc

    .line 170
    .line 171
    invoke-direct {v13, v11, v3}, La/eb3;-><init>(La/l7m0;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_3
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 178
    .line 179
    invoke-static {v5, v13}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 184
    .line 185
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 190
    .line 191
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 192
    .line 193
    .line 194
    move-result-wide v12

    .line 195
    sget-object v5, La/jd8;->n:La/ljc;

    .line 196
    .line 197
    invoke-static {v3, v12, v13, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    const/4 v5, 0x0

    .line 202
    invoke-static {v5, v1, v3}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 203
    .line 204
    .line 205
    iget-object v3, v15, La/edt0;->a:Ljava/lang/String;

    .line 206
    .line 207
    move-object/from16 v19, v2

    .line 208
    .line 209
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    iget-object v0, v0, La/pbp0;->h:La/l7m0;

    .line 214
    .line 215
    move-object/from16 v18, v0

    .line 216
    .line 217
    move-object/from16 v20, v1

    .line 218
    .line 219
    move-object/from16 v16, v3

    .line 220
    .line 221
    move-object/from16 v17, v11

    .line 222
    .line 223
    invoke-static/range {v16 .. v21}, La/aad;->t(Ljava/lang/String;La/l7m0;La/l7m0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 224
    .line 225
    .line 226
    move-object/from16 v0, v20

    .line 227
    .line 228
    const/4 v1, 0x1

    .line 229
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    sget-object v1, La/qmk;->a:La/zcl;

    .line 233
    .line 234
    const/high16 v1, 0x43340000    # 180.0f

    .line 235
    .line 236
    invoke-static {v6, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    sget-object v2, La/ft40;->c:La/ft40;

    .line 241
    .line 242
    invoke-static {v1, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    sget-object v2, La/gqw0;->h:La/zx7;

    .line 247
    .line 248
    const/4 v5, 0x0

    .line 249
    invoke-static {v2, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    iget-wide v11, v0, La/fet;->T:J

    .line 254
    .line 255
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-static {v0, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v0}, La/fet;->i0()V

    .line 268
    .line 269
    .line 270
    iget-boolean v11, v0, La/fet;->S:Z

    .line 271
    .line 272
    if-eqz v11, :cond_4

    .line 273
    .line 274
    invoke-virtual {v0, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 275
    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_4
    invoke-virtual {v0}, La/fet;->r0()V

    .line 279
    .line 280
    .line 281
    :goto_1
    invoke-static {v0, v2, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v3, v0, v9, v0}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v0, v1, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    iget v1, v1, La/wfn;->c:F

    .line 298
    .line 299
    invoke-static {v0}, La/xfn;->a(La/fet;)La/wfn;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    iget v2, v2, La/wfn;->c:F

    .line 304
    .line 305
    const/high16 v20, 0x41800000    # 16.0f

    .line 306
    .line 307
    const/16 v21, 0x2

    .line 308
    .line 309
    const/16 v18, 0x0

    .line 310
    .line 311
    move/from16 v17, v1

    .line 312
    .line 313
    move/from16 v19, v2

    .line 314
    .line 315
    move-object/from16 v16, v6

    .line 316
    .line 317
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 318
    .line 319
    .line 320
    move-result-object v16

    .line 321
    iget-object v1, v15, La/edt0;->b:La/hcm;

    .line 322
    .line 323
    const/16 v21, 0xd80

    .line 324
    .line 325
    const/16 v22, 0x10

    .line 326
    .line 327
    const/16 v18, 0x1

    .line 328
    .line 329
    const/16 v19, 0x0

    .line 330
    .line 331
    move-object/from16 v20, v0

    .line 332
    .line 333
    move-object/from16 v17, v1

    .line 334
    .line 335
    invoke-static/range {v16 .. v22}, La/xbc;->m(La/mm40;La/hcm;ZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 336
    .line 337
    .line 338
    const/4 v1, 0x1

    .line 339
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 340
    .line 341
    .line 342
    const/4 v5, 0x0

    .line 343
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 344
    .line 345
    .line 346
    return-object v14

    .line 347
    :pswitch_0
    move-object/from16 v1, p1

    .line 348
    .line 349
    check-cast v1, La/nt40;

    .line 350
    .line 351
    move-object/from16 v1, p2

    .line 352
    .line 353
    check-cast v1, La/fet;

    .line 354
    .line 355
    move-object/from16 v13, p3

    .line 356
    .line 357
    check-cast v13, Ljava/lang/Number;

    .line 358
    .line 359
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 360
    .line 361
    .line 362
    check-cast v15, La/qbp0;

    .line 363
    .line 364
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 365
    .line 366
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    invoke-interface {v12, v13}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    iget-object v11, v10, La/nie0;->a:Ljava/lang/Object;

    .line 375
    .line 376
    if-ne v11, v9, :cond_5

    .line 377
    .line 378
    iput-object v8, v10, La/nie0;->a:Ljava/lang/Object;

    .line 379
    .line 380
    :cond_5
    const v8, 0x516574bf

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1, v8}, La/fet;->e0(I)V

    .line 384
    .line 385
    .line 386
    const/4 v8, 0x0

    .line 387
    invoke-static {v15, v7, v6, v1, v8}, La/rq8;->e(La/qbp0;FFLa/fet;I)V

    .line 388
    .line 389
    .line 390
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    iget v8, v6, La/wfn;->c:F

    .line 395
    .line 396
    invoke-static {v1}, La/xfn;->a(La/fet;)La/wfn;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    iget v10, v6, La/wfn;->c:F

    .line 401
    .line 402
    sget-object v6, La/qmk;->a:La/zcl;

    .line 403
    .line 404
    const/high16 v11, 0x41800000    # 16.0f

    .line 405
    .line 406
    const/4 v12, 0x2

    .line 407
    sget-object v7, La/jm40;->b:La/jm40;

    .line 408
    .line 409
    const/4 v9, 0x0

    .line 410
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    sget-object v8, La/jt40;->c:La/jt40;

    .line 415
    .line 416
    invoke-static {v6, v8}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 417
    .line 418
    .line 419
    move-result-object v16

    .line 420
    iget-object v6, v15, La/qbp0;->b:La/hcm;

    .line 421
    .line 422
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    if-nez v8, :cond_6

    .line 431
    .line 432
    if-ne v9, v3, :cond_7

    .line 433
    .line 434
    :cond_6
    new-instance v9, La/dpl0;

    .line 435
    .line 436
    const/16 v8, 0x9

    .line 437
    .line 438
    invoke-direct {v9, v2, v8}, La/dpl0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_7
    move-object/from16 v19, v9

    .line 445
    .line 446
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 447
    .line 448
    const/16 v21, 0xd80

    .line 449
    .line 450
    const/16 v22, 0x0

    .line 451
    .line 452
    const/16 v18, 0x0

    .line 453
    .line 454
    move-object/from16 v20, v1

    .line 455
    .line 456
    move-object/from16 v17, v6

    .line 457
    .line 458
    invoke-static/range {v16 .. v22}, La/xbc;->m(La/mm40;La/hcm;ZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 459
    .line 460
    .line 461
    invoke-static {v7, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    sget-object v6, La/jt40;->a:La/jt40;

    .line 466
    .line 467
    invoke-static {v5, v6}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    sget-object v6, La/gqw0;->b:La/zx7;

    .line 472
    .line 473
    const/4 v8, 0x0

    .line 474
    invoke-static {v6, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    iget-wide v7, v1, La/fet;->T:J

    .line 479
    .line 480
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 481
    .line 482
    .line 483
    move-result v7

    .line 484
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    invoke-static {v1, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 489
    .line 490
    .line 491
    move-result-object v5

    .line 492
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 493
    .line 494
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v1}, La/fet;->i0()V

    .line 498
    .line 499
    .line 500
    iget-boolean v9, v1, La/fet;->S:Z

    .line 501
    .line 502
    if-eqz v9, :cond_8

    .line 503
    .line 504
    invoke-virtual {v1, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 505
    .line 506
    .line 507
    goto :goto_2

    .line 508
    :cond_8
    invoke-virtual {v1}, La/fet;->r0()V

    .line 509
    .line 510
    .line 511
    :goto_2
    sget-object v4, La/gqw0;->x:La/shd;

    .line 512
    .line 513
    invoke-static {v1, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 514
    .line 515
    .line 516
    sget-object v4, La/gqw0;->w:La/shd;

    .line 517
    .line 518
    invoke-static {v1, v8, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 519
    .line 520
    .line 521
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    sget-object v6, La/gqw0;->y:La/shd;

    .line 526
    .line 527
    invoke-static {v1, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 528
    .line 529
    .line 530
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 531
    .line 532
    .line 533
    sget-object v4, La/gqw0;->v:La/shd;

    .line 534
    .line 535
    invoke-static {v1, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 536
    .line 537
    .line 538
    sget-object v4, La/o7k0;->c:La/n0q;

    .line 539
    .line 540
    iget-object v5, v0, La/pbp0;->g:La/l7m0;

    .line 541
    .line 542
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v6

    .line 546
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v7

    .line 550
    const/16 v8, 0xb

    .line 551
    .line 552
    if-nez v6, :cond_9

    .line 553
    .line 554
    if-ne v7, v3, :cond_a

    .line 555
    .line 556
    :cond_9
    new-instance v7, La/eb3;

    .line 557
    .line 558
    invoke-direct {v7, v5, v8}, La/eb3;-><init>(La/l7m0;B)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 565
    .line 566
    invoke-static {v4, v7}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 571
    .line 572
    invoke-virtual {v1, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v6

    .line 576
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 577
    .line 578
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 579
    .line 580
    .line 581
    move-result-wide v6

    .line 582
    sget-object v9, La/jd8;->n:La/ljc;

    .line 583
    .line 584
    invoke-static {v4, v6, v7, v9}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 585
    .line 586
    .line 587
    move-result-object v4

    .line 588
    const/4 v6, 0x0

    .line 589
    invoke-static {v6, v1, v4}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 590
    .line 591
    .line 592
    iget-object v4, v15, La/qbp0;->a:Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v6

    .line 598
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    if-nez v6, :cond_b

    .line 603
    .line 604
    if-ne v7, v3, :cond_c

    .line 605
    .line 606
    :cond_b
    new-instance v7, La/t450;

    .line 607
    .line 608
    invoke-direct {v7, v2, v8}, La/t450;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    :cond_c
    move-object/from16 v19, v7

    .line 615
    .line 616
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 617
    .line 618
    const/16 v21, 0x0

    .line 619
    .line 620
    iget-object v0, v0, La/pbp0;->h:La/l7m0;

    .line 621
    .line 622
    move-object/from16 v18, v0

    .line 623
    .line 624
    move-object/from16 v20, v1

    .line 625
    .line 626
    move-object/from16 v16, v4

    .line 627
    .line 628
    move-object/from16 v17, v5

    .line 629
    .line 630
    invoke-static/range {v16 .. v21}, La/rq8;->r(Ljava/lang/String;La/l7m0;La/l7m0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 631
    .line 632
    .line 633
    const/4 v0, 0x1

    .line 634
    invoke-virtual {v1, v0}, La/fet;->r(Z)V

    .line 635
    .line 636
    .line 637
    const/4 v5, 0x0

    .line 638
    invoke-virtual {v1, v5}, La/fet;->r(Z)V

    .line 639
    .line 640
    .line 641
    return-object v13

    .line 642
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
