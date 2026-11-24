.class public final La/y0i;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/w0i;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Landroid/widget/TextView;

.field public final j:Lorg/xplatform/uikit/components/views/LoadableImageView;

.field public final k:Lorg/xplatform/uikit/components/buttons/DsButton;

.field public final l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const v2, 0x7f07066c

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, La/y0i;->a:I

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v2, 0x7f0706a3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p0, La/y0i;->b:I

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const v2, 0x7f07072d

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iput v1, p0, La/y0i;->c:I

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iput v1, p0, La/y0i;->d:I

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const v2, 0x7f070656

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iput v1, p0, La/y0i;->e:I

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const v2, 0x7f0706d9

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iput v1, p0, La/y0i;->f:I

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const v2, 0x7f070640

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    iput v1, p0, La/y0i;->g:I

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const v2, 0x7f0706ea

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    iput v1, p0, La/y0i;->h:I

    .line 108
    .line 109
    new-instance v1, Landroid/widget/TextView;

    .line 110
    .line 111
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    const v2, 0x7f140498

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 118
    .line 119
    .line 120
    const v2, 0x7f040b0b

    .line 121
    .line 122
    .line 123
    invoke-static {v2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 132
    .line 133
    .line 134
    const v3, 0x800013

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 138
    .line 139
    .line 140
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 141
    .line 142
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 143
    .line 144
    .line 145
    const/4 v3, 0x2

    .line 146
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 147
    .line 148
    .line 149
    const/4 v3, 0x5

    .line 150
    invoke-virtual {v1, v3}, Landroid/view/View;->setTextAlignment(I)V

    .line 151
    .line 152
    .line 153
    const-string v3, "DSHeaderSmall"

    .line 154
    .line 155
    invoke-virtual {v1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iput-object v1, p0, La/y0i;->i:Landroid/widget/TextView;

    .line 159
    .line 160
    new-instance v1, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 161
    .line 162
    const/4 v3, 0x6

    .line 163
    const/4 v4, 0x0

    .line 164
    invoke-direct {v1, p1, v0, v3, v4}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 165
    .line 166
    .line 167
    invoke-static {v2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 172
    .line 173
    .line 174
    iput-object v1, p0, La/y0i;->j:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 175
    .line 176
    new-instance v1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 177
    .line 178
    invoke-direct {v1, p1, v0, v3, v4}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 179
    .line 180
    .line 181
    const v2, 0x7f0a020b

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 185
    .line 186
    .line 187
    const-string v2, "tag_button_header_small"

    .line 188
    .line 189
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 193
    .line 194
    .line 195
    sget-object v2, La/ful;->g:La/ful;

    .line 196
    .line 197
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 198
    .line 199
    .line 200
    sget-object v2, La/eul;->h:La/eul;

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 203
    .line 204
    .line 205
    sget-object v2, La/gul;->e:La/gul;

    .line 206
    .line 207
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonType(La/gul;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 211
    .line 212
    .line 213
    iput-object v1, p0, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 214
    .line 215
    new-instance v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 216
    .line 217
    invoke-direct {v1, p1, v0, v3}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 218
    .line 219
    .line 220
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 221
    .line 222
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    const v3, 0x7f0705cf

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 237
    .line 238
    .line 239
    const v2, 0x7f040b0e

    .line 240
    .line 241
    .line 242
    invoke-static {v2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 254
    .line 255
    .line 256
    iput-object v1, p0, La/y0i;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 257
    .line 258
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 259
    .line 260
    .line 261
    invoke-static {v1, p0}, La/jmu0;->a(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 262
    .line 263
    .line 264
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 265
    .line 266
    .line 267
    return-void
.end method

.method private final getButtonWidth()I
    .locals 1

    .line 1
    iget-object p0, p0, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0}, La/jmu0;->e(Landroid/view/View;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method private final getIconWidth()I
    .locals 2

    .line 1
    iget-object v0, p0, La/y0i;->j:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget p0, p0, La/y0i;->c:I

    .line 8
    .line 9
    add-int/2addr v1, p0

    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {v0}, La/jmu0;->e(Landroid/view/View;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    :goto_0
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return p0
.end method


# virtual methods
.method public final a(La/o0x;La/l0x;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/y0i;->j:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-static {v0, p1, p2}, Lorg/xplatform/uikit/components/views/LoadableImageView;->d(Lorg/xplatform/uikit/components/views/LoadableImageView;La/o0x;La/o0x;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p0}, La/jmu0;->a(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {v0}, La/jmu0;->h(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    sget-object v0, La/ful;->k:La/ful;

    .line 2
    .line 3
    iget-object v1, p0, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const v2, 0x7f0705cf

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const v2, 0x7f040b66

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, La/y0i;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object p0, p0, La/y0i;->j:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public getButton()Lorg/xplatform/uikit/components/buttons/DsButton;
    .locals 1

    .line 1
    iget-object p0, p0, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-static {p0}, La/jmu0;->e(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getLabelText()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/y0i;->i:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public bridge synthetic getTag()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/y0i;->getTag()Lorg/xplatform/uikit/components/tag/DsTag;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getTag()Lorg/xplatform/uikit/components/tag/DsTag;
    .locals 0

    .line 6
    const/4 p0, 0x0

    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 7

    .line 1
    iget-object p4, p0, La/y0i;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 2
    .line 3
    invoke-static {p4}, La/jmu0;->e(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    move p2, p1

    .line 15
    iget p1, p0, La/y0i;->h:I

    .line 16
    .line 17
    add-int p3, p2, p1

    .line 18
    .line 19
    move-object v6, p0

    .line 20
    const/4 p0, 0x0

    .line 21
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    move-object p5, v6

    .line 26
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v6, p0

    .line 31
    invoke-virtual {p4, v0, v0, v0, v0}, Landroid/view/View;->layout(IIII)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v5, v6, La/y0i;->j:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 35
    .line 36
    invoke-static {v5}, La/jmu0;->e(Landroid/view/View;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/4 v1, 0x0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    div-int/lit8 p0, p0, 0x2

    .line 48
    .line 49
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    div-int/lit8 p1, p1, 0x2

    .line 54
    .line 55
    sub-int v2, p0, p1

    .line 56
    .line 57
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    add-int v4, p0, v2

    .line 66
    .line 67
    invoke-static/range {v1 .. v6}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 68
    .line 69
    .line 70
    iget p0, v6, La/y0i;->c:I

    .line 71
    .line 72
    add-int v1, v3, p0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v5, v0, v0, v0, v0}, Landroid/view/View;->layout(IIII)V

    .line 76
    .line 77
    .line 78
    :goto_1
    iget-object v5, v6, La/y0i;->i:Landroid/widget/TextView;

    .line 79
    .line 80
    invoke-static {v5}, La/jmu0;->e(Landroid/view/View;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    div-int/lit8 p0, p0, 0x2

    .line 91
    .line 92
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    div-int/lit8 p1, p1, 0x2

    .line 97
    .line 98
    sub-int v2, p0, p1

    .line 99
    .line 100
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    add-int v3, p0, v1

    .line 105
    .line 106
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    add-int v4, p0, v2

    .line 111
    .line 112
    invoke-static/range {v1 .. v6}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    invoke-virtual {v5, v0, v0, v0, v0}, Landroid/view/View;->layout(IIII)V

    .line 120
    .line 121
    .line 122
    :goto_2
    iget-object v5, v6, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 123
    .line 124
    invoke-static {v5}, La/jmu0;->e(Landroid/view/View;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_3

    .line 129
    .line 130
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    div-int/lit8 p0, p0, 0x2

    .line 135
    .line 136
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    div-int/lit8 p1, p1, 0x2

    .line 141
    .line 142
    sub-int v2, p0, p1

    .line 143
    .line 144
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    add-int v4, p0, v2

    .line 153
    .line 154
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    sub-int v1, v3, p0

    .line 159
    .line 160
    invoke-static/range {v1 .. v6}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_3
    invoke-virtual {v5, v0, v0, v0, v0}, Landroid/view/View;->layout(IIII)V

    .line 165
    .line 166
    .line 167
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
    iget-object p2, p0, La/y0i;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 6
    .line 7
    invoke-static {p2}, La/jmu0;->e(Landroid/view/View;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, La/y0i;->f:I

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v2, p0, La/y0i;->g:I

    .line 22
    .line 23
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p2, v0, v2}, Landroid/view/View;->measure(II)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p2, p0, La/y0i;->j:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 31
    .line 32
    invoke-static {p2}, La/jmu0;->e(Landroid/view/View;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget v0, p0, La/y0i;->a:I

    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p2, v0, v0}, Landroid/view/View;->measure(II)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-direct {p0}, La/y0i;->getIconWidth()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    sub-int p2, p1, p2

    .line 52
    .line 53
    iget-object v0, p0, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 54
    .line 55
    invoke-static {v0}, La/jmu0;->e(Landroid/view/View;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/high16 v3, -0x80000000

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getButtonHeight()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-static {v4, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->measure(II)V

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-direct {p0}, La/y0i;->getButtonWidth()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget v1, p0, La/y0i;->d:I

    .line 83
    .line 84
    add-int/2addr v0, v1

    .line 85
    sub-int/2addr p2, v0

    .line 86
    iget-object v0, p0, La/y0i;->i:Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-static {v0}, La/jmu0;->e(Landroid/view/View;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {v0, p2, v1}, Landroid/view/View;->measure(II)V

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-static {v0}, La/jmu0;->e(Landroid/view/View;)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    iget v1, p0, La/y0i;->b:I

    .line 111
    .line 112
    if-eqz p2, :cond_4

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    const/4 v0, 0x1

    .line 119
    if-le p2, v0, :cond_4

    .line 120
    .line 121
    iget p2, p0, La/y0i;->e:I

    .line 122
    .line 123
    add-int/2addr v1, p2

    .line 124
    :cond_4
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public setButtonClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setButtonIcon(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, La/gul;->e:La/gul;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, La/gul;->g:La/gul;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonType(La/gul;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->i(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    sget-object p1, La/gul;->e:La/gul;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonType(La/gul;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->i(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public setButtonLabel(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/y0i;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0, p0}, La/jmu0;->a(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    :goto_0
    invoke-static {v0}, La/jmu0;->h(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setCounter(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setIconColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/y0i;->j:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setLabel(I)V
    .locals 1

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, La/y0i;->setLabel(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setLabel(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/y0i;->i:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0, p0}, La/jmu0;->a(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    :goto_0
    invoke-static {v0}, La/jmu0;->h(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setLabelClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/y0i;->i:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p0, p0, La/y0i;->i:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setModel(La/prv;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/nrv;

    .line 5
    .line 6
    iget-object v1, p0, La/y0i;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, La/nrv;

    .line 11
    .line 12
    iget-object v0, p1, La/nrv;->a:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/y0i;->setLabel(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, La/nrv;->d:Ljava/lang/CharSequence;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, La/y0i;->setButtonLabel(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, La/nrv;->f:La/o0x;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {p0, v0, v2}, La/y0i;->a(La/o0x;La/l0x;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, La/nrv;->e:Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, La/y0i;->setButtonIcon(Ljava/lang/Integer;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, La/jmu0;->h(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 41
    .line 42
    .line 43
    invoke-static {v1, p0}, La/jmu0;->a(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public setTagClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTagColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTagLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTagStyle(I)V
    .locals 0

    .line 1
    return-void
.end method
