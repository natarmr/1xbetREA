.class public abstract La/zz5;
.super La/yx5;
.source "SourceFile"


# instance fields
.field public K1:La/c720;

.field public L1:Z


# direct methods
.method public static G0(Landroidx/fragment/app/Fragment;)La/c720;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, La/c720;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, La/c720;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, La/zz5;->G0(Landroidx/fragment/app/Fragment;)La/c720;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    const-string p0, "MakeBetLoaderFragment not found"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final H0(Landroidx/fragment/app/Fragment;)La/i6q;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    instance-of v0, p1, La/i6q;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, La/i6q;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, La/zz5;->H0(Landroidx/fragment/app/Fragment;)La/i6q;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    const-string p0, "MakeBetLoaderFragment not found"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public abstract I0()Landroid/view/View;
.end method

.method public J0(La/r0o;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/p0o;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, La/zz5;->G0(Landroidx/fragment/app/Fragment;)La/c720;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast p1, La/p0o;

    .line 13
    .line 14
    iget-object v2, p1, La/p0o;->a:La/xdk0;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, v3, La/c720;->g2:La/wdk0;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3}, La/c720;->V0()La/c6q;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object v5, p0, La/c6q;->c:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const/16 v8, 0x3f4

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string p0, "snackbarManager"

    .line 39
    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0

    .line 45
    :cond_1
    return-void
.end method

.method public final K0(La/k520;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/j320;->a:La/j320;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/zz5;->K1:La/c720;

    .line 13
    .line 14
    if-eqz p0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    instance-of v0, p1, La/h520;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    check-cast p1, La/h520;

    .line 25
    .line 26
    iget-object v7, p1, La/h520;->f:Ljava/lang/String;

    .line 27
    .line 28
    iget-boolean v0, p1, La/h520;->a:Z

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p0}, La/zz5;->H0(Landroidx/fragment/app/Fragment;)La/i6q;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p1, La/h520;->b:Ljava/lang/String;

    .line 37
    .line 38
    iget-wide v2, p1, La/h520;->c:J

    .line 39
    .line 40
    invoke-virtual {v0, v2, v3, v1, v7}, La/i6q;->L0(JLjava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p0, p0}, La/zz5;->H0(Landroidx/fragment/app/Fragment;)La/i6q;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v5, p1, La/h520;->b:Ljava/lang/String;

    .line 49
    .line 50
    iget-wide v3, p1, La/h520;->c:J

    .line 51
    .line 52
    iget-object v6, p1, La/h520;->d:Ljava/lang/String;

    .line 53
    .line 54
    iget-wide v1, p1, La/h520;->e:D

    .line 55
    .line 56
    iget-object v8, p1, La/h520;->g:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v9, p1, La/h520;->h:Ljava/lang/String;

    .line 59
    .line 60
    iget-boolean v10, p1, La/h520;->i:Z

    .line 61
    .line 62
    invoke-virtual/range {v0 .. v10}, La/i6q;->K0(DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    :goto_0
    iget-object p0, p0, La/zz5;->K1:La/c720;

    .line 66
    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void

    .line 73
    :cond_3
    sget-object v0, La/l320;->a:La/l320;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_4
    sget-object v0, La/i520;->a:La/i520;

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 5
    .line 6
    instance-of v0, p1, La/c720;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, La/c720;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput-object p1, p0, La/zz5;->K1:La/c720;

    .line 15
    .line 16
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/zz5;->I0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput-boolean v0, p0, La/zz5;->L1:Z

    .line 13
    .line 14
    return-void
.end method

.method public final e0()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/zz5;->L1:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/zz5;->I0()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 13
    .line 14
    .line 15
    new-instance v0, La/hp2;

    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v0, p0, v2, v1}, La/hp2;-><init>(Ljava/lang/Object;ZB)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
