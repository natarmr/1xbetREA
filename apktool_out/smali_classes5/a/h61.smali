.class public final synthetic La/h61;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h61;->a:B

    iput-object p1, p0, La/h61;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/h61;->a:B

    .line 2
    .line 3
    sget-object v1, La/vh1;->a:La/vh1;

    .line 4
    .line 5
    sget-object v2, La/ai1;->a:La/ai1;

    .line 6
    .line 7
    sget-object v3, La/fs1;->a:La/fs1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object p0, p0, La/h61;->b:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, La/jtl;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v0, La/mb2;

    .line 22
    .line 23
    invoke-direct {v0, p1}, La/mb2;-><init>(La/jtl;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    check-cast p1, La/kim;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    instance-of v0, p1, La/iim;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    new-instance v0, La/y92;

    .line 42
    .line 43
    check-cast p1, La/iim;

    .line 44
    .line 45
    iget-object p1, p1, La/iim;->a:Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {v0, p1}, La/y92;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object v0, La/eim;->a:La/eim;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    sget-object p1, La/u92;->a:La/u92;

    .line 63
    .line 64
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    sget-object v0, La/gim;->a:La/gim;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    sget-object p1, La/x92;->a:La/x92;

    .line 77
    .line 78
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    instance-of v0, p1, La/fim;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    check-cast p1, La/fim;

    .line 87
    .line 88
    iget p1, p1, La/fim;->a:I

    .line 89
    .line 90
    if-eq p1, v5, :cond_4

    .line 91
    .line 92
    const/4 v0, 0x2

    .line 93
    if-eq p1, v0, :cond_3

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    sget-object p1, La/aa2;->a:La/aa2;

    .line 97
    .line 98
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    sget-object p1, La/w92;->a:La/w92;

    .line 103
    .line 104
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_5
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    sget-object p1, La/rx1;->a:La/rx1;

    .line 116
    .line 117
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_2
    check-cast p1, La/jtl;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    new-instance v0, La/qs1;

    .line 141
    .line 142
    invoke-direct {v0, p1}, La/qs1;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    new-instance v0, La/qs1;

    .line 158
    .line 159
    invoke-direct {v0, p1}, La/qs1;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    new-instance v0, La/qs1;

    .line 175
    .line 176
    invoke-direct {v0, p1}, La/qs1;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_6
    check-cast p1, La/jtl;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_7
    check-cast p1, La/st0;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    new-instance v0, La/is1;

    .line 202
    .line 203
    iget-wide v1, p1, La/st0;->a:J

    .line 204
    .line 205
    sget-object p1, La/bv1;->e:La/bv1;

    .line 206
    .line 207
    invoke-direct {v0, v1, v2, p1}, La/is1;-><init>(JLa/bv1;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_8
    check-cast p1, La/st0;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v0, La/hs1;

    .line 222
    .line 223
    iget-wide v1, p1, La/st0;->a:J

    .line 224
    .line 225
    iget-object p1, p1, La/st0;->d:La/mtr;

    .line 226
    .line 227
    if-eqz p1, :cond_6

    .line 228
    .line 229
    iget-boolean v4, p1, La/mtr;->b:Z

    .line 230
    .line 231
    :cond_6
    sget-object p1, La/bv1;->e:La/bv1;

    .line 232
    .line 233
    invoke-direct {v0, v1, v2, v4, p1}, La/hs1;-><init>(JZLa/bv1;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    new-instance v0, La/qs1;

    .line 249
    .line 250
    invoke-direct {v0, p1}, La/qs1;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0

    .line 259
    :pswitch_a
    check-cast p1, La/jtl;

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_b
    check-cast p1, La/jtl;

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object p0

    .line 281
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    new-instance v0, La/zm1;

    .line 287
    .line 288
    invoke-direct {v0, p1}, La/zm1;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_d
    check-cast p1, La/st0;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    sget-object v0, La/ymx;->h:La/ymx;

    .line 303
    .line 304
    new-instance v1, La/dt0;

    .line 305
    .line 306
    const/16 v2, 0xa

    .line 307
    .line 308
    invoke-direct {v1, p0, p1, v2}, La/dt0;-><init>(Lkotlin/jvm/functions/Function1;La/st0;B)V

    .line 309
    .line 310
    .line 311
    new-instance p0, La/bjj;

    .line 312
    .line 313
    invoke-direct {p0, v0, v5, v1}, La/bjj;-><init>(La/ymx;ZLkotlin/jvm/functions/Function0;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p0}, La/bjj;->a()V

    .line 317
    .line 318
    .line 319
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object p0

    .line 322
    :pswitch_e
    check-cast p1, La/st0;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    new-instance v0, La/kxq0;

    .line 328
    .line 329
    new-instance v1, La/dk0;

    .line 330
    .line 331
    iget-wide v2, p1, La/st0;->a:J

    .line 332
    .line 333
    iget-object p1, p1, La/st0;->d:La/mtr;

    .line 334
    .line 335
    if-eqz p1, :cond_7

    .line 336
    .line 337
    iget-boolean v4, p1, La/mtr;->b:Z

    .line 338
    .line 339
    :cond_7
    invoke-direct {v1, v4, v2, v3}, La/dk0;-><init>(ZJ)V

    .line 340
    .line 341
    .line 342
    invoke-direct {v0, v1}, La/kxq0;-><init>(La/ik0;)V

    .line 343
    .line 344
    .line 345
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object p0

    .line 351
    :pswitch_f
    check-cast p1, La/eol;

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    new-instance v0, La/nk1;

    .line 357
    .line 358
    invoke-direct {v0, p0, p1, v4}, La/nk1;-><init>(Lkotlin/jvm/functions/Function1;La/eol;B)V

    .line 359
    .line 360
    .line 361
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 362
    .line 363
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    invoke-virtual {p0}, La/bjj;->a()V

    .line 368
    .line 369
    .line 370
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object p0

    .line 373
    :pswitch_10
    check-cast p1, La/st0;

    .line 374
    .line 375
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    new-instance v0, La/x7d0;

    .line 379
    .line 380
    iget-wide v1, p1, La/st0;->a:J

    .line 381
    .line 382
    invoke-direct {v0, v1, v2}, La/x7d0;-><init>(J)V

    .line 383
    .line 384
    .line 385
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object p0

    .line 391
    :pswitch_11
    check-cast p1, La/st0;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    new-instance v0, La/w7d0;

    .line 397
    .line 398
    iget-wide v1, p1, La/st0;->a:J

    .line 399
    .line 400
    iget-object p1, p1, La/st0;->d:La/mtr;

    .line 401
    .line 402
    if-eqz p1, :cond_8

    .line 403
    .line 404
    iget-boolean v4, p1, La/mtr;->b:Z

    .line 405
    .line 406
    :cond_8
    invoke-direct {v0, v4, v1, v2}, La/w7d0;-><init>(ZJ)V

    .line 407
    .line 408
    .line 409
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object p0

    .line 415
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 416
    .line 417
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    new-instance v0, La/di1;

    .line 421
    .line 422
    invoke-direct {v0, p1}, La/di1;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object p0

    .line 431
    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 434
    .line 435
    .line 436
    move-result p1

    .line 437
    if-eqz p1, :cond_a

    .line 438
    .line 439
    if-eq p1, v5, :cond_9

    .line 440
    .line 441
    goto :goto_1

    .line 442
    :cond_9
    sget-object p1, La/ei1;->a:La/ei1;

    .line 443
    .line 444
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    goto :goto_1

    .line 448
    :cond_a
    sget-object p1, La/ci1;->a:La/ci1;

    .line 449
    .line 450
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 454
    .line 455
    return-object p0

    .line 456
    :pswitch_14
    check-cast p1, La/jtl;

    .line 457
    .line 458
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    sget-object v0, La/sh00;->t:La/sh00;

    .line 462
    .line 463
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-eqz v0, :cond_b

    .line 468
    .line 469
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    goto :goto_2

    .line 473
    :cond_b
    sget-object v0, La/rk;->i:La/rk;

    .line 474
    .line 475
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result p1

    .line 479
    if-eqz p1, :cond_c

    .line 480
    .line 481
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    :cond_c
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object p0

    .line 487
    :pswitch_15
    check-cast p1, La/jtl;

    .line 488
    .line 489
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    sget-object v0, La/sh00;->t:La/sh00;

    .line 493
    .line 494
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eqz v0, :cond_d

    .line 499
    .line 500
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    goto :goto_3

    .line 504
    :cond_d
    sget-object v0, La/rk;->i:La/rk;

    .line 505
    .line 506
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result p1

    .line 510
    if-eqz p1, :cond_e

    .line 511
    .line 512
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    :cond_e
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 516
    .line 517
    return-object p0

    .line 518
    :pswitch_16
    check-cast p1, La/jtl;

    .line 519
    .line 520
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    sget-object v0, La/sh00;->t:La/sh00;

    .line 524
    .line 525
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-eqz v0, :cond_f

    .line 530
    .line 531
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    goto :goto_4

    .line 535
    :cond_f
    sget-object v0, La/rk;->i:La/rk;

    .line 536
    .line 537
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result p1

    .line 541
    if-eqz p1, :cond_10

    .line 542
    .line 543
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    :cond_10
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object p0

    .line 549
    :pswitch_17
    check-cast p1, Ljava/lang/Integer;

    .line 550
    .line 551
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 552
    .line 553
    .line 554
    sget-object p1, La/bd1;->a:La/bd1;

    .line 555
    .line 556
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    return-object p0

    .line 562
    :pswitch_18
    check-cast p1, La/bpl;

    .line 563
    .line 564
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    new-instance v0, La/qe1;

    .line 568
    .line 569
    invoke-direct {v0, p0, p1, v4}, La/qe1;-><init>(Lkotlin/jvm/functions/Function1;La/bpl;B)V

    .line 570
    .line 571
    .line 572
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 573
    .line 574
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    invoke-virtual {p0}, La/bjj;->a()V

    .line 579
    .line 580
    .line 581
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 582
    .line 583
    return-object p0

    .line 584
    :pswitch_19
    check-cast p1, Ljava/lang/Long;

    .line 585
    .line 586
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 587
    .line 588
    .line 589
    move-result-wide v0

    .line 590
    sget-object p1, La/ymx;->h:La/ymx;

    .line 591
    .line 592
    new-instance v2, La/i11;

    .line 593
    .line 594
    const/4 v3, 0x4

    .line 595
    invoke-direct {v2, v3, v0, v1, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 596
    .line 597
    .line 598
    new-instance p0, La/bjj;

    .line 599
    .line 600
    invoke-direct {p0, p1, v5, v2}, La/bjj;-><init>(La/ymx;ZLkotlin/jvm/functions/Function0;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {p0}, La/bjj;->a()V

    .line 604
    .line 605
    .line 606
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 607
    .line 608
    return-object p0

    .line 609
    :pswitch_1a
    check-cast p1, Ljava/lang/Long;

    .line 610
    .line 611
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 612
    .line 613
    .line 614
    move-result-wide v0

    .line 615
    sget-object p1, La/ymx;->h:La/ymx;

    .line 616
    .line 617
    new-instance v2, La/i11;

    .line 618
    .line 619
    const/4 v3, 0x5

    .line 620
    invoke-direct {v2, v3, v0, v1, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 621
    .line 622
    .line 623
    new-instance p0, La/bjj;

    .line 624
    .line 625
    invoke-direct {p0, p1, v5, v2}, La/bjj;-><init>(La/ymx;ZLkotlin/jvm/functions/Function0;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {p0}, La/bjj;->a()V

    .line 629
    .line 630
    .line 631
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    return-object p0

    .line 634
    :pswitch_1b
    check-cast p1, Ljava/lang/Integer;

    .line 635
    .line 636
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 637
    .line 638
    .line 639
    move-result p1

    .line 640
    new-instance v0, La/u61;

    .line 641
    .line 642
    invoke-direct {v0, p1}, La/u61;-><init>(I)V

    .line 643
    .line 644
    .line 645
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 649
    .line 650
    return-object p0

    .line 651
    :pswitch_1c
    check-cast p1, La/ayq0;

    .line 652
    .line 653
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    new-instance v0, La/kxq0;

    .line 657
    .line 658
    new-instance v1, La/yj0;

    .line 659
    .line 660
    iget-object v2, p1, La/ayq0;->a:Ljava/lang/String;

    .line 661
    .line 662
    iget v3, p1, La/ayq0;->b:I

    .line 663
    .line 664
    iget-object v4, p1, La/ayq0;->c:Ljava/lang/String;

    .line 665
    .line 666
    iget-object v5, p1, La/ayq0;->e:Ljava/lang/String;

    .line 667
    .line 668
    iget-object v6, p1, La/ayq0;->f:La/gz8;

    .line 669
    .line 670
    iget-object v7, p1, La/ayq0;->g:La/a4x;

    .line 671
    .line 672
    iget-object v8, p1, La/ayq0;->h:Ljava/lang/String;

    .line 673
    .line 674
    invoke-direct/range {v1 .. v8}, La/yj0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;La/gz8;La/a4x;Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-direct {v0, v1}, La/kxq0;-><init>(La/ik0;)V

    .line 678
    .line 679
    .line 680
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 684
    .line 685
    return-object p0

    .line 686
    nop

    .line 687
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
