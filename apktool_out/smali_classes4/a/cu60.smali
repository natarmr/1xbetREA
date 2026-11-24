.class public final La/cu60;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/cu60;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/evz",
        "cashback"
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
.field public static final U1:La/evz;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/phf0;

.field public L1:La/ii;

.field public M1:La/wdk0;

.field public N1:La/peg0;

.field public O1:La/tbi;

.field public final P1:La/kiu0;

.field public final Q1:La/kiu0;

.field public final R1:La/s0r;

.field public final S1:La/hnm0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/cu60;

    .line 4
    .line 5
    const-string v2, "umResultKey"

    .line 6
    .line 7
    const-string v3, "getUmResultKey()Ljava/lang/String;"

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
    const-string v5, "getViewBinding()Lorg/xplatform/games_section/feature/cashback/databinding/CashbackFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/cu60;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/evz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/cu60;->U1:La/evz;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d0076

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/phf0;

    .line 8
    .line 9
    const-string v1, "UM_RESULT_KEY"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/cu60;->K1:La/phf0;

    .line 15
    .line 16
    new-instance v0, La/yt60;

    .line 17
    .line 18
    const/4 v1, 0x7

    .line 19
    invoke-direct {v0, p0, v1}, La/yt60;-><init>(La/cu60;B)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/wez;->b:La/wez;

    .line 23
    .line 24
    new-instance v2, La/ej50;

    .line 25
    .line 26
    const/16 v3, 0x11

    .line 27
    .line 28
    invoke-direct {v2, v0, v3}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v2, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    const-class v3, La/k370;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, La/co60;

    .line 44
    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    invoke-direct {v4, v0, v5}, La/co60;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v5, La/co60;

    .line 51
    .line 52
    const/16 v6, 0x9

    .line 53
    .line 54
    invoke-direct {v5, v0, v6}, La/co60;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    new-instance v6, La/ha30;

    .line 58
    .line 59
    const/16 v7, 0xe

    .line 60
    .line 61
    invoke-direct {v6, p0, v0, v7}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v3, v4, v5, v6}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/cu60;->P1:La/kiu0;

    .line 69
    .line 70
    new-instance v0, La/yt60;

    .line 71
    .line 72
    const/4 v3, 0x1

    .line 73
    invoke-direct {v0, p0, v3}, La/yt60;-><init>(La/cu60;B)V

    .line 74
    .line 75
    .line 76
    new-instance v3, La/ej50;

    .line 77
    .line 78
    const/16 v4, 0x12

    .line 79
    .line 80
    invoke-direct {v3, p0, v4}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    new-instance v4, La/ej50;

    .line 84
    .line 85
    const/16 v5, 0x13

    .line 86
    .line 87
    invoke-direct {v4, v3, v5}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v1, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const-class v3, La/h2b;

    .line 95
    .line 96
    invoke-virtual {v2, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    new-instance v3, La/co60;

    .line 101
    .line 102
    const/16 v4, 0xa

    .line 103
    .line 104
    invoke-direct {v3, v1, v4}, La/co60;-><init>(La/a8z;B)V

    .line 105
    .line 106
    .line 107
    new-instance v4, La/co60;

    .line 108
    .line 109
    const/16 v5, 0xb

    .line 110
    .line 111
    invoke-direct {v4, v1, v5}, La/co60;-><init>(La/a8z;B)V

    .line 112
    .line 113
    .line 114
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p0, La/cu60;->Q1:La/kiu0;

    .line 119
    .line 120
    sget-object v0, La/bu60;->a:La/bu60;

    .line 121
    .line 122
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p0, La/cu60;->R1:La/s0r;

    .line 127
    .line 128
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 129
    .line 130
    iput-object v0, p0, La/cu60;->S1:La/hnm0;

    .line 131
    .line 132
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/h2b;->n:La/m1e;

    .line 6
    .line 7
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/lo3;

    .line 12
    .line 13
    const/4 v2, 0x6

    .line 14
    const/4 v3, 0x3

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v1, v3, v4, v2}, La/lo3;-><init>(ILa/yje;B)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/dnq;

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-direct {v2, v0, v1, v5}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 23
    .line 24
    .line 25
    new-instance v0, La/a2b;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, p1, v4, v1}, La/a2b;-><init>(La/h2b;La/yje;B)V

    .line 29
    .line 30
    .line 31
    new-instance v4, La/fnq;

    .line 32
    .line 33
    const/4 v6, 0x4

    .line 34
    invoke-direct {v4, v2, v0, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v4, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, La/h2b;->C()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    new-instance v8, La/au60;

    .line 52
    .line 53
    invoke-direct {v8, p0, v1}, La/au60;-><init>(La/cu60;B)V

    .line 54
    .line 55
    .line 56
    new-instance v9, La/yt60;

    .line 57
    .line 58
    const/4 p1, 0x2

    .line 59
    invoke-direct {v9, p0, p1}, La/yt60;-><init>(La/cu60;B)V

    .line 60
    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    const/16 v11, 0x12

    .line 64
    .line 65
    move-object v7, p0

    .line 66
    invoke-static/range {v6 .. v11}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget-object p0, p0, La/aza;->n:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 74
    .line 75
    const v0, 0x7f0f0013

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->l(I)V

    .line 79
    .line 80
    .line 81
    new-instance v0, La/l910;

    .line 82
    .line 83
    const/4 v2, 0x7

    .line 84
    invoke-direct {v0, v7, v2}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, La/zt60;

    .line 91
    .line 92
    invoke-direct {v0, v7}, La/zt60;-><init>(La/cu60;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(La/hwq0;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    iget-object p0, p0, La/aza;->e:Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 103
    .line 104
    new-instance v0, La/hny;

    .line 105
    .line 106
    const/16 v2, 0x13

    .line 107
    .line 108
    invoke-direct {v0, v2}, La/hny;-><init>(B)V

    .line 109
    .line 110
    .line 111
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 112
    .line 113
    invoke-static {p0, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    iget-object p0, p0, La/aza;->p:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 121
    .line 122
    const/16 v0, 0x8

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    new-instance p0, La/c5k;

    .line 128
    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-object v0, v0, La/aza;->c:Lcom/google/android/material/appbar/AppBarLayout;

    .line 137
    .line 138
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    iget-object v4, v4, La/aza;->o:Landroid/widget/LinearLayout;

    .line 147
    .line 148
    new-array v6, v5, [Landroid/view/View;

    .line 149
    .line 150
    aput-object v4, v6, v1

    .line 151
    .line 152
    new-instance v4, La/vb3;

    .line 153
    .line 154
    invoke-direct {v4, v6, v1}, La/vb3;-><init>(Ljava/lang/Object;B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v4}, Lcom/google/android/material/appbar/AppBarLayout;->a(La/ub3;)V

    .line 158
    .line 159
    .line 160
    iput-object v4, p0, La/c5k;->a:Ljava/lang/Object;

    .line 161
    .line 162
    new-instance v4, La/wb3;

    .line 163
    .line 164
    invoke-direct {v4, p0, v0, v2, v1}, La/wb3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, La/n6r;->b()V

    .line 168
    .line 169
    .line 170
    iget-object v0, v2, La/n6r;->c:La/glz;

    .line 171
    .line 172
    invoke-virtual {v0, v4}, La/glz;->a(La/blz;)V

    .line 173
    .line 174
    .line 175
    iput-object v4, p0, La/c5k;->b:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    iget-object p0, p0, La/aza;->p:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 182
    .line 183
    new-instance v0, La/yt60;

    .line 184
    .line 185
    invoke-direct {v0, v7, v1}, La/yt60;-><init>(La/cu60;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;->setButtonClick(Lkotlin/jvm/functions/Function0;)V

    .line 189
    .line 190
    .line 191
    new-instance p0, La/yt60;

    .line 192
    .line 193
    invoke-direct {p0, v7, v3}, La/yt60;-><init>(La/cu60;B)V

    .line 194
    .line 195
    .line 196
    const-string v0, "REQUEST_FREE_SPIN"

    .line 197
    .line 198
    invoke-static {v7, v0, p0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    iget-object p0, p0, La/aza;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 206
    .line 207
    new-instance v0, La/au60;

    .line 208
    .line 209
    invoke-direct {v0, v7, v5}, La/au60;-><init>(La/cu60;B)V

    .line 210
    .line 211
    .line 212
    invoke-static {p0, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    iget-object p0, p0, La/aza;->m:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 220
    .line 221
    new-instance v0, La/au60;

    .line 222
    .line 223
    invoke-direct {v0, v7, p1}, La/au60;-><init>(La/cu60;B)V

    .line 224
    .line 225
    .line 226
    invoke-static {p0, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7}, La/cu60;->G0()La/aza;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    iget-object p0, p0, La/aza;->k:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 234
    .line 235
    new-instance p1, La/au60;

    .line 236
    .line 237
    invoke-direct {p1, v7, v3}, La/au60;-><init>(La/cu60;B)V

    .line 238
    .line 239
    .line 240
    invoke-static {p0, p1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, La/vmv;

    .line 10
    .line 11
    const-string v2, "Can not find dependencies provider for "

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    check-cast v0, La/vmv;

    .line 16
    .line 17
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v1, La/nhf0;

    .line 39
    .line 40
    new-instance v2, La/kj5;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v2, v0}, La/nhf0;-><init>(La/kj5;La/g8i;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, p0, La/cu60;->L1:La/ii;

    .line 53
    .line 54
    invoke-virtual {v0}, La/g8i;->I9()La/wdk0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, La/cu60;->M1:La/wdk0;

    .line 62
    .line 63
    invoke-virtual {v0}, La/g8i;->O0()La/peg0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/cu60;->N1:La/peg0;

    .line 68
    .line 69
    iget-object v0, v1, La/nhf0;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, La/n5d0;

    .line 72
    .line 73
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, La/tbi;

    .line 78
    .line 79
    iput-object v0, p0, La/cu60;->O1:La/tbi;

    .line 80
    .line 81
    return-void

    .line 82
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.dependencies.CashbackDependencies"

    .line 83
    .line 84
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final D0()V
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, La/cu60;->H0()La/h2b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/h2b;->H:La/dmt;

    .line 6
    .line 7
    invoke-virtual {v0}, La/dmt;->b()La/kg;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x3

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eq v0, v2, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    if-eq v0, v2, :cond_2

    .line 23
    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-ne v0, v2, :cond_0

    .line 28
    .line 29
    const v0, 0x7f140720

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const v0, 0x7f140722

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const v0, 0x7f140724

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    const v0, 0x7f140723

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    const v0, 0x7f140721

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v2, La/eu4;

    .line 57
    .line 58
    const/16 v3, 0xc

    .line 59
    .line 60
    invoke-direct {v2, v0, v3}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v4, La/vf20;

    .line 64
    .line 65
    const/4 v10, 0x4

    .line 66
    const/16 v11, 0xe

    .line 67
    .line 68
    const/4 v5, 0x2

    .line 69
    const-class v15, La/cu60;

    .line 70
    .line 71
    const-string v8, "handleAccountSelectionStyleType"

    .line 72
    .line 73
    const-string v9, "handleAccountSelectionStyleType(I)V"

    .line 74
    .line 75
    move-object/from16 v6, p0

    .line 76
    .line 77
    move-object v7, v15

    .line 78
    invoke-direct/range {v4 .. v11}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 79
    .line 80
    .line 81
    sget-object v0, La/lkz;->a:La/lkz;

    .line 82
    .line 83
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    new-instance v5, La/yd60;

    .line 96
    .line 97
    const/4 v10, 0x0

    .line 98
    invoke-direct {v5, v2, v0, v4, v10}, La/yd60;-><init>(La/eu4;La/clz;La/vf20;La/yje;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v3, v10, v10, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p0 .. p0}, La/cu60;->H0()La/h2b;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v7, v0, La/h2b;->U:La/ol60;

    .line 109
    .line 110
    new-instance v9, La/vf20;

    .line 111
    .line 112
    const/16 v18, 0x4

    .line 113
    .line 114
    const/16 v19, 0xf

    .line 115
    .line 116
    const/4 v13, 0x2

    .line 117
    const-string v16, "handleOneExecutionState"

    .line 118
    .line 119
    const-string v17, "handleOneExecutionState(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackViewModelOld$OneExecutionState;)V"

    .line 120
    .line 121
    move-object/from16 v14, p0

    .line 122
    .line 123
    move-object v12, v9

    .line 124
    invoke-direct/range {v12 .. v19}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 125
    .line 126
    .line 127
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    new-instance v6, La/yd60;

    .line 140
    .line 141
    const/4 v11, 0x0

    .line 142
    invoke-direct/range {v6 .. v11}, La/yd60;-><init>(La/gmq;La/clz;La/vf20;La/yje;B)V

    .line 143
    .line 144
    .line 145
    invoke-static {v0, v10, v10, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {p0 .. p0}, La/cu60;->H0()La/h2b;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v7, v0, La/h2b;->V:La/p7m0;

    .line 153
    .line 154
    new-instance v9, La/vf20;

    .line 155
    .line 156
    const/16 v19, 0x10

    .line 157
    .line 158
    const-string v16, "handleViewState"

    .line 159
    .line 160
    const-string v17, "handleViewState(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackViewModelOld$CashbackViewState;)V"

    .line 161
    .line 162
    move-object v12, v9

    .line 163
    invoke-direct/range {v12 .. v19}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 164
    .line 165
    .line 166
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    new-instance v6, La/yd60;

    .line 179
    .line 180
    invoke-direct/range {v6 .. v11}, La/yd60;-><init>(La/gmq;La/clz;La/vf20;La/yje;C)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v10, v10, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {p0 .. p0}, La/cu60;->H0()La/h2b;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v7, v0, La/h2b;->Z:La/p7m0;

    .line 191
    .line 192
    new-instance v9, La/vf20;

    .line 193
    .line 194
    const/16 v19, 0x11

    .line 195
    .line 196
    const-string v16, "handleViewActions"

    .line 197
    .line 198
    const-string v17, "handleViewActions(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/ViewAction;)V"

    .line 199
    .line 200
    move-object v12, v9

    .line 201
    invoke-direct/range {v12 .. v19}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 202
    .line 203
    .line 204
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-instance v6, La/yd60;

    .line 217
    .line 218
    invoke-direct/range {v6 .. v11}, La/yd60;-><init>(La/gmq;La/clz;La/vf20;La/yje;I)V

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v10, v10, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {p0 .. p0}, La/cu60;->H0()La/h2b;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iget-object v7, v0, La/h2b;->X:La/p7m0;

    .line 229
    .line 230
    new-instance v9, La/vf20;

    .line 231
    .line 232
    const/16 v19, 0x12

    .line 233
    .line 234
    const-string v16, "showLoading"

    .line 235
    .line 236
    const-string v17, "showLoading(Z)V"

    .line 237
    .line 238
    move-object v12, v9

    .line 239
    invoke-direct/range {v12 .. v19}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 240
    .line 241
    .line 242
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    new-instance v6, La/yd60;

    .line 255
    .line 256
    invoke-direct/range {v6 .. v11}, La/yd60;-><init>(La/gmq;La/clz;La/vf20;La/yje;S)V

    .line 257
    .line 258
    .line 259
    invoke-static {v0, v10, v10, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {p0 .. p0}, La/cu60;->H0()La/h2b;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iget-object v7, v0, La/h2b;->W:La/p7m0;

    .line 267
    .line 268
    new-instance v9, La/vf20;

    .line 269
    .line 270
    const/16 v19, 0x13

    .line 271
    .line 272
    const-string v16, "setBalance"

    .line 273
    .line 274
    const-string v17, "setBalance(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackViewModelOld$BalanceUiModel;)V"

    .line 275
    .line 276
    move-object v12, v9

    .line 277
    invoke-direct/range {v12 .. v19}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 278
    .line 279
    .line 280
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    new-instance v6, La/yd60;

    .line 293
    .line 294
    const/4 v12, 0x0

    .line 295
    invoke-direct/range {v6 .. v12}, La/yd60;-><init>(La/gmq;La/clz;La/vf20;La/yje;BZ)V

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v10, v10, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {p0 .. p0}, La/cu60;->H0()La/h2b;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    iget-object v7, v0, La/h2b;->Y:La/p7m0;

    .line 306
    .line 307
    new-instance v9, La/vf20;

    .line 308
    .line 309
    const/16 v19, 0x14

    .line 310
    .line 311
    const-string v16, "showError"

    .line 312
    .line 313
    const-string v17, "showError(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackViewModelOld$ErrorState;)V"

    .line 314
    .line 315
    move-object v12, v9

    .line 316
    invoke-direct/range {v12 .. v19}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 317
    .line 318
    .line 319
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    new-instance v6, La/yd60;

    .line 332
    .line 333
    move v12, v11

    .line 334
    invoke-direct/range {v6 .. v12}, La/yd60;-><init>(La/gmq;La/clz;La/vf20;La/yje;BB)V

    .line 335
    .line 336
    .line 337
    invoke-static {v0, v10, v10, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 338
    .line 339
    .line 340
    iget-object v0, v14, La/cu60;->P1:La/kiu0;

    .line 341
    .line 342
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, La/k370;

    .line 347
    .line 348
    invoke-virtual {v0}, La/k370;->w()La/gmq;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    new-instance v12, La/vf20;

    .line 353
    .line 354
    const/16 v19, 0x15

    .line 355
    .line 356
    const-string v16, "handleGamesSharedState"

    .line 357
    .line 358
    const-string v17, "handleGamesSharedState(Lorg/xplatform/core/presentation/shared_view_model/OneXGamesSharedState;)V"

    .line 359
    .line 360
    invoke-direct/range {v12 .. v19}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 361
    .line 362
    .line 363
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    new-instance v4, La/yd60;

    .line 376
    .line 377
    check-cast v0, La/i89;

    .line 378
    .line 379
    invoke-direct {v4, v0, v2, v12, v10}, La/yd60;-><init>(La/i89;La/clz;La/vf20;La/yje;)V

    .line 380
    .line 381
    .line 382
    invoke-static {v3, v10, v10, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 383
    .line 384
    .line 385
    return-void
.end method

.method public final G0()La/aza;
    .locals 2

    .line 1
    sget-object v0, La/cu60;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/cu60;->R1:La/s0r;

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
    check-cast p0, La/aza;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/h2b;
    .locals 0

    .line 1
    iget-object p0, p0, La/cu60;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/h2b;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;La/a570;ZZLjava/lang/String;La/hds;Z)V
    .locals 11

    .line 1
    move/from16 v0, p7

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, p1, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->c:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p1, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->a:La/a570;

    .line 13
    .line 14
    move-object/from16 p2, p6

    .line 15
    .line 16
    iget-object v3, p2, La/hds;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v3}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object p2, p1, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b:La/uk5;

    .line 23
    .line 24
    iget-object p2, p2, La/uk5;->g:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v4, p2

    .line 27
    check-cast v4, Landroid/widget/ImageView;

    .line 28
    .line 29
    new-instance v5, La/lya;

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    invoke-direct {v5, p1, p2}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 54
    .line 55
    const/high16 v6, 0x41200000    # 10.0f

    .line 56
    .line 57
    mul-float/2addr v1, v6

    .line 58
    float-to-double v7, v1

    .line 59
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v7

    .line 63
    double-to-float v1, v7

    .line 64
    float-to-int v1, v1

    .line 65
    invoke-static {v4, v1}, La/hxm0;->x(Landroid/view/View;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    new-instance v9, La/k1x;

    .line 77
    .line 78
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-direct {v9, v1}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    iput-object v3, v9, La/k1x;->c:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-static {v9, v4}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 88
    .line 89
    .line 90
    const v1, 0x7f0807c2

    .line 91
    .line 92
    .line 93
    invoke-static {v9, v1}, La/t1x;->c(La/k1x;I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v9, v1}, La/t1x;->f(La/k1x;I)V

    .line 97
    .line 98
    .line 99
    new-instance v1, La/ahg0;

    .line 100
    .line 101
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 117
    .line 118
    mul-float/2addr v7, v6

    .line 119
    float-to-double v6, v7

    .line 120
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    double-to-float v6, v6

    .line 125
    float-to-int v6, v6

    .line 126
    int-to-float v6, v6

    .line 127
    invoke-direct {v1, v6, v6, v6, v6}, La/ahg0;-><init>(FFFF)V

    .line 128
    .line 129
    .line 130
    new-array v6, p2, [La/lls0;

    .line 131
    .line 132
    const/4 v10, 0x0

    .line 133
    aput-object v1, v6, v10

    .line 134
    .line 135
    sget-object v1, La/q1x;->a:La/kuo;

    .line 136
    .line 137
    invoke-static {v6}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v9, v1}, La/q1x;->b(La/k1x;Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    new-instance v1, La/uii;

    .line 145
    .line 146
    move-object v6, v5

    .line 147
    move-object v7, v3

    .line 148
    invoke-direct/range {v1 .. v7}, La/uii;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iput-object v1, v9, La/k1x;->e:La/n1x;

    .line 152
    .line 153
    invoke-virtual {v9}, La/k1x;->a()La/o1x;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v8, v1}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->setGameWorkStatus(Z)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, La/cu60;->G0()La/aza;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    iget-object p0, p0, La/aza;->k:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 168
    .line 169
    if-eq p1, p0, :cond_0

    .line 170
    .line 171
    :goto_0
    move-object/from16 v1, p5

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_0
    move v10, p2

    .line 175
    goto :goto_0

    .line 176
    :goto_1
    invoke-virtual {p1, v1, p3, v10, p4}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->b(Ljava/lang/String;ZZZ)V

    .line 177
    .line 178
    .line 179
    xor-int/lit8 p0, v0, 0x1

    .line 180
    .line 181
    invoke-virtual {p1, p0}, Landroid/view/View;->setEnabled(Z)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method public final Z()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/h2b;->N:La/bby;

    .line 9
    .line 10
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, La/h2b;->D(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/h2b;->C()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/cu60;->S1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
