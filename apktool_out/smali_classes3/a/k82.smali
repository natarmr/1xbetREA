.class public final synthetic La/k82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(FB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/k82;->a:B

    iput p1, p0, La/k82;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/k82;->a:B

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    iget p0, p0, La/k82;->b:F

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, La/vj30;

    .line 14
    .line 15
    check-cast p2, La/pj30;

    .line 16
    .line 17
    check-cast p3, La/p4e;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-wide v5, p3, La/p4e;->a:J

    .line 26
    .line 27
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    mul-int/2addr p0, v4

    .line 36
    add-int v8, p0, p3

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xd

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v9, 0x0

    .line 43
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget p2, p0, La/pu90;->a:I

    .line 52
    .line 53
    iget p3, p0, La/pu90;->b:I

    .line 54
    .line 55
    new-instance v0, La/klo0;

    .line 56
    .line 57
    const/4 v1, 0x6

    .line 58
    invoke-direct {v0, p0, v1}, La/klo0;-><init>(La/pu90;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_0
    check-cast p1, La/vj30;

    .line 67
    .line 68
    check-cast p2, La/pj30;

    .line 69
    .line 70
    check-cast p3, La/p4e;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-wide v5, p3, La/p4e;->a:J

    .line 79
    .line 80
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    mul-int/2addr p0, v4

    .line 89
    add-int v8, p0, p3

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    const/16 v11, 0xd

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget p2, p0, La/pu90;->a:I

    .line 105
    .line 106
    iget p3, p0, La/pu90;->b:I

    .line 107
    .line 108
    new-instance v0, La/klo0;

    .line 109
    .line 110
    invoke-direct {v0, p0, v4}, La/klo0;-><init>(La/pu90;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :pswitch_1
    check-cast p1, La/vj30;

    .line 119
    .line 120
    check-cast p2, La/pj30;

    .line 121
    .line 122
    check-cast p3, La/p4e;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-wide v5, p3, La/p4e;->a:J

    .line 131
    .line 132
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    mul-int/2addr p0, v4

    .line 141
    add-int v8, p0, p3

    .line 142
    .line 143
    const/4 v10, 0x0

    .line 144
    const/16 v11, 0xd

    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 149
    .line 150
    .line 151
    move-result-wide v0

    .line 152
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    iget p2, p0, La/pu90;->a:I

    .line 157
    .line 158
    iget p3, p0, La/pu90;->b:I

    .line 159
    .line 160
    new-instance v0, La/klo0;

    .line 161
    .line 162
    invoke-direct {v0, p0, v3}, La/klo0;-><init>(La/pu90;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    return-object p0

    .line 170
    :pswitch_2
    check-cast p1, La/vj30;

    .line 171
    .line 172
    check-cast p2, La/pj30;

    .line 173
    .line 174
    check-cast p3, La/p4e;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-wide v5, p3, La/p4e;->a:J

    .line 183
    .line 184
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 185
    .line 186
    .line 187
    move-result p3

    .line 188
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    mul-int/2addr p0, v4

    .line 193
    add-int v8, p0, p3

    .line 194
    .line 195
    const/4 v10, 0x0

    .line 196
    const/16 v11, 0xd

    .line 197
    .line 198
    const/4 v7, 0x0

    .line 199
    const/4 v9, 0x0

    .line 200
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 201
    .line 202
    .line 203
    move-result-wide v0

    .line 204
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    iget p2, p0, La/pu90;->a:I

    .line 209
    .line 210
    iget p3, p0, La/pu90;->b:I

    .line 211
    .line 212
    new-instance v0, La/klo0;

    .line 213
    .line 214
    invoke-direct {v0, p0, v2}, La/klo0;-><init>(La/pu90;B)V

    .line 215
    .line 216
    .line 217
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    return-object p0

    .line 222
    :pswitch_3
    check-cast p1, La/vj30;

    .line 223
    .line 224
    check-cast p2, La/pj30;

    .line 225
    .line 226
    check-cast p3, La/p4e;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    iget-wide v5, p3, La/p4e;->a:J

    .line 235
    .line 236
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 237
    .line 238
    .line 239
    move-result p3

    .line 240
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    mul-int/2addr p0, v4

    .line 245
    add-int v8, p0, p3

    .line 246
    .line 247
    const/4 v10, 0x0

    .line 248
    const/16 v11, 0xd

    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    const/4 v9, 0x0

    .line 252
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 253
    .line 254
    .line 255
    move-result-wide v0

    .line 256
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    iget p2, p0, La/pu90;->a:I

    .line 261
    .line 262
    iget p3, p0, La/pu90;->b:I

    .line 263
    .line 264
    new-instance v0, La/cam;

    .line 265
    .line 266
    const/16 v1, 0x1d

    .line 267
    .line 268
    invoke-direct {v0, p0, v1}, La/cam;-><init>(La/pu90;B)V

    .line 269
    .line 270
    .line 271
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    return-object p0

    .line 276
    :pswitch_4
    check-cast p1, La/vj30;

    .line 277
    .line 278
    check-cast p2, La/pj30;

    .line 279
    .line 280
    check-cast p3, La/p4e;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-wide v2, p3, La/p4e;->a:J

    .line 289
    .line 290
    invoke-static {v2, v3}, La/p4e;->e(J)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    iget-wide v2, p3, La/p4e;->a:J

    .line 295
    .line 296
    if-eqz v0, :cond_1

    .line 297
    .line 298
    invoke-static {v2, v3}, La/p4e;->i(J)I

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    int-to-float v0, v0

    .line 303
    mul-float/2addr v0, p0

    .line 304
    float-to-int p0, v0

    .line 305
    invoke-static {v2, v3}, La/p4e;->i(J)I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-le p0, v0, :cond_0

    .line 310
    .line 311
    move v5, v0

    .line 312
    goto :goto_0

    .line 313
    :cond_0
    move v5, p0

    .line 314
    :goto_0
    iget-wide v2, p3, La/p4e;->a:J

    .line 315
    .line 316
    const/4 v7, 0x0

    .line 317
    const/16 v8, 0xd

    .line 318
    .line 319
    const/4 v4, 0x0

    .line 320
    const/4 v6, 0x0

    .line 321
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 322
    .line 323
    .line 324
    move-result-wide v2

    .line 325
    :cond_1
    invoke-interface {p2, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    iget p2, p0, La/pu90;->a:I

    .line 330
    .line 331
    iget p3, p0, La/pu90;->b:I

    .line 332
    .line 333
    new-instance v0, La/cam;

    .line 334
    .line 335
    invoke-direct {v0, p0, v1}, La/cam;-><init>(La/pu90;B)V

    .line 336
    .line 337
    .line 338
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    return-object p0

    .line 343
    :pswitch_5
    move-object v0, p1

    .line 344
    check-cast v0, La/mm40;

    .line 345
    .line 346
    check-cast p2, La/fet;

    .line 347
    .line 348
    check-cast p3, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    and-int/lit8 p3, p1, 0x6

    .line 358
    .line 359
    if-nez p3, :cond_3

    .line 360
    .line 361
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result p3

    .line 365
    if-eqz p3, :cond_2

    .line 366
    .line 367
    const/4 v4, 0x4

    .line 368
    :cond_2
    or-int/2addr p1, v4

    .line 369
    :cond_3
    and-int/lit8 p3, p1, 0x13

    .line 370
    .line 371
    const/16 v4, 0x12

    .line 372
    .line 373
    if-eq p3, v4, :cond_4

    .line 374
    .line 375
    move v2, v3

    .line 376
    :cond_4
    and-int/lit8 p3, p1, 0x1

    .line 377
    .line 378
    invoke-virtual {p2, p3, v2}, La/fet;->U(IZ)Z

    .line 379
    .line 380
    .line 381
    move-result p3

    .line 382
    if-eqz p3, :cond_5

    .line 383
    .line 384
    const/16 p3, 0xb

    .line 385
    .line 386
    const/4 v2, 0x0

    .line 387
    invoke-static {v2, v2, p0, v2, p3}, La/s5x0;->u(FFFFI)La/lh80;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    and-int/lit8 v5, p1, 0xe

    .line 392
    .line 393
    const/4 v6, 0x2

    .line 394
    const-wide/16 v1, 0x0

    .line 395
    .line 396
    move-object v4, p2

    .line 397
    invoke-static/range {v0 .. v6}, La/pym0;->c(La/mm40;JLa/lh80;La/fet;II)V

    .line 398
    .line 399
    .line 400
    goto :goto_1

    .line 401
    :cond_5
    move-object v4, p2

    .line 402
    invoke-virtual {v4}, La/fet;->X()V

    .line 403
    .line 404
    .line 405
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object p0

    .line 408
    :pswitch_6
    check-cast p1, La/vj30;

    .line 409
    .line 410
    check-cast p2, La/pj30;

    .line 411
    .line 412
    check-cast p3, La/p4e;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    iget-wide v5, p3, La/p4e;->a:J

    .line 421
    .line 422
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 423
    .line 424
    .line 425
    move-result p3

    .line 426
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 427
    .line 428
    .line 429
    move-result p0

    .line 430
    mul-int/2addr p0, v4

    .line 431
    add-int v8, p0, p3

    .line 432
    .line 433
    const/4 v10, 0x0

    .line 434
    const/16 v11, 0xd

    .line 435
    .line 436
    const/4 v7, 0x0

    .line 437
    const/4 v9, 0x0

    .line 438
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 439
    .line 440
    .line 441
    move-result-wide v0

    .line 442
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    iget p2, p0, La/pu90;->a:I

    .line 447
    .line 448
    iget p3, p0, La/pu90;->b:I

    .line 449
    .line 450
    new-instance v0, La/cam;

    .line 451
    .line 452
    const/4 v1, 0x7

    .line 453
    invoke-direct {v0, p0, v1}, La/cam;-><init>(La/pu90;B)V

    .line 454
    .line 455
    .line 456
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    return-object p0

    .line 461
    :pswitch_7
    check-cast p1, La/vj30;

    .line 462
    .line 463
    check-cast p2, La/pj30;

    .line 464
    .line 465
    check-cast p3, La/p4e;

    .line 466
    .line 467
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    iget-wide v5, p3, La/p4e;->a:J

    .line 474
    .line 475
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 476
    .line 477
    .line 478
    move-result p3

    .line 479
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 480
    .line 481
    .line 482
    move-result p0

    .line 483
    mul-int/2addr p0, v4

    .line 484
    add-int v8, p0, p3

    .line 485
    .line 486
    const/4 v10, 0x0

    .line 487
    const/16 v11, 0xd

    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    const/4 v9, 0x0

    .line 491
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 492
    .line 493
    .line 494
    move-result-wide v0

    .line 495
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    iget p2, p0, La/pu90;->a:I

    .line 500
    .line 501
    iget p3, p0, La/pu90;->b:I

    .line 502
    .line 503
    new-instance v0, La/y1;

    .line 504
    .line 505
    const/16 v1, 0x9

    .line 506
    .line 507
    invoke-direct {v0, p0, v1}, La/y1;-><init>(La/pu90;B)V

    .line 508
    .line 509
    .line 510
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    return-object p0

    .line 515
    :pswitch_8
    check-cast p1, La/w03;

    .line 516
    .line 517
    check-cast p2, La/h7k0;

    .line 518
    .line 519
    check-cast p3, La/k6z;

    .line 520
    .line 521
    sget-object v0, La/y82;->V1:La/qek0;

    .line 522
    .line 523
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    const-wide/16 v0, 0x0

    .line 530
    .line 531
    iget-wide p2, p2, La/h7k0;->a:J

    .line 532
    .line 533
    invoke-static {v0, v1, p2, p3}, La/k9x;->r(JJ)La/jge0;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 538
    .line 539
    .line 540
    move-result p2

    .line 541
    int-to-long p2, p2

    .line 542
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    int-to-long v0, v0

    .line 547
    const/16 v3, 0x20

    .line 548
    .line 549
    shl-long/2addr p2, v3

    .line 550
    const-wide v4, 0xffffffffL

    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    and-long/2addr v0, v4

    .line 556
    or-long/2addr p2, v0

    .line 557
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    int-to-long v0, v0

    .line 562
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 563
    .line 564
    .line 565
    move-result p0

    .line 566
    int-to-long v6, p0

    .line 567
    shl-long/2addr v0, v3

    .line 568
    and-long v3, v6, v4

    .line 569
    .line 570
    or-long v5, v0, v3

    .line 571
    .line 572
    const-wide/16 v9, 0x0

    .line 573
    .line 574
    const-wide/16 v7, 0x0

    .line 575
    .line 576
    move-wide v3, p2

    .line 577
    invoke-static/range {v2 .. v10}, La/r8x;->u(La/jge0;JJJJ)La/wfg0;

    .line 578
    .line 579
    .line 580
    move-result-object p0

    .line 581
    invoke-static {p1, p0}, La/w03;->b(La/w03;La/wfg0;)V

    .line 582
    .line 583
    .line 584
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 585
    .line 586
    return-object p0

    .line 587
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
