.class public final La/epi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/glq;
.implements La/zf60;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 78
    iput-byte p1, p0, La/epi0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/as20;)V
    .locals 1

    const/16 v0, 0x18

    iput-byte v0, p0, La/epi0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, La/epi0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/cad;La/j1q0;La/g1q0;La/bxi;La/xaq0;La/us00;La/vwb0;La/fjj;La/vby;)V
    .locals 0

    const/16 p1, 0x11

    iput-byte p1, p0, La/epi0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object p9, p8

    move-object p8, p3

    move-object p3, p4

    move-object p4, p2

    .line 80
    new-instance p2, La/xzp;

    invoke-direct/range {p2 .. p9}, La/xzp;-><init>(La/bxi;La/j1q0;La/xaq0;La/us00;La/vwb0;La/g1q0;La/fjj;)V

    .line 81
    iput-object p2, p0, La/epi0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/eat0;)V
    .locals 1

    const/16 v0, 0x17

    iput-byte v0, p0, La/epi0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, La/epi0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/epi0;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance p2, La/enj0;

    .line 13
    .line 14
    const/16 v0, 0xb

    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/epi0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p2, La/lkr0;

    .line 26
    .line 27
    const/16 v0, 0xe

    .line 28
    .line 29
    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, La/epi0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance p2, La/lkr0;

    .line 39
    .line 40
    const/4 v0, 0x6

    .line 41
    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, La/epi0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance p2, La/enj0;

    .line 51
    .line 52
    const/16 v0, 0x1c

    .line 53
    .line 54
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, La/epi0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance p2, La/enj0;

    .line 64
    .line 65
    const/16 v0, 0x17

    .line 66
    .line 67
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, La/epi0;->b:Ljava/lang/Object;

    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(La/w6k;)V
    .locals 2

    const/16 v0, 0x9

    iput-byte v0, p0, La/epi0;->a:B

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    new-instance v0, La/yx3;

    .line 84
    sget v1, La/wzk0;->a:F

    .line 85
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v1, v0, La/yx3;->a:F

    .line 86
    invoke-interface {p1}, La/w6k;->getDensity()F

    move-result p1

    .line 87
    sget v1, La/skq;->a:F

    const v1, 0x43c10b3d

    mul-float/2addr p1, v1

    const/high16 v1, 0x43200000    # 160.0f

    mul-float/2addr p1, v1

    const v1, 0x3f570a3d    # 0.84f

    mul-float/2addr p1, v1

    .line 88
    iput p1, v0, La/yx3;->b:F

    .line 89
    iput-object v0, p0, La/epi0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 73
    iput-byte p2, p0, La/epi0;->a:B

    iput-object p1, p0, La/epi0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FJ)F
    .locals 4

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p2, v0

    .line 5
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/yx3;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/yx3;->c(F)La/rkq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-wide v0, p0, La/rkq;->c:J

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long p1, v0, v2

    .line 18
    .line 19
    if-lez p1, :cond_0

    .line 20
    .line 21
    long-to-float p1, p2

    .line 22
    long-to-float p2, v0

    .line 23
    div-float/2addr p1, p2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    :goto_0
    invoke-static {p1}, La/gz2;->a(F)La/fz2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget p1, p1, La/fz2;->b:F

    .line 32
    .line 33
    iget p2, p0, La/rkq;->a:F

    .line 34
    .line 35
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    mul-float/2addr p2, p1

    .line 40
    iget p0, p0, La/rkq;->b:F

    .line 41
    .line 42
    mul-float/2addr p2, p0

    .line 43
    long-to-float p0, v0

    .line 44
    div-float/2addr p2, p0

    .line 45
    const/high16 p0, 0x447a0000    # 1000.0f

    .line 46
    .line 47
    mul-float/2addr p2, p0

    .line 48
    return p2
.end method

.method public b(FFJ)F
    .locals 4

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p3, v0

    .line 5
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/yx3;

    .line 8
    .line 9
    invoke-virtual {p0, p2}, La/yx3;->c(F)La/rkq;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-wide v0, p0, La/rkq;->c:J

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long p2, v0, v2

    .line 18
    .line 19
    if-lez p2, :cond_0

    .line 20
    .line 21
    long-to-float p2, p3

    .line 22
    long-to-float p3, v0

    .line 23
    div-float/2addr p2, p3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 26
    .line 27
    :goto_0
    iget p3, p0, La/rkq;->b:F

    .line 28
    .line 29
    iget p0, p0, La/rkq;->a:F

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    mul-float/2addr p0, p3

    .line 36
    invoke-static {p2}, La/gz2;->a(F)La/fz2;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget p2, p2, La/fz2;->a:F

    .line 41
    .line 42
    mul-float/2addr p0, p2

    .line 43
    add-float/2addr p0, p1

    .line 44
    return p0
.end method

