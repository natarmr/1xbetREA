.class public final synthetic La/baq;
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
    iput-byte p2, p0, La/baq;->a:B

    iput-object p1, p0, La/baq;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/baq;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/baq;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Long;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    new-instance p1, La/x2f0;

    .line 15
    .line 16
    sget-object v2, La/igt;->b:La/sek;

    .line 17
    .line 18
    long-to-int v0, v0

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v1, La/igt;->c:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/igt;

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    sget-object v0, La/igt;->d:La/igt;

    .line 37
    .line 38
    :cond_0
    invoke-direct {p1, v0}, La/x2f0;-><init>(La/igt;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    new-instance p1, La/nve0;

    .line 54
    .line 55
    sget-object v2, La/hgt;->b:La/pek;

    .line 56
    .line 57
    long-to-int v0, v0

    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v1, La/hgt;->c:Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, La/hgt;

    .line 72
    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    sget-object v0, La/hgt;->d:La/hgt;

    .line 76
    .line 77
    :cond_1
    invoke-direct {p1, v0}, La/nve0;-><init>(La/hgt;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    new-instance p1, La/a9f0;

    .line 93
    .line 94
    sget-object v2, La/ggt;->b:La/nek;

    .line 95
    .line 96
    long-to-int v0, v0

    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v1, La/ggt;->c:Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/ggt;

    .line 111
    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    sget-object v0, La/ggt;->d:La/ggt;

    .line 115
    .line 116
    :cond_2
    invoke-direct {p1, v0}, La/a9f0;-><init>(La/ggt;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_4

    .line 132
    .line 133
    const/4 v0, 0x1

    .line 134
    if-eq p1, v0, :cond_3

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    sget-object p1, La/mus;->a:La/mus;

    .line 138
    .line 139
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_4
    sget-object p1, La/lus;->a:La/lus;

    .line 144
    .line 145
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_3
    check-cast p1, La/ims;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    new-instance v0, La/ulr;

    .line 157
    .line 158
    invoke-direct {v0, p1}, La/ulr;-><init>(La/ims;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_4
    check-cast p1, La/nus;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v0, La/zlr;

    .line 173
    .line 174
    invoke-direct {v0, p1}, La/zlr;-><init>(La/nus;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object p0

    .line 183
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    new-instance v0, La/tlr;

    .line 189
    .line 190
    invoke-direct {v0, p1}, La/tlr;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_6
    check-cast p1, La/uss;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    new-instance v0, La/slr;

    .line 205
    .line 206
    invoke-direct {v0, p1}, La/slr;-><init>(La/uss;)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_7
    check-cast p1, La/hdb;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v0, La/rlr;

    .line 221
    .line 222
    invoke-direct {v0, p1}, La/rlr;-><init>(La/hdb;)V

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
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance v0, La/nis;

    .line 237
    .line 238
    invoke-direct {v0, p1}, La/nis;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    new-instance v0, La/qis;

    .line 253
    .line 254
    invoke-direct {v0, p1}, La/qis;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_a
    check-cast p1, La/e0k0;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    new-instance v0, La/pis;

    .line 269
    .line 270
    invoke-direct {v0, p1}, La/pis;-><init>(La/e0k0;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_b
    check-cast p1, La/o49;

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    new-instance v0, La/jis;

    .line 285
    .line 286
    invoke-direct {v0, p1}, La/jis;-><init>(La/o49;)V

    .line 287
    .line 288
    .line 289
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object p0

    .line 295
    :pswitch_c
    check-cast p1, La/o49;

    .line 296
    .line 297
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    new-instance v0, La/iis;

    .line 301
    .line 302
    invoke-direct {v0, p1}, La/iis;-><init>(La/o49;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object p0

    .line 311
    :pswitch_d
    check-cast p1, La/bem;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    new-instance v0, La/jhs;

    .line 317
    .line 318
    invoke-direct {v0, p1}, La/jhs;-><init>(La/bem;)V

    .line 319
    .line 320
    .line 321
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    return-object p0

    .line 327
    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

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
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    new-instance v0, La/zas;

    .line 344
    .line 345
    invoke-direct {v0, p1}, La/zas;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 352
    .line 353
    return-object p0

    .line 354
    :pswitch_10
    check-cast p1, Ljava/lang/Long;

    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 357
    .line 358
    .line 359
    move-result-wide v0

    .line 360
    new-instance p1, La/yas;

    .line 361
    .line 362
    invoke-direct {p1, v0, v1}, La/yas;-><init>(J)V

    .line 363
    .line 364
    .line 365
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    return-object p0

    .line 371
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    new-instance v0, La/tt30;

    .line 377
    .line 378
    invoke-direct {v0, p1}, La/tt30;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    return-object p0

    .line 387
    :pswitch_12
    check-cast p1, La/qkx;

    .line 388
    .line 389
    iget-wide v0, p1, La/qkx;->a:J

    .line 390
    .line 391
    const-wide v2, 0xffffffffL

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    and-long/2addr v0, v2

    .line 397
    long-to-int p1, v0

    .line 398
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    return-object p0

    .line 408
    :pswitch_13
    check-cast p1, La/jtl;

    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    sget-object p1, La/pjr;->a:La/pjr;

    .line 414
    .line 415
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    return-object p0

    .line 421
    :pswitch_14
    check-cast p1, Ljava/lang/Float;

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 424
    .line 425
    .line 426
    move-result p1

    .line 427
    new-instance v0, La/t420;

    .line 428
    .line 429
    invoke-direct {v0, p1}, La/t420;-><init>(F)V

    .line 430
    .line 431
    .line 432
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 436
    .line 437
    return-object p0

    .line 438
    :pswitch_15
    check-cast p1, La/a8q0;

    .line 439
    .line 440
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    new-instance v0, La/u420;

    .line 444
    .line 445
    invoke-direct {v0, p1}, La/u420;-><init>(La/a8q0;)V

    .line 446
    .line 447
    .line 448
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    return-object p0

    .line 454
    :pswitch_16
    check-cast p1, Ljava/lang/Float;

    .line 455
    .line 456
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 457
    .line 458
    .line 459
    move-result p1

    .line 460
    new-instance v0, La/u320;

    .line 461
    .line 462
    invoke-direct {v0, p1}, La/u320;-><init>(F)V

    .line 463
    .line 464
    .line 465
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 469
    .line 470
    return-object p0

    .line 471
    :pswitch_17
    check-cast p1, La/a8q0;

    .line 472
    .line 473
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    new-instance v0, La/v320;

    .line 477
    .line 478
    invoke-direct {v0, p1}, La/v320;-><init>(La/a8q0;)V

    .line 479
    .line 480
    .line 481
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object p0

    .line 487
    :pswitch_18
    check-cast p1, Ljava/lang/Float;

    .line 488
    .line 489
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 490
    .line 491
    .line 492
    move-result p1

    .line 493
    new-instance v0, La/y320;

    .line 494
    .line 495
    invoke-direct {v0, p1}, La/y320;-><init>(F)V

    .line 496
    .line 497
    .line 498
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    return-object p0

    .line 504
    :pswitch_19
    check-cast p1, La/a8q0;

    .line 505
    .line 506
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    new-instance v0, La/z320;

    .line 510
    .line 511
    invoke-direct {v0, p1}, La/z320;-><init>(La/a8q0;)V

    .line 512
    .line 513
    .line 514
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 518
    .line 519
    return-object p0

    .line 520
    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    .line 521
    .line 522
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    new-instance v0, La/l420;

    .line 526
    .line 527
    invoke-direct {v0, p1}, La/l420;-><init>(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object p0

    .line 536
    :pswitch_1b
    check-cast p1, La/ynd0;

    .line 537
    .line 538
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    new-instance v0, La/d520;

    .line 542
    .line 543
    invoke-direct {v0, p1}, La/d520;-><init>(La/ynd0;)V

    .line 544
    .line 545
    .line 546
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object p0

    .line 552
    :pswitch_1c
    check-cast p1, Ljava/lang/Integer;

    .line 553
    .line 554
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 555
    .line 556
    .line 557
    sget-object p1, La/w8q;->a:La/w8q;

    .line 558
    .line 559
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 563
    .line 564
    return-object p0

    .line 565
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
