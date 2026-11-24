.class public final La/ak9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vsg0;


# direct methods
.method public synthetic constructor <init>(La/vsg0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ak9;->a:B

    iput-object p1, p0, La/ak9;->b:La/vsg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ak9;->a:B

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, p0, La/ak9;->b:La/vsg0;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/qzt0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/qzt0;

    .line 22
    .line 23
    iget v1, v0, La/qzt0;->j:I

    .line 24
    .line 25
    and-int v7, v1, v4

    .line 26
    .line 27
    if-eqz v7, :cond_0

    .line 28
    .line 29
    sub-int/2addr v1, v4

    .line 30
    iput v1, v0, La/qzt0;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/qzt0;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/qzt0;-><init>(La/ak9;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/qzt0;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v1, v0, La/qzt0;->j:I

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    if-ne v1, v5, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/d8n0;

    .line 60
    .line 61
    const/16 v1, 0x1a

    .line 62
    .line 63
    invoke-direct {p0, p1, v1}, La/d8n0;-><init>(La/kmq;B)V

    .line 64
    .line 65
    .line 66
    iput v5, v0, La/qzt0;->j:I

    .line 67
    .line 68
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, p2, :cond_3

    .line 73
    .line 74
    move-object v2, p2

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_2
    return-object v2

    .line 79
    :pswitch_0
    instance-of v0, p2, La/fxd0;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    move-object v0, p2

    .line 84
    check-cast v0, La/fxd0;

    .line 85
    .line 86
    iget v1, v0, La/fxd0;->j:I

    .line 87
    .line 88
    and-int v7, v1, v4

    .line 89
    .line 90
    if-eqz v7, :cond_4

    .line 91
    .line 92
    sub-int/2addr v1, v4

    .line 93
    iput v1, v0, La/fxd0;->j:I

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    new-instance v0, La/fxd0;

    .line 97
    .line 98
    invoke-direct {v0, p0, p2}, La/fxd0;-><init>(La/ak9;La/yje;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    iget-object p0, v0, La/fxd0;->i:Ljava/lang/Object;

    .line 102
    .line 103
    sget-object p2, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget v1, v0, La/fxd0;->j:I

    .line 106
    .line 107
    if-eqz v1, :cond_6

    .line 108
    .line 109
    if-ne v1, v5, :cond_5

    .line 110
    .line 111
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance p0, La/hbb0;

    .line 123
    .line 124
    const/16 v1, 0x9

    .line 125
    .line 126
    invoke-direct {p0, p1, v1}, La/hbb0;-><init>(La/kmq;B)V

    .line 127
    .line 128
    .line 129
    iput v5, v0, La/fxd0;->j:I

    .line 130
    .line 131
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, p2, :cond_7

    .line 136
    .line 137
    move-object v2, p2

    .line 138
    goto :goto_5

    .line 139
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    :goto_5
    return-object v2

    .line 142
    :pswitch_1
    instance-of v0, p2, La/ad60;

    .line 143
    .line 144
    if-eqz v0, :cond_8

    .line 145
    .line 146
    move-object v0, p2

    .line 147
    check-cast v0, La/ad60;

    .line 148
    .line 149
    iget v1, v0, La/ad60;->j:I

    .line 150
    .line 151
    and-int v7, v1, v4

    .line 152
    .line 153
    if-eqz v7, :cond_8

    .line 154
    .line 155
    sub-int/2addr v1, v4

    .line 156
    iput v1, v0, La/ad60;->j:I

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_8
    new-instance v0, La/ad60;

    .line 160
    .line 161
    invoke-direct {v0, p0, p2}, La/ad60;-><init>(La/ak9;La/yje;)V

    .line 162
    .line 163
    .line 164
    :goto_6
    iget-object p0, v0, La/ad60;->i:Ljava/lang/Object;

    .line 165
    .line 166
    sget-object p2, La/wne;->a:La/wne;

    .line 167
    .line 168
    iget v1, v0, La/ad60;->j:I

    .line 169
    .line 170
    if-eqz v1, :cond_a

    .line 171
    .line 172
    if-ne v1, v5, :cond_9

    .line 173
    .line 174
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    new-instance p0, La/nr30;

    .line 186
    .line 187
    const/16 v1, 0x1c

    .line 188
    .line 189
    invoke-direct {p0, p1, v1}, La/nr30;-><init>(La/kmq;B)V

    .line 190
    .line 191
    .line 192
    iput v5, v0, La/ad60;->j:I

    .line 193
    .line 194
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    if-ne p0, p2, :cond_b

    .line 199
    .line 200
    move-object v2, p2

    .line 201
    goto :goto_8

    .line 202
    :cond_b
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    :goto_8
    return-object v2

    .line 205
    :pswitch_2
    instance-of v0, p2, La/yc60;

    .line 206
    .line 207
    if-eqz v0, :cond_c

    .line 208
    .line 209
    move-object v0, p2

    .line 210
    check-cast v0, La/yc60;

    .line 211
    .line 212
    iget v7, v0, La/yc60;->j:I

    .line 213
    .line 214
    and-int v8, v7, v4

    .line 215
    .line 216
    if-eqz v8, :cond_c

    .line 217
    .line 218
    sub-int/2addr v7, v4

    .line 219
    iput v7, v0, La/yc60;->j:I

    .line 220
    .line 221
    goto :goto_9

    .line 222
    :cond_c
    new-instance v0, La/yc60;

    .line 223
    .line 224
    invoke-direct {v0, p0, p2}, La/yc60;-><init>(La/ak9;La/yje;)V

    .line 225
    .line 226
    .line 227
    :goto_9
    iget-object p0, v0, La/yc60;->i:Ljava/lang/Object;

    .line 228
    .line 229
    sget-object p2, La/wne;->a:La/wne;

    .line 230
    .line 231
    iget v4, v0, La/yc60;->j:I

    .line 232
    .line 233
    if-eqz v4, :cond_e

    .line 234
    .line 235
    if-ne v4, v5, :cond_d

    .line 236
    .line 237
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    goto :goto_b

    .line 245
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    new-instance p0, La/nr30;

    .line 249
    .line 250
    invoke-direct {p0, p1, v1}, La/nr30;-><init>(La/kmq;B)V

    .line 251
    .line 252
    .line 253
    iput v5, v0, La/yc60;->j:I

    .line 254
    .line 255
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    if-ne p0, p2, :cond_f

    .line 260
    .line 261
    move-object v2, p2

    .line 262
    goto :goto_b

    .line 263
    :cond_f
    :goto_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    :goto_b
    return-object v2

    .line 266
    :pswitch_3
    instance-of v0, p2, La/uk40;

    .line 267
    .line 268
    if-eqz v0, :cond_10

    .line 269
    .line 270
    move-object v0, p2

    .line 271
    check-cast v0, La/uk40;

    .line 272
    .line 273
    iget v1, v0, La/uk40;->j:I

    .line 274
    .line 275
    and-int v7, v1, v4

    .line 276
    .line 277
    if-eqz v7, :cond_10

    .line 278
    .line 279
    sub-int/2addr v1, v4

    .line 280
    iput v1, v0, La/uk40;->j:I

    .line 281
    .line 282
    goto :goto_c

    .line 283
    :cond_10
    new-instance v0, La/uk40;

    .line 284
    .line 285
    invoke-direct {v0, p0, p2}, La/uk40;-><init>(La/ak9;La/yje;)V

    .line 286
    .line 287
    .line 288
    :goto_c
    iget-object p0, v0, La/uk40;->i:Ljava/lang/Object;

    .line 289
    .line 290
    sget-object p2, La/wne;->a:La/wne;

    .line 291
    .line 292
    iget v1, v0, La/uk40;->j:I

    .line 293
    .line 294
    if-eqz v1, :cond_12

    .line 295
    .line 296
    if-ne v1, v5, :cond_11

    .line 297
    .line 298
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto :goto_d

    .line 302
    :cond_11
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    goto :goto_e

    .line 306
    :cond_12
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    new-instance p0, La/nr30;

    .line 310
    .line 311
    const/4 v1, 0x6

    .line 312
    invoke-direct {p0, p1, v1}, La/nr30;-><init>(La/kmq;B)V

    .line 313
    .line 314
    .line 315
    iput v5, v0, La/uk40;->j:I

    .line 316
    .line 317
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    if-ne p0, p2, :cond_13

    .line 322
    .line 323
    move-object v2, p2

    .line 324
    goto :goto_e

    .line 325
    :cond_13
    :goto_d
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    :goto_e
    return-object v2

    .line 328
    :pswitch_4
    instance-of v0, p2, La/ga40;

    .line 329
    .line 330
    if-eqz v0, :cond_14

    .line 331
    .line 332
    move-object v0, p2

    .line 333
    check-cast v0, La/ga40;

    .line 334
    .line 335
    iget v1, v0, La/ga40;->j:I

    .line 336
    .line 337
    and-int v7, v1, v4

    .line 338
    .line 339
    if-eqz v7, :cond_14

    .line 340
    .line 341
    sub-int/2addr v1, v4

    .line 342
    iput v1, v0, La/ga40;->j:I

    .line 343
    .line 344
    goto :goto_f

    .line 345
    :cond_14
    new-instance v0, La/ga40;

    .line 346
    .line 347
    invoke-direct {v0, p0, p2}, La/ga40;-><init>(La/ak9;La/yje;)V

    .line 348
    .line 349
    .line 350
    :goto_f
    iget-object p0, v0, La/ga40;->i:Ljava/lang/Object;

    .line 351
    .line 352
    sget-object p2, La/wne;->a:La/wne;

    .line 353
    .line 354
    iget v1, v0, La/ga40;->j:I

    .line 355
    .line 356
    if-eqz v1, :cond_16

    .line 357
    .line 358
    if-ne v1, v5, :cond_15

    .line 359
    .line 360
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    goto :goto_10

    .line 364
    :cond_15
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    goto :goto_11

    .line 368
    :cond_16
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    new-instance p0, La/nr30;

    .line 372
    .line 373
    const/4 v1, 0x3

    .line 374
    invoke-direct {p0, p1, v1}, La/nr30;-><init>(La/kmq;B)V

    .line 375
    .line 376
    .line 377
    iput v5, v0, La/ga40;->j:I

    .line 378
    .line 379
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    if-ne p0, p2, :cond_17

    .line 384
    .line 385
    move-object v2, p2

    .line 386
    goto :goto_11

    .line 387
    :cond_17
    :goto_10
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    :goto_11
    return-object v2

    .line 390
    :pswitch_5
    instance-of v0, p2, La/x210;

    .line 391
    .line 392
    if-eqz v0, :cond_18

    .line 393
    .line 394
    move-object v0, p2

    .line 395
    check-cast v0, La/x210;

    .line 396
    .line 397
    iget v1, v0, La/x210;->j:I

    .line 398
    .line 399
    and-int v7, v1, v4

    .line 400
    .line 401
    if-eqz v7, :cond_18

    .line 402
    .line 403
    sub-int/2addr v1, v4

    .line 404
    iput v1, v0, La/x210;->j:I

    .line 405
    .line 406
    goto :goto_12

    .line 407
    :cond_18
    new-instance v0, La/x210;

    .line 408
    .line 409
    invoke-direct {v0, p0, p2}, La/x210;-><init>(La/ak9;La/yje;)V

    .line 410
    .line 411
    .line 412
    :goto_12
    iget-object p0, v0, La/x210;->i:Ljava/lang/Object;

    .line 413
    .line 414
    sget-object p2, La/wne;->a:La/wne;

    .line 415
    .line 416
    iget v1, v0, La/x210;->j:I

    .line 417
    .line 418
    if-eqz v1, :cond_1a

    .line 419
    .line 420
    if-ne v1, v5, :cond_19

    .line 421
    .line 422
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    goto :goto_13

    .line 426
    :cond_19
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    goto :goto_14

    .line 430
    :cond_1a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    new-instance p0, La/b4v;

    .line 434
    .line 435
    const/16 v1, 0x11

    .line 436
    .line 437
    invoke-direct {p0, p1, v1}, La/b4v;-><init>(La/kmq;B)V

    .line 438
    .line 439
    .line 440
    iput v5, v0, La/x210;->j:I

    .line 441
    .line 442
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    if-ne p0, p2, :cond_1b

    .line 447
    .line 448
    move-object v2, p2

    .line 449
    goto :goto_14

    .line 450
    :cond_1b
    :goto_13
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 451
    .line 452
    :goto_14
    return-object v2

    .line 453
    :pswitch_6
    instance-of v0, p2, La/r3v;

    .line 454
    .line 455
    if-eqz v0, :cond_1c

    .line 456
    .line 457
    move-object v0, p2

    .line 458
    check-cast v0, La/r3v;

    .line 459
    .line 460
    iget v1, v0, La/r3v;->j:I

    .line 461
    .line 462
    and-int v7, v1, v4

    .line 463
    .line 464
    if-eqz v7, :cond_1c

    .line 465
    .line 466
    sub-int/2addr v1, v4

    .line 467
    iput v1, v0, La/r3v;->j:I

    .line 468
    .line 469
    goto :goto_15

    .line 470
    :cond_1c
    new-instance v0, La/r3v;

    .line 471
    .line 472
    invoke-direct {v0, p0, p2}, La/r3v;-><init>(La/ak9;La/yje;)V

    .line 473
    .line 474
    .line 475
    :goto_15
    iget-object p0, v0, La/r3v;->i:Ljava/lang/Object;

    .line 476
    .line 477
    sget-object p2, La/wne;->a:La/wne;

    .line 478
    .line 479
    iget v1, v0, La/r3v;->j:I

    .line 480
    .line 481
    if-eqz v1, :cond_1e

    .line 482
    .line 483
    if-ne v1, v5, :cond_1d

    .line 484
    .line 485
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    goto :goto_16

    .line 489
    :cond_1d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    goto :goto_17

    .line 493
    :cond_1e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    new-instance p0, La/y6u;

    .line 497
    .line 498
    const/16 v1, 0x1d

    .line 499
    .line 500
    invoke-direct {p0, p1, v1}, La/y6u;-><init>(La/kmq;B)V

    .line 501
    .line 502
    .line 503
    iput v5, v0, La/r3v;->j:I

    .line 504
    .line 505
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    if-ne p0, p2, :cond_1f

    .line 510
    .line 511
    move-object v2, p2

    .line 512
    goto :goto_17

    .line 513
    :cond_1f
    :goto_16
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 514
    .line 515
    :goto_17
    return-object v2

    .line 516
    :pswitch_7
    instance-of v0, p2, La/b0v;

    .line 517
    .line 518
    if-eqz v0, :cond_20

    .line 519
    .line 520
    move-object v0, p2

    .line 521
    check-cast v0, La/b0v;

    .line 522
    .line 523
    iget v7, v0, La/b0v;->j:I

    .line 524
    .line 525
    and-int v8, v7, v4

    .line 526
    .line 527
    if-eqz v8, :cond_20

    .line 528
    .line 529
    sub-int/2addr v7, v4

    .line 530
    iput v7, v0, La/b0v;->j:I

    .line 531
    .line 532
    goto :goto_18

    .line 533
    :cond_20
    new-instance v0, La/b0v;

    .line 534
    .line 535
    invoke-direct {v0, p0, p2}, La/b0v;-><init>(La/ak9;La/yje;)V

    .line 536
    .line 537
    .line 538
    :goto_18
    iget-object p0, v0, La/b0v;->i:Ljava/lang/Object;

    .line 539
    .line 540
    sget-object p2, La/wne;->a:La/wne;

    .line 541
    .line 542
    iget v4, v0, La/b0v;->j:I

    .line 543
    .line 544
    if-eqz v4, :cond_22

    .line 545
    .line 546
    if-ne v4, v5, :cond_21

    .line 547
    .line 548
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    goto :goto_19

    .line 552
    :cond_21
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    goto :goto_1a

    .line 556
    :cond_22
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    new-instance p0, La/y6u;

    .line 560
    .line 561
    invoke-direct {p0, p1, v1}, La/y6u;-><init>(La/kmq;B)V

    .line 562
    .line 563
    .line 564
    iput v5, v0, La/b0v;->j:I

    .line 565
    .line 566
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    if-ne p0, p2, :cond_23

    .line 571
    .line 572
    move-object v2, p2

    .line 573
    goto :goto_1a

    .line 574
    :cond_23
    :goto_19
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    :goto_1a
    return-object v2

    .line 577
    :pswitch_8
    instance-of v0, p2, La/jiu;

    .line 578
    .line 579
    if-eqz v0, :cond_24

    .line 580
    .line 581
    move-object v0, p2

    .line 582
    check-cast v0, La/jiu;

    .line 583
    .line 584
    iget v1, v0, La/jiu;->j:I

    .line 585
    .line 586
    and-int v7, v1, v4

    .line 587
    .line 588
    if-eqz v7, :cond_24

    .line 589
    .line 590
    sub-int/2addr v1, v4

    .line 591
    iput v1, v0, La/jiu;->j:I

    .line 592
    .line 593
    goto :goto_1b

    .line 594
    :cond_24
    new-instance v0, La/jiu;

    .line 595
    .line 596
    invoke-direct {v0, p0, p2}, La/jiu;-><init>(La/ak9;La/yje;)V

    .line 597
    .line 598
    .line 599
    :goto_1b
    iget-object p0, v0, La/jiu;->i:Ljava/lang/Object;

    .line 600
    .line 601
    sget-object p2, La/wne;->a:La/wne;

    .line 602
    .line 603
    iget v1, v0, La/jiu;->j:I

    .line 604
    .line 605
    if-eqz v1, :cond_26

    .line 606
    .line 607
    if-ne v1, v5, :cond_25

    .line 608
    .line 609
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    goto :goto_1c

    .line 613
    :cond_25
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    goto :goto_1d

    .line 617
    :cond_26
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    new-instance p0, La/y6u;

    .line 621
    .line 622
    const/16 v1, 0x8

    .line 623
    .line 624
    invoke-direct {p0, p1, v1}, La/y6u;-><init>(La/kmq;B)V

    .line 625
    .line 626
    .line 627
    iput v5, v0, La/jiu;->j:I

    .line 628
    .line 629
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    if-ne p0, p2, :cond_27

    .line 634
    .line 635
    move-object v2, p2

    .line 636
    goto :goto_1d

    .line 637
    :cond_27
    :goto_1c
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 638
    .line 639
    :goto_1d
    return-object v2

    .line 640
    :pswitch_9
    instance-of v0, p2, La/t1d;

    .line 641
    .line 642
    if-eqz v0, :cond_28

    .line 643
    .line 644
    move-object v0, p2

    .line 645
    check-cast v0, La/t1d;

    .line 646
    .line 647
    iget v1, v0, La/t1d;->j:I

    .line 648
    .line 649
    and-int v7, v1, v4

    .line 650
    .line 651
    if-eqz v7, :cond_28

    .line 652
    .line 653
    sub-int/2addr v1, v4

    .line 654
    iput v1, v0, La/t1d;->j:I

    .line 655
    .line 656
    goto :goto_1e

    .line 657
    :cond_28
    new-instance v0, La/t1d;

    .line 658
    .line 659
    invoke-direct {v0, p0, p2}, La/t1d;-><init>(La/ak9;La/yje;)V

    .line 660
    .line 661
    .line 662
    :goto_1e
    iget-object p0, v0, La/t1d;->i:Ljava/lang/Object;

    .line 663
    .line 664
    sget-object p2, La/wne;->a:La/wne;

    .line 665
    .line 666
    iget v1, v0, La/t1d;->j:I

    .line 667
    .line 668
    if-eqz v1, :cond_2a

    .line 669
    .line 670
    if-ne v1, v5, :cond_29

    .line 671
    .line 672
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    goto :goto_1f

    .line 676
    :cond_29
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    goto :goto_20

    .line 680
    :cond_2a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    new-instance p0, La/osa;

    .line 684
    .line 685
    const/16 v1, 0xc

    .line 686
    .line 687
    invoke-direct {p0, p1, v1}, La/osa;-><init>(La/kmq;B)V

    .line 688
    .line 689
    .line 690
    iput v5, v0, La/t1d;->j:I

    .line 691
    .line 692
    invoke-virtual {v6, p0, v0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object p0

    .line 696
    if-ne p0, p2, :cond_2b

    .line 697
    .line 698
    move-object v2, p2

    .line 699
    goto :goto_20

    .line 700
    :cond_2b
    :goto_1f
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 701
    .line 702
    :goto_20
    return-object v2

    .line 703
    :pswitch_a
    new-instance p0, La/qo3;

    .line 704
    .line 705
    const/16 v0, 0x19

    .line 706
    .line 707
    invoke-direct {p0, p1, v0}, La/qo3;-><init>(La/kmq;B)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v6, p0, p2}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object p0

    .line 714
    sget-object p1, La/wne;->a:La/wne;

    .line 715
    .line 716
    if-ne p0, p1, :cond_2c

    .line 717
    .line 718
    goto :goto_21

    .line 719
    :cond_2c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 720
    .line 721
    :goto_21
    return-object p0

    .line 722
    nop

    .line 723
    :pswitch_data_0
    .packed-switch 0x0
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
