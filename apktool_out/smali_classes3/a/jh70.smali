.class public final La/jh70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zxv;
.implements La/uw90;
.implements La/s2c0;


# direct methods
.method public static a(Ljava/lang/String;La/psq;I)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    sget-object v0, La/psq;->e:La/psq;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    if-nez p2, :cond_3

    .line 23
    .line 24
    sget-object v0, La/psq;->g:La/psq;

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    :cond_2
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    const/4 v0, 0x0

    .line 44
    if-nez p0, :cond_4

    .line 45
    .line 46
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    invoke-static {p0, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    iget p1, p1, La/psq;->a:I

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    if-ne p2, v1, :cond_5

    .line 57
    .line 58
    move v0, v1

    .line 59
    :cond_5
    invoke-static {p0, p1, v0}, La/uvk;->f(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static f(Ljava/lang/Integer;)La/sba0;
    .locals 3

    .line 1
    sget-object v0, La/sba0;->c:La/sba0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    :goto_0
    sget-object v0, La/sba0;->d:La/sba0;

    .line 15
    .line 16
    if-nez p0, :cond_2

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x2

    .line 24
    if-ne v1, v2, :cond_3

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_3
    :goto_1
    sget-object v0, La/sba0;->e:La/sba0;

    .line 28
    .line 29
    if-nez p0, :cond_4

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/4 v1, 0x3

    .line 37
    if-ne p0, v1, :cond_5

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_5
    :goto_2
    sget-object p0, La/sba0;->f:La/sba0;

    .line 41
    .line 42
    return-object p0
.end method

.method public static g()Ljava/util/ArrayList;
    .locals 4

    .line 1
    sget-object v0, La/d590;->e:La/c0o;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/y2;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, v0, v3}, La/y2;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v2}, La/y2;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, La/y2;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/d590;

    .line 31
    .line 32
    iget-object v0, v0, La/d590;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v1
.end method

.method public static h()[Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, La/d590;->e:La/c0o;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/y2;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, v0, v3}, La/y2;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v2}, La/y2;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, La/y2;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/d590;

    .line 31
    .line 32
    iget-object v0, v0, La/d590;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-array v0, v3, [Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [Ljava/lang/String;

    .line 45
    .line 46
    return-object v0
.end method

.method public static i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;-><init>(La/zuc0;J)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public static j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public b(La/vjt;La/psq;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    iget-object p0, p1, La/vjt;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, p2, p3}, La/jh70;->a(Ljava/lang/String;La/psq;I)Landroid/graphics/Typeface;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public c(La/psq;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0, p1, p2}, La/jh70;->a(Ljava/lang/String;La/psq;I)Landroid/graphics/Typeface;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method

.method public e(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(La/vmu0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Landroidx/fragment/app/e;La/dqe;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/bqe;->o2:La/kwd;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object p0, La/bqe;->q2:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, La/bqe;

    .line 19
    .line 20
    invoke-direct {v0}, La/bqe;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v1, La/bqe;->p2:[La/iiy;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aget-object v1, v1, v2

    .line 27
    .line 28
    iget-object v2, v0, La/bqe;->n2:La/yzn0;

    .line 29
    .line 30
    invoke-virtual {v2, v0, v1, p2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, p0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public m(Landroidx/fragment/app/e;La/ft00;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, La/ct00;->n2:La/atz;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object p0, La/ct00;->p2:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, La/ct00;

    .line 19
    .line 20
    invoke-direct {v0}, La/ct00;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v1, La/ct00;->o2:[La/iiy;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aget-object v1, v1, v2

    .line 27
    .line 28
    iget-object v2, v0, La/ct00;->m2:La/yzn0;

    .line 29
    .line 30
    invoke-virtual {v2, v0, v1, p2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, p0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
