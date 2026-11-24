.class public final La/gb00;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:J

.field public final q:La/mne;

.field public final r:La/i1w0;

.field public final s:La/e1u;

.field public final t:La/duj;

.field public final u:La/rl70;

.field public final v:La/c4m0;

.field public w:La/bby;


# direct methods
.method public constructor <init>(Ljava/lang/String;JILa/mne;La/i1w0;La/ocl;La/m1e;La/e1u;La/duj;La/rl70;La/wyu;La/uyu;La/r9u;La/ctf0;)V
    .locals 11

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, La/mne;->c:La/vs10;

    .line 16
    .line 17
    iget-object v2, v0, La/mne;->b:La/dvj;

    .line 18
    .line 19
    iget-object v3, v0, La/mne;->a:La/rwj;

    .line 20
    .line 21
    invoke-static {v1, v3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v3, La/bh1;

    .line 26
    .line 27
    const/4 v4, 0x5

    .line 28
    move-object/from16 v6, p12

    .line 29
    .line 30
    move-object/from16 v7, p14

    .line 31
    .line 32
    invoke-direct {v3, v6, v7, p4, v4}, La/bh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 33
    .line 34
    .line 35
    new-instance v5, La/mz0;

    .line 36
    .line 37
    const/16 v10, 0x15

    .line 38
    .line 39
    move-wide v8, p2

    .line 40
    move-object/from16 v7, p7

    .line 41
    .line 42
    move-object/from16 v6, p15

    .line 43
    .line 44
    invoke-direct/range {v5 .. v10}, La/mz0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {p0, v3, v1, v5, v4}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, La/gb00;->o:Ljava/lang/String;

    .line 52
    .line 53
    iput-wide p2, p0, La/gb00;->p:J

    .line 54
    .line 55
    iput-object v0, p0, La/gb00;->q:La/mne;

    .line 56
    .line 57
    move-object/from16 p1, p6

    .line 58
    .line 59
    iput-object p1, p0, La/gb00;->r:La/i1w0;

    .line 60
    .line 61
    move-object/from16 p1, p9

    .line 62
    .line 63
    iput-object p1, p0, La/gb00;->s:La/e1u;

    .line 64
    .line 65
    move-object/from16 p1, p10

    .line 66
    .line 67
    iput-object p1, p0, La/gb00;->t:La/duj;

    .line 68
    .line 69
    move-object/from16 p1, p11

    .line 70
    .line 71
    iput-object p1, p0, La/gb00;->u:La/rl70;

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    invoke-virtual {p0, p1}, La/gb00;->M(Z)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, La/gb00;->v:La/c4m0;

    .line 78
    .line 79
    const/4 p2, 0x4

    .line 80
    if-eqz p1, :cond_0

    .line 81
    .line 82
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const/4 p3, 0x1

    .line 87
    if-ne p1, p3, :cond_0

    .line 88
    .line 89
    :goto_0
    move-object/from16 p1, p13

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_0
    invoke-interface/range {p8 .. p8}, La/m1e;->b()La/gmq;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance p3, La/slx;

    .line 97
    .line 98
    const/16 v0, 0xf

    .line 99
    .line 100
    invoke-direct {p3, p0, v4, v0}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 101
    .line 102
    .line 103
    new-instance v0, La/fnq;

    .line 104
    .line 105
    invoke-direct {v0, p1, p3, p2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    sget-object p3, La/foe;->h:La/foe;

    .line 117
    .line 118
    invoke-static {v0, p1, p3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, La/gb00;->v:La/c4m0;

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :goto_1
    iget-object p1, p1, La/uyu;->a:La/v6j0;

    .line 126
    .line 127
    invoke-virtual {p1}, La/v6j0;->h()La/qz40;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance p3, La/kaw;

    .line 132
    .line 133
    const/16 v0, 0x12

    .line 134
    .line 135
    invoke-direct {p3, p0, v4, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 136
    .line 137
    .line 138
    new-instance v0, La/fnq;

    .line 139
    .line 140
    invoke-direct {v0, p1, p3, p2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 141
    .line 142
    .line 143
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {v0, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 152
    .line 153
    .line 154
    return-void
.end method


# virtual methods
.method public final M(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, La/gb00;->w:La/bby;

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
    iget-object v0, p0, La/gb00;->q:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/ebz;

    .line 22
    .line 23
    const/16 v0, 0x1a

    .line 24
    .line 25
    invoke-direct {v3, p0, v0}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v6, La/u88;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    const/16 v1, 0x1c

    .line 32
    .line 33
    invoke-direct {v6, p1, p0, v0, v1}, La/u88;-><init>(ZLjava/lang/Object;La/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v7, 0xa

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/gb00;->w:La/bby;

    .line 44
    .line 45
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/aa00;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, La/y900;->a:La/y900;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, La/gb00;->M(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v2, La/v900;->a:La/v900;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-object v3, v0, La/gb00;->r:La/i1w0;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, La/c8d;

    .line 38
    .line 39
    sget-object v2, La/y7d;->a:La/v7d;

    .line 40
    .line 41
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 42
    .line 43
    invoke-direct {v1, v2, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static {v0, v1, v3, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    move-object v1, v0

    .line 52
    check-cast v1, La/paw;

    .line 53
    .line 54
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_a

    .line 59
    .line 60
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/oe50;

    .line 65
    .line 66
    invoke-virtual {v3, v1}, La/i1w0;->a(La/oe50;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    instance-of v2, v1, La/w900;

    .line 71
    .line 72
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 73
    .line 74
    iget-object v5, v0, La/i3t0;->i:La/ocj;

    .line 75
    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    check-cast v1, La/w900;

    .line 79
    .line 80
    iget-wide v6, v1, La/w900;->a:J

    .line 81
    .line 82
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/ma00;

    .line 87
    .line 88
    iget v0, v0, La/ma00;->c:I

    .line 89
    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    iget-object v0, v5, La/ocj;->a:La/p7m0;

    .line 93
    .line 94
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-object v8, v1

    .line 102
    check-cast v8, La/ma00;

    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    long-to-int v12, v6

    .line 108
    const/4 v15, 0x0

    .line 109
    const/16 v16, 0xf7

    .line 110
    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    invoke-static/range {v8 .. v16}, La/ma00;->a(La/ma00;ZZIIILa/l800;La/uaq0;I)La/ma00;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_2

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    iget-object v2, v5, La/ocj;->a:La/p7m0;

    .line 128
    .line 129
    :cond_4
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-object v8, v0

    .line 137
    check-cast v8, La/ma00;

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    long-to-int v13, v6

    .line 143
    const/4 v15, 0x0

    .line 144
    const/16 v16, 0xef

    .line 145
    .line 146
    const/4 v9, 0x0

    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v11, 0x0

    .line 149
    const/4 v12, 0x0

    .line 150
    const/4 v14, 0x0

    .line 151
    invoke-static/range {v8 .. v16}, La/ma00;->a(La/ma00;ZZIIILa/l800;La/uaq0;I)La/ma00;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    return-void

    .line 162
    :cond_5
    instance-of v2, v1, La/x900;

    .line 163
    .line 164
    if-eqz v2, :cond_6

    .line 165
    .line 166
    check-cast v1, La/x900;

    .line 167
    .line 168
    iget-object v1, v1, La/x900;->a:Ljava/lang/String;

    .line 169
    .line 170
    new-instance v2, La/u400;

    .line 171
    .line 172
    const/4 v4, 0x4

    .line 173
    invoke-direct {v2, v0, v1, v4}, La/u400;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_6
    instance-of v2, v1, La/z900;

    .line 181
    .line 182
    if-eqz v2, :cond_8

    .line 183
    .line 184
    iget-object v2, v5, La/ocj;->a:La/p7m0;

    .line 185
    .line 186
    :cond_7
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-object v5, v0

    .line 194
    check-cast v5, La/ma00;

    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-object v3, v1

    .line 200
    check-cast v3, La/z900;

    .line 201
    .line 202
    iget v8, v3, La/z900;->a:I

    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    const/16 v13, 0xfb

    .line 206
    .line 207
    const/4 v6, 0x0

    .line 208
    const/4 v7, 0x0

    .line 209
    const/4 v9, 0x0

    .line 210
    const/4 v10, 0x0

    .line 211
    const/4 v11, 0x0

    .line 212
    invoke-static/range {v5 .. v13}, La/ma00;->a(La/ma00;ZZIIILa/l800;La/uaq0;I)La/ma00;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_7

    .line 221
    .line 222
    return-void

    .line 223
    :cond_8
    instance-of v1, v1, La/u900;

    .line 224
    .line 225
    if-eqz v1, :cond_a

    .line 226
    .line 227
    iget-object v1, v0, La/gb00;->w:La/bby;

    .line 228
    .line 229
    const/4 v2, 0x0

    .line 230
    if-eqz v1, :cond_9

    .line 231
    .line 232
    invoke-interface {v1, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 233
    .line 234
    .line 235
    :cond_9
    iget-object v0, v0, La/gb00;->v:La/c4m0;

    .line 236
    .line 237
    if-eqz v0, :cond_a

    .line 238
    .line 239
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 240
    .line 241
    .line 242
    :cond_a
    return-void
.end method
