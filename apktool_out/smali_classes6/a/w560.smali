.class public final La/w560;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/rg90;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/w560;",
        "La/yx5;",
        "La/rg90;",
        "<init>",
        "()V",
        "a/uuz",
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
.field public static final Q1:La/uuz;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public final M1:La/a8z;

.field public final N1:La/a8z;

.field public final O1:La/s0r;

.field public final P1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/w560;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/w560;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/uuz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/w560;->Q1:La/uuz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/y560;

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
    new-instance v1, La/u560;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/u560;-><init>(La/w560;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/w560;->M1:La/a8z;

    .line 26
    .line 27
    new-instance v0, La/u560;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p0, v1}, La/u560;-><init>(La/w560;B)V

    .line 31
    .line 32
    .line 33
    sget-object v1, La/wez;->b:La/wez;

    .line 34
    .line 35
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/w560;->N1:La/a8z;

    .line 40
    .line 41
    sget-object v0, La/v560;->a:La/v560;

    .line 42
    .line 43
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, La/w560;->O1:La/s0r;

    .line 48
    .line 49
    new-instance v0, La/u560;

    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-direct {v0, p0, v1}, La/u560;-><init>(La/w560;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/w560;->P1:La/n0o0;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance p1, La/u560;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-direct {p1, p0, v0}, La/u560;-><init>(La/w560;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "NOMA_PAY_REQUEST_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/u560;

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    invoke-direct {p1, p0, v0}, La/u560;-><init>(La/w560;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p0, p1}, La/qcc;->W(Landroidx/fragment/app/Fragment;La/clz;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, La/u560;

    .line 22
    .line 23
    const/4 v0, 0x5

    .line 24
    invoke-direct {p1, p0, v0}, La/u560;-><init>(La/w560;B)V

    .line 25
    .line 26
    .line 27
    const-string v0, "REQUEST_SHOW_PERMISSION_DENIED_DIALOG_KEY"

    .line 28
    .line 29
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, La/u560;

    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    invoke-direct {p1, p0, v1}, La/u560;-><init>(La/w560;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/w560;->P1:La/n0o0;

    .line 42
    .line 43
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/qog0;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    invoke-interface {v0, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, La/qog0;

    .line 62
    .line 63
    invoke-virtual {p0}, La/qog0;->a()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/w560;->N1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/fmi;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/y560;

    .line 12
    .line 13
    iget-object v3, v0, La/fmi;->o:La/rii;

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
    iput-object v1, p0, La/w560;->K1:La/fiu0;

    .line 23
    .line 24
    iget-object v0, v0, La/fmi;->l:La/ii;

    .line 25
    .line 26
    iput-object v0, p0, La/w560;->L1:La/ii;

    .line 27
    .line 28
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    sget-object v0, La/w560;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/w560;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/aid;

    .line 16
    .line 17
    iget-object v0, v0, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/owp0;

    .line 20
    .line 21
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/pi40;

    .line 25
    .line 26
    const/16 v3, 0x17

    .line 27
    .line 28
    invoke-direct {v2, p0, v3}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v3, -0x4b453018

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-direct {p0, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/w560;->M1:La/a8z;

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

.method public final d(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-static {p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/w560;->G0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, La/f560;->a:La/f560;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0}, La/w560;->G0()La/k3t0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, La/e560;->a:La/e560;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
