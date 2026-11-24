.class public final La/d6a0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic C:I


# instance fields
.field public final A:La/c4m0;

.field public B:La/bby;

.field public final o:La/fhj;

.field public final p:La/f4u;

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:J

.field public final t:La/i1w0;

.field public final u:La/duj;

.field public final v:La/mne;

.field public final w:La/bzs0;

.field public final x:La/oaa0;

.field public final y:La/yo4;

.field public final z:La/zr1;


# direct methods
.method public constructor <init>(La/ctf0;La/fhj;La/f4u;La/wyu;Ljava/lang/String;Ljava/lang/String;JLa/i1w0;La/duj;La/m1e;La/ocl;La/mne;La/uyu;La/bzs0;La/oaa0;La/yo4;La/zr1;)V
    .locals 9

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, La/fkm;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    move-object v5, p2

    .line 16
    move-object v7, p4

    .line 17
    move-object v6, p5

    .line 18
    move-wide/from16 v3, p7

    .line 19
    .line 20
    move-object/from16 v8, p16

    .line 21
    .line 22
    invoke-direct/range {v1 .. v8}, La/fkm;-><init>(BJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, La/cz;

    .line 26
    .line 27
    const/16 v2, 0x1a

    .line 28
    .line 29
    move-object/from16 v5, p12

    .line 30
    .line 31
    invoke-direct {v4, v5, p1, v2}, La/cz;-><init>(La/ocl;La/ctf0;B)V

    .line 32
    .line 33
    .line 34
    iget-object v7, v0, La/mne;->a:La/rwj;

    .line 35
    .line 36
    invoke-static {v7, v7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    move-object v3, v1

    .line 43
    move-object v1, p0

    .line 44
    invoke-direct/range {v1 .. v6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, La/d6a0;->o:La/fhj;

    .line 48
    .line 49
    iput-object p3, p0, La/d6a0;->p:La/f4u;

    .line 50
    .line 51
    iput-object p5, p0, La/d6a0;->q:Ljava/lang/String;

    .line 52
    .line 53
    iput-object p6, p0, La/d6a0;->r:Ljava/lang/String;

    .line 54
    .line 55
    move-wide/from16 v3, p7

    .line 56
    .line 57
    iput-wide v3, p0, La/d6a0;->s:J

    .line 58
    .line 59
    move-object/from16 v2, p9

    .line 60
    .line 61
    iput-object v2, p0, La/d6a0;->t:La/i1w0;

    .line 62
    .line 63
    move-object/from16 v2, p10

    .line 64
    .line 65
    iput-object v2, p0, La/d6a0;->u:La/duj;

    .line 66
    .line 67
    iput-object v0, p0, La/d6a0;->v:La/mne;

    .line 68
    .line 69
    move-object/from16 v0, p15

    .line 70
    .line 71
    iput-object v0, p0, La/d6a0;->w:La/bzs0;

    .line 72
    .line 73
    iput-object v8, p0, La/d6a0;->x:La/oaa0;

    .line 74
    .line 75
    move-object/from16 v0, p17

    .line 76
    .line 77
    iput-object v0, p0, La/d6a0;->y:La/yo4;

    .line 78
    .line 79
    move-object/from16 v0, p18

    .line 80
    .line 81
    iput-object v0, p0, La/d6a0;->z:La/zr1;

    .line 82
    .line 83
    move-object/from16 v0, p14

    .line 84
    .line 85
    iget-object v0, v0, La/uyu;->a:La/v6j0;

    .line 86
    .line 87
    invoke-virtual {v0}, La/v6j0;->h()La/qz40;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v2, La/b6a0;

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    const/4 v4, 0x1

    .line 95
    invoke-direct {v2, p0, v3, v4}, La/b6a0;-><init>(La/d6a0;La/yje;B)V

    .line 96
    .line 97
    .line 98
    new-instance v5, La/fnq;

    .line 99
    .line 100
    const/4 v6, 0x4

    .line 101
    invoke-direct {v5, v0, v2, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sget-object v2, La/c6a0;->h:La/c6a0;

    .line 113
    .line 114
    invoke-static {v5, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, La/d6a0;->A:La/c4m0;

    .line 118
    .line 119
    if-eqz v0, :cond_0

    .line 120
    .line 121
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-ne v0, v4, :cond_0

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_0
    invoke-interface/range {p11 .. p11}, La/m1e;->b()La/gmq;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v2, La/a6a0;

    .line 133
    .line 134
    invoke-direct {v2, p0, v3, v4}, La/a6a0;-><init>(La/d6a0;La/yje;B)V

    .line 135
    .line 136
    .line 137
    new-instance v4, La/fnq;

    .line 138
    .line 139
    invoke-direct {v4, v0, v2, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    new-instance v2, La/b6a0;

    .line 151
    .line 152
    const/4 v5, 0x0

    .line 153
    invoke-direct {v2, p0, v3, v5}, La/b6a0;-><init>(La/d6a0;La/yje;B)V

    .line 154
    .line 155
    .line 156
    invoke-static {v4, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iput-object v0, p0, La/d6a0;->A:La/c4m0;

    .line 161
    .line 162
    :goto_0
    invoke-virtual {p0}, La/d6a0;->M()V

    .line 163
    .line 164
    .line 165
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 9

    .line 1
    iget-object v0, p0, La/d6a0;->B:La/bby;

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
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 14
    .line 15
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, La/v5a0;

    .line 26
    .line 27
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const/16 v8, 0x31

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-static/range {v2 .. v8}, La/v5a0;->a(La/v5a0;La/nc5;ZZZLa/h8a0;I)La/v5a0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget-object v0, p0, La/d6a0;->v:La/mne;

    .line 54
    .line 55
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 56
    .line 57
    new-instance v3, La/yr80;

    .line 58
    .line 59
    const/4 v0, 0x6

    .line 60
    invoke-direct {v3, p0, v0}, La/yr80;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v6, La/a6a0;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {v6, p0, v0, v1}, La/a6a0;-><init>(La/d6a0;La/yje;B)V

    .line 68
    .line 69
    .line 70
    const/16 v7, 0xa

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/d6a0;->B:La/bby;

    .line 78
    .line 79
    return-void
.end method

.method public final N(La/e8a0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/d6a0;->x:La/oaa0;

    .line 2
    .line 3
    sget-object v1, La/oaa0;->b:La/oaa0;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/d6a0;->y:La/yo4;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/yo4;->a:La/kt2;

    .line 13
    .line 14
    const-string v0, "point"

    .line 15
    .line 16
    iget-object p1, p1, La/e8a0;->a:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "bet_statistic_player_menu_call"

    .line 19
    .line 20
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/o5a0;

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
    instance-of v0, p1, La/l5a0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, La/d6a0;->t:La/i1w0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, La/c8d;

    .line 21
    .line 22
    sget-object v0, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    move-object p1, p0

    .line 34
    check-cast p1, La/paw;

    .line 35
    .line 36
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_20

    .line 41
    .line 42
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/oe50;

    .line 47
    .line 48
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    instance-of v0, p1, La/m5a0;

    .line 53
    .line 54
    if-eqz v0, :cond_22

    .line 55
    .line 56
    check-cast p1, La/m5a0;

    .line 57
    .line 58
    iget-object p1, p1, La/m5a0;->a:La/w8a0;

    .line 59
    .line 60
    instance-of v0, p1, La/s8a0;

    .line 61
    .line 62
    iget-object v3, p0, La/d6a0;->r:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    sget-object v0, La/e8a0;->e:La/e8a0;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v4, Lorg/xplatform/statistic/player/impl/referee/referee_tour/presentation/RefereeTourScreens;

    .line 80
    .line 81
    invoke-direct {v4, v3}, Lorg/xplatform/statistic/player/impl/referee/referee_tour/presentation/RefereeTourScreens;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 85
    .line 86
    if-eqz v3, :cond_1

    .line 87
    .line 88
    new-instance v3, La/e1w0;

    .line 89
    .line 90
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 91
    .line 92
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 93
    .line 94
    .line 95
    new-instance v4, La/c8d;

    .line 96
    .line 97
    sget-object v5, La/y7d;->a:La/v7d;

    .line 98
    .line 99
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    new-instance v3, La/w0w0;

    .line 107
    .line 108
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 109
    .line 110
    .line 111
    new-instance v4, La/c8d;

    .line 112
    .line 113
    sget-object v5, La/y7d;->a:La/v7d;

    .line 114
    .line 115
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :goto_2
    move-object v1, v0

    .line 126
    check-cast v1, La/paw;

    .line 127
    .line 128
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_15

    .line 133
    .line 134
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, La/oe50;

    .line 139
    .line 140
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_2
    instance-of v0, p1, La/q8a0;

    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v4, Lorg/xplatform/statistic/player/impl/referee/referee_card_last_game/presentation/screen/RefereeLastGameScreen;

    .line 153
    .line 154
    invoke-direct {v4, v3}, Lorg/xplatform/statistic/player/impl/referee/referee_card_last_game/presentation/screen/RefereeLastGameScreen;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 158
    .line 159
    if-eqz v3, :cond_3

    .line 160
    .line 161
    new-instance v3, La/e1w0;

    .line 162
    .line 163
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 164
    .line 165
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 166
    .line 167
    .line 168
    new-instance v4, La/c8d;

    .line 169
    .line 170
    sget-object v5, La/y7d;->a:La/v7d;

    .line 171
    .line 172
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_3
    new-instance v3, La/w0w0;

    .line 180
    .line 181
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 182
    .line 183
    .line 184
    new-instance v4, La/c8d;

    .line 185
    .line 186
    sget-object v5, La/y7d;->a:La/v7d;

    .line 187
    .line 188
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :goto_3
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :goto_4
    move-object v1, v0

    .line 199
    check-cast v1, La/paw;

    .line 200
    .line 201
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_15

    .line 206
    .line 207
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, La/oe50;

    .line 212
    .line 213
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_4
    instance-of v0, p1, La/r8a0;

    .line 218
    .line 219
    if-eqz v0, :cond_6

    .line 220
    .line 221
    sget-object v0, La/e8a0;->f:La/e8a0;

    .line 222
    .line 223
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 230
    .line 231
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 232
    .line 233
    .line 234
    new-instance v4, Lorg/xplatform/statistic/player/impl/referee/referee_team/presentation/RefereeTeamsFragmentScreen;

    .line 235
    .line 236
    invoke-direct {v4, v3}, Lorg/xplatform/statistic/player/impl/referee/referee_team/presentation/RefereeTeamsFragmentScreen;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 240
    .line 241
    if-eqz v3, :cond_5

    .line 242
    .line 243
    new-instance v3, La/e1w0;

    .line 244
    .line 245
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 246
    .line 247
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 248
    .line 249
    .line 250
    new-instance v4, La/c8d;

    .line 251
    .line 252
    sget-object v5, La/y7d;->a:La/v7d;

    .line 253
    .line 254
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_5
    new-instance v3, La/w0w0;

    .line 262
    .line 263
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 264
    .line 265
    .line 266
    new-instance v4, La/c8d;

    .line 267
    .line 268
    sget-object v5, La/y7d;->a:La/v7d;

    .line 269
    .line 270
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    :goto_5
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    :goto_6
    move-object v1, v0

    .line 281
    check-cast v1, La/paw;

    .line 282
    .line 283
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    if-eqz v3, :cond_15

    .line 288
    .line 289
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, La/oe50;

    .line 294
    .line 295
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 296
    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_6
    instance-of v0, p1, La/l8a0;

    .line 300
    .line 301
    if-eqz v0, :cond_8

    .line 302
    .line 303
    sget-object v0, La/e8a0;->b:La/e8a0;

    .line 304
    .line 305
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 312
    .line 313
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 314
    .line 315
    .line 316
    new-instance v4, Lorg/xplatform/statistic/player/impl/player/career/presentation/PlayerCareerScreen;

    .line 317
    .line 318
    invoke-direct {v4, v3}, Lorg/xplatform/statistic/player/impl/player/career/presentation/PlayerCareerScreen;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 322
    .line 323
    if-eqz v3, :cond_7

    .line 324
    .line 325
    new-instance v3, La/e1w0;

    .line 326
    .line 327
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 328
    .line 329
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 330
    .line 331
    .line 332
    new-instance v4, La/c8d;

    .line 333
    .line 334
    sget-object v5, La/y7d;->a:La/v7d;

    .line 335
    .line 336
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_7
    new-instance v3, La/w0w0;

    .line 344
    .line 345
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 346
    .line 347
    .line 348
    new-instance v4, La/c8d;

    .line 349
    .line 350
    sget-object v5, La/y7d;->a:La/v7d;

    .line 351
    .line 352
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    :goto_7
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    :goto_8
    move-object v1, v0

    .line 363
    check-cast v1, La/paw;

    .line 364
    .line 365
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    if-eqz v3, :cond_15

    .line 370
    .line 371
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    check-cast v1, La/oe50;

    .line 376
    .line 377
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 378
    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_8
    instance-of v0, p1, La/t8a0;

    .line 382
    .line 383
    if-eqz v0, :cond_a

    .line 384
    .line 385
    sget-object v0, La/e8a0;->c:La/e8a0;

    .line 386
    .line 387
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 394
    .line 395
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 396
    .line 397
    .line 398
    new-instance v4, Lorg/xplatform/statistic/player/impl/player/player_transfers/presentation/screen/TransfersPlayerScreen;

    .line 399
    .line 400
    invoke-direct {v4, v3}, Lorg/xplatform/statistic/player/impl/player/player_transfers/presentation/screen/TransfersPlayerScreen;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 404
    .line 405
    if-eqz v3, :cond_9

    .line 406
    .line 407
    new-instance v3, La/e1w0;

    .line 408
    .line 409
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 410
    .line 411
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 412
    .line 413
    .line 414
    new-instance v4, La/c8d;

    .line 415
    .line 416
    sget-object v5, La/y7d;->a:La/v7d;

    .line 417
    .line 418
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    goto :goto_9

    .line 425
    :cond_9
    new-instance v3, La/w0w0;

    .line 426
    .line 427
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 428
    .line 429
    .line 430
    new-instance v4, La/c8d;

    .line 431
    .line 432
    sget-object v5, La/y7d;->a:La/v7d;

    .line 433
    .line 434
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    :goto_9
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    :goto_a
    move-object v1, v0

    .line 445
    check-cast v1, La/paw;

    .line 446
    .line 447
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-eqz v3, :cond_15

    .line 452
    .line 453
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    check-cast v1, La/oe50;

    .line 458
    .line 459
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 460
    .line 461
    .line 462
    goto :goto_a

    .line 463
    :cond_a
    instance-of v0, p1, La/m8a0;

    .line 464
    .line 465
    if-eqz v0, :cond_c

    .line 466
    .line 467
    sget-object v0, La/e8a0;->d:La/e8a0;

    .line 468
    .line 469
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 476
    .line 477
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 478
    .line 479
    .line 480
    new-instance v4, Lorg/xplatform/statistic/player/impl/player/player_injury/presentation/screen/InjuriesScreens;

    .line 481
    .line 482
    invoke-direct {v4, v3}, Lorg/xplatform/statistic/player/impl/player/player_injury/presentation/screen/InjuriesScreens;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 486
    .line 487
    if-eqz v3, :cond_b

    .line 488
    .line 489
    new-instance v3, La/e1w0;

    .line 490
    .line 491
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 492
    .line 493
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 494
    .line 495
    .line 496
    new-instance v4, La/c8d;

    .line 497
    .line 498
    sget-object v5, La/y7d;->a:La/v7d;

    .line 499
    .line 500
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    goto :goto_b

    .line 507
    :cond_b
    new-instance v3, La/w0w0;

    .line 508
    .line 509
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 510
    .line 511
    .line 512
    new-instance v4, La/c8d;

    .line 513
    .line 514
    sget-object v5, La/y7d;->a:La/v7d;

    .line 515
    .line 516
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    :goto_b
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    :goto_c
    move-object v1, v0

    .line 527
    check-cast v1, La/paw;

    .line 528
    .line 529
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    if-eqz v3, :cond_15

    .line 534
    .line 535
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    check-cast v1, La/oe50;

    .line 540
    .line 541
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 542
    .line 543
    .line 544
    goto :goto_c

    .line 545
    :cond_c
    instance-of v0, p1, La/p8a0;

    .line 546
    .line 547
    if-eqz v0, :cond_e

    .line 548
    .line 549
    sget-object v0, La/e8a0;->g:La/e8a0;

    .line 550
    .line 551
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 558
    .line 559
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 560
    .line 561
    .line 562
    new-instance v4, Lorg/xplatform/statistic/player/impl/player/player_lastgame/presentation/screen/LastGamePlayerScreen;

    .line 563
    .line 564
    iget-wide v5, p0, La/d6a0;->s:J

    .line 565
    .line 566
    invoke-direct {v4, v3, v5, v6}, Lorg/xplatform/statistic/player/impl/player/player_lastgame/presentation/screen/LastGamePlayerScreen;-><init>(Ljava/lang/String;J)V

    .line 567
    .line 568
    .line 569
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 570
    .line 571
    if-eqz v3, :cond_d

    .line 572
    .line 573
    new-instance v3, La/e1w0;

    .line 574
    .line 575
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 576
    .line 577
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 578
    .line 579
    .line 580
    new-instance v4, La/c8d;

    .line 581
    .line 582
    sget-object v5, La/y7d;->a:La/v7d;

    .line 583
    .line 584
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    goto :goto_d

    .line 591
    :cond_d
    new-instance v3, La/w0w0;

    .line 592
    .line 593
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 594
    .line 595
    .line 596
    new-instance v4, La/c8d;

    .line 597
    .line 598
    sget-object v5, La/y7d;->a:La/v7d;

    .line 599
    .line 600
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    :goto_d
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    :goto_e
    move-object v1, v0

    .line 611
    check-cast v1, La/paw;

    .line 612
    .line 613
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    if-eqz v3, :cond_15

    .line 618
    .line 619
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    check-cast v1, La/oe50;

    .line 624
    .line 625
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 626
    .line 627
    .line 628
    goto :goto_e

    .line 629
    :cond_e
    instance-of v0, p1, La/v8a0;

    .line 630
    .line 631
    if-eqz v0, :cond_10

    .line 632
    .line 633
    sget-object v0, La/e8a0;->j:La/e8a0;

    .line 634
    .line 635
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 642
    .line 643
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 644
    .line 645
    .line 646
    new-instance v4, Lorg/xplatform/statistic/player/impl/player/winter_full_description/presentation/actual/FullDescriptionScreen;

    .line 647
    .line 648
    invoke-direct {v4, v3}, Lorg/xplatform/statistic/player/impl/player/winter_full_description/presentation/actual/FullDescriptionScreen;-><init>(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 652
    .line 653
    if-eqz v3, :cond_f

    .line 654
    .line 655
    new-instance v3, La/e1w0;

    .line 656
    .line 657
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 658
    .line 659
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 660
    .line 661
    .line 662
    new-instance v4, La/c8d;

    .line 663
    .line 664
    sget-object v5, La/y7d;->a:La/v7d;

    .line 665
    .line 666
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    goto :goto_f

    .line 673
    :cond_f
    new-instance v3, La/w0w0;

    .line 674
    .line 675
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 676
    .line 677
    .line 678
    new-instance v4, La/c8d;

    .line 679
    .line 680
    sget-object v5, La/y7d;->a:La/v7d;

    .line 681
    .line 682
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    :goto_f
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    :goto_10
    move-object v1, v0

    .line 693
    check-cast v1, La/paw;

    .line 694
    .line 695
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    if-eqz v3, :cond_15

    .line 700
    .line 701
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    check-cast v1, La/oe50;

    .line 706
    .line 707
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 708
    .line 709
    .line 710
    goto :goto_10

    .line 711
    :cond_10
    instance-of v0, p1, La/o8a0;

    .line 712
    .line 713
    if-eqz v0, :cond_12

    .line 714
    .line 715
    sget-object v0, La/e8a0;->i:La/e8a0;

    .line 716
    .line 717
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 718
    .line 719
    .line 720
    iget-object v0, p0, La/d6a0;->w:La/bzs0;

    .line 721
    .line 722
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    new-instance v0, Lorg/xplatform/statistic/winter_games/impl/personal_statistic/presentation/WinterGamesPersonalStatisticFragmentScreen;

    .line 729
    .line 730
    invoke-direct {v0, v3}, Lorg/xplatform/statistic/winter_games/impl/personal_statistic/presentation/WinterGamesPersonalStatisticFragmentScreen;-><init>(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 737
    .line 738
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 739
    .line 740
    .line 741
    instance-of v4, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 742
    .line 743
    if-eqz v4, :cond_11

    .line 744
    .line 745
    new-instance v4, La/e1w0;

    .line 746
    .line 747
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 748
    .line 749
    invoke-direct {v4, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 750
    .line 751
    .line 752
    new-instance v0, La/c8d;

    .line 753
    .line 754
    sget-object v5, La/y7d;->a:La/v7d;

    .line 755
    .line 756
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    goto :goto_11

    .line 763
    :cond_11
    new-instance v4, La/w0w0;

    .line 764
    .line 765
    invoke-direct {v4, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 766
    .line 767
    .line 768
    new-instance v0, La/c8d;

    .line 769
    .line 770
    sget-object v5, La/y7d;->a:La/v7d;

    .line 771
    .line 772
    invoke-direct {v0, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    :goto_11
    invoke-static {v2, v3, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    :goto_12
    move-object v1, v0

    .line 783
    check-cast v1, La/paw;

    .line 784
    .line 785
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    if-eqz v3, :cond_15

    .line 790
    .line 791
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    check-cast v1, La/oe50;

    .line 796
    .line 797
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 798
    .line 799
    .line 800
    goto :goto_12

    .line 801
    :cond_12
    instance-of v0, p1, La/n8a0;

    .line 802
    .line 803
    if-eqz v0, :cond_14

    .line 804
    .line 805
    sget-object v0, La/e8a0;->h:La/e8a0;

    .line 806
    .line 807
    invoke-virtual {p0, v0}, La/d6a0;->N(La/e8a0;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 814
    .line 815
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 816
    .line 817
    .line 818
    new-instance v4, Lorg/xplatform/statistic/player/impl/player/medals/presentation/screen/PlayerMedalsStatisticScreen;

    .line 819
    .line 820
    invoke-direct {v4, v3}, Lorg/xplatform/statistic/player/impl/player/medals/presentation/screen/PlayerMedalsStatisticScreen;-><init>(Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    instance-of v3, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 824
    .line 825
    if-eqz v3, :cond_13

    .line 826
    .line 827
    new-instance v3, La/e1w0;

    .line 828
    .line 829
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 830
    .line 831
    invoke-direct {v3, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 832
    .line 833
    .line 834
    new-instance v4, La/c8d;

    .line 835
    .line 836
    sget-object v5, La/y7d;->a:La/v7d;

    .line 837
    .line 838
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    goto :goto_13

    .line 845
    :cond_13
    new-instance v3, La/w0w0;

    .line 846
    .line 847
    invoke-direct {v3, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 848
    .line 849
    .line 850
    new-instance v4, La/c8d;

    .line 851
    .line 852
    sget-object v5, La/y7d;->a:La/v7d;

    .line 853
    .line 854
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    :goto_13
    invoke-static {v2, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    :goto_14
    move-object v1, v0

    .line 865
    check-cast v1, La/paw;

    .line 866
    .line 867
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 868
    .line 869
    .line 870
    move-result v3

    .line 871
    if-eqz v3, :cond_15

    .line 872
    .line 873
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    check-cast v1, La/oe50;

    .line 878
    .line 879
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 880
    .line 881
    .line 882
    goto :goto_14

    .line 883
    :cond_14
    instance-of v0, p1, La/u8a0;

    .line 884
    .line 885
    if-eqz v0, :cond_21

    .line 886
    .line 887
    :cond_15
    instance-of v0, p1, La/u8a0;

    .line 888
    .line 889
    if-nez v0, :cond_20

    .line 890
    .line 891
    iget-object v0, p0, La/d6a0;->x:La/oaa0;

    .line 892
    .line 893
    sget-object v1, La/oaa0;->b:La/oaa0;

    .line 894
    .line 895
    if-eq v0, v1, :cond_20

    .line 896
    .line 897
    sget-object v0, La/l8a0;->b:La/l8a0;

    .line 898
    .line 899
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v0

    .line 903
    if-eqz v0, :cond_16

    .line 904
    .line 905
    const-string p1, "career"

    .line 906
    .line 907
    goto/16 :goto_16

    .line 908
    .line 909
    :cond_16
    sget-object v0, La/m8a0;->b:La/m8a0;

    .line 910
    .line 911
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v0

    .line 915
    if-eqz v0, :cond_17

    .line 916
    .line 917
    const-string p1, "injuries"

    .line 918
    .line 919
    goto :goto_16

    .line 920
    :cond_17
    sget-object v0, La/n8a0;->b:La/n8a0;

    .line 921
    .line 922
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v0

    .line 926
    if-eqz v0, :cond_18

    .line 927
    .line 928
    const-string p1, "medals"

    .line 929
    .line 930
    goto :goto_16

    .line 931
    :cond_18
    sget-object v0, La/o8a0;->b:La/o8a0;

    .line 932
    .line 933
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    if-eqz v0, :cond_19

    .line 938
    .line 939
    const-string p1, "personal_stat"

    .line 940
    .line 941
    goto :goto_16

    .line 942
    :cond_19
    sget-object v0, La/p8a0;->b:La/p8a0;

    .line 943
    .line 944
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    move-result v0

    .line 948
    if-nez v0, :cond_1f

    .line 949
    .line 950
    sget-object v0, La/q8a0;->b:La/q8a0;

    .line 951
    .line 952
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    move-result v0

    .line 956
    if-eqz v0, :cond_1a

    .line 957
    .line 958
    goto :goto_15

    .line 959
    :cond_1a
    sget-object v0, La/r8a0;->b:La/r8a0;

    .line 960
    .line 961
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    move-result v0

    .line 965
    if-eqz v0, :cond_1b

    .line 966
    .line 967
    const-string p1, "teams"

    .line 968
    .line 969
    goto :goto_16

    .line 970
    :cond_1b
    sget-object v0, La/s8a0;->b:La/s8a0;

    .line 971
    .line 972
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    if-eqz v0, :cond_1c

    .line 977
    .line 978
    const-string p1, "tornaments"

    .line 979
    .line 980
    goto :goto_16

    .line 981
    :cond_1c
    sget-object v0, La/t8a0;->b:La/t8a0;

    .line 982
    .line 983
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result v0

    .line 987
    if-eqz v0, :cond_1d

    .line 988
    .line 989
    const-string p1, "transitions"

    .line 990
    .line 991
    goto :goto_16

    .line 992
    :cond_1d
    sget-object v0, La/v8a0;->b:La/v8a0;

    .line 993
    .line 994
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    move-result p1

    .line 998
    if-eqz p1, :cond_1e

    .line 999
    .line 1000
    const-string p1, "full_description"

    .line 1001
    .line 1002
    goto :goto_16

    .line 1003
    :cond_1e
    const-string p1, ""

    .line 1004
    .line 1005
    goto :goto_16

    .line 1006
    :cond_1f
    :goto_15
    const-string p1, "last_matches"

    .line 1007
    .line 1008
    :goto_16
    iget-object p0, p0, La/d6a0;->z:La/zr1;

    .line 1009
    .line 1010
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    iget-object p0, p0, La/zr1;->a:La/s1p;

    .line 1014
    .line 1015
    const-wide/16 v0, 0xc29

    .line 1016
    .line 1017
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 1018
    .line 1019
    .line 1020
    :cond_20
    return-void

    .line 1021
    :cond_21
    invoke-static {}, La/t9f;->b()V

    .line 1022
    .line 1023
    .line 1024
    return-void

    .line 1025
    :cond_22
    instance-of p1, p1, La/n5a0;

    .line 1026
    .line 1027
    if-eqz p1, :cond_23

    .line 1028
    .line 1029
    invoke-virtual {p0}, La/d6a0;->M()V

    .line 1030
    .line 1031
    .line 1032
    return-void

    .line 1033
    :cond_23
    invoke-static {}, La/t9f;->b()V

    .line 1034
    .line 1035
    .line 1036
    return-void
.end method
