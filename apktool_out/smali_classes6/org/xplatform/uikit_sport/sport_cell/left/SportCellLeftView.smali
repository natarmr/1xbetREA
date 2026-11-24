.class public final Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic n:I


# instance fields
.field public a:La/v1l0;

.field public b:Z

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:La/a8z;

.field public final h:La/a8z;

.field public final i:La/a8z;

.field public final j:La/a8z;

.field public final k:La/a8z;

.field public final l:La/a8z;

.field public final m:La/a6p;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La/v1l0;->a:La/v1l0;

    .line 14
    .line 15
    iput-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->a:La/v1l0;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const v2, 0x7f07067a

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iput v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->c:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const v2, 0x7f0706a9

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iput v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d:I

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const v2, 0x7f0706c7

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iput v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->e:I

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const v2, 0x7f0706c9

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iput v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->f:I

    .line 68
    .line 69
    new-instance v1, La/hrf0;

    .line 70
    .line 71
    const/4 v2, 0x3

    .line 72
    invoke-direct {v1, p1, v2}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 73
    .line 74
    .line 75
    sget-object v2, La/wez;->b:La/wez;

    .line 76
    .line 77
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->g:La/a8z;

    .line 82
    .line 83
    new-instance v1, La/w1l0;

    .line 84
    .line 85
    invoke-direct {v1, p1, p0, p3}, La/w1l0;-><init>(Landroid/content/Context;Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->h:La/a8z;

    .line 93
    .line 94
    new-instance v1, La/w1l0;

    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    invoke-direct {v1, p1, p0, v3}, La/w1l0;-><init>(Landroid/content/Context;Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->i:La/a8z;

    .line 105
    .line 106
    new-instance v1, La/x1l0;

    .line 107
    .line 108
    invoke-direct {v1, p0, p3}, La/x1l0;-><init>(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iput-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->j:La/a8z;

    .line 116
    .line 117
    new-instance v1, La/x1l0;

    .line 118
    .line 119
    invoke-direct {v1, p0, v3}, La/x1l0;-><init>(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iput-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->k:La/a8z;

    .line 127
    .line 128
    new-instance v1, La/x1l0;

    .line 129
    .line 130
    invoke-direct {v1, p0, v0}, La/x1l0;-><init>(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iput-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->l:La/a8z;

    .line 138
    .line 139
    new-instance v1, La/a6p;

    .line 140
    .line 141
    invoke-direct {v1, p0, v3}, La/a6p;-><init>(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;B)V

    .line 142
    .line 143
    .line 144
    iput-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->m:La/a6p;

    .line 145
    .line 146
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getContainerLeftCellView()Landroid/widget/FrameLayout;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 151
    .line 152
    .line 153
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getContainerLeftCellView()Landroid/widget/FrameLayout;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconBackgroundView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getContainerLeftCellView()Landroid/widget/FrameLayout;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    sget-object v2, La/cqd0;->e:[I

    .line 176
    .line 177
    invoke-virtual {p1, p2, v2, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {v1, p1}, La/a6p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 185
    .line 186
    .line 187
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getCounterHelper()La/yoe;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p1, p2, p3}, La/yoe;->b(Landroid/util/AttributeSet;I)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p1, p2, p3}, La/if5;->f(Landroid/util/AttributeSet;I)V

    .line 199
    .line 200
    .line 201
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconHelper()La/if5;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    iget-object p1, p0, La/if5;->a:Landroid/view/View;

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    sget-object v1, La/bqd0;->y:[I

    .line 215
    .line 216
    invoke-virtual {p1, p2, v1, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    iget p2, p0, La/if5;->d:I

    .line 221
    .line 222
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    iput p2, p0, La/if5;->d:I

    .line 227
    .line 228
    const/4 p2, 0x4

    .line 229
    const/4 p3, 0x7

    .line 230
    invoke-static {p1, p2, p3}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    iput p2, p0, La/if5;->e:I

    .line 235
    .line 236
    const/4 p2, 0x6

    .line 237
    const/16 p3, 0x8

    .line 238
    .line 239
    invoke-static {p1, p2, p3}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    iput p2, p0, La/if5;->f:I

    .line 244
    .line 245
    invoke-virtual {p0, p1}, La/if5;->b(Landroid/content/res/TypedArray;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 249
    .line 250
    .line 251
    return-void
.end method

.method public static final a(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;Landroid/content/res/TypedArray;)Lkotlin/Unit;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->a:La/v1l0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v1, La/v1l0;->f:La/c0o;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, La/c0o;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/v1l0;

    .line 22
    .line 23
    iput-object v0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->a:La/v1l0;

    .line 24
    .line 25
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->a:La/v1l0;

    .line 30
    .line 31
    sget-object v2, La/v1l0;->d:La/v1l0;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-ne v1, v2, :cond_0

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x2

    .line 43
    iget v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->c:I

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 60
    .line 61
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 62
    .line 63
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->a:La/v1l0;

    .line 73
    .line 74
    sget-object v2, La/v1l0;->c:La/v1l0;

    .line 75
    .line 76
    if-ne v1, v2, :cond_1

    .line 77
    .line 78
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 82
    .line 83
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 84
    .line 85
    .line 86
    const/4 v0, 0x5

    .line 87
    iget-boolean v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->b:Z

    .line 88
    .line 89
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-direct {p0, v0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->setImageBackgroundAvailable(Z)V

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x4

    .line 97
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->setIconBackground(Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    const/4 v0, 0x3

    .line 116
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 123
    .line 124
    .line 125
    :cond_4
    const/4 v0, 0x6

    .line 126
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->setBackgroundTint(Landroid/content/res/ColorStateList;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_6
    const-string p0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 139
    .line 140
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/4 p0, 0x0

    .line 144
    return-object p0
.end method

.method public static final b(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;)La/if5;
    .locals 2

    .line 1
    new-instance v0, La/if5;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getContainerLeftCellView()Landroid/widget/FrameLayout;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, La/if5;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final c(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;)La/yoe;
    .locals 2

    .line 1
    new-instance v0, La/yoe;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getContainerLeftCellView()Landroid/widget/FrameLayout;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, La/yoe;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final e(Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;)La/if5;
    .locals 2

    .line 1
    new-instance v0, La/if5;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getContainerLeftCellView()Landroid/widget/FrameLayout;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, La/if5;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final f(Landroid/view/View$OnClickListener;Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-direct {p1}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private final getBadgeHelper()La/if5;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->k:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/if5;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getContainerLeftCellView()Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->g:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/FrameLayout;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getCounterHelper()La/yoe;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->j:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yoe;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getIconBackgroundView()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->h:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getIconHelper()La/if5;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->l:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/if5;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getIconView()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->i:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setImageBackgroundAvailable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->b:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconBackgroundView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 4
    .line 5
    .line 6
    move-result-object p0

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
    return-void
.end method


# virtual methods
.method public final d()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final setActionIconClickListener(Landroid/view/View$OnClickListener;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/bs50;

    .line 6
    .line 7
    const/16 v2, 0xb

    .line 8
    .line 9
    invoke-direct {v1, p1, p0, v2}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->a:La/v1l0;

    .line 20
    .line 21
    sget-object v0, La/v1l0;->d:La/v1l0;

    .line 22
    .line 23
    if-ne p0, v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->setClickable(Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final setBackgroundTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconBackgroundView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setBadge(La/vf5;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    move-result-object p0

    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    return-void
.end method

.method public final setBadge(La/yrm;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object p1, La/vf5;->f:La/vf5;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, La/vf5;->e:La/vf5;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final setBadgeBackgroundTint(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La/if5;->j(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setBadgeNew(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, La/vf5;->f:La/vf5;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setBadgeVisible(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 p1, 0x8

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final setBottomIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconHelper()La/if5;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v1, v1, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconHelper()La/if5;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, La/vf5;->j:La/vf5;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, La/if5;->a(La/vf5;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconHelper()La/if5;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconHelper()La/if5;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, v0}, La/if5;->a(La/vf5;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getCounterHelper()La/yoe;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0, v0}, La/yoe;->c(Ljava/lang/Integer;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final setCounterNumber(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getCounterHelper()La/yoe;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yoe;->c(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconHelper()La/if5;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setFavoriteIcon(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const p1, 0x7f08090a

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const p1, 0x7f08090b

    .line 8
    .line 9
    .line 10
    :goto_0
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setIcon(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setIconBackground(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconBackgroundView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setIconBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconBackgroundView()Landroidx/appcompat/widget/AppCompatImageView;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setIconTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setIconTintByColorAttr(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final setStyle(La/v1l0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->a:La/v1l0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x3

    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    if-eq v0, v3, :cond_2

    .line 16
    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    const v0, 0x7f140a71

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const v0, 0x7f140a73

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const v0, 0x7f140a72

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    const v0, 0x7f140a74

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget v5, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d:I

    .line 45
    .line 46
    if-eqz v4, :cond_7

    .line 47
    .line 48
    if-eq v4, v3, :cond_6

    .line 49
    .line 50
    if-eq v4, v2, :cond_5

    .line 51
    .line 52
    if-ne v4, v1, :cond_4

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_5
    iget v5, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->f:I

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_6
    iget v5, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->e:I

    .line 63
    .line 64
    :cond_7
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconView()Landroidx/appcompat/widget/AppCompatImageView;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sget-object v3, La/v1l0;->c:La/v1l0;

    .line 69
    .line 70
    if-ne p1, v3, :cond_8

    .line 71
    .line 72
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_8
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 76
    .line 77
    :goto_2
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-eqz v1, :cond_b

    .line 85
    .line 86
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 87
    .line 88
    iput v5, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 89
    .line 90
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    .line 92
    .line 93
    sget-object v1, La/v1l0;->b:La/v1l0;

    .line 94
    .line 95
    if-ne p1, v1, :cond_9

    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    goto :goto_3

    .line 99
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const v1, 0x7f070705

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-virtual {p0, v1, v3, p1, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v1, La/cqd0;->e:[I

    .line 133
    .line 134
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iget-object v1, p0, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->m:La/a6p;

    .line 139
    .line 140
    invoke-virtual {v1, p1}, La/a6p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 144
    .line 145
    .line 146
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getCounterHelper()La/yoe;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1, v0}, La/yoe;->a(I)V

    .line 151
    .line 152
    .line 153
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getBadgeHelper()La/if5;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1, v0}, La/if5;->e(I)V

    .line 158
    .line 159
    .line 160
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->getIconHelper()La/if5;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    iget-object p1, p0, La/if5;->a:Landroid/view/View;

    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    sget-object v1, La/bqd0;->y:[I

    .line 174
    .line 175
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget v0, p0, La/if5;->d:I

    .line 180
    .line 181
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    iput v0, p0, La/if5;->d:I

    .line 186
    .line 187
    const/4 v0, 0x4

    .line 188
    const/4 v1, 0x7

    .line 189
    invoke-static {p1, v0, v1}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    iput v0, p0, La/if5;->e:I

    .line 194
    .line 195
    const/4 v0, 0x6

    .line 196
    const/16 v1, 0x8

    .line 197
    .line 198
    invoke-static {p1, v0, v1}, La/ktt0;->q(Landroid/content/res/TypedArray;II)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iput v0, p0, La/if5;->f:I

    .line 203
    .line 204
    invoke-virtual {p0, p1}, La/if5;->b(Landroid/content/res/TypedArray;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 208
    .line 209
    if-eqz v0, :cond_a

    .line 210
    .line 211
    iget v1, p0, La/if5;->d:I

    .line 212
    .line 213
    iget v2, p0, La/if5;->e:I

    .line 214
    .line 215
    iget p0, p0, La/if5;->f:I

    .line 216
    .line 217
    invoke-virtual {v0, v1, v2, p0}, Lorg/xplatform/uikit/components/badges/DsBadge;->d(III)V

    .line 218
    .line 219
    .line 220
    :cond_a
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :cond_b
    const-string p0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 225
    .line 226
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-void
.end method
