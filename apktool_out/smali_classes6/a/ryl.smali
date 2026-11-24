.class public final synthetic La/ryl;
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
    iput-byte p2, p0, La/ryl;->a:B

    iput-object p1, p0, La/ryl;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ryl;->a:B

    .line 2
    .line 3
    const v1, 0x7f1404a4

    .line 4
    .line 5
    .line 6
    const-string v2, "DsLottieEmpty.DsButtonTag"

    .line 7
    .line 8
    const/4 v3, 0x6

    .line 9
    const/4 v4, 0x0

    .line 10
    const v5, 0x7f040afc

    .line 11
    .line 12
    .line 13
    const/high16 v6, 0x41800000    # 16.0f

    .line 14
    .line 15
    const/high16 v7, 0x41200000    # 10.0f

    .line 16
    .line 17
    const/4 v8, -0x1

    .line 18
    const/4 v9, 0x4

    .line 19
    const/16 v10, 0x8

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x1

    .line 23
    iget-object p0, p0, La/ryl;->b:Landroid/content/Context;

    .line 24
    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->m1:I

    .line 29
    .line 30
    new-instance v0, Landroid/text/TextPaint;

    .line 31
    .line 32
    invoke-direct {v0, v12}, Landroid/text/TextPaint;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget p0, p0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 50
    .line 51
    mul-float/2addr p0, v7

    .line 52
    float-to-double v1, p0

    .line 53
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    double-to-float p0, v1

    .line 58
    float-to-int p0, p0

    .line 59
    int-to-float p0, p0

    .line 60
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_0
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->m1:I

    .line 65
    .line 66
    new-instance v0, Landroid/text/TextPaint;

    .line 67
    .line 68
    invoke-direct {v0, v12}, Landroid/text/TextPaint;-><init>(I)V

    .line 69
    .line 70
    .line 71
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 72
    .line 73
    const v1, 0x7f040b72

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v1, v11}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const v2, 0x7f05000f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_0

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    const/high16 v6, 0x41400000    # 12.0f

    .line 98
    .line 99
    :goto_0
    const/4 v1, 0x0

    .line 100
    cmpg-float v1, v6, v1

    .line 101
    .line 102
    if-nez v1, :cond_1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget p0, p0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 114
    .line 115
    mul-float/2addr p0, v6

    .line 116
    float-to-double v1, p0

    .line 117
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    double-to-float p0, v1

    .line 122
    float-to-int v11, p0

    .line 123
    :goto_1
    int-to-float p0, v11

    .line 124
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_1
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->m1:I

    .line 129
    .line 130
    new-instance v0, Landroid/graphics/Paint;

    .line 131
    .line 132
    invoke-direct {v0, v12}, Landroid/graphics/Paint;-><init>(I)V

    .line 133
    .line 134
    .line 135
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 136
    .line 137
    invoke-static {p0, v5, v11}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 142
    .line 143
    .line 144
    sget-object p0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 145
    .line 146
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 147
    .line 148
    .line 149
    const/high16 p0, 0x40a00000    # 5.0f

    .line 150
    .line 151
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_2
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->m1:I

    .line 156
    .line 157
    const v0, 0x7f1308b9

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_3
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->Y1:I

    .line 178
    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 191
    .line 192
    mul-float/2addr p0, v6

    .line 193
    float-to-double v0, p0

    .line 194
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 195
    .line 196
    .line 197
    move-result-wide v0

    .line 198
    double-to-float p0, v0

    .line 199
    float-to-int p0, p0

    .line 200
    int-to-float p0, p0

    .line 201
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :pswitch_4
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->Y1:I

    .line 207
    .line 208
    new-instance v0, Landroid/text/TextPaint;

    .line 209
    .line 210
    invoke-direct {v0, v12}, Landroid/text/TextPaint;-><init>(I)V

    .line 211
    .line 212
    .line 213
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 214
    .line 215
    const v1, 0x7f040b0b

    .line 216
    .line 217
    .line 218
    invoke-static {p0, v1, v11}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    iget p0, p0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 234
    .line 235
    mul-float/2addr p0, v7

    .line 236
    float-to-double v1, p0

    .line 237
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 238
    .line 239
    .line 240
    move-result-wide v1

    .line 241
    double-to-float p0, v1

    .line 242
    float-to-int p0, p0

    .line 243
    int-to-float p0, p0

    .line 244
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 245
    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_5
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->Y1:I

    .line 249
    .line 250
    new-instance v0, Landroid/graphics/Paint;

    .line 251
    .line 252
    invoke-direct {v0, v12}, Landroid/graphics/Paint;-><init>(I)V

    .line 253
    .line 254
    .line 255
    const v1, 0x7f0606a5

    .line 256
    .line 257
    .line 258
    invoke-static {v1, p0}, La/sj3;->P(ILandroid/content/Context;)I

    .line 259
    .line 260
    .line 261
    move-result p0

    .line 262
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 263
    .line 264
    .line 265
    return-object v0

    .line 266
    :pswitch_6
    sget v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->Y1:I

    .line 267
    .line 268
    new-instance v0, Landroid/graphics/Paint;

    .line 269
    .line 270
    invoke-direct {v0, v12}, Landroid/graphics/Paint;-><init>(I)V

    .line 271
    .line 272
    .line 273
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 274
    .line 275
    const v1, 0x7f040b15

    .line 276
    .line 277
    .line 278
    invoke-static {p0, v1, v11}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 283
    .line 284
    .line 285
    return-object v0

    .line 286
    :pswitch_7
    sget v0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->w:I

    .line 287
    .line 288
    const v0, 0x7f0808ba

    .line 289
    .line 290
    .line 291
    invoke-static {v0, p0}, La/wvb;->R(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    return-object p0

    .line 296
    :pswitch_8
    sget v0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->w:I

    .line 297
    .line 298
    const v0, 0x7f0808b9

    .line 299
    .line 300
    .line 301
    invoke-static {v0, p0}, La/wvb;->R(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    return-object p0

    .line 306
    :pswitch_9
    sget v0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->w:I

    .line 307
    .line 308
    const v0, 0x7f0808b8

    .line 309
    .line 310
    .line 311
    invoke-static {v0, p0}, La/wvb;->R(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    return-object p0

    .line 316
    :pswitch_a
    sget v0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->w:I

    .line 317
    .line 318
    const v0, 0x7f0808b7

    .line 319
    .line 320
    .line 321
    invoke-static {v0, p0}, La/wvb;->R(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0

    .line 326
    :pswitch_b
    sget v0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->w:I

    .line 327
    .line 328
    const v0, 0x7f0808b6

    .line 329
    .line 330
    .line 331
    invoke-static {v0, p0}, La/wvb;->R(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    return-object p0

    .line 336
    :pswitch_c
    sget v0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->s:I

    .line 337
    .line 338
    const v0, 0x7f010035

    .line 339
    .line 340
    .line 341
    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_d
    sget v0, Lorg/xplatform/uikit_sport/eventcard/top/EventCardHeader;->A:I

    .line 347
    .line 348
    new-instance v0, Landroid/widget/TextView;

    .line 349
    .line 350
    new-instance v1, La/tje;

    .line 351
    .line 352
    const v2, 0x7f140453

    .line 353
    .line 354
    .line 355
    invoke-direct {v1, p0, v2}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 356
    .line 357
    .line 358
    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 359
    .line 360
    .line 361
    const v1, 0x7f0606da

    .line 362
    .line 363
    .line 364
    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 369
    .line 370
    .line 371
    const/16 v1, 0x11

    .line 372
    .line 373
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 374
    .line 375
    .line 376
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 377
    .line 378
    const/4 v2, -0x2

    .line 379
    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 383
    .line 384
    .line 385
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 390
    .line 391
    .line 392
    const/high16 v1, 0x41000000    # 8.0f

    .line 393
    .line 394
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 395
    .line 396
    .line 397
    const v1, 0x7f0804d9

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 405
    .line 406
    .line 407
    return-object v0

    .line 408
    :pswitch_e
    sget-object v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;->y:Landroid/graphics/Bitmap;

    .line 409
    .line 410
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    const v0, 0x7f070717

    .line 415
    .line 416
    .line 417
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    float-to-int p0, p0

    .line 422
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    return-object p0

    .line 427
    :pswitch_f
    sget v0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->u:I

    .line 428
    .line 429
    invoke-static {v5, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 430
    .line 431
    .line 432
    move-result p0

    .line 433
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    return-object p0

    .line 438
    :pswitch_10
    sget v0, Lorg/xplatform/pin_code/impl/presentation/views/enteringpincode/EnteringPinCode;->u:I

    .line 439
    .line 440
    const v0, 0x7f040b0f

    .line 441
    .line 442
    .line 443
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 444
    .line 445
    .line 446
    move-result p0

    .line 447
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    return-object p0

    .line 452
    :pswitch_11
    sget v0, Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;->l:I

    .line 453
    .line 454
    new-instance v0, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 455
    .line 456
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 457
    .line 458
    const v2, 0x7f1407bb

    .line 459
    .line 460
    .line 461
    invoke-direct {v1, p0, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 462
    .line 463
    .line 464
    invoke-direct {v0, v1, v4, v3, v11}, Lorg/xplatform/uikit/components/separator/DsSeparator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 468
    .line 469
    .line 470
    return-object v0

    .line 471
    :pswitch_12
    sget v0, Lorg/xplatform/uikit/components/cells/DsMenuCell;->g1:I

    .line 472
    .line 473
    new-instance v0, Landroid/widget/ImageView;

    .line 474
    .line 475
    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 476
    .line 477
    .line 478
    const v1, 0x7f0809ec

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 482
    .line 483
    .line 484
    const v1, 0x7f040b0e

    .line 485
    .line 486
    .line 487
    invoke-static {v1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 488
    .line 489
    .line 490
    move-result p0

    .line 491
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 492
    .line 493
    .line 494
    return-object v0

    .line 495
    :pswitch_13
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->t:I

    .line 496
    .line 497
    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 498
    .line 499
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 500
    .line 501
    .line 502
    invoke-static {}, La/jmu0;->d()I

    .line 503
    .line 504
    .line 505
    move-result p0

    .line 506
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0, v9}, Landroid/view/View;->setTextAlignment(I)V

    .line 516
    .line 517
    .line 518
    invoke-static {v1, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 519
    .line 520
    .line 521
    return-object v0

    .line 522
    :pswitch_14
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->t:I

    .line 523
    .line 524
    new-instance v0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 525
    .line 526
    invoke-direct {v0, p0, v4, v3, v11}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 527
    .line 528
    .line 529
    invoke-static {}, La/jmu0;->d()I

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 540
    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_15
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->t:I

    .line 544
    .line 545
    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 546
    .line 547
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 548
    .line 549
    .line 550
    invoke-static {}, La/jmu0;->d()I

    .line 551
    .line 552
    .line 553
    move-result p0

    .line 554
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 555
    .line 556
    .line 557
    const-string p0, "DsLottieEmpty.SubtitleViewTag"

    .line 558
    .line 559
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v9}, Landroid/view/View;->setTextAlignment(I)V

    .line 566
    .line 567
    .line 568
    const p0, 0x7f14048f

    .line 569
    .line 570
    .line 571
    invoke-static {p0, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 572
    .line 573
    .line 574
    return-object v0

    .line 575
    :pswitch_16
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->t:I

    .line 576
    .line 577
    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 578
    .line 579
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 580
    .line 581
    .line 582
    invoke-static {}, La/jmu0;->d()I

    .line 583
    .line 584
    .line 585
    move-result p0

    .line 586
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 587
    .line 588
    .line 589
    const-string p0, "DsLottieEmpty.TitleViewTag"

    .line 590
    .line 591
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v0, v9}, Landroid/view/View;->setTextAlignment(I)V

    .line 598
    .line 599
    .line 600
    const p0, 0x7f1404ca

    .line 601
    .line 602
    .line 603
    invoke-static {p0, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 604
    .line 605
    .line 606
    return-object v0

    .line 607
    :pswitch_17
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->t:I

    .line 608
    .line 609
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 610
    .line 611
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 612
    .line 613
    .line 614
    invoke-static {}, La/jmu0;->d()I

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 619
    .line 620
    .line 621
    const-string v1, "DsLottieEmpty.IconViewTag"

    .line 622
    .line 623
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 627
    .line 628
    .line 629
    const v1, 0x7f040b10

    .line 630
    .line 631
    .line 632
    invoke-static {v1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 633
    .line 634
    .line 635
    move-result p0

    .line 636
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 641
    .line 642
    .line 643
    const p0, 0x7f080827

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 647
    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_18
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->t:I

    .line 651
    .line 652
    new-instance v0, Lcom/airbnb/lottie/LottieAnimationView;

    .line 653
    .line 654
    invoke-direct {v0, p0}, Lcom/airbnb/lottie/LottieAnimationView;-><init>(Landroid/content/Context;)V

    .line 655
    .line 656
    .line 657
    invoke-static {}, La/jmu0;->d()I

    .line 658
    .line 659
    .line 660
    move-result p0

    .line 661
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 662
    .line 663
    .line 664
    const-string p0, "DsLottieEmpty.LottieAnimationViewTag"

    .line 665
    .line 666
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v0, v8}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    .line 670
    .line 671
    .line 672
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 673
    .line 674
    const/16 v1, 0x1a

    .line 675
    .line 676
    if-eq p0, v1, :cond_3

    .line 677
    .line 678
    const/16 v1, 0x1b

    .line 679
    .line 680
    if-ne p0, v1, :cond_2

    .line 681
    .line 682
    goto :goto_2

    .line 683
    :cond_2
    sget-object p0, La/ijf0;->a:La/ijf0;

    .line 684
    .line 685
    goto :goto_3

    .line 686
    :cond_3
    :goto_2
    sget-object p0, La/ijf0;->c:La/ijf0;

    .line 687
    .line 688
    :goto_3
    invoke-virtual {v0, p0}, Lcom/airbnb/lottie/LottieAnimationView;->setRenderMode(La/ijf0;)V

    .line 689
    .line 690
    .line 691
    return-object v0

    .line 692
    :pswitch_19
    sget v0, Lorg/xplatform/uikit/components/counter/DsCounter;->i:I

    .line 693
    .line 694
    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 695
    .line 696
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 697
    .line 698
    .line 699
    invoke-static {}, La/jmu0;->d()I

    .line 700
    .line 701
    .line 702
    move-result p0

    .line 703
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 704
    .line 705
    .line 706
    const/4 p0, 0x3

    .line 707
    invoke-virtual {v0, p0}, Landroid/view/View;->setTextDirection(I)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0, v9}, Landroid/view/View;->setTextAlignment(I)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 714
    .line 715
    .line 716
    sget-object p0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 717
    .line 718
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 719
    .line 720
    .line 721
    invoke-static {v1, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 722
    .line 723
    .line 724
    return-object v0

    .line 725
    :pswitch_1a
    sget v0, Lorg/xplatform/uikit/components/counter/DsCounter;->i:I

    .line 726
    .line 727
    const v0, 0x7f080816

    .line 728
    .line 729
    .line 730
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 731
    .line 732
    .line 733
    move-result-object p0

    .line 734
    return-object p0

    .line 735
    :pswitch_1b
    sget v0, Lorg/xplatform/uikit/components/counter/DsCounter;->i:I

    .line 736
    .line 737
    const v0, 0x7f08081f

    .line 738
    .line 739
    .line 740
    invoke-static {v0, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 741
    .line 742
    .line 743
    move-result-object p0

    .line 744
    return-object p0

    .line 745
    :pswitch_1c
    new-instance v0, La/m900;

    .line 746
    .line 747
    invoke-direct {v0, p0}, La/m900;-><init>(Landroid/content/Context;)V

    .line 748
    .line 749
    .line 750
    return-object v0

    .line 751
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
