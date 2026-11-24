.class public final synthetic La/na7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vft;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/vft;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/na7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/na7;->c:La/cp;

    iput-object p2, p0, La/na7;->b:La/vft;

    return-void
.end method

.method public synthetic constructor <init>(La/vft;La/cp;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/na7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/na7;->b:La/vft;

    iput-object p2, p0, La/na7;->c:La/cp;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/na7;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/na7;->c:La/cp;

    .line 6
    .line 7
    iget-object v0, v0, La/na7;->b:La/vft;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La/uv6;

    .line 24
    .line 25
    iget-wide v1, v1, La/uv6;->i:J

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, La/vft;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v1, v2, La/xhe0;->a:Landroid/view/View;

    .line 45
    .line 46
    iget-object v3, v2, La/cp;->u:La/yfu0;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    const/4 v5, 0x1

    .line 68
    if-ne v4, v5, :cond_0

    .line 69
    .line 70
    move-object v4, v3

    .line 71
    check-cast v4, La/lb7;

    .line 72
    .line 73
    iget-object v4, v4, La/lb7;->i:Landroid/widget/ImageView;

    .line 74
    .line 75
    const/high16 v6, 0x43340000    # 180.0f

    .line 76
    .line 77
    invoke-virtual {v4, v6}, Landroid/view/View;->setRotationY(F)V

    .line 78
    .line 79
    .line 80
    :cond_0
    check-cast v3, La/lb7;

    .line 81
    .line 82
    iget-object v4, v3, La/lb7;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 83
    .line 84
    iget-object v6, v3, La/lb7;->x:Landroid/widget/TextView;

    .line 85
    .line 86
    iget-object v7, v3, La/lb7;->r:Landroid/widget/TextView;

    .line 87
    .line 88
    iget-object v8, v3, La/lb7;->N:Landroid/widget/TextView;

    .line 89
    .line 90
    iget-object v9, v3, La/lb7;->J:Landroid/widget/TextView;

    .line 91
    .line 92
    iget-object v10, v3, La/lb7;->D:Landroid/widget/TextView;

    .line 93
    .line 94
    iget-object v11, v3, La/lb7;->d:Landroid/widget/ImageView;

    .line 95
    .line 96
    iget-object v12, v3, La/lb7;->P:Landroid/widget/TextView;

    .line 97
    .line 98
    new-instance v13, La/na7;

    .line 99
    .line 100
    invoke-direct {v13, v0, v2}, La/na7;-><init>(La/vft;La/cp;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v13}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 104
    .line 105
    .line 106
    iget-object v0, v3, La/lb7;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 107
    .line 108
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, La/uv6;

    .line 113
    .line 114
    iget-boolean v4, v4, La/uv6;->A:Z

    .line 115
    .line 116
    if-eqz v4, :cond_1

    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    goto :goto_0

    .line 120
    :cond_1
    const/16 v4, 0x8

    .line 121
    .line 122
    :goto_0
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v3, La/lb7;->G:Landroid/widget/TextView;

    .line 126
    .line 127
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, La/uv6;

    .line 132
    .line 133
    move-object/from16 p1, v6

    .line 134
    .line 135
    iget-wide v5, v4, La/uv6;->t:J

    .line 136
    .line 137
    const-wide/16 v15, 0x5f

    .line 138
    .line 139
    cmp-long v4, v5, v15

    .line 140
    .line 141
    if-nez v4, :cond_2

    .line 142
    .line 143
    const v4, 0x7f13027e

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v4}, La/cp;->v(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    goto :goto_1

    .line 151
    :cond_2
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, La/uv6;

    .line 156
    .line 157
    iget-object v4, v4, La/uv6;->c:Ljava/lang/String;

    .line 158
    .line 159
    :goto_1
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v3, La/lb7;->c:Landroid/widget/LinearLayout;

    .line 163
    .line 164
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    check-cast v4, La/uv6;

    .line 169
    .line 170
    iget-boolean v4, v4, La/uv6;->X:Z

    .line 171
    .line 172
    if-eqz v4, :cond_3

    .line 173
    .line 174
    const/4 v4, 0x0

    .line 175
    goto :goto_2

    .line 176
    :cond_3
    const/16 v4, 0x8

    .line 177
    .line 178
    :goto_2
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, La/uv6;

    .line 186
    .line 187
    iget-object v0, v0, La/uv6;->P:La/q4f;

    .line 188
    .line 189
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    check-cast v4, La/uv6;

    .line 194
    .line 195
    iget-object v4, v4, La/uv6;->Q:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, La/uv6;

    .line 202
    .line 203
    iget v5, v5, La/uv6;->J:I

    .line 204
    .line 205
    if-ltz v5, :cond_5

    .line 206
    .line 207
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    check-cast v5, La/uv6;

    .line 212
    .line 213
    iget v5, v5, La/uv6;->J:I

    .line 214
    .line 215
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    check-cast v6, La/uv6;

    .line 220
    .line 221
    iget v6, v6, La/uv6;->L:I

    .line 222
    .line 223
    if-eq v5, v6, :cond_5

    .line 224
    .line 225
    sget-object v5, La/q4f;->g:La/q4f;

    .line 226
    .line 227
    if-eq v0, v5, :cond_4

    .line 228
    .line 229
    sget-object v5, La/q4f;->h:La/q4f;

    .line 230
    .line 231
    if-ne v0, v5, :cond_5

    .line 232
    .line 233
    :cond_4
    const/4 v0, 0x1

    .line 234
    goto :goto_3

    .line 235
    :cond_5
    const/4 v0, 0x0

    .line 236
    :goto_3
    iget-object v5, v3, La/lb7;->e:Landroid/widget/LinearLayout;

    .line 237
    .line 238
    iget-object v6, v3, La/lb7;->L:Landroid/widget/TextView;

    .line 239
    .line 240
    move-wide/from16 v17, v15

    .line 241
    .line 242
    iget-object v15, v3, La/lb7;->I:Landroid/widget/TextView;

    .line 243
    .line 244
    if-eqz v0, :cond_6

    .line 245
    .line 246
    const/4 v13, 0x0

    .line 247
    goto :goto_4

    .line 248
    :cond_6
    const/16 v13, 0x8

    .line 249
    .line 250
    :goto_4
    invoke-virtual {v5, v13}, Landroid/view/View;->setVisibility(I)V

    .line 251
    .line 252
    .line 253
    iget-object v5, v3, La/lb7;->y:Lorg/xplatform/ui_core/viewcomponents/views/TicketDividerWithShadowLayout;

    .line 254
    .line 255
    if-eqz v0, :cond_7

    .line 256
    .line 257
    const/4 v0, 0x0

    .line 258
    goto :goto_5

    .line 259
    :cond_7
    const/16 v0, 0x8

    .line 260
    .line 261
    :goto_5
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v0, La/uv6;

    .line 269
    .line 270
    move-object v13, v15

    .line 271
    iget-wide v14, v0, La/uv6;->K:D

    .line 272
    .line 273
    const-wide/16 v19, 0x0

    .line 274
    .line 275
    cmpl-double v0, v14, v19

    .line 276
    .line 277
    if-lez v0, :cond_8

    .line 278
    .line 279
    const/4 v0, 0x0

    .line 280
    goto :goto_6

    .line 281
    :cond_8
    const/16 v0, 0x8

    .line 282
    .line 283
    :goto_6
    invoke-virtual {v13, v0}, Landroid/view/View;->setVisibility(I)V

    .line 284
    .line 285
    .line 286
    iget-object v0, v3, La/lb7;->H:Landroid/widget/TextView;

    .line 287
    .line 288
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    check-cast v14, La/uv6;

    .line 293
    .line 294
    iget v14, v14, La/uv6;->J:I

    .line 295
    .line 296
    if-nez v14, :cond_9

    .line 297
    .line 298
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 299
    .line 300
    .line 301
    move-result-object v14

    .line 302
    const v15, 0x7f130b49

    .line 303
    .line 304
    .line 305
    invoke-virtual {v14, v15}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    goto :goto_7

    .line 310
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 311
    .line 312
    .line 313
    move-result-object v14

    .line 314
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    check-cast v15, La/uv6;

    .line 319
    .line 320
    iget v15, v15, La/uv6;->J:I

    .line 321
    .line 322
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v15

    .line 326
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v15

    .line 330
    const v5, 0x7f1302ad

    .line 331
    .line 332
    .line 333
    invoke-virtual {v14, v5, v15}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    :goto_7
    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    .line 339
    .line 340
    sget-object v0, La/pn40;->a:La/pn40;

    .line 341
    .line 342
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, La/uv6;

    .line 347
    .line 348
    iget-wide v14, v0, La/uv6;->K:D

    .line 349
    .line 350
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 351
    .line 352
    invoke-static {v14, v15, v4, v0}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    .line 358
    .line 359
    iget-object v0, v3, La/lb7;->j:Landroid/widget/LinearLayout;

    .line 360
    .line 361
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    check-cast v4, La/uv6;

    .line 366
    .line 367
    iget-boolean v4, v4, La/uv6;->l:Z

    .line 368
    .line 369
    if-eqz v4, :cond_a

    .line 370
    .line 371
    const/4 v4, 0x0

    .line 372
    goto :goto_8

    .line 373
    :cond_a
    const/16 v4, 0x8

    .line 374
    .line 375
    :goto_8
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, La/uv6;

    .line 383
    .line 384
    iget-object v0, v0, La/uv6;->V:Ljava/lang/String;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-lez v0, :cond_b

    .line 391
    .line 392
    const/4 v0, 0x0

    .line 393
    goto :goto_9

    .line 394
    :cond_b
    const/16 v0, 0x8

    .line 395
    .line 396
    :goto_9
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    check-cast v0, La/uv6;

    .line 404
    .line 405
    iget-object v0, v0, La/uv6;->V:Ljava/lang/String;

    .line 406
    .line 407
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 408
    .line 409
    .line 410
    iget-object v0, v3, La/lb7;->O:Landroid/widget/TextView;

    .line 411
    .line 412
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    check-cast v4, La/uv6;

    .line 417
    .line 418
    iget-boolean v4, v4, La/uv6;->y:Z

    .line 419
    .line 420
    if-eqz v4, :cond_c

    .line 421
    .line 422
    const/4 v4, 0x0

    .line 423
    goto :goto_a

    .line 424
    :cond_c
    const/16 v4, 0x8

    .line 425
    .line 426
    :goto_a
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 427
    .line 428
    .line 429
    iget-object v0, v3, La/lb7;->K:Landroid/widget/TextView;

    .line 430
    .line 431
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    check-cast v4, La/uv6;

    .line 436
    .line 437
    iget-boolean v4, v4, La/uv6;->z:Z

    .line 438
    .line 439
    if-eqz v4, :cond_d

    .line 440
    .line 441
    const/4 v4, 0x0

    .line 442
    goto :goto_b

    .line 443
    :cond_d
    const/16 v4, 0x8

    .line 444
    .line 445
    :goto_b
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 446
    .line 447
    .line 448
    invoke-static {v2}, La/oa7;->a(La/cp;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    const-string v4, ""

    .line 453
    .line 454
    const-wide/16 v13, 0x0

    .line 455
    .line 456
    if-eqz v0, :cond_e

    .line 457
    .line 458
    const v0, 0x7f0805f8

    .line 459
    .line 460
    .line 461
    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 462
    .line 463
    .line 464
    move-wide/from16 v21, v13

    .line 465
    .line 466
    goto :goto_d

    .line 467
    :cond_e
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 468
    .line 469
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    check-cast v0, La/uv6;

    .line 474
    .line 475
    iget-wide v5, v0, La/uv6;->t:J

    .line 476
    .line 477
    cmp-long v0, v5, v13

    .line 478
    .line 479
    if-eqz v0, :cond_f

    .line 480
    .line 481
    const-string v0, "svg"

    .line 482
    .line 483
    const-string v15, "sports_v2"

    .line 484
    .line 485
    move-wide/from16 v21, v13

    .line 486
    .line 487
    const-string v13, "static"

    .line 488
    .line 489
    invoke-static {v13, v0, v15}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    const-string v13, ".svg"

    .line 494
    .line 495
    invoke-static {v5, v6, v13, v0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 496
    .line 497
    .line 498
    iget-object v0, v0, La/bzu;->b:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v0, Ljava/lang/StringBuilder;

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    goto :goto_c

    .line 507
    :cond_f
    move-wide/from16 v21, v13

    .line 508
    .line 509
    move-object v0, v4

    .line 510
    :goto_c
    invoke-static {v11, v0}, La/u0d;->k(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    :goto_d
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, La/uv6;

    .line 518
    .line 519
    iget-object v0, v0, La/uv6;->B:Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    if-lez v0, :cond_10

    .line 526
    .line 527
    const/4 v0, 0x1

    .line 528
    goto :goto_e

    .line 529
    :cond_10
    const/4 v0, 0x0

    .line 530
    :goto_e
    iget-object v5, v3, La/lb7;->g:Landroidx/constraintlayout/widget/Group;

    .line 531
    .line 532
    if-eqz v0, :cond_11

    .line 533
    .line 534
    const/4 v6, 0x0

    .line 535
    goto :goto_f

    .line 536
    :cond_11
    const/16 v6, 0x8

    .line 537
    .line 538
    :goto_f
    invoke-virtual {v5, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 539
    .line 540
    .line 541
    if-eqz v0, :cond_12

    .line 542
    .line 543
    iget-object v0, v3, La/lb7;->z:Landroid/widget/TextView;

    .line 544
    .line 545
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    check-cast v5, La/uv6;

    .line 550
    .line 551
    iget-object v5, v5, La/uv6;->B:Ljava/lang/String;

    .line 552
    .line 553
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 554
    .line 555
    .line 556
    :cond_12
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    check-cast v0, La/uv6;

    .line 561
    .line 562
    iget-wide v5, v0, La/uv6;->q:J

    .line 563
    .line 564
    cmp-long v0, v5, v21

    .line 565
    .line 566
    if-nez v0, :cond_13

    .line 567
    .line 568
    const/4 v0, 0x0

    .line 569
    goto :goto_10

    .line 570
    :cond_13
    const/16 v0, 0x8

    .line 571
    .line 572
    :goto_10
    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    check-cast v0, La/uv6;

    .line 580
    .line 581
    iget-object v0, v0, La/uv6;->j:Ljava/lang/String;

    .line 582
    .line 583
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    check-cast v0, La/uv6;

    .line 591
    .line 592
    iget-wide v5, v0, La/uv6;->f:J

    .line 593
    .line 594
    cmp-long v0, v5, v21

    .line 595
    .line 596
    if-eqz v0, :cond_14

    .line 597
    .line 598
    const/4 v0, 0x1

    .line 599
    goto :goto_11

    .line 600
    :cond_14
    const/4 v0, 0x0

    .line 601
    :goto_11
    if-eqz v0, :cond_15

    .line 602
    .line 603
    const/4 v5, 0x0

    .line 604
    goto :goto_12

    .line 605
    :cond_15
    const/16 v5, 0x8

    .line 606
    .line 607
    :goto_12
    invoke-virtual {v9, v5}, Landroid/view/View;->setVisibility(I)V

    .line 608
    .line 609
    .line 610
    if-eqz v0, :cond_16

    .line 611
    .line 612
    sget-object v0, La/rdj;->a:La/rdj;

    .line 613
    .line 614
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    check-cast v0, La/uv6;

    .line 619
    .line 620
    iget-boolean v0, v0, La/uv6;->Z:Z

    .line 621
    .line 622
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v5

    .line 626
    check-cast v5, La/uv6;

    .line 627
    .line 628
    iget-wide v5, v5, La/uv6;->f:J

    .line 629
    .line 630
    sget-object v10, La/efj;->c:La/efj;

    .line 631
    .line 632
    new-instance v11, La/znq0;

    .line 633
    .line 634
    invoke-direct {v11, v5, v6}, La/znq0;-><init>(J)V

    .line 635
    .line 636
    .line 637
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    const/16 v5, 0x38

    .line 642
    .line 643
    const/4 v6, 0x0

    .line 644
    invoke-static {v11, v10, v0, v6, v5}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 649
    .line 650
    .line 651
    :cond_16
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    check-cast v0, La/uv6;

    .line 656
    .line 657
    iget-object v0, v0, La/uv6;->O:La/s77;

    .line 658
    .line 659
    sget-object v6, La/s77;->d:La/s77;

    .line 660
    .line 661
    const-string v9, ". "

    .line 662
    .line 663
    if-eq v0, v6, :cond_1a

    .line 664
    .line 665
    sget-object v10, La/s77;->i:La/s77;

    .line 666
    .line 667
    if-ne v0, v10, :cond_17

    .line 668
    .line 669
    goto :goto_14

    .line 670
    :cond_17
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    check-cast v0, La/uv6;

    .line 675
    .line 676
    iget-boolean v0, v0, La/uv6;->R:Z

    .line 677
    .line 678
    if-eqz v0, :cond_19

    .line 679
    .line 680
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    check-cast v0, La/uv6;

    .line 685
    .line 686
    iget-boolean v0, v0, La/uv6;->Y:Z

    .line 687
    .line 688
    if-nez v0, :cond_18

    .line 689
    .line 690
    const/4 v0, 0x0

    .line 691
    goto :goto_13

    .line 692
    :cond_18
    const/16 v0, 0x8

    .line 693
    .line 694
    :goto_13
    invoke-virtual {v12, v0}, Landroid/view/View;->setVisibility(I)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    check-cast v0, La/uv6;

    .line 702
    .line 703
    iget-object v0, v0, La/uv6;->s:Ljava/lang/String;

    .line 704
    .line 705
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_15

    .line 709
    .line 710
    :cond_19
    const/16 v0, 0x8

    .line 711
    .line 712
    invoke-virtual {v12, v0}, Landroid/view/View;->setVisibility(I)V

    .line 713
    .line 714
    .line 715
    goto/16 :goto_15

    .line 716
    .line 717
    :cond_1a
    :goto_14
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    check-cast v0, La/uv6;

    .line 722
    .line 723
    iget-object v0, v0, La/uv6;->D:Ljava/lang/String;

    .line 724
    .line 725
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    const v10, 0x7f1315e6

    .line 730
    .line 731
    .line 732
    if-lez v0, :cond_1b

    .line 733
    .line 734
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    check-cast v0, La/uv6;

    .line 739
    .line 740
    iget-wide v13, v0, La/uv6;->U:D

    .line 741
    .line 742
    cmpl-double v0, v13, v19

    .line 743
    .line 744
    if-lez v0, :cond_1b

    .line 745
    .line 746
    const/4 v5, 0x0

    .line 747
    invoke-virtual {v12, v5}, Landroid/view/View;->setVisibility(I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    check-cast v0, La/uv6;

    .line 755
    .line 756
    iget-object v0, v0, La/uv6;->D:Ljava/lang/String;

    .line 757
    .line 758
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v11

    .line 762
    check-cast v11, La/uv6;

    .line 763
    .line 764
    iget-wide v13, v11, La/uv6;->U:D

    .line 765
    .line 766
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 767
    .line 768
    .line 769
    move-result-object v11

    .line 770
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v11

    .line 774
    invoke-virtual {v2, v10, v11}, La/cp;->w(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v10

    .line 778
    new-instance v11, Ljava/lang/StringBuilder;

    .line 779
    .line 780
    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 794
    .line 795
    .line 796
    goto :goto_15

    .line 797
    :cond_1b
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    check-cast v0, La/uv6;

    .line 802
    .line 803
    iget-object v0, v0, La/uv6;->D:Ljava/lang/String;

    .line 804
    .line 805
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    if-lez v0, :cond_1c

    .line 810
    .line 811
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    check-cast v0, La/uv6;

    .line 816
    .line 817
    iget-wide v13, v0, La/uv6;->U:D

    .line 818
    .line 819
    cmpg-double v0, v13, v19

    .line 820
    .line 821
    if-gtz v0, :cond_1c

    .line 822
    .line 823
    const/4 v5, 0x0

    .line 824
    invoke-virtual {v12, v5}, Landroid/view/View;->setVisibility(I)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    check-cast v0, La/uv6;

    .line 832
    .line 833
    iget-object v0, v0, La/uv6;->D:Ljava/lang/String;

    .line 834
    .line 835
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 836
    .line 837
    .line 838
    goto :goto_15

    .line 839
    :cond_1c
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    check-cast v0, La/uv6;

    .line 844
    .line 845
    iget-object v0, v0, La/uv6;->D:Ljava/lang/String;

    .line 846
    .line 847
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 848
    .line 849
    .line 850
    move-result v0

    .line 851
    if-nez v0, :cond_1d

    .line 852
    .line 853
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    check-cast v0, La/uv6;

    .line 858
    .line 859
    iget-wide v13, v0, La/uv6;->U:D

    .line 860
    .line 861
    cmpl-double v0, v13, v19

    .line 862
    .line 863
    if-lez v0, :cond_1d

    .line 864
    .line 865
    const/4 v5, 0x0

    .line 866
    invoke-virtual {v12, v5}, Landroid/view/View;->setVisibility(I)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    check-cast v0, La/uv6;

    .line 874
    .line 875
    iget-wide v13, v0, La/uv6;->U:D

    .line 876
    .line 877
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    invoke-virtual {v2, v10, v0}, La/cp;->w(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 890
    .line 891
    .line 892
    goto :goto_15

    .line 893
    :cond_1d
    const/16 v0, 0x8

    .line 894
    .line 895
    invoke-virtual {v12, v0}, Landroid/view/View;->setVisibility(I)V

    .line 896
    .line 897
    .line 898
    :goto_15
    iget-object v0, v3, La/lb7;->M:Landroid/widget/TextView;

    .line 899
    .line 900
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v10

    .line 904
    check-cast v10, La/uv6;

    .line 905
    .line 906
    iget-boolean v10, v10, La/uv6;->l:Z

    .line 907
    .line 908
    if-eqz v10, :cond_1e

    .line 909
    .line 910
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v10

    .line 914
    check-cast v10, La/uv6;

    .line 915
    .line 916
    iget-wide v10, v10, La/uv6;->x:J

    .line 917
    .line 918
    cmp-long v10, v10, v21

    .line 919
    .line 920
    if-lez v10, :cond_1e

    .line 921
    .line 922
    const/4 v10, 0x0

    .line 923
    goto :goto_16

    .line 924
    :cond_1e
    const/16 v10, 0x8

    .line 925
    .line 926
    :goto_16
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    check-cast v0, La/uv6;

    .line 934
    .line 935
    iget-boolean v0, v0, La/uv6;->l:Z

    .line 936
    .line 937
    if-eqz v0, :cond_1f

    .line 938
    .line 939
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    check-cast v0, La/uv6;

    .line 944
    .line 945
    iget-wide v10, v0, La/uv6;->x:J

    .line 946
    .line 947
    cmp-long v0, v10, v21

    .line 948
    .line 949
    if-lez v0, :cond_1f

    .line 950
    .line 951
    const/4 v0, 0x0

    .line 952
    goto :goto_17

    .line 953
    :cond_1f
    const/16 v0, 0x8

    .line 954
    .line 955
    :goto_17
    invoke-virtual {v8, v0}, Landroid/view/View;->setVisibility(I)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    check-cast v0, La/uv6;

    .line 963
    .line 964
    iget-wide v10, v0, La/uv6;->x:J

    .line 965
    .line 966
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 967
    .line 968
    const-wide/16 v12, 0x3c

    .line 969
    .line 970
    div-long v14, v10, v12

    .line 971
    .line 972
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 973
    .line 974
    .line 975
    move-result-object v14

    .line 976
    rem-long/2addr v10, v12

    .line 977
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 978
    .line 979
    .line 980
    move-result-object v10

    .line 981
    filled-new-array {v14, v10}, [Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v10

    .line 985
    const/4 v11, 0x2

    .line 986
    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v10

    .line 990
    const-string v12, "%02d:%02d"

    .line 991
    .line 992
    invoke-static {v0, v12, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 997
    .line 998
    .line 999
    move-result-object v10

    .line 1000
    const v12, 0x7f130b32

    .line 1001
    .line 1002
    .line 1003
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    invoke-virtual {v10, v12, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    check-cast v0, La/uv6;

    .line 1019
    .line 1020
    iget-object v0, v0, La/uv6;->O:La/s77;

    .line 1021
    .line 1022
    iget-object v8, v3, La/lb7;->l:Landroidx/constraintlayout/widget/Group;

    .line 1023
    .line 1024
    sget-object v10, La/s77;->e:La/s77;

    .line 1025
    .line 1026
    if-ne v0, v10, :cond_20

    .line 1027
    .line 1028
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    check-cast v0, La/uv6;

    .line 1033
    .line 1034
    iget-object v0, v0, La/uv6;->s:Ljava/lang/String;

    .line 1035
    .line 1036
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1037
    .line 1038
    .line 1039
    move-result v0

    .line 1040
    if-lez v0, :cond_20

    .line 1041
    .line 1042
    const/4 v0, 0x0

    .line 1043
    goto :goto_18

    .line 1044
    :cond_20
    const/16 v0, 0x8

    .line 1045
    .line 1046
    :goto_18
    invoke-virtual {v8, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1047
    .line 1048
    .line 1049
    iget-object v0, v3, La/lb7;->E:Landroid/widget/TextView;

    .line 1050
    .line 1051
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v8

    .line 1055
    check-cast v8, La/uv6;

    .line 1056
    .line 1057
    invoke-static {v8}, La/oa7;->b(La/uv6;)Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v8

    .line 1061
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    check-cast v0, La/uv6;

    .line 1069
    .line 1070
    iget-object v0, v0, La/uv6;->O:La/s77;

    .line 1071
    .line 1072
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v8

    .line 1076
    check-cast v8, La/uv6;

    .line 1077
    .line 1078
    iget-object v8, v8, La/uv6;->P:La/q4f;

    .line 1079
    .line 1080
    iget-object v12, v3, La/lb7;->A:Landroid/widget/TextView;

    .line 1081
    .line 1082
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1083
    .line 1084
    .line 1085
    move-result v13

    .line 1086
    const/4 v14, 0x6

    .line 1087
    const-string v15, "-"

    .line 1088
    .line 1089
    const/4 v5, 0x1

    .line 1090
    if-eq v13, v5, :cond_24

    .line 1091
    .line 1092
    if-eq v13, v14, :cond_24

    .line 1093
    .line 1094
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v5

    .line 1098
    check-cast v5, La/uv6;

    .line 1099
    .line 1100
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v13

    .line 1104
    const v11, 0x7f131325

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v13, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v11

    .line 1111
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    iget-object v13, v5, La/uv6;->e:Ljava/lang/String;

    .line 1115
    .line 1116
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 1117
    .line 1118
    .line 1119
    move-result v22

    .line 1120
    if-lez v22, :cond_21

    .line 1121
    .line 1122
    move-object/from16 v20, v1

    .line 1123
    .line 1124
    move-object v11, v13

    .line 1125
    move-object/from16 v22, v15

    .line 1126
    .line 1127
    goto/16 :goto_1a

    .line 1128
    .line 1129
    :cond_21
    move-object/from16 v22, v15

    .line 1130
    .line 1131
    iget-wide v14, v5, La/uv6;->d:D

    .line 1132
    .line 1133
    cmpl-double v5, v14, v19

    .line 1134
    .line 1135
    if-lez v5, :cond_22

    .line 1136
    .line 1137
    sget-object v5, La/p3u0;->e:La/p3u0;

    .line 1138
    .line 1139
    invoke-static {v14, v15, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v11

    .line 1143
    move-object/from16 v20, v1

    .line 1144
    .line 1145
    goto :goto_1a

    .line 1146
    :cond_22
    sget-object v5, La/q4f;->e:La/q4f;

    .line 1147
    .line 1148
    sget-object v14, La/q4f;->g:La/q4f;

    .line 1149
    .line 1150
    sget-object v15, La/q4f;->k:La/q4f;

    .line 1151
    .line 1152
    sget-object v13, La/q4f;->j:La/q4f;

    .line 1153
    .line 1154
    move-object/from16 v20, v1

    .line 1155
    .line 1156
    sget-object v1, La/q4f;->x:La/q4f;

    .line 1157
    .line 1158
    filled-new-array {v5, v14, v15, v13, v1}, [La/q4f;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    invoke-interface {v1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v1

    .line 1170
    if-nez v1, :cond_23

    .line 1171
    .line 1172
    goto :goto_1a

    .line 1173
    :cond_23
    move-object/from16 v11, v22

    .line 1174
    .line 1175
    goto :goto_1a

    .line 1176
    :cond_24
    move-object/from16 v20, v1

    .line 1177
    .line 1178
    move-object/from16 v22, v15

    .line 1179
    .line 1180
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v1

    .line 1184
    check-cast v1, La/uv6;

    .line 1185
    .line 1186
    iget-object v1, v1, La/uv6;->u:Ljava/lang/String;

    .line 1187
    .line 1188
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v5

    .line 1192
    check-cast v5, La/uv6;

    .line 1193
    .line 1194
    iget-boolean v5, v5, La/uv6;->Y:Z

    .line 1195
    .line 1196
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v8

    .line 1200
    check-cast v8, La/uv6;

    .line 1201
    .line 1202
    iget-object v8, v8, La/uv6;->u:Ljava/lang/String;

    .line 1203
    .line 1204
    const-string v11, ", "

    .line 1205
    .line 1206
    if-nez v5, :cond_25

    .line 1207
    .line 1208
    const/4 v5, 0x0

    .line 1209
    goto :goto_19

    .line 1210
    :cond_25
    filled-new-array {v11}, [Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v1

    .line 1214
    const/4 v5, 0x0

    .line 1215
    const/4 v13, 0x6

    .line 1216
    invoke-static {v8, v1, v5, v13}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v23

    .line 1220
    new-instance v1, La/h26;

    .line 1221
    .line 1222
    const/16 v8, 0x13

    .line 1223
    .line 1224
    invoke-direct {v1, v8}, La/h26;-><init>(B)V

    .line 1225
    .line 1226
    .line 1227
    const/16 v28, 0x1f

    .line 1228
    .line 1229
    const/16 v24, 0x0

    .line 1230
    .line 1231
    const/16 v25, 0x0

    .line 1232
    .line 1233
    const/16 v26, 0x0

    .line 1234
    .line 1235
    move-object/from16 v27, v1

    .line 1236
    .line 1237
    invoke-static/range {v23 .. v28}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v1

    .line 1241
    :goto_19
    const-string v8, ","

    .line 1242
    .line 1243
    invoke-static {v1, v8, v11, v5}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v11

    .line 1247
    :goto_1a
    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1248
    .line 1249
    .line 1250
    iget-object v1, v3, La/lb7;->B:Landroid/widget/TextView;

    .line 1251
    .line 1252
    if-eq v0, v6, :cond_27

    .line 1253
    .line 1254
    sget-object v8, La/s77;->i:La/s77;

    .line 1255
    .line 1256
    if-ne v0, v8, :cond_26

    .line 1257
    .line 1258
    goto :goto_1b

    .line 1259
    :cond_26
    const/16 v8, 0x8

    .line 1260
    .line 1261
    goto :goto_1c

    .line 1262
    :cond_27
    :goto_1b
    const/4 v8, 0x0

    .line 1263
    :goto_1c
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1264
    .line 1265
    .line 1266
    iget-object v1, v3, La/lb7;->C:Landroid/widget/TextView;

    .line 1267
    .line 1268
    if-eq v0, v6, :cond_30

    .line 1269
    .line 1270
    sget-object v6, La/s77;->i:La/s77;

    .line 1271
    .line 1272
    if-ne v0, v6, :cond_28

    .line 1273
    .line 1274
    goto/16 :goto_1d

    .line 1275
    .line 1276
    :cond_28
    invoke-static {v2}, La/oa7;->a(La/cp;)Z

    .line 1277
    .line 1278
    .line 1279
    move-result v0

    .line 1280
    if-eqz v0, :cond_29

    .line 1281
    .line 1282
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v0

    .line 1286
    check-cast v0, La/uv6;

    .line 1287
    .line 1288
    iget-object v4, v0, La/uv6;->j:Ljava/lang/String;

    .line 1289
    .line 1290
    goto/16 :goto_1d

    .line 1291
    .line 1292
    :cond_29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1293
    .line 1294
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v4

    .line 1301
    check-cast v4, La/uv6;

    .line 1302
    .line 1303
    iget-object v4, v4, La/uv6;->u:Ljava/lang/String;

    .line 1304
    .line 1305
    const-string v6, " \n"

    .line 1306
    .line 1307
    const/4 v5, 0x0

    .line 1308
    invoke-static {v4, v6, v9, v5}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v4

    .line 1312
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v4

    .line 1319
    check-cast v4, La/uv6;

    .line 1320
    .line 1321
    iget-object v4, v4, La/uv6;->D:Ljava/lang/String;

    .line 1322
    .line 1323
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1324
    .line 1325
    .line 1326
    move-result v4

    .line 1327
    if-lez v4, :cond_2b

    .line 1328
    .line 1329
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 1330
    .line 1331
    .line 1332
    move-result v4

    .line 1333
    if-lez v4, :cond_2a

    .line 1334
    .line 1335
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1336
    .line 1337
    .line 1338
    :cond_2a
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v4

    .line 1342
    check-cast v4, La/uv6;

    .line 1343
    .line 1344
    iget-object v4, v4, La/uv6;->D:Ljava/lang/String;

    .line 1345
    .line 1346
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1347
    .line 1348
    .line 1349
    :cond_2b
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v4

    .line 1353
    check-cast v4, La/uv6;

    .line 1354
    .line 1355
    iget-object v4, v4, La/uv6;->C:Ljava/lang/String;

    .line 1356
    .line 1357
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1358
    .line 1359
    .line 1360
    move-result v4

    .line 1361
    if-lez v4, :cond_2d

    .line 1362
    .line 1363
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 1364
    .line 1365
    .line 1366
    move-result v4

    .line 1367
    if-lez v4, :cond_2c

    .line 1368
    .line 1369
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1370
    .line 1371
    .line 1372
    :cond_2c
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v4

    .line 1376
    check-cast v4, La/uv6;

    .line 1377
    .line 1378
    iget-object v4, v4, La/uv6;->C:Ljava/lang/String;

    .line 1379
    .line 1380
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1381
    .line 1382
    .line 1383
    :cond_2d
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v4

    .line 1387
    check-cast v4, La/uv6;

    .line 1388
    .line 1389
    iget-object v4, v4, La/uv6;->w:Ljava/lang/String;

    .line 1390
    .line 1391
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1392
    .line 1393
    .line 1394
    move-result v4

    .line 1395
    if-lez v4, :cond_2f

    .line 1396
    .line 1397
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 1398
    .line 1399
    .line 1400
    move-result v4

    .line 1401
    if-lez v4, :cond_2e

    .line 1402
    .line 1403
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1404
    .line 1405
    .line 1406
    :cond_2e
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v4

    .line 1410
    check-cast v4, La/uv6;

    .line 1411
    .line 1412
    iget-object v4, v4, La/uv6;->w:Ljava/lang/String;

    .line 1413
    .line 1414
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1415
    .line 1416
    .line 1417
    :cond_2f
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v4

    .line 1421
    :cond_30
    :goto_1d
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1422
    .line 1423
    .line 1424
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v0

    .line 1428
    check-cast v0, La/uv6;

    .line 1429
    .line 1430
    iget-object v0, v0, La/uv6;->O:La/s77;

    .line 1431
    .line 1432
    iget-object v1, v3, La/lb7;->s:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1433
    .line 1434
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v4

    .line 1438
    check-cast v4, La/uv6;

    .line 1439
    .line 1440
    iget-object v4, v4, La/uv6;->p:Ljava/lang/String;

    .line 1441
    .line 1442
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1443
    .line 1444
    .line 1445
    move-result v4

    .line 1446
    if-lez v4, :cond_31

    .line 1447
    .line 1448
    invoke-static {v2}, La/oa7;->a(La/cp;)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v4

    .line 1452
    if-nez v4, :cond_31

    .line 1453
    .line 1454
    const/4 v4, 0x0

    .line 1455
    goto :goto_1e

    .line 1456
    :cond_31
    const/16 v4, 0x8

    .line 1457
    .line 1458
    :goto_1e
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v1

    .line 1465
    check-cast v1, La/uv6;

    .line 1466
    .line 1467
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v4

    .line 1471
    check-cast v4, La/uv6;

    .line 1472
    .line 1473
    iget-boolean v4, v4, La/uv6;->Y:Z

    .line 1474
    .line 1475
    if-eqz v4, :cond_32

    .line 1476
    .line 1477
    iget-object v1, v1, La/uv6;->p:Ljava/lang/String;

    .line 1478
    .line 1479
    goto :goto_1f

    .line 1480
    :cond_32
    iget-object v1, v1, La/uv6;->m:Ljava/lang/String;

    .line 1481
    .line 1482
    :goto_1f
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v4

    .line 1486
    check-cast v4, La/uv6;

    .line 1487
    .line 1488
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v6

    .line 1492
    check-cast v6, La/uv6;

    .line 1493
    .line 1494
    iget-boolean v6, v6, La/uv6;->Y:Z

    .line 1495
    .line 1496
    if-nez v6, :cond_33

    .line 1497
    .line 1498
    iget-object v4, v4, La/uv6;->p:Ljava/lang/String;

    .line 1499
    .line 1500
    goto :goto_20

    .line 1501
    :cond_33
    iget-object v4, v4, La/uv6;->m:Ljava/lang/String;

    .line 1502
    .line 1503
    :goto_20
    sget v6, La/cy7;->a:I

    .line 1504
    .line 1505
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v6

    .line 1509
    invoke-virtual {v6, v1}, Landroid/text/BidiFormatter;->isRtl(Ljava/lang/String;)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v6

    .line 1513
    const v8, 0x800005

    .line 1514
    .line 1515
    .line 1516
    const v9, 0x800003

    .line 1517
    .line 1518
    .line 1519
    if-eqz v6, :cond_34

    .line 1520
    .line 1521
    invoke-static {v7, v9, v8}, La/cy7;->b(Landroid/widget/TextView;II)V

    .line 1522
    .line 1523
    .line 1524
    :cond_34
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v6

    .line 1528
    invoke-virtual {v6, v4}, Landroid/text/BidiFormatter;->isRtl(Ljava/lang/String;)Z

    .line 1529
    .line 1530
    .line 1531
    move-result v6

    .line 1532
    if-eqz v6, :cond_35

    .line 1533
    .line 1534
    move-object/from16 v6, p1

    .line 1535
    .line 1536
    invoke-static {v6, v8, v9}, La/cy7;->b(Landroid/widget/TextView;II)V

    .line 1537
    .line 1538
    .line 1539
    goto :goto_21

    .line 1540
    :cond_35
    move-object/from16 v6, p1

    .line 1541
    .line 1542
    :goto_21
    iget-object v8, v3, La/lb7;->u:Landroidx/constraintlayout/widget/Group;

    .line 1543
    .line 1544
    iget-object v9, v3, La/lb7;->o:Landroidx/constraintlayout/widget/Group;

    .line 1545
    .line 1546
    iget-object v11, v3, La/lb7;->t:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1547
    .line 1548
    iget-object v12, v3, La/lb7;->n:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1549
    .line 1550
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1551
    .line 1552
    .line 1553
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v1

    .line 1560
    check-cast v1, La/uv6;

    .line 1561
    .line 1562
    iget-boolean v1, v1, La/uv6;->Y:Z

    .line 1563
    .line 1564
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v4

    .line 1568
    check-cast v4, La/uv6;

    .line 1569
    .line 1570
    iget-wide v6, v4, La/uv6;->t:J

    .line 1571
    .line 1572
    cmp-long v4, v6, v17

    .line 1573
    .line 1574
    if-nez v4, :cond_38

    .line 1575
    .line 1576
    const/4 v5, 0x0

    .line 1577
    invoke-virtual {v12, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1578
    .line 1579
    .line 1580
    const/16 v4, 0x8

    .line 1581
    .line 1582
    invoke-virtual {v9, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v11, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v8, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1589
    .line 1590
    .line 1591
    const v6, 0x7f080671

    .line 1592
    .line 1593
    .line 1594
    const v7, 0x7f080672

    .line 1595
    .line 1596
    .line 1597
    if-eqz v1, :cond_36

    .line 1598
    .line 1599
    move v8, v7

    .line 1600
    goto :goto_22

    .line 1601
    :cond_36
    move v8, v6

    .line 1602
    :goto_22
    invoke-virtual {v12, v8}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1603
    .line 1604
    .line 1605
    if-nez v1, :cond_37

    .line 1606
    .line 1607
    move v6, v7

    .line 1608
    :cond_37
    invoke-virtual {v11, v6}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1609
    .line 1610
    .line 1611
    goto :goto_25

    .line 1612
    :cond_38
    const/16 v4, 0x8

    .line 1613
    .line 1614
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v6

    .line 1618
    check-cast v6, La/uv6;

    .line 1619
    .line 1620
    if-eqz v1, :cond_39

    .line 1621
    .line 1622
    iget-object v6, v6, La/uv6;->r:Ljava/util/List;

    .line 1623
    .line 1624
    goto :goto_23

    .line 1625
    :cond_39
    iget-object v6, v6, La/uv6;->o:Ljava/util/List;

    .line 1626
    .line 1627
    :goto_23
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v7

    .line 1631
    check-cast v7, La/uv6;

    .line 1632
    .line 1633
    if-nez v1, :cond_3a

    .line 1634
    .line 1635
    iget-object v1, v7, La/uv6;->r:Ljava/util/List;

    .line 1636
    .line 1637
    goto :goto_24

    .line 1638
    :cond_3a
    iget-object v1, v7, La/uv6;->o:Ljava/util/List;

    .line 1639
    .line 1640
    :goto_24
    iget-object v7, v3, La/lb7;->p:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1641
    .line 1642
    iget-object v14, v3, La/lb7;->q:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1643
    .line 1644
    invoke-static {v6, v12, v9, v7, v14}, La/oa7;->c(Ljava/util/List;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroidx/constraintlayout/widget/Group;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;)V

    .line 1645
    .line 1646
    .line 1647
    iget-object v6, v3, La/lb7;->v:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1648
    .line 1649
    iget-object v7, v3, La/lb7;->w:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1650
    .line 1651
    invoke-static {v1, v11, v8, v6, v7}, La/oa7;->c(Ljava/util/List;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroidx/constraintlayout/widget/Group;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;)V

    .line 1652
    .line 1653
    .line 1654
    :goto_25
    iget-object v1, v3, La/lb7;->R:Landroid/widget/TextView;

    .line 1655
    .line 1656
    const v6, 0x7f1317d3

    .line 1657
    .line 1658
    .line 1659
    if-ne v0, v10, :cond_3b

    .line 1660
    .line 1661
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v0

    .line 1669
    goto/16 :goto_27

    .line 1670
    .line 1671
    :cond_3b
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v0

    .line 1675
    check-cast v0, La/uv6;

    .line 1676
    .line 1677
    invoke-static {v0}, La/oa7;->b(La/uv6;)Ljava/lang/String;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1682
    .line 1683
    .line 1684
    move-result v0

    .line 1685
    if-lez v0, :cond_3d

    .line 1686
    .line 1687
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v0

    .line 1691
    check-cast v0, La/uv6;

    .line 1692
    .line 1693
    iget-boolean v0, v0, La/uv6;->Y:Z

    .line 1694
    .line 1695
    if-eqz v0, :cond_3d

    .line 1696
    .line 1697
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v0

    .line 1701
    check-cast v0, La/uv6;

    .line 1702
    .line 1703
    invoke-static {v0}, La/oa7;->b(La/uv6;)Ljava/lang/String;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    const-string v6, " - "

    .line 1708
    .line 1709
    const-string v7, " : "

    .line 1710
    .line 1711
    filled-new-array {v7, v6}, [Ljava/lang/String;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v6

    .line 1715
    const/4 v5, 0x0

    .line 1716
    const/4 v13, 0x6

    .line 1717
    invoke-static {v0, v6, v5, v13}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v6

    .line 1721
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1722
    .line 1723
    .line 1724
    move-result v8

    .line 1725
    const/4 v9, 0x2

    .line 1726
    if-ne v8, v9, :cond_3f

    .line 1727
    .line 1728
    const/4 v8, 0x1

    .line 1729
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v9

    .line 1733
    invoke-static {v0, v7, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v0

    .line 1737
    if-eqz v0, :cond_3c

    .line 1738
    .line 1739
    const-string v15, ":"

    .line 1740
    .line 1741
    goto :goto_26

    .line 1742
    :cond_3c
    move-object/from16 v15, v22

    .line 1743
    .line 1744
    :goto_26
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v0

    .line 1748
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1749
    .line 1750
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1754
    .line 1755
    .line 1756
    const-string v7, " "

    .line 1757
    .line 1758
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1759
    .line 1760
    .line 1761
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1765
    .line 1766
    .line 1767
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v0

    .line 1774
    goto :goto_27

    .line 1775
    :cond_3d
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v0

    .line 1779
    check-cast v0, La/uv6;

    .line 1780
    .line 1781
    invoke-static {v0}, La/oa7;->b(La/uv6;)Ljava/lang/String;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v0

    .line 1785
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1786
    .line 1787
    .line 1788
    move-result v0

    .line 1789
    if-lez v0, :cond_3e

    .line 1790
    .line 1791
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v0

    .line 1795
    check-cast v0, La/uv6;

    .line 1796
    .line 1797
    invoke-static {v0}, La/oa7;->b(La/uv6;)Ljava/lang/String;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v0

    .line 1801
    goto :goto_27

    .line 1802
    :cond_3e
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v0

    .line 1806
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v0

    .line 1810
    :cond_3f
    :goto_27
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1811
    .line 1812
    .line 1813
    iget-object v0, v3, La/lb7;->m:Landroidx/constraintlayout/widget/Group;

    .line 1814
    .line 1815
    invoke-static {v2}, La/oa7;->a(La/cp;)Z

    .line 1816
    .line 1817
    .line 1818
    move-result v1

    .line 1819
    if-nez v1, :cond_40

    .line 1820
    .line 1821
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v1

    .line 1825
    check-cast v1, La/uv6;

    .line 1826
    .line 1827
    iget-object v1, v1, La/uv6;->O:La/s77;

    .line 1828
    .line 1829
    if-eq v1, v10, :cond_40

    .line 1830
    .line 1831
    const/4 v1, 0x0

    .line 1832
    goto :goto_28

    .line 1833
    :cond_40
    move v1, v4

    .line 1834
    :goto_28
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1835
    .line 1836
    .line 1837
    iget-object v0, v3, La/lb7;->h:Landroid/widget/ImageView;

    .line 1838
    .line 1839
    iget-object v1, v3, La/lb7;->F:Landroid/widget/TextView;

    .line 1840
    .line 1841
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    move-result-object v6

    .line 1845
    check-cast v6, La/uv6;

    .line 1846
    .line 1847
    iget-object v6, v6, La/uv6;->k:La/mvn;

    .line 1848
    .line 1849
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 1850
    .line 1851
    .line 1852
    move-result v6

    .line 1853
    const v7, 0x7f080c3c

    .line 1854
    .line 1855
    .line 1856
    const v8, 0x7f080c55

    .line 1857
    .line 1858
    .line 1859
    packed-switch v6, :pswitch_data_1

    .line 1860
    .line 1861
    .line 1862
    invoke-static {}, La/t9f;->b()V

    .line 1863
    .line 1864
    .line 1865
    const/4 v0, 0x0

    .line 1866
    goto/16 :goto_2f

    .line 1867
    .line 1868
    :pswitch_1
    move v8, v7

    .line 1869
    goto :goto_29

    .line 1870
    :pswitch_2
    const v6, 0x7f080c49

    .line 1871
    .line 1872
    .line 1873
    move v8, v6

    .line 1874
    goto :goto_29

    .line 1875
    :pswitch_3
    const/4 v8, 0x0

    .line 1876
    :goto_29
    :pswitch_4
    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1877
    .line 1878
    .line 1879
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v0

    .line 1883
    check-cast v0, La/uv6;

    .line 1884
    .line 1885
    iget-object v0, v0, La/uv6;->k:La/mvn;

    .line 1886
    .line 1887
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v6

    .line 1891
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1892
    .line 1893
    .line 1894
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1895
    .line 1896
    .line 1897
    move-result v0

    .line 1898
    const/4 v8, 0x1

    .line 1899
    if-eq v0, v8, :cond_42

    .line 1900
    .line 1901
    const/4 v9, 0x2

    .line 1902
    if-eq v0, v9, :cond_41

    .line 1903
    .line 1904
    const/4 v7, 0x3

    .line 1905
    if-eq v0, v7, :cond_41

    .line 1906
    .line 1907
    const/4 v7, 0x4

    .line 1908
    if-eq v0, v7, :cond_41

    .line 1909
    .line 1910
    const/4 v7, 0x7

    .line 1911
    if-eq v0, v7, :cond_41

    .line 1912
    .line 1913
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 1914
    .line 1915
    const v0, 0x7f040afc

    .line 1916
    .line 1917
    .line 1918
    const/4 v5, 0x0

    .line 1919
    invoke-static {v6, v0, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1920
    .line 1921
    .line 1922
    move-result v0

    .line 1923
    goto :goto_2a

    .line 1924
    :cond_41
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 1925
    .line 1926
    const v0, 0x7f0606c1

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v6, v0}, Landroid/content/Context;->getColor(I)I

    .line 1930
    .line 1931
    .line 1932
    move-result v0

    .line 1933
    goto :goto_2a

    .line 1934
    :cond_42
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 1935
    .line 1936
    const v0, 0x7f0606d0

    .line 1937
    .line 1938
    .line 1939
    invoke-virtual {v6, v0}, Landroid/content/Context;->getColor(I)I

    .line 1940
    .line 1941
    .line 1942
    move-result v0

    .line 1943
    :goto_2a
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1944
    .line 1945
    .line 1946
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v0

    .line 1950
    check-cast v0, La/uv6;

    .line 1951
    .line 1952
    iget-object v0, v0, La/uv6;->M:Ljava/lang/String;

    .line 1953
    .line 1954
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1955
    .line 1956
    .line 1957
    iget-object v0, v3, La/lb7;->k:Landroidx/constraintlayout/widget/Group;

    .line 1958
    .line 1959
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v1

    .line 1963
    check-cast v1, La/uv6;

    .line 1964
    .line 1965
    iget-object v1, v1, La/uv6;->N:Ljava/lang/String;

    .line 1966
    .line 1967
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1968
    .line 1969
    .line 1970
    move-result v1

    .line 1971
    if-lez v1, :cond_43

    .line 1972
    .line 1973
    const/4 v13, 0x0

    .line 1974
    goto :goto_2b

    .line 1975
    :cond_43
    move v13, v4

    .line 1976
    :goto_2b
    invoke-virtual {v0, v13}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1977
    .line 1978
    .line 1979
    iget-object v0, v3, La/lb7;->Q:Landroid/widget/TextView;

    .line 1980
    .line 1981
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v1

    .line 1985
    check-cast v1, La/uv6;

    .line 1986
    .line 1987
    iget-object v1, v1, La/uv6;->N:Ljava/lang/String;

    .line 1988
    .line 1989
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1990
    .line 1991
    .line 1992
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v0

    .line 1996
    check-cast v0, La/uv6;

    .line 1997
    .line 1998
    iget-boolean v0, v0, La/uv6;->T:Z

    .line 1999
    .line 2000
    const/4 v1, 0x0

    .line 2001
    if-eqz v0, :cond_44

    .line 2002
    .line 2003
    iget-object v0, v2, La/cp;->w:Landroid/content/Context;

    .line 2004
    .line 2005
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v0

    .line 2009
    const v4, 0x7f0700ad

    .line 2010
    .line 2011
    .line 2012
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 2013
    .line 2014
    .line 2015
    move-result v0

    .line 2016
    goto :goto_2c

    .line 2017
    :cond_44
    move v0, v1

    .line 2018
    :goto_2c
    iget-object v4, v3, La/lb7;->f:Lcom/google/android/material/card/MaterialCardView;

    .line 2019
    .line 2020
    iget-object v3, v3, La/lb7;->a:Landroid/widget/FrameLayout;

    .line 2021
    .line 2022
    invoke-virtual {v4}, Lcom/google/android/material/card/MaterialCardView;->getShapeAppearanceModel()La/akj0;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v6

    .line 2026
    invoke-virtual {v6}, La/akj0;->l()La/daf;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v6

    .line 2030
    invoke-virtual {v6, v0}, La/daf;->T(F)V

    .line 2031
    .line 2032
    .line 2033
    invoke-virtual {v6, v0}, La/daf;->U(F)V

    .line 2034
    .line 2035
    .line 2036
    invoke-virtual {v6}, La/daf;->c()La/akj0;

    .line 2037
    .line 2038
    .line 2039
    move-result-object v0

    .line 2040
    invoke-virtual {v4, v0}, Lcom/google/android/material/card/MaterialCardView;->setShapeAppearanceModel(La/akj0;)V

    .line 2041
    .line 2042
    .line 2043
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v0

    .line 2047
    check-cast v0, La/uv6;

    .line 2048
    .line 2049
    iget-boolean v0, v0, La/uv6;->T:Z

    .line 2050
    .line 2051
    if-eqz v0, :cond_45

    .line 2052
    .line 2053
    const/high16 v0, 0x40800000    # 4.0f

    .line 2054
    .line 2055
    goto :goto_2d

    .line 2056
    :cond_45
    move v0, v1

    .line 2057
    :goto_2d
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v2

    .line 2061
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2062
    .line 2063
    .line 2064
    cmpg-float v1, v0, v1

    .line 2065
    .line 2066
    if-nez v1, :cond_46

    .line 2067
    .line 2068
    const/4 v0, 0x0

    .line 2069
    goto :goto_2e

    .line 2070
    :cond_46
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v1

    .line 2074
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v1

    .line 2078
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 2079
    .line 2080
    mul-float/2addr v1, v0

    .line 2081
    float-to-double v0, v1

    .line 2082
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 2083
    .line 2084
    .line 2085
    move-result-wide v0

    .line 2086
    double-to-float v0, v0

    .line 2087
    float-to-int v0, v0

    .line 2088
    :goto_2e
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v1

    .line 2092
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2093
    .line 2094
    .line 2095
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2096
    .line 2097
    .line 2098
    move-result-object v1

    .line 2099
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v1

    .line 2103
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 2104
    .line 2105
    const/high16 v2, 0x41000000    # 8.0f

    .line 2106
    .line 2107
    mul-float/2addr v1, v2

    .line 2108
    float-to-double v1, v1

    .line 2109
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 2110
    .line 2111
    .line 2112
    move-result-wide v1

    .line 2113
    double-to-float v1, v1

    .line 2114
    float-to-int v1, v1

    .line 2115
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 2116
    .line 2117
    const/4 v3, -0x1

    .line 2118
    const/4 v6, -0x2

    .line 2119
    invoke-direct {v2, v3, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 2120
    .line 2121
    .line 2122
    const/4 v5, 0x0

    .line 2123
    invoke-virtual {v2, v1, v5, v1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 2124
    .line 2125
    .line 2126
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2127
    .line 2128
    .line 2129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2130
    .line 2131
    :goto_2f
    return-object v0

    .line 2132
    nop

    .line 2133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method
