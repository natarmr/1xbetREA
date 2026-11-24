.class public final La/ui1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/d9z;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/d9z;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ui1;->a:B

    iput-object p2, p0, La/ui1;->c:La/d9z;

    iput-object p1, p0, La/ui1;->b:La/kmq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ui1;->a:B

    .line 2
    .line 3
    const-class v1, La/eol;

    .line 4
    .line 5
    iget-object v2, p0, La/ui1;->c:La/d9z;

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object p0, p0, La/ui1;->b:La/kmq;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    const-class v0, La/st0;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    :cond_0
    move v5, v6

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-eqz v7, :cond_0

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, La/r8z;

    .line 45
    .line 46
    iget-object v7, v7, La/r8z;->j:Ljava/lang/Object;

    .line 47
    .line 48
    sget-object v8, La/sre0;->a:La/tre0;

    .line 49
    .line 50
    invoke-virtual {v8, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_2

    .line 59
    .line 60
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-interface {p1, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :cond_3
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    move-object v6, v1

    .line 79
    check-cast v6, La/r8z;

    .line 80
    .line 81
    iget-object v6, v6, La/r8z;->j:Ljava/lang/Object;

    .line 82
    .line 83
    sget-object v7, La/sre0;->a:La/tre0;

    .line 84
    .line 85
    invoke-virtual {v7, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_3

    .line 94
    .line 95
    move-object v4, v1

    .line 96
    :cond_4
    check-cast v4, La/r8z;

    .line 97
    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    iget v3, v4, La/r8z;->a:I

    .line 101
    .line 102
    :cond_5
    if-eqz v5, :cond_6

    .line 103
    .line 104
    invoke-virtual {v2}, La/d9z;->j()La/q8z;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget p1, p1, La/q8z;->q:I

    .line 109
    .line 110
    add-int/lit8 p1, p1, -0x6

    .line 111
    .line 112
    if-lt v3, p1, :cond_6

    .line 113
    .line 114
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    invoke-interface {p0, p1, p2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    sget-object p1, La/wne;->a:La/wne;

    .line 121
    .line 122
    if-ne p0, p1, :cond_6

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    :goto_1
    return-object p0

    .line 128
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 129
    .line 130
    if-eqz p1, :cond_8

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    :cond_7
    move v5, v6

    .line 139
    goto :goto_2

    .line 140
    :cond_8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-eqz v7, :cond_7

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    check-cast v7, La/r8z;

    .line 155
    .line 156
    iget-object v7, v7, La/r8z;->j:Ljava/lang/Object;

    .line 157
    .line 158
    sget-object v8, La/sre0;->a:La/tre0;

    .line 159
    .line 160
    invoke-virtual {v8, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_9

    .line 169
    .line 170
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    :cond_a
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    move-object v6, v0

    .line 189
    check-cast v6, La/r8z;

    .line 190
    .line 191
    iget-object v6, v6, La/r8z;->j:Ljava/lang/Object;

    .line 192
    .line 193
    sget-object v7, La/sre0;->a:La/tre0;

    .line 194
    .line 195
    invoke-virtual {v7, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-eqz v6, :cond_a

    .line 204
    .line 205
    move-object v4, v0

    .line 206
    :cond_b
    check-cast v4, La/r8z;

    .line 207
    .line 208
    if-eqz v4, :cond_c

    .line 209
    .line 210
    iget v3, v4, La/r8z;->a:I

    .line 211
    .line 212
    :cond_c
    if-eqz v5, :cond_d

    .line 213
    .line 214
    invoke-virtual {v2}, La/d9z;->j()La/q8z;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iget p1, p1, La/q8z;->q:I

    .line 219
    .line 220
    add-int/lit8 p1, p1, -0x9

    .line 221
    .line 222
    if-lt v3, p1, :cond_d

    .line 223
    .line 224
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    invoke-interface {p0, p1, p2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    sget-object p1, La/wne;->a:La/wne;

    .line 231
    .line 232
    if-ne p0, p1, :cond_d

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    :goto_3
    return-object p0

    .line 238
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 239
    .line 240
    const-class v0, La/ezh;

    .line 241
    .line 242
    if-eqz p1, :cond_f

    .line 243
    .line 244
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_f

    .line 249
    .line 250
    :cond_e
    move v5, v6

    .line 251
    goto :goto_4

    .line 252
    :cond_f
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_e

    .line 261
    .line 262
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    check-cast v7, La/r8z;

    .line 267
    .line 268
    iget-object v7, v7, La/r8z;->j:Ljava/lang/Object;

    .line 269
    .line 270
    sget-object v8, La/sre0;->a:La/tre0;

    .line 271
    .line 272
    invoke-virtual {v8, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    if-eqz v7, :cond_10

    .line 281
    .line 282
    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-interface {p1, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    :cond_11
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_12

    .line 295
    .line 296
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    move-object v6, v1

    .line 301
    check-cast v6, La/r8z;

    .line 302
    .line 303
    iget-object v6, v6, La/r8z;->j:Ljava/lang/Object;

    .line 304
    .line 305
    sget-object v7, La/sre0;->a:La/tre0;

    .line 306
    .line 307
    invoke-virtual {v7, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    if-eqz v6, :cond_11

    .line 316
    .line 317
    move-object v4, v1

    .line 318
    :cond_12
    check-cast v4, La/r8z;

    .line 319
    .line 320
    if-eqz v4, :cond_13

    .line 321
    .line 322
    iget v3, v4, La/r8z;->a:I

    .line 323
    .line 324
    :cond_13
    if-eqz v5, :cond_14

    .line 325
    .line 326
    invoke-virtual {v2}, La/d9z;->j()La/q8z;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    iget p1, p1, La/q8z;->q:I

    .line 331
    .line 332
    add-int/lit8 p1, p1, -0x6

    .line 333
    .line 334
    if-lt v3, p1, :cond_14

    .line 335
    .line 336
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    invoke-interface {p0, p1, p2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    sget-object p1, La/wne;->a:La/wne;

    .line 343
    .line 344
    if-ne p0, p1, :cond_14

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    :goto_5
    return-object p0

    .line 350
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 351
    .line 352
    if-eqz p1, :cond_16

    .line 353
    .line 354
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_16

    .line 359
    .line 360
    :cond_15
    move v5, v6

    .line 361
    goto :goto_6

    .line 362
    :cond_16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    if-eqz v7, :cond_15

    .line 371
    .line 372
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    check-cast v7, La/r8z;

    .line 377
    .line 378
    iget-object v7, v7, La/r8z;->j:Ljava/lang/Object;

    .line 379
    .line 380
    sget-object v8, La/sre0;->a:La/tre0;

    .line 381
    .line 382
    invoke-virtual {v8, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    if-eqz v7, :cond_17

    .line 391
    .line 392
    :goto_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    :cond_18
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-eqz v0, :cond_19

    .line 405
    .line 406
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    move-object v6, v0

    .line 411
    check-cast v6, La/r8z;

    .line 412
    .line 413
    iget-object v6, v6, La/r8z;->j:Ljava/lang/Object;

    .line 414
    .line 415
    sget-object v7, La/sre0;->a:La/tre0;

    .line 416
    .line 417
    invoke-virtual {v7, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v6

    .line 425
    if-eqz v6, :cond_18

    .line 426
    .line 427
    move-object v4, v0

    .line 428
    :cond_19
    check-cast v4, La/r8z;

    .line 429
    .line 430
    if-eqz v4, :cond_1a

    .line 431
    .line 432
    iget v3, v4, La/r8z;->a:I

    .line 433
    .line 434
    :cond_1a
    if-eqz v5, :cond_1b

    .line 435
    .line 436
    invoke-virtual {v2}, La/d9z;->j()La/q8z;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    iget p1, p1, La/q8z;->q:I

    .line 441
    .line 442
    add-int/lit8 p1, p1, -0x9

    .line 443
    .line 444
    if-lt v3, p1, :cond_1b

    .line 445
    .line 446
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 447
    .line 448
    invoke-interface {p0, p1, p2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    sget-object p1, La/wne;->a:La/wne;

    .line 453
    .line 454
    if-ne p0, p1, :cond_1b

    .line 455
    .line 456
    goto :goto_7

    .line 457
    :cond_1b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    :goto_7
    return-object p0

    .line 460
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 461
    .line 462
    if-eqz p1, :cond_1d

    .line 463
    .line 464
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-eqz v0, :cond_1d

    .line 469
    .line 470
    :cond_1c
    move v5, v6

    .line 471
    goto :goto_8

    .line 472
    :cond_1d
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v7

    .line 480
    if-eqz v7, :cond_1c

    .line 481
    .line 482
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v7

    .line 486
    check-cast v7, La/r8z;

    .line 487
    .line 488
    iget-object v7, v7, La/r8z;->j:Ljava/lang/Object;

    .line 489
    .line 490
    sget-object v8, La/sre0;->a:La/tre0;

    .line 491
    .line 492
    invoke-virtual {v8, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v7

    .line 500
    if-eqz v7, :cond_1e

    .line 501
    .line 502
    :goto_8
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    :cond_1f
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-eqz v0, :cond_20

    .line 515
    .line 516
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    move-object v6, v0

    .line 521
    check-cast v6, La/r8z;

    .line 522
    .line 523
    iget-object v6, v6, La/r8z;->j:Ljava/lang/Object;

    .line 524
    .line 525
    sget-object v7, La/sre0;->a:La/tre0;

    .line 526
    .line 527
    invoke-virtual {v7, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result v6

    .line 535
    if-eqz v6, :cond_1f

    .line 536
    .line 537
    move-object v4, v0

    .line 538
    :cond_20
    check-cast v4, La/r8z;

    .line 539
    .line 540
    if-eqz v4, :cond_21

    .line 541
    .line 542
    iget v3, v4, La/r8z;->a:I

    .line 543
    .line 544
    :cond_21
    if-eqz v5, :cond_22

    .line 545
    .line 546
    invoke-virtual {v2}, La/d9z;->j()La/q8z;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    iget p1, p1, La/q8z;->q:I

    .line 551
    .line 552
    add-int/lit8 p1, p1, -0x9

    .line 553
    .line 554
    if-lt v3, p1, :cond_22

    .line 555
    .line 556
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 557
    .line 558
    invoke-interface {p0, p1, p2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    sget-object p1, La/wne;->a:La/wne;

    .line 563
    .line 564
    if-ne p0, p1, :cond_22

    .line 565
    .line 566
    goto :goto_9

    .line 567
    :cond_22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 568
    .line 569
    :goto_9
    return-object p0

    .line 570
    nop

    .line 571
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
