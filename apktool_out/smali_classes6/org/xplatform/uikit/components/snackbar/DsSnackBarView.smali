.class public final Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic s:I


# instance fields
.field public final q:La/zkk;

.field public final r:La/ydk0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const p3, 0x7f04081e

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const p3, 0x7f0d0584

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    const p2, 0x7f0a0129

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    check-cast p3, Landroidx/constraintlayout/widget/Barrier;

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    const p2, 0x7f0a0240

    .line 38
    .line 39
    .line 40
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    move-object v3, p3

    .line 45
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageView;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    const p2, 0x7f0a0385

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    move-object v4, p3

    .line 57
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    const p2, 0x7f0a05c9

    .line 62
    .line 63
    .line 64
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    move-object v5, p3

    .line 69
    check-cast v5, Landroid/widget/FrameLayout;

    .line 70
    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    const p2, 0x7f0a06b9

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    check-cast p3, Landroidx/constraintlayout/widget/Guideline;

    .line 81
    .line 82
    if-eqz p3, :cond_2

    .line 83
    .line 84
    const p2, 0x7f0a07c8

    .line 85
    .line 86
    .line 87
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    move-object v6, p3

    .line 92
    check-cast v6, Landroidx/appcompat/widget/AppCompatImageView;

    .line 93
    .line 94
    if-eqz v6, :cond_2

    .line 95
    .line 96
    const p2, 0x7f0a0eb0

    .line 97
    .line 98
    .line 99
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    move-object v7, p3

    .line 104
    check-cast v7, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v7, :cond_2

    .line 107
    .line 108
    const p2, 0x7f0a0fce

    .line 109
    .line 110
    .line 111
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    move-object v8, p3

    .line 116
    check-cast v8, Landroid/widget/TextView;

    .line 117
    .line 118
    if-eqz v8, :cond_2

    .line 119
    .line 120
    const p2, 0x7f0a1042

    .line 121
    .line 122
    .line 123
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    move-object v9, p3

    .line 128
    check-cast v9, Landroid/widget/TextView;

    .line 129
    .line 130
    if-eqz v9, :cond_2

    .line 131
    .line 132
    new-instance v1, La/zkk;

    .line 133
    .line 134
    move-object v2, p0

    .line 135
    invoke-direct/range {v1 .. v9}, La/zkk;-><init>(Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 136
    .line 137
    .line 138
    iput-object v1, v2, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->q:La/zkk;

    .line 139
    .line 140
    new-instance p0, La/ydk0;

    .line 141
    .line 142
    invoke-direct {p0, v2}, La/ydk0;-><init>(Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;)V

    .line 143
    .line 144
    .line 145
    new-instance p2, La/mjj0;

    .line 146
    .line 147
    const p3, 0x7f0606a7

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, p3}, Landroid/content/Context;->getColor(I)I

    .line 151
    .line 152
    .line 153
    move-result p3

    .line 154
    const/4 v0, 0x0

    .line 155
    const/high16 v1, 0x40000000    # 2.0f

    .line 156
    .line 157
    invoke-direct {p2, v0, v1, p3}, La/mjj0;-><init>(FFI)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p2}, La/ydk0;->a(La/mjj0;)V

    .line 161
    .line 162
    .line 163
    new-instance p2, La/mjj0;

    .line 164
    .line 165
    const p3, 0x7f0606ac

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p3}, Landroid/content/Context;->getColor(I)I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    const/high16 p3, 0x41000000    # 8.0f

    .line 173
    .line 174
    const/high16 v0, 0x41c00000    # 24.0f

    .line 175
    .line 176
    invoke-direct {p2, p3, v0, p1}, La/mjj0;-><init>(FFI)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, p2}, La/ydk0;->a(La/mjj0;)V

    .line 180
    .line 181
    .line 182
    iput-object p0, v2, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->r:La/ydk0;

    .line 183
    .line 184
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const p2, 0x7f0705ce

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    int-to-float p1, p1

    .line 196
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    const p3, 0x7f0705c6

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 204
    .line 205
    .line 206
    move-result p2

    .line 207
    int-to-float p2, p2

    .line 208
    iput p1, p0, La/ydk0;->e:F

    .line 209
    .line 210
    iput p1, p0, La/ydk0;->f:F

    .line 211
    .line 212
    iput p1, p0, La/ydk0;->g:F

    .line 213
    .line 214
    iput p2, p0, La/ydk0;->h:F

    .line 215
    .line 216
    float-to-int p0, p1

    .line 217
    float-to-int p1, p2

    .line 218
    invoke-virtual {v2, p0, p0, p0, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 222
    .line 223
    .line 224
    move-result p0

    .line 225
    if-nez p0, :cond_1

    .line 226
    .line 227
    return-void

    .line 228
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_2
    move-object v2, p0

    .line 233
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    const-string p1, "Missing required view with ID: "

    .line 242
    .line 243
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v0
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x7f0705c6

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-float v0, v0

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const v2, 0x7f0705ce

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-float v1, v1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    iget-object v4, p0, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->r:La/ydk0;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v5, v4, La/ydk0;->d:Landroid/graphics/RectF;

    .line 42
    .line 43
    iget v6, v4, La/ydk0;->e:F

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    add-float/2addr v6, v7

    .line 47
    iget v8, v4, La/ydk0;->f:F

    .line 48
    .line 49
    add-float/2addr v1, v8

    .line 50
    int-to-float v2, v2

    .line 51
    iget v8, v4, La/ydk0;->g:F

    .line 52
    .line 53
    sub-float/2addr v2, v8

    .line 54
    int-to-float v3, v3

    .line 55
    iget v8, v4, La/ydk0;->h:F

    .line 56
    .line 57
    sub-float/2addr v3, v8

    .line 58
    invoke-virtual {v5, v6, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v4, La/ydk0;->b:Landroid/graphics/Paint;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v4, La/ydk0;->c:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_0

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, La/mjj0;

    .line 87
    .line 88
    iget v4, v3, La/mjj0;->b:F

    .line 89
    .line 90
    iget v6, v3, La/mjj0;->c:I

    .line 91
    .line 92
    iget v3, v3, La/mjj0;->a:F

    .line 93
    .line 94
    invoke-virtual {v1, v4, v7, v3, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v5, v0, v0, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 105
    .line 106
    .line 107
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final setCancelAction(Lkotlin/jvm/functions/Function0;)V
    .locals 3
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
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x7f0706ea

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object p0, p0, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->q:La/zkk;

    .line 16
    .line 17
    iget-object v1, p0, La/zkk;->e:Landroid/view/View;

    .line 18
    .line 19
    check-cast v1, Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La/zkk;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Landroid/widget/FrameLayout;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/zkk;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Landroid/widget/FrameLayout;

    .line 46
    .line 47
    new-instance v0, La/c0;

    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    invoke-direct {v0, p1, v1}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 58
    .line 59
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final setIcon(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->q:La/zkk;

    .line 2
    .line 3
    iget-object p0, p0, La/zkk;->i:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->q:La/zkk;

    .line 2
    .line 3
    iget-object v0, p0, La/zkk;->d:Landroid/widget/TextView;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/zkk;->d:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/snackbar/DsSnackBarView;->q:La/zkk;

    .line 2
    .line 3
    iget-object p0, p0, La/zkk;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
