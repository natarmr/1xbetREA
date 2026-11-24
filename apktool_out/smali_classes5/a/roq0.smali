.class public final La/roq0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static c(La/roq0;Landroidx/fragment/app/e;I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, La/noq0;->m2:La/y2m0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string p0, "TipsDialogTag"

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, La/noq0;

    .line 21
    .line 22
    invoke-direct {v0}, La/noq0;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v1, La/noq0;->n2:[La/iiy;

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    aget-object v2, v1, v2

    .line 29
    .line 30
    iget-object v3, v0, La/noq0;->h2:La/zz2;

    .line 31
    .line 32
    invoke-virtual {v3, v0, v2, p2}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 33
    .line 34
    .line 35
    iget-object p2, v0, La/noq0;->i2:La/phf0;

    .line 36
    .line 37
    const/4 v2, 0x4

    .line 38
    aget-object v1, v1, v2

    .line 39
    .line 40
    const-string v2, ""

    .line 41
    .line 42
    invoke-virtual {p2, v0, v1, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p1, p0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/e;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/noq0;->m2:La/y2m0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string p0, "TipsDialogTag"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_3

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of p0, v0, La/noq0;

    .line 26
    .line 27
    :goto_0
    if-eqz p0, :cond_3

    .line 28
    .line 29
    check-cast v0, La/noq0;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, La/noq0;->Y0()La/xoq0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p1, p0, La/xoq0;->K:La/ocl;

    .line 38
    .line 39
    invoke-virtual {p1}, La/ocl;->m()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    iget-object p1, p0, La/xoq0;->L:La/lsn;

    .line 46
    .line 47
    invoke-virtual {p1}, La/lsn;->f()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget-object p1, p0, La/xoq0;->j0:La/fk60;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iget-object v1, p0, La/xoq0;->O:La/lri;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-virtual {v1, p1, v2}, La/lri;->c(La/fk60;Z)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, La/xoq0;->Q:La/gbi;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, La/gbi;->D(La/fk60;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 72
    .line 73
    .line 74
    :cond_3
    return-void
.end method

.method public final b(Landroidx/fragment/app/Fragment;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 5
    .line 6
    const-string v0, "TipsDialogTag"

    .line 7
    .line 8
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    iget-object p0, p1, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 15
    .line 16
    const-string p1, "OnboardingBottomSheetContainerFragment"

    .line 17
    .line 18
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method

.method public final d(Landroidx/fragment/app/e;ILjava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/ki60;->q2:La/htz;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-string p0, "OnboardingBottomSheetContainerFragment"

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, La/ki60;

    .line 18
    .line 19
    invoke-direct {v0}, La/ki60;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/ki60;->r2:[La/iiy;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    aget-object v2, v1, v2

    .line 26
    .line 27
    iget-object v3, v0, La/ki60;->n2:La/zz2;

    .line 28
    .line 29
    invoke-virtual {v3, v0, v2, p2}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x2

    .line 33
    aget-object p2, v1, p2

    .line 34
    .line 35
    iget-object v1, v0, La/ki60;->o2:La/phf0;

    .line 36
    .line 37
    invoke-virtual {v1, v0, p2, p3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p1, p0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method
