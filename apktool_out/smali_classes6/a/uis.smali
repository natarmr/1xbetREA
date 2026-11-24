.class public final synthetic La/uis;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uis;->a:B

    iput-object p1, p0, La/uis;->b:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/uis;->a:B

    .line 2
    .line 3
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 4
    .line 5
    sget-object v2, La/y5d;->a:La/y5d;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x4

    .line 11
    const/16 v6, 0x10

    .line 12
    .line 13
    const/4 v7, 0x6

    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    iget-object p0, p0, La/uis;->b:La/ugd;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p1, La/u63;

    .line 22
    .line 23
    check-cast p2, La/fet;

    .line 24
    .line 25
    check-cast p3, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    and-int/lit8 p1, p3, 0x11

    .line 35
    .line 36
    if-eq p1, v6, :cond_0

    .line 37
    .line 38
    move p1, v8

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move p1, v9

    .line 41
    :goto_0
    and-int/2addr p3, v8

    .line 42
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, v2, p2, p1}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_0
    check-cast p1, La/u63;

    .line 63
    .line 64
    check-cast p2, La/fet;

    .line 65
    .line 66
    check-cast p3, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    and-int/lit8 p1, p3, 0x11

    .line 76
    .line 77
    if-eq p1, v6, :cond_2

    .line 78
    .line 79
    move p1, v8

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move p1, v9

    .line 82
    :goto_2
    and-int/2addr p3, v8

    .line 83
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    sget-object p1, La/qmk;->a:La/zcl;

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    const/4 v7, 0x2

    .line 93
    sget-object v2, La/jm40;->b:La/jm40;

    .line 94
    .line 95
    const/high16 v3, 0x41000000    # 8.0f

    .line 96
    .line 97
    const/high16 v5, 0x41000000    # 8.0f

    .line 98
    .line 99
    const/high16 v6, 0x40c00000    # 6.0f

    .line 100
    .line 101
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    sget-object p3, La/uc9;->c:La/mw3;

    .line 106
    .line 107
    sget-object v0, La/gqw0;->m:La/xx7;

    .line 108
    .line 109
    invoke-static {p3, v0, p2, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    iget-wide v2, p2, La/fet;->T:J

    .line 114
    .line 115
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {p2, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, La/fet;->i0()V

    .line 133
    .line 134
    .line 135
    iget-boolean v3, p2, La/fet;->S:Z

    .line 136
    .line 137
    if-eqz v3, :cond_3

    .line 138
    .line 139
    invoke-virtual {p2, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_3
    invoke-virtual {p2}, La/fet;->r0()V

    .line 144
    .line 145
    .line 146
    :goto_3
    sget-object v1, La/gqw0;->x:La/shd;

    .line 147
    .line 148
    invoke-static {p2, p3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    sget-object p3, La/gqw0;->w:La/shd;

    .line 152
    .line 153
    invoke-static {p2, v2, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    sget-object v0, La/gqw0;->y:La/shd;

    .line 161
    .line 162
    invoke-static {p2, p3, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 166
    .line 167
    .line 168
    sget-object p3, La/gqw0;->v:La/shd;

    .line 169
    .line 170
    invoke-static {p2, p1, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v9, p0, p2, v8}, La/twn;->v(ILa/ugd;La/fet;Z)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_4
    invoke-virtual {p2}, La/fet;->X()V

    .line 178
    .line 179
    .line 180
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    check-cast p2, La/fet;

    .line 190
    .line 191
    check-cast p3, Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result p3

    .line 197
    and-int/lit8 v1, p3, 0x6

    .line 198
    .line 199
    if-nez v1, :cond_6

    .line 200
    .line 201
    invoke-virtual {p2, v0}, La/fet;->h(Z)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_5

    .line 206
    .line 207
    move v4, v5

    .line 208
    :cond_5
    or-int/2addr p3, v4

    .line 209
    :cond_6
    and-int/lit8 v0, p3, 0x13

    .line 210
    .line 211
    if-eq v0, v3, :cond_7

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_7
    move v8, v9

    .line 215
    :goto_5
    and-int/lit8 v0, p3, 0x1

    .line 216
    .line 217
    invoke-virtual {p2, v0, v8}, La/fet;->U(IZ)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_8

    .line 222
    .line 223
    and-int/lit8 p3, p3, 0xe

    .line 224
    .line 225
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object p3

    .line 229
    invoke-virtual {p0, p1, p2, p3}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_8
    invoke-virtual {p2}, La/fet;->X()V

    .line 234
    .line 235
    .line 236
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_2
    check-cast p1, La/u63;

    .line 240
    .line 241
    check-cast p2, La/fet;

    .line 242
    .line 243
    check-cast p3, Ljava/lang/Integer;

    .line 244
    .line 245
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 246
    .line 247
    .line 248
    move-result p3

    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    and-int/lit8 p1, p3, 0x11

    .line 253
    .line 254
    if-eq p1, v6, :cond_9

    .line 255
    .line 256
    move p1, v8

    .line 257
    goto :goto_7

    .line 258
    :cond_9
    move p1, v9

    .line 259
    :goto_7
    and-int/2addr p3, v8

    .line 260
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-eqz p1, :cond_a

    .line 265
    .line 266
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p0, p2, p1}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_a
    invoke-virtual {p2}, La/fet;->X()V

    .line 275
    .line 276
    .line 277
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_3
    check-cast p2, La/fet;

    .line 281
    .line 282
    check-cast p3, Ljava/lang/Integer;

    .line 283
    .line 284
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result p3

    .line 288
    and-int/lit8 v0, p3, 0x6

    .line 289
    .line 290
    if-nez v0, :cond_d

    .line 291
    .line 292
    and-int/lit8 v0, p3, 0x8

    .line 293
    .line 294
    if-nez v0, :cond_b

    .line 295
    .line 296
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    goto :goto_9

    .line 301
    :cond_b
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    :goto_9
    if-eqz v0, :cond_c

    .line 306
    .line 307
    move v4, v5

    .line 308
    :cond_c
    or-int/2addr p3, v4

    .line 309
    :cond_d
    and-int/lit8 v0, p3, 0x13

    .line 310
    .line 311
    if-eq v0, v3, :cond_e

    .line 312
    .line 313
    goto :goto_a

    .line 314
    :cond_e
    move v8, v9

    .line 315
    :goto_a
    and-int/lit8 v0, p3, 0x1

    .line 316
    .line 317
    invoke-virtual {p2, v0, v8}, La/fet;->U(IZ)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eqz v0, :cond_f

    .line 322
    .line 323
    and-int/lit8 p3, p3, 0xe

    .line 324
    .line 325
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object p3

    .line 329
    invoke-virtual {p0, p1, p2, p3}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    goto :goto_b

    .line 333
    :cond_f
    invoke-virtual {p2}, La/fet;->X()V

    .line 334
    .line 335
    .line 336
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object p0

    .line 339
    :pswitch_4
    check-cast p1, La/u63;

    .line 340
    .line 341
    check-cast p2, La/fet;

    .line 342
    .line 343
    check-cast p3, Ljava/lang/Integer;

    .line 344
    .line 345
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 346
    .line 347
    .line 348
    move-result p3

    .line 349
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    and-int/lit8 p1, p3, 0x11

    .line 353
    .line 354
    if-eq p1, v6, :cond_10

    .line 355
    .line 356
    move p1, v8

    .line 357
    goto :goto_c

    .line 358
    :cond_10
    move p1, v9

    .line 359
    :goto_c
    and-int/2addr p3, v8

    .line 360
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 361
    .line 362
    .line 363
    move-result p1

    .line 364
    if-eqz p1, :cond_12

    .line 365
    .line 366
    sget-object p1, La/uc9;->c:La/mw3;

    .line 367
    .line 368
    sget-object p3, La/gqw0;->m:La/xx7;

    .line 369
    .line 370
    invoke-static {p1, p3, p2, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    iget-wide v3, p2, La/fet;->T:J

    .line 375
    .line 376
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 377
    .line 378
    .line 379
    move-result p3

    .line 380
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    sget-object v3, La/jm40;->b:La/jm40;

    .line 385
    .line 386
    invoke-static {p2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 391
    .line 392
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    invoke-virtual {p2}, La/fet;->i0()V

    .line 396
    .line 397
    .line 398
    iget-boolean v4, p2, La/fet;->S:Z

    .line 399
    .line 400
    if-eqz v4, :cond_11

    .line 401
    .line 402
    invoke-virtual {p2, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 403
    .line 404
    .line 405
    goto :goto_d

    .line 406
    :cond_11
    invoke-virtual {p2}, La/fet;->r0()V

    .line 407
    .line 408
    .line 409
    :goto_d
    sget-object v1, La/gqw0;->x:La/shd;

    .line 410
    .line 411
    invoke-static {p2, p1, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 412
    .line 413
    .line 414
    sget-object p1, La/gqw0;->w:La/shd;

    .line 415
    .line 416
    invoke-static {p2, v0, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 417
    .line 418
    .line 419
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    sget-object p3, La/gqw0;->y:La/shd;

    .line 424
    .line 425
    invoke-static {p2, p1, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 426
    .line 427
    .line 428
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 429
    .line 430
    .line 431
    sget-object p1, La/gqw0;->v:La/shd;

    .line 432
    .line 433
    invoke-static {p2, v3, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 434
    .line 435
    .line 436
    invoke-static {v7, p0, v2, p2, v8}, La/vqd;->t(ILa/ugd;La/y5d;La/fet;Z)V

    .line 437
    .line 438
    .line 439
    goto :goto_e

    .line 440
    :cond_12
    invoke-virtual {p2}, La/fet;->X()V

    .line 441
    .line 442
    .line 443
    :goto_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object p0

    .line 446
    :pswitch_5
    check-cast p1, La/u63;

    .line 447
    .line 448
    check-cast p2, La/fet;

    .line 449
    .line 450
    check-cast p3, Ljava/lang/Integer;

    .line 451
    .line 452
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 453
    .line 454
    .line 455
    move-result p3

    .line 456
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    and-int/lit8 p1, p3, 0x11

    .line 460
    .line 461
    if-eq p1, v6, :cond_13

    .line 462
    .line 463
    move p1, v8

    .line 464
    goto :goto_f

    .line 465
    :cond_13
    move p1, v9

    .line 466
    :goto_f
    and-int/2addr p3, v8

    .line 467
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    if-eqz p1, :cond_14

    .line 472
    .line 473
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    invoke-virtual {p0, v2, p2, p1}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    goto :goto_10

    .line 481
    :cond_14
    invoke-virtual {p2}, La/fet;->X()V

    .line 482
    .line 483
    .line 484
    :goto_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object p0

    .line 487
    :pswitch_6
    check-cast p1, La/mm40;

    .line 488
    .line 489
    check-cast p2, La/fet;

    .line 490
    .line 491
    check-cast p3, Ljava/lang/Integer;

    .line 492
    .line 493
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 494
    .line 495
    .line 496
    move-result p3

    .line 497
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    and-int/lit8 v0, p3, 0x6

    .line 501
    .line 502
    if-nez v0, :cond_16

    .line 503
    .line 504
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-eqz v0, :cond_15

    .line 509
    .line 510
    move v4, v5

    .line 511
    :cond_15
    or-int/2addr p3, v4

    .line 512
    :cond_16
    and-int/lit8 v0, p3, 0x13

    .line 513
    .line 514
    if-eq v0, v3, :cond_17

    .line 515
    .line 516
    goto :goto_11

    .line 517
    :cond_17
    move v8, v9

    .line 518
    :goto_11
    and-int/lit8 v0, p3, 0x1

    .line 519
    .line 520
    invoke-virtual {p2, v0, v8}, La/fet;->U(IZ)Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_18

    .line 525
    .line 526
    and-int/lit8 p3, p3, 0xe

    .line 527
    .line 528
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 529
    .line 530
    .line 531
    move-result-object p3

    .line 532
    invoke-virtual {p0, p1, p2, p3}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    goto :goto_12

    .line 536
    :cond_18
    invoke-virtual {p2}, La/fet;->X()V

    .line 537
    .line 538
    .line 539
    :goto_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object p0

    .line 542
    :pswitch_7
    check-cast p1, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 543
    .line 544
    check-cast p2, La/fet;

    .line 545
    .line 546
    check-cast p3, Ljava/lang/Integer;

    .line 547
    .line 548
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 549
    .line 550
    .line 551
    move-result p3

    .line 552
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    and-int/lit8 v0, p3, 0x6

    .line 556
    .line 557
    if-nez v0, :cond_1b

    .line 558
    .line 559
    and-int/lit8 v0, p3, 0x8

    .line 560
    .line 561
    if-nez v0, :cond_19

    .line 562
    .line 563
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    goto :goto_13

    .line 568
    :cond_19
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    :goto_13
    if-eqz v0, :cond_1a

    .line 573
    .line 574
    move v4, v5

    .line 575
    :cond_1a
    or-int/2addr p3, v4

    .line 576
    :cond_1b
    and-int/lit8 v0, p3, 0x13

    .line 577
    .line 578
    if-eq v0, v3, :cond_1c

    .line 579
    .line 580
    goto :goto_14

    .line 581
    :cond_1c
    move v8, v9

    .line 582
    :goto_14
    and-int/lit8 v0, p3, 0x1

    .line 583
    .line 584
    invoke-virtual {p2, v0, v8}, La/fet;->U(IZ)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-eqz v0, :cond_1d

    .line 589
    .line 590
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 591
    .line 592
    shl-int/lit8 p3, p3, 0x3

    .line 593
    .line 594
    and-int/lit8 p3, p3, 0x70

    .line 595
    .line 596
    or-int/2addr p3, v7

    .line 597
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    move-result-object p3

    .line 601
    invoke-virtual {p0, v0, p1, p2, p3}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    goto :goto_15

    .line 605
    :cond_1d
    invoke-virtual {p2}, La/fet;->X()V

    .line 606
    .line 607
    .line 608
    :goto_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 609
    .line 610
    return-object p0

    .line 611
    :pswitch_8
    check-cast p1, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 612
    .line 613
    check-cast p2, La/fet;

    .line 614
    .line 615
    check-cast p3, Ljava/lang/Integer;

    .line 616
    .line 617
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 618
    .line 619
    .line 620
    move-result p3

    .line 621
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    and-int/lit8 v0, p3, 0x6

    .line 625
    .line 626
    if-nez v0, :cond_1f

    .line 627
    .line 628
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    if-eqz v0, :cond_1e

    .line 633
    .line 634
    move v4, v5

    .line 635
    :cond_1e
    or-int/2addr p3, v4

    .line 636
    :cond_1f
    and-int/lit8 v0, p3, 0x13

    .line 637
    .line 638
    if-eq v0, v3, :cond_20

    .line 639
    .line 640
    goto :goto_16

    .line 641
    :cond_20
    move v8, v9

    .line 642
    :goto_16
    and-int/lit8 v0, p3, 0x1

    .line 643
    .line 644
    invoke-virtual {p2, v0, v8}, La/fet;->U(IZ)Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    if-eqz v0, :cond_21

    .line 649
    .line 650
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 651
    .line 652
    shl-int/lit8 p3, p3, 0x3

    .line 653
    .line 654
    and-int/lit8 p3, p3, 0x70

    .line 655
    .line 656
    or-int/2addr p3, v7

    .line 657
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 658
    .line 659
    .line 660
    move-result-object p3

    .line 661
    invoke-virtual {p0, v0, p1, p2, p3}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    goto :goto_17

    .line 665
    :cond_21
    invoke-virtual {p2}, La/fet;->X()V

    .line 666
    .line 667
    .line 668
    :goto_17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 669
    .line 670
    return-object p0

    .line 671
    :pswitch_data_0
    .packed-switch 0x0
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
