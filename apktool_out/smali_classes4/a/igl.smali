.class public final La/igl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/dgl;

.field public final c:La/zri;

.field public final d:La/btt0;


# direct methods
.method public constructor <init>(La/knf0;La/dgl;La/zri;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/igl;->a:La/knf0;

    .line 8
    .line 9
    iput-object p2, p0, La/igl;->b:La/dgl;

    .line 10
    .line 11
    iput-object p3, p0, La/igl;->c:La/zri;

    .line 12
    .line 13
    iput-object p4, p0, La/igl;->d:La/btt0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(JLa/csr;JDJLa/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p10

    .line 4
    .line 5
    instance-of v2, v1, La/egl;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/egl;

    .line 11
    .line 12
    iget v3, v2, La/egl;->k:I

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
    iput v3, v2, La/egl;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/egl;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/egl;-><init>(La/igl;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/egl;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/egl;->k:I

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
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v5

    .line 51
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, La/igl;->d:La/btt0;

    .line 55
    .line 56
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v4, La/bg8;->Companion:La/ag8;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static/range {p3 .. p3}, La/ag8;->a(La/csr;)La/bg8;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    new-instance v4, Ljava/lang/Double;

    .line 70
    .line 71
    move-wide/from16 v7, p6

    .line 72
    .line 73
    invoke-direct {v4, v7, v8}, Ljava/lang/Double;-><init>(D)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v7, p3

    .line 77
    .line 78
    iget-object v7, v7, La/csr;->a:La/bsr;

    .line 79
    .line 80
    iget-object v7, v7, La/bsr;->a:La/esr;

    .line 81
    .line 82
    invoke-virtual {v7}, La/esr;->a()Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_3

    .line 87
    .line 88
    move-object v13, v4

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move-object v13, v5

    .line 91
    :goto_1
    iget-object v4, v0, La/igl;->a:La/knf0;

    .line 92
    .line 93
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    invoke-static/range {p8 .. p9}, La/cs0;->u(J)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v15

    .line 101
    new-instance v7, La/lgl;

    .line 102
    .line 103
    move-wide/from16 v8, p1

    .line 104
    .line 105
    move-wide/from16 v11, p4

    .line 106
    .line 107
    invoke-direct/range {v7 .. v15}, La/lgl;-><init>(JLa/bg8;JLjava/lang/Double;Ljava/lang/String;Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    iput v6, v2, La/egl;->k:I

    .line 111
    .line 112
    iget-object v4, v0, La/igl;->c:La/zri;

    .line 113
    .line 114
    iget-object v4, v4, La/zri;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v4, La/ucj;

    .line 117
    .line 118
    invoke-virtual {v4}, La/ucj;->invoke()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, La/dfl;

    .line 123
    .line 124
    invoke-interface {v4, v1, v7, v2}, La/dfl;->d(Ljava/lang/String;La/lgl;La/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    if-ne v1, v3, :cond_4

    .line 129
    .line 130
    return-object v3

    .line 131
    :cond_4
    :goto_2
    check-cast v1, La/q16;

    .line 132
    .line 133
    invoke-virtual {v1}, La/q16;->a()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, La/ygl;

    .line 138
    .line 139
    invoke-static {v1}, La/tdc;->d0(La/ygl;)La/vgl;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v0, v0, La/igl;->b:La/dgl;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iput-object v1, v0, La/dgl;->a:La/vgl;

    .line 149
    .line 150
    return-object v1
.end method

.method public final b(JLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/fgl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/fgl;

    .line 7
    .line 8
    iget v1, v0, La/fgl;->k:I

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
    iput v1, v0, La/fgl;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fgl;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/fgl;-><init>(La/igl;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/fgl;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fgl;->k:I

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
    iget-object p3, p0, La/igl;->d:La/btt0;

    .line 51
    .line 52
    invoke-virtual {p3}, La/btt0;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    new-instance v2, La/cfl;

    .line 57
    .line 58
    iget-object v4, p0, La/igl;->a:La/knf0;

    .line 59
    .line 60
    invoke-virtual {v4}, La/knf0;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {p1, p2}, La/cs0;->u(J)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v2, v4, p1}, La/cfl;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    iput v3, v0, La/fgl;->k:I

    .line 72
    .line 73
    iget-object p1, p0, La/igl;->c:La/zri;

    .line 74
    .line 75
    iget-object p1, p1, La/zri;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, La/ucj;

    .line 78
    .line 79
    invoke-virtual {p1}, La/ucj;->invoke()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/dfl;

    .line 84
    .line 85
    invoke-interface {p1, p3, v2, v0}, La/dfl;->c(Ljava/lang/String;La/cfl;La/yje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    if-ne p3, v1, :cond_3

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_3
    :goto_1
    check-cast p3, La/q16;

    .line 93
    .line 94
    invoke-virtual {p3}, La/q16;->a()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, La/ygl;

    .line 99
    .line 100
    invoke-static {p1}, La/tdc;->d0(La/ygl;)La/vgl;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object p0, p0, La/igl;->b:La/dgl;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, La/dgl;->a:La/vgl;

    .line 110
    .line 111
    return-object p1
.end method

.method public final c(IJJLa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, La/ggl;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/ggl;

    .line 9
    .line 10
    iget v2, v1, La/ggl;->k:I

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
    iput v2, v1, La/ggl;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/ggl;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/ggl;-><init>(La/igl;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/ggl;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/ggl;->k:I

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
    iget-object v0, p0, La/igl;->d:La/btt0;

    .line 53
    .line 54
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v5, La/hfl;

    .line 59
    .line 60
    iget-object v3, p0, La/igl;->a:La/knf0;

    .line 61
    .line 62
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-static/range {p4 .. p5}, La/cs0;->u(J)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    move v6, p1

    .line 71
    move-wide v7, p2

    .line 72
    invoke-direct/range {v5 .. v10}, La/hfl;-><init>(IJLjava/lang/String;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    iput v4, v1, La/ggl;->k:I

    .line 76
    .line 77
    iget-object p1, p0, La/igl;->c:La/zri;

    .line 78
    .line 79
    iget-object p1, p1, La/zri;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, La/ucj;

    .line 82
    .line 83
    invoke-virtual {p1}, La/ucj;->invoke()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, La/dfl;

    .line 88
    .line 89
    invoke-interface {p1, v0, v5, v1}, La/dfl;->b(Ljava/lang/String;La/hfl;La/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-ne v0, v2, :cond_3

    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_3
    :goto_1
    check-cast v0, La/q16;

    .line 97
    .line 98
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, La/ygl;

    .line 103
    .line 104
    invoke-static {p1}, La/tdc;->d0(La/ygl;)La/vgl;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object p0, p0, La/igl;->b:La/dgl;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, La/dgl;->a:La/vgl;

    .line 114
    .line 115
    return-object p1
.end method

.method public final d(JIIJLa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    instance-of v1, v0, La/hgl;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/hgl;

    .line 9
    .line 10
    iget v2, v1, La/hgl;->k:I

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
    iput v2, v1, La/hgl;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/hgl;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/hgl;-><init>(La/igl;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/hgl;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/hgl;->k:I

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
    iget-object v0, p0, La/igl;->d:La/btt0;

    .line 53
    .line 54
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v5, La/zel;

    .line 59
    .line 60
    iget-object v3, p0, La/igl;->a:La/knf0;

    .line 61
    .line 62
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-static/range {p5 .. p6}, La/cs0;->u(J)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    move-wide v8, p1

    .line 71
    move v6, p3

    .line 72
    move/from16 v7, p4

    .line 73
    .line 74
    invoke-direct/range {v5 .. v11}, La/zel;-><init>(IIJLjava/lang/String;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    iput v4, v1, La/hgl;->k:I

    .line 78
    .line 79
    iget-object p1, p0, La/igl;->c:La/zri;

    .line 80
    .line 81
    iget-object p1, p1, La/zri;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, La/ucj;

    .line 84
    .line 85
    invoke-virtual {p1}, La/ucj;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, La/dfl;

    .line 90
    .line 91
    invoke-interface {p1, v0, v5, v1}, La/dfl;->a(Ljava/lang/String;La/zel;La/yje;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-ne v0, v2, :cond_3

    .line 96
    .line 97
    return-object v2

    .line 98
    :cond_3
    :goto_1
    check-cast v0, La/q16;

    .line 99
    .line 100
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, La/ygl;

    .line 105
    .line 106
    invoke-static {p1}, La/tdc;->d0(La/ygl;)La/vgl;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object p0, p0, La/igl;->b:La/dgl;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, La/dgl;->a:La/vgl;

    .line 116
    .line 117
    return-object p1
.end method
