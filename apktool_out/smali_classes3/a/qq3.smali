.class public final La/qq3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/chf0;

.field public final b:La/lq3;

.field public final c:La/knf0;

.field public final d:La/btt0;


# direct methods
.method public constructor <init>(La/chf0;La/lq3;La/knf0;La/btt0;)V
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
    iput-object p1, p0, La/qq3;->a:La/chf0;

    .line 8
    .line 9
    iput-object p2, p0, La/qq3;->b:La/lq3;

    .line 10
    .line 11
    iput-object p3, p0, La/qq3;->c:La/knf0;

    .line 12
    .line 13
    iput-object p4, p0, La/qq3;->d:La/btt0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(JLa/csr;JDJLa/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p10

    .line 2
    .line 3
    instance-of v1, v0, La/mq3;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/mq3;

    .line 9
    .line 10
    iget v2, v1, La/mq3;->k:I

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
    iput v2, v1, La/mq3;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/mq3;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/mq3;-><init>(La/qq3;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/mq3;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/mq3;->k:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v5, :cond_1

    .line 38
    .line 39
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_1

    .line 43
    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, La/qq3;->d:La/btt0;

    .line 54
    .line 55
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v3, La/bg8;->Companion:La/ag8;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static/range {p3 .. p3}, La/ag8;->a(La/csr;)La/bg8;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v6, Ljava/lang/Double;

    .line 69
    .line 70
    move-wide/from16 v7, p6

    .line 71
    .line 72
    invoke-direct {v6, v7, v8}, Ljava/lang/Double;-><init>(D)V

    .line 73
    .line 74
    .line 75
    move-object/from16 v7, p3

    .line 76
    .line 77
    iget-object v7, v7, La/csr;->a:La/bsr;

    .line 78
    .line 79
    iget-object v7, v7, La/bsr;->a:La/esr;

    .line 80
    .line 81
    invoke-virtual {v7}, La/esr;->a()Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_3

    .line 86
    .line 87
    move-object v4, v6

    .line 88
    :cond_3
    iget-object v6, p0, La/qq3;->c:La/knf0;

    .line 89
    .line 90
    invoke-virtual {v6}, La/knf0;->c()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-static/range {p8 .. p9}, La/cs0;->u(J)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    new-instance v8, La/tq3;

    .line 99
    .line 100
    new-instance v9, Ljava/lang/Long;

    .line 101
    .line 102
    invoke-direct {v9, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 103
    .line 104
    .line 105
    new-instance v10, Ljava/lang/Long;

    .line 106
    .line 107
    move-wide/from16 v11, p4

    .line 108
    .line 109
    invoke-direct {v10, v11, v12}, Ljava/lang/Long;-><init>(J)V

    .line 110
    .line 111
    .line 112
    new-instance v11, Ljava/lang/Integer;

    .line 113
    .line 114
    const/16 v12, 0x16

    .line 115
    .line 116
    invoke-direct {v11, v12}, Ljava/lang/Integer;-><init>(I)V

    .line 117
    .line 118
    .line 119
    move-object/from16 p3, v3

    .line 120
    .line 121
    move-object/from16 p5, v4

    .line 122
    .line 123
    move-object/from16 p7, v6

    .line 124
    .line 125
    move-object/from16 p8, v7

    .line 126
    .line 127
    move-object p1, v8

    .line 128
    move-object p2, v9

    .line 129
    move-object/from16 p4, v10

    .line 130
    .line 131
    move-object/from16 p6, v11

    .line 132
    .line 133
    invoke-direct/range {p1 .. p8}, La/tq3;-><init>(Ljava/lang/Long;La/bg8;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    move-object v3, p1

    .line 137
    iput v5, v1, La/mq3;->k:I

    .line 138
    .line 139
    iget-object v4, p0, La/qq3;->a:La/chf0;

    .line 140
    .line 141
    iget-object v4, v4, La/chf0;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v4, La/a13;

    .line 144
    .line 145
    invoke-virtual {v4}, La/a13;->invoke()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, La/kp3;

    .line 150
    .line 151
    invoke-interface {v4, v0, v3, v1}, La/kp3;->a(Ljava/lang/String;La/tq3;La/yje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v2, :cond_4

    .line 156
    .line 157
    return-object v2

    .line 158
    :cond_4
    :goto_1
    check-cast v0, La/q16;

    .line 159
    .line 160
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, La/gr3;

    .line 165
    .line 166
    invoke-static {v0}, La/dwi0;->Q(La/gr3;)La/dr3;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object p0, p0, La/qq3;->b:La/lq3;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iput-object v0, p0, La/lq3;->a:La/dr3;

    .line 176
    .line 177
    return-object v0
.end method

.method public final b(JLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/nq3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/nq3;

    .line 7
    .line 8
    iget v1, v0, La/nq3;->k:I

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
    iput v1, v0, La/nq3;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nq3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/nq3;-><init>(La/qq3;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/nq3;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nq3;->k:I

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
    iget-object p3, p0, La/qq3;->d:La/btt0;

    .line 51
    .line 52
    invoke-virtual {p3}, La/btt0;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    new-instance v2, La/jp3;

    .line 57
    .line 58
    iget-object v4, p0, La/qq3;->c:La/knf0;

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
    invoke-direct {v2, v4, p1}, La/jp3;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    iput v3, v0, La/nq3;->k:I

    .line 72
    .line 73
    iget-object p1, p0, La/qq3;->a:La/chf0;

    .line 74
    .line 75
    iget-object p1, p1, La/chf0;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, La/a13;

    .line 78
    .line 79
    invoke-virtual {p1}, La/a13;->invoke()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/kp3;

    .line 84
    .line 85
    invoke-interface {p1, p3, v2, v0}, La/kp3;->d(Ljava/lang/String;La/jp3;La/yje;)Ljava/lang/Object;

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
    check-cast p1, La/gr3;

    .line 99
    .line 100
    invoke-static {p1}, La/dwi0;->Q(La/gr3;)La/dr3;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object p0, p0, La/qq3;->b:La/lq3;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, La/lq3;->a:La/dr3;

    .line 110
    .line 111
    return-object p1
.end method

.method public final c(IJJLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p6, La/oq3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/oq3;

    .line 7
    .line 8
    iget v1, v0, La/oq3;->k:I

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
    iput v1, v0, La/oq3;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/oq3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/oq3;-><init>(La/qq3;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/oq3;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/oq3;->k:I

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
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p6, p0, La/qq3;->d:La/btt0;

    .line 51
    .line 52
    invoke-virtual {p6}, La/btt0;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p6

    .line 56
    new-instance v2, La/pp3;

    .line 57
    .line 58
    new-instance v4, Ljava/lang/Long;

    .line 59
    .line 60
    invoke-direct {v4, p2, p3}, Ljava/lang/Long;-><init>(J)V

    .line 61
    .line 62
    .line 63
    new-instance p2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, La/qq3;->c:La/knf0;

    .line 69
    .line 70
    invoke-virtual {p1}, La/knf0;->c()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p4, p5}, La/cs0;->u(J)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-direct {v2, v4, p2, p1, p3}, La/pp3;-><init>(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    iput v3, v0, La/oq3;->k:I

    .line 82
    .line 83
    iget-object p1, p0, La/qq3;->a:La/chf0;

    .line 84
    .line 85
    iget-object p1, p1, La/chf0;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, La/a13;

    .line 88
    .line 89
    invoke-virtual {p1}, La/a13;->invoke()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, La/kp3;

    .line 94
    .line 95
    invoke-interface {p1, p6, v2, v0}, La/kp3;->c(Ljava/lang/String;La/pp3;La/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p6

    .line 99
    if-ne p6, v1, :cond_3

    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_3
    :goto_1
    check-cast p6, La/q16;

    .line 103
    .line 104
    invoke-virtual {p6}, La/q16;->a()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, La/gr3;

    .line 109
    .line 110
    invoke-static {p1}, La/dwi0;->Q(La/gr3;)La/dr3;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object p0, p0, La/qq3;->b:La/lq3;

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, La/lq3;->a:La/dr3;

    .line 120
    .line 121
    return-object p1
.end method

.method public final d(JIIJLa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p7, La/pq3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p7

    .line 6
    check-cast v0, La/pq3;

    .line 7
    .line 8
    iget v1, v0, La/pq3;->k:I

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
    iput v1, v0, La/pq3;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/pq3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p7}, La/pq3;-><init>(La/qq3;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p7, v0, La/pq3;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/pq3;->k:I

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
    invoke-static {p7}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p7}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p7, p0, La/qq3;->d:La/btt0;

    .line 51
    .line 52
    invoke-virtual {p7}, La/btt0;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p7

    .line 56
    move-wide v4, p1

    .line 57
    new-instance p1, La/gp3;

    .line 58
    .line 59
    new-instance p2, Ljava/lang/Long;

    .line 60
    .line 61
    invoke-direct {p2, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 62
    .line 63
    .line 64
    move v2, p3

    .line 65
    new-instance p3, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-direct {p3, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 68
    .line 69
    .line 70
    move v2, p4

    .line 71
    new-instance p4, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-direct {p4, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, La/qq3;->c:La/knf0;

    .line 77
    .line 78
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {p5, p6}, La/cs0;->u(J)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p6

    .line 86
    move-object p5, v2

    .line 87
    invoke-direct/range {p1 .. p6}, La/gp3;-><init>(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    iput v3, v0, La/pq3;->k:I

    .line 91
    .line 92
    iget-object p2, p0, La/qq3;->a:La/chf0;

    .line 93
    .line 94
    iget-object p2, p2, La/chf0;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p2, La/a13;

    .line 97
    .line 98
    invoke-virtual {p2}, La/a13;->invoke()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, La/kp3;

    .line 103
    .line 104
    invoke-interface {p2, p7, p1, v0}, La/kp3;->b(Ljava/lang/String;La/gp3;La/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p7

    .line 108
    if-ne p7, v1, :cond_3

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_3
    :goto_1
    check-cast p7, La/q16;

    .line 112
    .line 113
    invoke-virtual {p7}, La/q16;->a()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, La/gr3;

    .line 118
    .line 119
    invoke-static {p1}, La/dwi0;->Q(La/gr3;)La/dr3;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget-object p0, p0, La/qq3;->b:La/lq3;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, La/lq3;->a:La/dr3;

    .line 129
    .line 130
    return-object p1
.end method
