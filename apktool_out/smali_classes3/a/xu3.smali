.class public final La/xu3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p6d;


# direct methods
.method public synthetic constructor <init>(La/p6d;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xu3;->a:B

    iput-object p1, p0, La/xu3;->b:La/p6d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/xu3;->a:B

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    iget-object v3, p0, La/xu3;->b:La/p6d;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/high16 v6, -0x80000000

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    instance-of v0, p2, La/e8n0;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move-object v0, p2

    .line 22
    check-cast v0, La/e8n0;

    .line 23
    .line 24
    iget v1, v0, La/e8n0;->j:I

    .line 25
    .line 26
    and-int v2, v1, v6

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    sub-int/2addr v1, v6

    .line 31
    iput v1, v0, La/e8n0;->j:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v0, La/e8n0;

    .line 35
    .line 36
    invoke-direct {v0, p0, p2}, La/e8n0;-><init>(La/xu3;La/yje;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p0, v0, La/e8n0;->i:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object p2, La/wne;->a:La/wne;

    .line 42
    .line 43
    iget v1, v0, La/e8n0;->j:I

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    if-ne v1, v7, :cond_1

    .line 48
    .line 49
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, La/d8n0;

    .line 61
    .line 62
    invoke-direct {p0, p1, v7}, La/d8n0;-><init>(La/kmq;B)V

    .line 63
    .line 64
    .line 65
    iput v7, v0, La/e8n0;->j:I

    .line 66
    .line 67
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-ne p0, p2, :cond_3

    .line 72
    .line 73
    move-object v4, p2

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_2
    return-object v4

    .line 78
    :pswitch_0
    instance-of v0, p2, La/b8n0;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    move-object v0, p2

    .line 83
    check-cast v0, La/b8n0;

    .line 84
    .line 85
    iget v1, v0, La/b8n0;->j:I

    .line 86
    .line 87
    and-int v2, v1, v6

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    sub-int/2addr v1, v6

    .line 92
    iput v1, v0, La/b8n0;->j:I

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    new-instance v0, La/b8n0;

    .line 96
    .line 97
    invoke-direct {v0, p0, p2}, La/b8n0;-><init>(La/xu3;La/yje;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    iget-object p0, v0, La/b8n0;->i:Ljava/lang/Object;

    .line 101
    .line 102
    sget-object p2, La/wne;->a:La/wne;

    .line 103
    .line 104
    iget v1, v0, La/b8n0;->j:I

    .line 105
    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    if-ne v1, v7, :cond_5

    .line 109
    .line 110
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    new-instance p0, La/d8n0;

    .line 122
    .line 123
    const/4 v1, 0x0

    .line 124
    invoke-direct {p0, p1, v1}, La/d8n0;-><init>(La/kmq;B)V

    .line 125
    .line 126
    .line 127
    iput v7, v0, La/b8n0;->j:I

    .line 128
    .line 129
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, p2, :cond_7

    .line 134
    .line 135
    move-object v4, p2

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_5
    return-object v4

    .line 140
    :pswitch_1
    instance-of v0, p2, La/xx60;

    .line 141
    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    move-object v0, p2

    .line 145
    check-cast v0, La/xx60;

    .line 146
    .line 147
    iget v1, v0, La/xx60;->j:I

    .line 148
    .line 149
    and-int v2, v1, v6

    .line 150
    .line 151
    if-eqz v2, :cond_8

    .line 152
    .line 153
    sub-int/2addr v1, v6

    .line 154
    iput v1, v0, La/xx60;->j:I

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_8
    new-instance v0, La/xx60;

    .line 158
    .line 159
    invoke-direct {v0, p0, p2}, La/xx60;-><init>(La/xu3;La/yje;)V

    .line 160
    .line 161
    .line 162
    :goto_6
    iget-object p0, v0, La/xx60;->i:Ljava/lang/Object;

    .line 163
    .line 164
    sget-object p2, La/wne;->a:La/wne;

    .line 165
    .line 166
    iget v1, v0, La/xx60;->j:I

    .line 167
    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    if-ne v1, v7, :cond_9

    .line 171
    .line 172
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_9
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    new-instance p0, La/ld60;

    .line 184
    .line 185
    const/4 v1, 0x5

    .line 186
    invoke-direct {p0, p1, v1}, La/ld60;-><init>(La/kmq;B)V

    .line 187
    .line 188
    .line 189
    iput v7, v0, La/xx60;->j:I

    .line 190
    .line 191
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-ne p0, p2, :cond_b

    .line 196
    .line 197
    move-object v4, p2

    .line 198
    goto :goto_8

    .line 199
    :cond_b
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_8
    return-object v4

    .line 202
    :pswitch_2
    instance-of v0, p2, La/yu60;

    .line 203
    .line 204
    if-eqz v0, :cond_c

    .line 205
    .line 206
    move-object v0, p2

    .line 207
    check-cast v0, La/yu60;

    .line 208
    .line 209
    iget v1, v0, La/yu60;->j:I

    .line 210
    .line 211
    and-int v2, v1, v6

    .line 212
    .line 213
    if-eqz v2, :cond_c

    .line 214
    .line 215
    sub-int/2addr v1, v6

    .line 216
    iput v1, v0, La/yu60;->j:I

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_c
    new-instance v0, La/yu60;

    .line 220
    .line 221
    invoke-direct {v0, p0, p2}, La/yu60;-><init>(La/xu3;La/yje;)V

    .line 222
    .line 223
    .line 224
    :goto_9
    iget-object p0, v0, La/yu60;->i:Ljava/lang/Object;

    .line 225
    .line 226
    sget-object p2, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget v1, v0, La/yu60;->j:I

    .line 229
    .line 230
    if-eqz v1, :cond_e

    .line 231
    .line 232
    if-ne v1, v7, :cond_d

    .line 233
    .line 234
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_d
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    new-instance p0, La/ld60;

    .line 246
    .line 247
    const/4 v1, 0x4

    .line 248
    invoke-direct {p0, p1, v1}, La/ld60;-><init>(La/kmq;B)V

    .line 249
    .line 250
    .line 251
    iput v7, v0, La/yu60;->j:I

    .line 252
    .line 253
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    if-ne p0, p2, :cond_f

    .line 258
    .line 259
    move-object v4, p2

    .line 260
    goto :goto_b

    .line 261
    :cond_f
    :goto_a
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    :goto_b
    return-object v4

    .line 264
    :pswitch_3
    instance-of v0, p2, La/xr60;

    .line 265
    .line 266
    if-eqz v0, :cond_10

    .line 267
    .line 268
    move-object v0, p2

    .line 269
    check-cast v0, La/xr60;

    .line 270
    .line 271
    iget v1, v0, La/xr60;->j:I

    .line 272
    .line 273
    and-int v8, v1, v6

    .line 274
    .line 275
    if-eqz v8, :cond_10

    .line 276
    .line 277
    sub-int/2addr v1, v6

    .line 278
    iput v1, v0, La/xr60;->j:I

    .line 279
    .line 280
    goto :goto_c

    .line 281
    :cond_10
    new-instance v0, La/xr60;

    .line 282
    .line 283
    invoke-direct {v0, p0, p2}, La/xr60;-><init>(La/xu3;La/yje;)V

    .line 284
    .line 285
    .line 286
    :goto_c
    iget-object p0, v0, La/xr60;->i:Ljava/lang/Object;

    .line 287
    .line 288
    sget-object p2, La/wne;->a:La/wne;

    .line 289
    .line 290
    iget v1, v0, La/xr60;->j:I

    .line 291
    .line 292
    if-eqz v1, :cond_12

    .line 293
    .line 294
    if-ne v1, v7, :cond_11

    .line 295
    .line 296
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto :goto_d

    .line 300
    :cond_11
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    goto :goto_e

    .line 304
    :cond_12
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    new-instance p0, La/ld60;

    .line 308
    .line 309
    invoke-direct {p0, p1, v2}, La/ld60;-><init>(La/kmq;B)V

    .line 310
    .line 311
    .line 312
    iput v7, v0, La/xr60;->j:I

    .line 313
    .line 314
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    if-ne p0, p2, :cond_13

    .line 319
    .line 320
    move-object v4, p2

    .line 321
    goto :goto_e

    .line 322
    :cond_13
    :goto_d
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    :goto_e
    return-object v4

    .line 325
    :pswitch_4
    instance-of v0, p2, La/qr60;

    .line 326
    .line 327
    if-eqz v0, :cond_14

    .line 328
    .line 329
    move-object v0, p2

    .line 330
    check-cast v0, La/qr60;

    .line 331
    .line 332
    iget v1, v0, La/qr60;->j:I

    .line 333
    .line 334
    and-int v2, v1, v6

    .line 335
    .line 336
    if-eqz v2, :cond_14

    .line 337
    .line 338
    sub-int/2addr v1, v6

    .line 339
    iput v1, v0, La/qr60;->j:I

    .line 340
    .line 341
    goto :goto_f

    .line 342
    :cond_14
    new-instance v0, La/qr60;

    .line 343
    .line 344
    invoke-direct {v0, p0, p2}, La/qr60;-><init>(La/xu3;La/yje;)V

    .line 345
    .line 346
    .line 347
    :goto_f
    iget-object p0, v0, La/qr60;->i:Ljava/lang/Object;

    .line 348
    .line 349
    sget-object p2, La/wne;->a:La/wne;

    .line 350
    .line 351
    iget v1, v0, La/qr60;->j:I

    .line 352
    .line 353
    if-eqz v1, :cond_16

    .line 354
    .line 355
    if-ne v1, v7, :cond_15

    .line 356
    .line 357
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    goto :goto_10

    .line 361
    :cond_15
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_11

    .line 365
    :cond_16
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    new-instance p0, La/ld60;

    .line 369
    .line 370
    const/4 v1, 0x2

    .line 371
    invoke-direct {p0, p1, v1}, La/ld60;-><init>(La/kmq;B)V

    .line 372
    .line 373
    .line 374
    iput v7, v0, La/qr60;->j:I

    .line 375
    .line 376
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    if-ne p0, p2, :cond_17

    .line 381
    .line 382
    move-object v4, p2

    .line 383
    goto :goto_11

    .line 384
    :cond_17
    :goto_10
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    :goto_11
    return-object v4

    .line 387
    :pswitch_5
    instance-of v0, p2, La/ol00;

    .line 388
    .line 389
    if-eqz v0, :cond_18

    .line 390
    .line 391
    move-object v0, p2

    .line 392
    check-cast v0, La/ol00;

    .line 393
    .line 394
    iget v1, v0, La/ol00;->j:I

    .line 395
    .line 396
    and-int v2, v1, v6

    .line 397
    .line 398
    if-eqz v2, :cond_18

    .line 399
    .line 400
    sub-int/2addr v1, v6

    .line 401
    iput v1, v0, La/ol00;->j:I

    .line 402
    .line 403
    goto :goto_12

    .line 404
    :cond_18
    new-instance v0, La/ol00;

    .line 405
    .line 406
    invoke-direct {v0, p0, p2}, La/ol00;-><init>(La/xu3;La/yje;)V

    .line 407
    .line 408
    .line 409
    :goto_12
    iget-object p0, v0, La/ol00;->i:Ljava/lang/Object;

    .line 410
    .line 411
    sget-object p2, La/wne;->a:La/wne;

    .line 412
    .line 413
    iget v1, v0, La/ol00;->j:I

    .line 414
    .line 415
    if-eqz v1, :cond_1a

    .line 416
    .line 417
    if-ne v1, v7, :cond_19

    .line 418
    .line 419
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    goto :goto_13

    .line 423
    :cond_19
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    goto :goto_14

    .line 427
    :cond_1a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    new-instance p0, La/b4v;

    .line 431
    .line 432
    const/16 v1, 0xf

    .line 433
    .line 434
    invoke-direct {p0, p1, v1}, La/b4v;-><init>(La/kmq;B)V

    .line 435
    .line 436
    .line 437
    iput v7, v0, La/ol00;->j:I

    .line 438
    .line 439
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    if-ne p0, p2, :cond_1b

    .line 444
    .line 445
    move-object v4, p2

    .line 446
    goto :goto_14

    .line 447
    :cond_1b
    :goto_13
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 448
    .line 449
    :goto_14
    return-object v4

    .line 450
    :pswitch_6
    instance-of v0, p2, La/hl00;

    .line 451
    .line 452
    if-eqz v0, :cond_1c

    .line 453
    .line 454
    move-object v0, p2

    .line 455
    check-cast v0, La/hl00;

    .line 456
    .line 457
    iget v2, v0, La/hl00;->j:I

    .line 458
    .line 459
    and-int v8, v2, v6

    .line 460
    .line 461
    if-eqz v8, :cond_1c

    .line 462
    .line 463
    sub-int/2addr v2, v6

    .line 464
    iput v2, v0, La/hl00;->j:I

    .line 465
    .line 466
    goto :goto_15

    .line 467
    :cond_1c
    new-instance v0, La/hl00;

    .line 468
    .line 469
    invoke-direct {v0, p0, p2}, La/hl00;-><init>(La/xu3;La/yje;)V

    .line 470
    .line 471
    .line 472
    :goto_15
    iget-object p0, v0, La/hl00;->i:Ljava/lang/Object;

    .line 473
    .line 474
    sget-object p2, La/wne;->a:La/wne;

    .line 475
    .line 476
    iget v2, v0, La/hl00;->j:I

    .line 477
    .line 478
    if-eqz v2, :cond_1e

    .line 479
    .line 480
    if-ne v2, v7, :cond_1d

    .line 481
    .line 482
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    goto :goto_16

    .line 486
    :cond_1d
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    goto :goto_17

    .line 490
    :cond_1e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    new-instance p0, La/b4v;

    .line 494
    .line 495
    invoke-direct {p0, p1, v1}, La/b4v;-><init>(La/kmq;B)V

    .line 496
    .line 497
    .line 498
    iput v7, v0, La/hl00;->j:I

    .line 499
    .line 500
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    if-ne p0, p2, :cond_1f

    .line 505
    .line 506
    move-object v4, p2

    .line 507
    goto :goto_17

    .line 508
    :cond_1f
    :goto_16
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 509
    .line 510
    :goto_17
    return-object v4

    .line 511
    :pswitch_7
    instance-of v0, p2, La/owt;

    .line 512
    .line 513
    if-eqz v0, :cond_20

    .line 514
    .line 515
    move-object v0, p2

    .line 516
    check-cast v0, La/owt;

    .line 517
    .line 518
    iget v2, v0, La/owt;->j:I

    .line 519
    .line 520
    and-int v8, v2, v6

    .line 521
    .line 522
    if-eqz v8, :cond_20

    .line 523
    .line 524
    sub-int/2addr v2, v6

    .line 525
    iput v2, v0, La/owt;->j:I

    .line 526
    .line 527
    goto :goto_18

    .line 528
    :cond_20
    new-instance v0, La/owt;

    .line 529
    .line 530
    invoke-direct {v0, p0, p2}, La/owt;-><init>(La/xu3;La/yje;)V

    .line 531
    .line 532
    .line 533
    :goto_18
    iget-object p0, v0, La/owt;->i:Ljava/lang/Object;

    .line 534
    .line 535
    sget-object p2, La/wne;->a:La/wne;

    .line 536
    .line 537
    iget v2, v0, La/owt;->j:I

    .line 538
    .line 539
    if-eqz v2, :cond_22

    .line 540
    .line 541
    if-ne v2, v7, :cond_21

    .line 542
    .line 543
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    goto :goto_19

    .line 547
    :cond_21
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    goto :goto_1a

    .line 551
    :cond_22
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    new-instance p0, La/tnt;

    .line 555
    .line 556
    invoke-direct {p0, p1, v1}, La/tnt;-><init>(La/kmq;B)V

    .line 557
    .line 558
    .line 559
    iput v7, v0, La/owt;->j:I

    .line 560
    .line 561
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    if-ne p0, p2, :cond_23

    .line 566
    .line 567
    move-object v4, p2

    .line 568
    goto :goto_1a

    .line 569
    :cond_23
    :goto_19
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    :goto_1a
    return-object v4

    .line 572
    :pswitch_8
    instance-of v0, p2, La/qhs;

    .line 573
    .line 574
    if-eqz v0, :cond_24

    .line 575
    .line 576
    move-object v0, p2

    .line 577
    check-cast v0, La/qhs;

    .line 578
    .line 579
    iget v1, v0, La/qhs;->j:I

    .line 580
    .line 581
    and-int v2, v1, v6

    .line 582
    .line 583
    if-eqz v2, :cond_24

    .line 584
    .line 585
    sub-int/2addr v1, v6

    .line 586
    iput v1, v0, La/qhs;->j:I

    .line 587
    .line 588
    goto :goto_1b

    .line 589
    :cond_24
    new-instance v0, La/qhs;

    .line 590
    .line 591
    invoke-direct {v0, p0, p2}, La/qhs;-><init>(La/xu3;La/yje;)V

    .line 592
    .line 593
    .line 594
    :goto_1b
    iget-object p0, v0, La/qhs;->i:Ljava/lang/Object;

    .line 595
    .line 596
    sget-object p2, La/wne;->a:La/wne;

    .line 597
    .line 598
    iget v1, v0, La/qhs;->j:I

    .line 599
    .line 600
    if-eqz v1, :cond_26

    .line 601
    .line 602
    if-ne v1, v7, :cond_25

    .line 603
    .line 604
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    goto :goto_1c

    .line 608
    :cond_25
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    goto :goto_1d

    .line 612
    :cond_26
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    new-instance p0, La/uap;

    .line 616
    .line 617
    const/16 v1, 0x10

    .line 618
    .line 619
    invoke-direct {p0, p1, v1}, La/uap;-><init>(La/kmq;B)V

    .line 620
    .line 621
    .line 622
    iput v7, v0, La/qhs;->j:I

    .line 623
    .line 624
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object p0

    .line 628
    if-ne p0, p2, :cond_27

    .line 629
    .line 630
    move-object v4, p2

    .line 631
    goto :goto_1d

    .line 632
    :cond_27
    :goto_1c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    :goto_1d
    return-object v4

    .line 635
    :pswitch_9
    instance-of v0, p2, La/vu3;

    .line 636
    .line 637
    if-eqz v0, :cond_28

    .line 638
    .line 639
    move-object v0, p2

    .line 640
    check-cast v0, La/vu3;

    .line 641
    .line 642
    iget v1, v0, La/vu3;->j:I

    .line 643
    .line 644
    and-int v8, v1, v6

    .line 645
    .line 646
    if-eqz v8, :cond_28

    .line 647
    .line 648
    sub-int/2addr v1, v6

    .line 649
    iput v1, v0, La/vu3;->j:I

    .line 650
    .line 651
    goto :goto_1e

    .line 652
    :cond_28
    new-instance v0, La/vu3;

    .line 653
    .line 654
    invoke-direct {v0, p0, p2}, La/vu3;-><init>(La/xu3;La/yje;)V

    .line 655
    .line 656
    .line 657
    :goto_1e
    iget-object p0, v0, La/vu3;->i:Ljava/lang/Object;

    .line 658
    .line 659
    sget-object p2, La/wne;->a:La/wne;

    .line 660
    .line 661
    iget v1, v0, La/vu3;->j:I

    .line 662
    .line 663
    if-eqz v1, :cond_2a

    .line 664
    .line 665
    if-ne v1, v7, :cond_29

    .line 666
    .line 667
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    goto :goto_1f

    .line 671
    :cond_29
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    goto :goto_20

    .line 675
    :cond_2a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 676
    .line 677
    .line 678
    new-instance p0, La/qo3;

    .line 679
    .line 680
    invoke-direct {p0, p1, v2}, La/qo3;-><init>(La/kmq;B)V

    .line 681
    .line 682
    .line 683
    iput v7, v0, La/vu3;->j:I

    .line 684
    .line 685
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    if-ne p0, p2, :cond_2b

    .line 690
    .line 691
    move-object v4, p2

    .line 692
    goto :goto_20

    .line 693
    :cond_2b
    :goto_1f
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 694
    .line 695
    :goto_20
    return-object v4

    .line 696
    nop

    .line 697
    :pswitch_data_0
    .packed-switch 0x0
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
