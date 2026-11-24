.class public final La/abp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public final b:La/p7m0;

.field public final c:La/p7m0;

.field public final d:La/p7m0;

.field public final e:La/p7m0;

.field public final f:La/p7m0;

.field public final g:La/p7m0;

.field public final h:La/p7m0;

.field public final i:La/k050;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/jap;->a:La/jap;

    .line 5
    .line 6
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, La/abp;->a:La/p7m0;

    .line 11
    .line 12
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/abp;->b:La/p7m0;

    .line 17
    .line 18
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, La/abp;->c:La/p7m0;

    .line 23
    .line 24
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/abp;->d:La/p7m0;

    .line 29
    .line 30
    const-string v0, ""

    .line 31
    .line 32
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/abp;->e:La/p7m0;

    .line 37
    .line 38
    new-instance v0, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, La/abp;->f:La/p7m0;

    .line 48
    .line 49
    new-instance v0, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/abp;->g:La/p7m0;

    .line 59
    .line 60
    new-instance v0, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/abp;->h:La/p7m0;

    .line 70
    .line 71
    new-instance v0, La/k050;

    .line 72
    .line 73
    invoke-direct {v0}, La/k050;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/abp;->i:La/k050;

    .line 77
    .line 78
    return-void
.end method

.method public static d(La/gmq;)La/rwk;
    .locals 3

    .line 1
    new-instance v0, La/i89;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 6
    .line 7
    .line 8
    new-instance p0, La/x6o;

    .line 9
    .line 10
    const/16 v1, 0x1d

    .line 11
    .line 12
    invoke-direct {p0, v1}, La/x6o;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sget-object v1, La/i120;->f:La/eoh0;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-static {v2, p0}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, p0}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static e(La/kap;)Ljava/util/List;
    .locals 1

    .line 1
    instance-of v0, p0, La/iap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, La/iap;

    .line 6
    .line 7
    iget-object p0, p0, La/iap;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/List;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, La/iun;->a:La/iun;

    .line 13
    .line 14
    return-object p0
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
    instance-of v4, v3, La/lap;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/lap;

    .line 13
    .line 14
    iget v5, v4, La/lap;->q:I

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
    iput v5, v4, La/lap;->q:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, La/lap;

    .line 27
    .line 28
    invoke-direct {v4, v0, v3}, La/lap;-><init>(La/abp;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v3, v4, La/lap;->o:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v6, v4, La/lap;->q:I

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
    iget-wide v0, v4, La/lap;->k:J

    .line 44
    .line 45
    iget-wide v5, v4, La/lap;->j:J

    .line 46
    .line 47
    iget-boolean v2, v4, La/lap;->l:Z

    .line 48
    .line 49
    iget-wide v9, v4, La/lap;->i:J

    .line 50
    .line 51
    iget-object v7, v4, La/lap;->n:La/k050;

    .line 52
    .line 53
    iget-object v4, v4, La/lap;->m:La/p7m0;

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
    iget-object v3, v0, La/abp;->h:La/p7m0;

    .line 77
    .line 78
    iput-object v3, v4, La/lap;->m:La/p7m0;

    .line 79
    .line 80
    iget-object v0, v0, La/abp;->i:La/k050;

    .line 81
    .line 82
    iput-object v0, v4, La/lap;->n:La/k050;

    .line 83
    .line 84
    iput-wide v1, v4, La/lap;->i:J

    .line 85
    .line 86
    move/from16 v6, p4

    .line 87
    .line 88
    iput-boolean v6, v4, La/lap;->l:Z

    .line 89
    .line 90
    iput-wide v1, v4, La/lap;->j:J

    .line 91
    .line 92
    iput-wide v9, v4, La/lap;->k:J

    .line 93
    .line 94
    iput v7, v4, La/lap;->q:I

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
    new-instance v11, La/fd90;

    .line 125
    .line 126
    invoke-direct/range {v11 .. v16}, La/fd90;-><init>(JZJ)V

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

.method public final b(JZLa/xvs;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    instance-of v4, v3, La/map;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/map;

    .line 13
    .line 14
    iget v5, v4, La/map;->r:I

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
    iput v5, v4, La/map;->r:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, La/map;

    .line 27
    .line 28
    invoke-direct {v4, v0, v3}, La/map;-><init>(La/abp;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v3, v4, La/map;->p:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v6, v4, La/map;->r:I

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
    iget-wide v0, v4, La/map;->k:J

    .line 44
    .line 45
    iget-wide v5, v4, La/map;->j:J

    .line 46
    .line 47
    iget-boolean v2, v4, La/map;->l:Z

    .line 48
    .line 49
    iget-wide v9, v4, La/map;->i:J

    .line 50
    .line 51
    iget-object v7, v4, La/map;->o:La/k050;

    .line 52
    .line 53
    iget-object v11, v4, La/map;->n:La/p7m0;

    .line 54
    .line 55
    iget-object v4, v4, La/map;->m:La/xvs;

    .line 56
    .line 57
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-wide/from16 v17, v0

    .line 61
    .line 62
    move v15, v2

    .line 63
    move-object/from16 v16, v4

    .line 64
    .line 65
    move-wide v1, v5

    .line 66
    move-wide v13, v9

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v8

    .line 74
    :cond_2
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v9

    .line 81
    move-object/from16 v3, p4

    .line 82
    .line 83
    iput-object v3, v4, La/map;->m:La/xvs;

    .line 84
    .line 85
    iget-object v11, v0, La/abp;->f:La/p7m0;

    .line 86
    .line 87
    iput-object v11, v4, La/map;->n:La/p7m0;

    .line 88
    .line 89
    iget-object v0, v0, La/abp;->i:La/k050;

    .line 90
    .line 91
    iput-object v0, v4, La/map;->o:La/k050;

    .line 92
    .line 93
    iput-wide v1, v4, La/map;->i:J

    .line 94
    .line 95
    move/from16 v6, p3

    .line 96
    .line 97
    iput-boolean v6, v4, La/map;->l:Z

    .line 98
    .line 99
    iput-wide v1, v4, La/map;->j:J

    .line 100
    .line 101
    iput-wide v9, v4, La/map;->k:J

    .line 102
    .line 103
    iput v7, v4, La/map;->r:I

    .line 104
    .line 105
    invoke-virtual {v0, v4}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-ne v4, v5, :cond_3

    .line 110
    .line 111
    return-object v5

    .line 112
    :cond_3
    move-object v7, v0

    .line 113
    move-wide v13, v1

    .line 114
    move-object/from16 v16, v3

    .line 115
    .line 116
    move v15, v6

    .line 117
    goto :goto_2

    .line 118
    :goto_1
    :try_start_0
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    move-object v3, v0

    .line 123
    check-cast v3, Ljava/util/Map;

    .line 124
    .line 125
    invoke-static {v3}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    new-instance v4, Ljava/lang/Long;

    .line 130
    .line 131
    invoke-direct {v4, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 132
    .line 133
    .line 134
    new-instance v12, La/hd90;

    .line 135
    .line 136
    invoke-direct/range {v12 .. v18}, La/hd90;-><init>(JZLa/xvs;J)V

    .line 137
    .line 138
    .line 139
    move-wide/from16 v9, v17

    .line 140
    .line 141
    invoke-interface {v3, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    new-instance v0, Ljava/lang/Long;

    .line 151
    .line 152
    invoke-direct {v0, v9, v10}, Ljava/lang/Long;-><init>(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    invoke-interface {v7, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_4
    :goto_2
    move-wide/from16 v17, v9

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    invoke-interface {v7, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    throw v0
.end method

.method public final c(JZLa/tnp0;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    instance-of v4, v3, La/nap;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/nap;

    .line 13
    .line 14
    iget v5, v4, La/nap;->r:I

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
    iput v5, v4, La/nap;->r:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, La/nap;

    .line 27
    .line 28
    invoke-direct {v4, v0, v3}, La/nap;-><init>(La/abp;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v3, v4, La/nap;->p:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v6, v4, La/nap;->r:I

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
    iget-wide v0, v4, La/nap;->k:J

    .line 44
    .line 45
    iget-wide v5, v4, La/nap;->j:J

    .line 46
    .line 47
    iget-boolean v2, v4, La/nap;->l:Z

    .line 48
    .line 49
    iget-wide v9, v4, La/nap;->i:J

    .line 50
    .line 51
    iget-object v7, v4, La/nap;->o:La/k050;

    .line 52
    .line 53
    iget-object v11, v4, La/nap;->n:La/p7m0;

    .line 54
    .line 55
    iget-object v4, v4, La/nap;->m:La/tnp0;

    .line 56
    .line 57
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-wide/from16 v16, v0

    .line 61
    .line 62
    move v15, v2

    .line 63
    move-object/from16 v18, v4

    .line 64
    .line 65
    move-wide v1, v5

    .line 66
    move-wide v13, v9

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v8

    .line 74
    :cond_2
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v9

    .line 81
    move-object/from16 v3, p4

    .line 82
    .line 83
    iput-object v3, v4, La/nap;->m:La/tnp0;

    .line 84
    .line 85
    iget-object v11, v0, La/abp;->g:La/p7m0;

    .line 86
    .line 87
    iput-object v11, v4, La/nap;->n:La/p7m0;

    .line 88
    .line 89
    iget-object v0, v0, La/abp;->i:La/k050;

    .line 90
    .line 91
    iput-object v0, v4, La/nap;->o:La/k050;

    .line 92
    .line 93
    iput-wide v1, v4, La/nap;->i:J

    .line 94
    .line 95
    move/from16 v6, p3

    .line 96
    .line 97
    iput-boolean v6, v4, La/nap;->l:Z

    .line 98
    .line 99
    iput-wide v1, v4, La/nap;->j:J

    .line 100
    .line 101
    iput-wide v9, v4, La/nap;->k:J

    .line 102
    .line 103
    iput v7, v4, La/nap;->r:I

    .line 104
    .line 105
    invoke-virtual {v0, v4}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-ne v4, v5, :cond_3

    .line 110
    .line 111
    return-object v5

    .line 112
    :cond_3
    move-object v7, v0

    .line 113
    move-wide v13, v1

    .line 114
    move-object/from16 v18, v3

    .line 115
    .line 116
    move v15, v6

    .line 117
    goto :goto_2

    .line 118
    :goto_1
    :try_start_0
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    move-object v3, v0

    .line 123
    check-cast v3, Ljava/util/Map;

    .line 124
    .line 125
    invoke-static {v3}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    new-instance v4, Ljava/lang/Long;

    .line 130
    .line 131
    invoke-direct {v4, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 132
    .line 133
    .line 134
    new-instance v12, La/kd90;

    .line 135
    .line 136
    invoke-direct/range {v12 .. v18}, La/kd90;-><init>(JZJLa/tnp0;)V

    .line 137
    .line 138
    .line 139
    move-wide/from16 v9, v16

    .line 140
    .line 141
    invoke-interface {v3, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    new-instance v0, Ljava/lang/Long;

    .line 151
    .line 152
    invoke-direct {v0, v9, v10}, Ljava/lang/Long;-><init>(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    invoke-interface {v7, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_4
    :goto_2
    move-wide/from16 v16, v9

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    invoke-interface {v7, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    throw v0
.end method

.method public final f(JJLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/xap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/xap;

    .line 7
    .line 8
    iget v1, v0, La/xap;->o:I

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
    iput v1, v0, La/xap;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/xap;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/xap;-><init>(La/abp;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/xap;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/xap;->o:I

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
    iget-wide p1, v0, La/xap;->j:J

    .line 38
    .line 39
    iget-wide p3, v0, La/xap;->i:J

    .line 40
    .line 41
    iget-object p0, v0, La/xap;->l:La/k050;

    .line 42
    .line 43
    iget-object v0, v0, La/xap;->k:La/p7m0;

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
    iget-object p5, p0, La/abp;->h:La/p7m0;

    .line 59
    .line 60
    iput-object p5, v0, La/xap;->k:La/p7m0;

    .line 61
    .line 62
    iget-object p0, p0, La/abp;->i:La/k050;

    .line 63
    .line 64
    iput-object p0, v0, La/xap;->l:La/k050;

    .line 65
    .line 66
    iput-wide p3, v0, La/xap;->i:J

    .line 67
    .line 68
    iput-wide p1, v0, La/xap;->j:J

    .line 69
    .line 70
    iput v3, v0, La/xap;->o:I

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
    check-cast v2, La/fd90;

    .line 103
    .line 104
    iget-wide v2, v2, La/fd90;->c:J

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

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/yap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/yap;

    .line 7
    .line 8
    iget v1, v0, La/yap;->o:I

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
    iput v1, v0, La/yap;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/yap;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/yap;-><init>(La/abp;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/yap;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/yap;->o:I

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
    iget-wide p1, v0, La/yap;->j:J

    .line 38
    .line 39
    iget-wide p3, v0, La/yap;->i:J

    .line 40
    .line 41
    iget-object p0, v0, La/yap;->l:La/k050;

    .line 42
    .line 43
    iget-object v0, v0, La/yap;->k:La/p7m0;

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
    iget-object p5, p0, La/abp;->f:La/p7m0;

    .line 59
    .line 60
    iput-object p5, v0, La/yap;->k:La/p7m0;

    .line 61
    .line 62
    iget-object p0, p0, La/abp;->i:La/k050;

    .line 63
    .line 64
    iput-object p0, v0, La/yap;->l:La/k050;

    .line 65
    .line 66
    iput-wide p3, v0, La/yap;->i:J

    .line 67
    .line 68
    iput-wide p1, v0, La/yap;->j:J

    .line 69
    .line 70
    iput v3, v0, La/yap;->o:I

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
    check-cast v2, La/hd90;

    .line 103
    .line 104
    iget-wide v2, v2, La/hd90;->d:J

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

.method public final h(JJLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/zap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/zap;

    .line 7
    .line 8
    iget v1, v0, La/zap;->o:I

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
    iput v1, v0, La/zap;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zap;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/zap;-><init>(La/abp;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/zap;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zap;->o:I

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
    iget-wide p1, v0, La/zap;->j:J

    .line 38
    .line 39
    iget-wide p3, v0, La/zap;->i:J

    .line 40
    .line 41
    iget-object p0, v0, La/zap;->l:La/k050;

    .line 42
    .line 43
    iget-object v0, v0, La/zap;->k:La/p7m0;

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
    iget-object p5, p0, La/abp;->g:La/p7m0;

    .line 59
    .line 60
    iput-object p5, v0, La/zap;->k:La/p7m0;

    .line 61
    .line 62
    iget-object p0, p0, La/abp;->i:La/k050;

    .line 63
    .line 64
    iput-object p0, v0, La/zap;->l:La/k050;

    .line 65
    .line 66
    iput-wide p3, v0, La/zap;->i:J

    .line 67
    .line 68
    iput-wide p1, v0, La/zap;->j:J

    .line 69
    .line 70
    iput v3, v0, La/zap;->o:I

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
    check-cast v2, La/kd90;

    .line 103
    .line 104
    iget-wide v2, v2, La/kd90;->c:J

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
