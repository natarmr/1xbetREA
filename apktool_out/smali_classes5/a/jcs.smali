.class public final synthetic La/jcs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jcs;->a:B

    iput-object p1, p0, La/jcs;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jcs;->a:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x6

    .line 9
    const/16 v6, 0xe

    .line 10
    .line 11
    const/4 v7, 0x5

    .line 12
    const/4 v8, 0x2

    .line 13
    const-string v9, "viewModelFactory"

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    iget-object v0, v0, La/jcs;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v0, La/abu;

    .line 23
    .line 24
    iget-object v0, v0, La/abu;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/gii0;

    .line 27
    .line 28
    const-class v1, La/kcv;

    .line 29
    .line 30
    sget-object v2, La/sre0;->a:La/tre0;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/kcv;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_0
    check-cast v0, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;

    .line 44
    .line 45
    invoke-static {v0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->c(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;)La/xav;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_1
    check-cast v0, La/g8v;

    .line 51
    .line 52
    new-instance v1, La/q0h0;

    .line 53
    .line 54
    iget-object v0, v0, La/g8v;->O1:La/daf;

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    iget-object v0, v0, La/daf;->m:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, La/n5d0;

    .line 61
    .line 62
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/hii;

    .line 67
    .line 68
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_0
    const-string v0, "component"

    .line 73
    .line 74
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v11

    .line 78
    :pswitch_2
    check-cast v0, La/fsd;

    .line 79
    .line 80
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0

    .line 85
    :pswitch_3
    check-cast v0, La/a6u;

    .line 86
    .line 87
    iget-object v0, v0, La/a6u;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, La/gst0;

    .line 90
    .line 91
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    invoke-virtual {v0, v10}, La/gst0;->d(Z)Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    :cond_1
    if-eqz v10, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0}, La/gst0;->i()V

    .line 104
    .line 105
    .line 106
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_4
    check-cast v0, La/edu;

    .line 110
    .line 111
    iget-object v0, v0, La/edu;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, La/gst0;

    .line 114
    .line 115
    invoke-virtual {v0, v10, v10}, La/gst0;->h(ZZ)V

    .line 116
    .line 117
    .line 118
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_5
    check-cast v0, La/lbu;

    .line 122
    .line 123
    iget-object v0, v0, La/lbu;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La/gst0;

    .line 126
    .line 127
    invoke-virtual {v0, v10, v10}, La/gst0;->h(ZZ)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_6
    check-cast v0, La/khf0;

    .line 134
    .line 135
    iget-object v0, v0, La/khf0;->c:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v0, La/gst0;

    .line 138
    .line 139
    invoke-virtual {v0, v10, v10}, La/gst0;->h(ZZ)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_7
    check-cast v0, La/v7i;

    .line 146
    .line 147
    iget-object v1, v0, La/v7i;->e:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, La/m0o0;

    .line 150
    .line 151
    invoke-virtual {v1}, La/m0o0;->d()La/gmq;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iget-object v9, v0, La/v7i;->i:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v9, La/h9c;

    .line 158
    .line 159
    invoke-virtual {v9}, La/h9c;->a()La/eu4;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    iget-object v11, v0, La/v7i;->g:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v11, La/qj9;

    .line 166
    .line 167
    invoke-virtual {v11}, La/qj9;->b()La/i89;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    iget-object v12, v0, La/v7i;->j:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v12, La/edo;

    .line 174
    .line 175
    invoke-virtual {v12}, La/edo;->c()La/eu4;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    iget-object v13, v0, La/v7i;->l:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v13, La/zfo;

    .line 182
    .line 183
    invoke-virtual {v13}, La/zfo;->c()La/eu4;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    iget-object v0, v0, La/v7i;->h:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, La/nvu;

    .line 190
    .line 191
    iget-object v0, v0, La/nvu;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, La/g8n0;

    .line 194
    .line 195
    iget-object v0, v0, La/g8n0;->a:La/p7m0;

    .line 196
    .line 197
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    new-instance v14, La/qaf0;

    .line 206
    .line 207
    invoke-direct {v14, v0, v6}, La/qaf0;-><init>(La/gmq;B)V

    .line 208
    .line 209
    .line 210
    new-array v0, v5, [La/gmq;

    .line 211
    .line 212
    aput-object v1, v0, v10

    .line 213
    .line 214
    aput-object v9, v0, v4

    .line 215
    .line 216
    aput-object v11, v0, v8

    .line 217
    .line 218
    aput-object v12, v0, v3

    .line 219
    .line 220
    aput-object v13, v0, v2

    .line 221
    .line 222
    aput-object v14, v0, v7

    .line 223
    .line 224
    new-instance v1, La/pxt;

    .line 225
    .line 226
    invoke-direct {v1, v0, v8}, La/pxt;-><init>([La/gmq;B)V

    .line 227
    .line 228
    .line 229
    return-object v1

    .line 230
    :pswitch_8
    check-cast v0, La/uii;

    .line 231
    .line 232
    iget-object v0, v0, La/uii;->e:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, La/pru;

    .line 235
    .line 236
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    return-object v0

    .line 241
    :pswitch_9
    check-cast v0, La/mci;

    .line 242
    .line 243
    iget-object v1, v0, La/mci;->a:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v1, La/z8u;

    .line 246
    .line 247
    iget-object v1, v1, La/z8u;->a:La/m0o0;

    .line 248
    .line 249
    invoke-virtual {v1}, La/m0o0;->d()La/gmq;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    iget-object v9, v0, La/mci;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v9, La/h9c;

    .line 256
    .line 257
    invoke-virtual {v9}, La/h9c;->a()La/eu4;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    iget-object v11, v0, La/mci;->b:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v11, La/pj9;

    .line 264
    .line 265
    iget-object v11, v11, La/pj9;->a:La/qj9;

    .line 266
    .line 267
    invoke-virtual {v11}, La/qj9;->b()La/i89;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    iget-object v12, v0, La/mci;->f:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v12, La/e1u;

    .line 274
    .line 275
    iget-object v12, v12, La/e1u;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v12, La/edo;

    .line 278
    .line 279
    invoke-virtual {v12}, La/edo;->c()La/eu4;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    iget-object v13, v0, La/mci;->h:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v13, La/cmt;

    .line 286
    .line 287
    iget-object v13, v13, La/cmt;->b:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v13, La/zfo;

    .line 290
    .line 291
    invoke-virtual {v13}, La/zfo;->c()La/eu4;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    iget-object v0, v0, La/mci;->e:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v0, La/dj9;

    .line 298
    .line 299
    iget-object v0, v0, La/dj9;->a:La/nvu;

    .line 300
    .line 301
    iget-object v0, v0, La/nvu;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, La/g8n0;

    .line 304
    .line 305
    iget-object v0, v0, La/g8n0;->a:La/p7m0;

    .line 306
    .line 307
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    new-instance v14, La/qaf0;

    .line 316
    .line 317
    invoke-direct {v14, v0, v6}, La/qaf0;-><init>(La/gmq;B)V

    .line 318
    .line 319
    .line 320
    new-array v0, v5, [La/gmq;

    .line 321
    .line 322
    aput-object v1, v0, v10

    .line 323
    .line 324
    aput-object v9, v0, v4

    .line 325
    .line 326
    aput-object v11, v0, v8

    .line 327
    .line 328
    aput-object v12, v0, v3

    .line 329
    .line 330
    aput-object v13, v0, v2

    .line 331
    .line 332
    aput-object v14, v0, v7

    .line 333
    .line 334
    new-instance v1, La/pxt;

    .line 335
    .line 336
    invoke-direct {v1, v0, v10}, La/pxt;-><init>([La/gmq;B)V

    .line 337
    .line 338
    .line 339
    return-object v1

    .line 340
    :pswitch_a
    check-cast v0, La/kit;

    .line 341
    .line 342
    new-instance v1, La/q0h0;

    .line 343
    .line 344
    iget-object v0, v0, La/kit;->M1:La/gii;

    .line 345
    .line 346
    if-eqz v0, :cond_3

    .line 347
    .line 348
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 349
    .line 350
    .line 351
    return-object v1

    .line 352
    :cond_3
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v11

    .line 356
    :pswitch_b
    check-cast v0, La/yft;

    .line 357
    .line 358
    new-instance v1, La/agt;

    .line 359
    .line 360
    iget v0, v0, La/yft;->a:I

    .line 361
    .line 362
    invoke-direct {v1, v0}, La/agt;-><init>(I)V

    .line 363
    .line 364
    .line 365
    return-object v1

    .line 366
    :pswitch_c
    check-cast v0, La/jat;

    .line 367
    .line 368
    iget-object v0, v0, La/jat;->m:La/p7m0;

    .line 369
    .line 370
    sget-object v1, La/i8d;->c:La/i8d;

    .line 371
    .line 372
    invoke-virtual {v0, v11, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_d
    check-cast v0, La/t9t;

    .line 379
    .line 380
    iget-object v0, v0, La/t9t;->a:La/gii0;

    .line 381
    .line 382
    const-class v1, La/d7t;

    .line 383
    .line 384
    sget-object v2, La/sre0;->a:La/tre0;

    .line 385
    .line 386
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    check-cast v0, La/d7t;

    .line 395
    .line 396
    return-object v0

    .line 397
    :pswitch_e
    check-cast v0, La/a9t;

    .line 398
    .line 399
    iget-object v1, v0, La/a9t;->o:La/p7m0;

    .line 400
    .line 401
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    move-object v2, v0

    .line 406
    check-cast v2, Ljava/lang/Boolean;

    .line 407
    .line 408
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 412
    .line 413
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_4

    .line 418
    .line 419
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_f
    check-cast v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;

    .line 423
    .line 424
    iget-object v0, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->d:Lkotlin/jvm/functions/Function0;

    .line 425
    .line 426
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 430
    .line 431
    return-object v0

    .line 432
    :pswitch_10
    check-cast v0, La/g5t;

    .line 433
    .line 434
    iget-object v0, v0, La/g5t;->i:La/p7m0;

    .line 435
    .line 436
    sget-object v1, La/i8d;->c:La/i8d;

    .line 437
    .line 438
    invoke-virtual {v0, v11, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    return-object v0

    .line 444
    :pswitch_11
    check-cast v0, La/e1t;

    .line 445
    .line 446
    iget-object v1, v0, La/e1t;->e:La/yqc;

    .line 447
    .line 448
    invoke-virtual {v1}, La/yqc;->v()V

    .line 449
    .line 450
    .line 451
    iget-object v1, v0, La/e1t;->f:La/xsc;

    .line 452
    .line 453
    invoke-virtual {v1}, La/xsc;->b()V

    .line 454
    .line 455
    .line 456
    iget-object v1, v0, La/e1t;->d:La/a5v;

    .line 457
    .line 458
    new-instance v2, La/lhv0;

    .line 459
    .line 460
    iget-object v3, v0, La/e1t;->n:La/p7m0;

    .line 461
    .line 462
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    check-cast v4, La/s0t;

    .line 467
    .line 468
    iget-wide v4, v4, La/s0t;->a:J

    .line 469
    .line 470
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    check-cast v6, La/s0t;

    .line 475
    .line 476
    iget-wide v6, v6, La/s0t;->b:J

    .line 477
    .line 478
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    check-cast v8, La/s0t;

    .line 483
    .line 484
    iget v8, v8, La/s0t;->c:I

    .line 485
    .line 486
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    check-cast v9, La/s0t;

    .line 491
    .line 492
    iget-wide v9, v9, La/s0t;->d:J

    .line 493
    .line 494
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    check-cast v3, La/s0t;

    .line 499
    .line 500
    iget-object v3, v3, La/s0t;->e:Ljava/lang/String;

    .line 501
    .line 502
    move-wide/from16 v18, v9

    .line 503
    .line 504
    move-object v10, v3

    .line 505
    move-wide v3, v4

    .line 506
    move-wide v5, v6

    .line 507
    move v7, v8

    .line 508
    move-wide/from16 v8, v18

    .line 509
    .line 510
    invoke-direct/range {v2 .. v10}, La/lhv0;-><init>(JJIJLjava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1, v2}, La/a5v;->a(La/mhv0;)V

    .line 514
    .line 515
    .line 516
    iget-object v0, v0, La/e1t;->c:La/ali;

    .line 517
    .line 518
    invoke-virtual {v0}, La/ali;->B()V

    .line 519
    .line 520
    .line 521
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 522
    .line 523
    return-object v0

    .line 524
    :pswitch_12
    check-cast v0, La/p0t;

    .line 525
    .line 526
    iget-object v0, v0, La/p0t;->K1:La/fiu0;

    .line 527
    .line 528
    if-eqz v0, :cond_5

    .line 529
    .line 530
    return-object v0

    .line 531
    :cond_5
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v11

    .line 535
    :pswitch_13
    check-cast v0, La/yys;

    .line 536
    .line 537
    iget-object v1, v0, La/yys;->f:La/xsc;

    .line 538
    .line 539
    invoke-virtual {v1}, La/xsc;->b()V

    .line 540
    .line 541
    .line 542
    iget-object v1, v0, La/yys;->g:La/yqc;

    .line 543
    .line 544
    invoke-virtual {v1}, La/yqc;->v()V

    .line 545
    .line 546
    .line 547
    iget-object v1, v0, La/yys;->d:La/a5v;

    .line 548
    .line 549
    new-instance v2, La/khv0;

    .line 550
    .line 551
    iget-object v3, v0, La/yys;->B:La/p7m0;

    .line 552
    .line 553
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    check-cast v4, La/ixs;

    .line 558
    .line 559
    iget-wide v4, v4, La/ixs;->a:J

    .line 560
    .line 561
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    check-cast v6, La/ixs;

    .line 566
    .line 567
    iget-wide v6, v6, La/ixs;->b:J

    .line 568
    .line 569
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    check-cast v8, La/ixs;

    .line 574
    .line 575
    iget-object v9, v8, La/ixs;->c:Ljava/lang/String;

    .line 576
    .line 577
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v8

    .line 581
    check-cast v8, La/ixs;

    .line 582
    .line 583
    iget-wide v10, v8, La/ixs;->d:J

    .line 584
    .line 585
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    check-cast v3, La/ixs;

    .line 590
    .line 591
    iget-object v3, v3, La/ixs;->e:Ljava/lang/String;

    .line 592
    .line 593
    move-wide/from16 v18, v10

    .line 594
    .line 595
    move-object v10, v3

    .line 596
    move-wide v3, v4

    .line 597
    move-wide v5, v6

    .line 598
    move-wide/from16 v7, v18

    .line 599
    .line 600
    invoke-direct/range {v2 .. v10}, La/khv0;-><init>(JJJLjava/lang/String;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v1, v2}, La/a5v;->a(La/mhv0;)V

    .line 604
    .line 605
    .line 606
    iget-object v0, v0, La/yys;->c:La/ali;

    .line 607
    .line 608
    invoke-virtual {v0}, La/ali;->B()V

    .line 609
    .line 610
    .line 611
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 612
    .line 613
    return-object v0

    .line 614
    :pswitch_14
    check-cast v0, La/wws;

    .line 615
    .line 616
    iget-object v0, v0, La/wws;->L1:La/fiu0;

    .line 617
    .line 618
    if-eqz v0, :cond_6

    .line 619
    .line 620
    return-object v0

    .line 621
    :cond_6
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    throw v11

    .line 625
    :pswitch_15
    check-cast v0, La/azj0;

    .line 626
    .line 627
    const-class v1, La/tws;

    .line 628
    .line 629
    sget-object v2, La/sre0;->a:La/tre0;

    .line 630
    .line 631
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    invoke-virtual {v0, v1}, La/azj0;->d(La/sgy;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    check-cast v0, La/tws;

    .line 640
    .line 641
    return-object v0

    .line 642
    :pswitch_16
    check-cast v0, La/f3j;

    .line 643
    .line 644
    invoke-virtual {v0}, La/eiu0;->s()La/diu0;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 649
    .line 650
    .line 651
    move-result-object v12

    .line 652
    iget-object v1, v0, La/f3j;->d:La/mne;

    .line 653
    .line 654
    iget-object v15, v1, La/mne;->a:La/rwj;

    .line 655
    .line 656
    sget-object v13, La/uvs;->a:La/uvs;

    .line 657
    .line 658
    new-instance v1, La/lvs;

    .line 659
    .line 660
    invoke-direct {v1, v0, v11, v7}, La/lvs;-><init>(La/f3j;La/yje;B)V

    .line 661
    .line 662
    .line 663
    const/16 v17, 0xa

    .line 664
    .line 665
    const/4 v14, 0x0

    .line 666
    move-object/from16 v16, v1

    .line 667
    .line 668
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 669
    .line 670
    .line 671
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 672
    .line 673
    return-object v0

    .line 674
    :pswitch_17
    check-cast v0, La/nqs;

    .line 675
    .line 676
    new-instance v1, La/mqs;

    .line 677
    .line 678
    iget-object v2, v0, La/eiu0;->b:La/vzg0;

    .line 679
    .line 680
    if-eqz v2, :cond_7

    .line 681
    .line 682
    iget-object v0, v0, La/nqs;->f:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v0, La/xrs;

    .line 685
    .line 686
    iget-wide v3, v0, La/xrs;->a:J

    .line 687
    .line 688
    iget-boolean v5, v0, La/xrs;->c:Z

    .line 689
    .line 690
    iget-wide v6, v0, La/xrs;->b:J

    .line 691
    .line 692
    invoke-direct/range {v1 .. v7}, La/mqs;-><init>(La/vzg0;JZJ)V

    .line 693
    .line 694
    .line 695
    return-object v1

    .line 696
    :cond_7
    const-string v0, "savedStateHandle"

    .line 697
    .line 698
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    throw v11

    .line 702
    :pswitch_18
    move-object v1, v0

    .line 703
    check-cast v1, La/zns;

    .line 704
    .line 705
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 706
    .line 707
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 708
    .line 709
    :cond_8
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 717
    .line 718
    move-object v4, v0

    .line 719
    check-cast v4, La/qns;

    .line 720
    .line 721
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    const/4 v10, 0x0

    .line 725
    const/16 v11, 0x1fc

    .line 726
    .line 727
    const/4 v5, 0x0

    .line 728
    const/4 v6, 0x0

    .line 729
    const/4 v7, 0x0

    .line 730
    const/4 v8, 0x0

    .line 731
    const/4 v9, 0x0

    .line 732
    invoke-static/range {v4 .. v11}, La/qns;->a(La/qns;ZZZLorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;Ljava/util/ArrayList;Ljava/util/ArrayList;I)La/qns;

    .line 733
    .line 734
    .line 735
    move-result-object v3

    .line 736
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    if-eqz v0, :cond_8

    .line 741
    .line 742
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 743
    .line 744
    return-object v0

    .line 745
    :pswitch_19
    check-cast v0, La/yks;

    .line 746
    .line 747
    sget-object v1, La/kjs;->a:La/kjs;

    .line 748
    .line 749
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 753
    .line 754
    return-object v0

    .line 755
    :pswitch_1a
    check-cast v0, La/uhs;

    .line 756
    .line 757
    iget-object v0, v0, La/uhs;->u:La/pru;

    .line 758
    .line 759
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    return-object v0

    .line 764
    :pswitch_1b
    check-cast v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;

    .line 765
    .line 766
    sget-object v3, La/iun;->a:La/iun;

    .line 767
    .line 768
    sget-object v4, La/ais;->a:La/ais;

    .line 769
    .line 770
    iget-object v7, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;->b:La/j700;

    .line 771
    .line 772
    new-instance v1, La/cis;

    .line 773
    .line 774
    const/4 v6, 0x0

    .line 775
    const/4 v8, 0x0

    .line 776
    const-string v2, ""

    .line 777
    .line 778
    const/4 v5, 0x0

    .line 779
    invoke-direct/range {v1 .. v8}, La/cis;-><init>(Ljava/lang/String;Ljava/util/List;La/ais;La/bis;ZLa/j700;Z)V

    .line 780
    .line 781
    .line 782
    return-object v1

    .line 783
    :pswitch_1c
    check-cast v0, La/mcs;

    .line 784
    .line 785
    new-instance v1, La/q0h0;

    .line 786
    .line 787
    iget-object v0, v0, La/mcs;->L1:La/rhi;

    .line 788
    .line 789
    if-eqz v0, :cond_9

    .line 790
    .line 791
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 792
    .line 793
    .line 794
    return-object v1

    .line 795
    :cond_9
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    throw v11

    .line 799
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
