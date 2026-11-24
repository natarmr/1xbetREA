.class public final synthetic La/kzi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/kzi0;->a:B

    iput-object p1, p0, La/kzi0;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/t9f;La/cp;)V
    .locals 0

    .line 1
    const/16 p1, 0x19

    iput-byte p1, p0, La/kzi0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/kzi0;->b:La/cp;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kzi0;->a:B

    .line 4
    .line 5
    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 6
    .line 7
    const v3, 0x7f040ae1

    .line 8
    .line 9
    .line 10
    const v4, 0x7f080f06

    .line 11
    .line 12
    .line 13
    const v5, 0x7f040b0b

    .line 14
    .line 15
    .line 16
    const-string v6, ""

    .line 17
    .line 18
    const/16 v7, 0x8

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x1

    .line 22
    const/4 v10, 0x0

    .line 23
    iget-object v0, v0, La/kzi0;->b:La/cp;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 36
    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, La/m6u0;

    .line 39
    .line 40
    iget-object v2, v2, La/m6u0;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 41
    .line 42
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, La/r6u0;

    .line 47
    .line 48
    iget-object v3, v3, La/r6u0;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast v1, La/m6u0;

    .line 54
    .line 55
    iget-object v2, v1, La/m6u0;->b:Lorg/xplatform/uikit/components/password_requirement/DsBulletList;

    .line 56
    .line 57
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v1, La/m6u0;->b:Lorg/xplatform/uikit/components/password_requirement/DsBulletList;

    .line 61
    .line 62
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, La/r6u0;

    .line 70
    .line 71
    iget-object v2, v2, La/r6u0;->c:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_0

    .line 78
    .line 79
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/r6u0;

    .line 91
    .line 92
    iget-object v0, v0, La/r6u0;->c:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/password_requirement/DsBulletList;->setLabels(Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_0
    move-object/from16 v1, p1

    .line 101
    .line 102
    check-cast v1, Ljava/util/List;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 108
    .line 109
    check-cast v0, La/e3k;

    .line 110
    .line 111
    iget-object v0, v0, La/e3k;->b:Landroid/widget/TextView;

    .line 112
    .line 113
    const-string v1, "-------------"

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_1
    move-object/from16 v1, p1

    .line 122
    .line 123
    check-cast v1, Ljava/util/List;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, La/b240;

    .line 133
    .line 134
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 135
    .line 136
    check-cast v0, La/dux;

    .line 137
    .line 138
    iget-object v2, v0, La/dux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 139
    .line 140
    iget v3, v1, La/b240;->d:I

    .line 141
    .line 142
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 143
    .line 144
    .line 145
    iget-object v2, v0, La/dux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 146
    .line 147
    iget-boolean v3, v1, La/b240;->b:Z

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 150
    .line 151
    .line 152
    iget-object v2, v0, La/dux;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 153
    .line 154
    iget-object v3, v1, La/b240;->e:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    iget-object v3, v1, La/b240;->f:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v0, La/dux;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 165
    .line 166
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v4, v1, La/b240;->g:Ljava/lang/String;

    .line 176
    .line 177
    new-instance v8, La/k9;

    .line 178
    .line 179
    const/16 v1, 0x10

    .line 180
    .line 181
    invoke-direct {v8, v0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 182
    .line 183
    .line 184
    new-instance v9, La/k9;

    .line 185
    .line 186
    const/16 v1, 0x11

    .line 187
    .line 188
    invoke-direct {v9, v0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 189
    .line 190
    .line 191
    const/16 v10, 0xe

    .line 192
    .line 193
    const/4 v5, 0x0

    .line 194
    const/4 v6, 0x0

    .line 195
    const/4 v7, 0x0

    .line 196
    invoke-static/range {v3 .. v10}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 197
    .line 198
    .line 199
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_2
    move-object/from16 v1, p1

    .line 203
    .line 204
    check-cast v1, Ljava/util/List;

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    check-cast v1, La/b240;

    .line 214
    .line 215
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 216
    .line 217
    check-cast v0, La/zvx;

    .line 218
    .line 219
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 220
    .line 221
    iget v3, v1, La/b240;->d:I

    .line 222
    .line 223
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 224
    .line 225
    .line 226
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 227
    .line 228
    iget-boolean v3, v1, La/b240;->b:Z

    .line 229
    .line 230
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 231
    .line 232
    .line 233
    iget-object v0, v0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 234
    .line 235
    iget-object v2, v1, La/b240;->e:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    iget-object v1, v1, La/b240;->f:Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 243
    .line 244
    .line 245
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_3
    move-object/from16 v1, p1

    .line 249
    .line 250
    check-cast v1, Landroid/view/View;

    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, La/l8s0;

    .line 260
    .line 261
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, La/l8s0;

    .line 266
    .line 267
    sget-object v0, La/dsh;->V1:La/usd;

    .line 268
    .line 269
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_4
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, Ljava/util/List;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 284
    .line 285
    check-cast v1, La/c8s0;

    .line 286
    .line 287
    iget-boolean v1, v1, La/c8s0;->f:Z

    .line 288
    .line 289
    if-eqz v1, :cond_2

    .line 290
    .line 291
    move-object v1, v2

    .line 292
    check-cast v1, La/lnh;

    .line 293
    .line 294
    iget-object v1, v1, La/lnh;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    if-eqz v3, :cond_1

    .line 304
    .line 305
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 306
    .line 307
    iget-object v4, v0, La/cp;->w:Landroid/content/Context;

    .line 308
    .line 309
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    const v5, 0x7f07072d

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 321
    .line 322
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 323
    .line 324
    .line 325
    goto :goto_1

    .line 326
    :cond_1
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 327
    .line 328
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_2
    :goto_1
    check-cast v2, La/lnh;

    .line 333
    .line 334
    iget-object v1, v2, La/lnh;->e:Landroid/widget/TextView;

    .line 335
    .line 336
    iget-object v3, v2, La/lnh;->c:Landroid/widget/TextView;

    .line 337
    .line 338
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    check-cast v4, La/c8s0;

    .line 343
    .line 344
    iget-object v4, v4, La/c8s0;->c:Ljava/lang/String;

    .line 345
    .line 346
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 350
    .line 351
    iget-object v11, v2, La/lnh;->b:Landroid/widget/ImageView;

    .line 352
    .line 353
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    check-cast v1, La/c8s0;

    .line 358
    .line 359
    iget-object v12, v1, La/c8s0;->d:Ljava/lang/String;

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    const/16 v18, 0x1fc

    .line 364
    .line 365
    const v13, 0x7f0804d0

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const/4 v15, 0x0

    .line 370
    const/16 v16, 0x0

    .line 371
    .line 372
    invoke-static/range {v11 .. v18}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    check-cast v1, La/c8s0;

    .line 380
    .line 381
    iget v1, v1, La/c8s0;->b:I

    .line 382
    .line 383
    int-to-float v1, v1

    .line 384
    invoke-virtual {v3, v10, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    check-cast v1, La/c8s0;

    .line 392
    .line 393
    iget-object v1, v1, La/c8s0;->a:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    iget-object v1, v2, La/lnh;->d:Landroid/widget/TextView;

    .line 399
    .line 400
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, La/c8s0;

    .line 405
    .line 406
    iget-object v0, v0, La/c8s0;->e:Ljava/lang/String;

    .line 407
    .line 408
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 409
    .line 410
    .line 411
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    :goto_2
    return-object v8

    .line 414
    :pswitch_5
    move-object/from16 v1, p1

    .line 415
    .line 416
    check-cast v1, Ljava/util/List;

    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 426
    .line 427
    check-cast v1, La/o5s0;

    .line 428
    .line 429
    iget-object v1, v1, La/o5s0;->b:Ljava/lang/String;

    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    const v3, 0x7f0807c8

    .line 436
    .line 437
    .line 438
    if-nez v1, :cond_3

    .line 439
    .line 440
    move-object v1, v2

    .line 441
    check-cast v1, La/hs10;

    .line 442
    .line 443
    iget-object v1, v1, La/hs10;->b:Landroid/widget/ImageView;

    .line 444
    .line 445
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    check-cast v4, La/o5s0;

    .line 450
    .line 451
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 452
    .line 453
    .line 454
    goto :goto_3

    .line 455
    :cond_3
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 456
    .line 457
    move-object v1, v2

    .line 458
    check-cast v1, La/hs10;

    .line 459
    .line 460
    iget-object v1, v1, La/hs10;->b:Landroid/widget/ImageView;

    .line 461
    .line 462
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    check-cast v4, La/o5s0;

    .line 467
    .line 468
    iget-object v4, v4, La/o5s0;->b:Ljava/lang/String;

    .line 469
    .line 470
    iget-object v5, v0, La/cp;->w:Landroid/content/Context;

    .line 471
    .line 472
    invoke-static {v3, v5}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-static {v1, v4, v3}, La/u0d;->p(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 477
    .line 478
    .line 479
    :goto_3
    check-cast v2, La/hs10;

    .line 480
    .line 481
    iget-object v1, v2, La/hs10;->c:Landroid/widget/TextView;

    .line 482
    .line 483
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    check-cast v0, La/o5s0;

    .line 488
    .line 489
    iget-object v0, v0, La/o5s0;->a:Ljava/lang/String;

    .line 490
    .line 491
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    .line 493
    .line 494
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    return-object v0

    .line 497
    :pswitch_6
    move-object/from16 v1, p1

    .line 498
    .line 499
    check-cast v1, Ljava/util/List;

    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 505
    .line 506
    check-cast v1, La/gs10;

    .line 507
    .line 508
    iget-object v2, v1, La/gs10;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 509
    .line 510
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    check-cast v3, La/v1s0;

    .line 515
    .line 516
    iget-object v3, v3, La/v1s0;->b:Ljava/lang/String;

    .line 517
    .line 518
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    if-lez v3, :cond_4

    .line 523
    .line 524
    move v3, v10

    .line 525
    goto :goto_4

    .line 526
    :cond_4
    move v3, v7

    .line 527
    :goto_4
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 528
    .line 529
    .line 530
    iget-object v2, v1, La/gs10;->f:Landroid/widget/TextView;

    .line 531
    .line 532
    iget-object v3, v1, La/gs10;->j:Landroid/widget/TextView;

    .line 533
    .line 534
    iget-object v4, v1, La/gs10;->i:Lorg/xplatform/cyber/section/impl/championships/regular/presentation/world_cup/tournament_info/ExpandableTextView;

    .line 535
    .line 536
    iget-object v5, v1, La/gs10;->d:Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 537
    .line 538
    iget-object v8, v1, La/gs10;->k:Lorg/xplatform/ui_core/GradientTextView;

    .line 539
    .line 540
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v11

    .line 544
    check-cast v11, La/v1s0;

    .line 545
    .line 546
    iget-object v11, v11, La/v1s0;->b:Ljava/lang/String;

    .line 547
    .line 548
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 549
    .line 550
    .line 551
    iget-object v2, v1, La/gs10;->m:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 552
    .line 553
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v11

    .line 557
    check-cast v11, La/v1s0;

    .line 558
    .line 559
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 560
    .line 561
    .line 562
    iget-object v2, v1, La/gs10;->h:Landroid/widget/TextView;

    .line 563
    .line 564
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v11

    .line 568
    check-cast v11, La/v1s0;

    .line 569
    .line 570
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 571
    .line 572
    .line 573
    iget-object v2, v1, La/gs10;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 574
    .line 575
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v11

    .line 579
    check-cast v11, La/v1s0;

    .line 580
    .line 581
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 582
    .line 583
    .line 584
    iget-object v2, v1, La/gs10;->g:Landroid/widget/TextView;

    .line 585
    .line 586
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    check-cast v11, La/v1s0;

    .line 591
    .line 592
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 593
    .line 594
    .line 595
    iget-object v1, v1, La/gs10;->l:Landroid/widget/TextView;

    .line 596
    .line 597
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    check-cast v2, La/v1s0;

    .line 602
    .line 603
    iget-object v2, v2, La/v1s0;->e:Ljava/lang/String;

    .line 604
    .line 605
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    if-lez v2, :cond_5

    .line 610
    .line 611
    move v2, v10

    .line 612
    goto :goto_5

    .line 613
    :cond_5
    move v2, v7

    .line 614
    :goto_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    check-cast v1, La/v1s0;

    .line 622
    .line 623
    iget-object v1, v1, La/v1s0;->e:Ljava/lang/String;

    .line 624
    .line 625
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 626
    .line 627
    .line 628
    move-result v1

    .line 629
    if-lez v1, :cond_6

    .line 630
    .line 631
    move v1, v10

    .line 632
    goto :goto_6

    .line 633
    :cond_6
    move v1, v7

    .line 634
    :goto_6
    invoke-virtual {v8, v1}, Landroid/view/View;->setVisibility(I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    check-cast v1, La/v1s0;

    .line 642
    .line 643
    iget v1, v1, La/v1s0;->g:I

    .line 644
    .line 645
    invoke-virtual {v8, v1}, Lorg/xplatform/ui_core/GradientTextView;->setStartColor(I)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    check-cast v1, La/v1s0;

    .line 653
    .line 654
    iget v1, v1, La/v1s0;->h:I

    .line 655
    .line 656
    invoke-virtual {v8, v1}, Lorg/xplatform/ui_core/GradientTextView;->setEndColor(I)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    check-cast v1, La/v1s0;

    .line 664
    .line 665
    iget-object v1, v1, La/v1s0;->e:Ljava/lang/String;

    .line 666
    .line 667
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    check-cast v1, La/v1s0;

    .line 675
    .line 676
    iget-boolean v1, v1, La/v1s0;->f:Z

    .line 677
    .line 678
    xor-int/2addr v1, v9

    .line 679
    invoke-virtual {v5, v1}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    check-cast v1, La/v1s0;

    .line 687
    .line 688
    iget-object v1, v1, La/v1s0;->c:Ljava/lang/String;

    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    if-lez v1, :cond_7

    .line 695
    .line 696
    move v1, v10

    .line 697
    goto :goto_7

    .line 698
    :cond_7
    move v1, v7

    .line 699
    :goto_7
    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    check-cast v1, La/v1s0;

    .line 707
    .line 708
    iget-object v1, v1, La/v1s0;->d:Ljava/lang/String;

    .line 709
    .line 710
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    if-lez v1, :cond_8

    .line 715
    .line 716
    move v1, v10

    .line 717
    goto :goto_8

    .line 718
    :cond_8
    move v1, v7

    .line 719
    :goto_8
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    check-cast v1, La/v1s0;

    .line 727
    .line 728
    iget-object v1, v1, La/v1s0;->d:Ljava/lang/String;

    .line 729
    .line 730
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 731
    .line 732
    .line 733
    move-result v1

    .line 734
    if-lez v1, :cond_9

    .line 735
    .line 736
    move v7, v10

    .line 737
    :cond_9
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    check-cast v1, La/v1s0;

    .line 745
    .line 746
    iget-boolean v1, v1, La/v1s0;->f:Z

    .line 747
    .line 748
    if-eqz v1, :cond_a

    .line 749
    .line 750
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    check-cast v1, La/v1s0;

    .line 755
    .line 756
    iget-object v1, v1, La/v1s0;->c:Ljava/lang/String;

    .line 757
    .line 758
    goto :goto_9

    .line 759
    :cond_a
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    check-cast v1, La/v1s0;

    .line 764
    .line 765
    iget-object v1, v1, La/v1s0;->d:Ljava/lang/String;

    .line 766
    .line 767
    :goto_9
    invoke-virtual {v4, v1}, Lorg/xplatform/cyber/section/impl/championships/regular/presentation/world_cup/tournament_info/ExpandableTextView;->setTextWithoutAnimation(Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    check-cast v0, La/v1s0;

    .line 775
    .line 776
    iget v0, v0, La/v1s0;->i:I

    .line 777
    .line 778
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 779
    .line 780
    .line 781
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 782
    .line 783
    return-object v0

    .line 784
    :pswitch_7
    move-object/from16 v1, p1

    .line 785
    .line 786
    check-cast v1, Ljava/util/List;

    .line 787
    .line 788
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 792
    .line 793
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 794
    .line 795
    move-object v2, v1

    .line 796
    check-cast v2, La/es10;

    .line 797
    .line 798
    iget-object v3, v2, La/es10;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 799
    .line 800
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    check-cast v2, La/owr0;

    .line 805
    .line 806
    iget-object v4, v2, La/owr0;->d:Ljava/lang/String;

    .line 807
    .line 808
    const/4 v9, 0x0

    .line 809
    const/16 v10, 0x1fe

    .line 810
    .line 811
    const/4 v5, 0x0

    .line 812
    const/4 v6, 0x0

    .line 813
    const/4 v7, 0x0

    .line 814
    const/4 v8, 0x0

    .line 815
    invoke-static/range {v3 .. v10}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 816
    .line 817
    .line 818
    check-cast v1, La/es10;

    .line 819
    .line 820
    iget-object v2, v1, La/es10;->d:Landroid/widget/TextView;

    .line 821
    .line 822
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    check-cast v3, La/owr0;

    .line 827
    .line 828
    iget-object v3, v3, La/owr0;->b:Ljava/lang/String;

    .line 829
    .line 830
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 831
    .line 832
    .line 833
    iget-object v1, v1, La/es10;->c:Landroid/widget/TextView;

    .line 834
    .line 835
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    check-cast v0, La/owr0;

    .line 840
    .line 841
    iget-object v0, v0, La/owr0;->c:Ljava/lang/String;

    .line 842
    .line 843
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 844
    .line 845
    .line 846
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 847
    .line 848
    return-object v0

    .line 849
    :pswitch_8
    move-object/from16 v1, p1

    .line 850
    .line 851
    check-cast v1, Ljava/util/List;

    .line 852
    .line 853
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 857
    .line 858
    check-cast v1, La/nyx;

    .line 859
    .line 860
    iget-object v1, v1, La/nyx;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 861
    .line 862
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    check-cast v0, La/cc;

    .line 867
    .line 868
    iget-object v0, v0, La/cc;->c:Ljava/lang/String;

    .line 869
    .line 870
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setLabel(Ljava/lang/CharSequence;)V

    .line 871
    .line 872
    .line 873
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 874
    .line 875
    return-object v0

    .line 876
    :pswitch_9
    move-object/from16 v1, p1

    .line 877
    .line 878
    check-cast v1, Ljava/util/List;

    .line 879
    .line 880
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 884
    .line 885
    move-object v2, v1

    .line 886
    check-cast v2, La/oyx;

    .line 887
    .line 888
    iget-object v2, v2, La/oyx;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 889
    .line 890
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    check-cast v3, La/psq0;

    .line 895
    .line 896
    invoke-virtual {v3}, La/psq0;->getTitle()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 901
    .line 902
    .line 903
    check-cast v1, La/oyx;

    .line 904
    .line 905
    iget-object v2, v1, La/oyx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 906
    .line 907
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v3

    .line 911
    check-cast v3, La/psq0;

    .line 912
    .line 913
    invoke-virtual {v3}, La/psq0;->c()La/uwx;

    .line 914
    .line 915
    .line 916
    move-result-object v3

    .line 917
    sget-object v4, La/uwx;->a:La/uwx;

    .line 918
    .line 919
    if-eq v3, v4, :cond_c

    .line 920
    .line 921
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v3

    .line 925
    check-cast v3, La/psq0;

    .line 926
    .line 927
    invoke-virtual {v3}, La/psq0;->c()La/uwx;

    .line 928
    .line 929
    .line 930
    move-result-object v3

    .line 931
    sget-object v4, La/uwx;->d:La/uwx;

    .line 932
    .line 933
    if-ne v3, v4, :cond_b

    .line 934
    .line 935
    goto :goto_a

    .line 936
    :cond_b
    move v3, v10

    .line 937
    goto :goto_b

    .line 938
    :cond_c
    :goto_a
    move v3, v9

    .line 939
    :goto_b
    invoke-virtual {v2, v3}, La/tw5;->setFirst(Z)V

    .line 940
    .line 941
    .line 942
    iget-object v1, v1, La/oyx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 943
    .line 944
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v2

    .line 948
    check-cast v2, La/psq0;

    .line 949
    .line 950
    invoke-virtual {v2}, La/psq0;->c()La/uwx;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    sget-object v3, La/uwx;->c:La/uwx;

    .line 955
    .line 956
    if-eq v2, v3, :cond_e

    .line 957
    .line 958
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    check-cast v0, La/psq0;

    .line 963
    .line 964
    invoke-virtual {v0}, La/psq0;->c()La/uwx;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    sget-object v2, La/uwx;->d:La/uwx;

    .line 969
    .line 970
    if-ne v0, v2, :cond_d

    .line 971
    .line 972
    goto :goto_c

    .line 973
    :cond_d
    move v9, v10

    .line 974
    :cond_e
    :goto_c
    invoke-virtual {v1, v9}, La/tw5;->setLast(Z)V

    .line 975
    .line 976
    .line 977
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 978
    .line 979
    return-object v0

    .line 980
    :pswitch_a
    move-object/from16 v1, p1

    .line 981
    .line 982
    check-cast v1, Ljava/util/List;

    .line 983
    .line 984
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 985
    .line 986
    .line 987
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 988
    .line 989
    move-object v2, v1

    .line 990
    check-cast v2, La/d3k;

    .line 991
    .line 992
    iget-object v2, v2, La/d3k;->e:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 993
    .line 994
    new-instance v3, Landroid/text/SpannableStringBuilder;

    .line 995
    .line 996
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v4

    .line 1000
    check-cast v4, La/lfi0;

    .line 1001
    .line 1002
    iget-object v4, v4, La/lfi0;->c:Landroid/text/SpannableString;

    .line 1003
    .line 1004
    invoke-direct {v3, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 1005
    .line 1006
    .line 1007
    const-string v4, " "

    .line 1008
    .line 1009
    invoke-virtual {v3, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1013
    .line 1014
    .line 1015
    check-cast v1, La/d3k;

    .line 1016
    .line 1017
    iget-object v2, v1, La/d3k;->e:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 1018
    .line 1019
    sget-object v3, La/piq;->a:La/piq;

    .line 1020
    .line 1021
    if-nez v3, :cond_f

    .line 1022
    .line 1023
    new-instance v3, La/piq;

    .line 1024
    .line 1025
    invoke-direct {v3}, Landroid/text/method/LinkMovementMethod;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    sput-object v3, La/piq;->a:La/piq;

    .line 1029
    .line 1030
    :cond_f
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 1031
    .line 1032
    .line 1033
    iget-object v2, v1, La/d3k;->c:Landroid/widget/ImageView;

    .line 1034
    .line 1035
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v3

    .line 1039
    check-cast v3, La/lfi0;

    .line 1040
    .line 1041
    iget v3, v3, La/lfi0;->f:I

    .line 1042
    .line 1043
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1044
    .line 1045
    .line 1046
    iget-object v2, v1, La/d3k;->b:Landroid/widget/ImageView;

    .line 1047
    .line 1048
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    check-cast v3, La/lfi0;

    .line 1053
    .line 1054
    iget-boolean v3, v3, La/lfi0;->g:Z

    .line 1055
    .line 1056
    if-nez v3, :cond_10

    .line 1057
    .line 1058
    const/4 v10, 0x4

    .line 1059
    :cond_10
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1060
    .line 1061
    .line 1062
    iget-object v1, v1, La/d3k;->f:Landroid/widget/TextView;

    .line 1063
    .line 1064
    sget-object v2, La/rdj;->a:La/rdj;

    .line 1065
    .line 1066
    iget-object v2, v0, La/xhe0;->a:Landroid/view/View;

    .line 1067
    .line 1068
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v2

    .line 1072
    invoke-static {v2}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v2

    .line 1076
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    check-cast v0, La/lfi0;

    .line 1081
    .line 1082
    iget-object v0, v0, La/lfi0;->e:Ljava/util/Date;

    .line 1083
    .line 1084
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 1085
    .line 1086
    .line 1087
    move-result-wide v3

    .line 1088
    sget-object v0, La/ykq0;->c:La/ykq0;

    .line 1089
    .line 1090
    new-instance v5, La/ynq0;

    .line 1091
    .line 1092
    invoke-direct {v5, v3, v4}, La/ynq0;-><init>(J)V

    .line 1093
    .line 1094
    .line 1095
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    const/16 v3, 0xf8

    .line 1100
    .line 1101
    invoke-static {v5, v0, v2, v8, v3}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1106
    .line 1107
    .line 1108
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1109
    .line 1110
    return-object v0

    .line 1111
    :pswitch_b
    move-object/from16 v1, p1

    .line 1112
    .line 1113
    check-cast v1, Ljava/util/List;

    .line 1114
    .line 1115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1119
    .line 1120
    move-object v2, v1

    .line 1121
    check-cast v2, La/mgp0;

    .line 1122
    .line 1123
    iget-object v2, v2, La/mgp0;->d:Landroid/widget/TextView;

    .line 1124
    .line 1125
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    check-cast v3, La/d9a0;

    .line 1130
    .line 1131
    iget-object v3, v3, La/d9a0;->c:Ljava/lang/String;

    .line 1132
    .line 1133
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1134
    .line 1135
    .line 1136
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1137
    .line 1138
    check-cast v1, La/mgp0;

    .line 1139
    .line 1140
    iget-object v1, v1, La/mgp0;->b:Landroid/widget/ImageView;

    .line 1141
    .line 1142
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    check-cast v0, La/d9a0;

    .line 1147
    .line 1148
    iget-object v0, v0, La/d9a0;->e:Ljava/lang/String;

    .line 1149
    .line 1150
    const/16 v2, 0xb

    .line 1151
    .line 1152
    invoke-static {v1, v0, v10, v2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1153
    .line 1154
    .line 1155
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1156
    .line 1157
    return-object v0

    .line 1158
    :pswitch_c
    move-object/from16 v1, p1

    .line 1159
    .line 1160
    check-cast v1, Ljava/util/List;

    .line 1161
    .line 1162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1163
    .line 1164
    .line 1165
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1166
    .line 1167
    move-object v2, v1

    .line 1168
    check-cast v2, La/xrx;

    .line 1169
    .line 1170
    iget-object v2, v2, La/xrx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1171
    .line 1172
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v3

    .line 1176
    check-cast v3, La/w140;

    .line 1177
    .line 1178
    iget-boolean v3, v3, La/w140;->b:Z

    .line 1179
    .line 1180
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1181
    .line 1182
    .line 1183
    check-cast v1, La/xrx;

    .line 1184
    .line 1185
    iget-object v2, v1, La/xrx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1186
    .line 1187
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v3

    .line 1191
    check-cast v3, La/w140;

    .line 1192
    .line 1193
    iget v3, v3, La/w140;->d:I

    .line 1194
    .line 1195
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1196
    .line 1197
    .line 1198
    iget-object v1, v1, La/xrx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1199
    .line 1200
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v2

    .line 1204
    check-cast v2, La/w140;

    .line 1205
    .line 1206
    iget-object v2, v2, La/w140;->e:Ljava/lang/String;

    .line 1207
    .line 1208
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    check-cast v0, La/w140;

    .line 1216
    .line 1217
    iget-object v0, v0, La/w140;->f:Ljava/lang/String;

    .line 1218
    .line 1219
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1220
    .line 1221
    .line 1222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1223
    .line 1224
    return-object v0

    .line 1225
    :pswitch_d
    move-object/from16 v1, p1

    .line 1226
    .line 1227
    check-cast v1, Ljava/util/List;

    .line 1228
    .line 1229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1230
    .line 1231
    .line 1232
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1233
    .line 1234
    check-cast v1, La/b3k;

    .line 1235
    .line 1236
    iget-object v1, v1, La/b3k;->b:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 1237
    .line 1238
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    check-cast v0, La/z9o0;

    .line 1243
    .line 1244
    iget-object v0, v0, La/z9o0;->b:Ljava/lang/CharSequence;

    .line 1245
    .line 1246
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1247
    .line 1248
    .line 1249
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1250
    .line 1251
    return-object v0

    .line 1252
    :pswitch_e
    move-object/from16 v1, p1

    .line 1253
    .line 1254
    check-cast v1, Ljava/util/List;

    .line 1255
    .line 1256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1257
    .line 1258
    .line 1259
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1260
    .line 1261
    move-object v2, v1

    .line 1262
    check-cast v2, La/kwx;

    .line 1263
    .line 1264
    iget-object v2, v2, La/kwx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1265
    .line 1266
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v3

    .line 1270
    check-cast v3, La/a240;

    .line 1271
    .line 1272
    iget v3, v3, La/a240;->d:I

    .line 1273
    .line 1274
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1275
    .line 1276
    .line 1277
    check-cast v1, La/kwx;

    .line 1278
    .line 1279
    iget-object v2, v1, La/kwx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1280
    .line 1281
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v3

    .line 1285
    check-cast v3, La/a240;

    .line 1286
    .line 1287
    iget-boolean v3, v3, La/a240;->b:Z

    .line 1288
    .line 1289
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1290
    .line 1291
    .line 1292
    iget-object v2, v1, La/kwx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1293
    .line 1294
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v3

    .line 1298
    check-cast v3, La/a240;

    .line 1299
    .line 1300
    iget-object v3, v3, La/a240;->e:Ljava/lang/String;

    .line 1301
    .line 1302
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v3

    .line 1309
    check-cast v3, La/a240;

    .line 1310
    .line 1311
    iget-object v3, v3, La/a240;->f:Ljava/lang/String;

    .line 1312
    .line 1313
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1314
    .line 1315
    .line 1316
    iget-object v1, v1, La/kwx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 1317
    .line 1318
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    check-cast v0, La/a240;

    .line 1323
    .line 1324
    iget v0, v0, La/a240;->g:I

    .line 1325
    .line 1326
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v0

    .line 1330
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCount(Ljava/lang/Integer;)V

    .line 1331
    .line 1332
    .line 1333
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1334
    .line 1335
    return-object v0

    .line 1336
    :pswitch_f
    move-object/from16 v1, p1

    .line 1337
    .line 1338
    check-cast v1, Ljava/util/List;

    .line 1339
    .line 1340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1341
    .line 1342
    .line 1343
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1344
    .line 1345
    move-object v2, v1

    .line 1346
    check-cast v2, La/itx;

    .line 1347
    .line 1348
    iget-object v2, v2, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1349
    .line 1350
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v3

    .line 1354
    check-cast v3, La/a240;

    .line 1355
    .line 1356
    iget v3, v3, La/a240;->d:I

    .line 1357
    .line 1358
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 1359
    .line 1360
    .line 1361
    check-cast v1, La/itx;

    .line 1362
    .line 1363
    iget-object v2, v1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1364
    .line 1365
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    check-cast v3, La/a240;

    .line 1370
    .line 1371
    iget-object v3, v3, La/a240;->e:Ljava/lang/String;

    .line 1372
    .line 1373
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 1374
    .line 1375
    .line 1376
    iget-object v1, v1, La/itx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 1377
    .line 1378
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v2

    .line 1382
    check-cast v2, La/a240;

    .line 1383
    .line 1384
    iget-object v2, v2, La/a240;->f:Ljava/lang/String;

    .line 1385
    .line 1386
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v2

    .line 1393
    check-cast v2, La/a240;

    .line 1394
    .line 1395
    iget-boolean v2, v2, La/a240;->b:Z

    .line 1396
    .line 1397
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setBadgeVisible(Z)V

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    check-cast v2, La/a240;

    .line 1405
    .line 1406
    iget v2, v2, La/a240;->g:I

    .line 1407
    .line 1408
    if-lez v2, :cond_11

    .line 1409
    .line 1410
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v0

    .line 1414
    check-cast v0, La/a240;

    .line 1415
    .line 1416
    iget v0, v0, La/a240;->g:I

    .line 1417
    .line 1418
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v8

    .line 1422
    :cond_11
    invoke-virtual {v1, v8}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setCounter(Ljava/lang/Integer;)V

    .line 1423
    .line 1424
    .line 1425
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1426
    .line 1427
    return-object v0

    .line 1428
    :pswitch_10
    move-object/from16 v1, p1

    .line 1429
    .line 1430
    check-cast v1, Ljava/util/List;

    .line 1431
    .line 1432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1433
    .line 1434
    .line 1435
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1436
    .line 1437
    check-cast v1, La/iyx;

    .line 1438
    .line 1439
    iget-object v1, v1, La/iyx;->b:Landroid/widget/TextView;

    .line 1440
    .line 1441
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v0

    .line 1445
    check-cast v0, La/uxm0;

    .line 1446
    .line 1447
    iget-object v0, v0, La/uxm0;->b:Ljava/lang/String;

    .line 1448
    .line 1449
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1450
    .line 1451
    .line 1452
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1453
    .line 1454
    return-object v0

    .line 1455
    :pswitch_11
    move-object/from16 v1, p1

    .line 1456
    .line 1457
    check-cast v1, Ljava/util/List;

    .line 1458
    .line 1459
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1460
    .line 1461
    .line 1462
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 1463
    .line 1464
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1465
    .line 1466
    move-object v2, v1

    .line 1467
    check-cast v2, La/zth;

    .line 1468
    .line 1469
    iget-object v11, v2, La/zth;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1470
    .line 1471
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v2

    .line 1475
    check-cast v2, La/cqm0;

    .line 1476
    .line 1477
    iget-object v12, v2, La/cqm0;->b:Ljava/lang/String;

    .line 1478
    .line 1479
    const/16 v17, 0x0

    .line 1480
    .line 1481
    const/16 v18, 0x1fc

    .line 1482
    .line 1483
    const v13, 0x7f080e2a

    .line 1484
    .line 1485
    .line 1486
    const/4 v14, 0x0

    .line 1487
    const/4 v15, 0x0

    .line 1488
    const/16 v16, 0x0

    .line 1489
    .line 1490
    invoke-static/range {v11 .. v18}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1491
    .line 1492
    .line 1493
    check-cast v1, La/zth;

    .line 1494
    .line 1495
    iget-object v2, v1, La/zth;->b:La/auh;

    .line 1496
    .line 1497
    iget-object v3, v1, La/zth;->d:Landroid/widget/TextView;

    .line 1498
    .line 1499
    iget-object v2, v2, La/auh;->b:Landroid/widget/FrameLayout;

    .line 1500
    .line 1501
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v4

    .line 1505
    check-cast v4, La/cqm0;

    .line 1506
    .line 1507
    iget-boolean v4, v4, La/cqm0;->k:Z

    .line 1508
    .line 1509
    if-eqz v4, :cond_12

    .line 1510
    .line 1511
    move v4, v10

    .line 1512
    goto :goto_d

    .line 1513
    :cond_12
    move v4, v7

    .line 1514
    :goto_d
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1515
    .line 1516
    .line 1517
    iget-object v1, v1, La/zth;->e:Landroid/widget/TextView;

    .line 1518
    .line 1519
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v2

    .line 1523
    check-cast v2, La/cqm0;

    .line 1524
    .line 1525
    iget-object v2, v2, La/cqm0;->c:Ljava/lang/String;

    .line 1526
    .line 1527
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v1

    .line 1534
    check-cast v1, La/cqm0;

    .line 1535
    .line 1536
    iget-object v1, v1, La/cqm0;->d:Ljava/lang/String;

    .line 1537
    .line 1538
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v0

    .line 1545
    check-cast v0, La/cqm0;

    .line 1546
    .line 1547
    iget-object v0, v0, La/cqm0;->d:Ljava/lang/String;

    .line 1548
    .line 1549
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1550
    .line 1551
    .line 1552
    move-result v0

    .line 1553
    if-lez v0, :cond_13

    .line 1554
    .line 1555
    move v7, v10

    .line 1556
    :cond_13
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1557
    .line 1558
    .line 1559
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1560
    .line 1561
    return-object v0

    .line 1562
    :pswitch_12
    move-object/from16 v1, p1

    .line 1563
    .line 1564
    check-cast v1, Ljava/util/List;

    .line 1565
    .line 1566
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1567
    .line 1568
    .line 1569
    iget-object v1, v0, La/xhe0;->a:Landroid/view/View;

    .line 1570
    .line 1571
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v2

    .line 1575
    check-cast v2, La/p3l0;

    .line 1576
    .line 1577
    iget-boolean v2, v2, La/p3l0;->c:Z

    .line 1578
    .line 1579
    xor-int/2addr v2, v9

    .line 1580
    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 1581
    .line 1582
    .line 1583
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1584
    .line 1585
    check-cast v1, La/ds6;

    .line 1586
    .line 1587
    iget-object v1, v1, La/ds6;->b:Lcom/google/android/material/chip/Chip;

    .line 1588
    .line 1589
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v2

    .line 1593
    check-cast v2, La/p3l0;

    .line 1594
    .line 1595
    iget-object v2, v2, La/p3l0;->b:Ljava/lang/String;

    .line 1596
    .line 1597
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v0

    .line 1604
    check-cast v0, La/p3l0;

    .line 1605
    .line 1606
    iget-boolean v0, v0, La/p3l0;->c:Z

    .line 1607
    .line 1608
    invoke-virtual {v1, v0}, Lcom/google/android/material/chip/Chip;->setChecked(Z)V

    .line 1609
    .line 1610
    .line 1611
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1612
    .line 1613
    return-object v0

    .line 1614
    :pswitch_13
    move-object/from16 v1, p1

    .line 1615
    .line 1616
    check-cast v1, Ljava/util/List;

    .line 1617
    .line 1618
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v1

    .line 1625
    check-cast v1, La/x140;

    .line 1626
    .line 1627
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 1628
    .line 1629
    check-cast v2, La/wxx;

    .line 1630
    .line 1631
    iget-object v6, v2, La/wxx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1632
    .line 1633
    sget-object v7, La/j5d;->a:Landroid/util/TypedValue;

    .line 1634
    .line 1635
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 1636
    .line 1637
    invoke-static {v0, v5, v10}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1638
    .line 1639
    .line 1640
    move-result v7

    .line 1641
    invoke-virtual {v6, v7}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 1642
    .line 1643
    .line 1644
    iget-object v11, v2, La/wxx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1645
    .line 1646
    invoke-virtual {v11, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1647
    .line 1648
    .line 1649
    iget-object v12, v1, La/x140;->f:Ljava/lang/String;

    .line 1650
    .line 1651
    iget-object v13, v1, La/x140;->e:Ljava/lang/String;

    .line 1652
    .line 1653
    const v6, 0x7f040b5f

    .line 1654
    .line 1655
    .line 1656
    invoke-static {v0, v6, v10}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1657
    .line 1658
    .line 1659
    move-result v6

    .line 1660
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v14

    .line 1664
    invoke-static {v0, v3, v10}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1665
    .line 1666
    .line 1667
    move-result v3

    .line 1668
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v15

    .line 1672
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v16

    .line 1676
    invoke-static {v0, v5, v10}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1677
    .line 1678
    .line 1679
    move-result v0

    .line 1680
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v17

    .line 1684
    invoke-virtual/range {v11 .. v17}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 1685
    .line 1686
    .line 1687
    iget-boolean v0, v1, La/x140;->a:Z

    .line 1688
    .line 1689
    invoke-virtual {v11, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1690
    .line 1691
    .line 1692
    iget-object v0, v2, La/wxx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1693
    .line 1694
    iget-object v3, v1, La/x140;->g:Ljava/lang/String;

    .line 1695
    .line 1696
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1697
    .line 1698
    .line 1699
    iget-object v3, v1, La/x140;->h:Ljava/lang/String;

    .line 1700
    .line 1701
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1702
    .line 1703
    .line 1704
    iget-object v0, v2, La/wxx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1705
    .line 1706
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1707
    .line 1708
    .line 1709
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1710
    .line 1711
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v3

    .line 1715
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1716
    .line 1717
    .line 1718
    iget-object v4, v1, La/x140;->i:Ljava/lang/String;

    .line 1719
    .line 1720
    new-instance v8, La/k9;

    .line 1721
    .line 1722
    const/16 v1, 0xe

    .line 1723
    .line 1724
    invoke-direct {v8, v0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 1725
    .line 1726
    .line 1727
    new-instance v9, La/k9;

    .line 1728
    .line 1729
    const/16 v1, 0xf

    .line 1730
    .line 1731
    invoke-direct {v9, v0, v1}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 1732
    .line 1733
    .line 1734
    const/16 v10, 0xe

    .line 1735
    .line 1736
    const/4 v5, 0x0

    .line 1737
    const/4 v6, 0x0

    .line 1738
    const/4 v7, 0x0

    .line 1739
    invoke-static/range {v3 .. v10}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1740
    .line 1741
    .line 1742
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1743
    .line 1744
    return-object v0

    .line 1745
    :pswitch_14
    move-object/from16 v1, p1

    .line 1746
    .line 1747
    check-cast v1, Ljava/util/List;

    .line 1748
    .line 1749
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1750
    .line 1751
    .line 1752
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1753
    .line 1754
    move-object v2, v1

    .line 1755
    check-cast v2, La/rok0;

    .line 1756
    .line 1757
    iget-object v2, v2, La/rok0;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1758
    .line 1759
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v6

    .line 1763
    check-cast v6, La/pwk0;

    .line 1764
    .line 1765
    iget-object v6, v6, La/pwk0;->b:Ljava/lang/String;

    .line 1766
    .line 1767
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1768
    .line 1769
    .line 1770
    check-cast v1, La/rok0;

    .line 1771
    .line 1772
    iget-object v2, v1, La/rok0;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1773
    .line 1774
    invoke-virtual {v2, v8}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1775
    .line 1776
    .line 1777
    iget-object v2, v1, La/rok0;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1778
    .line 1779
    invoke-static {v2}, La/hxm0;->w(Landroid/widget/ImageView;)V

    .line 1780
    .line 1781
    .line 1782
    iget-object v2, v1, La/rok0;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1783
    .line 1784
    const v6, 0x7f080350

    .line 1785
    .line 1786
    .line 1787
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBackgroundDrawableRes(I)V

    .line 1788
    .line 1789
    .line 1790
    iget-object v6, v0, La/xhe0;->a:Landroid/view/View;

    .line 1791
    .line 1792
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v7

    .line 1796
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v8

    .line 1803
    check-cast v8, La/pwk0;

    .line 1804
    .line 1805
    invoke-static {v3, v7}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1806
    .line 1807
    .line 1808
    move-result v3

    .line 1809
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v3

    .line 1813
    invoke-static {v2, v3}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v3

    .line 1820
    check-cast v3, La/pwk0;

    .line 1821
    .line 1822
    invoke-virtual {v2, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1823
    .line 1824
    .line 1825
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 1826
    .line 1827
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v3

    .line 1831
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1832
    .line 1833
    .line 1834
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v4

    .line 1838
    check-cast v4, La/pwk0;

    .line 1839
    .line 1840
    invoke-static {v3, v5, v10}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1841
    .line 1842
    .line 1843
    move-result v3

    .line 1844
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 1845
    .line 1846
    .line 1847
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v11

    .line 1851
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1852
    .line 1853
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v2

    .line 1860
    check-cast v2, La/pwk0;

    .line 1861
    .line 1862
    iget-object v12, v2, La/pwk0;->d:Ljava/lang/String;

    .line 1863
    .line 1864
    new-instance v2, La/qwk0;

    .line 1865
    .line 1866
    invoke-direct {v2, v1, v0, v10}, La/qwk0;-><init>(La/rok0;La/cp;B)V

    .line 1867
    .line 1868
    .line 1869
    new-instance v3, La/qwk0;

    .line 1870
    .line 1871
    invoke-direct {v3, v1, v0, v9}, La/qwk0;-><init>(La/rok0;La/cp;B)V

    .line 1872
    .line 1873
    .line 1874
    const/16 v18, 0xe

    .line 1875
    .line 1876
    const/4 v13, 0x0

    .line 1877
    const/4 v14, 0x0

    .line 1878
    const/4 v15, 0x0

    .line 1879
    move-object/from16 v16, v2

    .line 1880
    .line 1881
    move-object/from16 v17, v3

    .line 1882
    .line 1883
    invoke-static/range {v11 .. v18}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v2

    .line 1890
    check-cast v2, La/pwk0;

    .line 1891
    .line 1892
    iget-object v12, v2, La/pwk0;->c:Ljava/lang/String;

    .line 1893
    .line 1894
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v2

    .line 1898
    const v3, 0x7f07067a

    .line 1899
    .line 1900
    .line 1901
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1902
    .line 1903
    .line 1904
    move-result v2

    .line 1905
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v13

    .line 1909
    new-instance v2, La/qwk0;

    .line 1910
    .line 1911
    const/4 v3, 0x2

    .line 1912
    invoke-direct {v2, v1, v0, v3}, La/qwk0;-><init>(La/rok0;La/cp;B)V

    .line 1913
    .line 1914
    .line 1915
    const/16 v17, 0x0

    .line 1916
    .line 1917
    const/16 v18, 0x2c

    .line 1918
    .line 1919
    move-object/from16 v16, v2

    .line 1920
    .line 1921
    invoke-static/range {v11 .. v18}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1922
    .line 1923
    .line 1924
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v0

    .line 1928
    check-cast v0, La/pwk0;

    .line 1929
    .line 1930
    iget-object v12, v0, La/pwk0;->e:Ljava/lang/String;

    .line 1931
    .line 1932
    new-instance v0, La/rai0;

    .line 1933
    .line 1934
    const/16 v2, 0x1d

    .line 1935
    .line 1936
    invoke-direct {v0, v1, v2}, La/rai0;-><init>(Ljava/lang/Object;B)V

    .line 1937
    .line 1938
    .line 1939
    const/16 v18, 0x2e

    .line 1940
    .line 1941
    const/4 v13, 0x0

    .line 1942
    move-object/from16 v16, v0

    .line 1943
    .line 1944
    invoke-static/range {v11 .. v18}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1945
    .line 1946
    .line 1947
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1948
    .line 1949
    return-object v0

    .line 1950
    :pswitch_15
    move-object/from16 v1, p1

    .line 1951
    .line 1952
    check-cast v1, Ljava/util/List;

    .line 1953
    .line 1954
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1955
    .line 1956
    .line 1957
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1958
    .line 1959
    move-object v2, v1

    .line 1960
    check-cast v2, La/sxx;

    .line 1961
    .line 1962
    iget-object v2, v2, La/sxx;->a:Lorg/xplatform/uikit/components/cells/DsShimmerCell;

    .line 1963
    .line 1964
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v3

    .line 1968
    check-cast v3, La/aaj0;

    .line 1969
    .line 1970
    iget-boolean v3, v3, La/aaj0;->c:Z

    .line 1971
    .line 1972
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->setLongTitleVisible(Z)V

    .line 1973
    .line 1974
    .line 1975
    check-cast v1, La/sxx;

    .line 1976
    .line 1977
    iget-object v1, v1, La/sxx;->a:Lorg/xplatform/uikit/components/cells/DsShimmerCell;

    .line 1978
    .line 1979
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v0

    .line 1983
    check-cast v0, La/aaj0;

    .line 1984
    .line 1985
    iget-boolean v0, v0, La/aaj0;->c:Z

    .line 1986
    .line 1987
    xor-int/2addr v0, v9

    .line 1988
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->setTitleVisible(Z)V

    .line 1989
    .line 1990
    .line 1991
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1992
    .line 1993
    return-object v0

    .line 1994
    :pswitch_16
    move-object/from16 v1, p1

    .line 1995
    .line 1996
    check-cast v1, Ljava/util/List;

    .line 1997
    .line 1998
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1999
    .line 2000
    .line 2001
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 2002
    .line 2003
    move-object v2, v1

    .line 2004
    check-cast v2, La/v7z;

    .line 2005
    .line 2006
    iget-object v2, v2, La/v7z;->d:Landroid/widget/TextView;

    .line 2007
    .line 2008
    new-instance v3, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 2009
    .line 2010
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v4

    .line 2014
    check-cast v4, La/dpe0;

    .line 2015
    .line 2016
    iget-object v4, v4, La/dpe0;->b:Ljava/lang/String;

    .line 2017
    .line 2018
    new-array v5, v9, [Ljava/lang/CharSequence;

    .line 2019
    .line 2020
    aput-object v4, v5, v10

    .line 2021
    .line 2022
    const v4, 0x7f13110d

    .line 2023
    .line 2024
    .line 2025
    invoke-direct {v3, v4, v5}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 2026
    .line 2027
    .line 2028
    check-cast v1, La/v7z;

    .line 2029
    .line 2030
    iget-object v4, v1, La/v7z;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2031
    .line 2032
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v4

    .line 2036
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2037
    .line 2038
    .line 2039
    invoke-virtual {v3, v4}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v3

    .line 2043
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2044
    .line 2045
    .line 2046
    iget-object v2, v1, La/v7z;->b:Landroid/widget/TextView;

    .line 2047
    .line 2048
    new-instance v3, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 2049
    .line 2050
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v4

    .line 2054
    check-cast v4, La/dpe0;

    .line 2055
    .line 2056
    iget-object v4, v4, La/dpe0;->f:Ljava/lang/String;

    .line 2057
    .line 2058
    new-array v5, v9, [Ljava/lang/CharSequence;

    .line 2059
    .line 2060
    aput-object v4, v5, v10

    .line 2061
    .line 2062
    const v4, 0x7f130dc9

    .line 2063
    .line 2064
    .line 2065
    invoke-direct {v3, v4, v5}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 2066
    .line 2067
    .line 2068
    iget-object v4, v1, La/v7z;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2069
    .line 2070
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v5

    .line 2074
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2075
    .line 2076
    .line 2077
    invoke-virtual {v3, v5}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v3

    .line 2081
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2082
    .line 2083
    .line 2084
    iget-object v1, v1, La/v7z;->c:Landroid/widget/TextView;

    .line 2085
    .line 2086
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v2

    .line 2090
    check-cast v2, La/dpe0;

    .line 2091
    .line 2092
    iget-object v2, v2, La/dpe0;->d:Ljava/lang/String;

    .line 2093
    .line 2094
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2095
    .line 2096
    .line 2097
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 2098
    .line 2099
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v2

    .line 2103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2104
    .line 2105
    .line 2106
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v0

    .line 2110
    check-cast v0, La/dpe0;

    .line 2111
    .line 2112
    iget v0, v0, La/dpe0;->e:I

    .line 2113
    .line 2114
    invoke-virtual {v2, v0}, Landroid/content/Context;->getColor(I)I

    .line 2115
    .line 2116
    .line 2117
    move-result v0

    .line 2118
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2119
    .line 2120
    .line 2121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2122
    .line 2123
    return-object v0

    .line 2124
    :pswitch_17
    move-object/from16 v1, p1

    .line 2125
    .line 2126
    check-cast v1, Ljava/util/List;

    .line 2127
    .line 2128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2129
    .line 2130
    .line 2131
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 2132
    .line 2133
    move-object v3, v1

    .line 2134
    check-cast v3, La/edu0;

    .line 2135
    .line 2136
    iget-object v3, v3, La/edu0;->a:Landroid/view/View;

    .line 2137
    .line 2138
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v4

    .line 2142
    if-eqz v4, :cond_14

    .line 2143
    .line 2144
    check-cast v1, La/edu0;

    .line 2145
    .line 2146
    iget-object v1, v1, La/edu0;->a:Landroid/view/View;

    .line 2147
    .line 2148
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v1

    .line 2152
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2153
    .line 2154
    .line 2155
    move-result-object v1

    .line 2156
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v0

    .line 2160
    check-cast v0, La/rjj0;

    .line 2161
    .line 2162
    const v0, 0x7f0706ba

    .line 2163
    .line 2164
    .line 2165
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2166
    .line 2167
    .line 2168
    move-result v0

    .line 2169
    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 2170
    .line 2171
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2172
    .line 2173
    .line 2174
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2175
    .line 2176
    goto :goto_e

    .line 2177
    :cond_14
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 2178
    .line 2179
    .line 2180
    :goto_e
    return-object v8

    .line 2181
    :pswitch_18
    move-object/from16 v1, p1

    .line 2182
    .line 2183
    check-cast v1, Ljava/util/List;

    .line 2184
    .line 2185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2186
    .line 2187
    .line 2188
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 2189
    .line 2190
    move-object v3, v1

    .line 2191
    check-cast v3, La/cdu0;

    .line 2192
    .line 2193
    iget-object v3, v3, La/cdu0;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2194
    .line 2195
    new-instance v9, La/nrv;

    .line 2196
    .line 2197
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v4

    .line 2201
    check-cast v4, La/qjj0;

    .line 2202
    .line 2203
    iget-object v10, v4, La/qjj0;->a:Ljava/lang/String;

    .line 2204
    .line 2205
    const/16 v16, 0x0

    .line 2206
    .line 2207
    const/16 v17, 0xfe

    .line 2208
    .line 2209
    const/4 v11, 0x0

    .line 2210
    const/4 v12, 0x0

    .line 2211
    const/4 v13, 0x0

    .line 2212
    const/4 v14, 0x0

    .line 2213
    const/4 v15, 0x0

    .line 2214
    invoke-direct/range {v9 .. v17}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 2215
    .line 2216
    .line 2217
    invoke-virtual {v3, v9}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 2218
    .line 2219
    .line 2220
    check-cast v1, La/cdu0;

    .line 2221
    .line 2222
    iget-object v3, v1, La/cdu0;->a:Landroid/widget/FrameLayout;

    .line 2223
    .line 2224
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2225
    .line 2226
    .line 2227
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v4

    .line 2231
    if-eqz v4, :cond_15

    .line 2232
    .line 2233
    iget-object v1, v1, La/cdu0;->a:Landroid/widget/FrameLayout;

    .line 2234
    .line 2235
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v1

    .line 2239
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v1

    .line 2243
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2244
    .line 2245
    .line 2246
    move-result-object v0

    .line 2247
    check-cast v0, La/qjj0;

    .line 2248
    .line 2249
    const v0, 0x7f0706b0

    .line 2250
    .line 2251
    .line 2252
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2253
    .line 2254
    .line 2255
    move-result v0

    .line 2256
    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 2257
    .line 2258
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2259
    .line 2260
    .line 2261
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2262
    .line 2263
    goto :goto_f

    .line 2264
    :cond_15
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 2265
    .line 2266
    .line 2267
    :goto_f
    return-object v8

    .line 2268
    :pswitch_19
    move-object/from16 v1, p1

    .line 2269
    .line 2270
    check-cast v1, Ljava/util/List;

    .line 2271
    .line 2272
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2273
    .line 2274
    .line 2275
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v1

    .line 2279
    check-cast v1, La/m2j0;

    .line 2280
    .line 2281
    iget-boolean v1, v1, La/m2j0;->a:Z

    .line 2282
    .line 2283
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 2284
    .line 2285
    check-cast v2, La/h2j0;

    .line 2286
    .line 2287
    iget-object v3, v2, La/h2j0;->d:La/dc3;

    .line 2288
    .line 2289
    iget-object v3, v3, La/dc3;->d:Ljava/lang/Object;

    .line 2290
    .line 2291
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 2292
    .line 2293
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->setSelected(Z)V

    .line 2294
    .line 2295
    .line 2296
    iget-object v3, v2, La/h2j0;->d:La/dc3;

    .line 2297
    .line 2298
    iget-object v4, v3, La/dc3;->e:Ljava/lang/Object;

    .line 2299
    .line 2300
    check-cast v4, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 2301
    .line 2302
    invoke-virtual {v4, v1}, La/tw5;->setSelected(Z)V

    .line 2303
    .line 2304
    .line 2305
    iget-object v3, v3, La/dc3;->c:Landroid/view/View;

    .line 2306
    .line 2307
    check-cast v3, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2308
    .line 2309
    const v5, 0x7f130487

    .line 2310
    .line 2311
    .line 2312
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 2313
    .line 2314
    .line 2315
    invoke-virtual {v4, v9}, La/tw5;->setFirst(Z)V

    .line 2316
    .line 2317
    .line 2318
    invoke-virtual {v4, v10}, La/tw5;->setLast(Z)V

    .line 2319
    .line 2320
    .line 2321
    invoke-static {v0, v1}, La/x8x;->n(La/cp;Z)I

    .line 2322
    .line 2323
    .line 2324
    move-result v1

    .line 2325
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleTextColor(I)V

    .line 2326
    .line 2327
    .line 2328
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v1

    .line 2332
    check-cast v1, La/m2j0;

    .line 2333
    .line 2334
    iget-boolean v1, v1, La/m2j0;->b:Z

    .line 2335
    .line 2336
    iget-object v3, v2, La/h2j0;->b:La/dc3;

    .line 2337
    .line 2338
    iget-object v4, v3, La/dc3;->d:Ljava/lang/Object;

    .line 2339
    .line 2340
    check-cast v4, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 2341
    .line 2342
    invoke-virtual {v4, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->setSelected(Z)V

    .line 2343
    .line 2344
    .line 2345
    iget-object v4, v3, La/dc3;->e:Ljava/lang/Object;

    .line 2346
    .line 2347
    check-cast v4, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 2348
    .line 2349
    invoke-virtual {v4, v1}, La/tw5;->setSelected(Z)V

    .line 2350
    .line 2351
    .line 2352
    iget-object v3, v3, La/dc3;->c:Landroid/view/View;

    .line 2353
    .line 2354
    check-cast v3, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2355
    .line 2356
    const v4, 0x7f130485

    .line 2357
    .line 2358
    .line 2359
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 2360
    .line 2361
    .line 2362
    invoke-static {v0, v1}, La/x8x;->n(La/cp;Z)I

    .line 2363
    .line 2364
    .line 2365
    move-result v1

    .line 2366
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleTextColor(I)V

    .line 2367
    .line 2368
    .line 2369
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v1

    .line 2373
    check-cast v1, La/m2j0;

    .line 2374
    .line 2375
    iget-boolean v1, v1, La/m2j0;->c:Z

    .line 2376
    .line 2377
    iget-object v2, v2, La/h2j0;->c:La/dc3;

    .line 2378
    .line 2379
    iget-object v3, v2, La/dc3;->d:Ljava/lang/Object;

    .line 2380
    .line 2381
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 2382
    .line 2383
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->setSelected(Z)V

    .line 2384
    .line 2385
    .line 2386
    iget-object v3, v2, La/dc3;->e:Ljava/lang/Object;

    .line 2387
    .line 2388
    check-cast v3, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 2389
    .line 2390
    invoke-virtual {v3, v1}, La/tw5;->setSelected(Z)V

    .line 2391
    .line 2392
    .line 2393
    iget-object v2, v2, La/dc3;->c:Landroid/view/View;

    .line 2394
    .line 2395
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2396
    .line 2397
    const v4, 0x7f130486

    .line 2398
    .line 2399
    .line 2400
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 2401
    .line 2402
    .line 2403
    invoke-virtual {v3, v10}, La/tw5;->setFirst(Z)V

    .line 2404
    .line 2405
    .line 2406
    invoke-virtual {v3, v9}, La/tw5;->setLast(Z)V

    .line 2407
    .line 2408
    .line 2409
    invoke-static {v0, v1}, La/x8x;->n(La/cp;Z)I

    .line 2410
    .line 2411
    .line 2412
    move-result v0

    .line 2413
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleTextColor(I)V

    .line 2414
    .line 2415
    .line 2416
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2417
    .line 2418
    return-object v0

    .line 2419
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2420
    .line 2421
    check-cast v1, Ljava/util/List;

    .line 2422
    .line 2423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2424
    .line 2425
    .line 2426
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v1

    .line 2430
    check-cast v1, La/mv00;

    .line 2431
    .line 2432
    iget-boolean v1, v1, La/mv00;->a:Z

    .line 2433
    .line 2434
    if-eqz v1, :cond_16

    .line 2435
    .line 2436
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 2437
    .line 2438
    check-cast v0, La/fwx;

    .line 2439
    .line 2440
    iget-object v0, v0, La/fwx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 2441
    .line 2442
    invoke-virtual {v0, v9}, La/tw5;->setLast(Z)V

    .line 2443
    .line 2444
    .line 2445
    :cond_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2446
    .line 2447
    return-object v0

    .line 2448
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2449
    .line 2450
    check-cast v1, Ljava/util/List;

    .line 2451
    .line 2452
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2453
    .line 2454
    .line 2455
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 2456
    .line 2457
    check-cast v0, La/cux;

    .line 2458
    .line 2459
    iget-object v0, v0, La/cux;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 2460
    .line 2461
    invoke-virtual {v0, v9}, La/tw5;->setLast(Z)V

    .line 2462
    .line 2463
    .line 2464
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2465
    .line 2466
    return-object v0

    .line 2467
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2468
    .line 2469
    check-cast v1, Ljava/util/List;

    .line 2470
    .line 2471
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2472
    .line 2473
    .line 2474
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 2475
    .line 2476
    check-cast v1, La/hxx;

    .line 2477
    .line 2478
    iget-object v2, v1, La/hxx;->e:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2479
    .line 2480
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v3

    .line 2484
    check-cast v3, La/hzi0;

    .line 2485
    .line 2486
    iget-object v3, v3, La/hzi0;->b:Ljava/lang/String;

    .line 2487
    .line 2488
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 2489
    .line 2490
    .line 2491
    iget-object v2, v1, La/hxx;->e:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2492
    .line 2493
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2494
    .line 2495
    .line 2496
    move-result-object v3

    .line 2497
    check-cast v3, La/hzi0;

    .line 2498
    .line 2499
    iget-object v3, v3, La/hzi0;->a:Ljava/lang/String;

    .line 2500
    .line 2501
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2502
    .line 2503
    .line 2504
    iget-object v2, v1, La/hxx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2505
    .line 2506
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v3

    .line 2510
    check-cast v3, La/hzi0;

    .line 2511
    .line 2512
    const v3, 0x7f0805c2

    .line 2513
    .line 2514
    .line 2515
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2516
    .line 2517
    .line 2518
    iget-object v1, v1, La/hxx;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 2519
    .line 2520
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v0

    .line 2524
    check-cast v0, La/hzi0;

    .line 2525
    .line 2526
    const v0, 0x7f08027f

    .line 2527
    .line 2528
    .line 2529
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 2530
    .line 2531
    .line 2532
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2533
    .line 2534
    return-object v0

    .line 2535
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
