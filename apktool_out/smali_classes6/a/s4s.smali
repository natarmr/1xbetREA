.class public final La/s4s;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/g5s;

.field public final b:La/o0x;

.field public final c:La/n0o0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/g5s;La/o0x;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p2, La/g5s;->f:I

    .line 8
    .line 9
    iget v1, p2, La/g5s;->c:I

    .line 10
    .line 11
    iget v2, p2, La/g5s;->d:I

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {p0, p1, v3, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, La/s4s;->a:La/g5s;

    .line 22
    .line 23
    iput-object p3, p0, La/s4s;->b:La/o0x;

    .line 24
    .line 25
    new-instance p3, La/q4s;

    .line 26
    .line 27
    invoke-direct {p3, p0, v4}, La/q4s;-><init>(La/s4s;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    iput-object p3, p0, La/s4s;->c:La/n0o0;

    .line 35
    .line 36
    new-instance p3, La/q4s;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {p3, p0, v3}, La/q4s;-><init>(La/s4s;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    iput-object p3, p0, La/s4s;->d:La/n0o0;

    .line 47
    .line 48
    new-instance p3, La/q4s;

    .line 49
    .line 50
    const/4 v5, 0x2

    .line 51
    invoke-direct {p3, p0, v5}, La/q4s;-><init>(La/s4s;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    iput-object p3, p0, La/s4s;->e:La/n0o0;

    .line 59
    .line 60
    new-instance p3, La/q4s;

    .line 61
    .line 62
    const/4 v5, 0x3

    .line 63
    invoke-direct {p3, p0, v5}, La/q4s;-><init>(La/s4s;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    iput-object p3, p0, La/s4s;->f:La/n0o0;

    .line 71
    .line 72
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    sget-object v5, La/f5s;->a:[I

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    aget v5, v5, v6

    .line 83
    .line 84
    if-ne v5, v3, :cond_0

    .line 85
    .line 86
    const v5, 0x7f0d0315

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const v5, 0x7f0d0312

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-virtual {p3, v5, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, La/s4s;->getPictureImageView()Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    iput v3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iput v3, p3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 123
    .line 124
    invoke-virtual {p0}, La/s4s;->getPictureImageView()Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-static {p1, v0, v4}, La/akj0;->g(Landroid/content/Context;II)La/daf;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3}, La/daf;->c()La/akj0;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {p3, v3}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {p0}, La/s4s;->getTechnicalWorksImageView()Lcom/google/android/material/imageview/ShapeableImageView;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    iput v3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    iput v1, p3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 166
    .line 167
    invoke-direct {p0}, La/s4s;->getTechnicalWorksImageView()Lcom/google/android/material/imageview/ShapeableImageView;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    invoke-static {p1, v0, v4}, La/akj0;->g(Landroid/content/Context;II)La/daf;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1}, La/daf;->c()La/akj0;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p3, p1}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, La/s4s;->getLabelTextView()Landroid/widget/TextView;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iget p2, p2, La/g5s;->g:I

    .line 187
    .line 188
    invoke-static {p2, p1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    invoke-virtual {p0}, La/s4s;->getLabelTextView()Landroid/widget/TextView;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setWidth(I)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method private final getTechnicalWorksImageView()Lcom/google/android/material/imageview/ShapeableImageView;
    .locals 0

    .line 1
    iget-object p0, p0, La/s4s;->f:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public final a(La/o0x;La/o0x;La/o0x;La/o0x;La/v4s;Lkotlin/jvm/functions/Function2;La/ljc0;)V
    .locals 11

    .line 1
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, La/s4s;->g:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v0, La/v4s;->b:La/v4s;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, La/s4s;->a:La/g5s;

    .line 11
    .line 12
    move-object/from16 v4, p5

    .line 13
    .line 14
    if-ne v4, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, La/s4s;->getPictureImageView()Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, La/o5n0;->r(Landroid/view/View;)La/mlu0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, La/mlu0;->a()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/s4s;->getPictureImageView()Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget v5, v2, La/g5s;->c:I

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iget v6, v2, La/g5s;->d:I

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 52
    .line 53
    sget-object v7, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const v9, 0x7f040b08

    .line 63
    .line 64
    .line 65
    invoke-static {v9, v8}, La/m5d;->b(ILandroid/content/Context;)I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const v10, 0x7f040b07

    .line 77
    .line 78
    .line 79
    invoke-static {v10, v9}, La/m5d;->b(ILandroid/content/Context;)I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    filled-new-array {v8, v9}, [I

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-direct {v6, v7, v8}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const v8, 0x7f080921

    .line 95
    .line 96
    .line 97
    invoke-static {v8, v7}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 102
    .line 103
    invoke-static {v5, v4, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v9, Landroid/graphics/Canvas;

    .line 111
    .line 112
    invoke-direct {v9, v8}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, v1, v1, v5, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v9}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget v2, v2, La/g5s;->e:I

    .line 126
    .line 127
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    sub-int/2addr v5, v1

    .line 132
    div-int/lit8 v5, v5, 0x2

    .line 133
    .line 134
    sub-int/2addr v4, v1

    .line 135
    div-int/lit8 v4, v4, 0x2

    .line 136
    .line 137
    if-eqz v7, :cond_0

    .line 138
    .line 139
    add-int v2, v5, v1

    .line 140
    .line 141
    add-int/2addr v1, v4

    .line 142
    invoke-virtual {v7, v5, v4, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 143
    .line 144
    .line 145
    :cond_0
    if-eqz v7, :cond_1

    .line 146
    .line 147
    invoke-virtual {v7, v9}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 148
    .line 149
    .line 150
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 158
    .line 159
    invoke-direct {v2, v1, v8}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_2
    sget-object v0, La/r4s;->a:[I

    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    aget v4, v0, v4

    .line 173
    .line 174
    const/4 v5, 0x1

    .line 175
    if-ne v4, v5, :cond_3

    .line 176
    .line 177
    move-object v4, p3

    .line 178
    goto :goto_0

    .line 179
    :cond_3
    move-object v4, p1

    .line 180
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    aget v0, v0, v2

    .line 185
    .line 186
    if-ne v0, v5, :cond_4

    .line 187
    .line 188
    move-object v2, p4

    .line 189
    goto :goto_1

    .line 190
    :cond_4
    move-object v2, p2

    .line 191
    :goto_1
    invoke-virtual {p0}, La/s4s;->getPictureImageView()Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    new-instance v8, La/p4s;

    .line 196
    .line 197
    move-object/from16 v5, p6

    .line 198
    .line 199
    invoke-direct {v8, p0, v4, v5, v1}, La/p4s;-><init>(La/s4s;La/o0x;Lkotlin/jvm/functions/Function2;B)V

    .line 200
    .line 201
    .line 202
    new-instance v0, La/dg;

    .line 203
    .line 204
    const/16 v6, 0x13

    .line 205
    .line 206
    move-object v3, p0

    .line 207
    move-object v1, v4

    .line 208
    move-object/from16 v4, p7

    .line 209
    .line 210
    invoke-direct/range {v0 .. v6}, La/dg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 211
    .line 212
    .line 213
    iget-object v2, p0, La/s4s;->b:La/o0x;

    .line 214
    .line 215
    invoke-virtual {v7, v1, v2, v8, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->h(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final getGradientView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/s4s;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/View;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getLabelTextView()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/s4s;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/widget/TextView;

    .line 11
    .line 12
    return-object p0
.end method

.method public final getLoadedPictureUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/s4s;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPictureImageView()Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;
    .locals 0

    .line 1
    iget-object p0, p0, La/s4s;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 11
    .line 12
    return-object p0
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, La/s4s;->a:La/g5s;

    .line 6
    .line 7
    iget v0, p2, La/g5s;->b:I

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/high16 v0, 0x40000000    # 2.0f

    .line 14
    .line 15
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget p2, p2, La/g5s;->a:I

    .line 24
    .line 25
    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final setLabel(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/s4s;->getLabelTextView()Landroid/widget/TextView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/s4s;->getGradientView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object p0, p0, La/s4s;->a:La/g5s;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v1, La/g5s;->j:La/g5s;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-ne p0, v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-lez p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p0, v2

    .line 36
    :goto_0
    if-eqz p0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v2, 0x8

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public final setModel(La/u4s;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/u4s;->b:La/v4s;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/s4s;->setType(La/v4s;)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p1, La/u4s;->c:La/o0x;

    .line 10
    .line 11
    iget-object v3, p1, La/u4s;->d:La/o0x;

    .line 12
    .line 13
    iget-object v4, p1, La/u4s;->e:La/o0x;

    .line 14
    .line 15
    iget-object v5, p1, La/u4s;->f:La/o0x;

    .line 16
    .line 17
    iget-object v6, p1, La/u4s;->b:La/v4s;

    .line 18
    .line 19
    iget-object v7, p1, La/u4s;->h:La/t4s;

    .line 20
    .line 21
    iget-object v8, p1, La/u4s;->i:La/ljc0;

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    invoke-virtual/range {v1 .. v8}, La/s4s;->a(La/o0x;La/o0x;La/o0x;La/o0x;La/v4s;Lkotlin/jvm/functions/Function2;La/ljc0;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p1, La/u4s;->g:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, La/s4s;->setLabel(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final setType(La/v4s;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/s4s;->getTechnicalWorksImageView()Lcom/google/android/material/imageview/ShapeableImageView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/v4s;->c:La/v4s;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/16 v1, 0x8

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p1, v0, :cond_4

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    if-eq p1, v0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-direct {p0}, La/s4s;->getTechnicalWorksImageView()Lcom/google/android/material/imageview/ShapeableImageView;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v3, p0, La/s4s;->a:La/g5s;

    .line 40
    .line 41
    iget v4, v3, La/g5s;->c:I

    .line 42
    .line 43
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget v5, v3, La/g5s;->d:I

    .line 52
    .line 53
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const v6, 0x7f040ae8

    .line 65
    .line 66
    .line 67
    invoke-static {v6, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    .line 72
    .line 73
    invoke-direct {v6, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const v7, 0x7f080a23

    .line 81
    .line 82
    .line 83
    invoke-static {v7, v5}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 88
    .line 89
    invoke-static {v4, v1, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v8, Landroid/graphics/Canvas;

    .line 97
    .line 98
    invoke-direct {v8, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, v2, v2, v4, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v8}, Landroid/graphics/drawable/ColorDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget v3, v3, La/g5s;->e:I

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    sub-int/2addr v4, v2

    .line 118
    div-int/2addr v4, v0

    .line 119
    sub-int/2addr v1, v2

    .line 120
    div-int/2addr v1, v0

    .line 121
    if-eqz v5, :cond_2

    .line 122
    .line 123
    add-int v0, v4, v2

    .line 124
    .line 125
    add-int/2addr v2, v1

    .line 126
    invoke-virtual {v5, v4, v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 127
    .line 128
    .line 129
    :cond_2
    if-eqz v5, :cond_3

    .line 130
    .line 131
    invoke-virtual {v5, v8}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 132
    .line 133
    .line 134
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 142
    .line 143
    invoke-direct {v0, p0, v7}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_4
    invoke-virtual {p0}, La/s4s;->getPictureImageView()Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 155
    .line 156
    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const v3, 0x7f040b07

    .line 166
    .line 167
    .line 168
    invoke-static {v3, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    const v3, 0x7f040b08

    .line 180
    .line 181
    .line 182
    invoke-static {v3, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    filled-new-array {v2, p0}, [I

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-direct {v0, v1, p0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 194
    .line 195
    .line 196
    return-void
.end method
