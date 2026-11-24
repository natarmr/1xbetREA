.class public final synthetic La/s3t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/s3t;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/s3t;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/s3t;->a:B

    .line 4
    .line 5
    const v1, 0x7f0d03ca

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const v3, 0x7f0a1260

    .line 10
    .line 11
    .line 12
    const v4, 0x7f0a0fce

    .line 13
    .line 14
    .line 15
    const v5, 0x7f0a06e3

    .line 16
    .line 17
    .line 18
    const/4 v6, 0x3

    .line 19
    const-string v7, "rootView"

    .line 20
    .line 21
    const-string v8, "Missing required view with ID: "

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, Landroid/view/LayoutInflater;

    .line 31
    .line 32
    move-object/from16 v1, p2

    .line 33
    .line 34
    check-cast v1, Landroid/view/ViewGroup;

    .line 35
    .line 36
    const v2, 0x7f0d03cb

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 45
    .line 46
    const v2, 0x7f0a042f

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    const v2, 0x7f0a0730

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 65
    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    new-instance v9, La/kvx;

    .line 77
    .line 78
    invoke-direct {v9, v1, v3, v5, v2}, La/kvx;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightButton;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    move v4, v2

    .line 83
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    return-object v9

    .line 99
    :pswitch_0
    move-object/from16 v0, p1

    .line 100
    .line 101
    check-cast v0, Landroid/view/LayoutInflater;

    .line 102
    .line 103
    move-object/from16 v1, p2

    .line 104
    .line 105
    check-cast v1, Landroid/view/ViewGroup;

    .line 106
    .line 107
    const v2, 0x7f0d005b

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    move-object v1, v0

    .line 115
    check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 116
    .line 117
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Landroid/widget/TextView;

    .line 122
    .line 123
    if-eqz v2, :cond_2

    .line 124
    .line 125
    new-instance v9, La/b47;

    .line 126
    .line 127
    invoke-direct {v9, v1, v2}, La/b47;-><init>(Landroidx/appcompat/widget/LinearLayoutCompat;Landroid/widget/TextView;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :goto_1
    return-object v9

    .line 147
    :pswitch_1
    move-object/from16 v0, p1

    .line 148
    .line 149
    check-cast v0, Landroid/view/LayoutInflater;

    .line 150
    .line 151
    move-object/from16 v1, p2

    .line 152
    .line 153
    check-cast v1, Landroid/view/ViewGroup;

    .line 154
    .line 155
    const v2, 0x7f0d032a

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-eqz v0, :cond_3

    .line 163
    .line 164
    check-cast v0, Landroid/widget/TextView;

    .line 165
    .line 166
    new-instance v9, La/kyv;

    .line 167
    .line 168
    invoke-direct {v9, v0, v0}, La/kyv;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_3
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :goto_2
    return-object v9

    .line 176
    :pswitch_2
    move-object/from16 v0, p1

    .line 177
    .line 178
    check-cast v0, La/fet;

    .line 179
    .line 180
    move-object/from16 v1, p2

    .line 181
    .line 182
    check-cast v1, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    const v1, -0x65f93348

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 191
    .line 192
    .line 193
    invoke-static {v10, v10, v0, v10, v6}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 198
    .line 199
    .line 200
    return-object v1

    .line 201
    :pswitch_3
    move-object/from16 v0, p1

    .line 202
    .line 203
    check-cast v0, La/fet;

    .line 204
    .line 205
    move-object/from16 v1, p2

    .line 206
    .line 207
    check-cast v1, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-static {v2}, La/x8x;->L(I)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-static {v1, v0}, La/hew0;->t(ILa/fet;)V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_4
    move-object/from16 v0, p1

    .line 223
    .line 224
    check-cast v0, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-object/from16 v0, p2

    .line 230
    .line 231
    check-cast v0, La/z3a0;

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget-object v0, v0, La/z3a0;->a:Ljava/lang/String;

    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_5
    move-object/from16 v0, p1

    .line 240
    .line 241
    check-cast v0, Landroid/view/LayoutInflater;

    .line 242
    .line 243
    move-object/from16 v1, p2

    .line 244
    .line 245
    check-cast v1, Landroid/view/ViewGroup;

    .line 246
    .line 247
    const v2, 0x7f0d03cc

    .line 248
    .line 249
    .line 250
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-eqz v0, :cond_4

    .line 255
    .line 256
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 257
    .line 258
    new-instance v9, La/lvx;

    .line 259
    .line 260
    invoke-direct {v9, v0, v0}, La/lvx;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_4
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :goto_3
    return-object v9

    .line 268
    :pswitch_6
    move-object/from16 v0, p1

    .line 269
    .line 270
    check-cast v0, Landroid/view/LayoutInflater;

    .line 271
    .line 272
    move-object/from16 v1, p2

    .line 273
    .line 274
    check-cast v1, Landroid/view/ViewGroup;

    .line 275
    .line 276
    const v2, 0x7f0d0454

    .line 277
    .line 278
    .line 279
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    if-eqz v0, :cond_5

    .line 284
    .line 285
    check-cast v0, Landroid/widget/TextView;

    .line 286
    .line 287
    new-instance v9, La/yxx;

    .line 288
    .line 289
    invoke-direct {v9, v0, v0}, La/yxx;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_5
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    :goto_4
    return-object v9

    .line 297
    :pswitch_7
    move-object/from16 v0, p1

    .line 298
    .line 299
    check-cast v0, Landroid/view/LayoutInflater;

    .line 300
    .line 301
    move-object/from16 v2, p2

    .line 302
    .line 303
    check-cast v2, Landroid/view/ViewGroup;

    .line 304
    .line 305
    invoke-static {v0, v2, v1, v2, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_6

    .line 310
    .line 311
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 312
    .line 313
    new-instance v9, La/ivx;

    .line 314
    .line 315
    invoke-direct {v9, v0, v0}, La/ivx;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 316
    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_6
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :goto_5
    return-object v9

    .line 323
    :pswitch_8
    move-object/from16 v0, p1

    .line 324
    .line 325
    check-cast v0, Landroid/view/LayoutInflater;

    .line 326
    .line 327
    move-object/from16 v1, p2

    .line 328
    .line 329
    check-cast v1, Landroid/view/ViewGroup;

    .line 330
    .line 331
    const v2, 0x7f0d00ef

    .line 332
    .line 333
    .line 334
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-eqz v0, :cond_7

    .line 339
    .line 340
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 341
    .line 342
    new-instance v9, La/yth;

    .line 343
    .line 344
    invoke-direct {v9, v0, v0}, La/yth;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 345
    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_7
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    :goto_6
    return-object v9

    .line 352
    :pswitch_9
    move-object/from16 v0, p1

    .line 353
    .line 354
    check-cast v0, Landroid/view/LayoutInflater;

    .line 355
    .line 356
    move-object/from16 v1, p2

    .line 357
    .line 358
    check-cast v1, Landroid/view/ViewGroup;

    .line 359
    .line 360
    const v2, 0x7f0d00d7

    .line 361
    .line 362
    .line 363
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    if-eqz v0, :cond_8

    .line 368
    .line 369
    check-cast v0, Landroid/widget/TextView;

    .line 370
    .line 371
    new-instance v9, La/kth;

    .line 372
    .line 373
    invoke-direct {v9, v0, v0}, La/kth;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_8
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :goto_7
    return-object v9

    .line 381
    :pswitch_a
    move-object/from16 v0, p1

    .line 382
    .line 383
    check-cast v0, Landroid/view/LayoutInflater;

    .line 384
    .line 385
    move-object/from16 v1, p2

    .line 386
    .line 387
    check-cast v1, Landroid/view/ViewGroup;

    .line 388
    .line 389
    const v2, 0x7f0d0327

    .line 390
    .line 391
    .line 392
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    const v1, 0x7f0a0eb0

    .line 397
    .line 398
    .line 399
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    check-cast v2, Landroid/widget/TextView;

    .line 404
    .line 405
    if-eqz v2, :cond_9

    .line 406
    .line 407
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 412
    .line 413
    if-eqz v1, :cond_a

    .line 414
    .line 415
    new-instance v9, La/xrv;

    .line 416
    .line 417
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 418
    .line 419
    invoke-direct {v9, v0, v2, v1}, La/xrv;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 420
    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_9
    move v4, v1

    .line 424
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    :goto_8
    return-object v9

    .line 440
    :pswitch_b
    move-object/from16 v0, p1

    .line 441
    .line 442
    check-cast v0, Landroid/view/LayoutInflater;

    .line 443
    .line 444
    move-object/from16 v1, p2

    .line 445
    .line 446
    check-cast v1, Landroid/view/ViewGroup;

    .line 447
    .line 448
    const v2, 0x7f0d0324

    .line 449
    .line 450
    .line 451
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    if-eqz v0, :cond_b

    .line 456
    .line 457
    new-instance v9, La/mzq;

    .line 458
    .line 459
    check-cast v0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 460
    .line 461
    invoke-direct {v9, v0, v6}, La/mzq;-><init>(Landroid/view/View;B)V

    .line 462
    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_b
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    :goto_9
    return-object v9

    .line 469
    :pswitch_c
    move-object/from16 v0, p1

    .line 470
    .line 471
    check-cast v0, La/fet;

    .line 472
    .line 473
    move-object/from16 v1, p2

    .line 474
    .line 475
    check-cast v1, Ljava/lang/Integer;

    .line 476
    .line 477
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    const v1, 0x7842b48

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 484
    .line 485
    .line 486
    invoke-static {v0}, La/f9z;->a(La/fet;)La/d9z;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 491
    .line 492
    .line 493
    return-object v1

    .line 494
    :pswitch_d
    move-object/from16 v0, p1

    .line 495
    .line 496
    check-cast v0, La/fet;

    .line 497
    .line 498
    move-object/from16 v1, p2

    .line 499
    .line 500
    check-cast v1, Ljava/lang/Integer;

    .line 501
    .line 502
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 503
    .line 504
    .line 505
    const v1, -0xcb0881e

    .line 506
    .line 507
    .line 508
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 509
    .line 510
    .line 511
    invoke-static {v10, v10, v0, v10, v6}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 516
    .line 517
    .line 518
    return-object v1

    .line 519
    :pswitch_e
    move-object/from16 v0, p1

    .line 520
    .line 521
    check-cast v0, Landroid/view/LayoutInflater;

    .line 522
    .line 523
    move-object/from16 v2, p2

    .line 524
    .line 525
    check-cast v2, Landroid/view/ViewGroup;

    .line 526
    .line 527
    invoke-static {v0, v2, v1, v2, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    if-eqz v0, :cond_c

    .line 532
    .line 533
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 534
    .line 535
    new-instance v9, La/jvx;

    .line 536
    .line 537
    invoke-direct {v9, v0, v0}, La/jvx;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 538
    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_c
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    :goto_a
    return-object v9

    .line 545
    :pswitch_f
    move-object/from16 v0, p1

    .line 546
    .line 547
    check-cast v0, Landroid/view/LayoutInflater;

    .line 548
    .line 549
    move-object/from16 v1, p2

    .line 550
    .line 551
    check-cast v1, Landroid/view/ViewGroup;

    .line 552
    .line 553
    const v2, 0x7f0d041e

    .line 554
    .line 555
    .line 556
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    const v1, 0x7f0a033c

    .line 561
    .line 562
    .line 563
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    move-object v12, v2

    .line 568
    check-cast v12, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 569
    .line 570
    if-eqz v12, :cond_d

    .line 571
    .line 572
    const v1, 0x7f0a034d

    .line 573
    .line 574
    .line 575
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    move-object v13, v2

    .line 580
    check-cast v13, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 581
    .line 582
    if-eqz v13, :cond_d

    .line 583
    .line 584
    const v1, 0x7f0a03d7

    .line 585
    .line 586
    .line 587
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    move-object v14, v2

    .line 592
    check-cast v14, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;

    .line 593
    .line 594
    if-eqz v14, :cond_d

    .line 595
    .line 596
    move-object v11, v0

    .line 597
    check-cast v11, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 598
    .line 599
    new-instance v10, La/pxx;

    .line 600
    .line 601
    move-object v15, v11

    .line 602
    invoke-direct/range {v10 .. v15}, La/pxx;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;Lorg/xplatform/uikit/components/cells/DsSettingsCell;)V

    .line 603
    .line 604
    .line 605
    move-object v9, v10

    .line 606
    goto :goto_b

    .line 607
    :cond_d
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    :goto_b
    return-object v9

    .line 623
    :pswitch_10
    move-object/from16 v0, p1

    .line 624
    .line 625
    check-cast v0, Landroid/view/LayoutInflater;

    .line 626
    .line 627
    move-object/from16 v1, p2

    .line 628
    .line 629
    check-cast v1, Landroid/view/ViewGroup;

    .line 630
    .line 631
    const v2, 0x7f0d041d

    .line 632
    .line 633
    .line 634
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    const v1, 0x7f0a0351

    .line 639
    .line 640
    .line 641
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 646
    .line 647
    if-eqz v2, :cond_e

    .line 648
    .line 649
    const v1, 0x7f0a03dc

    .line 650
    .line 651
    .line 652
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    check-cast v2, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 657
    .line 658
    if-eqz v2, :cond_e

    .line 659
    .line 660
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 665
    .line 666
    if-eqz v1, :cond_f

    .line 667
    .line 668
    const v5, 0x7f0a08b9

    .line 669
    .line 670
    .line 671
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    check-cast v1, Landroid/widget/ImageView;

    .line 676
    .line 677
    if-eqz v1, :cond_f

    .line 678
    .line 679
    const v5, 0x7f0a0cc6

    .line 680
    .line 681
    .line 682
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 687
    .line 688
    if-eqz v1, :cond_f

    .line 689
    .line 690
    const v5, 0x7f0a0cd1

    .line 691
    .line 692
    .line 693
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 698
    .line 699
    if-eqz v1, :cond_f

    .line 700
    .line 701
    const v5, 0x7f0a1282

    .line 702
    .line 703
    .line 704
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    check-cast v1, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 709
    .line 710
    if-eqz v1, :cond_f

    .line 711
    .line 712
    new-instance v9, La/oxx;

    .line 713
    .line 714
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 715
    .line 716
    invoke-direct {v9, v0, v2}, La/oxx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;)V

    .line 717
    .line 718
    .line 719
    goto :goto_c

    .line 720
    :cond_e
    move v5, v1

    .line 721
    :cond_f
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    :goto_c
    return-object v9

    .line 737
    :pswitch_11
    move-object/from16 v0, p1

    .line 738
    .line 739
    check-cast v0, Ljava/lang/Integer;

    .line 740
    .line 741
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    move-object/from16 v0, p2

    .line 745
    .line 746
    check-cast v0, La/djv;

    .line 747
    .line 748
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    iget-object v0, v0, La/djv;->a:Ljava/lang/String;

    .line 752
    .line 753
    return-object v0

    .line 754
    :pswitch_12
    move-object/from16 v0, p1

    .line 755
    .line 756
    check-cast v0, Landroid/view/LayoutInflater;

    .line 757
    .line 758
    move-object/from16 v1, p2

    .line 759
    .line 760
    check-cast v1, Landroid/view/ViewGroup;

    .line 761
    .line 762
    const v2, 0x7f0d0320

    .line 763
    .line 764
    .line 765
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    const v1, 0x7f0a0bda

    .line 770
    .line 771
    .line 772
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 773
    .line 774
    .line 775
    move-result-object v2

    .line 776
    check-cast v2, Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;

    .line 777
    .line 778
    if-eqz v2, :cond_10

    .line 779
    .line 780
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 781
    .line 782
    .line 783
    move-result-object v1

    .line 784
    check-cast v1, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 785
    .line 786
    if-eqz v1, :cond_11

    .line 787
    .line 788
    new-instance v9, La/ohv;

    .line 789
    .line 790
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 791
    .line 792
    invoke-direct {v9, v0, v2, v1}, La/ohv;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 793
    .line 794
    .line 795
    goto :goto_d

    .line 796
    :cond_10
    move v3, v1

    .line 797
    :cond_11
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    :goto_d
    return-object v9

    .line 813
    :pswitch_13
    move-object/from16 v0, p1

    .line 814
    .line 815
    check-cast v0, La/fet;

    .line 816
    .line 817
    move-object/from16 v1, p2

    .line 818
    .line 819
    check-cast v1, Ljava/lang/Integer;

    .line 820
    .line 821
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    const/4 v1, 0x7

    .line 825
    invoke-static {v1}, La/x8x;->L(I)I

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    invoke-static {v1, v0}, La/epv0;->G(ILa/fet;)V

    .line 830
    .line 831
    .line 832
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 833
    .line 834
    return-object v0

    .line 835
    :pswitch_14
    move-object/from16 v0, p1

    .line 836
    .line 837
    check-cast v0, Ljava/lang/Integer;

    .line 838
    .line 839
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    move-object/from16 v0, p2

    .line 843
    .line 844
    check-cast v0, La/jfo0;

    .line 845
    .line 846
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    iget-object v0, v0, La/jfo0;->a:La/bfo0;

    .line 850
    .line 851
    return-object v0

    .line 852
    :pswitch_15
    move-object/from16 v0, p1

    .line 853
    .line 854
    check-cast v0, La/a640;

    .line 855
    .line 856
    move-object/from16 v1, p2

    .line 857
    .line 858
    check-cast v1, La/a640;

    .line 859
    .line 860
    invoke-virtual {v0}, La/a640;->b()I

    .line 861
    .line 862
    .line 863
    move-result v2

    .line 864
    const/4 v3, -0x1

    .line 865
    if-eq v2, v3, :cond_13

    .line 866
    .line 867
    invoke-virtual {v1}, La/a640;->b()I

    .line 868
    .line 869
    .line 870
    move-result v2

    .line 871
    if-ne v2, v3, :cond_12

    .line 872
    .line 873
    goto :goto_e

    .line 874
    :cond_12
    invoke-virtual {v0}, La/a640;->b()I

    .line 875
    .line 876
    .line 877
    move-result v0

    .line 878
    invoke-virtual {v1}, La/a640;->b()I

    .line 879
    .line 880
    .line 881
    move-result v1

    .line 882
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    goto :goto_f

    .line 887
    :cond_13
    :goto_e
    invoke-virtual {v0}, La/a640;->a()Ljava/util/Date;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-virtual {v1}, La/a640;->a()Ljava/util/Date;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    :goto_f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    return-object v0

    .line 904
    :pswitch_16
    move-object/from16 v0, p1

    .line 905
    .line 906
    check-cast v0, La/gxb;

    .line 907
    .line 908
    move-object/from16 v1, p2

    .line 909
    .line 910
    check-cast v1, La/gxb;

    .line 911
    .line 912
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    iget v3, v0, La/gxb;->d:I

    .line 919
    .line 920
    iget v4, v1, La/gxb;->d:I

    .line 921
    .line 922
    if-ne v3, v4, :cond_14

    .line 923
    .line 924
    iget v3, v0, La/gxb;->e:I

    .line 925
    .line 926
    iget v4, v1, La/gxb;->e:I

    .line 927
    .line 928
    if-ne v3, v4, :cond_14

    .line 929
    .line 930
    iget-object v0, v0, La/gxb;->i:Ljava/util/List;

    .line 931
    .line 932
    iget-object v1, v1, La/gxb;->i:Ljava/util/List;

    .line 933
    .line 934
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    if-eqz v0, :cond_14

    .line 939
    .line 940
    goto :goto_10

    .line 941
    :cond_14
    move v2, v10

    .line 942
    :goto_10
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    return-object v0

    .line 947
    :pswitch_17
    move-object/from16 v0, p1

    .line 948
    .line 949
    check-cast v0, Ljava/lang/Boolean;

    .line 950
    .line 951
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    move-object/from16 v0, p2

    .line 955
    .line 956
    check-cast v0, Ljava/lang/Boolean;

    .line 957
    .line 958
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    sget-object v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->z1:Ljava/util/List;

    .line 962
    .line 963
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 964
    .line 965
    return-object v0

    .line 966
    :pswitch_18
    move-object/from16 v0, p1

    .line 967
    .line 968
    check-cast v0, Landroid/view/LayoutInflater;

    .line 969
    .line 970
    move-object/from16 v1, p2

    .line 971
    .line 972
    check-cast v1, Landroid/view/ViewGroup;

    .line 973
    .line 974
    const v2, 0x7f0d0360

    .line 975
    .line 976
    .line 977
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    if-eqz v0, :cond_15

    .line 982
    .line 983
    check-cast v0, Landroid/widget/TextView;

    .line 984
    .line 985
    new-instance v9, La/hsx;

    .line 986
    .line 987
    invoke-direct {v9, v0, v0}, La/hsx;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 988
    .line 989
    .line 990
    goto :goto_11

    .line 991
    :cond_15
    invoke-static {v7}, La/hny;->u(Ljava/lang/String;)V

    .line 992
    .line 993
    .line 994
    :goto_11
    return-object v9

    .line 995
    :pswitch_19
    move-object/from16 v0, p1

    .line 996
    .line 997
    check-cast v0, Landroid/view/LayoutInflater;

    .line 998
    .line 999
    move-object/from16 v1, p2

    .line 1000
    .line 1001
    check-cast v1, Landroid/view/ViewGroup;

    .line 1002
    .line 1003
    const v2, 0x7f0d0510

    .line 1004
    .line 1005
    .line 1006
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    const v1, 0x7f0a036f

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    check-cast v2, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 1018
    .line 1019
    if-eqz v2, :cond_16

    .line 1020
    .line 1021
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v1

    .line 1025
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1026
    .line 1027
    if-eqz v1, :cond_17

    .line 1028
    .line 1029
    new-instance v9, La/v6b0;

    .line 1030
    .line 1031
    check-cast v0, Landroid/widget/LinearLayout;

    .line 1032
    .line 1033
    invoke-direct {v9, v0, v2, v1}, La/v6b0;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_12

    .line 1037
    :cond_16
    move v5, v1

    .line 1038
    :cond_17
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    :goto_12
    return-object v9

    .line 1054
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1055
    .line 1056
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1057
    .line 1058
    move-object/from16 v1, p2

    .line 1059
    .line 1060
    check-cast v1, Landroid/view/ViewGroup;

    .line 1061
    .line 1062
    const v2, 0x7f0d051c

    .line 1063
    .line 1064
    .line 1065
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    const v1, 0x7f0a011f

    .line 1070
    .line 1071
    .line 1072
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v2

    .line 1076
    if-eqz v2, :cond_1b

    .line 1077
    .line 1078
    new-instance v12, La/auh;

    .line 1079
    .line 1080
    check-cast v2, Landroid/widget/FrameLayout;

    .line 1081
    .line 1082
    const/4 v1, 0x6

    .line 1083
    invoke-direct {v12, v2, v1}, La/auh;-><init>(Landroid/widget/FrameLayout;B)V

    .line 1084
    .line 1085
    .line 1086
    const v2, 0x7f0a0120

    .line 1087
    .line 1088
    .line 1089
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    if-eqz v3, :cond_1a

    .line 1094
    .line 1095
    new-instance v13, La/auh;

    .line 1096
    .line 1097
    check-cast v3, Landroid/widget/FrameLayout;

    .line 1098
    .line 1099
    invoke-direct {v13, v3, v1}, La/auh;-><init>(Landroid/widget/FrameLayout;B)V

    .line 1100
    .line 1101
    .line 1102
    const v1, 0x7f0a062e

    .line 1103
    .line 1104
    .line 1105
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2

    .line 1109
    if-eqz v2, :cond_1b

    .line 1110
    .line 1111
    invoke-static {v2}, La/nq8;->a(Landroid/view/View;)La/nq8;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v14

    .line 1115
    const v1, 0x7f0a062f

    .line 1116
    .line 1117
    .line 1118
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v2

    .line 1122
    if-eqz v2, :cond_1b

    .line 1123
    .line 1124
    invoke-static {v2}, La/nq8;->a(Landroid/view/View;)La/nq8;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v15

    .line 1128
    const v1, 0x7f0a0630

    .line 1129
    .line 1130
    .line 1131
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v2

    .line 1135
    if-eqz v2, :cond_1b

    .line 1136
    .line 1137
    invoke-static {v2}, La/nq8;->a(Landroid/view/View;)La/nq8;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v16

    .line 1141
    const v1, 0x7f0a0631

    .line 1142
    .line 1143
    .line 1144
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v2

    .line 1148
    if-eqz v2, :cond_1b

    .line 1149
    .line 1150
    invoke-static {v2}, La/nq8;->a(Landroid/view/View;)La/nq8;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v17

    .line 1154
    const v1, 0x7f0a0632

    .line 1155
    .line 1156
    .line 1157
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v2

    .line 1161
    if-eqz v2, :cond_1b

    .line 1162
    .line 1163
    invoke-static {v2}, La/nq8;->a(Landroid/view/View;)La/nq8;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v18

    .line 1167
    const v1, 0x7f0a0633

    .line 1168
    .line 1169
    .line 1170
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v2

    .line 1174
    if-eqz v2, :cond_1b

    .line 1175
    .line 1176
    invoke-static {v2}, La/nq8;->a(Landroid/view/View;)La/nq8;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v19

    .line 1180
    const v1, 0x7f0a0e06

    .line 1181
    .line 1182
    .line 1183
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v2

    .line 1187
    if-eqz v2, :cond_1b

    .line 1188
    .line 1189
    const v1, 0x7f0a011a

    .line 1190
    .line 1191
    .line 1192
    invoke-static {v2, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v3

    .line 1196
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesShimmerCollection;

    .line 1197
    .line 1198
    if-eqz v3, :cond_18

    .line 1199
    .line 1200
    invoke-static {v2, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1205
    .line 1206
    if-eqz v1, :cond_19

    .line 1207
    .line 1208
    new-instance v4, La/vd7;

    .line 1209
    .line 1210
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1211
    .line 1212
    const/16 v5, 0x14

    .line 1213
    .line 1214
    invoke-direct {v4, v2, v3, v1, v5}, La/vd7;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;B)V

    .line 1215
    .line 1216
    .line 1217
    new-instance v10, La/i8b0;

    .line 1218
    .line 1219
    move-object v11, v0

    .line 1220
    check-cast v11, Landroid/widget/LinearLayout;

    .line 1221
    .line 1222
    move-object/from16 v20, v4

    .line 1223
    .line 1224
    invoke-direct/range {v10 .. v20}, La/i8b0;-><init>(Landroid/widget/LinearLayout;La/auh;La/auh;La/nq8;La/nq8;La/nq8;La/nq8;La/nq8;La/nq8;La/vd7;)V

    .line 1225
    .line 1226
    .line 1227
    move-object v9, v10

    .line 1228
    goto :goto_13

    .line 1229
    :cond_18
    move v5, v1

    .line 1230
    :cond_19
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v0

    .line 1238
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    goto :goto_13

    .line 1246
    :cond_1a
    move v1, v2

    .line 1247
    :cond_1b
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    :goto_13
    return-object v9

    .line 1263
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1264
    .line 1265
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1266
    .line 1267
    move-object/from16 v1, p2

    .line 1268
    .line 1269
    check-cast v1, Landroid/view/ViewGroup;

    .line 1270
    .line 1271
    const v2, 0x7f0d0516

    .line 1272
    .line 1273
    .line 1274
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    const v1, 0x7f0a0acb

    .line 1279
    .line 1280
    .line 1281
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v2

    .line 1285
    check-cast v2, Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;

    .line 1286
    .line 1287
    if-eqz v2, :cond_1c

    .line 1288
    .line 1289
    new-instance v9, La/q7b0;

    .line 1290
    .line 1291
    check-cast v0, Landroid/widget/FrameLayout;

    .line 1292
    .line 1293
    invoke-direct {v9, v0, v2}, La/q7b0;-><init>(Landroid/widget/FrameLayout;Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;)V

    .line 1294
    .line 1295
    .line 1296
    goto :goto_14

    .line 1297
    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1310
    .line 1311
    .line 1312
    :goto_14
    return-object v9

    .line 1313
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1314
    .line 1315
    check-cast v0, Ljava/lang/Boolean;

    .line 1316
    .line 1317
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1318
    .line 1319
    .line 1320
    move-object/from16 v0, p2

    .line 1321
    .line 1322
    check-cast v0, La/csr;

    .line 1323
    .line 1324
    sget v1, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonViewNew;->g:I

    .line 1325
    .line 1326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1327
    .line 1328
    .line 1329
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1330
    .line 1331
    return-object v0

    .line 1332
    nop

    .line 1333
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
