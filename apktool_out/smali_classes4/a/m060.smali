.class public final La/m060;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/m060;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xuz",
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
.field public static final O1:La/xuz;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/n0o0;

.field public final M1:La/s0r;

.field public final N1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/m060;

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
    sput-object v1, La/m060;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xuz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/m060;->O1:La/xuz;

    .line 26
    .line 27
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
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/m060;->K1:La/f9o0;

    .line 16
    .line 17
    new-instance v0, La/k060;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, v1}, La/k060;-><init>(La/m060;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/m060;->L1:La/n0o0;

    .line 28
    .line 29
    sget-object v0, La/l060;->a:La/l060;

    .line 30
    .line 31
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/m060;->M1:La/s0r;

    .line 36
    .line 37
    const-class v0, La/x060;

    .line 38
    .line 39
    sget-object v1, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, La/k060;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    invoke-direct {v1, p0, v2}, La/k060;-><init>(La/m060;B)V

    .line 49
    .line 50
    .line 51
    const/16 v2, 0xe

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/m060;->N1:La/a8z;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object p1, La/m060;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/m060;->M1:La/s0r;

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
    new-instance v1, La/pi40;

    .line 20
    .line 21
    const/16 v2, 0x15

    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/ugd;

    .line 27
    .line 28
    const v3, 0x47a049c8    # 82067.56f

    .line 29
    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    invoke-direct {v2, v3, v4, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, La/shd;

    .line 36
    .line 37
    const/16 v3, 0xf

    .line 38
    .line 39
    invoke-direct {v1, v3}, La/shd;-><init>(B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v1, v2}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, La/k060;

    .line 46
    .line 47
    invoke-direct {p1, p0, v0}, La/k060;-><init>(La/m060;B)V

    .line 48
    .line 49
    .line 50
    const-string v0, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY"

    .line 51
    .line 52
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m060;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
