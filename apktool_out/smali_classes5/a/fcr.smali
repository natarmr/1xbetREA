.class public abstract La/fcr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/q4f;->g:La/q4f;

    .line 2
    .line 3
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/fcr;->a:Ljava/util/Set;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(La/hx4;)Z
    .locals 12

    .line 1
    iget-object v0, p0, La/hx4;->c:La/bx6;

    .line 2
    .line 3
    iget-object v0, v0, La/bx6;->b:La/tw6;

    .line 4
    .line 5
    iget-wide v1, v0, La/tw6;->a:D

    .line 6
    .line 7
    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    .line 8
    .line 9
    cmpg-double v5, v1, v3

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-wide v8, v0, La/tw6;->d:D

    .line 17
    .line 18
    iget-wide v10, v0, La/tw6;->e:D

    .line 19
    .line 20
    cmpg-double v0, v8, v1

    .line 21
    .line 22
    if-gtz v0, :cond_1

    .line 23
    .line 24
    cmpg-double v0, v1, v10

    .line 25
    .line 26
    if-gtz v0, :cond_1

    .line 27
    .line 28
    move v0, v7

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move v0, v6

    .line 31
    :goto_1
    iget-object p0, p0, La/hx4;->b:La/yyc;

    .line 32
    .line 33
    iget-object v1, p0, La/yyc;->a:Ljava/math/BigDecimal;

    .line 34
    .line 35
    new-instance v2, Ljava/math/BigDecimal;

    .line 36
    .line 37
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    iget-object p0, p0, La/yyc;->d:Ljava/math/BigDecimal;

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-ltz p0, :cond_2

    .line 57
    .line 58
    move p0, v7

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move p0, v6

    .line 61
    :goto_2
    if-eqz v0, :cond_3

    .line 62
    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    return v7

    .line 66
    :cond_3
    return v6
.end method

