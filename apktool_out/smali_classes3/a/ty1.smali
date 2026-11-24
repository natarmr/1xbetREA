.class public final La/ty1;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ty1;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/rek0",
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
.field public static final R1:La/rek0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/r34;

.field public L1:La/fiu0;

.field public M1:La/ynb;

.field public N1:La/ii;

.field public final O1:La/a8z;

.field public final P1:La/s0r;

.field public final Q1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ty1;

    .line 4
    .line 5
    const-string v2, "bannerIdToOpen"

    .line 6
    .line 7
    const-string v3, "getBannerIdToOpen()J"

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
    const-string v5, "getBinding()Lorg/xplatform/aggregator/impl/databinding/AggregatorTournamentsFragmentBinding;"

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
    sput-object v1, La/ty1;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/rek0;

    .line 33
    .line 34
    const/16 v1, 0x13

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/rek0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/ty1;->R1:La/rek0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d002d

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/r34;

    .line 8
    .line 9
    const-string v1, "BANNER_ITEM"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/ty1;->K1:La/r34;

    .line 15
    .line 16
    const-class v0, La/wz1;

    .line 17
    .line 18
    sget-object v1, La/sre0;->a:La/tre0;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, La/nc;

    .line 25
    .line 26
    const/16 v2, 0x1b

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/ty1;->O1:La/a8z;

    .line 36
    .line 37
    sget-object v0, La/sy1;->a:La/sy1;

    .line 38
    .line 39
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/ty1;->P1:La/s0r;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, La/ty1;->Q1:Z

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

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
    new-instance v1, La/gne;

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    const-string v2, "REQUEST_KEY_TOURNAMENT_ACTION"

    .line 21
    .line 22
    invoke-virtual {p1, v2, v0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, La/ty1;->S1:[La/iiy;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aget-object p1, p1, v0

    .line 29
    .line 30
    iget-object v1, p0, La/ty1;->P1:La/s0r;

    .line 31
    .line 32
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast p1, La/uy1;

    .line 40
    .line 41
    iget-object p1, p1, La/uy1;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 42
    .line 43
    new-instance v1, La/owp0;

    .line 44
    .line 45
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, La/o00;

    .line 49
    .line 50
    const/16 v3, 0x18

    .line 51
    .line 52
    invoke-direct {v2, p0, v3}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance p0, La/ugd;

    .line 56
    .line 57
    const v3, -0x4907ad65

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v1, v0, La/v51;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, La/v51;

    .line 10
    .line 11
    iget-object v0, v0, La/v51;->V1:La/n0o0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/q7i;

    .line 18
    .line 19
    invoke-virtual {v0}, La/q7i;->c()La/fiu0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, La/ty1;->L1:La/fiu0;

    .line 24
    .line 25
    iget-object v1, v0, La/q7i;->b0:La/peg0;

    .line 26
    .line 27
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, La/yzn0;

    .line 30
    .line 31
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, La/ty1;->M1:La/ynb;

    .line 39
    .line 40
    iget-object v0, v0, La/q7i;->a0:La/ii;

    .line 41
    .line 42
    iput-object v0, p0, La/ty1;->N1:La/ii;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string p0, "Can\'t find AggregatorComponentHolder"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ty1;->O1:La/a8z;

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

.method public final e0()V
    .locals 10

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ty1;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/wx1;->a:La/wx1;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, La/ty1;->S1:[La/iiy;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    aget-object v2, v0, v1

    .line 17
    .line 18
    iget-object v3, p0, La/ty1;->K1:La/r34;

    .line 19
    .line 20
    invoke-virtual {v3, p0, v2}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    cmp-long v2, v4, v6

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, La/ty1;->G0()La/k3t0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v4, La/ay1;

    .line 39
    .line 40
    aget-object v5, v0, v1

    .line 41
    .line 42
    invoke-virtual {v3, p0, v5}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v8

    .line 50
    invoke-direct {v4, v8, v9}, La/ay1;-><init>(J)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v4}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    aget-object v0, v0, v1

    .line 57
    .line 58
    invoke-virtual {v3, p0, v0, v6, v7}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/ty1;->G0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, La/vx1;->a:La/vx1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ty1;->Q1:Z

    .line 2
    .line 3
    return p0
.end method
