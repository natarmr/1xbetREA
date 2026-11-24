.class public final La/yk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ig9;
.implements La/sps0;


# direct methods
.method public static a()La/lkd;
    .locals 4

    .line 1
    sget-object v0, La/lkd;->x2:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, La/lkd;

    .line 19
    .line 20
    iget-object v2, v2, La/lkd;->a:Ljava/util/List;

    .line 21
    .line 22
    const-string v3, "prod"

    .line 23
    .line 24
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    check-cast v1, La/lkd;

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    sget-object v0, La/lkd;->d:La/lkd;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    return-object v1
.end method

.method public static b(DD)La/izc;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p0, v0

    .line 4
    .line 5
    if-lez v2, :cond_1

    .line 6
    .line 7
    cmpg-double v0, p2, v0

    .line 8
    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-wide v0, 0x40c3880000000000L    # 10000.0

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr p0, v0

    .line 18
    double-to-int p0, p0

    .line 19
    int-to-double p0, p0

    .line 20
    mul-double/2addr p2, v0

    .line 21
    sub-double/2addr p0, p2

    .line 22
    double-to-int p0, p0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 25
    :goto_1
    if-nez p0, :cond_2

    .line 26
    .line 27
    sget-object p0, La/izc;->d:La/izc;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    if-lez p0, :cond_3

    .line 31
    .line 32
    sget-object p0, La/izc;->b:La/izc;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    sget-object p0, La/izc;->c:La/izc;

    .line 36
    .line 37
    return-object p0
.end method

.method public static d(Ljava/lang/Integer;)La/mc6;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    sget-object p0, La/mc6;->c:La/mc6;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    :goto_0
    if-nez p0, :cond_2

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x2

    .line 22
    if-ne v0, v1, :cond_3

    .line 23
    .line 24
    sget-object p0, La/mc6;->d:La/mc6;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_3
    :goto_1
    if-nez p0, :cond_4

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x3

    .line 35
    if-ne v0, v1, :cond_5

    .line 36
    .line 37
    sget-object p0, La/mc6;->e:La/mc6;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_5
    :goto_2
    if-nez p0, :cond_6

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v1, 0x4

    .line 48
    if-ne v0, v1, :cond_7

    .line 49
    .line 50
    sget-object p0, La/mc6;->f:La/mc6;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_7
    :goto_3
    if-nez p0, :cond_8

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v1, 0x5

    .line 61
    if-ne v0, v1, :cond_9

    .line 62
    .line 63
    sget-object p0, La/mc6;->g:La/mc6;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_9
    :goto_4
    if-nez p0, :cond_a

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v1, 0x6

    .line 74
    if-ne v0, v1, :cond_b

    .line 75
    .line 76
    sget-object p0, La/mc6;->h:La/mc6;

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_b
    :goto_5
    if-nez p0, :cond_c

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    const/4 v0, 0x7

    .line 87
    if-ne p0, v0, :cond_d

    .line 88
    .line 89
    sget-object p0, La/mc6;->i:La/mc6;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_d
    :goto_6
    sget-object p0, La/mc6;->j:La/mc6;

    .line 93
    .line 94
    return-object p0
.end method

.method public static g(Ljava/util/List;FFI)La/e900;
    .locals 16

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move/from16 v0, p1

    .line 9
    .line 10
    :goto_0
    and-int/lit8 v2, p3, 0x4

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move/from16 v2, p2

    .line 18
    .line 19
    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-long v3, v0

    .line 24
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-long v5, v0

    .line 29
    const/16 v0, 0x20

    .line 30
    .line 31
    shl-long/2addr v3, v0

    .line 32
    const-wide v7, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v5, v7

    .line 38
    or-long v12, v3, v5

    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    int-to-long v2, v2

    .line 45
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-long v4, v1

    .line 50
    shl-long v0, v2, v0

    .line 51
    .line 52
    and-long v2, v4, v7

    .line 53
    .line 54
    or-long v14, v0, v2

    .line 55
    .line 56
    new-instance v9, La/e900;

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    move-object/from16 v10, p0

    .line 60
    .line 61
    invoke-direct/range {v9 .. v15}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 62
    .line 63
    .line 64
    return-object v9
.end method