.method public static final b(La/pvj0;La/q4f;)Z
    .locals 8

    .line 1
    iget-object v0, p0, La/pvj0;->a:La/bx6;

    .line 2
    .line 3
    iget-boolean p0, p0, La/pvj0;->f:Z

    .line 4
    .line 5
    iget-object v0, v0, La/bx6;->b:La/tw6;

    .line 6
    .line 7
    iget-boolean v1, v0, La/tw6;->k:Z

    .line 8
    .line 9
    sget-object v2, La/q4f;->m:La/q4f;

    .line 10
    .line 11
    if-eq p1, v2, :cond_4

    .line 12
    .line 13
    sget-object v2, La/q4f;->h:La/q4f;

    .line 14
    .line 15
    if-ne p1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-wide v2, v0, La/tw6;->a:D

    .line 19
    .line 20
    if-eqz v1, :cond_5

    .line 21
    .line 22
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    .line 23
    .line 24
    cmpg-double p1, v2, v4

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-wide v4, v0, La/tw6;->d:D

    .line 30
    .line 31
    invoke-virtual {v0}, La/tw6;->b()D

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    cmpg-double p1, v4, v2

    .line 36
    .line 37
    if-gtz p1, :cond_2

    .line 38
    .line 39
    cmpg-double p1, v2, v6

    .line 40
    .line 41
    if-gtz p1, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    iget-boolean p1, v0, La/tw6;->m:Z

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, La/tw6;->b()D

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    cmpl-double p1, v2, v0

    .line 53
    .line 54
    if-gtz p1, :cond_6

    .line 55
    .line 56
    :cond_3
    :goto_0
    if-eqz p0, :cond_5

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    :goto_1
    if-nez v1, :cond_6

    .line 60
    .line 61
    if-eqz p0, :cond_5

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_6
    :goto_2
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public static final c(La/ctf0;)La/mtl;
    .locals 11

    .line 1
    new-instance v0, La/mtl;

    .line 2
    .line 3
    new-instance v1, La/itl;

    .line 4
    .line 5
    new-instance v2, La/wul;

    .line 6
    .line 7
    sget-object v3, La/nul;->e:La/nul;

    .line 8
    .line 9
    sget-object v4, La/oe9;->a:La/oe9;

    .line 10
    .line 11
    new-instance v5, La/ue9;

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    new-array v6, v9, [Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v7, p0, La/ctf0;->b:La/lsm0;

    .line 17
    .line 18
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    const v8, 0x7f1302fa

    .line 23
    .line 24
    .line 25
    invoke-virtual {v7, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-direct {v5, v6}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x1

    .line 34
    const/4 v6, 0x1

    .line 35
    invoke-direct/range {v2 .. v8}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 36
    .line 37
    .line 38
    sget-object v3, La/ybr;->b:La/ybr;

    .line 39
    .line 40
    invoke-direct {v1, v2, v3}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, La/itl;

    .line 44
    .line 45
    move-object v6, v4

    .line 46
    new-instance v4, La/wul;

    .line 47
    .line 48
    sget-object v5, La/iul;->e:La/iul;

    .line 49
    .line 50
    new-instance v7, La/ue9;

    .line 51
    .line 52
    new-array v3, v9, [Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 55
    .line 56
    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const v8, 0x7f13112e

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v8, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {v7, p0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 v10, 0x1

    .line 71
    const/4 v8, 0x1

    .line 72
    invoke-direct/range {v4 .. v10}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 73
    .line 74
    .line 75
    sget-object p0, La/ybr;->c:La/ybr;

    .line 76
    .line 77
    invoke-direct {v2, v4, p0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 78
    .line 79
    .line 80
    filled-new-array {v1, v2}, [La/itl;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-direct {v0, p0}, La/mtl;-><init>(La/a4x;)V

    .line 89
    .line 90
    .line 91
    return-object v0
.end method

.method public static final d(La/a820;)D
    .locals 2

    .line 1
    iget-object v0, p0, La/a820;->c:La/ko7;

    .line 2
    .line 3
    instance-of v1, v0, La/ho7;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/a820;->g:La/hx4;

    .line 8
    .line 9
    iget-object p0, p0, La/hx4;->c:La/bx6;

    .line 10
    .line 11
    iget-object p0, p0, La/bx6;->b:La/tw6;

    .line 12
    .line 13
    iget-wide v0, p0, La/tw6;->a:D

    .line 14
    .line 15
    return-wide v0

    .line 16
    :cond_0
    sget-object v1, La/jo7;->b:La/jo7;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, La/a820;->e:La/pvj0;

    .line 25
    .line 26
    iget-object p0, p0, La/pvj0;->a:La/bx6;

    .line 27
    .line 28
    iget-object p0, p0, La/bx6;->b:La/tw6;

    .line 29
    .line 30
    iget-wide v0, p0, La/tw6;->a:D

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_1
    sget-object p0, La/io7;->b:La/io7;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    return-wide v0

    .line 44
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 45
    .line 46
    .line 47
    return-wide v0
.end method

.method public static final e(La/ctf0;Z)La/mtl;
    .locals 9

    .line 1
    new-instance v0, La/mtl;

    .line 2
    .line 3
    new-instance v1, La/itl;

    .line 4
    .line 5
    new-instance v2, La/wul;

    .line 6
    .line 7
    sget-object v3, La/iul;->e:La/iul;

    .line 8
    .line 9
    sget-object v4, La/oe9;->a:La/oe9;

    .line 10
    .line 11
    new-instance v5, La/ue9;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    new-array v7, v6, [Ljava/lang/Object;

    .line 15
    .line 16
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 17
    .line 18
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    const v7, 0x7f130528

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v5, p0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x1

    .line 34
    move v6, p1

    .line 35
    invoke-direct/range {v2 .. v8}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 36
    .line 37
    .line 38
    sget-object p0, La/ybr;->a:La/ybr;

    .line 39
    .line 40
    invoke-direct {v1, v2, p0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 41
    .line 42
    .line 43
    filled-new-array {v1}, [La/itl;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {v0, p0}, La/mtl;-><init>(La/a4x;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public static final f(La/a820;)La/df6;
    .locals 7

    .line 1
    new-instance v0, La/df6;

    .line 2
    .line 3
    iget-object v1, p0, La/a820;->d:La/xm5;

    .line 4
    .line 5
    iget-object v2, p0, La/a820;->c:La/ko7;

    .line 6
    .line 7
    invoke-static {p0}, La/fcr;->d(La/a820;)D

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget-object v5, v1, La/xm5;->c:La/ql5;

    .line 12
    .line 13
    iget-wide v5, v5, La/ql5;->b:D

    .line 14
    .line 15
    cmpl-double v3, v3, v5

    .line 16
    .line 17
    if-lez v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    :goto_0
    iget-boolean p0, p0, La/a820;->q:Z

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3, p0}, La/df6;-><init>(La/xm5;La/ko7;ZZ)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static final g(La/a820;)La/fn8;
    .locals 7

    .line 1
    new-instance v0, La/fn8;

    .line 2
    .line 3
    iget-boolean v1, p0, La/a820;->i:Z

    .line 4
    .line 5
    iget-object v2, p0, La/a820;->c:La/ko7;

    .line 6
    .line 7
    iget-boolean v3, p0, La/a820;->q:Z

    .line 8
    .line 9
    instance-of v4, v2, La/jo7;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, La/a820;->e:La/pvj0;

    .line 16
    .line 17
    iget-object p0, p0, La/a820;->j:La/q4f;

    .line 18
    .line 19
    invoke-static {v2, p0}, La/fcr;->b(La/pvj0;La/q4f;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    :goto_0
    move v5, v6

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    instance-of v4, v2, La/ho7;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, La/a820;->g:La/hx4;

    .line 34
    .line 35
    invoke-static {p0}, La/fcr;->a(La/hx4;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    instance-of v2, v2, La/io7;

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iget-object p0, p0, La/a820;->f:La/dzc0;

    .line 49
    .line 50
    iget-boolean p0, p0, La/dzc0;->e:Z

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    invoke-direct {v0, v1, v5}, La/fn8;-><init>(ZZ)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method
