.class public final La/ulo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/exoplayer/ExoPlayer;
.implements La/my90;


# instance fields
.field public final A:La/nqd;

.field public final B:S

.field public final C:La/fp;

.field public final D:La/tzi;

.field public final E:La/oif0;

.field public final F:La/fhj;

.field public final G:La/fhj;

.field public H:I

.field public I:Z

.field public J:I

.field public K:I

.field public L:Z

.field public M:Z

.field public N:La/f4x;

.field public final O:La/uch0;

.field public P:La/itj0;

.field public Q:La/iy90;

.field public R:La/jn30;

.field public S:Ljava/lang/Object;

.field public T:Landroid/view/Surface;

.field public U:Landroid/view/SurfaceHolder;

.field public V:La/qxk0;

.field public W:Z

.field public X:Landroid/view/TextureView;

.field public final Y:Z

.field public Z:La/e7k0;

.field public final a:Landroidx/media3/common/Timeline$Window;

.field public final a0:La/m24;

.field public final b:La/ucs0;

.field public b0:F

.field public final c:La/iy90;

.field public c0:Z

.field public final d:La/brd;

.field public d0:La/dtf;

.field public final e:Landroid/content/Context;

.field public final e0:Z

.field public final f:La/ulo;

.field public f0:Z

.field public final g:[La/j16;

.field public final g0:I

.field public final h:[La/j16;

.field public h0:Z

.field public final i:La/syj;

.field public i0:La/qfu0;

.field public final j:La/q9o0;

.field public final j0:S

.field public final k:La/klo;

.field public final k0:S

.field public final l:La/dmo;

.field public final l0:S

.field public final m:La/vg00;

.field public m0:La/jn30;

.field public final n:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public n0:La/yx90;

.field public final o:La/amq0;

.field public o0:I

.field public final p:Ljava/util/ArrayList;

.field public p0:J

.field public final q:Z

.field public final r:La/un30;

.field public final s:La/fsj;

.field public final t:Landroid/os/Looper;

.field public final u:La/rsj;

.field public final v:La/l9o0;

.field public final w:La/qlo;

.field public final x:La/rlo;

.field public final y:La/o24;

.field public final z:La/m9c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, La/hn30;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(La/elo;)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v4, v0, La/elo;->i:Landroid/os/Looper;

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v24

    .line 12
    const-string v2, " [AndroidXMedia3/1.11.1] ["

    .line 13
    .line 14
    const-string v3, "Init "

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v5, Landroidx/media3/common/Timeline$Window;

    .line 20
    .line 21
    invoke-direct {v5}, Landroidx/media3/common/Timeline$Window;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v5, v1, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 25
    .line 26
    new-instance v5, La/brd;

    .line 27
    .line 28
    invoke-direct {v5}, La/brd;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v5, v1, La/ulo;->d:La/brd;

    .line 32
    .line 33
    :try_start_0
    const-string v5, "ExoPlayerImpl"

    .line 34
    .line 35
    new-instance v6, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v2, "]"

    .line 60
    .line 61
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v5, v2}, La/f1t0;->a0(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v10, v0, La/elo;->a:Landroid/content/Context;

    .line 72
    .line 73
    iget-object v6, v0, La/elo;->b:La/l9o0;

    .line 74
    .line 75
    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iput-object v2, v1, La/ulo;->e:Landroid/content/Context;

    .line 80
    .line 81
    iget-object v2, v0, La/elo;->h:La/sd9;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v2, La/fsj;

    .line 87
    .line 88
    invoke-direct {v2, v6}, La/fsj;-><init>(La/l9o0;)V

    .line 89
    .line 90
    .line 91
    iput-object v2, v1, La/ulo;->s:La/fsj;

    .line 92
    .line 93
    iget v2, v0, La/elo;->j:I

    .line 94
    .line 95
    iput v2, v1, La/ulo;->g0:I

    .line 96
    .line 97
    iget-object v2, v0, La/elo;->k:La/m24;

    .line 98
    .line 99
    iput-object v2, v1, La/ulo;->a0:La/m24;

    .line 100
    .line 101
    iget-boolean v2, v0, La/elo;->l:Z

    .line 102
    .line 103
    iput-boolean v2, v1, La/ulo;->Y:Z

    .line 104
    .line 105
    iput-boolean v9, v1, La/ulo;->c0:Z

    .line 106
    .line 107
    iget-short v2, v0, La/elo;->u:S

    .line 108
    .line 109
    int-to-long v2, v2

    .line 110
    long-to-int v2, v2

    .line 111
    iput-short v2, v1, La/ulo;->B:S

    .line 112
    .line 113
    new-instance v13, La/qlo;

    .line 114
    .line 115
    invoke-direct {v13, v1}, La/qlo;-><init>(La/ulo;)V

    .line 116
    .line 117
    .line 118
    iput-object v13, v1, La/ulo;->w:La/qlo;

    .line 119
    .line 120
    new-instance v2, La/rlo;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v2, v1, La/ulo;->x:La/rlo;

    .line 126
    .line 127
    new-instance v12, Landroid/os/Handler;

    .line 128
    .line 129
    invoke-direct {v12, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 130
    .line 131
    .line 132
    iget-object v2, v0, La/elo;->c:La/lin0;

    .line 133
    .line 134
    invoke-interface {v2}, La/lin0;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    move-object v11, v2

    .line 139
    check-cast v11, La/pwj;

    .line 140
    .line 141
    move-object v14, v13

    .line 142
    move-object v15, v13

    .line 143
    move-object/from16 v16, v13

    .line 144
    .line 145
    invoke-virtual/range {v11 .. v16}, La/pwj;->a(Landroid/os/Handler;La/qlo;La/qlo;La/qlo;La/qlo;)[La/j16;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    iput-object v2, v1, La/ulo;->g:[La/j16;

    .line 150
    .line 151
    array-length v3, v2

    .line 152
    const/4 v11, 0x1

    .line 153
    if-lez v3, :cond_0

    .line 154
    .line 155
    move v3, v11

    .line 156
    goto :goto_0

    .line 157
    :cond_0
    move v3, v9

    .line 158
    :goto_0
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 159
    .line 160
    .line 161
    array-length v2, v2

    .line 162
    new-array v2, v2, [La/j16;

    .line 163
    .line 164
    iput-object v2, v1, La/ulo;->h:[La/j16;

    .line 165
    .line 166
    move v2, v9

    .line 167
    :goto_1
    iget-object v3, v1, La/ulo;->h:[La/j16;

    .line 168
    .line 169
    array-length v5, v3

    .line 170
    const/4 v12, 0x0

    .line 171
    if-ge v2, v5, :cond_1

    .line 172
    .line 173
    iget-object v5, v1, La/ulo;->g:[La/j16;

    .line 174
    .line 175
    aget-object v5, v5, v2

    .line 176
    .line 177
    iget-byte v5, v5, La/j16;->b:B

    .line 178
    .line 179
    aput-object v12, v3, v2

    .line 180
    .line 181
    add-int/lit8 v2, v2, 0x1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :catchall_0
    move-exception v0

    .line 185
    goto/16 :goto_9

    .line 186
    .line 187
    :cond_1
    iget-object v2, v0, La/elo;->e:La/w24;

    .line 188
    .line 189
    invoke-virtual {v2}, La/w24;->get()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    move-object v13, v2

    .line 194
    check-cast v13, La/syj;

    .line 195
    .line 196
    iput-object v13, v1, La/ulo;->i:La/syj;

    .line 197
    .line 198
    iget-object v2, v0, La/elo;->d:La/lin0;

    .line 199
    .line 200
    invoke-interface {v2}, La/lin0;->get()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, La/un30;

    .line 205
    .line 206
    iput-object v2, v1, La/ulo;->r:La/un30;

    .line 207
    .line 208
    iget-object v2, v0, La/elo;->g:La/w24;

    .line 209
    .line 210
    invoke-virtual {v2}, La/w24;->get()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    move-object v14, v2

    .line 215
    check-cast v14, La/rsj;

    .line 216
    .line 217
    iput-object v14, v1, La/ulo;->u:La/rsj;

    .line 218
    .line 219
    iget-boolean v2, v0, La/elo;->m:Z

    .line 220
    .line 221
    iput-boolean v2, v1, La/ulo;->q:Z

    .line 222
    .line 223
    move-object v15, v13

    .line 224
    iget-object v13, v0, La/elo;->n:La/gvh0;

    .line 225
    .line 226
    iget-short v2, v0, La/elo;->p:S

    .line 227
    .line 228
    int-to-long v2, v2

    .line 229
    long-to-int v2, v2

    .line 230
    iput-short v2, v1, La/ulo;->j0:S

    .line 231
    .line 232
    iget-short v2, v0, La/elo;->q:S

    .line 233
    .line 234
    int-to-long v2, v2

    .line 235
    long-to-int v2, v2

    .line 236
    iput-short v2, v1, La/ulo;->k0:S

    .line 237
    .line 238
    iget-short v2, v0, La/elo;->r:S

    .line 239
    .line 240
    int-to-long v2, v2

    .line 241
    long-to-int v2, v2

    .line 242
    iput-short v2, v1, La/ulo;->l0:S

    .line 243
    .line 244
    iget-object v2, v0, La/elo;->o:La/uch0;

    .line 245
    .line 246
    iput-object v2, v1, La/ulo;->O:La/uch0;

    .line 247
    .line 248
    iput-object v4, v1, La/ulo;->t:Landroid/os/Looper;

    .line 249
    .line 250
    iput-object v6, v1, La/ulo;->v:La/l9o0;

    .line 251
    .line 252
    iput-object v1, v1, La/ulo;->f:La/ulo;

    .line 253
    .line 254
    new-instance v2, La/vg00;

    .line 255
    .line 256
    new-instance v7, La/udk;

    .line 257
    .line 258
    const/16 v3, 0xe

    .line 259
    .line 260
    invoke-direct {v7, v1, v3}, La/udk;-><init>(Ljava/lang/Object;B)V

    .line 261
    .line 262
    .line 263
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 264
    .line 265
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    const/4 v8, 0x1

    .line 273
    invoke-direct/range {v2 .. v8}, La/vg00;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Ljava/lang/Thread;La/l9o0;La/tg00;Z)V

    .line 274
    .line 275
    .line 276
    iput-object v2, v1, La/ulo;->m:La/vg00;

    .line 277
    .line 278
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 279
    .line 280
    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 281
    .line 282
    .line 283
    iput-object v2, v1, La/ulo;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 284
    .line 285
    new-instance v3, Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 288
    .line 289
    .line 290
    iput-object v3, v1, La/ulo;->p:Ljava/util/ArrayList;

    .line 291
    .line 292
    new-instance v3, La/itj0;

    .line 293
    .line 294
    invoke-direct {v3}, La/itj0;-><init>()V

    .line 295
    .line 296
    .line 297
    iput-object v3, v1, La/ulo;->P:La/itj0;

    .line 298
    .line 299
    new-instance v7, La/ucs0;

    .line 300
    .line 301
    iget-object v3, v1, La/ulo;->g:[La/j16;

    .line 302
    .line 303
    array-length v5, v3

    .line 304
    new-array v5, v5, [La/tjf0;

    .line 305
    .line 306
    array-length v3, v3

    .line 307
    new-array v3, v3, [La/fmo;

    .line 308
    .line 309
    sget-object v8, La/rds0;->b:La/rds0;

    .line 310
    .line 311
    invoke-direct {v7, v5, v3, v8, v12}, La/ucs0;-><init>([La/tjf0;[La/fmo;La/rds0;Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    iput-object v7, v1, La/ulo;->b:La/ucs0;

    .line 315
    .line 316
    new-instance v3, La/amq0;

    .line 317
    .line 318
    invoke-direct {v3}, La/amq0;-><init>()V

    .line 319
    .line 320
    .line 321
    iput-object v3, v1, La/ulo;->o:La/amq0;

    .line 322
    .line 323
    new-instance v3, La/hy90;

    .line 324
    .line 325
    invoke-direct {v3}, La/hy90;-><init>()V

    .line 326
    .line 327
    .line 328
    iget-object v5, v3, La/hy90;->a:La/s88;

    .line 329
    .line 330
    const/16 v8, 0x14

    .line 331
    .line 332
    new-array v9, v8, [I

    .line 333
    .line 334
    fill-array-data v9, :array_0

    .line 335
    .line 336
    .line 337
    const/4 v12, 0x0

    .line 338
    :goto_2
    if-ge v12, v8, :cond_2

    .line 339
    .line 340
    aget v8, v9, v12

    .line 341
    .line 342
    invoke-virtual {v5, v8}, La/s88;->b(I)V

    .line 343
    .line 344
    .line 345
    add-int/lit8 v12, v12, 0x1

    .line 346
    .line 347
    const/16 v8, 0x14

    .line 348
    .line 349
    goto :goto_2

    .line 350
    :cond_2
    const/16 v8, 0x1d

    .line 351
    .line 352
    invoke-virtual {v3, v8, v11}, La/hy90;->a(IZ)V

    .line 353
    .line 354
    .line 355
    new-instance v3, La/iy90;

    .line 356
    .line 357
    invoke-virtual {v5}, La/s88;->e()La/jjq;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    invoke-direct {v3, v5}, La/iy90;-><init>(La/jjq;)V

    .line 362
    .line 363
    .line 364
    iput-object v3, v1, La/ulo;->c:La/iy90;

    .line 365
    .line 366
    new-instance v3, La/hy90;

    .line 367
    .line 368
    invoke-direct {v3}, La/hy90;-><init>()V

    .line 369
    .line 370
    .line 371
    iget-object v3, v3, La/hy90;->a:La/s88;

    .line 372
    .line 373
    iget-object v5, v5, La/jjq;->a:Landroid/util/SparseBooleanArray;

    .line 374
    .line 375
    const/4 v8, 0x0

    .line 376
    :goto_3
    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->size()I

    .line 377
    .line 378
    .line 379
    move-result v9

    .line 380
    if-ge v8, v9, :cond_3

    .line 381
    .line 382
    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->size()I

    .line 383
    .line 384
    .line 385
    move-result v9

    .line 386
    invoke-static {v8, v9}, La/x0x;->D(II)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v5, v8}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    invoke-virtual {v3, v9}, La/s88;->b(I)V

    .line 394
    .line 395
    .line 396
    add-int/lit8 v8, v8, 0x1

    .line 397
    .line 398
    goto :goto_3

    .line 399
    :cond_3
    const/4 v5, 0x4

    .line 400
    invoke-virtual {v3, v5}, La/s88;->b(I)V

    .line 401
    .line 402
    .line 403
    const/16 v8, 0xa

    .line 404
    .line 405
    invoke-virtual {v3, v8}, La/s88;->b(I)V

    .line 406
    .line 407
    .line 408
    new-instance v8, La/iy90;

    .line 409
    .line 410
    invoke-virtual {v3}, La/s88;->e()La/jjq;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    invoke-direct {v8, v3}, La/iy90;-><init>(La/jjq;)V

    .line 415
    .line 416
    .line 417
    iput-object v8, v1, La/ulo;->Q:La/iy90;

    .line 418
    .line 419
    const/4 v3, 0x0

    .line 420
    invoke-virtual {v6, v4, v3}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    iput-object v8, v1, La/ulo;->j:La/q9o0;

    .line 425
    .line 426
    new-instance v8, La/klo;

    .line 427
    .line 428
    invoke-direct {v8, v1}, La/klo;-><init>(La/ulo;)V

    .line 429
    .line 430
    .line 431
    iput-object v8, v1, La/ulo;->k:La/klo;

    .line 432
    .line 433
    invoke-static {v7}, La/yx90;->k(La/ucs0;)La/yx90;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    iput-object v9, v1, La/ulo;->n0:La/yx90;

    .line 438
    .line 439
    iget-object v9, v1, La/ulo;->s:La/fsj;

    .line 440
    .line 441
    invoke-virtual {v9, v1, v4}, La/fsj;->O(La/ulo;Landroid/os/Looper;)V

    .line 442
    .line 443
    .line 444
    new-instance v9, La/a4a0;

    .line 445
    .line 446
    iget-object v12, v0, La/elo;->B:Ljava/lang/String;

    .line 447
    .line 448
    invoke-direct {v9, v12}, La/a4a0;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    move-object v12, v2

    .line 452
    new-instance v2, La/dmo;

    .line 453
    .line 454
    move-object/from16 v17, v3

    .line 455
    .line 456
    iget-object v3, v1, La/ulo;->e:Landroid/content/Context;

    .line 457
    .line 458
    move-object/from16 v18, v4

    .line 459
    .line 460
    iget-object v4, v1, La/ulo;->g:[La/j16;

    .line 461
    .line 462
    move/from16 v19, v5

    .line 463
    .line 464
    iget-object v5, v1, La/ulo;->h:[La/j16;

    .line 465
    .line 466
    iget-object v11, v0, La/elo;->f:La/m44;

    .line 467
    .line 468
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    move-object/from16 v20, v8

    .line 472
    .line 473
    const/4 v11, 0x1

    .line 474
    new-instance v8, La/xvj;

    .line 475
    .line 476
    invoke-direct {v8}, La/xvj;-><init>()V

    .line 477
    .line 478
    .line 479
    move-object/from16 v21, v10

    .line 480
    .line 481
    iget v10, v1, La/ulo;->H:I

    .line 482
    .line 483
    move/from16 v22, v11

    .line 484
    .line 485
    iget-boolean v11, v1, La/ulo;->I:Z

    .line 486
    .line 487
    move-object/from16 v23, v12

    .line 488
    .line 489
    iget-object v12, v1, La/ulo;->s:La/fsj;

    .line 490
    .line 491
    move-object/from16 v25, v21

    .line 492
    .line 493
    move-object/from16 v21, v9

    .line 494
    .line 495
    move-object v9, v14

    .line 496
    iget-object v14, v0, La/elo;->s:La/vvj;

    .line 497
    .line 498
    move-object/from16 v26, v2

    .line 499
    .line 500
    iget-short v2, v0, La/elo;->t:S

    .line 501
    .line 502
    move-object/from16 v27, v3

    .line 503
    .line 504
    int-to-long v2, v2

    .line 505
    move-wide/from16 v28, v2

    .line 506
    .line 507
    iget-boolean v2, v0, La/elo;->C:Z

    .line 508
    .line 509
    iget-object v3, v1, La/ulo;->x:La/rlo;

    .line 510
    .line 511
    move/from16 v30, v2

    .line 512
    .line 513
    iget-boolean v2, v0, La/elo;->D:Z

    .line 514
    .line 515
    move-object/from16 v22, v3

    .line 516
    .line 517
    move-object/from16 v19, v6

    .line 518
    .line 519
    move-object v6, v15

    .line 520
    move-object/from16 v32, v23

    .line 521
    .line 522
    move-object/from16 v31, v25

    .line 523
    .line 524
    move-object/from16 v3, v27

    .line 525
    .line 526
    move-wide/from16 v15, v28

    .line 527
    .line 528
    move/from16 v17, v30

    .line 529
    .line 530
    const/4 v0, 0x0

    .line 531
    move/from16 v23, v2

    .line 532
    .line 533
    move-object/from16 v2, v26

    .line 534
    .line 535
    invoke-direct/range {v2 .. v23}, La/dmo;-><init>(Landroid/content/Context;[La/j16;[La/j16;La/syj;La/ucs0;La/xvj;La/rsj;IZLa/fsj;La/gvh0;La/vvj;JZLandroid/os/Looper;La/l9o0;La/klo;La/a4a0;La/seu0;Z)V

    .line 536
    .line 537
    .line 538
    move-object v3, v2

    .line 539
    move-object/from16 v4, v18

    .line 540
    .line 541
    move-object/from16 v6, v19

    .line 542
    .line 543
    move-object/from16 v2, v21

    .line 544
    .line 545
    iget-object v8, v3, La/dmo;->g:La/q9o0;

    .line 546
    .line 547
    iput-object v3, v1, La/ulo;->l:La/dmo;

    .line 548
    .line 549
    iget-object v5, v3, La/dmo;->i:Landroid/os/Looper;

    .line 550
    .line 551
    const/high16 v7, 0x3f800000    # 1.0f

    .line 552
    .line 553
    iput v7, v1, La/ulo;->b0:F

    .line 554
    .line 555
    iput v0, v1, La/ulo;->H:I

    .line 556
    .line 557
    sget-object v7, La/jn30;->C:La/jn30;

    .line 558
    .line 559
    iput-object v7, v1, La/ulo;->R:La/jn30;

    .line 560
    .line 561
    iput-object v7, v1, La/ulo;->m0:La/jn30;

    .line 562
    .line 563
    const/4 v10, -0x1

    .line 564
    iput v10, v1, La/ulo;->o0:I

    .line 565
    .line 566
    sget-object v7, La/dtf;->c:La/dtf;

    .line 567
    .line 568
    iput-object v7, v1, La/ulo;->d0:La/dtf;

    .line 569
    .line 570
    const/4 v11, 0x1

    .line 571
    iput-boolean v11, v1, La/ulo;->e0:Z

    .line 572
    .line 573
    iget-object v7, v1, La/ulo;->s:La/fsj;

    .line 574
    .line 575
    invoke-virtual {v1, v7}, La/ulo;->a(La/ky90;)V

    .line 576
    .line 577
    .line 578
    new-instance v7, Landroid/os/Handler;

    .line 579
    .line 580
    invoke-direct {v7, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 581
    .line 582
    .line 583
    iget-object v12, v1, La/ulo;->s:La/fsj;

    .line 584
    .line 585
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    iget-object v9, v9, La/rsj;->c:La/gnw0;

    .line 589
    .line 590
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    iget-object v9, v9, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 594
    .line 595
    invoke-virtual {v9}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 596
    .line 597
    .line 598
    move-result-object v13

    .line 599
    :cond_4
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 600
    .line 601
    .line 602
    move-result v14

    .line 603
    if-eqz v14, :cond_5

    .line 604
    .line 605
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v14

    .line 609
    check-cast v14, La/no5;

    .line 610
    .line 611
    iget-object v15, v14, La/no5;->b:La/fsj;

    .line 612
    .line 613
    if-ne v15, v12, :cond_4

    .line 614
    .line 615
    iput-boolean v11, v14, La/no5;->c:Z

    .line 616
    .line 617
    invoke-virtual {v9, v14}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    goto :goto_4

    .line 621
    :cond_5
    new-instance v13, La/no5;

    .line 622
    .line 623
    invoke-direct {v13, v7, v12}, La/no5;-><init>(Landroid/os/Handler;La/fsj;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v9, v13}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    iget-object v7, v1, La/ulo;->w:La/qlo;

    .line 630
    .line 631
    move-object/from16 v12, v32

    .line 632
    .line 633
    invoke-virtual {v12, v7}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 637
    .line 638
    const/16 v12, 0x1f

    .line 639
    .line 640
    if-lt v9, v12, :cond_6

    .line 641
    .line 642
    iget-object v7, v1, La/ulo;->e:Landroid/content/Context;

    .line 643
    .line 644
    move-object/from16 v13, p1

    .line 645
    .line 646
    iget-boolean v14, v13, La/elo;->z:Z

    .line 647
    .line 648
    iget-object v3, v3, La/dmo;->i:Landroid/os/Looper;

    .line 649
    .line 650
    const/4 v15, 0x0

    .line 651
    invoke-virtual {v6, v3, v15}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 652
    .line 653
    .line 654
    move-result-object v3

    .line 655
    new-instance v0, La/olo;

    .line 656
    .line 657
    invoke-direct {v0, v7, v14, v1, v2}, La/olo;-><init>(Landroid/content/Context;ZLa/ulo;La/a4a0;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v3, v0}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 661
    .line 662
    .line 663
    goto :goto_5

    .line 664
    :cond_6
    move-object/from16 v13, p1

    .line 665
    .line 666
    const/4 v15, 0x0

    .line 667
    :goto_5
    new-instance v2, La/fp;

    .line 668
    .line 669
    new-instance v7, La/klo;

    .line 670
    .line 671
    invoke-direct {v7, v1}, La/klo;-><init>(La/ulo;)V

    .line 672
    .line 673
    .line 674
    move-object v3, v5

    .line 675
    move-object v5, v4

    .line 676
    move-object v4, v3

    .line 677
    move-object/from16 v3, v24

    .line 678
    .line 679
    invoke-direct/range {v2 .. v7}, La/fp;-><init>(Ljava/lang/Object;Landroid/os/Looper;Landroid/os/Looper;La/l9o0;La/klo;)V

    .line 680
    .line 681
    .line 682
    move-object v14, v3

    .line 683
    iput-object v2, v1, La/ulo;->C:La/fp;

    .line 684
    .line 685
    new-instance v0, La/ccf;

    .line 686
    .line 687
    const/16 v3, 0x13

    .line 688
    .line 689
    invoke-direct {v0, v1, v3}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v0}, La/fp;->M(Ljava/lang/Runnable;)V

    .line 693
    .line 694
    .line 695
    new-instance v0, La/o24;

    .line 696
    .line 697
    iget-object v2, v13, La/elo;->a:Landroid/content/Context;

    .line 698
    .line 699
    iget-object v3, v13, La/elo;->i:Landroid/os/Looper;

    .line 700
    .line 701
    iget-object v5, v1, La/ulo;->w:La/qlo;

    .line 702
    .line 703
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    iput-object v2, v0, La/o24;->b:Ljava/lang/Object;

    .line 711
    .line 712
    invoke-virtual {v6, v4, v15}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    iput-object v2, v0, La/o24;->d:Ljava/lang/Object;

    .line 717
    .line 718
    new-instance v2, La/n24;

    .line 719
    .line 720
    invoke-virtual {v6, v3, v15}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    invoke-direct {v2, v0, v3, v5}, La/n24;-><init>(La/o24;La/q9o0;La/qlo;)V

    .line 725
    .line 726
    .line 727
    iput-object v2, v0, La/o24;->c:Ljava/lang/Object;

    .line 728
    .line 729
    iput-object v0, v1, La/ulo;->y:La/o24;

    .line 730
    .line 731
    invoke-virtual {v0}, La/o24;->r()V

    .line 732
    .line 733
    .line 734
    iget v0, v13, La/elo;->v:I

    .line 735
    .line 736
    const v2, 0x7fffffff

    .line 737
    .line 738
    .line 739
    if-eq v0, v2, :cond_8

    .line 740
    .line 741
    iget v0, v13, La/elo;->w:I

    .line 742
    .line 743
    if-eq v0, v2, :cond_8

    .line 744
    .line 745
    iget v0, v13, La/elo;->x:I

    .line 746
    .line 747
    if-eq v0, v2, :cond_8

    .line 748
    .line 749
    iget v0, v13, La/elo;->y:I

    .line 750
    .line 751
    if-ne v0, v2, :cond_7

    .line 752
    .line 753
    goto :goto_6

    .line 754
    :cond_7
    move v0, v11

    .line 755
    goto :goto_7

    .line 756
    :cond_8
    :goto_6
    const/4 v0, 0x0

    .line 757
    :goto_7
    new-instance v2, La/m9c;

    .line 758
    .line 759
    move-object/from16 v3, v31

    .line 760
    .line 761
    invoke-direct {v2, v3, v4, v6}, La/m9c;-><init>(Landroid/content/Context;Landroid/os/Looper;La/l9o0;)V

    .line 762
    .line 763
    .line 764
    iput-object v2, v1, La/ulo;->z:La/m9c;

    .line 765
    .line 766
    iget-boolean v5, v2, La/m9c;->a:Z

    .line 767
    .line 768
    if-ne v5, v0, :cond_9

    .line 769
    .line 770
    goto :goto_8

    .line 771
    :cond_9
    iput-boolean v0, v2, La/m9c;->a:Z

    .line 772
    .line 773
    iget-boolean v5, v2, La/m9c;->b:Z

    .line 774
    .line 775
    invoke-virtual {v2, v0, v5}, La/m9c;->e(ZZ)V

    .line 776
    .line 777
    .line 778
    :goto_8
    new-instance v0, La/nqd;

    .line 779
    .line 780
    invoke-direct {v0, v3, v4, v6}, La/nqd;-><init>(Landroid/content/Context;Landroid/os/Looper;La/l9o0;)V

    .line 781
    .line 782
    .line 783
    iput-object v0, v1, La/ulo;->A:La/nqd;

    .line 784
    .line 785
    sget v0, La/ygk;->c:I

    .line 786
    .line 787
    sget-object v0, La/qfu0;->d:La/qfu0;

    .line 788
    .line 789
    iput-object v0, v1, La/ulo;->i0:La/qfu0;

    .line 790
    .line 791
    sget-object v0, La/e7k0;->c:La/e7k0;

    .line 792
    .line 793
    iput-object v0, v1, La/ulo;->Z:La/e7k0;

    .line 794
    .line 795
    const/16 v0, 0x22

    .line 796
    .line 797
    if-lt v9, v0, :cond_a

    .line 798
    .line 799
    new-instance v0, La/oif0;

    .line 800
    .line 801
    invoke-direct {v0, v1, v3}, La/oif0;-><init>(La/ulo;Landroid/content/Context;)V

    .line 802
    .line 803
    .line 804
    move-object v15, v0

    .line 805
    :cond_a
    iput-object v15, v1, La/ulo;->E:La/oif0;

    .line 806
    .line 807
    new-instance v0, La/fhj;

    .line 808
    .line 809
    invoke-direct {v0}, La/fhj;-><init>()V

    .line 810
    .line 811
    .line 812
    iput-object v0, v1, La/ulo;->F:La/fhj;

    .line 813
    .line 814
    new-instance v0, La/fhj;

    .line 815
    .line 816
    invoke-direct {v0}, La/fhj;-><init>()V

    .line 817
    .line 818
    .line 819
    iput-object v0, v1, La/ulo;->G:La/fhj;

    .line 820
    .line 821
    new-instance v0, La/tzi;

    .line 822
    .line 823
    iget-object v2, v1, La/ulo;->w:La/qlo;

    .line 824
    .line 825
    iget-object v3, v1, La/ulo;->v:La/l9o0;

    .line 826
    .line 827
    iget v4, v13, La/elo;->v:I

    .line 828
    .line 829
    iget v5, v13, La/elo;->w:I

    .line 830
    .line 831
    iget v6, v13, La/elo;->x:I

    .line 832
    .line 833
    iget v7, v13, La/elo;->y:I

    .line 834
    .line 835
    const/4 v9, 0x0

    .line 836
    invoke-direct/range {v0 .. v7}, La/tzi;-><init>(La/ulo;La/qlo;La/l9o0;IIII)V

    .line 837
    .line 838
    .line 839
    iput-object v0, v1, La/ulo;->D:La/tzi;

    .line 840
    .line 841
    iget-object v0, v1, La/ulo;->O:La/uch0;

    .line 842
    .line 843
    const/16 v2, 0x26

    .line 844
    .line 845
    invoke-virtual {v8, v2, v0}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-virtual {v0}, La/p9o0;->b()V

    .line 850
    .line 851
    .line 852
    iget-object v0, v1, La/ulo;->a0:La/m24;

    .line 853
    .line 854
    invoke-static {}, La/q9o0;->d()La/p9o0;

    .line 855
    .line 856
    .line 857
    move-result-object v2

    .line 858
    iget-object v3, v8, La/q9o0;->a:Landroid/os/Handler;

    .line 859
    .line 860
    invoke-virtual {v3, v12, v9, v9, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    iput-object v0, v2, La/p9o0;->a:Landroid/os/Message;

    .line 865
    .line 866
    invoke-virtual {v2}, La/p9o0;->b()V

    .line 867
    .line 868
    .line 869
    iget-object v0, v1, La/ulo;->a0:La/m24;

    .line 870
    .line 871
    const/4 v2, 0x3

    .line 872
    invoke-virtual {v1, v11, v2, v0}, La/ulo;->M(IILjava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    iget-boolean v0, v1, La/ulo;->Y:Z

    .line 876
    .line 877
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    const/4 v2, 0x2

    .line 882
    const/4 v3, 0x4

    .line 883
    invoke-virtual {v1, v2, v3, v0}, La/ulo;->M(IILjava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    const/4 v0, 0x5

    .line 887
    invoke-virtual {v1, v2, v0, v14}, La/ulo;->M(IILjava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    iget-boolean v0, v1, La/ulo;->c0:Z

    .line 891
    .line 892
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    const/16 v2, 0x9

    .line 897
    .line 898
    invoke-virtual {v1, v11, v2, v0}, La/ulo;->M(IILjava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    iget-object v0, v1, La/ulo;->x:La/rlo;

    .line 902
    .line 903
    const/4 v2, 0x6

    .line 904
    const/16 v3, 0x8

    .line 905
    .line 906
    invoke-virtual {v1, v2, v3, v0}, La/ulo;->M(IILjava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    iget v0, v1, La/ulo;->g0:I

    .line 910
    .line 911
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    const/16 v2, 0x10

    .line 916
    .line 917
    invoke-virtual {v1, v10, v2, v0}, La/ulo;->M(IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 918
    .line 919
    .line 920
    iget-object v0, v1, La/ulo;->d:La/brd;

    .line 921
    .line 922
    invoke-virtual {v0}, La/brd;->c()Z

    .line 923
    .line 924
    .line 925
    return-void

    .line 926
    :goto_9
    iget-object v1, v1, La/ulo;->d:La/brd;

    .line 927
    .line 928
    invoke-virtual {v1}, La/brd;->c()Z

    .line 929
    .line 930
    .line 931
    throw v0

    .line 932
    nop

    .line 933
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method public static A(La/yx90;I)La/yx90;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/yx90;->h(I)La/yx90;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, La/yx90;->b(Z)La/yx90;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static u(La/yx90;)J
    .locals 6

    .line 1
    new-instance v0, Landroidx/media3/common/Timeline$Window;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media3/common/Timeline$Window;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/amq0;

    .line 7
    .line 8
    invoke-direct {v1}, La/amq0;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, La/yx90;->a:La/bmq0;

    .line 12
    .line 13
    iget-object v3, p0, La/yx90;->b:La/vn30;

    .line 14
    .line 15
    iget-object v3, v3, La/vn30;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, La/yx90;->c:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v4, v2, v4

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, La/yx90;->a:La/bmq0;

    .line 32
    .line 33
    iget v1, v1, La/amq0;->c:I

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, v2, v3}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-wide v0, p0, Landroidx/media3/common/Timeline$Window;->k:J

    .line 42
    .line 43
    return-wide v0

    .line 44
    :cond_0
    iget-wide v0, v1, La/amq0;->e:J

    .line 45
    .line 46
    add-long/2addr v0, v2

    .line 47
    return-wide v0
.end method


# virtual methods
.method public final B(La/yx90;La/bmq0;Landroid/util/Pair;)La/yx90;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, La/bmq0;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v4

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v3, v5

    .line 21
    :goto_1
    invoke-static {v3}, La/x0x;->A(Z)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    iget-object v6, v3, La/yx90;->a:La/bmq0;

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, La/ulo;->g(La/yx90;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v7

    .line 32
    invoke-virtual/range {p1 .. p2}, La/yx90;->j(La/bmq0;)La/yx90;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    invoke-virtual {v1}, La/bmq0;->p()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    sget-object v10, La/yx90;->u:La/vn30;

    .line 43
    .line 44
    iget-wide v1, v0, La/ulo;->p0:J

    .line 45
    .line 46
    invoke-static {v1, v2}, La/vtt0;->M(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    sget-object v19, La/dcs0;->d:La/dcs0;

    .line 51
    .line 52
    iget-object v0, v0, La/ulo;->b:La/ucs0;

    .line 53
    .line 54
    sget-object v1, La/b4x;->b:La/v3x;

    .line 55
    .line 56
    sget-object v21, La/rcf0;->e:La/rcf0;

    .line 57
    .line 58
    const-wide/16 v17, 0x0

    .line 59
    .line 60
    move-wide v13, v11

    .line 61
    move-wide v15, v11

    .line 62
    move-object/from16 v20, v0

    .line 63
    .line 64
    invoke-virtual/range {v9 .. v21}, La/yx90;->d(La/vn30;JJJJLa/dcs0;La/ucs0;Ljava/util/List;)La/yx90;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, v10}, La/yx90;->c(La/vn30;)La/yx90;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-wide v1, v0, La/yx90;->s:J

    .line 73
    .line 74
    iput-wide v1, v0, La/yx90;->q:J

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_2
    iget-object v3, v9, La/yx90;->b:La/vn30;

    .line 78
    .line 79
    iget-object v3, v3, La/vn30;->a:Ljava/lang/Object;

    .line 80
    .line 81
    sget-object v10, La/vtt0;->a:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-nez v10, :cond_3

    .line 90
    .line 91
    new-instance v11, La/vn30;

    .line 92
    .line 93
    iget-object v12, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-direct {v11, v12}, La/vn30;-><init>(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    iget-object v11, v9, La/yx90;->b:La/vn30;

    .line 100
    .line 101
    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Ljava/lang/Long;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v12

    .line 109
    invoke-static {v7, v8}, La/vtt0;->M(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v7

    .line 113
    invoke-virtual {v6}, La/bmq0;->p()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_4

    .line 118
    .line 119
    iget-object v2, v0, La/ulo;->o:La/amq0;

    .line 120
    .line 121
    invoke-virtual {v6, v3, v2}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-wide v14, v2, La/amq0;->e:J

    .line 126
    .line 127
    sub-long/2addr v7, v14

    .line 128
    if-eqz v10, :cond_4

    .line 129
    .line 130
    sub-long v14, v7, v12

    .line 131
    .line 132
    const-wide/16 v16, 0x1

    .line 133
    .line 134
    cmp-long v2, v14, v16

    .line 135
    .line 136
    if-nez v2, :cond_4

    .line 137
    .line 138
    iget-object v2, v0, La/ulo;->o:La/amq0;

    .line 139
    .line 140
    invoke-virtual {v6, v3, v2}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    iget-wide v2, v2, La/amq0;->d:J

    .line 145
    .line 146
    cmp-long v2, v7, v2

    .line 147
    .line 148
    if-nez v2, :cond_4

    .line 149
    .line 150
    sub-long v7, v7, v16

    .line 151
    .line 152
    :cond_4
    if-eqz v10, :cond_5

    .line 153
    .line 154
    cmp-long v2, v12, v7

    .line 155
    .line 156
    if-gez v2, :cond_6

    .line 157
    .line 158
    :cond_5
    move v1, v10

    .line 159
    move-object v10, v11

    .line 160
    move-wide v11, v12

    .line 161
    goto/16 :goto_6

    .line 162
    .line 163
    :cond_6
    if-nez v2, :cond_a

    .line 164
    .line 165
    iget-object v2, v9, La/yx90;->k:La/vn30;

    .line 166
    .line 167
    iget-object v2, v2, La/vn30;->a:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-virtual {v1, v2}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    const/4 v3, -0x1

    .line 174
    if-eq v2, v3, :cond_8

    .line 175
    .line 176
    iget-object v3, v0, La/ulo;->o:La/amq0;

    .line 177
    .line 178
    invoke-virtual {v1, v2, v3, v4}, La/bmq0;->f(ILa/amq0;Z)La/amq0;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    iget v2, v2, La/amq0;->c:I

    .line 183
    .line 184
    iget-object v3, v11, La/vn30;->a:Ljava/lang/Object;

    .line 185
    .line 186
    iget-object v4, v0, La/ulo;->o:La/amq0;

    .line 187
    .line 188
    invoke-virtual {v1, v3, v4}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    iget v3, v3, La/amq0;->c:I

    .line 193
    .line 194
    if-eq v2, v3, :cond_7

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    return-object v9

    .line 198
    :cond_8
    :goto_3
    iget-object v2, v11, La/vn30;->a:Ljava/lang/Object;

    .line 199
    .line 200
    iget-object v3, v0, La/ulo;->o:La/amq0;

    .line 201
    .line 202
    invoke-virtual {v1, v2, v3}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v11}, La/vn30;->c()Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    iget-object v0, v0, La/ulo;->o:La/amq0;

    .line 210
    .line 211
    if-eqz v1, :cond_9

    .line 212
    .line 213
    iget v1, v11, La/vn30;->b:I

    .line 214
    .line 215
    iget v2, v11, La/vn30;->c:I

    .line 216
    .line 217
    invoke-virtual {v0, v1, v2}, La/amq0;->a(II)J

    .line 218
    .line 219
    .line 220
    move-result-wide v0

    .line 221
    :goto_4
    move-object v10, v11

    .line 222
    goto :goto_5

    .line 223
    :cond_9
    iget-wide v0, v0, La/amq0;->d:J

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :goto_5
    iget-wide v11, v9, La/yx90;->s:J

    .line 227
    .line 228
    iget-wide v13, v9, La/yx90;->s:J

    .line 229
    .line 230
    iget-wide v2, v9, La/yx90;->d:J

    .line 231
    .line 232
    iget-wide v4, v9, La/yx90;->s:J

    .line 233
    .line 234
    sub-long v17, v0, v4

    .line 235
    .line 236
    iget-object v4, v9, La/yx90;->h:La/dcs0;

    .line 237
    .line 238
    iget-object v5, v9, La/yx90;->i:La/ucs0;

    .line 239
    .line 240
    iget-object v6, v9, La/yx90;->j:Ljava/util/List;

    .line 241
    .line 242
    move-wide v15, v2

    .line 243
    move-object/from16 v19, v4

    .line 244
    .line 245
    move-object/from16 v20, v5

    .line 246
    .line 247
    move-object/from16 v21, v6

    .line 248
    .line 249
    invoke-virtual/range {v9 .. v21}, La/yx90;->d(La/vn30;JJJJLa/dcs0;La/ucs0;Ljava/util/List;)La/yx90;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v2, v10}, La/yx90;->c(La/vn30;)La/yx90;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    iput-wide v0, v2, La/yx90;->q:J

    .line 258
    .line 259
    return-object v2

    .line 260
    :cond_a
    move-object v10, v11

    .line 261
    invoke-virtual {v10}, La/vn30;->c()Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    xor-int/2addr v0, v5

    .line 266
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 267
    .line 268
    .line 269
    iget-wide v0, v9, La/yx90;->r:J

    .line 270
    .line 271
    sub-long v2, v12, v7

    .line 272
    .line 273
    sub-long/2addr v0, v2

    .line 274
    const-wide/16 v2, 0x0

    .line 275
    .line 276
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 277
    .line 278
    .line 279
    move-result-wide v17

    .line 280
    iget-wide v0, v9, La/yx90;->q:J

    .line 281
    .line 282
    iget-object v2, v9, La/yx90;->k:La/vn30;

    .line 283
    .line 284
    iget-object v3, v9, La/yx90;->b:La/vn30;

    .line 285
    .line 286
    invoke-virtual {v2, v3}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-eqz v2, :cond_b

    .line 291
    .line 292
    add-long v0, v12, v17

    .line 293
    .line 294
    :cond_b
    iget-object v2, v9, La/yx90;->h:La/dcs0;

    .line 295
    .line 296
    iget-object v3, v9, La/yx90;->i:La/ucs0;

    .line 297
    .line 298
    iget-object v4, v9, La/yx90;->j:Ljava/util/List;

    .line 299
    .line 300
    move-wide v11, v12

    .line 301
    move-wide v13, v11

    .line 302
    move-wide v15, v11

    .line 303
    move-object/from16 v19, v2

    .line 304
    .line 305
    move-object/from16 v20, v3

    .line 306
    .line 307
    move-object/from16 v21, v4

    .line 308
    .line 309
    invoke-virtual/range {v9 .. v21}, La/yx90;->d(La/vn30;JJJJLa/dcs0;La/ucs0;Ljava/util/List;)La/yx90;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    iput-wide v0, v2, La/yx90;->q:J

    .line 314
    .line 315
    return-object v2

    .line 316
    :goto_6
    invoke-virtual {v10}, La/vn30;->c()Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    xor-int/2addr v2, v5

    .line 321
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 322
    .line 323
    .line 324
    if-nez v1, :cond_c

    .line 325
    .line 326
    sget-object v2, La/dcs0;->d:La/dcs0;

    .line 327
    .line 328
    :goto_7
    move-object/from16 v19, v2

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_c
    iget-object v2, v9, La/yx90;->h:La/dcs0;

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :goto_8
    if-nez v1, :cond_d

    .line 335
    .line 336
    iget-object v0, v0, La/ulo;->b:La/ucs0;

    .line 337
    .line 338
    :goto_9
    move-object/from16 v20, v0

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_d
    iget-object v0, v9, La/yx90;->i:La/ucs0;

    .line 342
    .line 343
    goto :goto_9

    .line 344
    :goto_a
    if-nez v1, :cond_e

    .line 345
    .line 346
    sget-object v0, La/b4x;->b:La/v3x;

    .line 347
    .line 348
    sget-object v0, La/rcf0;->e:La/rcf0;

    .line 349
    .line 350
    :goto_b
    move-object/from16 v21, v0

    .line 351
    .line 352
    goto :goto_c

    .line 353
    :cond_e
    iget-object v0, v9, La/yx90;->j:Ljava/util/List;

    .line 354
    .line 355
    goto :goto_b

    .line 356
    :goto_c
    const-wide/16 v17, 0x0

    .line 357
    .line 358
    move-wide v13, v11

    .line 359
    move-wide v15, v11

    .line 360
    invoke-virtual/range {v9 .. v21}, La/yx90;->d(La/vn30;JJJJLa/dcs0;La/ucs0;Ljava/util/List;)La/yx90;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0, v10}, La/yx90;->c(La/vn30;)La/yx90;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iput-wide v11, v0, La/yx90;->q:J

    .line 369
    .line 370
    return-object v0
.end method

.method public final C(La/bmq0;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, La/bmq0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput p2, p0, La/ulo;->o0:I

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p1, p3, p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    move-wide p3, v1

    .line 21
    :cond_0
    iput-wide p3, p0, La/ulo;->p0:J

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 v0, -0x1

    .line 26
    if-eq p2, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, La/bmq0;->o()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lt p2, v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    move v3, p2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    iget-boolean p2, p0, La/ulo;->I:Z

    .line 38
    .line 39
    invoke-virtual {p1, p2}, La/bmq0;->a(Z)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object p3, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 44
    .line 45
    invoke-virtual {p1, p2, p3, v1, v2}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    iget-wide p3, p3, Landroidx/media3/common/Timeline$Window;->k:J

    .line 50
    .line 51
    invoke-static {p3, p4}, La/vtt0;->Y(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide p3

    .line 55
    goto :goto_0

    .line 56
    :goto_2
    iget-object v2, p0, La/ulo;->o:La/amq0;

    .line 57
    .line 58
    invoke-static {p3, p4}, La/vtt0;->M(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    iget-object v1, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 63
    .line 64
    move-object v0, p1

    .line 65
    invoke-virtual/range {v0 .. v5}, La/bmq0;->i(Landroidx/media3/common/Timeline$Window;La/amq0;IJ)Landroid/util/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public final D(II)V
    .locals 3

    .line 1
    iget-object v0, p0, La/ulo;->Z:La/e7k0;

    .line 2
    .line 3
    iget v1, v0, La/e7k0;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget v0, v0, La/e7k0;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, La/e7k0;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, La/e7k0;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/ulo;->Z:La/e7k0;

    .line 19
    .line 20
    new-instance v0, La/jlo;

    .line 21
    .line 22
    invoke-direct {v0, p1, p2}, La/jlo;-><init>(II)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/ulo;->m:La/vg00;

    .line 26
    .line 27
    const/16 v2, 0x18

    .line 28
    .line 29
    invoke-virtual {v1, v2, v0}, La/vg00;->e(ILa/sg00;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, La/e7k0;

    .line 33
    .line 34
    invoke-direct {v0, p1, p2}, La/e7k0;-><init>(II)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    const/16 p2, 0xe

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2, v0}, La/ulo;->M(IILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final E()V
    .locals 12

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget v1, v0, La/yx90;->e:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, La/yx90;->f(La/dlo;)La/yx90;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, La/yx90;->a:La/bmq0;

    .line 18
    .line 19
    invoke-virtual {v1}, La/bmq0;->p()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    :goto_0
    invoke-static {v0, v1}, La/ulo;->A(La/yx90;I)La/yx90;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v0, p0, La/ulo;->J:I

    .line 33
    .line 34
    add-int/2addr v0, v2

    .line 35
    iput v0, p0, La/ulo;->J:I

    .line 36
    .line 37
    iget-object v0, p0, La/ulo;->l:La/dmo;

    .line 38
    .line 39
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 40
    .line 41
    const/16 v1, 0x1d

    .line 42
    .line 43
    invoke-virtual {v0, v1}, La/q9o0;->a(I)La/p9o0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, La/p9o0;->b()V

    .line 48
    .line 49
    .line 50
    const/4 v10, -0x1

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v5, 0x1

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x5

    .line 55
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    move-object v3, p0

    .line 61
    invoke-virtual/range {v3 .. v11}, La/ulo;->a0(La/yx90;IZIJIZ)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final F()V
    .locals 7

    .line 1
    const-string v0, "ExoPlayerImpl"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Release "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, " [AndroidXMedia3/1.11.1] ["

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "] ["

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    sget-object v2, La/hn30;->a:Ljava/util/HashSet;

    .line 37
    .line 38
    const-class v2, La/hn30;

    .line 39
    .line 40
    monitor-enter v2

    .line 41
    :try_start_0
    sget-object v3, La/hn30;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit v2

    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, "]"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v0, v1}, La/f1t0;->a0(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, La/ulo;->y:La/o24;

    .line 63
    .line 64
    invoke-virtual {v0}, La/o24;->r()V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, La/ulo;->z:La/m9c;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0, v1}, La/m9c;->f(Z)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, La/ulo;->A:La/nqd;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, La/nqd;->f(Z)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, La/ulo;->E:La/oif0;

    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 v3, 0x22

    .line 85
    .line 86
    if-lt v2, v3, :cond_1

    .line 87
    .line 88
    iget-object v2, v0, La/oif0;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Landroid/content/Context;

    .line 97
    .line 98
    if-nez v2, :cond_0

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    iget-object v0, v0, La/oif0;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, La/tlo;

    .line 104
    .line 105
    invoke-static {v2, v0}, La/dwf;->o(Landroid/content/Context;La/tlo;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    :goto_0
    iget-object v0, p0, La/ulo;->D:La/tzi;

    .line 109
    .line 110
    iget-object v2, v0, La/tzi;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, La/q9o0;

    .line 113
    .line 114
    invoke-virtual {v2}, La/q9o0;->f()V

    .line 115
    .line 116
    .line 117
    iget-object v2, v0, La/tzi;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, La/ulo;

    .line 120
    .line 121
    iget-object v0, v0, La/tzi;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, La/bum0;

    .line 124
    .line 125
    invoke-virtual {v2, v0}, La/ulo;->G(La/ky90;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, La/ulo;->l:La/dmo;

    .line 129
    .line 130
    iget-boolean v2, v0, La/dmo;->k1:Z

    .line 131
    .line 132
    const/4 v3, 0x1

    .line 133
    if-nez v2, :cond_3

    .line 134
    .line 135
    iget-object v2, v0, La/dmo;->i:Landroid/os/Looper;

    .line 136
    .line 137
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-nez v2, :cond_2

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_2
    iput-boolean v3, v0, La/dmo;->k1:Z

    .line 149
    .line 150
    new-instance v2, La/brd;

    .line 151
    .line 152
    iget-object v4, v0, La/dmo;->o:La/l9o0;

    .line 153
    .line 154
    invoke-direct {v2, v4}, La/brd;-><init>(La/l9o0;)V

    .line 155
    .line 156
    .line 157
    iget-object v4, v0, La/dmo;->g:La/q9o0;

    .line 158
    .line 159
    const/4 v5, 0x7

    .line 160
    invoke-virtual {v4, v5, v2}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual {v4}, La/p9o0;->b()V

    .line 165
    .line 166
    .line 167
    iget-short v0, v0, La/dmo;->t:S

    .line 168
    .line 169
    int-to-long v4, v0

    .line 170
    invoke-virtual {v2, v4, v5}, La/brd;->b(J)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    goto :goto_2

    .line 175
    :cond_3
    :goto_1
    move v0, v3

    .line 176
    :goto_2
    if-nez v0, :cond_4

    .line 177
    .line 178
    iget-object v0, p0, La/ulo;->m:La/vg00;

    .line 179
    .line 180
    new-instance v2, La/udk;

    .line 181
    .line 182
    const/16 v4, 0xd

    .line 183
    .line 184
    invoke-direct {v2, v4}, La/udk;-><init>(B)V

    .line 185
    .line 186
    .line 187
    const/16 v4, 0xa

    .line 188
    .line 189
    invoke-virtual {v0, v4, v2}, La/vg00;->e(ILa/sg00;)V

    .line 190
    .line 191
    .line 192
    :cond_4
    iget-object v0, p0, La/ulo;->m:La/vg00;

    .line 193
    .line 194
    invoke-virtual {v0}, La/vg00;->d()V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, La/ulo;->j:La/q9o0;

    .line 198
    .line 199
    invoke-virtual {v0}, La/q9o0;->f()V

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, La/ulo;->u:La/rsj;

    .line 203
    .line 204
    iget-object v2, p0, La/ulo;->s:La/fsj;

    .line 205
    .line 206
    iget-object v0, v0, La/rsj;->c:La/gnw0;

    .line 207
    .line 208
    iget-object v0, v0, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_6

    .line 219
    .line 220
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    check-cast v5, La/no5;

    .line 225
    .line 226
    iget-object v6, v5, La/no5;->b:La/fsj;

    .line 227
    .line 228
    if-ne v6, v2, :cond_5

    .line 229
    .line 230
    iput-boolean v3, v5, La/no5;->c:Z

    .line 231
    .line 232
    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 237
    .line 238
    iget-boolean v2, v0, La/yx90;->p:Z

    .line 239
    .line 240
    if-eqz v2, :cond_7

    .line 241
    .line 242
    invoke-virtual {v0}, La/yx90;->a()La/yx90;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    iput-object v0, p0, La/ulo;->n0:La/yx90;

    .line 247
    .line 248
    :cond_7
    invoke-static {v0, v3}, La/ulo;->A(La/yx90;I)La/yx90;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iput-object v0, p0, La/ulo;->n0:La/yx90;

    .line 253
    .line 254
    iget-object v2, v0, La/yx90;->b:La/vn30;

    .line 255
    .line 256
    invoke-virtual {v0, v2}, La/yx90;->c(La/vn30;)La/yx90;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iput-object v0, p0, La/ulo;->n0:La/yx90;

    .line 261
    .line 262
    iget-wide v4, v0, La/yx90;->s:J

    .line 263
    .line 264
    iput-wide v4, v0, La/yx90;->q:J

    .line 265
    .line 266
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 267
    .line 268
    const-wide/16 v4, 0x0

    .line 269
    .line 270
    iput-wide v4, v0, La/yx90;->r:J

    .line 271
    .line 272
    iget-object v0, p0, La/ulo;->s:La/fsj;

    .line 273
    .line 274
    iget-object v2, v0, La/fsj;->h:La/q9o0;

    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    new-instance v4, La/ccf;

    .line 280
    .line 281
    const/4 v5, 0x4

    .line 282
    invoke-direct {v4, v0, v5}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v4}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0}, La/ulo;->H()V

    .line 289
    .line 290
    .line 291
    iget-object v0, p0, La/ulo;->T:Landroid/view/Surface;

    .line 292
    .line 293
    if-eqz v0, :cond_8

    .line 294
    .line 295
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 296
    .line 297
    .line 298
    const/4 v0, 0x0

    .line 299
    iput-object v0, p0, La/ulo;->T:Landroid/view/Surface;

    .line 300
    .line 301
    :cond_8
    sget-object v0, La/dtf;->c:La/dtf;

    .line 302
    .line 303
    iput-object v0, p0, La/ulo;->d0:La/dtf;

    .line 304
    .line 305
    iput-boolean v3, p0, La/ulo;->h0:Z

    .line 306
    .line 307
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 308
    .line 309
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 310
    .line 311
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-nez v0, :cond_a

    .line 316
    .line 317
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 318
    .line 319
    iget-object v2, v0, La/yx90;->a:La/bmq0;

    .line 320
    .line 321
    iget-object v0, v0, La/yx90;->b:La/vn30;

    .line 322
    .line 323
    iget-object v0, v0, La/vn30;->a:Ljava/lang/Object;

    .line 324
    .line 325
    invoke-virtual {v2, v0}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    const/4 v2, -0x1

    .line 330
    if-eq v0, v2, :cond_9

    .line 331
    .line 332
    move v1, v3

    .line 333
    :cond_9
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 334
    .line 335
    const-string v2, "periodUid %s not found in timeline %s with size %d"

    .line 336
    .line 337
    iget-object v3, p0, La/ulo;->n0:La/yx90;

    .line 338
    .line 339
    iget-object v4, v3, La/yx90;->b:La/vn30;

    .line 340
    .line 341
    iget-object v4, v4, La/vn30;->a:Ljava/lang/Object;

    .line 342
    .line 343
    iget-object v3, v3, La/yx90;->a:La/bmq0;

    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 354
    .line 355
    iget-object p0, p0, La/yx90;->a:La/bmq0;

    .line 356
    .line 357
    invoke-virtual {p0}, La/bmq0;->o()I

    .line 358
    .line 359
    .line 360
    move-result p0

    .line 361
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    filled-new-array {v4, v3, p0}, [Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    invoke-static {v0, v2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    invoke-static {p0, v1}, La/x0x;->J(Ljava/lang/String;Z)V

    .line 374
    .line 375
    .line 376
    :cond_a
    return-void

    .line 377
    :catchall_0
    move-exception p0

    .line 378
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 379
    throw p0
.end method

.method public final G(La/ky90;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/ulo;->m:La/vg00;

    .line 8
    .line 9
    iget-boolean v0, p0, La/vg00;->i:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v3, p0, La/vg00;->a:Ljava/lang/Thread;

    .line 21
    .line 22
    if-ne v0, v3, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v1

    .line 27
    :goto_0
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 28
    .line 29
    .line 30
    :goto_1
    iget-object v0, p0, La/vg00;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, La/ug00;

    .line 47
    .line 48
    iget-object v5, v4, La/ug00;->a:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    iget-object v5, p0, La/vg00;->c:La/tg00;

    .line 57
    .line 58
    iput-boolean v2, v4, La/ug00;->d:Z

    .line 59
    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    iget-boolean v6, v4, La/ug00;->c:Z

    .line 63
    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    iput-boolean v1, v4, La/ug00;->c:Z

    .line 67
    .line 68
    iget-object v6, v4, La/ug00;->a:Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v7, v4, La/ug00;->b:La/s88;

    .line 71
    .line 72
    invoke-virtual {v7}, La/s88;->e()La/jjq;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-interface {v5, v6, v7}, La/tg00;->b(Ljava/lang/Object;La/jjq;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    return-void
.end method

.method public final H()V
    .locals 4

    .line 1
    iget-object v0, p0, La/ulo;->V:La/qxk0;

    .line 2
    .line 3
    iget-object v1, p0, La/ulo;->w:La/qlo;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La/ulo;->x:La/rlo;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/ulo;->e(La/x8a0;)La/y8a0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-boolean v3, v0, La/y8a0;->f:Z

    .line 15
    .line 16
    xor-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 19
    .line 20
    .line 21
    const/16 v3, 0x2710

    .line 22
    .line 23
    iput-short v3, v0, La/y8a0;->c:S

    .line 24
    .line 25
    iget-boolean v3, v0, La/y8a0;->f:Z

    .line 26
    .line 27
    xor-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v0, La/y8a0;->d:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v0}, La/y8a0;->b()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/ulo;->V:La/qxk0;

    .line 38
    .line 39
    iget-object v0, v0, La/qxk0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, La/ulo;->V:La/qxk0;

    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, La/ulo;->X:Landroid/view/TextureView;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eq v0, v1, :cond_1

    .line 55
    .line 56
    const-string v0, "ExoPlayerImpl"

    .line 57
    .line 58
    const-string v3, "SurfaceTextureListener already unset or replaced."

    .line 59
    .line 60
    invoke-static {v0, v3}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-object v0, p0, La/ulo;->X:Landroid/view/TextureView;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    iput-object v2, p0, La/ulo;->X:Landroid/view/TextureView;

    .line 70
    .line 71
    :cond_2
    iget-object v0, p0, La/ulo;->U:Landroid/view/SurfaceHolder;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, La/ulo;->U:Landroid/view/SurfaceHolder;

    .line 79
    .line 80
    :cond_3
    return-void
.end method

.method public final I(IJZ)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne p1, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-ltz p1, :cond_1

    .line 11
    .line 12
    move v5, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v5, v3

    .line 15
    :goto_0
    invoke-static {v5}, La/x0x;->A(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v5, p0, La/ulo;->n0:La/yx90;

    .line 19
    .line 20
    iget-object v5, v5, La/yx90;->a:La/bmq0;

    .line 21
    .line 22
    invoke-virtual {v5}, La/bmq0;->p()Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-nez v6, :cond_2

    .line 27
    .line 28
    invoke-virtual {v5}, La/bmq0;->o()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-lt p1, v6, :cond_2

    .line 33
    .line 34
    :goto_1
    return-void

    .line 35
    :cond_2
    iget-object v6, p0, La/ulo;->s:La/fsj;

    .line 36
    .line 37
    iget-boolean v7, v6, La/fsj;->i:Z

    .line 38
    .line 39
    if-nez v7, :cond_3

    .line 40
    .line 41
    invoke-virtual {v6}, La/fsj;->I()La/ft2;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    iput-boolean v4, v6, La/fsj;->i:Z

    .line 46
    .line 47
    new-instance v8, La/t9f;

    .line 48
    .line 49
    const/16 v9, 0x13

    .line 50
    .line 51
    invoke-direct {v8, v9}, La/t9f;-><init>(B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6, v7, v2, v8}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget v2, p0, La/ulo;->J:I

    .line 58
    .line 59
    add-int/2addr v2, v4

    .line 60
    iput v2, p0, La/ulo;->J:I

    .line 61
    .line 62
    invoke-virtual {p0}, La/ulo;->z()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    const-string v1, "ExoPlayerImpl"

    .line 69
    .line 70
    const-string v2, "seekTo ignored because an ad is playing"

    .line 71
    .line 72
    invoke-static {v1, v2}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, La/amo;

    .line 76
    .line 77
    iget-object v2, p0, La/ulo;->n0:La/yx90;

    .line 78
    .line 79
    invoke-direct {v1, v2}, La/amo;-><init>(La/yx90;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v4}, La/amo;->c(I)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, La/ulo;->k:La/klo;

    .line 86
    .line 87
    iget-object v0, v0, La/klo;->a:La/ulo;

    .line 88
    .line 89
    iget-object v2, v0, La/ulo;->j:La/q9o0;

    .line 90
    .line 91
    new-instance v4, La/llo;

    .line 92
    .line 93
    invoke-direct {v4, v0, v1, v3}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v4}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    iget-object v2, p0, La/ulo;->n0:La/yx90;

    .line 101
    .line 102
    iget v3, v2, La/yx90;->e:I

    .line 103
    .line 104
    const/4 v4, 0x3

    .line 105
    if-eq v3, v4, :cond_5

    .line 106
    .line 107
    const/4 v6, 0x4

    .line 108
    if-ne v3, v6, :cond_6

    .line 109
    .line 110
    invoke-virtual {v5}, La/bmq0;->p()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_6

    .line 115
    .line 116
    :cond_5
    iget-object v2, p0, La/ulo;->n0:La/yx90;

    .line 117
    .line 118
    const/4 v3, 0x2

    .line 119
    invoke-virtual {v2, v3}, La/yx90;->h(I)La/yx90;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :cond_6
    invoke-virtual {p0}, La/ulo;->j()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-virtual {p0, v5, p1, p2, p3}, La/ulo;->C(La/bmq0;IJ)Landroid/util/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {p0, v2, v5, v3}, La/ulo;->B(La/yx90;La/bmq0;Landroid/util/Pair;)La/yx90;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {p2, p3}, La/vtt0;->M(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    iget-object v3, p0, La/ulo;->l:La/dmo;

    .line 140
    .line 141
    iget-object v3, v3, La/dmo;->g:La/q9o0;

    .line 142
    .line 143
    new-instance v6, La/cmo;

    .line 144
    .line 145
    invoke-direct {v6, v5, p1, v8, v9}, La/cmo;-><init>(La/bmq0;IJ)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v4, v6}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, La/p9o0;->b()V

    .line 153
    .line 154
    .line 155
    const/4 v4, 0x1

    .line 156
    invoke-virtual {p0, v2}, La/ulo;->m(La/yx90;)J

    .line 157
    .line 158
    .line 159
    move-result-wide v5

    .line 160
    move-object v1, v2

    .line 161
    const/4 v2, 0x0

    .line 162
    const/4 v3, 0x1

    .line 163
    move-object v0, p0

    .line 164
    move v8, p4

    .line 165
    invoke-virtual/range {v0 .. v8}, La/ulo;->a0(La/yx90;IZIJIZ)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final J(J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ulo;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v0, p1, p2, v1}, La/ulo;->I(IJZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final K()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_9

    .line 10
    .line 11
    invoke-virtual {p0}, La/ulo;->z()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, -0x1

    .line 28
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0}, La/ulo;->j()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 39
    .line 40
    .line 41
    iget v5, p0, La/ulo;->H:I

    .line 42
    .line 43
    if-ne v5, v3, :cond_2

    .line 44
    .line 45
    move v5, v4

    .line 46
    :cond_2
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 47
    .line 48
    .line 49
    iget-boolean v6, p0, La/ulo;->I:Z

    .line 50
    .line 51
    invoke-virtual {v0, v1, v5, v6}, La/bmq0;->e(IIZ)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_0
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    if-eq v0, v2, :cond_7

    .line 61
    .line 62
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    move v0, v2

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {p0}, La/ulo;->j()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 79
    .line 80
    .line 81
    iget v7, p0, La/ulo;->H:I

    .line 82
    .line 83
    if-ne v7, v3, :cond_4

    .line 84
    .line 85
    move v7, v4

    .line 86
    :cond_4
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 87
    .line 88
    .line 89
    iget-boolean v8, p0, La/ulo;->I:Z

    .line 90
    .line 91
    invoke-virtual {v0, v1, v7, v8}, La/bmq0;->e(IIZ)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    :goto_1
    if-ne v0, v2, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    invoke-virtual {p0}, La/ulo;->j()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-ne v0, v1, :cond_6

    .line 106
    .line 107
    invoke-virtual {p0}, La/ulo;->j()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {p0, v0, v5, v6, v3}, La/ulo;->I(IJZ)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_6
    invoke-virtual {p0, v0, v5, v6, v4}, La/ulo;->I(IJZ)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_7
    invoke-virtual {p0}, La/ulo;->x()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_8

    .line 134
    .line 135
    invoke-virtual {p0}, La/ulo;->j()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iget-object v2, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 140
    .line 141
    const-wide/16 v7, 0x0

    .line 142
    .line 143
    invoke-virtual {v0, v1, v2, v7, v8}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-boolean v0, v0, Landroidx/media3/common/Timeline$Window;->h:Z

    .line 148
    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    invoke-virtual {p0}, La/ulo;->j()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-virtual {p0, v0, v5, v6, v4}, La/ulo;->I(IJZ)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_8
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_9
    :goto_2
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final L()V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_10

    .line 10
    .line 11
    invoke-virtual {p0}, La/ulo;->z()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_5

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, -0x1

    .line 28
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0}, La/ulo;->j()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 39
    .line 40
    .line 41
    iget v5, p0, La/ulo;->H:I

    .line 42
    .line 43
    if-ne v5, v3, :cond_2

    .line 44
    .line 45
    move v5, v4

    .line 46
    :cond_2
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 47
    .line 48
    .line 49
    iget-boolean v6, p0, La/ulo;->I:Z

    .line 50
    .line 51
    invoke-virtual {v0, v1, v5, v6}, La/bmq0;->k(IIZ)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_0
    if-eq v0, v2, :cond_3

    .line 56
    .line 57
    move v0, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move v0, v4

    .line 60
    :goto_1
    invoke-virtual {p0}, La/ulo;->x()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    const-wide/16 v7, 0x0

    .line 70
    .line 71
    if-eqz v1, :cond_a

    .line 72
    .line 73
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, La/bmq0;->p()Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-nez v9, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0}, La/ulo;->j()I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    iget-object v10, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 88
    .line 89
    invoke-virtual {v1, v9, v10, v7, v8}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-boolean v1, v1, Landroidx/media3/common/Timeline$Window;->g:Z

    .line 94
    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    if-eqz v0, :cond_9

    .line 99
    .line 100
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    move v0, v2

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    invoke-virtual {p0}, La/ulo;->j()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 117
    .line 118
    .line 119
    iget v7, p0, La/ulo;->H:I

    .line 120
    .line 121
    if-ne v7, v3, :cond_6

    .line 122
    .line 123
    move v7, v4

    .line 124
    :cond_6
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 125
    .line 126
    .line 127
    iget-boolean v8, p0, La/ulo;->I:Z

    .line 128
    .line 129
    invoke-virtual {v0, v1, v7, v8}, La/bmq0;->k(IIZ)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    :goto_2
    if-ne v0, v2, :cond_7

    .line 134
    .line 135
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_7
    invoke-virtual {p0}, La/ulo;->j()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-ne v0, v1, :cond_8

    .line 144
    .line 145
    invoke-virtual {p0}, La/ulo;->j()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-virtual {p0, v0, v5, v6, v3}, La/ulo;->I(IJZ)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_8
    invoke-virtual {p0, v0, v5, v6, v4}, La/ulo;->I(IJZ)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_9
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_a
    :goto_3
    if-eqz v0, :cond_f

    .line 162
    .line 163
    invoke-virtual {p0}, La/ulo;->l()J

    .line 164
    .line 165
    .line 166
    move-result-wide v0

    .line 167
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 168
    .line 169
    .line 170
    iget-short v9, p0, La/ulo;->l0:S

    .line 171
    .line 172
    int-to-long v9, v9

    .line 173
    cmp-long v0, v0, v9

    .line 174
    .line 175
    if-gtz v0, :cond_f

    .line 176
    .line 177
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_b

    .line 186
    .line 187
    move v0, v2

    .line 188
    goto :goto_4

    .line 189
    :cond_b
    invoke-virtual {p0}, La/ulo;->j()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 194
    .line 195
    .line 196
    iget v7, p0, La/ulo;->H:I

    .line 197
    .line 198
    if-ne v7, v3, :cond_c

    .line 199
    .line 200
    move v7, v4

    .line 201
    :cond_c
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 202
    .line 203
    .line 204
    iget-boolean v8, p0, La/ulo;->I:Z

    .line 205
    .line 206
    invoke-virtual {v0, v1, v7, v8}, La/bmq0;->k(IIZ)I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    :goto_4
    if-ne v0, v2, :cond_d

    .line 211
    .line 212
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_d
    invoke-virtual {p0}, La/ulo;->j()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-ne v0, v1, :cond_e

    .line 221
    .line 222
    invoke-virtual {p0}, La/ulo;->j()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    invoke-virtual {p0, v0, v5, v6, v3}, La/ulo;->I(IJZ)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_e
    invoke-virtual {p0, v0, v5, v6, v4}, La/ulo;->I(IJZ)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_f
    invoke-virtual {p0, v7, v8}, La/ulo;->J(J)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_10
    :goto_5
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 239
    .line 240
    .line 241
    return-void
.end method

.method public final M(IILjava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/ulo;->g:[La/j16;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, -0x1

    .line 7
    if-ge v3, v1, :cond_2

    .line 8
    .line 9
    aget-object v5, v0, v3

    .line 10
    .line 11
    if-eq p1, v4, :cond_0

    .line 12
    .line 13
    iget-byte v4, v5, La/j16;->b:B

    .line 14
    .line 15
    if-ne v4, p1, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, v5}, La/ulo;->e(La/x8a0;)La/y8a0;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v5, v4, La/y8a0;->f:Z

    .line 22
    .line 23
    xor-int/lit8 v5, v5, 0x1

    .line 24
    .line 25
    invoke-static {v5}, La/x0x;->K(Z)V

    .line 26
    .line 27
    .line 28
    iput-short p2, v4, La/y8a0;->c:S

    .line 29
    .line 30
    iget-boolean v5, v4, La/y8a0;->f:Z

    .line 31
    .line 32
    xor-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    invoke-static {v5}, La/x0x;->K(Z)V

    .line 35
    .line 36
    .line 37
    iput-object p3, v4, La/y8a0;->d:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v4}, La/y8a0;->b()V

    .line 40
    .line 41
    .line 42
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget-object v0, p0, La/ulo;->h:[La/j16;

    .line 46
    .line 47
    array-length v1, v0

    .line 48
    :goto_1
    if-ge v2, v1, :cond_5

    .line 49
    .line 50
    aget-object v3, v0, v2

    .line 51
    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    if-eq p1, v4, :cond_3

    .line 55
    .line 56
    iget-byte v5, v3, La/j16;->b:B

    .line 57
    .line 58
    if-ne v5, p1, :cond_4

    .line 59
    .line 60
    :cond_3
    invoke-virtual {p0, v3}, La/ulo;->e(La/x8a0;)La/y8a0;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-boolean v5, v3, La/y8a0;->f:Z

    .line 65
    .line 66
    xor-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    invoke-static {v5}, La/x0x;->K(Z)V

    .line 69
    .line 70
    .line 71
    iput-short p2, v3, La/y8a0;->c:S

    .line 72
    .line 73
    iget-boolean v5, v3, La/y8a0;->f:Z

    .line 74
    .line 75
    xor-int/lit8 v5, v5, 0x1

    .line 76
    .line 77
    invoke-static {v5}, La/x0x;->K(Z)V

    .line 78
    .line 79
    .line 80
    iput-object p3, v3, La/y8a0;->d:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v3}, La/y8a0;->b()V

    .line 83
    .line 84
    .line 85
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    return-void
.end method

.method public final N(Landroidx/media3/common/MediaItem;)V
    .locals 13

    .line 1
    invoke-static {p1}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    iget v5, v1, La/rcf0;->d:I

    .line 16
    .line 17
    if-ge v4, v5, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v4}, La/rcf0;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Landroidx/media3/common/MediaItem;

    .line 24
    .line 25
    iget-object v6, p0, La/ulo;->r:La/un30;

    .line 26
    .line 27
    invoke-interface {v6, v5}, La/un30;->b(Landroidx/media3/common/MediaItem;)La/e06;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, La/ulo;->n0:La/yx90;

    .line 41
    .line 42
    invoke-virtual {p0, v1}, La/ulo;->p(La/yx90;)I

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/ulo;->l()J

    .line 46
    .line 47
    .line 48
    iget v1, p0, La/ulo;->J:I

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    add-int/2addr v1, v4

    .line 52
    iput v1, p0, La/ulo;->J:I

    .line 53
    .line 54
    iget-object v1, p0, La/ulo;->p:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 57
    .line 58
    .line 59
    new-instance v6, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    move v5, v3

    .line 65
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-ge v5, v7, :cond_1

    .line 70
    .line 71
    new-instance v7, La/io30;

    .line 72
    .line 73
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, La/e06;

    .line 78
    .line 79
    iget-boolean v9, p0, La/ulo;->q:Z

    .line 80
    .line 81
    invoke-direct {v7, v8, v9}, La/io30;-><init>(La/e06;Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    new-instance v8, La/slo;

    .line 88
    .line 89
    iget-object v9, v7, La/io30;->b:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v7, v7, La/io30;->a:La/i930;

    .line 92
    .line 93
    invoke-direct {v8, v9, v7}, La/slo;-><init>(Ljava/lang/Object;La/i930;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v5, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v5, v5, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    iget-object v2, p0, La/ulo;->P:La/itj0;

    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v7, La/itj0;

    .line 112
    .line 113
    new-instance v8, Ljava/util/Random;

    .line 114
    .line 115
    iget-object v2, v2, La/itj0;->a:Ljava/util/Random;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    .line 118
    .line 119
    .line 120
    move-result-wide v9

    .line 121
    invoke-direct {v8, v9, v10}, Ljava/util/Random;-><init>(J)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v7, v8}, La/itj0;-><init>(Ljava/util/Random;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7, v5}, La/itj0;->a(I)La/itj0;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iput-object v2, p0, La/ulo;->P:La/itj0;

    .line 132
    .line 133
    new-instance v2, La/wna0;

    .line 134
    .line 135
    iget-object v5, p0, La/ulo;->P:La/itj0;

    .line 136
    .line 137
    invoke-direct {v2, v1, v5}, La/wna0;-><init>(Ljava/util/ArrayList;La/itj0;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, La/bmq0;->p()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    const/4 v5, -0x1

    .line 145
    iget v7, v2, La/wna0;->d:I

    .line 146
    .line 147
    if-nez v1, :cond_3

    .line 148
    .line 149
    if-ge v5, v7, :cond_2

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    new-instance v0, La/byw;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_3
    :goto_2
    iget-boolean v1, p0, La/ulo;->I:Z

    .line 159
    .line 160
    invoke-virtual {v2, v1}, La/wna0;->a(Z)I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    iget-object v1, p0, La/ulo;->n0:La/yx90;

    .line 165
    .line 166
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    invoke-virtual {p0, v2, v8, v9, v10}, La/ulo;->C(La/bmq0;IJ)Landroid/util/Pair;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-virtual {p0, v1, v2, v11}, La/ulo;->B(La/yx90;La/bmq0;Landroid/util/Pair;)La/yx90;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    iget v11, v1, La/yx90;->e:I

    .line 180
    .line 181
    if-ne v11, v4, :cond_4

    .line 182
    .line 183
    move v11, v4

    .line 184
    goto :goto_4

    .line 185
    :cond_4
    invoke-virtual {v2}, La/bmq0;->p()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    const/4 v12, 0x4

    .line 190
    if-eqz v2, :cond_5

    .line 191
    .line 192
    :goto_3
    move v11, v12

    .line 193
    goto :goto_4

    .line 194
    :cond_5
    if-ne v8, v5, :cond_6

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_6
    if-lt v8, v7, :cond_7

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_7
    const/4 v11, 0x2

    .line 201
    :goto_4
    invoke-static {v1, v11}, La/ulo;->A(La/yx90;I)La/yx90;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-static {v9, v10}, La/vtt0;->M(J)J

    .line 206
    .line 207
    .line 208
    move-result-wide v9

    .line 209
    iget-object v7, p0, La/ulo;->P:La/itj0;

    .line 210
    .line 211
    iget-object v2, p0, La/ulo;->l:La/dmo;

    .line 212
    .line 213
    iget-object v2, v2, La/dmo;->g:La/q9o0;

    .line 214
    .line 215
    new-instance v5, La/zlo;

    .line 216
    .line 217
    invoke-direct/range {v5 .. v10}, La/zlo;-><init>(Ljava/util/ArrayList;La/itj0;IJ)V

    .line 218
    .line 219
    .line 220
    const/16 v6, 0x11

    .line 221
    .line 222
    invoke-virtual {v2, v6, v5}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v2}, La/p9o0;->b()V

    .line 227
    .line 228
    .line 229
    iget-object v2, p0, La/ulo;->n0:La/yx90;

    .line 230
    .line 231
    iget-object v2, v2, La/yx90;->b:La/vn30;

    .line 232
    .line 233
    iget-object v2, v2, La/vn30;->a:Ljava/lang/Object;

    .line 234
    .line 235
    iget-object v5, v1, La/yx90;->b:La/vn30;

    .line 236
    .line 237
    iget-object v5, v5, La/vn30;->a:Ljava/lang/Object;

    .line 238
    .line 239
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v2, :cond_8

    .line 244
    .line 245
    iget-object v2, p0, La/ulo;->n0:La/yx90;

    .line 246
    .line 247
    iget-object v2, v2, La/yx90;->a:La/bmq0;

    .line 248
    .line 249
    invoke-virtual {v2}, La/bmq0;->p()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-nez v2, :cond_8

    .line 254
    .line 255
    move v3, v4

    .line 256
    :cond_8
    invoke-virtual {p0, v1}, La/ulo;->m(La/yx90;)J

    .line 257
    .line 258
    .line 259
    move-result-wide v5

    .line 260
    const/4 v7, -0x1

    .line 261
    const/4 v8, 0x0

    .line 262
    const/4 v2, 0x0

    .line 263
    const/4 v4, 0x4

    .line 264
    move-object v0, p0

    .line 265
    invoke-virtual/range {v0 .. v8}, La/ulo;->a0(La/yx90;IZIJIZ)V

    .line 266
    .line 267
    .line 268
    return-void
.end method

.method public final O(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, La/ulo;->W:Z

    .line 3
    .line 4
    iput-object p1, p0, La/ulo;->U:Landroid/view/SurfaceHolder;

    .line 5
    .line 6
    iget-object v1, p0, La/ulo;->w:La/qlo;

    .line 7
    .line 8
    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, La/ulo;->U:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, La/ulo;->U:Landroid/view/SurfaceHolder;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0, v0, p1}, La/ulo;->D(II)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0, v0, v0}, La/ulo;->D(II)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final P(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0, p1}, La/ulo;->Z(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final Q(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, La/ulo;->H:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, La/ulo;->H:I

    .line 9
    .line 10
    iget-object v0, p0, La/ulo;->l:La/dmo;

    .line 11
    .line 12
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 13
    .line 14
    const/16 v1, 0xb

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, p1, v2}, La/q9o0;->b(III)La/p9o0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, La/p9o0;->b()V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/bsj;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p1, v1}, La/bsj;-><init>(IB)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, La/ulo;->m:La/vg00;

    .line 31
    .line 32
    const/16 v1, 0x8

    .line 33
    .line 34
    invoke-virtual {p1, v1, v0}, La/vg00;->c(ILa/sg00;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/ulo;->Y()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, La/vg00;->b()V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public final R(La/scs0;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ulo;->i:La/syj;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/ulo;->v()La/scs0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-boolean v2, p0, La/ulo;->M:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-object v2, p1, La/scs0;->x:La/f4x;

    .line 18
    .line 19
    iput-object v2, p0, La/ulo;->N:La/f4x;

    .line 20
    .line 21
    iget-object v2, p0, La/ulo;->O:La/uch0;

    .line 22
    .line 23
    iget-object v2, v2, La/uch0;->a:La/f4x;

    .line 24
    .line 25
    invoke-virtual {p1}, La/scs0;->a()La/rcs0;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2}, La/s3x;->j()La/eet0;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v5, 0x1

    .line 50
    invoke-virtual {v3, v4, v5}, La/rcs0;->i(IZ)La/rcs0;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v3}, La/rcs0;->a()La/scs0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object v2, p1

    .line 60
    :goto_1
    iget-object v3, v0, La/syj;->e:La/nyj;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, La/scs0;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0, v2}, La/syj;->l(La/scs0;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {v1, p1}, La/scs0;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    new-instance v0, La/z9f;

    .line 78
    .line 79
    const/16 v1, 0x13

    .line 80
    .line 81
    invoke-direct {v0, p1, v1}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/ulo;->m:La/vg00;

    .line 85
    .line 86
    invoke-virtual {p0, v1, v0}, La/vg00;->e(ILa/sg00;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void
.end method

.method public final S(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/ulo;->S:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-short v4, p0, La/ulo;->B:S

    .line 19
    .line 20
    int-to-long v4, v4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-wide v4, v2

    .line 23
    :goto_1
    iget-object v6, p0, La/ulo;->l:La/dmo;

    .line 24
    .line 25
    iget-boolean v7, v6, La/dmo;->k1:Z

    .line 26
    .line 27
    if-nez v7, :cond_3

    .line 28
    .line 29
    iget-object v7, v6, La/dmo;->i:Landroid/os/Looper;

    .line 30
    .line 31
    invoke-virtual {v7}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual {v7}, Ljava/lang/Thread;->isAlive()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-nez v7, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    new-instance v7, La/brd;

    .line 43
    .line 44
    iget-object v8, v6, La/dmo;->o:La/l9o0;

    .line 45
    .line 46
    invoke-direct {v7, v8}, La/brd;-><init>(La/l9o0;)V

    .line 47
    .line 48
    .line 49
    iget-object v6, v6, La/dmo;->g:La/q9o0;

    .line 50
    .line 51
    new-instance v8, Landroid/util/Pair;

    .line 52
    .line 53
    invoke-direct {v8, p1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/16 v9, 0x1e

    .line 57
    .line 58
    invoke-virtual {v6, v9, v8}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v6}, La/p9o0;->b()V

    .line 63
    .line 64
    .line 65
    cmp-long v2, v4, v2

    .line 66
    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-virtual {v7, v4, v5}, La/brd;->b(J)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    .line 74
    .line 75
    iget-object v0, p0, La/ulo;->S:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v2, p0, La/ulo;->T:Landroid/view/Surface;

    .line 78
    .line 79
    if-ne v0, v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    iput-object v0, p0, La/ulo;->T:Landroid/view/Surface;

    .line 86
    .line 87
    :cond_4
    iput-object p1, p0, La/ulo;->S:Ljava/lang/Object;

    .line 88
    .line 89
    if-nez v1, :cond_5

    .line 90
    .line 91
    new-instance p1, La/ss3;

    .line 92
    .line 93
    const-string v0, "Detaching surface timed out."

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, La/dlo;

    .line 99
    .line 100
    const/4 v1, 0x2

    .line 101
    const/16 v2, 0x3eb

    .line 102
    .line 103
    invoke-direct {v0, v1, p1, v2}, La/dlo;-><init>(ILjava/lang/Exception;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0}, La/ulo;->X(La/dlo;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    return-void
.end method

.method public final T(Landroid/view/SurfaceView;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/reu0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/ulo;->H()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/ulo;->S(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, La/ulo;->O(Landroid/view/SurfaceHolder;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v0, p1, La/qxk0;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    iget-object v2, p0, La/ulo;->w:La/qlo;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, La/ulo;->H()V

    .line 30
    .line 31
    .line 32
    move-object v0, p1

    .line 33
    check-cast v0, La/qxk0;

    .line 34
    .line 35
    iput-object v0, p0, La/ulo;->V:La/qxk0;

    .line 36
    .line 37
    iget-object v0, p0, La/ulo;->x:La/rlo;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, La/ulo;->e(La/x8a0;)La/y8a0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-boolean v3, v0, La/y8a0;->f:Z

    .line 44
    .line 45
    xor-int/2addr v3, v1

    .line 46
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 47
    .line 48
    .line 49
    const/16 v3, 0x2710

    .line 50
    .line 51
    iput-short v3, v0, La/y8a0;->c:S

    .line 52
    .line 53
    iget-object v3, p0, La/ulo;->V:La/qxk0;

    .line 54
    .line 55
    iget-boolean v4, v0, La/y8a0;->f:Z

    .line 56
    .line 57
    xor-int/2addr v1, v4

    .line 58
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 59
    .line 60
    .line 61
    iput-object v3, v0, La/y8a0;->d:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v0}, La/y8a0;->b()V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, La/ulo;->V:La/qxk0;

    .line 67
    .line 68
    iget-object v0, v0, La/qxk0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, La/ulo;->V:La/qxk0;

    .line 74
    .line 75
    invoke-virtual {v0}, La/qxk0;->getVideoSurface()Landroid/view/Surface;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0, v0}, La/ulo;->S(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, La/ulo;->O(Landroid/view/SurfaceHolder;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    const/4 v0, 0x0

    .line 91
    if-nez p1, :cond_2

    .line 92
    .line 93
    move-object p1, v0

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_0
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 100
    .line 101
    .line 102
    if-nez p1, :cond_3

    .line 103
    .line 104
    invoke-virtual {p0}, La/ulo;->d()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    invoke-virtual {p0}, La/ulo;->H()V

    .line 109
    .line 110
    .line 111
    iput-boolean v1, p0, La/ulo;->W:Z

    .line 112
    .line 113
    iput-object p1, p0, La/ulo;->U:Landroid/view/SurfaceHolder;

    .line 114
    .line 115
    invoke-interface {p1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_4

    .line 129
    .line 130
    invoke-virtual {p0, v1}, La/ulo;->S(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-virtual {p0, v0, p1}, La/ulo;->D(II)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_4
    invoke-virtual {p0, v0}, La/ulo;->S(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    invoke-virtual {p0, p1, p1}, La/ulo;->D(II)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final U(Landroid/view/TextureView;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, La/ulo;->d()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, La/ulo;->H()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ulo;->X:Landroid/view/TextureView;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "ExoPlayerImpl"

    .line 22
    .line 23
    const-string v1, "Replacing existing SurfaceTextureListener."

    .line 24
    .line 25
    invoke-static {v0, v1}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, La/ulo;->w:La/qlo;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v0, v1

    .line 46
    :goto_0
    if-nez v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, v1}, La/ulo;->S(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-virtual {p0, p1, p1}, La/ulo;->D(II)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    new-instance v1, Landroid/view/Surface;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, La/ulo;->S(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, La/ulo;->T:Landroid/view/Surface;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p0, v0, p1}, La/ulo;->D(II)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final V(F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, La/vtt0;->h(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, La/ulo;->b0:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, La/ulo;->b0:F

    .line 19
    .line 20
    iget-object v0, p0, La/ulo;->l:La/dmo;

    .line 21
    .line 22
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 23
    .line 24
    const/16 v1, 0x20

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v1, v2}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, La/p9o0;->b()V

    .line 35
    .line 36
    .line 37
    new-instance v0, La/ilo;

    .line 38
    .line 39
    invoke-direct {v0, p1}, La/ilo;-><init>(F)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/ulo;->m:La/vg00;

    .line 43
    .line 44
    const/16 p1, 0x16

    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, La/vg00;->e(ILa/sg00;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final W()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, La/ulo;->X(La/dlo;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, La/dtf;

    .line 9
    .line 10
    sget-object v1, La/b4x;->b:La/v3x;

    .line 11
    .line 12
    sget-object v1, La/rcf0;->e:La/rcf0;

    .line 13
    .line 14
    iget-object v2, p0, La/ulo;->n0:La/yx90;

    .line 15
    .line 16
    iget-wide v2, v2, La/yx90;->s:J

    .line 17
    .line 18
    invoke-direct {v0, v1}, La/dtf;-><init>(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/ulo;->d0:La/dtf;

    .line 22
    .line 23
    return-void
.end method

.method public final X(La/dlo;)V
    .locals 11

    .line 1
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 2
    .line 3
    iget-object v1, v0, La/yx90;->b:La/vn30;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/yx90;->c(La/vn30;)La/yx90;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, La/yx90;->s:J

    .line 10
    .line 11
    iput-wide v1, v0, La/yx90;->q:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, La/yx90;->r:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {v0, v1}, La/ulo;->A(La/yx90;I)La/yx90;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, La/yx90;->f(La/dlo;)La/yx90;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, La/ulo;->J:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, La/ulo;->J:I

    .line 33
    .line 34
    iget-object p1, p0, La/ulo;->l:La/dmo;

    .line 35
    .line 36
    iget-object p1, p1, La/dmo;->g:La/q9o0;

    .line 37
    .line 38
    const/4 v0, 0x6

    .line 39
    invoke-virtual {p1, v0}, La/q9o0;->a(I)La/p9o0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, La/p9o0;->b()V

    .line 44
    .line 45
    .line 46
    const/4 v9, -0x1

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x5

    .line 51
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    move-object v2, p0

    .line 57
    invoke-virtual/range {v2 .. v10}, La/ulo;->a0(La/yx90;IZIJIZ)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final Y()V
    .locals 15

    .line 1
    iget-object v0, p0, La/ulo;->Q:La/iy90;

    .line 2
    .line 3
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, La/ulo;->f:La/ulo;

    .line 6
    .line 7
    invoke-virtual {v1}, La/ulo;->z()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, v1, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 12
    .line 13
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v4}, La/bmq0;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    const/4 v9, 0x0

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, La/ulo;->j()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {v4, v5, v3, v6, v7}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-boolean v4, v4, Landroidx/media3/common/Timeline$Window;->g:Z

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    move v4, v8

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v4, v9

    .line 42
    :goto_0
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, La/bmq0;->p()Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    const/4 v11, -0x1

    .line 51
    if-eqz v10, :cond_1

    .line 52
    .line 53
    move v5, v11

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v1}, La/ulo;->j()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 60
    .line 61
    .line 62
    iget v12, v1, La/ulo;->H:I

    .line 63
    .line 64
    if-ne v12, v8, :cond_2

    .line 65
    .line 66
    move v12, v9

    .line 67
    :cond_2
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 68
    .line 69
    .line 70
    iget-boolean v13, v1, La/ulo;->I:Z

    .line 71
    .line 72
    invoke-virtual {v5, v10, v12, v13}, La/bmq0;->k(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    :goto_1
    if-eq v5, v11, :cond_3

    .line 77
    .line 78
    move v5, v8

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    move v5, v9

    .line 81
    :goto_2
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    invoke-virtual {v10}, La/bmq0;->p()Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-eqz v12, :cond_4

    .line 90
    .line 91
    move v10, v11

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    invoke-virtual {v1}, La/ulo;->j()I

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 98
    .line 99
    .line 100
    iget v13, v1, La/ulo;->H:I

    .line 101
    .line 102
    if-ne v13, v8, :cond_5

    .line 103
    .line 104
    move v13, v9

    .line 105
    :cond_5
    invoke-virtual {v1}, La/ulo;->c0()V

    .line 106
    .line 107
    .line 108
    iget-boolean v14, v1, La/ulo;->I:Z

    .line 109
    .line 110
    invoke-virtual {v10, v12, v13, v14}, La/bmq0;->e(IIZ)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    :goto_3
    if-eq v10, v11, :cond_6

    .line 115
    .line 116
    move v10, v8

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move v10, v9

    .line 119
    :goto_4
    invoke-virtual {v1}, La/ulo;->x()Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 124
    .line 125
    .line 126
    move-result-object v12

    .line 127
    invoke-virtual {v12}, La/bmq0;->p()Z

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-nez v13, :cond_7

    .line 132
    .line 133
    invoke-virtual {v1}, La/ulo;->j()I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    invoke-virtual {v12, v13, v3, v6, v7}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    iget-boolean v3, v3, Landroidx/media3/common/Timeline$Window;->h:Z

    .line 142
    .line 143
    if-eqz v3, :cond_7

    .line 144
    .line 145
    move v3, v8

    .line 146
    goto :goto_5

    .line 147
    :cond_7
    move v3, v9

    .line 148
    :goto_5
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, La/bmq0;->p()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    new-instance v6, La/hy90;

    .line 157
    .line 158
    invoke-direct {v6}, La/hy90;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-object v7, p0, La/ulo;->c:La/iy90;

    .line 162
    .line 163
    iget-object v7, v7, La/iy90;->a:La/jjq;

    .line 164
    .line 165
    iget-object v7, v7, La/jjq;->a:Landroid/util/SparseBooleanArray;

    .line 166
    .line 167
    move v12, v9

    .line 168
    :goto_6
    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->size()I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    iget-object v14, v6, La/hy90;->a:La/s88;

    .line 173
    .line 174
    if-ge v12, v13, :cond_8

    .line 175
    .line 176
    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->size()I

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    invoke-static {v12, v13}, La/x0x;->D(II)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7, v12}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    invoke-virtual {v14, v13}, La/s88;->b(I)V

    .line 188
    .line 189
    .line 190
    add-int/lit8 v12, v12, 0x1

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_8
    xor-int/lit8 v7, v2, 0x1

    .line 194
    .line 195
    const/4 v12, 0x4

    .line 196
    invoke-virtual {v6, v12, v7}, La/hy90;->a(IZ)V

    .line 197
    .line 198
    .line 199
    if-eqz v4, :cond_9

    .line 200
    .line 201
    if-nez v2, :cond_9

    .line 202
    .line 203
    move v12, v8

    .line 204
    goto :goto_7

    .line 205
    :cond_9
    move v12, v9

    .line 206
    :goto_7
    const/4 v13, 0x5

    .line 207
    invoke-virtual {v6, v13, v12}, La/hy90;->a(IZ)V

    .line 208
    .line 209
    .line 210
    if-eqz v5, :cond_a

    .line 211
    .line 212
    if-nez v2, :cond_a

    .line 213
    .line 214
    move v12, v8

    .line 215
    goto :goto_8

    .line 216
    :cond_a
    move v12, v9

    .line 217
    :goto_8
    const/4 v13, 0x6

    .line 218
    invoke-virtual {v6, v13, v12}, La/hy90;->a(IZ)V

    .line 219
    .line 220
    .line 221
    if-nez v1, :cond_c

    .line 222
    .line 223
    if-nez v5, :cond_b

    .line 224
    .line 225
    if-eqz v11, :cond_b

    .line 226
    .line 227
    if-eqz v4, :cond_c

    .line 228
    .line 229
    :cond_b
    if-nez v2, :cond_c

    .line 230
    .line 231
    move v5, v8

    .line 232
    goto :goto_9

    .line 233
    :cond_c
    move v5, v9

    .line 234
    :goto_9
    const/4 v12, 0x7

    .line 235
    invoke-virtual {v6, v12, v5}, La/hy90;->a(IZ)V

    .line 236
    .line 237
    .line 238
    if-eqz v10, :cond_d

    .line 239
    .line 240
    if-nez v2, :cond_d

    .line 241
    .line 242
    move v5, v8

    .line 243
    goto :goto_a

    .line 244
    :cond_d
    move v5, v9

    .line 245
    :goto_a
    const/16 v12, 0x8

    .line 246
    .line 247
    invoke-virtual {v6, v12, v5}, La/hy90;->a(IZ)V

    .line 248
    .line 249
    .line 250
    if-nez v1, :cond_f

    .line 251
    .line 252
    if-nez v10, :cond_e

    .line 253
    .line 254
    if-eqz v11, :cond_f

    .line 255
    .line 256
    if-eqz v3, :cond_f

    .line 257
    .line 258
    :cond_e
    if-nez v2, :cond_f

    .line 259
    .line 260
    move v1, v8

    .line 261
    goto :goto_b

    .line 262
    :cond_f
    move v1, v9

    .line 263
    :goto_b
    const/16 v3, 0x9

    .line 264
    .line 265
    invoke-virtual {v6, v3, v1}, La/hy90;->a(IZ)V

    .line 266
    .line 267
    .line 268
    const/16 v1, 0xa

    .line 269
    .line 270
    invoke-virtual {v6, v1, v7}, La/hy90;->a(IZ)V

    .line 271
    .line 272
    .line 273
    if-eqz v4, :cond_10

    .line 274
    .line 275
    if-nez v2, :cond_10

    .line 276
    .line 277
    move v1, v8

    .line 278
    goto :goto_c

    .line 279
    :cond_10
    move v1, v9

    .line 280
    :goto_c
    const/16 v3, 0xb

    .line 281
    .line 282
    invoke-virtual {v6, v3, v1}, La/hy90;->a(IZ)V

    .line 283
    .line 284
    .line 285
    if-eqz v4, :cond_11

    .line 286
    .line 287
    if-nez v2, :cond_11

    .line 288
    .line 289
    goto :goto_d

    .line 290
    :cond_11
    move v8, v9

    .line 291
    :goto_d
    const/16 v1, 0xc

    .line 292
    .line 293
    invoke-virtual {v6, v1, v8}, La/hy90;->a(IZ)V

    .line 294
    .line 295
    .line 296
    new-instance v1, La/iy90;

    .line 297
    .line 298
    invoke-virtual {v14}, La/s88;->e()La/jjq;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-direct {v1, v2}, La/iy90;-><init>(La/jjq;)V

    .line 303
    .line 304
    .line 305
    iput-object v1, p0, La/ulo;->Q:La/iy90;

    .line 306
    .line 307
    invoke-virtual {v1, v0}, La/iy90;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-nez v0, :cond_12

    .line 312
    .line 313
    new-instance v0, La/klo;

    .line 314
    .line 315
    invoke-direct {v0, p0}, La/klo;-><init>(La/ulo;)V

    .line 316
    .line 317
    .line 318
    iget-object p0, p0, La/ulo;->m:La/vg00;

    .line 319
    .line 320
    const/16 v1, 0xd

    .line 321
    .line 322
    invoke-virtual {p0, v1, v0}, La/vg00;->c(ILa/sg00;)V

    .line 323
    .line 324
    .line 325
    :cond_12
    return-void
.end method

.method public final Z(IZ)V
    .locals 13

    .line 1
    iget-boolean v0, p0, La/ulo;->M:Z

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 10
    .line 11
    iget v0, v0, La/yx90;->n:I

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object v3, p0, La/ulo;->n0:La/yx90;

    .line 21
    .line 22
    iget-boolean v4, v3, La/yx90;->l:Z

    .line 23
    .line 24
    if-ne v4, p2, :cond_2

    .line 25
    .line 26
    iget v4, v3, La/yx90;->n:I

    .line 27
    .line 28
    if-ne v4, v0, :cond_2

    .line 29
    .line 30
    iget v4, v3, La/yx90;->m:I

    .line 31
    .line 32
    if-ne v4, p1, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iget v4, p0, La/ulo;->J:I

    .line 36
    .line 37
    add-int/2addr v4, v2

    .line 38
    iput v4, p0, La/ulo;->J:I

    .line 39
    .line 40
    iget-boolean v4, v3, La/yx90;->p:Z

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    invoke-virtual {v3}, La/yx90;->a()La/yx90;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_3
    invoke-virtual {v3, p1, v0, p2}, La/yx90;->e(IIZ)La/yx90;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    shl-int/2addr v0, v1

    .line 53
    or-int/2addr p1, v0

    .line 54
    iget-object v0, p0, La/ulo;->l:La/dmo;

    .line 55
    .line 56
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 57
    .line 58
    invoke-virtual {v0, v2, p2, p1}, La/q9o0;->b(III)La/p9o0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, La/p9o0;->b()V

    .line 63
    .line 64
    .line 65
    const/4 v11, -0x1

    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x5

    .line 70
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    move-object v4, p0

    .line 76
    invoke-virtual/range {v4 .. v12}, La/ulo;->a0(La/yx90;IZIJIZ)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final a(La/ky90;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ulo;->m:La/vg00;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/vg00;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final a0(La/yx90;IZIJIZ)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, La/ulo;->n0:La/yx90;

    .line 8
    .line 9
    iput-object v1, v0, La/ulo;->n0:La/yx90;

    .line 10
    .line 11
    iget-object v4, v1, La/yx90;->a:La/bmq0;

    .line 12
    .line 13
    invoke-virtual {v4}, La/bmq0;->p()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/4 v5, -0x1

    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    iget-object v4, v1, La/yx90;->a:La/bmq0;

    .line 21
    .line 22
    iget-object v8, v1, La/yx90;->b:La/vn30;

    .line 23
    .line 24
    iget-object v8, v8, La/vn30;->a:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v4, v8}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eq v4, v5, :cond_0

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v4, 0x0

    .line 35
    :goto_0
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 36
    .line 37
    iget-object v9, v1, La/yx90;->b:La/vn30;

    .line 38
    .line 39
    iget-object v9, v9, La/vn30;->a:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v10, v1, La/yx90;->a:La/bmq0;

    .line 42
    .line 43
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    iget-object v11, v1, La/yx90;->a:La/bmq0;

    .line 52
    .line 53
    invoke-virtual {v11}, La/bmq0;->o()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    filled-new-array {v9, v10, v11}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    const-string v10, "periodUid %s not found in timeline %s with size %d"

    .line 66
    .line 67
    invoke-static {v8, v10, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-static {v8, v4}, La/x0x;->J(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    :cond_1
    iget-object v4, v3, La/yx90;->a:La/bmq0;

    .line 75
    .line 76
    iget-object v8, v1, La/yx90;->a:La/bmq0;

    .line 77
    .line 78
    invoke-virtual {v4, v8}, La/bmq0;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    iget-object v8, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 83
    .line 84
    iget-object v9, v0, La/ulo;->o:La/amq0;

    .line 85
    .line 86
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    iget-object v11, v3, La/yx90;->a:La/bmq0;

    .line 91
    .line 92
    iget-object v12, v3, La/yx90;->b:La/vn30;

    .line 93
    .line 94
    iget-object v13, v1, La/yx90;->a:La/bmq0;

    .line 95
    .line 96
    iget-object v14, v1, La/yx90;->b:La/vn30;

    .line 97
    .line 98
    invoke-virtual {v13}, La/bmq0;->p()Z

    .line 99
    .line 100
    .line 101
    move-result v15

    .line 102
    const/16 v16, 0x3

    .line 103
    .line 104
    const/16 v17, 0x0

    .line 105
    .line 106
    const/16 v18, 0x2

    .line 107
    .line 108
    const-wide/16 v5, 0x0

    .line 109
    .line 110
    if-eqz v15, :cond_2

    .line 111
    .line 112
    invoke-virtual {v11}, La/bmq0;->p()Z

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    if-eqz v15, :cond_2

    .line 117
    .line 118
    new-instance v8, Landroid/util/Pair;

    .line 119
    .line 120
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-direct {v8, v9, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_2

    .line 126
    .line 127
    :cond_2
    invoke-virtual {v13}, La/bmq0;->p()Z

    .line 128
    .line 129
    .line 130
    move-result v15

    .line 131
    invoke-virtual {v11}, La/bmq0;->p()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eq v15, v7, :cond_3

    .line 136
    .line 137
    new-instance v8, Landroid/util/Pair;

    .line 138
    .line 139
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-direct {v8, v7, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    :cond_3
    iget-object v7, v12, La/vn30;->a:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v11, v7, v9}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    iget v7, v7, La/amq0;->c:I

    .line 157
    .line 158
    invoke-virtual {v11, v7, v8, v5, v6}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    iget-object v7, v7, Landroidx/media3/common/Timeline$Window;->a:Ljava/lang/Object;

    .line 163
    .line 164
    iget-object v11, v14, La/vn30;->a:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-virtual {v13, v11, v9}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    iget v9, v9, La/amq0;->c:I

    .line 171
    .line 172
    invoke-virtual {v13, v9, v8, v5, v6}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    iget-object v8, v8, Landroidx/media3/common/Timeline$Window;->a:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-nez v7, :cond_7

    .line 183
    .line 184
    if-eqz p3, :cond_4

    .line 185
    .line 186
    if-nez v2, :cond_4

    .line 187
    .line 188
    const/4 v7, 0x1

    .line 189
    goto :goto_1

    .line 190
    :cond_4
    if-eqz p3, :cond_5

    .line 191
    .line 192
    const/4 v7, 0x1

    .line 193
    if-ne v2, v7, :cond_5

    .line 194
    .line 195
    move/from16 v7, v18

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_5
    if-nez v4, :cond_6

    .line 199
    .line 200
    move/from16 v7, v16

    .line 201
    .line 202
    :goto_1
    new-instance v8, Landroid/util/Pair;

    .line 203
    .line 204
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-direct {v8, v9, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_6
    invoke-static {}, La/v4i0;->e()V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_7
    if-eqz p3, :cond_8

    .line 219
    .line 220
    if-nez v2, :cond_8

    .line 221
    .line 222
    iget-wide v7, v12, La/vn30;->d:J

    .line 223
    .line 224
    iget-wide v11, v14, La/vn30;->d:J

    .line 225
    .line 226
    cmp-long v7, v7, v11

    .line 227
    .line 228
    if-gez v7, :cond_8

    .line 229
    .line 230
    new-instance v8, Landroid/util/Pair;

    .line 231
    .line 232
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-direct {v8, v7, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_8
    if-eqz p3, :cond_9

    .line 243
    .line 244
    const/4 v7, 0x1

    .line 245
    if-ne v2, v7, :cond_9

    .line 246
    .line 247
    if-eqz p8, :cond_9

    .line 248
    .line 249
    new-instance v8, Landroid/util/Pair;

    .line 250
    .line 251
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    invoke-direct {v8, v7, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_9
    new-instance v8, Landroid/util/Pair;

    .line 262
    .line 263
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-direct {v8, v7, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :goto_2
    iget-object v7, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v7, Ljava/lang/Boolean;

    .line 271
    .line 272
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v8, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    if-eqz v7, :cond_b

    .line 285
    .line 286
    iget-object v10, v1, La/yx90;->a:La/bmq0;

    .line 287
    .line 288
    invoke-virtual {v10}, La/bmq0;->p()Z

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    if-nez v10, :cond_a

    .line 293
    .line 294
    iget-object v10, v1, La/yx90;->a:La/bmq0;

    .line 295
    .line 296
    iget-object v11, v1, La/yx90;->b:La/vn30;

    .line 297
    .line 298
    iget-object v11, v11, La/vn30;->a:Ljava/lang/Object;

    .line 299
    .line 300
    iget-object v12, v0, La/ulo;->o:La/amq0;

    .line 301
    .line 302
    invoke-virtual {v10, v11, v12}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    iget v10, v10, La/amq0;->c:I

    .line 307
    .line 308
    iget-object v11, v1, La/yx90;->a:La/bmq0;

    .line 309
    .line 310
    iget-object v12, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 311
    .line 312
    invoke-virtual {v11, v10, v12, v5, v6}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    iget-object v10, v10, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 317
    .line 318
    goto :goto_3

    .line 319
    :cond_a
    const/4 v10, 0x0

    .line 320
    :goto_3
    sget-object v11, La/jn30;->C:La/jn30;

    .line 321
    .line 322
    iput-object v11, v0, La/ulo;->m0:La/jn30;

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_b
    const/4 v10, 0x0

    .line 326
    :goto_4
    if-nez v7, :cond_c

    .line 327
    .line 328
    iget-object v11, v3, La/yx90;->j:Ljava/util/List;

    .line 329
    .line 330
    iget-object v12, v1, La/yx90;->j:Ljava/util/List;

    .line 331
    .line 332
    invoke-interface {v11, v12}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    if-nez v11, :cond_f

    .line 337
    .line 338
    :cond_c
    iget-object v11, v0, La/ulo;->m0:La/jn30;

    .line 339
    .line 340
    invoke-virtual {v11}, La/jn30;->a()La/hbi;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    iget-object v12, v1, La/yx90;->j:Ljava/util/List;

    .line 345
    .line 346
    move/from16 v13, v17

    .line 347
    .line 348
    :goto_5
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 349
    .line 350
    .line 351
    move-result v14

    .line 352
    if-ge v13, v14, :cond_e

    .line 353
    .line 354
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v14

    .line 358
    check-cast v14, La/ed40;

    .line 359
    .line 360
    move/from16 v15, v17

    .line 361
    .line 362
    :goto_6
    iget-object v9, v14, La/ed40;->a:[La/cd40;

    .line 363
    .line 364
    array-length v5, v9

    .line 365
    if-ge v15, v5, :cond_d

    .line 366
    .line 367
    aget-object v5, v9, v15

    .line 368
    .line 369
    invoke-interface {v5, v11}, La/cd40;->b(La/hbi;)V

    .line 370
    .line 371
    .line 372
    add-int/lit8 v15, v15, 0x1

    .line 373
    .line 374
    const-wide/16 v5, 0x0

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_d
    add-int/lit8 v13, v13, 0x1

    .line 378
    .line 379
    const-wide/16 v5, 0x0

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_e
    new-instance v5, La/jn30;

    .line 383
    .line 384
    invoke-direct {v5, v11}, La/jn30;-><init>(La/hbi;)V

    .line 385
    .line 386
    .line 387
    iput-object v5, v0, La/ulo;->m0:La/jn30;

    .line 388
    .line 389
    :cond_f
    invoke-virtual {v0}, La/ulo;->b()La/jn30;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    iget-object v6, v0, La/ulo;->R:La/jn30;

    .line 394
    .line 395
    invoke-virtual {v5, v6}, La/jn30;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    iput-object v5, v0, La/ulo;->R:La/jn30;

    .line 400
    .line 401
    iget-boolean v5, v3, La/yx90;->l:Z

    .line 402
    .line 403
    iget-boolean v9, v1, La/yx90;->l:Z

    .line 404
    .line 405
    if-eq v5, v9, :cond_10

    .line 406
    .line 407
    const/4 v5, 0x1

    .line 408
    goto :goto_7

    .line 409
    :cond_10
    move/from16 v5, v17

    .line 410
    .line 411
    :goto_7
    iget v9, v3, La/yx90;->e:I

    .line 412
    .line 413
    iget v11, v1, La/yx90;->e:I

    .line 414
    .line 415
    if-eq v9, v11, :cond_11

    .line 416
    .line 417
    const/4 v9, 0x1

    .line 418
    goto :goto_8

    .line 419
    :cond_11
    move/from16 v9, v17

    .line 420
    .line 421
    :goto_8
    if-nez v9, :cond_12

    .line 422
    .line 423
    if-eqz v5, :cond_13

    .line 424
    .line 425
    :cond_12
    invoke-virtual {v0}, La/ulo;->b0()V

    .line 426
    .line 427
    .line 428
    :cond_13
    iget-boolean v11, v3, La/yx90;->g:Z

    .line 429
    .line 430
    iget-boolean v12, v1, La/yx90;->g:Z

    .line 431
    .line 432
    if-eq v11, v12, :cond_14

    .line 433
    .line 434
    const/4 v11, 0x1

    .line 435
    goto :goto_9

    .line 436
    :cond_14
    move/from16 v11, v17

    .line 437
    .line 438
    :goto_9
    if-nez v4, :cond_15

    .line 439
    .line 440
    iget-object v4, v0, La/ulo;->m:La/vg00;

    .line 441
    .line 442
    new-instance v12, La/glo;

    .line 443
    .line 444
    move/from16 v13, p2

    .line 445
    .line 446
    invoke-direct {v12, v1, v13}, La/glo;-><init>(La/yx90;I)V

    .line 447
    .line 448
    .line 449
    move/from16 v13, v17

    .line 450
    .line 451
    invoke-virtual {v4, v13, v12}, La/vg00;->c(ILa/sg00;)V

    .line 452
    .line 453
    .line 454
    :cond_15
    if-eqz p3, :cond_1d

    .line 455
    .line 456
    new-instance v4, La/amq0;

    .line 457
    .line 458
    invoke-direct {v4}, La/amq0;-><init>()V

    .line 459
    .line 460
    .line 461
    iget-object v12, v3, La/yx90;->a:La/bmq0;

    .line 462
    .line 463
    invoke-virtual {v12}, La/bmq0;->p()Z

    .line 464
    .line 465
    .line 466
    move-result v12

    .line 467
    if-nez v12, :cond_16

    .line 468
    .line 469
    iget-object v12, v3, La/yx90;->b:La/vn30;

    .line 470
    .line 471
    iget-object v12, v12, La/vn30;->a:Ljava/lang/Object;

    .line 472
    .line 473
    iget-object v13, v3, La/yx90;->a:La/bmq0;

    .line 474
    .line 475
    invoke-virtual {v13, v12, v4}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 476
    .line 477
    .line 478
    iget v13, v4, La/amq0;->c:I

    .line 479
    .line 480
    iget-object v14, v3, La/yx90;->a:La/bmq0;

    .line 481
    .line 482
    invoke-virtual {v14, v12}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 483
    .line 484
    .line 485
    move-result v14

    .line 486
    iget-object v15, v3, La/yx90;->a:La/bmq0;

    .line 487
    .line 488
    move/from16 v19, v5

    .line 489
    .line 490
    iget-object v5, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 491
    .line 492
    move/from16 v21, v6

    .line 493
    .line 494
    move/from16 v20, v7

    .line 495
    .line 496
    const-wide/16 v6, 0x0

    .line 497
    .line 498
    invoke-virtual {v15, v13, v5, v6, v7}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    iget-object v5, v5, Landroidx/media3/common/Timeline$Window;->a:Ljava/lang/Object;

    .line 503
    .line 504
    iget-object v6, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 505
    .line 506
    iget-object v6, v6, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 507
    .line 508
    move-object/from16 v23, v5

    .line 509
    .line 510
    move-object/from16 v25, v6

    .line 511
    .line 512
    move-object/from16 v26, v12

    .line 513
    .line 514
    move/from16 v24, v13

    .line 515
    .line 516
    move/from16 v27, v14

    .line 517
    .line 518
    goto :goto_a

    .line 519
    :cond_16
    move/from16 v19, v5

    .line 520
    .line 521
    move/from16 v21, v6

    .line 522
    .line 523
    move/from16 v20, v7

    .line 524
    .line 525
    move/from16 v24, p7

    .line 526
    .line 527
    move/from16 v27, v24

    .line 528
    .line 529
    const/16 v23, 0x0

    .line 530
    .line 531
    const/16 v25, 0x0

    .line 532
    .line 533
    const/16 v26, 0x0

    .line 534
    .line 535
    :goto_a
    iget-object v5, v3, La/yx90;->b:La/vn30;

    .line 536
    .line 537
    if-nez v2, :cond_19

    .line 538
    .line 539
    invoke-virtual {v5}, La/vn30;->c()Z

    .line 540
    .line 541
    .line 542
    move-result v5

    .line 543
    iget-object v6, v3, La/yx90;->b:La/vn30;

    .line 544
    .line 545
    if-eqz v5, :cond_17

    .line 546
    .line 547
    iget v5, v6, La/vn30;->b:I

    .line 548
    .line 549
    iget v6, v6, La/vn30;->c:I

    .line 550
    .line 551
    invoke-virtual {v4, v5, v6}, La/amq0;->a(II)J

    .line 552
    .line 553
    .line 554
    move-result-wide v4

    .line 555
    invoke-static {v3}, La/ulo;->u(La/yx90;)J

    .line 556
    .line 557
    .line 558
    move-result-wide v6

    .line 559
    goto :goto_c

    .line 560
    :cond_17
    iget v5, v6, La/vn30;->e:I

    .line 561
    .line 562
    const/4 v6, -0x1

    .line 563
    if-eq v5, v6, :cond_18

    .line 564
    .line 565
    iget-object v4, v0, La/ulo;->n0:La/yx90;

    .line 566
    .line 567
    invoke-static {v4}, La/ulo;->u(La/yx90;)J

    .line 568
    .line 569
    .line 570
    move-result-wide v4

    .line 571
    :goto_b
    move-wide v6, v4

    .line 572
    goto :goto_c

    .line 573
    :cond_18
    iget-wide v5, v4, La/amq0;->e:J

    .line 574
    .line 575
    iget-wide v12, v4, La/amq0;->d:J

    .line 576
    .line 577
    add-long v4, v5, v12

    .line 578
    .line 579
    goto :goto_b

    .line 580
    :cond_19
    invoke-virtual {v5}, La/vn30;->c()Z

    .line 581
    .line 582
    .line 583
    move-result v5

    .line 584
    if-eqz v5, :cond_1a

    .line 585
    .line 586
    iget-wide v4, v3, La/yx90;->s:J

    .line 587
    .line 588
    invoke-static {v3}, La/ulo;->u(La/yx90;)J

    .line 589
    .line 590
    .line 591
    move-result-wide v6

    .line 592
    goto :goto_c

    .line 593
    :cond_1a
    iget-wide v4, v4, La/amq0;->e:J

    .line 594
    .line 595
    iget-wide v6, v3, La/yx90;->s:J

    .line 596
    .line 597
    add-long/2addr v4, v6

    .line 598
    goto :goto_b

    .line 599
    :goto_c
    new-instance v22, La/ly90;

    .line 600
    .line 601
    invoke-static {v4, v5}, La/vtt0;->Y(J)J

    .line 602
    .line 603
    .line 604
    move-result-wide v28

    .line 605
    invoke-static {v6, v7}, La/vtt0;->Y(J)J

    .line 606
    .line 607
    .line 608
    move-result-wide v30

    .line 609
    iget-object v4, v3, La/yx90;->b:La/vn30;

    .line 610
    .line 611
    iget v5, v4, La/vn30;->b:I

    .line 612
    .line 613
    iget v4, v4, La/vn30;->c:I

    .line 614
    .line 615
    move/from16 v33, v4

    .line 616
    .line 617
    move/from16 v32, v5

    .line 618
    .line 619
    invoke-direct/range {v22 .. v33}, La/ly90;-><init>(Ljava/lang/Object;ILandroidx/media3/common/MediaItem;Ljava/lang/Object;IJJII)V

    .line 620
    .line 621
    .line 622
    move-object/from16 v4, v22

    .line 623
    .line 624
    iget-object v5, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 625
    .line 626
    invoke-virtual {v0}, La/ulo;->j()I

    .line 627
    .line 628
    .line 629
    move-result v6

    .line 630
    invoke-virtual {v0}, La/ulo;->k()I

    .line 631
    .line 632
    .line 633
    move-result v7

    .line 634
    iget-object v12, v0, La/ulo;->n0:La/yx90;

    .line 635
    .line 636
    iget-object v12, v12, La/yx90;->a:La/bmq0;

    .line 637
    .line 638
    invoke-virtual {v12}, La/bmq0;->p()Z

    .line 639
    .line 640
    .line 641
    move-result v12

    .line 642
    if-nez v12, :cond_1b

    .line 643
    .line 644
    iget-object v7, v0, La/ulo;->n0:La/yx90;

    .line 645
    .line 646
    iget-object v12, v7, La/yx90;->b:La/vn30;

    .line 647
    .line 648
    iget-object v12, v12, La/vn30;->a:Ljava/lang/Object;

    .line 649
    .line 650
    iget-object v7, v7, La/yx90;->a:La/bmq0;

    .line 651
    .line 652
    iget-object v13, v0, La/ulo;->o:La/amq0;

    .line 653
    .line 654
    invoke-virtual {v7, v12, v13}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 655
    .line 656
    .line 657
    iget-object v7, v0, La/ulo;->n0:La/yx90;

    .line 658
    .line 659
    iget-object v7, v7, La/yx90;->a:La/bmq0;

    .line 660
    .line 661
    invoke-virtual {v7, v12}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 662
    .line 663
    .line 664
    move-result v7

    .line 665
    iget-object v13, v0, La/ulo;->n0:La/yx90;

    .line 666
    .line 667
    iget-object v13, v13, La/yx90;->a:La/bmq0;

    .line 668
    .line 669
    const-wide/16 v14, 0x0

    .line 670
    .line 671
    invoke-virtual {v13, v6, v5, v14, v15}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 672
    .line 673
    .line 674
    move-result-object v13

    .line 675
    iget-object v13, v13, Landroidx/media3/common/Timeline$Window;->a:Ljava/lang/Object;

    .line 676
    .line 677
    iget-object v5, v5, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 678
    .line 679
    move-object/from16 v25, v5

    .line 680
    .line 681
    move-object/from16 v26, v12

    .line 682
    .line 683
    move-object/from16 v23, v13

    .line 684
    .line 685
    :goto_d
    move/from16 v27, v7

    .line 686
    .line 687
    goto :goto_e

    .line 688
    :cond_1b
    const/16 v23, 0x0

    .line 689
    .line 690
    const/16 v25, 0x0

    .line 691
    .line 692
    const/16 v26, 0x0

    .line 693
    .line 694
    goto :goto_d

    .line 695
    :goto_e
    invoke-static/range {p5 .. p6}, La/vtt0;->Y(J)J

    .line 696
    .line 697
    .line 698
    move-result-wide v28

    .line 699
    new-instance v22, La/ly90;

    .line 700
    .line 701
    iget-object v5, v0, La/ulo;->n0:La/yx90;

    .line 702
    .line 703
    iget-object v5, v5, La/yx90;->b:La/vn30;

    .line 704
    .line 705
    invoke-virtual {v5}, La/vn30;->c()Z

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    if-eqz v5, :cond_1c

    .line 710
    .line 711
    iget-object v5, v0, La/ulo;->n0:La/yx90;

    .line 712
    .line 713
    invoke-static {v5}, La/ulo;->u(La/yx90;)J

    .line 714
    .line 715
    .line 716
    move-result-wide v12

    .line 717
    invoke-static {v12, v13}, La/vtt0;->Y(J)J

    .line 718
    .line 719
    .line 720
    move-result-wide v12

    .line 721
    move-wide/from16 v30, v12

    .line 722
    .line 723
    goto :goto_f

    .line 724
    :cond_1c
    move-wide/from16 v30, v28

    .line 725
    .line 726
    :goto_f
    iget-object v5, v0, La/ulo;->n0:La/yx90;

    .line 727
    .line 728
    iget-object v5, v5, La/yx90;->b:La/vn30;

    .line 729
    .line 730
    iget v7, v5, La/vn30;->b:I

    .line 731
    .line 732
    iget v5, v5, La/vn30;->c:I

    .line 733
    .line 734
    move/from16 v33, v5

    .line 735
    .line 736
    move/from16 v24, v6

    .line 737
    .line 738
    move/from16 v32, v7

    .line 739
    .line 740
    invoke-direct/range {v22 .. v33}, La/ly90;-><init>(Ljava/lang/Object;ILandroidx/media3/common/MediaItem;Ljava/lang/Object;IJJII)V

    .line 741
    .line 742
    .line 743
    move-object/from16 v5, v22

    .line 744
    .line 745
    iget-object v6, v0, La/ulo;->m:La/vg00;

    .line 746
    .line 747
    new-instance v7, La/nlo;

    .line 748
    .line 749
    invoke-direct {v7, v2, v4, v5}, La/nlo;-><init>(ILa/ly90;La/ly90;)V

    .line 750
    .line 751
    .line 752
    const/16 v2, 0xb

    .line 753
    .line 754
    invoke-virtual {v6, v2, v7}, La/vg00;->c(ILa/sg00;)V

    .line 755
    .line 756
    .line 757
    goto :goto_10

    .line 758
    :cond_1d
    move/from16 v19, v5

    .line 759
    .line 760
    move/from16 v21, v6

    .line 761
    .line 762
    move/from16 v20, v7

    .line 763
    .line 764
    :goto_10
    if-eqz v20, :cond_1e

    .line 765
    .line 766
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 767
    .line 768
    new-instance v4, La/qrm;

    .line 769
    .line 770
    invoke-direct {v4, v10, v8}, La/qrm;-><init>(Ljava/lang/Object;I)V

    .line 771
    .line 772
    .line 773
    const/4 v7, 0x1

    .line 774
    invoke-virtual {v2, v7, v4}, La/vg00;->c(ILa/sg00;)V

    .line 775
    .line 776
    .line 777
    :cond_1e
    iget-object v2, v3, La/yx90;->f:La/dlo;

    .line 778
    .line 779
    iget-object v4, v1, La/yx90;->f:La/dlo;

    .line 780
    .line 781
    const/4 v5, 0x7

    .line 782
    if-eq v2, v4, :cond_1f

    .line 783
    .line 784
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 785
    .line 786
    new-instance v4, La/hlo;

    .line 787
    .line 788
    invoke-direct {v4, v1, v5}, La/hlo;-><init>(La/yx90;B)V

    .line 789
    .line 790
    .line 791
    const/16 v6, 0xa

    .line 792
    .line 793
    invoke-virtual {v2, v6, v4}, La/vg00;->c(ILa/sg00;)V

    .line 794
    .line 795
    .line 796
    iget-object v2, v1, La/yx90;->f:La/dlo;

    .line 797
    .line 798
    if-eqz v2, :cond_1f

    .line 799
    .line 800
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 801
    .line 802
    new-instance v4, La/hlo;

    .line 803
    .line 804
    const/16 v7, 0x8

    .line 805
    .line 806
    invoke-direct {v4, v1, v7}, La/hlo;-><init>(La/yx90;B)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v2, v6, v4}, La/vg00;->c(ILa/sg00;)V

    .line 810
    .line 811
    .line 812
    :cond_1f
    iget-object v2, v3, La/yx90;->i:La/ucs0;

    .line 813
    .line 814
    iget-object v4, v1, La/yx90;->i:La/ucs0;

    .line 815
    .line 816
    if-eq v2, v4, :cond_20

    .line 817
    .line 818
    iget-object v2, v0, La/ulo;->i:La/syj;

    .line 819
    .line 820
    iget-object v4, v4, La/ucs0;->f:Ljava/lang/Object;

    .line 821
    .line 822
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    check-cast v4, La/sp20;

    .line 826
    .line 827
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 828
    .line 829
    new-instance v4, La/hlo;

    .line 830
    .line 831
    const/16 v6, 0x9

    .line 832
    .line 833
    invoke-direct {v4, v1, v6}, La/hlo;-><init>(La/yx90;B)V

    .line 834
    .line 835
    .line 836
    move/from16 v6, v18

    .line 837
    .line 838
    invoke-virtual {v2, v6, v4}, La/vg00;->c(ILa/sg00;)V

    .line 839
    .line 840
    .line 841
    :cond_20
    if-nez v21, :cond_21

    .line 842
    .line 843
    iget-object v2, v0, La/ulo;->R:La/jn30;

    .line 844
    .line 845
    iget-object v4, v0, La/ulo;->m:La/vg00;

    .line 846
    .line 847
    new-instance v6, La/z9f;

    .line 848
    .line 849
    const/16 v7, 0x12

    .line 850
    .line 851
    invoke-direct {v6, v2, v7}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 852
    .line 853
    .line 854
    const/16 v2, 0xe

    .line 855
    .line 856
    invoke-virtual {v4, v2, v6}, La/vg00;->c(ILa/sg00;)V

    .line 857
    .line 858
    .line 859
    :cond_21
    if-eqz v11, :cond_22

    .line 860
    .line 861
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 862
    .line 863
    new-instance v4, La/hlo;

    .line 864
    .line 865
    const/4 v13, 0x0

    .line 866
    invoke-direct {v4, v1, v13}, La/hlo;-><init>(La/yx90;B)V

    .line 867
    .line 868
    .line 869
    move/from16 v6, v16

    .line 870
    .line 871
    invoke-virtual {v2, v6, v4}, La/vg00;->c(ILa/sg00;)V

    .line 872
    .line 873
    .line 874
    :cond_22
    if-nez v9, :cond_23

    .line 875
    .line 876
    if-eqz v19, :cond_24

    .line 877
    .line 878
    :cond_23
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 879
    .line 880
    new-instance v4, La/hlo;

    .line 881
    .line 882
    const/4 v7, 0x1

    .line 883
    invoke-direct {v4, v1, v7}, La/hlo;-><init>(La/yx90;B)V

    .line 884
    .line 885
    .line 886
    const/4 v6, -0x1

    .line 887
    invoke-virtual {v2, v6, v4}, La/vg00;->c(ILa/sg00;)V

    .line 888
    .line 889
    .line 890
    :cond_24
    const/4 v2, 0x4

    .line 891
    if-eqz v9, :cond_25

    .line 892
    .line 893
    iget-object v4, v0, La/ulo;->m:La/vg00;

    .line 894
    .line 895
    new-instance v6, La/hlo;

    .line 896
    .line 897
    const/4 v7, 0x2

    .line 898
    invoke-direct {v6, v1, v7}, La/hlo;-><init>(La/yx90;B)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v4, v2, v6}, La/vg00;->c(ILa/sg00;)V

    .line 902
    .line 903
    .line 904
    :cond_25
    const/4 v4, 0x5

    .line 905
    if-nez v19, :cond_26

    .line 906
    .line 907
    iget v6, v3, La/yx90;->m:I

    .line 908
    .line 909
    iget v7, v1, La/yx90;->m:I

    .line 910
    .line 911
    if-eq v6, v7, :cond_27

    .line 912
    .line 913
    :cond_26
    iget-object v6, v0, La/ulo;->m:La/vg00;

    .line 914
    .line 915
    new-instance v7, La/hlo;

    .line 916
    .line 917
    const/4 v8, 0x3

    .line 918
    invoke-direct {v7, v1, v8}, La/hlo;-><init>(La/yx90;B)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v6, v4, v7}, La/vg00;->c(ILa/sg00;)V

    .line 922
    .line 923
    .line 924
    :cond_27
    iget v6, v3, La/yx90;->n:I

    .line 925
    .line 926
    iget v7, v1, La/yx90;->n:I

    .line 927
    .line 928
    const/4 v8, 0x6

    .line 929
    if-eq v6, v7, :cond_28

    .line 930
    .line 931
    iget-object v6, v0, La/ulo;->m:La/vg00;

    .line 932
    .line 933
    new-instance v7, La/hlo;

    .line 934
    .line 935
    invoke-direct {v7, v1, v2}, La/hlo;-><init>(La/yx90;B)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v6, v8, v7}, La/vg00;->c(ILa/sg00;)V

    .line 939
    .line 940
    .line 941
    :cond_28
    invoke-virtual {v3}, La/yx90;->m()Z

    .line 942
    .line 943
    .line 944
    move-result v2

    .line 945
    invoke-virtual {v1}, La/yx90;->m()Z

    .line 946
    .line 947
    .line 948
    move-result v6

    .line 949
    if-eq v2, v6, :cond_29

    .line 950
    .line 951
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 952
    .line 953
    new-instance v6, La/hlo;

    .line 954
    .line 955
    invoke-direct {v6, v1, v4}, La/hlo;-><init>(La/yx90;B)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v2, v5, v6}, La/vg00;->c(ILa/sg00;)V

    .line 959
    .line 960
    .line 961
    :cond_29
    iget-object v2, v3, La/yx90;->o:La/zx90;

    .line 962
    .line 963
    iget-object v4, v1, La/yx90;->o:La/zx90;

    .line 964
    .line 965
    invoke-virtual {v2, v4}, La/zx90;->equals(Ljava/lang/Object;)Z

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    if-nez v2, :cond_2a

    .line 970
    .line 971
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 972
    .line 973
    new-instance v4, La/hlo;

    .line 974
    .line 975
    invoke-direct {v4, v1, v8}, La/hlo;-><init>(La/yx90;B)V

    .line 976
    .line 977
    .line 978
    const/16 v5, 0xc

    .line 979
    .line 980
    invoke-virtual {v2, v5, v4}, La/vg00;->c(ILa/sg00;)V

    .line 981
    .line 982
    .line 983
    :cond_2a
    invoke-virtual {v0}, La/ulo;->Y()V

    .line 984
    .line 985
    .line 986
    iget-object v2, v0, La/ulo;->m:La/vg00;

    .line 987
    .line 988
    invoke-virtual {v2}, La/vg00;->b()V

    .line 989
    .line 990
    .line 991
    iget-boolean v2, v3, La/yx90;->p:Z

    .line 992
    .line 993
    iget-boolean v1, v1, La/yx90;->p:Z

    .line 994
    .line 995
    if-eq v2, v1, :cond_2b

    .line 996
    .line 997
    iget-object v0, v0, La/ulo;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 998
    .line 999
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v1

    .line 1007
    if-eqz v1, :cond_2b

    .line 1008
    .line 1009
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    check-cast v1, La/qlo;

    .line 1014
    .line 1015
    iget-object v1, v1, La/qlo;->a:La/ulo;

    .line 1016
    .line 1017
    invoke-virtual {v1}, La/ulo;->b0()V

    .line 1018
    .line 1019
    .line 1020
    goto :goto_11

    .line 1021
    :cond_2b
    return-void
.end method

.method public final b()La/jn30;
    .locals 5

    .line 1
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/ulo;->m0:La/jn30;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, La/ulo;->j()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, v3, v4}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 27
    .line 28
    iget-object p0, p0, La/ulo;->m0:La/jn30;

    .line 29
    .line 30
    invoke-virtual {p0}, La/jn30;->a()La/hbi;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object v0, v0, Landroidx/media3/common/MediaItem;->d:La/jn30;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :cond_1
    iget-object v1, v0, La/jn30;->B:La/b4x;

    .line 41
    .line 42
    iget-object v2, v0, La/jn30;->f:[B

    .line 43
    .line 44
    iget-object v3, v0, La/jn30;->a:Ljava/lang/CharSequence;

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    iput-object v3, p0, La/hbi;->b:Ljava/lang/Object;

    .line 49
    .line 50
    :cond_2
    iget-object v3, v0, La/jn30;->b:Ljava/lang/CharSequence;

    .line 51
    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    iput-object v3, p0, La/hbi;->c:Ljava/lang/Object;

    .line 55
    .line 56
    :cond_3
    iget-object v3, v0, La/jn30;->c:Ljava/lang/CharSequence;

    .line 57
    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    iput-object v3, p0, La/hbi;->d:Ljava/lang/Object;

    .line 61
    .line 62
    :cond_4
    iget-object v3, v0, La/jn30;->d:Ljava/lang/CharSequence;

    .line 63
    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    iput-object v3, p0, La/hbi;->a:Ljava/lang/Object;

    .line 67
    .line 68
    :cond_5
    iget-object v3, v0, La/jn30;->e:Ljava/lang/CharSequence;

    .line 69
    .line 70
    if-eqz v3, :cond_6

    .line 71
    .line 72
    iput-object v3, p0, La/hbi;->e:Ljava/lang/Object;

    .line 73
    .line 74
    :cond_6
    if-eqz v2, :cond_8

    .line 75
    .line 76
    iget-object v3, v0, La/jn30;->g:Ljava/lang/Integer;

    .line 77
    .line 78
    if-nez v2, :cond_7

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    goto :goto_0

    .line 82
    :cond_7
    invoke-virtual {v2}, [B->clone()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, [B

    .line 87
    .line 88
    :goto_0
    iput-object v2, p0, La/hbi;->f:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v3, p0, La/hbi;->g:Ljava/lang/Object;

    .line 91
    .line 92
    sget-object v2, La/jn30;->C:La/jn30;

    .line 93
    .line 94
    :cond_8
    iget-object v2, v0, La/jn30;->h:Ljava/lang/Integer;

    .line 95
    .line 96
    if-eqz v2, :cond_9

    .line 97
    .line 98
    iput-object v2, p0, La/hbi;->h:Ljava/lang/Object;

    .line 99
    .line 100
    :cond_9
    iget-object v2, v0, La/jn30;->i:Ljava/lang/Integer;

    .line 101
    .line 102
    if-eqz v2, :cond_a

    .line 103
    .line 104
    iput-object v2, p0, La/hbi;->i:Ljava/lang/Object;

    .line 105
    .line 106
    :cond_a
    iget-object v2, v0, La/jn30;->j:Ljava/lang/Integer;

    .line 107
    .line 108
    if-eqz v2, :cond_b

    .line 109
    .line 110
    iput-object v2, p0, La/hbi;->j:Ljava/lang/Object;

    .line 111
    .line 112
    :cond_b
    iget-object v2, v0, La/jn30;->k:Ljava/lang/Boolean;

    .line 113
    .line 114
    if-eqz v2, :cond_c

    .line 115
    .line 116
    iput-object v2, p0, La/hbi;->k:Ljava/lang/Object;

    .line 117
    .line 118
    :cond_c
    iget-object v2, v0, La/jn30;->l:Ljava/lang/Integer;

    .line 119
    .line 120
    if-eqz v2, :cond_d

    .line 121
    .line 122
    iput-object v2, p0, La/hbi;->l:Ljava/lang/Object;

    .line 123
    .line 124
    :cond_d
    iget-object v2, v0, La/jn30;->m:Ljava/lang/Integer;

    .line 125
    .line 126
    if-eqz v2, :cond_e

    .line 127
    .line 128
    iput-object v2, p0, La/hbi;->l:Ljava/lang/Object;

    .line 129
    .line 130
    :cond_e
    iget-object v2, v0, La/jn30;->n:Ljava/lang/Integer;

    .line 131
    .line 132
    if-eqz v2, :cond_f

    .line 133
    .line 134
    iput-object v2, p0, La/hbi;->m:Ljava/lang/Object;

    .line 135
    .line 136
    :cond_f
    iget-object v2, v0, La/jn30;->o:Ljava/lang/Integer;

    .line 137
    .line 138
    if-eqz v2, :cond_10

    .line 139
    .line 140
    iput-object v2, p0, La/hbi;->n:Ljava/lang/Object;

    .line 141
    .line 142
    :cond_10
    iget-object v2, v0, La/jn30;->p:Ljava/lang/Integer;

    .line 143
    .line 144
    if-eqz v2, :cond_11

    .line 145
    .line 146
    iput-object v2, p0, La/hbi;->o:Ljava/lang/Object;

    .line 147
    .line 148
    :cond_11
    iget-object v2, v0, La/jn30;->q:Ljava/lang/Integer;

    .line 149
    .line 150
    if-eqz v2, :cond_12

    .line 151
    .line 152
    iput-object v2, p0, La/hbi;->p:Ljava/lang/Object;

    .line 153
    .line 154
    :cond_12
    iget-object v2, v0, La/jn30;->r:Ljava/lang/Integer;

    .line 155
    .line 156
    if-eqz v2, :cond_13

    .line 157
    .line 158
    iput-object v2, p0, La/hbi;->q:Ljava/lang/Object;

    .line 159
    .line 160
    :cond_13
    iget-object v2, v0, La/jn30;->s:Ljava/lang/CharSequence;

    .line 161
    .line 162
    if-eqz v2, :cond_14

    .line 163
    .line 164
    iput-object v2, p0, La/hbi;->r:Ljava/lang/Object;

    .line 165
    .line 166
    :cond_14
    iget-object v2, v0, La/jn30;->t:Ljava/lang/CharSequence;

    .line 167
    .line 168
    if-eqz v2, :cond_15

    .line 169
    .line 170
    iput-object v2, p0, La/hbi;->s:Ljava/lang/Object;

    .line 171
    .line 172
    :cond_15
    iget-object v2, v0, La/jn30;->u:Ljava/lang/CharSequence;

    .line 173
    .line 174
    if-eqz v2, :cond_16

    .line 175
    .line 176
    iput-object v2, p0, La/hbi;->t:Ljava/lang/Object;

    .line 177
    .line 178
    :cond_16
    iget-object v2, v0, La/jn30;->v:Ljava/lang/CharSequence;

    .line 179
    .line 180
    if-eqz v2, :cond_17

    .line 181
    .line 182
    iput-object v2, p0, La/hbi;->u:Ljava/lang/Object;

    .line 183
    .line 184
    :cond_17
    iget-object v2, v0, La/jn30;->w:Ljava/lang/Integer;

    .line 185
    .line 186
    if-eqz v2, :cond_18

    .line 187
    .line 188
    iput-object v2, p0, La/hbi;->v:Ljava/lang/Object;

    .line 189
    .line 190
    :cond_18
    iget-object v2, v0, La/jn30;->x:Ljava/lang/Integer;

    .line 191
    .line 192
    if-eqz v2, :cond_19

    .line 193
    .line 194
    iput-object v2, p0, La/hbi;->w:Ljava/lang/Object;

    .line 195
    .line 196
    :cond_19
    iget-object v2, v0, La/jn30;->y:Ljava/lang/CharSequence;

    .line 197
    .line 198
    if-eqz v2, :cond_1a

    .line 199
    .line 200
    iput-object v2, p0, La/hbi;->x:Ljava/lang/Object;

    .line 201
    .line 202
    :cond_1a
    iget-object v2, v0, La/jn30;->z:Ljava/lang/CharSequence;

    .line 203
    .line 204
    if-eqz v2, :cond_1b

    .line 205
    .line 206
    iput-object v2, p0, La/hbi;->y:Ljava/lang/Object;

    .line 207
    .line 208
    :cond_1b
    iget-object v0, v0, La/jn30;->A:Ljava/lang/Integer;

    .line 209
    .line 210
    if-eqz v0, :cond_1c

    .line 211
    .line 212
    iput-object v0, p0, La/hbi;->z:Ljava/lang/Object;

    .line 213
    .line 214
    :cond_1c
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_1d

    .line 219
    .line 220
    invoke-static {v1}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iput-object v0, p0, La/hbi;->A:Ljava/lang/Object;

    .line 225
    .line 226
    :cond_1d
    :goto_1
    new-instance v0, La/jn30;

    .line 227
    .line 228
    invoke-direct {v0, p0}, La/jn30;-><init>(La/hbi;)V

    .line 229
    .line 230
    .line 231
    return-object v0
.end method

.method public final b0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/ulo;->s()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/ulo;->A:La/nqd;

    .line 6
    .line 7
    iget-object v2, p0, La/ulo;->z:La/m9c;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq v0, v4, :cond_3

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    if-eq v0, v5, :cond_1

    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    if-eq v0, v5, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x4

    .line 20
    if-ne v0, p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {}, La/v4i0;->e()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 31
    .line 32
    iget-boolean v0, v0, La/yx90;->p:Z

    .line 33
    .line 34
    invoke-virtual {p0}, La/ulo;->r()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    move v3, v4

    .line 43
    :cond_2
    invoke-virtual {v2, v3}, La/m9c;->f(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, La/ulo;->r()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-virtual {v1, p0}, La/nqd;->f(Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    :goto_0
    invoke-virtual {v2, v3}, La/m9c;->f(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, La/nqd;->f(Z)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final c()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/ulo;->c0()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, La/ulo;->p:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const v3, 0x7fffffff

    .line 13
    .line 14
    .line 15
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-lez v2, :cond_d

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    iget-object v2, v0, La/ulo;->n0:La/yx90;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, La/ulo;->p(La/yx90;)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    invoke-virtual {v0, v2}, La/ulo;->g(La/yx90;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    iget-object v13, v2, La/yx90;->a:La/bmq0;

    .line 36
    .line 37
    iget v6, v0, La/ulo;->J:I

    .line 38
    .line 39
    const/4 v15, 0x1

    .line 40
    add-int/2addr v6, v15

    .line 41
    iput v6, v0, La/ulo;->J:I

    .line 42
    .line 43
    add-int/lit8 v6, v3, -0x1

    .line 44
    .line 45
    :goto_0
    if-ltz v6, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v6, v6, -0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v6, v0, La/ulo;->P:La/itj0;

    .line 54
    .line 55
    iget-object v8, v6, La/itj0;->b:[I

    .line 56
    .line 57
    array-length v9, v8

    .line 58
    sub-int/2addr v9, v3

    .line 59
    new-array v9, v9, [I

    .line 60
    .line 61
    const/4 v10, 0x0

    .line 62
    move v11, v10

    .line 63
    move v12, v11

    .line 64
    :goto_1
    array-length v14, v8

    .line 65
    if-ge v11, v14, :cond_4

    .line 66
    .line 67
    aget v14, v8, v11

    .line 68
    .line 69
    if-ltz v14, :cond_2

    .line 70
    .line 71
    if-ge v14, v3, :cond_2

    .line 72
    .line 73
    add-int/lit8 v12, v12, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    sub-int v16, v11, v12

    .line 77
    .line 78
    if-ltz v14, :cond_3

    .line 79
    .line 80
    sub-int/2addr v14, v3

    .line 81
    :cond_3
    aput v14, v9, v16

    .line 82
    .line 83
    :goto_2
    add-int/lit8 v11, v11, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    new-instance v8, La/itj0;

    .line 87
    .line 88
    new-instance v11, Ljava/util/Random;

    .line 89
    .line 90
    iget-object v6, v6, La/itj0;->a:Ljava/util/Random;

    .line 91
    .line 92
    move-wide/from16 v16, v4

    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/util/Random;->nextLong()J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    invoke-direct {v11, v4, v5}, Ljava/util/Random;-><init>(J)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v8, v9, v11}, La/itj0;-><init>([ILjava/util/Random;)V

    .line 102
    .line 103
    .line 104
    iput-object v8, v0, La/ulo;->P:La/itj0;

    .line 105
    .line 106
    new-instance v14, La/wna0;

    .line 107
    .line 108
    iget-object v4, v0, La/ulo;->P:La/itj0;

    .line 109
    .line 110
    invoke-direct {v14, v1, v4}, La/wna0;-><init>(Ljava/util/ArrayList;La/itj0;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v13}, La/bmq0;->p()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    const/4 v11, -0x1

    .line 118
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    if-nez v1, :cond_5

    .line 124
    .line 125
    invoke-virtual {v14}, La/bmq0;->p()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    :cond_5
    move-wide v5, v4

    .line 132
    move v1, v10

    .line 133
    move v4, v11

    .line 134
    goto :goto_3

    .line 135
    :cond_6
    iget-object v6, v0, La/ulo;->o:La/amq0;

    .line 136
    .line 137
    invoke-static/range {v16 .. v17}, La/vtt0;->M(J)J

    .line 138
    .line 139
    .line 140
    move-result-wide v8

    .line 141
    move-wide/from16 v16, v4

    .line 142
    .line 143
    iget-object v5, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 144
    .line 145
    move-object v4, v13

    .line 146
    invoke-virtual/range {v4 .. v9}, La/bmq0;->i(Landroidx/media3/common/Timeline$Window;La/amq0;IJ)Landroid/util/Pair;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iget-object v12, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v14, v12}, La/wna0;->b(Ljava/lang/Object;)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eq v4, v11, :cond_7

    .line 157
    .line 158
    move-object v5, v1

    .line 159
    move v1, v10

    .line 160
    move v4, v11

    .line 161
    goto :goto_7

    .line 162
    :cond_7
    move v1, v10

    .line 163
    iget v10, v0, La/ulo;->H:I

    .line 164
    .line 165
    move v4, v11

    .line 166
    iget-boolean v11, v0, La/ulo;->I:Z

    .line 167
    .line 168
    iget-object v8, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 169
    .line 170
    iget-object v9, v0, La/ulo;->o:La/amq0;

    .line 171
    .line 172
    move-wide/from16 v5, v16

    .line 173
    .line 174
    invoke-static/range {v8 .. v14}, La/dmo;->T(Landroidx/media3/common/Timeline$Window;La/amq0;IZLjava/lang/Object;La/bmq0;La/bmq0;)I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eq v8, v4, :cond_8

    .line 179
    .line 180
    const-wide/16 v5, 0x0

    .line 181
    .line 182
    iget-object v9, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 183
    .line 184
    invoke-virtual {v14, v8, v9, v5, v6}, La/wna0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 185
    .line 186
    .line 187
    iget-wide v5, v9, Landroidx/media3/common/Timeline$Window;->k:J

    .line 188
    .line 189
    invoke-static {v5, v6}, La/vtt0;->Y(J)J

    .line 190
    .line 191
    .line 192
    move-result-wide v5

    .line 193
    invoke-virtual {v0, v14, v8, v5, v6}, La/ulo;->C(La/bmq0;IJ)Landroid/util/Pair;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    goto :goto_7

    .line 198
    :cond_8
    invoke-virtual {v0, v14, v4, v5, v6}, La/ulo;->C(La/bmq0;IJ)Landroid/util/Pair;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    goto :goto_7

    .line 203
    :goto_3
    invoke-virtual {v13}, La/bmq0;->p()Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-nez v8, :cond_9

    .line 208
    .line 209
    invoke-virtual {v14}, La/bmq0;->p()Z

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    if-eqz v8, :cond_9

    .line 214
    .line 215
    move v10, v15

    .line 216
    goto :goto_4

    .line 217
    :cond_9
    move v10, v1

    .line 218
    :goto_4
    if-eqz v10, :cond_a

    .line 219
    .line 220
    move v8, v4

    .line 221
    goto :goto_5

    .line 222
    :cond_a
    move v8, v7

    .line 223
    :goto_5
    if-eqz v10, :cond_b

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_b
    move-wide/from16 v5, v16

    .line 227
    .line 228
    :goto_6
    invoke-virtual {v0, v14, v8, v5, v6}, La/ulo;->C(La/bmq0;IJ)Landroid/util/Pair;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    :goto_7
    invoke-virtual {v0, v2, v14, v5}, La/ulo;->B(La/yx90;La/bmq0;Landroid/util/Pair;)La/yx90;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    iget v6, v5, La/yx90;->e:I

    .line 237
    .line 238
    if-eq v6, v15, :cond_c

    .line 239
    .line 240
    const/4 v8, 0x4

    .line 241
    if-eq v6, v8, :cond_c

    .line 242
    .line 243
    if-ltz v7, :cond_c

    .line 244
    .line 245
    if-ge v7, v3, :cond_c

    .line 246
    .line 247
    iget-object v2, v2, La/yx90;->b:La/vn30;

    .line 248
    .line 249
    iget-object v12, v2, La/vn30;->a:Ljava/lang/Object;

    .line 250
    .line 251
    iget v10, v0, La/ulo;->H:I

    .line 252
    .line 253
    iget-boolean v11, v0, La/ulo;->I:Z

    .line 254
    .line 255
    move v2, v8

    .line 256
    iget-object v8, v0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 257
    .line 258
    iget-object v9, v0, La/ulo;->o:La/amq0;

    .line 259
    .line 260
    invoke-static/range {v8 .. v14}, La/dmo;->T(Landroidx/media3/common/Timeline$Window;La/amq0;IZLjava/lang/Object;La/bmq0;La/bmq0;)I

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-ne v6, v4, :cond_c

    .line 265
    .line 266
    invoke-static {v5, v2}, La/ulo;->A(La/yx90;I)La/yx90;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    :cond_c
    iget-object v2, v0, La/ulo;->P:La/itj0;

    .line 271
    .line 272
    iget-object v4, v0, La/ulo;->l:La/dmo;

    .line 273
    .line 274
    iget-object v4, v4, La/dmo;->g:La/q9o0;

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {}, La/q9o0;->d()La/p9o0;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    iget-object v4, v4, La/q9o0;->a:Landroid/os/Handler;

    .line 284
    .line 285
    const/16 v7, 0x14

    .line 286
    .line 287
    invoke-virtual {v4, v7, v1, v3, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    iput-object v1, v6, La/p9o0;->a:Landroid/os/Message;

    .line 292
    .line 293
    invoke-virtual {v6}, La/p9o0;->b()V

    .line 294
    .line 295
    .line 296
    iget-object v1, v5, La/yx90;->b:La/vn30;

    .line 297
    .line 298
    iget-object v1, v1, La/vn30;->a:Ljava/lang/Object;

    .line 299
    .line 300
    iget-object v2, v0, La/ulo;->n0:La/yx90;

    .line 301
    .line 302
    iget-object v2, v2, La/yx90;->b:La/vn30;

    .line 303
    .line 304
    iget-object v2, v2, La/vn30;->a:Ljava/lang/Object;

    .line 305
    .line 306
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    xor-int/lit8 v3, v1, 0x1

    .line 311
    .line 312
    move-object v1, v5

    .line 313
    invoke-virtual {v0, v1}, La/ulo;->m(La/yx90;)J

    .line 314
    .line 315
    .line 316
    move-result-wide v5

    .line 317
    const/4 v7, -0x1

    .line 318
    const/4 v8, 0x0

    .line 319
    const/4 v2, 0x0

    .line 320
    const/4 v4, 0x4

    .line 321
    invoke-virtual/range {v0 .. v8}, La/ulo;->a0(La/yx90;IZIJIZ)V

    .line 322
    .line 323
    .line 324
    :cond_d
    :goto_8
    return-void
.end method

.method public final c0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/ulo;->d:La/brd;

    .line 2
    .line 3
    invoke-virtual {v0}, La/brd;->a()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, La/ulo;->t:Landroid/os/Looper;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 35
    .line 36
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    const-string v2, "\'\nExpected thread: \'"

    .line 39
    .line 40
    const-string v3, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 41
    .line 42
    const-string v4, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 43
    .line 44
    invoke-static {v4, v0, v2, v1, v3}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-boolean v1, p0, La/ulo;->e0:Z

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-boolean v1, p0, La/ulo;->f0:Z

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 61
    .line 62
    .line 63
    :goto_0
    const-string v2, "ExoPlayerImpl"

    .line 64
    .line 65
    invoke-static {v2, v0, v1}, La/f1t0;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, La/ulo;->f0:Z

    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ulo;->H()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, La/ulo;->S(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0, v0}, La/ulo;->D(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final e(La/x8a0;)La/y8a0;
    .locals 7

    .line 1
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/ulo;->p(La/yx90;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, La/y8a0;

    .line 8
    .line 9
    iget-object v2, p0, La/ulo;->n0:La/yx90;

    .line 10
    .line 11
    iget-object v4, v2, La/yx90;->a:La/bmq0;

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :cond_0
    move v5, v0

    .line 18
    iget-object v2, p0, La/ulo;->l:La/dmo;

    .line 19
    .line 20
    iget-object v6, v2, La/dmo;->i:Landroid/os/Looper;

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    invoke-direct/range {v1 .. v6}, La/y8a0;-><init>(La/dmo;La/x8a0;La/bmq0;ILandroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final f()J
    .locals 5

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, La/ulo;->p0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 18
    .line 19
    iget-object v1, v0, La/yx90;->k:La/vn30;

    .line 20
    .line 21
    iget-wide v1, v1, La/vn30;->d:J

    .line 22
    .line 23
    iget-object v3, v0, La/yx90;->b:La/vn30;

    .line 24
    .line 25
    iget-wide v3, v3, La/vn30;->d:J

    .line 26
    .line 27
    cmp-long v1, v1, v3

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 34
    .line 35
    invoke-virtual {p0}, La/ulo;->j()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object p0, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 40
    .line 41
    invoke-virtual {v0, v1, p0, v2, v3}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-wide v0, p0, Landroidx/media3/common/Timeline$Window;->l:J

    .line 46
    .line 47
    invoke-static {v0, v1}, La/vtt0;->Y(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    return-wide v0

    .line 52
    :cond_1
    iget-wide v0, v0, La/yx90;->q:J

    .line 53
    .line 54
    iget-object v4, p0, La/ulo;->n0:La/yx90;

    .line 55
    .line 56
    iget-object v4, v4, La/yx90;->k:La/vn30;

    .line 57
    .line 58
    invoke-virtual {v4}, La/vn30;->c()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 65
    .line 66
    iget-object v1, v0, La/yx90;->a:La/bmq0;

    .line 67
    .line 68
    iget-object v0, v0, La/yx90;->k:La/vn30;

    .line 69
    .line 70
    iget-object v0, v0, La/vn30;->a:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v4, p0, La/ulo;->o:La/amq0;

    .line 73
    .line 74
    invoke-virtual {v1, v0, v4}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v1, p0, La/ulo;->n0:La/yx90;

    .line 79
    .line 80
    iget-object v1, v1, La/yx90;->k:La/vn30;

    .line 81
    .line 82
    iget v1, v1, La/vn30;->b:I

    .line 83
    .line 84
    invoke-virtual {v0, v1}, La/amq0;->d(I)J

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move-wide v2, v0

    .line 89
    :goto_0
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 90
    .line 91
    iget-object v1, v0, La/yx90;->a:La/bmq0;

    .line 92
    .line 93
    iget-object v0, v0, La/yx90;->k:La/vn30;

    .line 94
    .line 95
    iget-object v0, v0, La/vn30;->a:Ljava/lang/Object;

    .line 96
    .line 97
    iget-object p0, p0, La/ulo;->o:La/amq0;

    .line 98
    .line 99
    invoke-virtual {v1, v0, p0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 100
    .line 101
    .line 102
    iget-wide v0, p0, La/amq0;->e:J

    .line 103
    .line 104
    add-long/2addr v2, v0

    .line 105
    invoke-static {v2, v3}, La/vtt0;->Y(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    return-wide v0
.end method

.method public final g(La/yx90;)J
    .locals 7

    .line 1
    iget-object v0, p1, La/yx90;->b:La/vn30;

    .line 2
    .line 3
    iget-wide v1, p1, La/yx90;->c:J

    .line 4
    .line 5
    iget-object v3, p1, La/yx90;->a:La/bmq0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/vn30;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, La/yx90;->b:La/vn30;

    .line 14
    .line 15
    iget-object v0, v0, La/vn30;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v4, p0, La/ulo;->o:La/amq0;

    .line 18
    .line 19
    invoke-virtual {v3, v0, v4}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 20
    .line 21
    .line 22
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v0, v1, v5

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ulo;->p(La/yx90;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object p0, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 36
    .line 37
    const-wide/16 v0, 0x0

    .line 38
    .line 39
    invoke-virtual {v3, p1, p0, v0, v1}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-wide p0, p0, Landroidx/media3/common/Timeline$Window;->k:J

    .line 44
    .line 45
    invoke-static {p0, p1}, La/vtt0;->Y(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    return-wide p0

    .line 50
    :cond_0
    iget-wide p0, v4, La/amq0;->e:J

    .line 51
    .line 52
    invoke-static {p0, p1}, La/vtt0;->Y(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide p0

    .line 56
    invoke-static {v1, v2}, La/vtt0;->Y(J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    add-long/2addr v0, p0

    .line 61
    return-wide v0

    .line 62
    :cond_1
    invoke-virtual {p0, p1}, La/ulo;->m(La/yx90;)J

    .line 63
    .line 64
    .line 65
    move-result-wide p0

    .line 66
    invoke-static {p0, p1}, La/vtt0;->Y(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p0

    .line 70
    return-wide p0
.end method

.method public final h()I
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ulo;->z()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 11
    .line 12
    iget-object p0, p0, La/yx90;->b:La/vn30;

    .line 13
    .line 14
    iget p0, p0, La/vn30;->b:I

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final i()I
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ulo;->z()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 11
    .line 12
    iget-object p0, p0, La/yx90;->b:La/vn30;

    .line 13
    .line 14
    iget p0, p0, La/vn30;->c:I

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final isScrubbingModeEnabled()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, La/ulo;->M:Z

    .line 5
    .line 6
    return p0
.end method

.method public final j()I
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/ulo;->p(La/yx90;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v0, -0x1

    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    :cond_0
    return p0
.end method

.method public final k()I
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget p0, p0, La/ulo;->o0:I

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    :cond_0
    return p0

    .line 21
    :cond_1
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 22
    .line 23
    iget-object v0, p0, La/yx90;->a:La/bmq0;

    .line 24
    .line 25
    iget-object p0, p0, La/yx90;->b:La/vn30;

    .line 26
    .line 27
    iget-object p0, p0, La/vn30;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public final l()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/ulo;->m(La/yx90;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, La/vtt0;->Y(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public final m(La/yx90;)J
    .locals 3

    .line 1
    iget-object v0, p1, La/yx90;->a:La/bmq0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide p0, p0, La/ulo;->p0:J

    .line 10
    .line 11
    invoke-static {p0, p1}, La/vtt0;->M(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0

    .line 16
    :cond_0
    iget-boolean v0, p1, La/yx90;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, La/yx90;->l()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p1, La/yx90;->s:J

    .line 26
    .line 27
    :goto_0
    iget-object v2, p1, La/yx90;->b:La/vn30;

    .line 28
    .line 29
    invoke-virtual {v2}, La/vn30;->c()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    iget-object v2, p1, La/yx90;->a:La/bmq0;

    .line 37
    .line 38
    iget-object p1, p1, La/yx90;->b:La/vn30;

    .line 39
    .line 40
    iget-object p1, p1, La/vn30;->a:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object p0, p0, La/ulo;->o:La/amq0;

    .line 43
    .line 44
    invoke-virtual {v2, p1, p0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 45
    .line 46
    .line 47
    iget-wide p0, p0, La/amq0;->e:J

    .line 48
    .line 49
    add-long/2addr v0, p0

    .line 50
    return-wide v0
.end method

.method public final n()La/bmq0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget-object p0, p0, La/yx90;->a:La/bmq0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final o()La/rds0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget-object p0, p0, La/yx90;->i:La/ucs0;

    .line 7
    .line 8
    iget-object p0, p0, La/ucs0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/rds0;

    .line 11
    .line 12
    return-object p0
.end method

.method public final p(La/yx90;)I
    .locals 1

    .line 1
    iget-object v0, p1, La/yx90;->a:La/bmq0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p0, p0, La/ulo;->o0:I

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    iget-object v0, p1, La/yx90;->a:La/bmq0;

    .line 13
    .line 14
    iget-object p1, p1, La/yx90;->b:La/vn30;

    .line 15
    .line 16
    iget-object p1, p1, La/vn30;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p0, p0, La/ulo;->o:La/amq0;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget p0, p0, La/amq0;->c:I

    .line 25
    .line 26
    return p0
.end method

.method public final q()J
    .locals 4

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ulo;->z()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, La/ulo;->n0:La/yx90;

    .line 11
    .line 12
    iget-object v1, v0, La/yx90;->b:La/vn30;

    .line 13
    .line 14
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 15
    .line 16
    iget-object v2, v1, La/vn30;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p0, p0, La/ulo;->o:La/amq0;

    .line 19
    .line 20
    invoke-virtual {v0, v2, p0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 21
    .line 22
    .line 23
    iget v0, v1, La/vn30;->b:I

    .line 24
    .line 25
    iget v1, v1, La/vn30;->c:I

    .line 26
    .line 27
    invoke-virtual {p0, v0, v1}, La/amq0;->a(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, La/vtt0;->Y(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_0
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    return-wide v0

    .line 52
    :cond_1
    invoke-virtual {p0}, La/ulo;->j()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iget-object p0, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 57
    .line 58
    const-wide/16 v2, 0x0

    .line 59
    .line 60
    invoke-virtual {v0, v1, p0, v2, v3}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-wide v0, p0, Landroidx/media3/common/Timeline$Window;->l:J

    .line 65
    .line 66
    invoke-static {v0, v1}, La/vtt0;->Y(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    return-wide v0
.end method

.method public final r()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget-boolean p0, p0, La/yx90;->l:Z

    .line 7
    .line 8
    return p0
.end method

.method public final s()I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget p0, p0, La/yx90;->e:I

    .line 7
    .line 8
    return p0
.end method

.method public final setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/16 v1, 0xf

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, p1}, La/ulo;->M(IILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setScrubbingModeEnabled(Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/ulo;->M:Z

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean p1, p0, La/ulo;->M:Z

    .line 10
    .line 11
    iget-object v0, p0, La/ulo;->O:La/uch0;

    .line 12
    .line 13
    iget-object v1, v0, La/uch0;->a:La/f4x;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, La/ulo;->i:La/syj;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v2, v1, La/syj;->e:La/nyj;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    iget-object v3, v2, La/scs0;->x:La/f4x;

    .line 31
    .line 32
    iput-object v3, p0, La/ulo;->N:La/f4x;

    .line 33
    .line 34
    iget-object v0, v0, La/uch0;->a:La/f4x;

    .line 35
    .line 36
    invoke-virtual {v2}, La/nyj;->a()La/rcs0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0}, La/s3x;->j()La/eet0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/4 v5, 0x1

    .line 61
    invoke-virtual {v3, v4, v5}, La/rcs0;->i(IZ)La/rcs0;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v3}, La/rcs0;->a()La/scs0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v0, La/myj;

    .line 74
    .line 75
    invoke-direct {v0, v2}, La/myj;-><init>(La/nyj;)V

    .line 76
    .line 77
    .line 78
    iget-object v3, p0, La/ulo;->N:La/f4x;

    .line 79
    .line 80
    invoke-virtual {v0, v3}, La/myj;->j(Ljava/util/Set;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, La/nyj;

    .line 84
    .line 85
    invoke-direct {v3, v0}, La/nyj;-><init>(La/myj;)V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    iput-object v0, p0, La/ulo;->N:La/f4x;

    .line 90
    .line 91
    move-object v0, v3

    .line 92
    :goto_1
    invoke-virtual {v0, v2}, La/scs0;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_3

    .line 97
    .line 98
    invoke-virtual {v1, v0}, La/syj;->l(La/scs0;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    iget-object v0, p0, La/ulo;->l:La/dmo;

    .line 102
    .line 103
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 104
    .line 105
    const/16 v1, 0x24

    .line 106
    .line 107
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v0, v1, p1}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, La/p9o0;->b()V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, La/ulo;->n0:La/yx90;

    .line 119
    .line 120
    iget-boolean v0, p1, La/yx90;->l:Z

    .line 121
    .line 122
    iget p1, p1, La/yx90;->m:I

    .line 123
    .line 124
    invoke-virtual {p0, p1, v0}, La/ulo;->Z(IZ)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final t()I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget p0, p0, La/yx90;->n:I

    .line 7
    .line 8
    return p0
.end method

.method public final v()La/scs0;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ulo;->i:La/syj;

    .line 5
    .line 6
    iget-object v0, v0, La/syj;->e:La/nyj;

    .line 7
    .line 8
    iget-boolean v1, p0, La/ulo;->M:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v1, La/myj;

    .line 16
    .line 17
    invoke-direct {v1, v0}, La/myj;-><init>(La/nyj;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/ulo;->N:La/f4x;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, La/myj;->j(Ljava/util/Set;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, La/nyj;

    .line 26
    .line 27
    invoke-direct {p0, v1}, La/nyj;-><init>(La/myj;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    return-object v0
.end method

.method public final w(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ulo;->Q:La/iy90;

    .line 5
    .line 6
    iget-object p0, p0, La/iy90;->a:La/jjq;

    .line 7
    .line 8
    iget-object p0, p0, La/jjq;->a:Landroid/util/SparseBooleanArray;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final x()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, La/ulo;->n()La/bmq0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, La/ulo;->j()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object p0, p0, La/ulo;->a:Landroidx/media3/common/Timeline$Window;

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-virtual {v0, v1, p0, v2, v3}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroidx/media3/common/Timeline$Window;->a()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final y()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ulo;->s()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/ulo;->r()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, La/ulo;->t()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final z()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ulo;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ulo;->n0:La/yx90;

    .line 5
    .line 6
    iget-object p0, p0, La/yx90;->b:La/vn30;

    .line 7
    .line 8
    invoke-virtual {p0}, La/vn30;->c()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method
