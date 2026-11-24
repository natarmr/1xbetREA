.class public final La/v7a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kpt0;

.field public final b:La/f4w0;

.field public final c:La/tpt0;

.field public final d:La/nwp0;

.field public final e:Z


# direct methods
.method public constructor <init>(La/l1a;La/kpt0;La/f4w0;La/tpt0;La/nwp0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, La/v7a;->a:La/kpt0;

    .line 17
    .line 18
    iput-object p3, p0, La/v7a;->b:La/f4w0;

    .line 19
    .line 20
    iput-object p4, p0, La/v7a;->c:La/tpt0;

    .line 21
    .line 22
    iput-object p5, p0, La/v7a;->d:La/nwp0;

    .line 23
    .line 24
    sget-object p2, La/c1a;->a0:La/b1a;

    .line 25
    .line 26
    iget-object p1, p1, La/l1a;->b:La/c1a;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, La/b1a;->c(La/c1a;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iput-boolean p1, p0, La/v7a;->e:Z

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(La/t7a;ILa/drd;Ljava/util/List;)La/cmf0;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, La/t7a;->c:I

    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p1, La/t7a;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v2, :cond_10

    .line 27
    .line 28
    new-instance v5, Ljava/util/ArrayList;

    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, La/hzj;

    .line 54
    .line 55
    iget-object v4, p0, La/v7a;->a:La/kpt0;

    .line 56
    .line 57
    iget-object v4, v4, La/kpt0;->f:La/n0o0;

    .line 58
    .line 59
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Ljava/util/Map;

    .line 64
    .line 65
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    check-cast v4, La/mrm0;

    .line 72
    .line 73
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string p0, "Attempted to issue a capture with an unrecognized surface: "

    .line 78
    .line 79
    invoke-static {v2, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v3

    .line 83
    :cond_1
    new-instance v1, La/ux9;

    .line 84
    .line 85
    invoke-direct {v1}, La/ux9;-><init>()V

    .line 86
    .line 87
    .line 88
    iget-object v2, p1, La/t7a;->d:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_2

    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, La/vx9;

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v6, p0, La/v7a;->c:La/tpt0;

    .line 113
    .line 114
    iget-object v6, v6, La/tpt0;->e:La/ex2;

    .line 115
    .line 116
    invoke-virtual {v1, v4, v6}, La/ux9;->b(La/vx9;Ljava/util/concurrent/Executor;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    iget-object v2, p1, La/t7a;->b:La/b780;

    .line 121
    .line 122
    iget-object v4, v2, La/b780;->a:Ljava/util/TreeMap;

    .line 123
    .line 124
    new-instance v6, La/bbw0;

    .line 125
    .line 126
    const/16 v7, 0x10

    .line 127
    .line 128
    invoke-direct {v6, v7}, La/bbw0;-><init>(B)V

    .line 129
    .line 130
    .line 131
    iget-object v7, v6, La/bbw0;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v7, La/wy40;

    .line 134
    .line 135
    invoke-virtual {v6, p3}, La/bbw0;->o(La/drd;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6, v2}, La/bbw0;->o(La/drd;)V

    .line 139
    .line 140
    .line 141
    sget-object p3, La/t7a;->f:La/u15;

    .line 142
    .line 143
    invoke-virtual {v4, p3}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-eqz v8, :cond_3

    .line 148
    .line 149
    sget-object v8, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, p3}, La/b780;->d(La/u15;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-static {v8}, La/s5x0;->C(Landroid/hardware/camera2/CaptureRequest$Key;)La/u15;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-virtual {v7, v8, p3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    sget-object p3, La/t7a;->g:La/u15;

    .line 169
    .line 170
    invoke-virtual {v4, p3}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_4

    .line 175
    .line 176
    sget-object v4, Landroid/hardware/camera2/CaptureRequest;->JPEG_QUALITY:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, p3}, La/b780;->d(La/u15;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p3

    .line 185
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    check-cast p3, Ljava/lang/Number;

    .line 189
    .line 190
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result p3

    .line 194
    int-to-byte p3, p3

    .line 195
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    invoke-static {v4}, La/s5x0;->C(Landroid/hardware/camera2/CaptureRequest$Key;)La/u15;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v7, v2, p3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_4
    const/4 p3, 0x5

    .line 207
    if-ne v0, p3, :cond_a

    .line 208
    .line 209
    iget-object v2, p0, La/v7a;->b:La/f4w0;

    .line 210
    .line 211
    invoke-interface {v2}, La/f4w0;->c()Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_a

    .line 216
    .line 217
    invoke-interface {v2}, La/f4w0;->h()Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-nez v4, :cond_a

    .line 222
    .line 223
    invoke-interface {v2}, La/f4w0;->f()La/b1x;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    if-eqz v2, :cond_a

    .line 228
    .line 229
    invoke-interface {v2}, La/b1x;->K0()La/f0x;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    instance-of v7, v4, La/dy9;

    .line 234
    .line 235
    if-eqz v7, :cond_5

    .line 236
    .line 237
    check-cast v4, La/dy9;

    .line 238
    .line 239
    iget-object v4, v4, La/dy9;->a:La/cy9;

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_5
    move-object v4, v3

    .line 243
    :goto_2
    if-eqz v4, :cond_9

    .line 244
    .line 245
    instance-of v7, v4, La/j9a;

    .line 246
    .line 247
    if-eqz v7, :cond_8

    .line 248
    .line 249
    new-instance v7, La/uz2;

    .line 250
    .line 251
    invoke-interface {v2}, La/b1x;->b()Landroid/media/Image;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    const-string v9, "Required value was null."

    .line 256
    .line 257
    if-eqz v8, :cond_7

    .line 258
    .line 259
    invoke-direct {v7, v8}, La/uz2;-><init>(Landroid/media/Image;)V

    .line 260
    .line 261
    .line 262
    check-cast v4, La/j9a;

    .line 263
    .line 264
    const-class v8, La/b7r;

    .line 265
    .line 266
    sget-object v10, La/sre0;->a:La/tre0;

    .line 267
    .line 268
    invoke-virtual {v10, v8}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    invoke-virtual {v4, v8}, La/j9a;->H(La/sgy;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    if-eqz v4, :cond_6

    .line 277
    .line 278
    check-cast v4, La/b7r;

    .line 279
    .line 280
    new-instance v3, La/dfx;

    .line 281
    .line 282
    invoke-direct {v3, v7, v4}, La/dfx;-><init>(La/uz2;La/b7r;)V

    .line 283
    .line 284
    .line 285
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 286
    .line 287
    invoke-direct {v4, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    new-instance v2, La/u7a;

    .line 291
    .line 292
    invoke-direct {v2, v4}, La/u7a;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_6
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    return-object v3

    .line 300
    :cond_7
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    return-object v3

    .line 304
    :cond_8
    const-string p0, "Unexpected capture result type: "

    .line 305
    .line 306
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-static {p1, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v3

    .line 314
    :cond_9
    move-object v2, v3

    .line 315
    :goto_3
    move-object v10, v3

    .line 316
    move-object v3, v2

    .line 317
    goto :goto_4

    .line 318
    :cond_a
    move-object v10, v3

    .line 319
    :goto_4
    if-nez v10, :cond_e

    .line 320
    .line 321
    const/4 v2, 0x3

    .line 322
    const/4 v4, -0x1

    .line 323
    if-ne p2, v2, :cond_b

    .line 324
    .line 325
    iget-boolean p2, p0, La/v7a;->e:Z

    .line 326
    .line 327
    if-nez p2, :cond_b

    .line 328
    .line 329
    const/4 p2, 0x4

    .line 330
    goto :goto_6

    .line 331
    :cond_b
    if-eq v0, v4, :cond_d

    .line 332
    .line 333
    if-ne v0, p3, :cond_c

    .line 334
    .line 335
    goto :goto_5

    .line 336
    :cond_c
    move p2, v4

    .line 337
    goto :goto_6

    .line 338
    :cond_d
    :goto_5
    const/4 p2, 0x2

    .line 339
    :goto_6
    if-eq p2, v4, :cond_e

    .line 340
    .line 341
    move v0, p2

    .line 342
    :cond_e
    new-instance p2, La/onf0;

    .line 343
    .line 344
    invoke-direct {p2, v0}, La/onf0;-><init>(I)V

    .line 345
    .line 346
    .line 347
    iget-object p0, p0, La/v7a;->d:La/nwp0;

    .line 348
    .line 349
    invoke-interface {p0, p2}, La/nwp0;->a(La/onf0;)Ljava/util/Map;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    invoke-virtual {v6}, La/bbw0;->c()La/hx9;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    invoke-static {p2}, La/s5x0;->U(La/drd;)Ljava/util/LinkedHashMap;

    .line 358
    .line 359
    .line 360
    move-result-object p2

    .line 361
    invoke-static {p0, p2}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    invoke-virtual {p0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    if-eqz v3, :cond_f

    .line 373
    .line 374
    invoke-virtual {p0, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    :cond_f
    invoke-virtual {p0, p4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 378
    .line 379
    .line 380
    invoke-static {p0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 381
    .line 382
    .line 383
    move-result-object v8

    .line 384
    sget-object p0, La/vso0;->a:La/dd40;

    .line 385
    .line 386
    iget-object p1, p1, La/t7a;->e:La/eoo0;

    .line 387
    .line 388
    new-instance p2, Lkotlin/Pair;

    .line 389
    .line 390
    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-static {p2}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 394
    .line 395
    .line 396
    move-result-object v7

    .line 397
    new-instance v4, La/cmf0;

    .line 398
    .line 399
    new-instance v9, La/onf0;

    .line 400
    .line 401
    invoke-direct {v9, v0}, La/onf0;-><init>(I)V

    .line 402
    .line 403
    .line 404
    invoke-direct/range {v4 .. v10}, La/cmf0;-><init>(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;La/onf0;La/dfx;)V

    .line 405
    .line 406
    .line 407
    return-object v4

    .line 408
    :cond_10
    const-string p0, "Attempted to issue a capture without surfaces using "

    .line 409
    .line 410
    invoke-static {p1, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    return-object v3
.end method
