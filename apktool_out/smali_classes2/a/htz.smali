.class public final La/htz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/am30;
.implements La/vuw;
.implements La/rh60;


# direct methods
.method public static d(Landroidx/recyclerview/widget/RecyclerView;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 10
    .line 11
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    const-string p0, "StickyListHeadersDecoration can only be used with a LinearLayoutManager."

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static e(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 10
    .line 11
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    const-string p0, "StickyListHeadersDecoration can only be used with a LinearLayoutManager."

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public static f(Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;)La/q000;
    .locals 3

    .line 1
    new-instance v0, La/q000;

    .line 2
    .line 3
    invoke-direct {v0}, La/q000;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, La/q000;->Q1:[La/iiy;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget-object v1, v1, v2

    .line 10
    .line 11
    iget-object v2, v0, La/q000;->K1:La/khf0;

    .line 12
    .line 13
    invoke-virtual {v2, v0, v1, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static g(JLa/csr;ZZLjava/lang/String;)La/ca70;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/ca70;

    .line 8
    .line 9
    invoke-direct {v0}, La/ca70;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "OneXGamesWebGame.BUNDLE_GAME_ID"

    .line 18
    .line 19
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {v2, v1, p0}, La/lv00;->S(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "OneXGamesWebGame.BUNDLE_GAME_BONUS"

    .line 27
    .line 28
    invoke-static {p0, v1, p2}, La/lv00;->S(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const-string p0, "OneXGamesWebGame.BUNDLE_PROMO_GAME"

    .line 32
    .line 33
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p0, v1, p1}, La/lv00;->S(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    invoke-static {p0}, La/sj3;->J(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p0, 0x1

    .line 52
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string p1, "OneXGamesWebGame.BUNDLE_ANIMATIONS_ENABLED"

    .line 57
    .line 58
    invoke-static {p1, v1, p0}, La/lv00;->S(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "OneXGamesWebGame.BUNDLE_FULL_SCREEN"

    .line 62
    .line 63
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p0, v1, p1}, La/lv00;->S(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const-string p0, "OneXGamesWebGame.BUNDLE_SESSION_ID"

    .line 71
    .line 72
    invoke-static {p0, v1, p5}, La/lv00;->S(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method

.method public static h(Ljava/lang/String;)La/iz30;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 5
    .line 6
    invoke-static {p0}, La/iz30;->valueOf(Ljava/lang/String;)La/iz30;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 13
    .line 14
    new-instance v0, La/g0g0;

    .line 15
    .line 16
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v0, p0, La/g0g0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :cond_0
    check-cast p0, La/iz30;

    .line 27
    .line 28
    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 0

    .line 1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public b()J
    .locals 0

    .line 1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public next()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public p(Ljava/lang/String;)La/zv00;
    .locals 0

    .line 1
    sget-object p0, La/u850;->b:La/u850;

    .line 2
    .line 3
    return-object p0
.end method
