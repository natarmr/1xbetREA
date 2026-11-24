.class public final La/qg30;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/qg30;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/evz",
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
.field public static final o2:La/evz;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/a8z;

.field public final m2:La/phf0;

.field public final n2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/qg30;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

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
    const-string v3, "playerId"

    .line 16
    .line 17
    const-string v5, "getPlayerId()Ljava/lang/String;"

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
    sput-object v1, La/qg30;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/evz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/qg30;->o2:La/evz;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/rg30;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/rx00;

    .line 13
    .line 14
    const/16 v2, 0x1b

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, La/rx00;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/qg30;->l2:La/a8z;

    .line 24
    .line 25
    new-instance v0, La/phf0;

    .line 26
    .line 27
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/qg30;->m2:La/phf0;

    .line 33
    .line 34
    new-instance v0, La/phf0;

    .line 35
    .line 36
    const-string v1, "PLAYER_ID_BUNDLE_KEY"

    .line 37
    .line 38
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/qg30;->n2:La/phf0;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const v0, -0x35f4eaba    # -2278737.5f

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    iget-object v9, v2, La/qg30;->l2:La/a8z;

    .line 12
    .line 13
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v10, v0

    .line 18
    check-cast v10, La/k3t0;

    .line 19
    .line 20
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v11, La/ukd;->a:La/cl5;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    if-ne v1, v11, :cond_1

    .line 33
    .line 34
    :cond_0
    new-instance v0, La/du20;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/16 v7, 0x1a

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    const-class v3, La/qg30;

    .line 41
    .line 42
    const-string v4, "handleSideEffects"

    .line 43
    .line 44
    const-string v5, "handleSideEffects(Lorg/xplatform/statistic/tennis/impl/wins_and_losses/presentation/actual/match_types/MatchTypesSideEffect;)V"

    .line 45
    .line 46
    invoke-direct/range {v0 .. v7}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v1, v0

    .line 53
    :cond_1
    check-cast v1, La/jhy;

    .line 54
    .line 55
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    sget-object v0, La/lkz;->a:La/lkz;

    .line 58
    .line 59
    invoke-static {v1, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v8, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    or-int/2addr v1, v3

    .line 72
    const/4 v3, 0x3

    .line 73
    invoke-virtual {v8, v3}, La/fet;->e(I)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    or-int/2addr v1, v3

    .line 78
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    or-int/2addr v1, v3

    .line 83
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-nez v1, :cond_2

    .line 88
    .line 89
    if-ne v3, v11, :cond_3

    .line 90
    .line 91
    :cond_2
    new-instance v3, La/khx;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    invoke-direct {v3, v10, v2, v0, v1}, La/khx;-><init>(La/k3t0;La/qg30;La/pz40;La/yje;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 101
    .line 102
    invoke-static {v8, v2, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/k3t0;

    .line 110
    .line 111
    check-cast v0, La/i3t0;

    .line 112
    .line 113
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v1, La/bw5;

    .line 118
    .line 119
    const/4 v3, 0x1

    .line 120
    invoke-static {v3, v8}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    const-wide/16 v14, 0x0

    .line 125
    .line 126
    const/16 v16, 0x3b

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v11, 0x1

    .line 130
    const/4 v12, 0x0

    .line 131
    const/4 v13, 0x0

    .line 132
    invoke-static/range {v9 .. v16}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    move-object v4, v3

    .line 137
    sget-object v3, La/q8a;->d:La/ugd;

    .line 138
    .line 139
    new-instance v5, La/ngz;

    .line 140
    .line 141
    const/16 v6, 0x12

    .line 142
    .line 143
    invoke-direct {v5, v0, v2, v6}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    const v0, -0x27b0dd0b

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v5, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    const/16 v6, 0xa

    .line 154
    .line 155
    move-object v2, v4

    .line 156
    const/4 v4, 0x0

    .line 157
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 158
    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    invoke-virtual {v8, v0}, La/fet;->r(Z)V

    .line 162
    .line 163
    .line 164
    return-object v1
.end method

.method public final V(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, La/d0q0;->a:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    sget-object p1, La/qg30;->p2:[La/iiy;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    aget-object v1, p1, v0

    .line 10
    .line 11
    iget-object v2, p0, La/qg30;->n2:La/phf0;

    .line 12
    .line 13
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v1, v3}, La/d0q0;->a(Ljava/lang/String;La/cb50;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    aget-object p1, p1, v0

    .line 26
    .line 27
    invoke-virtual {v2, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v1, p0, p1, v0}, La/d0q0;->b(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;La/i1w0;)La/xwi;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, La/xwi;->a()La/fiu0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/qg30;->k2:La/fiu0;

    .line 44
    .line 45
    return-void
.end method
