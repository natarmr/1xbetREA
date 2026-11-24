.class public final Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;
    }
.end annotation


# static fields
.field public static final synthetic j:I


# instance fields
.field public final a:La/a8z;

.field public final b:Z

.field public final c:Z

.field public final d:La/e1a0;

.field public final e:Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

.field public f:La/ach0;

.field public g:Lkotlin/jvm/functions/Function1;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 437
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 23

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const/4 v9, 0x2

    .line 6
    and-int/lit8 v0, p3, 0x2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v0, p2

    .line 13
    .line 14
    :goto_0
    sget-object v11, La/rv00;->q:La/rv00;

    .line 15
    .line 16
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v12, 0x0

    .line 20
    invoke-direct {v2, v8, v0, v12}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    .line 22
    .line 23
    sget-object v1, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v3, La/sue0;

    .line 26
    .line 27
    const/16 v4, 0xc

    .line 28
    .line 29
    invoke-direct {v3, v2, v2, v4}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->a:La/a8z;

    .line 37
    .line 38
    sget-object v1, La/jtv;->v:La/jtv;

    .line 39
    .line 40
    iput-object v1, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f:La/ach0;

    .line 41
    .line 42
    new-instance v1, La/w0h0;

    .line 43
    .line 44
    const/16 v3, 0x14

    .line 45
    .line 46
    invoke-direct {v1, v3}, La/w0h0;-><init>(B)V

    .line 47
    .line 48
    .line 49
    iput-object v1, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->g:Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    const/4 v13, 0x1

    .line 52
    invoke-virtual {v2, v13}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->setClickable(Z)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v14, 0x0

    .line 56
    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    iput-boolean v12, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->b:Z

    .line 60
    .line 61
    iput-boolean v13, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->c:Z

    .line 62
    .line 63
    new-instance v9, La/e1a0;

    .line 64
    .line 65
    new-instance v0, La/aif0;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const/16 v7, 0x1a

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    const-class v3, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;

    .line 72
    .line 73
    const-string v4, "onSelectedDateChanged"

    .line 74
    .line 75
    const-string v5, "onSelectedDateChanged(Ljava/util/Date;)V"

    .line 76
    .line 77
    invoke-direct/range {v0 .. v7}, La/aif0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Ljava/util/Date;

    .line 81
    .line 82
    invoke-direct {v1, v14, v15}, Ljava/util/Date;-><init>(J)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v9, v11, v0, v1}, La/e1a0;-><init>(La/r6x;Lkotlin/jvm/functions/Function1;Ljava/util/Date;)V

    .line 86
    .line 87
    .line 88
    iput-object v9, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 89
    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :cond_1
    sget-object v1, La/aqd0;->t:[I

    .line 93
    .line 94
    invoke-virtual {v8, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1, v13, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    iput-boolean v3, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->b:Z

    .line 103
    .line 104
    invoke-virtual {v1, v9, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    iput-boolean v3, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->c:Z

    .line 109
    .line 110
    const/4 v3, 0x4

    .line 111
    const/4 v4, 0x0

    .line 112
    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    float-to-long v5, v3

    .line 117
    invoke-virtual {v1, v12, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    float-to-long v3, v3

    .line 122
    const/4 v7, 0x3

    .line 123
    invoke-virtual {v1, v7, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_2

    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    const v11, 0x10100d4

    .line 134
    .line 135
    .line 136
    filled-new-array {v11}, [I

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    invoke-virtual {v7, v0, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    sget-object v7, La/j5d;->a:Landroid/util/TypedValue;

    .line 148
    .line 149
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    const v11, 0x7f040ae1

    .line 157
    .line 158
    .line 159
    invoke-static {v7, v11, v12}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    invoke-virtual {v0, v12, v7}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 168
    .line 169
    .line 170
    new-instance v11, La/o6x;

    .line 171
    .line 172
    invoke-direct {v11, v7}, La/o6x;-><init>(I)V

    .line 173
    .line 174
    .line 175
    :cond_2
    new-instance v0, La/e1a0;

    .line 176
    .line 177
    move-object v7, v0

    .line 178
    new-instance v0, La/aif0;

    .line 179
    .line 180
    move-wide/from16 v16, v5

    .line 181
    .line 182
    const/4 v6, 0x0

    .line 183
    move-object v5, v7

    .line 184
    const/16 v7, 0x1b

    .line 185
    .line 186
    move-object/from16 v18, v1

    .line 187
    .line 188
    const/4 v1, 0x1

    .line 189
    move-wide/from16 v19, v3

    .line 190
    .line 191
    const-class v3, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;

    .line 192
    .line 193
    const-string v4, "onSelectedDateChanged"

    .line 194
    .line 195
    move-object/from16 v21, v5

    .line 196
    .line 197
    const-string v5, "onSelectedDateChanged(Ljava/util/Date;)V"

    .line 198
    .line 199
    move-wide/from16 v9, v16

    .line 200
    .line 201
    move-wide/from16 v12, v19

    .line 202
    .line 203
    move-object/from16 v22, v21

    .line 204
    .line 205
    invoke-direct/range {v0 .. v7}, La/aif0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 206
    .line 207
    .line 208
    new-instance v1, Ljava/util/Date;

    .line 209
    .line 210
    invoke-direct {v1, v14, v15}, Ljava/util/Date;-><init>(J)V

    .line 211
    .line 212
    .line 213
    move-object/from16 v5, v22

    .line 214
    .line 215
    invoke-direct {v5, v11, v0, v1}, La/e1a0;-><init>(La/r6x;Lkotlin/jvm/functions/Function1;Ljava/util/Date;)V

    .line 216
    .line 217
    .line 218
    iput-object v5, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 219
    .line 220
    const-wide/16 v0, 0x1

    .line 221
    .line 222
    cmp-long v0, v0, v9

    .line 223
    .line 224
    if-gtz v0, :cond_a

    .line 225
    .line 226
    cmp-long v0, v9, v12

    .line 227
    .line 228
    if-gez v0, :cond_a

    .line 229
    .line 230
    new-instance v0, Ljava/util/Date;

    .line 231
    .line 232
    invoke-direct {v0, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 233
    .line 234
    .line 235
    new-instance v1, Ljava/util/Date;

    .line 236
    .line 237
    invoke-direct {v1, v12, v13}, Ljava/util/Date;-><init>(J)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-nez v3, :cond_9

    .line 245
    .line 246
    const/4 v3, 0x1

    .line 247
    iput-boolean v3, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->i:Z

    .line 248
    .line 249
    new-instance v3, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 259
    .line 260
    .line 261
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 266
    .line 267
    .line 268
    :goto_1
    invoke-virtual {v4, v0}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    const/4 v6, 0x5

    .line 273
    if-nez v1, :cond_8

    .line 274
    .line 275
    invoke-virtual {v4, v6}, Ljava/util/Calendar;->get(I)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    if-ne v1, v7, :cond_3

    .line 284
    .line 285
    const/4 v1, 0x2

    .line 286
    invoke-virtual {v4, v1}, Ljava/util/Calendar;->get(I)I

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-ne v7, v9, :cond_3

    .line 295
    .line 296
    const/4 v7, 0x1

    .line 297
    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    invoke-virtual {v0, v7}, Ljava/util/Calendar;->get(I)I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-ne v9, v10, :cond_3

    .line 306
    .line 307
    :goto_2
    const/4 v7, 0x1

    .line 308
    goto :goto_6

    .line 309
    :cond_3
    invoke-virtual {v5}, La/e1a0;->d()I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    iget-object v1, v5, La/e1a0;->g:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v1, La/yz3;

    .line 316
    .line 317
    const/4 v4, 0x0

    .line 318
    invoke-virtual {v1, v3, v4}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 319
    .line 320
    .line 321
    new-instance v1, Ljava/util/ArrayList;

    .line 322
    .line 323
    const/16 v4, 0xa

    .line 324
    .line 325
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-eqz v4, :cond_4

    .line 341
    .line 342
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    check-cast v4, Ljava/util/Calendar;

    .line 347
    .line 348
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    goto :goto_3

    .line 356
    :cond_4
    invoke-virtual {v2, v1}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->b(Ljava/util/List;)Z

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-eqz v3, :cond_6

    .line 361
    .line 362
    iget-boolean v3, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->h:Z

    .line 363
    .line 364
    if-nez v3, :cond_5

    .line 365
    .line 366
    if-nez v0, :cond_5

    .line 367
    .line 368
    const/4 v12, 0x1

    .line 369
    goto :goto_4

    .line 370
    :cond_5
    const/4 v12, 0x0

    .line 371
    :goto_4
    invoke-virtual {v2, v1, v12}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e(Ljava/util/List;Z)V

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_6
    invoke-virtual {v2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->c(I)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_7

    .line 380
    .line 381
    iget-object v0, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e:Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

    .line 382
    .line 383
    invoke-virtual {v5}, La/e1a0;->d()I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    const/4 v7, 0x1

    .line 388
    sub-int/2addr v1, v7

    .line 389
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(I)V

    .line 390
    .line 391
    .line 392
    :cond_7
    :goto_5
    invoke-virtual {v2}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f()V

    .line 393
    .line 394
    .line 395
    goto :goto_7

    .line 396
    :cond_8
    const/4 v1, 0x2

    .line 397
    goto :goto_2

    .line 398
    :goto_6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 399
    .line 400
    .line 401
    move-result-object v9

    .line 402
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 403
    .line 404
    .line 405
    move-result-object v10

    .line 406
    invoke-virtual {v9, v10}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    invoke-virtual {v4, v6, v7}, Ljava/util/Calendar;->add(II)V

    .line 413
    .line 414
    .line 415
    goto/16 :goto_1

    .line 416
    .line 417
    :cond_9
    const-string v0, "startDate param must not be after endDate"

    .line 418
    .line 419
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    const/4 v4, 0x0

    .line 423
    throw v4

    .line 424
    :cond_a
    :goto_7
    invoke-virtual/range {v18 .. v18}, Landroid/content/res/TypedArray;->recycle()V

    .line 425
    .line 426
    .line 427
    :goto_8
    iget-boolean v0, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->b:Z

    .line 428
    .line 429
    new-instance v1, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

    .line 430
    .line 431
    invoke-direct {v1, v8, v0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;-><init>(Landroid/content/Context;Z)V

    .line 432
    .line 433
    .line 434
    iput-object v1, v2, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e:Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

    .line 435
    .line 436
    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/Date;Z)Ljava/util/Date;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Ljava/util/Date;

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    new-instance v3, Ljava/util/Date;

    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lkotlin/Pair;

    .line 55
    .line 56
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-static {v3, v2}, La/dtb;->C(Lkotlin/Pair;I)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    const/4 v2, 0x2

    .line 67
    invoke-static {v3, v2}, La/dtb;->C(Lkotlin/Pair;I)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    const/4 v2, 0x5

    .line 74
    invoke-static {v3, v2}, La/dtb;->C(Lkotlin/Pair;I)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-nez p2, :cond_3

    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    :goto_1
    move-object p0, p2

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object v0, p2

    .line 109
    check-cast v0, Ljava/util/Date;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 116
    .line 117
    .line 118
    move-result-wide v2

    .line 119
    sub-long/2addr v0, v2

    .line 120
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v0

    .line 124
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    move-object v3, v2

    .line 129
    check-cast v3, Ljava/util/Date;

    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 136
    .line 137
    .line 138
    move-result-wide v5

    .line 139
    sub-long/2addr v3, v5

    .line 140
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 141
    .line 142
    .line 143
    move-result-wide v3

    .line 144
    cmp-long v5, v0, v3

    .line 145
    .line 146
    if-lez v5, :cond_6

    .line 147
    .line 148
    move-object p2, v2

    .line 149
    move-wide v0, v3

    .line 150
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-nez v2, :cond_5

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :goto_2
    check-cast p0, Ljava/util/Date;

    .line 158
    .line 159
    return-object p0
.end method

.method private final getActualLayoutManagerState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->v0()Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v0

    .line 21
    :cond_1
    :goto_0
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f:La/ach0;

    .line 22
    .line 23
    instance-of v0, p0, La/zbh0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    check-cast p0, La/zbh0;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-object p0, v1

    .line 32
    :goto_1
    if-eqz p0, :cond_3

    .line 33
    .line 34
    iget-object p0, p0, La/zbh0;->a:Landroid/os/Parcelable;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    return-object v1
.end method

.method private final getBinding()La/pku0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pku0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 6
    .line 7
    iget-object v0, p0, La/e1a0;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Calendar;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, La/e1a0;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/util/Calendar;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    :cond_0
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    return p0
.end method

.method public final c(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->b:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->h:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/e1a0;->d()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-lez p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final d(Ljava/util/Date;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    new-instance v1, La/oh60;

    .line 8
    .line 9
    const/16 v2, 0x12

    .line 10
    .line 11
    invoke-direct {v1, v0, p0, v2}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->g:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final e(Ljava/util/List;Z)V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/Date;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 19
    .line 20
    .line 21
    const/16 v0, 0xb

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 25
    .line 26
    .line 27
    const/16 v0, 0xc

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 30
    .line 31
    .line 32
    const/16 v0, 0xd

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0xe

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Ljava/util/Calendar;->set(II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0, v2}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->a(Ljava/util/List;Ljava/util/Date;Z)Ljava/util/Date;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-nez v1, :cond_0

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-static {p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->a(Ljava/util/List;Ljava/util/Date;Z)Ljava/util/Date;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_0
    if-eqz v1, :cond_5

    .line 61
    .line 62
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v3, v0, La/e1a0;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Ljava/util/Calendar;

    .line 70
    .line 71
    invoke-virtual {v3, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/4 v4, -0x1

    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Ljava/util/Date;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    .line 92
    .line 93
    .line 94
    move-result-wide v5

    .line 95
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    cmp-long v3, v5, v7

    .line 100
    .line 101
    if-nez v3, :cond_1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    move v2, v4

    .line 108
    :goto_1
    if-eq v2, v4, :cond_5

    .line 109
    .line 110
    invoke-virtual {v0}, La/e1a0;->d()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-ge v2, p1, :cond_5

    .line 115
    .line 116
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e:Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

    .line 117
    .line 118
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-ge v3, v2, :cond_3

    .line 123
    .line 124
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->h1()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-ge v2, v3, :cond_3

    .line 129
    .line 130
    invoke-virtual {v0, v2}, La/yge0;->h(I)V

    .line 131
    .line 132
    .line 133
    :cond_3
    if-eqz p2, :cond_4

    .line 134
    .line 135
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(I)V

    .line 136
    .line 137
    .line 138
    :cond_4
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->g:Lkotlin/jvm/functions/Function1;

    .line 139
    .line 140
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_5
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f:La/ach0;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 14
    .line 15
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, La/e1a0;->d()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e:Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

    .line 32
    .line 33
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    instance-of v0, v1, La/zbh0;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    check-cast v1, La/zbh0;

    .line 44
    .line 45
    iget-object v0, v1, La/zbh0;->a:Landroid/os/Parcelable;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->u0(Landroid/os/Parcelable;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, La/jtv;->v:La/jtv;

    .line 51
    .line 52
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f:La/ach0;

    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e:Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    new-instance v0, La/zbh0;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e:Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->v0()Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, La/zbh0;-><init>(Landroid/os/Parcelable;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f:La/ach0;

    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 31
    .line 32
    .line 33
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final onFinishInflate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 5

    .line 1
    instance-of v0, p1, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;

    .line 6
    .line 7
    iget-object v0, p1, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;->b:Ljava/util/Date;

    .line 8
    .line 9
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, La/e1a0;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/Calendar;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    const-wide/16 v3, 0x0

    .line 29
    .line 30
    cmp-long v1, v1, v3

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->g:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v0, p1, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;->c:Landroid/os/Parcelable;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    new-instance v1, La/zbh0;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/zbh0;-><init>(Landroid/os/Parcelable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget-object v1, La/jtv;->v:La/jtv;

    .line 50
    .line 51
    :goto_0
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f:La/ach0;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->h:Z

    .line 55
    .line 56
    iget-object p1, p1, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;->a:Landroid/os/Parcelable;

    .line 57
    .line 58
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->h:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->i:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 13
    .line 14
    iget-object v1, v1, La/e1a0;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/Calendar;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getActualLayoutManagerState()Landroid/os/Parcelable;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-boolean p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->i:Z

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v2, 0x0

    .line 35
    :goto_0
    new-instance p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;

    .line 36
    .line 37
    invoke-direct {p0, v0, v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$SavedState;-><init>(Landroid/os/Parcelable;Ljava/util/Date;Landroid/os/Parcelable;)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public setClickable(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->getBinding()La/pku0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pku0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setDateRange(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Date;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->i:Z

    .line 6
    .line 7
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->d:La/e1a0;

    .line 8
    .line 9
    invoke-virtual {v1}, La/e1a0;->d()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    new-instance v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v4, 0xa

    .line 16
    .line 17
    invoke-static {p1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Ljava/util/Date;

    .line 39
    .line 40
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v4, v1, La/e1a0;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v4, La/yz3;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-virtual {v4, v3, v5}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->b(Ljava/util/List;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    iget-boolean v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->h:Z

    .line 66
    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    if-nez v2, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const/4 v0, 0x0

    .line 73
    :goto_1
    invoke-virtual {p0, p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e(Ljava/util/List;Z)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-virtual {p0, v2}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->c(I)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    invoke-virtual {v1}, La/e1a0;->d()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    sub-int/2addr p1, v0

    .line 88
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->e:Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView$4;

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(I)V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->f()V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final setDateSelectedListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Date;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/date/ScrollableSquaredDateView;->g:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method
