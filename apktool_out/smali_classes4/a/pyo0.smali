.class public final La/pyo0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/vzg0;

.field public final p:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

.field public final q:La/i1w0;

.field public final r:La/fck0;

.field public final s:La/hcp0;

.field public final t:La/pru;

.field public final u:La/n4u;

.field public final v:La/j9u;

.field public final w:La/yfu;

.field public final x:La/duj;

.field public final y:La/mne;

.field public z:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;La/i1w0;La/fck0;La/hcp0;La/pru;La/n4u;La/j9u;La/yfu;La/duj;La/mne;La/ctf0;)V
    .locals 6

    .line 1
    move-object/from16 v0, p11

    .line 2
    .line 3
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, La/mne;->a:La/rwj;

    .line 7
    .line 8
    invoke-static {v1, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, La/ttn0;

    .line 13
    .line 14
    const/16 v3, 0x11

    .line 15
    .line 16
    invoke-direct {v2, p2, v3}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v3, La/h0j0;

    .line 20
    .line 21
    const/16 v4, 0xe

    .line 22
    .line 23
    move-object/from16 v5, p12

    .line 24
    .line 25
    invoke-direct {v3, v5, v4}, La/h0j0;-><init>(La/ctf0;B)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, v2, v1, v3}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;La/g090;Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/pyo0;->o:La/vzg0;

    .line 32
    .line 33
    iput-object p2, p0, La/pyo0;->p:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 34
    .line 35
    iput-object p3, p0, La/pyo0;->q:La/i1w0;

    .line 36
    .line 37
    iput-object p4, p0, La/pyo0;->r:La/fck0;

    .line 38
    .line 39
    iput-object p5, p0, La/pyo0;->s:La/hcp0;

    .line 40
    .line 41
    iput-object p6, p0, La/pyo0;->t:La/pru;

    .line 42
    .line 43
    iput-object p7, p0, La/pyo0;->u:La/n4u;

    .line 44
    .line 45
    iput-object p8, p0, La/pyo0;->v:La/j9u;

    .line 46
    .line 47
    iput-object p9, p0, La/pyo0;->w:La/yfu;

    .line 48
    .line 49
    move-object/from16 p1, p10

    .line 50
    .line 51
    iput-object p1, p0, La/pyo0;->x:La/duj;

    .line 52
    .line 53
    iput-object v0, p0, La/pyo0;->y:La/mne;

    .line 54
    .line 55
    new-instance p1, La/m91;

    .line 56
    .line 57
    const/16 p2, 0x14

    .line 58
    .line 59
    const/4 p3, 0x0

    .line 60
    invoke-direct {p1, p0, p3, p2}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    const/4 p2, 0x3

    .line 64
    invoke-static {p0, p3, p3, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 65
    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final M(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, La/ofo0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ofo0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/pyo0;->x:La/duj;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 20

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, La/iyo0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {v2, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    instance-of v1, v0, La/dyo0;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/kyo0;

    .line 25
    .line 26
    iget-object v0, v0, La/kyo0;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v11, v2, La/pyo0;->y:La/mne;

    .line 33
    .line 34
    if-lez v0, :cond_0

    .line 35
    .line 36
    move-object v0, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, v2, La/pyo0;->z:La/bby;

    .line 39
    .line 40
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    iget-object v13, v11, La/mne;->a:La/rwj;

    .line 48
    .line 49
    new-instance v0, La/tfo0;

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    const/16 v7, 0x16

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    const-class v3, La/pyo0;

    .line 56
    .line 57
    const-string v4, "onError"

    .line 58
    .line 59
    const-string v5, "onError(Ljava/lang/Throwable;)V"

    .line 60
    .line 61
    invoke-direct/range {v0 .. v7}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v19, v2

    .line 65
    .line 66
    move-object v2, v0

    .line 67
    move-object/from16 v0, v19

    .line 68
    .line 69
    new-instance v5, La/myo0;

    .line 70
    .line 71
    invoke-direct {v5, v0, v10, v8}, La/myo0;-><init>(La/pyo0;La/yje;B)V

    .line 72
    .line 73
    .line 74
    const/16 v6, 0xa

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    move-object v1, v12

    .line 78
    move-object v4, v13

    .line 79
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, v0, La/pyo0;->z:La/bby;

    .line 84
    .line 85
    :goto_0
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    iget-object v12, v11, La/mne;->a:La/rwj;

    .line 90
    .line 91
    new-instance v3, La/tfo0;

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    const/16 v7, 0x17

    .line 95
    .line 96
    const/4 v1, 0x1

    .line 97
    move-object v0, v3

    .line 98
    const-class v3, La/pyo0;

    .line 99
    .line 100
    const-string v4, "onError"

    .line 101
    .line 102
    const-string v5, "onError(Ljava/lang/Throwable;)V"

    .line 103
    .line 104
    move-object/from16 v2, p0

    .line 105
    .line 106
    invoke-direct/range {v0 .. v7}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 107
    .line 108
    .line 109
    move-object v1, v3

    .line 110
    move-object v3, v0

    .line 111
    move-object v0, v2

    .line 112
    new-instance v6, La/myo0;

    .line 113
    .line 114
    invoke-direct {v6, v0, v10, v9}, La/myo0;-><init>(La/pyo0;La/yje;B)V

    .line 115
    .line 116
    .line 117
    const/16 v7, 0xa

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    move-object v2, v8

    .line 121
    move-object v5, v12

    .line 122
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    iget-object v8, v11, La/mne;->a:La/rwj;

    .line 130
    .line 131
    new-instance v14, La/tfo0;

    .line 132
    .line 133
    const/4 v6, 0x0

    .line 134
    const/16 v7, 0x18

    .line 135
    .line 136
    move-object v3, v1

    .line 137
    const/4 v1, 0x1

    .line 138
    const-string v4, "onError"

    .line 139
    .line 140
    const-string v5, "onError(Ljava/lang/Throwable;)V"

    .line 141
    .line 142
    move-object v2, v0

    .line 143
    move-object v0, v14

    .line 144
    invoke-direct/range {v0 .. v7}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 145
    .line 146
    .line 147
    new-instance v0, La/myo0;

    .line 148
    .line 149
    const/4 v1, 0x2

    .line 150
    invoke-direct {v0, v2, v10, v1}, La/myo0;-><init>(La/pyo0;La/yje;B)V

    .line 151
    .line 152
    .line 153
    const/16 v18, 0xa

    .line 154
    .line 155
    const/4 v15, 0x0

    .line 156
    move-object/from16 v17, v0

    .line 157
    .line 158
    move-object/from16 v16, v8

    .line 159
    .line 160
    invoke-static/range {v13 .. v18}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_1
    instance-of v1, v0, La/byo0;

    .line 165
    .line 166
    if-eqz v1, :cond_2

    .line 167
    .line 168
    iget-object v0, v2, La/pyo0;->z:La/bby;

    .line 169
    .line 170
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_2
    instance-of v1, v0, La/cyo0;

    .line 175
    .line 176
    if-eqz v1, :cond_3

    .line 177
    .line 178
    invoke-virtual {v2}, La/i3t0;->E()V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_3
    instance-of v1, v0, La/eyo0;

    .line 183
    .line 184
    if-eqz v1, :cond_5

    .line 185
    .line 186
    iget-object v0, v2, La/pyo0;->q:La/i1w0;

    .line 187
    .line 188
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, La/c8d;

    .line 193
    .line 194
    sget-object v3, La/y7d;->a:La/v7d;

    .line 195
    .line 196
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 197
    .line 198
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v2, v0, v1, v8}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    :goto_1
    move-object v2, v1

    .line 206
    check-cast v2, La/paw;

    .line 207
    .line 208
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_4

    .line 213
    .line 214
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, La/oe50;

    .line 219
    .line 220
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_4
    return-void

    .line 225
    :cond_5
    instance-of v1, v0, La/hyo0;

    .line 226
    .line 227
    if-eqz v1, :cond_a

    .line 228
    .line 229
    check-cast v0, La/hyo0;

    .line 230
    .line 231
    sget-object v1, La/j3p0;->e:La/c0o;

    .line 232
    .line 233
    invoke-virtual {v1}, La/b3;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-eqz v3, :cond_7

    .line 242
    .line 243
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    move-object v4, v3

    .line 248
    check-cast v4, La/j3p0;

    .line 249
    .line 250
    iget v5, v0, La/hyo0;->a:I

    .line 251
    .line 252
    iget-boolean v4, v4, La/j3p0;->a:Z

    .line 253
    .line 254
    if-ne v5, v4, :cond_6

    .line 255
    .line 256
    move-object v10, v3

    .line 257
    :cond_7
    check-cast v10, La/j3p0;

    .line 258
    .line 259
    if-nez v10, :cond_8

    .line 260
    .line 261
    sget-object v10, La/j3p0;->c:La/j3p0;

    .line 262
    .line 263
    :cond_8
    move-object v6, v10

    .line 264
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 265
    .line 266
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 267
    .line 268
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-object v3, v0

    .line 276
    check-cast v3, La/kyo0;

    .line 277
    .line 278
    iget-object v4, v2, La/i3t0;->f:La/oyg0;

    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    const-string v5, "CURRENT_TAB_KEY"

    .line 284
    .line 285
    invoke-static {v4, v6, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    const/4 v8, 0x0

    .line 289
    const/16 v9, 0x6f

    .line 290
    .line 291
    const/4 v4, 0x0

    .line 292
    const/4 v5, 0x0

    .line 293
    const/4 v7, 0x0

    .line 294
    invoke-static/range {v3 .. v9}, La/kyo0;->a(La/kyo0;La/jyo0;Ljava/lang/String;La/j3p0;ZZI)La/kyo0;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_9

    .line 303
    .line 304
    return-void

    .line 305
    :cond_a
    instance-of v1, v0, La/fyo0;

    .line 306
    .line 307
    if-eqz v1, :cond_b

    .line 308
    .line 309
    new-instance v0, La/tfo0;

    .line 310
    .line 311
    const/4 v6, 0x0

    .line 312
    const/16 v7, 0x19

    .line 313
    .line 314
    const/4 v1, 0x1

    .line 315
    const-class v3, La/pyo0;

    .line 316
    .line 317
    const-string v4, "onError"

    .line 318
    .line 319
    const-string v5, "onError(Ljava/lang/Throwable;)V"

    .line 320
    .line 321
    invoke-direct/range {v0 .. v7}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 322
    .line 323
    .line 324
    new-instance v1, La/oyo0;

    .line 325
    .line 326
    invoke-direct {v1, v2, v10, v8}, La/oyo0;-><init>(La/pyo0;La/yje;B)V

    .line 327
    .line 328
    .line 329
    invoke-static {v2, v10, v0, v1, v9}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_b
    instance-of v0, v0, La/gyo0;

    .line 334
    .line 335
    if-eqz v0, :cond_c

    .line 336
    .line 337
    new-instance v0, La/tfo0;

    .line 338
    .line 339
    const/4 v6, 0x0

    .line 340
    const/16 v7, 0x1a

    .line 341
    .line 342
    const/4 v1, 0x1

    .line 343
    const-class v3, La/pyo0;

    .line 344
    .line 345
    const-string v4, "onError"

    .line 346
    .line 347
    const-string v5, "onError(Ljava/lang/Throwable;)V"

    .line 348
    .line 349
    invoke-direct/range {v0 .. v7}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 350
    .line 351
    .line 352
    new-instance v1, La/oyo0;

    .line 353
    .line 354
    invoke-direct {v1, v2, v10, v9}, La/oyo0;-><init>(La/pyo0;La/yje;B)V

    .line 355
    .line 356
    .line 357
    invoke-static {v2, v10, v0, v1, v9}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 362
    .line 363
    .line 364
    return-void
.end method
