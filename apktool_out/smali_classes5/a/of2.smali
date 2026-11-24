.class public final La/of2;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/vzg0;

.field public final p:La/i1w0;

.field public final q:La/qrc;

.field public final r:La/hru;

.field public final s:La/qrc;

.field public final t:La/s31;

.field public final u:La/cyu;

.field public v:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;La/mne;La/ctf0;La/pru;La/qrc;La/hru;La/qrc;La/s31;La/cyu;)V
    .locals 2

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p3, p3, La/mne;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {p3, p3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    new-instance v0, La/nf2;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p5, p1, v1}, La/nf2;-><init>(La/pru;La/vzg0;B)V

    .line 14
    .line 15
    .line 16
    new-instance p5, La/uc;

    .line 17
    .line 18
    const/16 v1, 0x15

    .line 19
    .line 20
    invoke-direct {p5, p4, v1}, La/uc;-><init>(La/ctf0;B)V

    .line 21
    .line 22
    .line 23
    const/4 p4, 0x0

    .line 24
    invoke-direct {p0, v0, p3, p5, p4}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/of2;->o:La/vzg0;

    .line 28
    .line 29
    iput-object p2, p0, La/of2;->p:La/i1w0;

    .line 30
    .line 31
    iput-object p6, p0, La/of2;->q:La/qrc;

    .line 32
    .line 33
    iput-object p7, p0, La/of2;->r:La/hru;

    .line 34
    .line 35
    iput-object p8, p0, La/of2;->s:La/qrc;

    .line 36
    .line 37
    iput-object p9, p0, La/of2;->t:La/s31;

    .line 38
    .line 39
    iput-object p10, p0, La/of2;->u:La/cyu;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 1

    .line 1
    iget-object p0, p0, La/of2;->s:La/qrc;

    .line 2
    .line 3
    iget-object p0, p0, La/qrc;->a:La/nv20;

    .line 4
    .line 5
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/u5g0;

    .line 8
    .line 9
    iget-object p0, p0, La/u5g0;->a:La/p7m0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/ye2;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v2, v1, La/xe2;

    .line 11
    .line 12
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 13
    .line 14
    iget-object v4, v0, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    const/4 v6, 0x1

    .line 18
    iget-object v7, v0, La/of2;->o:La/vzg0;

    .line 19
    .line 20
    if-eqz v2, :cond_4

    .line 21
    .line 22
    check-cast v1, La/xe2;

    .line 23
    .line 24
    iget v0, v1, La/xe2;->a:I

    .line 25
    .line 26
    sget-object v1, La/b9g0;->a:La/lme0;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    if-eq v0, v6, :cond_1

    .line 34
    .line 35
    if-ne v0, v5, :cond_0

    .line 36
    .line 37
    sget-object v0, La/b9g0;->d:La/b9g0;

    .line 38
    .line 39
    :goto_0
    move-object v9, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance v0, La/ss3;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    sget-object v0, La/b9g0;->c:La/b9g0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sget-object v0, La/b9g0;->b:La/b9g0;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 54
    .line 55
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-object v8, v0

    .line 63
    check-cast v8, La/jf2;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 v13, 0x0

    .line 69
    const/16 v14, 0xfe

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    invoke-static/range {v8 .. v14}, La/jf2;->a(La/jf2;La/b9g0;Ljava/util/LinkedHashMap;ZZLjava/util/Calendar;I)La/jf2;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    const-string v0, "SELECTED_TAB_KEY"

    .line 85
    .line 86
    invoke-virtual {v7, v0, v9}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    sget-object v2, La/re2;->a:La/re2;

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    const/4 v8, 0x0

    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/jf2;

    .line 104
    .line 105
    iget-object v1, v1, La/jf2;->h:Ljava/util/Calendar;

    .line 106
    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    :cond_5
    new-instance v1, La/gf2;

    .line 114
    .line 115
    invoke-direct {v1, v8}, La/gf2;-><init>(Ljava/util/Date;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_6
    sget-object v2, La/pe2;->a:La/pe2;

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    const/4 v9, 0x0

    .line 129
    const-string v10, "SEARCH_QUERY_MAP_KEY"

    .line 130
    .line 131
    if-eqz v2, :cond_d

    .line 132
    .line 133
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, La/jf2;

    .line 138
    .line 139
    iget-object v1, v1, La/jf2;->a:La/b9g0;

    .line 140
    .line 141
    sget-object v2, La/b9g0;->d:La/b9g0;

    .line 142
    .line 143
    if-eq v1, v2, :cond_c

    .line 144
    .line 145
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, La/jf2;

    .line 150
    .line 151
    iget-boolean v1, v1, La/jf2;->f:Z

    .line 152
    .line 153
    if-nez v1, :cond_7

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_7
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, La/jf2;

    .line 161
    .line 162
    iget-object v1, v1, La/jf2;->e:Ljava/util/Map;

    .line 163
    .line 164
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    invoke-direct {v13, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, La/jf2;

    .line 174
    .line 175
    iget-object v0, v0, La/jf2;->e:Ljava/util/Map;

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, Ljava/lang/Iterable;

    .line 182
    .line 183
    new-instance v1, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_9

    .line 197
    .line 198
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    move-object v5, v2

    .line 203
    check-cast v5, La/b9g0;

    .line 204
    .line 205
    sget-object v6, La/b9g0;->d:La/b9g0;

    .line 206
    .line 207
    if-ne v5, v6, :cond_8

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_8
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_a

    .line 223
    .line 224
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, La/b9g0;

    .line 229
    .line 230
    invoke-interface {v13, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_a
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 235
    .line 236
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-object v11, v0

    .line 244
    check-cast v11, La/jf2;

    .line 245
    .line 246
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    const/16 v16, 0x0

    .line 250
    .line 251
    const/16 v17, 0xcf

    .line 252
    .line 253
    const/4 v12, 0x0

    .line 254
    const/4 v14, 0x0

    .line 255
    const/4 v15, 0x0

    .line 256
    invoke-static/range {v11 .. v17}, La/jf2;->a(La/jf2;La/b9g0;Ljava/util/LinkedHashMap;ZZLjava/util/Calendar;I)La/jf2;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_b

    .line 265
    .line 266
    invoke-virtual {v7, v10, v13}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_c
    :goto_4
    iget-object v0, v0, La/of2;->p:La/i1w0;

    .line 271
    .line 272
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    new-instance v2, La/c8d;

    .line 277
    .line 278
    sget-object v3, La/y7d;->a:La/v7d;

    .line 279
    .line 280
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 281
    .line 282
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v1, v2, v0, v1, v9}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    :goto_5
    move-object v2, v1

    .line 290
    check-cast v2, La/paw;

    .line 291
    .line 292
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-eqz v3, :cond_21

    .line 297
    .line 298
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    check-cast v2, La/oe50;

    .line 303
    .line 304
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_d
    instance-of v2, v1, La/ue2;

    .line 309
    .line 310
    if-eqz v2, :cond_11

    .line 311
    .line 312
    check-cast v1, La/ue2;

    .line 313
    .line 314
    iget-object v1, v1, La/ue2;->a:Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    check-cast v2, La/jf2;

    .line 321
    .line 322
    iget-object v2, v2, La/jf2;->e:Ljava/util/Map;

    .line 323
    .line 324
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 325
    .line 326
    invoke-direct {v13, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    check-cast v0, La/jf2;

    .line 334
    .line 335
    iget-object v0, v0, La/jf2;->a:La/b9g0;

    .line 336
    .line 337
    sget-object v2, La/b9g0;->b:La/b9g0;

    .line 338
    .line 339
    if-eq v0, v2, :cond_f

    .line 340
    .line 341
    sget-object v5, La/b9g0;->c:La/b9g0;

    .line 342
    .line 343
    if-ne v0, v5, :cond_e

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_e
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    goto :goto_7

    .line 350
    :cond_f
    :goto_6
    invoke-interface {v13, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    sget-object v0, La/b9g0;->c:La/b9g0;

    .line 354
    .line 355
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    :goto_7
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 359
    .line 360
    :cond_10
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    move-object v11, v0

    .line 368
    check-cast v11, La/jf2;

    .line 369
    .line 370
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    const/16 v16, 0x0

    .line 374
    .line 375
    const/16 v17, 0xef

    .line 376
    .line 377
    const/4 v12, 0x0

    .line 378
    const/4 v14, 0x0

    .line 379
    const/4 v15, 0x0

    .line 380
    invoke-static/range {v11 .. v17}, La/jf2;->a(La/jf2;La/b9g0;Ljava/util/LinkedHashMap;ZZLjava/util/Calendar;I)La/jf2;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-eqz v0, :cond_10

    .line 389
    .line 390
    invoke-virtual {v7, v10, v13}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_11
    sget-object v2, La/we2;->a:La/we2;

    .line 395
    .line 396
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-eqz v2, :cond_16

    .line 401
    .line 402
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    check-cast v1, La/jf2;

    .line 407
    .line 408
    iget-object v1, v1, La/jf2;->a:La/b9g0;

    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-eqz v1, :cond_14

    .line 415
    .line 416
    if-eq v1, v6, :cond_13

    .line 417
    .line 418
    if-ne v1, v5, :cond_12

    .line 419
    .line 420
    sget-object v1, La/wgh0;->r:La/wgh0;

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 424
    .line 425
    .line 426
    return-void

    .line 427
    :cond_13
    sget-object v1, La/wgh0;->q:La/wgh0;

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_14
    sget-object v1, La/wgh0;->p:La/wgh0;

    .line 431
    .line 432
    :goto_8
    iget-object v2, v0, La/of2;->t:La/s31;

    .line 433
    .line 434
    invoke-virtual {v2, v1}, La/s31;->g(La/wgh0;)V

    .line 435
    .line 436
    .line 437
    iget-object v1, v1, La/wgh0;->a:Ljava/lang/String;

    .line 438
    .line 439
    iget-object v0, v0, La/of2;->u:La/cyu;

    .line 440
    .line 441
    invoke-virtual {v0, v1}, La/cyu;->C(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 445
    .line 446
    :cond_15
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    move-object v4, v0

    .line 454
    check-cast v4, La/jf2;

    .line 455
    .line 456
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    const/4 v9, 0x0

    .line 460
    const/16 v10, 0xdf

    .line 461
    .line 462
    const/4 v5, 0x0

    .line 463
    const/4 v6, 0x0

    .line 464
    const/4 v7, 0x1

    .line 465
    const/4 v8, 0x0

    .line 466
    invoke-static/range {v4 .. v10}, La/jf2;->a(La/jf2;La/b9g0;Ljava/util/LinkedHashMap;ZZLjava/util/Calendar;I)La/jf2;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    if-eqz v0, :cond_15

    .line 475
    .line 476
    return-void

    .line 477
    :cond_16
    sget-object v2, La/me2;->a:La/me2;

    .line 478
    .line 479
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-eqz v2, :cond_17

    .line 484
    .line 485
    invoke-virtual {v0}, La/i3t0;->E()V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :cond_17
    sget-object v2, La/se2;->a:La/se2;

    .line 490
    .line 491
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-eqz v2, :cond_18

    .line 496
    .line 497
    sget-object v1, La/ff2;->a:La/ff2;

    .line 498
    .line 499
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :cond_18
    instance-of v2, v1, La/te2;

    .line 504
    .line 505
    if-eqz v2, :cond_1a

    .line 506
    .line 507
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 508
    .line 509
    :cond_19
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    move-object v8, v0

    .line 517
    check-cast v8, La/jf2;

    .line 518
    .line 519
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    move-object v4, v1

    .line 523
    check-cast v4, La/te2;

    .line 524
    .line 525
    iget-boolean v12, v4, La/te2;->a:Z

    .line 526
    .line 527
    const/4 v13, 0x0

    .line 528
    const/16 v14, 0xbf

    .line 529
    .line 530
    const/4 v9, 0x0

    .line 531
    const/4 v10, 0x0

    .line 532
    const/4 v11, 0x0

    .line 533
    invoke-static/range {v8 .. v14}, La/jf2;->a(La/jf2;La/b9g0;Ljava/util/LinkedHashMap;ZZLjava/util/Calendar;I)La/jf2;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    invoke-virtual {v2, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-eqz v0, :cond_19

    .line 542
    .line 543
    check-cast v1, La/te2;

    .line 544
    .line 545
    iget-boolean v0, v1, La/te2;->a:Z

    .line 546
    .line 547
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    const-string v1, "SHOW_MULTISELECT_KEY"

    .line 552
    .line 553
    invoke-virtual {v7, v1, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :cond_1a
    instance-of v2, v1, La/qe2;

    .line 558
    .line 559
    if-eqz v2, :cond_1c

    .line 560
    .line 561
    check-cast v1, La/qe2;

    .line 562
    .line 563
    iget v11, v1, La/qe2;->a:I

    .line 564
    .line 565
    iget v12, v1, La/qe2;->b:I

    .line 566
    .line 567
    iget v13, v1, La/qe2;->c:I

    .line 568
    .line 569
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    const/16 v2, 0xb

    .line 574
    .line 575
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 576
    .line 577
    .line 578
    move-result v14

    .line 579
    const/16 v2, 0xc

    .line 580
    .line 581
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 582
    .line 583
    .line 584
    move-result v15

    .line 585
    const/16 v2, 0xd

    .line 586
    .line 587
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 588
    .line 589
    .line 590
    move-result v16

    .line 591
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 592
    .line 593
    .line 594
    move-result-object v22

    .line 595
    move-object/from16 v10, v22

    .line 596
    .line 597
    invoke-virtual/range {v10 .. v16}, Ljava/util/Calendar;->set(IIIIII)V

    .line 598
    .line 599
    .line 600
    const-string v1, "CHOOSEN_DATE_KEY"

    .line 601
    .line 602
    invoke-virtual {v7, v1, v10}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 606
    .line 607
    :goto_9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    move-object/from16 v17, v1

    .line 615
    .line 616
    check-cast v17, La/jf2;

    .line 617
    .line 618
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    const/16 v21, 0x0

    .line 622
    .line 623
    const/16 v23, 0x7f

    .line 624
    .line 625
    const/16 v18, 0x0

    .line 626
    .line 627
    const/16 v19, 0x0

    .line 628
    .line 629
    const/16 v20, 0x0

    .line 630
    .line 631
    move-object/from16 v22, v10

    .line 632
    .line 633
    invoke-static/range {v17 .. v23}, La/jf2;->a(La/jf2;La/b9g0;Ljava/util/LinkedHashMap;ZZLjava/util/Calendar;I)La/jf2;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    invoke-virtual {v2, v1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    if-eqz v1, :cond_1b

    .line 642
    .line 643
    invoke-virtual/range {v22 .. v22}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    iget-object v0, v0, La/of2;->q:La/qrc;

    .line 651
    .line 652
    invoke-virtual {v0, v1, v9}, La/qrc;->a(Ljava/util/Date;Z)V

    .line 653
    .line 654
    .line 655
    return-void

    .line 656
    :cond_1b
    move-object/from16 v10, v22

    .line 657
    .line 658
    goto :goto_9

    .line 659
    :cond_1c
    instance-of v2, v1, La/ve2;

    .line 660
    .line 661
    if-eqz v2, :cond_1e

    .line 662
    .line 663
    check-cast v1, La/ve2;

    .line 664
    .line 665
    sget-object v2, La/b9g0;->d:La/b9g0;

    .line 666
    .line 667
    iget-object v1, v1, La/ve2;->a:Ljava/lang/String;

    .line 668
    .line 669
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    check-cast v0, La/jf2;

    .line 674
    .line 675
    iget-object v0, v0, La/jf2;->e:Ljava/util/Map;

    .line 676
    .line 677
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 678
    .line 679
    invoke-direct {v13, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 680
    .line 681
    .line 682
    sget-object v0, La/b9g0;->a:La/lme0;

    .line 683
    .line 684
    sget-object v0, La/b9g0;->a:La/lme0;

    .line 685
    .line 686
    invoke-interface {v13, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    iget-object v2, v4, La/ocj;->a:La/p7m0;

    .line 690
    .line 691
    :cond_1d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    move-object v11, v0

    .line 699
    check-cast v11, La/jf2;

    .line 700
    .line 701
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    const/16 v16, 0x0

    .line 705
    .line 706
    const/16 v17, 0xef

    .line 707
    .line 708
    const/4 v12, 0x0

    .line 709
    const/4 v14, 0x0

    .line 710
    const/4 v15, 0x0

    .line 711
    invoke-static/range {v11 .. v17}, La/jf2;->a(La/jf2;La/b9g0;Ljava/util/LinkedHashMap;ZZLjava/util/Calendar;I)La/jf2;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v0

    .line 719
    if-eqz v0, :cond_1d

    .line 720
    .line 721
    invoke-virtual {v7, v10, v13}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    return-void

    .line 725
    :cond_1e
    sget-object v2, La/ne2;->a:La/ne2;

    .line 726
    .line 727
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-eqz v2, :cond_20

    .line 732
    .line 733
    iget-object v1, v0, La/of2;->v:La/bby;

    .line 734
    .line 735
    if-eqz v1, :cond_1f

    .line 736
    .line 737
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 738
    .line 739
    .line 740
    move-result v1

    .line 741
    if-ne v1, v6, :cond_1f

    .line 742
    .line 743
    goto :goto_a

    .line 744
    :cond_1f
    new-instance v1, La/m91;

    .line 745
    .line 746
    invoke-direct {v1, v0, v8, v5}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 747
    .line 748
    .line 749
    const/4 v2, 0x3

    .line 750
    invoke-static {v0, v8, v8, v1, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    iput-object v1, v0, La/of2;->v:La/bby;

    .line 755
    .line 756
    return-void

    .line 757
    :cond_20
    sget-object v0, La/oe2;->a:La/oe2;

    .line 758
    .line 759
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result v0

    .line 763
    if-eqz v0, :cond_22

    .line 764
    .line 765
    :cond_21
    :goto_a
    return-void

    .line 766
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 767
    .line 768
    .line 769
    return-void
.end method
