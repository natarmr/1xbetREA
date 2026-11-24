.class public final La/v0l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/o0l;

.field public final c:La/m0l;

.field public final d:La/btt0;


# direct methods
.method public constructor <init>(La/knf0;La/o0l;La/m0l;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/v0l;->a:La/knf0;

    .line 11
    .line 12
    iput-object p2, p0, La/v0l;->b:La/o0l;

    .line 13
    .line 14
    iput-object p3, p0, La/v0l;->c:La/m0l;

    .line 15
    .line 16
    iput-object p4, p0, La/v0l;->d:La/btt0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/p0l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/p0l;

    .line 7
    .line 8
    iget v1, v0, La/p0l;->k:I

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
    iput v1, v0, La/p0l;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/p0l;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/p0l;-><init>(La/v0l;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/p0l;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/p0l;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, La/v0l;->d:La/btt0;

    .line 51
    .line 52
    invoke-virtual {p2}, La/btt0;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object v2, p0, La/v0l;->a:La/knf0;

    .line 57
    .line 58
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iput v3, v0, La/p0l;->k:I

    .line 63
    .line 64
    iget-object p0, p0, La/v0l;->b:La/o0l;

    .line 65
    .line 66
    iget-object p0, p0, La/o0l;->b:La/ucj;

    .line 67
    .line 68
    invoke-virtual {p0}, La/ucj;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/kzk;

    .line 73
    .line 74
    new-instance v4, La/iv5;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v9, 0x5

    .line 78
    move v6, p1

    .line 79
    move-object v7, p3

    .line 80
    invoke-direct/range {v4 .. v9}, La/iv5;-><init>(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, p2, v4, v0}, La/kzk;->f(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-ne p2, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    :goto_1
    check-cast p2, La/q16;

    .line 91
    .line 92
    invoke-virtual {p2}, La/q16;->a()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/y0l;

    .line 97
    .line 98
    invoke-static {p0}, La/ieb;->a0(La/y0l;)La/n0l;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method

.method public final b(DJLa/zje;La/csr;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v0, La/q0l;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/q0l;

    .line 11
    .line 12
    iget v3, v2, La/q0l;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/q0l;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/q0l;

    .line 25
    .line 26
    invoke-direct {v2, p0, v0}, La/q0l;-><init>(La/v0l;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/q0l;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/q0l;->k:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v6, :cond_1

    .line 40
    .line 41
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v5

    .line 51
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/v0l;->d:La/btt0;

    .line 55
    .line 56
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v4, p0, La/v0l;->a:La/knf0;

    .line 61
    .line 62
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    iput v6, v2, La/q0l;->k:I

    .line 67
    .line 68
    iget-object p0, p0, La/v0l;->b:La/o0l;

    .line 69
    .line 70
    iget-object p0, p0, La/o0l;->b:La/ucj;

    .line 71
    .line 72
    invoke-virtual {p0}, La/ucj;->invoke()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, La/kzk;

    .line 77
    .line 78
    new-instance v4, Ljava/lang/Double;

    .line 79
    .line 80
    invoke-direct {v4, p1, p2}, Ljava/lang/Double;-><init>(D)V

    .line 81
    .line 82
    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    iget-object v6, v1, La/csr;->a:La/bsr;

    .line 86
    .line 87
    iget-object v6, v6, La/bsr;->a:La/esr;

    .line 88
    .line 89
    invoke-virtual {v6}, La/esr;->a()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_3

    .line 94
    .line 95
    move-object v11, v4

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    move-object v11, v5

    .line 98
    :goto_1
    if-eqz v1, :cond_4

    .line 99
    .line 100
    sget-object v4, La/bg8;->Companion:La/ag8;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, La/ag8;->a(La/csr;)La/bg8;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    :cond_4
    move-object v10, v5

    .line 110
    new-instance v7, La/uv5;

    .line 111
    .line 112
    move-wide/from16 v8, p3

    .line 113
    .line 114
    invoke-direct/range {v7 .. v12}, La/uv5;-><init>(JLa/bg8;Ljava/lang/Double;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p0, v0, v7, v2}, La/kzk;->e(Ljava/lang/String;La/uv5;La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-ne v0, v3, :cond_5

    .line 122
    .line 123
    return-object v3

    .line 124
    :cond_5
    :goto_2
    check-cast v0, La/q16;

    .line 125
    .line 126
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, La/y0l;

    .line 131
    .line 132
    invoke-static {p0}, La/ieb;->a0(La/y0l;)La/n0l;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0
.end method

.method public final c(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, La/r0l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/r0l;

    .line 7
    .line 8
    iget v1, v0, La/r0l;->k:I

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
    iput v1, v0, La/r0l;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/r0l;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/r0l;-><init>(La/v0l;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/r0l;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/r0l;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p3, p0, La/v0l;->d:La/btt0;

    .line 51
    .line 52
    invoke-virtual {p3}, La/btt0;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    iget-object v2, p0, La/v0l;->a:La/knf0;

    .line 57
    .line 58
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iput v3, v0, La/r0l;->k:I

    .line 63
    .line 64
    iget-object p0, p0, La/v0l;->b:La/o0l;

    .line 65
    .line 66
    iget-object p0, p0, La/o0l;->b:La/ucj;

    .line 67
    .line 68
    invoke-virtual {p0}, La/ucj;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/kzk;

    .line 73
    .line 74
    new-instance v4, La/iv5;

    .line 75
    .line 76
    long-to-int p1, p1

    .line 77
    new-instance p2, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    const/4 v6, 0x0

    .line 87
    const/4 v9, 0x6

    .line 88
    move-object v7, p4

    .line 89
    invoke-direct/range {v4 .. v9}, La/iv5;-><init>(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p0, p3, v4, v0}, La/kzk;->b(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    if-ne p3, v1, :cond_3

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_3
    :goto_1
    check-cast p3, La/q16;

    .line 100
    .line 101
    invoke-virtual {p3}, La/q16;->a()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, La/y0l;

    .line 106
    .line 107
    invoke-static {p0}, La/ieb;->a0(La/y0l;)La/n0l;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0
.end method

.method public final d(Ljava/lang/String;I[IIILa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, La/s0l;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/s0l;

    .line 9
    .line 10
    iget v2, v1, La/s0l;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/s0l;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/s0l;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/s0l;-><init>(La/v0l;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/s0l;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/s0l;->k:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, La/v0l;->d:La/btt0;

    .line 53
    .line 54
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v3, p0, La/v0l;->a:La/knf0;

    .line 59
    .line 60
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    iput v4, v1, La/s0l;->k:I

    .line 65
    .line 66
    iget-object p0, p0, La/v0l;->b:La/o0l;

    .line 67
    .line 68
    iget-object p0, p0, La/o0l;->b:La/ucj;

    .line 69
    .line 70
    invoke-virtual {p0}, La/ucj;->invoke()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/kzk;

    .line 75
    .line 76
    new-instance v5, La/c320;

    .line 77
    .line 78
    move-object v11, p1

    .line 79
    move v10, p2

    .line 80
    move-object v7, p3

    .line 81
    move/from16 v6, p4

    .line 82
    .line 83
    move/from16 v8, p5

    .line 84
    .line 85
    invoke-direct/range {v5 .. v11}, La/c320;-><init>(I[IILjava/lang/String;ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p0, v0, v5, v1}, La/kzk;->c(Ljava/lang/String;La/c320;La/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-ne v0, v2, :cond_3

    .line 93
    .line 94
    return-object v2

    .line 95
    :cond_3
    :goto_1
    check-cast v0, La/q16;

    .line 96
    .line 97
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, La/y0l;

    .line 102
    .line 103
    invoke-static {p0}, La/ieb;->a0(La/y0l;)La/n0l;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method

.method public final e(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/t0l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/t0l;

    .line 7
    .line 8
    iget v1, v0, La/t0l;->k:I

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
    iput v1, v0, La/t0l;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/t0l;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/t0l;-><init>(La/v0l;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/t0l;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/t0l;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, La/v0l;->d:La/btt0;

    .line 51
    .line 52
    invoke-virtual {p2}, La/btt0;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object v2, p0, La/v0l;->a:La/knf0;

    .line 57
    .line 58
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iput v3, v0, La/t0l;->k:I

    .line 63
    .line 64
    iget-object p0, p0, La/v0l;->b:La/o0l;

    .line 65
    .line 66
    iget-object p0, p0, La/o0l;->b:La/ucj;

    .line 67
    .line 68
    invoke-virtual {p0}, La/ucj;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/kzk;

    .line 73
    .line 74
    new-instance v4, La/iv5;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v9, 0x5

    .line 78
    move v6, p1

    .line 79
    move-object v7, p3

    .line 80
    invoke-direct/range {v4 .. v9}, La/iv5;-><init>(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, p2, v4, v0}, La/kzk;->a(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-ne p2, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    :goto_1
    check-cast p2, La/q16;

    .line 91
    .line 92
    invoke-virtual {p2}, La/q16;->a()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/y0l;

    .line 97
    .line 98
    invoke-static {p0}, La/ieb;->a0(La/y0l;)La/n0l;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method

.method public final f(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/u0l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/u0l;

    .line 7
    .line 8
    iget v1, v0, La/u0l;->k:I

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
    iput v1, v0, La/u0l;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/u0l;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/u0l;-><init>(La/v0l;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/u0l;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/u0l;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, La/v0l;->d:La/btt0;

    .line 51
    .line 52
    invoke-virtual {p2}, La/btt0;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object v2, p0, La/v0l;->a:La/knf0;

    .line 57
    .line 58
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iput v3, v0, La/u0l;->k:I

    .line 63
    .line 64
    iget-object p0, p0, La/v0l;->b:La/o0l;

    .line 65
    .line 66
    iget-object p0, p0, La/o0l;->b:La/ucj;

    .line 67
    .line 68
    invoke-virtual {p0}, La/ucj;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/kzk;

    .line 73
    .line 74
    new-instance v4, La/iv5;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v9, 0x5

    .line 78
    move v6, p1

    .line 79
    move-object v7, p3

    .line 80
    invoke-direct/range {v4 .. v9}, La/iv5;-><init>(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, p2, v4, v0}, La/kzk;->d(Ljava/lang/String;La/iv5;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-ne p2, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    :goto_1
    check-cast p2, La/q16;

    .line 91
    .line 92
    invoke-virtual {p2}, La/q16;->a()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/y0l;

    .line 97
    .line 98
    invoke-static {p0}, La/ieb;->a0(La/y0l;)La/n0l;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
