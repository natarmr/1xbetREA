.class public final Lorg/xplatform/uikit/components/header/DsHeader;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/View$OnClickListener;

.field public b:Landroid/view/View$OnClickListener;

.field public c:La/vrv;

.field public d:La/w0i;

.field public e:La/prv;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 273
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/header/DsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/header/DsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 19

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
    const v5, 0x7f040417

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v3, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    const v7, 0x7f07015a

    .line 28
    .line 29
    .line 30
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    sget-object v7, La/vrv;->a:La/vrv;

    .line 35
    .line 36
    iput-object v7, v0, Lorg/xplatform/uikit/components/header/DsHeader;->c:La/vrv;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    iput-object v8, v0, Lorg/xplatform/uikit/components/header/DsHeader;->f:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v8, La/bqd0;->D:[I

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    invoke-virtual {v1, v3, v8, v5, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const/4 v5, 0x3

    .line 52
    invoke-virtual {v3, v5, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const/4 v8, 0x1

    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    if-eq v5, v8, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    sget-object v7, La/vrv;->b:La/vrv;

    .line 63
    .line 64
    :cond_2
    :goto_1
    iput-object v7, v0, Lorg/xplatform/uikit/components/header/DsHeader;->c:La/vrv;

    .line 65
    .line 66
    const/16 v5, 0x9

    .line 67
    .line 68
    invoke-virtual {v3, v5, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    const/16 v7, 0xe

    .line 73
    .line 74
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-static {v3, v1, v7}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    if-nez v7, :cond_3

    .line 83
    .line 84
    const-string v7, ""

    .line 85
    .line 86
    :cond_3
    move-object v11, v7

    .line 87
    const/4 v7, 0x7

    .line 88
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-static {v3, v1, v10}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    invoke-virtual {v3, v9, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    const/16 v12, 0xd

    .line 105
    .line 106
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    invoke-static {v3, v1, v12}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    const/16 v12, 0xb

    .line 115
    .line 116
    invoke-virtual {v3, v12, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    const/4 v15, -0x1

    .line 121
    invoke-virtual {v3, v2, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    const/16 v16, 0xc

    .line 126
    .line 127
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v3, v4}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    const/16 v15, 0xa

    .line 136
    .line 137
    invoke-virtual {v3, v15}, Landroid/content/res/TypedArray;->getType(I)I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eq v9, v8, :cond_5

    .line 142
    .line 143
    const/16 v1, 0x1c

    .line 144
    .line 145
    if-eq v9, v1, :cond_4

    .line 146
    .line 147
    const/16 v1, 0x1d

    .line 148
    .line 149
    if-eq v9, v1, :cond_4

    .line 150
    .line 151
    const/4 v1, 0x0

    .line 152
    goto :goto_2

    .line 153
    :cond_4
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-static {v3, v1}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    goto :goto_2

    .line 162
    :cond_5
    const/4 v9, 0x0

    .line 163
    invoke-virtual {v3, v15, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    invoke-static {v9, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    :goto_2
    const/16 v9, 0x8

    .line 176
    .line 177
    invoke-virtual {v3, v9, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    const/4 v9, 0x4

    .line 182
    const/4 v15, -0x1

    .line 183
    invoke-virtual {v3, v9, v15}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-eq v9, v15, :cond_6

    .line 188
    .line 189
    invoke-virtual {v0, v9, v9}, Lorg/xplatform/uikit/components/header/DsHeader;->c(II)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    const/4 v9, 0x6

    .line 194
    invoke-virtual {v3, v9, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    const/4 v15, 0x5

    .line 199
    invoke-virtual {v3, v15, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    invoke-virtual {v0, v9, v6}, Lorg/xplatform/uikit/components/header/DsHeader;->c(II)V

    .line 204
    .line 205
    .line 206
    :goto_3
    new-instance v6, La/l0x;

    .line 207
    .line 208
    invoke-direct {v6, v7}, La/l0x;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 209
    .line 210
    .line 211
    if-eqz v7, :cond_7

    .line 212
    .line 213
    move-object/from16 v16, v6

    .line 214
    .line 215
    :goto_4
    move v6, v10

    .line 216
    goto :goto_5

    .line 217
    :cond_7
    const/16 v16, 0x0

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :goto_5
    new-instance v10, La/nrv;

    .line 221
    .line 222
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v15

    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    const/16 v18, 0xc0

    .line 229
    .line 230
    invoke-direct/range {v10 .. v18}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 231
    .line 232
    .line 233
    iput-object v10, v0, Lorg/xplatform/uikit/components/header/DsHeader;->e:La/prv;

    .line 234
    .line 235
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/header/DsHeader;->a()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit/components/header/DsHeader;->setTagColor(Ljava/lang/Integer;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/header/DsHeader;->setCounter(Ljava/lang/Integer;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/header/DsHeader;->setLabelColor(Ljava/lang/Integer;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 252
    .line 253
    .line 254
    if-eqz v5, :cond_8

    .line 255
    .line 256
    iget-object v1, v0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 257
    .line 258
    if-eqz v1, :cond_8

    .line 259
    .line 260
    invoke-interface {v1}, La/w0i;->c()V

    .line 261
    .line 262
    .line 263
    :cond_8
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 264
    .line 265
    .line 266
    const-string v1, "dsHeader"

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/header/DsHeader;->setTag(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->c:La/vrv;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, La/y0i;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, La/y0i;-><init>(Landroid/content/Context;)V

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
    new-instance v0, La/x0i;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, La/x0i;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->a:Landroid/view/View$OnClickListener;

    .line 42
    .line 43
    invoke-interface {v0, v1}, La/w0i;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->b:Landroid/view/View$OnClickListener;

    .line 47
    .line 48
    invoke-interface {v0, v1}, La/w0i;->setTagClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->e:La/prv;

    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-interface {v0, v1}, La/w0i;->setModel(La/prv;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    check-cast v1, Landroid/view/View;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iput-object v0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 68
    .line 69
    iget-object v1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->f:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    const-string p0, "currentModel"

    .line 79
    .line 80
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    throw p0
.end method

.method public final b(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p1, La/orv;->a:La/orv;

    .line 8
    .line 9
    invoke-interface {p0, p1}, La/w0i;->setModel(La/prv;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final c(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, p1, v0, p2, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final getButton()Lorg/xplatform/uikit/components/buttons/DsButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, La/w0i;->getButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, La/w0i;->getLabelText()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final getTagView()Lorg/xplatform/uikit/components/tag/DsTag;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, La/w0i;->getTag()Lorg/xplatform/uikit/components/tag/DsTag;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final setButtonClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->a:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, La/w0i;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setButtonLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setButtonLabel(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setCounter(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setCounter(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setIconColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setIconColor(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setLabel(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setLabelClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setLabelClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setLabelColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setLabelColor(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setModel(La/prv;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->e:La/prv;

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, p1}, La/w0i;->setModel(La/prv;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "dsHeader"

    .line 2
    .line 3
    invoke-super {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p0, Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final setTagClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->b:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, La/w0i;->setTagClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setTagColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setTagColor(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setTagLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setTagLabel(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setTagStyle(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/w0i;->setTagStyle(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setType(La/vrv;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/header/DsHeader;->c:La/vrv;

    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/header/DsHeader;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
