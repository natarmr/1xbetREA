.class public final synthetic La/qzp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/enc;


# direct methods
.method public synthetic constructor <init>(La/cp;La/enc;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qzp;->a:B

    iput-object p1, p0, La/qzp;->b:La/cp;

    iput-object p2, p0, La/qzp;->c:La/enc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qzp;->a:B

    .line 4
    .line 5
    const v4, 0x7f040afc

    .line 6
    .line 7
    .line 8
    const/16 v5, 0x8

    .line 9
    .line 10
    iget-object v6, v0, La/qzp;->c:La/enc;

    .line 11
    .line 12
    iget-object v0, v0, La/qzp;->b:La/cp;

    .line 13
    .line 14
    const/4 v8, 0x0

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
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 26
    .line 27
    check-cast v1, La/a2k;

    .line 28
    .line 29
    iget-object v9, v1, La/a2k;->f:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 30
    .line 31
    iget-object v10, v1, La/a2k;->b:Landroid/widget/LinearLayout;

    .line 32
    .line 33
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    check-cast v11, La/rdi0;

    .line 38
    .line 39
    iget-object v11, v11, La/rdi0;->c:Landroid/text/SpannableString;

    .line 40
    .line 41
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    iget-object v9, v1, La/a2k;->f:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 45
    .line 46
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    check-cast v11, La/rdi0;

    .line 51
    .line 52
    iget-object v11, v11, La/rdi0;->c:Landroid/text/SpannableString;

    .line 53
    .line 54
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-lez v11, :cond_0

    .line 59
    .line 60
    move v11, v8

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move v11, v5

    .line 63
    :goto_0
    invoke-virtual {v9, v11}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    check-cast v11, La/rdi0;

    .line 75
    .line 76
    iget-object v11, v11, La/rdi0;->h:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    move v12, v8

    .line 83
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    if-eqz v13, :cond_5

    .line 88
    .line 89
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    add-int/lit8 v14, v12, 0x1

    .line 94
    .line 95
    if-ltz v12, :cond_4

    .line 96
    .line 97
    check-cast v13, La/jzp;

    .line 98
    .line 99
    if-ge v12, v9, :cond_1

    .line 100
    .line 101
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v8}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v12}, La/ttx;->b(Landroid/view/View;)La/ttx;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    iget-object v12, v0, La/cp;->w:Landroid/content/Context;

    .line 117
    .line 118
    invoke-static {v12}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    const v15, 0x7f0d0393

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v15, v10, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    invoke-static {v12}, La/ttx;->b(Landroid/view/View;)La/ttx;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    iget-object v15, v12, La/ttx;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 134
    .line 135
    invoke-virtual {v10, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    :goto_2
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v15

    .line 142
    check-cast v15, La/rdi0;

    .line 143
    .line 144
    iget-object v15, v12, La/ttx;->f:Landroid/widget/TextView;

    .line 145
    .line 146
    iget-object v2, v13, La/jzp;->b:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    iget-object v2, v12, La/ttx;->e:Landroid/widget/TextView;

    .line 152
    .line 153
    iget-object v15, v13, La/jzp;->f:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v2, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    iget-object v2, v12, La/ttx;->c:Landroid/widget/ImageView;

    .line 159
    .line 160
    iget-object v15, v13, La/jzp;->e:La/yos0;

    .line 161
    .line 162
    iget-object v3, v12, La/ttx;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 163
    .line 164
    const/16 p0, 0x0

    .line 165
    .line 166
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v15, v7}, La/btm0;->v(La/yos0;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 178
    .line 179
    .line 180
    iget-object v2, v12, La/ttx;->d:Landroid/widget/ImageView;

    .line 181
    .line 182
    invoke-static {v15}, La/btm0;->q(La/yos0;)Z

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    if-eqz v7, :cond_2

    .line 187
    .line 188
    move v7, v8

    .line 189
    goto :goto_3

    .line 190
    :cond_2
    move v7, v5

    .line 191
    :goto_3
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-nez v7, :cond_3

    .line 199
    .line 200
    sget-object v7, La/j5d;->a:Landroid/util/TypedValue;

    .line 201
    .line 202
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {v7, v4, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    invoke-static {v2, v7}, La/s7n0;->y(Landroid/widget/ImageView;I)V

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_3
    invoke-static {v2}, La/s7n0;->z(Landroid/widget/ImageView;)V

    .line 218
    .line 219
    .line 220
    :goto_4
    new-instance v2, La/rzp;

    .line 221
    .line 222
    const/4 v7, 0x1

    .line 223
    invoke-direct {v2, v6, v13, v7}, La/rzp;-><init>(La/enc;La/jzp;B)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 227
    .line 228
    .line 229
    move v12, v14

    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :cond_4
    const/16 p0, 0x0

    .line 233
    .line 234
    invoke-static {}, La/q3d;->p()V

    .line 235
    .line 236
    .line 237
    throw p0

    .line 238
    :cond_5
    const/16 p0, 0x0

    .line 239
    .line 240
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, La/rdi0;

    .line 245
    .line 246
    iget-object v2, v2, La/rdi0;->h:Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-le v9, v2, :cond_6

    .line 253
    .line 254
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    check-cast v2, La/rdi0;

    .line 259
    .line 260
    iget-object v2, v2, La/rdi0;->h:Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    :goto_5
    if-ge v2, v9, :cond_6

    .line 267
    .line 268
    invoke-virtual {v10, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 276
    .line 277
    .line 278
    add-int/lit8 v2, v2, 0x1

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_6
    iget-object v2, v1, La/a2k;->d:Landroid/widget/ImageView;

    .line 282
    .line 283
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    check-cast v3, La/rdi0;

    .line 288
    .line 289
    iget v3, v3, La/rdi0;->e:I

    .line 290
    .line 291
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 292
    .line 293
    .line 294
    iget-object v2, v1, La/a2k;->g:Landroid/widget/TextView;

    .line 295
    .line 296
    sget-object v3, La/rdj;->a:La/rdj;

    .line 297
    .line 298
    iget-object v3, v0, La/xhe0;->a:Landroid/view/View;

    .line 299
    .line 300
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-static {v3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    check-cast v4, La/rdi0;

    .line 313
    .line 314
    iget-object v4, v4, La/rdi0;->f:Ljava/util/Date;

    .line 315
    .line 316
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 317
    .line 318
    .line 319
    move-result-wide v4

    .line 320
    sget-object v6, La/ykq0;->c:La/ykq0;

    .line 321
    .line 322
    new-instance v7, La/ynq0;

    .line 323
    .line 324
    invoke-direct {v7, v4, v5}, La/ynq0;-><init>(J)V

    .line 325
    .line 326
    .line 327
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    const/16 v4, 0xf8

    .line 332
    .line 333
    move-object/from16 v5, p0

    .line 334
    .line 335
    invoke-static {v7, v6, v3, v5, v4}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    .line 341
    .line 342
    iget-object v2, v1, La/a2k;->c:Landroid/widget/ImageView;

    .line 343
    .line 344
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    check-cast v0, La/rdi0;

    .line 349
    .line 350
    iget-boolean v0, v0, La/rdi0;->i:Z

    .line 351
    .line 352
    if-nez v0, :cond_7

    .line 353
    .line 354
    const/4 v8, 0x4

    .line 355
    :cond_7
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 356
    .line 357
    .line 358
    iget-object v0, v1, La/a2k;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 359
    .line 360
    new-instance v2, La/ccf;

    .line 361
    .line 362
    const/16 v3, 0x18

    .line 363
    .line 364
    invoke-direct {v2, v1, v3}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 368
    .line 369
    .line 370
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_0
    move-object/from16 v1, p1

    .line 374
    .line 375
    check-cast v1, Ljava/util/List;

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 381
    .line 382
    move-object v2, v1

    .line 383
    check-cast v2, La/z1k;

    .line 384
    .line 385
    iget-object v3, v2, La/z1k;->f:Landroid/widget/TextView;

    .line 386
    .line 387
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v7

    .line 391
    check-cast v7, La/pde0;

    .line 392
    .line 393
    iget-object v7, v7, La/pde0;->f:La/dtt0;

    .line 394
    .line 395
    iget-object v7, v7, La/dtt0;->b:Ljava/lang/CharSequence;

    .line 396
    .line 397
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    .line 399
    .line 400
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 401
    .line 402
    iget-object v2, v2, La/z1k;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 403
    .line 404
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    check-cast v3, La/pde0;

    .line 409
    .line 410
    iget-object v3, v3, La/pde0;->f:La/dtt0;

    .line 411
    .line 412
    iget-object v3, v3, La/dtt0;->d:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    check-cast v7, La/pde0;

    .line 419
    .line 420
    iget-object v7, v7, La/pde0;->f:La/dtt0;

    .line 421
    .line 422
    iget v7, v7, La/dtt0;->c:I

    .line 423
    .line 424
    sget-object v9, La/g2x;->a:La/g2x;

    .line 425
    .line 426
    invoke-static {v9}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v20

    .line 430
    const/16 v22, 0x0

    .line 431
    .line 432
    const/16 v23, 0x1ec

    .line 433
    .line 434
    const/16 v19, 0x0

    .line 435
    .line 436
    const/16 v21, 0x0

    .line 437
    .line 438
    move-object/from16 v16, v2

    .line 439
    .line 440
    move-object/from16 v17, v3

    .line 441
    .line 442
    move/from16 v18, v7

    .line 443
    .line 444
    invoke-static/range {v16 .. v23}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 445
    .line 446
    .line 447
    check-cast v1, La/z1k;

    .line 448
    .line 449
    iget-object v2, v1, La/z1k;->h:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 450
    .line 451
    iget-object v3, v1, La/z1k;->b:Landroid/widget/LinearLayout;

    .line 452
    .line 453
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v7

    .line 457
    check-cast v7, La/pde0;

    .line 458
    .line 459
    iget-object v7, v7, La/pde0;->b:Landroid/text/SpannableString;

    .line 460
    .line 461
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    .line 463
    .line 464
    iget-object v2, v1, La/z1k;->h:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 465
    .line 466
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    check-cast v7, La/pde0;

    .line 471
    .line 472
    iget-object v7, v7, La/pde0;->b:Landroid/text/SpannableString;

    .line 473
    .line 474
    invoke-virtual {v7}, Landroid/text/SpannableString;->length()I

    .line 475
    .line 476
    .line 477
    move-result v7

    .line 478
    if-lez v7, :cond_8

    .line 479
    .line 480
    move v7, v8

    .line 481
    goto :goto_6

    .line 482
    :cond_8
    move v7, v5

    .line 483
    :goto_6
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    check-cast v7, La/pde0;

    .line 495
    .line 496
    iget-object v7, v7, La/pde0;->g:Ljava/util/ArrayList;

    .line 497
    .line 498
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    move v9, v8

    .line 503
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v10

    .line 507
    if-eqz v10, :cond_d

    .line 508
    .line 509
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v10

    .line 513
    add-int/lit8 v11, v9, 0x1

    .line 514
    .line 515
    if-ltz v9, :cond_c

    .line 516
    .line 517
    check-cast v10, La/jzp;

    .line 518
    .line 519
    if-ge v9, v2, :cond_9

    .line 520
    .line 521
    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v9, v8}, Landroid/view/View;->setVisibility(I)V

    .line 529
    .line 530
    .line 531
    invoke-static {v9}, La/ttx;->a(Landroid/view/View;)La/ttx;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    goto :goto_8

    .line 536
    :cond_9
    iget-object v9, v0, La/cp;->w:Landroid/content/Context;

    .line 537
    .line 538
    invoke-static {v9}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 539
    .line 540
    .line 541
    move-result-object v9

    .line 542
    const v12, 0x7f0d0392

    .line 543
    .line 544
    .line 545
    invoke-virtual {v9, v12, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 546
    .line 547
    .line 548
    move-result-object v9

    .line 549
    invoke-static {v9}, La/ttx;->a(Landroid/view/View;)La/ttx;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    iget-object v12, v9, La/ttx;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 554
    .line 555
    invoke-virtual {v3, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 556
    .line 557
    .line 558
    :goto_8
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v12

    .line 562
    check-cast v12, La/pde0;

    .line 563
    .line 564
    iget-object v12, v9, La/ttx;->f:Landroid/widget/TextView;

    .line 565
    .line 566
    iget-object v13, v10, La/jzp;->b:Ljava/lang/String;

    .line 567
    .line 568
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 569
    .line 570
    .line 571
    iget-object v12, v9, La/ttx;->e:Landroid/widget/TextView;

    .line 572
    .line 573
    iget-object v13, v10, La/jzp;->f:Ljava/lang/String;

    .line 574
    .line 575
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 576
    .line 577
    .line 578
    iget-object v12, v9, La/ttx;->c:Landroid/widget/ImageView;

    .line 579
    .line 580
    iget-object v13, v10, La/jzp;->e:La/yos0;

    .line 581
    .line 582
    iget-object v14, v9, La/ttx;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 583
    .line 584
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 585
    .line 586
    .line 587
    move-result-object v15

    .line 588
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-static {v13, v15}, La/btm0;->v(La/yos0;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 592
    .line 593
    .line 594
    move-result-object v15

    .line 595
    invoke-virtual {v12, v15}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 596
    .line 597
    .line 598
    const v15, 0x7f080245

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v15}, Landroid/view/View;->setBackgroundResource(I)V

    .line 602
    .line 603
    .line 604
    iget-object v9, v9, La/ttx;->d:Landroid/widget/ImageView;

    .line 605
    .line 606
    invoke-static {v13}, La/btm0;->q(La/yos0;)Z

    .line 607
    .line 608
    .line 609
    move-result v12

    .line 610
    if-eqz v12, :cond_a

    .line 611
    .line 612
    move v12, v8

    .line 613
    goto :goto_9

    .line 614
    :cond_a
    move v12, v5

    .line 615
    :goto_9
    invoke-virtual {v9, v12}, Landroid/view/View;->setVisibility(I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 619
    .line 620
    .line 621
    move-result v12

    .line 622
    if-nez v12, :cond_b

    .line 623
    .line 624
    sget-object v12, La/j5d;->a:Landroid/util/TypedValue;

    .line 625
    .line 626
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 627
    .line 628
    .line 629
    move-result-object v12

    .line 630
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-static {v12, v4, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 634
    .line 635
    .line 636
    move-result v12

    .line 637
    invoke-static {v9, v12}, La/s7n0;->y(Landroid/widget/ImageView;I)V

    .line 638
    .line 639
    .line 640
    goto :goto_a

    .line 641
    :cond_b
    invoke-static {v9}, La/s7n0;->z(Landroid/widget/ImageView;)V

    .line 642
    .line 643
    .line 644
    :goto_a
    new-instance v9, La/rzp;

    .line 645
    .line 646
    invoke-direct {v9, v6, v10, v8}, La/rzp;-><init>(La/enc;La/jzp;B)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v14, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 650
    .line 651
    .line 652
    move v9, v11

    .line 653
    goto/16 :goto_7

    .line 654
    .line 655
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 656
    .line 657
    .line 658
    const/4 v5, 0x0

    .line 659
    throw v5

    .line 660
    :cond_d
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    check-cast v4, La/pde0;

    .line 665
    .line 666
    iget-object v4, v4, La/pde0;->g:Ljava/util/ArrayList;

    .line 667
    .line 668
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    if-le v2, v4, :cond_e

    .line 673
    .line 674
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    check-cast v4, La/pde0;

    .line 679
    .line 680
    iget-object v4, v4, La/pde0;->g:Ljava/util/ArrayList;

    .line 681
    .line 682
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 683
    .line 684
    .line 685
    move-result v4

    .line 686
    :goto_b
    if-ge v4, v2, :cond_e

    .line 687
    .line 688
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 689
    .line 690
    .line 691
    move-result-object v6

    .line 692
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 696
    .line 697
    .line 698
    add-int/lit8 v4, v4, 0x1

    .line 699
    .line 700
    goto :goto_b

    .line 701
    :cond_e
    iget-object v2, v1, La/z1k;->g:Landroid/widget/TextView;

    .line 702
    .line 703
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    check-cast v3, La/pde0;

    .line 708
    .line 709
    iget-boolean v3, v3, La/pde0;->e:Z

    .line 710
    .line 711
    if-eqz v3, :cond_f

    .line 712
    .line 713
    move v5, v8

    .line 714
    :cond_f
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 715
    .line 716
    .line 717
    iget-object v2, v1, La/z1k;->i:Landroid/widget/TextView;

    .line 718
    .line 719
    sget-object v3, La/rdj;->a:La/rdj;

    .line 720
    .line 721
    iget-object v3, v0, La/xhe0;->a:Landroid/view/View;

    .line 722
    .line 723
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    invoke-static {v3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 728
    .line 729
    .line 730
    move-result v3

    .line 731
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v4

    .line 735
    check-cast v4, La/pde0;

    .line 736
    .line 737
    iget-object v4, v4, La/pde0;->d:Ljava/util/Date;

    .line 738
    .line 739
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 740
    .line 741
    .line 742
    move-result-wide v4

    .line 743
    sget-object v6, La/ykq0;->c:La/ykq0;

    .line 744
    .line 745
    new-instance v7, La/ynq0;

    .line 746
    .line 747
    invoke-direct {v7, v4, v5}, La/ynq0;-><init>(J)V

    .line 748
    .line 749
    .line 750
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    const/16 v4, 0xf8

    .line 755
    .line 756
    const/4 v5, 0x0

    .line 757
    invoke-static {v7, v6, v3, v5, v4}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 762
    .line 763
    .line 764
    iget-object v2, v1, La/z1k;->d:Landroid/widget/ImageView;

    .line 765
    .line 766
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    check-cast v0, La/pde0;

    .line 771
    .line 772
    iget-boolean v0, v0, La/pde0;->h:Z

    .line 773
    .line 774
    if-nez v0, :cond_10

    .line 775
    .line 776
    const/4 v8, 0x4

    .line 777
    :cond_10
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 778
    .line 779
    .line 780
    iget-object v0, v1, La/z1k;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 781
    .line 782
    new-instance v2, La/ccf;

    .line 783
    .line 784
    const/16 v3, 0x17

    .line 785
    .line 786
    invoke-direct {v2, v1, v3}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 790
    .line 791
    .line 792
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 793
    .line 794
    return-object v0

    .line 795
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
