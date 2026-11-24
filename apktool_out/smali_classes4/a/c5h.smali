.class public final La/c5h;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;

.field public final c:La/lbu;

.field public final d:La/hzg;

.field public final e:La/pru;

.field public final f:La/hvt;

.field public final g:La/poq0;

.field public final h:La/s31;

.field public final i:La/ih5;

.field public final j:La/m1e;

.field public final k:La/duj;

.field public final l:La/rpt;

.field public final m:La/mne;

.field public final n:La/cyu;

.field public final o:La/zr1;

.field public final p:La/ctf0;

.field public final q:La/p7m0;

.field public final r:La/ol60;

.field public final s:La/n0o0;

.field public final t:La/p7m0;

.field public u:La/bby;

.field public v:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;La/lbu;La/hzg;La/pru;La/hvt;La/poq0;La/s31;La/ih5;La/m1e;La/duj;La/rpt;La/mne;La/cyu;La/zr1;La/ctf0;)V
    .locals 6

    .line 1
    move-object/from16 v0, p15

    .line 2
    .line 3
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, La/w46;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/c5h;->b:Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;

    .line 13
    .line 14
    iput-object p2, p0, La/c5h;->c:La/lbu;

    .line 15
    .line 16
    iput-object p3, p0, La/c5h;->d:La/hzg;

    .line 17
    .line 18
    iput-object p4, p0, La/c5h;->e:La/pru;

    .line 19
    .line 20
    iput-object p5, p0, La/c5h;->f:La/hvt;

    .line 21
    .line 22
    iput-object p6, p0, La/c5h;->g:La/poq0;

    .line 23
    .line 24
    iput-object p7, p0, La/c5h;->h:La/s31;

    .line 25
    .line 26
    iput-object p8, p0, La/c5h;->i:La/ih5;

    .line 27
    .line 28
    iput-object p9, p0, La/c5h;->j:La/m1e;

    .line 29
    .line 30
    move-object/from16 p2, p10

    .line 31
    .line 32
    iput-object p2, p0, La/c5h;->k:La/duj;

    .line 33
    .line 34
    move-object/from16 p2, p11

    .line 35
    .line 36
    iput-object p2, p0, La/c5h;->l:La/rpt;

    .line 37
    .line 38
    move-object/from16 p2, p12

    .line 39
    .line 40
    iput-object p2, p0, La/c5h;->m:La/mne;

    .line 41
    .line 42
    move-object/from16 p2, p13

    .line 43
    .line 44
    iput-object p2, p0, La/c5h;->n:La/cyu;

    .line 45
    .line 46
    move-object/from16 p2, p14

    .line 47
    .line 48
    iput-object p2, p0, La/c5h;->o:La/zr1;

    .line 49
    .line 50
    iput-object v0, p0, La/c5h;->p:La/ctf0;

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    new-array p3, p2, [Ljava/lang/Object;

    .line 54
    .line 55
    iget-object p4, v0, La/ctf0;->b:La/lsm0;

    .line 56
    .line 57
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    const v0, 0x7f1311bf

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4, v0, p3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    instance-of v0, p1, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;

    .line 69
    .line 70
    check-cast p1, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;

    .line 71
    .line 72
    iget-object p1, p1, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 73
    .line 74
    instance-of p1, p1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 75
    .line 76
    if-eqz p1, :cond_0

    .line 77
    .line 78
    if-nez v0, :cond_0

    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    move p1, p2

    .line 83
    :goto_0
    new-array v1, p2, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const v2, 0x7f130616

    .line 90
    .line 91
    .line 92
    invoke-virtual {p4, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    new-instance v1, La/l120;

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    const/4 v3, 0x1

    .line 100
    const-string v4, ""

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    move/from16 p13, p1

    .line 104
    .line 105
    move-object p7, p3

    .line 106
    move-object p6, p4

    .line 107
    move/from16 p11, v0

    .line 108
    .line 109
    move-object p5, v1

    .line 110
    move/from16 p10, v2

    .line 111
    .line 112
    move/from16 p12, v3

    .line 113
    .line 114
    move-object p8, v4

    .line 115
    move p9, v5

    .line 116
    invoke-direct/range {p5 .. p13}, La/l120;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 117
    .line 118
    .line 119
    move-object p1, p5

    .line 120
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iput-object p1, p0, La/c5h;->q:La/p7m0;

    .line 125
    .line 126
    new-instance p1, La/ol60;

    .line 127
    .line 128
    const/4 p3, 0x3

    .line 129
    invoke-direct {p1, p3}, La/ol60;-><init>(I)V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, La/c5h;->r:La/ol60;

    .line 133
    .line 134
    new-instance p1, La/e8g;

    .line 135
    .line 136
    const/16 p3, 0xf

    .line 137
    .line 138
    invoke-direct {p1, p0, p3}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iput-object p1, p0, La/c5h;->s:La/n0o0;

    .line 146
    .line 147
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Ljava/util/List;

    .line 152
    .line 153
    new-instance p3, Ljava/util/ArrayList;

    .line 154
    .line 155
    const/16 p4, 0xa

    .line 156
    .line 157
    invoke-static {p1, p4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 158
    .line 159
    .line 160
    move-result p4

    .line 161
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p4

    .line 172
    const/4 v0, 0x0

    .line 173
    if-eqz p4, :cond_4

    .line 174
    .line 175
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p4

    .line 179
    check-cast p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 180
    .line 181
    iget-object v1, p0, La/c5h;->p:La/ctf0;

    .line 182
    .line 183
    if-eqz p4, :cond_3

    .line 184
    .line 185
    instance-of v2, p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 186
    .line 187
    if-eqz v2, :cond_1

    .line 188
    .line 189
    const v0, 0x7f1305f8

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_1
    instance-of v2, p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 194
    .line 195
    if-eqz v2, :cond_2

    .line 196
    .line 197
    const v0, 0x7f1305f9

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_2
    instance-of v2, p4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 202
    .line 203
    if-eqz v2, :cond_3

    .line 204
    .line 205
    const v0, 0x7f1305f7

    .line 206
    .line 207
    .line 208
    :goto_2
    new-array v2, p2, [Ljava/lang/Object;

    .line 209
    .line 210
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 211
    .line 212
    invoke-static {v2, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v1, v0, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    new-instance v1, La/qz10;

    .line 221
    .line 222
    invoke-direct {v1, v0, p4}, La/qz10;-><init>(Ljava/lang/String;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :cond_4
    iget-object p1, p0, La/c5h;->s:La/n0o0;

    .line 234
    .line 235
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    check-cast p1, Ljava/util/List;

    .line 240
    .line 241
    iget-object p4, p0, La/c5h;->b:Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;

    .line 242
    .line 243
    check-cast p4, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;

    .line 244
    .line 245
    iget-object p4, p4, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 246
    .line 247
    invoke-interface {p1, p4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    const/4 p4, -0x1

    .line 252
    if-eq p1, p4, :cond_5

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_5
    move p1, p2

    .line 256
    :goto_3
    new-instance p4, La/rz10;

    .line 257
    .line 258
    iget-object v1, p0, La/c5h;->e:La/pru;

    .line 259
    .line 260
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-static {v1}, La/ucx;->X(La/sff0;)La/dxh0;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-direct {p4, p3, v1, p1}, La/rz10;-><init>(Ljava/util/List;La/dxh0;I)V

    .line 269
    .line 270
    .line 271
    invoke-static {p4}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    iput-object p1, p0, La/c5h;->t:La/p7m0;

    .line 276
    .line 277
    iget-object p1, p0, La/c5h;->j:La/m1e;

    .line 278
    .line 279
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    new-instance p3, La/a5h;

    .line 284
    .line 285
    invoke-direct {p3, p0, v0, p2}, La/a5h;-><init>(La/c5h;La/yje;B)V

    .line 286
    .line 287
    .line 288
    new-instance p2, La/fnq;

    .line 289
    .line 290
    const/4 p4, 0x4

    .line 291
    invoke-direct {p2, p1, p3, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 292
    .line 293
    .line 294
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    iget-object p0, p0, La/c5h;->m:La/mne;

    .line 299
    .line 300
    iget-object p0, p0, La/mne;->b:La/dvj;

    .line 301
    .line 302
    invoke-static {p1, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-static {p2, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 307
    .line 308
    .line 309
    return-void
.end method


# virtual methods
.method public final w()V
    .locals 11

    .line 1
    iget-object v0, p0, La/c5h;->v:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-instance v3, La/x6f;

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    const/16 v10, 0x1c

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    iget-object v5, p0, La/c5h;->k:La/duj;

    .line 20
    .line 21
    const-class v6, La/duj;

    .line 22
    .line 23
    const-string v7, "handleError"

    .line 24
    .line 25
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 26
    .line 27
    invoke-direct/range {v3 .. v10}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, La/c5h;->m:La/mne;

    .line 31
    .line 32
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 33
    .line 34
    new-instance v6, La/a5h;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-direct {v6, p0, v1, v0}, La/a5h;-><init>(La/c5h;La/yje;B)V

    .line 38
    .line 39
    .line 40
    const/16 v7, 0xa

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, La/c5h;->v:La/bby;

    .line 48
    .line 49
    return-void
.end method
