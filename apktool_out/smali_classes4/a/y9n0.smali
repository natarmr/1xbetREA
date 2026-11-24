.class public final La/y9n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public final b:La/p7m0;

.field public final c:La/k050;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/xun;->a:La/xun;

    .line 5
    .line 6
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/y9n0;->a:La/p7m0;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/y9n0;->b:La/p7m0;

    .line 22
    .line 23
    new-instance v0, La/k050;

    .line 24
    .line 25
    invoke-direct {v0}, La/k050;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/y9n0;->c:La/k050;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;Z)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    instance-of v4, v3, La/u9n0;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/u9n0;

    .line 13
    .line 14
    iget v5, v4, La/u9n0;->q:I

    .line 15
    .line 16
    const/high16 v6, -0x80000000

    .line 17
    .line 18
    and-int v7, v5, v6

    .line 19
    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sub-int/2addr v5, v6

    .line 23
    iput v5, v4, La/u9n0;->q:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, La/u9n0;

    .line 27
    .line 28
    invoke-direct {v4, v0, v3}, La/u9n0;-><init>(La/y9n0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v3, v4, La/u9n0;->o:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v6, v4, La/u9n0;->q:I

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    if-ne v6, v7, :cond_1

    .line 42
    .line 43
    iget-wide v0, v4, La/u9n0;->l:J

    .line 44
    .line 45
    iget-wide v5, v4, La/u9n0;->k:J

    .line 46
    .line 47
    iget-wide v9, v4, La/u9n0;->j:J

    .line 48
    .line 49
    iget-boolean v2, v4, La/u9n0;->i:Z

    .line 50
    .line 51
    iget-object v7, v4, La/u9n0;->n:La/k050;

    .line 52
    .line 53
    iget-object v4, v4, La/u9n0;->m:La/p7m0;

    .line 54
    .line 55
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-wide v15, v0

    .line 59
    move v14, v2

    .line 60
    move-wide v1, v5

    .line 61
    move-wide v12, v9

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v8

    .line 69
    :cond_2
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    iget-object v3, v0, La/y9n0;->b:La/p7m0;

    .line 77
    .line 78
    iput-object v3, v4, La/u9n0;->m:La/p7m0;

    .line 79
    .line 80
    iget-object v0, v0, La/y9n0;->c:La/k050;

    .line 81
    .line 82
    iput-object v0, v4, La/u9n0;->n:La/k050;

    .line 83
    .line 84
    move/from16 v6, p4

    .line 85
    .line 86
    iput-boolean v6, v4, La/u9n0;->i:Z

    .line 87
    .line 88
    iput-wide v1, v4, La/u9n0;->j:J

    .line 89
    .line 90
    iput-wide v1, v4, La/u9n0;->k:J

    .line 91
    .line 92
    iput-wide v9, v4, La/u9n0;->l:J

    .line 93
    .line 94
    iput v7, v4, La/u9n0;->q:I

    .line 95
    .line 96
    invoke-virtual {v0, v4}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    if-ne v4, v5, :cond_3

    .line 101
    .line 102
    return-object v5

    .line 103
    :cond_3
    move-object v7, v0

    .line 104
    move-wide v12, v1

    .line 105
    move-object v4, v3

    .line 106
    move v14, v6

    .line 107
    goto :goto_2

    .line 108
    :goto_1
    :try_start_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    move-object v3, v0

    .line 113
    check-cast v3, Ljava/util/Map;

    .line 114
    .line 115
    invoke-static {v3}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    new-instance v5, Ljava/lang/Long;

    .line 120
    .line 121
    invoke-direct {v5, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 122
    .line 123
    .line 124
    new-instance v11, La/o8n0;

    .line 125
    .line 126
    invoke-direct/range {v11 .. v16}, La/o8n0;-><init>(JZJ)V

    .line 127
    .line 128
    .line 129
    move-wide v9, v15

    .line 130
    invoke-interface {v3, v5, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    new-instance v0, Ljava/lang/Long;

    .line 140
    .line 141
    invoke-direct {v0, v9, v10}, Ljava/lang/Long;-><init>(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    invoke-interface {v7, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_4
    :goto_2
    move-wide v15, v9

    .line 149
    goto :goto_1

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    invoke-interface {v7, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    throw v0
.end method

.method public final b(JJLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/x9n0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/x9n0;

    .line 7
    .line 8
    iget v1, v0, La/x9n0;->o:I

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
    iput v1, v0, La/x9n0;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/x9n0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/x9n0;-><init>(La/y9n0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/x9n0;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/x9n0;->o:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-wide p1, v0, La/x9n0;->j:J

    .line 38
    .line 39
    iget-wide p3, v0, La/x9n0;->i:J

    .line 40
    .line 41
    iget-object p0, v0, La/x9n0;->l:La/k050;

    .line 42
    .line 43
    iget-object v0, v0, La/x9n0;->k:La/p7m0;

    .line 44
    .line 45
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p5, p0, La/y9n0;->b:La/p7m0;

    .line 59
    .line 60
    iput-object p5, v0, La/x9n0;->k:La/p7m0;

    .line 61
    .line 62
    iget-object p0, p0, La/y9n0;->c:La/k050;

    .line 63
    .line 64
    iput-object p0, v0, La/x9n0;->l:La/k050;

    .line 65
    .line 66
    iput-wide p3, v0, La/x9n0;->i:J

    .line 67
    .line 68
    iput-wide p1, v0, La/x9n0;->j:J

    .line 69
    .line 70
    iput v3, v0, La/x9n0;->o:I

    .line 71
    .line 72
    invoke-virtual {p0, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-ne v0, v1, :cond_3

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_3
    move-object v0, p5

    .line 80
    :cond_4
    :goto_1
    :try_start_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p5

    .line 84
    move-object v1, p5

    .line 85
    check-cast v1, Ljava/util/Map;

    .line 86
    .line 87
    invoke-static {v1}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v2, Ljava/lang/Long;

    .line 92
    .line 93
    invoke-direct {v2, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    check-cast v2, La/o8n0;

    .line 103
    .line 104
    iget-wide v2, v2, La/o8n0;->c:J

    .line 105
    .line 106
    cmp-long v2, v2, p3

    .line 107
    .line 108
    if-nez v2, :cond_5

    .line 109
    .line 110
    new-instance v2, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-direct {v2, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_0
    move-exception p1

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    :goto_2
    invoke-virtual {v0, p5, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    if-eqz p5, :cond_4

    .line 126
    .line 127
    invoke-interface {p0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :goto_3
    invoke-interface {p0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    throw p1
.end method
