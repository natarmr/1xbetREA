.class public final La/tam0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

.field public final d:La/mne;

.field public final e:La/ewu;

.field public final f:La/zsi0;

.field public final g:La/ctf0;

.field public final h:La/oeg0;

.field public final i:La/g2v;

.field public final j:La/p7m0;

.field public final k:La/p7m0;

.field public final l:La/ol60;

.field public final m:Ljava/util/ArrayList;

.field public n:Ljava/util/ArrayList;

.field public o:Ljava/util/List;

.field public final p:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(La/vzg0;Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;La/mne;La/ewu;La/zsi0;La/ctf0;La/oeg0;La/g2v;)V
    .locals 6

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/tam0;->b:La/vzg0;

    .line 11
    .line 12
    iput-object p2, p0, La/tam0;->c:Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 13
    .line 14
    iput-object p3, p0, La/tam0;->d:La/mne;

    .line 15
    .line 16
    iput-object p4, p0, La/tam0;->e:La/ewu;

    .line 17
    .line 18
    iput-object p5, p0, La/tam0;->f:La/zsi0;

    .line 19
    .line 20
    iput-object p6, p0, La/tam0;->g:La/ctf0;

    .line 21
    .line 22
    iput-object p7, p0, La/tam0;->h:La/oeg0;

    .line 23
    .line 24
    iput-object p8, p0, La/tam0;->i:La/g2v;

    .line 25
    .line 26
    new-instance p1, La/aam0;

    .line 27
    .line 28
    sget-object p3, La/iun;->a:La/iun;

    .line 29
    .line 30
    const/4 p4, 0x0

    .line 31
    invoke-direct {p1, p3, p4, p4}, La/aam0;-><init>(Ljava/util/List;ZZ)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/tam0;->j:La/p7m0;

    .line 39
    .line 40
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/tam0;->k:La/p7m0;

    .line 47
    .line 48
    new-instance p1, La/ol60;

    .line 49
    .line 50
    const/4 p3, 0x3

    .line 51
    invoke-direct {p1, p3}, La/ol60;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/tam0;->l:La/ol60;

    .line 55
    .line 56
    iget-object p1, p2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 57
    .line 58
    new-instance p2, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 p3, 0xa

    .line 61
    .line 62
    invoke-static {p1, p3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    const/4 p5, 0x0

    .line 78
    if-eqz p3, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    check-cast p3, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    sget-object p6, La/t9m0;->h2:La/c0o;

    .line 91
    .line 92
    invoke-virtual {p6}, La/b3;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p6

    .line 96
    :cond_0
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result p7

    .line 100
    if-eqz p7, :cond_1

    .line 101
    .line 102
    invoke-interface {p6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p7

    .line 106
    check-cast p7, La/t9m0;

    .line 107
    .line 108
    iget-short p8, p7, La/t9m0;->a:S

    .line 109
    .line 110
    if-ne p8, p3, :cond_0

    .line 111
    .line 112
    invoke-virtual {p2, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    const-string p0, "Collection contains no element matching the predicate."

    .line 117
    .line 118
    invoke-static {p0}, La/v4i0;->o(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p5

    .line 122
    :cond_2
    iput-object p2, p0, La/tam0;->m:Ljava/util/ArrayList;

    .line 123
    .line 124
    new-instance p1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 130
    .line 131
    sget-object p1, La/iun;->a:La/iun;

    .line 132
    .line 133
    iput-object p1, p0, La/tam0;->o:Ljava/util/List;

    .line 134
    .line 135
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 136
    .line 137
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, La/tam0;->p:Ljava/util/LinkedHashSet;

    .line 141
    .line 142
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object p1, p0, La/tam0;->d:La/mne;

    .line 147
    .line 148
    iget-object v3, p1, La/mne;->a:La/rwj;

    .line 149
    .line 150
    new-instance v1, La/q9m0;

    .line 151
    .line 152
    const/4 p1, 0x2

    .line 153
    invoke-direct {v1, p0, p1}, La/q9m0;-><init>(La/tam0;B)V

    .line 154
    .line 155
    .line 156
    new-instance v4, La/sam0;

    .line 157
    .line 158
    invoke-direct {v4, p0, p5, p4}, La/sam0;-><init>(La/tam0;La/yje;B)V

    .line 159
    .line 160
    .line 161
    const/16 v5, 0xa

    .line 162
    .line 163
    const/4 v2, 0x0

    .line 164
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public static w(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    add-int/lit8 v3, v1, 0x1

    .line 28
    .line 29
    if-ltz v1, :cond_0

    .line 30
    .line 31
    check-cast v2, La/iam0;

    .line 32
    .line 33
    new-instance v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 34
    .line 35
    iget-object v5, v2, La/iam0;->a:La/t9m0;

    .line 36
    .line 37
    iget-boolean v2, v2, La/iam0;->c:Z

    .line 38
    .line 39
    invoke-direct {v4, v5, v1, v2}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;-><init>(La/t9m0;IZ)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move v1, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    throw p0

    .line 52
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final A()V
    .locals 5

    .line 1
    :cond_0
    iget-object v0, p0, La/tam0;->k:La/p7m0;

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
    check-cast v2, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, La/iam0;

    .line 39
    .line 40
    iget-boolean v3, v3, La/iam0;->c:Z

    .line 41
    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_3
    :goto_0
    iget-object v2, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 46
    .line 47
    new-instance v3, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v4, 0xa

    .line 50
    .line 51
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, La/iam0;

    .line 73
    .line 74
    iget-object v4, v4, La/iam0;->a:La/t9m0;

    .line 75
    .line 76
    iget-short v4, v4, La/t9m0;->a:S

    .line 77
    .line 78
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    iget-object v2, p0, La/tam0;->c:Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 87
    .line 88
    iget-object v2, v2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->f:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_5

    .line 95
    .line 96
    :goto_2
    const/4 v2, 0x1

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const/4 v2, 0x0

    .line 99
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_0

    .line 108
    .line 109
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object p0, p0, La/tam0;->h:La/oeg0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/c8d;

    .line 12
    .line 13
    sget-object v2, La/y7d;->a:La/v7d;

    .line 14
    .line 15
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    move-object v1, v0

    .line 26
    check-cast v1, La/paw;

    .line 27
    .line 28
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/oe50;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
.end method

.method public final y()V
    .locals 12

    .line 1
    :cond_0
    iget-object v0, p0, La/tam0;->j:La/p7m0;

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
    check-cast v2, La/cam0;

    .line 9
    .line 10
    new-instance v2, La/bam0;

    .line 11
    .line 12
    iget-object v3, p0, La/tam0;->c:Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 13
    .line 14
    iget-wide v4, v3, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->c:J

    .line 15
    .line 16
    const-wide/16 v6, 0x28

    .line 17
    .line 18
    cmp-long v6, v4, v6

    .line 19
    .line 20
    if-nez v6, :cond_1

    .line 21
    .line 22
    iget-wide v3, v3, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;->d:J

    .line 23
    .line 24
    sget-object v5, La/pb10;->v:La/pb10;

    .line 25
    .line 26
    invoke-static {v3, v4, v5}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_0
    move-object v5, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const-wide/16 v6, 0xbd

    .line 33
    .line 34
    cmp-long v3, v4, v6

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    sget-object v3, La/pb10;->r:La/pb10;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    sget-object v3, La/pb10;->v:La/pb10;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :goto_1
    const/4 v10, 0x0

    .line 45
    const/16 v11, 0x1de

    .line 46
    .line 47
    iget-object v4, p0, La/tam0;->i:La/g2v;

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const v8, 0x7f130677

    .line 52
    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-static/range {v4 .. v11}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-direct {v2, v3}, La/bam0;-><init>(La/jkm;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    return-void
.end method

.method public final z()V
    .locals 7

    .line 1
    iget-object v0, p0, La/tam0;->j:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, La/aam0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v1, La/aam0;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, La/cam0;

    .line 24
    .line 25
    iget-object v3, p0, La/tam0;->n:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v4, p0, La/tam0;->o:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    xor-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    iget-object v4, v1, La/aam0;->b:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v5, La/aam0;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-direct {v5, v4, v3, v6}, La/aam0;-><init>(Ljava/util/List;ZZ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    :goto_1
    return-void
.end method
