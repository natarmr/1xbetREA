.class public final synthetic La/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y;->a:B

    iput-object p1, p0, La/y;->b:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/y;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-wide v2, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object p0, p0, La/y;->b:Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, La/dpa0;

    .line 18
    .line 19
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_2
    check-cast p1, Landroid/view/View;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_3
    check-cast p1, La/uag0;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_4
    check-cast p1, La/uag0;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {p0, v5, v4}, La/l1e0;->c(FFF)F

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_5
    check-cast p1, La/uag0;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-static {p0, v5, v4}, La/l1e0;->c(FFF)F

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_6
    check-cast p1, La/uag0;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Ljava/lang/Number;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    const v0, 0x3f266666    # 0.65f

    .line 144
    .line 145
    .line 146
    sub-float p0, v0, p0

    .line 147
    .line 148
    div-float/2addr p0, v0

    .line 149
    invoke-static {p0, v5, v4}, La/l1e0;->c(FFF)F

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    mul-float/2addr p0, p0

    .line 154
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 155
    .line 156
    .line 157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_7
    check-cast p1, La/uag0;

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, Ljava/lang/Number;

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    invoke-static {p0, v5, v4}, La/l1e0;->c(FFF)F

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 180
    .line 181
    .line 182
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_8
    check-cast p1, La/uag0;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    invoke-static {p0, v5, v4}, La/l1e0;->c(FFF)F

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 205
    .line 206
    .line 207
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_9
    check-cast p1, La/uag0;

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    check-cast p0, Ljava/lang/Number;

    .line 220
    .line 221
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 222
    .line 223
    .line 224
    move-result p0

    .line 225
    invoke-static {p0, v5, v4}, La/l1e0;->c(FFF)F

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 230
    .line 231
    .line 232
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_a
    check-cast p1, La/uag0;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    check-cast p0, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    invoke-static {p0, v5, v4}, La/l1e0;->c(FFF)F

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 255
    .line 256
    .line 257
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0

    .line 260
    :pswitch_b
    check-cast p1, La/uag0;

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, Ljava/lang/Number;

    .line 270
    .line 271
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 272
    .line 273
    .line 274
    move-result p0

    .line 275
    invoke-static {p0, v5, v4}, La/l1e0;->c(FFF)F

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 280
    .line 281
    .line 282
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 288
    .line 289
    .line 290
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object p0

    .line 296
    :pswitch_d
    check-cast p1, La/abi0;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    new-instance v0, La/g3c0;

    .line 302
    .line 303
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    check-cast p0, Ljava/lang/Number;

    .line 308
    .line 309
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 310
    .line 311
    .line 312
    move-result p0

    .line 313
    new-instance v1, La/cvc;

    .line 314
    .line 315
    invoke-direct {v1, v5, v4}, La/cvc;-><init>(FF)V

    .line 316
    .line 317
    .line 318
    invoke-direct {v0, p0, v1}, La/g3c0;-><init>(FLa/cvc;)V

    .line 319
    .line 320
    .line 321
    invoke-static {p1, v0}, La/yai0;->d(La/abi0;La/g3c0;)V

    .line 322
    .line 323
    .line 324
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    return-object p0

    .line 327
    :pswitch_e
    check-cast p1, La/uag0;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    check-cast p0, Ljava/lang/Number;

    .line 337
    .line 338
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 339
    .line 340
    .line 341
    move-result p0

    .line 342
    neg-float p0, p0

    .line 343
    sget v0, La/u18;->i:F

    .line 344
    .line 345
    iget-object v1, p1, La/uag0;->t:La/w6k;

    .line 346
    .line 347
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    mul-float/2addr v1, v0

    .line 352
    mul-float/2addr v1, p0

    .line 353
    invoke-virtual {p1, v1}, La/uag0;->I(F)V

    .line 354
    .line 355
    .line 356
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object p0

    .line 359
    :pswitch_f
    check-cast p1, La/w6k;

    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    check-cast p0, Ljava/lang/Number;

    .line 369
    .line 370
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 371
    .line 372
    .line 373
    move-result p0

    .line 374
    invoke-static {p0}, La/si30;->b(F)I

    .line 375
    .line 376
    .line 377
    move-result p0

    .line 378
    int-to-long p0, p0

    .line 379
    and-long/2addr p0, v2

    .line 380
    new-instance v0, La/ikx;

    .line 381
    .line 382
    invoke-direct {v0, p0, p1}, La/ikx;-><init>(J)V

    .line 383
    .line 384
    .line 385
    return-object v0

    .line 386
    :pswitch_10
    check-cast p1, La/w6k;

    .line 387
    .line 388
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    check-cast p0, Ljava/lang/Number;

    .line 396
    .line 397
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 398
    .line 399
    .line 400
    move-result p0

    .line 401
    invoke-static {p0}, La/si30;->b(F)I

    .line 402
    .line 403
    .line 404
    move-result p0

    .line 405
    int-to-long p0, p0

    .line 406
    and-long/2addr p0, v2

    .line 407
    new-instance v0, La/ikx;

    .line 408
    .line 409
    invoke-direct {v0, p0, p1}, La/ikx;-><init>(J)V

    .line 410
    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_11
    check-cast p1, La/uag0;

    .line 414
    .line 415
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    check-cast p0, Ljava/lang/Number;

    .line 423
    .line 424
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 425
    .line 426
    .line 427
    move-result p0

    .line 428
    const v0, 0x3f8a3d71    # 1.08f

    .line 429
    .line 430
    .line 431
    const v1, 0x3f6147ae    # 0.88f

    .line 432
    .line 433
    .line 434
    invoke-static {v0, v1, p0}, La/l7x;->O(FFF)F

    .line 435
    .line 436
    .line 437
    move-result p0

    .line 438
    invoke-virtual {p1, p0}, La/uag0;->w(F)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1, p0}, La/uag0;->y(F)V

    .line 442
    .line 443
    .line 444
    iget-wide v0, p1, La/uag0;->r:J

    .line 445
    .line 446
    and-long/2addr v0, v2

    .line 447
    long-to-int p0, v0

    .line 448
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 449
    .line 450
    .line 451
    move-result p0

    .line 452
    const v0, 0x3ea3d70a    # 0.32f

    .line 453
    .line 454
    .line 455
    mul-float/2addr p0, v0

    .line 456
    invoke-virtual {p1, p0}, La/uag0;->I(F)V

    .line 457
    .line 458
    .line 459
    const/high16 p0, 0x3f000000    # 0.5f

    .line 460
    .line 461
    const v0, 0x3f2e147b    # 0.68f

    .line 462
    .line 463
    .line 464
    invoke-static {p0, v0}, La/osm0;->e(FF)J

    .line 465
    .line 466
    .line 467
    move-result-wide v0

    .line 468
    invoke-virtual {p1, v0, v1}, La/uag0;->G(J)V

    .line 469
    .line 470
    .line 471
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object p0

    .line 474
    :pswitch_12
    check-cast p1, La/w6k;

    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    check-cast p0, Ljava/lang/Number;

    .line 484
    .line 485
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 486
    .line 487
    .line 488
    move-result p0

    .line 489
    invoke-static {p0}, La/si30;->b(F)I

    .line 490
    .line 491
    .line 492
    move-result p0

    .line 493
    int-to-long p0, p0

    .line 494
    and-long/2addr p0, v2

    .line 495
    new-instance v0, La/ikx;

    .line 496
    .line 497
    invoke-direct {v0, p0, p1}, La/ikx;-><init>(J)V

    .line 498
    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    .line 502
    .line 503
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 504
    .line 505
    .line 506
    move-result p1

    .line 507
    if-nez p1, :cond_1

    .line 508
    .line 509
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_14
    check-cast p1, Landroid/view/View;

    .line 516
    .line 517
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->v:I

    .line 518
    .line 519
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 526
    .line 527
    return-object p0

    .line 528
    :pswitch_15
    check-cast p1, La/uag0;

    .line 529
    .line 530
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object p0

    .line 534
    check-cast p0, Ljava/lang/Number;

    .line 535
    .line 536
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 537
    .line 538
    .line 539
    move-result p0

    .line 540
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 541
    .line 542
    .line 543
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 544
    .line 545
    return-object p0

    .line 546
    :pswitch_16
    check-cast p1, La/iz3;

    .line 547
    .line 548
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    if-eqz p0, :cond_2

    .line 552
    .line 553
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 557
    .line 558
    return-object p0

    .line 559
    :pswitch_17
    check-cast p1, La/kz3;

    .line 560
    .line 561
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    if-eqz p0, :cond_3

    .line 565
    .line 566
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 570
    .line 571
    return-object p0

    .line 572
    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    .line 573
    .line 574
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 575
    .line 576
    .line 577
    move-result p1

    .line 578
    if-ne p1, v1, :cond_4

    .line 579
    .line 580
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 584
    .line 585
    return-object p0

    .line 586
    :pswitch_19
    check-cast p1, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 587
    .line 588
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    new-instance v0, La/c0;

    .line 592
    .line 593
    invoke-direct {v0, p0, v1}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 597
    .line 598
    .line 599
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object p0

    .line 602
    :pswitch_1a
    check-cast p1, Landroid/view/View;

    .line 603
    .line 604
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    return-object p0

    .line 613
    :pswitch_1b
    check-cast p1, Landroid/view/View;

    .line 614
    .line 615
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 622
    .line 623
    return-object p0

    .line 624
    :pswitch_1c
    check-cast p1, Landroid/content/Context;

    .line 625
    .line 626
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    sget v0, Lorg/xplatform/uikit/components/accordion/DsAccordion;->c:I

    .line 630
    .line 631
    sget-object v0, La/dc;->a:La/dc;

    .line 632
    .line 633
    invoke-static {p1, v0}, La/obb;->Z(Landroid/content/Context;La/dc;)Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 634
    .line 635
    .line 636
    move-result-object p1

    .line 637
    invoke-static {}, La/jmu0;->d()I

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 642
    .line 643
    .line 644
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 645
    .line 646
    const/4 v1, -0x2

    .line 647
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 651
    .line 652
    .line 653
    new-instance v0, La/c0;

    .line 654
    .line 655
    const/4 v1, 0x0

    .line 656
    invoke-direct {v0, p0, v1}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 660
    .line 661
    .line 662
    return-object p1

    .line 663
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
