.class public final synthetic La/hrf0;
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
    iput-byte p2, p0, La/hrf0;->a:B

    iput-object p1, p0, La/hrf0;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hrf0;->a:B

    .line 4
    .line 5
    const-string v6, "separator"

    .line 6
    .line 7
    const v8, 0x7f080859

    .line 8
    .line 9
    .line 10
    const v9, 0x7f14046f

    .line 11
    .line 12
    .line 13
    const v10, 0x7f0809fe

    .line 14
    .line 15
    .line 16
    const-string v11, "shareButton"

    .line 17
    .line 18
    const/4 v12, 0x5

    .line 19
    const-string v15, "betTypeCouponImage"

    .line 20
    .line 21
    const-string v2, "betType"

    .line 22
    .line 23
    const-string v13, "betNumber"

    .line 24
    .line 25
    const v3, 0x7f14044b

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x6

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v14, 0x0

    .line 31
    const/4 v7, 0x1

    .line 32
    iget-object v0, v0, La/hrf0;->b:Landroid/content/Context;

    .line 33
    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    sget-object v1, La/v9r0;->O1:La/j6m0;

    .line 38
    .line 39
    invoke-static {v0}, La/j120;->S(Landroid/content/Context;)Landroid/app/Activity;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    const/16 v1, 0x20

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 54
    .line 55
    .line 56
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    sget-object v1, La/v9r0;->O1:La/j6m0;

    .line 60
    .line 61
    invoke-static {v0}, La/j120;->S(Landroid/content/Context;)Landroid/app/Activity;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-static {}, La/a8k0;->A()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    const/16 v13, 0x10

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/16 v13, 0x30

    .line 83
    .line 84
    :goto_0
    invoke-virtual {v0, v13}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 85
    .line 86
    .line 87
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_1
    const v1, 0x7f01001f

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    :pswitch_2
    sget v1, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->x:I

    .line 99
    .line 100
    new-instance v1, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v1, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    :goto_1
    if-ge v5, v12, :cond_3

    .line 106
    .line 107
    new-instance v2, Landroid/widget/ImageView;

    .line 108
    .line 109
    invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    const/high16 v3, -0x40800000    # -1.0f

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleX(F)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    add-int/lit8 v5, v5, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    return-object v1

    .line 124
    :pswitch_3
    sget v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->q:I

    .line 125
    .line 126
    instance-of v1, v0, Landroid/app/Activity;

    .line 127
    .line 128
    if-eqz v1, :cond_4

    .line 129
    .line 130
    move-object v14, v0

    .line 131
    check-cast v14, Landroid/app/Activity;

    .line 132
    .line 133
    :cond_4
    if-eqz v14, :cond_5

    .line 134
    .line 135
    invoke-virtual {v14}, Landroid/app/Activity;->onBackPressed()V

    .line 136
    .line 137
    .line 138
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_4
    new-instance v1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 142
    .line 143
    invoke-direct {v1, v0, v14, v4, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 144
    .line 145
    .line 146
    invoke-static {}, La/jmu0;->d()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object v0, La/eul;->i:La/eul;

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, La/ful;->f:La/ful;

    .line 162
    .line 163
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 164
    .line 165
    .line 166
    sget-object v0, La/gul;->f:La/gul;

    .line 167
    .line 168
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonType(La/gul;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v10}, Lorg/xplatform/uikit/components/buttons/DsButton;->setIconRes(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 175
    .line 176
    .line 177
    return-object v1

    .line 178
    :pswitch_5
    new-instance v1, Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 181
    .line 182
    .line 183
    invoke-static {}, La/jmu0;->d()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 194
    .line 195
    .line 196
    invoke-static {v9, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 200
    .line 201
    .line 202
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :pswitch_6
    new-instance v1, Landroid/widget/TextView;

    .line 209
    .line 210
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 211
    .line 212
    .line 213
    invoke-static {}, La/jmu0;->d()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v3, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 230
    .line 231
    .line 232
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 233
    .line 234
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 235
    .line 236
    .line 237
    return-object v1

    .line 238
    :pswitch_7
    new-instance v1, Landroid/widget/ImageView;

    .line 239
    .line 240
    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 241
    .line 242
    .line 243
    invoke-static {}, La/jmu0;->d()I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v15}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 254
    .line 255
    .line 256
    const v2, 0x7f040b0b

    .line 257
    .line 258
    .line 259
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 268
    .line 269
    .line 270
    const v2, 0x7f040ae3

    .line 271
    .line 272
    .line 273
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v1, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 282
    .line 283
    .line 284
    return-object v1

    .line 285
    :pswitch_8
    new-instance v1, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 286
    .line 287
    invoke-direct {v1, v0, v14, v4, v5}, Lorg/xplatform/uikit/components/separator/DsSeparator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 288
    .line 289
    .line 290
    invoke-static {}, La/jmu0;->d()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    const v2, 0x7f040b17

    .line 301
    .line 302
    .line 303
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 308
    .line 309
    .line 310
    return-object v1

    .line 311
    :pswitch_9
    new-instance v1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 312
    .line 313
    invoke-direct {v1, v0, v14, v4, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 314
    .line 315
    .line 316
    invoke-static {}, La/jmu0;->d()I

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    sget-object v0, La/eul;->i:La/eul;

    .line 327
    .line 328
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, La/ful;->f:La/ful;

    .line 332
    .line 333
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 334
    .line 335
    .line 336
    sget-object v0, La/gul;->f:La/gul;

    .line 337
    .line 338
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonType(La/gul;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v10}, Lorg/xplatform/uikit/components/buttons/DsButton;->setIconRes(I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 345
    .line 346
    .line 347
    return-object v1

    .line 348
    :pswitch_a
    new-instance v1, Landroid/widget/TextView;

    .line 349
    .line 350
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 351
    .line 352
    .line 353
    invoke-static {}, La/jmu0;->d()I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 364
    .line 365
    .line 366
    invoke-static {v9, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 370
    .line 371
    .line 372
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 373
    .line 374
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 375
    .line 376
    .line 377
    return-object v1

    .line 378
    :pswitch_b
    new-instance v1, Landroid/widget/ImageView;

    .line 379
    .line 380
    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 381
    .line 382
    .line 383
    invoke-static {}, La/jmu0;->d()I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v15}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 394
    .line 395
    .line 396
    const v2, 0x7f040b0b

    .line 397
    .line 398
    .line 399
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 408
    .line 409
    .line 410
    const v2, 0x7f040ae3

    .line 411
    .line 412
    .line 413
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-static {v1, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 422
    .line 423
    .line 424
    return-object v1

    .line 425
    :pswitch_c
    new-instance v1, Landroid/widget/TextView;

    .line 426
    .line 427
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 428
    .line 429
    .line 430
    invoke-static {}, La/jmu0;->d()I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    invoke-static {v3, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 447
    .line 448
    .line 449
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 450
    .line 451
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 452
    .line 453
    .line 454
    return-object v1

    .line 455
    :pswitch_d
    new-instance v1, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 456
    .line 457
    invoke-direct {v1, v0, v14, v4, v5}, Lorg/xplatform/uikit/components/separator/DsSeparator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 458
    .line 459
    .line 460
    invoke-static {}, La/jmu0;->d()I

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    const v2, 0x7f040b17

    .line 471
    .line 472
    .line 473
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 478
    .line 479
    .line 480
    return-object v1

    .line 481
    :pswitch_e
    new-instance v1, Landroid/widget/TextView;

    .line 482
    .line 483
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 484
    .line 485
    .line 486
    invoke-static {}, La/jmu0;->d()I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 497
    .line 498
    .line 499
    invoke-static {v3, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 500
    .line 501
    .line 502
    const/4 v0, 0x3

    .line 503
    invoke-virtual {v1, v0}, Landroid/view/View;->setTextAlignment(I)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 507
    .line 508
    .line 509
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 510
    .line 511
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 512
    .line 513
    .line 514
    return-object v1

    .line 515
    :pswitch_f
    new-instance v1, Landroid/widget/ImageView;

    .line 516
    .line 517
    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 518
    .line 519
    .line 520
    invoke-static {}, La/jmu0;->d()I

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1, v15}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    const v2, 0x7f08085a

    .line 531
    .line 532
    .line 533
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 534
    .line 535
    .line 536
    const v2, 0x7f040ae3

    .line 537
    .line 538
    .line 539
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-static {v1, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 548
    .line 549
    .line 550
    return-object v1

    .line 551
    :pswitch_10
    new-instance v1, Landroid/widget/TextView;

    .line 552
    .line 553
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 554
    .line 555
    .line 556
    invoke-static {}, La/jmu0;->d()I

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    invoke-static {v3, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 573
    .line 574
    .line 575
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 576
    .line 577
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 578
    .line 579
    .line 580
    return-object v1

    .line 581
    :pswitch_11
    new-instance v1, Landroid/widget/TextView;

    .line 582
    .line 583
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 584
    .line 585
    .line 586
    invoke-static {}, La/jmu0;->d()I

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v1, v13}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 597
    .line 598
    .line 599
    invoke-static {v3, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 600
    .line 601
    .line 602
    const/4 v0, 0x3

    .line 603
    invoke-virtual {v1, v0}, Landroid/view/View;->setTextAlignment(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 607
    .line 608
    .line 609
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 610
    .line 611
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 612
    .line 613
    .line 614
    return-object v1

    .line 615
    :pswitch_12
    new-instance v1, Landroid/widget/ImageView;

    .line 616
    .line 617
    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 618
    .line 619
    .line 620
    invoke-static {}, La/jmu0;->d()I

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v1, v15}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    const v2, 0x7f08085a

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 634
    .line 635
    .line 636
    const v2, 0x7f040ae3

    .line 637
    .line 638
    .line 639
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-static {v1, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 648
    .line 649
    .line 650
    return-object v1

    .line 651
    :pswitch_13
    new-instance v1, Landroid/widget/TextView;

    .line 652
    .line 653
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 654
    .line 655
    .line 656
    invoke-static {}, La/jmu0;->d()I

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    invoke-static {v3, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 673
    .line 674
    .line 675
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 676
    .line 677
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 678
    .line 679
    .line 680
    return-object v1

    .line 681
    :pswitch_14
    sget v1, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->o:I

    .line 682
    .line 683
    new-instance v1, La/u0m;

    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    const/4 v2, 0x4

    .line 689
    invoke-direct {v1, v0, v14, v2, v5}, Lorg/xplatform/uikit/components/views/AppCompatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    const v2, 0x7f07067a

    .line 697
    .line 698
    .line 699
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 704
    .line 705
    invoke-direct {v2, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 706
    .line 707
    .line 708
    const/16 v0, 0x10

    .line 709
    .line 710
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 711
    .line 712
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 713
    .line 714
    .line 715
    return-object v1

    .line 716
    :pswitch_15
    sget v1, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->i:I

    .line 717
    .line 718
    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 719
    .line 720
    invoke-direct {v1, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 721
    .line 722
    .line 723
    invoke-static {}, La/jmu0;->d()I

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 728
    .line 729
    .line 730
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 731
    .line 732
    const/4 v2, -0x2

    .line 733
    invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 737
    .line 738
    .line 739
    const/16 v0, 0x10

    .line 740
    .line 741
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 742
    .line 743
    .line 744
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 745
    .line 746
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v1, v12}, Landroid/view/View;->setTextDirection(I)V

    .line 750
    .line 751
    .line 752
    const/4 v0, 0x2

    .line 753
    invoke-virtual {v1, v0}, Landroid/view/View;->setTextAlignment(I)V

    .line 754
    .line 755
    .line 756
    return-object v1

    .line 757
    :pswitch_16
    sget v1, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->n:I

    .line 758
    .line 759
    new-instance v1, Landroid/widget/FrameLayout;

    .line 760
    .line 761
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 762
    .line 763
    .line 764
    invoke-static {}, La/jmu0;->d()I

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 769
    .line 770
    .line 771
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 772
    .line 773
    const/4 v2, -0x1

    .line 774
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 778
    .line 779
    .line 780
    return-object v1

    .line 781
    :pswitch_17
    new-instance v1, Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 782
    .line 783
    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 784
    .line 785
    const v3, 0x7f140aae

    .line 786
    .line 787
    .line 788
    invoke-direct {v2, v0, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 789
    .line 790
    .line 791
    invoke-direct {v1, v2, v14, v4}, Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 792
    .line 793
    .line 794
    return-object v1

    .line 795
    :pswitch_18
    const v3, 0x7f140aae

    .line 796
    .line 797
    .line 798
    new-instance v1, Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 799
    .line 800
    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 801
    .line 802
    invoke-direct {v2, v0, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 803
    .line 804
    .line 805
    invoke-direct {v1, v2, v14, v4}, Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 806
    .line 807
    .line 808
    return-object v1

    .line 809
    :pswitch_19
    sget v1, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->m:I

    .line 810
    .line 811
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 823
    .line 824
    mul-int/lit8 v1, v0, 0x14

    .line 825
    .line 826
    div-int/lit8 v1, v1, 0x64

    .line 827
    .line 828
    new-instance v2, La/lrf0;

    .line 829
    .line 830
    invoke-direct {v2, v0, v1}, La/lrf0;-><init>(II)V

    .line 831
    .line 832
    .line 833
    return-object v2

    .line 834
    nop

    .line 835
    :pswitch_data_0
    .packed-switch 0x0
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
