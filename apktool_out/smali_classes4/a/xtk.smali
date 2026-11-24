.class public final La/xtk;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;

.field public final c:La/hzg;

.field public final d:La/ih5;

.field public final e:La/es;

.field public final f:La/s31;

.field public final g:La/cyu;

.field public final h:La/zr1;

.field public final i:La/duj;

.field public final j:La/g2v;

.field public final k:La/mne;

.field public final l:La/p7m0;

.field public m:La/da10;

.field public n:Ljava/util/List;

.field public final o:La/c4m0;

.field public p:La/bby;

.field public q:La/bby;

.field public r:Z

.field public s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;La/hzg;La/ih5;La/es;La/s31;La/cyu;La/zr1;La/duj;La/g2v;La/m1e;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xtk;->b:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;

    .line 8
    .line 9
    iput-object p2, p0, La/xtk;->c:La/hzg;

    .line 10
    .line 11
    iput-object p3, p0, La/xtk;->d:La/ih5;

    .line 12
    .line 13
    iput-object p4, p0, La/xtk;->e:La/es;

    .line 14
    .line 15
    iput-object p5, p0, La/xtk;->f:La/s31;

    .line 16
    .line 17
    iput-object p6, p0, La/xtk;->g:La/cyu;

    .line 18
    .line 19
    iput-object p7, p0, La/xtk;->h:La/zr1;

    .line 20
    .line 21
    iput-object p8, p0, La/xtk;->i:La/duj;

    .line 22
    .line 23
    iput-object p9, p0, La/xtk;->j:La/g2v;

    .line 24
    .line 25
    iput-object p11, p0, La/xtk;->k:La/mne;

    .line 26
    .line 27
    sget-object p1, La/utk;->a:La/utk;

    .line 28
    .line 29
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, La/xtk;->l:La/p7m0;

    .line 34
    .line 35
    sget-object p1, La/da10;->b:La/da10;

    .line 36
    .line 37
    iput-object p1, p0, La/xtk;->m:La/da10;

    .line 38
    .line 39
    sget-object p1, La/iun;->a:La/iun;

    .line 40
    .line 41
    iput-object p1, p0, La/xtk;->n:Ljava/util/List;

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, La/xtk;->r:Z

    .line 45
    .line 46
    const-string p2, ""

    .line 47
    .line 48
    iput-object p2, p0, La/xtk;->s:Ljava/lang/String;

    .line 49
    .line 50
    iget-object p2, p0, La/xtk;->o:La/c4m0;

    .line 51
    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    invoke-virtual {p2}, La/pby;->isActive()Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-ne p2, p1, :cond_0

    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    invoke-interface {p10}, La/m1e;->b()La/gmq;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance p2, La/hij;

    .line 66
    .line 67
    const/4 p3, 0x0

    .line 68
    const/4 p4, 0x5

    .line 69
    invoke-direct {p2, p0, p3, p4}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 70
    .line 71
    .line 72
    new-instance p3, La/fnq;

    .line 73
    .line 74
    const/4 p4, 0x4

    .line 75
    invoke-direct {p3, p1, p2, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object p2, p11, La/mne;->a:La/rwj;

    .line 83
    .line 84
    invoke-static {p1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p3, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, La/xtk;->o:La/c4m0;

    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 8

    .line 1
    iget-object v0, p0, La/xtk;->p:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v0, p0, La/xtk;->k:La/mne;

    .line 14
    .line 15
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 16
    .line 17
    new-instance v3, La/e3j;

    .line 18
    .line 19
    const/16 v0, 0x10

    .line 20
    .line 21
    invoke-direct {v3, p0, v0}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance v6, La/b1f;

    .line 25
    .line 26
    const/16 v0, 0x1b

    .line 27
    .line 28
    invoke-direct {v6, p0, v1, v0}, La/b1f;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    const/16 v7, 0xa

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/xtk;->p:La/bby;

    .line 39
    .line 40
    return-void
.end method

.method public final x()V
    .locals 11

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    sget-object v2, La/pb10;->v:La/pb10;

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    const/4 v9, 0x0

    .line 10
    const/16 v10, 0x15e

    .line 11
    .line 12
    iget-object v3, p0, La/xtk;->j:La/g2v;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const v7, 0x7f130677

    .line 17
    .line 18
    .line 19
    const v8, 0x7f131690

    .line 20
    .line 21
    .line 22
    invoke-static/range {v3 .. v10}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    iget-object v1, p0, La/xtk;->l:La/p7m0;

    .line 27
    .line 28
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v3, v2

    .line 33
    check-cast v3, La/vtk;

    .line 34
    .line 35
    new-instance v3, La/stk;

    .line 36
    .line 37
    iget-object v4, p0, La/xtk;->m:La/da10;

    .line 38
    .line 39
    iget-short v4, v4, La/da10;->a:S

    .line 40
    .line 41
    int-to-long v4, v4

    .line 42
    invoke-direct {v3, v0, v4, v5}, La/stk;-><init>(La/jkm;J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iget-object p0, p0, La/xtk;->p:La/bby;

    .line 52
    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-interface {p0, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final y(La/da10;)V
    .locals 3

    .line 1
    iput-object p1, p0, La/xtk;->m:La/da10;

    .line 2
    .line 3
    iget-object p1, p0, La/xtk;->l:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, La/stk;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/stk;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, La/xtk;->m:La/da10;

    .line 20
    .line 21
    iget-short p0, p0, La/da10;->a:S

    .line 22
    .line 23
    int-to-long v1, p0

    .line 24
    iget-object p0, v0, La/stk;->a:La/jkm;

    .line 25
    .line 26
    new-instance v0, La/stk;

    .line 27
    .line 28
    invoke-direct {v0, p0, v1, v2}, La/stk;-><init>(La/jkm;J)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    move-object v1, p0

    .line 36
    check-cast v1, La/vtk;

    .line 37
    .line 38
    invoke-virtual {p1, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public final z()V
    .locals 13

    .line 1
    iget-object v0, p0, La/xtk;->n:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v4, v2

    .line 24
    check-cast v4, La/ypl0;

    .line 25
    .line 26
    iget-object v4, v4, La/ypl0;->b:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 29
    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v5, p0, La/xtk;->s:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4, v5, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object v2, p0, La/xtk;->l:La/p7m0;

    .line 54
    .line 55
    if-eqz v0, :cond_5

    .line 56
    .line 57
    iget-object v0, p0, La/xtk;->s:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    const-wide/16 v0, -0x1

    .line 66
    .line 67
    sget-object v3, La/pb10;->v:La/pb10;

    .line 68
    .line 69
    invoke-static {v0, v1, v3}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :goto_1
    move-object v4, v0

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    sget-object v0, La/pb10;->v:La/pb10;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :goto_2
    iget-object v0, p0, La/xtk;->s:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_3

    .line 85
    .line 86
    const v0, 0x7f1305c0

    .line 87
    .line 88
    .line 89
    :goto_3
    move v7, v0

    .line 90
    goto :goto_4

    .line 91
    :cond_3
    const v0, 0x7f130e37

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :goto_4
    const/4 v9, 0x0

    .line 96
    const/16 v10, 0x1de

    .line 97
    .line 98
    iget-object v3, p0, La/xtk;->j:La/g2v;

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v8, 0x0

    .line 103
    invoke-static/range {v3 .. v10}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :cond_4
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move-object v1, v0

    .line 112
    check-cast v1, La/vtk;

    .line 113
    .line 114
    new-instance v1, La/rtk;

    .line 115
    .line 116
    invoke-direct {v1, p0}, La/rtk;-><init>(La/jkm;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    move-object v0, p0

    .line 131
    check-cast v0, La/vtk;

    .line 132
    .line 133
    new-instance v0, Ljava/util/ArrayList;

    .line 134
    .line 135
    const/16 v4, 0xa

    .line 136
    .line 137
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    move v6, v3

    .line 149
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_7

    .line 154
    .line 155
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    add-int/lit8 v11, v6, 0x1

    .line 160
    .line 161
    if-ltz v6, :cond_6

    .line 162
    .line 163
    check-cast v5, La/ypl0;

    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-object v7, v5

    .line 169
    new-instance v5, La/hok;

    .line 170
    .line 171
    move-object v9, v7

    .line 172
    iget-wide v7, v9, La/ypl0;->a:J

    .line 173
    .line 174
    iget-object v10, v9, La/ypl0;->c:La/lel0;

    .line 175
    .line 176
    iget-object v10, v10, La/lel0;->a:Ljava/lang/String;

    .line 177
    .line 178
    iget-object v9, v9, La/ypl0;->b:Ljava/lang/String;

    .line 179
    .line 180
    move-object v12, v10

    .line 181
    move-object v10, v9

    .line 182
    move-object v9, v12

    .line 183
    invoke-direct/range {v5 .. v10}, La/hok;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move v6, v11

    .line 190
    goto :goto_5

    .line 191
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 192
    .line 193
    .line 194
    const/4 p0, 0x0

    .line 195
    throw p0

    .line 196
    :cond_7
    new-instance v4, La/ttk;

    .line 197
    .line 198
    invoke-direct {v4, v0}, La/ttk;-><init>(Ljava/util/ArrayList;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, p0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-eqz p0, :cond_5

    .line 206
    .line 207
    :goto_6
    return-void
.end method
