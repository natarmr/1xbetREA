.class public final Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/dc3;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

    .line 1
    const-string v1, ""

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    move-object p2, v0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const v3, 0x7f0d068a

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    const v3, 0x7f0a0ba2

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    move-object v7, v4

    .line 38
    check-cast v7, Landroid/widget/ProgressBar;

    .line 39
    .line 40
    if-eqz v7, :cond_4

    .line 41
    .line 42
    const v3, 0x7f0a12ba

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    move-object v8, v4

    .line 50
    check-cast v8, Landroid/widget/TextView;

    .line 51
    .line 52
    if-eqz v8, :cond_4

    .line 53
    .line 54
    const v3, 0x7f0a12bb

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    move-object v9, v4

    .line 62
    check-cast v9, Landroid/widget/TextView;

    .line 63
    .line 64
    if-eqz v9, :cond_4

    .line 65
    .line 66
    const v3, 0x7f0a108f

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Landroid/widget/TextView;

    .line 74
    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    const v3, 0x7f0a12cd

    .line 78
    .line 79
    .line 80
    invoke-static {v2, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    const v3, 0x7f0a12d4

    .line 89
    .line 90
    .line 91
    invoke-static {v2, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Landroid/widget/TextView;

    .line 96
    .line 97
    if-eqz v4, :cond_4

    .line 98
    .line 99
    const v3, 0x7f0a12ea

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Landroid/widget/TextView;

    .line 107
    .line 108
    if-eqz v4, :cond_4

    .line 109
    .line 110
    new-instance v5, La/dc3;

    .line 111
    .line 112
    move-object v6, v2

    .line 113
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 114
    .line 115
    const/16 v10, 0x10

    .line 116
    .line 117
    invoke-direct/range {v5 .. v10}, La/dc3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 118
    .line 119
    .line 120
    iput-object v5, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;->a:La/dc3;

    .line 121
    .line 122
    if-eqz p2, :cond_3

    .line 123
    .line 124
    new-instance v2, La/q14;

    .line 125
    .line 126
    sget-object v0, La/aqd0;->b:[I

    .line 127
    .line 128
    invoke-direct {v2, p1, p2, v0}, La/q14;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;[I)V

    .line 129
    .line 130
    .line 131
    iget-object p2, v2, La/q14;->b:Landroid/content/res/TypedArray;

    .line 132
    .line 133
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x1

    .line 137
    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_1

    .line 142
    .line 143
    move-object p1, v1

    .line 144
    goto :goto_0

    .line 145
    :cond_1
    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    :goto_0
    iget-object v0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;->a:La/dc3;

    .line 157
    .line 158
    iget-object v0, v0, La/dc3;->d:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :catchall_0
    move-exception v0

    .line 167
    move-object p0, v0

    .line 168
    goto :goto_4

    .line 169
    :catch_0
    move-exception v0

    .line 170
    move-object p1, v0

    .line 171
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    .line 173
    .line 174
    :goto_1
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, p3, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_2

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    iget-object p1, v2, La/q14;->a:Landroid/content/Context;

    .line 185
    .line 186
    invoke-virtual {p2, p3, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    :goto_2
    iget-object p0, p0, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;->a:La/dc3;

    .line 198
    .line 199
    iget-object p0, p0, La/dc3;->e:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p0, Landroid/widget/TextView;

    .line 202
    .line 203
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :catch_1
    move-exception v0

    .line 208
    move-object p0, v0

    .line 209
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 210
    .line 211
    .line 212
    :goto_3
    invoke-virtual {v2}, La/q14;->close()V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :goto_4
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    move-object p1, v0

    .line 219
    invoke-static {v2, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    throw p1

    .line 223
    :cond_3
    return-void

    .line 224
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    const-string p1, "Missing required view with ID: "

    .line 233
    .line 234
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v0
.end method
