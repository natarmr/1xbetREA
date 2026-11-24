.class public final La/dm0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dm0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/pek0",
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
.field public static final S1:La/pek0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ynb;

.field public M1:La/wdk0;

.field public N1:La/ii;

.field public final O1:La/a8z;

.field public final P1:La/s0r;

.field public final Q1:La/yzn0;

.field public final R1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dm0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorFavoritesBinding;"

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
    const-string v3, "favoriteType"

    .line 16
    .line 17
    const-string v5, "getFavoriteType()Lorg/xplatform/aggregator/api/navigation/FavoriteType;"

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
    sput-object v1, La/dm0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/pek0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/dm0;->S1:La/pek0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d01e5

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/qo0;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/bm0;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/bm0;-><init>(La/dm0;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/dm0;->O1:La/a8z;

    .line 26
    .line 27
    sget-object v0, La/cm0;->a:La/cm0;

    .line 28
    .line 29
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/dm0;->P1:La/s0r;

    .line 34
    .line 35
    new-instance v0, La/yzn0;

    .line 36
    .line 37
    const-string v1, "FAVORITE_TYPE"

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/dm0;->Q1:La/yzn0;

    .line 43
    .line 44
    new-instance v0, La/bm0;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, v1}, La/bm0;-><init>(La/dm0;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/dm0;->R1:La/n0o0;

    .line 55
    .line 56
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
    new-instance v0, La/gne;

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-direct {v0, p0, v1}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "REQUEST_KEY_CLOSE_GAME"

    .line 16
    .line 17
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, La/bm0;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p1, p0, v0}, La/bm0;-><init>(La/dm0;B)V

    .line 24
    .line 25
    .line 26
    const-string v0, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY"

    .line 27
    .line 28
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, La/dm0;->U1:[La/iiy;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    aget-object p1, p1, v0

    .line 35
    .line 36
    iget-object v0, p0, La/dm0;->P1:La/s0r;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast p1, La/qxq;

    .line 46
    .line 47
    iget-object p1, p1, La/qxq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 48
    .line 49
    new-instance v0, La/owp0;

    .line 50
    .line 51
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 52
    .line 53
    .line 54
    new-instance v1, La/tx;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-direct {v1, p0, v2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    new-instance p0, La/ugd;

    .line 61
    .line 62
    const v3, 0x4e3c5504    # 7.8992205E8f

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, v3, v2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/dm0;->R1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/q7i;

    .line 8
    .line 9
    invoke-virtual {v0}, La/q7i;->c()La/fiu0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, La/dm0;->K1:La/fiu0;

    .line 14
    .line 15
    iget-object v1, v0, La/q7i;->b0:La/peg0;

    .line 16
    .line 17
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/yzn0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, La/dm0;->L1:La/ynb;

    .line 29
    .line 30
    iget-object v1, v0, La/q7i;->c0:La/wdk0;

    .line 31
    .line 32
    iput-object v1, p0, La/dm0;->M1:La/wdk0;

    .line 33
    .line 34
    iget-object v0, v0, La/q7i;->a0:La/ii;

    .line 35
    .line 36
    iput-object v0, p0, La/dm0;->N1:La/ii;

    .line 37
    .line 38
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dm0;->O1:La/a8z;

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

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
