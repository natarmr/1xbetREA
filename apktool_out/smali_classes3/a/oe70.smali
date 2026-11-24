.class public final La/oe70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/oe70;",
        "La/yx5;",
        "<init>",
        "()V",
        "core"
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
.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/u6i;

.field public M1:La/ii;

.field public N1:La/peg0;

.field public final O1:La/s0r;

.field public final P1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/oe70;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/core/databinding/OnexGameBalanceFragmentBinding;"

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
    sput-object v1, La/oe70;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d04ff

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/oe70;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/me70;->a:La/me70;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/oe70;->O1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/le70;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/le70;-><init>(La/oe70;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/ej50;

    .line 26
    .line 27
    const/16 v2, 0x18

    .line 28
    .line 29
    invoke-direct {v1, p0, v2}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v2, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v3, La/ej50;

    .line 35
    .line 36
    const/16 v4, 0x19

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-class v2, La/qf70;

    .line 46
    .line 47
    sget-object v3, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, La/co60;

    .line 54
    .line 55
    const/16 v4, 0x14

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, La/co60;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/co60;

    .line 61
    .line 62
    const/16 v5, 0x15

    .line 63
    .line 64
    invoke-direct {v4, v1, v5}, La/co60;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/oe70;->P1:La/kiu0;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/bn70;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/bn70;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/bn70;->L1:La/h5t;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, p0}, La/h5t;->q(La/oe70;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final G0()La/pe70;
    .locals 2

    .line 1
    sget-object v0, La/oe70;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/oe70;->O1:La/s0r;

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
    check-cast p0, La/pe70;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/qf70;
    .locals 0

    .line 1
    iget-object p0, p0, La/oe70;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qf70;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/oe70;->H0()La/qf70;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/qf70;->O:La/c4m0;

    .line 9
    .line 10
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0}, La/oe70;->H0()La/qf70;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, La/qf70;->H:Z

    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 9

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/oe70;->H0()La/qf70;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 p0, 0x1

    .line 9
    iput-boolean p0, v2, La/qf70;->H:Z

    .line 10
    .line 11
    iget-boolean p0, v2, La/qf70;->I:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    iput-boolean p0, v2, La/qf70;->I:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p0, v2, La/qf70;->E:La/y5s;

    .line 20
    .line 21
    iget-object p0, p0, La/y5s;->a:La/s470;

    .line 22
    .line 23
    sget-object v0, La/s470;->p:La/s470;

    .line 24
    .line 25
    if-eq p0, v0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance v0, La/cf70;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/16 v7, 0x9

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    const-class v3, La/qf70;

    .line 39
    .line 40
    const-string v4, "handleGameError"

    .line 41
    .line 42
    const-string v5, "handleGameError(Ljava/lang/Throwable;)V"

    .line 43
    .line 44
    invoke-direct/range {v0 .. v7}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v2, La/qf70;->v:La/mne;

    .line 48
    .line 49
    iget-object v6, v1, La/mne;->b:La/dvj;

    .line 50
    .line 51
    new-instance v7, La/ef70;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    const/4 v3, 0x3

    .line 55
    invoke-direct {v7, v2, v1, v3}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 56
    .line 57
    .line 58
    const/16 v8, 0xa

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    move-object v3, p0

    .line 62
    move-object v4, v0

    .line 63
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, La/oe70;->H0()La/qf70;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    new-instance v1, La/cf70;

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x3

    .line 21
    const/4 v2, 0x1

    .line 22
    const-class v13, La/qf70;

    .line 23
    .line 24
    const-string v5, "handleGameError"

    .line 25
    .line 26
    const-string v6, "handleGameError(Ljava/lang/Throwable;)V"

    .line 27
    .line 28
    move-object v4, v13

    .line 29
    invoke-direct/range {v1 .. v8}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v3, La/qf70;->v:La/mne;

    .line 33
    .line 34
    iget-object v7, v2, La/mne;->b:La/dvj;

    .line 35
    .line 36
    new-instance v8, La/xj1;

    .line 37
    .line 38
    const/16 v2, 0x12

    .line 39
    .line 40
    const/4 v10, 0x0

    .line 41
    invoke-direct {v8, v3, v10, v2}, La/xj1;-><init>(La/diu0;La/yje;B)V

    .line 42
    .line 43
    .line 44
    move-object v4, v9

    .line 45
    const/16 v9, 0xa

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    move-object v5, v1

    .line 49
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, La/oe70;->G0()La/pe70;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v1, v1, La/pe70;->c:Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;

    .line 57
    .line 58
    new-instance v2, La/le70;

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    invoke-direct {v2, v0, v3}, La/le70;-><init>(La/oe70;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;->setOnReplenishClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, La/oe70;->G0()La/pe70;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v1, v1, La/pe70;->c:Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;

    .line 72
    .line 73
    new-instance v2, La/le70;

    .line 74
    .line 75
    const/4 v4, 0x2

    .line 76
    invoke-direct {v2, v0, v4}, La/le70;-><init>(La/oe70;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Lorg/xplatform/core/presentation/balance/OnexGamesBalanceView;->setOnBalanceClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, La/oe70;->H0()La/qf70;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v1, v1, La/qf70;->J:La/p7m0;

    .line 87
    .line 88
    new-instance v2, La/ne70;

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-direct {v2, v0, v10, v4}, La/ne70;-><init>(La/oe70;La/yje;B)V

    .line 92
    .line 93
    .line 94
    sget-object v4, La/lkz;->a:La/lkz;

    .line 95
    .line 96
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    new-instance v6, La/az60;

    .line 109
    .line 110
    invoke-direct {v6, v1, v4, v2, v10}, La/az60;-><init>(La/gmq;La/clz;La/ne70;La/yje;)V

    .line 111
    .line 112
    .line 113
    const/4 v1, 0x3

    .line 114
    invoke-static {v5, v10, v10, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, La/oe70;->H0()La/qf70;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iget-object v2, v2, La/qf70;->K:La/q99;

    .line 122
    .line 123
    invoke-static {v2}, La/xkb;->V(La/htb;)La/itb;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    new-instance v4, La/ne70;

    .line 128
    .line 129
    invoke-direct {v4, v0, v10, v3}, La/ne70;-><init>(La/oe70;La/yje;B)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-static {v6}, La/x0x;->Q(La/glz;)La/tkz;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    new-instance v7, La/az60;

    .line 145
    .line 146
    invoke-direct {v7, v2, v5, v4, v10}, La/az60;-><init>(La/itb;La/clz;La/ne70;La/yje;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v6, v10, v10, v7, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 150
    .line 151
    .line 152
    new-instance v2, La/le70;

    .line 153
    .line 154
    const/4 v4, 0x5

    .line 155
    invoke-direct {v2, v0, v4}, La/le70;-><init>(La/oe70;B)V

    .line 156
    .line 157
    .line 158
    const-string v4, "CHANGE_BONUS_ACCOUNT_TO_PRIMARY_REQUEST_KEY"

    .line 159
    .line 160
    invoke-static {v0, v4, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 161
    .line 162
    .line 163
    new-instance v2, La/cd60;

    .line 164
    .line 165
    const/16 v4, 0x11

    .line 166
    .line 167
    invoke-direct {v2, v0, v4}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 168
    .line 169
    .line 170
    const-string v4, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 171
    .line 172
    invoke-static {v0, v4, v2}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 173
    .line 174
    .line 175
    new-instance v2, La/le70;

    .line 176
    .line 177
    invoke-direct {v2, v0, v1}, La/le70;-><init>(La/oe70;B)V

    .line 178
    .line 179
    .line 180
    const-string v1, "CHANGE_ACCOUNT_REQUEST_KEY"

    .line 181
    .line 182
    invoke-static {v0, v1, v2}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 183
    .line 184
    .line 185
    new-instance v2, La/le70;

    .line 186
    .line 187
    const/4 v4, 0x4

    .line 188
    invoke-direct {v2, v0, v4}, La/le70;-><init>(La/oe70;B)V

    .line 189
    .line 190
    .line 191
    invoke-static {v0, v1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, La/oe70;->H0()La/qf70;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    invoke-static {v12}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    new-instance v5, La/cf70;

    .line 203
    .line 204
    const/16 v16, 0x0

    .line 205
    .line 206
    const/16 v17, 0x4

    .line 207
    .line 208
    const/4 v11, 0x1

    .line 209
    const-string v14, "handleGameError"

    .line 210
    .line 211
    const-string v15, "handleGameError(Ljava/lang/Throwable;)V"

    .line 212
    .line 213
    move-object v0, v10

    .line 214
    move-object v10, v5

    .line 215
    invoke-direct/range {v10 .. v17}, La/cf70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 216
    .line 217
    .line 218
    iget-object v1, v12, La/qf70;->v:La/mne;

    .line 219
    .line 220
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 221
    .line 222
    new-instance v8, La/ef70;

    .line 223
    .line 224
    invoke-direct {v8, v12, v0, v3}, La/ef70;-><init>(La/qf70;La/yje;B)V

    .line 225
    .line 226
    .line 227
    const/4 v6, 0x0

    .line 228
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/oe70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
