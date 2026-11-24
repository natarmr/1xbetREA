.class public final Lorg/xplatform/favorites/impl/presentation/category/e;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lorg/xplatform/favorites/impl/presentation/category/e;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/sek",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final V1:La/sek;

.field public static final synthetic W1:[La/iiy;

.field public static final X1:Ljava/lang/String;


# instance fields
.field public final K1:Z

.field public final L1:La/khf0;

.field public final M1:La/n0o0;

.field public N1:La/rgi;

.field public O1:La/pek;

.field public P1:La/tzi;

.field public Q1:La/wdk0;

.field public final R1:La/n0o0;

.field public final S1:La/s0r;

.field public final U1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "viewBinding"

    .line 16
    .line 17
    const-string v5, "getViewBinding()Lorg/xplatform/favorites/impl/databinding/FragmentFavoritesCategoryBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, Lorg/xplatform/favorites/impl/presentation/category/e;->W1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/sek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->X1:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const v0, 0x7f0d0234

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->K1:Z

    .line 9
    .line 10
    new-instance v1, La/khf0;

    .line 11
    .line 12
    const-string v2, "category_state_param_key"

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->L1:La/khf0;

    .line 18
    .line 19
    new-instance v1, La/hep;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v2}, La/hep;-><init>(Lorg/xplatform/favorites/impl/presentation/category/e;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->M1:La/n0o0;

    .line 30
    .line 31
    new-instance v2, La/wej;

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const/16 v9, 0xd

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const-class v5, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 38
    .line 39
    const-string v6, "provideAdapter"

    .line 40
    .line 41
    const-string v7, "provideAdapter()Lorg/xplatform/favorites/impl/presentation/category/adapter/FavoriteCategoryAdapter;"

    .line 42
    .line 43
    move-object v4, p0

    .line 44
    invoke-direct/range {v2 .. v9}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iput-object p0, v4, Lorg/xplatform/favorites/impl/presentation/category/e;->R1:La/n0o0;

    .line 52
    .line 53
    sget-object p0, La/iep;->a:La/iep;

    .line 54
    .line 55
    invoke-static {v4, p0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iput-object p0, v4, Lorg/xplatform/favorites/impl/presentation/category/e;->S1:La/s0r;

    .line 60
    .line 61
    new-instance p0, La/hep;

    .line 62
    .line 63
    invoke-direct {p0, v4, v0}, La/hep;-><init>(Lorg/xplatform/favorites/impl/presentation/category/e;B)V

    .line 64
    .line 65
    .line 66
    new-instance v0, La/jfl;

    .line 67
    .line 68
    const/16 v1, 0xf

    .line 69
    .line 70
    invoke-direct {v0, v4, v1}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    sget-object v1, La/wez;->b:La/wez;

    .line 74
    .line 75
    new-instance v2, La/jfl;

    .line 76
    .line 77
    const/16 v3, 0x10

    .line 78
    .line 79
    invoke-direct {v2, v0, v3}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-class v1, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 87
    .line 88
    sget-object v2, La/sre0;->a:La/tre0;

    .line 89
    .line 90
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, La/r6p;

    .line 95
    .line 96
    const/4 v3, 0x2

    .line 97
    invoke-direct {v2, v0, v3}, La/r6p;-><init>(La/a8z;B)V

    .line 98
    .line 99
    .line 100
    new-instance v3, La/r6p;

    .line 101
    .line 102
    const/4 v5, 0x3

    .line 103
    invoke-direct {v3, v0, v5}, La/r6p;-><init>(La/a8z;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {v4, v1, v2, v3, p0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iput-object p0, v4, Lorg/xplatform/favorites/impl/presentation/category/e;->U1:La/kiu0;

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, La/cad;

    .line 8
    .line 9
    const/16 v3, 0x16

    .line 10
    .line 11
    invoke-direct {v2, v0, v3}, La/cad;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    sget-object v3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-static {v1, v2}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const v3, 0x7f1311c4

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, La/yzq;->c:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setSearchFieldHint(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    sget-object v2, Lorg/xplatform/favorites/impl/presentation/category/e;->W1:[La/iiy;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    aget-object v4, v2, v3

    .line 46
    .line 47
    iget-object v5, v0, Lorg/xplatform/favorites/impl/presentation/category/e;->L1:La/khf0;

    .line 48
    .line 49
    invoke-virtual {v5, v0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 54
    .line 55
    invoke-virtual {v4}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;->b()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    new-instance v6, La/hc50;

    .line 63
    .line 64
    sget-object v8, La/ybg0;->b:La/ybg0;

    .line 65
    .line 66
    new-instance v10, La/hep;

    .line 67
    .line 68
    const/4 v4, 0x2

    .line 69
    invoke-direct {v10, v0, v4}, La/hep;-><init>(Lorg/xplatform/favorites/impl/presentation/category/e;B)V

    .line 70
    .line 71
    .line 72
    const/16 v11, 0x3f0

    .line 73
    .line 74
    const-string v7, "SEARCH_BUTTON"

    .line 75
    .line 76
    const v9, 0x7f0809ee

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v6 .. v11}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 80
    .line 81
    .line 82
    filled-new-array {v6}, [La/hc50;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v6}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 91
    .line 92
    .line 93
    new-instance v6, La/hep;

    .line 94
    .line 95
    const/4 v7, 0x3

    .line 96
    invoke-direct {v6, v0, v7}, La/hep;-><init>(Lorg/xplatform/favorites/impl/presentation/category/e;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v6}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 100
    .line 101
    .line 102
    new-instance v6, La/g7p;

    .line 103
    .line 104
    const/4 v7, 0x1

    .line 105
    invoke-direct {v6, v0, v7}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->e(Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v1, v1, La/yzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 116
    .line 117
    iget-object v6, v0, Lorg/xplatform/favorites/impl/presentation/category/e;->R1:La/n0o0;

    .line 118
    .line 119
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, La/y3p;

    .line 124
    .line 125
    invoke-virtual {v1, v6}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget-object v1, v1, La/yzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 133
    .line 134
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    instance-of v6, v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 139
    .line 140
    const/4 v8, 0x0

    .line 141
    if-eqz v6, :cond_0

    .line 142
    .line 143
    check-cast v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    move-object v1, v8

    .line 147
    :goto_0
    const v6, 0x7f05000f

    .line 148
    .line 149
    .line 150
    if-eqz v1, :cond_2

    .line 151
    .line 152
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-virtual {v9, v6}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    if-eqz v9, :cond_1

    .line 165
    .line 166
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->N1(I)V

    .line 167
    .line 168
    .line 169
    new-instance v4, La/eo6;

    .line 170
    .line 171
    invoke-direct {v4, v0, v7}, La/eo6;-><init>(Ljava/lang/Object;B)V

    .line 172
    .line 173
    .line 174
    iput-object v4, v1, Landroidx/recyclerview/widget/GridLayoutManager;->m1:La/c2;

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_1
    invoke-virtual {v1, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->N1(I)V

    .line 178
    .line 179
    .line 180
    :cond_2
    :goto_1
    iget-object v1, v0, Lorg/xplatform/favorites/impl/presentation/category/e;->P1:La/tzi;

    .line 181
    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/category/e;->H0()Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    aget-object v2, v2, v3

    .line 189
    .line 190
    invoke-virtual {v5, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v2, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 195
    .line 196
    instance-of v3, v2, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;

    .line 197
    .line 198
    if-eqz v3, :cond_3

    .line 199
    .line 200
    new-instance v2, La/cq2;

    .line 201
    .line 202
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_3
    instance-of v2, v2, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Championship;

    .line 207
    .line 208
    if-eqz v2, :cond_6

    .line 209
    .line 210
    new-instance v2, La/aq2;

    .line 211
    .line 212
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 213
    .line 214
    .line 215
    :goto_2
    invoke-virtual {v1, v0, v4, v2}, La/tzi;->w(La/yx5;La/f0s;La/ms2;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    iget-object v2, v1, La/yzq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 223
    .line 224
    iget-object v1, v1, La/yzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 225
    .line 226
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/category/e;->H0()Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    new-instance v4, La/z9f;

    .line 231
    .line 232
    const/16 v5, 0x18

    .line 233
    .line 234
    invoke-direct {v4, v3, v5}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(La/zon0;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    const v3, 0x7f07072d

    .line 256
    .line 257
    .line 258
    if-eqz v2, :cond_4

    .line 259
    .line 260
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    new-instance v14, La/e4p;

    .line 268
    .line 269
    const/16 v4, 0x15

    .line 270
    .line 271
    invoke-direct {v14, v4}, La/e4p;-><init>(B)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    const v5, 0x7f070712

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 290
    .line 291
    .line 292
    move-result v13

    .line 293
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const v3, 0x7f0706e0

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    sget-object v2, La/rmk0;->b:La/rmk0;

    .line 305
    .line 306
    new-instance v9, La/icu0;

    .line 307
    .line 308
    move v12, v10

    .line 309
    move v15, v13

    .line 310
    move/from16 v16, v13

    .line 311
    .line 312
    invoke-direct/range {v9 .. v16}, La/icu0;-><init>(IIIILa/e4p;II)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v9}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 316
    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 327
    .line 328
    .line 329
    move-result v10

    .line 330
    new-instance v9, La/qmk0;

    .line 331
    .line 332
    new-instance v2, La/e4p;

    .line 333
    .line 334
    const/16 v3, 0xe

    .line 335
    .line 336
    invoke-direct {v2, v3}, La/e4p;-><init>(B)V

    .line 337
    .line 338
    .line 339
    sget-object v17, La/rmk0;->b:La/rmk0;

    .line 340
    .line 341
    const/16 v18, 0x114

    .line 342
    .line 343
    const/4 v12, 0x0

    .line 344
    const/4 v14, 0x0

    .line 345
    const/4 v15, 0x1

    .line 346
    move v11, v10

    .line 347
    move v13, v10

    .line 348
    move-object/from16 v16, v2

    .line 349
    .line 350
    invoke-direct/range {v9 .. v18}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v9}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 354
    .line 355
    .line 356
    :goto_3
    invoke-static {v1}, La/bdx;->j0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 357
    .line 358
    .line 359
    iget-object v1, v0, Lorg/xplatform/favorites/impl/presentation/category/e;->Q1:La/wdk0;

    .line 360
    .line 361
    if-eqz v1, :cond_5

    .line 362
    .line 363
    iget-boolean v2, v0, Lorg/xplatform/favorites/impl/presentation/category/e;->K1:Z

    .line 364
    .line 365
    invoke-static {v1, v0, v2}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :cond_5
    const-string v0, "snackbarManager"

    .line 370
    .line 371
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    throw v8

    .line 375
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :cond_7
    const-string v0, "gameCardFragmentDelegate"

    .line 380
    .line 381
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v8
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->M1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/tgi;

    .line 8
    .line 9
    iget-object v1, v0, La/tgi;->x:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/rgi;

    .line 16
    .line 17
    iput-object v1, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->N1:La/rgi;

    .line 18
    .line 19
    iget-object v1, v0, La/tgi;->g:La/itr;

    .line 20
    .line 21
    invoke-interface {v1}, La/itr;->c()La/pek;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iput-object v2, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->O1:La/pek;

    .line 26
    .line 27
    invoke-interface {v1}, La/itr;->e()La/tzi;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->P1:La/tzi;

    .line 35
    .line 36
    iget-object v0, v0, La/tgi;->t:La/wdk0;

    .line 37
    .line 38
    iput-object v0, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->Q1:La/wdk0;

    .line 39
    .line 40
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/favorites/impl/presentation/category/e;->H0()Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lorg/xplatform/favorites/impl/presentation/category/f;->x:La/p7m0;

    .line 6
    .line 7
    invoke-static {v1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, La/cin;

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v2, v0, v4, v3}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 16
    .line 17
    .line 18
    new-instance v3, La/s6n0;

    .line 19
    .line 20
    invoke-direct {v3, v1, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, La/e00;

    .line 24
    .line 25
    const/16 v2, 0x1d

    .line 26
    .line 27
    invoke-direct {v1, v0, v4, v2}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    new-instance v0, La/dnq;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, v3, v1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 34
    .line 35
    .line 36
    sget-object v1, La/lkz;->a:La/lkz;

    .line 37
    .line 38
    new-instance v1, La/sxk;

    .line 39
    .line 40
    const/16 v2, 0x10

    .line 41
    .line 42
    invoke-direct {v1, p0, v4, v2}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v3, La/ofl;

    .line 58
    .line 59
    invoke-direct {v3, v0, p0, v1, v4}, La/ofl;-><init>(La/dnq;La/clz;La/sxk;La/yje;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x3

    .line 63
    invoke-static {v2, v4, v4, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final G0()La/yzq;
    .locals 2

    .line 1
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->S1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/yzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()Lorg/xplatform/favorites/impl/presentation/category/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->U1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/favorites/impl/presentation/category/e;->G0()La/yzq;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/yzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->K1:Z

    .line 2
    .line 3
    return p0
.end method
