.class public final La/qn;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

.field public final p:La/hzg;

.field public final q:La/cad;

.field public final r:La/m1e;

.field public final s:La/ih5;

.field public final t:La/zr1;

.field public u:La/c4m0;

.field public v:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;La/hzg;La/cad;La/ctf0;La/mne;La/m1e;La/g2v;La/ih5;La/zr1;)V
    .locals 3

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p5, La/mne;->c:La/vs10;

    .line 8
    .line 9
    iget-object p5, p5, La/mne;->a:La/rwj;

    .line 10
    .line 11
    invoke-static {v0, p5}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 12
    .line 13
    .line 14
    move-result-object p5

    .line 15
    new-instance v0, La/q8;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/q8;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/on;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p4, p7, p1, v2}, La/on;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    const/4 p4, 0x0

    .line 29
    invoke-direct {p0, v0, p5, v1, p4}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/qn;->o:Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

    .line 33
    .line 34
    iput-object p2, p0, La/qn;->p:La/hzg;

    .line 35
    .line 36
    iput-object p3, p0, La/qn;->q:La/cad;

    .line 37
    .line 38
    iput-object p6, p0, La/qn;->r:La/m1e;

    .line 39
    .line 40
    iput-object p8, p0, La/qn;->s:La/ih5;

    .line 41
    .line 42
    iput-object p9, p0, La/qn;->t:La/zr1;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/qn;->u:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/qn;->r:La/m1e;

    .line 7
    .line 8
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/pa;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-direct {v1, p0, v2, v3}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    new-instance v4, La/fnq;

    .line 24
    .line 25
    invoke-direct {v4, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    invoke-static {p0, v4, v2, v2, v0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/qn;->u:La/c4m0;

    .line 34
    .line 35
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 13

    .line 1
    check-cast p1, La/rm;

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
    instance-of v0, p1, La/km;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    check-cast p1, La/km;

    .line 15
    .line 16
    sget-object v0, La/jm;->a:La/jm;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, La/qn;->M()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object v0, La/im;->a:La/im;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, La/qn;->u:La/c4m0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, La/qn;->v:La/bby;

    .line 44
    .line 45
    if-eqz p0, :cond_10

    .line 46
    .line 47
    invoke-interface {p0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    instance-of v0, p1, La/qm;

    .line 56
    .line 57
    if-eqz v0, :cond_12

    .line 58
    .line 59
    check-cast p1, La/qm;

    .line 60
    .line 61
    sget-object v0, La/lm;->a:La/lm;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 68
    .line 69
    iget-object v3, p0, La/i3t0;->i:La/ocj;

    .line 70
    .line 71
    iget-object v4, p0, La/qn;->p:La/hzg;

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/ln;

    .line 80
    .line 81
    iget-boolean p0, p0, La/ln;->c:Z

    .line 82
    .line 83
    if-eqz p0, :cond_5

    .line 84
    .line 85
    iget-object p0, v3, La/ocj;->a:La/p7m0;

    .line 86
    .line 87
    :cond_4
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-object v3, p1

    .line 95
    check-cast v3, La/ln;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const-string v7, ""

    .line 101
    .line 102
    const/4 v8, 0x3

    .line 103
    const/4 v4, 0x0

    .line 104
    const/4 v5, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    invoke-static/range {v3 .. v8}, La/ln;->a(La/ln;ZLa/j0g0;ZLjava/lang/String;I)La/ln;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_4

    .line 115
    .line 116
    return-void

    .line 117
    :cond_5
    check-cast v4, La/uzg;

    .line 118
    .line 119
    invoke-virtual {v4}, La/uzg;->a()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_6
    sget-object v0, La/nm;->a:La/nm;

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_7

    .line 130
    .line 131
    invoke-virtual {p0}, La/qn;->M()V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_7
    sget-object v0, La/om;->a:La/om;

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    const/4 v5, 0x1

    .line 142
    if-eqz v0, :cond_9

    .line 143
    .line 144
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 145
    .line 146
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-object v6, p0

    .line 154
    check-cast v6, La/ln;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-boolean p1, v6, La/ln;->c:Z

    .line 160
    .line 161
    xor-int/lit8 v9, p1, 0x1

    .line 162
    .line 163
    const/4 v10, 0x0

    .line 164
    const/16 v11, 0xb

    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v8, 0x0

    .line 168
    invoke-static/range {v6 .. v11}, La/ln;->a(La/ln;ZLa/j0g0;ZLjava/lang/String;I)La/ln;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-eqz p0, :cond_8

    .line 177
    .line 178
    return-void

    .line 179
    :cond_9
    instance-of v0, p1, La/pm;

    .line 180
    .line 181
    if-eqz v0, :cond_b

    .line 182
    .line 183
    check-cast p1, La/pm;

    .line 184
    .line 185
    iget-object v8, p1, La/pm;->a:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 188
    .line 189
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-object v4, p0

    .line 197
    check-cast v4, La/ln;

    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    const/4 v9, 0x7

    .line 204
    const/4 v5, 0x0

    .line 205
    const/4 v6, 0x0

    .line 206
    invoke-static/range {v4 .. v9}, La/ln;->a(La/ln;ZLa/j0g0;ZLjava/lang/String;I)La/ln;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-eqz p0, :cond_a

    .line 215
    .line 216
    return-void

    .line 217
    :cond_b
    instance-of v0, p1, La/mm;

    .line 218
    .line 219
    if-eqz v0, :cond_11

    .line 220
    .line 221
    check-cast p1, La/mm;

    .line 222
    .line 223
    iget-object v11, p1, La/mm;->a:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, La/ln;

    .line 230
    .line 231
    iget-object p1, p1, La/ln;->b:La/j0g0;

    .line 232
    .line 233
    if-eqz p1, :cond_10

    .line 234
    .line 235
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 236
    .line 237
    instance-of v0, p1, La/g0g0;

    .line 238
    .line 239
    if-eqz v0, :cond_c

    .line 240
    .line 241
    move-object p1, v1

    .line 242
    :cond_c
    check-cast p1, Ljava/util/List;

    .line 243
    .line 244
    if-eqz p1, :cond_10

    .line 245
    .line 246
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_e

    .line 255
    .line 256
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    move-object v2, v0

    .line 261
    check-cast v2, La/bm;

    .line 262
    .line 263
    iget-object v2, v2, La/bm;->b:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {v2, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_d

    .line 270
    .line 271
    move-object v1, v0

    .line 272
    :cond_e
    check-cast v1, La/bm;

    .line 273
    .line 274
    if-eqz v1, :cond_10

    .line 275
    .line 276
    const/4 p1, 0x5

    .line 277
    new-array p1, p1, [La/yxg;

    .line 278
    .line 279
    sget-object v0, La/ttg;->d:La/ttg;

    .line 280
    .line 281
    const/4 v2, 0x0

    .line 282
    aput-object v0, p1, v2

    .line 283
    .line 284
    sget-object v0, La/trg;->d:La/trg;

    .line 285
    .line 286
    aput-object v0, p1, v5

    .line 287
    .line 288
    sget-object v0, La/oxg;->d:La/oxg;

    .line 289
    .line 290
    const/4 v2, 0x2

    .line 291
    aput-object v0, p1, v2

    .line 292
    .line 293
    sget-object v0, La/pug;->d:La/pug;

    .line 294
    .line 295
    const/4 v2, 0x3

    .line 296
    aput-object v0, p1, v2

    .line 297
    .line 298
    sget-object v0, La/yvg;->d:La/yvg;

    .line 299
    .line 300
    const/4 v2, 0x4

    .line 301
    aput-object v0, p1, v2

    .line 302
    .line 303
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    new-instance v0, Ljava/util/ArrayList;

    .line 308
    .line 309
    const/16 v2, 0xa

    .line 310
    .line 311
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 316
    .line 317
    .line 318
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_f

    .line 327
    .line 328
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    check-cast v2, La/yxg;

    .line 333
    .line 334
    iget-wide v2, v2, La/yxg;->a:J

    .line 335
    .line 336
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    goto :goto_0

    .line 344
    :cond_f
    iget-object p1, p0, La/qn;->o:Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;

    .line 345
    .line 346
    iget-wide v2, p1, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;->a:J

    .line 347
    .line 348
    iget-wide v5, p1, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;->a:J

    .line 349
    .line 350
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_10

    .line 359
    .line 360
    iget-object v0, p0, La/qn;->s:La/ih5;

    .line 361
    .line 362
    sget-object v2, La/r1g;->t:La/r1g;

    .line 363
    .line 364
    invoke-virtual {v0, v2, v5, v6}, La/ih5;->p(La/r1g;J)V

    .line 365
    .line 366
    .line 367
    iget-object p0, p0, La/qn;->t:La/zr1;

    .line 368
    .line 369
    const-string v0, "cyber_active_teams"

    .line 370
    .line 371
    invoke-virtual {p0, v5, v6, v0}, La/zr1;->z(JLjava/lang/String;)V

    .line 372
    .line 373
    .line 374
    iget-wide v9, v1, La/bm;->a:J

    .line 375
    .line 376
    iget-wide v7, p1, Lorg/xplatform/cyber/section/api/activeteams/CyberActiveTeamsParams;->a:J

    .line 377
    .line 378
    sget-object v12, La/k1g;->b:La/k1g;

    .line 379
    .line 380
    move-object v6, v4

    .line 381
    check-cast v6, La/uzg;

    .line 382
    .line 383
    invoke-virtual/range {v6 .. v12}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 384
    .line 385
    .line 386
    :cond_10
    return-void

    .line 387
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 388
    .line 389
    .line 390
    return-void

    .line 391
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 392
    .line 393
    .line 394
    return-void
.end method
