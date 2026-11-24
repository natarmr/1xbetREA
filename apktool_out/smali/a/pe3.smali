.class public final La/pe3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:La/goq0;

.field public c:La/goq0;

.field public d:La/goq0;

.field public e:La/goq0;

.field public f:La/goq0;

.field public g:La/goq0;

.field public h:La/goq0;

.field public final i:La/ve3;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Ljava/lang/String;

.field public n:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, La/pe3;->j:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, La/pe3;->k:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, La/pe3;->m:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p1, p0, La/pe3;->a:Landroid/widget/TextView;

    .line 14
    .line 15
    new-instance v0, La/ve3;

    .line 16
    .line 17
    invoke-direct {v0, p1}, La/ve3;-><init>(Landroid/widget/TextView;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/pe3;->i:La/ve3;

    .line 21
    .line 22
    return-void
.end method

.method public static d(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x1a

    .line 5
    .line 6
    if-lt v0, v2, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, La/ne3;->c(Landroid/widget/TextView;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    invoke-static {p0, v1}, La/ne3;->f(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    move-object v1, v3

    .line 22
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 23
    .line 24
    .line 25
    if-lt v0, v2, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    invoke-static {p0, v1}, La/ne3;->f(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-void
.end method

.method public static e(Landroid/content/Context;La/td3;I)La/goq0;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, La/td3;->a:La/dtf0;

    .line 3
    .line 4
    invoke-virtual {v0, p2, p0}, La/dtf0;->g(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, La/goq0;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, La/goq0;->d:Z

    .line 18
    .line 19
    iput-object p0, p1, La/goq0;->a:Landroid/content/res/ColorStateList;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;La/goq0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/pe3;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, La/td3;->b:Landroid/graphics/PorterDuff$Mode;

    .line 12
    .line 13
    invoke-static {p1, p2, p0}, La/dtf0;->i(Landroid/graphics/drawable/Drawable;La/goq0;[I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, La/pe3;->b:La/goq0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/pe3;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/pe3;->c:La/goq0;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, La/pe3;->d:La/goq0;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, La/pe3;->e:La/goq0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, La/pe3;->b:La/goq0;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, La/pe3;->a(Landroid/graphics/drawable/Drawable;La/goq0;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, La/pe3;->c:La/goq0;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, La/pe3;->a(Landroid/graphics/drawable/Drawable;La/goq0;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, La/pe3;->d:La/goq0;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, La/pe3;->a(Landroid/graphics/drawable/Drawable;La/goq0;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, La/pe3;->e:La/goq0;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, La/pe3;->a(Landroid/graphics/drawable/Drawable;La/goq0;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, La/pe3;->f:La/goq0;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, La/pe3;->g:La/goq0;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    :goto_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget-object v2, v0, v2

    .line 70
    .line 71
    iget-object v3, p0, La/pe3;->f:La/goq0;

    .line 72
    .line 73
    invoke-virtual {p0, v2, v3}, La/pe3;->a(Landroid/graphics/drawable/Drawable;La/goq0;)V

    .line 74
    .line 75
    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    iget-object v1, p0, La/pe3;->g:La/goq0;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, La/pe3;->a(Landroid/graphics/drawable/Drawable;La/goq0;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final c(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 2
    .line 3
    iget-object v1, p0, La/pe3;->a:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget p1, p0, La/pe3;->k:I

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne p1, v2, :cond_0

    .line 11
    .line 12
    iget p1, p0, La/pe3;->j:I

    .line 13
    .line 14
    invoke-virtual {v1, v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    if-eqz p1, :cond_2

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_0
    iget-object p0, p0, La/pe3;->m:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v0, 0x1a

    .line 35
    .line 36
    if-lt p1, v0, :cond_3

    .line 37
    .line 38
    invoke-static {v1, p0}, La/ne3;->f(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void
.end method

.method public final f()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, La/pe3;->h:La/goq0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/goq0;->a:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final g()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, La/pe3;->h:La/goq0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/goq0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final h(Landroid/util/AttributeSet;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    iget-object v1, v0, La/pe3;->a:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    invoke-static {}, La/td3;->a()La/td3;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    const/4 v10, 0x0

    .line 18
    sget-object v2, La/mqd0;->h:[I

    .line 19
    .line 20
    invoke-static {v5, v10, v8, v3, v2}, La/ywu;->y(IILandroid/content/Context;Landroid/util/AttributeSet;[I)La/ywu;

    .line 21
    .line 22
    .line 23
    move-result-object v11

    .line 24
    move-object v3, v2

    .line 25
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v4, v11, La/ywu;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Landroid/content/res/TypedArray;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    move v6, v5

    .line 35
    move-object v5, v4

    .line 36
    move-object/from16 v4, p1

    .line 37
    .line 38
    invoke-static/range {v1 .. v7}, La/rgu0;->n(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 39
    .line 40
    .line 41
    move-object v7, v1

    .line 42
    move-object v3, v4

    .line 43
    move v5, v6

    .line 44
    iget-object v1, v11, La/ywu;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroid/content/res/TypedArray;

    .line 47
    .line 48
    const/4 v12, -0x1

    .line 49
    invoke-virtual {v1, v10, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/4 v13, 0x3

    .line 54
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    invoke-virtual {v1, v13, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-static {v8, v9, v4}, La/pe3;->e(Landroid/content/Context;La/td3;I)La/goq0;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iput-object v4, v0, La/pe3;->b:La/goq0;

    .line 69
    .line 70
    :cond_0
    const/4 v14, 0x1

    .line 71
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    invoke-virtual {v1, v14, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-static {v8, v9, v4}, La/pe3;->e(Landroid/content/Context;La/td3;I)La/goq0;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    iput-object v4, v0, La/pe3;->c:La/goq0;

    .line 86
    .line 87
    :cond_1
    const/4 v15, 0x4

    .line 88
    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, v15, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-static {v8, v9, v4}, La/pe3;->e(Landroid/content/Context;La/td3;I)La/goq0;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iput-object v4, v0, La/pe3;->d:La/goq0;

    .line 103
    .line 104
    :cond_2
    const/4 v4, 0x2

    .line 105
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_3

    .line 110
    .line 111
    invoke-virtual {v1, v4, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-static {v8, v9, v6}, La/pe3;->e(Landroid/content/Context;La/td3;I)La/goq0;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    iput-object v6, v0, La/pe3;->e:La/goq0;

    .line 120
    .line 121
    :cond_3
    const/4 v6, 0x5

    .line 122
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 123
    .line 124
    .line 125
    move-result v16

    .line 126
    if-eqz v16, :cond_4

    .line 127
    .line 128
    invoke-virtual {v1, v6, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    invoke-static {v8, v9, v4}, La/pe3;->e(Landroid/content/Context;La/td3;I)La/goq0;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    iput-object v4, v0, La/pe3;->f:La/goq0;

    .line 137
    .line 138
    :cond_4
    const/4 v4, 0x6

    .line 139
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 140
    .line 141
    .line 142
    move-result v17

    .line 143
    if-eqz v17, :cond_5

    .line 144
    .line 145
    invoke-virtual {v1, v4, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-static {v8, v9, v1}, La/pe3;->e(Landroid/content/Context;La/td3;I)La/goq0;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iput-object v1, v0, La/pe3;->g:La/goq0;

    .line 154
    .line 155
    :cond_5
    invoke-virtual {v11}, La/ywu;->A()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    .line 163
    .line 164
    sget-object v11, La/mqd0;->x:[I

    .line 165
    .line 166
    const/16 v4, 0xe

    .line 167
    .line 168
    const/16 v13, 0xf

    .line 169
    .line 170
    if-eq v2, v12, :cond_8

    .line 171
    .line 172
    new-instance v6, La/ywu;

    .line 173
    .line 174
    invoke-virtual {v8, v2, v11}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-direct {v6, v8, v2}, La/ywu;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 179
    .line 180
    .line 181
    if-nez v1, :cond_6

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 184
    .line 185
    .line 186
    move-result v20

    .line 187
    if-eqz v20, :cond_6

    .line 188
    .line 189
    invoke-virtual {v2, v4, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 190
    .line 191
    .line 192
    move-result v20

    .line 193
    move/from16 v21, v20

    .line 194
    .line 195
    const/16 v20, 0x1

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_6
    move/from16 v20, v10

    .line 199
    .line 200
    move/from16 v21, v20

    .line 201
    .line 202
    :goto_0
    invoke-virtual {v0, v8, v6}, La/pe3;->o(Landroid/content/Context;La/ywu;)Z

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 206
    .line 207
    .line 208
    move-result v22

    .line 209
    if-eqz v22, :cond_7

    .line 210
    .line 211
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    goto :goto_1

    .line 216
    :cond_7
    const/4 v2, 0x0

    .line 217
    :goto_1
    invoke-virtual {v6}, La/ywu;->A()V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_8
    move/from16 v20, v10

    .line 222
    .line 223
    move/from16 v21, v20

    .line 224
    .line 225
    const/4 v2, 0x0

    .line 226
    :goto_2
    new-instance v6, La/ywu;

    .line 227
    .line 228
    invoke-virtual {v8, v3, v11, v5, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-direct {v6, v8, v11}, La/ywu;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 233
    .line 234
    .line 235
    if-nez v1, :cond_9

    .line 236
    .line 237
    invoke-virtual {v11, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 238
    .line 239
    .line 240
    move-result v22

    .line 241
    if-eqz v22, :cond_9

    .line 242
    .line 243
    invoke-virtual {v11, v4, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 244
    .line 245
    .line 246
    move-result v21

    .line 247
    const/16 v20, 0x1

    .line 248
    .line 249
    :cond_9
    move/from16 v4, v21

    .line 250
    .line 251
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 252
    .line 253
    .line 254
    move-result v21

    .line 255
    if-eqz v21, :cond_a

    .line 256
    .line 257
    invoke-virtual {v11, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    :cond_a
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 262
    .line 263
    const/16 v14, 0x1c

    .line 264
    .line 265
    if-lt v13, v14, :cond_b

    .line 266
    .line 267
    invoke-virtual {v11, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 268
    .line 269
    .line 270
    move-result v13

    .line 271
    if-eqz v13, :cond_b

    .line 272
    .line 273
    invoke-virtual {v11, v10, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 274
    .line 275
    .line 276
    move-result v11

    .line 277
    if-nez v11, :cond_b

    .line 278
    .line 279
    const/4 v11, 0x0

    .line 280
    invoke-virtual {v7, v10, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 281
    .line 282
    .line 283
    :cond_b
    invoke-virtual {v0, v8, v6}, La/pe3;->o(Landroid/content/Context;La/ywu;)Z

    .line 284
    .line 285
    .line 286
    invoke-virtual {v6}, La/ywu;->A()V

    .line 287
    .line 288
    .line 289
    if-nez v1, :cond_c

    .line 290
    .line 291
    if-eqz v20, :cond_c

    .line 292
    .line 293
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 294
    .line 295
    .line 296
    :cond_c
    invoke-virtual {v0, v10}, La/pe3;->c(Z)V

    .line 297
    .line 298
    .line 299
    if-eqz v2, :cond_d

    .line 300
    .line 301
    invoke-static {v2}, Landroid/os/LocaleList;->forLanguageTags(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setTextLocales(Landroid/os/LocaleList;)V

    .line 306
    .line 307
    .line 308
    :cond_d
    iget-object v11, v0, La/pe3;->i:La/ve3;

    .line 309
    .line 310
    iget-object v13, v11, La/ve3;->j:Landroid/content/Context;

    .line 311
    .line 312
    sget-object v2, La/mqd0;->i:[I

    .line 313
    .line 314
    invoke-virtual {v13, v3, v2, v5, v10}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    iget-object v0, v11, La/ve3;->i:Landroid/widget/TextView;

    .line 319
    .line 320
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    const/4 v6, 0x0

    .line 325
    const/4 v12, 0x5

    .line 326
    const/4 v14, 0x2

    .line 327
    invoke-static/range {v0 .. v6}, La/rgu0;->n(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_e

    .line 335
    .line 336
    invoke-virtual {v4, v12, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    iput v0, v11, La/ve3;->a:I

    .line 341
    .line 342
    :cond_e
    invoke-virtual {v4, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    const/high16 v1, -0x40800000    # -1.0f

    .line 347
    .line 348
    if-eqz v0, :cond_f

    .line 349
    .line 350
    invoke-virtual {v4, v15, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    goto :goto_3

    .line 355
    :cond_f
    move v0, v1

    .line 356
    :goto_3
    invoke-virtual {v4, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    if-eqz v5, :cond_10

    .line 361
    .line 362
    invoke-virtual {v4, v14, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    :goto_4
    const/4 v6, 0x1

    .line 367
    goto :goto_5

    .line 368
    :cond_10
    move v5, v1

    .line 369
    goto :goto_4

    .line 370
    :goto_5
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 371
    .line 372
    .line 373
    move-result v15

    .line 374
    if-eqz v15, :cond_11

    .line 375
    .line 376
    invoke-virtual {v4, v6, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 377
    .line 378
    .line 379
    move-result v15

    .line 380
    :goto_6
    const/4 v6, 0x3

    .line 381
    goto :goto_7

    .line 382
    :cond_11
    move v15, v1

    .line 383
    goto :goto_6

    .line 384
    :goto_7
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 385
    .line 386
    .line 387
    move-result v17

    .line 388
    move/from16 p0, v1

    .line 389
    .line 390
    if-eqz v17, :cond_14

    .line 391
    .line 392
    invoke-virtual {v4, v6, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    if-lez v1, :cond_14

    .line 397
    .line 398
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-virtual {v6, v1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->length()I

    .line 407
    .line 408
    .line 409
    move-result v6

    .line 410
    new-array v12, v6, [I

    .line 411
    .line 412
    if-lez v6, :cond_13

    .line 413
    .line 414
    :goto_8
    if-ge v10, v6, :cond_12

    .line 415
    .line 416
    const/4 v14, -0x1

    .line 417
    invoke-virtual {v1, v10, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 418
    .line 419
    .line 420
    move-result v23

    .line 421
    aput v23, v12, v10

    .line 422
    .line 423
    add-int/lit8 v10, v10, 0x1

    .line 424
    .line 425
    const/4 v14, 0x2

    .line 426
    goto :goto_8

    .line 427
    :cond_12
    invoke-static {v12}, La/ve3;->b([I)[I

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    iput-object v6, v11, La/ve3;->f:[I

    .line 432
    .line 433
    invoke-virtual {v11}, La/ve3;->i()Z

    .line 434
    .line 435
    .line 436
    :cond_13
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 437
    .line 438
    .line 439
    :cond_14
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v11}, La/ve3;->j()Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_19

    .line 447
    .line 448
    iget v1, v11, La/ve3;->a:I

    .line 449
    .line 450
    const/4 v6, 0x1

    .line 451
    if-ne v1, v6, :cond_1a

    .line 452
    .line 453
    iget-boolean v1, v11, La/ve3;->g:Z

    .line 454
    .line 455
    if-nez v1, :cond_18

    .line 456
    .line 457
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    cmpl-float v4, v5, p0

    .line 466
    .line 467
    if-nez v4, :cond_15

    .line 468
    .line 469
    const/high16 v4, 0x41400000    # 12.0f

    .line 470
    .line 471
    const/4 v14, 0x2

    .line 472
    invoke-static {v14, v4, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 473
    .line 474
    .line 475
    move-result v5

    .line 476
    goto :goto_9

    .line 477
    :cond_15
    const/4 v14, 0x2

    .line 478
    :goto_9
    cmpl-float v4, v15, p0

    .line 479
    .line 480
    if-nez v4, :cond_16

    .line 481
    .line 482
    const/high16 v4, 0x42e00000    # 112.0f

    .line 483
    .line 484
    invoke-static {v14, v4, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 485
    .line 486
    .line 487
    move-result v15

    .line 488
    :cond_16
    cmpl-float v1, v0, p0

    .line 489
    .line 490
    if-nez v1, :cond_17

    .line 491
    .line 492
    const/high16 v0, 0x3f800000    # 1.0f

    .line 493
    .line 494
    :cond_17
    invoke-virtual {v11, v5, v15, v0}, La/ve3;->k(FFF)V

    .line 495
    .line 496
    .line 497
    :cond_18
    invoke-virtual {v11}, La/ve3;->h()Z

    .line 498
    .line 499
    .line 500
    goto :goto_a

    .line 501
    :cond_19
    const/4 v0, 0x0

    .line 502
    iput v0, v11, La/ve3;->a:I

    .line 503
    .line 504
    :cond_1a
    :goto_a
    sget-boolean v0, La/cmu0;->c:Z

    .line 505
    .line 506
    if-eqz v0, :cond_1c

    .line 507
    .line 508
    iget v0, v11, La/ve3;->a:I

    .line 509
    .line 510
    if-eqz v0, :cond_1c

    .line 511
    .line 512
    iget-object v0, v11, La/ve3;->f:[I

    .line 513
    .line 514
    array-length v1, v0

    .line 515
    if-lez v1, :cond_1c

    .line 516
    .line 517
    invoke-static {v7}, La/ne3;->b(Landroid/widget/TextView;)I

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    int-to-float v1, v1

    .line 522
    cmpl-float v1, v1, p0

    .line 523
    .line 524
    if-eqz v1, :cond_1b

    .line 525
    .line 526
    iget v0, v11, La/ve3;->d:F

    .line 527
    .line 528
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    iget v1, v11, La/ve3;->e:F

    .line 533
    .line 534
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    iget v4, v11, La/ve3;->c:F

    .line 539
    .line 540
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    invoke-static {v7, v0, v1, v4}, La/ne3;->d(Landroid/widget/TextView;III)V

    .line 545
    .line 546
    .line 547
    goto :goto_b

    .line 548
    :cond_1b
    invoke-static {v7, v0}, La/ne3;->e(Landroid/widget/TextView;[I)V

    .line 549
    .line 550
    .line 551
    :cond_1c
    :goto_b
    invoke-virtual {v8, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    const/16 v1, 0x8

    .line 556
    .line 557
    const/4 v14, -0x1

    .line 558
    invoke-virtual {v0, v1, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    if-eq v1, v14, :cond_1d

    .line 563
    .line 564
    invoke-virtual {v9, v1, v8}, La/td3;->b(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    goto :goto_c

    .line 569
    :cond_1d
    const/4 v1, 0x0

    .line 570
    :goto_c
    const/16 v2, 0xd

    .line 571
    .line 572
    invoke-virtual {v0, v2, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    if-eq v2, v14, :cond_1e

    .line 577
    .line 578
    invoke-virtual {v9, v2, v8}, La/td3;->b(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    goto :goto_d

    .line 583
    :cond_1e
    const/4 v2, 0x0

    .line 584
    :goto_d
    const/16 v3, 0x9

    .line 585
    .line 586
    invoke-virtual {v0, v3, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    if-eq v3, v14, :cond_1f

    .line 591
    .line 592
    invoke-virtual {v9, v3, v8}, La/td3;->b(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    :goto_e
    const/4 v4, 0x6

    .line 597
    goto :goto_f

    .line 598
    :cond_1f
    const/4 v3, 0x0

    .line 599
    goto :goto_e

    .line 600
    :goto_f
    invoke-virtual {v0, v4, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 601
    .line 602
    .line 603
    move-result v4

    .line 604
    if-eq v4, v14, :cond_20

    .line 605
    .line 606
    invoke-virtual {v9, v4, v8}, La/td3;->b(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    goto :goto_10

    .line 611
    :cond_20
    const/4 v4, 0x0

    .line 612
    :goto_10
    const/16 v5, 0xa

    .line 613
    .line 614
    invoke-virtual {v0, v5, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 615
    .line 616
    .line 617
    move-result v5

    .line 618
    if-eq v5, v14, :cond_21

    .line 619
    .line 620
    invoke-virtual {v9, v5, v8}, La/td3;->b(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    goto :goto_11

    .line 625
    :cond_21
    const/4 v5, 0x0

    .line 626
    :goto_11
    const/4 v6, 0x7

    .line 627
    invoke-virtual {v0, v6, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 628
    .line 629
    .line 630
    move-result v6

    .line 631
    if-eq v6, v14, :cond_22

    .line 632
    .line 633
    invoke-virtual {v9, v6, v8}, La/td3;->b(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 634
    .line 635
    .line 636
    move-result-object v6

    .line 637
    goto :goto_12

    .line 638
    :cond_22
    const/4 v6, 0x0

    .line 639
    :goto_12
    if-nez v5, :cond_2d

    .line 640
    .line 641
    if-eqz v6, :cond_23

    .line 642
    .line 643
    goto :goto_1b

    .line 644
    :cond_23
    if-nez v1, :cond_24

    .line 645
    .line 646
    if-nez v2, :cond_24

    .line 647
    .line 648
    if-nez v3, :cond_24

    .line 649
    .line 650
    if-eqz v4, :cond_32

    .line 651
    .line 652
    :cond_24
    invoke-virtual {v7}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    const/16 v17, 0x0

    .line 657
    .line 658
    aget-object v6, v5, v17

    .line 659
    .line 660
    if-nez v6, :cond_25

    .line 661
    .line 662
    const/16 v20, 0x2

    .line 663
    .line 664
    aget-object v9, v5, v20

    .line 665
    .line 666
    if-eqz v9, :cond_26

    .line 667
    .line 668
    :cond_25
    const/16 v18, 0x3

    .line 669
    .line 670
    goto :goto_17

    .line 671
    :cond_26
    invoke-virtual {v7}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 672
    .line 673
    .line 674
    move-result-object v5

    .line 675
    if-eqz v1, :cond_27

    .line 676
    .line 677
    goto :goto_13

    .line 678
    :cond_27
    aget-object v1, v5, v17

    .line 679
    .line 680
    :goto_13
    if-eqz v2, :cond_28

    .line 681
    .line 682
    goto :goto_14

    .line 683
    :cond_28
    const/16 v19, 0x1

    .line 684
    .line 685
    aget-object v2, v5, v19

    .line 686
    .line 687
    :goto_14
    if-eqz v3, :cond_29

    .line 688
    .line 689
    goto :goto_15

    .line 690
    :cond_29
    const/16 v20, 0x2

    .line 691
    .line 692
    aget-object v3, v5, v20

    .line 693
    .line 694
    :goto_15
    if-eqz v4, :cond_2a

    .line 695
    .line 696
    goto :goto_16

    .line 697
    :cond_2a
    const/16 v18, 0x3

    .line 698
    .line 699
    aget-object v4, v5, v18

    .line 700
    .line 701
    :goto_16
    invoke-virtual {v7, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 702
    .line 703
    .line 704
    goto :goto_20

    .line 705
    :goto_17
    if-eqz v2, :cond_2b

    .line 706
    .line 707
    goto :goto_18

    .line 708
    :cond_2b
    const/16 v19, 0x1

    .line 709
    .line 710
    aget-object v2, v5, v19

    .line 711
    .line 712
    :goto_18
    if-eqz v4, :cond_2c

    .line 713
    .line 714
    :goto_19
    const/16 v20, 0x2

    .line 715
    .line 716
    goto :goto_1a

    .line 717
    :cond_2c
    aget-object v4, v5, v18

    .line 718
    .line 719
    goto :goto_19

    .line 720
    :goto_1a
    aget-object v1, v5, v20

    .line 721
    .line 722
    invoke-virtual {v7, v6, v2, v1, v4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 723
    .line 724
    .line 725
    goto :goto_20

    .line 726
    :cond_2d
    :goto_1b
    invoke-virtual {v7}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    if-eqz v5, :cond_2e

    .line 731
    .line 732
    goto :goto_1c

    .line 733
    :cond_2e
    const/16 v17, 0x0

    .line 734
    .line 735
    aget-object v5, v1, v17

    .line 736
    .line 737
    :goto_1c
    if-eqz v2, :cond_2f

    .line 738
    .line 739
    goto :goto_1d

    .line 740
    :cond_2f
    const/16 v19, 0x1

    .line 741
    .line 742
    aget-object v2, v1, v19

    .line 743
    .line 744
    :goto_1d
    if-eqz v6, :cond_30

    .line 745
    .line 746
    goto :goto_1e

    .line 747
    :cond_30
    const/16 v20, 0x2

    .line 748
    .line 749
    aget-object v6, v1, v20

    .line 750
    .line 751
    :goto_1e
    if-eqz v4, :cond_31

    .line 752
    .line 753
    goto :goto_1f

    .line 754
    :cond_31
    const/16 v18, 0x3

    .line 755
    .line 756
    aget-object v4, v1, v18

    .line 757
    .line 758
    :goto_1f
    invoke-virtual {v7, v5, v2, v6, v4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 759
    .line 760
    .line 761
    :cond_32
    :goto_20
    const/16 v1, 0xb

    .line 762
    .line 763
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    if-eqz v2, :cond_34

    .line 768
    .line 769
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 770
    .line 771
    .line 772
    move-result v2

    .line 773
    if-eqz v2, :cond_33

    .line 774
    .line 775
    const/4 v2, 0x0

    .line 776
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    if-eqz v2, :cond_33

    .line 781
    .line 782
    invoke-static {v2, v8}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    if-eqz v2, :cond_33

    .line 787
    .line 788
    goto :goto_21

    .line 789
    :cond_33
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    :goto_21
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    .line 794
    .line 795
    .line 796
    :cond_34
    const/16 v1, 0xc

    .line 797
    .line 798
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    const/4 v14, -0x1

    .line 803
    if-eqz v2, :cond_35

    .line 804
    .line 805
    invoke-virtual {v0, v1, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    const/4 v2, 0x0

    .line 810
    invoke-static {v1, v2}, La/qhl;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 815
    .line 816
    .line 817
    :cond_35
    const/16 v1, 0xf

    .line 818
    .line 819
    invoke-virtual {v0, v1, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 820
    .line 821
    .line 822
    move-result v1

    .line 823
    const/16 v2, 0x12

    .line 824
    .line 825
    invoke-virtual {v0, v2, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    const/16 v3, 0x13

    .line 830
    .line 831
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 832
    .line 833
    .line 834
    move-result v4

    .line 835
    if-eqz v4, :cond_37

    .line 836
    .line 837
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 838
    .line 839
    .line 840
    move-result-object v4

    .line 841
    if-eqz v4, :cond_36

    .line 842
    .line 843
    iget v5, v4, Landroid/util/TypedValue;->type:I

    .line 844
    .line 845
    const/4 v12, 0x5

    .line 846
    if-ne v5, v12, :cond_36

    .line 847
    .line 848
    iget v3, v4, Landroid/util/TypedValue;->data:I

    .line 849
    .line 850
    and-int/lit8 v14, v3, 0xf

    .line 851
    .line 852
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    move v4, v14

    .line 857
    const/4 v14, -0x1

    .line 858
    goto :goto_23

    .line 859
    :cond_36
    const/4 v14, -0x1

    .line 860
    invoke-virtual {v0, v3, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    int-to-float v3, v3

    .line 865
    :goto_22
    move v4, v14

    .line 866
    goto :goto_23

    .line 867
    :cond_37
    const/4 v14, -0x1

    .line 868
    move/from16 v3, p0

    .line 869
    .line 870
    goto :goto_22

    .line 871
    :goto_23
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 872
    .line 873
    .line 874
    if-eq v1, v14, :cond_38

    .line 875
    .line 876
    invoke-static {v1, v7}, La/aem0;->t(ILandroid/widget/TextView;)V

    .line 877
    .line 878
    .line 879
    :cond_38
    if-eq v2, v14, :cond_39

    .line 880
    .line 881
    invoke-static {v2, v7}, La/aem0;->u(ILandroid/widget/TextView;)V

    .line 882
    .line 883
    .line 884
    :cond_39
    cmpl-float v0, v3, p0

    .line 885
    .line 886
    if-eqz v0, :cond_3c

    .line 887
    .line 888
    if-ne v4, v14, :cond_3a

    .line 889
    .line 890
    float-to-int v0, v3

    .line 891
    invoke-static {v0, v7}, La/aem0;->v(ILandroid/widget/TextView;)V

    .line 892
    .line 893
    .line 894
    return-void

    .line 895
    :cond_3a
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 896
    .line 897
    const/16 v1, 0x22

    .line 898
    .line 899
    if-lt v0, v1, :cond_3b

    .line 900
    .line 901
    invoke-static {v7, v4, v3}, La/r6;->q(Landroid/widget/TextView;IF)V

    .line 902
    .line 903
    .line 904
    return-void

    .line 905
    :cond_3b
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    invoke-static {v4, v3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 914
    .line 915
    .line 916
    move-result v0

    .line 917
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 918
    .line 919
    .line 920
    move-result v0

    .line 921
    invoke-static {v0, v7}, La/aem0;->v(ILandroid/widget/TextView;)V

    .line 922
    .line 923
    .line 924
    :cond_3c
    return-void
.end method

.method public final i(ILandroid/content/Context;)V
    .locals 5

    .line 1
    new-instance v0, La/ywu;

    .line 2
    .line 3
    sget-object v1, La/mqd0;->x:[I

    .line 4
    .line 5
    invoke-virtual {p2, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v0, p2, p1}, La/ywu;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, La/pe3;->a:Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-virtual {v3, v4, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0, p2, v0}, La/pe3;->o(Landroid/content/Context;La/ywu;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v0}, La/ywu;->A()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, La/pe3;->c(Z)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final j(IIII)V
    .locals 1

    .line 1
    iget-object p0, p0, La/pe3;->i:La/ve3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ve3;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/ve3;->j:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    int-to-float p1, p1

    .line 20
    invoke-static {p4, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float p2, p2

    .line 25
    invoke-static {p4, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    int-to-float p3, p3

    .line 30
    invoke-static {p4, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {p0, p1, p2, p3}, La/ve3;->k(FFF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/ve3;->h()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, La/ve3;->a()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final k([II)V
    .locals 5

    .line 1
    iget-object p0, p0, La/pe3;->i:La/ve3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ve3;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    array-length v0, p1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-lez v0, :cond_3

    .line 12
    .line 13
    new-array v2, v0, [I

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v3, p0, La/ve3;->j:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :goto_0
    if-ge v1, v0, :cond_1

    .line 33
    .line 34
    aget v4, p1, v1

    .line 35
    .line 36
    int-to-float v4, v4

    .line 37
    invoke-static {p2, v4, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    aput v4, v2, v1

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    invoke-static {v2}, La/ve3;->b([I)[I

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, p0, La/ve3;->f:[I

    .line 55
    .line 56
    invoke-virtual {p0}, La/ve3;->i()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const-string p0, "None of the preset sizes is valid: "

    .line 64
    .line 65
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1, p0}, La/ohq;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iput-boolean v1, p0, La/ve3;->g:Z

    .line 74
    .line 75
    :goto_2
    invoke-virtual {p0}, La/ve3;->h()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, La/ve3;->a()V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public final l(I)V
    .locals 3

    .line 1
    iget-object p0, p0, La/pe3;->i:La/ve3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ve3;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, La/ve3;->j:Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/high16 v0, 0x41400000    # 12.0f

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-static {v1, v0, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/high16 v2, 0x42e00000    # 112.0f

    .line 32
    .line 33
    invoke-static {v1, v2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/high16 v1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-virtual {p0, v0, p1, v1}, La/ve3;->k(FFF)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/ve3;->h()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, La/ve3;->a()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    const-string p0, "Unknown auto-size text type: "

    .line 53
    .line 54
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    const/4 p1, 0x0

    .line 63
    iput p1, p0, La/ve3;->a:I

    .line 64
    .line 65
    const/high16 v0, -0x40800000    # -1.0f

    .line 66
    .line 67
    iput v0, p0, La/ve3;->d:F

    .line 68
    .line 69
    iput v0, p0, La/ve3;->e:F

    .line 70
    .line 71
    iput v0, p0, La/ve3;->c:F

    .line 72
    .line 73
    new-array v0, p1, [I

    .line 74
    .line 75
    iput-object v0, p0, La/ve3;->f:[I

    .line 76
    .line 77
    iput-boolean p1, p0, La/ve3;->b:Z

    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method public final m(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/pe3;->h:La/goq0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/goq0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/pe3;->h:La/goq0;

    .line 11
    .line 12
    :cond_0
    move-object v1, v0

    .line 13
    iput-object p1, v0, La/goq0;->a:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-boolean p1, v0, La/goq0;->d:Z

    .line 21
    .line 22
    iput-object v1, p0, La/pe3;->b:La/goq0;

    .line 23
    .line 24
    iput-object v1, p0, La/pe3;->c:La/goq0;

    .line 25
    .line 26
    iput-object v1, p0, La/pe3;->d:La/goq0;

    .line 27
    .line 28
    iput-object v1, p0, La/pe3;->e:La/goq0;

    .line 29
    .line 30
    iput-object v1, p0, La/pe3;->f:La/goq0;

    .line 31
    .line 32
    iput-object v1, p0, La/pe3;->g:La/goq0;

    .line 33
    .line 34
    return-void
.end method

.method public final n(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/pe3;->h:La/goq0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/goq0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/pe3;->h:La/goq0;

    .line 11
    .line 12
    :cond_0
    move-object v1, v0

    .line 13
    iput-object p1, v0, La/goq0;->b:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-boolean p1, v0, La/goq0;->c:Z

    .line 21
    .line 22
    iput-object v1, p0, La/pe3;->b:La/goq0;

    .line 23
    .line 24
    iput-object v1, p0, La/pe3;->c:La/goq0;

    .line 25
    .line 26
    iput-object v1, p0, La/pe3;->d:La/goq0;

    .line 27
    .line 28
    iput-object v1, p0, La/pe3;->e:La/goq0;

    .line 29
    .line 30
    iput-object v1, p0, La/pe3;->f:La/goq0;

    .line 31
    .line 32
    iput-object v1, p0, La/pe3;->g:La/goq0;

    .line 33
    .line 34
    return-void
.end method

.method public final o(Landroid/content/Context;La/ywu;)Z
    .locals 11

    .line 1
    iget v0, p0, La/pe3;->j:I

    .line 2
    .line 3
    iget-object v1, p2, La/ywu;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, La/pe3;->j:I

    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/4 v3, -0x1

    .line 17
    const/16 v4, 0x1c

    .line 18
    .line 19
    if-lt v0, v4, :cond_0

    .line 20
    .line 21
    const/16 v5, 0xb

    .line 22
    .line 23
    invoke-virtual {v1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    iput v5, p0, La/pe3;->k:I

    .line 28
    .line 29
    if-eq v5, v3, :cond_0

    .line 30
    .line 31
    iget v5, p0, La/pe3;->j:I

    .line 32
    .line 33
    and-int/2addr v5, v2

    .line 34
    iput v5, p0, La/pe3;->j:I

    .line 35
    .line 36
    :cond_0
    const/16 v5, 0x1a

    .line 37
    .line 38
    if-lt v0, v5, :cond_1

    .line 39
    .line 40
    const/16 v5, 0xd

    .line 41
    .line 42
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iput-object v5, p0, La/pe3;->m:Ljava/lang/String;

    .line 53
    .line 54
    :cond_1
    const/16 v5, 0xa

    .line 55
    .line 56
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/4 v7, 0x1

    .line 61
    const/16 v8, 0xc

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    if-nez v6, :cond_9

    .line 65
    .line 66
    invoke-virtual {v1, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_6

    .line 78
    .line 79
    iput-boolean v9, p0, La/pe3;->n:Z

    .line 80
    .line 81
    invoke-virtual {v1, v7, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eq p1, v7, :cond_5

    .line 86
    .line 87
    if-eq p1, v2, :cond_4

    .line 88
    .line 89
    const/4 p2, 0x3

    .line 90
    if-eq p1, p2, :cond_3

    .line 91
    .line 92
    goto/16 :goto_4

    .line 93
    .line 94
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 95
    .line 96
    iput-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 97
    .line 98
    return v7

    .line 99
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 100
    .line 101
    iput-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 102
    .line 103
    return v7

    .line 104
    :cond_5
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 105
    .line 106
    iput-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 107
    .line 108
    return v7

    .line 109
    :cond_6
    if-lt v0, v4, :cond_8

    .line 110
    .line 111
    iget p1, p0, La/pe3;->k:I

    .line 112
    .line 113
    if-eq p1, v3, :cond_8

    .line 114
    .line 115
    iget-object p2, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 116
    .line 117
    if-eqz p2, :cond_8

    .line 118
    .line 119
    iget v0, p0, La/pe3;->j:I

    .line 120
    .line 121
    and-int/2addr v0, v2

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    move v9, v7

    .line 125
    :cond_7
    invoke-static {p2, p1, v9}, La/ia3;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 130
    .line 131
    return v7

    .line 132
    :cond_8
    return v9

    .line 133
    :cond_9
    :goto_0
    const/4 v6, 0x0

    .line 134
    iput-object v6, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 135
    .line 136
    invoke-virtual {v1, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_a

    .line 141
    .line 142
    move v5, v8

    .line 143
    :cond_a
    iget v6, p0, La/pe3;->k:I

    .line 144
    .line 145
    iget v8, p0, La/pe3;->j:I

    .line 146
    .line 147
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-nez p1, :cond_f

    .line 152
    .line 153
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 154
    .line 155
    iget-object v10, p0, La/pe3;->a:Landroid/widget/TextView;

    .line 156
    .line 157
    invoke-direct {p1, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    new-instance v10, La/ke3;

    .line 161
    .line 162
    invoke-direct {v10, p0, v6, v8, p1}, La/ke3;-><init>(La/pe3;IILjava/lang/ref/WeakReference;)V

    .line 163
    .line 164
    .line 165
    :try_start_0
    iget p1, p0, La/pe3;->j:I

    .line 166
    .line 167
    invoke-virtual {p2, v5, p1, v10}, La/ywu;->p(IILa/ke3;)Landroid/graphics/Typeface;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-eqz p1, :cond_d

    .line 172
    .line 173
    if-lt v0, v4, :cond_c

    .line 174
    .line 175
    iget p2, p0, La/pe3;->k:I

    .line 176
    .line 177
    if-eq p2, v3, :cond_c

    .line 178
    .line 179
    invoke-static {p1, v9}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    iget p2, p0, La/pe3;->k:I

    .line 184
    .line 185
    iget v0, p0, La/pe3;->j:I

    .line 186
    .line 187
    and-int/2addr v0, v2

    .line 188
    if-eqz v0, :cond_b

    .line 189
    .line 190
    move v0, v7

    .line 191
    goto :goto_1

    .line 192
    :cond_b
    move v0, v9

    .line 193
    :goto_1
    invoke-static {p1, p2, v0}, La/ia3;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iput-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_c
    iput-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 201
    .line 202
    :cond_d
    :goto_2
    iget-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 203
    .line 204
    if-nez p1, :cond_e

    .line 205
    .line 206
    move p1, v7

    .line 207
    goto :goto_3

    .line 208
    :cond_e
    move p1, v9

    .line 209
    :goto_3
    iput-boolean p1, p0, La/pe3;->n:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    .line 211
    :catch_0
    :cond_f
    iget-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 212
    .line 213
    if-nez p1, :cond_12

    .line 214
    .line 215
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-eqz p1, :cond_12

    .line 220
    .line 221
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 222
    .line 223
    if-lt p2, v4, :cond_11

    .line 224
    .line 225
    iget p2, p0, La/pe3;->k:I

    .line 226
    .line 227
    if-eq p2, v3, :cond_11

    .line 228
    .line 229
    invoke-static {p1, v9}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    iget p2, p0, La/pe3;->k:I

    .line 234
    .line 235
    iget v0, p0, La/pe3;->j:I

    .line 236
    .line 237
    and-int/2addr v0, v2

    .line 238
    if-eqz v0, :cond_10

    .line 239
    .line 240
    move v9, v7

    .line 241
    :cond_10
    invoke-static {p1, p2, v9}, La/ia3;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iput-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_11
    iget p2, p0, La/pe3;->j:I

    .line 249
    .line 250
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iput-object p1, p0, La/pe3;->l:Landroid/graphics/Typeface;

    .line 255
    .line 256
    :cond_12
    :goto_4
    return v7
.end method
