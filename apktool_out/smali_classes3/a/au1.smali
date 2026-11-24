.class public final La/au1;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/au1;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/jdk0",
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
.field public static final Z1:La/jdk0;

.field public static final synthetic a2:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ynb;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public final O1:La/s0r;

.field public final P1:La/e9o0;

.field public final Q1:La/a8z;

.field public final R1:La/n0o0;

.field public final S1:La/r34;

.field public final U1:La/phf0;

.field public final V1:La/yzn0;

.field public final W1:La/cgx0;

.field public final X1:Z

.field public final Y1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/au1;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorTournamentFullInfoBinding;"

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
    const-string v6, "tournamentPage"

    .line 34
    .line 35
    const-string v7, "getTournamentPage()Lorg/xplatform/aggregator/api/navigation/TournamentsPage;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "openSingleGame"

    .line 43
    .line 44
    const-string v8, "getOpenSingleGame()Z"

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
    sput-object v1, La/au1;->a2:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/jdk0;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/au1;->Z1:La/jdk0;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d01ee

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/zt1;->a:La/zt1;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/au1;->O1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/e9o0;

    .line 16
    .line 17
    const v1, 0x7f040b5d

    .line 18
    .line 19
    .line 20
    const/16 v2, 0xc

    .line 21
    .line 22
    invoke-direct {v0, v1, v1, v2}, La/e9o0;-><init>(III)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/au1;->P1:La/e9o0;

    .line 26
    .line 27
    const-class v0, La/uv1;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/xt1;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, p0, v2}, La/xt1;-><init>(La/au1;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, La/au1;->Q1:La/a8z;

    .line 46
    .line 47
    new-instance v0, La/xt1;

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    invoke-direct {v0, p0, v1}, La/xt1;-><init>(La/au1;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/au1;->R1:La/n0o0;

    .line 58
    .line 59
    new-instance v0, La/r34;

    .line 60
    .line 61
    const-string v1, "TOURNAMENT_ITEM"

    .line 62
    .line 63
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, La/au1;->S1:La/r34;

    .line 67
    .line 68
    new-instance v0, La/phf0;

    .line 69
    .line 70
    const-string v1, "TOURNAMENT_TITLE"

    .line 71
    .line 72
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, La/au1;->U1:La/phf0;

    .line 76
    .line 77
    new-instance v0, La/yzn0;

    .line 78
    .line 79
    const-string v1, "TOURNAMENT_PAGE_ITEM"

    .line 80
    .line 81
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, La/au1;->V1:La/yzn0;

    .line 85
    .line 86
    new-instance v0, La/cgx0;

    .line 87
    .line 88
    const-string v1, "TOURNAMENT_SINGLE_GAME"

    .line 89
    .line 90
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, La/au1;->W1:La/cgx0;

    .line 94
    .line 95
    iput-boolean v2, p0, La/au1;->X1:Z

    .line 96
    .line 97
    iput-boolean v2, p0, La/au1;->Y1:Z

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final A0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/au1;->Y1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

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
    new-instance v1, La/yt1;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, p0, v2}, La/yt1;-><init>(La/au1;B)V

    .line 17
    .line 18
    .line 19
    const-string v3, "REQUEST_KEY_TOURNAMENT_ACTION"

    .line 20
    .line 21
    invoke-virtual {p1, v3, v0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, La/yt1;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v1, p0, v3}, La/yt1;-><init>(La/au1;B)V

    .line 40
    .line 41
    .line 42
    const-string v4, "REQUEST_KEY_CLOSE_OTHER_TOURNAMENTS_FRAGMENTS"

    .line 43
    .line 44
    invoke-virtual {p1, v4, v0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v0, La/yt1;

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    invoke-direct {v0, p0, v1}, La/yt1;-><init>(La/au1;B)V

    .line 59
    .line 60
    .line 61
    const-string v1, "REQUEST_KEY_CLOSE_GAME"

    .line 62
    .line 63
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 64
    .line 65
    .line 66
    sget-object p1, La/au1;->a2:[La/iiy;

    .line 67
    .line 68
    aget-object p1, p1, v3

    .line 69
    .line 70
    iget-object v0, p0, La/au1;->O1:La/s0r;

    .line 71
    .line 72
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    check-cast p1, La/wxq;

    .line 80
    .line 81
    iget-object p1, p1, La/wxq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 82
    .line 83
    new-instance v0, La/owp0;

    .line 84
    .line 85
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, La/o00;

    .line 89
    .line 90
    const/16 v3, 0x13

    .line 91
    .line 92
    invoke-direct {v1, p0, v3}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    new-instance p0, La/ugd;

    .line 96
    .line 97
    const v3, 0x1a0f6a71

    .line 98
    .line 99
    .line 100
    invoke-direct {p0, v3, v2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/au1;->R1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/w7i;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/uv1;

    .line 12
    .line 13
    iget-object v3, v0, La/w7i;->C:La/f7i;

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, La/au1;->K1:La/fiu0;

    .line 23
    .line 24
    iget-object v1, v0, La/w7i;->y:La/peg0;

    .line 25
    .line 26
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, La/yzn0;

    .line 29
    .line 30
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, La/au1;->L1:La/ynb;

    .line 38
    .line 39
    iget-object v1, v0, La/w7i;->z:La/ii;

    .line 40
    .line 41
    iput-object v1, p0, La/au1;->M1:La/ii;

    .line 42
    .line 43
    iget-object v0, v0, La/w7i;->A:La/wdk0;

    .line 44
    .line 45
    iput-object v0, p0, La/au1;->N1:La/wdk0;

    .line 46
    .line 47
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/au1;->Q1:La/a8z;

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

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/xt1;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, p0, v0}, La/xt1;-><init>(La/au1;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/au1;->X1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/au1;->P1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
