.class public final La/zl10;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/zl10;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wsz",
        "lucky_wheel"
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
.field public static final U1:La/wsz;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public K1:La/oki;

.field public L1:La/ii;

.field public M1:La/mj8;

.field public N1:La/sxs0;

.field public O1:La/uxs0;

.field public final P1:La/e9o0;

.field public final Q1:La/s0r;

.field public final R1:La/yzn0;

.field public final S1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/zl10;

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
    const-string v3, "bonus"

    .line 16
    .line 17
    const-string v5, "getBonus()Lorg/xplatform/games_section/api/models/GameBonus;"

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
    sput-object v1, La/zl10;->V1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/wsz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/zl10;->U1:La/wsz;

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
    iput-object v0, p0, La/zl10;->P1:La/e9o0;

    .line 21
    .line 22
    sget-object v0, La/yl10;->a:La/yl10;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/zl10;->Q1:La/s0r;

    .line 29
    .line 30
    new-instance v0, La/yzn0;

    .line 31
    .line 32
    const-string v1, "lucky_wheel_bonus"

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/zl10;->R1:La/yzn0;

    .line 38
    .line 39
    const-class v0, La/pn10;

    .line 40
    .line 41
    sget-object v1, La/sre0;->a:La/tre0;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, La/wl10;

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-direct {v1, p0, v2}, La/wl10;-><init>(La/zl10;B)V

    .line 51
    .line 52
    .line 53
    const/16 v2, 0xe

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/zl10;->S1:La/a8z;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/wl10;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-direct {p1, p0, v0}, La/wl10;-><init>(La/zl10;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "LUCKY_WHEEL_REQUEST_ERROR_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/wl10;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    invoke-direct {p1, p0, v0}, La/wl10;-><init>(La/zl10;B)V

    .line 16
    .line 17
    .line 18
    const-string v0, "LUCKY_WHEEL_BONUS_BALANCE_UNAVAILABLE_DIALOG_KEY"

    .line 19
    .line 20
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, La/wl10;

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    invoke-direct {p1, p0, v0}, La/wl10;-><init>(La/zl10;B)V

    .line 27
    .line 28
    .line 29
    const-string v0, "LUCKY_WHEEL_NOT_ENOUGH_FUNDS_DIALOG_KEY"

    .line 30
    .line 31
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, La/gf10;

    .line 35
    .line 36
    const/4 v1, 0x6

    .line 37
    invoke-direct {p1, v1}, La/gf10;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, La/wl10;

    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    invoke-direct {p1, p0, v0}, La/wl10;-><init>(La/zl10;B)V

    .line 47
    .line 48
    .line 49
    const-string v0, "LUCKY_WHEEL_SPORT_BONUS_BALANCE_UNAVAILABLE_DIALOG_KEY"

    .line 50
    .line 51
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, La/zl10;->N1:La/sxs0;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v1, La/xl10;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-direct {v1, p0, v2}, La/xl10;-><init>(La/zl10;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, p0, v1}, La/sxs0;->d(Landroidx/fragment/app/e;La/yx5;Lkotlin/jvm/functions/Function1;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, La/wl10;

    .line 76
    .line 77
    invoke-direct {p1, p0, v2}, La/wl10;-><init>(La/zl10;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, La/zl10;->V1:[La/iiy;

    .line 84
    .line 85
    aget-object p1, p1, v2

    .line 86
    .line 87
    iget-object v1, p0, La/zl10;->Q1:La/s0r;

    .line 88
    .line 89
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    check-cast p1, La/aid;

    .line 97
    .line 98
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 99
    .line 100
    new-instance v1, La/g2z;

    .line 101
    .line 102
    const/16 v2, 0x19

    .line 103
    .line 104
    invoke-direct {v1, p0, v2}, La/g2z;-><init>(Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    new-instance p0, La/ugd;

    .line 108
    .line 109
    const v2, -0x19ef8a50

    .line 110
    .line 111
    .line 112
    const/4 v3, 0x1

    .line 113
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_0
    const-string p0, "wildFreeBetResultListener"

    .line 121
    .line 122
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0
.end method

.method public final C0()V
    .locals 5

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
    new-instance v1, La/atz;

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
    new-instance v3, La/pki;

    .line 44
    .line 45
    new-instance v4, La/sek;

    .line 46
    .line 47
    invoke-direct {v4}, La/sek;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-direct {v3, v1, v4, v0, v2}, La/pki;-><init>(La/atz;La/sek;La/g8i;La/i1w0;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v3, La/pki;->o0:La/n5d0;

    .line 54
    .line 55
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, La/oki;

    .line 60
    .line 61
    iput-object v1, p0, La/zl10;->K1:La/oki;

    .line 62
    .line 63
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iput-object v1, p0, La/zl10;->L1:La/ii;

    .line 68
    .line 69
    iget-object v0, v0, La/g8i;->Q1:La/n5d0;

    .line 70
    .line 71
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/r9u;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v1, La/mj8;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-direct {v1, v0, v2}, La/mj8;-><init>(La/r9u;B)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, La/zl10;->M1:La/mj8;

    .line 87
    .line 88
    new-instance v0, La/sxs0;

    .line 89
    .line 90
    const/16 v1, 0xf

    .line 91
    .line 92
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, La/zl10;->N1:La/sxs0;

    .line 96
    .line 97
    new-instance v0, La/uxs0;

    .line 98
    .line 99
    invoke-direct {v0, v1}, La/uxs0;-><init>(B)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, La/zl10;->O1:La/uxs0;

    .line 103
    .line 104
    return-void

    .line 105
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.dependencies.LuckyWheelDependencies"

    .line 106
    .line 107
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_1
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_2
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final G0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/zl10;->L1:La/ii;

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

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zl10;->S1:La/a8z;

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

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/zl10;->H0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/cl10;->a:La/cl10;

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
    iget-object p0, p0, La/zl10;->P1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
