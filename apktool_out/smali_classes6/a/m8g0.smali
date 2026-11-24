.class public final La/m8g0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:J

.field public final q:La/ctf0;

.field public final r:La/mne;

.field public final s:La/i1w0;

.field public final t:La/p4u;

.field public final u:La/duj;

.field public final v:La/fhj;

.field public w:La/bby;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLa/ctf0;La/mne;La/i1w0;La/p4u;La/duj;La/m1e;La/weu;La/qzt;La/fhj;La/f7u;La/uyu;La/r9u;La/ocl;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, La/b29;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    move-object v5, p1

    .line 20
    move-wide v2, p2

    .line 21
    move-object v7, p4

    .line 22
    move-object/from16 v4, p10

    .line 23
    .line 24
    move-object/from16 v6, p11

    .line 25
    .line 26
    move-object/from16 v8, p12

    .line 27
    .line 28
    invoke-direct/range {v0 .. v8}, La/b29;-><init>(BJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/tla0;

    .line 32
    .line 33
    move-object/from16 v1, p15

    .line 34
    .line 35
    move-object/from16 v2, p16

    .line 36
    .line 37
    invoke-direct {v3, p4, v1, v2}, La/tla0;-><init>(La/ctf0;La/r9u;La/ocl;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p5, La/mne;->c:La/vs10;

    .line 41
    .line 42
    iget-object v8, p5, La/mne;->a:La/rwj;

    .line 43
    .line 44
    invoke-static {v1, v8}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v1, 0x0

    .line 50
    move-object v2, v0

    .line 51
    move-object v0, p0

    .line 52
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, La/m8g0;->o:Ljava/lang/String;

    .line 56
    .line 57
    iput-wide p2, p0, La/m8g0;->p:J

    .line 58
    .line 59
    iput-object p4, p0, La/m8g0;->q:La/ctf0;

    .line 60
    .line 61
    iput-object p5, p0, La/m8g0;->r:La/mne;

    .line 62
    .line 63
    move-object v1, p6

    .line 64
    iput-object v1, p0, La/m8g0;->s:La/i1w0;

    .line 65
    .line 66
    move-object/from16 v1, p7

    .line 67
    .line 68
    iput-object v1, p0, La/m8g0;->t:La/p4u;

    .line 69
    .line 70
    move-object/from16 v1, p8

    .line 71
    .line 72
    iput-object v1, p0, La/m8g0;->u:La/duj;

    .line 73
    .line 74
    move-object/from16 v1, p12

    .line 75
    .line 76
    iput-object v1, p0, La/m8g0;->v:La/fhj;

    .line 77
    .line 78
    invoke-interface/range {p9 .. p9}, La/m1e;->b()La/gmq;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v2, La/i8g0;

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    const/4 v4, 0x0

    .line 86
    invoke-direct {v2, p0, v4, v3}, La/i8g0;-><init>(La/m8g0;La/yje;B)V

    .line 87
    .line 88
    .line 89
    new-instance v3, La/fnq;

    .line 90
    .line 91
    const/4 v5, 0x4

    .line 92
    invoke-direct {v3, v1, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v2, p5, La/mne;->b:La/dvj;

    .line 100
    .line 101
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    sget-object v2, La/j8g0;->h:La/j8g0;

    .line 106
    .line 107
    invoke-static {v3, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 108
    .line 109
    .line 110
    move-object/from16 v1, p14

    .line 111
    .line 112
    iget-object v1, v1, La/uyu;->a:La/v6j0;

    .line 113
    .line 114
    invoke-virtual {v1}, La/v6j0;->h()La/qz40;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v2, La/tye0;

    .line 119
    .line 120
    const/16 v3, 0xc

    .line 121
    .line 122
    invoke-direct {v2, p0, v4, v3}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 123
    .line 124
    .line 125
    new-instance v3, La/fnq;

    .line 126
    .line 127
    invoke-direct {v3, v1, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-static {v1, v8}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    sget-object v2, La/l8g0;->h:La/l8g0;

    .line 139
    .line 140
    invoke-static {v3, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {p11 .. p11}, La/qzt;->a()La/eme;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    move-object/from16 v2, p13

    .line 148
    .line 149
    invoke-virtual {v2, p1}, La/f7u;->n(Ljava/lang/String;)La/zj2;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    new-instance v3, La/qkb0;

    .line 154
    .line 155
    const/4 v6, 0x7

    .line 156
    invoke-direct {v3, v1, p0, v4, v6}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 157
    .line 158
    .line 159
    new-instance v1, La/fnq;

    .line 160
    .line 161
    invoke-direct {v1, v2, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 162
    .line 163
    .line 164
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sget-object v2, La/k8g0;->h:La/k8g0;

    .line 169
    .line 170
    invoke-static {v1, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 171
    .line 172
    .line 173
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 14

    .line 1
    iget-object v0, p0, La/m8g0;->w:La/bby;

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
    check-cast v2, La/w7g0;

    .line 26
    .line 27
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/16 v9, 0x38

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-static/range {v2 .. v9}, La/w7g0;->a(La/w7g0;ZZZLa/l7g0;La/zdm0;La/nc5;I)La/w7g0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v0, p0, La/m8g0;->r:La/mne;

    .line 55
    .line 56
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 57
    .line 58
    new-instance v3, La/aif0;

    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    const/16 v13, 0x10

    .line 62
    .line 63
    const/4 v7, 0x1

    .line 64
    const-class v9, La/m8g0;

    .line 65
    .line 66
    const-string v10, "handleError"

    .line 67
    .line 68
    const-string v11, "handleError(Ljava/lang/Throwable;)V"

    .line 69
    .line 70
    move-object v8, p0

    .line 71
    move-object v6, v3

    .line 72
    invoke-direct/range {v6 .. v13}, La/aif0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 73
    .line 74
    .line 75
    new-instance v6, La/i8g0;

    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-direct {v6, v8, p0, v0}, La/i8g0;-><init>(La/m8g0;La/yje;B)V

    .line 80
    .line 81
    .line 82
    const/16 v7, 0xa

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iput-object p0, v8, La/m8g0;->w:La/bby;

    .line 90
    .line 91
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/h6g0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/c6g0;->a:La/c6g0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, p0, La/m8g0;->s:La/i1w0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, La/c8d;

    .line 22
    .line 23
    sget-object v0, La/y7d;->a:La/v7d;

    .line 24
    .line 25
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 26
    .line 27
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    move-object p1, p0

    .line 35
    check-cast p1, La/paw;

    .line 36
    .line 37
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, La/oe50;

    .line 48
    .line 49
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object v0, La/e6g0;->a:La/e6g0;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, La/m8g0;->M()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    sget-object v0, La/d6g0;->a:La/d6g0;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v0, Lorg/xplatform/statistic/stat_results/impl/results_grid/presentation/screen/ResultsGridInfoScreen;

    .line 78
    .line 79
    iget-object p0, p0, La/m8g0;->o:Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Lorg/xplatform/statistic/stat_results/impl/results_grid/presentation/screen/ResultsGridInfoScreen;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    instance-of p0, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 85
    .line 86
    if-eqz p0, :cond_2

    .line 87
    .line 88
    new-instance p0, La/e1w0;

    .line 89
    .line 90
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 91
    .line 92
    invoke-direct {p0, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, La/c8d;

    .line 96
    .line 97
    sget-object v3, La/y7d;->a:La/v7d;

    .line 98
    .line 99
    invoke-direct {v0, v3, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    new-instance p0, La/w0w0;

    .line 107
    .line 108
    invoke-direct {p0, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 109
    .line 110
    .line 111
    new-instance v0, La/c8d;

    .line 112
    .line 113
    sget-object v3, La/y7d;->a:La/v7d;

    .line 114
    .line 115
    invoke-direct {v0, v3, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :goto_1
    invoke-static {v2, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :goto_2
    move-object p1, p0

    .line 126
    check-cast p1, La/paw;

    .line 127
    .line 128
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_3

    .line 133
    .line 134
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, La/oe50;

    .line 139
    .line 140
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    return-void

    .line 145
    :cond_4
    instance-of v0, p1, La/g6g0;

    .line 146
    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    new-instance v0, La/v7g0;

    .line 150
    .line 151
    check-cast p1, La/g6g0;

    .line 152
    .line 153
    iget-object p1, p1, La/g6g0;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-direct {v0, p1}, La/v7g0;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_5
    sget-object v0, La/f6g0;->a:La/f6g0;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_6

    .line 169
    .line 170
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 175
    .line 176
    .line 177
    return-void
.end method
