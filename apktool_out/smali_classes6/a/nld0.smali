.class public final La/nld0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/nld0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/mi70",
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
.field public static final S1:La/mi70;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/uqi;

.field public M1:La/wdk0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/n0o0;

.field public Q1:Ljava/util/List;

.field public R1:La/vyx;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/nld0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/widget/impl/databinding/FragmentQuickAvailableBinding;"

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
    sput-object v1, La/nld0;->U1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/mi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/nld0;->S1:La/mi70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02ab

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
    iput-object v0, p0, La/nld0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/kld0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/kld0;-><init>(La/nld0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/f1d0;

    .line 18
    .line 19
    const/16 v2, 0x13

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/f1d0;

    .line 27
    .line 28
    const/16 v4, 0x14

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/sld0;

    .line 38
    .line 39
    sget-object v3, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, La/ync0;

    .line 46
    .line 47
    const/16 v4, 0x16

    .line 48
    .line 49
    invoke-direct {v3, v1, v4}, La/ync0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/ync0;

    .line 53
    .line 54
    const/16 v5, 0x17

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, La/ync0;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/nld0;->N1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/lld0;->a:La/lld0;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/nld0;->O1:La/s0r;

    .line 72
    .line 73
    new-instance v0, La/kld0;

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    invoke-direct {v0, p0, v1}, La/kld0;-><init>(La/nld0;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/nld0;->P1:La/n0o0;

    .line 84
    .line 85
    sget-object v0, La/iun;->a:La/iun;

    .line 86
    .line 87
    iput-object v0, p0, La/nld0;->Q1:Ljava/util/List;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/nld0;->G0()La/q3r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/q3r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v1, La/kld0;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-direct {v1, p0, v2}, La/kld0;-><init>(La/nld0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, La/q3r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    iget-object v0, p0, La/nld0;->P1:La/n0o0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, La/jev0;

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/nld0;->R1:La/vyx;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    new-instance v1, La/vyx;

    .line 34
    .line 35
    new-instance v3, La/w9m0;

    .line 36
    .line 37
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/jev0;

    .line 42
    .line 43
    invoke-direct {v3, v0}, La/w9m0;-><init>(La/jev0;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, v3}, La/vyx;-><init>(La/syx;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, La/nld0;->R1:La/vyx;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, La/vyx;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {p0}, La/nld0;->H0()La/sld0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v4, p1, La/sld0;->j:La/p7m0;

    .line 59
    .line 60
    new-instance v5, La/jjc0;

    .line 61
    .line 62
    const/4 v11, 0x4

    .line 63
    const/16 v12, 0xa

    .line 64
    .line 65
    const/4 v6, 0x2

    .line 66
    const-class v8, La/nld0;

    .line 67
    .line 68
    const-string v9, "onDataUiState"

    .line 69
    .line 70
    const-string v10, "onDataUiState(Lorg/xplatform/widget/impl/presentation/quickavailable/config/QuickAvailableWidgetConfigureViewModel$QuickAvailableUiState;)V"

    .line 71
    .line 72
    move-object v7, p0

    .line 73
    invoke-direct/range {v5 .. v12}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    sget-object p1, La/lkz;->a:La/lkz;

    .line 77
    .line 78
    move-object v6, v5

    .line 79
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v3, La/fxc0;

    .line 92
    .line 93
    const/4 v8, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    invoke-direct/range {v3 .. v8}, La/fxc0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v7, v7, v3, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/nld0;->H0()La/sld0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p1, p1, La/sld0;->k:La/ol60;

    .line 106
    .line 107
    new-instance v0, La/d7a0;

    .line 108
    .line 109
    const/16 v1, 0x10

    .line 110
    .line 111
    invoke-direct {v0, p0, v7, v1}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    new-instance v4, La/fxc0;

    .line 127
    .line 128
    invoke-direct {v4, p1, v1, v0, v7}, La/fxc0;-><init>(La/gmq;La/clz;La/d7a0;La/yje;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v3, v7, v7, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 132
    .line 133
    .line 134
    new-instance p1, La/kld0;

    .line 135
    .line 136
    const/4 v0, 0x2

    .line 137
    invoke-direct {p1, p0, v0}, La/kld0;-><init>(La/nld0;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 141
    .line 142
    .line 143
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
    const-class v1, La/jld0;

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
    instance-of v3, v0, La/jld0;

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
    check-cast v2, La/jld0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, La/jld0;->a()La/g45;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, v0, La/g45;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, La/n5d0;

    .line 62
    .line 63
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, La/uqi;

    .line 68
    .line 69
    iput-object v1, p0, La/nld0;->L1:La/uqi;

    .line 70
    .line 71
    iget-object v0, v0, La/g45;->h:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/wdk0;

    .line 74
    .line 75
    iput-object v0, p0, La/nld0;->M1:La/wdk0;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 79
    .line 80
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final G0()La/q3r;
    .locals 2

    .line 1
    sget-object v0, La/nld0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/nld0;->O1:La/s0r;

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
    check-cast p0, La/q3r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/sld0;
    .locals 0

    .line 1
    iget-object p0, p0, La/nld0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/sld0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/nld0;->R1:La/vyx;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, La/vyx;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object v1, p0, La/nld0;->R1:La/vyx;

    .line 13
    .line 14
    return-void
.end method

.method public final d0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Landroid/content/ComponentName;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-class v4, Lorg/xplatform/widget/impl/presentation/quickavailable/widget/MySectionsWidget;

    .line 18
    .line 19
    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Landroid/content/Intent;

    .line 27
    .line 28
    invoke-direct {v2, v0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    const-string v3, "android.appwidget.action.APPWIDGET_UPDATE"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "appWidgetIds"

    .line 38
    .line 39
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 51
    .line 52
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/nld0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