.method public c()La/ibs0;
    .locals 6

    .line 1
    invoke-static {}, La/ibs0;->H()La/fbs0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/epi0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->d:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, La/fbs0;->p(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, La/epi0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 17
    .line 18
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->k:Lcom/google/firebase/perf/util/Timer;

    .line 19
    .line 20
    iget-wide v1, v1, Lcom/google/firebase/perf/util/Timer;->a:J

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, La/fbs0;->n(J)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/epi0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 28
    .line 29
    iget-object v2, v1, Lcom/google/firebase/perf/metrics/Trace;->k:Lcom/google/firebase/perf/util/Timer;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->l:Lcom/google/firebase/perf/util/Timer;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lcom/google/firebase/perf/util/Timer;->b(Lcom/google/firebase/perf/util/Timer;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-virtual {v0, v1, v2}, La/fbs0;->o(J)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, La/epi0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 43
    .line 44
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lcom/google/firebase/perf/metrics/Counter;

    .line 65
    .line 66
    iget-object v3, v2, Lcom/google/firebase/perf/metrics/Counter;->a:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v2, v2, Lcom/google/firebase/perf/metrics/Counter;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    invoke-virtual {v0, v4, v5, v3}, La/fbs0;->m(JLjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iget-object v1, p0, La/epi0;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 81
    .line 82
    iget-object v1, v1, Lcom/google/firebase/perf/metrics/Trace;->h:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_1

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_1

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lcom/google/firebase/perf/metrics/Trace;

    .line 105
    .line 106
    new-instance v3, La/epi0;

    .line 107
    .line 108
    const/16 v4, 0x15

    .line 109
    .line 110
    invoke-direct {v3, v2, v4}, La/epi0;-><init>(Ljava/lang/Object;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, La/epi0;->c()La/ibs0;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v0, v2}, La/fbs0;->j(La/ibs0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    iget-object v1, p0, La/epi0;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->getAttributes()Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0}, La/zit;->i()V

    .line 130
    .line 131
    .line 132
    iget-object v2, v0, La/zit;->b:La/kjt;

    .line 133
    .line 134
    check-cast v2, La/ibs0;

    .line 135
    .line 136
    invoke-virtual {v2}, La/ibs0;->G()La/vo20;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v2, v1}, La/vo20;->putAll(Ljava/util/Map;)V

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Lcom/google/firebase/perf/metrics/Trace;

    .line 146
    .line 147
    iget-object v1, p0, Lcom/google/firebase/perf/metrics/Trace;->g:Ljava/util/List;

    .line 148
    .line 149
    monitor-enter v1

    .line 150
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    iget-object p0, p0, Lcom/google/firebase/perf/metrics/Trace;->g:Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    :cond_2
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_3

    .line 166
    .line 167
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lcom/google/firebase/perf/session/PerfSession;

    .line 172
    .line 173
    if-eqz v3, :cond_2

    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :catchall_0
    move-exception p0

    .line 180
    goto :goto_3

    .line 181
    :cond_3
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    invoke-static {p0}, Lcom/google/firebase/perf/session/PerfSession;->b(Ljava/util/List;)[La/rd90;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    if-eqz p0, :cond_4

    .line 191
    .line 192
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {v0}, La/zit;->i()V

    .line 197
    .line 198
    .line 199
    iget-object v1, v0, La/zit;->b:La/kjt;

    .line 200
    .line 201
    check-cast v1, La/ibs0;

    .line 202
    .line 203
    invoke-virtual {v1, p0}, La/ibs0;->r(Ljava/util/List;)V

    .line 204
    .line 205
    .line 206
    :cond_4
    invoke-virtual {v0}, La/zit;->h()La/kjt;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    check-cast p0, La/ibs0;

    .line 211
    .line 212
    return-object p0

    .line 213
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 214
    throw p0
.end method

.method public d(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, La/z9p0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/z9p0;

    .line 9
    .line 10
    iget v2, v1, La/z9p0;->u:I

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
    iput v2, v1, La/z9p0;->u:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/z9p0;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/z9p0;-><init>(La/epi0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, La/z9p0;->s:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v1, La/z9p0;->u:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v9, 0x1

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v9, :cond_3

    .line 44
    .line 45
    if-eq v4, v6, :cond_2

    .line 46
    .line 47
    if-ne v4, v5, :cond_1

    .line 48
    .line 49
    iget v2, v1, La/z9p0;->r:I

    .line 50
    .line 51
    iget v4, v1, La/z9p0;->q:I

    .line 52
    .line 53
    iget v7, v1, La/z9p0;->p:I

    .line 54
    .line 55
    iget-wide v10, v1, La/z9p0;->k:J

    .line 56
    .line 57
    iget-wide v12, v1, La/z9p0;->j:J

    .line 58
    .line 59
    iget-wide v14, v1, La/z9p0;->i:J

    .line 60
    .line 61
    iget-object v8, v1, La/z9p0;->o:Ljava/lang/Throwable;

    .line 62
    .line 63
    iget-object v5, v1, La/z9p0;->n:La/z9p0;

    .line 64
    .line 65
    iget-object v6, v1, La/z9p0;->m:La/epi0;

    .line 66
    .line 67
    iget-object v9, v1, La/z9p0;->l:Ljava/lang/String;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 70
    .line 71
    .line 72
    move v0, v2

    .line 73
    move-object v2, v6

    .line 74
    move-object v6, v1

    .line 75
    move-object v1, v9

    .line 76
    move v9, v7

    .line 77
    move-object v7, v5

    .line 78
    move-object/from16 v17, v8

    .line 79
    .line 80
    move v8, v4

    .line 81
    move-wide v4, v14

    .line 82
    move-wide v13, v12

    .line 83
    move-object/from16 v12, v17

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v7

    .line 93
    :cond_2
    iget v2, v1, La/z9p0;->r:I

    .line 94
    .line 95
    iget v4, v1, La/z9p0;->q:I

    .line 96
    .line 97
    iget v5, v1, La/z9p0;->p:I

    .line 98
    .line 99
    iget-wide v6, v1, La/z9p0;->k:J

    .line 100
    .line 101
    iget-wide v8, v1, La/z9p0;->j:J

    .line 102
    .line 103
    iget-wide v10, v1, La/z9p0;->i:J

    .line 104
    .line 105
    iget-object v12, v1, La/z9p0;->o:Ljava/lang/Throwable;

    .line 106
    .line 107
    iget-object v13, v1, La/z9p0;->n:La/z9p0;

    .line 108
    .line 109
    iget-object v14, v1, La/z9p0;->m:La/epi0;

    .line 110
    .line 111
    iget-object v15, v1, La/z9p0;->l:Ljava/lang/String;

    .line 112
    .line 113
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 114
    .line 115
    .line 116
    move v0, v2

    .line 117
    move-object v2, v14

    .line 118
    move-wide/from16 v17, v6

    .line 119
    .line 120
    move-object v6, v1

    .line 121
    move-object v7, v13

    .line 122
    move-object v1, v15

    .line 123
    move-wide v13, v8

    .line 124
    move v8, v4

    .line 125
    move v9, v5

    .line 126
    move-wide v4, v10

    .line 127
    move-wide/from16 v10, v17

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    iget v2, v1, La/z9p0;->q:I

    .line 131
    .line 132
    iget v4, v1, La/z9p0;->p:I

    .line 133
    .line 134
    iget-wide v5, v1, La/z9p0;->k:J

    .line 135
    .line 136
    iget-wide v7, v1, La/z9p0;->j:J

    .line 137
    .line 138
    iget-wide v9, v1, La/z9p0;->i:J

    .line 139
    .line 140
    iget-object v11, v1, La/z9p0;->o:Ljava/lang/Throwable;

    .line 141
    .line 142
    iget-object v12, v1, La/z9p0;->n:La/z9p0;

    .line 143
    .line 144
    iget-object v13, v1, La/z9p0;->m:La/epi0;

    .line 145
    .line 146
    iget-object v14, v1, La/z9p0;->l:Ljava/lang/String;

    .line 147
    .line 148
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    .line 150
    .line 151
    move-object v15, v14

    .line 152
    move-wide/from16 v17, v7

    .line 153
    .line 154
    move v8, v2

    .line 155
    move-object v7, v13

    .line 156
    const/4 v2, 0x1

    .line 157
    move-wide/from16 v13, v17

    .line 158
    .line 159
    goto/16 :goto_2

    .line 160
    .line 161
    :catchall_0
    move-exception v0

    .line 162
    move-object/from16 v17, v13

    .line 163
    .line 164
    move-object v13, v0

    .line 165
    move-object v0, v11

    .line 166
    move-wide/from16 v18, v5

    .line 167
    .line 168
    move-object v6, v1

    .line 169
    move-object v1, v14

    .line 170
    move-wide v14, v7

    .line 171
    move-object/from16 v7, v17

    .line 172
    .line 173
    move v8, v2

    .line 174
    const/4 v2, 0x1

    .line 175
    move-wide/from16 v20, v9

    .line 176
    .line 177
    move v9, v4

    .line 178
    move-wide/from16 v10, v18

    .line 179
    .line 180
    move-wide/from16 v4, v20

    .line 181
    .line 182
    goto/16 :goto_4

    .line 183
    .line 184
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 188
    .line 189
    sget-wide v4, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 190
    .line 191
    const-wide/16 v8, 0x3

    .line 192
    .line 193
    move-object v6, v1

    .line 194
    move-wide v10, v4

    .line 195
    move-object v12, v7

    .line 196
    move-wide v13, v8

    .line 197
    const/4 v0, 0x1

    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x0

    .line 200
    move-wide/from16 v4, p1

    .line 201
    .line 202
    move-object/from16 v1, p4

    .line 203
    .line 204
    move-object v7, v6

    .line 205
    :goto_1
    if-eqz v0, :cond_e

    .line 206
    .line 207
    :try_start_4
    iget-object v15, v2, La/epi0;->b:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v15, La/pmi0;

    .line 210
    .line 211
    iput-object v1, v6, La/z9p0;->l:Ljava/lang/String;

    .line 212
    .line 213
    iput-object v2, v6, La/z9p0;->m:La/epi0;

    .line 214
    .line 215
    iput-object v7, v6, La/z9p0;->n:La/z9p0;

    .line 216
    .line 217
    iput-object v12, v6, La/z9p0;->o:Ljava/lang/Throwable;

    .line 218
    .line 219
    iput-wide v4, v6, La/z9p0;->i:J

    .line 220
    .line 221
    iput-wide v13, v6, La/z9p0;->j:J

    .line 222
    .line 223
    iput-wide v10, v6, La/z9p0;->k:J

    .line 224
    .line 225
    iput v9, v6, La/z9p0;->p:I

    .line 226
    .line 227
    iput v8, v6, La/z9p0;->q:I

    .line 228
    .line 229
    iput v0, v6, La/z9p0;->r:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 230
    .line 231
    move-object/from16 p0, v2

    .line 232
    .line 233
    const/4 v2, 0x1

    .line 234
    :try_start_5
    iput v2, v6, La/z9p0;->u:I

    .line 235
    .line 236
    invoke-virtual {v15, v4, v5, v6, v1}, La/pmi0;->c(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 240
    if-ne v0, v3, :cond_5

    .line 241
    .line 242
    goto/16 :goto_9

    .line 243
    .line 244
    :cond_5
    move-object v15, v1

    .line 245
    move-object v1, v6

    .line 246
    move-object/from16 v17, v7

    .line 247
    .line 248
    move-object/from16 v7, p0

    .line 249
    .line 250
    move-object/from16 v18, v12

    .line 251
    .line 252
    move-object/from16 v12, v17

    .line 253
    .line 254
    move-wide/from16 v19, v4

    .line 255
    .line 256
    move v4, v9

    .line 257
    move-wide v5, v10

    .line 258
    move-object/from16 v11, v18

    .line 259
    .line 260
    move-wide/from16 v9, v19

    .line 261
    .line 262
    :goto_2
    :try_start_6
    check-cast v0, La/cap0;

    .line 263
    .line 264
    invoke-static {v0, v9, v10}, La/qem0;->t(La/cap0;J)La/o9p0;

    .line 265
    .line 266
    .line 267
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 268
    :try_start_7
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 269
    .line 270
    goto/16 :goto_a

    .line 271
    .line 272
    :catchall_1
    move-exception v0

    .line 273
    move-wide/from16 v17, v13

    .line 274
    .line 275
    move-object v13, v0

    .line 276
    move-object v0, v11

    .line 277
    move-wide/from16 v19, v5

    .line 278
    .line 279
    move-object v6, v1

    .line 280
    move-object v1, v15

    .line 281
    move-wide/from16 v14, v17

    .line 282
    .line 283
    move-wide/from16 v17, v9

    .line 284
    .line 285
    move v9, v4

    .line 286
    move-wide/from16 v10, v19

    .line 287
    .line 288
    move-wide/from16 v4, v17

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :catchall_2
    move-exception v0

    .line 292
    :goto_3
    move-wide v14, v13

    .line 293
    move-object v13, v0

    .line 294
    move-object v0, v12

    .line 295
    move-object v12, v7

    .line 296
    move-object/from16 v7, p0

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :catchall_3
    move-exception v0

    .line 300
    move-object/from16 p0, v2

    .line 301
    .line 302
    const/4 v2, 0x1

    .line 303
    goto :goto_3

    .line 304
    :goto_4
    invoke-static {v13}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 305
    .line 306
    .line 307
    move-result v16

    .line 308
    if-eqz v16, :cond_a

    .line 309
    .line 310
    if-nez v9, :cond_6

    .line 311
    .line 312
    new-instance v0, La/el50;

    .line 313
    .line 314
    invoke-direct {v0, v13}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    move-object v2, v7

    .line 318
    move-object v7, v12

    .line 319
    move-wide v13, v14

    .line 320
    move-object v12, v0

    .line 321
    :goto_5
    const/4 v0, 0x0

    .line 322
    goto :goto_1

    .line 323
    :cond_6
    move-object/from16 v16, v3

    .line 324
    .line 325
    int-to-long v2, v8

    .line 326
    cmp-long v2, v2, v14

    .line 327
    .line 328
    if-gez v2, :cond_7

    .line 329
    .line 330
    const/4 v2, 0x1

    .line 331
    goto :goto_6

    .line 332
    :cond_7
    const/4 v2, 0x0

    .line 333
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 334
    .line 335
    if-eqz v2, :cond_8

    .line 336
    .line 337
    iput-object v1, v6, La/z9p0;->l:Ljava/lang/String;

    .line 338
    .line 339
    iput-object v7, v6, La/z9p0;->m:La/epi0;

    .line 340
    .line 341
    iput-object v12, v6, La/z9p0;->n:La/z9p0;

    .line 342
    .line 343
    iput-object v0, v6, La/z9p0;->o:Ljava/lang/Throwable;

    .line 344
    .line 345
    iput-wide v4, v6, La/z9p0;->i:J

    .line 346
    .line 347
    iput-wide v14, v6, La/z9p0;->j:J

    .line 348
    .line 349
    iput-wide v10, v6, La/z9p0;->k:J

    .line 350
    .line 351
    iput v9, v6, La/z9p0;->p:I

    .line 352
    .line 353
    iput v8, v6, La/z9p0;->q:I

    .line 354
    .line 355
    iput v2, v6, La/z9p0;->r:I

    .line 356
    .line 357
    const/4 v3, 0x2

    .line 358
    iput v3, v6, La/z9p0;->u:I

    .line 359
    .line 360
    invoke-static {v10, v11, v12}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    move-object/from16 v3, v16

    .line 365
    .line 366
    if-ne v13, v3, :cond_9

    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_8
    move-object/from16 v3, v16

    .line 370
    .line 371
    new-instance v0, La/el50;

    .line 372
    .line 373
    invoke-direct {v0, v13}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 374
    .line 375
    .line 376
    :cond_9
    :goto_7
    move-object v13, v12

    .line 377
    move-object v12, v0

    .line 378
    move v0, v2

    .line 379
    move-object v2, v7

    .line 380
    move-object v7, v13

    .line 381
    move-wide v13, v14

    .line 382
    goto/16 :goto_1

    .line 383
    .line 384
    :cond_a
    invoke-static {v13}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-eqz v2, :cond_d

    .line 389
    .line 390
    move-object/from16 v16, v3

    .line 391
    .line 392
    int-to-long v2, v8

    .line 393
    cmp-long v2, v2, v14

    .line 394
    .line 395
    if-gez v2, :cond_b

    .line 396
    .line 397
    const/4 v2, 0x1

    .line 398
    goto :goto_8

    .line 399
    :cond_b
    const/4 v2, 0x0

    .line 400
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 401
    .line 402
    if-eqz v2, :cond_c

    .line 403
    .line 404
    iput-object v1, v6, La/z9p0;->l:Ljava/lang/String;

    .line 405
    .line 406
    iput-object v7, v6, La/z9p0;->m:La/epi0;

    .line 407
    .line 408
    iput-object v12, v6, La/z9p0;->n:La/z9p0;

    .line 409
    .line 410
    iput-object v0, v6, La/z9p0;->o:Ljava/lang/Throwable;

    .line 411
    .line 412
    iput-wide v4, v6, La/z9p0;->i:J

    .line 413
    .line 414
    iput-wide v14, v6, La/z9p0;->j:J

    .line 415
    .line 416
    iput-wide v10, v6, La/z9p0;->k:J

    .line 417
    .line 418
    iput v9, v6, La/z9p0;->p:I

    .line 419
    .line 420
    iput v8, v6, La/z9p0;->q:I

    .line 421
    .line 422
    iput v2, v6, La/z9p0;->r:I

    .line 423
    .line 424
    const/4 v3, 0x3

    .line 425
    iput v3, v6, La/z9p0;->u:I

    .line 426
    .line 427
    invoke-static {v10, v11, v12}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v13

    .line 431
    move-object/from16 v3, v16

    .line 432
    .line 433
    if-ne v13, v3, :cond_9

    .line 434
    .line 435
    :goto_9
    return-object v3

    .line 436
    :cond_c
    move-object/from16 v3, v16

    .line 437
    .line 438
    new-instance v0, La/dag0;

    .line 439
    .line 440
    invoke-direct {v0, v13}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 441
    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_d
    invoke-static {v13}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 445
    .line 446
    .line 447
    move-object v2, v7

    .line 448
    move-object v7, v12

    .line 449
    move-object v12, v13

    .line 450
    move-wide v13, v14

    .line 451
    goto/16 :goto_5

    .line 452
    .line 453
    :cond_e
    if-nez v12, :cond_f

    .line 454
    .line 455
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 456
    .line 457
    const-string v1, "Unexpected error"

    .line 458
    .line 459
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v0

    .line 463
    :cond_f
    throw v12
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 464
    :catchall_4
    move-exception v0

    .line 465
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 466
    .line 467
    new-instance v1, La/g0g0;

    .line 468
    .line 469
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 470
    .line 471
    .line 472
    move-object v0, v1

    .line 473
    :goto_a
    sget-object v12, La/iun;->a:La/iun;

    .line 474
    .line 475
    new-instance v1, La/o9p0;

    .line 476
    .line 477
    const-string v10, ""

    .line 478
    .line 479
    const-string v11, ""

    .line 480
    .line 481
    const-wide/16 v2, 0x0

    .line 482
    .line 483
    const-string v4, ""

    .line 484
    .line 485
    const-wide/16 v5, 0x0

    .line 486
    .line 487
    const-string v7, ""

    .line 488
    .line 489
    const-string v8, ""

    .line 490
    .line 491
    const-string v9, ""

    .line 492
    .line 493
    move-object v13, v12

    .line 494
    move-object v14, v12

    .line 495
    invoke-direct/range {v1 .. v14}, La/o9p0;-><init>(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 496
    .line 497
    .line 498
    instance-of v2, v0, La/g0g0;

    .line 499
    .line 500
    if-eqz v2, :cond_10

    .line 501
    .line 502
    move-object v0, v1

    .line 503
    :cond_10
    check-cast v0, La/o9p0;

    .line 504
    .line 505
    return-object v0
.end method

.method public e(JLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/gns0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/gns0;

    .line 7
    .line 8
    iget v1, v0, La/gns0;->k:I

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
    iput v1, v0, La/gns0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gns0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/gns0;-><init>(La/epi0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/gns0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gns0;->k:I

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
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/lkr0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/dns0;

    .line 59
    .line 60
    iput v3, v0, La/gns0;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, p2, v0}, La/dns0;->a(JLa/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p3, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p3}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public f(La/trk0;)V
    .locals 12

    .line 1
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ok50;

    .line 4
    .line 5
    iget-object p0, p0, La/ok50;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gl9;

    .line 8
    .line 9
    instance-of v0, p1, La/rrk0;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    const/16 v3, 0xe

    .line 15
    .line 16
    const/16 v4, 0xd

    .line 17
    .line 18
    const/16 v5, 0xc

    .line 19
    .line 20
    const/16 v6, 0xb

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast p1, La/rrk0;

    .line 26
    .line 27
    iget-object p1, p1, La/rrk0;->a:Ljava/util/List;

    .line 28
    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_0

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    check-cast v8, Lkotlin/Pair;

    .line 49
    .line 50
    new-instance v9, Ljava/util/Date;

    .line 51
    .line 52
    iget-object v10, v8, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v10, La/tlq0;

    .line 55
    .line 56
    iget-wide v10, v10, La/tlq0;->a:J

    .line 57
    .line 58
    invoke-virtual {v2, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v10

    .line 62
    invoke-direct {v9, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-static {v10}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-virtual {v10, v9}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v10, v6, v7}, Ljava/util/Calendar;->set(II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10, v5, v7}, Ljava/util/Calendar;->set(II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v10, v4, v7}, Ljava/util/Calendar;->set(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v10, v3, v7}, Ljava/util/Calendar;->set(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v10}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v8, v8, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v8, La/iel0;

    .line 98
    .line 99
    iget-wide v10, v8, La/iel0;->a:J

    .line 100
    .line 101
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    new-instance v10, Lkotlin/Pair;

    .line 106
    .line 107
    invoke-direct {v10, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v10, v7, v1}, La/gl9;->b(Ljava/util/HashMap;Lkotlin/Pair;ZZ)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    iget-object v8, p0, La/gl9;->a:La/p7m0;

    .line 115
    .line 116
    :cond_1
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    move-object p1, p0

    .line 121
    check-cast p1, Ljava/util/HashMap;

    .line 122
    .line 123
    new-instance p1, Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v8, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_1

    .line 136
    .line 137
    goto/16 :goto_3

    .line 138
    .line 139
    :cond_2
    instance-of v0, p1, La/qrk0;

    .line 140
    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    check-cast p1, La/qrk0;

    .line 144
    .line 145
    iget-object p1, p1, La/qrk0;->a:Ljava/util/List;

    .line 146
    .line 147
    new-instance v0, Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_3

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lkotlin/Pair;

    .line 167
    .line 168
    new-instance v2, Ljava/util/Date;

    .line 169
    .line 170
    iget-object v8, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v8, La/tlq0;

    .line 173
    .line 174
    iget-wide v8, v8, La/tlq0;->a:J

    .line 175
    .line 176
    invoke-direct {v2, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 177
    .line 178
    .line 179
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-static {v8}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-virtual {v8, v2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v8, v6, v7}, Ljava/util/Calendar;->set(II)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8, v5, v7}, Ljava/util/Calendar;->set(II)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8, v4, v7}, Ljava/util/Calendar;->set(II)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8, v3, v7}, Ljava/util/Calendar;->set(II)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget-object v1, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, La/iel0;

    .line 212
    .line 213
    iget-wide v8, v1, La/iel0;->a:J

    .line 214
    .line 215
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    new-instance v8, Lkotlin/Pair;

    .line 220
    .line 221
    invoke-direct {v8, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v8, v7, v7}, La/gl9;->b(Ljava/util/HashMap;Lkotlin/Pair;ZZ)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_3
    iget-object v8, p0, La/gl9;->c:La/p7m0;

    .line 229
    .line 230
    :cond_4
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    move-object p1, p0

    .line 235
    check-cast p1, Ljava/util/HashMap;

    .line 236
    .line 237
    new-instance p1, Ljava/util/HashMap;

    .line 238
    .line 239
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v8, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p0

    .line 249
    if-eqz p0, :cond_4

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_5
    instance-of v0, p1, La/srk0;

    .line 253
    .line 254
    if-eqz v0, :cond_8

    .line 255
    .line 256
    check-cast p1, La/srk0;

    .line 257
    .line 258
    iget-object p1, p1, La/srk0;->a:Ljava/util/List;

    .line 259
    .line 260
    new-instance v0, Ljava/util/HashMap;

    .line 261
    .line 262
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    if-eqz v8, :cond_6

    .line 274
    .line 275
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    check-cast v8, Lkotlin/Pair;

    .line 280
    .line 281
    new-instance v9, Ljava/util/Date;

    .line 282
    .line 283
    iget-object v10, v8, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v10, La/tlq0;

    .line 286
    .line 287
    iget-wide v10, v10, La/tlq0;->a:J

    .line 288
    .line 289
    invoke-virtual {v2, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 290
    .line 291
    .line 292
    move-result-wide v10

    .line 293
    invoke-direct {v9, v10, v11}, Ljava/util/Date;-><init>(J)V

    .line 294
    .line 295
    .line 296
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    invoke-static {v10}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-virtual {v10, v9}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v10, v6, v7}, Ljava/util/Calendar;->set(II)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v10, v5, v7}, Ljava/util/Calendar;->set(II)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v10, v4, v7}, Ljava/util/Calendar;->set(II)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v10, v3, v7}, Ljava/util/Calendar;->set(II)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v10}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    iget-object v8, v8, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v8, La/iel0;

    .line 329
    .line 330
    iget-wide v10, v8, La/iel0;->a:J

    .line 331
    .line 332
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    new-instance v10, Lkotlin/Pair;

    .line 337
    .line 338
    invoke-direct {v10, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v0, v10, v1, v7}, La/gl9;->b(Ljava/util/HashMap;Lkotlin/Pair;ZZ)V

    .line 342
    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_6
    iget-object p0, p0, La/gl9;->b:La/p7m0;

    .line 346
    .line 347
    :cond_7
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    move-object v1, p1

    .line 352
    check-cast v1, Ljava/util/HashMap;

    .line 353
    .line 354
    new-instance v1, Ljava/util/HashMap;

    .line 355
    .line 356
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_7

    .line 367
    .line 368
    :goto_3
    return-void

    .line 369
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 370
    .line 371
    .line 372
    return-void
.end method

.method public g()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public h(F)J
    .locals 4

    .line 1
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yx3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/yx3;->d(F)D

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    sget v0, La/skq;->a:F

    .line 10
    .line 11
    float-to-double v0, v0

    .line 12
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 13
    .line 14
    sub-double/2addr v0, v2

    .line 15
    div-double/2addr p0, v0

    .line 16
    invoke-static {p0, p1}, Ljava/lang/Math;->exp(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    mul-double/2addr p0, v0

    .line 26
    double-to-long p0, p0

    .line 27
    const-wide/32 v0, 0xf4240

    .line 28
    .line 29
    .line 30
    mul-long/2addr p0, v0

    .line 31
    return-wide p0
.end method

.method public i(FF)F
    .locals 8

    .line 1
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yx3;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, La/yx3;->d(F)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget v2, La/skq;->a:F

    .line 10
    .line 11
    float-to-double v2, v2

    .line 12
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 13
    .line 14
    sub-double v4, v2, v4

    .line 15
    .line 16
    iget v6, p0, La/yx3;->a:F

    .line 17
    .line 18
    iget p0, p0, La/yx3;->b:F

    .line 19
    .line 20
    mul-float/2addr v6, p0

    .line 21
    float-to-double v6, v6

    .line 22
    div-double/2addr v2, v4

    .line 23
    mul-double/2addr v2, v0

    .line 24
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    mul-double/2addr v0, v6

    .line 29
    double-to-float p0, v0

    .line 30
    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    mul-float/2addr p2, p0

    .line 35
    add-float/2addr p2, p1

    .line 36
    return p2
.end method

.method public j(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/dpi0;

    .line 4
    .line 5
    iget-object p0, p0, La/dpi0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/zoq0;

    .line 8
    .line 9
    iput-boolean p1, p0, La/zoq0;->a:Z

    .line 10
    .line 11
    return-void
.end method

.method public k(Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1d

    .line 9
    .line 10
    if-lt p1, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0, p2}, La/epi0;->m(Ljava/io/FileInputStream;Ljava/lang/String;)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {p0, v0, p2}, La/epi0;->n(Ljava/io/FileInputStream;Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :goto_0
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :goto_1
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :catchall_1
    move-exception p1

    .line 29
    invoke-static {v0, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 9

    .line 1
    iget-byte v0, p0, La/epi0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p1, p2, La/xiv0;->a:La/uiv0;

    .line 12
    .line 13
    invoke-virtual {p1, v2}, La/uiv0;->i(I)La/pfx;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget p2, p2, La/pfx;->b:I

    .line 18
    .line 19
    invoke-virtual {p1, v1}, La/uiv0;->i(I)La/pfx;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget p1, p1, La/pfx;->d:I

    .line 24
    .line 25
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/ypn0;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 42
    .line 43
    .line 44
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    iget-object p1, p2, La/xiv0;->a:La/uiv0;

    .line 48
    .line 49
    const/16 v0, 0x8

    .line 50
    .line 51
    invoke-virtual {p1, v0}, La/uiv0;->i(I)La/pfx;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget v3, v3, La/pfx;->d:I

    .line 56
    .line 57
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/syl0;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    if-lez v3, :cond_0

    .line 63
    .line 64
    move v5, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v5, v4

    .line 67
    :goto_0
    iput-boolean v5, p0, La/syl0;->R1:Z

    .line 68
    .line 69
    invoke-virtual {p1, v2}, La/uiv0;->i(I)La/pfx;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    iget v5, v5, La/pfx;->b:I

    .line 74
    .line 75
    iput v5, p0, La/syl0;->S1:I

    .line 76
    .line 77
    invoke-virtual {p1, v1}, La/uiv0;->i(I)La/pfx;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget p1, p1, La/pfx;->d:I

    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const v5, 0x7f070074

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    sub-int/2addr v3, p1

    .line 95
    sub-int/2addr v3, v1

    .line 96
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-lez p1, :cond_1

    .line 101
    .line 102
    move v1, v2

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move v1, v4

    .line 105
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const v5, 0x7f07070c

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    const v6, 0x7f070718

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v1, :cond_2

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    move v5, v4

    .line 131
    :goto_2
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    iget-object v6, v6, La/c5r;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 136
    .line 137
    add-int/2addr v3, p1

    .line 138
    add-int/2addr v3, v5

    .line 139
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    invoke-virtual {v6}, Landroid/view/View;->getPaddingRight()I

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    invoke-virtual {v6, v5, v7, v8, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 152
    .line 153
    .line 154
    iget-object v3, p0, La/syl0;->Z1:La/jk3;

    .line 155
    .line 156
    if-eqz v3, :cond_4

    .line 157
    .line 158
    iget-object v3, v3, La/jk3;->e:Landroid/view/View;

    .line 159
    .line 160
    check-cast v3, Landroid/widget/FrameLayout;

    .line 161
    .line 162
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-nez v3, :cond_3

    .line 167
    .line 168
    move v3, v2

    .line 169
    goto :goto_3

    .line 170
    :cond_3
    move v3, v4

    .line 171
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    goto :goto_4

    .line 176
    :cond_4
    const/4 v3, 0x0

    .line 177
    :goto_4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    const v6, 0x7f07072d

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    iget-object v6, p0, La/syl0;->Z1:La/jk3;

    .line 189
    .line 190
    if-eqz v6, :cond_6

    .line 191
    .line 192
    iget-object v6, v6, La/jk3;->e:Landroid/view/View;

    .line 193
    .line 194
    check-cast v6, Landroid/widget/FrameLayout;

    .line 195
    .line 196
    if-eqz v1, :cond_5

    .line 197
    .line 198
    move v0, v4

    .line 199
    :cond_5
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 200
    .line 201
    .line 202
    :cond_6
    iget-object v0, p0, La/syl0;->Z1:La/jk3;

    .line 203
    .line 204
    if-eqz v0, :cond_7

    .line 205
    .line 206
    iget-object v0, v0, La/jk3;->e:Landroid/view/View;

    .line 207
    .line 208
    check-cast v0, Landroid/widget/FrameLayout;

    .line 209
    .line 210
    add-int/2addr p1, v5

    .line 211
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    invoke-virtual {v0, v4, v5, v6, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 224
    .line 225
    .line 226
    :cond_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-nez p1, :cond_8

    .line 235
    .line 236
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    new-instance v0, La/vzl0;

    .line 241
    .line 242
    invoke-direct {v0, v1}, La/vzl0;-><init>(Z)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_8
    if-nez v1, :cond_a

    .line 249
    .line 250
    iget-object p1, p0, La/syl0;->W1:La/zfb;

    .line 251
    .line 252
    if-eqz p1, :cond_a

    .line 253
    .line 254
    iget-object p1, p1, La/zfb;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 255
    .line 256
    if-nez p1, :cond_9

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_9
    new-instance v0, La/w23;

    .line 260
    .line 261
    const/4 v1, 0x5

    .line 262
    invoke-direct {v0, p1, v1}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 266
    .line 267
    .line 268
    :cond_a
    :goto_5
    iget-boolean p1, p0, La/syl0;->U1:Z

    .line 269
    .line 270
    if-nez p1, :cond_b

    .line 271
    .line 272
    iget-boolean p1, p0, La/syl0;->R1:Z

    .line 273
    .line 274
    invoke-virtual {p0, p1}, La/syl0;->N0(Z)V

    .line 275
    .line 276
    .line 277
    iput-boolean v2, p0, La/syl0;->U1:Z

    .line 278
    .line 279
    :cond_b
    return-object p2

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public m(Ljava/io/FileInputStream;Ljava/lang/String;)Landroid/net/Uri;
    .locals 4

    .line 1
    iget-object v0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/us00;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Landroid/content/ContentValues;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "_display_name"

    .line 15
    .line 16
    invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "mime_type"

    .line 20
    .line 21
    const-string v3, "image/*"

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "relative_path"

    .line 27
    .line 28
    sget-object v3, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-string v3, "is_pending"

    .line 39
    .line 40
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, La/xl50;->g()Landroid/net/Uri;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x0

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    :try_start_0
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 55
    .line 56
    invoke-virtual {p0, p1, v1}, La/epi0;->o(Ljava/io/FileInputStream;Landroid/net/Uri;)V

    .line 57
    .line 58
    .line 59
    new-instance p0, Landroid/content/ContentValues;

    .line 60
    .line 61
    invoke-direct {p0}, Landroid/content/ContentValues;-><init>()V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p0, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1, p0, v2, v2}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    move-object p1, v1

    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 79
    .line 80
    new-instance p1, La/g0g0;

    .line 81
    .line 82
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_0

    .line 90
    .line 91
    :try_start_1
    invoke-virtual {v0, v1, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_1
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 96
    .line 97
    :cond_0
    :goto_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    check-cast p1, Landroid/net/Uri;

    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_1
    const-string p0, "Failed to create MediaStore entry for "

    .line 104
    .line 105
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, La/ohq;->l(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v2
.end method

.method public n(Ljava/io/FileInputStream;Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/io/File;

    .line 11
    .line 12
    invoke-direct {v1, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, La/epi0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, La/us00;

    .line 18
    .line 19
    const-string v0, "org.xbet.client1.provider"

    .line 20
    .line 21
    invoke-static {p2, v1, v0}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/epi0;->o(Ljava/io/FileInputStream;Landroid/net/Uri;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 36
    .line 37
    new-instance p2, La/g0g0;

    .line 38
    .line 39
    invoke-direct {p2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-static {p2}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    check-cast p2, Landroid/net/Uri;

    .line 55
    .line 56
    return-object p2
.end method

.method public o(Ljava/io/FileInputStream;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/us00;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/16 p2, 0x2000

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1, p0, p2}, La/wha0;->J(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    :catchall_1
    move-exception p2

    .line 27
    invoke-static {p0, p1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p2

    .line 31
    :cond_0
    const-string p0, "Failed to open output stream for "

    .line 32
    .line 33
    invoke-static {p2, p0}, La/itt0;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
