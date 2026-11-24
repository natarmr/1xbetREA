.class public final synthetic La/bdv;
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
    iput-byte p2, p0, La/bdv;->a:B

    iput-object p1, p0, La/bdv;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/bdv;->a:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x2

    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    const-string v7, "viewModelFactory"

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    iget-object p0, p0, La/bdv;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, La/f7u;

    .line 18
    .line 19
    const-class v0, Landroid/app/ActivityManager;

    .line 20
    .line 21
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/content/Context;

    .line 24
    .line 25
    const-wide v1, 0x3fc999999999999aL    # 0.2

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    check-cast v7, Landroid/app/ActivityManager;

    .line 38
    .line 39
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 40
    .line 41
    .line 42
    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    const-wide v1, 0x3fc3333333333333L    # 0.15

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    :catch_0
    :cond_0
    const-wide/16 v9, 0x0

    .line 51
    .line 52
    cmpg-double v7, v9, v1

    .line 53
    .line 54
    if-gtz v7, :cond_3

    .line 55
    .line 56
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 57
    .line 58
    cmpg-double v7, v1, v9

    .line 59
    .line 60
    if-gtz v7, :cond_3

    .line 61
    .line 62
    new-instance v7, La/y78;

    .line 63
    .line 64
    const/16 v9, 0xf

    .line 65
    .line 66
    invoke-direct {v7, v9}, La/y78;-><init>(B)V

    .line 67
    .line 68
    .line 69
    :try_start_1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    check-cast v0, Landroid/app/ActivityManager;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 83
    .line 84
    const/high16 v9, 0x100000

    .line 85
    .line 86
    and-int/2addr p0, v9

    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getLargeMemoryClass()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 95
    .line 96
    .line 97
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 98
    goto :goto_0

    .line 99
    :catch_1
    const/16 p0, 0x100

    .line 100
    .line 101
    :goto_0
    int-to-long v9, p0

    .line 102
    const-wide/32 v11, 0x100000

    .line 103
    .line 104
    .line 105
    mul-long/2addr v9, v11

    .line 106
    long-to-double v9, v9

    .line 107
    mul-double/2addr v1, v9

    .line 108
    double-to-long v0, v1

    .line 109
    new-instance p0, La/r34;

    .line 110
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-wide v0, p0, La/r34;->a:J

    .line 115
    .line 116
    iput-object v7, p0, La/r34;->b:Ljava/lang/Object;

    .line 117
    .line 118
    new-instance v2, La/dr8;

    .line 119
    .line 120
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object p0, v2, La/dr8;->d:Ljava/lang/Object;

    .line 124
    .line 125
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 126
    .line 127
    const/high16 v10, 0x3f400000    # 0.75f

    .line 128
    .line 129
    invoke-direct {v9, v5, v10, v6}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 130
    .line 131
    .line 132
    iput-object v9, v2, La/dr8;->c:Ljava/lang/Object;

    .line 133
    .line 134
    iput-wide v0, v2, La/dr8;->a:J

    .line 135
    .line 136
    cmp-long v0, v0, v3

    .line 137
    .line 138
    if-lez v0, :cond_2

    .line 139
    .line 140
    iput-object v2, p0, La/r34;->c:Ljava/lang/Object;

    .line 141
    .line 142
    new-instance v8, La/jbe0;

    .line 143
    .line 144
    invoke-direct {v8, p0, v7}, La/jbe0;-><init>(La/r34;La/y78;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_2
    const-string p0, "maxSize <= 0"

    .line 149
    .line 150
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v8

    .line 154
    :cond_3
    const-string p0, "percent must be in the range [0.0, 1.0]."

    .line 155
    .line 156
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    return-object v8

    .line 160
    :pswitch_0
    check-cast p0, La/c0x;

    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_1
    check-cast p0, Lorg/xplatform/services/mobile_services/impl/presentation/services/HuaweiMessagingService;

    .line 169
    .line 170
    invoke-static {p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/HuaweiMessagingService;->c(Lorg/xplatform/services/mobile_services/impl/presentation/services/HuaweiMessagingService;)La/ztw;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_2
    check-cast p0, Lokhttp3/internal/http2/Http2Connection;

    .line 176
    .line 177
    sget-object v0, Lokhttp3/internal/http2/Http2Connection;->A:Lokhttp3/internal/http2/Settings;

    .line 178
    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    :try_start_2
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 183
    .line 184
    invoke-virtual {v0, v2, v5, v5}, Lokhttp3/internal/http2/Http2Writer;->l(IIZ)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catch_2
    move-exception v0

    .line 189
    sget-object v1, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 190
    .line 191
    invoke-virtual {p0, v1, v1, v0}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 192
    .line 193
    .line 194
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_3
    check-cast p0, La/zpu;

    .line 198
    .line 199
    iget-object p0, p0, La/zpu;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p0, La/gii0;

    .line 202
    .line 203
    const-class v0, La/orw;

    .line 204
    .line 205
    sget-object v1, La/sre0;->a:La/tre0;

    .line 206
    .line 207
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    check-cast p0, La/orw;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_4
    check-cast p0, La/arw;

    .line 219
    .line 220
    sget-object v0, La/arw;->Q1:La/sqt;

    .line 221
    .line 222
    iget-object p0, p0, La/arw;->N1:La/fiu0;

    .line 223
    .line 224
    if-eqz p0, :cond_4

    .line 225
    .line 226
    return-object p0

    .line 227
    :cond_4
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v8

    .line 231
    :pswitch_5
    check-cast p0, La/cqw;

    .line 232
    .line 233
    sget-object v0, La/cqw;->S1:La/rqt;

    .line 234
    .line 235
    iget-object p0, p0, La/cqw;->P1:La/fiu0;

    .line 236
    .line 237
    if-eqz p0, :cond_5

    .line 238
    .line 239
    return-object p0

    .line 240
    :cond_5
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw v8

    .line 244
    :pswitch_6
    check-cast p0, La/lbu;

    .line 245
    .line 246
    iget-object p0, p0, La/lbu;->b:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p0, La/gii0;

    .line 249
    .line 250
    const-class v0, La/hpw;

    .line 251
    .line 252
    sget-object v1, La/sre0;->a:La/tre0;

    .line 253
    .line 254
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    check-cast p0, La/hpw;

    .line 263
    .line 264
    return-object p0

    .line 265
    :pswitch_7
    check-cast p0, La/ieu;

    .line 266
    .line 267
    iget-object p0, p0, La/ieu;->b:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p0, La/gii0;

    .line 270
    .line 271
    const-class v0, La/ynw;

    .line 272
    .line 273
    sget-object v1, La/sre0;->a:La/tre0;

    .line 274
    .line 275
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    check-cast p0, La/ynw;

    .line 284
    .line 285
    return-object p0

    .line 286
    :pswitch_8
    check-cast p0, La/fow;

    .line 287
    .line 288
    sget-object v0, La/fow;->P1:La/art;

    .line 289
    .line 290
    iget-object p0, p0, La/fow;->M1:La/fiu0;

    .line 291
    .line 292
    if-eqz p0, :cond_6

    .line 293
    .line 294
    return-object p0

    .line 295
    :cond_6
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v8

    .line 299
    :pswitch_9
    check-cast p0, La/edu;

    .line 300
    .line 301
    iget-object p0, p0, La/edu;->c:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p0, La/gii0;

    .line 304
    .line 305
    const-class v0, La/smw;

    .line 306
    .line 307
    sget-object v1, La/sre0;->a:La/tre0;

    .line 308
    .line 309
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    check-cast p0, La/smw;

    .line 318
    .line 319
    return-object p0

    .line 320
    :pswitch_a
    check-cast p0, La/vmw;

    .line 321
    .line 322
    sget-object v0, La/vmw;->Q1:La/tqt;

    .line 323
    .line 324
    iget-object p0, p0, La/vmw;->N1:La/fiu0;

    .line 325
    .line 326
    if-eqz p0, :cond_7

    .line 327
    .line 328
    return-object p0

    .line 329
    :cond_7
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw v8

    .line 333
    :pswitch_b
    check-cast p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/HorizontalPromoStoreCollectionItem;

    .line 334
    .line 335
    new-instance v0, La/yoe;

    .line 336
    .line 337
    iget-object p0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/HorizontalPromoStoreCollectionItem;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 338
    .line 339
    invoke-direct {v0, p0, v8}, La/yoe;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 340
    .line 341
    .line 342
    return-object v0

    .line 343
    :pswitch_c
    check-cast p0, La/zpu;

    .line 344
    .line 345
    iget-object p0, p0, La/zpu;->b:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast p0, La/gii0;

    .line 348
    .line 349
    const-class v0, La/hiw;

    .line 350
    .line 351
    sget-object v1, La/sre0;->a:La/tre0;

    .line 352
    .line 353
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    check-cast p0, La/hiw;

    .line 362
    .line 363
    return-object p0

    .line 364
    :pswitch_d
    check-cast p0, La/r7w;

    .line 365
    .line 366
    sget-object v0, La/r7w;->q2:La/bst;

    .line 367
    .line 368
    iget-object p0, p0, La/r7w;->k2:La/fiu0;

    .line 369
    .line 370
    if-eqz p0, :cond_8

    .line 371
    .line 372
    return-object p0

    .line 373
    :cond_8
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v8

    .line 377
    :pswitch_e
    check-cast p0, La/r2w;

    .line 378
    .line 379
    iget-object p0, p0, La/r2w;->v:La/pru;

    .line 380
    .line 381
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    return-object p0

    .line 386
    :pswitch_f
    check-cast p0, La/vzv;

    .line 387
    .line 388
    sget-object v0, La/vzv;->p2:La/sqt;

    .line 389
    .line 390
    iget-object p0, p0, La/vzv;->k2:La/fiu0;

    .line 391
    .line 392
    if-eqz p0, :cond_9

    .line 393
    .line 394
    return-object p0

    .line 395
    :cond_9
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v8

    .line 399
    :pswitch_10
    check-cast p0, La/dxv;

    .line 400
    .line 401
    iget-object v0, p0, La/dxv;->g2:La/vlq0;

    .line 402
    .line 403
    if-eqz v0, :cond_a

    .line 404
    .line 405
    iget-object v1, p0, La/dxv;->f2:La/phf0;

    .line 406
    .line 407
    sget-object v2, La/dxv;->k2:[La/iiy;

    .line 408
    .line 409
    aget-object v2, v2, v6

    .line 410
    .line 411
    invoke-virtual {v1, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    new-instance v2, Lkotlin/Pair;

    .line 416
    .line 417
    const-string v3, "RESULT_TYPE"

    .line 418
    .line 419
    invoke-direct {v2, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-static {v0, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 434
    .line 435
    .line 436
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 437
    .line 438
    return-object p0

    .line 439
    :pswitch_11
    check-cast p0, La/rwv;

    .line 440
    .line 441
    iget-object p0, p0, La/rwv;->L1:La/fiu0;

    .line 442
    .line 443
    if-eqz p0, :cond_b

    .line 444
    .line 445
    return-object p0

    .line 446
    :cond_b
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v8

    .line 450
    :pswitch_12
    check-cast p0, La/nuv;

    .line 451
    .line 452
    iget-object p0, p0, La/nuv;->e:La/i4;

    .line 453
    .line 454
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 455
    .line 456
    .line 457
    move-result p0

    .line 458
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    return-object p0

    .line 463
    :pswitch_13
    check-cast p0, La/abu;

    .line 464
    .line 465
    iget-object p0, p0, La/abu;->b:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast p0, La/gii0;

    .line 468
    .line 469
    const-class v0, La/utv;

    .line 470
    .line 471
    sget-object v1, La/sre0;->a:La/tre0;

    .line 472
    .line 473
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    check-cast p0, La/utv;

    .line 482
    .line 483
    return-object p0

    .line 484
    :pswitch_14
    check-cast p0, La/xtv;

    .line 485
    .line 486
    sget-object v0, La/xtv;->P1:La/art;

    .line 487
    .line 488
    iget-object p0, p0, La/xtv;->M1:La/fiu0;

    .line 489
    .line 490
    if-eqz p0, :cond_c

    .line 491
    .line 492
    return-object p0

    .line 493
    :cond_c
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    throw v8

    .line 497
    :pswitch_15
    check-cast p0, La/ntv;

    .line 498
    .line 499
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 504
    .line 505
    .line 506
    move-result p0

    .line 507
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 508
    .line 509
    invoke-static {v0, p0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 510
    .line 511
    .line 512
    move-result-object p0

    .line 513
    return-object p0

    .line 514
    :pswitch_16
    check-cast p0, La/u8u;

    .line 515
    .line 516
    iget-object p0, p0, La/u8u;->c:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast p0, La/gii0;

    .line 519
    .line 520
    const-class v0, La/pnv;

    .line 521
    .line 522
    sget-object v1, La/sre0;->a:La/tre0;

    .line 523
    .line 524
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object p0

    .line 532
    check-cast p0, La/pnv;

    .line 533
    .line 534
    return-object p0

    .line 535
    :pswitch_17
    check-cast p0, La/yjv;

    .line 536
    .line 537
    iget-object v0, p0, La/yjv;->j:La/v88;

    .line 538
    .line 539
    iget-object p0, p0, La/yjv;->l:La/i1w0;

    .line 540
    .line 541
    invoke-static {v0, p0, v3, v4, v1}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 542
    .line 543
    .line 544
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 545
    .line 546
    return-object p0

    .line 547
    :pswitch_18
    check-cast p0, La/giv;

    .line 548
    .line 549
    invoke-virtual {p0}, La/giv;->a()La/lhp;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 554
    .line 555
    .line 556
    move-result p0

    .line 557
    if-eqz p0, :cond_11

    .line 558
    .line 559
    if-eq p0, v6, :cond_10

    .line 560
    .line 561
    if-eq p0, v2, :cond_f

    .line 562
    .line 563
    const/4 v0, 0x3

    .line 564
    if-eq p0, v0, :cond_e

    .line 565
    .line 566
    if-ne p0, v1, :cond_d

    .line 567
    .line 568
    goto :goto_3

    .line 569
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 570
    .line 571
    .line 572
    goto :goto_4

    .line 573
    :cond_e
    move v1, v0

    .line 574
    goto :goto_3

    .line 575
    :cond_f
    move v1, v2

    .line 576
    goto :goto_3

    .line 577
    :cond_10
    move v1, v6

    .line 578
    goto :goto_3

    .line 579
    :cond_11
    move v1, v5

    .line 580
    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    :goto_4
    return-object v8

    .line 585
    :pswitch_19
    check-cast p0, La/whv;

    .line 586
    .line 587
    iget-object p0, p0, La/whv;->d:Ljava/lang/String;

    .line 588
    .line 589
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-nez v0, :cond_12

    .line 594
    .line 595
    goto :goto_5

    .line 596
    :cond_12
    move-object v8, p0

    .line 597
    :goto_5
    sget-object p0, La/iun;->a:La/iun;

    .line 598
    .line 599
    new-instance v0, La/zhv;

    .line 600
    .line 601
    invoke-direct {v0, v8, p0}, La/zhv;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 602
    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_1a
    check-cast p0, La/igv;

    .line 606
    .line 607
    sget-object v0, La/igv;->e2:La/bst;

    .line 608
    .line 609
    iget-object p0, p0, La/igv;->b2:La/fiu0;

    .line 610
    .line 611
    if-eqz p0, :cond_13

    .line 612
    .line 613
    return-object p0

    .line 614
    :cond_13
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    throw v8

    .line 618
    :pswitch_1b
    check-cast p0, La/jgv;

    .line 619
    .line 620
    sget-object v0, La/jgv;->h2:La/gst;

    .line 621
    .line 622
    iget-object p0, p0, La/jgv;->e2:La/fiu0;

    .line 623
    .line 624
    if-eqz p0, :cond_14

    .line 625
    .line 626
    return-object p0

    .line 627
    :cond_14
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    throw v8

    .line 631
    :pswitch_1c
    check-cast p0, La/ddv;

    .line 632
    .line 633
    sget-object v0, La/ddv;->Q1:La/art;

    .line 634
    .line 635
    iget-object p0, p0, La/ddv;->L1:La/fiu0;

    .line 636
    .line 637
    if-eqz p0, :cond_15

    .line 638
    .line 639
    return-object p0

    .line 640
    :cond_15
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw v8

    .line 644
    nop

    .line 645
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
