.class public final La/t0y;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/t0y;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gst",
        "jackpot"
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
.field public static final P1:La/gst;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public final N1:La/s0r;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/t0y;

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
    sput-object v1, La/t0y;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gst;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/t0y;->P1:La/gst;

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
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b22

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bp3;->b:La/bp3;

    .line 13
    .line 14
    const v3, 0x7f040b5d

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/t0y;->K1:La/e9o0;

    .line 21
    .line 22
    sget-object v0, La/s0y;->a:La/s0y;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/t0y;->N1:La/s0r;

    .line 29
    .line 30
    const-class v0, La/f8y;

    .line 31
    .line 32
    sget-object v1, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, La/r0y;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {v1, p0, v2}, La/r0y;-><init>(La/t0y;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/t0y;->O1:La/a8z;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/r0y;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/r0y;-><init>(La/t0y;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/r0y;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p1, p0, v0}, La/r0y;-><init>(La/t0y;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, La/t0y;->Q1:[La/iiy;

    .line 22
    .line 23
    aget-object p1, p1, v0

    .line 24
    .line 25
    iget-object v0, p0, La/t0y;->N1:La/s0r;

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
    new-instance v0, La/xxv;

    .line 39
    .line 40
    const/16 v1, 0x14

    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, La/xxv;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    new-instance p0, La/ugd;

    .line 46
    .line 47
    const v1, -0xb9f865

    .line 48
    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, La/vmv;

    .line 10
    .line 11
    const-string v2, "Can not find dependencies provider for "

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    check-cast v0, La/vmv;

    .line 16
    .line 17
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v1, La/rqt;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v3, La/mii0;

    .line 44
    .line 45
    invoke-direct {v3, v1, v0, v2}, La/mii0;-><init>(La/rqt;La/g8i;La/i1w0;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, La/fiu0;

    .line 49
    .line 50
    iget-object v2, v3, La/mii0;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, La/gji;

    .line 53
    .line 54
    const-class v3, La/f8y;

    .line 55
    .line 56
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, La/t0y;->L1:La/fiu0;

    .line 64
    .line 65
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/t0y;->M1:La/ii;

    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.dependencies.JackPotDependencies"

    .line 73
    .line 74
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/t0y;->O1:La/a8z;

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

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/t0y;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/szx;->a:La/szx;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/t0y;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
