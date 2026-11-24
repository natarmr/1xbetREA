.class public final La/xp90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i89;


# direct methods
.method public synthetic constructor <init>(La/i89;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xp90;->a:B

    iput-object p1, p0, La/xp90;->b:La/i89;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/xp90;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/xp90;->b:La/i89;

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
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    instance-of v0, p2, La/ekr0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/ekr0;

    .line 20
    .line 21
    iget v6, v0, La/ekr0;->j:I

    .line 22
    .line 23
    and-int v7, v6, v4

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v6, v4

    .line 28
    iput v6, v0, La/ekr0;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/ekr0;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/ekr0;-><init>(La/xp90;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/ekr0;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/ekr0;->j:I

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/d8n0;

    .line 58
    .line 59
    const/16 v2, 0x17

    .line 60
    .line 61
    invoke-direct {p0, p1, v2}, La/d8n0;-><init>(La/kmq;B)V

    .line 62
    .line 63
    .line 64
    iput v5, v0, La/ekr0;->j:I

    .line 65
    .line 66
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, p2, :cond_3

    .line 71
    .line 72
    move-object v2, p2

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_2
    return-object v2

    .line 77
    :pswitch_0
    instance-of v0, p2, La/pwp0;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    move-object v0, p2

    .line 82
    check-cast v0, La/pwp0;

    .line 83
    .line 84
    iget v6, v0, La/pwp0;->j:I

    .line 85
    .line 86
    and-int v7, v6, v4

    .line 87
    .line 88
    if-eqz v7, :cond_4

    .line 89
    .line 90
    sub-int/2addr v6, v4

    .line 91
    iput v6, v0, La/pwp0;->j:I

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    new-instance v0, La/pwp0;

    .line 95
    .line 96
    invoke-direct {v0, p0, p2}, La/pwp0;-><init>(La/xp90;La/yje;)V

    .line 97
    .line 98
    .line 99
    :goto_3
    iget-object p0, v0, La/pwp0;->i:Ljava/lang/Object;

    .line 100
    .line 101
    sget-object p2, La/wne;->a:La/wne;

    .line 102
    .line 103
    iget v4, v0, La/pwp0;->j:I

    .line 104
    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    if-ne v4, v5, :cond_5

    .line 108
    .line 109
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance p0, La/d8n0;

    .line 121
    .line 122
    const/16 v2, 0x13

    .line 123
    .line 124
    invoke-direct {p0, p1, v2}, La/d8n0;-><init>(La/kmq;B)V

    .line 125
    .line 126
    .line 127
    iput v5, v0, La/pwp0;->j:I

    .line 128
    .line 129
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, p2, :cond_7

    .line 134
    .line 135
    move-object v2, p2

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_5
    return-object v2

    .line 140
    :pswitch_1
    instance-of v0, p2, La/pxj0;

    .line 141
    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    move-object v0, p2

    .line 145
    check-cast v0, La/pxj0;

    .line 146
    .line 147
    iget v6, v0, La/pxj0;->j:I

    .line 148
    .line 149
    and-int v7, v6, v4

    .line 150
    .line 151
    if-eqz v7, :cond_8

    .line 152
    .line 153
    sub-int/2addr v6, v4

    .line 154
    iput v6, v0, La/pxj0;->j:I

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_8
    new-instance v0, La/pxj0;

    .line 158
    .line 159
    invoke-direct {v0, p0, p2}, La/pxj0;-><init>(La/xp90;La/yje;)V

    .line 160
    .line 161
    .line 162
    :goto_6
    iget-object p0, v0, La/pxj0;->i:Ljava/lang/Object;

    .line 163
    .line 164
    sget-object p2, La/wne;->a:La/wne;

    .line 165
    .line 166
    iget v4, v0, La/pxj0;->j:I

    .line 167
    .line 168
    if-eqz v4, :cond_a

    .line 169
    .line 170
    if-ne v4, v5, :cond_9

    .line 171
    .line 172
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    new-instance p0, La/r5j0;

    .line 184
    .line 185
    const/16 v2, 0xf

    .line 186
    .line 187
    invoke-direct {p0, p1, v2}, La/r5j0;-><init>(La/kmq;B)V

    .line 188
    .line 189
    .line 190
    iput v5, v0, La/pxj0;->j:I

    .line 191
    .line 192
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    if-ne p0, p2, :cond_b

    .line 197
    .line 198
    move-object v2, p2

    .line 199
    goto :goto_8

    .line 200
    :cond_b
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    :goto_8
    return-object v2

    .line 203
    :pswitch_2
    instance-of v0, p2, La/ltj0;

    .line 204
    .line 205
    if-eqz v0, :cond_c

    .line 206
    .line 207
    move-object v0, p2

    .line 208
    check-cast v0, La/ltj0;

    .line 209
    .line 210
    iget v6, v0, La/ltj0;->j:I

    .line 211
    .line 212
    and-int v7, v6, v4

    .line 213
    .line 214
    if-eqz v7, :cond_c

    .line 215
    .line 216
    sub-int/2addr v6, v4

    .line 217
    iput v6, v0, La/ltj0;->j:I

    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_c
    new-instance v0, La/ltj0;

    .line 221
    .line 222
    invoke-direct {v0, p0, p2}, La/ltj0;-><init>(La/xp90;La/yje;)V

    .line 223
    .line 224
    .line 225
    :goto_9
    iget-object p0, v0, La/ltj0;->i:Ljava/lang/Object;

    .line 226
    .line 227
    sget-object p2, La/wne;->a:La/wne;

    .line 228
    .line 229
    iget v4, v0, La/ltj0;->j:I

    .line 230
    .line 231
    if-eqz v4, :cond_e

    .line 232
    .line 233
    if-ne v4, v5, :cond_d

    .line 234
    .line 235
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_a

    .line 239
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    goto :goto_b

    .line 243
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    new-instance p0, La/r5j0;

    .line 247
    .line 248
    const/16 v2, 0xc

    .line 249
    .line 250
    invoke-direct {p0, p1, v2}, La/r5j0;-><init>(La/kmq;B)V

    .line 251
    .line 252
    .line 253
    iput v5, v0, La/ltj0;->j:I

    .line 254
    .line 255
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

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
    instance-of v0, p2, La/fgj0;

    .line 267
    .line 268
    if-eqz v0, :cond_10

    .line 269
    .line 270
    move-object v0, p2

    .line 271
    check-cast v0, La/fgj0;

    .line 272
    .line 273
    iget v6, v0, La/fgj0;->j:I

    .line 274
    .line 275
    and-int v7, v6, v4

    .line 276
    .line 277
    if-eqz v7, :cond_10

    .line 278
    .line 279
    sub-int/2addr v6, v4

    .line 280
    iput v6, v0, La/fgj0;->j:I

    .line 281
    .line 282
    goto :goto_c

    .line 283
    :cond_10
    new-instance v0, La/fgj0;

    .line 284
    .line 285
    invoke-direct {v0, p0, p2}, La/fgj0;-><init>(La/xp90;La/yje;)V

    .line 286
    .line 287
    .line 288
    :goto_c
    iget-object p0, v0, La/fgj0;->i:Ljava/lang/Object;

    .line 289
    .line 290
    sget-object p2, La/wne;->a:La/wne;

    .line 291
    .line 292
    iget v4, v0, La/fgj0;->j:I

    .line 293
    .line 294
    if-eqz v4, :cond_12

    .line 295
    .line 296
    if-ne v4, v5, :cond_11

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
    new-instance p0, La/r5j0;

    .line 310
    .line 311
    const/16 v2, 0x9

    .line 312
    .line 313
    invoke-direct {p0, p1, v2}, La/r5j0;-><init>(La/kmq;B)V

    .line 314
    .line 315
    .line 316
    iput v5, v0, La/fgj0;->j:I

    .line 317
    .line 318
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    if-ne p0, p2, :cond_13

    .line 323
    .line 324
    move-object v2, p2

    .line 325
    goto :goto_e

    .line 326
    :cond_13
    :goto_d
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 327
    .line 328
    :goto_e
    return-object v2

    .line 329
    :pswitch_4
    instance-of v0, p2, La/zej0;

    .line 330
    .line 331
    if-eqz v0, :cond_14

    .line 332
    .line 333
    move-object v0, p2

    .line 334
    check-cast v0, La/zej0;

    .line 335
    .line 336
    iget v6, v0, La/zej0;->j:I

    .line 337
    .line 338
    and-int v7, v6, v4

    .line 339
    .line 340
    if-eqz v7, :cond_14

    .line 341
    .line 342
    sub-int/2addr v6, v4

    .line 343
    iput v6, v0, La/zej0;->j:I

    .line 344
    .line 345
    goto :goto_f

    .line 346
    :cond_14
    new-instance v0, La/zej0;

    .line 347
    .line 348
    invoke-direct {v0, p0, p2}, La/zej0;-><init>(La/xp90;La/yje;)V

    .line 349
    .line 350
    .line 351
    :goto_f
    iget-object p0, v0, La/zej0;->i:Ljava/lang/Object;

    .line 352
    .line 353
    sget-object p2, La/wne;->a:La/wne;

    .line 354
    .line 355
    iget v4, v0, La/zej0;->j:I

    .line 356
    .line 357
    if-eqz v4, :cond_16

    .line 358
    .line 359
    if-ne v4, v5, :cond_15

    .line 360
    .line 361
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    goto :goto_10

    .line 365
    :cond_15
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    goto :goto_11

    .line 369
    :cond_16
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    new-instance p0, La/r5j0;

    .line 373
    .line 374
    const/4 v2, 0x6

    .line 375
    invoke-direct {p0, p1, v2}, La/r5j0;-><init>(La/kmq;B)V

    .line 376
    .line 377
    .line 378
    iput v5, v0, La/zej0;->j:I

    .line 379
    .line 380
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    if-ne p0, p2, :cond_17

    .line 385
    .line 386
    move-object v2, p2

    .line 387
    goto :goto_11

    .line 388
    :cond_17
    :goto_10
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    :goto_11
    return-object v2

    .line 391
    :pswitch_5
    instance-of v0, p2, La/gdj0;

    .line 392
    .line 393
    if-eqz v0, :cond_18

    .line 394
    .line 395
    move-object v0, p2

    .line 396
    check-cast v0, La/gdj0;

    .line 397
    .line 398
    iget v6, v0, La/gdj0;->j:I

    .line 399
    .line 400
    and-int v7, v6, v4

    .line 401
    .line 402
    if-eqz v7, :cond_18

    .line 403
    .line 404
    sub-int/2addr v6, v4

    .line 405
    iput v6, v0, La/gdj0;->j:I

    .line 406
    .line 407
    goto :goto_12

    .line 408
    :cond_18
    new-instance v0, La/gdj0;

    .line 409
    .line 410
    invoke-direct {v0, p0, p2}, La/gdj0;-><init>(La/xp90;La/yje;)V

    .line 411
    .line 412
    .line 413
    :goto_12
    iget-object p0, v0, La/gdj0;->i:Ljava/lang/Object;

    .line 414
    .line 415
    sget-object p2, La/wne;->a:La/wne;

    .line 416
    .line 417
    iget v4, v0, La/gdj0;->j:I

    .line 418
    .line 419
    if-eqz v4, :cond_1a

    .line 420
    .line 421
    if-ne v4, v5, :cond_19

    .line 422
    .line 423
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    goto :goto_13

    .line 427
    :cond_19
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    goto :goto_14

    .line 431
    :cond_1a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    new-instance p0, La/r5j0;

    .line 435
    .line 436
    const/4 v2, 0x3

    .line 437
    invoke-direct {p0, p1, v2}, La/r5j0;-><init>(La/kmq;B)V

    .line 438
    .line 439
    .line 440
    iput v5, v0, La/gdj0;->j:I

    .line 441
    .line 442
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

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
    instance-of v0, p2, La/pxi0;

    .line 454
    .line 455
    if-eqz v0, :cond_1c

    .line 456
    .line 457
    move-object v0, p2

    .line 458
    check-cast v0, La/pxi0;

    .line 459
    .line 460
    iget v6, v0, La/pxi0;->j:I

    .line 461
    .line 462
    and-int v7, v6, v4

    .line 463
    .line 464
    if-eqz v7, :cond_1c

    .line 465
    .line 466
    sub-int/2addr v6, v4

    .line 467
    iput v6, v0, La/pxi0;->j:I

    .line 468
    .line 469
    goto :goto_15

    .line 470
    :cond_1c
    new-instance v0, La/pxi0;

    .line 471
    .line 472
    invoke-direct {v0, p0, p2}, La/pxi0;-><init>(La/xp90;La/yje;)V

    .line 473
    .line 474
    .line 475
    :goto_15
    iget-object p0, v0, La/pxi0;->i:Ljava/lang/Object;

    .line 476
    .line 477
    sget-object p2, La/wne;->a:La/wne;

    .line 478
    .line 479
    iget v4, v0, La/pxi0;->j:I

    .line 480
    .line 481
    if-eqz v4, :cond_1e

    .line 482
    .line 483
    if-ne v4, v5, :cond_1d

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
    new-instance p0, La/hbb0;

    .line 497
    .line 498
    const/16 v2, 0x1c

    .line 499
    .line 500
    invoke-direct {p0, p1, v2}, La/hbb0;-><init>(La/kmq;B)V

    .line 501
    .line 502
    .line 503
    iput v5, v0, La/pxi0;->j:I

    .line 504
    .line 505
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

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
    instance-of v0, p2, La/r5g0;

    .line 517
    .line 518
    if-eqz v0, :cond_20

    .line 519
    .line 520
    move-object v0, p2

    .line 521
    check-cast v0, La/r5g0;

    .line 522
    .line 523
    iget v6, v0, La/r5g0;->j:I

    .line 524
    .line 525
    and-int v7, v6, v4

    .line 526
    .line 527
    if-eqz v7, :cond_20

    .line 528
    .line 529
    sub-int/2addr v6, v4

    .line 530
    iput v6, v0, La/r5g0;->j:I

    .line 531
    .line 532
    goto :goto_18

    .line 533
    :cond_20
    new-instance v0, La/r5g0;

    .line 534
    .line 535
    invoke-direct {v0, p0, p2}, La/r5g0;-><init>(La/xp90;La/yje;)V

    .line 536
    .line 537
    .line 538
    :goto_18
    iget-object p0, v0, La/r5g0;->i:Ljava/lang/Object;

    .line 539
    .line 540
    sget-object p2, La/wne;->a:La/wne;

    .line 541
    .line 542
    iget v4, v0, La/r5g0;->j:I

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
    new-instance p0, La/hbb0;

    .line 560
    .line 561
    const/16 v2, 0x16

    .line 562
    .line 563
    invoke-direct {p0, p1, v2}, La/hbb0;-><init>(La/kmq;B)V

    .line 564
    .line 565
    .line 566
    iput v5, v0, La/r5g0;->j:I

    .line 567
    .line 568
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    if-ne p0, p2, :cond_23

    .line 573
    .line 574
    move-object v2, p2

    .line 575
    goto :goto_1a

    .line 576
    :cond_23
    :goto_19
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 577
    .line 578
    :goto_1a
    return-object v2

    .line 579
    :pswitch_8
    instance-of v0, p2, La/t6f0;

    .line 580
    .line 581
    if-eqz v0, :cond_24

    .line 582
    .line 583
    move-object v0, p2

    .line 584
    check-cast v0, La/t6f0;

    .line 585
    .line 586
    iget v6, v0, La/t6f0;->j:I

    .line 587
    .line 588
    and-int v7, v6, v4

    .line 589
    .line 590
    if-eqz v7, :cond_24

    .line 591
    .line 592
    sub-int/2addr v6, v4

    .line 593
    iput v6, v0, La/t6f0;->j:I

    .line 594
    .line 595
    goto :goto_1b

    .line 596
    :cond_24
    new-instance v0, La/t6f0;

    .line 597
    .line 598
    invoke-direct {v0, p0, p2}, La/t6f0;-><init>(La/xp90;La/yje;)V

    .line 599
    .line 600
    .line 601
    :goto_1b
    iget-object p0, v0, La/t6f0;->i:Ljava/lang/Object;

    .line 602
    .line 603
    sget-object p2, La/wne;->a:La/wne;

    .line 604
    .line 605
    iget v4, v0, La/t6f0;->j:I

    .line 606
    .line 607
    if-eqz v4, :cond_26

    .line 608
    .line 609
    if-ne v4, v5, :cond_25

    .line 610
    .line 611
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    goto :goto_1c

    .line 615
    :cond_25
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    goto :goto_1d

    .line 619
    :cond_26
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    new-instance p0, La/hbb0;

    .line 623
    .line 624
    const/16 v2, 0xe

    .line 625
    .line 626
    invoke-direct {p0, p1, v2}, La/hbb0;-><init>(La/kmq;B)V

    .line 627
    .line 628
    .line 629
    iput v5, v0, La/t6f0;->j:I

    .line 630
    .line 631
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    if-ne p0, p2, :cond_27

    .line 636
    .line 637
    move-object v2, p2

    .line 638
    goto :goto_1d

    .line 639
    :cond_27
    :goto_1c
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    :goto_1d
    return-object v2

    .line 642
    :pswitch_9
    instance-of v0, p2, La/q6f0;

    .line 643
    .line 644
    if-eqz v0, :cond_28

    .line 645
    .line 646
    move-object v0, p2

    .line 647
    check-cast v0, La/q6f0;

    .line 648
    .line 649
    iget v6, v0, La/q6f0;->j:I

    .line 650
    .line 651
    and-int v7, v6, v4

    .line 652
    .line 653
    if-eqz v7, :cond_28

    .line 654
    .line 655
    sub-int/2addr v6, v4

    .line 656
    iput v6, v0, La/q6f0;->j:I

    .line 657
    .line 658
    goto :goto_1e

    .line 659
    :cond_28
    new-instance v0, La/q6f0;

    .line 660
    .line 661
    invoke-direct {v0, p0, p2}, La/q6f0;-><init>(La/xp90;La/yje;)V

    .line 662
    .line 663
    .line 664
    :goto_1e
    iget-object p0, v0, La/q6f0;->i:Ljava/lang/Object;

    .line 665
    .line 666
    sget-object p2, La/wne;->a:La/wne;

    .line 667
    .line 668
    iget v4, v0, La/q6f0;->j:I

    .line 669
    .line 670
    if-eqz v4, :cond_2a

    .line 671
    .line 672
    if-ne v4, v5, :cond_29

    .line 673
    .line 674
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    goto :goto_1f

    .line 678
    :cond_29
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    goto :goto_20

    .line 682
    :cond_2a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    new-instance p0, La/hbb0;

    .line 686
    .line 687
    const/16 v2, 0xd

    .line 688
    .line 689
    invoke-direct {p0, p1, v2}, La/hbb0;-><init>(La/kmq;B)V

    .line 690
    .line 691
    .line 692
    iput v5, v0, La/q6f0;->j:I

    .line 693
    .line 694
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object p0

    .line 698
    if-ne p0, p2, :cond_2b

    .line 699
    .line 700
    move-object v2, p2

    .line 701
    goto :goto_20

    .line 702
    :cond_2b
    :goto_1f
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    :goto_20
    return-object v2

    .line 705
    :pswitch_a
    instance-of v0, p2, La/vp90;

    .line 706
    .line 707
    if-eqz v0, :cond_2c

    .line 708
    .line 709
    move-object v0, p2

    .line 710
    check-cast v0, La/vp90;

    .line 711
    .line 712
    iget v6, v0, La/vp90;->j:I

    .line 713
    .line 714
    and-int v7, v6, v4

    .line 715
    .line 716
    if-eqz v7, :cond_2c

    .line 717
    .line 718
    sub-int/2addr v6, v4

    .line 719
    iput v6, v0, La/vp90;->j:I

    .line 720
    .line 721
    goto :goto_21

    .line 722
    :cond_2c
    new-instance v0, La/vp90;

    .line 723
    .line 724
    invoke-direct {v0, p0, p2}, La/vp90;-><init>(La/xp90;La/yje;)V

    .line 725
    .line 726
    .line 727
    :goto_21
    iget-object p0, v0, La/vp90;->i:Ljava/lang/Object;

    .line 728
    .line 729
    sget-object p2, La/wne;->a:La/wne;

    .line 730
    .line 731
    iget v4, v0, La/vp90;->j:I

    .line 732
    .line 733
    if-eqz v4, :cond_2e

    .line 734
    .line 735
    if-ne v4, v5, :cond_2d

    .line 736
    .line 737
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    goto :goto_22

    .line 741
    :cond_2d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    goto :goto_23

    .line 745
    :cond_2e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    new-instance p0, La/ld60;

    .line 749
    .line 750
    const/16 v2, 0x12

    .line 751
    .line 752
    invoke-direct {p0, p1, v2}, La/ld60;-><init>(La/kmq;B)V

    .line 753
    .line 754
    .line 755
    iput v5, v0, La/vp90;->j:I

    .line 756
    .line 757
    invoke-virtual {v1, p0, v0}, La/i89;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object p0

    .line 761
    if-ne p0, p2, :cond_2f

    .line 762
    .line 763
    move-object v2, p2

    .line 764
    goto :goto_23

    .line 765
    :cond_2f
    :goto_22
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 766
    .line 767
    :goto_23
    return-object v2

    .line 768
    nop

    .line 769
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
