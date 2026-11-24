.class public final La/on1;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/on1;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/hfk0",
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
.field public static final S1:La/hfk0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/p7i;

.field public L1:La/wdk0;

.field public M1:La/ynb;

.field public N1:La/ii;

.field public final O1:La/phf0;

.field public final P1:La/s0r;

.field public final Q1:La/n0o0;

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/on1;

    .line 4
    .line 5
    const-string v2, "bundleSearchScreenTypeValue"

    .line 6
    .line 7
    const-string v3, "getBundleSearchScreenTypeValue()Ljava/lang/String;"

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
    const-string v3, "viewBinding"

    .line 16
    .line 17
    const-string v5, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/on1;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/hfk0;

    .line 33
    .line 34
    const/16 v1, 0x12

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/hfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/on1;->S1:La/hfk0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d01ed

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/phf0;

    .line 8
    .line 9
    const-string v1, "SEARCH_SCREEN_TYPE"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/on1;->O1:La/phf0;

    .line 15
    .line 16
    sget-object v0, La/nn1;->a:La/nn1;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/on1;->P1:La/s0r;

    .line 23
    .line 24
    new-instance v0, La/jn1;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/jn1;-><init>(La/on1;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/on1;->Q1:La/n0o0;

    .line 35
    .line 36
    const-class v0, La/dp1;

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
    new-instance v1, La/jn1;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {v1, p0, v2}, La/jn1;-><init>(La/on1;B)V

    .line 48
    .line 49
    .line 50
    const/16 v2, 0xe

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/on1;->R1:La/a8z;

    .line 58
    .line 59
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
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, La/gne;

    .line 10
    .line 11
    const/4 v1, 0x7

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
    new-instance p1, La/jn1;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p1, p0, v0}, La/jn1;-><init>(La/on1;B)V

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
    sget-object p1, La/on1;->U1:[La/iiy;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    aget-object p1, p1, v0

    .line 35
    .line 36
    iget-object v1, p0, La/on1;->P1:La/s0r;

    .line 37
    .line 38
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast p1, La/aid;

    .line 46
    .line 47
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 48
    .line 49
    new-instance v1, La/o00;

    .line 50
    .line 51
    const/16 v2, 0x12

    .line 52
    .line 53
    invoke-direct {v1, p0, v2}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    new-instance p0, La/ugd;

    .line 57
    .line 58
    const v2, -0x3fe65c83

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/on1;->Q1:La/n0o0;

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
    iget-object v1, v0, La/q7i;->k0:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/p7i;

    .line 16
    .line 17
    iput-object v1, p0, La/on1;->K1:La/p7i;

    .line 18
    .line 19
    iget-object v1, v0, La/q7i;->c0:La/wdk0;

    .line 20
    .line 21
    iput-object v1, p0, La/on1;->L1:La/wdk0;

    .line 22
    .line 23
    iget-object v1, v0, La/q7i;->b0:La/peg0;

    .line 24
    .line 25
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, La/yzn0;

    .line 28
    .line 29
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/on1;->M1:La/ynb;

    .line 37
    .line 38
    iget-object v0, v0, La/q7i;->a0:La/ii;

    .line 39
    .line 40
    iput-object v0, p0, La/on1;->N1:La/ii;

    .line 41
    .line 42
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/on1;->R1:La/a8z;

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

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/hxm0;->m(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/hxm0;->n(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
