.class public final Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements La/hab;


# instance fields
.field public final a:La/iab;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 283
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 13

    .line 1
    const/4 v10, 0x2

    .line 2
    and-int/lit8 v0, p3, 0x2

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v11, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v11, p2

    .line 10
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v12, 0x7f04014a

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, v11, v12}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v3, 0x7f0d007c

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    const v0, 0x7f0a003c

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 37
    .line 38
    if-eqz v3, :cond_9

    .line 39
    .line 40
    const v0, 0x7f0a020b

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 48
    .line 49
    if-eqz v4, :cond_9

    .line 50
    .line 51
    const v0, 0x7f0a02df

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 59
    .line 60
    if-eqz v5, :cond_9

    .line 61
    .line 62
    const v0, 0x7f0a03b3

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 70
    .line 71
    if-eqz v6, :cond_9

    .line 72
    .line 73
    const v0, 0x7f0a0861

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Landroid/widget/ImageView;

    .line 81
    .line 82
    if-eqz v7, :cond_9

    .line 83
    .line 84
    const v0, 0x7f0a0e3c

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    check-cast v8, Landroid/widget/Space;

    .line 92
    .line 93
    if-eqz v8, :cond_9

    .line 94
    .line 95
    new-instance v0, La/iab;

    .line 96
    .line 97
    move-object v2, v3

    .line 98
    move-object v3, v4

    .line 99
    move-object v4, v5

    .line 100
    move-object v5, v6

    .line 101
    move-object v6, v7

    .line 102
    move-object v7, v8

    .line 103
    const/4 v8, 0x0

    .line 104
    move-object v1, p0

    .line 105
    invoke-direct/range {v0 .. v8}, La/iab;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 109
    .line 110
    sget-object v0, La/bqd0;->p:[I

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    invoke-virtual {p1, v11, v0, v12, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const/4 v7, 0x6

    .line 118
    invoke-virtual {v0, v7, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    const/16 v8, 0x8

    .line 123
    .line 124
    if-eqz v7, :cond_1

    .line 125
    .line 126
    move v9, v5

    .line 127
    goto :goto_1

    .line 128
    :cond_1
    move v9, v8

    .line 129
    :goto_1
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 130
    .line 131
    .line 132
    if-eqz v7, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 141
    .line 142
    .line 143
    :cond_2
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a()V

    .line 144
    .line 145
    .line 146
    const/4 v7, 0x4

    .line 147
    invoke-virtual {v0, v7, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-eqz v7, :cond_3

    .line 152
    .line 153
    move v9, v5

    .line 154
    goto :goto_2

    .line 155
    :cond_3
    move v9, v8

    .line 156
    :goto_2
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 157
    .line 158
    .line 159
    if-eqz v7, :cond_4

    .line 160
    .line 161
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 168
    .line 169
    .line 170
    :cond_4
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a()V

    .line 171
    .line 172
    .line 173
    const/4 v7, 0x5

    .line 174
    invoke-virtual {v0, v7, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_5

    .line 179
    .line 180
    move v9, v5

    .line 181
    goto :goto_3

    .line 182
    :cond_5
    move v9, v8

    .line 183
    :goto_3
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    .line 184
    .line 185
    .line 186
    if-eqz v7, :cond_6

    .line 187
    .line 188
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v8}, Landroid/view/View;->setVisibility(I)V

    .line 195
    .line 196
    .line 197
    :cond_6
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a()V

    .line 198
    .line 199
    .line 200
    const/4 v7, 0x7

    .line 201
    invoke-virtual {v0, v7, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    if-eqz v7, :cond_7

    .line 206
    .line 207
    move v9, v5

    .line 208
    goto :goto_4

    .line 209
    :cond_7
    move v9, v8

    .line 210
    :goto_4
    invoke-virtual {v6, v9}, Landroid/view/View;->setVisibility(I)V

    .line 211
    .line 212
    .line 213
    if-eqz v7, :cond_8

    .line 214
    .line 215
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 222
    .line 223
    .line 224
    :cond_8
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setButtonIcon(Landroid/graphics/drawable/Drawable;)V

    .line 232
    .line 233
    .line 234
    const/4 v2, 0x1

    .line 235
    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCount(Ljava/lang/Integer;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v10}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 251
    .line 252
    .line 253
    const/4 v2, 0x3

    .line 254
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-direct {p0, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    const-string v1, "Missing required view with ID: "

    .line 274
    .line 275
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v2
.end method

.method private final setIconTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object v0, p0, La/iab;->h:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/Space;

    .line 6
    .line 7
    iget-object v1, p0, La/iab;->f:Landroid/view/View;

    .line 8
    .line 9
    check-cast v1, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, La/iab;->e:Landroid/view/View;

    .line 20
    .line 21
    check-cast v1, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, La/iab;->b:Landroid/view/View;

    .line 30
    .line 31
    check-cast v1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ne v1, v2, :cond_0

    .line 38
    .line 39
    iget-object p0, p0, La/iab;->c:Landroid/view/View;

    .line 40
    .line 41
    check-cast p0, Landroid/widget/ImageView;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-ne p0, v2, :cond_0

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final setAccordionExpanded(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setButtonIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->b:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getIcon()Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final setCheckBoxChecked(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object v0, v0, La/iab;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setChecked(Z)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setCheckBoxEnabledWithAlpha(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object v0, p0, La/iab;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setEnabled(Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/iab;->f:Landroid/view/View;

    .line 11
    .line 12
    check-cast p0, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/high16 p1, 0x3f800000    # 1.0f

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p1, 0x3e4ccccd    # 0.2f

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setCount(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setCount(Ljava/lang/Integer;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setCounterBackgroundColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->h(Ljava/lang/Integer;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setCounterColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setTextColor(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 5
    .line 6
    iget-object v0, p0, La/iab;->f:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setEnabled(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/iab;->g:Landroid/view/View;

    .line 14
    .line 15
    check-cast v0, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 16
    .line 17
    invoke-static {v0, p1}, La/jmu0;->b(Landroid/view/View;Z)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/iab;->e:Landroid/view/View;

    .line 21
    .line 22
    check-cast p0, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 23
    .line 24
    invoke-static {p0, p1}, La/jmu0;->b(Landroid/view/View;Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setOnAccordionClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setOnButtonClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->b:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setOnCheckBoxCheckedChangeListener(La/qg60;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setCheckedChangeListener(La/qg60;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setOnCheckBoxClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->a:La/iab;

    .line 5
    .line 6
    iget-object p0, p0, La/iab;->f:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setChecked(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
