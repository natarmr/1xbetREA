.class public final La/jh10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/l7m0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/jh10;->a:B

    iput-object p1, p0, La/jh10;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/jh10;->c:La/l7m0;

    iput-object p3, p0, La/jh10;->d:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jh10;->a:B

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/high16 v3, 0x40c00000    # 6.0f

    .line 7
    .line 8
    const/high16 v4, 0x42100000    # 36.0f

    .line 9
    .line 10
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 11
    .line 12
    iget-object v6, v0, La/jh10;->d:La/l7m0;

    .line 13
    .line 14
    iget-object v7, v0, La/jh10;->c:La/l7m0;

    .line 15
    .line 16
    const/high16 v8, 0x42600000    # 56.0f

    .line 17
    .line 18
    sget-object v9, La/jm40;->b:La/jm40;

    .line 19
    .line 20
    const/4 v10, 0x2

    .line 21
    const/4 v11, 0x1

    .line 22
    const/4 v12, 0x0

    .line 23
    iget-object v0, v0, La/jh10;->b:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    sget-object v13, La/ukd;->a:La/cl5;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/fet;

    .line 33
    .line 34
    move-object/from16 v14, p2

    .line 35
    .line 36
    check-cast v14, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v14

    .line 42
    and-int/lit8 v15, v14, 0x3

    .line 43
    .line 44
    if-eq v15, v10, :cond_0

    .line 45
    .line 46
    move v10, v11

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move v10, v12

    .line 49
    :goto_0
    and-int/2addr v14, v11

    .line 50
    invoke-virtual {v1, v14, v10}, La/fet;->U(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    if-eqz v10, :cond_6

    .line 55
    .line 56
    sget-object v10, La/qmk;->a:La/zcl;

    .line 57
    .line 58
    invoke-static {v9, v8}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    if-nez v8, :cond_1

    .line 71
    .line 72
    if-ne v10, v13, :cond_2

    .line 73
    .line 74
    :cond_1
    new-instance v10, La/cnn;

    .line 75
    .line 76
    const/16 v8, 0x10

    .line 77
    .line 78
    invoke-direct {v10, v0, v8}, La/cnn;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    move-object/from16 v19, v10

    .line 85
    .line 86
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 87
    .line 88
    const/16 v20, 0x1c

    .line 89
    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    const/16 v18, 0x0

    .line 96
    .line 97
    invoke-static/range {v14 .. v20}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v8, La/gqw0;->e:La/zx7;

    .line 102
    .line 103
    invoke-static {v8, v12}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    iget-wide v14, v1, La/fet;->T:J

    .line 108
    .line 109
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 122
    .line 123
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, La/fet;->i0()V

    .line 127
    .line 128
    .line 129
    iget-boolean v14, v1, La/fet;->S:Z

    .line 130
    .line 131
    if-eqz v14, :cond_3

    .line 132
    .line 133
    invoke-virtual {v1, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    invoke-virtual {v1}, La/fet;->r0()V

    .line 138
    .line 139
    .line 140
    :goto_1
    sget-object v5, La/gqw0;->x:La/shd;

    .line 141
    .line 142
    invoke-static {v1, v8, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 143
    .line 144
    .line 145
    sget-object v5, La/gqw0;->w:La/shd;

    .line 146
    .line 147
    invoke-static {v1, v12, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    sget-object v8, La/gqw0;->y:La/shd;

    .line 155
    .line 156
    invoke-static {v1, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 160
    .line 161
    .line 162
    sget-object v5, La/gqw0;->v:La/shd;

    .line 163
    .line 164
    invoke-static {v1, v0, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v9, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    if-nez v4, :cond_4

    .line 180
    .line 181
    if-ne v5, v13, :cond_5

    .line 182
    .line 183
    :cond_4
    new-instance v5, La/eb3;

    .line 184
    .line 185
    const/16 v4, 0xa

    .line 186
    .line 187
    invoke-direct {v5, v7, v4}, La/eb3;-><init>(La/l7m0;B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 194
    .line 195
    invoke-static {v0, v5}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0, v3}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    const v0, 0x7f080965

    .line 204
    .line 205
    .line 206
    invoke-static {v0, v2, v1}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, La/y3d;

    .line 215
    .line 216
    iget-wide v2, v0, La/y3d;->a:J

    .line 217
    .line 218
    const/16 v20, 0x30

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const/4 v15, 0x0

    .line 223
    move-object/from16 v19, v1

    .line 224
    .line 225
    move-wide/from16 v17, v2

    .line 226
    .line 227
    invoke-static/range {v14 .. v21}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 228
    .line 229
    .line 230
    move-object/from16 v0, v19

    .line 231
    .line 232
    invoke-virtual {v0, v11}, La/fet;->r(Z)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_6
    move-object v0, v1

    .line 237
    invoke-virtual {v0}, La/fet;->X()V

    .line 238
    .line 239
    .line 240
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_0
    move-object/from16 v1, p1

    .line 244
    .line 245
    check-cast v1, La/fet;

    .line 246
    .line 247
    move-object/from16 v14, p2

    .line 248
    .line 249
    check-cast v14, Ljava/lang/Number;

    .line 250
    .line 251
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v14

    .line 255
    and-int/lit8 v15, v14, 0x3

    .line 256
    .line 257
    if-eq v15, v10, :cond_7

    .line 258
    .line 259
    move v10, v11

    .line 260
    goto :goto_3

    .line 261
    :cond_7
    move v10, v12

    .line 262
    :goto_3
    and-int/2addr v14, v11

    .line 263
    invoke-virtual {v1, v14, v10}, La/fet;->U(IZ)Z

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-eqz v10, :cond_d

    .line 268
    .line 269
    sget-object v10, La/qmk;->a:La/zcl;

    .line 270
    .line 271
    invoke-static {v9, v8}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    if-nez v8, :cond_8

    .line 284
    .line 285
    if-ne v10, v13, :cond_9

    .line 286
    .line 287
    :cond_8
    new-instance v10, La/cnn;

    .line 288
    .line 289
    const/16 v8, 0xf

    .line 290
    .line 291
    invoke-direct {v10, v0, v8}, La/cnn;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_9
    move-object/from16 v19, v10

    .line 298
    .line 299
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 300
    .line 301
    const/16 v20, 0x1c

    .line 302
    .line 303
    const/4 v15, 0x0

    .line 304
    const/16 v16, 0x0

    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    const/16 v18, 0x0

    .line 309
    .line 310
    invoke-static/range {v14 .. v20}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    sget-object v8, La/gqw0;->e:La/zx7;

    .line 315
    .line 316
    invoke-static {v8, v12}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    iget-wide v14, v1, La/fet;->T:J

    .line 321
    .line 322
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 335
    .line 336
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1}, La/fet;->i0()V

    .line 340
    .line 341
    .line 342
    iget-boolean v14, v1, La/fet;->S:Z

    .line 343
    .line 344
    if-eqz v14, :cond_a

    .line 345
    .line 346
    invoke-virtual {v1, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 347
    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_a
    invoke-virtual {v1}, La/fet;->r0()V

    .line 351
    .line 352
    .line 353
    :goto_4
    sget-object v5, La/gqw0;->x:La/shd;

    .line 354
    .line 355
    invoke-static {v1, v8, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 356
    .line 357
    .line 358
    sget-object v5, La/gqw0;->w:La/shd;

    .line 359
    .line 360
    invoke-static {v1, v12, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    sget-object v8, La/gqw0;->y:La/shd;

    .line 368
    .line 369
    invoke-static {v1, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 373
    .line 374
    .line 375
    sget-object v5, La/gqw0;->v:La/shd;

    .line 376
    .line 377
    invoke-static {v1, v0, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v9, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    if-nez v4, :cond_b

    .line 393
    .line 394
    if-ne v5, v13, :cond_c

    .line 395
    .line 396
    :cond_b
    new-instance v5, La/eb3;

    .line 397
    .line 398
    const/4 v4, 0x7

    .line 399
    invoke-direct {v5, v7, v4}, La/eb3;-><init>(La/l7m0;B)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 406
    .line 407
    invoke-static {v0, v5}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-static {v0, v3}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    const v0, 0x7f0807d9

    .line 416
    .line 417
    .line 418
    invoke-static {v0, v2, v1}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    check-cast v2, La/y3d;

    .line 427
    .line 428
    iget-wide v4, v2, La/y3d;->a:J

    .line 429
    .line 430
    const/16 v7, 0x30

    .line 431
    .line 432
    const/4 v8, 0x0

    .line 433
    const/4 v2, 0x0

    .line 434
    move-object v6, v1

    .line 435
    move-object v1, v0

    .line 436
    invoke-static/range {v1 .. v8}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v6, v11}, La/fet;->r(Z)V

    .line 440
    .line 441
    .line 442
    goto :goto_5

    .line 443
    :cond_d
    move-object v6, v1

    .line 444
    invoke-virtual {v6}, La/fet;->X()V

    .line 445
    .line 446
    .line 447
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 448
    .line 449
    return-object v0

    .line 450
    nop

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
