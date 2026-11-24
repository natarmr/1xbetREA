.class public final La/xi70;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static c(La/hzs0;La/fay;La/hcp0;La/wsy;)La/pzs0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-boolean p2, p1, La/fay;->c:Z

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, La/gay;->a:La/gay;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/16 v5, 0x3d

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    move-object v0, p1

    .line 23
    invoke-static/range {v0 .. v5}, La/fay;->a(La/fay;La/gay;ZLjava/util/Set;La/kzj0;I)La/fay;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    iget-object p2, p1, La/fay;->b:La/gay;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    if-eq p2, v0, :cond_2

    .line 37
    .line 38
    const/4 p0, 0x2

    .line 39
    if-ne p2, p0, :cond_1

    .line 40
    .line 41
    new-instance p0, La/q4m0;

    .line 42
    .line 43
    sget-object p1, La/t3u0;->c:La/t3u0;

    .line 44
    .line 45
    invoke-direct {p0, p3, p1}, La/q4m0;-><init>(La/wsy;La/t3u0;)V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-interface {p0}, La/hzs0;->t()La/t3u0;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget-boolean p2, p2, La/t3u0;->b:Z

    .line 59
    .line 60
    if-nez p2, :cond_3

    .line 61
    .line 62
    new-instance p1, La/q4m0;

    .line 63
    .line 64
    sget-object p2, La/t3u0;->c:La/t3u0;

    .line 65
    .line 66
    sget p3, La/rek;->a:I

    .line 67
    .line 68
    invoke-static {p0}, La/oek;->c(La/vjj;)La/ym40;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-interface {p0}, La/ym40;->c()La/ary;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, La/ary;->o()La/kzj0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {p1, p0, p2}, La/q4m0;-><init>(La/wsy;La/t3u0;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_3
    invoke-virtual {p3}, La/wsy;->S()La/iys0;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-interface {p2}, La/iys0;->getParameters()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-nez p2, :cond_4

    .line 103
    .line 104
    new-instance p0, La/q4m0;

    .line 105
    .line 106
    sget-object p1, La/t3u0;->e:La/t3u0;

    .line 107
    .line 108
    invoke-direct {p0, p3, p1}, La/q4m0;-><init>(La/wsy;La/t3u0;)V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_4
    invoke-static {p0, p1}, La/e0t0;->l(La/hzs0;La/fay;)La/pzs0;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
.end method

.method public static d(IILa/m2a;La/hf80;La/if80;La/jf80;La/kf80;Landroid/util/Size;Ljava/lang/String;)La/gf80;
    .locals 17

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, La/m2a;->x:La/m2a;

    .line 4
    .line 5
    and-int/lit8 v2, v0, 0x8

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v7, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v7, p2

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v2, v0, 0x40

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    move-object v9, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object/from16 v9, p3

    .line 21
    .line 22
    :goto_1
    and-int/lit16 v2, v0, 0x80

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    move-object v10, v3

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move-object/from16 v10, p5

    .line 29
    .line 30
    :goto_2
    and-int/lit16 v0, v0, 0x100

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    move-object v11, v3

    .line 35
    goto :goto_3

    .line 36
    :cond_3
    move-object/from16 v11, p6

    .line 37
    .line 38
    :goto_3
    sget-object v12, La/iun;->a:La/iun;

    .line 39
    .line 40
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v0, La/m2a;->z:La/m2a;

    .line 47
    .line 48
    if-eq v7, v0, :cond_7

    .line 49
    .line 50
    sget-object v0, La/m2a;->y:La/m2a;

    .line 51
    .line 52
    if-eq v7, v0, :cond_7

    .line 53
    .line 54
    sget-object v0, La/m2a;->B:La/m2a;

    .line 55
    .line 56
    if-eq v7, v0, :cond_4

    .line 57
    .line 58
    sget-object v0, La/m2a;->Y:La/m2a;

    .line 59
    .line 60
    if-eq v7, v0, :cond_4

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 v2, 0x23

    .line 66
    .line 67
    if-lt v0, v2, :cond_5

    .line 68
    .line 69
    goto :goto_5

    .line 70
    :cond_5
    :goto_4
    if-ne v7, v1, :cond_6

    .line 71
    .line 72
    new-instance v8, La/ff80;

    .line 73
    .line 74
    move-object v13, v9

    .line 75
    move-object v14, v10

    .line 76
    move-object v15, v11

    .line 77
    move-object/from16 v16, v12

    .line 78
    .line 79
    move/from16 v10, p0

    .line 80
    .line 81
    move-object/from16 v12, p4

    .line 82
    .line 83
    move-object/from16 v9, p7

    .line 84
    .line 85
    move-object/from16 v11, p8

    .line 86
    .line 87
    invoke-direct/range {v8 .. v16}, La/gf80;-><init>(Landroid/util/Size;ILjava/lang/String;La/if80;La/hf80;La/jf80;La/kf80;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    return-object v8

    .line 91
    :cond_6
    const-string v0, "Check failed."

    .line 92
    .line 93
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v3

    .line 97
    :cond_7
    :goto_5
    new-instance v3, La/ef80;

    .line 98
    .line 99
    move/from16 v5, p0

    .line 100
    .line 101
    move-object/from16 v8, p4

    .line 102
    .line 103
    move-object/from16 v4, p7

    .line 104
    .line 105
    move-object/from16 v6, p8

    .line 106
    .line 107
    invoke-direct/range {v3 .. v12}, La/ef80;-><init>(Landroid/util/Size;ILjava/lang/String;La/m2a;La/if80;La/hf80;La/jf80;La/kf80;Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    return-object v3
.end method

.method public static e(J)La/src0;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, La/src0;->b:La/src0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-wide/16 v0, 0x1

    .line 11
    .line 12
    cmp-long v0, p0, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object p0, La/src0;->c:La/src0;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const-wide/16 v0, 0x2

    .line 20
    .line 21
    cmp-long v0, p0, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    sget-object p0, La/src0;->d:La/src0;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    const-wide/16 v0, 0x3

    .line 29
    .line 30
    cmp-long v0, p0, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    sget-object p0, La/src0;->e:La/src0;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    const-wide/16 v0, 0x4

    .line 38
    .line 39
    cmp-long p0, p0, v0

    .line 40
    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    sget-object p0, La/src0;->f:La/src0;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    new-instance p0, Ljava/security/InvalidParameterException;

    .line 47
    .line 48
    invoke-direct {p0}, Ljava/security/InvalidParameterException;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public static f(Landroidx/fragment/app/e;JJILjava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/de90;

    .line 5
    .line 6
    invoke-direct {v0}, La/de90;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, La/de90;->l2:[La/iiy;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    iget-object v4, v0, La/de90;->d2:La/phf0;

    .line 15
    .line 16
    invoke-virtual {v4, v0, v3, p6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long p6, p1, v3

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    if-nez p6, :cond_0

    .line 25
    .line 26
    move v2, v3

    .line 27
    :cond_0
    const/4 p6, 0x5

    .line 28
    aget-object p6, v1, p6

    .line 29
    .line 30
    iget-object v4, v0, La/de90;->i2:La/cgx0;

    .line 31
    .line 32
    invoke-virtual {v4, v0, p6, v2}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 33
    .line 34
    .line 35
    const/4 p6, 0x3

    .line 36
    aget-object p6, v1, p6

    .line 37
    .line 38
    iget-object v2, v0, La/de90;->g2:La/r34;

    .line 39
    .line 40
    invoke-virtual {v2, v0, p6, p3, p4}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 41
    .line 42
    .line 43
    const/4 p3, 0x2

    .line 44
    aget-object p3, v1, p3

    .line 45
    .line 46
    iget-object p4, v0, La/de90;->f2:La/r34;

    .line 47
    .line 48
    invoke-virtual {p4, v0, p3, p1, p2}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v0, La/de90;->e2:La/zz2;

    .line 52
    .line 53
    aget-object p2, v1, v3

    .line 54
    .line 55
    invoke-virtual {p1, v0, p2, p5}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 56
    .line 57
    .line 58
    const-class p1, La/de90;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p0, p1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static g(Landroidx/fragment/app/e;Ljava/lang/String;Ljava/lang/String;La/i7a;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-class v0, La/sdd0;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, La/sdd0;

    .line 26
    .line 27
    invoke-direct {v1}, La/sdd0;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object v2, La/sdd0;->j2:[La/iiy;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    aget-object v3, v2, v3

    .line 34
    .line 35
    iget-object v4, v1, La/sdd0;->e2:La/phf0;

    .line 36
    .line 37
    invoke-virtual {v4, v1, v3, p2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p2, 0x2

    .line 41
    aget-object p2, v2, p2

    .line 42
    .line 43
    iget-object v3, v1, La/sdd0;->f2:La/phf0;

    .line 44
    .line 45
    invoke-virtual {v3, v1, p2, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    aget-object p1, v2, p1

    .line 50
    .line 51
    iget-object p2, v1, La/sdd0;->g2:La/yzn0;

    .line 52
    .line 53
    invoke-virtual {p2, v1, p1, p3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public static h(Landroidx/fragment/app/e;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "QUICK_BET_DIALOG_TAG"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    sget-object v1, La/ymd0;->o2:La/fl70;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, La/ymd0;

    .line 18
    .line 19
    invoke-direct {v1}, La/ymd0;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v2, La/ymd0;->p2:[La/iiy;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    aget-object v2, v2, v3

    .line 26
    .line 27
    iget-object v3, v1, La/ymd0;->n2:La/phf0;

    .line 28
    .line 29
    const-string v4, ""

    .line 30
    .line 31
    invoke-virtual {v3, v1, v2, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public static i(Landroidx/fragment/app/e;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "QUICK_BET_DIALOG_TAG"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    sget-object v1, La/ymd0;->o2:La/fl70;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, La/ymd0;

    .line 18
    .line 19
    invoke-direct {v1}, La/ymd0;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v2, La/ymd0;->p2:[La/iiy;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    aget-object v2, v2, v3

    .line 26
    .line 27
    iget-object v3, v1, La/ymd0;->n2:La/phf0;

    .line 28
    .line 29
    const-string v4, "REQUEST_QUICKBET_KEY"

    .line 30
    .line 31
    invoke-virtual {v3, v1, v2, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, p0, v0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 55

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    move-object/from16 v9, p3

    .line 6
    .line 7
    const v0, -0x2baa0fa8

    .line 8
    .line 9
    .line 10
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int v0, p4, v0

    .line 23
    .line 24
    invoke-virtual {v9, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const/16 v1, 0x20

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v1, 0x10

    .line 34
    .line 35
    :goto_1
    or-int/2addr v0, v1

    .line 36
    and-int/lit8 v1, v0, 0x13

    .line 37
    .line 38
    const/16 v3, 0x12

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    if-eq v1, v3, :cond_2

    .line 42
    .line 43
    move v1, v4

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    :goto_2
    and-int/2addr v0, v4

    .line 47
    invoke-virtual {v9, v0, v1}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_23

    .line 52
    .line 53
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sget-object v12, La/ukd;->a:La/cl5;

    .line 58
    .line 59
    if-ne v0, v12, :cond_e

    .line 60
    .line 61
    invoke-static {v2}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    instance-of v1, v0, La/af3;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    check-cast v0, La/af3;

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    const/4 v0, 0x0

    .line 73
    :goto_3
    const-class v1, La/r6a0;

    .line 74
    .line 75
    if-eqz v0, :cond_d

    .line 76
    .line 77
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/o5d0;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, La/ze3;

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    const/4 v0, 0x0

    .line 97
    :goto_4
    instance-of v3, v0, La/r6a0;

    .line 98
    .line 99
    if-nez v3, :cond_5

    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    :cond_5
    check-cast v0, La/r6a0;

    .line 103
    .line 104
    if-eqz v0, :cond_d

    .line 105
    .line 106
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :goto_5
    const-string v3, "Can\'t find feature provider!"

    .line 111
    .line 112
    if-eqz v1, :cond_c

    .line 113
    .line 114
    invoke-virtual {v1}, Landroidx/fragment/app/e;->P()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    sub-int/2addr v5, v4

    .line 119
    :goto_6
    if-ltz v5, :cond_a

    .line 120
    .line 121
    invoke-virtual {v1, v5}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    iget-object v6, v6, La/zb5;->i:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v1, v6}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    instance-of v7, v6, La/ocl0;

    .line 132
    .line 133
    if-eqz v7, :cond_9

    .line 134
    .line 135
    check-cast v6, La/ocl0;

    .line 136
    .line 137
    new-instance v1, La/ti6;

    .line 138
    .line 139
    const/4 v4, 0x6

    .line 140
    invoke-direct {v1, v2, v4}, La/ti6;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v6, v1}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 144
    .line 145
    .line 146
    move-result-object v16

    .line 147
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 148
    .line 149
    .line 150
    move-result-object v38

    .line 151
    move-object v1, v2

    .line 152
    :goto_7
    if-eqz v1, :cond_8

    .line 153
    .line 154
    instance-of v4, v1, La/au7;

    .line 155
    .line 156
    if-eqz v4, :cond_7

    .line 157
    .line 158
    check-cast v1, La/au7;

    .line 159
    .line 160
    iget-object v1, v1, La/au7;->O1:La/cai;

    .line 161
    .line 162
    if-eqz v1, :cond_6

    .line 163
    .line 164
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v15, v0, La/r6a0;->a:La/cad;

    .line 171
    .line 172
    iget-object v3, v0, La/r6a0;->b:La/sue;

    .line 173
    .line 174
    iget-object v4, v0, La/r6a0;->f:La/onv;

    .line 175
    .line 176
    iget-object v5, v0, La/r6a0;->i:La/fvt0;

    .line 177
    .line 178
    iget-object v6, v0, La/r6a0;->j:La/onv;

    .line 179
    .line 180
    iget-object v7, v0, La/r6a0;->m:La/d1p;

    .line 181
    .line 182
    iget-object v14, v0, La/r6a0;->l:La/rmd0;

    .line 183
    .line 184
    iget-object v11, v0, La/r6a0;->n:La/wsf0;

    .line 185
    .line 186
    iget-object v10, v0, La/r6a0;->o:La/bzu;

    .line 187
    .line 188
    const/16 v53, 0x0

    .line 189
    .line 190
    iget-object v13, v0, La/r6a0;->p:La/vqc;

    .line 191
    .line 192
    move-object/from16 v30, v1

    .line 193
    .line 194
    iget-object v1, v0, La/r6a0;->q:La/iip;

    .line 195
    .line 196
    move-object/from16 v26, v1

    .line 197
    .line 198
    iget-object v1, v0, La/r6a0;->r:La/drm0;

    .line 199
    .line 200
    move-object/from16 v27, v1

    .line 201
    .line 202
    iget-object v1, v0, La/r6a0;->t:La/iw20;

    .line 203
    .line 204
    move-object/from16 v28, v1

    .line 205
    .line 206
    iget-object v1, v0, La/r6a0;->u:La/o2j0;

    .line 207
    .line 208
    move-object/from16 v29, v1

    .line 209
    .line 210
    iget-object v1, v0, La/r6a0;->c:La/wdk0;

    .line 211
    .line 212
    move-object/from16 v33, v1

    .line 213
    .line 214
    iget-object v1, v0, La/r6a0;->d:La/ii;

    .line 215
    .line 216
    move-object/from16 v34, v1

    .line 217
    .line 218
    iget-object v1, v0, La/r6a0;->e:La/lgn0;

    .line 219
    .line 220
    move-object/from16 v35, v1

    .line 221
    .line 222
    iget-object v1, v0, La/r6a0;->g:La/j1q0;

    .line 223
    .line 224
    move-object/from16 v36, v1

    .line 225
    .line 226
    iget-object v1, v0, La/r6a0;->h:La/r9u;

    .line 227
    .line 228
    move-object/from16 v37, v1

    .line 229
    .line 230
    iget-object v1, v0, La/r6a0;->k:La/ctf0;

    .line 231
    .line 232
    move-object/from16 v39, v1

    .line 233
    .line 234
    iget-object v1, v0, La/r6a0;->s:La/duj;

    .line 235
    .line 236
    move-object/from16 v40, v1

    .line 237
    .line 238
    iget-object v1, v0, La/r6a0;->v:La/v88;

    .line 239
    .line 240
    move-object/from16 v41, v1

    .line 241
    .line 242
    iget-object v1, v0, La/r6a0;->w:La/kt2;

    .line 243
    .line 244
    move-object/from16 v42, v1

    .line 245
    .line 246
    iget-object v1, v0, La/r6a0;->x:La/knf0;

    .line 247
    .line 248
    move-object/from16 v43, v1

    .line 249
    .line 250
    iget-object v1, v0, La/r6a0;->y:La/gst0;

    .line 251
    .line 252
    move-object/from16 v44, v1

    .line 253
    .line 254
    iget-object v1, v0, La/r6a0;->z:La/ouu;

    .line 255
    .line 256
    move-object/from16 v45, v1

    .line 257
    .line 258
    iget-object v1, v0, La/r6a0;->A:La/peg0;

    .line 259
    .line 260
    move-object/from16 v46, v1

    .line 261
    .line 262
    iget-object v1, v0, La/r6a0;->B:La/reu;

    .line 263
    .line 264
    move-object/from16 v47, v1

    .line 265
    .line 266
    iget-object v1, v0, La/r6a0;->C:La/u8u;

    .line 267
    .line 268
    move-object/from16 v48, v1

    .line 269
    .line 270
    iget-object v1, v0, La/r6a0;->D:La/edu;

    .line 271
    .line 272
    move-object/from16 v49, v1

    .line 273
    .line 274
    iget-object v1, v0, La/r6a0;->E:La/edo;

    .line 275
    .line 276
    move-object/from16 v50, v1

    .line 277
    .line 278
    iget-object v1, v0, La/r6a0;->F:La/zfo;

    .line 279
    .line 280
    move-object/from16 v51, v1

    .line 281
    .line 282
    iget-object v1, v0, La/r6a0;->G:La/qoi;

    .line 283
    .line 284
    move-object/from16 v31, v1

    .line 285
    .line 286
    iget-object v1, v0, La/r6a0;->H:La/jw20;

    .line 287
    .line 288
    iget-object v0, v0, La/r6a0;->I:La/bzt;

    .line 289
    .line 290
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v50 .. v50}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-object/from16 v22, v14

    .line 339
    .line 340
    new-instance v14, La/eoi;

    .line 341
    .line 342
    move-object/from16 v52, v0

    .line 343
    .line 344
    move-object/from16 v32, v1

    .line 345
    .line 346
    move-object/from16 v17, v3

    .line 347
    .line 348
    move-object/from16 v18, v4

    .line 349
    .line 350
    move-object/from16 v19, v5

    .line 351
    .line 352
    move-object/from16 v20, v6

    .line 353
    .line 354
    move-object/from16 v21, v7

    .line 355
    .line 356
    move-object/from16 v24, v10

    .line 357
    .line 358
    move-object/from16 v23, v11

    .line 359
    .line 360
    move-object/from16 v25, v13

    .line 361
    .line 362
    invoke-direct/range {v14 .. v52}, La/eoi;-><init>(La/cad;La/pcl0;La/sue;La/onv;La/fvt0;La/onv;La/d1p;La/rmd0;La/wsf0;La/bzu;La/vqc;La/iip;La/drm0;La/iw20;La/o2j0;La/cai;La/qoi;La/jw20;La/wdk0;La/ii;La/lgn0;La/j1q0;La/r9u;La/i1w0;La/ctf0;La/duj;La/v88;La/kt2;La/knf0;La/gst0;La/ouu;La/peg0;La/reu;La/u8u;La/edu;La/edo;La/zfo;La/bzt;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v9, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    move-object v0, v14

    .line 369
    goto :goto_8

    .line 370
    :cond_6
    const/16 v53, 0x0

    .line 371
    .line 372
    const-string v0, "betsOnPlayersFeature"

    .line 373
    .line 374
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw v53

    .line 378
    :cond_7
    const/16 v53, 0x0

    .line 379
    .line 380
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 381
    .line 382
    goto/16 :goto_7

    .line 383
    .line 384
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :cond_9
    const/16 v53, 0x0

    .line 389
    .line 390
    add-int/lit8 v5, v5, -0x1

    .line 391
    .line 392
    goto/16 :goto_6

    .line 393
    .line 394
    :cond_a
    const/16 v53, 0x0

    .line 395
    .line 396
    iget-object v1, v2, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 397
    .line 398
    if-eqz v1, :cond_b

    .line 399
    .line 400
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    goto/16 :goto_5

    .line 405
    .line 406
    :cond_b
    move-object/from16 v1, v53

    .line 407
    .line 408
    goto/16 :goto_5

    .line 409
    .line 410
    :cond_c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :cond_d
    const-string v0, "Cannot create dependency "

    .line 415
    .line 416
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :cond_e
    const/16 v53, 0x0

    .line 425
    .line 426
    :goto_8
    check-cast v0, La/eoi;

    .line 427
    .line 428
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    if-ne v1, v12, :cond_f

    .line 433
    .line 434
    iget-object v1, v0, La/eoi;->I:La/ii;

    .line 435
    .line 436
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    :cond_f
    move-object v3, v1

    .line 440
    check-cast v3, La/ii;

    .line 441
    .line 442
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    if-ne v1, v12, :cond_10

    .line 447
    .line 448
    iget-object v1, v0, La/eoi;->J:La/wdk0;

    .line 449
    .line 450
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_10
    move-object v6, v1

    .line 454
    check-cast v6, La/wdk0;

    .line 455
    .line 456
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    if-ne v1, v12, :cond_11

    .line 461
    .line 462
    iget-object v1, v0, La/eoi;->K:La/lgn0;

    .line 463
    .line 464
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    :cond_11
    move-object v5, v1

    .line 468
    check-cast v5, La/lgn0;

    .line 469
    .line 470
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    if-ne v1, v12, :cond_12

    .line 475
    .line 476
    iget-object v1, v0, La/eoi;->L:La/onv;

    .line 477
    .line 478
    iget-object v1, v1, La/onv;->a:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v1, La/ali;

    .line 481
    .line 482
    invoke-virtual {v1}, La/ali;->z()La/e720;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    :cond_12
    move-object v4, v1

    .line 490
    check-cast v4, La/e720;

    .line 491
    .line 492
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    if-ne v1, v12, :cond_13

    .line 497
    .line 498
    iget-object v1, v0, La/eoi;->s:La/sue;

    .line 499
    .line 500
    invoke-interface {v1}, La/sue;->w()La/vq;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    :cond_13
    check-cast v1, La/vq;

    .line 511
    .line 512
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v7

    .line 516
    if-ne v7, v12, :cond_14

    .line 517
    .line 518
    iget-object v7, v0, La/eoi;->y:La/qoi;

    .line 519
    .line 520
    invoke-virtual {v7}, La/qoi;->a()La/qta0;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    :cond_14
    check-cast v7, La/qta0;

    .line 528
    .line 529
    new-instance v10, La/fiu0;

    .line 530
    .line 531
    iget-object v0, v0, La/eoi;->M:La/eni;

    .line 532
    .line 533
    const-class v11, La/g7a0;

    .line 534
    .line 535
    invoke-static {v11, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-direct {v10, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 540
    .line 541
    .line 542
    sget-object v0, La/sre0;->a:La/tre0;

    .line 543
    .line 544
    invoke-virtual {v0, v11}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    const/16 v11, 0xe

    .line 549
    .line 550
    move-object/from16 v13, v53

    .line 551
    .line 552
    invoke-static {v0, v13, v10, v9, v11}, La/n4c;->Y(La/sgy;Ljava/lang/String;La/fiu0;La/fet;I)La/k3t0;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    move-object v10, v0

    .line 557
    check-cast v10, La/i3t0;

    .line 558
    .line 559
    invoke-virtual {v10, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 560
    .line 561
    .line 562
    move-result-object v11

    .line 563
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    if-ne v0, v12, :cond_15

    .line 568
    .line 569
    new-instance v0, La/z430;

    .line 570
    .line 571
    move-object/from16 v54, v2

    .line 572
    .line 573
    move-object v2, v1

    .line 574
    move-object/from16 v1, v54

    .line 575
    .line 576
    invoke-direct/range {v0 .. v7}, La/z430;-><init>(Landroidx/fragment/app/Fragment;La/vq;La/ii;La/e720;La/lgn0;La/wdk0;La/qta0;)V

    .line 577
    .line 578
    .line 579
    move-object v2, v1

    .line 580
    new-instance v1, La/eq2;

    .line 581
    .line 582
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 583
    .line 584
    .line 585
    new-instance v3, La/vi6;

    .line 586
    .line 587
    const/16 v4, 0xa

    .line 588
    .line 589
    invoke-direct {v3, v10, v4}, La/vi6;-><init>(La/i3t0;B)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0, v1, v3}, La/z430;->b(La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    :cond_15
    check-cast v0, La/z430;

    .line 599
    .line 600
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    invoke-virtual {v9, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    or-int/2addr v1, v3

    .line 609
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    if-nez v1, :cond_16

    .line 614
    .line 615
    if-ne v3, v12, :cond_17

    .line 616
    .line 617
    :cond_16
    new-instance v3, La/ka70;

    .line 618
    .line 619
    const/16 v1, 0x19

    .line 620
    .line 621
    invoke-direct {v3, v0, v10, v1}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 628
    .line 629
    sget-object v0, La/lkz;->a:La/lkz;

    .line 630
    .line 631
    invoke-static {v3, v9}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    invoke-virtual {v9, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    or-int/2addr v0, v1

    .line 644
    const/4 v1, 0x3

    .line 645
    invoke-virtual {v9, v1}, La/fet;->e(I)Z

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    or-int/2addr v0, v1

    .line 650
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v1

    .line 654
    or-int/2addr v0, v1

    .line 655
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    if-nez v0, :cond_19

    .line 660
    .line 661
    if-ne v1, v12, :cond_18

    .line 662
    .line 663
    goto :goto_9

    .line 664
    :cond_18
    move-object v7, v2

    .line 665
    move-object v6, v10

    .line 666
    goto :goto_a

    .line 667
    :cond_19
    :goto_9
    new-instance v0, La/ta4;

    .line 668
    .line 669
    const/4 v5, 0x2

    .line 670
    move-object v1, v10

    .line 671
    move-object v4, v13

    .line 672
    invoke-direct/range {v0 .. v5}, La/ta4;-><init>(La/i3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 673
    .line 674
    .line 675
    move-object v6, v1

    .line 676
    move-object v7, v2

    .line 677
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    move-object v1, v0

    .line 681
    :goto_a
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 682
    .line 683
    invoke-static {v9, v7, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v9, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    if-nez v0, :cond_1a

    .line 695
    .line 696
    if-ne v1, v12, :cond_1b

    .line 697
    .line 698
    :cond_1a
    new-instance v1, La/ui6;

    .line 699
    .line 700
    const/4 v0, 0x7

    .line 701
    invoke-direct {v1, v6, v0}, La/ui6;-><init>(La/i3t0;B)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 705
    .line 706
    .line 707
    :cond_1b
    move-object v0, v1

    .line 708
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 709
    .line 710
    invoke-virtual {v9, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    if-nez v1, :cond_1c

    .line 719
    .line 720
    if-ne v2, v12, :cond_1d

    .line 721
    .line 722
    :cond_1c
    new-instance v2, La/ui6;

    .line 723
    .line 724
    const/16 v1, 0x8

    .line 725
    .line 726
    invoke-direct {v2, v6, v1}, La/ui6;-><init>(La/i3t0;B)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v9, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    :cond_1d
    move-object v1, v2

    .line 733
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 734
    .line 735
    const/4 v4, 0x0

    .line 736
    const/4 v5, 0x4

    .line 737
    const/4 v2, 0x0

    .line 738
    move-object v3, v9

    .line 739
    invoke-static/range {v0 .. v5}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 740
    .line 741
    .line 742
    sget-object v0, La/jm40;->b:La/jm40;

    .line 743
    .line 744
    const/high16 v1, 0x3f800000    # 1.0f

    .line 745
    .line 746
    invoke-static {v0, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    sget-object v1, La/qmk;->a:La/zcl;

    .line 751
    .line 752
    invoke-static {v3}, La/qmk;->a(La/fet;)La/wfn;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    iget v1, v1, La/wfn;->b:F

    .line 757
    .line 758
    const/4 v2, 0x0

    .line 759
    const/4 v4, 0x2

    .line 760
    invoke-static {v0, v1, v2, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-virtual {v3, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v1

    .line 768
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    if-nez v1, :cond_1e

    .line 773
    .line 774
    if-ne v2, v12, :cond_1f

    .line 775
    .line 776
    :cond_1e
    new-instance v14, La/yi90;

    .line 777
    .line 778
    const/16 v20, 0x0

    .line 779
    .line 780
    const/16 v21, 0x12

    .line 781
    .line 782
    const/4 v15, 0x1

    .line 783
    const-class v17, La/k3t0;

    .line 784
    .line 785
    const-string v18, "onAction"

    .line 786
    .line 787
    const-string v19, "onAction(Ljava/lang/Object;)V"

    .line 788
    .line 789
    move-object/from16 v16, v6

    .line 790
    .line 791
    invoke-direct/range {v14 .. v21}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v3, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    move-object v2, v14

    .line 798
    :cond_1f
    check-cast v2, La/jhy;

    .line 799
    .line 800
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 801
    .line 802
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    check-cast v1, La/c7a0;

    .line 813
    .line 814
    if-eqz v1, :cond_22

    .line 815
    .line 816
    instance-of v4, v1, La/a7a0;

    .line 817
    .line 818
    const/16 v5, 0x38

    .line 819
    .line 820
    if-eqz v4, :cond_20

    .line 821
    .line 822
    const v2, 0x10f26b6d

    .line 823
    .line 824
    .line 825
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 826
    .line 827
    .line 828
    sget-object v2, La/kr00;->a:La/zfn;

    .line 829
    .line 830
    move-object v4, v1

    .line 831
    check-cast v4, La/a7a0;

    .line 832
    .line 833
    iget-boolean v4, v4, La/a7a0;->b:Z

    .line 834
    .line 835
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    invoke-virtual {v2, v4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    new-instance v4, La/xd80;

    .line 844
    .line 845
    const/16 v6, 0x1d

    .line 846
    .line 847
    invoke-direct {v4, v0, v1, v6}, La/xd80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 848
    .line 849
    .line 850
    const v0, 0x35930a5b

    .line 851
    .line 852
    .line 853
    invoke-static {v0, v4, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-static {v2, v0, v3, v5}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 858
    .line 859
    .line 860
    const/4 v0, 0x0

    .line 861
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 862
    .line 863
    .line 864
    goto :goto_b

    .line 865
    :cond_20
    instance-of v4, v1, La/b7a0;

    .line 866
    .line 867
    if-eqz v4, :cond_21

    .line 868
    .line 869
    const v4, 0x10f7a08c

    .line 870
    .line 871
    .line 872
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 873
    .line 874
    .line 875
    check-cast v1, La/b7a0;

    .line 876
    .line 877
    iget-object v4, v1, La/b7a0;->a:La/a4x;

    .line 878
    .line 879
    invoke-static {v4, v3}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 880
    .line 881
    .line 882
    move-result-object v4

    .line 883
    sget-object v6, La/kr00;->a:La/zfn;

    .line 884
    .line 885
    iget-boolean v1, v1, La/b7a0;->b:Z

    .line 886
    .line 887
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 888
    .line 889
    .line 890
    move-result-object v1

    .line 891
    invoke-virtual {v6, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    new-instance v6, La/s6a0;

    .line 896
    .line 897
    invoke-direct {v6, v0, v4, v8, v2}, La/s6a0;-><init>(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 898
    .line 899
    .line 900
    const v0, 0x7b2e2fd2

    .line 901
    .line 902
    .line 903
    invoke-static {v0, v6, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    invoke-static {v1, v0, v3, v5}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 908
    .line 909
    .line 910
    const/4 v0, 0x0

    .line 911
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 912
    .line 913
    .line 914
    goto :goto_b

    .line 915
    :cond_21
    instance-of v2, v1, La/z6a0;

    .line 916
    .line 917
    if-eqz v2, :cond_22

    .line 918
    .line 919
    const v2, -0x7b52a0d0

    .line 920
    .line 921
    .line 922
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 923
    .line 924
    .line 925
    check-cast v1, La/z6a0;

    .line 926
    .line 927
    iget-object v1, v1, La/z6a0;->a:La/mdm;

    .line 928
    .line 929
    const/16 v5, 0x180

    .line 930
    .line 931
    const/16 v6, 0x8

    .line 932
    .line 933
    const/4 v2, 0x1

    .line 934
    const/4 v3, 0x0

    .line 935
    move-object/from16 v4, p3

    .line 936
    .line 937
    invoke-static/range {v0 .. v6}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 938
    .line 939
    .line 940
    move-object v3, v4

    .line 941
    const/4 v0, 0x0

    .line 942
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 943
    .line 944
    .line 945
    goto :goto_b

    .line 946
    :cond_22
    const/4 v0, 0x0

    .line 947
    const v1, -0x7b530bb7

    .line 948
    .line 949
    .line 950
    invoke-static {v1, v3, v0}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    throw v0

    .line 955
    :cond_23
    move-object v7, v2

    .line 956
    move-object v3, v9

    .line 957
    invoke-virtual {v3}, La/fet;->X()V

    .line 958
    .line 959
    .line 960
    :goto_b
    invoke-virtual {v3}, La/fet;->u()La/yfe0;

    .line 961
    .line 962
    .line 963
    move-result-object v6

    .line 964
    if-eqz v6, :cond_24

    .line 965
    .line 966
    new-instance v0, La/o090;

    .line 967
    .line 968
    const/16 v5, 0xd

    .line 969
    .line 970
    move-object/from16 v1, p0

    .line 971
    .line 972
    move/from16 v4, p4

    .line 973
    .line 974
    move-object v2, v7

    .line 975
    move-object v3, v8

    .line 976
    invoke-direct/range {v0 .. v5}, La/o090;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 977
    .line 978
    .line 979
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 980
    .line 981
    :cond_24
    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, La/s45;

    .line 2
    .line 3
    iget-object v1, p1, La/s45;->b:La/b1x;

    .line 4
    .line 5
    iget-object p0, p1, La/s45;->a:La/dzb0;

    .line 6
    .line 7
    invoke-interface {v1}, La/b1x;->getFormat()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, La/m2x;->x(I)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    :try_start_0
    sget-object p1, La/fko;->b:La/y50;

    .line 19
    .line 20
    invoke-interface {v1}, La/b1x;->l0()[La/wsf0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    aget-object p1, p1, v0

    .line 25
    .line 26
    invoke-virtual {p1}, La/wsf0;->i()Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    new-array v2, v2, [B

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    new-instance p1, Ljava/io/ByteArrayInputStream;

    .line 43
    .line 44
    invoke-direct {p1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 45
    .line 46
    .line 47
    new-instance v2, La/fko;

    .line 48
    .line 49
    new-instance v3, La/sko;

    .line 50
    .line 51
    invoke-direct {v3, p1}, La/sko;-><init>(Ljava/io/InputStream;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v2, v3}, La/fko;-><init>(La/sko;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1}, La/b1x;->l0()[La/wsf0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    aget-object p1, p1, v0

    .line 62
    .line 63
    invoke-virtual {p1}, La/wsf0;->i()Ljava/nio/ByteBuffer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    new-instance p1, La/ozw;

    .line 74
    .line 75
    const-string v0, "Failed to extract EXIF data."

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-direct {p1, v1, v0, p0}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_0
    const/4 v2, 0x0

    .line 83
    :goto_0
    const-class p1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 84
    .line 85
    sget-object v3, La/khk;->a:La/kpd0;

    .line 86
    .line 87
    invoke-virtual {v3, p1}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Landroidx/camera/core/internal/compat/quirk/ImageCaptureRotationOptionQuirk;

    .line 92
    .line 93
    const/16 v3, 0x10

    .line 94
    .line 95
    if-eqz p1, :cond_1

    .line 96
    .line 97
    sget-object p1, La/t7a;->f:La/u15;

    .line 98
    .line 99
    goto/16 :goto_4

    .line 100
    .line 101
    :cond_1
    invoke-interface {v1}, La/b1x;->getFormat()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-static {p1}, La/m2x;->x(I)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_4

    .line 110
    .line 111
    const-string p1, "JPEG image must have exif."

    .line 112
    .line 113
    invoke-static {v2, p1}, La/z1x;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, Landroid/util/Size;

    .line 117
    .line 118
    invoke-interface {v1}, La/b1x;->j()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-interface {v1}, La/b1x;->f()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-direct {p1, v4, v5}, Landroid/util/Size;-><init>(II)V

    .line 127
    .line 128
    .line 129
    iget v4, p0, La/dzb0;->d:I

    .line 130
    .line 131
    invoke-virtual {v2}, La/fko;->a()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    sub-int/2addr v4, v5

    .line 136
    invoke-static {v4}, La/jls0;->i(I)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    invoke-static {v5}, La/jls0;->c(I)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_2

    .line 145
    .line 146
    new-instance v5, Landroid/util/Size;

    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    invoke-direct {v5, v6, v7}, Landroid/util/Size;-><init>(II)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    move-object v5, p1

    .line 161
    :goto_1
    new-instance v6, Landroid/graphics/RectF;

    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    int-to-float v7, v7

    .line 168
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    int-to-float p1, p1

    .line 173
    const/4 v8, 0x0

    .line 174
    invoke-direct {v6, v8, v8, v7, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 175
    .line 176
    .line 177
    new-instance p1, Landroid/graphics/RectF;

    .line 178
    .line 179
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    int-to-float v7, v7

    .line 184
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    int-to-float v9, v9

    .line 189
    invoke-direct {p1, v8, v8, v7, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 190
    .line 191
    .line 192
    invoke-static {v6, p1, v4, v0}, La/jls0;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iget-object v0, p0, La/dzb0;->c:Landroid/graphics/Rect;

    .line 197
    .line 198
    new-instance v4, Landroid/graphics/RectF;

    .line 199
    .line 200
    invoke-direct {v4, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, Landroid/graphics/RectF;->sort()V

    .line 207
    .line 208
    .line 209
    move-object v0, v4

    .line 210
    move-object v4, v5

    .line 211
    new-instance v5, Landroid/graphics/Rect;

    .line 212
    .line 213
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v5}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, La/fko;->a()I

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    iget-object p0, p0, La/dzb0;->f:Landroid/graphics/Matrix;

    .line 224
    .line 225
    new-instance v7, Landroid/graphics/Matrix;

    .line 226
    .line 227
    invoke-direct {v7, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 231
    .line 232
    .line 233
    invoke-interface {v1}, La/b1x;->K0()La/f0x;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    instance-of p0, p0, La/dy9;

    .line 238
    .line 239
    if-eqz p0, :cond_3

    .line 240
    .line 241
    invoke-interface {v1}, La/b1x;->K0()La/f0x;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    check-cast p0, La/dy9;

    .line 246
    .line 247
    iget-object p0, p0, La/dy9;->a:La/cy9;

    .line 248
    .line 249
    :goto_2
    move-object v8, p0

    .line 250
    goto :goto_3

    .line 251
    :cond_3
    new-instance p0, La/cl5;

    .line 252
    .line 253
    invoke-direct {p0, v3}, La/cl5;-><init>(B)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :goto_3
    invoke-interface {v1}, La/b1x;->getFormat()I

    .line 258
    .line 259
    .line 260
    new-instance v0, La/n45;

    .line 261
    .line 262
    invoke-interface {v1}, La/b1x;->getFormat()I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    invoke-direct/range {v0 .. v8}, La/n45;-><init>(Ljava/lang/Object;La/fko;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;La/cy9;)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :cond_4
    :goto_4
    iget-object v5, p0, La/dzb0;->c:Landroid/graphics/Rect;

    .line 271
    .line 272
    iget v6, p0, La/dzb0;->d:I

    .line 273
    .line 274
    iget-object v7, p0, La/dzb0;->f:Landroid/graphics/Matrix;

    .line 275
    .line 276
    invoke-interface {v1}, La/b1x;->K0()La/f0x;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    instance-of p0, p0, La/dy9;

    .line 281
    .line 282
    if-eqz p0, :cond_5

    .line 283
    .line 284
    invoke-interface {v1}, La/b1x;->K0()La/f0x;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    check-cast p0, La/dy9;

    .line 289
    .line 290
    iget-object p0, p0, La/dy9;->a:La/cy9;

    .line 291
    .line 292
    :goto_5
    move-object v8, p0

    .line 293
    goto :goto_6

    .line 294
    :cond_5
    new-instance p0, La/cl5;

    .line 295
    .line 296
    invoke-direct {p0, v3}, La/cl5;-><init>(B)V

    .line 297
    .line 298
    .line 299
    goto :goto_5

    .line 300
    :goto_6
    new-instance v4, Landroid/util/Size;

    .line 301
    .line 302
    invoke-interface {v1}, La/b1x;->j()I

    .line 303
    .line 304
    .line 305
    move-result p0

    .line 306
    invoke-interface {v1}, La/b1x;->f()I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    invoke-direct {v4, p0, p1}, Landroid/util/Size;-><init>(II)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v1}, La/b1x;->getFormat()I

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    invoke-static {p0}, La/m2x;->x(I)Z

    .line 318
    .line 319
    .line 320
    move-result p0

    .line 321
    if-eqz p0, :cond_6

    .line 322
    .line 323
    const-string p0, "JPEG image must have Exif."

    .line 324
    .line 325
    invoke-static {v2, p0}, La/z1x;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :cond_6
    new-instance v0, La/n45;

    .line 329
    .line 330
    invoke-interface {v1}, La/b1x;->getFormat()I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    invoke-direct/range {v0 .. v8}, La/n45;-><init>(Ljava/lang/Object;La/fko;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;La/cy9;)V

    .line 335
    .line 336
    .line 337
    return-object v0
.end method
