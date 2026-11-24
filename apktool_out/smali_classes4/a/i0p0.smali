.class public final La/i0p0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/i0p0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/j6m0",
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
.field public static final Z1:La/j6m0;

.field public static final synthetic a2:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/a8z;

.field public final M1:La/khf0;

.field public final N1:La/s0r;

.field public final O1:La/n0o0;

.field public P1:La/dwi;

.field public Q1:La/ewi;

.field public R1:La/fwi;

.field public S1:La/ujd;

.field public U1:La/ii;

.field public V1:La/wdk0;

.field public final W1:La/a8z;

.field public final X1:La/a8z;

.field public final Y1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/i0p0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;"

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
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/i0p0;->a2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/j6m0;

    .line 33
    .line 34
    const/16 v1, 0xd

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/j6m0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/i0p0;->Z1:La/j6m0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/i0p0;->K1:Z

    .line 9
    .line 10
    new-instance v1, La/fno0;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/fno0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/wez;->b:La/wez;

    .line 18
    .line 19
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, La/i0p0;->L1:La/a8z;

    .line 24
    .line 25
    new-instance v1, La/khf0;

    .line 26
    .line 27
    const-string v2, "TEAM_BET_PARAMS_KEY"

    .line 28
    .line 29
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, La/i0p0;->M1:La/khf0;

    .line 33
    .line 34
    sget-object v1, La/h0p0;->a:La/h0p0;

    .line 35
    .line 36
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, La/i0p0;->N1:La/s0r;

    .line 41
    .line 42
    new-instance v1, La/d0p0;

    .line 43
    .line 44
    invoke-direct {v1, p0, v0}, La/d0p0;-><init>(La/i0p0;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, La/i0p0;->O1:La/n0o0;

    .line 52
    .line 53
    sget-object v0, La/sre0;->a:La/tre0;

    .line 54
    .line 55
    const-class v1, La/pyo0;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v2, La/d0p0;

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    invoke-direct {v2, p0, v3}, La/d0p0;-><init>(La/i0p0;B)V

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/16 v4, 0xe

    .line 69
    .line 70
    invoke-static {p0, v1, v3, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, p0, La/i0p0;->W1:La/a8z;

    .line 75
    .line 76
    const-class v1, La/b0p0;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v2, La/d0p0;

    .line 83
    .line 84
    const/4 v5, 0x3

    .line 85
    invoke-direct {v2, p0, v5}, La/d0p0;-><init>(La/i0p0;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v1, v3, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, p0, La/i0p0;->X1:La/a8z;

    .line 93
    .line 94
    const-class v1, La/i3p0;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, La/d0p0;

    .line 101
    .line 102
    const/4 v2, 0x4

    .line 103
    invoke-direct {v1, p0, v2}, La/d0p0;-><init>(La/i0p0;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v0, v3, v1, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, La/i0p0;->Y1:La/a8z;

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/d0p0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/d0p0;-><init>(La/i0p0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/d0p0;

    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    invoke-direct {p1, p0, v0}, La/d0p0;-><init>(La/i0p0;B)V

    .line 14
    .line 15
    .line 16
    const-string v0, "REQUEST_COUPON_EVENT"

    .line 17
    .line 18
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, La/i0p0;->a2:[La/iiy;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    aget-object p1, p1, v0

    .line 25
    .line 26
    iget-object v1, p0, La/i0p0;->N1:La/s0r;

    .line 27
    .line 28
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast p1, La/aid;

    .line 36
    .line 37
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 38
    .line 39
    new-instance v1, La/abn0;

    .line 40
    .line 41
    const/16 v2, 0x19

    .line 42
    .line 43
    invoke-direct {v1, p0, v2}, La/abn0;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    new-instance p0, La/ugd;

    .line 47
    .line 48
    const v2, -0x3dbd5365

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/i0p0;->O1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/gwi;

    .line 8
    .line 9
    iget-object v1, v0, La/gwi;->E:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/dwi;

    .line 16
    .line 17
    iput-object v1, p0, La/i0p0;->P1:La/dwi;

    .line 18
    .line 19
    iget-object v1, v0, La/gwi;->F:La/n5d0;

    .line 20
    .line 21
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/ewi;

    .line 26
    .line 27
    iput-object v1, p0, La/i0p0;->Q1:La/ewi;

    .line 28
    .line 29
    iget-object v1, v0, La/gwi;->H:La/n5d0;

    .line 30
    .line 31
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/fwi;

    .line 36
    .line 37
    iput-object v1, p0, La/i0p0;->R1:La/fwi;

    .line 38
    .line 39
    iget-object v1, v0, La/gwi;->s:La/itr;

    .line 40
    .line 41
    invoke-interface {v1}, La/itr;->d()La/ujd;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, La/i0p0;->S1:La/ujd;

    .line 49
    .line 50
    iget-object v1, v0, La/gwi;->C:La/ii;

    .line 51
    .line 52
    iput-object v1, p0, La/i0p0;->U1:La/ii;

    .line 53
    .line 54
    iget-object v0, v0, La/gwi;->D:La/wdk0;

    .line 55
    .line 56
    iput-object v0, p0, La/i0p0;->V1:La/wdk0;

    .line 57
    .line 58
    return-void
.end method

.method public final G0(La/e2d;La/fet;I)V
    .locals 23

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, -0x1a3a7d62

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const/16 v1, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v1, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v0, v1

    .line 47
    :cond_3
    move v11, v0

    .line 48
    and-int/lit8 v0, v11, 0x13

    .line 49
    .line 50
    const/16 v1, 0x12

    .line 51
    .line 52
    const/4 v12, 0x1

    .line 53
    if-eq v0, v1, :cond_4

    .line 54
    .line 55
    move v0, v12

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    const/4 v0, 0x0

    .line 58
    :goto_3
    and-int/lit8 v1, v11, 0x1

    .line 59
    .line 60
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_c

    .line 65
    .line 66
    invoke-virtual {v2}, La/i0p0;->I0()La/k3t0;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v14, La/ukd;->a:La/cl5;

    .line 75
    .line 76
    if-ne v0, v14, :cond_5

    .line 77
    .line 78
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 79
    .line 80
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    move-object v15, v0

    .line 88
    check-cast v15, La/vne;

    .line 89
    .line 90
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-nez v0, :cond_7

    .line 99
    .line 100
    if-ne v1, v14, :cond_6

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    move-object v7, v2

    .line 104
    goto :goto_5

    .line 105
    :cond_7
    :goto_4
    new-instance v0, La/tfo0;

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    const/16 v7, 0x1c

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    const-class v3, La/i0p0;

    .line 112
    .line 113
    const-string v4, "handleEventsSideEffect"

    .line 114
    .line 115
    const-string v5, "handleEventsSideEffect(Lorg/xplatform/favorites/impl/presentation/teambet/presentation/events/models/TeamBetEventsSideEffect;)V"

    .line 116
    .line 117
    invoke-direct/range {v0 .. v7}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 118
    .line 119
    .line 120
    move-object v7, v2

    .line 121
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v1, v0

    .line 125
    :goto_5
    check-cast v1, La/jhy;

    .line 126
    .line 127
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 128
    .line 129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    invoke-virtual {v9, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    or-int/2addr v2, v3

    .line 140
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    or-int/2addr v2, v3

    .line 145
    const/4 v3, 0x0

    .line 146
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    or-int/2addr v2, v3

    .line 151
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-nez v2, :cond_8

    .line 156
    .line 157
    if-ne v3, v14, :cond_9

    .line 158
    .line 159
    :cond_8
    new-instance v3, La/ggc0;

    .line 160
    .line 161
    const/16 v2, 0xc

    .line 162
    .line 163
    invoke-direct {v3, v15, v13, v1, v2}, La/ggc0;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 170
    .line 171
    invoke-static {v0, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7}, La/i0p0;->I0()La/k3t0;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/i3t0;

    .line 179
    .line 180
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 185
    .line 186
    iget-object v1, v7, La/i0p0;->L1:La/a8z;

    .line 187
    .line 188
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, La/bdz;

    .line 193
    .line 194
    invoke-virtual {v7}, La/i0p0;->I0()La/k3t0;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    if-nez v4, :cond_a

    .line 207
    .line 208
    if-ne v5, v14, :cond_b

    .line 209
    .line 210
    :cond_a
    new-instance v15, La/tfo0;

    .line 211
    .line 212
    const/16 v21, 0x0

    .line 213
    .line 214
    const/16 v22, 0x1d

    .line 215
    .line 216
    const/16 v16, 0x1

    .line 217
    .line 218
    const-class v18, La/k3t0;

    .line 219
    .line 220
    const-string v19, "onAction"

    .line 221
    .line 222
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 223
    .line 224
    move-object/from16 v17, v2

    .line 225
    .line 226
    invoke-direct/range {v15 .. v22}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v9, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    move-object v5, v15

    .line 233
    :cond_b
    check-cast v5, La/jhy;

    .line 234
    .line 235
    move-object v4, v5

    .line 236
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 237
    .line 238
    shl-int/lit8 v2, v11, 0x6

    .line 239
    .line 240
    and-int/lit16 v2, v2, 0x380

    .line 241
    .line 242
    or-int/lit8 v6, v2, 0x6

    .line 243
    .line 244
    move-object v2, v8

    .line 245
    move-object v5, v9

    .line 246
    invoke-static/range {v0 .. v6}, La/cy2;->s(La/mm40;La/bdz;La/e2d;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_c
    move-object v7, v2

    .line 251
    move-object v2, v8

    .line 252
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 253
    .line 254
    .line 255
    :goto_6
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_d

    .line 260
    .line 261
    new-instance v1, La/e0p0;

    .line 262
    .line 263
    invoke-direct {v1, v7, v2, v10, v12}, La/e0p0;-><init>(La/i0p0;La/e2d;IB)V

    .line 264
    .line 265
    .line 266
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 267
    .line 268
    :cond_d
    return-void
.end method

.method public final H0(La/e2d;La/fet;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    move/from16 v8, p3

    .line 8
    .line 9
    const v1, 0x3aa0ce99

    .line 10
    .line 11
    .line 12
    invoke-virtual {v6, v1}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v1, v8, 0x6

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v6, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x2

    .line 28
    :goto_0
    or-int/2addr v1, v8

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v1, v8

    .line 31
    :goto_1
    and-int/lit8 v2, v8, 0x30

    .line 32
    .line 33
    if-nez v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {v6, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const/16 v2, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v2, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v1, v2

    .line 47
    :cond_3
    and-int/lit8 v2, v1, 0x13

    .line 48
    .line 49
    const/16 v4, 0x12

    .line 50
    .line 51
    const/4 v9, 0x0

    .line 52
    if-eq v2, v4, :cond_4

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    goto :goto_3

    .line 56
    :cond_4
    move v2, v9

    .line 57
    :goto_3
    and-int/lit8 v4, v1, 0x1

    .line 58
    .line 59
    invoke-virtual {v6, v4, v2}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_7

    .line 64
    .line 65
    iget-object v2, v0, La/i0p0;->Y1:La/a8z;

    .line 66
    .line 67
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, La/k3t0;

    .line 72
    .line 73
    check-cast v4, La/i3t0;

    .line 74
    .line 75
    invoke-virtual {v4, v6}, La/i3t0;->y(La/fet;)La/pz40;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    move v5, v1

    .line 80
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 81
    .line 82
    iget-object v7, v0, La/i0p0;->L1:La/a8z;

    .line 83
    .line 84
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    check-cast v7, La/bdz;

    .line 89
    .line 90
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    move-object v12, v2

    .line 95
    check-cast v12, La/k3t0;

    .line 96
    .line 97
    invoke-virtual {v6, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    sget-object v2, La/ukd;->a:La/cl5;

    .line 108
    .line 109
    if-ne v10, v2, :cond_6

    .line 110
    .line 111
    :cond_5
    new-instance v10, La/g0p0;

    .line 112
    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const/4 v11, 0x1

    .line 118
    const-class v13, La/k3t0;

    .line 119
    .line 120
    const-string v14, "onAction"

    .line 121
    .line 122
    const-string v15, "onAction(Ljava/lang/Object;)V"

    .line 123
    .line 124
    invoke-direct/range {v10 .. v17}, La/g0p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    check-cast v10, La/jhy;

    .line 131
    .line 132
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    shl-int/lit8 v2, v5, 0x6

    .line 135
    .line 136
    and-int/lit16 v2, v2, 0x380

    .line 137
    .line 138
    or-int/lit8 v2, v2, 0x6

    .line 139
    .line 140
    move-object v5, v7

    .line 141
    move v7, v2

    .line 142
    move-object v2, v5

    .line 143
    move-object v5, v10

    .line 144
    invoke-static/range {v1 .. v7}, La/dwi0;->C(La/mm40;La/bdz;La/e2d;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 149
    .line 150
    .line 151
    :goto_4
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-eqz v1, :cond_8

    .line 156
    .line 157
    new-instance v2, La/e0p0;

    .line 158
    .line 159
    invoke-direct {v2, v0, v3, v8, v9}, La/e0p0;-><init>(La/i0p0;La/e2d;IB)V

    .line 160
    .line 161
    .line 162
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 163
    .line 164
    :cond_8
    return-void
.end method

.method public final I0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i0p0;->X1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g0()V
    .locals 5

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/i0p0;->S1:La/ujd;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    new-instance v2, La/cq2;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/ttn0;

    .line 15
    .line 16
    const/16 v4, 0x12

    .line 17
    .line 18
    invoke-direct {v3, p0, v4}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0, v2, v3}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, La/i0p0;->V1:La/wdk0;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-boolean v1, p0, La/i0p0;->K1:Z

    .line 29
    .line 30
    invoke-static {v0, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string p0, "snackbarManager"

    .line 35
    .line 36
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :cond_1
    const-string p0, "gameCardFragmentDelegate"

    .line 41
    .line 42
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1
.end method

.method public final h0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/i0p0;->V1:La/wdk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "request_key_notification_updated"

    .line 6
    .line 7
    invoke-static {p0, v0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "snackbarManager"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/i0p0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
