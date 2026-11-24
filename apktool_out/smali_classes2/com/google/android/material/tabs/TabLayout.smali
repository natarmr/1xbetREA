.class public Lcom/google/android/material/tabs/TabLayout;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# static fields
.field public static final z1:La/bwa0;


# instance fields
.field public final A:I

.field public B:I

.field public a:I

.field public final b:Ljava/util/ArrayList;

.field public c:La/tbo0;

.field public final d:La/sbo0;

.field public final e:I

.field public final f:I

.field public f1:I

.field public final g:I

.field public g1:Z

.field public final h:I

.field public h1:Z

.field public final i:I

.field public i1:I

.field public final j:I

.field public j1:I

.field public final k:I

.field public k1:Z

.field public l:Landroid/content/res/ColorStateList;

.field public l1:La/g9m0;

.field public m:Landroid/content/res/ColorStateList;

.field public final m1:Landroid/animation/TimeInterpolator;

.field public n:Landroid/content/res/ColorStateList;

.field public n1:La/pbo0;

.field public o:Landroid/graphics/drawable/Drawable;

.field public final o1:Ljava/util/ArrayList;

.field public p:I

.field public p1:La/wbo0;

.field public final q:F

.field public q1:Landroid/animation/ValueAnimator;

.field public final r:F

.field public r1:Landroidx/viewpager/widget/ViewPager;

.field public final s:F

.field public s1:La/pj80;

.field public final t:I

.field public t1:La/bwf;

.field public u:I

.field public u1:La/ubo0;

.field public final v:I

.field public v1:La/obo0;

.field public final w:I

.field public w1:Z

.field public final x:I

.field public x1:I

.field public final y:I

