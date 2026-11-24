.class public final La/ndv;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic A:I


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:La/mne;

.field public final q:La/i1w0;

.field public final r:La/pyu;

.field public final s:La/n1u;

.field public final t:La/n1u;

.field public final u:La/fvt0;

.field public final v:La/n1u;

.field public final w:La/yfu;

.field public final x:La/duj;

.field public y:La/bby;

.field public z:La/bby;


# direct methods
.method public constructor <init>(La/ctf0;Ljava/lang/String;La/mne;La/i1w0;La/pyu;La/n1u;La/n1u;La/fvt0;La/n1u;La/yfu;La/ocl;La/m1e;La/duj;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/ldv;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    invoke-direct {v2, v6}, La/ldv;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/cz;

    .line 14
    .line 15
    const/16 v0, 0xf

    .line 16
    .line 17
    move-object/from16 v1, p11

    .line 18
    .line 19
    invoke-direct {v3, p1, v1, v0}, La/cz;-><init>(La/ctf0;La/ocl;B)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p3, La/mne;->c:La/vs10;

    .line 23
    .line 24
    iget-object v0, p3, La/mne;->a:La/rwj;

    .line 25
    .line 26
    invoke-static {p1, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v1, 0x0

    .line 32
    move-object v0, p0

    .line 33
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, La/ndv;->o:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p3, p0, La/ndv;->p:La/mne;

    .line 39
    .line 40
    iput-object p4, p0, La/ndv;->q:La/i1w0;

    .line 41
    .line 42
    iput-object p5, p0, La/ndv;->r:La/pyu;

    .line 43
    .line 44
    iput-object p6, p0, La/ndv;->s:La/n1u;

    .line 45
    .line 46
    iput-object p7, p0, La/ndv;->t:La/n1u;

    .line 47
    .line 48
    iput-object p8, p0, La/ndv;->u:La/fvt0;

    .line 49
    .line 50
    move-object/from16 p1, p9

    .line 51
    .line 52
    iput-object p1, p0, La/ndv;->v:La/n1u;

    .line 53
    .line 54
    move-object/from16 p1, p10

    .line 55
    .line 56
    iput-object p1, p0, La/ndv;->w:La/yfu;

    .line 57
    .line 58
    move-object/from16 p1, p13

    .line 59
    .line 60
    iput-object p1, p0, La/ndv;->x:La/duj;

    .line 61
    .line 62
    invoke-interface/range {p12 .. p12}, La/m1e;->a()La/gmq;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p2, La/mdv;

    .line 67
    .line 68
    const/4 p4, 0x0

    .line 69
    const/4 p5, 0x1

    .line 70
    invoke-direct {p2, p0, p4, p5}, La/mdv;-><init>(La/ndv;La/yje;B)V

    .line 71
    .line 72
    .line 73
    new-instance p4, La/fnq;

    .line 74
    .line 75
    const/4 p5, 0x4

    .line 76
    invoke-direct {p4, p1, p2, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p3, La/mne;->b:La/dvj;

    .line 84
    .line 85
    invoke-static {p1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p4, p1}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v6}, La/ndv;->M(Z)V

    .line 93
    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final M(Z)V
    .locals 14

    .line 1
    iget-object v0, p0, La/ndv;->y:La/bby;

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
    iget-object v0, p0, La/ndv;->p:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/vft;

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v13, 0x7

    .line 25
    const/4 v7, 0x1

    .line 26
    const-class v9, La/ndv;

    .line 27
    .line 28
    const-string v10, "handleException"

    .line 29
    .line 30
    const-string v11, "handleException(Ljava/lang/Throwable;)V"

    .line 31
    .line 32
    move-object v8, p0

    .line 33
    move-object v6, v3

    .line 34
    invoke-direct/range {v6 .. v13}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 35
    .line 36
    .line 37
    new-instance v6, La/ys8;

    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    const/16 v0, 0xb

    .line 41
    .line 42
    invoke-direct {v6, p1, v8, p0, v0}, La/ys8;-><init>(ZLjava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/16 v7, 0xa

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iput-object p0, v8, La/ndv;->y:La/bby;

    .line 53
    .line 54
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, La/zcv;

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
    sget-object v0, La/ycv;->a:La/ycv;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object v0, La/ucv;->a:La/ucv;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, La/ndv;->u:La/fvt0;

    .line 30
    .line 31
    iget-object p1, p1, La/fvt0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, La/dgu;

    .line 34
    .line 35
    iget-object p1, p1, La/dgu;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/pcv;

    .line 38
    .line 39
    iget-object p1, p1, La/pcv;->a:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/ndv;->q:La/i1w0;

    .line 45
    .line 46
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v0, La/c8d;

    .line 51
    .line 52
    sget-object v1, La/y7d;->a:La/v7d;

    .line 53
    .line 54
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 55
    .line 56
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    move-object v0, p1

    .line 65
    check-cast v0, La/paw;

    .line 66
    .line 67
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_9

    .line 72
    .line 73
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, La/oe50;

    .line 78
    .line 79
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    sget-object v0, La/vcv;->a:La/vcv;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, La/fdv;

    .line 96
    .line 97
    iget-object p1, p1, La/fdv;->d:Ljava/util/List;

    .line 98
    .line 99
    new-instance v0, Ljava/util/ArrayList;

    .line 100
    .line 101
    const/16 v1, 0xa

    .line 102
    .line 103
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, La/ajh0;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v2, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;

    .line 130
    .line 131
    iget-object v3, v1, La/ajh0;->a:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v4, v1, La/ajh0;->b:Ljava/lang/String;

    .line 134
    .line 135
    iget-boolean v1, v1, La/ajh0;->c:Z

    .line 136
    .line 137
    invoke-direct {v2, v3, v4, v1}, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    new-instance p1, La/edv;

    .line 145
    .line 146
    invoke-direct {p1, v0}, La/edv;-><init>(Ljava/util/ArrayList;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_3
    sget-object v0, La/wcv;->a:La/wcv;

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    const/4 p1, 0x1

    .line 162
    invoke-virtual {p0, p1}, La/ndv;->M(Z)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_4
    instance-of v0, p1, La/xcv;

    .line 167
    .line 168
    if-eqz v0, :cond_a

    .line 169
    .line 170
    check-cast p1, La/xcv;

    .line 171
    .line 172
    iget-object p1, p1, La/xcv;->a:Ljava/lang/String;

    .line 173
    .line 174
    iget-object v0, p0, La/ndv;->s:La/n1u;

    .line 175
    .line 176
    iget-object v0, v0, La/n1u;->a:La/dgu;

    .line 177
    .line 178
    iget-object v0, v0, La/dgu;->c:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/pcv;

    .line 181
    .line 182
    iget-object v0, v0, La/pcv;->a:Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    const/4 v2, 0x0

    .line 193
    if-eqz v1, :cond_6

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    move-object v3, v1

    .line 200
    check-cast v3, La/ajh0;

    .line 201
    .line 202
    iget-boolean v3, v3, La/ajh0;->c:Z

    .line 203
    .line 204
    if-eqz v3, :cond_5

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_6
    move-object v1, v2

    .line 208
    :goto_2
    check-cast v1, La/ajh0;

    .line 209
    .line 210
    if-eqz v1, :cond_7

    .line 211
    .line 212
    iget-object v0, v1, La/ajh0;->a:Ljava/lang/String;

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_7
    const-string v0, ""

    .line 216
    .line 217
    :goto_3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-nez v1, :cond_9

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_8

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_8
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    iget-object v0, p0, La/ndv;->p:La/mne;

    .line 235
    .line 236
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 237
    .line 238
    new-instance v4, La/umu;

    .line 239
    .line 240
    const/4 v0, 0x7

    .line 241
    invoke-direct {v4, v0}, La/umu;-><init>(B)V

    .line 242
    .line 243
    .line 244
    new-instance v7, La/u5u;

    .line 245
    .line 246
    const/16 v0, 0x9

    .line 247
    .line 248
    invoke-direct {v7, p0, p1, v2, v0}, La/u5u;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 249
    .line 250
    .line 251
    const/16 v8, 0xa

    .line 252
    .line 253
    const/4 v5, 0x0

    .line 254
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 255
    .line 256
    .line 257
    :cond_9
    :goto_4
    return-void

    .line 258
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 259
    .line 260
    .line 261
    return-void
.end method
