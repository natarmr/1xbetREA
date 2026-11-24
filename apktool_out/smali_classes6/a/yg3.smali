.class public final synthetic La/yg3;
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
    iput-byte p2, p0, La/yg3;->a:B

    iput-object p1, p0, La/yg3;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/yg3;->a:B

    .line 2
    .line 3
    const v1, 0x7f1404ca

    .line 4
    .line 5
    .line 6
    const v2, 0x7f040b17

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const v4, 0x7f14048f

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x6

    .line 15
    const/4 v7, 0x0

    .line 16
    iget-object p0, p0, La/yg3;->b:Landroid/content/Context;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->i:I

    .line 22
    .line 23
    new-instance v0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 24
    .line 25
    invoke-direct {v0, p0, v7, v6, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 26
    .line 27
    .line 28
    sget-object p0, La/eul;->g:La/eul;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, La/ful;->g:La/ful;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, La/gul;->i:La/gul;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonType(La/gul;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    sget v0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->s:I

    .line 45
    .line 46
    const v0, 0x7f040ae1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_1
    sget v0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->s:I

    .line 59
    .line 60
    const v0, 0x7f080350

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :pswitch_2
    sget v0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->z:I

    .line 69
    .line 70
    const v0, 0x7f010059

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :pswitch_3
    sget v0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->z:I

    .line 79
    .line 80
    const v0, 0x7f010058

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_4
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 89
    .line 90
    const v0, 0x7f040b5f

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v0, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :pswitch_5
    sget v0, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->l:I

    .line 103
    .line 104
    new-instance v0, Landroid/widget/ImageView;

    .line 105
    .line 106
    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 107
    .line 108
    .line 109
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 110
    .line 111
    const/4 v1, -0x2

    .line 112
    invoke-direct {p0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 116
    .line 117
    .line 118
    const-string p0, "PickLabelImageView"

    .line 119
    .line 120
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 133
    .line 134
    const/high16 v0, 0x43200000    # 160.0f

    .line 135
    .line 136
    mul-float/2addr p0, v0

    .line 137
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    new-instance v0, Landroid/view/View;

    .line 143
    .line 144
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v2, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_8
    new-instance v0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 156
    .line 157
    invoke-direct {v0, p0, v7, v6, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 158
    .line 159
    .line 160
    invoke-static {}, La/jmu0;->d()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 165
    .line 166
    .line 167
    const-string p0, "bottomButtonCustomLottie"

    .line 168
    .line 169
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    sget-object p0, La/ful;->f:La/ful;

    .line 173
    .line 174
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 175
    .line 176
    .line 177
    sget-object p0, La/eul;->h:La/eul;

    .line 178
    .line 179
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_9
    new-instance v0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 184
    .line 185
    invoke-direct {v0, p0, v7, v6, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 186
    .line 187
    .line 188
    invoke-static {}, La/jmu0;->d()I

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 193
    .line 194
    .line 195
    const-string p0, "middleButtonCustomLottie"

    .line 196
    .line 197
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    sget-object p0, La/ful;->f:La/ful;

    .line 201
    .line 202
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 203
    .line 204
    .line 205
    sget-object p0, La/eul;->h:La/eul;

    .line 206
    .line 207
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 208
    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_a
    new-instance v0, Landroid/widget/TextView;

    .line 212
    .line 213
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 214
    .line 215
    .line 216
    invoke-static {}, La/jmu0;->d()I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 221
    .line 222
    .line 223
    const-string p0, "alertCheckboxMessageCustomLottie"

    .line 224
    .line 225
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v4, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_b
    new-instance v0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 233
    .line 234
    invoke-direct {v0, p0, v7, v6}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 235
    .line 236
    .line 237
    invoke-static {}, La/jmu0;->d()I

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 242
    .line 243
    .line 244
    const-string p0, "alertCheckboxCustomLottie"

    .line 245
    .line 246
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :pswitch_c
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
    const-string p0, "alertMessageCustomLottie"

    .line 263
    .line 264
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v3}, Landroid/view/View;->setTextAlignment(I)V

    .line 268
    .line 269
    .line 270
    invoke-static {v4, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 271
    .line 272
    .line 273
    return-object v0

    .line 274
    :pswitch_d
    new-instance v0, Landroid/widget/TextView;

    .line 275
    .line 276
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 277
    .line 278
    .line 279
    invoke-static {}, La/jmu0;->d()I

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 284
    .line 285
    .line 286
    const-string p0, "alertTitleCustomLottie"

    .line 287
    .line 288
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v1, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v3}, Landroid/view/View;->setTextAlignment(I)V

    .line 295
    .line 296
    .line 297
    return-object v0

    .line 298
    :pswitch_e
    new-instance v0, Landroid/view/View;

    .line 299
    .line 300
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v2, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 308
    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_f
    new-instance v0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 312
    .line 313
    invoke-direct {v0, p0, v7, v6, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 314
    .line 315
    .line 316
    invoke-static {}, La/jmu0;->d()I

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 321
    .line 322
    .line 323
    const-string p0, "bottomButtonCustom"

    .line 324
    .line 325
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    sget-object p0, La/ful;->f:La/ful;

    .line 329
    .line 330
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 331
    .line 332
    .line 333
    sget-object p0, La/eul;->h:La/eul;

    .line 334
    .line 335
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 336
    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_10
    new-instance v0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 340
    .line 341
    invoke-direct {v0, p0, v7, v6, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 342
    .line 343
    .line 344
    invoke-static {}, La/jmu0;->d()I

    .line 345
    .line 346
    .line 347
    move-result p0

    .line 348
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 349
    .line 350
    .line 351
    const-string p0, "middleButtonCustom"

    .line 352
    .line 353
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    sget-object p0, La/ful;->f:La/ful;

    .line 357
    .line 358
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 359
    .line 360
    .line 361
    sget-object p0, La/eul;->h:La/eul;

    .line 362
    .line 363
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 364
    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_11
    new-instance v0, Landroid/widget/TextView;

    .line 368
    .line 369
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 370
    .line 371
    .line 372
    invoke-static {}, La/jmu0;->d()I

    .line 373
    .line 374
    .line 375
    move-result p0

    .line 376
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 377
    .line 378
    .line 379
    const-string p0, "alertCheckboxMessageCustom"

    .line 380
    .line 381
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v4, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 385
    .line 386
    .line 387
    return-object v0

    .line 388
    :pswitch_12
    new-instance v0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 389
    .line 390
    invoke-direct {v0, p0, v7, v6}, Lorg/xplatform/uikit/components/check_box/DsCheckbox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 391
    .line 392
    .line 393
    invoke-static {}, La/jmu0;->d()I

    .line 394
    .line 395
    .line 396
    move-result p0

    .line 397
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 398
    .line 399
    .line 400
    const-string p0, "alertCheckboxCustom"

    .line 401
    .line 402
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    return-object v0

    .line 406
    :pswitch_13
    new-instance v0, Landroid/widget/TextView;

    .line 407
    .line 408
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 409
    .line 410
    .line 411
    invoke-static {}, La/jmu0;->d()I

    .line 412
    .line 413
    .line 414
    move-result p0

    .line 415
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 416
    .line 417
    .line 418
    const-string p0, "alertMessageCustom"

    .line 419
    .line 420
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0, v3}, Landroid/view/View;->setTextAlignment(I)V

    .line 424
    .line 425
    .line 426
    invoke-static {v4, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 427
    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_14
    new-instance v0, Landroid/widget/TextView;

    .line 431
    .line 432
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 433
    .line 434
    .line 435
    invoke-static {}, La/jmu0;->d()I

    .line 436
    .line 437
    .line 438
    move-result p0

    .line 439
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 440
    .line 441
    .line 442
    const-string p0, "alertTitleCustom"

    .line 443
    .line 444
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    invoke-static {v1, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v3}, Landroid/view/View;->setTextAlignment(I)V

    .line 451
    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_15
    invoke-static {p0}, La/j120;->S(Landroid/content/Context;)Landroid/app/Activity;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    if-eqz p0, :cond_0

    .line 459
    .line 460
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    if-eqz p0, :cond_0

    .line 465
    .line 466
    const/16 v0, 0x20

    .line 467
    .line 468
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 469
    .line 470
    .line 471
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object p0

    .line 474
    :pswitch_16
    invoke-static {p0}, La/j120;->S(Landroid/content/Context;)Landroid/app/Activity;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    if-eqz p0, :cond_1

    .line 479
    .line 480
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    if-eqz p0, :cond_1

    .line 485
    .line 486
    const/16 v0, 0x10

    .line 487
    .line 488
    invoke-virtual {p0, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 489
    .line 490
    .line 491
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    return-object p0

    .line 494
    :pswitch_17
    new-instance v0, La/veg0;

    .line 495
    .line 496
    invoke-direct {v0, p0}, La/veg0;-><init>(Landroid/content/Context;)V

    .line 497
    .line 498
    .line 499
    return-object v0

    .line 500
    :pswitch_18
    sget v0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->B:I

    .line 501
    .line 502
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    const-string v0, "navigation_mode"

    .line 507
    .line 508
    invoke-static {p0, v0, v5}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 509
    .line 510
    .line 511
    move-result p0

    .line 512
    const/4 v0, 0x2

    .line 513
    if-ne p0, v0, :cond_2

    .line 514
    .line 515
    const/4 v5, 0x1

    .line 516
    :cond_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 517
    .line 518
    .line 519
    move-result-object p0

    .line 520
    return-object p0

    .line 521
    :pswitch_19
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 522
    .line 523
    .line 524
    move-result-object p0

    .line 525
    const v0, 0x7f070722

    .line 526
    .line 527
    .line 528
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 529
    .line 530
    .line 531
    move-result p0

    .line 532
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    return-object p0

    .line 537
    :pswitch_1a
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 538
    .line 539
    .line 540
    move-result-object p0

    .line 541
    const v0, 0x7f07072d

    .line 542
    .line 543
    .line 544
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 545
    .line 546
    .line 547
    move-result p0

    .line 548
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    return-object p0

    .line 553
    :pswitch_1b
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    const v0, 0x7f0706ea

    .line 558
    .line 559
    .line 560
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 561
    .line 562
    .line 563
    move-result p0

    .line 564
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    return-object p0

    .line 569
    :pswitch_1c
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    const v0, 0x7f0706f8

    .line 574
    .line 575
    .line 576
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 577
    .line 578
    .line 579
    move-result p0

    .line 580
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object p0

    .line 584
    return-object p0

    .line 585
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
