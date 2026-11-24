.class public final synthetic La/a13;
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
    iput-byte p2, p0, La/a13;->a:B

    iput-object p1, p0, La/a13;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/a13;->a:B

    .line 2
    .line 3
    const v1, 0x7f130e55

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const-string v3, "Cannot create dependency "

    .line 8
    .line 9
    const-class v4, La/ldv0;

    .line 10
    .line 11
    const-string v5, "viewModelFactory"

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    iget-object p0, p0, La/a13;->b:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, La/xo4;

    .line 20
    .line 21
    iget-wide v0, p0, La/xo4;->e:D

    .line 22
    .line 23
    double-to-float p0, v0

    .line 24
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p0, La/jo4;

    .line 30
    .line 31
    new-instance v3, La/wul;

    .line 32
    .line 33
    sget-object v4, La/lul;->e:La/lul;

    .line 34
    .line 35
    sget-object v5, La/oe9;->a:La/oe9;

    .line 36
    .line 37
    new-instance v6, La/ue9;

    .line 38
    .line 39
    iget-object p0, p0, La/jo4;->b:La/ctf0;

    .line 40
    .line 41
    new-array v0, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 44
    .line 45
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {v6, p0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v7, 0x1

    .line 59
    invoke-direct/range {v3 .. v9}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 60
    .line 61
    .line 62
    return-object v3

    .line 63
    :pswitch_1
    check-cast p0, La/qk4;

    .line 64
    .line 65
    sget-object v0, La/qk4;->i2:La/jdk0;

    .line 66
    .line 67
    iget-object p0, p0, La/qk4;->e2:La/fiu0;

    .line 68
    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v6

    .line 76
    :pswitch_2
    check-cast p0, La/pk4;

    .line 77
    .line 78
    sget-object v0, La/pk4;->f2:La/hfk0;

    .line 79
    .line 80
    iget-object p0, p0, La/pk4;->c2:La/fiu0;

    .line 81
    .line 82
    if-eqz p0, :cond_1

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_1
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v6

    .line 89
    :pswitch_3
    check-cast p0, La/pg4;

    .line 90
    .line 91
    new-instance v0, La/df4;

    .line 92
    .line 93
    iget-object p0, p0, La/pg4;->b:La/ctf0;

    .line 94
    .line 95
    new-array v1, v2, [Ljava/lang/Object;

    .line 96
    .line 97
    iget-object v3, p0, La/ctf0;->b:La/lsm0;

    .line 98
    .line 99
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const v4, 0x7f13019e

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-array v3, v2, [Ljava/lang/Object;

    .line 111
    .line 112
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 113
    .line 114
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const v3, 0x7f130166

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-direct {v0, v1, p0}, La/df4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_4
    check-cast p0, La/qb4;

    .line 130
    .line 131
    new-instance v3, La/wul;

    .line 132
    .line 133
    sget-object v4, La/lul;->e:La/lul;

    .line 134
    .line 135
    sget-object v5, La/oe9;->a:La/oe9;

    .line 136
    .line 137
    new-instance v6, La/ue9;

    .line 138
    .line 139
    iget-object p0, p0, La/qb4;->b:La/ctf0;

    .line 140
    .line 141
    new-array v0, v2, [Ljava/lang/Object;

    .line 142
    .line 143
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 144
    .line 145
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-direct {v6, p0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const/4 v8, 0x0

    .line 157
    const/4 v9, 0x0

    .line 158
    const/4 v7, 0x1

    .line 159
    invoke-direct/range {v3 .. v9}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 160
    .line 161
    .line 162
    return-object v3

    .line 163
    :pswitch_5
    check-cast p0, La/ob4;

    .line 164
    .line 165
    iget-boolean p0, p0, La/ob4;->c:Z

    .line 166
    .line 167
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :pswitch_6
    check-cast p0, La/b84;

    .line 173
    .line 174
    sget-object v0, La/b84;->P1:La/gfk0;

    .line 175
    .line 176
    iget-object p0, p0, La/b84;->L1:La/fiu0;

    .line 177
    .line 178
    if-eqz p0, :cond_2

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v6

    .line 185
    :pswitch_7
    check-cast p0, La/u910;

    .line 186
    .line 187
    invoke-virtual {p0}, La/u910;->f()F

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0

    .line 196
    :pswitch_8
    check-cast p0, [Ljava/lang/Object;

    .line 197
    .line 198
    invoke-static {p0}, La/hp4;->J([Ljava/lang/Object;)La/y2;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_9
    check-cast p0, La/us3;

    .line 204
    .line 205
    iget-object p0, p0, La/us3;->a:La/us00;

    .line 206
    .line 207
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    const-string v0, "-user-agent/1xbet-prod-v260.1.0"

    .line 212
    .line 213
    invoke-static {p0, v0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_a
    check-cast p0, La/chf0;

    .line 219
    .line 220
    iget-object p0, p0, La/chf0;->b:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p0, La/gii0;

    .line 223
    .line 224
    const-class v0, La/kp3;

    .line 225
    .line 226
    sget-object v1, La/sre0;->a:La/tre0;

    .line 227
    .line 228
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    check-cast p0, La/kp3;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_b
    check-cast p0, La/wp3;

    .line 240
    .line 241
    sget-object v0, La/wp3;->O1:[La/iiy;

    .line 242
    .line 243
    iget-object p0, p0, La/wp3;->L1:La/fiu0;

    .line 244
    .line 245
    if-eqz p0, :cond_3

    .line 246
    .line 247
    return-object p0

    .line 248
    :cond_3
    const-string p0, "appleFortuneViewModelFactory"

    .line 249
    .line 250
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v6

    .line 254
    :pswitch_c
    check-cast p0, La/zo3;

    .line 255
    .line 256
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 257
    .line 258
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    check-cast p0, Landroid/app/Application;

    .line 266
    .line 267
    instance-of v0, p0, La/af3;

    .line 268
    .line 269
    if-eqz v0, :cond_4

    .line 270
    .line 271
    check-cast p0, La/af3;

    .line 272
    .line 273
    goto :goto_0

    .line 274
    :cond_4
    move-object p0, v6

    .line 275
    :goto_0
    if-eqz p0, :cond_7

    .line 276
    .line 277
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-virtual {p0, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, La/o5d0;

    .line 286
    .line 287
    if-eqz p0, :cond_5

    .line 288
    .line 289
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    check-cast p0, La/ze3;

    .line 294
    .line 295
    goto :goto_1

    .line 296
    :cond_5
    move-object p0, v6

    .line 297
    :goto_1
    instance-of v0, p0, La/ldv0;

    .line 298
    .line 299
    if-nez v0, :cond_6

    .line 300
    .line 301
    move-object p0, v6

    .line 302
    :cond_6
    check-cast p0, La/ldv0;

    .line 303
    .line 304
    if-eqz p0, :cond_7

    .line 305
    .line 306
    invoke-virtual {p0}, La/ldv0;->a()La/rzi;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    goto :goto_2

    .line 311
    :cond_7
    invoke-static {v4, v3}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    :goto_2
    return-object v6

    .line 319
    :pswitch_d
    check-cast p0, La/ap3;

    .line 320
    .line 321
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 322
    .line 323
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    check-cast p0, Landroid/app/Application;

    .line 331
    .line 332
    instance-of v0, p0, La/af3;

    .line 333
    .line 334
    if-eqz v0, :cond_8

    .line 335
    .line 336
    check-cast p0, La/af3;

    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_8
    move-object p0, v6

    .line 340
    :goto_3
    if-eqz p0, :cond_b

    .line 341
    .line 342
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-virtual {p0, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    check-cast p0, La/o5d0;

    .line 351
    .line 352
    if-eqz p0, :cond_9

    .line 353
    .line 354
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    check-cast p0, La/ze3;

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_9
    move-object p0, v6

    .line 362
    :goto_4
    instance-of v0, p0, La/ldv0;

    .line 363
    .line 364
    if-nez v0, :cond_a

    .line 365
    .line 366
    move-object p0, v6

    .line 367
    :cond_a
    check-cast p0, La/ldv0;

    .line 368
    .line 369
    if-eqz p0, :cond_b

    .line 370
    .line 371
    invoke-virtual {p0}, La/ldv0;->a()La/rzi;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    goto :goto_5

    .line 376
    :cond_b
    invoke-static {v4, v3}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    :goto_5
    return-object v6

    .line 384
    :pswitch_e
    check-cast p0, La/zo3;

    .line 385
    .line 386
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 387
    .line 388
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    check-cast p0, Landroid/app/Application;

    .line 396
    .line 397
    instance-of v0, p0, La/af3;

    .line 398
    .line 399
    if-eqz v0, :cond_c

    .line 400
    .line 401
    check-cast p0, La/af3;

    .line 402
    .line 403
    goto :goto_6

    .line 404
    :cond_c
    move-object p0, v6

    .line 405
    :goto_6
    if-eqz p0, :cond_f

    .line 406
    .line 407
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    invoke-virtual {p0, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    check-cast p0, La/o5d0;

    .line 416
    .line 417
    if-eqz p0, :cond_d

    .line 418
    .line 419
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    check-cast p0, La/ze3;

    .line 424
    .line 425
    goto :goto_7

    .line 426
    :cond_d
    move-object p0, v6

    .line 427
    :goto_7
    instance-of v0, p0, La/ldv0;

    .line 428
    .line 429
    if-nez v0, :cond_e

    .line 430
    .line 431
    move-object p0, v6

    .line 432
    :cond_e
    check-cast p0, La/ldv0;

    .line 433
    .line 434
    if-eqz p0, :cond_f

    .line 435
    .line 436
    invoke-virtual {p0}, La/ldv0;->a()La/rzi;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    goto :goto_8

    .line 441
    :cond_f
    invoke-static {v4, v3}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    :goto_8
    return-object v6

    .line 449
    :pswitch_f
    check-cast p0, La/xo3;

    .line 450
    .line 451
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 452
    .line 453
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    check-cast p0, Landroid/app/Application;

    .line 461
    .line 462
    instance-of v0, p0, La/af3;

    .line 463
    .line 464
    if-eqz v0, :cond_10

    .line 465
    .line 466
    check-cast p0, La/af3;

    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_10
    move-object p0, v6

    .line 470
    :goto_9
    if-eqz p0, :cond_13

    .line 471
    .line 472
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 473
    .line 474
    .line 475
    move-result-object p0

    .line 476
    invoke-virtual {p0, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    check-cast p0, La/o5d0;

    .line 481
    .line 482
    if-eqz p0, :cond_11

    .line 483
    .line 484
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    check-cast p0, La/ze3;

    .line 489
    .line 490
    goto :goto_a

    .line 491
    :cond_11
    move-object p0, v6

    .line 492
    :goto_a
    instance-of v0, p0, La/ldv0;

    .line 493
    .line 494
    if-nez v0, :cond_12

    .line 495
    .line 496
    move-object p0, v6

    .line 497
    :cond_12
    check-cast p0, La/ldv0;

    .line 498
    .line 499
    if-eqz p0, :cond_13

    .line 500
    .line 501
    invoke-virtual {p0}, La/ldv0;->a()La/rzi;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    goto :goto_b

    .line 506
    :cond_13
    invoke-static {v4, v3}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    :goto_b
    return-object v6

    .line 514
    :pswitch_10
    check-cast p0, La/tn3;

    .line 515
    .line 516
    sget-object v0, La/tn3;->c2:La/hfk0;

    .line 517
    .line 518
    iget-object p0, p0, La/tn3;->Y1:La/fiu0;

    .line 519
    .line 520
    if-eqz p0, :cond_14

    .line 521
    .line 522
    return-object p0

    .line 523
    :cond_14
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    throw v6

    .line 527
    :pswitch_11
    check-cast p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;

    .line 528
    .line 529
    sget v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/AppUpdateScreenLayout;->A:I

    .line 530
    .line 531
    new-instance v0, La/abk0;

    .line 532
    .line 533
    invoke-direct {v0, p0}, La/abk0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 534
    .line 535
    .line 536
    return-object v0

    .line 537
    :pswitch_12
    check-cast p0, La/dg3;

    .line 538
    .line 539
    new-instance v0, Landroid/widget/ImageView;

    .line 540
    .line 541
    iget-object p0, p0, La/dg3;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 542
    .line 543
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 548
    .line 549
    .line 550
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 555
    .line 556
    .line 557
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 558
    .line 559
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 560
    .line 561
    .line 562
    const/16 v1, 0x8

    .line 563
    .line 564
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 565
    .line 566
    .line 567
    new-instance v1, La/a3e;

    .line 568
    .line 569
    invoke-direct {v1, v2, v2}, La/a3e;-><init>(II)V

    .line 570
    .line 571
    .line 572
    iput v2, v1, La/a3e;->i:I

    .line 573
    .line 574
    iput v2, v1, La/a3e;->l:I

    .line 575
    .line 576
    iput v2, v1, La/a3e;->t:I

    .line 577
    .line 578
    iput v2, v1, La/a3e;->v:I

    .line 579
    .line 580
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 581
    .line 582
    .line 583
    return-object v0

    .line 584
    :pswitch_13
    check-cast p0, La/zf3;

    .line 585
    .line 586
    iget-object p0, p0, La/zf3;->a:La/us00;

    .line 587
    .line 588
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    const-string v0, "android_id"

    .line 593
    .line 594
    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object p0

    .line 598
    const-string v0, "_2"

    .line 599
    .line 600
    invoke-static {p0, v0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object p0

    .line 604
    return-object p0

    .line 605
    :pswitch_14
    check-cast p0, La/ya3;

    .line 606
    .line 607
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 608
    .line 609
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 610
    .line 611
    .line 612
    move-result-object p0

    .line 613
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    check-cast p0, Landroid/app/Application;

    .line 617
    .line 618
    instance-of v0, p0, La/af3;

    .line 619
    .line 620
    if-eqz v0, :cond_15

    .line 621
    .line 622
    check-cast p0, La/af3;

    .line 623
    .line 624
    goto :goto_c

    .line 625
    :cond_15
    move-object p0, v6

    .line 626
    :goto_c
    if-eqz p0, :cond_18

    .line 627
    .line 628
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 629
    .line 630
    .line 631
    move-result-object p0

    .line 632
    invoke-virtual {p0, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object p0

    .line 636
    check-cast p0, La/o5d0;

    .line 637
    .line 638
    if-eqz p0, :cond_16

    .line 639
    .line 640
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object p0

    .line 644
    check-cast p0, La/ze3;

    .line 645
    .line 646
    goto :goto_d

    .line 647
    :cond_16
    move-object p0, v6

    .line 648
    :goto_d
    instance-of v0, p0, La/ldv0;

    .line 649
    .line 650
    if-nez v0, :cond_17

    .line 651
    .line 652
    move-object p0, v6

    .line 653
    :cond_17
    check-cast p0, La/ldv0;

    .line 654
    .line 655
    if-eqz p0, :cond_18

    .line 656
    .line 657
    invoke-virtual {p0}, La/ldv0;->a()La/rzi;

    .line 658
    .line 659
    .line 660
    move-result-object v6

    .line 661
    goto :goto_e

    .line 662
    :cond_18
    invoke-static {v4, v3}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object p0

    .line 666
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    :goto_e
    return-object v6

    .line 670
    :pswitch_15
    check-cast p0, La/q93;

    .line 671
    .line 672
    sget-object v0, La/q93;->Q1:La/pek0;

    .line 673
    .line 674
    iget-object p0, p0, La/q93;->L1:La/fiu0;

    .line 675
    .line 676
    if-eqz p0, :cond_19

    .line 677
    .line 678
    return-object p0

    .line 679
    :cond_19
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    throw v6

    .line 683
    :pswitch_16
    check-cast p0, La/y63;

    .line 684
    .line 685
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->i:I

    .line 686
    .line 687
    invoke-virtual {p0}, La/y63;->run()V

    .line 688
    .line 689
    .line 690
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 691
    .line 692
    return-object p0

    .line 693
    :pswitch_17
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;

    .line 694
    .line 695
    new-instance v0, Ljava/lang/StringBuilder;

    .line 696
    .line 697
    iget-byte p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->a:B

    .line 698
    .line 699
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 700
    .line 701
    .line 702
    return-object v0

    .line 703
    :pswitch_18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 704
    .line 705
    return-object p0

    .line 706
    :pswitch_19
    check-cast p0, La/v4q0;

    .line 707
    .line 708
    invoke-interface {p0}, La/v4q0;->G()La/u4q0;

    .line 709
    .line 710
    .line 711
    move-result-object p0

    .line 712
    return-object p0

    .line 713
    :pswitch_1a
    check-cast p0, La/r13;

    .line 714
    .line 715
    iget-object v0, p0, La/r13;->a:La/ehf0;

    .line 716
    .line 717
    iget-object p0, p0, La/r13;->b:Ljava/lang/String;

    .line 718
    .line 719
    invoke-virtual {v0, p0}, La/ehf0;->a(Ljava/lang/String;)La/qpg0;

    .line 720
    .line 721
    .line 722
    move-result-object p0

    .line 723
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    new-instance p0, Ljava/lang/ClassCastException;

    .line 727
    .line 728
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 729
    .line 730
    .line 731
    throw p0

    .line 732
    :pswitch_1b
    check-cast p0, La/p13;

    .line 733
    .line 734
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 735
    .line 736
    .line 737
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 738
    .line 739
    return-object p0

    .line 740
    :pswitch_1c
    check-cast p0, La/c13;

    .line 741
    .line 742
    iget-object p0, p0, La/c13;->c:La/vne;

    .line 743
    .line 744
    invoke-static {p0, v6}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 745
    .line 746
    .line 747
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 748
    .line 749
    return-object p0

    .line 750
    nop

    .line 751
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
