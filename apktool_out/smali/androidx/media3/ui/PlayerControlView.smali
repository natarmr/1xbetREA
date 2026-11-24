.class public Landroidx/media3/ui/PlayerControlView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final i2:[F


# instance fields
.field public final A:Landroid/widget/ImageView;

.field public final A1:Ljava/lang/String;

.field public final B:Landroid/widget/ImageView;

.field public final B1:Ljava/lang/String;

.field public final C1:Landroid/graphics/drawable/Drawable;

.field public final D1:Landroid/graphics/drawable/Drawable;

.field public final E1:F

.field public final F1:F

.field public final G1:Ljava/lang/String;

.field public final H1:Ljava/lang/String;

.field public final I1:Landroid/graphics/drawable/Drawable;

.field public final J1:Landroid/graphics/drawable/Drawable;

.field public final K1:Ljava/lang/String;

.field public final L1:Ljava/lang/String;

.field public final M1:Landroid/graphics/drawable/Drawable;

.field public final N1:Landroid/graphics/drawable/Drawable;

.field public final O1:Ljava/lang/String;

.field public final P1:Ljava/lang/String;

.field public Q1:La/my90;

.field public R1:Z

.field public S1:Z

.field public U1:Z

.field public V1:Z

.field public W1:Z

.field public X1:Z

.field public Y1:I

.field public Z1:Z

.field public final a:La/n1a0;

.field public a2:I

.field public final b:Landroid/content/res/Resources;

.field public b2:I

.field public final c:Landroid/os/Handler;

.field public c2:[J

.field public final d:La/z0a0;

.field public d2:[Z

.field public final e:Ljava/lang/Class;

.field public final e2:[J

.field public final f:Ljava/lang/reflect/Method;

.field public final f1:Landroid/widget/ImageView;

.field public final f2:[Z

.field public final g:Ljava/lang/reflect/Method;

.field public final g1:Landroid/widget/ImageView;

.field public g2:J

.field public final h:Ljava/lang/Class;

.field public final h1:Landroid/widget/ImageView;

.field public h2:Z

.field public final i:Ljava/lang/reflect/Method;

.field public final i1:Landroid/widget/ImageView;

.field public final j:Ljava/lang/reflect/Method;

.field public final j1:Landroid/view/View;

.field public final k:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final k1:Landroid/view/View;

.field public final l:Landroidx/recyclerview/widget/RecyclerView;

.field public final l1:Landroid/view/View;

.field public final m:La/e1a0;

.field public final m1:Landroid/widget/TextView;

.field public final n:La/b1a0;

.field public final n1:Landroid/widget/TextView;

.field public final o:La/y0a0;

.field public final o1:La/zxj;

.field public final p:La/y0a0;

.field public final p1:Ljava/lang/StringBuilder;

.field public final q:La/psc;

.field public final q1:Ljava/util/Formatter;

.field public final r:Landroid/widget/PopupWindow;

.field public final r1:La/amq0;

.field public final s:I

.field public final s1:Landroidx/media3/common/Timeline$Window;

.field public final t:Landroid/widget/ImageView;

.field public final t1:La/wss;

.field public final u:Landroid/widget/ImageView;

.field public final u1:Landroid/graphics/drawable/Drawable;

.field public final v:Landroid/widget/ImageView;

.field public final v1:Landroid/graphics/drawable/Drawable;

.field public final w:Landroid/view/View;

.field public final w1:Landroid/graphics/drawable/Drawable;

.field public final x:Landroid/view/View;

.field public final x1:Landroid/graphics/drawable/Drawable;

.field public final y:Landroid/widget/TextView;

.field public final y1:Landroid/graphics/drawable/Drawable;

.field public final z:Landroid/widget/TextView;

.field public final z1:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.ui"

    .line 2
    .line 3
    invoke-static {v0}, La/hn30;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 13
    .line 14
    return-void

    .line 15
    :array_0
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "isScrubbingModeEnabled"

    .line 8
    .line 9
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const-string v5, "setScrubbingModeEnabled"

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    invoke-direct {v0, v1, v6, v7}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    .line 17
    .line 18
    const/4 v8, 0x1

    .line 19
    iput-boolean v8, v0, Landroidx/media3/ui/PlayerControlView;->V1:Z

    .line 20
    .line 21
    const/16 v9, 0x1388

    .line 22
    .line 23
    iput v9, v0, Landroidx/media3/ui/PlayerControlView;->Y1:I

    .line 24
    .line 25
    iput v7, v0, Landroidx/media3/ui/PlayerControlView;->b2:I

    .line 26
    .line 27
    const/16 v9, 0xc8

    .line 28
    .line 29
    iput v9, v0, Landroidx/media3/ui/PlayerControlView;->a2:I

    .line 30
    .line 31
    const/16 v10, 0xf

    .line 32
    .line 33
    const v12, 0x7f0d01ba

    .line 34
    .line 35
    .line 36
    const v13, 0x7f08051c

    .line 37
    .line 38
    .line 39
    const v14, 0x7f08051b

    .line 40
    .line 41
    .line 42
    const v15, 0x7f080518

    .line 43
    .line 44
    .line 45
    const v6, 0x7f080525

    .line 46
    .line 47
    .line 48
    const v9, 0x7f08051d

    .line 49
    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    sget-object v8, La/jqd0;->c:[I

    .line 58
    .line 59
    invoke-virtual {v11, v2, v8, v7, v7}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    const/4 v11, 0x6

    .line 64
    :try_start_0
    invoke-virtual {v8, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    const/16 v11, 0xc

    .line 69
    .line 70
    invoke-virtual {v8, v11, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    const/16 v11, 0xb

    .line 75
    .line 76
    invoke-virtual {v8, v11, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    const/16 v11, 0xa

    .line 81
    .line 82
    invoke-virtual {v8, v11, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    const/4 v11, 0x7

    .line 87
    invoke-virtual {v8, v11, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-virtual {v8, v10, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    const/16 v11, 0x14

    .line 96
    .line 97
    const v10, 0x7f080526

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8, v11, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    const/16 v11, 0x9

    .line 105
    .line 106
    const v7, 0x7f080517

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v11, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    move-object/from16 v16, v4

    .line 114
    .line 115
    const v4, 0x7f080516

    .line 116
    .line 117
    .line 118
    const/16 v7, 0x8

    .line 119
    .line 120
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    const/16 v7, 0x11

    .line 125
    .line 126
    move/from16 v17, v4

    .line 127
    .line 128
    const v4, 0x7f08051f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    const/16 v7, 0x12

    .line 136
    .line 137
    move/from16 v18, v4

    .line 138
    .line 139
    const v4, 0x7f080520

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    const/16 v7, 0x10

    .line 147
    .line 148
    move/from16 v19, v4

    .line 149
    .line 150
    const v4, 0x7f08051e

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    const/16 v7, 0x23

    .line 158
    .line 159
    move/from16 v20, v4

    .line 160
    .line 161
    const v4, 0x7f080524

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    const/16 v7, 0x22

    .line 169
    .line 170
    move/from16 v21, v4

    .line 171
    .line 172
    const v4, 0x7f080523

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    const/16 v7, 0x25

    .line 180
    .line 181
    move/from16 v22, v4

    .line 182
    .line 183
    const v4, 0x7f080529

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    const/16 v7, 0x24

    .line 191
    .line 192
    move/from16 v23, v4

    .line 193
    .line 194
    const v4, 0x7f080528

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    const/16 v7, 0x2a

    .line 202
    .line 203
    move/from16 v24, v4

    .line 204
    .line 205
    const v4, 0x7f08052a

    .line 206
    .line 207
    .line 208
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    iget v7, v0, Landroidx/media3/ui/PlayerControlView;->Y1:I

    .line 213
    .line 214
    move/from16 v25, v4

    .line 215
    .line 216
    const/16 v4, 0x20

    .line 217
    .line 218
    invoke-virtual {v8, v4, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    iput v4, v0, Landroidx/media3/ui/PlayerControlView;->Y1:I

    .line 223
    .line 224
    iget v4, v0, Landroidx/media3/ui/PlayerControlView;->b2:I

    .line 225
    .line 226
    const/16 v7, 0x13

    .line 227
    .line 228
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    iput v4, v0, Landroidx/media3/ui/PlayerControlView;->b2:I

    .line 233
    .line 234
    const/16 v4, 0x1d

    .line 235
    .line 236
    const/4 v7, 0x1

    .line 237
    invoke-virtual {v8, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    move/from16 v26, v4

    .line 242
    .line 243
    const/16 v4, 0x1a

    .line 244
    .line 245
    invoke-virtual {v8, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    move/from16 v27, v4

    .line 250
    .line 251
    const/16 v4, 0x1c

    .line 252
    .line 253
    invoke-virtual {v8, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    move/from16 v28, v4

    .line 258
    .line 259
    const/16 v4, 0x1b

    .line 260
    .line 261
    invoke-virtual {v8, v4, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    const/16 v7, 0x1e

    .line 266
    .line 267
    move/from16 v29, v4

    .line 268
    .line 269
    const/4 v4, 0x0

    .line 270
    invoke-virtual {v8, v7, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    move/from16 v30, v6

    .line 275
    .line 276
    const/16 v6, 0x1f

    .line 277
    .line 278
    invoke-virtual {v8, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    move/from16 v31, v6

    .line 283
    .line 284
    const/16 v6, 0x21

    .line 285
    .line 286
    invoke-virtual {v8, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    move/from16 v32, v6

    .line 291
    .line 292
    const/16 v6, 0x27

    .line 293
    .line 294
    invoke-virtual {v8, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    iput-boolean v6, v0, Landroidx/media3/ui/PlayerControlView;->Z1:Z

    .line 299
    .line 300
    iget v4, v0, Landroidx/media3/ui/PlayerControlView;->a2:I

    .line 301
    .line 302
    const/16 v6, 0x26

    .line 303
    .line 304
    invoke-virtual {v8, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-virtual {v0, v4}, Landroidx/media3/ui/PlayerControlView;->setTimeBarMinUpdateInterval(I)V

    .line 309
    .line 310
    .line 311
    const/4 v4, 0x2

    .line 312
    const/4 v6, 0x1

    .line 313
    invoke-virtual {v8, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 314
    .line 315
    .line 316
    move-result v33
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 317
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 318
    .line 319
    .line 320
    move v6, v15

    .line 321
    move/from16 v15, v25

    .line 322
    .line 323
    move/from16 v8, v30

    .line 324
    .line 325
    move/from16 v30, v11

    .line 326
    .line 327
    move v11, v12

    .line 328
    move v12, v13

    .line 329
    move/from16 v25, v21

    .line 330
    .line 331
    move/from16 v21, v28

    .line 332
    .line 333
    move v13, v10

    .line 334
    move/from16 v28, v18

    .line 335
    .line 336
    move/from16 v10, v23

    .line 337
    .line 338
    move/from16 v23, v27

    .line 339
    .line 340
    move/from16 v18, v31

    .line 341
    .line 342
    move/from16 v31, v14

    .line 343
    .line 344
    move/from16 v27, v19

    .line 345
    .line 346
    move/from16 v19, v7

    .line 347
    .line 348
    move v14, v9

    .line 349
    move/from16 v9, v24

    .line 350
    .line 351
    move/from16 v7, v33

    .line 352
    .line 353
    move/from16 v24, v22

    .line 354
    .line 355
    move/from16 v22, v26

    .line 356
    .line 357
    move/from16 v26, v20

    .line 358
    .line 359
    move/from16 v20, v29

    .line 360
    .line 361
    move/from16 v29, v17

    .line 362
    .line 363
    move/from16 v17, v32

    .line 364
    .line 365
    goto :goto_0

    .line 366
    :catchall_0
    move-exception v0

    .line 367
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 368
    .line 369
    .line 370
    throw v0

    .line 371
    :cond_0
    move-object/from16 v16, v4

    .line 372
    .line 373
    const v4, 0x7f08052a

    .line 374
    .line 375
    .line 376
    const v7, 0x7f080517

    .line 377
    .line 378
    .line 379
    const v10, 0x7f080526

    .line 380
    .line 381
    .line 382
    const v17, 0x7f080516

    .line 383
    .line 384
    .line 385
    const v18, 0x7f08051f

    .line 386
    .line 387
    .line 388
    const v19, 0x7f080520

    .line 389
    .line 390
    .line 391
    const v20, 0x7f08051e

    .line 392
    .line 393
    .line 394
    const v21, 0x7f080524

    .line 395
    .line 396
    .line 397
    const v22, 0x7f080523

    .line 398
    .line 399
    .line 400
    const v23, 0x7f080529

    .line 401
    .line 402
    .line 403
    const v24, 0x7f080528

    .line 404
    .line 405
    .line 406
    move v8, v6

    .line 407
    move/from16 v30, v7

    .line 408
    .line 409
    move v11, v12

    .line 410
    move v12, v13

    .line 411
    move/from16 v31, v14

    .line 412
    .line 413
    move v6, v15

    .line 414
    move/from16 v29, v17

    .line 415
    .line 416
    move/from16 v28, v18

    .line 417
    .line 418
    move/from16 v27, v19

    .line 419
    .line 420
    move/from16 v26, v20

    .line 421
    .line 422
    move/from16 v25, v21

    .line 423
    .line 424
    const/4 v7, 0x1

    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    const/16 v18, 0x0

    .line 428
    .line 429
    const/16 v19, 0x0

    .line 430
    .line 431
    const/16 v20, 0x1

    .line 432
    .line 433
    const/16 v21, 0x1

    .line 434
    .line 435
    move v15, v4

    .line 436
    move v14, v9

    .line 437
    move v13, v10

    .line 438
    move/from16 v10, v23

    .line 439
    .line 440
    move/from16 v9, v24

    .line 441
    .line 442
    const/16 v23, 0x1

    .line 443
    .line 444
    move/from16 v24, v22

    .line 445
    .line 446
    const/16 v22, 0x1

    .line 447
    .line 448
    :goto_0
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    invoke-virtual {v4, v11, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 453
    .line 454
    .line 455
    const/high16 v4, 0x40000

    .line 456
    .line 457
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 458
    .line 459
    .line 460
    new-instance v4, La/z0a0;

    .line 461
    .line 462
    invoke-direct {v4, v0}, La/z0a0;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    .line 463
    .line 464
    .line 465
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 466
    .line 467
    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 468
    .line 469
    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 470
    .line 471
    .line 472
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 473
    .line 474
    new-instance v4, La/amq0;

    .line 475
    .line 476
    invoke-direct {v4}, La/amq0;-><init>()V

    .line 477
    .line 478
    .line 479
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->r1:La/amq0;

    .line 480
    .line 481
    new-instance v4, Landroidx/media3/common/Timeline$Window;

    .line 482
    .line 483
    invoke-direct {v4}, Landroidx/media3/common/Timeline$Window;-><init>()V

    .line 484
    .line 485
    .line 486
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->s1:Landroidx/media3/common/Timeline$Window;

    .line 487
    .line 488
    new-instance v4, Ljava/lang/StringBuilder;

    .line 489
    .line 490
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 491
    .line 492
    .line 493
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->p1:Ljava/lang/StringBuilder;

    .line 494
    .line 495
    new-instance v11, Ljava/util/Formatter;

    .line 496
    .line 497
    move/from16 v32, v12

    .line 498
    .line 499
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 500
    .line 501
    .line 502
    move-result-object v12

    .line 503
    invoke-direct {v11, v4, v12}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 504
    .line 505
    .line 506
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->q1:Ljava/util/Formatter;

    .line 507
    .line 508
    const/4 v4, 0x0

    .line 509
    new-array v11, v4, [J

    .line 510
    .line 511
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->c2:[J

    .line 512
    .line 513
    new-array v11, v4, [Z

    .line 514
    .line 515
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->d2:[Z

    .line 516
    .line 517
    new-array v11, v4, [J

    .line 518
    .line 519
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->e2:[J

    .line 520
    .line 521
    new-array v11, v4, [Z

    .line 522
    .line 523
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->f2:[Z

    .line 524
    .line 525
    new-instance v4, La/wss;

    .line 526
    .line 527
    const/16 v11, 0xf

    .line 528
    .line 529
    invoke-direct {v4, v0, v11}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 530
    .line 531
    .line 532
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->t1:La/wss;

    .line 533
    .line 534
    :try_start_1
    const-class v4, Landroidx/media3/exoplayer/ExoPlayer;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 535
    .line 536
    :try_start_2
    filled-new-array/range {v16 .. v16}, [Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    move-result-object v11

    .line 540
    invoke-virtual {v4, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 541
    .line 542
    .line 543
    move-result-object v11
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_0

    .line 544
    const/4 v12, 0x0

    .line 545
    :try_start_3
    invoke-virtual {v4, v3, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 546
    .line 547
    .line 548
    move-result-object v33
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    .line 549
    move-object/from16 v12, v33

    .line 550
    .line 551
    goto :goto_3

    .line 552
    :catch_0
    :goto_1
    const/4 v11, 0x0

    .line 553
    goto :goto_2

    .line 554
    :catch_1
    const/4 v4, 0x0

    .line 555
    goto :goto_1

    .line 556
    :catch_2
    :goto_2
    const/4 v12, 0x0

    .line 557
    :goto_3
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->e:Ljava/lang/Class;

    .line 558
    .line 559
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->f:Ljava/lang/reflect/Method;

    .line 560
    .line 561
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->g:Ljava/lang/reflect/Method;

    .line 562
    .line 563
    :try_start_4
    const-string v4, "androidx.media3.transformer.CompositionPlayer"

    .line 564
    .line 565
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    move-result-object v4
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_4

    .line 569
    :try_start_5
    filled-new-array/range {v16 .. v16}, [Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-result-object v11

    .line 573
    invoke-virtual {v4, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 574
    .line 575
    .line 576
    move-result-object v5
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_3

    .line 577
    const/4 v12, 0x0

    .line 578
    :try_start_6
    invoke-virtual {v4, v3, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 579
    .line 580
    .line 581
    move-result-object v3
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_5

    .line 582
    goto :goto_6

    .line 583
    :catch_3
    :goto_4
    const/4 v5, 0x0

    .line 584
    goto :goto_5

    .line 585
    :catch_4
    const/4 v4, 0x0

    .line 586
    goto :goto_4

    .line 587
    :catch_5
    :goto_5
    const/4 v3, 0x0

    .line 588
    :goto_6
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->h:Ljava/lang/Class;

    .line 589
    .line 590
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->i:Ljava/lang/reflect/Method;

    .line 591
    .line 592
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->j:Ljava/lang/reflect/Method;

    .line 593
    .line 594
    const v3, 0x7f0a04f5

    .line 595
    .line 596
    .line 597
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    check-cast v3, Landroid/widget/TextView;

    .line 602
    .line 603
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->m1:Landroid/widget/TextView;

    .line 604
    .line 605
    const v3, 0x7f0a050a

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    check-cast v3, Landroid/widget/TextView;

    .line 613
    .line 614
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->n1:Landroid/widget/TextView;

    .line 615
    .line 616
    const v3, 0x7f0a0516

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    check-cast v3, Landroid/widget/ImageView;

    .line 624
    .line 625
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->g1:Landroid/widget/ImageView;

    .line 626
    .line 627
    if-eqz v3, :cond_1

    .line 628
    .line 629
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 630
    .line 631
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 632
    .line 633
    .line 634
    :cond_1
    const v3, 0x7f0a04fb

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    check-cast v3, Landroid/widget/ImageView;

    .line 642
    .line 643
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->h1:Landroid/widget/ImageView;

    .line 644
    .line 645
    new-instance v4, La/l910;

    .line 646
    .line 647
    const/16 v11, 0xf

    .line 648
    .line 649
    invoke-direct {v4, v0, v11}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 650
    .line 651
    .line 652
    if-nez v3, :cond_2

    .line 653
    .line 654
    const/16 v5, 0x8

    .line 655
    .line 656
    goto :goto_7

    .line 657
    :cond_2
    const/16 v5, 0x8

    .line 658
    .line 659
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 663
    .line 664
    .line 665
    :goto_7
    const v3, 0x7f0a0501

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 669
    .line 670
    .line 671
    move-result-object v3

    .line 672
    check-cast v3, Landroid/widget/ImageView;

    .line 673
    .line 674
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->i1:Landroid/widget/ImageView;

    .line 675
    .line 676
    new-instance v4, La/l910;

    .line 677
    .line 678
    invoke-direct {v4, v0, v11}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 679
    .line 680
    .line 681
    if-nez v3, :cond_3

    .line 682
    .line 683
    goto :goto_8

    .line 684
    :cond_3
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 688
    .line 689
    .line 690
    :goto_8
    const v3, 0x7f0a0511

    .line 691
    .line 692
    .line 693
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->j1:Landroid/view/View;

    .line 698
    .line 699
    if-eqz v3, :cond_4

    .line 700
    .line 701
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 702
    .line 703
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 704
    .line 705
    .line 706
    :cond_4
    const v3, 0x7f0a0509

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 710
    .line 711
    .line 712
    move-result-object v3

    .line 713
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->k1:Landroid/view/View;

    .line 714
    .line 715
    if-eqz v3, :cond_5

    .line 716
    .line 717
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 718
    .line 719
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 720
    .line 721
    .line 722
    :cond_5
    const v3, 0x7f0a04eb

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 726
    .line 727
    .line 728
    move-result-object v3

    .line 729
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->l1:Landroid/view/View;

    .line 730
    .line 731
    if-eqz v3, :cond_6

    .line 732
    .line 733
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 734
    .line 735
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 736
    .line 737
    .line 738
    :cond_6
    const v3, 0x7f0a050c

    .line 739
    .line 740
    .line 741
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    check-cast v4, La/zxj;

    .line 746
    .line 747
    const v5, 0x7f0a050d

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 751
    .line 752
    .line 753
    move-result-object v5

    .line 754
    if-eqz v4, :cond_7

    .line 755
    .line 756
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->o1:La/zxj;

    .line 757
    .line 758
    :goto_9
    const/4 v12, 0x0

    .line 759
    goto :goto_a

    .line 760
    :cond_7
    if-eqz v5, :cond_8

    .line 761
    .line 762
    new-instance v4, La/zxj;

    .line 763
    .line 764
    invoke-direct {v4, v1, v2}, La/zxj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4, v3}, Landroid/view/View;->setId(I)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    check-cast v2, Landroid/view/ViewGroup;

    .line 782
    .line 783
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 784
    .line 785
    .line 786
    move-result v3

    .line 787
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v2, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 791
    .line 792
    .line 793
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->o1:La/zxj;

    .line 794
    .line 795
    goto :goto_9

    .line 796
    :cond_8
    const/4 v12, 0x0

    .line 797
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->o1:La/zxj;

    .line 798
    .line 799
    move-object v4, v12

    .line 800
    :goto_a
    if-eqz v4, :cond_9

    .line 801
    .line 802
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 803
    .line 804
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    iget-object v3, v4, La/zxj;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 808
    .line 809
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 810
    .line 811
    .line 812
    :cond_9
    invoke-static {v12}, La/vtt0;->n(La/wm30;)Landroid/os/Handler;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->c:Landroid/os/Handler;

    .line 817
    .line 818
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->b:Landroid/content/res/Resources;

    .line 823
    .line 824
    const v3, 0x7f0a0508

    .line 825
    .line 826
    .line 827
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    check-cast v3, Landroid/widget/ImageView;

    .line 832
    .line 833
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->v:Landroid/widget/ImageView;

    .line 834
    .line 835
    if-eqz v3, :cond_a

    .line 836
    .line 837
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 838
    .line 839
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 840
    .line 841
    .line 842
    :cond_a
    const v3, 0x7f0a050b

    .line 843
    .line 844
    .line 845
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    check-cast v3, Landroid/widget/ImageView;

    .line 850
    .line 851
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->t:Landroid/widget/ImageView;

    .line 852
    .line 853
    if-eqz v3, :cond_b

    .line 854
    .line 855
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 856
    .line 857
    .line 858
    move-result-object v4

    .line 859
    invoke-virtual {v2, v14, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 860
    .line 861
    .line 862
    move-result-object v4

    .line 863
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 864
    .line 865
    .line 866
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 867
    .line 868
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 869
    .line 870
    .line 871
    :cond_b
    const v4, 0x7f0a0502

    .line 872
    .line 873
    .line 874
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 875
    .line 876
    .line 877
    move-result-object v4

    .line 878
    check-cast v4, Landroid/widget/ImageView;

    .line 879
    .line 880
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->u:Landroid/widget/ImageView;

    .line 881
    .line 882
    if-eqz v4, :cond_c

    .line 883
    .line 884
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 885
    .line 886
    .line 887
    move-result-object v5

    .line 888
    invoke-virtual {v2, v6, v5}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 889
    .line 890
    .line 891
    move-result-object v5

    .line 892
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 893
    .line 894
    .line 895
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 896
    .line 897
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 898
    .line 899
    .line 900
    :cond_c
    const v5, 0x7f090002

    .line 901
    .line 902
    .line 903
    invoke-static {v5, v1}, La/itf0;->a(ILandroid/content/Context;)Landroid/graphics/Typeface;

    .line 904
    .line 905
    .line 906
    move-result-object v5

    .line 907
    const v6, 0x7f0a050f

    .line 908
    .line 909
    .line 910
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 911
    .line 912
    .line 913
    move-result-object v6

    .line 914
    check-cast v6, Landroid/widget/ImageView;

    .line 915
    .line 916
    const v11, 0x7f0a0510

    .line 917
    .line 918
    .line 919
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 920
    .line 921
    .line 922
    move-result-object v11

    .line 923
    check-cast v11, Landroid/widget/TextView;

    .line 924
    .line 925
    if-eqz v6, :cond_d

    .line 926
    .line 927
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 928
    .line 929
    .line 930
    move-result-object v11

    .line 931
    invoke-virtual {v2, v13, v11}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 932
    .line 933
    .line 934
    move-result-object v11

    .line 935
    invoke-virtual {v6, v11}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 936
    .line 937
    .line 938
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->x:Landroid/view/View;

    .line 939
    .line 940
    const/4 v12, 0x0

    .line 941
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->z:Landroid/widget/TextView;

    .line 942
    .line 943
    goto :goto_b

    .line 944
    :cond_d
    const/4 v12, 0x0

    .line 945
    if-eqz v11, :cond_e

    .line 946
    .line 947
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 948
    .line 949
    .line 950
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->z:Landroid/widget/TextView;

    .line 951
    .line 952
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->x:Landroid/view/View;

    .line 953
    .line 954
    goto :goto_b

    .line 955
    :cond_e
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->z:Landroid/widget/TextView;

    .line 956
    .line 957
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->x:Landroid/view/View;

    .line 958
    .line 959
    :goto_b
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->x:Landroid/view/View;

    .line 960
    .line 961
    if-eqz v6, :cond_f

    .line 962
    .line 963
    iget-object v11, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 964
    .line 965
    invoke-virtual {v6, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 966
    .line 967
    .line 968
    :cond_f
    const v6, 0x7f0a04f9

    .line 969
    .line 970
    .line 971
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 972
    .line 973
    .line 974
    move-result-object v6

    .line 975
    check-cast v6, Landroid/widget/ImageView;

    .line 976
    .line 977
    const v11, 0x7f0a04fa

    .line 978
    .line 979
    .line 980
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 981
    .line 982
    .line 983
    move-result-object v11

    .line 984
    check-cast v11, Landroid/widget/TextView;

    .line 985
    .line 986
    if-eqz v6, :cond_10

    .line 987
    .line 988
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 989
    .line 990
    .line 991
    move-result-object v5

    .line 992
    invoke-virtual {v2, v8, v5}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 993
    .line 994
    .line 995
    move-result-object v5

    .line 996
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 997
    .line 998
    .line 999
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->w:Landroid/view/View;

    .line 1000
    .line 1001
    const/4 v12, 0x0

    .line 1002
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->y:Landroid/widget/TextView;

    .line 1003
    .line 1004
    goto :goto_c

    .line 1005
    :cond_10
    const/4 v12, 0x0

    .line 1006
    if-eqz v11, :cond_11

    .line 1007
    .line 1008
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1009
    .line 1010
    .line 1011
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->y:Landroid/widget/TextView;

    .line 1012
    .line 1013
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->w:Landroid/view/View;

    .line 1014
    .line 1015
    goto :goto_c

    .line 1016
    :cond_11
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->y:Landroid/widget/TextView;

    .line 1017
    .line 1018
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->w:Landroid/view/View;

    .line 1019
    .line 1020
    :goto_c
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->w:Landroid/view/View;

    .line 1021
    .line 1022
    if-eqz v5, :cond_12

    .line 1023
    .line 1024
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 1025
    .line 1026
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1027
    .line 1028
    .line 1029
    :cond_12
    const v5, 0x7f0a050e

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v5

    .line 1036
    check-cast v5, Landroid/widget/ImageView;

    .line 1037
    .line 1038
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->A:Landroid/widget/ImageView;

    .line 1039
    .line 1040
    if-eqz v5, :cond_13

    .line 1041
    .line 1042
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 1043
    .line 1044
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1045
    .line 1046
    .line 1047
    :cond_13
    const v6, 0x7f0a0513

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v6

    .line 1054
    check-cast v6, Landroid/widget/ImageView;

    .line 1055
    .line 1056
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->B:Landroid/widget/ImageView;

    .line 1057
    .line 1058
    if-eqz v6, :cond_14

    .line 1059
    .line 1060
    iget-object v8, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 1061
    .line 1062
    invoke-virtual {v6, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1063
    .line 1064
    .line 1065
    :cond_14
    const v8, 0x7f0b000f

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1069
    .line 1070
    .line 1071
    move-result v8

    .line 1072
    int-to-float v8, v8

    .line 1073
    const/high16 v11, 0x42c80000    # 100.0f

    .line 1074
    .line 1075
    div-float/2addr v8, v11

    .line 1076
    iput v8, v0, Landroidx/media3/ui/PlayerControlView;->E1:F

    .line 1077
    .line 1078
    const v8, 0x7f0b000e

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1082
    .line 1083
    .line 1084
    move-result v8

    .line 1085
    int-to-float v8, v8

    .line 1086
    div-float/2addr v8, v11

    .line 1087
    iput v8, v0, Landroidx/media3/ui/PlayerControlView;->F1:F

    .line 1088
    .line 1089
    const v8, 0x7f0a051c

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v8

    .line 1096
    check-cast v8, Landroid/widget/ImageView;

    .line 1097
    .line 1098
    iput-object v8, v0, Landroidx/media3/ui/PlayerControlView;->f1:Landroid/widget/ImageView;

    .line 1099
    .line 1100
    if-eqz v8, :cond_15

    .line 1101
    .line 1102
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v11

    .line 1106
    invoke-virtual {v2, v15, v11}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v11

    .line 1110
    invoke-virtual {v8, v11}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1111
    .line 1112
    .line 1113
    const/4 v11, 0x0

    .line 1114
    invoke-virtual {v0, v8, v11}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 1115
    .line 1116
    .line 1117
    :cond_15
    new-instance v11, La/n1a0;

    .line 1118
    .line 1119
    invoke-direct {v11, v0}, La/n1a0;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    .line 1120
    .line 1121
    .line 1122
    iput-object v11, v0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 1123
    .line 1124
    iput-boolean v7, v11, La/n1a0;->D:Z

    .line 1125
    .line 1126
    const v7, 0x7f130808

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v7

    .line 1133
    const v12, 0x7f080527

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v13

    .line 1140
    invoke-virtual {v2, v12, v13}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v12

    .line 1144
    const v13, 0x7f130829

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v2, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v13

    .line 1151
    filled-new-array {v7, v13}, [Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v7

    .line 1155
    const v13, 0x7f080513

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v14

    .line 1162
    invoke-virtual {v2, v13, v14}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v13

    .line 1166
    filled-new-array {v12, v13}, [Landroid/graphics/drawable/Drawable;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v12

    .line 1170
    new-instance v13, La/e1a0;

    .line 1171
    .line 1172
    invoke-direct {v13, v0, v7, v12}, La/e1a0;-><init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    .line 1173
    .line 1174
    .line 1175
    iput-object v13, v0, Landroidx/media3/ui/PlayerControlView;->m:La/e1a0;

    .line 1176
    .line 1177
    const v7, 0x7f070144

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1181
    .line 1182
    .line 1183
    move-result v7

    .line 1184
    iput v7, v0, Landroidx/media3/ui/PlayerControlView;->s:I

    .line 1185
    .line 1186
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v7

    .line 1190
    const v12, 0x7f0d01bc

    .line 1191
    .line 1192
    .line 1193
    const/4 v14, 0x0

    .line 1194
    invoke-virtual {v7, v12, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v7

    .line 1198
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 1199
    .line 1200
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 1201
    .line 1202
    invoke-virtual {v7, v13}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 1203
    .line 1204
    .line 1205
    new-instance v12, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1206
    .line 1207
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v13

    .line 1211
    invoke-direct {v12, v13}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v7, v12}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 1215
    .line 1216
    .line 1217
    new-instance v12, Landroid/widget/PopupWindow;

    .line 1218
    .line 1219
    const/4 v13, -0x2

    .line 1220
    const/4 v14, 0x1

    .line 1221
    invoke-direct {v12, v7, v13, v13, v14}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 1222
    .line 1223
    .line 1224
    iput-object v12, v0, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 1225
    .line 1226
    iget-object v7, v0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 1227
    .line 1228
    invoke-virtual {v12, v7}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 1229
    .line 1230
    .line 1231
    iput-boolean v14, v0, Landroidx/media3/ui/PlayerControlView;->h2:Z

    .line 1232
    .line 1233
    new-instance v7, La/psc;

    .line 1234
    .line 1235
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v12

    .line 1239
    invoke-direct {v7, v12}, La/psc;-><init>(Landroid/content/res/Resources;)V

    .line 1240
    .line 1241
    .line 1242
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->q:La/psc;

    .line 1243
    .line 1244
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v7

    .line 1248
    invoke-virtual {v2, v10, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v7

    .line 1252
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->I1:Landroid/graphics/drawable/Drawable;

    .line 1253
    .line 1254
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v7

    .line 1258
    invoke-virtual {v2, v9, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v7

    .line 1262
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->J1:Landroid/graphics/drawable/Drawable;

    .line 1263
    .line 1264
    const v7, 0x7f1307fd

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v7

    .line 1271
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->K1:Ljava/lang/String;

    .line 1272
    .line 1273
    const v7, 0x7f1307fc

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v7

    .line 1280
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->L1:Ljava/lang/String;

    .line 1281
    .line 1282
    new-instance v7, La/y0a0;

    .line 1283
    .line 1284
    const/4 v14, 0x1

    .line 1285
    invoke-direct {v7, v0, v14}, La/y0a0;-><init>(Landroidx/media3/ui/PlayerControlView;B)V

    .line 1286
    .line 1287
    .line 1288
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->o:La/y0a0;

    .line 1289
    .line 1290
    new-instance v7, La/y0a0;

    .line 1291
    .line 1292
    const/4 v9, 0x0

    .line 1293
    invoke-direct {v7, v0, v9}, La/y0a0;-><init>(Landroidx/media3/ui/PlayerControlView;B)V

    .line 1294
    .line 1295
    .line 1296
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->p:La/y0a0;

    .line 1297
    .line 1298
    new-instance v7, La/b1a0;

    .line 1299
    .line 1300
    const v10, 0x7f030004

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v10

    .line 1307
    sget-object v12, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 1308
    .line 1309
    invoke-direct {v7, v0, v10, v12}, La/b1a0;-><init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[F)V

    .line 1310
    .line 1311
    .line 1312
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->n:La/b1a0;

    .line 1313
    .line 1314
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v7

    .line 1318
    move/from16 v13, v32

    .line 1319
    .line 1320
    invoke-virtual {v2, v13, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v7

    .line 1324
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->u1:Landroid/graphics/drawable/Drawable;

    .line 1325
    .line 1326
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v7

    .line 1330
    move/from16 v14, v31

    .line 1331
    .line 1332
    invoke-virtual {v2, v14, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v7

    .line 1336
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->v1:Landroid/graphics/drawable/Drawable;

    .line 1337
    .line 1338
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v7

    .line 1342
    move/from16 v10, v30

    .line 1343
    .line 1344
    invoke-virtual {v2, v10, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v7

    .line 1348
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->M1:Landroid/graphics/drawable/Drawable;

    .line 1349
    .line 1350
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v7

    .line 1354
    move/from16 v10, v29

    .line 1355
    .line 1356
    invoke-virtual {v2, v10, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v7

    .line 1360
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->N1:Landroid/graphics/drawable/Drawable;

    .line 1361
    .line 1362
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v7

    .line 1366
    move/from16 v10, v28

    .line 1367
    .line 1368
    invoke-virtual {v2, v10, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v7

    .line 1372
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->w1:Landroid/graphics/drawable/Drawable;

    .line 1373
    .line 1374
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v7

    .line 1378
    move/from16 v10, v27

    .line 1379
    .line 1380
    invoke-virtual {v2, v10, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v7

    .line 1384
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->x1:Landroid/graphics/drawable/Drawable;

    .line 1385
    .line 1386
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v7

    .line 1390
    move/from16 v10, v26

    .line 1391
    .line 1392
    invoke-virtual {v2, v10, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v7

    .line 1396
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->y1:Landroid/graphics/drawable/Drawable;

    .line 1397
    .line 1398
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v7

    .line 1402
    move/from16 v10, v25

    .line 1403
    .line 1404
    invoke-virtual {v2, v10, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v7

    .line 1408
    iput-object v7, v0, Landroidx/media3/ui/PlayerControlView;->C1:Landroid/graphics/drawable/Drawable;

    .line 1409
    .line 1410
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v1

    .line 1414
    move/from16 v7, v24

    .line 1415
    .line 1416
    invoke-virtual {v2, v7, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->D1:Landroid/graphics/drawable/Drawable;

    .line 1421
    .line 1422
    const v1, 0x7f130801

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->O1:Ljava/lang/String;

    .line 1430
    .line 1431
    const v1, 0x7f130800

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v1

    .line 1438
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->P1:Ljava/lang/String;

    .line 1439
    .line 1440
    const v1, 0x7f13080b

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v1

    .line 1447
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->z1:Ljava/lang/String;

    .line 1448
    .line 1449
    const v1, 0x7f13080c

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v1

    .line 1456
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->A1:Ljava/lang/String;

    .line 1457
    .line 1458
    const v1, 0x7f13080a

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v1

    .line 1465
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->B1:Ljava/lang/String;

    .line 1466
    .line 1467
    const v1, 0x7f130812

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v1

    .line 1474
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->G1:Ljava/lang/String;

    .line 1475
    .line 1476
    const v1, 0x7f130811

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v1

    .line 1483
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->H1:Ljava/lang/String;

    .line 1484
    .line 1485
    const v1, 0x7f0a04ed

    .line 1486
    .line 1487
    .line 1488
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v1

    .line 1492
    check-cast v1, Landroid/view/ViewGroup;

    .line 1493
    .line 1494
    const/4 v14, 0x1

    .line 1495
    invoke-virtual {v11, v1, v14}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1496
    .line 1497
    .line 1498
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->w:Landroid/view/View;

    .line 1499
    .line 1500
    move/from16 v2, v23

    .line 1501
    .line 1502
    invoke-virtual {v11, v1, v2}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1503
    .line 1504
    .line 1505
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->x:Landroid/view/View;

    .line 1506
    .line 1507
    move/from16 v2, v22

    .line 1508
    .line 1509
    invoke-virtual {v11, v1, v2}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1510
    .line 1511
    .line 1512
    move/from16 v1, v21

    .line 1513
    .line 1514
    invoke-virtual {v11, v3, v1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1515
    .line 1516
    .line 1517
    move/from16 v1, v20

    .line 1518
    .line 1519
    invoke-virtual {v11, v4, v1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1520
    .line 1521
    .line 1522
    move/from16 v7, v19

    .line 1523
    .line 1524
    invoke-virtual {v11, v6, v7}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1525
    .line 1526
    .line 1527
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->g1:Landroid/widget/ImageView;

    .line 1528
    .line 1529
    move/from16 v2, v18

    .line 1530
    .line 1531
    invoke-virtual {v11, v1, v2}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1532
    .line 1533
    .line 1534
    move/from16 v1, v17

    .line 1535
    .line 1536
    invoke-virtual {v11, v8, v1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1537
    .line 1538
    .line 1539
    iget v1, v0, Landroidx/media3/ui/PlayerControlView;->b2:I

    .line 1540
    .line 1541
    if-eqz v1, :cond_16

    .line 1542
    .line 1543
    move v7, v14

    .line 1544
    goto :goto_d

    .line 1545
    :cond_16
    move v7, v9

    .line 1546
    :goto_d
    invoke-virtual {v11, v5, v7}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 1547
    .line 1548
    .line 1549
    new-instance v1, La/g14;

    .line 1550
    .line 1551
    const/4 v4, 0x2

    .line 1552
    invoke-direct {v1, v0, v4}, La/g14;-><init>(Ljava/lang/Object;B)V

    .line 1553
    .line 1554
    .line 1555
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 1556
    .line 1557
    .line 1558
    return-void
.end method

.method public static synthetic a(Landroidx/media3/ui/PlayerControlView;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setPlaybackSpeed(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b(La/my90;Landroidx/media3/common/Timeline$Window;)Z
    .locals 8

    .line 1
    check-cast p0, La/ulo;

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    invoke-virtual {p0, v0}, La/ulo;->w(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, La/bmq0;->o()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-le v0, v2, :cond_4

    .line 23
    .line 24
    const/16 v3, 0x64

    .line 25
    .line 26
    if-le v0, v3, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v3, v1

    .line 30
    :goto_0
    if-ge v3, v0, :cond_3

    .line 31
    .line 32
    const-wide/16 v4, 0x0

    .line 33
    .line 34
    invoke-virtual {p0, v3, p1, v4, v5}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-wide v4, v4, Landroidx/media3/common/Timeline$Window;->l:J

    .line 39
    .line 40
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    cmp-long v4, v4, v6

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    return v1

    .line 50
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return v2

    .line 54
    :cond_4
    :goto_1
    return v1
.end method

.method private setPlaybackSpeed(F)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    check-cast v0, La/ulo;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, La/ulo;->w(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 17
    .line 18
    move-object v0, p0

    .line 19
    check-cast v0, La/ulo;

    .line 20
    .line 21
    invoke-virtual {v0}, La/ulo;->c0()V

    .line 22
    .line 23
    .line 24
    iget-object p0, v0, La/ulo;->n0:La/yx90;

    .line 25
    .line 26
    iget-object p0, p0, La/yx90;->o:La/zx90;

    .line 27
    .line 28
    new-instance v1, La/zx90;

    .line 29
    .line 30
    iget p0, p0, La/zx90;->b:F

    .line 31
    .line 32
    invoke-direct {v1, p1, p0}, La/zx90;-><init>(FF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, La/ulo;->c0()V

    .line 36
    .line 37
    .line 38
    iget-object p0, v0, La/ulo;->n0:La/yx90;

    .line 39
    .line 40
    iget-object p0, p0, La/yx90;->o:La/zx90;

    .line 41
    .line 42
    invoke-virtual {p0, v1}, La/zx90;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object p0, v0, La/ulo;->n0:La/yx90;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, La/yx90;->g(La/zx90;)La/yx90;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget p1, v0, La/ulo;->J:I

    .line 56
    .line 57
    add-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    iput p1, v0, La/ulo;->J:I

    .line 60
    .line 61
    iget-object p1, v0, La/ulo;->l:La/dmo;

    .line 62
    .line 63
    iget-object p1, p1, La/dmo;->g:La/q9o0;

    .line 64
    .line 65
    const/4 v2, 0x4

    .line 66
    invoke-virtual {p1, v2, v1}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, La/p9o0;->b()V

    .line 71
    .line 72
    .line 73
    const/4 v7, -0x1

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v2, 0x0

    .line 76
    const/4 v3, 0x0

    .line 77
    const/4 v4, 0x5

    .line 78
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    move-object v1, p0

    .line 84
    invoke-virtual/range {v0 .. v8}, La/ulo;->a0(La/yx90;IZIJIZ)V

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final c(Landroid/view/KeyEvent;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_c

    .line 11
    .line 12
    const/16 v4, 0x58

    .line 13
    .line 14
    const/16 v5, 0x57

    .line 15
    .line 16
    const/16 v6, 0x7f

    .line 17
    .line 18
    const/16 v7, 0x7e

    .line 19
    .line 20
    const/16 v8, 0x4f

    .line 21
    .line 22
    const/16 v9, 0x55

    .line 23
    .line 24
    const/16 v10, 0x59

    .line 25
    .line 26
    const/16 v11, 0x5a

    .line 27
    .line 28
    if-eq v1, v11, :cond_0

    .line 29
    .line 30
    if-eq v1, v10, :cond_0

    .line 31
    .line 32
    if-eq v1, v9, :cond_0

    .line 33
    .line 34
    if-eq v1, v8, :cond_0

    .line 35
    .line 36
    if-eq v1, v7, :cond_0

    .line 37
    .line 38
    if-eq v1, v6, :cond_0

    .line 39
    .line 40
    if-eq v1, v5, :cond_0

    .line 41
    .line 42
    if-ne v1, v4, :cond_c

    .line 43
    .line 44
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getAction()I

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    const/4 v13, 0x1

    .line 49
    if-nez v12, :cond_b

    .line 50
    .line 51
    const-wide/16 v14, 0x0

    .line 52
    .line 53
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    if-ne v1, v11, :cond_2

    .line 59
    .line 60
    check-cast v2, La/ulo;

    .line 61
    .line 62
    invoke-virtual {v2}, La/ulo;->s()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x4

    .line 67
    if-eq v0, v1, :cond_b

    .line 68
    .line 69
    const/16 v0, 0xc

    .line 70
    .line 71
    invoke-virtual {v2, v0}, La/ulo;->w(I)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_b

    .line 76
    .line 77
    invoke-virtual {v2}, La/ulo;->c0()V

    .line 78
    .line 79
    .line 80
    iget-short v0, v2, La/ulo;->k0:S

    .line 81
    .line 82
    int-to-long v0, v0

    .line 83
    invoke-virtual {v2}, La/ulo;->l()J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    add-long/2addr v3, v0

    .line 88
    invoke-virtual {v2}, La/ulo;->q()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    cmp-long v5, v0, v16

    .line 93
    .line 94
    if-eqz v5, :cond_1

    .line 95
    .line 96
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    :cond_1
    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-virtual {v2, v0, v1}, La/ulo;->J(J)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :cond_2
    if-ne v1, v10, :cond_4

    .line 110
    .line 111
    move-object v10, v2

    .line 112
    check-cast v10, La/ulo;

    .line 113
    .line 114
    const/16 v11, 0xb

    .line 115
    .line 116
    invoke-virtual {v10, v11}, La/ulo;->w(I)Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-eqz v11, :cond_4

    .line 121
    .line 122
    invoke-virtual {v10}, La/ulo;->c0()V

    .line 123
    .line 124
    .line 125
    iget-short v0, v10, La/ulo;->j0:S

    .line 126
    .line 127
    int-to-long v0, v0

    .line 128
    neg-long v0, v0

    .line 129
    invoke-virtual {v10}, La/ulo;->l()J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    add-long/2addr v2, v0

    .line 134
    invoke-virtual {v10}, La/ulo;->q()J

    .line 135
    .line 136
    .line 137
    move-result-wide v0

    .line 138
    cmp-long v4, v0, v16

    .line 139
    .line 140
    if-eqz v4, :cond_3

    .line 141
    .line 142
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide v2

    .line 146
    :cond_3
    invoke-static {v2, v3, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 147
    .line 148
    .line 149
    move-result-wide v0

    .line 150
    invoke-virtual {v10, v0, v1}, La/ulo;->J(J)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-nez v10, :cond_b

    .line 159
    .line 160
    if-eq v1, v8, :cond_9

    .line 161
    .line 162
    if-eq v1, v9, :cond_9

    .line 163
    .line 164
    if-eq v1, v5, :cond_8

    .line 165
    .line 166
    if-eq v1, v4, :cond_7

    .line 167
    .line 168
    if-eq v1, v7, :cond_6

    .line 169
    .line 170
    if-eq v1, v6, :cond_5

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_5
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 174
    .line 175
    check-cast v2, La/ulo;

    .line 176
    .line 177
    invoke-virtual {v2, v13}, La/ulo;->w(I)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_b

    .line 182
    .line 183
    invoke-virtual {v2, v3}, La/ulo;->P(Z)V

    .line 184
    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_6
    invoke-static {v2}, La/vtt0;->E(La/my90;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_7
    check-cast v2, La/ulo;

    .line 192
    .line 193
    const/4 v0, 0x7

    .line 194
    invoke-virtual {v2, v0}, La/ulo;->w(I)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_b

    .line 199
    .line 200
    invoke-virtual {v2}, La/ulo;->L()V

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_8
    check-cast v2, La/ulo;

    .line 205
    .line 206
    const/16 v0, 0x9

    .line 207
    .line 208
    invoke-virtual {v2, v0}, La/ulo;->w(I)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_b

    .line 213
    .line 214
    invoke-virtual {v2}, La/ulo;->K()V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_9
    iget-boolean v0, v0, Landroidx/media3/ui/PlayerControlView;->V1:Z

    .line 219
    .line 220
    invoke-static {v2, v0}, La/vtt0;->V(La/my90;Z)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_a

    .line 225
    .line 226
    invoke-static {v2}, La/vtt0;->E(La/my90;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_a
    check-cast v2, La/ulo;

    .line 231
    .line 232
    invoke-virtual {v2, v13}, La/ulo;->w(I)Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_b

    .line 237
    .line 238
    invoke-virtual {v2, v3}, La/ulo;->P(Z)V

    .line 239
    .line 240
    .line 241
    :cond_b
    :goto_0
    return v13

    .line 242
    :cond_c
    return v3
.end method

.method public final d(La/yge0;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->u()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->h2:Z

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->h2:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sub-int/2addr v0, v1

    .line 29
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->s:I

    .line 30
    .line 31
    sub-int/2addr v0, p0

    .line 32
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    neg-int v1, v1

    .line 37
    sub-int/2addr v1, p0

    .line 38
    invoke-virtual {p1, p2, v0, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->c(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final e(La/rds0;I)La/rcf0;
    .locals 11

    .line 1
    const-string v0, "initialCapacity"

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1, v0}, La/e3c;->s(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-array v0, v1, [Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, p1, La/rds0;->a:La/b4x;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    move v4, v3

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-ge v3, v5, :cond_5

    .line 19
    .line 20
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, La/qds0;

    .line 25
    .line 26
    iget-object v6, v5, La/qds0;->b:La/ccs0;

    .line 27
    .line 28
    iget v6, v6, La/ccs0;->c:I

    .line 29
    .line 30
    if-eq v6, p2, :cond_0

    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_0
    move v6, v2

    .line 34
    :goto_1
    iget v7, v5, La/qds0;->a:I

    .line 35
    .line 36
    if-ge v6, v7, :cond_4

    .line 37
    .line 38
    invoke-virtual {v5, v6}, La/qds0;->a(I)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-nez v7, :cond_1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    iget-object v7, v5, La/qds0;->b:La/ccs0;

    .line 46
    .line 47
    iget-object v7, v7, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 48
    .line 49
    aget-object v7, v7, v6

    .line 50
    .line 51
    iget v8, v7, Landroidx/media3/common/b;->e:I

    .line 52
    .line 53
    and-int/lit8 v8, v8, 0x2

    .line 54
    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_2
    iget-object v8, p0, Landroidx/media3/ui/PlayerControlView;->q:La/psc;

    .line 59
    .line 60
    invoke-virtual {v8, v7}, La/psc;->i(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    new-instance v8, La/g1a0;

    .line 65
    .line 66
    invoke-direct {v8, p1, v3, v6, v7}, La/g1a0;-><init>(La/rds0;IILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    array-length v7, v0

    .line 70
    add-int/lit8 v9, v4, 0x1

    .line 71
    .line 72
    invoke-static {v7, v9}, La/r3x;->e(II)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    array-length v10, v0

    .line 77
    if-gt v7, v10, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_2
    aput-object v8, v0, v4

    .line 85
    .line 86
    move v4, v9

    .line 87
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    invoke-static {v4, v0}, La/b4x;->k(I[Ljava/lang/Object;)La/rcf0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-byte v0, p0, La/n1a0;->A:B

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, La/n1a0;->f()V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, La/n1a0;->D:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v1}, La/n1a0;->i(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-byte v0, p0, La/n1a0;->A:B

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    iget-object p0, p0, La/n1a0;->n:Landroid/animation/AnimatorSet;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    iget-object p0, p0, La/n1a0;->o:Landroid/animation/AnimatorSet;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 37
    .line 38
    .line 39
    :cond_3
    :goto_0
    return-void
.end method

.method public final g(La/my90;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->h:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public getPlayer()La/my90;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRepeatToggleModes()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->b2:I

    .line 2
    .line 3
    return p0
.end method

.method public getShowShuffleButton()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->B:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, La/n1a0;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getShowSubtitleButton()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->g1:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, La/n1a0;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getShowTimeoutMs()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->Y1:I

    .line 2
    .line 3
    return p0
.end method

.method public getShowVrButton()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->f1:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, La/n1a0;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final h(La/my90;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->e:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hasOverlappingRendering()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-byte v0, p0, La/n1a0;->A:B

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/n1a0;->a:Landroidx/media3/ui/PlayerControlView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final j(La/my90;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->h(La/my90;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->g:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :catch_1
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->g(La/my90;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->j:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    check-cast p0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    :cond_1
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_2
    return v0

    .line 63
    :goto_1
    invoke-static {p0}, La/ohq;->p(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    return v0
.end method

.method public final k()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final l(La/my90;J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->W1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, La/ulo;

    .line 6
    .line 7
    const/16 v0, 0x11

    .line 8
    .line 9
    invoke-virtual {p1, v0}, La/ulo;->w(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/16 v0, 0xa

    .line 16
    .line 17
    invoke-virtual {p1, v0}, La/ulo;->w(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1}, La/ulo;->n()La/bmq0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, La/bmq0;->o()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    move v3, v2

    .line 33
    :goto_0
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->s1:Landroidx/media3/common/Timeline$Window;

    .line 34
    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    invoke-virtual {v0, v3, v4, v5, v6}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    iget-wide v4, v4, Landroidx/media3/common/Timeline$Window;->l:J

    .line 42
    .line 43
    invoke-static {v4, v5}, La/vtt0;->Y(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    cmp-long v6, p2, v4

    .line 48
    .line 49
    if-gez v6, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/lit8 v6, v1, -0x1

    .line 53
    .line 54
    if-ne v3, v6, :cond_1

    .line 55
    .line 56
    move-wide p2, v4

    .line 57
    :goto_1
    invoke-virtual {p1, v3, p2, p3, v2}, La/ulo;->I(IJZ)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    sub-long/2addr p2, v4

    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    check-cast p1, La/ulo;

    .line 66
    .line 67
    const/4 v0, 0x5

    .line 68
    invoke-virtual {p1, v0}, La/ulo;->w(I)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-virtual {p1, p2, p3}, La/ulo;->J(J)V

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_2
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->s()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final m()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->q()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->p()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->t()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->v()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->x()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->r()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->w()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final n(Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->E1:F

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->F1:F

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final o(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->R1:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->R1:Z

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->P1:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->N1:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->O1:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->M1:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->h1:Landroid/widget/ImageView;

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->i1:Landroid/widget/ImageView;

    .line 37
    .line 38
    if-nez p0, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    if-eqz p1, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 5
    .line 6
    iget-object v1, v0, La/n1a0;->a:Landroidx/media3/ui/PlayerControlView;

    .line 7
    .line 8
    iget-object v2, v0, La/n1a0;->y:La/g14;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->S1:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, La/n1a0;->g()V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->m()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 5
    .line 6
    iget-object v1, v0, La/n1a0;->a:Landroidx/media3/ui/PlayerControlView;

    .line 7
    .line 8
    iget-object v2, v0, La/n1a0;->y:La/g14;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->S1:Z

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->t1:La/wss;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, La/n1a0;->f()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 5
    .line 6
    iget-object p0, p0, La/n1a0;->b:Landroid/view/View;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sub-int/2addr p4, p2

    .line 11
    sub-int/2addr p5, p3

    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->S1:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->U1:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->s1:Landroidx/media3/common/Timeline$Window;

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroidx/media3/ui/PlayerControlView;->b(La/my90;Landroidx/media3/common/Timeline$Window;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/16 v1, 0xa

    .line 30
    .line 31
    move-object v2, v0

    .line 32
    check-cast v2, La/ulo;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, La/ulo;->w(I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x5

    .line 40
    move-object v2, v0

    .line 41
    check-cast v2, La/ulo;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, La/ulo;->w(I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :goto_0
    check-cast v0, La/ulo;

    .line 48
    .line 49
    const/4 v2, 0x7

    .line 50
    invoke-virtual {v0, v2}, La/ulo;->w(I)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/16 v3, 0xb

    .line 55
    .line 56
    invoke-virtual {v0, v3}, La/ulo;->w(I)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/16 v4, 0xc

    .line 61
    .line 62
    invoke-virtual {v0, v4}, La/ulo;->w(I)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    const/16 v5, 0x9

    .line 67
    .line 68
    invoke-virtual {v0, v5}, La/ulo;->w(I)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/4 v1, 0x0

    .line 74
    move v0, v1

    .line 75
    move v2, v0

    .line 76
    move v3, v2

    .line 77
    move v4, v3

    .line 78
    :goto_1
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->b:Landroid/content/res/Resources;

    .line 79
    .line 80
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->x:Landroid/view/View;

    .line 81
    .line 82
    const-wide/16 v7, 0x3e8

    .line 83
    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    iget-object v9, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 87
    .line 88
    if-eqz v9, :cond_3

    .line 89
    .line 90
    check-cast v9, La/ulo;

    .line 91
    .line 92
    invoke-virtual {v9}, La/ulo;->c0()V

    .line 93
    .line 94
    .line 95
    iget-short v9, v9, La/ulo;->j0:S

    .line 96
    .line 97
    int-to-long v9, v9

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    const-wide/16 v9, 0x1388

    .line 100
    .line 101
    :goto_2
    div-long/2addr v9, v7

    .line 102
    long-to-int v9, v9

    .line 103
    iget-object v10, p0, Landroidx/media3/ui/PlayerControlView;->z:Landroid/widget/TextView;

    .line 104
    .line 105
    if-eqz v10, :cond_4

    .line 106
    .line 107
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    if-eqz v6, :cond_5

    .line 115
    .line 116
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    const v11, 0x7f110001

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v11, v9, v10}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    invoke-virtual {v6, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    iget-object v9, p0, Landroidx/media3/ui/PlayerControlView;->w:Landroid/view/View;

    .line 135
    .line 136
    if-eqz v4, :cond_8

    .line 137
    .line 138
    iget-object v10, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 139
    .line 140
    if-eqz v10, :cond_6

    .line 141
    .line 142
    check-cast v10, La/ulo;

    .line 143
    .line 144
    invoke-virtual {v10}, La/ulo;->c0()V

    .line 145
    .line 146
    .line 147
    iget-short v10, v10, La/ulo;->k0:S

    .line 148
    .line 149
    int-to-long v10, v10

    .line 150
    goto :goto_3

    .line 151
    :cond_6
    const-wide/16 v10, 0x3a98

    .line 152
    .line 153
    :goto_3
    div-long/2addr v10, v7

    .line 154
    long-to-int v7, v10

    .line 155
    iget-object v8, p0, Landroidx/media3/ui/PlayerControlView;->y:Landroid/widget/TextView;

    .line 156
    .line 157
    if-eqz v8, :cond_7

    .line 158
    .line 159
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    :cond_7
    if-eqz v9, :cond_8

    .line 167
    .line 168
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    const/high16 v10, 0x7f110000

    .line 177
    .line 178
    invoke-virtual {v5, v10, v7, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v9, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    :cond_8
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->t:Landroid/widget/ImageView;

    .line 186
    .line 187
    invoke-virtual {p0, v5, v2}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, v6, v3}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v9, v4}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 194
    .line 195
    .line 196
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->u:Landroid/widget/ImageView;

    .line 197
    .line 198
    invoke-virtual {p0, v2, v0}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 199
    .line 200
    .line 201
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->o1:La/zxj;

    .line 202
    .line 203
    if-eqz p0, :cond_9

    .line 204
    .line 205
    invoke-virtual {p0, v1}, La/zxj;->setEnabled(Z)V

    .line 206
    .line 207
    .line 208
    :cond_9
    :goto_4
    return-void
.end method

.method public final q()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->S1:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_8

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->v:Landroid/widget/ImageView;

    .line 14
    .line 15
    if-eqz v0, :cond_b

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 18
    .line 19
    iget-boolean v2, p0, Landroidx/media3/ui/PlayerControlView;->V1:Z

    .line 20
    .line 21
    invoke-static {v1, v2}, La/vtt0;->V(La/my90;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->u1:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->v1:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    :goto_0
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const v1, 0x7f130807

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const v1, 0x7f130806

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->b:Landroid/content/res/Resources;

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    if-nez v1, :cond_3

    .line 57
    .line 58
    goto :goto_7

    .line 59
    :cond_3
    check-cast v1, La/ulo;

    .line 60
    .line 61
    invoke-virtual {v1}, La/ulo;->s()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/16 v4, 0x10

    .line 66
    .line 67
    invoke-virtual {v1, v4}, La/ulo;->w(I)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const/4 v5, 0x1

    .line 72
    if-eqz v4, :cond_6

    .line 73
    .line 74
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, La/bmq0;->p()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_4

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {v1}, La/ulo;->j()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    iget-object v7, v1, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 91
    .line 92
    const-wide/16 v8, 0x0

    .line 93
    .line 94
    invoke-virtual {v4, v6, v7, v8, v9}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    iget-object v4, v4, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 99
    .line 100
    :goto_2
    if-eqz v4, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    move v4, v2

    .line 104
    goto :goto_4

    .line 105
    :cond_6
    :goto_3
    move v4, v5

    .line 106
    :goto_4
    invoke-virtual {v1, v5}, La/ulo;->w(I)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-ne v3, v5, :cond_7

    .line 111
    .line 112
    const/4 v7, 0x2

    .line 113
    invoke-virtual {v1, v7}, La/ulo;->w(I)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_7

    .line 118
    .line 119
    move v7, v5

    .line 120
    goto :goto_5

    .line 121
    :cond_7
    move v7, v2

    .line 122
    :goto_5
    const/4 v8, 0x4

    .line 123
    if-ne v3, v8, :cond_8

    .line 124
    .line 125
    invoke-virtual {v1, v8}, La/ulo;->w(I)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    move v1, v5

    .line 132
    goto :goto_6

    .line 133
    :cond_8
    move v1, v2

    .line 134
    :goto_6
    if-eqz v4, :cond_a

    .line 135
    .line 136
    if-nez v6, :cond_9

    .line 137
    .line 138
    if-nez v7, :cond_9

    .line 139
    .line 140
    if-eqz v1, :cond_a

    .line 141
    .line 142
    :cond_9
    move v2, v5

    .line 143
    :cond_a
    :goto_7
    invoke-virtual {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 144
    .line 145
    .line 146
    :cond_b
    :goto_8
    return-void
.end method

.method public final r()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast v0, La/ulo;

    .line 7
    .line 8
    invoke-virtual {v0}, La/ulo;->c0()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/ulo;->n0:La/yx90;

    .line 12
    .line 13
    iget-object v0, v0, La/yx90;->o:La/zx90;

    .line 14
    .line 15
    iget v0, v0, La/zx90;->a:F

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 19
    .line 20
    .line 21
    move v3, v1

    .line 22
    move v4, v3

    .line 23
    :goto_0
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->n:La/b1a0;

    .line 24
    .line 25
    iget-object v6, v5, La/b1a0;->e:[F

    .line 26
    .line 27
    array-length v7, v6

    .line 28
    if-ge v3, v7, :cond_2

    .line 29
    .line 30
    aget v5, v6, v3

    .line 31
    .line 32
    sub-float v5, v0, v5

    .line 33
    .line 34
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpg-float v6, v5, v2

    .line 39
    .line 40
    if-gez v6, :cond_1

    .line 41
    .line 42
    move v4, v3

    .line 43
    move v2, v5

    .line 44
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iput v4, v5, La/b1a0;->f:I

    .line 48
    .line 49
    iget-object v0, v5, La/b1a0;->d:[Ljava/lang/String;

    .line 50
    .line 51
    aget-object v0, v0, v4

    .line 52
    .line 53
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->m:La/e1a0;

    .line 54
    .line 55
    iget-object v3, v2, La/e1a0;->f:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, [Ljava/lang/String;

    .line 58
    .line 59
    aput-object v0, v3, v1

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    invoke-virtual {v2, v0}, La/e1a0;->A(I)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2, v1}, La/e1a0;->A(I)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    :cond_3
    move v1, v0

    .line 75
    :cond_4
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->j1:Landroid/view/View;

    .line 76
    .line 77
    invoke-virtual {p0, v0, v1}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final s()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->S1:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, La/ulo;

    .line 19
    .line 20
    const/16 v2, 0x10

    .line 21
    .line 22
    invoke-virtual {v1, v2}, La/ulo;->w(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget-wide v2, p0, Landroidx/media3/ui/PlayerControlView;->g2:J

    .line 29
    .line 30
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 31
    .line 32
    .line 33
    iget-object v4, v1, La/ulo;->n0:La/yx90;

    .line 34
    .line 35
    invoke-virtual {v1, v4}, La/ulo;->g(La/yx90;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    add-long/2addr v4, v2

    .line 40
    iget-wide v2, p0, Landroidx/media3/ui/PlayerControlView;->g2:J

    .line 41
    .line 42
    invoke-virtual {v1}, La/ulo;->f()J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    add-long/2addr v6, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-wide/16 v4, 0x0

    .line 49
    .line 50
    move-wide v6, v4

    .line 51
    :goto_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->n1:Landroid/widget/TextView;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    iget-boolean v2, p0, Landroidx/media3/ui/PlayerControlView;->X1:Z

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->p1:Ljava/lang/StringBuilder;

    .line 60
    .line 61
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->q1:Ljava/util/Formatter;

    .line 62
    .line 63
    invoke-static {v2, v3, v4, v5}, La/vtt0;->B(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->o1:La/zxj;

    .line 71
    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    invoke-virtual {v1, v4, v5}, La/zxj;->setPosition(J)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerControlView;->j(La/my90;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    move-wide v6, v4

    .line 84
    :cond_3
    invoke-virtual {v1, v6, v7}, La/zxj;->setBufferedPosition(J)V

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->t1:La/wss;

    .line 88
    .line 89
    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 90
    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    if-nez v0, :cond_5

    .line 94
    .line 95
    move v6, v3

    .line 96
    goto :goto_1

    .line 97
    :cond_5
    move-object v6, v0

    .line 98
    check-cast v6, La/ulo;

    .line 99
    .line 100
    invoke-virtual {v6}, La/ulo;->s()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    :goto_1
    const-wide/16 v7, 0x3e8

    .line 105
    .line 106
    if-eqz v0, :cond_8

    .line 107
    .line 108
    check-cast v0, La/ulo;

    .line 109
    .line 110
    invoke-virtual {v0}, La/ulo;->y()Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_8

    .line 115
    .line 116
    if-eqz v1, :cond_6

    .line 117
    .line 118
    invoke-virtual {v1}, La/zxj;->getPreferredUpdateDelay()J

    .line 119
    .line 120
    .line 121
    move-result-wide v9

    .line 122
    goto :goto_2

    .line 123
    :cond_6
    move-wide v9, v7

    .line 124
    :goto_2
    rem-long/2addr v4, v7

    .line 125
    sub-long v3, v7, v4

    .line 126
    .line 127
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 128
    .line 129
    .line 130
    move-result-wide v3

    .line 131
    invoke-virtual {v0}, La/ulo;->c0()V

    .line 132
    .line 133
    .line 134
    iget-object v0, v0, La/ulo;->n0:La/yx90;

    .line 135
    .line 136
    iget-object v0, v0, La/yx90;->o:La/zx90;

    .line 137
    .line 138
    iget v0, v0, La/zx90;->a:F

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    cmpl-float v1, v0, v1

    .line 142
    .line 143
    if-lez v1, :cond_7

    .line 144
    .line 145
    long-to-float v1, v3

    .line 146
    div-float/2addr v1, v0

    .line 147
    float-to-long v7, v1

    .line 148
    :cond_7
    move-wide v9, v7

    .line 149
    iget v0, p0, Landroidx/media3/ui/PlayerControlView;->a2:I

    .line 150
    .line 151
    int-to-long v11, v0

    .line 152
    const-wide/16 v13, 0x3e8

    .line 153
    .line 154
    invoke-static/range {v9 .. v14}, La/vtt0;->j(JJJ)J

    .line 155
    .line 156
    .line 157
    move-result-wide v0

    .line 158
    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_8
    const/4 v0, 0x4

    .line 163
    if-eq v6, v0, :cond_9

    .line 164
    .line 165
    if-eq v6, v3, :cond_9

    .line 166
    .line 167
    invoke-virtual {p0, v2, v7, v8}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 168
    .line 169
    .line 170
    :cond_9
    :goto_3
    return-void
.end method

.method public setAnimationEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iput-boolean p1, p0, La/n1a0;->D:Z

    .line 4
    .line 5
    return-void
.end method

.method public setMediaRouteButtonViewProvider(La/eku0;)V
    .locals 3

    .line 1
    const v0, 0x7f0a04ff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/16 p0, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, La/eku0;->getView()La/ig00;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v2, La/ouu;

    .line 31
    .line 32
    invoke-direct {v2, p0, v0, v1}, La/ouu;-><init>(Landroidx/media3/ui/PlayerControlView;Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->c:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    new-instance v0, La/j44;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-direct {v0, p0, v1}, La/j44;-><init>(Landroid/os/Handler;B)V

    .line 44
    .line 45
    .line 46
    new-instance p0, La/lfr;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {p0, p1, v2, v1}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, p0, v0}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    const-string p0, "The media route button placeholder has no parent view."

    .line 57
    .line 58
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    const-string p0, "The media route button placeholder is missing."

    .line 63
    .line 64
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public setOnFullScreenModeChangedListener(La/a1a0;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    const/16 v3, 0x8

    .line 9
    .line 10
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->h1:Landroid/widget/ImageView;

    .line 11
    .line 12
    if-nez v4, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    :goto_1
    if-eqz p1, :cond_3

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_3
    move v1, v0

    .line 28
    :goto_2
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->i1:Landroid/widget/ImageView;

    .line 29
    .line 30
    if-nez p0, :cond_4

    .line 31
    .line 32
    return-void

    .line 33
    :cond_4
    if-eqz v1, :cond_5

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_5
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setPlayer(La/my90;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    move-object v0, p1

    .line 22
    check-cast v0, La/ulo;

    .line 23
    .line 24
    iget-object v0, v0, La/ulo;->t:Landroid/os/Looper;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    :cond_1
    move v2, v3

    .line 33
    :cond_2
    invoke-static {v2}, La/x0x;->A(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 37
    .line 38
    if-ne v0, p1, :cond_3

    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->d:La/z0a0;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    check-cast v0, La/ulo;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/ulo;->G(La/ky90;)V

    .line 48
    .line 49
    .line 50
    :cond_4
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    check-cast p1, La/ulo;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, La/ulo;->a(La/ky90;)V

    .line 57
    .line 58
    .line 59
    :cond_5
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->m()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public setProgressUpdateListener(La/c1a0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 4

    .line 1
    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->b2:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    check-cast v0, La/ulo;

    .line 12
    .line 13
    invoke-virtual {v0, v3}, La/ulo;->w(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 20
    .line 21
    check-cast v0, La/ulo;

    .line 22
    .line 23
    invoke-virtual {v0}, La/ulo;->c0()V

    .line 24
    .line 25
    .line 26
    iget v0, v0, La/ulo;->H:I

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 33
    .line 34
    check-cast v0, La/ulo;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, La/ulo;->Q(I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v3, 0x2

    .line 41
    if-ne p1, v2, :cond_1

    .line 42
    .line 43
    if-ne v0, v3, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 46
    .line 47
    check-cast v0, La/ulo;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, La/ulo;->Q(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    if-ne p1, v3, :cond_2

    .line 54
    .line 55
    if-ne v0, v2, :cond_2

    .line 56
    .line 57
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 58
    .line 59
    check-cast v0, La/ulo;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, La/ulo;->Q(I)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 65
    .line 66
    move v1, v2

    .line 67
    :cond_3
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 68
    .line 69
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->A:Landroid/widget/ImageView;

    .line 70
    .line 71
    invoke-virtual {p1, v0, v1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->t()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->w:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->p()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->U1:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->u:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->p()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->V1:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->q()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->t:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->p()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->x:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->p()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->B:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->v()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->g1:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->Y1:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/n1a0;->g()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->f1:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, La/n1a0;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, La/vtt0;->i(III)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->a2:I

    .line 10
    .line 11
    return-void
.end method

.method public setTimeBarScrubbingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->Z1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->f1:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, v0, p1}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final t()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->S1:Z

    .line 8
    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->A:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget v1, p0, Landroidx/media3/ui/PlayerControlView;->b2:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 26
    .line 27
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->z1:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->w1:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    if-eqz v1, :cond_6

    .line 32
    .line 33
    check-cast v1, La/ulo;

    .line 34
    .line 35
    const/16 v5, 0xf

    .line 36
    .line 37
    invoke-virtual {v1, v5}, La/ulo;->w(I)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v2, 0x1

    .line 45
    invoke-virtual {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 49
    .line 50
    .line 51
    iget v1, v1, La/ulo;->H:I

    .line 52
    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    if-eq v1, v2, :cond_4

    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    if-eq v1, v2, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->y1:Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->B1:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->x1:Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->A1:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_6
    :goto_0
    invoke-virtual {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    :cond_7
    :goto_1
    return-void
.end method

.method public final u()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v2, p0, Landroidx/media3/ui/PlayerControlView;->s:I

    .line 12
    .line 13
    mul-int/lit8 v3, v2, 0x2

    .line 14
    .line 15
    sub-int/2addr v0, v3

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    mul-int/lit8 v2, v2, 0x2

    .line 34
    .line 35
    sub-int/2addr p0, v2

    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-virtual {v3, p0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final v()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->S1:Z

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->B:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, La/n1a0;->b(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v0, v3}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->H1:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->D1:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    check-cast v1, La/ulo;

    .line 38
    .line 39
    const/16 v5, 0xe

    .line 40
    .line 41
    invoke-virtual {v1, v5}, La/ulo;->w(I)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v3, 0x1

    .line 49
    invoke-virtual {p0, v0, v3}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 53
    .line 54
    .line 55
    iget-boolean v3, v1, La/ulo;->I:Z

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->C1:Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 65
    .line 66
    .line 67
    iget-boolean v1, v1, La/ulo;->I:Z

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->G1:Ljava/lang/String;

    .line 72
    .line 73
    :cond_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    :goto_0
    invoke-virtual {p0, v0, v3}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    :cond_6
    :goto_1
    return-void
.end method

.method public final w()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v2, v0, Landroidx/media3/ui/PlayerControlView;->U1:Z

    .line 9
    .line 10
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->s1:Landroidx/media3/common/Timeline$Window;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-static {v1, v3}, Landroidx/media3/ui/PlayerControlView;->b(La/my90;Landroidx/media3/common/Timeline$Window;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v2, v4

    .line 25
    :goto_0
    iput-boolean v2, v0, Landroidx/media3/ui/PlayerControlView;->W1:Z

    .line 26
    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    iput-wide v6, v0, Landroidx/media3/ui/PlayerControlView;->g2:J

    .line 30
    .line 31
    check-cast v1, La/ulo;

    .line 32
    .line 33
    const/16 v2, 0x11

    .line 34
    .line 35
    invoke-virtual {v1, v2}, La/ulo;->w(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget-object v2, La/bmq0;->a:La/zlq0;

    .line 47
    .line 48
    :goto_1
    invoke-virtual {v2}, La/bmq0;->p()Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-nez v8, :cond_11

    .line 53
    .line 54
    invoke-virtual {v1}, La/ulo;->j()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iget-boolean v8, v0, Landroidx/media3/ui/PlayerControlView;->W1:Z

    .line 59
    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    move v11, v4

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move v11, v1

    .line 65
    :goto_2
    if-eqz v8, :cond_4

    .line 66
    .line 67
    invoke-virtual {v2}, La/bmq0;->o()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    sub-int/2addr v8, v5

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    move v8, v1

    .line 74
    :goto_3
    move v14, v4

    .line 75
    move-wide v12, v6

    .line 76
    :goto_4
    if-gt v11, v8, :cond_6

    .line 77
    .line 78
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    if-ne v11, v1, :cond_5

    .line 84
    .line 85
    invoke-static {v12, v13}, La/vtt0;->Y(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    iput-wide v9, v0, Landroidx/media3/ui/PlayerControlView;->g2:J

    .line 90
    .line 91
    :cond_5
    invoke-virtual {v2, v11, v3}, La/bmq0;->n(ILandroidx/media3/common/Timeline$Window;)V

    .line 92
    .line 93
    .line 94
    iget-wide v9, v3, Landroidx/media3/common/Timeline$Window;->l:J

    .line 95
    .line 96
    cmp-long v9, v9, v15

    .line 97
    .line 98
    if-nez v9, :cond_7

    .line 99
    .line 100
    iget-boolean v1, v0, Landroidx/media3/ui/PlayerControlView;->W1:Z

    .line 101
    .line 102
    xor-int/2addr v1, v5

    .line 103
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 104
    .line 105
    .line 106
    :cond_6
    move v2, v5

    .line 107
    goto/16 :goto_c

    .line 108
    .line 109
    :cond_7
    iget v9, v3, Landroidx/media3/common/Timeline$Window;->m:I

    .line 110
    .line 111
    :goto_5
    iget v10, v3, Landroidx/media3/common/Timeline$Window;->n:I

    .line 112
    .line 113
    if-gt v9, v10, :cond_10

    .line 114
    .line 115
    iget-object v10, v0, Landroidx/media3/ui/PlayerControlView;->r1:La/amq0;

    .line 116
    .line 117
    invoke-virtual {v2, v9, v10, v4}, La/bmq0;->f(ILa/amq0;Z)La/amq0;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-wide/from16 v17, v15

    .line 124
    .line 125
    sget-object v15, La/uo;->c:La/uo;

    .line 126
    .line 127
    iget v15, v15, La/uo;->a:I

    .line 128
    .line 129
    :goto_6
    if-ge v4, v15, :cond_f

    .line 130
    .line 131
    invoke-virtual {v10, v4}, La/amq0;->d(I)J

    .line 132
    .line 133
    .line 134
    move-wide/from16 v19, v6

    .line 135
    .line 136
    iget-wide v6, v10, La/amq0;->e:J

    .line 137
    .line 138
    cmp-long v21, v6, v19

    .line 139
    .line 140
    if-ltz v21, :cond_e

    .line 141
    .line 142
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->c2:[J

    .line 143
    .line 144
    move/from16 v22, v1

    .line 145
    .line 146
    array-length v1, v5

    .line 147
    if-ne v14, v1, :cond_9

    .line 148
    .line 149
    array-length v1, v5

    .line 150
    if-nez v1, :cond_8

    .line 151
    .line 152
    const/4 v1, 0x1

    .line 153
    goto :goto_7

    .line 154
    :cond_8
    array-length v1, v5

    .line 155
    mul-int/lit8 v1, v1, 0x2

    .line 156
    .line 157
    :goto_7
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->c2:[J

    .line 162
    .line 163
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->d2:[Z

    .line 164
    .line 165
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->d2:[Z

    .line 170
    .line 171
    :cond_9
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->c2:[J

    .line 172
    .line 173
    add-long/2addr v6, v12

    .line 174
    invoke-static {v6, v7}, La/vtt0;->Y(J)J

    .line 175
    .line 176
    .line 177
    move-result-wide v5

    .line 178
    aput-wide v5, v1, v14

    .line 179
    .line 180
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->d2:[Z

    .line 181
    .line 182
    sget-object v5, La/uo;->c:La/uo;

    .line 183
    .line 184
    invoke-virtual {v5, v4}, La/uo;->a(I)La/so;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    iget v6, v5, La/so;->a:I

    .line 189
    .line 190
    const/4 v7, -0x1

    .line 191
    if-ne v6, v7, :cond_a

    .line 192
    .line 193
    move-object/from16 v23, v1

    .line 194
    .line 195
    move-object/from16 v24, v2

    .line 196
    .line 197
    const/4 v2, 0x1

    .line 198
    goto :goto_9

    .line 199
    :cond_a
    const/4 v7, 0x0

    .line 200
    :goto_8
    if-ge v7, v6, :cond_d

    .line 201
    .line 202
    move-object/from16 v23, v1

    .line 203
    .line 204
    iget-object v1, v5, La/so;->d:[I

    .line 205
    .line 206
    aget v1, v1, v7

    .line 207
    .line 208
    move-object/from16 v24, v2

    .line 209
    .line 210
    const/4 v2, 0x1

    .line 211
    if-eqz v1, :cond_c

    .line 212
    .line 213
    if-ne v1, v2, :cond_b

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_b
    add-int/lit8 v7, v7, 0x1

    .line 217
    .line 218
    move-object/from16 v1, v23

    .line 219
    .line 220
    move-object/from16 v2, v24

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_c
    :goto_9
    move v1, v2

    .line 224
    goto :goto_a

    .line 225
    :cond_d
    move-object/from16 v23, v1

    .line 226
    .line 227
    move-object/from16 v24, v2

    .line 228
    .line 229
    const/4 v2, 0x1

    .line 230
    const/4 v1, 0x0

    .line 231
    :goto_a
    xor-int/2addr v1, v2

    .line 232
    aput-boolean v1, v23, v14

    .line 233
    .line 234
    add-int/lit8 v14, v14, 0x1

    .line 235
    .line 236
    goto :goto_b

    .line 237
    :cond_e
    move/from16 v22, v1

    .line 238
    .line 239
    move-object/from16 v24, v2

    .line 240
    .line 241
    move v2, v5

    .line 242
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 243
    .line 244
    move v5, v2

    .line 245
    move-wide/from16 v6, v19

    .line 246
    .line 247
    move/from16 v1, v22

    .line 248
    .line 249
    move-object/from16 v2, v24

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_f
    move/from16 v22, v1

    .line 253
    .line 254
    move-object/from16 v24, v2

    .line 255
    .line 256
    move v2, v5

    .line 257
    move-wide/from16 v19, v6

    .line 258
    .line 259
    add-int/lit8 v9, v9, 0x1

    .line 260
    .line 261
    move-wide/from16 v15, v17

    .line 262
    .line 263
    move-object/from16 v2, v24

    .line 264
    .line 265
    const/4 v4, 0x0

    .line 266
    goto/16 :goto_5

    .line 267
    .line 268
    :cond_10
    move/from16 v22, v1

    .line 269
    .line 270
    move-object/from16 v24, v2

    .line 271
    .line 272
    move v2, v5

    .line 273
    move-wide/from16 v19, v6

    .line 274
    .line 275
    move-wide/from16 v17, v15

    .line 276
    .line 277
    iget-wide v4, v3, Landroidx/media3/common/Timeline$Window;->l:J

    .line 278
    .line 279
    add-long/2addr v12, v4

    .line 280
    add-int/lit8 v11, v11, 0x1

    .line 281
    .line 282
    move v5, v2

    .line 283
    move-object/from16 v2, v24

    .line 284
    .line 285
    const/4 v4, 0x0

    .line 286
    goto/16 :goto_4

    .line 287
    .line 288
    :goto_c
    move-wide v6, v12

    .line 289
    goto :goto_f

    .line 290
    :cond_11
    move v2, v5

    .line 291
    move-wide/from16 v19, v6

    .line 292
    .line 293
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    const/16 v3, 0x10

    .line 299
    .line 300
    invoke-virtual {v1, v3}, La/ulo;->w(I)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_13

    .line 305
    .line 306
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v3}, La/bmq0;->p()Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_12

    .line 315
    .line 316
    move-wide/from16 v3, v17

    .line 317
    .line 318
    move-wide/from16 v5, v19

    .line 319
    .line 320
    goto :goto_d

    .line 321
    :cond_12
    invoke-virtual {v1}, La/ulo;->j()I

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    iget-object v1, v1, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 326
    .line 327
    move-wide/from16 v5, v19

    .line 328
    .line 329
    invoke-virtual {v3, v4, v1, v5, v6}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    iget-wide v3, v1, Landroidx/media3/common/Timeline$Window;->l:J

    .line 334
    .line 335
    invoke-static {v3, v4}, La/vtt0;->Y(J)J

    .line 336
    .line 337
    .line 338
    move-result-wide v3

    .line 339
    :goto_d
    cmp-long v1, v3, v17

    .line 340
    .line 341
    if-eqz v1, :cond_14

    .line 342
    .line 343
    invoke-static {v3, v4}, La/vtt0;->M(J)J

    .line 344
    .line 345
    .line 346
    move-result-wide v6

    .line 347
    :goto_e
    const/4 v14, 0x0

    .line 348
    goto :goto_f

    .line 349
    :cond_13
    move-wide/from16 v5, v19

    .line 350
    .line 351
    :cond_14
    move-wide v6, v5

    .line 352
    goto :goto_e

    .line 353
    :goto_f
    invoke-static {v6, v7}, La/vtt0;->Y(J)J

    .line 354
    .line 355
    .line 356
    move-result-wide v3

    .line 357
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->m1:Landroid/widget/TextView;

    .line 358
    .line 359
    if-eqz v1, :cond_15

    .line 360
    .line 361
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->p1:Ljava/lang/StringBuilder;

    .line 362
    .line 363
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->q1:Ljava/util/Formatter;

    .line 364
    .line 365
    invoke-static {v5, v6, v3, v4}, La/vtt0;->B(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    .line 371
    .line 372
    :cond_15
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->o1:La/zxj;

    .line 373
    .line 374
    if-eqz v1, :cond_19

    .line 375
    .line 376
    invoke-virtual {v1, v3, v4}, La/zxj;->setDuration(J)V

    .line 377
    .line 378
    .line 379
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->e2:[J

    .line 380
    .line 381
    array-length v4, v3

    .line 382
    add-int v5, v14, v4

    .line 383
    .line 384
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->c2:[J

    .line 385
    .line 386
    array-length v7, v6

    .line 387
    if-le v5, v7, :cond_16

    .line 388
    .line 389
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->c2:[J

    .line 394
    .line 395
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->d2:[Z

    .line 396
    .line 397
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->d2:[Z

    .line 402
    .line 403
    :cond_16
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->c2:[J

    .line 404
    .line 405
    const/4 v7, 0x0

    .line 406
    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 407
    .line 408
    .line 409
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->f2:[Z

    .line 410
    .line 411
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->d2:[Z

    .line 412
    .line 413
    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 414
    .line 415
    .line 416
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->c2:[J

    .line 417
    .line 418
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d2:[Z

    .line 419
    .line 420
    if-eqz v5, :cond_18

    .line 421
    .line 422
    if-eqz v3, :cond_17

    .line 423
    .line 424
    if-eqz v4, :cond_17

    .line 425
    .line 426
    goto :goto_10

    .line 427
    :cond_17
    move v2, v7

    .line 428
    :cond_18
    :goto_10
    invoke-static {v2}, La/x0x;->A(Z)V

    .line 429
    .line 430
    .line 431
    iput v5, v1, La/zxj;->p1:I

    .line 432
    .line 433
    iput-object v3, v1, La/zxj;->q1:[J

    .line 434
    .line 435
    iput-object v4, v1, La/zxj;->r1:[Z

    .line 436
    .line 437
    invoke-virtual {v1}, La/zxj;->e()V

    .line 438
    .line 439
    .line 440
    :cond_19
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView;->s()V

    .line 441
    .line 442
    .line 443
    return-void
.end method

.method public final x()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->o:La/y0a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, La/i26;->e:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->p:La/y0a0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v1, v2, La/i26;->e:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 18
    .line 19
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->g1:Landroid/widget/ImageView;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eqz v1, :cond_6

    .line 24
    .line 25
    const/16 v6, 0x1e

    .line 26
    .line 27
    check-cast v1, La/ulo;

    .line 28
    .line 29
    invoke-virtual {v1, v6}, La/ulo;->w(I)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_6

    .line 34
    .line 35
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 36
    .line 37
    const/16 v6, 0x1d

    .line 38
    .line 39
    check-cast v1, La/ulo;

    .line 40
    .line 41
    invoke-virtual {v1, v6}, La/ulo;->w(I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_0

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 50
    .line 51
    check-cast v1, La/ulo;

    .line 52
    .line 53
    invoke-virtual {v1}, La/ulo;->o()La/rds0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p0, v1, v5}, Landroidx/media3/ui/PlayerControlView;->e(La/rds0;I)La/rcf0;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iput-object v6, v2, La/i26;->e:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object v7, v2, La/y0a0;->h:Landroidx/media3/ui/PlayerControlView;

    .line 64
    .line 65
    iget-object v8, v7, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 66
    .line 67
    iget-object v9, v7, Landroidx/media3/ui/PlayerControlView;->m:La/e1a0;

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast v8, La/ulo;

    .line 73
    .line 74
    invoke-virtual {v8}, La/ulo;->v()La/scs0;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_1

    .line 83
    .line 84
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const v6, 0x7f130828

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object v6, v9, La/e1a0;->f:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v6, [Ljava/lang/String;

    .line 98
    .line 99
    aput-object v2, v6, v5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v2, v8}, La/y0a0;->H(La/scs0;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_2

    .line 107
    .line 108
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const v6, 0x7f130827

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iget-object v6, v9, La/e1a0;->f:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v6, [Ljava/lang/String;

    .line 122
    .line 123
    aput-object v2, v6, v5

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    move v2, v4

    .line 127
    :goto_0
    iget v7, v6, La/rcf0;->d:I

    .line 128
    .line 129
    if-ge v2, v7, :cond_4

    .line 130
    .line 131
    invoke-virtual {v6, v2}, La/rcf0;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    check-cast v7, La/g1a0;

    .line 136
    .line 137
    iget-object v8, v7, La/g1a0;->a:La/qds0;

    .line 138
    .line 139
    iget v10, v7, La/g1a0;->b:I

    .line 140
    .line 141
    iget-object v8, v8, La/qds0;->e:[Z

    .line 142
    .line 143
    aget-boolean v8, v8, v10

    .line 144
    .line 145
    if-eqz v8, :cond_3

    .line 146
    .line 147
    iget-object v2, v7, La/g1a0;->c:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v6, v9, La/e1a0;->f:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v6, [Ljava/lang/String;

    .line 152
    .line 153
    aput-object v2, v6, v5

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_4
    :goto_1
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 160
    .line 161
    invoke-virtual {v2, v3}, La/n1a0;->b(Landroid/view/View;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_5

    .line 166
    .line 167
    const/4 v2, 0x3

    .line 168
    invoke-virtual {p0, v1, v2}, Landroidx/media3/ui/PlayerControlView;->e(La/rds0;I)La/rcf0;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v0, v1}, La/y0a0;->I(Ljava/util/List;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_5
    sget-object v1, La/b4x;->b:La/v3x;

    .line 177
    .line 178
    sget-object v1, La/rcf0;->e:La/rcf0;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, La/y0a0;->I(Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    :cond_6
    :goto_2
    invoke-virtual {v0}, La/i26;->d()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-lez v0, :cond_7

    .line 188
    .line 189
    move v0, v5

    .line 190
    goto :goto_3

    .line 191
    :cond_7
    move v0, v4

    .line 192
    :goto_3
    invoke-virtual {p0, v3, v0}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->m:La/e1a0;

    .line 196
    .line 197
    invoke-virtual {v0, v5}, La/e1a0;->A(I)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_8

    .line 202
    .line 203
    invoke-virtual {v0, v4}, La/e1a0;->A(I)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_9

    .line 208
    .line 209
    :cond_8
    move v4, v5

    .line 210
    :cond_9
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->j1:Landroid/view/View;

    .line 211
    .line 212
    invoke-virtual {p0, v0, v4}, Landroidx/media3/ui/PlayerControlView;->n(Landroid/view/View;Z)V

    .line 213
    .line 214
    .line 215
    return-void
.end method
