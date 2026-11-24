.class public final synthetic La/x0h0;
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
    iput-byte p1, p0, La/x0h0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/x0h0;->a:B

    .line 4
    .line 5
    const-string v1, "rootView"

    .line 6
    .line 7
    const v2, 0x7f0a02b1

    .line 8
    .line 9
    .line 10
    const v3, 0x7f0a02ae

    .line 11
    .line 12
    .line 13
    const-string v4, "Missing required view with ID: "

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v0, p1

    .line 21
    .line 22
    check-cast v0, Ljava/lang/Throwable;

    .line 23
    .line 24
    move-object/from16 v1, p2

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v0, p1

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Throwable;

    .line 37
    .line 38
    move-object/from16 v1, p2

    .line 39
    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_1
    move-object/from16 v0, p1

    .line 49
    .line 50
    check-cast v0, Ljava/lang/Throwable;

    .line 51
    .line 52
    move-object/from16 v1, p2

    .line 53
    .line 54
    check-cast v1, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_2
    move-object/from16 v0, p1

    .line 63
    .line 64
    check-cast v0, Ljava/lang/Throwable;

    .line 65
    .line 66
    move-object/from16 v1, p2

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_3
    move-object/from16 v0, p1

    .line 77
    .line 78
    check-cast v0, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    move-object/from16 v1, p2

    .line 85
    .line 86
    check-cast v1, La/p6t0;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    instance-of v2, v1, La/jzh0;

    .line 92
    .line 93
    if-eqz v2, :cond_0

    .line 94
    .line 95
    check-cast v1, La/jzh0;

    .line 96
    .line 97
    iget-object v1, v1, La/jzh0;->a:Ljava/lang/String;

    .line 98
    .line 99
    :goto_0
    invoke-static {v0, v1}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    goto :goto_1

    .line 104
    :cond_0
    instance-of v2, v1, La/uzh0;

    .line 105
    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    check-cast v1, La/uzh0;

    .line 109
    .line 110
    iget-object v1, v1, La/uzh0;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v0, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    goto :goto_1

    .line 117
    :cond_1
    instance-of v2, v1, La/ua5;

    .line 118
    .line 119
    if-eqz v2, :cond_2

    .line 120
    .line 121
    check-cast v1, La/ua5;

    .line 122
    .line 123
    iget-object v1, v1, La/ua5;->a:Ljava/lang/String;

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    :goto_1
    return-object v0

    .line 131
    :pswitch_4
    move-object/from16 v0, p1

    .line 132
    .line 133
    check-cast v0, Landroid/view/LayoutInflater;

    .line 134
    .line 135
    move-object/from16 v1, p2

    .line 136
    .line 137
    check-cast v1, Landroid/view/ViewGroup;

    .line 138
    .line 139
    const v7, 0x7f0d06d3

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1, v7, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 151
    .line 152
    if-eqz v1, :cond_3

    .line 153
    .line 154
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 159
    .line 160
    if-eqz v3, :cond_4

    .line 161
    .line 162
    const v2, 0x7f0a02b4

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    check-cast v6, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 170
    .line 171
    if-eqz v6, :cond_4

    .line 172
    .line 173
    new-instance v5, La/xku0;

    .line 174
    .line 175
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 176
    .line 177
    invoke-direct {v5, v0, v1, v3, v6}, La/xku0;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_3
    move v2, v3

    .line 182
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :goto_2
    return-object v5

    .line 198
    :pswitch_5
    move-object/from16 v0, p1

    .line 199
    .line 200
    check-cast v0, Landroid/view/LayoutInflater;

    .line 201
    .line 202
    move-object/from16 v1, p2

    .line 203
    .line 204
    check-cast v1, Landroid/view/ViewGroup;

    .line 205
    .line 206
    const v7, 0x7f0d06d1

    .line 207
    .line 208
    .line 209
    invoke-static {v0, v1, v7, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 218
    .line 219
    if-eqz v1, :cond_5

    .line 220
    .line 221
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 226
    .line 227
    if-eqz v3, :cond_6

    .line 228
    .line 229
    const v2, 0x7f0a02b3

    .line 230
    .line 231
    .line 232
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    check-cast v6, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 237
    .line 238
    if-eqz v6, :cond_6

    .line 239
    .line 240
    new-instance v5, La/vku0;

    .line 241
    .line 242
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 243
    .line 244
    invoke-direct {v5, v0, v1, v3, v6}, La/vku0;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;)V

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_5
    move v2, v3

    .line 249
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    :goto_3
    return-object v5

    .line 265
    :pswitch_6
    move-object/from16 v0, p1

    .line 266
    .line 267
    check-cast v0, Landroid/view/LayoutInflater;

    .line 268
    .line 269
    move-object/from16 v1, p2

    .line 270
    .line 271
    check-cast v1, Landroid/view/ViewGroup;

    .line 272
    .line 273
    const v2, 0x7f0d06cf

    .line 274
    .line 275
    .line 276
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const v1, 0x7f0a0175

    .line 281
    .line 282
    .line 283
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    if-eqz v8, :cond_7

    .line 288
    .line 289
    const v1, 0x7f0a0177

    .line 290
    .line 291
    .line 292
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, Landroid/widget/ImageView;

    .line 297
    .line 298
    if-eqz v2, :cond_7

    .line 299
    .line 300
    const v1, 0x7f0a0434

    .line 301
    .line 302
    .line 303
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    move-object v9, v2

    .line 308
    check-cast v9, Landroid/widget/TextView;

    .line 309
    .line 310
    if-eqz v9, :cond_7

    .line 311
    .line 312
    const v1, 0x7f0a068f

    .line 313
    .line 314
    .line 315
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    move-object v10, v2

    .line 320
    check-cast v10, Landroidx/constraintlayout/widget/Group;

    .line 321
    .line 322
    if-eqz v10, :cond_7

    .line 323
    .line 324
    const v1, 0x7f0a0b99

    .line 325
    .line 326
    .line 327
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    move-object v11, v2

    .line 332
    check-cast v11, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 333
    .line 334
    if-eqz v11, :cond_7

    .line 335
    .line 336
    const v1, 0x7f0a0ba3

    .line 337
    .line 338
    .line 339
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    move-object v12, v2

    .line 344
    check-cast v12, Landroid/widget/TextView;

    .line 345
    .line 346
    if-eqz v12, :cond_7

    .line 347
    .line 348
    const v1, 0x7f0a0f57

    .line 349
    .line 350
    .line 351
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    if-eqz v13, :cond_7

    .line 356
    .line 357
    new-instance v6, La/tku0;

    .line 358
    .line 359
    move-object v7, v0

    .line 360
    check-cast v7, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 361
    .line 362
    invoke-direct/range {v6 .. v13}, La/tku0;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Landroid/view/View;Landroid/widget/TextView;Landroidx/constraintlayout/widget/Group;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Landroid/view/View;)V

    .line 363
    .line 364
    .line 365
    move-object v5, v6

    .line 366
    goto :goto_4

    .line 367
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    :goto_4
    return-object v5

    .line 383
    :pswitch_7
    move-object/from16 v0, p1

    .line 384
    .line 385
    check-cast v0, Landroid/view/LayoutInflater;

    .line 386
    .line 387
    move-object/from16 v2, p2

    .line 388
    .line 389
    check-cast v2, Landroid/view/ViewGroup;

    .line 390
    .line 391
    const v3, 0x7f0d06b9

    .line 392
    .line 393
    .line 394
    invoke-static {v0, v2, v3, v2, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-eqz v0, :cond_8

    .line 399
    .line 400
    new-instance v5, La/yju0;

    .line 401
    .line 402
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 403
    .line 404
    invoke-direct {v5, v0}, La/yju0;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;)V

    .line 405
    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_8
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    :goto_5
    return-object v5

    .line 412
    :pswitch_8
    move-object/from16 v0, p1

    .line 413
    .line 414
    check-cast v0, Landroid/view/LayoutInflater;

    .line 415
    .line 416
    move-object/from16 v1, p2

    .line 417
    .line 418
    check-cast v1, Landroid/view/ViewGroup;

    .line 419
    .line 420
    const v2, 0x7f0d06ab

    .line 421
    .line 422
    .line 423
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    const v1, 0x7f0a0dea

    .line 428
    .line 429
    .line 430
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    check-cast v2, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 435
    .line 436
    if-eqz v2, :cond_9

    .line 437
    .line 438
    const v1, 0x7f0a0dfe

    .line 439
    .line 440
    .line 441
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    check-cast v2, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 446
    .line 447
    if-eqz v2, :cond_9

    .line 448
    .line 449
    new-instance v5, La/vhu0;

    .line 450
    .line 451
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 452
    .line 453
    invoke-direct {v5, v0}, La/vhu0;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;)V

    .line 454
    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :goto_6
    return-object v5

    .line 473
    :pswitch_9
    move-object/from16 v0, p1

    .line 474
    .line 475
    check-cast v0, Landroid/view/LayoutInflater;

    .line 476
    .line 477
    move-object/from16 v1, p2

    .line 478
    .line 479
    check-cast v1, Landroid/view/ViewGroup;

    .line 480
    .line 481
    const v7, 0x7f0d06d2

    .line 482
    .line 483
    .line 484
    invoke-static {v0, v1, v7, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    check-cast v1, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 493
    .line 494
    if-eqz v1, :cond_a

    .line 495
    .line 496
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    check-cast v3, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 501
    .line 502
    if-eqz v3, :cond_b

    .line 503
    .line 504
    new-instance v5, La/wku0;

    .line 505
    .line 506
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 507
    .line 508
    invoke-direct {v5, v0, v1, v3}, La/wku0;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 509
    .line 510
    .line 511
    goto :goto_7

    .line 512
    :cond_a
    move v2, v3

    .line 513
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    :goto_7
    return-object v5

    .line 529
    :pswitch_a
    move-object/from16 v0, p1

    .line 530
    .line 531
    check-cast v0, Landroid/view/LayoutInflater;

    .line 532
    .line 533
    move-object/from16 v2, p2

    .line 534
    .line 535
    check-cast v2, Landroid/view/ViewGroup;

    .line 536
    .line 537
    const v3, 0x7f0d06d0

    .line 538
    .line 539
    .line 540
    invoke-static {v0, v2, v3, v2, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    if-eqz v0, :cond_c

    .line 545
    .line 546
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 547
    .line 548
    new-instance v5, La/uku0;

    .line 549
    .line 550
    invoke-direct {v5, v0, v0}, La/uku0;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 551
    .line 552
    .line 553
    goto :goto_8

    .line 554
    :cond_c
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    :goto_8
    return-object v5

    .line 558
    :pswitch_b
    move-object/from16 v0, p1

    .line 559
    .line 560
    check-cast v0, Landroid/view/LayoutInflater;

    .line 561
    .line 562
    move-object/from16 v2, p2

    .line 563
    .line 564
    check-cast v2, Landroid/view/ViewGroup;

    .line 565
    .line 566
    const v3, 0x7f0d06a3

    .line 567
    .line 568
    .line 569
    invoke-static {v0, v2, v3, v2, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    if-eqz v0, :cond_d

    .line 574
    .line 575
    new-instance v5, La/h2k;

    .line 576
    .line 577
    check-cast v0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 578
    .line 579
    const/4 v1, 0x1

    .line 580
    invoke-direct {v5, v0, v1}, La/h2k;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;B)V

    .line 581
    .line 582
    .line 583
    goto :goto_9

    .line 584
    :cond_d
    invoke-static {v1}, La/hny;->u(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    :goto_9
    return-object v5

    .line 588
    :pswitch_c
    move-object/from16 v0, p1

    .line 589
    .line 590
    check-cast v0, Ljava/lang/Integer;

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    move-object/from16 v0, p2

    .line 596
    .line 597
    check-cast v0, La/ooh0;

    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    instance-of v1, v0, La/koh0;

    .line 603
    .line 604
    if-eqz v1, :cond_e

    .line 605
    .line 606
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    move-result-object v5

    .line 610
    goto :goto_a

    .line 611
    :cond_e
    instance-of v1, v0, La/loh0;

    .line 612
    .line 613
    if-eqz v1, :cond_f

    .line 614
    .line 615
    check-cast v0, La/loh0;

    .line 616
    .line 617
    iget-object v5, v0, La/loh0;->a:La/ssh0;

    .line 618
    .line 619
    goto :goto_a

    .line 620
    :cond_f
    instance-of v1, v0, La/moh0;

    .line 621
    .line 622
    if-eqz v1, :cond_10

    .line 623
    .line 624
    check-cast v0, La/moh0;

    .line 625
    .line 626
    iget-object v5, v0, La/moh0;->a:La/ssh0;

    .line 627
    .line 628
    goto :goto_a

    .line 629
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 630
    .line 631
    .line 632
    :goto_a
    return-object v5

    .line 633
    :pswitch_d
    move-object/from16 v0, p1

    .line 634
    .line 635
    check-cast v0, Landroid/view/LayoutInflater;

    .line 636
    .line 637
    move-object/from16 v1, p2

    .line 638
    .line 639
    check-cast v1, Landroid/view/ViewGroup;

    .line 640
    .line 641
    const v2, 0x7f0d068d

    .line 642
    .line 643
    .line 644
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    const v1, 0x7f0a0db4

    .line 649
    .line 650
    .line 651
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    check-cast v2, Lorg/xplatform/uikit/components/cells/DsShimmerCell;

    .line 656
    .line 657
    if-eqz v2, :cond_11

    .line 658
    .line 659
    new-instance v5, La/cgu0;

    .line 660
    .line 661
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 662
    .line 663
    invoke-direct {v5, v0, v2}, La/cgu0;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/DsShimmerCell;)V

    .line 664
    .line 665
    .line 666
    goto :goto_b

    .line 667
    :cond_11
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    :goto_b
    return-object v5

    .line 683
    :pswitch_e
    move-object/from16 v0, p1

    .line 684
    .line 685
    check-cast v0, Ljava/lang/Throwable;

    .line 686
    .line 687
    move-object/from16 v1, p2

    .line 688
    .line 689
    check-cast v1, Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 698
    .line 699
    return-object v0

    .line 700
    :pswitch_f
    move-object/from16 v0, p1

    .line 701
    .line 702
    check-cast v0, Ljava/lang/Integer;

    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 705
    .line 706
    .line 707
    move-object/from16 v0, p2

    .line 708
    .line 709
    check-cast v0, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;

    .line 710
    .line 711
    sget-object v1, La/ljh0;->m2:La/lme0;

    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iget-object v0, v0, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;->a:Ljava/lang/String;

    .line 717
    .line 718
    return-object v0

    .line 719
    :pswitch_10
    move-object/from16 v0, p1

    .line 720
    .line 721
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 722
    .line 723
    move-object/from16 v1, p2

    .line 724
    .line 725
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 726
    .line 727
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    sget-object v2, La/qih0;->a:La/qih0;

    .line 734
    .line 735
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    new-instance v0, La/igh0;

    .line 739
    .line 740
    const/4 v2, 0x6

    .line 741
    invoke-direct {v0, v2}, La/igh0;-><init>(B)V

    .line 742
    .line 743
    .line 744
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 748
    .line 749
    return-object v0

    .line 750
    :pswitch_11
    move-object/from16 v0, p1

    .line 751
    .line 752
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 753
    .line 754
    move-object/from16 v1, p2

    .line 755
    .line 756
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 757
    .line 758
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    sget-object v2, La/pih0;->a:La/pih0;

    .line 765
    .line 766
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    new-instance v0, La/igh0;

    .line 770
    .line 771
    const/4 v2, 0x7

    .line 772
    invoke-direct {v0, v2}, La/igh0;-><init>(B)V

    .line 773
    .line 774
    .line 775
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 779
    .line 780
    return-object v0

    .line 781
    :pswitch_12
    move-object/from16 v0, p1

    .line 782
    .line 783
    check-cast v0, La/fet;

    .line 784
    .line 785
    move-object/from16 v1, p2

    .line 786
    .line 787
    check-cast v1, Ljava/lang/Integer;

    .line 788
    .line 789
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 790
    .line 791
    .line 792
    const v1, -0x65f7dc68

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 796
    .line 797
    .line 798
    new-instance v1, La/rah0;

    .line 799
    .line 800
    invoke-direct {v1, v6}, La/rah0;-><init>(I)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0, v6}, La/fet;->r(Z)V

    .line 804
    .line 805
    .line 806
    return-object v1

    .line 807
    :pswitch_13
    move-object/from16 v0, p1

    .line 808
    .line 809
    check-cast v0, La/azg0;

    .line 810
    .line 811
    move-object/from16 v0, p2

    .line 812
    .line 813
    check-cast v0, La/rah0;

    .line 814
    .line 815
    iget-object v0, v0, La/rah0;->a:La/cgk0;

    .line 816
    .line 817
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 818
    .line 819
    .line 820
    move-result v0

    .line 821
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    return-object v0

    .line 826
    :pswitch_14
    move-object/from16 v0, p1

    .line 827
    .line 828
    check-cast v0, La/azg0;

    .line 829
    .line 830
    move-object/from16 v0, p2

    .line 831
    .line 832
    check-cast v0, La/h9q0;

    .line 833
    .line 834
    iget v0, v0, La/h9q0;->a:I

    .line 835
    .line 836
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    return-object v0

    .line 841
    :pswitch_15
    move-object/from16 v0, p1

    .line 842
    .line 843
    check-cast v0, La/azg0;

    .line 844
    .line 845
    move-object/from16 v1, p2

    .line 846
    .line 847
    check-cast v1, La/i9q0;

    .line 848
    .line 849
    iget v2, v1, La/i9q0;->a:I

    .line 850
    .line 851
    new-instance v3, La/h9q0;

    .line 852
    .line 853
    invoke-direct {v3, v2}, La/h9q0;-><init>(I)V

    .line 854
    .line 855
    .line 856
    sget-object v2, La/gq80;->k:La/v0h0;

    .line 857
    .line 858
    invoke-static {v3, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    iget-boolean v1, v1, La/i9q0;->b:Z

    .line 863
    .line 864
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    return-object v0

    .line 877
    :pswitch_16
    move-object/from16 v0, p1

    .line 878
    .line 879
    check-cast v0, La/azg0;

    .line 880
    .line 881
    move-object/from16 v0, p2

    .line 882
    .line 883
    check-cast v0, La/p500;

    .line 884
    .line 885
    iget v0, v0, La/p500;->a:I

    .line 886
    .line 887
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    return-object v0

    .line 892
    :pswitch_17
    move-object/from16 v0, p1

    .line 893
    .line 894
    check-cast v0, La/azg0;

    .line 895
    .line 896
    move-object/from16 v0, p2

    .line 897
    .line 898
    check-cast v0, La/etn;

    .line 899
    .line 900
    iget v0, v0, La/etn;->a:I

    .line 901
    .line 902
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    return-object v0

    .line 907
    :pswitch_18
    move-object/from16 v0, p1

    .line 908
    .line 909
    check-cast v0, La/azg0;

    .line 910
    .line 911
    move-object/from16 v1, p2

    .line 912
    .line 913
    check-cast v1, La/ew90;

    .line 914
    .line 915
    iget-boolean v2, v1, La/ew90;->a:Z

    .line 916
    .line 917
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 918
    .line 919
    .line 920
    move-result-object v2

    .line 921
    sget-object v3, La/z0h0;->a:La/v0h0;

    .line 922
    .line 923
    iget v1, v1, La/ew90;->b:I

    .line 924
    .line 925
    new-instance v3, La/etn;

    .line 926
    .line 927
    invoke-direct {v3, v1}, La/etn;-><init>(I)V

    .line 928
    .line 929
    .line 930
    sget-object v1, La/gq80;->h:La/v0h0;

    .line 931
    .line 932
    invoke-static {v3, v1, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    return-object v0

    .line 945
    :pswitch_19
    move-object/from16 v0, p1

    .line 946
    .line 947
    check-cast v0, La/azg0;

    .line 948
    .line 949
    move-object/from16 v1, p2

    .line 950
    .line 951
    check-cast v1, La/f9q0;

    .line 952
    .line 953
    iget-object v2, v1, La/f9q0;->a:La/smk0;

    .line 954
    .line 955
    sget-object v3, La/z0h0;->h:La/v0h0;

    .line 956
    .line 957
    invoke-static {v2, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    iget-object v4, v1, La/f9q0;->b:La/smk0;

    .line 962
    .line 963
    invoke-static {v4, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    iget-object v5, v1, La/f9q0;->c:La/smk0;

    .line 968
    .line 969
    invoke-static {v5, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v5

    .line 973
    iget-object v1, v1, La/f9q0;->d:La/smk0;

    .line 974
    .line 975
    invoke-static {v1, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    filled-new-array {v2, v4, v5, v0}, [Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    return-object v0

    .line 988
    :pswitch_1a
    move-object/from16 v0, p1

    .line 989
    .line 990
    check-cast v0, La/azg0;

    .line 991
    .line 992
    move-object/from16 v1, p2

    .line 993
    .line 994
    check-cast v1, La/smk0;

    .line 995
    .line 996
    iget-object v2, v1, La/smk0;->a:La/e8q0;

    .line 997
    .line 998
    invoke-interface {v2}, La/e8q0;->h()J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v2

    .line 1002
    new-instance v4, La/y3d;

    .line 1003
    .line 1004
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 1005
    .line 1006
    .line 1007
    sget-object v2, La/z0h0;->p:La/y0h0;

    .line 1008
    .line 1009
    invoke-static {v4, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v5

    .line 1013
    iget-wide v3, v1, La/smk0;->b:J

    .line 1014
    .line 1015
    new-instance v6, La/daq0;

    .line 1016
    .line 1017
    invoke-direct {v6, v3, v4}, La/daq0;-><init>(J)V

    .line 1018
    .line 1019
    .line 1020
    sget-object v3, La/z0h0;->v:La/y0h0;

    .line 1021
    .line 1022
    invoke-static {v6, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v6

    .line 1026
    iget-object v4, v1, La/smk0;->c:La/psq;

    .line 1027
    .line 1028
    sget-object v7, La/psq;->b:La/psq;

    .line 1029
    .line 1030
    sget-object v7, La/z0h0;->m:La/v0h0;

    .line 1031
    .line 1032
    invoke-static {v4, v7, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v7

    .line 1036
    iget-object v4, v1, La/smk0;->d:La/lsq;

    .line 1037
    .line 1038
    sget-object v8, La/z0h0;->t:La/v0h0;

    .line 1039
    .line 1040
    invoke-static {v4, v8, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v8

    .line 1044
    iget-object v4, v1, La/smk0;->e:La/msq;

    .line 1045
    .line 1046
    sget-object v9, La/z0h0;->u:La/v0h0;

    .line 1047
    .line 1048
    invoke-static {v4, v9, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v9

    .line 1052
    const/4 v4, -0x1

    .line 1053
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v10

    .line 1057
    iget-object v11, v1, La/smk0;->g:Ljava/lang/String;

    .line 1058
    .line 1059
    iget-wide v12, v1, La/smk0;->h:J

    .line 1060
    .line 1061
    new-instance v4, La/daq0;

    .line 1062
    .line 1063
    invoke-direct {v4, v12, v13}, La/daq0;-><init>(J)V

    .line 1064
    .line 1065
    .line 1066
    invoke-static {v4, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v12

    .line 1070
    iget-object v3, v1, La/smk0;->i:La/j56;

    .line 1071
    .line 1072
    sget-object v4, La/z0h0;->n:La/v0h0;

    .line 1073
    .line 1074
    invoke-static {v3, v4, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v13

    .line 1078
    iget-object v3, v1, La/smk0;->j:La/f8q0;

    .line 1079
    .line 1080
    sget-object v4, La/z0h0;->k:La/v0h0;

    .line 1081
    .line 1082
    invoke-static {v3, v4, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v14

    .line 1086
    iget-object v3, v1, La/smk0;->k:La/rs00;

    .line 1087
    .line 1088
    sget-object v4, La/rs00;->c:La/rs00;

    .line 1089
    .line 1090
    sget-object v4, La/z0h0;->y:La/v0h0;

    .line 1091
    .line 1092
    invoke-static {v3, v4, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v15

    .line 1096
    iget-wide v3, v1, La/smk0;->l:J

    .line 1097
    .line 1098
    move-object/from16 p0, v5

    .line 1099
    .line 1100
    new-instance v5, La/y3d;

    .line 1101
    .line 1102
    invoke-direct {v5, v3, v4}, La/y3d;-><init>(J)V

    .line 1103
    .line 1104
    .line 1105
    invoke-static {v5, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v16

    .line 1109
    iget-object v2, v1, La/smk0;->m:La/k5q0;

    .line 1110
    .line 1111
    sget-object v3, La/z0h0;->j:La/v0h0;

    .line 1112
    .line 1113
    invoke-static {v2, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v17

    .line 1117
    iget-object v1, v1, La/smk0;->n:La/ljj0;

    .line 1118
    .line 1119
    sget-object v2, La/ljj0;->d:La/ljj0;

    .line 1120
    .line 1121
    sget-object v2, La/z0h0;->o:La/v0h0;

    .line 1122
    .line 1123
    invoke-static {v1, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v18

    .line 1127
    move-object/from16 v5, p0

    .line 1128
    .line 1129
    filled-new-array/range {v5 .. v18}, [Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    return-object v0

    .line 1138
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1139
    .line 1140
    check-cast v0, La/azg0;

    .line 1141
    .line 1142
    move-object/from16 v0, p2

    .line 1143
    .line 1144
    check-cast v0, La/cot0;

    .line 1145
    .line 1146
    iget-object v0, v0, La/cot0;->a:Ljava/lang/String;

    .line 1147
    .line 1148
    return-object v0

    .line 1149
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1150
    .line 1151
    check-cast v0, La/azg0;

    .line 1152
    .line 1153
    move-object/from16 v1, p2

    .line 1154
    .line 1155
    check-cast v1, La/eo80;

    .line 1156
    .line 1157
    iget v2, v1, La/eo80;->a:I

    .line 1158
    .line 1159
    new-instance v3, La/f2q0;

    .line 1160
    .line 1161
    invoke-direct {v3, v2}, La/f2q0;-><init>(I)V

    .line 1162
    .line 1163
    .line 1164
    sget-object v2, La/z0h0;->q:La/y0h0;

    .line 1165
    .line 1166
    invoke-static {v3, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v4

    .line 1170
    iget v2, v1, La/eo80;->b:I

    .line 1171
    .line 1172
    new-instance v3, La/n5q0;

    .line 1173
    .line 1174
    invoke-direct {v3, v2}, La/n5q0;-><init>(I)V

    .line 1175
    .line 1176
    .line 1177
    sget-object v2, La/z0h0;->r:La/y0h0;

    .line 1178
    .line 1179
    invoke-static {v3, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v5

    .line 1183
    iget-wide v2, v1, La/eo80;->c:J

    .line 1184
    .line 1185
    new-instance v6, La/daq0;

    .line 1186
    .line 1187
    invoke-direct {v6, v2, v3}, La/daq0;-><init>(J)V

    .line 1188
    .line 1189
    .line 1190
    sget-object v2, La/z0h0;->v:La/y0h0;

    .line 1191
    .line 1192
    invoke-static {v6, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v6

    .line 1196
    iget-object v2, v1, La/eo80;->d:La/g8q0;

    .line 1197
    .line 1198
    sget-object v3, La/g8q0;->c:La/g8q0;

    .line 1199
    .line 1200
    sget-object v3, La/z0h0;->l:La/v0h0;

    .line 1201
    .line 1202
    invoke-static {v2, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v7

    .line 1206
    iget-object v2, v1, La/eo80;->e:La/ew90;

    .line 1207
    .line 1208
    sget-object v3, La/gq80;->g:La/v0h0;

    .line 1209
    .line 1210
    invoke-static {v2, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v8

    .line 1214
    iget-object v2, v1, La/eo80;->f:La/m600;

    .line 1215
    .line 1216
    sget-object v3, La/m600;->d:La/m600;

    .line 1217
    .line 1218
    sget-object v3, La/z0h0;->A:La/v0h0;

    .line 1219
    .line 1220
    invoke-static {v2, v3, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v9

    .line 1224
    iget v2, v1, La/eo80;->g:I

    .line 1225
    .line 1226
    new-instance v3, La/p500;

    .line 1227
    .line 1228
    invoke-direct {v3, v2}, La/p500;-><init>(I)V

    .line 1229
    .line 1230
    .line 1231
    sget-object v2, La/gq80;->i:La/v0h0;

    .line 1232
    .line 1233
    invoke-static {v3, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v10

    .line 1237
    iget v2, v1, La/eo80;->h:I

    .line 1238
    .line 1239
    new-instance v3, La/fuw;

    .line 1240
    .line 1241
    invoke-direct {v3, v2}, La/fuw;-><init>(I)V

    .line 1242
    .line 1243
    .line 1244
    sget-object v2, La/z0h0;->s:La/y0h0;

    .line 1245
    .line 1246
    invoke-static {v3, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v11

    .line 1250
    iget-object v1, v1, La/eo80;->i:La/i9q0;

    .line 1251
    .line 1252
    sget-object v2, La/gq80;->j:La/v0h0;

    .line 1253
    .line 1254
    invoke-static {v1, v2, v0}, La/z0h0;->a(Ljava/lang/Object;La/u0h0;La/azg0;)Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v12

    .line 1258
    filled-new-array/range {v4 .. v12}, [Ljava/lang/Object;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    return-object v0

    .line 1267
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
