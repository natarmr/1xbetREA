.class public final synthetic La/yr80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yr80;->a:B

    iput-object p1, p0, La/yr80;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yr80;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/16 v3, 0x16

    .line 8
    .line 9
    const/4 v4, 0x5

    .line 10
    const/16 v5, 0xb

    .line 11
    .line 12
    const/16 v6, 0xa

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v0, v0, La/yr80;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v0, La/epb0;

    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/hcz;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v2, La/ohq0;->d:La/ugd;

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    invoke-static {v1, v7, v7, v2, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 35
    .line 36
    .line 37
    new-instance v2, La/p0z;

    .line 38
    .line 39
    const/16 v4, 0x18

    .line 40
    .line 41
    invoke-direct {v2, v0, v4}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v0, La/ugd;

    .line 45
    .line 46
    const v4, 0x5f35bc93

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v4, v9, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v7, v7, v0, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    check-cast v0, La/iij;

    .line 59
    .line 60
    move-object/from16 v1, p1

    .line 61
    .line 62
    check-cast v1, La/k0w0;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, La/iij;->h:Ljava/lang/Object;

    .line 68
    .line 69
    new-instance v0, Lorg/xplatform/feed/navigation/SportFilterScreenParams;

    .line 70
    .line 71
    new-instance v2, La/mr2;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, v2}, Lorg/xplatform/feed/navigation/SportFilterScreenParams;-><init>(La/ms2;)V

    .line 77
    .line 78
    .line 79
    new-instance v2, Lorg/xplatform/feed/navigation/SportFilterScreenFactoryImpl$getSportFilterScreen$1;

    .line 80
    .line 81
    invoke-direct {v2, v0}, Lorg/xplatform/feed/navigation/SportFilterScreenFactoryImpl$getSportFilterScreen$1;-><init>(Lorg/xplatform/feed/navigation/SportFilterScreenParams;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 85
    .line 86
    .line 87
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_1
    check-cast v0, La/npo;

    .line 91
    .line 92
    move-object/from16 v10, p1

    .line 93
    .line 94
    check-cast v10, La/hcz;

    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v1, La/csw;

    .line 100
    .line 101
    invoke-direct {v1, v0, v5}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    new-instance v14, La/ugd;

    .line 105
    .line 106
    const v0, 0xb247118

    .line 107
    .line 108
    .line 109
    invoke-direct {v14, v0, v9, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const/4 v15, 0x6

    .line 113
    const/4 v11, 0x2

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    invoke-static/range {v10 .. v15}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_2
    check-cast v0, Lorg/xplatform/popular/impl/navigation/PopularScreenFactoryImpl$getScreen$1;

    .line 123
    .line 124
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, La/m1r;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Lorg/xplatform/popular/impl/navigation/PopularScreenFactoryImpl$getScreen$1;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0

    .line 136
    :pswitch_3
    check-cast v0, La/l7b0;

    .line 137
    .line 138
    move-object/from16 v1, p1

    .line 139
    .line 140
    check-cast v1, Ljava/lang/Throwable;

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 146
    .line 147
    .line 148
    iget-object v2, v0, La/l7b0;->s:La/p7m0;

    .line 149
    .line 150
    new-instance v3, La/f7b0;

    .line 151
    .line 152
    iget-object v10, v0, La/l7b0;->d:La/g2v;

    .line 153
    .line 154
    sget-object v11, La/pb10;->g:La/pb10;

    .line 155
    .line 156
    new-instance v4, La/c7b0;

    .line 157
    .line 158
    invoke-direct {v4, v0, v9}, La/c7b0;-><init>(La/l7b0;B)V

    .line 159
    .line 160
    .line 161
    const/16 v17, 0x5e

    .line 162
    .line 163
    const/4 v12, 0x0

    .line 164
    const/4 v13, 0x0

    .line 165
    const v14, 0x7f130677

    .line 166
    .line 167
    .line 168
    const v15, 0x7f131690

    .line 169
    .line 170
    .line 171
    move-object/from16 v16, v4

    .line 172
    .line 173
    invoke-static/range {v10 .. v17}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {v3, v1, v0}, La/f7b0;-><init>(Ljava/lang/Throwable;La/jkm;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v7, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_4
    check-cast v0, La/j6b0;

    .line 190
    .line 191
    move-object/from16 v1, p1

    .line 192
    .line 193
    check-cast v1, Ljava/lang/Throwable;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 199
    .line 200
    .line 201
    iget-object v2, v0, La/j6b0;->C:La/bby;

    .line 202
    .line 203
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 204
    .line 205
    .line 206
    new-instance v2, La/edt;

    .line 207
    .line 208
    invoke-direct {v2, v1}, La/edt;-><init>(Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v2}, La/j6b0;->N(La/pdt;)V

    .line 212
    .line 213
    .line 214
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_5
    check-cast v0, La/z5b0;

    .line 218
    .line 219
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, La/uid;

    .line 222
    .line 223
    sget-object v2, La/z5b0;->R1:La/mi70;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget-object v0, v0, La/z5b0;->O1:La/a8z;

    .line 229
    .line 230
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, La/k3t0;

    .line 235
    .line 236
    new-instance v2, La/q5b0;

    .line 237
    .line 238
    invoke-direct {v2, v1}, La/q5b0;-><init>(La/uid;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object v0

    .line 247
    :pswitch_6
    check-cast v0, La/wma0;

    .line 248
    .line 249
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, La/cp;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 257
    .line 258
    check-cast v2, La/i2k;

    .line 259
    .line 260
    iget-object v2, v2, La/i2k;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 261
    .line 262
    new-instance v3, La/bs50;

    .line 263
    .line 264
    invoke-direct {v3, v0, v1, v4}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 268
    .line 269
    .line 270
    new-instance v0, La/ui80;

    .line 271
    .line 272
    invoke-direct {v0, v1, v6}, La/ui80;-><init>(La/cp;B)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 276
    .line 277
    .line 278
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_7
    check-cast v0, La/d2b0;

    .line 282
    .line 283
    move-object/from16 v1, p1

    .line 284
    .line 285
    check-cast v1, La/tah0;

    .line 286
    .line 287
    sget-object v2, La/d2b0;->S1:La/rl70;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iput-object v1, v0, La/d2b0;->R1:La/tah0;

    .line 293
    .line 294
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object v0

    .line 297
    :pswitch_8
    check-cast v0, La/uwa0;

    .line 298
    .line 299
    move-object/from16 v1, p1

    .line 300
    .line 301
    check-cast v1, Ljava/lang/Throwable;

    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    iget-object v0, v0, La/uwa0;->p:La/duj;

    .line 307
    .line 308
    new-instance v2, La/yr0;

    .line 309
    .line 310
    const/16 v3, 0x12

    .line 311
    .line 312
    invoke-direct {v2, v1, v3}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 316
    .line 317
    .line 318
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_9
    check-cast v0, La/uua0;

    .line 322
    .line 323
    move-object/from16 v1, p1

    .line 324
    .line 325
    check-cast v1, La/cmc;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    sget-object v2, La/jsm0;->a:La/jsm0;

    .line 331
    .line 332
    invoke-static {v2}, La/mrv;->o0(La/jsm0;)V

    .line 333
    .line 334
    .line 335
    sget-object v2, La/ysm0;->b:La/ewb0;

    .line 336
    .line 337
    sget-object v3, La/iun;->a:La/iun;

    .line 338
    .line 339
    const-string v4, "type"

    .line 340
    .line 341
    invoke-virtual {v1, v4, v2, v3}, La/cmc;->a(Ljava/lang/String;La/ugi0;Ljava/util/List;)V

    .line 342
    .line 343
    .line 344
    new-instance v2, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-string v4, "kotlinx.serialization.Polymorphic<"

    .line 347
    .line 348
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    iget-object v4, v0, La/uua0;->a:La/sgy;

    .line 352
    .line 353
    invoke-interface {v4}, La/sgy;->J()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    const/16 v4, 0x3e

    .line 361
    .line 362
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    sget-object v4, La/ygi0;->b:La/ygi0;

    .line 370
    .line 371
    new-array v5, v8, [La/ugi0;

    .line 372
    .line 373
    invoke-static {v2, v4, v5}, La/x2x;->H(Ljava/lang/String;La/c3x;[La/ugi0;)La/wgi0;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const-string v4, "value"

    .line 378
    .line 379
    invoke-virtual {v1, v4, v2, v3}, La/cmc;->a(Ljava/lang/String;La/ugi0;Ljava/util/List;)V

    .line 380
    .line 381
    .line 382
    iget-object v0, v0, La/uua0;->b:Ljava/util/List;

    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    iput-object v0, v1, La/cmc;->b:Ljava/util/List;

    .line 388
    .line 389
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_a
    check-cast v0, La/rua0;

    .line 393
    .line 394
    move-object/from16 v1, p1

    .line 395
    .line 396
    check-cast v1, Ljava/lang/Integer;

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    new-instance v2, La/yta0;

    .line 403
    .line 404
    invoke-direct {v2, v1}, La/yta0;-><init>(I)V

    .line 405
    .line 406
    .line 407
    sget-object v1, La/rua0;->G:Ljava/util/List;

    .line 408
    .line 409
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_b
    check-cast v0, La/ota0;

    .line 416
    .line 417
    move-object/from16 v1, p1

    .line 418
    .line 419
    check-cast v1, Ljava/lang/Throwable;

    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    iget-object v2, v0, La/ota0;->q:La/duj;

    .line 425
    .line 426
    new-instance v3, La/lma0;

    .line 427
    .line 428
    const/4 v4, 0x4

    .line 429
    invoke-direct {v3, v0, v4}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 433
    .line 434
    .line 435
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 436
    .line 437
    return-object v0

    .line 438
    :pswitch_c
    check-cast v0, La/jpa0;

    .line 439
    .line 440
    move-object/from16 v1, p1

    .line 441
    .line 442
    check-cast v1, Landroid/view/MotionEvent;

    .line 443
    .line 444
    invoke-virtual {v0}, La/jpa0;->f()Lkotlin/jvm/functions/Function1;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_d
    check-cast v0, La/ugi0;

    .line 455
    .line 456
    move-object/from16 v1, p1

    .line 457
    .line 458
    check-cast v1, Ljava/lang/Integer;

    .line 459
    .line 460
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    new-instance v2, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 467
    .line 468
    .line 469
    invoke-interface {v0, v1}, La/ugi0;->e(I)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v3

    .line 473
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    const-string v3, ": "

    .line 477
    .line 478
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-interface {v0, v1}, La/ugi0;->g(I)La/ugi0;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-interface {v0}, La/ugi0;->h()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    return-object v0

    .line 497
    :pswitch_e
    check-cast v0, La/rma0;

    .line 498
    .line 499
    move-object/from16 v1, p1

    .line 500
    .line 501
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 502
    .line 503
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    instance-of v3, v2, La/qma0;

    .line 511
    .line 512
    if-eqz v3, :cond_0

    .line 513
    .line 514
    move-object v7, v2

    .line 515
    check-cast v7, La/qma0;

    .line 516
    .line 517
    :cond_0
    if-eqz v7, :cond_2

    .line 518
    .line 519
    iget-object v2, v0, La/rma0;->b:La/a4x;

    .line 520
    .line 521
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    new-instance v3, Ljava/util/ArrayList;

    .line 526
    .line 527
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 532
    .line 533
    .line 534
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 539
    .line 540
    .line 541
    move-result v4

    .line 542
    if-eqz v4, :cond_1

    .line 543
    .line 544
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    check-cast v4, La/a4x;

    .line 549
    .line 550
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    goto :goto_0

    .line 558
    :cond_1
    iget-object v2, v0, La/rma0;->c:La/a4x;

    .line 559
    .line 560
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    iget-object v4, v0, La/rma0;->a:La/a4x;

    .line 565
    .line 566
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    iget-object v0, v0, La/rma0;->d:La/gka0;

    .line 571
    .line 572
    invoke-virtual {v7, v3, v2, v4, v0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 573
    .line 574
    .line 575
    :cond_2
    invoke-virtual {v1, v8, v9}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->b(ZZ)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderRecyclerView()La/y9b;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 597
    .line 598
    .line 599
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object v0

    .line 602
    :pswitch_f
    check-cast v0, La/nla0;

    .line 603
    .line 604
    move-object/from16 v1, p1

    .line 605
    .line 606
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 607
    .line 608
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    instance-of v3, v2, La/mla0;

    .line 616
    .line 617
    if-eqz v3, :cond_3

    .line 618
    .line 619
    move-object v7, v2

    .line 620
    check-cast v7, La/mla0;

    .line 621
    .line 622
    :cond_3
    if-eqz v7, :cond_5

    .line 623
    .line 624
    iget-object v2, v0, La/nla0;->b:La/a4x;

    .line 625
    .line 626
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    new-instance v3, Ljava/util/ArrayList;

    .line 631
    .line 632
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 633
    .line 634
    .line 635
    move-result v4

    .line 636
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 637
    .line 638
    .line 639
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    if-eqz v4, :cond_4

    .line 648
    .line 649
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    check-cast v4, La/a4x;

    .line 654
    .line 655
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    goto :goto_1

    .line 663
    :cond_4
    iget-object v2, v0, La/nla0;->c:La/a4x;

    .line 664
    .line 665
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    iget-object v4, v0, La/nla0;->a:La/a4x;

    .line 670
    .line 671
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    iget-object v0, v0, La/nla0;->d:La/qka0;

    .line 676
    .line 677
    invoke-virtual {v7, v3, v2, v4, v0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 678
    .line 679
    .line 680
    :cond_5
    invoke-virtual {v1, v8, v9}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->b(ZZ)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderRecyclerView()La/y9b;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 702
    .line 703
    .line 704
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 705
    .line 706
    return-object v0

    .line 707
    :pswitch_10
    check-cast v0, La/rpg;

    .line 708
    .line 709
    move-object/from16 v1, p1

    .line 710
    .line 711
    check-cast v1, La/cp;

    .line 712
    .line 713
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 717
    .line 718
    check-cast v2, La/vjd;

    .line 719
    .line 720
    iget-object v2, v2, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 721
    .line 722
    sget-object v3, La/pek0;->g:La/pek0;

    .line 723
    .line 724
    invoke-virtual {v2, v3}, La/x1;->setViewCompositionStrategy(La/vgu0;)V

    .line 725
    .line 726
    .line 727
    new-instance v2, La/ka70;

    .line 728
    .line 729
    const/16 v3, 0x1c

    .line 730
    .line 731
    invoke-direct {v2, v1, v0, v3}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 732
    .line 733
    .line 734
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 735
    .line 736
    .line 737
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 738
    .line 739
    return-object v0

    .line 740
    :pswitch_11
    check-cast v0, La/hfa0;

    .line 741
    .line 742
    move-object/from16 v1, p1

    .line 743
    .line 744
    check-cast v1, La/abi0;

    .line 745
    .line 746
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    iget-boolean v0, v0, La/hfa0;->e:Z

    .line 750
    .line 751
    if-eqz v0, :cond_6

    .line 752
    .line 753
    sget-object v0, La/paa0;->a:La/paa0;

    .line 754
    .line 755
    goto :goto_2

    .line 756
    :cond_6
    sget-object v0, La/paa0;->b:La/paa0;

    .line 757
    .line 758
    :goto_2
    sget-object v2, La/cbi0;->g:La/zai0;

    .line 759
    .line 760
    sget-object v3, La/cbi0;->a:[La/iiy;

    .line 761
    .line 762
    aget-object v3, v3, v4

    .line 763
    .line 764
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 768
    .line 769
    .line 770
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 771
    .line 772
    return-object v0

    .line 773
    :pswitch_12
    check-cast v0, La/x6f;

    .line 774
    .line 775
    move-object/from16 v1, p1

    .line 776
    .line 777
    check-cast v1, La/cp;

    .line 778
    .line 779
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    new-instance v2, La/ka70;

    .line 783
    .line 784
    const/16 v3, 0x1b

    .line 785
    .line 786
    invoke-direct {v2, v1, v0, v3}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 790
    .line 791
    .line 792
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 793
    .line 794
    return-object v0

    .line 795
    :pswitch_13
    check-cast v0, La/vea0;

    .line 796
    .line 797
    move-object/from16 v1, p1

    .line 798
    .line 799
    check-cast v1, La/hcz;

    .line 800
    .line 801
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    iget-object v2, v0, La/vea0;->d:La/a4x;

    .line 805
    .line 806
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    new-instance v3, La/csw;

    .line 811
    .line 812
    const/16 v4, 0x9

    .line 813
    .line 814
    invoke-direct {v3, v0, v4}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 815
    .line 816
    .line 817
    new-instance v5, La/ugd;

    .line 818
    .line 819
    const v0, 0x51c43c22

    .line 820
    .line 821
    .line 822
    invoke-direct {v5, v0, v9, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    const/4 v6, 0x6

    .line 826
    const/4 v3, 0x0

    .line 827
    const/4 v4, 0x0

    .line 828
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 829
    .line 830
    .line 831
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 832
    .line 833
    return-object v0

    .line 834
    :pswitch_14
    check-cast v0, La/z7a0;

    .line 835
    .line 836
    move-object/from16 v1, p1

    .line 837
    .line 838
    check-cast v1, Ljava/lang/Throwable;

    .line 839
    .line 840
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    iget-object v2, v0, La/z7a0;->r:La/duj;

    .line 844
    .line 845
    new-instance v3, La/cz90;

    .line 846
    .line 847
    invoke-direct {v3, v0, v5}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 851
    .line 852
    .line 853
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 854
    .line 855
    return-object v0

    .line 856
    :pswitch_15
    check-cast v0, La/u7a0;

    .line 857
    .line 858
    move-object/from16 v1, p1

    .line 859
    .line 860
    check-cast v1, La/hcz;

    .line 861
    .line 862
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    iget-object v2, v0, La/u7a0;->b:La/a4x;

    .line 866
    .line 867
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 868
    .line 869
    .line 870
    move-result v2

    .line 871
    new-instance v3, La/csw;

    .line 872
    .line 873
    const/16 v4, 0x8

    .line 874
    .line 875
    invoke-direct {v3, v0, v4}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 876
    .line 877
    .line 878
    new-instance v5, La/ugd;

    .line 879
    .line 880
    const v0, 0x1e59417

    .line 881
    .line 882
    .line 883
    invoke-direct {v5, v0, v9, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    const/4 v6, 0x6

    .line 887
    const/4 v3, 0x0

    .line 888
    const/4 v4, 0x0

    .line 889
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 890
    .line 891
    .line 892
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 893
    .line 894
    return-object v0

    .line 895
    :pswitch_16
    move-object v1, v0

    .line 896
    check-cast v1, La/d6a0;

    .line 897
    .line 898
    move-object/from16 v4, p1

    .line 899
    .line 900
    check-cast v4, Ljava/lang/Throwable;

    .line 901
    .line 902
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 906
    .line 907
    iget-object v5, v0, La/ocj;->a:La/p7m0;

    .line 908
    .line 909
    :cond_7
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    iget-object v2, v1, La/i3t0;->f:La/oyg0;

    .line 917
    .line 918
    move-object v6, v0

    .line 919
    check-cast v6, La/v5a0;

    .line 920
    .line 921
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    const/4 v11, 0x0

    .line 925
    const/16 v12, 0x31

    .line 926
    .line 927
    const/4 v7, 0x0

    .line 928
    const/4 v8, 0x0

    .line 929
    const/4 v9, 0x1

    .line 930
    const/4 v10, 0x0

    .line 931
    invoke-static/range {v6 .. v12}, La/v5a0;->a(La/v5a0;La/nc5;ZZZLa/h8a0;I)La/v5a0;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    invoke-virtual {v5, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v0

    .line 939
    if-eqz v0, :cond_7

    .line 940
    .line 941
    iget-object v0, v1, La/d6a0;->u:La/duj;

    .line 942
    .line 943
    new-instance v1, La/so90;

    .line 944
    .line 945
    invoke-direct {v1, v3}, La/so90;-><init>(B)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0, v4, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 949
    .line 950
    .line 951
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 952
    .line 953
    return-object v0

    .line 954
    :pswitch_17
    check-cast v0, La/et90;

    .line 955
    .line 956
    move-object/from16 v1, p1

    .line 957
    .line 958
    check-cast v1, Landroid/text/Editable;

    .line 959
    .line 960
    sget-object v3, La/et90;->j2:La/mi70;

    .line 961
    .line 962
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v0}, La/et90;->U0()La/kt90;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v1

    .line 973
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    iget-object v3, v0, La/kt90;->e:La/p7m0;

    .line 977
    .line 978
    :cond_8
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    move-object v4, v0

    .line 983
    check-cast v4, La/lt90;

    .line 984
    .line 985
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    new-instance v4, La/lt90;

    .line 989
    .line 990
    invoke-direct {v4, v2, v1}, La/lt90;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 994
    .line 995
    .line 996
    move-result v0

    .line 997
    if-eqz v0, :cond_8

    .line 998
    .line 999
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1000
    .line 1001
    return-object v0

    .line 1002
    :pswitch_18
    check-cast v0, La/es90;

    .line 1003
    .line 1004
    move-object/from16 v14, p1

    .line 1005
    .line 1006
    check-cast v14, Ljava/lang/Throwable;

    .line 1007
    .line 1008
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    iget-object v1, v0, La/es90;->j:La/cyu;

    .line 1012
    .line 1013
    iget-object v0, v0, La/es90;->i:La/g090;

    .line 1014
    .line 1015
    iget-object v3, v0, La/g090;->b:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v3, La/p7m0;

    .line 1018
    .line 1019
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v3

    .line 1023
    check-cast v3, La/cr90;

    .line 1024
    .line 1025
    iget-object v3, v3, La/cr90;->c:Ljava/lang/String;

    .line 1026
    .line 1027
    const-string v4, "+"

    .line 1028
    .line 1029
    invoke-static {v3, v4, v2, v8}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v2

    .line 1033
    invoke-virtual {v1, v2}, La/cyu;->y(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    iget-object v0, v0, La/g090;->b:Ljava/lang/Object;

    .line 1037
    .line 1038
    move-object v1, v0

    .line 1039
    check-cast v1, La/p7m0;

    .line 1040
    .line 1041
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    move-object v9, v0

    .line 1046
    check-cast v9, La/cr90;

    .line 1047
    .line 1048
    const/4 v15, 0x0

    .line 1049
    const/16 v16, 0x1bf

    .line 1050
    .line 1051
    const/4 v10, 0x0

    .line 1052
    const/4 v11, 0x0

    .line 1053
    const/4 v12, 0x0

    .line 1054
    const/4 v13, 0x0

    .line 1055
    invoke-static/range {v9 .. v16}, La/cr90;->a(La/cr90;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/Throwable;Ljava/lang/Integer;I)La/cr90;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v0

    .line 1063
    if-eqz v0, :cond_9

    .line 1064
    .line 1065
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1066
    .line 1067
    return-object v0

    .line 1068
    :pswitch_19
    check-cast v0, La/w590;

    .line 1069
    .line 1070
    move-object/from16 v1, p1

    .line 1071
    .line 1072
    check-cast v1, Ljava/lang/String;

    .line 1073
    .line 1074
    sget-object v2, La/w590;->W1:La/mi70;

    .line 1075
    .line 1076
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v0}, La/w590;->I0()La/s690;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1084
    .line 1085
    .line 1086
    move-result v2

    .line 1087
    if-nez v2, :cond_a

    .line 1088
    .line 1089
    goto :goto_3

    .line 1090
    :cond_a
    iget-object v2, v0, La/s690;->q:La/ctf0;

    .line 1091
    .line 1092
    new-array v3, v8, [Ljava/lang/Object;

    .line 1093
    .line 1094
    const v4, 0x7f130690

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v2, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v2

    .line 1101
    iget-object v0, v0, La/s690;->r:La/grj;

    .line 1102
    .line 1103
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v1

    .line 1107
    invoke-virtual {v0, v1}, La/grj;->a(Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1111
    .line 1112
    return-object v0

    .line 1113
    :pswitch_1a
    check-cast v0, La/t190;

    .line 1114
    .line 1115
    move-object/from16 v1, p1

    .line 1116
    .line 1117
    check-cast v1, Ljava/lang/Throwable;

    .line 1118
    .line 1119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    iget-object v2, v0, La/t190;->l:La/duj;

    .line 1123
    .line 1124
    new-instance v4, La/ds60;

    .line 1125
    .line 1126
    invoke-direct {v4, v0, v3}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1130
    .line 1131
    .line 1132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1133
    .line 1134
    return-object v0

    .line 1135
    :pswitch_1b
    check-cast v0, La/uy80;

    .line 1136
    .line 1137
    move-object/from16 v1, p1

    .line 1138
    .line 1139
    check-cast v1, La/my80;

    .line 1140
    .line 1141
    sget-object v2, La/uy80;->W1:La/jh70;

    .line 1142
    .line 1143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v0}, La/uy80;->G0()La/k3t0;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1151
    .line 1152
    .line 1153
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1154
    .line 1155
    return-object v0

    .line 1156
    :pswitch_1c
    check-cast v0, La/as80;

    .line 1157
    .line 1158
    move-object/from16 v1, p1

    .line 1159
    .line 1160
    check-cast v1, La/eg60;

    .line 1161
    .line 1162
    sget-object v2, La/as80;->Y1:La/fl70;

    .line 1163
    .line 1164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v0}, La/as80;->H0()La/jt80;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    sget-object v1, La/zq80;->a:La/zq80;

    .line 1172
    .line 1173
    invoke-virtual {v0, v1}, La/jt80;->b0(La/lr80;)V

    .line 1174
    .line 1175
    .line 1176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1177
    .line 1178
    return-object v0

    .line 1179
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
