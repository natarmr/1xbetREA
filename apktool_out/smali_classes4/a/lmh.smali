.class public final La/lmh;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic A:I


# instance fields
.field public final o:Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;

.field public final p:La/mne;

.field public final q:La/hzg;

.field public final r:La/oeg0;

.field public final s:La/a7q;

.field public final t:La/reu;

.field public final u:La/ctf0;

.field public final v:La/m1e;

.field public w:La/bby;

.field public x:La/c4m0;

.field public y:La/c4m0;

.field public z:Z


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;La/mne;La/hzg;La/oeg0;La/a7q;La/reu;La/ctf0;La/g2v;La/m1e;)V
    .locals 4

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p2, La/mne;->c:La/vs10;

    .line 11
    .line 12
    iget-object v1, p2, La/mne;->a:La/rwj;

    .line 13
    .line 14
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/bmh;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, v2}, La/bmh;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/o20;

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    invoke-direct {v2, p7, p8, v3}, La/o20;-><init>(La/ctf0;La/g2v;B)V

    .line 28
    .line 29
    .line 30
    const/4 p8, 0x0

    .line 31
    invoke-direct {p0, v1, v0, v2, p8}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/lmh;->o:Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;

    .line 35
    .line 36
    iput-object p2, p0, La/lmh;->p:La/mne;

    .line 37
    .line 38
    iput-object p3, p0, La/lmh;->q:La/hzg;

    .line 39
    .line 40
    iput-object p4, p0, La/lmh;->r:La/oeg0;

    .line 41
    .line 42
    iput-object p5, p0, La/lmh;->s:La/a7q;

    .line 43
    .line 44
    iput-object p6, p0, La/lmh;->t:La/reu;

    .line 45
    .line 46
    iput-object p7, p0, La/lmh;->u:La/ctf0;

    .line 47
    .line 48
    iput-object p9, p0, La/lmh;->v:La/m1e;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 7

    .line 1
    iget-object v0, p0, La/lmh;->w:La/bby;

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
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v0, p0, La/lmh;->p:La/mne;

    .line 13
    .line 14
    iget-object v4, v0, La/mne;->b:La/dvj;

    .line 15
    .line 16
    new-instance v2, La/hfg;

    .line 17
    .line 18
    const/16 v0, 0x15

    .line 19
    .line 20
    invoke-direct {v2, p0, v0}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance v5, La/ya;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    const/16 v3, 0x14

    .line 27
    .line 28
    invoke-direct {v5, p0, v0, v3}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    const/16 v6, 0xa

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/lmh;->w:La/bby;

    .line 39
    .line 40
    return-void
.end method

