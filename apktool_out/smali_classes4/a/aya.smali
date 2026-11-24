.class public final La/aya;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/aya;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bj5",
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
.field public static final S1:La/bj5;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/hnm0;

.field public M1:La/sbi;

.field public N1:La/wdk0;

.field public final O1:La/kiu0;

.field public final P1:La/r34;

.field public final Q1:La/s0r;

.field public final R1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/aya;

    .line 4
    .line 5
    const-string v2, "monthGameId"

    .line 6
    .line 7
    const-string v3, "getMonthGameId()J"

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
    const-string v5, "getViewBinding()Lorg/xplatform/games_section/feature/cashback/databinding/CashbackSelectorFragmentBinding;"

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
    sput-object v1, La/aya;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bj5;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/aya;->S1:La/bj5;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0077

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/aya;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 18
    .line 19
    iput-object v0, p0, La/aya;->L1:La/hnm0;

    .line 20
    .line 21
    new-instance v0, La/xxa;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-direct {v0, p0, v1}, La/xxa;-><init>(La/aya;B)V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/h79;

    .line 28
    .line 29
    const/16 v2, 0xa

    .line 30
    .line 31
    invoke-direct {v1, p0, v2}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    sget-object v2, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v3, La/h79;

    .line 37
    .line 38
    const/16 v4, 0xb

    .line 39
    .line 40
    invoke-direct {v3, v1, v4}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-class v2, La/yya;

    .line 48
    .line 49
    sget-object v3, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v3, La/rt6;

    .line 56
    .line 57
    const/16 v4, 0x18

    .line 58
    .line 59
    invoke-direct {v3, v1, v4}, La/rt6;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    new-instance v4, La/rt6;

    .line 63
    .line 64
    const/16 v5, 0x19

    .line 65
    .line 66
    invoke-direct {v4, v1, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/aya;->O1:La/kiu0;

    .line 74
    .line 75
    new-instance v0, La/r34;

    .line 76
    .line 77
    const-string v1, "MONTH_GAME"

    .line 78
    .line 79
    const-wide/16 v2, 0x0

    .line 80
    .line 81
    invoke-direct {v0, v1, v2, v3}, La/r34;-><init>(Ljava/lang/String;J)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, La/aya;->P1:La/r34;

    .line 85
    .line 86
    sget-object v0, La/zxa;->a:La/zxa;

    .line 87
    .line 88
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, La/aya;->Q1:La/s0r;

    .line 93
    .line 94
    new-instance v0, La/xxa;

    .line 95
    .line 96
    const/4 v1, 0x3

    .line 97
    invoke-direct {v0, p0, v1}, La/xxa;-><init>(La/aya;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, La/aya;->R1:La/n0o0;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    new-instance p1, La/xxa;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/xxa;-><init>(La/aya;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/aya;->I0()La/yya;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, La/aya;->G0()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iput-wide v1, p1, La/yya;->t:J

    .line 19
    .line 20
    iget-object v1, p1, La/yya;->g:La/m1e;

    .line 21
    .line 22
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, La/lo3;

    .line 27
    .line 28
    const/4 v3, 0x5

    .line 29
    const/4 v4, 0x3

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-direct {v2, v4, v5, v3}, La/lo3;-><init>(ILa/yje;B)V

    .line 32
    .line 33
    .line 34
    new-instance v3, La/dnq;

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    invoke-direct {v3, v1, v2, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/qv3;

    .line 41
    .line 42
    const/16 v2, 0x1d

    .line 43
    .line 44
    invoke-direct {v1, p1, v5, v2}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    new-instance v2, La/fnq;

    .line 48
    .line 49
    const/4 v7, 0x4

    .line 50
    invoke-direct {v2, v3, v1, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {v2, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object p1, p1, La/m0b;->f:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 65
    .line 66
    const v1, 0x7f0f0026

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->l(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object p1, p1, La/m0b;->f:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 77
    .line 78
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const v1, 0x7f0a0ce3

    .line 83
    .line 84
    .line 85
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v1, La/kw20;

    .line 90
    .line 91
    const/4 v2, 0x2

    .line 92
    invoke-direct {v1, p0, v2}, La/kw20;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    instance-of v1, p1, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 103
    .line 104
    if-eqz v1, :cond_0

    .line 105
    .line 106
    check-cast p1, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    move-object p1, v5

    .line 110
    :goto_0
    if-eqz p1, :cond_1

    .line 111
    .line 112
    const v1, 0x7fffffff

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/d;->setMaxWidth(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;->setIgnorePrevIconifiedValue(Z)V

    .line 119
    .line 120
    .line 121
    const v1, 0x7f1311c4

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1}, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;->setText(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v1, v1, La/m0b;->b:Landroid/view/View;

    .line 132
    .line 133
    new-instance v3, La/kih0;

    .line 134
    .line 135
    invoke-direct {v3, v1, p1}, La/kih0;-><init>(Landroid/view/View;Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/d;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 139
    .line 140
    .line 141
    new-instance v1, La/c5k;

    .line 142
    .line 143
    invoke-direct {v1, p1, p0}, La/c5k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/d;->setOnQueryTextListener(La/hih0;)V

    .line 147
    .line 148
    .line 149
    :cond_1
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget-object p1, p1, La/m0b;->f:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 154
    .line 155
    new-instance v1, La/q10;

    .line 156
    .line 157
    const/4 v3, 0x7

    .line 158
    invoke-direct {v1, p0, v3}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object p1, p1, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 169
    .line 170
    invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget-object p1, p1, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 178
    .line 179
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 180
    .line 181
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    iget-object v3, v3, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 186
    .line 187
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    iget-object v5, v5, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 196
    .line 197
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    const v8, 0x7f05000d

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-eqz v5, :cond_2

    .line 216
    .line 217
    move v2, v4

    .line 218
    :cond_2
    invoke-direct {v1, v3, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object p1, p1, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 229
    .line 230
    invoke-static {p1, v0, v4}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, La/aya;->I0()La/yya;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p0}, La/aya;->G0()J

    .line 238
    .line 239
    .line 240
    move-result-wide v0

    .line 241
    invoke-virtual {p1, v0, v1}, La/yya;->w(J)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    iget-object p1, p1, La/m0b;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 249
    .line 250
    new-instance v0, La/bna;

    .line 251
    .line 252
    invoke-direct {v0, p0, v7}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->setOnSaveClickListener(Lkotlin/jvm/functions/Function2;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    iget-object p1, p1, La/m0b;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 263
    .line 264
    new-instance v0, La/xxa;

    .line 265
    .line 266
    invoke-direct {v0, p0, v6}, La/xxa;-><init>(La/aya;B)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, v0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;->setOnCancelClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 270
    .line 271
    .line 272
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
    iget-object v1, v1, La/nhf0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, La/n5d0;

    .line 51
    .line 52
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, La/sbi;

    .line 57
    .line 58
    iput-object v1, p0, La/aya;->M1:La/sbi;

    .line 59
    .line 60
    invoke-virtual {v0}, La/g8i;->I9()La/wdk0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/aya;->N1:La/wdk0;

    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.dependencies.CashbackDependencies"

    .line 71
    .line 72
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/aya;->I0()La/yya;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/yya;->u:La/p7m0;

    .line 6
    .line 7
    new-instance v3, La/c48;

    .line 8
    .line 9
    const/4 v9, 0x4

    .line 10
    const/16 v10, 0xb

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    const-class v14, La/aya;

    .line 14
    .line 15
    const-string v7, "updateGames"

    .line 16
    .line 17
    const-string v8, "updateGames(Lorg/xplatform/games_section/feature/cashback/presentation/viewModels/CashbackChoosingViewModelOld$ViewState;)V"

    .line 18
    .line 19
    move-object/from16 v5, p0

    .line 20
    .line 21
    move-object v6, v14

    .line 22
    invoke-direct/range {v3 .. v10}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 23
    .line 24
    .line 25
    sget-object v0, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, La/l19;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v11, 0x0

    .line 44
    move-object v5, v11

    .line 45
    invoke-direct/range {v1 .. v6}, La/l19;-><init>(La/gmq;La/clz;La/c48;La/yje;C)V

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p0 .. p0}, La/aya;->I0()La/yya;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v8, v0, La/yya;->v:La/p7m0;

    .line 57
    .line 58
    new-instance v10, La/c48;

    .line 59
    .line 60
    const/16 v17, 0x4

    .line 61
    .line 62
    const/16 v18, 0xc

    .line 63
    .line 64
    const/4 v12, 0x2

    .line 65
    const-string v15, "showLottie"

    .line 66
    .line 67
    const-string v16, "showLottie(Lorg/xplatform/uikit/components/lottie/LottieConfig;)V"

    .line 68
    .line 69
    move-object/from16 v13, p0

    .line 70
    .line 71
    move-object v11, v10

    .line 72
    invoke-direct/range {v11 .. v18}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 73
    .line 74
    .line 75
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    new-instance v7, La/l19;

    .line 88
    .line 89
    const/4 v12, 0x0

    .line 90
    move-object v11, v5

    .line 91
    invoke-direct/range {v7 .. v12}, La/l19;-><init>(La/gmq;La/clz;La/c48;La/yje;I)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, La/aya;->I0()La/yya;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v0, v0, La/yya;->w:La/p7m0;

    .line 102
    .line 103
    new-instance v11, La/c48;

    .line 104
    .line 105
    const/16 v18, 0xd

    .line 106
    .line 107
    const/4 v12, 0x2

    .line 108
    const-string v15, "showProgressView"

    .line 109
    .line 110
    const-string v16, "showProgressView(Z)V"

    .line 111
    .line 112
    invoke-direct/range {v11 .. v18}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    new-instance v4, La/yxa;

    .line 128
    .line 129
    invoke-direct {v4, v0, v1, v11, v5}, La/yxa;-><init>(La/gmq;La/clz;La/c48;La/yje;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {p0 .. p0}, La/aya;->I0()La/yya;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v8, v0, La/yya;->x:La/ol60;

    .line 140
    .line 141
    new-instance v10, La/c48;

    .line 142
    .line 143
    const/16 v18, 0xe

    .line 144
    .line 145
    const-string v15, "showToastNotification"

    .line 146
    .line 147
    const-string v16, "showToastNotification(Ljava/lang/String;)V"

    .line 148
    .line 149
    move-object v11, v10

    .line 150
    invoke-direct/range {v11 .. v18}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 151
    .line 152
    .line 153
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v7, La/yxa;

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    move-object v11, v5

    .line 169
    invoke-direct/range {v7 .. v12}, La/yxa;-><init>(La/gmq;La/clz;La/c48;La/yje;B)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {p0 .. p0}, La/aya;->I0()La/yya;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iget-object v8, v0, La/yya;->y:La/ol60;

    .line 180
    .line 181
    new-instance v10, La/c48;

    .line 182
    .line 183
    const/16 v18, 0xf

    .line 184
    .line 185
    const/4 v12, 0x2

    .line 186
    const-string v15, "showSnackMessage"

    .line 187
    .line 188
    const-string v16, "showSnackMessage(Ljava/lang/String;)V"

    .line 189
    .line 190
    move-object v11, v10

    .line 191
    invoke-direct/range {v11 .. v18}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 192
    .line 193
    .line 194
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    new-instance v7, La/yxa;

    .line 207
    .line 208
    const/4 v12, 0x0

    .line 209
    move-object v11, v5

    .line 210
    invoke-direct/range {v7 .. v12}, La/yxa;-><init>(La/gmq;La/clz;La/c48;La/yje;C)V

    .line 211
    .line 212
    .line 213
    invoke-static {v0, v5, v5, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public final G0()J
    .locals 2

    .line 1
    sget-object v0, La/aya;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/aya;->P1:La/r34;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public final H0()La/m0b;
    .locals 2

    .line 1
    sget-object v0, La/aya;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/aya;->Q1:La/s0r;

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
    check-cast p0, La/m0b;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/yya;
    .locals 0

    .line 1
    iget-object p0, p0, La/aya;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yya;

    .line 8
    .line 9
    return-object p0
.end method

.method public final J0(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/m0b;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v1

    .line 15
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/aya;->H0()La/m0b;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object p0, p0, La/m0b;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    move v1, v2

    .line 27
    :cond_1
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/aya;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/aya;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
