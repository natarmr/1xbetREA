.class public final La/ajp0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ajp0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/s9m0",
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
.field public static final r2:La/s9m0;

.field public static final synthetic s2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/phf0;

.field public final m2:La/phf0;

.field public final n2:La/zz2;

.field public final o2:La/zz2;

.field public final p2:La/es;

.field public final q2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ajp0;

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
    const-string v3, "title"

    .line 16
    .line 17
    const-string v5, "getTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "gameId"

    .line 25
    .line 26
    const-string v6, "getGameId()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "playerId"

    .line 34
    .line 35
    const-string v7, "getPlayerId()I"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "teamValuesIds"

    .line 43
    .line 44
    const-string v8, "getTeamValuesIds()Ljava/util/List;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/ajp0;->s2:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/s9m0;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/ajp0;->r2:La/s9m0;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/ajp0;->l2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "EXTRA_TITLE"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/ajp0;->m2:La/phf0;

    .line 21
    .line 22
    new-instance v0, La/zz2;

    .line 23
    .line 24
    const-string v1, "EXTRA_GAME_ID"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/ajp0;->n2:La/zz2;

    .line 30
    .line 31
    new-instance v0, La/zz2;

    .line 32
    .line 33
    const-string v1, "EXTRA_PLAYER_ID"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/ajp0;->o2:La/zz2;

    .line 39
    .line 40
    new-instance v0, La/es;

    .line 41
    .line 42
    const-string v1, "EXTRA_ITEMS"

    .line 43
    .line 44
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/ajp0;->p2:La/es;

    .line 48
    .line 49
    const-class v0, La/hjp0;

    .line 50
    .line 51
    sget-object v1, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v1, La/nxo0;

    .line 58
    .line 59
    const/16 v2, 0xd

    .line 60
    .line 61
    invoke-direct {v1, p0, v2}, La/nxo0;-><init>(Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/ajp0;->q2:La/a8z;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, 0x4d5275ac    # 2.2068294E8f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/ajp0;->q2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/k3t0;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, La/ukd;->a:La/cl5;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    if-ne v3, v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v7, p0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    new-instance v5, La/g0p0;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/16 v12, 0xc

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const-class v8, La/ajp0;

    .line 39
    .line 40
    const-string v9, "handleSideEffect"

    .line 41
    .line 42
    const-string v10, "handleSideEffect(Lorg/xplatform/bet_constructor/impl/team_selector/presentation/models/TeamSelectorBottomSheetSideEffect;)V"

    .line 43
    .line 44
    move-object v7, p0

    .line 45
    invoke-direct/range {v5 .. v12}, La/g0p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v5

    .line 52
    :goto_1
    check-cast v3, La/jhy;

    .line 53
    .line 54
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 55
    .line 56
    sget-object p0, La/lkz;->a:La/lkz;

    .line 57
    .line 58
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {p1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    or-int/2addr v2, v3

    .line 71
    const/4 v3, 0x3

    .line 72
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    or-int/2addr v2, v3

    .line 77
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    or-int/2addr v2, v3

    .line 82
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    if-ne v3, v4, :cond_3

    .line 89
    .line 90
    :cond_2
    new-instance v3, La/qkb0;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-direct {v3, v1, v7, p0, v2}, La/qkb0;-><init>(La/k3t0;La/ajp0;La/pz40;La/yje;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 100
    .line 101
    invoke-static {p1, v7, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/k3t0;

    .line 109
    .line 110
    check-cast p0, La/i3t0;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, La/gjp0;

    .line 121
    .line 122
    new-instance v0, La/bw5;

    .line 123
    .line 124
    const/4 v1, 0x1

    .line 125
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    new-instance v2, La/gcn0;

    .line 130
    .line 131
    const/16 v3, 0x8

    .line 132
    .line 133
    invoke-direct {v2, v7, v3}, La/gcn0;-><init>(Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    const v3, 0x5893865d

    .line 137
    .line 138
    .line 139
    invoke-static {v3, v2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    new-instance v3, La/nhl0;

    .line 144
    .line 145
    const/16 v4, 0x12

    .line 146
    .line 147
    invoke-direct {v3, p0, v7, v4}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    const p0, -0x1e5a60e5

    .line 151
    .line 152
    .line 153
    invoke-static {p0, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    const/16 v5, 0xa

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-direct/range {v0 .. v5}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 161
    .line 162
    .line 163
    const/4 p0, 0x0

    .line 164
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 165
    .line 166
    .line 167
    return-object v0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/jjp0;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/jjp0;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/jjp0;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget-object v0, La/ajp0;->s2:[La/iiy;

    .line 63
    .line 64
    const/4 v2, 0x4

    .line 65
    aget-object v0, v0, v2

    .line 66
    .line 67
    iget-object v2, p0, La/ajp0;->p2:La/es;

    .line 68
    .line 69
    invoke-virtual {v2, p0, v0}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p1, v1, La/jjp0;->a:La/cad;

    .line 77
    .line 78
    iget-object v1, v1, La/jjp0;->b:La/ctf0;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v2, La/kki;

    .line 84
    .line 85
    invoke-direct {v2, p1, v0, v1}, La/kki;-><init>(La/cad;Ljava/util/List;La/ctf0;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, La/kki;->A()La/fiu0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, La/ajp0;->k2:La/fiu0;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 96
    .line 97
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method
