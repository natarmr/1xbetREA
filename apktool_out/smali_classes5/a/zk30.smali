.class public final La/zk30;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:I

.field public final d:La/reu;

.field public final e:La/fxt;

.field public final f:La/do20;

.field public final g:La/h03;

.field public final h:La/mne;

.field public final i:La/g2v;

.field public final j:La/i1w0;

.field public final k:La/dq00;

.field public final l:La/c4m0;

.field public m:La/bby;

.field public final n:La/p7m0;

.field public final o:La/p7m0;

.field public final p:La/n0o0;

.field public final q:La/n0o0;

.field public r:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;ILa/reu;La/fxt;La/do20;La/h03;La/m1e;La/mne;La/g2v;La/i1w0;La/dq00;)V
    .locals 13

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, La/w46;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/zk30;->b:La/vzg0;

    .line 10
    .line 11
    iput p2, p0, La/zk30;->c:I

    .line 12
    .line 13
    move-object/from16 v1, p3

    .line 14
    .line 15
    iput-object v1, p0, La/zk30;->d:La/reu;

    .line 16
    .line 17
    move-object/from16 v1, p4

    .line 18
    .line 19
    iput-object v1, p0, La/zk30;->e:La/fxt;

    .line 20
    .line 21
    move-object/from16 v1, p5

    .line 22
    .line 23
    iput-object v1, p0, La/zk30;->f:La/do20;

    .line 24
    .line 25
    move-object/from16 v1, p6

    .line 26
    .line 27
    iput-object v1, p0, La/zk30;->g:La/h03;

    .line 28
    .line 29
    iput-object v0, p0, La/zk30;->h:La/mne;

    .line 30
    .line 31
    move-object/from16 v1, p9

    .line 32
    .line 33
    iput-object v1, p0, La/zk30;->i:La/g2v;

    .line 34
    .line 35
    move-object/from16 v2, p10

    .line 36
    .line 37
    iput-object v2, p0, La/zk30;->j:La/i1w0;

    .line 38
    .line 39
    move-object/from16 v2, p11

    .line 40
    .line 41
    iput-object v2, p0, La/zk30;->k:La/dq00;

    .line 42
    .line 43
    const-string v2, "KEY_SELECTED_DISCIPLINE"

    .line 44
    .line 45
    invoke-virtual {p1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    const-string v3, ""

    .line 52
    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    move-object v9, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object v9, v2

    .line 58
    :goto_0
    const-string v2, "KEY_SEARCH_QUERY"

    .line 59
    .line 60
    invoke-virtual {p1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    if-nez v2, :cond_1

    .line 67
    .line 68
    move-object v10, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move-object v10, v2

    .line 71
    :goto_1
    const-string v2, "KEY_DEFAULT_DISCIPLINE"

    .line 72
    .line 73
    invoke-virtual {p1, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Ljava/lang/String;

    .line 78
    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    move-object p1, v3

    .line 82
    :cond_2
    sget-object v11, La/iun;->a:La/iun;

    .line 83
    .line 84
    sget-object v2, La/pb10;->e:La/pb10;

    .line 85
    .line 86
    const/4 v7, 0x0

    .line 87
    const/16 v8, 0x1de

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    const/4 v4, 0x0

    .line 91
    const v5, 0x7f130e37

    .line 92
    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-static/range {v1 .. v8}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v4, La/nk30;

    .line 100
    .line 101
    move-object v8, v11

    .line 102
    const/4 v11, 0x0

    .line 103
    const/4 v12, 0x1

    .line 104
    move-object v7, v10

    .line 105
    const/4 v10, 0x0

    .line 106
    move-object v6, p1

    .line 107
    move-object v5, v9

    .line 108
    move-object v9, v1

    .line 109
    invoke-direct/range {v4 .. v12}, La/nk30;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;La/jkm;ZZZ)V

    .line 110
    .line 111
    .line 112
    invoke-static {v4}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, La/zk30;->n:La/p7m0;

    .line 117
    .line 118
    sget-object p1, La/s0k0;->a:La/s0k0;

    .line 119
    .line 120
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iput-object p1, p0, La/zk30;->o:La/p7m0;

    .line 125
    .line 126
    new-instance p1, La/tk30;

    .line 127
    .line 128
    const/4 v1, 0x0

    .line 129
    invoke-direct {p1, p0, v1}, La/tk30;-><init>(La/zk30;B)V

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iput-object p1, p0, La/zk30;->p:La/n0o0;

    .line 137
    .line 138
    new-instance p1, La/tk30;

    .line 139
    .line 140
    const/4 v1, 0x1

    .line 141
    invoke-direct {p1, p0, v1}, La/tk30;-><init>(La/zk30;B)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    iput-object p1, p0, La/zk30;->q:La/n0o0;

    .line 149
    .line 150
    iget-object p1, p0, La/zk30;->l:La/c4m0;

    .line 151
    .line 152
    if-eqz p1, :cond_3

    .line 153
    .line 154
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-ne p1, v1, :cond_3

    .line 159
    .line 160
    return-void

    .line 161
    :cond_3
    invoke-interface/range {p7 .. p7}, La/m1e;->b()La/gmq;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-instance v1, La/w620;

    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    const/16 v3, 0xa

    .line 169
    .line 170
    invoke-direct {v1, p0, v2, v3}, La/w620;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 171
    .line 172
    .line 173
    new-instance v2, La/fnq;

    .line 174
    .line 175
    const/4 v3, 0x4

    .line 176
    invoke-direct {v2, p1, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 177
    .line 178
    .line 179
    sget-object p1, La/xk30;->h:La/xk30;

    .line 180
    .line 181
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 186
    .line 187
    invoke-static {v1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v2, v0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iput-object p1, p0, La/zk30;->l:La/c4m0;

    .line 196
    .line 197
    return-void
.end method


# virtual methods
.method public final w(Z)V
    .locals 14

    .line 1
    :cond_0
    iget-object v0, p0, La/zk30;->n:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/nk30;

    .line 9
    .line 10
    const/4 v10, 0x1

    .line 11
    const/16 v11, 0x7f

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    invoke-static/range {v2 .. v11}, La/nk30;->a(La/nk30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;La/jkm;ZZZI)La/nk30;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, La/zk30;->m:La/bby;

    .line 31
    .line 32
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-class v0, La/zk30;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v2, ".loadMedalStatistic"

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-object v0, p0, La/zk30;->h:La/mne;

    .line 52
    .line 53
    iget-object v10, v0, La/mne;->a:La/rwj;

    .line 54
    .line 55
    new-instance v8, La/xj1;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    const/16 v3, 0xe

    .line 59
    .line 60
    invoke-direct {v8, p0, p1, v0, v3}, La/xj1;-><init>(La/diu0;ZLa/yje;B)V

    .line 61
    .line 62
    .line 63
    new-instance v11, La/b530;

    .line 64
    .line 65
    const/4 p1, 0x4

    .line 66
    invoke-direct {v11, p0, p1}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    const/4 v12, 0x0

    .line 70
    const/16 v13, 0x258

    .line 71
    .line 72
    const/4 v3, 0x3

    .line 73
    const-wide/16 v4, 0x3

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v9, 0x0

    .line 78
    invoke-static/range {v1 .. v13}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, La/zk30;->m:La/bby;

    .line 83
    .line 84
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object v0, p0, La/zk30;->g:La/h03;

    .line 2
    .line 3
    iget-object v0, v0, La/h03;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/z220;

    .line 6
    .line 7
    iget-object v0, v0, La/z220;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/ygm0;

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    iput-object v1, v0, La/ygm0;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v0, p0, La/zk30;->f:La/do20;

    .line 16
    .line 17
    iget-object v0, v0, La/do20;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/z220;

    .line 20
    .line 21
    iget-object v0, v0, La/z220;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, La/ygm0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-object v1, v0, La/ygm0;->a:La/kgb;

    .line 27
    .line 28
    iget-object p0, p0, La/zk30;->j:La/i1w0;

    .line 29
    .line 30
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, La/c8d;

    .line 35
    .line 36
    sget-object v2, La/y7d;->a:La/v7d;

    .line 37
    .line 38
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 39
    .line 40
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    move-object v1, v0

    .line 49
    check-cast v1, La/paw;

    .line 50
    .line 51
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, La/oe50;

    .line 62
    .line 63
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-void
.end method

.method public final y()V
    .locals 12

    .line 1
    :cond_0
    iget-object v0, p0, La/zk30;->n:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/nk30;

    .line 9
    .line 10
    sget-object v6, La/iun;->a:La/iun;

    .line 11
    .line 12
    iget-object v3, p0, La/zk30;->p:La/n0o0;

    .line 13
    .line 14
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    move-object v7, v3

    .line 19
    check-cast v7, La/jkm;

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    const/16 v11, 0x47

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v8, 0x1

    .line 28
    const/4 v9, 0x0

    .line 29
    invoke-static/range {v2 .. v11}, La/nk30;->a(La/nk30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;La/jkm;ZZZI)La/nk30;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    return-void
.end method
