.class public final La/n7g0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/n7g0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/cge0",
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
.field public static final p2:La/cge0;

.field public static final synthetic q2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/phf0;

.field public final m2:La/r34;

.field public final n2:La/phf0;

.field public final o2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/n7g0;

    .line 4
    .line 5
    const-string v2, "gameId"

    .line 6
    .line 7
    const-string v3, "getGameId()Ljava/lang/String;"

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
    const-string v3, "sportId"

    .line 16
    .line 17
    const-string v5, "getSportId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "teamId"

    .line 25
    .line 26
    const-string v6, "getTeamId()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/statistic/stat_results/impl/databinding/BottomsheetResultsGridNavigationBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/n7g0;->q2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/cge0;

    .line 57
    .line 58
    const/16 v1, 0x9

    .line 59
    .line 60
    invoke-direct {v0, v1}, La/cge0;-><init>(B)V

    .line 61
    .line 62
    .line 63
    sput-object v0, La/n7g0;->p2:La/cge0;

    .line 64
    .line 65
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
    const-string v1, "GAME_ID"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/n7g0;->l2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/r34;

    .line 14
    .line 15
    const-string v1, "SPORT_ID"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/n7g0;->m2:La/r34;

    .line 21
    .line 22
    new-instance v0, La/phf0;

    .line 23
    .line 24
    const-string v1, "TEAM_ID"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/n7g0;->n2:La/phf0;

    .line 30
    .line 31
    sget-object v0, La/m7g0;->a:La/m7g0;

    .line 32
    .line 33
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 34
    .line 35
    .line 36
    const-class v0, La/o7g0;

    .line 37
    .line 38
    sget-object v1, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/a7g0;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {v1, p0, v2}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/n7g0;->o2:La/a8z;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 7

    .line 1
    const v0, -0x7769fb3

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/n7g0;->o2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/k3t0;

    .line 14
    .line 15
    check-cast v0, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/b5g0;

    .line 26
    .line 27
    new-instance v1, La/bw5;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-static {v2, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sget-object v3, La/vbw0;->d:La/ugd;

    .line 35
    .line 36
    new-instance v4, La/in80;

    .line 37
    .line 38
    const/16 v5, 0x11

    .line 39
    .line 40
    invoke-direct {v4, v0, p0, v5}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    const p0, 0x11c560be

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const/16 v6, 0xa

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 58
    .line 59
    .line 60
    return-object v1
.end method

.method public final V(Landroid/content/Context;)V
    .locals 8

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
    const-class v0, La/v6g0;

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
    instance-of v2, p1, La/v6g0;

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
    move-object v2, v1

    .line 55
    check-cast v2, La/v6g0;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    sget-object v0, La/n7g0;->q2:[La/iiy;

    .line 61
    .line 62
    aget-object p1, v0, p1

    .line 63
    .line 64
    iget-object v1, p0, La/n7g0;->l2:La/phf0;

    .line 65
    .line 66
    invoke-virtual {v1, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const/4 p1, 0x1

    .line 71
    aget-object p1, v0, p1

    .line 72
    .line 73
    iget-object v1, p0, La/n7g0;->m2:La/r34;

    .line 74
    .line 75
    invoke-virtual {v1, p0, p1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    const/4 p1, 0x2

    .line 84
    aget-object p1, v0, p1

    .line 85
    .line 86
    iget-object v0, p0, La/n7g0;->n2:La/phf0;

    .line 87
    .line 88
    invoke-virtual {v0, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual/range {v2 .. v7}, La/v6g0;->a(JLa/i1w0;Ljava/lang/String;Ljava/lang/String;)La/v5i;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, La/v5i;->o()La/fiu0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, La/n7g0;->k2:La/fiu0;

    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 108
    .line 109
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
