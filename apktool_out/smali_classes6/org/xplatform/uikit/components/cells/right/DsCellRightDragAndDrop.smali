.class public final Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/hab;


# static fields
.field public static final synthetic i:I


# instance fields
.field public a:La/nvl;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Landroid/widget/ImageView;

.field public final g:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

.field public final h:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 428
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

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
    const v5, 0x7f04014b

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v3, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    .line 23
    .line 24
    sget-object v6, La/nvl;->a:La/nvl;

    .line 25
    .line 26
    iput-object v6, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    const v8, 0x7f070717

    .line 33
    .line 34
    .line 35
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    iput v7, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->b:I

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    const v9, 0x7f07072d

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    iput v8, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->c:I

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    const v11, 0x7f0706a9

    .line 59
    .line 60
    .line 61
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    iput v10, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->d:I

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    invoke-virtual {v11, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    const v12, 0x7f0706b7

    .line 80
    .line 81
    .line 82
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    iput v11, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->e:I

    .line 87
    .line 88
    new-instance v11, Landroid/widget/ImageView;

    .line 89
    .line 90
    invoke-direct {v11, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    const-string v13, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 101
    .line 102
    if-eqz v12, :cond_13

    .line 103
    .line 104
    check-cast v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 105
    .line 106
    const/16 v14, 0x10

    .line 107
    .line 108
    iput v14, v12, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 109
    .line 110
    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11, v9, v9, v9, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 114
    .line 115
    .line 116
    const v9, 0x7f0809de

    .line 117
    .line 118
    .line 119
    invoke-static {v9, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-virtual {v11, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 124
    .line 125
    .line 126
    const v9, 0x7f040b0b

    .line 127
    .line 128
    .line 129
    invoke-static {v9, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    const v12, 0x7f040b0e

    .line 134
    .line 135
    .line 136
    invoke-static {v12, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    invoke-static {v1, v9, v12}, La/m5d;->a(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-virtual {v11, v9}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 145
    .line 146
    .line 147
    iput-object v11, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->f:Landroid/widget/ImageView;

    .line 148
    .line 149
    new-instance v9, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 150
    .line 151
    const/4 v12, 0x6

    .line 152
    const/4 v15, 0x0

    .line 153
    invoke-direct {v9, v1, v4, v12, v15}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 154
    .line 155
    .line 156
    const/4 v12, 0x1

    .line 157
    invoke-virtual {v9, v12}, Landroid/view/View;->setDuplicateParentStateEnabled(Z)V

    .line 158
    .line 159
    .line 160
    iput-object v9, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->g:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 161
    .line 162
    move-object/from16 p3, v4

    .line 163
    .line 164
    new-instance v4, La/yg3;

    .line 165
    .line 166
    const/16 v14, 0x1d

    .line 167
    .line 168
    invoke-direct {v4, v1, v14}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 169
    .line 170
    .line 171
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    iput-object v4, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->h:La/n0o0;

    .line 176
    .line 177
    sget-object v4, La/bqd0;->q:[I

    .line 178
    .line 179
    invoke-virtual {v1, v3, v4, v5, v15}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1, v15, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-virtual {v1, v2, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_1

    .line 192
    .line 193
    sget-object v6, La/nvl;->c:La/nvl;

    .line 194
    .line 195
    iput-object v6, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_1
    invoke-virtual {v1, v12, v15}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-eqz v4, :cond_2

    .line 203
    .line 204
    sget-object v6, La/nvl;->b:La/nvl;

    .line 205
    .line 206
    iput-object v6, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_2
    iput-object v6, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 210
    .line 211
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_11

    .line 216
    .line 217
    if-eq v4, v12, :cond_a

    .line 218
    .line 219
    if-ne v4, v2, :cond_9

    .line 220
    .line 221
    invoke-direct {v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    if-nez v2, :cond_12

    .line 233
    .line 234
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-ne v0, v12, :cond_3

    .line 242
    .line 243
    move v15, v12

    .line 244
    :cond_3
    if-eqz v15, :cond_4

    .line 245
    .line 246
    move v0, v7

    .line 247
    goto :goto_2

    .line 248
    :cond_4
    add-int v0, v10, v8

    .line 249
    .line 250
    :goto_2
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    if-eqz v2, :cond_8

    .line 255
    .line 256
    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 257
    .line 258
    if-eqz v15, :cond_5

    .line 259
    .line 260
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_5
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 265
    .line 266
    .line 267
    :goto_3
    invoke-virtual {v11, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-eqz v0, :cond_7

    .line 275
    .line 276
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 277
    .line 278
    const/16 v2, 0x10

    .line 279
    .line 280
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 281
    .line 282
    if-eqz v15, :cond_6

    .line 283
    .line 284
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_6
    add-int/2addr v10, v8

    .line 289
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 290
    .line 291
    .line 292
    :goto_4
    invoke-virtual {v9, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 293
    .line 294
    .line 295
    goto/16 :goto_8

    .line 296
    .line 297
    :cond_7
    invoke-static {v13}, La/hny;->u(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw p3

    .line 301
    :cond_8
    invoke-static {v13}, La/hny;->u(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw p3

    .line 305
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 306
    .line 307
    .line 308
    throw p3

    .line 309
    :cond_a
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 310
    .line 311
    .line 312
    invoke-direct {v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    if-nez v2, :cond_12

    .line 321
    .line 322
    invoke-direct {v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-ne v2, v12, :cond_b

    .line 334
    .line 335
    move v15, v12

    .line 336
    :cond_b
    if-eqz v15, :cond_c

    .line 337
    .line 338
    move v2, v7

    .line 339
    goto :goto_5

    .line 340
    :cond_c
    add-int v2, v10, v8

    .line 341
    .line 342
    :goto_5
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    if-eqz v4, :cond_10

    .line 347
    .line 348
    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 349
    .line 350
    if-eqz v15, :cond_d

    .line 351
    .line 352
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 353
    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_d
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 357
    .line 358
    .line 359
    :goto_6
    invoke-virtual {v11, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 360
    .line 361
    .line 362
    invoke-direct {v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    if-eqz v4, :cond_f

    .line 371
    .line 372
    check-cast v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 373
    .line 374
    const/16 v5, 0x10

    .line 375
    .line 376
    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 377
    .line 378
    if-eqz v15, :cond_e

    .line 379
    .line 380
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 381
    .line 382
    .line 383
    goto :goto_7

    .line 384
    :cond_e
    add-int/2addr v10, v8

    .line 385
    invoke-virtual {v4, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 386
    .line 387
    .line 388
    :goto_7
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 389
    .line 390
    .line 391
    invoke-direct {v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/buttons/DsButton;->i(I)V

    .line 396
    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_f
    invoke-static {v13}, La/hny;->u(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw p3

    .line 403
    :cond_10
    invoke-static {v13}, La/hny;->u(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw p3

    .line 407
    :cond_11
    invoke-direct {v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 415
    .line 416
    .line 417
    :cond_12
    :goto_8
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :cond_13
    move-object/from16 p3, v4

    .line 422
    .line 423
    invoke-static {v13}, La/hny;->u(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw p3
.end method

.method private final getButton()Lorg/xplatform/uikit/components/buttons/DsButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->h:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final getStyle()La/nvl;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    iget p1, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->d:I

    .line 2
    .line 3
    const/high16 p2, 0x40000000    # 2.0f

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->f:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 23
    .line 24
    sget-object v2, La/nvl;->c:La/nvl;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v4, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->g:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 38
    .line 39
    invoke-virtual {v4, v1, v2}, Landroid/view/View;->measure(II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v1, v3

    .line 48
    :goto_0
    iget-object v2, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 49
    .line 50
    sget-object v4, La/nvl;->b:La/nvl;

    .line 51
    .line 52
    if-ne v2, v4, :cond_1

    .line 53
    .line 54
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {v2, v3, p1}, Landroid/view/View;->measure(II)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    :cond_1
    iget-object p1, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 78
    .line 79
    sget-object p2, La/nvl;->a:La/nvl;

    .line 80
    .line 81
    iget v2, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->b:I

    .line 82
    .line 83
    if-ne p1, p2, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    iget p1, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->c:I

    .line 87
    .line 88
    add-int/2addr v2, p1

    .line 89
    :goto_1
    invoke-static {v0, v1, v3, v2}, La/hne;->D(IIII)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iget p2, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->e:I

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final setCheckBoxChecked(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->g:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setChecked(Z)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->f:Landroid/widget/ImageView;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->g:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 25
    .line 26
    .line 27
    :cond_2
    return-void
.end method

.method public final setOnButtonClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setOnCheckBoxCheckedChangeListener(La/qg60;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->g:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setCheckedChangeListener(La/qg60;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSelected(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->g:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->setCheckBoxChecked(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setStyle(La/nvl;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightDragAndDrop;->a:La/nvl;

    .line 5
    .line 6
    return-void
.end method
