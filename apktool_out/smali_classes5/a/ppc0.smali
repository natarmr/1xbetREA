.class public final La/ppc0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ppc0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nh70",
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
.field public static final R1:La/nh70;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:Z

.field public final M1:La/a8z;

.field public final N1:La/s0r;

.field public final O1:La/a8z;

.field public final P1:La/r34;

.field public final Q1:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ppc0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/promo/impl/databinding/FragmentPromoShopCategoriesComposeBinding;"

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
    const-string v3, "categoryId"

    .line 16
    .line 17
    const-string v5, "getCategoryId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "categoryName"

    .line 25
    .line 26
    const-string v6, "getCategoryName()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/ppc0;->S1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/nh70;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/ppc0;->R1:La/nh70;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d029f

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/ppc0;->K1:La/hnm0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/ppc0;->L1:Z

    .line 13
    .line 14
    new-instance v1, La/mpc0;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, La/mpc0;-><init>(La/ppc0;B)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/wez;->b:La/wez;

    .line 21
    .line 22
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, La/ppc0;->M1:La/a8z;

    .line 27
    .line 28
    sget-object v1, La/npc0;->a:La/npc0;

    .line 29
    .line 30
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, La/ppc0;->N1:La/s0r;

    .line 35
    .line 36
    const-class v1, La/aqc0;

    .line 37
    .line 38
    sget-object v2, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, La/mpc0;

    .line 45
    .line 46
    invoke-direct {v2, p0, v0}, La/mpc0;-><init>(La/ppc0;B)V

    .line 47
    .line 48
    .line 49
    const/16 v0, 0xe

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-static {p0, v1, v3, v2, v0}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/ppc0;->O1:La/a8z;

    .line 57
    .line 58
    new-instance v0, La/r34;

    .line 59
    .line 60
    const-string v1, "EXTRA_CATEGORY_ID"

    .line 61
    .line 62
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, La/ppc0;->P1:La/r34;

    .line 66
    .line 67
    new-instance v0, La/phf0;

    .line 68
    .line 69
    const-string v1, "EXTRA_CATEGORY_NAME"

    .line 70
    .line 71
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/ppc0;->Q1:La/phf0;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/ppc0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/ppc0;->N1:La/s0r;

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
    check-cast p1, La/f3r;

    .line 16
    .line 17
    iget-object p1, p1, La/f3r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/lma0;

    .line 20
    .line 21
    const/16 v1, 0x1c

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v1, 0x25faa8a8

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final C0()V
    .locals 0

    .line 1
    iget-object p0, p0, La/ppc0;->M1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cqi;

    .line 8
    .line 9
    iget-object p0, p0, La/cqi;->a:La/wdk0;

    .line 10
    .line 11
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/ppc0;->O1:La/a8z;

    .line 5
    .line 6
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/k3t0;

    .line 11
    .line 12
    sget-object v0, La/jpc0;->a:La/jpc0;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ppc0;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ppc0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
