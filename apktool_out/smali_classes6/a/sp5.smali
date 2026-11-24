.class public final La/sp5;
.super La/q4;
.source "SourceFile"


# static fields
.field public static final g:La/ek5;


# instance fields
.field public final f:La/dp5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ek5;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ek5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/sp5;->g:La/ek5;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/dp5;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/sp5;->g:La/ek5;

    .line 5
    .line 6
    invoke-direct {p0, v0}, La/q4;-><init>(La/dtb;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/sp5;->f:La/dp5;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/q4;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/up5;

    .line 6
    .line 7
    iget-object p0, p0, La/up5;->a:La/mq5;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    packed-switch p0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-static {}, La/t9f;->b()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :pswitch_0
    const/4 p0, 0x6

    .line 22
    return p0

    .line 23
    :pswitch_1
    const/16 p0, 0xa

    .line 24
    .line 25
    return p0

    .line 26
    :pswitch_2
    const/16 p0, 0x9

    .line 27
    .line 28
    return p0

    .line 29
    :pswitch_3
    const/16 p0, 0x8

    .line 30
    .line 31
    return p0

    .line 32
    :pswitch_4
    const/4 p0, 0x5

    .line 33
    return p0

    .line 34
    :pswitch_5
    const/4 p0, 0x4

    .line 35
    return p0

    .line 36
    :pswitch_6
    const/4 p0, 0x3

    .line 37
    return p0

    .line 38
    :pswitch_7
    const/4 p0, 0x2

    .line 39
    return p0

    .line 40
    :pswitch_8
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(La/xhe0;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7f07068a

    .line 3
    .line 4
    .line 5
    const v2, 0x7f0706d9

    .line 6
    .line 7
    .line 8
    const v3, 0x7f070644

    .line 9
    .line 10
    .line 11
    const v4, 0x7f0705c6

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x6

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x1

    .line 17
    iget-object p0, p0, La/sp5;->f:La/dp5;

    .line 18
    .line 19
    packed-switch p2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    const-string p0, "Unknown view type "

    .line 23
    .line 24
    invoke-static {p2, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v6

    .line 32
    :pswitch_0
    new-instance p0, La/qp5;

    .line 33
    .line 34
    new-instance p2, La/so5;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x4

    .line 44
    invoke-direct {p2, p1, v6, v0}, La/so5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 72
    .line 73
    invoke-direct {v3, p1, v6, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 77
    .line 78
    invoke-direct {p1, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v3, v2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_1
    new-instance p0, La/qp5;

    .line 95
    .line 96
    new-instance p2, La/so5;

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const/4 v0, 0x2

    .line 106
    invoke-direct {p2, p1, v6, v0}, La/so5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 134
    .line 135
    invoke-direct {v3, p1, v6, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 136
    .line 137
    .line 138
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 139
    .line 140
    invoke-direct {p1, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v3, v2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_2
    new-instance p0, La/qp5;

    .line 157
    .line 158
    new-instance p2, La/ur5;

    .line 159
    .line 160
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-direct {p2, p1, v0}, La/ur5;-><init>(Landroid/content/Context;B)V

    .line 168
    .line 169
    .line 170
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 171
    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_3
    new-instance p0, La/qp5;

    .line 175
    .line 176
    new-instance p2, La/so5;

    .line 177
    .line 178
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-direct {p2, p1, v6, v7}, La/so5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    const v2, 0x7f070639

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 216
    .line 217
    invoke-direct {v3, p1, v6, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 218
    .line 219
    .line 220
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 221
    .line 222
    invoke-direct {p1, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v3, v2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 235
    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_4
    sget-object p2, La/rp5;->a:[I

    .line 239
    .line 240
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    aget p0, p2, p0

    .line 245
    .line 246
    const-string p2, "shimmerBanner"

    .line 247
    .line 248
    const v0, 0x7f0705c9

    .line 249
    .line 250
    .line 251
    if-ne p0, v7, :cond_0

    .line 252
    .line 253
    new-instance p0, La/qp5;

    .line 254
    .line 255
    new-instance v1, La/xp5;

    .line 256
    .line 257
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-direct {v1, p1, v6}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    new-instance v4, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 292
    .line 293
    invoke-direct {v4, p1, v6, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 294
    .line 295
    .line 296
    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    .line 297
    .line 298
    invoke-direct {v5, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 302
    .line 303
    .line 304
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 305
    .line 306
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 310
    .line 311
    .line 312
    const v0, 0x7f040b0e

    .line 313
    .line 314
    .line 315
    invoke-static {v0, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    invoke-direct {p0, v1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 336
    .line 337
    .line 338
    return-object p0

    .line 339
    :cond_0
    new-instance p0, La/qp5;

    .line 340
    .line 341
    new-instance v1, La/vp5;

    .line 342
    .line 343
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-direct {v1, p1, v6}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    new-instance v4, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 378
    .line 379
    invoke-direct {v4, p1, v6, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 380
    .line 381
    .line 382
    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    .line 383
    .line 384
    invoke-direct {v5, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    .line 389
    .line 390
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 391
    .line 392
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 396
    .line 397
    .line 398
    const v0, 0x7f040b62

    .line 399
    .line 400
    .line 401
    invoke-static {v0, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 402
    .line 403
    .line 404
    move-result p1

    .line 405
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v4, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 419
    .line 420
    .line 421
    invoke-direct {p0, v1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 422
    .line 423
    .line 424
    return-object p0

    .line 425
    :pswitch_5
    new-instance p0, La/qp5;

    .line 426
    .line 427
    new-instance p2, La/so5;

    .line 428
    .line 429
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-direct {p2, p1, v6, v0}, La/so5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    const v2, 0x7f07065c

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 467
    .line 468
    invoke-direct {v3, p1, v6, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 469
    .line 470
    .line 471
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 472
    .line 473
    invoke-direct {p1, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 477
    .line 478
    .line 479
    invoke-static {v3, v2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 483
    .line 484
    .line 485
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 486
    .line 487
    .line 488
    return-object p0

    .line 489
    :pswitch_6
    sget-object p2, La/rp5;->a:[I

    .line 490
    .line 491
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 492
    .line 493
    .line 494
    move-result p0

    .line 495
    aget p0, p2, p0

    .line 496
    .line 497
    if-ne p0, v7, :cond_1

    .line 498
    .line 499
    new-instance p0, La/qp5;

    .line 500
    .line 501
    new-instance p2, La/yp5;

    .line 502
    .line 503
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-direct {p2, p1}, La/yp5;-><init>(Landroid/content/Context;)V

    .line 511
    .line 512
    .line 513
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 514
    .line 515
    .line 516
    return-object p0

    .line 517
    :cond_1
    new-instance p0, La/qp5;

    .line 518
    .line 519
    new-instance p2, La/wp5;

    .line 520
    .line 521
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    invoke-direct {p2, p1}, La/wp5;-><init>(Landroid/content/Context;)V

    .line 529
    .line 530
    .line 531
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 532
    .line 533
    .line 534
    return-object p0

    .line 535
    :pswitch_7
    new-instance p0, La/qp5;

    .line 536
    .line 537
    new-instance p2, La/so5;

    .line 538
    .line 539
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    const/4 v0, 0x5

    .line 547
    invoke-direct {p2, p1, v6, v0}, La/so5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 575
    .line 576
    invoke-direct {v3, p1, v6, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 577
    .line 578
    .line 579
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 580
    .line 581
    invoke-direct {p1, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 585
    .line 586
    .line 587
    invoke-static {v3, v2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 591
    .line 592
    .line 593
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 594
    .line 595
    .line 596
    return-object p0

    .line 597
    :pswitch_8
    new-instance p0, La/qp5;

    .line 598
    .line 599
    new-instance p2, La/so5;

    .line 600
    .line 601
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 602
    .line 603
    .line 604
    move-result-object p1

    .line 605
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    const/4 v0, 0x3

    .line 609
    invoke-direct {p2, p1, v6, v0}, La/so5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 633
    .line 634
    .line 635
    move-result v2

    .line 636
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 637
    .line 638
    invoke-direct {v3, p1, v6, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 639
    .line 640
    .line 641
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 642
    .line 643
    invoke-direct {p1, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v3, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 647
    .line 648
    .line 649
    invoke-static {v3, v2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {p2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 653
    .line 654
    .line 655
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 656
    .line 657
    .line 658
    return-object p0

    .line 659
    :pswitch_9
    new-instance p0, La/qp5;

    .line 660
    .line 661
    new-instance p2, La/ur5;

    .line 662
    .line 663
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 664
    .line 665
    .line 666
    move-result-object p1

    .line 667
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-direct {p2, p1, v7}, La/ur5;-><init>(Landroid/content/Context;B)V

    .line 671
    .line 672
    .line 673
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 674
    .line 675
    .line 676
    return-object p0

    .line 677
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
