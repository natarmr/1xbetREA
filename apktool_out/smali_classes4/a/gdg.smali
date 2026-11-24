.class public final La/gdg;
.super La/w3k;
.source "SourceFile"

# interfaces
.implements La/lc3;


# instance fields
.field public final c:La/vzg0;

.field public final d:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

.field public final e:La/cxt;

.field public final f:La/j3c;

.field public final g:La/lsn;

.field public final h:La/fvt;

.field public final i:La/qc3;

.field public final j:La/m1e;

.field public final k:La/mne;

.field public final l:La/duj;

.field public final m:La/arc;

.field public final n:La/ctf0;

.field public final o:La/u58;

.field public final p:La/zr1;

.field public final q:Ljava/util/List;

.field public final r:Z

.field public s:Ljava/lang/String;

.field public final t:La/xae0;

.field public final u:La/p7m0;

.field public v:La/c4m0;

.field public w:La/bby;

.field public x:La/c4m0;

.field public final y:La/ise0;

.field public final z:La/ise0;


# direct methods
.method public constructor <init>(La/vzg0;Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;La/ywq0;La/cxt;La/yuu;La/j3c;La/lsn;La/fvt;La/qc3;La/m1e;La/mne;La/duj;La/svu;La/pru;La/arc;La/ctf0;La/u58;La/zr1;)V
    .locals 8

    .line 1
    move-object/from16 v0, p11

    .line 2
    .line 3
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static/range {p9 .. p9}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, p1, v1}, La/w3k;-><init>(La/vzg0;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/gdg;->c:La/vzg0;

    .line 17
    .line 18
    iput-object p2, p0, La/gdg;->d:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 19
    .line 20
    iput-object p4, p0, La/gdg;->e:La/cxt;

    .line 21
    .line 22
    iput-object p6, p0, La/gdg;->f:La/j3c;

    .line 23
    .line 24
    iput-object p7, p0, La/gdg;->g:La/lsn;

    .line 25
    .line 26
    move-object/from16 p4, p8

    .line 27
    .line 28
    iput-object p4, p0, La/gdg;->h:La/fvt;

    .line 29
    .line 30
    move-object/from16 p4, p9

    .line 31
    .line 32
    iput-object p4, p0, La/gdg;->i:La/qc3;

    .line 33
    .line 34
    move-object/from16 p4, p10

    .line 35
    .line 36
    iput-object p4, p0, La/gdg;->j:La/m1e;

    .line 37
    .line 38
    iput-object v0, p0, La/gdg;->k:La/mne;

    .line 39
    .line 40
    move-object/from16 p4, p12

    .line 41
    .line 42
    iput-object p4, p0, La/gdg;->l:La/duj;

    .line 43
    .line 44
    move-object/from16 p4, p15

    .line 45
    .line 46
    iput-object p4, p0, La/gdg;->m:La/arc;

    .line 47
    .line 48
    move-object/from16 p4, p16

    .line 49
    .line 50
    iput-object p4, p0, La/gdg;->n:La/ctf0;

    .line 51
    .line 52
    move-object/from16 p4, p17

    .line 53
    .line 54
    iput-object p4, p0, La/gdg;->o:La/u58;

    .line 55
    .line 56
    move-object/from16 p4, p18

    .line 57
    .line 58
    iput-object p4, p0, La/gdg;->p:La/zr1;

    .line 59
    .line 60
    invoke-virtual/range {p14 .. p14}, La/pru;->a()La/sff0;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    iget-object p4, p4, La/sff0;->c:La/ech;

    .line 65
    .line 66
    iget-object p4, p4, La/ech;->j:Ljava/util/List;

    .line 67
    .line 68
    iput-object p4, p0, La/gdg;->q:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual/range {p13 .. p13}, La/svu;->l()Z

    .line 71
    .line 72
    .line 73
    move-result p4

    .line 74
    iput-boolean p4, p0, La/gdg;->r:Z

    .line 75
    .line 76
    iget-object p4, p2, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->b:Ljava/lang/String;

    .line 77
    .line 78
    iput-object p4, p0, La/gdg;->s:Ljava/lang/String;

    .line 79
    .line 80
    const-string p4, "SELECTED_SEGMENT_KEY"

    .line 81
    .line 82
    sget-object v1, La/beg;->a:La/beg;

    .line 83
    .line 84
    invoke-virtual {p1, v1, p4}, La/vzg0;->c(Ljava/lang/Object;Ljava/lang/String;)La/xae0;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, La/gdg;->t:La/xae0;

    .line 89
    .line 90
    new-instance p1, La/cfb;

    .line 91
    .line 92
    sget-object p4, La/iun;->a:La/iun;

    .line 93
    .line 94
    invoke-virtual/range {p14 .. p14}, La/pru;->a()La/sff0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, La/ucx;->X(La/sff0;)La/dxh0;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-direct {p1, p4, v1, v2}, La/cfb;-><init>(Ljava/util/List;La/dxh0;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, La/gdg;->u:La/p7m0;

    .line 111
    .line 112
    iget-wide v1, p2, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 113
    .line 114
    new-instance p1, La/jc1;

    .line 115
    .line 116
    const/4 p4, 0x0

    .line 117
    invoke-direct {p1, p5, v1, v2, p4}, La/jc1;-><init>(La/yuu;JLa/yje;)V

    .line 118
    .line 119
    .line 120
    new-instance v1, La/vsg0;

    .line 121
    .line 122
    invoke-direct {v1, p1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 130
    .line 131
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    new-instance v2, La/o6m0;

    .line 136
    .line 137
    const-wide v3, 0x7fffffffffffffffL

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-direct {v2, v3, v4}, La/o6m0;-><init>(J)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, p1, v2}, La/piz;->N(La/gmq;La/sje;La/o6m0;)La/ise0;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iput-object p1, p0, La/gdg;->y:La/ise0;

    .line 150
    .line 151
    iget-wide v1, p2, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 152
    .line 153
    iget p1, p2, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->d:I

    .line 154
    .line 155
    invoke-static {p1}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-wide v5, p2, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->c:J

    .line 160
    .line 161
    sget-object p2, La/sip;->c:La/sip;

    .line 162
    .line 163
    move-object/from16 p11, p1

    .line 164
    .line 165
    move-object/from16 p10, p2

    .line 166
    .line 167
    move-object p5, p3

    .line 168
    move-wide/from16 p8, v1

    .line 169
    .line 170
    move-wide p6, v5

    .line 171
    invoke-virtual/range {p5 .. p11}, La/ywq0;->i(JJLa/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)La/gmq;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    move-object/from16 p2, p11

    .line 176
    .line 177
    sget-object v7, La/sip;->b:La/sip;

    .line 178
    .line 179
    move-object/from16 p10, v7

    .line 180
    .line 181
    invoke-virtual/range {p5 .. p11}, La/ywq0;->i(JJLa/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)La/gmq;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    move-wide/from16 v5, p8

    .line 186
    .line 187
    new-instance v2, La/el00;

    .line 188
    .line 189
    invoke-direct {v2, p3, v5, v6, p4}, La/el00;-><init>(La/ywq0;JLa/yje;)V

    .line 190
    .line 191
    .line 192
    new-instance p3, La/p6d;

    .line 193
    .line 194
    const/4 p4, 0x1

    .line 195
    invoke-direct {p3, p1, p2, v2, p4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 196
    .line 197
    .line 198
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    new-instance p2, La/o6m0;

    .line 207
    .line 208
    invoke-direct {p2, v3, v4}, La/o6m0;-><init>(J)V

    .line 209
    .line 210
    .line 211
    invoke-static {p3, p1, p2}, La/piz;->N(La/gmq;La/sje;La/o6m0;)La/ise0;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iput-object p1, p0, La/gdg;->z:La/ise0;

    .line 216
    .line 217
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, La/gdg;->i:La/qc3;

    .line 2
    .line 3
    invoke-virtual {p0}, La/qc3;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, La/gdg;->i:La/qc3;

    .line 2
    .line 3
    invoke-virtual {v0}, La/qc3;->f()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/gdg;->w()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final v()V
    .locals 5

    .line 1
    iget-object v0, p0, La/gdg;->m:La/arc;

    .line 2
    .line 3
    iget-object v0, v0, La/arc;->a:La/udg;

    .line 4
    .line 5
    iget-object v0, v0, La/udg;->b:La/tcg;

    .line 6
    .line 7
    iget-object v1, v0, La/tcg;->g:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    iget-object v2, v0, La/tcg;->e:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, La/tcg;->d:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, La/tcg;->c:La/a8z;

    .line 20
    .line 21
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, La/mz40;

    .line 26
    .line 27
    invoke-interface {v2}, La/mz40;->i()V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, La/tcg;->f:Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/Iterable;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, La/mz40;

    .line 53
    .line 54
    invoke-interface {v4}, La/mz40;->i()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Ljava/lang/Iterable;

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, La/mz40;

    .line 79
    .line 80
    invoke-interface {v4}, La/mz40;->i()V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 88
    .line 89
    .line 90
    iget-object v0, v0, La/tcg;->h:La/qoj0;

    .line 91
    .line 92
    invoke-virtual {v0}, La/qoj0;->i()V

    .line 93
    .line 94
    .line 95
    invoke-super {p0}, La/w3k;->v()V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final w()V
    .locals 11

    .line 1
    iget-object v0, p0, La/gdg;->w:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, La/gdg;->w:La/bby;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, La/x6f;

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    const/16 v10, 0xc

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    const-class v6, La/gdg;

    .line 32
    .line 33
    const-string v7, "handleError"

    .line 34
    .line 35
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 36
    .line 37
    move-object v5, p0

    .line 38
    invoke-direct/range {v3 .. v10}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 39
    .line 40
    .line 41
    new-instance v6, La/ex1;

    .line 42
    .line 43
    const/16 v0, 0x1b

    .line 44
    .line 45
    invoke-direct {v6, p0, v1, v0}, La/ex1;-><init>(La/w46;La/yje;B)V

    .line 46
    .line 47
    .line 48
    const/16 v7, 0xe

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/gdg;->w:La/bby;

    .line 57
    .line 58
    return-void
.end method

.method public final x()Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f1303fe

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    const v1, 0x7f1303ff

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/gdg;->d:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 26
    .line 27
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 28
    .line 29
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, La/gdg;->q:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    const v1, 0x7f1303f3

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    const/16 v2, 0xa

    .line 58
    .line 59
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-virtual {v0, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :goto_0
    move-object v3, v0

    .line 72
    check-cast v3, La/paw;

    .line 73
    .line 74
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_1

    .line 79
    .line 80
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    new-array v4, v2, [Ljava/lang/Object;

    .line 91
    .line 92
    iget-object v5, p0, La/gdg;->n:La/ctf0;

    .line 93
    .line 94
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 95
    .line 96
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v5, v3, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    return-object v1
.end method
