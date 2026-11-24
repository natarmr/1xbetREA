.class public final La/bz30;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/bz30;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wsz",
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
.field public static final P1:La/wsz;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/yzn0;

.field public final L1:La/a8z;

.field public final M1:La/s0r;

.field public final N1:La/a8z;

.field public final O1:La/hnm0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/bz30;

    .line 4
    .line 5
    const-string v2, "settings"

    .line 6
    .line 7
    const-string v3, "getSettings()Lorg/xplatform/main_menu/api/presentation/models/MenuScreenSettings;"

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
    sput-object v1, La/bz30;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/wsz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/bz30;->P1:La/wsz;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 4

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
    const-string v1, "MENU_SETTINGS_KEY"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/bz30;->K1:La/yzn0;

    .line 15
    .line 16
    new-instance v0, La/yy30;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, La/yy30;-><init>(La/bz30;B)V

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
    iput-object v0, p0, La/bz30;->L1:La/a8z;

    .line 29
    .line 30
    sget-object v0, La/az30;->a:La/az30;

    .line 31
    .line 32
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/bz30;->M1:La/s0r;

    .line 37
    .line 38
    const-class v0, La/j340;

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
    new-instance v1, La/yy30;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-direct {v1, p0, v2}, La/yy30;-><init>(La/bz30;B)V

    .line 50
    .line 51
    .line 52
    const/16 v2, 0xe

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/bz30;->N1:La/a8z;

    .line 60
    .line 61
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 62
    .line 63
    iput-object v0, p0, La/bz30;->O1:La/hnm0;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/bz30;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/bz30;->M1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/b120;

    .line 20
    .line 21
    const/16 v2, 0x14

    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, La/b120;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v2, -0xc88495a

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final G0()La/pli;
    .locals 0

    .line 1
    iget-object p0, p0, La/bz30;->L1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pli;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bz30;->N1:La/a8z;

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
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/zy30;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, v1}, La/zy30;-><init>(La/bz30;B)V

    .line 12
    .line 13
    .line 14
    const-string v1, "SELECT_BALANCE_REQUEST_KEY"

    .line 15
    .line 16
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, La/zy30;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/zy30;-><init>(La/bz30;B)V

    .line 27
    .line 28
    .line 29
    const-string v1, "CHANGE_BALANCE_REQUEST_KEY"

    .line 30
    .line 31
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, La/yy30;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-direct {p1, p0, v0}, La/yy30;-><init>(La/bz30;B)V

    .line 38
    .line 39
    .line 40
    const-string v0, "NEED_IDENTIFICATION_TJ_DIALOG_REQUEST_KEY"

    .line 41
    .line 42
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bz30;->O1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
