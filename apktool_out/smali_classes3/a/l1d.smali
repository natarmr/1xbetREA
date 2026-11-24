.class public final synthetic La/l1d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/z6e;

.field public final synthetic d:La/z6e;


# direct methods
.method public synthetic constructor <init>(La/cp;La/z6e;La/z6e;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/l1d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/l1d;->b:La/cp;

    iput-object p2, p0, La/l1d;->d:La/z6e;

    iput-object p3, p0, La/l1d;->c:La/z6e;

    return-void
.end method

.method public synthetic constructor <init>(La/cp;La/z6e;La/z6e;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/l1d;->a:B

    iput-object p1, p0, La/l1d;->b:La/cp;

    iput-object p2, p0, La/l1d;->c:La/z6e;

    iput-object p3, p0, La/l1d;->d:La/z6e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l1d;->a:B

    .line 4
    .line 5
    const/16 v2, 0xf8

    .line 6
    .line 7
    const v4, 0x7f040ae3

    .line 8
    .line 9
    .line 10
    sget-object v5, La/f2x;->a:La/f2x;

    .line 11
    .line 12
    iget-object v7, v0, La/l1d;->d:La/z6e;

    .line 13
    .line 14
    iget-object v8, v0, La/l1d;->c:La/z6e;

    .line 15
    .line 16
    iget-object v0, v0, La/l1d;->b:La/cp;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 31
    .line 32
    check-cast v1, La/c2k;

    .line 33
    .line 34
    iget-object v11, v1, La/c2k;->f:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 35
    .line 36
    iget-object v12, v1, La/c2k;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 37
    .line 38
    iget-object v13, v1, La/c2k;->g:Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v14

    .line 44
    check-cast v14, La/xdi0;

    .line 45
    .line 46
    iget-object v14, v14, La/xdi0;->c:Landroid/text/SpannableString;

    .line 47
    .line 48
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 49
    .line 50
    .line 51
    move-result v14

    .line 52
    if-lez v14, :cond_0

    .line 53
    .line 54
    move v14, v10

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/16 v14, 0x8

    .line 57
    .line 58
    :goto_0
    invoke-virtual {v11, v14}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    check-cast v11, La/xdi0;

    .line 66
    .line 67
    iget-object v11, v11, La/xdi0;->g:La/g0x;

    .line 68
    .line 69
    iget-object v14, v1, La/c2k;->f:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 70
    .line 71
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v15

    .line 75
    check-cast v15, La/xdi0;

    .line 76
    .line 77
    iget-object v15, v15, La/xdi0;->c:Landroid/text/SpannableString;

    .line 78
    .line 79
    invoke-virtual {v14, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    iget-object v14, v11, La/g0x;->e:La/yos0;

    .line 83
    .line 84
    sget-object v15, La/u0d;->a:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v14}, La/ibc;->j0(La/yos0;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v15

    .line 90
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    iget-object v11, v11, La/g0x;->d:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v12, v15, v5, v11}, La/u0d;->f(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v5, v1, La/c2k;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 100
    .line 101
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    check-cast v11, La/xdi0;

    .line 106
    .line 107
    iget v11, v11, La/xdi0;->e:I

    .line 108
    .line 109
    invoke-virtual {v5, v11}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 110
    .line 111
    .line 112
    iget-object v5, v1, La/c2k;->b:Landroid/widget/ImageView;

    .line 113
    .line 114
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    check-cast v11, La/xdi0;

    .line 119
    .line 120
    iget-boolean v11, v11, La/xdi0;->h:Z

    .line 121
    .line 122
    if-nez v11, :cond_1

    .line 123
    .line 124
    const/4 v3, 0x4

    .line 125
    goto :goto_1

    .line 126
    :cond_1
    move v3, v10

    .line 127
    :goto_1
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    instance-of v3, v14, La/wos0;

    .line 131
    .line 132
    if-eqz v3, :cond_2

    .line 133
    .line 134
    new-instance v3, La/m1d;

    .line 135
    .line 136
    const/4 v5, 0x2

    .line 137
    invoke-direct {v3, v7, v0, v5}, La/m1d;-><init>(La/z6e;La/cp;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    invoke-virtual {v12, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    .line 146
    .line 147
    :goto_2
    iget-object v1, v1, La/c2k;->h:Landroid/widget/TextView;

    .line 148
    .line 149
    sget-object v3, La/rdj;->a:La/rdj;

    .line 150
    .line 151
    iget-object v3, v0, La/xhe0;->a:Landroid/view/View;

    .line 152
    .line 153
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {v3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, La/xdi0;

    .line 166
    .line 167
    iget-object v5, v5, La/xdi0;->f:Ljava/util/Date;

    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 170
    .line 171
    .line 172
    move-result-wide v11

    .line 173
    sget-object v5, La/ykq0;->c:La/ykq0;

    .line 174
    .line 175
    new-instance v7, La/ynq0;

    .line 176
    .line 177
    invoke-direct {v7, v11, v12}, La/ynq0;-><init>(J)V

    .line 178
    .line 179
    .line 180
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-static {v7, v5, v3, v9, v2}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v14}, La/btm0;->q(La/yos0;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_3

    .line 196
    .line 197
    move v6, v10

    .line 198
    goto :goto_3

    .line 199
    :cond_3
    const/16 v6, 0x8

    .line 200
    .line 201
    :goto_3
    invoke-virtual {v13, v6}, Landroid/view/View;->setVisibility(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_4

    .line 209
    .line 210
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 211
    .line 212
    iget-object v1, v0, La/cp;->w:Landroid/content/Context;

    .line 213
    .line 214
    invoke-static {v1, v4, v10}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    invoke-static {v13, v1}, La/s7n0;->y(Landroid/widget/ImageView;I)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_4
    invoke-static {v13}, La/s7n0;->z(Landroid/widget/ImageView;)V

    .line 223
    .line 224
    .line 225
    :goto_4
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    check-cast v1, La/xdi0;

    .line 230
    .line 231
    iget-object v1, v1, La/xdi0;->d:La/x640;

    .line 232
    .line 233
    instance-of v1, v1, La/w640;

    .line 234
    .line 235
    if-nez v1, :cond_5

    .line 236
    .line 237
    instance-of v1, v14, La/uos0;

    .line 238
    .line 239
    if-eqz v1, :cond_5

    .line 240
    .line 241
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, La/xdi0;

    .line 246
    .line 247
    iget-object v0, v0, La/xdi0;->g:La/g0x;

    .line 248
    .line 249
    invoke-virtual {v8, v0}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_0
    move-object/from16 v1, p1

    .line 256
    .line 257
    check-cast v1, Ljava/util/List;

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 263
    .line 264
    move-object v11, v1

    .line 265
    check-cast v11, La/b2k;

    .line 266
    .line 267
    iget-object v12, v11, La/b2k;->h:Landroid/widget/TextView;

    .line 268
    .line 269
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    check-cast v13, La/rde0;

    .line 274
    .line 275
    iget-object v13, v13, La/rde0;->g:La/dtt0;

    .line 276
    .line 277
    iget-object v13, v13, La/dtt0;->b:Ljava/lang/CharSequence;

    .line 278
    .line 279
    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    .line 281
    .line 282
    sget-object v12, La/u0d;->a:Ljava/util/List;

    .line 283
    .line 284
    iget-object v13, v11, La/b2k;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 285
    .line 286
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    check-cast v11, La/rde0;

    .line 291
    .line 292
    iget-object v11, v11, La/rde0;->g:La/dtt0;

    .line 293
    .line 294
    iget-object v14, v11, La/dtt0;->d:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    check-cast v11, La/rde0;

    .line 301
    .line 302
    iget-object v11, v11, La/rde0;->g:La/dtt0;

    .line 303
    .line 304
    iget v15, v11, La/dtt0;->c:I

    .line 305
    .line 306
    sget-object v11, La/g2x;->a:La/g2x;

    .line 307
    .line 308
    invoke-static {v11}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v17

    .line 312
    const/16 v19, 0x0

    .line 313
    .line 314
    const/16 v20, 0x1ec

    .line 315
    .line 316
    const/16 v16, 0x0

    .line 317
    .line 318
    const/16 v18, 0x0

    .line 319
    .line 320
    invoke-static/range {v13 .. v20}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 321
    .line 322
    .line 323
    check-cast v1, La/b2k;

    .line 324
    .line 325
    iget-object v11, v1, La/b2k;->i:Landroid/widget/TextView;

    .line 326
    .line 327
    iget-object v12, v1, La/b2k;->d:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 328
    .line 329
    iget-object v13, v1, La/b2k;->f:Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 330
    .line 331
    iget-object v14, v1, La/b2k;->g:Landroid/widget/ImageView;

    .line 332
    .line 333
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v15

    .line 337
    check-cast v15, La/rde0;

    .line 338
    .line 339
    iget-boolean v15, v15, La/rde0;->f:Z

    .line 340
    .line 341
    if-eqz v15, :cond_6

    .line 342
    .line 343
    move v15, v10

    .line 344
    goto :goto_5

    .line 345
    :cond_6
    const/16 v15, 0x8

    .line 346
    .line 347
    :goto_5
    invoke-virtual {v11, v15}, Landroid/view/View;->setVisibility(I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    check-cast v11, La/rde0;

    .line 355
    .line 356
    iget-object v11, v11, La/rde0;->b:Landroid/text/SpannableString;

    .line 357
    .line 358
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    .line 359
    .line 360
    .line 361
    move-result v11

    .line 362
    if-lez v11, :cond_7

    .line 363
    .line 364
    move v11, v10

    .line 365
    goto :goto_6

    .line 366
    :cond_7
    const/16 v11, 0x8

    .line 367
    .line 368
    :goto_6
    invoke-virtual {v13, v11}, Landroid/view/View;->setVisibility(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v11

    .line 375
    check-cast v11, La/rde0;

    .line 376
    .line 377
    iget-object v11, v11, La/rde0;->b:Landroid/text/SpannableString;

    .line 378
    .line 379
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    check-cast v11, La/rde0;

    .line 387
    .line 388
    iget-object v11, v11, La/rde0;->e:La/g0x;

    .line 389
    .line 390
    iget-object v13, v11, La/g0x;->e:La/yos0;

    .line 391
    .line 392
    invoke-static {v13}, La/ibc;->j0(La/yos0;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v15

    .line 396
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    iget-object v11, v11, La/g0x;->d:Ljava/lang/String;

    .line 401
    .line 402
    invoke-static {v12, v15, v5, v11}, La/u0d;->f(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    iget-object v5, v1, La/b2k;->j:Landroid/widget/TextView;

    .line 406
    .line 407
    sget-object v11, La/rdj;->a:La/rdj;

    .line 408
    .line 409
    iget-object v11, v0, La/xhe0;->a:Landroid/view/View;

    .line 410
    .line 411
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 412
    .line 413
    .line 414
    move-result-object v11

    .line 415
    invoke-static {v11}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 416
    .line 417
    .line 418
    move-result v11

    .line 419
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v15

    .line 423
    check-cast v15, La/rde0;

    .line 424
    .line 425
    iget-object v15, v15, La/rde0;->d:Ljava/util/Date;

    .line 426
    .line 427
    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    .line 428
    .line 429
    .line 430
    move-result-wide v3

    .line 431
    sget-object v15, La/ykq0;->c:La/ykq0;

    .line 432
    .line 433
    new-instance v6, La/ynq0;

    .line 434
    .line 435
    invoke-direct {v6, v3, v4}, La/ynq0;-><init>(J)V

    .line 436
    .line 437
    .line 438
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-static {v6, v15, v3, v9, v2}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 447
    .line 448
    .line 449
    instance-of v2, v13, La/wos0;

    .line 450
    .line 451
    if-eqz v2, :cond_8

    .line 452
    .line 453
    new-instance v2, La/m1d;

    .line 454
    .line 455
    const/4 v3, 0x1

    .line 456
    invoke-direct {v2, v7, v0, v3}, La/m1d;-><init>(La/z6e;La/cp;B)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 460
    .line 461
    .line 462
    goto :goto_7

    .line 463
    :cond_8
    invoke-virtual {v12, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 464
    .line 465
    .line 466
    :goto_7
    invoke-static {v13}, La/btm0;->q(La/yos0;)Z

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    if-eqz v2, :cond_9

    .line 471
    .line 472
    move v6, v10

    .line 473
    goto :goto_8

    .line 474
    :cond_9
    const/16 v6, 0x8

    .line 475
    .line 476
    :goto_8
    invoke-virtual {v14, v6}, Landroid/view/View;->setVisibility(I)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-nez v2, :cond_a

    .line 484
    .line 485
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 486
    .line 487
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 488
    .line 489
    const v3, 0x7f040ae3

    .line 490
    .line 491
    .line 492
    invoke-static {v2, v3, v10}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    invoke-static {v14, v2}, La/s7n0;->y(Landroid/widget/ImageView;I)V

    .line 497
    .line 498
    .line 499
    goto :goto_9

    .line 500
    :cond_a
    invoke-static {v14}, La/s7n0;->z(Landroid/widget/ImageView;)V

    .line 501
    .line 502
    .line 503
    :goto_9
    iget-object v1, v1, La/b2k;->c:Landroid/widget/ImageView;

    .line 504
    .line 505
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    check-cast v2, La/rde0;

    .line 510
    .line 511
    iget-boolean v2, v2, La/rde0;->h:Z

    .line 512
    .line 513
    if-nez v2, :cond_b

    .line 514
    .line 515
    const/4 v3, 0x4

    .line 516
    goto :goto_a

    .line 517
    :cond_b
    move v3, v10

    .line 518
    :goto_a
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 519
    .line 520
    .line 521
    instance-of v1, v13, La/uos0;

    .line 522
    .line 523
    if-eqz v1, :cond_c

    .line 524
    .line 525
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    check-cast v0, La/rde0;

    .line 530
    .line 531
    iget-object v0, v0, La/rde0;->e:La/g0x;

    .line 532
    .line 533
    invoke-virtual {v8, v0}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 537
    .line 538
    return-object v0

    .line 539
    :pswitch_1
    move-object/from16 v1, p1

    .line 540
    .line 541
    check-cast v1, Ljava/util/List;

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    check-cast v1, La/k1d;

    .line 551
    .line 552
    iget-object v1, v1, La/k1d;->a:La/g0x;

    .line 553
    .line 554
    iget-object v1, v1, La/g0x;->e:La/yos0;

    .line 555
    .line 556
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 557
    .line 558
    check-cast v2, La/v1k;

    .line 559
    .line 560
    iget-object v3, v2, La/v1k;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 561
    .line 562
    iget-object v4, v2, La/v1k;->c:Landroid/widget/ImageView;

    .line 563
    .line 564
    iget-object v2, v2, La/v1k;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 565
    .line 566
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    check-cast v3, La/a3e;

    .line 574
    .line 575
    iget-object v6, v3, La/a3e;->G:Ljava/lang/String;

    .line 576
    .line 577
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v11

    .line 581
    check-cast v11, La/k1d;

    .line 582
    .line 583
    iget-object v11, v11, La/k1d;->c:La/j1d;

    .line 584
    .line 585
    iget-object v11, v11, La/j1d;->a:Ljava/lang/String;

    .line 586
    .line 587
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v6

    .line 591
    if-nez v6, :cond_d

    .line 592
    .line 593
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    check-cast v5, La/k1d;

    .line 598
    .line 599
    iget-object v5, v5, La/k1d;->c:La/j1d;

    .line 600
    .line 601
    iget-object v5, v5, La/j1d;->a:Ljava/lang/String;

    .line 602
    .line 603
    iput-object v5, v3, La/a3e;->G:Ljava/lang/String;

    .line 604
    .line 605
    new-instance v3, La/hf5;

    .line 606
    .line 607
    const/4 v5, 0x3

    .line 608
    invoke-direct {v3, v2, v0, v1, v5}, La/hf5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 609
    .line 610
    .line 611
    invoke-static {v2, v3}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 612
    .line 613
    .line 614
    goto :goto_b

    .line 615
    :cond_d
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 616
    .line 617
    invoke-static {v1}, La/ibc;->j0(La/yos0;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v3

    .line 621
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v5

    .line 625
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v6

    .line 629
    check-cast v6, La/k1d;

    .line 630
    .line 631
    iget-object v6, v6, La/k1d;->a:La/g0x;

    .line 632
    .line 633
    iget-object v6, v6, La/g0x;->d:Ljava/lang/String;

    .line 634
    .line 635
    invoke-static {v2, v3, v5, v6}, La/u0d;->f(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    :goto_b
    instance-of v3, v1, La/wos0;

    .line 639
    .line 640
    if-eqz v3, :cond_e

    .line 641
    .line 642
    new-instance v3, La/m1d;

    .line 643
    .line 644
    invoke-direct {v3, v7, v0, v10}, La/m1d;-><init>(La/z6e;La/cp;B)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 648
    .line 649
    .line 650
    goto :goto_c

    .line 651
    :cond_e
    invoke-virtual {v2, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 652
    .line 653
    .line 654
    :goto_c
    invoke-static {v1}, La/btm0;->q(La/yos0;)Z

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    if-eqz v2, :cond_f

    .line 659
    .line 660
    move v6, v10

    .line 661
    goto :goto_d

    .line 662
    :cond_f
    const/16 v6, 0x8

    .line 663
    .line 664
    :goto_d
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 668
    .line 669
    .line 670
    move-result v2

    .line 671
    if-nez v2, :cond_10

    .line 672
    .line 673
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 674
    .line 675
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 676
    .line 677
    const v3, 0x7f040ae3

    .line 678
    .line 679
    .line 680
    invoke-static {v2, v3, v10}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    invoke-static {v4, v2}, La/s7n0;->y(Landroid/widget/ImageView;I)V

    .line 685
    .line 686
    .line 687
    goto :goto_e

    .line 688
    :cond_10
    invoke-static {v4}, La/s7n0;->z(Landroid/widget/ImageView;)V

    .line 689
    .line 690
    .line 691
    :goto_e
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    check-cast v2, La/k1d;

    .line 696
    .line 697
    iget-object v2, v2, La/k1d;->b:La/x640;

    .line 698
    .line 699
    instance-of v2, v2, La/w640;

    .line 700
    .line 701
    if-nez v2, :cond_11

    .line 702
    .line 703
    instance-of v1, v1, La/uos0;

    .line 704
    .line 705
    if-eqz v1, :cond_11

    .line 706
    .line 707
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    check-cast v0, La/k1d;

    .line 712
    .line 713
    iget-object v0, v0, La/k1d;->a:La/g0x;

    .line 714
    .line 715
    invoke-virtual {v8, v0}, La/z6e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 719
    .line 720
    return-object v0

    .line 721
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
