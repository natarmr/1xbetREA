.class public final Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/mc50;


# static fields
.field public static final synthetic l:I


# instance fields
.field public a:Z

.field public final b:La/oiz;

.field public final c:La/bcg0;

.field public final d:La/wf40;

.field public final e:Landroid/view/View;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public k:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 364
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 15

    .line 1
    move-object/from16 v8, p1

    .line 2
    .line 3
    const/4 v9, 0x2

    .line 4
    and-int/lit8 v0, p3, 0x2

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    move-object v10, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v10, p2

    .line 12
    .line 13
    :goto_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const v0, 0x7f0409db

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v8, v10, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    .line 21
    .line 22
    sget-object v11, La/wc50;->a:La/wc50;

    .line 23
    .line 24
    new-instance v12, La/oiz;

    .line 25
    .line 26
    invoke-direct {v12, v8}, La/oiz;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, La/jmu0;->d()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {v12, v0}, Landroid/view/View;->setId(I)V

    .line 34
    .line 35
    .line 36
    iput-object v12, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 37
    .line 38
    new-instance v13, La/bcg0;

    .line 39
    .line 40
    invoke-direct {v13, v8}, La/bcg0;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, La/jmu0;->d()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {v13, v0}, Landroid/view/View;->setId(I)V

    .line 48
    .line 49
    .line 50
    iput-object v13, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 51
    .line 52
    new-instance v14, La/wf40;

    .line 53
    .line 54
    invoke-direct {v14, v8}, La/wf40;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    const v0, 0x7f0a0491

    .line 58
    .line 59
    .line 60
    invoke-virtual {v14, v0}, Landroid/view/View;->setId(I)V

    .line 61
    .line 62
    .line 63
    new-instance v0, La/k0l;

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    const/16 v7, 0x15

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    const-class v3, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 70
    .line 71
    const-string v4, "onSearchViewExpandedStateChanged"

    .line 72
    .line 73
    const-string v5, "onSearchViewExpandedStateChanged(Z)V"

    .line 74
    .line 75
    move-object v2, p0

    .line 76
    invoke-direct/range {v0 .. v7}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v14, v0}, La/wf40;->setOnSearchViewExpandedStateChangedListener(Lkotlin/jvm/functions/Function1;)V

    .line 80
    .line 81
    .line 82
    iput-object v14, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 83
    .line 84
    new-instance v0, Landroid/view/View;

    .line 85
    .line 86
    invoke-direct {v0, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, La/jmu0;->d()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->e:Landroid/view/View;

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const v3, 0x7f070633

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    iput v1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->f:I

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const v3, 0x7f0706c1

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    iput v1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->g:I

    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const v3, 0x7f0706b7

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    iput v1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->h:I

    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const v3, 0x7f07072d

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    iput v1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->i:I

    .line 149
    .line 150
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const v3, 0x7f0706ea

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    iput v1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->j:I

    .line 162
    .line 163
    new-instance v1, La/ndm;

    .line 164
    .line 165
    const/16 v3, 0x11

    .line 166
    .line 167
    invoke-direct {v1, v3}, La/ndm;-><init>(B)V

    .line 168
    .line 169
    .line 170
    iput-object v1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->k:Lkotlin/jvm/functions/Function0;

    .line 171
    .line 172
    const-string v1, "DsNavigationBar"

    .line 173
    .line 174
    invoke-virtual {p0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    sget-object v1, La/bqd0;->i:[I

    .line 178
    .line 179
    const/4 v3, 0x0

    .line 180
    invoke-virtual {v8, v10, v1, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    const/4 v4, 0x4

    .line 185
    invoke-virtual {v1, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    const/4 v5, 0x1

    .line 190
    if-eqz v4, :cond_3

    .line 191
    .line 192
    if-eq v4, v5, :cond_2

    .line 193
    .line 194
    if-eq v4, v9, :cond_1

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_1
    sget-object v11, La/wc50;->c:La/wc50;

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_2
    sget-object v11, La/wc50;->b:La/wc50;

    .line 201
    .line 202
    :cond_3
    :goto_1
    const/4 v4, 0x5

    .line 203
    invoke-static {v4, v8, v1}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-virtual {p0, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v14, v11}, La/wf40;->setNavigationBarStyle(La/wc50;)V

    .line 211
    .line 212
    .line 213
    const/16 v6, 0xb

    .line 214
    .line 215
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-static {v1, v8, v6}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    const-string v7, ""

    .line 224
    .line 225
    if-nez v6, :cond_4

    .line 226
    .line 227
    move-object v6, v7

    .line 228
    :cond_4
    invoke-virtual {p0, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    const/16 v6, 0xc

    .line 232
    .line 233
    const v9, 0x7f040b0b

    .line 234
    .line 235
    .line 236
    invoke-static {v9, v8}, La/m5d;->b(ILandroid/content/Context;)I

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    invoke-virtual {v1, v6, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    invoke-virtual {p0, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitleColor(I)V

    .line 245
    .line 246
    .line 247
    const v6, 0x7f040b17

    .line 248
    .line 249
    .line 250
    invoke-static {v6, v8}, La/m5d;->b(ILandroid/content/Context;)I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    const/4 v10, 0x6

    .line 255
    invoke-virtual {v1, v10, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    invoke-virtual {p0, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setSeparatorColor(I)V

    .line 260
    .line 261
    .line 262
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-static {v1, v6}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    if-eqz v6, :cond_5

    .line 271
    .line 272
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    invoke-virtual {p0, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarBackground(I)V

    .line 277
    .line 278
    .line 279
    :cond_5
    const/16 v6, 0x8

    .line 280
    .line 281
    invoke-virtual {v1, v6, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    invoke-virtual {p0, v10}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitleIconVisible(Z)V

    .line 286
    .line 287
    .line 288
    const/16 v10, 0x9

    .line 289
    .line 290
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    invoke-static {v1, v8, v10}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    if-nez v10, :cond_6

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_6
    move-object v7, v10

    .line 302
    :goto_2
    invoke-virtual {p0, v7}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 303
    .line 304
    .line 305
    const/4 v7, 0x7

    .line 306
    invoke-virtual {v1, v7, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-eqz v7, :cond_7

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_7
    move v3, v6

    .line 314
    :goto_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 315
    .line 316
    .line 317
    invoke-static {v4, v8, v1}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    if-nez v3, :cond_8

    .line 322
    .line 323
    invoke-static {v9, v8}, La/m5d;->b(ILandroid/content/Context;)I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    :cond_8
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setBackIconColor(Landroid/content/res/ColorStateList;)V

    .line 335
    .line 336
    .line 337
    invoke-static {v9, v8}, La/m5d;->b(ILandroid/content/Context;)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitleChevronColor(I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p0, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {p0, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 361
    .line 362
    .line 363
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)La/e1i;
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/bcg0;->d:La/acg0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/acg0;->e:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, La/e1i;

    .line 29
    .line 30
    invoke-virtual {v1}, La/e1i;->getButtonIconId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    :goto_0
    check-cast v0, La/e1i;

    .line 43
    .line 44
    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/bcg0;->d:La/acg0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/acg0;->e:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, La/e1i;

    .line 29
    .line 30
    invoke-virtual {v1}, La/e1i;->getButtonIconId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    :goto_0
    check-cast v0, La/e1i;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/16 p0, 0x8

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    iget-object p0, p0, La/bcg0;->d:La/acg0;

    .line 4
    .line 5
    iget-object p0, p0, La/acg0;->e:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/e1i;

    .line 22
    .line 23
    const/16 v1, 0x8

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public final e(Lkotlin/jvm/functions/Function1;)V
    .locals 5

    .line 1
    new-instance v0, La/ynk;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, La/ynk;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/wf40;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 14
    .line 15
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v3, La/np30;

    .line 28
    .line 29
    const/4 v4, 0x6

    .line 30
    invoke-direct {v3, p0, v4}, La/np30;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance p0, La/dfd0;

    .line 37
    .line 38
    invoke-direct {p0, v3, v2}, La/dfd0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance p1, La/jt6;

    .line 49
    .line 50
    const/16 v1, 0xa

    .line 51
    .line 52
    invoke-direct {p1, v0, v1}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final f(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, La/bcg0;->d:La/acg0;

    .line 6
    .line 7
    iget-object p1, p0, La/acg0;->e:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v0, p0, La/acg0;->h:La/e1i;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, La/acg0;->h:La/e1i;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, La/acg0;->f:Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v0, p0, La/acg0;->g:La/hc50;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, La/acg0;->h:La/e1i;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, La/acg0;->c:Z

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :cond_1
    invoke-virtual {p0}, La/bcg0;->a()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/bcg0;->d:La/acg0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/acg0;->e:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, La/e1i;

    .line 29
    .line 30
    invoke-virtual {v1}, La/e1i;->getButtonIconId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    :goto_0
    check-cast v0, La/e1i;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method

.method public final getForceExitEnable()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->a:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getLeftContainerWidth$uikit()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getNavigationBarWidth$uikit()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final getRightContainerActualWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/bcg0;->getButtonsActualWidth()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getRightContainerWidth$uikit()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getSubTitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0}, La/wf40;->getSubTitle()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0}, La/wf40;->getTitle()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 10

    .line 1
    sub-int v6, p4, p2

    .line 2
    .line 3
    sub-int v7, p5, p3

    .line 4
    .line 5
    iget-object v8, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 6
    .line 7
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    div-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    div-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    sub-int v1, v0, v1

    .line 24
    .line 25
    add-int v3, v1, v2

    .line 26
    .line 27
    iget-object v4, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    move-object v5, p0

    .line 31
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 32
    .line 33
    .line 34
    iget-object v9, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 35
    .line 36
    invoke-virtual {v9}, La/bcg0;->getSearchFieldOpenedState()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v9}, La/bcg0;->getButtonsActualWidth()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sub-int/2addr v1, v0

    .line 56
    add-int v2, v1, v0

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    div-int/lit8 v0, v0, 0x2

    .line 63
    .line 64
    iget v3, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->h:I

    .line 65
    .line 66
    div-int/lit8 v4, v3, 0x2

    .line 67
    .line 68
    sub-int/2addr v0, v4

    .line 69
    add-int/2addr v3, v0

    .line 70
    iget-object v4, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 71
    .line 72
    move v5, v1

    .line 73
    move v1, v0

    .line 74
    move v0, v5

    .line 75
    move-object v5, p0

    .line 76
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const/4 v1, 0x1

    .line 84
    if-ne v0, v1, :cond_1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    const/4 v1, 0x0

    .line 88
    :goto_1
    if-eqz v1, :cond_2

    .line 89
    .line 90
    invoke-virtual {v9}, Landroid/view/View;->getRight()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v8}, Landroid/view/View;->getRight()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    :goto_2
    if-eqz v1, :cond_3

    .line 100
    .line 101
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    invoke-virtual {v9}, Landroid/view/View;->getLeft()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    :goto_3
    iget-object v2, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    sub-int/2addr v1, v0

    .line 121
    sub-int/2addr v1, v3

    .line 122
    div-int/lit8 v1, v1, 0x2

    .line 123
    .line 124
    add-int/2addr v1, v0

    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    sub-int/2addr v0, v4

    .line 130
    div-int/lit8 v0, v0, 0x2

    .line 131
    .line 132
    add-int/2addr v3, v1

    .line 133
    add-int/2addr v4, v0

    .line 134
    invoke-virtual {v2, v1, v0, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 135
    .line 136
    .line 137
    iget v0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->f:I

    .line 138
    .line 139
    sub-int v3, v7, v0

    .line 140
    .line 141
    iget-object v4, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->e:Landroid/view/View;

    .line 142
    .line 143
    const/4 v0, 0x0

    .line 144
    move-object v5, p0

    .line 145
    move v2, v6

    .line 146
    move v1, v7

    .line 147
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->i:I

    .line 6
    .line 7
    iget v1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->g:I

    .line 8
    .line 9
    sub-int v0, v1, v0

    .line 10
    .line 11
    iget-object v2, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/high16 v4, 0x40000000    # 2.0f

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    iget-object v3, v2, La/oiz;->b:Landroid/view/View;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v0

    .line 31
    :goto_0
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {v2, v3, v0}, Landroid/view/View;->measure(II)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v3, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->j:I

    .line 47
    .line 48
    add-int/2addr v0, v3

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    sub-int/2addr v3, v0

    .line 54
    const/high16 v0, -0x80000000

    .line 55
    .line 56
    invoke-static {v3, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget v3, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->h:I

    .line 61
    .line 62
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    iget-object v6, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 67
    .line 68
    invoke-virtual {v6, v0, v5}, Landroid/view/View;->measure(II)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v2, v6, La/bcg0;->c:Landroid/view/View;

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    goto :goto_4

    .line 84
    :cond_2
    invoke-virtual {v6}, La/bcg0;->getButtonsActualWidth()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-lez v2, :cond_7

    .line 89
    .line 90
    iget-object v2, v6, La/bcg0;->d:La/acg0;

    .line 91
    .line 92
    invoke-virtual {v2}, La/acg0;->getVisibleButtons()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    const/4 v8, 0x1

    .line 101
    if-eq v7, v8, :cond_3

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, La/e1i;

    .line 109
    .line 110
    iget-object v2, v2, La/acg0;->f:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_5

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    move-object v9, v7

    .line 127
    check-cast v9, La/hc50;

    .line 128
    .line 129
    iget-object v9, v9, La/hc50;->a:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v5}, La/e1i;->getButtonIconId()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_4

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    const/4 v7, 0x0

    .line 143
    :goto_1
    check-cast v7, La/hc50;

    .line 144
    .line 145
    if-eqz v7, :cond_6

    .line 146
    .line 147
    iget-boolean v2, v7, La/hc50;->k:Z

    .line 148
    .line 149
    if-ne v2, v8, :cond_6

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    :goto_2
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    goto :goto_4

    .line 157
    :cond_7
    :goto_3
    invoke-virtual {v6}, La/bcg0;->getSearchFieldOpenedState()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_8

    .line 162
    .line 163
    const/4 v2, 0x0

    .line 164
    goto :goto_4

    .line 165
    :cond_8
    move v2, v3

    .line 166
    :goto_4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    sub-int/2addr v5, v0

    .line 171
    sub-int/2addr v5, v2

    .line 172
    invoke-static {v5, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    iget-object v3, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 181
    .line 182
    invoke-virtual {v3, v0, v2}, Landroid/view/View;->measure(II)V

    .line 183
    .line 184
    .line 185
    invoke-static {p1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    iget v2, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->f:I

    .line 190
    .line 191
    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    iget-object v3, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->e:Landroid/view/View;

    .line 196
    .line 197
    invoke-virtual {v3, v0, v2}, Landroid/view/View;->measure(II)V

    .line 198
    .line 199
    .line 200
    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method public final setBackIconAlpha(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/oiz;->setBackIconAlpha(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setBackIconColor(I)V
    .locals 0

    .line 10
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    invoke-virtual {p0, p1}, La/oiz;->setBackIconTint(I)V

    return-void
.end method

.method public setBackIconColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/oiz;->setBackIconTint(Landroid/content/res/ColorStateList;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setCursorOnSearchFiledVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setCursorOnSearchFiledVisible(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setForceExitEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->a:Z

    .line 2
    .line 3
    return-void
.end method

.method public setNavigationBarBackground(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setNavigationBarButtons(Ljava/util/ArrayList;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La/hc50;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    new-instance v1, La/ntl;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, v0, v2}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/j6g0;

    .line 16
    .line 17
    const/16 v3, 0x9

    .line 18
    .line 19
    invoke-direct {v2, v3}, La/j6g0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    iget-object v4, v0, La/bcg0;->d:La/acg0;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 36
    .line 37
    .line 38
    new-instance v0, La/mjf0;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {v0, v3}, La/mjf0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v3, p1

    .line 45
    .line 46
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v3, v4, La/acg0;->f:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    iget-object v6, v4, La/acg0;->e:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_8

    .line 72
    .line 73
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v3, v0

    .line 78
    check-cast v3, La/hc50;

    .line 79
    .line 80
    new-instance v8, La/e1i;

    .line 81
    .line 82
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-direct {v8, v0}, La/e1i;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v3, La/hc50;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v8, v0}, La/e1i;->setButtonIconId(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v3, La/hc50;->b:La/ybg0;

    .line 98
    .line 99
    invoke-virtual {v8, v0}, La/e1i;->setNavigationBarButtonStyle(La/ybg0;)V

    .line 100
    .line 101
    .line 102
    iget v0, v3, La/hc50;->c:I

    .line 103
    .line 104
    invoke-virtual {v8, v0}, La/e1i;->setNavigationBarButtonImageResource(I)V

    .line 105
    .line 106
    .line 107
    iget-boolean v0, v3, La/hc50;->f:Z

    .line 108
    .line 109
    invoke-virtual {v8, v0}, La/e1i;->setNavigationBarButtonAlpha(Z)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v3, La/hc50;->j:La/i8m0;

    .line 113
    .line 114
    iget v5, v8, La/e1i;->f:I

    .line 115
    .line 116
    iget v9, v8, La/e1i;->g:I

    .line 117
    .line 118
    iget-object v10, v8, La/e1i;->k:La/if5;

    .line 119
    .line 120
    if-eqz v0, :cond_0

    .line 121
    .line 122
    invoke-virtual {v10, v0, v9, v5}, La/if5;->d(La/i8m0;II)V

    .line 123
    .line 124
    .line 125
    :cond_0
    iget-object v0, v3, La/hc50;->g:La/vf5;

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    sget-object v11, La/vf5;->i:La/vf5;

    .line 130
    .line 131
    sget-object v12, La/vf5;->h:La/vf5;

    .line 132
    .line 133
    filled-new-array {v11, v12}, [La/vf5;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    invoke-static {v11}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    sget-object v12, La/vf5;->e:La/vf5;

    .line 142
    .line 143
    sget-object v13, La/vf5;->f:La/vf5;

    .line 144
    .line 145
    sget-object v14, La/vf5;->g:La/vf5;

    .line 146
    .line 147
    sget-object v15, La/vf5;->j:La/vf5;

    .line 148
    .line 149
    move-object/from16 v16, v1

    .line 150
    .line 151
    sget-object v1, La/vf5;->k:La/vf5;

    .line 152
    .line 153
    filled-new-array {v12, v13, v14, v15, v1}, [La/vf5;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v11, Ljava/lang/Iterable;

    .line 162
    .line 163
    invoke-static {v11, v0}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    if-eqz v11, :cond_1

    .line 168
    .line 169
    iget v1, v8, La/e1i;->h:I

    .line 170
    .line 171
    invoke-virtual {v10, v0, v1, v5}, La/if5;->c(La/vf5;II)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_1
    check-cast v1, Ljava/lang/Iterable;

    .line 176
    .line 177
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_2

    .line 182
    .line 183
    invoke-virtual {v10, v0, v9, v5}, La/if5;->c(La/vf5;II)V

    .line 184
    .line 185
    .line 186
    iget v0, v8, La/e1i;->i:I

    .line 187
    .line 188
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    iput-object v1, v10, La/if5;->g:Ljava/lang/Integer;

    .line 193
    .line 194
    iget-object v1, v10, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 195
    .line 196
    if-eqz v1, :cond_4

    .line 197
    .line 198
    iget-object v1, v1, Lorg/xplatform/uikit/components/badges/DsBadge;->d:La/k14;

    .line 199
    .line 200
    invoke-virtual {v1, v0}, La/k14;->e(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_2
    invoke-virtual {v10, v0}, La/if5;->a(La/vf5;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_3
    move-object/from16 v16, v1

    .line 209
    .line 210
    :cond_4
    :goto_1
    iget-object v0, v3, La/hc50;->i:La/r0m;

    .line 211
    .line 212
    if-eqz v0, :cond_5

    .line 213
    .line 214
    invoke-virtual {v8, v0}, La/e1i;->setCounterStyle(La/r0m;)V

    .line 215
    .line 216
    .line 217
    :cond_5
    iget-object v0, v3, La/hc50;->h:Ljava/lang/Integer;

    .line 218
    .line 219
    if-eqz v0, :cond_6

    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v8, v0}, La/e1i;->setCount(Ljava/lang/Integer;)V

    .line 230
    .line 231
    .line 232
    :cond_6
    iget-boolean v0, v3, La/hc50;->e:Z

    .line 233
    .line 234
    invoke-virtual {v8, v0}, Landroid/view/View;->setClickable(Z)V

    .line 235
    .line 236
    .line 237
    iget-boolean v0, v3, La/hc50;->k:Z

    .line 238
    .line 239
    if-eqz v0, :cond_7

    .line 240
    .line 241
    iput-object v3, v4, La/acg0;->g:La/hc50;

    .line 242
    .line 243
    iput-object v8, v4, La/acg0;->h:La/e1i;

    .line 244
    .line 245
    new-instance v0, La/zbg0;

    .line 246
    .line 247
    const/4 v5, 0x0

    .line 248
    move-object/from16 v1, v16

    .line 249
    .line 250
    invoke-direct/range {v0 .. v5}, La/zbg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8, v0}, La/e1i;->setOnNavigationBarButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    iget-object v0, v3, La/hc50;->d:Lkotlin/jvm/functions/Function0;

    .line 258
    .line 259
    invoke-virtual {v8, v0}, La/e1i;->setOnNavigationBarButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 260
    .line 261
    .line 262
    :goto_2
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v1, v16

    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_8
    return-void
.end method

.method public setNavigationBarButtonsBackgroundsColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 7
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    invoke-virtual {p0, p1}, La/bcg0;->setButtonsBackgroundsColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setNavigationBarButtonsBackgroundsColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/bcg0;->setButtonsBackgroundsColor(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/bcg0;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setNavigationBarDrawableBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setNavigationBarStyle(La/wc50;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/wf40;->setNavigationBarStyle(La/wc50;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnHideSearchBarClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->k:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public setOnSearchViewExpandedStateChangedListener(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/dpl;

    .line 5
    .line 6
    const/16 v1, 0xe

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, v1}, La/dpl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, La/wf40;->setOnSearchViewExpandedStateChangedListener(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setOnTitlesClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/unl;

    .line 5
    .line 6
    const/16 v1, 0x11

    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, La/unl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, La/wf40;->setOnTitlesClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setSearchFieldHint(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setSearchFieldHint(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSearchFieldText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setSearchFieldText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSeparatorColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->e:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSubTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/wf40;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSubTitleColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setSubTitleColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSubtitleVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setSubTitleVisible(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 5
    .line 6
    iget-object v0, p0, La/wf40;->i:La/yrb0;

    .line 7
    .line 8
    iget-object v1, p0, La/wf40;->h:La/ssq0;

    .line 9
    .line 10
    iget-object v2, p0, La/wf40;->j:La/q4n0;

    .line 11
    .line 12
    iget-object v3, p0, La/wf40;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/wf40;->b:La/wc50;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/16 v4, 0x8

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz p0, :cond_4

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    if-eq p0, v1, :cond_2

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    if-ne p0, v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v4, v5

    .line 42
    :goto_0
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, La/q4n0;->setTitleText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move v4, v5

    .line 61
    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, La/yrb0;->setTitleText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    move v4, v5

    .line 76
    :goto_2
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p1}, La/ssq0;->setTitle(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public setTitleChevronColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setTitleChevronColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTitleChevronColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 7
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    invoke-virtual {p0, p1}, La/wf40;->setTitleChevronColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTitleColor(I)V
    .locals 0

    .line 10
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    invoke-virtual {p0, p1}, La/wf40;->setTitleColor(I)V

    return-void
.end method

.method public final setTitleColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/wf40;->setTitleColor(Landroid/content/res/ColorStateList;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setTitleIconVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setTitleIconVisible(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitleLinesCount(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setMaxLines(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitleVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/wf40;->setTitleVisible(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
