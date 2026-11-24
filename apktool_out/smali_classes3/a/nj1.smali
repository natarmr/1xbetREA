.class public final La/nj1;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic E:I


# instance fields
.field public A:La/c4m0;

.field public B:La/bby;

.field public C:La/bby;

.field public final D:La/qoj0;

.field public final o:La/xoc;

.field public final p:La/uyu;

.field public final q:La/e1u;

.field public final r:La/oeg0;

.field public final s:J

.field public final t:La/mne;

.field public final u:La/duj;

.field public final v:La/m1e;

.field public final w:La/u58;

.field public final x:La/au0;

.field public final y:La/jut;

.field public z:La/fk80;


# direct methods
.method public constructor <init>(La/vzg0;La/xoc;La/uyu;La/e1u;La/wyu;La/oeg0;JLa/mne;La/duj;La/m1e;La/ctf0;La/u58;La/au0;La/bzt;La/pru;La/jut;La/hgh0;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p9

    .line 6
    .line 7
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v3, v2, La/mne;->c:La/vs10;

    .line 20
    .line 21
    iget-object v4, v2, La/mne;->a:La/rwj;

    .line 22
    .line 23
    invoke-static {v3, v4}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, La/fj1;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    move-object/from16 v11, p5

    .line 31
    .line 32
    move-wide/from16 v6, p7

    .line 33
    .line 34
    move-object/from16 v10, p15

    .line 35
    .line 36
    move-object/from16 v8, p16

    .line 37
    .line 38
    move-object/from16 v9, p18

    .line 39
    .line 40
    invoke-direct/range {v4 .. v11}, La/fj1;-><init>(BJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, La/uc;

    .line 44
    .line 45
    const/16 v6, 0xc

    .line 46
    .line 47
    move-object/from16 v7, p12

    .line 48
    .line 49
    invoke-direct {v5, v7, v6}, La/uc;-><init>(La/ctf0;B)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1, v4, v3, v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;La/g090;Lkotlin/jvm/functions/Function1;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v3, p2

    .line 56
    .line 57
    iput-object v3, v0, La/nj1;->o:La/xoc;

    .line 58
    .line 59
    move-object/from16 v3, p3

    .line 60
    .line 61
    iput-object v3, v0, La/nj1;->p:La/uyu;

    .line 62
    .line 63
    move-object/from16 v3, p4

    .line 64
    .line 65
    iput-object v3, v0, La/nj1;->q:La/e1u;

    .line 66
    .line 67
    move-object/from16 v3, p6

    .line 68
    .line 69
    iput-object v3, v0, La/nj1;->r:La/oeg0;

    .line 70
    .line 71
    move-wide/from16 v6, p7

    .line 72
    .line 73
    iput-wide v6, v0, La/nj1;->s:J

    .line 74
    .line 75
    iput-object v2, v0, La/nj1;->t:La/mne;

    .line 76
    .line 77
    move-object/from16 v3, p10

    .line 78
    .line 79
    iput-object v3, v0, La/nj1;->u:La/duj;

    .line 80
    .line 81
    move-object/from16 v3, p11

    .line 82
    .line 83
    iput-object v3, v0, La/nj1;->v:La/m1e;

    .line 84
    .line 85
    move-object/from16 v3, p13

    .line 86
    .line 87
    iput-object v3, v0, La/nj1;->w:La/u58;

    .line 88
    .line 89
    move-object/from16 v3, p14

    .line 90
    .line 91
    iput-object v3, v0, La/nj1;->x:La/au0;

    .line 92
    .line 93
    move-object/from16 v3, p17

    .line 94
    .line 95
    iput-object v3, v0, La/nj1;->y:La/jut;

    .line 96
    .line 97
    const/4 v3, 0x7

    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    invoke-static {v4, v4, v5, v3}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    iput-object v3, v0, La/nj1;->D:La/qoj0;

    .line 105
    .line 106
    const-string v3, "SAVED_STATE_CHECKED_SET"

    .line 107
    .line 108
    invoke-virtual {v1, v3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ljava/util/ArrayList;

    .line 113
    .line 114
    const/4 v3, 0x1

    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    new-instance v2, Ljava/util/ArrayList;

    .line 118
    .line 119
    const/16 v6, 0xa

    .line 120
    .line 121
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_0

    .line 137
    .line 138
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, La/s5d0;

    .line 143
    .line 144
    iget-object v7, v7, La/s5d0;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_0
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget-object v6, v0, La/i3t0;->i:La/ocj;

    .line 155
    .line 156
    iget-object v6, v6, La/ocj;->a:La/p7m0;

    .line 157
    .line 158
    :goto_1
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object v8, v0, La/i3t0;->f:La/oyg0;

    .line 166
    .line 167
    move-object v9, v7

    .line 168
    check-cast v9, La/bj1;

    .line 169
    .line 170
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    const/4 v10, 0x0

    .line 178
    const/16 v11, 0xff3

    .line 179
    .line 180
    const/4 v12, 0x0

    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    move-object/from16 p4, v2

    .line 187
    .line 188
    move-object/from16 p3, v8

    .line 189
    .line 190
    move-object/from16 p1, v9

    .line 191
    .line 192
    move/from16 p9, v10

    .line 193
    .line 194
    move/from16 p10, v11

    .line 195
    .line 196
    move-object/from16 p2, v12

    .line 197
    .line 198
    move-object/from16 p5, v13

    .line 199
    .line 200
    move/from16 p6, v14

    .line 201
    .line 202
    move-object/from16 p7, v15

    .line 203
    .line 204
    move-object/from16 p8, v16

    .line 205
    .line 206
    invoke-static/range {p1 .. p10}, La/bj1;->a(La/bj1;La/iie;Ljava/util/Set;Ljava/util/Set;La/uzb0;ZLjava/lang/String;Ljava/lang/String;ZI)La/bj1;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    move-object/from16 v8, p4

    .line 211
    .line 212
    invoke-virtual {v6, v7, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_1

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_1
    move-object v2, v8

    .line 220
    goto :goto_1

    .line 221
    :cond_2
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 222
    .line 223
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 224
    .line 225
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    iget-object v7, v0, La/i3t0;->f:La/oyg0;

    .line 233
    .line 234
    move-object v8, v6

    .line 235
    check-cast v8, La/bj1;

    .line 236
    .line 237
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    sget-object v10, La/xun;->a:La/xun;

    .line 241
    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    const/16 v17, 0xff3

    .line 245
    .line 246
    const/4 v9, 0x0

    .line 247
    const/4 v12, 0x0

    .line 248
    const/4 v13, 0x0

    .line 249
    const/4 v14, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    move-object v11, v10

    .line 252
    invoke-static/range {v8 .. v17}, La/bj1;->a(La/bj1;La/iie;Ljava/util/Set;Ljava/util/Set;La/uzb0;ZLjava/lang/String;Ljava/lang/String;ZI)La/bj1;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    invoke-virtual {v1, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    if-eqz v6, :cond_3

    .line 261
    .line 262
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 267
    .line 268
    new-instance v6, La/hj1;

    .line 269
    .line 270
    invoke-direct {v6, v0, v5, v3}, La/hj1;-><init>(La/nj1;La/yje;B)V

    .line 271
    .line 272
    .line 273
    const/16 v7, 0xb

    .line 274
    .line 275
    const/4 v8, 0x0

    .line 276
    const/4 v9, 0x0

    .line 277
    move-object/from16 p1, v1

    .line 278
    .line 279
    move-object/from16 p4, v2

    .line 280
    .line 281
    move-object/from16 p5, v6

    .line 282
    .line 283
    move/from16 p6, v7

    .line 284
    .line 285
    move-object/from16 p2, v8

    .line 286
    .line 287
    move-object/from16 p3, v9

    .line 288
    .line 289
    invoke-static/range {p1 .. p6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 290
    .line 291
    .line 292
    :goto_2
    iget-object v1, v0, La/nj1;->p:La/uyu;

    .line 293
    .line 294
    iget-object v1, v1, La/uyu;->a:La/v6j0;

    .line 295
    .line 296
    invoke-virtual {v1}, La/v6j0;->h()La/qz40;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    new-instance v2, La/gj1;

    .line 301
    .line 302
    invoke-direct {v2, v0, v5, v4}, La/gj1;-><init>(La/nj1;La/yje;B)V

    .line 303
    .line 304
    .line 305
    new-instance v6, La/fnq;

    .line 306
    .line 307
    const/4 v7, 0x4

    .line 308
    invoke-direct {v6, v1, v2, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 309
    .line 310
    .line 311
    invoke-static {v6, v3}, La/dtb;->z(La/gmq;I)La/lnq;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    new-instance v2, La/hj1;

    .line 316
    .line 317
    invoke-direct {v2, v0, v5, v4}, La/hj1;-><init>(La/nj1;La/yje;B)V

    .line 318
    .line 319
    .line 320
    new-instance v4, La/fnq;

    .line 321
    .line 322
    invoke-direct {v4, v1, v2, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 323
    .line 324
    .line 325
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iget-object v2, v0, La/nj1;->t:La/mne;

    .line 330
    .line 331
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 332
    .line 333
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    sget-object v2, La/ij1;->h:La/ij1;

    .line 338
    .line 339
    invoke-static {v4, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 340
    .line 341
    .line 342
    iget-object v1, v0, La/nj1;->D:La/qoj0;

    .line 343
    .line 344
    const-wide/16 v8, 0xc8

    .line 345
    .line 346
    invoke-static {v1, v8, v9}, La/sj3;->S(La/gmq;J)La/gmq;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    new-instance v2, La/gj1;

    .line 351
    .line 352
    const/4 v4, 0x2

    .line 353
    invoke-direct {v2, v0, v5, v4}, La/gj1;-><init>(La/nj1;La/yje;B)V

    .line 354
    .line 355
    .line 356
    new-instance v4, La/fnq;

    .line 357
    .line 358
    invoke-direct {v4, v1, v2, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 359
    .line 360
    .line 361
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    iget-object v2, v0, La/nj1;->t:La/mne;

    .line 366
    .line 367
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 368
    .line 369
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    sget-object v2, La/mj1;->h:La/mj1;

    .line 374
    .line 375
    invoke-static {v4, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 376
    .line 377
    .line 378
    iget-object v1, v0, La/nj1;->v:La/m1e;

    .line 379
    .line 380
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-static {v1, v3}, La/dtb;->z(La/gmq;I)La/lnq;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    new-instance v2, La/pa;

    .line 389
    .line 390
    const/16 v3, 0x10

    .line 391
    .line 392
    invoke-direct {v2, v0, v5, v3}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 393
    .line 394
    .line 395
    new-instance v3, La/fnq;

    .line 396
    .line 397
    invoke-direct {v3, v1, v2, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 398
    .line 399
    .line 400
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    iget-object v2, v0, La/nj1;->t:La/mne;

    .line 405
    .line 406
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 407
    .line 408
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    sget-object v2, La/lj1;->h:La/lj1;

    .line 413
    .line 414
    invoke-static {v3, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, La/nj1;->N()V

    .line 418
    .line 419
    .line 420
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 4

    .line 1
    iget-object p0, p0, La/nj1;->r:La/oeg0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/c8d;

    .line 12
    .line 13
    sget-object v2, La/y7d;->a:La/v7d;

    .line 14
    .line 15
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    move-object v1, v0

    .line 26
    check-cast v1, La/paw;

    .line 27
    .line 28
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/oe50;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
.end method

.method public final N()V
    .locals 14

    .line 1
    iget-object v0, p0, La/nj1;->A:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, La/nj1;->z:La/fk80;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/fk80;->d()V

    .line 14
    .line 15
    .line 16
    :cond_1
    new-instance v0, La/fk80;

    .line 17
    .line 18
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, La/bj1;

    .line 23
    .line 24
    iget-wide v4, v2, La/bj1;->j:J

    .line 25
    .line 26
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, La/bj1;

    .line 31
    .line 32
    iget-object v2, v2, La/bj1;->e:La/uzb0;

    .line 33
    .line 34
    invoke-static {v2}, La/r7x;->B(La/uzb0;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, La/bj1;

    .line 43
    .line 44
    iget-object v7, v2, La/bj1;->i:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, La/bj1;

    .line 51
    .line 52
    iget-boolean v8, v2, La/bj1;->f:Z

    .line 53
    .line 54
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, La/bj1;

    .line 59
    .line 60
    iget-boolean v9, v2, La/bj1;->l:Z

    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    iget-object v3, p0, La/nj1;->y:La/jut;

    .line 64
    .line 65
    invoke-virtual/range {v3 .. v10}, La/jut;->a(JLjava/lang/String;Ljava/lang/String;ZZZ)La/k06;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    iget-object v4, p0, La/nj1;->t:La/mne;

    .line 74
    .line 75
    iget-object v5, v4, La/mne;->b:La/dvj;

    .line 76
    .line 77
    invoke-direct {v0, v2, v3, v5}, La/fk80;-><init>(La/k06;La/bvc;La/lne;)V

    .line 78
    .line 79
    .line 80
    new-instance v6, La/i8;

    .line 81
    .line 82
    const/4 v12, 0x4

    .line 83
    const/16 v13, 0xe

    .line 84
    .line 85
    const/4 v7, 0x2

    .line 86
    const-class v9, La/nj1;

    .line 87
    .line 88
    const-string v10, "onPagingStateChange"

    .line 89
    .line 90
    const-string v11, "onPagingStateChange(Lorg/xplatform/aggregator/core/paging/presentation/PagingLoadState;)V"

    .line 91
    .line 92
    move-object v8, p0

    .line 93
    invoke-direct/range {v6 .. v13}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 94
    .line 95
    .line 96
    new-instance p0, La/fnq;

    .line 97
    .line 98
    const/4 v2, 0x4

    .line 99
    iget-object v3, v0, La/fk80;->g:La/p7m0;

    .line 100
    .line 101
    invoke-direct {p0, v3, v6, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object v3, v4, La/mne;->b:La/dvj;

    .line 109
    .line 110
    invoke-static {v2, v3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    new-instance v3, La/gj1;

    .line 115
    .line 116
    const/4 v4, 0x1

    .line 117
    invoke-direct {v3, v8, v1, v4}, La/gj1;-><init>(La/nj1;La/yje;B)V

    .line 118
    .line 119
    .line 120
    invoke-static {p0, v2, v3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    iput-object p0, v8, La/nj1;->A:La/c4m0;

    .line 125
    .line 126
    iput-object v0, v8, La/nj1;->z:La/fk80;

    .line 127
    .line 128
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/gi1;

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
    instance-of v2, v1, La/uh1;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, La/i3t0;->E()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    instance-of v2, v1, La/wh1;

    .line 22
    .line 23
    const/16 v3, 0x19

    .line 24
    .line 25
    iget-object v4, v0, La/nj1;->t:La/mne;

    .line 26
    .line 27
    iget-object v5, v0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    iget-object v6, v0, La/i3t0;->i:La/ocj;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    iget-object v8, v0, La/nj1;->x:La/au0;

    .line 33
    .line 34
    iget-object v9, v0, La/nj1;->w:La/u58;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, La/bj1;

    .line 43
    .line 44
    iget-boolean v1, v1, La/bj1;->g:Z

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v1, v6, La/ocj;->a:La/p7m0;

    .line 49
    .line 50
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-object v8, v2

    .line 58
    check-cast v8, La/bj1;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const/16 v17, 0xfbf

    .line 66
    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x0

    .line 71
    const/4 v13, 0x0

    .line 72
    const/4 v14, 0x0

    .line 73
    const/4 v15, 0x0

    .line 74
    invoke-static/range {v8 .. v17}, La/bj1;->a(La/bj1;La/iie;Ljava/util/Set;Ljava/util/Set;La/uzb0;ZLjava/lang/String;Ljava/lang/String;ZI)La/bj1;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v1, v2, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    iget-object v11, v4, La/mne;->a:La/rwj;

    .line 89
    .line 90
    sget-object v9, La/kj1;->a:La/kj1;

    .line 91
    .line 92
    new-instance v12, La/l1;

    .line 93
    .line 94
    const-string v1, ""

    .line 95
    .line 96
    invoke-direct {v12, v0, v1, v7, v3}, La/l1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 97
    .line 98
    .line 99
    const/16 v13, 0xa

    .line 100
    .line 101
    const/4 v10, 0x0

    .line 102
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    iget-object v1, v9, La/u58;->a:La/kt2;

    .line 107
    .line 108
    const-string v2, "provbrand_filter_back"

    .line 109
    .line 110
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object v1, v8, La/au0;->a:La/s1p;

    .line 114
    .line 115
    const-wide/16 v2, 0x2ac4

    .line 116
    .line 117
    sget-object v4, La/xun;->a:La/xun;

    .line 118
    .line 119
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, La/nj1;->M()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    instance-of v2, v1, La/yh1;

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    iget-object v0, v0, La/nj1;->z:La/fk80;

    .line 132
    .line 133
    if-eqz v0, :cond_1f

    .line 134
    .line 135
    invoke-virtual {v0, v10}, La/fk80;->a(Z)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_4
    instance-of v2, v1, La/zh1;

    .line 140
    .line 141
    if-eqz v2, :cond_13

    .line 142
    .line 143
    check-cast v1, La/zh1;

    .line 144
    .line 145
    iget-object v2, v1, La/zh1;->a:Ljava/lang/String;

    .line 146
    .line 147
    iget-boolean v11, v1, La/zh1;->b:Z

    .line 148
    .line 149
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, La/bj1;

    .line 154
    .line 155
    iget-object v1, v1, La/bj1;->a:La/iie;

    .line 156
    .line 157
    instance-of v3, v1, La/wge;

    .line 158
    .line 159
    if-eqz v3, :cond_5

    .line 160
    .line 161
    check-cast v1, La/wge;

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_5
    move-object v1, v7

    .line 165
    :goto_0
    if-eqz v1, :cond_6

    .line 166
    .line 167
    iget-object v1, v1, La/wge;->a:Ljava/util/List;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_6
    move-object v1, v7

    .line 171
    :goto_1
    if-nez v1, :cond_7

    .line 172
    .line 173
    sget-object v1, La/iun;->a:La/iun;

    .line 174
    .line 175
    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_9

    .line 184
    .line 185
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    move-object v4, v3

    .line 190
    check-cast v4, La/s5d0;

    .line 191
    .line 192
    iget-object v4, v4, La/s5d0;->a:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_8

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_9
    move-object v3, v7

    .line 202
    :goto_2
    check-cast v3, La/s5d0;

    .line 203
    .line 204
    if-nez v3, :cond_a

    .line 205
    .line 206
    goto/16 :goto_6

    .line 207
    .line 208
    :cond_a
    iget-object v12, v3, La/s5d0;->a:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, La/bj1;

    .line 215
    .line 216
    iget-object v1, v1, La/bj1;->c:Ljava/util/Set;

    .line 217
    .line 218
    check-cast v1, Ljava/lang/Iterable;

    .line 219
    .line 220
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 221
    .line 222
    .line 223
    move-result-object v15

    .line 224
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_c

    .line 233
    .line 234
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    move-object v13, v4

    .line 239
    check-cast v13, La/s5d0;

    .line 240
    .line 241
    iget-object v13, v13, La/s5d0;->a:Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    if-eqz v13, :cond_b

    .line 248
    .line 249
    move-object v7, v4

    .line 250
    :cond_c
    check-cast v7, La/s5d0;

    .line 251
    .line 252
    if-eqz v7, :cond_d

    .line 253
    .line 254
    invoke-interface {v15, v7}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_d
    invoke-interface {v15, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    :goto_3
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, La/bj1;

    .line 266
    .line 267
    iget-object v0, v0, La/bj1;->d:Ljava/util/Set;

    .line 268
    .line 269
    check-cast v0, Ljava/lang/Iterable;

    .line 270
    .line 271
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_e

    .line 280
    .line 281
    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_e
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    :goto_4
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 289
    .line 290
    :goto_5
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    move-object v13, v1

    .line 298
    check-cast v13, La/bj1;

    .line 299
    .line 300
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    new-instance v3, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v3, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 306
    .line 307
    .line 308
    const-string v4, "SAVED_STATE_CHECKED_SET"

    .line 309
    .line 310
    invoke-static {v5, v3, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    const/16 v21, 0x0

    .line 314
    .line 315
    const/16 v22, 0xff3

    .line 316
    .line 317
    const/4 v14, 0x0

    .line 318
    const/16 v17, 0x0

    .line 319
    .line 320
    const/16 v18, 0x0

    .line 321
    .line 322
    const/16 v19, 0x0

    .line 323
    .line 324
    const/16 v20, 0x0

    .line 325
    .line 326
    move-object/from16 v16, v0

    .line 327
    .line 328
    invoke-static/range {v13 .. v22}, La/bj1;->a(La/bj1;La/iie;Ljava/util/Set;Ljava/util/Set;La/uzb0;ZLjava/lang/String;Ljava/lang/String;ZI)La/bj1;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v2, v1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_12

    .line 337
    .line 338
    const-string v0, "provider_id"

    .line 339
    .line 340
    if-nez v11, :cond_10

    .line 341
    .line 342
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    iget-object v1, v9, La/u58;->a:La/kt2;

    .line 349
    .line 350
    new-instance v2, Lkotlin/Pair;

    .line 351
    .line 352
    invoke-direct {v2, v0, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v2}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    const-string v2, "provbrand_filter_on"

    .line 360
    .line 361
    invoke-interface {v1, v2, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v12}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-eqz v0, :cond_f

    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    :cond_f
    iget-object v0, v8, La/au0;->a:La/s1p;

    .line 375
    .line 376
    const-wide/16 v1, 0x2ac6

    .line 377
    .line 378
    invoke-static {v10, v0, v1, v2}, La/b1j;->r(ILa/s1p;J)V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    :cond_10
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v1, v9, La/u58;->a:La/kt2;

    .line 389
    .line 390
    new-instance v2, Lkotlin/Pair;

    .line 391
    .line 392
    invoke-direct {v2, v0, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v2}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    const-string v2, "provbrand_filter_off"

    .line 400
    .line 401
    invoke-interface {v1, v2, v0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v12}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    if-eqz v0, :cond_11

    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    :cond_11
    iget-object v0, v8, La/au0;->a:La/s1p;

    .line 415
    .line 416
    const-wide/16 v1, 0x2ac7

    .line 417
    .line 418
    invoke-static {v10, v0, v1, v2}, La/b1j;->r(ILa/s1p;J)V

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :cond_12
    move-object/from16 v0, v16

    .line 423
    .line 424
    goto/16 :goto_5

    .line 425
    .line 426
    :cond_13
    instance-of v2, v1, La/bi1;

    .line 427
    .line 428
    if-eqz v2, :cond_14

    .line 429
    .line 430
    invoke-virtual {v0}, La/nj1;->N()V

    .line 431
    .line 432
    .line 433
    return-void

    .line 434
    :cond_14
    sget-object v2, La/vh1;->a:La/vh1;

    .line 435
    .line 436
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    if-eqz v2, :cond_15

    .line 441
    .line 442
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 443
    .line 444
    .line 445
    move-result-object v11

    .line 446
    iget-object v12, v0, La/nj1;->B:La/bby;

    .line 447
    .line 448
    iget-object v14, v4, La/mne;->b:La/dvj;

    .line 449
    .line 450
    sget-object v15, La/jj1;->a:La/jj1;

    .line 451
    .line 452
    new-instance v1, La/l1;

    .line 453
    .line 454
    const/16 v2, 0x18

    .line 455
    .line 456
    invoke-direct {v1, v0, v7, v2}, La/l1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 457
    .line 458
    .line 459
    const/16 v18, 0x2a

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const/16 v16, 0x0

    .line 463
    .line 464
    move-object/from16 v17, v1

    .line 465
    .line 466
    invoke-static/range {v11 .. v18}, La/bww;->R(La/bvc;La/bby;Ljava/util/List;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    iput-object v1, v0, La/nj1;->B:La/bby;

    .line 471
    .line 472
    return-void

    .line 473
    :cond_15
    sget-object v2, La/ai1;->a:La/ai1;

    .line 474
    .line 475
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-eqz v2, :cond_17

    .line 480
    .line 481
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 482
    .line 483
    :cond_16
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    move-object v10, v0

    .line 491
    check-cast v10, La/bj1;

    .line 492
    .line 493
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    sget-object v12, La/xun;->a:La/xun;

    .line 497
    .line 498
    const/16 v18, 0x0

    .line 499
    .line 500
    const/16 v19, 0xff3

    .line 501
    .line 502
    const/4 v11, 0x0

    .line 503
    const/4 v14, 0x0

    .line 504
    const/4 v15, 0x0

    .line 505
    const/16 v16, 0x0

    .line 506
    .line 507
    const/16 v17, 0x0

    .line 508
    .line 509
    move-object v13, v12

    .line 510
    invoke-static/range {v10 .. v19}, La/bj1;->a(La/bj1;La/iie;Ljava/util/Set;Ljava/util/Set;La/uzb0;ZLjava/lang/String;Ljava/lang/String;ZI)La/bj1;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-eqz v0, :cond_16

    .line 519
    .line 520
    iget-object v0, v9, La/u58;->a:La/kt2;

    .line 521
    .line 522
    const-string v1, "provbrand_filter_off_all"

    .line 523
    .line 524
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    iget-object v0, v8, La/au0;->a:La/s1p;

    .line 528
    .line 529
    const-wide/16 v1, 0x2ac8

    .line 530
    .line 531
    sget-object v3, La/xun;->a:La/xun;

    .line 532
    .line 533
    invoke-virtual {v0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 534
    .line 535
    .line 536
    return-void

    .line 537
    :cond_17
    instance-of v2, v1, La/xh1;

    .line 538
    .line 539
    if-eqz v2, :cond_18

    .line 540
    .line 541
    sget-object v1, La/yi1;->a:La/yi1;

    .line 542
    .line 543
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_18
    instance-of v2, v1, La/ci1;

    .line 548
    .line 549
    if-eqz v2, :cond_1a

    .line 550
    .line 551
    iget-object v2, v6, La/ocj;->a:La/p7m0;

    .line 552
    .line 553
    :cond_19
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    move-object v6, v0

    .line 561
    check-cast v6, La/bj1;

    .line 562
    .line 563
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    const/4 v14, 0x0

    .line 567
    const/16 v15, 0xfbf

    .line 568
    .line 569
    const/4 v7, 0x0

    .line 570
    const/4 v8, 0x0

    .line 571
    const/4 v9, 0x0

    .line 572
    const/4 v10, 0x0

    .line 573
    const/4 v11, 0x1

    .line 574
    const/4 v12, 0x0

    .line 575
    const/4 v13, 0x0

    .line 576
    invoke-static/range {v6 .. v15}, La/bj1;->a(La/bj1;La/iie;Ljava/util/Set;Ljava/util/Set;La/uzb0;ZLjava/lang/String;Ljava/lang/String;ZI)La/bj1;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    if-eqz v0, :cond_19

    .line 585
    .line 586
    return-void

    .line 587
    :cond_1a
    instance-of v2, v1, La/di1;

    .line 588
    .line 589
    if-eqz v2, :cond_1b

    .line 590
    .line 591
    check-cast v1, La/di1;

    .line 592
    .line 593
    iget-object v1, v1, La/di1;->a:Ljava/lang/String;

    .line 594
    .line 595
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 596
    .line 597
    .line 598
    move-result-object v8

    .line 599
    iget-object v11, v4, La/mne;->a:La/rwj;

    .line 600
    .line 601
    sget-object v9, La/kj1;->a:La/kj1;

    .line 602
    .line 603
    new-instance v12, La/l1;

    .line 604
    .line 605
    invoke-direct {v12, v0, v1, v7, v3}, La/l1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 606
    .line 607
    .line 608
    const/16 v13, 0xa

    .line 609
    .line 610
    const/4 v10, 0x0

    .line 611
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 612
    .line 613
    .line 614
    return-void

    .line 615
    :cond_1b
    instance-of v2, v1, La/ei1;

    .line 616
    .line 617
    if-eqz v2, :cond_1c

    .line 618
    .line 619
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 620
    .line 621
    .line 622
    move-result-object v11

    .line 623
    iget-object v12, v0, La/nj1;->C:La/bby;

    .line 624
    .line 625
    new-instance v1, La/hj1;

    .line 626
    .line 627
    const/4 v2, 0x2

    .line 628
    invoke-direct {v1, v0, v7, v2}, La/hj1;-><init>(La/nj1;La/yje;B)V

    .line 629
    .line 630
    .line 631
    const/16 v18, 0x3e

    .line 632
    .line 633
    const/4 v13, 0x0

    .line 634
    const/4 v14, 0x0

    .line 635
    const/4 v15, 0x0

    .line 636
    const/16 v16, 0x0

    .line 637
    .line 638
    move-object/from16 v17, v1

    .line 639
    .line 640
    invoke-static/range {v11 .. v18}, La/bww;->R(La/bvc;La/bby;Ljava/util/List;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    iput-object v1, v0, La/nj1;->C:La/bby;

    .line 645
    .line 646
    return-void

    .line 647
    :cond_1c
    instance-of v2, v1, La/fi1;

    .line 648
    .line 649
    if-eqz v2, :cond_20

    .line 650
    .line 651
    check-cast v1, La/fi1;

    .line 652
    .line 653
    iget-object v15, v1, La/fi1;->a:La/uzb0;

    .line 654
    .line 655
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    check-cast v1, La/bj1;

    .line 660
    .line 661
    iget-object v1, v1, La/bj1;->e:La/uzb0;

    .line 662
    .line 663
    if-eq v1, v15, :cond_1f

    .line 664
    .line 665
    invoke-static {v15}, La/r7x;->A(La/uzb0;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    iget-object v2, v9, La/u58;->a:La/kt2;

    .line 673
    .line 674
    new-instance v3, Lkotlin/Pair;

    .line 675
    .line 676
    const-string v4, "option"

    .line 677
    .line 678
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    invoke-static {v3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 682
    .line 683
    .line 684
    move-result-object v1

    .line 685
    const-string v3, "provbrand_filter_sort"

    .line 686
    .line 687
    invoke-interface {v2, v3, v1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 688
    .line 689
    .line 690
    invoke-static {v15}, La/r7x;->A(La/uzb0;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    iget-object v2, v8, La/au0;->a:La/s1p;

    .line 698
    .line 699
    new-instance v3, La/j1p;

    .line 700
    .line 701
    invoke-direct {v3, v1, v10}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 702
    .line 703
    .line 704
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    const-wide/16 v3, 0x2ac5

    .line 709
    .line 710
    invoke-virtual {v2, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    check-cast v1, La/bj1;

    .line 718
    .line 719
    iget-object v1, v1, La/bj1;->e:La/uzb0;

    .line 720
    .line 721
    if-eq v1, v15, :cond_1d

    .line 722
    .line 723
    const/4 v10, 0x1

    .line 724
    :cond_1d
    iget-object v1, v6, La/ocj;->a:La/p7m0;

    .line 725
    .line 726
    :cond_1e
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    move-object v11, v2

    .line 734
    check-cast v11, La/bj1;

    .line 735
    .line 736
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    const-string v3, "SAVED_STATE_LAST_SORT_TYPE"

    .line 740
    .line 741
    invoke-static {v5, v15, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    const/16 v19, 0x0

    .line 745
    .line 746
    const/16 v20, 0xfef

    .line 747
    .line 748
    const/4 v12, 0x0

    .line 749
    const/4 v13, 0x0

    .line 750
    const/4 v14, 0x0

    .line 751
    const/16 v16, 0x0

    .line 752
    .line 753
    const/16 v17, 0x0

    .line 754
    .line 755
    const/16 v18, 0x0

    .line 756
    .line 757
    invoke-static/range {v11 .. v20}, La/bj1;->a(La/bj1;La/iie;Ljava/util/Set;Ljava/util/Set;La/uzb0;ZLjava/lang/String;Ljava/lang/String;ZI)La/bj1;

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v2

    .line 765
    if-eqz v2, :cond_1e

    .line 766
    .line 767
    if-eqz v10, :cond_1f

    .line 768
    .line 769
    invoke-virtual {v0}, La/nj1;->N()V

    .line 770
    .line 771
    .line 772
    :cond_1f
    :goto_6
    return-void

    .line 773
    :cond_20
    invoke-static {}, La/t9f;->b()V

    .line 774
    .line 775
    .line 776
    return-void
.end method
