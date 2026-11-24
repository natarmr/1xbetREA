.class public final synthetic La/yip;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yip;->a:B

    iput-object p1, p0, La/yip;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/yip;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "viewModelFactory"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/yip;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/jbs;

    .line 13
    .line 14
    sget-object v0, La/jbs;->R1:La/xak;

    .line 15
    .line 16
    iget-object p0, p0, La/jbs;->O1:La/fiu0;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v3

    .line 25
    :pswitch_0
    check-cast p0, La/iqi;

    .line 26
    .line 27
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/gii0;

    .line 30
    .line 31
    const-class v0, La/ebs;

    .line 32
    .line 33
    sget-object v1, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/ebs;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p0, La/g9s;

    .line 47
    .line 48
    sget-object v0, La/o7s;->a:La/o7s;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_2
    check-cast p0, La/k4s;

    .line 57
    .line 58
    sget-object v0, La/v2s;->a:La/v2s;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_3
    check-cast p0, La/f0s;

    .line 67
    .line 68
    invoke-interface {p0}, La/f0s;->j()V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_4
    check-cast p0, La/ypr;

    .line 75
    .line 76
    new-instance v0, La/zpr;

    .line 77
    .line 78
    invoke-direct {v0, p0}, La/zpr;-><init>(La/ypr;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_5
    check-cast p0, La/spr;

    .line 83
    .line 84
    sget-object v0, La/nnr;->b:La/nnr;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_6
    check-cast p0, La/vkr;

    .line 93
    .line 94
    iget-object v0, p0, La/vkr;->g:La/p7m0;

    .line 95
    .line 96
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    move-object v1, p0

    .line 101
    check-cast v1, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_1

    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_7
    check-cast p0, La/wti;

    .line 118
    .line 119
    iget-object p0, p0, La/wti;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, La/gii0;

    .line 122
    .line 123
    const-class v0, La/fjr;

    .line 124
    .line 125
    sget-object v1, La/sre0;->a:La/tre0;

    .line 126
    .line 127
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, La/fjr;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_8
    move-object v0, p0

    .line 139
    check-cast v0, La/hkr;

    .line 140
    .line 141
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 142
    .line 143
    iget-object v2, p0, La/ocj;->a:La/p7m0;

    .line 144
    .line 145
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 153
    .line 154
    move-object v5, p0

    .line 155
    check-cast v5, La/ekr;

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    const/4 v4, 0x1

    .line 161
    invoke-static {v5, v3, v1, v4}, La/ekr;->a(La/ekr;Ljava/util/List;ZI)La/ekr;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v2, p0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-eqz p0, :cond_2

    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_9
    check-cast p0, La/yiu;

    .line 175
    .line 176
    iget-object p0, p0, La/yiu;->a:La/j1q0;

    .line 177
    .line 178
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 179
    .line 180
    invoke-virtual {p0}, La/m1q0;->b()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    sget-object v2, La/lun;->a:La/lun;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v0, La/scr;

    .line 190
    .line 191
    const/4 v4, 0x0

    .line 192
    const-string v1, ""

    .line 193
    .line 194
    const/4 v3, 0x1

    .line 195
    invoke-direct/range {v0 .. v5}, La/scr;-><init>(Ljava/lang/String;Ljava/util/Map;ZZZ)V

    .line 196
    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_a
    check-cast p0, La/qcr;

    .line 200
    .line 201
    sget-object v0, La/qcr;->Q1:La/bek;

    .line 202
    .line 203
    iget-object p0, p0, La/qcr;->O1:La/fiu0;

    .line 204
    .line 205
    if-eqz p0, :cond_3

    .line 206
    .line 207
    return-object p0

    .line 208
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw v3

    .line 212
    :pswitch_b
    check-cast p0, La/zbr;

    .line 213
    .line 214
    iget-object p0, p0, La/zbr;->c:La/wwh0;

    .line 215
    .line 216
    iget-object p0, p0, La/wwh0;->a:La/a4x;

    .line 217
    .line 218
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_c
    check-cast p0, La/ecr;

    .line 228
    .line 229
    iget-object p0, p0, La/ecr;->b:La/ctf0;

    .line 230
    .line 231
    sget-object v0, La/fcr;->a:Ljava/util/Set;

    .line 232
    .line 233
    new-instance v2, La/wul;

    .line 234
    .line 235
    sget-object v3, La/iul;->e:La/iul;

    .line 236
    .line 237
    sget-object v4, La/oe9;->a:La/oe9;

    .line 238
    .line 239
    new-instance v5, La/ue9;

    .line 240
    .line 241
    new-array v0, v1, [Ljava/lang/Object;

    .line 242
    .line 243
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 244
    .line 245
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const v1, 0x7f130528

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-direct {v5, p0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const/4 v7, 0x0

    .line 260
    const/4 v8, 0x1

    .line 261
    const/4 v6, 0x1

    .line 262
    invoke-direct/range {v2 .. v8}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 263
    .line 264
    .line 265
    return-object v2

    .line 266
    :pswitch_d
    check-cast p0, La/lar;

    .line 267
    .line 268
    sget-object v0, La/lar;->Q1:La/xak;

    .line 269
    .line 270
    iget-object p0, p0, La/lar;->N1:La/fiu0;

    .line 271
    .line 272
    if-eqz p0, :cond_4

    .line 273
    .line 274
    return-object p0

    .line 275
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v3

    .line 279
    :pswitch_e
    check-cast p0, La/b8r;

    .line 280
    .line 281
    iget-object v1, p0, La/b8r;->a:Landroid/content/Context;

    .line 282
    .line 283
    iget-object v0, p0, La/b8r;->b:Ljava/lang/String;

    .line 284
    .line 285
    const/16 v2, 0xa

    .line 286
    .line 287
    if-eqz v0, :cond_5

    .line 288
    .line 289
    iget-boolean v3, p0, La/b8r;->d:Z

    .line 290
    .line 291
    if-eqz v3, :cond_5

    .line 292
    .line 293
    new-instance v3, Ljava/io/File;

    .line 294
    .line 295
    invoke-virtual {v1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-direct {v3, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    new-instance v0, La/a8r;

    .line 303
    .line 304
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    move v4, v2

    .line 309
    move-object v2, v3

    .line 310
    new-instance v3, La/bwl;

    .line 311
    .line 312
    invoke-direct {v3, v4}, La/bwl;-><init>(B)V

    .line 313
    .line 314
    .line 315
    iget-object v4, p0, La/b8r;->c:La/y78;

    .line 316
    .line 317
    iget-boolean v5, p0, La/b8r;->e:Z

    .line 318
    .line 319
    invoke-direct/range {v0 .. v5}, La/a8r;-><init>(Landroid/content/Context;Ljava/lang/String;La/bwl;La/y78;Z)V

    .line 320
    .line 321
    .line 322
    goto :goto_0

    .line 323
    :cond_5
    move v4, v2

    .line 324
    new-instance v0, La/a8r;

    .line 325
    .line 326
    iget-object v2, p0, La/b8r;->b:Ljava/lang/String;

    .line 327
    .line 328
    new-instance v3, La/bwl;

    .line 329
    .line 330
    invoke-direct {v3, v4}, La/bwl;-><init>(B)V

    .line 331
    .line 332
    .line 333
    iget-object v4, p0, La/b8r;->c:La/y78;

    .line 334
    .line 335
    iget-boolean v5, p0, La/b8r;->e:Z

    .line 336
    .line 337
    invoke-direct/range {v0 .. v5}, La/a8r;-><init>(Landroid/content/Context;Ljava/lang/String;La/bwl;La/y78;Z)V

    .line 338
    .line 339
    .line 340
    :goto_0
    iget-boolean p0, p0, La/b8r;->g:Z

    .line 341
    .line 342
    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 343
    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_f
    check-cast p0, La/zri;

    .line 347
    .line 348
    iget-object p0, p0, La/zri;->b:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast p0, La/gii0;

    .line 351
    .line 352
    const-class v0, La/tuq;

    .line 353
    .line 354
    sget-object v1, La/sre0;->a:La/tre0;

    .line 355
    .line 356
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    check-cast p0, La/tuq;

    .line 365
    .line 366
    return-object p0

    .line 367
    :pswitch_10
    check-cast p0, La/nqq;

    .line 368
    .line 369
    invoke-virtual {p0}, La/nqq;->b1()La/aqq;

    .line 370
    .line 371
    .line 372
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    return-object p0

    .line 375
    :pswitch_11
    check-cast p0, La/lhq;

    .line 376
    .line 377
    iget-object p0, p0, La/lhq;->a:Ljava/util/concurrent/CountDownLatch;

    .line 378
    .line 379
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 380
    .line 381
    .line 382
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_12
    check-cast p0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;

    .line 386
    .line 387
    sget v0, Landroidx/biometric/internal/ui/FingerprintDialogActivity;->Z:I

    .line 388
    .line 389
    invoke-virtual {p0}, La/agd;->n()La/miu0;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    return-object p0

    .line 394
    :pswitch_13
    check-cast p0, La/q9q;

    .line 395
    .line 396
    sget v0, La/q9q;->m2:I

    .line 397
    .line 398
    iget-object p0, p0, La/q9q;->k2:La/fiu0;

    .line 399
    .line 400
    if-eqz p0, :cond_6

    .line 401
    .line 402
    return-object p0

    .line 403
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw v3

    .line 407
    :pswitch_14
    check-cast p0, La/iqi;

    .line 408
    .line 409
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast p0, La/gii0;

    .line 412
    .line 413
    const-class v0, La/jyp;

    .line 414
    .line 415
    sget-object v1, La/sre0;->a:La/tre0;

    .line 416
    .line 417
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    check-cast p0, La/jyp;

    .line 426
    .line 427
    return-object p0

    .line 428
    :pswitch_15
    check-cast p0, La/hsj;

    .line 429
    .line 430
    iget-object p0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast p0, La/gii0;

    .line 433
    .line 434
    const-class v0, La/lxp;

    .line 435
    .line 436
    sget-object v1, La/sre0;->a:La/tre0;

    .line 437
    .line 438
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    check-cast p0, La/lxp;

    .line 447
    .line 448
    return-object p0

    .line 449
    :pswitch_16
    check-cast p0, La/zri;

    .line 450
    .line 451
    iget-object p0, p0, La/zri;->b:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast p0, La/gii0;

    .line 454
    .line 455
    const-class v0, La/owp;

    .line 456
    .line 457
    sget-object v1, La/sre0;->a:La/tre0;

    .line 458
    .line 459
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    check-cast p0, La/owp;

    .line 468
    .line 469
    return-object p0

    .line 470
    :pswitch_17
    check-cast p0, La/fhj;

    .line 471
    .line 472
    iget-object p0, p0, La/fhj;->a:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast p0, La/gii0;

    .line 475
    .line 476
    const-class v0, La/awp;

    .line 477
    .line 478
    sget-object v1, La/sre0;->a:La/tre0;

    .line 479
    .line 480
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    check-cast p0, La/awp;

    .line 489
    .line 490
    return-object p0

    .line 491
    :pswitch_18
    check-cast p0, La/iqi;

    .line 492
    .line 493
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast p0, La/gii0;

    .line 496
    .line 497
    const-class v0, La/ovp;

    .line 498
    .line 499
    sget-object v1, La/sre0;->a:La/tre0;

    .line 500
    .line 501
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    check-cast p0, La/ovp;

    .line 510
    .line 511
    return-object p0

    .line 512
    :pswitch_19
    check-cast p0, La/zri;

    .line 513
    .line 514
    iget-object p0, p0, La/zri;->b:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast p0, La/gii0;

    .line 517
    .line 518
    const-class v0, La/ntp;

    .line 519
    .line 520
    sget-object v1, La/sre0;->a:La/tre0;

    .line 521
    .line 522
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    check-cast p0, La/ntp;

    .line 531
    .line 532
    return-object p0

    .line 533
    :pswitch_1a
    check-cast p0, La/wtp;

    .line 534
    .line 535
    sget-object v0, La/wtp;->R1:La/sek;

    .line 536
    .line 537
    iget-object p0, p0, La/wtp;->M1:La/fiu0;

    .line 538
    .line 539
    if-eqz p0, :cond_7

    .line 540
    .line 541
    return-object p0

    .line 542
    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    throw v3

    .line 546
    :pswitch_1b
    check-cast p0, La/jtj;

    .line 547
    .line 548
    iget-object p0, p0, La/jtj;->b:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast p0, La/gii0;

    .line 551
    .line 552
    const-class v0, La/csp;

    .line 553
    .line 554
    sget-object v1, La/sre0;->a:La/tre0;

    .line 555
    .line 556
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object p0

    .line 564
    check-cast p0, La/csp;

    .line 565
    .line 566
    return-object p0

    .line 567
    :pswitch_1c
    check-cast p0, La/iqi;

    .line 568
    .line 569
    iget-object p0, p0, La/iqi;->c:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast p0, La/gii0;

    .line 572
    .line 573
    const-class v0, La/thp;

    .line 574
    .line 575
    sget-object v1, La/sre0;->a:La/tre0;

    .line 576
    .line 577
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    check-cast p0, La/thp;

    .line 586
    .line 587
    return-object p0

    .line 588
    nop

    .line 589
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
