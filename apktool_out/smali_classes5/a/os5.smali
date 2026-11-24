.class public final synthetic La/os5;
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
    iput-byte p2, p0, La/os5;->a:B

    iput-object p1, p0, La/os5;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/os5;->a:B

    .line 4
    .line 5
    const-string v2, "snackbarManager"

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const v4, 0x7f13032f

    .line 9
    .line 10
    .line 11
    const v5, 0x7f131843

    .line 12
    .line 13
    .line 14
    const-string v6, "actionDialogManager"

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    const-string v8, ""

    .line 18
    .line 19
    const/4 v9, 0x3

    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    iget-object v0, v0, La/os5;->b:Ljava/lang/Object;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    check-cast v0, La/z28;

    .line 29
    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    check-cast v1, La/k0w0;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v2, Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;

    .line 38
    .line 39
    new-instance v3, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;

    .line 40
    .line 41
    new-instance v4, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;

    .line 42
    .line 43
    iget-object v5, v0, La/z28;->i:La/p7m0;

    .line 44
    .line 45
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, La/v28;

    .line 50
    .line 51
    iget-object v5, v5, La/v28;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, v0, La/z28;->d:Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 54
    .line 55
    iget-object v6, v0, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;->a:Lorg/xplatform/security/api/navigation/EndFlowNavigation;

    .line 56
    .line 57
    iget v0, v0, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;->c:I

    .line 58
    .line 59
    invoke-direct {v4, v5, v6, v0}, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;-><init>(Ljava/lang/String;Lorg/xplatform/security/api/navigation/EndFlowNavigation;I)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v3, v4}, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;-><init>(Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v2, v3}, Lorg/xplatform/security/impl/presentation/email/confirmation/screen/SendConfirmationEmailScreen;-><init>(Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_0
    check-cast v0, La/j28;

    .line 75
    .line 76
    move-object/from16 v1, p1

    .line 77
    .line 78
    check-cast v1, Landroid/text/Editable;

    .line 79
    .line 80
    sget-object v2, La/j28;->R1:La/kj5;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v0, v0, La/j28;->Q1:La/kiu0;

    .line 86
    .line 87
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v2, v0

    .line 92
    check-cast v2, La/z28;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-nez v0, :cond_0

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_0
    move-object v8, v0

    .line 112
    :cond_1
    :goto_0
    iget-object v0, v2, La/z28;->b:La/vzg0;

    .line 113
    .line 114
    const-string v1, "entered_email"

    .line 115
    .line 116
    invoke-virtual {v0, v1, v8}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v1, v2, La/z28;->i:La/p7m0;

    .line 120
    .line 121
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object v3, v0

    .line 126
    check-cast v3, La/v28;

    .line 127
    .line 128
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-lez v4, :cond_3

    .line 133
    .line 134
    move v4, v10

    .line 135
    goto :goto_1

    .line 136
    :cond_3
    move v4, v11

    .line 137
    :goto_1
    const/16 v5, 0x9

    .line 138
    .line 139
    invoke-static {v3, v8, v4, v11, v5}, La/v28;->a(La/v28;Ljava/lang/String;ZZI)La/v28;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_2

    .line 148
    .line 149
    iget-object v0, v2, La/z28;->h:La/ol60;

    .line 150
    .line 151
    sget-object v1, La/q28;->a:La/q28;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_1
    check-cast v0, La/tu7;

    .line 160
    .line 161
    move-object/from16 v1, p1

    .line 162
    .line 163
    check-cast v1, Ljava/lang/Throwable;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-object v0, v0, La/tu7;->w:La/zas0;

    .line 169
    .line 170
    new-instance v2, La/mqp0;

    .line 171
    .line 172
    invoke-direct {v2, v1}, La/mqp0;-><init>(Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object v0, v0, La/zas0;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/hqp0;

    .line 181
    .line 182
    iget-object v0, v0, La/hqp0;->a:La/zpp0;

    .line 183
    .line 184
    iget-object v0, v0, La/zpp0;->a:La/p7m0;

    .line 185
    .line 186
    invoke-virtual {v0, v12, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_2
    check-cast v0, La/ru7;

    .line 193
    .line 194
    move-object/from16 v1, p1

    .line 195
    .line 196
    check-cast v1, La/qqp0;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v2, v0, La/ru7;->h:La/n0o0;

    .line 202
    .line 203
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    check-cast v2, La/fee;

    .line 208
    .line 209
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, La/a8h0;

    .line 214
    .line 215
    if-nez v2, :cond_5

    .line 216
    .line 217
    :cond_4
    move v10, v11

    .line 218
    goto :goto_4

    .line 219
    :cond_5
    instance-of v3, v1, La/oqp0;

    .line 220
    .line 221
    if-eqz v3, :cond_4

    .line 222
    .line 223
    check-cast v1, La/oqp0;

    .line 224
    .line 225
    iget-object v1, v1, La/oqp0;->a:Ljava/util/List;

    .line 226
    .line 227
    if-eqz v1, :cond_7

    .line 228
    .line 229
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-eqz v3, :cond_7

    .line 234
    .line 235
    :cond_6
    move v3, v11

    .line 236
    goto :goto_2

    .line 237
    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-eqz v4, :cond_6

    .line 246
    .line 247
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    check-cast v4, La/sfp0;

    .line 252
    .line 253
    iget-object v4, v4, La/sfp0;->c:Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-nez v4, :cond_8

    .line 260
    .line 261
    move v3, v10

    .line 262
    :goto_2
    if-eqz v1, :cond_a

    .line 263
    .line 264
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-eqz v4, :cond_a

    .line 269
    .line 270
    :cond_9
    move v1, v11

    .line 271
    goto :goto_3

    .line 272
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-eqz v4, :cond_9

    .line 281
    .line 282
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    check-cast v4, La/sfp0;

    .line 287
    .line 288
    iget-object v4, v4, La/sfp0;->d:Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    if-nez v4, :cond_b

    .line 295
    .line 296
    move v1, v10

    .line 297
    :goto_3
    if-eqz v3, :cond_4

    .line 298
    .line 299
    if-eqz v1, :cond_4

    .line 300
    .line 301
    :goto_4
    iget-object v0, v0, La/ru7;->a:La/ctf0;

    .line 302
    .line 303
    if-eqz v2, :cond_c

    .line 304
    .line 305
    iget-object v12, v2, La/a8h0;->b:La/z7h0;

    .line 306
    .line 307
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    if-eqz v10, :cond_e

    .line 311
    .line 312
    new-instance v1, La/emm;

    .line 313
    .line 314
    new-instance v2, La/la50;

    .line 315
    .line 316
    new-instance v3, La/skm;

    .line 317
    .line 318
    instance-of v4, v12, La/y7h0;

    .line 319
    .line 320
    if-eqz v4, :cond_d

    .line 321
    .line 322
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 323
    .line 324
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 325
    .line 326
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 327
    .line 328
    .line 329
    move-result-wide v4

    .line 330
    goto :goto_5

    .line 331
    :cond_d
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 332
    .line 333
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 334
    .line 335
    .line 336
    move-result-object v4

    .line 337
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 338
    .line 339
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 340
    .line 341
    .line 342
    move-result-wide v4

    .line 343
    :goto_5
    new-instance v7, La/y3d;

    .line 344
    .line 345
    invoke-direct {v7, v4, v5}, La/y3d;-><init>(J)V

    .line 346
    .line 347
    .line 348
    const/16 v8, 0x10

    .line 349
    .line 350
    const/4 v4, 0x0

    .line 351
    const v5, 0x7f080997

    .line 352
    .line 353
    .line 354
    const/4 v6, 0x1

    .line 355
    invoke-direct/range {v3 .. v8}, La/skm;-><init>(IIZLa/y3d;I)V

    .line 356
    .line 357
    .line 358
    invoke-direct {v2, v3}, La/la50;-><init>(La/skm;)V

    .line 359
    .line 360
    .line 361
    invoke-direct {v1, v2}, La/emm;-><init>(La/oa50;)V

    .line 362
    .line 363
    .line 364
    :goto_6
    move-object v5, v1

    .line 365
    goto :goto_7

    .line 366
    :cond_e
    sget-object v1, La/fmm;->a:La/fmm;

    .line 367
    .line 368
    goto :goto_6

    .line 369
    :goto_7
    new-instance v2, La/imm;

    .line 370
    .line 371
    new-instance v3, La/ilm;

    .line 372
    .line 373
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 374
    .line 375
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 376
    .line 377
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    invoke-direct {v3, v6, v7}, La/ilm;-><init>(J)V

    .line 382
    .line 383
    .line 384
    new-instance v4, La/plm;

    .line 385
    .line 386
    new-array v6, v11, [Ljava/lang/Object;

    .line 387
    .line 388
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 389
    .line 390
    invoke-static {v6, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    const v7, 0x7f130290

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v13

    .line 401
    sget-object v14, La/ha50;->c:La/ha50;

    .line 402
    .line 403
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 404
    .line 405
    .line 406
    move-result-wide v15

    .line 407
    new-instance v0, La/ea50;

    .line 408
    .line 409
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 410
    .line 411
    .line 412
    move-result-wide v6

    .line 413
    invoke-direct {v0, v6, v7}, La/ea50;-><init>(J)V

    .line 414
    .line 415
    .line 416
    move-object/from16 v17, v0

    .line 417
    .line 418
    move-object v12, v4

    .line 419
    invoke-direct/range {v12 .. v17}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 423
    .line 424
    .line 425
    move-result-wide v6

    .line 426
    const/4 v8, 0x0

    .line 427
    const/4 v9, 0x0

    .line 428
    invoke-direct/range {v2 .. v9}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 429
    .line 430
    .line 431
    return-object v2

    .line 432
    :pswitch_3
    move-object v3, v0

    .line 433
    check-cast v3, La/hx7;

    .line 434
    .line 435
    move-object/from16 v0, p1

    .line 436
    .line 437
    check-cast v0, Ljava/lang/Float;

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    const/4 v1, 0x0

    .line 444
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    int-to-long v4, v2

    .line 449
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    int-to-long v6, v2

    .line 454
    const/16 v2, 0x20

    .line 455
    .line 456
    shl-long/2addr v4, v2

    .line 457
    const-wide v8, 0xffffffffL

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    and-long/2addr v6, v8

    .line 463
    or-long/2addr v4, v6

    .line 464
    invoke-virtual {v3, v10, v4, v5}, La/hx7;->C(IJ)J

    .line 465
    .line 466
    .line 467
    move-result-wide v4

    .line 468
    and-long/2addr v4, v8

    .line 469
    long-to-int v4, v4

    .line 470
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 471
    .line 472
    .line 473
    move-result v5

    .line 474
    sub-float/2addr v0, v5

    .line 475
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    int-to-long v5, v5

    .line 484
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    int-to-long v10, v4

    .line 489
    shl-long v4, v5, v2

    .line 490
    .line 491
    and-long v6, v10, v8

    .line 492
    .line 493
    or-long v5, v4, v6

    .line 494
    .line 495
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    int-to-long v10, v1

    .line 500
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    int-to-long v0, v0

    .line 505
    shl-long/2addr v10, v2

    .line 506
    and-long/2addr v0, v8

    .line 507
    or-long v7, v10, v0

    .line 508
    .line 509
    const/4 v4, 0x1

    .line 510
    invoke-virtual/range {v3 .. v8}, La/hx7;->S(IJJ)J

    .line 511
    .line 512
    .line 513
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 514
    .line 515
    return-object v0

    .line 516
    :pswitch_4
    check-cast v0, La/tn7;

    .line 517
    .line 518
    move-object/from16 v1, p1

    .line 519
    .line 520
    check-cast v1, La/hcz;

    .line 521
    .line 522
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    check-cast v0, La/sn7;

    .line 526
    .line 527
    iget-object v0, v0, La/sn7;->a:La/i4;

    .line 528
    .line 529
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    new-instance v3, La/pn7;

    .line 534
    .line 535
    invoke-direct {v3, v0, v11}, La/pn7;-><init>(La/i4;B)V

    .line 536
    .line 537
    .line 538
    new-instance v4, La/qn7;

    .line 539
    .line 540
    invoke-direct {v4, v0, v11}, La/qn7;-><init>(La/i4;B)V

    .line 541
    .line 542
    .line 543
    new-instance v0, La/ugd;

    .line 544
    .line 545
    const v5, 0x2fd4df92

    .line 546
    .line 547
    .line 548
    invoke-direct {v0, v5, v10, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v1, v2, v12, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 552
    .line 553
    .line 554
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object v0

    .line 557
    :pswitch_5
    check-cast v0, La/kf7;

    .line 558
    .line 559
    move-object/from16 v1, p1

    .line 560
    .line 561
    check-cast v1, Ljava/lang/Throwable;

    .line 562
    .line 563
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    iget-object v2, v0, La/kf7;->s:La/duj;

    .line 567
    .line 568
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    if-nez v3, :cond_f

    .line 573
    .line 574
    goto :goto_8

    .line 575
    :cond_f
    move-object v1, v3

    .line 576
    :goto_8
    new-instance v3, La/m87;

    .line 577
    .line 578
    invoke-direct {v3, v0, v7}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 582
    .line 583
    .line 584
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_6
    check-cast v0, La/ke7;

    .line 588
    .line 589
    move-object/from16 v1, p1

    .line 590
    .line 591
    check-cast v1, Landroid/view/View;

    .line 592
    .line 593
    sget-object v2, La/ke7;->R1:La/yk5;

    .line 594
    .line 595
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    iget-object v1, v0, La/ke7;->L1:La/ii;

    .line 599
    .line 600
    if-eqz v1, :cond_10

    .line 601
    .line 602
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 603
    .line 604
    const v2, 0x7f1303fb

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v14

    .line 611
    new-instance v15, Landroid/text/SpannableString;

    .line 612
    .line 613
    const v2, 0x7f1315b1

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    invoke-static {v2, v11}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    invoke-direct {v15, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v16

    .line 637
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v17

    .line 644
    sget-object v22, La/n12;->a:La/n12;

    .line 645
    .line 646
    const/16 v23, 0x0

    .line 647
    .line 648
    const/16 v24, 0x5d0

    .line 649
    .line 650
    const/16 v18, 0x0

    .line 651
    .line 652
    const-string v19, "SET_LIMIT_REQUEST_KEY"

    .line 653
    .line 654
    const/16 v20, 0x0

    .line 655
    .line 656
    const/16 v21, 0x0

    .line 657
    .line 658
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 669
    .line 670
    .line 671
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 672
    .line 673
    return-object v0

    .line 674
    :cond_10
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    throw v12

    .line 678
    :pswitch_7
    check-cast v0, La/ao6;

    .line 679
    .line 680
    move-object/from16 v1, p1

    .line 681
    .line 682
    check-cast v1, La/cp;

    .line 683
    .line 684
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    new-instance v2, La/qo5;

    .line 688
    .line 689
    const/16 v3, 0x1b

    .line 690
    .line 691
    invoke-direct {v2, v1, v0, v3}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 695
    .line 696
    .line 697
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 698
    .line 699
    return-object v0

    .line 700
    :pswitch_8
    check-cast v0, La/o77;

    .line 701
    .line 702
    move-object/from16 v1, p1

    .line 703
    .line 704
    check-cast v1, Landroid/view/View;

    .line 705
    .line 706
    sget-object v2, La/o77;->k2:La/kl5;

    .line 707
    .line 708
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    iget-object v1, v0, La/o77;->h2:La/phf0;

    .line 712
    .line 713
    sget-object v2, La/o77;->l2:[La/iiy;

    .line 714
    .line 715
    aget-object v3, v2, v9

    .line 716
    .line 717
    invoke-virtual {v1, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 722
    .line 723
    .line 724
    move-result v3

    .line 725
    if-lez v3, :cond_11

    .line 726
    .line 727
    aget-object v2, v2, v9

    .line 728
    .line 729
    invoke-virtual {v1, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 734
    .line 735
    new-instance v3, Lkotlin/Pair;

    .line 736
    .line 737
    const-string v4, "RESULT_HIDE_HISTORY_CLICK"

    .line 738
    .line 739
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 740
    .line 741
    .line 742
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    :cond_11
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 754
    .line 755
    .line 756
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_9
    check-cast v0, La/xfs0;

    .line 760
    .line 761
    move-object/from16 v1, p1

    .line 762
    .line 763
    check-cast v1, La/k0w0;

    .line 764
    .line 765
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    new-instance v2, Lorg/xplatform/bethistory/transaction_history/presentation/TransactionHistoryScreenOld;

    .line 769
    .line 770
    iget-wide v10, v0, La/xfs0;->a:J

    .line 771
    .line 772
    iget-byte v9, v0, La/xfs0;->b:B

    .line 773
    .line 774
    iget-object v14, v0, La/xfs0;->c:Ljava/lang/String;

    .line 775
    .line 776
    iget-object v15, v0, La/xfs0;->d:Ljava/lang/String;

    .line 777
    .line 778
    iget-wide v12, v0, La/xfs0;->e:J

    .line 779
    .line 780
    iget-object v3, v0, La/xfs0;->f:Ljava/lang/String;

    .line 781
    .line 782
    iget-object v4, v0, La/xfs0;->g:Ljava/lang/String;

    .line 783
    .line 784
    move-object/from16 v16, v3

    .line 785
    .line 786
    move-object/from16 v17, v4

    .line 787
    .line 788
    iget-wide v3, v0, La/xfs0;->h:D

    .line 789
    .line 790
    iget-object v5, v0, La/xfs0;->i:Ljava/lang/String;

    .line 791
    .line 792
    move-object/from16 v18, v5

    .line 793
    .line 794
    iget-wide v5, v0, La/xfs0;->j:D

    .line 795
    .line 796
    iget-wide v7, v0, La/xfs0;->k:D

    .line 797
    .line 798
    invoke-direct/range {v2 .. v18}, Lorg/xplatform/bethistory/transaction_history/presentation/TransactionHistoryScreenOld;-><init>(DDDIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 802
    .line 803
    .line 804
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 805
    .line 806
    return-object v0

    .line 807
    :pswitch_a
    check-cast v0, La/o0k;

    .line 808
    .line 809
    move-object/from16 v1, p1

    .line 810
    .line 811
    check-cast v1, La/k0w0;

    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    new-instance v2, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;

    .line 817
    .line 818
    new-instance v3, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 819
    .line 820
    iget-object v4, v0, La/o0k;->a:Ljava/lang/String;

    .line 821
    .line 822
    iget-wide v6, v0, La/o0k;->b:J

    .line 823
    .line 824
    const/4 v8, 0x0

    .line 825
    iget-object v9, v0, La/o0k;->c:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 826
    .line 827
    const/4 v5, 0x0

    .line 828
    invoke-direct/range {v3 .. v9}, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;-><init>(Ljava/lang/String;ZJZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 829
    .line 830
    .line 831
    invoke-direct {v2, v3}, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;-><init>(Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 835
    .line 836
    .line 837
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 838
    .line 839
    return-object v0

    .line 840
    :pswitch_b
    check-cast v0, La/a0k;

    .line 841
    .line 842
    move-object/from16 v1, p1

    .line 843
    .line 844
    check-cast v1, La/k0w0;

    .line 845
    .line 846
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    new-instance v2, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;

    .line 850
    .line 851
    new-instance v3, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 852
    .line 853
    iget-object v4, v0, La/a0k;->a:Ljava/lang/String;

    .line 854
    .line 855
    iget-wide v6, v0, La/a0k;->b:J

    .line 856
    .line 857
    iget-boolean v8, v0, La/a0k;->c:Z

    .line 858
    .line 859
    iget-object v9, v0, La/a0k;->d:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 860
    .line 861
    const/4 v5, 0x1

    .line 862
    invoke-direct/range {v3 .. v9}, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;-><init>(Ljava/lang/String;ZJZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 863
    .line 864
    .line 865
    invoke-direct {v2, v3}, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;-><init>(Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 869
    .line 870
    .line 871
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 872
    .line 873
    return-object v0

    .line 874
    :pswitch_c
    check-cast v0, La/hz6;

    .line 875
    .line 876
    move-object/from16 v1, p1

    .line 877
    .line 878
    check-cast v1, Landroid/view/View;

    .line 879
    .line 880
    sget-object v2, La/hz6;->p2:La/cl5;

    .line 881
    .line 882
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    iget-object v1, v0, La/hz6;->e2:La/o900;

    .line 886
    .line 887
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    iget-object v2, v2, La/vik;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 892
    .line 893
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    invoke-virtual {v1, v2}, La/o900;->e(Landroidx/recyclerview/widget/b;)Landroid/view/View;

    .line 898
    .line 899
    .line 900
    move-result-object v1

    .line 901
    if-eqz v1, :cond_15

    .line 902
    .line 903
    invoke-virtual {v0}, La/hz6;->T0()La/vik;

    .line 904
    .line 905
    .line 906
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 907
    .line 908
    .line 909
    move-result v1

    .line 910
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 911
    .line 912
    .line 913
    move-result-object v2

    .line 914
    const/4 v3, -0x1

    .line 915
    if-eq v1, v3, :cond_12

    .line 916
    .line 917
    goto :goto_9

    .line 918
    :cond_12
    move-object v2, v12

    .line 919
    :goto_9
    if-eqz v2, :cond_15

    .line 920
    .line 921
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 922
    .line 923
    .line 924
    move-result v1

    .line 925
    invoke-virtual {v0}, La/hz6;->U0()La/b07;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    iget-object v2, v0, La/b07;->e:La/mne;

    .line 930
    .line 931
    iget-object v3, v0, La/b07;->m:La/m1e;

    .line 932
    .line 933
    invoke-interface {v3}, La/m1e;->c()Z

    .line 934
    .line 935
    .line 936
    move-result v3

    .line 937
    if-nez v3, :cond_13

    .line 938
    .line 939
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 940
    .line 941
    .line 942
    move-result-object v13

    .line 943
    iget-object v1, v2, La/mne;->a:La/rwj;

    .line 944
    .line 945
    sget-object v14, La/a07;->a:La/a07;

    .line 946
    .line 947
    new-instance v2, La/mz6;

    .line 948
    .line 949
    invoke-direct {v2, v0, v12, v10}, La/mz6;-><init>(La/b07;La/yje;B)V

    .line 950
    .line 951
    .line 952
    const/16 v18, 0xa

    .line 953
    .line 954
    const/4 v15, 0x0

    .line 955
    move-object/from16 v16, v1

    .line 956
    .line 957
    move-object/from16 v17, v2

    .line 958
    .line 959
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 960
    .line 961
    .line 962
    sget-object v1, La/oz6;->a:La/oz6;

    .line 963
    .line 964
    invoke-virtual {v0, v1}, La/b07;->z(La/xz6;)V

    .line 965
    .line 966
    .line 967
    goto :goto_a

    .line 968
    :cond_13
    iget-object v3, v0, La/b07;->v:Ljava/util/List;

    .line 969
    .line 970
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    check-cast v1, La/rg5;

    .line 975
    .line 976
    if-eqz v1, :cond_15

    .line 977
    .line 978
    iget-wide v3, v0, La/b07;->s:D

    .line 979
    .line 980
    iget v5, v0, La/b07;->t:I

    .line 981
    .line 982
    int-to-double v5, v5

    .line 983
    mul-double/2addr v3, v5

    .line 984
    iget-boolean v5, v1, La/rg5;->e:Z

    .line 985
    .line 986
    if-eqz v5, :cond_14

    .line 987
    .line 988
    iget-wide v5, v1, La/rg5;->b:D

    .line 989
    .line 990
    cmpl-double v3, v3, v5

    .line 991
    .line 992
    if-lez v3, :cond_14

    .line 993
    .line 994
    new-instance v1, La/rz6;

    .line 995
    .line 996
    iget-object v2, v0, La/b07;->o:La/toc0;

    .line 997
    .line 998
    iget-boolean v2, v2, La/toc0;->r:Z

    .line 999
    .line 1000
    invoke-direct {v1, v2}, La/rz6;-><init>(Z)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v0, v1}, La/b07;->z(La/xz6;)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_a

    .line 1007
    :cond_14
    new-instance v3, La/tz6;

    .line 1008
    .line 1009
    invoke-direct {v3, v10}, La/tz6;-><init>(Z)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v0, v3}, La/b07;->z(La/xz6;)V

    .line 1013
    .line 1014
    .line 1015
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v13

    .line 1019
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 1020
    .line 1021
    new-instance v14, La/iz6;

    .line 1022
    .line 1023
    invoke-direct {v14, v0, v10}, La/iz6;-><init>(La/b07;B)V

    .line 1024
    .line 1025
    .line 1026
    new-instance v3, La/zz6;

    .line 1027
    .line 1028
    invoke-direct {v3, v0, v1, v12, v9}, La/zz6;-><init>(La/b07;La/rg5;La/yje;B)V

    .line 1029
    .line 1030
    .line 1031
    const/16 v18, 0xa

    .line 1032
    .line 1033
    const/4 v15, 0x0

    .line 1034
    move-object/from16 v16, v2

    .line 1035
    .line 1036
    move-object/from16 v17, v3

    .line 1037
    .line 1038
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1039
    .line 1040
    .line 1041
    :cond_15
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1042
    .line 1043
    return-object v0

    .line 1044
    :pswitch_d
    check-cast v0, La/yj5;

    .line 1045
    .line 1046
    move-object/from16 v1, p1

    .line 1047
    .line 1048
    check-cast v1, La/cp;

    .line 1049
    .line 1050
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1051
    .line 1052
    .line 1053
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1054
    .line 1055
    check-cast v2, La/cs6;

    .line 1056
    .line 1057
    iget-object v2, v2, La/cs6;->c:Lcom/google/android/material/card/MaterialCardView;

    .line 1058
    .line 1059
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    new-instance v3, La/qo5;

    .line 1063
    .line 1064
    const/16 v4, 0x14

    .line 1065
    .line 1066
    invoke-direct {v3, v0, v1, v4}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1067
    .line 1068
    .line 1069
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1070
    .line 1071
    .line 1072
    new-instance v0, La/ok;

    .line 1073
    .line 1074
    invoke-direct {v0, v1, v1, v7}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1078
    .line 1079
    .line 1080
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1081
    .line 1082
    return-object v0

    .line 1083
    :pswitch_e
    check-cast v0, La/kt6;

    .line 1084
    .line 1085
    move-object/from16 v1, p1

    .line 1086
    .line 1087
    check-cast v1, Landroid/view/View;

    .line 1088
    .line 1089
    sget-object v2, La/kt6;->Q1:La/bj5;

    .line 1090
    .line 1091
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v0}, La/kt6;->H0()La/y920;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v1

    .line 1098
    invoke-virtual {v0}, La/kt6;->G0()La/ouc0;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    iget-object v0, v0, La/ouc0;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1103
    .line 1104
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    if-eqz v0, :cond_17

    .line 1109
    .line 1110
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    if-nez v0, :cond_16

    .line 1115
    .line 1116
    goto :goto_b

    .line 1117
    :cond_16
    move-object v8, v0

    .line 1118
    :cond_17
    :goto_b
    invoke-virtual {v1, v8, v11}, La/y920;->w(Ljava/lang/String;Z)V

    .line 1119
    .line 1120
    .line 1121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1122
    .line 1123
    return-object v0

    .line 1124
    :pswitch_f
    check-cast v0, La/er6;

    .line 1125
    .line 1126
    move-object/from16 v1, p1

    .line 1127
    .line 1128
    check-cast v1, Landroid/view/View;

    .line 1129
    .line 1130
    sget-object v2, La/er6;->S1:La/kl5;

    .line 1131
    .line 1132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v0}, La/er6;->H0()La/as6;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v0

    .line 1139
    iput-boolean v11, v0, La/as6;->B:Z

    .line 1140
    .line 1141
    iget-object v1, v0, La/as6;->o:La/bn6;

    .line 1142
    .line 1143
    iget-object v1, v1, La/bn6;->b:La/kt2;

    .line 1144
    .line 1145
    const-string v2, "betkit_bet_call"

    .line 1146
    .line 1147
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    iget-object v1, v0, La/as6;->p:La/au0;

    .line 1151
    .line 1152
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 1153
    .line 1154
    const-wide/16 v2, 0xd1d

    .line 1155
    .line 1156
    sget-object v4, La/xun;->a:La/xun;

    .line 1157
    .line 1158
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1159
    .line 1160
    .line 1161
    iget-object v0, v0, La/as6;->r:La/i1w0;

    .line 1162
    .line 1163
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    new-instance v2, Lorg/xplatform/bet_constructor/impl/bets/presentation/BetConstructorBetsOldScreen;

    .line 1168
    .line 1169
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1170
    .line 1171
    .line 1172
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1173
    .line 1174
    if-eqz v3, :cond_18

    .line 1175
    .line 1176
    new-instance v3, La/e1w0;

    .line 1177
    .line 1178
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1179
    .line 1180
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1181
    .line 1182
    .line 1183
    new-instance v2, La/c8d;

    .line 1184
    .line 1185
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1186
    .line 1187
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1191
    .line 1192
    .line 1193
    goto :goto_c

    .line 1194
    :cond_18
    new-instance v3, La/w0w0;

    .line 1195
    .line 1196
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 1197
    .line 1198
    .line 1199
    new-instance v2, La/c8d;

    .line 1200
    .line 1201
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1202
    .line 1203
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1207
    .line 1208
    .line 1209
    :goto_c
    invoke-static {v0, v1, v11}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    :goto_d
    move-object v2, v1

    .line 1214
    check-cast v2, La/paw;

    .line 1215
    .line 1216
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v3

    .line 1220
    if-eqz v3, :cond_19

    .line 1221
    .line 1222
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    check-cast v2, La/oe50;

    .line 1227
    .line 1228
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 1229
    .line 1230
    .line 1231
    goto :goto_d

    .line 1232
    :cond_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1233
    .line 1234
    return-object v0

    .line 1235
    :pswitch_10
    check-cast v0, La/yq6;

    .line 1236
    .line 1237
    move-object/from16 v1, p1

    .line 1238
    .line 1239
    check-cast v1, La/nr6;

    .line 1240
    .line 1241
    sget-object v4, La/yq6;->R1:La/gl5;

    .line 1242
    .line 1243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    instance-of v4, v1, La/lr6;

    .line 1247
    .line 1248
    if-eqz v4, :cond_1a

    .line 1249
    .line 1250
    sget-object v2, La/ajp0;->r2:La/s9m0;

    .line 1251
    .line 1252
    check-cast v1, La/lr6;

    .line 1253
    .line 1254
    iget-object v4, v1, La/lr6;->a:La/d9a0;

    .line 1255
    .line 1256
    iget-object v5, v4, La/d9a0;->c:Ljava/lang/String;

    .line 1257
    .line 1258
    iget v6, v4, La/d9a0;->a:I

    .line 1259
    .line 1260
    iget v4, v4, La/d9a0;->b:I

    .line 1261
    .line 1262
    iget-object v1, v1, La/lr6;->b:Ljava/util/ArrayList;

    .line 1263
    .line 1264
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1265
    .line 1266
    .line 1267
    new-instance v2, La/ajp0;

    .line 1268
    .line 1269
    invoke-direct {v2}, La/ajp0;-><init>()V

    .line 1270
    .line 1271
    .line 1272
    sget-object v8, La/ajp0;->s2:[La/iiy;

    .line 1273
    .line 1274
    aget-object v11, v8, v11

    .line 1275
    .line 1276
    iget-object v12, v2, La/ajp0;->l2:La/phf0;

    .line 1277
    .line 1278
    const-string v13, "REQUEST_TEAM_SELECTOR_KEY_NEW"

    .line 1279
    .line 1280
    invoke-virtual {v12, v2, v11, v13}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    iget-object v11, v2, La/ajp0;->m2:La/phf0;

    .line 1284
    .line 1285
    aget-object v10, v8, v10

    .line 1286
    .line 1287
    invoke-virtual {v11, v2, v10, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1288
    .line 1289
    .line 1290
    iget-object v5, v2, La/ajp0;->n2:La/zz2;

    .line 1291
    .line 1292
    aget-object v7, v8, v7

    .line 1293
    .line 1294
    invoke-virtual {v5, v2, v7, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 1295
    .line 1296
    .line 1297
    iget-object v5, v2, La/ajp0;->o2:La/zz2;

    .line 1298
    .line 1299
    aget-object v6, v8, v9

    .line 1300
    .line 1301
    invoke-virtual {v5, v2, v6, v4}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 1302
    .line 1303
    .line 1304
    iget-object v4, v2, La/ajp0;->p2:La/es;

    .line 1305
    .line 1306
    aget-object v3, v8, v3

    .line 1307
    .line 1308
    invoke-virtual {v4, v2, v3, v1}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v1

    .line 1315
    invoke-static {v2, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 1316
    .line 1317
    .line 1318
    goto/16 :goto_e

    .line 1319
    .line 1320
    :cond_1a
    sget-object v4, La/mr6;->a:La/mr6;

    .line 1321
    .line 1322
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v4

    .line 1326
    if-eqz v4, :cond_1c

    .line 1327
    .line 1328
    iget-object v1, v0, La/yq6;->M1:La/poq0;

    .line 1329
    .line 1330
    if-eqz v1, :cond_1b

    .line 1331
    .line 1332
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v1

    .line 1336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1337
    .line 1338
    .line 1339
    sget-object v2, La/fk60;->b:La/uuz;

    .line 1340
    .line 1341
    sget-object v2, La/noq0;->m2:La/y2m0;

    .line 1342
    .line 1343
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1344
    .line 1345
    .line 1346
    const-string v2, "TipsDialogTag"

    .line 1347
    .line 1348
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v4

    .line 1352
    if-nez v4, :cond_21

    .line 1353
    .line 1354
    new-instance v4, La/noq0;

    .line 1355
    .line 1356
    invoke-direct {v4}, La/noq0;-><init>()V

    .line 1357
    .line 1358
    .line 1359
    sget-object v5, La/noq0;->n2:[La/iiy;

    .line 1360
    .line 1361
    aget-object v6, v5, v9

    .line 1362
    .line 1363
    iget-object v7, v4, La/noq0;->h2:La/zz2;

    .line 1364
    .line 1365
    invoke-virtual {v7, v4, v6, v9}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 1366
    .line 1367
    .line 1368
    iget-object v6, v4, La/noq0;->i2:La/phf0;

    .line 1369
    .line 1370
    aget-object v3, v5, v3

    .line 1371
    .line 1372
    invoke-virtual {v6, v4, v3, v8}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1373
    .line 1374
    .line 1375
    invoke-static {v4, v1, v2}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1376
    .line 1377
    .line 1378
    goto/16 :goto_e

    .line 1379
    .line 1380
    :cond_1b
    const-string v0, "tipsDialogFeature"

    .line 1381
    .line 1382
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1383
    .line 1384
    .line 1385
    throw v12

    .line 1386
    :cond_1c
    sget-object v3, La/jr6;->a:La/jr6;

    .line 1387
    .line 1388
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1389
    .line 1390
    .line 1391
    move-result v3

    .line 1392
    const v4, 0x7f130162

    .line 1393
    .line 1394
    .line 1395
    if-eqz v3, :cond_1e

    .line 1396
    .line 1397
    iget-object v1, v0, La/yq6;->N1:La/ii;

    .line 1398
    .line 1399
    if-eqz v1, :cond_1d

    .line 1400
    .line 1401
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1402
    .line 1403
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v14

    .line 1407
    const v2, 0x7f130280

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v15

    .line 1414
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v16

    .line 1418
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    .line 1420
    .line 1421
    const v2, 0x7f130e07

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v17

    .line 1428
    sget-object v22, La/n12;->a:La/n12;

    .line 1429
    .line 1430
    const/16 v23, 0x0

    .line 1431
    .line 1432
    const/16 v24, 0x5d0

    .line 1433
    .line 1434
    const/16 v18, 0x0

    .line 1435
    .line 1436
    const-string v19, "REQUEST_KEY_EXIT_NEW"

    .line 1437
    .line 1438
    const/16 v20, 0x0

    .line 1439
    .line 1440
    const/16 v21, 0x0

    .line 1441
    .line 1442
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v2

    .line 1449
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual {v1, v13, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1453
    .line 1454
    .line 1455
    goto/16 :goto_e

    .line 1456
    .line 1457
    :cond_1d
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1458
    .line 1459
    .line 1460
    throw v12

    .line 1461
    :cond_1e
    instance-of v3, v1, La/kr6;

    .line 1462
    .line 1463
    if-eqz v3, :cond_20

    .line 1464
    .line 1465
    move-object v3, v1

    .line 1466
    iget-object v1, v0, La/yq6;->O1:La/wdk0;

    .line 1467
    .line 1468
    if-eqz v1, :cond_1f

    .line 1469
    .line 1470
    new-instance v2, La/xdk0;

    .line 1471
    .line 1472
    sget-object v14, La/rek0;->b:La/rek0;

    .line 1473
    .line 1474
    check-cast v3, La/kr6;

    .line 1475
    .line 1476
    iget-object v15, v3, La/kr6;->a:Ljava/lang/String;

    .line 1477
    .line 1478
    const/16 v19, 0x0

    .line 1479
    .line 1480
    const/16 v20, 0x7c

    .line 1481
    .line 1482
    const/16 v16, 0x0

    .line 1483
    .line 1484
    const/16 v17, 0x0

    .line 1485
    .line 1486
    const/16 v18, 0x0

    .line 1487
    .line 1488
    move-object v13, v2

    .line 1489
    invoke-direct/range {v13 .. v20}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1490
    .line 1491
    .line 1492
    const/4 v7, 0x0

    .line 1493
    const/16 v8, 0x3fc

    .line 1494
    .line 1495
    const/4 v4, 0x0

    .line 1496
    const/4 v5, 0x0

    .line 1497
    const/4 v6, 0x0

    .line 1498
    move-object v3, v0

    .line 1499
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1500
    .line 1501
    .line 1502
    goto :goto_e

    .line 1503
    :cond_1f
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1504
    .line 1505
    .line 1506
    throw v12

    .line 1507
    :cond_20
    move-object v3, v1

    .line 1508
    sget-object v1, La/ir6;->a:La/ir6;

    .line 1509
    .line 1510
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v1

    .line 1514
    if-eqz v1, :cond_23

    .line 1515
    .line 1516
    iget-object v1, v0, La/yq6;->N1:La/ii;

    .line 1517
    .line 1518
    if-eqz v1, :cond_22

    .line 1519
    .line 1520
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1521
    .line 1522
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v14

    .line 1526
    const v2, 0x7f1316ef

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v15

    .line 1533
    const v2, 0x7f130e5c

    .line 1534
    .line 1535
    .line 1536
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v16

    .line 1540
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1541
    .line 1542
    .line 1543
    sget-object v22, La/n12;->b:La/n12;

    .line 1544
    .line 1545
    const/16 v23, 0x0

    .line 1546
    .line 1547
    const/16 v24, 0x5f8

    .line 1548
    .line 1549
    const/16 v17, 0x0

    .line 1550
    .line 1551
    const/16 v18, 0x0

    .line 1552
    .line 1553
    const/16 v19, 0x0

    .line 1554
    .line 1555
    const/16 v20, 0x0

    .line 1556
    .line 1557
    const/16 v21, 0x0

    .line 1558
    .line 1559
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v2

    .line 1566
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v1, v13, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1570
    .line 1571
    .line 1572
    :cond_21
    :goto_e
    invoke-virtual {v0}, La/yq6;->G0()La/k3t0;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    sget-object v1, La/jq6;->a:La/jq6;

    .line 1577
    .line 1578
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1579
    .line 1580
    .line 1581
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1582
    .line 1583
    goto :goto_f

    .line 1584
    :cond_22
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1585
    .line 1586
    .line 1587
    throw v12

    .line 1588
    :cond_23
    invoke-static {}, La/t9f;->b()V

    .line 1589
    .line 1590
    .line 1591
    :goto_f
    return-object v12

    .line 1592
    :pswitch_11
    check-cast v0, La/zp6;

    .line 1593
    .line 1594
    move-object/from16 v1, p1

    .line 1595
    .line 1596
    check-cast v1, Ljava/lang/Integer;

    .line 1597
    .line 1598
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1599
    .line 1600
    .line 1601
    move-result v1

    .line 1602
    sget-object v2, La/zp6;->m2:La/yk5;

    .line 1603
    .line 1604
    invoke-virtual {v0}, La/zp6;->V0()La/k620;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v0

    .line 1608
    iget-object v0, v0, La/k620;->f:Landroidx/viewpager2/widget/ViewPager2;

    .line 1609
    .line 1610
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 1611
    .line 1612
    .line 1613
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1614
    .line 1615
    return-object v0

    .line 1616
    :pswitch_12
    check-cast v0, La/op6;

    .line 1617
    .line 1618
    move-object/from16 v1, p1

    .line 1619
    .line 1620
    check-cast v1, La/fee;

    .line 1621
    .line 1622
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v1

    .line 1629
    check-cast v1, Ljava/util/List;

    .line 1630
    .line 1631
    iget-object v2, v0, La/op6;->e:La/n0o0;

    .line 1632
    .line 1633
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v2

    .line 1637
    check-cast v2, La/fee;

    .line 1638
    .line 1639
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v2

    .line 1643
    check-cast v2, Ljava/util/Set;

    .line 1644
    .line 1645
    iget-object v3, v0, La/op6;->f:La/n0o0;

    .line 1646
    .line 1647
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v3

    .line 1651
    check-cast v3, La/fee;

    .line 1652
    .line 1653
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v3

    .line 1657
    check-cast v3, Ljava/util/List;

    .line 1658
    .line 1659
    iget-object v4, v0, La/op6;->g:La/n0o0;

    .line 1660
    .line 1661
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v4

    .line 1665
    check-cast v4, La/fee;

    .line 1666
    .line 1667
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v4

    .line 1671
    check-cast v4, Ljava/lang/Boolean;

    .line 1672
    .line 1673
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1674
    .line 1675
    .line 1676
    move-result v4

    .line 1677
    iget-object v0, v0, La/op6;->h:La/n0o0;

    .line 1678
    .line 1679
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v0

    .line 1683
    check-cast v0, La/fee;

    .line 1684
    .line 1685
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v0

    .line 1689
    check-cast v0, Ljava/lang/Boolean;

    .line 1690
    .line 1691
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1692
    .line 1693
    .line 1694
    move-result v0

    .line 1695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1696
    .line 1697
    .line 1698
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1702
    .line 1703
    .line 1704
    const/16 v5, 0xa

    .line 1705
    .line 1706
    if-eqz v0, :cond_34

    .line 1707
    .line 1708
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1709
    .line 1710
    .line 1711
    move-result v0

    .line 1712
    if-eqz v0, :cond_24

    .line 1713
    .line 1714
    goto/16 :goto_19

    .line 1715
    .line 1716
    :cond_24
    new-instance v0, Ljava/util/ArrayList;

    .line 1717
    .line 1718
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1719
    .line 1720
    .line 1721
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v6

    .line 1725
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1726
    .line 1727
    .line 1728
    move-result v7

    .line 1729
    if-eqz v7, :cond_25

    .line 1730
    .line 1731
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v7

    .line 1735
    check-cast v7, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 1736
    .line 1737
    iget-object v7, v7, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->f:Ljava/util/List;

    .line 1738
    .line 1739
    invoke-static {v0, v7}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1740
    .line 1741
    .line 1742
    goto :goto_10

    .line 1743
    :cond_25
    new-instance v6, Ljava/util/ArrayList;

    .line 1744
    .line 1745
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1746
    .line 1747
    .line 1748
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v0

    .line 1752
    :cond_26
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1753
    .line 1754
    .line 1755
    move-result v7

    .line 1756
    const-wide/16 v8, 0x0

    .line 1757
    .line 1758
    if-eqz v7, :cond_27

    .line 1759
    .line 1760
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v7

    .line 1764
    move-object v13, v7

    .line 1765
    check-cast v13, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1766
    .line 1767
    iget-wide v13, v13, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 1768
    .line 1769
    cmp-long v8, v13, v8

    .line 1770
    .line 1771
    if-lez v8, :cond_26

    .line 1772
    .line 1773
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1774
    .line 1775
    .line 1776
    goto :goto_11

    .line 1777
    :cond_27
    new-instance v0, Ljava/util/ArrayList;

    .line 1778
    .line 1779
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1780
    .line 1781
    .line 1782
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v7

    .line 1786
    :goto_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1787
    .line 1788
    .line 1789
    move-result v13

    .line 1790
    if-eqz v13, :cond_28

    .line 1791
    .line 1792
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v13

    .line 1796
    check-cast v13, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 1797
    .line 1798
    iget-object v13, v13, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->f:Ljava/util/List;

    .line 1799
    .line 1800
    invoke-static {v0, v13}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1801
    .line 1802
    .line 1803
    goto :goto_12

    .line 1804
    :cond_28
    new-instance v7, Ljava/util/ArrayList;

    .line 1805
    .line 1806
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v0

    .line 1813
    :cond_29
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1814
    .line 1815
    .line 1816
    move-result v13

    .line 1817
    if-eqz v13, :cond_2a

    .line 1818
    .line 1819
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v13

    .line 1823
    move-object v14, v13

    .line 1824
    check-cast v14, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1825
    .line 1826
    iget-wide v14, v14, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 1827
    .line 1828
    cmp-long v14, v14, v8

    .line 1829
    .line 1830
    if-lez v14, :cond_29

    .line 1831
    .line 1832
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1833
    .line 1834
    .line 1835
    goto :goto_13

    .line 1836
    :cond_2a
    new-instance v0, Ljava/util/ArrayList;

    .line 1837
    .line 1838
    invoke-static {v6, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1839
    .line 1840
    .line 1841
    move-result v8

    .line 1842
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1843
    .line 1844
    .line 1845
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v6

    .line 1849
    move v8, v11

    .line 1850
    :goto_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1851
    .line 1852
    .line 1853
    move-result v9

    .line 1854
    if-eqz v9, :cond_30

    .line 1855
    .line 1856
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v9

    .line 1860
    add-int/lit8 v13, v8, 0x1

    .line 1861
    .line 1862
    if-ltz v8, :cond_2f

    .line 1863
    .line 1864
    check-cast v9, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1865
    .line 1866
    invoke-static {v8, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v8

    .line 1870
    check-cast v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 1871
    .line 1872
    if-eqz v8, :cond_2c

    .line 1873
    .line 1874
    iget-wide v14, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 1875
    .line 1876
    move-object/from16 v17, v12

    .line 1877
    .line 1878
    iget-wide v11, v9, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 1879
    .line 1880
    cmp-long v11, v14, v11

    .line 1881
    .line 1882
    if-nez v11, :cond_2b

    .line 1883
    .line 1884
    goto :goto_15

    .line 1885
    :cond_2b
    move-object/from16 v8, v17

    .line 1886
    .line 1887
    :goto_15
    if-eqz v8, :cond_2d

    .line 1888
    .line 1889
    iget-wide v11, v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 1890
    .line 1891
    const-wide v14, 0x40c3880000000000L    # 10000.0

    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    mul-double/2addr v11, v14

    .line 1897
    double-to-int v8, v11

    .line 1898
    iget-wide v11, v9, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->b:D

    .line 1899
    .line 1900
    mul-double/2addr v11, v14

    .line 1901
    double-to-int v9, v11

    .line 1902
    sub-int v8, v9, v8

    .line 1903
    .line 1904
    goto :goto_16

    .line 1905
    :cond_2c
    move-object/from16 v17, v12

    .line 1906
    .line 1907
    :cond_2d
    const/4 v8, 0x0

    .line 1908
    :goto_16
    if-eqz v8, :cond_2e

    .line 1909
    .line 1910
    move v8, v10

    .line 1911
    goto :goto_17

    .line 1912
    :cond_2e
    const/4 v8, 0x0

    .line 1913
    :goto_17
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v8

    .line 1917
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1918
    .line 1919
    .line 1920
    move v8, v13

    .line 1921
    move-object/from16 v12, v17

    .line 1922
    .line 1923
    const/4 v11, 0x0

    .line 1924
    goto :goto_14

    .line 1925
    :cond_2f
    move-object/from16 v17, v12

    .line 1926
    .line 1927
    invoke-static {}, La/q3d;->p()V

    .line 1928
    .line 1929
    .line 1930
    throw v17

    .line 1931
    :cond_30
    move-object/from16 v17, v12

    .line 1932
    .line 1933
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1934
    .line 1935
    .line 1936
    move-result v6

    .line 1937
    if-eqz v6, :cond_31

    .line 1938
    .line 1939
    goto :goto_18

    .line 1940
    :cond_31
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v0

    .line 1944
    :cond_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1945
    .line 1946
    .line 1947
    move-result v6

    .line 1948
    if-eqz v6, :cond_33

    .line 1949
    .line 1950
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v6

    .line 1954
    check-cast v6, Ljava/lang/Boolean;

    .line 1955
    .line 1956
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1957
    .line 1958
    .line 1959
    move-result v6

    .line 1960
    if-nez v6, :cond_32

    .line 1961
    .line 1962
    goto :goto_1a

    .line 1963
    :cond_33
    :goto_18
    move v0, v10

    .line 1964
    goto :goto_1b

    .line 1965
    :cond_34
    :goto_19
    move-object/from16 v17, v12

    .line 1966
    .line 1967
    :goto_1a
    const/4 v0, 0x0

    .line 1968
    :goto_1b
    new-instance v6, Ljava/util/ArrayList;

    .line 1969
    .line 1970
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1971
    .line 1972
    .line 1973
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v1

    .line 1977
    const/4 v7, 0x0

    .line 1978
    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1979
    .line 1980
    .line 1981
    move-result v8

    .line 1982
    if-eqz v8, :cond_43

    .line 1983
    .line 1984
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v8

    .line 1988
    add-int/lit8 v9, v7, 0x1

    .line 1989
    .line 1990
    if-ltz v7, :cond_42

    .line 1991
    .line 1992
    check-cast v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 1993
    .line 1994
    iget-object v11, v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->g:Ljava/util/List;

    .line 1995
    .line 1996
    iget-wide v12, v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->b:J

    .line 1997
    .line 1998
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 1999
    .line 2000
    .line 2001
    move-result v11

    .line 2002
    if-eqz v11, :cond_35

    .line 2003
    .line 2004
    move-object/from16 p1, v1

    .line 2005
    .line 2006
    move-object/from16 v26, v2

    .line 2007
    .line 2008
    move-object/from16 v27, v3

    .line 2009
    .line 2010
    move-object/from16 v1, v17

    .line 2011
    .line 2012
    goto/16 :goto_25

    .line 2013
    .line 2014
    :cond_35
    invoke-static {v7, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v7

    .line 2018
    check-cast v7, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;

    .line 2019
    .line 2020
    if-eqz v7, :cond_37

    .line 2021
    .line 2022
    iget-wide v14, v7, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->b:J

    .line 2023
    .line 2024
    cmp-long v11, v14, v12

    .line 2025
    .line 2026
    if-nez v11, :cond_36

    .line 2027
    .line 2028
    goto :goto_1d

    .line 2029
    :cond_36
    move-object/from16 v7, v17

    .line 2030
    .line 2031
    :goto_1d
    if-eqz v7, :cond_37

    .line 2032
    .line 2033
    iget-object v7, v7, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->f:Ljava/util/List;

    .line 2034
    .line 2035
    goto :goto_1e

    .line 2036
    :cond_37
    move-object/from16 v7, v17

    .line 2037
    .line 2038
    :goto_1e
    if-nez v7, :cond_38

    .line 2039
    .line 2040
    sget-object v7, La/iun;->a:La/iun;

    .line 2041
    .line 2042
    :cond_38
    new-instance v18, La/ry20;

    .line 2043
    .line 2044
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2045
    .line 2046
    .line 2047
    move-result-object v19

    .line 2048
    iget-wide v14, v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->b:J

    .line 2049
    .line 2050
    iget-object v11, v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->c:Ljava/lang/String;

    .line 2051
    .line 2052
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v5

    .line 2056
    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2057
    .line 2058
    .line 2059
    move-result v23

    .line 2060
    iget-object v5, v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->i:Lorg/xplatform/betting/core/zip/model/zip/bet/BetViewType;

    .line 2061
    .line 2062
    sget-object v20, La/sy20;->a:[I

    .line 2063
    .line 2064
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 2065
    .line 2066
    .line 2067
    move-result v5

    .line 2068
    aget v5, v20, v5

    .line 2069
    .line 2070
    if-ne v5, v10, :cond_3c

    .line 2071
    .line 2072
    iget-object v5, v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->g:Ljava/util/List;

    .line 2073
    .line 2074
    new-instance v7, Ljava/util/ArrayList;

    .line 2075
    .line 2076
    const/16 v8, 0xa

    .line 2077
    .line 2078
    invoke-static {v5, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2079
    .line 2080
    .line 2081
    move-result v10

    .line 2082
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 2083
    .line 2084
    .line 2085
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v5

    .line 2089
    const/4 v8, 0x0

    .line 2090
    :goto_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2091
    .line 2092
    .line 2093
    move-result v10

    .line 2094
    if-eqz v10, :cond_3b

    .line 2095
    .line 2096
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v10

    .line 2100
    add-int/lit8 v20, v8, 0x1

    .line 2101
    .line 2102
    if-ltz v8, :cond_3a

    .line 2103
    .line 2104
    check-cast v10, Lorg/xplatform/betting/core/zip/model/zip/bet/ChildBets;

    .line 2105
    .line 2106
    move-object/from16 p1, v1

    .line 2107
    .line 2108
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2109
    .line 2110
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2111
    .line 2112
    .line 2113
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2114
    .line 2115
    .line 2116
    move-object/from16 v26, v2

    .line 2117
    .line 2118
    const-string v2, "_accuracy_"

    .line 2119
    .line 2120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2121
    .line 2122
    .line 2123
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2124
    .line 2125
    .line 2126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v1

    .line 2130
    iget-object v2, v10, Lorg/xplatform/betting/core/zip/model/zip/bet/ChildBets;->b:Ljava/util/ArrayList;

    .line 2131
    .line 2132
    new-instance v8, Ljava/util/ArrayList;

    .line 2133
    .line 2134
    move-object/from16 v27, v3

    .line 2135
    .line 2136
    const/16 v10, 0xa

    .line 2137
    .line 2138
    invoke-static {v2, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2139
    .line 2140
    .line 2141
    move-result v3

    .line 2142
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2143
    .line 2144
    .line 2145
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v2

    .line 2149
    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2150
    .line 2151
    .line 2152
    move-result v3

    .line 2153
    if-eqz v3, :cond_39

    .line 2154
    .line 2155
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2156
    .line 2157
    .line 2158
    move-result-object v3

    .line 2159
    check-cast v3, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 2160
    .line 2161
    move-object/from16 v10, v17

    .line 2162
    .line 2163
    move-object/from16 v17, v2

    .line 2164
    .line 2165
    move-object v2, v10

    .line 2166
    const/4 v10, 0x0

    .line 2167
    invoke-static {v3, v2, v4, v10}, La/m8x;->y0(Lorg/xplatform/betting/core/zip/model/zip/BetZip;Lorg/xplatform/betting/core/zip/model/zip/BetZip;ZZ)La/chl0;

    .line 2168
    .line 2169
    .line 2170
    move-result-object v3

    .line 2171
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2172
    .line 2173
    .line 2174
    move-object/from16 v30, v17

    .line 2175
    .line 2176
    move-object/from16 v17, v2

    .line 2177
    .line 2178
    move-object/from16 v2, v30

    .line 2179
    .line 2180
    goto :goto_20

    .line 2181
    :cond_39
    move-object/from16 v2, v17

    .line 2182
    .line 2183
    invoke-static {v8}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v3

    .line 2187
    new-instance v8, La/et6;

    .line 2188
    .line 2189
    invoke-direct {v8, v3, v1}, La/et6;-><init>(La/a4x;Ljava/lang/String;)V

    .line 2190
    .line 2191
    .line 2192
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2193
    .line 2194
    .line 2195
    move-object/from16 v1, p1

    .line 2196
    .line 2197
    move/from16 v8, v20

    .line 2198
    .line 2199
    move-object/from16 v2, v26

    .line 2200
    .line 2201
    move-object/from16 v3, v27

    .line 2202
    .line 2203
    goto :goto_1f

    .line 2204
    :cond_3a
    move-object/from16 v2, v17

    .line 2205
    .line 2206
    invoke-static {}, La/q3d;->p()V

    .line 2207
    .line 2208
    .line 2209
    throw v2

    .line 2210
    :cond_3b
    move-object/from16 p1, v1

    .line 2211
    .line 2212
    move-object/from16 v26, v2

    .line 2213
    .line 2214
    move-object/from16 v27, v3

    .line 2215
    .line 2216
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v1

    .line 2220
    const/16 v17, 0x0

    .line 2221
    .line 2222
    :goto_21
    move-object/from16 v24, v1

    .line 2223
    .line 2224
    move-object/from16 v22, v11

    .line 2225
    .line 2226
    move-wide/from16 v20, v14

    .line 2227
    .line 2228
    goto/16 :goto_24

    .line 2229
    .line 2230
    :cond_3c
    move-object/from16 p1, v1

    .line 2231
    .line 2232
    move-object/from16 v26, v2

    .line 2233
    .line 2234
    move-object/from16 v27, v3

    .line 2235
    .line 2236
    iget v1, v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->e:I

    .line 2237
    .line 2238
    const/4 v2, 0x1

    .line 2239
    if-ge v1, v2, :cond_3d

    .line 2240
    .line 2241
    const/4 v1, 0x1

    .line 2242
    :cond_3d
    iget-object v2, v8, Lorg/xplatform/betting/core/zip/model/zip/bet/BetGroupZip;->f:Ljava/util/List;

    .line 2243
    .line 2244
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->S0(Ljava/lang/Iterable;)La/rx3;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v2

    .line 2248
    invoke-static {v2, v1, v1}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;II)Ljava/util/ArrayList;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v1

    .line 2252
    new-instance v2, Ljava/util/ArrayList;

    .line 2253
    .line 2254
    const/16 v8, 0xa

    .line 2255
    .line 2256
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2257
    .line 2258
    .line 2259
    move-result v3

    .line 2260
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2261
    .line 2262
    .line 2263
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v1

    .line 2267
    const/4 v3, 0x0

    .line 2268
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2269
    .line 2270
    .line 2271
    move-result v5

    .line 2272
    if-eqz v5, :cond_40

    .line 2273
    .line 2274
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v5

    .line 2278
    add-int/lit8 v8, v3, 0x1

    .line 2279
    .line 2280
    if-ltz v3, :cond_3f

    .line 2281
    .line 2282
    check-cast v5, Ljava/util/List;

    .line 2283
    .line 2284
    new-instance v10, Ljava/lang/StringBuilder;

    .line 2285
    .line 2286
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 2287
    .line 2288
    .line 2289
    invoke-virtual {v10, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2290
    .line 2291
    .line 2292
    move-object/from16 v20, v1

    .line 2293
    .line 2294
    const-string v1, "_"

    .line 2295
    .line 2296
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2297
    .line 2298
    .line 2299
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2300
    .line 2301
    .line 2302
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v1

    .line 2306
    new-instance v3, Ljava/util/ArrayList;

    .line 2307
    .line 2308
    move/from16 p0, v8

    .line 2309
    .line 2310
    const/16 v10, 0xa

    .line 2311
    .line 2312
    invoke-static {v5, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2313
    .line 2314
    .line 2315
    move-result v8

    .line 2316
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 2317
    .line 2318
    .line 2319
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2320
    .line 2321
    .line 2322
    move-result-object v5

    .line 2323
    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2324
    .line 2325
    .line 2326
    move-result v8

    .line 2327
    if-eqz v8, :cond_3e

    .line 2328
    .line 2329
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v8

    .line 2333
    check-cast v8, Lkotlin/collections/IndexedValue;

    .line 2334
    .line 2335
    iget v10, v8, Lkotlin/collections/IndexedValue;->a:I

    .line 2336
    .line 2337
    iget-object v8, v8, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 2338
    .line 2339
    check-cast v8, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 2340
    .line 2341
    invoke-static {v10, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v10

    .line 2345
    check-cast v10, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 2346
    .line 2347
    invoke-static {v8, v10, v4, v0}, La/m8x;->y0(Lorg/xplatform/betting/core/zip/model/zip/BetZip;Lorg/xplatform/betting/core/zip/model/zip/BetZip;ZZ)La/chl0;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v8

    .line 2351
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2352
    .line 2353
    .line 2354
    const/16 v10, 0xa

    .line 2355
    .line 2356
    goto :goto_23

    .line 2357
    :cond_3e
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v3

    .line 2361
    new-instance v5, La/et6;

    .line 2362
    .line 2363
    invoke-direct {v5, v3, v1}, La/et6;-><init>(La/a4x;Ljava/lang/String;)V

    .line 2364
    .line 2365
    .line 2366
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2367
    .line 2368
    .line 2369
    move/from16 v3, p0

    .line 2370
    .line 2371
    move-object/from16 v1, v20

    .line 2372
    .line 2373
    goto :goto_22

    .line 2374
    :cond_3f
    invoke-static {}, La/q3d;->p()V

    .line 2375
    .line 2376
    .line 2377
    const/16 v17, 0x0

    .line 2378
    .line 2379
    throw v17

    .line 2380
    :cond_40
    const/16 v17, 0x0

    .line 2381
    .line 2382
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2383
    .line 2384
    .line 2385
    move-result-object v1

    .line 2386
    goto/16 :goto_21

    .line 2387
    .line 2388
    :goto_24
    invoke-direct/range {v18 .. v24}, La/ry20;-><init>(Ljava/lang/String;JLjava/lang/String;ZLa/a4x;)V

    .line 2389
    .line 2390
    .line 2391
    move-object/from16 v1, v18

    .line 2392
    .line 2393
    :goto_25
    if-eqz v1, :cond_41

    .line 2394
    .line 2395
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2396
    .line 2397
    .line 2398
    :cond_41
    move-object/from16 v1, p1

    .line 2399
    .line 2400
    move v7, v9

    .line 2401
    move-object/from16 v2, v26

    .line 2402
    .line 2403
    move-object/from16 v3, v27

    .line 2404
    .line 2405
    const/16 v5, 0xa

    .line 2406
    .line 2407
    const/4 v10, 0x1

    .line 2408
    goto/16 :goto_1c

    .line 2409
    .line 2410
    :cond_42
    invoke-static {}, La/q3d;->p()V

    .line 2411
    .line 2412
    .line 2413
    throw v17

    .line 2414
    :cond_43
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v0

    .line 2418
    return-object v0

    .line 2419
    :pswitch_13
    check-cast v0, La/po6;

    .line 2420
    .line 2421
    move-object/from16 v1, p1

    .line 2422
    .line 2423
    check-cast v1, Ljava/lang/Throwable;

    .line 2424
    .line 2425
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2426
    .line 2427
    .line 2428
    iget-object v0, v0, La/po6;->F:La/duj;

    .line 2429
    .line 2430
    new-instance v2, La/gh5;

    .line 2431
    .line 2432
    const/16 v3, 0x10

    .line 2433
    .line 2434
    invoke-direct {v2, v3}, La/gh5;-><init>(B)V

    .line 2435
    .line 2436
    .line 2437
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2438
    .line 2439
    .line 2440
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2441
    .line 2442
    return-object v0

    .line 2443
    :pswitch_14
    move-object v3, v0

    .line 2444
    check-cast v3, La/wn6;

    .line 2445
    .line 2446
    move-object/from16 v0, p1

    .line 2447
    .line 2448
    check-cast v0, La/ip6;

    .line 2449
    .line 2450
    sget-object v1, La/wn6;->V1:La/bj5;

    .line 2451
    .line 2452
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2453
    .line 2454
    .line 2455
    instance-of v1, v0, La/bp6;

    .line 2456
    .line 2457
    if-eqz v1, :cond_45

    .line 2458
    .line 2459
    check-cast v0, La/bp6;

    .line 2460
    .line 2461
    iget-boolean v1, v0, La/bp6;->a:Z

    .line 2462
    .line 2463
    iget-boolean v0, v0, La/bp6;->b:Z

    .line 2464
    .line 2465
    if-eqz v1, :cond_44

    .line 2466
    .line 2467
    new-instance v0, La/is6;

    .line 2468
    .line 2469
    invoke-direct {v0}, La/is6;-><init>()V

    .line 2470
    .line 2471
    .line 2472
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v1

    .line 2476
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2477
    .line 2478
    .line 2479
    invoke-static {v0, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 2480
    .line 2481
    .line 2482
    goto/16 :goto_26

    .line 2483
    .line 2484
    :cond_44
    sget-object v1, La/zp6;->m2:La/yk5;

    .line 2485
    .line 2486
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2487
    .line 2488
    .line 2489
    new-instance v1, La/zp6;

    .line 2490
    .line 2491
    invoke-direct {v1}, La/zp6;-><init>()V

    .line 2492
    .line 2493
    .line 2494
    sget-object v2, La/zp6;->n2:[La/iiy;

    .line 2495
    .line 2496
    const/16 v25, 0x1

    .line 2497
    .line 2498
    aget-object v2, v2, v25

    .line 2499
    .line 2500
    iget-object v4, v1, La/zp6;->k2:La/cgx0;

    .line 2501
    .line 2502
    invoke-virtual {v4, v1, v2, v0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 2503
    .line 2504
    .line 2505
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2506
    .line 2507
    .line 2508
    move-result-object v0

    .line 2509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2510
    .line 2511
    .line 2512
    invoke-static {v1, v0}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 2513
    .line 2514
    .line 2515
    goto/16 :goto_26

    .line 2516
    .line 2517
    :cond_45
    sget-object v1, La/cp6;->a:La/cp6;

    .line 2518
    .line 2519
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2520
    .line 2521
    .line 2522
    move-result v1

    .line 2523
    if-eqz v1, :cond_47

    .line 2524
    .line 2525
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v0

    .line 2529
    if-eqz v0, :cond_57

    .line 2530
    .line 2531
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 2532
    .line 2533
    .line 2534
    move-result-object v0

    .line 2535
    iget-object v1, v3, La/wn6;->P1:La/xi70;

    .line 2536
    .line 2537
    if-eqz v1, :cond_46

    .line 2538
    .line 2539
    invoke-static {v0}, La/xi70;->h(Landroidx/fragment/app/e;)V

    .line 2540
    .line 2541
    .line 2542
    goto/16 :goto_26

    .line 2543
    .line 2544
    :cond_46
    const-string v0, "quickBetDialogNavigator"

    .line 2545
    .line 2546
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2547
    .line 2548
    .line 2549
    const/16 v17, 0x0

    .line 2550
    .line 2551
    throw v17

    .line 2552
    :cond_47
    sget-object v1, La/dp6;->a:La/dp6;

    .line 2553
    .line 2554
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2555
    .line 2556
    .line 2557
    move-result v1

    .line 2558
    if-eqz v1, :cond_49

    .line 2559
    .line 2560
    iget-object v1, v3, La/wn6;->Q1:La/wdk0;

    .line 2561
    .line 2562
    if-eqz v1, :cond_48

    .line 2563
    .line 2564
    new-instance v2, La/xdk0;

    .line 2565
    .line 2566
    sget-object v5, La/qek0;->a:La/qek0;

    .line 2567
    .line 2568
    const v0, 0x7f130e86

    .line 2569
    .line 2570
    .line 2571
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2572
    .line 2573
    .line 2574
    move-result-object v6

    .line 2575
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2576
    .line 2577
    .line 2578
    const/4 v10, 0x0

    .line 2579
    const/16 v11, 0x7c

    .line 2580
    .line 2581
    const/4 v7, 0x0

    .line 2582
    const/4 v8, 0x0

    .line 2583
    const/4 v9, 0x0

    .line 2584
    move-object v4, v2

    .line 2585
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2586
    .line 2587
    .line 2588
    const/16 v8, 0x3fc

    .line 2589
    .line 2590
    const/4 v4, 0x0

    .line 2591
    const/4 v5, 0x0

    .line 2592
    const/4 v6, 0x0

    .line 2593
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2594
    .line 2595
    .line 2596
    goto/16 :goto_26

    .line 2597
    .line 2598
    :cond_48
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2599
    .line 2600
    .line 2601
    const/16 v17, 0x0

    .line 2602
    .line 2603
    throw v17

    .line 2604
    :cond_49
    instance-of v1, v0, La/gp6;

    .line 2605
    .line 2606
    if-eqz v1, :cond_4b

    .line 2607
    .line 2608
    sget-object v1, La/oxo0;->q2:La/s2m0;

    .line 2609
    .line 2610
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2611
    .line 2612
    .line 2613
    move-result-object v2

    .line 2614
    check-cast v0, La/gp6;

    .line 2615
    .line 2616
    iget-object v0, v0, La/gp6;->a:La/d9a0;

    .line 2617
    .line 2618
    iget v4, v0, La/d9a0;->a:I

    .line 2619
    .line 2620
    iget v5, v0, La/d9a0;->b:I

    .line 2621
    .line 2622
    iget v0, v0, La/d9a0;->f:I

    .line 2623
    .line 2624
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2625
    .line 2626
    .line 2627
    const-string v1, "TeamActionDialog"

    .line 2628
    .line 2629
    invoke-virtual {v2, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v6

    .line 2633
    if-eqz v6, :cond_4a

    .line 2634
    .line 2635
    goto/16 :goto_26

    .line 2636
    .line 2637
    :cond_4a
    new-instance v6, La/oxo0;

    .line 2638
    .line 2639
    invoke-direct {v6}, La/oxo0;-><init>()V

    .line 2640
    .line 2641
    .line 2642
    sget-object v8, La/oxo0;->r2:[La/iiy;

    .line 2643
    .line 2644
    const/16 v16, 0x0

    .line 2645
    .line 2646
    aget-object v10, v8, v16

    .line 2647
    .line 2648
    iget-object v11, v6, La/oxo0;->l2:La/phf0;

    .line 2649
    .line 2650
    const-string v12, "REQUEST_TEAM_ACTION_KEY_NEW"

    .line 2651
    .line 2652
    invoke-virtual {v11, v6, v10, v12}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 2653
    .line 2654
    .line 2655
    iget-object v10, v6, La/oxo0;->n2:La/zz2;

    .line 2656
    .line 2657
    aget-object v7, v8, v7

    .line 2658
    .line 2659
    invoke-virtual {v10, v6, v7, v4}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 2660
    .line 2661
    .line 2662
    iget-object v4, v6, La/oxo0;->o2:La/zz2;

    .line 2663
    .line 2664
    aget-object v7, v8, v9

    .line 2665
    .line 2666
    invoke-virtual {v4, v6, v7, v5}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 2667
    .line 2668
    .line 2669
    iget-object v4, v6, La/oxo0;->m2:La/zz2;

    .line 2670
    .line 2671
    const/16 v25, 0x1

    .line 2672
    .line 2673
    aget-object v5, v8, v25

    .line 2674
    .line 2675
    invoke-virtual {v4, v6, v5, v0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 2676
    .line 2677
    .line 2678
    invoke-virtual {v6, v2, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2679
    .line 2680
    .line 2681
    goto/16 :goto_26

    .line 2682
    .line 2683
    :cond_4b
    instance-of v1, v0, La/ep6;

    .line 2684
    .line 2685
    if-eqz v1, :cond_4c

    .line 2686
    .line 2687
    check-cast v0, La/ep6;

    .line 2688
    .line 2689
    iget-object v0, v0, La/ep6;->a:Ljava/lang/String;

    .line 2690
    .line 2691
    invoke-virtual {v3, v0}, La/wn6;->H0(Ljava/lang/String;)V

    .line 2692
    .line 2693
    .line 2694
    goto/16 :goto_26

    .line 2695
    .line 2696
    :cond_4c
    instance-of v1, v0, La/xo6;

    .line 2697
    .line 2698
    if-eqz v1, :cond_4d

    .line 2699
    .line 2700
    iget-object v1, v3, La/wn6;->S1:La/cgk0;

    .line 2701
    .line 2702
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 2703
    .line 2704
    .line 2705
    move-result v2

    .line 2706
    const/16 v25, 0x1

    .line 2707
    .line 2708
    add-int/lit8 v2, v2, 0x1

    .line 2709
    .line 2710
    invoke-virtual {v1, v2}, La/cgk0;->m(I)V

    .line 2711
    .line 2712
    .line 2713
    check-cast v0, La/xo6;

    .line 2714
    .line 2715
    iget-object v0, v0, La/xo6;->a:Ljava/lang/String;

    .line 2716
    .line 2717
    invoke-virtual {v3, v0}, La/wn6;->H0(Ljava/lang/String;)V

    .line 2718
    .line 2719
    .line 2720
    goto/16 :goto_26

    .line 2721
    .line 2722
    :cond_4d
    instance-of v1, v0, La/yo6;

    .line 2723
    .line 2724
    const v2, 0x7f1307bb

    .line 2725
    .line 2726
    .line 2727
    if-eqz v1, :cond_4f

    .line 2728
    .line 2729
    check-cast v0, La/yo6;

    .line 2730
    .line 2731
    iget-object v0, v0, La/yo6;->a:Ljava/lang/String;

    .line 2732
    .line 2733
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->S()Z

    .line 2734
    .line 2735
    .line 2736
    move-result v1

    .line 2737
    if-eqz v1, :cond_57

    .line 2738
    .line 2739
    iget-object v1, v3, La/wn6;->M1:La/ii;

    .line 2740
    .line 2741
    if-eqz v1, :cond_4e

    .line 2742
    .line 2743
    new-instance v18, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2744
    .line 2745
    invoke-virtual {v3, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2746
    .line 2747
    .line 2748
    move-result-object v19

    .line 2749
    const v2, 0x7f13115a

    .line 2750
    .line 2751
    .line 2752
    invoke-virtual {v3, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2753
    .line 2754
    .line 2755
    move-result-object v21

    .line 2756
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2757
    .line 2758
    .line 2759
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2760
    .line 2761
    .line 2762
    move-result-object v22

    .line 2763
    sget-object v27, La/n12;->b:La/n12;

    .line 2764
    .line 2765
    const/16 v28, 0x0

    .line 2766
    .line 2767
    const/16 v29, 0x5d0

    .line 2768
    .line 2769
    const/16 v23, 0x0

    .line 2770
    .line 2771
    const-string v24, "REQUEST_BALANCE_ERROR_DIALOG_KEY_NEW"

    .line 2772
    .line 2773
    const/16 v25, 0x0

    .line 2774
    .line 2775
    const/16 v26, 0x0

    .line 2776
    .line 2777
    move-object/from16 v20, v0

    .line 2778
    .line 2779
    invoke-direct/range {v18 .. v29}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2780
    .line 2781
    .line 2782
    move-object/from16 v0, v18

    .line 2783
    .line 2784
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v2

    .line 2788
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2789
    .line 2790
    .line 2791
    invoke-virtual {v1, v0, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2792
    .line 2793
    .line 2794
    goto/16 :goto_26

    .line 2795
    .line 2796
    :cond_4e
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2797
    .line 2798
    .line 2799
    const/16 v17, 0x0

    .line 2800
    .line 2801
    throw v17

    .line 2802
    :cond_4f
    instance-of v1, v0, La/zo6;

    .line 2803
    .line 2804
    const v5, 0x7f130e5d

    .line 2805
    .line 2806
    .line 2807
    if-eqz v1, :cond_51

    .line 2808
    .line 2809
    check-cast v0, La/zo6;

    .line 2810
    .line 2811
    iget-object v0, v0, La/zo6;->a:Ljava/lang/String;

    .line 2812
    .line 2813
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->S()Z

    .line 2814
    .line 2815
    .line 2816
    move-result v1

    .line 2817
    if-eqz v1, :cond_57

    .line 2818
    .line 2819
    iget-object v1, v3, La/wn6;->M1:La/ii;

    .line 2820
    .line 2821
    if-eqz v1, :cond_50

    .line 2822
    .line 2823
    new-instance v18, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2824
    .line 2825
    invoke-virtual {v3, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2826
    .line 2827
    .line 2828
    move-result-object v19

    .line 2829
    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2830
    .line 2831
    .line 2832
    move-result-object v21

    .line 2833
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2834
    .line 2835
    .line 2836
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2837
    .line 2838
    .line 2839
    move-result-object v22

    .line 2840
    sget-object v27, La/n12;->b:La/n12;

    .line 2841
    .line 2842
    const/16 v28, 0x0

    .line 2843
    .line 2844
    const/16 v29, 0x5d0

    .line 2845
    .line 2846
    const/16 v23, 0x0

    .line 2847
    .line 2848
    const-string v24, "REQUEST_BET_EXISTS_DIALOG_KEY_NEW"

    .line 2849
    .line 2850
    const/16 v25, 0x0

    .line 2851
    .line 2852
    const/16 v26, 0x0

    .line 2853
    .line 2854
    move-object/from16 v20, v0

    .line 2855
    .line 2856
    invoke-direct/range {v18 .. v29}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2857
    .line 2858
    .line 2859
    move-object/from16 v0, v18

    .line 2860
    .line 2861
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2862
    .line 2863
    .line 2864
    move-result-object v2

    .line 2865
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2866
    .line 2867
    .line 2868
    invoke-virtual {v1, v0, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2869
    .line 2870
    .line 2871
    goto/16 :goto_26

    .line 2872
    .line 2873
    :cond_50
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2874
    .line 2875
    .line 2876
    const/16 v17, 0x0

    .line 2877
    .line 2878
    throw v17

    .line 2879
    :cond_51
    instance-of v1, v0, La/ap6;

    .line 2880
    .line 2881
    if-eqz v1, :cond_53

    .line 2882
    .line 2883
    check-cast v0, La/ap6;

    .line 2884
    .line 2885
    iget-object v1, v0, La/ap6;->a:Ljava/lang/String;

    .line 2886
    .line 2887
    iget-object v0, v0, La/ap6;->b:Ljava/lang/String;

    .line 2888
    .line 2889
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->S()Z

    .line 2890
    .line 2891
    .line 2892
    move-result v2

    .line 2893
    if-eqz v2, :cond_57

    .line 2894
    .line 2895
    iget-object v2, v3, La/wn6;->M1:La/ii;

    .line 2896
    .line 2897
    if-eqz v2, :cond_52

    .line 2898
    .line 2899
    new-instance v18, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2900
    .line 2901
    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2902
    .line 2903
    .line 2904
    move-result-object v21

    .line 2905
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2906
    .line 2907
    .line 2908
    sget-object v27, La/n12;->b:La/n12;

    .line 2909
    .line 2910
    const/16 v28, 0x0

    .line 2911
    .line 2912
    const/16 v29, 0x5f8

    .line 2913
    .line 2914
    const/16 v22, 0x0

    .line 2915
    .line 2916
    const/16 v23, 0x0

    .line 2917
    .line 2918
    const/16 v24, 0x0

    .line 2919
    .line 2920
    const/16 v25, 0x0

    .line 2921
    .line 2922
    const/16 v26, 0x0

    .line 2923
    .line 2924
    move-object/from16 v20, v0

    .line 2925
    .line 2926
    move-object/from16 v19, v1

    .line 2927
    .line 2928
    invoke-direct/range {v18 .. v29}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2929
    .line 2930
    .line 2931
    move-object/from16 v0, v18

    .line 2932
    .line 2933
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2934
    .line 2935
    .line 2936
    move-result-object v1

    .line 2937
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2938
    .line 2939
    .line 2940
    invoke-virtual {v2, v0, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2941
    .line 2942
    .line 2943
    goto/16 :goto_26

    .line 2944
    .line 2945
    :cond_52
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2946
    .line 2947
    .line 2948
    const/16 v17, 0x0

    .line 2949
    .line 2950
    throw v17

    .line 2951
    :cond_53
    instance-of v1, v0, La/hp6;

    .line 2952
    .line 2953
    if-eqz v1, :cond_55

    .line 2954
    .line 2955
    check-cast v0, La/hp6;

    .line 2956
    .line 2957
    iget-boolean v0, v0, La/hp6;->a:Z

    .line 2958
    .line 2959
    if-eqz v0, :cond_54

    .line 2960
    .line 2961
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2962
    .line 2963
    .line 2964
    move-result-object v0

    .line 2965
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 2966
    .line 2967
    .line 2968
    goto/16 :goto_26

    .line 2969
    .line 2970
    :cond_54
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2971
    .line 2972
    .line 2973
    move-result-object v0

    .line 2974
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 2975
    .line 2976
    .line 2977
    goto/16 :goto_26

    .line 2978
    .line 2979
    :cond_55
    instance-of v1, v0, La/fp6;

    .line 2980
    .line 2981
    if-eqz v1, :cond_59

    .line 2982
    .line 2983
    check-cast v0, La/fp6;

    .line 2984
    .line 2985
    iget-object v1, v3, La/wn6;->O1:La/lgn0;

    .line 2986
    .line 2987
    if-eqz v1, :cond_58

    .line 2988
    .line 2989
    new-instance v2, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 2990
    .line 2991
    const v4, 0x7f13025d

    .line 2992
    .line 2993
    .line 2994
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2995
    .line 2996
    .line 2997
    move-result-object v4

    .line 2998
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2999
    .line 3000
    .line 3001
    const/4 v5, 0x0

    .line 3002
    invoke-direct {v2, v4, v5, v5, v5}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3003
    .line 3004
    .line 3005
    const v4, 0x7f130105

    .line 3006
    .line 3007
    .line 3008
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3009
    .line 3010
    .line 3011
    move-result-object v10

    .line 3012
    iget-object v11, v0, La/fp6;->a:Ljava/lang/String;

    .line 3013
    .line 3014
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 3015
    .line 3016
    .line 3017
    move-result-object v4

    .line 3018
    new-instance v5, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 3019
    .line 3020
    const v6, 0x7f130494

    .line 3021
    .line 3022
    .line 3023
    invoke-virtual {v3, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3024
    .line 3025
    .line 3026
    move-result-object v6

    .line 3027
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3028
    .line 3029
    .line 3030
    iget-object v7, v0, La/fp6;->d:Ljava/lang/String;

    .line 3031
    .line 3032
    invoke-direct {v5, v6, v7}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3033
    .line 3034
    .line 3035
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3036
    .line 3037
    .line 3038
    new-instance v17, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 3039
    .line 3040
    const v5, 0x7f130270

    .line 3041
    .line 3042
    .line 3043
    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3044
    .line 3045
    .line 3046
    move-result-object v19

    .line 3047
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3048
    .line 3049
    .line 3050
    sget-object v5, La/pn40;->a:La/pn40;

    .line 3051
    .line 3052
    iget-wide v5, v0, La/fp6;->c:D

    .line 3053
    .line 3054
    sget-object v7, La/p3u0;->c:La/p3u0;

    .line 3055
    .line 3056
    invoke-static {v5, v6, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 3057
    .line 3058
    .line 3059
    move-result-object v20

    .line 3060
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 3061
    .line 3062
    .line 3063
    move-result-object v5

    .line 3064
    const v6, 0x7f040b72

    .line 3065
    .line 3066
    .line 3067
    invoke-static {v6, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 3068
    .line 3069
    .line 3070
    move-result v18

    .line 3071
    iget-object v5, v0, La/fp6;->f:Ljava/lang/String;

    .line 3072
    .line 3073
    const/16 v22, 0x1

    .line 3074
    .line 3075
    move-object/from16 v21, v5

    .line 3076
    .line 3077
    invoke-direct/range {v17 .. v22}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3078
    .line 3079
    .line 3080
    move-object/from16 v5, v17

    .line 3081
    .line 3082
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3083
    .line 3084
    .line 3085
    iget-boolean v5, v0, La/fp6;->g:Z

    .line 3086
    .line 3087
    if-nez v5, :cond_56

    .line 3088
    .line 3089
    new-instance v17, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 3090
    .line 3091
    const v5, 0x7f1309eb

    .line 3092
    .line 3093
    .line 3094
    invoke-virtual {v3, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 3095
    .line 3096
    .line 3097
    move-result-object v5

    .line 3098
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3099
    .line 3100
    .line 3101
    const-string v6, ":"

    .line 3102
    .line 3103
    const/4 v7, 0x0

    .line 3104
    invoke-static {v5, v6, v8, v7}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 3105
    .line 3106
    .line 3107
    move-result-object v5

    .line 3108
    invoke-static {v5}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 3109
    .line 3110
    .line 3111
    move-result-object v5

    .line 3112
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 3113
    .line 3114
    .line 3115
    move-result-object v19

    .line 3116
    iget-wide v5, v0, La/fp6;->e:D

    .line 3117
    .line 3118
    invoke-static {v5, v6}, La/pn40;->o(D)Ljava/lang/String;

    .line 3119
    .line 3120
    .line 3121
    move-result-object v20

    .line 3122
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 3123
    .line 3124
    .line 3125
    move-result-object v5

    .line 3126
    const v6, 0x7f040aeb

    .line 3127
    .line 3128
    .line 3129
    invoke-static {v6, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 3130
    .line 3131
    .line 3132
    move-result v18

    .line 3133
    iget-object v5, v0, La/fp6;->f:Ljava/lang/String;

    .line 3134
    .line 3135
    const/16 v22, 0x0

    .line 3136
    .line 3137
    move-object/from16 v21, v5

    .line 3138
    .line 3139
    invoke-direct/range {v17 .. v22}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3140
    .line 3141
    .line 3142
    move-object/from16 v5, v17

    .line 3143
    .line 3144
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3145
    .line 3146
    .line 3147
    :cond_56
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3148
    .line 3149
    .line 3150
    move-result-object v15

    .line 3151
    iget-wide v4, v0, La/fp6;->b:J

    .line 3152
    .line 3153
    new-instance v9, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 3154
    .line 3155
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3156
    .line 3157
    .line 3158
    move-result-object v13

    .line 3159
    const-string v14, "SIMPLE"

    .line 3160
    .line 3161
    const-string v12, "REQUEST_SUCCESS_BET_KEY_NEW"

    .line 3162
    .line 3163
    invoke-direct/range {v9 .. v15}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 3164
    .line 3165
    .line 3166
    invoke-virtual {v1, v2, v9, v3}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 3167
    .line 3168
    .line 3169
    :cond_57
    :goto_26
    invoke-virtual {v3}, La/wn6;->G0()La/k3t0;

    .line 3170
    .line 3171
    .line 3172
    move-result-object v0

    .line 3173
    sget-object v1, La/dn6;->a:La/dn6;

    .line 3174
    .line 3175
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 3176
    .line 3177
    .line 3178
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3179
    .line 3180
    goto :goto_27

    .line 3181
    :cond_58
    const-string v0, "successBetAlertManager"

    .line 3182
    .line 3183
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 3184
    .line 3185
    .line 3186
    const/16 v17, 0x0

    .line 3187
    .line 3188
    throw v17

    .line 3189
    :cond_59
    invoke-static {}, La/t9f;->b()V

    .line 3190
    .line 3191
    .line 3192
    const/4 v12, 0x0

    .line 3193
    :goto_27
    return-object v12

    .line 3194
    :pswitch_15
    move-object v2, v0

    .line 3195
    check-cast v2, La/uwe;

    .line 3196
    .line 3197
    move-object/from16 v1, p1

    .line 3198
    .line 3199
    check-cast v1, La/cp;

    .line 3200
    .line 3201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3202
    .line 3203
    .line 3204
    new-instance v0, La/if6;

    .line 3205
    .line 3206
    const/4 v5, 0x0

    .line 3207
    move-object v3, v1

    .line 3208
    move-object v4, v2

    .line 3209
    invoke-direct/range {v0 .. v5}, La/if6;-><init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V

    .line 3210
    .line 3211
    .line 3212
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 3213
    .line 3214
    .line 3215
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3216
    .line 3217
    return-object v0

    .line 3218
    :pswitch_16
    check-cast v0, La/x6f;

    .line 3219
    .line 3220
    move-object/from16 v1, p1

    .line 3221
    .line 3222
    check-cast v1, La/cp;

    .line 3223
    .line 3224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3225
    .line 3226
    .line 3227
    new-instance v2, La/qo5;

    .line 3228
    .line 3229
    const/16 v3, 0xe

    .line 3230
    .line 3231
    invoke-direct {v2, v1, v0, v3}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3232
    .line 3233
    .line 3234
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 3235
    .line 3236
    .line 3237
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3238
    .line 3239
    return-object v0

    .line 3240
    :pswitch_17
    check-cast v0, La/gc6;

    .line 3241
    .line 3242
    move-object/from16 v1, p1

    .line 3243
    .line 3244
    check-cast v1, La/abi0;

    .line 3245
    .line 3246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3247
    .line 3248
    .line 3249
    sget-object v2, La/cbi0;->b:La/zai0;

    .line 3250
    .line 3251
    iget v0, v0, La/gc6;->i:I

    .line 3252
    .line 3253
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3254
    .line 3255
    .line 3256
    move-result-object v0

    .line 3257
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 3258
    .line 3259
    .line 3260
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3261
    .line 3262
    return-object v0

    .line 3263
    :pswitch_18
    check-cast v0, La/bxq0;

    .line 3264
    .line 3265
    move-object/from16 v1, p1

    .line 3266
    .line 3267
    check-cast v1, La/lwk;

    .line 3268
    .line 3269
    new-instance v1, La/ty2;

    .line 3270
    .line 3271
    invoke-direct {v1, v0, v3}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 3272
    .line 3273
    .line 3274
    return-object v1

    .line 3275
    :pswitch_19
    check-cast v0, La/v96;

    .line 3276
    .line 3277
    move-object/from16 v1, p1

    .line 3278
    .line 3279
    check-cast v1, La/lwk;

    .line 3280
    .line 3281
    new-instance v1, La/ty2;

    .line 3282
    .line 3283
    invoke-direct {v1, v0, v9}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 3284
    .line 3285
    .line 3286
    return-object v1

    .line 3287
    :pswitch_1a
    check-cast v0, La/oie;

    .line 3288
    .line 3289
    move-object/from16 v1, p1

    .line 3290
    .line 3291
    check-cast v1, La/abi0;

    .line 3292
    .line 3293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3294
    .line 3295
    .line 3296
    if-eqz v0, :cond_5a

    .line 3297
    .line 3298
    invoke-static {v1, v0}, La/yai0;->c(La/abi0;La/oie;)V

    .line 3299
    .line 3300
    .line 3301
    :cond_5a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3302
    .line 3303
    return-object v0

    .line 3304
    :pswitch_1b
    check-cast v0, La/d650;

    .line 3305
    .line 3306
    move-object/from16 v1, p1

    .line 3307
    .line 3308
    check-cast v1, Ljava/lang/Throwable;

    .line 3309
    .line 3310
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3311
    .line 3312
    .line 3313
    iget-object v2, v0, La/d650;->v:La/p7m0;

    .line 3314
    .line 3315
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3316
    .line 3317
    .line 3318
    sget-object v3, La/kv5;->a:La/kv5;

    .line 3319
    .line 3320
    const/4 v5, 0x0

    .line 3321
    invoke-virtual {v2, v5, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3322
    .line 3323
    .line 3324
    iget-object v0, v0, La/d650;->c:La/duj;

    .line 3325
    .line 3326
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 3327
    .line 3328
    .line 3329
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3330
    .line 3331
    return-object v0

    .line 3332
    :pswitch_1c
    move-object v5, v12

    .line 3333
    check-cast v0, La/qs5;

    .line 3334
    .line 3335
    move-object/from16 v1, p1

    .line 3336
    .line 3337
    check-cast v1, Ljava/lang/Throwable;

    .line 3338
    .line 3339
    iput-object v5, v0, La/qs5;->f:Ljava/lang/String;

    .line 3340
    .line 3341
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3342
    .line 3343
    return-object v0

    .line 3344
    nop

    .line 3345
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
