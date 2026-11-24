.class public final La/vd2;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vd2;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gfk0",
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
.field public static final R1:La/gfk0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/khf0;

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/a8z;

.field public final O1:La/a8z;

.field public final P1:La/v62;

.field public final Q1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/vd2;

    .line 4
    .line 5
    const-string v2, "gamesLiveResultsParams"

    .line 6
    .line 7
    const-string v3, "getGamesLiveResultsParams()Lorg/xplatform/results/impl/presentation/alt_live_games/GamesLiveResultsParams;"

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
    sput-object v1, La/vd2;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gfk0;

    .line 33
    .line 34
    const/16 v1, 0x14

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/vd2;->R1:La/gfk0;

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
    new-instance v0, La/khf0;

    .line 8
    .line 9
    const-string v1, "KEY_GAME_RESULTS_PARAMS"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/vd2;->K1:La/khf0;

    .line 15
    .line 16
    sget-object v0, La/ud2;->a:La/ud2;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/vd2;->L1:La/s0r;

    .line 23
    .line 24
    new-instance v0, La/td2;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/td2;-><init>(La/vd2;B)V

    .line 28
    .line 29
    .line 30
    sget-object v1, La/wez;->b:La/wez;

    .line 31
    .line 32
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/vd2;->M1:La/a8z;

    .line 37
    .line 38
    const-class v0, La/le2;

    .line 39
    .line 40
    sget-object v2, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v2, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v2, La/td2;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct {v2, p0, v3}, La/td2;-><init>(La/vd2;B)V

    .line 50
    .line 51
    .line 52
    const/16 v4, 0xe

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-static {p0, v0, v5, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/vd2;->N1:La/a8z;

    .line 60
    .line 61
    new-instance v0, La/t32;

    .line 62
    .line 63
    const/4 v2, 0x4

    .line 64
    invoke-direct {v0, v2}, La/t32;-><init>(B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/vd2;->O1:La/a8z;

    .line 72
    .line 73
    new-instance v0, La/v62;

    .line 74
    .line 75
    const/4 v1, 0x2

    .line 76
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, La/vd2;->P1:La/v62;

    .line 80
    .line 81
    iput-boolean v3, p0, La/vd2;->Q1:Z

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/agd;->k()La/jg60;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, La/vd2;->P1:La/v62;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, La/jg60;->a(La/clz;La/eg60;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, La/vd2;->S1:[La/iiy;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    aget-object p1, p1, v0

    .line 22
    .line 23
    iget-object v1, p0, La/vd2;->L1:La/s0r;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast p1, La/aid;

    .line 33
    .line 34
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 35
    .line 36
    new-instance v1, La/fa2;

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    invoke-direct {v1, p0, v2}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance p0, La/ugd;

    .line 43
    .line 44
    const v2, -0x111229a0

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/vd2;->Q1:Z

    .line 2
    .line 3
    return p0
.end method
