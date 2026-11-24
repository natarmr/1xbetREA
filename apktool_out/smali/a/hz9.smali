.class public final synthetic La/hz9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qz9;


# direct methods
.method public synthetic constructor <init>(La/qz9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hz9;->a:B

    iput-object p1, p0, La/hz9;->b:La/qz9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/hz9;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/hz9;->b:La/qz9;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 12
    .line 13
    iget-object p0, p0, La/qz9;->i2:La/a8z;

    .line 14
    .line 15
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/ig00;

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/lyb0;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 29
    .line 30
    sget-object v0, La/m2a;->d:La/m2a;

    .line 31
    .line 32
    new-instance v1, La/jsf0;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v2, Landroid/util/Size;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 59
    .line 60
    invoke-direct {v2, v4, p0}, Landroid/util/Size;-><init>(II)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, v2}, La/jsf0;-><init>(Landroid/util/Size;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, La/isf0;

    .line 67
    .line 68
    invoke-direct {p0, v0, v1, v3}, La/isf0;-><init>(La/m2a;La/jsf0;I)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_1
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 73
    .line 74
    sget-object v0, La/lyb0;->b:La/lyb0;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    sget-object v0, La/lyb0;->b:La/lyb0;

    .line 81
    .line 82
    iget-object v0, v0, La/lyb0;->a:La/rrd;

    .line 83
    .line 84
    iget-object v1, v0, La/rrd;->b:Ljava/lang/Object;

    .line 85
    .line 86
    monitor-enter v1

    .line 87
    :try_start_0
    sget-object v4, La/uje;->a:Ljava/lang/Object;

    .line 88
    .line 89
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/16 v5, 0x22

    .line 92
    .line 93
    if-lt v4, v5, :cond_0

    .line 94
    .line 95
    invoke-static {p0}, La/r6;->h(Landroid/content/Context;)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move v4, v3

    .line 101
    :goto_0
    sget-object v5, La/qkz;->a:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 104
    :try_start_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v5, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    if-nez v6, :cond_1

    .line 113
    .line 114
    new-instance v6, La/skz;

    .line 115
    .line 116
    invoke-direct {v6}, La/skz;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_0
    move-exception p0

    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_1
    :goto_1
    check-cast v6, La/skz;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    :try_start_2
    monitor-exit v5

    .line 129
    iput-object v6, v0, La/rrd;->f:Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v4, v0, La/rrd;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v4, La/dfr;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 134
    .line 135
    const/16 v5, 0x1a

    .line 136
    .line 137
    if-eqz v4, :cond_2

    .line 138
    .line 139
    :goto_2
    monitor-exit v1

    .line 140
    goto :goto_4

    .line 141
    :cond_2
    :try_start_3
    new-instance v4, La/j4a;

    .line 142
    .line 143
    invoke-direct {v4, p0, v2}, La/j4a;-><init>(Landroid/content/Context;La/pkz;)V

    .line 144
    .line 145
    .line 146
    iget-object v2, v0, La/rrd;->d:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, La/ig00;

    .line 149
    .line 150
    instance-of v6, v2, La/dfr;

    .line 151
    .line 152
    if-eqz v6, :cond_3

    .line 153
    .line 154
    check-cast v2, La/dfr;

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_3
    new-instance v6, La/dfr;

    .line 158
    .line 159
    invoke-direct {v6, v2}, La/dfr;-><init>(La/ig00;)V

    .line 160
    .line 161
    .line 162
    move-object v2, v6

    .line 163
    :goto_3
    new-instance v6, La/ebz;

    .line 164
    .line 165
    const/16 v7, 0xf

    .line 166
    .line 167
    invoke-direct {v6, v4, v7}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 168
    .line 169
    .line 170
    new-instance v7, La/viq;

    .line 171
    .line 172
    const/16 v8, 0xd

    .line 173
    .line 174
    invoke-direct {v7, v6, v8}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-static {v2, v7, v6}, La/ro4;->k0(La/ig00;La/zy3;Ljava/util/concurrent/Executor;)La/qbb;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    new-instance v6, La/k9v;

    .line 186
    .line 187
    const/16 v7, 0xb

    .line 188
    .line 189
    invoke-direct {v6, v0, v4, p0, v7}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    new-instance p0, La/viq;

    .line 193
    .line 194
    const/16 v4, 0xe

    .line 195
    .line 196
    invoke-direct {p0, v6, v4}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    new-instance v6, La/a1d;

    .line 204
    .line 205
    invoke-direct {v6, p0, v5}, La/a1d;-><init>(Ljava/lang/Object;B)V

    .line 206
    .line 207
    .line 208
    invoke-static {v2, v6, v4}, La/ro4;->k0(La/ig00;La/zy3;Ljava/util/concurrent/Executor;)La/qbb;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    iput-object p0, v0, La/rrd;->c:Ljava/lang/Object;

    .line 213
    .line 214
    new-instance v2, La/g2v;

    .line 215
    .line 216
    invoke-direct {v2, v0}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v4, La/mfr;

    .line 224
    .line 225
    invoke-direct {v4, p0, v2, v3}, La/mfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v4, v0}, La/dfr;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 229
    .line 230
    .line 231
    invoke-static {p0}, La/ro4;->c0(La/ig00;)La/ig00;

    .line 232
    .line 233
    .line 234
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 235
    goto :goto_2

    .line 236
    :goto_4
    new-instance p0, La/peb0;

    .line 237
    .line 238
    const/16 v0, 0x1d

    .line 239
    .line 240
    invoke-direct {p0, v0}, La/peb0;-><init>(B)V

    .line 241
    .line 242
    .line 243
    new-instance v0, La/hny;

    .line 244
    .line 245
    invoke-direct {v0, p0}, La/hny;-><init>(La/peb0;)V

    .line 246
    .line 247
    .line 248
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    new-instance v1, La/a1d;

    .line 253
    .line 254
    invoke-direct {v1, v0, v5}, La/a1d;-><init>(Ljava/lang/Object;B)V

    .line 255
    .line 256
    .line 257
    invoke-static {v4, v1, p0}, La/ro4;->k0(La/ig00;La/zy3;Ljava/util/concurrent/Executor;)La/qbb;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    :catchall_1
    move-exception p0

    .line 263
    goto :goto_6

    .line 264
    :goto_5
    :try_start_4
    monitor-exit v5

    .line 265
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 266
    :goto_6
    monitor-exit v1

    .line 267
    throw p0

    .line 268
    :pswitch_2
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 269
    .line 270
    new-instance v0, La/mz9;

    .line 271
    .line 272
    invoke-direct {v0, p0}, La/mz9;-><init>(La/qz9;)V

    .line 273
    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_3
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 277
    .line 278
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    new-instance v1, La/oz9;

    .line 283
    .line 284
    invoke-direct {v1, p0, v0}, La/oz9;-><init>(La/qz9;Landroid/content/Context;)V

    .line 285
    .line 286
    .line 287
    return-object v1

    .line 288
    :pswitch_4
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 289
    .line 290
    new-instance v0, La/ry3;

    .line 291
    .line 292
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    iget-object p0, p0, La/qz9;->b2:La/fbi;

    .line 297
    .line 298
    if-eqz p0, :cond_4

    .line 299
    .line 300
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 301
    .line 302
    .line 303
    return-object v0

    .line 304
    :cond_4
    const-string p0, "cameraViewModelFactory"

    .line 305
    .line 306
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v2

    .line 310
    :pswitch_5
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 311
    .line 312
    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 313
    .line 314
    invoke-static {v0}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    const-string v1, "package"

    .line 319
    .line 320
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-static {v1, v3, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 336
    .line 337
    .line 338
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_6
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 342
    .line 343
    invoke-virtual {p0}, La/qz9;->U0()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0, v3, v3, v3}, La/sik;->z0(ZZZ)V

    .line 347
    .line 348
    .line 349
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    return-object p0

    .line 352
    :pswitch_7
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 353
    .line 354
    const-string v0, "android.permission.CAMERA"

    .line 355
    .line 356
    new-array v1, v3, [Ljava/lang/String;

    .line 357
    .line 358
    invoke-static {p0, v0, v1}, La/m7x;->P(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-virtual {p0}, La/khf0;->d()La/qog0;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    return-object p0

    .line 367
    :pswitch_8
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 368
    .line 369
    new-instance v0, La/gyw;

    .line 370
    .line 371
    invoke-direct {v0, v3}, La/gyw;-><init>(B)V

    .line 372
    .line 373
    .line 374
    iget-object p0, p0, La/qz9;->j2:La/a8z;

    .line 375
    .line 376
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    check-cast p0, La/isf0;

    .line 381
    .line 382
    iget-object v0, v0, La/gyw;->b:La/wy40;

    .line 383
    .line 384
    sget-object v1, La/w0x;->s0:La/u15;

    .line 385
    .line 386
    invoke-virtual {v0, v1, p0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    sget-object p0, La/myw;->b:La/u15;

    .line 390
    .line 391
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v0, p0, v1}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    new-instance p0, La/myw;

    .line 399
    .line 400
    invoke-static {v0}, La/b780;->j(La/drd;)La/b780;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-direct {p0, v0}, La/myw;-><init>(La/b780;)V

    .line 405
    .line 406
    .line 407
    invoke-static {p0}, La/w0x;->t(La/w0x;)V

    .line 408
    .line 409
    .line 410
    new-instance v0, La/jyw;

    .line 411
    .line 412
    invoke-direct {v0, p0}, La/jyw;-><init>(La/myw;)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :pswitch_9
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 417
    .line 418
    new-instance v0, La/gyw;

    .line 419
    .line 420
    invoke-direct {v0, v1}, La/gyw;-><init>(B)V

    .line 421
    .line 422
    .line 423
    iget-object v2, p0, La/qz9;->j2:La/a8z;

    .line 424
    .line 425
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    check-cast v2, La/isf0;

    .line 430
    .line 431
    iget-object v4, v0, La/gyw;->b:La/wy40;

    .line 432
    .line 433
    sget-object v5, La/w0x;->s0:La/u15;

    .line 434
    .line 435
    invoke-virtual {v4, v5, v2}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    sget-object v2, La/nzw;->b:La/u15;

    .line 439
    .line 440
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    invoke-virtual {v4, v2, v5}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    iget-object v2, p0, La/qz9;->d2:La/yzn0;

    .line 448
    .line 449
    sget-object v5, La/qz9;->u2:[La/iiy;

    .line 450
    .line 451
    aget-object v3, v5, v3

    .line 452
    .line 453
    invoke-virtual {v2, p0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    check-cast p0, La/kkd0;

    .line 458
    .line 459
    iget-byte p0, p0, La/kkd0;->a:B

    .line 460
    .line 461
    const/16 v2, 0x64

    .line 462
    .line 463
    const-string v3, "jpegQuality"

    .line 464
    .line 465
    invoke-static {p0, v1, v2, v3}, La/z1x;->v(IIILjava/lang/String;)V

    .line 466
    .line 467
    .line 468
    sget-object v1, La/nzw;->j:La/u15;

    .line 469
    .line 470
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    invoke-virtual {v4, v1, p0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0}, La/gyw;->a()La/mzw;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    return-object p0

    .line 482
    :pswitch_a
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 483
    .line 484
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    new-instance v2, Landroid/util/Size;

    .line 489
    .line 490
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 499
    .line 500
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 509
    .line 510
    invoke-direct {v2, v4, v0}, Landroid/util/Size;-><init>(II)V

    .line 511
    .line 512
    .line 513
    new-instance v0, Landroid/util/Rational;

    .line 514
    .line 515
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    invoke-direct {v0, v4, v2}, Landroid/util/Rational;-><init>(II)V

    .line 524
    .line 525
    .line 526
    iget-object p0, p0, La/qz9;->l2:La/a8z;

    .line 527
    .line 528
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object p0

    .line 532
    check-cast p0, La/oub0;

    .line 533
    .line 534
    invoke-virtual {p0}, La/fot0;->m()I

    .line 535
    .line 536
    .line 537
    move-result p0

    .line 538
    new-instance v2, La/wju0;

    .line 539
    .line 540
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 541
    .line 542
    .line 543
    iput v1, v2, La/wju0;->a:I

    .line 544
    .line 545
    iput-object v0, v2, La/wju0;->b:Landroid/util/Rational;

    .line 546
    .line 547
    iput p0, v2, La/wju0;->c:I

    .line 548
    .line 549
    iput v3, v2, La/wju0;->d:I

    .line 550
    .line 551
    return-object v2

    .line 552
    :pswitch_b
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 553
    .line 554
    new-instance v0, La/gyw;

    .line 555
    .line 556
    const/4 v1, 0x2

    .line 557
    invoke-direct {v0, v1}, La/gyw;-><init>(B)V

    .line 558
    .line 559
    .line 560
    iget-object p0, p0, La/qz9;->j2:La/a8z;

    .line 561
    .line 562
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object p0

    .line 566
    check-cast p0, La/isf0;

    .line 567
    .line 568
    iget-object v0, v0, La/gyw;->b:La/wy40;

    .line 569
    .line 570
    sget-object v1, La/w0x;->s0:La/u15;

    .line 571
    .line 572
    invoke-virtual {v0, v1, p0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    new-instance p0, La/pub0;

    .line 576
    .line 577
    invoke-static {v0}, La/b780;->j(La/drd;)La/b780;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-direct {p0, v0}, La/pub0;-><init>(La/b780;)V

    .line 582
    .line 583
    .line 584
    invoke-static {p0}, La/w0x;->t(La/w0x;)V

    .line 585
    .line 586
    .line 587
    new-instance v0, La/oub0;

    .line 588
    .line 589
    invoke-direct {v0, p0}, La/fot0;-><init>(La/fpt0;)V

    .line 590
    .line 591
    .line 592
    sget-object p0, La/oub0;->z:Ljava/util/concurrent/ScheduledExecutorService;

    .line 593
    .line 594
    iput-object p0, v0, La/oub0;->s:Ljava/util/concurrent/Executor;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_c
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 598
    .line 599
    invoke-virtual {p0}, La/qz9;->U0()V

    .line 600
    .line 601
    .line 602
    invoke-virtual {p0, v3, v3, v3}, La/sik;->z0(ZZZ)V

    .line 603
    .line 604
    .line 605
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 606
    .line 607
    return-object p0

    .line 608
    nop

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
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
