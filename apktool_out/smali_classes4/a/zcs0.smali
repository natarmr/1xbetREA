.class public final La/zcs0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/zcs0;",
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
.field public static final O1:La/s2m0;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/a8z;

.field public final L1:La/a8z;

.field public final M1:La/a8z;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/zcs0;

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
    sput-object v1, La/zcs0;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/s2m0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/zcs0;->O1:La/s2m0;

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
    new-instance v0, La/yqr0;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/yqr0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wez;->b:La/wez;

    .line 15
    .line 16
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, La/zcs0;->K1:La/a8z;

    .line 21
    .line 22
    new-instance v0, La/xcs0;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, p0, v2}, La/xcs0;-><init>(La/zcs0;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, La/zcs0;->L1:La/a8z;

    .line 33
    .line 34
    const-class v0, La/ul2;

    .line 35
    .line 36
    sget-object v1, La/sre0;->a:La/tre0;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, La/xcs0;

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-direct {v1, p0, v2}, La/xcs0;-><init>(La/zcs0;B)V

    .line 46
    .line 47
    .line 48
    const/16 v2, 0xe

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/zcs0;->M1:La/a8z;

    .line 56
    .line 57
    sget-object v0, La/ycs0;->a:La/ycs0;

    .line 58
    .line 59
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/zcs0;->N1:La/s0r;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    new-instance p1, La/xcs0;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/xcs0;-><init>(La/zcs0;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "REMOVE_ALL_COEF_TRACK_RESULT"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/xcs0;

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-direct {p1, p0, v1}, La/xcs0;-><init>(La/zcs0;B)V

    .line 16
    .line 17
    .line 18
    const-string v1, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY"

    .line 19
    .line 20
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, La/zcs0;->P1:[La/iiy;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aget-object p1, p1, v2

    .line 27
    .line 28
    iget-object v2, p0, La/zcs0;->N1:La/s0r;

    .line 29
    .line 30
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    check-cast p1, La/aid;

    .line 38
    .line 39
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 40
    .line 41
    new-instance v2, La/iob0;

    .line 42
    .line 43
    const/16 v3, 0xf

    .line 44
    .line 45
    invoke-direct {v2, p0, v3}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/ugd;

    .line 49
    .line 50
    const v5, 0x346550cc

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    invoke-direct {v4, v5, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, La/shd;

    .line 58
    .line 59
    invoke-direct {v2, v3}, La/shd;-><init>(B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v2, v4}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La/xcs0;

    .line 66
    .line 67
    const/4 v2, 0x5

    .line 68
    invoke-direct {p1, p0, v2}, La/xcs0;-><init>(La/zcs0;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, La/xcs0;

    .line 75
    .line 76
    const/4 v0, 0x6

    .line 77
    invoke-direct {p1, p0, v0}, La/xcs0;-><init>(La/zcs0;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zcs0;->M1:La/a8z;

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

.method public final H0()La/ogi;
    .locals 0

    .line 1
    iget-object p0, p0, La/zcs0;->L1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ogi;

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
