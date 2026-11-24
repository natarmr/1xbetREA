.class public final synthetic La/b1w;
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

    .line 1
    iput-byte p2, p0, La/b1w;->a:B

    iput-object p1, p0, La/b1w;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b1w;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, 0xb

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v0, v0, La/b1w;->b:La/cp;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 26
    .line 27
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 28
    .line 29
    move-object v2, v1

    .line 30
    check-cast v2, La/nwx;

    .line 31
    .line 32
    iget-object v3, v2, La/nwx;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 33
    .line 34
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, La/uk60;

    .line 39
    .line 40
    iget-object v4, v2, La/uk60;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, La/uk60;

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    const/16 v10, 0x1fc

    .line 50
    .line 51
    const v5, 0x7f080e17

    .line 52
    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-static/range {v3 .. v10}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 58
    .line 59
    .line 60
    check-cast v1, La/nwx;

    .line 61
    .line 62
    iget-object v2, v1, La/nwx;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 63
    .line 64
    iget-object v3, v0, La/cp;->w:Landroid/content/Context;

    .line 65
    .line 66
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, La/uk60;

    .line 71
    .line 72
    iget v4, v4, La/uk60;->b:I

    .line 73
    .line 74
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v1, La/nwx;->d:Lcom/google/android/material/textview/MaterialTextView;

    .line 82
    .line 83
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, La/uk60;

    .line 88
    .line 89
    iget v3, v3, La/uk60;->c:I

    .line 90
    .line 91
    invoke-virtual {v0, v3}, La/cp;->v(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v1, La/nwx;->c:Lcom/google/android/material/textview/MaterialTextView;

    .line 99
    .line 100
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, La/uk60;

    .line 105
    .line 106
    iget v2, v2, La/uk60;->d:I

    .line 107
    .line 108
    invoke-virtual {v0, v2}, La/cp;->v(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_0
    move-object/from16 v1, p1

    .line 119
    .line 120
    check-cast v1, Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 126
    .line 127
    move-object v2, v1

    .line 128
    check-cast v2, La/t6t0;

    .line 129
    .line 130
    iget-object v2, v2, La/t6t0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 131
    .line 132
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, La/lk60;

    .line 137
    .line 138
    iget-object v3, v3, La/lk60;->b:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    check-cast v1, La/t6t0;

    .line 144
    .line 145
    iget-object v1, v1, La/t6t0;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 146
    .line 147
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, La/lk60;

    .line 152
    .line 153
    iget v0, v0, La/lk60;->c:I

    .line 154
    .line 155
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 156
    .line 157
    .line 158
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_1
    move-object/from16 v1, p1

    .line 162
    .line 163
    check-cast v1, Ljava/util/List;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 169
    .line 170
    move-object v2, v1

    .line 171
    check-cast v2, La/mwx;

    .line 172
    .line 173
    iget-object v2, v2, La/mwx;->c:Landroid/widget/TextView;

    .line 174
    .line 175
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    check-cast v3, La/yw40;

    .line 180
    .line 181
    iget-object v3, v3, La/yw40;->a:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    .line 185
    .line 186
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 187
    .line 188
    check-cast v1, La/mwx;

    .line 189
    .line 190
    iget-object v1, v1, La/mwx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 191
    .line 192
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, La/yw40;

    .line 197
    .line 198
    iget-object v0, v0, La/yw40;->b:Ljava/lang/String;

    .line 199
    .line 200
    invoke-static {v1, v0, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 201
    .line 202
    .line 203
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_2
    move-object/from16 v1, p1

    .line 207
    .line 208
    check-cast v1, Ljava/util/List;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 214
    .line 215
    move-object v2, v1

    .line 216
    check-cast v2, La/lwx;

    .line 217
    .line 218
    iget-object v2, v2, La/lwx;->c:Landroid/widget/TextView;

    .line 219
    .line 220
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, La/xw40;

    .line 225
    .line 226
    iget-object v3, v3, La/xw40;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 232
    .line 233
    check-cast v1, La/lwx;

    .line 234
    .line 235
    iget-object v1, v1, La/lwx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 236
    .line 237
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, La/xw40;

    .line 242
    .line 243
    iget-object v0, v0, La/xw40;->b:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {v1, v0, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 246
    .line 247
    .line 248
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_3
    move-object/from16 v1, p1

    .line 252
    .line 253
    check-cast v1, Ljava/util/List;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 259
    .line 260
    check-cast v1, La/hwx;

    .line 261
    .line 262
    iget-object v1, v1, La/hwx;->a:Landroid/widget/TextView;

    .line 263
    .line 264
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    check-cast v2, La/k120;

    .line 269
    .line 270
    const v2, 0x7f13127e

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v2}, La/cp;->v(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_4
    move-object/from16 v1, p1

    .line 284
    .line 285
    check-cast v1, Ljava/util/List;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 291
    .line 292
    check-cast v1, La/gwx;

    .line 293
    .line 294
    iget-object v1, v1, La/gwx;->a:Landroid/widget/TextView;

    .line 295
    .line 296
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, La/ws10;

    .line 301
    .line 302
    const v2, 0x7f13127f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v2}, La/cp;->v(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 310
    .line 311
    .line 312
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_5
    move-object/from16 v1, p1

    .line 316
    .line 317
    check-cast v1, Ljava/util/List;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 323
    .line 324
    check-cast v1, La/dwx;

    .line 325
    .line 326
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 327
    .line 328
    iget-object v2, v1, La/dwx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 329
    .line 330
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    check-cast v7, La/y700;

    .line 335
    .line 336
    invoke-interface {v7}, La/y700;->c()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    invoke-static {v2, v7, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 341
    .line 342
    .line 343
    iget-object v2, v1, La/dwx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 344
    .line 345
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    check-cast v7, La/y700;

    .line 350
    .line 351
    invoke-interface {v7}, La/y700;->d()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-static {v2, v7, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 356
    .line 357
    .line 358
    iget-object v2, v1, La/dwx;->e:Landroid/widget/TextView;

    .line 359
    .line 360
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    check-cast v5, La/y700;

    .line 365
    .line 366
    invoke-interface {v5}, La/y700;->j()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 371
    .line 372
    .line 373
    iget-object v2, v1, La/dwx;->g:Landroid/widget/TextView;

    .line 374
    .line 375
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    check-cast v5, La/y700;

    .line 380
    .line 381
    invoke-interface {v5}, La/y700;->g()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    .line 387
    .line 388
    iget-object v2, v1, La/dwx;->f:Landroid/widget/TextView;

    .line 389
    .line 390
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    check-cast v5, La/y700;

    .line 395
    .line 396
    invoke-interface {v5}, La/y700;->f()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    .line 402
    .line 403
    iget-object v2, v1, La/dwx;->d:Landroid/widget/TextView;

    .line 404
    .line 405
    sget-object v5, La/rdj;->a:La/rdj;

    .line 406
    .line 407
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    check-cast v5, La/y700;

    .line 412
    .line 413
    invoke-interface {v5}, La/y700;->e()J

    .line 414
    .line 415
    .line 416
    move-result-wide v7

    .line 417
    new-instance v5, La/znq0;

    .line 418
    .line 419
    invoke-direct {v5, v7, v8}, La/znq0;-><init>(J)V

    .line 420
    .line 421
    .line 422
    sget-object v7, La/sdj;->b:La/sdj;

    .line 423
    .line 424
    const/16 v8, 0x3c

    .line 425
    .line 426
    invoke-static {v5, v7, v4, v8}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 431
    .line 432
    .line 433
    iget-object v2, v1, La/dwx;->h:Landroid/view/View;

    .line 434
    .line 435
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    check-cast v4, La/y700;

    .line 440
    .line 441
    invoke-interface {v4}, La/y700;->a()Z

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    if-eqz v4, :cond_0

    .line 446
    .line 447
    move v4, v6

    .line 448
    goto :goto_0

    .line 449
    :cond_0
    move v4, v3

    .line 450
    :goto_0
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 451
    .line 452
    .line 453
    iget-object v1, v1, La/dwx;->i:Landroid/view/View;

    .line 454
    .line 455
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    check-cast v0, La/y700;

    .line 460
    .line 461
    invoke-interface {v0}, La/y700;->b()Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_1

    .line 466
    .line 467
    move v3, v6

    .line 468
    :cond_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 469
    .line 470
    .line 471
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_6
    move-object/from16 v1, p1

    .line 475
    .line 476
    check-cast v1, Ljava/util/List;

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 482
    .line 483
    check-cast v1, La/cwx;

    .line 484
    .line 485
    iget-object v1, v1, La/cwx;->b:Landroid/widget/TextView;

    .line 486
    .line 487
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    check-cast v0, La/u700;

    .line 492
    .line 493
    invoke-virtual {v0}, La/u700;->h()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 498
    .line 499
    .line 500
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 501
    .line 502
    return-object v0

    .line 503
    :pswitch_7
    move-object/from16 v1, p1

    .line 504
    .line 505
    check-cast v1, Ljava/util/List;

    .line 506
    .line 507
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    check-cast v1, La/w140;

    .line 515
    .line 516
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 517
    .line 518
    check-cast v0, La/bwx;

    .line 519
    .line 520
    iget-object v2, v0, La/bwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 521
    .line 522
    iget v3, v1, La/w140;->d:I

    .line 523
    .line 524
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 525
    .line 526
    .line 527
    iget-object v2, v0, La/bwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 528
    .line 529
    iget-boolean v3, v1, La/w140;->b:Z

    .line 530
    .line 531
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 532
    .line 533
    .line 534
    iget-object v0, v0, La/bwx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 535
    .line 536
    iget-object v2, v1, La/w140;->e:Ljava/lang/String;

    .line 537
    .line 538
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 539
    .line 540
    .line 541
    iget-object v1, v1, La/w140;->f:Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 544
    .line 545
    .line 546
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_8
    move-object/from16 v1, p1

    .line 550
    .line 551
    check-cast v1, Ljava/util/List;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    check-cast v1, La/w140;

    .line 561
    .line 562
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 563
    .line 564
    check-cast v0, La/zvx;

    .line 565
    .line 566
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 567
    .line 568
    iget v3, v1, La/w140;->d:I

    .line 569
    .line 570
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 571
    .line 572
    .line 573
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 574
    .line 575
    iget-boolean v3, v1, La/w140;->b:Z

    .line 576
    .line 577
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 578
    .line 579
    .line 580
    iget-object v0, v0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 581
    .line 582
    iget-object v2, v1, La/w140;->e:Ljava/lang/String;

    .line 583
    .line 584
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 585
    .line 586
    .line 587
    iget-object v1, v1, La/w140;->f:Ljava/lang/String;

    .line 588
    .line 589
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 590
    .line 591
    .line 592
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 593
    .line 594
    return-object v0

    .line 595
    :pswitch_9
    move-object/from16 v1, p1

    .line 596
    .line 597
    check-cast v1, Ljava/util/List;

    .line 598
    .line 599
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    check-cast v1, La/a240;

    .line 607
    .line 608
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 609
    .line 610
    check-cast v0, La/zvx;

    .line 611
    .line 612
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 613
    .line 614
    iget v3, v1, La/a240;->d:I

    .line 615
    .line 616
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 617
    .line 618
    .line 619
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 620
    .line 621
    iget-boolean v3, v1, La/a240;->b:Z

    .line 622
    .line 623
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 624
    .line 625
    .line 626
    iget-object v0, v0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 627
    .line 628
    iget-object v2, v1, La/a240;->e:Ljava/lang/String;

    .line 629
    .line 630
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 631
    .line 632
    .line 633
    iget-object v1, v1, La/a240;->f:Ljava/lang/String;

    .line 634
    .line 635
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 636
    .line 637
    .line 638
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 639
    .line 640
    return-object v0

    .line 641
    :pswitch_a
    move-object/from16 v1, p1

    .line 642
    .line 643
    check-cast v1, Ljava/util/List;

    .line 644
    .line 645
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    check-cast v1, La/a240;

    .line 653
    .line 654
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 655
    .line 656
    check-cast v0, La/awx;

    .line 657
    .line 658
    iget-object v2, v0, La/awx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 659
    .line 660
    iget v3, v1, La/a240;->d:I

    .line 661
    .line 662
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 663
    .line 664
    .line 665
    iget-object v2, v0, La/awx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 666
    .line 667
    iget-boolean v3, v1, La/a240;->b:Z

    .line 668
    .line 669
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 670
    .line 671
    .line 672
    iget-object v2, v0, La/awx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 673
    .line 674
    iget-object v3, v1, La/a240;->e:Ljava/lang/String;

    .line 675
    .line 676
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 677
    .line 678
    .line 679
    iget-object v3, v1, La/a240;->f:Ljava/lang/String;

    .line 680
    .line 681
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 682
    .line 683
    .line 684
    iget-object v0, v0, La/awx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 685
    .line 686
    iget v1, v1, La/a240;->g:I

    .line 687
    .line 688
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCount(Ljava/lang/Integer;)V

    .line 693
    .line 694
    .line 695
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    return-object v0

    .line 698
    :pswitch_b
    move-object/from16 v1, p1

    .line 699
    .line 700
    check-cast v1, Ljava/util/List;

    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    check-cast v1, La/l140;

    .line 710
    .line 711
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 712
    .line 713
    check-cast v0, La/zvx;

    .line 714
    .line 715
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 716
    .line 717
    iget v3, v1, La/l140;->d:I

    .line 718
    .line 719
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 720
    .line 721
    .line 722
    iget-object v2, v0, La/zvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 723
    .line 724
    iget-boolean v3, v1, La/l140;->b:Z

    .line 725
    .line 726
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 727
    .line 728
    .line 729
    iget-object v0, v0, La/zvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 730
    .line 731
    iget-object v2, v1, La/l140;->e:Ljava/lang/String;

    .line 732
    .line 733
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 734
    .line 735
    .line 736
    iget-object v1, v1, La/l140;->f:Ljava/lang/String;

    .line 737
    .line 738
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 739
    .line 740
    .line 741
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 742
    .line 743
    return-object v0

    .line 744
    :pswitch_c
    move-object/from16 v1, p1

    .line 745
    .line 746
    check-cast v1, Ljava/util/List;

    .line 747
    .line 748
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 752
    .line 753
    check-cast v1, La/xvx;

    .line 754
    .line 755
    iget-object v1, v1, La/xvx;->a:Landroid/widget/TextView;

    .line 756
    .line 757
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    check-cast v2, La/srz;

    .line 762
    .line 763
    iget v2, v2, La/srz;->a:I

    .line 764
    .line 765
    invoke-virtual {v0, v2}, La/cp;->v(I)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 770
    .line 771
    .line 772
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 773
    .line 774
    return-object v0

    .line 775
    :pswitch_d
    move-object/from16 v1, p1

    .line 776
    .line 777
    check-cast v1, Ljava/util/List;

    .line 778
    .line 779
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 783
    .line 784
    move-object v2, v1

    .line 785
    check-cast v2, La/yvx;

    .line 786
    .line 787
    iget-object v2, v2, La/yvx;->c:Landroid/widget/TextView;

    .line 788
    .line 789
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    check-cast v3, La/rrz;

    .line 794
    .line 795
    iget v3, v3, La/rrz;->a:I

    .line 796
    .line 797
    invoke-virtual {v0, v3}, La/cp;->v(I)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 802
    .line 803
    .line 804
    check-cast v1, La/yvx;

    .line 805
    .line 806
    iget-object v1, v1, La/yvx;->b:Landroid/widget/TextView;

    .line 807
    .line 808
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    check-cast v2, La/rrz;

    .line 813
    .line 814
    const v2, 0x7f1306c1

    .line 815
    .line 816
    .line 817
    invoke-virtual {v0, v2}, La/cp;->v(I)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 822
    .line 823
    .line 824
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 825
    .line 826
    return-object v0

    .line 827
    :pswitch_e
    move-object/from16 v1, p1

    .line 828
    .line 829
    check-cast v1, Ljava/util/List;

    .line 830
    .line 831
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 835
    .line 836
    move-object v2, v1

    .line 837
    check-cast v2, La/r6z;

    .line 838
    .line 839
    iget-object v2, v2, La/r6z;->b:Lorg/xplatform/referral/impl/presentation/takepart/view/LevelInfoView;

    .line 840
    .line 841
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v3

    .line 845
    check-cast v3, La/fkz;

    .line 846
    .line 847
    iget-byte v3, v3, La/fkz;->a:B

    .line 848
    .line 849
    invoke-virtual {v2, v3}, Lorg/xplatform/referral/impl/presentation/takepart/view/LevelInfoView;->setLevel(I)V

    .line 850
    .line 851
    .line 852
    check-cast v1, La/r6z;

    .line 853
    .line 854
    iget-object v1, v1, La/r6z;->b:Lorg/xplatform/referral/impl/presentation/takepart/view/LevelInfoView;

    .line 855
    .line 856
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    check-cast v0, La/fkz;

    .line 861
    .line 862
    iget-byte v0, v0, La/fkz;->b:B

    .line 863
    .line 864
    invoke-virtual {v1, v0}, Lorg/xplatform/referral/impl/presentation/takepart/view/LevelInfoView;->setProgress(I)V

    .line 865
    .line 866
    .line 867
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 868
    .line 869
    return-object v0

    .line 870
    :pswitch_f
    move-object/from16 v1, p1

    .line 871
    .line 872
    check-cast v1, Ljava/util/List;

    .line 873
    .line 874
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 878
    .line 879
    move-object v2, v1

    .line 880
    check-cast v2, La/s7b0;

    .line 881
    .line 882
    iget-object v2, v2, La/s7b0;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 883
    .line 884
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    check-cast v3, La/tv60;

    .line 889
    .line 890
    iget-object v3, v3, La/tv60;->a:La/nrv;

    .line 891
    .line 892
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 893
    .line 894
    .line 895
    check-cast v1, La/s7b0;

    .line 896
    .line 897
    iget-object v1, v1, La/s7b0;->b:Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;

    .line 898
    .line 899
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    check-cast v0, La/tv60;

    .line 904
    .line 905
    iget-object v0, v0, La/tv60;->b:La/rv60;

    .line 906
    .line 907
    iget-object v0, v0, La/rv60;->a:La/rvy;

    .line 908
    .line 909
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->setModel(La/rvy;)V

    .line 910
    .line 911
    .line 912
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 913
    .line 914
    return-object v0

    .line 915
    :pswitch_10
    move-object/from16 v1, p1

    .line 916
    .line 917
    check-cast v1, Ljava/util/List;

    .line 918
    .line 919
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 923
    .line 924
    move-object v2, v1

    .line 925
    check-cast v2, La/vvx;

    .line 926
    .line 927
    iget-object v2, v2, La/vvx;->b:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 928
    .line 929
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v3

    .line 933
    check-cast v3, La/euy;

    .line 934
    .line 935
    iget-object v3, v3, La/euy;->c:Ljava/lang/String;

    .line 936
    .line 937
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 938
    .line 939
    .line 940
    check-cast v1, La/vvx;

    .line 941
    .line 942
    iget-object v2, v1, La/vvx;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 943
    .line 944
    iget-object v3, v1, La/vvx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 945
    .line 946
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v4

    .line 950
    check-cast v4, La/euy;

    .line 951
    .line 952
    iget-object v4, v4, La/euy;->a:Ljava/lang/String;

    .line 953
    .line 954
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setText(Ljava/lang/CharSequence;)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    check-cast v2, La/euy;

    .line 962
    .line 963
    iget v2, v2, La/euy;->b:I

    .line 964
    .line 965
    if-eqz v2, :cond_2

    .line 966
    .line 967
    iget-object v1, v1, La/vvx;->c:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 968
    .line 969
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 970
    .line 971
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 972
    .line 973
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v4

    .line 977
    check-cast v4, La/euy;

    .line 978
    .line 979
    iget v4, v4, La/euy;->b:I

    .line 980
    .line 981
    invoke-static {v2, v4, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 982
    .line 983
    .line 984
    move-result v2

    .line 985
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setTextColor(I)V

    .line 986
    .line 987
    .line 988
    :cond_2
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    check-cast v1, La/euy;

    .line 993
    .line 994
    iget-object v1, v1, La/euy;->d:La/uwx;

    .line 995
    .line 996
    sget-object v2, La/uwx;->a:La/uwx;

    .line 997
    .line 998
    const/4 v4, 0x1

    .line 999
    if-eq v1, v2, :cond_4

    .line 1000
    .line 1001
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    check-cast v1, La/euy;

    .line 1006
    .line 1007
    iget-object v1, v1, La/euy;->d:La/uwx;

    .line 1008
    .line 1009
    sget-object v2, La/uwx;->d:La/uwx;

    .line 1010
    .line 1011
    if-ne v1, v2, :cond_3

    .line 1012
    .line 1013
    goto :goto_1

    .line 1014
    :cond_3
    move v1, v6

    .line 1015
    goto :goto_2

    .line 1016
    :cond_4
    :goto_1
    move v1, v4

    .line 1017
    :goto_2
    invoke-virtual {v3, v1}, La/tw5;->setFirst(Z)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    check-cast v1, La/euy;

    .line 1025
    .line 1026
    iget-object v1, v1, La/euy;->d:La/uwx;

    .line 1027
    .line 1028
    sget-object v2, La/uwx;->c:La/uwx;

    .line 1029
    .line 1030
    if-eq v1, v2, :cond_5

    .line 1031
    .line 1032
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    check-cast v0, La/euy;

    .line 1037
    .line 1038
    iget-object v0, v0, La/euy;->d:La/uwx;

    .line 1039
    .line 1040
    sget-object v1, La/uwx;->d:La/uwx;

    .line 1041
    .line 1042
    if-ne v0, v1, :cond_6

    .line 1043
    .line 1044
    :cond_5
    move v6, v4

    .line 1045
    :cond_6
    invoke-virtual {v3, v6}, La/tw5;->setLast(Z)V

    .line 1046
    .line 1047
    .line 1048
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1049
    .line 1050
    return-object v0

    .line 1051
    :pswitch_11
    move-object/from16 v1, p1

    .line 1052
    .line 1053
    check-cast v1, Ljava/util/List;

    .line 1054
    .line 1055
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1059
    .line 1060
    check-cast v1, La/yxx;

    .line 1061
    .line 1062
    iget-object v1, v1, La/yxx;->b:Landroid/widget/TextView;

    .line 1063
    .line 1064
    new-instance v3, Ljava/util/ArrayList;

    .line 1065
    .line 1066
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1067
    .line 1068
    .line 1069
    new-instance v4, La/bnk0;

    .line 1070
    .line 1071
    invoke-direct {v4}, La/bnk0;-><init>()V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v5

    .line 1078
    check-cast v5, La/pvx;

    .line 1079
    .line 1080
    iget v5, v5, La/pvx;->a:I

    .line 1081
    .line 1082
    invoke-virtual {v0, v5}, La/cp;->v(I)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v5

    .line 1086
    const/4 v9, 0x0

    .line 1087
    const/16 v10, 0x2e

    .line 1088
    .line 1089
    const/4 v6, 0x0

    .line 1090
    const/4 v7, 0x0

    .line 1091
    const/4 v8, 0x1

    .line 1092
    invoke-static/range {v4 .. v10}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1093
    .line 1094
    .line 1095
    const-string v5, ": "

    .line 1096
    .line 1097
    invoke-static/range {v4 .. v10}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v5

    .line 1104
    check-cast v5, La/pvx;

    .line 1105
    .line 1106
    iget-object v5, v5, La/pvx;->b:Ljava/lang/String;

    .line 1107
    .line 1108
    const/16 v10, 0x36

    .line 1109
    .line 1110
    const v7, 0x7f0606e1

    .line 1111
    .line 1112
    .line 1113
    const/4 v8, 0x0

    .line 1114
    invoke-static/range {v4 .. v10}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 1115
    .line 1116
    .line 1117
    iget-object v4, v4, La/bnk0;->a:Ljava/util/ArrayList;

    .line 1118
    .line 1119
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1120
    .line 1121
    .line 1122
    iget-object v0, v0, La/xhe0;->a:Landroid/view/View;

    .line 1123
    .line 1124
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1129
    .line 1130
    .line 1131
    new-instance v4, Landroid/text/SpannableStringBuilder;

    .line 1132
    .line 1133
    invoke-direct {v4}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 1134
    .line 1135
    .line 1136
    new-instance v5, Ljava/util/ArrayList;

    .line 1137
    .line 1138
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1139
    .line 1140
    .line 1141
    move-result v2

    .line 1142
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v2

    .line 1149
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1150
    .line 1151
    .line 1152
    move-result v3

    .line 1153
    if-eqz v3, :cond_7

    .line 1154
    .line 1155
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v3

    .line 1159
    check-cast v3, La/zmk0;

    .line 1160
    .line 1161
    invoke-virtual {v3, v0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    invoke-virtual {v4, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1170
    .line 1171
    .line 1172
    goto :goto_3

    .line 1173
    :cond_7
    invoke-static {v4}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1181
    .line 1182
    .line 1183
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1184
    .line 1185
    return-object v0

    .line 1186
    :pswitch_12
    move-object/from16 v1, p1

    .line 1187
    .line 1188
    check-cast v1, Ljava/util/List;

    .line 1189
    .line 1190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v1

    .line 1197
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 1198
    .line 1199
    check-cast v1, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 1200
    .line 1201
    iget-boolean v1, v1, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->e:Z

    .line 1202
    .line 1203
    if-eqz v1, :cond_8

    .line 1204
    .line 1205
    const v1, 0x7f040afc

    .line 1206
    .line 1207
    .line 1208
    goto :goto_4

    .line 1209
    :cond_8
    const v1, 0x7f040b72

    .line 1210
    .line 1211
    .line 1212
    :goto_4
    check-cast v2, La/uvx;

    .line 1213
    .line 1214
    iget-object v3, v2, La/uvx;->b:Landroid/widget/TextView;

    .line 1215
    .line 1216
    sget-object v4, La/j5d;->a:Landroid/util/TypedValue;

    .line 1217
    .line 1218
    iget-object v4, v0, La/xhe0;->a:Landroid/view/View;

    .line 1219
    .line 1220
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v4

    .line 1224
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1225
    .line 1226
    .line 1227
    invoke-static {v4, v1, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1228
    .line 1229
    .line 1230
    move-result v1

    .line 1231
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1232
    .line 1233
    .line 1234
    iget-object v1, v2, La/uvx;->b:Landroid/widget/TextView;

    .line 1235
    .line 1236
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    check-cast v0, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 1241
    .line 1242
    iget-object v0, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->b:Ljava/lang/String;

    .line 1243
    .line 1244
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1245
    .line 1246
    .line 1247
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1248
    .line 1249
    return-object v0

    .line 1250
    :pswitch_13
    move-object/from16 v1, p1

    .line 1251
    .line 1252
    check-cast v1, Ljava/util/List;

    .line 1253
    .line 1254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    check-cast v1, La/u140;

    .line 1262
    .line 1263
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1264
    .line 1265
    check-cast v0, La/bzx;

    .line 1266
    .line 1267
    iget-object v2, v0, La/bzx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1268
    .line 1269
    iget v3, v1, La/u140;->d:I

    .line 1270
    .line 1271
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1272
    .line 1273
    .line 1274
    iget-object v2, v0, La/bzx;->d:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1275
    .line 1276
    iget-boolean v3, v1, La/u140;->a:Z

    .line 1277
    .line 1278
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1279
    .line 1280
    .line 1281
    iget-object v2, v0, La/bzx;->f:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1282
    .line 1283
    iget-object v3, v1, La/u140;->e:Ljava/lang/String;

    .line 1284
    .line 1285
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1286
    .line 1287
    .line 1288
    iget-object v3, v1, La/u140;->f:Ljava/lang/String;

    .line 1289
    .line 1290
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1291
    .line 1292
    .line 1293
    iget-object v0, v0, La/bzx;->c:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 1294
    .line 1295
    iget-object v1, v1, La/u140;->g:Ljava/util/List;

    .line 1296
    .line 1297
    sget v2, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->o2:I

    .line 1298
    .line 1299
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1304
    .line 1305
    .line 1306
    check-cast v0, La/o4s;

    .line 1307
    .line 1308
    invoke-virtual {v0, v1, v4}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 1309
    .line 1310
    .line 1311
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1312
    .line 1313
    return-object v0

    .line 1314
    :pswitch_14
    move-object/from16 v1, p1

    .line 1315
    .line 1316
    check-cast v1, Ljava/util/List;

    .line 1317
    .line 1318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v1

    .line 1325
    check-cast v1, La/y140;

    .line 1326
    .line 1327
    iget-object v3, v0, La/cp;->u:La/yfu0;

    .line 1328
    .line 1329
    check-cast v3, La/wxx;

    .line 1330
    .line 1331
    iget-object v7, v3, La/wxx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1332
    .line 1333
    sget-object v8, La/j5d;->a:Landroid/util/TypedValue;

    .line 1334
    .line 1335
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 1336
    .line 1337
    iget v8, v1, La/y140;->h:I

    .line 1338
    .line 1339
    invoke-static {v0, v8, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1340
    .line 1341
    .line 1342
    move-result v9

    .line 1343
    invoke-virtual {v7, v9}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 1344
    .line 1345
    .line 1346
    iget-object v10, v3, La/wxx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1347
    .line 1348
    iget v7, v1, La/y140;->i:I

    .line 1349
    .line 1350
    invoke-virtual {v10, v7}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1351
    .line 1352
    .line 1353
    iget-object v11, v1, La/y140;->g:Ljava/lang/String;

    .line 1354
    .line 1355
    iget-object v12, v1, La/y140;->f:Ljava/lang/String;

    .line 1356
    .line 1357
    iget v9, v1, La/y140;->e:I

    .line 1358
    .line 1359
    invoke-static {v0, v9, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1360
    .line 1361
    .line 1362
    move-result v9

    .line 1363
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v13

    .line 1367
    const v9, 0x7f040ae1

    .line 1368
    .line 1369
    .line 1370
    invoke-static {v0, v9, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1371
    .line 1372
    .line 1373
    move-result v9

    .line 1374
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v14

    .line 1378
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v15

    .line 1382
    invoke-static {v0, v8, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1383
    .line 1384
    .line 1385
    move-result v0

    .line 1386
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v16

    .line 1390
    invoke-virtual/range {v10 .. v16}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 1391
    .line 1392
    .line 1393
    iget-boolean v0, v1, La/y140;->a:Z

    .line 1394
    .line 1395
    invoke-virtual {v10, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1396
    .line 1397
    .line 1398
    iget-object v0, v3, La/wxx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1399
    .line 1400
    iget-object v6, v1, La/y140;->j:Ljava/lang/String;

    .line 1401
    .line 1402
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1403
    .line 1404
    .line 1405
    iget-object v6, v1, La/y140;->k:Ljava/lang/String;

    .line 1406
    .line 1407
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1408
    .line 1409
    .line 1410
    iget-object v0, v3, La/wxx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1411
    .line 1412
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1413
    .line 1414
    .line 1415
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 1416
    .line 1417
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v6

    .line 1421
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1422
    .line 1423
    .line 1424
    iget-object v7, v1, La/y140;->l:Ljava/lang/String;

    .line 1425
    .line 1426
    new-instance v11, La/k9;

    .line 1427
    .line 1428
    invoke-direct {v11, v0, v2}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 1429
    .line 1430
    .line 1431
    new-instance v12, La/k9;

    .line 1432
    .line 1433
    invoke-direct {v12, v0, v5}, La/k9;-><init>(Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;B)V

    .line 1434
    .line 1435
    .line 1436
    const/16 v13, 0xe

    .line 1437
    .line 1438
    const/4 v8, 0x0

    .line 1439
    const/4 v9, 0x0

    .line 1440
    const/4 v10, 0x0

    .line 1441
    invoke-static/range {v6 .. v13}, La/u0d;->s(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1442
    .line 1443
    .line 1444
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1445
    .line 1446
    return-object v0

    .line 1447
    :pswitch_15
    move-object/from16 v1, p1

    .line 1448
    .line 1449
    check-cast v1, Ljava/util/List;

    .line 1450
    .line 1451
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1452
    .line 1453
    .line 1454
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1455
    .line 1456
    move-object v2, v1

    .line 1457
    check-cast v2, La/bwx;

    .line 1458
    .line 1459
    iget-object v2, v2, La/bwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1460
    .line 1461
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v3

    .line 1465
    check-cast v3, La/s140;

    .line 1466
    .line 1467
    iget v3, v3, La/s140;->d:I

    .line 1468
    .line 1469
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1470
    .line 1471
    .line 1472
    check-cast v1, La/bwx;

    .line 1473
    .line 1474
    iget-object v2, v1, La/bwx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1475
    .line 1476
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v3

    .line 1480
    check-cast v3, La/s140;

    .line 1481
    .line 1482
    iget-object v3, v3, La/s140;->e:Ljava/lang/String;

    .line 1483
    .line 1484
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1485
    .line 1486
    .line 1487
    iget-object v2, v1, La/bwx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1488
    .line 1489
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v3

    .line 1493
    check-cast v3, La/s140;

    .line 1494
    .line 1495
    iget-object v3, v3, La/s140;->f:Ljava/lang/String;

    .line 1496
    .line 1497
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1498
    .line 1499
    .line 1500
    iget-object v1, v1, La/bwx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1501
    .line 1502
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    check-cast v0, La/s140;

    .line 1507
    .line 1508
    iget-boolean v0, v0, La/s140;->b:Z

    .line 1509
    .line 1510
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1511
    .line 1512
    .line 1513
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1514
    .line 1515
    return-object v0

    .line 1516
    :pswitch_16
    move-object/from16 v1, p1

    .line 1517
    .line 1518
    check-cast v1, Ljava/util/List;

    .line 1519
    .line 1520
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    check-cast v1, La/r140;

    .line 1528
    .line 1529
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 1530
    .line 1531
    check-cast v0, La/eux;

    .line 1532
    .line 1533
    iget-object v2, v0, La/eux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1534
    .line 1535
    iget v3, v1, La/r140;->d:I

    .line 1536
    .line 1537
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1538
    .line 1539
    .line 1540
    iget-object v2, v0, La/eux;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1541
    .line 1542
    iget-object v3, v1, La/r140;->e:Ljava/lang/String;

    .line 1543
    .line 1544
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1545
    .line 1546
    .line 1547
    iget-object v3, v1, La/r140;->f:Ljava/lang/String;

    .line 1548
    .line 1549
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1550
    .line 1551
    .line 1552
    iget-object v2, v0, La/eux;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1553
    .line 1554
    iget v3, v1, La/r140;->g:I

    .line 1555
    .line 1556
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 1557
    .line 1558
    .line 1559
    iget-object v0, v0, La/eux;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1560
    .line 1561
    iget-boolean v1, v1, La/r140;->b:Z

    .line 1562
    .line 1563
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1564
    .line 1565
    .line 1566
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1567
    .line 1568
    return-object v0

    .line 1569
    :pswitch_17
    move-object/from16 v1, p1

    .line 1570
    .line 1571
    check-cast v1, Ljava/util/List;

    .line 1572
    .line 1573
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v1

    .line 1580
    check-cast v1, La/p140;

    .line 1581
    .line 1582
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 1583
    .line 1584
    check-cast v2, La/wtx;

    .line 1585
    .line 1586
    iget-object v3, v2, La/wtx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1587
    .line 1588
    iget v4, v1, La/p140;->f:I

    .line 1589
    .line 1590
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1591
    .line 1592
    .line 1593
    iget-object v3, v2, La/wtx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1594
    .line 1595
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 1596
    .line 1597
    iget v4, v1, La/p140;->g:I

    .line 1598
    .line 1599
    invoke-static {v4, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1600
    .line 1601
    .line 1602
    move-result v0

    .line 1603
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 1604
    .line 1605
    .line 1606
    iget-boolean v0, v1, La/p140;->b:Z

    .line 1607
    .line 1608
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeVisible(Z)V

    .line 1609
    .line 1610
    .line 1611
    iget v0, v1, La/p140;->d:I

    .line 1612
    .line 1613
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBadgeBackgroundTint(I)V

    .line 1614
    .line 1615
    .line 1616
    iget v0, v1, La/p140;->h:I

    .line 1617
    .line 1618
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconBackgroundTint(I)V

    .line 1619
    .line 1620
    .line 1621
    iget-object v0, v2, La/wtx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1622
    .line 1623
    iget-object v3, v1, La/p140;->i:Ljava/lang/String;

    .line 1624
    .line 1625
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 1626
    .line 1627
    .line 1628
    iget-object v3, v1, La/p140;->j:Ljava/lang/String;

    .line 1629
    .line 1630
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1631
    .line 1632
    .line 1633
    iget-object v0, v2, La/wtx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 1634
    .line 1635
    iget v3, v1, La/p140;->k:I

    .line 1636
    .line 1637
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageResource(I)V

    .line 1638
    .line 1639
    .line 1640
    iget-object v3, v1, La/p140;->m:Landroid/graphics/ColorFilter;

    .line 1641
    .line 1642
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 1643
    .line 1644
    .line 1645
    iget-object v0, v2, La/wtx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 1646
    .line 1647
    iget v1, v1, La/p140;->l:I

    .line 1648
    .line 1649
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1650
    .line 1651
    .line 1652
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1653
    .line 1654
    return-object v0

    .line 1655
    :pswitch_18
    move-object/from16 v1, p1

    .line 1656
    .line 1657
    check-cast v1, Ljava/util/List;

    .line 1658
    .line 1659
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1660
    .line 1661
    .line 1662
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v1

    .line 1666
    check-cast v1, La/xrw;

    .line 1667
    .line 1668
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1669
    .line 1670
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 1671
    .line 1672
    check-cast v2, La/nvx;

    .line 1673
    .line 1674
    iget-object v3, v2, La/nvx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1675
    .line 1676
    iget-object v4, v1, La/xrw;->b:Ljava/lang/String;

    .line 1677
    .line 1678
    invoke-static {v3, v4, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1679
    .line 1680
    .line 1681
    iget-object v3, v2, La/nvx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1682
    .line 1683
    iget-object v4, v1, La/xrw;->d:Ljava/lang/String;

    .line 1684
    .line 1685
    invoke-static {v3, v4, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1686
    .line 1687
    .line 1688
    iget-object v3, v2, La/nvx;->e:Landroid/widget/TextView;

    .line 1689
    .line 1690
    iget-object v4, v1, La/xrw;->a:Ljava/lang/String;

    .line 1691
    .line 1692
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1693
    .line 1694
    .line 1695
    iget-object v3, v2, La/nvx;->f:Landroid/widget/TextView;

    .line 1696
    .line 1697
    iget-object v4, v1, La/xrw;->c:Ljava/lang/String;

    .line 1698
    .line 1699
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1700
    .line 1701
    .line 1702
    iget-object v3, v1, La/xrw;->e:Ljava/lang/String;

    .line 1703
    .line 1704
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1705
    .line 1706
    .line 1707
    move-result v4

    .line 1708
    iget-object v2, v2, La/nvx;->d:Landroid/widget/TextView;

    .line 1709
    .line 1710
    if-lez v4, :cond_9

    .line 1711
    .line 1712
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1713
    .line 1714
    .line 1715
    goto :goto_5

    .line 1716
    :cond_9
    sget-object v3, La/rdj;->a:La/rdj;

    .line 1717
    .line 1718
    iget-object v0, v0, La/cp;->w:Landroid/content/Context;

    .line 1719
    .line 1720
    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 1721
    .line 1722
    .line 1723
    move-result v0

    .line 1724
    iget-wide v3, v1, La/xrw;->f:J

    .line 1725
    .line 1726
    sget-object v1, La/efj;->c:La/efj;

    .line 1727
    .line 1728
    new-instance v5, La/znq0;

    .line 1729
    .line 1730
    invoke-direct {v5, v3, v4}, La/znq0;-><init>(J)V

    .line 1731
    .line 1732
    .line 1733
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    const/16 v3, 0x38

    .line 1738
    .line 1739
    invoke-static {v5, v1, v0, v6, v3}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1744
    .line 1745
    .line 1746
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1747
    .line 1748
    return-object v0

    .line 1749
    :pswitch_19
    move-object/from16 v1, p1

    .line 1750
    .line 1751
    check-cast v1, Ljava/util/List;

    .line 1752
    .line 1753
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1754
    .line 1755
    .line 1756
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1757
    .line 1758
    move-object v2, v1

    .line 1759
    check-cast v2, La/mvx;

    .line 1760
    .line 1761
    iget-object v2, v2, La/mvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1762
    .line 1763
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v3

    .line 1767
    check-cast v3, La/m8w;

    .line 1768
    .line 1769
    iget v3, v3, La/m8w;->a:I

    .line 1770
    .line 1771
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1772
    .line 1773
    .line 1774
    check-cast v1, La/mvx;

    .line 1775
    .line 1776
    iget-object v2, v1, La/mvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1777
    .line 1778
    iget-object v3, v0, La/cp;->w:Landroid/content/Context;

    .line 1779
    .line 1780
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v4

    .line 1784
    check-cast v4, La/m8w;

    .line 1785
    .line 1786
    iget v4, v4, La/m8w;->b:I

    .line 1787
    .line 1788
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1789
    .line 1790
    .line 1791
    move-result v4

    .line 1792
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 1793
    .line 1794
    .line 1795
    iget-object v2, v1, La/mvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1796
    .line 1797
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v4

    .line 1801
    check-cast v4, La/m8w;

    .line 1802
    .line 1803
    iget v4, v4, La/m8w;->c:I

    .line 1804
    .line 1805
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

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
    iget-object v1, v1, La/mvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 1817
    .line 1818
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v2

    .line 1822
    check-cast v2, La/m8w;

    .line 1823
    .line 1824
    iget v2, v2, La/m8w;->d:I

    .line 1825
    .line 1826
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 1827
    .line 1828
    .line 1829
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v2

    .line 1833
    check-cast v2, La/m8w;

    .line 1834
    .line 1835
    iget v2, v2, La/m8w;->d:I

    .line 1836
    .line 1837
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 1838
    .line 1839
    .line 1840
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v0

    .line 1844
    check-cast v0, La/m8w;

    .line 1845
    .line 1846
    iget-object v0, v0, La/m8w;->e:Ljava/lang/String;

    .line 1847
    .line 1848
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1849
    .line 1850
    .line 1851
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1852
    .line 1853
    return-object v0

    .line 1854
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1855
    .line 1856
    check-cast v1, Ljava/util/List;

    .line 1857
    .line 1858
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1859
    .line 1860
    .line 1861
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v0

    .line 1865
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v0

    .line 1869
    sget-object v1, La/sre0;->a:La/tre0;

    .line 1870
    .line 1871
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v0

    .line 1879
    const-string v1, "AdapterDelegate not found for "

    .line 1880
    .line 1881
    const-string v2, "fallbackAdapterDelegate"

    .line 1882
    .line 1883
    invoke-static {v1, v0, v2}, La/f140;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1887
    .line 1888
    return-object v0

    .line 1889
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1890
    .line 1891
    check-cast v1, Ljava/util/List;

    .line 1892
    .line 1893
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1894
    .line 1895
    .line 1896
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1897
    .line 1898
    move-object v2, v1

    .line 1899
    check-cast v2, La/s2w;

    .line 1900
    .line 1901
    iget-object v2, v2, La/s2w;->b:Landroid/widget/TextView;

    .line 1902
    .line 1903
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v3

    .line 1907
    check-cast v3, La/e2w;

    .line 1908
    .line 1909
    iget-object v3, v3, La/e2w;->a:Lorg/xplatform/ui_core/resources/UiText$ByIntRes;

    .line 1910
    .line 1911
    iget-object v4, v0, La/xhe0;->a:Landroid/view/View;

    .line 1912
    .line 1913
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v5

    .line 1917
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1918
    .line 1919
    .line 1920
    invoke-virtual {v3, v5}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v3

    .line 1924
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1925
    .line 1926
    .line 1927
    check-cast v1, La/s2w;

    .line 1928
    .line 1929
    iget-object v1, v1, La/s2w;->c:Landroid/widget/TextView;

    .line 1930
    .line 1931
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v0

    .line 1935
    check-cast v0, La/e2w;

    .line 1936
    .line 1937
    iget-object v0, v0, La/e2w;->b:Lorg/xplatform/ui_core/resources/UiText$ByString;

    .line 1938
    .line 1939
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v2

    .line 1943
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1944
    .line 1945
    .line 1946
    invoke-virtual {v0, v2}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v0

    .line 1950
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1951
    .line 1952
    .line 1953
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1954
    .line 1955
    return-object v0

    .line 1956
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1957
    .line 1958
    check-cast v1, Ljava/util/List;

    .line 1959
    .line 1960
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1961
    .line 1962
    .line 1963
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 1964
    .line 1965
    move-object v2, v1

    .line 1966
    check-cast v2, La/kvx;

    .line 1967
    .line 1968
    iget-object v2, v2, La/kvx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1969
    .line 1970
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v4

    .line 1974
    check-cast v4, La/l8w;

    .line 1975
    .line 1976
    iget v4, v4, La/l8w;->b:I

    .line 1977
    .line 1978
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 1979
    .line 1980
    .line 1981
    check-cast v1, La/kvx;

    .line 1982
    .line 1983
    iget-object v2, v1, La/kvx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 1984
    .line 1985
    iget-object v4, v0, La/cp;->w:Landroid/content/Context;

    .line 1986
    .line 1987
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v5

    .line 1991
    check-cast v5, La/l8w;

    .line 1992
    .line 1993
    iget v5, v5, La/l8w;->c:I

    .line 1994
    .line 1995
    invoke-static {v5, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1996
    .line 1997
    .line 1998
    move-result v5

    .line 1999
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconTint(I)V

    .line 2000
    .line 2001
    .line 2002
    iget-object v2, v1, La/kvx;->c:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2003
    .line 2004
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v5

    .line 2008
    check-cast v5, La/l8w;

    .line 2009
    .line 2010
    iget v5, v5, La/l8w;->d:I

    .line 2011
    .line 2012
    invoke-static {v5, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 2013
    .line 2014
    .line 2015
    move-result v4

    .line 2016
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v4

    .line 2020
    invoke-static {v2, v4}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 2021
    .line 2022
    .line 2023
    iget-object v2, v1, La/kvx;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2024
    .line 2025
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v4

    .line 2029
    check-cast v4, La/l8w;

    .line 2030
    .line 2031
    iget v4, v4, La/l8w;->e:I

    .line 2032
    .line 2033
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 2034
    .line 2035
    .line 2036
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v4

    .line 2040
    check-cast v4, La/l8w;

    .line 2041
    .line 2042
    iget-object v4, v4, La/l8w;->f:Ljava/lang/String;

    .line 2043
    .line 2044
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2045
    .line 2046
    .line 2047
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v4

    .line 2051
    check-cast v4, La/l8w;

    .line 2052
    .line 2053
    iget v4, v4, La/l8w;->g:I

    .line 2054
    .line 2055
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setCaption(I)V

    .line 2056
    .line 2057
    .line 2058
    iget-object v1, v1, La/kvx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 2059
    .line 2060
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v0

    .line 2064
    check-cast v0, La/l8w;

    .line 2065
    .line 2066
    iget-boolean v0, v0, La/l8w;->h:Z

    .line 2067
    .line 2068
    if-eqz v0, :cond_a

    .line 2069
    .line 2070
    move v3, v6

    .line 2071
    :cond_a
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 2072
    .line 2073
    .line 2074
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2075
    .line 2076
    return-object v0

    .line 2077
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
