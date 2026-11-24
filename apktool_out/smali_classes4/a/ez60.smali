.class public final La/ez60;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/ia50;
.implements La/cg60;
.implements La/d9o0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "La/ez60;",
        "La/yx5;",
        "La/ia50;",
        "La/cg60;",
        "La/d9o0;",
        "<init>",
        "()V",
        "games_list"
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
.field public final K1:Z

.field public L1:La/nmi;

.field public M1:La/fiu0;

.field public N1:La/ii;

.field public final O1:La/kiu0;

.field public final P1:La/kiu0;

.field public final Q1:La/s0r;

.field public R1:La/aa50;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ez60;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/games_list/databinding/FragmentGamesBottomCategoryFgBinding;"

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
    sput-object v1, La/ez60;->S1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const v0, 0x7f0d0243

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/ez60;->K1:Z

    .line 9
    .line 10
    new-instance v1, La/yy60;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0}, La/yy60;-><init>(La/ez60;B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/dz60;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, p0, v3}, La/dz60;-><init>(La/ez60;B)V

    .line 19
    .line 20
    .line 21
    sget-object v3, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v4, La/ej50;

    .line 24
    .line 25
    const/16 v5, 0x15

    .line 26
    .line 27
    invoke-direct {v4, v2, v5}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sget-object v4, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    const-class v5, La/k370;

    .line 37
    .line 38
    invoke-virtual {v4, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    new-instance v6, La/co60;

    .line 43
    .line 44
    const/16 v7, 0xe

    .line 45
    .line 46
    invoke-direct {v6, v2, v7}, La/co60;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/co60;

    .line 50
    .line 51
    const/16 v8, 0xf

    .line 52
    .line 53
    invoke-direct {v7, v2, v8}, La/co60;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v5, v6, v7, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, La/ez60;->O1:La/kiu0;

    .line 61
    .line 62
    new-instance v1, La/yy60;

    .line 63
    .line 64
    const/4 v2, 0x2

    .line 65
    invoke-direct {v1, p0, v2}, La/yy60;-><init>(La/ez60;B)V

    .line 66
    .line 67
    .line 68
    new-instance v2, La/dz60;

    .line 69
    .line 70
    invoke-direct {v2, p0, v0}, La/dz60;-><init>(La/ez60;B)V

    .line 71
    .line 72
    .line 73
    new-instance v0, La/ej50;

    .line 74
    .line 75
    const/16 v5, 0x16

    .line 76
    .line 77
    invoke-direct {v0, v2, v5}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-class v2, La/g670;

    .line 85
    .line 86
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v3, La/co60;

    .line 91
    .line 92
    const/16 v4, 0x10

    .line 93
    .line 94
    invoke-direct {v3, v0, v4}, La/co60;-><init>(La/a8z;B)V

    .line 95
    .line 96
    .line 97
    new-instance v4, La/co60;

    .line 98
    .line 99
    const/16 v5, 0x11

    .line 100
    .line 101
    invoke-direct {v4, v0, v5}, La/co60;-><init>(La/a8z;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, La/ez60;->P1:La/kiu0;

    .line 109
    .line 110
    sget-object v0, La/zy60;->a:La/zy60;

    .line 111
    .line 112
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, p0, La/ez60;->Q1:La/s0r;

    .line 117
    .line 118
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, La/cz60;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const-class v4, La/g670;

    .line 18
    .line 19
    const-string v5, "onGamesUMResultReceive"

    .line 20
    .line 21
    const-string v6, "onGamesUMResultReceive$games_list()V"

    .line 22
    .line 23
    invoke-direct/range {v1 .. v8}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/16 v5, 0x16

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    move-object v3, v1

    .line 31
    move-object v1, p0

    .line 32
    invoke-static/range {v0 .. v5}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/yy60;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-direct {p0, v1, p1}, La/yy60;-><init>(La/ez60;B)V

    .line 39
    .line 40
    .line 41
    const-string p1, "CHANGE_BALANCE_TO_PRIMARY_KEY"

    .line 42
    .line 43
    invoke-static {v1, p1, p0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance p1, La/ex60;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-direct {p1, v1, v0}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    const-string v2, "CHANGE_TAB_REQUEST_KEY"

    .line 57
    .line 58
    invoke-virtual {p0, v2, v1, p1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance p1, La/vr3;

    .line 66
    .line 67
    const/4 v2, 0x2

    .line 68
    invoke-direct {p1, v1, v2}, La/vr3;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, La/ez60;->G0()La/j0r;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object p0, p0, La/j0r;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 79
    .line 80
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, La/zdx;->A(La/kxq;)La/ba50;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance v3, La/aa50;

    .line 89
    .line 90
    invoke-direct {v3, p1}, La/aa50;-><init>(La/ba50;)V

    .line 91
    .line 92
    .line 93
    new-array p1, v2, [I

    .line 94
    .line 95
    new-instance v2, La/vv5;

    .line 96
    .line 97
    invoke-direct {v2, p1, v3, v0}, La/vv5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    new-instance v4, La/bc0;

    .line 101
    .line 102
    const/16 v5, 0x9

    .line 103
    .line 104
    invoke-direct {v4, v2, v5}, La/bc0;-><init>(Ljava/lang/Object;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v4}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_0

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 120
    .line 121
    .line 122
    aget p0, p1, v0

    .line 123
    .line 124
    int-to-float p0, p0

    .line 125
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {v3, p0}, La/aa50;->a(Ljava/lang/Float;)V

    .line 130
    .line 131
    .line 132
    :cond_0
    iput-object v3, v1, La/ez60;->R1:La/aa50;

    .line 133
    .line 134
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
    invoke-static {p0}, La/a4n0;->e(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v2, La/pmi;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, La/pmi;-><init>(La/g8i;La/i1w0;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v2, La/pmi;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, La/n5d0;

    .line 46
    .line 47
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, La/nmi;

    .line 52
    .line 53
    iput-object v1, p0, La/ez60;->L1:La/nmi;

    .line 54
    .line 55
    new-instance v1, La/fiu0;

    .line 56
    .line 57
    iget-object v2, v2, La/pmi;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, La/omi;

    .line 60
    .line 61
    const-class v3, La/k370;

    .line 62
    .line 63
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, La/ez60;->M1:La/fiu0;

    .line 71
    .line 72
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/ez60;->N1:La/ii;

    .line 77
    .line 78
    return-void

    .line 79
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.dependencies.OneXGamesDependencies"

    .line 80
    .line 81
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g670;->D:La/ol60;

    .line 6
    .line 7
    new-instance v1, La/bz60;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    invoke-direct {v1, p0, v8, v3}, La/bz60;-><init>(La/ez60;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v3, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v5, La/az60;

    .line 29
    .line 30
    invoke-direct {v5, v0, v3, v1, v8}, La/az60;-><init>(La/gmq;La/clz;La/bz60;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v9, 0x3

    .line 34
    invoke-static {v4, v8, v8, v5, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, v0, La/g670;->E:La/p7m0;

    .line 42
    .line 43
    new-instance v10, La/m430;

    .line 44
    .line 45
    const/4 v3, 0x6

    .line 46
    invoke-direct {v10, v1, v0, v3}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance v0, La/vf20;

    .line 50
    .line 51
    const/4 v6, 0x4

    .line 52
    const/16 v7, 0x16

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    const-class v3, La/ez60;

    .line 56
    .line 57
    const-string v4, "handleTabBarState"

    .line 58
    .line 59
    const-string v5, "handleTabBarState(Lorg/xplatform/games_list/features/games/container/models/OneXGamesHolderUiModel;)V"

    .line 60
    .line 61
    move-object v2, p0

    .line 62
    invoke-direct/range {v0 .. v7}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v4, La/az60;

    .line 78
    .line 79
    invoke-direct {v4, v10, v1, v0, v8}, La/az60;-><init>(La/m430;La/clz;La/vf20;La/yje;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v8, v8, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v10, v0, La/g670;->F:La/ol60;

    .line 90
    .line 91
    new-instance v0, La/vf20;

    .line 92
    .line 93
    const/16 v7, 0x17

    .line 94
    .line 95
    const/4 v1, 0x2

    .line 96
    const-string v4, "handleNavigationEvent"

    .line 97
    .line 98
    const-string v5, "handleNavigationEvent(Lorg/xplatform/games_list/features/games/container/OneXGamesViewModel$NavEvent;)V"

    .line 99
    .line 100
    move-object v2, p0

    .line 101
    invoke-direct/range {v0 .. v7}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 102
    .line 103
    .line 104
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    new-instance v4, La/az60;

    .line 117
    .line 118
    invoke-direct {v4, v10, v1, v0, v8}, La/az60;-><init>(La/gmq;La/clz;La/vf20;La/yje;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v3, v8, v8, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, La/ez60;->O1:La/kiu0;

    .line 125
    .line 126
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, La/k370;

    .line 131
    .line 132
    invoke-virtual {v0}, La/k370;->w()La/gmq;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v1, La/bz60;

    .line 137
    .line 138
    const/4 v3, 0x1

    .line 139
    invoke-direct {v1, p0, v8, v3}, La/bz60;-><init>(La/ez60;La/yje;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    new-instance v4, La/az60;

    .line 155
    .line 156
    check-cast v0, La/i89;

    .line 157
    .line 158
    invoke-direct {v4, v0, v2, v1, v8}, La/az60;-><init>(La/i89;La/clz;La/bz60;La/yje;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v3, v8, v8, v4, v9}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final G0()La/j0r;
    .locals 2

    .line 1
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ez60;->Q1:La/s0r;

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
    check-cast p0, La/j0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/g670;
    .locals 0

    .line 1
    iget-object p0, p0, La/ez60;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/g670;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    iget-object v0, p0, La/ez60;->R1:La/aa50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/aa50;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, La/ez60;->R1:La/aa50;

    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final g0()V
    .locals 9

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v0, La/g670;->m:La/mne;

    .line 13
    .line 14
    iget-object v4, v2, La/mne;->b:La/dvj;

    .line 15
    .line 16
    new-instance v2, La/m570;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    invoke-direct {v2, v0, v7}, La/m570;-><init>(La/g670;B)V

    .line 20
    .line 21
    .line 22
    new-instance v5, La/w570;

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    invoke-direct {v5, v0, v8, v7}, La/w570;-><init>(La/g670;La/yje;B)V

    .line 26
    .line 27
    .line 28
    const/16 v6, 0xa

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-object v0, p0, La/g670;->G:La/c4m0;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const/4 v1, 0x1

    .line 47
    if-ne v0, v1, :cond_0

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget-object v0, p0, La/g670;->v:La/ba50;

    .line 51
    .line 52
    iget-object v0, v0, La/ba50;->a:La/p7m0;

    .line 53
    .line 54
    new-instance v1, La/h2c;

    .line 55
    .line 56
    const/16 v2, 0x11

    .line 57
    .line 58
    invoke-direct {v1, v0, v2}, La/h2c;-><init>(La/p7m0;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, La/c670;

    .line 66
    .line 67
    invoke-direct {v1, p0, v8, v7}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 68
    .line 69
    .line 70
    new-instance v2, La/fnq;

    .line 71
    .line 72
    const/4 v3, 0x4

    .line 73
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v1, p0, La/g670;->m:La/mne;

    .line 81
    .line 82
    iget-object v1, v1, La/mne;->c:La/vs10;

    .line 83
    .line 84
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v1, La/foe;->h:La/foe;

    .line 89
    .line 90
    invoke-static {v2, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, La/g670;->G:La/c4m0;

    .line 95
    .line 96
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/g670;->G:La/c4m0;

    .line 6
    .line 7
    invoke-static {v0}, La/v3c;->N(La/bby;)V

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

.method public final j()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 6
    .line 7
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    move-object v3, v1

    .line 34
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 35
    .line 36
    instance-of v4, v3, La/y370;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    check-cast v3, La/y370;

    .line 41
    .line 42
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->S()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v1, v2

    .line 50
    :goto_0
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 51
    .line 52
    instance-of v0, v1, La/cg60;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    move-object v2, v1

    .line 57
    check-cast v2, La/cg60;

    .line 58
    .line 59
    :cond_2
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-interface {v2}, La/cg60;->j()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    const/4 v0, 0x1

    .line 67
    :goto_1
    const/4 v1, 0x0

    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-static {p0}, La/a4n0;->e(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v2, La/c8d;

    .line 80
    .line 81
    sget-object v3, La/y7d;->a:La/v7d;

    .line 82
    .line 83
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 84
    .line 85
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_2
    move-object v2, v0

    .line 93
    check-cast v2, La/paw;

    .line 94
    .line 95
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, La/oe50;

    .line 106
    .line 107
    invoke-virtual {p0, v2}, La/i1w0;->a(La/oe50;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    :goto_3
    return v1
.end method

.method public final m(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ez60;->G0()La/j0r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/j0r;->a:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p0, p1, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ez60;->K1:Z

    .line 2
    .line 3
    return p0
.end method
