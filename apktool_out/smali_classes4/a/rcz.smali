.class public final synthetic La/rcz;
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
    iput-byte p2, p0, La/rcz;->a:B

    iput-object p1, p0, La/rcz;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rcz;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "viewModelFactory"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v0, v0, La/rcz;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v0, La/us00;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, La/vs00;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v3, v0, La/us00;->a:La/l4x;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast v0, La/xs00;

    .line 41
    .line 42
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 43
    .line 44
    iget-object v0, v0, Lorg/platform/app/ApplicationLoader;->p:La/z7z;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, La/j1q0;

    .line 53
    .line 54
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 55
    .line 56
    iget-object v0, v0, La/m1q0;->a:La/q7d0;

    .line 57
    .line 58
    const-string v4, "TEST_MULTIPLY_STRINGS_ENABLE"

    .line 59
    .line 60
    invoke-virtual {v0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    :cond_0
    invoke-direct {v2, v1, v3, v5}, La/vs00;-><init>(Landroid/content/res/Resources;La/l4x;Z)V

    .line 69
    .line 70
    .line 71
    return-object v2

    .line 72
    :pswitch_0
    check-cast v0, La/zn00;

    .line 73
    .line 74
    iget-object v0, v0, La/zn00;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, La/gii0;

    .line 77
    .line 78
    const-class v1, La/gs00;

    .line 79
    .line 80
    sget-object v2, La/sre0;->a:La/tre0;

    .line 81
    .line 82
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/gs00;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_1
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 94
    .line 95
    sget v1, Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;->e:I

    .line 96
    .line 97
    new-instance v1, La/tq00;

    .line 98
    .line 99
    invoke-direct {v1, v0}, La/tq00;-><init>(Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;)V

    .line 100
    .line 101
    .line 102
    return-object v1

    .line 103
    :pswitch_2
    check-cast v0, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 104
    .line 105
    sget v1, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 106
    .line 107
    new-instance v1, La/r0x;

    .line 108
    .line 109
    invoke-direct {v1, v0}, La/r0x;-><init>(Landroid/widget/ImageView;)V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :pswitch_3
    check-cast v0, La/pzu;

    .line 114
    .line 115
    iget-object v0, v0, La/pzu;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, La/fsd;

    .line 118
    .line 119
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget v0, v0, La/v8d;->a:I

    .line 124
    .line 125
    const/16 v1, 0x3e7

    .line 126
    .line 127
    if-ne v0, v1, :cond_1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    move v3, v5

    .line 131
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0

    .line 136
    :pswitch_4
    check-cast v0, La/yl00;

    .line 137
    .line 138
    iget-object v0, v0, La/yl00;->g2:La/fiu0;

    .line 139
    .line 140
    if-eqz v0, :cond_2

    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v6

    .line 147
    :pswitch_5
    check-cast v0, La/mez;

    .line 148
    .line 149
    invoke-virtual {v0}, La/mez;->g()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_3

    .line 154
    .line 155
    invoke-virtual {v0}, La/mez;->c()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_4

    .line 160
    .line 161
    invoke-virtual {v0}, La/mez;->d()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_3

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    move v3, v5

    .line 169
    :cond_4
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :pswitch_6
    check-cast v0, La/qi00;

    .line 175
    .line 176
    iget-object v0, v0, La/qi00;->u:La/pru;

    .line 177
    .line 178
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :pswitch_7
    check-cast v0, La/lbu;

    .line 184
    .line 185
    iget-object v0, v0, La/lbu;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, La/gii0;

    .line 188
    .line 189
    const-class v1, La/ni00;

    .line 190
    .line 191
    sget-object v2, La/sre0;->a:La/tre0;

    .line 192
    .line 193
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, La/ni00;

    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_8
    check-cast v0, La/kh00;

    .line 205
    .line 206
    iget-object v0, v0, La/kh00;->b:La/ctf0;

    .line 207
    .line 208
    invoke-static {v0}, La/m2x;->l(La/ctf0;)La/wul;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :pswitch_9
    check-cast v0, La/uwh0;

    .line 214
    .line 215
    iget-object v0, v0, La/uwh0;->a:La/a4x;

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    :pswitch_a
    check-cast v0, La/ha00;

    .line 227
    .line 228
    sget-object v1, La/ha00;->S1:La/xuz;

    .line 229
    .line 230
    iget-object v0, v0, La/ha00;->L1:La/fiu0;

    .line 231
    .line 232
    if-eqz v0, :cond_5

    .line 233
    .line 234
    return-object v0

    .line 235
    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    throw v6

    .line 239
    :pswitch_b
    check-cast v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;

    .line 240
    .line 241
    invoke-static {v0}, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->a(Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;)F

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    return-object v0

    .line 250
    :pswitch_c
    check-cast v0, La/c400;

    .line 251
    .line 252
    new-instance v1, La/q0h0;

    .line 253
    .line 254
    iget-object v0, v0, La/c400;->K1:La/sji;

    .line 255
    .line 256
    if-eqz v0, :cond_6

    .line 257
    .line 258
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 259
    .line 260
    .line 261
    return-object v1

    .line 262
    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v6

    .line 266
    :pswitch_d
    check-cast v0, La/abu;

    .line 267
    .line 268
    iget-object v0, v0, La/abu;->b:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, La/gii0;

    .line 271
    .line 272
    const-class v1, La/kuz;

    .line 273
    .line 274
    sget-object v2, La/sre0;->a:La/tre0;

    .line 275
    .line 276
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, La/kuz;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_e
    move-object v1, v0

    .line 288
    check-cast v1, La/p100;

    .line 289
    .line 290
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 291
    .line 292
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 293
    .line 294
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 302
    .line 303
    move-object v4, v0

    .line 304
    check-cast v4, La/e100;

    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    const/4 v12, 0x0

    .line 310
    const/16 v13, 0xff7

    .line 311
    .line 312
    const/4 v5, 0x0

    .line 313
    const/4 v6, 0x0

    .line 314
    const/4 v7, 0x0

    .line 315
    const/4 v8, 0x0

    .line 316
    const/4 v9, 0x0

    .line 317
    const/4 v10, 0x0

    .line 318
    const/4 v11, 0x0

    .line 319
    invoke-static/range {v4 .. v13}, La/e100;->a(La/e100;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;IZZLa/sn40;Ljava/util/Map;Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;I)La/e100;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_7

    .line 328
    .line 329
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_f
    check-cast v0, La/q000;

    .line 333
    .line 334
    sget-object v1, La/q000;->P1:La/htz;

    .line 335
    .line 336
    iget-object v0, v0, La/q000;->L1:La/fiu0;

    .line 337
    .line 338
    if-eqz v0, :cond_8

    .line 339
    .line 340
    return-object v0

    .line 341
    :cond_8
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v6

    .line 345
    :pswitch_10
    check-cast v0, La/hwz;

    .line 346
    .line 347
    new-instance v1, La/q0h0;

    .line 348
    .line 349
    iget-object v0, v0, La/hwz;->K1:La/pji;

    .line 350
    .line 351
    if-eqz v0, :cond_9

    .line 352
    .line 353
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 354
    .line 355
    .line 356
    return-object v1

    .line 357
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw v6

    .line 361
    :pswitch_11
    check-cast v0, La/zuz;

    .line 362
    .line 363
    sget-object v1, La/zuz;->N1:La/xuz;

    .line 364
    .line 365
    iget-object v0, v0, La/zuz;->K1:La/fiu0;

    .line 366
    .line 367
    if-eqz v0, :cond_a

    .line 368
    .line 369
    return-object v0

    .line 370
    :cond_a
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw v6

    .line 374
    :pswitch_12
    move-object v1, v0

    .line 375
    check-cast v1, La/irz;

    .line 376
    .line 377
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 378
    .line 379
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 380
    .line 381
    :cond_b
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v2, v1, La/i3t0;->f:La/oyg0;

    .line 389
    .line 390
    move-object v4, v0

    .line 391
    check-cast v4, La/erz;

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    const/4 v8, 0x0

    .line 397
    const/16 v9, 0xb

    .line 398
    .line 399
    const/4 v5, 0x0

    .line 400
    const/4 v6, 0x0

    .line 401
    const/4 v7, 0x0

    .line 402
    invoke-static/range {v4 .. v9}, La/erz;->a(La/erz;Ljava/util/List;La/d7i0;ZZI)La/erz;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-eqz v0, :cond_b

    .line 411
    .line 412
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_13
    move-object v1, v0

    .line 416
    check-cast v1, La/lqz;

    .line 417
    .line 418
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 419
    .line 420
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 421
    .line 422
    :cond_c
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    iget-object v4, v1, La/i3t0;->f:La/oyg0;

    .line 430
    .line 431
    move-object v7, v0

    .line 432
    check-cast v7, La/jqz;

    .line 433
    .line 434
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-static {v7, v6, v6, v5, v2}, La/jqz;->a(La/jqz;La/qiq0;La/y85;ZI)La/jqz;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_c

    .line 446
    .line 447
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_14
    move-object v1, v0

    .line 451
    check-cast v1, La/qpz;

    .line 452
    .line 453
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 454
    .line 455
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 456
    .line 457
    :cond_d
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 465
    .line 466
    move-object v7, v0

    .line 467
    check-cast v7, La/opz;

    .line 468
    .line 469
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    invoke-static {v7, v6, v6, v5, v2}, La/opz;->a(La/opz;La/piq0;La/x85;ZI)La/opz;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-virtual {v4, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-eqz v0, :cond_d

    .line 481
    .line 482
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0

    .line 485
    :pswitch_15
    check-cast v0, La/klz;

    .line 486
    .line 487
    iget-object v0, v0, La/klz;->a:La/bzu;

    .line 488
    .line 489
    iget-object v0, v0, La/bzu;->b:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, La/zn20;

    .line 492
    .line 493
    iget-boolean v1, v0, La/zn20;->b:Z

    .line 494
    .line 495
    if-eqz v1, :cond_e

    .line 496
    .line 497
    goto :goto_2

    .line 498
    :cond_e
    iget-boolean v1, v0, La/zn20;->c:Z

    .line 499
    .line 500
    if-eqz v1, :cond_f

    .line 501
    .line 502
    const-string v1, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 503
    .line 504
    invoke-static {v1}, La/esb0;->a(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :cond_f
    invoke-virtual {v0}, La/zn20;->a()V

    .line 508
    .line 509
    .line 510
    iput-boolean v3, v0, La/zn20;->c:Z

    .line 511
    .line 512
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object v0

    .line 515
    :pswitch_16
    check-cast v0, La/ejz;

    .line 516
    .line 517
    new-instance v1, Landroid/view/inputmethod/BaseInputConnection;

    .line 518
    .line 519
    iget-object v0, v0, La/ejz;->a:Landroid/view/View;

    .line 520
    .line 521
    invoke-direct {v1, v0, v5}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 522
    .line 523
    .line 524
    return-object v1

    .line 525
    :pswitch_17
    move-object v7, v0

    .line 526
    check-cast v7, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 527
    .line 528
    new-instance v14, La/ypl0;

    .line 529
    .line 530
    sget-object v0, La/lel0;->Companion:La/kel0;

    .line 531
    .line 532
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    invoke-static {}, La/kel0;->a()La/lel0;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    const-wide/16 v1, 0x0

    .line 540
    .line 541
    const-string v3, ""

    .line 542
    .line 543
    invoke-direct {v14, v1, v2, v3, v0}, La/ypl0;-><init>(JLjava/lang/String;La/lel0;)V

    .line 544
    .line 545
    .line 546
    iget-wide v8, v7, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->a:J

    .line 547
    .line 548
    sget-object v15, La/iun;->a:La/iun;

    .line 549
    .line 550
    iget-object v0, v7, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->c:La/ggz;

    .line 551
    .line 552
    sget-object v1, La/ggz;->b:La/ggz;

    .line 553
    .line 554
    if-ne v0, v1, :cond_10

    .line 555
    .line 556
    sget-object v0, La/xhz;->c:La/xhz;

    .line 557
    .line 558
    :goto_3
    move-object v11, v0

    .line 559
    goto :goto_4

    .line 560
    :cond_10
    sget-object v0, La/xhz;->b:La/xhz;

    .line 561
    .line 562
    goto :goto_3

    .line 563
    :goto_4
    sget-object v12, La/qgz;->c:La/qgz;

    .line 564
    .line 565
    sget-object v13, La/epe;->b:La/epe;

    .line 566
    .line 567
    new-instance v6, La/ihz;

    .line 568
    .line 569
    const/16 v23, 0x1

    .line 570
    .line 571
    const/16 v24, 0x0

    .line 572
    .line 573
    const/4 v10, 0x0

    .line 574
    sget-object v16, La/j2h;->a:La/j2h;

    .line 575
    .line 576
    const/16 v17, 0x0

    .line 577
    .line 578
    const/16 v18, 0x0

    .line 579
    .line 580
    const/16 v19, 0x0

    .line 581
    .line 582
    const/16 v20, 0x0

    .line 583
    .line 584
    const/16 v21, 0x0

    .line 585
    .line 586
    const/16 v22, 0x0

    .line 587
    .line 588
    invoke-direct/range {v6 .. v24}, La/ihz;-><init>(Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZ)V

    .line 589
    .line 590
    .line 591
    return-object v6

    .line 592
    :pswitch_18
    check-cast v0, La/vgz;

    .line 593
    .line 594
    iget-object v0, v0, La/vgz;->b:La/mdm;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_19
    check-cast v0, La/lbu;

    .line 598
    .line 599
    iget-object v0, v0, La/lbu;->b:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v0, La/gii0;

    .line 602
    .line 603
    const-class v1, La/vfz;

    .line 604
    .line 605
    sget-object v2, La/sre0;->a:La/tre0;

    .line 606
    .line 607
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    check-cast v0, La/vfz;

    .line 616
    .line 617
    return-object v0

    .line 618
    :pswitch_1a
    check-cast v0, La/uwq;

    .line 619
    .line 620
    new-instance v1, La/xcz;

    .line 621
    .line 622
    invoke-direct {v1, v0, v5, v5}, La/xcz;-><init>(La/uwq;II)V

    .line 623
    .line 624
    .line 625
    return-object v1

    .line 626
    :pswitch_1b
    check-cast v0, La/pvj;

    .line 627
    .line 628
    new-instance v1, La/xcz;

    .line 629
    .line 630
    invoke-direct {v1, v5, v5, v0}, La/xcz;-><init>(IILa/pcz;)V

    .line 631
    .line 632
    .line 633
    return-object v1

    .line 634
    :pswitch_1c
    check-cast v0, La/tcz;

    .line 635
    .line 636
    iget-object v1, v0, La/tcz;->a:La/xcz;

    .line 637
    .line 638
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    iget-object v1, v1, La/mcz;->l:Ljava/util/List;

    .line 643
    .line 644
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    sget-object v2, La/scz;->a:La/scz;

    .line 649
    .line 650
    invoke-static {v1, v2}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    iget-object v2, v1, La/qls0;->a:Lkotlin/sequences/Sequence;

    .line 655
    .line 656
    invoke-interface {v2}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    :cond_11
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    if-eqz v3, :cond_12

    .line 665
    .line 666
    iget-object v3, v1, La/qls0;->b:Lkotlin/jvm/functions/Function1;

    .line 667
    .line 668
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    move-object v4, v3

    .line 677
    check-cast v4, La/ucz;

    .line 678
    .line 679
    iget-object v5, v4, La/ucz;->a:La/ncz;

    .line 680
    .line 681
    iget v5, v5, La/ncz;->p:I

    .line 682
    .line 683
    iget-object v7, v0, La/tcz;->b:Lkotlin/jvm/functions/Function2;

    .line 684
    .line 685
    invoke-interface {v7, v0, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    check-cast v4, Ljava/lang/Number;

    .line 690
    .line 691
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-gt v5, v4, :cond_11

    .line 696
    .line 697
    move-object v6, v3

    .line 698
    goto :goto_5

    .line 699
    :cond_12
    check-cast v6, La/ucz;

    .line 700
    .line 701
    return-object v6

    .line 702
    nop

    .line 703
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
