.class public final La/hq7;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final o:La/mne;

.field public final p:La/gr00;

.field public final q:La/duj;

.field public final r:La/m1e;

.field public final s:La/xp7;

.field public final t:La/sbx0;

.field public final u:La/h3c;

.field public v:La/bby;

.field public w:La/bby;

.field public x:La/c4m0;

.field public y:Z


# direct methods
.method public constructor <init>(La/mne;La/gr00;La/duj;La/m1e;La/xp7;La/i1w0;La/sbx0;La/bzt;La/pru;La/h3c;La/r9u;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, La/kk0;

    .line 11
    .line 12
    const/16 p6, 0xa

    .line 13
    .line 14
    move-object/from16 v0, p11

    .line 15
    .line 16
    invoke-direct {v2, p7, p9, v0, p6}, La/kk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v3, La/ce0;

    .line 20
    .line 21
    const/4 p6, 0x2

    .line 22
    invoke-direct {v3, p8, p6}, La/ce0;-><init>(La/bzt;B)V

    .line 23
    .line 24
    .line 25
    iget-object p6, p1, La/mne;->c:La/vs10;

    .line 26
    .line 27
    iget-object p8, p1, La/mne;->a:La/rwj;

    .line 28
    .line 29
    invoke-static {p6, p8}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v1, 0x0

    .line 35
    move-object v0, p0

    .line 36
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/hq7;->o:La/mne;

    .line 40
    .line 41
    iput-object p2, p0, La/hq7;->p:La/gr00;

    .line 42
    .line 43
    iput-object p3, p0, La/hq7;->q:La/duj;

    .line 44
    .line 45
    iput-object p4, p0, La/hq7;->r:La/m1e;

    .line 46
    .line 47
    iput-object p5, p0, La/hq7;->s:La/xp7;

    .line 48
    .line 49
    iput-object p7, p0, La/hq7;->t:La/sbx0;

    .line 50
    .line 51
    move-object/from16 p1, p10

    .line 52
    .line 53
    iput-object p1, p0, La/hq7;->u:La/h3c;

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, La/hq7;->y:Z

    .line 57
    .line 58
    invoke-virtual {p0}, La/hq7;->M()V

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 13

    .line 1
    iget-object v0, p0, La/hq7;->v:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, La/v3c;->N(La/bby;)V

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
    iget-object v0, p0, La/hq7;->o:La/mne;

    .line 13
    .line 14
    iget-object v4, v0, La/mne;->b:La/dvj;

    .line 15
    .line 16
    new-instance v2, La/ye7;

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    const/16 v12, 0xb

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    const-class v8, La/hq7;

    .line 23
    .line 24
    const-string v9, "handleError"

    .line 25
    .line 26
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 27
    .line 28
    move-object v7, p0

    .line 29
    move-object v5, v2

    .line 30
    invoke-direct/range {v5 .. v12}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 31
    .line 32
    .line 33
    new-instance v5, La/fq7;

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-direct {v5, v7, p0, v0}, La/fq7;-><init>(La/hq7;La/yje;B)V

    .line 38
    .line 39
    .line 40
    const/16 v6, 0xa

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iput-object p0, v7, La/hq7;->v:La/bby;

    .line 48
    .line 49
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, La/jp7;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v2, v0, La/dp7;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iget-object v5, v1, La/hq7;->p:La/gr00;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v0, v5, La/gr00;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/oeg0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, La/c8d;

    .line 30
    .line 31
    sget-object v4, La/y7d;->a:La/v7d;

    .line 32
    .line 33
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 34
    .line 35
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    move-object v2, v1

    .line 43
    check-cast v2, La/paw;

    .line 44
    .line 45
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_10

    .line 50
    .line 51
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, La/oe50;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    instance-of v2, v0, La/hp7;

    .line 62
    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    iget-object v0, v1, La/hq7;->t:La/sbx0;

    .line 66
    .line 67
    iget-object v0, v0, La/sbx0;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v1, v5, La/gr00;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, La/oeg0;

    .line 80
    .line 81
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v2, La/op7;

    .line 86
    .line 87
    invoke-direct {v2, v5, v0, v3}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_1
    instance-of v2, v0, La/ep7;

    .line 95
    .line 96
    iget-object v3, v1, La/hq7;->o:La/mne;

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v10, 0x1

    .line 100
    if-eqz v2, :cond_4

    .line 101
    .line 102
    check-cast v0, La/ep7;

    .line 103
    .line 104
    iget-boolean v2, v0, La/ep7;->d:Z

    .line 105
    .line 106
    if-eqz v2, :cond_3

    .line 107
    .line 108
    iget-wide v8, v0, La/ep7;->a:J

    .line 109
    .line 110
    iget-wide v11, v0, La/ep7;->b:J

    .line 111
    .line 112
    iget-object v0, v1, La/hq7;->w:La/bby;

    .line 113
    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-ne v0, v10, :cond_2

    .line 121
    .line 122
    goto/16 :goto_1

    .line 123
    .line 124
    :cond_2
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 125
    .line 126
    .line 127
    move-result-object v13

    .line 128
    iget-object v10, v3, La/mne;->a:La/rwj;

    .line 129
    .line 130
    new-instance v14, La/ye7;

    .line 131
    .line 132
    const/4 v6, 0x0

    .line 133
    const/16 v7, 0xc

    .line 134
    .line 135
    const/4 v1, 0x1

    .line 136
    const-class v3, La/hq7;

    .line 137
    .line 138
    const-string v4, "handleError"

    .line 139
    .line 140
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 141
    .line 142
    move-object/from16 v2, p0

    .line 143
    .line 144
    move-object v0, v14

    .line 145
    invoke-direct/range {v0 .. v7}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 146
    .line 147
    .line 148
    new-instance v0, La/l87;

    .line 149
    .line 150
    const/4 v6, 0x0

    .line 151
    const/4 v7, 0x1

    .line 152
    move-object/from16 v1, p0

    .line 153
    .line 154
    move-wide v2, v8

    .line 155
    move-wide v4, v11

    .line 156
    invoke-direct/range {v0 .. v7}, La/l87;-><init>(La/i3t0;JJLa/yje;B)V

    .line 157
    .line 158
    .line 159
    const/16 v18, 0xa

    .line 160
    .line 161
    const/4 v15, 0x0

    .line 162
    move-object/from16 v17, v0

    .line 163
    .line 164
    move-object/from16 v16, v10

    .line 165
    .line 166
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iput-object v0, v1, La/hq7;->w:La/bby;

    .line 171
    .line 172
    return-void

    .line 173
    :cond_3
    new-instance v2, La/za;

    .line 174
    .line 175
    const/16 v3, 0x19

    .line 176
    .line 177
    invoke-direct {v2, v1, v0, v4, v3}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 178
    .line 179
    .line 180
    const/4 v0, 0x3

    .line 181
    invoke-static {v1, v4, v4, v2, v0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_4
    instance-of v2, v0, La/ip7;

    .line 186
    .line 187
    if-eqz v2, :cond_5

    .line 188
    .line 189
    check-cast v0, La/ip7;

    .line 190
    .line 191
    iget-wide v6, v0, La/ip7;->a:J

    .line 192
    .line 193
    iget-wide v11, v0, La/ip7;->c:J

    .line 194
    .line 195
    iget-wide v13, v0, La/ip7;->d:J

    .line 196
    .line 197
    iget-wide v8, v0, La/ip7;->b:J

    .line 198
    .line 199
    iget-object v10, v0, La/ip7;->e:Ljava/lang/String;

    .line 200
    .line 201
    iget-boolean v15, v0, La/ip7;->f:Z

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iget-object v0, v5, La/gr00;->a:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, La/oeg0;

    .line 209
    .line 210
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v4, La/rp7;

    .line 215
    .line 216
    invoke-direct/range {v4 .. v15}, La/rp7;-><init>(La/gr00;JJLjava/lang/String;JJZ)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v4}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_5
    instance-of v2, v0, La/gp7;

    .line 224
    .line 225
    if-eqz v2, :cond_9

    .line 226
    .line 227
    iget-object v0, v1, La/hq7;->v:La/bby;

    .line 228
    .line 229
    if-eqz v0, :cond_6

    .line 230
    .line 231
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 232
    .line 233
    .line 234
    :cond_6
    iget-object v0, v1, La/hq7;->w:La/bby;

    .line 235
    .line 236
    if-eqz v0, :cond_7

    .line 237
    .line 238
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 239
    .line 240
    .line 241
    :cond_7
    iget-object v0, v1, La/hq7;->x:La/c4m0;

    .line 242
    .line 243
    if-eqz v0, :cond_8

    .line 244
    .line 245
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 246
    .line 247
    .line 248
    :cond_8
    invoke-virtual {v1}, La/hq7;->M()V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_9
    instance-of v2, v0, La/fp7;

    .line 253
    .line 254
    if-eqz v2, :cond_a

    .line 255
    .line 256
    sget-object v0, La/yp7;->a:La/yp7;

    .line 257
    .line 258
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_a
    instance-of v2, v0, La/bp7;

    .line 263
    .line 264
    iget-object v5, v1, La/i3t0;->f:La/oyg0;

    .line 265
    .line 266
    iget-object v6, v1, La/i3t0;->i:La/ocj;

    .line 267
    .line 268
    if-eqz v2, :cond_c

    .line 269
    .line 270
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 271
    .line 272
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-object v6, v0

    .line 280
    check-cast v6, La/zp7;

    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    const/4 v9, 0x0

    .line 286
    const/16 v11, 0x3f7

    .line 287
    .line 288
    const/4 v7, 0x0

    .line 289
    const/4 v8, 0x0

    .line 290
    const/4 v10, 0x0

    .line 291
    invoke-static/range {v6 .. v11}, La/zp7;->a(La/zp7;Ljava/util/List;ZZZI)La/zp7;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_b

    .line 300
    .line 301
    goto :goto_1

    .line 302
    :cond_c
    instance-of v2, v0, La/cp7;

    .line 303
    .line 304
    if-eqz v2, :cond_e

    .line 305
    .line 306
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 307
    .line 308
    :cond_d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-object v6, v0

    .line 316
    check-cast v6, La/zp7;

    .line 317
    .line 318
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    const/4 v9, 0x0

    .line 322
    const/16 v11, 0x3f7

    .line 323
    .line 324
    const/4 v7, 0x0

    .line 325
    const/4 v8, 0x0

    .line 326
    invoke-static/range {v6 .. v11}, La/zp7;->a(La/zp7;Ljava/util/List;ZZZI)La/zp7;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_d

    .line 335
    .line 336
    goto :goto_1

    .line 337
    :cond_e
    instance-of v2, v0, La/yo7;

    .line 338
    .line 339
    if-eqz v2, :cond_f

    .line 340
    .line 341
    iget-object v0, v1, La/hq7;->x:La/c4m0;

    .line 342
    .line 343
    if-eqz v0, :cond_10

    .line 344
    .line 345
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :cond_f
    instance-of v2, v0, La/ap7;

    .line 350
    .line 351
    if-eqz v2, :cond_12

    .line 352
    .line 353
    iget-object v0, v1, La/hq7;->x:La/c4m0;

    .line 354
    .line 355
    if-eqz v0, :cond_11

    .line 356
    .line 357
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-ne v0, v10, :cond_11

    .line 362
    .line 363
    :cond_10
    :goto_1
    return-void

    .line 364
    :cond_11
    iget-object v0, v1, La/hq7;->r:La/m1e;

    .line 365
    .line 366
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    new-instance v2, La/fq7;

    .line 371
    .line 372
    const/4 v5, 0x1

    .line 373
    invoke-direct {v2, v1, v4, v5}, La/fq7;-><init>(La/hq7;La/yje;B)V

    .line 374
    .line 375
    .line 376
    new-instance v4, La/fnq;

    .line 377
    .line 378
    const/4 v5, 0x4

    .line 379
    invoke-direct {v4, v0, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 380
    .line 381
    .line 382
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    iget-object v2, v3, La/mne;->a:La/rwj;

    .line 387
    .line 388
    invoke-static {v0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    sget-object v2, La/gq7;->h:La/gq7;

    .line 393
    .line 394
    invoke-static {v4, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    iput-object v0, v1, La/hq7;->x:La/c4m0;

    .line 399
    .line 400
    return-void

    .line 401
    :cond_12
    instance-of v0, v0, La/zo7;

    .line 402
    .line 403
    if-eqz v0, :cond_13

    .line 404
    .line 405
    invoke-virtual {v1}, La/i3t0;->E()V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 410
    .line 411
    .line 412
    return-void
.end method
