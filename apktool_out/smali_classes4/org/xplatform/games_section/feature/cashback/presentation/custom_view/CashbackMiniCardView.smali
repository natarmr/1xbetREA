.class public final Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:La/a570;

.field public final b:La/uk5;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 232
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 231
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

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
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const v2, 0x7f0d068c

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    move-object v3, v1

    .line 29
    check-cast v3, Lcom/google/android/material/card/MaterialCardView;

    .line 30
    .line 31
    const v2, 0x7f0a0304

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 39
    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    const v2, 0x7f0a05f4

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Landroid/widget/FrameLayout;

    .line 50
    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    const v2, 0x7f0a064a

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Landroid/widget/TextView;

    .line 61
    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    const v2, 0x7f0a0650

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast v6, Landroid/widget/ImageView;

    .line 72
    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    const v2, 0x7f0a0902

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Landroid/widget/ImageView;

    .line 83
    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    const v2, 0x7f0a0903

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, Landroid/widget/ImageView;

    .line 94
    .line 95
    if-eqz v8, :cond_4

    .line 96
    .line 97
    const v2, 0x7f0a12d6

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    check-cast v8, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v8, :cond_4

    .line 107
    .line 108
    new-instance v2, La/uk5;

    .line 109
    .line 110
    invoke-direct/range {v2 .. v8}, La/uk5;-><init>(Lcom/google/android/material/card/MaterialCardView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 111
    .line 112
    .line 113
    iput-object v2, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b:La/uk5;

    .line 114
    .line 115
    if-eqz p2, :cond_3

    .line 116
    .line 117
    new-instance v1, La/q14;

    .line 118
    .line 119
    sget-object v0, La/aqd0;->c:[I

    .line 120
    .line 121
    invoke-direct {v1, p1, p2, v0}, La/q14;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;[I)V

    .line 122
    .line 123
    .line 124
    iget-object p1, v1, La/q14;->b:Landroid/content/res/TypedArray;

    .line 125
    .line 126
    const/4 p2, 0x1

    .line 127
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-eqz p2, :cond_1

    .line 132
    .line 133
    iget-object v0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b:La/uk5;

    .line 134
    .line 135
    iget-object v0, v0, La/uk5;->g:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v0, Landroid/widget/ImageView;

    .line 138
    .line 139
    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    move-object p0, v0

    .line 145
    goto :goto_4

    .line 146
    :catch_0
    move-exception v0

    .line 147
    move-object p2, v0

    .line 148
    goto :goto_0

    .line 149
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 150
    .line 151
    const-string v0, "AttributeLoader drawable == null"

    .line 152
    .line 153
    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    :goto_0
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    .line 159
    .line 160
    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    const/4 p2, 0x3

    .line 164
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_2

    .line 169
    .line 170
    const-string p1, ""

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_2
    iget-object v0, v1, La/q14;->a:Landroid/content/Context;

    .line 174
    .line 175
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    :goto_2
    iget-object p0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b:La/uk5;

    .line 187
    .line 188
    iget-object p0, p0, La/uk5;->c:Landroid/view/View;

    .line 189
    .line 190
    check-cast p0, Landroid/widget/TextView;

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :catch_1
    move-exception v0

    .line 197
    move-object p0, v0

    .line 198
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 199
    .line 200
    .line 201
    :goto_3
    invoke-virtual {v1}, La/q14;->close()V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :goto_4
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 206
    :catchall_1
    move-exception v0

    .line 207
    move-object p1, v0

    .line 208
    invoke-static {v1, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :cond_3
    return-void

    .line 213
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    const-string p1, "Missing required view with ID: "

    .line 222
    .line 223
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b:La/uk5;

    .line 2
    .line 3
    iget-object v1, v0, La/uk5;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/widget/ImageView;

    .line 6
    .line 7
    const v2, 0x106000d

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, La/uk5;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const v2, 0x7f08032b

    .line 22
    .line 23
    .line 24
    invoke-static {v2, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, v0, La/uk5;->c:Landroid/view/View;

    .line 32
    .line 33
    check-cast p0, Landroid/widget/TextView;

    .line 34
    .line 35
    const v0, 0x7f13044f

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final b(Ljava/lang/String;ZZZ)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b:La/uk5;

    .line 5
    .line 6
    iget-object v1, v0, La/uk5;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast v1, Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v2, v0, La/uk5;->d:Landroid/view/View;

    .line 11
    .line 12
    check-cast v2, Landroid/widget/TextView;

    .line 13
    .line 14
    iget-object v0, v0, La/uk5;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/widget/ImageView;

    .line 17
    .line 18
    iget-object v3, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->a:La/a570;

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    if-eqz p4, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    const-string v3, "5%"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v3, "3%"

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const v5, 0x7f130113

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    filled-new-array {v3, v4, p1}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const v3, 0x7f130a45

    .line 51
    .line 52
    .line 53
    invoke-virtual {p4, v3, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const p4, 0x7f130931

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const p4, 0x7f13044f

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_1
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    if-eqz p2, :cond_4

    .line 85
    .line 86
    const p1, 0x7f0606d0

    .line 87
    .line 88
    .line 89
    if-eqz p3, :cond_3

    .line 90
    .line 91
    sget-object p2, La/j5d;->a:Landroid/util/TypedValue;

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, p1}, Landroid/content/Context;->getColor(I)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    sget-object p2, La/j5d;->a:Landroid/util/TypedValue;

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, p1}, Landroid/content/Context;->getColor(I)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const p1, 0x7f130380

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_4
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    const p2, 0x7f0606ce

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    const p1, 0x7f1303ca

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public final getLoadedPictureUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setGameWorkStatus(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b:La/uk5;

    .line 2
    .line 3
    iget-object p0, p0, La/uk5;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/FrameLayout;

    .line 6
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
