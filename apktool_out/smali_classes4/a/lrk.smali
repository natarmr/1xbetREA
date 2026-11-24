.class public final synthetic La/lrk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lrk;->a:B

    iput-object p1, p0, La/lrk;->c:Ljava/lang/Object;

    iput-object p2, p0, La/lrk;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lrk;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v7, v0, La/lrk;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, v0, La/lrk;->c:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v0, La/hnm;

    .line 19
    .line 20
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 21
    .line 22
    iget-object v0, v0, La/hnm;->a:La/zmm;

    .line 23
    .line 24
    invoke-interface {v0}, La/zmm;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 37
    .line 38
    check-cast v7, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 39
    .line 40
    sget v1, Lorg/xplatform/uikit/components/cells/DsMenuCell;->g1:I

    .line 41
    .line 42
    invoke-virtual {v7}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/DsMenuCell;->x(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    check-cast v7, La/e0x;

    .line 55
    .line 56
    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    check-cast v7, La/uba;

    .line 65
    .line 66
    new-instance v1, La/wdm;

    .line 67
    .line 68
    invoke-interface {v7}, La/uba;->a()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    invoke-direct {v1, v5, v2, v3}, La/wdm;-><init>(ZJ)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    check-cast v7, La/fdm;

    .line 84
    .line 85
    iget-byte v1, v7, La/fdm;->a:B

    .line 86
    .line 87
    int-to-long v1, v1

    .line 88
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 99
    .line 100
    check-cast v7, La/bdm;

    .line 101
    .line 102
    iget-object v1, v7, La/bdm;->a:La/mcm;

    .line 103
    .line 104
    iget-object v1, v1, La/mcm;->a:La/kcm;

    .line 105
    .line 106
    iget-object v1, v1, La/kcm;->b:Ljava/lang/String;

    .line 107
    .line 108
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_5
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    check-cast v7, La/ybm;

    .line 117
    .line 118
    invoke-interface {v7}, La/ybm;->getId()J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    check-cast v7, La/ibm;

    .line 135
    .line 136
    iget-object v1, v7, La/ibm;->a:Ljava/lang/String;

    .line 137
    .line 138
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_7
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 145
    .line 146
    check-cast v7, La/m8m;

    .line 147
    .line 148
    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    check-cast v7, La/e8m;

    .line 157
    .line 158
    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_9
    check-cast v0, La/h5m;

    .line 165
    .line 166
    check-cast v7, La/vne;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iput-object v7, v0, La/h5m;->c:La/vne;

    .line 175
    .line 176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_a
    check-cast v0, La/mhc;

    .line 180
    .line 181
    check-cast v7, La/cp;

    .line 182
    .line 183
    invoke-virtual {v7}, La/cp;->u()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, La/zog;

    .line 188
    .line 189
    iget-wide v1, v1, La/zog;->c:J

    .line 190
    .line 191
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v7}, La/cp;->u()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, La/zog;

    .line 200
    .line 201
    iget-object v2, v2, La/zog;->d:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v0, v1, v2}, La/mhc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_b
    check-cast v0, La/x3m;

    .line 210
    .line 211
    check-cast v7, La/i3m;

    .line 212
    .line 213
    invoke-virtual {v0}, La/x3m;->c()La/y3m;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_5

    .line 222
    .line 223
    if-eq v0, v4, :cond_4

    .line 224
    .line 225
    const/4 v1, 0x2

    .line 226
    if-ne v0, v1, :cond_3

    .line 227
    .line 228
    iget-object v0, v7, La/i3m;->b:La/agk0;

    .line 229
    .line 230
    invoke-virtual {v0}, La/agk0;->l()F

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-nez v0, :cond_1

    .line 243
    .line 244
    move-object v6, v1

    .line 245
    :cond_1
    if-eqz v6, :cond_2

    .line 246
    .line 247
    goto :goto_0

    .line 248
    :cond_2
    move v4, v5

    .line 249
    goto :goto_0

    .line 250
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 251
    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_4
    iget-object v0, v7, La/i3m;->a:La/ngk0;

    .line 255
    .line 256
    iget-object v0, v0, La/ngk0;->d:La/yfk0;

    .line 257
    .line 258
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->h0(Ljava/lang/Iterable;)Ljava/lang/Float;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-eqz v0, :cond_2

    .line 263
    .line 264
    :cond_5
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    :goto_1
    return-object v6

    .line 269
    :pswitch_c
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 270
    .line 271
    check-cast v7, La/t2m;

    .line 272
    .line 273
    invoke-interface {v7}, La/t2m;->getId()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_d
    check-cast v0, La/r7n;

    .line 284
    .line 285
    check-cast v7, La/egk0;

    .line 286
    .line 287
    sget-object v1, La/r7n;->b:La/r7n;

    .line 288
    .line 289
    if-eq v0, v1, :cond_7

    .line 290
    .line 291
    sget-object v1, La/r7n;->a:La/r7n;

    .line 292
    .line 293
    if-ne v0, v1, :cond_6

    .line 294
    .line 295
    invoke-virtual {v7}, La/egk0;->l()J

    .line 296
    .line 297
    .line 298
    move-result-wide v0

    .line 299
    const-wide/32 v2, 0x5b8998

    .line 300
    .line 301
    .line 302
    cmp-long v0, v0, v2

    .line 303
    .line 304
    if-lez v0, :cond_6

    .line 305
    .line 306
    goto :goto_2

    .line 307
    :cond_6
    move v4, v5

    .line 308
    :cond_7
    :goto_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    return-object v0

    .line 313
    :pswitch_e
    check-cast v0, Ljava/lang/String;

    .line 314
    .line 315
    check-cast v7, La/l7m0;

    .line 316
    .line 317
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 318
    .line 319
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-static {v1, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    return-object v0

    .line 336
    :pswitch_f
    check-cast v0, Landroid/content/Context;

    .line 337
    .line 338
    check-cast v7, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 339
    .line 340
    invoke-static {v0, v7}, Lorg/xplatform/uikit/components/counter/DsCounter;->a(Landroid/content/Context;Lorg/xplatform/uikit/components/counter/DsCounter;)Landroidx/appcompat/widget/AppCompatImageView;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    return-object v0

    .line 345
    :pswitch_10
    check-cast v0, La/wul;

    .line 346
    .line 347
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 348
    .line 349
    iget-boolean v0, v0, La/wul;->e:Z

    .line 350
    .line 351
    if-nez v0, :cond_8

    .line 352
    .line 353
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object v0

    .line 359
    :pswitch_11
    check-cast v0, Landroid/content/Context;

    .line 360
    .line 361
    check-cast v7, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 362
    .line 363
    sget v1, Lorg/xplatform/uikit/components/buttons/DsButton;->n:I

    .line 364
    .line 365
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 366
    .line 367
    invoke-direct {v1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 371
    .line 372
    .line 373
    const-string v0, "DsButtonTextView"

    .line 374
    .line 375
    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    return-object v1

    .line 379
    :pswitch_12
    check-cast v0, La/gol;

    .line 380
    .line 381
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 382
    .line 383
    instance-of v1, v0, La/eol;

    .line 384
    .line 385
    if-eqz v1, :cond_9

    .line 386
    .line 387
    if-eqz v7, :cond_9

    .line 388
    .line 389
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_13
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 396
    .line 397
    check-cast v7, La/jml;

    .line 398
    .line 399
    check-cast v7, La/hml;

    .line 400
    .line 401
    iget-object v1, v7, La/hml;->a:La/eml;

    .line 402
    .line 403
    iget-wide v1, v1, La/eml;->a:J

    .line 404
    .line 405
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_14
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 416
    .line 417
    check-cast v7, La/eml;

    .line 418
    .line 419
    iget-wide v1, v7, La/eml;->a:J

    .line 420
    .line 421
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    iget-boolean v2, v7, La/eml;->i:Z

    .line 426
    .line 427
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_15
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 438
    .line 439
    check-cast v7, La/cll;

    .line 440
    .line 441
    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    return-object v0

    .line 447
    :pswitch_16
    check-cast v0, Landroid/content/Context;

    .line 448
    .line 449
    check-cast v7, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;

    .line 450
    .line 451
    sget v1, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/futuregame/item/DotaStatisticFutureGameView;->A:I

    .line 452
    .line 453
    new-instance v1, Landroid/widget/ImageView;

    .line 454
    .line 455
    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 459
    .line 460
    .line 461
    return-object v1

    .line 462
    :pswitch_17
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 463
    .line 464
    check-cast v7, La/l0l;

    .line 465
    .line 466
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    sget-object v0, La/tzk;->b:La/tzk;

    .line 470
    .line 471
    invoke-virtual {v7, v0}, La/l0l;->A(La/tzk;)V

    .line 472
    .line 473
    .line 474
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    return-object v0

    .line 477
    :pswitch_18
    check-cast v0, La/szq;

    .line 478
    .line 479
    check-cast v7, La/szk;

    .line 480
    .line 481
    sget-object v1, La/szk;->Q1:[La/iiy;

    .line 482
    .line 483
    iget-object v0, v0, La/szq;->b:La/e0f;

    .line 484
    .line 485
    iget-object v0, v0, La/e0f;->f:Landroid/view/View;

    .line 486
    .line 487
    check-cast v0, Landroid/widget/Button;

    .line 488
    .line 489
    invoke-virtual {v0, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v7}, La/szk;->J0()La/l0l;

    .line 493
    .line 494
    .line 495
    move-result-object v10

    .line 496
    iget-object v0, v10, La/l0l;->r:La/bby;

    .line 497
    .line 498
    if-eqz v0, :cond_a

    .line 499
    .line 500
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    if-ne v0, v4, :cond_a

    .line 505
    .line 506
    goto :goto_3

    .line 507
    :cond_a
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    iget-object v1, v10, La/l0l;->c:La/mne;

    .line 512
    .line 513
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 514
    .line 515
    new-instance v8, La/y6h;

    .line 516
    .line 517
    const/4 v14, 0x0

    .line 518
    const/16 v15, 0x1d

    .line 519
    .line 520
    const/4 v9, 0x1

    .line 521
    const-class v11, La/l0l;

    .line 522
    .line 523
    const-string v12, "handleGameError"

    .line 524
    .line 525
    const-string v13, "handleGameError(Ljava/lang/Throwable;)V"

    .line 526
    .line 527
    invoke-direct/range {v8 .. v15}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 528
    .line 529
    .line 530
    new-instance v15, La/g0l;

    .line 531
    .line 532
    invoke-direct {v15, v10, v6, v5}, La/g0l;-><init>(La/l0l;La/yje;B)V

    .line 533
    .line 534
    .line 535
    const/16 v16, 0xa

    .line 536
    .line 537
    const/4 v13, 0x0

    .line 538
    move-object v11, v0

    .line 539
    move-object v14, v1

    .line 540
    move-object v12, v8

    .line 541
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    iput-object v0, v10, La/l0l;->r:La/bby;

    .line 546
    .line 547
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 548
    .line 549
    return-object v0

    .line 550
    :pswitch_19
    move-object v9, v0

    .line 551
    check-cast v9, La/q5u;

    .line 552
    .line 553
    move-object v0, v7

    .line 554
    check-cast v0, La/atk;

    .line 555
    .line 556
    iget-object v1, v0, La/atk;->o:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 557
    .line 558
    iget-wide v10, v1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 559
    .line 560
    iget-object v12, v1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 561
    .line 562
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    iget-object v1, v9, La/q5u;->l:La/m1e;

    .line 566
    .line 567
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    new-instance v7, La/uot;

    .line 572
    .line 573
    const/4 v8, 0x0

    .line 574
    invoke-direct/range {v7 .. v12}, La/uot;-><init>(La/yje;La/q5u;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 575
    .line 576
    .line 577
    invoke-static {v1, v7}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    new-instance v2, La/wsk;

    .line 582
    .line 583
    invoke-direct {v2, v0, v6, v5}, La/wsk;-><init>(La/atk;La/yje;B)V

    .line 584
    .line 585
    .line 586
    new-instance v4, La/fnq;

    .line 587
    .line 588
    invoke-direct {v4, v1, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 589
    .line 590
    .line 591
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    iget-object v0, v0, La/atk;->q:La/mne;

    .line 596
    .line 597
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 598
    .line 599
    invoke-static {v1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-static {v4, v0}, La/piz;->O(La/fnq;La/sje;)La/ise0;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    return-object v0

    .line 608
    :pswitch_1a
    move-object v9, v0

    .line 609
    check-cast v9, La/v5u;

    .line 610
    .line 611
    move-object v0, v7

    .line 612
    check-cast v0, La/atk;

    .line 613
    .line 614
    iget-object v1, v0, La/atk;->o:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 615
    .line 616
    iget-object v11, v1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 617
    .line 618
    iget-wide v12, v1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 619
    .line 620
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    check-cast v1, La/ksk;

    .line 625
    .line 626
    iget-object v1, v1, La/ksk;->b:La/sff0;

    .line 627
    .line 628
    iget-object v1, v1, La/sff0;->c:La/ech;

    .line 629
    .line 630
    iget-object v14, v1, La/ech;->q:La/n2o;

    .line 631
    .line 632
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    invoke-static {v12, v13, v11}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 636
    .line 637
    .line 638
    move-result-object v10

    .line 639
    iget-object v1, v9, La/v5u;->d:La/m1e;

    .line 640
    .line 641
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    new-instance v7, La/t5u;

    .line 646
    .line 647
    const/4 v8, 0x0

    .line 648
    invoke-direct/range {v7 .. v14}, La/t5u;-><init>(La/yje;La/v5u;Lkotlin/Pair;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/n2o;)V

    .line 649
    .line 650
    .line 651
    invoke-static {v1, v7}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    new-instance v2, La/rl2;

    .line 656
    .line 657
    const/4 v5, 0x3

    .line 658
    const/16 v7, 0x10

    .line 659
    .line 660
    invoke-direct {v2, v5, v6, v7}, La/rl2;-><init>(ILa/yje;B)V

    .line 661
    .line 662
    .line 663
    new-instance v5, La/dnq;

    .line 664
    .line 665
    invoke-direct {v5, v1, v2, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 666
    .line 667
    .line 668
    new-instance v1, La/wsk;

    .line 669
    .line 670
    invoke-direct {v1, v0, v6, v4}, La/wsk;-><init>(La/atk;La/yje;B)V

    .line 671
    .line 672
    .line 673
    new-instance v2, La/fnq;

    .line 674
    .line 675
    invoke-direct {v2, v5, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 676
    .line 677
    .line 678
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    iget-object v0, v0, La/atk;->q:La/mne;

    .line 683
    .line 684
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 685
    .line 686
    invoke-static {v1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-static {v2, v0}, La/piz;->O(La/fnq;La/sje;)La/ise0;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    return-object v0

    .line 695
    :pswitch_1b
    check-cast v0, La/csk;

    .line 696
    .line 697
    iget-object v1, v0, La/csk;->k:La/n0o0;

    .line 698
    .line 699
    iget-object v3, v0, La/csk;->l:La/n0o0;

    .line 700
    .line 701
    iget-object v4, v0, La/csk;->j:La/n0o0;

    .line 702
    .line 703
    iget-object v5, v0, La/csk;->i:La/n0o0;

    .line 704
    .line 705
    check-cast v7, La/ksk;

    .line 706
    .line 707
    iget-object v8, v0, La/csk;->g:La/n0o0;

    .line 708
    .line 709
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v9

    .line 713
    check-cast v9, La/fee;

    .line 714
    .line 715
    iget-object v10, v7, La/ksk;->c:La/j0g0;

    .line 716
    .line 717
    invoke-virtual {v9, v10}, La/fee;->d(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    iget-object v0, v0, La/csk;->h:La/n0o0;

    .line 721
    .line 722
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v9

    .line 726
    check-cast v9, La/fee;

    .line 727
    .line 728
    iget-object v7, v7, La/ksk;->d:La/j0g0;

    .line 729
    .line 730
    if-eqz v7, :cond_d

    .line 731
    .line 732
    iget-object v10, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 733
    .line 734
    instance-of v11, v10, La/g0g0;

    .line 735
    .line 736
    if-eqz v11, :cond_b

    .line 737
    .line 738
    move-object v10, v6

    .line 739
    :cond_b
    check-cast v10, La/kuk;

    .line 740
    .line 741
    if-eqz v10, :cond_d

    .line 742
    .line 743
    iget-object v10, v10, La/kuk;->c:La/j0g0;

    .line 744
    .line 745
    if-eqz v10, :cond_d

    .line 746
    .line 747
    iget-object v10, v10, La/j0g0;->a:Ljava/lang/Object;

    .line 748
    .line 749
    instance-of v11, v10, La/g0g0;

    .line 750
    .line 751
    if-eqz v11, :cond_c

    .line 752
    .line 753
    move-object v10, v6

    .line 754
    :cond_c
    check-cast v10, La/btk;

    .line 755
    .line 756
    if-nez v10, :cond_e

    .line 757
    .line 758
    :cond_d
    new-instance v10, La/btk;

    .line 759
    .line 760
    sget-object v11, La/iun;->a:La/iun;

    .line 761
    .line 762
    invoke-direct {v10, v11, v2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    :cond_e
    invoke-virtual {v9, v10}, La/fee;->d(Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v9

    .line 772
    check-cast v9, La/fee;

    .line 773
    .line 774
    if-eqz v7, :cond_11

    .line 775
    .line 776
    iget-object v10, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 777
    .line 778
    instance-of v11, v10, La/g0g0;

    .line 779
    .line 780
    if-eqz v11, :cond_f

    .line 781
    .line 782
    move-object v10, v6

    .line 783
    :cond_f
    check-cast v10, La/kuk;

    .line 784
    .line 785
    if-eqz v10, :cond_11

    .line 786
    .line 787
    iget-object v10, v10, La/kuk;->d:La/j0g0;

    .line 788
    .line 789
    if-eqz v10, :cond_11

    .line 790
    .line 791
    iget-object v10, v10, La/j0g0;->a:Ljava/lang/Object;

    .line 792
    .line 793
    instance-of v11, v10, La/g0g0;

    .line 794
    .line 795
    if-eqz v11, :cond_10

    .line 796
    .line 797
    move-object v10, v6

    .line 798
    :cond_10
    check-cast v10, La/btk;

    .line 799
    .line 800
    if-nez v10, :cond_12

    .line 801
    .line 802
    :cond_11
    new-instance v10, La/btk;

    .line 803
    .line 804
    sget-object v11, La/iun;->a:La/iun;

    .line 805
    .line 806
    invoke-direct {v10, v11, v2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    :cond_12
    invoke-virtual {v9, v10}, La/fee;->d(Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    check-cast v2, La/fee;

    .line 817
    .line 818
    if-eqz v7, :cond_14

    .line 819
    .line 820
    iget-object v9, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 821
    .line 822
    instance-of v10, v9, La/g0g0;

    .line 823
    .line 824
    if-eqz v10, :cond_13

    .line 825
    .line 826
    move-object v9, v6

    .line 827
    :cond_13
    check-cast v9, La/kuk;

    .line 828
    .line 829
    if-eqz v9, :cond_14

    .line 830
    .line 831
    invoke-static {v9}, La/obc;->T(La/kuk;)La/zrk;

    .line 832
    .line 833
    .line 834
    move-result-object v9

    .line 835
    goto :goto_4

    .line 836
    :cond_14
    new-instance v9, La/zrk;

    .line 837
    .line 838
    sget-object v10, La/iun;->a:La/iun;

    .line 839
    .line 840
    invoke-direct {v9, v10, v10}, La/zrk;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 841
    .line 842
    .line 843
    :goto_4
    invoke-virtual {v2, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    check-cast v2, La/fee;

    .line 851
    .line 852
    if-eqz v7, :cond_17

    .line 853
    .line 854
    iget-object v9, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 855
    .line 856
    instance-of v10, v9, La/g0g0;

    .line 857
    .line 858
    if-eqz v10, :cond_15

    .line 859
    .line 860
    move-object v9, v6

    .line 861
    :cond_15
    check-cast v9, La/kuk;

    .line 862
    .line 863
    if-eqz v9, :cond_17

    .line 864
    .line 865
    iget-object v9, v9, La/kuk;->g:La/j0g0;

    .line 866
    .line 867
    if-eqz v9, :cond_17

    .line 868
    .line 869
    iget-object v9, v9, La/j0g0;->a:Ljava/lang/Object;

    .line 870
    .line 871
    sget-object v10, La/iun;->a:La/iun;

    .line 872
    .line 873
    instance-of v11, v9, La/g0g0;

    .line 874
    .line 875
    if-eqz v11, :cond_16

    .line 876
    .line 877
    move-object v9, v10

    .line 878
    :cond_16
    check-cast v9, Ljava/util/List;

    .line 879
    .line 880
    if-nez v9, :cond_18

    .line 881
    .line 882
    :cond_17
    sget-object v10, La/iun;->a:La/iun;

    .line 883
    .line 884
    move-object v9, v10

    .line 885
    :cond_18
    invoke-virtual {v2, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    check-cast v2, La/fee;

    .line 893
    .line 894
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v2}, La/fee;->a()La/pz40;

    .line 898
    .line 899
    .line 900
    move-result-object v9

    .line 901
    invoke-virtual {v2}, La/fee;->a()La/pz40;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    check-cast v2, La/zrk;

    .line 910
    .line 911
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 912
    .line 913
    .line 914
    if-eqz v7, :cond_1c

    .line 915
    .line 916
    iget-object v2, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 917
    .line 918
    instance-of v7, v2, La/g0g0;

    .line 919
    .line 920
    if-eqz v7, :cond_19

    .line 921
    .line 922
    move-object v2, v6

    .line 923
    :cond_19
    check-cast v2, La/kuk;

    .line 924
    .line 925
    if-eqz v2, :cond_1c

    .line 926
    .line 927
    iget-object v2, v2, La/kuk;->j:Ljava/lang/Object;

    .line 928
    .line 929
    instance-of v7, v2, La/g0g0;

    .line 930
    .line 931
    if-eqz v7, :cond_1a

    .line 932
    .line 933
    goto :goto_5

    .line 934
    :cond_1a
    move-object v6, v2

    .line 935
    :goto_5
    check-cast v6, Ljava/util/List;

    .line 936
    .line 937
    if-nez v6, :cond_1b

    .line 938
    .line 939
    goto :goto_6

    .line 940
    :cond_1b
    move-object v10, v6

    .line 941
    :cond_1c
    :goto_6
    invoke-static {v10}, La/kbc;->i0(Ljava/util/List;)La/zrk;

    .line 942
    .line 943
    .line 944
    move-result-object v2

    .line 945
    invoke-interface {v9, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 946
    .line 947
    .line 948
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v6

    .line 956
    check-cast v6, La/fee;

    .line 957
    .line 958
    invoke-virtual {v6}, La/fee;->b()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v6

    .line 962
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    check-cast v0, La/fee;

    .line 970
    .line 971
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    check-cast v0, Ljava/util/Collection;

    .line 976
    .line 977
    invoke-virtual {v2, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 978
    .line 979
    .line 980
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    check-cast v0, La/fee;

    .line 985
    .line 986
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    check-cast v0, Ljava/util/Collection;

    .line 991
    .line 992
    invoke-virtual {v2, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 993
    .line 994
    .line 995
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    check-cast v0, La/fee;

    .line 1000
    .line 1001
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    check-cast v0, Ljava/util/Collection;

    .line 1006
    .line 1007
    invoke-virtual {v2, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    check-cast v0, La/fee;

    .line 1015
    .line 1016
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    check-cast v0, Ljava/util/Collection;

    .line 1021
    .line 1022
    invoke-virtual {v2, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    check-cast v0, La/fee;

    .line 1030
    .line 1031
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    check-cast v0, Ljava/util/Collection;

    .line 1036
    .line 1037
    invoke-static {v2, v0, v2}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    return-object v0

    .line 1042
    :pswitch_1c
    check-cast v0, La/mrk;

    .line 1043
    .line 1044
    iget-object v1, v0, La/mrk;->k:La/n0o0;

    .line 1045
    .line 1046
    iget-object v3, v0, La/mrk;->l:La/n0o0;

    .line 1047
    .line 1048
    iget-object v4, v0, La/mrk;->j:La/n0o0;

    .line 1049
    .line 1050
    check-cast v7, La/ksk;

    .line 1051
    .line 1052
    iget-object v5, v0, La/mrk;->h:La/n0o0;

    .line 1053
    .line 1054
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v8

    .line 1058
    check-cast v8, La/fee;

    .line 1059
    .line 1060
    iget-object v9, v7, La/ksk;->c:La/j0g0;

    .line 1061
    .line 1062
    invoke-virtual {v8, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 1063
    .line 1064
    .line 1065
    iget-object v0, v0, La/mrk;->i:La/n0o0;

    .line 1066
    .line 1067
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v8

    .line 1071
    check-cast v8, La/fee;

    .line 1072
    .line 1073
    iget-object v7, v7, La/ksk;->d:La/j0g0;

    .line 1074
    .line 1075
    if-eqz v7, :cond_1e

    .line 1076
    .line 1077
    iget-object v9, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 1078
    .line 1079
    instance-of v10, v9, La/g0g0;

    .line 1080
    .line 1081
    if-eqz v10, :cond_1d

    .line 1082
    .line 1083
    move-object v9, v6

    .line 1084
    :cond_1d
    check-cast v9, La/kuk;

    .line 1085
    .line 1086
    if-eqz v9, :cond_1e

    .line 1087
    .line 1088
    invoke-static {v9}, La/e3c;->N(La/kuk;)La/drk;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v2

    .line 1092
    goto :goto_7

    .line 1093
    :cond_1e
    new-instance v9, La/drk;

    .line 1094
    .line 1095
    new-instance v10, La/btk;

    .line 1096
    .line 1097
    sget-object v11, La/iun;->a:La/iun;

    .line 1098
    .line 1099
    invoke-direct {v10, v11, v2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 1100
    .line 1101
    .line 1102
    new-instance v12, La/btk;

    .line 1103
    .line 1104
    invoke-direct {v12, v11, v2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 1105
    .line 1106
    .line 1107
    invoke-direct {v9, v10, v12}, La/drk;-><init>(La/btk;La/btk;)V

    .line 1108
    .line 1109
    .line 1110
    move-object v2, v9

    .line 1111
    :goto_7
    invoke-virtual {v8, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v2

    .line 1118
    check-cast v2, La/fee;

    .line 1119
    .line 1120
    if-eqz v7, :cond_20

    .line 1121
    .line 1122
    iget-object v8, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 1123
    .line 1124
    instance-of v9, v8, La/g0g0;

    .line 1125
    .line 1126
    if-eqz v9, :cond_1f

    .line 1127
    .line 1128
    move-object v8, v6

    .line 1129
    :cond_1f
    check-cast v8, La/kuk;

    .line 1130
    .line 1131
    if-eqz v8, :cond_20

    .line 1132
    .line 1133
    invoke-static {v8}, La/d5c;->d0(La/kuk;)La/irk;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v8

    .line 1137
    goto :goto_8

    .line 1138
    :cond_20
    new-instance v8, La/irk;

    .line 1139
    .line 1140
    sget-object v9, La/iun;->a:La/iun;

    .line 1141
    .line 1142
    invoke-direct {v8, v9, v9}, La/irk;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 1143
    .line 1144
    .line 1145
    :goto_8
    invoke-virtual {v2, v8}, La/fee;->d(Ljava/lang/Object;)V

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v2

    .line 1152
    check-cast v2, La/fee;

    .line 1153
    .line 1154
    if-eqz v7, :cond_23

    .line 1155
    .line 1156
    iget-object v8, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 1157
    .line 1158
    instance-of v9, v8, La/g0g0;

    .line 1159
    .line 1160
    if-eqz v9, :cond_21

    .line 1161
    .line 1162
    move-object v8, v6

    .line 1163
    :cond_21
    check-cast v8, La/kuk;

    .line 1164
    .line 1165
    if-eqz v8, :cond_23

    .line 1166
    .line 1167
    iget-object v8, v8, La/kuk;->g:La/j0g0;

    .line 1168
    .line 1169
    if-eqz v8, :cond_23

    .line 1170
    .line 1171
    iget-object v8, v8, La/j0g0;->a:Ljava/lang/Object;

    .line 1172
    .line 1173
    instance-of v9, v8, La/g0g0;

    .line 1174
    .line 1175
    if-eqz v9, :cond_22

    .line 1176
    .line 1177
    move-object v8, v6

    .line 1178
    :cond_22
    check-cast v8, Ljava/util/List;

    .line 1179
    .line 1180
    if-nez v8, :cond_24

    .line 1181
    .line 1182
    :cond_23
    sget-object v8, La/iun;->a:La/iun;

    .line 1183
    .line 1184
    :cond_24
    invoke-virtual {v2, v8}, La/fee;->d(Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    check-cast v2, La/fee;

    .line 1192
    .line 1193
    if-eqz v7, :cond_27

    .line 1194
    .line 1195
    iget-object v7, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 1196
    .line 1197
    instance-of v8, v7, La/g0g0;

    .line 1198
    .line 1199
    if-eqz v8, :cond_25

    .line 1200
    .line 1201
    move-object v7, v6

    .line 1202
    :cond_25
    check-cast v7, La/kuk;

    .line 1203
    .line 1204
    if-eqz v7, :cond_27

    .line 1205
    .line 1206
    iget-object v7, v7, La/kuk;->j:Ljava/lang/Object;

    .line 1207
    .line 1208
    instance-of v8, v7, La/g0g0;

    .line 1209
    .line 1210
    if-eqz v8, :cond_26

    .line 1211
    .line 1212
    goto :goto_9

    .line 1213
    :cond_26
    move-object v6, v7

    .line 1214
    :goto_9
    check-cast v6, Ljava/util/List;

    .line 1215
    .line 1216
    if-nez v6, :cond_28

    .line 1217
    .line 1218
    :cond_27
    sget-object v6, La/iun;->a:La/iun;

    .line 1219
    .line 1220
    :cond_28
    invoke-static {v6}, La/v3c;->i0(Ljava/util/List;)La/irk;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v6

    .line 1224
    invoke-virtual {v2, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v2

    .line 1231
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v5

    .line 1235
    check-cast v5, La/fee;

    .line 1236
    .line 1237
    invoke-virtual {v5}, La/fee;->b()Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v5

    .line 1241
    invoke-virtual {v2, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    check-cast v0, La/fee;

    .line 1249
    .line 1250
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    check-cast v0, Ljava/util/Collection;

    .line 1255
    .line 1256
    invoke-virtual {v2, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    check-cast v0, La/fee;

    .line 1264
    .line 1265
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    check-cast v0, Ljava/util/Collection;

    .line 1270
    .line 1271
    invoke-virtual {v2, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    check-cast v0, La/fee;

    .line 1279
    .line 1280
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v0

    .line 1284
    check-cast v0, Ljava/util/Collection;

    .line 1285
    .line 1286
    invoke-virtual {v2, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    check-cast v0, La/fee;

    .line 1294
    .line 1295
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    check-cast v0, Ljava/util/Collection;

    .line 1300
    .line 1301
    invoke-static {v2, v0, v2}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    return-object v0

    .line 1306
    nop

    .line 1307
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
