.class public final La/ofv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;


# direct methods
.method public synthetic constructor <init>(La/kmq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ofv0;->a:B

    iput-object p1, p0, La/ofv0;->b:La/kmq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ofv0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ofv0;->b:La/kmq;

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
    instance-of v0, p2, La/v6w0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/v6w0;

    .line 20
    .line 21
    iget v6, v0, La/v6w0;->j:I

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
    iput v6, v0, La/v6w0;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/v6w0;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/v6w0;-><init>(La/ofv0;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/v6w0;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/v6w0;->j:I

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
    check-cast p1, La/iqt0;

    .line 58
    .line 59
    iget-object p0, p1, La/iqt0;->a:Ljava/lang/String;

    .line 60
    .line 61
    iput v5, v0, La/v6w0;->j:I

    .line 62
    .line 63
    invoke-interface {v1, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, p2, :cond_3

    .line 68
    .line 69
    move-object v2, p2

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    :goto_2
    return-object v2

    .line 74
    :pswitch_0
    instance-of v0, p2, La/pzv0;

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    move-object v0, p2

    .line 79
    check-cast v0, La/pzv0;

    .line 80
    .line 81
    iget v6, v0, La/pzv0;->j:I

    .line 82
    .line 83
    and-int v7, v6, v4

    .line 84
    .line 85
    if-eqz v7, :cond_4

    .line 86
    .line 87
    sub-int/2addr v6, v4

    .line 88
    iput v6, v0, La/pzv0;->j:I

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    new-instance v0, La/pzv0;

    .line 92
    .line 93
    invoke-direct {v0, p0, p2}, La/pzv0;-><init>(La/ofv0;La/yje;)V

    .line 94
    .line 95
    .line 96
    :goto_3
    iget-object p0, v0, La/pzv0;->i:Ljava/lang/Object;

    .line 97
    .line 98
    sget-object p2, La/wne;->a:La/wne;

    .line 99
    .line 100
    iget v4, v0, La/pzv0;->j:I

    .line 101
    .line 102
    if-eqz v4, :cond_6

    .line 103
    .line 104
    if-ne v4, v5, :cond_5

    .line 105
    .line 106
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    check-cast p1, Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {p1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iput v5, v0, La/pzv0;->j:I

    .line 137
    .line 138
    invoke-interface {v1, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-ne p0, p2, :cond_7

    .line 143
    .line 144
    move-object v2, p2

    .line 145
    goto :goto_5

    .line 146
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_5
    return-object v2

    .line 149
    :pswitch_1
    instance-of v0, p2, La/lzv0;

    .line 150
    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    move-object v0, p2

    .line 154
    check-cast v0, La/lzv0;

    .line 155
    .line 156
    iget v6, v0, La/lzv0;->j:I

    .line 157
    .line 158
    and-int v7, v6, v4

    .line 159
    .line 160
    if-eqz v7, :cond_8

    .line 161
    .line 162
    sub-int/2addr v6, v4

    .line 163
    iput v6, v0, La/lzv0;->j:I

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    new-instance v0, La/lzv0;

    .line 167
    .line 168
    invoke-direct {v0, p0, p2}, La/lzv0;-><init>(La/ofv0;La/yje;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    iget-object p0, v0, La/lzv0;->i:Ljava/lang/Object;

    .line 172
    .line 173
    sget-object p2, La/wne;->a:La/wne;

    .line 174
    .line 175
    iget v4, v0, La/lzv0;->j:I

    .line 176
    .line 177
    if-eqz v4, :cond_a

    .line 178
    .line 179
    if-ne v4, v5, :cond_9

    .line 180
    .line 181
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    check-cast p1, Lkotlin/Pair;

    .line 193
    .line 194
    iget-object p0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 195
    .line 196
    iput v5, v0, La/lzv0;->j:I

    .line 197
    .line 198
    invoke-interface {v1, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    if-ne p0, p2, :cond_b

    .line 203
    .line 204
    move-object v2, p2

    .line 205
    goto :goto_8

    .line 206
    :cond_b
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    :goto_8
    return-object v2

    .line 209
    :pswitch_2
    instance-of v0, p2, La/wyv0;

    .line 210
    .line 211
    if-eqz v0, :cond_c

    .line 212
    .line 213
    move-object v0, p2

    .line 214
    check-cast v0, La/wyv0;

    .line 215
    .line 216
    iget v6, v0, La/wyv0;->j:I

    .line 217
    .line 218
    and-int v7, v6, v4

    .line 219
    .line 220
    if-eqz v7, :cond_c

    .line 221
    .line 222
    sub-int/2addr v6, v4

    .line 223
    iput v6, v0, La/wyv0;->j:I

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_c
    new-instance v0, La/wyv0;

    .line 227
    .line 228
    invoke-direct {v0, p0, p2}, La/wyv0;-><init>(La/ofv0;La/yje;)V

    .line 229
    .line 230
    .line 231
    :goto_9
    iget-object p0, v0, La/wyv0;->i:Ljava/lang/Object;

    .line 232
    .line 233
    sget-object p2, La/wne;->a:La/wne;

    .line 234
    .line 235
    iget v4, v0, La/wyv0;->j:I

    .line 236
    .line 237
    if-eqz v4, :cond_e

    .line 238
    .line 239
    if-ne v4, v5, :cond_d

    .line 240
    .line 241
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto :goto_a

    .line 245
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    move-object p0, p1

    .line 253
    check-cast p0, Ljava/lang/Boolean;

    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-eqz p0, :cond_f

    .line 260
    .line 261
    iput v5, v0, La/wyv0;->j:I

    .line 262
    .line 263
    invoke-interface {v1, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    if-ne p0, p2, :cond_f

    .line 268
    .line 269
    move-object v2, p2

    .line 270
    goto :goto_b

    .line 271
    :cond_f
    :goto_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    :goto_b
    return-object v2

    .line 274
    :pswitch_3
    instance-of v0, p2, La/ivv0;

    .line 275
    .line 276
    if-eqz v0, :cond_10

    .line 277
    .line 278
    move-object v0, p2

    .line 279
    check-cast v0, La/ivv0;

    .line 280
    .line 281
    iget v6, v0, La/ivv0;->j:I

    .line 282
    .line 283
    and-int v7, v6, v4

    .line 284
    .line 285
    if-eqz v7, :cond_10

    .line 286
    .line 287
    sub-int/2addr v6, v4

    .line 288
    iput v6, v0, La/ivv0;->j:I

    .line 289
    .line 290
    goto :goto_c

    .line 291
    :cond_10
    new-instance v0, La/ivv0;

    .line 292
    .line 293
    invoke-direct {v0, p0, p2}, La/ivv0;-><init>(La/ofv0;La/yje;)V

    .line 294
    .line 295
    .line 296
    :goto_c
    iget-object p0, v0, La/ivv0;->i:Ljava/lang/Object;

    .line 297
    .line 298
    sget-object p2, La/wne;->a:La/wne;

    .line 299
    .line 300
    iget v4, v0, La/ivv0;->j:I

    .line 301
    .line 302
    if-eqz v4, :cond_12

    .line 303
    .line 304
    if-ne v4, v5, :cond_11

    .line 305
    .line 306
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    goto :goto_d

    .line 310
    :cond_11
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    goto :goto_e

    .line 314
    :cond_12
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    check-cast p1, La/gvv0;

    .line 318
    .line 319
    iget-object p0, p1, La/gvv0;->c:La/kvv0;

    .line 320
    .line 321
    iput v5, v0, La/ivv0;->j:I

    .line 322
    .line 323
    invoke-interface {v1, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    if-ne p0, p2, :cond_13

    .line 328
    .line 329
    move-object v2, p2

    .line 330
    goto :goto_e

    .line 331
    :cond_13
    :goto_d
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    :goto_e
    return-object v2

    .line 334
    :pswitch_4
    instance-of v0, p2, La/qpv0;

    .line 335
    .line 336
    if-eqz v0, :cond_14

    .line 337
    .line 338
    move-object v0, p2

    .line 339
    check-cast v0, La/qpv0;

    .line 340
    .line 341
    iget v6, v0, La/qpv0;->j:I

    .line 342
    .line 343
    and-int v7, v6, v4

    .line 344
    .line 345
    if-eqz v7, :cond_14

    .line 346
    .line 347
    sub-int/2addr v6, v4

    .line 348
    iput v6, v0, La/qpv0;->j:I

    .line 349
    .line 350
    goto :goto_f

    .line 351
    :cond_14
    new-instance v0, La/qpv0;

    .line 352
    .line 353
    invoke-direct {v0, p0, p2}, La/qpv0;-><init>(La/ofv0;La/yje;)V

    .line 354
    .line 355
    .line 356
    :goto_f
    iget-object p0, v0, La/qpv0;->i:Ljava/lang/Object;

    .line 357
    .line 358
    sget-object p2, La/wne;->a:La/wne;

    .line 359
    .line 360
    iget v4, v0, La/qpv0;->j:I

    .line 361
    .line 362
    if-eqz v4, :cond_16

    .line 363
    .line 364
    if-ne v4, v5, :cond_15

    .line 365
    .line 366
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    goto :goto_11

    .line 370
    :cond_15
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_12

    .line 374
    :cond_16
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    check-cast p1, Ljava/util/List;

    .line 378
    .line 379
    new-instance p0, Ljava/util/ArrayList;

    .line 380
    .line 381
    const/16 v2, 0xa

    .line 382
    .line 383
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-eqz v2, :cond_17

    .line 399
    .line 400
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    check-cast v2, La/opv0;

    .line 405
    .line 406
    invoke-virtual {v2}, La/opv0;->a()La/apv0;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    goto :goto_10

    .line 414
    :cond_17
    iput v5, v0, La/qpv0;->j:I

    .line 415
    .line 416
    invoke-interface {v1, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    if-ne p0, p2, :cond_18

    .line 421
    .line 422
    move-object v2, p2

    .line 423
    goto :goto_12

    .line 424
    :cond_18
    :goto_11
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    :goto_12
    return-object v2

    .line 427
    :pswitch_5
    instance-of v0, p2, La/jgv0;

    .line 428
    .line 429
    if-eqz v0, :cond_19

    .line 430
    .line 431
    move-object v0, p2

    .line 432
    check-cast v0, La/jgv0;

    .line 433
    .line 434
    iget v6, v0, La/jgv0;->j:I

    .line 435
    .line 436
    and-int v7, v6, v4

    .line 437
    .line 438
    if-eqz v7, :cond_19

    .line 439
    .line 440
    sub-int/2addr v6, v4

    .line 441
    iput v6, v0, La/jgv0;->j:I

    .line 442
    .line 443
    goto :goto_13

    .line 444
    :cond_19
    new-instance v0, La/jgv0;

    .line 445
    .line 446
    invoke-direct {v0, p0, p2}, La/jgv0;-><init>(La/ofv0;La/yje;)V

    .line 447
    .line 448
    .line 449
    :goto_13
    iget-object p0, v0, La/jgv0;->i:Ljava/lang/Object;

    .line 450
    .line 451
    sget-object p2, La/wne;->a:La/wne;

    .line 452
    .line 453
    iget v4, v0, La/jgv0;->j:I

    .line 454
    .line 455
    if-eqz v4, :cond_1b

    .line 456
    .line 457
    if-ne v4, v5, :cond_1a

    .line 458
    .line 459
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    goto :goto_16

    .line 463
    :cond_1a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    goto :goto_17

    .line 467
    :cond_1b
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    check-cast p1, Lkotlin/Pair;

    .line 471
    .line 472
    iget-object p0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast p0, Ljava/util/List;

    .line 475
    .line 476
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast p1, Ljava/lang/String;

    .line 479
    .line 480
    new-instance v2, Ljava/util/ArrayList;

    .line 481
    .line 482
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 483
    .line 484
    .line 485
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    :cond_1c
    :goto_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    if-eqz v3, :cond_1e

    .line 494
    .line 495
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    move-object v4, v3

    .line 500
    check-cast v4, La/pbv;

    .line 501
    .line 502
    iget-object v6, v4, La/pbv;->c:Ljava/lang/String;

    .line 503
    .line 504
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 505
    .line 506
    .line 507
    move-result-object v7

    .line 508
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-virtual {p1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    const/4 v8, 0x0

    .line 533
    invoke-static {v6, v7, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 534
    .line 535
    .line 536
    move-result v6

    .line 537
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 538
    .line 539
    .line 540
    move-result v7

    .line 541
    if-nez v7, :cond_1d

    .line 542
    .line 543
    goto :goto_15

    .line 544
    :cond_1d
    if-eqz v6, :cond_1c

    .line 545
    .line 546
    :goto_15
    iget-boolean v4, v4, La/pbv;->q:Z

    .line 547
    .line 548
    if-eqz v4, :cond_1c

    .line 549
    .line 550
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    goto :goto_14

    .line 554
    :cond_1e
    iput v5, v0, La/jgv0;->j:I

    .line 555
    .line 556
    invoke-interface {v1, v2, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object p0

    .line 560
    if-ne p0, p2, :cond_1f

    .line 561
    .line 562
    move-object v2, p2

    .line 563
    goto :goto_17

    .line 564
    :cond_1f
    :goto_16
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 565
    .line 566
    :goto_17
    return-object v2

    .line 567
    :pswitch_6
    instance-of v0, p2, La/nfv0;

    .line 568
    .line 569
    if-eqz v0, :cond_20

    .line 570
    .line 571
    move-object v0, p2

    .line 572
    check-cast v0, La/nfv0;

    .line 573
    .line 574
    iget v6, v0, La/nfv0;->j:I

    .line 575
    .line 576
    and-int v7, v6, v4

    .line 577
    .line 578
    if-eqz v7, :cond_20

    .line 579
    .line 580
    sub-int/2addr v6, v4

    .line 581
    iput v6, v0, La/nfv0;->j:I

    .line 582
    .line 583
    goto :goto_18

    .line 584
    :cond_20
    new-instance v0, La/nfv0;

    .line 585
    .line 586
    invoke-direct {v0, p0, p2}, La/nfv0;-><init>(La/ofv0;La/yje;)V

    .line 587
    .line 588
    .line 589
    :goto_18
    iget-object p0, v0, La/nfv0;->i:Ljava/lang/Object;

    .line 590
    .line 591
    sget-object p2, La/wne;->a:La/wne;

    .line 592
    .line 593
    iget v4, v0, La/nfv0;->j:I

    .line 594
    .line 595
    if-eqz v4, :cond_22

    .line 596
    .line 597
    if-ne v4, v5, :cond_21

    .line 598
    .line 599
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    goto :goto_19

    .line 603
    :cond_21
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    goto :goto_1a

    .line 607
    :cond_22
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    move-object p0, p1

    .line 611
    check-cast p0, Ljava/lang/Number;

    .line 612
    .line 613
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 614
    .line 615
    .line 616
    move-result-wide v2

    .line 617
    const-wide/16 v6, 0x0

    .line 618
    .line 619
    cmp-long p0, v2, v6

    .line 620
    .line 621
    if-lez p0, :cond_23

    .line 622
    .line 623
    iput v5, v0, La/nfv0;->j:I

    .line 624
    .line 625
    invoke-interface {v1, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object p0

    .line 629
    if-ne p0, p2, :cond_23

    .line 630
    .line 631
    move-object v2, p2

    .line 632
    goto :goto_1a

    .line 633
    :cond_23
    :goto_19
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 634
    .line 635
    :goto_1a
    return-object v2

    .line 636
    nop

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
