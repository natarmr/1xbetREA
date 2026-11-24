.class public final La/at7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/at7;->a:B

    iput-object p1, p0, La/at7;->c:Ljava/lang/Object;

    iput-object p2, p0, La/at7;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/at7;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/at7;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/at7;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    check-cast v1, La/cp;

    .line 18
    .line 19
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, La/vte;

    .line 24
    .line 25
    iget-wide v0, p1, La/vte;->a:J

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, La/gky;

    .line 38
    .line 39
    iget-object p1, p1, La/gky;->a:Landroid/view/KeyEvent;

    .line 40
    .line 41
    check-cast p0, La/djz;

    .line 42
    .line 43
    invoke-virtual {p0}, La/djz;->a()La/dmv;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    sget-object v0, La/dmv;->b:La/dmv;

    .line 48
    .line 49
    if-ne p0, v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    const/4 v0, 0x4

    .line 56
    if-ne p0, v0, :cond_0

    .line 57
    .line 58
    invoke-static {p1}, La/n7x;->H(Landroid/view/KeyEvent;)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    const/4 p1, 0x1

    .line 63
    if-ne p0, p1, :cond_0

    .line 64
    .line 65
    check-cast v1, La/k7q0;

    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    invoke-virtual {v1, p0}, La/k7q0;->d(La/ne60;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const/4 p1, 0x0

    .line 73
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    check-cast p0, La/bqd;

    .line 85
    .line 86
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v1, Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p0, v0, p1}, La/bqd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    check-cast p0, La/bqd;

    .line 108
    .line 109
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v1, Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p0, v0, p1}, La/bqd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    check-cast p0, La/bqd;

    .line 131
    .line 132
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v1, Ljava/util/List;

    .line 137
    .line 138
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, v0, p1}, La/bqd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0

    .line 147
    :pswitch_4
    check-cast p1, La/bem;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    instance-of p1, p1, La/wdm;

    .line 153
    .line 154
    if-eqz p1, :cond_1

    .line 155
    .line 156
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 157
    .line 158
    new-instance p1, La/ued;

    .line 159
    .line 160
    check-cast v1, La/xdd;

    .line 161
    .line 162
    invoke-direct {p1, v1}, La/ued;-><init>(La/xdd;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_5
    check-cast p1, La/bem;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    instance-of p1, p1, La/wdm;

    .line 177
    .line 178
    if-eqz p1, :cond_2

    .line 179
    .line 180
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 181
    .line 182
    new-instance p1, La/ced;

    .line 183
    .line 184
    check-cast v1, La/aed;

    .line 185
    .line 186
    invoke-direct {p1, v1}, La/ced;-><init>(La/aed;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p0

    .line 195
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    check-cast p0, La/y2d;

    .line 202
    .line 203
    check-cast v1, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p0, p1}, La/y2d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :pswitch_7
    check-cast p1, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    check-cast p0, La/qbd;

    .line 221
    .line 222
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v1, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p0, v0, p1}, La/qbd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0

    .line 237
    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    check-cast p0, La/sfc;

    .line 244
    .line 245
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v1, La/a4x;

    .line 250
    .line 251
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p0, v0, p1}, La/sfc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    return-object p0

    .line 260
    :pswitch_9
    check-cast p1, Ljava/lang/Number;

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    check-cast p0, La/sfc;

    .line 267
    .line 268
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v1, Ljava/util/List;

    .line 273
    .line 274
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-virtual {p0, v0, p1}, La/sfc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    return-object p0

    .line 283
    :pswitch_a
    check-cast p1, La/wwv0;

    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    check-cast p0, La/sfc;

    .line 289
    .line 290
    check-cast v1, La/jgc;

    .line 291
    .line 292
    invoke-virtual {p0, p1, v1}, La/sfc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_b
    check-cast p1, Ljava/lang/Number;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    check-cast p0, La/pua;

    .line 305
    .line 306
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v1, Ljava/util/List;

    .line 311
    .line 312
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    invoke-virtual {p0, v0, p1}, La/pua;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    return-object p0

    .line 321
    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    check-cast p0, La/pua;

    .line 328
    .line 329
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    check-cast v1, Ljava/util/List;

    .line 334
    .line 335
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-virtual {p0, v0, p1}, La/pua;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    return-object p0

    .line 344
    :pswitch_d
    check-cast p1, Ljava/lang/Number;

    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 347
    .line 348
    .line 349
    move-result p1

    .line 350
    check-cast p0, La/m1b;

    .line 351
    .line 352
    check-cast v1, Ljava/util/List;

    .line 353
    .line 354
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-virtual {p0, p1}, La/m1b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_e
    check-cast p1, Ljava/lang/Number;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    check-cast p0, La/pua;

    .line 370
    .line 371
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    check-cast v1, La/a4x;

    .line 376
    .line 377
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-virtual {p0, v0, p1}, La/pua;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    return-object p0

    .line 386
    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    .line 387
    .line 388
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    check-cast p0, La/pua;

    .line 393
    .line 394
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    check-cast v1, La/a4x;

    .line 399
    .line 400
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    invoke-virtual {p0, v0, p1}, La/pua;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    return-object p0

    .line 409
    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    .line 410
    .line 411
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    check-cast p0, La/im8;

    .line 416
    .line 417
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v1, La/a4x;

    .line 422
    .line 423
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    invoke-virtual {p0, v0, p1}, La/im8;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    return-object p0

    .line 432
    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 435
    .line 436
    .line 437
    move-result p1

    .line 438
    check-cast p0, La/d69;

    .line 439
    .line 440
    check-cast v1, Ljava/util/List;

    .line 441
    .line 442
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    invoke-virtual {p0, p1}, La/d69;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    return-object p0

    .line 451
    :pswitch_12
    check-cast p1, Ljava/lang/Number;

    .line 452
    .line 453
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result p1

    .line 457
    check-cast p0, La/d69;

    .line 458
    .line 459
    check-cast v1, Ljava/util/List;

    .line 460
    .line 461
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    invoke-virtual {p0, p1}, La/d69;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    return-object p0

    .line 470
    :pswitch_13
    check-cast p1, Ljava/lang/Number;

    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result p1

    .line 476
    check-cast p0, La/im8;

    .line 477
    .line 478
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    check-cast v1, Ljava/util/List;

    .line 483
    .line 484
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    invoke-virtual {p0, v0, p1}, La/im8;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    return-object p0

    .line 493
    :pswitch_14
    check-cast p1, Ljava/lang/Number;

    .line 494
    .line 495
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 496
    .line 497
    .line 498
    move-result p1

    .line 499
    check-cast p0, La/im8;

    .line 500
    .line 501
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    check-cast v1, Ljava/util/List;

    .line 506
    .line 507
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    invoke-virtual {p0, v0, p1}, La/im8;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    return-object p0

    .line 516
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 517
    .line 518
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 519
    .line 520
    .line 521
    move-result p1

    .line 522
    check-cast p0, La/cp8;

    .line 523
    .line 524
    check-cast v1, Ljava/util/List;

    .line 525
    .line 526
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    invoke-virtual {p0, p1}, La/cp8;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    const-class p0, La/vz8;

    .line 534
    .line 535
    return-object p0

    .line 536
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 537
    .line 538
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 539
    .line 540
    .line 541
    move-result p1

    .line 542
    check-cast p0, La/cp8;

    .line 543
    .line 544
    check-cast v1, Ljava/util/List;

    .line 545
    .line 546
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    invoke-virtual {p0, p1}, La/cp8;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    return-object p0

    .line 555
    :pswitch_17
    check-cast p1, Ljava/lang/Number;

    .line 556
    .line 557
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 558
    .line 559
    .line 560
    move-result p1

    .line 561
    check-cast p0, La/cp8;

    .line 562
    .line 563
    check-cast v1, Ljava/util/List;

    .line 564
    .line 565
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    invoke-virtual {p0, p1}, La/cp8;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    return-object p0

    .line 574
    :pswitch_18
    check-cast p1, Ljava/lang/Number;

    .line 575
    .line 576
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 577
    .line 578
    .line 579
    move-result p1

    .line 580
    check-cast p0, La/i87;

    .line 581
    .line 582
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    check-cast v1, Ljava/util/ArrayList;

    .line 587
    .line 588
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    invoke-virtual {p0, v0, p1}, La/i87;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    return-object p0

    .line 597
    :pswitch_19
    check-cast p1, Ljava/lang/Number;

    .line 598
    .line 599
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 600
    .line 601
    .line 602
    move-result p1

    .line 603
    check-cast p0, La/nk7;

    .line 604
    .line 605
    check-cast v1, Ljava/util/ArrayList;

    .line 606
    .line 607
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    invoke-virtual {p0, p1}, La/nk7;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    const-string p0, "bonus_item"

    .line 615
    .line 616
    return-object p0

    .line 617
    :pswitch_1a
    check-cast p1, Ljava/lang/Number;

    .line 618
    .line 619
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 620
    .line 621
    .line 622
    move-result p1

    .line 623
    check-cast p0, La/i87;

    .line 624
    .line 625
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    check-cast v1, Ljava/util/ArrayList;

    .line 630
    .line 631
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object p1

    .line 635
    invoke-virtual {p0, v0, p1}, La/i87;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    return-object p0

    .line 640
    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    .line 641
    .line 642
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result p1

    .line 646
    check-cast p0, La/nk7;

    .line 647
    .line 648
    check-cast v1, Ljava/util/List;

    .line 649
    .line 650
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    invoke-virtual {p0, p1}, La/nk7;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object p0

    .line 658
    return-object p0

    .line 659
    :pswitch_1c
    check-cast p1, Ljava/lang/Number;

    .line 660
    .line 661
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 662
    .line 663
    .line 664
    move-result p1

    .line 665
    check-cast p0, La/nk7;

    .line 666
    .line 667
    check-cast v1, Ljava/util/List;

    .line 668
    .line 669
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object p1

    .line 673
    invoke-virtual {p0, p1}, La/nk7;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object p0

    .line 677
    return-object p0

    .line 678
    nop

    .line 679
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
