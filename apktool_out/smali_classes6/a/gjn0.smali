.class public final synthetic La/gjn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jjn0;


# direct methods
.method public synthetic constructor <init>(La/jjn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gjn0;->a:B

    iput-object p1, p0, La/gjn0;->b:La/jjn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/gjn0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/gjn0;->b:La/jjn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/yjn0;

    .line 9
    .line 10
    sget-object v0, La/jjn0;->S1:La/g9m0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/jjn0;->H0()La/mkn0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, v0, La/mkn0;->b:La/i1w0;

    .line 20
    .line 21
    iget-object v2, p0, La/jjn0;->L1:La/khf0;

    .line 22
    .line 23
    sget-object v3, La/jjn0;->U1:[La/iiy;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    aget-object v3, v3, v4

    .line 27
    .line 28
    invoke-virtual {v2, p0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;

    .line 33
    .line 34
    iget-boolean p0, p0, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;->a:Z

    .line 35
    .line 36
    iget-object v2, v0, La/mkn0;->q:La/e41;

    .line 37
    .line 38
    iget-object v3, v0, La/mkn0;->h:La/s31;

    .line 39
    .line 40
    sget-object v5, La/cln0;->b:La/s2m0;

    .line 41
    .line 42
    iget p1, p1, La/yjn0;->a:I

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/4 v5, 0x4

    .line 48
    const/4 v6, 0x3

    .line 49
    const/4 v7, 0x2

    .line 50
    const/4 v8, 0x1

    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    if-eq p1, v8, :cond_3

    .line 54
    .line 55
    if-eq p1, v7, :cond_2

    .line 56
    .line 57
    if-eq p1, v6, :cond_1

    .line 58
    .line 59
    if-eq p1, v5, :cond_0

    .line 60
    .line 61
    sget-object p1, La/cln0;->h:La/cln0;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sget-object p1, La/cln0;->g:La/cln0;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    sget-object p1, La/cln0;->f:La/cln0;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    sget-object p1, La/cln0;->e:La/cln0;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    sget-object p1, La/cln0;->d:La/cln0;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    sget-object p1, La/cln0;->c:La/cln0;

    .line 77
    .line 78
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    const-string v9, "support"

    .line 83
    .line 84
    if-eqz p1, :cond_a

    .line 85
    .line 86
    if-eq p1, v8, :cond_9

    .line 87
    .line 88
    if-eq p1, v7, :cond_8

    .line 89
    .line 90
    const-string v7, "screen"

    .line 91
    .line 92
    const-string v8, "point"

    .line 93
    .line 94
    const-string v10, "acc_support_call"

    .line 95
    .line 96
    if-eq p1, v6, :cond_6

    .line 97
    .line 98
    if-eq p1, v5, :cond_5

    .line 99
    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :cond_5
    iget-object p0, v3, La/s31;->a:La/kt2;

    .line 103
    .line 104
    new-instance p1, Lkotlin/Pair;

    .line 105
    .line 106
    const-string v1, "payment_orders"

    .line 107
    .line 108
    invoke-direct {p1, v8, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v3, La/it2;->b:La/it2;

    .line 112
    .line 113
    new-instance v3, Lkotlin/Pair;

    .line 114
    .line 115
    invoke-direct {v3, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    filled-new-array {p1, v3}, [Lkotlin/Pair;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-interface {p0, v10, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v1, v9}, La/e41;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    iget-object p0, v0, La/mkn0;->z:La/ol60;

    .line 136
    .line 137
    sget-object p1, La/fkn0;->a:La/fkn0;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_4

    .line 143
    .line 144
    :cond_6
    iget-object p1, v3, La/s31;->a:La/kt2;

    .line 145
    .line 146
    new-instance v3, Lkotlin/Pair;

    .line 147
    .line 148
    const-string v5, "contacts"

    .line 149
    .line 150
    invoke-direct {v3, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    sget-object v6, La/it2;->b:La/it2;

    .line 154
    .line 155
    new-instance v6, Lkotlin/Pair;

    .line 156
    .line 157
    invoke-direct {v6, v7, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    filled-new-array {v3, v6}, [Lkotlin/Pair;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-static {v3}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-interface {p1, v10, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v5, v9}, La/e41;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, La/mkn0;->w()La/sff0;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iget-boolean p1, p1, La/sff0;->A0:Z

    .line 182
    .line 183
    if-eqz p1, :cond_7

    .line 184
    .line 185
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object v0, v0, La/mkn0;->r:La/gle0;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getContactsFragmentScreen$1;

    .line 195
    .line 196
    invoke-direct {v0, p0}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getContactsFragmentScreen$1;-><init>(Z)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 200
    .line 201
    .line 202
    iget-object p0, p1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 203
    .line 204
    invoke-static {v1, p0, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    :goto_1
    move-object p1, p0

    .line 209
    check-cast p1, La/paw;

    .line 210
    .line 211
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_c

    .line 216
    .line 217
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, La/oe50;

    .line 222
    .line 223
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_7
    iget-object p0, v0, La/mkn0;->s:La/yfu;

    .line 228
    .line 229
    invoke-virtual {p0}, La/yfu;->j()V

    .line 230
    .line 231
    .line 232
    new-instance p0, La/zjn0;

    .line 233
    .line 234
    invoke-direct {p0, v0, v4}, La/zjn0;-><init>(La/mkn0;B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, p0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_8
    invoke-virtual {v0}, La/mkn0;->B()V

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_9
    invoke-virtual {v0, p0}, La/mkn0;->A(Z)V

    .line 246
    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_a
    sget-object p0, La/it2;->h:La/it2;

    .line 250
    .line 251
    invoke-virtual {v3, p0}, La/s31;->b(La/it2;)V

    .line 252
    .line 253
    .line 254
    const-string p0, "\u0441hat"

    .line 255
    .line 256
    invoke-virtual {v2, p0, v9}, La/e41;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 263
    .line 264
    invoke-direct {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 265
    .line 266
    .line 267
    iget-object p1, v0, La/mkn0;->i:La/usd;

    .line 268
    .line 269
    invoke-virtual {p1}, La/usd;->b()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 274
    .line 275
    if-eqz v0, :cond_b

    .line 276
    .line 277
    new-instance v0, La/e1w0;

    .line 278
    .line 279
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 280
    .line 281
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 282
    .line 283
    .line 284
    new-instance p1, La/c8d;

    .line 285
    .line 286
    sget-object v2, La/y7d;->a:La/v7d;

    .line 287
    .line 288
    invoke-direct {p1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_b
    new-instance v0, La/w0w0;

    .line 296
    .line 297
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 298
    .line 299
    .line 300
    new-instance p1, La/c8d;

    .line 301
    .line 302
    sget-object v2, La/y7d;->a:La/v7d;

    .line 303
    .line 304
    invoke-direct {p1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    :goto_2
    invoke-static {v1, p0, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    :goto_3
    move-object p1, p0

    .line 315
    check-cast p1, La/paw;

    .line 316
    .line 317
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eqz v0, :cond_c

    .line 322
    .line 323
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    check-cast p1, La/oe50;

    .line 328
    .line 329
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 330
    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_c
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object p0

    .line 336
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 339
    .line 340
    .line 341
    move-result p1

    .line 342
    sget-object v0, La/jjn0;->S1:La/g9m0;

    .line 343
    .line 344
    if-eqz p1, :cond_d

    .line 345
    .line 346
    invoke-virtual {p0}, La/jjn0;->H0()La/mkn0;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    iget-object p1, p0, La/mkn0;->n:La/ntu;

    .line 351
    .line 352
    invoke-virtual {p1}, La/ntu;->a()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    iget-object v0, p0, La/mkn0;->m:La/nmt0;

    .line 357
    .line 358
    iget-object v0, v0, La/nmt0;->a:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, La/prc;

    .line 361
    .line 362
    new-instance v1, La/jru;

    .line 363
    .line 364
    new-instance v2, La/drm0;

    .line 365
    .line 366
    iget-object v0, v0, La/prc;->b:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, La/us3;

    .line 369
    .line 370
    invoke-direct {v2, v0}, La/drm0;-><init>(La/us3;)V

    .line 371
    .line 372
    .line 373
    const/16 v0, 0xe

    .line 374
    .line 375
    invoke-direct {v1, v2, v0}, La/jru;-><init>(Ljava/lang/Object;B)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    iget-object v0, v1, La/jru;->b:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v0, La/drm0;

    .line 384
    .line 385
    iget-object v0, v0, La/drm0;->a:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v0, La/us3;

    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    const-string v0, "/releases_android/xcare/prod/release/xcare.apk"

    .line 393
    .line 394
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    iget-object p0, p0, La/mkn0;->z:La/ol60;

    .line 399
    .line 400
    new-instance v0, La/dkn0;

    .line 401
    .line 402
    invoke-direct {v0, p1}, La/dkn0;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object p0

    .line 411
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 414
    .line 415
    .line 416
    move-result p1

    .line 417
    sget-object v0, La/jjn0;->S1:La/g9m0;

    .line 418
    .line 419
    if-eqz p1, :cond_f

    .line 420
    .line 421
    const-string p1, "org.xcare.client.OPEN_FROM_MAIN_APP"

    .line 422
    .line 423
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 424
    .line 425
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    const/high16 v2, 0x10000

    .line 437
    .line 438
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 446
    .line 447
    .line 448
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 449
    const-string v1, "org.xcare.client"

    .line 450
    .line 451
    if-nez v0, :cond_e

    .line 452
    .line 453
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    .line 454
    .line 455
    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 459
    .line 460
    .line 461
    const-string p1, "OPEN_XCARE_FROM_MAIN_APP_EXTRAS_KEY"

    .line 462
    .line 463
    const v1, 0x7f130690

    .line 464
    .line 465
    .line 466
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 471
    .line 472
    .line 473
    const/high16 p1, 0x10000000

    .line 474
    .line 475
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 476
    .line 477
    .line 478
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 483
    .line 484
    .line 485
    goto :goto_5

    .line 486
    :cond_e
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    invoke-static {p0, v1}, La/v3c;->T(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 491
    .line 492
    .line 493
    goto :goto_5

    .line 494
    :catch_0
    move-exception p0

    .line 495
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 496
    .line 497
    .line 498
    :cond_f
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object p0

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
