.class public final La/z6b0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/z6b0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final S1:La/fl70;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/pek;

.field public L1:La/tzi;

.field public final M1:La/a8z;

.field public final N1:La/s0r;

.field public final O1:La/kiu0;

.field public final P1:La/a8z;

.field public final Q1:La/yzn0;

.field public final R1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/z6b0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicGamesBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "screenType"

    .line 16
    .line 17
    const-string v5, "getScreenType()Lorg/xplatform/feed/presentation/models/PopularClassicGamesScreenType;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/z6b0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/fl70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/z6b0;->S1:La/fl70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d028c

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/w6b0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/w6b0;-><init>(La/z6b0;B)V

    .line 11
    .line 12
    .line 13
    sget-object v2, La/wez;->b:La/wez;

    .line 14
    .line 15
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/z6b0;->M1:La/a8z;

    .line 20
    .line 21
    sget-object v0, La/y6b0;->a:La/y6b0;

    .line 22
    .line 23
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/z6b0;->N1:La/s0r;

    .line 28
    .line 29
    new-instance v0, La/w6b0;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v0, p0, v3}, La/w6b0;-><init>(La/z6b0;B)V

    .line 33
    .line 34
    .line 35
    new-instance v4, La/wz80;

    .line 36
    .line 37
    const/16 v5, 0x1c

    .line 38
    .line 39
    invoke-direct {v4, p0, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance v5, La/wz80;

    .line 43
    .line 44
    const/16 v6, 0x1d

    .line 45
    .line 46
    invoke-direct {v5, v4, v6}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const-class v5, La/l7b0;

    .line 54
    .line 55
    sget-object v6, La/sre0;->a:La/tre0;

    .line 56
    .line 57
    invoke-virtual {v6, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    new-instance v6, La/x6b0;

    .line 62
    .line 63
    invoke-direct {v6, v4, v1}, La/x6b0;-><init>(La/a8z;B)V

    .line 64
    .line 65
    .line 66
    new-instance v1, La/x6b0;

    .line 67
    .line 68
    invoke-direct {v1, v4, v3}, La/x6b0;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v5, v6, v1, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/z6b0;->O1:La/kiu0;

    .line 76
    .line 77
    new-instance v0, La/w6b0;

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    invoke-direct {v0, p0, v1}, La/w6b0;-><init>(La/z6b0;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, La/z6b0;->P1:La/a8z;

    .line 88
    .line 89
    new-instance v0, La/yzn0;

    .line 90
    .line 91
    const-string v1, "SCREEN_TYPE_KEY"

    .line 92
    .line 93
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p0, La/z6b0;->Q1:La/yzn0;

    .line 97
    .line 98
    iput-boolean v3, p0, La/z6b0;->R1:Z

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/z6b0;->I0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, La/z6b0;->H0()La/x2r;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, La/x2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-direct {v2, v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, La/z6b0;->G0()La/dtr;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const v5, 0x7f05000f

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    const v6, 0x7f07072d

    .line 58
    .line 59
    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    const v8, 0x7f070712

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    const v8, 0x7f070717

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 96
    .line 97
    .line 98
    move-result v14

    .line 99
    new-instance v9, La/ncu0;

    .line 100
    .line 101
    move v12, v10

    .line 102
    move v13, v11

    .line 103
    invoke-direct/range {v9 .. v14}, La/ncu0;-><init>(IIIII)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v9}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    new-instance v7, La/qmk0;

    .line 122
    .line 123
    const/4 v15, 0x0

    .line 124
    const/16 v16, 0x1d4

    .line 125
    .line 126
    const/4 v10, 0x0

    .line 127
    const/4 v12, 0x0

    .line 128
    const/4 v13, 0x1

    .line 129
    const/4 v14, 0x0

    .line 130
    move v9, v8

    .line 131
    move v11, v8

    .line 132
    invoke-direct/range {v7 .. v16}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v7}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 136
    .line 137
    .line 138
    :goto_0
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    instance-of v6, v3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 143
    .line 144
    if-nez v6, :cond_1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_2

    .line 163
    .line 164
    check-cast v3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 165
    .line 166
    const/4 v1, 0x2

    .line 167
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->N1(I)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_2
    check-cast v3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 172
    .line 173
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->N1(I)V

    .line 174
    .line 175
    .line 176
    :goto_1
    iget-object v1, v0, La/z6b0;->L1:La/tzi;

    .line 177
    .line 178
    if-eqz v1, :cond_5

    .line 179
    .line 180
    iget-object v2, v0, La/z6b0;->O1:La/kiu0;

    .line 181
    .line 182
    invoke-virtual {v2}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, La/l7b0;

    .line 187
    .line 188
    sget-object v3, La/z6b0;->U1:[La/iiy;

    .line 189
    .line 190
    aget-object v3, v3, v4

    .line 191
    .line 192
    iget-object v5, v0, La/z6b0;->Q1:La/yzn0;

    .line 193
    .line 194
    invoke-virtual {v5, v0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, La/b7b0;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_4

    .line 205
    .line 206
    if-ne v3, v4, :cond_3

    .line 207
    .line 208
    new-instance v3, La/gr2;

    .line 209
    .line 210
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_4
    new-instance v3, La/hr2;

    .line 219
    .line 220
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 221
    .line 222
    .line 223
    :goto_2
    invoke-virtual {v1, v0, v2, v3}, La/tzi;->w(La/yx5;La/f0s;La/ms2;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_5
    const-string v0, "gameCardFragmentDelegate"

    .line 228
    .line 229
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v2
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/z6b0;->M1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/zoi;

    .line 8
    .line 9
    iget-object v0, v0, La/zoi;->a:La/itr;

    .line 10
    .line 11
    invoke-interface {v0}, La/itr;->c()La/pek;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, La/z6b0;->K1:La/pek;

    .line 16
    .line 17
    invoke-interface {v0}, La/itr;->e()La/tzi;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/z6b0;->L1:La/tzi;

    .line 25
    .line 26
    return-void
.end method

.method public final D0()V
    .locals 12

    .line 1
    iget-object v0, p0, La/z6b0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/l7b0;

    .line 8
    .line 9
    iget-object v1, v0, La/l7b0;->s:La/p7m0;

    .line 10
    .line 11
    new-instance v3, La/s980;

    .line 12
    .line 13
    const/16 v4, 0x18

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    invoke-direct {v3, v0, v9, v4}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    new-instance v4, La/fnq;

    .line 20
    .line 21
    const/4 v5, 0x4

    .line 22
    invoke-direct {v4, v1, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/d7a0;

    .line 26
    .line 27
    const/4 v11, 0x3

    .line 28
    invoke-direct {v1, v0, v9, v11}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/fnq;

    .line 32
    .line 33
    invoke-direct {v3, v4, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, La/gbv;

    .line 37
    .line 38
    const/16 v4, 0x16

    .line 39
    .line 40
    invoke-direct {v1, v0, v9, v4}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    new-instance v8, La/dnq;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {v8, v3, v1, v0}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 47
    .line 48
    .line 49
    sget-object v0, La/lkz;->a:La/lkz;

    .line 50
    .line 51
    new-instance v0, La/p6b0;

    .line 52
    .line 53
    const/4 v6, 0x4

    .line 54
    const/16 v7, 0xf

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    const-class v3, La/z6b0;

    .line 58
    .line 59
    const-string v4, "handleScreenUiState"

    .line 60
    .line 61
    const-string v5, "handleScreenUiState(Lorg/xplatform/feed/popularclassic/games/PopularClassicGamesViewModel$ScreenUiState;)V"

    .line 62
    .line 63
    move-object v2, p0

    .line 64
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v5, La/fra0;

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    move-object v6, v8

    .line 83
    move-object v8, v0

    .line 84
    invoke-direct/range {v5 .. v10}, La/fra0;-><init>(La/dnq;La/clz;La/p6b0;La/yje;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v9, v9, v5, v11}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final G0()La/dtr;
    .locals 0

    .line 1
    iget-object p0, p0, La/z6b0;->P1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dtr;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()La/x2r;
    .locals 2

    .line 1
    sget-object v0, La/z6b0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/z6b0;->N1:La/s0r;

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
    check-cast p0, La/x2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/z6b0;->H0()La/x2r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/x2r;->d:La/ewe;

    .line 6
    .line 7
    iget-object p0, p0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 8
    .line 9
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/z6b0;->H0()La/x2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/x2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/z6b0;->R1:Z

    .line 2
    .line 3
    return p0
.end method
