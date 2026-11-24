.class public final La/u1z;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final C:Ljava/util/List;


# instance fields
.field public A:La/bby;

.field public B:La/bby;

.field public final o:Ljava/lang/String;

.field public final p:J

.field public final q:La/ctf0;

.field public final r:La/mne;

.field public final s:La/i1w0;

.field public final t:La/m1e;

.field public final u:La/jwu;

.field public final v:La/fhj;

.field public final w:La/bzu;

.field public final x:La/xfu;

.field public final y:La/yfm0;

.field public z:La/c4m0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/n3q;->a:La/n3q;

    .line 2
    .line 3
    sget-object v1, La/n3q;->c:La/n3q;

    .line 4
    .line 5
    sget-object v2, La/n3q;->b:La/n3q;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [La/n3q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/u1z;->C:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JILa/n3q;La/ctf0;La/mne;La/i1w0;La/ocl;La/m1e;La/jwu;La/f7u;La/weu;La/qzt;La/fhj;La/uyu;La/wyu;La/bzu;La/xfu;La/vjp;La/yfm0;La/r9u;)V
    .locals 19

    .line 1
    move-object/from16 v11, p7

    .line 2
    .line 3
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p22 .. p22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/o1z;

    .line 16
    .line 17
    move-object/from16 v2, p1

    .line 18
    .line 19
    move-wide/from16 v6, p2

    .line 20
    .line 21
    move/from16 v9, p4

    .line 22
    .line 23
    move-object/from16 v10, p5

    .line 24
    .line 25
    move-object/from16 v4, p6

    .line 26
    .line 27
    move-object/from16 v1, p13

    .line 28
    .line 29
    move-object/from16 v3, p14

    .line 30
    .line 31
    move-object/from16 v5, p15

    .line 32
    .line 33
    move-object/from16 v8, p17

    .line 34
    .line 35
    invoke-direct/range {v0 .. v10}, La/o1z;-><init>(La/weu;Ljava/lang/String;La/qzt;La/ctf0;La/fhj;JLa/wyu;ILa/n3q;)V

    .line 36
    .line 37
    .line 38
    move-object v6, v2

    .line 39
    new-instance v12, La/p1z;

    .line 40
    .line 41
    move-wide/from16 v17, p2

    .line 42
    .line 43
    move-object/from16 v15, p6

    .line 44
    .line 45
    move-object/from16 v16, p9

    .line 46
    .line 47
    move-object/from16 v13, p20

    .line 48
    .line 49
    move-object/from16 v14, p22

    .line 50
    .line 51
    invoke-direct/range {v12 .. v18}, La/p1z;-><init>(La/vjp;La/r9u;La/ctf0;La/ocl;J)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v11, La/mne;->c:La/vs10;

    .line 55
    .line 56
    iget-object v7, v11, La/mne;->a:La/rwj;

    .line 57
    .line 58
    invoke-static {v1, v7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v1, 0x0

    .line 64
    move-object v2, v0

    .line 65
    move-object v3, v12

    .line 66
    move-object/from16 v0, p0

    .line 67
    .line 68
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 69
    .line 70
    .line 71
    iput-object v6, v0, La/u1z;->o:Ljava/lang/String;

    .line 72
    .line 73
    move-wide/from16 v1, p2

    .line 74
    .line 75
    iput-wide v1, v0, La/u1z;->p:J

    .line 76
    .line 77
    iput-object v15, v0, La/u1z;->q:La/ctf0;

    .line 78
    .line 79
    iput-object v11, v0, La/u1z;->r:La/mne;

    .line 80
    .line 81
    move-object/from16 v1, p8

    .line 82
    .line 83
    iput-object v1, v0, La/u1z;->s:La/i1w0;

    .line 84
    .line 85
    move-object/from16 v1, p10

    .line 86
    .line 87
    iput-object v1, v0, La/u1z;->t:La/m1e;

    .line 88
    .line 89
    move-object/from16 v1, p11

    .line 90
    .line 91
    iput-object v1, v0, La/u1z;->u:La/jwu;

    .line 92
    .line 93
    move-object/from16 v5, p15

    .line 94
    .line 95
    iput-object v5, v0, La/u1z;->v:La/fhj;

    .line 96
    .line 97
    move-object/from16 v1, p18

    .line 98
    .line 99
    iput-object v1, v0, La/u1z;->w:La/bzu;

    .line 100
    .line 101
    move-object/from16 v1, p19

    .line 102
    .line 103
    iput-object v1, v0, La/u1z;->x:La/xfu;

    .line 104
    .line 105
    move-object/from16 v1, p21

    .line 106
    .line 107
    iput-object v1, v0, La/u1z;->y:La/yfm0;

    .line 108
    .line 109
    move-object/from16 v1, p16

    .line 110
    .line 111
    iget-object v1, v1, La/uyu;->a:La/v6j0;

    .line 112
    .line 113
    invoke-virtual {v1}, La/v6j0;->h()La/qz40;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v2, La/kaw;

    .line 118
    .line 119
    const/16 v3, 0x10

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    invoke-direct {v2, v0, v4, v3}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 123
    .line 124
    .line 125
    new-instance v3, La/fnq;

    .line 126
    .line 127
    const/4 v5, 0x4

    .line 128
    invoke-direct {v3, v1, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v1, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    sget-object v2, La/t1z;->h:La/t1z;

    .line 140
    .line 141
    invoke-static {v3, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {p14 .. p14}, La/qzt;->a()La/eme;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    move-object/from16 v2, p12

    .line 149
    .line 150
    invoke-virtual {v2, v6}, La/f7u;->n(Ljava/lang/String;)La/zj2;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    new-instance v3, La/khx;

    .line 155
    .line 156
    const/4 v6, 0x3

    .line 157
    invoke-direct {v3, v0, v1, v4, v6}, La/khx;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 158
    .line 159
    .line 160
    new-instance v1, La/fnq;

    .line 161
    .line 162
    invoke-direct {v1, v2, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    sget-object v2, La/s1z;->h:La/s1z;

    .line 170
    .line 171
    invoke-static {v1, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 172
    .line 173
    .line 174
    return-void
.end method


# virtual methods
.method public final M(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, La/u1z;->B:La/bby;

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
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, La/u1z;->r:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/adw;

    .line 22
    .line 23
    const/16 v0, 0x18

    .line 24
    .line 25
    invoke-direct {v3, p0, v0}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v6, La/u88;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v6, p1, p0, v1, v0}, La/u88;-><init>(ZLjava/lang/Object;La/yje;B)V

    .line 32
    .line 33
    .line 34
    const/16 v7, 0xa

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, La/u1z;->B:La/bby;

    .line 42
    .line 43
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/l0z;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v2, v1, La/f0z;

    .line 11
    .line 12
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 13
    .line 14
    iget-object v4, v0, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    check-cast v1, La/f0z;

    .line 19
    .line 20
    iget-object v11, v1, La/f0z;->a:La/n3q;

    .line 21
    .line 22
    iget-object v0, v0, La/u1z;->x:La/xfu;

    .line 23
    .line 24
    invoke-virtual {v0, v11}, La/xfu;->c(La/n3q;)La/hxs0;

    .line 25
    .line 26
    .line 27
    move-result-object v13

    .line 28
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-object v5, v0

    .line 38
    check-cast v5, La/d1z;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v14, 0x0

    .line 44
    const/16 v15, 0x158

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v12, 0x0

    .line 52
    invoke-static/range {v5 .. v15}, La/d1z;->a(La/d1z;ZZILa/zdm0;La/nc5;La/n3q;Ljava/util/ArrayList;La/hxs0;ZI)La/d1z;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    instance-of v2, v1, La/j0z;

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-object v4, v0

    .line 77
    check-cast v4, La/d1z;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-object v5, v1

    .line 83
    check-cast v5, La/j0z;

    .line 84
    .line 85
    iget v7, v5, La/j0z;->a:I

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const/16 v14, 0x1fb

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v9, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v12, 0x0

    .line 97
    invoke-static/range {v4 .. v14}, La/d1z;->a(La/d1z;ZZILa/zdm0;La/nc5;La/n3q;Ljava/util/ArrayList;La/hxs0;ZI)La/d1z;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v2, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    sget-object v2, La/e0z;->a:La/e0z;

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    const/4 v5, 0x0

    .line 115
    iget-object v6, v0, La/u1z;->s:La/i1w0;

    .line 116
    .line 117
    if-eqz v2, :cond_4

    .line 118
    .line 119
    invoke-static {v6}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v1, La/c8d;

    .line 124
    .line 125
    sget-object v2, La/y7d;->a:La/v7d;

    .line 126
    .line 127
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 128
    .line 129
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v1, v6, v0, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :goto_0
    move-object v1, v0

    .line 137
    check-cast v1, La/paw;

    .line 138
    .line 139
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_d

    .line 144
    .line 145
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, La/oe50;

    .line 150
    .line 151
    invoke-virtual {v6, v1}, La/i1w0;->a(La/oe50;)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_4
    sget-object v2, La/c0z;->a:La/c0z;

    .line 156
    .line 157
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    const/4 v7, 0x0

    .line 162
    const/4 v8, 0x1

    .line 163
    if-eqz v2, :cond_6

    .line 164
    .line 165
    iget-object v1, v0, La/u1z;->z:La/c4m0;

    .line 166
    .line 167
    if-eqz v1, :cond_5

    .line 168
    .line 169
    invoke-virtual {v1}, La/pby;->isActive()Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-ne v1, v8, :cond_5

    .line 174
    .line 175
    goto/16 :goto_3

    .line 176
    .line 177
    :cond_5
    iget-object v1, v0, La/u1z;->t:La/m1e;

    .line 178
    .line 179
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    new-instance v2, La/cin;

    .line 184
    .line 185
    const/16 v3, 0x19

    .line 186
    .line 187
    invoke-direct {v2, v0, v7, v3}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 188
    .line 189
    .line 190
    new-instance v3, La/fnq;

    .line 191
    .line 192
    const/4 v4, 0x4

    .line 193
    invoke-direct {v3, v1, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iget-object v2, v0, La/u1z;->r:La/mne;

    .line 201
    .line 202
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 203
    .line 204
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    sget-object v2, La/q1z;->h:La/q1z;

    .line 209
    .line 210
    invoke-static {v3, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iput-object v1, v0, La/u1z;->z:La/c4m0;

    .line 215
    .line 216
    return-void

    .line 217
    :cond_6
    sget-object v2, La/d0z;->a:La/d0z;

    .line 218
    .line 219
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_9

    .line 224
    .line 225
    iget-object v1, v0, La/u1z;->z:La/c4m0;

    .line 226
    .line 227
    if-eqz v1, :cond_7

    .line 228
    .line 229
    invoke-virtual {v1, v7}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 230
    .line 231
    .line 232
    :cond_7
    iget-object v1, v0, La/u1z;->A:La/bby;

    .line 233
    .line 234
    if-eqz v1, :cond_8

    .line 235
    .line 236
    invoke-interface {v1, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 237
    .line 238
    .line 239
    :cond_8
    iget-object v0, v0, La/u1z;->B:La/bby;

    .line 240
    .line 241
    if-eqz v0, :cond_d

    .line 242
    .line 243
    invoke-interface {v0, v7}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_9
    sget-object v2, La/k0z;->a:La/k0z;

    .line 248
    .line 249
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_a

    .line 254
    .line 255
    new-instance v1, La/c1z;

    .line 256
    .line 257
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    check-cast v2, La/d1z;

    .line 262
    .line 263
    iget-object v2, v2, La/d1z;->f:La/n3q;

    .line 264
    .line 265
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, La/d1z;

    .line 270
    .line 271
    iget-object v3, v3, La/d1z;->g:Ljava/util/List;

    .line 272
    .line 273
    invoke-direct {v1, v2, v3}, La/c1z;-><init>(La/n3q;Ljava/util/List;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :cond_a
    sget-object v2, La/b0z;->a:La/b0z;

    .line 281
    .line 282
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-eqz v2, :cond_b

    .line 287
    .line 288
    invoke-virtual {v0}, La/i3t0;->E()V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_b
    instance-of v2, v1, La/g0z;

    .line 293
    .line 294
    if-eqz v2, :cond_e

    .line 295
    .line 296
    check-cast v1, La/g0z;

    .line 297
    .line 298
    iget-object v1, v1, La/g0z;->a:Ljava/lang/String;

    .line 299
    .line 300
    iget-wide v2, v0, La/u1z;->p:J

    .line 301
    .line 302
    iget-object v0, v0, La/u1z;->y:La/yfm0;

    .line 303
    .line 304
    check-cast v0, La/zfm0;

    .line 305
    .line 306
    invoke-virtual {v0, v2, v3, v1}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {v6}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    instance-of v2, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 315
    .line 316
    if-eqz v2, :cond_c

    .line 317
    .line 318
    new-instance v2, La/e1w0;

    .line 319
    .line 320
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 321
    .line 322
    invoke-direct {v2, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 323
    .line 324
    .line 325
    new-instance v0, La/c8d;

    .line 326
    .line 327
    sget-object v3, La/y7d;->a:La/v7d;

    .line 328
    .line 329
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto :goto_1

    .line 336
    :cond_c
    new-instance v2, La/w0w0;

    .line 337
    .line 338
    invoke-direct {v2, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 339
    .line 340
    .line 341
    new-instance v0, La/c8d;

    .line 342
    .line 343
    sget-object v3, La/y7d;->a:La/v7d;

    .line 344
    .line 345
    invoke-direct {v0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    :goto_1
    invoke-static {v6, v1, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    :goto_2
    move-object v1, v0

    .line 356
    check-cast v1, La/paw;

    .line 357
    .line 358
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    if-eqz v2, :cond_d

    .line 363
    .line 364
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, La/oe50;

    .line 369
    .line 370
    invoke-virtual {v6, v1}, La/i1w0;->a(La/oe50;)V

    .line 371
    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_d
    :goto_3
    return-void

    .line 375
    :cond_e
    sget-object v2, La/i0z;->a:La/i0z;

    .line 376
    .line 377
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-eqz v2, :cond_10

    .line 382
    .line 383
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 384
    .line 385
    :cond_f
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    move-object v9, v0

    .line 393
    check-cast v9, La/d1z;

    .line 394
    .line 395
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    iget-boolean v1, v9, La/d1z;->i:Z

    .line 399
    .line 400
    xor-int/lit8 v18, v1, 0x1

    .line 401
    .line 402
    const/16 v19, 0xff

    .line 403
    .line 404
    const/4 v10, 0x0

    .line 405
    const/4 v11, 0x0

    .line 406
    const/4 v12, 0x0

    .line 407
    const/4 v13, 0x0

    .line 408
    const/4 v14, 0x0

    .line 409
    const/4 v15, 0x0

    .line 410
    const/16 v16, 0x0

    .line 411
    .line 412
    const/16 v17, 0x0

    .line 413
    .line 414
    invoke-static/range {v9 .. v19}, La/d1z;->a(La/d1z;ZZILa/zdm0;La/nc5;La/n3q;Ljava/util/ArrayList;La/hxs0;ZI)La/d1z;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_f

    .line 423
    .line 424
    return-void

    .line 425
    :cond_10
    sget-object v2, La/h0z;->a:La/h0z;

    .line 426
    .line 427
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-eqz v1, :cond_11

    .line 432
    .line 433
    invoke-virtual {v0, v8}, La/u1z;->M(Z)V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 438
    .line 439
    .line 440
    return-void
.end method
