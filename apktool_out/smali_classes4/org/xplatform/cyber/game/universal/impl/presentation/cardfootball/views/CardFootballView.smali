.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final q:La/z0o0;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/HashMap;

.field public u:Z

.field public final v:Landroid/graphics/drawable/TransitionDrawable;

.field public final w:Landroid/graphics/drawable/TransitionDrawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 476
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 475
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    and-int/lit8 v3, p3, 0x2

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v3, p2

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-direct {v1, v0, v3, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const v5, 0x7f0d05b4

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v5, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    const v3, 0x7f0a0303

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    const v3, 0x7f0a0314

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 51
    .line 52
    const v3, 0x7f0a0386

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 60
    .line 61
    const v3, 0x7f0a0575

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 69
    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    const v3, 0x7f0a057f

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 80
    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    const v3, 0x7f0a0845

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Landroid/widget/ImageView;

    .line 91
    .line 92
    if-eqz v7, :cond_1

    .line 93
    .line 94
    const v3, 0x7f0a0846

    .line 95
    .line 96
    .line 97
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Landroid/widget/ImageView;

    .line 102
    .line 103
    if-eqz v8, :cond_1

    .line 104
    .line 105
    const v3, 0x7f0a084d

    .line 106
    .line 107
    .line 108
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    check-cast v9, Landroid/widget/ImageView;

    .line 113
    .line 114
    if-eqz v9, :cond_1

    .line 115
    .line 116
    const v3, 0x7f0a08a7

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    check-cast v10, Landroid/widget/ImageView;

    .line 124
    .line 125
    if-eqz v10, :cond_1

    .line 126
    .line 127
    const v3, 0x7f0a08a8

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    check-cast v11, Landroid/widget/ImageView;

    .line 135
    .line 136
    if-eqz v11, :cond_1

    .line 137
    .line 138
    const v3, 0x7f0a08ae

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    check-cast v12, Landroid/widget/ImageView;

    .line 146
    .line 147
    if-eqz v12, :cond_1

    .line 148
    .line 149
    const v3, 0x7f0a0991

    .line 150
    .line 151
    .line 152
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    check-cast v13, Landroid/widget/LinearLayout;

    .line 157
    .line 158
    if-eqz v13, :cond_1

    .line 159
    .line 160
    const v3, 0x7f0a09a0

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    check-cast v14, Landroid/widget/LinearLayout;

    .line 168
    .line 169
    if-eqz v14, :cond_1

    .line 170
    .line 171
    const v3, 0x7f0a0d0b

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    check-cast v15, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 179
    .line 180
    if-eqz v15, :cond_1

    .line 181
    .line 182
    const v3, 0x7f0a0d15

    .line 183
    .line 184
    .line 185
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object v16

    .line 189
    check-cast v16, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 190
    .line 191
    if-eqz v16, :cond_1

    .line 192
    .line 193
    const v3, 0x7f0a0ecb

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 197
    .line 198
    .line 199
    move-result-object v17

    .line 200
    check-cast v17, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 201
    .line 202
    if-eqz v17, :cond_1

    .line 203
    .line 204
    const v3, 0x7f0a0f9c

    .line 205
    .line 206
    .line 207
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v18

    .line 211
    check-cast v18, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 212
    .line 213
    if-eqz v18, :cond_1

    .line 214
    .line 215
    const v3, 0x7f0a104e

    .line 216
    .line 217
    .line 218
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v19

    .line 222
    check-cast v19, Landroid/widget/TextView;

    .line 223
    .line 224
    if-eqz v19, :cond_1

    .line 225
    .line 226
    const v3, 0x7f0a1051

    .line 227
    .line 228
    .line 229
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object v20

    .line 233
    check-cast v20, Landroid/widget/TextView;

    .line 234
    .line 235
    if-eqz v20, :cond_1

    .line 236
    .line 237
    const v3, 0x7f0a10e1

    .line 238
    .line 239
    .line 240
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v21

    .line 244
    check-cast v21, Landroid/widget/TextView;

    .line 245
    .line 246
    if-eqz v21, :cond_1

    .line 247
    .line 248
    const v3, 0x7f0a10ec

    .line 249
    .line 250
    .line 251
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v22

    .line 255
    check-cast v22, Landroid/widget/TextView;

    .line 256
    .line 257
    if-eqz v22, :cond_1

    .line 258
    .line 259
    const v3, 0x7f0a1109

    .line 260
    .line 261
    .line 262
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v23

    .line 266
    check-cast v23, Landroid/widget/TextView;

    .line 267
    .line 268
    if-eqz v23, :cond_1

    .line 269
    .line 270
    const v3, 0x7f0a110b

    .line 271
    .line 272
    .line 273
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v24

    .line 277
    check-cast v24, Landroid/widget/TextView;

    .line 278
    .line 279
    if-eqz v24, :cond_1

    .line 280
    .line 281
    const v3, 0x7f0a114c

    .line 282
    .line 283
    .line 284
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v25

    .line 288
    check-cast v25, Landroid/widget/TextView;

    .line 289
    .line 290
    if-eqz v25, :cond_1

    .line 291
    .line 292
    const v3, 0x7f0a11f5

    .line 293
    .line 294
    .line 295
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 296
    .line 297
    .line 298
    move-result-object v26

    .line 299
    check-cast v26, Landroid/widget/TextView;

    .line 300
    .line 301
    if-eqz v26, :cond_1

    .line 302
    .line 303
    const v3, 0x7f0a11f7

    .line 304
    .line 305
    .line 306
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 307
    .line 308
    .line 309
    move-result-object v27

    .line 310
    check-cast v27, Landroid/widget/TextView;

    .line 311
    .line 312
    if-eqz v27, :cond_1

    .line 313
    .line 314
    const v3, 0x7f0a122f

    .line 315
    .line 316
    .line 317
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 318
    .line 319
    .line 320
    move-result-object v28

    .line 321
    check-cast v28, Landroid/widget/TextView;

    .line 322
    .line 323
    if-eqz v28, :cond_1

    .line 324
    .line 325
    new-instance v0, La/z0o0;

    .line 326
    .line 327
    move-object v2, v5

    .line 328
    move-object v3, v6

    .line 329
    move-object v4, v7

    .line 330
    move-object v5, v8

    .line 331
    move-object v6, v9

    .line 332
    move-object v7, v10

    .line 333
    move-object v8, v11

    .line 334
    move-object v9, v12

    .line 335
    move-object v10, v13

    .line 336
    move-object v11, v14

    .line 337
    move-object v12, v15

    .line 338
    move-object/from16 v13, v16

    .line 339
    .line 340
    move-object/from16 v14, v17

    .line 341
    .line 342
    move-object/from16 v15, v18

    .line 343
    .line 344
    move-object/from16 v16, v19

    .line 345
    .line 346
    move-object/from16 v17, v20

    .line 347
    .line 348
    move-object/from16 v18, v21

    .line 349
    .line 350
    move-object/from16 v19, v22

    .line 351
    .line 352
    move-object/from16 v20, v23

    .line 353
    .line 354
    move-object/from16 v21, v24

    .line 355
    .line 356
    move-object/from16 v22, v25

    .line 357
    .line 358
    move-object/from16 v23, v26

    .line 359
    .line 360
    move-object/from16 v24, v27

    .line 361
    .line 362
    move-object/from16 v25, v28

    .line 363
    .line 364
    invoke-direct/range {v0 .. v25}, La/z0o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 365
    .line 366
    .line 367
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->q:La/z0o0;

    .line 368
    .line 369
    filled-new-array {v4, v6, v5}, [Landroid/widget/ImageView;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->r:Ljava/util/List;

    .line 378
    .line 379
    filled-new-array {v7, v9, v8}, [Landroid/widget/ImageView;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->s:Ljava/util/List;

    .line 388
    .line 389
    new-instance v0, Ljava/util/HashMap;

    .line 390
    .line 391
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 392
    .line 393
    .line 394
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->t:Ljava/util/HashMap;

    .line 395
    .line 396
    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    .line 397
    .line 398
    const v3, 0x7f0803da

    .line 399
    .line 400
    .line 401
    move-object/from16 v4, p1

    .line 402
    .line 403
    invoke-virtual {v4, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    const v6, 0x7f0803db

    .line 408
    .line 409
    .line 410
    invoke-virtual {v4, v6}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    filled-new-array {v5, v7}, [Landroid/graphics/drawable/Drawable;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    invoke-direct {v0, v5}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 419
    .line 420
    .line 421
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->v:Landroid/graphics/drawable/TransitionDrawable;

    .line 422
    .line 423
    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    .line 424
    .line 425
    invoke-virtual {v4, v6}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    invoke-virtual {v4, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    filled-new-array {v5, v3}, [Landroid/graphics/drawable/Drawable;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-direct {v0, v3}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 438
    .line 439
    .line 440
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->w:Landroid/graphics/drawable/TransitionDrawable;

    .line 441
    .line 442
    sget-object v0, La/fha;->c:La/bj5;

    .line 443
    .line 444
    const/4 v0, 0x1

    .line 445
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->setAttackNumberText$impl(I)V

    .line 446
    .line 447
    .line 448
    const/4 v0, 0x2

    .line 449
    invoke-virtual {v12, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->setAttackNumberText$impl(I)V

    .line 450
    .line 451
    .line 452
    const/4 v0, 0x3

    .line 453
    invoke-virtual {v15, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->setAttackNumberText$impl(I)V

    .line 454
    .line 455
    .line 456
    return-void

    .line 457
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    const-string v1, "Missing required view with ID: "

    .line 466
    .line 467
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    throw v4
.end method

.method private final setDefenderTitles(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const v1, 0x7f131466

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const v1, 0x7f131465

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const p1, 0x7f131468

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const p1, 0x7f131467

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->q:La/z0o0;

    .line 42
    .line 43
    iget-object v1, p0, La/z0o0;->k:Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/z0o0;->l:Landroid/widget/TextView;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/z0o0;->p:Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "super"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "attack"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast p1, Ljava/util/HashMap;

    .line 23
    .line 24
    iget-object v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->t:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->u:Z

    .line 31
    .line 32
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "attack"

    .line 7
    .line 8
    iget-object v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->t:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "super"

    .line 14
    .line 15
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final setFirstPeriod$impl(La/mha;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->q:La/z0o0;

    .line 5
    .line 6
    iget-object v1, v0, La/z0o0;->o:Landroid/widget/TextView;

    .line 7
    .line 8
    iget-object v2, p1, La/mha;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/z0o0;->o:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget v2, p1, La/mha;->c:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget p1, p1, La/mha;->b:I

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final setSecondPeriod$impl(La/mha;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->q:La/z0o0;

    .line 5
    .line 6
    iget-object v1, v0, La/z0o0;->r:Landroid/widget/TextView;

    .line 7
    .line 8
    iget-object v2, p1, La/mha;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/z0o0;->r:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget v2, p1, La/mha;->c:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget p1, p1, La/mha;->b:I

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final u(Landroid/widget/TextView;Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, La/gia;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/gia;

    .line 7
    .line 8
    iget v1, v0, La/gia;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/gia;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gia;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/gia;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/gia;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gia;->n:I

    .line 30
    .line 31
    const-wide/16 v3, 0x1f4

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    const/16 v7, 0x1f4

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v6, :cond_2

    .line 40
    .line 41
    if-ne v2, v5, :cond_1

    .line 42
    .line 43
    iget p1, v0, La/gia;->k:I

    .line 44
    .line 45
    iget-object p2, v0, La/gia;->j:Ljava/util/List;

    .line 46
    .line 47
    iget-object v2, v0, La/gia;->i:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_2
    iget p1, v0, La/gia;->k:I

    .line 62
    .line 63
    iget-object p2, v0, La/gia;->j:Ljava/util/List;

    .line 64
    .line 65
    iget-object v2, v0, La/gia;->i:Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 p3, 0x0

    .line 75
    :goto_1
    const/4 v2, 0x5

    .line 76
    if-ge p3, v2, :cond_8

    .line 77
    .line 78
    iget-object v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->v:Landroid/graphics/drawable/TransitionDrawable;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-eqz v9, :cond_4

    .line 92
    .line 93
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    check-cast v9, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 98
    .line 99
    iget-object v10, v9, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->q:La/vd7;

    .line 100
    .line 101
    iget-object v10, v10, La/vd7;->d:Landroid/view/View;

    .line 102
    .line 103
    check-cast v10, Landroid/widget/ImageView;

    .line 104
    .line 105
    iget-object v9, v9, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->x:Landroid/graphics/drawable/TransitionDrawable;

    .line 106
    .line 107
    invoke-virtual {v10, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, v7}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-virtual {v2, v7}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 115
    .line 116
    .line 117
    iput-object p1, v0, La/gia;->i:Landroid/widget/TextView;

    .line 118
    .line 119
    iput-object p2, v0, La/gia;->j:Ljava/util/List;

    .line 120
    .line 121
    iput p3, v0, La/gia;->k:I

    .line 122
    .line 123
    iput v6, v0, La/gia;->n:I

    .line 124
    .line 125
    invoke-static {v3, v4, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-ne v2, v1, :cond_5

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    move-object v2, p1

    .line 133
    move p1, p3

    .line 134
    :goto_3
    iget-object p3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->w:Landroid/graphics/drawable/TransitionDrawable;

    .line 135
    .line 136
    invoke-virtual {v2, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_6

    .line 148
    .line 149
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    check-cast v9, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 154
    .line 155
    iget-object v10, v9, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->q:La/vd7;

    .line 156
    .line 157
    iget-object v10, v10, La/vd7;->d:Landroid/view/View;

    .line 158
    .line 159
    check-cast v10, Landroid/widget/ImageView;

    .line 160
    .line 161
    iget-object v9, v9, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->y:Landroid/graphics/drawable/TransitionDrawable;

    .line 162
    .line 163
    invoke-virtual {v10, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9, v7}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_6
    invoke-virtual {p3, v7}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 171
    .line 172
    .line 173
    iput-object v2, v0, La/gia;->i:Landroid/widget/TextView;

    .line 174
    .line 175
    iput-object p2, v0, La/gia;->j:Ljava/util/List;

    .line 176
    .line 177
    iput p1, v0, La/gia;->k:I

    .line 178
    .line 179
    iput v5, v0, La/gia;->n:I

    .line 180
    .line 181
    invoke-static {v3, v4, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p3

    .line 185
    if-ne p3, v1, :cond_7

    .line 186
    .line 187
    :goto_5
    return-object v1

    .line 188
    :cond_7
    :goto_6
    add-int/lit8 p3, p1, 0x1

    .line 189
    .line 190
    move-object p1, v2

    .line 191
    goto :goto_1

    .line 192
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p0
.end method

.method public final v(La/gha;La/tkz;Z)V
    .locals 6

    .line 1
    iget-object v0, p1, La/gha;->a:La/xha;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->t:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, La/xha;

    .line 37
    .line 38
    iget-object v3, v3, La/xha;->c:La/fha;

    .line 39
    .line 40
    iget-byte v3, v3, La/fha;->b:B

    .line 41
    .line 42
    iget-object v4, v0, La/xha;->c:La/fha;

    .line 43
    .line 44
    iget-byte v4, v4, La/fha;->b:B

    .line 45
    .line 46
    if-eq v3, v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    iget-boolean v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->u:Z

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    iput-boolean v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->u:Z

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/util/Map$Entry;

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, La/xha;

    .line 83
    .line 84
    new-instance v4, La/eha;

    .line 85
    .line 86
    sget-object v5, La/dha;->d:La/dha;

    .line 87
    .line 88
    invoke-direct {v4, v5}, La/eha;-><init>(La/dha;)V

    .line 89
    .line 90
    .line 91
    const/4 v5, 0x1

    .line 92
    invoke-virtual {p0, v3, v4, v5, p2}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->w(La/xha;La/eha;ZLa/tkz;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    iget-object v2, v0, La/xha;->c:La/fha;

    .line 97
    .line 98
    iget-byte v2, v2, La/fha;->a:B

    .line 99
    .line 100
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    iget-object p1, p1, La/gha;->b:La/eha;

    .line 108
    .line 109
    invoke-virtual {p0, v0, p1, p3, p2}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->w(La/xha;La/eha;ZLa/tkz;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final w(La/xha;La/eha;ZLa/tkz;)V
    .locals 13

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    iget-object v1, p1, La/xha;->c:La/fha;

    .line 4
    .line 5
    sget-object v2, La/fha;->d:La/fha;

    .line 6
    .line 7
    iget-object v3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->q:La/z0o0;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object p0, v3, La/z0o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->u()V

    .line 14
    .line 15
    .line 16
    iget-object p0, v3, La/z0o0;->f:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->u()V

    .line 19
    .line 20
    .line 21
    iget-object p0, v3, La/z0o0;->i:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->u()V

    .line 24
    .line 25
    .line 26
    iget-object p0, v3, La/z0o0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 27
    .line 28
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->u()V

    .line 29
    .line 30
    .line 31
    iget-object p0, v3, La/z0o0;->g:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 32
    .line 33
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->u()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x1

    .line 42
    if-eq v1, v2, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    if-eq v1, v2, :cond_1

    .line 46
    .line 47
    const/4 v2, 0x4

    .line 48
    if-eq v1, v2, :cond_2

    .line 49
    .line 50
    const/4 v2, 0x5

    .line 51
    if-eq v1, v2, :cond_1

    .line 52
    .line 53
    iget-object v1, v3, La/z0o0;->i:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v1, v3, La/z0o0;->f:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    iget-object v1, v3, La/z0o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;

    .line 60
    .line 61
    :goto_0
    iget-object v2, p1, La/xha;->b:Ljava/util/ArrayList;

    .line 62
    .line 63
    iget-object p1, p1, La/xha;->a:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    const/4 v5, 0x0

    .line 70
    move v6, v5

    .line 71
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const/4 v8, 0x0

    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    add-int/lit8 v9, v6, 0x1

    .line 83
    .line 84
    if-ltz v6, :cond_3

    .line 85
    .line 86
    check-cast v7, La/cha;

    .line 87
    .line 88
    iget-object v8, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->r:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    check-cast v8, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 95
    .line 96
    invoke-virtual {v8, v7, v6, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;->v(La/cha;IZ)V

    .line 97
    .line 98
    .line 99
    move v6, v9

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 102
    .line 103
    .line 104
    throw v8

    .line 105
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_6

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    add-int/lit8 v7, v5, 0x1

    .line 120
    .line 121
    if-ltz v5, :cond_5

    .line 122
    .line 123
    check-cast v6, La/cha;

    .line 124
    .line 125
    iget-object v9, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballPeriodView;->s:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    check-cast v9, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;

    .line 132
    .line 133
    invoke-virtual {v9, v6, v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballAttackCardView;->v(La/cha;IZ)V

    .line 134
    .line 135
    .line 136
    move v5, v7

    .line 137
    goto :goto_2

    .line 138
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 139
    .line 140
    .line 141
    throw v8

    .line 142
    :cond_6
    if-nez v0, :cond_7

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_7

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_7

    .line 155
    .line 156
    iget-object v0, v3, La/z0o0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 157
    .line 158
    invoke-virtual {v0, p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->setAttackCardsOnField$impl(Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    iget-object v0, v3, La/z0o0;->g:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 162
    .line 163
    invoke-virtual {v0, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->setAttackCardsOnField$impl(Ljava/util/List;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    int-to-long v0, p1

    .line 179
    const-wide/16 v2, 0x3e8

    .line 180
    .line 181
    mul-long v5, v0, v2

    .line 182
    .line 183
    sget-object p1, La/tvk;->a:La/rwj;

    .line 184
    .line 185
    sget-object v10, La/ys10;->a:La/vs10;

    .line 186
    .line 187
    new-instance p1, La/d69;

    .line 188
    .line 189
    const/16 v0, 0xf

    .line 190
    .line 191
    invoke-direct {p1, v0}, La/d69;-><init>(B)V

    .line 192
    .line 193
    .line 194
    new-instance v11, La/qe5;

    .line 195
    .line 196
    const/4 v9, 0x0

    .line 197
    move-object v7, p0

    .line 198
    move-object v8, p2

    .line 199
    move-object v4, v11

    .line 200
    invoke-direct/range {v4 .. v9}, La/qe5;-><init>(JLorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;La/eha;La/yje;)V

    .line 201
    .line 202
    .line 203
    const/16 v12, 0xa

    .line 204
    .line 205
    move-object v8, p1

    .line 206
    move-object/from16 v7, p4

    .line 207
    .line 208
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 209
    .line 210
    .line 211
    :cond_7
    return-void
.end method

.method public final x(Ljava/util/List;Ljava/util/List;Z)V
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
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    new-instance v3, La/iha;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/ImageView;

    .line 42
    .line 43
    invoke-direct {v3, v4, v0, v1}, La/iha;-><init>(Landroid/content/Context;Landroid/widget/ImageView;I)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    move v0, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    throw p0

    .line 74
    :cond_2
    return-void
.end method

.method public final y(La/sha;La/tkz;)V
    .locals 9

    .line 1
    instance-of v0, p1, La/qha;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->q:La/z0o0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, La/z0o0;->s:Landroid/widget/TextView;

    .line 10
    .line 11
    check-cast p1, La/qha;

    .line 12
    .line 13
    iget-object p1, p1, La/qha;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, La/z0o0;->h:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, La/z0o0;->s:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    instance-of v0, p1, La/rha;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v3, p0, La/z0o0;->h:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 34
    .line 35
    check-cast p1, La/rha;

    .line 36
    .line 37
    iget-wide v4, p1, La/rha;->a:J

    .line 38
    .line 39
    iget-object v7, p1, La/rha;->b:Ljava/lang/Long;

    .line 40
    .line 41
    const/4 v8, 0x4

    .line 42
    move-object v6, p2

    .line 43
    invoke-static/range {v3 .. v8}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->b(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;JLa/tkz;Ljava/lang/Long;I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, La/z0o0;->s:Landroid/widget/TextView;

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/z0o0;->h:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object p1, p0, La/z0o0;->m:Landroid/widget/TextView;

    .line 57
    .line 58
    const/16 p2, 0x8

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, La/z0o0;->d:Landroid/widget/LinearLayout;

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, La/z0o0;->e:Landroid/widget/LinearLayout;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, La/z0o0;->j:Landroid/widget/TextView;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, La/z0o0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 79
    .line 80
    invoke-virtual {p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->u()V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, La/z0o0;->g:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 84
    .line 85
    invoke-virtual {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->u()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final z(La/cia;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p1, La/cia;->d:Z

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->setDefenderTitles(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p1, La/cia;->c:Z

    .line 9
    .line 10
    iget-object v1, p1, La/cia;->b:Ljava/util/List;

    .line 11
    .line 12
    iget-object p1, p1, La/cia;->a:Ljava/util/List;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p2, 0x0

    .line 21
    :goto_0
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->q:La/z0o0;

    .line 22
    .line 23
    iget-object v2, v0, La/z0o0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 24
    .line 25
    invoke-virtual {v2, p1, p2}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->v(Ljava/util/List;Z)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La/z0o0;->g:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;

    .line 29
    .line 30
    invoke-virtual {v0, v1, p2}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballFieldView;->v(Ljava/util/List;Z)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->r:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {p0, p1, v0, p2}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->x(Ljava/util/List;Ljava/util/List;Z)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->s:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {p0, v1, p1, p2}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->x(Ljava/util/List;Ljava/util/List;Z)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
