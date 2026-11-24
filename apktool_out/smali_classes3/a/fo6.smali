.class public final La/fo6;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/fo6;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kj5",
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
.field public static final W1:La/kj5;

.field public static final synthetic X1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public O1:La/z7z;

.field public P1:La/cge0;

.field public Q1:La/lgn0;

.field public R1:La/xi70;

.field public S1:La/wdk0;

.field public final U1:La/hnm0;

.field public final V1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/fo6;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/BetConstructorBetsFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/fo6;->X1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kj5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/fo6;->W1:La/kj5;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d004f

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/zn6;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/zn6;-><init>(La/fo6;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/p46;

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-direct {v1, p0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/wez;->b:La/wez;

    .line 20
    .line 21
    new-instance v3, La/p46;

    .line 22
    .line 23
    const/4 v4, 0x4

    .line 24
    invoke-direct {v3, v1, v4}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v3, La/po6;

    .line 32
    .line 33
    sget-object v4, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, La/qw4;

    .line 40
    .line 41
    const/16 v5, 0x16

    .line 42
    .line 43
    invoke-direct {v4, v1, v5}, La/qw4;-><init>(La/a8z;B)V

    .line 44
    .line 45
    .line 46
    new-instance v5, La/qw4;

    .line 47
    .line 48
    const/16 v6, 0x17

    .line 49
    .line 50
    invoke-direct {v5, v1, v6}, La/qw4;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/fo6;->M1:La/kiu0;

    .line 58
    .line 59
    sget-object v0, La/co6;->a:La/co6;

    .line 60
    .line 61
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/fo6;->N1:La/s0r;

    .line 66
    .line 67
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 68
    .line 69
    iput-object v0, p0, La/fo6;->U1:La/hnm0;

    .line 70
    .line 71
    new-instance v0, La/zn6;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-direct {v0, p0, v1}, La/zn6;-><init>(La/fo6;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/fo6;->V1:La/a8z;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/xn6;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 6
    .line 7
    new-instance v0, La/zn6;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p0, v1}, La/zn6;-><init>(La/fo6;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/xn6;->c:Landroid/widget/ImageView;

    .line 21
    .line 22
    new-instance v0, La/ao6;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, La/ao6;-><init>(La/fo6;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 29
    .line 30
    .line 31
    new-instance v2, La/pw4;

    .line 32
    .line 33
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x6

    .line 39
    const/4 v3, 0x0

    .line 40
    const-class v5, La/po6;

    .line 41
    .line 42
    const-string v6, "onInsufficientFundsDialogPositiveButtonClicked"

    .line 43
    .line 44
    const-string v7, "onInsufficientFundsDialogPositiveButtonClicked()V"

    .line 45
    .line 46
    invoke-direct/range {v2 .. v9}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    const-string p1, "REQUEST_BALANCE_ERROR_DIALOG_KEY"

    .line 50
    .line 51
    invoke-static {p0, p1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, La/zn6;

    .line 55
    .line 56
    const/4 v0, 0x2

    .line 57
    invoke-direct {p1, p0, v0}, La/zn6;-><init>(La/fo6;B)V

    .line 58
    .line 59
    .line 60
    const-string v0, "REQUEST_BET_EXISTS_DIALOG_KEY"

    .line 61
    .line 62
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La/bo6;

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-direct {p1, p0, v0}, La/bo6;-><init>(La/fo6;B)V

    .line 69
    .line 70
    .line 71
    const-string v2, "REQUEST_TEAM_ACTION_KEY"

    .line 72
    .line 73
    invoke-static {p0, v2, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object p1, p1, La/xn6;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 83
    .line 84
    .line 85
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const/4 v3, 0x6

    .line 92
    invoke-direct {p1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 93
    .line 94
    .line 95
    new-instance v2, La/eo6;

    .line 96
    .line 97
    invoke-direct {v2, p0, v1}, La/eo6;-><init>(Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    iput-object v2, p1, Landroidx/recyclerview/widget/GridLayoutManager;->m1:La/c2;

    .line 101
    .line 102
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-object v2, v2, La/xn6;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object p1, p1, La/xn6;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 116
    .line 117
    iget-object v2, p0, La/fo6;->V1:La/a8z;

    .line 118
    .line 119
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, La/xv6;

    .line 124
    .line 125
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object p1, p1, La/xn6;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 133
    .line 134
    new-instance v2, La/yrh;

    .line 135
    .line 136
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget-object v3, v3, La/xn6;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 141
    .line 142
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-direct {v2, v3, v0}, La/yrh;-><init>(Landroid/content/Context;B)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-object p1, p1, La/xn6;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 160
    .line 161
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object p1, p1, La/xn6;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 169
    .line 170
    invoke-static {p1, v0}, La/knm0;->i(Landroid/view/View;Z)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    iget-object p1, p0, La/po6;->G:La/ort;

    .line 178
    .line 179
    iget-object p1, p1, La/ort;->a:La/gst0;

    .line 180
    .line 181
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p1, :cond_0

    .line 186
    .line 187
    iget-boolean p1, p0, La/po6;->M:Z

    .line 188
    .line 189
    if-eqz p1, :cond_0

    .line 190
    .line 191
    iget-object p1, p0, La/po6;->U:La/p7m0;

    .line 192
    .line 193
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    check-cast p1, La/jg7;

    .line 198
    .line 199
    iput-boolean v0, p0, La/po6;->M:Z

    .line 200
    .line 201
    iget-object v0, p0, La/po6;->E:La/i1w0;

    .line 202
    .line 203
    new-instance v1, La/qo5;

    .line 204
    .line 205
    const/16 v2, 0x10

    .line 206
    .line 207
    invoke-direct {v1, p0, p1, v2}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 211
    .line 212
    .line 213
    :cond_0
    return-void
.end method

.method public final C0()V
    .locals 4

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/yn6;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/yn6;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/yn6;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2, v0}, La/yn6;->a(La/i1w0;)La/g7i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/g7i;->e()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/fo6;->K1:La/fiu0;

    .line 68
    .line 69
    iget-object v1, v0, La/g7i;->G:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/ii;

    .line 72
    .line 73
    iput-object v1, p0, La/fo6;->L1:La/ii;

    .line 74
    .line 75
    iget-object v1, v0, La/g7i;->J:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La/zix;

    .line 78
    .line 79
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, p0, La/fo6;->O1:La/z7z;

    .line 84
    .line 85
    new-instance v1, La/cge0;

    .line 86
    .line 87
    const/4 v2, 0x6

    .line 88
    invoke-direct {v1, v2}, La/cge0;-><init>(B)V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, La/fo6;->P1:La/cge0;

    .line 92
    .line 93
    iget-object v1, v0, La/g7i;->H:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, La/lgn0;

    .line 96
    .line 97
    iput-object v1, p0, La/fo6;->Q1:La/lgn0;

    .line 98
    .line 99
    iget-object v1, v0, La/g7i;->r:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, La/rmd0;

    .line 102
    .line 103
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iput-object v1, p0, La/fo6;->R1:La/xi70;

    .line 108
    .line 109
    iget-object v0, v0, La/g7i;->I:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, La/wdk0;

    .line 112
    .line 113
    iput-object v0, p0, La/fo6;->S1:La/wdk0;

    .line 114
    .line 115
    return-void

    .line 116
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 117
    .line 118
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/po6;->R:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/do6;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/do6;-><init>(La/fo6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/td6;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/td6;-><init>(La/gmq;La/clz;La/do6;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/po6;->T:La/p7m0;

    .line 42
    .line 43
    new-instance v6, La/do6;

    .line 44
    .line 45
    invoke-direct {v6, p0, v7, v0}, La/do6;-><init>(La/fo6;La/yje;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v3, La/td6;

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    invoke-direct/range {v3 .. v8}, La/td6;-><init>(La/gmq;La/clz;La/do6;La/yje;I)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v4, v1, La/po6;->S:La/p7m0;

    .line 74
    .line 75
    new-instance v6, La/do6;

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-direct {v6, p0, v7, v1}, La/do6;-><init>(La/fo6;La/yje;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v3, La/td6;

    .line 94
    .line 95
    invoke-direct/range {v3 .. v8}, La/td6;-><init>(La/gmq;La/clz;La/do6;La/yje;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v4, v1, La/po6;->V:La/ol60;

    .line 106
    .line 107
    new-instance v6, La/do6;

    .line 108
    .line 109
    const/4 v1, 0x2

    .line 110
    invoke-direct {v6, p0, v7, v1}, La/do6;-><init>(La/fo6;La/yje;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    new-instance v3, La/td6;

    .line 126
    .line 127
    invoke-direct/range {v3 .. v8}, La/td6;-><init>(La/gmq;La/clz;La/do6;La/yje;C)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final G0()La/xn6;
    .locals 2

    .line 1
    sget-object v0, La/fo6;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/fo6;->N1:La/s0r;

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
    check-cast p0, La/xn6;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/po6;
    .locals 0

    .line 1
    iget-object p0, p0, La/fo6;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/po6;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/fo6;->G0()La/xn6;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/xn6;->b:Landroid/widget/FrameLayout;

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

.method public final d0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/po6;->O:La/c4m0;

    .line 6
    .line 7
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 5

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/po6;->R:La/p7m0;

    .line 9
    .line 10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    instance-of v1, v1, La/xv7;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v0, v0, La/vv7;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, La/po6;->O:La/c4m0;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, La/pby;->isCancelled()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x1

    .line 35
    if-ne v0, v1, :cond_0

    .line 36
    .line 37
    iget-boolean v0, p0, La/po6;->N:Z

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    new-instance v0, La/no6;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, p0, v1}, La/no6;-><init>(La/po6;La/yje;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v2, 0x1e

    .line 48
    .line 49
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 50
    .line 51
    invoke-static {v2, v3, v4, v0}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, La/mo6;

    .line 60
    .line 61
    const/4 v4, 0x4

    .line 62
    invoke-direct {v3, p0, v1, v4}, La/mo6;-><init>(La/po6;La/yje;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v2, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/po6;->O:La/c4m0;

    .line 70
    .line 71
    :cond_0
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/fo6;->U1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
