.class public final La/eiz;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic E:I


# instance fields
.field public A:La/bby;

.field public B:La/bby;

.field public C:La/bby;

.field public D:La/bby;

.field public final o:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

.field public final p:La/m1e;

.field public final q:La/ctf0;

.field public final r:La/hzg;

.field public final s:La/j3c;

.field public final t:La/cmt;

.field public final u:La/e1u;

.field public final v:La/n4u;

.field public final w:La/rpt;

.field public final x:La/ih5;

.field public final y:La/zr1;

.field public z:La/c4m0;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;La/mne;La/m1e;La/g2v;La/ctf0;La/hzg;La/j3c;La/cmt;La/e1u;La/n4u;La/rpt;La/ih5;La/zr1;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 8
    .line 9
    invoke-static {p2, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v0, La/rcz;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-direct {v0, p1, v1}, La/rcz;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/o20;

    .line 20
    .line 21
    const/16 v2, 0xc

    .line 22
    .line 23
    invoke-direct {v1, p4, p5, v2}, La/o20;-><init>(La/g2v;La/ctf0;B)V

    .line 24
    .line 25
    .line 26
    const/4 p4, 0x0

    .line 27
    invoke-direct {p0, v0, p2, v1, p4}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/eiz;->o:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 31
    .line 32
    iput-object p3, p0, La/eiz;->p:La/m1e;

    .line 33
    .line 34
    iput-object p5, p0, La/eiz;->q:La/ctf0;

    .line 35
    .line 36
    iput-object p6, p0, La/eiz;->r:La/hzg;

    .line 37
    .line 38
    iput-object p7, p0, La/eiz;->s:La/j3c;

    .line 39
    .line 40
    iput-object p8, p0, La/eiz;->t:La/cmt;

    .line 41
    .line 42
    iput-object p9, p0, La/eiz;->u:La/e1u;

    .line 43
    .line 44
    iput-object p10, p0, La/eiz;->v:La/n4u;

    .line 45
    .line 46
    iput-object p11, p0, La/eiz;->w:La/rpt;

    .line 47
    .line 48
    iput-object p12, p0, La/eiz;->x:La/ih5;

    .line 49
    .line 50
    move-object/from16 p1, p13

    .line 51
    .line 52
    iput-object p1, p0, La/eiz;->y:La/zr1;

    .line 53
    .line 54
    new-instance p1, La/aiz;

    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    invoke-direct {p1, p0, p4, p2}, La/aiz;-><init>(La/i3t0;La/yje;B)V

    .line 58
    .line 59
    .line 60
    const/4 p2, 0x3

    .line 61
    invoke-static {p0, p4, p4, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final M()Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/ihz;

    .line 6
    .line 7
    iget-wide v0, p0, La/ihz;->b:J

    .line 8
    .line 9
    const-wide/16 v2, 0x1

    .line 10
    .line 11
    cmp-long p0, v0, v2

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    sget-object p0, La/xhz;->e:La/c0o;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-wide/16 v2, 0x2e

    .line 19
    .line 20
    cmp-long p0, v0, v2

    .line 21
    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/xhz;->b:La/xhz;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    sget-object v0, La/xhz;->c:La/xhz;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_1
    sget-object p0, La/xhz;->e:La/c0o;

    .line 44
    .line 45
    return-object p0
.end method

.method public final N()V
    .locals 3

    .line 1
    iget-object v0, p0, La/eiz;->C:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v0, La/bu;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, p0, v2, v1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    invoke-static {p0, v2, v2, v0, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/eiz;->C:La/bby;

    .line 22
    .line 23
    return-void
.end method

.method public final O()V
    .locals 3

    .line 1
    iget-object v0, p0, La/eiz;->A:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    new-instance v0, La/ciz;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, p0, v2, v1}, La/ciz;-><init>(La/eiz;La/yje;B)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {p0, v2, v2, v0, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, La/eiz;->A:La/bby;

    .line 21
    .line 22
    return-void
.end method

.method public final P()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/ihz;

    .line 6
    .line 7
    iget-object v0, v0, La/ihz;->d:La/xhz;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, La/eiz;->N()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, La/eiz;->D:La/bby;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    new-instance v0, La/z8z;

    .line 37
    .line 38
    const/16 v2, 0xa

    .line 39
    .line 40
    invoke-direct {v0, v2}, La/z8z;-><init>(B)V

    .line 41
    .line 42
    .line 43
    new-instance v2, La/ciz;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-direct {v2, p0, v4, v3}, La/ciz;-><init>(La/eiz;La/yje;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v4, v0, v2, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/eiz;->D:La/bby;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    invoke-virtual {p0}, La/eiz;->O()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/rfz;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {v0, v1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    instance-of v2, v1, La/qfz;

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    const/4 v4, 0x3

    .line 17
    const/16 v5, 0xa

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v2, :cond_1e

    .line 21
    .line 22
    check-cast v1, La/qfz;

    .line 23
    .line 24
    sget-object v2, La/ffz;->a:La/ffz;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-object v7, v0, La/eiz;->r:La/hzg;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    check-cast v7, La/uzg;

    .line 35
    .line 36
    invoke-virtual {v7}, La/uzg;->a()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    instance-of v2, v1, La/kfz;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, La/eiz;->P()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    instance-of v2, v1, La/gfz;

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    iget-object v9, v0, La/eiz;->q:La/ctf0;

    .line 52
    .line 53
    if-eqz v2, :cond_9

    .line 54
    .line 55
    check-cast v1, La/gfz;

    .line 56
    .line 57
    iget-wide v1, v1, La/gfz;->a:J

    .line 58
    .line 59
    const-wide/16 v3, 0x1

    .line 60
    .line 61
    cmp-long v3, v1, v3

    .line 62
    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    new-instance v1, La/bhz;

    .line 66
    .line 67
    new-instance v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilterParams;

    .line 68
    .line 69
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, La/ihz;

    .line 74
    .line 75
    iget-wide v3, v3, La/ihz;->b:J

    .line 76
    .line 77
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, La/ihz;

    .line 82
    .line 83
    iget-object v5, v5, La/ihz;->h:Ljava/util/List;

    .line 84
    .line 85
    invoke-direct {v2, v3, v4, v5}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilterParams;-><init>(JLjava/util/List;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v1, v2}, La/bhz;-><init>(Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilterParams;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    const-wide/16 v3, 0x3

    .line 96
    .line 97
    cmp-long v3, v1, v3

    .line 98
    .line 99
    if-nez v3, :cond_6

    .line 100
    .line 101
    new-instance v1, La/fhz;

    .line 102
    .line 103
    new-instance v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;

    .line 104
    .line 105
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, La/ihz;

    .line 110
    .line 111
    iget-object v3, v3, La/ihz;->k:Lkotlin/Pair;

    .line 112
    .line 113
    if-eqz v3, :cond_3

    .line 114
    .line 115
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v3, Ljava/util/List;

    .line 118
    .line 119
    if-nez v3, :cond_4

    .line 120
    .line 121
    :cond_3
    sget-object v3, La/iun;->a:La/iun;

    .line 122
    .line 123
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    new-instance v6, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;

    .line 134
    .line 135
    new-array v7, v8, [Ljava/lang/Object;

    .line 136
    .line 137
    iget-object v9, v9, La/ctf0;->b:La/lsm0;

    .line 138
    .line 139
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const v10, 0x7f1300ee

    .line 144
    .line 145
    .line 146
    invoke-virtual {v9, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-direct {v6, v8, v7}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;-><init>(ILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    new-instance v6, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_5

    .line 174
    .line 175
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    check-cast v5, Ljava/lang/Number;

    .line 180
    .line 181
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    new-instance v7, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;

    .line 186
    .line 187
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-direct {v7, v5, v8}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterYearsModel;-><init>(ILjava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_5
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, La/ihz;

    .line 212
    .line 213
    iget v4, v4, La/ihz;->c:I

    .line 214
    .line 215
    invoke-direct {v2, v3, v4}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;-><init>(Ljava/util/AbstractList;I)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v1, v2}, La/fhz;-><init>(Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_6
    const-wide/16 v3, 0x2

    .line 226
    .line 227
    cmp-long v3, v1, v3

    .line 228
    .line 229
    if-nez v3, :cond_7

    .line 230
    .line 231
    new-instance v1, La/ghz;

    .line 232
    .line 233
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    check-cast v2, La/ihz;

    .line 238
    .line 239
    iget-object v2, v2, La/ihz;->d:La/xhz;

    .line 240
    .line 241
    invoke-virtual {v0}, La/eiz;->M()Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    new-instance v4, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;

    .line 246
    .line 247
    invoke-direct {v4, v3, v2}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;-><init>(Ljava/util/List;La/xhz;)V

    .line 248
    .line 249
    .line 250
    invoke-direct {v1, v4}, La/ghz;-><init>(Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :cond_7
    const-wide/16 v3, 0x4

    .line 258
    .line 259
    cmp-long v3, v1, v3

    .line 260
    .line 261
    if-nez v3, :cond_8

    .line 262
    .line 263
    new-instance v1, La/chz;

    .line 264
    .line 265
    new-instance v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;

    .line 266
    .line 267
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    check-cast v3, La/ihz;

    .line 272
    .line 273
    iget-object v3, v3, La/ihz;->e:La/qgz;

    .line 274
    .line 275
    invoke-direct {v2, v3}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;-><init>(La/qgz;)V

    .line 276
    .line 277
    .line 278
    invoke-direct {v1, v2}, La/chz;-><init>(Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_8
    const-wide/16 v3, 0x5

    .line 286
    .line 287
    cmp-long v1, v1, v3

    .line 288
    .line 289
    if-nez v1, :cond_22

    .line 290
    .line 291
    new-instance v1, La/ehz;

    .line 292
    .line 293
    new-instance v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;

    .line 294
    .line 295
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    check-cast v3, La/ihz;

    .line 300
    .line 301
    iget-object v3, v3, La/ihz;->f:La/epe;

    .line 302
    .line 303
    invoke-direct {v2, v3}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;-><init>(La/epe;)V

    .line 304
    .line 305
    .line 306
    invoke-direct {v1, v2}, La/ehz;-><init>(Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :cond_9
    instance-of v2, v1, La/jfz;

    .line 314
    .line 315
    iget-object v10, v0, La/i3t0;->f:La/oyg0;

    .line 316
    .line 317
    iget-object v11, v0, La/i3t0;->i:La/ocj;

    .line 318
    .line 319
    if-eqz v2, :cond_d

    .line 320
    .line 321
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, La/ihz;

    .line 326
    .line 327
    iget-object v0, v0, La/ihz;->i:La/l2h;

    .line 328
    .line 329
    sget-object v1, La/j2h;->a:La/j2h;

    .line 330
    .line 331
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    sget-object v3, La/k2h;->a:La/k2h;

    .line 336
    .line 337
    if-eqz v2, :cond_a

    .line 338
    .line 339
    move-object/from16 v21, v3

    .line 340
    .line 341
    goto :goto_1

    .line 342
    :cond_a
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_c

    .line 347
    .line 348
    move-object/from16 v21, v1

    .line 349
    .line 350
    :goto_1
    iget-object v0, v11, La/ocj;->a:La/p7m0;

    .line 351
    .line 352
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-object v12, v1

    .line 360
    check-cast v12, La/ihz;

    .line 361
    .line 362
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    const/16 v29, 0x0

    .line 366
    .line 367
    const v30, 0x1feff

    .line 368
    .line 369
    .line 370
    const-wide/16 v13, 0x0

    .line 371
    .line 372
    const/4 v15, 0x0

    .line 373
    const/16 v16, 0x0

    .line 374
    .line 375
    const/16 v17, 0x0

    .line 376
    .line 377
    const/16 v18, 0x0

    .line 378
    .line 379
    const/16 v19, 0x0

    .line 380
    .line 381
    const/16 v20, 0x0

    .line 382
    .line 383
    const/16 v22, 0x0

    .line 384
    .line 385
    const/16 v23, 0x0

    .line 386
    .line 387
    const/16 v24, 0x0

    .line 388
    .line 389
    const/16 v25, 0x0

    .line 390
    .line 391
    const/16 v26, 0x0

    .line 392
    .line 393
    const/16 v27, 0x0

    .line 394
    .line 395
    const/16 v28, 0x0

    .line 396
    .line 397
    invoke-static/range {v12 .. v30}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    if-eqz v1, :cond_b

    .line 406
    .line 407
    return-void

    .line 408
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :cond_d
    instance-of v2, v1, La/hfz;

    .line 413
    .line 414
    if-eqz v2, :cond_f

    .line 415
    .line 416
    check-cast v1, La/hfz;

    .line 417
    .line 418
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    check-cast v2, La/ihz;

    .line 423
    .line 424
    iget-wide v2, v2, La/ihz;->b:J

    .line 425
    .line 426
    iget-wide v4, v1, La/hfz;->a:J

    .line 427
    .line 428
    cmp-long v2, v2, v4

    .line 429
    .line 430
    if-eqz v2, :cond_22

    .line 431
    .line 432
    iget-object v2, v11, La/ocj;->a:La/p7m0;

    .line 433
    .line 434
    :cond_e
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    move-object v11, v3

    .line 442
    check-cast v11, La/ihz;

    .line 443
    .line 444
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    iget-wide v12, v1, La/hfz;->a:J

    .line 448
    .line 449
    sget-object v15, La/xhz;->b:La/xhz;

    .line 450
    .line 451
    const/16 v28, 0x0

    .line 452
    .line 453
    const v29, 0x1bdf1

    .line 454
    .line 455
    .line 456
    const/4 v14, 0x0

    .line 457
    const/16 v16, 0x0

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    const/16 v18, 0x0

    .line 462
    .line 463
    const/16 v19, 0x0

    .line 464
    .line 465
    const/16 v20, 0x0

    .line 466
    .line 467
    const/16 v21, 0x0

    .line 468
    .line 469
    const/16 v22, 0x0

    .line 470
    .line 471
    const/16 v23, 0x0

    .line 472
    .line 473
    const/16 v24, 0x0

    .line 474
    .line 475
    const/16 v25, 0x0

    .line 476
    .line 477
    const/16 v26, 0x1

    .line 478
    .line 479
    const/16 v27, 0x0

    .line 480
    .line 481
    invoke-static/range {v11 .. v29}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    if-eqz v3, :cond_e

    .line 490
    .line 491
    invoke-virtual {v0}, La/eiz;->M()Ljava/util/List;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0}, La/eiz;->O()V

    .line 495
    .line 496
    .line 497
    return-void

    .line 498
    :cond_f
    instance-of v2, v1, La/pfz;

    .line 499
    .line 500
    if-eqz v2, :cond_11

    .line 501
    .line 502
    check-cast v1, La/pfz;

    .line 503
    .line 504
    iget-object v1, v1, La/pfz;->a:La/xhz;

    .line 505
    .line 506
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    check-cast v2, La/ihz;

    .line 511
    .line 512
    iget-object v2, v2, La/ihz;->d:La/xhz;

    .line 513
    .line 514
    if-eq v2, v1, :cond_22

    .line 515
    .line 516
    iget-object v2, v11, La/ocj;->a:La/p7m0;

    .line 517
    .line 518
    :goto_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    move-object v12, v3

    .line 526
    check-cast v12, La/ihz;

    .line 527
    .line 528
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    const/16 v29, 0x0

    .line 532
    .line 533
    const v30, 0x1fff7

    .line 534
    .line 535
    .line 536
    const-wide/16 v13, 0x0

    .line 537
    .line 538
    const/4 v15, 0x0

    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const/16 v18, 0x0

    .line 542
    .line 543
    const/16 v19, 0x0

    .line 544
    .line 545
    const/16 v20, 0x0

    .line 546
    .line 547
    const/16 v21, 0x0

    .line 548
    .line 549
    const/16 v22, 0x0

    .line 550
    .line 551
    const/16 v23, 0x0

    .line 552
    .line 553
    const/16 v24, 0x0

    .line 554
    .line 555
    const/16 v25, 0x0

    .line 556
    .line 557
    const/16 v26, 0x0

    .line 558
    .line 559
    const/16 v27, 0x0

    .line 560
    .line 561
    const/16 v28, 0x0

    .line 562
    .line 563
    move-object/from16 v16, v1

    .line 564
    .line 565
    invoke-static/range {v12 .. v30}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-virtual {v2, v3, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-eqz v1, :cond_10

    .line 574
    .line 575
    invoke-virtual {v0}, La/eiz;->P()V

    .line 576
    .line 577
    .line 578
    return-void

    .line 579
    :cond_10
    move-object/from16 v1, v16

    .line 580
    .line 581
    goto :goto_2

    .line 582
    :cond_11
    instance-of v2, v1, La/ofz;

    .line 583
    .line 584
    if-eqz v2, :cond_13

    .line 585
    .line 586
    check-cast v1, La/ofz;

    .line 587
    .line 588
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    check-cast v2, La/ihz;

    .line 593
    .line 594
    iget v2, v2, La/ihz;->c:I

    .line 595
    .line 596
    iget v3, v1, La/ofz;->a:I

    .line 597
    .line 598
    if-eq v2, v3, :cond_22

    .line 599
    .line 600
    iget-object v2, v11, La/ocj;->a:La/p7m0;

    .line 601
    .line 602
    :cond_12
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    move-object v11, v3

    .line 610
    check-cast v11, La/ihz;

    .line 611
    .line 612
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    iget v14, v1, La/ofz;->a:I

    .line 616
    .line 617
    const/16 v28, 0x0

    .line 618
    .line 619
    const v29, 0x1fdfb

    .line 620
    .line 621
    .line 622
    const-wide/16 v12, 0x0

    .line 623
    .line 624
    const/4 v15, 0x0

    .line 625
    const/16 v16, 0x0

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    const/16 v18, 0x0

    .line 630
    .line 631
    const/16 v19, 0x0

    .line 632
    .line 633
    const/16 v20, 0x0

    .line 634
    .line 635
    const/16 v21, 0x0

    .line 636
    .line 637
    const/16 v22, 0x0

    .line 638
    .line 639
    const/16 v23, 0x0

    .line 640
    .line 641
    const/16 v24, 0x0

    .line 642
    .line 643
    const/16 v25, 0x0

    .line 644
    .line 645
    const/16 v26, 0x0

    .line 646
    .line 647
    const/16 v27, 0x0

    .line 648
    .line 649
    invoke-static/range {v11 .. v29}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    if-eqz v3, :cond_12

    .line 658
    .line 659
    invoke-virtual {v0}, La/eiz;->O()V

    .line 660
    .line 661
    .line 662
    return-void

    .line 663
    :cond_13
    instance-of v2, v1, La/lfz;

    .line 664
    .line 665
    const/4 v12, 0x1

    .line 666
    if-eqz v2, :cond_16

    .line 667
    .line 668
    check-cast v1, La/lfz;

    .line 669
    .line 670
    iget-object v1, v1, La/lfz;->a:La/qgz;

    .line 671
    .line 672
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    check-cast v2, La/ihz;

    .line 677
    .line 678
    iget-object v2, v2, La/ihz;->e:La/qgz;

    .line 679
    .line 680
    if-eq v2, v1, :cond_22

    .line 681
    .line 682
    iget-object v2, v11, La/ocj;->a:La/p7m0;

    .line 683
    .line 684
    :goto_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    move-object v13, v3

    .line 692
    check-cast v13, La/ihz;

    .line 693
    .line 694
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    const/16 v30, 0x0

    .line 698
    .line 699
    const v31, 0x1dfef

    .line 700
    .line 701
    .line 702
    const-wide/16 v14, 0x0

    .line 703
    .line 704
    const/16 v16, 0x0

    .line 705
    .line 706
    const/16 v17, 0x0

    .line 707
    .line 708
    const/16 v19, 0x0

    .line 709
    .line 710
    const/16 v20, 0x0

    .line 711
    .line 712
    const/16 v21, 0x0

    .line 713
    .line 714
    const/16 v22, 0x0

    .line 715
    .line 716
    const/16 v23, 0x0

    .line 717
    .line 718
    const/16 v24, 0x0

    .line 719
    .line 720
    const/16 v25, 0x0

    .line 721
    .line 722
    const/16 v26, 0x0

    .line 723
    .line 724
    const/16 v27, 0x0

    .line 725
    .line 726
    const/16 v28, 0x0

    .line 727
    .line 728
    const/16 v29, 0x0

    .line 729
    .line 730
    move-object/from16 v18, v1

    .line 731
    .line 732
    invoke-static/range {v13 .. v31}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-virtual {v2, v3, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v1

    .line 740
    if-eqz v1, :cond_15

    .line 741
    .line 742
    iget-object v1, v0, La/eiz;->D:La/bby;

    .line 743
    .line 744
    if-eqz v1, :cond_14

    .line 745
    .line 746
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 747
    .line 748
    .line 749
    :cond_14
    new-instance v1, La/z8z;

    .line 750
    .line 751
    invoke-direct {v1, v5}, La/z8z;-><init>(B)V

    .line 752
    .line 753
    .line 754
    new-instance v2, La/ciz;

    .line 755
    .line 756
    invoke-direct {v2, v0, v6, v8}, La/ciz;-><init>(La/eiz;La/yje;B)V

    .line 757
    .line 758
    .line 759
    invoke-static {v0, v6, v1, v2, v12}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    iput-object v1, v0, La/eiz;->D:La/bby;

    .line 764
    .line 765
    return-void

    .line 766
    :cond_15
    move-object/from16 v1, v18

    .line 767
    .line 768
    goto :goto_3

    .line 769
    :cond_16
    instance-of v2, v1, La/nfz;

    .line 770
    .line 771
    if-eqz v2, :cond_18

    .line 772
    .line 773
    check-cast v1, La/nfz;

    .line 774
    .line 775
    iget-object v1, v1, La/nfz;->a:La/epe;

    .line 776
    .line 777
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    check-cast v2, La/ihz;

    .line 782
    .line 783
    iget-object v2, v2, La/ihz;->f:La/epe;

    .line 784
    .line 785
    if-eq v2, v1, :cond_22

    .line 786
    .line 787
    iget-object v2, v11, La/ocj;->a:La/p7m0;

    .line 788
    .line 789
    :goto_4
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    move-object v12, v3

    .line 797
    check-cast v12, La/ihz;

    .line 798
    .line 799
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    const/16 v29, 0x0

    .line 803
    .line 804
    const v30, 0x1e7df

    .line 805
    .line 806
    .line 807
    const-wide/16 v13, 0x0

    .line 808
    .line 809
    const/4 v15, 0x0

    .line 810
    const/16 v16, 0x0

    .line 811
    .line 812
    const/16 v17, 0x0

    .line 813
    .line 814
    const/16 v19, 0x0

    .line 815
    .line 816
    const/16 v20, 0x0

    .line 817
    .line 818
    const/16 v21, 0x0

    .line 819
    .line 820
    const/16 v22, 0x0

    .line 821
    .line 822
    const/16 v23, 0x0

    .line 823
    .line 824
    const/16 v24, 0x0

    .line 825
    .line 826
    const/16 v25, 0x0

    .line 827
    .line 828
    const/16 v26, 0x0

    .line 829
    .line 830
    const/16 v27, 0x0

    .line 831
    .line 832
    const/16 v28, 0x0

    .line 833
    .line 834
    move-object/from16 v18, v1

    .line 835
    .line 836
    invoke-static/range {v12 .. v30}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 837
    .line 838
    .line 839
    move-result-object v1

    .line 840
    invoke-virtual {v2, v3, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    move-result v1

    .line 844
    if-eqz v1, :cond_17

    .line 845
    .line 846
    invoke-virtual {v0}, La/eiz;->N()V

    .line 847
    .line 848
    .line 849
    return-void

    .line 850
    :cond_17
    move-object/from16 v1, v18

    .line 851
    .line 852
    goto :goto_4

    .line 853
    :cond_18
    instance-of v2, v1, La/ifz;

    .line 854
    .line 855
    if-eqz v2, :cond_1b

    .line 856
    .line 857
    check-cast v1, La/ifz;

    .line 858
    .line 859
    const/4 v2, 0x5

    .line 860
    new-array v2, v2, [La/yxg;

    .line 861
    .line 862
    sget-object v6, La/ttg;->d:La/ttg;

    .line 863
    .line 864
    aput-object v6, v2, v8

    .line 865
    .line 866
    sget-object v6, La/trg;->d:La/trg;

    .line 867
    .line 868
    aput-object v6, v2, v12

    .line 869
    .line 870
    sget-object v6, La/oxg;->d:La/oxg;

    .line 871
    .line 872
    const/4 v10, 0x2

    .line 873
    aput-object v6, v2, v10

    .line 874
    .line 875
    sget-object v6, La/pug;->d:La/pug;

    .line 876
    .line 877
    aput-object v6, v2, v4

    .line 878
    .line 879
    sget-object v4, La/yvg;->d:La/yvg;

    .line 880
    .line 881
    aput-object v4, v2, v3

    .line 882
    .line 883
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    new-instance v3, Ljava/util/ArrayList;

    .line 888
    .line 889
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 890
    .line 891
    .line 892
    move-result v4

    .line 893
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 894
    .line 895
    .line 896
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    if-eqz v4, :cond_19

    .line 905
    .line 906
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v4

    .line 910
    check-cast v4, La/yxg;

    .line 911
    .line 912
    iget-wide v4, v4, La/yxg;->a:J

    .line 913
    .line 914
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 915
    .line 916
    .line 917
    move-result-object v4

    .line 918
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 919
    .line 920
    .line 921
    goto :goto_5

    .line 922
    :cond_19
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v2

    .line 926
    check-cast v2, La/ihz;

    .line 927
    .line 928
    iget-wide v4, v2, La/ihz;->b:J

    .line 929
    .line 930
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v2

    .line 938
    if-eqz v2, :cond_1a

    .line 939
    .line 940
    iget-boolean v2, v1, La/ifz;->c:Z

    .line 941
    .line 942
    if-eqz v2, :cond_1a

    .line 943
    .line 944
    sget-object v2, La/r1g;->w:La/r1g;

    .line 945
    .line 946
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v3

    .line 950
    check-cast v3, La/ihz;

    .line 951
    .line 952
    iget-object v3, v3, La/ihz;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 953
    .line 954
    iget-wide v3, v3, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->b:J

    .line 955
    .line 956
    iget-object v5, v0, La/eiz;->x:La/ih5;

    .line 957
    .line 958
    invoke-virtual {v5, v2, v3, v4}, La/ih5;->p(La/r1g;J)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    check-cast v2, La/ihz;

    .line 966
    .line 967
    iget-object v2, v2, La/ihz;->a:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 968
    .line 969
    iget-wide v2, v2, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->b:J

    .line 970
    .line 971
    iget-object v4, v0, La/eiz;->y:La/zr1;

    .line 972
    .line 973
    const-string v5, "cyber_leaderboard"

    .line 974
    .line 975
    invoke-virtual {v4, v2, v3, v5}, La/zr1;->z(JLjava/lang/String;)V

    .line 976
    .line 977
    .line 978
    iget-wide v11, v1, La/ifz;->a:J

    .line 979
    .line 980
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    check-cast v0, La/ihz;

    .line 985
    .line 986
    iget-wide v9, v0, La/ihz;->b:J

    .line 987
    .line 988
    iget-object v13, v1, La/ifz;->b:Ljava/lang/String;

    .line 989
    .line 990
    sget-object v14, La/k1g;->b:La/k1g;

    .line 991
    .line 992
    move-object v8, v7

    .line 993
    check-cast v8, La/uzg;

    .line 994
    .line 995
    invoke-virtual/range {v8 .. v14}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 996
    .line 997
    .line 998
    return-void

    .line 999
    :cond_1a
    new-instance v1, La/dhz;

    .line 1000
    .line 1001
    new-array v2, v8, [Ljava/lang/Object;

    .line 1002
    .line 1003
    iget-object v3, v9, La/ctf0;->b:La/lsm0;

    .line 1004
    .line 1005
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    const v4, 0x7f131302

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    invoke-direct {v1, v2}, La/dhz;-><init>(Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1020
    .line 1021
    .line 1022
    return-void

    .line 1023
    :cond_1b
    instance-of v0, v1, La/mfz;

    .line 1024
    .line 1025
    if-eqz v0, :cond_1d

    .line 1026
    .line 1027
    iget-object v0, v11, La/ocj;->a:La/p7m0;

    .line 1028
    .line 1029
    :cond_1c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v1

    .line 1033
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1034
    .line 1035
    .line 1036
    move-object v11, v1

    .line 1037
    check-cast v11, La/ihz;

    .line 1038
    .line 1039
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    const/16 v28, 0x0

    .line 1043
    .line 1044
    const v29, 0x1bfff

    .line 1045
    .line 1046
    .line 1047
    const-wide/16 v12, 0x0

    .line 1048
    .line 1049
    const/4 v14, 0x0

    .line 1050
    const/4 v15, 0x0

    .line 1051
    const/16 v16, 0x0

    .line 1052
    .line 1053
    const/16 v17, 0x0

    .line 1054
    .line 1055
    const/16 v18, 0x0

    .line 1056
    .line 1057
    const/16 v19, 0x0

    .line 1058
    .line 1059
    const/16 v20, 0x0

    .line 1060
    .line 1061
    const/16 v21, 0x0

    .line 1062
    .line 1063
    const/16 v22, 0x0

    .line 1064
    .line 1065
    const/16 v23, 0x0

    .line 1066
    .line 1067
    const/16 v24, 0x0

    .line 1068
    .line 1069
    const/16 v25, 0x0

    .line 1070
    .line 1071
    const/16 v26, 0x0

    .line 1072
    .line 1073
    const/16 v27, 0x0

    .line 1074
    .line 1075
    invoke-static/range {v11 .. v29}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v2

    .line 1079
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1080
    .line 1081
    .line 1082
    move-result v1

    .line 1083
    if-eqz v1, :cond_1c

    .line 1084
    .line 1085
    return-void

    .line 1086
    :cond_1d
    invoke-static {}, La/t9f;->b()V

    .line 1087
    .line 1088
    .line 1089
    return-void

    .line 1090
    :cond_1e
    instance-of v2, v1, La/efz;

    .line 1091
    .line 1092
    if-eqz v2, :cond_25

    .line 1093
    .line 1094
    check-cast v1, La/efz;

    .line 1095
    .line 1096
    sget-object v2, La/bfz;->a:La/bfz;

    .line 1097
    .line 1098
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v2

    .line 1102
    if-eqz v2, :cond_1f

    .line 1103
    .line 1104
    invoke-virtual {v0}, La/i3t0;->E()V

    .line 1105
    .line 1106
    .line 1107
    return-void

    .line 1108
    :cond_1f
    sget-object v2, La/cfz;->a:La/cfz;

    .line 1109
    .line 1110
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v2

    .line 1114
    if-eqz v2, :cond_23

    .line 1115
    .line 1116
    iget-object v1, v0, La/eiz;->A:La/bby;

    .line 1117
    .line 1118
    if-eqz v1, :cond_20

    .line 1119
    .line 1120
    invoke-interface {v1, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1121
    .line 1122
    .line 1123
    :cond_20
    iget-object v1, v0, La/eiz;->C:La/bby;

    .line 1124
    .line 1125
    if-eqz v1, :cond_21

    .line 1126
    .line 1127
    invoke-interface {v1, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1128
    .line 1129
    .line 1130
    :cond_21
    iget-object v0, v0, La/eiz;->B:La/bby;

    .line 1131
    .line 1132
    if-eqz v0, :cond_22

    .line 1133
    .line 1134
    invoke-interface {v0, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1135
    .line 1136
    .line 1137
    :cond_22
    return-void

    .line 1138
    :cond_23
    sget-object v2, La/dfz;->a:La/dfz;

    .line 1139
    .line 1140
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v1

    .line 1144
    if-eqz v1, :cond_24

    .line 1145
    .line 1146
    iget-object v1, v0, La/eiz;->z:La/c4m0;

    .line 1147
    .line 1148
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 1149
    .line 1150
    .line 1151
    iget-object v1, v0, La/eiz;->p:La/m1e;

    .line 1152
    .line 1153
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    new-instance v2, La/slx;

    .line 1158
    .line 1159
    invoke-direct {v2, v0, v6, v5}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1160
    .line 1161
    .line 1162
    new-instance v5, La/fnq;

    .line 1163
    .line 1164
    invoke-direct {v5, v1, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1165
    .line 1166
    .line 1167
    invoke-static {v0, v5, v6, v6, v4}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    iput-object v1, v0, La/eiz;->z:La/c4m0;

    .line 1172
    .line 1173
    return-void

    .line 1174
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1175
    .line 1176
    .line 1177
    return-void

    .line 1178
    :cond_25
    invoke-static {}, La/t9f;->b()V

    .line 1179
    .line 1180
    .line 1181
    return-void
.end method
