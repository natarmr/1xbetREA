.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# instance fields
.field public final q:La/ibo;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/List;

.field public final u:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 457
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 456
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v0, p2

    .line 11
    .line 12
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v3, 0x7f040358

    .line 16
    .line 17
    .line 18
    move-object/from16 v4, p1

    .line 19
    .line 20
    invoke-direct {v1, v4, v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v3, 0x7f0d01af

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    const v0, 0x7f0a0414

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Landroid/widget/ImageView;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const v0, 0x7f0a0415

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Landroid/widget/ImageView;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const v0, 0x7f0a0416

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Landroid/widget/ImageView;

    .line 63
    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    const v0, 0x7f0a0417

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Landroid/widget/ImageView;

    .line 74
    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    const v0, 0x7f0a0418

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Landroid/widget/ImageView;

    .line 85
    .line 86
    if-eqz v7, :cond_1

    .line 87
    .line 88
    const v0, 0x7f0a0419

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, Landroid/widget/ImageView;

    .line 96
    .line 97
    if-eqz v8, :cond_1

    .line 98
    .line 99
    const v0, 0x7f0a041a

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    check-cast v9, Landroid/widget/ImageView;

    .line 107
    .line 108
    if-eqz v9, :cond_1

    .line 109
    .line 110
    const v0, 0x7f0a041b

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    check-cast v10, Landroid/widget/ImageView;

    .line 118
    .line 119
    if-eqz v10, :cond_1

    .line 120
    .line 121
    const v0, 0x7f0a041c

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    check-cast v11, Landroid/widget/ImageView;

    .line 129
    .line 130
    if-eqz v11, :cond_1

    .line 131
    .line 132
    const v0, 0x7f0a041d

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    check-cast v12, Landroid/widget/ImageView;

    .line 140
    .line 141
    if-eqz v12, :cond_1

    .line 142
    .line 143
    const v0, 0x7f0a0422

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    check-cast v13, Landroid/widget/TextView;

    .line 151
    .line 152
    if-eqz v13, :cond_1

    .line 153
    .line 154
    const v0, 0x7f0a07d4

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    check-cast v14, Landroid/widget/TextView;

    .line 162
    .line 163
    if-eqz v14, :cond_1

    .line 164
    .line 165
    const v0, 0x7f0a0b4a

    .line 166
    .line 167
    .line 168
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    check-cast v15, Landroid/widget/ImageView;

    .line 173
    .line 174
    if-eqz v15, :cond_1

    .line 175
    .line 176
    const v0, 0x7f0a0b4b

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v16

    .line 183
    check-cast v16, Landroid/widget/ImageView;

    .line 184
    .line 185
    if-eqz v16, :cond_1

    .line 186
    .line 187
    const v0, 0x7f0a0b4c

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v17

    .line 194
    check-cast v17, Landroid/widget/ImageView;

    .line 195
    .line 196
    if-eqz v17, :cond_1

    .line 197
    .line 198
    const v0, 0x7f0a0b4d

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v18

    .line 205
    check-cast v18, Landroid/widget/ImageView;

    .line 206
    .line 207
    if-eqz v18, :cond_1

    .line 208
    .line 209
    const v0, 0x7f0a0b4e

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v19

    .line 216
    check-cast v19, Landroid/widget/ImageView;

    .line 217
    .line 218
    if-eqz v19, :cond_1

    .line 219
    .line 220
    const v0, 0x7f0a0b4f

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v20

    .line 227
    check-cast v20, Landroid/widget/ImageView;

    .line 228
    .line 229
    if-eqz v20, :cond_1

    .line 230
    .line 231
    const v0, 0x7f0a0b50

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v21

    .line 238
    check-cast v21, Landroid/widget/ImageView;

    .line 239
    .line 240
    if-eqz v21, :cond_1

    .line 241
    .line 242
    const v0, 0x7f0a0b51

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v22

    .line 249
    check-cast v22, Landroid/widget/ImageView;

    .line 250
    .line 251
    if-eqz v22, :cond_1

    .line 252
    .line 253
    const v0, 0x7f0a0b52

    .line 254
    .line 255
    .line 256
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v23

    .line 260
    check-cast v23, Landroid/widget/ImageView;

    .line 261
    .line 262
    if-eqz v23, :cond_1

    .line 263
    .line 264
    const v0, 0x7f0a0b53

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v24

    .line 271
    check-cast v24, Landroid/widget/ImageView;

    .line 272
    .line 273
    if-eqz v24, :cond_1

    .line 274
    .line 275
    const v0, 0x7f0a0b60

    .line 276
    .line 277
    .line 278
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object v25

    .line 282
    check-cast v25, Landroid/widget/TextView;

    .line 283
    .line 284
    if-eqz v25, :cond_1

    .line 285
    .line 286
    const v0, 0x7f0a0cd3

    .line 287
    .line 288
    .line 289
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 290
    .line 291
    .line 292
    move-result-object v26

    .line 293
    check-cast v26, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 294
    .line 295
    if-eqz v26, :cond_1

    .line 296
    .line 297
    const v0, 0x7f0a1452

    .line 298
    .line 299
    .line 300
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object v27

    .line 304
    check-cast v27, Landroid/widget/TextView;

    .line 305
    .line 306
    if-eqz v27, :cond_1

    .line 307
    .line 308
    new-instance v0, La/ibo;

    .line 309
    .line 310
    move-object v2, v3

    .line 311
    move-object v3, v4

    .line 312
    move-object v4, v5

    .line 313
    move-object v5, v6

    .line 314
    move-object v6, v7

    .line 315
    move-object v7, v8

    .line 316
    move-object v8, v9

    .line 317
    move-object v9, v10

    .line 318
    move-object v10, v11

    .line 319
    move-object v11, v12

    .line 320
    move-object v12, v13

    .line 321
    move-object v13, v14

    .line 322
    move-object v14, v15

    .line 323
    move-object/from16 v15, v16

    .line 324
    .line 325
    move-object/from16 v16, v17

    .line 326
    .line 327
    move-object/from16 v17, v18

    .line 328
    .line 329
    move-object/from16 v18, v19

    .line 330
    .line 331
    move-object/from16 v19, v20

    .line 332
    .line 333
    move-object/from16 v20, v21

    .line 334
    .line 335
    move-object/from16 v21, v22

    .line 336
    .line 337
    move-object/from16 v22, v23

    .line 338
    .line 339
    move-object/from16 v23, v24

    .line 340
    .line 341
    move-object/from16 v24, v25

    .line 342
    .line 343
    move-object/from16 v25, v26

    .line 344
    .line 345
    move-object/from16 v26, v27

    .line 346
    .line 347
    invoke-direct/range {v0 .. v26}, La/ibo;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/score/SportScore;Landroid/widget/TextView;)V

    .line 348
    .line 349
    .line 350
    move-object/from16 v12, v17

    .line 351
    .line 352
    move-object/from16 v13, v18

    .line 353
    .line 354
    move-object/from16 v17, v8

    .line 355
    .line 356
    move-object/from16 v18, v9

    .line 357
    .line 358
    move-object/from16 v8, v20

    .line 359
    .line 360
    move-object/from16 v9, v21

    .line 361
    .line 362
    move-object/from16 v21, v2

    .line 363
    .line 364
    move-object/from16 v20, v11

    .line 365
    .line 366
    move-object/from16 v11, v23

    .line 367
    .line 368
    move-object v2, v0

    .line 369
    move-object/from16 v0, v16

    .line 370
    .line 371
    move-object/from16 v16, v7

    .line 372
    .line 373
    move-object/from16 v7, v19

    .line 374
    .line 375
    move-object/from16 v19, v10

    .line 376
    .line 377
    move-object/from16 v10, v22

    .line 378
    .line 379
    iput-object v2, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->q:La/ibo;

    .line 380
    .line 381
    const/4 v2, 0x0

    .line 382
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 383
    .line 384
    .line 385
    filled-new-array {v14, v15, v0, v12, v13}, [Landroid/widget/ImageView;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->r:Ljava/util/List;

    .line 394
    .line 395
    filled-new-array {v7, v8, v9, v10, v11}, [Landroid/widget/ImageView;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->s:Ljava/util/List;

    .line 404
    .line 405
    move-object/from16 v2, v21

    .line 406
    .line 407
    filled-new-array {v2, v3, v4, v5, v6}, [Landroid/widget/ImageView;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->t:Ljava/util/List;

    .line 416
    .line 417
    move-object/from16 v7, v16

    .line 418
    .line 419
    move-object/from16 v8, v17

    .line 420
    .line 421
    move-object/from16 v9, v18

    .line 422
    .line 423
    move-object/from16 v10, v19

    .line 424
    .line 425
    move-object/from16 v11, v20

    .line 426
    .line 427
    filled-new-array {v7, v8, v9, v10, v11}, [Landroid/widget/ImageView;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->u:Ljava/util/List;

    .line 436
    .line 437
    return-void

    .line 438
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    const-string v1, "Missing required view with ID: "

    .line 447
    .line 448
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    throw v2
.end method

.method public static u(Ljava/util/List;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    add-int/lit8 v3, v1, 0x1

    .line 18
    .line 19
    if-ltz v1, :cond_2

    .line 20
    .line 21
    check-cast v2, Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-static {p0}, La/q3d;->i(Ljava/util/List;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-gt v1, v4, :cond_0

    .line 28
    .line 29
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, La/laa;

    .line 34
    .line 35
    iget v4, v4, La/laa;->a:I

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    add-int/lit8 v4, v4, -0x1

    .line 45
    .line 46
    if-gt v1, v4, :cond_1

    .line 47
    .line 48
    move v1, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/16 v1, 0x8

    .line 51
    .line 52
    :goto_1
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    move v1, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    throw p0

    .line 62
    :cond_3
    return-void
.end method


# virtual methods
.method public final getBinding()La/ibo;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->q:La/ibo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setDealer1RowCards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/laa;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->t:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->u(Ljava/util/List;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setDealer2RowCards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/laa;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->u:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->u(Ljava/util/List;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setDealerName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->q:La/ibo;

    .line 2
    .line 3
    iget-object p0, p0, La/ibo;->b:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setInformation(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->q:La/ibo;

    .line 2
    .line 3
    iget-object v0, p0, La/ibo;->c:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v1, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/ibo;->c:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setPlayer1RowCards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/laa;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->r:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->u(Ljava/util/List;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setPlayer2RowCards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/laa;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->s:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->u(Ljava/util/List;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setPlayerName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->q:La/ibo;

    .line 2
    .line 3
    iget-object p0, p0, La/ibo;->d:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setScoreModel(La/p5h0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->q:La/ibo;

    .line 5
    .line 6
    iget-object p0, p0, La/ibo;->e:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/score/SportScore;->setScore(La/p5h0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setWinInformation(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleSette;->q:La/ibo;

    .line 2
    .line 3
    iget-object v0, p0, La/ibo;->f:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v1, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/ibo;->f:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
