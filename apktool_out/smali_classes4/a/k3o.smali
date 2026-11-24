.class public final La/k3o;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/k3o;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nek",
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
.field public static final R1:La/nek;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/zfi;

.field public L1:La/ujd;

.field public M1:La/wdk0;

.field public final N1:Z

.field public final O1:La/a8z;

.field public final P1:La/khf0;

.field public final Q1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/k3o;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/k3o;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/nek;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/k3o;->R1:La/nek;

    .line 26
    .line 27
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
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/k3o;->N1:Z

    .line 9
    .line 10
    const-class v1, La/d4o;

    .line 11
    .line 12
    sget-object v2, La/sre0;->a:La/tre0;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, La/i3o;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, p0, v3}, La/i3o;-><init>(La/k3o;B)V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0xe

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    invoke-static {p0, v1, v4, v2, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, La/k3o;->O1:La/a8z;

    .line 32
    .line 33
    new-instance v1, La/khf0;

    .line 34
    .line 35
    const-string v2, "params_key"

    .line 36
    .line 37
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, La/k3o;->P1:La/khf0;

    .line 41
    .line 42
    new-instance v1, La/i3o;

    .line 43
    .line 44
    invoke-direct {v1, p0, v0}, La/i3o;-><init>(La/k3o;B)V

    .line 45
    .line 46
    .line 47
    sget-object v0, La/wez;->b:La/wez;

    .line 48
    .line 49
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/k3o;->Q1:La/a8z;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, La/i3o;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/i3o;-><init>(La/k3o;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/j3o;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p1, p0, v0}, La/j3o;-><init>(La/k3o;B)V

    .line 14
    .line 15
    .line 16
    const-string v0, "REQUEST_TIME_FILTER"

    .line 17
    .line 18
    invoke-static {p0, v0, p1}, La/sj3;->s0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, La/k3o;->M1:La/wdk0;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-boolean v0, p0, La/k3o;->N1:Z

    .line 26
    .line 27
    invoke-static {p1, p0, v0}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "snackbarManager"

    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/k3o;->Q1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/agi;

    .line 8
    .line 9
    iget-object v1, v0, La/agi;->y:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/zfi;

    .line 16
    .line 17
    iput-object v1, p0, La/k3o;->K1:La/zfi;

    .line 18
    .line 19
    iget-object v1, v0, La/agi;->q:La/itr;

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
    iput-object v1, p0, La/k3o;->L1:La/ujd;

    .line 29
    .line 30
    iget-object v0, v0, La/agi;->v:La/wdk0;

    .line 31
    .line 32
    iput-object v0, p0, La/k3o;->M1:La/wdk0;

    .line 33
    .line 34
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k3o;->O1:La/a8z;

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

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x6

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p2, La/owp0;

    .line 16
    .line 17
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 18
    .line 19
    .line 20
    new-instance p3, La/mxm;

    .line 21
    .line 22
    const/16 v1, 0x1c

    .line 23
    .line 24
    invoke-direct {p3, p0, v1}, La/mxm;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    new-instance p0, La/ugd;

    .line 28
    .line 29
    const v1, 0x4e15b113    # 6.278525E8f

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {p0, v1, v2, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/k3o;->L1:La/ujd;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, La/cr2;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j3o;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, p0, v3}, La/j3o;-><init>(La/k3o;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "gameCardFragmentDelegate"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/k3o;->N1:Z

    .line 2
    .line 3
    return p0
.end method
