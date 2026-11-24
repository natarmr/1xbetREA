.class public final synthetic La/cp8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/cp8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/by8;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/cp8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte p0, p0, La/cp8;->a:B

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    check-cast p1, La/bh90;

    .line 17
    .line 18
    sget-object p0, La/dy2;->b:La/zfn;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p0}, La/qbc;->V(La/bh90;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "android.software.leanback"

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_0

    .line 40
    .line 41
    sget-object p0, La/j39;->a:La/i39;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object p0, La/i39;->c:La/h39;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    sget-object p0, La/l39;->b:La/k39;

    .line 50
    .line 51
    :goto_0
    return-object p0

    .line 52
    :pswitch_1
    check-cast p1, La/ob0;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance p0, La/o19;

    .line 58
    .line 59
    invoke-direct {p0, p1}, La/o19;-><init>(La/ob0;)V

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, La/kg;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, La/oja0;->b0(La/kg;)La/ijl;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    new-instance v0, La/mdm;

    .line 80
    .line 81
    sget-object p1, La/pb10;->c:La/xuz;

    .line 82
    .line 83
    sget-object v1, La/pb10;->g:La/pb10;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const-wide/16 v11, 0x0

    .line 93
    .line 94
    const/16 v13, 0x25e

    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    const v6, 0x7f1307c4

    .line 101
    .line 102
    .line 103
    const/4 v7, 0x0

    .line 104
    const v8, 0x7f131690

    .line 105
    .line 106
    .line 107
    const-wide/16 v9, 0x2710

    .line 108
    .line 109
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    new-instance v0, La/mdm;

    .line 120
    .line 121
    sget-object p1, La/pb10;->c:La/xuz;

    .line 122
    .line 123
    sget-object v1, La/pb10;->g:La/pb10;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    const-wide/16 v11, 0x0

    .line 133
    .line 134
    const/16 v13, 0x3de

    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    const/4 v3, 0x0

    .line 138
    const/4 v4, 0x0

    .line 139
    const/4 v5, 0x0

    .line 140
    const v6, 0x7f130674

    .line 141
    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    const/4 v8, 0x0

    .line 145
    const-wide/16 v9, 0x0

    .line 146
    .line 147
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    new-instance v0, La/mdm;

    .line 158
    .line 159
    sget-object p1, La/pb10;->c:La/xuz;

    .line 160
    .line 161
    sget-object v1, La/pb10;->e:La/pb10;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    const-wide/16 v11, 0x0

    .line 171
    .line 172
    const/16 v13, 0x3de

    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    const/4 v3, 0x0

    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v5, 0x0

    .line 178
    const v6, 0x7f130e37

    .line 179
    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    const/4 v8, 0x0

    .line 183
    const-wide/16 v9, 0x0

    .line 184
    .line 185
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_6
    check-cast p1, La/hr10;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static {p1}, La/x2x;->m0(La/hr10;)La/lq5;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :pswitch_7
    check-cast p1, La/th1;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-static {p1}, La/aad;->d0(La/th1;)La/rh1;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :pswitch_8
    check-cast p1, La/vz8;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    const-class p0, La/vz8;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_9
    check-cast p1, La/vz8;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    iget p0, p1, La/vz8;->a:I

    .line 223
    .line 224
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :pswitch_a
    check-cast p1, La/ob0;

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    new-instance p0, La/jx8;

    .line 235
    .line 236
    invoke-direct {p0, p1}, La/jx8;-><init>(La/ob0;)V

    .line 237
    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    new-instance v0, La/mdm;

    .line 247
    .line 248
    sget-object p1, La/pb10;->c:La/xuz;

    .line 249
    .line 250
    sget-object v1, La/pb10;->g:La/pb10;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    const-wide/16 v11, 0x0

    .line 260
    .line 261
    const/16 v13, 0x25e

    .line 262
    .line 263
    const/4 v2, 0x0

    .line 264
    const/4 v3, 0x0

    .line 265
    const/4 v4, 0x0

    .line 266
    const/4 v5, 0x0

    .line 267
    const v6, 0x7f1307c4

    .line 268
    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const v8, 0x7f131690

    .line 272
    .line 273
    .line 274
    const-wide/16 v9, 0x2710

    .line 275
    .line 276
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 277
    .line 278
    .line 279
    return-object v0

    .line 280
    :pswitch_c
    check-cast p1, Ljava/lang/Integer;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result p0

    .line 286
    new-instance v0, La/mdm;

    .line 287
    .line 288
    sget-object p1, La/pb10;->c:La/xuz;

    .line 289
    .line 290
    sget-object v1, La/pb10;->e:La/pb10;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    const-wide/16 v11, 0x0

    .line 300
    .line 301
    const/16 v13, 0x3de

    .line 302
    .line 303
    const/4 v2, 0x0

    .line 304
    const/4 v3, 0x0

    .line 305
    const/4 v4, 0x0

    .line 306
    const/4 v5, 0x0

    .line 307
    const v6, 0x7f130e37

    .line 308
    .line 309
    .line 310
    const/4 v7, 0x0

    .line 311
    const/4 v8, 0x0

    .line 312
    const-wide/16 v9, 0x0

    .line 313
    .line 314
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 315
    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_d
    check-cast p1, La/ot0;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    if-eqz p0, :cond_5

    .line 328
    .line 329
    const/4 p1, 0x1

    .line 330
    if-eq p0, p1, :cond_4

    .line 331
    .line 332
    const/4 p1, 0x2

    .line 333
    if-eq p0, p1, :cond_3

    .line 334
    .line 335
    if-eq p0, v1, :cond_2

    .line 336
    .line 337
    const/4 p1, 0x4

    .line 338
    if-ne p0, p1, :cond_1

    .line 339
    .line 340
    sget-object v2, La/pt0;->e:La/pt0;

    .line 341
    .line 342
    goto :goto_1

    .line 343
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 344
    .line 345
    .line 346
    goto :goto_1

    .line 347
    :cond_2
    sget-object v2, La/pt0;->d:La/pt0;

    .line 348
    .line 349
    goto :goto_1

    .line 350
    :cond_3
    sget-object v2, La/pt0;->c:La/pt0;

    .line 351
    .line 352
    goto :goto_1

    .line 353
    :cond_4
    sget-object v2, La/pt0;->b:La/pt0;

    .line 354
    .line 355
    goto :goto_1

    .line 356
    :cond_5
    sget-object v2, La/pt0;->a:La/pt0;

    .line 357
    .line 358
    :goto_1
    return-object v2

    .line 359
    :pswitch_e
    check-cast p1, La/vx8;

    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    iget-boolean p0, p1, La/vx8;->a:Z

    .line 365
    .line 366
    if-eqz p0, :cond_6

    .line 367
    .line 368
    new-instance p0, La/gyl;

    .line 369
    .line 370
    invoke-direct {p0, v2, v2, v1}, La/gyl;-><init>(La/syl;La/lh80;I)V

    .line 371
    .line 372
    .line 373
    goto :goto_3

    .line 374
    :cond_6
    iget-object p0, p1, La/vx8;->b:Ljava/util/List;

    .line 375
    .line 376
    new-instance v1, Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 383
    .line 384
    .line 385
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_7

    .line 394
    .line 395
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    check-cast v0, La/gw80;

    .line 400
    .line 401
    iget-wide v2, p1, La/vx8;->c:J

    .line 402
    .line 403
    new-instance v4, La/xxl;

    .line 404
    .line 405
    iget-object v5, v0, La/gw80;->b:Ljava/lang/String;

    .line 406
    .line 407
    invoke-direct {v4, v5}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-static {v0, v2, v3, v4}, La/by8;->a(La/gw80;JLa/dyl;)La/lxl;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto :goto_2

    .line 418
    :cond_7
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    new-instance v2, La/fyl;

    .line 423
    .line 424
    const/4 v4, 0x0

    .line 425
    const/4 v5, 0x0

    .line 426
    const/4 v6, 0x0

    .line 427
    const/4 v7, 0x0

    .line 428
    const/16 v8, 0x1e

    .line 429
    .line 430
    invoke-direct/range {v2 .. v8}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 431
    .line 432
    .line 433
    move-object p0, v2

    .line 434
    :goto_3
    return-object p0

    .line 435
    :pswitch_f
    check-cast p1, La/kg;

    .line 436
    .line 437
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-static {p1}, La/oja0;->b0(La/kg;)La/ijl;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    return-object p0

    .line 445
    :pswitch_10
    check-cast p1, La/gzh;

    .line 446
    .line 447
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    sget-object p1, La/sre0;->a:La/tre0;

    .line 455
    .line 456
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    return-object p0

    .line 461
    :pswitch_11
    check-cast p1, La/gzh;

    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    instance-of p0, p1, La/ezh;

    .line 467
    .line 468
    if-eqz p0, :cond_8

    .line 469
    .line 470
    check-cast p1, La/ezh;

    .line 471
    .line 472
    iget-wide p0, p1, La/ezh;->a:J

    .line 473
    .line 474
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    goto :goto_4

    .line 479
    :cond_8
    sget-object p0, La/fzh;->a:La/fzh;

    .line 480
    .line 481
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result p0

    .line 485
    if-eqz p0, :cond_9

    .line 486
    .line 487
    const/4 p0, -0x1

    .line 488
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    goto :goto_4

    .line 493
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 494
    .line 495
    .line 496
    :goto_4
    return-object v2

    .line 497
    :pswitch_12
    check-cast p1, La/ux8;

    .line 498
    .line 499
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    instance-of p0, p1, La/qx8;

    .line 503
    .line 504
    if-eqz p0, :cond_a

    .line 505
    .line 506
    check-cast p1, La/qx8;

    .line 507
    .line 508
    goto :goto_5

    .line 509
    :cond_a
    move-object p1, v2

    .line 510
    :goto_5
    if-eqz p1, :cond_b

    .line 511
    .line 512
    iget-object p0, p1, La/qx8;->b:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 513
    .line 514
    if-eqz p0, :cond_b

    .line 515
    .line 516
    new-instance v3, La/rqm;

    .line 517
    .line 518
    new-instance v4, La/tui0;

    .line 519
    .line 520
    iget-object p0, p0, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;->a:Ljava/lang/String;

    .line 521
    .line 522
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 523
    .line 524
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 525
    .line 526
    .line 527
    move-result-object p1

    .line 528
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 529
    .line 530
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 531
    .line 532
    .line 533
    move-result-wide v0

    .line 534
    new-instance p1, La/y3d;

    .line 535
    .line 536
    invoke-direct {p1, v0, v1}, La/y3d;-><init>(J)V

    .line 537
    .line 538
    .line 539
    invoke-direct {v4, p0, p1}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 540
    .line 541
    .line 542
    new-instance v6, La/fvi0;

    .line 543
    .line 544
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 545
    .line 546
    .line 547
    move-result-object p0

    .line 548
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 549
    .line 550
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 551
    .line 552
    .line 553
    move-result-wide p0

    .line 554
    new-instance v0, La/y3d;

    .line 555
    .line 556
    invoke-direct {v0, p0, p1}, La/y3d;-><init>(J)V

    .line 557
    .line 558
    .line 559
    invoke-direct {v6, v0}, La/fvi0;-><init>(La/y3d;)V

    .line 560
    .line 561
    .line 562
    sget-object v7, La/d4d;->B:La/d4d;

    .line 563
    .line 564
    sget-object v9, La/wui0;->a:La/wui0;

    .line 565
    .line 566
    const/4 v11, 0x0

    .line 567
    const/16 v12, 0x1aa

    .line 568
    .line 569
    const/4 v5, 0x0

    .line 570
    const/4 v8, 0x0

    .line 571
    const/4 v10, 0x0

    .line 572
    invoke-direct/range {v3 .. v12}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 573
    .line 574
    .line 575
    move-object v2, v3

    .line 576
    :cond_b
    return-object v2

    .line 577
    :pswitch_13
    check-cast p1, La/xw8;

    .line 578
    .line 579
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    instance-of p0, p1, La/vw8;

    .line 583
    .line 584
    if-eqz p0, :cond_d

    .line 585
    .line 586
    check-cast p1, La/vw8;

    .line 587
    .line 588
    iget-object p0, p1, La/vw8;->a:Ljava/util/List;

    .line 589
    .line 590
    new-instance p1, Ljava/util/ArrayList;

    .line 591
    .line 592
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 597
    .line 598
    .line 599
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    if-eqz v0, :cond_c

    .line 608
    .line 609
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    check-cast v0, Lorg/xplatform/aggregator/impl/core/domain/models/AggregatorGameLanguage;

    .line 614
    .line 615
    new-instance v2, La/lxl;

    .line 616
    .line 617
    iget v3, v0, Lorg/xplatform/aggregator/impl/core/domain/models/AggregatorGameLanguage;->a:I

    .line 618
    .line 619
    int-to-long v3, v3

    .line 620
    new-instance v5, La/xxl;

    .line 621
    .line 622
    iget-object v0, v0, Lorg/xplatform/aggregator/impl/core/domain/models/AggregatorGameLanguage;->b:Ljava/lang/String;

    .line 623
    .line 624
    invoke-direct {v5, v0}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    sget-object v7, La/uxl;->a:La/uxl;

    .line 628
    .line 629
    const/4 v8, 0x0

    .line 630
    const/16 v9, 0x68

    .line 631
    .line 632
    const/4 v6, 0x0

    .line 633
    invoke-direct/range {v2 .. v9}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    goto :goto_6

    .line 640
    :cond_c
    invoke-static {p1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 641
    .line 642
    .line 643
    move-result-object v4

    .line 644
    const/4 p0, 0x0

    .line 645
    invoke-static {p0, p0, v1}, La/s5x0;->t(FFI)La/lh80;

    .line 646
    .line 647
    .line 648
    move-result-object v7

    .line 649
    sget-object v5, La/tyl;->a:La/tyl;

    .line 650
    .line 651
    sget-object v6, La/syl;->b:La/syl;

    .line 652
    .line 653
    new-instance v3, La/fyl;

    .line 654
    .line 655
    const/4 v8, 0x0

    .line 656
    const/16 v9, 0x10

    .line 657
    .line 658
    invoke-direct/range {v3 .. v9}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 659
    .line 660
    .line 661
    move-object v2, v3

    .line 662
    :cond_d
    return-object v2

    .line 663
    :pswitch_14
    check-cast p1, La/zv8;

    .line 664
    .line 665
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    move-result-object p0

    .line 672
    return-object p0

    .line 673
    :pswitch_15
    check-cast p1, La/zv8;

    .line 674
    .line 675
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    invoke-interface {p1}, La/zv8;->getId()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    return-object p0

    .line 683
    :pswitch_16
    check-cast p1, Ljava/lang/Integer;

    .line 684
    .line 685
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 689
    .line 690
    return-object p0

    .line 691
    :pswitch_17
    check-cast p1, La/lk50;

    .line 692
    .line 693
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 694
    .line 695
    return-object p0

    .line 696
    :pswitch_18
    check-cast p1, Ljava/lang/Boolean;

    .line 697
    .line 698
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 702
    .line 703
    return-object p0

    .line 704
    :pswitch_19
    check-cast p1, La/ou90;

    .line 705
    .line 706
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 707
    .line 708
    return-object p0

    .line 709
    :pswitch_1a
    check-cast p1, La/ou90;

    .line 710
    .line 711
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 712
    .line 713
    return-object p0

    .line 714
    :pswitch_1b
    check-cast p1, La/ypj0;

    .line 715
    .line 716
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 717
    .line 718
    return-object p0

    .line 719
    :pswitch_1c
    check-cast p1, La/abi0;

    .line 720
    .line 721
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    invoke-static {p1}, La/yai0;->j(La/abi0;)V

    .line 725
    .line 726
    .line 727
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 728
    .line 729
    return-object p0

    .line 730
    nop

    .line 731
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
