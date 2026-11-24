.class public final La/hg70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/hg70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/evz",
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
.field public static final P1:La/evz;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/b7i;

.field public final M1:La/s0r;

.field public final N1:La/kiu0;

.field public final O1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/hg70;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/core/databinding/OnexGameBetHolderFragmentBinding;"

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
    const-string v3, "raiseGame"

    .line 16
    .line 17
    const-string v5, "getRaiseGame()Z"

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
    sput-object v1, La/hg70;->Q1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/evz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/hg70;->P1:La/evz;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0500

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/hg70;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/fg70;->a:La/fg70;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/hg70;->M1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/pu50;

    .line 20
    .line 21
    const/16 v1, 0x1a

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/gg70;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, p0, v3}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    sget-object v3, La/wez;->b:La/wez;

    .line 33
    .line 34
    new-instance v4, La/gg70;

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    invoke-direct {v4, v2, v5}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-class v3, La/rg70;

    .line 45
    .line 46
    sget-object v4, La/sre0;->a:La/tre0;

    .line 47
    .line 48
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    new-instance v4, La/co60;

    .line 53
    .line 54
    invoke-direct {v4, v2, v1}, La/co60;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    new-instance v1, La/co60;

    .line 58
    .line 59
    const/16 v5, 0x1b

    .line 60
    .line 61
    invoke-direct {v1, v2, v5}, La/co60;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v3, v4, v1, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/hg70;->N1:La/kiu0;

    .line 69
    .line 70
    new-instance v0, La/cgx0;

    .line 71
    .line 72
    const-string v1, "RAISE_GAME_BUNDLE"

    .line 73
    .line 74
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, La/hg70;->O1:La/cgx0;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/bn70;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/bn70;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/bn70;->L1:La/h5t;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, p0}, La/h5t;->a(La/hg70;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final G0(La/yx5;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v2, La/zb5;

    .line 28
    .line 29
    invoke-direct {v2, v1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p2, p1, v0}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, p0}, La/zb5;->c(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, La/zb5;->f()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final H0()La/eg70;
    .locals 2

    .line 1
    sget-object v0, La/hg70;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hg70;->M1:La/s0r;

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
    check-cast p0, La/eg70;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, La/hg70;->H0()La/eg70;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, La/eg70;->b:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, La/hg70;->H0()La/eg70;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/eg70;->b:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    invoke-static {p0}, La/lwf;->c(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {p0}, La/hg70;->H0()La/eg70;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, La/eg70;->b:Landroid/widget/FrameLayout;

    .line 31
    .line 32
    const/16 p1, 0x8

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final J0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/hg70;->H0()La/eg70;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/eg70;->e:Landroid/widget/FrameLayout;

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

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/hg70;->N1:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, La/rg70;

    .line 14
    .line 15
    iget-object p2, p2, La/rg70;->i:La/q99;

    .line 16
    .line 17
    invoke-static {p2}, La/xkb;->V(La/htb;)La/itb;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    new-instance v0, La/nf60;

    .line 22
    .line 23
    const/16 v1, 0x12

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v0, p0, v2, v1}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    sget-object v1, La/lkz;->a:La/lkz;

    .line 30
    .line 31
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, La/az60;

    .line 44
    .line 45
    invoke-direct {v4, p2, v1, v0, v2}, La/az60;-><init>(La/itb;La/clz;La/nf60;La/yje;)V

    .line 46
    .line 47
    .line 48
    const/4 p2, 0x3

    .line 49
    invoke-static {v3, v2, v2, v4, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, La/rg70;

    .line 57
    .line 58
    iget-object v0, p2, La/rg70;->c:La/vcu;

    .line 59
    .line 60
    invoke-virtual {v0}, La/vcu;->a()La/vrs;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v1, La/vrs;->b:La/vrs;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    if-eq v0, v1, :cond_0

    .line 68
    .line 69
    move v0, v2

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/4 v0, 0x0

    .line 72
    :goto_0
    new-instance v1, La/ig70;

    .line 73
    .line 74
    iget-boolean v3, p2, La/rg70;->h:Z

    .line 75
    .line 76
    invoke-direct {v1, v3, v0}, La/ig70;-><init>(ZZ)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v1}, La/rg70;->w(La/qg70;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, La/rg70;

    .line 87
    .line 88
    new-instance p2, La/og70;

    .line 89
    .line 90
    iget-object v0, p1, La/rg70;->d:La/egu;

    .line 91
    .line 92
    invoke-virtual {v0}, La/egu;->a()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-direct {p2, v0}, La/og70;-><init>(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, La/rg70;->w(La/qg70;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v2}, La/hg70;->J0(Z)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hg70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
