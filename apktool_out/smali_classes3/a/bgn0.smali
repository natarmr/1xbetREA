.class public final La/bgn0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/bgn0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/j6m0",
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
.field public static final q2:La/j6m0;

.field public static final synthetic r2:[La/iiy;

.field public static final s2:Ljava/lang/String;


# instance fields
.field public final k2:La/khf0;

.field public final l2:La/khf0;

.field public final m2:La/yzn0;

.field public final n2:La/yzn0;

.field public final o2:La/a8z;

.field public final p2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/bgn0;

    .line 4
    .line 5
    const-string v2, "successBetStringModel"

    .line 6
    .line 7
    const-string v3, "getSuccessBetStringModel()Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "successBetAlertModel"

    .line 16
    .line 17
    const-string v5, "getSuccessBetAlertModel()Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "betDoneIconStyle"

    .line 25
    .line 26
    const-string v6, "getBetDoneIconStyle()Lorg/xplatform/remoteconfig/domain/models/BetDoneIconStyle;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "betDoneScreenStyle"

    .line 34
    .line 35
    const-string v7, "getBetDoneScreenStyle()Lorg/xplatform/remoteconfig/domain/models/BetDoneScreenStyle;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    new-array v6, v6, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v6, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v6, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v6, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v6, v0

    .line 53
    .line 54
    sput-object v6, La/bgn0;->r2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/j6m0;

    .line 57
    .line 58
    const/4 v2, 0x5

    .line 59
    invoke-direct {v0, v2}, La/j6m0;-><init>(B)V

    .line 60
    .line 61
    .line 62
    sput-object v0, La/bgn0;->q2:La/j6m0;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, La/bgn0;->s2:Ljava/lang/String;

    .line 69
    .line 70
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "SUCCESS_BET_STRING_MODEL"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/bgn0;->k2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/khf0;

    .line 14
    .line 15
    const-string v1, "SUCCESS_BET_ALERT_MODEL"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/bgn0;->l2:La/khf0;

    .line 21
    .line 22
    new-instance v0, La/yzn0;

    .line 23
    .line 24
    const-string v1, "BET_DONE_ICON_STYLE"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/bgn0;->m2:La/yzn0;

    .line 30
    .line 31
    new-instance v0, La/yzn0;

    .line 32
    .line 33
    const-string v1, "BET_DONE_SCREEN_STYLE"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/bgn0;->n2:La/yzn0;

    .line 39
    .line 40
    new-instance v0, La/zfn0;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p0, v1}, La/zfn0;-><init>(La/bgn0;B)V

    .line 44
    .line 45
    .line 46
    sget-object v1, La/wez;->b:La/wez;

    .line 47
    .line 48
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/bgn0;->o2:La/a8z;

    .line 53
    .line 54
    const-class v0, La/sgn0;

    .line 55
    .line 56
    sget-object v1, La/sre0;->a:La/tre0;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, La/zfn0;

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-direct {v1, p0, v2}, La/zfn0;-><init>(La/bgn0;B)V

    .line 66
    .line 67
    .line 68
    const/16 v2, 0xe

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/bgn0;->p2:La/a8z;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, 0x2a08fef0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, La/bgn0;->r2:[La/iiy;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aget-object v4, v2, v3

    .line 15
    .line 16
    iget-object v5, v0, La/bgn0;->k2:La/khf0;

    .line 17
    .line 18
    invoke-virtual {v5, v0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 23
    .line 24
    iget-object v5, v0, La/bgn0;->l2:La/khf0;

    .line 25
    .line 26
    const/4 v6, 0x1

    .line 27
    aget-object v7, v2, v6

    .line 28
    .line 29
    invoke-virtual {v5, v0, v7}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 34
    .line 35
    const/4 v7, 0x3

    .line 36
    aget-object v2, v2, v7

    .line 37
    .line 38
    iget-object v8, v0, La/bgn0;->n2:La/yzn0;

    .line 39
    .line 40
    invoke-virtual {v8, v0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, La/bu6;

    .line 45
    .line 46
    invoke-static {v4, v5, v2, v1}, La/k9x;->O(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;La/bu6;La/fet;)La/qgn0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0}, La/bgn0;->P0()La/k3t0;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v8, La/ukd;->a:La/cl5;

    .line 63
    .line 64
    if-nez v4, :cond_0

    .line 65
    .line 66
    if-ne v5, v8, :cond_1

    .line 67
    .line 68
    :cond_0
    new-instance v5, La/j1l0;

    .line 69
    .line 70
    const/16 v4, 0x18

    .line 71
    .line 72
    invoke-direct {v5, v0, v4}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    sget-object v4, La/or00;->a:La/zfn;

    .line 81
    .line 82
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    move-object v10, v4

    .line 87
    check-cast v10, La/clz;

    .line 88
    .line 89
    sget-object v4, La/lkz;->a:La/lkz;

    .line 90
    .line 91
    invoke-static {v5, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-virtual {v1, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    or-int/2addr v4, v5

    .line 104
    invoke-virtual {v1, v7}, La/fet;->e(I)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    or-int/2addr v4, v5

    .line 109
    invoke-virtual {v1, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    or-int/2addr v4, v5

    .line 114
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    if-nez v4, :cond_2

    .line 119
    .line 120
    if-ne v5, v8, :cond_3

    .line 121
    .line 122
    :cond_2
    new-instance v8, La/kc70;

    .line 123
    .line 124
    const/4 v12, 0x0

    .line 125
    const/16 v13, 0x13

    .line 126
    .line 127
    invoke-direct/range {v8 .. v13}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object v5, v8

    .line 134
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 135
    .line 136
    invoke-static {v1, v10, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    new-instance v11, La/bw5;

    .line 140
    .line 141
    invoke-static {v6, v1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    new-instance v4, La/nhl0;

    .line 146
    .line 147
    const/16 v5, 0xc

    .line 148
    .line 149
    invoke-direct {v4, v0, v2, v5}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    const v0, -0x1d999661

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v4, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 156
    .line 157
    .line 158
    move-result-object v15

    .line 159
    const/16 v16, 0xe

    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    const/4 v14, 0x0

    .line 163
    invoke-direct/range {v11 .. v16}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 167
    .line 168
    .line 169
    return-object v11
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bgn0;->p2:La/a8z;

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

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/bgn0;->P0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object p1, La/pfn0;->a:La/pfn0;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
