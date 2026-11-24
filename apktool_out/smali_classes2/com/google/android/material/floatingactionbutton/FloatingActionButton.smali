.class public Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
.super La/puu0;
.source "SourceFile"

# interfaces
.implements La/ano;
.implements La/blj0;
.implements La/xke;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;,
        Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;
    }
.end annotation


# instance fields
.field public b:Landroid/content/res/ColorStateList;

.field public c:Landroid/graphics/PorterDuff$Mode;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/graphics/PorterDuff$Mode;

.field public f:Landroid/content/res/ColorStateList;

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public final l:Landroid/graphics/Rect;

.field public final m:Landroid/graphics/Rect;

.field public final n:La/zz2;

.field public final o:La/u3u0;

.field public p:La/zlq;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 549
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const v4, 0x7f0403bd

    .line 6
    .line 7
    .line 8
    const v7, 0x7f140885

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    invoke-static {v1, v2, v4, v7}, La/dwi0;->V(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1, v2, v4}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, v0, La/puu0;->a:I

    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->l:Landroid/graphics/Rect;

    .line 32
    .line 33
    new-instance v1, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->m:Landroid/graphics/Rect;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v8, 0x0

    .line 45
    new-array v6, v8, [I

    .line 46
    .line 47
    sget-object v3, La/rpd0;->o:[I

    .line 48
    .line 49
    const v5, 0x7f140885

    .line 50
    .line 51
    .line 52
    invoke-static/range {v1 .. v6}, La/mrv;->l0(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const/4 v5, 0x1

    .line 57
    invoke-static {v5, v1, v3}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iput-object v6, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b:Landroid/content/res/ColorStateList;

    .line 62
    .line 63
    const/4 v6, 0x2

    .line 64
    const/4 v9, -0x1

    .line 65
    invoke-virtual {v3, v6, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const/4 v11, 0x0

    .line 70
    invoke-static {v10, v11}, La/afn0;->y(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    iput-object v10, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c:Landroid/graphics/PorterDuff$Mode;

    .line 75
    .line 76
    const/16 v10, 0xc

    .line 77
    .line 78
    invoke-static {v10, v1, v3}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    iput-object v10, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f:Landroid/content/res/ColorStateList;

    .line 83
    .line 84
    const/4 v10, 0x7

    .line 85
    invoke-virtual {v3, v10, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    iput v9, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->g:I

    .line 90
    .line 91
    const/4 v9, 0x6

    .line 92
    invoke-virtual {v3, v9, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    iput v9, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->h:I

    .line 97
    .line 98
    const/4 v9, 0x3

    .line 99
    invoke-virtual {v3, v9, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    const/4 v10, 0x4

    .line 104
    const/4 v12, 0x0

    .line 105
    invoke-virtual {v3, v10, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    const/16 v13, 0x9

    .line 110
    .line 111
    invoke-virtual {v3, v13, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    const/16 v14, 0xb

    .line 116
    .line 117
    invoke-virtual {v3, v14, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    const/16 v14, 0x10

    .line 122
    .line 123
    invoke-virtual {v3, v14, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    iput-boolean v14, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->k:Z

    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    const v15, 0x7f070534

    .line 134
    .line 135
    .line 136
    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 137
    .line 138
    .line 139
    move-result v14

    .line 140
    const/16 v15, 0xa

    .line 141
    .line 142
    invoke-virtual {v3, v15, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    invoke-virtual {v0, v15}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setMaxImageSize(I)V

    .line 147
    .line 148
    .line 149
    const/16 v15, 0xf

    .line 150
    .line 151
    invoke-static {v15, v1, v3}, La/zt40;->a(ILandroid/content/Context;Landroid/content/res/TypedArray;)La/zt40;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    const/16 v11, 0x8

    .line 156
    .line 157
    invoke-static {v11, v1, v3}, La/zt40;->a(ILandroid/content/Context;Landroid/content/res/TypedArray;)La/zt40;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    sget-object v6, La/rpd0;->G:[I

    .line 162
    .line 163
    invoke-virtual {v1, v2, v6, v4, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-virtual {v6, v8, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    invoke-virtual {v6, v5, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 176
    .line 177
    .line 178
    new-instance v6, Landroid/view/ContextThemeWrapper;

    .line 179
    .line 180
    invoke-direct {v6, v1, v7}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 181
    .line 182
    .line 183
    if-eqz v4, :cond_0

    .line 184
    .line 185
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1, v4, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 190
    .line 191
    .line 192
    :cond_0
    sget-object v1, La/rpd0;->O:[I

    .line 193
    .line 194
    invoke-virtual {v6, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    sget-object v4, La/akj0;->m:La/zef0;

    .line 199
    .line 200
    invoke-static {v1, v4}, La/akj0;->i(Landroid/content/res/TypedArray;La/dne;)La/daf;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v1}, La/daf;->c()La/akj0;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    const/4 v4, 0x5

    .line 209
    invoke-virtual {v3, v4, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 221
    .line 222
    .line 223
    new-instance v3, La/zz2;

    .line 224
    .line 225
    invoke-direct {v3, v0}, La/zz2;-><init>(Landroid/widget/ImageView;)V

    .line 226
    .line 227
    .line 228
    iput-object v3, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->n:La/zz2;

    .line 229
    .line 230
    const v6, 0x7f0403bd

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v2, v6}, La/zz2;->z(Landroid/util/AttributeSet;I)V

    .line 234
    .line 235
    .line 236
    new-instance v2, La/u3u0;

    .line 237
    .line 238
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    iput-boolean v8, v2, La/u3u0;->b:Z

    .line 242
    .line 243
    iput v8, v2, La/u3u0;->a:I

    .line 244
    .line 245
    iput-object v0, v2, La/u3u0;->c:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v2, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->o:La/u3u0;

    .line 248
    .line 249
    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v2, v1}, La/zlq;->g(La/akj0;)V

    .line 254
    .line 255
    .line 256
    invoke-direct {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    iget-object v2, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b:Landroid/content/res/ColorStateList;

    .line 261
    .line 262
    iget-object v3, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c:Landroid/graphics/PorterDuff$Mode;

    .line 263
    .line 264
    iget-object v6, v0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f:Landroid/content/res/ColorStateList;

    .line 265
    .line 266
    iget-object v7, v1, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 267
    .line 268
    move/from16 v16, v8

    .line 269
    .line 270
    iget-object v8, v1, La/zlq;->a:La/akj0;

    .line 271
    .line 272
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v5, La/ylq;

    .line 276
    .line 277
    invoke-direct {v5, v8}, La/ki30;-><init>(La/akj0;)V

    .line 278
    .line 279
    .line 280
    iput-object v5, v1, La/zlq;->b:La/ylq;

    .line 281
    .line 282
    invoke-virtual {v5, v2}, La/ki30;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 283
    .line 284
    .line 285
    if-eqz v3, :cond_1

    .line 286
    .line 287
    iget-object v5, v1, La/zlq;->b:La/ylq;

    .line 288
    .line 289
    invoke-virtual {v5, v3}, La/ki30;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 290
    .line 291
    .line 292
    :cond_1
    iget-object v3, v1, La/zlq;->b:La/ylq;

    .line 293
    .line 294
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-virtual {v3, v5}, La/ki30;->o(Landroid/content/Context;)V

    .line 299
    .line 300
    .line 301
    if-lez v9, :cond_4

    .line 302
    .line 303
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    new-instance v5, La/ym8;

    .line 308
    .line 309
    iget-object v8, v1, La/zlq;->a:La/akj0;

    .line 310
    .line 311
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-direct {v5, v8}, La/ym8;-><init>(La/akj0;)V

    .line 315
    .line 316
    .line 317
    const v8, 0x7f0601b5

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, v8}, Landroid/content/Context;->getColor(I)I

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    move-object/from16 p2, v6

    .line 325
    .line 326
    const v6, 0x7f0601b4

    .line 327
    .line 328
    .line 329
    invoke-virtual {v3, v6}, Landroid/content/Context;->getColor(I)I

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    move-object/from16 v17, v7

    .line 334
    .line 335
    const v7, 0x7f0601b2

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v7}, Landroid/content/Context;->getColor(I)I

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    const v0, 0x7f0601b3

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v0}, Landroid/content/Context;->getColor(I)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    iput v8, v5, La/ym8;->i:I

    .line 350
    .line 351
    iput v6, v5, La/ym8;->j:I

    .line 352
    .line 353
    iput v7, v5, La/ym8;->k:I

    .line 354
    .line 355
    iput v0, v5, La/ym8;->l:I

    .line 356
    .line 357
    int-to-float v0, v9

    .line 358
    iget v3, v5, La/ym8;->h:F

    .line 359
    .line 360
    cmpl-float v3, v3, v0

    .line 361
    .line 362
    if-eqz v3, :cond_2

    .line 363
    .line 364
    iput v0, v5, La/ym8;->h:F

    .line 365
    .line 366
    const v3, 0x3faaa993    # 1.3333f

    .line 367
    .line 368
    .line 369
    mul-float/2addr v0, v3

    .line 370
    iget-object v3, v5, La/ym8;->b:Landroid/graphics/Paint;

    .line 371
    .line 372
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 373
    .line 374
    .line 375
    const/4 v0, 0x1

    .line 376
    iput-boolean v0, v5, La/ym8;->n:Z

    .line 377
    .line 378
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 379
    .line 380
    .line 381
    :cond_2
    if-eqz v2, :cond_3

    .line 382
    .line 383
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    iget v3, v5, La/ym8;->m:I

    .line 388
    .line 389
    invoke-virtual {v2, v0, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    iput v0, v5, La/ym8;->m:I

    .line 394
    .line 395
    :cond_3
    iput-object v2, v5, La/ym8;->p:Landroid/content/res/ColorStateList;

    .line 396
    .line 397
    const/4 v0, 0x1

    .line 398
    iput-boolean v0, v5, La/ym8;->n:Z

    .line 399
    .line 400
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 401
    .line 402
    .line 403
    iput-object v5, v1, La/zlq;->d:La/ym8;

    .line 404
    .line 405
    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    .line 406
    .line 407
    iget-object v3, v1, La/zlq;->d:La/ym8;

    .line 408
    .line 409
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object v5, v1, La/zlq;->b:La/ylq;

    .line 413
    .line 414
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    const/4 v6, 0x2

    .line 418
    new-array v6, v6, [Landroid/graphics/drawable/Drawable;

    .line 419
    .line 420
    aput-object v3, v6, v16

    .line 421
    .line 422
    aput-object v5, v6, v0

    .line 423
    .line 424
    invoke-direct {v2, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 425
    .line 426
    .line 427
    const/4 v0, 0x0

    .line 428
    goto :goto_0

    .line 429
    :cond_4
    move-object/from16 p2, v6

    .line 430
    .line 431
    move-object/from16 v17, v7

    .line 432
    .line 433
    const/4 v0, 0x0

    .line 434
    iput-object v0, v1, La/zlq;->d:La/ym8;

    .line 435
    .line 436
    iget-object v2, v1, La/zlq;->b:La/ylq;

    .line 437
    .line 438
    :goto_0
    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    .line 439
    .line 440
    invoke-static/range {p2 .. p2}, La/ocg0;->b(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    invoke-direct {v3, v5, v2, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 445
    .line 446
    .line 447
    iput-object v3, v1, La/zlq;->c:Landroid/graphics/drawable/RippleDrawable;

    .line 448
    .line 449
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    iget-object v2, v1, La/zlq;->b:La/ylq;

    .line 454
    .line 455
    invoke-static {v0, v3, v2}, Lcom/google/android/material/focus/FocusRingDrawable;->f(Landroid/content/Context;Landroid/graphics/drawable/LayerDrawable;La/ki30;)Lcom/google/android/material/focus/FocusRingDrawable;

    .line 456
    .line 457
    .line 458
    iput-object v3, v1, La/zlq;->e:Landroid/graphics/drawable/RippleDrawable;

    .line 459
    .line 460
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    iput v14, v0, La/zlq;->k:I

    .line 465
    .line 466
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    iget v1, v0, La/zlq;->h:F

    .line 471
    .line 472
    cmpl-float v1, v1, v10

    .line 473
    .line 474
    if-eqz v1, :cond_5

    .line 475
    .line 476
    iput v10, v0, La/zlq;->h:F

    .line 477
    .line 478
    iget v1, v0, La/zlq;->i:F

    .line 479
    .line 480
    iget v2, v0, La/zlq;->j:F

    .line 481
    .line 482
    invoke-virtual {v0, v10, v1, v2}, La/zlq;->e(FFF)V

    .line 483
    .line 484
    .line 485
    :cond_5
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    iget v1, v0, La/zlq;->i:F

    .line 490
    .line 491
    cmpl-float v1, v1, v13

    .line 492
    .line 493
    if-eqz v1, :cond_6

    .line 494
    .line 495
    iput v13, v0, La/zlq;->i:F

    .line 496
    .line 497
    iget v1, v0, La/zlq;->h:F

    .line 498
    .line 499
    iget v2, v0, La/zlq;->j:F

    .line 500
    .line 501
    invoke-virtual {v0, v1, v13, v2}, La/zlq;->e(FFF)V

    .line 502
    .line 503
    .line 504
    :cond_6
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    iget v1, v0, La/zlq;->j:F

    .line 509
    .line 510
    cmpl-float v1, v1, v12

    .line 511
    .line 512
    if-eqz v1, :cond_7

    .line 513
    .line 514
    iput v12, v0, La/zlq;->j:F

    .line 515
    .line 516
    iget v1, v0, La/zlq;->h:F

    .line 517
    .line 518
    iget v2, v0, La/zlq;->i:F

    .line 519
    .line 520
    invoke-virtual {v0, v1, v2, v12}, La/zlq;->e(FFF)V

    .line 521
    .line 522
    .line 523
    :cond_7
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    iput-object v15, v0, La/zlq;->n:La/zt40;

    .line 528
    .line 529
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    iput-object v11, v0, La/zlq;->o:La/zt40;

    .line 534
    .line 535
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    iput-boolean v4, v0, La/zlq;->f:Z

    .line 540
    .line 541
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 542
    .line 543
    move-object/from16 v1, p0

    .line 544
    .line 545
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 546
    .line 547
    .line 548
    return-void
.end method

.method public static synthetic b(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getImpl()La/zlq;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->p:La/zlq;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/zlq;

    .line 6
    .line 7
    new-instance v1, La/bwl;

    .line 8
    .line 9
    invoke-direct {v1, p0}, La/bwl;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/zlq;-><init>(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;La/bwl;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->p:La/zlq;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final c(I)I
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->h:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, -0x1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq p1, v1, :cond_2

    .line 13
    .line 14
    if-eq p1, v2, :cond_1

    .line 15
    .line 16
    const p0, 0x7f070105

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    const p0, 0x7f070104

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0

    .line 32
    :cond_2
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget p1, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v0, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 43
    .line 44
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const/16 v0, 0x1d6

    .line 49
    .line 50
    if-ge p1, v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c(I)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_3
    const/4 p1, 0x0

    .line 58
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c(I)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0
.end method

.method public final d()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, v0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-byte v2, v0, La/zlq;->r:B

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-ne v2, v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x2

    .line 20
    if-eq v2, v1, :cond_1

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_1
    iget-object v1, v0, La/zlq;->m:Landroid/animation/Animator;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object v1, v0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    iget-object p0, v0, La/zlq;->o:La/zt40;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, p0, v1, v1, v1}, La/zlq;->b(La/zt40;FFF)Landroid/animation/AnimatorSet;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    sget v4, La/zlq;->B:I

    .line 55
    .line 56
    sget v5, La/zlq;->C:I

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    const v2, 0x3ecccccd    # 0.4f

    .line 60
    .line 61
    .line 62
    const v3, 0x3ecccccd    # 0.4f

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {v0 .. v5}, La/zlq;->c(FFFII)Landroid/animation/AnimatorSet;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :goto_1
    new-instance v1, La/uuo;

    .line 70
    .line 71
    invoke-direct {v1, v0}, La/uuo;-><init>(La/zlq;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    const/4 v0, 0x4

    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-virtual {p0, v0, v1}, La/puu0;->a(IZ)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final drawableStateChanged()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->d:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e:Landroid/graphics/PorterDuff$Mode;

    .line 26
    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 30
    .line 31
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v1, p0}, La/td3;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final f()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, v0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 6
    .line 7
    iget-object v1, v0, La/zlq;->x:Landroid/graphics/Matrix;

    .line 8
    .line 9
    iget-object v2, v0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    iget-byte v4, v0, La/zlq;->r:B

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    if-ne v4, v3, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eq v4, v5, :cond_1

    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :cond_1
    iget-object v3, v0, La/zlq;->m:Landroid/animation/Animator;

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/animation/Animator;->cancel()V

    .line 32
    .line 33
    .line 34
    :cond_2
    iget-object v3, v0, La/zlq;->n:La/zt40;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    move v5, v4

    .line 41
    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/high16 v6, 0x3f800000    # 1.0f

    .line 46
    .line 47
    if-eqz v3, :cond_9

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/view/View;->isInEditMode()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_9

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_7

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 63
    .line 64
    .line 65
    const v4, 0x3ecccccd    # 0.4f

    .line 66
    .line 67
    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    move v7, v4

    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move v7, v3

    .line 73
    :goto_2
    invoke-virtual {p0, v7}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleY(F)V

    .line 74
    .line 75
    .line 76
    if-eqz v5, :cond_5

    .line 77
    .line 78
    move v7, v4

    .line 79
    goto :goto_3

    .line 80
    :cond_5
    move v7, v3

    .line 81
    :goto_3
    invoke-virtual {p0, v7}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleX(F)V

    .line 82
    .line 83
    .line 84
    if-eqz v5, :cond_6

    .line 85
    .line 86
    move v3, v4

    .line 87
    :cond_6
    iput v3, v0, La/zlq;->p:F

    .line 88
    .line 89
    invoke-virtual {v0, v3, v1}, La/zlq;->a(FLandroid/graphics/Matrix;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 93
    .line 94
    .line 95
    :cond_7
    iget-object p0, v0, La/zlq;->n:La/zt40;

    .line 96
    .line 97
    if-eqz p0, :cond_8

    .line 98
    .line 99
    invoke-virtual {v0, p0, v6, v6, v6}, La/zlq;->b(La/zt40;FFF)Landroid/animation/AnimatorSet;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    goto :goto_4

    .line 104
    :cond_8
    sget v4, La/zlq;->z:I

    .line 105
    .line 106
    sget v5, La/zlq;->A:I

    .line 107
    .line 108
    const/high16 v1, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/high16 v2, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/high16 v3, 0x3f800000    # 1.0f

    .line 113
    .line 114
    invoke-virtual/range {v0 .. v5}, La/zlq;->c(FFFII)Landroid/animation/AnimatorSet;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    :goto_4
    new-instance v1, La/xh;

    .line 119
    .line 120
    const/4 v2, 0x7

    .line 121
    invoke-direct {v1, v0, v2}, La/xh;-><init>(Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_9
    invoke-virtual {p0, v4, v4}, La/puu0;->a(IZ)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v6}, Landroid/view/View;->setAlpha(F)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v6}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleY(F)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v6}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleX(F)V

    .line 141
    .line 142
    .line 143
    iput v6, v0, La/zlq;->p:F

    .line 144
    .line 145
    invoke-virtual {v0, v6, v1}, La/zlq;->a(FLandroid/graphics/Matrix;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    const-string p0, "com.google.android.material.floatingactionbutton.FloatingActionButton"

    .line 2
    .line 3
    return-object p0
.end method

.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBehavior()La/yke;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/yke;"
        }
    .end annotation

    .line 1
    new-instance p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getCompatElevation()F
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getCompatHoveredFocusedTranslationZ()F
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, La/zlq;->i:F

    .line 6
    .line 7
    return p0
.end method

.method public getCompatPressedTranslationZ()F
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p0, p0, La/zlq;->j:F

    .line 6
    .line 7
    return p0
.end method

.method public getContentBackground()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zlq;->e:Landroid/graphics/drawable/RippleDrawable;

    .line 6
    .line 7
    return-object p0
.end method

.method public getCustomSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public getExpandedComponentIdHint()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->o:La/u3u0;

    .line 2
    .line 3
    iget p0, p0, La/u3u0;->a:I

    .line 4
    .line 5
    return p0
.end method

.method public getHideMotionSpec()La/zt40;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zlq;->o:La/zt40;

    .line 6
    .line 7
    return-object p0
.end method

.method public getRippleColor()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public getRippleColorStateList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShapeAppearanceModel()La/akj0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zlq;->a:La/akj0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public getShowMotionSpec()La/zt40;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zlq;->n:La/zt40;

    .line 6
    .line 7
    return-object p0
.end method

.method public getSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public getSizeDimension()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->g:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->d:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUseCompatPadding()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->k:Z

    .line 2
    .line 3
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/zlq;->b:La/ylq;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 13
    .line 14
    invoke-static {p0, v0}, La/k7x;->V(Landroid/view/View;La/ki30;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->j:I

    .line 6
    .line 7
    sub-int v1, v0, v1

    .line 8
    .line 9
    div-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    iput v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->i:I

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, La/zlq;->h()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object p2, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->l:Landroid/graphics/Rect;

    .line 33
    .line 34
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    add-int/2addr v0, p1

    .line 37
    iget v1, p2, Landroid/graphics/Rect;->right:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 41
    .line 42
    add-int/2addr p1, v1

    .line 43
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 44
    .line 45
    add-int/2addr p1, p2

    .line 46
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/google/android/material/stateful/ExtendableSavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/google/android/material/stateful/ExtendableSavedState;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->a:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lcom/google/android/material/stateful/ExtendableSavedState;->c:La/nuj0;

    .line 17
    .line 18
    const-string v0, "expandableWidgetHelper"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->o:La/u3u0;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-string v0, "expanded"

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput-boolean v0, p0, La/u3u0;->b:Z

    .line 42
    .line 43
    const-string v0, "expandedComponentIdHint"

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, La/u3u0;->a:I

    .line 50
    .line 51
    iget-boolean p1, p0, La/u3u0;->b:Z

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    iget-object p0, p0, La/u3u0;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    instance-of v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 68
    .line 69
    invoke-virtual {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->f(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v1, Lcom/google/android/material/stateful/ExtendableSavedState;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lcom/google/android/material/stateful/ExtendableSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->o:La/u3u0;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v0, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "expanded"

    .line 28
    .line 29
    iget-boolean v3, p0, La/u3u0;->b:Z

    .line 30
    .line 31
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v2, "expandedComponentIdHint"

    .line 35
    .line 36
    iget p0, p0, La/u3u0;->a:I

    .line 37
    .line 38
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v1, Lcom/google/android/material/stateful/ExtendableSavedState;->c:La/nuj0;

    .line 42
    .line 43
    const-string v2, "expandableWidgetHelper"

    .line 44
    .line 45
    invoke-virtual {p0, v2, v0}, La/nuj0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-object v1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->m:Landroid/graphics/Rect;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v2, v3, v3, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 19
    .line 20
    .line 21
    iget v0, v2, Landroid/graphics/Rect;->left:I

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->l:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget v4, v1, Landroid/graphics/Rect;->left:I

    .line 26
    .line 27
    add-int/2addr v0, v4

    .line 28
    iput v0, v2, Landroid/graphics/Rect;->left:I

    .line 29
    .line 30
    iget v0, v2, Landroid/graphics/Rect;->top:I

    .line 31
    .line 32
    iget v4, v1, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    add-int/2addr v0, v4

    .line 35
    iput v0, v2, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    iget v0, v2, Landroid/graphics/Rect;->right:I

    .line 38
    .line 39
    iget v4, v1, Landroid/graphics/Rect;->right:I

    .line 40
    .line 41
    sub-int/2addr v0, v4

    .line 42
    iput v0, v2, Landroid/graphics/Rect;->right:I

    .line 43
    .line 44
    iget v0, v2, Landroid/graphics/Rect;->bottom:I

    .line 45
    .line 46
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 47
    .line 48
    sub-int/2addr v0, v1

    .line 49
    iput v0, v2, Landroid/graphics/Rect;->bottom:I

    .line 50
    .line 51
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->p:La/zlq;

    .line 52
    .line 53
    iget-boolean v1, v0, La/zlq;->f:Z

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    iget v1, v0, La/zlq;->k:I

    .line 58
    .line 59
    iget-object v0, v0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getSizeDimension()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    sub-int/2addr v1, v0

    .line 66
    div-int/lit8 v1, v1, 0x2

    .line 67
    .line 68
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v0, v3

    .line 74
    :goto_0
    neg-int v0, v0

    .line 75
    invoke-virtual {v2, v0, v0}, Landroid/graphics/Rect;->inset(II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    float-to-int v0, v0

    .line 83
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    float-to-int v1, v1

    .line 88
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_1

    .line 93
    .line 94
    return v3

    .line 95
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    return p0
.end method

.method public setBackgroundColor(I)V
    .locals 0

    .line 1
    const-string p0, "FloatingActionButton"

    .line 2
    .line 3
    const-string p1, "Setting a custom background is not supported."

    .line 4
    .line 5
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    const-string p0, "FloatingActionButton"

    .line 2
    .line 3
    const-string p1, "Setting a custom background is not supported."

    .line 4
    .line 5
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 0

    .line 1
    const-string p0, "FloatingActionButton"

    .line 2
    .line 3
    const-string p1, "Setting a custom background is not supported."

    .line 4
    .line 5
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object v0, p0, La/zlq;->b:La/ylq;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, La/ki30;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, La/zlq;->d:La/ym8;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v1, p0, La/ym8;->m:I

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, La/ym8;->m:I

    .line 35
    .line 36
    :cond_1
    iput-object p1, p0, La/ym8;->p:Landroid/content/res/ColorStateList;

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, La/ym8;->n:Z

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->c:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, La/zlq;->b:La/ylq;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/ki30;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setClickable(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 2
    .line 3
    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v0, 0x1a

    .line 7
    .line 8
    if-lt p1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    invoke-static {p0, p1}, La/c0g;->x(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public setCompatElevation(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget v0, p0, La/zlq;->h:F

    .line 6
    .line 7
    cmpl-float v0, v0, p1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput p1, p0, La/zlq;->h:F

    .line 12
    .line 13
    iget v0, p0, La/zlq;->i:F

    .line 14
    .line 15
    iget v1, p0, La/zlq;->j:F

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0, v1}, La/zlq;->e(FFF)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setCompatElevationResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatElevation(F)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setCompatHoveredFocusedTranslationZ(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget v0, p0, La/zlq;->i:F

    .line 6
    .line 7
    cmpl-float v0, v0, p1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput p1, p0, La/zlq;->i:F

    .line 12
    .line 13
    iget v0, p0, La/zlq;->h:F

    .line 14
    .line 15
    iget v1, p0, La/zlq;->j:F

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1, v1}, La/zlq;->e(FFF)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setCompatHoveredFocusedTranslationZResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatHoveredFocusedTranslationZ(F)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setCompatPressedTranslationZ(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget v0, p0, La/zlq;->j:F

    .line 6
    .line 7
    cmpl-float v0, v0, p1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput p1, p0, La/zlq;->j:F

    .line 12
    .line 13
    iget v0, p0, La/zlq;->h:F

    .line 14
    .line 15
    iget v1, p0, La/zlq;->i:F

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1, p1}, La/zlq;->e(FFF)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setCompatPressedTranslationZResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setCompatPressedTranslationZ(F)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v0, 0x1a

    .line 7
    .line 8
    if-lt p1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    invoke-static {p0, p1}, La/c0g;->x(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public setCustomSize(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->h:I

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->h:I

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    const-string p0, "Custom size must be non-negative"

    .line 14
    .line 15
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/zlq;->b:La/ylq;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/ki30;->r(F)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setEnsureMinTouchTargetSize(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/zlq;->f:Z

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-boolean p1, v0, La/zlq;->f:Z

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setExpandedComponentIdHint(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->o:La/u3u0;

    .line 2
    .line 3
    iput p1, p0, La/u3u0;->a:I

    .line 4
    .line 5
    return-void
.end method

.method public setHideMotionSpec(La/zt40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iput-object p1, p0, La/zlq;->o:La/zt40;

    .line 6
    .line 7
    return-void
.end method

.method public setHideMotionSpecResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, La/zt40;->b(ILandroid/content/Context;)La/zt40;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setHideMotionSpec(La/zt40;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget v0, p1, La/zlq;->p:F

    .line 15
    .line 16
    iput v0, p1, La/zlq;->p:F

    .line 17
    .line 18
    iget-object v1, p1, La/zlq;->x:Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, La/zlq;->a(FLandroid/graphics/Matrix;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->d:Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->n:La/zz2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/zz2;->G(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMaxImageSize(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget v0, p0, La/zlq;->q:I

    .line 8
    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    iput p1, p0, La/zlq;->q:I

    .line 12
    .line 13
    iget p1, p0, La/zlq;->p:F

    .line 14
    .line 15
    iput p1, p0, La/zlq;->p:F

    .line 16
    .line 17
    iget-object v0, p0, La/zlq;->x:Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, La/zlq;->a(FLandroid/graphics/Matrix;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, La/zlq;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public setRippleColor(I)V
    .locals 0

    .line 35
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setRippleColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->f:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    iget-object p1, p1, La/zlq;->c:Landroid/graphics/drawable/RippleDrawable;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, La/ocg0;->b(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-static {p0}, La/ocg0;->b(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public setScaleX(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setScaleY(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShadowPaddingEnabled(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iput-boolean p1, p0, La/zlq;->g:Z

    .line 6
    .line 7
    invoke-virtual {p0}, La/zlq;->h()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setShapeAppearanceModel(La/akj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La/zlq;->g(La/akj0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShowMotionSpec(La/zt40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iput-object p1, p0, La/zlq;->n:La/zt40;

    .line 6
    .line 7
    return-void
.end method

.method public setShowMotionSpecResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, La/zt40;->b(ILandroid/content/Context;)La/zt40;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setShowMotionSpec(La/zt40;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setSize(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->h:I

    .line 3
    .line 4
    iget v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->g:I

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->g:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->d:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->d:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setTranslationX(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/zlq;->f()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTranslationY(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/zlq;->f()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setTranslationZ(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setTranslationZ(F)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/zlq;->f()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setUseCompatPadding(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->k:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->k:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getImpl()La/zlq;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, La/zlq;->h()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/puu0;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
