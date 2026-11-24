.class public Lorg/xplatform/uikit/components/buttons/DsButton;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic n:I


# instance fields
.field public final a:I

.field public b:Z

.field public c:La/eul;

.field public d:La/ful;

.field public e:La/gul;

.field public f:Ljava/lang/CharSequence;

.field public g:I

.field public h:I

.field public i:I

.field public final j:Landroid/view/View;

.field public final k:La/n0o0;

.field public l:Landroidx/appcompat/widget/AppCompatImageView;

.field public m:Lorg/xplatform/uikit/components/loader/DsLoader;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 312
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f07067a

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->a:I

    .line 19
    .line 20
    sget-object v0, La/eul;->g:La/eul;

    .line 21
    .line 22
    iput-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 23
    .line 24
    sget-object v1, La/ful;->e:La/ful;

    .line 25
    .line 26
    iput-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 27
    .line 28
    sget-object v1, La/gul;->e:La/gul;

    .line 29
    .line 30
    iput-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 31
    .line 32
    const-string v1, ""

    .line 33
    .line 34
    iput-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->f:Ljava/lang/CharSequence;

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    iput v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->i:I

    .line 38
    .line 39
    new-instance v1, Landroid/view/View;

    .line 40
    .line 41
    invoke-direct {v1, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 45
    .line 46
    iget v2, v2, La/ful;->a:I

    .line 47
    .line 48
    invoke-static {v2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v3, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 53
    .line 54
    iget v3, v3, La/ful;->b:I

    .line 55
    .line 56
    invoke-static {v3, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {p1, v2, v3}, La/m5d;->a(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Landroid/graphics/drawable/RippleDrawable;

    .line 68
    .line 69
    const v3, 0x7f040b09

    .line 70
    .line 71
    .line 72
    invoke-static {v3, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iget-object v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 81
    .line 82
    iget v4, v4, La/gul;->b:I

    .line 83
    .line 84
    invoke-virtual {p1, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-direct {v2, v3, v4, v5}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iget-object v3, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 100
    .line 101
    iget v3, v3, La/eul;->a:I

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 108
    .line 109
    const/16 v4, 0x11

    .line 110
    .line 111
    invoke-direct {v3, v2, v2, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    iput-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->j:Landroid/view/View;

    .line 121
    .line 122
    new-instance v1, La/lrk;

    .line 123
    .line 124
    const/16 v2, 0xb

    .line 125
    .line 126
    invoke-direct {v1, p1, p0, v2}, La/lrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iput-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->k:La/n0o0;

    .line 134
    .line 135
    sget-object v1, La/bqd0;->A:[I

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    const/4 p3, 0x2

    .line 143
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    const/4 v3, 0x3

    .line 148
    const/4 v6, 0x1

    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    if-eq v1, v6, :cond_2

    .line 152
    .line 153
    if-eq v1, p3, :cond_1

    .line 154
    .line 155
    if-eq v1, v3, :cond_0

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_0
    sget-object v0, La/eul;->j:La/eul;

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_1
    sget-object v0, La/eul;->i:La/eul;

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_2
    sget-object v0, La/eul;->h:La/eul;

    .line 165
    .line 166
    :cond_3
    :goto_0
    iput-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 167
    .line 168
    invoke-virtual {p2, v3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    invoke-static {p3}, La/qzb;->e1(I)La/ful;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    iput-object p3, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 177
    .line 178
    const/4 p3, 0x4

    .line 179
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 180
    .line 181
    .line 182
    move-result p3

    .line 183
    invoke-static {p3}, La/uzb;->H0(I)La/gul;

    .line 184
    .line 185
    .line 186
    move-result-object p3

    .line 187
    iput-object p3, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 188
    .line 189
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object p3

    .line 193
    invoke-static {p2, p1, p3}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    if-nez p1, :cond_4

    .line 198
    .line 199
    invoke-virtual {p2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    :cond_4
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->f:Ljava/lang/CharSequence;

    .line 208
    .line 209
    invoke-virtual {p2, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    iput p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->g:I

    .line 214
    .line 215
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    iget-object p2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 223
    .line 224
    iget p2, p2, La/eul;->a:I

    .line 225
    .line 226
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    iput p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->h:I

    .line 231
    .line 232
    invoke-virtual {p0, v6}, Landroid/view/View;->setClickable(Z)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->g()V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 239
    .line 240
    iget-boolean p1, p1, La/gul;->c:Z

    .line 241
    .line 242
    if-eqz p1, :cond_5

    .line 243
    .line 244
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->a()V

    .line 245
    .line 246
    .line 247
    :cond_5
    new-instance p1, Lorg/xplatform/uikit/components/loader/DsLoader;

    .line 248
    .line 249
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    const/4 p3, 0x6

    .line 257
    invoke-direct {p1, p2, v5, p3}, Lorg/xplatform/uikit/components/loader/DsLoader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    iget-object p3, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 265
    .line 266
    iget p3, p3, La/eul;->d:I

    .line 267
    .line 268
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 269
    .line 270
    .line 271
    move-result p2

    .line 272
    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    .line 273
    .line 274
    invoke-direct {p3, p2, p2, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 278
    .line 279
    .line 280
    const/16 p2, 0x8

    .line 281
    .line 282
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 283
    .line 284
    .line 285
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getContentColorStateList()Landroid/content/res/ColorStateList;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/loader/DsLoader;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 290
    .line 291
    .line 292
    const-string p2, "DS_LOADER"

    .line 293
    .line 294
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->m:Lorg/xplatform/uikit/components/loader/DsLoader;

    .line 298
    .line 299
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 303
    .line 304
    .line 305
    const-string p1, "dsButton"

    .line 306
    .line 307
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 313
    invoke-direct {p0, p1, p2, p3}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final getContentColorStateList()Landroid/content/res/ColorStateList;
    .locals 3

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
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 16
    .line 17
    iget v2, v2, La/ful;->c:I

    .line 18
    .line 19
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 31
    .line 32
    iget p0, p0, La/ful;->d:I

    .line 33
    .line 34
    invoke-static {p0, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {v0, v1, p0}, La/m5d;->a(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method private final getTextView()Landroidx/appcompat/widget/AppCompatTextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->k:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    new-instance v0, La/ihu0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    move-object v1, v0

    .line 11
    check-cast v1, La/jhu0;

    .line 12
    .line 13
    invoke-virtual {v1}, La/jhu0;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const-string v3, "TAG_ICON"

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, La/jhu0;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 39
    .line 40
    sget-object v1, La/gul;->h:La/gul;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    if-eq v0, v1, :cond_3

    .line 44
    .line 45
    sget-object v1, La/gul;->i:La/gul;

    .line 46
    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    :goto_0
    move v0, v2

    .line 53
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const v5, 0x7f07072d

    .line 64
    .line 65
    .line 66
    if-eqz v4, :cond_7

    .line 67
    .line 68
    if-eq v4, v2, :cond_7

    .line 69
    .line 70
    const/4 v2, 0x2

    .line 71
    const v6, 0x7f070722

    .line 72
    .line 73
    .line 74
    if-eq v4, v2, :cond_6

    .line 75
    .line 76
    const/4 v2, 0x3

    .line 77
    if-ne v4, v2, :cond_5

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    const v5, 0x7f070717

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    :goto_2
    move v5, v6

    .line 86
    goto :goto_3

    .line 87
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_6
    if-eqz v0, :cond_7

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_7
    :goto_3
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iget-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 103
    .line 104
    iget v2, v2, La/eul;->b:I

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    new-instance v2, Landroidx/appcompat/widget/AppCompatImageView;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-direct {v2, v4}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget v3, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->g:I

    .line 123
    .line 124
    if-nez v3, :cond_8

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    goto :goto_4

    .line 128
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-static {v3, v4}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    if-eqz v3, :cond_9

    .line 137
    .line 138
    iget-boolean v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->b:Z

    .line 139
    .line 140
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 141
    .line 142
    .line 143
    :cond_9
    :goto_4
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getContentColorStateList()Landroid/content/res/ColorStateList;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 151
    .line 152
    .line 153
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 154
    .line 155
    iget-object v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 156
    .line 157
    iget v4, v4, La/gul;->a:I

    .line 158
    .line 159
    invoke-direct {v3, v1, v1, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    .line 170
    .line 171
    iput-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 172
    .line 173
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final b(I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 6
    .line 7
    iget v1, v1, La/eul;->e:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 18
    .line 19
    iget v2, v2, La/eul;->f:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const v3, 0x7f07075b

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 41
    .line 42
    iget v4, v4, La/eul;->c:I

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    iget-object v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 49
    .line 50
    sget-object v5, La/gul;->f:La/gul;

    .line 51
    .line 52
    if-ne v4, v5, :cond_0

    .line 53
    .line 54
    move v5, v1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v5, v0

    .line 57
    :goto_0
    sget-object v6, La/gul;->g:La/gul;

    .line 58
    .line 59
    if-ne v4, v6, :cond_1

    .line 60
    .line 61
    move v0, v1

    .line 62
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sub-int/2addr p1, v5

    .line 67
    sub-int/2addr p1, v0

    .line 68
    int-to-float v0, v2

    .line 69
    int-to-float v2, v3

    .line 70
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->f:Ljava/lang/CharSequence;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const v4, 0x7f070747

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    sub-float/2addr v2, v0

    .line 94
    div-float/2addr v2, v3

    .line 95
    float-to-int v2, v2

    .line 96
    const/4 v4, 0x1

    .line 97
    if-gt v4, v2, :cond_3

    .line 98
    .line 99
    :goto_1
    int-to-float v5, v4

    .line 100
    mul-float/2addr v5, v3

    .line 101
    add-float/2addr v5, v0

    .line 102
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v6, p0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    int-to-float v7, p1

    .line 118
    cmpl-float v6, v6, v7

    .line 119
    .line 120
    if-lez v6, :cond_2

    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    sub-float/2addr v5, v3

    .line 127
    invoke-virtual {p0, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_2
    if-eq v4, v2, :cond_3

    .line 147
    .line 148
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    return-void
.end method

.method public final c(I)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 6
    .line 7
    iget v1, v1, La/eul;->e:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 18
    .line 19
    iget v2, v2, La/eul;->f:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 26
    .line 27
    sget-object v3, La/gul;->f:La/gul;

    .line 28
    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    move v3, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v0

    .line 34
    :goto_0
    sget-object v4, La/gul;->g:La/gul;

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    move v0, v1

    .line 39
    :cond_1
    sub-int/2addr p1, v3

    .line 40
    sub-int/2addr p1, v0

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 46
    .line 47
    iget v1, v1, La/eul;->c:I

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    int-to-float v0, v0

    .line 66
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v1, p0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 86
    .line 87
    .line 88
    int-to-float p1, p1

    .line 89
    cmpg-float p0, p1, p0

    .line 90
    .line 91
    if-gez p0, :cond_2

    .line 92
    .line 93
    const/4 p0, 0x1

    .line 94
    return p0

    .line 95
    :cond_2
    const/4 p0, 0x0

    .line 96
    return p0
.end method

.method public final d(I)V
    .locals 5

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
    sget-object v1, La/bqd0;->A:[I

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x2

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x3

    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-eq v2, v4, :cond_2

    .line 25
    .line 26
    if-eq v2, v0, :cond_1

    .line 27
    .line 28
    if-eq v2, v3, :cond_0

    .line 29
    .line 30
    sget-object v0, La/eul;->g:La/eul;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v0, La/eul;->j:La/eul;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object v0, La/eul;->i:La/eul;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    sget-object v0, La/eul;->h:La/eul;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    sget-object v0, La/eul;->g:La/eul;

    .line 43
    .line 44
    :goto_0
    iput-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 45
    .line 46
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {v0}, La/qzb;->e1(I)La/ful;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 55
    .line 56
    const/4 v0, 0x4

    .line 57
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {v0}, La/uzb;->H0(I)La/gul;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final g()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 6
    .line 7
    iget v1, v1, La/eul;->e:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 18
    .line 19
    iget v2, v2, La/eul;->f:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const v3, 0x7f14048c

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v2}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 36
    .line 37
    const/4 v4, -0x1

    .line 38
    const/16 v5, 0x10

    .line 39
    .line 40
    invoke-direct {v3, v4, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 44
    .line 45
    sget-object v5, La/gul;->f:La/gul;

    .line 46
    .line 47
    if-ne v4, v5, :cond_0

    .line 48
    .line 49
    move v4, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v4, v0

    .line 52
    :goto_0
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 53
    .line 54
    .line 55
    iget-object v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 56
    .line 57
    sget-object v5, La/gul;->g:La/gul;

    .line 58
    .line 59
    if-ne v4, v5, :cond_1

    .line 60
    .line 61
    move v0, v1

    .line 62
    :cond_1
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 70
    .line 71
    sget-object v4, La/eul;->j:La/eul;

    .line 72
    .line 73
    if-ne v1, v4, :cond_2

    .line 74
    .line 75
    const v1, 0x7f07067a

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const v1, 0x7f07069b

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getContentColorStateList()Landroid/content/res/ColorStateList;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 97
    .line 98
    .line 99
    const/4 v0, 0x1

    .line 100
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 101
    .line 102
    .line 103
    const/16 v1, 0x11

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->b(I)V

    .line 113
    .line 114
    .line 115
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->f:Ljava/lang/CharSequence;

    .line 116
    .line 117
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 121
    .line 122
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 123
    .line 124
    .line 125
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 126
    .line 127
    sget-object v1, La/gul;->h:La/gul;

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    if-eq p0, v1, :cond_3

    .line 131
    .line 132
    sget-object v1, La/gul;->i:La/gul;

    .line 133
    .line 134
    if-eq p0, v1, :cond_3

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_3
    move v0, v3

    .line 138
    :goto_2
    if-eqz v0, :cond_4

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_4
    const/16 v3, 0x8

    .line 142
    .line 143
    :goto_3
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final getBackgroundView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->j:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getButtonHeight()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public final getButtonLabel()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->f:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getButtonSize()La/eul;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getButtonStyle()La/ful;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getButtonType()La/gul;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIcon()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIconRes()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public final getLabel()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->f:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLoader()Lorg/xplatform/uikit/components/loader/DsLoader;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->m:Lorg/xplatform/uikit/components/loader/DsLoader;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMaxWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public final h()V
    .locals 5

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
    new-instance v1, Landroid/graphics/drawable/RippleDrawable;

    .line 9
    .line 10
    const v2, 0x7f040b09

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 22
    .line 23
    iget v3, v3, La/gul;->b:I

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v1, v2, v0, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->j:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 46
    .line 47
    iget v2, v2, La/ful;->a:I

    .line 48
    .line 49
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v4, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 54
    .line 55
    iget v4, v4, La/ful;->b:I

    .line 56
    .line 57
    invoke-static {v4, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-static {v1, v2, v4}, La/m5d;->a(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v0, v1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 73
    .line 74
    iget v1, v1, La/eul;->a:I

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->h:I

    .line 81
    .line 82
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->g()V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 86
    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getContentColorStateList()Landroid/content/res/ColorStateList;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 94
    .line 95
    .line 96
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->m:Lorg/xplatform/uikit/components/loader/DsLoader;

    .line 97
    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getContentColorStateList()Landroid/content/res/ColorStateList;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/loader/DsLoader;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 105
    .line 106
    .line 107
    :cond_1
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 108
    .line 109
    iget-boolean v0, v0, La/gul;->c:Z

    .line 110
    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->a()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_2
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 118
    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    iput-object v3, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 125
    .line 126
    :cond_3
    return-void
.end method

.method public final i(I)V
    .locals 2

    .line 1
    iget v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->g:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->g:I

    .line 7
    .line 8
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->b:Z

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 29
    .line 30
    .line 31
    :cond_2
    move-object p0, p1

    .line 32
    :goto_0
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_3
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final l(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->f:Ljava/lang/CharSequence;

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->g()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final m(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onMeasure(II)V
    .locals 7

    .line 1
    iget p2, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->h:I

    .line 2
    .line 3
    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    .line 5
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 10
    .line 11
    sget-object v2, La/gul;->i:La/gul;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    sget-object v5, La/gul;->h:La/gul;

    .line 18
    .line 19
    if-ne v1, v5, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    move v1, v3

    .line 25
    :goto_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->h:I

    .line 32
    .line 33
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    iget v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->i:I

    .line 39
    .line 40
    const/4 v6, -0x1

    .line 41
    if-eq v1, v6, :cond_3

    .line 42
    .line 43
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/high16 v1, -0x80000000

    .line 48
    .line 49
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    :cond_3
    :goto_2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->b(I)V

    .line 58
    .line 59
    .line 60
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    instance-of v1, p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 80
    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 84
    .line 85
    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move p2, v4

    .line 91
    :goto_3
    add-int/2addr p1, p2

    .line 92
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    instance-of v1, p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 101
    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 105
    .line 106
    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    goto :goto_4

    .line 111
    :cond_5
    move p2, v4

    .line 112
    :goto_4
    add-int/2addr p1, p2

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    sub-int/2addr p2, p1

    .line 118
    const/4 p1, 0x2

    .line 119
    div-int/2addr p2, p1

    .line 120
    int-to-float p2, p2

    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_6

    .line 126
    .line 127
    move v4, v3

    .line 128
    :cond_6
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 136
    .line 137
    if-eqz v1, :cond_d

    .line 138
    .line 139
    iget-object v5, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_b

    .line 146
    .line 147
    if-eq v5, v3, :cond_a

    .line 148
    .line 149
    if-eq v5, p1, :cond_8

    .line 150
    .line 151
    const/4 p1, 0x3

    .line 152
    if-eq v5, p1, :cond_b

    .line 153
    .line 154
    const/4 p1, 0x4

    .line 155
    if-ne v5, p1, :cond_7

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_8
    if-eqz v4, :cond_c

    .line 163
    .line 164
    :cond_9
    neg-float p2, p2

    .line 165
    goto :goto_6

    .line 166
    :cond_a
    if-eqz v4, :cond_9

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_b
    :goto_5
    const/4 p2, 0x0

    .line 170
    :cond_c
    :goto_6
    invoke-virtual {v1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 171
    .line 172
    .line 173
    :cond_d
    iget-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 174
    .line 175
    sget-object p2, La/gul;->h:La/gul;

    .line 176
    .line 177
    iget v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->a:I

    .line 178
    .line 179
    if-eq p1, p2, :cond_e

    .line 180
    .line 181
    if-ne p1, v2, :cond_f

    .line 182
    .line 183
    :cond_e
    iget-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 184
    .line 185
    sget-object p2, La/eul;->j:La/eul;

    .line 186
    .line 187
    if-ne p1, p2, :cond_f

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_f
    iget-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 191
    .line 192
    sget-object p2, La/eul;->j:La/eul;

    .line 193
    .line 194
    if-ne p1, p2, :cond_10

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_10
    iget v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->h:I

    .line 198
    .line 199
    :goto_7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->j:Landroid/view/View;

    .line 212
    .line 213
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public final setButtonHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public final setButtonLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->f:Ljava/lang/CharSequence;

    .line 5
    .line 6
    return-void
.end method

.method public final setButtonSize(La/eul;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->c:La/eul;

    .line 5
    .line 6
    return-void
.end method

.method public final setButtonStyle(La/ful;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->d:La/ful;

    .line 5
    .line 6
    return-void
.end method

.method public final setButtonType(La/gul;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 5
    .line 6
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

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
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->m:Lorg/xplatform/uikit/components/loader/DsLoader;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->j:Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setIcon(Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    return-void
.end method

.method public final setIconAutoMirrored(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setIconRes(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public final setLoader(Lorg/xplatform/uikit/components/loader/DsLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->m:Lorg/xplatform/uikit/components/loader/DsLoader;

    .line 2
    .line 3
    return-void
.end method

.method public final setLoading(Z)V
    .locals 4

    .line 1
    xor-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getTextView()Landroidx/appcompat/widget/AppCompatTextView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 11
    .line 12
    iget-boolean v1, v1, La/gul;->d:Z

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    move v1, v2

    .line 24
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move v2, v3

    .line 35
    :goto_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :cond_3
    iget-object p0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->m:Lorg/xplatform/uikit/components/loader/DsLoader;

    .line 39
    .line 40
    if-eqz p0, :cond_5

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_4
    const/16 v3, 0x8

    .line 46
    .line 47
    :goto_3
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    :cond_5
    return-void
.end method

.method public final setMaxWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->i:I

    .line 2
    .line 3
    return-void
.end method
