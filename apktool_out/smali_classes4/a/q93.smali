.class public final La/q93;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/q93;",
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
.field public static final Q1:La/pek0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/fiu0;

.field public final M1:La/a8z;

.field public final N1:La/s0r;

.field public final O1:La/r34;

.field public final P1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/q93;

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
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "selectedCategoryId"

    .line 16
    .line 17
    const-string v5, "getSelectedCategoryId()J"

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
    sput-object v1, La/q93;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/pek0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/q93;->Q1:La/pek0;

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
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/q93;->K1:La/e9o0;

    .line 23
    .line 24
    const-class v0, La/v93;

    .line 25
    .line 26
    sget-object v1, La/sre0;->a:La/tre0;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/a13;

    .line 33
    .line 34
    const/4 v2, 0x7

    .line 35
    invoke-direct {v1, p0, v2}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/q93;->M1:La/a8z;

    .line 43
    .line 44
    sget-object v0, La/p93;->a:La/p93;

    .line 45
    .line 46
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/q93;->N1:La/s0r;

    .line 51
    .line 52
    new-instance v0, La/r34;

    .line 53
    .line 54
    const-string v1, "ANOTHER_AWARDS_SELECTED_CATEGORY"

    .line 55
    .line 56
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/q93;->O1:La/r34;

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, La/q93;->P1:Z

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 1

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, La/dyb;->X(Landroid/app/Application;)La/v8i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, La/v8i;->f()La/fiu0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, La/q93;->L1:La/fiu0;

    .line 21
    .line 22
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    sget-object v0, La/q93;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/q93;->N1:La/s0r;

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
    new-instance v2, La/fa2;

    .line 25
    .line 26
    const/16 v3, 0x8

    .line 27
    .line 28
    invoke-direct {v2, p0, v3}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance p0, La/ugd;

    .line 32
    .line 33
    const v3, -0x4fd422f4

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-direct {p0, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v0, v1, v2, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/q93;->M1:La/a8z;

    .line 5
    .line 6
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/k3t0;

    .line 11
    .line 12
    new-instance v1, La/n93;

    .line 13
    .line 14
    sget-object v2, La/q93;->R1:[La/iiy;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    aget-object v2, v2, v3

    .line 18
    .line 19
    iget-object v3, p0, La/q93;->O1:La/r34;

    .line 20
    .line 21
    invoke-virtual {v3, p0, v2}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-direct {v1, v2, v3}, La/n93;-><init>(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/q93;->P1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q93;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
