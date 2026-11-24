.class public final synthetic La/zfv0;
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
    iput-byte p3, p0, La/zfv0;->a:B

    iput-object p1, p0, La/zfv0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/zfv0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/zfv0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/16 v2, 0x1b

    .line 6
    .line 7
    const/16 v3, 0x9

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, 0x1c

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object v9, p0, La/zfv0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p0, p0, La/zfv0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast p0, Ljava/util/List;

    .line 23
    .line 24
    check-cast v9, Landroid/util/DisplayMetrics;

    .line 25
    .line 26
    check-cast p1, La/n7w0;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const-string v0, "supportedModes"

    .line 32
    .line 33
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget p0, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "width"

    .line 43
    .line 44
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget p0, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 48
    .line 49
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v0, "height"

    .line 54
    .line 55
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget p0, v9, Landroid/util/DisplayMetrics;->density:F

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v0, "density"

    .line 65
    .line 66
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget p0, v9, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 70
    .line 71
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string v0, "densityDpi"

    .line 76
    .line 77
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget p0, v9, Landroid/util/DisplayMetrics;->xdpi:F

    .line 81
    .line 82
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string v0, "xdpi"

    .line 87
    .line 88
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget p0, v9, Landroid/util/DisplayMetrics;->ydpi:F

    .line 92
    .line 93
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string v0, "ydpi"

    .line 98
    .line 99
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_0
    check-cast p0, La/x7w0;

    .line 106
    .line 107
    check-cast v9, Landroid/content/pm/PackageInfo;

    .line 108
    .line 109
    check-cast p1, La/n7w0;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, La/x7w0;->a:La/us00;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v1, "packageName"

    .line 121
    .line 122
    invoke-virtual {p1, v0, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object p0, p0, La/x7w0;->b:La/ln4;

    .line 126
    .line 127
    iget-object p0, p0, La/ln4;->a:La/us00;

    .line 128
    .line 129
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 130
    .line 131
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 132
    .line 133
    if-lt v0, v5, :cond_0

    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    const/high16 v2, 0x8000000

    .line 144
    .line 145
    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    goto :goto_0

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    move-object p0, v0

    .line 152
    goto :goto_3

    .line 153
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    const/16 v2, 0x40

    .line 162
    .line 163
    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :goto_0
    if-lt v0, v5, :cond_2

    .line 168
    .line 169
    invoke-static {p0}, La/x6;->c(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    if-eqz p0, :cond_1

    .line 174
    .line 175
    invoke-static {p0}, La/x6;->A(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    goto :goto_1

    .line 180
    :cond_1
    move-object p0, v7

    .line 181
    goto :goto_1

    .line 182
    :cond_2
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 183
    .line 184
    :goto_1
    if-eqz p0, :cond_4

    .line 185
    .line 186
    invoke-static {p0}, La/tx3;->B([Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    check-cast p0, Landroid/content/pm/Signature;

    .line 191
    .line 192
    if-nez p0, :cond_3

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_3
    const-string v0, "SHA-256"

    .line 196
    .line 197
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const-string v0, ""

    .line 213
    .line 214
    new-instance v1, La/ejv0;

    .line 215
    .line 216
    const/16 v2, 0x17

    .line 217
    .line 218
    invoke-direct {v1, v2}, La/ejv0;-><init>(B)V

    .line 219
    .line 220
    .line 221
    const/16 v2, 0x1e

    .line 222
    .line 223
    invoke-static {p0, v0, v1, v2}, La/tx3;->L([BLjava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    goto :goto_4

    .line 228
    :cond_4
    :goto_2
    const-string p0, "no_signature"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :goto_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 232
    .line 233
    new-instance v0, La/g0g0;

    .line 234
    .line 235
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    move-object p0, v0

    .line 239
    :goto_4
    nop

    .line 240
    instance-of v0, p0, La/g0g0;

    .line 241
    .line 242
    if-eqz v0, :cond_5

    .line 243
    .line 244
    const-string p0, "error_getting_signature"

    .line 245
    .line 246
    :cond_5
    check-cast p0, Ljava/lang/String;

    .line 247
    .line 248
    :goto_5
    const-string v0, "appSignature"

    .line 249
    .line 250
    invoke-virtual {p1, p0, v0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 254
    .line 255
    if-lt p0, v5, :cond_6

    .line 256
    .line 257
    if-eqz v9, :cond_7

    .line 258
    .line 259
    invoke-static {v9}, Lcom/appsflyer/internal/b0;->a(Landroid/content/pm/PackageInfo;)J

    .line 260
    .line 261
    .line 262
    move-result-wide v0

    .line 263
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    goto :goto_6

    .line 268
    :cond_6
    if-eqz v9, :cond_7

    .line 269
    .line 270
    iget p0, v9, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 271
    .line 272
    int-to-long v0, p0

    .line 273
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    :cond_7
    :goto_6
    const-string p0, "versionCode"

    .line 278
    .line 279
    invoke-virtual {p1, v7, p0}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_1
    check-cast p0, La/pu90;

    .line 286
    .line 287
    check-cast v9, La/c3w0;

    .line 288
    .line 289
    check-cast p1, La/ou90;

    .line 290
    .line 291
    iget v0, v9, La/c3w0;->o:F

    .line 292
    .line 293
    invoke-virtual {p1, p0, v4, v4, v0}, La/ou90;->g(La/pu90;IIF)V

    .line 294
    .line 295
    .line 296
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_2
    check-cast p0, La/rzv0;

    .line 300
    .line 301
    check-cast v9, Ljava/lang/String;

    .line 302
    .line 303
    check-cast p1, Ljava/lang/Throwable;

    .line 304
    .line 305
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    check-cast p1, La/bzv0;

    .line 313
    .line 314
    iget-object p1, p1, La/bzv0;->a:Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {p1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    if-eqz p1, :cond_9

    .line 321
    .line 322
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 323
    .line 324
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 325
    .line 326
    :cond_8
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 334
    .line 335
    move-object v2, v0

    .line 336
    check-cast v2, La/bzv0;

    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    const/4 v8, 0x1

    .line 342
    const/16 v9, 0xf

    .line 343
    .line 344
    const/4 v3, 0x0

    .line 345
    const/4 v4, 0x0

    .line 346
    const/4 v5, 0x0

    .line 347
    const/4 v6, 0x0

    .line 348
    const/4 v7, 0x0

    .line 349
    invoke-static/range {v2 .. v9}, La/bzv0;->a(La/bzv0;Ljava/lang/String;La/h9p;La/qdt;ZLjava/util/List;ZI)La/bzv0;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_8

    .line 358
    .line 359
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object p0

    .line 362
    :pswitch_3
    check-cast p0, La/gdv0;

    .line 363
    .line 364
    check-cast v9, La/uqv0;

    .line 365
    .line 366
    check-cast p1, La/cp;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 372
    .line 373
    check-cast v0, La/azx;

    .line 374
    .line 375
    iget-object v1, v0, La/azx;->b:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 376
    .line 377
    new-instance v2, La/eyv0;

    .line 378
    .line 379
    invoke-direct {v2, p0, p1, v4}, La/eyv0;-><init>(La/gdv0;La/cp;B)V

    .line 380
    .line 381
    .line 382
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 383
    .line 384
    .line 385
    iget-object v1, v0, La/azx;->e:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 386
    .line 387
    new-instance v2, La/eyv0;

    .line 388
    .line 389
    invoke-direct {v2, p0, p1, v8}, La/eyv0;-><init>(La/gdv0;La/cp;B)V

    .line 390
    .line 391
    .line 392
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 393
    .line 394
    .line 395
    iget-object p0, v0, La/azx;->c:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 396
    .line 397
    new-instance v0, La/gcn0;

    .line 398
    .line 399
    const/16 v1, 0x12

    .line 400
    .line 401
    invoke-direct {v0, v9, v1}, La/gcn0;-><init>(Ljava/lang/Object;B)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->setOnItemClickListener(La/xdr;)V

    .line 405
    .line 406
    .line 407
    new-instance p0, La/a8u0;

    .line 408
    .line 409
    invoke-direct {p0, p1, v3}, La/a8u0;-><init>(La/cp;B)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 413
    .line 414
    .line 415
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 416
    .line 417
    return-object p0

    .line 418
    :pswitch_4
    check-cast p0, La/mwv0;

    .line 419
    .line 420
    check-cast v9, La/ywv0;

    .line 421
    .line 422
    check-cast p1, La/lwk;

    .line 423
    .line 424
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    iget-object p1, p0, La/mwv0;->a:La/pz40;

    .line 431
    .line 432
    check-cast p1, La/hgk0;

    .line 433
    .line 434
    invoke-virtual {p1, v9}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    new-instance p1, La/ty2;

    .line 438
    .line 439
    invoke-direct {p1, p0, v5}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 440
    .line 441
    .line 442
    return-object p1

    .line 443
    :pswitch_5
    check-cast p0, La/l7m0;

    .line 444
    .line 445
    check-cast v9, La/tsv0;

    .line 446
    .line 447
    check-cast p1, La/uag0;

    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    check-cast p0, La/osv0;

    .line 457
    .line 458
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_d

    .line 466
    .line 467
    if-eq v0, v8, :cond_c

    .line 468
    .line 469
    if-eq v0, v6, :cond_b

    .line 470
    .line 471
    const/4 v1, 0x3

    .line 472
    if-ne v0, v1, :cond_a

    .line 473
    .line 474
    iget p0, p0, La/osv0;->d:F

    .line 475
    .line 476
    goto :goto_7

    .line 477
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 478
    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_b
    iget p0, p0, La/osv0;->c:F

    .line 482
    .line 483
    goto :goto_7

    .line 484
    :cond_c
    iget p0, p0, La/osv0;->b:F

    .line 485
    .line 486
    goto :goto_7

    .line 487
    :cond_d
    iget p0, p0, La/osv0;->a:F

    .line 488
    .line 489
    :goto_7
    invoke-virtual {p1, p0}, La/uag0;->I(F)V

    .line 490
    .line 491
    .line 492
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    :goto_8
    return-object v7

    .line 495
    :pswitch_6
    check-cast p0, La/hsv0;

    .line 496
    .line 497
    check-cast v9, La/u950;

    .line 498
    .line 499
    check-cast p1, La/lwk;

    .line 500
    .line 501
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    iget-object p1, p0, La/hsv0;->d:Ljava/util/ArrayList;

    .line 505
    .line 506
    iget-object v0, p0, La/hsv0;->b:La/jvv0;

    .line 507
    .line 508
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    :cond_e
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    if-eqz v3, :cond_f

    .line 517
    .line 518
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    check-cast v3, La/lwv0;

    .line 523
    .line 524
    invoke-virtual {v9, v3}, La/u950;->contains(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    if-nez v4, :cond_e

    .line 529
    .line 530
    iget-object v4, v9, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 531
    .line 532
    invoke-virtual {v4, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_9

    .line 536
    :cond_f
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 537
    .line 538
    .line 539
    iput-object v9, p0, La/hsv0;->c:La/u950;

    .line 540
    .line 541
    iget-object v1, p0, La/hsv0;->f:La/gsv0;

    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    iput-object v1, v0, La/jvv0;->b:La/gsv0;

    .line 547
    .line 548
    iget-object v0, v0, La/jvv0;->a:La/p7m0;

    .line 549
    .line 550
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    check-cast v0, La/gvv0;

    .line 555
    .line 556
    iget-object v0, v0, La/gvv0;->a:Ljava/util/Map;

    .line 557
    .line 558
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_12

    .line 563
    .line 564
    iget-object v0, v9, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 565
    .line 566
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    if-le v0, v8, :cond_12

    .line 571
    .line 572
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 577
    .line 578
    .line 579
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 580
    .line 581
    .line 582
    move-result-object p1

    .line 583
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-eqz v0, :cond_10

    .line 588
    .line 589
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    check-cast v0, La/lwv0;

    .line 594
    .line 595
    invoke-virtual {p0, v0}, La/hsv0;->b(La/rb50;)V

    .line 596
    .line 597
    .line 598
    goto :goto_a

    .line 599
    :cond_10
    iget-object p1, p0, La/hsv0;->c:La/u950;

    .line 600
    .line 601
    if-nez p1, :cond_11

    .line 602
    .line 603
    goto :goto_c

    .line 604
    :cond_11
    :goto_b
    iget-object v0, p1, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 605
    .line 606
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-le v0, v8, :cond_12

    .line 611
    .line 612
    invoke-static {p1}, La/q3d;->i(Ljava/util/List;)I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    invoke-virtual {p1, v0}, La/u950;->remove(I)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    check-cast v0, La/rb50;

    .line 621
    .line 622
    invoke-virtual {p0, v0}, La/hsv0;->b(La/rb50;)V

    .line 623
    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_12
    :goto_c
    new-instance p1, La/ty2;

    .line 627
    .line 628
    invoke-direct {p1, p0, v2}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 629
    .line 630
    .line 631
    return-object p1

    .line 632
    :pswitch_7
    check-cast p0, La/yqv0;

    .line 633
    .line 634
    check-cast v9, La/ugd;

    .line 635
    .line 636
    check-cast p1, La/skd;

    .line 637
    .line 638
    iget-boolean v0, p0, La/yqv0;->c:Z

    .line 639
    .line 640
    if-nez v0, :cond_15

    .line 641
    .line 642
    invoke-virtual {p1}, La/skd;->d()La/clz;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    iget-object v2, p1, La/skd;->a:Landroid/view/View;

    .line 647
    .line 648
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    iput-object v9, p0, La/yqv0;->e:La/ugd;

    .line 653
    .line 654
    iget-object v3, p0, La/yqv0;->d:La/glz;

    .line 655
    .line 656
    if-nez v3, :cond_14

    .line 657
    .line 658
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 659
    .line 660
    .line 661
    move-result-object p1

    .line 662
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result p1

    .line 674
    if-nez p1, :cond_13

    .line 675
    .line 676
    new-instance p1, La/qaq0;

    .line 677
    .line 678
    const/16 v1, 0x15

    .line 679
    .line 680
    invoke-direct {p1, p0, v0, v1}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 684
    .line 685
    .line 686
    goto :goto_d

    .line 687
    :cond_13
    iput-object v0, p0, La/yqv0;->d:La/glz;

    .line 688
    .line 689
    invoke-virtual {v0, p0}, La/glz;->a(La/blz;)V

    .line 690
    .line 691
    .line 692
    goto :goto_d

    .line 693
    :cond_14
    iget-object v0, v0, La/glz;->i:La/lkz;

    .line 694
    .line 695
    sget-object v2, La/lkz;->c:La/lkz;

    .line 696
    .line 697
    invoke-virtual {v0, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-ltz v0, :cond_15

    .line 702
    .line 703
    iget-object v0, p0, La/yqv0;->b:La/tld;

    .line 704
    .line 705
    new-instance v2, La/gdr0;

    .line 706
    .line 707
    invoke-direct {v2, p0, p1, v9, v1}, La/gdr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 708
    .line 709
    .line 710
    new-instance p0, La/ugd;

    .line 711
    .line 712
    const p1, -0x66c1ecc8

    .line 713
    .line 714
    .line 715
    invoke-direct {p0, p1, v8, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0, p0}, La/tld;->d(Lkotlin/jvm/functions/Function2;)V

    .line 719
    .line 720
    .line 721
    :cond_15
    :goto_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 722
    .line 723
    return-object p0

    .line 724
    :pswitch_8
    check-cast p0, La/zpv0;

    .line 725
    .line 726
    check-cast v9, La/ypv0;

    .line 727
    .line 728
    check-cast p1, La/qpg0;

    .line 729
    .line 730
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    iget-object p0, p0, La/zpv0;->b:La/f7k;

    .line 734
    .line 735
    invoke-virtual {p0, p1, v9}, La/f7k;->U(La/qpg0;Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 739
    .line 740
    return-object p0

    .line 741
    :pswitch_9
    check-cast p0, La/upv0;

    .line 742
    .line 743
    check-cast v9, La/ppv0;

    .line 744
    .line 745
    check-cast p1, La/qpg0;

    .line 746
    .line 747
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    iget-object p0, p0, La/upv0;->b:La/f7k;

    .line 751
    .line 752
    invoke-virtual {p0, p1, v9}, La/f7k;->U(La/qpg0;Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 756
    .line 757
    return-object p0

    .line 758
    :pswitch_a
    check-cast p0, La/maj;

    .line 759
    .line 760
    check-cast v9, Ljava/lang/String;

    .line 761
    .line 762
    check-cast p1, La/qpg0;

    .line 763
    .line 764
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    const-string v0, "UPDATE workspec SET output=? WHERE id=?"

    .line 768
    .line 769
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 770
    .line 771
    .line 772
    move-result-object p1

    .line 773
    :try_start_1
    sget-object v0, La/maj;->b:La/maj;

    .line 774
    .line 775
    invoke-static {p0}, La/nkb;->I(La/maj;)[B

    .line 776
    .line 777
    .line 778
    move-result-object p0

    .line 779
    invoke-interface {p1, p0, v8}, La/xpg0;->i([BI)V

    .line 780
    .line 781
    .line 782
    invoke-interface {p1, v6, v9}, La/xpg0;->z(ILjava/lang/String;)V

    .line 783
    .line 784
    .line 785
    invoke-interface {p1}, La/xpg0;->W0()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 786
    .line 787
    .line 788
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 789
    .line 790
    .line 791
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 792
    .line 793
    return-object p0

    .line 794
    :catchall_1
    move-exception v0

    .line 795
    move-object p0, v0

    .line 796
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 797
    .line 798
    .line 799
    throw p0

    .line 800
    :pswitch_b
    check-cast p0, La/zov0;

    .line 801
    .line 802
    check-cast v9, Ljava/lang/String;

    .line 803
    .line 804
    check-cast p1, La/qpg0;

    .line 805
    .line 806
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    const-string v0, "UPDATE workspec SET state=? WHERE id=?"

    .line 810
    .line 811
    invoke-interface {p1, v0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    :try_start_2
    invoke-static {p0}, La/dqm0;->z(La/zov0;)I

    .line 816
    .line 817
    .line 818
    move-result p0

    .line 819
    int-to-long v2, p0

    .line 820
    invoke-interface {v1, v8, v2, v3}, La/xpg0;->o(IJ)V

    .line 821
    .line 822
    .line 823
    invoke-interface {v1, v6, v9}, La/xpg0;->z(ILjava/lang/String;)V

    .line 824
    .line 825
    .line 826
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 827
    .line 828
    .line 829
    invoke-static {p1}, La/s0x;->R(La/qpg0;)I

    .line 830
    .line 831
    .line 832
    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 833
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 834
    .line 835
    .line 836
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 837
    .line 838
    .line 839
    move-result-object p0

    .line 840
    return-object p0

    .line 841
    :catchall_2
    move-exception v0

    .line 842
    move-object p0, v0

    .line 843
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 844
    .line 845
    .line 846
    throw p0

    .line 847
    :pswitch_c
    check-cast p0, La/hpv0;

    .line 848
    .line 849
    check-cast v9, La/gpv0;

    .line 850
    .line 851
    check-cast p1, La/qpg0;

    .line 852
    .line 853
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    iget-object p0, p0, La/hpv0;->b:La/f7k;

    .line 857
    .line 858
    invoke-virtual {p0, p1, v9}, La/f7k;->U(La/qpg0;Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object p0

    .line 864
    :pswitch_d
    check-cast p0, La/qnv0;

    .line 865
    .line 866
    check-cast v9, La/cnv0;

    .line 867
    .line 868
    check-cast p1, La/k0w0;

    .line 869
    .line 870
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    iget-object v0, p0, La/qnv0;->u:La/rl70;

    .line 874
    .line 875
    check-cast v9, La/anv0;

    .line 876
    .line 877
    iget-object v1, v9, La/anv0;->a:Ljava/lang/String;

    .line 878
    .line 879
    iget-wide v2, p0, La/qnv0;->t:J

    .line 880
    .line 881
    iget-object p0, p0, La/qnv0;->s:Ljava/lang/String;

    .line 882
    .line 883
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    invoke-static {v2, v3, v1, p0}, La/rl70;->d(JLjava/lang/String;Ljava/lang/String;)Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 887
    .line 888
    .line 889
    move-result-object p0

    .line 890
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 891
    .line 892
    .line 893
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 894
    .line 895
    return-object p0

    .line 896
    :pswitch_e
    check-cast p0, La/zlv0;

    .line 897
    .line 898
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 899
    .line 900
    check-cast p1, La/hcz;

    .line 901
    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    move-object v0, p0

    .line 906
    check-cast v0, La/wlv0;

    .line 907
    .line 908
    iget-object v0, v0, La/wlv0;->e:La/a4x;

    .line 909
    .line 910
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    new-instance v2, La/e0m0;

    .line 915
    .line 916
    invoke-direct {v2, v0, v3}, La/e0m0;-><init>(La/a4x;B)V

    .line 917
    .line 918
    .line 919
    new-instance v3, La/zip0;

    .line 920
    .line 921
    const/4 v4, 0x7

    .line 922
    invoke-direct {v3, v0, p0, v9, v4}, La/zip0;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 923
    .line 924
    .line 925
    new-instance p0, La/ugd;

    .line 926
    .line 927
    const v0, 0x799532c4

    .line 928
    .line 929
    .line 930
    invoke-direct {p0, v0, v8, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {p1, v1, v7, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 934
    .line 935
    .line 936
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 937
    .line 938
    return-object p0

    .line 939
    :pswitch_f
    move-object v1, p0

    .line 940
    check-cast v1, La/w03;

    .line 941
    .line 942
    check-cast v9, La/jkv0;

    .line 943
    .line 944
    move-object v0, p1

    .line 945
    check-cast v0, La/fhl;

    .line 946
    .line 947
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 951
    .line 952
    .line 953
    move-result p0

    .line 954
    if-eqz p0, :cond_18

    .line 955
    .line 956
    if-eq p0, v8, :cond_17

    .line 957
    .line 958
    if-ne p0, v6, :cond_16

    .line 959
    .line 960
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 961
    .line 962
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 963
    .line 964
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getYellow-0d7_KjU()J

    .line 965
    .line 966
    .line 967
    move-result-wide p0

    .line 968
    :goto_e
    move-wide v2, p0

    .line 969
    goto :goto_f

    .line 970
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 971
    .line 972
    .line 973
    goto :goto_10

    .line 974
    :cond_17
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 975
    .line 976
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 977
    .line 978
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getRed-0d7_KjU()J

    .line 979
    .line 980
    .line 981
    move-result-wide p0

    .line 982
    goto :goto_e

    .line 983
    :cond_18
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 984
    .line 985
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 986
    .line 987
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    .line 988
    .line 989
    .line 990
    move-result-wide p0

    .line 991
    goto :goto_e

    .line 992
    :goto_f
    sget-object v5, La/l0q;->a:La/l0q;

    .line 993
    .line 994
    const/16 v6, 0x34

    .line 995
    .line 996
    const/4 v4, 0x0

    .line 997
    invoke-static/range {v0 .. v6}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 998
    .line 999
    .line 1000
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1001
    .line 1002
    :goto_10
    return-object v7

    .line 1003
    :pswitch_10
    move-object v1, p0

    .line 1004
    check-cast v1, La/w03;

    .line 1005
    .line 1006
    check-cast v9, La/ikv0;

    .line 1007
    .line 1008
    move-object v0, p1

    .line 1009
    check-cast v0, La/fhl;

    .line 1010
    .line 1011
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 1015
    .line 1016
    .line 1017
    move-result p0

    .line 1018
    if-eqz p0, :cond_1b

    .line 1019
    .line 1020
    if-eq p0, v8, :cond_1a

    .line 1021
    .line 1022
    if-ne p0, v6, :cond_19

    .line 1023
    .line 1024
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 1025
    .line 1026
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1027
    .line 1028
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getYellow-0d7_KjU()J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide p0

    .line 1032
    :goto_11
    move-wide v2, p0

    .line 1033
    goto :goto_12

    .line 1034
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 1035
    .line 1036
    .line 1037
    goto :goto_13

    .line 1038
    :cond_1a
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 1039
    .line 1040
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1041
    .line 1042
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getRed-0d7_KjU()J

    .line 1043
    .line 1044
    .line 1045
    move-result-wide p0

    .line 1046
    goto :goto_11

    .line 1047
    :cond_1b
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 1048
    .line 1049
    sget-object p0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1050
    .line 1051
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide p0

    .line 1055
    goto :goto_11

    .line 1056
    :goto_12
    sget-object v5, La/l0q;->a:La/l0q;

    .line 1057
    .line 1058
    const/16 v6, 0x34

    .line 1059
    .line 1060
    const/4 v4, 0x0

    .line 1061
    invoke-static/range {v0 .. v6}, La/fhl;->C0(La/fhl;La/w03;JFLa/agc;I)V

    .line 1062
    .line 1063
    .line 1064
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1065
    .line 1066
    :goto_13
    return-object v7

    .line 1067
    :pswitch_11
    check-cast p0, La/djv0;

    .line 1068
    .line 1069
    check-cast v9, Landroid/view/View;

    .line 1070
    .line 1071
    check-cast p1, La/lwk;

    .line 1072
    .line 1073
    invoke-virtual {p0, v9}, La/djv0;->a(Landroid/view/View;)V

    .line 1074
    .line 1075
    .line 1076
    new-instance p1, La/pr0;

    .line 1077
    .line 1078
    invoke-direct {p1, p0, v9, v5}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1079
    .line 1080
    .line 1081
    return-object p1

    .line 1082
    :pswitch_12
    check-cast p0, La/vft;

    .line 1083
    .line 1084
    check-cast v9, La/cp;

    .line 1085
    .line 1086
    check-cast p1, Landroid/view/View;

    .line 1087
    .line 1088
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object p1

    .line 1095
    check-cast p1, La/pgv0;

    .line 1096
    .line 1097
    iget-object p1, p1, La/pgv0;->e:Ljava/lang/String;

    .line 1098
    .line 1099
    invoke-virtual {p0, p1}, La/vft;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1103
    .line 1104
    return-object p0

    .line 1105
    :pswitch_13
    check-cast p0, Landroid/app/Activity;

    .line 1106
    .line 1107
    check-cast v9, Ljava/lang/Integer;

    .line 1108
    .line 1109
    check-cast p1, La/lwk;

    .line 1110
    .line 1111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    if-eqz p0, :cond_1c

    .line 1115
    .line 1116
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1117
    .line 1118
    .line 1119
    move-result-object p1

    .line 1120
    if-eqz p1, :cond_1c

    .line 1121
    .line 1122
    invoke-virtual {p1, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 1123
    .line 1124
    .line 1125
    :cond_1c
    new-instance p1, La/pr0;

    .line 1126
    .line 1127
    invoke-direct {p1, p0, v9, v2}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1128
    .line 1129
    .line 1130
    return-object p1

    .line 1131
    :pswitch_data_0
    .packed-switch 0x0
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
