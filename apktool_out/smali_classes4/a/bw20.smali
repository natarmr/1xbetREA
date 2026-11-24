.class public final synthetic La/bw20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/cp;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bw20;->a:B

    iput-object p1, p0, La/bw20;->b:Ljava/lang/Object;

    iput-object p2, p0, La/bw20;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/bw20;->a:B

    iput-object p1, p0, La/bw20;->c:Ljava/lang/Object;

    iput-object p2, p0, La/bw20;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bw20;->a:B

    .line 4
    .line 5
    sget-object v5, La/bj80;->a:La/bj80;

    .line 6
    .line 7
    sget-object v7, La/ej80;->a:La/ej80;

    .line 8
    .line 9
    sget-object v8, La/bwh0;->a:La/bwh0;

    .line 10
    .line 11
    sget-object v10, La/hj80;->a:La/hj80;

    .line 12
    .line 13
    const/16 v11, 0x8

    .line 14
    .line 15
    const/16 v12, 0x9

    .line 16
    .line 17
    const/4 v13, 0x3

    .line 18
    const v15, 0x2fd4df92

    .line 19
    .line 20
    .line 21
    const/16 v3, 0xb

    .line 22
    .line 23
    const v2, 0x799532c4

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    const/4 v6, 0x1

    .line 28
    const/4 v9, 0x0

    .line 29
    iget-object v14, v0, La/bw20;->b:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v0, v0, La/bw20;->c:Ljava/lang/Object;

    .line 32
    .line 33
    packed-switch v1, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/MultiLineChipsListView;

    .line 37
    .line 38
    check-cast v14, La/aw40;

    .line 39
    .line 40
    move-object/from16 v1, p1

    .line 41
    .line 42
    check-cast v1, Landroid/view/View;

    .line 43
    .line 44
    sget v2, Lorg/xplatform/ui_core/viewcomponents/views/MultiLineChipsListView;->x:I

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Lorg/xplatform/ui_core/viewcomponents/views/MultiLineChipsListView;->w:Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    invoke-interface {v0, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    check-cast v0, La/ip40;

    .line 58
    .line 59
    check-cast v14, La/pcq;

    .line 60
    .line 61
    move-object/from16 v1, p1

    .line 62
    .line 63
    check-cast v1, Ljava/lang/Throwable;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v2, v0, La/ip40;->r:La/duj;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    if-nez v3, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move-object v1, v3

    .line 78
    :goto_0
    new-instance v3, La/ba30;

    .line 79
    .line 80
    const/16 v4, 0xd

    .line 81
    .line 82
    invoke-direct {v3, v0, v14, v4}, La/ba30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_1
    check-cast v0, La/hp40;

    .line 92
    .line 93
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 94
    .line 95
    move-object/from16 v1, p1

    .line 96
    .line 97
    check-cast v1, La/hcz;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v3, v0, La/hp40;->b:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v3}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_1

    .line 109
    .line 110
    new-instance v3, La/p0z;

    .line 111
    .line 112
    const/16 v5, 0x10

    .line 113
    .line 114
    invoke-direct {v3, v0, v5}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    new-instance v5, La/ugd;

    .line 118
    .line 119
    const v7, 0x4120a09b

    .line 120
    .line 121
    .line 122
    invoke-direct {v5, v7, v6, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v9, v9, v5, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 126
    .line 127
    .line 128
    :cond_1
    iget-object v3, v0, La/hp40;->c:La/x6q0;

    .line 129
    .line 130
    if-eqz v3, :cond_2

    .line 131
    .line 132
    new-instance v5, La/ngz;

    .line 133
    .line 134
    const/16 v7, 0x15

    .line 135
    .line 136
    invoke-direct {v5, v3, v14, v7}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    new-instance v3, La/ugd;

    .line 140
    .line 141
    const v7, -0x7feb220a

    .line 142
    .line 143
    .line 144
    invoke-direct {v3, v7, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v9, v9, v3, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 148
    .line 149
    .line 150
    :cond_2
    iget-object v3, v0, La/hp40;->d:La/jjm;

    .line 151
    .line 152
    if-eqz v3, :cond_3

    .line 153
    .line 154
    new-instance v5, La/yz8;

    .line 155
    .line 156
    invoke-direct {v5, v3, v4}, La/yz8;-><init>(La/jjm;B)V

    .line 157
    .line 158
    .line 159
    new-instance v3, La/ugd;

    .line 160
    .line 161
    const v4, 0x438ef1f

    .line 162
    .line 163
    .line 164
    invoke-direct {v3, v4, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v1, v9, v9, v3, v13}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 168
    .line 169
    .line 170
    iget-object v0, v0, La/hp40;->e:Ljava/util/List;

    .line 171
    .line 172
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    new-instance v4, La/ap30;

    .line 177
    .line 178
    const/16 v5, 0xe

    .line 179
    .line 180
    invoke-direct {v4, v0, v5}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 181
    .line 182
    .line 183
    new-instance v5, La/a100;

    .line 184
    .line 185
    const/16 v7, 0xc

    .line 186
    .line 187
    invoke-direct {v5, v0, v14, v7}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 188
    .line 189
    .line 190
    new-instance v0, La/ugd;

    .line 191
    .line 192
    invoke-direct {v0, v2, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v3, v9, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 196
    .line 197
    .line 198
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_2
    check-cast v0, La/xpj0;

    .line 202
    .line 203
    check-cast v14, La/t33;

    .line 204
    .line 205
    move-object/from16 v1, p1

    .line 206
    .line 207
    check-cast v1, La/uag0;

    .line 208
    .line 209
    iget-object v0, v0, La/xpj0;->e:La/qv2;

    .line 210
    .line 211
    iget-object v0, v0, La/qv2;->l:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, La/agk0;

    .line 214
    .line 215
    invoke-virtual {v0}, La/agk0;->l()F

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    iget-wide v2, v1, La/uag0;->r:J

    .line 220
    .line 221
    const-wide v4, 0xffffffffL

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    and-long/2addr v2, v4

    .line 227
    long-to-int v2, v2

    .line 228
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-nez v3, :cond_5

    .line 237
    .line 238
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    if-nez v3, :cond_5

    .line 243
    .line 244
    const/4 v3, 0x0

    .line 245
    cmpg-float v3, v2, v3

    .line 246
    .line 247
    if-nez v3, :cond_4

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_4
    invoke-virtual {v14}, La/t33;->d()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    check-cast v3, Ljava/lang/Number;

    .line 255
    .line 256
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    invoke-static {v1, v3}, La/dm40;->d(La/uag0;F)F

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    invoke-virtual {v1, v4}, La/uag0;->w(F)V

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v3}, La/dm40;->e(La/uag0;F)F

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    invoke-virtual {v1, v3}, La/uag0;->y(F)V

    .line 272
    .line 273
    .line 274
    add-float/2addr v0, v2

    .line 275
    div-float/2addr v0, v2

    .line 276
    const/high16 v2, 0x3f000000    # 0.5f

    .line 277
    .line 278
    invoke-static {v2, v0}, La/osm0;->e(FF)J

    .line 279
    .line 280
    .line 281
    move-result-wide v2

    .line 282
    invoke-virtual {v1, v2, v3}, La/uag0;->G(J)V

    .line 283
    .line 284
    .line 285
    :cond_5
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_3
    check-cast v0, La/ql40;

    .line 289
    .line 290
    check-cast v14, La/vne;

    .line 291
    .line 292
    move-object/from16 v1, p1

    .line 293
    .line 294
    check-cast v1, Ljava/lang/Throwable;

    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v1, v14}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 303
    .line 304
    .line 305
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_4
    check-cast v0, La/bd40;

    .line 309
    .line 310
    check-cast v14, La/xa40;

    .line 311
    .line 312
    move-object/from16 v1, p1

    .line 313
    .line 314
    check-cast v1, La/k0w0;

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iget-object v0, v0, La/bd40;->t:La/qv2;

    .line 320
    .line 321
    sget-object v28, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 322
    .line 323
    sget-object v29, La/grs;->b:La/grs;

    .line 324
    .line 325
    sget-object v32, La/ors;->a:La/ors;

    .line 326
    .line 327
    sget-object v35, La/k1g;->h:La/k1g;

    .line 328
    .line 329
    iget-wide v2, v14, La/xa40;->a:J

    .line 330
    .line 331
    new-instance v15, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 332
    .line 333
    const-wide/16 v18, 0x0

    .line 334
    .line 335
    const-wide/16 v20, 0x28

    .line 336
    .line 337
    const-wide/16 v22, 0x1

    .line 338
    .line 339
    const/16 v24, 0x1

    .line 340
    .line 341
    const-wide/16 v25, 0x0

    .line 342
    .line 343
    const/16 v27, 0x1

    .line 344
    .line 345
    const-string v30, "main_screen"

    .line 346
    .line 347
    const-string v31, ""

    .line 348
    .line 349
    const/16 v33, 0x0

    .line 350
    .line 351
    const/16 v34, 0x0

    .line 352
    .line 353
    move-wide/from16 v16, v2

    .line 354
    .line 355
    invoke-direct/range {v15 .. v35}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v15}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 363
    .line 364
    .line 365
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_5
    check-cast v0, La/ic40;

    .line 369
    .line 370
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 371
    .line 372
    move-object/from16 v1, p1

    .line 373
    .line 374
    check-cast v1, La/hcz;

    .line 375
    .line 376
    sget-object v2, La/kc40;->l2:La/uuz;

    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    iget-object v0, v0, La/ic40;->a:La/a4x;

    .line 382
    .line 383
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    new-instance v4, La/ap30;

    .line 388
    .line 389
    invoke-direct {v4, v0, v3}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 390
    .line 391
    .line 392
    new-instance v5, La/a100;

    .line 393
    .line 394
    invoke-direct {v5, v0, v14, v3}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 395
    .line 396
    .line 397
    new-instance v0, La/ugd;

    .line 398
    .line 399
    invoke-direct {v0, v15, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v2, v9, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 403
    .line 404
    .line 405
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object v0

    .line 408
    :pswitch_6
    check-cast v0, La/ia40;

    .line 409
    .line 410
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 411
    .line 412
    move-object/from16 v1, p1

    .line 413
    .line 414
    check-cast v1, La/hcz;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    iget-object v0, v0, La/ia40;->b:La/ba40;

    .line 420
    .line 421
    iget-object v0, v0, La/ba40;->i:La/a4x;

    .line 422
    .line 423
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    new-instance v3, La/ap30;

    .line 428
    .line 429
    invoke-direct {v3, v0, v12}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 430
    .line 431
    .line 432
    new-instance v4, La/a100;

    .line 433
    .line 434
    const/16 v5, 0xa

    .line 435
    .line 436
    invoke-direct {v4, v0, v14, v5}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 437
    .line 438
    .line 439
    new-instance v0, La/ugd;

    .line 440
    .line 441
    invoke-direct {v0, v15, v6, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v2, v9, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 445
    .line 446
    .line 447
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_7
    check-cast v0, La/m940;

    .line 451
    .line 452
    check-cast v14, La/mlr;

    .line 453
    .line 454
    move-object/from16 v1, p1

    .line 455
    .line 456
    check-cast v1, La/k0w0;

    .line 457
    .line 458
    iget-object v0, v0, La/m940;->Q:La/uf3;

    .line 459
    .line 460
    iget-wide v2, v14, La/mlr;->a:J

    .line 461
    .line 462
    iget-object v4, v14, La/mlr;->f:Ljava/lang/String;

    .line 463
    .line 464
    iget-wide v7, v14, La/mlr;->c:J

    .line 465
    .line 466
    iget-boolean v5, v14, La/mlr;->l:Z

    .line 467
    .line 468
    iget-wide v9, v14, La/mlr;->b:J

    .line 469
    .line 470
    iget-boolean v11, v14, La/mlr;->m:Z

    .line 471
    .line 472
    iget-boolean v12, v14, La/mlr;->n:Z

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    const/16 v24, 0x1

    .line 481
    .line 482
    const/16 v25, 0x0

    .line 483
    .line 484
    const/16 v27, 0x1

    .line 485
    .line 486
    const/16 v28, 0x0

    .line 487
    .line 488
    const-string v29, ""

    .line 489
    .line 490
    const/16 v30, 0x1

    .line 491
    .line 492
    move-wide v15, v2

    .line 493
    move-object/from16 v17, v4

    .line 494
    .line 495
    move/from16 v20, v5

    .line 496
    .line 497
    move-wide/from16 v18, v7

    .line 498
    .line 499
    move-wide/from16 v21, v9

    .line 500
    .line 501
    move/from16 v23, v11

    .line 502
    .line 503
    move/from16 v26, v12

    .line 504
    .line 505
    invoke-static/range {v15 .. v30}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v0, La/c8d;

    .line 516
    .line 517
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 518
    .line 519
    iget-boolean v2, v14, La/mlr;->n:Z

    .line 520
    .line 521
    xor-int/2addr v2, v6

    .line 522
    new-instance v3, La/v7d;

    .line 523
    .line 524
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 525
    .line 526
    .line 527
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 528
    .line 529
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    return-object v0

    .line 532
    :pswitch_8
    check-cast v0, La/w740;

    .line 533
    .line 534
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 535
    .line 536
    move-object/from16 v1, p1

    .line 537
    .line 538
    check-cast v1, La/hcz;

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object v0, v0, La/w740;->a:La/a4x;

    .line 544
    .line 545
    new-instance v2, La/tr20;

    .line 546
    .line 547
    const/16 v3, 0x1b

    .line 548
    .line 549
    invoke-direct {v2, v3}, La/tr20;-><init>(B)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    new-instance v4, La/ygy;

    .line 557
    .line 558
    const/16 v5, 0x13

    .line 559
    .line 560
    invoke-direct {v4, v2, v0, v5}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 561
    .line 562
    .line 563
    new-instance v2, La/ap30;

    .line 564
    .line 565
    invoke-direct {v2, v0, v11}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 566
    .line 567
    .line 568
    new-instance v5, La/a100;

    .line 569
    .line 570
    invoke-direct {v5, v0, v14, v12}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 571
    .line 572
    .line 573
    new-instance v0, La/ugd;

    .line 574
    .line 575
    invoke-direct {v0, v15, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1, v3, v4, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 579
    .line 580
    .line 581
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 582
    .line 583
    return-object v0

    .line 584
    :pswitch_9
    check-cast v0, La/j340;

    .line 585
    .line 586
    check-cast v14, La/gx10;

    .line 587
    .line 588
    move-object/from16 v1, p1

    .line 589
    .line 590
    check-cast v1, La/k0w0;

    .line 591
    .line 592
    iget-object v0, v0, La/j340;->A0:La/jdk0;

    .line 593
    .line 594
    iget-object v2, v14, La/gx10;->b:La/vh0;

    .line 595
    .line 596
    iget-wide v7, v2, La/vh0;->g:J

    .line 597
    .line 598
    iget-object v9, v2, La/vh0;->b:Ljava/lang/String;

    .line 599
    .line 600
    iget-boolean v12, v2, La/vh0;->i:Z

    .line 601
    .line 602
    iget-wide v13, v2, La/vh0;->h:J

    .line 603
    .line 604
    iget-boolean v15, v2, La/vh0;->j:Z

    .line 605
    .line 606
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    const-wide/16 v10, 0x0

    .line 610
    .line 611
    const/16 v16, 0x1

    .line 612
    .line 613
    const/16 v17, 0x0

    .line 614
    .line 615
    const/16 v18, 0x0

    .line 616
    .line 617
    const/16 v19, 0x0

    .line 618
    .line 619
    const/16 v20, 0x0

    .line 620
    .line 621
    const-string v21, ""

    .line 622
    .line 623
    const/16 v22, 0x1

    .line 624
    .line 625
    invoke-static/range {v7 .. v22}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v0, La/c8d;

    .line 636
    .line 637
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 638
    .line 639
    new-instance v2, La/v7d;

    .line 640
    .line 641
    invoke-direct {v2, v6, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 642
    .line 643
    .line 644
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 645
    .line 646
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 647
    .line 648
    return-object v0

    .line 649
    :pswitch_a
    check-cast v0, La/j340;

    .line 650
    .line 651
    move-object v6, v14

    .line 652
    check-cast v6, La/t270;

    .line 653
    .line 654
    move-object/from16 v9, p1

    .line 655
    .line 656
    check-cast v9, La/k0w0;

    .line 657
    .line 658
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    iget-object v1, v0, La/j340;->X:La/oct;

    .line 662
    .line 663
    const/4 v7, 0x0

    .line 664
    const/16 v8, 0x17

    .line 665
    .line 666
    const-wide/16 v2, 0x0

    .line 667
    .line 668
    const/4 v4, 0x0

    .line 669
    const/4 v5, 0x0

    .line 670
    invoke-static/range {v1 .. v8}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v9, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 675
    .line 676
    .line 677
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 678
    .line 679
    return-object v0

    .line 680
    :pswitch_b
    check-cast v0, La/ctf0;

    .line 681
    .line 682
    check-cast v14, La/qho;

    .line 683
    .line 684
    move-object/from16 v1, p1

    .line 685
    .line 686
    check-cast v1, La/d140;

    .line 687
    .line 688
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    new-instance v1, La/db2;

    .line 692
    .line 693
    invoke-direct {v1, v0, v14}, La/db2;-><init>(La/ctf0;La/qho;)V

    .line 694
    .line 695
    .line 696
    return-object v1

    .line 697
    :pswitch_c
    check-cast v0, La/j340;

    .line 698
    .line 699
    check-cast v14, La/d240;

    .line 700
    .line 701
    move-object/from16 v1, p1

    .line 702
    .line 703
    check-cast v1, La/k0w0;

    .line 704
    .line 705
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    iget-object v0, v0, La/j340;->W:La/peg0;

    .line 709
    .line 710
    new-instance v2, La/fr1;

    .line 711
    .line 712
    new-instance v15, La/fs80;

    .line 713
    .line 714
    iget-object v3, v14, La/d240;->g:Ljava/lang/String;

    .line 715
    .line 716
    iget-wide v5, v14, La/d240;->d:J

    .line 717
    .line 718
    const/16 v23, 0x0

    .line 719
    .line 720
    const/16 v24, 0x7c

    .line 721
    .line 722
    const/16 v19, 0x0

    .line 723
    .line 724
    const/16 v20, 0x0

    .line 725
    .line 726
    const-wide/16 v21, 0x0

    .line 727
    .line 728
    move-object/from16 v16, v3

    .line 729
    .line 730
    move-wide/from16 v17, v5

    .line 731
    .line 732
    invoke-direct/range {v15 .. v24}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 733
    .line 734
    .line 735
    invoke-direct {v2, v15, v9, v4}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 743
    .line 744
    .line 745
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 746
    .line 747
    return-object v0

    .line 748
    :pswitch_d
    check-cast v0, La/j340;

    .line 749
    .line 750
    check-cast v14, La/c240;

    .line 751
    .line 752
    move-object/from16 v1, p1

    .line 753
    .line 754
    check-cast v1, La/k0w0;

    .line 755
    .line 756
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    iget-object v0, v0, La/j340;->W:La/peg0;

    .line 760
    .line 761
    iget-object v2, v14, La/c240;->g:Ljava/lang/String;

    .line 762
    .line 763
    iget-wide v5, v14, La/c240;->e:J

    .line 764
    .line 765
    const-wide/16 v7, 0x0

    .line 766
    .line 767
    cmp-long v3, v5, v7

    .line 768
    .line 769
    if-gtz v3, :cond_6

    .line 770
    .line 771
    goto :goto_2

    .line 772
    :cond_6
    move-object v2, v9

    .line 773
    :goto_2
    if-nez v2, :cond_7

    .line 774
    .line 775
    const-string v2, ""

    .line 776
    .line 777
    :cond_7
    move-object/from16 v16, v2

    .line 778
    .line 779
    iget-wide v2, v14, La/c240;->d:J

    .line 780
    .line 781
    new-instance v15, La/fs80;

    .line 782
    .line 783
    const/16 v19, 0x0

    .line 784
    .line 785
    const/16 v20, 0x0

    .line 786
    .line 787
    const/16 v23, 0x0

    .line 788
    .line 789
    const/16 v24, 0x6c

    .line 790
    .line 791
    move-wide/from16 v17, v2

    .line 792
    .line 793
    move-wide/from16 v21, v5

    .line 794
    .line 795
    invoke-direct/range {v15 .. v24}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 796
    .line 797
    .line 798
    new-instance v2, La/fr1;

    .line 799
    .line 800
    invoke-direct {v2, v15, v9, v4}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 808
    .line 809
    .line 810
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 811
    .line 812
    return-object v0

    .line 813
    :pswitch_e
    check-cast v0, La/ql5;

    .line 814
    .line 815
    check-cast v14, La/kzv;

    .line 816
    .line 817
    move-object/from16 v1, p1

    .line 818
    .line 819
    check-cast v1, La/k0w0;

    .line 820
    .line 821
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    iget-wide v2, v0, La/ql5;->a:J

    .line 825
    .line 826
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    iget-object v2, v14, La/kzv;->a:Ljava/lang/String;

    .line 831
    .line 832
    new-instance v3, Lorg/xplatform/bet_history/transation_history/presentation/TransactionHistoryScreen;

    .line 833
    .line 834
    invoke-direct {v3, v2, v0}, Lorg/xplatform/bet_history/transation_history/presentation/TransactionHistoryScreen;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 838
    .line 839
    .line 840
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 841
    .line 842
    return-object v0

    .line 843
    :pswitch_f
    check-cast v0, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;

    .line 844
    .line 845
    check-cast v14, La/ht30;

    .line 846
    .line 847
    move-object/from16 v1, p1

    .line 848
    .line 849
    check-cast v1, Landroid/view/View;

    .line 850
    .line 851
    sget v2, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;->c:I

    .line 852
    .line 853
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    iget-object v0, v0, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;->a:Lkotlin/jvm/functions/Function1;

    .line 857
    .line 858
    invoke-interface {v0, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_10
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 865
    .line 866
    check-cast v14, La/vhp;

    .line 867
    .line 868
    move-object/from16 v1, p1

    .line 869
    .line 870
    check-cast v1, La/mzl;

    .line 871
    .line 872
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    instance-of v2, v1, La/hzl;

    .line 876
    .line 877
    if-eqz v2, :cond_8

    .line 878
    .line 879
    new-instance v1, La/gmp;

    .line 880
    .line 881
    invoke-direct {v1, v14}, La/gmp;-><init>(La/vhp;)V

    .line 882
    .line 883
    .line 884
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    goto :goto_3

    .line 888
    :cond_8
    instance-of v2, v1, La/izl;

    .line 889
    .line 890
    if-eqz v2, :cond_9

    .line 891
    .line 892
    new-instance v1, La/gmp;

    .line 893
    .line 894
    invoke-direct {v1, v14}, La/gmp;-><init>(La/vhp;)V

    .line 895
    .line 896
    .line 897
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    goto :goto_3

    .line 901
    :cond_9
    instance-of v2, v1, La/jzl;

    .line 902
    .line 903
    if-eqz v2, :cond_a

    .line 904
    .line 905
    new-instance v1, La/fmp;

    .line 906
    .line 907
    iget-wide v2, v14, La/vhp;->a:J

    .line 908
    .line 909
    invoke-direct {v1, v2, v3}, La/fmp;-><init>(J)V

    .line 910
    .line 911
    .line 912
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    goto :goto_3

    .line 916
    :cond_a
    instance-of v2, v1, La/kzl;

    .line 917
    .line 918
    if-eqz v2, :cond_b

    .line 919
    .line 920
    new-instance v10, La/imp;

    .line 921
    .line 922
    check-cast v1, La/kzl;

    .line 923
    .line 924
    iget-wide v11, v1, La/kzl;->a:J

    .line 925
    .line 926
    iget-wide v13, v1, La/kzl;->b:J

    .line 927
    .line 928
    iget-wide v2, v1, La/kzl;->c:J

    .line 929
    .line 930
    iget-object v1, v1, La/kzl;->d:La/wgl0;

    .line 931
    .line 932
    move-object/from16 v17, v1

    .line 933
    .line 934
    move-wide v15, v2

    .line 935
    invoke-direct/range {v10 .. v17}, La/imp;-><init>(JJJLa/wgl0;)V

    .line 936
    .line 937
    .line 938
    invoke-interface {v0, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    goto :goto_3

    .line 942
    :cond_b
    instance-of v2, v1, La/lzl;

    .line 943
    .line 944
    if-eqz v2, :cond_c

    .line 945
    .line 946
    new-instance v10, La/jmp;

    .line 947
    .line 948
    check-cast v1, La/lzl;

    .line 949
    .line 950
    iget-wide v11, v1, La/lzl;->a:J

    .line 951
    .line 952
    iget-wide v13, v1, La/lzl;->b:J

    .line 953
    .line 954
    iget-wide v2, v1, La/lzl;->c:J

    .line 955
    .line 956
    iget-object v1, v1, La/lzl;->d:La/xgl0;

    .line 957
    .line 958
    move-object/from16 v17, v1

    .line 959
    .line 960
    move-wide v15, v2

    .line 961
    invoke-direct/range {v10 .. v17}, La/jmp;-><init>(JJJLa/xgl0;)V

    .line 962
    .line 963
    .line 964
    invoke-interface {v0, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    :goto_3
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 968
    .line 969
    goto :goto_4

    .line 970
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 971
    .line 972
    .line 973
    :goto_4
    return-object v9

    .line 974
    :pswitch_11
    check-cast v0, La/slp;

    .line 975
    .line 976
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 977
    .line 978
    move-object/from16 v1, p1

    .line 979
    .line 980
    check-cast v1, La/hcz;

    .line 981
    .line 982
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    iget-object v3, v0, La/slp;->b:La/a4x;

    .line 986
    .line 987
    new-instance v5, La/pua;

    .line 988
    .line 989
    const/16 v7, 0x11

    .line 990
    .line 991
    invoke-direct {v5, v7}, La/pua;-><init>(B)V

    .line 992
    .line 993
    .line 994
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 995
    .line 996
    .line 997
    move-result v7

    .line 998
    new-instance v8, La/dwy;

    .line 999
    .line 1000
    invoke-direct {v8, v5, v3, v4}, La/dwy;-><init>(La/pua;Ljava/util/List;B)V

    .line 1001
    .line 1002
    .line 1003
    new-instance v4, La/ap30;

    .line 1004
    .line 1005
    const/4 v5, 0x5

    .line 1006
    invoke-direct {v4, v3, v5}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 1007
    .line 1008
    .line 1009
    new-instance v5, La/h8w;

    .line 1010
    .line 1011
    invoke-direct {v5, v3, v0, v14, v11}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 1012
    .line 1013
    .line 1014
    new-instance v0, La/ugd;

    .line 1015
    .line 1016
    invoke-direct {v0, v2, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v1, v7, v8, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1020
    .line 1021
    .line 1022
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1023
    .line 1024
    return-object v0

    .line 1025
    :pswitch_12
    check-cast v0, La/op30;

    .line 1026
    .line 1027
    check-cast v14, La/zvh0;

    .line 1028
    .line 1029
    move-object/from16 v1, p1

    .line 1030
    .line 1031
    check-cast v1, La/fwh0;

    .line 1032
    .line 1033
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1034
    .line 1035
    .line 1036
    iget-object v0, v0, La/op30;->b:La/ctf0;

    .line 1037
    .line 1038
    new-instance v2, La/vwh0;

    .line 1039
    .line 1040
    new-instance v3, La/nj80;

    .line 1041
    .line 1042
    new-instance v11, La/yvh0;

    .line 1043
    .line 1044
    const/4 v12, 0x0

    .line 1045
    new-array v13, v12, [Ljava/lang/Object;

    .line 1046
    .line 1047
    iget-object v15, v0, La/ctf0;->b:La/lsm0;

    .line 1048
    .line 1049
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1050
    .line 1051
    invoke-static {v13, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v13

    .line 1055
    move/from16 v23, v4

    .line 1056
    .line 1057
    const v4, 0x7f130276

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v15, v4, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v4

    .line 1064
    invoke-direct {v11, v4, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1065
    .line 1066
    .line 1067
    invoke-direct {v3, v10, v11}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 1068
    .line 1069
    .line 1070
    iget-boolean v4, v1, La/fwh0;->b:Z

    .line 1071
    .line 1072
    if-eqz v4, :cond_d

    .line 1073
    .line 1074
    new-instance v4, La/nj80;

    .line 1075
    .line 1076
    new-instance v10, La/yvh0;

    .line 1077
    .line 1078
    new-array v11, v12, [Ljava/lang/Object;

    .line 1079
    .line 1080
    invoke-static {v11, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v11

    .line 1084
    const v13, 0x7f130275

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v0, v13, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v11

    .line 1091
    invoke-direct {v10, v11, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1092
    .line 1093
    .line 1094
    invoke-direct {v4, v7, v10}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 1095
    .line 1096
    .line 1097
    goto :goto_5

    .line 1098
    :cond_d
    move-object v4, v9

    .line 1099
    :goto_5
    iget-boolean v7, v1, La/fwh0;->c:Z

    .line 1100
    .line 1101
    if-eqz v7, :cond_e

    .line 1102
    .line 1103
    new-instance v7, La/nj80;

    .line 1104
    .line 1105
    new-instance v10, La/yvh0;

    .line 1106
    .line 1107
    new-array v11, v12, [Ljava/lang/Object;

    .line 1108
    .line 1109
    invoke-static {v11, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v11

    .line 1113
    const v12, 0x7f130274

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v0, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    invoke-direct {v10, v0, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-direct {v7, v5, v10}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_6

    .line 1127
    :cond_e
    move-object v7, v9

    .line 1128
    :goto_6
    filled-new-array {v3, v4, v7}, [La/nj80;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    invoke-static {v0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    iget-object v1, v1, La/fwh0;->a:La/ko7;

    .line 1141
    .line 1142
    instance-of v3, v1, La/jo7;

    .line 1143
    .line 1144
    if-eqz v3, :cond_f

    .line 1145
    .line 1146
    const/4 v6, 0x0

    .line 1147
    goto :goto_7

    .line 1148
    :cond_f
    instance-of v3, v1, La/io7;

    .line 1149
    .line 1150
    if-eqz v3, :cond_10

    .line 1151
    .line 1152
    goto :goto_7

    .line 1153
    :cond_10
    instance-of v1, v1, La/ho7;

    .line 1154
    .line 1155
    if-eqz v1, :cond_11

    .line 1156
    .line 1157
    move/from16 v6, v23

    .line 1158
    .line 1159
    :goto_7
    invoke-static {v14}, La/vdx;->f0(La/zvh0;)La/dxh0;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v1

    .line 1163
    invoke-direct {v2, v6, v0, v1}, La/vwh0;-><init>(ILa/a4x;La/dxh0;)V

    .line 1164
    .line 1165
    .line 1166
    move-object v9, v2

    .line 1167
    goto :goto_8

    .line 1168
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 1169
    .line 1170
    .line 1171
    :goto_8
    return-object v9

    .line 1172
    :pswitch_13
    move/from16 v23, v4

    .line 1173
    .line 1174
    check-cast v0, La/mkw;

    .line 1175
    .line 1176
    check-cast v14, La/zvh0;

    .line 1177
    .line 1178
    move-object/from16 v1, p1

    .line 1179
    .line 1180
    check-cast v1, La/iwh0;

    .line 1181
    .line 1182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1183
    .line 1184
    .line 1185
    new-instance v2, La/nj80;

    .line 1186
    .line 1187
    new-instance v3, La/yvh0;

    .line 1188
    .line 1189
    iget-object v0, v0, La/mkw;->b:La/ctf0;

    .line 1190
    .line 1191
    const/4 v12, 0x0

    .line 1192
    new-array v4, v12, [Ljava/lang/Object;

    .line 1193
    .line 1194
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 1195
    .line 1196
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v4

    .line 1200
    const v13, 0x7f130276

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v11, v13, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v4

    .line 1207
    invoke-direct {v3, v4, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-direct {v2, v10, v3}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 1211
    .line 1212
    .line 1213
    new-instance v3, La/nj80;

    .line 1214
    .line 1215
    new-instance v4, La/yvh0;

    .line 1216
    .line 1217
    new-array v10, v12, [Ljava/lang/Object;

    .line 1218
    .line 1219
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 1220
    .line 1221
    invoke-static {v10, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v10

    .line 1225
    const v13, 0x7f130275

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v11, v13, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v10

    .line 1232
    invoke-direct {v4, v10, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1233
    .line 1234
    .line 1235
    invoke-direct {v3, v7, v4}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 1236
    .line 1237
    .line 1238
    iget-boolean v4, v1, La/iwh0;->b:Z

    .line 1239
    .line 1240
    if-eqz v4, :cond_12

    .line 1241
    .line 1242
    goto :goto_9

    .line 1243
    :cond_12
    move-object v3, v9

    .line 1244
    :goto_9
    new-instance v4, La/nj80;

    .line 1245
    .line 1246
    new-instance v7, La/yvh0;

    .line 1247
    .line 1248
    new-array v10, v12, [Ljava/lang/Object;

    .line 1249
    .line 1250
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1251
    .line 1252
    invoke-static {v10, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v10

    .line 1256
    const v12, 0x7f130274

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v0, v12, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    invoke-direct {v7, v0, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1264
    .line 1265
    .line 1266
    invoke-direct {v4, v5, v7}, La/nj80;-><init>(La/kj80;La/yvh0;)V

    .line 1267
    .line 1268
    .line 1269
    iget-boolean v0, v1, La/iwh0;->c:Z

    .line 1270
    .line 1271
    if-eqz v0, :cond_13

    .line 1272
    .line 1273
    goto :goto_a

    .line 1274
    :cond_13
    move-object v4, v9

    .line 1275
    :goto_a
    filled-new-array {v2, v3, v4}, [La/nj80;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v0

    .line 1279
    invoke-static {v0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v0

    .line 1283
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    iget-object v1, v1, La/iwh0;->a:La/fo7;

    .line 1288
    .line 1289
    instance-of v2, v1, La/co7;

    .line 1290
    .line 1291
    if-eqz v2, :cond_14

    .line 1292
    .line 1293
    const/4 v6, 0x0

    .line 1294
    goto :goto_b

    .line 1295
    :cond_14
    instance-of v2, v1, La/zn7;

    .line 1296
    .line 1297
    if-eqz v2, :cond_15

    .line 1298
    .line 1299
    goto :goto_b

    .line 1300
    :cond_15
    instance-of v1, v1, La/xn7;

    .line 1301
    .line 1302
    if-eqz v1, :cond_16

    .line 1303
    .line 1304
    move/from16 v6, v23

    .line 1305
    .line 1306
    :goto_b
    invoke-static {v14}, La/xdx;->O(La/zvh0;)La/dxh0;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v1

    .line 1310
    new-instance v9, La/vwh0;

    .line 1311
    .line 1312
    invoke-direct {v9, v6, v0, v1}, La/vwh0;-><init>(ILa/a4x;La/dxh0;)V

    .line 1313
    .line 1314
    .line 1315
    goto :goto_c

    .line 1316
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 1317
    .line 1318
    .line 1319
    :goto_c
    return-object v9

    .line 1320
    :pswitch_14
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1321
    .line 1322
    check-cast v14, La/qp30;

    .line 1323
    .line 1324
    move-object/from16 v1, p1

    .line 1325
    .line 1326
    check-cast v1, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 1327
    .line 1328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1329
    .line 1330
    .line 1331
    new-instance v2, La/t27;

    .line 1332
    .line 1333
    iget-object v3, v14, La/qp30;->b:Ljava/lang/String;

    .line 1334
    .line 1335
    invoke-direct {v2, v1, v3}, La/t27;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Ljava/lang/String;)V

    .line 1336
    .line 1337
    .line 1338
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1342
    .line 1343
    return-object v0

    .line 1344
    :pswitch_15
    move/from16 v23, v4

    .line 1345
    .line 1346
    check-cast v14, La/cp;

    .line 1347
    .line 1348
    iget-object v1, v14, La/cp;->w:Landroid/content/Context;

    .line 1349
    .line 1350
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 1351
    .line 1352
    move-object/from16 v2, p1

    .line 1353
    .line 1354
    check-cast v2, Ljava/util/List;

    .line 1355
    .line 1356
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1357
    .line 1358
    .line 1359
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1360
    .line 1361
    iget-object v2, v14, La/cp;->u:La/yfu0;

    .line 1362
    .line 1363
    move-object v3, v2

    .line 1364
    check-cast v3, La/gl30;

    .line 1365
    .line 1366
    iget-object v3, v3, La/gl30;->b:Landroid/widget/ImageView;

    .line 1367
    .line 1368
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v4

    .line 1372
    check-cast v4, La/hl30;

    .line 1373
    .line 1374
    iget-object v4, v4, La/hl30;->d:Ljava/lang/String;

    .line 1375
    .line 1376
    invoke-static {v4}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v4

    .line 1380
    invoke-static {v3, v4, v0}, La/u0d;->p(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 1381
    .line 1382
    .line 1383
    check-cast v2, La/gl30;

    .line 1384
    .line 1385
    iget-object v0, v2, La/gl30;->f:Landroid/widget/TextView;

    .line 1386
    .line 1387
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v3

    .line 1391
    check-cast v3, La/hl30;

    .line 1392
    .line 1393
    iget v3, v3, La/hl30;->a:I

    .line 1394
    .line 1395
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v3

    .line 1399
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1400
    .line 1401
    .line 1402
    iget-object v0, v2, La/gl30;->d:Landroid/widget/TextView;

    .line 1403
    .line 1404
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v3

    .line 1408
    check-cast v3, La/hl30;

    .line 1409
    .line 1410
    iget-object v3, v3, La/hl30;->c:Ljava/lang/String;

    .line 1411
    .line 1412
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1413
    .line 1414
    .line 1415
    iget-object v0, v2, La/gl30;->c:Landroid/widget/TextView;

    .line 1416
    .line 1417
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v3

    .line 1421
    check-cast v3, La/hl30;

    .line 1422
    .line 1423
    iget-object v3, v3, La/hl30;->g:Ljava/lang/String;

    .line 1424
    .line 1425
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1426
    .line 1427
    .line 1428
    iget-object v0, v2, La/gl30;->g:Landroid/widget/TextView;

    .line 1429
    .line 1430
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v3

    .line 1434
    check-cast v3, La/hl30;

    .line 1435
    .line 1436
    iget-object v3, v3, La/hl30;->f:Ljava/lang/String;

    .line 1437
    .line 1438
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1439
    .line 1440
    .line 1441
    iget-object v0, v2, La/gl30;->e:Landroid/widget/TextView;

    .line 1442
    .line 1443
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v3

    .line 1447
    check-cast v3, La/hl30;

    .line 1448
    .line 1449
    iget-object v3, v3, La/hl30;->e:Ljava/lang/String;

    .line 1450
    .line 1451
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1452
    .line 1453
    .line 1454
    iget-object v0, v2, La/gl30;->h:Landroid/widget/TextView;

    .line 1455
    .line 1456
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v3

    .line 1460
    check-cast v3, La/hl30;

    .line 1461
    .line 1462
    iget-object v3, v3, La/hl30;->h:Ljava/lang/String;

    .line 1463
    .line 1464
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v0

    .line 1471
    check-cast v0, La/hl30;

    .line 1472
    .line 1473
    iget v0, v0, La/hl30;->a:I

    .line 1474
    .line 1475
    rem-int/lit8 v0, v0, 0x2

    .line 1476
    .line 1477
    iget-object v2, v2, La/gl30;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1478
    .line 1479
    const/4 v3, 0x6

    .line 1480
    const v4, 0x7f040b73

    .line 1481
    .line 1482
    .line 1483
    if-nez v0, :cond_17

    .line 1484
    .line 1485
    invoke-static {v1, v4, v3}, La/m5d;->g(Landroid/content/Context;II)I

    .line 1486
    .line 1487
    .line 1488
    move-result v0

    .line 1489
    invoke-static {v0, v1}, La/m5d;->e(ILandroid/content/Context;)Landroid/content/res/Resources$Theme;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v0

    .line 1493
    const v3, 0x7f040ae6

    .line 1494
    .line 1495
    .line 1496
    const/4 v12, 0x0

    .line 1497
    invoke-static {v1, v3, v12, v0}, La/m5d;->f(Landroid/content/Context;IZLandroid/content/res/Resources$Theme;)I

    .line 1498
    .line 1499
    .line 1500
    move-result v0

    .line 1501
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1502
    .line 1503
    .line 1504
    goto :goto_d

    .line 1505
    :cond_17
    const/4 v12, 0x0

    .line 1506
    invoke-static {v1, v4, v3}, La/m5d;->g(Landroid/content/Context;II)I

    .line 1507
    .line 1508
    .line 1509
    move-result v0

    .line 1510
    invoke-static {v0, v1}, La/m5d;->e(ILandroid/content/Context;)Landroid/content/res/Resources$Theme;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v0

    .line 1514
    const v3, 0x7f040ae3

    .line 1515
    .line 1516
    .line 1517
    invoke-static {v1, v3, v12, v0}, La/m5d;->f(Landroid/content/Context;IZLandroid/content/res/Resources$Theme;)I

    .line 1518
    .line 1519
    .line 1520
    move-result v0

    .line 1521
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1522
    .line 1523
    .line 1524
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1525
    .line 1526
    return-object v0

    .line 1527
    :pswitch_16
    check-cast v0, La/al30;

    .line 1528
    .line 1529
    check-cast v14, Landroid/graphics/drawable/Drawable;

    .line 1530
    .line 1531
    move-object/from16 v1, p1

    .line 1532
    .line 1533
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 1534
    .line 1535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1536
    .line 1537
    .line 1538
    invoke-static {v1}, La/zkk;->a(Landroid/view/View;)La/zkk;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v1

    .line 1542
    iget-object v2, v1, La/zkk;->d:Landroid/widget/TextView;

    .line 1543
    .line 1544
    iget v3, v0, La/al30;->a:I

    .line 1545
    .line 1546
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v3

    .line 1550
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1551
    .line 1552
    .line 1553
    iget-object v2, v1, La/zkk;->e:Landroid/view/View;

    .line 1554
    .line 1555
    check-cast v2, Landroid/widget/TextView;

    .line 1556
    .line 1557
    iget-object v3, v0, La/al30;->d:Ljava/lang/String;

    .line 1558
    .line 1559
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1560
    .line 1561
    .line 1562
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1563
    .line 1564
    iget-object v2, v1, La/zkk;->i:Landroid/view/View;

    .line 1565
    .line 1566
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1567
    .line 1568
    iget-object v3, v0, La/al30;->c:Ljava/lang/String;

    .line 1569
    .line 1570
    invoke-static {v3}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v3

    .line 1574
    invoke-static {v2, v3, v14}, La/u0d;->p(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 1575
    .line 1576
    .line 1577
    iget-object v2, v1, La/zkk;->b:Ljava/lang/Object;

    .line 1578
    .line 1579
    check-cast v2, La/jk30;

    .line 1580
    .line 1581
    iget-object v3, v2, La/jk30;->c:Landroid/widget/ImageView;

    .line 1582
    .line 1583
    iget-object v4, v0, La/al30;->g:La/bl30;

    .line 1584
    .line 1585
    iget v5, v4, La/bl30;->a:I

    .line 1586
    .line 1587
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1588
    .line 1589
    .line 1590
    iget-object v2, v2, La/jk30;->d:Landroid/widget/TextView;

    .line 1591
    .line 1592
    iget-object v3, v4, La/bl30;->b:Ljava/lang/String;

    .line 1593
    .line 1594
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1595
    .line 1596
    .line 1597
    iget-object v2, v1, La/zkk;->g:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast v2, La/jk30;

    .line 1600
    .line 1601
    iget-object v3, v2, La/jk30;->c:Landroid/widget/ImageView;

    .line 1602
    .line 1603
    iget-object v4, v0, La/al30;->f:La/bl30;

    .line 1604
    .line 1605
    iget v5, v4, La/bl30;->a:I

    .line 1606
    .line 1607
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1608
    .line 1609
    .line 1610
    iget-object v2, v2, La/jk30;->d:Landroid/widget/TextView;

    .line 1611
    .line 1612
    iget-object v3, v4, La/bl30;->b:Ljava/lang/String;

    .line 1613
    .line 1614
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1615
    .line 1616
    .line 1617
    iget-object v2, v1, La/zkk;->c:Ljava/lang/Object;

    .line 1618
    .line 1619
    check-cast v2, La/jk30;

    .line 1620
    .line 1621
    iget-object v3, v2, La/jk30;->c:Landroid/widget/ImageView;

    .line 1622
    .line 1623
    iget-object v4, v0, La/al30;->e:La/bl30;

    .line 1624
    .line 1625
    iget v5, v4, La/bl30;->a:I

    .line 1626
    .line 1627
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1628
    .line 1629
    .line 1630
    iget-object v2, v2, La/jk30;->d:Landroid/widget/TextView;

    .line 1631
    .line 1632
    iget-object v3, v4, La/bl30;->b:Ljava/lang/String;

    .line 1633
    .line 1634
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1635
    .line 1636
    .line 1637
    iget-object v1, v1, La/zkk;->h:Ljava/lang/Object;

    .line 1638
    .line 1639
    check-cast v1, La/jk30;

    .line 1640
    .line 1641
    iget-object v2, v1, La/jk30;->c:Landroid/widget/ImageView;

    .line 1642
    .line 1643
    iget-object v0, v0, La/al30;->h:La/bl30;

    .line 1644
    .line 1645
    iget v3, v0, La/bl30;->a:I

    .line 1646
    .line 1647
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1648
    .line 1649
    .line 1650
    iget-object v1, v1, La/jk30;->d:Landroid/widget/TextView;

    .line 1651
    .line 1652
    iget-object v0, v0, La/bl30;->b:Ljava/lang/String;

    .line 1653
    .line 1654
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1655
    .line 1656
    .line 1657
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1658
    .line 1659
    return-object v0

    .line 1660
    :pswitch_17
    check-cast v0, La/ug30;

    .line 1661
    .line 1662
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1663
    .line 1664
    move-object/from16 v1, p1

    .line 1665
    .line 1666
    check-cast v1, La/hcz;

    .line 1667
    .line 1668
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1669
    .line 1670
    .line 1671
    iget-object v0, v0, La/ug30;->a:La/a4x;

    .line 1672
    .line 1673
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1674
    .line 1675
    .line 1676
    move-result v3

    .line 1677
    new-instance v4, La/bgz;

    .line 1678
    .line 1679
    const/16 v5, 0x1d

    .line 1680
    .line 1681
    invoke-direct {v4, v0, v5}, La/bgz;-><init>(Ljava/util/List;B)V

    .line 1682
    .line 1683
    .line 1684
    new-instance v5, La/a100;

    .line 1685
    .line 1686
    const/4 v7, 0x4

    .line 1687
    invoke-direct {v5, v0, v14, v7}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 1688
    .line 1689
    .line 1690
    new-instance v0, La/ugd;

    .line 1691
    .line 1692
    invoke-direct {v0, v2, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v1, v3, v9, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1696
    .line 1697
    .line 1698
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1699
    .line 1700
    return-object v0

    .line 1701
    :pswitch_18
    move/from16 v23, v4

    .line 1702
    .line 1703
    move-object/from16 v17, v0

    .line 1704
    .line 1705
    check-cast v17, La/cbl0;

    .line 1706
    .line 1707
    move-object v0, v14

    .line 1708
    check-cast v0, La/bbl0;

    .line 1709
    .line 1710
    move-object/from16 v1, p1

    .line 1711
    .line 1712
    check-cast v1, La/cp;

    .line 1713
    .line 1714
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1715
    .line 1716
    .line 1717
    new-instance v15, La/xcz;

    .line 1718
    .line 1719
    const/4 v12, 0x0

    .line 1720
    invoke-direct {v15, v12, v13, v12}, La/xcz;-><init>(III)V

    .line 1721
    .line 1722
    .line 1723
    sget-object v2, La/lak0;->c:La/lak0;

    .line 1724
    .line 1725
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v11

    .line 1729
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1730
    .line 1731
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v25

    .line 1735
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v14

    .line 1739
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v28

    .line 1743
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1744
    .line 1745
    check-cast v2, La/vsx;

    .line 1746
    .line 1747
    iget-object v4, v2, La/vsx;->c:Landroidx/compose/ui/platform/ComposeView;

    .line 1748
    .line 1749
    sget-object v5, La/jdk0;->g:La/jdk0;

    .line 1750
    .line 1751
    new-instance v10, La/fn0;

    .line 1752
    .line 1753
    const/16 v18, 0xa

    .line 1754
    .line 1755
    move-object/from16 v16, v1

    .line 1756
    .line 1757
    move-object/from16 v12, v25

    .line 1758
    .line 1759
    move-object/from16 v13, v28

    .line 1760
    .line 1761
    invoke-direct/range {v10 .. v18}, La/fn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1762
    .line 1763
    .line 1764
    new-instance v7, La/ugd;

    .line 1765
    .line 1766
    const v8, 0x71ab7918

    .line 1767
    .line 1768
    .line 1769
    invoke-direct {v7, v8, v6, v10}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1770
    .line 1771
    .line 1772
    invoke-static {v4, v5, v9, v7}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 1773
    .line 1774
    .line 1775
    iget-object v2, v2, La/vsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 1776
    .line 1777
    sget-object v4, La/ymx;->d:La/ymx;

    .line 1778
    .line 1779
    new-instance v5, La/asw;

    .line 1780
    .line 1781
    move/from16 v6, v23

    .line 1782
    .line 1783
    invoke-direct {v5, v0, v1, v6}, La/asw;-><init>(La/bbl0;La/cp;B)V

    .line 1784
    .line 1785
    .line 1786
    invoke-static {v2, v4, v5}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1787
    .line 1788
    .line 1789
    new-instance v24, La/ag30;

    .line 1790
    .line 1791
    move-object/from16 v29, v25

    .line 1792
    .line 1793
    move-object/from16 v30, v1

    .line 1794
    .line 1795
    move-object/from16 v31, v11

    .line 1796
    .line 1797
    move-object/from16 v26, v1

    .line 1798
    .line 1799
    move-object/from16 v27, v11

    .line 1800
    .line 1801
    invoke-direct/range {v24 .. v31}, La/ag30;-><init>(La/pz40;La/cp;La/pz40;La/pz40;La/pz40;La/cp;La/pz40;)V

    .line 1802
    .line 1803
    .line 1804
    move-object/from16 v0, v24

    .line 1805
    .line 1806
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1807
    .line 1808
    .line 1809
    new-instance v0, La/bb;

    .line 1810
    .line 1811
    invoke-direct {v0, v1, v3}, La/bb;-><init>(La/cp;B)V

    .line 1812
    .line 1813
    .line 1814
    invoke-virtual {v1, v0}, La/cp;->x(Lkotlin/jvm/functions/Function0;)V

    .line 1815
    .line 1816
    .line 1817
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1818
    .line 1819
    return-object v0

    .line 1820
    :pswitch_19
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 1821
    .line 1822
    check-cast v14, La/e530;

    .line 1823
    .line 1824
    move-object/from16 v1, p1

    .line 1825
    .line 1826
    check-cast v1, La/gho;

    .line 1827
    .line 1828
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1829
    .line 1830
    .line 1831
    iget-wide v2, v14, La/e530;->a:J

    .line 1832
    .line 1833
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v2

    .line 1837
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1838
    .line 1839
    .line 1840
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1841
    .line 1842
    return-object v0

    .line 1843
    :pswitch_1a
    const/4 v7, 0x4

    .line 1844
    check-cast v14, La/cp;

    .line 1845
    .line 1846
    iget-object v1, v14, La/cp;->w:Landroid/content/Context;

    .line 1847
    .line 1848
    check-cast v0, La/f630;

    .line 1849
    .line 1850
    move-object/from16 v2, p1

    .line 1851
    .line 1852
    check-cast v2, Ljava/util/List;

    .line 1853
    .line 1854
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1855
    .line 1856
    .line 1857
    iget-object v2, v14, La/cp;->u:La/yfu0;

    .line 1858
    .line 1859
    check-cast v2, La/iux;

    .line 1860
    .line 1861
    iget-object v3, v2, La/iux;->d:Landroid/widget/TextView;

    .line 1862
    .line 1863
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v4

    .line 1867
    check-cast v4, La/hw20;

    .line 1868
    .line 1869
    iget-object v4, v4, La/hw20;->a:Ljava/lang/String;

    .line 1870
    .line 1871
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1872
    .line 1873
    .line 1874
    iget-object v4, v2, La/iux;->c:Landroid/widget/ImageView;

    .line 1875
    .line 1876
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v5

    .line 1880
    check-cast v5, La/hw20;

    .line 1881
    .line 1882
    iget-object v5, v5, La/hw20;->c:La/dw20;

    .line 1883
    .line 1884
    sget-object v6, La/dw20;->a:La/dw20;

    .line 1885
    .line 1886
    if-eq v5, v6, :cond_18

    .line 1887
    .line 1888
    goto :goto_e

    .line 1889
    :cond_18
    const/4 v7, 0x0

    .line 1890
    :goto_e
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1891
    .line 1892
    .line 1893
    new-instance v5, La/yv5;

    .line 1894
    .line 1895
    const/4 v6, 0x2

    .line 1896
    invoke-direct {v5, v0, v14, v6}, La/yv5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1897
    .line 1898
    .line 1899
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v0

    .line 1906
    check-cast v0, La/hw20;

    .line 1907
    .line 1908
    iget-boolean v0, v0, La/hw20;->d:Z

    .line 1909
    .line 1910
    iget-object v2, v2, La/iux;->b:Landroid/widget/ImageView;

    .line 1911
    .line 1912
    if-eqz v0, :cond_19

    .line 1913
    .line 1914
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v0

    .line 1918
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 1919
    .line 1920
    const v2, 0x7f040afc

    .line 1921
    .line 1922
    .line 1923
    const/4 v12, 0x0

    .line 1924
    invoke-static {v1, v2, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1925
    .line 1926
    .line 1927
    move-result v2

    .line 1928
    invoke-static {v0, v1, v2}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 1929
    .line 1930
    .line 1931
    const v0, 0x7f040b72

    .line 1932
    .line 1933
    .line 1934
    invoke-static {v1, v0, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1935
    .line 1936
    .line 1937
    move-result v0

    .line 1938
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1939
    .line 1940
    .line 1941
    goto :goto_f

    .line 1942
    :cond_19
    const/4 v12, 0x0

    .line 1943
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v0

    .line 1947
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 1948
    .line 1949
    const v2, 0x7f040b0b

    .line 1950
    .line 1951
    .line 1952
    invoke-static {v1, v2, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1953
    .line 1954
    .line 1955
    move-result v4

    .line 1956
    invoke-static {v0, v1, v4}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 1957
    .line 1958
    .line 1959
    invoke-static {v1, v2, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1960
    .line 1961
    .line 1962
    move-result v0

    .line 1963
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1964
    .line 1965
    .line 1966
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1967
    .line 1968
    return-object v0

    .line 1969
    :pswitch_1b
    const/4 v7, 0x4

    .line 1970
    check-cast v14, La/cp;

    .line 1971
    .line 1972
    iget-object v1, v14, La/cp;->w:Landroid/content/Context;

    .line 1973
    .line 1974
    check-cast v0, La/x530;

    .line 1975
    .line 1976
    move-object/from16 v2, p1

    .line 1977
    .line 1978
    check-cast v2, Ljava/util/List;

    .line 1979
    .line 1980
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1981
    .line 1982
    .line 1983
    iget-object v2, v14, La/cp;->u:La/yfu0;

    .line 1984
    .line 1985
    check-cast v2, La/hux;

    .line 1986
    .line 1987
    iget-object v3, v2, La/hux;->d:Landroid/widget/TextView;

    .line 1988
    .line 1989
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v4

    .line 1993
    check-cast v4, La/gw20;

    .line 1994
    .line 1995
    iget-object v4, v4, La/gw20;->a:Ljava/lang/String;

    .line 1996
    .line 1997
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1998
    .line 1999
    .line 2000
    iget-object v4, v2, La/hux;->c:Landroid/widget/ImageView;

    .line 2001
    .line 2002
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v5

    .line 2006
    check-cast v5, La/gw20;

    .line 2007
    .line 2008
    iget-object v5, v5, La/gw20;->c:La/cw20;

    .line 2009
    .line 2010
    sget-object v8, La/cw20;->a:La/cw20;

    .line 2011
    .line 2012
    if-eq v5, v8, :cond_1a

    .line 2013
    .line 2014
    goto :goto_10

    .line 2015
    :cond_1a
    const/4 v7, 0x0

    .line 2016
    :goto_10
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2017
    .line 2018
    .line 2019
    new-instance v5, La/yv5;

    .line 2020
    .line 2021
    invoke-direct {v5, v0, v14, v6}, La/yv5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2022
    .line 2023
    .line 2024
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2025
    .line 2026
    .line 2027
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v0

    .line 2031
    check-cast v0, La/gw20;

    .line 2032
    .line 2033
    iget-boolean v0, v0, La/gw20;->d:Z

    .line 2034
    .line 2035
    iget-object v2, v2, La/hux;->b:Landroid/widget/ImageView;

    .line 2036
    .line 2037
    if-eqz v0, :cond_1b

    .line 2038
    .line 2039
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v0

    .line 2043
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 2044
    .line 2045
    const v2, 0x7f040afc

    .line 2046
    .line 2047
    .line 2048
    const/4 v12, 0x0

    .line 2049
    invoke-static {v1, v2, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2050
    .line 2051
    .line 2052
    move-result v2

    .line 2053
    invoke-static {v0, v1, v2}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 2054
    .line 2055
    .line 2056
    const v0, 0x7f040b72

    .line 2057
    .line 2058
    .line 2059
    invoke-static {v1, v0, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2060
    .line 2061
    .line 2062
    move-result v0

    .line 2063
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2064
    .line 2065
    .line 2066
    goto :goto_11

    .line 2067
    :cond_1b
    const/4 v12, 0x0

    .line 2068
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v0

    .line 2072
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 2073
    .line 2074
    const v2, 0x7f040b0b

    .line 2075
    .line 2076
    .line 2077
    invoke-static {v1, v2, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2078
    .line 2079
    .line 2080
    move-result v4

    .line 2081
    invoke-static {v0, v1, v4}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 2082
    .line 2083
    .line 2084
    invoke-static {v1, v2, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2085
    .line 2086
    .line 2087
    move-result v0

    .line 2088
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2089
    .line 2090
    .line 2091
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2092
    .line 2093
    return-object v0

    .line 2094
    :pswitch_1c
    check-cast v0, La/du20;

    .line 2095
    .line 2096
    check-cast v14, La/cp;

    .line 2097
    .line 2098
    move-object/from16 v1, p1

    .line 2099
    .line 2100
    check-cast v1, Landroid/view/View;

    .line 2101
    .line 2102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2103
    .line 2104
    .line 2105
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v1

    .line 2109
    invoke-virtual {v0, v1}, La/du20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2110
    .line 2111
    .line 2112
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2113
    .line 2114
    return-object v0

    .line 2115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
