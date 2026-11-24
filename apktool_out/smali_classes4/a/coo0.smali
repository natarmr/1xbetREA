.class public final synthetic La/coo0;
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
    iput-byte p2, p0, La/coo0;->a:B

    iput-object p1, p0, La/coo0;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/coo0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/coo0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/m9r0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, La/kim;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v0, La/eim;->a:La/eim;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    sget-object p1, La/d6r0;->a:La/d6r0;

    .line 35
    .line 36
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    instance-of v0, p1, La/iim;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    new-instance v0, La/g6r0;

    .line 45
    .line 46
    check-cast p1, La/iim;

    .line 47
    .line 48
    iget-object p1, p1, La/iim;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {v0, p1}, La/g6r0;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    instance-of v0, p1, La/jim;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    check-cast p1, La/jim;

    .line 62
    .line 63
    iget p1, p1, La/jim;->a:I

    .line 64
    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 v2, 0x0

    .line 69
    :goto_0
    new-instance p1, La/l6r0;

    .line 70
    .line 71
    invoke-direct {p1, v2}, La/l6r0;-><init>(Z)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    instance-of v0, p1, La/fim;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    check-cast p1, La/fim;

    .line 83
    .line 84
    iget p1, p1, La/fim;->a:I

    .line 85
    .line 86
    if-eq p1, v2, :cond_5

    .line 87
    .line 88
    const/4 v0, 0x2

    .line 89
    if-eq p1, v0, :cond_4

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    sget-object p1, La/j6r0;->a:La/j6r0;

    .line 93
    .line 94
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    sget-object p1, La/k6r0;->a:La/k6r0;

    .line 99
    .line 100
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    instance-of p1, p1, La/gim;

    .line 105
    .line 106
    if-eqz p1, :cond_7

    .line 107
    .line 108
    sget-object p1, La/f6r0;->a:La/f6r0;

    .line 109
    .line 110
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_7
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_1
    check-cast p1, La/bem;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v0, La/o4r0;

    .line 122
    .line 123
    invoke-direct {v0, p1}, La/o4r0;-><init>(La/bem;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_2
    check-cast p1, La/bem;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v0, La/o4r0;

    .line 138
    .line 139
    invoke-direct {v0, p1}, La/o4r0;-><init>(La/bem;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_3
    check-cast p1, La/tf50;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance v0, La/ois;

    .line 154
    .line 155
    invoke-direct {v0, p1}, La/ois;-><init>(La/tf50;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_4
    check-cast p1, La/cp;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 170
    .line 171
    check-cast v0, La/oyx;

    .line 172
    .line 173
    iget-object v0, v0, La/oyx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance v1, La/o7x;

    .line 179
    .line 180
    const/16 v2, 0xf

    .line 181
    .line 182
    invoke-direct {v1, p0, p1, v2}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 183
    .line 184
    .line 185
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 186
    .line 187
    .line 188
    new-instance p0, La/kzi0;

    .line 189
    .line 190
    const/16 v0, 0x13

    .line 191
    .line 192
    invoke-direct {p0, p1, v0}, La/kzi0;-><init>(La/cp;B)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_5
    check-cast p1, La/jtl;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    sget-object p1, La/pjq0;->a:La/pjq0;

    .line 207
    .line 208
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    new-instance v0, La/d3q0;

    .line 221
    .line 222
    invoke-direct {v0, p1}, La/d3q0;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-nez p1, :cond_8

    .line 238
    .line 239
    new-instance p1, La/o0q0;

    .line 240
    .line 241
    const/4 v0, 0x3

    .line 242
    invoke-direct {p1, p0, v0}, La/o0q0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 243
    .line 244
    .line 245
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 246
    .line 247
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-virtual {p0}, La/bjj;->a()V

    .line 252
    .line 253
    .line 254
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-nez p1, :cond_9

    .line 264
    .line 265
    new-instance p1, La/g4p0;

    .line 266
    .line 267
    const/16 v0, 0x1d

    .line 268
    .line 269
    invoke-direct {p1, p0, v0}, La/g4p0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 270
    .line 271
    .line 272
    invoke-static {p1}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 273
    .line 274
    .line 275
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    if-ne p1, v2, :cond_a

    .line 285
    .line 286
    new-instance p1, La/g4p0;

    .line 287
    .line 288
    const/16 v0, 0x17

    .line 289
    .line 290
    invoke-direct {p1, p0, v0}, La/g4p0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 291
    .line 292
    .line 293
    invoke-static {p1}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 294
    .line 295
    .line 296
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 302
    .line 303
    .line 304
    move-result p1

    .line 305
    new-instance v0, La/hrk0;

    .line 306
    .line 307
    invoke-direct {v0, p1}, La/hrk0;-><init>(I)V

    .line 308
    .line 309
    .line 310
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object p0

    .line 316
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    new-instance v0, La/hrk0;

    .line 323
    .line 324
    invoke-direct {v0, p1}, La/hrk0;-><init>(I)V

    .line 325
    .line 326
    .line 327
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_c
    check-cast p1, La/d9a0;

    .line 334
    .line 335
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    new-instance v0, La/mn6;

    .line 339
    .line 340
    invoke-direct {v0, p1}, La/mn6;-><init>(La/d9a0;)V

    .line 341
    .line 342
    .line 343
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    return-object p0

    .line 349
    :pswitch_d
    check-cast p1, La/d9a0;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    new-instance v0, La/mn6;

    .line 355
    .line 356
    invoke-direct {v0, p1}, La/mn6;-><init>(La/d9a0;)V

    .line 357
    .line 358
    .line 359
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    return-object p0

    .line 365
    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    .line 366
    .line 367
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 368
    .line 369
    .line 370
    move-result-wide v0

    .line 371
    new-instance p1, La/dkp0;

    .line 372
    .line 373
    invoke-direct {p1, v0, v1}, La/dkp0;-><init>(J)V

    .line 374
    .line 375
    .line 376
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 380
    .line 381
    return-object p0

    .line 382
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 383
    .line 384
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    new-instance v0, La/ekp0;

    .line 388
    .line 389
    invoke-direct {v0, p1}, La/ekp0;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object p0

    .line 398
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    new-instance v0, La/ekp0;

    .line 404
    .line 405
    invoke-direct {v0, p1}, La/ekp0;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object p0

    .line 414
    :pswitch_11
    check-cast p1, Ljava/lang/Long;

    .line 415
    .line 416
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 417
    .line 418
    .line 419
    move-result-wide v0

    .line 420
    new-instance p1, La/f8p0;

    .line 421
    .line 422
    invoke-direct {p1, v0, v1}, La/f8p0;-><init>(J)V

    .line 423
    .line 424
    .line 425
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object p0

    .line 431
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    new-instance v0, La/l8p0;

    .line 437
    .line 438
    invoke-direct {v0, p1}, La/l8p0;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    return-object p0

    .line 447
    :pswitch_13
    check-cast p1, Ljava/lang/Long;

    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 450
    .line 451
    .line 452
    move-result-wide v0

    .line 453
    new-instance p1, La/h8p0;

    .line 454
    .line 455
    invoke-direct {p1, v0, v1}, La/h8p0;-><init>(J)V

    .line 456
    .line 457
    .line 458
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object p0

    .line 464
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 467
    .line 468
    .line 469
    move-result p1

    .line 470
    new-instance v0, La/z7p0;

    .line 471
    .line 472
    invoke-direct {v0, p1}, La/z7p0;-><init>(I)V

    .line 473
    .line 474
    .line 475
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    return-object p0

    .line 481
    :pswitch_15
    check-cast p1, Ljava/lang/Integer;

    .line 482
    .line 483
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 484
    .line 485
    .line 486
    move-result p1

    .line 487
    new-instance v0, La/i8p0;

    .line 488
    .line 489
    invoke-direct {v0, p1}, La/i8p0;-><init>(I)V

    .line 490
    .line 491
    .line 492
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 496
    .line 497
    return-object p0

    .line 498
    :pswitch_16
    check-cast p1, Ljava/lang/Integer;

    .line 499
    .line 500
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result p1

    .line 504
    new-instance v0, La/jap0;

    .line 505
    .line 506
    invoke-direct {v0, p1}, La/jap0;-><init>(I)V

    .line 507
    .line 508
    .line 509
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_17
    check-cast p1, Ljava/lang/Long;

    .line 516
    .line 517
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 518
    .line 519
    .line 520
    move-result-wide v0

    .line 521
    new-instance p1, La/lap0;

    .line 522
    .line 523
    invoke-direct {p1, v0, v1}, La/lap0;-><init>(J)V

    .line 524
    .line 525
    .line 526
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    return-object p0

    .line 532
    :pswitch_18
    check-cast p1, La/bem;

    .line 533
    .line 534
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    instance-of v0, p1, La/wdm;

    .line 538
    .line 539
    if-eqz v0, :cond_b

    .line 540
    .line 541
    move-object v1, p1

    .line 542
    check-cast v1, La/wdm;

    .line 543
    .line 544
    :cond_b
    if-eqz v1, :cond_c

    .line 545
    .line 546
    iget-wide v0, v1, La/wdm;->a:J

    .line 547
    .line 548
    goto :goto_2

    .line 549
    :cond_c
    const-wide/16 v0, 0x0

    .line 550
    .line 551
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 559
    .line 560
    return-object p0

    .line 561
    :pswitch_19
    check-cast p1, Ljava/lang/Integer;

    .line 562
    .line 563
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 564
    .line 565
    .line 566
    move-result p1

    .line 567
    new-instance v0, La/u3p0;

    .line 568
    .line 569
    invoke-direct {v0, p1}, La/u3p0;-><init>(I)V

    .line 570
    .line 571
    .line 572
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 576
    .line 577
    return-object p0

    .line 578
    :pswitch_1a
    check-cast p1, Ljava/lang/Integer;

    .line 579
    .line 580
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 581
    .line 582
    .line 583
    move-result p1

    .line 584
    new-instance v0, La/hyo0;

    .line 585
    .line 586
    invoke-direct {v0, p1}, La/hyo0;-><init>(I)V

    .line 587
    .line 588
    .line 589
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 593
    .line 594
    return-object p0

    .line 595
    :pswitch_1b
    check-cast p1, La/n6n;

    .line 596
    .line 597
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    instance-of v0, p1, La/k6n;

    .line 601
    .line 602
    if-eqz v0, :cond_d

    .line 603
    .line 604
    sget-object p1, La/eyo0;->a:La/eyo0;

    .line 605
    .line 606
    goto :goto_3

    .line 607
    :cond_d
    instance-of v0, p1, La/m6n;

    .line 608
    .line 609
    if-eqz v0, :cond_e

    .line 610
    .line 611
    sget-object p1, La/gyo0;->a:La/gyo0;

    .line 612
    .line 613
    goto :goto_3

    .line 614
    :cond_e
    instance-of p1, p1, La/l6n;

    .line 615
    .line 616
    if-eqz p1, :cond_f

    .line 617
    .line 618
    sget-object p1, La/fyo0;->a:La/fyo0;

    .line 619
    .line 620
    :goto_3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 624
    .line 625
    goto :goto_4

    .line 626
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 627
    .line 628
    .line 629
    :goto_4
    return-object v1

    .line 630
    :pswitch_1c
    check-cast p1, La/dfm0;

    .line 631
    .line 632
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    instance-of v0, p1, La/gqw;

    .line 636
    .line 637
    if-eqz v0, :cond_10

    .line 638
    .line 639
    new-instance v0, La/wpw;

    .line 640
    .line 641
    check-cast p1, La/gqw;

    .line 642
    .line 643
    invoke-direct {v0, p1}, La/wpw;-><init>(La/gqw;)V

    .line 644
    .line 645
    .line 646
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    :cond_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 650
    .line 651
    return-object p0

    .line 652
    nop

    .line 653
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
