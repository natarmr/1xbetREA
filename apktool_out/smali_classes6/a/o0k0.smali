.class public final synthetic La/o0k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/lgn0;La/v1r;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)V
    .locals 0

    .line 1
    const/16 p1, 0x11

    iput-byte p1, p0, La/o0k0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/o0k0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/o0k0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/o0k0;->a:B

    iput-object p1, p0, La/o0k0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/o0k0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o0k0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, v0, La/o0k0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, La/o0k0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    check-cast v6, La/x1z;

    .line 20
    .line 21
    iget-object v1, v6, La/x1z;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    check-cast v6, La/m9p0;

    .line 32
    .line 33
    new-instance v1, La/e8p0;

    .line 34
    .line 35
    iget-object v2, v6, La/m9p0;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v1, v2}, La/e8p0;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 47
    .line 48
    check-cast v6, La/y4p0;

    .line 49
    .line 50
    iget v1, v6, La/y4p0;->a:I

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_2
    check-cast v0, La/oxo0;

    .line 63
    .line 64
    check-cast v6, La/pxo0;

    .line 65
    .line 66
    sget-object v1, La/oxo0;->q2:La/s2m0;

    .line 67
    .line 68
    iget-object v0, v0, La/oxo0;->p2:La/a8z;

    .line 69
    .line 70
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, La/k3t0;

    .line 75
    .line 76
    new-instance v1, La/kxo0;

    .line 77
    .line 78
    iget-object v2, v6, La/pxo0;->a:La/bop0;

    .line 79
    .line 80
    invoke-direct {v1, v2}, La/kxo0;-><init>(La/bop0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 90
    .line 91
    check-cast v6, La/qgv0;

    .line 92
    .line 93
    iget-object v1, v6, La/qgv0;->f:Ljava/lang/String;

    .line 94
    .line 95
    new-instance v2, La/i37;

    .line 96
    .line 97
    invoke-direct {v2, v1}, La/i37;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 107
    .line 108
    check-cast v6, La/elo0;

    .line 109
    .line 110
    iget-object v1, v6, La/elo0;->g:Ljava/lang/String;

    .line 111
    .line 112
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_5
    check-cast v0, Ljava/lang/String;

    .line 119
    .line 120
    check-cast v6, La/d9z;

    .line 121
    .line 122
    new-instance v1, La/d2d;

    .line 123
    .line 124
    invoke-virtual {v6}, La/d9z;->c()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-direct {v1, v0, v2}, La/d2d;-><init>(Ljava/lang/String;Z)V

    .line 129
    .line 130
    .line 131
    return-object v1

    .line 132
    :pswitch_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    check-cast v6, La/t3q;

    .line 135
    .line 136
    new-instance v1, La/mvn0;

    .line 137
    .line 138
    invoke-direct {v1, v6}, La/mvn0;-><init>(La/t3q;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_7
    check-cast v0, La/vzg0;

    .line 148
    .line 149
    move-object v7, v6

    .line 150
    check-cast v7, La/g2v;

    .line 151
    .line 152
    sget-object v1, La/iun;->a:La/iun;

    .line 153
    .line 154
    sget-object v2, La/rzg0;->b:La/rzg0;

    .line 155
    .line 156
    const-class v3, La/epn0;

    .line 157
    .line 158
    invoke-static {v3}, La/sre0;->a(Ljava/lang/Class;)La/kiy;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    sget-object v5, Lkotlin/reflect/KTypeProjection;->c:La/piy;

    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {v3}, La/piy;->a(La/kiy;)Lkotlin/reflect/KTypeProjection;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    sget-object v5, La/sre0;->a:La/tre0;

    .line 172
    .line 173
    const-class v6, Ljava/util/List;

    .line 174
    .line 175
    invoke-virtual {v5, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v5, v8, v3, v4}, La/tre0;->k(La/sgy;Ljava/util/List;Z)La/kiy;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-static {v3}, La/n6x;->b0(La/kiy;)La/jiy;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    const-string v8, "CHAMPS_KEY"

    .line 192
    .line 193
    invoke-static {v0, v8, v3, v2}, La/a8k0;->y(La/vzg0;Ljava/lang/String;La/jiy;La/rzg0;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    if-nez v3, :cond_0

    .line 198
    .line 199
    move-object v3, v1

    .line 200
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 201
    .line 202
    const-class v8, La/hpn0;

    .line 203
    .line 204
    invoke-static {v8}, La/sre0;->a(Ljava/lang/Class;)La/kiy;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-static {v8}, La/piy;->a(La/kiy;)Lkotlin/reflect/KTypeProjection;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    invoke-virtual {v5, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-virtual {v5, v6, v8, v4}, La/tre0;->k(La/sgy;Ljava/util/List;Z)La/kiy;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-static {v6}, La/n6x;->b0(La/kiy;)La/jiy;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    const-string v8, "SPORTS_KEY"

    .line 229
    .line 230
    invoke-static {v0, v8, v6, v2}, La/a8k0;->y(La/vzg0;Ljava/lang/String;La/jiy;La/rzg0;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    if-nez v6, :cond_1

    .line 235
    .line 236
    goto :goto_0

    .line 237
    :cond_1
    move-object v1, v6

    .line 238
    :goto_0
    check-cast v1, Ljava/util/List;

    .line 239
    .line 240
    sget-object v6, La/xun;->a:La/xun;

    .line 241
    .line 242
    const-class v8, La/roo;

    .line 243
    .line 244
    invoke-static {v8}, La/sre0;->a(Ljava/lang/Class;)La/kiy;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    invoke-static {v8}, La/piy;->a(La/kiy;)Lkotlin/reflect/KTypeProjection;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    const-class v9, Ljava/util/Set;

    .line 253
    .line 254
    invoke-virtual {v5, v9}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    invoke-virtual {v5, v9, v8, v4}, La/tre0;->k(La/sgy;Ljava/util/List;Z)La/kiy;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-static {v4}, La/n6x;->b0(La/kiy;)La/jiy;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    const-string v5, "EXPANDED_IDS_KEY"

    .line 271
    .line 272
    invoke-static {v0, v5, v4, v2}, La/a8k0;->y(La/vzg0;Ljava/lang/String;La/jiy;La/rzg0;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    if-nez v0, :cond_2

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_2
    move-object v6, v0

    .line 280
    :goto_1
    check-cast v6, Ljava/util/Set;

    .line 281
    .line 282
    sget-object v8, La/pb10;->g:La/pb10;

    .line 283
    .line 284
    const-wide/16 v18, 0x0

    .line 285
    .line 286
    const/16 v20, 0x25e

    .line 287
    .line 288
    const/4 v9, 0x0

    .line 289
    const/4 v10, 0x0

    .line 290
    const/4 v11, 0x0

    .line 291
    const/4 v12, 0x0

    .line 292
    const v13, 0x7f130677

    .line 293
    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    const v15, 0x7f131690

    .line 297
    .line 298
    .line 299
    const-wide/16 v16, 0x2710

    .line 300
    .line 301
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 302
    .line 303
    .line 304
    move-result-object v16

    .line 305
    new-instance v8, La/gvn0;

    .line 306
    .line 307
    const/4 v9, 0x0

    .line 308
    const/4 v10, 0x1

    .line 309
    move-object v14, v1

    .line 310
    move-object v13, v3

    .line 311
    move-object v15, v6

    .line 312
    invoke-direct/range {v8 .. v16}, La/gvn0;-><init>(ZZZZLjava/util/List;Ljava/util/List;Ljava/util/Set;La/mdm;)V

    .line 313
    .line 314
    .line 315
    return-object v8

    .line 316
    :pswitch_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 317
    .line 318
    check-cast v6, La/b3q;

    .line 319
    .line 320
    new-instance v1, La/kvn0;

    .line 321
    .line 322
    invoke-direct {v1, v6}, La/kvn0;-><init>(La/b3q;)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object v0

    .line 331
    :pswitch_9
    check-cast v0, La/hln0;

    .line 332
    .line 333
    check-cast v6, Ljava/util/List;

    .line 334
    .line 335
    sget-object v1, La/vrm0;->a:La/u15;

    .line 336
    .line 337
    iget-object v0, v0, La/hln0;->a:La/c1a;

    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 343
    .line 344
    const/16 v2, 0x21

    .line 345
    .line 346
    if-ge v1, v2, :cond_3

    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_3
    invoke-static {}, La/uq6;->e()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    check-cast v0, La/ow9;

    .line 357
    .line 358
    invoke-virtual {v0, v1}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    check-cast v0, [J

    .line 363
    .line 364
    if-eqz v0, :cond_7

    .line 365
    .line 366
    array-length v1, v0

    .line 367
    if-nez v1, :cond_4

    .line 368
    .line 369
    goto :goto_3

    .line 370
    :cond_4
    new-instance v1, Ljava/util/HashSet;

    .line 371
    .line 372
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 373
    .line 374
    .line 375
    array-length v2, v0

    .line 376
    move v3, v5

    .line 377
    :goto_2
    if-ge v3, v2, :cond_5

    .line 378
    .line 379
    aget-wide v7, v0, v3

    .line 380
    .line 381
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    add-int/lit8 v3, v3, 0x1

    .line 389
    .line 390
    goto :goto_2

    .line 391
    :cond_5
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-eqz v2, :cond_8

    .line 400
    .line 401
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    check-cast v2, La/wln0;

    .line 406
    .line 407
    iget-object v2, v2, La/wln0;->c:La/urm0;

    .line 408
    .line 409
    iget-wide v2, v2, La/urm0;->a:J

    .line 410
    .line 411
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-nez v2, :cond_6

    .line 420
    .line 421
    :cond_7
    :goto_3
    move v4, v5

    .line 422
    :cond_8
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    return-object v0

    .line 427
    :pswitch_a
    check-cast v0, Landroid/content/Context;

    .line 428
    .line 429
    check-cast v6, La/wgn0;

    .line 430
    .line 431
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 432
    .line 433
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v5}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 437
    .line 438
    .line 439
    iget v2, v6, La/wgn0;->h:F

    .line 440
    .line 441
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 442
    .line 443
    .line 444
    const v2, 0x7f040ae1

    .line 445
    .line 446
    .line 447
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 452
    .line 453
    .line 454
    new-instance v2, Landroid/view/View;

    .line 455
    .line 456
    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 457
    .line 458
    .line 459
    invoke-static {}, La/jmu0;->d()I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    invoke-virtual {v2, v0}, Landroid/view/View;->setId(I)V

    .line 464
    .line 465
    .line 466
    const-string v0, "contentBackground"

    .line 467
    .line 468
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 472
    .line 473
    .line 474
    return-object v2

    .line 475
    :pswitch_b
    check-cast v0, La/v1r;

    .line 476
    .line 477
    check-cast v6, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 478
    .line 479
    invoke-static {v0}, La/lgn0;->a(La/v1r;)Landroidx/fragment/app/Fragment;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    if-eqz v0, :cond_a

    .line 484
    .line 485
    sget-object v1, La/ghn0;->a:La/ghn0;

    .line 486
    .line 487
    iget-object v1, v6, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->c:Ljava/lang/String;

    .line 488
    .line 489
    if-eqz v1, :cond_a

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-nez v2, :cond_9

    .line 496
    .line 497
    goto :goto_4

    .line 498
    :cond_9
    const-string v2, "HISTORY"

    .line 499
    .line 500
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 505
    .line 506
    new-instance v4, Lkotlin/Pair;

    .line 507
    .line 508
    invoke-direct {v4, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    iget-object v2, v6, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->d:Ljava/lang/Long;

    .line 512
    .line 513
    new-instance v3, Lkotlin/Pair;

    .line 514
    .line 515
    const-string v5, "BALANCE_ID"

    .line 516
    .line 517
    invoke-direct {v3, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    iget-object v2, v6, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;->e:Ljava/lang/String;

    .line 521
    .line 522
    new-instance v5, Lkotlin/Pair;

    .line 523
    .line 524
    const-string v6, "BET_MODE"

    .line 525
    .line 526
    invoke-direct {v5, v6, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    filled-new-array {v4, v3, v5}, [Lkotlin/Pair;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    :cond_a
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_c
    check-cast v0, La/m0n0;

    .line 544
    .line 545
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 546
    .line 547
    instance-of v1, v0, La/r0n0;

    .line 548
    .line 549
    if-eqz v1, :cond_b

    .line 550
    .line 551
    new-instance v1, La/yzm0;

    .line 552
    .line 553
    check-cast v0, La/r0n0;

    .line 554
    .line 555
    invoke-direct {v1, v0}, La/yzm0;-><init>(La/r0n0;)V

    .line 556
    .line 557
    .line 558
    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 562
    .line 563
    return-object v0

    .line 564
    :pswitch_d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 565
    .line 566
    check-cast v6, La/g0n0;

    .line 567
    .line 568
    new-instance v1, La/xzm0;

    .line 569
    .line 570
    invoke-direct {v1, v6}, La/xzm0;-><init>(La/g0n0;)V

    .line 571
    .line 572
    .line 573
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_e
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 580
    .line 581
    check-cast v6, La/a0z;

    .line 582
    .line 583
    invoke-interface {v0, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    return-object v0

    .line 589
    :pswitch_f
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 590
    .line 591
    check-cast v6, La/ojc;

    .line 592
    .line 593
    new-instance v1, La/gvl0;

    .line 594
    .line 595
    iget-object v2, v6, La/ojc;->a:Ljava/lang/String;

    .line 596
    .line 597
    invoke-direct {v1, v2}, La/gvl0;-><init>(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_10
    check-cast v0, La/vzg0;

    .line 607
    .line 608
    check-cast v6, La/vjp;

    .line 609
    .line 610
    const-string v1, "SAVED_STATE_SEARCH_EXPANDED"

    .line 611
    .line 612
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    check-cast v1, Ljava/lang/Boolean;

    .line 617
    .line 618
    if-eqz v1, :cond_c

    .line 619
    .line 620
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 621
    .line 622
    .line 623
    move-result v5

    .line 624
    :cond_c
    move v10, v5

    .line 625
    const-string v1, "SAVED_STATE_SEARCH_QUERY"

    .line 626
    .line 627
    invoke-virtual {v0, v1}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    check-cast v0, Ljava/lang/String;

    .line 632
    .line 633
    if-nez v0, :cond_d

    .line 634
    .line 635
    const-string v0, ""

    .line 636
    .line 637
    :cond_d
    move-object v12, v0

    .line 638
    iget-object v0, v6, La/vjp;->a:La/pru;

    .line 639
    .line 640
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    iget-object v0, v0, La/sff0;->L:La/rib0;

    .line 645
    .line 646
    iget v15, v0, La/rib0;->c:I

    .line 647
    .line 648
    new-instance v7, La/lsl0;

    .line 649
    .line 650
    sget-object v8, La/iun;->a:La/iun;

    .line 651
    .line 652
    xor-int/lit8 v20, v10, 0x1

    .line 653
    .line 654
    const/4 v11, 0x1

    .line 655
    const/4 v13, 0x1

    .line 656
    const/4 v14, 0x0

    .line 657
    const/16 v16, 0x0

    .line 658
    .line 659
    const/16 v17, 0x0

    .line 660
    .line 661
    move-object v9, v8

    .line 662
    move-object/from16 v18, v8

    .line 663
    .line 664
    move-object/from16 v19, v8

    .line 665
    .line 666
    invoke-direct/range {v7 .. v20}, La/lsl0;-><init>(Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;ZZIZZLjava/util/List;Ljava/util/List;Z)V

    .line 667
    .line 668
    .line 669
    return-object v7

    .line 670
    :pswitch_11
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 671
    .line 672
    check-cast v6, La/ofh0;

    .line 673
    .line 674
    iget-boolean v1, v6, La/ofh0;->c:Z

    .line 675
    .line 676
    new-instance v2, La/rol0;

    .line 677
    .line 678
    invoke-direct {v2, v1}, La/rol0;-><init>(Z)V

    .line 679
    .line 680
    .line 681
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 685
    .line 686
    return-object v0

    .line 687
    :pswitch_12
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 688
    .line 689
    check-cast v6, La/usm;

    .line 690
    .line 691
    if-eqz v0, :cond_e

    .line 692
    .line 693
    invoke-interface {v0, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    :cond_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 697
    .line 698
    return-object v0

    .line 699
    :pswitch_13
    check-cast v0, Landroid/content/Context;

    .line 700
    .line 701
    check-cast v6, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;

    .line 702
    .line 703
    sget v1, Lorg/xplatform/uikit_sport/sport_collection/SportCollectionItem;->c:I

    .line 704
    .line 705
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    const v1, 0x7f0d058d

    .line 710
    .line 711
    .line 712
    invoke-virtual {v0, v1, v6, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 717
    .line 718
    .line 719
    move-object v1, v0

    .line 720
    check-cast v1, Landroid/widget/FrameLayout;

    .line 721
    .line 722
    const v2, 0x7f0a0861

    .line 723
    .line 724
    .line 725
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    check-cast v4, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 730
    .line 731
    if-eqz v4, :cond_f

    .line 732
    .line 733
    const v2, 0x7f0a1260

    .line 734
    .line 735
    .line 736
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    check-cast v5, Landroid/widget/TextView;

    .line 741
    .line 742
    if-eqz v5, :cond_f

    .line 743
    .line 744
    new-instance v3, La/a4l0;

    .line 745
    .line 746
    invoke-direct {v3, v1, v1, v4, v5}, La/a4l0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Landroid/widget/TextView;)V

    .line 747
    .line 748
    .line 749
    goto :goto_5

    .line 750
    :cond_f
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    const-string v1, "Missing required view with ID: "

    .line 759
    .line 760
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    :goto_5
    return-object v3

    .line 768
    :pswitch_14
    check-cast v0, Landroid/content/Context;

    .line 769
    .line 770
    check-cast v6, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 771
    .line 772
    sget v1, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->i:I

    .line 773
    .line 774
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 775
    .line 776
    invoke-direct {v1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 777
    .line 778
    .line 779
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 780
    .line 781
    const/4 v3, -0x2

    .line 782
    invoke-direct {v0, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 786
    .line 787
    .line 788
    const/16 v0, 0x10

    .line 789
    .line 790
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 791
    .line 792
    .line 793
    const v0, 0x7f14046f

    .line 794
    .line 795
    .line 796
    invoke-static {v0, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 797
    .line 798
    .line 799
    iget v0, v6, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->d:I

    .line 800
    .line 801
    invoke-virtual {v1, v5, v0, v5, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 808
    .line 809
    .line 810
    return-object v1

    .line 811
    :pswitch_15
    check-cast v0, La/eok0;

    .line 812
    .line 813
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 814
    .line 815
    iget-object v0, v0, La/eok0;->b:La/bqv;

    .line 816
    .line 817
    if-eqz v0, :cond_10

    .line 818
    .line 819
    new-instance v1, La/vqk0;

    .line 820
    .line 821
    invoke-direct {v1, v0}, La/vqk0;-><init>(La/bqv;)V

    .line 822
    .line 823
    .line 824
    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 828
    .line 829
    return-object v0

    .line 830
    :pswitch_16
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 831
    .line 832
    check-cast v6, La/chk0;

    .line 833
    .line 834
    new-instance v1, La/l3f0;

    .line 835
    .line 836
    iget v2, v6, La/chk0;->a:I

    .line 837
    .line 838
    invoke-direct {v1, v2}, La/l3f0;-><init>(I)V

    .line 839
    .line 840
    .line 841
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 845
    .line 846
    return-object v0

    .line 847
    :pswitch_17
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 848
    .line 849
    check-cast v6, La/bhk0;

    .line 850
    .line 851
    new-instance v1, La/dwe0;

    .line 852
    .line 853
    iget v2, v6, La/bhk0;->a:I

    .line 854
    .line 855
    invoke-direct {v1, v2}, La/dwe0;-><init>(I)V

    .line 856
    .line 857
    .line 858
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_18
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 865
    .line 866
    check-cast v6, La/ahk0;

    .line 867
    .line 868
    new-instance v1, La/o9f0;

    .line 869
    .line 870
    iget v2, v6, La/ahk0;->a:I

    .line 871
    .line 872
    invoke-direct {v1, v2}, La/o9f0;-><init>(I)V

    .line 873
    .line 874
    .line 875
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 879
    .line 880
    return-object v0

    .line 881
    :pswitch_19
    check-cast v0, La/jjk0;

    .line 882
    .line 883
    check-cast v6, La/wgk0;

    .line 884
    .line 885
    sget-object v1, La/wgk0;->d2:[La/iiy;

    .line 886
    .line 887
    iget-object v0, v0, La/jjk0;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 888
    .line 889
    iget-object v1, v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a:La/siq;

    .line 890
    .line 891
    if-eqz v1, :cond_11

    .line 892
    .line 893
    invoke-virtual {v1}, Landroid/webkit/WebView;->clearHistory()V

    .line 894
    .line 895
    .line 896
    :cond_11
    iget-object v1, v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a:La/siq;

    .line 897
    .line 898
    if-eqz v1, :cond_12

    .line 899
    .line 900
    invoke-virtual {v1, v4}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 901
    .line 902
    .line 903
    :cond_12
    iget-object v1, v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a:La/siq;

    .line 904
    .line 905
    if-eqz v1, :cond_13

    .line 906
    .line 907
    invoke-virtual {v1}, Landroid/webkit/WebView;->clearFormData()V

    .line 908
    .line 909
    .line 910
    :cond_13
    iget-object v0, v0, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a:La/siq;

    .line 911
    .line 912
    if-eqz v0, :cond_14

    .line 913
    .line 914
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearSslPreferences()V

    .line 915
    .line 916
    .line 917
    :cond_14
    invoke-virtual {v6}, La/wgk0;->R0()La/jjk0;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    iget-object v0, v0, La/jjk0;->d:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 922
    .line 923
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 924
    .line 925
    .line 926
    move-result v0

    .line 927
    if-nez v0, :cond_15

    .line 928
    .line 929
    goto :goto_6

    .line 930
    :cond_15
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    invoke-virtual {v0, v3}, Landroid/webkit/CookieManager;->removeSessionCookies(Landroid/webkit/ValueCallback;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeExpiredCookie()V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v0, v3}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V

    .line 944
    .line 945
    .line 946
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 947
    .line 948
    return-object v0

    .line 949
    :pswitch_1a
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 950
    .line 951
    check-cast v6, La/wdk0;

    .line 952
    .line 953
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    iget-object v0, v6, La/wdk0;->b:Lkotlin/jvm/functions/Function0;

    .line 957
    .line 958
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    iget-object v0, v6, La/wdk0;->c:Lkotlin/jvm/functions/Function0;

    .line 962
    .line 963
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 967
    .line 968
    return-object v0

    .line 969
    :pswitch_1b
    check-cast v0, Landroid/content/Context;

    .line 970
    .line 971
    check-cast v6, Lorg/xplatform/ui_core/viewcomponents/smart_background/c;

    .line 972
    .line 973
    new-instance v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 974
    .line 975
    invoke-direct {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 976
    .line 977
    .line 978
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 979
    .line 980
    const/4 v3, -0x1

    .line 981
    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 985
    .line 986
    .line 987
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 988
    .line 989
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v6, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 996
    .line 997
    .line 998
    return-object v1

    .line 999
    :pswitch_1c
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 1000
    .line 1001
    check-cast v6, La/y3r0;

    .line 1002
    .line 1003
    iget v1, v6, La/y3r0;->a:I

    .line 1004
    .line 1005
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    iget-object v2, v6, La/y3r0;->b:Ljava/lang/String;

    .line 1010
    .line 1011
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1015
    .line 1016
    return-object v0

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