.field public final y1:La/awa0;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/bwa0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/bwa0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/material/tabs/TabLayout;->z1:La/bwa0;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 554
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/tabs/TabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 12

    .line 1
    const v0, 0x7f140889

    .line 2
    .line 3
    .line 4
    const v4, 0x7f0408dc

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2, v4, v0}, La/dwi0;->V(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1, p2, v4}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->a:I

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->k:I

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput v0, p0, Lcom/google/android/material/tabs/TabLayout;->p:I

    .line 28
    .line 29
    const v1, 0x7fffffff

    .line 30
    .line 31
    .line 32
    iput v1, p0, Lcom/google/android/material/tabs/TabLayout;->u:I

    .line 33
    .line 34
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->i1:I

    .line 35
    .line 36
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->o1:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v1, La/awa0;

    .line 44
    .line 45
    const/16 v7, 0xc

    .line 46
    .line 47
    invoke-direct {v1, v7}, La/awa0;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->y1:La/awa0;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p0, v0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 57
    .line 58
    .line 59
    new-instance v8, La/sbo0;

    .line 60
    .line 61
    invoke-direct {v8, p0, v1}, La/sbo0;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    iput-object v8, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 65
    .line 66
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 67
    .line 68
    const/4 v3, -0x2

    .line 69
    invoke-direct {v2, v3, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 70
    .line 71
    .line 72
    invoke-super {p0, v8, v0, v2}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 73
    .line 74
    .line 75
    const/16 v9, 0x19

    .line 76
    .line 77
    filled-new-array {v9}, [I

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    sget-object v3, La/rpd0;->U:[I

    .line 82
    .line 83
    const v5, 0x7f140889

    .line 84
    .line 85
    .line 86
    move-object v2, p2

    .line 87
    invoke-static/range {v1 .. v6}, La/mrv;->l0(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {v2}, La/plc;->F(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-eqz v2, :cond_0

    .line 100
    .line 101
    new-instance v3, La/ki30;

    .line 102
    .line 103
    invoke-direct {v3}, La/ki30;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v2}, La/ki30;->s(Landroid/content/res/ColorStateList;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v1}, La/ki30;->o(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    invoke-virtual {v3, v2}, La/ki30;->r(F)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 120
    .line 121
    .line 122
    :cond_0
    const/4 v2, 0x6

    .line 123
    invoke-static {v2, v1, p2}, La/g7x;->D(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/graphics/drawable/Drawable;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {p0, v2}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 128
    .line 129
    .line 130
    const/16 v2, 0x9

    .line 131
    .line 132
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-virtual {p0, v2}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicatorColor(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2, v7, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {v8, v2}, La/sbo0;->b(I)V

    .line 144
    .line 145
    .line 146
    const/16 v2, 0xb

    .line 147
    .line 148
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {p0, v2}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicatorGravity(I)V

    .line 153
    .line 154
    .line 155
    const/16 v2, 0x8

    .line 156
    .line 157
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-virtual {p0, v2}, Lcom/google/android/material/tabs/TabLayout;->setTabIndicatorAnimationMode(I)V

    .line 162
    .line 163
    .line 164
    const/16 v2, 0xa

    .line 165
    .line 166
    const/4 v3, 0x1

    .line 167
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    invoke-virtual {p0, v2}, Lcom/google/android/material/tabs/TabLayout;->setTabIndicatorFullWidth(Z)V

    .line 172
    .line 173
    .line 174
    const/16 v2, 0x11

    .line 175
    .line 176
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->h:I

    .line 181
    .line 182
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->g:I

    .line 183
    .line 184
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->f:I

    .line 185
    .line 186
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->e:I

    .line 187
    .line 188
    const/16 v4, 0x14

    .line 189
    .line 190
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    iput v4, p0, Lcom/google/android/material/tabs/TabLayout;->e:I

    .line 195
    .line 196
    const/16 v4, 0x15

    .line 197
    .line 198
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    iput v4, p0, Lcom/google/android/material/tabs/TabLayout;->f:I

    .line 203
    .line 204
    const/16 v4, 0x13

    .line 205
    .line 206
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    iput v4, p0, Lcom/google/android/material/tabs/TabLayout;->g:I

    .line 211
    .line 212
    const/16 v4, 0x12

    .line 213
    .line 214
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->h:I

    .line 219
    .line 220
    const v2, 0x7f040492

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-static {v4, v2, v0}, La/n6x;->S(Landroid/content/res/Resources$Theme;IZ)Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-eqz v2, :cond_1

    .line 232
    .line 233
    const v2, 0x7f040953

    .line 234
    .line 235
    .line 236
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->i:I

    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_1
    const v2, 0x7f040903

    .line 240
    .line 241
    .line 242
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->i:I

    .line 243
    .line 244
    :goto_0
    const v2, 0x7f1403de

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->j:I

    .line 252
    .line 253
    sget-object v4, La/mqd0;->x:[I

    .line 254
    .line 255
    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    :try_start_0
    invoke-virtual {v5, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    int-to-float v6, v6

    .line 264
    iput v6, p0, Lcom/google/android/material/tabs/TabLayout;->q:F

    .line 265
    .line 266
    const/4 v7, 0x3

    .line 267
    invoke-static {v7, v1, v5}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    iput-object v8, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 272
    .line 273
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 274
    .line 275
    .line 276
    const/16 v5, 0x17

    .line 277
    .line 278
    invoke-virtual {p2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    if-eqz v8, :cond_2

    .line 283
    .line 284
    invoke-virtual {p2, v5, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->k:I

    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_2
    move v2, p1

    .line 292
    :goto_1
    const/4 v5, 0x2

    .line 293
    sget-object v8, Landroid/widget/HorizontalScrollView;->EMPTY_STATE_SET:[I

    .line 294
    .line 295
    sget-object v9, Landroid/widget/HorizontalScrollView;->SELECTED_STATE_SET:[I

    .line 296
    .line 297
    if-eq v2, p1, :cond_4

    .line 298
    .line 299
    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    float-to-int v4, v6

    .line 304
    :try_start_1
    invoke-virtual {v2, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    int-to-float v4, v4

    .line 309
    iput v4, p0, Lcom/google/android/material/tabs/TabLayout;->r:F

    .line 310
    .line 311
    invoke-static {v7, v1, v2}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    if-eqz v4, :cond_3

    .line 316
    .line 317
    iget-object v6, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;

    .line 318
    .line 319
    invoke-virtual {v6}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    const v10, 0x10100a1

    .line 324
    .line 325
    .line 326
    filled-new-array {v10}, [I

    .line 327
    .line 328
    .line 329
    move-result-object v10

    .line 330
    invoke-virtual {v4}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 331
    .line 332
    .line 333
    move-result v11

    .line 334
    invoke-virtual {v4, v10, v11}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    new-array v10, v5, [[I

    .line 339
    .line 340
    new-array v11, v5, [I

    .line 341
    .line 342
    aput-object v9, v10, v0

    .line 343
    .line 344
    aput v4, v11, v0

    .line 345
    .line 346
    aput-object v8, v10, v3

    .line 347
    .line 348
    aput v6, v11, v3

    .line 349
    .line 350
    new-instance v4, Landroid/content/res/ColorStateList;

    .line 351
    .line 352
    invoke-direct {v4, v10, v11}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 353
    .line 354
    .line 355
    iput-object v4, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 356
    .line 357
    goto :goto_2

    .line 358
    :catchall_0
    move-exception v0

    .line 359
    move-object p0, v0

    .line 360
    goto :goto_3

    .line 361
    :cond_3
    :goto_2
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 362
    .line 363
    .line 364
    goto :goto_4

    .line 365
    :goto_3
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 366
    .line 367
    .line 368
    throw p0

    .line 369
    :cond_4
    :goto_4
    const/16 v2, 0x1a

    .line 370
    .line 371
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-eqz v4, :cond_5

    .line 376
    .line 377
    invoke-static {v2, v1, p2}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;

    .line 382
    .line 383
    :cond_5
    const/16 v2, 0x18

    .line 384
    .line 385
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-eqz v4, :cond_6

    .line 390
    .line 391
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    iget-object v4, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;

    .line 396
    .line 397
    invoke-virtual {v4}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    filled-new-array {v9, v8}, [[I

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    filled-new-array {v2, v4}, [I

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    new-instance v4, Landroid/content/res/ColorStateList;

    .line 410
    .line 411
    invoke-direct {v4, v6, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 412
    .line 413
    .line 414
    iput-object v4, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;

    .line 415
    .line 416
    :cond_6
    const/4 v2, 0x4

    .line 417
    invoke-static {v2, v1, p2}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->m:Landroid/content/res/ColorStateList;

    .line 422
    .line 423
    const/4 v2, 0x5

    .line 424
    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    const/4 v4, 0x0

    .line 429
    invoke-static {v2, v4}, La/afn0;->y(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 430
    .line 431
    .line 432
    const/16 v2, 0x16

    .line 433
    .line 434
    invoke-static {v2, v1, p2}, La/g7x;->A(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->n:Landroid/content/res/ColorStateList;

    .line 439
    .line 440
    const/4 v2, 0x7

    .line 441
    const/16 v4, 0x12c

    .line 442
    .line 443
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    iput v2, p0, Lcom/google/android/material/tabs/TabLayout;->A:I

    .line 448
    .line 449
    const v2, 0x7f040632

    .line 450
    .line 451
    .line 452
    sget-object v4, La/n73;->b:La/f0p;

    .line 453
    .line 454
    invoke-static {v1, v2, v4}, La/g7x;->W(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    iput-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->m1:Landroid/animation/TimeInterpolator;

    .line 459
    .line 460
    const/16 v1, 0xf

    .line 461
    .line 462
    invoke-virtual {p2, v1, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    iput v1, p0, Lcom/google/android/material/tabs/TabLayout;->v:I

    .line 467
    .line 468
    const/16 v1, 0xe

    .line 469
    .line 470
    invoke-virtual {p2, v1, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 471
    .line 472
    .line 473
    move-result p1

    .line 474
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->w:I

    .line 475
    .line 476
    invoke-virtual {p2, v3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 477
    .line 478
    .line 479
    move-result p1

    .line 480
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->t:I

    .line 481
    .line 482
    invoke-virtual {p2, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 483
    .line 484
    .line 485
    move-result p1

    .line 486
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->y:I

    .line 487
    .line 488
    const/16 p1, 0x10

    .line 489
    .line 490
    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 491
    .line 492
    .line 493
    move-result p1

    .line 494
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 495
    .line 496
    invoke-virtual {p2, v7, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 497
    .line 498
    .line 499
    move-result p1

    .line 500
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->z:I

    .line 501
    .line 502
    const/16 p1, 0xd

    .line 503
    .line 504
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 505
    .line 506
    .line 507
    move-result p1

    .line 508
    iput-boolean p1, p0, Lcom/google/android/material/tabs/TabLayout;->g1:Z

    .line 509
    .line 510
    const/16 p1, 0x1b

    .line 511
    .line 512
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 513
    .line 514
    .line 515
    move-result p1

    .line 516
    iput-boolean p1, p0, Lcom/google/android/material/tabs/TabLayout;->k1:Z

    .line 517
    .line 518
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 519
    .line 520
    .line 521
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    const p2, 0x7f07011f

    .line 526
    .line 527
    .line 528
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 529
    .line 530
    .line 531
    move-result p2

    .line 532
    int-to-float p2, p2

    .line 533
    iput p2, p0, Lcom/google/android/material/tabs/TabLayout;->s:F

    .line 534
    .line 535
    const p2, 0x7f07011d

    .line 536
    .line 537
    .line 538
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 539
    .line 540
    .line 541
    move-result p1

    .line 542
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->x:I

    .line 543
    .line 544
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->c()V

    .line 545
    .line 546
    .line 547
    return-void

    .line 548
    :catchall_1
    move-exception v0

    .line 549
    move-object p0, v0

    .line 550
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 551
    .line 552
    .line 553
    throw p0
.end method

.method private getDefaultHeight()I
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, La/tbo0;

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 p0, 0x30

    .line 20
    .line 21
    return p0
.end method

.method private getTabMinWidth()I
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iget v1, p0, Lcom/google/android/material/tabs/TabLayout;->v:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_2
    :goto_0
    iget p0, p0, Lcom/google/android/material/tabs/TabLayout;->x:I

    .line 18
    .line 19
    return p0
.end method

.method private getTabScrollRange()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    sub-int/2addr v0, v1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr v0, v1

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    sub-int/2addr v0, p0

    .line 22
    const/4 p0, 0x0

    .line 23
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method private setSelectedTabView(I)V
    .locals 6

    .line 1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_8

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, v0, :cond_8

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x1

    .line 18
    if-ne v2, p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/view/View;->isSelected()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    :cond_0
    if-eq v2, p1, :cond_4

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/view/View;->isSelected()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_4

    .line 33
    .line 34
    :cond_1
    if-ne v2, p1, :cond_2

    .line 35
    .line 36
    move v5, v4

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v5, v1

    .line 39
    :goto_1
    invoke-virtual {v3, v5}, Landroid/view/View;->setSelected(Z)V

    .line 40
    .line 41
    .line 42
    if-ne v2, p1, :cond_3

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    move v4, v1

    .line 46
    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setActivated(Z)V

    .line 47
    .line 48
    .line 49
    instance-of v4, v3, La/vbo0;

    .line 50
    .line 51
    if-eqz v4, :cond_7

    .line 52
    .line 53
    check-cast v3, La/vbo0;

    .line 54
    .line 55
    invoke-virtual {v3}, La/vbo0;->h()V

    .line 56
    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_4
    if-ne v2, p1, :cond_5

    .line 60
    .line 61
    move v5, v4

    .line 62
    goto :goto_3

    .line 63
    :cond_5
    move v5, v1

    .line 64
    :goto_3
    invoke-virtual {v3, v5}, Landroid/view/View;->setSelected(Z)V

    .line 65
    .line 66
    .line 67
    if-ne v2, p1, :cond_6

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    move v4, v1

    .line 71
    :goto_4
    invoke-virtual {v3, v4}, Landroid/view/View;->setActivated(Z)V

    .line 72
    .line 73
    .line 74
    :cond_7
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_8
    return-void
.end method


# virtual methods
.method public a(La/tbo0;IZ)V
    .locals 7

    .line 1
    iget-object v0, p1, La/tbo0;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 2
    .line 3
    if-ne v0, p0, :cond_5

    .line 4
    .line 5
    iput p2, p1, La/tbo0;->b:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    add-int/2addr p2, v2

    .line 18
    const/4 v3, -0x1

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge p2, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, La/tbo0;

    .line 27
    .line 28
    iget v5, v5, La/tbo0;->b:I

    .line 29
    .line 30
    iget v6, p0, Lcom/google/android/material/tabs/TabLayout;->a:I

    .line 31
    .line 32
    if-ne v5, v6, :cond_0

    .line 33
    .line 34
    move v4, p2

    .line 35
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, La/tbo0;

    .line 40
    .line 41
    iput p2, v5, La/tbo0;->b:I

    .line 42
    .line 43
    add-int/lit8 p2, p2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iput v4, p0, Lcom/google/android/material/tabs/TabLayout;->a:I

    .line 47
    .line 48
    iget-object p2, p1, La/tbo0;->e:La/vbo0;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-virtual {p2, v0}, La/vbo0;->setSelected(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v0}, Landroid/view/View;->setActivated(Z)V

    .line 55
    .line 56
    .line 57
    iget v1, p1, La/tbo0;->b:I

    .line 58
    .line 59
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 60
    .line 61
    const/4 v5, -0x2

    .line 62
    invoke-direct {v4, v5, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 63
    .line 64
    .line 65
    iget v3, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 66
    .line 67
    if-ne v3, v2, :cond_2

    .line 68
    .line 69
    iget v3, p0, Lcom/google/android/material/tabs/TabLayout;->z:I

    .line 70
    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 74
    .line 75
    const/high16 v0, 0x3f800000    # 1.0f

    .line 76
    .line 77
    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 84
    .line 85
    :goto_1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 86
    .line 87
    invoke-virtual {p0, p2, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 88
    .line 89
    .line 90
    if-eqz p3, :cond_4

    .line 91
    .line 92
    iget-object p0, p1, La/tbo0;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 93
    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0, p1, v2}, Lcom/google/android/material/tabs/TabLayout;->j(La/tbo0;Z)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    const-string p0, "Tab not attached to a TabLayout"

    .line 101
    .line 102
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    return-void

    .line 106
    :cond_5
    const-string p0, "Tab belongs to a different TabLayout."

    .line 107
    .line 108
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    const-string p1, "Only TabItem instances can be added to TabLayout"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 0

    .line 9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Only TabItem instances can be added to TabLayout"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 10
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Only TabItem instances can be added to TabLayout"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Only TabItem instances can be added to TabLayout"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final b(I)V
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-ge v2, v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-gtz v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-virtual {p0, v2, p1}, Lcom/google/android/material/tabs/TabLayout;->d(FI)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eq v1, v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->e()V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 55
    .line 56
    filled-new-array {v1, v2}, [I

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v3, v1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object v1, v0, La/sbo0;->a:Landroid/animation/ValueAnimator;

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    iget-object v1, v0, La/sbo0;->b:Lcom/google/android/material/tabs/TabLayout;

    .line 79
    .line 80
    iget v1, v1, Lcom/google/android/material/tabs/TabLayout;->a:I

    .line 81
    .line 82
    if-eq v1, p1, :cond_4

    .line 83
    .line 84
    iget-object v1, v0, La/sbo0;->a:Landroid/animation/ValueAnimator;

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 87
    .line 88
    .line 89
    :cond_4
    iget p0, p0, Lcom/google/android/material/tabs/TabLayout;->A:I

    .line 90
    .line 91
    const/4 v1, 0x1

    .line 92
    invoke-virtual {v0, p1, p0, v1}, La/sbo0;->d(IIZ)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_5
    :goto_1
    const/4 v6, 0x1

    .line 97
    const/4 v7, 0x1

    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x1

    .line 100
    move-object v2, p0

    .line 101
    move v3, p1

    .line 102
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/material/tabs/TabLayout;->l(IFZZZ)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->y:I

    .line 13
    .line 14
    iget v3, p0, Lcom/google/android/material/tabs/TabLayout;->e:I

    .line 15
    .line 16
    sub-int/2addr v0, v3

    .line 17
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_1
    iget-object v3, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 22
    .line 23
    invoke-virtual {v3, v0, v2, v2, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 24
    .line 25
    .line 26
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 27
    .line 28
    const-string v2, "TabLayout"

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    if-eq v0, v4, :cond_2

    .line 34
    .line 35
    if-eq v0, v1, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->z:I

    .line 39
    .line 40
    if-ne v0, v1, :cond_3

    .line 41
    .line 42
    const-string v0, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"

    .line 43
    .line 44
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->z:I

    .line 52
    .line 53
    if-eqz v0, :cond_6

    .line 54
    .line 55
    if-eq v0, v4, :cond_5

    .line 56
    .line 57
    if-eq v0, v1, :cond_7

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_5
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_6
    const-string v0, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"

    .line 65
    .line 66
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    :cond_7
    const v0, 0x800003

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 73
    .line 74
    .line 75
    :goto_2
    invoke-virtual {p0, v4}, Lcom/google/android/material/tabs/TabLayout;->n(Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final d(FI)I
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return v1

    .line 11
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ge p2, v4, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    goto :goto_1

    .line 33
    :cond_3
    const/4 p2, 0x0

    .line 34
    :goto_1
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz p2, :cond_4

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    div-int/lit8 v3, v0, 0x2

    .line 49
    .line 50
    add-int/2addr v3, p2

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    div-int/2addr p2, v2

    .line 56
    sub-int/2addr v3, p2

    .line 57
    add-int/2addr v0, v1

    .line 58
    int-to-float p2, v0

    .line 59
    const/high16 v0, 0x3f000000    # 0.5f

    .line 60
    .line 61
    mul-float/2addr p2, v0

    .line 62
    mul-float/2addr p2, p1

    .line 63
    float-to-int p1, p2

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_5

    .line 69
    .line 70
    add-int/2addr v3, p1

    .line 71
    return v3

    .line 72
    :cond_5
    sub-int/2addr v3, p1

    .line 73
    return v3
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/animation/ValueAnimator;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->m1:Landroid/animation/TimeInterpolator;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    iget v1, p0, Lcom/google/android/material/tabs/TabLayout;->A:I

    .line 20
    .line 21
    int-to-long v1, v1

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    new-instance v1, La/mo8;

    .line 28
    .line 29
    const/4 v2, 0x5

    .line 30
    invoke-direct {v1, p0, v2}, La/mo8;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final f(I)La/tbo0;
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/tbo0;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final g()La/tbo0;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/material/tabs/TabLayout;->z1:La/bwa0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/bwa0;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/tbo0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, La/tbo0;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    iput v1, v0, La/tbo0;->b:I

    .line 18
    .line 19
    :cond_0
    iput-object p0, v0, La/tbo0;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->y1:La/awa0;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2}, La/awa0;->a()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, La/vbo0;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v2, v1

    .line 34
    :goto_0
    if-nez v2, :cond_2

    .line 35
    .line 36
    new-instance v2, La/vbo0;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {v2, p0, v3}, La/vbo0;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v2, v0}, La/vbo0;->setTab(La/tbo0;)V

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabMinWidth()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-virtual {v2, p0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    iget-object p0, v0, La/tbo0;->a:Ljava/lang/CharSequence;

    .line 66
    .line 67
    invoke-virtual {v2, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v2, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    iput-object v2, v0, La/tbo0;->e:La/vbo0;

    .line 75
    .line 76
    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->generateDefaultLayoutParams()Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/FrameLayout$LayoutParams;
    .locals 0

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->generateDefaultLayoutParams()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object p0

    return-object p0
.end method

.method public getSelectedTabPosition()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->c:La/tbo0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget p0, p0, La/tbo0;->b:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, -0x1

    .line 9
    return p0
.end method

.method public getTabCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getTabGravity()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/tabs/TabLayout;->z:I

    .line 2
    .line 3
    return p0
.end method

.method public getTabIconTint()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->m:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTabIndicatorAnimationMode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/tabs/TabLayout;->j1:I

    .line 2
    .line 3
    return p0
.end method

.method public getTabIndicatorGravity()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/tabs/TabLayout;->B:I

    .line 2
    .line 3
    return p0
.end method

.method public getTabMaxWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/tabs/TabLayout;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public getTabMode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 2
    .line 3
    return p0
.end method

.method public getTabRippleColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->n:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTabSelectedIndicator()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTabTextColors()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->i()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->s1:La/pj80;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {v0}, La/pj80;->c()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->g()La/tbo0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, p0, Lcom/google/android/material/tabs/TabLayout;->s1:La/pj80;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    iget-object v5, v3, La/tbo0;->e:La/vbo0;

    .line 39
    .line 40
    invoke-virtual {v5, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iput-object v4, v3, La/tbo0;->a:Ljava/lang/CharSequence;

    .line 44
    .line 45
    iget-object v4, v3, La/tbo0;->e:La/vbo0;

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, La/vbo0;->f()V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v4, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {p0, v3, v4, v1}, Lcom/google/android/material/tabs/TabLayout;->a(La/tbo0;IZ)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->r1:Landroidx/viewpager/widget/ViewPager;

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    if-lez v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {v1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eq v0, v1, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-ge v0, v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lcom/google/android/material/tabs/TabLayout;->f(I)La/tbo0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const/4 v1, 0x1

    .line 91
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/tabs/TabLayout;->j(La/tbo0;Z)V

    .line 92
    .line 93
    .line 94
    :cond_3
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    const/4 v2, 0x0

    .line 10
    if-ltz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, La/vbo0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 19
    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, v2}, La/vbo0;->setTab(La/tbo0;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v3, v2}, La/vbo0;->setSelected(Z)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->y1:La/awa0;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, La/awa0;->c(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, La/tbo0;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 60
    .line 61
    .line 62
    iput-object v2, v1, La/tbo0;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 63
    .line 64
    iput-object v2, v1, La/tbo0;->e:La/vbo0;

    .line 65
    .line 66
    iput-object v2, v1, La/tbo0;->a:Ljava/lang/CharSequence;

    .line 67
    .line 68
    const/4 v3, -0x1

    .line 69
    iput v3, v1, La/tbo0;->b:I

    .line 70
    .line 71
    iput-object v2, v1, La/tbo0;->c:Landroid/view/View;

    .line 72
    .line 73
    sget-object v3, Lcom/google/android/material/tabs/TabLayout;->z1:La/bwa0;

    .line 74
    .line 75
    invoke-virtual {v3, v1}, La/bwa0;->c(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->c:La/tbo0;

    .line 80
    .line 81
    return-void
.end method

.method public final j(La/tbo0;Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->c:La/tbo0;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->o1:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-ne v0, p1, :cond_1

    .line 6
    .line 7
    if-eqz v0, :cond_8

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    add-int/lit8 p2, p2, -0x1

    .line 14
    .line 15
    :goto_0
    if-ltz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/pbo0;

    .line 22
    .line 23
    invoke-interface {v0, p1}, La/pbo0;->b(La/tbo0;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 p2, p2, -0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget p1, p1, La/tbo0;->b:I

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->b(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const/4 v2, -0x1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    iget v3, p1, La/tbo0;->b:I

    .line 39
    .line 40
    move v5, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v5, v2

    .line 43
    :goto_1
    if-eqz p2, :cond_5

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    iget p2, v0, La/tbo0;->b:I

    .line 48
    .line 49
    if-ne p2, v2, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    move-object v4, p0

    .line 53
    goto :goto_3

    .line 54
    :cond_4
    :goto_2
    if-eq v5, v2, :cond_3

    .line 55
    .line 56
    const/4 v8, 0x1

    .line 57
    const/4 v9, 0x1

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x1

    .line 60
    move-object v4, p0

    .line 61
    invoke-virtual/range {v4 .. v9}, Lcom/google/android/material/tabs/TabLayout;->l(IFZZZ)V

    .line 62
    .line 63
    .line 64
    goto :goto_4

    .line 65
    :goto_3
    invoke-virtual {v4, v5}, Lcom/google/android/material/tabs/TabLayout;->b(I)V

    .line 66
    .line 67
    .line 68
    :goto_4
    if-eq v5, v2, :cond_6

    .line 69
    .line 70
    invoke-direct {v4, v5}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabView(I)V

    .line 71
    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_5
    move-object v4, p0

    .line 75
    :cond_6
    :goto_5
    iput-object p1, v4, Lcom/google/android/material/tabs/TabLayout;->c:La/tbo0;

    .line 76
    .line 77
    if-eqz v0, :cond_7

    .line 78
    .line 79
    iget-object p0, v0, La/tbo0;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 80
    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    add-int/lit8 p0, p0, -0x1

    .line 88
    .line 89
    :goto_6
    if-ltz p0, :cond_7

    .line 90
    .line 91
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, La/pbo0;

    .line 96
    .line 97
    invoke-interface {p2, v0}, La/pbo0;->a(La/tbo0;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 p0, p0, -0x1

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_7
    if-eqz p1, :cond_8

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    add-int/lit8 p0, p0, -0x1

    .line 110
    .line 111
    :goto_7
    if-ltz p0, :cond_8

    .line 112
    .line 113
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    check-cast p2, La/pbo0;

    .line 118
    .line 119
    invoke-interface {p2, p1}, La/pbo0;->c(La/tbo0;)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 p0, p0, -0x1

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_8
    return-void
.end method

.method public final k(La/pj80;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->s1:La/pj80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->t1:La/bwf;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, La/pj80;->a:Landroid/database/DataSetObservable;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->s1:La/pj80;

    .line 15
    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-object p2, p0, Lcom/google/android/material/tabs/TabLayout;->t1:La/bwf;

    .line 21
    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    new-instance p2, La/bwf;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-direct {p2, p0, v0}, La/bwf;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lcom/google/android/material/tabs/TabLayout;->t1:La/bwf;

    .line 31
    .line 32
    :cond_1
    iget-object p1, p1, La/pj80;->a:Landroid/database/DataSetObservable;

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->h()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final l(IFZZZ)V
    .locals 5

    .line 1
    int-to-float v0, p1

    .line 2
    add-float/2addr v0, p2

    .line 3
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ltz v1, :cond_10

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-lt v1, v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    if-eqz p4, :cond_2

    .line 20
    .line 21
    iget-object p4, v2, La/sbo0;->b:Lcom/google/android/material/tabs/TabLayout;

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p4, Lcom/google/android/material/tabs/TabLayout;->a:I

    .line 28
    .line 29
    iget-object p4, v2, La/sbo0;->a:Landroid/animation/ValueAnimator;

    .line 30
    .line 31
    if-eqz p4, :cond_1

    .line 32
    .line 33
    invoke-virtual {p4}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    if-eqz p4, :cond_1

    .line 38
    .line 39
    iget-object p4, v2, La/sbo0;->a:Landroid/animation/ValueAnimator;

    .line 40
    .line 41
    invoke-virtual {p4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    add-int/lit8 v0, p1, 0x1

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v2, p4, v0, p2}, La/sbo0;->c(Landroid/view/View;Landroid/view/View;F)V

    .line 55
    .line 56
    .line 57
    :cond_2
    iget-object p4, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 58
    .line 59
    if-eqz p4, :cond_3

    .line 60
    .line 61
    invoke-virtual {p4}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-eqz p4, :cond_3

    .line 66
    .line 67
    iget-object p4, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 68
    .line 69
    invoke-virtual {p4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {p0, p2, p1}, Lcom/google/android/material/tabs/TabLayout;->d(FI)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const/4 v2, 0x0

    .line 85
    const/4 v3, 0x1

    .line 86
    if-ge p1, v0, :cond_4

    .line 87
    .line 88
    if-ge p2, p4, :cond_6

    .line 89
    .line 90
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-le p1, v0, :cond_5

    .line 95
    .line 96
    if-le p2, p4, :cond_6

    .line 97
    .line 98
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-ne p1, v0, :cond_7

    .line 103
    .line 104
    :cond_6
    move v0, v3

    .line 105
    goto :goto_0

    .line 106
    :cond_7
    move v0, v2

    .line 107
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-ne v4, v3, :cond_c

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-ge p1, v0, :cond_8

    .line 118
    .line 119
    if-le p2, p4, :cond_a

    .line 120
    .line 121
    :cond_8
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-le p1, v0, :cond_9

    .line 126
    .line 127
    if-ge p2, p4, :cond_a

    .line 128
    .line 129
    :cond_9
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 130
    .line 131
    .line 132
    move-result p4

    .line 133
    if-ne p1, p4, :cond_b

    .line 134
    .line 135
    :cond_a
    move v0, v3

    .line 136
    goto :goto_1

    .line 137
    :cond_b
    move v0, v2

    .line 138
    :cond_c
    :goto_1
    if-nez v0, :cond_d

    .line 139
    .line 140
    iget p4, p0, Lcom/google/android/material/tabs/TabLayout;->x1:I

    .line 141
    .line 142
    if-eq p4, v3, :cond_d

    .line 143
    .line 144
    if-eqz p5, :cond_f

    .line 145
    .line 146
    :cond_d
    if-gez p1, :cond_e

    .line 147
    .line 148
    move p2, v2

    .line 149
    :cond_e
    invoke-virtual {p0, p2, v2}, Landroid/view/View;->scrollTo(II)V

    .line 150
    .line 151
    .line 152
    :cond_f
    if-eqz p3, :cond_10

    .line 153
    .line 154
    invoke-direct {p0, v1}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabView(I)V

    .line 155
    .line 156
    .line 157
    :cond_10
    :goto_2
    return-void
.end method

.method public final m(Landroidx/viewpager/widget/ViewPager;Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->r1:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->u1:La/ubo0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/viewpager/widget/ViewPager;->u1:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->v1:La/obo0;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->r1:Landroidx/viewpager/widget/ViewPager;

    .line 21
    .line 22
    iget-object v1, v1, Landroidx/viewpager/widget/ViewPager;->w1:Ljava/util/ArrayList;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->p1:La/wbo0;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->o1:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->p1:La/wbo0;

    .line 40
    .line 41
    :cond_2
    const/4 v0, 0x0

    .line 42
    if-eqz p1, :cond_9

    .line 43
    .line 44
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->r1:Landroidx/viewpager/widget/ViewPager;

    .line 45
    .line 46
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->u1:La/ubo0;

    .line 47
    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    new-instance v2, La/ubo0;

    .line 51
    .line 52
    invoke-direct {v2, p0}, La/ubo0;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->u1:La/ubo0;

    .line 56
    .line 57
    :cond_3
    iput v0, v2, La/ubo0;->c:I

    .line 58
    .line 59
    iput v0, v2, La/ubo0;->b:I

    .line 60
    .line 61
    iget-object v3, p1, Landroidx/viewpager/widget/ViewPager;->u1:Ljava/util/ArrayList;

    .line 62
    .line 63
    if-nez v3, :cond_4

    .line 64
    .line 65
    new-instance v3, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v3, p1, Landroidx/viewpager/widget/ViewPager;->u1:Ljava/util/ArrayList;

    .line 71
    .line 72
    :cond_4
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    new-instance v2, La/wbo0;

    .line 76
    .line 77
    invoke-direct {v2, p1, v0}, La/wbo0;-><init>(Landroid/view/ViewGroup;B)V

    .line 78
    .line 79
    .line 80
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->p1:La/wbo0;

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_5
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()La/pj80;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const/4 v1, 0x1

    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/tabs/TabLayout;->k(La/pj80;Z)V

    .line 99
    .line 100
    .line 101
    :cond_6
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->v1:La/obo0;

    .line 102
    .line 103
    if-nez v0, :cond_7

    .line 104
    .line 105
    new-instance v0, La/obo0;

    .line 106
    .line 107
    invoke-direct {v0, p0}, La/obo0;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->v1:La/obo0;

    .line 111
    .line 112
    :cond_7
    iput-boolean v1, v0, La/obo0;->a:Z

    .line 113
    .line 114
    iget-object v1, p1, Landroidx/viewpager/widget/ViewPager;->w1:Ljava/util/ArrayList;

    .line 115
    .line 116
    if-nez v1, :cond_8

    .line 117
    .line 118
    new-instance v1, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v1, p1, Landroidx/viewpager/widget/ViewPager;->w1:Ljava/util/ArrayList;

    .line 124
    .line 125
    :cond_8
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    const/4 v6, 0x1

    .line 133
    const/4 v7, 0x1

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x1

    .line 136
    move-object v2, p0

    .line 137
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/material/tabs/TabLayout;->l(IFZZZ)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_9
    iput-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->r1:Landroidx/viewpager/widget/ViewPager;

    .line 142
    .line 143
    invoke-virtual {p0, v2, v0}, Lcom/google/android/material/tabs/TabLayout;->k(La/pj80;Z)V

    .line 144
    .line 145
    .line 146
    :goto_0
    iput-boolean p2, p0, Lcom/google/android/material/tabs/TabLayout;->w1:Z

    .line 147
    .line 148
    return-void
.end method

.method public final n(Z)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 4
    .line 5
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v1, v3, :cond_2

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabMinWidth()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v2, v3}, Landroid/view/View;->setMinimumWidth(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 27
    .line 28
    iget v4, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-ne v4, v5, :cond_0

    .line 32
    .line 33
    iget v4, p0, Lcom/google/android/material/tabs/TabLayout;->z:I

    .line 34
    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 38
    .line 39
    const/high16 v4, 0x3f800000    # 1.0f

    .line 40
    .line 41
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v4, -0x2

    .line 45
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 49
    .line 50
    :goto_1
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 53
    .line 54
    .line 55
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, La/ki30;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, La/ki30;

    .line 13
    .line 14
    invoke-static {p0, v0}, La/k7x;->V(Landroid/view/View;La/ki30;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->r1:Landroidx/viewpager/widget/ViewPager;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Landroidx/viewpager/widget/ViewPager;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/tabs/TabLayout;->m(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/google/android/material/tabs/TabLayout;->w1:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/google/android/material/tabs/TabLayout;->w1:Z

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v2, v1, La/vbo0;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, La/vbo0;

    .line 19
    .line 20
    sget v2, La/vbo0;->l:I

    .line 21
    .line 22
    iget-object v2, v1, La/vbo0;->i:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v1, La/vbo0;->i:Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {v0, p0, v0}, La/i7;->b(III)La/i7;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, La/i7;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabMode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabMode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/google/android/material/tabs/TabLayout;->getDefaultHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1, v0}, La/afn0;->l(ILandroid/content/Context;)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/high16 v2, -0x80000000

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/high16 v4, 0x40000000    # 2.0f

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    add-int/2addr p2, v0

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/2addr v0, p2

    .line 42
    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-ne v1, v5, :cond_2

    .line 52
    .line 53
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lt v1, v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    iget v1, p0, Lcom/google/android/material/tabs/TabLayout;->w:I

    .line 77
    .line 78
    if-lez v1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    int-to-float v0, v0

    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const/16 v2, 0x38

    .line 87
    .line 88
    invoke-static {v2, v1}, La/afn0;->l(ILandroid/content/Context;)F

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    sub-float/2addr v0, v1

    .line 93
    float-to-int v1, v0

    .line 94
    :goto_1
    iput v1, p0, Lcom/google/android/material/tabs/TabLayout;->u:I

    .line 95
    .line 96
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->onMeasure(II)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-ne p1, v5, :cond_8

    .line 104
    .line 105
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 110
    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    if-eq v0, v5, :cond_5

    .line 114
    .line 115
    const/4 v1, 0x2

    .line 116
    if-eq v0, v1, :cond_7

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eq v0, v1, :cond_6

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_6
    return-void

    .line 131
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-ge v0, v1, :cond_8

    .line 140
    .line 141
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    add-int/2addr v1, v0

    .line 150
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 155
    .line 156
    invoke-static {p2, v1, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    invoke-static {p0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-virtual {p1, p0, p2}, Landroid/view/View;->measure(II)V

    .line 169
    .line 170
    .line 171
    :cond_8
    :goto_3
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabMode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabMode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public setElevation(F)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, La/ki30;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, La/ki30;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/ki30;->r(F)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setInlineLabel(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/tabs/TabLayout;->g1:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_4

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/tabs/TabLayout;->g1:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    move v0, p1

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v0, v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    instance-of v2, v1, La/vbo0;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    check-cast v1, La/vbo0;

    .line 26
    .line 27
    iget-object v2, v1, La/vbo0;->k:Lcom/google/android/material/tabs/TabLayout;

    .line 28
    .line 29
    iget-boolean v2, v2, Lcom/google/android/material/tabs/TabLayout;->g1:Z

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    xor-int/2addr v2, v3

    .line 33
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v1, La/vbo0;->g:Landroid/widget/TextView;

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    iget-object v4, v1, La/vbo0;->h:Landroid/widget/ImageView;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-object v2, v1, La/vbo0;->b:Landroid/widget/TextView;

    .line 46
    .line 47
    iget-object v4, v1, La/vbo0;->c:Landroid/widget/ImageView;

    .line 48
    .line 49
    invoke-virtual {v1, v2, v4, v3}, La/vbo0;->i(Landroid/widget/TextView;Landroid/widget/ImageView;Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    :goto_1
    iget-object v3, v1, La/vbo0;->h:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-virtual {v1, v2, v3, p1}, La/vbo0;->i(Landroid/widget/TextView;Landroid/widget/ImageView;Z)V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->c()V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void
.end method

.method public setInlineLabelResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->setInlineLabel(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setOnTabSelectedListener(La/pbo0;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->n1:La/pbo0;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout;->o1:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->n1:La/pbo0;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public setOnTabSelectedListener(La/qbo0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->setOnTabSelectedListener(La/pbo0;)V

    return-void
.end method

.method public setScrollAnimatorListener(Landroid/animation/Animator$AnimatorListener;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->e()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->q1:Landroid/animation/ValueAnimator;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSelectedTabIndicator(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicator(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 45
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicator(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSelectedTabIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Landroid/graphics/drawable/GradientDrawable;

    .line 4
    .line 5
    invoke-direct {p1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->p:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget p1, p0, Lcom/google/android/material/tabs/TabLayout;->i1:I

    .line 27
    .line 28
    const/4 v0, -0x1

    .line 29
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    :cond_2
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, La/sbo0;->b(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setSelectedTabIndicatorColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->p:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->o:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->n(Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setSelectedTabIndicatorGravity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->B:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->B:I

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setSelectedTabIndicatorHeight(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->i1:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/sbo0;->b(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTabGravity(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->z:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->z:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setTabIconTint(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->m:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->m:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-ge v0, p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/tbo0;

    .line 21
    .line 22
    iget-object v1, v1, La/tbo0;->e:La/vbo0;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, La/vbo0;->f()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method public setTabIconTintResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->setTabIconTint(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setTabIndicatorAnimationMode(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->j1:I

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    new-instance p1, La/rrn;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p1, v0}, La/rrn;-><init>(B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->l1:La/g9m0;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, " is not a valid TabIndicatorAnimationMode"

    .line 21
    .line 22
    invoke-static {p1, p0}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance p1, La/rrn;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, v0}, La/rrn;-><init>(B)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->l1:La/g9m0;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    new-instance p1, La/g9m0;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->l1:La/g9m0;

    .line 45
    .line 46
    return-void
.end method

.method public setTabIndicatorFullWidth(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/tabs/TabLayout;->h1:Z

    .line 2
    .line 3
    sget p1, La/sbo0;->c:I

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 6
    .line 7
    iget-object p1, p0, La/sbo0;->b:Lcom/google/android/material/tabs/TabLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, La/sbo0;->a(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setTabMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/tabs/TabLayout;->f1:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setTabRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->n:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->n:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge p1, v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, La/vbo0;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    check-cast v0, La/vbo0;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget v2, La/vbo0;->l:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/vbo0;->g(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method public setTabRippleColorResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->setTabRippleColor(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setTabTextColors(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout;->l:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-ge v0, p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/tbo0;

    .line 21
    .line 22
    iget-object v1, v1, La/tbo0;->e:La/vbo0;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, La/vbo0;->f()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method public setTabsFromPagerAdapter(La/pj80;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/tabs/TabLayout;->k(La/pj80;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setUnboundedRipple(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/tabs/TabLayout;->k1:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/tabs/TabLayout;->k1:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout;->d:La/sbo0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge p1, v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, La/vbo0;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    check-cast v0, La/vbo0;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget v2, La/vbo0;->l:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/vbo0;->g(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method public setUnboundedRippleResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/tabs/TabLayout;->setUnboundedRipple(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/tabs/TabLayout;->m(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/tabs/TabLayout;->getTabScrollRange()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-lez p0, :cond_0

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
