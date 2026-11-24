.class public final La/ctv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ctv;->a:B

    iput-object p1, p0, La/ctv;->b:La/cp;

    iput-object p2, p0, La/ctv;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ctv;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-static {p0}, La/x8x;->x(La/cp;)V

    .line 24
    .line 25
    .line 26
    move-object p1, v2

    .line 27
    check-cast p1, La/r2k;

    .line 28
    .line 29
    iget-object p1, p1, La/r2k;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 30
    .line 31
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/h5c0;

    .line 36
    .line 37
    iget-boolean v0, v0, La/h5c0;->c:Z

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    move v0, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v0, v4

    .line 44
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    move-object p1, v2

    .line 48
    check-cast p1, La/r2k;

    .line 49
    .line 50
    iget-object p1, p1, La/r2k;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 51
    .line 52
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/h5c0;

    .line 57
    .line 58
    iget-boolean v0, v0, La/h5c0;->d:Z

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    move v4, v5

    .line 63
    :cond_1
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    move-object p1, v2

    .line 67
    check-cast p1, La/r2k;

    .line 68
    .line 69
    iget-object p1, p1, La/r2k;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 70
    .line 71
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/h5c0;

    .line 76
    .line 77
    iget-boolean v0, v0, La/h5c0;->e:Z

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setLoading(Z)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/x8x;->y(La/cp;)V

    .line 83
    .line 84
    .line 85
    check-cast v2, La/r2k;

    .line 86
    .line 87
    iget-object p1, v2, La/r2k;->e:Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;

    .line 88
    .line 89
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, La/h5c0;

    .line 94
    .line 95
    iget-object p0, p0, La/h5c0;->g:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->setItems(Ljava/util/List;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_3

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    check-cast v2, Ljava/util/Collection;

    .line 125
    .line 126
    check-cast v2, Ljava/lang/Iterable;

    .line 127
    .line 128
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_d

    .line 141
    .line 142
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, La/g5c0;

    .line 147
    .line 148
    if-eqz p1, :cond_c

    .line 149
    .line 150
    instance-of v2, p1, La/z4c0;

    .line 151
    .line 152
    if-eqz v2, :cond_4

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    instance-of v2, p1, La/d5c0;

    .line 156
    .line 157
    if-eqz v2, :cond_5

    .line 158
    .line 159
    :goto_3
    invoke-static {v0}, La/x8x;->x(La/cp;)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    instance-of v2, p1, La/a5c0;

    .line 164
    .line 165
    if-eqz v2, :cond_7

    .line 166
    .line 167
    move-object p1, v1

    .line 168
    check-cast p1, La/r2k;

    .line 169
    .line 170
    iget-object p1, p1, La/r2k;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 171
    .line 172
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, La/h5c0;

    .line 177
    .line 178
    iget-boolean v2, v2, La/h5c0;->c:Z

    .line 179
    .line 180
    if-eqz v2, :cond_6

    .line 181
    .line 182
    move v2, v5

    .line 183
    goto :goto_4

    .line 184
    :cond_6
    move v2, v4

    .line 185
    :goto_4
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_7
    instance-of v2, p1, La/c5c0;

    .line 190
    .line 191
    if-eqz v2, :cond_9

    .line 192
    .line 193
    move-object p1, v1

    .line 194
    check-cast p1, La/r2k;

    .line 195
    .line 196
    iget-object p1, p1, La/r2k;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 197
    .line 198
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, La/h5c0;

    .line 203
    .line 204
    iget-boolean v2, v2, La/h5c0;->d:Z

    .line 205
    .line 206
    if-eqz v2, :cond_8

    .line 207
    .line 208
    move v2, v5

    .line 209
    goto :goto_5

    .line 210
    :cond_8
    move v2, v4

    .line 211
    :goto_5
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_9
    instance-of v2, p1, La/b5c0;

    .line 216
    .line 217
    if-eqz v2, :cond_a

    .line 218
    .line 219
    move-object p1, v1

    .line 220
    check-cast p1, La/r2k;

    .line 221
    .line 222
    iget-object p1, p1, La/r2k;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 223
    .line 224
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, La/h5c0;

    .line 229
    .line 230
    iget-boolean v2, v2, La/h5c0;->e:Z

    .line 231
    .line 232
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->setLoading(Z)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_a
    instance-of v2, p1, La/f5c0;

    .line 237
    .line 238
    if-eqz v2, :cond_b

    .line 239
    .line 240
    invoke-static {v0}, La/x8x;->y(La/cp;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_b
    instance-of p1, p1, La/e5c0;

    .line 245
    .line 246
    if-eqz p1, :cond_c

    .line 247
    .line 248
    move-object p1, v1

    .line 249
    check-cast p1, La/r2k;

    .line 250
    .line 251
    iget-object p1, p1, La/r2k;->e:Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;

    .line 252
    .line 253
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    check-cast v2, La/h5c0;

    .line 258
    .line 259
    iget-object v2, v2, La/h5c0;->g:Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-virtual {p1, v2}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->setItems(Ljava/util/List;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_2

    .line 265
    .line 266
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 267
    .line 268
    .line 269
    const/4 p0, 0x0

    .line 270
    return-object p0

    .line 271
    :cond_d
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    return-object p0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 14
    .line 15
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 16
    .line 17
    check-cast p1, La/v2k;

    .line 18
    .line 19
    iget-object p1, p1, La/v2k;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/n7c0;

    .line 26
    .line 27
    iget-object p0, p0, La/n7c0;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    sget v0, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->o2:I

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast p1, La/o4s;

    .line 39
    .line 40
    invoke-virtual {p1, p0, v1}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast v2, Ljava/util/Collection;

    .line 67
    .line 68
    check-cast v2, Ljava/lang/Iterable;

    .line 69
    .line 70
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, La/m7c0;

    .line 89
    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    iget-object v0, p0, La/ctv;->c:La/cp;

    .line 93
    .line 94
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 95
    .line 96
    check-cast v2, La/v2k;

    .line 97
    .line 98
    iget-object v2, v2, La/v2k;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 99
    .line 100
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, La/n7c0;

    .line 105
    .line 106
    iget-object v0, v0, La/n7c0;->a:Ljava/util/ArrayList;

    .line 107
    .line 108
    sget v3, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->o2:I

    .line 109
    .line 110
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    check-cast v2, La/o4s;

    .line 118
    .line 119
    invoke-virtual {v2, v0, v1}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ctv;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    move-object p1, v2

    .line 21
    check-cast p1, La/o7o0;

    .line 22
    .line 23
    iget-object p1, p1, La/o7o0;->b:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/gfg0;

    .line 30
    .line 31
    iget-object v0, v0, La/gfg0;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    move-object p1, v2

    .line 37
    check-cast p1, La/o7o0;

    .line 38
    .line 39
    iget-object p1, p1, La/o7o0;->c:Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/gfg0;

    .line 46
    .line 47
    iget-object v0, v0, La/gfg0;->c:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    check-cast v2, La/o7o0;

    .line 53
    .line 54
    iget-object p1, v2, La/o7o0;->c:Landroid/widget/TextView;

    .line 55
    .line 56
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 57
    .line 58
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/gfg0;

    .line 63
    .line 64
    iget p0, p0, La/gfg0;->d:I

    .line 65
    .line 66
    invoke-static {p0, v0}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p1, p0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    check-cast v2, Ljava/util/Collection;

    .line 98
    .line 99
    check-cast v2, Ljava/lang/Iterable;

    .line 100
    .line 101
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, La/ffg0;

    .line 120
    .line 121
    if-eqz p1, :cond_4

    .line 122
    .line 123
    instance-of v2, p1, La/cfg0;

    .line 124
    .line 125
    if-eqz v2, :cond_2

    .line 126
    .line 127
    move-object p1, v1

    .line 128
    check-cast p1, La/o7o0;

    .line 129
    .line 130
    iget-object p1, p1, La/o7o0;->b:Landroid/widget/TextView;

    .line 131
    .line 132
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, La/gfg0;

    .line 137
    .line 138
    iget-object v2, v2, La/gfg0;->b:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    instance-of v2, p1, La/dfg0;

    .line 145
    .line 146
    if-eqz v2, :cond_3

    .line 147
    .line 148
    move-object p1, v1

    .line 149
    check-cast p1, La/o7o0;

    .line 150
    .line 151
    iget-object p1, p1, La/o7o0;->c:Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, La/gfg0;

    .line 158
    .line 159
    iget-object v2, v2, La/gfg0;->c:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_3
    instance-of p1, p1, La/efg0;

    .line 166
    .line 167
    if-eqz p1, :cond_4

    .line 168
    .line 169
    move-object p1, v1

    .line 170
    check-cast p1, La/o7o0;

    .line 171
    .line 172
    iget-object p1, p1, La/o7o0;->c:Landroid/widget/TextView;

    .line 173
    .line 174
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 175
    .line 176
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, La/gfg0;

    .line 181
    .line 182
    iget v3, v3, La/gfg0;->d:I

    .line 183
    .line 184
    invoke-static {v3, v2}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {p1, v2}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 193
    .line 194
    .line 195
    const/4 p0, 0x0

    .line 196
    return-object p0

    .line 197
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ctv;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->w:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 8
    .line 9
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 10
    .line 11
    iget-object v3, p0, La/cp;->w:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v4, p0, La/cp;->u:La/yfu0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/high16 v6, 0x3f800000    # 1.0f

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    move-object p1, v4

    .line 27
    check-cast p1, La/bth;

    .line 28
    .line 29
    iget-object p1, p1, La/bth;->d:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/crf;

    .line 36
    .line 37
    iget-object v0, v0, La/crf;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, La/bdx;->W(La/cp;)V

    .line 43
    .line 44
    .line 45
    move-object p1, v4

    .line 46
    check-cast p1, La/bth;

    .line 47
    .line 48
    iget-object p1, p1, La/bth;->d:Landroid/widget/TextView;

    .line 49
    .line 50
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/crf;

    .line 55
    .line 56
    iget v0, v0, La/crf;->h:I

    .line 57
    .line 58
    invoke-static {v0, v3}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 63
    .line 64
    .line 65
    move-object p1, v4

    .line 66
    check-cast p1, La/bth;

    .line 67
    .line 68
    iget-object p1, p1, La/bth;->c:Landroid/widget/FrameLayout;

    .line 69
    .line 70
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, La/crf;

    .line 75
    .line 76
    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V

    .line 77
    .line 78
    .line 79
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 80
    .line 81
    move-object p1, v4

    .line 82
    check-cast p1, La/bth;

    .line 83
    .line 84
    iget-object p1, p1, La/bth;->b:Landroid/widget/ImageView;

    .line 85
    .line 86
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/crf;

    .line 91
    .line 92
    iget v0, v0, La/crf;->e:I

    .line 93
    .line 94
    invoke-static {p1, v0}, La/u0d;->i(Landroid/widget/ImageView;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0}, La/bdx;->X(La/cp;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, La/bdx;->T(La/cp;)V

    .line 101
    .line 102
    .line 103
    check-cast v4, La/bth;

    .line 104
    .line 105
    iget-object p1, v4, La/bth;->e:Landroid/view/View;

    .line 106
    .line 107
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, La/crf;

    .line 112
    .line 113
    iget p0, p0, La/crf;->g:I

    .line 114
    .line 115
    invoke-static {p0, v3}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_1

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    check-cast v3, Ljava/util/Collection;

    .line 147
    .line 148
    check-cast v3, Ljava/lang/Iterable;

    .line 149
    .line 150
    invoke-static {p0, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_a

    .line 163
    .line 164
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, La/brf;

    .line 169
    .line 170
    if-eqz p1, :cond_9

    .line 171
    .line 172
    instance-of v3, p1, La/xqf;

    .line 173
    .line 174
    if-eqz v3, :cond_2

    .line 175
    .line 176
    move-object p1, v2

    .line 177
    check-cast p1, La/bth;

    .line 178
    .line 179
    iget-object p1, p1, La/bth;->d:Landroid/widget/TextView;

    .line 180
    .line 181
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, La/crf;

    .line 186
    .line 187
    iget-object v3, v3, La/crf;->b:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_2
    instance-of v3, p1, La/yqf;

    .line 194
    .line 195
    if-eqz v3, :cond_3

    .line 196
    .line 197
    move-object p1, v2

    .line 198
    check-cast p1, La/bth;

    .line 199
    .line 200
    iget-object p1, p1, La/bth;->c:Landroid/widget/FrameLayout;

    .line 201
    .line 202
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, La/crf;

    .line 207
    .line 208
    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_3
    instance-of v3, p1, La/wqf;

    .line 213
    .line 214
    if-eqz v3, :cond_4

    .line 215
    .line 216
    invoke-static {v0}, La/bdx;->W(La/cp;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_4
    instance-of v3, p1, La/zqf;

    .line 221
    .line 222
    if-eqz v3, :cond_5

    .line 223
    .line 224
    invoke-static {v0}, La/bdx;->X(La/cp;)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_5
    instance-of v3, p1, La/vqf;

    .line 229
    .line 230
    if-eqz v3, :cond_6

    .line 231
    .line 232
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 233
    .line 234
    move-object p1, v2

    .line 235
    check-cast p1, La/bth;

    .line 236
    .line 237
    iget-object p1, p1, La/bth;->b:Landroid/widget/ImageView;

    .line 238
    .line 239
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    check-cast v3, La/crf;

    .line 244
    .line 245
    iget v3, v3, La/crf;->e:I

    .line 246
    .line 247
    invoke-static {p1, v3}, La/u0d;->i(Landroid/widget/ImageView;I)V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_6
    instance-of v3, p1, La/tqf;

    .line 252
    .line 253
    if-eqz v3, :cond_7

    .line 254
    .line 255
    invoke-static {v0}, La/bdx;->T(La/cp;)V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_7
    instance-of v3, p1, La/arf;

    .line 260
    .line 261
    if-eqz v3, :cond_8

    .line 262
    .line 263
    move-object p1, v2

    .line 264
    check-cast p1, La/bth;

    .line 265
    .line 266
    iget-object p1, p1, La/bth;->e:Landroid/view/View;

    .line 267
    .line 268
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    check-cast v3, La/crf;

    .line 273
    .line 274
    iget v3, v3, La/crf;->g:I

    .line 275
    .line 276
    invoke-static {v3, v1}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 281
    .line 282
    .line 283
    goto :goto_1

    .line 284
    :cond_8
    instance-of p1, p1, La/uqf;

    .line 285
    .line 286
    if-eqz p1, :cond_9

    .line 287
    .line 288
    move-object p1, v2

    .line 289
    check-cast p1, La/bth;

    .line 290
    .line 291
    iget-object p1, p1, La/bth;->d:Landroid/widget/TextView;

    .line 292
    .line 293
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    check-cast v3, La/crf;

    .line 298
    .line 299
    iget v3, v3, La/crf;->h:I

    .line 300
    .line 301
    invoke-static {v3, v1}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 311
    .line 312
    .line 313
    const/4 p0, 0x0

    .line 314
    return-object p0

    .line 315
    :cond_a
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/exx;

    .line 18
    .line 19
    iget-object v0, v0, La/exx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 20
    .line 21
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/jui0;

    .line 26
    .line 27
    iget-object v1, v1, La/jui0;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, La/exx;

    .line 33
    .line 34
    iget-object v0, p1, La/exx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, La/jui0;

    .line 41
    .line 42
    iget-boolean v1, v1, La/jui0;->b:Z

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, La/exx;->d:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 48
    .line 49
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/jui0;

    .line 54
    .line 55
    iget-boolean v1, v1, La/jui0;->d:Z

    .line 56
    .line 57
    if-nez v1, :cond_0

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/16 v1, 0x8

    .line 62
    .line 63
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p1, La/exx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 67
    .line 68
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, La/jui0;

    .line 73
    .line 74
    iget-boolean v1, v1, La/jui0;->e:Z

    .line 75
    .line 76
    invoke-virtual {v0, v1}, La/tw5;->setFirst(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p1, La/exx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 80
    .line 81
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, La/jui0;

    .line 86
    .line 87
    iget-boolean v1, v1, La/jui0;->d:Z

    .line 88
    .line 89
    invoke-virtual {v0, v1}, La/tw5;->setLast(Z)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p1, La/exx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 93
    .line 94
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, La/jui0;

    .line 99
    .line 100
    iget-boolean p0, p0, La/jui0;->c:Z

    .line 101
    .line 102
    invoke-virtual {p1, p0}, La/tw5;->setEnabled(Z)V

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_2

    .line 120
    .line 121
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast v1, Ljava/util/Collection;

    .line 129
    .line 130
    check-cast v1, Ljava/lang/Iterable;

    .line 131
    .line 132
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_6

    .line 145
    .line 146
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/util/List;

    .line 151
    .line 152
    new-instance v1, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_5

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    instance-of v3, v2, La/fwi0;

    .line 172
    .line 173
    if-eqz v3, :cond_4

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_3

    .line 188
    .line 189
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, La/fwi0;

    .line 194
    .line 195
    iget-object v2, p0, La/ctv;->c:La/cp;

    .line 196
    .line 197
    iget-object v2, v2, La/cp;->u:La/yfu0;

    .line 198
    .line 199
    check-cast v2, La/exx;

    .line 200
    .line 201
    iget-object v2, v2, La/exx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 202
    .line 203
    iget-boolean v1, v1, La/fwi0;->a:Z

    .line 204
    .line 205
    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ctv;->b:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move-object p0, v1

    .line 18
    check-cast p0, La/kxx;

    .line 19
    .line 20
    iget-object p0, p0, La/kxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 21
    .line 22
    const p1, 0x7f0808f8

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 26
    .line 27
    .line 28
    move-object p0, v1

    .line 29
    check-cast p0, La/kxx;

    .line 30
    .line 31
    iget-object p0, p0, La/kxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 32
    .line 33
    iget-object p1, v0, La/cp;->w:Landroid/content/Context;

    .line 34
    .line 35
    const v2, 0x7f13013a

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    check-cast v1, La/kxx;

    .line 46
    .line 47
    iget-object p0, v1, La/kxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 50
    .line 51
    .line 52
    iget-object p0, v1, La/kxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 53
    .line 54
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, La/tzi0;

    .line 59
    .line 60
    iget-object p1, p1, La/tzi0;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, La/g8x;->v(La/cp;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    check-cast v1, Ljava/util/Collection;

    .line 92
    .line 93
    check-cast v1, Ljava/lang/Iterable;

    .line 94
    .line 95
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/szi0;

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    instance-of v1, v0, La/qzi0;

    .line 118
    .line 119
    iget-object v2, p0, La/ctv;->c:La/cp;

    .line 120
    .line 121
    if-eqz v1, :cond_2

    .line 122
    .line 123
    invoke-static {v2}, La/g8x;->v(La/cp;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    instance-of v0, v0, La/rzi0;

    .line 128
    .line 129
    if-eqz v0, :cond_3

    .line 130
    .line 131
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 132
    .line 133
    check-cast v0, La/kxx;

    .line 134
    .line 135
    iget-object v1, v0, La/kxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 136
    .line 137
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 138
    .line 139
    .line 140
    iget-object v0, v0, La/kxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 141
    .line 142
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, La/tzi0;

    .line 147
    .line 148
    iget-object v1, v1, La/tzi0;->a:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 155
    .line 156
    .line 157
    const/4 p0, 0x0

    .line 158
    return-object p0

    .line 159
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 13
    .line 14
    invoke-static {p0}, La/r8x;->D(La/cp;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 18
    .line 19
    check-cast p1, La/g2j0;

    .line 20
    .line 21
    iget-object p1, p1, La/g2j0;->b:Lorg/xplatform/uikit/components/footer/DsFooter;

    .line 22
    .line 23
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/d2j0;

    .line 28
    .line 29
    iget-object p0, p0, La/d2j0;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast v1, Ljava/util/Collection;

    .line 58
    .line 59
    check-cast v1, Ljava/lang/Iterable;

    .line 60
    .line 61
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La/c2j0;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    instance-of v1, v0, La/b2j0;

    .line 84
    .line 85
    iget-object v2, p0, La/ctv;->c:La/cp;

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 90
    .line 91
    check-cast v0, La/g2j0;

    .line 92
    .line 93
    iget-object v0, v0, La/g2j0;->b:Lorg/xplatform/uikit/components/footer/DsFooter;

    .line 94
    .line 95
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, La/d2j0;

    .line 100
    .line 101
    iget-object v1, v1, La/d2j0;->b:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    instance-of v0, v0, La/a2j0;

    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    invoke-static {v2}, La/r8x;->D(La/cp;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 116
    .line 117
    .line 118
    const/4 p0, 0x0

    .line 119
    return-object p0

    .line 120
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 13
    .line 14
    invoke-static {p0}, La/d9x;->H(La/cp;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, La/d9x;->G(La/cp;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, La/d9x;->F(La/cp;)V

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast v1, Ljava/util/Collection;

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Iterable;

    .line 49
    .line 50
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, La/p3j0;

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    instance-of v1, v0, La/o3j0;

    .line 73
    .line 74
    iget-object v2, p0, La/ctv;->c:La/cp;

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    invoke-static {v2}, La/d9x;->H(La/cp;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    instance-of v1, v0, La/n3j0;

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-static {v2}, La/d9x;->G(La/cp;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    instance-of v0, v0, La/m3j0;

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    invoke-static {v2}, La/d9x;->F(La/cp;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 99
    .line 100
    .line 101
    const/4 p0, 0x0

    .line 102
    return-object p0

    .line 103
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 13
    .line 14
    invoke-static {p0}, La/e9x;->H(La/cp;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, La/e9x;->G(La/cp;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v1, Ljava/util/Collection;

    .line 44
    .line 45
    check-cast v1, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/w3j0;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    instance-of v1, v0, La/v3j0;

    .line 70
    .line 71
    iget-object v2, p0, La/ctv;->c:La/cp;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-static {v2}, La/e9x;->H(La/cp;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    instance-of v0, v0, La/u3j0;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-static {v2}, La/e9x;->G(La/cp;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    return-object p0

    .line 92
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0
.end method

.method private final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 13
    .line 14
    invoke-static {p0}, La/t9x;->B(La/cp;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 18
    .line 19
    check-cast p1, La/c6j0;

    .line 20
    .line 21
    iget-object p1, p1, La/c6j0;->b:Lorg/xplatform/uikit/components/footer/DsFooter;

    .line 22
    .line 23
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/b6j0;

    .line 28
    .line 29
    iget-object p0, p0, La/b6j0;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast v1, Ljava/util/Collection;

    .line 58
    .line 59
    check-cast v1, Ljava/lang/Iterable;

    .line 60
    .line 61
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, La/a6j0;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    instance-of v1, v0, La/y5j0;

    .line 84
    .line 85
    iget-object v2, p0, La/ctv;->c:La/cp;

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 90
    .line 91
    check-cast v0, La/c6j0;

    .line 92
    .line 93
    iget-object v0, v0, La/c6j0;->b:Lorg/xplatform/uikit/components/footer/DsFooter;

    .line 94
    .line 95
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, La/b6j0;

    .line 100
    .line 101
    iget-object v1, v1, La/b6j0;->b:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    instance-of v0, v0, La/z5j0;

    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    invoke-static {v2}, La/t9x;->B(La/cp;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 116
    .line 117
    .line 118
    const/4 p0, 0x0

    .line 119
    return-object p0

    .line 120
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0
.end method

.method private final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ctv;->b:La/cp;

    .line 13
    .line 14
    invoke-static {p0}, La/bdx;->U(La/cp;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 18
    .line 19
    check-cast p1, La/kxx;

    .line 20
    .line 21
    iget-object v0, p1, La/kxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 22
    .line 23
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/z9j0;

    .line 28
    .line 29
    invoke-interface {v1}, La/z9j0;->b()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, La/kxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 37
    .line 38
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/z9j0;

    .line 43
    .line 44
    invoke-interface {v0}, La/z9j0;->getTitle()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, La/bdx;->V(La/cp;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast v1, Ljava/util/Collection;

    .line 78
    .line 79
    check-cast v1, Ljava/lang/Iterable;

    .line 80
    .line 81
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/l9j0;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    instance-of v1, v0, La/j9j0;

    .line 104
    .line 105
    iget-object v2, p0, La/ctv;->c:La/cp;

    .line 106
    .line 107
    if-eqz v1, :cond_2

    .line 108
    .line 109
    invoke-static {v2}, La/bdx;->U(La/cp;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    instance-of v0, v0, La/k9j0;

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    invoke-static {v2}, La/bdx;->V(La/cp;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    return-object p0

    .line 126
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ctv;->a:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/ctv;->b:La/cp;

    .line 10
    .line 11
    iget-object v6, v0, La/ctv;->c:La/cp;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, Ljava/util/List;

    .line 19
    .line 20
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 21
    .line 22
    iget-object v2, v5, La/cp;->u:La/yfu0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    move-object v0, v2

    .line 34
    check-cast v0, La/nxx;

    .line 35
    .line 36
    iget-object v0, v0, La/nxx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 37
    .line 38
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, La/gej0;

    .line 43
    .line 44
    invoke-interface {v1}, La/gej0;->a0()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {v0, v1}, La/tw5;->setEnabled(Z)V

    .line 49
    .line 50
    .line 51
    move-object v0, v2

    .line 52
    check-cast v0, La/nxx;

    .line 53
    .line 54
    iget-object v1, v0, La/nxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 55
    .line 56
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, La/gej0;

    .line 61
    .line 62
    invoke-interface {v4}, La/gej0;->b()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 67
    .line 68
    .line 69
    check-cast v2, La/nxx;

    .line 70
    .line 71
    iget-object v1, v2, La/nxx;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 72
    .line 73
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, La/gej0;

    .line 78
    .line 79
    invoke-interface {v2}, La/gej0;->j0()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, La/nxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 89
    .line 90
    .line 91
    iget-object v0, v0, La/nxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 92
    .line 93
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/gej0;

    .line 98
    .line 99
    invoke-interface {v1}, La/gej0;->getTitle()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_1

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    check-cast v3, Ljava/util/Collection;

    .line 130
    .line 131
    check-cast v3, Ljava/lang/Iterable;

    .line 132
    .line 133
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_4

    .line 146
    .line 147
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, La/eej0;

    .line 152
    .line 153
    if-eqz v2, :cond_3

    .line 154
    .line 155
    instance-of v3, v2, La/cej0;

    .line 156
    .line 157
    if-eqz v3, :cond_2

    .line 158
    .line 159
    move-object v2, v1

    .line 160
    check-cast v2, La/nxx;

    .line 161
    .line 162
    iget-object v2, v2, La/nxx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 163
    .line 164
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, La/gej0;

    .line 169
    .line 170
    invoke-interface {v3}, La/gej0;->a0()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    invoke-virtual {v2, v3}, La/tw5;->setEnabled(Z)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_2
    instance-of v2, v2, La/dej0;

    .line 179
    .line 180
    if-eqz v2, :cond_3

    .line 181
    .line 182
    move-object v2, v1

    .line 183
    check-cast v2, La/nxx;

    .line 184
    .line 185
    iget-object v2, v2, La/nxx;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 186
    .line 187
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, La/gej0;

    .line 192
    .line 193
    invoke-interface {v3}, La/gej0;->j0()Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_4
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    :goto_3
    return-object v4

    .line 208
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/ctv;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/ctv;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0

    .line 218
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/ctv;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    return-object v0

    .line 223
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/ctv;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0

    .line 228
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/ctv;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    return-object v0

    .line 233
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/ctv;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    return-object v0

    .line 238
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/ctv;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    return-object v0

    .line 243
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/ctv;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    return-object v0

    .line 248
    :pswitch_8
    invoke-direct/range {p0 .. p1}, La/ctv;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    return-object v0

    .line 253
    :pswitch_9
    invoke-direct/range {p0 .. p1}, La/ctv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0

    .line 258
    :pswitch_a
    move-object/from16 v0, p1

    .line 259
    .line 260
    check-cast v0, Ljava/util/List;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_5

    .line 270
    .line 271
    iget-object v0, v5, La/cp;->u:La/yfu0;

    .line 272
    .line 273
    check-cast v0, La/t2k;

    .line 274
    .line 275
    iget-object v0, v0, La/t2k;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 276
    .line 277
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    check-cast v1, La/n7c0;

    .line 282
    .line 283
    iget-object v1, v1, La/n7c0;->a:Ljava/util/ArrayList;

    .line 284
    .line 285
    sget v2, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->o2:I

    .line 286
    .line 287
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    check-cast v0, La/o4s;

    .line 295
    .line 296
    invoke-virtual {v0, v1, v4}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-eqz v2, :cond_6

    .line 314
    .line 315
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    check-cast v2, Ljava/util/Collection;

    .line 323
    .line 324
    check-cast v2, Ljava/lang/Iterable;

    .line 325
    .line 326
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_8

    .line 339
    .line 340
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    check-cast v1, La/m7c0;

    .line 345
    .line 346
    if-eqz v1, :cond_7

    .line 347
    .line 348
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 349
    .line 350
    check-cast v1, La/t2k;

    .line 351
    .line 352
    iget-object v1, v1, La/t2k;->b:Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 353
    .line 354
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    check-cast v2, La/n7c0;

    .line 359
    .line 360
    iget-object v2, v2, La/n7c0;->a:Ljava/util/ArrayList;

    .line 361
    .line 362
    sget v3, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;->o2:I

    .line 363
    .line 364
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    check-cast v1, La/o4s;

    .line 372
    .line 373
    invoke-virtual {v1, v2, v4}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 374
    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 378
    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_8
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    :goto_7
    return-object v4

    .line 384
    :pswitch_b
    invoke-direct/range {p0 .. p1}, La/ctv;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    return-object v0

    .line 389
    :pswitch_c
    move-object/from16 v0, p1

    .line 390
    .line 391
    check-cast v0, Ljava/util/List;

    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-eqz v1, :cond_a

    .line 401
    .line 402
    iget-object v0, v5, La/cp;->u:La/yfu0;

    .line 403
    .line 404
    check-cast v0, La/s2k;

    .line 405
    .line 406
    iget-object v0, v0, La/s2k;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 407
    .line 408
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    check-cast v1, La/n5c0;

    .line 413
    .line 414
    iget-boolean v1, v1, La/n5c0;->a:Z

    .line 415
    .line 416
    if-eqz v1, :cond_9

    .line 417
    .line 418
    move v2, v3

    .line 419
    :cond_9
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 420
    .line 421
    .line 422
    invoke-static {v5}, La/r8x;->E(La/cp;)V

    .line 423
    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 429
    .line 430
    .line 431
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-eqz v5, :cond_b

    .line 440
    .line 441
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    check-cast v5, Ljava/util/Collection;

    .line 449
    .line 450
    check-cast v5, Ljava/lang/Iterable;

    .line 451
    .line 452
    invoke-static {v1, v5}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 453
    .line 454
    .line 455
    goto :goto_8

    .line 456
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    if-eqz v1, :cond_f

    .line 465
    .line 466
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    check-cast v1, La/m5c0;

    .line 471
    .line 472
    if-eqz v1, :cond_e

    .line 473
    .line 474
    instance-of v5, v1, La/k5c0;

    .line 475
    .line 476
    if-eqz v5, :cond_d

    .line 477
    .line 478
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 479
    .line 480
    check-cast v1, La/s2k;

    .line 481
    .line 482
    iget-object v1, v1, La/s2k;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 483
    .line 484
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    check-cast v5, La/n5c0;

    .line 489
    .line 490
    iget-boolean v5, v5, La/n5c0;->a:Z

    .line 491
    .line 492
    if-eqz v5, :cond_c

    .line 493
    .line 494
    move v5, v3

    .line 495
    goto :goto_a

    .line 496
    :cond_c
    move v5, v2

    .line 497
    :goto_a
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 498
    .line 499
    .line 500
    goto :goto_9

    .line 501
    :cond_d
    instance-of v1, v1, La/l5c0;

    .line 502
    .line 503
    if-eqz v1, :cond_e

    .line 504
    .line 505
    invoke-static {v6}, La/r8x;->E(La/cp;)V

    .line 506
    .line 507
    .line 508
    goto :goto_9

    .line 509
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 510
    .line 511
    .line 512
    goto :goto_c

    .line 513
    :cond_f
    :goto_b
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 514
    .line 515
    :goto_c
    return-object v4

    .line 516
    :pswitch_d
    move-object/from16 v0, p1

    .line 517
    .line 518
    check-cast v0, Ljava/util/List;

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    if-eqz v1, :cond_10

    .line 528
    .line 529
    invoke-static {v5}, La/q8x;->H(La/cp;)V

    .line 530
    .line 531
    .line 532
    iget-object v0, v5, La/cp;->u:La/yfu0;

    .line 533
    .line 534
    check-cast v0, La/n2k;

    .line 535
    .line 536
    iget-object v0, v0, La/n2k;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 537
    .line 538
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    check-cast v1, La/t5c0;

    .line 543
    .line 544
    iget-boolean v1, v1, La/t5c0;->a:Z

    .line 545
    .line 546
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 547
    .line 548
    .line 549
    goto :goto_10

    .line 550
    :cond_10
    new-instance v1, Ljava/util/ArrayList;

    .line 551
    .line 552
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    if-eqz v2, :cond_11

    .line 564
    .line 565
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    check-cast v2, Ljava/util/Collection;

    .line 573
    .line 574
    check-cast v2, Ljava/lang/Iterable;

    .line 575
    .line 576
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 577
    .line 578
    .line 579
    goto :goto_d

    .line 580
    :cond_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    :cond_12
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    if-eqz v1, :cond_16

    .line 589
    .line 590
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    check-cast v1, La/s5c0;

    .line 595
    .line 596
    if-nez v1, :cond_13

    .line 597
    .line 598
    goto :goto_e

    .line 599
    :cond_13
    instance-of v2, v1, La/p5c0;

    .line 600
    .line 601
    if-eqz v2, :cond_14

    .line 602
    .line 603
    goto :goto_f

    .line 604
    :cond_14
    instance-of v2, v1, La/q5c0;

    .line 605
    .line 606
    if-eqz v2, :cond_15

    .line 607
    .line 608
    :goto_f
    invoke-static {v6}, La/q8x;->H(La/cp;)V

    .line 609
    .line 610
    .line 611
    goto :goto_e

    .line 612
    :cond_15
    instance-of v1, v1, La/r5c0;

    .line 613
    .line 614
    if-eqz v1, :cond_12

    .line 615
    .line 616
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 617
    .line 618
    check-cast v1, La/n2k;

    .line 619
    .line 620
    iget-object v1, v1, La/n2k;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 621
    .line 622
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    check-cast v2, La/t5c0;

    .line 627
    .line 628
    iget-boolean v2, v2, La/t5c0;->a:Z

    .line 629
    .line 630
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 631
    .line 632
    .line 633
    goto :goto_e

    .line 634
    :cond_16
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 635
    .line 636
    return-object v0

    .line 637
    :pswitch_e
    move-object/from16 v0, p1

    .line 638
    .line 639
    check-cast v0, Ljava/util/List;

    .line 640
    .line 641
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 642
    .line 643
    iget-object v2, v5, La/cp;->u:La/yfu0;

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    if-eqz v3, :cond_17

    .line 653
    .line 654
    move-object v0, v2

    .line 655
    check-cast v0, La/o2k;

    .line 656
    .line 657
    iget-object v0, v0, La/o2k;->b:Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 658
    .line 659
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    check-cast v1, La/t5c0;

    .line 664
    .line 665
    iget v1, v1, La/t5c0;->b:I

    .line 666
    .line 667
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v3

    .line 675
    check-cast v3, La/t5c0;

    .line 676
    .line 677
    iget-object v3, v3, La/t5c0;->c:Ljava/lang/String;

    .line 678
    .line 679
    invoke-virtual {v0, v1, v3}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    check-cast v2, La/o2k;

    .line 683
    .line 684
    iget-object v0, v2, La/o2k;->b:Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 685
    .line 686
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    check-cast v1, La/t5c0;

    .line 691
    .line 692
    iget-boolean v1, v1, La/t5c0;->a:Z

    .line 693
    .line 694
    invoke-virtual {v0, v1}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->setValueVisibility(Z)V

    .line 695
    .line 696
    .line 697
    goto/16 :goto_14

    .line 698
    .line 699
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    .line 700
    .line 701
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 702
    .line 703
    .line 704
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 709
    .line 710
    .line 711
    move-result v3

    .line 712
    if-eqz v3, :cond_18

    .line 713
    .line 714
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    check-cast v3, Ljava/util/Collection;

    .line 722
    .line 723
    check-cast v3, Ljava/lang/Iterable;

    .line 724
    .line 725
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 726
    .line 727
    .line 728
    goto :goto_11

    .line 729
    :cond_18
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    if-eqz v2, :cond_1c

    .line 738
    .line 739
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    check-cast v2, La/s5c0;

    .line 744
    .line 745
    if-eqz v2, :cond_1b

    .line 746
    .line 747
    instance-of v3, v2, La/p5c0;

    .line 748
    .line 749
    if-eqz v3, :cond_19

    .line 750
    .line 751
    goto :goto_13

    .line 752
    :cond_19
    instance-of v3, v2, La/q5c0;

    .line 753
    .line 754
    if-eqz v3, :cond_1a

    .line 755
    .line 756
    :goto_13
    move-object v2, v1

    .line 757
    check-cast v2, La/o2k;

    .line 758
    .line 759
    iget-object v2, v2, La/o2k;->b:Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 760
    .line 761
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    check-cast v3, La/t5c0;

    .line 766
    .line 767
    iget v3, v3, La/t5c0;->b:I

    .line 768
    .line 769
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    check-cast v5, La/t5c0;

    .line 778
    .line 779
    iget-object v5, v5, La/t5c0;->c:Ljava/lang/String;

    .line 780
    .line 781
    invoke-virtual {v2, v3, v5}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    goto :goto_12

    .line 785
    :cond_1a
    instance-of v2, v2, La/r5c0;

    .line 786
    .line 787
    if-eqz v2, :cond_1b

    .line 788
    .line 789
    move-object v2, v1

    .line 790
    check-cast v2, La/o2k;

    .line 791
    .line 792
    iget-object v2, v2, La/o2k;->b:Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 793
    .line 794
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    check-cast v3, La/t5c0;

    .line 799
    .line 800
    iget-boolean v3, v3, La/t5c0;->a:Z

    .line 801
    .line 802
    invoke-virtual {v2, v3}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->setValueVisibility(Z)V

    .line 803
    .line 804
    .line 805
    goto :goto_12

    .line 806
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 807
    .line 808
    .line 809
    goto :goto_15

    .line 810
    :cond_1c
    :goto_14
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 811
    .line 812
    :goto_15
    return-object v4

    .line 813
    :pswitch_f
    move-object/from16 v0, p1

    .line 814
    .line 815
    check-cast v0, Ljava/util/List;

    .line 816
    .line 817
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 818
    .line 819
    iget-object v7, v5, La/cp;->u:La/yfu0;

    .line 820
    .line 821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 825
    .line 826
    .line 827
    move-result v8

    .line 828
    if-eqz v8, :cond_1f

    .line 829
    .line 830
    invoke-static {v5}, La/l8x;->o0(La/cp;)V

    .line 831
    .line 832
    .line 833
    move-object v0, v7

    .line 834
    check-cast v0, La/p2k;

    .line 835
    .line 836
    iget-object v0, v0, La/p2k;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 837
    .line 838
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    check-cast v1, La/h5c0;

    .line 843
    .line 844
    iget-boolean v1, v1, La/h5c0;->c:Z

    .line 845
    .line 846
    if-eqz v1, :cond_1d

    .line 847
    .line 848
    move v1, v3

    .line 849
    goto :goto_16

    .line 850
    :cond_1d
    move v1, v2

    .line 851
    :goto_16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 852
    .line 853
    .line 854
    move-object v0, v7

    .line 855
    check-cast v0, La/p2k;

    .line 856
    .line 857
    iget-object v0, v0, La/p2k;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 858
    .line 859
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    check-cast v1, La/h5c0;

    .line 864
    .line 865
    iget-boolean v1, v1, La/h5c0;->d:Z

    .line 866
    .line 867
    if-eqz v1, :cond_1e

    .line 868
    .line 869
    move v2, v3

    .line 870
    :cond_1e
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 871
    .line 872
    .line 873
    move-object v0, v7

    .line 874
    check-cast v0, La/p2k;

    .line 875
    .line 876
    iget-object v0, v0, La/p2k;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 877
    .line 878
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    check-cast v1, La/h5c0;

    .line 883
    .line 884
    iget-boolean v1, v1, La/h5c0;->e:Z

    .line 885
    .line 886
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setLoading(Z)V

    .line 887
    .line 888
    .line 889
    invoke-static {v5}, La/l8x;->p0(La/cp;)V

    .line 890
    .line 891
    .line 892
    check-cast v7, La/p2k;

    .line 893
    .line 894
    iget-object v0, v7, La/p2k;->e:Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;

    .line 895
    .line 896
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    check-cast v1, La/h5c0;

    .line 901
    .line 902
    iget-object v1, v1, La/h5c0;->g:Ljava/util/ArrayList;

    .line 903
    .line 904
    invoke-virtual {v0, v1}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->setItems(Ljava/util/List;)V

    .line 905
    .line 906
    .line 907
    goto/16 :goto_1c

    .line 908
    .line 909
    :cond_1f
    new-instance v5, Ljava/util/ArrayList;

    .line 910
    .line 911
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 912
    .line 913
    .line 914
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 919
    .line 920
    .line 921
    move-result v7

    .line 922
    if-eqz v7, :cond_20

    .line 923
    .line 924
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v7

    .line 928
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    check-cast v7, Ljava/util/Collection;

    .line 932
    .line 933
    check-cast v7, Ljava/lang/Iterable;

    .line 934
    .line 935
    invoke-static {v5, v7}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 936
    .line 937
    .line 938
    goto :goto_17

    .line 939
    :cond_20
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 944
    .line 945
    .line 946
    move-result v5

    .line 947
    if-eqz v5, :cond_2a

    .line 948
    .line 949
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v5

    .line 953
    check-cast v5, La/g5c0;

    .line 954
    .line 955
    if-eqz v5, :cond_29

    .line 956
    .line 957
    instance-of v7, v5, La/z4c0;

    .line 958
    .line 959
    if-eqz v7, :cond_21

    .line 960
    .line 961
    goto :goto_19

    .line 962
    :cond_21
    instance-of v7, v5, La/d5c0;

    .line 963
    .line 964
    if-eqz v7, :cond_22

    .line 965
    .line 966
    :goto_19
    invoke-static {v6}, La/l8x;->o0(La/cp;)V

    .line 967
    .line 968
    .line 969
    goto :goto_18

    .line 970
    :cond_22
    instance-of v7, v5, La/a5c0;

    .line 971
    .line 972
    if-eqz v7, :cond_24

    .line 973
    .line 974
    move-object v5, v1

    .line 975
    check-cast v5, La/p2k;

    .line 976
    .line 977
    iget-object v5, v5, La/p2k;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 978
    .line 979
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v7

    .line 983
    check-cast v7, La/h5c0;

    .line 984
    .line 985
    iget-boolean v7, v7, La/h5c0;->c:Z

    .line 986
    .line 987
    if-eqz v7, :cond_23

    .line 988
    .line 989
    move v7, v3

    .line 990
    goto :goto_1a

    .line 991
    :cond_23
    move v7, v2

    .line 992
    :goto_1a
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 993
    .line 994
    .line 995
    goto :goto_18

    .line 996
    :cond_24
    instance-of v7, v5, La/c5c0;

    .line 997
    .line 998
    if-eqz v7, :cond_26

    .line 999
    .line 1000
    move-object v5, v1

    .line 1001
    check-cast v5, La/p2k;

    .line 1002
    .line 1003
    iget-object v5, v5, La/p2k;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 1004
    .line 1005
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v7

    .line 1009
    check-cast v7, La/h5c0;

    .line 1010
    .line 1011
    iget-boolean v7, v7, La/h5c0;->d:Z

    .line 1012
    .line 1013
    if-eqz v7, :cond_25

    .line 1014
    .line 1015
    move v7, v3

    .line 1016
    goto :goto_1b

    .line 1017
    :cond_25
    move v7, v2

    .line 1018
    :goto_1b
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1019
    .line 1020
    .line 1021
    goto :goto_18

    .line 1022
    :cond_26
    instance-of v7, v5, La/b5c0;

    .line 1023
    .line 1024
    if-eqz v7, :cond_27

    .line 1025
    .line 1026
    move-object v5, v1

    .line 1027
    check-cast v5, La/p2k;

    .line 1028
    .line 1029
    iget-object v5, v5, La/p2k;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 1030
    .line 1031
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v7

    .line 1035
    check-cast v7, La/h5c0;

    .line 1036
    .line 1037
    iget-boolean v7, v7, La/h5c0;->e:Z

    .line 1038
    .line 1039
    invoke-virtual {v5, v7}, Lorg/xplatform/uikit/components/buttons/DsButton;->setLoading(Z)V

    .line 1040
    .line 1041
    .line 1042
    goto :goto_18

    .line 1043
    :cond_27
    instance-of v7, v5, La/f5c0;

    .line 1044
    .line 1045
    if-eqz v7, :cond_28

    .line 1046
    .line 1047
    invoke-static {v6}, La/l8x;->p0(La/cp;)V

    .line 1048
    .line 1049
    .line 1050
    goto :goto_18

    .line 1051
    :cond_28
    instance-of v5, v5, La/e5c0;

    .line 1052
    .line 1053
    if-eqz v5, :cond_29

    .line 1054
    .line 1055
    move-object v5, v1

    .line 1056
    check-cast v5, La/p2k;

    .line 1057
    .line 1058
    iget-object v5, v5, La/p2k;->e:Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;

    .line 1059
    .line 1060
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v7

    .line 1064
    check-cast v7, La/h5c0;

    .line 1065
    .line 1066
    iget-object v7, v7, La/h5c0;->g:Ljava/util/ArrayList;

    .line 1067
    .line 1068
    invoke-virtual {v5, v7}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->setItems(Ljava/util/List;)V

    .line 1069
    .line 1070
    .line 1071
    goto/16 :goto_18

    .line 1072
    .line 1073
    :cond_29
    invoke-static {}, La/t9f;->b()V

    .line 1074
    .line 1075
    .line 1076
    goto :goto_1d

    .line 1077
    :cond_2a
    :goto_1c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1078
    .line 1079
    :goto_1d
    return-object v4

    .line 1080
    :pswitch_10
    move-object/from16 v0, p1

    .line 1081
    .line 1082
    check-cast v0, Ljava/util/List;

    .line 1083
    .line 1084
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v1

    .line 1091
    if-eqz v1, :cond_2c

    .line 1092
    .line 1093
    iget-object v0, v5, La/cp;->u:La/yfu0;

    .line 1094
    .line 1095
    check-cast v0, La/q2k;

    .line 1096
    .line 1097
    iget-object v0, v0, La/q2k;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 1098
    .line 1099
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    check-cast v1, La/n5c0;

    .line 1104
    .line 1105
    iget-boolean v1, v1, La/n5c0;->a:Z

    .line 1106
    .line 1107
    if-eqz v1, :cond_2b

    .line 1108
    .line 1109
    move v2, v3

    .line 1110
    :cond_2b
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 1111
    .line 1112
    .line 1113
    invoke-static {v5}, La/h8x;->q(La/cp;)V

    .line 1114
    .line 1115
    .line 1116
    goto :goto_21

    .line 1117
    :cond_2c
    new-instance v1, Ljava/util/ArrayList;

    .line 1118
    .line 1119
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1120
    .line 1121
    .line 1122
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v5

    .line 1130
    if-eqz v5, :cond_2d

    .line 1131
    .line 1132
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v5

    .line 1136
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1137
    .line 1138
    .line 1139
    check-cast v5, Ljava/util/Collection;

    .line 1140
    .line 1141
    check-cast v5, Ljava/lang/Iterable;

    .line 1142
    .line 1143
    invoke-static {v1, v5}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1144
    .line 1145
    .line 1146
    goto :goto_1e

    .line 1147
    :cond_2d
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1152
    .line 1153
    .line 1154
    move-result v1

    .line 1155
    if-eqz v1, :cond_31

    .line 1156
    .line 1157
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v1

    .line 1161
    check-cast v1, La/m5c0;

    .line 1162
    .line 1163
    if-eqz v1, :cond_30

    .line 1164
    .line 1165
    instance-of v5, v1, La/k5c0;

    .line 1166
    .line 1167
    if-eqz v5, :cond_2f

    .line 1168
    .line 1169
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 1170
    .line 1171
    check-cast v1, La/q2k;

    .line 1172
    .line 1173
    iget-object v1, v1, La/q2k;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 1174
    .line 1175
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v5

    .line 1179
    check-cast v5, La/n5c0;

    .line 1180
    .line 1181
    iget-boolean v5, v5, La/n5c0;->a:Z

    .line 1182
    .line 1183
    if-eqz v5, :cond_2e

    .line 1184
    .line 1185
    move v5, v3

    .line 1186
    goto :goto_20

    .line 1187
    :cond_2e
    move v5, v2

    .line 1188
    :goto_20
    invoke-virtual {v1, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 1189
    .line 1190
    .line 1191
    goto :goto_1f

    .line 1192
    :cond_2f
    instance-of v1, v1, La/l5c0;

    .line 1193
    .line 1194
    if-eqz v1, :cond_30

    .line 1195
    .line 1196
    invoke-static {v6}, La/h8x;->q(La/cp;)V

    .line 1197
    .line 1198
    .line 1199
    goto :goto_1f

    .line 1200
    :cond_30
    invoke-static {}, La/t9f;->b()V

    .line 1201
    .line 1202
    .line 1203
    goto :goto_22

    .line 1204
    :cond_31
    :goto_21
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1205
    .line 1206
    :goto_22
    return-object v4

    .line 1207
    :pswitch_11
    move-object/from16 v0, p1

    .line 1208
    .line 1209
    check-cast v0, Ljava/util/List;

    .line 1210
    .line 1211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    .line 1213
    .line 1214
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1215
    .line 1216
    .line 1217
    move-result v1

    .line 1218
    if-eqz v1, :cond_32

    .line 1219
    .line 1220
    iget-object v0, v5, La/cp;->u:La/yfu0;

    .line 1221
    .line 1222
    check-cast v0, La/j2k;

    .line 1223
    .line 1224
    iget-object v0, v0, La/j2k;->b:Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;

    .line 1225
    .line 1226
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v1

    .line 1230
    check-cast v1, La/l4c0;

    .line 1231
    .line 1232
    iget-object v1, v1, La/l4c0;->a:Ljava/util/ArrayList;

    .line 1233
    .line 1234
    invoke-virtual {v0, v1}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->setItems(Ljava/util/List;)V

    .line 1235
    .line 1236
    .line 1237
    goto :goto_25

    .line 1238
    :cond_32
    new-instance v1, Ljava/util/ArrayList;

    .line 1239
    .line 1240
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1241
    .line 1242
    .line 1243
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v2

    .line 1251
    if-eqz v2, :cond_33

    .line 1252
    .line 1253
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v2

    .line 1257
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1258
    .line 1259
    .line 1260
    check-cast v2, Ljava/util/Collection;

    .line 1261
    .line 1262
    check-cast v2, Ljava/lang/Iterable;

    .line 1263
    .line 1264
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1265
    .line 1266
    .line 1267
    goto :goto_23

    .line 1268
    :cond_33
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v1

    .line 1276
    if-eqz v1, :cond_35

    .line 1277
    .line 1278
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v1

    .line 1282
    check-cast v1, La/k4c0;

    .line 1283
    .line 1284
    if-eqz v1, :cond_34

    .line 1285
    .line 1286
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 1287
    .line 1288
    check-cast v1, La/j2k;

    .line 1289
    .line 1290
    iget-object v1, v1, La/j2k;->b:Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;

    .line 1291
    .line 1292
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v2

    .line 1296
    check-cast v2, La/l4c0;

    .line 1297
    .line 1298
    iget-object v2, v2, La/l4c0;->a:Ljava/util/ArrayList;

    .line 1299
    .line 1300
    invoke-virtual {v1, v2}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->setItems(Ljava/util/List;)V

    .line 1301
    .line 1302
    .line 1303
    goto :goto_24

    .line 1304
    :cond_34
    invoke-static {}, La/t9f;->b()V

    .line 1305
    .line 1306
    .line 1307
    goto :goto_26

    .line 1308
    :cond_35
    :goto_25
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1309
    .line 1310
    :goto_26
    return-object v4

    .line 1311
    :pswitch_12
    move-object/from16 v0, p1

    .line 1312
    .line 1313
    check-cast v0, Ljava/util/List;

    .line 1314
    .line 1315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1316
    .line 1317
    .line 1318
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1319
    .line 1320
    .line 1321
    move-result v1

    .line 1322
    if-eqz v1, :cond_38

    .line 1323
    .line 1324
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v0

    .line 1328
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 1329
    .line 1330
    iget-object v1, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->a:La/w2c0;

    .line 1331
    .line 1332
    iget-object v4, v5, La/cp;->u:La/yfu0;

    .line 1333
    .line 1334
    check-cast v4, La/vwx;

    .line 1335
    .line 1336
    iget-object v4, v4, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1337
    .line 1338
    invoke-static {v4, v1}, La/z7q0;->a(Lorg/xplatform/uikit/components/text_field/DsTextField;La/w2c0;)V

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v6

    .line 1345
    iget-object v7, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 1346
    .line 1347
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1348
    .line 1349
    .line 1350
    move-result v6

    .line 1351
    if-nez v6, :cond_36

    .line 1352
    .line 1353
    invoke-virtual {v4, v7}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 1354
    .line 1355
    .line 1356
    :cond_36
    invoke-static {v1}, La/b8k0;->R(La/w2c0;)I

    .line 1357
    .line 1358
    .line 1359
    move-result v1

    .line 1360
    invoke-virtual {v5, v1}, La/cp;->v(I)Ljava/lang/String;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    invoke-virtual {v4, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setLabelText(Ljava/lang/CharSequence;)V

    .line 1365
    .line 1366
    .line 1367
    iget-boolean v1, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->c:Z

    .line 1368
    .line 1369
    if-eqz v1, :cond_37

    .line 1370
    .line 1371
    move v2, v3

    .line 1372
    :cond_37
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1373
    .line 1374
    .line 1375
    iget-boolean v0, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->d:Z

    .line 1376
    .line 1377
    invoke-virtual {v4, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 1378
    .line 1379
    .line 1380
    goto/16 :goto_2a

    .line 1381
    .line 1382
    :cond_38
    new-instance v1, Ljava/util/ArrayList;

    .line 1383
    .line 1384
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1385
    .line 1386
    .line 1387
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v0

    .line 1391
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1392
    .line 1393
    .line 1394
    move-result v2

    .line 1395
    if-eqz v2, :cond_39

    .line 1396
    .line 1397
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v2

    .line 1401
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1402
    .line 1403
    .line 1404
    check-cast v2, Ljava/util/Collection;

    .line 1405
    .line 1406
    check-cast v2, Ljava/lang/Iterable;

    .line 1407
    .line 1408
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1409
    .line 1410
    .line 1411
    goto :goto_27

    .line 1412
    :cond_39
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v0

    .line 1416
    :cond_3a
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1417
    .line 1418
    .line 1419
    move-result v1

    .line 1420
    if-eqz v1, :cond_3e

    .line 1421
    .line 1422
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v1

    .line 1426
    check-cast v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload;

    .line 1427
    .line 1428
    iget-object v2, v6, La/cp;->u:La/yfu0;

    .line 1429
    .line 1430
    if-eqz v1, :cond_3d

    .line 1431
    .line 1432
    instance-of v5, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Text;

    .line 1433
    .line 1434
    if-eqz v5, :cond_3b

    .line 1435
    .line 1436
    move-object v5, v2

    .line 1437
    check-cast v5, La/vwx;

    .line 1438
    .line 1439
    iget-object v5, v5, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1440
    .line 1441
    invoke-virtual {v5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v5

    .line 1445
    check-cast v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Text;

    .line 1446
    .line 1447
    iget-object v1, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Text;->a:Ljava/lang/String;

    .line 1448
    .line 1449
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1450
    .line 1451
    .line 1452
    move-result v5

    .line 1453
    if-nez v5, :cond_3a

    .line 1454
    .line 1455
    check-cast v2, La/vwx;

    .line 1456
    .line 1457
    iget-object v2, v2, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1458
    .line 1459
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 1460
    .line 1461
    .line 1462
    goto :goto_28

    .line 1463
    :cond_3b
    instance-of v5, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Error;

    .line 1464
    .line 1465
    if-eqz v5, :cond_3d

    .line 1466
    .line 1467
    move-object v5, v2

    .line 1468
    check-cast v5, La/vwx;

    .line 1469
    .line 1470
    iget-object v5, v5, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1471
    .line 1472
    check-cast v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Error;

    .line 1473
    .line 1474
    iget-object v1, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem$Payload$Error;->a:Ljava/lang/String;

    .line 1475
    .line 1476
    invoke-virtual {v5, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 1477
    .line 1478
    .line 1479
    check-cast v2, La/vwx;

    .line 1480
    .line 1481
    iget-object v2, v2, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1482
    .line 1483
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1484
    .line 1485
    .line 1486
    move-result v1

    .line 1487
    if-lez v1, :cond_3c

    .line 1488
    .line 1489
    const/4 v1, 0x1

    .line 1490
    goto :goto_29

    .line 1491
    :cond_3c
    move v1, v3

    .line 1492
    :goto_29
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 1493
    .line 1494
    .line 1495
    goto :goto_28

    .line 1496
    :cond_3d
    invoke-static {}, La/t9f;->b()V

    .line 1497
    .line 1498
    .line 1499
    goto :goto_2b

    .line 1500
    :cond_3e
    :goto_2a
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1501
    .line 1502
    :goto_2b
    return-object v4

    .line 1503
    :pswitch_13
    move-object/from16 v0, p1

    .line 1504
    .line 1505
    check-cast v0, Ljava/util/List;

    .line 1506
    .line 1507
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1508
    .line 1509
    .line 1510
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1511
    .line 1512
    .line 1513
    move-result v1

    .line 1514
    if-eqz v1, :cond_42

    .line 1515
    .line 1516
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v0

    .line 1520
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 1521
    .line 1522
    iget-object v1, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->a:La/w2c0;

    .line 1523
    .line 1524
    iget-object v4, v5, La/cp;->u:La/yfu0;

    .line 1525
    .line 1526
    check-cast v4, La/wwx;

    .line 1527
    .line 1528
    iget-object v4, v4, La/wwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1529
    .line 1530
    iget-object v6, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->c:Ljava/lang/String;

    .line 1531
    .line 1532
    invoke-static {v4, v1}, La/z7q0;->a(Lorg/xplatform/uikit/components/text_field/DsTextField;La/w2c0;)V

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1539
    .line 1540
    .line 1541
    move-result v7

    .line 1542
    const/4 v8, 0x6

    .line 1543
    if-eq v7, v8, :cond_3f

    .line 1544
    .line 1545
    const/16 v8, 0xf

    .line 1546
    .line 1547
    if-eq v7, v8, :cond_3f

    .line 1548
    .line 1549
    goto :goto_2c

    .line 1550
    :cond_3f
    new-instance v7, La/y7q0;

    .line 1551
    .line 1552
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1553
    .line 1554
    .line 1555
    invoke-virtual {v4, v7}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 1556
    .line 1557
    .line 1558
    :goto_2c
    invoke-virtual {v4}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v7

    .line 1562
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1563
    .line 1564
    .line 1565
    move-result v7

    .line 1566
    if-nez v7, :cond_40

    .line 1567
    .line 1568
    invoke-static {v6}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v6

    .line 1572
    invoke-virtual {v4, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 1573
    .line 1574
    .line 1575
    :cond_40
    invoke-static {v1}, La/b8k0;->R(La/w2c0;)I

    .line 1576
    .line 1577
    .line 1578
    move-result v6

    .line 1579
    invoke-virtual {v5, v6}, La/cp;->v(I)Ljava/lang/String;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v6

    .line 1583
    invoke-virtual {v4, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setLabelText(Ljava/lang/CharSequence;)V

    .line 1584
    .line 1585
    .line 1586
    invoke-static {v1}, La/b8k0;->R(La/w2c0;)I

    .line 1587
    .line 1588
    .line 1589
    move-result v1

    .line 1590
    invoke-virtual {v5, v1}, La/cp;->v(I)Ljava/lang/String;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v1

    .line 1594
    invoke-virtual {v4, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 1595
    .line 1596
    .line 1597
    iget-boolean v1, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->d:Z

    .line 1598
    .line 1599
    if-eqz v1, :cond_41

    .line 1600
    .line 1601
    move v2, v3

    .line 1602
    :cond_41
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1603
    .line 1604
    .line 1605
    iget-boolean v1, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->e:Z

    .line 1606
    .line 1607
    invoke-virtual {v4, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 1608
    .line 1609
    .line 1610
    iget-object v0, v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->f:Ljava/lang/String;

    .line 1611
    .line 1612
    invoke-virtual {v4, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 1613
    .line 1614
    .line 1615
    goto :goto_2f

    .line 1616
    :cond_42
    new-instance v1, Ljava/util/ArrayList;

    .line 1617
    .line 1618
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1619
    .line 1620
    .line 1621
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v0

    .line 1625
    :goto_2d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1626
    .line 1627
    .line 1628
    move-result v2

    .line 1629
    if-eqz v2, :cond_43

    .line 1630
    .line 1631
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v2

    .line 1635
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1636
    .line 1637
    .line 1638
    check-cast v2, Ljava/util/Collection;

    .line 1639
    .line 1640
    check-cast v2, Ljava/lang/Iterable;

    .line 1641
    .line 1642
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1643
    .line 1644
    .line 1645
    goto :goto_2d

    .line 1646
    :cond_43
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v0

    .line 1650
    :goto_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1651
    .line 1652
    .line 1653
    move-result v1

    .line 1654
    if-eqz v1, :cond_45

    .line 1655
    .line 1656
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v1

    .line 1660
    check-cast v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable$Payload;

    .line 1661
    .line 1662
    instance-of v2, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable$Payload$Error;

    .line 1663
    .line 1664
    if-eqz v2, :cond_44

    .line 1665
    .line 1666
    iget-object v2, v6, La/cp;->u:La/yfu0;

    .line 1667
    .line 1668
    check-cast v2, La/wwx;

    .line 1669
    .line 1670
    iget-object v2, v2, La/wwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 1671
    .line 1672
    check-cast v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable$Payload$Error;

    .line 1673
    .line 1674
    iget-object v1, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable$Payload$Error;->a:Ljava/lang/String;

    .line 1675
    .line 1676
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 1677
    .line 1678
    .line 1679
    goto :goto_2e

    .line 1680
    :cond_44
    invoke-static {}, La/t9f;->b()V

    .line 1681
    .line 1682
    .line 1683
    goto :goto_30

    .line 1684
    :cond_45
    :goto_2f
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1685
    .line 1686
    :goto_30
    return-object v4

    .line 1687
    :pswitch_14
    move-object/from16 v0, p1

    .line 1688
    .line 1689
    check-cast v0, Ljava/util/List;

    .line 1690
    .line 1691
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 1692
    .line 1693
    iget-object v2, v5, La/cp;->u:La/yfu0;

    .line 1694
    .line 1695
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1696
    .line 1697
    .line 1698
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1699
    .line 1700
    .line 1701
    move-result v3

    .line 1702
    if-eqz v3, :cond_46

    .line 1703
    .line 1704
    invoke-static {v5}, La/b8k0;->s(La/cp;)V

    .line 1705
    .line 1706
    .line 1707
    invoke-static {v5}, La/b8k0;->u(La/cp;)V

    .line 1708
    .line 1709
    .line 1710
    invoke-static {v5}, La/b8k0;->t(La/cp;)V

    .line 1711
    .line 1712
    .line 1713
    move-object v0, v2

    .line 1714
    check-cast v0, La/cfx;

    .line 1715
    .line 1716
    iget-object v0, v0, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1717
    .line 1718
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v1

    .line 1722
    check-cast v1, La/xl90;

    .line 1723
    .line 1724
    iget-object v1, v1, La/xl90;->h:Ljava/lang/String;

    .line 1725
    .line 1726
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeText(Ljava/lang/CharSequence;)V

    .line 1727
    .line 1728
    .line 1729
    move-object v0, v2

    .line 1730
    check-cast v0, La/cfx;

    .line 1731
    .line 1732
    iget-object v0, v0, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1733
    .line 1734
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v1

    .line 1738
    check-cast v1, La/xl90;

    .line 1739
    .line 1740
    iget-object v1, v1, La/xl90;->f:Ljava/lang/String;

    .line 1741
    .line 1742
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Ljava/lang/String;)V

    .line 1743
    .line 1744
    .line 1745
    check-cast v2, La/cfx;

    .line 1746
    .line 1747
    iget-object v0, v2, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1748
    .line 1749
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v1

    .line 1753
    check-cast v1, La/xl90;

    .line 1754
    .line 1755
    iget-object v1, v1, La/xl90;->g:Ljava/lang/String;

    .line 1756
    .line 1757
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhonePlaceholder(Ljava/lang/CharSequence;)V

    .line 1758
    .line 1759
    .line 1760
    goto/16 :goto_33

    .line 1761
    .line 1762
    :cond_46
    new-instance v2, Ljava/util/ArrayList;

    .line 1763
    .line 1764
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1765
    .line 1766
    .line 1767
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v0

    .line 1771
    :goto_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1772
    .line 1773
    .line 1774
    move-result v3

    .line 1775
    if-eqz v3, :cond_47

    .line 1776
    .line 1777
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v3

    .line 1781
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1782
    .line 1783
    .line 1784
    check-cast v3, Ljava/util/Collection;

    .line 1785
    .line 1786
    check-cast v3, Ljava/lang/Iterable;

    .line 1787
    .line 1788
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1789
    .line 1790
    .line 1791
    goto :goto_31

    .line 1792
    :cond_47
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v0

    .line 1796
    :goto_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1797
    .line 1798
    .line 1799
    move-result v2

    .line 1800
    if-eqz v2, :cond_4e

    .line 1801
    .line 1802
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v2

    .line 1806
    check-cast v2, La/ul90;

    .line 1807
    .line 1808
    if-eqz v2, :cond_4d

    .line 1809
    .line 1810
    instance-of v3, v2, La/pl90;

    .line 1811
    .line 1812
    if-eqz v3, :cond_48

    .line 1813
    .line 1814
    invoke-static {v6}, La/b8k0;->s(La/cp;)V

    .line 1815
    .line 1816
    .line 1817
    goto :goto_32

    .line 1818
    :cond_48
    instance-of v3, v2, La/rl90;

    .line 1819
    .line 1820
    if-eqz v3, :cond_49

    .line 1821
    .line 1822
    invoke-static {v6}, La/b8k0;->u(La/cp;)V

    .line 1823
    .line 1824
    .line 1825
    goto :goto_32

    .line 1826
    :cond_49
    instance-of v3, v2, La/sl90;

    .line 1827
    .line 1828
    if-eqz v3, :cond_4a

    .line 1829
    .line 1830
    move-object v2, v1

    .line 1831
    check-cast v2, La/cfx;

    .line 1832
    .line 1833
    iget-object v2, v2, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1834
    .line 1835
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v3

    .line 1839
    check-cast v3, La/xl90;

    .line 1840
    .line 1841
    iget-object v3, v3, La/xl90;->h:Ljava/lang/String;

    .line 1842
    .line 1843
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeText(Ljava/lang/CharSequence;)V

    .line 1844
    .line 1845
    .line 1846
    goto :goto_32

    .line 1847
    :cond_4a
    instance-of v3, v2, La/ol90;

    .line 1848
    .line 1849
    if-eqz v3, :cond_4b

    .line 1850
    .line 1851
    move-object v2, v1

    .line 1852
    check-cast v2, La/cfx;

    .line 1853
    .line 1854
    iget-object v2, v2, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1855
    .line 1856
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v3

    .line 1860
    check-cast v3, La/xl90;

    .line 1861
    .line 1862
    iget-object v3, v3, La/xl90;->f:Ljava/lang/String;

    .line 1863
    .line 1864
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    goto :goto_32

    .line 1868
    :cond_4b
    instance-of v3, v2, La/tl90;

    .line 1869
    .line 1870
    if-eqz v3, :cond_4c

    .line 1871
    .line 1872
    move-object v2, v1

    .line 1873
    check-cast v2, La/cfx;

    .line 1874
    .line 1875
    iget-object v2, v2, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1876
    .line 1877
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v3

    .line 1881
    check-cast v3, La/xl90;

    .line 1882
    .line 1883
    iget-object v3, v3, La/xl90;->g:Ljava/lang/String;

    .line 1884
    .line 1885
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhonePlaceholder(Ljava/lang/CharSequence;)V

    .line 1886
    .line 1887
    .line 1888
    goto :goto_32

    .line 1889
    :cond_4c
    instance-of v2, v2, La/ql90;

    .line 1890
    .line 1891
    if-eqz v2, :cond_4d

    .line 1892
    .line 1893
    invoke-static {v6}, La/b8k0;->t(La/cp;)V

    .line 1894
    .line 1895
    .line 1896
    goto :goto_32

    .line 1897
    :cond_4d
    invoke-static {}, La/t9f;->b()V

    .line 1898
    .line 1899
    .line 1900
    goto :goto_34

    .line 1901
    :cond_4e
    :goto_33
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1902
    .line 1903
    :goto_34
    return-object v4

    .line 1904
    :pswitch_15
    move-object/from16 v0, p1

    .line 1905
    .line 1906
    check-cast v0, Ljava/util/List;

    .line 1907
    .line 1908
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1909
    .line 1910
    .line 1911
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1912
    .line 1913
    .line 1914
    move-result v1

    .line 1915
    if-eqz v1, :cond_4f

    .line 1916
    .line 1917
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v0

    .line 1921
    check-cast v0, La/je90;

    .line 1922
    .line 1923
    iget-object v1, v5, La/cp;->u:La/yfu0;

    .line 1924
    .line 1925
    check-cast v1, La/owx;

    .line 1926
    .line 1927
    iget-object v2, v1, La/owx;->b:Landroid/widget/TextView;

    .line 1928
    .line 1929
    iget-object v3, v0, La/je90;->a:Ljava/lang/String;

    .line 1930
    .line 1931
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1932
    .line 1933
    .line 1934
    iget-object v2, v1, La/owx;->c:Landroid/widget/TextView;

    .line 1935
    .line 1936
    iget-object v3, v0, La/je90;->b:La/zmk0;

    .line 1937
    .line 1938
    iget-object v4, v5, La/cp;->w:Landroid/content/Context;

    .line 1939
    .line 1940
    invoke-virtual {v3, v4}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v3

    .line 1944
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1945
    .line 1946
    .line 1947
    iget-object v1, v1, La/owx;->d:Landroid/widget/TextView;

    .line 1948
    .line 1949
    iget-object v0, v0, La/je90;->c:La/zmk0;

    .line 1950
    .line 1951
    invoke-virtual {v0, v4}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v0

    .line 1955
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1956
    .line 1957
    .line 1958
    goto/16 :goto_37

    .line 1959
    .line 1960
    :cond_4f
    new-instance v1, Ljava/util/ArrayList;

    .line 1961
    .line 1962
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1963
    .line 1964
    .line 1965
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v0

    .line 1969
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1970
    .line 1971
    .line 1972
    move-result v2

    .line 1973
    if-eqz v2, :cond_50

    .line 1974
    .line 1975
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v2

    .line 1979
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1980
    .line 1981
    .line 1982
    check-cast v2, Ljava/util/Collection;

    .line 1983
    .line 1984
    check-cast v2, Ljava/lang/Iterable;

    .line 1985
    .line 1986
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1987
    .line 1988
    .line 1989
    goto :goto_35

    .line 1990
    :cond_50
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v0

    .line 1994
    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1995
    .line 1996
    .line 1997
    move-result v1

    .line 1998
    if-eqz v1, :cond_54

    .line 1999
    .line 2000
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v1

    .line 2004
    check-cast v1, La/ie90;

    .line 2005
    .line 2006
    iget-object v2, v6, La/cp;->w:Landroid/content/Context;

    .line 2007
    .line 2008
    iget-object v3, v6, La/cp;->u:La/yfu0;

    .line 2009
    .line 2010
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2011
    .line 2012
    .line 2013
    instance-of v5, v1, La/ge90;

    .line 2014
    .line 2015
    if-eqz v5, :cond_51

    .line 2016
    .line 2017
    check-cast v3, La/owx;

    .line 2018
    .line 2019
    iget-object v3, v3, La/owx;->c:Landroid/widget/TextView;

    .line 2020
    .line 2021
    check-cast v1, La/ge90;

    .line 2022
    .line 2023
    iget-object v1, v1, La/ge90;->a:La/zmk0;

    .line 2024
    .line 2025
    invoke-virtual {v1, v2}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v1

    .line 2029
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2030
    .line 2031
    .line 2032
    goto :goto_36

    .line 2033
    :cond_51
    instance-of v5, v1, La/he90;

    .line 2034
    .line 2035
    if-eqz v5, :cond_52

    .line 2036
    .line 2037
    check-cast v3, La/owx;

    .line 2038
    .line 2039
    iget-object v3, v3, La/owx;->d:Landroid/widget/TextView;

    .line 2040
    .line 2041
    check-cast v1, La/he90;

    .line 2042
    .line 2043
    iget-object v1, v1, La/he90;->a:La/zmk0;

    .line 2044
    .line 2045
    invoke-virtual {v1, v2}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v1

    .line 2049
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2050
    .line 2051
    .line 2052
    goto :goto_36

    .line 2053
    :cond_52
    instance-of v2, v1, La/fe90;

    .line 2054
    .line 2055
    if-eqz v2, :cond_53

    .line 2056
    .line 2057
    check-cast v3, La/owx;

    .line 2058
    .line 2059
    iget-object v2, v3, La/owx;->b:Landroid/widget/TextView;

    .line 2060
    .line 2061
    check-cast v1, La/fe90;

    .line 2062
    .line 2063
    iget-object v1, v1, La/fe90;->a:Ljava/lang/String;

    .line 2064
    .line 2065
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2066
    .line 2067
    .line 2068
    goto :goto_36

    .line 2069
    :cond_53
    invoke-static {}, La/t9f;->b()V

    .line 2070
    .line 2071
    .line 2072
    goto :goto_38

    .line 2073
    :cond_54
    :goto_37
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2074
    .line 2075
    :goto_38
    return-object v4

    .line 2076
    :pswitch_16
    move-object/from16 v0, p1

    .line 2077
    .line 2078
    check-cast v0, Ljava/util/List;

    .line 2079
    .line 2080
    iget-object v1, v5, La/cp;->u:La/yfu0;

    .line 2081
    .line 2082
    iget-object v2, v6, La/cp;->u:La/yfu0;

    .line 2083
    .line 2084
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2085
    .line 2086
    .line 2087
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2088
    .line 2089
    .line 2090
    move-result v3

    .line 2091
    if-eqz v3, :cond_55

    .line 2092
    .line 2093
    move-object v0, v1

    .line 2094
    check-cast v0, La/ex20;

    .line 2095
    .line 2096
    iget-object v0, v0, La/ex20;->b:Landroid/widget/TextView;

    .line 2097
    .line 2098
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v2

    .line 2102
    check-cast v2, La/dx20;

    .line 2103
    .line 2104
    iget-object v2, v2, La/dx20;->c:Ljava/lang/String;

    .line 2105
    .line 2106
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2107
    .line 2108
    .line 2109
    check-cast v1, La/ex20;

    .line 2110
    .line 2111
    iget-object v0, v1, La/ex20;->c:Landroid/widget/TextView;

    .line 2112
    .line 2113
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v1

    .line 2117
    check-cast v1, La/dx20;

    .line 2118
    .line 2119
    iget-object v1, v1, La/dx20;->a:Ljava/lang/String;

    .line 2120
    .line 2121
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2122
    .line 2123
    .line 2124
    invoke-static {v5}, La/ydx;->w(La/cp;)V

    .line 2125
    .line 2126
    .line 2127
    invoke-static {v5}, La/ydx;->z(La/cp;)V

    .line 2128
    .line 2129
    .line 2130
    goto/16 :goto_3b

    .line 2131
    .line 2132
    :cond_55
    new-instance v1, Ljava/util/ArrayList;

    .line 2133
    .line 2134
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2135
    .line 2136
    .line 2137
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v0

    .line 2141
    :goto_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2142
    .line 2143
    .line 2144
    move-result v3

    .line 2145
    if-eqz v3, :cond_56

    .line 2146
    .line 2147
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v3

    .line 2151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2152
    .line 2153
    .line 2154
    check-cast v3, Ljava/util/Collection;

    .line 2155
    .line 2156
    check-cast v3, Ljava/lang/Iterable;

    .line 2157
    .line 2158
    invoke-static {v1, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2159
    .line 2160
    .line 2161
    goto :goto_39

    .line 2162
    :cond_56
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v0

    .line 2166
    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2167
    .line 2168
    .line 2169
    move-result v1

    .line 2170
    if-eqz v1, :cond_5c

    .line 2171
    .line 2172
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v1

    .line 2176
    check-cast v1, La/cx20;

    .line 2177
    .line 2178
    if-eqz v1, :cond_5b

    .line 2179
    .line 2180
    instance-of v3, v1, La/bx20;

    .line 2181
    .line 2182
    if-eqz v3, :cond_57

    .line 2183
    .line 2184
    invoke-static {v6}, La/ydx;->w(La/cp;)V

    .line 2185
    .line 2186
    .line 2187
    invoke-static {v6}, La/ydx;->z(La/cp;)V

    .line 2188
    .line 2189
    .line 2190
    goto :goto_3a

    .line 2191
    :cond_57
    instance-of v3, v1, La/yw20;

    .line 2192
    .line 2193
    if-eqz v3, :cond_58

    .line 2194
    .line 2195
    move-object v1, v2

    .line 2196
    check-cast v1, La/ex20;

    .line 2197
    .line 2198
    iget-object v1, v1, La/ex20;->b:Landroid/widget/TextView;

    .line 2199
    .line 2200
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v3

    .line 2204
    check-cast v3, La/dx20;

    .line 2205
    .line 2206
    iget-object v3, v3, La/dx20;->c:Ljava/lang/String;

    .line 2207
    .line 2208
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2209
    .line 2210
    .line 2211
    goto :goto_3a

    .line 2212
    :cond_58
    instance-of v3, v1, La/zw20;

    .line 2213
    .line 2214
    if-eqz v3, :cond_59

    .line 2215
    .line 2216
    move-object v1, v2

    .line 2217
    check-cast v1, La/ex20;

    .line 2218
    .line 2219
    iget-object v1, v1, La/ex20;->c:Landroid/widget/TextView;

    .line 2220
    .line 2221
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v3

    .line 2225
    check-cast v3, La/dx20;

    .line 2226
    .line 2227
    iget-object v3, v3, La/dx20;->a:Ljava/lang/String;

    .line 2228
    .line 2229
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2230
    .line 2231
    .line 2232
    goto :goto_3a

    .line 2233
    :cond_59
    instance-of v3, v1, La/ax20;

    .line 2234
    .line 2235
    if-eqz v3, :cond_5a

    .line 2236
    .line 2237
    invoke-static {v6}, La/ydx;->z(La/cp;)V

    .line 2238
    .line 2239
    .line 2240
    goto :goto_3a

    .line 2241
    :cond_5a
    instance-of v1, v1, La/xw20;

    .line 2242
    .line 2243
    if-eqz v1, :cond_5b

    .line 2244
    .line 2245
    invoke-static {v6}, La/ydx;->w(La/cp;)V

    .line 2246
    .line 2247
    .line 2248
    goto :goto_3a

    .line 2249
    :cond_5b
    invoke-static {}, La/t9f;->b()V

    .line 2250
    .line 2251
    .line 2252
    goto :goto_3c

    .line 2253
    :cond_5c
    :goto_3b
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2254
    .line 2255
    :goto_3c
    return-object v4

    .line 2256
    :pswitch_17
    move-object/from16 v0, p1

    .line 2257
    .line 2258
    check-cast v0, Ljava/util/List;

    .line 2259
    .line 2260
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 2261
    .line 2262
    iget-object v2, v5, La/cp;->u:La/yfu0;

    .line 2263
    .line 2264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2265
    .line 2266
    .line 2267
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2268
    .line 2269
    .line 2270
    move-result v3

    .line 2271
    if-eqz v3, :cond_5d

    .line 2272
    .line 2273
    move-object v0, v2

    .line 2274
    check-cast v0, La/cxx;

    .line 2275
    .line 2276
    iget-object v0, v0, La/cxx;->c:Landroid/widget/TextView;

    .line 2277
    .line 2278
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v1

    .line 2282
    check-cast v1, La/gsz;

    .line 2283
    .line 2284
    iget-object v1, v1, La/gsz;->a:La/csz;

    .line 2285
    .line 2286
    iget-object v3, v5, La/cp;->w:Landroid/content/Context;

    .line 2287
    .line 2288
    invoke-interface {v1, v3}, La/csz;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 2289
    .line 2290
    .line 2291
    move-result-object v1

    .line 2292
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2293
    .line 2294
    .line 2295
    check-cast v2, La/cxx;

    .line 2296
    .line 2297
    iget-object v0, v2, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 2298
    .line 2299
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2300
    .line 2301
    .line 2302
    move-result-object v1

    .line 2303
    check-cast v1, La/gsz;

    .line 2304
    .line 2305
    iget-boolean v1, v1, La/gsz;->b:Z

    .line 2306
    .line 2307
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 2308
    .line 2309
    .line 2310
    goto :goto_3f

    .line 2311
    :cond_5d
    new-instance v2, Ljava/util/ArrayList;

    .line 2312
    .line 2313
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2314
    .line 2315
    .line 2316
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v0

    .line 2320
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2321
    .line 2322
    .line 2323
    move-result v3

    .line 2324
    if-eqz v3, :cond_5e

    .line 2325
    .line 2326
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2327
    .line 2328
    .line 2329
    move-result-object v3

    .line 2330
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2331
    .line 2332
    .line 2333
    check-cast v3, Ljava/util/Collection;

    .line 2334
    .line 2335
    check-cast v3, Ljava/lang/Iterable;

    .line 2336
    .line 2337
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2338
    .line 2339
    .line 2340
    goto :goto_3d

    .line 2341
    :cond_5e
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v0

    .line 2345
    :goto_3e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2346
    .line 2347
    .line 2348
    move-result v2

    .line 2349
    if-eqz v2, :cond_61

    .line 2350
    .line 2351
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v2

    .line 2355
    check-cast v2, La/fsz;

    .line 2356
    .line 2357
    if-eqz v2, :cond_60

    .line 2358
    .line 2359
    instance-of v3, v2, La/esz;

    .line 2360
    .line 2361
    if-eqz v3, :cond_5f

    .line 2362
    .line 2363
    move-object v2, v1

    .line 2364
    check-cast v2, La/cxx;

    .line 2365
    .line 2366
    iget-object v2, v2, La/cxx;->c:Landroid/widget/TextView;

    .line 2367
    .line 2368
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v3

    .line 2372
    check-cast v3, La/gsz;

    .line 2373
    .line 2374
    iget-object v3, v3, La/gsz;->a:La/csz;

    .line 2375
    .line 2376
    iget-object v5, v6, La/cp;->w:Landroid/content/Context;

    .line 2377
    .line 2378
    invoke-interface {v3, v5}, La/csz;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v3

    .line 2382
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2383
    .line 2384
    .line 2385
    goto :goto_3e

    .line 2386
    :cond_5f
    instance-of v2, v2, La/dsz;

    .line 2387
    .line 2388
    if-eqz v2, :cond_60

    .line 2389
    .line 2390
    move-object v2, v1

    .line 2391
    check-cast v2, La/cxx;

    .line 2392
    .line 2393
    iget-object v2, v2, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 2394
    .line 2395
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2396
    .line 2397
    .line 2398
    move-result-object v3

    .line 2399
    check-cast v3, La/gsz;

    .line 2400
    .line 2401
    iget-boolean v3, v3, La/gsz;->b:Z

    .line 2402
    .line 2403
    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 2404
    .line 2405
    .line 2406
    goto :goto_3e

    .line 2407
    :cond_60
    invoke-static {}, La/t9f;->b()V

    .line 2408
    .line 2409
    .line 2410
    goto :goto_40

    .line 2411
    :cond_61
    :goto_3f
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2412
    .line 2413
    :goto_40
    return-object v4

    .line 2414
    :pswitch_18
    move-object/from16 v0, p1

    .line 2415
    .line 2416
    check-cast v0, Ljava/util/List;

    .line 2417
    .line 2418
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2419
    .line 2420
    .line 2421
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2422
    .line 2423
    .line 2424
    move-result v1

    .line 2425
    if-eqz v1, :cond_62

    .line 2426
    .line 2427
    iget-object v0, v5, La/cp;->u:La/yfu0;

    .line 2428
    .line 2429
    check-cast v0, La/wvx;

    .line 2430
    .line 2431
    iget-object v0, v0, La/wvx;->e:Landroid/widget/TextView;

    .line 2432
    .line 2433
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2434
    .line 2435
    .line 2436
    move-result-object v1

    .line 2437
    check-cast v1, La/goz;

    .line 2438
    .line 2439
    iget-object v1, v1, La/goz;->b:Ljava/lang/String;

    .line 2440
    .line 2441
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2442
    .line 2443
    .line 2444
    invoke-static {v5}, La/x2x;->A(La/cp;)V

    .line 2445
    .line 2446
    .line 2447
    invoke-static {v5}, La/x2x;->C(La/cp;)V

    .line 2448
    .line 2449
    .line 2450
    invoke-static {v5}, La/x2x;->B(La/cp;)V

    .line 2451
    .line 2452
    .line 2453
    invoke-static {v5}, La/x2x;->D(La/cp;)V

    .line 2454
    .line 2455
    .line 2456
    goto/16 :goto_43

    .line 2457
    .line 2458
    :cond_62
    new-instance v1, Ljava/util/ArrayList;

    .line 2459
    .line 2460
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2461
    .line 2462
    .line 2463
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v0

    .line 2467
    :goto_41
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2468
    .line 2469
    .line 2470
    move-result v2

    .line 2471
    if-eqz v2, :cond_63

    .line 2472
    .line 2473
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v2

    .line 2477
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2478
    .line 2479
    .line 2480
    check-cast v2, Ljava/util/Collection;

    .line 2481
    .line 2482
    check-cast v2, Ljava/lang/Iterable;

    .line 2483
    .line 2484
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2485
    .line 2486
    .line 2487
    goto :goto_41

    .line 2488
    :cond_63
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v0

    .line 2492
    :goto_42
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2493
    .line 2494
    .line 2495
    move-result v1

    .line 2496
    if-eqz v1, :cond_69

    .line 2497
    .line 2498
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v1

    .line 2502
    check-cast v1, La/foz;

    .line 2503
    .line 2504
    if-eqz v1, :cond_68

    .line 2505
    .line 2506
    instance-of v2, v1, La/eoz;

    .line 2507
    .line 2508
    if-eqz v2, :cond_64

    .line 2509
    .line 2510
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 2511
    .line 2512
    check-cast v1, La/wvx;

    .line 2513
    .line 2514
    iget-object v1, v1, La/wvx;->e:Landroid/widget/TextView;

    .line 2515
    .line 2516
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2517
    .line 2518
    .line 2519
    move-result-object v2

    .line 2520
    check-cast v2, La/goz;

    .line 2521
    .line 2522
    iget-object v2, v2, La/goz;->b:Ljava/lang/String;

    .line 2523
    .line 2524
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2525
    .line 2526
    .line 2527
    goto :goto_42

    .line 2528
    :cond_64
    instance-of v2, v1, La/aoz;

    .line 2529
    .line 2530
    if-eqz v2, :cond_65

    .line 2531
    .line 2532
    invoke-static {v6}, La/x2x;->A(La/cp;)V

    .line 2533
    .line 2534
    .line 2535
    goto :goto_42

    .line 2536
    :cond_65
    instance-of v2, v1, La/coz;

    .line 2537
    .line 2538
    if-eqz v2, :cond_66

    .line 2539
    .line 2540
    invoke-static {v6}, La/x2x;->C(La/cp;)V

    .line 2541
    .line 2542
    .line 2543
    goto :goto_42

    .line 2544
    :cond_66
    instance-of v2, v1, La/boz;

    .line 2545
    .line 2546
    if-eqz v2, :cond_67

    .line 2547
    .line 2548
    invoke-static {v6}, La/x2x;->B(La/cp;)V

    .line 2549
    .line 2550
    .line 2551
    goto :goto_42

    .line 2552
    :cond_67
    instance-of v1, v1, La/doz;

    .line 2553
    .line 2554
    if-eqz v1, :cond_68

    .line 2555
    .line 2556
    invoke-static {v6}, La/x2x;->D(La/cp;)V

    .line 2557
    .line 2558
    .line 2559
    goto :goto_42

    .line 2560
    :cond_68
    invoke-static {}, La/t9f;->b()V

    .line 2561
    .line 2562
    .line 2563
    goto :goto_44

    .line 2564
    :cond_69
    :goto_43
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2565
    .line 2566
    :goto_44
    return-object v4

    .line 2567
    :pswitch_19
    move-object/from16 v0, p1

    .line 2568
    .line 2569
    check-cast v0, Ljava/util/List;

    .line 2570
    .line 2571
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 2572
    .line 2573
    iget-object v2, v5, La/cp;->u:La/yfu0;

    .line 2574
    .line 2575
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2576
    .line 2577
    .line 2578
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2579
    .line 2580
    .line 2581
    move-result v3

    .line 2582
    if-eqz v3, :cond_6a

    .line 2583
    .line 2584
    move-object v0, v2

    .line 2585
    check-cast v0, La/rvx;

    .line 2586
    .line 2587
    iget-object v0, v0, La/rvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2588
    .line 2589
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v1

    .line 2593
    check-cast v1, La/cax;

    .line 2594
    .line 2595
    iget v1, v1, La/cax;->b:I

    .line 2596
    .line 2597
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 2598
    .line 2599
    .line 2600
    check-cast v2, La/rvx;

    .line 2601
    .line 2602
    iget-object v0, v2, La/rvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2603
    .line 2604
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2605
    .line 2606
    .line 2607
    move-result-object v1

    .line 2608
    check-cast v1, La/cax;

    .line 2609
    .line 2610
    iget v1, v1, La/cax;->c:I

    .line 2611
    .line 2612
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2613
    .line 2614
    .line 2615
    goto :goto_47

    .line 2616
    :cond_6a
    new-instance v2, Ljava/util/ArrayList;

    .line 2617
    .line 2618
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2619
    .line 2620
    .line 2621
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2622
    .line 2623
    .line 2624
    move-result-object v0

    .line 2625
    :goto_45
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2626
    .line 2627
    .line 2628
    move-result v3

    .line 2629
    if-eqz v3, :cond_6b

    .line 2630
    .line 2631
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2632
    .line 2633
    .line 2634
    move-result-object v3

    .line 2635
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2636
    .line 2637
    .line 2638
    check-cast v3, Ljava/util/Collection;

    .line 2639
    .line 2640
    check-cast v3, Ljava/lang/Iterable;

    .line 2641
    .line 2642
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2643
    .line 2644
    .line 2645
    goto :goto_45

    .line 2646
    :cond_6b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2647
    .line 2648
    .line 2649
    move-result-object v0

    .line 2650
    :goto_46
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2651
    .line 2652
    .line 2653
    move-result v2

    .line 2654
    if-eqz v2, :cond_6e

    .line 2655
    .line 2656
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2657
    .line 2658
    .line 2659
    move-result-object v2

    .line 2660
    check-cast v2, La/bax;

    .line 2661
    .line 2662
    if-eqz v2, :cond_6d

    .line 2663
    .line 2664
    instance-of v3, v2, La/aax;

    .line 2665
    .line 2666
    if-eqz v3, :cond_6c

    .line 2667
    .line 2668
    move-object v2, v1

    .line 2669
    check-cast v2, La/rvx;

    .line 2670
    .line 2671
    iget-object v2, v2, La/rvx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2672
    .line 2673
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v3

    .line 2677
    check-cast v3, La/cax;

    .line 2678
    .line 2679
    iget v3, v3, La/cax;->b:I

    .line 2680
    .line 2681
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(I)V

    .line 2682
    .line 2683
    .line 2684
    goto :goto_46

    .line 2685
    :cond_6c
    instance-of v2, v2, La/z9x;

    .line 2686
    .line 2687
    if-eqz v2, :cond_6d

    .line 2688
    .line 2689
    move-object v2, v1

    .line 2690
    check-cast v2, La/rvx;

    .line 2691
    .line 2692
    iget-object v2, v2, La/rvx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2693
    .line 2694
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2695
    .line 2696
    .line 2697
    move-result-object v3

    .line 2698
    check-cast v3, La/cax;

    .line 2699
    .line 2700
    iget v3, v3, La/cax;->c:I

    .line 2701
    .line 2702
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 2703
    .line 2704
    .line 2705
    goto :goto_46

    .line 2706
    :cond_6d
    invoke-static {}, La/t9f;->b()V

    .line 2707
    .line 2708
    .line 2709
    goto :goto_48

    .line 2710
    :cond_6e
    :goto_47
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2711
    .line 2712
    :goto_48
    return-object v4

    .line 2713
    :pswitch_1a
    move-object/from16 v0, p1

    .line 2714
    .line 2715
    check-cast v0, Ljava/util/List;

    .line 2716
    .line 2717
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 2718
    .line 2719
    iget-object v2, v5, La/cp;->u:La/yfu0;

    .line 2720
    .line 2721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2722
    .line 2723
    .line 2724
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2725
    .line 2726
    .line 2727
    move-result v3

    .line 2728
    if-eqz v3, :cond_6f

    .line 2729
    .line 2730
    move-object v0, v2

    .line 2731
    check-cast v0, La/svx;

    .line 2732
    .line 2733
    iget-object v0, v0, La/svx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2734
    .line 2735
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2736
    .line 2737
    .line 2738
    move-result-object v1

    .line 2739
    check-cast v1, La/cax;

    .line 2740
    .line 2741
    iget v1, v1, La/cax;->b:I

    .line 2742
    .line 2743
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(I)V

    .line 2744
    .line 2745
    .line 2746
    check-cast v2, La/svx;

    .line 2747
    .line 2748
    iget-object v0, v2, La/svx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2749
    .line 2750
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2751
    .line 2752
    .line 2753
    move-result-object v1

    .line 2754
    check-cast v1, La/cax;

    .line 2755
    .line 2756
    iget v1, v1, La/cax;->c:I

    .line 2757
    .line 2758
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 2759
    .line 2760
    .line 2761
    goto :goto_4b

    .line 2762
    :cond_6f
    new-instance v2, Ljava/util/ArrayList;

    .line 2763
    .line 2764
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2765
    .line 2766
    .line 2767
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2768
    .line 2769
    .line 2770
    move-result-object v0

    .line 2771
    :goto_49
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2772
    .line 2773
    .line 2774
    move-result v3

    .line 2775
    if-eqz v3, :cond_70

    .line 2776
    .line 2777
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v3

    .line 2781
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2782
    .line 2783
    .line 2784
    check-cast v3, Ljava/util/Collection;

    .line 2785
    .line 2786
    check-cast v3, Ljava/lang/Iterable;

    .line 2787
    .line 2788
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2789
    .line 2790
    .line 2791
    goto :goto_49

    .line 2792
    :cond_70
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2793
    .line 2794
    .line 2795
    move-result-object v0

    .line 2796
    :goto_4a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2797
    .line 2798
    .line 2799
    move-result v2

    .line 2800
    if-eqz v2, :cond_73

    .line 2801
    .line 2802
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2803
    .line 2804
    .line 2805
    move-result-object v2

    .line 2806
    check-cast v2, La/bax;

    .line 2807
    .line 2808
    if-eqz v2, :cond_72

    .line 2809
    .line 2810
    instance-of v3, v2, La/aax;

    .line 2811
    .line 2812
    if-eqz v3, :cond_71

    .line 2813
    .line 2814
    move-object v2, v1

    .line 2815
    check-cast v2, La/svx;

    .line 2816
    .line 2817
    iget-object v2, v2, La/svx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2818
    .line 2819
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2820
    .line 2821
    .line 2822
    move-result-object v3

    .line 2823
    check-cast v3, La/cax;

    .line 2824
    .line 2825
    iget v3, v3, La/cax;->b:I

    .line 2826
    .line 2827
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setTitle(I)V

    .line 2828
    .line 2829
    .line 2830
    goto :goto_4a

    .line 2831
    :cond_71
    instance-of v2, v2, La/z9x;

    .line 2832
    .line 2833
    if-eqz v2, :cond_72

    .line 2834
    .line 2835
    move-object v2, v1

    .line 2836
    check-cast v2, La/svx;

    .line 2837
    .line 2838
    iget-object v2, v2, La/svx;->b:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 2839
    .line 2840
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 2841
    .line 2842
    .line 2843
    move-result-object v3

    .line 2844
    check-cast v3, La/cax;

    .line 2845
    .line 2846
    iget v3, v3, La/cax;->c:I

    .line 2847
    .line 2848
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->setIconResource(I)V

    .line 2849
    .line 2850
    .line 2851
    goto :goto_4a

    .line 2852
    :cond_72
    invoke-static {}, La/t9f;->b()V

    .line 2853
    .line 2854
    .line 2855
    goto :goto_4c

    .line 2856
    :cond_73
    :goto_4b
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2857
    .line 2858
    :goto_4c
    return-object v4

    .line 2859
    :pswitch_1b
    move-object/from16 v0, p1

    .line 2860
    .line 2861
    check-cast v0, Ljava/util/List;

    .line 2862
    .line 2863
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 2864
    .line 2865
    iget-object v2, v5, La/cp;->u:La/yfu0;

    .line 2866
    .line 2867
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2868
    .line 2869
    .line 2870
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2871
    .line 2872
    .line 2873
    move-result v7

    .line 2874
    const v8, 0x7f07072d

    .line 2875
    .line 2876
    .line 2877
    if-eqz v7, :cond_74

    .line 2878
    .line 2879
    move-object v0, v2

    .line 2880
    check-cast v0, La/yth;

    .line 2881
    .line 2882
    iget-object v0, v0, La/yth;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2883
    .line 2884
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2885
    .line 2886
    .line 2887
    move-result-object v1

    .line 2888
    check-cast v1, La/wmh0;

    .line 2889
    .line 2890
    iget-object v10, v1, La/wmh0;->b:Ljava/lang/String;

    .line 2891
    .line 2892
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2893
    .line 2894
    .line 2895
    move-result-object v1

    .line 2896
    check-cast v1, La/wmh0;

    .line 2897
    .line 2898
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2899
    .line 2900
    .line 2901
    move-result-object v1

    .line 2902
    check-cast v1, La/wmh0;

    .line 2903
    .line 2904
    new-instance v9, La/nrv;

    .line 2905
    .line 2906
    const/16 v16, 0x0

    .line 2907
    .line 2908
    const/16 v17, 0xf4

    .line 2909
    .line 2910
    const/4 v11, 0x0

    .line 2911
    const/4 v12, 0x0

    .line 2912
    const-string v13, ""

    .line 2913
    .line 2914
    const/4 v14, 0x0

    .line 2915
    const/4 v15, 0x0

    .line 2916
    invoke-direct/range {v9 .. v17}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 2917
    .line 2918
    .line 2919
    invoke-virtual {v0, v9}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 2920
    .line 2921
    .line 2922
    check-cast v2, La/yth;

    .line 2923
    .line 2924
    iget-object v9, v2, La/yth;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2925
    .line 2926
    iget-object v0, v5, La/cp;->w:Landroid/content/Context;

    .line 2927
    .line 2928
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2929
    .line 2930
    .line 2931
    move-result-object v0

    .line 2932
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 2933
    .line 2934
    .line 2935
    move-result-object v1

    .line 2936
    check-cast v1, La/wmh0;

    .line 2937
    .line 2938
    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2939
    .line 2940
    .line 2941
    move-result v11

    .line 2942
    const/4 v13, 0x0

    .line 2943
    const/16 v14, 0xd

    .line 2944
    .line 2945
    const/4 v10, 0x0

    .line 2946
    const/4 v12, 0x0

    .line 2947
    invoke-static/range {v9 .. v14}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 2948
    .line 2949
    .line 2950
    goto/16 :goto_4f

    .line 2951
    .line 2952
    :cond_74
    new-instance v2, Ljava/util/ArrayList;

    .line 2953
    .line 2954
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2955
    .line 2956
    .line 2957
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2958
    .line 2959
    .line 2960
    move-result-object v0

    .line 2961
    :goto_4d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2962
    .line 2963
    .line 2964
    move-result v5

    .line 2965
    if-eqz v5, :cond_75

    .line 2966
    .line 2967
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2968
    .line 2969
    .line 2970
    move-result-object v5

    .line 2971
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2972
    .line 2973
    .line 2974
    check-cast v5, Ljava/util/Collection;

    .line 2975
    .line 2976
    check-cast v5, Ljava/lang/Iterable;

    .line 2977
    .line 2978
    invoke-static {v2, v5}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2979
    .line 2980
    .line 2981
    goto :goto_4d

    .line 2982
    :cond_75
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v0

    .line 2986
    :cond_76
    :goto_4e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2987
    .line 2988
    .line 2989
    move-result v2

    .line 2990
    if-eqz v2, :cond_7b

    .line 2991
    .line 2992
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2993
    .line 2994
    .line 2995
    move-result-object v2

    .line 2996
    check-cast v2, La/vmh0;

    .line 2997
    .line 2998
    if-eqz v2, :cond_7a

    .line 2999
    .line 3000
    instance-of v5, v2, La/rmh0;

    .line 3001
    .line 3002
    if-eqz v5, :cond_77

    .line 3003
    .line 3004
    move-object v2, v1

    .line 3005
    check-cast v2, La/yth;

    .line 3006
    .line 3007
    iget-object v2, v2, La/yth;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 3008
    .line 3009
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 3010
    .line 3011
    .line 3012
    move-result-object v5

    .line 3013
    check-cast v5, La/wmh0;

    .line 3014
    .line 3015
    const-string v5, ""

    .line 3016
    .line 3017
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonLabel(Ljava/lang/CharSequence;)V

    .line 3018
    .line 3019
    .line 3020
    goto :goto_4e

    .line 3021
    :cond_77
    instance-of v5, v2, La/smh0;

    .line 3022
    .line 3023
    if-eqz v5, :cond_78

    .line 3024
    .line 3025
    move-object v2, v1

    .line 3026
    check-cast v2, La/yth;

    .line 3027
    .line 3028
    iget-object v2, v2, La/yth;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 3029
    .line 3030
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 3031
    .line 3032
    .line 3033
    move-result-object v5

    .line 3034
    check-cast v5, La/wmh0;

    .line 3035
    .line 3036
    iget-object v2, v2, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 3037
    .line 3038
    if-eqz v2, :cond_76

    .line 3039
    .line 3040
    invoke-interface {v2, v3}, La/w0i;->b(Z)V

    .line 3041
    .line 3042
    .line 3043
    goto :goto_4e

    .line 3044
    :cond_78
    instance-of v5, v2, La/tmh0;

    .line 3045
    .line 3046
    if-eqz v5, :cond_79

    .line 3047
    .line 3048
    move-object v2, v1

    .line 3049
    check-cast v2, La/yth;

    .line 3050
    .line 3051
    iget-object v2, v2, La/yth;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 3052
    .line 3053
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 3054
    .line 3055
    .line 3056
    move-result-object v5

    .line 3057
    check-cast v5, La/wmh0;

    .line 3058
    .line 3059
    iget-object v5, v5, La/wmh0;->b:Ljava/lang/String;

    .line 3060
    .line 3061
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/header/DsHeader;->setLabel(Ljava/lang/CharSequence;)V

    .line 3062
    .line 3063
    .line 3064
    goto :goto_4e

    .line 3065
    :cond_79
    instance-of v2, v2, La/umh0;

    .line 3066
    .line 3067
    if-eqz v2, :cond_7a

    .line 3068
    .line 3069
    move-object v2, v1

    .line 3070
    check-cast v2, La/yth;

    .line 3071
    .line 3072
    iget-object v9, v2, La/yth;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 3073
    .line 3074
    iget-object v2, v6, La/cp;->w:Landroid/content/Context;

    .line 3075
    .line 3076
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3077
    .line 3078
    .line 3079
    move-result-object v2

    .line 3080
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 3081
    .line 3082
    .line 3083
    move-result-object v5

    .line 3084
    check-cast v5, La/wmh0;

    .line 3085
    .line 3086
    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 3087
    .line 3088
    .line 3089
    move-result v11

    .line 3090
    const/4 v13, 0x0

    .line 3091
    const/16 v14, 0xd

    .line 3092
    .line 3093
    const/4 v10, 0x0

    .line 3094
    const/4 v12, 0x0

    .line 3095
    invoke-static/range {v9 .. v14}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 3096
    .line 3097
    .line 3098
    goto :goto_4e

    .line 3099
    :cond_7a
    invoke-static {}, La/t9f;->b()V

    .line 3100
    .line 3101
    .line 3102
    goto :goto_50

    .line 3103
    :cond_7b
    :goto_4f
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3104
    .line 3105
    :goto_50
    return-object v4

    .line 3106
    :pswitch_1c
    move-object/from16 v0, p1

    .line 3107
    .line 3108
    check-cast v0, Ljava/util/List;

    .line 3109
    .line 3110
    iget-object v1, v6, La/cp;->u:La/yfu0;

    .line 3111
    .line 3112
    iget-object v2, v5, La/cp;->u:La/yfu0;

    .line 3113
    .line 3114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3115
    .line 3116
    .line 3117
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3118
    .line 3119
    .line 3120
    move-result v3

    .line 3121
    if-eqz v3, :cond_7c

    .line 3122
    .line 3123
    move-object v0, v2

    .line 3124
    check-cast v0, La/kth;

    .line 3125
    .line 3126
    iget-object v0, v0, La/kth;->b:Landroid/widget/TextView;

    .line 3127
    .line 3128
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 3129
    .line 3130
    .line 3131
    move-result-object v1

    .line 3132
    check-cast v1, La/osv;

    .line 3133
    .line 3134
    iget-object v1, v1, La/osv;->b:Ljava/lang/String;

    .line 3135
    .line 3136
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3137
    .line 3138
    .line 3139
    check-cast v2, La/kth;

    .line 3140
    .line 3141
    iget-object v0, v2, La/kth;->b:Landroid/widget/TextView;

    .line 3142
    .line 3143
    iget-object v1, v5, La/cp;->w:Landroid/content/Context;

    .line 3144
    .line 3145
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 3146
    .line 3147
    .line 3148
    move-result-object v2

    .line 3149
    check-cast v2, La/osv;

    .line 3150
    .line 3151
    iget v2, v2, La/osv;->c:I

    .line 3152
    .line 3153
    invoke-static {v2, v1}, La/sj3;->P(ILandroid/content/Context;)I

    .line 3154
    .line 3155
    .line 3156
    move-result v1

    .line 3157
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3158
    .line 3159
    .line 3160
    goto :goto_53

    .line 3161
    :cond_7c
    new-instance v2, Ljava/util/ArrayList;

    .line 3162
    .line 3163
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3164
    .line 3165
    .line 3166
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3167
    .line 3168
    .line 3169
    move-result-object v0

    .line 3170
    :goto_51
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3171
    .line 3172
    .line 3173
    move-result v3

    .line 3174
    if-eqz v3, :cond_7d

    .line 3175
    .line 3176
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3177
    .line 3178
    .line 3179
    move-result-object v3

    .line 3180
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3181
    .line 3182
    .line 3183
    check-cast v3, Ljava/util/Collection;

    .line 3184
    .line 3185
    check-cast v3, Ljava/lang/Iterable;

    .line 3186
    .line 3187
    invoke-static {v2, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 3188
    .line 3189
    .line 3190
    goto :goto_51

    .line 3191
    :cond_7d
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3192
    .line 3193
    .line 3194
    move-result-object v0

    .line 3195
    :goto_52
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3196
    .line 3197
    .line 3198
    move-result v2

    .line 3199
    if-eqz v2, :cond_80

    .line 3200
    .line 3201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3202
    .line 3203
    .line 3204
    move-result-object v2

    .line 3205
    check-cast v2, La/ksv;

    .line 3206
    .line 3207
    if-eqz v2, :cond_7f

    .line 3208
    .line 3209
    instance-of v3, v2, La/isv;

    .line 3210
    .line 3211
    if-eqz v3, :cond_7e

    .line 3212
    .line 3213
    move-object v2, v1

    .line 3214
    check-cast v2, La/kth;

    .line 3215
    .line 3216
    iget-object v2, v2, La/kth;->b:Landroid/widget/TextView;

    .line 3217
    .line 3218
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 3219
    .line 3220
    .line 3221
    move-result-object v3

    .line 3222
    check-cast v3, La/osv;

    .line 3223
    .line 3224
    iget-object v3, v3, La/osv;->b:Ljava/lang/String;

    .line 3225
    .line 3226
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3227
    .line 3228
    .line 3229
    goto :goto_52

    .line 3230
    :cond_7e
    instance-of v2, v2, La/jsv;

    .line 3231
    .line 3232
    if-eqz v2, :cond_7f

    .line 3233
    .line 3234
    move-object v2, v1

    .line 3235
    check-cast v2, La/kth;

    .line 3236
    .line 3237
    iget-object v2, v2, La/kth;->b:Landroid/widget/TextView;

    .line 3238
    .line 3239
    iget-object v3, v6, La/cp;->w:Landroid/content/Context;

    .line 3240
    .line 3241
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 3242
    .line 3243
    .line 3244
    move-result-object v5

    .line 3245
    check-cast v5, La/osv;

    .line 3246
    .line 3247
    iget v5, v5, La/osv;->c:I

    .line 3248
    .line 3249
    invoke-static {v5, v3}, La/sj3;->P(ILandroid/content/Context;)I

    .line 3250
    .line 3251
    .line 3252
    move-result v3

    .line 3253
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3254
    .line 3255
    .line 3256
    goto :goto_52

    .line 3257
    :cond_7f
    invoke-static {}, La/t9f;->b()V

    .line 3258
    .line 3259
    .line 3260
    goto :goto_54

    .line 3261
    :cond_80
    :goto_53
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3262
    .line 3263
    :goto_54
    return-object v4

    .line 3264
    nop

    .line 3265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