.method public final N()V
    .locals 9

    .line 1
    iget-object v0, p0, La/lmh;->o:Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;

    .line 2
    .line 3
    iget-object v3, v0, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v4, v0, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;->c:J

    .line 6
    .line 7
    iget-wide v6, v0, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;->d:J

    .line 8
    .line 9
    iget-object p0, p0, La/lmh;->q:La/hzg;

    .line 10
    .line 11
    move-object v2, p0

    .line 12
    check-cast v2, La/uzg;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, v2, La/uzg;->a:La/oeg0;

    .line 21
    .line 22
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v1, La/jzg;

    .line 27
    .line 28
    const/4 v8, 0x2

    .line 29
    invoke-direct/range {v1 .. v8}, La/jzg;-><init>(La/uzg;Ljava/lang/String;JJB)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/sih;

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
    instance-of v2, v1, La/pih;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v1, v0, La/lmh;->y:La/c4m0;

    .line 19
    .line 20
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, La/lmh;->v:La/m1e;

    .line 24
    .line 25
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, La/igb;

    .line 34
    .line 35
    const/16 v4, 0x19

    .line 36
    .line 37
    invoke-direct {v2, v0, v3, v4}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 38
    .line 39
    .line 40
    new-instance v4, La/fnq;

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    invoke-direct {v4, v1, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, v0, La/lmh;->p:La/mne;

    .line 51
    .line 52
    iget-object v6, v2, La/mne;->a:La/rwj;

    .line 53
    .line 54
    invoke-static {v1, v6}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v6, La/foe;->h:La/foe;

    .line 59
    .line 60
    invoke-static {v4, v1, v6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, v0, La/lmh;->y:La/c4m0;

    .line 65
    .line 66
    iget-object v1, v0, La/lmh;->x:La/c4m0;

    .line 67
    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    const-wide/16 v7, 0x28

    .line 74
    .line 75
    const-wide/16 v9, 0x2e

    .line 76
    .line 77
    iget-object v1, v0, La/lmh;->s:La/a7q;

    .line 78
    .line 79
    invoke-virtual {v1, v7, v8, v9, v10}, La/a7q;->a(JJ)La/vsg0;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v4, La/e9g;

    .line 84
    .line 85
    const/16 v7, 0x9

    .line 86
    .line 87
    invoke-direct {v4, v0, v3, v7}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 88
    .line 89
    .line 90
    new-instance v3, La/fnq;

    .line 91
    .line 92
    invoke-direct {v3, v1, v4, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 100
    .line 101
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v3, v1, v6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, v0, La/lmh;->x:La/c4m0;

    .line 110
    .line 111
    return-void

    .line 112
    :cond_1
    instance-of v2, v1, La/oih;

    .line 113
    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    iget-object v1, v0, La/lmh;->w:La/bby;

    .line 117
    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    iget-object v1, v0, La/lmh;->x:La/c4m0;

    .line 124
    .line 125
    if-eqz v1, :cond_3

    .line 126
    .line 127
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 128
    .line 129
    .line 130
    :cond_3
    iget-object v0, v0, La/lmh;->y:La/c4m0;

    .line 131
    .line 132
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    sget-object v2, La/lih;->a:La/lih;

    .line 137
    .line 138
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_5

    .line 143
    .line 144
    iget-object v0, v0, La/lmh;->q:La/hzg;

    .line 145
    .line 146
    check-cast v0, La/uzg;

    .line 147
    .line 148
    invoke-virtual {v0}, La/uzg;->a()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_5
    sget-object v2, La/nih;->a:La/nih;

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_6

    .line 159
    .line 160
    invoke-virtual {v0}, La/lmh;->M()V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_6
    instance-of v2, v1, La/mih;

    .line 165
    .line 166
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 167
    .line 168
    iget-object v5, v0, La/i3t0;->i:La/ocj;

    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    iget-object v7, v0, La/lmh;->r:La/oeg0;

    .line 172
    .line 173
    iget-object v8, v0, La/lmh;->u:La/ctf0;

    .line 174
    .line 175
    if-eqz v2, :cond_10

    .line 176
    .line 177
    check-cast v1, La/mih;

    .line 178
    .line 179
    iget-object v2, v1, La/mih;->a:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v9, v1, La/mih;->b:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-nez v1, :cond_7

    .line 188
    .line 189
    goto/16 :goto_8

    .line 190
    .line 191
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-nez v1, :cond_8

    .line 196
    .line 197
    goto/16 :goto_8

    .line 198
    .line 199
    :cond_8
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, La/fmh;

    .line 204
    .line 205
    iget-object v1, v1, La/fmh;->c:La/qlh;

    .line 206
    .line 207
    iget-object v1, v1, La/qlh;->a:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    check-cast v10, La/fmh;

    .line 214
    .line 215
    iget-object v10, v10, La/fmh;->c:La/qlh;

    .line 216
    .line 217
    iget-object v10, v10, La/qlh;->b:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_9

    .line 224
    .line 225
    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_9

    .line 230
    .line 231
    const/4 v1, 0x1

    .line 232
    move v10, v1

    .line 233
    goto :goto_0

    .line 234
    :cond_9
    move v10, v6

    .line 235
    :goto_0
    iget-object v11, v5, La/ocj;->a:La/p7m0;

    .line 236
    .line 237
    :cond_a
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-object v12, v1

    .line 245
    check-cast v12, La/fmh;

    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v15, La/qlh;

    .line 251
    .line 252
    if-eqz v10, :cond_b

    .line 253
    .line 254
    move-object v5, v3

    .line 255
    goto :goto_1

    .line 256
    :cond_b
    move-object v5, v9

    .line 257
    :goto_1
    if-eqz v10, :cond_c

    .line 258
    .line 259
    move-object v13, v3

    .line 260
    goto :goto_2

    .line 261
    :cond_c
    move-object v13, v2

    .line 262
    :goto_2
    invoke-direct {v15, v5, v13}, La/qlh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const/16 v16, 0x0

    .line 266
    .line 267
    const/16 v17, 0x17

    .line 268
    .line 269
    const/4 v13, 0x0

    .line 270
    const/4 v14, 0x0

    .line 271
    invoke-static/range {v12 .. v17}, La/fmh;->a(La/fmh;La/bqr;La/j0g0;La/qlh;Ljava/lang/Integer;I)La/fmh;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-virtual {v11, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_a

    .line 280
    .line 281
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    check-cast v0, La/fmh;

    .line 286
    .line 287
    iget-object v0, v0, La/fmh;->b:La/j0g0;

    .line 288
    .line 289
    if-eqz v0, :cond_e

    .line 290
    .line 291
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 292
    .line 293
    instance-of v1, v0, La/g0g0;

    .line 294
    .line 295
    if-eqz v1, :cond_d

    .line 296
    .line 297
    move-object v0, v3

    .line 298
    :cond_d
    check-cast v0, Ljava/util/List;

    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_e
    move-object v0, v3

    .line 302
    :goto_3
    if-nez v0, :cond_f

    .line 303
    .line 304
    sget-object v0, La/iun;->a:La/iun;

    .line 305
    .line 306
    :cond_f
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, La/rkh;

    .line 311
    .line 312
    invoke-static {v0, v2, v8}, La/zjb;->u(La/rkh;Ljava/lang/String;La/ctf0;)Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-eqz v0, :cond_17

    .line 317
    .line 318
    if-nez v10, :cond_17

    .line 319
    .line 320
    invoke-virtual {v7}, La/oeg0;->c()La/i1w0;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    new-instance v4, La/kkh;

    .line 329
    .line 330
    invoke-direct {v4, v0}, La/kkh;-><init>(Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;)V

    .line 331
    .line 332
    .line 333
    new-instance v0, La/c1w0;

    .line 334
    .line 335
    invoke-direct {v0, v4, v3}, La/c1w0;-><init>(La/lwv0;La/onu0;)V

    .line 336
    .line 337
    .line 338
    new-instance v3, La/c8d;

    .line 339
    .line 340
    sget-object v4, La/y7d;->a:La/v7d;

    .line 341
    .line 342
    invoke-direct {v3, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 343
    .line 344
    .line 345
    invoke-static {v2, v3, v1, v2, v6}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    :goto_4
    move-object v2, v0

    .line 350
    check-cast v2, La/paw;

    .line 351
    .line 352
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-eqz v3, :cond_17

    .line 357
    .line 358
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    check-cast v2, La/oe50;

    .line 363
    .line 364
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_10
    instance-of v2, v1, La/rih;

    .line 369
    .line 370
    if-eqz v2, :cond_18

    .line 371
    .line 372
    check-cast v1, La/rih;

    .line 373
    .line 374
    iget-object v2, v1, La/rih;->a:Ljava/lang/String;

    .line 375
    .line 376
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-nez v1, :cond_11

    .line 381
    .line 382
    goto/16 :goto_8

    .line 383
    .line 384
    :cond_11
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    check-cast v1, La/fmh;

    .line 389
    .line 390
    iget-object v1, v1, La/fmh;->c:La/qlh;

    .line 391
    .line 392
    iget-object v1, v1, La/qlh;->b:Ljava/lang/String;

    .line 393
    .line 394
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    iget-object v10, v5, La/ocj;->a:La/p7m0;

    .line 399
    .line 400
    :cond_12
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    move-object v11, v1

    .line 408
    check-cast v11, La/fmh;

    .line 409
    .line 410
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    new-instance v14, La/qlh;

    .line 414
    .line 415
    if-eqz v9, :cond_13

    .line 416
    .line 417
    move-object v5, v3

    .line 418
    goto :goto_5

    .line 419
    :cond_13
    move-object v5, v2

    .line 420
    :goto_5
    invoke-direct {v14, v3, v5}, La/qlh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    const/4 v15, 0x0

    .line 424
    const/16 v16, 0x17

    .line 425
    .line 426
    const/4 v12, 0x0

    .line 427
    const/4 v13, 0x0

    .line 428
    invoke-static/range {v11 .. v16}, La/fmh;->a(La/fmh;La/bqr;La/j0g0;La/qlh;Ljava/lang/Integer;I)La/fmh;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    invoke-virtual {v10, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    if-eqz v1, :cond_12

    .line 437
    .line 438
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    check-cast v0, La/fmh;

    .line 443
    .line 444
    iget-object v0, v0, La/fmh;->b:La/j0g0;

    .line 445
    .line 446
    if-eqz v0, :cond_15

    .line 447
    .line 448
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 449
    .line 450
    instance-of v1, v0, La/g0g0;

    .line 451
    .line 452
    if-eqz v1, :cond_14

    .line 453
    .line 454
    move-object v0, v3

    .line 455
    :cond_14
    check-cast v0, Ljava/util/List;

    .line 456
    .line 457
    goto :goto_6

    .line 458
    :cond_15
    move-object v0, v3

    .line 459
    :goto_6
    if-nez v0, :cond_16

    .line 460
    .line 461
    sget-object v0, La/iun;->a:La/iun;

    .line 462
    .line 463
    :cond_16
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    check-cast v0, La/rkh;

    .line 468
    .line 469
    invoke-static {v0, v2, v8}, La/zjb;->u(La/rkh;Ljava/lang/String;La/ctf0;)Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    if-eqz v0, :cond_17

    .line 474
    .line 475
    if-nez v9, :cond_17

    .line 476
    .line 477
    invoke-virtual {v7}, La/oeg0;->c()La/i1w0;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    new-instance v4, La/kkh;

    .line 486
    .line 487
    invoke-direct {v4, v0}, La/kkh;-><init>(Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;)V

    .line 488
    .line 489
    .line 490
    new-instance v0, La/c1w0;

    .line 491
    .line 492
    invoke-direct {v0, v4, v3}, La/c1w0;-><init>(La/lwv0;La/onu0;)V

    .line 493
    .line 494
    .line 495
    new-instance v3, La/c8d;

    .line 496
    .line 497
    sget-object v4, La/y7d;->a:La/v7d;

    .line 498
    .line 499
    invoke-direct {v3, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 500
    .line 501
    .line 502
    invoke-static {v2, v3, v1, v2, v6}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    :goto_7
    move-object v2, v0

    .line 507
    check-cast v2, La/paw;

    .line 508
    .line 509
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    if-eqz v3, :cond_17

    .line 514
    .line 515
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    check-cast v2, La/oe50;

    .line 520
    .line 521
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 522
    .line 523
    .line 524
    goto :goto_7

    .line 525
    :cond_17
    :goto_8
    return-void

    .line 526
    :cond_18
    instance-of v0, v1, La/qih;

    .line 527
    .line 528
    if-eqz v0, :cond_1a

    .line 529
    .line 530
    check-cast v1, La/qih;

    .line 531
    .line 532
    iget v0, v1, La/qih;->a:I

    .line 533
    .line 534
    iget-object v1, v5, La/ocj;->a:La/p7m0;

    .line 535
    .line 536
    :cond_19
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    move-object v5, v2

    .line 544
    check-cast v5, La/fmh;

    .line 545
    .line 546
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v9

    .line 553
    const/16 v10, 0xf

    .line 554
    .line 555
    const/4 v6, 0x0

    .line 556
    const/4 v7, 0x0

    .line 557
    const/4 v8, 0x0

    .line 558
    invoke-static/range {v5 .. v10}, La/fmh;->a(La/fmh;La/bqr;La/j0g0;La/qlh;Ljava/lang/Integer;I)La/fmh;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-eqz v2, :cond_19

    .line 567
    .line 568
    return-void

    .line 569
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 570
    .line 571
    .line 572
    return-void
.end method
