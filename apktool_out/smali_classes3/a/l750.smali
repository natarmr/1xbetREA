.class public final La/l750;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:La/ha8;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/ha8;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l750;->a:B

    iput-object p1, p0, La/l750;->b:Ljava/lang/String;

    iput-object p2, p0, La/l750;->c:La/ha8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/l750;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/l750;->c:La/ha8;

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/16 v5, 0xa

    .line 9
    .line 10
    iget-object p0, p0, La/l750;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, La/oyg0;

    .line 17
    .line 18
    move-object v7, p2

    .line 19
    check-cast v7, La/p650;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 28
    .line 29
    new-instance v9, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, La/jge;

    .line 53
    .line 54
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    instance-of v0, p2, La/age;

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    new-instance p2, La/age;

    .line 65
    .line 66
    invoke-direct {p2, v3}, La/age;-><init>(La/ha8;)V

    .line 67
    .line 68
    .line 69
    move v6, v4

    .line 70
    :cond_0
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    if-eqz v6, :cond_2

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const v12, 0x3ff7f

    .line 78
    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v10, 0x0

    .line 82
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    :cond_2
    return-object v7

    .line 87
    :pswitch_0
    check-cast p1, La/oyg0;

    .line 88
    .line 89
    move-object v7, p2

    .line 90
    check-cast v7, La/p650;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 99
    .line 100
    new-instance v9, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_4

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    check-cast p2, La/jge;

    .line 124
    .line 125
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_3

    .line 130
    .line 131
    instance-of v0, p2, La/zfe;

    .line 132
    .line 133
    if-eqz v0, :cond_3

    .line 134
    .line 135
    new-instance p2, La/y98;

    .line 136
    .line 137
    invoke-interface {v3}, La/ha8;->a()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-direct {p2, v0}, La/y98;-><init>(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance v0, La/zfe;

    .line 145
    .line 146
    invoke-direct {v0, p2}, La/zfe;-><init>(La/ha8;)V

    .line 147
    .line 148
    .line 149
    move-object p2, v0

    .line 150
    move v6, v4

    .line 151
    :cond_3
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_4
    if-eqz v6, :cond_5

    .line 156
    .line 157
    const/4 v11, 0x0

    .line 158
    const v12, 0x3ff7f

    .line 159
    .line 160
    .line 161
    const/4 v8, 0x0

    .line 162
    const/4 v10, 0x0

    .line 163
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    :cond_5
    return-object v7

    .line 168
    :pswitch_1
    check-cast p1, La/oyg0;

    .line 169
    .line 170
    move-object v7, p2

    .line 171
    check-cast v7, La/p650;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 180
    .line 181
    new-instance v9, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-eqz p2, :cond_7

    .line 199
    .line 200
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    check-cast p2, La/jge;

    .line 205
    .line 206
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_6

    .line 211
    .line 212
    instance-of v0, p2, La/zfe;

    .line 213
    .line 214
    if-eqz v0, :cond_6

    .line 215
    .line 216
    new-instance p2, La/aa8;

    .line 217
    .line 218
    invoke-interface {v3}, La/ha8;->a()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-direct {p2, v0}, La/aa8;-><init>(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    new-instance v0, La/zfe;

    .line 226
    .line 227
    invoke-direct {v0, p2}, La/zfe;-><init>(La/ha8;)V

    .line 228
    .line 229
    .line 230
    move-object p2, v0

    .line 231
    move v6, v4

    .line 232
    :cond_6
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_7
    if-eqz v6, :cond_8

    .line 237
    .line 238
    const/4 v11, 0x0

    .line 239
    const v12, 0x3ff7f

    .line 240
    .line 241
    .line 242
    const/4 v8, 0x0

    .line 243
    const/4 v10, 0x0

    .line 244
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    :cond_8
    return-object v7

    .line 249
    :pswitch_2
    check-cast p1, La/oyg0;

    .line 250
    .line 251
    move-object v7, p2

    .line 252
    check-cast v7, La/p650;

    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 261
    .line 262
    new-instance v9, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result p2

    .line 279
    if-eqz p2, :cond_a

    .line 280
    .line 281
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    check-cast p2, La/jge;

    .line 286
    .line 287
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_9

    .line 292
    .line 293
    instance-of v0, p2, La/fge;

    .line 294
    .line 295
    if-eqz v0, :cond_9

    .line 296
    .line 297
    new-instance p2, La/fge;

    .line 298
    .line 299
    invoke-direct {p2, v3}, La/fge;-><init>(La/ha8;)V

    .line 300
    .line 301
    .line 302
    move v6, v4

    .line 303
    :cond_9
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    goto :goto_3

    .line 307
    :cond_a
    if-eqz v6, :cond_b

    .line 308
    .line 309
    const/4 v11, 0x0

    .line 310
    const v12, 0x3ff7f

    .line 311
    .line 312
    .line 313
    const/4 v8, 0x0

    .line 314
    const/4 v10, 0x0

    .line 315
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    :cond_b
    return-object v7

    .line 320
    :pswitch_3
    check-cast p1, La/oyg0;

    .line 321
    .line 322
    move-object v7, p2

    .line 323
    check-cast v7, La/p650;

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 332
    .line 333
    new-instance v9, Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 336
    .line 337
    .line 338
    move-result p2

    .line 339
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 340
    .line 341
    .line 342
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result p2

    .line 350
    if-eqz p2, :cond_d

    .line 351
    .line 352
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p2

    .line 356
    check-cast p2, La/jge;

    .line 357
    .line 358
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_c

    .line 363
    .line 364
    instance-of v0, p2, La/cge;

    .line 365
    .line 366
    if-eqz v0, :cond_c

    .line 367
    .line 368
    new-instance p2, La/aa8;

    .line 369
    .line 370
    invoke-interface {v3}, La/ha8;->a()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-direct {p2, v0}, La/aa8;-><init>(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    new-instance v0, La/cge;

    .line 378
    .line 379
    invoke-direct {v0, p2}, La/cge;-><init>(La/ha8;)V

    .line 380
    .line 381
    .line 382
    move-object p2, v0

    .line 383
    move v6, v4

    .line 384
    :cond_c
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    goto :goto_4

    .line 388
    :cond_d
    if-eqz v6, :cond_e

    .line 389
    .line 390
    const/4 v11, 0x0

    .line 391
    const v12, 0x3ff7f

    .line 392
    .line 393
    .line 394
    const/4 v8, 0x0

    .line 395
    const/4 v10, 0x0

    .line 396
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    :cond_e
    return-object v7

    .line 401
    :pswitch_4
    check-cast p1, La/oyg0;

    .line 402
    .line 403
    move-object v7, p2

    .line 404
    check-cast v7, La/p650;

    .line 405
    .line 406
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 413
    .line 414
    new-instance v9, Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 417
    .line 418
    .line 419
    move-result p2

    .line 420
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 421
    .line 422
    .line 423
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result p2

    .line 431
    if-eqz p2, :cond_10

    .line 432
    .line 433
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p2

    .line 437
    check-cast p2, La/jge;

    .line 438
    .line 439
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_f

    .line 444
    .line 445
    instance-of v0, p2, La/cge;

    .line 446
    .line 447
    if-eqz v0, :cond_f

    .line 448
    .line 449
    new-instance p2, La/cge;

    .line 450
    .line 451
    invoke-direct {p2, v3}, La/cge;-><init>(La/ha8;)V

    .line 452
    .line 453
    .line 454
    move v6, v4

    .line 455
    :cond_f
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    goto :goto_5

    .line 459
    :cond_10
    if-eqz v6, :cond_11

    .line 460
    .line 461
    const/4 v11, 0x0

    .line 462
    const v12, 0x3ff7f

    .line 463
    .line 464
    .line 465
    const/4 v8, 0x0

    .line 466
    const/4 v10, 0x0

    .line 467
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    :cond_11
    return-object v7

    .line 472
    :pswitch_5
    check-cast p1, La/oyg0;

    .line 473
    .line 474
    move-object v7, p2

    .line 475
    check-cast v7, La/p650;

    .line 476
    .line 477
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 484
    .line 485
    new-instance v9, Ljava/util/ArrayList;

    .line 486
    .line 487
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 488
    .line 489
    .line 490
    move-result p2

    .line 491
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 492
    .line 493
    .line 494
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object p1

    .line 498
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result p2

    .line 502
    if-eqz p2, :cond_13

    .line 503
    .line 504
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p2

    .line 508
    check-cast p2, La/jge;

    .line 509
    .line 510
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-eqz v0, :cond_12

    .line 515
    .line 516
    instance-of v0, p2, La/bge;

    .line 517
    .line 518
    if-eqz v0, :cond_12

    .line 519
    .line 520
    new-instance p2, La/aa8;

    .line 521
    .line 522
    invoke-interface {v3}, La/ha8;->a()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-direct {p2, v0}, La/aa8;-><init>(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    new-instance v0, La/bge;

    .line 530
    .line 531
    invoke-direct {v0, p2}, La/bge;-><init>(La/ha8;)V

    .line 532
    .line 533
    .line 534
    move-object p2, v0

    .line 535
    move v6, v4

    .line 536
    :cond_12
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    goto :goto_6

    .line 540
    :cond_13
    if-eqz v6, :cond_14

    .line 541
    .line 542
    const/4 v11, 0x0

    .line 543
    const v12, 0x3ff7f

    .line 544
    .line 545
    .line 546
    const/4 v8, 0x0

    .line 547
    const/4 v10, 0x0

    .line 548
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    :cond_14
    return-object v7

    .line 553
    :pswitch_6
    check-cast p1, La/oyg0;

    .line 554
    .line 555
    move-object v7, p2

    .line 556
    check-cast v7, La/p650;

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 565
    .line 566
    new-instance v9, Ljava/util/ArrayList;

    .line 567
    .line 568
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 569
    .line 570
    .line 571
    move-result p2

    .line 572
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 573
    .line 574
    .line 575
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 576
    .line 577
    .line 578
    move-result-object p1

    .line 579
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 580
    .line 581
    .line 582
    move-result p2

    .line 583
    if-eqz p2, :cond_16

    .line 584
    .line 585
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object p2

    .line 589
    check-cast p2, La/jge;

    .line 590
    .line 591
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    if-eqz v0, :cond_15

    .line 596
    .line 597
    instance-of v0, p2, La/bge;

    .line 598
    .line 599
    if-eqz v0, :cond_15

    .line 600
    .line 601
    new-instance p2, La/aa8;

    .line 602
    .line 603
    invoke-interface {v3}, La/ha8;->a()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-direct {p2, v0}, La/aa8;-><init>(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    new-instance v0, La/bge;

    .line 611
    .line 612
    invoke-direct {v0, p2}, La/bge;-><init>(La/ha8;)V

    .line 613
    .line 614
    .line 615
    move-object p2, v0

    .line 616
    move v6, v4

    .line 617
    :cond_15
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    goto :goto_7

    .line 621
    :cond_16
    if-eqz v6, :cond_17

    .line 622
    .line 623
    const/4 v11, 0x0

    .line 624
    const v12, 0x3ff7f

    .line 625
    .line 626
    .line 627
    const/4 v8, 0x0

    .line 628
    const/4 v10, 0x0

    .line 629
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 630
    .line 631
    .line 632
    move-result-object v7

    .line 633
    :cond_17
    return-object v7

    .line 634
    :pswitch_7
    check-cast p1, La/oyg0;

    .line 635
    .line 636
    move-object v7, p2

    .line 637
    check-cast v7, La/p650;

    .line 638
    .line 639
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 646
    .line 647
    new-instance v9, Ljava/util/ArrayList;

    .line 648
    .line 649
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 650
    .line 651
    .line 652
    move-result p2

    .line 653
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 654
    .line 655
    .line 656
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 657
    .line 658
    .line 659
    move-result-object p1

    .line 660
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 661
    .line 662
    .line 663
    move-result p2

    .line 664
    if-eqz p2, :cond_19

    .line 665
    .line 666
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object p2

    .line 670
    check-cast p2, La/jge;

    .line 671
    .line 672
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    if-eqz v0, :cond_18

    .line 677
    .line 678
    instance-of v0, p2, La/bge;

    .line 679
    .line 680
    if-eqz v0, :cond_18

    .line 681
    .line 682
    new-instance p2, La/bge;

    .line 683
    .line 684
    invoke-direct {p2, v3}, La/bge;-><init>(La/ha8;)V

    .line 685
    .line 686
    .line 687
    move v6, v4

    .line 688
    :cond_18
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    goto :goto_8

    .line 692
    :cond_19
    if-eqz v6, :cond_1a

    .line 693
    .line 694
    const/4 v11, 0x0

    .line 695
    const v12, 0x3ff7f

    .line 696
    .line 697
    .line 698
    const/4 v8, 0x0

    .line 699
    const/4 v10, 0x0

    .line 700
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 701
    .line 702
    .line 703
    move-result-object v7

    .line 704
    :cond_1a
    return-object v7

    .line 705
    :pswitch_8
    check-cast p1, La/oyg0;

    .line 706
    .line 707
    move-object v7, p2

    .line 708
    check-cast v7, La/p650;

    .line 709
    .line 710
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 717
    .line 718
    new-instance v9, Ljava/util/ArrayList;

    .line 719
    .line 720
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 721
    .line 722
    .line 723
    move-result p2

    .line 724
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 725
    .line 726
    .line 727
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 728
    .line 729
    .line 730
    move-result-object p1

    .line 731
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 732
    .line 733
    .line 734
    move-result p2

    .line 735
    if-eqz p2, :cond_1c

    .line 736
    .line 737
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object p2

    .line 741
    check-cast p2, La/jge;

    .line 742
    .line 743
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    if-eqz v0, :cond_1b

    .line 748
    .line 749
    instance-of v0, p2, La/cge;

    .line 750
    .line 751
    if-eqz v0, :cond_1b

    .line 752
    .line 753
    move-object p2, v3

    .line 754
    check-cast p2, La/da8;

    .line 755
    .line 756
    iget-object v0, p2, La/da8;->b:Ljava/lang/Object;

    .line 757
    .line 758
    check-cast v0, La/rh10;

    .line 759
    .line 760
    invoke-static {v0, v4, v2, v1}, La/rh10;->a(La/rh10;ZLa/zh10;I)La/rh10;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-static {p2, v0}, La/da8;->b(La/da8;Ljava/lang/Object;)La/da8;

    .line 765
    .line 766
    .line 767
    move-result-object p2

    .line 768
    new-instance v0, La/cge;

    .line 769
    .line 770
    invoke-direct {v0, p2}, La/cge;-><init>(La/ha8;)V

    .line 771
    .line 772
    .line 773
    move-object p2, v0

    .line 774
    move v6, v4

    .line 775
    :cond_1b
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    goto :goto_9

    .line 779
    :cond_1c
    if-eqz v6, :cond_1d

    .line 780
    .line 781
    const/4 v11, 0x0

    .line 782
    const v12, 0x3ff7f

    .line 783
    .line 784
    .line 785
    const/4 v8, 0x0

    .line 786
    const/4 v10, 0x0

    .line 787
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 788
    .line 789
    .line 790
    move-result-object v7

    .line 791
    :cond_1d
    return-object v7

    .line 792
    :pswitch_9
    check-cast p1, La/oyg0;

    .line 793
    .line 794
    move-object v7, p2

    .line 795
    check-cast v7, La/p650;

    .line 796
    .line 797
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 804
    .line 805
    new-instance v9, Ljava/util/ArrayList;

    .line 806
    .line 807
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 808
    .line 809
    .line 810
    move-result p2

    .line 811
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 812
    .line 813
    .line 814
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 815
    .line 816
    .line 817
    move-result-object p1

    .line 818
    move p2, v6

    .line 819
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 820
    .line 821
    .line 822
    move-result v0

    .line 823
    if-eqz v0, :cond_1f

    .line 824
    .line 825
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    check-cast v0, La/jge;

    .line 830
    .line 831
    invoke-static {v0, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 832
    .line 833
    .line 834
    move-result v5

    .line 835
    if-eqz v5, :cond_1e

    .line 836
    .line 837
    instance-of v5, v0, La/cge;

    .line 838
    .line 839
    if-eqz v5, :cond_1e

    .line 840
    .line 841
    move-object p2, v3

    .line 842
    check-cast p2, La/da8;

    .line 843
    .line 844
    iget-object v0, p2, La/da8;->b:Ljava/lang/Object;

    .line 845
    .line 846
    check-cast v0, La/rh10;

    .line 847
    .line 848
    invoke-static {v0, v6, v2, v1}, La/rh10;->a(La/rh10;ZLa/zh10;I)La/rh10;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-static {p2, v0}, La/da8;->b(La/da8;Ljava/lang/Object;)La/da8;

    .line 853
    .line 854
    .line 855
    move-result-object p2

    .line 856
    new-instance v0, La/cge;

    .line 857
    .line 858
    invoke-direct {v0, p2}, La/cge;-><init>(La/ha8;)V

    .line 859
    .line 860
    .line 861
    move p2, v4

    .line 862
    :cond_1e
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    goto :goto_a

    .line 866
    :cond_1f
    if-eqz p2, :cond_20

    .line 867
    .line 868
    const/4 v11, 0x0

    .line 869
    const v12, 0x3ff7f

    .line 870
    .line 871
    .line 872
    const/4 v8, 0x0

    .line 873
    const/4 v10, 0x0

    .line 874
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 875
    .line 876
    .line 877
    move-result-object v7

    .line 878
    :cond_20
    return-object v7

    .line 879
    :pswitch_a
    check-cast p1, La/oyg0;

    .line 880
    .line 881
    move-object v7, p2

    .line 882
    check-cast v7, La/p650;

    .line 883
    .line 884
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    iget-object p1, v7, La/p650;->h:Ljava/util/List;

    .line 891
    .line 892
    new-instance v9, Ljava/util/ArrayList;

    .line 893
    .line 894
    invoke-static {p1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 895
    .line 896
    .line 897
    move-result p2

    .line 898
    invoke-direct {v9, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 899
    .line 900
    .line 901
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 906
    .line 907
    .line 908
    move-result p2

    .line 909
    if-eqz p2, :cond_22

    .line 910
    .line 911
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object p2

    .line 915
    check-cast p2, La/jge;

    .line 916
    .line 917
    invoke-static {p2, p0}, La/f140;->w(La/jge;Ljava/lang/String;)Z

    .line 918
    .line 919
    .line 920
    move-result v0

    .line 921
    if-eqz v0, :cond_21

    .line 922
    .line 923
    instance-of v0, p2, La/cge;

    .line 924
    .line 925
    if-eqz v0, :cond_21

    .line 926
    .line 927
    move-object p2, v3

    .line 928
    check-cast p2, La/da8;

    .line 929
    .line 930
    iget-object v0, p2, La/da8;->b:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v0, La/rh10;

    .line 933
    .line 934
    invoke-static {v0, v4, v2, v1}, La/rh10;->a(La/rh10;ZLa/zh10;I)La/rh10;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    invoke-static {p2, v0}, La/da8;->b(La/da8;Ljava/lang/Object;)La/da8;

    .line 939
    .line 940
    .line 941
    move-result-object p2

    .line 942
    new-instance v0, La/cge;

    .line 943
    .line 944
    invoke-direct {v0, p2}, La/cge;-><init>(La/ha8;)V

    .line 945
    .line 946
    .line 947
    move-object p2, v0

    .line 948
    move v6, v4

    .line 949
    :cond_21
    invoke-virtual {v9, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    goto :goto_b

    .line 953
    :cond_22
    if-eqz v6, :cond_23

    .line 954
    .line 955
    const/4 v11, 0x0

    .line 956
    const v12, 0x3ff7f

    .line 957
    .line 958
    .line 959
    const/4 v8, 0x0

    .line 960
    const/4 v10, 0x0

    .line 961
    invoke-static/range {v7 .. v12}, La/p650;->a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;

    .line 962
    .line 963
    .line 964
    move-result-object v7

    .line 965
    :cond_23
    return-object v7

    .line 966
    nop

    .line 967
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
