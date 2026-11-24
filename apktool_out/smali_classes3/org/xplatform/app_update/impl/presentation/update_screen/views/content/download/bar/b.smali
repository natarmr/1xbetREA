.class public final Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;

.field public b:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;

.field public c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;

.field public d:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;

.field public e:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;

.field public f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    new-instance p1, La/ucj;

    .line 10
    .line 11
    const/16 v0, 0x17

    .line 12
    .line 13
    invoke-direct {p1, p0, v0}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wez;->b:La/wez;

    .line 17
    .line 18
    invoke-static {v0, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->a:La/a8z;

    .line 23
    .line 24
    const p1, 0x7f0a046e

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final getDownloadBarInflater()La/ecl;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ecl;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setSecondaryLineColor(I)V
    .locals 2

    .line 1
    iget v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 7
    .line 8
    iget-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->b:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->setSecondaryLineColor(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 34
    .line 35
    invoke-static {v1, v0}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->setSecondaryLineColor(Landroid/content/res/ColorStateList;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 49
    .line 50
    invoke-static {v0, p1}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->e:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 68
    .line 69
    invoke-static {p0, v0}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    invoke-virtual {p1, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->setSecondaryLineColor(Landroid/content/res/ColorStateList;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(La/ml3;I)V
    .locals 12

    .line 1
    invoke-direct {p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->getDownloadBarInflater()La/ecl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/ecl;->a:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    instance-of v2, p1, La/ll3;

    .line 8
    .line 9
    const v3, 0x7f040b76

    .line 10
    .line 11
    .line 12
    const v4, 0x7f040b75

    .line 13
    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, -0x1

    .line 17
    const/4 v7, 0x1

    .line 18
    const/4 v8, 0x0

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    const p1, 0x7f0a0f90

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_d

    .line 29
    .line 30
    new-instance p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;-><init>(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const v9, 0x7f0706a9

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-direct {v0, v6, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v7}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->setDynamicThumbRadius(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const v2, 0x7f07066b

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-virtual {v6, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-virtual {p1, v0, v6}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->b(II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {p2, v0}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-eqz v0, :cond_0

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->setSecondaryLineColor(Landroid/content/res/ColorStateList;)V

    .line 109
    .line 110
    .line 111
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->setSecondaryLineHeight(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const v2, 0x7f0601c9

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, Landroid/content/Context;->getColor(I)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    filled-new-array {v0, v0}, [I

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->a([I)V

    .line 142
    .line 143
    .line 144
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v2, v3, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    filled-new-array {v0, v2}, [I

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget-object v2, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->j:[I

    .line 173
    .line 174
    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([I[I)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-nez v2, :cond_1

    .line 179
    .line 180
    iput-object v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->j:[I

    .line 181
    .line 182
    :cond_1
    invoke-static {v8, v8}, Ljava/util/Arrays;->equals([F[F)Z

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v7}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->setThumbWithinSecondaryLineBounds(Z)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_2

    .line 195
    .line 196
    :cond_2
    instance-of v2, p1, La/il3;

    .line 197
    .line 198
    if-eqz v2, :cond_6

    .line 199
    .line 200
    const p1, 0x7f0a02fd

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    if-nez p1, :cond_d

    .line 208
    .line 209
    new-instance p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;

    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-direct {p1, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;-><init>(Landroid/content/Context;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    const v6, 0x7f0706d1

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 237
    .line 238
    invoke-direct {v6, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 239
    .line 240
    .line 241
    const/16 v9, 0x11

    .line 242
    .line 243
    iput v9, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 244
    .line 245
    invoke-virtual {p1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->setViewWidth(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->setViewHeight(I)V

    .line 252
    .line 253
    .line 254
    iget-boolean v0, v0, La/ecl;->b:Z

    .line 255
    .line 256
    if-eqz v0, :cond_3

    .line 257
    .line 258
    sget-object v0, La/njc;->e:La/njc;

    .line 259
    .line 260
    goto :goto_0

    .line 261
    :cond_3
    sget-object v0, La/njc;->d:La/njc;

    .line 262
    .line 263
    :goto_0
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->setStartPosition(La/njc;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v0, p2}, Landroid/content/Context;->getColor(I)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->setSecondaryLineColor(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    const v2, 0x7f0706a8

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->setLinesThickness(F)V

    .line 293
    .line 294
    .line 295
    const/4 v0, 0x2

    .line 296
    new-array v0, v0, [I

    .line 297
    .line 298
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 299
    .line 300
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-static {v2, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    aput v2, v0, v5

    .line 312
    .line 313
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-static {v2, v3, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    aput v2, v0, v7

    .line 325
    .line 326
    new-instance v2, Landroid/graphics/SweepGradient;

    .line 327
    .line 328
    iget v3, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->f:I

    .line 329
    .line 330
    int-to-float v3, v3

    .line 331
    const/high16 v4, 0x40000000    # 2.0f

    .line 332
    .line 333
    div-float/2addr v3, v4

    .line 334
    iget v5, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->e:I

    .line 335
    .line 336
    int-to-float v5, v5

    .line 337
    div-float/2addr v5, v4

    .line 338
    iget-boolean v6, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->a:Z

    .line 339
    .line 340
    if-eqz v6, :cond_4

    .line 341
    .line 342
    invoke-static {v0}, La/tx3;->U([I)[I

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    :cond_4
    invoke-direct {v2, v3, v5, v0, v8}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    .line 347
    .line 348
    .line 349
    new-instance v0, Landroid/graphics/Matrix;

    .line 350
    .line 351
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 352
    .line 353
    .line 354
    if-eqz v6, :cond_5

    .line 355
    .line 356
    move v3, v4

    .line 357
    goto :goto_1

    .line 358
    :cond_5
    const/high16 v3, -0x3cca0000    # -182.0f

    .line 359
    .line 360
    :goto_1
    iget v5, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->f:I

    .line 361
    .line 362
    int-to-float v5, v5

    .line 363
    div-float/2addr v5, v4

    .line 364
    iget v6, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->e:I

    .line 365
    .line 366
    int-to-float v6, v6

    .line 367
    div-float/2addr v6, v4

    .line 368
    invoke-virtual {v0, v3, v5, v6}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 372
    .line 373
    .line 374
    iget-object v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->n:Landroid/graphics/Paint;

    .line 375
    .line 376
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 383
    .line 384
    .line 385
    goto/16 :goto_2

    .line 386
    .line 387
    :cond_6
    instance-of v0, p1, La/jl3;

    .line 388
    .line 389
    const v2, 0x7f0705c9

    .line 390
    .line 391
    .line 392
    if-eqz v0, :cond_9

    .line 393
    .line 394
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    const v0, 0x7f0802f4

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-static {p2, p1}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    if-eqz p1, :cond_7

    .line 417
    .line 418
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 419
    .line 420
    .line 421
    :cond_7
    const p1, 0x7f0a0f8e

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    if-nez p1, :cond_d

    .line 429
    .line 430
    new-instance p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;

    .line 431
    .line 432
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-direct {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;-><init>(Landroid/content/Context;)V

    .line 440
    .line 441
    .line 442
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 443
    .line 444
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    const v9, 0x7f07068c

    .line 453
    .line 454
    .line 455
    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 456
    .line 457
    .line 458
    move-result v7

    .line 459
    invoke-direct {v0, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    invoke-virtual {p1, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;->setPrimaryLineCornersRadius(F)V

    .line 478
    .line 479
    .line 480
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 481
    .line 482
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-static {v0, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    invoke-static {v2, v3, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    filled-new-array {v0, v2}, [I

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    iget-object v2, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;->b:[I

    .line 509
    .line 510
    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([I[I)Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-nez v2, :cond_8

    .line 515
    .line 516
    iput-object v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;->b:[I

    .line 517
    .line 518
    :cond_8
    invoke-static {v8, v8}, Ljava/util/Arrays;->equals([F[F)Z

    .line 519
    .line 520
    .line 521
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 525
    .line 526
    .line 527
    goto/16 :goto_2

    .line 528
    .line 529
    :cond_9
    instance-of v0, p1, La/kl3;

    .line 530
    .line 531
    if-eqz v0, :cond_f

    .line 532
    .line 533
    const v0, 0x7f0a0f8f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    if-nez v0, :cond_d

    .line 541
    .line 542
    new-instance v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;

    .line 543
    .line 544
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 545
    .line 546
    .line 547
    move-result-object v9

    .line 548
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-direct {v0, v9}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;-><init>(Landroid/content/Context;)V

    .line 552
    .line 553
    .line 554
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 555
    .line 556
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 557
    .line 558
    .line 559
    move-result-object v10

    .line 560
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 561
    .line 562
    .line 563
    move-result-object v10

    .line 564
    const v11, 0x7f07069b

    .line 565
    .line 566
    .line 567
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 568
    .line 569
    .line 570
    move-result v10

    .line 571
    invoke-direct {v9, v6, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 578
    .line 579
    .line 580
    move-result-object v6

    .line 581
    invoke-static {p2, v6}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 582
    .line 583
    .line 584
    move-result-object v6

    .line 585
    if-eqz v6, :cond_a

    .line 586
    .line 587
    invoke-virtual {v0, v6}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->setSecondaryLineColor(Landroid/content/res/ColorStateList;)V

    .line 588
    .line 589
    .line 590
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 595
    .line 596
    .line 597
    move-result-object v6

    .line 598
    const v9, 0x7f07067a

    .line 599
    .line 600
    .line 601
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    invoke-virtual {v0, v6}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->setSecondaryLineHeight(I)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 609
    .line 610
    .line 611
    move-result-object v6

    .line 612
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 613
    .line 614
    .line 615
    move-result-object v6

    .line 616
    invoke-virtual {v6, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    invoke-virtual {v0, v2}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->setSecondaryLineCornersRadius(F)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    check-cast p1, La/kl3;

    .line 628
    .line 629
    iget p1, p1, La/kl3;->a:I

    .line 630
    .line 631
    invoke-virtual {v2, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 632
    .line 633
    .line 634
    move-result-object p1

    .line 635
    if-eqz p1, :cond_b

    .line 636
    .line 637
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 638
    .line 639
    .line 640
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    const v2, 0x7f0705c6

    .line 649
    .line 650
    .line 651
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 652
    .line 653
    .line 654
    move-result p1

    .line 655
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->setThumbRadius(I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v7}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->setThumbWithinSecondaryLineBounds(Z)V

    .line 659
    .line 660
    .line 661
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 662
    .line 663
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 664
    .line 665
    .line 666
    move-result-object p1

    .line 667
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-static {p1, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 671
    .line 672
    .line 673
    move-result p1

    .line 674
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    invoke-static {v2, v3, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    filled-new-array {p1, v2}, [I

    .line 686
    .line 687
    .line 688
    move-result-object p1

    .line 689
    iget-object v2, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->h:[I

    .line 690
    .line 691
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 692
    .line 693
    .line 694
    move-result v2

    .line 695
    if-nez v2, :cond_c

    .line 696
    .line 697
    iput-object p1, v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->h:[I

    .line 698
    .line 699
    :cond_c
    invoke-static {v8, v8}, Ljava/util/Arrays;->equals([F[F)Z

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 706
    .line 707
    .line 708
    :cond_d
    :goto_2
    iget p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 709
    .line 710
    if-ne p1, p2, :cond_e

    .line 711
    .line 712
    return-void

    .line 713
    :cond_e
    iput p2, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 714
    .line 715
    return-void

    .line 716
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 717
    .line 718
    .line 719
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->b:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const v0, 0x7f0a02fd

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;

    .line 13
    .line 14
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->b:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const v0, 0x7f0a0f90

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;

    .line 28
    .line 29
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->d:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    const v0, 0x7f0a0f8e

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;

    .line 43
    .line 44
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->d:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;

    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->e:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;

    .line 47
    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    const v0, 0x7f0a0f8f

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;

    .line 58
    .line 59
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->e:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;

    .line 60
    .line 61
    :cond_3
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/DownloadBar$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/DownloadBar$SavedState;

    .line 6
    .line 7
    iget v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/DownloadBar$SavedState;->b:I

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->setSecondaryLineColor(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/DownloadBar$SavedState;->a:Landroid/os/Parcelable;

    .line 13
    .line 14
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/DownloadBar$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->f:I

    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/DownloadBar$SavedState;-><init>(Landroid/os/Parcelable;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final setContainerLayoutParams(La/pn3;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/a3e;

    .line 5
    .line 6
    iget v1, p1, La/pn3;->a:I

    .line 7
    .line 8
    iget v2, p1, La/pn3;->b:I

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, La/a3e;-><init>(II)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const v2, 0x7f0706bd

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, v0, La/a3e;->P:I

    .line 25
    .line 26
    invoke-static {v0, p1}, La/q7x;->G(La/a3e;La/pn3;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1}, La/ewm0;->u(Landroid/view/View;La/pn3;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget v2, p1, La/pn3;->k:I

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget v3, p1, La/pn3;->l:I

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget v4, p1, La/pn3;->m:I

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    iget p1, p1, La/pn3;->n:I

    .line 67
    .line 68
    invoke-virtual {v4, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final setProgress(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->b:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/circle/b;->setValue(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->c:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thinline/b;->setValue(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->d:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thickline/b;->setValue(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->e:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;

    .line 23
    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/thicklinewithicon/b;->setValue(I)V

    .line 27
    .line 28
    .line 29
    :cond_3
    return-void
.end method
