.class public final La/atk;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic J:I


# instance fields
.field public final A:La/nv20;

.field public final B:La/ivn;

.field public final C:La/oeg0;

.field public D:La/bby;

.field public E:La/bby;

.field public F:La/bby;

.field public G:J

.field public final H:La/n0o0;

.field public final I:La/n0o0;

.field public final o:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

.field public final p:La/hzg;

.field public final q:La/mne;

.field public final r:La/hjd;

.field public final s:La/ctf0;

.field public final t:La/duj;

.field public final u:La/pmi0;

.field public final v:La/ugf0;

.field public final w:La/luu;

.field public final x:La/ih5;

.field public final y:La/zr1;

.field public final z:La/fvt0;


# direct methods
.method public constructor <init>(La/vzg0;La/v5u;La/q5u;Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;La/pru;La/hzg;La/mne;La/g2v;La/y78;La/hjd;La/ctf0;La/duj;La/pmi0;La/ugf0;La/svu;La/r9u;La/lbu;La/luu;La/ih5;La/zr1;La/fvt0;La/nv20;La/ivn;La/oeg0;)V
    .locals 10

    .line 1
    move-object/from16 p1, p7

    .line 2
    .line 3
    move-object/from16 v0, p11

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p24 .. p24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v1, p1, La/mne;->a:La/rwj;

    .line 15
    .line 16
    invoke-static {v1, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, La/co0;

    .line 21
    .line 22
    const/4 v9, 0x3

    .line 23
    move-object v3, p4

    .line 24
    move-object v4, p5

    .line 25
    move-object/from16 v6, p15

    .line 26
    .line 27
    move-object/from16 v8, p16

    .line 28
    .line 29
    move-object/from16 v7, p17

    .line 30
    .line 31
    move-object/from16 v5, p18

    .line 32
    .line 33
    invoke-direct/range {v2 .. v9}, La/co0;-><init>(Landroid/os/Parcelable;La/pru;La/luu;La/svu;La/lbu;La/r9u;B)V

    .line 34
    .line 35
    .line 36
    new-instance v4, La/mlb;

    .line 37
    .line 38
    const/4 v5, 0x2

    .line 39
    move-object/from16 v6, p8

    .line 40
    .line 41
    move-object/from16 v7, p9

    .line 42
    .line 43
    invoke-direct {v4, v0, v6, v7, v5}, La/mlb;-><init>(La/ctf0;La/g2v;La/y78;B)V

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-direct {p0, v2, v1, v4, v6}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 48
    .line 49
    .line 50
    iput-object p4, p0, La/atk;->o:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 51
    .line 52
    move-object/from16 p4, p6

    .line 53
    .line 54
    iput-object p4, p0, La/atk;->p:La/hzg;

    .line 55
    .line 56
    iput-object p1, p0, La/atk;->q:La/mne;

    .line 57
    .line 58
    move-object/from16 p1, p10

    .line 59
    .line 60
    iput-object p1, p0, La/atk;->r:La/hjd;

    .line 61
    .line 62
    iput-object v0, p0, La/atk;->s:La/ctf0;

    .line 63
    .line 64
    move-object/from16 p1, p12

    .line 65
    .line 66
    iput-object p1, p0, La/atk;->t:La/duj;

    .line 67
    .line 68
    move-object/from16 p1, p13

    .line 69
    .line 70
    iput-object p1, p0, La/atk;->u:La/pmi0;

    .line 71
    .line 72
    move-object/from16 p1, p14

    .line 73
    .line 74
    iput-object p1, p0, La/atk;->v:La/ugf0;

    .line 75
    .line 76
    move-object/from16 p1, p18

    .line 77
    .line 78
    iput-object p1, p0, La/atk;->w:La/luu;

    .line 79
    .line 80
    move-object/from16 p1, p19

    .line 81
    .line 82
    iput-object p1, p0, La/atk;->x:La/ih5;

    .line 83
    .line 84
    move-object/from16 p1, p20

    .line 85
    .line 86
    iput-object p1, p0, La/atk;->y:La/zr1;

    .line 87
    .line 88
    move-object/from16 p1, p21

    .line 89
    .line 90
    iput-object p1, p0, La/atk;->z:La/fvt0;

    .line 91
    .line 92
    move-object/from16 p1, p22

    .line 93
    .line 94
    iput-object p1, p0, La/atk;->A:La/nv20;

    .line 95
    .line 96
    move-object/from16 p1, p23

    .line 97
    .line 98
    iput-object p1, p0, La/atk;->B:La/ivn;

    .line 99
    .line 100
    move-object/from16 p1, p24

    .line 101
    .line 102
    iput-object p1, p0, La/atk;->C:La/oeg0;

    .line 103
    .line 104
    new-instance p1, La/lrk;

    .line 105
    .line 106
    invoke-direct {p1, p2, p0, v5}, La/lrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iput-object p1, p0, La/atk;->H:La/n0o0;

    .line 114
    .line 115
    new-instance p1, La/lrk;

    .line 116
    .line 117
    const/4 p2, 0x3

    .line 118
    invoke-direct {p1, p3, p0, p2}, La/lrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iput-object p1, p0, La/atk;->I:La/n0o0;

    .line 126
    .line 127
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance p3, La/vsk;

    .line 132
    .line 133
    invoke-direct {p3, p0, v6}, La/vsk;-><init>(La/atk;La/yje;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1, v6, v6, p3, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 137
    .line 138
    .line 139
    new-instance p1, La/pn;

    .line 140
    .line 141
    const/16 p3, 0x18

    .line 142
    .line 143
    invoke-direct {p1, p0, v6, p3}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 144
    .line 145
    .line 146
    invoke-static {p0, v6, v6, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 147
    .line 148
    .line 149
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/ksk;

    .line 6
    .line 7
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 8
    .line 9
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 10
    .line 11
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 12
    .line 13
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->e(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, La/atk;->y:La/zr1;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/zr1;->e(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/ksk;

    .line 27
    .line 28
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 29
    .line 30
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 31
    .line 32
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x1

    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    iget-object v4, p0, La/atk;->I:La/n0o0;

    .line 42
    .line 43
    if-eqz v0, :cond_6

    .line 44
    .line 45
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/ise0;

    .line 50
    .line 51
    iget-object v0, v0, La/ise0;->a:La/xae0;

    .line 52
    .line 53
    iget-object v0, v0, La/xae0;->a:La/n7m0;

    .line 54
    .line 55
    invoke-interface {v0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/j0g0;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 64
    .line 65
    instance-of v4, v0, La/g0g0;

    .line 66
    .line 67
    if-eqz v4, :cond_0

    .line 68
    .line 69
    move-object v0, v3

    .line 70
    :cond_0
    check-cast v0, La/kuk;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-object v0, v3

    .line 74
    :goto_0
    if-eqz v0, :cond_5

    .line 75
    .line 76
    iget-object v0, v0, La/kuk;->j:Ljava/lang/Object;

    .line 77
    .line 78
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 79
    .line 80
    instance-of v4, v0, La/g0g0;

    .line 81
    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move-object v3, v0

    .line 86
    :goto_1
    check-cast v3, Ljava/util/List;

    .line 87
    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, La/xah;

    .line 112
    .line 113
    iget-boolean v3, v3, La/xah;->n:Z

    .line 114
    .line 115
    if-eqz v3, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    :goto_2
    move v1, v2

    .line 119
    :goto_3
    move v7, v1

    .line 120
    goto :goto_6

    .line 121
    :cond_6
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, La/ise0;

    .line 126
    .line 127
    iget-object v0, v0, La/ise0;->a:La/xae0;

    .line 128
    .line 129
    iget-object v0, v0, La/xae0;->a:La/n7m0;

    .line 130
    .line 131
    invoke-interface {v0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, La/j0g0;

    .line 136
    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 140
    .line 141
    instance-of v4, v0, La/g0g0;

    .line 142
    .line 143
    if-eqz v4, :cond_7

    .line 144
    .line 145
    move-object v0, v3

    .line 146
    :cond_7
    check-cast v0, La/kuk;

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    move-object v0, v3

    .line 150
    :goto_4
    if-eqz v0, :cond_5

    .line 151
    .line 152
    iget-object v0, v0, La/kuk;->a:La/j0g0;

    .line 153
    .line 154
    if-eqz v0, :cond_5

    .line 155
    .line 156
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 157
    .line 158
    instance-of v4, v0, La/g0g0;

    .line 159
    .line 160
    if-eqz v4, :cond_9

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_9
    move-object v3, v0

    .line 164
    :goto_5
    check-cast v3, Ljava/util/List;

    .line 165
    .line 166
    if-eqz v3, :cond_5

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    xor-int/2addr v0, v1

    .line 173
    if-ne v0, v1, :cond_5

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :goto_6
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, La/ksk;

    .line 181
    .line 182
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 183
    .line 184
    iget-wide v4, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 185
    .line 186
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, La/ksk;

    .line 191
    .line 192
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 193
    .line 194
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 195
    .line 196
    iget-byte v3, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 197
    .line 198
    sget-object v6, La/iun;->a:La/iun;

    .line 199
    .line 200
    iget-object p0, p0, La/atk;->p:La/hzg;

    .line 201
    .line 202
    move-object v2, p0

    .line 203
    check-cast v2, La/uzg;

    .line 204
    .line 205
    invoke-virtual/range {v2 .. v7}, La/uzg;->k(IJLjava/util/List;Z)V

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public final N()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/ksk;

    .line 6
    .line 7
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 8
    .line 9
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 10
    .line 11
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-wide/16 v2, 0x28

    .line 20
    .line 21
    :goto_0
    move-wide v6, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/ksk;

    .line 28
    .line 29
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 30
    .line 31
    iget-wide v2, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/ksk;

    .line 39
    .line 40
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 41
    .line 42
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/ksk;

    .line 55
    .line 56
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 57
    .line 58
    iget-wide v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 59
    .line 60
    :goto_2
    move-wide v8, v0

    .line 61
    goto :goto_3

    .line 62
    :cond_1
    const-wide/16 v0, -0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :goto_3
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/ksk;

    .line 70
    .line 71
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 72
    .line 73
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 74
    .line 75
    iget-byte v5, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    iget-object p0, p0, La/atk;->p:La/hzg;

    .line 79
    .line 80
    move-object v4, p0

    .line 81
    check-cast v4, La/uzg;

    .line 82
    .line 83
    invoke-virtual/range {v4 .. v10}, La/uzg;->e(IJJZ)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final O()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/ksk;

    .line 6
    .line 7
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 8
    .line 9
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 10
    .line 11
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-wide/16 v2, 0x28

    .line 20
    .line 21
    :goto_0
    move-wide v6, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/ksk;

    .line 28
    .line 29
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 30
    .line 31
    iget-wide v2, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/ksk;

    .line 39
    .line 40
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 41
    .line 42
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/ksk;

    .line 55
    .line 56
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 57
    .line 58
    iget-wide v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 59
    .line 60
    :goto_2
    move-wide v8, v0

    .line 61
    goto :goto_3

    .line 62
    :cond_1
    const-wide/16 v0, -0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :goto_3
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, La/ksk;

    .line 70
    .line 71
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 72
    .line 73
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 74
    .line 75
    iget-byte v5, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 76
    .line 77
    const/4 v10, 0x1

    .line 78
    iget-object p0, p0, La/atk;->p:La/hzg;

    .line 79
    .line 80
    move-object v4, p0

    .line 81
    check-cast v4, La/uzg;

    .line 82
    .line 83
    invoke-virtual/range {v4 .. v10}, La/uzg;->e(IJJZ)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final P()V
    .locals 10

    .line 1
    iget-object v0, p0, La/atk;->o:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 2
    .line 3
    iget-wide v1, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 4
    .line 5
    iget-object v3, p0, La/atk;->x:La/ih5;

    .line 6
    .line 7
    iget-object v3, v3, La/ih5;->a:La/kt2;

    .line 8
    .line 9
    new-instance v4, La/jo20;

    .line 10
    .line 11
    invoke-direct {v4}, La/jo20;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v5, "sport_id"

    .line 15
    .line 16
    const-wide/16 v6, 0x28

    .line 17
    .line 18
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    invoke-virtual {v4, v5, v8}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    const-wide/16 v8, -0x1

    .line 26
    .line 27
    cmp-long v5, v1, v8

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    const-string v5, "sub_sport_id"

    .line 32
    .line 33
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v4, v5, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v4}, La/jo20;->b()La/jo20;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "cyber_teams_all_call"

    .line 45
    .line 46
    invoke-interface {v3, v2, v1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 47
    .line 48
    .line 49
    iget-wide v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 50
    .line 51
    iget-object v2, p0, La/atk;->y:La/zr1;

    .line 52
    .line 53
    iget-object v2, v2, La/zr1;->a:La/s1p;

    .line 54
    .line 55
    new-instance v3, La/yni0;

    .line 56
    .line 57
    invoke-direct {v3}, La/yni0;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/i1p;

    .line 61
    .line 62
    const/4 v5, 0x2

    .line 63
    invoke-direct {v4, v5, v6, v7}, La/i1p;-><init>(BJ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v4}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    cmp-long v4, v0, v8

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    new-instance v4, La/i1p;

    .line 75
    .line 76
    invoke-direct {v4, v5, v0, v1}, La/i1p;-><init>(BJ)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v4}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-static {v3}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-wide/16 v3, 0x2ef7

    .line 87
    .line 88
    invoke-virtual {v2, v0, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

    .line 92
    .line 93
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/ksk;

    .line 98
    .line 99
    iget-object v1, v1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 100
    .line 101
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 102
    .line 103
    invoke-direct {v0, v1, v2}, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;-><init>(J)V

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, La/atk;->p:La/hzg;

    .line 107
    .line 108
    check-cast p0, La/uzg;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, La/uzg;->a:La/oeg0;

    .line 114
    .line 115
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget-object p0, p0, La/uzg;->b:La/vqc;

    .line 124
    .line 125
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$activeTeamsListScreen$1;

    .line 126
    .line 127
    invoke-direct {v3, p0, v0}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$activeTeamsListScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 131
    .line 132
    .line 133
    iget-object p0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 134
    .line 135
    invoke-static {v1, p0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_0
    move-object v0, p0

    .line 140
    check-cast v0, La/paw;

    .line 141
    .line 142
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_2

    .line 147
    .line 148
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, La/oe50;

    .line 153
    .line 154
    invoke-virtual {v1, v0}, La/i1w0;->a(La/oe50;)V

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_2
    return-void
.end method

.method public final Q()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/ksk;

    .line 6
    .line 7
    iget-object v0, v0, La/ksk;->c:La/j0g0;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v1, v0, La/g0g0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :cond_0
    check-cast v0, La/jtk;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, La/jtk;->c:La/itk;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget-object v1, La/i1g;->b:La/i1g;

    .line 27
    .line 28
    iget-object v1, p0, La/atk;->y:La/zr1;

    .line 29
    .line 30
    const-string v2, "calendar"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, La/zr1;->f(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/atk;->x:La/ih5;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, La/ih5;->h(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 41
    .line 42
    iget-object v2, v0, La/itk;->b:Ljava/util/List;

    .line 43
    .line 44
    iget v3, v0, La/itk;->c:I

    .line 45
    .line 46
    iget v0, v0, La/itk;->d:I

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-direct {v1, v3, v0, v2, v4}, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;-><init>(IILjava/util/List;Z)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/atk;->p:La/hzg;

    .line 53
    .line 54
    check-cast p0, La/uzg;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, La/uzg;->b(Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final R(La/wok;)V
    .locals 8

    .line 1
    instance-of v0, p1, La/uok;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    iget-object v4, p0, La/atk;->r:La/hjd;

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    new-instance v0, La/did;

    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, La/ksk;

    .line 18
    .line 19
    iget-object v6, v6, La/ksk;->d:La/j0g0;

    .line 20
    .line 21
    if-eqz v6, :cond_1

    .line 22
    .line 23
    iget-object v6, v6, La/j0g0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    instance-of v7, v6, La/g0g0;

    .line 26
    .line 27
    if-eqz v7, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v5, v6

    .line 31
    :goto_0
    check-cast v5, La/kuk;

    .line 32
    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    invoke-static {v5}, La/hic;->w(La/kuk;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    sget-object v5, La/iun;->a:La/iun;

    .line 41
    .line 42
    :goto_1
    invoke-direct {v0, v5}, La/did;-><init>(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    check-cast p1, La/uok;

    .line 46
    .line 47
    iget-object p1, p1, La/uok;->a:La/uid;

    .line 48
    .line 49
    new-array v3, v3, [La/vid;

    .line 50
    .line 51
    aput-object v0, v3, v2

    .line 52
    .line 53
    aput-object p1, v3, v1

    .line 54
    .line 55
    invoke-static {p0, v4, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    instance-of v0, p1, La/vok;

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    new-instance v0, La/did;

    .line 64
    .line 65
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, La/ksk;

    .line 70
    .line 71
    iget-object v6, v6, La/ksk;->d:La/j0g0;

    .line 72
    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    iget-object v6, v6, La/j0g0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    instance-of v7, v6, La/g0g0;

    .line 78
    .line 79
    if-eqz v7, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    move-object v5, v6

    .line 83
    :goto_2
    check-cast v5, La/kuk;

    .line 84
    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    invoke-static {v5}, La/hic;->w(La/kuk;)Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    sget-object v5, La/iun;->a:La/iun;

    .line 93
    .line 94
    :goto_3
    invoke-direct {v0, v5}, La/did;-><init>(Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    check-cast p1, La/vok;

    .line 98
    .line 99
    iget-object p1, p1, La/vok;->a:La/bem;

    .line 100
    .line 101
    invoke-static {p1}, La/ebc;->n0(La/bem;)La/uid;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-array v3, v3, [La/vid;

    .line 106
    .line 107
    aput-object v0, v3, v2

    .line 108
    .line 109
    aput-object p1, v3, v1

    .line 110
    .line 111
    invoke-static {p0, v4, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final S(Z)V
    .locals 7

    .line 1
    sget-object v0, La/i1g;->b:La/i1g;

    .line 2
    .line 3
    iget-object v0, p0, La/atk;->y:La/zr1;

    .line 4
    .line 5
    const-string v1, "leaderboard"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/zr1;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/atk;->x:La/ih5;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, La/ih5;->h(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/ksk;

    .line 20
    .line 21
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 22
    .line 23
    iget-wide v3, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, La/atk;->o:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 28
    .line 29
    iget-wide v0, p1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 30
    .line 31
    const-wide/16 v5, 0x2e

    .line 32
    .line 33
    cmp-long p1, v0, v5

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    sget-object p1, La/ggz;->b:La/ggz;

    .line 38
    .line 39
    :goto_0
    move-object v5, p1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    sget-object p1, La/ggz;->a:La/ggz;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :goto_1
    iget-object p0, p0, La/atk;->p:La/hzg;

    .line 45
    .line 46
    move-object v2, p0

    .line 47
    check-cast v2, La/uzg;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object p0, v2, La/uzg;->a:La/oeg0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v1, La/mz0;

    .line 59
    .line 60
    const/16 v6, 0xb

    .line 61
    .line 62
    invoke-direct/range {v1 .. v6}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final T()V
    .locals 9

    .line 1
    sget-object v0, La/i1g;->b:La/i1g;

    .line 2
    .line 3
    iget-object v0, p0, La/atk;->y:La/zr1;

    .line 4
    .line 5
    const-string v1, "results_match"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/zr1;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/atk;->x:La/ih5;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, La/ih5;->h(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/ksk;

    .line 20
    .line 21
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 22
    .line 23
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 24
    .line 25
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, La/atk;->p:La/hzg;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, La/ksk;

    .line 40
    .line 41
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 42
    .line 43
    iget-wide v6, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 44
    .line 45
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, La/ksk;

    .line 50
    .line 51
    iget-object p0, p0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 52
    .line 53
    iget-object p0, p0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 54
    .line 55
    iget-byte v8, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 56
    .line 57
    move-object v3, v1

    .line 58
    check-cast v3, La/uzg;

    .line 59
    .line 60
    iget-object p0, v3, La/uzg;->a:La/oeg0;

    .line 61
    .line 62
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    new-instance v2, La/ozg;

    .line 67
    .line 68
    const-wide/16 v4, 0x28

    .line 69
    .line 70
    invoke-direct/range {v2 .. v8}, La/ozg;-><init>(La/uzg;JJI)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, La/ksk;

    .line 82
    .line 83
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 84
    .line 85
    iget-wide v4, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 86
    .line 87
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/ksk;

    .line 92
    .line 93
    iget-object p0, p0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 94
    .line 95
    iget-object p0, p0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 96
    .line 97
    iget-byte v8, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 98
    .line 99
    move-object v3, v1

    .line 100
    check-cast v3, La/uzg;

    .line 101
    .line 102
    iget-object p0, v3, La/uzg;->a:La/oeg0;

    .line 103
    .line 104
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    new-instance v2, La/ozg;

    .line 109
    .line 110
    const-wide/16 v6, 0x0

    .line 111
    .line 112
    invoke-direct/range {v2 .. v8}, La/ozg;-><init>(La/uzg;JJI)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final U(Z)V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/ksk;

    .line 6
    .line 7
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 8
    .line 9
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 10
    .line 11
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 12
    .line 13
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->e(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, La/atk;->y:La/zr1;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/zr1;->e(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/ksk;

    .line 27
    .line 28
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 29
    .line 30
    iget-wide v3, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 31
    .line 32
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, La/ksk;

    .line 37
    .line 38
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 39
    .line 40
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 41
    .line 42
    iget-byte v2, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 43
    .line 44
    sget-object v5, La/iun;->a:La/iun;

    .line 45
    .line 46
    iget-object p0, p0, La/atk;->p:La/hzg;

    .line 47
    .line 48
    move-object v1, p0

    .line 49
    check-cast v1, La/uzg;

    .line 50
    .line 51
    move v6, p1

    .line 52
    invoke-virtual/range {v1 .. v6}, La/uzg;->k(IJLjava/util/List;Z)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final V()V
    .locals 5

    .line 1
    sget-object v0, La/i1g;->b:La/i1g;

    .line 2
    .line 3
    iget-object v0, p0, La/atk;->y:La/zr1;

    .line 4
    .line 5
    const-string v1, "transfers"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/zr1;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/atk;->x:La/ih5;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, La/ih5;->h(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/ksk;

    .line 20
    .line 21
    iget-object v0, v0, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 22
    .line 23
    iget-wide v0, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->a:J

    .line 24
    .line 25
    iget-object p0, p0, La/atk;->p:La/hzg;

    .line 26
    .line 27
    check-cast p0, La/uzg;

    .line 28
    .line 29
    iget-object v2, p0, La/uzg;->a:La/oeg0;

    .line 30
    .line 31
    invoke-virtual {v2}, La/oeg0;->c()La/i1w0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v3, La/pzg;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-direct {v3, p0, v0, v1, v4}, La/pzg;-><init>(La/uzg;JB)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final W(La/npn;ZLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/zsk;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/zsk;

    .line 7
    .line 8
    iget v1, v0, La/zsk;->k:I

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
    iput v1, v0, La/zsk;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zsk;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/zsk;-><init>(La/atk;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/zsk;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zsk;->k:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_1

    .line 36
    .line 37
    if-ne v2, v3, :cond_2

    .line 38
    .line 39
    :cond_1
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    if-nez p2, :cond_4

    .line 56
    .line 57
    :try_start_1
    iget-object p2, p0, La/atk;->z:La/fvt0;

    .line 58
    .line 59
    iput v4, v0, La/zsk;->k:I

    .line 60
    .line 61
    invoke-virtual {p2, p1, v0}, La/fvt0;->w(La/npn;La/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v1, :cond_5

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    iget-object p2, p0, La/atk;->A:La/nv20;

    .line 69
    .line 70
    iput v3, v0, La/zsk;->k:I

    .line 71
    .line 72
    invoke-virtual {p2, p1, v0}, La/nv20;->c(La/npn;La/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    if-ne p0, v1, :cond_5

    .line 77
    .line 78
    :goto_1
    return-object v1

    .line 79
    :goto_2
    new-instance p2, La/usk;

    .line 80
    .line 81
    const/4 p3, 0x0

    .line 82
    invoke-direct {p2, p0, p3}, La/usk;-><init>(La/atk;B)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, La/atk;->B:La/ivn;

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 13

    .line 1
    check-cast p1, La/ipk;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/ook;

    .line 10
    .line 11
    iget-object v1, p0, La/atk;->q:La/mne;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    check-cast p1, La/ook;

    .line 18
    .line 19
    sget-object v0, La/lok;->a:La/lok;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    sget-object v0, La/mok;->a:La/mok;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object p1, p0, La/atk;->D:La/bby;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-interface {p1, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object p0, p0, La/atk;->E:La/bby;

    .line 47
    .line 48
    if-eqz p0, :cond_8

    .line 49
    .line 50
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    sget-object v0, La/nok;->a:La/nok;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    iget-object p1, p0, La/atk;->D:La/bby;

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-interface {p1, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 74
    .line 75
    sget-object v5, La/xsk;->a:La/xsk;

    .line 76
    .line 77
    new-instance v8, La/wsk;

    .line 78
    .line 79
    const/4 p1, 0x2

    .line 80
    invoke-direct {v8, p0, v2, p1}, La/wsk;-><init>(La/atk;La/yje;B)V

    .line 81
    .line 82
    .line 83
    const/16 v9, 0xa

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, La/atk;->D:La/bby;

    .line 91
    .line 92
    iget-object p1, p0, La/atk;->E:La/bby;

    .line 93
    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-ne p1, v3, :cond_4

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    iget-object v6, v1, La/mne;->a:La/rwj;

    .line 104
    .line 105
    new-instance v8, La/svj;

    .line 106
    .line 107
    const/16 p1, 0x15

    .line 108
    .line 109
    invoke-direct {v8, p1}, La/svj;-><init>(B)V

    .line 110
    .line 111
    .line 112
    const/16 v9, 0x76

    .line 113
    .line 114
    iget-object v5, p0, La/atk;->r:La/hjd;

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    move-object v4, p0

    .line 118
    invoke-static/range {v4 .. v9}, La/i3t0;->F(La/i3t0;La/j3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iput-object p0, v4, La/atk;->E:La/bby;

    .line 123
    .line 124
    return-void

    .line 125
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_6
    move-object v4, p0

    .line 130
    instance-of p0, p1, La/hpk;

    .line 131
    .line 132
    if-eqz p0, :cond_9

    .line 133
    .line 134
    check-cast p1, La/hpk;

    .line 135
    .line 136
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 137
    .line 138
    .line 139
    move-result-wide v5

    .line 140
    iget-wide v7, v4, La/atk;->G:J

    .line 141
    .line 142
    sub-long v7, v5, v7

    .line 143
    .line 144
    sget-object p0, La/ymx;->b:La/ymx;

    .line 145
    .line 146
    const-wide/16 v9, 0xc8

    .line 147
    .line 148
    cmp-long p0, v7, v9

    .line 149
    .line 150
    if-lez p0, :cond_8

    .line 151
    .line 152
    iget-object p0, v4, La/atk;->F:La/bby;

    .line 153
    .line 154
    if-eqz p0, :cond_7

    .line 155
    .line 156
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    iget-object v10, v1, La/mne;->a:La/rwj;

    .line 164
    .line 165
    new-instance v8, La/usk;

    .line 166
    .line 167
    invoke-direct {v8, v4, v3}, La/usk;-><init>(La/atk;B)V

    .line 168
    .line 169
    .line 170
    new-instance v11, La/e9g;

    .line 171
    .line 172
    const/16 p0, 0x1b

    .line 173
    .line 174
    invoke-direct {v11, p1, v4, v2, p0}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 175
    .line 176
    .line 177
    const/16 v12, 0xa

    .line 178
    .line 179
    const/4 v9, 0x0

    .line 180
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    iput-object p0, v4, La/atk;->F:La/bby;

    .line 185
    .line 186
    iput-wide v5, v4, La/atk;->G:J

    .line 187
    .line 188
    :cond_8
    :goto_0
    return-void

    .line 189
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 190
    .line 191
    .line 192
    return-void
.end method