.method public static h([Lkotlin/Pair;FFI)La/e900;
    .locals 8

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/high16 p2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 12
    .line 13
    :cond_1
    array-length p3, p0

    .line 14
    invoke-static {p0, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, [Lkotlin/Pair;

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-long v2, p1

    .line 25
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-long v4, p1

    .line 30
    const/16 p1, 0x20

    .line 31
    .line 32
    shl-long/2addr v2, p1

    .line 33
    const-wide v6, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v4, v6

    .line 39
    or-long/2addr v2, v4

    .line 40
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    int-to-long p2, p2

    .line 45
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    int-to-long v0, v0

    .line 50
    shl-long p1, p2, p1

    .line 51
    .line 52
    and-long/2addr v0, v6

    .line 53
    or-long/2addr p1, v0

    .line 54
    invoke-static {p0, v2, v3, p1, p2}, La/yk5;->j([Lkotlin/Pair;JJ)La/e900;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static i(DIDD)D
    .locals 4

    .line 1
    int-to-double v0, p2

    .line 2
    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    mul-double/2addr v0, v2

    .line 8
    mul-double/2addr v0, p0

    .line 9
    cmpg-double p0, v0, p3

    .line 10
    .line 11
    if-gez p0, :cond_0

    .line 12
    .line 13
    const-wide/16 p0, 0x0

    .line 14
    .line 15
    return-wide p0

    .line 16
    :cond_0
    cmpl-double p0, v0, p5

    .line 17
    .line 18
    if-lez p0, :cond_1

    .line 19
    .line 20
    return-wide p5

    .line 21
    :cond_1
    return-wide v0
.end method

.method public static j([Lkotlin/Pair;JJ)La/e900;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move v3, v1

    .line 9
    :goto_0
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    aget-object v4, p0, v3

    .line 12
    .line 13
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, La/y3d;

    .line 16
    .line 17
    iget-wide v5, v4, La/y3d;->a:J

    .line 18
    .line 19
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    array-length v0, p0

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_1
    if-ge v1, v0, :cond_1

    .line 32
    .line 33
    aget-object v4, p0, v1

    .line 34
    .line 35
    iget-object v4, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v1, La/e900;

    .line 54
    .line 55
    move-wide v4, p1

    .line 56
    move-wide v6, p3

    .line 57
    invoke-direct/range {v1 .. v7}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 58
    .line 59
    .line 60
    return-object v1
.end method

.method public static k([Lkotlin/Pair;JJI)La/e900;
    .locals 1

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0x0

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    const-wide p3, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, La/yk5;->j([Lkotlin/Pair;JJ)La/e900;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static l(La/w3t;Ljava/lang/String;)La/ni8;
    .locals 3

    .line 1
    new-instance v0, La/ni8;

    .line 2
    .line 3
    invoke-direct {v0}, La/ni8;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "BonusesFeature.SOURCE_SCREEN"

    .line 12
    .line 13
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "OneXGamesBonusesFragment.UM_RESULT_KEY"

    .line 17
    .line 18
    invoke-virtual {v1, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static m(I)La/koa;
    .locals 7

    .line 1
    invoke-static {}, La/koa;->values()[La/koa;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v1, :cond_4

    .line 9
    .line 10
    aget-object v4, v0, v3

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    if-eq v5, v6, :cond_2

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    if-eq v5, v6, :cond_2

    .line 23
    .line 24
    const/4 v6, 0x3

    .line 25
    if-eq v5, v6, :cond_2

    .line 26
    .line 27
    const/4 v6, 0x4

    .line 28
    if-ne v5, v6, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_1
    move v6, v2

    .line 37
    :cond_2
    :goto_1
    if-ne p0, v6, :cond_3

    .line 38
    .line 39
    return-object v4

    .line 40
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    sget-object p0, La/koa;->b:La/koa;

    .line 44
    .line 45
    return-object p0
.end method

.method public static n(Ljava/util/List;FFI)La/e900;
    .locals 16

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move/from16 v0, p1

    .line 9
    .line 10
    :goto_0
    and-int/lit8 v2, p3, 0x4

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move/from16 v2, p2

    .line 18
    .line 19
    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    int-to-long v3, v3

    .line 24
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-long v5, v0

    .line 29
    const/16 v0, 0x20

    .line 30
    .line 31
    shl-long/2addr v3, v0

    .line 32
    const-wide v7, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v5, v7

    .line 38
    or-long v12, v3, v5

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    int-to-long v3, v1

    .line 45
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-long v1, v1

    .line 50
    shl-long/2addr v3, v0

    .line 51
    and-long v0, v1, v7

    .line 52
    .line 53
    or-long v14, v3, v0

    .line 54
    .line 55
    new-instance v9, La/e900;

    .line 56
    .line 57
    const/4 v11, 0x0

    .line 58
    move-object/from16 v10, p0

    .line 59
    .line 60
    invoke-direct/range {v9 .. v15}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 61
    .line 62
    .line 63
    return-object v9
.end method

.method public static o([Lkotlin/Pair;)La/e900;
    .locals 10

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, [Lkotlin/Pair;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-long v1, v1

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    int-to-long v3, v3

    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    shl-long/2addr v1, v5

    .line 22
    const-wide v6, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v3, v6

    .line 28
    or-long/2addr v1, v3

    .line 29
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    int-to-long v3, v0

    .line 34
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    int-to-long v8, v0

    .line 41
    shl-long/2addr v3, v5

    .line 42
    and-long v5, v8, v6

    .line 43
    .line 44
    or-long/2addr v3, v5

    .line 45
    invoke-static {p0, v1, v2, v3, v4}, La/yk5;->j([Lkotlin/Pair;JJ)La/e900;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method


# virtual methods
.method public e([BII)[B
    .locals 0

    .line 1
    add-int/2addr p3, p2

    .line 2
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
