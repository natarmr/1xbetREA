.class public final La/m1i0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/m1i0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cge0",
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
.field public static final O1:La/cge0;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/m1i0;

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
    sput-object v1, La/m1i0;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/cge0;

    .line 21
    .line 22
    const/16 v1, 0x11

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/cge0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/m1i0;->O1:La/cge0;

    .line 28
    .line 29
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
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/m1i0;->K1:Z

    .line 9
    .line 10
    sget-object v0, La/l1i0;->a:La/l1i0;

    .line 11
    .line 12
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/m1i0;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v0, La/k1i0;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, p0, v1}, La/k1i0;-><init>(La/m1i0;B)V

    .line 22
    .line 23
    .line 24
    sget-object v1, La/wez;->b:La/wez;

    .line 25
    .line 26
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/m1i0;->M1:La/a8z;

    .line 31
    .line 32
    const-class v0, La/p1i0;

    .line 33
    .line 34
    sget-object v1, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, La/k1i0;

    .line 41
    .line 42
    const/4 v2, 0x3

    .line 43
    invoke-direct {v1, p0, v2}, La/k1i0;-><init>(La/m1i0;B)V

    .line 44
    .line 45
    .line 46
    const/16 v2, 0xe

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/m1i0;->N1:La/a8z;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/k1i0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/k1i0;-><init>(La/m1i0;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "CLOSE_CHOOSER_REQUEST_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/k1i0;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, p0, v1}, La/k1i0;-><init>(La/m1i0;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, La/m1i0;->P1:[La/iiy;

    .line 22
    .line 23
    aget-object p1, p1, v0

    .line 24
    .line 25
    iget-object v0, p0, La/m1i0;->L1:La/s0r;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    check-cast p1, La/aid;

    .line 35
    .line 36
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 37
    .line 38
    new-instance v0, La/uph0;

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v0, p0, v2}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance p0, La/ugd;

    .line 45
    .line 46
    const v2, 0xacc51a6

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v2, v1, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m1i0;->N1:La/a8z;

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
    iget-boolean p0, p0, La/m1i0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
