.class public final La/er6;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/er6;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kl5",
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
.field public static final S1:La/kl5;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public O1:La/poq0;

.field public P1:La/ii;

.field public Q1:La/wdk0;

.field public R1:La/k4f;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/er6;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/BetConstructorGamesFragmentBinding;"

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
    sput-object v1, La/er6;->U1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kl5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/er6;->S1:La/kl5;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0051

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/er6;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/br6;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/br6;-><init>(La/er6;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/p46;

    .line 18
    .line 19
    const/4 v2, 0x7

    .line 20
    invoke-direct {v1, p0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v3, La/p46;

    .line 26
    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    invoke-direct {v3, v1, v4}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-class v2, La/as6;

    .line 37
    .line 38
    sget-object v3, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, La/qw4;

    .line 45
    .line 46
    const/16 v4, 0x1a

    .line 47
    .line 48
    invoke-direct {v3, v1, v4}, La/qw4;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v4, La/qw4;

    .line 52
    .line 53
    const/16 v5, 0x1b

    .line 54
    .line 55
    invoke-direct {v4, v1, v5}, La/qw4;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/er6;->M1:La/kiu0;

    .line 63
    .line 64
    sget-object v0, La/cr6;->a:La/cr6;

    .line 65
    .line 66
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/er6;->N1:La/s0r;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/er6;->G0()La/zq6;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La/zq6;->g:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 8
    .line 9
    new-instance v2, La/br6;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, v0, v3}, La/br6;-><init>(La/er6;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La/er6;->G0()La/zq6;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, La/zq6;->b:Lcom/google/android/material/button/MaterialButton;

    .line 23
    .line 24
    new-instance v2, La/os5;

    .line 25
    .line 26
    const/16 v3, 0xd

    .line 27
    .line 28
    invoke-direct {v2, v0, v3}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, La/er6;->G0()La/zq6;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, La/zq6;->d:Landroid/widget/FrameLayout;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v1, v2}, La/knm0;->i(Landroid/view/View;Z)V

    .line 42
    .line 43
    .line 44
    new-instance v1, La/k4f;

    .line 45
    .line 46
    new-instance v2, La/yj5;

    .line 47
    .line 48
    invoke-virtual {v0}, La/er6;->H0()La/as6;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    const/4 v8, 0x0

    .line 53
    const/16 v9, 0x1c

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    const-class v13, La/as6;

    .line 57
    .line 58
    const-string v6, "onTabSelected"

    .line 59
    .line 60
    const-string v7, "onTabSelected(I)V"

    .line 61
    .line 62
    move-object v5, v13

    .line 63
    invoke-direct/range {v2 .. v9}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v1}, La/i26;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v3, v1, La/i26;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, La/dp;

    .line 72
    .line 73
    new-instance v4, La/jak0;

    .line 74
    .line 75
    const/16 v5, 0x11

    .line 76
    .line 77
    invoke-direct {v4, v5}, La/jak0;-><init>(B)V

    .line 78
    .line 79
    .line 80
    new-instance v5, La/j1l0;

    .line 81
    .line 82
    const/4 v6, 0x2

    .line 83
    invoke-direct {v5, v2, v6}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    new-instance v2, La/asj0;

    .line 87
    .line 88
    const/4 v6, 0x3

    .line 89
    const/4 v7, 0x6

    .line 90
    invoke-direct {v2, v6, v7}, La/asj0;-><init>(IB)V

    .line 91
    .line 92
    .line 93
    sget-object v6, La/wjj0;->m:La/wjj0;

    .line 94
    .line 95
    new-instance v7, La/gbn;

    .line 96
    .line 97
    invoke-direct {v7, v4, v2, v5, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v7}, La/dp;->b(La/gbn;)V

    .line 101
    .line 102
    .line 103
    iput-object v1, v0, La/er6;->R1:La/k4f;

    .line 104
    .line 105
    invoke-virtual {v0}, La/er6;->G0()La/zq6;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v1, v1, La/zq6;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 110
    .line 111
    iget-object v2, v0, La/er6;->R1:La/k4f;

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 114
    .line 115
    .line 116
    new-instance v1, La/fa2;

    .line 117
    .line 118
    const/16 v2, 0x19

    .line 119
    .line 120
    invoke-direct {v1, v0, v2}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 121
    .line 122
    .line 123
    const-string v2, "REQUEST_TEAM_SELECTOR_KEY"

    .line 124
    .line 125
    invoke-static {v0, v2, v1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    new-instance v10, La/pw4;

    .line 129
    .line 130
    invoke-virtual {v0}, La/er6;->H0()La/as6;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x7

    .line 137
    .line 138
    const/4 v11, 0x0

    .line 139
    const-string v14, "onExitConfirmed"

    .line 140
    .line 141
    const-string v15, "onExitConfirmed()V"

    .line 142
    .line 143
    invoke-direct/range {v10 .. v17}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 144
    .line 145
    .line 146
    const-string v1, "REQUEST_KEY_EXIT"

    .line 147
    .line 148
    invoke-static {v0, v1, v10}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, La/er6;->H0()La/as6;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iget-boolean v2, v1, La/as6;->B:Z

    .line 156
    .line 157
    if-eqz v2, :cond_0

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_0
    invoke-virtual {v1}, La/as6;->A()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, La/as6;->w()V

    .line 164
    .line 165
    .line 166
    :goto_0
    new-instance v10, La/pw4;

    .line 167
    .line 168
    invoke-virtual {v0}, La/er6;->H0()La/as6;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    const/16 v17, 0x8

    .line 175
    .line 176
    const/4 v11, 0x0

    .line 177
    const-string v14, "onBackPressed"

    .line 178
    .line 179
    const-string v15, "onBackPressed()V"

    .line 180
    .line 181
    invoke-direct/range {v10 .. v17}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 182
    .line 183
    .line 184
    invoke-static {v0, v0, v10}, La/qcc;->W(Landroidx/fragment/app/Fragment;La/clz;Lkotlin/jvm/functions/Function0;)V

    .line 185
    .line 186
    .line 187
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
    const-class v1, La/ar6;

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
    instance-of v3, v0, La/ar6;

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
    check-cast v2, La/ar6;

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
    invoke-virtual {v2, v0}, La/ar6;->a(La/i1w0;)La/v9i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/v9i;->e()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/er6;->L1:La/fiu0;

    .line 68
    .line 69
    iget-object v1, v0, La/v9i;->n:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/poq0;

    .line 72
    .line 73
    iput-object v1, p0, La/er6;->O1:La/poq0;

    .line 74
    .line 75
    iget-object v1, v0, La/v9i;->v:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La/ii;

    .line 78
    .line 79
    iput-object v1, p0, La/er6;->P1:La/ii;

    .line 80
    .line 81
    iget-object v0, v0, La/v9i;->w:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/wdk0;

    .line 84
    .line 85
    iput-object v0, p0, La/er6;->Q1:La/wdk0;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 89
    .line 90
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/er6;->H0()La/as6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/as6;->D:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/dr6;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/dr6;-><init>(La/er6;La/yje;B)V

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
    invoke-direct {v4, v0, v2, v1, v7}, La/td6;-><init>(La/gmq;La/clz;La/dr6;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/er6;->H0()La/as6;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/as6;->E:La/p7m0;

    .line 42
    .line 43
    new-instance v6, La/dr6;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/dr6;-><init>(La/er6;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v3, La/td6;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/td6;-><init>(La/gmq;La/clz;La/dr6;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/er6;->H0()La/as6;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v4, v1, La/as6;->F:La/ol60;

    .line 75
    .line 76
    new-instance v6, La/dr6;

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-direct {v6, p0, v7, v1}, La/dr6;-><init>(La/er6;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v3, La/td6;

    .line 95
    .line 96
    invoke-direct/range {v3 .. v8}, La/td6;-><init>(La/gmq;La/clz;La/dr6;La/yje;C)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final G0()La/zq6;
    .locals 2

    .line 1
    sget-object v0, La/er6;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/er6;->N1:La/s0r;

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
    check-cast p0, La/zq6;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/as6;
    .locals 0

    .line 1
    iget-object p0, p0, La/er6;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/as6;

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
    invoke-virtual {p0}, La/er6;->G0()La/zq6;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/zq6;->h:Landroidx/recyclerview/widget/RecyclerView;

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

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/er6;->H0()La/as6;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/as6;->n:La/poq0;

    .line 9
    .line 10
    iget-object v0, v0, La/poq0;->a:La/jxi;

    .line 11
    .line 12
    invoke-virtual {v0}, La/jxi;->d()La/r8i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, La/fk60;->e:La/fk60;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/r8i;->r(La/fk60;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, La/as6;->F:La/ol60;

    .line 25
    .line 26
    sget-object v0, La/yct;->a:La/yct;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/er6;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
