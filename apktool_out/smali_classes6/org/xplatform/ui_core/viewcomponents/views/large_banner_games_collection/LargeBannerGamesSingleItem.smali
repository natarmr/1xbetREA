.class public final Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic l:I


# instance fields
.field public final a:La/n0o0;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final h:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final i:Landroid/widget/TextView;

.field public final j:La/n0o0;

.field public k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 344
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 343
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    const/4 v4, 0x0

    .line 18
    invoke-direct {v0, v1, v3, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    .line 20
    .line 21
    new-instance v3, La/qvy;

    .line 22
    .line 23
    invoke-direct {v3, v0, v4}, La/qvy;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iput-object v3, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->a:La/n0o0;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const v5, 0x7f0706f8

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iput v3, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->b:I

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const v5, 0x7f070712

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iput v3, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->c:I

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const v5, 0x7f0706d1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    iput v3, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->d:I

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const v5, 0x7f0706b5

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    iput v3, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->e:I

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const v5, 0x7f0705c9

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const v6, 0x7f070752

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const v7, 0x7f0704be

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    iput v6, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->f:I

    .line 118
    .line 119
    new-instance v6, La/daf;

    .line 120
    .line 121
    invoke-direct {v6}, La/daf;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v3}, La/daf;->S(F)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, La/daf;->c()La/akj0;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    new-instance v7, La/wgg0;

    .line 132
    .line 133
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 134
    .line 135
    .line 136
    new-instance v8, La/wgg0;

    .line 137
    .line 138
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    new-instance v9, La/q0;

    .line 142
    .line 143
    const/4 v10, 0x0

    .line 144
    invoke-direct {v9, v10}, La/q0;-><init>(F)V

    .line 145
    .line 146
    .line 147
    new-instance v11, La/q0;

    .line 148
    .line 149
    invoke-direct {v11, v10}, La/q0;-><init>(F)V

    .line 150
    .line 151
    .line 152
    new-instance v10, La/ujn;

    .line 153
    .line 154
    invoke-direct {v10, v4}, La/ujn;-><init>(B)V

    .line 155
    .line 156
    .line 157
    new-instance v12, La/ujn;

    .line 158
    .line 159
    invoke-direct {v12, v4}, La/ujn;-><init>(B)V

    .line 160
    .line 161
    .line 162
    new-instance v13, La/ujn;

    .line 163
    .line 164
    invoke-direct {v13, v4}, La/ujn;-><init>(B)V

    .line 165
    .line 166
    .line 167
    new-instance v14, La/ujn;

    .line 168
    .line 169
    invoke-direct {v14, v4}, La/ujn;-><init>(B)V

    .line 170
    .line 171
    .line 172
    invoke-static {v4}, La/k7x;->A(I)La/qzb;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    new-instance v2, La/q0;

    .line 177
    .line 178
    invoke-direct {v2, v3}, La/q0;-><init>(F)V

    .line 179
    .line 180
    .line 181
    move/from16 p2, v4

    .line 182
    .line 183
    invoke-static/range {p2 .. p2}, La/k7x;->A(I)La/qzb;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    move/from16 p3, v5

    .line 188
    .line 189
    new-instance v5, La/q0;

    .line 190
    .line 191
    invoke-direct {v5, v3}, La/q0;-><init>(F)V

    .line 192
    .line 193
    .line 194
    new-instance v3, La/akj0;

    .line 195
    .line 196
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 197
    .line 198
    .line 199
    iput-object v7, v3, La/akj0;->a:La/qzb;

    .line 200
    .line 201
    iput-object v8, v3, La/akj0;->b:La/qzb;

    .line 202
    .line 203
    iput-object v4, v3, La/akj0;->c:La/qzb;

    .line 204
    .line 205
    iput-object v15, v3, La/akj0;->d:La/qzb;

    .line 206
    .line 207
    iput-object v9, v3, La/akj0;->e:La/dne;

    .line 208
    .line 209
    iput-object v11, v3, La/akj0;->f:La/dne;

    .line 210
    .line 211
    iput-object v5, v3, La/akj0;->g:La/dne;

    .line 212
    .line 213
    iput-object v2, v3, La/akj0;->h:La/dne;

    .line 214
    .line 215
    iput-object v10, v3, La/akj0;->i:La/ujn;

    .line 216
    .line 217
    iput-object v12, v3, La/akj0;->j:La/ujn;

    .line 218
    .line 219
    iput-object v13, v3, La/akj0;->k:La/ujn;

    .line 220
    .line 221
    iput-object v14, v3, La/akj0;->l:La/ujn;

    .line 222
    .line 223
    new-instance v2, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 224
    .line 225
    invoke-direct {v2, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v6}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 229
    .line 230
    .line 231
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    iput-object v2, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->g:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 240
    .line 241
    new-instance v2, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 242
    .line 243
    invoke-direct {v2, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 244
    .line 245
    .line 246
    const v5, 0x7f08030e

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v5}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v3}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 259
    .line 260
    .line 261
    iput-object v2, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->h:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 262
    .line 263
    new-instance v2, Landroid/widget/TextView;

    .line 264
    .line 265
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 266
    .line 267
    .line 268
    const v3, 0x7f1404ab

    .line 269
    .line 270
    .line 271
    invoke-static {v3, v2}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 272
    .line 273
    .line 274
    move/from16 v4, p2

    .line 275
    .line 276
    move/from16 v3, p3

    .line 277
    .line 278
    invoke-virtual {v2, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 279
    .line 280
    .line 281
    const v3, 0x7f040b5f

    .line 282
    .line 283
    .line 284
    invoke-static {v3, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 289
    .line 290
    .line 291
    const/4 v1, 0x2

    .line 292
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 293
    .line 294
    .line 295
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 296
    .line 297
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 298
    .line 299
    .line 300
    invoke-static {}, La/by7;->c()La/by7;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    iget-boolean v1, v1, La/by7;->a:Z

    .line 305
    .line 306
    if-eqz v1, :cond_1

    .line 307
    .line 308
    const v1, 0x800005

    .line 309
    .line 310
    .line 311
    goto :goto_1

    .line 312
    :cond_1
    const v1, 0x800003

    .line 313
    .line 314
    .line 315
    :goto_1
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 316
    .line 317
    .line 318
    const/4 v1, 0x3

    .line 319
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v1}, Landroid/view/View;->setTextDirection(I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 326
    .line 327
    .line 328
    iput-object v2, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->i:Landroid/widget/TextView;

    .line 329
    .line 330
    new-instance v1, La/qvy;

    .line 331
    .line 332
    const/4 v2, 0x1

    .line 333
    invoke-direct {v1, v0, v2}, La/qvy;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;B)V

    .line 334
    .line 335
    .line 336
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, v0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->j:La/n0o0;

    .line 341
    .line 342
    return-void
.end method

.method public static final a(Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;La/n0x;La/n0x;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->getBannerImageLoadHelper()La/r0x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/m0x;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x6

    .line 9
    const v4, 0x7f0807c1

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v4, v2, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/pvy;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, p0, p2, v3}, La/pvy;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;La/n0x;B)V

    .line 19
    .line 20
    .line 21
    const/16 p0, 0x8

    .line 22
    .line 23
    invoke-static {v0, p1, v1, v2, p0}, La/r0x;->d(La/r0x;La/o0x;La/m0x;Lkotlin/jvm/functions/Function1;I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final getBannerImageLoadHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->j:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

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

.method private final getScreenWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->a:La/n0o0;

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
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final getLoadedPictureUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v6, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->f:I

    .line 6
    .line 7
    sub-int v2, v0, v6

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->f:I

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->g:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 17
    .line 18
    move-object v5, p0

    .line 19
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->d:I

    .line 27
    .line 28
    sub-int v1, v0, v1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sub-int v2, v0, v6

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iget v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->f:I

    .line 41
    .line 42
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->h:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 43
    .line 44
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->b:I

    .line 52
    .line 53
    move v2, v0

    .line 54
    add-int v0, v6, v1

    .line 55
    .line 56
    mul-int/lit8 v3, v0, 0x2

    .line 57
    .line 58
    sub-int/2addr v2, v3

    .line 59
    const/16 v3, 0x1fc

    .line 60
    .line 61
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->i:Landroid/widget/TextView;

    .line 62
    .line 63
    invoke-static {v4, v2, v3}, La/xdx;->H(Landroid/widget/TextView;II)Landroid/text/StaticLayout;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    sub-int/2addr v3, v1

    .line 76
    sub-int/2addr v3, v2

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    sub-int/2addr v2, v6

    .line 82
    sub-int/2addr v2, v1

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    sub-int/2addr v6, v1

    .line 88
    move v1, v3

    .line 89
    move v3, v6

    .line 90
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->f:I

    .line 6
    .line 7
    mul-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    sub-int/2addr p1, v0

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->e:I

    .line 19
    .line 20
    if-gt v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->getScreenWidth()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    div-int/lit8 p1, p1, 0x2

    .line 36
    .line 37
    :goto_1
    int-to-float v0, p1

    .line 38
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 39
    .line 40
    div-float/2addr v0, v1

    .line 41
    const/high16 v1, 0x40000000    # 2.0f

    .line 42
    .line 43
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    float-to-int v0, v0

    .line 48
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->g:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 53
    .line 54
    invoke-virtual {v4, v2, v3}, Landroid/view/View;->measure(II)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    iget v3, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->d:I

    .line 62
    .line 63
    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->h:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 68
    .line 69
    invoke-virtual {v4, v2, v3}, Landroid/view/View;->measure(II)V

    .line 70
    .line 71
    .line 72
    iget v2, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->c:I

    .line 73
    .line 74
    sub-int v2, p1, v2

    .line 75
    .line 76
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    iget-object v3, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->i:Landroid/widget/TextView;

    .line 86
    .line 87
    invoke-virtual {v3, v1, v2}, Landroid/view/View;->measure(II)V

    .line 88
    .line 89
    .line 90
    mul-int/lit8 p2, p2, 0x2

    .line 91
    .line 92
    add-int/2addr p2, p1

    .line 93
    invoke-virtual {p0, p2, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final setLabel(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->i:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setModel(La/rvy;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/rvy;->d:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->setLabel(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, La/rvy;->b:La/n0x;

    .line 10
    .line 11
    iget-object p1, p1, La/rvy;->c:La/n0x;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->k:Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;->getBannerImageLoadHelper()La/r0x;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, La/m0x;

    .line 21
    .line 22
    const v4, 0x7f0807c1

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x6

    .line 26
    invoke-direct {v3, v4, v1, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/pvy;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct {v1, p0, v0, v4}, La/pvy;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesSingleItem;La/n0x;B)V

    .line 33
    .line 34
    .line 35
    new-instance v4, La/k9v;

    .line 36
    .line 37
    const/16 v5, 0x9

    .line 38
    .line 39
    invoke-direct {v4, p0, p1, v0, v5}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0, v3, v1, v4}, La/r0x;->c(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
