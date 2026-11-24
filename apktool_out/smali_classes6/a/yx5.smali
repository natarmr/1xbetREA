.class public abstract La/yx5;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# instance fields
.field public final H1:La/g9o0;

.field public final I1:La/inm0;

.field public final J1:La/n0o0;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/Fragment;-><init>(I)V

    .line 2
    .line 3
    .line 4
    sget-object p1, La/g9o0;->a:La/g9o0;

    .line 5
    .line 6
    iput-object p1, p0, La/yx5;->H1:La/g9o0;

    .line 7
    .line 8
    sget-object p1, La/inm0;->a:La/inm0;

    .line 9
    .line 10
    iput-object p1, p0, La/yx5;->I1:La/inm0;

    .line 11
    .line 12
    new-instance p1, La/zo4;

    .line 13
    .line 14
    const/16 v0, 0xe

    .line 15
    .line 16
    invoke-direct {p1, p0, v0}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, La/yx5;->J1:La/n0o0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public A0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public B0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public C0()V
    .locals 0

    .line 1
    return-void
.end method

.method public D0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final E0(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    new-instance v1, La/da40;

    .line 4
    .line 5
    const/16 v2, 0x19

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/da40;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v0}, La/lgi0;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, La/j9x;->Z:La/j9x;

    .line 15
    .line 16
    invoke-static {v0, v1}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La/b5q;

    .line 21
    .line 22
    invoke-direct {v1, v0}, La/b5q;-><init>(La/c5q;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v1}, La/b5q;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, La/b5q;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v3, v0

    .line 37
    check-cast v3, La/yx5;

    .line 38
    .line 39
    invoke-virtual {v3}, La/yx5;->A0()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v0, v2

    .line 47
    :goto_0
    check-cast v0, La/yx5;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    :goto_1
    invoke-static {p0}, La/zdx;->B(Landroidx/fragment/app/Fragment;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    instance-of v0, p0, La/da50;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    check-cast p0, La/da50;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    move-object p0, v2

    .line 84
    :goto_2
    if-nez p0, :cond_6

    .line 85
    .line 86
    :goto_3
    return-void

    .line 87
    :cond_6
    check-cast p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 88
    .line 89
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->Z:La/ba50;

    .line 90
    .line 91
    if-eqz p0, :cond_7

    .line 92
    .line 93
    invoke-virtual {p0, p1}, La/ba50;->a(Z)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_7
    const-string p0, "navBarHolder"

    .line 98
    .line 99
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v2
.end method

.method public final F0()V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/yx5;->z0()La/j9o0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/i9o0;->a:La/i9o0;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_9

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, La/yx5;->x0()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sget-object v2, La/h9o0;->a:La/h9o0;

    .line 34
    .line 35
    sget-object v3, La/g9o0;->a:La/g9o0;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, La/yx5;->z0()La/j9o0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p0}, La/yx5;->x0()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, La/yx5;->z0()La/j9o0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    move-object v2, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p0}, La/yx5;->z0()La/j9o0;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    :goto_0
    invoke-static {v2}, La/jtm0;->l(La/j9o0;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-static {v3, p0}, La/etm0;->j(ILandroidx/fragment/app/Fragment;)V

    .line 77
    .line 78
    .line 79
    move-object v0, v2

    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v0}, La/jtm0;->k(La/j9o0;)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    instance-of v6, v0, La/e9o0;

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x1

    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    move-object v9, v0

    .line 99
    check-cast v9, La/e9o0;

    .line 100
    .line 101
    iget-object v9, v9, La/e9o0;->c:La/bp3;

    .line 102
    .line 103
    invoke-virtual {v9, v5}, La/bp3;->a(Landroid/content/Context;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-static {v5}, La/qem0;->r(Landroid/content/Context;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-nez v5, :cond_5

    .line 113
    .line 114
    move v5, v8

    .line 115
    goto :goto_1

    .line 116
    :cond_5
    move v5, v7

    .line 117
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-eqz v6, :cond_7

    .line 122
    .line 123
    check-cast v0, La/e9o0;

    .line 124
    .line 125
    iget-object v0, v0, La/e9o0;->d:La/bp3;

    .line 126
    .line 127
    invoke-virtual {v0, p0}, La/bp3;->a(Landroid/content/Context;)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    :cond_6
    :goto_2
    move v6, v7

    .line 132
    goto :goto_3

    .line 133
    :cond_7
    instance-of v6, v0, La/f9o0;

    .line 134
    .line 135
    if-eqz v6, :cond_8

    .line 136
    .line 137
    check-cast v0, La/f9o0;

    .line 138
    .line 139
    iget-object v0, v0, La/f9o0;->b:La/bp3;

    .line 140
    .line 141
    invoke-virtual {v0, p0}, La/bp3;->a(Landroid/content/Context;)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    goto :goto_2

    .line 146
    :cond_8
    invoke-static {p0}, La/qem0;->r(Landroid/content/Context;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_6

    .line 151
    .line 152
    move v6, v8

    .line 153
    :goto_3
    invoke-static/range {v1 .. v6}, La/ofm0;->y(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 154
    .line 155
    .line 156
    :cond_9
    :goto_4
    return-void
.end method

.method public V(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->V(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/yx5;->C0()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Current screen: "

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "onCreate"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->W(Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public Z()V
    .locals 2

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
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, La/yx5;->J1:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/Runnable;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 32
    .line 33
    return-void
.end method

.method public e0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/yx5;->F0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public g0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/yx5;->x0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0, v0}, La/yx5;->E0(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, La/qem0;->p(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1, v0}, Landroid/content/Context;->setTheme(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/yx5;->y0()La/jnm0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object v0, La/inm0;->a:La/inm0;

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, La/gne;

    .line 37
    .line 38
    const/16 v1, 0x10

    .line 39
    .line 40
    invoke-direct {v0, p0, v1}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 44
    .line 45
    invoke-static {p1, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {p0, p2}, La/yx5;->B0(Landroid/os/Bundle;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/yx5;->D0()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, La/yx5;->J1:La/n0o0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Runnable;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/lang/Runnable;

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public x0()Z
    .locals 0

    .line 1
    instance-of p0, p0, La/v51;

    .line 2
    .line 3
    return p0
.end method

.method public y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/yx5;->I1:La/inm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/yx5;->H1:La/g9o0;

    .line 2
    .line 3
    return-object p0
.end method
