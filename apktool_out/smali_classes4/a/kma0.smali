.class public final synthetic La/kma0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/kma0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte p0, p0, La/kma0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/oeb0;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, La/oeb0;->getKey()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_0
    move-object v0, p1

    .line 17
    check-cast v0, La/fhl;

    .line 18
    .line 19
    sget-object p0, La/ccb0;->X1:La/mi70;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 25
    .line 26
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 31
    .line 32
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    const/4 v10, 0x0

    .line 37
    const/16 v11, 0x7e

    .line 38
    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    const-wide/16 v5, 0x0

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    invoke-static/range {v0 .. v11}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    check-cast p1, La/n1g;

    .line 53
    .line 54
    new-instance p0, La/mr2;

    .line 55
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 63
    .line 64
    sget-object p0, La/l1g;->b:La/l1g;

    .line 65
    .line 66
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 67
    .line 68
    sget-object p0, La/k1g;->b:La/k1g;

    .line 69
    .line 70
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_9
    check-cast p1, La/a2n;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    sget-object p1, La/sre0;->a:La/tre0;

    .line 162
    .line 163
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :pswitch_a
    check-cast p1, La/a2n;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-interface {p1}, La/a2n;->getKey()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 184
    .line 185
    .line 186
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 195
    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 206
    .line 207
    .line 208
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 217
    .line 218
    .line 219
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 228
    .line 229
    .line 230
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_10
    sget-object p0, La/d4b0;->S1:La/jh70;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    instance-of p0, p1, La/zgb;

    .line 239
    .line 240
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :pswitch_11
    sget-object p0, La/d4b0;->S1:La/jh70;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    instance-of p0, p1, La/fcb;

    .line 251
    .line 252
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0

    .line 257
    :pswitch_12
    check-cast p1, La/ot0;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-static {p1}, La/x4d0;->g0(La/ot0;)La/pt0;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    return-object p0

    .line 267
    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    new-instance v0, La/mdm;

    .line 274
    .line 275
    sget-object p1, La/pb10;->c:La/xuz;

    .line 276
    .line 277
    sget-object v1, La/pb10;->g:La/pb10;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    const-wide/16 v11, 0x0

    .line 287
    .line 288
    const/16 v13, 0x3de

    .line 289
    .line 290
    const/4 v2, 0x0

    .line 291
    const/4 v3, 0x0

    .line 292
    const/4 v4, 0x0

    .line 293
    const/4 v5, 0x0

    .line 294
    const v6, 0x7f130674

    .line 295
    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/4 v8, 0x0

    .line 299
    const-wide/16 v9, 0x0

    .line 300
    .line 301
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 302
    .line 303
    .line 304
    return-object v0

    .line 305
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    new-instance v0, La/mdm;

    .line 312
    .line 313
    sget-object p1, La/pb10;->c:La/xuz;

    .line 314
    .line 315
    sget-object v1, La/pb10;->g:La/pb10;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    const-wide/16 v11, 0x0

    .line 325
    .line 326
    const/16 v13, 0x25e

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    const/4 v3, 0x0

    .line 330
    const/4 v4, 0x0

    .line 331
    const/4 v5, 0x0

    .line 332
    const v6, 0x7f1307c4

    .line 333
    .line 334
    .line 335
    const/4 v7, 0x0

    .line 336
    const v8, 0x7f131690

    .line 337
    .line 338
    .line 339
    const-wide/16 v9, 0x2710

    .line 340
    .line 341
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 342
    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_15
    check-cast p1, Ljava/lang/Integer;

    .line 346
    .line 347
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result p0

    .line 351
    new-instance v0, La/mdm;

    .line 352
    .line 353
    sget-object p1, La/pb10;->c:La/xuz;

    .line 354
    .line 355
    sget-object v1, La/pb10;->g:La/pb10;

    .line 356
    .line 357
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    const-wide/16 v11, 0x0

    .line 365
    .line 366
    const/16 v13, 0x25e

    .line 367
    .line 368
    const/4 v2, 0x0

    .line 369
    const/4 v3, 0x0

    .line 370
    const/4 v4, 0x0

    .line 371
    const/4 v5, 0x0

    .line 372
    const v6, 0x7f130508

    .line 373
    .line 374
    .line 375
    const/4 v7, 0x0

    .line 376
    const v8, 0x7f131690

    .line 377
    .line 378
    .line 379
    const-wide/16 v9, 0x2710

    .line 380
    .line 381
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 382
    .line 383
    .line 384
    return-object v0

    .line 385
    :pswitch_16
    check-cast p1, La/wq5;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    new-instance p0, La/rza0;

    .line 391
    .line 392
    invoke-direct {p0, p1}, La/rza0;-><init>(La/wq5;)V

    .line 393
    .line 394
    .line 395
    return-object p0

    .line 396
    :pswitch_17
    check-cast p1, La/c0b0;

    .line 397
    .line 398
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    new-instance v0, La/mdm;

    .line 402
    .line 403
    sget-object p0, La/pb10;->c:La/xuz;

    .line 404
    .line 405
    sget-object v1, La/pb10;->g:La/pb10;

    .line 406
    .line 407
    iget p1, p1, La/c0b0;->h:I

    .line 408
    .line 409
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-static {v1, p1}, La/xuz;->a(La/pb10;I)I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    const-wide/16 v11, 0x0

    .line 417
    .line 418
    const/16 v13, 0x25e

    .line 419
    .line 420
    const/4 v2, 0x0

    .line 421
    const/4 v3, 0x0

    .line 422
    const/4 v4, 0x0

    .line 423
    const/4 v5, 0x0

    .line 424
    const v6, 0x7f130508

    .line 425
    .line 426
    .line 427
    const/4 v7, 0x0

    .line 428
    const v8, 0x7f131690

    .line 429
    .line 430
    .line 431
    const-wide/16 v9, 0x2710

    .line 432
    .line 433
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 434
    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_18
    check-cast p1, La/c0b0;

    .line 438
    .line 439
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    new-instance v0, La/mdm;

    .line 443
    .line 444
    sget-object p0, La/pb10;->c:La/xuz;

    .line 445
    .line 446
    sget-object v1, La/pb10;->g:La/pb10;

    .line 447
    .line 448
    iget p1, p1, La/c0b0;->h:I

    .line 449
    .line 450
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    invoke-static {v1, p1}, La/xuz;->a(La/pb10;I)I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    const-wide/16 v11, 0x0

    .line 458
    .line 459
    const/16 v13, 0x3de

    .line 460
    .line 461
    const/4 v2, 0x0

    .line 462
    const/4 v3, 0x0

    .line 463
    const/4 v4, 0x0

    .line 464
    const/4 v5, 0x0

    .line 465
    const v6, 0x7f130674

    .line 466
    .line 467
    .line 468
    const/4 v7, 0x0

    .line 469
    const/4 v8, 0x0

    .line 470
    const-wide/16 v9, 0x0

    .line 471
    .line 472
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 473
    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_19
    check-cast p1, La/c0b0;

    .line 477
    .line 478
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    new-instance v0, La/mdm;

    .line 482
    .line 483
    sget-object p0, La/pb10;->c:La/xuz;

    .line 484
    .line 485
    sget-object v1, La/pb10;->g:La/pb10;

    .line 486
    .line 487
    iget v2, p1, La/c0b0;->h:I

    .line 488
    .line 489
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    invoke-static {v1, v2}, La/xuz;->a(La/pb10;I)I

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    iget-boolean p0, p1, La/c0b0;->a:Z

    .line 497
    .line 498
    if-eqz p0, :cond_0

    .line 499
    .line 500
    const p0, 0x7f131111

    .line 501
    .line 502
    .line 503
    :goto_0
    move v8, p0

    .line 504
    goto :goto_1

    .line 505
    :cond_0
    const p0, 0x7f131690

    .line 506
    .line 507
    .line 508
    goto :goto_0

    .line 509
    :goto_1
    const-wide/16 v11, 0x0

    .line 510
    .line 511
    const/16 v13, 0x25e

    .line 512
    .line 513
    const/4 v2, 0x0

    .line 514
    const/4 v3, 0x0

    .line 515
    const/4 v4, 0x0

    .line 516
    const/4 v5, 0x0

    .line 517
    const v6, 0x7f1307c4

    .line 518
    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    const-wide/16 v9, 0x2710

    .line 522
    .line 523
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 524
    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_1a
    check-cast p1, La/c0b0;

    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    iget-boolean p0, p1, La/c0b0;->a:Z

    .line 533
    .line 534
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 535
    .line 536
    .line 537
    move-result-object p0

    .line 538
    return-object p0

    .line 539
    :pswitch_1b
    check-cast p1, La/sjd;

    .line 540
    .line 541
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    new-instance p0, La/isa0;

    .line 545
    .line 546
    invoke-direct {p0, p1}, La/isa0;-><init>(La/sjd;)V

    .line 547
    .line 548
    .line 549
    return-object p0

    .line 550
    :pswitch_1c
    check-cast p1, Landroid/content/Context;

    .line 551
    .line 552
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    new-instance p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 556
    .line 557
    const/4 v0, 0x0

    .line 558
    const/4 v1, 0x0

    .line 559
    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 560
    .line 561
    .line 562
    new-instance p1, La/qma0;

    .line 563
    .line 564
    const/4 v0, 0x1

    .line 565
    const v1, 0x7f07074a

    .line 566
    .line 567
    .line 568
    invoke-direct {p1, p0, v0, v1}, La/k5;-><init>(La/nmo0;ZI)V

    .line 569
    .line 570
    .line 571
    iput-object p0, p1, La/qma0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 572
    .line 573
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 574
    .line 575
    .line 576
    return-object p0

    .line 577
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
