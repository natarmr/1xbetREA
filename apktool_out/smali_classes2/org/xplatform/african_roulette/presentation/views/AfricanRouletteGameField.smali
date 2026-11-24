.class public final Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 542
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 541
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    and-int/lit8 v1, p3, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object/from16 v1, p2

    .line 10
    .line 11
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    move-object/from16 v4, p1

    .line 16
    .line 17
    invoke-direct {v0, v4, v1, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const v4, 0x7f0d0317

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v4, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    const v3, 0x7f0a029d

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 42
    .line 43
    if-eqz v4, :cond_8

    .line 44
    .line 45
    const v3, 0x7f0a029e

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 53
    .line 54
    if-eqz v5, :cond_8

    .line 55
    .line 56
    const v3, 0x7f0a029f

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 64
    .line 65
    if-eqz v6, :cond_8

    .line 66
    .line 67
    const v3, 0x7f0a02a0

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    check-cast v7, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 75
    .line 76
    if-eqz v7, :cond_8

    .line 77
    .line 78
    const v3, 0x7f0a02a1

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    check-cast v8, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 86
    .line 87
    if-eqz v8, :cond_8

    .line 88
    .line 89
    const v3, 0x7f0a02a2

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    check-cast v9, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 97
    .line 98
    if-eqz v9, :cond_8

    .line 99
    .line 100
    const v3, 0x7f0a02a3

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    check-cast v10, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 108
    .line 109
    if-eqz v10, :cond_8

    .line 110
    .line 111
    const v3, 0x7f0a02a4

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    check-cast v11, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 119
    .line 120
    if-eqz v11, :cond_8

    .line 121
    .line 122
    const v3, 0x7f0a02a5

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    check-cast v12, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 130
    .line 131
    if-eqz v12, :cond_8

    .line 132
    .line 133
    const v3, 0x7f0a02a6

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    check-cast v13, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 141
    .line 142
    if-eqz v13, :cond_8

    .line 143
    .line 144
    const v3, 0x7f0a02a7

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    check-cast v14, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 152
    .line 153
    if-eqz v14, :cond_8

    .line 154
    .line 155
    const v3, 0x7f0a02a8

    .line 156
    .line 157
    .line 158
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    check-cast v15, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 163
    .line 164
    if-eqz v15, :cond_8

    .line 165
    .line 166
    const v3, 0x7f0a02a9

    .line 167
    .line 168
    .line 169
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v16

    .line 173
    const/16 p3, 0x0

    .line 174
    .line 175
    move-object/from16 v2, v16

    .line 176
    .line 177
    check-cast v2, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 178
    .line 179
    if-eqz v2, :cond_9

    .line 180
    .line 181
    const v3, 0x7f0a02aa

    .line 182
    .line 183
    .line 184
    invoke-static {v1, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v16

    .line 188
    move-object/from16 v3, v16

    .line 189
    .line 190
    check-cast v3, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 191
    .line 192
    if-eqz v3, :cond_7

    .line 193
    .line 194
    move-object/from16 p2, v2

    .line 195
    .line 196
    const v2, 0x7f0a02ab

    .line 197
    .line 198
    .line 199
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    move-object/from16 v2, v16

    .line 204
    .line 205
    check-cast v2, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 206
    .line 207
    if-eqz v2, :cond_6

    .line 208
    .line 209
    move-object/from16 v16, v9

    .line 210
    .line 211
    const v9, 0x7f0a02ac

    .line 212
    .line 213
    .line 214
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v17

    .line 218
    move-object/from16 v9, v17

    .line 219
    .line 220
    check-cast v9, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 221
    .line 222
    if-eqz v9, :cond_5

    .line 223
    .line 224
    move-object/from16 v17, v9

    .line 225
    .line 226
    const v9, 0x7f0a02ad

    .line 227
    .line 228
    .line 229
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object v18

    .line 233
    move-object/from16 v9, v18

    .line 234
    .line 235
    check-cast v9, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 236
    .line 237
    if-eqz v9, :cond_4

    .line 238
    .line 239
    move-object/from16 v18, v9

    .line 240
    .line 241
    const v9, 0x7f0a02af

    .line 242
    .line 243
    .line 244
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v19

    .line 248
    move-object/from16 v9, v19

    .line 249
    .line 250
    check-cast v9, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 251
    .line 252
    if-eqz v9, :cond_3

    .line 253
    .line 254
    move-object/from16 v19, v9

    .line 255
    .line 256
    const v9, 0x7f0a02b0

    .line 257
    .line 258
    .line 259
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object v20

    .line 263
    move-object/from16 v9, v20

    .line 264
    .line 265
    check-cast v9, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 266
    .line 267
    if-eqz v9, :cond_2

    .line 268
    .line 269
    move-object/from16 v20, v9

    .line 270
    .line 271
    const v9, 0x7f0a02b2

    .line 272
    .line 273
    .line 274
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v21

    .line 278
    move-object/from16 v9, v21

    .line 279
    .line 280
    check-cast v9, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 281
    .line 282
    if-eqz v9, :cond_1

    .line 283
    .line 284
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 285
    .line 286
    new-instance v1, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .line 290
    .line 291
    iput-object v1, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;->q:Ljava/util/ArrayList;

    .line 292
    .line 293
    move-object/from16 p1, v1

    .line 294
    .line 295
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 296
    .line 297
    move-object/from16 v21, v9

    .line 298
    .line 299
    const/4 v9, -0x1

    .line 300
    invoke-direct {v1, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 304
    .line 305
    .line 306
    sget-object v0, La/z70;->b:La/z70;

    .line 307
    .line 308
    invoke-virtual {v4, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 309
    .line 310
    .line 311
    sget-object v0, La/z70;->c:La/z70;

    .line 312
    .line 313
    invoke-virtual {v5, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 314
    .line 315
    .line 316
    sget-object v0, La/z70;->d:La/z70;

    .line 317
    .line 318
    invoke-virtual {v10, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 319
    .line 320
    .line 321
    sget-object v0, La/z70;->e:La/z70;

    .line 322
    .line 323
    invoke-virtual {v11, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 324
    .line 325
    .line 326
    sget-object v0, La/z70;->f:La/z70;

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, La/z70;->g:La/z70;

    .line 332
    .line 333
    invoke-virtual {v13, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 334
    .line 335
    .line 336
    sget-object v0, La/z70;->h:La/z70;

    .line 337
    .line 338
    invoke-virtual {v14, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, La/z70;->i:La/z70;

    .line 342
    .line 343
    invoke-virtual {v15, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 344
    .line 345
    .line 346
    sget-object v0, La/z70;->j:La/z70;

    .line 347
    .line 348
    invoke-virtual {v3, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 349
    .line 350
    .line 351
    sget-object v0, La/z70;->k:La/z70;

    .line 352
    .line 353
    invoke-virtual {v2, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 354
    .line 355
    .line 356
    sget-object v0, La/z70;->l:La/z70;

    .line 357
    .line 358
    invoke-virtual {v6, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 359
    .line 360
    .line 361
    sget-object v0, La/z70;->m:La/z70;

    .line 362
    .line 363
    invoke-virtual {v7, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 364
    .line 365
    .line 366
    sget-object v0, La/z70;->n:La/z70;

    .line 367
    .line 368
    invoke-virtual {v8, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 369
    .line 370
    .line 371
    sget-object v0, La/z70;->o:La/z70;

    .line 372
    .line 373
    move-object/from16 v9, v16

    .line 374
    .line 375
    invoke-virtual {v9, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 376
    .line 377
    .line 378
    sget-object v0, La/z70;->p:La/z70;

    .line 379
    .line 380
    move-object/from16 v1, p2

    .line 381
    .line 382
    invoke-virtual {v1, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 383
    .line 384
    .line 385
    sget-object v0, La/z70;->q:La/z70;

    .line 386
    .line 387
    move-object/from16 v1, v19

    .line 388
    .line 389
    invoke-virtual {v1, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 390
    .line 391
    .line 392
    sget-object v0, La/z70;->r:La/z70;

    .line 393
    .line 394
    move-object/from16 v1, v20

    .line 395
    .line 396
    invoke-virtual {v1, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 397
    .line 398
    .line 399
    sget-object v0, La/z70;->s:La/z70;

    .line 400
    .line 401
    move-object/from16 v1, v18

    .line 402
    .line 403
    invoke-virtual {v1, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 404
    .line 405
    .line 406
    sget-object v0, La/z70;->t:La/z70;

    .line 407
    .line 408
    move-object/from16 v1, v21

    .line 409
    .line 410
    invoke-virtual {v1, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 411
    .line 412
    .line 413
    sget-object v0, La/z70;->u:La/z70;

    .line 414
    .line 415
    move-object/from16 v1, v17

    .line 416
    .line 417
    invoke-virtual {v1, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a(La/z70;)V

    .line 418
    .line 419
    .line 420
    move-object/from16 v0, p1

    .line 421
    .line 422
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-object/from16 v2, p2

    .line 465
    .line 466
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-object/from16 v2, v19

    .line 470
    .line 471
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-object/from16 v2, v20

    .line 475
    .line 476
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-object/from16 v2, v18

    .line 480
    .line 481
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-object/from16 v2, v21

    .line 485
    .line 486
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_1
    const v3, 0x7f0a02b2

    .line 494
    .line 495
    .line 496
    goto :goto_1

    .line 497
    :cond_2
    const v3, 0x7f0a02b0

    .line 498
    .line 499
    .line 500
    goto :goto_1

    .line 501
    :cond_3
    const v3, 0x7f0a02af

    .line 502
    .line 503
    .line 504
    goto :goto_1

    .line 505
    :cond_4
    const v3, 0x7f0a02ad

    .line 506
    .line 507
    .line 508
    goto :goto_1

    .line 509
    :cond_5
    const v3, 0x7f0a02ac

    .line 510
    .line 511
    .line 512
    goto :goto_1

    .line 513
    :cond_6
    const v3, 0x7f0a02ab

    .line 514
    .line 515
    .line 516
    goto :goto_1

    .line 517
    :cond_7
    const v3, 0x7f0a02aa

    .line 518
    .line 519
    .line 520
    goto :goto_1

    .line 521
    :cond_8
    const/16 p3, 0x0

    .line 522
    .line 523
    :cond_9
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    const-string v1, "Missing required view with ID: "

    .line 532
    .line 533
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw p3
.end method


# virtual methods
.method public final setCellClickListeners$african_roulette(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "La/z70;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;->q:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->setCellClickListener$african_roulette(Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method
