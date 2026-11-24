.class public final La/wn6;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wn6;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bj5",
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
.field public static final V1:La/bj5;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public N1:La/cge0;

.field public O1:La/lgn0;

.field public P1:La/xi70;

.field public Q1:La/wdk0;

.field public final R1:La/s0r;

.field public final S1:La/cgk0;

.field public final U1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/wn6;

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
    sput-object v1, La/wn6;->W1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/bj5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/wn6;->V1:La/bj5;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/wn6;->K1:La/hnm0;

    .line 10
    .line 11
    sget-object v0, La/vn6;->a:La/vn6;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/wn6;->R1:La/s0r;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-static {v0}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, p0, La/wn6;->S1:La/cgk0;

    .line 25
    .line 26
    const-class v1, La/vp6;

    .line 27
    .line 28
    sget-object v2, La/sre0;->a:La/tre0;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, La/tn6;

    .line 35
    .line 36
    invoke-direct {v2, p0, v0}, La/tn6;-><init>(La/wn6;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v1, v2}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/wn6;->U1:La/a8z;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/tn6;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/tn6;-><init>(La/wn6;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "REQUEST_BALANCE_ERROR_DIALOG_KEY_NEW"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/tn6;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {p1, p0, v1}, La/tn6;-><init>(La/wn6;B)V

    .line 16
    .line 17
    .line 18
    const-string v1, "REQUEST_BET_EXISTS_DIALOG_KEY_NEW"

    .line 19
    .line 20
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, La/sn6;

    .line 24
    .line 25
    invoke-direct {p1, p0, v0}, La/sn6;-><init>(La/wn6;B)V

    .line 26
    .line 27
    .line 28
    const-string v1, "REQUEST_TEAM_ACTION_KEY_NEW"

    .line 29
    .line 30
    invoke-static {p0, v1, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, La/wn6;->W1:[La/iiy;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aget-object p1, p1, v1

    .line 37
    .line 38
    iget-object v2, p0, La/wn6;->R1:La/s0r;

    .line 39
    .line 40
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast p1, La/aid;

    .line 48
    .line 49
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 50
    .line 51
    new-instance v2, La/sn6;

    .line 52
    .line 53
    invoke-direct {v2, p0, v1}, La/sn6;-><init>(La/wn6;B)V

    .line 54
    .line 55
    .line 56
    new-instance v1, La/ugd;

    .line 57
    .line 58
    const v3, 0x74b4bada

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-static {p1, v0, v1}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, La/wn6;->G0()La/k3t0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    sget-object p1, La/cn6;->a:La/cn6;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/yn6;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/yn6;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/yn6;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2, v0}, La/yn6;->a(La/i1w0;)La/g7i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/g7i;->e()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/wn6;->L1:La/fiu0;

    .line 68
    .line 69
    iget-object v1, v0, La/g7i;->G:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/ii;

    .line 72
    .line 73
    iput-object v1, p0, La/wn6;->M1:La/ii;

    .line 74
    .line 75
    new-instance v1, La/cge0;

    .line 76
    .line 77
    const/4 v2, 0x6

    .line 78
    invoke-direct {v1, v2}, La/cge0;-><init>(B)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, La/wn6;->N1:La/cge0;

    .line 82
    .line 83
    iget-object v1, v0, La/g7i;->H:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, La/lgn0;

    .line 86
    .line 87
    iput-object v1, p0, La/wn6;->O1:La/lgn0;

    .line 88
    .line 89
    iget-object v1, v0, La/g7i;->r:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, La/rmd0;

    .line 92
    .line 93
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p0, La/wn6;->P1:La/xi70;

    .line 98
    .line 99
    iget-object v0, v0, La/g7i;->I:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, La/wdk0;

    .line 102
    .line 103
    iput-object v0, p0, La/wn6;->Q1:La/wdk0;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 107
    .line 108
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wn6;->U1:La/a8z;

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

.method public final H0(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/wn6;->Q1:La/wdk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/xdk0;

    .line 6
    .line 7
    sget-object v2, La/rek0;->b:La/rek0;

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/16 v8, 0x7c

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v3, p1

    .line 16
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 17
    .line 18
    .line 19
    const/16 v7, 0x3fc

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    move-object v2, p0

    .line 24
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p0, "snackbarManager"

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/wn6;->G0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/en6;->a:La/en6;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/wn6;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/fn6;->a:La/fn6;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wn6;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
