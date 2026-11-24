.class public final synthetic La/eec0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLa/lm6;La/pz40;La/kz20;FLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/eec0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/eec0;->b:F

    iput-object p2, p0, La/eec0;->e:Ljava/lang/Object;

    iput-object p3, p0, La/eec0;->f:Ljava/lang/Object;

    iput-object p4, p0, La/eec0;->g:Ljava/lang/Object;

    iput p5, p0, La/eec0;->c:F

    iput-object p6, p0, La/eec0;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/kec0;FLa/xcz;Lkotlin/jvm/functions/Function1;FLa/hjm;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/eec0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/eec0;->e:Ljava/lang/Object;

    iput p2, p0, La/eec0;->b:F

    iput-object p3, p0, La/eec0;->f:Ljava/lang/Object;

    iput-object p4, p0, La/eec0;->d:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/eec0;->c:F

    iput-object p6, p0, La/eec0;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eec0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/eec0;->g:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, v0, La/eec0;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, La/eec0;->e:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, La/lm6;

    .line 19
    .line 20
    check-cast v5, La/pz40;

    .line 21
    .line 22
    move-object v9, v4

    .line 23
    check-cast v9, La/kz20;

    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/u63;

    .line 28
    .line 29
    move-object/from16 v4, p2

    .line 30
    .line 31
    check-cast v4, La/fet;

    .line 32
    .line 33
    move-object/from16 v8, p3

    .line 34
    .line 35
    check-cast v8, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    and-int/lit8 v1, v8, 0x11

    .line 45
    .line 46
    if-eq v1, v2, :cond_0

    .line 47
    .line 48
    move v1, v7

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v1, v3

    .line 51
    :goto_0
    and-int/lit8 v2, v8, 0x1

    .line 52
    .line 53
    invoke-virtual {v4, v2, v1}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    sget-object v1, La/jm40;->b:La/jm40;

    .line 60
    .line 61
    const/high16 v2, 0x3f800000    # 1.0f

    .line 62
    .line 63
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sget-object v2, La/qmk;->a:La/zcl;

    .line 68
    .line 69
    const/high16 v2, 0x42400000    # 48.0f

    .line 70
    .line 71
    invoke-static {v1, v2}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 76
    .line 77
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack10-0d7_KjU()J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    sget-object v2, La/jd8;->n:La/ljc;

    .line 82
    .line 83
    invoke-static {v1, v7, v8, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    sget v7, La/rf6;->a:F

    .line 98
    .line 99
    new-instance v8, La/ez20;

    .line 100
    .line 101
    const/4 v13, 0x1

    .line 102
    iget v10, v0, La/eec0;->c:F

    .line 103
    .line 104
    iget v11, v0, La/eec0;->b:F

    .line 105
    .line 106
    iget-object v12, v0, La/eec0;->d:Lkotlin/jvm/functions/Function1;

    .line 107
    .line 108
    invoke-direct/range {v8 .. v13}, La/ez20;-><init>(La/kz20;FFLkotlin/jvm/functions/Function1;B)V

    .line 109
    .line 110
    .line 111
    move v13, v11

    .line 112
    const v0, -0x77b0f7d1

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v8, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 116
    .line 117
    .line 118
    move-result-object v15

    .line 119
    const/4 v0, 0x0

    .line 120
    if-eqz v6, :cond_1

    .line 121
    .line 122
    const v8, 0x754c75a2

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v8}, La/fet;->e0(I)V

    .line 126
    .line 127
    .line 128
    new-instance v8, La/eyn;

    .line 129
    .line 130
    const/16 v9, 0x17

    .line 131
    .line 132
    invoke-direct {v8, v6, v12, v5, v9}, La/eyn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    const v5, -0x372aee75

    .line 136
    .line 137
    .line 138
    invoke-static {v5, v8, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v4, v3}, La/fet;->r(Z)V

    .line 143
    .line 144
    .line 145
    move-object/from16 v16, v5

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    const v5, 0x755b9275

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v5}, La/fet;->e0(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v3}, La/fet;->r(Z)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v16, v0

    .line 158
    .line 159
    :goto_1
    if-eqz v6, :cond_2

    .line 160
    .line 161
    sget-object v0, La/b34;->l:La/ugd;

    .line 162
    .line 163
    :cond_2
    move-object/from16 v17, v0

    .line 164
    .line 165
    const/high16 v19, 0x30000

    .line 166
    .line 167
    move v14, v13

    .line 168
    move-object v10, v1

    .line 169
    move v11, v2

    .line 170
    move-object/from16 v18, v4

    .line 171
    .line 172
    move v12, v7

    .line 173
    invoke-static/range {v10 .. v19}, La/cwr0;->l(La/mm40;ZFFFLa/ugd;La/xdr;La/xdr;La/fet;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_3
    move-object/from16 v18, v4

    .line 178
    .line 179
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 180
    .line 181
    .line 182
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_0
    check-cast v6, La/kec0;

    .line 186
    .line 187
    move-object v9, v5

    .line 188
    check-cast v9, La/xcz;

    .line 189
    .line 190
    move-object v8, v4

    .line 191
    check-cast v8, La/hjm;

    .line 192
    .line 193
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, La/ir8;

    .line 196
    .line 197
    move-object/from16 v4, p2

    .line 198
    .line 199
    check-cast v4, La/fet;

    .line 200
    .line 201
    move-object/from16 v5, p3

    .line 202
    .line 203
    check-cast v5, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    and-int/lit8 v1, v5, 0x11

    .line 213
    .line 214
    if-eq v1, v2, :cond_4

    .line 215
    .line 216
    move v1, v7

    .line 217
    goto :goto_3

    .line 218
    :cond_4
    move v1, v3

    .line 219
    :goto_3
    and-int/lit8 v2, v5, 0x1

    .line 220
    .line 221
    invoke-virtual {v4, v2, v1}, La/fet;->U(IZ)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_a

    .line 226
    .line 227
    iget-object v1, v6, La/kec0;->c:La/a4x;

    .line 228
    .line 229
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    const/high16 v2, 0x42000000    # 32.0f

    .line 234
    .line 235
    iget v5, v0, La/eec0;->b:F

    .line 236
    .line 237
    move-object v10, v9

    .line 238
    iget-object v9, v0, La/eec0;->d:Lkotlin/jvm/functions/Function1;

    .line 239
    .line 240
    sget-object v11, La/ukd;->a:La/cl5;

    .line 241
    .line 242
    if-nez v1, :cond_7

    .line 243
    .line 244
    const v0, 0x7ba4ee42

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 248
    .line 249
    .line 250
    sget-object v8, La/o7k0;->c:La/n0q;

    .line 251
    .line 252
    sget-object v0, La/qmk;->a:La/zcl;

    .line 253
    .line 254
    const/high16 v0, 0x41400000    # 12.0f

    .line 255
    .line 256
    add-float/2addr v5, v0

    .line 257
    const/high16 v0, 0x41000000    # 8.0f

    .line 258
    .line 259
    invoke-static {v5, v0, v5, v2, v4}, La/h97;->f(FFFFLa/fet;)La/ch80;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    new-instance v2, La/qw3;

    .line 264
    .line 265
    new-instance v5, La/jf4;

    .line 266
    .line 267
    const/16 v12, 0xe

    .line 268
    .line 269
    invoke-direct {v5, v12}, La/jf4;-><init>(B)V

    .line 270
    .line 271
    .line 272
    invoke-direct {v2, v0, v7, v5}, La/qw3;-><init>(FZLa/rw3;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-virtual {v4, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v5

    .line 283
    or-int/2addr v0, v5

    .line 284
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    if-nez v0, :cond_5

    .line 289
    .line 290
    if-ne v5, v11, :cond_6

    .line 291
    .line 292
    :cond_5
    new-instance v5, La/oac0;

    .line 293
    .line 294
    invoke-direct {v5, v6, v9, v7}, La/oac0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_6
    move-object/from16 v16, v5

    .line 301
    .line 302
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 303
    .line 304
    const/16 v18, 0x6

    .line 305
    .line 306
    const/16 v19, 0x1e8

    .line 307
    .line 308
    const/4 v12, 0x0

    .line 309
    const/4 v13, 0x0

    .line 310
    const/4 v14, 0x0

    .line 311
    const/4 v15, 0x0

    .line 312
    move-object v11, v2

    .line 313
    move-object/from16 v17, v4

    .line 314
    .line 315
    move-object v9, v10

    .line 316
    move-object v10, v1

    .line 317
    invoke-static/range {v8 .. v19}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 318
    .line 319
    .line 320
    move-object/from16 v1, v17

    .line 321
    .line 322
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 323
    .line 324
    .line 325
    goto :goto_4

    .line 326
    :cond_7
    move-object v1, v4

    .line 327
    const v4, 0x7bb4ef77

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, v4}, La/fet;->e0(I)V

    .line 331
    .line 332
    .line 333
    sget-object v12, La/o7k0;->c:La/n0q;

    .line 334
    .line 335
    sget-object v4, La/qmk;->a:La/zcl;

    .line 336
    .line 337
    const/4 v4, 0x7

    .line 338
    const/4 v7, 0x0

    .line 339
    invoke-static {v7, v7, v7, v2, v4}, La/s5x0;->u(FFFFI)La/lh80;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-virtual {v1, v5}, La/fet;->d(F)Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    or-int/2addr v4, v7

    .line 352
    iget v7, v0, La/eec0;->c:F

    .line 353
    .line 354
    invoke-virtual {v1, v7}, La/fet;->d(F)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    or-int/2addr v0, v4

    .line 359
    invoke-virtual {v1, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    or-int/2addr v0, v4

    .line 364
    invoke-virtual {v1, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    or-int/2addr v0, v4

    .line 369
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    if-nez v0, :cond_8

    .line 374
    .line 375
    if-ne v4, v11, :cond_9

    .line 376
    .line 377
    :cond_8
    new-instance v4, La/cec0;

    .line 378
    .line 379
    move-object/from16 v20, v6

    .line 380
    .line 381
    move v6, v5

    .line 382
    move-object/from16 v5, v20

    .line 383
    .line 384
    invoke-direct/range {v4 .. v9}, La/cec0;-><init>(La/kec0;FFLa/hjm;Lkotlin/jvm/functions/Function1;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :cond_9
    move-object/from16 v16, v4

    .line 391
    .line 392
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 393
    .line 394
    const/16 v18, 0x6

    .line 395
    .line 396
    const/16 v19, 0x1f8

    .line 397
    .line 398
    const/4 v11, 0x0

    .line 399
    move-object v8, v12

    .line 400
    const/4 v12, 0x0

    .line 401
    const/4 v13, 0x0

    .line 402
    const/4 v14, 0x0

    .line 403
    const/4 v15, 0x0

    .line 404
    move-object/from16 v17, v1

    .line 405
    .line 406
    move-object v9, v10

    .line 407
    move-object v10, v2

    .line 408
    invoke-static/range {v8 .. v19}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 412
    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_a
    move-object v1, v4

    .line 416
    invoke-virtual {v1}, La/fet;->X()V

    .line 417
    .line 418
    .line 419
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object v0

    .line 422
    nop

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
