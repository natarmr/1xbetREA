.class public final La/r6r0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/r6r0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/s2m0",
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
.field public static final S1:La/s2m0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/pxi;

.field public L1:La/ujd;

.field public M1:La/wdk0;

.field public final N1:La/yzn0;

.field public final O1:La/a8z;

.field public final P1:La/s0r;

.field public final Q1:La/a8z;

.field public final R1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/r6r0;

    .line 4
    .line 5
    const-string v2, "screenType"

    .line 6
    .line 7
    const-string v3, "getScreenType()Lorg/xplatform/feed/presentation/models/TopGamesScreenType;"

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
    sput-object v1, La/r6r0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/s2m0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/r6r0;->S1:La/s2m0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/yzn0;

    .line 8
    .line 9
    const-string v1, "SCREEN_TYPE_KEY"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/r6r0;->N1:La/yzn0;

    .line 15
    .line 16
    new-instance v0, La/o6r0;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, La/o6r0;-><init>(La/r6r0;B)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/wez;->b:La/wez;

    .line 23
    .line 24
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/r6r0;->O1:La/a8z;

    .line 29
    .line 30
    sget-object v0, La/q6r0;->a:La/q6r0;

    .line 31
    .line 32
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/r6r0;->P1:La/s0r;

    .line 37
    .line 38
    const-class v0, La/g7r0;

    .line 39
    .line 40
    sget-object v1, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, La/o6r0;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-direct {v1, p0, v2}, La/o6r0;-><init>(La/r6r0;B)V

    .line 50
    .line 51
    .line 52
    const/16 v3, 0xe

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-static {p0, v0, v4, v1, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/r6r0;->Q1:La/a8z;

    .line 60
    .line 61
    iput-boolean v2, p0, La/r6r0;->R1:Z

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/r6r0;->L1:La/ujd;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v1, La/fs2;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/nop0;

    .line 12
    .line 13
    const/16 v3, 0x1a

    .line 14
    .line 15
    invoke-direct {v2, p0, v3}, La/nop0;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, La/o6r0;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-direct {p1, p0, v1}, La/o6r0;-><init>(La/r6r0;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, La/r6r0;->U1:[La/iiy;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    aget-object p1, p1, v1

    .line 34
    .line 35
    iget-object v2, p0, La/r6r0;->P1:La/s0r;

    .line 36
    .line 37
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p1, La/aid;

    .line 45
    .line 46
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 47
    .line 48
    new-instance v2, La/p6r0;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, p0, v3}, La/p6r0;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    new-instance p0, La/ugd;

    .line 55
    .line 56
    const v3, -0x1d8855fe

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, v3, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const-string p0, "composeGameCardFragmentDelegate"

    .line 67
    .line 68
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/r6r0;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/qxi;

    .line 8
    .line 9
    iget-object v1, v0, La/qxi;->s:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/pxi;

    .line 16
    .line 17
    iput-object v1, p0, La/r6r0;->K1:La/pxi;

    .line 18
    .line 19
    iget-object v1, v0, La/qxi;->j:La/itr;

    .line 20
    .line 21
    invoke-interface {v1}, La/itr;->d()La/ujd;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, La/r6r0;->L1:La/ujd;

    .line 29
    .line 30
    iget-object v0, v0, La/qxi;->r:La/wdk0;

    .line 31
    .line 32
    iput-object v0, p0, La/r6r0;->M1:La/wdk0;

    .line 33
    .line 34
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/r6r0;->Q1:La/a8z;

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

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/r6r0;->M1:La/wdk0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, La/r6r0;->R1:Z

    .line 9
    .line 10
    invoke-static {v0, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "snackbarManager"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public final h0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/r6r0;->M1:La/wdk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "request_key_notification_updated"

    .line 6
    .line 7
    invoke-static {p0, v0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "snackbarManager"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/r6r0;->R1:Z

    .line 2
    .line 3
    return p0
.end method
