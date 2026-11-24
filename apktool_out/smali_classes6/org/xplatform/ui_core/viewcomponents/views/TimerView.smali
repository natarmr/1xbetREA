.class public final Lorg/xplatform/ui_core/viewcomponents/views/TimerView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final q:La/a8z;

.field public r:J

.field public final s:La/sje;

.field public t:La/c4m0;

.field public final u:Z

.field public final v:Z

.field public final w:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 525
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 524
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    and-int/lit8 v3, p3, 0x2

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v3, p2

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct {v0, v1, v3, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    .line 20
    .line 21
    sget-object v6, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v7, La/ywm0;

    .line 24
    .line 25
    const/16 v8, 0xe

    .line 26
    .line 27
    invoke-direct {v7, v0, v0, v8}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v6, v7}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iput-object v6, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->q:La/a8z;

    .line 35
    .line 36
    invoke-static {}, La/d5c;->s()La/sje;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iput-object v6, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->s:La/sje;

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    iput-boolean v6, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->u:Z

    .line 44
    .line 45
    sget-object v7, La/aqd0;->A:[I

    .line 46
    .line 47
    invoke-virtual {v1, v3, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 v7, 0x6

    .line 55
    invoke-virtual {v3, v7, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const/16 v8, 0xb

    .line 60
    .line 61
    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    const/16 v9, 0x8

    .line 66
    .line 67
    invoke-virtual {v3, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    if-nez v10, :cond_1

    .line 72
    .line 73
    const-string v10, ""

    .line 74
    .line 75
    :cond_1
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    if-nez v11, :cond_2

    .line 80
    .line 81
    move-object v11, v10

    .line 82
    :cond_2
    const/4 v12, 0x4

    .line 83
    invoke-virtual {v3, v12, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    const/4 v13, 0x3

    .line 88
    invoke-virtual {v3, v13, v12}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    invoke-virtual {v3, v2, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    const/4 v14, 0x5

    .line 97
    const/high16 v15, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    invoke-virtual {v3, v6, v14}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    const/4 v4, 0x7

    .line 108
    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    const/16 v9, 0xc

    .line 113
    .line 114
    invoke-virtual {v3, v9, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    iput-boolean v6, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->u:Z

    .line 119
    .line 120
    const/16 v6, 0xa

    .line 121
    .line 122
    invoke-virtual {v3, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    iput-boolean v6, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->v:Z

    .line 127
    .line 128
    const/16 v6, 0x9

    .line 129
    .line 130
    invoke-virtual {v3, v6, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    iput-boolean v6, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->w:Z

    .line 135
    .line 136
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-nez v6, :cond_3

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    goto :goto_1

    .line 144
    :cond_3
    invoke-static {v10, v5}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    :goto_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-nez v9, :cond_4

    .line 153
    .line 154
    const/4 v9, 0x0

    .line 155
    goto :goto_2

    .line 156
    :cond_4
    invoke-static {v11, v5}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    :goto_2
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    iget-object v10, v10, La/slu0;->c:Landroid/widget/TextView;

    .line 165
    .line 166
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    iget-object v11, v11, La/slu0;->f:Landroid/widget/TextView;

    .line 171
    .line 172
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    iget-object v5, v5, La/slu0;->i:Landroid/widget/TextView;

    .line 177
    .line 178
    move-object/from16 v24, v3

    .line 179
    .line 180
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    iget-object v3, v3, La/slu0;->m:Landroid/widget/TextView;

    .line 185
    .line 186
    move-object/from16 v19, v3

    .line 187
    .line 188
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    iget-object v3, v3, La/slu0;->d:Landroid/widget/TextView;

    .line 193
    .line 194
    move-object/from16 v20, v3

    .line 195
    .line 196
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    iget-object v3, v3, La/slu0;->g:Landroid/widget/TextView;

    .line 201
    .line 202
    move-object/from16 v21, v3

    .line 203
    .line 204
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    iget-object v3, v3, La/slu0;->j:Landroid/widget/TextView;

    .line 209
    .line 210
    move-object/from16 v22, v3

    .line 211
    .line 212
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    iget-object v3, v3, La/slu0;->l:Landroid/widget/TextView;

    .line 217
    .line 218
    move-object/from16 v23, v3

    .line 219
    .line 220
    move-object/from16 v18, v5

    .line 221
    .line 222
    move-object/from16 v16, v10

    .line 223
    .line 224
    move-object/from16 v17, v11

    .line 225
    .line 226
    filled-new-array/range {v16 .. v23}, [Landroid/widget/TextView;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-eqz v5, :cond_5

    .line 243
    .line 244
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    check-cast v5, Landroid/widget/TextView;

    .line 249
    .line 250
    invoke-virtual {v5, v6, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 251
    .line 252
    .line 253
    const/4 v10, 0x0

    .line 254
    invoke-virtual {v5, v10, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_5
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    iget-object v3, v3, La/slu0;->e:Landroid/widget/TextView;

    .line 266
    .line 267
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    iget-object v5, v5, La/slu0;->h:Landroid/widget/TextView;

    .line 272
    .line 273
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    iget-object v6, v6, La/slu0;->k:Landroid/widget/TextView;

    .line 278
    .line 279
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    iget-object v10, v10, La/slu0;->n:Landroid/widget/TextView;

    .line 284
    .line 285
    filled-new-array {v3, v5, v6, v10}, [Landroid/widget/TextView;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-eqz v5, :cond_7

    .line 302
    .line 303
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    check-cast v5, Landroid/widget/TextView;

    .line 308
    .line 309
    if-eqz v8, :cond_6

    .line 310
    .line 311
    const/4 v10, 0x0

    .line 312
    goto :goto_5

    .line 313
    :cond_6
    const/16 v10, 0x8

    .line 314
    .line 315
    :goto_5
    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v9, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 319
    .line 320
    .line 321
    const/4 v10, 0x0

    .line 322
    invoke-virtual {v5, v10, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_7
    const/4 v10, 0x0

    .line 330
    if-eqz v8, :cond_8

    .line 331
    .line 332
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    iget-object v3, v3, La/slu0;->e:Landroid/widget/TextView;

    .line 337
    .line 338
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getDayLabel()I

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    iget-object v3, v3, La/slu0;->h:Landroid/widget/TextView;

    .line 354
    .line 355
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getHourLabel()I

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 364
    .line 365
    .line 366
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    iget-object v3, v3, La/slu0;->k:Landroid/widget/TextView;

    .line 371
    .line 372
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getMinLabel()I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 381
    .line 382
    .line 383
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    iget-object v3, v3, La/slu0;->n:Landroid/widget/TextView;

    .line 388
    .line 389
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getSecLabel()I

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    .line 399
    .line 400
    :cond_8
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    iget-object v1, v1, La/slu0;->d:Landroid/widget/TextView;

    .line 405
    .line 406
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    iget-object v3, v3, La/slu0;->g:Landroid/widget/TextView;

    .line 411
    .line 412
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    iget-object v5, v5, La/slu0;->j:Landroid/widget/TextView;

    .line 417
    .line 418
    filled-new-array {v1, v3, v5}, [Landroid/widget/TextView;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    :cond_9
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_a

    .line 435
    .line 436
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    check-cast v3, Landroid/widget/TextView;

    .line 441
    .line 442
    const-string v5, ":"

    .line 443
    .line 444
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    .line 446
    .line 447
    if-eqz v2, :cond_9

    .line 448
    .line 449
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 450
    .line 451
    .line 452
    goto :goto_6

    .line 453
    :cond_a
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    iget-object v1, v1, La/slu0;->j:Landroid/widget/TextView;

    .line 458
    .line 459
    iget-boolean v2, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->u:Z

    .line 460
    .line 461
    if-eqz v2, :cond_b

    .line 462
    .line 463
    move v2, v10

    .line 464
    goto :goto_7

    .line 465
    :cond_b
    const/16 v2, 0x8

    .line 466
    .line 467
    :goto_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 468
    .line 469
    .line 470
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    iget-object v1, v1, La/slu0;->m:Landroid/widget/TextView;

    .line 475
    .line 476
    iget-boolean v2, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->u:Z

    .line 477
    .line 478
    if-eqz v2, :cond_c

    .line 479
    .line 480
    move v2, v10

    .line 481
    goto :goto_8

    .line 482
    :cond_c
    const/16 v2, 0x8

    .line 483
    .line 484
    :goto_8
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 485
    .line 486
    .line 487
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    iget-object v1, v1, La/slu0;->n:Landroid/widget/TextView;

    .line 492
    .line 493
    iget-boolean v2, v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->u:Z

    .line 494
    .line 495
    if-eqz v2, :cond_d

    .line 496
    .line 497
    if-eqz v8, :cond_d

    .line 498
    .line 499
    move v5, v10

    .line 500
    goto :goto_9

    .line 501
    :cond_d
    const/16 v5, 0x8

    .line 502
    .line 503
    :goto_9
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 504
    .line 505
    .line 506
    invoke-direct {v0, v4}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->setCompactMode(Z)V

    .line 507
    .line 508
    .line 509
    invoke-direct {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    iget-object v0, v0, La/slu0;->l:Landroid/widget/TextView;

    .line 514
    .line 515
    const-string v1, "-"

    .line 516
    .line 517
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v24 .. v24}, Landroid/content/res/TypedArray;->recycle()V

    .line 521
    .line 522
    .line 523
    return-void
.end method

.method private final getBinding()La/slu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/slu0;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getDayLabel()I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->w:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const p0, 0x7f130682

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const p0, 0x7f1315b5

    .line 10
    .line 11
    .line 12
    return p0
.end method

.method private final getHourLabel()I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->w:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const p0, 0x7f130a11

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const p0, 0x7f1315b7

    .line 10
    .line 11
    .line 12
    return p0
.end method

.method private final getMinLabel()I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->w:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const p0, 0x7f130d30

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const p0, 0x7f1315b8

    .line 10
    .line 11
    .line 12
    return p0
.end method

.method private final getSecLabel()I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->w:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const p0, 0x7f1311d6

    .line 6
    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const p0, 0x7f1315b9

    .line 10
    .line 11
    .line 12
    return p0
.end method

.method private final setCompactMode(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const p1, 0x7f0706e0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const p1, 0x7f070717

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/slu0;->c:Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast v0, La/a3e;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, La/slu0;->c:Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, La/slu0;->f:Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    check-cast v0, La/a3e;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-virtual {v0, p1, v1, p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v1, v1, La/slu0;->f:Landroid/widget/TextView;

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v0, v0, La/slu0;->i:Landroid/widget/TextView;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    check-cast v0, La/a3e;

    .line 87
    .line 88
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object v1, v1, La/slu0;->i:Landroid/widget/TextView;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v0, v0, La/slu0;->m:Landroid/widget/TextView;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    check-cast v0, La/a3e;

    .line 114
    .line 115
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iget-object p0, p0, La/slu0;->m:Landroid/widget/TextView;

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public static u(Lorg/xplatform/ui_core/viewcomponents/views/TimerView;La/rd7;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p1, La/ozp0;

    .line 6
    .line 7
    const/16 p2, 0x1d

    .line 8
    .line 9
    invoke-direct {p1, p2}, La/ozp0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->t:La/c4m0;

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2}, La/pby;->isActive()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-ne p2, v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-wide v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->r:J

    .line 24
    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    const/4 p2, 0x6

    .line 28
    invoke-static {p2, v0, v1, v2, v3}, La/sac;->L(IJJ)La/vsg0;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    new-instance v0, La/zg0;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/16 v2, 0xd

    .line 36
    .line 37
    invoke-direct {v0, p1, p0, v1, v2}, La/zg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 38
    .line 39
    .line 40
    new-instance p1, La/fnq;

    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    invoke-direct {p1, p2, v0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->s:La/sje;

    .line 47
    .line 48
    invoke-static {p1, p2}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->t:La/c4m0;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->t:La/c4m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setBackground(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f070717

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x7f07072d

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v2, v2, La/slu0;->c:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v2, v2, La/slu0;->c:Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-virtual {v2, v1, v0, v1, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v2, v2, La/slu0;->f:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v2, v2, La/slu0;->f:Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {v2, v1, v0, v1, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-object v2, v2, La/slu0;->i:Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v2, v2, La/slu0;->i:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {v2, v1, v0, v1, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget-object v2, v2, La/slu0;->m:Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iget-object p0, p0, La/slu0;->m:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {p0, v1, v0, v1, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final v(Ljava/util/Date;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->r:J

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->w(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final w(Z)V
    .locals 12

    .line 1
    iget-wide v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->r:J

    .line 2
    .line 3
    new-instance v2, Ljava/util/Date;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    sub-long/2addr v0, v2

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-gtz v4, :cond_1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, La/slu0;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x8

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p1, p1, La/slu0;->c:Landroid/widget/TextView;

    .line 41
    .line 42
    const-string v0, "00"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p1, p1, La/slu0;->f:Landroid/widget/TextView;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p1, p1, La/slu0;->i:Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget-object p0, p0, La/slu0;->m:Landroid/widget/TextView;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, La/slu0;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    const-wide/16 v4, 0x3e8

    .line 86
    .line 87
    div-long v4, v0, v4

    .line 88
    .line 89
    const-wide/16 v6, 0x3c

    .line 90
    .line 91
    rem-long/2addr v4, v6

    .line 92
    const-wide/32 v8, 0xea60

    .line 93
    .line 94
    .line 95
    div-long v8, v0, v8

    .line 96
    .line 97
    rem-long/2addr v8, v6

    .line 98
    const-wide/32 v6, 0x36ee80

    .line 99
    .line 100
    .line 101
    div-long v6, v0, v6

    .line 102
    .line 103
    const-wide/16 v10, 0x18

    .line 104
    .line 105
    rem-long/2addr v6, v10

    .line 106
    const-wide/32 v10, 0x5265c00

    .line 107
    .line 108
    .line 109
    div-long/2addr v0, v10

    .line 110
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const/4 v10, 0x2

    .line 115
    invoke-static {v10, p1}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-static {v10, v6}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-static {v10, v7}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v10, v4}, Lkotlin/text/StringsKt;->b0(ILjava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    iget-boolean v5, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->u:Z

    .line 144
    .line 145
    if-eqz v5, :cond_2

    .line 146
    .line 147
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v0, v0, La/slu0;->c:Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p1, p1, La/slu0;->f:Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iget-object p1, p1, La/slu0;->i:Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    iget-object p0, p0, La/slu0;->m:Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_2
    cmp-long v0, v0, v2

    .line 185
    .line 186
    if-gtz v0, :cond_4

    .line 187
    .line 188
    iget-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->v:Z

    .line 189
    .line 190
    if-eqz v0, :cond_3

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget-object p1, p1, La/slu0;->c:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iget-object p1, p1, La/slu0;->f:Landroid/widget/TextView;

    .line 207
    .line 208
    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iget-object p1, p1, La/slu0;->i:Landroid/widget/TextView;

    .line 216
    .line 217
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    iget-object p1, p1, La/slu0;->e:Landroid/widget/TextView;

    .line 225
    .line 226
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getHourLabel()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 239
    .line 240
    .line 241
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iget-object p1, p1, La/slu0;->h:Landroid/widget/TextView;

    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getMinLabel()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    .line 261
    .line 262
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    iget-object p1, p1, La/slu0;->k:Landroid/widget/TextView;

    .line 267
    .line 268
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getSecLabel()I

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :cond_4
    :goto_0
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget-object v0, v0, La/slu0;->c:Landroid/widget/TextView;

    .line 289
    .line 290
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    iget-object p1, p1, La/slu0;->f:Landroid/widget/TextView;

    .line 298
    .line 299
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    .line 301
    .line 302
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    iget-object p1, p1, La/slu0;->i:Landroid/widget/TextView;

    .line 307
    .line 308
    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    .line 310
    .line 311
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    iget-object p1, p1, La/slu0;->e:Landroid/widget/TextView;

    .line 316
    .line 317
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getDayLabel()I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    .line 331
    .line 332
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    iget-object p1, p1, La/slu0;->h:Landroid/widget/TextView;

    .line 337
    .line 338
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getHourLabel()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    .line 352
    .line 353
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getBinding()La/slu0;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    iget-object p1, p1, La/slu0;->k:Landroid/widget/TextView;

    .line 358
    .line 359
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;->getMinLabel()I

    .line 364
    .line 365
    .line 366
    move-result p0

    .line 367
    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 372
    .line 373
    .line 374
    return-void
.end method
