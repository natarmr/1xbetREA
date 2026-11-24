.class public final synthetic La/i7q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i7q;->a:B

    iput-object p1, p0, La/i7q;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/i7q;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    const v2, 0x7f140491

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    const v4, 0x7f140487

    .line 10
    .line 11
    .line 12
    const v5, 0x7f040b17

    .line 13
    .line 14
    .line 15
    const/4 v6, 0x4

    .line 16
    const/4 v7, 0x1

    .line 17
    iget-object p0, p0, La/i7q;->b:Landroid/content/Context;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/RadialProgressView;->m:I

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const v0, 0x7f070163

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/RadialProgressView;->m:I

    .line 41
    .line 42
    new-instance v0, Landroid/graphics/Paint;

    .line 43
    .line 44
    invoke-direct {v0, v7}, Landroid/graphics/Paint;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 50
    .line 51
    .line 52
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const v1, 0x7f070717

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    int-to-float p0, p0

    .line 69
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 70
    .line 71
    .line 72
    const/4 p0, -0x1

    .line 73
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_1
    new-instance v0, Landroid/view/View;

    .line 78
    .line 79
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v5, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_2
    new-instance v0, Landroid/view/View;

    .line 91
    .line 92
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v5, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_3
    new-instance v0, Landroid/view/View;

    .line 104
    .line 105
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v5, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_4
    new-instance v0, Landroid/widget/TextView;

    .line 117
    .line 118
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, La/jmu0;->d()I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 126
    .line 127
    .line 128
    const-string p0, "bottomButton"

    .line 129
    .line 130
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v4, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v6}, Landroid/view/View;->setTextAlignment(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 143
    .line 144
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 145
    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_5
    new-instance v0, Landroid/widget/TextView;

    .line 149
    .line 150
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 151
    .line 152
    .line 153
    invoke-static {}, La/jmu0;->d()I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 158
    .line 159
    .line 160
    const-string p0, "middleButton"

    .line 161
    .line 162
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v4, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v6}, Landroid/view/View;->setTextAlignment(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 172
    .line 173
    .line 174
    sget-object p0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 175
    .line 176
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_6
    new-instance v0, Landroid/widget/TextView;

    .line 181
    .line 182
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 183
    .line 184
    .line 185
    invoke-static {}, La/jmu0;->d()I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 190
    .line 191
    .line 192
    const-string p0, "alertCheckboxMessage"

    .line 193
    .line 194
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v2, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 198
    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_7
    new-instance v0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 202
    .line 203
    const/4 v1, 0x0

    .line 204
    const/4 v2, 0x6

    .line 205
    invoke-direct {v0, p0, v1, v2}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 206
    .line 207
    .line 208
    invoke-static {}, La/jmu0;->d()I

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 213
    .line 214
    .line 215
    const p0, 0x7f0a02e4

    .line 216
    .line 217
    .line 218
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_8
    new-instance v0, Landroid/widget/TextView;

    .line 227
    .line 228
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 229
    .line 230
    .line 231
    invoke-static {}, La/jmu0;->d()I

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 236
    .line 237
    .line 238
    const-string p0, "alertMessage"

    .line 239
    .line 240
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v6}, Landroid/view/View;->setTextAlignment(I)V

    .line 244
    .line 245
    .line 246
    invoke-static {v2, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :pswitch_9
    new-instance v0, Landroid/widget/TextView;

    .line 251
    .line 252
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 253
    .line 254
    .line 255
    invoke-static {}, La/jmu0;->d()I

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 260
    .line 261
    .line 262
    const-string p0, "alertTitle"

    .line 263
    .line 264
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    const p0, 0x7f1404c3

    .line 268
    .line 269
    .line 270
    invoke-static {p0, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v6}, Landroid/view/View;->setTextAlignment(I)V

    .line 274
    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_a
    new-instance v0, Landroid/graphics/Paint;

    .line 278
    .line 279
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 280
    .line 281
    .line 282
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 283
    .line 284
    const v2, 0x7f0606da

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, v2}, Landroid/content/Context;->getColor(I)I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 292
    .line 293
    .line 294
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 295
    .line 296
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-static {v7, v1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 311
    .line 312
    .line 313
    move-result p0

    .line 314
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 315
    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_b
    sget v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->k1:I

    .line 319
    .line 320
    new-instance v0, Landroid/graphics/Paint;

    .line 321
    .line 322
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 323
    .line 324
    .line 325
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 326
    .line 327
    const v2, 0x7f040afc

    .line 328
    .line 329
    .line 330
    const/4 v3, 0x0

    .line 331
    invoke-static {p0, v2, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 336
    .line 337
    .line 338
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 339
    .line 340
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    invoke-static {v7, v1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 359
    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_c
    sget v0, Lorg/xplatform/market_statistic/ui/statisticwidget/LineChartView;->k1:I

    .line 363
    .line 364
    new-instance v0, La/nwb;

    .line 365
    .line 366
    invoke-direct {v0, p0}, La/nwb;-><init>(Landroid/content/Context;)V

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :pswitch_d
    new-instance v0, Landroid/graphics/Paint;

    .line 371
    .line 372
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 373
    .line 374
    .line 375
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 376
    .line 377
    const v1, 0x7f06069d

    .line 378
    .line 379
    .line 380
    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 385
    .line 386
    .line 387
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 388
    .line 389
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    const/high16 v1, 0x40400000    # 3.0f

    .line 404
    .line 405
    invoke-static {v7, v1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 406
    .line 407
    .line 408
    move-result p0

    .line 409
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 410
    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_e
    new-instance v0, Landroid/text/TextPaint;

    .line 414
    .line 415
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 419
    .line 420
    .line 421
    const v1, 0x7f140463

    .line 422
    .line 423
    .line 424
    invoke-static {v0, p0, v1}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 425
    .line 426
    .line 427
    return-object v0

    .line 428
    :pswitch_f
    sget-object v0, La/kit;->Q1:La/bek;

    .line 429
    .line 430
    invoke-static {p0}, La/j120;->S(Landroid/content/Context;)Landroid/app/Activity;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    if-eqz p0, :cond_1

    .line 435
    .line 436
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    if-eqz p0, :cond_1

    .line 441
    .line 442
    invoke-static {}, La/a8k0;->A()Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    if-eqz v0, :cond_0

    .line 447
    .line 448
    const/16 v0, 0x10

    .line 449
    .line 450
    goto :goto_0

    .line 451
    :cond_0
    const/16 v0, 0x30

    .line 452
    .line 453
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 454
    .line 455
    .line 456
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    return-object p0

    .line 459
    :pswitch_10
    sget-object v0, La/kit;->Q1:La/bek;

    .line 460
    .line 461
    invoke-static {p0}, La/j120;->S(Landroid/content/Context;)Landroid/app/Activity;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    if-eqz p0, :cond_2

    .line 466
    .line 467
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    if-eqz p0, :cond_2

    .line 472
    .line 473
    const/16 v0, 0x20

    .line 474
    .line 475
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 476
    .line 477
    .line 478
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    return-object p0

    .line 481
    :pswitch_11
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 482
    .line 483
    const v0, 0x7f080699

    .line 484
    .line 485
    .line 486
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    return-object p0

    .line 491
    :pswitch_12
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 492
    .line 493
    const v0, 0x7f080698

    .line 494
    .line 495
    .line 496
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 497
    .line 498
    .line 499
    move-result-object p0

    .line 500
    return-object p0

    .line 501
    :pswitch_13
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 502
    .line 503
    const v0, 0x7f080695

    .line 504
    .line 505
    .line 506
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    return-object p0

    .line 511
    :pswitch_14
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 512
    .line 513
    const v0, 0x7f080691

    .line 514
    .line 515
    .line 516
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 517
    .line 518
    .line 519
    move-result-object p0

    .line 520
    return-object p0

    .line 521
    :pswitch_15
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 522
    .line 523
    const v0, 0x7f080696

    .line 524
    .line 525
    .line 526
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    return-object p0

    .line 531
    :pswitch_16
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 532
    .line 533
    const v0, 0x7f080692

    .line 534
    .line 535
    .line 536
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    return-object p0

    .line 541
    :pswitch_17
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 542
    .line 543
    const v0, 0x7f080697

    .line 544
    .line 545
    .line 546
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 547
    .line 548
    .line 549
    move-result-object p0

    .line 550
    return-object p0

    .line 551
    :pswitch_18
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 552
    .line 553
    const v0, 0x7f080694

    .line 554
    .line 555
    .line 556
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 557
    .line 558
    .line 559
    move-result-object p0

    .line 560
    return-object p0

    .line 561
    :pswitch_19
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->A:I

    .line 562
    .line 563
    const v0, 0x7f080693

    .line 564
    .line 565
    .line 566
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    return-object p0

    .line 571
    :pswitch_1a
    const-string v0, "firebaseSessions/sessionDataStore.data"

    .line 572
    .line 573
    invoke-static {p0, v0}, La/slb;->P(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    invoke-static {p0}, La/m2a;->u(Ljava/io/File;)V

    .line 578
    .line 579
    .line 580
    return-object p0

    .line 581
    :pswitch_1b
    const-string v0, "firebaseSessions/sessionConfigsDataStore.data"

    .line 582
    .line 583
    invoke-static {p0, v0}, La/slb;->P(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 584
    .line 585
    .line 586
    move-result-object p0

    .line 587
    invoke-static {p0}, La/m2a;->u(Ljava/io/File;)V

    .line 588
    .line 589
    .line 590
    return-object p0

    .line 591
    :pswitch_1c
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->m1:I

    .line 592
    .line 593
    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 594
    .line 595
    .line 596
    move-result-object p0

    .line 597
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 598
    .line 599
    .line 600
    move-result p0

    .line 601
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 602
    .line 603
    .line 604
    move-result-object p0

    .line 605
    return-object p0

    .line 606
    nop

    .line 607
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
