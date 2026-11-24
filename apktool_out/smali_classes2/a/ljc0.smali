.class public final synthetic La/ljc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/ljc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/d2j;)V
    .locals 0

    .line 1
    const/4 p1, 0x7

    iput-byte p1, p0, La/ljc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte p0, p0, La/ljc0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    check-cast p1, La/abi0;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 32
    .line 33
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite20-0d7_KjU()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-static {p1, v0, v1}, La/cbi0;->a(La/abi0;J)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_2
    check-cast p1, La/kba;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-class p0, La/kba;

    .line 49
    .line 50
    sget-object p1, La/sre0;->a:La/tre0;

    .line 51
    .line 52
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_8
    check-cast p1, Ljava/lang/Float;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance p0, La/d9d0;

    .line 118
    .line 119
    new-instance v1, La/t33;

    .line 120
    .line 121
    sget-object v2, La/hp4;->j:La/lxs0;

    .line 122
    .line 123
    const/16 v3, 0xc

    .line 124
    .line 125
    invoke-direct {v1, p1, v2, v0, v3}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p0, v1}, La/d9d0;-><init>(La/t33;)V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_9
    check-cast p1, La/g7z;

    .line 133
    .line 134
    iget-object p0, p1, La/g7z;->a:La/a6a;

    .line 135
    .line 136
    iget-object p0, p0, La/a6a;->b:La/nr;

    .line 137
    .line 138
    invoke-virtual {p0}, La/nr;->p()J

    .line 139
    .line 140
    .line 141
    move-result-wide v1

    .line 142
    invoke-virtual {p0}, La/nr;->i()La/x5a;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-interface {v0}, La/x5a;->l()V

    .line 147
    .line 148
    .line 149
    :try_start_0
    iget-object v0, p0, La/nr;->b:Ljava/lang/Object;

    .line 150
    .line 151
    move-object v3, v0

    .line 152
    check-cast v3, La/fvt0;

    .line 153
    .line 154
    const v4, -0x800001

    .line 155
    .line 156
    .line 157
    const/4 v5, 0x0

    .line 158
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 159
    .line 160
    .line 161
    const v7, 0x7f7fffff    # Float.MAX_VALUE

    .line 162
    .line 163
    .line 164
    const/4 v8, 0x1

    .line 165
    invoke-virtual/range {v3 .. v8}, La/fvt0;->k(FFFFI)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, La/g7z;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    .line 171
    invoke-static {p0, v1, v2}, Lc;->g(La/nr;J)V

    .line 172
    .line 173
    .line 174
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
    :catchall_0
    move-exception v0

    .line 178
    move-object p1, v0

    .line 179
    invoke-static {p0, v1, v2}, Lc;->g(La/nr;J)V

    .line 180
    .line 181
    .line 182
    throw p1

    .line 183
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    new-instance v0, La/mdm;

    .line 190
    .line 191
    sget-object p1, La/pb10;->c:La/xuz;

    .line 192
    .line 193
    sget-object v1, La/pb10;->e:La/pb10;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    const-wide/16 v11, 0x0

    .line 203
    .line 204
    const/16 v13, 0x3de

    .line 205
    .line 206
    const/4 v2, 0x0

    .line 207
    const/4 v3, 0x0

    .line 208
    const/4 v4, 0x0

    .line 209
    const/4 v5, 0x0

    .line 210
    const v6, 0x7f130e37

    .line 211
    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    const/4 v8, 0x0

    .line 215
    const-wide/16 v9, 0x0

    .line 216
    .line 217
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 218
    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    new-instance v0, La/mdm;

    .line 228
    .line 229
    sget-object p1, La/pb10;->c:La/xuz;

    .line 230
    .line 231
    sget-object v1, La/pb10;->g:La/pb10;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    const-wide/16 v11, 0x0

    .line 241
    .line 242
    const/16 v13, 0x25e

    .line 243
    .line 244
    const/4 v2, 0x0

    .line 245
    const/4 v3, 0x0

    .line 246
    const/4 v4, 0x0

    .line 247
    const/4 v5, 0x0

    .line 248
    const v6, 0x7f1307c4

    .line 249
    .line 250
    .line 251
    const/4 v7, 0x0

    .line 252
    const v8, 0x7f131690

    .line 253
    .line 254
    .line 255
    const-wide/16 v9, 0x2710

    .line 256
    .line 257
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 258
    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_d
    check-cast p1, Ljava/lang/Long;

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 278
    .line 279
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_f
    check-cast p1, La/cuc0;

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    sget-object p1, La/sre0;->a:La/tre0;

    .line 292
    .line 293
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    return-object p0

    .line 298
    :pswitch_10
    check-cast p1, La/cuc0;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-interface {p1}, La/cuc0;->getId()J

    .line 304
    .line 305
    .line 306
    move-result-wide p0

    .line 307
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0

    .line 312
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    check-cast p1, Ljava/util/Set;

    .line 316
    .line 317
    return-object p1

    .line 318
    :pswitch_12
    check-cast p1, La/cp;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    new-instance p0, La/ui80;

    .line 324
    .line 325
    const/16 v0, 0xf

    .line 326
    .line 327
    invoke-direct {p0, p1, v0}, La/ui80;-><init>(La/cp;B)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 331
    .line 332
    .line 333
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object p0

    .line 336
    :pswitch_13
    check-cast p1, La/cp;

    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object p0, p1, La/cp;->u:La/yfu0;

    .line 342
    .line 343
    check-cast p0, La/y2k;

    .line 344
    .line 345
    iget-object p0, p0, La/y2k;->a:Landroid/widget/FrameLayout;

    .line 346
    .line 347
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 348
    .line 349
    .line 350
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    return-object p0

    .line 353
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 359
    .line 360
    .line 361
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object p0

    .line 364
    :pswitch_15
    check-cast p1, La/erc0;

    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    instance-of p0, p1, La/crc0;

    .line 370
    .line 371
    sget-object v4, La/fmm;->a:La/fmm;

    .line 372
    .line 373
    sget-object v3, La/mlm;->a:La/mlm;

    .line 374
    .line 375
    sget-object v2, La/jlm;->a:La/jlm;

    .line 376
    .line 377
    if-eqz p0, :cond_0

    .line 378
    .line 379
    check-cast p1, La/crc0;

    .line 380
    .line 381
    iget-object p0, p1, La/crc0;->b:Ljava/lang/String;

    .line 382
    .line 383
    iget-object p1, p1, La/crc0;->a:Ljava/lang/String;

    .line 384
    .line 385
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 386
    .line 387
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 392
    .line 393
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 394
    .line 395
    .line 396
    move-result-wide v9

    .line 397
    new-instance v1, La/imm;

    .line 398
    .line 399
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 400
    .line 401
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 402
    .line 403
    .line 404
    move-result-wide v5

    .line 405
    const/4 v7, 0x0

    .line 406
    const/4 v8, 0x0

    .line 407
    invoke-direct/range {v1 .. v8}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 408
    .line 409
    .line 410
    invoke-static {p0}, La/d2j;->a(Ljava/lang/String;)La/imm;

    .line 411
    .line 412
    .line 413
    move-result-object v11

    .line 414
    new-instance v5, La/qhc0;

    .line 415
    .line 416
    move-object v7, p0

    .line 417
    move-object v6, p1

    .line 418
    move-wide v8, v9

    .line 419
    move-object v10, v1

    .line 420
    invoke-direct/range {v5 .. v11}, La/qhc0;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/imm;La/imm;)V

    .line 421
    .line 422
    .line 423
    :goto_0
    move-object v0, v5

    .line 424
    goto :goto_1

    .line 425
    :cond_0
    instance-of p0, p1, La/drc0;

    .line 426
    .line 427
    if-eqz p0, :cond_1

    .line 428
    .line 429
    check-cast p1, La/drc0;

    .line 430
    .line 431
    iget-object p0, p1, La/drc0;->b:Ljava/lang/String;

    .line 432
    .line 433
    iget-object p1, p1, La/drc0;->a:La/hds;

    .line 434
    .line 435
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 436
    .line 437
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 442
    .line 443
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 444
    .line 445
    .line 446
    move-result-wide v9

    .line 447
    new-instance v1, La/imm;

    .line 448
    .line 449
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 450
    .line 451
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 452
    .line 453
    .line 454
    move-result-wide v5

    .line 455
    const/4 v7, 0x0

    .line 456
    const/4 v8, 0x0

    .line 457
    invoke-direct/range {v1 .. v8}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 458
    .line 459
    .line 460
    invoke-static {p0}, La/d2j;->a(Ljava/lang/String;)La/imm;

    .line 461
    .line 462
    .line 463
    move-result-object v11

    .line 464
    new-instance v5, La/rhc0;

    .line 465
    .line 466
    move-object v7, p0

    .line 467
    move-object v6, p1

    .line 468
    move-wide v8, v9

    .line 469
    move-object v10, v1

    .line 470
    invoke-direct/range {v5 .. v11}, La/rhc0;-><init>(La/hds;Ljava/lang/String;JLa/imm;La/imm;)V

    .line 471
    .line 472
    .line 473
    goto :goto_0

    .line 474
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 475
    .line 476
    .line 477
    :goto_1
    return-object v0

    .line 478
    :pswitch_16
    check-cast p1, La/wpc0;

    .line 479
    .line 480
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    iget-boolean p0, p1, La/wpc0;->b:Z

    .line 484
    .line 485
    iget-object v0, p1, La/wpc0;->e:Ljava/util/List;

    .line 486
    .line 487
    iget-object v1, p1, La/wpc0;->a:Ljava/lang/String;

    .line 488
    .line 489
    if-eqz p0, :cond_2

    .line 490
    .line 491
    new-instance p0, La/upc0;

    .line 492
    .line 493
    invoke-direct {p0, v1}, La/upc0;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    goto :goto_4

    .line 497
    :cond_2
    iget-boolean p0, p1, La/wpc0;->c:Z

    .line 498
    .line 499
    if-eqz p0, :cond_3

    .line 500
    .line 501
    iget-boolean p0, p1, La/wpc0;->d:Z

    .line 502
    .line 503
    new-instance p1, La/tpc0;

    .line 504
    .line 505
    invoke-direct {p1, v1, p0}, La/tpc0;-><init>(Ljava/lang/String;Z)V

    .line 506
    .line 507
    .line 508
    :goto_2
    move-object p0, p1

    .line 509
    goto :goto_4

    .line 510
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result p0

    .line 514
    if-eqz p0, :cond_4

    .line 515
    .line 516
    new-instance p0, La/spc0;

    .line 517
    .line 518
    invoke-direct {p0, v1}, La/spc0;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    goto :goto_4

    .line 522
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 523
    .line 524
    const/16 p1, 0xa

    .line 525
    .line 526
    invoke-static {v0, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-eqz v0, :cond_5

    .line 542
    .line 543
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    check-cast v0, La/vrc0;

    .line 548
    .line 549
    invoke-static {v0}, La/s0x;->e0(La/vrc0;)La/yrc0;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    goto :goto_3

    .line 557
    :cond_5
    new-instance p1, La/rpc0;

    .line 558
    .line 559
    invoke-direct {p1, v1, p0}, La/rpc0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 560
    .line 561
    .line 562
    goto :goto_2

    .line 563
    :goto_4
    return-object p0

    .line 564
    :pswitch_17
    check-cast p1, La/rnc0;

    .line 565
    .line 566
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    iget-object p0, p1, La/rnc0;->a:La/gtc0;

    .line 570
    .line 571
    iget-byte p0, p0, La/gtc0;->a:B

    .line 572
    .line 573
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    return-object p0

    .line 578
    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    .line 579
    .line 580
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 584
    .line 585
    .line 586
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    return-object p0

    .line 589
    :pswitch_19
    check-cast p1, Ljava/lang/Throwable;

    .line 590
    .line 591
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 595
    .line 596
    .line 597
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object p0

    .line 600
    :pswitch_1a
    check-cast p1, Ljava/lang/Throwable;

    .line 601
    .line 602
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 606
    .line 607
    .line 608
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 609
    .line 610
    return-object p0

    .line 611
    :pswitch_1b
    check-cast p1, Ljava/lang/Throwable;

    .line 612
    .line 613
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 617
    .line 618
    .line 619
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 620
    .line 621
    return-object p0

    .line 622
    :pswitch_1c
    check-cast p1, Ljava/lang/Throwable;

    .line 623
    .line 624
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 628
    .line 629
    .line 630
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    return-object p0

    .line 633
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
