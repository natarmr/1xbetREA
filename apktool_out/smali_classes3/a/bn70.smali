.class public abstract La/bn70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/bn70;",
        "La/yx5;",
        "<init>",
        "()V",
        "core"
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
.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/h5t;

.field public final M1:La/hnm0;

.field public N1:La/ii;

.field public final O1:La/yzn0;

.field public final P1:La/s0r;

.field public Q1:I

.field public R1:La/ma3;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/bn70;

    .line 4
    .line 5
    const-string v2, "bonus"

    .line 6
    .line 7
    const-string v3, "getBonus()Lorg/xplatform/games_section/api/models/GameBonus;"

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
    const-string v5, "getBinding()Lorg/xplatform/core/databinding/OnexGameHolderFragmentBinding;"

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
    sput-object v1, La/bn70;->S1:[La/iiy;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0501

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
    invoke-direct {v0, v1, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/bn70;->K1:La/e9o0;

    .line 18
    .line 19
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 20
    .line 21
    iput-object v0, p0, La/bn70;->M1:La/hnm0;

    .line 22
    .line 23
    new-instance v0, La/yzn0;

    .line 24
    .line 25
    const-string v1, "lucky_wheel_bonus"

    .line 26
    .line 27
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, La/bn70;->O1:La/yzn0;

    .line 31
    .line 32
    sget-object v0, La/ym70;->a:La/ym70;

    .line 33
    .line 34
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/bn70;->P1:La/s0r;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public G0(Z)V
    .locals 3

    .line 1
    sget-object v0, La/hg70;->P1:La/evz;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/hg70;

    .line 7
    .line 8
    invoke-direct {v0}, La/hg70;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, La/hg70;->Q1:[La/iiy;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aget-object v1, v1, v2

    .line 15
    .line 16
    iget-object v2, v0, La/hg70;->O1:La/cgx0;

    .line 17
    .line 18
    invoke-virtual {v2, v0, v1, p1}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 19
    .line 20
    .line 21
    const p1, 0x7f0a0ad9

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, La/bn70;->I0(ILandroidx/fragment/app/Fragment;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public H0()V
    .locals 2

    .line 1
    new-instance v0, La/ok70;

    .line 2
    .line 3
    invoke-direct {v0}, La/ok70;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0x7f0a0ad5

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, La/bn70;->I0(ILandroidx/fragment/app/Fragment;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final I0(ILandroidx/fragment/app/Fragment;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v1, La/zb5;

    .line 31
    .line 32
    invoke-direct {v1, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1, p2, v0}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, La/zb5;->f()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public J0()V
    .locals 2

    .line 1
    sget-object v0, La/eo60;->O1:La/atz;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/eo60;

    .line 7
    .line 8
    invoke-direct {v0}, La/eo60;-><init>()V

    .line 9
    .line 10
    .line 11
    const v1, 0x7f0a0ad7

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, La/bn70;->I0(ILandroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final K0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/bn70;->N1:La/ii;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "actionDialogManager"

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

.method public final L0()La/zk70;
    .locals 2

    .line 1
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/bn70;->P1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/zk70;

    .line 16
    .line 17
    return-object p0
.end method

.method public abstract M0()Landroidx/fragment/app/Fragment;
.end method

.method public abstract N0(Landroidx/appcompat/widget/AppCompatImageView;)V
.end method

.method public O0(Landroidx/appcompat/widget/AppCompatImageView;La/km60;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/bn70;->N0(Landroidx/appcompat/widget/AppCompatImageView;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public P0()La/e9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bn70;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract Q0()La/to70;
.end method

.method public final R0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/bn70;->L0()La/zk70;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zk70;->d:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final S0(La/csr;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, p0, La/bn70;->O1:La/yzn0;

    .line 10
    .line 11
    invoke-virtual {v1, p0, v0, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final T0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/bn70;->L0()La/zk70;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zk70;->g:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 v1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, La/bn70;->R0()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public final U0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/bn70;->L0()La/zk70;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zk70;->f:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final V0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/bn70;->L0()La/zk70;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zk70;->i:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/xm70;

    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    invoke-direct {p1, p0, v0}, La/xm70;-><init>(La/bn70;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "HOLDER_TECHNICAL_WORKS_DIALOG_REQUEST_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    const-string v0, "OneXGames.BONUS_NOT_USED_RESULT_KEY"

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, La/bn70;->R1:La/ma3;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, La/r6e;->h(Landroid/view/Window;)Landroid/window/OnBackInvokedDispatcher;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2, v1}, La/r6e;->y(Landroid/window/OnBackInvokedDispatcher;La/ma3;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    iput-object v1, p0, La/bn70;->R1:La/ma3;

    .line 29
    .line 30
    :goto_0
    const/16 v1, 0x1e

    .line 31
    .line 32
    if-lt v0, v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v1, p0, La/bn70;->Q1:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-super {p0}, La/yx5;->Z()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final d0()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x21

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, La/bn70;->R1:La/ma3;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, La/r6e;->h(Landroid/view/Window;)Landroid/window/OnBackInvokedDispatcher;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1, v0}, La/r6e;->y(Landroid/window/OnBackInvokedDispatcher;La/ma3;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v2, p0, La/bn70;->R1:La/ma3;

    .line 32
    .line 33
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 38
    .line 39
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v3, v1

    .line 61
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 62
    .line 63
    invoke-static {v3, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move-object v1, v2

    .line 71
    :goto_1
    if-nez v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, La/to70;->x()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    sget-object v1, La/ho70;->a:La/ho70;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, La/to70;->F(La/io70;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v1, v0, La/to70;->l:La/vcu;

    .line 93
    .line 94
    invoke-virtual {v1}, La/vcu;->a()La/vrs;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    sget-object v3, La/vrs;->a:La/vrs;

    .line 99
    .line 100
    if-eq v1, v3, :cond_5

    .line 101
    .line 102
    iget-object v1, v0, La/to70;->C:La/hni0;

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    invoke-virtual {v1, v3}, La/hni0;->a(Z)V

    .line 106
    .line 107
    .line 108
    :cond_5
    iget-object v1, v0, La/to70;->S:La/bby;

    .line 109
    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    invoke-interface {v1, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    iget-object v1, v0, La/to70;->V:La/p7m0;

    .line 116
    .line 117
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, v0, La/to70;->R:La/c4m0;

    .line 126
    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 130
    .line 131
    .line 132
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const/16 v0, 0x80

    .line 141
    .line 142
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final e0()V
    .locals 8

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/bn70;->Q0()La/to70;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, La/to70;->z:La/y5s;

    .line 9
    .line 10
    iget-object v2, v1, La/y5s;->a:La/s470;

    .line 11
    .line 12
    invoke-virtual {v2}, La/s470;->a()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-object v4, v0, La/to70;->M:La/tbu;

    .line 17
    .line 18
    iget-object v4, v4, La/tbu;->a:La/pbt;

    .line 19
    .line 20
    iget-object v4, v4, La/pbt;->a:La/j5t;

    .line 21
    .line 22
    iget-object v4, v4, La/j5t;->z:La/y5s;

    .line 23
    .line 24
    iget-object v4, v4, La/y5s;->a:La/s470;

    .line 25
    .line 26
    invoke-virtual {v4}, La/s470;->a()J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    cmp-long v2, v2, v4

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v0, La/to70;->L:La/jqc;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v2, v2, La/jqc;->a:La/pbt;

    .line 40
    .line 41
    iget-object v2, v2, La/pbt;->a:La/j5t;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iput-object v1, v2, La/j5t;->z:La/y5s;

    .line 47
    .line 48
    const-string v2, "gameConfig"

    .line 49
    .line 50
    invoke-static {v1, v2}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {v0}, La/to70;->H()V

    .line 54
    .line 55
    .line 56
    iget-object v2, v0, La/to70;->V:La/p7m0;

    .line 57
    .line 58
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-virtual {v2, v4, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    iget-object v2, v0, La/to70;->i:La/oqt;

    .line 68
    .line 69
    iget-object v3, v0, La/to70;->l:La/vcu;

    .line 70
    .line 71
    invoke-virtual {v3}, La/vcu;->a()La/vrs;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    sget-object v5, La/vrs;->b:La/vrs;

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x1

    .line 79
    if-ne v4, v5, :cond_1

    .line 80
    .line 81
    move v4, v7

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move v4, v6

    .line 84
    :goto_0
    invoke-virtual {v3}, La/vcu;->a()La/vrs;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    sget-object v5, La/vrs;->c:La/vrs;

    .line 89
    .line 90
    if-ne v3, v5, :cond_2

    .line 91
    .line 92
    move v3, v7

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    move v3, v6

    .line 95
    :goto_1
    iget-boolean v5, v1, La/y5s;->e:Z

    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    iget-object v5, v0, La/to70;->n:La/ztt;

    .line 100
    .line 101
    invoke-virtual {v5}, La/ztt;->a()La/csr;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    iget-object v5, v5, La/csr;->a:La/bsr;

    .line 106
    .line 107
    iget-object v5, v5, La/bsr;->a:La/esr;

    .line 108
    .line 109
    invoke-virtual {v5}, La/esr;->a()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_3

    .line 114
    .line 115
    move v6, v7

    .line 116
    :cond_3
    iget-boolean v1, v1, La/y5s;->b:Z

    .line 117
    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    if-eqz v4, :cond_4

    .line 121
    .line 122
    invoke-virtual {v2}, La/oqt;->a()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_5

    .line 127
    .line 128
    :cond_4
    if-eqz v6, :cond_7

    .line 129
    .line 130
    if-nez v3, :cond_7

    .line 131
    .line 132
    :cond_5
    iget-object v1, v0, La/to70;->Y:La/p7m0;

    .line 133
    .line 134
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    move-object v5, v4

    .line 139
    check-cast v5, La/kn70;

    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance v5, La/kn70;

    .line 145
    .line 146
    invoke-direct {v5, v7}, La/kn70;-><init>(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    :cond_7
    if-eqz v3, :cond_8

    .line 156
    .line 157
    invoke-virtual {v2}, La/oqt;->a()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_8

    .line 162
    .line 163
    invoke-virtual {v0, v7}, La/to70;->G(Z)V

    .line 164
    .line 165
    .line 166
    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    const/16 v0, 0x80

    .line 175
    .line 176
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/xm70;

    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    invoke-direct {v1, v0, v2}, La/xm70;-><init>(La/bn70;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v3, La/bn70;->S1:[La/iiy;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    aget-object v3, v3, v4

    .line 26
    .line 27
    iget-object v5, v0, La/bn70;->O1:La/yzn0;

    .line 28
    .line 29
    invoke-virtual {v5, v0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, La/csr;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iput-object v3, v1, La/to70;->Q:La/csr;

    .line 39
    .line 40
    invoke-virtual {v0}, La/bn70;->R0()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, La/to70;->I()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v3, v1, La/to70;->q:La/eni0;

    .line 55
    .line 56
    iget-object v1, v1, La/to70;->z:La/y5s;

    .line 57
    .line 58
    iget-boolean v1, v1, La/y5s;->b:Z

    .line 59
    .line 60
    iget-object v3, v3, La/eni0;->a:La/pbt;

    .line 61
    .line 62
    iget-object v3, v3, La/pbt;->a:La/j5t;

    .line 63
    .line 64
    iput-boolean v1, v3, La/j5t;->s:Z

    .line 65
    .line 66
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v1, v3}, La/to70;->B(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, La/bn70;->L0()La/zk70;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v1, v1, La/zk70;->h:Landroid/widget/FrameLayout;

    .line 82
    .line 83
    invoke-static {v1, v4}, La/knm0;->h(Landroid/view/View;Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, La/bn70;->L0()La/zk70;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget-object v1, v1, La/zk70;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 91
    .line 92
    invoke-static {v1, v4}, La/knm0;->h(Landroid/view/View;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v3, La/tn70;

    .line 100
    .line 101
    iget-object v5, v1, La/to70;->z:La/y5s;

    .line 102
    .line 103
    iget-object v5, v5, La/y5s;->a:La/s470;

    .line 104
    .line 105
    invoke-direct {v3, v5}, La/tn70;-><init>(La/s470;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v3}, La/to70;->F(La/io70;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v3, v1, La/to70;->z:La/y5s;

    .line 116
    .line 117
    iget-boolean v5, v3, La/y5s;->g:Z

    .line 118
    .line 119
    if-eqz v5, :cond_0

    .line 120
    .line 121
    iget-boolean v5, v3, La/y5s;->c:Z

    .line 122
    .line 123
    if-nez v5, :cond_0

    .line 124
    .line 125
    sget-object v3, La/sn70;->a:La/sn70;

    .line 126
    .line 127
    invoke-virtual {v1, v3}, La/to70;->F(La/io70;)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_0
    new-instance v5, La/rn70;

    .line 132
    .line 133
    iget-boolean v3, v3, La/y5s;->e:Z

    .line 134
    .line 135
    invoke-direct {v5, v3}, La/rn70;-><init>(Z)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v5}, La/to70;->F(La/io70;)V

    .line 139
    .line 140
    .line 141
    :goto_0
    new-instance v1, La/vr3;

    .line 142
    .line 143
    const/4 v3, 0x3

    .line 144
    invoke-direct {v1, v0, v3}, La/vr3;-><init>(Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v5, v1, v4}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 152
    .line 153
    .line 154
    new-instance v1, La/oe70;

    .line 155
    .line 156
    invoke-direct {v1}, La/oe70;-><init>()V

    .line 157
    .line 158
    .line 159
    const v5, 0x7f0a0ad2

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v5, v1}, La/bn70;->I0(ILandroidx/fragment/app/Fragment;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, La/bn70;->J0()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, La/bn70;->M0()Landroidx/fragment/app/Fragment;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    const v5, 0x7f0a0ad6

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v5, v1}, La/bn70;->I0(ILandroidx/fragment/app/Fragment;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, La/bn70;->H0()V

    .line 179
    .line 180
    .line 181
    new-instance v1, La/wn60;

    .line 182
    .line 183
    invoke-direct {v1}, La/wn60;-><init>()V

    .line 184
    .line 185
    .line 186
    const v5, 0x7f0a0ad4

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v5, v1}, La/bn70;->I0(ILandroidx/fragment/app/Fragment;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v4}, La/bn70;->U0(Z)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    iget-object v1, v1, La/to70;->Y:La/p7m0;

    .line 200
    .line 201
    new-instance v5, La/an70;

    .line 202
    .line 203
    const/4 v6, 0x2

    .line 204
    const/4 v11, 0x0

    .line 205
    invoke-direct {v5, v0, v11, v6}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 206
    .line 207
    .line 208
    sget-object v6, La/lkz;->a:La/lkz;

    .line 209
    .line 210
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v7}, La/x0x;->Q(La/glz;)La/tkz;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    new-instance v8, La/zm70;

    .line 223
    .line 224
    invoke-direct {v8, v1, v6, v5, v11}, La/zm70;-><init>(La/gmq;La/clz;La/an70;La/yje;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v7, v11, v11, v8, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iget-object v8, v1, La/to70;->Z:La/p7m0;

    .line 235
    .line 236
    new-instance v10, La/an70;

    .line 237
    .line 238
    invoke-direct {v10, v0, v11, v3}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 239
    .line 240
    .line 241
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    new-instance v7, La/zm70;

    .line 254
    .line 255
    const/4 v12, 0x0

    .line 256
    invoke-direct/range {v7 .. v12}, La/zm70;-><init>(La/gmq;La/clz;La/an70;La/yje;B)V

    .line 257
    .line 258
    .line 259
    invoke-static {v1, v11, v11, v7, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iget-object v8, v1, La/to70;->W:La/p7m0;

    .line 267
    .line 268
    new-instance v10, La/an70;

    .line 269
    .line 270
    const/4 v1, 0x4

    .line 271
    invoke-direct {v10, v0, v11, v1}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 272
    .line 273
    .line 274
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    new-instance v7, La/zm70;

    .line 287
    .line 288
    invoke-direct/range {v7 .. v12}, La/zm70;-><init>(La/gmq;La/clz;La/an70;La/yje;C)V

    .line 289
    .line 290
    .line 291
    invoke-static {v5, v11, v11, v7, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    iget-object v8, v5, La/to70;->b0:La/p7m0;

    .line 299
    .line 300
    new-instance v10, La/an70;

    .line 301
    .line 302
    invoke-direct {v10, v0, v11, v2}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 303
    .line 304
    .line 305
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    new-instance v7, La/zm70;

    .line 318
    .line 319
    invoke-direct/range {v7 .. v12}, La/zm70;-><init>(La/gmq;La/clz;La/an70;La/yje;I)V

    .line 320
    .line 321
    .line 322
    invoke-static {v2, v11, v11, v7, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    iget-object v2, v2, La/to70;->a0:La/ol60;

    .line 330
    .line 331
    new-instance v5, La/an70;

    .line 332
    .line 333
    invoke-direct {v5, v0, v11, v4}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 334
    .line 335
    .line 336
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-static {v7}, La/x0x;->Q(La/glz;)La/tkz;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    new-instance v8, La/az60;

    .line 349
    .line 350
    invoke-direct {v8, v2, v6, v5, v11}, La/az60;-><init>(La/gmq;La/clz;La/an70;La/yje;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v7, v11, v11, v8, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    iget-object v2, v2, La/to70;->X:La/q99;

    .line 361
    .line 362
    invoke-static {v2}, La/xkb;->V(La/htb;)La/itb;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    new-instance v5, La/an70;

    .line 367
    .line 368
    const/4 v6, 0x1

    .line 369
    invoke-direct {v5, v0, v11, v6}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 370
    .line 371
    .line 372
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    invoke-static {v7}, La/x0x;->Q(La/glz;)La/tkz;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    new-instance v8, La/zm70;

    .line 385
    .line 386
    invoke-direct {v8, v2, v6, v5, v11}, La/zm70;-><init>(La/itb;La/clz;La/an70;La/yje;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v7, v11, v11, v8, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 390
    .line 391
    .line 392
    new-instance v2, La/ds60;

    .line 393
    .line 394
    const/16 v5, 0xd

    .line 395
    .line 396
    invoke-direct {v2, v0, v5}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 397
    .line 398
    .line 399
    const-string v5, "REQUEST_SELECT_BONUS_KEY"

    .line 400
    .line 401
    invoke-static {v0, v5, v2}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 402
    .line 403
    .line 404
    new-instance v2, La/xm70;

    .line 405
    .line 406
    const/16 v5, 0x8

    .line 407
    .line 408
    invoke-direct {v2, v0, v5}, La/xm70;-><init>(La/bn70;B)V

    .line 409
    .line 410
    .line 411
    const-string v5, "ONE_X_GAME_HOLDER_ERROR"

    .line 412
    .line 413
    invoke-static {v0, v5, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 414
    .line 415
    .line 416
    new-instance v6, La/cz60;

    .line 417
    .line 418
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    const/4 v13, 0x3

    .line 423
    const/4 v7, 0x0

    .line 424
    const-class v17, La/to70;

    .line 425
    .line 426
    const-string v10, "warningDialogCanceled"

    .line 427
    .line 428
    const-string v11, "warningDialogCanceled$core()V"

    .line 429
    .line 430
    move-object/from16 v9, v17

    .line 431
    .line 432
    invoke-direct/range {v6 .. v13}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 433
    .line 434
    .line 435
    const-string v2, "REQUEST_DIALOG_ERROR_KEY"

    .line 436
    .line 437
    invoke-static {v0, v2, v6}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 438
    .line 439
    .line 440
    new-instance v2, La/xm70;

    .line 441
    .line 442
    const/4 v5, 0x7

    .line 443
    invoke-direct {v2, v0, v5}, La/xm70;-><init>(La/bn70;B)V

    .line 444
    .line 445
    .line 446
    const-string v5, "INSUFFICIENT_DIALOG_ERROR_KEY"

    .line 447
    .line 448
    invoke-static {v0, v5, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 449
    .line 450
    .line 451
    new-instance v14, La/cz60;

    .line 452
    .line 453
    invoke-virtual {v0}, La/bn70;->Q0()La/to70;

    .line 454
    .line 455
    .line 456
    move-result-object v16

    .line 457
    const/16 v20, 0x0

    .line 458
    .line 459
    const/16 v21, 0x4

    .line 460
    .line 461
    const/4 v15, 0x0

    .line 462
    const-string v18, "notEnoughFundsDialogResultOk"

    .line 463
    .line 464
    const-string v19, "notEnoughFundsDialogResultOk$core()V"

    .line 465
    .line 466
    invoke-direct/range {v14 .. v21}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 467
    .line 468
    .line 469
    const-string v2, "NOT_ENOUGH_FUNDS"

    .line 470
    .line 471
    invoke-static {v0, v2, v14}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 472
    .line 473
    .line 474
    new-instance v5, La/xm70;

    .line 475
    .line 476
    invoke-direct {v5, v0, v3}, La/xm70;-><init>(La/bn70;B)V

    .line 477
    .line 478
    .line 479
    invoke-static {v0, v2, v5}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    new-instance v3, La/ex60;

    .line 487
    .line 488
    invoke-direct {v3, v0, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 489
    .line 490
    .line 491
    const-string v5, "GameIsNotFinishedDialog.REQUEST_KEY"

    .line 492
    .line 493
    invoke-virtual {v2, v5, v0, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 494
    .line 495
    .line 496
    new-instance v2, La/xm70;

    .line 497
    .line 498
    const/16 v3, 0x9

    .line 499
    .line 500
    invoke-direct {v2, v0, v3}, La/xm70;-><init>(La/bn70;B)V

    .line 501
    .line 502
    .line 503
    const-string v3, "UNFINISHED_GAME_DIALOG_RESULT"

    .line 504
    .line 505
    invoke-static {v0, v3, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 506
    .line 507
    .line 508
    new-instance v2, La/xm70;

    .line 509
    .line 510
    invoke-direct {v2, v0, v4}, La/xm70;-><init>(La/bn70;B)V

    .line 511
    .line 512
    .line 513
    const-string v3, "CHANGE_ACCOUNT_TO_PRIMARY_REQUEST_KEY"

    .line 514
    .line 515
    invoke-static {v0, v3, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 516
    .line 517
    .line 518
    new-instance v2, La/xm70;

    .line 519
    .line 520
    invoke-direct {v2, v0, v1}, La/xm70;-><init>(La/bn70;B)V

    .line 521
    .line 522
    .line 523
    const-string v1, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY"

    .line 524
    .line 525
    invoke-static {v0, v1, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0}, La/bn70;->L0()La/zk70;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    iget-object v1, v1, La/zk70;->j:Lorg/xplatform/core/presentation/views/tax_message/TaxMessageView;

    .line 533
    .line 534
    new-instance v2, La/xm70;

    .line 535
    .line 536
    const/16 v3, 0xa

    .line 537
    .line 538
    invoke-direct {v2, v0, v3}, La/xm70;-><init>(La/bn70;B)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1, v2}, Lorg/xplatform/core/presentation/views/tax_message/TaxMessageView;->setOnCloseListener(Lkotlin/jvm/functions/Function0;)V

    .line 542
    .line 543
    .line 544
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 545
    .line 546
    const/16 v2, 0x1e

    .line 547
    .line 548
    if-ge v1, v2, :cond_1

    .line 549
    .line 550
    goto :goto_1

    .line 551
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 564
    .line 565
    iput v3, v0, La/bn70;->Q1:I

    .line 566
    .line 567
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    const/16 v4, 0x30

    .line 576
    .line 577
    invoke-virtual {v3, v4}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 578
    .line 579
    .line 580
    :goto_1
    if-ge v1, v2, :cond_2

    .line 581
    .line 582
    return-void

    .line 583
    :cond_2
    invoke-virtual {v0}, La/bn70;->L0()La/zk70;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    iget-object v1, v1, La/zk70;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 588
    .line 589
    invoke-virtual {v0}, La/bn70;->L0()La/zk70;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    iget-object v2, v2, La/zk70;->h:Landroid/widget/FrameLayout;

    .line 594
    .line 595
    new-instance v3, La/dq00;

    .line 596
    .line 597
    const/16 v4, 0xb

    .line 598
    .line 599
    invoke-direct {v3, v1, v0, v4}, La/dq00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 600
    .line 601
    .line 602
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 603
    .line 604
    invoke-static {v2, v3}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 605
    .line 606
    .line 607
    return-void
.end method

.method public y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bn70;->M1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic z0()La/j9o0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/bn70;->P0()La/e9o0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
