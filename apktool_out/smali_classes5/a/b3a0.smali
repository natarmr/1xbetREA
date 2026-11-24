.class public final La/b3a0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final o:Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

.field public final p:La/i1w0;

.field public final q:La/yk50;

.field public final r:La/vpu;

.field public final s:La/g7u;

.field public final t:La/yfu;

.field public final u:La/c4m0;

.field public v:La/c4m0;

.field public final w:La/c4m0;


# direct methods
.method public constructor <init>(La/mne;Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;La/lbu;La/ivn;La/ocl;La/i1w0;La/hbu;La/reu;La/yk50;La/vpu;La/vpu;La/g7u;La/yfu;La/m1e;)V
    .locals 2

    .line 1
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/mne;->a:La/rwj;

    .line 5
    .line 6
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 7
    .line 8
    invoke-static {v0, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, La/qw80;

    .line 13
    .line 14
    const/16 v1, 0xd

    .line 15
    .line 16
    invoke-direct {v0, p4, p3, v1}, La/qw80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance p3, La/ka70;

    .line 20
    .line 21
    const/16 p4, 0x16

    .line 22
    .line 23
    invoke-direct {p3, p2, p5, p4}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    const/4 p4, 0x0

    .line 27
    invoke-direct {p0, v0, p1, p3, p4}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, La/b3a0;->o:Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

    .line 31
    .line 32
    iput-object p6, p0, La/b3a0;->p:La/i1w0;

    .line 33
    .line 34
    iput-object p9, p0, La/b3a0;->q:La/yk50;

    .line 35
    .line 36
    iput-object p10, p0, La/b3a0;->r:La/vpu;

    .line 37
    .line 38
    iput-object p12, p0, La/b3a0;->s:La/g7u;

    .line 39
    .line 40
    iput-object p13, p0, La/b3a0;->t:La/yfu;

    .line 41
    .line 42
    iget-object p1, p0, La/b3a0;->w:La/c4m0;

    .line 43
    .line 44
    const/4 p2, 0x4

    .line 45
    const/4 p3, 0x3

    .line 46
    const/4 p5, 0x1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-ne p1, p5, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface/range {p14 .. p14}, La/m1e;->b()La/gmq;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance p6, La/a3a0;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-direct {p6, p0, p4, v0}, La/a3a0;-><init>(La/b3a0;La/yje;B)V

    .line 64
    .line 65
    .line 66
    new-instance v0, La/fnq;

    .line 67
    .line 68
    invoke-direct {v0, p1, p6, p2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v0, p4, p4, p3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, La/b3a0;->w:La/c4m0;

    .line 76
    .line 77
    :goto_0
    invoke-virtual {p11}, La/vpu;->a()La/fnq;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance p6, La/a3a0;

    .line 82
    .line 83
    invoke-direct {p6, p0, p4, p5}, La/a3a0;-><init>(La/b3a0;La/yje;B)V

    .line 84
    .line 85
    .line 86
    new-instance v0, La/fnq;

    .line 87
    .line 88
    invoke-direct {v0, p1, p6, p2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0, v0, p4, p4, p3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, La/b3a0;->u:La/c4m0;

    .line 95
    .line 96
    if-eqz p1, :cond_1

    .line 97
    .line 98
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-ne p1, p5, :cond_1

    .line 103
    .line 104
    return-void

    .line 105
    :cond_1
    iget-object p1, p7, La/hbu;->a:La/ien;

    .line 106
    .line 107
    iget-object p1, p1, La/ien;->a:La/gen;

    .line 108
    .line 109
    iget-object p1, p1, La/gen;->b:La/qoj0;

    .line 110
    .line 111
    new-instance p2, La/va;

    .line 112
    .line 113
    invoke-direct {p2, p1, v1}, La/va;-><init>(La/qoj0;B)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p8, La/reu;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, La/ien;

    .line 119
    .line 120
    iget-object p1, p1, La/ien;->a:La/gen;

    .line 121
    .line 122
    iget-object p1, p1, La/gen;->b:La/qoj0;

    .line 123
    .line 124
    new-instance p6, La/va;

    .line 125
    .line 126
    const/16 p7, 0xe

    .line 127
    .line 128
    invoke-direct {p6, p1, p7}, La/va;-><init>(La/qoj0;B)V

    .line 129
    .line 130
    .line 131
    new-instance p1, La/wx4;

    .line 132
    .line 133
    const/16 p7, 0x1d

    .line 134
    .line 135
    invoke-direct {p1, p0, p4, p7}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 136
    .line 137
    .line 138
    new-instance p7, La/p6d;

    .line 139
    .line 140
    invoke-direct {p7, p2, p6, p1, p5}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 141
    .line 142
    .line 143
    invoke-static {p0, p7, p4, p4, p3}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iput-object p1, p0, La/b3a0;->u:La/c4m0;

    .line 148
    .line 149
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 13

    .line 1
    iget-object v0, p0, La/b3a0;->v:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, La/b3a0;->o:Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

    .line 10
    .line 11
    iget-boolean v4, v0, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;->c:Z

    .line 12
    .line 13
    iget-wide v5, v0, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;->b:J

    .line 14
    .line 15
    iget-object v0, p0, La/b3a0;->t:La/yfu;

    .line 16
    .line 17
    iget-object v0, v0, La/yfu;->a:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, v0

    .line 20
    check-cast v3, La/fga0;

    .line 21
    .line 22
    iget-object v0, v3, La/fga0;->d:La/rfa0;

    .line 23
    .line 24
    iget-object v0, v0, La/rfa0;->a:La/or30;

    .line 25
    .line 26
    sget-object v2, La/wen;->b:La/uen;

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    const-wide/16 v7, 0x8

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-wide/16 v7, 0x1e

    .line 34
    .line 35
    :goto_0
    sget-object v2, La/bfn;->e:La/bfn;

    .line 36
    .line 37
    invoke-static {v7, v8, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v8

    .line 41
    new-instance v2, La/m92;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    invoke-direct/range {v2 .. v7}, La/m92;-><init>(La/fga0;ZJLa/yje;)V

    .line 45
    .line 46
    .line 47
    const/16 v12, 0xdc

    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    move-object v7, v0

    .line 51
    move-object v11, v2

    .line 52
    invoke-static/range {v7 .. v12}, La/gfx;->R(La/or30;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)La/vsg0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v2, v3, La/fga0;->c:La/mne;

    .line 57
    .line 58
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 59
    .line 60
    invoke-static {v0, v2}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v2, La/s980;

    .line 65
    .line 66
    const/16 v3, 0xf

    .line 67
    .line 68
    invoke-direct {v2, p0, v1, v3}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 69
    .line 70
    .line 71
    new-instance v3, La/fnq;

    .line 72
    .line 73
    const/4 v4, 0x4

    .line 74
    invoke-direct {v3, v0, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 75
    .line 76
    .line 77
    new-instance v0, La/z2a0;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-direct {v0, p0, v2}, La/z2a0;-><init>(La/b3a0;B)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    invoke-static {p0, v3, v1, v0, v2}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, La/b3a0;->v:La/c4m0;

    .line 89
    .line 90
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/w1a0;

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
    instance-of v0, p1, La/p1a0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p1, La/r1a0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iget-object v2, p0, La/b3a0;->p:La/i1w0;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, La/c8d;

    .line 29
    .line 30
    sget-object v0, La/y7d;->a:La/v7d;

    .line 31
    .line 32
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 33
    .line 34
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    move-object p1, p0

    .line 42
    check-cast p1, La/paw;

    .line 43
    .line 44
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_8

    .line 49
    .line 50
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, La/oe50;

    .line 55
    .line 56
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    instance-of v0, p1, La/t1a0;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    iget-object p1, p0, La/b3a0;->q:La/yk50;

    .line 65
    .line 66
    invoke-virtual {p1}, La/yk50;->g()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    new-instance p1, La/epp;

    .line 73
    .line 74
    const/16 v0, 0x15

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-direct {p1, p0, v1, v0}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    invoke-static {p0, v1, v1, p1, v0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    new-instance p1, La/z2a0;

    .line 86
    .line 87
    const/4 v0, 0x1

    .line 88
    invoke-direct {p1, p0, v0}, La/z2a0;-><init>(La/b3a0;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    instance-of v0, p1, La/v1a0;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    new-instance v0, La/h2a0;

    .line 100
    .line 101
    check-cast p1, La/v1a0;

    .line 102
    .line 103
    iget-object p1, p1, La/v1a0;->a:La/wdn;

    .line 104
    .line 105
    invoke-direct {v0, p1}, La/h2a0;-><init>(La/wdn;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_4
    instance-of v0, p1, La/s1a0;

    .line 113
    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    check-cast p1, La/s1a0;

    .line 117
    .line 118
    iget-wide v0, p1, La/s1a0;->a:J

    .line 119
    .line 120
    new-instance p1, La/m2a0;

    .line 121
    .line 122
    invoke-direct {p1, v0, v1}, La/m2a0;-><init>(J)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_5
    instance-of v0, p1, La/u1a0;

    .line 130
    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 134
    .line 135
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 136
    .line 137
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-object v1, p1

    .line 145
    check-cast v1, La/p2a0;

    .line 146
    .line 147
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    const/4 v5, 0x0

    .line 153
    const/16 v6, 0x1f

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    const/4 v3, 0x0

    .line 157
    const/4 v4, 0x0

    .line 158
    invoke-static/range {v1 .. v6}, La/p2a0;->a(La/p2a0;ZLjava/util/List;Ljava/util/List;ZI)La/p2a0;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_6

    .line 167
    .line 168
    invoke-virtual {p0}, La/b3a0;->M()V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_7
    instance-of p0, p1, La/q1a0;

    .line 173
    .line 174
    if-eqz p0, :cond_9

    .line 175
    .line 176
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    new-instance p1, La/c8d;

    .line 181
    .line 182
    sget-object v0, La/y7d;->a:La/v7d;

    .line 183
    .line 184
    sget-object v3, La/u0w0;->a:La/u0w0;

    .line 185
    .line 186
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 187
    .line 188
    .line 189
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    :goto_1
    move-object p1, p0

    .line 194
    check-cast p1, La/paw;

    .line 195
    .line 196
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_8

    .line 201
    .line 202
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    check-cast p1, La/oe50;

    .line 207
    .line 208
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_8
    return-void

    .line 213
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 214
    .line 215
    .line 216
    return-void
.end method
