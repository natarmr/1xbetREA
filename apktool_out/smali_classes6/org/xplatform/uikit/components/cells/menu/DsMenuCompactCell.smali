.class public final Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;
.super La/tw5;
.source "SourceFile"


# static fields
.field public static final synthetic k1:I


# instance fields
.field public final A:La/jk3;

.field public final B:La/if5;

.field public final f1:La/ape;

.field public final g1:La/a8z;

.field public final h1:I

.field public final i1:I

.field public final j1:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 462
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 461
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const/4 v7, 0x2

    .line 6
    and-int/lit8 v0, p3, 0x2

    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v9, v8

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v9, p2

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v10, 0x7f040143

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v6, v9, v10}, La/tw5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const v2, 0x7f0d04c5

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    const v0, 0x7f0a0737

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Landroidx/appcompat/widget/AppCompatImageView;

    .line 42
    .line 43
    if-eqz v2, :cond_a

    .line 44
    .line 45
    const v0, 0x7f0a0e9e

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroid/widget/ImageView;

    .line 53
    .line 54
    if-eqz v3, :cond_a

    .line 55
    .line 56
    const v0, 0x7f0a0eb0

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lcom/google/android/material/textview/MaterialTextView;

    .line 64
    .line 65
    if-eqz v4, :cond_a

    .line 66
    .line 67
    const v0, 0x7f0a0fd8

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Landroid/widget/TextView;

    .line 75
    .line 76
    if-eqz v5, :cond_a

    .line 77
    .line 78
    new-instance v0, La/jk3;

    .line 79
    .line 80
    invoke-direct/range {v0 .. v5}, La/jk3;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/ImageView;Lcom/google/android/material/textview/MaterialTextView;Landroid/widget/TextView;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, v1, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 84
    .line 85
    new-instance v0, La/if5;

    .line 86
    .line 87
    new-instance v3, La/rkm;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-direct {v3, v1, v4}, La/rkm;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;B)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, v2, v3}, La/if5;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    .line 96
    iput-object v0, v1, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->B:La/if5;

    .line 97
    .line 98
    new-instance v2, La/ape;

    .line 99
    .line 100
    new-instance v3, La/rkm;

    .line 101
    .line 102
    const/4 v5, 0x1

    .line 103
    invoke-direct {v3, v1, v5}, La/rkm;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;B)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v2, v1, v3}, La/ape;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;La/rkm;)V

    .line 107
    .line 108
    .line 109
    iput-object v2, v1, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->f1:La/ape;

    .line 110
    .line 111
    new-instance v11, La/rkm;

    .line 112
    .line 113
    invoke-direct {v11, v1, v7}, La/rkm;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;B)V

    .line 114
    .line 115
    .line 116
    sget-object v12, La/wez;->b:La/wez;

    .line 117
    .line 118
    invoke-static {v12, v11}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    iput-object v11, v1, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->g1:La/a8z;

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    const v12, 0x7f0706ea

    .line 129
    .line 130
    .line 131
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    iput v11, v1, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->h1:I

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    const v12, 0x7f070717

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    iput v11, v1, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->i1:I

    .line 149
    .line 150
    const/high16 v11, 0x3f000000    # 0.5f

    .line 151
    .line 152
    iput v11, v1, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->j1:F

    .line 153
    .line 154
    invoke-virtual {v0, v9, v4}, La/if5;->f(Landroid/util/AttributeSet;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    sget-object v11, La/bqd0;->y:[I

    .line 165
    .line 166
    invoke-virtual {v0, v9, v11, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget v11, v2, La/ape;->g:I

    .line 171
    .line 172
    invoke-virtual {v0, v7, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    iput v11, v2, La/ape;->g:I

    .line 177
    .line 178
    const/4 v11, 0x4

    .line 179
    const/4 v12, 0x7

    .line 180
    invoke-static {v0, v11, v12}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    iput v13, v2, La/ape;->h:I

    .line 185
    .line 186
    const/4 v13, 0x6

    .line 187
    const/16 v14, 0x8

    .line 188
    .line 189
    invoke-static {v0, v13, v14}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    iput v15, v2, La/ape;->i:I

    .line 194
    .line 195
    const/4 v15, 0x3

    .line 196
    move/from16 p2, v14

    .line 197
    .line 198
    invoke-virtual {v0, v15, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 199
    .line 200
    .line 201
    move-result v14

    .line 202
    sget-object v11, La/r0m;->t:La/c0o;

    .line 203
    .line 204
    invoke-virtual {v11, v14}, La/c0o;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    check-cast v11, La/r0m;

    .line 209
    .line 210
    iput-object v11, v2, La/ape;->e:La/r0m;

    .line 211
    .line 212
    iget v11, v2, La/ape;->f:I

    .line 213
    .line 214
    invoke-virtual {v0, v15, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    iput v11, v2, La/ape;->f:I

    .line 219
    .line 220
    iget-object v11, v2, La/ape;->d:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 221
    .line 222
    if-nez v11, :cond_1

    .line 223
    .line 224
    sget-object v11, Lorg/xplatform/uikit/components/badges/DsBadge;->e:[Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    iget v14, v2, La/ape;->f:I

    .line 234
    .line 235
    new-instance v15, Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 236
    .line 237
    new-instance v12, La/tje;

    .line 238
    .line 239
    invoke-direct {v12, v11, v14}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v15, v12, v8, v13}, Lorg/xplatform/uikit/components/badges/DsBadge;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 243
    .line 244
    .line 245
    invoke-static {v15}, La/jmu0;->g(Landroid/view/View;)V

    .line 246
    .line 247
    .line 248
    iput-object v15, v2, La/ape;->d:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 249
    .line 250
    iget v11, v2, La/ape;->g:I

    .line 251
    .line 252
    iget v12, v2, La/ape;->h:I

    .line 253
    .line 254
    iget v14, v2, La/ape;->i:I

    .line 255
    .line 256
    invoke-virtual {v15, v11, v12, v14}, Lorg/xplatform/uikit/components/badges/DsBadge;->d(III)V

    .line 257
    .line 258
    .line 259
    iget-object v11, v2, La/ape;->d:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 260
    .line 261
    if-eqz v11, :cond_1

    .line 262
    .line 263
    invoke-virtual {v11, v1, v3}, Lorg/xplatform/uikit/components/badges/DsBadge;->a(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 264
    .line 265
    .line 266
    :cond_1
    invoke-virtual {v0, v4, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-virtual {v2, v3}, La/ape;->a(Ljava/lang/Integer;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 278
    .line 279
    .line 280
    sget-object v0, La/bqd0;->U:[I

    .line 281
    .line 282
    invoke-virtual {v6, v9, v0, v10, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    const/16 v2, 0xa

    .line 287
    .line 288
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-static {v0, v6, v2}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    if-eqz v2, :cond_2

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    goto :goto_1

    .line 303
    :cond_2
    move-object v2, v8

    .line 304
    :goto_1
    const-string v3, ""

    .line 305
    .line 306
    if-nez v2, :cond_3

    .line 307
    .line 308
    move-object v2, v3

    .line 309
    :cond_3
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-static {v0, v6, v2}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    if-eqz v2, :cond_4

    .line 321
    .line 322
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    goto :goto_2

    .line 327
    :cond_4
    move-object v2, v8

    .line 328
    :goto_2
    if-nez v2, :cond_5

    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_5
    move-object v3, v2

    .line 332
    :goto_3
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    const/16 v2, 0xb

    .line 336
    .line 337
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-static {v0, v2}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    if-eqz v2, :cond_6

    .line 346
    .line 347
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitleColor(I)V

    .line 352
    .line 353
    .line 354
    :cond_6
    const/16 v2, 0x9

    .line 355
    .line 356
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-static {v0, v2}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    if-eqz v2, :cond_7

    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitleColor(I)V

    .line 371
    .line 372
    .line 373
    :cond_7
    invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v13}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setStatusIcon(Landroid/graphics/drawable/Drawable;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v7, v6, v0}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 392
    .line 393
    .line 394
    const/4 v2, 0x7

    .line 395
    invoke-static {v2, v6, v0}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setStatusIconTint(Landroid/content/res/ColorStateList;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1}, La/tw5;->getCellMiddleView()Landroid/view/View;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    instance-of v2, v1, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 407
    .line 408
    if-eqz v2, :cond_8

    .line 409
    .line 410
    move-object v8, v1

    .line 411
    check-cast v8, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 412
    .line 413
    :cond_8
    if-eqz v8, :cond_9

    .line 414
    .line 415
    const/4 v1, 0x5

    .line 416
    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 417
    .line 418
    .line 419
    move-result v1

    .line 420
    invoke-virtual {v8, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMinLines(I)V

    .line 421
    .line 422
    .line 423
    const/4 v1, 0x4

    .line 424
    invoke-virtual {v0, v1, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    invoke-virtual {v8, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLines(I)V

    .line 429
    .line 430
    .line 431
    const/4 v1, 0x3

    .line 432
    invoke-virtual {v0, v1, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    invoke-virtual {v8, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleMaxLines(I)V

    .line 437
    .line 438
    .line 439
    :cond_9
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    const-string v1, "Missing required view with ID: "

    .line 452
    .line 453
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw v8
.end method

.method private final getImageHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->g1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r0x;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->B:La/if5;

    .line 17
    .line 18
    iget-boolean v0, p0, La/if5;->i:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    new-instance v1, La/hf5;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, v0, p0, p1, v2}, La/hf5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void

    .line 37
    :cond_2
    new-instance v0, La/djl;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v0, p0, p1, v1}, La/djl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public setBadgeBackgroundTint(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->B:La/if5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/if5;->j(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBadgeVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->B:La/if5;

    .line 2
    .line 3
    iget-object p0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setCounter(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->f1:La/ape;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ape;->a(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, La/jmu0;->b(Landroid/view/View;Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->B:La/if5;

    .line 5
    .line 6
    iget-object v0, v0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/badges/DsBadge;->setEnabled(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->f1:La/ape;

    .line 14
    .line 15
    iget-object v1, v0, La/ape;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setEnabled(Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, v0, La/ape;->d:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/badges/DsBadge;->setEnabled(Z)V

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-super {p0, p1}, La/tw5;->setEnabled(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 2
    .line 3
    iget-object v0, p0, La/jk3;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/jk3;->d:Landroid/view/View;

    .line 11
    .line 12
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 p1, 0x8

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final setIconResource(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 2
    .line 3
    iget-object v0, p0, La/jk3;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/jk3;->d:Landroid/view/View;

    .line 11
    .line 12
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final setIconTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setStatusIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 2
    .line 3
    iget-object v0, p0, La/jk3;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 11
    .line 12
    check-cast p0, Landroid/widget/ImageView;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 p1, 0x8

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final setStatusIconTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setSubTitle(I)V
    .locals 1

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setSubTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSubTitle(Ljava/lang/CharSequence;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 5
    .line 6
    iget-object v1, v0, La/jk3;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast v1, Lcom/google/android/material/textview/MaterialTextView;

    .line 9
    .line 10
    iget-object v2, v0, La/jk3;->f:Landroid/view/View;

    .line 11
    .line 12
    check-cast v2, Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/jk3;->c:Landroid/view/View;

    .line 18
    .line 19
    check-cast v1, Lcom/google/android/material/textview/MaterialTextView;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 v3, 0x0

    .line 26
    if-lez p1, :cond_0

    .line 27
    .line 28
    move p1, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 p1, 0x8

    .line 31
    .line 32
    :goto_0
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move p1, v3

    .line 44
    :goto_1
    const/4 v4, 0x5

    .line 45
    const-string v5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    check-cast p1, La/a3e;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iput v0, p1, La/a3e;->k:I

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    iput v0, p1, La/a3e;->F:F

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    iget p1, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->h1:I

    .line 70
    .line 71
    iget p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->i1:I

    .line 72
    .line 73
    invoke-static {p1, p0, v4, v2}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    check-cast p1, La/a3e;

    .line 88
    .line 89
    iget-object v0, v0, La/jk3;->b:Landroid/view/ViewGroup;

    .line 90
    .line 91
    check-cast v0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iput v0, p1, La/a3e;->l:I

    .line 98
    .line 99
    iget p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->j1:F

    .line 100
    .line 101
    iput p0, p1, La/a3e;->F:F

    .line 102
    .line 103
    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v3, v3, v4, v2}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_4
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final setSubTitleColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lcom/google/android/material/textview/MaterialTextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    iget-object p0, p0, La/jk3;->f:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final v(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->A:La/jk3;

    .line 2
    .line 3
    iget-object v1, v0, La/jk3;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->getImageHelper()La/r0x;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v0, v0, La/jk3;->d:Landroid/view/View;

    .line 16
    .line 17
    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->getImageHelper()La/r0x;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v0, La/h7w;

    .line 31
    .line 32
    const/16 v1, 0x13

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/h7w;-><init>(B)V

    .line 35
    .line 36
    .line 37
    new-instance v1, La/ljc0;

    .line 38
    .line 39
    const/16 v2, 0xe

    .line 40
    .line 41
    invoke-direct {v1, v2}, La/ljc0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p2, p1, v0, v1}, La/r0x;->f(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
