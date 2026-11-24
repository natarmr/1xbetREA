.class public final La/g5;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g5;->a:B

    iput-object p1, p0, La/g5;->b:Ljava/lang/Object;

    iput-object p2, p0, La/g5;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/g5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/g5;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, La/g5;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    check-cast p0, La/ma2;

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v3, La/a4x;

    .line 25
    .line 26
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, v0, p1}, La/ma2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    check-cast p0, La/xd2;

    .line 42
    .line 43
    check-cast v3, La/a4x;

    .line 44
    .line 45
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    check-cast p0, La/xd2;

    .line 61
    .line 62
    check-cast v3, La/a4x;

    .line 63
    .line 64
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0, p1}, La/xd2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    check-cast p0, La/dj1;

    .line 80
    .line 81
    check-cast v3, La/a4x;

    .line 82
    .line 83
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, p1}, La/dj1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    check-cast p0, La/dj1;

    .line 99
    .line 100
    check-cast v3, La/a4x;

    .line 101
    .line 102
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0, p1}, La/dj1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    check-cast p0, La/dj1;

    .line 118
    .line 119
    check-cast v3, La/a4x;

    .line 120
    .line 121
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p0, p1}, La/dj1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    check-cast p0, La/dj1;

    .line 137
    .line 138
    check-cast v3, Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0, p1}, La/dj1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    check-cast p0, La/xg1;

    .line 156
    .line 157
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v3, La/a4x;

    .line 162
    .line 163
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p0, v0, p1}, La/xg1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    check-cast p0, La/xg1;

    .line 179
    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v3, Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p0, v0, p1}, La/xg1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    check-cast p0, La/xg1;

    .line 202
    .line 203
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v3, La/a4x;

    .line 208
    .line 209
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p0, v0, p1}, La/xg1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    check-cast p0, La/xg1;

    .line 225
    .line 226
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v3, La/a4x;

    .line 231
    .line 232
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p0, v0, p1}, La/xg1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :pswitch_a
    check-cast p1, La/frl;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 247
    .line 248
    new-instance v0, La/gs1;

    .line 249
    .line 250
    new-instance v4, La/wr1;

    .line 251
    .line 252
    check-cast v3, La/nw1;

    .line 253
    .line 254
    check-cast v3, La/lw1;

    .line 255
    .line 256
    iget-wide v5, v3, La/lw1;->a:J

    .line 257
    .line 258
    invoke-direct {v4, v5, v6}, La/wr1;-><init>(J)V

    .line 259
    .line 260
    .line 261
    sget-object v3, La/frl;->a:La/frl;

    .line 262
    .line 263
    if-ne p1, v3, :cond_0

    .line 264
    .line 265
    move v1, v2

    .line 266
    :cond_0
    invoke-direct {v0, v4, v1}, La/gs1;-><init>(La/yr1;Z)V

    .line 267
    .line 268
    .line 269
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    check-cast p0, La/eo0;

    .line 282
    .line 283
    check-cast v3, Ljava/util/List;

    .line 284
    .line 285
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p0, p1}, La/eo0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 295
    .line 296
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    check-cast p0, La/eo0;

    .line 301
    .line 302
    check-cast v3, Ljava/util/List;

    .line 303
    .line 304
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p0, p1}, La/eo0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    return-object p0

    .line 313
    :pswitch_d
    check-cast p1, Ljava/lang/Number;

    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 316
    .line 317
    .line 318
    move-result-wide v0

    .line 319
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 320
    .line 321
    new-instance p1, La/up0;

    .line 322
    .line 323
    check-cast v3, La/rq0;

    .line 324
    .line 325
    check-cast v3, La/kq0;

    .line 326
    .line 327
    iget-object v2, v3, La/kq0;->c:Ljava/lang/String;

    .line 328
    .line 329
    invoke-direct {p1, v2, v0, v1}, La/up0;-><init>(Ljava/lang/String;J)V

    .line 330
    .line 331
    .line 332
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    check-cast p0, La/g20;

    .line 345
    .line 346
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    check-cast v3, La/a4x;

    .line 351
    .line 352
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-virtual {p0, v0, p1}, La/g20;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    return-object p0

    .line 361
    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    .line 362
    .line 363
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    check-cast p0, La/g20;

    .line 368
    .line 369
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    check-cast v3, Ljava/util/List;

    .line 374
    .line 375
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {p0, v0, p1}, La/g20;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    return-object p0

    .line 384
    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    check-cast p0, La/g20;

    .line 391
    .line 392
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    check-cast v3, Ljava/util/List;

    .line 397
    .line 398
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    invoke-virtual {p0, v0, p1}, La/g20;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    return-object p0

    .line 407
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 410
    .line 411
    .line 412
    move-result p1

    .line 413
    check-cast p0, La/g20;

    .line 414
    .line 415
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v3, Ljava/util/List;

    .line 420
    .line 421
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-virtual {p0, v0, p1}, La/g20;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    return-object p0

    .line 430
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 431
    .line 432
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 433
    .line 434
    .line 435
    move-result p1

    .line 436
    check-cast p0, La/g20;

    .line 437
    .line 438
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    check-cast v3, Ljava/util/List;

    .line 443
    .line 444
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    invoke-virtual {p0, v0, p1}, La/g20;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    return-object p0

    .line 453
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 454
    .line 455
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    check-cast p0, La/b5;

    .line 460
    .line 461
    check-cast v3, Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    invoke-virtual {p0, p1}, La/b5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    return-object p0

    .line 472
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 473
    .line 474
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result p1

    .line 478
    check-cast p0, La/b5;

    .line 479
    .line 480
    check-cast v3, Ljava/util/List;

    .line 481
    .line 482
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    invoke-virtual {p0, p1}, La/b5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    return-object p0

    .line 491
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 492
    .line 493
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 494
    .line 495
    .line 496
    move-result p1

    .line 497
    check-cast p0, La/b5;

    .line 498
    .line 499
    check-cast v3, Ljava/util/List;

    .line 500
    .line 501
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    invoke-virtual {p0, p1}, La/b5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    return-object p0

    .line 510
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 511
    .line 512
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 513
    .line 514
    .line 515
    move-result p1

    .line 516
    check-cast p0, La/hhd;

    .line 517
    .line 518
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    check-cast v3, Ljava/util/List;

    .line 523
    .line 524
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object p1

    .line 528
    invoke-virtual {p0, v0, p1}, La/hhd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object p0

    .line 532
    return-object p0

    .line 533
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 534
    .line 535
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result p1

    .line 539
    check-cast p0, La/hhd;

    .line 540
    .line 541
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    check-cast v3, Ljava/util/List;

    .line 546
    .line 547
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object p1

    .line 551
    invoke-virtual {p0, v0, p1}, La/hhd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object p0

    .line 555
    return-object p0

    .line 556
    :pswitch_18
    check-cast p1, Ljava/lang/Number;

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    check-cast p0, La/hhd;

    .line 563
    .line 564
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    check-cast v3, Ljava/util/List;

    .line 569
    .line 570
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    invoke-virtual {p0, v0, p1}, La/hhd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    return-object p0

    .line 579
    :pswitch_19
    check-cast p1, Ljava/lang/Number;

    .line 580
    .line 581
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 582
    .line 583
    .line 584
    move-result p1

    .line 585
    check-cast p0, La/hhd;

    .line 586
    .line 587
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    check-cast v3, Ljava/util/List;

    .line 592
    .line 593
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    invoke-virtual {p0, v0, p1}, La/hhd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object p0

    .line 601
    return-object p0

    .line 602
    :pswitch_1a
    check-cast p0, La/q8a;

    .line 603
    .line 604
    check-cast v3, La/yzs0;

    .line 605
    .line 606
    check-cast p1, La/j5;

    .line 607
    .line 608
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    iget-object v0, p1, La/j5;->a:La/aty;

    .line 612
    .line 613
    invoke-virtual {p0}, La/q8a;->i0()Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    const/4 v5, 0x0

    .line 618
    if-eqz v4, :cond_1

    .line 619
    .line 620
    if-eqz v0, :cond_1

    .line 621
    .line 622
    invoke-interface {v3, v0}, La/yzs0;->m(La/aty;)Z

    .line 623
    .line 624
    .line 625
    move-result v4

    .line 626
    if-ne v4, v2, :cond_1

    .line 627
    .line 628
    goto :goto_2

    .line 629
    :cond_1
    if-eqz v0, :cond_5

    .line 630
    .line 631
    invoke-interface {v3, v0}, La/yzs0;->n0(La/aty;)La/jys0;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    if-nez v2, :cond_2

    .line 636
    .line 637
    goto :goto_2

    .line 638
    :cond_2
    invoke-interface {v3, v2}, La/yzs0;->x(La/jys0;)I

    .line 639
    .line 640
    .line 641
    move-result v4

    .line 642
    new-instance v6, Ljava/util/ArrayList;

    .line 643
    .line 644
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 645
    .line 646
    .line 647
    :goto_0
    if-ge v1, v4, :cond_4

    .line 648
    .line 649
    invoke-interface {v3, v2, v1}, La/yzs0;->r0(La/jys0;I)La/jzs0;

    .line 650
    .line 651
    .line 652
    move-result-object v7

    .line 653
    invoke-interface {v3, v0, v1}, La/yzs0;->E(La/aty;I)La/zxs0;

    .line 654
    .line 655
    .line 656
    move-result-object v8

    .line 657
    invoke-interface {v3, v8}, La/yzs0;->C0(La/zxs0;)La/aty;

    .line 658
    .line 659
    .line 660
    move-result-object v8

    .line 661
    iget-object v9, p1, La/j5;->b:La/jay;

    .line 662
    .line 663
    if-nez v8, :cond_3

    .line 664
    .line 665
    new-instance v8, La/j5;

    .line 666
    .line 667
    invoke-direct {v8, v5, v9, v7}, La/j5;-><init>(La/aty;La/jay;La/jzs0;)V

    .line 668
    .line 669
    .line 670
    goto :goto_1

    .line 671
    :cond_3
    new-instance v10, La/j5;

    .line 672
    .line 673
    invoke-virtual {p0}, La/q8a;->T()La/u0;

    .line 674
    .line 675
    .line 676
    move-result-object v11

    .line 677
    invoke-virtual {p0, v8}, La/q8a;->U(La/aty;)Ljava/lang/Iterable;

    .line 678
    .line 679
    .line 680
    move-result-object v12

    .line 681
    invoke-static {v11, v9, v12}, La/u0;->b(La/u0;La/jay;Ljava/lang/Iterable;)La/jay;

    .line 682
    .line 683
    .line 684
    move-result-object v9

    .line 685
    invoke-direct {v10, v8, v9, v7}, La/j5;-><init>(La/aty;La/jay;La/jzs0;)V

    .line 686
    .line 687
    .line 688
    move-object v8, v10

    .line 689
    :goto_1
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 690
    .line 691
    .line 692
    add-int/lit8 v1, v1, 0x1

    .line 693
    .line 694
    goto :goto_0

    .line 695
    :cond_4
    move-object v5, v6

    .line 696
    :cond_5
    :goto_2
    return-object v5

    .line 697
    :pswitch_1b
    check-cast p0, La/pys0;

    .line 698
    .line 699
    check-cast v3, [La/iay;

    .line 700
    .line 701
    check-cast p1, Ljava/lang/Number;

    .line 702
    .line 703
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 704
    .line 705
    .line 706
    move-result p1

    .line 707
    if-eqz p0, :cond_6

    .line 708
    .line 709
    iget-object p0, p0, La/pys0;->a:Ljava/util/LinkedHashMap;

    .line 710
    .line 711
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object p0

    .line 719
    check-cast p0, La/iay;

    .line 720
    .line 721
    if-nez p0, :cond_8

    .line 722
    .line 723
    :cond_6
    if-ltz p1, :cond_7

    .line 724
    .line 725
    array-length p0, v3

    .line 726
    if-ge p1, p0, :cond_7

    .line 727
    .line 728
    aget-object p0, v3, p1

    .line 729
    .line 730
    goto :goto_3

    .line 731
    :cond_7
    sget-object p0, La/iay;->f:La/iay;

    .line 732
    .line 733
    :cond_8
    :goto_3
    return-object p0

    .line 734
    :pswitch_1c
    check-cast p0, La/q8a;

    .line 735
    .line 736
    check-cast v3, La/j5;

    .line 737
    .line 738
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    iget-object v0, v3, La/j5;->a:La/aty;

    .line 742
    .line 743
    invoke-virtual {p0, p1, v0}, La/q8a;->P(Ljava/lang/Object;La/aty;)Z

    .line 744
    .line 745
    .line 746
    move-result p0

    .line 747
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 748
    .line 749
    .line 750
    move-result-object p0

    .line 751
    return-object p0

    .line 752
    nop

    .line 753
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
