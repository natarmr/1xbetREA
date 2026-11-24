.class public final La/a6s0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/a6s0;",
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
.field public static final S1:La/j6m0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public final N1:La/r34;

.field public final O1:La/phf0;

.field public final P1:La/r34;

.field public final Q1:Z

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/a6s0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/AggregatorTournamentStagePrizesFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "tournamentId"

    .line 16
    .line 17
    const-string v5, "getTournamentId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "tournamentTitle"

    .line 25
    .line 26
    const-string v6, "getTournamentTitle()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "stageTournamentID"

    .line 34
    .line 35
    const-string v7, "getStageTournamentID()J"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/a6s0;->U1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/j6m0;

    .line 57
    .line 58
    const/16 v1, 0x1a

    .line 59
    .line 60
    invoke-direct {v0, v1}, La/j6m0;-><init>(B)V

    .line 61
    .line 62
    .line 63
    sput-object v0, La/a6s0;->S1:La/j6m0;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d002c

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/z5s0;->a:La/z5s0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/a6s0;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/r34;

    .line 16
    .line 17
    const-string v1, "PRIZE_TOURNAMENT_ITEM"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/a6s0;->N1:La/r34;

    .line 23
    .line 24
    new-instance v0, La/phf0;

    .line 25
    .line 26
    const-string v1, "PRIZE_TOURNAMENT_TITLE"

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/a6s0;->O1:La/phf0;

    .line 32
    .line 33
    new-instance v0, La/r34;

    .line 34
    .line 35
    const-string v1, "PRIZE_STAGE_TOURNAMENT_ID"

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/a6s0;->P1:La/r34;

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, La/a6s0;->Q1:Z

    .line 44
    .line 45
    const-class v0, La/n6s0;

    .line 46
    .line 47
    sget-object v1, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, La/qir0;

    .line 54
    .line 55
    const/16 v2, 0xb

    .line 56
    .line 57
    invoke-direct {v1, p0, v2}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/a6s0;->R1:La/a8z;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/a6s0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/a6s0;->K1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/yw1;

    .line 16
    .line 17
    iget-object p1, p1, La/yw1;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, La/owp0;-><init>(La/clz;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, La/iob0;

    .line 29
    .line 30
    const/16 v2, 0xc

    .line 31
    .line 32
    invoke-direct {v1, p0, v2}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/ugd;

    .line 36
    .line 37
    const v2, -0xa8fb382

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/p3s0;

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
    instance-of v3, v0, La/p3s0;

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
    check-cast v2, La/p3s0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    sget-object v1, La/a6s0;->U1:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/a6s0;->N1:La/r34;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    const/4 v0, 0x2

    .line 71
    aget-object v0, v1, v0

    .line 72
    .line 73
    iget-object v1, p0, La/a6s0;->O1:La/phf0;

    .line 74
    .line 75
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2, v3, v4, v0}, La/p3s0;->a(JLjava/lang/String;)La/cr;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, La/cr;->i()La/fiu0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, La/a6s0;->L1:La/fiu0;

    .line 88
    .line 89
    iget-object v0, v0, La/cr;->p:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, La/ii;

    .line 92
    .line 93
    iput-object v0, p0, La/a6s0;->M1:La/ii;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 97
    .line 98
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/a6s0;->R1:La/a8z;

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

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/a6s0;->G0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance p2, La/t5s0;

    .line 12
    .line 13
    sget-object v0, La/a6s0;->U1:[La/iiy;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    aget-object v0, v0, v1

    .line 17
    .line 18
    iget-object v1, p0, La/a6s0;->P1:La/r34;

    .line 19
    .line 20
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    invoke-direct {p2, v0, v1}, La/t5s0;-><init>(J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance v0, La/b0l0;

    .line 47
    .line 48
    const/16 v1, 0x17

    .line 49
    .line 50
    invoke-direct {v0, p0, v1}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    const-string p0, "REQUEST_KEY_TOURNAMENT_ACTION"

    .line 54
    .line 55
    invoke-virtual {p1, p0, p2, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/a6s0;->Q1:Z

    .line 2
    .line 3
    return p0
.end method
