.class public final La/mgv0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/mne;

.field public final p:La/owp0;

.field public final q:La/lbu;

.field public final r:La/i1w0;

.field public s:La/c4m0;

.field public final t:La/bby;

.field public final u:La/p7m0;

.field public final v:La/p7m0;


# direct methods
.method public constructor <init>(La/mne;La/owp0;La/lbu;La/ctf0;La/ocl;La/i1w0;)V
    .locals 8

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/avs0;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/16 v7, 0xb

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    sget-object v2, La/dgv0;->e:La/cgv0;

    .line 14
    .line 15
    const-class v3, La/cgv0;

    .line 16
    .line 17
    const-string v4, "default"

    .line 18
    .line 19
    const-string v5, "default()Lorg/xplatform/wild_free_bet/impl/presentation/select_game/models/WildFreeBetSelectGameState;"

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, La/avs0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    new-instance v3, La/gpb0;

    .line 25
    .line 26
    const/16 v1, 0x15

    .line 27
    .line 28
    invoke-direct {v3, p4, p5, v1}, La/gpb0;-><init>(La/ctf0;La/ocl;B)V

    .line 29
    .line 30
    .line 31
    iget-object p4, p1, La/mne;->c:La/vs10;

    .line 32
    .line 33
    iget-object p5, p1, La/mne;->a:La/rwj;

    .line 34
    .line 35
    invoke-static {p4, p5}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v1, 0x0

    .line 41
    move-object v2, v0

    .line 42
    move-object v0, p0

    .line 43
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v0, La/mgv0;->o:La/mne;

    .line 47
    .line 48
    iput-object p2, v0, La/mgv0;->p:La/owp0;

    .line 49
    .line 50
    iput-object p3, v0, La/mgv0;->q:La/lbu;

    .line 51
    .line 52
    iput-object p6, v0, La/mgv0;->r:La/i1w0;

    .line 53
    .line 54
    sget-object p0, La/iun;->a:La/iun;

    .line 55
    .line 56
    invoke-static {p0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    iput-object p0, v0, La/mgv0;->u:La/p7m0;

    .line 61
    .line 62
    const-string p0, ""

    .line 63
    .line 64
    invoke-static {p0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iput-object p0, v0, La/mgv0;->v:La/p7m0;

    .line 69
    .line 70
    iget-object p0, v0, La/mgv0;->t:La/bby;

    .line 71
    .line 72
    const/4 p2, 0x0

    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    invoke-interface {p0, p2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v4, p1, La/mne;->b:La/dvj;

    .line 83
    .line 84
    sget-object v2, La/hgv0;->a:La/hgv0;

    .line 85
    .line 86
    new-instance v5, La/k6s0;

    .line 87
    .line 88
    const/16 p0, 0x1a

    .line 89
    .line 90
    invoke-direct {v5, v0, p2, p0}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 91
    .line 92
    .line 93
    const/16 v6, 0xa

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iput-object p0, v0, La/mgv0;->t:La/bby;

    .line 101
    .line 102
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
    check-cast v0, La/dgv0;

    .line 6
    .line 7
    iget-boolean v0, v0, La/dgv0;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 12
    .line 13
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, La/dgv0;

    .line 24
    .line 25
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    const/16 v7, 0xb

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, La/dgv0;->a(La/dgv0;ZLjava/lang/String;ZLjava/util/List;I)La/dgv0;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    iget-object p0, p0, La/mgv0;->v:La/p7m0;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    const-string v1, ""

    .line 53
    .line 54
    invoke-virtual {p0, v0, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    iget-object p0, p0, La/mgv0;->r:La/i1w0;

    .line 59
    .line 60
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, La/c8d;

    .line 65
    .line 66
    sget-object v2, La/y7d;->a:La/v7d;

    .line 67
    .line 68
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 69
    .line 70
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_0
    move-object v1, v0

    .line 79
    check-cast v1, La/paw;

    .line 80
    .line 81
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/oe50;

    .line 92
    .line 93
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 10

    .line 1
    check-cast p1, La/yfv0;

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
    instance-of v0, p1, La/qfv0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    check-cast p1, La/qfv0;

    .line 17
    .line 18
    iget-object p1, p1, La/qfv0;->a:La/m9n;

    .line 19
    .line 20
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/dgv0;

    .line 25
    .line 26
    iget-object v0, v0, La/dgv0;->d:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, La/pbv;

    .line 44
    .line 45
    invoke-interface {p1}, La/m9n;->getId()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    iget-wide v8, v5, La/pbv;->a:J

    .line 50
    .line 51
    cmp-long v5, v6, v8

    .line 52
    .line 53
    if-nez v5, :cond_0

    .line 54
    .line 55
    move-object v3, v4

    .line 56
    :cond_1
    check-cast v3, La/pbv;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    iget-boolean v0, v3, La/pbv;->p:Z

    .line 61
    .line 62
    if-ne v0, v2, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-interface {p1}, La/m9n;->getId()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    iget-object p1, p0, La/mgv0;->p:La/owp0;

    .line 70
    .line 71
    iget-object p1, p1, La/owp0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, La/ikt0;

    .line 74
    .line 75
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, La/pfv0;

    .line 78
    .line 79
    iget-object p1, p1, La/pfv0;->a:La/qoj0;

    .line 80
    .line 81
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, La/mgv0;->r:La/i1w0;

    .line 89
    .line 90
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance v0, La/c8d;

    .line 95
    .line 96
    sget-object v2, La/y7d;->a:La/v7d;

    .line 97
    .line 98
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 99
    .line 100
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :goto_0
    move-object v0, p1

    .line 108
    check-cast v0, La/paw;

    .line 109
    .line 110
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/oe50;

    .line 121
    .line 122
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    instance-of v0, p1, La/sfv0;

    .line 127
    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    invoke-virtual {p0}, La/mgv0;->M()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_4
    instance-of v0, p1, La/tfv0;

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    iget-object p0, p0, La/mgv0;->s:La/c4m0;

    .line 139
    .line 140
    if-eqz p0, :cond_5

    .line 141
    .line 142
    invoke-virtual {p0, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    :goto_1
    return-void

    .line 146
    :cond_6
    instance-of v0, p1, La/ufv0;

    .line 147
    .line 148
    iget-object v4, p0, La/mgv0;->v:La/p7m0;

    .line 149
    .line 150
    if-eqz v0, :cond_8

    .line 151
    .line 152
    iget-object p1, p0, La/mgv0;->s:La/c4m0;

    .line 153
    .line 154
    if-eqz p1, :cond_7

    .line 155
    .line 156
    invoke-virtual {p1, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    sget-object p1, La/kgv0;->h:La/kgv0;

    .line 160
    .line 161
    new-instance v0, La/p6d;

    .line 162
    .line 163
    iget-object v5, p0, La/mgv0;->u:La/p7m0;

    .line 164
    .line 165
    invoke-direct {v0, v5, v4, p1, v2}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 166
    .line 167
    .line 168
    new-instance p1, La/wup0;

    .line 169
    .line 170
    const/16 v4, 0x14

    .line 171
    .line 172
    invoke-direct {p1, p0, v3, v4}, La/wup0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 173
    .line 174
    .line 175
    new-instance v4, La/fnq;

    .line 176
    .line 177
    const/4 v5, 0x4

    .line 178
    invoke-direct {v4, v0, p1, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 179
    .line 180
    .line 181
    new-instance p1, La/lgv0;

    .line 182
    .line 183
    invoke-direct {p1, p0, v3, v1}, La/lgv0;-><init>(La/mgv0;La/yje;B)V

    .line 184
    .line 185
    .line 186
    new-instance v0, La/fnq;

    .line 187
    .line 188
    invoke-direct {v0, v4, p1, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 189
    .line 190
    .line 191
    new-instance p1, La/rf0;

    .line 192
    .line 193
    const/16 v1, 0xd

    .line 194
    .line 195
    invoke-direct {p1, v0, v1}, La/rf0;-><init>(La/fnq;B)V

    .line 196
    .line 197
    .line 198
    new-instance v0, La/lgv0;

    .line 199
    .line 200
    invoke-direct {v0, p0, v3, v2}, La/lgv0;-><init>(La/mgv0;La/yje;B)V

    .line 201
    .line 202
    .line 203
    new-instance v1, La/fnq;

    .line 204
    .line 205
    invoke-direct {v1, p1, v0, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 206
    .line 207
    .line 208
    new-instance p1, La/pyn0;

    .line 209
    .line 210
    const/4 v0, 0x3

    .line 211
    const/16 v4, 0x8

    .line 212
    .line 213
    invoke-direct {p1, v0, v3, v4}, La/pyn0;-><init>(ILa/yje;B)V

    .line 214
    .line 215
    .line 216
    new-instance v0, La/dnq;

    .line 217
    .line 218
    invoke-direct {v0, v1, p1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 219
    .line 220
    .line 221
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    iget-object v1, p0, La/mgv0;->o:La/mne;

    .line 226
    .line 227
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 228
    .line 229
    invoke-static {p1, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    sget-object v1, La/foe;->h:La/foe;

    .line 234
    .line 235
    invoke-static {v0, p1, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iput-object p1, p0, La/mgv0;->s:La/c4m0;

    .line 240
    .line 241
    return-void

    .line 242
    :cond_8
    instance-of v0, p1, La/rfv0;

    .line 243
    .line 244
    if-eqz v0, :cond_9

    .line 245
    .line 246
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_9
    instance-of v0, p1, La/wfv0;

    .line 251
    .line 252
    if-eqz v0, :cond_b

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    const-string p1, ""

    .line 258
    .line 259
    invoke-virtual {v4, v3, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 263
    .line 264
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 265
    .line 266
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-object v1, p1

    .line 274
    check-cast v1, La/dgv0;

    .line 275
    .line 276
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    const/4 v5, 0x0

    .line 282
    const/16 v6, 0xb

    .line 283
    .line 284
    const/4 v2, 0x0

    .line 285
    const/4 v3, 0x0

    .line 286
    const/4 v4, 0x1

    .line 287
    invoke-static/range {v1 .. v6}, La/dgv0;->a(La/dgv0;ZLjava/lang/String;ZLjava/util/List;I)La/dgv0;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    if-eqz p1, :cond_a

    .line 296
    .line 297
    return-void

    .line 298
    :cond_b
    instance-of v0, p1, La/vfv0;

    .line 299
    .line 300
    if-eqz v0, :cond_c

    .line 301
    .line 302
    invoke-virtual {p0}, La/mgv0;->M()V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_c
    instance-of p0, p1, La/xfv0;

    .line 307
    .line 308
    if-eqz p0, :cond_d

    .line 309
    .line 310
    check-cast p1, La/xfv0;

    .line 311
    .line 312
    iget-object p0, p1, La/xfv0;->a:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v4, v3, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 322
    .line 323
    .line 324
    return-void
.end method
