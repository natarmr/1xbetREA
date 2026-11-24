.class public final synthetic La/ny2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ny2;->a:B

    iput p1, p0, La/ny2;->b:F

    iput-object p2, p0, La/ny2;->c:Ljava/lang/Object;

    iput-object p3, p0, La/ny2;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/ny2;->a:B

    iput-object p1, p0, La/ny2;->c:Ljava/lang/Object;

    iput p2, p0, La/ny2;->b:F

    iput-object p3, p0, La/ny2;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;FB)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/ny2;->a:B

    iput-object p1, p0, La/ny2;->c:Ljava/lang/Object;

    iput-object p2, p0, La/ny2;->d:Ljava/lang/Object;

    iput p3, p0, La/ny2;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ny2;->a:B

    .line 4
    .line 5
    const/16 v5, 0x19

    .line 6
    .line 7
    const v6, 0x2fd4df92

    .line 8
    .line 9
    .line 10
    const/16 v7, 0xa

    .line 11
    .line 12
    const v12, -0x4297e015

    .line 13
    .line 14
    .line 15
    const/16 v13, 0xc

    .line 16
    .line 17
    const/16 v14, 0x1c

    .line 18
    .line 19
    const/16 v16, 0x20

    .line 20
    .line 21
    const v4, -0x4e295cff

    .line 22
    .line 23
    .line 24
    const-wide v17, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/4 v8, 0x2

    .line 30
    const/4 v9, 0x3

    .line 31
    const/16 v19, 0x8

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/16 v21, 0x0

    .line 35
    .line 36
    const/4 v15, 0x1

    .line 37
    const/16 v22, 0x0

    .line 38
    .line 39
    iget v3, v0, La/ny2;->b:F

    .line 40
    .line 41
    iget-object v10, v0, La/ny2;->d:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v11, v0, La/ny2;->c:Ljava/lang/Object;

    .line 44
    .line 45
    packed-switch v1, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    check-cast v11, La/aht0;

    .line 49
    .line 50
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    move-object/from16 v0, p1

    .line 53
    .line 54
    check-cast v0, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iget-wide v4, v11, La/aht0;->b:J

    .line 61
    .line 62
    const-wide/high16 v6, -0x8000000000000000L

    .line 63
    .line 64
    cmp-long v2, v4, v6

    .line 65
    .line 66
    if-nez v2, :cond_0

    .line 67
    .line 68
    iput-wide v0, v11, La/aht0;->b:J

    .line 69
    .line 70
    move-wide v4, v0

    .line 71
    :cond_0
    new-instance v15, La/p73;

    .line 72
    .line 73
    iget v2, v11, La/aht0;->e:F

    .line 74
    .line 75
    invoke-direct {v15, v2}, La/p73;-><init>(F)V

    .line 76
    .line 77
    .line 78
    cmpg-float v6, v3, v22

    .line 79
    .line 80
    sget-object v7, La/aht0;->f:La/p73;

    .line 81
    .line 82
    if-nez v6, :cond_1

    .line 83
    .line 84
    iget-object v3, v11, La/aht0;->a:La/l5u0;

    .line 85
    .line 86
    new-instance v4, La/p73;

    .line 87
    .line 88
    invoke-direct {v4, v2}, La/p73;-><init>(F)V

    .line 89
    .line 90
    .line 91
    iget-object v2, v11, La/aht0;->c:La/p73;

    .line 92
    .line 93
    invoke-interface {v3, v4, v7, v2}, La/l5u0;->b(La/t73;La/t73;La/t73;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    :goto_0
    move-wide v13, v2

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    sub-long v4, v0, v4

    .line 100
    .line 101
    long-to-float v2, v4

    .line 102
    div-float/2addr v2, v3

    .line 103
    float-to-double v2, v2

    .line 104
    invoke-static {v2, v3}, La/si30;->c(D)J

    .line 105
    .line 106
    .line 107
    move-result-wide v2

    .line 108
    goto :goto_0

    .line 109
    :goto_1
    iget-object v12, v11, La/aht0;->a:La/l5u0;

    .line 110
    .line 111
    iget-object v2, v11, La/aht0;->c:La/p73;

    .line 112
    .line 113
    move-object/from16 v17, v2

    .line 114
    .line 115
    move-object/from16 v16, v7

    .line 116
    .line 117
    invoke-interface/range {v12 .. v17}, La/l5u0;->c(JLa/t73;La/t73;La/t73;)La/t73;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, La/p73;

    .line 122
    .line 123
    iget v2, v2, La/p73;->a:F

    .line 124
    .line 125
    iget-object v12, v11, La/aht0;->a:La/l5u0;

    .line 126
    .line 127
    iget-object v3, v11, La/aht0;->c:La/p73;

    .line 128
    .line 129
    move-object/from16 v17, v3

    .line 130
    .line 131
    invoke-interface/range {v12 .. v17}, La/l5u0;->h(JLa/t73;La/t73;La/t73;)La/t73;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, La/p73;

    .line 136
    .line 137
    iput-object v3, v11, La/aht0;->c:La/p73;

    .line 138
    .line 139
    iput-wide v0, v11, La/aht0;->b:J

    .line 140
    .line 141
    iget v0, v11, La/aht0;->e:F

    .line 142
    .line 143
    sub-float/2addr v0, v2

    .line 144
    iput v2, v11, La/aht0;->e:F

    .line 145
    .line 146
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {v10, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_0
    check-cast v11, La/sok0;

    .line 157
    .line 158
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 159
    .line 160
    move-object/from16 v4, p1

    .line 161
    .line 162
    check-cast v4, La/i8z;

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    iget-object v0, v11, La/sok0;->a:Ljava/util/ArrayList;

    .line 168
    .line 169
    new-instance v1, La/t9r0;

    .line 170
    .line 171
    invoke-direct {v1, v15}, La/t9r0;-><init>(B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    new-instance v6, La/zcn0;

    .line 179
    .line 180
    invoke-direct {v6, v1, v0, v14}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 181
    .line 182
    .line 183
    new-instance v8, La/t9l0;

    .line 184
    .line 185
    invoke-direct {v8, v0, v13}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 186
    .line 187
    .line 188
    new-instance v1, La/idr0;

    .line 189
    .line 190
    invoke-direct {v1, v0, v3, v10, v15}, La/idr0;-><init>(Ljava/util/ArrayList;FLkotlin/jvm/functions/Function1;B)V

    .line 191
    .line 192
    .line 193
    new-instance v9, La/ugd;

    .line 194
    .line 195
    invoke-direct {v9, v12, v15, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const/4 v7, 0x0

    .line 199
    invoke-virtual/range {v4 .. v9}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 200
    .line 201
    .line 202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_1
    check-cast v11, La/gij;

    .line 206
    .line 207
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 208
    .line 209
    move-object/from16 v0, p1

    .line 210
    .line 211
    check-cast v0, La/hcz;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object v1, v11, La/gij;->b:Ljava/util/ArrayList;

    .line 217
    .line 218
    new-instance v4, La/t9r0;

    .line 219
    .line 220
    invoke-direct {v4, v8}, La/t9r0;-><init>(B)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    new-instance v8, La/zcn0;

    .line 228
    .line 229
    const/16 v9, 0x14

    .line 230
    .line 231
    invoke-direct {v8, v4, v1, v9}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 232
    .line 233
    .line 234
    new-instance v4, La/t9l0;

    .line 235
    .line 236
    invoke-direct {v4, v1, v7}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 237
    .line 238
    .line 239
    new-instance v7, La/idr0;

    .line 240
    .line 241
    invoke-direct {v7, v1, v3, v10, v2}, La/idr0;-><init>(Ljava/util/ArrayList;FLkotlin/jvm/functions/Function1;B)V

    .line 242
    .line 243
    .line 244
    new-instance v1, La/ugd;

    .line 245
    .line 246
    invoke-direct {v1, v6, v15, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v5, v8, v4, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_2
    check-cast v11, La/pu90;

    .line 256
    .line 257
    check-cast v10, La/jdq0;

    .line 258
    .line 259
    move-object/from16 v0, p1

    .line 260
    .line 261
    check-cast v0, La/ou90;

    .line 262
    .line 263
    iget-object v1, v10, La/jdq0;->s:La/t33;

    .line 264
    .line 265
    if-eqz v1, :cond_2

    .line 266
    .line 267
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    check-cast v1, Ljava/lang/Number;

    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    float-to-int v1, v1

    .line 278
    goto :goto_2

    .line 279
    :cond_2
    float-to-int v1, v3

    .line 280
    :goto_2
    invoke-static {v0, v11, v1, v2}, La/ou90;->n(La/ou90;La/pu90;II)V

    .line 281
    .line 282
    .line 283
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object v0

    .line 286
    :pswitch_3
    check-cast v11, Ljava/util/List;

    .line 287
    .line 288
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 289
    .line 290
    move-object/from16 v0, p1

    .line 291
    .line 292
    check-cast v0, La/hcz;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    new-instance v1, La/meo0;

    .line 298
    .line 299
    invoke-direct {v1, v15}, La/meo0;-><init>(B)V

    .line 300
    .line 301
    .line 302
    invoke-static {v11, v1}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    new-instance v5, La/adn0;

    .line 311
    .line 312
    invoke-direct {v5, v1, v9}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 313
    .line 314
    .line 315
    new-instance v1, La/adn0;

    .line 316
    .line 317
    const/4 v6, 0x4

    .line 318
    invoke-direct {v1, v11, v6}, La/adn0;-><init>(Ljava/util/List;B)V

    .line 319
    .line 320
    .line 321
    new-instance v6, La/umh;

    .line 322
    .line 323
    invoke-direct {v6, v11, v10, v3}, La/umh;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;F)V

    .line 324
    .line 325
    .line 326
    new-instance v3, La/ugd;

    .line 327
    .line 328
    invoke-direct {v3, v4, v15, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0, v2, v5, v1, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 332
    .line 333
    .line 334
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_4
    check-cast v11, La/pu90;

    .line 338
    .line 339
    check-cast v10, La/vj30;

    .line 340
    .line 341
    move-object/from16 v0, p1

    .line 342
    .line 343
    check-cast v0, La/ou90;

    .line 344
    .line 345
    invoke-interface {v10, v3}, La/w6k;->T(F)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    invoke-static {v0, v11, v1, v2}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 350
    .line 351
    .line 352
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_5
    check-cast v11, La/qxl0;

    .line 356
    .line 357
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 358
    .line 359
    move-object/from16 v0, p1

    .line 360
    .line 361
    check-cast v0, La/hcz;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iget-object v1, v11, La/qxl0;->a:La/a4x;

    .line 367
    .line 368
    new-instance v2, La/f8l0;

    .line 369
    .line 370
    invoke-direct {v2, v13}, La/f8l0;-><init>(B)V

    .line 371
    .line 372
    .line 373
    invoke-static {v1, v2}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    new-instance v7, La/y9k0;

    .line 382
    .line 383
    invoke-direct {v7, v2, v5}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 384
    .line 385
    .line 386
    new-instance v2, La/y9k0;

    .line 387
    .line 388
    const/16 v5, 0x1a

    .line 389
    .line 390
    invoke-direct {v2, v1, v5}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 391
    .line 392
    .line 393
    new-instance v5, La/p0i;

    .line 394
    .line 395
    invoke-direct {v5, v1, v3, v10, v9}, La/p0i;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function2;B)V

    .line 396
    .line 397
    .line 398
    new-instance v1, La/ugd;

    .line 399
    .line 400
    invoke-direct {v1, v4, v15, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v6, v7, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 404
    .line 405
    .line 406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_6
    check-cast v11, La/ier0;

    .line 410
    .line 411
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 412
    .line 413
    move-object/from16 v16, p1

    .line 414
    .line 415
    check-cast v16, La/i8z;

    .line 416
    .line 417
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    iget-object v0, v11, La/ier0;->a:La/a4x;

    .line 421
    .line 422
    new-instance v1, La/ejk0;

    .line 423
    .line 424
    const/16 v4, 0x16

    .line 425
    .line 426
    invoke-direct {v1, v4}, La/ejk0;-><init>(B)V

    .line 427
    .line 428
    .line 429
    new-instance v4, La/ejk0;

    .line 430
    .line 431
    const/16 v5, 0x17

    .line 432
    .line 433
    invoke-direct {v4, v5}, La/ejk0;-><init>(B)V

    .line 434
    .line 435
    .line 436
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 437
    .line 438
    .line 439
    move-result v17

    .line 440
    new-instance v5, La/pwe0;

    .line 441
    .line 442
    const/16 v6, 0x1d

    .line 443
    .line 444
    invoke-direct {v5, v1, v0, v6}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 445
    .line 446
    .line 447
    new-instance v1, La/o3l0;

    .line 448
    .line 449
    invoke-direct {v1, v4, v0, v2}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 450
    .line 451
    .line 452
    new-instance v2, La/umh;

    .line 453
    .line 454
    invoke-direct {v2, v0, v3, v10, v9}, La/umh;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function1;B)V

    .line 455
    .line 456
    .line 457
    new-instance v0, La/ugd;

    .line 458
    .line 459
    invoke-direct {v0, v12, v15, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    const/16 v19, 0x0

    .line 463
    .line 464
    move-object/from16 v21, v0

    .line 465
    .line 466
    move-object/from16 v20, v1

    .line 467
    .line 468
    move-object/from16 v18, v5

    .line 469
    .line 470
    invoke-virtual/range {v16 .. v21}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 471
    .line 472
    .line 473
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_7
    check-cast v11, La/mch0;

    .line 477
    .line 478
    move-object/from16 v23, v10

    .line 479
    .line 480
    check-cast v23, La/g9q0;

    .line 481
    .line 482
    move-object/from16 v8, p1

    .line 483
    .line 484
    check-cast v8, La/pi9;

    .line 485
    .line 486
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-static {v11}, La/pzw;->K(La/mch0;)I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    iget-object v3, v8, La/pi9;->a:La/y99;

    .line 494
    .line 495
    invoke-interface {v3}, La/y99;->d()J

    .line 496
    .line 497
    .line 498
    move-result-wide v3

    .line 499
    and-long v3, v3, v17

    .line 500
    .line 501
    long-to-int v3, v3

    .line 502
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    mul-int/lit8 v1, v1, 0x8

    .line 507
    .line 508
    int-to-float v1, v1

    .line 509
    div-float/2addr v3, v1

    .line 510
    iget-object v1, v11, La/mch0;->b:La/a4x;

    .line 511
    .line 512
    new-instance v4, Ljava/util/ArrayList;

    .line 513
    .line 514
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 519
    .line 520
    .line 521
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    move v6, v2

    .line 526
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 527
    .line 528
    .line 529
    move-result v9

    .line 530
    iget v10, v0, La/ny2;->b:F

    .line 531
    .line 532
    if-eqz v9, :cond_4

    .line 533
    .line 534
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v9

    .line 538
    add-int/lit8 v12, v6, 0x1

    .line 539
    .line 540
    if-ltz v6, :cond_3

    .line 541
    .line 542
    check-cast v9, La/nch0;

    .line 543
    .line 544
    invoke-virtual {v8}, La/pi9;->getDensity()F

    .line 545
    .line 546
    .line 547
    move-result v13

    .line 548
    mul-float/2addr v13, v10

    .line 549
    int-to-float v6, v6

    .line 550
    mul-float/2addr v13, v6

    .line 551
    iget-object v6, v8, La/pi9;->a:La/y99;

    .line 552
    .line 553
    invoke-interface {v6}, La/y99;->d()J

    .line 554
    .line 555
    .line 556
    move-result-wide v19

    .line 557
    move/from16 p1, v3

    .line 558
    .line 559
    and-long v2, v19, v17

    .line 560
    .line 561
    long-to-int v2, v2

    .line 562
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    const/high16 v3, 0x40000000    # 2.0f

    .line 567
    .line 568
    div-float/2addr v2, v3

    .line 569
    iget v3, v9, La/nch0;->a:I

    .line 570
    .line 571
    neg-int v3, v3

    .line 572
    int-to-float v3, v3

    .line 573
    mul-float v3, v3, p1

    .line 574
    .line 575
    add-float/2addr v3, v2

    .line 576
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    int-to-long v9, v2

    .line 581
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    int-to-long v2, v2

    .line 586
    shl-long v9, v9, v16

    .line 587
    .line 588
    and-long v2, v2, v17

    .line 589
    .line 590
    or-long/2addr v2, v9

    .line 591
    new-instance v6, La/ne60;

    .line 592
    .line 593
    invoke-direct {v6, v2, v3}, La/ne60;-><init>(J)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move/from16 v3, p1

    .line 600
    .line 601
    move v6, v12

    .line 602
    const/4 v2, 0x0

    .line 603
    goto :goto_3

    .line 604
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 605
    .line 606
    .line 607
    throw v21

    .line 608
    :cond_4
    invoke-static {}, La/z03;->a()La/w03;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    check-cast v0, La/ne60;

    .line 617
    .line 618
    if-eqz v0, :cond_5

    .line 619
    .line 620
    iget-wide v5, v0, La/ne60;->a:J

    .line 621
    .line 622
    shr-long v5, v5, v16

    .line 623
    .line 624
    long-to-int v0, v5

    .line 625
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    goto :goto_4

    .line 630
    :cond_5
    move/from16 v0, v22

    .line 631
    .line 632
    :goto_4
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    check-cast v2, La/ne60;

    .line 637
    .line 638
    if-eqz v2, :cond_6

    .line 639
    .line 640
    iget-wide v5, v2, La/ne60;->a:J

    .line 641
    .line 642
    and-long v5, v5, v17

    .line 643
    .line 644
    long-to-int v2, v5

    .line 645
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    goto :goto_5

    .line 650
    :cond_6
    move/from16 v2, v22

    .line 651
    .line 652
    :goto_5
    invoke-virtual {v3, v0, v2}, La/w03;->f(FF)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    sub-int/2addr v0, v15

    .line 660
    const/4 v2, 0x0

    .line 661
    :goto_6
    if-ge v2, v0, :cond_9

    .line 662
    .line 663
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v5

    .line 667
    check-cast v5, La/ne60;

    .line 668
    .line 669
    iget-wide v12, v5, La/ne60;->a:J

    .line 670
    .line 671
    add-int/lit8 v6, v2, 0x1

    .line 672
    .line 673
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v9

    .line 677
    check-cast v9, La/ne60;

    .line 678
    .line 679
    iget-wide v14, v9, La/ne60;->a:J

    .line 680
    .line 681
    add-int/lit8 v7, v2, -0x1

    .line 682
    .line 683
    move/from16 p0, v0

    .line 684
    .line 685
    if-ltz v7, :cond_7

    .line 686
    .line 687
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-ge v7, v0, :cond_7

    .line 692
    .line 693
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    :cond_7
    check-cast v5, La/ne60;

    .line 698
    .line 699
    move/from16 p1, v6

    .line 700
    .line 701
    iget-wide v5, v5, La/ne60;->a:J

    .line 702
    .line 703
    add-int/lit8 v2, v2, 0x2

    .line 704
    .line 705
    if-ltz v2, :cond_8

    .line 706
    .line 707
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-ge v2, v0, :cond_8

    .line 712
    .line 713
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v9

    .line 717
    :cond_8
    check-cast v9, La/ne60;

    .line 718
    .line 719
    move v7, v10

    .line 720
    iget-wide v9, v9, La/ne60;->a:J

    .line 721
    .line 722
    invoke-static {v14, v15, v5, v6}, La/ne60;->e(JJ)J

    .line 723
    .line 724
    .line 725
    move-result-wide v5

    .line 726
    const/high16 v0, 0x41000000    # 8.0f

    .line 727
    .line 728
    invoke-static {v0, v5, v6}, La/ne60;->b(FJ)J

    .line 729
    .line 730
    .line 731
    move-result-wide v5

    .line 732
    invoke-static {v12, v13, v5, v6}, La/ne60;->f(JJ)J

    .line 733
    .line 734
    .line 735
    move-result-wide v5

    .line 736
    invoke-static {v9, v10, v12, v13}, La/ne60;->e(JJ)J

    .line 737
    .line 738
    .line 739
    move-result-wide v9

    .line 740
    invoke-static {v0, v9, v10}, La/ne60;->b(FJ)J

    .line 741
    .line 742
    .line 743
    move-result-wide v9

    .line 744
    invoke-static {v14, v15, v9, v10}, La/ne60;->e(JJ)J

    .line 745
    .line 746
    .line 747
    move-result-wide v9

    .line 748
    shr-long v12, v5, v16

    .line 749
    .line 750
    long-to-int v0, v12

    .line 751
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 752
    .line 753
    .line 754
    move-result v26

    .line 755
    and-long v5, v5, v17

    .line 756
    .line 757
    long-to-int v0, v5

    .line 758
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 759
    .line 760
    .line 761
    move-result v27

    .line 762
    shr-long v5, v9, v16

    .line 763
    .line 764
    long-to-int v0, v5

    .line 765
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 766
    .line 767
    .line 768
    move-result v28

    .line 769
    and-long v5, v9, v17

    .line 770
    .line 771
    long-to-int v0, v5

    .line 772
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 773
    .line 774
    .line 775
    move-result v29

    .line 776
    shr-long v5, v14, v16

    .line 777
    .line 778
    long-to-int v0, v5

    .line 779
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 780
    .line 781
    .line 782
    move-result v30

    .line 783
    and-long v5, v14, v17

    .line 784
    .line 785
    long-to-int v0, v5

    .line 786
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 787
    .line 788
    .line 789
    move-result v31

    .line 790
    iget-object v0, v3, La/w03;->a:Landroid/graphics/Path;

    .line 791
    .line 792
    move-object/from16 v25, v0

    .line 793
    .line 794
    invoke-virtual/range {v25 .. v31}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 795
    .line 796
    .line 797
    move/from16 v0, p0

    .line 798
    .line 799
    move/from16 v2, p1

    .line 800
    .line 801
    move v10, v7

    .line 802
    const/16 v7, 0xa

    .line 803
    .line 804
    goto/16 :goto_6

    .line 805
    .line 806
    :cond_9
    move v7, v10

    .line 807
    invoke-static {}, La/z03;->a()La/w03;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    invoke-static {v4, v3}, La/w03;->a(La/w03;La/w03;)V

    .line 812
    .line 813
    .line 814
    iget-object v0, v8, La/pi9;->a:La/y99;

    .line 815
    .line 816
    invoke-interface {v0}, La/y99;->d()J

    .line 817
    .line 818
    .line 819
    move-result-wide v5

    .line 820
    shr-long v5, v5, v16

    .line 821
    .line 822
    long-to-int v0, v5

    .line 823
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    iget-object v2, v8, La/pi9;->a:La/y99;

    .line 828
    .line 829
    invoke-interface {v2}, La/y99;->d()J

    .line 830
    .line 831
    .line 832
    move-result-wide v5

    .line 833
    and-long v5, v5, v17

    .line 834
    .line 835
    long-to-int v2, v5

    .line 836
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 837
    .line 838
    .line 839
    move-result v2

    .line 840
    invoke-virtual {v4, v0, v2}, La/w03;->e(FF)V

    .line 841
    .line 842
    .line 843
    iget-object v0, v8, La/pi9;->a:La/y99;

    .line 844
    .line 845
    invoke-interface {v0}, La/y99;->d()J

    .line 846
    .line 847
    .line 848
    move-result-wide v5

    .line 849
    and-long v5, v5, v17

    .line 850
    .line 851
    long-to-int v0, v5

    .line 852
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    move/from16 v2, v22

    .line 857
    .line 858
    invoke-virtual {v4, v2, v0}, La/w03;->e(FF)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v4}, La/w03;->c()V

    .line 862
    .line 863
    .line 864
    invoke-static {}, La/z03;->a()La/w03;

    .line 865
    .line 866
    .line 867
    move-result-object v5

    .line 868
    invoke-static {v5, v3}, La/w03;->a(La/w03;La/w03;)V

    .line 869
    .line 870
    .line 871
    iget-object v0, v8, La/pi9;->a:La/y99;

    .line 872
    .line 873
    invoke-interface {v0}, La/y99;->d()J

    .line 874
    .line 875
    .line 876
    move-result-wide v9

    .line 877
    shr-long v9, v9, v16

    .line 878
    .line 879
    long-to-int v0, v9

    .line 880
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 881
    .line 882
    .line 883
    move-result v0

    .line 884
    invoke-virtual {v5, v0, v2}, La/w03;->e(FF)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v5, v2, v2}, La/w03;->e(FF)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {v5}, La/w03;->c()V

    .line 891
    .line 892
    .line 893
    new-instance v6, Ljava/util/ArrayList;

    .line 894
    .line 895
    const/16 v0, 0xa

    .line 896
    .line 897
    invoke-static {v1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 898
    .line 899
    .line 900
    move-result v0

    .line 901
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 902
    .line 903
    .line 904
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 909
    .line 910
    .line 911
    move-result v1

    .line 912
    if-eqz v1, :cond_a

    .line 913
    .line 914
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v1

    .line 918
    check-cast v1, La/nch0;

    .line 919
    .line 920
    iget v1, v1, La/nch0;->b:I

    .line 921
    .line 922
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v24

    .line 926
    sget-object v1, La/qmk;->a:La/zcl;

    .line 927
    .line 928
    const/high16 v1, 0x41400000    # 12.0f

    .line 929
    .line 930
    invoke-virtual {v8}, La/pi9;->getDensity()F

    .line 931
    .line 932
    .line 933
    move-result v2

    .line 934
    mul-float/2addr v2, v1

    .line 935
    float-to-int v1, v2

    .line 936
    const/high16 v2, 0x42000000    # 32.0f

    .line 937
    .line 938
    invoke-virtual {v8}, La/pi9;->getDensity()F

    .line 939
    .line 940
    .line 941
    move-result v9

    .line 942
    mul-float/2addr v9, v2

    .line 943
    float-to-int v2, v9

    .line 944
    sget-object v38, La/j1t0;->c:La/qrq;

    .line 945
    .line 946
    sget-wide v35, La/qmk;->p:J

    .line 947
    .line 948
    sget-wide v44, La/qmk;->C:J

    .line 949
    .line 950
    new-instance v32, La/y9q0;

    .line 951
    .line 952
    const/16 v43, 0x0

    .line 953
    .line 954
    const v46, 0xfdffdd

    .line 955
    .line 956
    .line 957
    const-wide/16 v33, 0x0

    .line 958
    .line 959
    const/16 v37, 0x0

    .line 960
    .line 961
    const-wide/16 v39, 0x0

    .line 962
    .line 963
    const/16 v41, 0x0

    .line 964
    .line 965
    const/16 v42, 0x0

    .line 966
    .line 967
    invoke-direct/range {v32 .. v46}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 968
    .line 969
    .line 970
    const/4 v9, 0x0

    .line 971
    invoke-static {v9, v2, v1, v1}, La/lgb;->O(IIII)J

    .line 972
    .line 973
    .line 974
    move-result-wide v28

    .line 975
    const/16 v30, 0x0

    .line 976
    .line 977
    const/16 v31, 0x3c8

    .line 978
    .line 979
    const/16 v26, 0x2

    .line 980
    .line 981
    const/16 v27, 0x1

    .line 982
    .line 983
    move-object/from16 v25, v32

    .line 984
    .line 985
    invoke-static/range {v23 .. v31}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 986
    .line 987
    .line 988
    move-result-object v1

    .line 989
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 990
    .line 991
    .line 992
    goto :goto_7

    .line 993
    :cond_a
    new-instance v1, La/vta;

    .line 994
    .line 995
    move-object v2, v11

    .line 996
    invoke-direct/range {v1 .. v7}, La/vta;-><init>(La/mch0;La/w03;La/w03;La/w03;Ljava/util/ArrayList;F)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v8, v1}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    return-object v0

    .line 1004
    :pswitch_8
    check-cast v11, La/t33;

    .line 1005
    .line 1006
    check-cast v10, La/t33;

    .line 1007
    .line 1008
    move-object/from16 v0, p1

    .line 1009
    .line 1010
    check-cast v0, La/uag0;

    .line 1011
    .line 1012
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1013
    .line 1014
    .line 1015
    const v1, 0x3f4ccccd    # 0.8f

    .line 1016
    .line 1017
    .line 1018
    invoke-static {v1, v1}, La/osm0;->e(FF)J

    .line 1019
    .line 1020
    .line 1021
    move-result-wide v1

    .line 1022
    invoke-virtual {v0, v1, v2}, La/uag0;->G(J)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v11}, La/t33;->d()Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    check-cast v1, Ljava/lang/Number;

    .line 1030
    .line 1031
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1032
    .line 1033
    .line 1034
    move-result v1

    .line 1035
    mul-float/2addr v1, v3

    .line 1036
    invoke-virtual {v0, v1}, La/uag0;->I(F)V

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v10}, La/t33;->d()Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v1

    .line 1043
    check-cast v1, Ljava/lang/Number;

    .line 1044
    .line 1045
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1046
    .line 1047
    .line 1048
    move-result v1

    .line 1049
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

    .line 1050
    .line 1051
    .line 1052
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1053
    .line 1054
    return-object v0

    .line 1055
    :pswitch_9
    check-cast v11, Ljava/util/ArrayList;

    .line 1056
    .line 1057
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 1058
    .line 1059
    move-object/from16 v0, p1

    .line 1060
    .line 1061
    check-cast v0, La/hcz;

    .line 1062
    .line 1063
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1067
    .line 1068
    .line 1069
    move-result v1

    .line 1070
    new-instance v2, La/j13;

    .line 1071
    .line 1072
    const/16 v4, 0x16

    .line 1073
    .line 1074
    const/4 v9, 0x0

    .line 1075
    invoke-direct {v2, v11, v4, v9}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v4, La/ub90;

    .line 1079
    .line 1080
    invoke-direct {v4, v11, v3, v10}, La/ub90;-><init>(Ljava/util/ArrayList;FLkotlin/jvm/functions/Function2;)V

    .line 1081
    .line 1082
    .line 1083
    new-instance v3, La/ugd;

    .line 1084
    .line 1085
    invoke-direct {v3, v6, v15, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1086
    .line 1087
    .line 1088
    move-object/from16 v4, v21

    .line 1089
    .line 1090
    invoke-virtual {v0, v1, v4, v2, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1091
    .line 1092
    .line 1093
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1094
    .line 1095
    return-object v0

    .line 1096
    :pswitch_a
    check-cast v11, La/a4x;

    .line 1097
    .line 1098
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 1099
    .line 1100
    move-object/from16 v25, p1

    .line 1101
    .line 1102
    check-cast v25, La/i8z;

    .line 1103
    .line 1104
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    new-instance v0, La/ljc0;

    .line 1108
    .line 1109
    invoke-direct {v0, v13}, La/ljc0;-><init>(B)V

    .line 1110
    .line 1111
    .line 1112
    new-instance v1, La/ljc0;

    .line 1113
    .line 1114
    const/16 v2, 0xd

    .line 1115
    .line 1116
    invoke-direct {v1, v2}, La/ljc0;-><init>(B)V

    .line 1117
    .line 1118
    .line 1119
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 1120
    .line 1121
    .line 1122
    move-result v26

    .line 1123
    new-instance v2, La/zu90;

    .line 1124
    .line 1125
    const/16 v4, 0x16

    .line 1126
    .line 1127
    invoke-direct {v2, v4, v0, v11}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1128
    .line 1129
    .line 1130
    new-instance v0, La/zu90;

    .line 1131
    .line 1132
    const/16 v5, 0x17

    .line 1133
    .line 1134
    invoke-direct {v0, v5, v1, v11}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1135
    .line 1136
    .line 1137
    new-instance v1, La/umh;

    .line 1138
    .line 1139
    invoke-direct {v1, v11, v3, v10, v8}, La/umh;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function1;B)V

    .line 1140
    .line 1141
    .line 1142
    new-instance v3, La/ugd;

    .line 1143
    .line 1144
    invoke-direct {v3, v12, v15, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1145
    .line 1146
    .line 1147
    const/16 v28, 0x0

    .line 1148
    .line 1149
    move-object/from16 v29, v0

    .line 1150
    .line 1151
    move-object/from16 v27, v2

    .line 1152
    .line 1153
    move-object/from16 v30, v3

    .line 1154
    .line 1155
    invoke-virtual/range {v25 .. v30}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 1156
    .line 1157
    .line 1158
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1159
    .line 1160
    return-object v0

    .line 1161
    :pswitch_b
    check-cast v11, La/a4x;

    .line 1162
    .line 1163
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 1164
    .line 1165
    move-object/from16 v0, p1

    .line 1166
    .line 1167
    check-cast v0, La/hcz;

    .line 1168
    .line 1169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1170
    .line 1171
    .line 1172
    new-instance v1, La/o240;

    .line 1173
    .line 1174
    const/16 v2, 0xf

    .line 1175
    .line 1176
    invoke-direct {v1, v2}, La/o240;-><init>(B)V

    .line 1177
    .line 1178
    .line 1179
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 1180
    .line 1181
    .line 1182
    move-result v2

    .line 1183
    new-instance v4, La/ygy;

    .line 1184
    .line 1185
    invoke-direct {v4, v1, v11, v5}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1186
    .line 1187
    .line 1188
    new-instance v1, La/ap30;

    .line 1189
    .line 1190
    const/16 v5, 0x10

    .line 1191
    .line 1192
    invoke-direct {v1, v11, v5}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 1193
    .line 1194
    .line 1195
    new-instance v5, La/p0i;

    .line 1196
    .line 1197
    invoke-direct {v5, v11, v3, v10, v8}, La/p0i;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function2;B)V

    .line 1198
    .line 1199
    .line 1200
    new-instance v3, La/ugd;

    .line 1201
    .line 1202
    const v6, 0x799532c4

    .line 1203
    .line 1204
    .line 1205
    invoke-direct {v3, v6, v15, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v0, v2, v4, v1, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1209
    .line 1210
    .line 1211
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1212
    .line 1213
    return-object v0

    .line 1214
    :pswitch_c
    check-cast v11, La/w03;

    .line 1215
    .line 1216
    check-cast v10, La/a4x;

    .line 1217
    .line 1218
    move-object/from16 v32, p1

    .line 1219
    .line 1220
    check-cast v32, La/fhl;

    .line 1221
    .line 1222
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1223
    .line 1224
    .line 1225
    invoke-interface/range {v32 .. v32}, La/fhl;->A0()La/nr;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v1

    .line 1229
    invoke-virtual {v1}, La/nr;->p()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v4

    .line 1233
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    invoke-interface {v0}, La/x5a;->l()V

    .line 1238
    .line 1239
    .line 1240
    :try_start_0
    iget-object v0, v1, La/nr;->b:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v0, La/fvt0;

    .line 1243
    .line 1244
    invoke-virtual {v0, v11}, La/fvt0;->i(La/w03;)V

    .line 1245
    .line 1246
    .line 1247
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    const/4 v2, 0x0

    .line 1252
    const/4 v6, 0x0

    .line 1253
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1254
    .line 1255
    .line 1256
    move-result v7

    .line 1257
    if-eqz v7, :cond_f

    .line 1258
    .line 1259
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v7

    .line 1263
    add-int/lit8 v8, v2, 0x1

    .line 1264
    .line 1265
    if-ltz v2, :cond_e

    .line 1266
    .line 1267
    check-cast v7, Ljava/lang/Number;

    .line 1268
    .line 1269
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 1270
    .line 1271
    .line 1272
    move-result v7

    .line 1273
    div-float/2addr v7, v3

    .line 1274
    invoke-interface/range {v32 .. v32}, La/fhl;->d()J

    .line 1275
    .line 1276
    .line 1277
    move-result-wide v9

    .line 1278
    shr-long v9, v9, v16

    .line 1279
    .line 1280
    long-to-int v9, v9

    .line 1281
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1282
    .line 1283
    .line 1284
    move-result v9

    .line 1285
    mul-float/2addr v7, v9

    .line 1286
    const/high16 v9, 0x3f000000    # 0.5f

    .line 1287
    .line 1288
    cmpl-float v9, v7, v9

    .line 1289
    .line 1290
    if-lez v9, :cond_d

    .line 1291
    .line 1292
    rem-int/lit8 v2, v2, 0x3

    .line 1293
    .line 1294
    if-eqz v2, :cond_c

    .line 1295
    .line 1296
    if-eq v2, v15, :cond_b

    .line 1297
    .line 1298
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1299
    .line 1300
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getYellow-0d7_KjU()J

    .line 1301
    .line 1302
    .line 1303
    move-result-wide v9

    .line 1304
    :goto_9
    move-wide/from16 v33, v9

    .line 1305
    .line 1306
    goto :goto_a

    .line 1307
    :catchall_0
    move-exception v0

    .line 1308
    goto :goto_b

    .line 1309
    :cond_b
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1310
    .line 1311
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getDarkBlue-0d7_KjU()J

    .line 1312
    .line 1313
    .line 1314
    move-result-wide v9

    .line 1315
    goto :goto_9

    .line 1316
    :cond_c
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1317
    .line 1318
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    .line 1319
    .line 1320
    .line 1321
    move-result-wide v9

    .line 1322
    goto :goto_9

    .line 1323
    :goto_a
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1324
    .line 1325
    .line 1326
    move-result v2

    .line 1327
    int-to-long v9, v2

    .line 1328
    const/16 v22, 0x0

    .line 1329
    .line 1330
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1331
    .line 1332
    .line 1333
    move-result v2

    .line 1334
    int-to-long v11, v2

    .line 1335
    shl-long v9, v9, v16

    .line 1336
    .line 1337
    and-long v11, v11, v17

    .line 1338
    .line 1339
    or-long v35, v9, v11

    .line 1340
    .line 1341
    invoke-interface/range {v32 .. v32}, La/fhl;->d()J

    .line 1342
    .line 1343
    .line 1344
    move-result-wide v9

    .line 1345
    and-long v9, v9, v17

    .line 1346
    .line 1347
    long-to-int v2, v9

    .line 1348
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1349
    .line 1350
    .line 1351
    move-result v2

    .line 1352
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1353
    .line 1354
    .line 1355
    move-result v9

    .line 1356
    int-to-long v9, v9

    .line 1357
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1358
    .line 1359
    .line 1360
    move-result v2

    .line 1361
    int-to-long v11, v2

    .line 1362
    shl-long v9, v9, v16

    .line 1363
    .line 1364
    and-long v11, v11, v17

    .line 1365
    .line 1366
    or-long v37, v9, v11

    .line 1367
    .line 1368
    const/16 v42, 0x0

    .line 1369
    .line 1370
    const/16 v43, 0x78

    .line 1371
    .line 1372
    const/16 v39, 0x0

    .line 1373
    .line 1374
    const/16 v40, 0x0

    .line 1375
    .line 1376
    const/16 v41, 0x0

    .line 1377
    .line 1378
    invoke-static/range {v32 .. v43}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 1379
    .line 1380
    .line 1381
    :cond_d
    add-float/2addr v6, v7

    .line 1382
    move v2, v8

    .line 1383
    goto/16 :goto_8

    .line 1384
    .line 1385
    :cond_e
    invoke-static {}, La/q3d;->p()V

    .line 1386
    .line 1387
    .line 1388
    const/16 v21, 0x0

    .line 1389
    .line 1390
    throw v21
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1391
    :cond_f
    invoke-static {v1, v4, v5}, Lc;->g(La/nr;J)V

    .line 1392
    .line 1393
    .line 1394
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1395
    .line 1396
    return-object v0

    .line 1397
    :goto_b
    invoke-static {v1, v4, v5}, Lc;->g(La/nr;J)V

    .line 1398
    .line 1399
    .line 1400
    throw v0

    .line 1401
    :pswitch_d
    check-cast v11, La/jie0;

    .line 1402
    .line 1403
    check-cast v10, La/u8z;

    .line 1404
    .line 1405
    move-object/from16 v0, p1

    .line 1406
    .line 1407
    check-cast v0, La/i73;

    .line 1408
    .line 1409
    const/16 v22, 0x0

    .line 1410
    .line 1411
    cmpl-float v1, v3, v22

    .line 1412
    .line 1413
    if-lez v1, :cond_11

    .line 1414
    .line 1415
    iget-object v1, v0, La/i73;->e:La/pz40;

    .line 1416
    .line 1417
    check-cast v1, La/hgk0;

    .line 1418
    .line 1419
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v1

    .line 1423
    check-cast v1, Ljava/lang/Number;

    .line 1424
    .line 1425
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1426
    .line 1427
    .line 1428
    move-result v1

    .line 1429
    cmpl-float v2, v1, v3

    .line 1430
    .line 1431
    if-lez v2, :cond_10

    .line 1432
    .line 1433
    goto :goto_c

    .line 1434
    :cond_10
    move v3, v1

    .line 1435
    goto :goto_c

    .line 1436
    :cond_11
    const/16 v22, 0x0

    .line 1437
    .line 1438
    cmpg-float v1, v3, v22

    .line 1439
    .line 1440
    if-gez v1, :cond_12

    .line 1441
    .line 1442
    iget-object v1, v0, La/i73;->e:La/pz40;

    .line 1443
    .line 1444
    check-cast v1, La/hgk0;

    .line 1445
    .line 1446
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v1

    .line 1450
    check-cast v1, Ljava/lang/Number;

    .line 1451
    .line 1452
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1453
    .line 1454
    .line 1455
    move-result v1

    .line 1456
    cmpg-float v2, v1, v3

    .line 1457
    .line 1458
    if-gez v2, :cond_10

    .line 1459
    .line 1460
    goto :goto_c

    .line 1461
    :cond_12
    const/4 v3, 0x0

    .line 1462
    :goto_c
    iget v1, v11, La/jie0;->a:F

    .line 1463
    .line 1464
    sub-float v1, v3, v1

    .line 1465
    .line 1466
    invoke-interface {v10, v1}, La/qah0;->a(F)F

    .line 1467
    .line 1468
    .line 1469
    move-result v2

    .line 1470
    cmpg-float v2, v1, v2

    .line 1471
    .line 1472
    if-nez v2, :cond_13

    .line 1473
    .line 1474
    iget-object v2, v0, La/i73;->e:La/pz40;

    .line 1475
    .line 1476
    check-cast v2, La/hgk0;

    .line 1477
    .line 1478
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v2

    .line 1482
    check-cast v2, Ljava/lang/Number;

    .line 1483
    .line 1484
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 1485
    .line 1486
    .line 1487
    move-result v2

    .line 1488
    cmpg-float v2, v3, v2

    .line 1489
    .line 1490
    if-nez v2, :cond_13

    .line 1491
    .line 1492
    goto :goto_d

    .line 1493
    :cond_13
    invoke-virtual {v0}, La/i73;->a()V

    .line 1494
    .line 1495
    .line 1496
    :goto_d
    iget v0, v11, La/jie0;->a:F

    .line 1497
    .line 1498
    add-float/2addr v0, v1

    .line 1499
    iput v0, v11, La/jie0;->a:F

    .line 1500
    .line 1501
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1502
    .line 1503
    return-object v0

    .line 1504
    :pswitch_e
    check-cast v11, La/wjw;

    .line 1505
    .line 1506
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 1507
    .line 1508
    move-object/from16 v4, p1

    .line 1509
    .line 1510
    check-cast v4, La/i8z;

    .line 1511
    .line 1512
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1513
    .line 1514
    .line 1515
    iget-object v0, v11, La/wjw;->a:La/a4x;

    .line 1516
    .line 1517
    new-instance v1, La/x2w;

    .line 1518
    .line 1519
    const/16 v2, 0x10

    .line 1520
    .line 1521
    invoke-direct {v1, v2}, La/x2w;-><init>(B)V

    .line 1522
    .line 1523
    .line 1524
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1525
    .line 1526
    .line 1527
    move-result v5

    .line 1528
    new-instance v6, La/d2p;

    .line 1529
    .line 1530
    const/16 v2, 0x17

    .line 1531
    .line 1532
    invoke-direct {v6, v1, v0, v2}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1533
    .line 1534
    .line 1535
    new-instance v8, La/far;

    .line 1536
    .line 1537
    const/16 v1, 0x13

    .line 1538
    .line 1539
    invoke-direct {v8, v0, v1}, La/far;-><init>(Ljava/util/List;B)V

    .line 1540
    .line 1541
    .line 1542
    new-instance v1, La/p0i;

    .line 1543
    .line 1544
    invoke-direct {v1, v0, v3, v10, v15}, La/p0i;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function2;B)V

    .line 1545
    .line 1546
    .line 1547
    new-instance v9, La/ugd;

    .line 1548
    .line 1549
    const v0, -0x73c450aa

    .line 1550
    .line 1551
    .line 1552
    invoke-direct {v9, v0, v15, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1553
    .line 1554
    .line 1555
    const/4 v7, 0x0

    .line 1556
    invoke-virtual/range {v4 .. v9}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 1557
    .line 1558
    .line 1559
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1560
    .line 1561
    return-object v0

    .line 1562
    :pswitch_f
    check-cast v11, La/pz40;

    .line 1563
    .line 1564
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 1565
    .line 1566
    move-object/from16 v0, p1

    .line 1567
    .line 1568
    check-cast v0, La/hcz;

    .line 1569
    .line 1570
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1571
    .line 1572
    .line 1573
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v1

    .line 1577
    check-cast v1, La/kcv0;

    .line 1578
    .line 1579
    iget-object v1, v1, La/kcv0;->a:La/a4x;

    .line 1580
    .line 1581
    new-instance v2, La/umu;

    .line 1582
    .line 1583
    move/from16 v5, v19

    .line 1584
    .line 1585
    invoke-direct {v2, v5}, La/umu;-><init>(B)V

    .line 1586
    .line 1587
    .line 1588
    invoke-static {v1, v2}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v2

    .line 1592
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1593
    .line 1594
    .line 1595
    move-result v5

    .line 1596
    new-instance v6, La/far;

    .line 1597
    .line 1598
    const/16 v7, 0xb

    .line 1599
    .line 1600
    invoke-direct {v6, v2, v7}, La/far;-><init>(Ljava/util/List;B)V

    .line 1601
    .line 1602
    .line 1603
    new-instance v2, La/ubn;

    .line 1604
    .line 1605
    const/4 v7, 0x5

    .line 1606
    invoke-direct {v2, v1, v7}, La/ubn;-><init>(La/a4x;B)V

    .line 1607
    .line 1608
    .line 1609
    new-instance v7, La/vgv;

    .line 1610
    .line 1611
    invoke-direct {v7, v1, v11, v3, v10}, La/vgv;-><init>(La/a4x;La/pz40;FLkotlin/jvm/functions/Function1;)V

    .line 1612
    .line 1613
    .line 1614
    new-instance v1, La/ugd;

    .line 1615
    .line 1616
    invoke-direct {v1, v4, v15, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1617
    .line 1618
    .line 1619
    invoke-virtual {v0, v5, v6, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1620
    .line 1621
    .line 1622
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1623
    .line 1624
    return-object v0

    .line 1625
    :pswitch_10
    check-cast v11, La/agk0;

    .line 1626
    .line 1627
    check-cast v10, La/pz40;

    .line 1628
    .line 1629
    move-object/from16 v0, p1

    .line 1630
    .line 1631
    check-cast v0, La/t33;

    .line 1632
    .line 1633
    iget-object v1, v0, La/t33;->e:La/pz40;

    .line 1634
    .line 1635
    check-cast v1, La/hgk0;

    .line 1636
    .line 1637
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v1

    .line 1641
    check-cast v1, Ljava/lang/Number;

    .line 1642
    .line 1643
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1644
    .line 1645
    .line 1646
    move-result v1

    .line 1647
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v0

    .line 1651
    check-cast v0, Ljava/lang/Number;

    .line 1652
    .line 1653
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 1654
    .line 1655
    .line 1656
    move-result v0

    .line 1657
    cmpg-float v0, v1, v0

    .line 1658
    .line 1659
    if-nez v0, :cond_17

    .line 1660
    .line 1661
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    check-cast v0, La/fah0;

    .line 1666
    .line 1667
    if-nez v0, :cond_14

    .line 1668
    .line 1669
    goto :goto_e

    .line 1670
    :cond_14
    instance-of v1, v0, La/z9h0;

    .line 1671
    .line 1672
    if-eqz v1, :cond_15

    .line 1673
    .line 1674
    const/4 v3, 0x0

    .line 1675
    goto :goto_e

    .line 1676
    :cond_15
    instance-of v0, v0, La/cah0;

    .line 1677
    .line 1678
    if-eqz v0, :cond_16

    .line 1679
    .line 1680
    :goto_e
    invoke-virtual {v11, v3}, La/agk0;->m(F)V

    .line 1681
    .line 1682
    .line 1683
    goto :goto_f

    .line 1684
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 1685
    .line 1686
    .line 1687
    move-object/from16 v15, v21

    .line 1688
    .line 1689
    goto :goto_10

    .line 1690
    :cond_17
    :goto_f
    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1691
    .line 1692
    :goto_10
    return-object v15

    .line 1693
    :pswitch_11
    check-cast v11, La/wom;

    .line 1694
    .line 1695
    check-cast v10, La/yjj0;

    .line 1696
    .line 1697
    move-object/from16 v0, p1

    .line 1698
    .line 1699
    check-cast v0, La/uag0;

    .line 1700
    .line 1701
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1702
    .line 1703
    .line 1704
    invoke-virtual {v11}, La/wom;->c()F

    .line 1705
    .line 1706
    .line 1707
    move-result v1

    .line 1708
    const/16 v22, 0x0

    .line 1709
    .line 1710
    cmpl-float v1, v1, v22

    .line 1711
    .line 1712
    if-gtz v1, :cond_19

    .line 1713
    .line 1714
    iget-object v1, v11, La/wom;->c:La/pz40;

    .line 1715
    .line 1716
    check-cast v1, La/hgk0;

    .line 1717
    .line 1718
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v1

    .line 1722
    check-cast v1, Ljava/lang/Boolean;

    .line 1723
    .line 1724
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1725
    .line 1726
    .line 1727
    move-result v1

    .line 1728
    if-eqz v1, :cond_18

    .line 1729
    .line 1730
    goto :goto_11

    .line 1731
    :cond_18
    const/4 v2, 0x0

    .line 1732
    goto :goto_12

    .line 1733
    :cond_19
    :goto_11
    move v2, v15

    .line 1734
    :goto_12
    invoke-virtual {v11}, La/wom;->c()F

    .line 1735
    .line 1736
    .line 1737
    move-result v1

    .line 1738
    invoke-interface {v0, v3}, La/w6k;->T(F)I

    .line 1739
    .line 1740
    .line 1741
    move-result v3

    .line 1742
    int-to-float v3, v3

    .line 1743
    mul-float/2addr v1, v3

    .line 1744
    iget-wide v3, v0, La/uag0;->r:J

    .line 1745
    .line 1746
    and-long v3, v3, v17

    .line 1747
    .line 1748
    long-to-int v3, v3

    .line 1749
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1750
    .line 1751
    .line 1752
    move-result v3

    .line 1753
    sub-float/2addr v1, v3

    .line 1754
    invoke-virtual {v0, v1}, La/uag0;->I(F)V

    .line 1755
    .line 1756
    .line 1757
    if-eqz v2, :cond_1a

    .line 1758
    .line 1759
    sget v1, La/mom;->c:F

    .line 1760
    .line 1761
    iget-object v2, v0, La/uag0;->t:La/w6k;

    .line 1762
    .line 1763
    invoke-interface {v2}, La/w6k;->getDensity()F

    .line 1764
    .line 1765
    .line 1766
    move-result v2

    .line 1767
    mul-float v3, v2, v1

    .line 1768
    .line 1769
    goto :goto_13

    .line 1770
    :cond_1a
    const/4 v3, 0x0

    .line 1771
    :goto_13
    invoke-virtual {v0, v3}, La/uag0;->C(F)V

    .line 1772
    .line 1773
    .line 1774
    invoke-virtual {v0, v10}, La/uag0;->D(La/yjj0;)V

    .line 1775
    .line 1776
    .line 1777
    invoke-virtual {v0, v15}, La/uag0;->g(Z)V

    .line 1778
    .line 1779
    .line 1780
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1781
    .line 1782
    return-object v0

    .line 1783
    :pswitch_12
    check-cast v11, La/zpl;

    .line 1784
    .line 1785
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 1786
    .line 1787
    move-object/from16 v0, p1

    .line 1788
    .line 1789
    check-cast v0, La/hcz;

    .line 1790
    .line 1791
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1792
    .line 1793
    .line 1794
    iget-object v1, v11, La/zpl;->c:La/a4x;

    .line 1795
    .line 1796
    new-instance v2, La/m7h;

    .line 1797
    .line 1798
    const/16 v5, 0x1b

    .line 1799
    .line 1800
    invoke-direct {v2, v5}, La/m7h;-><init>(B)V

    .line 1801
    .line 1802
    .line 1803
    new-instance v5, La/m7h;

    .line 1804
    .line 1805
    invoke-direct {v5, v14}, La/m7h;-><init>(B)V

    .line 1806
    .line 1807
    .line 1808
    invoke-static {v1, v2}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v2

    .line 1812
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1813
    .line 1814
    .line 1815
    move-result v6

    .line 1816
    new-instance v7, La/bzh;

    .line 1817
    .line 1818
    invoke-direct {v7, v2, v9}, La/bzh;-><init>(Ljava/util/List;B)V

    .line 1819
    .line 1820
    .line 1821
    new-instance v2, La/vtf;

    .line 1822
    .line 1823
    const/16 v8, 0xd

    .line 1824
    .line 1825
    invoke-direct {v2, v5, v1, v8}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1826
    .line 1827
    .line 1828
    new-instance v5, La/p0i;

    .line 1829
    .line 1830
    const/4 v9, 0x0

    .line 1831
    invoke-direct {v5, v1, v3, v10, v9}, La/p0i;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function2;B)V

    .line 1832
    .line 1833
    .line 1834
    new-instance v1, La/ugd;

    .line 1835
    .line 1836
    invoke-direct {v1, v4, v15, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v0, v6, v7, v2, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1840
    .line 1841
    .line 1842
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1843
    .line 1844
    return-object v0

    .line 1845
    :pswitch_13
    check-cast v11, La/wmh;

    .line 1846
    .line 1847
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 1848
    .line 1849
    move-object/from16 v4, p1

    .line 1850
    .line 1851
    check-cast v4, La/i8z;

    .line 1852
    .line 1853
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1854
    .line 1855
    .line 1856
    iget-object v0, v11, La/wmh;->a:La/a4x;

    .line 1857
    .line 1858
    new-instance v1, La/p1h;

    .line 1859
    .line 1860
    const/16 v2, 0x11

    .line 1861
    .line 1862
    invoke-direct {v1, v2}, La/p1h;-><init>(B)V

    .line 1863
    .line 1864
    .line 1865
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1866
    .line 1867
    .line 1868
    move-result v5

    .line 1869
    new-instance v6, La/vtf;

    .line 1870
    .line 1871
    const/4 v2, 0x7

    .line 1872
    invoke-direct {v6, v1, v0, v2}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1873
    .line 1874
    .line 1875
    new-instance v8, La/dx8;

    .line 1876
    .line 1877
    invoke-direct {v8, v0, v14}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 1878
    .line 1879
    .line 1880
    new-instance v1, La/umh;

    .line 1881
    .line 1882
    const/4 v9, 0x0

    .line 1883
    invoke-direct {v1, v0, v3, v10, v9}, La/umh;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function1;B)V

    .line 1884
    .line 1885
    .line 1886
    new-instance v9, La/ugd;

    .line 1887
    .line 1888
    const v0, -0x73c450aa

    .line 1889
    .line 1890
    .line 1891
    invoke-direct {v9, v0, v15, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1892
    .line 1893
    .line 1894
    const/4 v7, 0x0

    .line 1895
    invoke-virtual/range {v4 .. v9}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 1896
    .line 1897
    .line 1898
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1899
    .line 1900
    return-object v0

    .line 1901
    :pswitch_14
    move-object v2, v11

    .line 1902
    check-cast v2, La/vz2;

    .line 1903
    .line 1904
    move-object v6, v10

    .line 1905
    check-cast v6, La/m78;

    .line 1906
    .line 1907
    move-object/from16 v1, p1

    .line 1908
    .line 1909
    check-cast v1, La/g7z;

    .line 1910
    .line 1911
    invoke-virtual {v1}, La/g7z;->a()V

    .line 1912
    .line 1913
    .line 1914
    iget-object v0, v1, La/g7z;->a:La/a6a;

    .line 1915
    .line 1916
    iget-object v9, v0, La/a6a;->b:La/nr;

    .line 1917
    .line 1918
    invoke-virtual {v9}, La/nr;->p()J

    .line 1919
    .line 1920
    .line 1921
    move-result-wide v10

    .line 1922
    invoke-virtual {v9}, La/nr;->i()La/x5a;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v0

    .line 1926
    invoke-interface {v0}, La/x5a;->l()V

    .line 1927
    .line 1928
    .line 1929
    :try_start_1
    iget-object v0, v9, La/nr;->b:Ljava/lang/Object;

    .line 1930
    .line 1931
    check-cast v0, La/fvt0;

    .line 1932
    .line 1933
    const/4 v4, 0x0

    .line 1934
    invoke-virtual {v0, v3, v4}, La/fvt0;->A(FF)V

    .line 1935
    .line 1936
    .line 1937
    const/high16 v3, 0x42340000    # 45.0f

    .line 1938
    .line 1939
    const-wide/16 v4, 0x0

    .line 1940
    .line 1941
    invoke-virtual {v0, v3, v4, v5}, La/fvt0;->y(FJ)V

    .line 1942
    .line 1943
    .line 1944
    const/4 v7, 0x0

    .line 1945
    const/16 v8, 0x2e

    .line 1946
    .line 1947
    const-wide/16 v3, 0x0

    .line 1948
    .line 1949
    const/4 v5, 0x0

    .line 1950
    invoke-static/range {v1 .. v8}, La/fhl;->m0(La/fhl;La/vz2;JFLa/a4d;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1951
    .line 1952
    .line 1953
    invoke-static {v9, v10, v11}, Lc;->g(La/nr;J)V

    .line 1954
    .line 1955
    .line 1956
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1957
    .line 1958
    return-object v0

    .line 1959
    :catchall_1
    move-exception v0

    .line 1960
    invoke-static {v9, v10, v11}, Lc;->g(La/nr;J)V

    .line 1961
    .line 1962
    .line 1963
    throw v0

    .line 1964
    nop

    .line 1965
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
