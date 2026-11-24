.class public final La/doe0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/doe0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gle0",
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
.field public static final P1:La/gle0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public final L1:La/hnm0;

.field public M1:La/fiu0;

.field public N1:La/hoe0;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/doe0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/referral/impl/databinding/FragmentReferralProgramLoadDataBinding;"

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
    sput-object v1, La/doe0;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gle0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/doe0;->P1:La/gle0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const v0, 0x7f0d02b3

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
    iput-object v0, p0, La/doe0;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 12
    .line 13
    iput-object v0, p0, La/doe0;->L1:La/hnm0;

    .line 14
    .line 15
    sget-object v0, La/coe0;->a:La/coe0;

    .line 16
    .line 17
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/doe0;->O1:La/s0r;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    sget-object p1, La/doe0;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/doe0;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/x3r;

    .line 16
    .line 17
    iget-object p1, p1, La/x3r;->d:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 18
    .line 19
    new-instance v0, La/l910;

    .line 20
    .line 21
    const/16 v1, 0x1d

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, La/tie0;

    .line 30
    .line 31
    const/4 v0, 0x6

    .line 32
    invoke-direct {p1, p0, v0}, La/tie0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final C0()V
    .locals 11

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
    const-class v1, La/eoe0;

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
    instance-of v3, v0, La/eoe0;

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
    check-cast v2, La/eoe0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v4, v2, La/eoe0;->a:La/pzu;

    .line 56
    .line 57
    iget-object v5, v2, La/eoe0;->b:La/btt0;

    .line 58
    .line 59
    iget-object v6, v2, La/eoe0;->c:La/gii0;

    .line 60
    .line 61
    iget-object v7, v2, La/eoe0;->d:La/m1e;

    .line 62
    .line 63
    iget-object v8, v2, La/eoe0;->e:La/duj;

    .line 64
    .line 65
    iget-object v9, v2, La/eoe0;->f:La/sa10;

    .line 66
    .line 67
    iget-object v10, v2, La/eoe0;->g:La/ioe0;

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v3, La/rrd;

    .line 82
    .line 83
    invoke-direct/range {v3 .. v10}, La/rrd;-><init>(La/pzu;La/btt0;La/gii0;La/m1e;La/duj;La/sa10;La/ioe0;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, La/fiu0;

    .line 87
    .line 88
    iget-object v1, v3, La/rrd;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, La/ppi;

    .line 91
    .line 92
    const-class v2, La/hoe0;

    .line 93
    .line 94
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, La/doe0;->M1:La/fiu0;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 105
    .line 106
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final D0()V
    .locals 14

    .line 1
    iget-object v0, p0, La/doe0;->N1:La/hoe0;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v2, v0, La/hoe0;->h:La/p7m0;

    .line 7
    .line 8
    new-instance v4, La/jjc0;

    .line 9
    .line 10
    const/4 v12, 0x4

    .line 11
    const/16 v13, 0x14

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    const-class v9, La/doe0;

    .line 15
    .line 16
    const-string v10, "handleUiState"

    .line 17
    .line 18
    const-string v11, "handleUiState(Lorg/xplatform/referral/impl/presentation/loaddata/LoadDataState;)V"

    .line 19
    .line 20
    move-object v8, p0

    .line 21
    move-object v6, v4

    .line 22
    invoke-direct/range {v6 .. v13}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 23
    .line 24
    .line 25
    sget-object p0, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    invoke-static {v8}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance v1, La/g4e0;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct/range {v1 .. v6}, La/g4e0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;S)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x3

    .line 46
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    const-string p0, "viewModel"

    .line 51
    .line 52
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v5
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/doe0;->M1:La/fiu0;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->g()La/piu0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p0}, La/u4n0;->o(La/riu0;)La/wbf;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v2, La/h0q0;

    .line 20
    .line 21
    invoke-direct {v2, v0, p1, v1}, La/h0q0;-><init>(La/piu0;La/miu0;La/wbf;)V

    .line 22
    .line 23
    .line 24
    const-class p1, La/hoe0;

    .line 25
    .line 26
    sget-object v0, La/sre0;->a:La/tre0;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, La/ny9;->T(La/sgy;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v2, p1, v0}, La/h0q0;->t(La/sgy;Ljava/lang/String;)La/diu0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, La/hoe0;

    .line 49
    .line 50
    iput-object p1, p0, La/doe0;->N1:La/hoe0;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    const-string p0, "viewModelFactory"

    .line 60
    .line 61
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/doe0;->N1:La/hoe0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/hoe0;->g:La/c4m0;

    .line 9
    .line 10
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "viewModel"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/doe0;->N1:La/hoe0;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, La/hoe0;->g:La/c4m0;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, La/pby;->isActive()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v1, p0, La/hoe0;->d:La/m1e;

    .line 22
    .line 23
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v3, La/foe0;

    .line 28
    .line 29
    invoke-direct {v3, p0, v0, v2}, La/foe0;-><init>(La/hoe0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    new-instance v0, La/fnq;

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    invoke-direct {v0, v1, v3, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 36
    .line 37
    .line 38
    sget-object v1, La/goe0;->h:La/goe0;

    .line 39
    .line 40
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v0, v2, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/hoe0;->g:La/c4m0;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    const-string p0, "viewModel"

    .line 52
    .line 53
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/doe0;->L1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/doe0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
