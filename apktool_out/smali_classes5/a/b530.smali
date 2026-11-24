.class public final synthetic La/b530;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/k050;La/j050;)V
    .locals 0

    .line 1
    const/16 p2, 0xe

    iput-byte p2, p0, La/b530;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b530;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/b530;->a:B

    iput-object p1, p0, La/b530;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b530;->a:B

    .line 4
    .line 5
    const/16 v2, 0x15

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, ""

    .line 11
    .line 12
    const/16 v6, 0xa

    .line 13
    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x6

    .line 16
    const/4 v10, 0x1

    .line 17
    const/4 v11, 0x0

    .line 18
    iget-object v0, v0, La/b530;->b:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v0, La/g0o;

    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/cmc;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, La/g0o;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iput-object v0, v1, La/cmc;->b:Ljava/util/List;

    .line 40
    .line 41
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    check-cast v0, La/w560;

    .line 45
    .line 46
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, La/i560;

    .line 49
    .line 50
    sget-object v2, La/w560;->Q1:La/uuz;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, La/w560;->G0()La/k3t0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_1
    check-cast v0, La/vy40;

    .line 66
    .line 67
    move-object/from16 v1, p1

    .line 68
    .line 69
    check-cast v1, La/km40;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_2
    check-cast v0, La/uw50;

    .line 78
    .line 79
    move-object/from16 v1, p1

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Throwable;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v2, v0, La/uw50;->b:La/duj;

    .line 87
    .line 88
    new-instance v3, La/rj50;

    .line 89
    .line 90
    const/16 v4, 0x8

    .line 91
    .line 92
    invoke-direct {v3, v4}, La/rj50;-><init>(B)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, La/uw50;->c:La/p7m0;

    .line 99
    .line 100
    new-instance v2, La/sw50;

    .line 101
    .line 102
    iget-object v0, v0, La/uw50;->h:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v3, v0

    .line 105
    check-cast v3, La/sa10;

    .line 106
    .line 107
    sget-object v4, La/pb10;->g:La/pb10;

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    const/16 v8, 0x1c

    .line 111
    .line 112
    const v5, 0x7f130677

    .line 113
    .line 114
    .line 115
    const/4 v6, 0x0

    .line 116
    invoke-static/range {v3 .. v8}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {v2, v0}, La/sw50;-><init>(La/ra10;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v11, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_3
    check-cast v0, La/wu50;

    .line 133
    .line 134
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, Ljava/lang/Throwable;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v0, v0, La/wu50;->A:La/duj;

    .line 142
    .line 143
    new-instance v2, La/rj50;

    .line 144
    .line 145
    invoke-direct {v2, v8}, La/rj50;-><init>(B)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_4
    check-cast v0, La/ut50;

    .line 155
    .line 156
    move-object/from16 v1, p1

    .line 157
    .line 158
    check-cast v1, Ljava/lang/Throwable;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    instance-of v2, v1, Ljava/net/SocketTimeoutException;

    .line 164
    .line 165
    if-nez v2, :cond_1

    .line 166
    .line 167
    instance-of v1, v1, Ljava/net/UnknownHostException;

    .line 168
    .line 169
    if-eqz v1, :cond_0

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_0
    const/4 v9, 0x0

    .line 173
    goto :goto_1

    .line 174
    :cond_1
    :goto_0
    move v9, v10

    .line 175
    :goto_1
    iget-object v1, v0, La/ut50;->u:La/p7m0;

    .line 176
    .line 177
    new-instance v2, La/mt50;

    .line 178
    .line 179
    iget-object v3, v0, La/ut50;->n:La/sa10;

    .line 180
    .line 181
    sget-object v4, La/pb10;->g:La/pb10;

    .line 182
    .line 183
    const/4 v7, 0x0

    .line 184
    const/16 v8, 0x1c

    .line 185
    .line 186
    const v5, 0x7f130677

    .line 187
    .line 188
    .line 189
    const/4 v6, 0x0

    .line 190
    invoke-static/range {v3 .. v8}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-direct {v2, v0, v9}, La/mt50;-><init>(La/ra10;Z)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v11, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_5
    check-cast v0, La/cs50;

    .line 207
    .line 208
    move-object/from16 v1, p1

    .line 209
    .line 210
    check-cast v1, Ljava/lang/Throwable;

    .line 211
    .line 212
    iput-object v11, v0, La/cs50;->w:Ljava/lang/String;

    .line 213
    .line 214
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_6
    check-cast v0, La/zr50;

    .line 218
    .line 219
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, Ljava/lang/Throwable;

    .line 222
    .line 223
    iput-object v11, v0, La/zr50;->y:Ljava/lang/Object;

    .line 224
    .line 225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object v0

    .line 228
    :pswitch_7
    check-cast v0, La/wr50;

    .line 229
    .line 230
    move-object/from16 v1, p1

    .line 231
    .line 232
    check-cast v1, La/bt5;

    .line 233
    .line 234
    sget-object v2, La/wr50;->S1:La/wsz;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    iget-object v0, v0, La/wr50;->M1:La/kiu0;

    .line 240
    .line 241
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, La/ut50;

    .line 246
    .line 247
    iget-object v2, v0, La/ut50;->d:La/yo4;

    .line 248
    .line 249
    sget-object v3, La/uo5;->b:La/kj5;

    .line 250
    .line 251
    iget v4, v1, La/bt5;->a:I

    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {v4}, La/kj5;->f(I)La/uo5;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    sget-object v5, La/pt50;->a:[I

    .line 261
    .line 262
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    aget v3, v5, v3

    .line 267
    .line 268
    if-ne v3, v10, :cond_2

    .line 269
    .line 270
    invoke-virtual {v2}, La/yo4;->k()V

    .line 271
    .line 272
    .line 273
    :cond_2
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    const-string v5, "actions"

    .line 278
    .line 279
    invoke-virtual {v2, v3, v5}, La/yo4;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    iget-object v2, v0, La/ut50;->e:La/x20;

    .line 283
    .line 284
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    sget-object v4, La/y1p;->c:La/y1p;

    .line 289
    .line 290
    invoke-virtual {v2, v3, v4}, La/x20;->k(Ljava/lang/Integer;La/y1p;)V

    .line 291
    .line 292
    .line 293
    iget-object v2, v0, La/ut50;->l:La/i1w0;

    .line 294
    .line 295
    new-instance v3, La/rw40;

    .line 296
    .line 297
    const/16 v4, 0xf

    .line 298
    .line 299
    invoke-direct {v3, v0, v1, v4}, La/rw40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 303
    .line 304
    .line 305
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_8
    check-cast v0, La/sq50;

    .line 309
    .line 310
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, Ljava/lang/Throwable;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget-object v0, v0, La/sq50;->v:La/duj;

    .line 318
    .line 319
    new-instance v2, La/rj50;

    .line 320
    .line 321
    invoke-direct {v2, v7}, La/rj50;-><init>(B)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 325
    .line 326
    .line 327
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_9
    check-cast v0, La/mu40;

    .line 331
    .line 332
    move-object/from16 v1, p1

    .line 333
    .line 334
    check-cast v1, La/sj50;

    .line 335
    .line 336
    iget-object v1, v1, La/sj50;->b:La/mu40;

    .line 337
    .line 338
    if-eq v1, v0, :cond_3

    .line 339
    .line 340
    const/4 v9, 0x0

    .line 341
    goto :goto_2

    .line 342
    :cond_3
    move v9, v10

    .line 343
    :goto_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    return-object v0

    .line 348
    :pswitch_a
    check-cast v0, La/mf50;

    .line 349
    .line 350
    move-object/from16 v1, p1

    .line 351
    .line 352
    check-cast v1, La/c8d;

    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    iget-object v1, v1, La/c8d;->b:La/g1w0;

    .line 358
    .line 359
    if-eqz v1, :cond_1a

    .line 360
    .line 361
    instance-of v2, v1, La/w0w0;

    .line 362
    .line 363
    const-string v3, ")"

    .line 364
    .line 365
    if-eqz v2, :cond_4

    .line 366
    .line 367
    check-cast v1, La/w0w0;

    .line 368
    .line 369
    iget-object v0, v1, La/w0w0;->a:La/m7h0;

    .line 370
    .line 371
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const-string v1, "Navigate("

    .line 376
    .line 377
    :goto_3
    invoke-static {v1, v0, v3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v11

    .line 381
    goto/16 :goto_4

    .line 382
    .line 383
    :cond_4
    instance-of v2, v1, La/d1w0;

    .line 384
    .line 385
    if-eqz v2, :cond_5

    .line 386
    .line 387
    check-cast v1, La/d1w0;

    .line 388
    .line 389
    iget-object v0, v1, La/d1w0;->a:La/m7h0;

    .line 390
    .line 391
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    const-string v1, "Replace("

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_5
    instance-of v2, v1, La/y0w0;

    .line 399
    .line 400
    if-eqz v2, :cond_6

    .line 401
    .line 402
    check-cast v1, La/y0w0;

    .line 403
    .line 404
    iget-object v0, v1, La/y0w0;->a:La/m7h0;

    .line 405
    .line 406
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    const-string v1, "NewRoot("

    .line 411
    .line 412
    goto :goto_3

    .line 413
    :cond_6
    instance-of v2, v1, La/p0w0;

    .line 414
    .line 415
    if-eqz v2, :cond_7

    .line 416
    .line 417
    const-string v11, "Back"

    .line 418
    .line 419
    goto/16 :goto_4

    .line 420
    .line 421
    :cond_7
    instance-of v2, v1, La/q0w0;

    .line 422
    .line 423
    if-eqz v2, :cond_a

    .line 424
    .line 425
    check-cast v1, La/q0w0;

    .line 426
    .line 427
    iget-object v0, v1, La/q0w0;->a:La/m7h0;

    .line 428
    .line 429
    if-eqz v0, :cond_8

    .line 430
    .line 431
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    if-nez v0, :cond_9

    .line 436
    .line 437
    :cond_8
    const-string v0, "root"

    .line 438
    .line 439
    :cond_9
    const-string v1, "BackTo("

    .line 440
    .line 441
    goto :goto_3

    .line 442
    :cond_a
    instance-of v2, v1, La/r0w0;

    .line 443
    .line 444
    if-eqz v2, :cond_b

    .line 445
    .line 446
    const-string v11, "BackToAuthorization"

    .line 447
    .line 448
    goto/16 :goto_4

    .line 449
    .line 450
    :cond_b
    instance-of v2, v1, La/x0w0;

    .line 451
    .line 452
    if-eqz v2, :cond_c

    .line 453
    .line 454
    check-cast v1, La/x0w0;

    .line 455
    .line 456
    iget-object v8, v1, La/x0w0;->a:Ljava/util/List;

    .line 457
    .line 458
    new-instance v12, La/mb50;

    .line 459
    .line 460
    invoke-direct {v12, v0, v7}, La/mb50;-><init>(La/mf50;B)V

    .line 461
    .line 462
    .line 463
    const/16 v13, 0x1f

    .line 464
    .line 465
    const/4 v9, 0x0

    .line 466
    const/4 v10, 0x0

    .line 467
    const/4 v11, 0x0

    .line 468
    invoke-static/range {v8 .. v13}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const-string v1, "NewChain("

    .line 473
    .line 474
    goto :goto_3

    .line 475
    :cond_c
    instance-of v0, v1, La/f1w0;

    .line 476
    .line 477
    if-eqz v0, :cond_d

    .line 478
    .line 479
    check-cast v1, La/f1w0;

    .line 480
    .line 481
    iget-object v0, v1, La/f1w0;->a:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 482
    .line 483
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    const-string v1, "StartChildChain("

    .line 488
    .line 489
    goto :goto_3

    .line 490
    :cond_d
    instance-of v0, v1, La/u0w0;

    .line 491
    .line 492
    if-eqz v0, :cond_e

    .line 493
    .line 494
    const-string v11, "FinishChildChain"

    .line 495
    .line 496
    goto/16 :goto_4

    .line 497
    .line 498
    :cond_e
    instance-of v0, v1, La/v0w0;

    .line 499
    .line 500
    if-eqz v0, :cond_f

    .line 501
    .line 502
    const-string v11, "FinishRoot"

    .line 503
    .line 504
    goto/16 :goto_4

    .line 505
    .line 506
    :cond_f
    instance-of v0, v1, La/z0w0;

    .line 507
    .line 508
    if-eqz v0, :cond_10

    .line 509
    .line 510
    check-cast v1, La/z0w0;

    .line 511
    .line 512
    iget-object v0, v1, La/z0w0;->a:Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 513
    .line 514
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    const-string v1, "NewRootCurrentChildChain("

    .line 519
    .line 520
    goto/16 :goto_3

    .line 521
    .line 522
    :cond_10
    instance-of v0, v1, La/s0w0;

    .line 523
    .line 524
    if-eqz v0, :cond_11

    .line 525
    .line 526
    check-cast v1, La/s0w0;

    .line 527
    .line 528
    iget-object v0, v1, La/s0w0;->a:Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 529
    .line 530
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    const-string v1, "BackToOrNavigate("

    .line 535
    .line 536
    goto/16 :goto_3

    .line 537
    .line 538
    :cond_11
    instance-of v0, v1, La/e1w0;

    .line 539
    .line 540
    if-eqz v0, :cond_12

    .line 541
    .line 542
    check-cast v1, La/e1w0;

    .line 543
    .line 544
    iget-object v0, v1, La/e1w0;->a:Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 545
    .line 546
    invoke-static {v0}, La/mf50;->f(La/m7h0;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    const-string v1, "Show("

    .line 551
    .line 552
    goto/16 :goto_3

    .line 553
    .line 554
    :cond_12
    instance-of v0, v1, La/t0w0;

    .line 555
    .line 556
    if-eqz v0, :cond_13

    .line 557
    .line 558
    const-string v11, "DismissCurrent"

    .line 559
    .line 560
    goto :goto_4

    .line 561
    :cond_13
    instance-of v0, v1, La/c1w0;

    .line 562
    .line 563
    if-eqz v0, :cond_14

    .line 564
    .line 565
    check-cast v1, La/c1w0;

    .line 566
    .line 567
    iget-object v0, v1, La/c1w0;->a:La/lwv0;

    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    sget-object v1, La/sre0;->a:La/tre0;

    .line 574
    .line 575
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    const-string v1, "OpenBottomSheet("

    .line 584
    .line 585
    goto/16 :goto_3

    .line 586
    .line 587
    :cond_14
    instance-of v0, v1, La/n0w0;

    .line 588
    .line 589
    if-eqz v0, :cond_15

    .line 590
    .line 591
    const-string v11, "OpenLogin"

    .line 592
    .line 593
    goto :goto_4

    .line 594
    :cond_15
    instance-of v0, v1, La/o0w0;

    .line 595
    .line 596
    if-eqz v0, :cond_16

    .line 597
    .line 598
    const-string v11, "OpenRegistration"

    .line 599
    .line 600
    goto :goto_4

    .line 601
    :cond_16
    instance-of v0, v1, La/m0w0;

    .line 602
    .line 603
    if-eqz v0, :cond_17

    .line 604
    .line 605
    const-string v11, "CompleteAuthorization"

    .line 606
    .line 607
    goto :goto_4

    .line 608
    :cond_17
    instance-of v0, v1, La/l0w0;

    .line 609
    .line 610
    if-eqz v0, :cond_18

    .line 611
    .line 612
    const-string v11, "CancelAuthorization"

    .line 613
    .line 614
    goto :goto_4

    .line 615
    :cond_18
    instance-of v0, v1, La/a1w0;

    .line 616
    .line 617
    if-eqz v0, :cond_19

    .line 618
    .line 619
    const-string v11, "Action"

    .line 620
    .line 621
    goto :goto_4

    .line 622
    :cond_19
    instance-of v0, v1, La/b1w0;

    .line 623
    .line 624
    if-eqz v0, :cond_1a

    .line 625
    .line 626
    const-string v11, "SuspendAction"

    .line 627
    .line 628
    goto :goto_4

    .line 629
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 630
    .line 631
    .line 632
    :goto_4
    return-object v11

    .line 633
    :pswitch_b
    check-cast v0, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 634
    .line 635
    move-object/from16 v1, p1

    .line 636
    .line 637
    check-cast v1, La/lf50;

    .line 638
    .line 639
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    new-instance v2, La/vul0;

    .line 643
    .line 644
    invoke-direct {v2, v0}, La/vul0;-><init>(La/m7h0;)V

    .line 645
    .line 646
    .line 647
    iget-object v0, v1, La/lf50;->b:La/re50;

    .line 648
    .line 649
    iget-object v3, v1, La/lf50;->a:Ljava/util/List;

    .line 650
    .line 651
    if-eqz v0, :cond_1b

    .line 652
    .line 653
    sget-object v3, La/iun;->a:La/iun;

    .line 654
    .line 655
    invoke-static {v0, v2, v3, v10}, La/re50;->d(La/re50;La/wul0;Ljava/util/List;I)La/re50;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    const/4 v2, 0x5

    .line 660
    invoke-static {v1, v11, v0, v11, v2}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 661
    .line 662
    .line 663
    move-result-object v11

    .line 664
    goto :goto_6

    .line 665
    :cond_1b
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    instance-of v4, v0, La/ve50;

    .line 670
    .line 671
    if-nez v4, :cond_1c

    .line 672
    .line 673
    move-object v0, v11

    .line 674
    :cond_1c
    check-cast v0, La/ve50;

    .line 675
    .line 676
    if-nez v0, :cond_1d

    .line 677
    .line 678
    move-object v11, v1

    .line 679
    goto :goto_6

    .line 680
    :cond_1d
    instance-of v4, v0, La/se50;

    .line 681
    .line 682
    if-eqz v4, :cond_1e

    .line 683
    .line 684
    sget-object v0, La/iun;->a:La/iun;

    .line 685
    .line 686
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    new-instance v4, La/se50;

    .line 690
    .line 691
    invoke-direct {v4, v2, v0}, La/se50;-><init>(La/wul0;Ljava/util/List;)V

    .line 692
    .line 693
    .line 694
    goto :goto_5

    .line 695
    :cond_1e
    instance-of v4, v0, La/re50;

    .line 696
    .line 697
    if-eqz v4, :cond_1f

    .line 698
    .line 699
    check-cast v0, La/re50;

    .line 700
    .line 701
    sget-object v4, La/iun;->a:La/iun;

    .line 702
    .line 703
    invoke-static {v0, v2, v4, v10}, La/re50;->d(La/re50;La/wul0;Ljava/util/List;I)La/re50;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    goto :goto_5

    .line 708
    :cond_1f
    instance-of v0, v0, La/ue50;

    .line 709
    .line 710
    if-eqz v0, :cond_20

    .line 711
    .line 712
    new-instance v4, La/ue50;

    .line 713
    .line 714
    invoke-direct {v4, v2}, La/ue50;-><init>(La/wul0;)V

    .line 715
    .line 716
    .line 717
    :goto_5
    invoke-static {v10, v3}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-static {v1, v0, v11, v11, v8}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 726
    .line 727
    .line 728
    move-result-object v11

    .line 729
    goto :goto_6

    .line 730
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 731
    .line 732
    .line 733
    :goto_6
    return-object v11

    .line 734
    :pswitch_c
    check-cast v0, La/gf50;

    .line 735
    .line 736
    move-object/from16 v1, p1

    .line 737
    .line 738
    check-cast v1, La/jf50;

    .line 739
    .line 740
    iget-object v0, v0, La/gf50;->a:La/pz40;

    .line 741
    .line 742
    check-cast v0, La/hgk0;

    .line 743
    .line 744
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 748
    .line 749
    return-object v0

    .line 750
    :pswitch_d
    check-cast v0, La/qzn;

    .line 751
    .line 752
    move-object/from16 v1, p1

    .line 753
    .line 754
    check-cast v1, La/rb50;

    .line 755
    .line 756
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0, v1}, La/qzn;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    check-cast v0, La/ob50;

    .line 764
    .line 765
    new-instance v2, La/ob50;

    .line 766
    .line 767
    iget-object v3, v0, La/ob50;->b:Ljava/lang/Object;

    .line 768
    .line 769
    iget-object v4, v0, La/ob50;->c:Ljava/util/Map;

    .line 770
    .line 771
    new-instance v5, La/p0z;

    .line 772
    .line 773
    const/16 v6, 0x12

    .line 774
    .line 775
    invoke-direct {v5, v0, v6}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 776
    .line 777
    .line 778
    new-instance v0, La/ugd;

    .line 779
    .line 780
    const v6, 0x5705fb0f

    .line 781
    .line 782
    .line 783
    invoke-direct {v0, v6, v10, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    invoke-direct {v2, v1, v3, v4, v0}, La/ob50;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;La/ugd;)V

    .line 787
    .line 788
    .line 789
    return-object v2

    .line 790
    :pswitch_e
    check-cast v0, La/k050;

    .line 791
    .line 792
    move-object/from16 v1, p1

    .line 793
    .line 794
    check-cast v1, Ljava/lang/Throwable;

    .line 795
    .line 796
    invoke-virtual {v0, v11}, La/k050;->c(Ljava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 800
    .line 801
    return-object v0

    .line 802
    :pswitch_f
    check-cast v0, La/sje;

    .line 803
    .line 804
    move-object/from16 v1, p1

    .line 805
    .line 806
    check-cast v1, Ljava/io/File;

    .line 807
    .line 808
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    new-instance v2, La/lw40;

    .line 812
    .line 813
    iget-object v0, v0, La/sje;->a:Lkotlin/coroutines/CoroutineContext;

    .line 814
    .line 815
    invoke-direct {v2, v0, v1}, La/lw40;-><init>(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V

    .line 816
    .line 817
    .line 818
    return-object v2

    .line 819
    :pswitch_10
    check-cast v0, La/wl40;

    .line 820
    .line 821
    move-object/from16 v1, p1

    .line 822
    .line 823
    check-cast v1, La/lwk;

    .line 824
    .line 825
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 826
    .line 827
    .line 828
    new-instance v1, La/ty2;

    .line 829
    .line 830
    const/16 v2, 0xe

    .line 831
    .line 832
    invoke-direct {v1, v0, v2}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 833
    .line 834
    .line 835
    return-object v1

    .line 836
    :pswitch_11
    check-cast v0, La/rwm0;

    .line 837
    .line 838
    move-object/from16 v1, p1

    .line 839
    .line 840
    check-cast v1, La/abi0;

    .line 841
    .line 842
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    iget-boolean v0, v0, La/rwm0;->e:Z

    .line 846
    .line 847
    invoke-static {v1, v0}, La/yai0;->f(La/abi0;Z)V

    .line 848
    .line 849
    .line 850
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 851
    .line 852
    return-object v0

    .line 853
    :pswitch_12
    check-cast v0, La/gfg;

    .line 854
    .line 855
    move-object/from16 v1, p1

    .line 856
    .line 857
    check-cast v1, Ljava/util/List;

    .line 858
    .line 859
    iget-object v2, v0, La/gfg;->c:La/ctf0;

    .line 860
    .line 861
    iget-object v0, v0, La/gfg;->g:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, La/yc40;

    .line 864
    .line 865
    iget-boolean v0, v0, La/yc40;->f:Z

    .line 866
    .line 867
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    if-nez v1, :cond_21

    .line 871
    .line 872
    sget-object v0, La/iun;->a:La/iun;

    .line 873
    .line 874
    goto/16 :goto_14

    .line 875
    .line 876
    :cond_21
    new-instance v3, Ljava/util/ArrayList;

    .line 877
    .line 878
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 879
    .line 880
    .line 881
    move-result v4

    .line 882
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 883
    .line 884
    .line 885
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    const/4 v4, 0x0

    .line 890
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 891
    .line 892
    .line 893
    move-result v7

    .line 894
    if-eqz v7, :cond_32

    .line 895
    .line 896
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v7

    .line 900
    add-int/lit8 v8, v4, 0x1

    .line 901
    .line 902
    if-ltz v4, :cond_31

    .line 903
    .line 904
    check-cast v7, La/qb40;

    .line 905
    .line 906
    new-instance v12, La/ub40;

    .line 907
    .line 908
    iget-object v13, v7, La/qb40;->b:Ljava/lang/String;

    .line 909
    .line 910
    invoke-static {v4, v13}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v4

    .line 914
    iget v13, v7, La/qb40;->a:I

    .line 915
    .line 916
    int-to-long v13, v13

    .line 917
    iget-object v15, v7, La/qb40;->b:Ljava/lang/String;

    .line 918
    .line 919
    move-object/from16 v25, v11

    .line 920
    .line 921
    new-instance v11, La/n0x;

    .line 922
    .line 923
    iget-object v10, v7, La/qb40;->c:Ljava/lang/String;

    .line 924
    .line 925
    invoke-direct {v11, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    iget-object v10, v7, La/qb40;->g:La/qc40;

    .line 929
    .line 930
    iget-object v10, v10, La/qc40;->c:Ljava/util/List;

    .line 931
    .line 932
    new-instance v9, Ljava/util/ArrayList;

    .line 933
    .line 934
    move/from16 v19, v0

    .line 935
    .line 936
    invoke-static {v10, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 941
    .line 942
    .line 943
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 948
    .line 949
    .line 950
    move-result v10

    .line 951
    if-eqz v10, :cond_22

    .line 952
    .line 953
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v10

    .line 957
    check-cast v10, La/uc40;

    .line 958
    .line 959
    new-instance v6, La/ja40;

    .line 960
    .line 961
    move-object/from16 p0, v0

    .line 962
    .line 963
    iget-object v0, v10, La/uc40;->a:Ljava/lang/String;

    .line 964
    .line 965
    move-object/from16 p1, v1

    .line 966
    .line 967
    new-instance v1, La/n0x;

    .line 968
    .line 969
    iget-object v10, v10, La/uc40;->c:Ljava/lang/String;

    .line 970
    .line 971
    invoke-direct {v1, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    invoke-direct {v6, v1, v0}, La/ja40;-><init>(La/n0x;Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    move-object/from16 v0, p0

    .line 981
    .line 982
    move-object/from16 v1, p1

    .line 983
    .line 984
    const/16 v6, 0xa

    .line 985
    .line 986
    goto :goto_8

    .line 987
    :cond_22
    move-object/from16 p1, v1

    .line 988
    .line 989
    invoke-static {v9}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 990
    .line 991
    .line 992
    move-result-object v23

    .line 993
    const/4 v0, 0x0

    .line 994
    new-array v1, v0, [Ljava/lang/Object;

    .line 995
    .line 996
    iget-object v6, v2, La/ctf0;->b:La/lsm0;

    .line 997
    .line 998
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    const v0, 0x7f1313af

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v6, v0, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    iget v1, v7, La/qb40;->d:I

    .line 1010
    .line 1011
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v1

    .line 1015
    new-instance v9, Ljava/text/DecimalFormat;

    .line 1016
    .line 1017
    new-instance v10, Ljava/text/DecimalFormatSymbols;

    .line 1018
    .line 1019
    move-object/from16 p0, v0

    .line 1020
    .line 1021
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1022
    .line 1023
    invoke-direct {v10, v0}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 1024
    .line 1025
    .line 1026
    move-object/from16 v26, v2

    .line 1027
    .line 1028
    const-string v2, "#.##"

    .line 1029
    .line 1030
    invoke-direct {v9, v2, v10}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v9, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1038
    .line 1039
    .line 1040
    const/4 v2, 0x0

    .line 1041
    new-array v9, v2, [Ljava/lang/Object;

    .line 1042
    .line 1043
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v9

    .line 1047
    const v2, 0x7f131809

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v6, v2, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v20

    .line 1054
    iget v2, v7, La/qb40;->e:I

    .line 1055
    .line 1056
    iget v9, v7, La/qb40;->f:I

    .line 1057
    .line 1058
    if-gtz v2, :cond_23

    .line 1059
    .line 1060
    move-object/from16 v21, v1

    .line 1061
    .line 1062
    move-object v0, v5

    .line 1063
    :goto_9
    const/4 v2, 0x0

    .line 1064
    goto :goto_a

    .line 1065
    :cond_23
    int-to-double v9, v9

    .line 1066
    move-object/from16 v21, v1

    .line 1067
    .line 1068
    int-to-double v1, v2

    .line 1069
    div-double/2addr v9, v1

    .line 1070
    new-instance v1, Ljava/text/DecimalFormat;

    .line 1071
    .line 1072
    new-instance v2, Ljava/text/DecimalFormatSymbols;

    .line 1073
    .line 1074
    invoke-direct {v2, v0}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 1075
    .line 1076
    .line 1077
    const-string v0, "#.##%"

    .line 1078
    .line 1079
    invoke-direct {v1, v0, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v1, v9, v10}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1087
    .line 1088
    .line 1089
    goto :goto_9

    .line 1090
    :goto_a
    new-array v1, v2, [Ljava/lang/Object;

    .line 1091
    .line 1092
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    const v2, 0x7f130615

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v6, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v22

    .line 1103
    iget-object v1, v7, La/qb40;->h:Ljava/util/List;

    .line 1104
    .line 1105
    invoke-static {v1}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2

    .line 1109
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1114
    .line 1115
    .line 1116
    move-result v7

    .line 1117
    if-eqz v7, :cond_25

    .line 1118
    .line 1119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v7

    .line 1123
    move-object v9, v7

    .line 1124
    check-cast v9, La/gb40;

    .line 1125
    .line 1126
    move-object v10, v0

    .line 1127
    move-object/from16 v16, v1

    .line 1128
    .line 1129
    iget-wide v0, v9, La/gb40;->b:J

    .line 1130
    .line 1131
    const-wide/16 v17, 0x0

    .line 1132
    .line 1133
    cmp-long v0, v0, v17

    .line 1134
    .line 1135
    if-ltz v0, :cond_24

    .line 1136
    .line 1137
    iget-object v0, v9, La/gb40;->d:La/hb40;

    .line 1138
    .line 1139
    iget-object v0, v0, La/hb40;->d:Ljava/lang/String;

    .line 1140
    .line 1141
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1142
    .line 1143
    .line 1144
    move-result v0

    .line 1145
    if-lez v0, :cond_24

    .line 1146
    .line 1147
    iget-object v0, v9, La/gb40;->e:La/hb40;

    .line 1148
    .line 1149
    iget-object v0, v0, La/hb40;->d:Ljava/lang/String;

    .line 1150
    .line 1151
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1152
    .line 1153
    .line 1154
    move-result v0

    .line 1155
    if-lez v0, :cond_24

    .line 1156
    .line 1157
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    :cond_24
    move-object v0, v10

    .line 1161
    move-object/from16 v1, v16

    .line 1162
    .line 1163
    goto :goto_b

    .line 1164
    :cond_25
    move-object v10, v0

    .line 1165
    new-instance v0, Ljava/util/ArrayList;

    .line 1166
    .line 1167
    const/16 v1, 0xa

    .line 1168
    .line 1169
    invoke-static {v2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1170
    .line 1171
    .line 1172
    move-result v7

    .line 1173
    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v1

    .line 1180
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v2

    .line 1184
    if-eqz v2, :cond_30

    .line 1185
    .line 1186
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    check-cast v2, La/gb40;

    .line 1191
    .line 1192
    move-wide/from16 v16, v13

    .line 1193
    .line 1194
    iget-wide v13, v2, La/gb40;->b:J

    .line 1195
    .line 1196
    iget-object v7, v2, La/gb40;->e:La/hb40;

    .line 1197
    .line 1198
    move-object v9, v15

    .line 1199
    iget-object v15, v2, La/gb40;->c:Ljava/lang/String;

    .line 1200
    .line 1201
    sget-object v18, La/mc6;->b:La/yk5;

    .line 1202
    .line 1203
    move-object/from16 v24, v1

    .line 1204
    .line 1205
    iget v1, v2, La/gb40;->f:I

    .line 1206
    .line 1207
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v1

    .line 1211
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    .line 1213
    .line 1214
    invoke-static {v1}, La/yk5;->d(Ljava/lang/Integer;)La/mc6;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v1

    .line 1218
    iget-byte v1, v1, La/mc6;->a:B

    .line 1219
    .line 1220
    move/from16 v18, v1

    .line 1221
    .line 1222
    new-instance v1, La/pa40;

    .line 1223
    .line 1224
    move/from16 v27, v8

    .line 1225
    .line 1226
    new-instance v8, La/n0x;

    .line 1227
    .line 1228
    move-object/from16 v28, v9

    .line 1229
    .line 1230
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1231
    .line 1232
    move-object/from16 v29, v10

    .line 1233
    .line 1234
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1235
    .line 1236
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    iget-object v2, v2, La/gb40;->d:La/hb40;

    .line 1240
    .line 1241
    iget-object v10, v2, La/hb40;->b:Ljava/util/List;

    .line 1242
    .line 1243
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v10

    .line 1247
    check-cast v10, Ljava/lang/String;

    .line 1248
    .line 1249
    if-nez v10, :cond_26

    .line 1250
    .line 1251
    move-object v10, v5

    .line 1252
    :cond_26
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 1253
    .line 1254
    .line 1255
    move-result v30

    .line 1256
    move-object/from16 v31, v11

    .line 1257
    .line 1258
    const-string v11, "/"

    .line 1259
    .line 1260
    move-object/from16 v32, v12

    .line 1261
    .line 1262
    const-string v12, "https://"

    .line 1263
    .line 1264
    move-wide/from16 v33, v13

    .line 1265
    .line 1266
    if-nez v30, :cond_27

    .line 1267
    .line 1268
    const/4 v14, 0x0

    .line 1269
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_f

    .line 1273
    :cond_27
    const/4 v14, 0x0

    .line 1274
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 1275
    .line 1276
    invoke-static {v10, v13, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1277
    .line 1278
    .line 1279
    move-result v13

    .line 1280
    if-nez v13, :cond_2a

    .line 1281
    .line 1282
    invoke-static {v10, v12, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v13

    .line 1286
    if-eqz v13, :cond_28

    .line 1287
    .line 1288
    const/4 v14, 0x0

    .line 1289
    goto :goto_e

    .line 1290
    :cond_28
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 1291
    .line 1292
    .line 1293
    move-result v13

    .line 1294
    if-lez v13, :cond_29

    .line 1295
    .line 1296
    invoke-static {v9, v11}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v13

    .line 1300
    if-nez v13, :cond_29

    .line 1301
    .line 1302
    const/16 v13, 0x2f

    .line 1303
    .line 1304
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1305
    .line 1306
    .line 1307
    move/from16 v30, v13

    .line 1308
    .line 1309
    const/4 v14, 0x1

    .line 1310
    goto :goto_d

    .line 1311
    :cond_29
    const/4 v14, 0x1

    .line 1312
    const/16 v30, 0x2f

    .line 1313
    .line 1314
    :goto_d
    new-array v13, v14, [C

    .line 1315
    .line 1316
    const/4 v14, 0x0

    .line 1317
    aput-char v30, v13, v14

    .line 1318
    .line 1319
    invoke-static {v10, v13}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v10

    .line 1323
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1324
    .line 1325
    .line 1326
    goto :goto_f

    .line 1327
    :cond_2a
    :goto_e
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1331
    .line 1332
    .line 1333
    :goto_f
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v9

    .line 1337
    invoke-direct {v8, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    iget-object v9, v2, La/hb40;->d:Ljava/lang/String;

    .line 1341
    .line 1342
    iget v10, v2, La/hb40;->c:I

    .line 1343
    .line 1344
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v10

    .line 1348
    iget v2, v2, La/hb40;->e:I

    .line 1349
    .line 1350
    invoke-direct {v1, v8, v9, v10, v2}, La/pa40;-><init>(La/n0x;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1351
    .line 1352
    .line 1353
    new-instance v2, La/pa40;

    .line 1354
    .line 1355
    new-instance v8, La/n0x;

    .line 1356
    .line 1357
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1358
    .line 1359
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 1360
    .line 1361
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1362
    .line 1363
    .line 1364
    iget-object v10, v7, La/hb40;->b:Ljava/util/List;

    .line 1365
    .line 1366
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v10

    .line 1370
    check-cast v10, Ljava/lang/String;

    .line 1371
    .line 1372
    if-nez v10, :cond_2b

    .line 1373
    .line 1374
    move-object v10, v5

    .line 1375
    :cond_2b
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 1376
    .line 1377
    .line 1378
    move-result v13

    .line 1379
    if-nez v13, :cond_2c

    .line 1380
    .line 1381
    const/4 v14, 0x0

    .line 1382
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1383
    .line 1384
    .line 1385
    goto :goto_13

    .line 1386
    :cond_2c
    const/4 v14, 0x0

    .line 1387
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 1388
    .line 1389
    invoke-static {v10, v13, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v13

    .line 1393
    if-nez v13, :cond_2f

    .line 1394
    .line 1395
    invoke-static {v10, v12, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1396
    .line 1397
    .line 1398
    move-result v12

    .line 1399
    if-eqz v12, :cond_2d

    .line 1400
    .line 1401
    const/4 v14, 0x0

    .line 1402
    goto :goto_12

    .line 1403
    :cond_2d
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 1404
    .line 1405
    .line 1406
    move-result v12

    .line 1407
    if-lez v12, :cond_2e

    .line 1408
    .line 1409
    invoke-static {v9, v11}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v11

    .line 1413
    if-nez v11, :cond_2e

    .line 1414
    .line 1415
    const/16 v13, 0x2f

    .line 1416
    .line 1417
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1418
    .line 1419
    .line 1420
    :goto_10
    const/4 v14, 0x1

    .line 1421
    goto :goto_11

    .line 1422
    :cond_2e
    const/16 v13, 0x2f

    .line 1423
    .line 1424
    goto :goto_10

    .line 1425
    :goto_11
    new-array v11, v14, [C

    .line 1426
    .line 1427
    const/4 v14, 0x0

    .line 1428
    aput-char v13, v11, v14

    .line 1429
    .line 1430
    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v10

    .line 1434
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1435
    .line 1436
    .line 1437
    goto :goto_13

    .line 1438
    :cond_2f
    :goto_12
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1442
    .line 1443
    .line 1444
    :goto_13
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v9

    .line 1448
    invoke-direct {v8, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 1449
    .line 1450
    .line 1451
    iget-object v9, v7, La/hb40;->d:Ljava/lang/String;

    .line 1452
    .line 1453
    iget v10, v7, La/hb40;->c:I

    .line 1454
    .line 1455
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v10

    .line 1459
    iget v7, v7, La/hb40;->e:I

    .line 1460
    .line 1461
    invoke-direct {v2, v8, v9, v10, v7}, La/pa40;-><init>(La/n0x;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1462
    .line 1463
    .line 1464
    new-instance v12, La/qa40;

    .line 1465
    .line 1466
    move-wide/from16 v7, v16

    .line 1467
    .line 1468
    move-wide/from16 v13, v33

    .line 1469
    .line 1470
    move-object/from16 v16, v1

    .line 1471
    .line 1472
    move-object/from16 v17, v2

    .line 1473
    .line 1474
    move-object/from16 v1, v32

    .line 1475
    .line 1476
    invoke-direct/range {v12 .. v19}, La/qa40;-><init>(JLjava/lang/String;La/pa40;La/pa40;IZ)V

    .line 1477
    .line 1478
    .line 1479
    move/from16 v2, v19

    .line 1480
    .line 1481
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1482
    .line 1483
    .line 1484
    move-object v12, v1

    .line 1485
    move-wide v13, v7

    .line 1486
    move-object/from16 v1, v24

    .line 1487
    .line 1488
    move/from16 v8, v27

    .line 1489
    .line 1490
    move-object/from16 v15, v28

    .line 1491
    .line 1492
    move-object/from16 v10, v29

    .line 1493
    .line 1494
    move-object/from16 v11, v31

    .line 1495
    .line 1496
    goto/16 :goto_c

    .line 1497
    .line 1498
    :cond_30
    move/from16 v27, v8

    .line 1499
    .line 1500
    move-object/from16 v29, v10

    .line 1501
    .line 1502
    move-object/from16 v31, v11

    .line 1503
    .line 1504
    move-object v1, v12

    .line 1505
    move-wide v7, v13

    .line 1506
    move-object/from16 v28, v15

    .line 1507
    .line 1508
    move/from16 v2, v19

    .line 1509
    .line 1510
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v24

    .line 1514
    new-instance v15, La/ba40;

    .line 1515
    .line 1516
    move-object/from16 v18, p0

    .line 1517
    .line 1518
    move-object/from16 v19, v21

    .line 1519
    .line 1520
    move-object/from16 v16, v28

    .line 1521
    .line 1522
    move-object/from16 v21, v29

    .line 1523
    .line 1524
    move-object/from16 v17, v31

    .line 1525
    .line 1526
    invoke-direct/range {v15 .. v24}, La/ba40;-><init>(Ljava/lang/String;La/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/a4x;)V

    .line 1527
    .line 1528
    .line 1529
    const/4 v14, 0x0

    .line 1530
    new-array v0, v14, [Ljava/lang/Object;

    .line 1531
    .line 1532
    invoke-static {v0, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    const v9, 0x7f130609

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual {v6, v9, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    new-instance v6, La/ia40;

    .line 1544
    .line 1545
    invoke-direct {v6, v7, v8, v15, v0}, La/ia40;-><init>(JLa/ba40;Ljava/lang/String;)V

    .line 1546
    .line 1547
    .line 1548
    new-instance v0, La/ka40;

    .line 1549
    .line 1550
    invoke-direct {v0, v6}, La/ka40;-><init>(La/ia40;)V

    .line 1551
    .line 1552
    .line 1553
    invoke-direct {v1, v4, v0}, La/ub40;-><init>(Ljava/lang/String;La/ma40;)V

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1557
    .line 1558
    .line 1559
    move-object/from16 v1, p1

    .line 1560
    .line 1561
    move v0, v2

    .line 1562
    move-object/from16 v11, v25

    .line 1563
    .line 1564
    move-object/from16 v2, v26

    .line 1565
    .line 1566
    move/from16 v4, v27

    .line 1567
    .line 1568
    const/16 v6, 0xa

    .line 1569
    .line 1570
    const/4 v10, 0x1

    .line 1571
    goto/16 :goto_7

    .line 1572
    .line 1573
    :cond_31
    move-object/from16 v25, v11

    .line 1574
    .line 1575
    invoke-static {}, La/q3d;->p()V

    .line 1576
    .line 1577
    .line 1578
    throw v25

    .line 1579
    :cond_32
    move-object v0, v3

    .line 1580
    :goto_14
    return-object v0

    .line 1581
    :pswitch_13
    check-cast v0, La/kc40;

    .line 1582
    .line 1583
    move-object/from16 v1, p1

    .line 1584
    .line 1585
    check-cast v1, La/xb40;

    .line 1586
    .line 1587
    sget-object v2, La/kc40;->l2:La/uuz;

    .line 1588
    .line 1589
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    new-instance v2, Lkotlin/Pair;

    .line 1593
    .line 1594
    const-string v3, "REQUEST_ROLE_RESULT_KEY"

    .line 1595
    .line 1596
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1597
    .line 1598
    .line 1599
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v1

    .line 1603
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v1

    .line 1607
    invoke-static {v1, v0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 1611
    .line 1612
    .line 1613
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1614
    .line 1615
    return-object v0

    .line 1616
    :pswitch_14
    check-cast v0, La/ba40;

    .line 1617
    .line 1618
    move-object/from16 v1, p1

    .line 1619
    .line 1620
    check-cast v1, La/hcz;

    .line 1621
    .line 1622
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1623
    .line 1624
    .line 1625
    iget-object v0, v0, La/ba40;->h:La/a4x;

    .line 1626
    .line 1627
    new-instance v2, La/o240;

    .line 1628
    .line 1629
    invoke-direct {v2, v8}, La/o240;-><init>(B)V

    .line 1630
    .line 1631
    .line 1632
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1633
    .line 1634
    .line 1635
    move-result v3

    .line 1636
    new-instance v4, La/ygy;

    .line 1637
    .line 1638
    const/16 v5, 0x14

    .line 1639
    .line 1640
    invoke-direct {v4, v2, v0, v5}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1641
    .line 1642
    .line 1643
    new-instance v2, La/ap30;

    .line 1644
    .line 1645
    const/16 v6, 0xa

    .line 1646
    .line 1647
    invoke-direct {v2, v0, v6}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 1648
    .line 1649
    .line 1650
    new-instance v6, La/xy1;

    .line 1651
    .line 1652
    invoke-direct {v6, v0, v5}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 1653
    .line 1654
    .line 1655
    new-instance v0, La/ugd;

    .line 1656
    .line 1657
    const v5, 0x799532c4

    .line 1658
    .line 1659
    .line 1660
    const/4 v14, 0x1

    .line 1661
    invoke-direct {v0, v5, v14, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual {v1, v3, v4, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1665
    .line 1666
    .line 1667
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1668
    .line 1669
    return-object v0

    .line 1670
    :pswitch_15
    check-cast v0, La/ia40;

    .line 1671
    .line 1672
    move-object/from16 v1, p1

    .line 1673
    .line 1674
    check-cast v1, La/uag0;

    .line 1675
    .line 1676
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1677
    .line 1678
    .line 1679
    iget-object v0, v0, La/ia40;->b:La/ba40;

    .line 1680
    .line 1681
    iget-object v2, v0, La/ba40;->f:Ljava/lang/String;

    .line 1682
    .line 1683
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1684
    .line 1685
    .line 1686
    move-result v2

    .line 1687
    if-nez v2, :cond_33

    .line 1688
    .line 1689
    goto :goto_15

    .line 1690
    :cond_33
    iget-object v0, v0, La/ba40;->d:Ljava/lang/String;

    .line 1691
    .line 1692
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1693
    .line 1694
    .line 1695
    move-result v0

    .line 1696
    if-nez v0, :cond_34

    .line 1697
    .line 1698
    :goto_15
    move v3, v4

    .line 1699
    :cond_34
    invoke-virtual {v1, v3}, La/uag0;->b(F)V

    .line 1700
    .line 1701
    .line 1702
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1703
    .line 1704
    return-object v0

    .line 1705
    :pswitch_16
    check-cast v0, La/jp30;

    .line 1706
    .line 1707
    move-object/from16 v1, p1

    .line 1708
    .line 1709
    check-cast v1, La/abi0;

    .line 1710
    .line 1711
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1712
    .line 1713
    .line 1714
    iget v0, v0, La/jp30;->h:F

    .line 1715
    .line 1716
    cmpg-float v2, v0, v4

    .line 1717
    .line 1718
    if-nez v2, :cond_35

    .line 1719
    .line 1720
    sget-object v0, La/lq8;->a:La/lq8;

    .line 1721
    .line 1722
    goto :goto_16

    .line 1723
    :cond_35
    cmpg-float v0, v0, v3

    .line 1724
    .line 1725
    if-nez v0, :cond_36

    .line 1726
    .line 1727
    sget-object v0, La/lq8;->c:La/lq8;

    .line 1728
    .line 1729
    goto :goto_16

    .line 1730
    :cond_36
    sget-object v0, La/lq8;->b:La/lq8;

    .line 1731
    .line 1732
    :goto_16
    sget-object v2, La/cbi0;->f:La/zai0;

    .line 1733
    .line 1734
    sget-object v3, La/cbi0;->a:[La/iiy;

    .line 1735
    .line 1736
    aget-object v3, v3, v7

    .line 1737
    .line 1738
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1739
    .line 1740
    .line 1741
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1742
    .line 1743
    .line 1744
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1745
    .line 1746
    return-object v0

    .line 1747
    :pswitch_17
    check-cast v0, La/c69;

    .line 1748
    .line 1749
    move-object/from16 v1, p1

    .line 1750
    .line 1751
    check-cast v1, La/fee;

    .line 1752
    .line 1753
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v1

    .line 1760
    check-cast v1, La/ky6;

    .line 1761
    .line 1762
    iget-object v0, v0, La/c69;->o:Ljava/lang/Object;

    .line 1763
    .line 1764
    check-cast v0, La/sg20;

    .line 1765
    .line 1766
    iget-object v0, v0, La/sg20;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 1767
    .line 1768
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1769
    .line 1770
    .line 1771
    new-instance v6, La/xy6;

    .line 1772
    .line 1773
    iget-object v2, v1, La/ky6;->a:La/kd5;

    .line 1774
    .line 1775
    new-instance v7, La/td5;

    .line 1776
    .line 1777
    iget-object v3, v2, La/kd5;->a:Ljava/lang/String;

    .line 1778
    .line 1779
    iget v2, v2, La/kd5;->b:I

    .line 1780
    .line 1781
    invoke-direct {v7, v3, v2}, La/td5;-><init>(Ljava/lang/String;I)V

    .line 1782
    .line 1783
    .line 1784
    new-instance v8, La/itv;

    .line 1785
    .line 1786
    const-string v13, ""

    .line 1787
    .line 1788
    sget-object v14, La/hye;->c:La/hye;

    .line 1789
    .line 1790
    const/4 v9, 0x0

    .line 1791
    const/4 v10, 0x0

    .line 1792
    const-string v11, ""

    .line 1793
    .line 1794
    const/4 v12, 0x0

    .line 1795
    invoke-direct/range {v8 .. v14}, La/itv;-><init>(ZZLjava/lang/String;ILjava/lang/String;La/hye;)V

    .line 1796
    .line 1797
    .line 1798
    iget-object v1, v1, La/ky6;->b:La/iur;

    .line 1799
    .line 1800
    new-instance v9, La/c0s;

    .line 1801
    .line 1802
    new-instance v10, La/hy20;

    .line 1803
    .line 1804
    iget-object v2, v1, La/iur;->a:Ljava/lang/String;

    .line 1805
    .line 1806
    invoke-direct {v10, v2}, La/hy20;-><init>(Ljava/lang/String;)V

    .line 1807
    .line 1808
    .line 1809
    new-instance v11, La/r5n0;

    .line 1810
    .line 1811
    iget-object v2, v1, La/iur;->b:Ljava/lang/String;

    .line 1812
    .line 1813
    new-instance v3, La/o6q;

    .line 1814
    .line 1815
    sget-object v4, La/pn40;->a:La/pn40;

    .line 1816
    .line 1817
    iget-wide v12, v1, La/iur;->d:D

    .line 1818
    .line 1819
    iget v4, v0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    .line 1820
    .line 1821
    const/4 v14, 0x0

    .line 1822
    invoke-static {v12, v13, v4, v14}, La/pn40;->j(DIZ)Ljava/lang/String;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v4

    .line 1826
    iget-boolean v0, v0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    .line 1827
    .line 1828
    if-eqz v0, :cond_37

    .line 1829
    .line 1830
    sget-object v0, La/ux3;->b:La/ux3;

    .line 1831
    .line 1832
    goto :goto_17

    .line 1833
    :cond_37
    sget-object v0, La/ux3;->c:La/ux3;

    .line 1834
    .line 1835
    :goto_17
    invoke-direct {v3, v4, v0}, La/o6q;-><init>(Ljava/lang/String;La/ux3;)V

    .line 1836
    .line 1837
    .line 1838
    invoke-direct {v11, v2, v3}, La/r5n0;-><init>(Ljava/lang/String;La/o6q;)V

    .line 1839
    .line 1840
    .line 1841
    iget-object v12, v1, La/iur;->c:La/j43;

    .line 1842
    .line 1843
    sget-object v13, La/wbs0;->d:La/wbs0;

    .line 1844
    .line 1845
    sget-object v14, La/iho;->a:La/iho;

    .line 1846
    .line 1847
    invoke-direct/range {v9 .. v14}, La/c0s;-><init>(La/hy20;La/s5n0;La/j43;La/wbs0;La/kho;)V

    .line 1848
    .line 1849
    .line 1850
    new-instance v11, La/g0d;

    .line 1851
    .line 1852
    const/4 v14, 0x0

    .line 1853
    invoke-direct {v11, v5, v5, v14}, La/g0d;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1854
    .line 1855
    .line 1856
    const/4 v12, 0x0

    .line 1857
    move-object v10, v9

    .line 1858
    sget-object v9, La/l580;->a:La/l580;

    .line 1859
    .line 1860
    invoke-direct/range {v6 .. v12}, La/xy6;-><init>(La/td5;La/itv;La/p580;La/c0s;La/g0d;La/j680;)V

    .line 1861
    .line 1862
    .line 1863
    return-object v6

    .line 1864
    :pswitch_18
    check-cast v0, La/zk30;

    .line 1865
    .line 1866
    move-object/from16 v1, p1

    .line 1867
    .line 1868
    check-cast v1, Ljava/lang/Throwable;

    .line 1869
    .line 1870
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1871
    .line 1872
    .line 1873
    invoke-virtual {v0}, La/zk30;->y()V

    .line 1874
    .line 1875
    .line 1876
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1877
    .line 1878
    return-object v0

    .line 1879
    :pswitch_19
    move-object/from16 v25, v11

    .line 1880
    .line 1881
    check-cast v0, La/ik30;

    .line 1882
    .line 1883
    move-object/from16 v1, p1

    .line 1884
    .line 1885
    check-cast v1, Landroid/text/Editable;

    .line 1886
    .line 1887
    sget-object v3, La/ik30;->W1:La/atz;

    .line 1888
    .line 1889
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1890
    .line 1891
    .line 1892
    invoke-virtual {v0}, La/ik30;->H0()La/zk30;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v0

    .line 1896
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v1

    .line 1900
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1901
    .line 1902
    .line 1903
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1904
    .line 1905
    .line 1906
    move-result v3

    .line 1907
    const/4 v4, 0x3

    .line 1908
    if-ge v3, v4, :cond_38

    .line 1909
    .line 1910
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1911
    .line 1912
    .line 1913
    move-result v3

    .line 1914
    if-lez v3, :cond_38

    .line 1915
    .line 1916
    goto :goto_18

    .line 1917
    :cond_38
    iget-object v3, v0, La/zk30;->r:La/bby;

    .line 1918
    .line 1919
    move-object/from16 v4, v25

    .line 1920
    .line 1921
    if-eqz v3, :cond_39

    .line 1922
    .line 1923
    invoke-interface {v3, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1924
    .line 1925
    .line 1926
    :cond_39
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v5

    .line 1930
    iget-object v3, v0, La/zk30;->h:La/mne;

    .line 1931
    .line 1932
    iget-object v8, v3, La/mne;->a:La/rwj;

    .line 1933
    .line 1934
    sget-object v6, La/yk30;->a:La/yk30;

    .line 1935
    .line 1936
    new-instance v9, La/mq10;

    .line 1937
    .line 1938
    invoke-direct {v9, v0, v1, v4, v2}, La/mq10;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1939
    .line 1940
    .line 1941
    const/16 v10, 0xa

    .line 1942
    .line 1943
    const/4 v7, 0x0

    .line 1944
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v1

    .line 1948
    iput-object v1, v0, La/zk30;->r:La/bby;

    .line 1949
    .line 1950
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1951
    .line 1952
    return-object v0

    .line 1953
    :pswitch_1a
    check-cast v0, La/g3;

    .line 1954
    .line 1955
    move-object/from16 v1, p1

    .line 1956
    .line 1957
    check-cast v1, Ljava/lang/Integer;

    .line 1958
    .line 1959
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1960
    .line 1961
    .line 1962
    move-result v1

    .line 1963
    invoke-virtual {v0, v1}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v0

    .line 1967
    return-object v0

    .line 1968
    :pswitch_1b
    check-cast v0, La/rg30;

    .line 1969
    .line 1970
    move-object/from16 v1, p1

    .line 1971
    .line 1972
    check-cast v1, Ljava/lang/Throwable;

    .line 1973
    .line 1974
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1975
    .line 1976
    .line 1977
    iget-object v0, v0, La/rg30;->q:La/duj;

    .line 1978
    .line 1979
    new-instance v3, La/ei20;

    .line 1980
    .line 1981
    invoke-direct {v3, v2}, La/ei20;-><init>(B)V

    .line 1982
    .line 1983
    .line 1984
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1985
    .line 1986
    .line 1987
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1988
    .line 1989
    return-object v0

    .line 1990
    :pswitch_1c
    check-cast v0, La/p730;

    .line 1991
    .line 1992
    move-object/from16 v1, p1

    .line 1993
    .line 1994
    check-cast v1, La/cp;

    .line 1995
    .line 1996
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1997
    .line 1998
    .line 1999
    iget-object v2, v1, La/xhe0;->a:Landroid/view/View;

    .line 2000
    .line 2001
    new-instance v3, La/wg;

    .line 2002
    .line 2003
    const/16 v4, 0x1c

    .line 2004
    .line 2005
    invoke-direct {v3, v0, v1, v4}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2006
    .line 2007
    .line 2008
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2009
    .line 2010
    .line 2011
    new-instance v0, La/ctv;

    .line 2012
    .line 2013
    invoke-direct {v0, v1, v1, v8}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 2014
    .line 2015
    .line 2016
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 2017
    .line 2018
    .line 2019
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2020
    .line 2021
    return-object v0

    .line 2022
    nop

    .line 2023
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
