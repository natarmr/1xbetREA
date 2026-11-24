.class public final La/qh70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/qh70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nh70",
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
.field public static final O1:La/nh70;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/n6i;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/qh70;

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
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/qh70;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/nh70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/qh70;->O1:La/nh70;

    .line 26
    .line 27
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
    iput-object v0, p0, La/qh70;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/pu50;

    .line 12
    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/gg70;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-direct {v1, p0, v2}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/gg70;

    .line 27
    .line 28
    const/4 v4, 0x5

    .line 29
    invoke-direct {v3, v1, v4}, La/gg70;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-class v2, La/ai70;

    .line 37
    .line 38
    sget-object v3, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, La/ph70;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-direct {v3, v1, v4}, La/ph70;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/ph70;

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    invoke-direct {v4, v1, v5}, La/ph70;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/qh70;->M1:La/kiu0;

    .line 61
    .line 62
    sget-object v0, La/oh70;->a:La/oh70;

    .line 63
    .line 64
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/qh70;->N1:La/s0r;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 1

    .line 1
    invoke-static {p0}, La/sac;->O(Landroidx/fragment/app/Fragment;)La/h5t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, La/h5t;->b(La/qh70;)V

    .line 8
    .line 9
    .line 10
    :cond_0
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
    sget-object v0, La/qh70;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/qh70;->N1:La/s0r;

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
    invoke-virtual {p0}, La/qh70;->H0()La/eg70;

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
    invoke-virtual {p0}, La/qh70;->H0()La/eg70;

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
    invoke-virtual {p0}, La/qh70;->H0()La/eg70;

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
    invoke-virtual {p0}, La/qh70;->H0()La/eg70;

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
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/qh70;->M1:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, La/ai70;

    .line 14
    .line 15
    iget-object p2, p2, La/ai70;->i:La/q99;

    .line 16
    .line 17
    invoke-static {p2}, La/xkb;->V(La/htb;)La/itb;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v3, La/nf60;

    .line 22
    .line 23
    const/16 p2, 0x14

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v3, p0, v4, p2}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    sget-object p2, La/lkz;->a:La/lkz;

    .line 30
    .line 31
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    new-instance v0, La/az60;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-direct/range {v0 .. v5}, La/az60;-><init>(La/itb;La/clz;La/nf60;La/yje;B)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    invoke-static {p2, v4, v4, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, La/ai70;

    .line 58
    .line 59
    sget-object p2, La/rh70;->a:La/rh70;

    .line 60
    .line 61
    invoke-virtual {p1, p2}, La/ai70;->w(La/zh70;)V

    .line 62
    .line 63
    .line 64
    new-instance p2, La/xh70;

    .line 65
    .line 66
    iget-object v0, p1, La/ai70;->d:La/egu;

    .line 67
    .line 68
    invoke-virtual {v0}, La/egu;->a()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-direct {p2, v0}, La/xh70;-><init>(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, La/ai70;->w(La/zh70;)V

    .line 76
    .line 77
    .line 78
    iget-object p2, p1, La/ai70;->c:La/vcu;

    .line 79
    .line 80
    invoke-virtual {p2}, La/vcu;->a()La/vrs;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget-object v0, La/vrs;->a:La/vrs;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    if-ne p2, v0, :cond_0

    .line 88
    .line 89
    iget-object p2, p1, La/ai70;->g:La/spx;

    .line 90
    .line 91
    invoke-virtual {p2}, La/spx;->a()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-nez p2, :cond_0

    .line 96
    .line 97
    const/4 p2, 0x1

    .line 98
    goto :goto_0

    .line 99
    :cond_0
    move p2, v1

    .line 100
    :goto_0
    new-instance v0, La/vh70;

    .line 101
    .line 102
    invoke-direct {v0, p2}, La/vh70;-><init>(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, La/ai70;->w(La/zh70;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, La/yh70;

    .line 109
    .line 110
    invoke-direct {v0, p2}, La/yh70;-><init>(Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, La/ai70;->w(La/zh70;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1}, La/qh70;->J0(Z)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/qh70;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
