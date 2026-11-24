.class public final La/s1p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nmo;

.field public final b:La/ort;

.field public final c:La/iqt;

.field public final d:La/cmt;

.field public final e:La/reu;

.field public final f:La/ctf0;

.field public final g:La/viu;

.field public final h:La/sje;

.field public final i:La/qoj0;

.field public final j:Ljava/util/ArrayList;

.field public final k:La/p7m0;

.field public l:La/bby;


# direct methods
.method public constructor <init>(La/nmo;La/ort;La/iqt;La/cmt;La/reu;La/ctf0;La/viu;La/tqt;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/s1p;->a:La/nmo;

    .line 8
    .line 9
    iput-object p2, p0, La/s1p;->b:La/ort;

    .line 10
    .line 11
    iput-object p3, p0, La/s1p;->c:La/iqt;

    .line 12
    .line 13
    iput-object p4, p0, La/s1p;->d:La/cmt;

    .line 14
    .line 15
    iput-object p5, p0, La/s1p;->e:La/reu;

    .line 16
    .line 17
    iput-object p6, p0, La/s1p;->f:La/ctf0;

    .line 18
    .line 19
    iput-object p7, p0, La/s1p;->g:La/viu;

    .line 20
    .line 21
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p2, p9, La/mne;->b:La/dvj;

    .line 26
    .line 27
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, La/rne;

    .line 32
    .line 33
    const-string p3, "FATMAN_LOGGER_SCOPE"

    .line 34
    .line 35
    invoke-direct {p2, p3}, La/rne;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, p2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/s1p;->h:La/sje;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    const/4 p3, 0x7

    .line 50
    const/4 p4, 0x0

    .line 51
    invoke-static {p2, p2, p4, p3}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iput-object p2, p0, La/s1p;->i:La/qoj0;

    .line 56
    .line 57
    new-instance p3, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p3, p0, La/s1p;->j:Ljava/util/ArrayList;

    .line 63
    .line 64
    const-wide/16 p5, 0x0

    .line 65
    .line 66
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    iput-object p3, p0, La/s1p;->k:La/p7m0;

    .line 75
    .line 76
    new-instance p3, La/sxk;

    .line 77
    .line 78
    const/16 p5, 0xb

    .line 79
    .line 80
    invoke-direct {p3, p0, p4, p5}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 81
    .line 82
    .line 83
    new-instance p0, La/fnq;

    .line 84
    .line 85
    const/4 p4, 0x4

    .line 86
    invoke-direct {p0, p2, p3, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 90
    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;J)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ir;

    .line 5
    .line 6
    const/4 v5, 0x0

    .line 7
    const/16 v6, 0x9

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    move-object v4, p1

    .line 11
    move-wide v2, p2

    .line 12
    invoke-direct/range {v0 .. v6}, La/ir;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x3

    .line 16
    iget-object p1, v1, La/s1p;->h:La/sje;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-static {p1, p2, p2, v0, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final b(JLa/zje;Ljava/util/Set;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, La/n1p;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/n1p;

    .line 9
    .line 10
    iget v2, v1, La/n1p;->k:I

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
    iput v2, v1, La/n1p;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/n1p;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/n1p;-><init>(La/s1p;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, La/n1p;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/n1p;->k:I

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
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch La/gmq0; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

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
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 53
    .line 54
    iget-object v3, p0, La/s1p;->g:La/viu;

    .line 55
    .line 56
    invoke-virtual {v3}, La/viu;->a()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v11

    .line 64
    iget-object v3, p0, La/s1p;->j:Ljava/util/ArrayList;

    .line 65
    .line 66
    monitor-enter v3

    .line 67
    :try_start_1
    iget-object v0, p0, La/s1p;->j:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v7, La/l1p;

    .line 73
    .line 74
    move-wide v9, p1

    .line 75
    move-object/from16 v8, p4

    .line 76
    .line 77
    invoke-direct/range {v7 .. v12}, La/l1p;-><init>(Ljava/util/Set;JJ)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, La/s1p;->k:La/p7m0;

    .line 84
    .line 85
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    monitor-exit v3

    .line 96
    iget-object v0, p0, La/s1p;->l:La/bby;

    .line 97
    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-ne v0, v4, :cond_3

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    invoke-virtual {p0}, La/s1p;->d()V

    .line 108
    .line 109
    .line 110
    :goto_1
    :try_start_2
    sget-object v0, La/wen;->b:La/uen;

    .line 111
    .line 112
    sget-object v0, La/bfn;->d:La/bfn;

    .line 113
    .line 114
    const-wide/16 v5, 0x1388

    .line 115
    .line 116
    invoke-static {v5, v6, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v11

    .line 120
    new-instance v5, La/ey;

    .line 121
    .line 122
    const/16 v10, 0x10

    .line 123
    .line 124
    const/4 v9, 0x0

    .line 125
    move-object v6, p0

    .line 126
    invoke-direct/range {v5 .. v10}, La/ey;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 127
    .line 128
    .line 129
    iput v4, v1, La/n1p;->k:I

    .line 130
    .line 131
    invoke-static {v11, v12}, La/qcc;->g0(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    invoke-static {v3, v4, v5, v1}, La/msm0;->t(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0
    :try_end_2
    .catch La/gmq0; {:try_start_2 .. :try_end_2} :catch_0

    .line 139
    if-ne p0, v2, :cond_4

    .line 140
    .line 141
    return-object v2

    .line 142
    :catch_0
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :catchall_0
    move-exception v0

    .line 146
    move-object p0, v0

    .line 147
    monitor-exit v3

    .line 148
    throw p0
.end method

.method public final c(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/p1p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/p1p;

    .line 7
    .line 8
    iget v1, v0, La/p1p;->o:I

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
    iput v1, v0, La/p1p;->o:I

    .line 18
    .line 19
    :goto_0
    move-object v10, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/p1p;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/p1p;-><init>(La/s1p;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v10, La/p1p;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v10, La/p1p;->o:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x3

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    if-eq v1, v5, :cond_3

    .line 40
    .line 41
    if-eq v1, v4, :cond_2

    .line 42
    .line 43
    if-ne v1, v3, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_8

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_2
    iget-boolean p1, v10, La/p1p;->l:Z

    .line 57
    .line 58
    iget-wide v4, v10, La/p1p;->k:J

    .line 59
    .line 60
    iget-object v1, v10, La/p1p;->j:La/nmo;

    .line 61
    .line 62
    iget-object v6, v10, La/p1p;->i:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v9, v6

    .line 68
    move-wide v11, v4

    .line 69
    move v4, p1

    .line 70
    :goto_2
    move-object p1, v2

    .line 71
    move v5, v3

    .line 72
    move-wide v2, v11

    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_3
    iget-wide v5, v10, La/p1p;->k:J

    .line 76
    .line 77
    iget-object p1, v10, La/p1p;->j:La/nmo;

    .line 78
    .line 79
    iget-object v1, v10, La/p1p;->i:Ljava/util/List;

    .line 80
    .line 81
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object v11, v1

    .line 85
    move-object v1, p1

    .line 86
    move-object p1, v11

    .line 87
    goto :goto_4

    .line 88
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p2, p0, La/s1p;->c:La/iqt;

    .line 92
    .line 93
    iget-object p2, p2, La/iqt;->a:La/gst0;

    .line 94
    .line 95
    invoke-virtual {p2}, La/gst0;->a()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_5

    .line 100
    .line 101
    iget-object p2, p0, La/s1p;->b:La/ort;

    .line 102
    .line 103
    invoke-virtual {p2}, La/ort;->b()J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    const-wide/16 v6, 0x0

    .line 109
    .line 110
    :goto_3
    iput-object p1, v10, La/p1p;->i:Ljava/util/List;

    .line 111
    .line 112
    iget-object p2, p0, La/s1p;->a:La/nmo;

    .line 113
    .line 114
    iput-object p2, v10, La/p1p;->j:La/nmo;

    .line 115
    .line 116
    iput-wide v6, v10, La/p1p;->k:J

    .line 117
    .line 118
    iput v5, v10, La/p1p;->o:I

    .line 119
    .line 120
    invoke-virtual {p0, v10}, La/s1p;->e(La/zje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-ne v1, v0, :cond_6

    .line 125
    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :cond_6
    move-object v5, v1

    .line 129
    move-object v1, p2

    .line 130
    move-object p2, v5

    .line 131
    move-wide v5, v6

    .line 132
    :goto_4
    check-cast p2, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    iput-object p1, v10, La/p1p;->i:Ljava/util/List;

    .line 139
    .line 140
    iput-object v1, v10, La/p1p;->j:La/nmo;

    .line 141
    .line 142
    iput-wide v5, v10, La/p1p;->k:J

    .line 143
    .line 144
    iput-boolean p2, v10, La/p1p;->l:Z

    .line 145
    .line 146
    iput v4, v10, La/p1p;->o:I

    .line 147
    .line 148
    iget-object v4, p0, La/s1p;->d:La/cmt;

    .line 149
    .line 150
    iget-object v4, v4, La/cmt;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v4, La/peg0;

    .line 153
    .line 154
    iget-object v4, v4, La/peg0;->b:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v4, La/vf3;

    .line 157
    .line 158
    iget-object v4, v4, La/vf3;->a:La/q7d0;

    .line 159
    .line 160
    const-wide/16 v7, 0x1

    .line 161
    .line 162
    invoke-virtual {v4}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    const-string v9, "CURRENT_APP_SESSION_NUMBER"

    .line 167
    .line 168
    invoke-interface {v4, v9, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 169
    .line 170
    .line 171
    move-result-wide v7

    .line 172
    new-instance v4, Ljava/lang/Long;

    .line 173
    .line 174
    invoke-direct {v4, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 175
    .line 176
    .line 177
    if-ne v4, v0, :cond_7

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_7
    move-object v9, v4

    .line 181
    move v4, p2

    .line 182
    move-object p2, v9

    .line 183
    move-object v9, p1

    .line 184
    move-wide v11, v5

    .line 185
    goto :goto_2

    .line 186
    :goto_5
    check-cast p2, Ljava/lang/Number;

    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide v7

    .line 192
    iget-object p0, p0, La/s1p;->f:La/ctf0;

    .line 193
    .line 194
    iget-object p2, p0, La/ctf0;->e:La/ihk;

    .line 195
    .line 196
    iget-object p2, p2, La/ihk;->a:La/us00;

    .line 197
    .line 198
    invoke-virtual {p2}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 207
    .line 208
    iget-object p0, p0, La/ctf0;->e:La/ihk;

    .line 209
    .line 210
    iget-object p0, p0, La/ihk;->a:La/us00;

    .line 211
    .line 212
    invoke-virtual {p0}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    iget v6, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 221
    .line 222
    iput-object p1, v10, La/p1p;->i:Ljava/util/List;

    .line 223
    .line 224
    iput-object p1, v10, La/p1p;->j:La/nmo;

    .line 225
    .line 226
    iput v5, v10, La/p1p;->o:I

    .line 227
    .line 228
    iget-object p0, v1, La/nmo;->a:Ljava/lang/Object;

    .line 229
    .line 230
    move-object v1, p0

    .line 231
    check-cast v1, La/xzp;

    .line 232
    .line 233
    move v5, p2

    .line 234
    invoke-virtual/range {v1 .. v10}, La/xzp;->X(JZIIJLjava/util/List;La/zje;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    if-ne p0, v0, :cond_8

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    :goto_6
    if-ne p0, v0, :cond_9

    .line 244
    .line 245
    :goto_7
    return-object v0

    .line 246
    :cond_9
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object p0
.end method

.method public final d()V
    .locals 14

    .line 1
    const-class v0, La/s1p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    sget-object v11, La/q1p;->a:La/q1p;

    .line 8
    .line 9
    new-instance v12, La/hij;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/16 v1, 0x12

    .line 13
    .line 14
    invoke-direct {v12, p0, v0, v1}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    const/16 v13, 0x78

    .line 18
    .line 19
    iget-object v1, p0, La/s1p;->h:La/sje;

    .line 20
    .line 21
    const-wide/16 v3, 0x3

    .line 22
    .line 23
    const-wide/16 v5, 0x3

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    invoke-static/range {v1 .. v13}, La/sac;->d0(La/vne;Ljava/lang/String;JJLkotlin/coroutines/CoroutineContext;JLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/s1p;->l:La/bby;

    .line 34
    .line 35
    return-void
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/r1p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/r1p;

    .line 7
    .line 8
    iget v1, v0, La/r1p;->k:I

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
    iput v1, v0, La/r1p;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/r1p;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/r1p;-><init>(La/s1p;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/r1p;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/r1p;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/s1p;->c:La/iqt;

    .line 51
    .line 52
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 53
    .line 54
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    iput v3, v0, La/r1p;->k:I

    .line 62
    .line 63
    iget-object p0, p0, La/s1p;->e:La/reu;

    .line 64
    .line 65
    iget-object p0, p0, La/reu;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, La/b3c0;

    .line 68
    .line 69
    invoke-virtual {p0, v2, v0}, La/b3c0;->a(ZLa/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    check-cast p1, La/m2c0;

    .line 77
    .line 78
    iget-boolean v2, p1, La/m2c0;->m0:Z

    .line 79
    .line 80
    :cond_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method
