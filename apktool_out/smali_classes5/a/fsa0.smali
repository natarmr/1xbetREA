.class public final La/fsa0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/ocl0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/fsa0;",
        "La/yx5;",
        "La/ocl0;",
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
.field public static final V1:La/nh70;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/xi70;

.field public M1:La/wdk0;

.field public N1:La/ugf0;

.field public O1:La/ujd;

.field public final P1:La/r34;

.field public final Q1:La/a8z;

.field public final R1:La/a8z;

.field public final S1:La/s0r;

.field public final U1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/fsa0;

    .line 4
    .line 5
    const-string v2, "gameId"

    .line 6
    .line 7
    const-string v3, "getGameId()J"

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
    sput-object v1, La/fsa0;->W1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/nh70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/fsa0;->V1:La/nh70;

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
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/fsa0;->K1:La/e9o0;

    .line 23
    .line 24
    new-instance v0, La/r34;

    .line 25
    .line 26
    const-string v1, "GAME_ID_KEY"

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/fsa0;->P1:La/r34;

    .line 32
    .line 33
    new-instance v0, La/csa0;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {v0, p0, v1}, La/csa0;-><init>(La/fsa0;B)V

    .line 37
    .line 38
    .line 39
    sget-object v1, La/wez;->b:La/wez;

    .line 40
    .line 41
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, La/fsa0;->Q1:La/a8z;

    .line 46
    .line 47
    const-class v0, La/ata0;

    .line 48
    .line 49
    sget-object v1, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, La/csa0;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-direct {v1, p0, v2}, La/csa0;-><init>(La/fsa0;B)V

    .line 59
    .line 60
    .line 61
    const/16 v3, 0xe

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-static {p0, v0, v4, v1, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/fsa0;->R1:La/a8z;

    .line 69
    .line 70
    sget-object v0, La/esa0;->a:La/esa0;

    .line 71
    .line 72
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/fsa0;->S1:La/s0r;

    .line 77
    .line 78
    iput-boolean v2, p0, La/fsa0;->U1:Z

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    new-instance p1, La/csa0;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/csa0;-><init>(La/fsa0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/fsa0;->W1:[La/iiy;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    aget-object p1, p1, v1

    .line 14
    .line 15
    iget-object v2, p0, La/fsa0;->S1:La/s0r;

    .line 16
    .line 17
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p1, La/aid;

    .line 25
    .line 26
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 27
    .line 28
    sget-object v2, La/qek0;->h:La/qek0;

    .line 29
    .line 30
    new-instance v3, La/lma0;

    .line 31
    .line 32
    invoke-direct {v3, p0, v0}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    new-instance v0, La/ugd;

    .line 36
    .line 37
    const v4, -0x64070f24

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v4, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-static {p1, v2, v1, v0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, La/fsa0;->O1:La/ujd;

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    new-instance v0, La/ls2;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v1, La/dsa0;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    invoke-direct {v1, p0, v2}, La/dsa0;-><init>(La/fsa0;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p0, v0, v1}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

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
    throw v1
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/fsa0;->Q1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/ooi;

    .line 8
    .line 9
    iget-object v1, v0, La/ooi;->k:La/rmd0;

    .line 10
    .line 11
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, La/fsa0;->L1:La/xi70;

    .line 16
    .line 17
    iget-object v1, v0, La/ooi;->w:La/wdk0;

    .line 18
    .line 19
    iput-object v1, p0, La/fsa0;->M1:La/wdk0;

    .line 20
    .line 21
    iget-object v1, v0, La/ooi;->d:La/ugf0;

    .line 22
    .line 23
    iput-object v1, p0, La/fsa0;->N1:La/ugf0;

    .line 24
    .line 25
    iget-object v0, v0, La/ooi;->q:La/itr;

    .line 26
    .line 27
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/fsa0;->O1:La/ujd;

    .line 35
    .line 36
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/fsa0;->R1:La/a8z;

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

.method public final Z()V
    .locals 1

    .line 1
    iget-object v0, p0, La/fsa0;->O1:La/ujd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, La/yx5;->Z()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "composeGameCardFragmentDelegate"

    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method public final u(Lkotlin/jvm/functions/Function0;)La/pcl0;
    .locals 0

    .line 1
    iget-object p0, p0, La/fsa0;->N1:La/ugf0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "sportGameCoreLib"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/fsa0;->U1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/fsa0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
