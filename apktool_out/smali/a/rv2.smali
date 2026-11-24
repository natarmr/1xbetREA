.class public final La/rv2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xd2;

.field public final b:La/g050;

.field public final c:La/pz40;

.field public final d:La/pz40;

.field public final e:La/zbk;

.field public final f:La/agk0;

.field public final g:La/agk0;

.field public final h:La/pz40;

.field public final i:La/pz40;

.field public final j:La/nv2;


# direct methods
.method public constructor <init>(La/vtj;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/xd2;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/xd2;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/rv2;->a:La/xd2;

    .line 12
    .line 13
    new-instance v0, La/g050;

    .line 14
    .line 15
    invoke-direct {v0}, La/g050;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/rv2;->b:La/g050;

    .line 19
    .line 20
    invoke-static {p2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, La/rv2;->c:La/pz40;

    .line 25
    .line 26
    invoke-static {p2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/rv2;->d:La/pz40;

    .line 31
    .line 32
    new-instance v0, La/st2;

    .line 33
    .line 34
    const/4 v1, 0x4

    .line 35
    invoke-direct {v0, p0, v1}, La/st2;-><init>(La/rv2;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/rv2;->e:La/zbk;

    .line 43
    .line 44
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 45
    .line 46
    invoke-static {v0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/rv2;->f:La/agk0;

    .line 51
    .line 52
    new-instance v0, La/a14;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, La/rfk0;->g()J

    .line 63
    .line 64
    .line 65
    sget-object v0, La/v960;->a:La/ry40;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-static {v0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/rv2;->g:La/agk0;

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/rv2;->h:La/pz40;

    .line 83
    .line 84
    new-instance v0, La/vtj;

    .line 85
    .line 86
    sget-object v2, La/iun;->a:La/iun;

    .line 87
    .line 88
    new-array v1, v1, [F

    .line 89
    .line 90
    invoke-direct {v0, v2, v1}, La/vtj;-><init>(Ljava/util/List;[F)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, La/rv2;->i:La/pz40;

    .line 98
    .line 99
    new-instance v1, La/nv2;

    .line 100
    .line 101
    invoke-direct {v1, p0}, La/nv2;-><init>(La/rv2;)V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, La/rv2;->j:La/nv2;

    .line 105
    .line 106
    check-cast v0, La/hgk0;

    .line 107
    .line 108
    invoke-virtual {v0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p2}, La/rv2;->h(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static b(La/rv2;La/xdr;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v1, La/c050;->a:La/c050;

    .line 2
    .line 3
    iget-object v2, p0, La/rv2;->b:La/g050;

    .line 4
    .line 5
    new-instance v3, La/za;

    .line 6
    .line 7
    const/16 v0, 0xd

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v3, p0, p1, v4, v0}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, La/lpp;

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    invoke-direct/range {v0 .. v5}, La/lpp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, La/wne;->a:La/wne;

    .line 27
    .line 28
    if-ne p0, p1, :cond_0

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/c050;La/ydr;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, La/lv2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/lv2;

    .line 7
    .line 8
    iget v1, v0, La/lv2;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/lv2;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lv2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/lv2;-><init>(La/rv2;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/lv2;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lv2;->k:I

    .line 30
    .line 31
    iget-object v3, p0, La/rv2;->h:La/pz40;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v9, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    move-object p0, v0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 57
    .line 58
    .line 59
    move-result-object p4

    .line 60
    iget-object p4, p4, La/vtj;->a:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {p4, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 63
    .line 64
    .line 65
    move-result p4

    .line 66
    const/4 v2, -0x1

    .line 67
    if-eq p4, v2, :cond_4

    .line 68
    .line 69
    :try_start_1
    iget-object p4, p0, La/rv2;->b:La/g050;

    .line 70
    .line 71
    new-instance v5, La/xg0;

    .line 72
    .line 73
    const/4 v10, 0x2

    .line 74
    move-object v6, p0

    .line 75
    move-object v7, p1

    .line 76
    move-object v8, p3

    .line 77
    invoke-direct/range {v5 .. v10}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    iput v4, v0, La/lv2;->k:I

    .line 81
    .line 82
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-object v8, v5

    .line 86
    new-instance v5, La/lpp;

    .line 87
    .line 88
    const/4 v10, 0x4

    .line 89
    move-object v6, p2

    .line 90
    move-object v7, p4

    .line 91
    invoke-direct/range {v5 .. v10}, La/lpp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v5}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    if-ne p0, v1, :cond_3

    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_3
    :goto_1
    check-cast v3, La/hgk0;

    .line 102
    .line 103
    invoke-virtual {v3, v9}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :goto_2
    check-cast v3, La/hgk0;

    .line 108
    .line 109
    invoke-virtual {v3, v9}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_4
    move-object v6, p0

    .line 114
    move-object v7, p1

    .line 115
    iget-object p0, v6, La/rv2;->d:La/pz40;

    .line 116
    .line 117
    check-cast p0, La/hgk0;

    .line 118
    .line 119
    invoke-virtual {p0, v7}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p0, v6, La/rv2;->c:La/pz40;

    .line 123
    .line 124
    check-cast p0, La/hgk0;

    .line 125
    .line 126
    invoke-virtual {p0, v7}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0
.end method

.method public final c(F)F
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/rv2;->e(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, La/rv2;->f()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sub-float v0, p1, v0

    .line 10
    .line 11
    iget-object p0, p0, La/rv2;->j:La/nv2;

    .line 12
    .line 13
    invoke-static {p0, p1}, La/nv2;->b(La/nv2;F)V

    .line 14
    .line 15
    .line 16
    return v0
.end method

.method public final d()La/vtj;
    .locals 0

    .line 1
    iget-object p0, p0, La/rv2;->i:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vtj;

    .line 10
    .line 11
    return-object p0
.end method

.method public final e(F)F
    .locals 5

    .line 1
    iget-object v0, p0, La/rv2;->f:La/agk0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/agk0;->l()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, La/agk0;->l()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    add-float/2addr v0, p1

    .line 20
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, La/vtj;->c()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/vtj;->b:[F

    .line 33
    .line 34
    array-length v1, p0

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    aget v1, p0, v1

    .line 42
    .line 43
    array-length v2, p0

    .line 44
    const/4 v3, 0x1

    .line 45
    sub-int/2addr v2, v3

    .line 46
    if-gt v3, v2, :cond_2

    .line 47
    .line 48
    :goto_1
    aget v4, p0, v3

    .line 49
    .line 50
    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eq v3, v2, :cond_2

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move p0, v1

    .line 60
    :goto_2
    invoke-static {v0, p1, p0}, La/l1e0;->c(FFF)F

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0
.end method

.method public final f()F
    .locals 1

    .line 1
    iget-object p0, p0, La/rv2;->f:La/agk0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/agk0;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?"

    .line 14
    .line 15
    invoke-static {v0}, La/adx;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, La/agk0;->l()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final g(La/uts0;La/zje;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/rv2;->c:La/pz40;

    .line 2
    .line 3
    check-cast v0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, La/rv2;->f()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v1, v2}, La/vtj;->a(F)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-static {p0, v1, p1, p2}, La/dv2;->c(La/rv2;Ljava/lang/Object;La/uts0;La/yje;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object p1, La/wne;->a:La/wne;

    .line 28
    .line 29
    if-ne p0, p1, :cond_0

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    invoke-static {p0, v0, p1, p2}, La/dv2;->c(La/rv2;Ljava/lang/Object;La/uts0;La/yje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, La/wne;->a:La/wne;

    .line 40
    .line 41
    if-ne p0, p1, :cond_2

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0
.end method

.method public final h(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget-object v0, p0, La/rv2;->b:La/g050;

    .line 2
    .line 3
    iget-object v1, v0, La/g050;->b:La/k050;

    .line 4
    .line 5
    iget-object v0, v0, La/g050;->b:La/k050;

    .line 6
    .line 7
    invoke-virtual {v1}, La/k050;->g()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :try_start_0
    iget-object v3, p0, La/rv2;->j:La/nv2;

    .line 15
    .line 16
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4, p1}, La/vtj;->d(Ljava/lang/Object;)F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    invoke-static {v3, v4}, La/nv2;->b(La/nv2;F)V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, La/rv2;->h:La/pz40;

    .line 34
    .line 35
    check-cast v3, La/hgk0;

    .line 36
    .line 37
    invoke-virtual {v3, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    iget-object v3, p0, La/rv2;->c:La/pz40;

    .line 44
    .line 45
    check-cast v3, La/hgk0;

    .line 46
    .line 47
    invoke-virtual {v3, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/rv2;->d:La/pz40;

    .line 51
    .line 52
    check-cast p0, La/hgk0;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, La/k050;->c(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return v1

    .line 61
    :goto_1
    invoke-virtual {v0, v2}, La/k050;->c(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_1
    return v1
.end method

.method public final i(La/vtj;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La/rv2;->i:La/pz40;

    .line 12
    .line 13
    check-cast v0, La/hgk0;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p2}, La/rv2;->h(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, La/rv2;->h:La/pz40;

    .line 25
    .line 26
    check-cast p0, La/hgk0;

    .line 27
    .line 28
    invoke-virtual {p0, p2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method
