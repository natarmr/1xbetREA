.class public final Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;
.super La/q500;
.source "SourceFile"


# static fields
.field public static final synthetic Y1:I


# instance fields
.field public final K1:La/n0o0;

.field public final L1:La/n0o0;

.field public final M1:La/n0o0;

.field public N1:F

.field public O1:F

.field public final P1:Landroid/graphics/PointF;

.field public final Q1:Landroid/graphics/PointF;

.field public final R1:Landroid/graphics/RectF;

.field public final S1:Landroid/graphics/RectF;

.field public final U1:Landroid/graphics/RectF;

.field public V1:La/zwb;

.field public W1:F

.field public final X1:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 18

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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-direct {v0, v1, v3, v5}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    .line 21
    .line 22
    iput-boolean v5, v0, La/kwb;->a:Z

    .line 23
    .line 24
    iput-object v4, v0, La/kwb;->b:La/mwb;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    iput-boolean v3, v0, La/kwb;->c:Z

    .line 28
    .line 29
    iput-boolean v3, v0, La/kwb;->d:Z

    .line 30
    .line 31
    const v4, 0x3f666666    # 0.9f

    .line 32
    .line 33
    .line 34
    iput v4, v0, La/kwb;->e:F

    .line 35
    .line 36
    new-instance v4, La/zyj;

    .line 37
    .line 38
    invoke-direct {v4, v5}, La/zyj;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object v4, v0, La/kwb;->f:La/zyj;

    .line 42
    .line 43
    iput-boolean v3, v0, La/kwb;->j:Z

    .line 44
    .line 45
    const-string v4, "No chart data available."

    .line 46
    .line 47
    iput-object v4, v0, La/kwb;->n:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v4, La/xju0;

    .line 50
    .line 51
    invoke-direct {v4}, La/xju0;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v4, v0, La/kwb;->r:La/xju0;

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    iput v6, v0, La/kwb;->t:F

    .line 58
    .line 59
    iput v6, v0, La/kwb;->u:F

    .line 60
    .line 61
    iput v6, v0, La/kwb;->v:F

    .line 62
    .line 63
    iput v6, v0, La/kwb;->w:F

    .line 64
    .line 65
    iput-boolean v5, v0, La/kwb;->x:Z

    .line 66
    .line 67
    iput v6, v0, La/kwb;->z:F

    .line 68
    .line 69
    new-instance v7, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v7, v0, La/kwb;->A:Ljava/util/ArrayList;

    .line 75
    .line 76
    iput-boolean v5, v0, La/kwb;->B:Z

    .line 77
    .line 78
    invoke-virtual {v0, v5}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 79
    .line 80
    .line 81
    new-instance v7, La/lwb;

    .line 82
    .line 83
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v7, v0, La/kwb;->s:La/lwb;

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    sget-object v8, La/dut0;->a:Landroid/util/DisplayMetrics;

    .line 93
    .line 94
    if-nez v7, :cond_1

    .line 95
    .line 96
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    sput v7, La/dut0;->b:I

    .line 101
    .line 102
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    sput v7, La/dut0;->c:I

    .line 107
    .line 108
    const-string v7, "MPChartLib-Utils"

    .line 109
    .line 110
    const-string v8, "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL"

    .line 111
    .line 112
    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_1
    invoke-static {v7}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-virtual {v8}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    sput v9, La/dut0;->b:I

    .line 125
    .line 126
    invoke-virtual {v8}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    sput v8, La/dut0;->c:I

    .line 131
    .line 132
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    sput-object v7, La/dut0;->a:Landroid/util/DisplayMetrics;

    .line 141
    .line 142
    :goto_1
    const/high16 v7, 0x43fa0000    # 500.0f

    .line 143
    .line 144
    invoke-static {v7}, La/dut0;->c(F)F

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    iput v7, v0, La/kwb;->z:F

    .line 149
    .line 150
    new-instance v7, La/bck;

    .line 151
    .line 152
    invoke-direct {v7}, La/cgd;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v8, "Description Label"

    .line 156
    .line 157
    iput-object v8, v7, La/bck;->f:Ljava/lang/String;

    .line 158
    .line 159
    sget-object v8, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    .line 160
    .line 161
    iput-object v8, v7, La/bck;->g:Landroid/graphics/Paint$Align;

    .line 162
    .line 163
    const/high16 v8, 0x41000000    # 8.0f

    .line 164
    .line 165
    invoke-static {v8}, La/dut0;->c(F)F

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    iput v9, v7, La/cgd;->d:F

    .line 170
    .line 171
    iput-object v7, v0, La/kwb;->k:La/bck;

    .line 172
    .line 173
    new-instance v7, La/vjz;

    .line 174
    .line 175
    invoke-direct {v7}, La/cgd;-><init>()V

    .line 176
    .line 177
    .line 178
    new-array v9, v5, [La/wjz;

    .line 179
    .line 180
    iput-object v9, v7, La/vjz;->f:[La/wjz;

    .line 181
    .line 182
    iput v3, v7, La/vjz;->g:I

    .line 183
    .line 184
    const/4 v9, 0x3

    .line 185
    iput v9, v7, La/vjz;->h:I

    .line 186
    .line 187
    iput v3, v7, La/vjz;->i:I

    .line 188
    .line 189
    iput v3, v7, La/vjz;->j:I

    .line 190
    .line 191
    const/4 v10, 0x4

    .line 192
    iput v10, v7, La/vjz;->k:I

    .line 193
    .line 194
    iput v8, v7, La/vjz;->l:F

    .line 195
    .line 196
    const/high16 v8, 0x40400000    # 3.0f

    .line 197
    .line 198
    iput v8, v7, La/vjz;->m:F

    .line 199
    .line 200
    const/high16 v11, 0x40c00000    # 6.0f

    .line 201
    .line 202
    iput v11, v7, La/vjz;->n:F

    .line 203
    .line 204
    const/high16 v11, 0x40a00000    # 5.0f

    .line 205
    .line 206
    iput v11, v7, La/vjz;->o:F

    .line 207
    .line 208
    iput v8, v7, La/vjz;->p:F

    .line 209
    .line 210
    const v12, 0x3f733333    # 0.95f

    .line 211
    .line 212
    .line 213
    iput v12, v7, La/vjz;->q:F

    .line 214
    .line 215
    iput v6, v7, La/vjz;->r:F

    .line 216
    .line 217
    iput v6, v7, La/vjz;->s:F

    .line 218
    .line 219
    new-instance v12, Ljava/util/ArrayList;

    .line 220
    .line 221
    const/16 v13, 0x10

    .line 222
    .line 223
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 224
    .line 225
    .line 226
    iput-object v12, v7, La/vjz;->t:Ljava/util/ArrayList;

    .line 227
    .line 228
    new-instance v12, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 231
    .line 232
    .line 233
    iput-object v12, v7, La/vjz;->u:Ljava/util/ArrayList;

    .line 234
    .line 235
    new-instance v12, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    .line 239
    .line 240
    iput-object v12, v7, La/vjz;->v:Ljava/util/ArrayList;

    .line 241
    .line 242
    const/high16 v12, 0x41200000    # 10.0f

    .line 243
    .line 244
    invoke-static {v12}, La/dut0;->c(F)F

    .line 245
    .line 246
    .line 247
    move-result v14

    .line 248
    iput v14, v7, La/cgd;->d:F

    .line 249
    .line 250
    invoke-static {v11}, La/dut0;->c(F)F

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    iput v11, v7, La/cgd;->b:F

    .line 255
    .line 256
    invoke-static {v8}, La/dut0;->c(F)F

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    iput v11, v7, La/cgd;->c:F

    .line 261
    .line 262
    iput-object v7, v0, La/kwb;->l:La/vjz;

    .line 263
    .line 264
    new-instance v11, La/xjz;

    .line 265
    .line 266
    const/16 v14, 0x9

    .line 267
    .line 268
    invoke-direct {v11, v4, v14}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 269
    .line 270
    .line 271
    new-instance v15, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {v15, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 274
    .line 275
    .line 276
    iput-object v15, v11, La/xjz;->f:Ljava/util/ArrayList;

    .line 277
    .line 278
    new-instance v13, Landroid/graphics/Paint$FontMetrics;

    .line 279
    .line 280
    invoke-direct {v13}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    .line 281
    .line 282
    .line 283
    iput-object v13, v11, La/xjz;->g:Landroid/graphics/Paint$FontMetrics;

    .line 284
    .line 285
    new-instance v13, Landroid/graphics/Path;

    .line 286
    .line 287
    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    .line 288
    .line 289
    .line 290
    iput-object v13, v11, La/xjz;->h:Landroid/graphics/Path;

    .line 291
    .line 292
    iput-object v7, v11, La/xjz;->e:La/vjz;

    .line 293
    .line 294
    new-instance v7, Landroid/graphics/Paint;

    .line 295
    .line 296
    invoke-direct {v7, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 297
    .line 298
    .line 299
    iput-object v7, v11, La/xjz;->c:Landroid/graphics/Paint;

    .line 300
    .line 301
    const/high16 v13, 0x41100000    # 9.0f

    .line 302
    .line 303
    invoke-static {v13}, La/dut0;->c(F)F

    .line 304
    .line 305
    .line 306
    move-result v15

    .line 307
    invoke-virtual {v7, v15}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 308
    .line 309
    .line 310
    sget-object v15, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 311
    .line 312
    invoke-virtual {v7, v15}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 313
    .line 314
    .line 315
    new-instance v7, Landroid/graphics/Paint;

    .line 316
    .line 317
    invoke-direct {v7, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 318
    .line 319
    .line 320
    iput-object v7, v11, La/xjz;->d:Landroid/graphics/Paint;

    .line 321
    .line 322
    sget-object v15, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 323
    .line 324
    invoke-virtual {v7, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 325
    .line 326
    .line 327
    iput-object v11, v0, La/kwb;->o:La/xjz;

    .line 328
    .line 329
    new-instance v7, La/urv0;

    .line 330
    .line 331
    invoke-direct {v7}, La/wa5;-><init>()V

    .line 332
    .line 333
    .line 334
    iput v3, v7, La/urv0;->v:I

    .line 335
    .line 336
    iput-boolean v5, v7, La/urv0;->w:Z

    .line 337
    .line 338
    iput v3, v7, La/urv0;->x:I

    .line 339
    .line 340
    const/high16 v11, 0x40800000    # 4.0f

    .line 341
    .line 342
    invoke-static {v11}, La/dut0;->c(F)F

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    iput v11, v7, La/cgd;->c:F

    .line 347
    .line 348
    iput-object v7, v0, La/kwb;->i:La/urv0;

    .line 349
    .line 350
    new-instance v7, Landroid/graphics/Paint;

    .line 351
    .line 352
    invoke-direct {v7, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 353
    .line 354
    .line 355
    iput-object v7, v0, La/kwb;->g:Landroid/graphics/Paint;

    .line 356
    .line 357
    new-instance v7, Landroid/graphics/Paint;

    .line 358
    .line 359
    invoke-direct {v7, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 360
    .line 361
    .line 362
    iput-object v7, v0, La/kwb;->h:Landroid/graphics/Paint;

    .line 363
    .line 364
    const/16 v11, 0xbd

    .line 365
    .line 366
    move/from16 p2, v8

    .line 367
    .line 368
    const/16 v8, 0x33

    .line 369
    .line 370
    move/from16 p3, v12

    .line 371
    .line 372
    const/16 v12, 0xf7

    .line 373
    .line 374
    invoke-static {v12, v11, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 375
    .line 376
    .line 377
    move-result v8

    .line 378
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 379
    .line 380
    .line 381
    iget-object v7, v0, La/kwb;->h:Landroid/graphics/Paint;

    .line 382
    .line 383
    sget-object v8, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 384
    .line 385
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 386
    .line 387
    .line 388
    iget-object v7, v0, La/kwb;->h:Landroid/graphics/Paint;

    .line 389
    .line 390
    const/high16 v11, 0x41400000    # 12.0f

    .line 391
    .line 392
    invoke-static {v11}, La/dut0;->c(F)F

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 397
    .line 398
    .line 399
    iget-boolean v7, v0, La/kwb;->a:Z

    .line 400
    .line 401
    if-eqz v7, :cond_2

    .line 402
    .line 403
    const-string v7, ""

    .line 404
    .line 405
    const-string v11, "Chart.init()"

    .line 406
    .line 407
    invoke-static {v7, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 408
    .line 409
    .line 410
    :cond_2
    new-instance v7, La/a2w0;

    .line 411
    .line 412
    invoke-direct {v7, v3}, La/a2w0;-><init>(I)V

    .line 413
    .line 414
    .line 415
    iput-object v7, v0, La/eu5;->v1:La/a2w0;

    .line 416
    .line 417
    new-instance v7, La/a2w0;

    .line 418
    .line 419
    invoke-direct {v7, v2}, La/a2w0;-><init>(I)V

    .line 420
    .line 421
    .line 422
    iput-object v7, v0, La/eu5;->w1:La/a2w0;

    .line 423
    .line 424
    new-instance v7, La/ywq0;

    .line 425
    .line 426
    invoke-direct {v7, v4}, La/ywq0;-><init>(La/xju0;)V

    .line 427
    .line 428
    .line 429
    iput-object v7, v0, La/eu5;->z1:La/ywq0;

    .line 430
    .line 431
    new-instance v7, La/ywq0;

    .line 432
    .line 433
    invoke-direct {v7, v4}, La/ywq0;-><init>(La/xju0;)V

    .line 434
    .line 435
    .line 436
    iput-object v7, v0, La/eu5;->A1:La/ywq0;

    .line 437
    .line 438
    new-instance v7, La/b2w0;

    .line 439
    .line 440
    iget-object v11, v0, La/eu5;->v1:La/a2w0;

    .line 441
    .line 442
    iget-object v12, v0, La/eu5;->z1:La/ywq0;

    .line 443
    .line 444
    invoke-direct {v7, v4, v11, v12}, La/b2w0;-><init>(La/xju0;La/a2w0;La/ywq0;)V

    .line 445
    .line 446
    .line 447
    iput-object v7, v0, La/eu5;->x1:La/b2w0;

    .line 448
    .line 449
    new-instance v7, La/b2w0;

    .line 450
    .line 451
    iget-object v11, v0, La/eu5;->w1:La/a2w0;

    .line 452
    .line 453
    iget-object v12, v0, La/eu5;->A1:La/ywq0;

    .line 454
    .line 455
    invoke-direct {v7, v4, v11, v12}, La/b2w0;-><init>(La/xju0;La/a2w0;La/ywq0;)V

    .line 456
    .line 457
    .line 458
    iput-object v7, v0, La/eu5;->y1:La/b2w0;

    .line 459
    .line 460
    new-instance v7, La/vrv0;

    .line 461
    .line 462
    iget-object v11, v0, La/kwb;->i:La/urv0;

    .line 463
    .line 464
    iget-object v12, v0, La/eu5;->z1:La/ywq0;

    .line 465
    .line 466
    invoke-direct {v7, v4, v12, v11}, La/xa5;-><init>(La/xju0;La/ywq0;La/wa5;)V

    .line 467
    .line 468
    .line 469
    new-instance v12, Landroid/graphics/Path;

    .line 470
    .line 471
    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    .line 472
    .line 473
    .line 474
    iput-object v12, v7, La/vrv0;->i:Landroid/graphics/Path;

    .line 475
    .line 476
    new-array v12, v2, [F

    .line 477
    .line 478
    iput-object v12, v7, La/vrv0;->j:[F

    .line 479
    .line 480
    new-instance v12, Landroid/graphics/RectF;

    .line 481
    .line 482
    invoke-direct {v12}, Landroid/graphics/RectF;-><init>()V

    .line 483
    .line 484
    .line 485
    iput-object v12, v7, La/vrv0;->k:Landroid/graphics/RectF;

    .line 486
    .line 487
    new-array v12, v2, [F

    .line 488
    .line 489
    iput-object v12, v7, La/vrv0;->l:[F

    .line 490
    .line 491
    new-instance v12, Landroid/graphics/RectF;

    .line 492
    .line 493
    invoke-direct {v12}, Landroid/graphics/RectF;-><init>()V

    .line 494
    .line 495
    .line 496
    new-instance v12, Landroid/graphics/Path;

    .line 497
    .line 498
    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    .line 499
    .line 500
    .line 501
    iput-object v11, v7, La/vrv0;->h:La/urv0;

    .line 502
    .line 503
    iget-object v11, v7, La/xa5;->f:Landroid/graphics/Paint;

    .line 504
    .line 505
    const/high16 v12, -0x1000000

    .line 506
    .line 507
    invoke-virtual {v11, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v11, v8}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 511
    .line 512
    .line 513
    move/from16 v16, v13

    .line 514
    .line 515
    invoke-static/range {p3 .. p3}, La/dut0;->c(F)F

    .line 516
    .line 517
    .line 518
    move-result v13

    .line 519
    invoke-virtual {v11, v13}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 520
    .line 521
    .line 522
    iput-object v7, v0, La/eu5;->B1:La/vrv0;

    .line 523
    .line 524
    new-instance v7, La/owb;

    .line 525
    .line 526
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 527
    .line 528
    .line 529
    new-instance v11, Ljava/util/ArrayList;

    .line 530
    .line 531
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 532
    .line 533
    .line 534
    iput-object v11, v7, La/owb;->b:Ljava/util/ArrayList;

    .line 535
    .line 536
    iput-object v0, v7, La/owb;->a:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 537
    .line 538
    invoke-virtual {v0, v7}, La/kwb;->setHighlighter(La/owb;)V

    .line 539
    .line 540
    .line 541
    new-instance v7, La/fu5;

    .line 542
    .line 543
    invoke-direct {v7}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 544
    .line 545
    .line 546
    iput v5, v7, La/ywb;->a:I

    .line 547
    .line 548
    iput-object v0, v7, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 549
    .line 550
    new-instance v11, Landroid/view/GestureDetector;

    .line 551
    .line 552
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 553
    .line 554
    .line 555
    move-result-object v13

    .line 556
    invoke-direct {v11, v13, v7}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 557
    .line 558
    .line 559
    iput-object v11, v7, La/ywb;->c:Landroid/view/GestureDetector;

    .line 560
    .line 561
    new-instance v11, Landroid/graphics/Matrix;

    .line 562
    .line 563
    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 564
    .line 565
    .line 566
    iput-object v11, v7, La/fu5;->e:Landroid/graphics/Matrix;

    .line 567
    .line 568
    new-instance v11, Landroid/graphics/Matrix;

    .line 569
    .line 570
    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 571
    .line 572
    .line 573
    iput-object v11, v7, La/fu5;->f:Landroid/graphics/Matrix;

    .line 574
    .line 575
    invoke-static {v6, v6}, La/cp10;->b(FF)La/cp10;

    .line 576
    .line 577
    .line 578
    move-result-object v11

    .line 579
    iput-object v11, v7, La/fu5;->g:La/cp10;

    .line 580
    .line 581
    invoke-static {v6, v6}, La/cp10;->b(FF)La/cp10;

    .line 582
    .line 583
    .line 584
    move-result-object v11

    .line 585
    iput-object v11, v7, La/fu5;->h:La/cp10;

    .line 586
    .line 587
    const/high16 v11, 0x3f800000    # 1.0f

    .line 588
    .line 589
    iput v11, v7, La/fu5;->i:F

    .line 590
    .line 591
    iput v11, v7, La/fu5;->j:F

    .line 592
    .line 593
    iput v11, v7, La/fu5;->k:F

    .line 594
    .line 595
    const-wide/16 v9, 0x0

    .line 596
    .line 597
    iput-wide v9, v7, La/fu5;->n:J

    .line 598
    .line 599
    move/from16 v17, v11

    .line 600
    .line 601
    invoke-static {v6, v6}, La/cp10;->b(FF)La/cp10;

    .line 602
    .line 603
    .line 604
    move-result-object v11

    .line 605
    iput-object v11, v7, La/fu5;->o:La/cp10;

    .line 606
    .line 607
    invoke-static {v6, v6}, La/cp10;->b(FF)La/cp10;

    .line 608
    .line 609
    .line 610
    move-result-object v11

    .line 611
    iput-object v11, v7, La/fu5;->p:La/cp10;

    .line 612
    .line 613
    iget-object v11, v4, La/xju0;->a:Landroid/graphics/Matrix;

    .line 614
    .line 615
    iput-object v11, v7, La/fu5;->e:Landroid/graphics/Matrix;

    .line 616
    .line 617
    invoke-static/range {p2 .. p2}, La/dut0;->c(F)F

    .line 618
    .line 619
    .line 620
    move-result v11

    .line 621
    iput v11, v7, La/fu5;->q:F

    .line 622
    .line 623
    const/high16 v11, 0x40600000    # 3.5f

    .line 624
    .line 625
    invoke-static {v11}, La/dut0;->c(F)F

    .line 626
    .line 627
    .line 628
    move-result v11

    .line 629
    iput v11, v7, La/fu5;->r:F

    .line 630
    .line 631
    iput-object v7, v0, La/kwb;->m:La/ywb;

    .line 632
    .line 633
    new-instance v7, Landroid/graphics/Paint;

    .line 634
    .line 635
    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 636
    .line 637
    .line 638
    iput-object v7, v0, La/eu5;->o1:Landroid/graphics/Paint;

    .line 639
    .line 640
    invoke-virtual {v7, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 641
    .line 642
    .line 643
    iget-object v7, v0, La/eu5;->o1:Landroid/graphics/Paint;

    .line 644
    .line 645
    const/16 v11, 0xf0

    .line 646
    .line 647
    invoke-static {v11, v11, v11}, Landroid/graphics/Color;->rgb(III)I

    .line 648
    .line 649
    .line 650
    move-result v11

    .line 651
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 652
    .line 653
    .line 654
    new-instance v7, Landroid/graphics/Paint;

    .line 655
    .line 656
    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 657
    .line 658
    .line 659
    iput-object v7, v0, La/eu5;->p1:Landroid/graphics/Paint;

    .line 660
    .line 661
    sget-object v11, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 662
    .line 663
    invoke-virtual {v7, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 664
    .line 665
    .line 666
    iget-object v7, v0, La/eu5;->p1:Landroid/graphics/Paint;

    .line 667
    .line 668
    invoke-virtual {v7, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 669
    .line 670
    .line 671
    iget-object v7, v0, La/eu5;->p1:Landroid/graphics/Paint;

    .line 672
    .line 673
    invoke-static/range {v17 .. v17}, La/dut0;->c(F)F

    .line 674
    .line 675
    .line 676
    move-result v12

    .line 677
    invoke-virtual {v7, v12}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 678
    .line 679
    .line 680
    new-instance v7, La/s500;

    .line 681
    .line 682
    iget-object v12, v0, La/kwb;->s:La/lwb;

    .line 683
    .line 684
    invoke-direct {v7, v4, v14}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 685
    .line 686
    .line 687
    iput-object v12, v7, La/cbj;->c:La/lwb;

    .line 688
    .line 689
    new-instance v4, Landroid/graphics/Paint;

    .line 690
    .line 691
    invoke-direct {v4, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 692
    .line 693
    .line 694
    iput-object v4, v7, La/cbj;->d:Landroid/graphics/Paint;

    .line 695
    .line 696
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 697
    .line 698
    .line 699
    new-instance v4, Landroid/graphics/Paint;

    .line 700
    .line 701
    const/4 v13, 0x4

    .line 702
    invoke-direct {v4, v13}, Landroid/graphics/Paint;-><init>(I)V

    .line 703
    .line 704
    .line 705
    new-instance v4, Landroid/graphics/Paint;

    .line 706
    .line 707
    invoke-direct {v4, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 708
    .line 709
    .line 710
    iput-object v4, v7, La/cbj;->f:Landroid/graphics/Paint;

    .line 711
    .line 712
    const/16 v12, 0x3f

    .line 713
    .line 714
    invoke-static {v12, v12, v12}, Landroid/graphics/Color;->rgb(III)I

    .line 715
    .line 716
    .line 717
    move-result v12

    .line 718
    invoke-virtual {v4, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 722
    .line 723
    .line 724
    invoke-static/range {v16 .. v16}, La/dut0;->c(F)F

    .line 725
    .line 726
    .line 727
    move-result v8

    .line 728
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 729
    .line 730
    .line 731
    new-instance v4, Landroid/graphics/Paint;

    .line 732
    .line 733
    invoke-direct {v4, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 734
    .line 735
    .line 736
    iput-object v4, v7, La/cbj;->e:Landroid/graphics/Paint;

    .line 737
    .line 738
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 739
    .line 740
    .line 741
    const/high16 v8, 0x40000000    # 2.0f

    .line 742
    .line 743
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 744
    .line 745
    .line 746
    const/16 v11, 0xbb

    .line 747
    .line 748
    const/16 v12, 0x73

    .line 749
    .line 750
    const/16 v14, 0xff

    .line 751
    .line 752
    invoke-static {v14, v11, v12}, Landroid/graphics/Color;->rgb(III)I

    .line 753
    .line 754
    .line 755
    move-result v11

    .line 756
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 757
    .line 758
    .line 759
    new-instance v4, La/hu5;

    .line 760
    .line 761
    invoke-direct {v4, v7, v5}, La/hu5;-><init>(Ljava/lang/Object;B)V

    .line 762
    .line 763
    .line 764
    iput-object v4, v7, La/s500;->g:La/hu5;

    .line 765
    .line 766
    new-instance v4, Landroid/graphics/Path;

    .line 767
    .line 768
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 769
    .line 770
    .line 771
    iput-object v4, v7, La/s500;->h:Landroid/graphics/Path;

    .line 772
    .line 773
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 774
    .line 775
    iput-object v4, v7, La/s500;->m:Landroid/graphics/Bitmap$Config;

    .line 776
    .line 777
    new-instance v4, Landroid/graphics/Path;

    .line 778
    .line 779
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 780
    .line 781
    .line 782
    iput-object v4, v7, La/s500;->n:Landroid/graphics/Path;

    .line 783
    .line 784
    new-instance v4, Landroid/graphics/Path;

    .line 785
    .line 786
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 787
    .line 788
    .line 789
    iput-object v4, v7, La/s500;->o:Landroid/graphics/Path;

    .line 790
    .line 791
    const/4 v13, 0x4

    .line 792
    new-array v4, v13, [F

    .line 793
    .line 794
    iput-object v4, v7, La/s500;->p:[F

    .line 795
    .line 796
    new-instance v4, Landroid/graphics/Path;

    .line 797
    .line 798
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 799
    .line 800
    .line 801
    iput-object v4, v7, La/s500;->q:Landroid/graphics/Path;

    .line 802
    .line 803
    new-instance v4, Ljava/util/HashMap;

    .line 804
    .line 805
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 806
    .line 807
    .line 808
    iput-object v4, v7, La/s500;->r:Ljava/util/HashMap;

    .line 809
    .line 810
    new-array v4, v2, [F

    .line 811
    .line 812
    iput-object v4, v7, La/s500;->s:[F

    .line 813
    .line 814
    iput-object v0, v7, La/s500;->i:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 815
    .line 816
    new-instance v4, Landroid/graphics/Paint;

    .line 817
    .line 818
    invoke-direct {v4, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 819
    .line 820
    .line 821
    iput-object v4, v7, La/s500;->j:Landroid/graphics/Paint;

    .line 822
    .line 823
    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 824
    .line 825
    .line 826
    const/4 v11, -0x1

    .line 827
    invoke-virtual {v4, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 828
    .line 829
    .line 830
    iput-object v7, v0, La/kwb;->p:La/cbj;

    .line 831
    .line 832
    const/16 v4, 0x64

    .line 833
    .line 834
    iput v4, v0, La/eu5;->f1:I

    .line 835
    .line 836
    iput-boolean v5, v0, La/eu5;->g1:Z

    .line 837
    .line 838
    iput-boolean v5, v0, La/eu5;->h1:Z

    .line 839
    .line 840
    iput-boolean v3, v0, La/eu5;->i1:Z

    .line 841
    .line 842
    iput-boolean v3, v0, La/eu5;->j1:Z

    .line 843
    .line 844
    iput-boolean v3, v0, La/eu5;->k1:Z

    .line 845
    .line 846
    iput-boolean v3, v0, La/eu5;->l1:Z

    .line 847
    .line 848
    iput-boolean v3, v0, La/eu5;->m1:Z

    .line 849
    .line 850
    iput-boolean v3, v0, La/eu5;->n1:Z

    .line 851
    .line 852
    iput-boolean v5, v0, La/eu5;->q1:Z

    .line 853
    .line 854
    iput-boolean v5, v0, La/eu5;->r1:Z

    .line 855
    .line 856
    iput-boolean v5, v0, La/eu5;->s1:Z

    .line 857
    .line 858
    const/high16 v4, 0x41700000    # 15.0f

    .line 859
    .line 860
    iput v4, v0, La/eu5;->t1:F

    .line 861
    .line 862
    iput-boolean v5, v0, La/eu5;->u1:Z

    .line 863
    .line 864
    iput-wide v9, v0, La/eu5;->C1:J

    .line 865
    .line 866
    iput-wide v9, v0, La/eu5;->D1:J

    .line 867
    .line 868
    new-instance v4, Landroid/graphics/RectF;

    .line 869
    .line 870
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 871
    .line 872
    .line 873
    iput-object v4, v0, La/eu5;->E1:Landroid/graphics/RectF;

    .line 874
    .line 875
    new-instance v4, Landroid/graphics/Matrix;

    .line 876
    .line 877
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 878
    .line 879
    .line 880
    iput-object v4, v0, La/eu5;->F1:Landroid/graphics/Matrix;

    .line 881
    .line 882
    new-instance v4, Landroid/graphics/Matrix;

    .line 883
    .line 884
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 885
    .line 886
    .line 887
    iput-boolean v5, v0, La/eu5;->G1:Z

    .line 888
    .line 889
    sget-object v4, La/bp10;->d:La/z960;

    .line 890
    .line 891
    invoke-virtual {v4}, La/z960;->b()La/y960;

    .line 892
    .line 893
    .line 894
    move-result-object v7

    .line 895
    check-cast v7, La/bp10;

    .line 896
    .line 897
    const-wide/16 v9, 0x0

    .line 898
    .line 899
    iput-wide v9, v7, La/bp10;->b:D

    .line 900
    .line 901
    iput-wide v9, v7, La/bp10;->c:D

    .line 902
    .line 903
    iput-object v7, v0, La/eu5;->H1:La/bp10;

    .line 904
    .line 905
    invoke-virtual {v4}, La/z960;->b()La/y960;

    .line 906
    .line 907
    .line 908
    move-result-object v4

    .line 909
    check-cast v4, La/bp10;

    .line 910
    .line 911
    iput-wide v9, v4, La/bp10;->b:D

    .line 912
    .line 913
    iput-wide v9, v4, La/bp10;->c:D

    .line 914
    .line 915
    iput-object v4, v0, La/eu5;->I1:La/bp10;

    .line 916
    .line 917
    new-array v4, v2, [F

    .line 918
    .line 919
    iput-object v4, v0, La/eu5;->J1:[F

    .line 920
    .line 921
    new-instance v4, La/ryl;

    .line 922
    .line 923
    const/16 v7, 0x16

    .line 924
    .line 925
    invoke-direct {v4, v1, v7}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 926
    .line 927
    .line 928
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 929
    .line 930
    .line 931
    move-result-object v4

    .line 932
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->K1:La/n0o0;

    .line 933
    .line 934
    new-instance v4, La/ryl;

    .line 935
    .line 936
    const/16 v7, 0x17

    .line 937
    .line 938
    invoke-direct {v4, v1, v7}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 939
    .line 940
    .line 941
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 942
    .line 943
    .line 944
    move-result-object v4

    .line 945
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->L1:La/n0o0;

    .line 946
    .line 947
    new-instance v4, La/ryl;

    .line 948
    .line 949
    const/16 v7, 0x18

    .line 950
    .line 951
    invoke-direct {v4, v1, v7}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 952
    .line 953
    .line 954
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 955
    .line 956
    .line 957
    move-result-object v4

    .line 958
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->M1:La/n0o0;

    .line 959
    .line 960
    new-instance v4, Landroid/graphics/PointF;

    .line 961
    .line 962
    invoke-direct {v4}, Landroid/graphics/PointF;-><init>()V

    .line 963
    .line 964
    .line 965
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->P1:Landroid/graphics/PointF;

    .line 966
    .line 967
    new-instance v4, Landroid/graphics/PointF;

    .line 968
    .line 969
    invoke-direct {v4}, Landroid/graphics/PointF;-><init>()V

    .line 970
    .line 971
    .line 972
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->Q1:Landroid/graphics/PointF;

    .line 973
    .line 974
    new-instance v4, Landroid/graphics/RectF;

    .line 975
    .line 976
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 977
    .line 978
    .line 979
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->R1:Landroid/graphics/RectF;

    .line 980
    .line 981
    new-instance v4, Landroid/graphics/RectF;

    .line 982
    .line 983
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 984
    .line 985
    .line 986
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->S1:Landroid/graphics/RectF;

    .line 987
    .line 988
    new-instance v4, Landroid/graphics/RectF;

    .line 989
    .line 990
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 991
    .line 992
    .line 993
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->U1:Landroid/graphics/RectF;

    .line 994
    .line 995
    new-instance v4, La/ryl;

    .line 996
    .line 997
    const/16 v7, 0x19

    .line 998
    .line 999
    invoke-direct {v4, v1, v7}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 1000
    .line 1001
    .line 1002
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v4

    .line 1006
    iput-object v4, v0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->X1:La/n0o0;

    .line 1007
    .line 1008
    invoke-virtual {v0}, La/kwb;->getLegend()La/vjz;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v4

    .line 1012
    iput-boolean v5, v4, La/cgd;->a:Z

    .line 1013
    .line 1014
    const/high16 v4, 0x42400000    # 48.0f

    .line 1015
    .line 1016
    invoke-static {v1, v4}, La/i120;->Y(Landroid/content/Context;F)I

    .line 1017
    .line 1018
    .line 1019
    move-result v4

    .line 1020
    int-to-float v4, v4

    .line 1021
    div-float v7, v4, v8

    .line 1022
    .line 1023
    iput-boolean v3, v0, La/eu5;->G1:Z

    .line 1024
    .line 1025
    new-instance v8, La/du5;

    .line 1026
    .line 1027
    invoke-direct {v8, v0, v4, v7}, La/du5;-><init>(Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;FF)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v0, v8}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v4

    .line 1037
    const v7, 0x7f05000f

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v4

    .line 1044
    if-eqz v4, :cond_3

    .line 1045
    .line 1046
    invoke-direct {v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getDp16()F

    .line 1047
    .line 1048
    .line 1049
    move-result v4

    .line 1050
    invoke-direct {v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getDp16()F

    .line 1051
    .line 1052
    .line 1053
    move-result v7

    .line 1054
    invoke-virtual {v0, v6}, La/kwb;->setExtraLeftOffset(F)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v0, v4}, La/kwb;->setExtraTopOffset(F)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v0, v6}, La/kwb;->setExtraRightOffset(F)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v0, v7}, La/kwb;->setExtraBottomOffset(F)V

    .line 1064
    .line 1065
    .line 1066
    invoke-direct {v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getTextPaint()Landroid/text/TextPaint;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v4

    .line 1070
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v7

    .line 1074
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v7

    .line 1078
    iget v7, v7, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 1079
    .line 1080
    const/high16 v8, 0x41600000    # 14.0f

    .line 1081
    .line 1082
    mul-float/2addr v7, v8

    .line 1083
    float-to-double v7, v7

    .line 1084
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 1085
    .line 1086
    .line 1087
    move-result-wide v7

    .line 1088
    double-to-float v7, v7

    .line 1089
    float-to-int v7, v7

    .line 1090
    int-to-float v7, v7

    .line 1091
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1092
    .line 1093
    .line 1094
    :cond_3
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v0}, La/kwb;->getDescription()La/bck;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v4

    .line 1101
    iput-boolean v5, v4, La/cgd;->a:Z

    .line 1102
    .line 1103
    new-instance v4, La/u500;

    .line 1104
    .line 1105
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1106
    .line 1107
    .line 1108
    const v7, -0x800001

    .line 1109
    .line 1110
    .line 1111
    iput v7, v4, La/mwb;->a:F

    .line 1112
    .line 1113
    const v8, 0x7f7fffff    # Float.MAX_VALUE

    .line 1114
    .line 1115
    .line 1116
    iput v8, v4, La/mwb;->b:F

    .line 1117
    .line 1118
    iput v7, v4, La/mwb;->c:F

    .line 1119
    .line 1120
    iput v8, v4, La/mwb;->d:F

    .line 1121
    .line 1122
    iput v7, v4, La/mwb;->e:F

    .line 1123
    .line 1124
    iput v8, v4, La/mwb;->f:F

    .line 1125
    .line 1126
    iput v7, v4, La/mwb;->g:F

    .line 1127
    .line 1128
    iput v8, v4, La/mwb;->h:F

    .line 1129
    .line 1130
    new-instance v7, Ljava/util/ArrayList;

    .line 1131
    .line 1132
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1133
    .line 1134
    .line 1135
    iput-object v7, v4, La/mwb;->i:Ljava/util/ArrayList;

    .line 1136
    .line 1137
    invoke-virtual {v0, v4}, La/kwb;->setData(La/mwb;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v0}, La/kwb;->getLegend()La/vjz;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v4

    .line 1144
    const/4 v7, 0x6

    .line 1145
    iput v7, v4, La/vjz;->k:I

    .line 1146
    .line 1147
    iput v11, v4, La/cgd;->e:I

    .line 1148
    .line 1149
    invoke-virtual {v0}, La/kwb;->getXAxis()La/urv0;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v4

    .line 1153
    iput v11, v4, La/cgd;->e:I

    .line 1154
    .line 1155
    iput-boolean v3, v4, La/urv0;->w:Z

    .line 1156
    .line 1157
    iput v2, v4, La/urv0;->x:I

    .line 1158
    .line 1159
    const/4 v7, 0x3

    .line 1160
    iput v7, v4, La/wa5;->l:I

    .line 1161
    .line 1162
    iput-boolean v3, v4, La/wa5;->m:Z

    .line 1163
    .line 1164
    iput-boolean v5, v4, La/wa5;->n:Z

    .line 1165
    .line 1166
    iput v5, v4, La/wa5;->g:I

    .line 1167
    .line 1168
    invoke-virtual {v0}, La/eu5;->getAxisLeft()La/a2w0;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v3

    .line 1172
    iput v11, v3, La/cgd;->e:I

    .line 1173
    .line 1174
    invoke-static/range {v17 .. v17}, La/dut0;->c(F)F

    .line 1175
    .line 1176
    .line 1177
    move-result v4

    .line 1178
    iput v4, v3, La/wa5;->h:F

    .line 1179
    .line 1180
    new-instance v4, Landroid/graphics/DashPathEffect;

    .line 1181
    .line 1182
    new-array v2, v2, [F

    .line 1183
    .line 1184
    fill-array-data v2, :array_0

    .line 1185
    .line 1186
    .line 1187
    invoke-direct {v4, v2, v6}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 1188
    .line 1189
    .line 1190
    iput-object v4, v3, La/wa5;->o:Landroid/graphics/DashPathEffect;

    .line 1191
    .line 1192
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 1193
    .line 1194
    const v2, 0x7f040b15

    .line 1195
    .line 1196
    .line 1197
    invoke-static {v1, v2, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1198
    .line 1199
    .line 1200
    move-result v1

    .line 1201
    iput v1, v3, La/wa5;->g:I

    .line 1202
    .line 1203
    invoke-virtual {v0}, La/eu5;->getAxisRight()La/a2w0;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    iput-boolean v5, v1, La/cgd;->a:Z

    .line 1208
    .line 1209
    invoke-virtual {v0, v5}, La/kwb;->setTouchEnabled(Z)V

    .line 1210
    .line 1211
    .line 1212
    return-void

    .line 1213
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41f00000    # 30.0f
    .end array-data
.end method

.method private final getChartRect()Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, La/kwb;->r:La/xju0;

    .line 2
    .line 3
    iget-object p0, p0, La/xju0;->b:Landroid/graphics/RectF;

    .line 4
    .line 5
    return-object p0
.end method

.method private final getDp16()F
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->X1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getPaint()Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->K1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/Paint;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getRejectColorPaint()Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->L1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/Paint;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getTextPaint()Landroid/text/TextPaint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->M1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/text/TextPaint;

    .line 8
    .line 9
    return-object p0
.end method

.method public static i(Ljava/lang/Long;Z)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, La/rdj;->a:La/rdj;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    :goto_0
    sget-object p0, La/ykq0;->c:La/ykq0;

    .line 13
    .line 14
    new-instance v2, La/znq0;

    .line 15
    .line 16
    invoke-direct {v2, v0, v1}, La/znq0;-><init>(J)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    const/16 v1, 0xf8

    .line 25
    .line 26
    invoke-static {v2, p0, p1, v0, v1}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method


# virtual methods
.method public final getNoBetsAreaSizeX()F
    .locals 0

    .line 1
    iget p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->O1:F

    .line 2
    .line 3
    return p0
.end method

.method public final getStartBetZone()F
    .locals 0

    .line 1
    iget p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->N1:F

    .line 2
    .line 3
    return p0
.end method

.method public final h(Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getChartRect()Landroid/graphics/RectF;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->S1:Landroid/graphics/RectF;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/kwb;->r:La/xju0;

    .line 14
    .line 15
    iget-object v0, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 16
    .line 17
    iget-object v2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->U1:Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Landroid/graphics/RectF;

    .line 23
    .line 24
    iget v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->W1:F

    .line 25
    .line 26
    iget v4, v2, Landroid/graphics/RectF;->top:F

    .line 27
    .line 28
    iget v5, v2, Landroid/graphics/RectF;->right:F

    .line 29
    .line 30
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 31
    .line 32
    invoke-direct {v0, v3, v4, v5, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->R1:Landroid/graphics/RectF;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 38
    .line 39
    .line 40
    iget v0, v2, Landroid/graphics/RectF;->right:F

    .line 41
    .line 42
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    sub-float/2addr v0, v2

    .line 45
    iput v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->O1:F

    .line 46
    .line 47
    new-instance v0, Landroid/graphics/Rect;

    .line 48
    .line 49
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->V1:La/zwb;

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    iget-object v2, v2, La/zwb;->i:Ljava/util/List;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/Long;

    .line 64
    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const-wide/16 v2, 0x0

    .line 73
    .line 74
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    const/4 v2, 0x0

    .line 80
    :goto_1
    invoke-static {v2, p1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->i(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 100
    .line 101
    const/high16 v3, 0x40800000    # 4.0f

    .line 102
    .line 103
    mul-float/2addr v2, v3

    .line 104
    float-to-double v2, v2

    .line 105
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 106
    .line 107
    .line 108
    move-result-wide v2

    .line 109
    double-to-float v2, v2

    .line 110
    float-to-int v2, v2

    .line 111
    int-to-float v2, v2

    .line 112
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getTextPaint()Landroid/text/TextPaint;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    const/4 v5, 0x0

    .line 121
    invoke-virtual {v3, p1, v5, v4, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 122
    .line 123
    .line 124
    iget p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->N1:F

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    cmpg-float v4, p1, v3

    .line 128
    .line 129
    if-gtz v4, :cond_2

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    div-int/lit8 v3, v3, 0x2

    .line 137
    .line 138
    int-to-float v3, v3

    .line 139
    sub-float v3, p1, v3

    .line 140
    .line 141
    :goto_2
    iget p1, v1, Landroid/graphics/RectF;->bottom:F

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    int-to-float v4, v4

    .line 148
    add-float/2addr p1, v4

    .line 149
    add-float/2addr p1, v2

    .line 150
    iget-object v4, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->P1:Landroid/graphics/PointF;

    .line 151
    .line 152
    invoke-virtual {v4, v3, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 153
    .line 154
    .line 155
    iget p1, v1, Landroid/graphics/RectF;->right:F

    .line 156
    .line 157
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    int-to-float v3, v3

    .line 162
    sub-float/2addr p1, v3

    .line 163
    sub-float/2addr p1, v2

    .line 164
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->Q1:Landroid/graphics/PointF;

    .line 165
    .line 166
    iput p1, p0, Landroid/graphics/PointF;->x:F

    .line 167
    .line 168
    iget p1, v1, Landroid/graphics/RectF;->bottom:F

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    int-to-float v0, v0

    .line 175
    add-float/2addr p1, v0

    .line 176
    add-float/2addr p1, v2

    .line 177
    iput p1, p0, Landroid/graphics/PointF;->y:F

    .line 178
    .line 179
    return-void
.end method

.method public final j()[F
    .locals 4

    .line 1
    new-instance v0, La/s8q;

    .line 2
    .line 3
    iget-object v1, p0, La/kwb;->r:La/xju0;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, La/eu5;->v1:La/a2w0;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, La/eu5;->z1:La/ywq0;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3}, La/b2w0;-><init>(La/xju0;La/a2w0;La/ywq0;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/eu5;->v1:La/a2w0;

    .line 22
    .line 23
    iget v1, p0, La/wa5;->t:F

    .line 24
    .line 25
    iget p0, p0, La/wa5;->s:F

    .line 26
    .line 27
    invoke-virtual {v0, v1, p0}, La/xa5;->n1(FF)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, La/b2w0;->p1()[F

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/eu5;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->V1:La/zwb;

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->U1:Landroid/graphics/RectF;

    .line 12
    .line 13
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    iget v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->N1:F

    .line 16
    .line 17
    add-float v5, v2, v3

    .line 18
    .line 19
    iget v6, v1, Landroid/graphics/RectF;->top:F

    .line 20
    .line 21
    iget v8, v1, Landroid/graphics/RectF;->bottom:F

    .line 22
    .line 23
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getPaint()Landroid/graphics/Paint;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    move v7, v5

    .line 28
    move-object v4, p1

    .line 29
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->R1:Landroid/graphics/RectF;

    .line 33
    .line 34
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getRejectColorPaint()Landroid/graphics/Paint;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v4, p1, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    iget-boolean p1, v0, La/zwb;->h:Z

    .line 42
    .line 43
    iget-object v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->V1:La/zwb;

    .line 44
    .line 45
    const-wide/16 v1, 0x0

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, v0, La/zwb;->i:Ljava/util/List;

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    invoke-static {v5, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Long;

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move-wide v5, v1

    .line 67
    :goto_0
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move-object v0, v3

    .line 73
    :goto_1
    invoke-static {v0, p1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->i(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v5, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->P1:Landroid/graphics/PointF;

    .line 78
    .line 79
    iget v6, v5, Landroid/graphics/PointF;->x:F

    .line 80
    .line 81
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 82
    .line 83
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getTextPaint()Landroid/text/TextPaint;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v4, v0, v6, v5, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->V1:La/zwb;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    iget-object v0, v0, La/zwb;->i:Ljava/util/List;

    .line 95
    .line 96
    const/4 v3, 0x2

    .line 97
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/Long;

    .line 102
    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v1

    .line 109
    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :cond_3
    invoke-static {v3, p1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->i(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->Q1:Landroid/graphics/PointF;

    .line 118
    .line 119
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 120
    .line 121
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 122
    .line 123
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getTextPaint()Landroid/text/TextPaint;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v4, p1, v1, v0, p0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    return-void
.end method
