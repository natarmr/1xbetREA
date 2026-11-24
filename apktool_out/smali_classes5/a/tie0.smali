.class public final synthetic La/tie0;
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
    iput-byte p2, p0, La/tie0;->a:B

    iput-object p1, p0, La/tie0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tie0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    const/4 v4, 0x7

    .line 10
    const-string v5, ""

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x6

    .line 14
    const-string v8, "viewModelFactory"

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v0, v0, La/tie0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast v0, La/x6g0;

    .line 23
    .line 24
    sget-object v1, La/x6g0;->Q1:La/lme0;

    .line 25
    .line 26
    iget-object v0, v0, La/x6g0;->L1:La/fiu0;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v9

    .line 35
    :pswitch_0
    check-cast v0, La/whh0;

    .line 36
    .line 37
    instance-of v1, v0, La/ohh0;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    check-cast v0, La/ohh0;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v0, v9

    .line 45
    :goto_0
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v9, v0, La/ohh0;->b:Ljava/util/List;

    .line 48
    .line 49
    :cond_2
    if-eqz v9, :cond_3

    .line 50
    .line 51
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    :cond_3
    const/4 v6, 0x1

    .line 58
    :cond_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :pswitch_1
    check-cast v0, La/nyf0;

    .line 64
    .line 65
    iget-object v0, v0, La/nyf0;->G:La/p7m0;

    .line 66
    .line 67
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v9, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_2
    check-cast v0, La/sxf0;

    .line 79
    .line 80
    iget-object v0, v0, La/sxf0;->s:La/p7m0;

    .line 81
    .line 82
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v9, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_3
    check-cast v0, La/dwf0;

    .line 94
    .line 95
    sget-object v1, La/dwf0;->O1:La/cge0;

    .line 96
    .line 97
    new-instance v1, La/ry3;

    .line 98
    .line 99
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v0, v0, La/dwf0;->K1:La/jzi;

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 108
    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_5
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v9

    .line 115
    :pswitch_4
    check-cast v0, La/zuf0;

    .line 116
    .line 117
    sget-object v1, La/zuf0;->e2:La/gne0;

    .line 118
    .line 119
    iget-object v0, v0, La/zuf0;->c2:La/fiu0;

    .line 120
    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    return-object v0

    .line 124
    :cond_6
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v9

    .line 128
    :pswitch_5
    check-cast v0, La/zn00;

    .line 129
    .line 130
    iget-object v0, v0, La/zn00;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, La/gii0;

    .line 133
    .line 134
    const-class v1, La/duf0;

    .line 135
    .line 136
    sget-object v2, La/sre0;->a:La/tre0;

    .line 137
    .line 138
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, La/duf0;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_6
    check-cast v0, La/zsf0;

    .line 150
    .line 151
    iget-object v1, v0, La/zsf0;->c:Ljava/lang/ClassLoader;

    .line 152
    .line 153
    iget-object v0, v0, La/zsf0;->d:La/yzp;

    .line 154
    .line 155
    invoke-virtual {v1, v5}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v3, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    :cond_7
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    check-cast v4, Ljava/net/URL;

    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    const-string v8, "file"

    .line 198
    .line 199
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-nez v5, :cond_8

    .line 204
    .line 205
    move-object v5, v9

    .line 206
    goto :goto_2

    .line 207
    :cond_8
    sget-object v5, La/y190;->b:Ljava/lang/String;

    .line 208
    .line 209
    new-instance v5, Ljava/io/File;

    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v5}, La/rl70;->c(Ljava/io/File;)La/y190;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    new-instance v5, Lkotlin/Pair;

    .line 223
    .line 224
    invoke-direct {v5, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :goto_2
    if-eqz v5, :cond_7

    .line 228
    .line 229
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_9
    const-string v2, "META-INF/MANIFEST.MF"

    .line 234
    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    new-instance v2, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    :cond_a
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-eqz v4, :cond_d

    .line 263
    .line 264
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    check-cast v4, Ljava/net/URL;

    .line 269
    .line 270
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    const-string v5, "jar:file:"

    .line 281
    .line 282
    invoke-static {v4, v5, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-nez v5, :cond_b

    .line 287
    .line 288
    :goto_4
    move-object v8, v9

    .line 289
    goto :goto_5

    .line 290
    :cond_b
    const-string v5, "!"

    .line 291
    .line 292
    invoke-static {v6, v4, v7, v5}, Lkotlin/text/StringsKt;->Y(ILjava/lang/String;ILjava/lang/String;)I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    const/4 v8, -0x1

    .line 297
    if-ne v5, v8, :cond_c

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_c
    sget-object v8, La/y190;->b:Ljava/lang/String;

    .line 301
    .line 302
    new-instance v8, Ljava/io/File;

    .line 303
    .line 304
    const/4 v10, 0x4

    .line 305
    invoke-virtual {v4, v10, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-static {v4}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-direct {v8, v4}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v8}, La/rl70;->c(Ljava/io/File;)La/y190;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    new-instance v5, La/bue0;

    .line 321
    .line 322
    const/16 v8, 0x1c

    .line 323
    .line 324
    invoke-direct {v5, v8}, La/bue0;-><init>(B)V

    .line 325
    .line 326
    .line 327
    invoke-static {v4, v0, v5}, La/s7n0;->t(La/y190;La/yzp;Lkotlin/jvm/functions/Function1;)La/e3w0;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    sget-object v5, La/zsf0;->f:La/y190;

    .line 332
    .line 333
    new-instance v8, Lkotlin/Pair;

    .line 334
    .line 335
    invoke-direct {v8, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :goto_5
    if-eqz v8, :cond_a

    .line 339
    .line 340
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    goto :goto_3

    .line 344
    :cond_d
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    return-object v0

    .line 349
    :pswitch_7
    check-cast v0, La/xqf0;

    .line 350
    .line 351
    iget-object v0, v0, La/xqf0;->a:La/gii0;

    .line 352
    .line 353
    const-class v1, La/kof0;

    .line 354
    .line 355
    sget-object v2, La/sre0;->a:La/tre0;

    .line 356
    .line 357
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, La/kof0;

    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_8
    check-cast v0, La/aqf0;

    .line 369
    .line 370
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    iget-object v1, v0, La/aqf0;->s:La/mne;

    .line 375
    .line 376
    iget-object v13, v1, La/mne;->a:La/rwj;

    .line 377
    .line 378
    sget-object v11, La/xpf0;->a:La/xpf0;

    .line 379
    .line 380
    new-instance v14, La/ypf0;

    .line 381
    .line 382
    invoke-direct {v14, v0, v9, v6}, La/ypf0;-><init>(La/aqf0;La/yje;B)V

    .line 383
    .line 384
    .line 385
    const/16 v15, 0xa

    .line 386
    .line 387
    const/4 v12, 0x0

    .line 388
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 389
    .line 390
    .line 391
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object v0

    .line 394
    :pswitch_9
    check-cast v0, La/knf0;

    .line 395
    .line 396
    iget-object v1, v0, La/knf0;->c:La/wsb0;

    .line 397
    .line 398
    move-object v2, v1

    .line 399
    check-cast v2, La/twb0;

    .line 400
    .line 401
    iget-object v2, v2, La/twb0;->a:La/vwb0;

    .line 402
    .line 403
    const-string v3, "APP_GUID"

    .line 404
    .line 405
    invoke-virtual {v2, v3, v5}, La/vwb0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    if-nez v4, :cond_e

    .line 414
    .line 415
    iget-object v0, v0, La/knf0;->a:La/us00;

    .line 416
    .line 417
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    const-string v2, "android_id"

    .line 422
    .line 423
    invoke-static {v0, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    const-string v2, "_2"

    .line 428
    .line 429
    invoke-static {v0, v2}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    check-cast v1, La/twb0;

    .line 434
    .line 435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v0, v1, La/twb0;->a:La/vwb0;

    .line 439
    .line 440
    invoke-virtual {v0, v3, v2}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    :cond_e
    return-object v2

    .line 444
    :pswitch_a
    check-cast v0, La/gjf0;

    .line 445
    .line 446
    iget-object v1, v0, La/gjf0;->i:La/p7m0;

    .line 447
    .line 448
    :cond_f
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    move-object v2, v0

    .line 453
    check-cast v2, La/ejf0;

    .line 454
    .line 455
    const/4 v6, 0x0

    .line 456
    const/16 v7, 0xe

    .line 457
    .line 458
    const/4 v3, 0x0

    .line 459
    const/4 v4, 0x0

    .line 460
    const/4 v5, 0x0

    .line 461
    invoke-static/range {v2 .. v7}, La/ejf0;->a(La/ejf0;ZLjava/lang/String;ZZI)La/ejf0;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_f

    .line 470
    .line 471
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_b
    check-cast v0, La/krc;

    .line 475
    .line 476
    new-instance v1, La/gif0;

    .line 477
    .line 478
    invoke-virtual {v0}, La/krc;->a()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-direct {v1, v0, v5, v6, v6}, La/gif0;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 483
    .line 484
    .line 485
    return-object v1

    .line 486
    :pswitch_c
    check-cast v0, La/lgf0;

    .line 487
    .line 488
    sget-object v1, La/lgf0;->N1:La/gle0;

    .line 489
    .line 490
    iget-object v0, v0, La/lgf0;->L1:La/fiu0;

    .line 491
    .line 492
    if-eqz v0, :cond_10

    .line 493
    .line 494
    return-object v0

    .line 495
    :cond_10
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    throw v9

    .line 499
    :pswitch_d
    check-cast v0, [La/rb50;

    .line 500
    .line 501
    new-instance v1, La/u950;

    .line 502
    .line 503
    array-length v2, v0

    .line 504
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    check-cast v0, [La/rb50;

    .line 509
    .line 510
    array-length v2, v0

    .line 511
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    new-instance v2, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 516
    .line 517
    invoke-direct {v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    .line 518
    .line 519
    .line 520
    invoke-static {v0}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .line 525
    .line 526
    .line 527
    invoke-direct {v1, v2}, La/u950;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V

    .line 528
    .line 529
    .line 530
    return-object v1

    .line 531
    :pswitch_e
    move-object v1, v0

    .line 532
    check-cast v1, La/ocf0;

    .line 533
    .line 534
    iget-object v5, v1, La/i3t0;->f:La/oyg0;

    .line 535
    .line 536
    iget-object v6, v1, La/i3t0;->i:La/ocj;

    .line 537
    .line 538
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 539
    .line 540
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v8

    .line 547
    check-cast v8, La/mbf0;

    .line 548
    .line 549
    iget-object v8, v8, La/mbf0;->d:Ljava/util/List;

    .line 550
    .line 551
    new-instance v9, Ljava/util/ArrayList;

    .line 552
    .line 553
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 554
    .line 555
    .line 556
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    :cond_11
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v10

    .line 564
    if-eqz v10, :cond_12

    .line 565
    .line 566
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v10

    .line 570
    move-object v11, v10

    .line 571
    check-cast v11, La/q0f0;

    .line 572
    .line 573
    invoke-static {v11}, La/n2x;->F(La/q0f0;)Z

    .line 574
    .line 575
    .line 576
    move-result v11

    .line 577
    if-eqz v11, :cond_11

    .line 578
    .line 579
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    goto :goto_6

    .line 583
    :cond_12
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v8

    .line 587
    check-cast v8, La/q0f0;

    .line 588
    .line 589
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object v9

    .line 593
    :cond_13
    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v10

    .line 597
    if-eqz v10, :cond_15

    .line 598
    .line 599
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v10

    .line 603
    check-cast v10, La/q0f0;

    .line 604
    .line 605
    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v11

    .line 609
    invoke-virtual {v10}, La/q0f0;->a()Z

    .line 610
    .line 611
    .line 612
    move-result v12

    .line 613
    if-nez v12, :cond_13

    .line 614
    .line 615
    invoke-static {v10}, La/x2x;->s0(La/q0f0;)La/u0f0;

    .line 616
    .line 617
    .line 618
    move-result-object v10

    .line 619
    if-eqz v11, :cond_14

    .line 620
    .line 621
    move v11, v4

    .line 622
    goto :goto_8

    .line 623
    :cond_14
    move v11, v7

    .line 624
    :goto_8
    new-instance v12, La/j3x;

    .line 625
    .line 626
    invoke-direct {v12, v11}, La/j3x;-><init>(I)V

    .line 627
    .line 628
    .line 629
    invoke-interface {v0, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    goto :goto_7

    .line 633
    :cond_15
    iget-object v7, v6, La/ocj;->a:La/p7m0;

    .line 634
    .line 635
    :goto_9
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v8

    .line 639
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    move-object v9, v8

    .line 643
    move-object v8, v9

    .line 644
    check-cast v8, La/mbf0;

    .line 645
    .line 646
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    const/16 v30, 0x0

    .line 650
    .line 651
    const v31, 0x3fffff7f    # 1.9999846f

    .line 652
    .line 653
    .line 654
    move-object v10, v9

    .line 655
    const/4 v9, 0x0

    .line 656
    move-object v11, v10

    .line 657
    const/4 v10, 0x0

    .line 658
    move-object v12, v11

    .line 659
    const/4 v11, 0x0

    .line 660
    move-object v13, v12

    .line 661
    const/4 v12, 0x0

    .line 662
    move-object v14, v13

    .line 663
    const/4 v13, 0x0

    .line 664
    move-object v15, v14

    .line 665
    const/4 v14, 0x0

    .line 666
    move-object/from16 v16, v15

    .line 667
    .line 668
    const/4 v15, 0x0

    .line 669
    const/16 v17, 0x0

    .line 670
    .line 671
    const/16 v18, 0x0

    .line 672
    .line 673
    const/16 v19, 0x0

    .line 674
    .line 675
    const/16 v20, 0x0

    .line 676
    .line 677
    const/16 v21, 0x0

    .line 678
    .line 679
    const/16 v22, 0x0

    .line 680
    .line 681
    const/16 v23, 0x0

    .line 682
    .line 683
    const/16 v24, 0x0

    .line 684
    .line 685
    const/16 v25, 0x0

    .line 686
    .line 687
    const/16 v26, 0x0

    .line 688
    .line 689
    const/16 v27, 0x0

    .line 690
    .line 691
    const/16 v28, 0x0

    .line 692
    .line 693
    const/16 v29, 0x0

    .line 694
    .line 695
    move-object/from16 v32, v16

    .line 696
    .line 697
    move-object/from16 v16, v0

    .line 698
    .line 699
    move-object/from16 v0, v32

    .line 700
    .line 701
    invoke-static/range {v8 .. v31}, La/mbf0;->a(La/mbf0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/p1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/mbf0;

    .line 702
    .line 703
    .line 704
    move-result-object v8

    .line 705
    invoke-virtual {v7, v0, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-eqz v0, :cond_1b

    .line 710
    .line 711
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    check-cast v0, La/mbf0;

    .line 716
    .line 717
    iget-object v0, v0, La/mbf0;->d:Ljava/util/List;

    .line 718
    .line 719
    new-instance v7, Ljava/util/ArrayList;

    .line 720
    .line 721
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 722
    .line 723
    .line 724
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    :cond_16
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 729
    .line 730
    .line 731
    move-result v8

    .line 732
    if-eqz v8, :cond_17

    .line 733
    .line 734
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v8

    .line 738
    move-object v9, v8

    .line 739
    check-cast v9, La/q0f0;

    .line 740
    .line 741
    invoke-static {v9}, La/n2x;->F(La/q0f0;)Z

    .line 742
    .line 743
    .line 744
    move-result v9

    .line 745
    if-eqz v9, :cond_16

    .line 746
    .line 747
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    goto :goto_a

    .line 751
    :cond_17
    invoke-static {v7, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    invoke-static {v0}, La/wp20;->a(I)I

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    if-ge v0, v2, :cond_18

    .line 760
    .line 761
    goto :goto_b

    .line 762
    :cond_18
    move v2, v0

    .line 763
    :goto_b
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 764
    .line 765
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 773
    .line 774
    .line 775
    move-result v3

    .line 776
    if-eqz v3, :cond_19

    .line 777
    .line 778
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    check-cast v3, La/q0f0;

    .line 783
    .line 784
    invoke-static {v3}, La/x2x;->s0(La/q0f0;)La/u0f0;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 789
    .line 790
    invoke-interface {v0, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    goto :goto_c

    .line 794
    :cond_19
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 795
    .line 796
    :goto_d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    move-object v8, v3

    .line 804
    check-cast v8, La/mbf0;

    .line 805
    .line 806
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    const/16 v30, 0x0

    .line 810
    .line 811
    const v31, 0x3ffffeff    # 1.9999694f

    .line 812
    .line 813
    .line 814
    const/4 v9, 0x0

    .line 815
    const/4 v10, 0x0

    .line 816
    const/4 v11, 0x0

    .line 817
    const/4 v12, 0x0

    .line 818
    const/4 v13, 0x0

    .line 819
    const/4 v14, 0x0

    .line 820
    const/4 v15, 0x0

    .line 821
    const/16 v16, 0x0

    .line 822
    .line 823
    const/16 v18, 0x0

    .line 824
    .line 825
    const/16 v19, 0x0

    .line 826
    .line 827
    const/16 v20, 0x0

    .line 828
    .line 829
    const/16 v21, 0x0

    .line 830
    .line 831
    const/16 v22, 0x0

    .line 832
    .line 833
    const/16 v23, 0x0

    .line 834
    .line 835
    const/16 v24, 0x0

    .line 836
    .line 837
    const/16 v25, 0x0

    .line 838
    .line 839
    const/16 v26, 0x0

    .line 840
    .line 841
    const/16 v27, 0x0

    .line 842
    .line 843
    const/16 v28, 0x0

    .line 844
    .line 845
    const/16 v29, 0x0

    .line 846
    .line 847
    move-object/from16 v17, v0

    .line 848
    .line 849
    invoke-static/range {v8 .. v31}, La/mbf0;->a(La/mbf0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/p1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration/visual/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/visual/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/mbf0;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    invoke-virtual {v2, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move-result v0

    .line 857
    if-eqz v0, :cond_1a

    .line 858
    .line 859
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    check-cast v0, La/mbf0;

    .line 864
    .line 865
    iget-object v0, v0, La/mbf0;->g:La/p1f0;

    .line 866
    .line 867
    new-instance v2, La/dke0;

    .line 868
    .line 869
    invoke-direct {v2, v0, v4}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v1, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 873
    .line 874
    .line 875
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 876
    .line 877
    return-object v0

    .line 878
    :cond_1a
    move-object/from16 v0, v17

    .line 879
    .line 880
    goto :goto_d

    .line 881
    :cond_1b
    move-object/from16 v0, v16

    .line 882
    .line 883
    goto/16 :goto_9

    .line 884
    .line 885
    :pswitch_f
    move-object v1, v0

    .line 886
    check-cast v1, La/x5f0;

    .line 887
    .line 888
    iget-object v5, v1, La/i3t0;->f:La/oyg0;

    .line 889
    .line 890
    iget-object v6, v1, La/i3t0;->i:La/ocj;

    .line 891
    .line 892
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 893
    .line 894
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v8

    .line 901
    check-cast v8, La/u4f0;

    .line 902
    .line 903
    iget-object v8, v8, La/u4f0;->d:Ljava/util/List;

    .line 904
    .line 905
    new-instance v9, Ljava/util/ArrayList;

    .line 906
    .line 907
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 908
    .line 909
    .line 910
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 911
    .line 912
    .line 913
    move-result-object v8

    .line 914
    :cond_1c
    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 915
    .line 916
    .line 917
    move-result v10

    .line 918
    if-eqz v10, :cond_1d

    .line 919
    .line 920
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v10

    .line 924
    move-object v11, v10

    .line 925
    check-cast v11, La/q0f0;

    .line 926
    .line 927
    invoke-static {v11}, La/n2x;->F(La/q0f0;)Z

    .line 928
    .line 929
    .line 930
    move-result v11

    .line 931
    if-eqz v11, :cond_1c

    .line 932
    .line 933
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    goto :goto_e

    .line 937
    :cond_1d
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v8

    .line 941
    check-cast v8, La/q0f0;

    .line 942
    .line 943
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 944
    .line 945
    .line 946
    move-result-object v9

    .line 947
    :cond_1e
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 948
    .line 949
    .line 950
    move-result v10

    .line 951
    if-eqz v10, :cond_20

    .line 952
    .line 953
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v10

    .line 957
    check-cast v10, La/q0f0;

    .line 958
    .line 959
    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move-result v11

    .line 963
    invoke-virtual {v10}, La/q0f0;->a()Z

    .line 964
    .line 965
    .line 966
    move-result v12

    .line 967
    if-nez v12, :cond_1e

    .line 968
    .line 969
    invoke-static {v10}, La/x2x;->s0(La/q0f0;)La/u0f0;

    .line 970
    .line 971
    .line 972
    move-result-object v10

    .line 973
    if-eqz v11, :cond_1f

    .line 974
    .line 975
    move v11, v4

    .line 976
    goto :goto_10

    .line 977
    :cond_1f
    move v11, v7

    .line 978
    :goto_10
    new-instance v12, La/j3x;

    .line 979
    .line 980
    invoke-direct {v12, v11}, La/j3x;-><init>(I)V

    .line 981
    .line 982
    .line 983
    invoke-interface {v0, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    goto :goto_f

    .line 987
    :cond_20
    iget-object v4, v6, La/ocj;->a:La/p7m0;

    .line 988
    .line 989
    :goto_11
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v8

    .line 993
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    move-object v9, v8

    .line 997
    move-object v8, v9

    .line 998
    check-cast v8, La/u4f0;

    .line 999
    .line 1000
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    const/16 v30, 0x0

    .line 1004
    .line 1005
    const v31, 0x3fffff7f    # 1.9999846f

    .line 1006
    .line 1007
    .line 1008
    move-object v10, v9

    .line 1009
    const/4 v9, 0x0

    .line 1010
    move-object v11, v10

    .line 1011
    const/4 v10, 0x0

    .line 1012
    move-object v12, v11

    .line 1013
    const/4 v11, 0x0

    .line 1014
    move-object v13, v12

    .line 1015
    const/4 v12, 0x0

    .line 1016
    move-object v14, v13

    .line 1017
    const/4 v13, 0x0

    .line 1018
    move-object v15, v14

    .line 1019
    const/4 v14, 0x0

    .line 1020
    move-object/from16 v16, v15

    .line 1021
    .line 1022
    const/4 v15, 0x0

    .line 1023
    const/16 v17, 0x0

    .line 1024
    .line 1025
    const/16 v18, 0x0

    .line 1026
    .line 1027
    const/16 v19, 0x0

    .line 1028
    .line 1029
    const/16 v20, 0x0

    .line 1030
    .line 1031
    const/16 v21, 0x0

    .line 1032
    .line 1033
    const/16 v22, 0x0

    .line 1034
    .line 1035
    const/16 v23, 0x0

    .line 1036
    .line 1037
    const/16 v24, 0x0

    .line 1038
    .line 1039
    const/16 v25, 0x0

    .line 1040
    .line 1041
    const/16 v26, 0x0

    .line 1042
    .line 1043
    const/16 v27, 0x0

    .line 1044
    .line 1045
    const/16 v28, 0x0

    .line 1046
    .line 1047
    const/16 v29, 0x0

    .line 1048
    .line 1049
    move-object/from16 v32, v16

    .line 1050
    .line 1051
    move-object/from16 v16, v0

    .line 1052
    .line 1053
    move-object/from16 v0, v32

    .line 1054
    .line 1055
    invoke-static/range {v8 .. v31}, La/u4f0;->a(La/u4f0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/r1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;ZLjava/util/List;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/u4f0;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v8

    .line 1059
    invoke-virtual {v4, v0, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v0

    .line 1063
    if-eqz v0, :cond_26

    .line 1064
    .line 1065
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    check-cast v0, La/u4f0;

    .line 1070
    .line 1071
    iget-object v0, v0, La/u4f0;->d:Ljava/util/List;

    .line 1072
    .line 1073
    new-instance v4, Ljava/util/ArrayList;

    .line 1074
    .line 1075
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1076
    .line 1077
    .line 1078
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    :cond_21
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v8

    .line 1086
    if-eqz v8, :cond_22

    .line 1087
    .line 1088
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v8

    .line 1092
    move-object v9, v8

    .line 1093
    check-cast v9, La/q0f0;

    .line 1094
    .line 1095
    invoke-static {v9}, La/n2x;->F(La/q0f0;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v9

    .line 1099
    if-eqz v9, :cond_21

    .line 1100
    .line 1101
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    goto :goto_12

    .line 1105
    :cond_22
    invoke-static {v4, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1106
    .line 1107
    .line 1108
    move-result v0

    .line 1109
    invoke-static {v0}, La/wp20;->a(I)I

    .line 1110
    .line 1111
    .line 1112
    move-result v0

    .line 1113
    if-ge v0, v2, :cond_23

    .line 1114
    .line 1115
    goto :goto_13

    .line 1116
    :cond_23
    move v2, v0

    .line 1117
    :goto_13
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 1118
    .line 1119
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v2

    .line 1126
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v3

    .line 1130
    if-eqz v3, :cond_24

    .line 1131
    .line 1132
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v3

    .line 1136
    check-cast v3, La/q0f0;

    .line 1137
    .line 1138
    invoke-static {v3}, La/x2x;->s0(La/q0f0;)La/u0f0;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v3

    .line 1142
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1143
    .line 1144
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    goto :goto_14

    .line 1148
    :cond_24
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 1149
    .line 1150
    :goto_15
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v3

    .line 1154
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    move-object v8, v3

    .line 1158
    check-cast v8, La/u4f0;

    .line 1159
    .line 1160
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1161
    .line 1162
    .line 1163
    const/16 v30, 0x0

    .line 1164
    .line 1165
    const v31, 0x3ffffeff    # 1.9999694f

    .line 1166
    .line 1167
    .line 1168
    const/4 v9, 0x0

    .line 1169
    const/4 v10, 0x0

    .line 1170
    const/4 v11, 0x0

    .line 1171
    const/4 v12, 0x0

    .line 1172
    const/4 v13, 0x0

    .line 1173
    const/4 v14, 0x0

    .line 1174
    const/4 v15, 0x0

    .line 1175
    const/16 v16, 0x0

    .line 1176
    .line 1177
    const/16 v18, 0x0

    .line 1178
    .line 1179
    const/16 v19, 0x0

    .line 1180
    .line 1181
    const/16 v20, 0x0

    .line 1182
    .line 1183
    const/16 v21, 0x0

    .line 1184
    .line 1185
    const/16 v22, 0x0

    .line 1186
    .line 1187
    const/16 v23, 0x0

    .line 1188
    .line 1189
    const/16 v24, 0x0

    .line 1190
    .line 1191
    const/16 v25, 0x0

    .line 1192
    .line 1193
    const/16 v26, 0x0

    .line 1194
    .line 1195
    const/16 v27, 0x0

    .line 1196
    .line 1197
    const/16 v28, 0x0

    .line 1198
    .line 1199
    const/16 v29, 0x0

    .line 1200
    .line 1201
    move-object/from16 v17, v0

    .line 1202
    .line 1203
    invoke-static/range {v8 .. v31}, La/u4f0;->a(La/u4f0;ZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/r1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/q7f0;Ljava/util/List;ZLjava/util/List;ZLorg/xplatform/registration/simple/impl/presentation/state/models/fields/CountryStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/RegionStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/BonusStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration/simple/impl/presentation/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/u4f0;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    invoke-virtual {v2, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v0

    .line 1211
    if-eqz v0, :cond_25

    .line 1212
    .line 1213
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    check-cast v0, La/u4f0;

    .line 1218
    .line 1219
    iget-object v0, v0, La/u4f0;->g:La/r1f0;

    .line 1220
    .line 1221
    new-instance v2, La/dke0;

    .line 1222
    .line 1223
    invoke-direct {v2, v0, v7}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v1, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1227
    .line 1228
    .line 1229
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1230
    .line 1231
    return-object v0

    .line 1232
    :cond_25
    move-object/from16 v0, v17

    .line 1233
    .line 1234
    goto :goto_15

    .line 1235
    :cond_26
    move-object/from16 v0, v16

    .line 1236
    .line 1237
    goto/16 :goto_11

    .line 1238
    .line 1239
    :pswitch_10
    move-object v1, v0

    .line 1240
    check-cast v1, La/eze0;

    .line 1241
    .line 1242
    iget-object v5, v1, La/i3t0;->f:La/oyg0;

    .line 1243
    .line 1244
    iget-object v6, v1, La/i3t0;->i:La/ocj;

    .line 1245
    .line 1246
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 1247
    .line 1248
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v8

    .line 1255
    check-cast v8, La/aye0;

    .line 1256
    .line 1257
    iget-object v8, v8, La/aye0;->e:Ljava/util/List;

    .line 1258
    .line 1259
    new-instance v9, Ljava/util/ArrayList;

    .line 1260
    .line 1261
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1262
    .line 1263
    .line 1264
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v8

    .line 1268
    :cond_27
    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1269
    .line 1270
    .line 1271
    move-result v10

    .line 1272
    if-eqz v10, :cond_28

    .line 1273
    .line 1274
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v10

    .line 1278
    move-object v11, v10

    .line 1279
    check-cast v11, La/q0f0;

    .line 1280
    .line 1281
    invoke-static {v11}, La/n2x;->F(La/q0f0;)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v11

    .line 1285
    if-eqz v11, :cond_27

    .line 1286
    .line 1287
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1288
    .line 1289
    .line 1290
    goto :goto_16

    .line 1291
    :cond_28
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v8

    .line 1295
    check-cast v8, La/q0f0;

    .line 1296
    .line 1297
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v9

    .line 1301
    :cond_29
    :goto_17
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1302
    .line 1303
    .line 1304
    move-result v10

    .line 1305
    if-eqz v10, :cond_2b

    .line 1306
    .line 1307
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v10

    .line 1311
    check-cast v10, La/q0f0;

    .line 1312
    .line 1313
    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v11

    .line 1317
    invoke-virtual {v10}, La/q0f0;->a()Z

    .line 1318
    .line 1319
    .line 1320
    move-result v12

    .line 1321
    if-nez v12, :cond_29

    .line 1322
    .line 1323
    invoke-static {v10}, La/x2x;->s0(La/q0f0;)La/u0f0;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v10

    .line 1327
    if-eqz v11, :cond_2a

    .line 1328
    .line 1329
    move v11, v4

    .line 1330
    goto :goto_18

    .line 1331
    :cond_2a
    move v11, v7

    .line 1332
    :goto_18
    new-instance v12, La/j3x;

    .line 1333
    .line 1334
    invoke-direct {v12, v11}, La/j3x;-><init>(I)V

    .line 1335
    .line 1336
    .line 1337
    invoke-interface {v0, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    goto :goto_17

    .line 1341
    :cond_2b
    iget-object v4, v6, La/ocj;->a:La/p7m0;

    .line 1342
    .line 1343
    :goto_19
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v7

    .line 1347
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1348
    .line 1349
    .line 1350
    move-object v8, v7

    .line 1351
    check-cast v8, La/aye0;

    .line 1352
    .line 1353
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1354
    .line 1355
    .line 1356
    const/16 v29, 0x0

    .line 1357
    .line 1358
    const v30, 0x7ffffeff

    .line 1359
    .line 1360
    .line 1361
    const/4 v9, 0x0

    .line 1362
    const/4 v10, 0x0

    .line 1363
    const/4 v11, 0x0

    .line 1364
    const/4 v12, 0x0

    .line 1365
    const/4 v13, 0x0

    .line 1366
    const/4 v14, 0x0

    .line 1367
    const/4 v15, 0x0

    .line 1368
    const/16 v16, 0x0

    .line 1369
    .line 1370
    const/16 v18, 0x0

    .line 1371
    .line 1372
    const/16 v19, 0x0

    .line 1373
    .line 1374
    const/16 v20, 0x0

    .line 1375
    .line 1376
    const/16 v21, 0x0

    .line 1377
    .line 1378
    const/16 v22, 0x0

    .line 1379
    .line 1380
    const/16 v23, 0x0

    .line 1381
    .line 1382
    const/16 v24, 0x0

    .line 1383
    .line 1384
    const/16 v25, 0x0

    .line 1385
    .line 1386
    const/16 v26, 0x0

    .line 1387
    .line 1388
    const/16 v27, 0x0

    .line 1389
    .line 1390
    const/16 v28, 0x0

    .line 1391
    .line 1392
    move-object/from16 v17, v0

    .line 1393
    .line 1394
    invoke-static/range {v8 .. v30}, La/aye0;->a(La/aye0;ZZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/q1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/aye0;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    invoke-virtual {v4, v7, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v0

    .line 1402
    if-eqz v0, :cond_31

    .line 1403
    .line 1404
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    check-cast v0, La/aye0;

    .line 1409
    .line 1410
    iget-object v0, v0, La/aye0;->e:Ljava/util/List;

    .line 1411
    .line 1412
    new-instance v4, Ljava/util/ArrayList;

    .line 1413
    .line 1414
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1415
    .line 1416
    .line 1417
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    :cond_2c
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1422
    .line 1423
    .line 1424
    move-result v7

    .line 1425
    if-eqz v7, :cond_2d

    .line 1426
    .line 1427
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v7

    .line 1431
    move-object v8, v7

    .line 1432
    check-cast v8, La/q0f0;

    .line 1433
    .line 1434
    invoke-static {v8}, La/n2x;->F(La/q0f0;)Z

    .line 1435
    .line 1436
    .line 1437
    move-result v8

    .line 1438
    if-eqz v8, :cond_2c

    .line 1439
    .line 1440
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1441
    .line 1442
    .line 1443
    goto :goto_1a

    .line 1444
    :cond_2d
    invoke-static {v4, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1445
    .line 1446
    .line 1447
    move-result v0

    .line 1448
    invoke-static {v0}, La/wp20;->a(I)I

    .line 1449
    .line 1450
    .line 1451
    move-result v0

    .line 1452
    if-ge v0, v2, :cond_2e

    .line 1453
    .line 1454
    goto :goto_1b

    .line 1455
    :cond_2e
    move v2, v0

    .line 1456
    :goto_1b
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 1457
    .line 1458
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    :goto_1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1466
    .line 1467
    .line 1468
    move-result v3

    .line 1469
    if-eqz v3, :cond_2f

    .line 1470
    .line 1471
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v3

    .line 1475
    check-cast v3, La/q0f0;

    .line 1476
    .line 1477
    invoke-static {v3}, La/x2x;->s0(La/q0f0;)La/u0f0;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v3

    .line 1481
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1482
    .line 1483
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    goto :goto_1c

    .line 1487
    :cond_2f
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 1488
    .line 1489
    :goto_1d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v3

    .line 1493
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1494
    .line 1495
    .line 1496
    move-object v7, v3

    .line 1497
    check-cast v7, La/aye0;

    .line 1498
    .line 1499
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1500
    .line 1501
    .line 1502
    const/16 v28, 0x0

    .line 1503
    .line 1504
    const v29, 0x7ffffdff

    .line 1505
    .line 1506
    .line 1507
    const/4 v8, 0x0

    .line 1508
    const/4 v9, 0x0

    .line 1509
    const/4 v10, 0x0

    .line 1510
    const/4 v11, 0x0

    .line 1511
    const/4 v12, 0x0

    .line 1512
    const/4 v13, 0x0

    .line 1513
    const/4 v14, 0x0

    .line 1514
    const/4 v15, 0x0

    .line 1515
    const/16 v16, 0x0

    .line 1516
    .line 1517
    const/16 v18, 0x0

    .line 1518
    .line 1519
    const/16 v19, 0x0

    .line 1520
    .line 1521
    const/16 v20, 0x0

    .line 1522
    .line 1523
    const/16 v21, 0x0

    .line 1524
    .line 1525
    const/16 v22, 0x0

    .line 1526
    .line 1527
    const/16 v23, 0x0

    .line 1528
    .line 1529
    const/16 v24, 0x0

    .line 1530
    .line 1531
    const/16 v25, 0x0

    .line 1532
    .line 1533
    const/16 v26, 0x0

    .line 1534
    .line 1535
    const/16 v27, 0x0

    .line 1536
    .line 1537
    move-object/from16 v17, v0

    .line 1538
    .line 1539
    invoke-static/range {v7 .. v29}, La/aye0;->a(La/aye0;ZZZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/ArrayList;La/q1f0;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;La/u0f0;Ljava/util/List;ZLorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CountryStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/RegionStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CurrencyStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/BonusStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CitizenshipStateModel;Lorg/xplatform/registration_default/impl/presentation/udf/state/models/fields/CityStateModel;Ljava/lang/String;Ljava/lang/Integer;I)La/aye0;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    move-object/from16 v7, v17

    .line 1544
    .line 1545
    invoke-virtual {v2, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1546
    .line 1547
    .line 1548
    move-result v0

    .line 1549
    if-eqz v0, :cond_30

    .line 1550
    .line 1551
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v0

    .line 1555
    check-cast v0, La/aye0;

    .line 1556
    .line 1557
    iget-object v0, v0, La/aye0;->h:La/q1f0;

    .line 1558
    .line 1559
    new-instance v2, La/dke0;

    .line 1560
    .line 1561
    const/4 v3, 0x5

    .line 1562
    invoke-direct {v2, v0, v3}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v1, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1566
    .line 1567
    .line 1568
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1569
    .line 1570
    return-object v0

    .line 1571
    :cond_30
    move-object v0, v7

    .line 1572
    goto :goto_1d

    .line 1573
    :cond_31
    move-object/from16 v0, v17

    .line 1574
    .line 1575
    goto/16 :goto_19

    .line 1576
    .line 1577
    :pswitch_11
    check-cast v0, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;

    .line 1578
    .line 1579
    iget-boolean v6, v0, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;->d:Z

    .line 1580
    .line 1581
    sget-object v7, La/iun;->a:La/iun;

    .line 1582
    .line 1583
    iget v2, v0, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;->a:I

    .line 1584
    .line 1585
    iget v3, v0, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;->b:I

    .line 1586
    .line 1587
    iget-wide v4, v0, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;->c:J

    .line 1588
    .line 1589
    iget v8, v0, Lorg/xplatform/registration/bonus/api/BonusSelectionScreenParams;->e:I

    .line 1590
    .line 1591
    new-instance v1, La/vg8;

    .line 1592
    .line 1593
    invoke-direct/range {v1 .. v8}, La/vg8;-><init>(IIJZLjava/util/List;I)V

    .line 1594
    .line 1595
    .line 1596
    return-object v1

    .line 1597
    :pswitch_12
    check-cast v0, La/jue0;

    .line 1598
    .line 1599
    sget-object v1, La/jue0;->n2:La/gle0;

    .line 1600
    .line 1601
    iget-object v0, v0, La/jue0;->l2:La/fiu0;

    .line 1602
    .line 1603
    if-eqz v0, :cond_32

    .line 1604
    .line 1605
    return-object v0

    .line 1606
    :cond_32
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1607
    .line 1608
    .line 1609
    throw v9

    .line 1610
    :pswitch_13
    check-cast v0, Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;

    .line 1611
    .line 1612
    new-instance v1, La/mg8;

    .line 1613
    .line 1614
    iget v2, v0, Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;->a:I

    .line 1615
    .line 1616
    iget v3, v0, Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;->b:I

    .line 1617
    .line 1618
    iget-wide v4, v0, Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;->c:J

    .line 1619
    .line 1620
    iget-boolean v6, v0, Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;->d:Z

    .line 1621
    .line 1622
    sget-object v7, La/iun;->a:La/iun;

    .line 1623
    .line 1624
    iget v8, v0, Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;->e:I

    .line 1625
    .line 1626
    invoke-direct/range {v1 .. v8}, La/mg8;-><init>(IIJZLjava/util/List;I)V

    .line 1627
    .line 1628
    .line 1629
    return-object v1

    .line 1630
    :pswitch_14
    check-cast v0, La/eue0;

    .line 1631
    .line 1632
    sget-object v1, La/eue0;->n2:La/zie0;

    .line 1633
    .line 1634
    iget-object v0, v0, La/eue0;->l2:La/fiu0;

    .line 1635
    .line 1636
    if-eqz v0, :cond_33

    .line 1637
    .line 1638
    return-object v0

    .line 1639
    :cond_33
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1640
    .line 1641
    .line 1642
    throw v9

    .line 1643
    :pswitch_15
    check-cast v0, La/tpe0;

    .line 1644
    .line 1645
    iget-object v1, v0, La/tpe0;->i:La/p7m0;

    .line 1646
    .line 1647
    new-instance v2, La/upe0;

    .line 1648
    .line 1649
    iget-object v3, v0, La/tpe0;->h:La/sa10;

    .line 1650
    .line 1651
    sget-object v4, La/pb10;->g:La/pb10;

    .line 1652
    .line 1653
    const/4 v7, 0x0

    .line 1654
    const/16 v8, 0x1c

    .line 1655
    .line 1656
    const v5, 0x7f130677

    .line 1657
    .line 1658
    .line 1659
    const/4 v6, 0x0

    .line 1660
    invoke-static/range {v3 .. v8}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v0

    .line 1664
    invoke-direct {v2, v0}, La/upe0;-><init>(La/ra10;)V

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v1, v9, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1671
    .line 1672
    .line 1673
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1674
    .line 1675
    return-object v0

    .line 1676
    :pswitch_16
    check-cast v0, La/doe0;

    .line 1677
    .line 1678
    iget-object v0, v0, La/doe0;->N1:La/hoe0;

    .line 1679
    .line 1680
    if-eqz v0, :cond_34

    .line 1681
    .line 1682
    iget-object v0, v0, La/hoe0;->c:La/pzu;

    .line 1683
    .line 1684
    invoke-virtual {v0}, La/pzu;->B()V

    .line 1685
    .line 1686
    .line 1687
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1688
    .line 1689
    return-object v0

    .line 1690
    :cond_34
    const-string v0, "viewModel"

    .line 1691
    .line 1692
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1693
    .line 1694
    .line 1695
    throw v9

    .line 1696
    :pswitch_17
    check-cast v0, La/ane0;

    .line 1697
    .line 1698
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 1699
    .line 1700
    iget-object v0, v0, La/ane0;->a:La/us00;

    .line 1701
    .line 1702
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v0

    .line 1706
    invoke-virtual {v0, v5}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    if-eqz v0, :cond_35

    .line 1711
    .line 1712
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1716
    goto :goto_1f

    .line 1717
    :catchall_0
    move-exception v0

    .line 1718
    goto :goto_1e

    .line 1719
    :cond_35
    move-object v0, v9

    .line 1720
    goto :goto_1f

    .line 1721
    :goto_1e
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 1722
    .line 1723
    new-instance v1, La/g0g0;

    .line 1724
    .line 1725
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 1726
    .line 1727
    .line 1728
    move-object v0, v1

    .line 1729
    :goto_1f
    nop

    .line 1730
    instance-of v1, v0, La/g0g0;

    .line 1731
    .line 1732
    if-eqz v1, :cond_36

    .line 1733
    .line 1734
    goto :goto_20

    .line 1735
    :cond_36
    move-object v9, v0

    .line 1736
    :goto_20
    check-cast v9, Ljava/util/Set;

    .line 1737
    .line 1738
    if-nez v9, :cond_37

    .line 1739
    .line 1740
    sget-object v9, La/xun;->a:La/xun;

    .line 1741
    .line 1742
    :cond_37
    return-object v9

    .line 1743
    :pswitch_18
    check-cast v0, La/nme0;

    .line 1744
    .line 1745
    sget-object v1, La/nme0;->Q1:La/lme0;

    .line 1746
    .line 1747
    iget-object v0, v0, La/nme0;->O1:La/fiu0;

    .line 1748
    .line 1749
    if-eqz v0, :cond_38

    .line 1750
    .line 1751
    return-object v0

    .line 1752
    :cond_38
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1753
    .line 1754
    .line 1755
    throw v9

    .line 1756
    :pswitch_19
    check-cast v0, La/ile0;

    .line 1757
    .line 1758
    sget-object v1, La/ile0;->P1:La/gle0;

    .line 1759
    .line 1760
    iget-object v0, v0, La/ile0;->M1:La/fiu0;

    .line 1761
    .line 1762
    if-eqz v0, :cond_39

    .line 1763
    .line 1764
    return-object v0

    .line 1765
    :cond_39
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1766
    .line 1767
    .line 1768
    throw v9

    .line 1769
    :pswitch_1a
    check-cast v0, La/gke0;

    .line 1770
    .line 1771
    iget-object v0, v0, La/gke0;->L1:La/fiu0;

    .line 1772
    .line 1773
    if-eqz v0, :cond_3a

    .line 1774
    .line 1775
    return-object v0

    .line 1776
    :cond_3a
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1777
    .line 1778
    .line 1779
    throw v9

    .line 1780
    :pswitch_1b
    check-cast v0, La/bje0;

    .line 1781
    .line 1782
    sget-object v1, La/bje0;->P1:La/zie0;

    .line 1783
    .line 1784
    iget-object v0, v0, La/bje0;->K1:La/fiu0;

    .line 1785
    .line 1786
    if-eqz v0, :cond_3b

    .line 1787
    .line 1788
    return-object v0

    .line 1789
    :cond_3b
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1790
    .line 1791
    .line 1792
    throw v9

    .line 1793
    :pswitch_1c
    check-cast v0, La/nw20;

    .line 1794
    .line 1795
    iget-object v0, v0, La/nw20;->a:Ljava/lang/Object;

    .line 1796
    .line 1797
    check-cast v0, La/gii0;

    .line 1798
    .line 1799
    const-class v1, La/oie0;

    .line 1800
    .line 1801
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1802
    .line 1803
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v1

    .line 1807
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    check-cast v0, La/oie0;

    .line 1812
    .line 1813
    return-object v0

    .line 1814
    nop

    .line 1815
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
