.class public final La/krw;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:J

.field public final q:La/reu;

.field public final r:La/i1w0;

.field public final s:La/m1e;

.field public final t:La/mne;

.field public u:La/c4m0;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLa/reu;La/duj;La/ocl;La/i1w0;La/m1e;La/ctf0;La/mne;)V
    .locals 6

    .line 1
    move-object/from16 p5, p10

    .line 2
    .line 3
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v2, La/kdw;

    .line 10
    .line 11
    const/16 v0, 0xb

    .line 12
    .line 13
    invoke-direct {v2, v0}, La/kdw;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v3, La/cz;

    .line 17
    .line 18
    const/16 v0, 0x11

    .line 19
    .line 20
    invoke-direct {v3, p9, p6, v0}, La/cz;-><init>(La/ctf0;La/ocl;B)V

    .line 21
    .line 22
    .line 23
    iget-object p6, p5, La/mne;->a:La/rwj;

    .line 24
    .line 25
    invoke-static {p6, p6}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    move-object v0, p0

    .line 32
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/krw;->o:Ljava/lang/String;

    .line 36
    .line 37
    iput-wide p2, p0, La/krw;->p:J

    .line 38
    .line 39
    iput-object p4, p0, La/krw;->q:La/reu;

    .line 40
    .line 41
    iput-object p7, p0, La/krw;->r:La/i1w0;

    .line 42
    .line 43
    iput-object p8, p0, La/krw;->s:La/m1e;

    .line 44
    .line 45
    iput-object p5, p0, La/krw;->t:La/mne;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final M(Z)V
    .locals 9

    .line 1
    new-instance v1, La/mie0;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 7
    .line 8
    .line 9
    move-result-object v6

    .line 10
    iget-object v0, p0, La/krw;->t:La/mne;

    .line 11
    .line 12
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 13
    .line 14
    new-instance v8, La/okw;

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    invoke-direct {v8, v1, p0, v0}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    new-instance v0, La/ys8;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/16 v5, 0x10

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    move v3, p1

    .line 28
    invoke-direct/range {v0 .. v5}, La/ys8;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/yje;B)V

    .line 29
    .line 30
    .line 31
    move-object v5, v7

    .line 32
    const/16 v7, 0xa

    .line 33
    .line 34
    move-object v2, v6

    .line 35
    move-object v3, v8

    .line 36
    move-object v6, v0

    .line 37
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 10

    .line 1
    check-cast p1, La/yqw;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/rqw;->a:La/rqw;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x18

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, La/crw;

    .line 21
    .line 22
    iget-object p1, p1, La/crw;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_f

    .line 29
    .line 30
    new-instance p1, La/x2w;

    .line 31
    .line 32
    invoke-direct {p1, v1}, La/x2w;-><init>(B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    instance-of v0, p1, La/xqw;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    if-eqz v0, :cond_7

    .line 43
    .line 44
    check-cast p1, La/xqw;

    .line 45
    .line 46
    iget-object p1, p1, La/xqw;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, La/crw;

    .line 53
    .line 54
    iget-object v0, v0, La/crw;->d:Ljava/util/List;

    .line 55
    .line 56
    new-instance v7, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 v3, 0xa

    .line 59
    .line 60
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, La/epw;

    .line 82
    .line 83
    iget-object v4, v3, La/epw;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_1

    .line 90
    .line 91
    iget-boolean v4, v3, La/epw;->k:Z

    .line 92
    .line 93
    xor-int/2addr v4, v2

    .line 94
    invoke-static {v3, v4}, La/epw;->a(La/epw;Z)La/epw;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    :cond_1
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, La/epw;

    .line 124
    .line 125
    iget-boolean v0, v0, La/epw;->k:Z

    .line 126
    .line 127
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, La/crw;

    .line 132
    .line 133
    iget-boolean v2, v2, La/crw;->e:Z

    .line 134
    .line 135
    if-eq v0, v2, :cond_5

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    :goto_2
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, La/crw;

    .line 143
    .line 144
    iget-object p1, p1, La/crw;->d:Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-nez p1, :cond_5

    .line 151
    .line 152
    new-instance p1, La/x2w;

    .line 153
    .line 154
    invoke-direct {p1, v1}, La/x2w;-><init>(B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    :cond_5
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 161
    .line 162
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 163
    .line 164
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-object v3, p1

    .line 172
    check-cast v3, La/crw;

    .line 173
    .line 174
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    const/4 v8, 0x0

    .line 180
    const/16 v9, 0x17

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v5, 0x0

    .line 184
    const/4 v6, 0x0

    .line 185
    invoke-static/range {v3 .. v9}, La/crw;->a(La/crw;ZZZLjava/util/ArrayList;ZI)La/crw;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eqz p1, :cond_6

    .line 194
    .line 195
    return-void

    .line 196
    :cond_7
    instance-of v0, p1, La/sqw;

    .line 197
    .line 198
    iget-object v1, p0, La/krw;->r:La/i1w0;

    .line 199
    .line 200
    const/4 v3, 0x0

    .line 201
    if-eqz v0, :cond_a

    .line 202
    .line 203
    check-cast p1, La/sqw;

    .line 204
    .line 205
    iget-object p1, p1, La/sqw;->a:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, La/crw;

    .line 212
    .line 213
    iget-object v0, v0, La/crw;->d:Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_9

    .line 224
    .line 225
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    move-object v4, v2

    .line 230
    check-cast v4, La/epw;

    .line 231
    .line 232
    iget-object v4, v4, La/epw;->a:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_8

    .line 239
    .line 240
    move-object v3, v2

    .line 241
    :cond_9
    check-cast v3, La/epw;

    .line 242
    .line 243
    if-eqz v3, :cond_f

    .line 244
    .line 245
    new-instance p1, La/okw;

    .line 246
    .line 247
    const/16 v0, 0x9

    .line 248
    .line 249
    invoke-direct {p1, v3, p0, v0}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_a
    sget-object v0, La/tqw;->a:La/tqw;

    .line 257
    .line 258
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    const/4 v4, 0x0

    .line 263
    if-eqz v0, :cond_b

    .line 264
    .line 265
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    new-instance p1, La/c8d;

    .line 270
    .line 271
    sget-object v0, La/y7d;->a:La/v7d;

    .line 272
    .line 273
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 274
    .line 275
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 276
    .line 277
    .line 278
    invoke-static {p0, p1, v1, p0, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    :goto_3
    move-object p1, p0

    .line 283
    check-cast p1, La/paw;

    .line 284
    .line 285
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_f

    .line 290
    .line 291
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    check-cast p1, La/oe50;

    .line 296
    .line 297
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_b
    sget-object v0, La/uqw;->a:La/uqw;

    .line 302
    .line 303
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_c

    .line 308
    .line 309
    invoke-virtual {p0, v2}, La/krw;->M(Z)V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :cond_c
    sget-object v0, La/vqw;->a:La/vqw;

    .line 314
    .line 315
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_e

    .line 320
    .line 321
    iget-object p1, p0, La/krw;->u:La/c4m0;

    .line 322
    .line 323
    if-eqz p1, :cond_d

    .line 324
    .line 325
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    if-ne p1, v2, :cond_d

    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_d
    iget-object p1, p0, La/krw;->s:La/m1e;

    .line 333
    .line 334
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    new-instance v0, La/irw;

    .line 339
    .line 340
    invoke-direct {v0, p0, v3, v4}, La/irw;-><init>(La/krw;La/yje;B)V

    .line 341
    .line 342
    .line 343
    new-instance v1, La/fnq;

    .line 344
    .line 345
    const/4 v2, 0x4

    .line 346
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 347
    .line 348
    .line 349
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    iget-object v0, p0, La/krw;->t:La/mne;

    .line 354
    .line 355
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 356
    .line 357
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    sget-object v0, La/jrw;->h:La/jrw;

    .line 362
    .line 363
    invoke-static {v1, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    iput-object p1, p0, La/krw;->u:La/c4m0;

    .line 368
    .line 369
    return-void

    .line 370
    :cond_e
    sget-object v0, La/wqw;->a:La/wqw;

    .line 371
    .line 372
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result p1

    .line 376
    if-eqz p1, :cond_10

    .line 377
    .line 378
    iget-object p0, p0, La/krw;->u:La/c4m0;

    .line 379
    .line 380
    if-eqz p0, :cond_f

    .line 381
    .line 382
    invoke-virtual {p0, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 383
    .line 384
    .line 385
    :cond_f
    :goto_4
    return-void

    .line 386
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 387
    .line 388
    .line 389
    return-void
.end method
