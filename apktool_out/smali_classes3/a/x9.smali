.class public final synthetic La/x9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/x9;->a:B

    iput-object p1, p0, La/x9;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/x9;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/x9;->a:B

    iput-boolean p1, p0, La/x9;->b:Z

    iput-object p2, p0, La/x9;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x9;->a:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/high16 v5, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    iget-boolean v9, v0, La/x9;->b:Z

    .line 15
    .line 16
    iget-object v10, v0, La/x9;->c:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v10, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$2;

    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, La/k0w0;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v10}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, La/c8d;

    .line 37
    .line 38
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 39
    .line 40
    xor-int/lit8 v2, v9, 0x1

    .line 41
    .line 42
    new-instance v3, La/v7d;

    .line 43
    .line 44
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 45
    .line 46
    .line 47
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 48
    .line 49
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_0
    check-cast v10, La/bo10;

    .line 53
    .line 54
    move-object/from16 v0, p1

    .line 55
    .line 56
    check-cast v0, Ljava/lang/Throwable;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    instance-of v1, v0, Ljava/net/UnknownHostException;

    .line 62
    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    if-nez v9, :cond_0

    .line 66
    .line 67
    invoke-virtual {v10, v0}, La/bo10;->w(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_1
    check-cast v10, La/ef00;

    .line 74
    .line 75
    move-object/from16 v0, p1

    .line 76
    .line 77
    check-cast v0, La/k0w0;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v1, v10, La/ef00;->B:La/m6m0;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v1, Lorg/xplatform/feed/navigation/SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1;

    .line 88
    .line 89
    invoke-direct {v1, v9}, Lorg/xplatform/feed/navigation/SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1;-><init>(Z)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/c8d;

    .line 99
    .line 100
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 101
    .line 102
    new-instance v2, La/v7d;

    .line 103
    .line 104
    invoke-direct {v2, v8, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 105
    .line 106
    .line 107
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 108
    .line 109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_2
    check-cast v10, La/tzi;

    .line 113
    .line 114
    move-object/from16 v0, p1

    .line 115
    .line 116
    check-cast v0, Ljava/lang/Throwable;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    instance-of v1, v0, La/zhi0;

    .line 122
    .line 123
    if-eqz v1, :cond_2

    .line 124
    .line 125
    check-cast v0, La/zhi0;

    .line 126
    .line 127
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 128
    .line 129
    sget-object v1, La/i2o;->D2:La/i2o;

    .line 130
    .line 131
    if-ne v0, v1, :cond_2

    .line 132
    .line 133
    if-eqz v9, :cond_1

    .line 134
    .line 135
    iget-object v0, v10, La/tzi;->j:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v0, La/t4v;

    .line 138
    .line 139
    invoke-virtual {v0}, La/t4v;->a()V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_1
    iget-object v0, v10, La/tzi;->k:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, La/wsc;

    .line 146
    .line 147
    invoke-virtual {v0}, La/wsc;->a()V

    .line 148
    .line 149
    .line 150
    :goto_0
    move v7, v8

    .line 151
    :cond_2
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    return-object v0

    .line 156
    :pswitch_3
    check-cast v10, La/thx;

    .line 157
    .line 158
    move-object/from16 v0, p1

    .line 159
    .line 160
    check-cast v0, La/fee;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Ljava/util/List;

    .line 170
    .line 171
    iget-object v1, v10, La/thx;->d:Ljava/lang/String;

    .line 172
    .line 173
    iget-object v2, v10, La/thx;->a:La/ohx;

    .line 174
    .line 175
    iget-object v2, v2, La/ohx;->e:La/mhx;

    .line 176
    .line 177
    iget-object v2, v2, La/mhx;->a:La/udl0;

    .line 178
    .line 179
    iget-object v3, v10, La/thx;->f:La/n0o0;

    .line 180
    .line 181
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, La/fee;

    .line 186
    .line 187
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, La/aw20;

    .line 192
    .line 193
    invoke-static {v0, v9, v1, v2, v3}, La/q0x;->P(Ljava/util/List;ZLjava/lang/String;La/udl0;La/aw20;)Ljava/util/ArrayList;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :pswitch_4
    check-cast v10, La/daf;

    .line 199
    .line 200
    move-object/from16 v0, p1

    .line 201
    .line 202
    check-cast v0, Ljava/lang/Throwable;

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    instance-of v1, v0, La/zhi0;

    .line 208
    .line 209
    if-eqz v1, :cond_4

    .line 210
    .line 211
    check-cast v0, La/zhi0;

    .line 212
    .line 213
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 214
    .line 215
    sget-object v1, La/i2o;->D2:La/i2o;

    .line 216
    .line 217
    if-ne v0, v1, :cond_4

    .line 218
    .line 219
    if-eqz v9, :cond_3

    .line 220
    .line 221
    iget-object v0, v10, La/daf;->k:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, La/t4v;

    .line 224
    .line 225
    invoke-virtual {v0}, La/t4v;->a()V

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_3
    iget-object v0, v10, La/daf;->l:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, La/wsc;

    .line 232
    .line 233
    invoke-virtual {v0}, La/wsc;->a()V

    .line 234
    .line 235
    .line 236
    :goto_1
    move v7, v8

    .line 237
    :cond_4
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    return-object v0

    .line 242
    :pswitch_5
    check-cast v10, La/ocr;

    .line 243
    .line 244
    move-object/from16 v0, p1

    .line 245
    .line 246
    check-cast v0, Landroid/content/Context;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance v1, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 252
    .line 253
    invoke-direct {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;-><init>(Landroid/content/Context;)V

    .line 254
    .line 255
    .line 256
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 257
    .line 258
    const/4 v2, -0x1

    .line 259
    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->getFixedWebView()La/siq;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-eqz v0, :cond_5

    .line 270
    .line 271
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 272
    .line 273
    invoke-direct {v3, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-virtual {v2, v8}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 284
    .line 285
    .line 286
    invoke-static {v9}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v10}, La/siq;->setFixedWebViewClient(La/tiq;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v4, v6}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v2, v8}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v2, v8}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v8}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v2, v8}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-virtual {v2, v8}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0, v8}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 331
    .line 332
    .line 333
    :cond_5
    return-object v1

    .line 334
    :pswitch_6
    move-object v1, v10

    .line 335
    check-cast v1, La/tqo;

    .line 336
    .line 337
    iget-object v2, v1, La/i3t0;->f:La/oyg0;

    .line 338
    .line 339
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 340
    .line 341
    move-object/from16 v3, p1

    .line 342
    .line 343
    check-cast v3, Ljava/lang/Throwable;

    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    iget-object v4, v1, La/tqo;->z:La/duj;

    .line 349
    .line 350
    new-instance v5, La/x6o;

    .line 351
    .line 352
    const/16 v6, 0xd

    .line 353
    .line 354
    invoke-direct {v5, v6}, La/x6o;-><init>(B)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v4, v3, v5}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 358
    .line 359
    .line 360
    new-instance v15, La/hhe;

    .line 361
    .line 362
    invoke-direct {v15, v3}, La/hhe;-><init>(Ljava/lang/Throwable;)V

    .line 363
    .line 364
    .line 365
    if-eqz v9, :cond_7

    .line 366
    .line 367
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 368
    .line 369
    :cond_6
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    move-object v10, v0

    .line 377
    check-cast v10, La/pqo;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    sget-object v13, La/iun;->a:La/iun;

    .line 383
    .line 384
    const/16 v18, 0x0

    .line 385
    .line 386
    const/16 v19, 0x75f

    .line 387
    .line 388
    const/4 v11, 0x0

    .line 389
    const/4 v12, 0x0

    .line 390
    const/4 v14, 0x0

    .line 391
    const/16 v16, 0x0

    .line 392
    .line 393
    const/16 v17, 0x0

    .line 394
    .line 395
    invoke-static/range {v10 .. v19}, La/pqo;->a(La/pqo;La/swh0;ZLjava/util/List;Ljava/util/List;La/gie;La/gie;Ljava/util/Set;La/gd90;I)La/pqo;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eqz v0, :cond_6

    .line 404
    .line 405
    goto :goto_2

    .line 406
    :cond_7
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 407
    .line 408
    :cond_8
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    move-object v10, v0

    .line 416
    check-cast v10, La/pqo;

    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    sget-object v14, La/iun;->a:La/iun;

    .line 422
    .line 423
    const/16 v18, 0x0

    .line 424
    .line 425
    const/16 v19, 0x6bf

    .line 426
    .line 427
    const/4 v11, 0x0

    .line 428
    const/4 v12, 0x0

    .line 429
    const/4 v13, 0x0

    .line 430
    move-object/from16 v16, v15

    .line 431
    .line 432
    const/4 v15, 0x0

    .line 433
    const/16 v17, 0x0

    .line 434
    .line 435
    invoke-static/range {v10 .. v19}, La/pqo;->a(La/pqo;La/swh0;ZLjava/util/List;Ljava/util/List;La/gie;La/gie;Ljava/util/Set;La/gd90;I)La/pqo;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    move-object/from16 v15, v16

    .line 440
    .line 441
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_8

    .line 446
    .line 447
    :goto_2
    invoke-virtual {v1}, La/tqo;->N()V

    .line 448
    .line 449
    .line 450
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 451
    .line 452
    return-object v0

    .line 453
    :pswitch_7
    check-cast v10, La/hdn;

    .line 454
    .line 455
    move-object/from16 v1, p1

    .line 456
    .line 457
    check-cast v1, La/fee;

    .line 458
    .line 459
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    check-cast v1, Ljava/util/List;

    .line 467
    .line 468
    iget-object v2, v10, La/hdn;->b:La/ctf0;

    .line 469
    .line 470
    iget-object v3, v10, La/hdn;->e:La/n0o0;

    .line 471
    .line 472
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    check-cast v3, La/fee;

    .line 477
    .line 478
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    check-cast v3, Ljava/util/List;

    .line 483
    .line 484
    iget-object v4, v10, La/hdn;->h:Ljava/lang/Object;

    .line 485
    .line 486
    move-object/from16 v17, v4

    .line 487
    .line 488
    check-cast v17, La/udl0;

    .line 489
    .line 490
    iget-object v4, v10, La/hdn;->f:La/n0o0;

    .line 491
    .line 492
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    check-cast v4, La/fee;

    .line 497
    .line 498
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    move-object/from16 v18, v4

    .line 503
    .line 504
    check-cast v18, La/aw20;

    .line 505
    .line 506
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    new-instance v4, Ljava/util/ArrayList;

    .line 519
    .line 520
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 521
    .line 522
    .line 523
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    :cond_9
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    if-eqz v5, :cond_f

    .line 532
    .line 533
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    check-cast v5, La/mu20;

    .line 538
    .line 539
    iget-object v7, v5, La/mu20;->a:Ljava/util/ArrayList;

    .line 540
    .line 541
    iget-object v8, v5, La/mu20;->a:Ljava/util/ArrayList;

    .line 542
    .line 543
    iget-wide v9, v5, La/mu20;->b:J

    .line 544
    .line 545
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 546
    .line 547
    .line 548
    move-result v7

    .line 549
    if-nez v7, :cond_9

    .line 550
    .line 551
    invoke-static {v5}, La/x4d0;->d0(La/qu20;)Z

    .line 552
    .line 553
    .line 554
    move-result v7

    .line 555
    iget-boolean v11, v0, La/x9;->b:Z

    .line 556
    .line 557
    if-eqz v7, :cond_e

    .line 558
    .line 559
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v7

    .line 563
    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 564
    .line 565
    .line 566
    move-result v12

    .line 567
    if-eqz v12, :cond_b

    .line 568
    .line 569
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v12

    .line 573
    move-object v13, v12

    .line 574
    check-cast v13, La/lgr0;

    .line 575
    .line 576
    iget-wide v13, v13, La/lgr0;->a:J

    .line 577
    .line 578
    cmp-long v13, v13, v9

    .line 579
    .line 580
    if-nez v13, :cond_a

    .line 581
    .line 582
    goto :goto_4

    .line 583
    :cond_b
    move-object v12, v6

    .line 584
    :goto_4
    check-cast v12, La/lgr0;

    .line 585
    .line 586
    invoke-static/range {v18 .. v18}, La/uzb;->J0(La/aw20;)La/y9q0;

    .line 587
    .line 588
    .line 589
    move-result-object v7

    .line 590
    invoke-static {v5, v11, v7}, La/sac;->q0(La/mu20;ZLa/y9q0;)La/uv20;

    .line 591
    .line 592
    .line 593
    move-result-object v7

    .line 594
    if-eqz v12, :cond_c

    .line 595
    .line 596
    iget-wide v13, v12, La/lgr0;->b:J

    .line 597
    .line 598
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 599
    .line 600
    .line 601
    move-result-object v11

    .line 602
    goto :goto_5

    .line 603
    :cond_c
    move-object v11, v6

    .line 604
    :goto_5
    if-eqz v12, :cond_d

    .line 605
    .line 606
    iget-wide v12, v12, La/lgr0;->c:D

    .line 607
    .line 608
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 609
    .line 610
    .line 611
    move-result-object v12

    .line 612
    goto :goto_6

    .line 613
    :cond_d
    move-object v12, v6

    .line 614
    :goto_6
    new-instance v13, La/bh;

    .line 615
    .line 616
    iget-wide v14, v5, La/mu20;->b:J

    .line 617
    .line 618
    invoke-static {v8}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 619
    .line 620
    .line 621
    move-result-object v16

    .line 622
    move-object v5, v13

    .line 623
    const/4 v13, 0x0

    .line 624
    invoke-static/range {v11 .. v18}, La/slb;->S(Ljava/lang/Long;Ljava/lang/Double;ZJLjava/util/ArrayList;La/udl0;La/aw20;)La/eao;

    .line 625
    .line 626
    .line 627
    move-result-object v13

    .line 628
    invoke-static {v8}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 629
    .line 630
    .line 631
    move-result-object v8

    .line 632
    invoke-static {v2, v11, v12, v8}, La/x8f;->Z(La/ctf0;Ljava/lang/Long;Ljava/lang/Double;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 633
    .line 634
    .line 635
    move-result-object v8

    .line 636
    invoke-static {v8}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 637
    .line 638
    .line 639
    move-result-object v8

    .line 640
    invoke-direct {v5, v13, v8}, La/bh;-><init>(La/eao;La/a4x;)V

    .line 641
    .line 642
    .line 643
    new-instance v8, La/or20;

    .line 644
    .line 645
    const-string v11, "market_accuracy_group_duel_"

    .line 646
    .line 647
    invoke-static {v9, v10, v11}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v9

    .line 651
    invoke-direct {v8, v7, v5, v9}, La/or20;-><init>(La/uv20;La/bh;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    goto :goto_7

    .line 655
    :cond_e
    invoke-static/range {v18 .. v18}, La/uzb;->J0(La/aw20;)La/y9q0;

    .line 656
    .line 657
    .line 658
    move-result-object v7

    .line 659
    invoke-static {v5, v11, v7}, La/sac;->q0(La/mu20;ZLa/y9q0;)La/uv20;

    .line 660
    .line 661
    .line 662
    move-result-object v7

    .line 663
    iget-wide v12, v5, La/mu20;->b:J

    .line 664
    .line 665
    move-wide/from16 v30, v12

    .line 666
    .line 667
    move-wide v13, v9

    .line 668
    move-wide/from16 v9, v30

    .line 669
    .line 670
    invoke-static/range {v18 .. v18}, La/x8x;->G(La/aw20;)La/qil0;

    .line 671
    .line 672
    .line 673
    move-result-object v12

    .line 674
    move-wide v14, v13

    .line 675
    const/4 v13, 0x0

    .line 676
    invoke-static/range {v8 .. v13}, La/ro4;->j0(Ljava/util/List;JZLa/qil0;La/ovm0;)La/a4x;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    new-instance v8, La/fv20;

    .line 681
    .line 682
    const-string v9, "market_group_duel_"

    .line 683
    .line 684
    invoke-static {v14, v15, v9}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v9

    .line 688
    invoke-direct {v8, v7, v5, v9}, La/fv20;-><init>(La/uv20;La/a4x;Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    :goto_7
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    goto/16 :goto_3

    .line 695
    .line 696
    :cond_f
    return-object v4

    .line 697
    :pswitch_8
    check-cast v10, La/fue;

    .line 698
    .line 699
    move-object/from16 v0, p1

    .line 700
    .line 701
    check-cast v0, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 702
    .line 703
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v10}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setModel(La/fue;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0, v9}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setRtlSupportEnabled(Z)V

    .line 710
    .line 711
    .line 712
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 713
    .line 714
    return-object v0

    .line 715
    :pswitch_9
    check-cast v10, La/oem;

    .line 716
    .line 717
    move-object/from16 v0, p1

    .line 718
    .line 719
    check-cast v0, La/uag0;

    .line 720
    .line 721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    iget-boolean v1, v10, La/oem;->b:Z

    .line 725
    .line 726
    if-eqz v1, :cond_10

    .line 727
    .line 728
    goto :goto_8

    .line 729
    :cond_10
    const/high16 v5, 0x3f000000    # 0.5f

    .line 730
    .line 731
    :goto_8
    invoke-virtual {v0, v5}, La/uag0;->b(F)V

    .line 732
    .line 733
    .line 734
    if-eqz v9, :cond_11

    .line 735
    .line 736
    const/high16 v3, 0x42b40000    # 90.0f

    .line 737
    .line 738
    :cond_11
    invoke-virtual {v0, v3}, La/uag0;->v(F)V

    .line 739
    .line 740
    .line 741
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 742
    .line 743
    return-object v0

    .line 744
    :pswitch_a
    move-object v2, v10

    .line 745
    check-cast v2, La/j4m;

    .line 746
    .line 747
    move-object/from16 v9, p1

    .line 748
    .line 749
    check-cast v9, La/pi9;

    .line 750
    .line 751
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    sget-object v1, La/qmk;->a:La/zcl;

    .line 755
    .line 756
    invoke-virtual {v9}, La/pi9;->getDensity()F

    .line 757
    .line 758
    .line 759
    move-result v1

    .line 760
    mul-float/2addr v1, v5

    .line 761
    iget-object v6, v9, La/pi9;->a:La/y99;

    .line 762
    .line 763
    invoke-interface {v6}, La/y99;->d()J

    .line 764
    .line 765
    .line 766
    move-result-wide v10

    .line 767
    const-wide v12, 0xffffffffL

    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    and-long/2addr v10, v12

    .line 773
    long-to-int v6, v10

    .line 774
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 775
    .line 776
    .line 777
    move-result v6

    .line 778
    const/high16 v10, 0x41400000    # 12.0f

    .line 779
    .line 780
    invoke-virtual {v9}, La/pi9;->getDensity()F

    .line 781
    .line 782
    .line 783
    move-result v11

    .line 784
    mul-float/2addr v11, v10

    .line 785
    sub-float/2addr v6, v11

    .line 786
    const/high16 v10, 0x41000000    # 8.0f

    .line 787
    .line 788
    div-float/2addr v6, v10

    .line 789
    invoke-virtual {v9}, La/pi9;->getDensity()F

    .line 790
    .line 791
    .line 792
    move-result v10

    .line 793
    mul-float/2addr v10, v5

    .line 794
    const/high16 v5, 0x40400000    # 3.0f

    .line 795
    .line 796
    invoke-virtual {v9}, La/pi9;->getDensity()F

    .line 797
    .line 798
    .line 799
    move-result v11

    .line 800
    mul-float/2addr v11, v5

    .line 801
    new-array v4, v4, [F

    .line 802
    .line 803
    aput v10, v4, v7

    .line 804
    .line 805
    aput v11, v4, v8

    .line 806
    .line 807
    invoke-static {v3, v4}, La/qjj;->K(F[F)La/x03;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    move v5, v1

    .line 812
    new-instance v1, La/m4m;

    .line 813
    .line 814
    iget-boolean v4, v0, La/x9;->b:Z

    .line 815
    .line 816
    move/from16 v30, v6

    .line 817
    .line 818
    move-object v6, v3

    .line 819
    move/from16 v3, v30

    .line 820
    .line 821
    invoke-direct/range {v1 .. v6}, La/m4m;-><init>(La/j4m;FZFLa/x03;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v9, v1}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    return-object v0

    .line 829
    :pswitch_b
    check-cast v10, La/gbd0;

    .line 830
    .line 831
    move-object/from16 v0, p1

    .line 832
    .line 833
    check-cast v0, La/n1g;

    .line 834
    .line 835
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    iget-wide v1, v10, La/gbd0;->c:J

    .line 839
    .line 840
    iput-wide v1, v0, La/n1g;->c:J

    .line 841
    .line 842
    sget-object v1, La/j1g;->c:La/j1g;

    .line 843
    .line 844
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 845
    .line 846
    new-instance v1, La/uq2;

    .line 847
    .line 848
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 849
    .line 850
    .line 851
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 852
    .line 853
    sget-object v1, La/l1g;->b:La/l1g;

    .line 854
    .line 855
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 856
    .line 857
    if-eqz v9, :cond_12

    .line 858
    .line 859
    sget-object v1, La/k1g;->c:La/k1g;

    .line 860
    .line 861
    goto :goto_9

    .line 862
    :cond_12
    sget-object v1, La/k1g;->d:La/k1g;

    .line 863
    .line 864
    :goto_9
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 865
    .line 866
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 867
    .line 868
    return-object v0

    .line 869
    :pswitch_c
    check-cast v10, La/jmj;

    .line 870
    .line 871
    move-object/from16 v0, p1

    .line 872
    .line 873
    check-cast v0, La/n1g;

    .line 874
    .line 875
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 876
    .line 877
    .line 878
    iget-wide v1, v10, La/jmj;->b:J

    .line 879
    .line 880
    iput-wide v1, v0, La/n1g;->c:J

    .line 881
    .line 882
    new-instance v1, La/jq2;

    .line 883
    .line 884
    iget-wide v2, v10, La/jmj;->a:J

    .line 885
    .line 886
    invoke-direct {v1, v2, v3}, La/jq2;-><init>(J)V

    .line 887
    .line 888
    .line 889
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 890
    .line 891
    sget-object v1, La/l1g;->b:La/l1g;

    .line 892
    .line 893
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 894
    .line 895
    if-eqz v9, :cond_13

    .line 896
    .line 897
    sget-object v1, La/k1g;->c:La/k1g;

    .line 898
    .line 899
    goto :goto_a

    .line 900
    :cond_13
    sget-object v1, La/k1g;->d:La/k1g;

    .line 901
    .line 902
    :goto_a
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 903
    .line 904
    iput-wide v2, v0, La/n1g;->b:J

    .line 905
    .line 906
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 907
    .line 908
    return-object v0

    .line 909
    :pswitch_d
    check-cast v10, La/kmj;

    .line 910
    .line 911
    move-object/from16 v0, p1

    .line 912
    .line 913
    check-cast v0, La/n1g;

    .line 914
    .line 915
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    iget-wide v1, v10, La/kmj;->a:J

    .line 919
    .line 920
    iput-wide v1, v0, La/n1g;->c:J

    .line 921
    .line 922
    sget-object v1, La/j1g;->b:La/std;

    .line 923
    .line 924
    iget v2, v10, La/kmj;->b:I

    .line 925
    .line 926
    invoke-static {v2}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 931
    .line 932
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    invoke-static {v2}, La/std;->e(I)La/j1g;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 940
    .line 941
    new-instance v1, La/uq2;

    .line 942
    .line 943
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 944
    .line 945
    .line 946
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 947
    .line 948
    sget-object v1, La/l1g;->b:La/l1g;

    .line 949
    .line 950
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 951
    .line 952
    iget-boolean v1, v10, La/kmj;->c:Z

    .line 953
    .line 954
    if-eqz v1, :cond_14

    .line 955
    .line 956
    sget-object v1, La/k1g;->g:La/k1g;

    .line 957
    .line 958
    goto :goto_b

    .line 959
    :cond_14
    if-eqz v9, :cond_15

    .line 960
    .line 961
    sget-object v1, La/k1g;->c:La/k1g;

    .line 962
    .line 963
    goto :goto_b

    .line 964
    :cond_15
    sget-object v1, La/k1g;->d:La/k1g;

    .line 965
    .line 966
    :goto_b
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 967
    .line 968
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 969
    .line 970
    return-object v0

    .line 971
    :pswitch_e
    check-cast v10, La/inj;

    .line 972
    .line 973
    move-object/from16 v0, p1

    .line 974
    .line 975
    check-cast v0, La/n1g;

    .line 976
    .line 977
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    iget-wide v1, v10, La/inj;->c:J

    .line 981
    .line 982
    iput-wide v1, v0, La/n1g;->c:J

    .line 983
    .line 984
    sget-object v1, La/j1g;->c:La/j1g;

    .line 985
    .line 986
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 987
    .line 988
    new-instance v1, La/uq2;

    .line 989
    .line 990
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 991
    .line 992
    .line 993
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 994
    .line 995
    sget-object v1, La/l1g;->b:La/l1g;

    .line 996
    .line 997
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 998
    .line 999
    if-eqz v9, :cond_16

    .line 1000
    .line 1001
    sget-object v1, La/k1g;->c:La/k1g;

    .line 1002
    .line 1003
    goto :goto_c

    .line 1004
    :cond_16
    sget-object v1, La/k1g;->d:La/k1g;

    .line 1005
    .line 1006
    :goto_c
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 1007
    .line 1008
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1009
    .line 1010
    return-object v0

    .line 1011
    :pswitch_f
    check-cast v10, La/jc0;

    .line 1012
    .line 1013
    move-object/from16 v0, p1

    .line 1014
    .line 1015
    check-cast v0, La/k0w0;

    .line 1016
    .line 1017
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    iget-object v1, v10, La/jc0;->l:Ljava/lang/Object;

    .line 1021
    .line 1022
    check-cast v1, La/std;

    .line 1023
    .line 1024
    xor-int/lit8 v2, v9, 0x1

    .line 1025
    .line 1026
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    new-instance v1, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;

    .line 1030
    .line 1031
    invoke-direct {v1, v2}, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;-><init>(Z)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1035
    .line 1036
    .line 1037
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1038
    .line 1039
    return-object v0

    .line 1040
    :pswitch_10
    check-cast v10, La/o6j;

    .line 1041
    .line 1042
    move-object/from16 v1, p1

    .line 1043
    .line 1044
    check-cast v1, La/k0w0;

    .line 1045
    .line 1046
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    iget-object v2, v10, La/o6j;->f:La/uyn;

    .line 1050
    .line 1051
    iget-object v3, v10, La/o6j;->c:La/tru;

    .line 1052
    .line 1053
    iget-object v3, v3, La/tru;->a:La/ali;

    .line 1054
    .line 1055
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    new-instance v8, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 1059
    .line 1060
    const/16 v2, 0xe

    .line 1061
    .line 1062
    const-string v3, "banner_1xGames_day_1"

    .line 1063
    .line 1064
    invoke-direct {v8, v3, v2, v6, v6}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 1065
    .line 1066
    .line 1067
    new-instance v7, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 1068
    .line 1069
    const v9, 0x7f1311a1

    .line 1070
    .line 1071
    .line 1072
    const/4 v10, 0x0

    .line 1073
    iget-boolean v11, v0, La/x9;->b:Z

    .line 1074
    .line 1075
    const/4 v12, 0x0

    .line 1076
    invoke-direct/range {v7 .. v12}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v1, v7}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1080
    .line 1081
    .line 1082
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1083
    .line 1084
    return-object v0

    .line 1085
    :pswitch_11
    check-cast v10, La/wjh;

    .line 1086
    .line 1087
    move-object/from16 v1, p1

    .line 1088
    .line 1089
    check-cast v1, La/k0w0;

    .line 1090
    .line 1091
    iget-object v2, v10, La/wjh;->p:Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 1092
    .line 1093
    iget-object v3, v2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->g:Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 1094
    .line 1095
    sget-object v4, Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;->c:Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 1096
    .line 1097
    if-eq v3, v4, :cond_18

    .line 1098
    .line 1099
    sget-object v5, Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;->b:Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 1100
    .line 1101
    if-ne v3, v5, :cond_17

    .line 1102
    .line 1103
    goto :goto_d

    .line 1104
    :cond_17
    iget-object v0, v10, La/wjh;->q:La/gr00;

    .line 1105
    .line 1106
    new-instance v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 1107
    .line 1108
    iget-wide v4, v2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->j:J

    .line 1109
    .line 1110
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v4

    .line 1114
    iget-wide v7, v2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->m:J

    .line 1115
    .line 1116
    const/4 v5, 0x0

    .line 1117
    iget v6, v2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->l:I

    .line 1118
    .line 1119
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1123
    .line 1124
    .line 1125
    new-instance v2, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 1126
    .line 1127
    invoke-direct {v2, v3, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_f

    .line 1131
    :cond_18
    :goto_d
    iget-object v5, v10, La/wjh;->r:La/qv2;

    .line 1132
    .line 1133
    sget-object v22, Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;->c:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 1134
    .line 1135
    sget-object v23, La/grs;->b:La/grs;

    .line 1136
    .line 1137
    sget-object v26, La/ors;->a:La/ors;

    .line 1138
    .line 1139
    sget-object v29, La/k1g;->h:La/k1g;

    .line 1140
    .line 1141
    iget-wide v10, v2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->j:J

    .line 1142
    .line 1143
    iget-wide v12, v2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->m:J

    .line 1144
    .line 1145
    if-ne v3, v4, :cond_19

    .line 1146
    .line 1147
    move/from16 v21, v8

    .line 1148
    .line 1149
    goto :goto_e

    .line 1150
    :cond_19
    move/from16 v21, v7

    .line 1151
    .line 1152
    :goto_e
    new-instance v9, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 1153
    .line 1154
    move-wide/from16 v16, v12

    .line 1155
    .line 1156
    const-wide/16 v12, 0x0

    .line 1157
    .line 1158
    const-wide/16 v14, 0x28

    .line 1159
    .line 1160
    iget-boolean v0, v0, La/x9;->b:Z

    .line 1161
    .line 1162
    const-wide/16 v19, 0x0

    .line 1163
    .line 1164
    const-string v24, "main_screen"

    .line 1165
    .line 1166
    const-string v25, ""

    .line 1167
    .line 1168
    const/16 v27, 0x0

    .line 1169
    .line 1170
    const/16 v28, 0x0

    .line 1171
    .line 1172
    move/from16 v18, v0

    .line 1173
    .line 1174
    invoke-direct/range {v9 .. v29}, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;-><init>(JJJJZJZLorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;La/grs;Ljava/lang/String;Ljava/lang/String;La/ors;IZLa/k1g;)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v5, v9}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v2

    .line 1181
    :goto_f
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1182
    .line 1183
    .line 1184
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1185
    .line 1186
    return-object v0

    .line 1187
    :pswitch_12
    check-cast v10, La/r7f;

    .line 1188
    .line 1189
    move-object/from16 v0, p1

    .line 1190
    .line 1191
    check-cast v0, Ljava/lang/Long;

    .line 1192
    .line 1193
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1194
    .line 1195
    .line 1196
    move-result-wide v0

    .line 1197
    if-eqz v9, :cond_1b

    .line 1198
    .line 1199
    const-wide/16 v3, 0x0

    .line 1200
    .line 1201
    cmp-long v0, v0, v3

    .line 1202
    .line 1203
    if-eqz v0, :cond_1a

    .line 1204
    .line 1205
    iget-object v0, v10, La/r7f;->G1:La/bby;

    .line 1206
    .line 1207
    if-eqz v0, :cond_1a

    .line 1208
    .line 1209
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 1210
    .line 1211
    .line 1212
    move-result v0

    .line 1213
    if-nez v0, :cond_1a

    .line 1214
    .line 1215
    invoke-virtual {v10}, La/r7f;->c0()V

    .line 1216
    .line 1217
    .line 1218
    iget-object v0, v10, La/r7f;->F1:La/bby;

    .line 1219
    .line 1220
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 1221
    .line 1222
    .line 1223
    new-instance v0, La/x5f;

    .line 1224
    .line 1225
    invoke-direct {v0, v2}, La/x5f;-><init>(B)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v10, v7, v8, v0}, La/r7f;->h0(ZZLkotlin/jvm/functions/Function0;)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v10}, La/r7f;->X()V

    .line 1232
    .line 1233
    .line 1234
    :cond_1a
    invoke-virtual {v10}, La/r7f;->m0()V

    .line 1235
    .line 1236
    .line 1237
    :cond_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1238
    .line 1239
    return-object v0

    .line 1240
    :pswitch_13
    check-cast v10, La/kyd;

    .line 1241
    .line 1242
    move-object/from16 v1, p1

    .line 1243
    .line 1244
    check-cast v1, La/k0w0;

    .line 1245
    .line 1246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1247
    .line 1248
    .line 1249
    iget-object v2, v10, La/kyd;->g:La/mi70;

    .line 1250
    .line 1251
    iget-object v3, v10, La/kyd;->p:Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;

    .line 1252
    .line 1253
    check-cast v3, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;

    .line 1254
    .line 1255
    iget-object v5, v3, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;->a:Ljava/lang/String;

    .line 1256
    .line 1257
    iget-object v6, v3, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;->d:La/swp0;

    .line 1258
    .line 1259
    iget-object v7, v3, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;->e:Ljava/util/List;

    .line 1260
    .line 1261
    iget-object v8, v3, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;->f:Ljava/util/List;

    .line 1262
    .line 1263
    iget-object v13, v3, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;->g:La/we50;

    .line 1264
    .line 1265
    iget-object v11, v3, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;->c:Ljava/lang/String;

    .line 1266
    .line 1267
    iget-object v10, v3, Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;->b:Ljava/lang/String;

    .line 1268
    .line 1269
    new-instance v4, La/aci0;

    .line 1270
    .line 1271
    const/4 v9, 0x1

    .line 1272
    iget-boolean v12, v0, La/x9;->b:Z

    .line 1273
    .line 1274
    invoke-direct/range {v4 .. v13}, La/aci0;-><init>(Ljava/lang/String;La/swp0;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLa/we50;)V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1278
    .line 1279
    .line 1280
    new-instance v0, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 1281
    .line 1282
    invoke-direct {v0, v4}, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;-><init>(La/dci0;)V

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 1286
    .line 1287
    .line 1288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1289
    .line 1290
    return-object v0

    .line 1291
    :pswitch_14
    check-cast v10, La/svd;

    .line 1292
    .line 1293
    move-object/from16 v1, p1

    .line 1294
    .line 1295
    check-cast v1, La/k0w0;

    .line 1296
    .line 1297
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1298
    .line 1299
    .line 1300
    iget-object v2, v10, La/svd;->p:La/mi70;

    .line 1301
    .line 1302
    iget-object v3, v10, La/svd;->d:La/oud;

    .line 1303
    .line 1304
    iget-object v12, v3, La/oud;->a:Ljava/lang/String;

    .line 1305
    .line 1306
    new-instance v13, La/swp0;

    .line 1307
    .line 1308
    iget-object v4, v3, La/oud;->c:Ljava/lang/String;

    .line 1309
    .line 1310
    iget-object v5, v10, La/svd;->G:Ljava/lang/String;

    .line 1311
    .line 1312
    invoke-direct {v13, v4, v5, v7}, La/swp0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1313
    .line 1314
    .line 1315
    iget v14, v3, La/oud;->d:I

    .line 1316
    .line 1317
    iget-object v4, v3, La/oud;->f:Ljava/lang/String;

    .line 1318
    .line 1319
    iget-object v15, v3, La/oud;->g:Ljava/util/List;

    .line 1320
    .line 1321
    iget-object v5, v3, La/oud;->h:Ljava/util/List;

    .line 1322
    .line 1323
    iget-object v3, v3, La/oud;->e:La/we50;

    .line 1324
    .line 1325
    new-instance v11, La/vbi0;

    .line 1326
    .line 1327
    const/16 v17, 0x0

    .line 1328
    .line 1329
    iget-boolean v0, v0, La/x9;->b:Z

    .line 1330
    .line 1331
    move/from16 v18, v0

    .line 1332
    .line 1333
    move-object/from16 v20, v3

    .line 1334
    .line 1335
    move-object/from16 v19, v4

    .line 1336
    .line 1337
    move-object/from16 v16, v5

    .line 1338
    .line 1339
    invoke-direct/range {v11 .. v20}, La/vbi0;-><init>(Ljava/lang/String;La/swp0;ILjava/util/List;Ljava/util/List;ZZLjava/lang/String;La/we50;)V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1343
    .line 1344
    .line 1345
    new-instance v0, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 1346
    .line 1347
    invoke-direct {v0, v11}, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;-><init>(La/dci0;)V

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 1351
    .line 1352
    .line 1353
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1354
    .line 1355
    return-object v0

    .line 1356
    :pswitch_15
    check-cast v10, La/f3d;

    .line 1357
    .line 1358
    move-object/from16 v0, p1

    .line 1359
    .line 1360
    check-cast v0, La/uag0;

    .line 1361
    .line 1362
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v0, v8}, La/uag0;->h(I)V

    .line 1366
    .line 1367
    .line 1368
    if-eqz v9, :cond_1c

    .line 1369
    .line 1370
    invoke-virtual {v10}, La/f3d;->d()F

    .line 1371
    .line 1372
    .line 1373
    move-result v5

    .line 1374
    :cond_1c
    invoke-virtual {v0, v5}, La/uag0;->b(F)V

    .line 1375
    .line 1376
    .line 1377
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1378
    .line 1379
    return-object v0

    .line 1380
    :pswitch_16
    check-cast v10, La/g9a;

    .line 1381
    .line 1382
    move-object/from16 v0, p1

    .line 1383
    .line 1384
    check-cast v0, La/pz2;

    .line 1385
    .line 1386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1387
    .line 1388
    .line 1389
    new-instance v1, La/a9a;

    .line 1390
    .line 1391
    invoke-direct {v1, v0, v10}, La/a9a;-><init>(La/pz2;La/g9a;)V

    .line 1392
    .line 1393
    .line 1394
    new-instance v2, La/j9a;

    .line 1395
    .line 1396
    iget-object v3, v10, La/g9a;->n:La/n8a;

    .line 1397
    .line 1398
    iget-object v0, v0, La/pz2;->a:Landroid/hardware/camera2/CaptureResult;

    .line 1399
    .line 1400
    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureResult;->getFrameNumber()J

    .line 1401
    .line 1402
    .line 1403
    invoke-direct {v2, v3, v1}, La/j9a;-><init>(La/gnf0;La/b7r;)V

    .line 1404
    .line 1405
    .line 1406
    invoke-static {v2, v9}, La/oke;->a(La/j9a;Z)Z

    .line 1407
    .line 1408
    .line 1409
    move-result v0

    .line 1410
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    return-object v0

    .line 1415
    :pswitch_17
    check-cast v10, La/ld8;

    .line 1416
    .line 1417
    move-object/from16 v0, p1

    .line 1418
    .line 1419
    check-cast v0, Ljava/lang/Throwable;

    .line 1420
    .line 1421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v10, v0, v9}, La/ld8;->O(Ljava/lang/Throwable;Z)V

    .line 1425
    .line 1426
    .line 1427
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1428
    .line 1429
    return-object v0

    .line 1430
    :pswitch_18
    check-cast v10, La/t33;

    .line 1431
    .line 1432
    move-object/from16 v0, p1

    .line 1433
    .line 1434
    check-cast v0, La/uag0;

    .line 1435
    .line 1436
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1437
    .line 1438
    .line 1439
    if-eqz v9, :cond_1d

    .line 1440
    .line 1441
    const/high16 v5, -0x40800000    # -1.0f

    .line 1442
    .line 1443
    :cond_1d
    invoke-virtual {v0, v5}, La/uag0;->w(F)V

    .line 1444
    .line 1445
    .line 1446
    invoke-virtual {v10}, La/t33;->d()Ljava/lang/Object;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v1

    .line 1450
    check-cast v1, Ljava/lang/Number;

    .line 1451
    .line 1452
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1453
    .line 1454
    .line 1455
    move-result v1

    .line 1456
    cmpg-float v2, v1, v3

    .line 1457
    .line 1458
    if-gez v2, :cond_1e

    .line 1459
    .line 1460
    goto :goto_10

    .line 1461
    :cond_1e
    move v3, v1

    .line 1462
    :goto_10
    neg-float v1, v3

    .line 1463
    const/high16 v2, 0x41600000    # 14.0f

    .line 1464
    .line 1465
    div-float/2addr v1, v2

    .line 1466
    sget v2, La/t18;->f:F

    .line 1467
    .line 1468
    iget-object v3, v0, La/uag0;->t:La/w6k;

    .line 1469
    .line 1470
    invoke-interface {v3}, La/w6k;->getDensity()F

    .line 1471
    .line 1472
    .line 1473
    move-result v3

    .line 1474
    mul-float/2addr v3, v2

    .line 1475
    mul-float/2addr v3, v1

    .line 1476
    invoke-virtual {v0, v3}, La/uag0;->I(F)V

    .line 1477
    .line 1478
    .line 1479
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1480
    .line 1481
    return-object v0

    .line 1482
    :pswitch_19
    check-cast v10, La/uhd;

    .line 1483
    .line 1484
    move-object/from16 v0, p1

    .line 1485
    .line 1486
    check-cast v0, La/nlz;

    .line 1487
    .line 1488
    iget-object v1, v10, La/c2;->a:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v1, La/v62;

    .line 1491
    .line 1492
    invoke-virtual {v1, v9}, La/eg60;->f(Z)V

    .line 1493
    .line 1494
    .line 1495
    iget-object v1, v10, La/c2;->b:Ljava/lang/Object;

    .line 1496
    .line 1497
    check-cast v1, La/qb5;

    .line 1498
    .line 1499
    invoke-virtual {v1, v9}, La/af50;->i(Z)V

    .line 1500
    .line 1501
    .line 1502
    new-instance v1, La/ub5;

    .line 1503
    .line 1504
    invoke-direct {v1, v0, v10, v7}, La/ub5;-><init>(La/nlz;Ljava/lang/Object;B)V

    .line 1505
    .line 1506
    .line 1507
    return-object v1

    .line 1508
    :pswitch_1a
    check-cast v10, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 1509
    .line 1510
    move-object/from16 v0, p1

    .line 1511
    .line 1512
    check-cast v0, La/k0w0;

    .line 1513
    .line 1514
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v0, v6}, La/k0w0;->c(La/m7h0;)V

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual {v0, v10}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v0

    .line 1524
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1525
    .line 1526
    check-cast v0, La/c8d;

    .line 1527
    .line 1528
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1529
    .line 1530
    new-instance v2, La/nqd;

    .line 1531
    .line 1532
    invoke-direct {v2, v4}, La/nqd;-><init>(B)V

    .line 1533
    .line 1534
    .line 1535
    iput-boolean v7, v2, La/nqd;->b:Z

    .line 1536
    .line 1537
    invoke-virtual {v2}, La/nqd;->d()La/bjk;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v2

    .line 1541
    new-instance v3, La/v7d;

    .line 1542
    .line 1543
    invoke-direct {v3, v9, v1, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1544
    .line 1545
    .line 1546
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 1547
    .line 1548
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1549
    .line 1550
    return-object v0

    .line 1551
    :pswitch_1b
    check-cast v10, La/zy;

    .line 1552
    .line 1553
    move-object/from16 v0, p1

    .line 1554
    .line 1555
    check-cast v0, La/hcz;

    .line 1556
    .line 1557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1558
    .line 1559
    .line 1560
    iget-object v1, v10, La/zy;->a:La/a4x;

    .line 1561
    .line 1562
    new-instance v3, La/b5;

    .line 1563
    .line 1564
    invoke-direct {v3, v2}, La/b5;-><init>(B)V

    .line 1565
    .line 1566
    .line 1567
    new-instance v4, La/b5;

    .line 1568
    .line 1569
    const/16 v5, 0x9

    .line 1570
    .line 1571
    invoke-direct {v4, v5}, La/b5;-><init>(B)V

    .line 1572
    .line 1573
    .line 1574
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1575
    .line 1576
    .line 1577
    move-result v5

    .line 1578
    new-instance v6, La/g5;

    .line 1579
    .line 1580
    const/4 v11, 0x7

    .line 1581
    invoke-direct {v6, v3, v1, v11}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1582
    .line 1583
    .line 1584
    new-instance v3, La/g5;

    .line 1585
    .line 1586
    invoke-direct {v3, v4, v1, v2}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1587
    .line 1588
    .line 1589
    new-instance v2, La/gx;

    .line 1590
    .line 1591
    invoke-direct {v2, v1, v9, v10, v7}, La/gx;-><init>(Ljava/util/List;ZLjava/lang/Object;B)V

    .line 1592
    .line 1593
    .line 1594
    new-instance v1, La/ugd;

    .line 1595
    .line 1596
    const v4, 0x2fd4df92

    .line 1597
    .line 1598
    .line 1599
    invoke-direct {v1, v4, v8, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v0, v5, v6, v3, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1603
    .line 1604
    .line 1605
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1606
    .line 1607
    return-object v0

    .line 1608
    :pswitch_1c
    check-cast v10, La/ab;

    .line 1609
    .line 1610
    move-object/from16 v0, p1

    .line 1611
    .line 1612
    check-cast v0, La/k0w0;

    .line 1613
    .line 1614
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1615
    .line 1616
    .line 1617
    iget-object v1, v10, La/ab;->I:La/m6m0;

    .line 1618
    .line 1619
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1620
    .line 1621
    .line 1622
    new-instance v1, Lorg/xplatform/feed/navigation/SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1;

    .line 1623
    .line 1624
    invoke-direct {v1, v9}, Lorg/xplatform/feed/navigation/SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1;-><init>(Z)V

    .line 1625
    .line 1626
    .line 1627
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v0

    .line 1631
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1632
    .line 1633
    check-cast v0, La/c8d;

    .line 1634
    .line 1635
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1636
    .line 1637
    new-instance v2, La/v7d;

    .line 1638
    .line 1639
    invoke-direct {v2, v8, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1640
    .line 1641
    .line 1642
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 1643
    .line 1644
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1645
    .line 1646
    return-object v0

    .line 1647
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
