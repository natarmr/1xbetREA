.class public final Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final q:La/jg;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public final t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public final y:La/ngh;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 397
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 396
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    and-int/lit8 v0, p3, 0x2

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v14, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v14, p2

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v15, 0x7f040015

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v13, v14, v15}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v13}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v3, 0x7f0d0021

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    const v0, 0x7f0a0040

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz v3, :cond_5

    .line 43
    .line 44
    const v0, 0x7f0a0041

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Landroidx/constraintlayout/helper/widget/Flow;

    .line 52
    .line 53
    if-eqz v4, :cond_5

    .line 54
    .line 55
    const v0, 0x7f0a0044

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Landroidx/constraintlayout/helper/widget/Flow;

    .line 63
    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    const v0, 0x7f0a0046

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Landroidx/constraintlayout/helper/widget/Flow;

    .line 74
    .line 75
    if-eqz v6, :cond_5

    .line 76
    .line 77
    const v0, 0x7f0a0049

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Landroid/widget/LinearLayout;

    .line 85
    .line 86
    if-eqz v7, :cond_5

    .line 87
    .line 88
    const v0, 0x7f0a004a

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Landroid/widget/TextView;

    .line 96
    .line 97
    if-eqz v7, :cond_5

    .line 98
    .line 99
    const v0, 0x7f0a004b

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Landroid/widget/ImageView;

    .line 107
    .line 108
    if-eqz v8, :cond_5

    .line 109
    .line 110
    const v0, 0x7f0a073a

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    check-cast v9, Landroid/widget/FrameLayout;

    .line 118
    .line 119
    if-eqz v9, :cond_5

    .line 120
    .line 121
    const v0, 0x7f0a0c09

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    check-cast v10, Landroid/widget/ImageView;

    .line 129
    .line 130
    if-eqz v10, :cond_5

    .line 131
    .line 132
    const v0, 0x7f0a0c0a

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    check-cast v11, Landroid/widget/ImageView;

    .line 140
    .line 141
    if-eqz v11, :cond_5

    .line 142
    .line 143
    const v0, 0x7f0a0d78

    .line 144
    .line 145
    .line 146
    move-object v12, v2

    .line 147
    move-object v2, v3

    .line 148
    move-object v3, v4

    .line 149
    move-object v4, v5

    .line 150
    move-object v5, v6

    .line 151
    move-object v6, v7

    .line 152
    move-object v7, v8

    .line 153
    move-object v8, v9

    .line 154
    move-object v9, v10

    .line 155
    move-object v10, v11

    .line 156
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    if-eqz v11, :cond_6

    .line 161
    .line 162
    const v0, 0x7f0a101e

    .line 163
    .line 164
    .line 165
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v16

    .line 169
    check-cast v16, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 170
    .line 171
    if-eqz v16, :cond_6

    .line 172
    .line 173
    new-instance v0, La/jg;

    .line 174
    .line 175
    move-object/from16 v12, v16

    .line 176
    .line 177
    invoke-direct/range {v0 .. v12}, La/jg;-><init>(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Landroid/widget/TextView;Landroidx/constraintlayout/helper/widget/Flow;Landroidx/constraintlayout/helper/widget/Flow;Landroidx/constraintlayout/helper/widget/Flow;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/view/View;Lorg/xplatform/uikit/components/buttons/DsButton;)V

    .line 178
    .line 179
    .line 180
    iput-object v0, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 181
    .line 182
    new-instance v0, La/yg3;

    .line 183
    .line 184
    const/16 v3, 0x19

    .line 185
    .line 186
    invoke-direct {v0, v13, v3}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 187
    .line 188
    .line 189
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v0, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->r:La/n0o0;

    .line 194
    .line 195
    new-instance v0, La/yg3;

    .line 196
    .line 197
    const/16 v3, 0x1a

    .line 198
    .line 199
    invoke-direct {v0, v13, v3}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 200
    .line 201
    .line 202
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iput-object v0, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->s:La/n0o0;

    .line 207
    .line 208
    const v0, 0x7f1401d5

    .line 209
    .line 210
    .line 211
    iput v0, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->t:I

    .line 212
    .line 213
    new-instance v0, La/ngh;

    .line 214
    .line 215
    const/16 v3, 0x18

    .line 216
    .line 217
    invoke-direct {v0, v1, v13, v3}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 218
    .line 219
    .line 220
    iput-object v0, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->y:La/ngh;

    .line 221
    .line 222
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    const v4, 0x7f07072d

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    const v5, 0x7f0706f8

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    invoke-virtual {v7, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    invoke-virtual {v1, v4, v3, v5, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 257
    .line 258
    .line 259
    sget-object v3, La/bqd0;->d:[I

    .line 260
    .line 261
    const/4 v4, 0x0

    .line 262
    invoke-virtual {v13, v14, v3, v15, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-virtual {v0, v3}, La/ngh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const v3, 0x7f070657

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    invoke-virtual {v12, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setMaxWidth(I)V

    .line 284
    .line 285
    .line 286
    iget v0, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->w:I

    .line 287
    .line 288
    const/4 v3, 0x1

    .line 289
    const v4, 0x7f0706d1

    .line 290
    .line 291
    .line 292
    if-nez v0, :cond_1

    .line 293
    .line 294
    iget v5, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->v:I

    .line 295
    .line 296
    if-nez v5, :cond_1

    .line 297
    .line 298
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    goto :goto_1

    .line 307
    :cond_1
    if-ne v0, v3, :cond_2

    .line 308
    .line 309
    iget v0, v1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->v:I

    .line 310
    .line 311
    if-ne v0, v3, :cond_2

    .line 312
    .line 313
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    goto :goto_1

    .line 322
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    const v4, 0x7f0706c1

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    :goto_1
    invoke-virtual {v12, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_4

    .line 341
    .line 342
    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-nez v0, :cond_4

    .line 347
    .line 348
    invoke-virtual {v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-eqz v0, :cond_3

    .line 353
    .line 354
    const v0, 0x800005

    .line 355
    .line 356
    .line 357
    goto :goto_2

    .line 358
    :cond_3
    const v0, 0x800003

    .line 359
    .line 360
    .line 361
    :goto_2
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :cond_4
    new-instance v0, La/ejl;

    .line 369
    .line 370
    invoke-direct {v0, v1, v3}, La/ejl;-><init>(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;B)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 374
    .line 375
    .line 376
    return-void

    .line 377
    :cond_5
    move-object v12, v2

    .line 378
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    const-string v1, "Missing required view with ID: "

    .line 387
    .line 388
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v12
.end method

.method public static final B(Lkotlin/jvm/functions/Function0;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-direct {p1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->getRotationAnimationRtl()Landroid/view/animation/Animation;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-direct {p1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->getRotationAnimation()Landroid/view/animation/Animation;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    iget p2, p1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->x:I

    .line 23
    .line 24
    iget-object p1, p1, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iget-object p1, p1, La/jg;->j:Landroid/view/View;

    .line 29
    .line 30
    check-cast p1, Landroid/widget/ImageView;

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object p1, p1, La/jg;->i:Landroid/view/View;

    .line 37
    .line 38
    check-cast p1, Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 41
    .line 42
    .line 43
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0
.end method

.method private final getRotationAnimation()Landroid/view/animation/Animation;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->r:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/animation/Animation;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getRotationAnimationRtl()Landroid/view/animation/Animation;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->s:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/animation/Animation;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setAccountTitleType(I)V
    .locals 12

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 2
    .line 3
    iget-object v1, v0, La/jg;->c:Landroid/widget/TextView;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    move v3, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/16 v3, 0x8

    .line 11
    .line 12
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    const v3, 0x7f040b5f

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-eq p1, v4, :cond_b

    .line 20
    .line 21
    const/4 v5, 0x2

    .line 22
    if-eq p1, v5, :cond_1

    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const v6, 0x7f070640

    .line 31
    .line 32
    .line 33
    const v7, 0x7f070705

    .line 34
    .line 35
    .line 36
    if-eqz v5, :cond_4

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_4

    .line 43
    .line 44
    iget-object v5, v0, La/jg;->f:Landroid/view/View;

    .line 45
    .line 46
    check-cast v5, Landroidx/constraintlayout/helper/widget/Flow;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {v8, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-virtual {v5, v8}, Landroidx/constraintlayout/helper/widget/Flow;->setVerticalGap(I)V

    .line 57
    .line 58
    .line 59
    iget-object v5, v0, La/jg;->i:Landroid/view/View;

    .line 60
    .line 61
    check-cast v5, Landroid/widget/ImageView;

    .line 62
    .line 63
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const-string v9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 68
    .line 69
    if-eqz v8, :cond_3

    .line 70
    .line 71
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    const v11, 0x7f07066b

    .line 78
    .line 79
    .line 80
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    invoke-virtual {v10, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    invoke-virtual {v8, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v0, La/jg;->j:Landroid/view/View;

    .line 102
    .line 103
    check-cast v0, Landroid/widget/ImageView;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    if-eqz v5, :cond_2

    .line 110
    .line 111
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const v9, 0x7f0706d0

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    invoke-static {v9}, La/hny;->u(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_3
    invoke-static {v9}, La/hny;->u(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_4
    new-instance v0, La/ejl;

    .line 140
    .line 141
    invoke-direct {v0, p0, v2}, La/ejl;-><init>(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 145
    .line 146
    .line 147
    :goto_1
    const v0, 0x7f14045b

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 151
    .line 152
    .line 153
    iget v0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 154
    .line 155
    if-ne v0, v4, :cond_5

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_5
    const v3, 0x7f040afc

    .line 159
    .line 160
    .line 161
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-static {v3, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    const v4, 0x7f080815

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    const/4 v5, 0x0

    .line 190
    if-eqz v4, :cond_6

    .line 191
    .line 192
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    goto :goto_3

    .line 197
    :cond_6
    move-object v4, v5

    .line 198
    :goto_3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    invoke-virtual {v8, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    if-eqz v4, :cond_7

    .line 207
    .line 208
    invoke-virtual {v4, v2, v2, v6, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 209
    .line 210
    .line 211
    :cond_7
    if-eqz v4, :cond_8

    .line 212
    .line 213
    invoke-static {v3, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 218
    .line 219
    .line 220
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    invoke-static {}, La/by7;->c()La/by7;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    iget-boolean v2, v2, La/by7;->a:Z

    .line 233
    .line 234
    if-eqz v2, :cond_9

    .line 235
    .line 236
    move-object v3, v4

    .line 237
    goto :goto_4

    .line 238
    :cond_9
    move-object v3, v5

    .line 239
    :goto_4
    if-eqz v2, :cond_a

    .line 240
    .line 241
    move-object v4, v5

    .line 242
    :cond_a
    invoke-virtual {v1, v3, v5, v4, v5}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_b
    const v0, 0x7f140477

    .line 250
    .line 251
    .line 252
    invoke-static {v0, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 253
    .line 254
    .line 255
    iget v0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 256
    .line 257
    if-ne v0, v4, :cond_c

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_c
    const v3, 0x7f040b0b

    .line 261
    .line 262
    .line 263
    :goto_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {v3, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 275
    .line 276
    .line 277
    :goto_6
    iput p1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->v:I

    .line 278
    .line 279
    return-void
.end method

.method private final setAccountValueTextStyle(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 2
    .line 3
    iget-object p0, p0, La/jg;->b:Landroid/widget/TextView;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const p1, 0x7f140486

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const p1, 0x7f140498

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final setBackgroundType(I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 2
    .line 3
    iget-object v1, v0, La/jg;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast v1, Landroidx/constraintlayout/helper/widget/Flow;

    .line 6
    .line 7
    iget-object v2, v0, La/jg;->i:Landroid/view/View;

    .line 8
    .line 9
    check-cast v2, Landroid/widget/ImageView;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    iget-object v4, v0, La/jg;->j:Landroid/view/View;

    .line 16
    .line 17
    check-cast v4, Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, v0, La/jg;->k:Landroid/view/View;

    .line 23
    .line 24
    check-cast v4, Landroid/widget/FrameLayout;

    .line 25
    .line 26
    invoke-virtual {v4, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    iget-object v5, v0, La/jg;->g:Landroid/view/View;

    .line 30
    .line 31
    check-cast v5, Landroidx/constraintlayout/helper/widget/Flow;

    .line 32
    .line 33
    invoke-virtual {v5, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    iget-object v6, v0, La/jg;->h:Landroid/view/View;

    .line 37
    .line 38
    check-cast v6, Landroid/widget/ImageView;

    .line 39
    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v8, 0x0

    .line 42
    if-ne p1, v7, :cond_0

    .line 43
    .line 44
    const/16 v7, 0x8

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v7, v8

    .line 48
    :goto_0
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    iget v7, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 52
    .line 53
    const/4 v9, 0x1

    .line 54
    if-ne v7, v9, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const v10, 0x7f040b5f

    .line 64
    .line 65
    .line 66
    invoke-static {v10, v7}, La/m5d;->b(ILandroid/content/Context;)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 71
    .line 72
    .line 73
    :cond_1
    const v6, 0x7f040ae1

    .line 74
    .line 75
    .line 76
    const v7, 0x7f040b2f

    .line 77
    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    if-eq p1, v9, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    iget v3, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 88
    .line 89
    if-ne v3, v9, :cond_3

    .line 90
    .line 91
    move v6, v7

    .line 92
    :cond_3
    if-ne v3, v9, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const v7, 0x7f040b12

    .line 96
    .line 97
    .line 98
    :goto_1
    invoke-static {v4, v7}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->w(Landroid/view/View;I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v5, v6}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->w(Landroid/view/View;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_5

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const v3, 0x7f07072d

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-virtual {v1, v0}, Landroidx/constraintlayout/helper/widget/Flow;->setHorizontalGap(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 147
    .line 148
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 149
    .line 150
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 161
    .line 162
    const/16 v1, 0x11

    .line 163
    .line 164
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 165
    .line 166
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    new-instance v1, La/djl;

    .line 171
    .line 172
    invoke-direct {v1, v0, p0, v8}, La/djl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    iget v0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 180
    .line 181
    if-ne v0, v9, :cond_7

    .line 182
    .line 183
    move v6, v7

    .line 184
    :cond_7
    invoke-static {v1, v6}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->w(Landroid/view/View;I)V

    .line 185
    .line 186
    .line 187
    :goto_2
    iput p1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->w:I

    .line 188
    .line 189
    return-void
.end method

.method private final setRemoveAccountDescriptionEndPadding(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const v0, 0x7f07072d

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :goto_0
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, La/jg;->g:Landroid/view/View;

    .line 37
    .line 38
    check-cast p0, Landroidx/constraintlayout/helper/widget/Flow;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/helper/widget/Flow;->setPaddingLeft(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p0, p0, La/jg;->g:Landroid/view/View;

    .line 45
    .line 46
    check-cast p0, Landroidx/constraintlayout/helper/widget/Flow;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/helper/widget/Flow;->setPaddingRight(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    new-instance v0, La/fjl;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {v0, p1, p0, v1}, La/fjl;-><init>(ZLorg/xplatform/uikit/components/account_selection/DsAccountSelection;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private final setRemoveAccountDescriptionStartPadding(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const v0, 0x7f07072d

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :goto_0
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, La/jg;->g:Landroid/view/View;

    .line 37
    .line 38
    check-cast p0, Landroidx/constraintlayout/helper/widget/Flow;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/helper/widget/Flow;->setPaddingRight(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p0, p0, La/jg;->g:Landroid/view/View;

    .line 45
    .line 46
    check-cast p0, Landroidx/constraintlayout/helper/widget/Flow;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/helper/widget/Flow;->setPaddingLeft(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    new-instance v0, La/fjl;

    .line 53
    .line 54
    invoke-direct {v0, p1, p0, v1}, La/fjl;-><init>(ZLorg/xplatform/uikit/components/account_selection/DsAccountSelection;B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private final setSeparatorVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 2
    .line 3
    iget-object p0, p0, La/jg;->l:Landroid/view/View;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final setUpUpdateIcon(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_7

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    move v3, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v0

    .line 22
    :goto_0
    iget-object v4, v1, La/jg;->j:Landroid/view/View;

    .line 23
    .line 24
    check-cast v4, Landroid/widget/ImageView;

    .line 25
    .line 26
    iget-object v1, v1, La/jg;->i:Landroid/view/View;

    .line 27
    .line 28
    check-cast v1, Landroid/widget/ImageView;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v0, 0x8

    .line 34
    .line 35
    :goto_1
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    if-nez p1, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    const p1, 0x7f080a4a

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const p1, 0x7f080a49

    .line 51
    .line 52
    .line 53
    :goto_2
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    const v0, 0x7f080a3a

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    const v0, 0x7f080a39

    .line 64
    .line 65
    .line 66
    :goto_3
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_4
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    const p1, 0x7f0809dc

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_5
    const p1, 0x7f0809db

    .line 84
    .line 85
    .line 86
    :goto_4
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 87
    .line 88
    .line 89
    :goto_5
    iget p1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 90
    .line 91
    if-ne p1, v2, :cond_6

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const v0, 0x7f040b5f

    .line 101
    .line 102
    .line 103
    invoke-static {v0, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 122
    .line 123
    .line 124
    :cond_6
    return-void

    .line 125
    :cond_7
    new-instance v0, La/hc3;

    .line 126
    .line 127
    invoke-direct {v0, p1, v1, p0}, La/hc3;-><init>(ILa/jg;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method private final setUpdateFivefoldIconStyle(I)V
    .locals 4

    .line 1
    const v0, 0x7f040b5f

    .line 2
    .line 3
    .line 4
    const v1, 0x7f0809db

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    iget-object v3, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    if-eq p1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object p1, v3, La/jg;->i:Landroid/view/View;

    .line 16
    .line 17
    check-cast p1, Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 23
    .line 24
    if-ne p1, v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const v0, 0x7f040b14

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, v3, La/jg;->i:Landroid/view/View;

    .line 31
    .line 32
    check-cast p1, Landroid/widget/ImageView;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v0, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iget-object p1, v3, La/jg;->i:Landroid/view/View;

    .line 50
    .line 51
    check-cast p1, Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 54
    .line 55
    .line 56
    iget p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 57
    .line 58
    if-ne p0, v2, :cond_3

    .line 59
    .line 60
    iget-object p0, v3, La/jg;->i:Landroid/view/View;

    .line 61
    .line 62
    check-cast p0, Landroid/widget/ImageView;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    return-void
.end method

.method private final setUpdateIconType(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setUpUpdateIcon(I)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->x:I

    .line 5
    .line 6
    return-void
.end method

.method public static final u(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Landroid/content/Context;Landroid/content/res/TypedArray;)Lkotlin/Unit;
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    iget v1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 6
    .line 7
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-direct {p0, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setAccountTitleType(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-direct {p0, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setBackgroundType(I)V

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-direct {p0, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setSeparatorVisible(Z)V

    .line 38
    .line 39
    .line 40
    const/16 v2, 0xd

    .line 41
    .line 42
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-direct {p0, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setUpdateFivefoldIconStyle(I)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 50
    .line 51
    iget-object v4, v2, La/jg;->m:Landroid/view/View;

    .line 52
    .line 53
    check-cast v4, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 54
    .line 55
    const/16 v5, 0xb

    .line 56
    .line 57
    iget v6, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->t:I

    .line 58
    .line 59
    invoke-virtual {p2, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit/components/buttons/DsButton;->d(I)V

    .line 64
    .line 65
    .line 66
    const/4 v4, 0x3

    .line 67
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-direct {p0, v4}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setAccountValueTextStyle(I)V

    .line 72
    .line 73
    .line 74
    const/16 v4, 0xe

    .line 75
    .line 76
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-direct {p0, v4}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setUpdateIconType(I)V

    .line 81
    .line 82
    .line 83
    const/16 v4, 0x9

    .line 84
    .line 85
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-direct {p0, v4}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setRemoveAccountDescriptionStartPadding(Z)V

    .line 90
    .line 91
    .line 92
    const/16 v4, 0x8

    .line 93
    .line 94
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-direct {p0, v1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setRemoveAccountDescriptionEndPadding(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const v4, 0x7f07072d

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    const/4 v4, 0x7

    .line 113
    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    const/4 v5, 0x6

    .line 118
    invoke-virtual {p2, v5, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    iget-object v2, v2, La/jg;->i:Landroid/view/View;

    .line 123
    .line 124
    check-cast v2, Landroid/widget/ImageView;

    .line 125
    .line 126
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    if-eqz v5, :cond_3

    .line 131
    .line 132
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 133
    .line 134
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    iget v7, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->x:I

    .line 139
    .line 140
    if-ne v7, v0, :cond_0

    .line 141
    .line 142
    const v0, 0x7f070706

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    const v0, 0x7f07070c

    .line 147
    .line 148
    .line 149
    :goto_0
    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    iput v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 154
    .line 155
    iput v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 156
    .line 157
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 164
    .line 165
    .line 166
    const/16 v0, 0xc

    .line 167
    .line 168
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {p2, p1, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-eqz v0, :cond_1

    .line 177
    .line 178
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setTopUpButtonTitle(Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-static {p2, p1, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p1, :cond_2

    .line 190
    .line 191
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setAccountTitle(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :cond_3
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 198
    .line 199
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const/4 p0, 0x0

    .line 203
    return-object p0
.end method

.method public static v(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lkotlin/jvm/functions/Function0;I)V
    .locals 3

    .line 1
    sget-object v0, La/ivb0;->b:La/ymx;

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    move p2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p2, v2

    .line 12
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, La/jg;->g:Landroid/view/View;

    .line 20
    .line 21
    check-cast p0, Landroidx/constraintlayout/helper/widget/Flow;

    .line 22
    .line 23
    new-instance p2, La/cjl;

    .line 24
    .line 25
    invoke-direct {p2, p1, v1}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0, p2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object p0, p0, La/jg;->g:Landroid/view/View;

    .line 33
    .line 34
    check-cast p0, Landroidx/constraintlayout/helper/widget/Flow;

    .line 35
    .line 36
    new-instance p2, La/cjl;

    .line 37
    .line 38
    invoke-direct {p2, p1, v2}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v0, p2}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static w(Landroid/view/View;I)V
    .locals 1

    .line 1
    const v0, 0x7f080e67

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static z(Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    sget-object v0, La/ivb0;->b:La/ymx;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1, p1}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->y(La/ymx;ZLkotlin/jvm/functions/Function0;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final A(La/ymx;Lkotlin/jvm/functions/Function0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 5
    .line 6
    iget-object v0, v0, La/jg;->k:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Landroid/widget/FrameLayout;

    .line 9
    .line 10
    new-instance v1, La/ngh;

    .line 11
    .line 12
    const/16 v2, 0x19

    .line 13
    .line 14
    invoke-direct {v1, p2, p0, v2}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, p1, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setAccountTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 5
    .line 6
    iget-object p0, p0, La/jg;->c:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setColorType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 2
    .line 3
    return-void
.end method

.method public final setStyle(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, La/bqd0;->d:[I

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->y:La/ngh;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/ngh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setTopUpButtonTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 5
    .line 6
    iget-object p0, p0, La/jg;->m:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p1, " "

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 28
    .line 29
    iget-object v1, v0, La/jg;->b:Landroid/widget/TextView;

    .line 30
    .line 31
    iget-object v0, v0, La/jg;->b:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget v1, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->u:I

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    if-ne v1, v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const v2, 0x7f040b5f

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 56
    .line 57
    .line 58
    :cond_0
    new-instance v1, La/b1;

    .line 59
    .line 60
    const/16 v2, 0xe

    .line 61
    .line 62
    invoke-direct {v1, p0, p2, p1, v2}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final y(La/ymx;ZLkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->q:La/jg;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/jg;->m:Landroid/view/View;

    .line 9
    .line 10
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 11
    .line 12
    new-instance p2, La/cjl;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    invoke-direct {p2, p3, v0}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1, p2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p0, p0, La/jg;->m:Landroid/view/View;

    .line 23
    .line 24
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 25
    .line 26
    new-instance p2, La/cjl;

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    invoke-direct {p2, p3, v0}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, p1, p2}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 33
    .line 34
    .line 35
    return-void
.end method
