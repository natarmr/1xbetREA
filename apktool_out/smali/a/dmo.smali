.class public final La/dmo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements La/ln30;
.implements La/seu0;


# static fields
.field public static final H1:J


# instance fields
.field public A:Z

.field public A1:Z

.field public B:La/gvh0;

.field public B1:La/dlo;

.field public C1:J

.field public D1:La/flo;

.field public E1:J

.field public F1:Z

.field public G1:F

.field public Y:La/uch0;

.field public Z:Z

.field public final a:[La/ujf0;

.field public final b:[La/j16;

.field public final c:[Z

.field public final d:La/syj;

.field public final e:La/ucs0;

.field public final f:La/xvj;

.field public f1:Z

.field public final g:La/q9o0;

.field public g1:La/cmo;

.field public final h:La/sbx0;

.field public h1:I

.field public final i:Landroid/os/Looper;

.field public i1:La/yx90;

.field public final j:Landroidx/media3/common/Timeline$Window;

.field public j1:La/amo;

.field public final k:La/amq0;

.field public k1:Z

.field public final l:J

.field public l1:Z

.field public final m:La/cwj;

.field public m1:Z

.field public final n:Ljava/util/ArrayList;

.field public n1:Z

.field public final o:La/l9o0;

.field public o1:J

.field public final p:La/klo;

.field public p1:Z

.field public final q:La/pn30;

.field public q1:I

.field public final r:La/jo30;

.field public r1:Z

.field public final s:La/vvj;

.field public s1:Z

.field public final t:S

.field public t1:Z

.field public final u:La/a4a0;

.field public u1:Z

.field public final v:Z

.field public v1:I

.field public final w:La/fsj;

.field public w1:La/cmo;

.field public final x:La/q9o0;

.field public x1:J

.field public final y:Z

.field public y1:J

.field public final z:La/x24;

.field public z1:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, La/vtt0;->Y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, La/dmo;->H1:J

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[La/j16;[La/j16;La/syj;La/ucs0;La/xvj;La/rsj;IZLa/fsj;La/gvh0;La/vvj;JZLandroid/os/Looper;La/l9o0;La/klo;La/a4a0;La/seu0;Z)V
    .locals 11

    .line 1
    move-object/from16 v1, p6

    .line 2
    .line 3
    move-object/from16 v2, p10

    .line 4
    .line 5
    move-object/from16 v3, p17

    .line 6
    .line 7
    move-object/from16 v4, p19

    .line 8
    .line 9
    sget-object v5, La/flo;->a:La/flo;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v6, p0, La/dmo;->E1:J

    .line 20
    .line 21
    move-object/from16 v8, p18

    .line 22
    .line 23
    iput-object v8, p0, La/dmo;->p:La/klo;

    .line 24
    .line 25
    iput-object p4, p0, La/dmo;->d:La/syj;

    .line 26
    .line 27
    move-object/from16 v8, p5

    .line 28
    .line 29
    iput-object v8, p0, La/dmo;->e:La/ucs0;

    .line 30
    .line 31
    iput-object v1, p0, La/dmo;->f:La/xvj;

    .line 32
    .line 33
    move/from16 v9, p8

    .line 34
    .line 35
    iput v9, p0, La/dmo;->q1:I

    .line 36
    .line 37
    move/from16 v9, p9

    .line 38
    .line 39
    iput-boolean v9, p0, La/dmo;->r1:Z

    .line 40
    .line 41
    move-object/from16 v9, p11

    .line 42
    .line 43
    iput-object v9, p0, La/dmo;->B:La/gvh0;

    .line 44
    .line 45
    move-object/from16 v9, p12

    .line 46
    .line 47
    iput-object v9, p0, La/dmo;->s:La/vvj;

    .line 48
    .line 49
    move-wide/from16 v9, p13

    .line 50
    .line 51
    long-to-int v9, v9

    .line 52
    iput-short v9, p0, La/dmo;->t:S

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    iput-boolean v9, p0, La/dmo;->l1:Z

    .line 56
    .line 57
    move/from16 v10, p15

    .line 58
    .line 59
    iput-boolean v10, p0, La/dmo;->v:Z

    .line 60
    .line 61
    iput-object v3, p0, La/dmo;->o:La/l9o0;

    .line 62
    .line 63
    iput-object v4, p0, La/dmo;->u:La/a4a0;

    .line 64
    .line 65
    iput-object v5, p0, La/dmo;->D1:La/flo;

    .line 66
    .line 67
    iput-object v2, p0, La/dmo;->w:La/fsj;

    .line 68
    .line 69
    const/high16 v5, 0x3f800000    # 1.0f

    .line 70
    .line 71
    iput v5, p0, La/dmo;->G1:F

    .line 72
    .line 73
    sget-object v5, La/uch0;->b:La/uch0;

    .line 74
    .line 75
    iput-object v5, p0, La/dmo;->Y:La/uch0;

    .line 76
    .line 77
    move/from16 v5, p21

    .line 78
    .line 79
    iput-boolean v5, p0, La/dmo;->A:Z

    .line 80
    .line 81
    iput-wide v6, p0, La/dmo;->C1:J

    .line 82
    .line 83
    iput-wide v6, p0, La/dmo;->o1:J

    .line 84
    .line 85
    iget-wide v5, v1, La/xvj;->l:J

    .line 86
    .line 87
    iput-wide v5, p0, La/dmo;->l:J

    .line 88
    .line 89
    sget-object v1, La/bmq0;->a:La/zlq0;

    .line 90
    .line 91
    invoke-static {v8}, La/yx90;->k(La/ucs0;)La/yx90;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iput-object v1, p0, La/dmo;->i1:La/yx90;

    .line 96
    .line 97
    new-instance v5, La/amo;

    .line 98
    .line 99
    invoke-direct {v5, v1}, La/amo;-><init>(La/yx90;)V

    .line 100
    .line 101
    .line 102
    iput-object v5, p0, La/dmo;->j1:La/amo;

    .line 103
    .line 104
    array-length v1, p2

    .line 105
    new-array v1, v1, [La/j16;

    .line 106
    .line 107
    iput-object v1, p0, La/dmo;->b:[La/j16;

    .line 108
    .line 109
    array-length v1, p2

    .line 110
    new-array v1, v1, [Z

    .line 111
    .line 112
    iput-object v1, p0, La/dmo;->c:[Z

    .line 113
    .line 114
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    array-length v1, p2

    .line 118
    new-array v1, v1, [La/ujf0;

    .line 119
    .line 120
    iput-object v1, p0, La/dmo;->a:[La/ujf0;

    .line 121
    .line 122
    move v1, v9

    .line 123
    move v5, v1

    .line 124
    :goto_0
    array-length v6, p2

    .line 125
    const/4 v7, 0x1

    .line 126
    if-ge v1, v6, :cond_1

    .line 127
    .line 128
    aget-object v6, p2, v1

    .line 129
    .line 130
    iput v1, v6, La/j16;->e:I

    .line 131
    .line 132
    iput-object v4, v6, La/j16;->f:La/a4a0;

    .line 133
    .line 134
    iput-object v3, v6, La/j16;->g:La/l9o0;

    .line 135
    .line 136
    iget-object v8, p0, La/dmo;->b:[La/j16;

    .line 137
    .line 138
    aput-object v6, v8, v1

    .line 139
    .line 140
    iget-object v6, p0, La/dmo;->b:[La/j16;

    .line 141
    .line 142
    aget-object v6, v6, v1

    .line 143
    .line 144
    iget-object v8, v6, La/j16;->a:Ljava/lang/Object;

    .line 145
    .line 146
    monitor-enter v8

    .line 147
    :try_start_0
    iput-object p4, v6, La/j16;->s:La/syj;

    .line 148
    .line 149
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    aget-object v6, p3, v1

    .line 151
    .line 152
    if-eqz v6, :cond_0

    .line 153
    .line 154
    iput v1, v6, La/j16;->e:I

    .line 155
    .line 156
    iput-object v4, v6, La/j16;->f:La/a4a0;

    .line 157
    .line 158
    iput-object v3, v6, La/j16;->g:La/l9o0;

    .line 159
    .line 160
    move v5, v7

    .line 161
    :cond_0
    iget-object v7, p0, La/dmo;->a:[La/ujf0;

    .line 162
    .line 163
    new-instance v8, La/ujf0;

    .line 164
    .line 165
    aget-object v10, p2, v1

    .line 166
    .line 167
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object v10, v8, La/ujf0;->e:Ljava/lang/Object;

    .line 171
    .line 172
    iput v1, v8, La/ujf0;->c:I

    .line 173
    .line 174
    iput-object v6, v8, La/ujf0;->f:Ljava/lang/Object;

    .line 175
    .line 176
    iput v9, v8, La/ujf0;->d:I

    .line 177
    .line 178
    iput-boolean v9, v8, La/ujf0;->a:Z

    .line 179
    .line 180
    iput-boolean v9, v8, La/ujf0;->b:Z

    .line 181
    .line 182
    aput-object v8, v7, v1

    .line 183
    .line 184
    add-int/lit8 v1, v1, 0x1

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :catchall_0
    move-exception v0

    .line 188
    move-object p0, v0

    .line 189
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    throw p0

    .line 191
    :cond_1
    iput-boolean v5, p0, La/dmo;->y:Z

    .line 192
    .line 193
    new-instance v1, La/cwj;

    .line 194
    .line 195
    invoke-direct {v1, p0, v3}, La/cwj;-><init>(La/dmo;La/l9o0;)V

    .line 196
    .line 197
    .line 198
    iput-object v1, p0, La/dmo;->m:La/cwj;

    .line 199
    .line 200
    new-instance v1, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 203
    .line 204
    .line 205
    iput-object v1, p0, La/dmo;->n:Ljava/util/ArrayList;

    .line 206
    .line 207
    new-instance v1, Landroidx/media3/common/Timeline$Window;

    .line 208
    .line 209
    invoke-direct {v1}, Landroidx/media3/common/Timeline$Window;-><init>()V

    .line 210
    .line 211
    .line 212
    iput-object v1, p0, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 213
    .line 214
    new-instance v1, La/amq0;

    .line 215
    .line 216
    invoke-direct {v1}, La/amq0;-><init>()V

    .line 217
    .line 218
    .line 219
    iput-object v1, p0, La/dmo;->k:La/amq0;

    .line 220
    .line 221
    iget-object v1, p4, La/syj;->a:La/dmo;

    .line 222
    .line 223
    if-nez v1, :cond_2

    .line 224
    .line 225
    move v1, v7

    .line 226
    goto :goto_1

    .line 227
    :cond_2
    move v1, v9

    .line 228
    :goto_1
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 229
    .line 230
    .line 231
    iput-object p0, p4, La/syj;->a:La/dmo;

    .line 232
    .line 233
    move-object/from16 v1, p7

    .line 234
    .line 235
    iput-object v1, p4, La/syj;->b:La/rsj;

    .line 236
    .line 237
    iget-object v5, p4, La/syj;->e:La/nyj;

    .line 238
    .line 239
    iput-object v5, p4, La/syj;->f:La/nyj;

    .line 240
    .line 241
    iput-boolean v7, p0, La/dmo;->A1:Z

    .line 242
    .line 243
    const/4 v0, 0x0

    .line 244
    move-object/from16 v5, p16

    .line 245
    .line 246
    invoke-virtual {v3, v5, v0}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iput-object v0, p0, La/dmo;->x:La/q9o0;

    .line 251
    .line 252
    new-instance v5, La/pn30;

    .line 253
    .line 254
    new-instance v6, La/z9f;

    .line 255
    .line 256
    const/16 v8, 0x17

    .line 257
    .line 258
    invoke-direct {v6, p0, v8}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 259
    .line 260
    .line 261
    array-length p2, p2

    .line 262
    invoke-direct {v5, v2, v0, v6, p2}, La/pn30;-><init>(La/fsj;La/q9o0;La/z9f;I)V

    .line 263
    .line 264
    .line 265
    iput-object v5, p0, La/dmo;->q:La/pn30;

    .line 266
    .line 267
    new-instance p2, La/jo30;

    .line 268
    .line 269
    move-object/from16 p12, p0

    .line 270
    .line 271
    move-object/from16 p11, p2

    .line 272
    .line 273
    move-object/from16 p14, v0

    .line 274
    .line 275
    move-object/from16 p16, v1

    .line 276
    .line 277
    move-object/from16 p13, v2

    .line 278
    .line 279
    move-object/from16 p15, v4

    .line 280
    .line 281
    invoke-direct/range {p11 .. p16}, La/jo30;-><init>(La/dmo;La/fsj;La/q9o0;La/a4a0;La/rsj;)V

    .line 282
    .line 283
    .line 284
    move-object/from16 v0, p11

    .line 285
    .line 286
    iput-object v0, p0, La/dmo;->r:La/jo30;

    .line 287
    .line 288
    new-instance v0, La/sbx0;

    .line 289
    .line 290
    const/16 v1, 0x8

    .line 291
    .line 292
    invoke-direct {v0, v1}, La/sbx0;-><init>(B)V

    .line 293
    .line 294
    .line 295
    iput-object v0, p0, La/dmo;->h:La/sbx0;

    .line 296
    .line 297
    iget-object v1, v0, La/sbx0;->c:Ljava/lang/Object;

    .line 298
    .line 299
    monitor-enter v1

    .line 300
    :try_start_2
    iget-object v2, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v2, Landroid/os/Looper;

    .line 303
    .line 304
    if-nez v2, :cond_4

    .line 305
    .line 306
    iget v2, v0, La/sbx0;->b:I

    .line 307
    .line 308
    if-nez v2, :cond_3

    .line 309
    .line 310
    iget-object v2, v0, La/sbx0;->e:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v2, Landroid/os/HandlerThread;

    .line 313
    .line 314
    if-nez v2, :cond_3

    .line 315
    .line 316
    move v9, v7

    .line 317
    :cond_3
    invoke-static {v9}, La/x0x;->K(Z)V

    .line 318
    .line 319
    .line 320
    new-instance v2, Landroid/os/HandlerThread;

    .line 321
    .line 322
    const-string v4, "ExoPlayer:Playback"

    .line 323
    .line 324
    const/16 v5, -0x10

    .line 325
    .line 326
    invoke-direct {v2, v4, v5}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 327
    .line 328
    .line 329
    iput-object v2, v0, La/sbx0;->e:Ljava/lang/Object;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 332
    .line 333
    .line 334
    iget-object v2, v0, La/sbx0;->e:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v2, Landroid/os/HandlerThread;

    .line 337
    .line 338
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    iput-object v2, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 343
    .line 344
    goto :goto_2

    .line 345
    :catchall_1
    move-exception v0

    .line 346
    move-object p0, v0

    .line 347
    goto :goto_3

    .line 348
    :cond_4
    :goto_2
    iget v4, v0, La/sbx0;->b:I

    .line 349
    .line 350
    add-int/2addr v4, v7

    .line 351
    iput v4, v0, La/sbx0;->b:I

    .line 352
    .line 353
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 354
    iput-object v2, p0, La/dmo;->i:Landroid/os/Looper;

    .line 355
    .line 356
    invoke-virtual {v3, v2, p0}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    iput-object v0, p0, La/dmo;->g:La/q9o0;

    .line 361
    .line 362
    new-instance v1, La/x24;

    .line 363
    .line 364
    invoke-direct {v1, p1, v2, p0}, La/x24;-><init>(Landroid/content/Context;Landroid/os/Looper;La/dmo;)V

    .line 365
    .line 366
    .line 367
    iput-object v1, p0, La/dmo;->z:La/x24;

    .line 368
    .line 369
    new-instance p1, La/wlo;

    .line 370
    .line 371
    move-object/from16 v1, p20

    .line 372
    .line 373
    invoke-direct {p1, p0, v1}, La/wlo;-><init>(La/dmo;La/seu0;)V

    .line 374
    .line 375
    .line 376
    const/16 v1, 0x23

    .line 377
    .line 378
    invoke-virtual {v0, v1, p1}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    invoke-virtual {p1}, La/p9o0;->b()V

    .line 383
    .line 384
    .line 385
    new-instance p1, La/xlo;

    .line 386
    .line 387
    invoke-direct {p1, p0}, La/xlo;-><init>(La/dmo;)V

    .line 388
    .line 389
    .line 390
    const/16 p0, 0x27

    .line 391
    .line 392
    invoke-virtual {v0, p0, p1}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    invoke-virtual {p0}, La/p9o0;->b()V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 401
    throw p0
.end method

.method public static S(La/bmq0;La/cmo;ZIZLandroidx/media3/common/Timeline$Window;La/amq0;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v0, p1, La/cmo;->a:La/bmq0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/bmq0;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v2, v0

    .line 20
    :goto_0
    :try_start_0
    iget v5, p1, La/cmo;->b:I

    .line 21
    .line 22
    iget-wide v6, p1, La/cmo;->c:J

    .line 23
    .line 24
    move-object v3, p5

    .line 25
    move-object v4, p6

    .line 26
    invoke-virtual/range {v2 .. v7}, La/bmq0;->i(Landroidx/media3/common/Timeline$Window;La/amq0;IJ)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    move-object v5, v4

    .line 31
    move-object v4, v3

    .line 32
    invoke-virtual {p0, v2}, La/bmq0;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p6

    .line 36
    if-eqz p6, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object p6, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p0, p6}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result p6

    .line 45
    const/4 v0, -0x1

    .line 46
    if-eq p6, v0, :cond_4

    .line 47
    .line 48
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v2, p2, v5}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-boolean p2, p2, La/amq0;->f:Z

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget p2, v5, La/amq0;->c:I

    .line 59
    .line 60
    const-wide/16 p3, 0x0

    .line 61
    .line 62
    invoke-virtual {v2, p2, v4, p3, p4}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget p2, p2, Landroidx/media3/common/Timeline$Window;->m:I

    .line 67
    .line 68
    iget-object p3, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2, p3}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-ne p2, p3, :cond_3

    .line 75
    .line 76
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {p0, p2, v5}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget v6, p2, La/amq0;->c:I

    .line 83
    .line 84
    iget-wide v7, p1, La/cmo;->c:J

    .line 85
    .line 86
    move-object v3, p0

    .line 87
    invoke-virtual/range {v3 .. v8}, La/bmq0;->i(Landroidx/media3/common/Timeline$Window;La/amq0;IJ)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_3
    :goto_1
    return-object p5

    .line 93
    :cond_4
    move-object v3, p0

    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    iget-object p0, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 97
    .line 98
    move p2, p3

    .line 99
    move p3, p4

    .line 100
    move-object p5, v2

    .line 101
    move-object p6, v3

    .line 102
    move-object p1, v5

    .line 103
    move-object p4, p0

    .line 104
    move-object p0, v4

    .line 105
    invoke-static/range {p0 .. p6}, La/dmo;->T(Landroidx/media3/common/Timeline$Window;La/amq0;IZLjava/lang/Object;La/bmq0;La/bmq0;)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eq v6, v0, :cond_5

    .line 110
    .line 111
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v3 .. v8}, La/bmq0;->i(Landroidx/media3/common/Timeline$Window;La/amq0;IJ)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 122
    return-object p0
.end method

.method public static T(Landroidx/media3/common/Timeline$Window;La/amq0;IZLjava/lang/Object;La/bmq0;La/bmq0;)I
    .locals 12

    .line 1
    move-object v3, p0

    .line 2
    move-object v2, p1

    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    invoke-virtual {v1, v0, p1}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget v4, v4, La/amq0;->c:I

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    invoke-virtual {v1, v4, p0, v7, v8}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v4, v4, Landroidx/media3/common/Timeline$Window;->a:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    move v5, v9

    .line 25
    :goto_0
    invoke-virtual {v6}, La/bmq0;->o()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    if-ge v5, v10, :cond_1

    .line 30
    .line 31
    invoke-virtual {v6, v5, p0, v7, v8}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    iget-object v10, v10, Landroidx/media3/common/Timeline$Window;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    return v5

    .line 44
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1, v0}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {v1}, La/bmq0;->h()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    const/4 v8, -0x1

    .line 56
    move v11, v8

    .line 57
    move v10, v9

    .line 58
    :goto_1
    if-ge v10, v7, :cond_3

    .line 59
    .line 60
    if-ne v11, v8, :cond_3

    .line 61
    .line 62
    move-object v4, v1

    .line 63
    move v1, v0

    .line 64
    move-object v0, v4

    .line 65
    move v4, p2

    .line 66
    move v5, p3

    .line 67
    invoke-virtual/range {v0 .. v5}, La/bmq0;->d(ILa/amq0;Landroidx/media3/common/Timeline$Window;IZ)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v8, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v0, v1}, La/bmq0;->l(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v6, v3}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    add-int/lit8 v10, v10, 0x1

    .line 83
    .line 84
    move v3, v1

    .line 85
    move-object v1, v0

    .line 86
    move v0, v3

    .line 87
    move-object v3, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_2
    if-ne v11, v8, :cond_4

    .line 90
    .line 91
    return v8

    .line 92
    :cond_4
    invoke-virtual {v6, v11, p1, v9}, La/bmq0;->f(ILa/amq0;Z)La/amq0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget v0, v0, La/amq0;->c:I

    .line 97
    .line 98
    return v0
.end method

.method public static y(La/nn30;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, La/nn30;->a:La/f930;

    .line 5
    .line 6
    iget-boolean v2, p0, La/nn30;->e:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, La/f930;->l()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p0, La/nn30;->c:[La/ixg0;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    move v4, v0

    .line 18
    :goto_0
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    invoke-interface {v5}, La/ixg0;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    iget-boolean p0, p0, La/nn30;->e:Z

    .line 31
    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    invoke-virtual {v1}, La/f930;->b()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :goto_2
    const-wide/high16 v3, -0x8000000000000000L

    .line 42
    .line 43
    cmp-long p0, v1, v3

    .line 44
    .line 45
    if-eqz p0, :cond_4

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :catch_0
    :cond_4
    return v0
.end method


# virtual methods
.method public final A(ILa/vn30;)Z
    .locals 2

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v1, v0, La/pn30;->k:[La/nn30;

    .line 4
    .line 5
    aget-object v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, v1, La/nn30;->g:La/on30;

    .line 10
    .line 11
    iget-object v1, v1, La/on30;->a:La/vn30;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 21
    .line 22
    aget-object p0, p0, p1

    .line 23
    .line 24
    iget-object p2, v0, La/pn30;->k:[La/nn30;

    .line 25
    .line 26
    aget-object p1, p2, p1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/ujf0;->h(La/nn30;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final A0(IIIZ)V
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    move p4, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p4, v2

    .line 11
    :goto_0
    const/4 v3, 0x2

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    move p3, v3

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    if-ne p3, v3, :cond_2

    .line 17
    .line 18
    move p3, v1

    .line 19
    :cond_2
    :goto_1
    iget-boolean v0, p0, La/dmo;->Z:Z

    .line 20
    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    move p2, v1

    .line 24
    goto :goto_2

    .line 25
    :cond_3
    if-ne p2, v1, :cond_5

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    const/4 p2, 0x4

    .line 30
    goto :goto_2

    .line 31
    :cond_4
    move p2, v2

    .line 32
    :cond_5
    :goto_2
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 33
    .line 34
    iget-boolean v0, p1, La/yx90;->l:Z

    .line 35
    .line 36
    if-ne v0, p4, :cond_6

    .line 37
    .line 38
    iget v0, p1, La/yx90;->n:I

    .line 39
    .line 40
    if-ne v0, p2, :cond_6

    .line 41
    .line 42
    iget v0, p1, La/yx90;->m:I

    .line 43
    .line 44
    if-ne v0, p3, :cond_6

    .line 45
    .line 46
    goto :goto_5

    .line 47
    :cond_6
    invoke-virtual {p1, p3, p2, p4}, La/yx90;->e(IIZ)La/yx90;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, La/dmo;->i1:La/yx90;

    .line 52
    .line 53
    invoke-virtual {p0, v2, v2}, La/dmo;->D0(ZZ)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, La/dmo;->q:La/pn30;

    .line 57
    .line 58
    iget-object p2, p1, La/pn30;->i:La/nn30;

    .line 59
    .line 60
    :goto_3
    if-eqz p2, :cond_9

    .line 61
    .line 62
    iget-object p3, p2, La/nn30;->o:La/ucs0;

    .line 63
    .line 64
    iget-object p3, p3, La/ucs0;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p3, [La/fmo;

    .line 67
    .line 68
    array-length v0, p3

    .line 69
    move v4, v2

    .line 70
    :goto_4
    if-ge v4, v0, :cond_8

    .line 71
    .line 72
    aget-object v5, p3, v4

    .line 73
    .line 74
    if-eqz v5, :cond_7

    .line 75
    .line 76
    invoke-interface {v5, p4}, La/fmo;->o(Z)V

    .line 77
    .line 78
    .line 79
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_8
    iget-object p2, p2, La/nn30;->m:La/nn30;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_9
    invoke-virtual {p0}, La/dmo;->s0()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_b

    .line 90
    .line 91
    invoke-virtual {p0}, La/dmo;->w0()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, La/dmo;->B0()V

    .line 95
    .line 96
    .line 97
    iget-object p2, p0, La/dmo;->i1:La/yx90;

    .line 98
    .line 99
    iget-boolean p3, p2, La/yx90;->p:Z

    .line 100
    .line 101
    if-eqz p3, :cond_a

    .line 102
    .line 103
    invoke-virtual {p2, v2}, La/yx90;->i(Z)La/yx90;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iput-object p2, p0, La/dmo;->i1:La/yx90;

    .line 108
    .line 109
    :cond_a
    iget-wide p2, p0, La/dmo;->x1:J

    .line 110
    .line 111
    invoke-virtual {p1, p2, p3}, La/pn30;->r(J)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_b
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 116
    .line 117
    iget p1, p1, La/yx90;->e:I

    .line 118
    .line 119
    const/4 p2, 0x3

    .line 120
    iget-object p3, p0, La/dmo;->g:La/q9o0;

    .line 121
    .line 122
    if-ne p1, p2, :cond_c

    .line 123
    .line 124
    iget-object p1, p0, La/dmo;->m:La/cwj;

    .line 125
    .line 126
    iput-boolean v1, p1, La/cwj;->b:Z

    .line 127
    .line 128
    iget-object p1, p1, La/cwj;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p1, La/d4m0;

    .line 131
    .line 132
    invoke-virtual {p1}, La/d4m0;->f()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, La/dmo;->u0()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3, v3}, La/q9o0;->h(I)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_c
    if-ne p1, v3, :cond_d

    .line 143
    .line 144
    invoke-virtual {p3, v3}, La/q9o0;->h(I)V

    .line 145
    .line 146
    .line 147
    :cond_d
    :goto_5
    return-void
.end method

.method public final B()Z
    .locals 5

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v0, v0, La/pn30;->i:La/nn30;

    .line 4
    .line 5
    iget-object v1, v0, La/nn30;->g:La/on30;

    .line 6
    .line 7
    iget-wide v1, v1, La/on30;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, La/nn30;->e:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 23
    .line 24
    iget-wide v3, v0, La/yx90;->s:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, La/dmo;->s0()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    :cond_0
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public final B0()V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 4
    .line 5
    iget-object v1, v1, La/pn30;->i:La/nn30;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_b

    .line 10
    .line 11
    :cond_0
    iget-boolean v2, v1, La/nn30;->e:Z

    .line 12
    .line 13
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, La/nn30;->a:La/f930;

    .line 21
    .line 22
    invoke-virtual {v2}, La/f930;->h()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-wide v2, v10

    .line 28
    :goto_0
    cmp-long v4, v2, v10

    .line 29
    .line 30
    const/4 v12, 0x2

    .line 31
    const/16 v13, 0x10

    .line 32
    .line 33
    const/4 v14, 0x1

    .line 34
    const/4 v15, 0x0

    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, La/nn30;->g()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    iget-object v4, v0, La/dmo;->q:La/pn30;

    .line 44
    .line 45
    invoke-virtual {v4, v1}, La/pn30;->s(La/nn30;)I

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, La/dmo;->g()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v15}, La/dmo;->t(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, La/dmo;->C()V

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {v0, v14, v2, v3}, La/dmo;->Q(ZJ)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 61
    .line 62
    iget-wide v4, v1, La/yx90;->s:J

    .line 63
    .line 64
    cmp-long v1, v2, v4

    .line 65
    .line 66
    if-eqz v1, :cond_12

    .line 67
    .line 68
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 69
    .line 70
    iget-object v4, v1, La/yx90;->b:La/vn30;

    .line 71
    .line 72
    iget-wide v5, v1, La/yx90;->c:J

    .line 73
    .line 74
    const/4 v8, 0x1

    .line 75
    const/4 v9, 0x5

    .line 76
    move-object v1, v4

    .line 77
    move-wide v4, v5

    .line 78
    move-wide v6, v2

    .line 79
    invoke-virtual/range {v0 .. v9}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, v0, La/dmo;->i1:La/yx90;

    .line 84
    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :cond_3
    iget-object v2, v0, La/dmo;->m:La/cwj;

    .line 88
    .line 89
    invoke-virtual {v0}, La/dmo;->z()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    iget-object v4, v2, La/cwj;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, La/d4m0;

    .line 96
    .line 97
    iget-object v5, v2, La/cwj;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v5, La/j16;

    .line 100
    .line 101
    if-eqz v5, :cond_8

    .line 102
    .line 103
    invoke-virtual {v5}, La/j16;->m()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_8

    .line 108
    .line 109
    if-eqz v3, :cond_4

    .line 110
    .line 111
    iget-object v5, v2, La/cwj;->e:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v5, La/j16;

    .line 114
    .line 115
    iget-byte v5, v5, La/j16;->h:B

    .line 116
    .line 117
    if-ne v5, v12, :cond_8

    .line 118
    .line 119
    :cond_4
    iget-object v5, v2, La/cwj;->e:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v5, La/j16;

    .line 122
    .line 123
    invoke-virtual {v5}, La/j16;->o()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-nez v5, :cond_5

    .line 128
    .line 129
    if-nez v3, :cond_8

    .line 130
    .line 131
    iget-object v3, v2, La/cwj;->e:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, La/j16;

    .line 134
    .line 135
    invoke-virtual {v3}, La/j16;->l()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_5

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    iget-object v3, v2, La/cwj;->f:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v3, La/bm30;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-interface {v3}, La/bm30;->e()J

    .line 150
    .line 151
    .line 152
    move-result-wide v5

    .line 153
    iget-boolean v7, v2, La/cwj;->a:Z

    .line 154
    .line 155
    if-eqz v7, :cond_7

    .line 156
    .line 157
    invoke-virtual {v4}, La/d4m0;->e()J

    .line 158
    .line 159
    .line 160
    move-result-wide v7

    .line 161
    cmp-long v7, v5, v7

    .line 162
    .line 163
    if-gez v7, :cond_6

    .line 164
    .line 165
    iget-boolean v3, v4, La/d4m0;->b:Z

    .line 166
    .line 167
    if-eqz v3, :cond_9

    .line 168
    .line 169
    invoke-virtual {v4}, La/d4m0;->e()J

    .line 170
    .line 171
    .line 172
    move-result-wide v5

    .line 173
    invoke-virtual {v4, v5, v6}, La/d4m0;->c(J)V

    .line 174
    .line 175
    .line 176
    iput-boolean v15, v4, La/d4m0;->b:Z

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    iput-boolean v15, v2, La/cwj;->a:Z

    .line 180
    .line 181
    iget-boolean v7, v2, La/cwj;->b:Z

    .line 182
    .line 183
    if-eqz v7, :cond_7

    .line 184
    .line 185
    invoke-virtual {v4}, La/d4m0;->f()V

    .line 186
    .line 187
    .line 188
    :cond_7
    invoke-virtual {v4, v5, v6}, La/d4m0;->c(J)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v3}, La/bm30;->d()La/zx90;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    iget-object v5, v4, La/d4m0;->e:La/zx90;

    .line 196
    .line 197
    invoke-virtual {v3, v5}, La/zx90;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-nez v5, :cond_9

    .line 202
    .line 203
    invoke-virtual {v4, v3}, La/d4m0;->a(La/zx90;)V

    .line 204
    .line 205
    .line 206
    iget-object v4, v2, La/cwj;->d:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v4, La/dmo;

    .line 209
    .line 210
    iget-object v4, v4, La/dmo;->g:La/q9o0;

    .line 211
    .line 212
    invoke-virtual {v4, v13, v3}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-virtual {v3}, La/p9o0;->b()V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_8
    :goto_1
    iput-boolean v14, v2, La/cwj;->a:Z

    .line 221
    .line 222
    iget-boolean v3, v2, La/cwj;->b:Z

    .line 223
    .line 224
    if-eqz v3, :cond_9

    .line 225
    .line 226
    invoke-virtual {v4}, La/d4m0;->f()V

    .line 227
    .line 228
    .line 229
    :cond_9
    :goto_2
    invoke-virtual {v2}, La/cwj;->e()J

    .line 230
    .line 231
    .line 232
    move-result-wide v2

    .line 233
    iput-wide v2, v0, La/dmo;->x1:J

    .line 234
    .line 235
    iget-wide v4, v1, La/nn30;->p:J

    .line 236
    .line 237
    sub-long/2addr v2, v4

    .line 238
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 239
    .line 240
    iget-wide v4, v1, La/yx90;->s:J

    .line 241
    .line 242
    iget-object v1, v0, La/dmo;->n:Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-nez v1, :cond_10

    .line 249
    .line 250
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 251
    .line 252
    iget-object v1, v1, La/yx90;->b:La/vn30;

    .line 253
    .line 254
    invoke-virtual {v1}, La/vn30;->c()Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_a

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_a
    iget-boolean v1, v0, La/dmo;->A1:Z

    .line 262
    .line 263
    if-eqz v1, :cond_b

    .line 264
    .line 265
    iput-boolean v15, v0, La/dmo;->A1:Z

    .line 266
    .line 267
    :cond_b
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 268
    .line 269
    iget-object v4, v1, La/yx90;->a:La/bmq0;

    .line 270
    .line 271
    iget-object v1, v1, La/yx90;->b:La/vn30;

    .line 272
    .line 273
    iget-object v1, v1, La/vn30;->a:Ljava/lang/Object;

    .line 274
    .line 275
    invoke-virtual {v4, v1}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 276
    .line 277
    .line 278
    iget v1, v0, La/dmo;->z1:I

    .line 279
    .line 280
    iget-object v4, v0, La/dmo;->n:Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-lez v1, :cond_d

    .line 291
    .line 292
    iget-object v4, v0, La/dmo;->n:Ljava/util/ArrayList;

    .line 293
    .line 294
    add-int/lit8 v5, v1, -0x1

    .line 295
    .line 296
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    if-nez v4, :cond_c

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_c
    invoke-static {}, La/hny;->b()V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_d
    :goto_3
    iget-object v4, v0, La/dmo;->n:Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-ge v1, v4, :cond_f

    .line 314
    .line 315
    iget-object v4, v0, La/dmo;->n:Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    if-nez v4, :cond_e

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_e
    invoke-static {}, La/hny;->b()V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :cond_f
    :goto_4
    iput v1, v0, La/dmo;->z1:I

    .line 329
    .line 330
    :cond_10
    :goto_5
    iget-object v1, v0, La/dmo;->m:La/cwj;

    .line 331
    .line 332
    invoke-virtual {v1}, La/cwj;->b()Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_11

    .line 337
    .line 338
    iget-object v1, v0, La/dmo;->j1:La/amo;

    .line 339
    .line 340
    iget-boolean v1, v1, La/amo;->e:Z

    .line 341
    .line 342
    xor-int/lit8 v8, v1, 0x1

    .line 343
    .line 344
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 345
    .line 346
    iget-object v4, v1, La/yx90;->b:La/vn30;

    .line 347
    .line 348
    iget-wide v5, v1, La/yx90;->c:J

    .line 349
    .line 350
    const/4 v9, 0x6

    .line 351
    move-object v1, v4

    .line 352
    move-wide v4, v5

    .line 353
    move-wide v6, v2

    .line 354
    invoke-virtual/range {v0 .. v9}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    iput-object v1, v0, La/dmo;->i1:La/yx90;

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_11
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 362
    .line 363
    iput-wide v2, v1, La/yx90;->s:J

    .line 364
    .line 365
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 366
    .line 367
    .line 368
    move-result-wide v2

    .line 369
    iput-wide v2, v1, La/yx90;->t:J

    .line 370
    .line 371
    :cond_12
    :goto_6
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 372
    .line 373
    iget-object v1, v1, La/pn30;->l:La/nn30;

    .line 374
    .line 375
    iget-object v2, v0, La/dmo;->i1:La/yx90;

    .line 376
    .line 377
    invoke-virtual {v1}, La/nn30;->d()J

    .line 378
    .line 379
    .line 380
    move-result-wide v3

    .line 381
    iput-wide v3, v2, La/yx90;->q:J

    .line 382
    .line 383
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 384
    .line 385
    iget-wide v2, v1, La/yx90;->q:J

    .line 386
    .line 387
    invoke-virtual {v0, v2, v3}, La/dmo;->o(J)J

    .line 388
    .line 389
    .line 390
    move-result-wide v2

    .line 391
    iput-wide v2, v1, La/yx90;->r:J

    .line 392
    .line 393
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 394
    .line 395
    iget-boolean v2, v1, La/yx90;->l:Z

    .line 396
    .line 397
    if-eqz v2, :cond_1c

    .line 398
    .line 399
    iget v2, v1, La/yx90;->e:I

    .line 400
    .line 401
    const/4 v3, 0x3

    .line 402
    if-ne v2, v3, :cond_1c

    .line 403
    .line 404
    iget-object v2, v1, La/yx90;->a:La/bmq0;

    .line 405
    .line 406
    iget-object v1, v1, La/yx90;->b:La/vn30;

    .line 407
    .line 408
    invoke-virtual {v0, v2, v1}, La/dmo;->t0(La/bmq0;La/vn30;)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-eqz v1, :cond_1c

    .line 413
    .line 414
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 415
    .line 416
    iget-object v2, v1, La/yx90;->o:La/zx90;

    .line 417
    .line 418
    iget v2, v2, La/zx90;->a:F

    .line 419
    .line 420
    const/high16 v4, 0x3f800000    # 1.0f

    .line 421
    .line 422
    cmpl-float v2, v2, v4

    .line 423
    .line 424
    if-nez v2, :cond_1c

    .line 425
    .line 426
    iget-object v2, v0, La/dmo;->s:La/vvj;

    .line 427
    .line 428
    iget-object v5, v1, La/yx90;->a:La/bmq0;

    .line 429
    .line 430
    iget-object v6, v1, La/yx90;->b:La/vn30;

    .line 431
    .line 432
    iget-object v6, v6, La/vn30;->a:Ljava/lang/Object;

    .line 433
    .line 434
    iget-wide v7, v1, La/yx90;->s:J

    .line 435
    .line 436
    invoke-virtual {v0, v5, v6, v7, v8}, La/dmo;->l(La/bmq0;Ljava/lang/Object;J)J

    .line 437
    .line 438
    .line 439
    move-result-wide v5

    .line 440
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 441
    .line 442
    iget-wide v7, v1, La/yx90;->r:J

    .line 443
    .line 444
    move-wide/from16 v16, v10

    .line 445
    .line 446
    iget-wide v10, v2, La/vvj;->c:J

    .line 447
    .line 448
    cmp-long v1, v10, v16

    .line 449
    .line 450
    if-nez v1, :cond_13

    .line 451
    .line 452
    goto/16 :goto_a

    .line 453
    .line 454
    :cond_13
    sub-long v7, v5, v7

    .line 455
    .line 456
    iget-wide v9, v2, La/vvj;->m:J

    .line 457
    .line 458
    cmp-long v1, v9, v16

    .line 459
    .line 460
    if-nez v1, :cond_14

    .line 461
    .line 462
    iput-wide v7, v2, La/vvj;->m:J

    .line 463
    .line 464
    const-wide/16 v7, 0x0

    .line 465
    .line 466
    iput-wide v7, v2, La/vvj;->n:J

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_14
    long-to-float v1, v9

    .line 470
    const v9, 0x3f7fbe77    # 0.999f

    .line 471
    .line 472
    .line 473
    mul-float/2addr v1, v9

    .line 474
    long-to-float v10, v7

    .line 475
    const v11, 0x3a831200    # 9.999871E-4f

    .line 476
    .line 477
    .line 478
    mul-float/2addr v10, v11

    .line 479
    add-float/2addr v10, v1

    .line 480
    move v1, v9

    .line 481
    float-to-long v9, v10

    .line 482
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 483
    .line 484
    .line 485
    move-result-wide v9

    .line 486
    iput-wide v9, v2, La/vvj;->m:J

    .line 487
    .line 488
    sub-long/2addr v7, v9

    .line 489
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 490
    .line 491
    .line 492
    move-result-wide v7

    .line 493
    iget-wide v9, v2, La/vvj;->n:J

    .line 494
    .line 495
    long-to-float v9, v9

    .line 496
    mul-float/2addr v9, v1

    .line 497
    long-to-float v1, v7

    .line 498
    mul-float/2addr v11, v1

    .line 499
    add-float/2addr v11, v9

    .line 500
    float-to-long v7, v11

    .line 501
    iput-wide v7, v2, La/vvj;->n:J

    .line 502
    .line 503
    :goto_7
    iget-wide v7, v2, La/vvj;->l:J

    .line 504
    .line 505
    cmp-long v1, v7, v16

    .line 506
    .line 507
    if-eqz v1, :cond_15

    .line 508
    .line 509
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 510
    .line 511
    .line 512
    move-result-wide v9

    .line 513
    const-wide/16 v18, 0x3e8

    .line 514
    .line 515
    iget-wide v7, v2, La/vvj;->l:J

    .line 516
    .line 517
    sub-long/2addr v9, v7

    .line 518
    cmp-long v1, v9, v18

    .line 519
    .line 520
    if-gez v1, :cond_16

    .line 521
    .line 522
    iget v4, v2, La/vvj;->k:F

    .line 523
    .line 524
    goto/16 :goto_a

    .line 525
    .line 526
    :cond_15
    const-wide/16 v18, 0x3e8

    .line 527
    .line 528
    :cond_16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 529
    .line 530
    .line 531
    move-result-wide v7

    .line 532
    iput-wide v7, v2, La/vvj;->l:J

    .line 533
    .line 534
    iget-wide v7, v2, La/vvj;->m:J

    .line 535
    .line 536
    const-wide/16 v20, 0x3

    .line 537
    .line 538
    iget-wide v9, v2, La/vvj;->n:J

    .line 539
    .line 540
    mul-long v9, v9, v20

    .line 541
    .line 542
    add-long v24, v9, v7

    .line 543
    .line 544
    iget-wide v7, v2, La/vvj;->h:J

    .line 545
    .line 546
    cmp-long v1, v7, v24

    .line 547
    .line 548
    if-lez v1, :cond_19

    .line 549
    .line 550
    invoke-static/range {v18 .. v19}, La/vtt0;->M(J)J

    .line 551
    .line 552
    .line 553
    move-result-wide v8

    .line 554
    iget v1, v2, La/vvj;->k:F

    .line 555
    .line 556
    sub-float/2addr v1, v4

    .line 557
    long-to-float v8, v8

    .line 558
    mul-float/2addr v1, v8

    .line 559
    float-to-long v9, v1

    .line 560
    iget v1, v2, La/vvj;->i:F

    .line 561
    .line 562
    sub-float/2addr v1, v4

    .line 563
    mul-float/2addr v1, v8

    .line 564
    const v11, 0x33d6bf95    # 1.0E-7f

    .line 565
    .line 566
    .line 567
    float-to-long v7, v1

    .line 568
    add-long/2addr v9, v7

    .line 569
    iget-wide v7, v2, La/vvj;->e:J

    .line 570
    .line 571
    move/from16 v18, v11

    .line 572
    .line 573
    move v1, v12

    .line 574
    iget-wide v11, v2, La/vvj;->h:J

    .line 575
    .line 576
    sub-long/2addr v11, v9

    .line 577
    new-array v9, v3, [J

    .line 578
    .line 579
    aput-wide v24, v9, v15

    .line 580
    .line 581
    aput-wide v7, v9, v14

    .line 582
    .line 583
    aput-wide v11, v9, v1

    .line 584
    .line 585
    aget-wide v7, v9, v15

    .line 586
    .line 587
    :goto_8
    if-ge v14, v3, :cond_18

    .line 588
    .line 589
    aget-wide v10, v9, v14

    .line 590
    .line 591
    cmp-long v1, v10, v7

    .line 592
    .line 593
    if-lez v1, :cond_17

    .line 594
    .line 595
    move-wide v7, v10

    .line 596
    :cond_17
    add-int/lit8 v14, v14, 0x1

    .line 597
    .line 598
    goto :goto_8

    .line 599
    :cond_18
    iput-wide v7, v2, La/vvj;->h:J

    .line 600
    .line 601
    goto :goto_9

    .line 602
    :cond_19
    const v18, 0x33d6bf95    # 1.0E-7f

    .line 603
    .line 604
    .line 605
    iget v1, v2, La/vvj;->k:F

    .line 606
    .line 607
    sub-float/2addr v1, v4

    .line 608
    const/4 v3, 0x0

    .line 609
    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    div-float v1, v1, v18

    .line 614
    .line 615
    float-to-long v7, v1

    .line 616
    sub-long v20, v5, v7

    .line 617
    .line 618
    iget-wide v7, v2, La/vvj;->h:J

    .line 619
    .line 620
    move-wide/from16 v22, v7

    .line 621
    .line 622
    invoke-static/range {v20 .. v25}, La/vtt0;->j(JJJ)J

    .line 623
    .line 624
    .line 625
    move-result-wide v7

    .line 626
    iput-wide v7, v2, La/vvj;->h:J

    .line 627
    .line 628
    iget-wide v9, v2, La/vvj;->g:J

    .line 629
    .line 630
    cmp-long v1, v9, v16

    .line 631
    .line 632
    if-eqz v1, :cond_1a

    .line 633
    .line 634
    cmp-long v1, v7, v9

    .line 635
    .line 636
    if-lez v1, :cond_1a

    .line 637
    .line 638
    iput-wide v9, v2, La/vvj;->h:J

    .line 639
    .line 640
    move-wide v7, v9

    .line 641
    :cond_1a
    :goto_9
    sub-long/2addr v5, v7

    .line 642
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 643
    .line 644
    .line 645
    move-result-wide v7

    .line 646
    iget-wide v9, v2, La/vvj;->a:J

    .line 647
    .line 648
    cmp-long v1, v7, v9

    .line 649
    .line 650
    if-gez v1, :cond_1b

    .line 651
    .line 652
    iput v4, v2, La/vvj;->k:F

    .line 653
    .line 654
    goto :goto_a

    .line 655
    :cond_1b
    long-to-float v1, v5

    .line 656
    mul-float v7, v18, v1

    .line 657
    .line 658
    add-float/2addr v7, v4

    .line 659
    iget v1, v2, La/vvj;->j:F

    .line 660
    .line 661
    iget v3, v2, La/vvj;->i:F

    .line 662
    .line 663
    invoke-static {v7, v1, v3}, La/vtt0;->h(FFF)F

    .line 664
    .line 665
    .line 666
    move-result v4

    .line 667
    iput v4, v2, La/vvj;->k:F

    .line 668
    .line 669
    :goto_a
    iget-object v1, v0, La/dmo;->m:La/cwj;

    .line 670
    .line 671
    invoke-virtual {v1}, La/cwj;->d()La/zx90;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    iget v1, v1, La/zx90;->a:F

    .line 676
    .line 677
    cmpl-float v1, v1, v4

    .line 678
    .line 679
    if-eqz v1, :cond_1c

    .line 680
    .line 681
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 682
    .line 683
    iget-object v1, v1, La/yx90;->o:La/zx90;

    .line 684
    .line 685
    new-instance v2, La/zx90;

    .line 686
    .line 687
    iget v1, v1, La/zx90;->b:F

    .line 688
    .line 689
    invoke-direct {v2, v4, v1}, La/zx90;-><init>(FF)V

    .line 690
    .line 691
    .line 692
    iget-object v1, v0, La/dmo;->g:La/q9o0;

    .line 693
    .line 694
    invoke-virtual {v1, v13}, La/q9o0;->g(I)V

    .line 695
    .line 696
    .line 697
    iget-object v1, v0, La/dmo;->m:La/cwj;

    .line 698
    .line 699
    invoke-virtual {v1, v2}, La/cwj;->a(La/zx90;)V

    .line 700
    .line 701
    .line 702
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 703
    .line 704
    iget-object v1, v1, La/yx90;->o:La/zx90;

    .line 705
    .line 706
    iget-object v2, v0, La/dmo;->m:La/cwj;

    .line 707
    .line 708
    invoke-virtual {v2}, La/cwj;->d()La/zx90;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    iget v2, v2, La/zx90;->a:F

    .line 713
    .line 714
    invoke-virtual {v0, v1, v2, v15, v15}, La/dmo;->w(La/zx90;FZZ)V

    .line 715
    .line 716
    .line 717
    :cond_1c
    :goto_b
    return-void
.end method

.method public final C()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 4
    .line 5
    iget-object v1, v1, La/pn30;->l:La/nn30;

    .line 6
    .line 7
    invoke-static {v1}, La/dmo;->y(La/nn30;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v6

    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 25
    .line 26
    iget-object v1, v1, La/pn30;->l:La/nn30;

    .line 27
    .line 28
    iget-boolean v7, v1, La/nn30;->e:Z

    .line 29
    .line 30
    if-nez v7, :cond_1

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v7, v1, La/nn30;->a:La/f930;

    .line 35
    .line 36
    invoke-virtual {v7}, La/f930;->b()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    :goto_0
    invoke-virtual {v0, v7, v8}, La/dmo;->o(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v13

    .line 44
    iget-object v7, v0, La/dmo;->q:La/pn30;

    .line 45
    .line 46
    iget-object v7, v7, La/pn30;->i:La/nn30;

    .line 47
    .line 48
    iget-object v7, v0, La/dmo;->i1:La/yx90;

    .line 49
    .line 50
    iget-object v7, v7, La/yx90;->a:La/bmq0;

    .line 51
    .line 52
    iget-object v8, v1, La/nn30;->g:La/on30;

    .line 53
    .line 54
    iget-object v8, v8, La/on30;->a:La/vn30;

    .line 55
    .line 56
    invoke-virtual {v0, v7, v8}, La/dmo;->t0(La/bmq0;La/vn30;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    iget-object v7, v0, La/dmo;->s:La/vvj;

    .line 63
    .line 64
    iget-wide v7, v7, La/vvj;->h:J

    .line 65
    .line 66
    move-wide/from16 v17, v7

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-wide/from16 v17, v2

    .line 70
    .line 71
    :goto_1
    new-instance v9, La/rl00;

    .line 72
    .line 73
    iget-object v10, v0, La/dmo;->u:La/a4a0;

    .line 74
    .line 75
    iget-object v7, v0, La/dmo;->i1:La/yx90;

    .line 76
    .line 77
    iget-object v11, v7, La/yx90;->a:La/bmq0;

    .line 78
    .line 79
    iget-object v1, v1, La/nn30;->g:La/on30;

    .line 80
    .line 81
    iget-object v12, v1, La/on30;->a:La/vn30;

    .line 82
    .line 83
    iget-object v1, v0, La/dmo;->m:La/cwj;

    .line 84
    .line 85
    invoke-virtual {v1}, La/cwj;->d()La/zx90;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget v15, v1, La/zx90;->a:F

    .line 90
    .line 91
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 92
    .line 93
    iget-boolean v1, v1, La/yx90;->l:Z

    .line 94
    .line 95
    iget-boolean v1, v0, La/dmo;->n1:Z

    .line 96
    .line 97
    move/from16 v16, v1

    .line 98
    .line 99
    invoke-direct/range {v9 .. v18}, La/rl00;-><init>(La/a4a0;La/bmq0;La/vn30;JFZJ)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v0, La/dmo;->f:La/xvj;

    .line 103
    .line 104
    invoke-virtual {v1, v9}, La/xvj;->b(La/rl00;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iget-object v7, v0, La/dmo;->q:La/pn30;

    .line 109
    .line 110
    iget-object v7, v7, La/pn30;->i:La/nn30;

    .line 111
    .line 112
    if-nez v1, :cond_4

    .line 113
    .line 114
    iget-boolean v8, v7, La/nn30;->e:Z

    .line 115
    .line 116
    if-eqz v8, :cond_4

    .line 117
    .line 118
    const-wide/32 v10, 0x7a120

    .line 119
    .line 120
    .line 121
    cmp-long v8, v13, v10

    .line 122
    .line 123
    if-gez v8, :cond_4

    .line 124
    .line 125
    iget-wide v10, v0, La/dmo;->l:J

    .line 126
    .line 127
    cmp-long v8, v10, v4

    .line 128
    .line 129
    if-gtz v8, :cond_3

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    iget-object v1, v7, La/nn30;->a:La/f930;

    .line 133
    .line 134
    iget-object v7, v0, La/dmo;->i1:La/yx90;

    .line 135
    .line 136
    iget-wide v7, v7, La/yx90;->s:J

    .line 137
    .line 138
    invoke-virtual {v1, v7, v8}, La/f930;->m(J)V

    .line 139
    .line 140
    .line 141
    iget-object v1, v0, La/dmo;->f:La/xvj;

    .line 142
    .line 143
    invoke-virtual {v1, v9}, La/xvj;->b(La/rl00;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    :cond_4
    :goto_2
    iput-boolean v1, v0, La/dmo;->p1:Z

    .line 148
    .line 149
    if-eqz v1, :cond_a

    .line 150
    .line 151
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 152
    .line 153
    iget-object v1, v1, La/pn30;->l:La/nn30;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v7, La/xq00;

    .line 159
    .line 160
    invoke-direct {v7}, La/xq00;-><init>()V

    .line 161
    .line 162
    .line 163
    iget-wide v8, v0, La/dmo;->x1:J

    .line 164
    .line 165
    iget-wide v10, v1, La/nn30;->p:J

    .line 166
    .line 167
    sub-long/2addr v8, v10

    .line 168
    iput-wide v8, v7, La/xq00;->a:J

    .line 169
    .line 170
    iget-object v8, v0, La/dmo;->m:La/cwj;

    .line 171
    .line 172
    invoke-virtual {v8}, La/cwj;->d()La/zx90;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    iget v8, v8, La/zx90;->a:F

    .line 177
    .line 178
    const/4 v9, 0x0

    .line 179
    cmpl-float v9, v8, v9

    .line 180
    .line 181
    const/4 v10, 0x1

    .line 182
    if-gtz v9, :cond_6

    .line 183
    .line 184
    const v9, -0x800001

    .line 185
    .line 186
    .line 187
    cmpl-float v9, v8, v9

    .line 188
    .line 189
    if-nez v9, :cond_5

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_5
    move v9, v6

    .line 193
    goto :goto_4

    .line 194
    :cond_6
    :goto_3
    move v9, v10

    .line 195
    :goto_4
    invoke-static {v9}, La/x0x;->A(Z)V

    .line 196
    .line 197
    .line 198
    iput v8, v7, La/xq00;->b:F

    .line 199
    .line 200
    iget-wide v8, v0, La/dmo;->o1:J

    .line 201
    .line 202
    cmp-long v4, v8, v4

    .line 203
    .line 204
    if-gez v4, :cond_8

    .line 205
    .line 206
    cmp-long v2, v8, v2

    .line 207
    .line 208
    if-nez v2, :cond_7

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_7
    move v2, v6

    .line 212
    goto :goto_6

    .line 213
    :cond_8
    :goto_5
    move v2, v10

    .line 214
    :goto_6
    invoke-static {v2}, La/x0x;->A(Z)V

    .line 215
    .line 216
    .line 217
    iput-wide v8, v7, La/xq00;->c:J

    .line 218
    .line 219
    new-instance v2, La/yq00;

    .line 220
    .line 221
    invoke-direct {v2, v7}, La/yq00;-><init>(La/xq00;)V

    .line 222
    .line 223
    .line 224
    iget-object v3, v1, La/nn30;->m:La/nn30;

    .line 225
    .line 226
    if-nez v3, :cond_9

    .line 227
    .line 228
    move v6, v10

    .line 229
    :cond_9
    invoke-static {v6}, La/x0x;->K(Z)V

    .line 230
    .line 231
    .line 232
    iget-object v1, v1, La/nn30;->a:La/f930;

    .line 233
    .line 234
    invoke-virtual {v1, v2}, La/f930;->g(La/yq00;)Z

    .line 235
    .line 236
    .line 237
    :cond_a
    invoke-virtual {v0}, La/dmo;->x0()V

    .line 238
    .line 239
    .line 240
    return-void
.end method

.method public final C0(La/bmq0;La/vn30;La/bmq0;La/vn30;JZ)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, La/dmo;->t0(La/bmq0;La/vn30;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p2, La/vn30;->a:Ljava/lang/Object;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2}, La/vn30;->c()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    sget-object p1, La/zx90;->d:La/zx90;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 19
    .line 20
    iget-object p1, p1, La/yx90;->o:La/zx90;

    .line 21
    .line 22
    :goto_0
    iget-object p2, p0, La/dmo;->m:La/cwj;

    .line 23
    .line 24
    invoke-virtual {p2}, La/cwj;->d()La/zx90;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p3, p1}, La/zx90;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-nez p3, :cond_7

    .line 33
    .line 34
    iget-object p3, p0, La/dmo;->g:La/q9o0;

    .line 35
    .line 36
    const/16 p4, 0x10

    .line 37
    .line 38
    invoke-virtual {p3, p4}, La/q9o0;->g(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, La/cwj;->a(La/zx90;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, La/dmo;->i1:La/yx90;

    .line 45
    .line 46
    iget-object p2, p2, La/yx90;->o:La/zx90;

    .line 47
    .line 48
    iget p1, p1, La/zx90;->a:F

    .line 49
    .line 50
    const/4 p3, 0x0

    .line 51
    invoke-virtual {p0, p2, p1, p3, p3}, La/dmo;->w(La/zx90;FZZ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget-object p2, p0, La/dmo;->k:La/amq0;

    .line 56
    .line 57
    invoke-virtual {p1, v1, p2}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v0, v0, La/amq0;->c:I

    .line 62
    .line 63
    iget-object v2, p0, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 64
    .line 65
    invoke-virtual {p1, v0, v2}, La/bmq0;->n(ILandroidx/media3/common/Timeline$Window;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v2, Landroidx/media3/common/Timeline$Window;->i:La/dn30;

    .line 69
    .line 70
    sget-object v3, La/vtt0;->a:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v3, p0, La/dmo;->s:La/vvj;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-wide v4, v0, La/dn30;->a:J

    .line 78
    .line 79
    invoke-static {v4, v5}, La/vtt0;->M(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    iput-wide v4, v3, La/vvj;->c:J

    .line 84
    .line 85
    iget-wide v4, v0, La/dn30;->b:J

    .line 86
    .line 87
    invoke-static {v4, v5}, La/vtt0;->M(J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    iput-wide v4, v3, La/vvj;->f:J

    .line 92
    .line 93
    iget-wide v4, v0, La/dn30;->c:J

    .line 94
    .line 95
    invoke-static {v4, v5}, La/vtt0;->M(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    iput-wide v4, v3, La/vvj;->g:J

    .line 100
    .line 101
    iget v4, v0, La/dn30;->d:F

    .line 102
    .line 103
    const v5, -0x800001

    .line 104
    .line 105
    .line 106
    cmpl-float v6, v4, v5

    .line 107
    .line 108
    if-eqz v6, :cond_2

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    const v4, 0x3f7851ec    # 0.97f

    .line 112
    .line 113
    .line 114
    :goto_1
    iput v4, v3, La/vvj;->j:F

    .line 115
    .line 116
    iget v0, v0, La/dn30;->e:F

    .line 117
    .line 118
    cmpl-float v5, v0, v5

    .line 119
    .line 120
    if-eqz v5, :cond_3

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    const v0, 0x3f83d70a    # 1.03f

    .line 124
    .line 125
    .line 126
    :goto_2
    iput v0, v3, La/vvj;->i:F

    .line 127
    .line 128
    const/high16 v5, 0x3f800000    # 1.0f

    .line 129
    .line 130
    cmpl-float v4, v4, v5

    .line 131
    .line 132
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    if-nez v4, :cond_4

    .line 138
    .line 139
    cmpl-float v0, v0, v5

    .line 140
    .line 141
    if-nez v0, :cond_4

    .line 142
    .line 143
    iput-wide v6, v3, La/vvj;->c:J

    .line 144
    .line 145
    :cond_4
    invoke-virtual {v3}, La/vvj;->a()V

    .line 146
    .line 147
    .line 148
    cmp-long v0, p5, v6

    .line 149
    .line 150
    if-eqz v0, :cond_5

    .line 151
    .line 152
    invoke-virtual {p0, p1, v1, p5, p6}, La/dmo;->l(La/bmq0;Ljava/lang/Object;J)J

    .line 153
    .line 154
    .line 155
    move-result-wide p0

    .line 156
    iput-wide p0, v3, La/vvj;->d:J

    .line 157
    .line 158
    invoke-virtual {v3}, La/vvj;->a()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_5
    iget-object p0, v2, Landroidx/media3/common/Timeline$Window;->a:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-virtual {p3}, La/bmq0;->p()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-nez p1, :cond_6

    .line 169
    .line 170
    iget-object p1, p4, La/vn30;->a:Ljava/lang/Object;

    .line 171
    .line 172
    invoke-virtual {p3, p1, p2}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iget p1, p1, La/amq0;->c:I

    .line 177
    .line 178
    const-wide/16 p4, 0x0

    .line 179
    .line 180
    invoke-virtual {p3, p1, v2, p4, p5}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object p1, p1, Landroidx/media3/common/Timeline$Window;->a:Ljava/lang/Object;

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_6
    const/4 p1, 0x0

    .line 188
    :goto_3
    invoke-static {p1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    if-eqz p0, :cond_8

    .line 193
    .line 194
    if-eqz p7, :cond_7

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_7
    return-void

    .line 198
    :cond_8
    :goto_4
    iput-wide v6, v3, La/vvj;->d:J

    .line 199
    .line 200
    invoke-virtual {v3}, La/vvj;->a()V

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method public final D()V
    .locals 9

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    invoke-virtual {v0}, La/pn30;->p()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, La/pn30;->m:La/nn30;

    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    iget-object v1, v0, La/nn30;->a:La/f930;

    .line 11
    .line 12
    iget-boolean v2, v0, La/nn30;->d:Z

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-boolean v2, v0, La/nn30;->e:Z

    .line 17
    .line 18
    if-eqz v2, :cond_a

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v1}, La/f930;->e()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_a

    .line 25
    .line 26
    iget-object v2, p0, La/dmo;->i1:La/yx90;

    .line 27
    .line 28
    iget-object v2, v2, La/yx90;->a:La/bmq0;

    .line 29
    .line 30
    iget-boolean v2, v0, La/nn30;->e:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, La/f930;->s()J

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, p0, La/dmo;->f:La/xvj;

    .line 38
    .line 39
    iget-object v2, v2, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, La/wvj;

    .line 60
    .line 61
    iget-boolean v3, v3, La/wvj;->b:Z

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_3
    iget-boolean v2, v0, La/nn30;->d:Z

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    iget-object v2, v0, La/nn30;->g:La/on30;

    .line 73
    .line 74
    iget-wide v4, v2, La/on30;->b:J

    .line 75
    .line 76
    iput-boolean v3, v0, La/nn30;->d:Z

    .line 77
    .line 78
    invoke-virtual {v1, p0, v4, v5}, La/f930;->r(La/ln30;J)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    new-instance v2, La/xq00;

    .line 83
    .line 84
    invoke-direct {v2}, La/xq00;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-wide v4, p0, La/dmo;->x1:J

    .line 88
    .line 89
    iget-wide v6, v0, La/nn30;->p:J

    .line 90
    .line 91
    sub-long/2addr v4, v6

    .line 92
    iput-wide v4, v2, La/xq00;->a:J

    .line 93
    .line 94
    iget-object v4, p0, La/dmo;->m:La/cwj;

    .line 95
    .line 96
    invoke-virtual {v4}, La/cwj;->d()La/zx90;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget v4, v4, La/zx90;->a:F

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    cmpl-float v5, v4, v5

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    if-gtz v5, :cond_6

    .line 107
    .line 108
    const v5, -0x800001

    .line 109
    .line 110
    .line 111
    cmpl-float v5, v4, v5

    .line 112
    .line 113
    if-nez v5, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    move v5, v6

    .line 117
    goto :goto_1

    .line 118
    :cond_6
    :goto_0
    move v5, v3

    .line 119
    :goto_1
    invoke-static {v5}, La/x0x;->A(Z)V

    .line 120
    .line 121
    .line 122
    iput v4, v2, La/xq00;->b:F

    .line 123
    .line 124
    iget-wide v4, p0, La/dmo;->o1:J

    .line 125
    .line 126
    const-wide/16 v7, 0x0

    .line 127
    .line 128
    cmp-long p0, v4, v7

    .line 129
    .line 130
    if-gez p0, :cond_8

    .line 131
    .line 132
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    cmp-long p0, v4, v7

    .line 138
    .line 139
    if-nez p0, :cond_7

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_7
    move p0, v6

    .line 143
    goto :goto_3

    .line 144
    :cond_8
    :goto_2
    move p0, v3

    .line 145
    :goto_3
    invoke-static {p0}, La/x0x;->A(Z)V

    .line 146
    .line 147
    .line 148
    iput-wide v4, v2, La/xq00;->c:J

    .line 149
    .line 150
    new-instance p0, La/yq00;

    .line 151
    .line 152
    invoke-direct {p0, v2}, La/yq00;-><init>(La/xq00;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, La/nn30;->m:La/nn30;

    .line 156
    .line 157
    if-nez v0, :cond_9

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_9
    move v3, v6

    .line 161
    :goto_4
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, p0}, La/f930;->g(La/yq00;)Z

    .line 165
    .line 166
    .line 167
    :cond_a
    :goto_5
    return-void
.end method

.method public final D0(ZZ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/dmo;->n1:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/dmo;->o:La/l9o0;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :goto_0
    iput-wide p1, p0, La/dmo;->o1:J

    .line 23
    .line 24
    return-void
.end method

.method public final E(I)V
    .locals 6

    .line 1
    iget-object v0, p0, La/dmo;->j1:La/amo;

    .line 2
    .line 3
    iget-object v1, p0, La/dmo;->i1:La/yx90;

    .line 4
    .line 5
    iget-boolean v2, v0, La/amo;->d:Z

    .line 6
    .line 7
    iget-object v3, v0, La/amo;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/yx90;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eq v3, v1, :cond_0

    .line 14
    .line 15
    move v3, v5

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v3, v4

    .line 18
    :goto_0
    or-int/2addr v2, v3

    .line 19
    iput-boolean v2, v0, La/amo;->d:Z

    .line 20
    .line 21
    iput-object v1, v0, La/amo;->f:Ljava/lang/Object;

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    iget-object v0, v1, La/yx90;->a:La/bmq0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 34
    .line 35
    iget-object v1, v0, La/yx90;->a:La/bmq0;

    .line 36
    .line 37
    iget-object v0, v0, La/yx90;->b:La/vn30;

    .line 38
    .line 39
    iget-object v0, v0, La/vn30;->a:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, -0x1

    .line 46
    if-eq v0, v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v5, v4

    .line 50
    :goto_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 51
    .line 52
    iget-object v1, p0, La/dmo;->i1:La/yx90;

    .line 53
    .line 54
    iget-object v2, v1, La/yx90;->b:La/vn30;

    .line 55
    .line 56
    iget-object v2, v2, La/vn30;->a:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v1, v1, La/yx90;->a:La/bmq0;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v3, p0, La/dmo;->i1:La/yx90;

    .line 69
    .line 70
    iget-object v3, v3, La/yx90;->a:La/bmq0;

    .line 71
    .line 72
    invoke-virtual {v3}, La/bmq0;->o()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    filled-new-array {v2, v1, v3, p1}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v1, "periodUid %s not found in timeline %s with size %d triggered by msg %d"

    .line 89
    .line 90
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p1, v5}, La/x0x;->J(Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    :cond_2
    iget-object p1, p0, La/dmo;->j1:La/amo;

    .line 98
    .line 99
    iget-object v0, p0, La/dmo;->p:La/klo;

    .line 100
    .line 101
    iget-object v0, v0, La/klo;->a:La/ulo;

    .line 102
    .line 103
    iget-object v1, v0, La/ulo;->j:La/q9o0;

    .line 104
    .line 105
    new-instance v2, La/llo;

    .line 106
    .line 107
    invoke-direct {v2, v0, p1, v4}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v2}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 111
    .line 112
    .line 113
    new-instance p1, La/amo;

    .line 114
    .line 115
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 116
    .line 117
    invoke-direct {p1, v0}, La/amo;-><init>(La/yx90;)V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, La/dmo;->j1:La/amo;

    .line 121
    .line 122
    :cond_3
    return-void
.end method

.method public final F(I)V
    .locals 10

    .line 1
    iget-object v0, p0, La/dmo;->a:[La/ujf0;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 6
    .line 7
    iget-object v0, v0, La/pn30;->i:La/nn30;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, La/ujf0;->d(La/nn30;)La/j16;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, La/j16;->i:La/ixg0;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v0, La/ixg0;

    .line 25
    .line 26
    invoke-interface {v0}, La/ixg0;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto :goto_0

    .line 32
    :catch_1
    move-exception v0

    .line 33
    :goto_0
    iget-object v1, v1, La/ujf0;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, La/j16;

    .line 36
    .line 37
    iget-byte v1, v1, La/j16;->b:B

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    if-eq v1, v2, :cond_1

    .line 41
    .line 42
    const/4 v2, 0x5

    .line 43
    if-ne v1, v2, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    throw v0

    .line 47
    :cond_1
    :goto_1
    iget-object v1, p0, La/dmo;->q:La/pn30;

    .line 48
    .line 49
    iget-object v1, v1, La/pn30;->i:La/nn30;

    .line 50
    .line 51
    iget-object v1, v1, La/nn30;->o:La/ucs0;

    .line 52
    .line 53
    iget-object v2, v1, La/ucs0;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, [La/fmo;

    .line 56
    .line 57
    aget-object v2, v2, p1

    .line 58
    .line 59
    invoke-interface {v2}, La/fmo;->r()Landroidx/media3/common/b;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v2}, Landroidx/media3/common/b;->c(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "Disabling track due to error: "

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v3, "ExoPlayerImplInternal"

    .line 74
    .line 75
    invoke-static {v3, v2, v0}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    new-instance v5, La/ucs0;

    .line 79
    .line 80
    iget-object v0, v1, La/ucs0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, [La/tjf0;

    .line 83
    .line 84
    invoke-virtual {v0}, [La/tjf0;->clone()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, [La/tjf0;

    .line 89
    .line 90
    iget-object v2, v1, La/ucs0;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, [La/fmo;

    .line 93
    .line 94
    invoke-virtual {v2}, [La/fmo;->clone()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, [La/fmo;

    .line 99
    .line 100
    iget-object v3, v1, La/ucs0;->e:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, La/rds0;

    .line 103
    .line 104
    iget-object v1, v1, La/ucs0;->f:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-direct {v5, v0, v2, v3, v1}, La/ucs0;-><init>([La/tjf0;[La/fmo;La/rds0;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, v5, La/ucs0;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, [La/tjf0;

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    aput-object v1, v0, p1

    .line 115
    .line 116
    iget-object v0, v5, La/ucs0;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, [La/fmo;

    .line 119
    .line 120
    aput-object v1, v0, p1

    .line 121
    .line 122
    invoke-virtual {p0, p1}, La/dmo;->h(I)V

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, La/dmo;->q:La/pn30;

    .line 126
    .line 127
    iget-object v4, p1, La/pn30;->i:La/nn30;

    .line 128
    .line 129
    iget-object p0, p0, La/dmo;->i1:La/yx90;

    .line 130
    .line 131
    iget-wide v6, p0, La/yx90;->s:J

    .line 132
    .line 133
    iget-object p0, v4, La/nn30;->j:[La/j16;

    .line 134
    .line 135
    array-length p0, p0

    .line 136
    new-array v9, p0, [Z

    .line 137
    .line 138
    const/4 v8, 0x0

    .line 139
    invoke-virtual/range {v4 .. v9}, La/nn30;->a(La/ucs0;JZ[Z)J

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final G(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, La/dmo;->c:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_0

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    new-instance v0, La/vlo;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, La/vlo;-><init>(La/dmo;IZ)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/dmo;->x:La/q9o0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final H()V
    .locals 2

    .line 1
    iget-object v0, p0, La/dmo;->r:La/jo30;

    .line 2
    .line 3
    invoke-virtual {v0}, La/jo30;->b()La/bmq0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v0, v1}, La/dmo;->u(La/bmq0;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final I()V
    .locals 1

    .line 1
    iget-object p0, p0, La/dmo;->j1:La/amo;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, La/amo;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    throw p0
.end method

.method public final J()V
    .locals 10

    .line 1
    iget-object v0, p0, La/dmo;->j1:La/amo;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, La/amo;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, La/dmo;->O(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, La/dmo;->f:La/xvj;

    .line 12
    .line 13
    iget-object v3, v2, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    iget-wide v6, v2, La/xvj;->o:J

    .line 24
    .line 25
    const-wide/16 v8, -0x1

    .line 26
    .line 27
    cmp-long v8, v6, v8

    .line 28
    .line 29
    if-eqz v8, :cond_1

    .line 30
    .line 31
    cmp-long v6, v6, v4

    .line 32
    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v6, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    move v6, v1

    .line 39
    :goto_1
    const-string v7, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."

    .line 40
    .line 41
    invoke-static {v7, v6}, La/x0x;->J(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    iput-wide v4, v2, La/xvj;->o:J

    .line 45
    .line 46
    iget-object v4, p0, La/dmo;->u:La/a4a0;

    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, La/wvj;

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    new-instance v5, La/wvj;

    .line 57
    .line 58
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput v1, v5, La/wvj;->a:I

    .line 62
    .line 63
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget v6, v5, La/wvj;->a:I

    .line 68
    .line 69
    add-int/2addr v6, v1

    .line 70
    iput v6, v5, La/wvj;->a:I

    .line 71
    .line 72
    :goto_2
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, La/wvj;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v2, v2, La/xvj;->m:La/wcf0;

    .line 82
    .line 83
    iget-object v4, v4, La/a4a0;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v2, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Ljava/lang/Integer;

    .line 90
    .line 91
    const/4 v4, -0x1

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eq v5, v4, :cond_3

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    move v2, v4

    .line 106
    :goto_3
    if-eq v2, v4, :cond_4

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    const/high16 v2, 0xc80000

    .line 110
    .line 111
    :goto_4
    iput v2, v3, La/wvj;->c:I

    .line 112
    .line 113
    iput-boolean v0, v3, La/wvj;->b:Z

    .line 114
    .line 115
    iget-object v2, p0, La/dmo;->i1:La/yx90;

    .line 116
    .line 117
    iget-object v2, v2, La/yx90;->a:La/bmq0;

    .line 118
    .line 119
    invoke-virtual {v2}, La/bmq0;->p()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    const/4 v3, 0x2

    .line 124
    if-eqz v2, :cond_5

    .line 125
    .line 126
    const/4 v2, 0x4

    .line 127
    goto :goto_5

    .line 128
    :cond_5
    move v2, v3

    .line 129
    :goto_5
    invoke-virtual {p0, v2}, La/dmo;->o0(I)V

    .line 130
    .line 131
    .line 132
    iget-object v2, p0, La/dmo;->i1:La/yx90;

    .line 133
    .line 134
    iget-boolean v4, v2, La/yx90;->l:Z

    .line 135
    .line 136
    iget v5, v2, La/yx90;->n:I

    .line 137
    .line 138
    iget v6, v2, La/yx90;->m:I

    .line 139
    .line 140
    iget-object v7, p0, La/dmo;->z:La/x24;

    .line 141
    .line 142
    iget v2, v2, La/yx90;->e:I

    .line 143
    .line 144
    invoke-virtual {v7, v2, v4}, La/x24;->c(IZ)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-virtual {p0, v2, v5, v6, v4}, La/dmo;->A0(IIIZ)V

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, La/dmo;->r:La/jo30;

    .line 152
    .line 153
    iget-object v4, v2, La/jo30;->c:Ljava/util/ArrayList;

    .line 154
    .line 155
    iget-boolean v5, v2, La/jo30;->l:Z

    .line 156
    .line 157
    xor-int/2addr v5, v1

    .line 158
    invoke-static {v5}, La/x0x;->K(Z)V

    .line 159
    .line 160
    .line 161
    :goto_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-ge v0, v5, :cond_6

    .line 166
    .line 167
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    check-cast v5, La/io30;

    .line 172
    .line 173
    invoke-virtual {v2, v5}, La/jo30;->e(La/io30;)V

    .line 174
    .line 175
    .line 176
    iget-object v6, v2, La/jo30;->h:Ljava/util/HashSet;

    .line 177
    .line 178
    invoke-virtual {v6, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    add-int/lit8 v0, v0, 0x1

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_6
    iput-boolean v1, v2, La/jo30;->l:Z

    .line 185
    .line 186
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 187
    .line 188
    invoke-virtual {p0, v3}, La/q9o0;->h(I)V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public final K(La/brd;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0, v1, v0, v1, v0}, La/dmo;->O(ZZZZ)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/dmo;->L()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, La/dmo;->f:La/xvj;

    .line 10
    .line 11
    iget-object v3, p0, La/dmo;->u:La/a4a0;

    .line 12
    .line 13
    iget-object v4, v2, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, La/wvj;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    iget v6, v5, La/wvj;->a:I

    .line 24
    .line 25
    sub-int/2addr v6, v1

    .line 26
    iput v6, v5, La/wvj;->a:I

    .line 27
    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, La/xvj;->c()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v3, v2, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const-wide/16 v3, -0x1

    .line 45
    .line 46
    iput-wide v3, v2, La/xvj;->o:J

    .line 47
    .line 48
    :cond_1
    iget-object v2, p0, La/dmo;->z:La/x24;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    iput-object v3, v2, La/x24;->c:La/dmo;

    .line 52
    .line 53
    invoke-virtual {v2}, La/x24;->a()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v0}, La/x24;->b(I)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, La/dmo;->d:La/syj;

    .line 60
    .line 61
    iget-object v2, v0, La/syj;->g:Ljava/lang/Thread;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v4, v0, La/syj;->g:Ljava/lang/Thread;

    .line 70
    .line 71
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    const-string v4, "DefaultTrackSelector is accessed on the wrong thread."

    .line 76
    .line 77
    invoke-static {v4, v2}, La/x0x;->J(Ljava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    :cond_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    const/16 v4, 0x20

    .line 83
    .line 84
    if-lt v2, v4, :cond_5

    .line 85
    .line 86
    iget-object v2, v0, La/syj;->h:La/o24;

    .line 87
    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    iget-object v4, v2, La/o24;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, Landroid/os/Handler;

    .line 93
    .line 94
    iget-object v5, v2, La/o24;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Landroid/media/Spatializer;

    .line 97
    .line 98
    if-eqz v5, :cond_4

    .line 99
    .line 100
    iget-object v2, v2, La/o24;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, La/lnk0;

    .line 103
    .line 104
    if-eqz v2, :cond_4

    .line 105
    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    invoke-static {v5, v2}, La/b7;->h(Landroid/media/Spatializer;La/lnk0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_0
    iput-object v3, v0, La/syj;->h:La/o24;

    .line 116
    .line 117
    :cond_5
    iput-object v3, v0, La/syj;->a:La/dmo;

    .line 118
    .line 119
    iput-object v3, v0, La/syj;->b:La/rsj;

    .line 120
    .line 121
    invoke-virtual {p0, v1}, La/dmo;->o0(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, La/dmo;->g:La/q9o0;

    .line 125
    .line 126
    invoke-virtual {v0}, La/q9o0;->f()V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, La/dmo;->h:La/sbx0;

    .line 130
    .line 131
    invoke-virtual {p0}, La/sbx0;->j()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, La/brd;->c()Z

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :catchall_0
    move-exception v0

    .line 139
    iget-object v1, p0, La/dmo;->g:La/q9o0;

    .line 140
    .line 141
    invoke-virtual {v1}, La/q9o0;->f()V

    .line 142
    .line 143
    .line 144
    iget-object p0, p0, La/dmo;->h:La/sbx0;

    .line 145
    .line 146
    invoke-virtual {p0}, La/sbx0;->j()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, La/brd;->c()Z

    .line 150
    .line 151
    .line 152
    throw v0
.end method

.method public final L()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, La/dmo;->a:[La/ujf0;

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge v1, v2, :cond_3

    .line 7
    .line 8
    iget-object v2, p0, La/dmo;->b:[La/j16;

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    iget-object v3, v2, La/j16;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v3

    .line 15
    const/4 v4, 0x0

    .line 16
    :try_start_0
    iput-object v4, v2, La/j16;->s:La/syj;

    .line 17
    .line 18
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iget-object v2, p0, La/dmo;->a:[La/ujf0;

    .line 20
    .line 21
    aget-object v2, v2, v1

    .line 22
    .line 23
    iget-object v3, v2, La/ujf0;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, La/j16;

    .line 26
    .line 27
    iget-byte v4, v3, La/j16;->h:B

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    move v4, v5

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v4, v0

    .line 35
    :goto_1
    invoke-static {v4}, La/x0x;->K(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, La/j16;->s()V

    .line 39
    .line 40
    .line 41
    iput-boolean v0, v2, La/ujf0;->a:Z

    .line 42
    .line 43
    iget-object v3, v2, La/ujf0;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, La/j16;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    iget-byte v4, v3, La/j16;->h:B

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    move v5, v0

    .line 55
    :goto_2
    invoke-static {v5}, La/x0x;->K(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, La/j16;->s()V

    .line 59
    .line 60
    .line 61
    iput-boolean v0, v2, La/ujf0;->b:Z

    .line 62
    .line 63
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw p0

    .line 69
    :cond_3
    return-void
.end method

.method public final M(IILa/itj0;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/dmo;->j1:La/amo;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, La/amo;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/dmo;->r:La/jo30;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    if-gt p1, p2, :cond_0

    .line 16
    .line 17
    iget-object v3, v0, La/jo30;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-gt p2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    invoke-static {v1}, La/x0x;->A(Z)V

    .line 28
    .line 29
    .line 30
    iput-object p3, v0, La/jo30;->k:La/itj0;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, La/jo30;->f(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, La/jo30;->b()La/bmq0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1, v2}, La/dmo;->u(La/bmq0;Z)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final N()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/dmo;->m:La/cwj;

    .line 4
    .line 5
    invoke-virtual {v1}, La/cwj;->d()La/zx90;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, La/zx90;->a:F

    .line 10
    .line 11
    iget-object v2, v0, La/dmo;->q:La/pn30;

    .line 12
    .line 13
    iget-object v3, v2, La/pn30;->i:La/nn30;

    .line 14
    .line 15
    invoke-virtual {v2}, La/pn30;->f()La/nn30;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v10, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v11, v3

    .line 22
    move v3, v10

    .line 23
    :goto_0
    if-eqz v11, :cond_14

    .line 24
    .line 25
    iget-boolean v5, v11, La/nn30;->e:Z

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto/16 :goto_d

    .line 30
    .line 31
    :cond_0
    iget-object v5, v0, La/dmo;->i1:La/yx90;

    .line 32
    .line 33
    iget-object v6, v5, La/yx90;->a:La/bmq0;

    .line 34
    .line 35
    iget-boolean v5, v5, La/yx90;->l:Z

    .line 36
    .line 37
    invoke-virtual {v11, v1, v6, v5}, La/nn30;->j(FLa/bmq0;Z)La/ucs0;

    .line 38
    .line 39
    .line 40
    move-result-object v12

    .line 41
    iget-object v5, v0, La/dmo;->q:La/pn30;

    .line 42
    .line 43
    iget-object v5, v5, La/pn30;->i:La/nn30;

    .line 44
    .line 45
    if-ne v11, v5, :cond_1

    .line 46
    .line 47
    move-object v14, v12

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v14, v4

    .line 50
    :goto_1
    iget-object v4, v11, La/nn30;->o:La/ucs0;

    .line 51
    .line 52
    iget-object v5, v12, La/ucs0;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, [La/fmo;

    .line 55
    .line 56
    iget-object v6, v4, La/ucs0;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, [La/fmo;

    .line 59
    .line 60
    array-length v6, v6

    .line 61
    array-length v7, v5

    .line 62
    const/4 v8, 0x0

    .line 63
    if-eq v6, v7, :cond_2

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_2
    move v6, v8

    .line 67
    :goto_2
    array-length v7, v5

    .line 68
    if-ge v6, v7, :cond_12

    .line 69
    .line 70
    invoke-virtual {v12, v4, v6}, La/ucs0;->o(La/ucs0;I)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_11

    .line 75
    .line 76
    :goto_3
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 77
    .line 78
    const/4 v2, 0x4

    .line 79
    if-eqz v3, :cond_d

    .line 80
    .line 81
    iget-object v13, v1, La/pn30;->i:La/nn30;

    .line 82
    .line 83
    invoke-virtual {v1, v13}, La/pn30;->s(La/nn30;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    and-int/2addr v1, v10

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    move/from16 v17, v10

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_3
    move/from16 v17, v8

    .line 94
    .line 95
    :goto_4
    iget-object v1, v0, La/dmo;->a:[La/ujf0;

    .line 96
    .line 97
    array-length v1, v1

    .line 98
    new-array v1, v1, [Z

    .line 99
    .line 100
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v3, v0, La/dmo;->i1:La/yx90;

    .line 104
    .line 105
    iget-wide v3, v3, La/yx90;->s:J

    .line 106
    .line 107
    move-object/from16 v18, v1

    .line 108
    .line 109
    move-wide v15, v3

    .line 110
    invoke-virtual/range {v13 .. v18}, La/nn30;->a(La/ucs0;JZ[Z)J

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 115
    .line 116
    iget v5, v1, La/yx90;->e:I

    .line 117
    .line 118
    if-eq v5, v2, :cond_4

    .line 119
    .line 120
    iget-wide v5, v1, La/yx90;->s:J

    .line 121
    .line 122
    cmp-long v1, v3, v5

    .line 123
    .line 124
    if-eqz v1, :cond_4

    .line 125
    .line 126
    move v1, v8

    .line 127
    move v8, v10

    .line 128
    goto :goto_5

    .line 129
    :cond_4
    move v1, v8

    .line 130
    :goto_5
    iget-object v5, v0, La/dmo;->i1:La/yx90;

    .line 131
    .line 132
    move v6, v1

    .line 133
    iget-object v1, v5, La/yx90;->b:La/vn30;

    .line 134
    .line 135
    iget-wide v11, v5, La/yx90;->c:J

    .line 136
    .line 137
    iget-wide v14, v5, La/yx90;->d:J

    .line 138
    .line 139
    const/4 v9, 0x5

    .line 140
    move-wide/from16 v19, v14

    .line 141
    .line 142
    move v14, v6

    .line 143
    move-wide/from16 v6, v19

    .line 144
    .line 145
    move v15, v2

    .line 146
    move-wide v2, v3

    .line 147
    move-wide v4, v11

    .line 148
    invoke-virtual/range {v0 .. v9}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iput-object v1, v0, La/dmo;->i1:La/yx90;

    .line 153
    .line 154
    if-eqz v8, :cond_5

    .line 155
    .line 156
    invoke-virtual {v0, v10, v2, v3}, La/dmo;->Q(ZJ)V

    .line 157
    .line 158
    .line 159
    :cond_5
    invoke-virtual {v0}, La/dmo;->g()V

    .line 160
    .line 161
    .line 162
    iget-object v1, v0, La/dmo;->a:[La/ujf0;

    .line 163
    .line 164
    array-length v1, v1

    .line 165
    new-array v1, v1, [Z

    .line 166
    .line 167
    move v8, v14

    .line 168
    :goto_6
    iget-object v2, v0, La/dmo;->a:[La/ujf0;

    .line 169
    .line 170
    array-length v3, v2

    .line 171
    if-ge v8, v3, :cond_b

    .line 172
    .line 173
    aget-object v2, v2, v8

    .line 174
    .line 175
    invoke-virtual {v2}, La/ujf0;->c()I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    iget-object v3, v0, La/dmo;->a:[La/ujf0;

    .line 180
    .line 181
    aget-object v3, v3, v8

    .line 182
    .line 183
    invoke-virtual {v3}, La/ujf0;->j()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    aput-boolean v3, v1, v8

    .line 188
    .line 189
    iget-object v3, v0, La/dmo;->a:[La/ujf0;

    .line 190
    .line 191
    aget-object v3, v3, v8

    .line 192
    .line 193
    iget-object v4, v13, La/nn30;->c:[La/ixg0;

    .line 194
    .line 195
    aget-object v4, v4, v8

    .line 196
    .line 197
    iget-object v5, v0, La/dmo;->m:La/cwj;

    .line 198
    .line 199
    iget-wide v6, v0, La/dmo;->x1:J

    .line 200
    .line 201
    aget-boolean v9, v18, v8

    .line 202
    .line 203
    iget-object v11, v3, La/ujf0;->e:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v11, La/j16;

    .line 206
    .line 207
    invoke-static {v11}, La/ujf0;->k(La/j16;)Z

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    if-eqz v12, :cond_7

    .line 212
    .line 213
    iget-object v12, v11, La/j16;->i:La/ixg0;

    .line 214
    .line 215
    if-eq v4, v12, :cond_6

    .line 216
    .line 217
    invoke-virtual {v3, v11, v5}, La/ujf0;->a(La/j16;La/cwj;)V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_6
    if-eqz v9, :cond_7

    .line 222
    .line 223
    invoke-virtual {v11, v6, v7, v14, v10}, La/j16;->B(JZZ)V

    .line 224
    .line 225
    .line 226
    :cond_7
    :goto_7
    iget-object v11, v3, La/ujf0;->f:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v11, La/j16;

    .line 229
    .line 230
    if-eqz v11, :cond_9

    .line 231
    .line 232
    invoke-static {v11}, La/ujf0;->k(La/j16;)Z

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    if-eqz v12, :cond_9

    .line 237
    .line 238
    iget-object v12, v11, La/j16;->i:La/ixg0;

    .line 239
    .line 240
    if-eq v4, v12, :cond_8

    .line 241
    .line 242
    invoke-virtual {v3, v11, v5}, La/ujf0;->a(La/j16;La/cwj;)V

    .line 243
    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_8
    if-eqz v9, :cond_9

    .line 247
    .line 248
    invoke-virtual {v11, v6, v7, v14, v10}, La/j16;->B(JZZ)V

    .line 249
    .line 250
    .line 251
    :cond_9
    :goto_8
    iget-object v3, v0, La/dmo;->a:[La/ujf0;

    .line 252
    .line 253
    aget-object v3, v3, v8

    .line 254
    .line 255
    invoke-virtual {v3}, La/ujf0;->c()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    sub-int v3, v2, v3

    .line 260
    .line 261
    if-lez v3, :cond_a

    .line 262
    .line 263
    invoke-virtual {v0, v8, v14}, La/dmo;->G(IZ)V

    .line 264
    .line 265
    .line 266
    :cond_a
    iget v3, v0, La/dmo;->v1:I

    .line 267
    .line 268
    iget-object v4, v0, La/dmo;->a:[La/ujf0;

    .line 269
    .line 270
    aget-object v4, v4, v8

    .line 271
    .line 272
    invoke-virtual {v4}, La/ujf0;->c()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    sub-int/2addr v2, v4

    .line 277
    sub-int/2addr v3, v2

    .line 278
    iput v3, v0, La/dmo;->v1:I

    .line 279
    .line 280
    add-int/lit8 v8, v8, 0x1

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_b
    iget-wide v2, v0, La/dmo;->x1:J

    .line 284
    .line 285
    invoke-virtual {v0, v1, v2, v3}, La/dmo;->k([ZJ)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v13}, La/dmo;->a0(La/nn30;)V

    .line 289
    .line 290
    .line 291
    :cond_c
    move v4, v15

    .line 292
    goto :goto_c

    .line 293
    :cond_d
    move v15, v2

    .line 294
    move v14, v8

    .line 295
    invoke-virtual {v1, v11}, La/pn30;->s(La/nn30;)I

    .line 296
    .line 297
    .line 298
    iget-boolean v1, v11, La/nn30;->e:Z

    .line 299
    .line 300
    if-eqz v1, :cond_c

    .line 301
    .line 302
    iget-object v1, v11, La/nn30;->g:La/on30;

    .line 303
    .line 304
    iget-wide v1, v1, La/on30;->b:J

    .line 305
    .line 306
    iget-wide v3, v0, La/dmo;->x1:J

    .line 307
    .line 308
    iget-wide v5, v11, La/nn30;->p:J

    .line 309
    .line 310
    sub-long/2addr v3, v5

    .line 311
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 312
    .line 313
    .line 314
    move-result-wide v1

    .line 315
    iget-boolean v3, v0, La/dmo;->y:Z

    .line 316
    .line 317
    if-eqz v3, :cond_10

    .line 318
    .line 319
    move v8, v14

    .line 320
    :goto_9
    iget-object v3, v0, La/dmo;->a:[La/ujf0;

    .line 321
    .line 322
    array-length v4, v3

    .line 323
    if-ge v8, v4, :cond_10

    .line 324
    .line 325
    iget-object v4, v0, La/dmo;->q:La/pn30;

    .line 326
    .line 327
    iget-object v4, v4, La/pn30;->k:[La/nn30;

    .line 328
    .line 329
    aget-object v4, v4, v8

    .line 330
    .line 331
    if-eq v4, v11, :cond_e

    .line 332
    .line 333
    goto :goto_a

    .line 334
    :cond_e
    aget-object v3, v3, v8

    .line 335
    .line 336
    invoke-virtual {v3, v11}, La/ujf0;->h(La/nn30;)Z

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    if-eqz v3, :cond_f

    .line 341
    .line 342
    invoke-virtual {v0}, La/dmo;->g()V

    .line 343
    .line 344
    .line 345
    goto :goto_b

    .line 346
    :cond_f
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_10
    :goto_b
    iget-object v3, v11, La/nn30;->j:[La/j16;

    .line 350
    .line 351
    array-length v3, v3

    .line 352
    new-array v3, v3, [Z

    .line 353
    .line 354
    move v4, v15

    .line 355
    const/4 v15, 0x0

    .line 356
    move-wide v13, v1

    .line 357
    move-object/from16 v16, v3

    .line 358
    .line 359
    invoke-virtual/range {v11 .. v16}, La/nn30;->a(La/ucs0;JZ[Z)J

    .line 360
    .line 361
    .line 362
    :goto_c
    invoke-virtual {v0, v10}, La/dmo;->t(Z)V

    .line 363
    .line 364
    .line 365
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 366
    .line 367
    iget v1, v1, La/yx90;->e:I

    .line 368
    .line 369
    if-eq v1, v4, :cond_14

    .line 370
    .line 371
    invoke-virtual {v0}, La/dmo;->C()V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0}, La/dmo;->B0()V

    .line 375
    .line 376
    .line 377
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 378
    .line 379
    const/4 v1, 0x2

    .line 380
    invoke-virtual {v0, v1}, La/q9o0;->h(I)V

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    :cond_11
    move-object v7, v12

    .line 385
    move-object v12, v14

    .line 386
    move v14, v8

    .line 387
    add-int/lit8 v6, v6, 0x1

    .line 388
    .line 389
    move-object v14, v12

    .line 390
    move-object v12, v7

    .line 391
    goto/16 :goto_2

    .line 392
    .line 393
    :cond_12
    move-object v12, v14

    .line 394
    move v14, v8

    .line 395
    if-ne v11, v2, :cond_13

    .line 396
    .line 397
    move v3, v14

    .line 398
    :cond_13
    iget-object v11, v11, La/nn30;->m:La/nn30;

    .line 399
    .line 400
    move-object v4, v12

    .line 401
    goto/16 :goto_0

    .line 402
    .line 403
    :cond_14
    :goto_d
    return-void
.end method

.method public final O(ZZZZ)V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "ExoPlayerImplInternal"

    .line 4
    .line 5
    iget-object v0, v1, La/dmo;->g:La/q9o0;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    invoke-virtual {v0, v3}, La/q9o0;->g(I)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iput-boolean v3, v1, La/dmo;->f1:Z

    .line 13
    .line 14
    iget-object v0, v1, La/dmo;->g1:La/cmo;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v1, La/dmo;->j1:La/amo;

    .line 21
    .line 22
    invoke-virtual {v0, v5}, La/amo;->c(I)V

    .line 23
    .line 24
    .line 25
    iput-object v4, v1, La/dmo;->g1:La/cmo;

    .line 26
    .line 27
    :cond_0
    iput-object v4, v1, La/dmo;->B1:La/dlo;

    .line 28
    .line 29
    invoke-virtual {v1, v3, v5}, La/dmo;->D0(ZZ)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, La/dmo;->m:La/cwj;

    .line 33
    .line 34
    iput-boolean v3, v0, La/cwj;->b:Z

    .line 35
    .line 36
    iget-object v0, v0, La/cwj;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, La/d4m0;

    .line 39
    .line 40
    iget-boolean v6, v0, La/d4m0;->b:Z

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, La/d4m0;->e()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    invoke-virtual {v0, v6, v7}, La/d4m0;->c(J)V

    .line 49
    .line 50
    .line 51
    iput-boolean v3, v0, La/d4m0;->b:Z

    .line 52
    .line 53
    :cond_1
    const-wide v6, 0xe8d4a51000L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    iput-wide v6, v1, La/dmo;->x1:J

    .line 59
    .line 60
    move v0, v3

    .line 61
    :goto_0
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    :try_start_0
    iget-object v8, v1, La/dmo;->a:[La/ujf0;

    .line 67
    .line 68
    array-length v8, v8

    .line 69
    if-ge v0, v8, :cond_2

    .line 70
    .line 71
    invoke-virtual {v1, v0}, La/dmo;->h(I)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    goto :goto_1

    .line 79
    :catch_1
    move-exception v0

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    iput-wide v6, v1, La/dmo;->E1:J
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch La/dlo; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_1
    const-string v8, "Disable failed."

    .line 85
    .line 86
    invoke-static {v2, v8, v0}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    if-eqz p1, :cond_3

    .line 90
    .line 91
    iget-object v8, v1, La/dmo;->a:[La/ujf0;

    .line 92
    .line 93
    array-length v9, v8

    .line 94
    move v10, v3

    .line 95
    :goto_3
    if-ge v10, v9, :cond_3

    .line 96
    .line 97
    aget-object v0, v8, v10

    .line 98
    .line 99
    :try_start_1
    invoke-virtual {v0}, La/ujf0;->n()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :catch_2
    move-exception v0

    .line 104
    const-string v11, "Reset failed."

    .line 105
    .line 106
    invoke-static {v2, v11, v0}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    iput v3, v1, La/dmo;->v1:I

    .line 113
    .line 114
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 115
    .line 116
    iget-object v2, v0, La/yx90;->b:La/vn30;

    .line 117
    .line 118
    iget-wide v8, v0, La/yx90;->s:J

    .line 119
    .line 120
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 121
    .line 122
    iget-object v0, v0, La/yx90;->b:La/vn30;

    .line 123
    .line 124
    invoke-virtual {v0}, La/vn30;->c()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_5

    .line 129
    .line 130
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 131
    .line 132
    iget-object v10, v1, La/dmo;->k:La/amq0;

    .line 133
    .line 134
    iget-object v11, v0, La/yx90;->b:La/vn30;

    .line 135
    .line 136
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 137
    .line 138
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-nez v12, :cond_5

    .line 143
    .line 144
    iget-object v11, v11, La/vn30;->a:Ljava/lang/Object;

    .line 145
    .line 146
    invoke-virtual {v0, v11, v10}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iget-boolean v0, v0, La/amq0;->f:Z

    .line 151
    .line 152
    if-eqz v0, :cond_4

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_4
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 156
    .line 157
    iget-wide v10, v0, La/yx90;->s:J

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_5
    :goto_5
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 161
    .line 162
    iget-wide v10, v0, La/yx90;->c:J

    .line 163
    .line 164
    :goto_6
    if-eqz p2, :cond_7

    .line 165
    .line 166
    iput-object v4, v1, La/dmo;->w1:La/cmo;

    .line 167
    .line 168
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 169
    .line 170
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 171
    .line 172
    invoke-virtual {v1, v0}, La/dmo;->m(La/bmq0;)Landroid/util/Pair;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, La/vn30;

    .line 179
    .line 180
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Ljava/lang/Long;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 185
    .line 186
    .line 187
    move-result-wide v8

    .line 188
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 189
    .line 190
    iget-object v0, v0, La/yx90;->b:La/vn30;

    .line 191
    .line 192
    invoke-virtual {v2, v0}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_6

    .line 197
    .line 198
    :goto_7
    move-wide v11, v8

    .line 199
    move-wide v9, v6

    .line 200
    goto :goto_8

    .line 201
    :cond_6
    move v5, v3

    .line 202
    goto :goto_7

    .line 203
    :cond_7
    move-wide/from16 v33, v10

    .line 204
    .line 205
    move-wide v11, v8

    .line 206
    move-wide/from16 v9, v33

    .line 207
    .line 208
    move v5, v3

    .line 209
    :goto_8
    iget-object v0, v1, La/dmo;->q:La/pn30;

    .line 210
    .line 211
    invoke-virtual {v0}, La/pn30;->b()V

    .line 212
    .line 213
    .line 214
    iput-boolean v3, v1, La/dmo;->p1:Z

    .line 215
    .line 216
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 217
    .line 218
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 219
    .line 220
    if-eqz p3, :cond_a

    .line 221
    .line 222
    instance-of v6, v0, La/wna0;

    .line 223
    .line 224
    if-eqz v6, :cond_a

    .line 225
    .line 226
    check-cast v0, La/wna0;

    .line 227
    .line 228
    iget-object v6, v1, La/dmo;->r:La/jo30;

    .line 229
    .line 230
    iget-object v6, v6, La/jo30;->k:La/itj0;

    .line 231
    .line 232
    iget-object v7, v0, La/wna0;->h:[La/bmq0;

    .line 233
    .line 234
    array-length v8, v7

    .line 235
    new-array v8, v8, [La/bmq0;

    .line 236
    .line 237
    move v13, v3

    .line 238
    :goto_9
    array-length v14, v7

    .line 239
    if-ge v13, v14, :cond_8

    .line 240
    .line 241
    new-instance v14, La/vna0;

    .line 242
    .line 243
    aget-object v15, v7, v13

    .line 244
    .line 245
    invoke-direct {v14, v15}, La/vna0;-><init>(La/bmq0;)V

    .line 246
    .line 247
    .line 248
    aput-object v14, v8, v13

    .line 249
    .line 250
    add-int/lit8 v13, v13, 0x1

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_8
    new-instance v7, La/wna0;

    .line 254
    .line 255
    iget-object v0, v0, La/wna0;->i:[Ljava/lang/Object;

    .line 256
    .line 257
    invoke-direct {v7, v8, v0, v6}, La/wna0;-><init>([La/bmq0;[Ljava/lang/Object;La/itj0;)V

    .line 258
    .line 259
    .line 260
    iget v0, v2, La/vn30;->b:I

    .line 261
    .line 262
    const/4 v6, -0x1

    .line 263
    if-eq v0, v6, :cond_9

    .line 264
    .line 265
    iget-object v0, v2, La/vn30;->a:Ljava/lang/Object;

    .line 266
    .line 267
    iget-object v6, v1, La/dmo;->k:La/amq0;

    .line 268
    .line 269
    invoke-virtual {v7, v0, v6}, La/wna0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 270
    .line 271
    .line 272
    iget-object v0, v1, La/dmo;->k:La/amq0;

    .line 273
    .line 274
    iget v0, v0, La/amq0;->c:I

    .line 275
    .line 276
    iget-object v6, v1, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 277
    .line 278
    const-wide/16 v13, 0x0

    .line 279
    .line 280
    invoke-virtual {v7, v0, v6, v13, v14}, La/wna0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6}, Landroidx/media3/common/Timeline$Window;->a()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_9

    .line 288
    .line 289
    new-instance v0, La/vn30;

    .line 290
    .line 291
    iget-object v6, v2, La/vn30;->a:Ljava/lang/Object;

    .line 292
    .line 293
    iget-wide v13, v2, La/vn30;->d:J

    .line 294
    .line 295
    invoke-direct {v0, v6, v13, v14}, La/vn30;-><init>(Ljava/lang/Object;J)V

    .line 296
    .line 297
    .line 298
    move-object v8, v0

    .line 299
    goto :goto_b

    .line 300
    :cond_9
    :goto_a
    move-object v8, v2

    .line 301
    goto :goto_b

    .line 302
    :cond_a
    move-object v7, v0

    .line 303
    goto :goto_a

    .line 304
    :goto_b
    new-instance v6, La/yx90;

    .line 305
    .line 306
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 307
    .line 308
    iget v13, v0, La/yx90;->e:I

    .line 309
    .line 310
    if-eqz p4, :cond_b

    .line 311
    .line 312
    move-object v14, v4

    .line 313
    goto :goto_c

    .line 314
    :cond_b
    iget-object v2, v0, La/yx90;->f:La/dlo;

    .line 315
    .line 316
    move-object v14, v2

    .line 317
    :goto_c
    if-eqz v5, :cond_c

    .line 318
    .line 319
    sget-object v2, La/dcs0;->d:La/dcs0;

    .line 320
    .line 321
    :goto_d
    move-object/from16 v16, v2

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_c
    iget-object v2, v0, La/yx90;->h:La/dcs0;

    .line 325
    .line 326
    goto :goto_d

    .line 327
    :goto_e
    if-eqz v5, :cond_d

    .line 328
    .line 329
    iget-object v2, v1, La/dmo;->e:La/ucs0;

    .line 330
    .line 331
    :goto_f
    move-object/from16 v17, v2

    .line 332
    .line 333
    goto :goto_10

    .line 334
    :cond_d
    iget-object v2, v0, La/yx90;->i:La/ucs0;

    .line 335
    .line 336
    goto :goto_f

    .line 337
    :goto_10
    if-eqz v5, :cond_e

    .line 338
    .line 339
    sget-object v2, La/b4x;->b:La/v3x;

    .line 340
    .line 341
    sget-object v2, La/rcf0;->e:La/rcf0;

    .line 342
    .line 343
    :goto_11
    move-object/from16 v18, v2

    .line 344
    .line 345
    goto :goto_12

    .line 346
    :cond_e
    iget-object v2, v0, La/yx90;->j:Ljava/util/List;

    .line 347
    .line 348
    goto :goto_11

    .line 349
    :goto_12
    iget-boolean v2, v0, La/yx90;->l:Z

    .line 350
    .line 351
    iget v5, v0, La/yx90;->m:I

    .line 352
    .line 353
    iget v15, v0, La/yx90;->n:I

    .line 354
    .line 355
    iget-object v0, v0, La/yx90;->o:La/zx90;

    .line 356
    .line 357
    const-wide/16 v30, 0x0

    .line 358
    .line 359
    const/16 v32, 0x0

    .line 360
    .line 361
    move/from16 v22, v15

    .line 362
    .line 363
    const/4 v15, 0x0

    .line 364
    const-wide/16 v26, 0x0

    .line 365
    .line 366
    move-object/from16 v19, v8

    .line 367
    .line 368
    move-wide/from16 v24, v11

    .line 369
    .line 370
    move-wide/from16 v28, v11

    .line 371
    .line 372
    move-object/from16 v23, v0

    .line 373
    .line 374
    move/from16 v20, v2

    .line 375
    .line 376
    move/from16 v21, v5

    .line 377
    .line 378
    invoke-direct/range {v6 .. v32}, La/yx90;-><init>(La/bmq0;La/vn30;JJILa/dlo;ZLa/dcs0;La/ucs0;Ljava/util/List;La/vn30;ZIILa/zx90;JJJJZ)V

    .line 379
    .line 380
    .line 381
    iput-object v6, v1, La/dmo;->i1:La/yx90;

    .line 382
    .line 383
    if-eqz p3, :cond_12

    .line 384
    .line 385
    iget-object v0, v1, La/dmo;->q:La/pn30;

    .line 386
    .line 387
    iget-object v2, v0, La/pn30;->q:Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-nez v2, :cond_10

    .line 394
    .line 395
    new-instance v2, Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 398
    .line 399
    .line 400
    move v5, v3

    .line 401
    :goto_13
    iget-object v6, v0, La/pn30;->q:Ljava/util/ArrayList;

    .line 402
    .line 403
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-ge v5, v6, :cond_f

    .line 408
    .line 409
    iget-object v6, v0, La/pn30;->q:Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    check-cast v6, La/nn30;

    .line 416
    .line 417
    invoke-virtual {v6}, La/nn30;->i()V

    .line 418
    .line 419
    .line 420
    add-int/lit8 v5, v5, 0x1

    .line 421
    .line 422
    goto :goto_13

    .line 423
    :cond_f
    iput-object v2, v0, La/pn30;->q:Ljava/util/ArrayList;

    .line 424
    .line 425
    iput-object v4, v0, La/pn30;->m:La/nn30;

    .line 426
    .line 427
    invoke-virtual {v0}, La/pn30;->p()V

    .line 428
    .line 429
    .line 430
    :cond_10
    iget-object v1, v1, La/dmo;->r:La/jo30;

    .line 431
    .line 432
    iget-object v2, v1, La/jo30;->g:Ljava/util/HashMap;

    .line 433
    .line 434
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    if-eqz v0, :cond_11

    .line 447
    .line 448
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    move-object v5, v0

    .line 453
    check-cast v5, La/ho30;

    .line 454
    .line 455
    :try_start_2
    iget-object v0, v5, La/ho30;->a:La/e06;

    .line 456
    .line 457
    iget-object v6, v5, La/ho30;->b:La/do30;

    .line 458
    .line 459
    invoke-virtual {v0, v6}, La/e06;->n(La/wn30;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 460
    .line 461
    .line 462
    goto :goto_15

    .line 463
    :catch_3
    move-exception v0

    .line 464
    const-string v6, "MediaSourceList"

    .line 465
    .line 466
    const-string v7, "Failed to release child source."

    .line 467
    .line 468
    invoke-static {v6, v7, v0}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 469
    .line 470
    .line 471
    :goto_15
    iget-object v0, v5, La/ho30;->a:La/e06;

    .line 472
    .line 473
    iget-object v6, v5, La/ho30;->c:La/go30;

    .line 474
    .line 475
    invoke-virtual {v0, v6}, La/e06;->q(La/bo30;)V

    .line 476
    .line 477
    .line 478
    iget-object v0, v5, La/ho30;->a:La/e06;

    .line 479
    .line 480
    invoke-virtual {v0, v6}, La/e06;->p(La/ail;)V

    .line 481
    .line 482
    .line 483
    goto :goto_14

    .line 484
    :cond_11
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 485
    .line 486
    .line 487
    iget-object v0, v1, La/jo30;->h:Ljava/util/HashSet;

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 490
    .line 491
    .line 492
    iput-boolean v3, v1, La/jo30;->l:Z

    .line 493
    .line 494
    :cond_12
    return-void
.end method

.method public final P()V
    .locals 1

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v0, v0, La/pn30;->i:La/nn30;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, La/nn30;->g:La/on30;

    .line 8
    .line 9
    iget-boolean v0, v0, La/on30;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, La/dmo;->l1:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-boolean v0, p0, La/dmo;->m1:Z

    .line 21
    .line 22
    return-void
.end method

.method public final Q(ZJ)V
    .locals 7

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v1, v0, La/pn30;->i:La/nn30;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-wide v2, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    add-long/2addr p2, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v2, v1, La/nn30;->p:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p2, p0, La/dmo;->x1:J

    .line 18
    .line 19
    iget-object v2, p0, La/dmo;->m:La/cwj;

    .line 20
    .line 21
    iget-object v2, v2, La/cwj;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, La/d4m0;

    .line 24
    .line 25
    invoke-virtual {v2, p2, p3}, La/d4m0;->c(J)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, La/dmo;->a:[La/ujf0;

    .line 29
    .line 30
    array-length p3, p2

    .line 31
    const/4 v2, 0x0

    .line 32
    move v3, v2

    .line 33
    :goto_2
    if-ge v3, p3, :cond_2

    .line 34
    .line 35
    aget-object v4, p2, v3

    .line 36
    .line 37
    iget-wide v5, p0, La/dmo;->x1:J

    .line 38
    .line 39
    invoke-virtual {v4, v1}, La/ujf0;->d(La/nn30;)La/j16;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, v5, v6, v2, p1}, La/j16;->B(JZZ)V

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iget-object p0, v0, La/pn30;->i:La/nn30;

    .line 52
    .line 53
    :goto_3
    if-eqz p0, :cond_5

    .line 54
    .line 55
    iget-object p1, p0, La/nn30;->o:La/ucs0;

    .line 56
    .line 57
    iget-object p1, p1, La/ucs0;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, [La/fmo;

    .line 60
    .line 61
    array-length p2, p1

    .line 62
    move p3, v2

    .line 63
    :goto_4
    if-ge p3, p2, :cond_4

    .line 64
    .line 65
    aget-object v0, p1, p3

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-interface {v0}, La/fmo;->k()V

    .line 70
    .line 71
    .line 72
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    iget-object p0, p0, La/nn30;->m:La/nn30;

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    return-void
.end method

.method public final R(La/bmq0;La/bmq0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, La/bmq0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, La/bmq0;->p()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, La/dmo;->n:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    if-gez p1, :cond_1

    .line 23
    .line 24
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, La/rw2;->w(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0
.end method

.method public final U(J)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, La/dmo;->v:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-boolean v1, v0, La/dmo;->Z:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, La/dmo;->Y:La/uch0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 21
    :goto_1
    iget-object v3, v0, La/dmo;->i1:La/yx90;

    .line 22
    .line 23
    const-wide/16 v4, 0x3e8

    .line 24
    .line 25
    const/4 v6, 0x3

    .line 26
    sget-wide v7, La/dmo;->H1:J

    .line 27
    .line 28
    if-eqz v1, :cond_7

    .line 29
    .line 30
    iget v1, v3, La/yx90;->e:I

    .line 31
    .line 32
    if-ne v1, v6, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-wide v4, v7

    .line 36
    :goto_2
    iget-object v1, v0, La/dmo;->a:[La/ujf0;

    .line 37
    .line 38
    array-length v3, v1

    .line 39
    :goto_3
    if-ge v2, v3, :cond_5

    .line 40
    .line 41
    aget-object v6, v1, v2

    .line 42
    .line 43
    iget-wide v9, v0, La/dmo;->x1:J

    .line 44
    .line 45
    iget-wide v11, v0, La/dmo;->y1:J

    .line 46
    .line 47
    iget-object v13, v6, La/ujf0;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v13, La/j16;

    .line 50
    .line 51
    iget-object v6, v6, La/ujf0;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, La/j16;

    .line 54
    .line 55
    invoke-static {v6}, La/ujf0;->k(La/j16;)Z

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    if-eqz v14, :cond_3

    .line 60
    .line 61
    invoke-virtual {v6, v9, v10, v11, v12}, La/j16;->i(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide v14

    .line 65
    goto :goto_4

    .line 66
    :cond_3
    const-wide v14, 0x7fffffffffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    :goto_4
    if-eqz v13, :cond_4

    .line 72
    .line 73
    iget-byte v6, v13, La/j16;->h:B

    .line 74
    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    invoke-virtual {v13, v9, v10, v11, v12}, La/j16;->i(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v9

    .line 81
    invoke-static {v14, v15, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v14

    .line 85
    :cond_4
    invoke-static {v14, v15}, La/vtt0;->Y(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 97
    .line 98
    invoke-virtual {v1}, La/yx90;->m()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_9

    .line 103
    .line 104
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 105
    .line 106
    iget-object v1, v1, La/pn30;->i:La/nn30;

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    iget-object v1, v1, La/nn30;->m:La/nn30;

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_6
    const/4 v1, 0x0

    .line 114
    :goto_5
    if-eqz v1, :cond_9

    .line 115
    .line 116
    iget-wide v2, v0, La/dmo;->x1:J

    .line 117
    .line 118
    long-to-float v2, v2

    .line 119
    invoke-static {v4, v5}, La/vtt0;->M(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v9

    .line 123
    long-to-float v3, v9

    .line 124
    iget-object v6, v0, La/dmo;->i1:La/yx90;

    .line 125
    .line 126
    iget-object v6, v6, La/yx90;->o:La/zx90;

    .line 127
    .line 128
    iget v6, v6, La/zx90;->a:F

    .line 129
    .line 130
    mul-float/2addr v3, v6

    .line 131
    add-float/2addr v3, v2

    .line 132
    invoke-virtual {v1}, La/nn30;->e()J

    .line 133
    .line 134
    .line 135
    move-result-wide v1

    .line 136
    long-to-float v1, v1

    .line 137
    cmpl-float v1, v3, v1

    .line 138
    .line 139
    if-ltz v1, :cond_9

    .line 140
    .line 141
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 142
    .line 143
    .line 144
    move-result-wide v4

    .line 145
    goto :goto_6

    .line 146
    :cond_7
    iget v1, v3, La/yx90;->e:I

    .line 147
    .line 148
    if-ne v1, v6, :cond_8

    .line 149
    .line 150
    invoke-virtual {v0}, La/dmo;->s0()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_8

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_8
    move-wide v4, v7

    .line 158
    :cond_9
    :goto_6
    add-long v1, p1, v4

    .line 159
    .line 160
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 161
    .line 162
    iget-object v0, v0, La/q9o0;->a:Landroid/os/Handler;

    .line 163
    .line 164
    const/4 v3, 0x2

    .line 165
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final V(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v0, v0, La/pn30;->i:La/nn30;

    .line 4
    .line 5
    iget-object v0, v0, La/nn30;->g:La/on30;

    .line 6
    .line 7
    iget-object v2, v0, La/on30;->a:La/vn30;

    .line 8
    .line 9
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 10
    .line 11
    iget-wide v3, v0, La/yx90;->s:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-virtual/range {v1 .. v6}, La/dmo;->X(La/vn30;JZZ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-object p0, v1, La/dmo;->i1:La/yx90;

    .line 21
    .line 22
    iget-wide v5, p0, La/yx90;->s:J

    .line 23
    .line 24
    cmp-long p0, v3, v5

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    iget-object p0, v1, La/dmo;->i1:La/yx90;

    .line 29
    .line 30
    iget-wide v5, p0, La/yx90;->c:J

    .line 31
    .line 32
    iget-wide v7, p0, La/yx90;->d:J

    .line 33
    .line 34
    const/4 v10, 0x5

    .line 35
    move v9, p1

    .line 36
    invoke-virtual/range {v1 .. v10}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iput-object p0, v1, La/dmo;->i1:La/yx90;

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final W(La/cmo;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-boolean v0, v1, La/dmo;->f1:Z

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v1, La/dmo;->g1:La/cmo;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v0, v1, La/dmo;->h1:I

    .line 15
    .line 16
    add-int/2addr v0, v9

    .line 17
    iput v0, v1, La/dmo;->h1:I

    .line 18
    .line 19
    iget-object v0, v1, La/dmo;->j1:La/amo;

    .line 20
    .line 21
    invoke-virtual {v0, v9}, La/amo;->c(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iput-object v3, v1, La/dmo;->g1:La/cmo;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v0, v1, La/dmo;->j1:La/amo;

    .line 28
    .line 29
    invoke-virtual {v0, v9}, La/amo;->c(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 33
    .line 34
    iget-object v2, v0, La/yx90;->a:La/bmq0;

    .line 35
    .line 36
    iget v5, v1, La/dmo;->q1:I

    .line 37
    .line 38
    iget-boolean v6, v1, La/dmo;->r1:Z

    .line 39
    .line 40
    iget-object v7, v1, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 41
    .line 42
    iget-object v8, v1, La/dmo;->k:La/amq0;

    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-static/range {v2 .. v8}, La/dmo;->S(La/bmq0;La/cmo;ZIZLandroidx/media3/common/Timeline$Window;La/amq0;)Landroid/util/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-wide/16 v4, 0x0

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    iget-object v2, v1, La/dmo;->i1:La/yx90;

    .line 60
    .line 61
    iget-object v2, v2, La/yx90;->a:La/bmq0;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, La/dmo;->m(La/bmq0;)Landroid/util/Pair;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget-object v6, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v6, La/vn30;

    .line 70
    .line 71
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v12

    .line 79
    iget-object v2, v1, La/dmo;->i1:La/yx90;

    .line 80
    .line 81
    iget-object v2, v2, La/yx90;->a:La/bmq0;

    .line 82
    .line 83
    invoke-virtual {v2}, La/bmq0;->p()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    xor-int/2addr v2, v9

    .line 88
    move-wide v14, v10

    .line 89
    goto/16 :goto_2

    .line 90
    .line 91
    :cond_2
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v6, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v6, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v18

    .line 101
    iget-wide v12, v3, La/cmo;->c:J

    .line 102
    .line 103
    cmp-long v6, v12, v10

    .line 104
    .line 105
    if-nez v6, :cond_3

    .line 106
    .line 107
    move-wide v12, v10

    .line 108
    goto :goto_0

    .line 109
    :cond_3
    move-wide/from16 v12, v18

    .line 110
    .line 111
    :goto_0
    iget-object v14, v1, La/dmo;->q:La/pn30;

    .line 112
    .line 113
    iget-object v15, v1, La/dmo;->i1:La/yx90;

    .line 114
    .line 115
    iget-object v6, v15, La/yx90;->a:La/bmq0;

    .line 116
    .line 117
    const/16 v20, 0x1

    .line 118
    .line 119
    const/16 v21, 0x0

    .line 120
    .line 121
    move-object/from16 v17, v2

    .line 122
    .line 123
    move-object/from16 v16, v6

    .line 124
    .line 125
    invoke-virtual/range {v14 .. v21}, La/pn30;->u(La/yx90;La/bmq0;Ljava/lang/Object;JZZ)La/vn30;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v6}, La/vn30;->c()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    iget-object v2, v1, La/dmo;->i1:La/yx90;

    .line 136
    .line 137
    iget-object v2, v2, La/yx90;->a:La/bmq0;

    .line 138
    .line 139
    iget-object v8, v6, La/vn30;->a:Ljava/lang/Object;

    .line 140
    .line 141
    iget-object v14, v1, La/dmo;->k:La/amq0;

    .line 142
    .line 143
    invoke-virtual {v2, v8, v14}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 144
    .line 145
    .line 146
    iget-object v2, v1, La/dmo;->k:La/amq0;

    .line 147
    .line 148
    iget v8, v6, La/vn30;->b:I

    .line 149
    .line 150
    invoke-virtual {v2, v8}, La/amq0;->e(I)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iget v8, v6, La/vn30;->c:I

    .line 155
    .line 156
    if-ne v2, v8, :cond_4

    .line 157
    .line 158
    iget-object v2, v1, La/dmo;->k:La/amq0;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    sget-object v2, La/uo;->c:La/uo;

    .line 164
    .line 165
    :cond_4
    iget-object v2, v1, La/dmo;->k:La/amq0;

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v2, La/uo;->c:La/uo;

    .line 171
    .line 172
    iget v8, v6, La/vn30;->b:I

    .line 173
    .line 174
    invoke-virtual {v2, v8}, La/uo;->a(I)La/so;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {v12, v13, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 182
    .line 183
    .line 184
    move-result-wide v12

    .line 185
    move v2, v9

    .line 186
    move-wide v14, v12

    .line 187
    move-wide v12, v4

    .line 188
    goto :goto_2

    .line 189
    :cond_5
    iget-wide v14, v3, La/cmo;->c:J

    .line 190
    .line 191
    cmp-long v2, v14, v10

    .line 192
    .line 193
    if-nez v2, :cond_6

    .line 194
    .line 195
    move v2, v9

    .line 196
    goto :goto_1

    .line 197
    :cond_6
    move v2, v7

    .line 198
    :goto_1
    move-wide v14, v12

    .line 199
    move-wide/from16 v12, v18

    .line 200
    .line 201
    :goto_2
    :try_start_0
    iget-object v8, v1, La/dmo;->i1:La/yx90;

    .line 202
    .line 203
    iget-object v8, v8, La/yx90;->a:La/bmq0;

    .line 204
    .line 205
    invoke-virtual {v8}, La/bmq0;->p()Z

    .line 206
    .line 207
    .line 208
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 209
    if-eqz v8, :cond_7

    .line 210
    .line 211
    :try_start_1
    iput-object v3, v1, La/dmo;->w1:La/cmo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :catchall_0
    move-exception v0

    .line 215
    move v9, v2

    .line 216
    move-object v2, v6

    .line 217
    move-wide v3, v12

    .line 218
    move-wide v5, v14

    .line 219
    goto/16 :goto_f

    .line 220
    .line 221
    :cond_7
    iget-object v3, v1, La/dmo;->i1:La/yx90;

    .line 222
    .line 223
    const/4 v8, 0x4

    .line 224
    if-nez v0, :cond_9

    .line 225
    .line 226
    :try_start_2
    iget v0, v3, La/yx90;->e:I

    .line 227
    .line 228
    if-eq v0, v9, :cond_8

    .line 229
    .line 230
    invoke-virtual {v1, v8}, La/dmo;->o0(I)V

    .line 231
    .line 232
    .line 233
    :cond_8
    invoke-virtual {v1, v7, v9, v7, v9}, La/dmo;->O(ZZZZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 234
    .line 235
    .line 236
    :goto_3
    move v9, v2

    .line 237
    move-object v2, v6

    .line 238
    move-wide v3, v12

    .line 239
    move-wide v5, v14

    .line 240
    goto/16 :goto_c

    .line 241
    .line 242
    :cond_9
    :try_start_3
    iget-object v0, v3, La/yx90;->b:La/vn30;

    .line 243
    .line 244
    invoke-virtual {v6, v0}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 248
    if-eqz v0, :cond_e

    .line 249
    .line 250
    :try_start_4
    iget-object v0, v1, La/dmo;->q:La/pn30;

    .line 251
    .line 252
    iget-object v0, v0, La/pn30;->i:La/nn30;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 253
    .line 254
    if-eqz v0, :cond_b

    .line 255
    .line 256
    :try_start_5
    iget-boolean v3, v0, La/nn30;->e:Z

    .line 257
    .line 258
    if-eqz v3, :cond_b

    .line 259
    .line 260
    cmp-long v3, v12, v4

    .line 261
    .line 262
    if-eqz v3, :cond_b

    .line 263
    .line 264
    iget-object v0, v0, La/nn30;->a:La/f930;

    .line 265
    .line 266
    iget-object v3, v1, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 267
    .line 268
    iget-wide v3, v3, Landroidx/media3/common/Timeline$Window;->l:J

    .line 269
    .line 270
    iget-boolean v5, v1, La/dmo;->Z:Z

    .line 271
    .line 272
    if-eqz v5, :cond_a

    .line 273
    .line 274
    cmp-long v3, v3, v10

    .line 275
    .line 276
    if-eqz v3, :cond_a

    .line 277
    .line 278
    iget-object v3, v1, La/dmo;->Y:La/uch0;

    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    :cond_a
    iget-object v3, v1, La/dmo;->B:La/gvh0;

    .line 284
    .line 285
    invoke-virtual {v0, v12, v13, v3}, La/f930;->c(JLa/gvh0;)J

    .line 286
    .line 287
    .line 288
    move-result-wide v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 289
    goto :goto_4

    .line 290
    :cond_b
    move-wide v3, v12

    .line 291
    :goto_4
    :try_start_6
    invoke-static {v3, v4}, La/vtt0;->Y(J)J

    .line 292
    .line 293
    .line 294
    move-result-wide v10

    .line 295
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 296
    .line 297
    move-wide/from16 v17, v10

    .line 298
    .line 299
    iget-wide v9, v0, La/yx90;->s:J

    .line 300
    .line 301
    invoke-static {v9, v10}, La/vtt0;->Y(J)J

    .line 302
    .line 303
    .line 304
    move-result-wide v9

    .line 305
    cmp-long v0, v17, v9

    .line 306
    .line 307
    if-nez v0, :cond_c

    .line 308
    .line 309
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 310
    .line 311
    iget v5, v0, La/yx90;->e:I

    .line 312
    .line 313
    const/4 v9, 0x2

    .line 314
    if-eq v5, v9, :cond_d

    .line 315
    .line 316
    const/4 v9, 0x3

    .line 317
    if-ne v5, v9, :cond_c

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_c
    move v9, v2

    .line 321
    move-object v2, v6

    .line 322
    move-wide v10, v14

    .line 323
    goto :goto_9

    .line 324
    :cond_d
    :goto_5
    iget-wide v3, v0, La/yx90;->s:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 325
    .line 326
    const/4 v10, 0x2

    .line 327
    move-wide v7, v3

    .line 328
    move v9, v2

    .line 329
    move-object v2, v6

    .line 330
    move-wide v5, v14

    .line 331
    :goto_6
    invoke-virtual/range {v1 .. v10}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    iput-object v0, v1, La/dmo;->i1:La/yx90;

    .line 336
    .line 337
    return-void

    .line 338
    :catchall_1
    move-exception v0

    .line 339
    move v9, v2

    .line 340
    move-object v2, v6

    .line 341
    move-wide v10, v14

    .line 342
    :goto_7
    move-wide v5, v10

    .line 343
    :goto_8
    move-wide v3, v12

    .line 344
    goto/16 :goto_f

    .line 345
    .line 346
    :cond_e
    move v9, v2

    .line 347
    move-object v2, v6

    .line 348
    move-wide v10, v14

    .line 349
    move-wide v3, v12

    .line 350
    :goto_9
    :try_start_7
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 351
    .line 352
    iget v0, v0, La/yx90;->e:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 353
    .line 354
    if-ne v0, v8, :cond_f

    .line 355
    .line 356
    const/4 v6, 0x1

    .line 357
    goto :goto_a

    .line 358
    :cond_f
    move v6, v7

    .line 359
    :goto_a
    :try_start_8
    invoke-virtual {v1}, La/dmo;->z()Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    invoke-virtual/range {v1 .. v6}, La/dmo;->X(La/vn30;JZZ)J

    .line 364
    .line 365
    .line 366
    move-result-wide v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 367
    cmp-long v0, v12, v14

    .line 368
    .line 369
    if-eqz v0, :cond_10

    .line 370
    .line 371
    const/16 v16, 0x1

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_10
    move/from16 v16, v7

    .line 375
    .line 376
    :goto_b
    or-int v9, v9, v16

    .line 377
    .line 378
    :try_start_9
    iget-object v0, v1, La/dmo;->i1:La/yx90;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 379
    .line 380
    move-object v3, v2

    .line 381
    :try_start_a
    iget-object v2, v0, La/yx90;->a:La/bmq0;

    .line 382
    .line 383
    iget-object v5, v0, La/yx90;->b:La/vn30;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 384
    .line 385
    const/4 v8, 0x1

    .line 386
    move-object v4, v2

    .line 387
    move-wide v6, v10

    .line 388
    :try_start_b
    invoke-virtual/range {v1 .. v8}, La/dmo;->C0(La/bmq0;La/vn30;La/bmq0;La/vn30;JZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 389
    .line 390
    .line 391
    move-object v2, v3

    .line 392
    move-wide v5, v6

    .line 393
    move-wide v3, v14

    .line 394
    :goto_c
    const/4 v10, 0x2

    .line 395
    move-wide v7, v3

    .line 396
    move-object/from16 v1, p0

    .line 397
    .line 398
    goto :goto_6

    .line 399
    :catchall_2
    move-exception v0

    .line 400
    move-object v2, v3

    .line 401
    move-wide v5, v6

    .line 402
    :goto_d
    move-wide v3, v14

    .line 403
    goto :goto_f

    .line 404
    :catchall_3
    move-exception v0

    .line 405
    move-object v2, v3

    .line 406
    :goto_e
    move-wide v5, v10

    .line 407
    goto :goto_d

    .line 408
    :catchall_4
    move-exception v0

    .line 409
    goto :goto_e

    .line 410
    :catchall_5
    move-exception v0

    .line 411
    goto :goto_7

    .line 412
    :catchall_6
    move-exception v0

    .line 413
    goto :goto_7

    .line 414
    :catchall_7
    move-exception v0

    .line 415
    move v9, v2

    .line 416
    move-object v2, v6

    .line 417
    move-wide v5, v14

    .line 418
    goto :goto_8

    .line 419
    :goto_f
    const/4 v10, 0x2

    .line 420
    move-wide v7, v3

    .line 421
    invoke-virtual/range {v1 .. v10}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    iput-object v2, v1, La/dmo;->i1:La/yx90;

    .line 426
    .line 427
    throw v0
.end method

.method public final X(La/vn30;JZZ)J
    .locals 9

    .line 1
    invoke-virtual {p0}, La/dmo;->w0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, La/dmo;->D0(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    if-nez p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, La/dmo;->i1:La/yx90;

    .line 13
    .line 14
    iget p5, p5, La/yx90;->e:I

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-ne p5, v3, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v2}, La/dmo;->o0(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p5, p0, La/dmo;->q:La/pn30;

    .line 23
    .line 24
    iget-object p5, p5, La/pn30;->i:La/nn30;

    .line 25
    .line 26
    move-object v3, p5

    .line 27
    :goto_0
    if-eqz v3, :cond_3

    .line 28
    .line 29
    iget-object v4, v3, La/nn30;->g:La/on30;

    .line 30
    .line 31
    iget-object v4, v4, La/on30;->a:La/vn30;

    .line 32
    .line 33
    invoke-virtual {p1, v4}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object v3, v3, La/nn30;->m:La/nn30;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    if-nez p4, :cond_4

    .line 49
    .line 50
    if-ne p5, v3, :cond_4

    .line 51
    .line 52
    if-eqz v3, :cond_7

    .line 53
    .line 54
    iget-wide p4, v3, La/nn30;->p:J

    .line 55
    .line 56
    add-long/2addr p4, p2

    .line 57
    const-wide/16 v6, 0x0

    .line 58
    .line 59
    cmp-long p1, p4, v6

    .line 60
    .line 61
    if-gez p1, :cond_7

    .line 62
    .line 63
    :cond_4
    move p1, v0

    .line 64
    :goto_2
    iget-object p4, p0, La/dmo;->a:[La/ujf0;

    .line 65
    .line 66
    array-length p4, p4

    .line 67
    if-ge p1, p4, :cond_5

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/dmo;->h(I)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 p1, p1, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    iput-wide v4, p0, La/dmo;->E1:J

    .line 76
    .line 77
    if-eqz v3, :cond_7

    .line 78
    .line 79
    :goto_3
    iget-object p1, p0, La/dmo;->q:La/pn30;

    .line 80
    .line 81
    iget-object p4, p1, La/pn30;->i:La/nn30;

    .line 82
    .line 83
    if-eq p4, v3, :cond_6

    .line 84
    .line 85
    invoke-virtual {p1}, La/pn30;->a()La/nn30;

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_6
    invoke-virtual {p1, v3}, La/pn30;->s(La/nn30;)I

    .line 90
    .line 91
    .line 92
    const-wide p4, 0xe8d4a51000L

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    iput-wide p4, v3, La/nn30;->p:J

    .line 98
    .line 99
    invoke-virtual {p0}, La/dmo;->z()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    xor-int/2addr p1, v1

    .line 104
    invoke-static {p1}, La/x0x;->K(Z)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, La/dmo;->a:[La/ujf0;

    .line 108
    .line 109
    array-length p1, p1

    .line 110
    new-array p1, p1, [Z

    .line 111
    .line 112
    iget-object p4, p0, La/dmo;->q:La/pn30;

    .line 113
    .line 114
    invoke-virtual {p4}, La/pn30;->d()La/nn30;

    .line 115
    .line 116
    .line 117
    move-result-object p4

    .line 118
    invoke-virtual {p4}, La/nn30;->e()J

    .line 119
    .line 120
    .line 121
    move-result-wide p4

    .line 122
    invoke-virtual {p0, p1, p4, p5}, La/dmo;->k([ZJ)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v3}, La/dmo;->a0(La/nn30;)V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-virtual {p0}, La/dmo;->g()V

    .line 129
    .line 130
    .line 131
    iget-boolean p1, p0, La/dmo;->Z:Z

    .line 132
    .line 133
    if-eqz p1, :cond_a

    .line 134
    .line 135
    iget-object p1, p0, La/dmo;->a:[La/ujf0;

    .line 136
    .line 137
    array-length p4, p1

    .line 138
    move p5, v0

    .line 139
    :goto_4
    if-ge p5, p4, :cond_a

    .line 140
    .line 141
    aget-object v6, p1, p5

    .line 142
    .line 143
    invoke-virtual {v6}, La/ujf0;->j()Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_9

    .line 148
    .line 149
    iget-object v6, v6, La/ujf0;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v6, La/j16;

    .line 152
    .line 153
    iget-byte v6, v6, La/j16;->b:B

    .line 154
    .line 155
    if-eq v6, v2, :cond_8

    .line 156
    .line 157
    const/4 v7, 0x4

    .line 158
    if-ne v6, v7, :cond_9

    .line 159
    .line 160
    :cond_8
    iput-boolean v1, p0, La/dmo;->f1:Z

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_9
    add-int/lit8 p5, p5, 0x1

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_a
    :goto_5
    iget-object p1, p0, La/dmo;->q:La/pn30;

    .line 167
    .line 168
    if-eqz v3, :cond_13

    .line 169
    .line 170
    invoke-virtual {p1, v3}, La/pn30;->s(La/nn30;)I

    .line 171
    .line 172
    .line 173
    iget-boolean p1, v3, La/nn30;->e:Z

    .line 174
    .line 175
    if-nez p1, :cond_b

    .line 176
    .line 177
    iget-object p1, v3, La/nn30;->g:La/on30;

    .line 178
    .line 179
    invoke-virtual {p1, p2, p3, v4, v5}, La/on30;->b(JJ)La/on30;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    iput-object p1, v3, La/nn30;->g:La/on30;

    .line 184
    .line 185
    goto/16 :goto_9

    .line 186
    .line 187
    :cond_b
    iget-boolean p1, v3, La/nn30;->f:Z

    .line 188
    .line 189
    if-eqz p1, :cond_12

    .line 190
    .line 191
    iget-boolean p1, p0, La/dmo;->Z:Z

    .line 192
    .line 193
    if-eqz p1, :cond_11

    .line 194
    .line 195
    iget-object p1, p0, La/dmo;->Y:La/uch0;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 201
    .line 202
    iget-object p1, p1, La/yx90;->a:La/bmq0;

    .line 203
    .line 204
    invoke-virtual {p1}, La/bmq0;->p()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-nez p1, :cond_11

    .line 209
    .line 210
    iget-object p1, v3, La/nn30;->g:La/on30;

    .line 211
    .line 212
    iget-object p1, p1, La/on30;->a:La/vn30;

    .line 213
    .line 214
    iget-object p4, p0, La/dmo;->i1:La/yx90;

    .line 215
    .line 216
    iget-object p4, p4, La/yx90;->b:La/vn30;

    .line 217
    .line 218
    invoke-virtual {p1, p4}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    if-nez p1, :cond_c

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_c
    iget-wide p4, v3, La/nn30;->p:J

    .line 226
    .line 227
    add-long/2addr p4, p2

    .line 228
    iget-object p1, p0, La/dmo;->a:[La/ujf0;

    .line 229
    .line 230
    array-length v4, p1

    .line 231
    move v5, v0

    .line 232
    move v6, v1

    .line 233
    :goto_6
    if-ge v5, v4, :cond_f

    .line 234
    .line 235
    aget-object v7, p1, v5

    .line 236
    .line 237
    invoke-virtual {v7}, La/ujf0;->j()Z

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    if-eqz v8, :cond_e

    .line 242
    .line 243
    invoke-virtual {v7, v3}, La/ujf0;->d(La/nn30;)La/j16;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    if-eqz v7, :cond_d

    .line 248
    .line 249
    invoke-virtual {v7, p4, p5}, La/j16;->F(J)Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-eqz v7, :cond_d

    .line 254
    .line 255
    move v7, v1

    .line 256
    goto :goto_7

    .line 257
    :cond_d
    move v7, v0

    .line 258
    :goto_7
    and-int/2addr v6, v7

    .line 259
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_f
    if-nez v6, :cond_10

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_10
    iget-object p1, v3, La/nn30;->a:La/f930;

    .line 266
    .line 267
    iget-object p4, p0, La/dmo;->i1:La/yx90;

    .line 268
    .line 269
    iget-wide p4, p4, La/yx90;->s:J

    .line 270
    .line 271
    sget-object v4, La/gvh0;->c:La/gvh0;

    .line 272
    .line 273
    invoke-virtual {p1, p4, p5, v4}, La/f930;->c(JLa/gvh0;)J

    .line 274
    .line 275
    .line 276
    move-result-wide p4

    .line 277
    iget-object p1, v3, La/nn30;->a:La/f930;

    .line 278
    .line 279
    invoke-virtual {p1, p2, p3, v4}, La/f930;->c(JLa/gvh0;)J

    .line 280
    .line 281
    .line 282
    move-result-wide v4

    .line 283
    cmp-long p1, p4, v4

    .line 284
    .line 285
    if-nez p1, :cond_11

    .line 286
    .line 287
    move v1, v0

    .line 288
    goto :goto_9

    .line 289
    :cond_11
    :goto_8
    iget-object p1, v3, La/nn30;->a:La/f930;

    .line 290
    .line 291
    invoke-virtual {p1, p2, p3}, La/f930;->d(J)J

    .line 292
    .line 293
    .line 294
    move-result-wide p2

    .line 295
    iget-object p1, v3, La/nn30;->a:La/f930;

    .line 296
    .line 297
    iget-wide p4, p0, La/dmo;->l:J

    .line 298
    .line 299
    sub-long p4, p2, p4

    .line 300
    .line 301
    invoke-virtual {p1, p4, p5}, La/f930;->m(J)V

    .line 302
    .line 303
    .line 304
    :cond_12
    :goto_9
    invoke-virtual {p0, v1, p2, p3}, La/dmo;->Q(ZJ)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0}, La/dmo;->C()V

    .line 308
    .line 309
    .line 310
    goto :goto_a

    .line 311
    :cond_13
    invoke-virtual {p1}, La/pn30;->b()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0, v1, p2, p3}, La/dmo;->Q(ZJ)V

    .line 315
    .line 316
    .line 317
    :goto_a
    invoke-virtual {p0, v0}, La/dmo;->t(Z)V

    .line 318
    .line 319
    .line 320
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 321
    .line 322
    invoke-virtual {p0, v2}, La/q9o0;->h(I)V

    .line 323
    .line 324
    .line 325
    return-wide p2
.end method

.method public final Y(La/y8a0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/dmo;->g:La/q9o0;

    .line 5
    .line 6
    iget-object v1, p1, La/y8a0;->e:Landroid/os/Looper;

    .line 7
    .line 8
    iget-object v2, p0, La/dmo;->i:Landroid/os/Looper;

    .line 9
    .line 10
    if-ne v1, v2, :cond_2

    .line 11
    .line 12
    monitor-enter p1

    .line 13
    monitor-exit p1

    .line 14
    const/4 v1, 0x1

    .line 15
    :try_start_0
    iget-object v2, p1, La/y8a0;->a:La/x8a0;

    .line 16
    .line 17
    iget-short v3, p1, La/y8a0;->c:S

    .line 18
    .line 19
    iget-object v4, p1, La/y8a0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {v2, v3, v4}, La/x8a0;->c(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, La/y8a0;->a(Z)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/dmo;->i1:La/yx90;

    .line 28
    .line 29
    iget p0, p0, La/yx90;->e:I

    .line 30
    .line 31
    const/4 p1, 0x3

    .line 32
    const/4 v1, 0x2

    .line 33
    if-eq p0, p1, :cond_1

    .line 34
    .line 35
    if-ne p0, v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, La/q9o0;->h(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    invoke-virtual {p1, v1}, La/y8a0;->a(Z)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    const/16 p0, 0xf

    .line 49
    .line 50
    invoke-virtual {v0, p0, p1}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, La/p9o0;->b()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final Z(La/y8a0;)V
    .locals 3

    .line 1
    iget-object v0, p1, La/y8a0;->e:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string p0, "TAG"

    .line 14
    .line 15
    const-string v0, "Trying to send message on a dead thread."

    .line 16
    .line 17
    invoke-static {p0, v0}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    invoke-virtual {p1, p0}, La/y8a0;->a(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    iget-object v2, p0, La/dmo;->o:La/l9o0;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/ccf;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, La/ccf;-><init>(La/dmo;La/y8a0;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final a(La/hgi0;)V
    .locals 1

    .line 1
    check-cast p1, La/mn30;

    .line 2
    .line 3
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 4
    .line 5
    const/16 v0, 0x9

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, La/p9o0;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final a0(La/nn30;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, La/dmo;->a:[La/ujf0;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p1, La/nn30;->h:[Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    aput-boolean v2, v1, v0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final b(La/zlo;I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/dmo;->j1:La/amo;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, La/amo;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iget-object v1, p0, La/dmo;->r:La/jo30;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    iget-object p2, v1, La/jo30;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    :cond_0
    iget-object v0, p1, La/zlo;->a:Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object p1, p1, La/zlo;->b:La/itj0;

    .line 21
    .line 22
    invoke-virtual {v1, p2, v0, p1}, La/jo30;->a(ILjava/util/ArrayList;La/itj0;)La/bmq0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p0, p1, p2}, La/dmo;->u(La/bmq0;Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final b0(La/m24;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, La/dmo;->d:La/syj;

    .line 2
    .line 3
    iget-object v1, v0, La/syj;->i:La/m24;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, La/m24;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-object p1, v0, La/syj;->i:La/m24;

    .line 14
    .line 15
    iget-object v1, v0, La/syj;->f:La/nyj;

    .line 16
    .line 17
    iget-boolean v1, v1, La/nyj;->C:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v3, 0x20

    .line 24
    .line 25
    if-lt v1, v3, :cond_1

    .line 26
    .line 27
    iget-object v1, v0, La/syj;->h:La/o24;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v1, v1, La/o24;->a:Z

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, La/syj;->a:La/dmo;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 40
    .line 41
    const/16 v1, 0xa

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, La/p9o0;->b()V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-object p1, v2

    .line 54
    :goto_1
    iget-object p2, p0, La/dmo;->z:La/x24;

    .line 55
    .line 56
    iget-object v0, p2, La/x24;->d:La/m24;

    .line 57
    .line 58
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    iput-object p1, p2, La/x24;->d:La/m24;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    const/4 v1, 0x1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    move p1, v0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    move p1, v1

    .line 73
    :goto_2
    iput p1, p2, La/x24;->f:I

    .line 74
    .line 75
    if-eq p1, v1, :cond_4

    .line 76
    .line 77
    if-nez p1, :cond_5

    .line 78
    .line 79
    :cond_4
    move v0, v1

    .line 80
    :cond_5
    const-string p1, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."

    .line 81
    .line 82
    invoke-static {p1, v0}, La/x0x;->z(Ljava/lang/String;Z)V

    .line 83
    .line 84
    .line 85
    :cond_6
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 86
    .line 87
    iget-boolean v0, p1, La/yx90;->l:Z

    .line 88
    .line 89
    iget v1, p1, La/yx90;->n:I

    .line 90
    .line 91
    iget v2, p1, La/yx90;->m:I

    .line 92
    .line 93
    iget p1, p1, La/yx90;->e:I

    .line 94
    .line 95
    invoke-virtual {p2, p1, v0}, La/x24;->c(IZ)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p0, p1, v1, v2, v0}, La/dmo;->A0(IIIZ)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, La/dmo;->a:[La/ujf0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_2

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-boolean v4, p0, La/dmo;->Z:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, La/dmo;->Y:La/uch0;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v4, 0x0

    .line 17
    :goto_1
    iget-object v5, v3, La/ujf0;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, La/j16;

    .line 20
    .line 21
    const/16 v6, 0x12

    .line 22
    .line 23
    invoke-interface {v5, v6, v4}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v3, La/ujf0;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, La/j16;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v3, v6, v4}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return-void
.end method

.method public final c0(I)V
    .locals 6

    .line 1
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_2

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    iget-object v3, v2, La/ujf0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/j16;

    .line 12
    .line 13
    iget-byte v4, v3, La/j16;->b:B

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    if-eq v4, v5, :cond_0

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    if-eq v4, v5, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/16 v5, 0xa

    .line 27
    .line 28
    invoke-interface {v3, v5, v4}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, v2, La/ujf0;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, La/j16;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v2, v5, v3}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-void
.end method

.method public final d(JJLandroidx/media3/common/b;Landroid/media/MediaFormat;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, La/dmo;->f1:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 6
    .line 7
    const/16 p1, 0x25

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/q9o0;->a(I)La/p9o0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, La/p9o0;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final d0(ZLa/brd;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/dmo;->s1:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, La/dmo;->s1:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 10
    .line 11
    array-length p1, p0

    .line 12
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-ge v0, p1, :cond_0

    .line 14
    .line 15
    aget-object v1, p0, v0

    .line 16
    .line 17
    invoke-virtual {v1}, La/ujf0;->n()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-eqz p2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p2}, La/brd;->c()Z

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, La/dmo;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 8
    .line 9
    array-length v0, p0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, v0, :cond_2

    .line 12
    .line 13
    aget-object v3, p0, v2

    .line 14
    .line 15
    invoke-virtual {v3}, La/ujf0;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    return v1
.end method

.method public final e0(La/xlo;)V
    .locals 6

    .line 1
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_2

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    iget-object v3, v2, La/ujf0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/j16;

    .line 12
    .line 13
    iget-byte v4, v3, La/j16;->b:B

    .line 14
    .line 15
    const/4 v5, 0x4

    .line 16
    if-eq v4, v5, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/16 v4, 0x17

    .line 20
    .line 21
    invoke-interface {v3, v4, p1}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, v2, La/ujf0;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, La/j16;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v2, v4, p1}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-void
.end method

.method public final f(La/mn30;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, La/p9o0;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final f0(La/zlo;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/dmo;->j1:La/amo;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, La/amo;->c(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, La/zlo;->c:I

    .line 8
    .line 9
    iget-object v1, p1, La/zlo;->b:La/itj0;

    .line 10
    .line 11
    iget-object v2, p1, La/zlo;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    if-eq v0, v3, :cond_0

    .line 15
    .line 16
    new-instance v0, La/cmo;

    .line 17
    .line 18
    new-instance v3, La/wna0;

    .line 19
    .line 20
    invoke-direct {v3, v2, v1}, La/wna0;-><init>(Ljava/util/ArrayList;La/itj0;)V

    .line 21
    .line 22
    .line 23
    iget v4, p1, La/zlo;->c:I

    .line 24
    .line 25
    iget-wide v5, p1, La/zlo;->d:J

    .line 26
    .line 27
    invoke-direct {v0, v3, v4, v5, v6}, La/cmo;-><init>(La/bmq0;IJ)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, La/dmo;->w1:La/cmo;

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, La/dmo;->r:La/jo30;

    .line 33
    .line 34
    iget-object v0, p1, La/jo30;->c:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {p1, v4, v3}, La/jo30;->f(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p1, v0, v2, v1}, La/jo30;->a(ILjava/util/ArrayList;La/itj0;)La/bmq0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1, v4}, La/dmo;->u(La/bmq0;Z)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final g()V
    .locals 11

    .line 1
    iget-boolean v0, p0, La/dmo;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    invoke-virtual {p0}, La/dmo;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_8

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, La/dmo;->a:[La/ujf0;

    .line 14
    .line 15
    array-length v1, v0

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v1, :cond_7

    .line 19
    .line 20
    aget-object v4, v0, v3

    .line 21
    .line 22
    invoke-virtual {v4}, La/ujf0;->c()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    iget-object v6, p0, La/dmo;->m:La/cwj;

    .line 27
    .line 28
    invoke-virtual {v4}, La/ujf0;->g()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-nez v7, :cond_1

    .line 33
    .line 34
    goto :goto_7

    .line 35
    :cond_1
    iget v7, v4, La/ujf0;->d:I

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    const/4 v9, 0x5

    .line 39
    if-eq v7, v9, :cond_3

    .line 40
    .line 41
    const/4 v10, 0x2

    .line 42
    if-ne v7, v10, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v10, v2

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    :goto_1
    move v10, v8

    .line 48
    :goto_2
    if-eq v7, v9, :cond_5

    .line 49
    .line 50
    const/4 v9, 0x3

    .line 51
    if-ne v7, v9, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move v8, v2

    .line 55
    :cond_5
    :goto_3
    const-string v7, "RendererHolder"

    .line 56
    .line 57
    if-eqz v10, :cond_6

    .line 58
    .line 59
    :try_start_0
    iget-object v9, v4, La/ujf0;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v9, La/j16;

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_6
    iget-object v9, v4, La/ujf0;->f:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v9, La/j16;

    .line 67
    .line 68
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    :goto_4
    invoke-virtual {v4, v9, v6}, La/ujf0;->a(La/j16;La/cwj;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_5

    .line 75
    :catch_0
    move-exception v6

    .line 76
    const-string v9, "Disable prewarming failed."

    .line 77
    .line 78
    invoke-static {v7, v9, v6}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :goto_5
    :try_start_1
    invoke-virtual {v4, v10}, La/ujf0;->l(Z)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    .line 83
    .line 84
    goto :goto_6

    .line 85
    :catch_1
    move-exception v6

    .line 86
    const-string v9, "Reset prewarming failed."

    .line 87
    .line 88
    invoke-static {v7, v9, v6}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_6
    iput v8, v4, La/ujf0;->d:I

    .line 92
    .line 93
    :goto_7
    iget v6, p0, La/dmo;->v1:I

    .line 94
    .line 95
    invoke-virtual {v4}, La/ujf0;->c()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    sub-int/2addr v5, v4

    .line 100
    sub-int/2addr v6, v5

    .line 101
    iput v6, p0, La/dmo;->v1:I

    .line 102
    .line 103
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    iput-wide v0, p0, La/dmo;->E1:J

    .line 112
    .line 113
    :cond_8
    :goto_8
    return-void
.end method

.method public final g0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/dmo;->l1:Z

    .line 2
    .line 3
    invoke-virtual {p0}, La/dmo;->P()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, La/dmo;->m1:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, La/dmo;->z()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-virtual {p0, p1}, La/dmo;->V(Z)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1}, La/dmo;->t(Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final h(I)V
    .locals 8

    .line 1
    iget-object v0, p0, La/dmo;->a:[La/ujf0;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, La/ujf0;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget-object v0, v0, p1

    .line 10
    .line 11
    iget-object v2, v0, La/ujf0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/j16;

    .line 14
    .line 15
    iget-object v3, p0, La/dmo;->m:La/cwj;

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3}, La/ujf0;->a(La/j16;La/cwj;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, v0, La/ujf0;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, La/j16;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    iget v5, v0, La/ujf0;->d:I

    .line 28
    .line 29
    const/4 v6, 0x5

    .line 30
    const/4 v7, 0x1

    .line 31
    if-eq v5, v6, :cond_1

    .line 32
    .line 33
    if-eq v5, v7, :cond_1

    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    if-ne v5, v6, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v7, v4

    .line 40
    :cond_1
    :goto_0
    invoke-virtual {v0, v2, v3}, La/ujf0;->a(La/j16;La/cwj;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v4}, La/ujf0;->l(Z)V

    .line 44
    .line 45
    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    iget-object v3, v0, La/ujf0;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, La/j16;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/16 v5, 0x11

    .line 56
    .line 57
    invoke-interface {v2, v5, v3}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iput v4, v0, La/ujf0;->d:I

    .line 61
    .line 62
    invoke-virtual {p0, p1, v4}, La/dmo;->G(IZ)V

    .line 63
    .line 64
    .line 65
    iget p1, p0, La/dmo;->v1:I

    .line 66
    .line 67
    sub-int/2addr p1, v1

    .line 68
    iput p1, p0, La/dmo;->v1:I

    .line 69
    .line 70
    return-void
.end method

.method public final h0(La/zx90;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/dmo;->g:La/q9o0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/q9o0;->g(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/dmo;->m:La/cwj;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, La/cwj;->a(La/zx90;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, La/cwj;->d()La/zx90;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x1

    .line 18
    iget v1, p1, La/zx90;->a:F

    .line 19
    .line 20
    invoke-virtual {p0, p1, v1, v0, v0}, La/dmo;->w(La/zx90;FZZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    const-string v12, "Playback error"

    .line 6
    .line 7
    const-string v13, "ExoPlayerImplInternal"

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/16 v3, 0x3e8

    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v14, 0x0

    .line 14
    const/4 v15, 0x1

    .line 15
    :try_start_0
    iget v0, v11, Landroid/os/Message;->what:I

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    return v14

    .line 22
    :pswitch_0
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 23
    .line 24
    invoke-virtual {v1, v0}, La/dmo;->c0(I)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_14

    .line 28
    .line 29
    :catch_0
    move-exception v0

    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :catch_1
    move-exception v0

    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :catch_2
    move-exception v0

    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :catch_3
    move-exception v0

    .line 39
    goto/16 :goto_9

    .line 40
    .line 41
    :catch_4
    move-exception v0

    .line 42
    goto/16 :goto_a

    .line 43
    .line 44
    :catch_5
    move-exception v0

    .line 45
    goto/16 :goto_d

    .line 46
    .line 47
    :catch_6
    move-exception v0

    .line 48
    goto/16 :goto_e

    .line 49
    .line 50
    :pswitch_1
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, La/xlo;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, La/dmo;->e0(La/xlo;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_14

    .line 58
    .line 59
    :pswitch_2
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, La/uch0;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, La/dmo;->l0(La/uch0;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_14

    .line 67
    .line 68
    :pswitch_3
    iput-boolean v14, v1, La/dmo;->f1:Z

    .line 69
    .line 70
    iget-object v0, v1, La/dmo;->g1:La/cmo;

    .line 71
    .line 72
    if-eqz v0, :cond_19

    .line 73
    .line 74
    invoke-virtual {v1, v0}, La/dmo;->W(La/cmo;)V

    .line 75
    .line 76
    .line 77
    iput-object v5, v1, La/dmo;->g1:La/cmo;

    .line 78
    .line 79
    goto/16 :goto_14

    .line 80
    .line 81
    :pswitch_4
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {v1, v0}, La/dmo;->k0(Z)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_14

    .line 93
    .line 94
    :pswitch_5
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, La/seu0;

    .line 97
    .line 98
    invoke-virtual {v1, v0}, La/dmo;->p0(La/seu0;)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_14

    .line 102
    .line 103
    :pswitch_6
    invoke-virtual {v1}, La/dmo;->q()V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_14

    .line 107
    .line 108
    :pswitch_7
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 109
    .line 110
    invoke-virtual {v1, v0}, La/dmo;->p(I)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_14

    .line 114
    .line 115
    :pswitch_8
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Ljava/lang/Float;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {v1, v0}, La/dmo;->r0(F)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_14

    .line 127
    .line 128
    :pswitch_9
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, La/m24;

    .line 131
    .line 132
    iget v5, v11, Landroid/os/Message;->arg1:I

    .line 133
    .line 134
    if-eqz v5, :cond_0

    .line 135
    .line 136
    move v5, v15

    .line 137
    goto :goto_0

    .line 138
    :cond_0
    move v5, v14

    .line 139
    :goto_0
    invoke-virtual {v1, v0, v5}, La/dmo;->b0(La/m24;Z)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_14

    .line 143
    .line 144
    :pswitch_a
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Landroid/util/Pair;

    .line 147
    .line 148
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 149
    .line 150
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, La/brd;

    .line 153
    .line 154
    invoke-virtual {v1, v5, v0}, La/dmo;->q0(Ljava/lang/Object;La/brd;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_14

    .line 158
    .line 159
    :pswitch_b
    invoke-virtual {v1}, La/dmo;->J()V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_14

    .line 163
    .line 164
    :pswitch_c
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, La/flo;

    .line 167
    .line 168
    invoke-virtual {v1, v0}, La/dmo;->i0(La/flo;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_14

    .line 172
    .line 173
    :pswitch_d
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 174
    .line 175
    iget v5, v11, Landroid/os/Message;->arg2:I

    .line 176
    .line 177
    iget-object v6, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v6, Ljava/util/List;

    .line 180
    .line 181
    invoke-virtual {v1, v0, v5, v6}, La/dmo;->z0(IILjava/util/List;)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_14

    .line 185
    .line 186
    :pswitch_e
    invoke-virtual {v1}, La/dmo;->N()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v15}, La/dmo;->V(Z)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_14

    .line 193
    .line 194
    :pswitch_f
    invoke-virtual {v1}, La/dmo;->N()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v15}, La/dmo;->V(Z)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_14

    .line 201
    .line 202
    :pswitch_10
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 203
    .line 204
    if-eqz v0, :cond_1

    .line 205
    .line 206
    move v0, v15

    .line 207
    goto :goto_1

    .line 208
    :cond_1
    move v0, v14

    .line 209
    :goto_1
    iput-boolean v0, v1, La/dmo;->A:Z

    .line 210
    .line 211
    goto/16 :goto_14

    .line 212
    .line 213
    :pswitch_11
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 214
    .line 215
    if-eqz v0, :cond_2

    .line 216
    .line 217
    move v0, v15

    .line 218
    goto :goto_2

    .line 219
    :cond_2
    move v0, v14

    .line 220
    :goto_2
    invoke-virtual {v1, v0}, La/dmo;->g0(Z)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_14

    .line 224
    .line 225
    :pswitch_12
    invoke-virtual {v1}, La/dmo;->H()V

    .line 226
    .line 227
    .line 228
    goto/16 :goto_14

    .line 229
    .line 230
    :pswitch_13
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, La/itj0;

    .line 233
    .line 234
    invoke-virtual {v1, v0}, La/dmo;->n0(La/itj0;)V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_14

    .line 238
    .line 239
    :pswitch_14
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 240
    .line 241
    iget v5, v11, Landroid/os/Message;->arg2:I

    .line 242
    .line 243
    iget-object v6, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v6, La/itj0;

    .line 246
    .line 247
    invoke-virtual {v1, v0, v5, v6}, La/dmo;->M(IILa/itj0;)V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_14

    .line 251
    .line 252
    :pswitch_15
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 253
    .line 254
    invoke-static {v0}, La/rw2;->w(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, La/dmo;->I()V

    .line 258
    .line 259
    .line 260
    throw v5

    .line 261
    :pswitch_16
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, La/zlo;

    .line 264
    .line 265
    iget v5, v11, Landroid/os/Message;->arg1:I

    .line 266
    .line 267
    invoke-virtual {v1, v0, v5}, La/dmo;->b(La/zlo;I)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_14

    .line 271
    .line 272
    :pswitch_17
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, La/zlo;

    .line 275
    .line 276
    invoke-virtual {v1, v0}, La/dmo;->f0(La/zlo;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_14

    .line 280
    .line 281
    :pswitch_18
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, La/zx90;

    .line 284
    .line 285
    iget v5, v0, La/zx90;->a:F

    .line 286
    .line 287
    invoke-virtual {v1, v0, v5, v15, v14}, La/dmo;->w(La/zx90;FZZ)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_14

    .line 291
    .line 292
    :pswitch_19
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, La/y8a0;

    .line 295
    .line 296
    invoke-virtual {v1, v0}, La/dmo;->Z(La/y8a0;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_14

    .line 300
    .line 301
    :pswitch_1a
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, La/y8a0;

    .line 304
    .line 305
    invoke-virtual {v1, v0}, La/dmo;->Y(La/y8a0;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_14

    .line 309
    .line 310
    :pswitch_1b
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 311
    .line 312
    if-eqz v0, :cond_3

    .line 313
    .line 314
    move v0, v15

    .line 315
    goto :goto_3

    .line 316
    :cond_3
    move v0, v14

    .line 317
    :goto_3
    iget-object v5, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v5, La/brd;

    .line 320
    .line 321
    invoke-virtual {v1, v0, v5}, La/dmo;->d0(ZLa/brd;)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_14

    .line 325
    .line 326
    :pswitch_1c
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 327
    .line 328
    if-eqz v0, :cond_4

    .line 329
    .line 330
    move v0, v15

    .line 331
    goto :goto_4

    .line 332
    :cond_4
    move v0, v14

    .line 333
    :goto_4
    invoke-virtual {v1, v0}, La/dmo;->m0(Z)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_14

    .line 337
    .line 338
    :pswitch_1d
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 339
    .line 340
    invoke-virtual {v1, v0}, La/dmo;->j0(I)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_14

    .line 344
    .line 345
    :pswitch_1e
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, La/scs0;

    .line 348
    .line 349
    iget-object v5, v1, La/dmo;->d:La/syj;

    .line 350
    .line 351
    invoke-virtual {v5, v0}, La/syj;->i(La/scs0;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1}, La/dmo;->N()V

    .line 355
    .line 356
    .line 357
    goto/16 :goto_14

    .line 358
    .line 359
    :pswitch_1f
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, La/mn30;

    .line 362
    .line 363
    invoke-virtual {v1, v0}, La/dmo;->r(La/mn30;)V

    .line 364
    .line 365
    .line 366
    goto/16 :goto_14

    .line 367
    .line 368
    :pswitch_20
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, La/mn30;

    .line 371
    .line 372
    invoke-virtual {v1, v0}, La/dmo;->v(La/mn30;)V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_14

    .line 376
    .line 377
    :pswitch_21
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, La/brd;

    .line 380
    .line 381
    invoke-virtual {v1, v0}, La/dmo;->K(La/brd;)V

    .line 382
    .line 383
    .line 384
    return v15

    .line 385
    :pswitch_22
    invoke-virtual {v1, v14, v15}, La/dmo;->v0(ZZ)V

    .line 386
    .line 387
    .line 388
    goto/16 :goto_14

    .line 389
    .line 390
    :pswitch_23
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v0, La/gvh0;

    .line 393
    .line 394
    iput-object v0, v1, La/dmo;->B:La/gvh0;

    .line 395
    .line 396
    goto/16 :goto_14

    .line 397
    .line 398
    :pswitch_24
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v0, La/zx90;

    .line 401
    .line 402
    invoke-virtual {v1, v0}, La/dmo;->h0(La/zx90;)V

    .line 403
    .line 404
    .line 405
    goto/16 :goto_14

    .line 406
    .line 407
    :pswitch_25
    iget-object v0, v11, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v0, La/cmo;

    .line 410
    .line 411
    invoke-virtual {v1, v0}, La/dmo;->W(La/cmo;)V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_14

    .line 415
    .line 416
    :pswitch_26
    invoke-virtual {v1}, La/dmo;->i()V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_14

    .line 420
    .line 421
    :pswitch_27
    iget v0, v11, Landroid/os/Message;->arg1:I

    .line 422
    .line 423
    if-eqz v0, :cond_5

    .line 424
    .line 425
    move v0, v15

    .line 426
    goto :goto_5

    .line 427
    :cond_5
    move v0, v14

    .line 428
    :goto_5
    iget v5, v11, Landroid/os/Message;->arg2:I

    .line 429
    .line 430
    shr-int/lit8 v6, v5, 0x4

    .line 431
    .line 432
    and-int/lit8 v5, v5, 0xf

    .line 433
    .line 434
    iget-object v7, v1, La/dmo;->j1:La/amo;

    .line 435
    .line 436
    invoke-virtual {v7, v15}, La/amo;->c(I)V

    .line 437
    .line 438
    .line 439
    iget-object v7, v1, La/dmo;->z:La/x24;

    .line 440
    .line 441
    iget-object v8, v1, La/dmo;->i1:La/yx90;

    .line 442
    .line 443
    iget v8, v8, La/yx90;->e:I

    .line 444
    .line 445
    invoke-virtual {v7, v8, v0}, La/x24;->c(IZ)I

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    invoke-virtual {v1, v7, v6, v5, v0}, La/dmo;->A0(IIIZ)V
    :try_end_0
    .catch La/dlo; {:try_start_0 .. :try_end_0} :catch_6
    .catch La/xhl; {:try_start_0 .. :try_end_0} :catch_5
    .catch La/kq80; {:try_start_0 .. :try_end_0} :catch_4
    .catch La/kbj; {:try_start_0 .. :try_end_0} :catch_3
    .catch La/lb6; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 450
    .line 451
    .line 452
    goto/16 :goto_14

    .line 453
    .line 454
    :goto_6
    instance-of v4, v0, Ljava/lang/IllegalStateException;

    .line 455
    .line 456
    if-nez v4, :cond_6

    .line 457
    .line 458
    instance-of v4, v0, Ljava/lang/IllegalArgumentException;

    .line 459
    .line 460
    if-eqz v4, :cond_7

    .line 461
    .line 462
    :cond_6
    const/16 v3, 0x3ec

    .line 463
    .line 464
    :cond_7
    new-instance v4, La/dlo;

    .line 465
    .line 466
    invoke-direct {v4, v2, v0, v3}, La/dlo;-><init>(ILjava/lang/Exception;I)V

    .line 467
    .line 468
    .line 469
    invoke-static {v13, v12, v4}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, v15, v14}, La/dmo;->v0(ZZ)V

    .line 473
    .line 474
    .line 475
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 476
    .line 477
    invoke-virtual {v0, v4}, La/yx90;->f(La/dlo;)La/yx90;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    iput-object v0, v1, La/dmo;->i1:La/yx90;

    .line 482
    .line 483
    goto/16 :goto_14

    .line 484
    .line 485
    :goto_7
    const/16 v2, 0x7d0

    .line 486
    .line 487
    invoke-virtual {v1, v0, v2}, La/dmo;->s(Ljava/io/IOException;I)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_14

    .line 491
    .line 492
    :goto_8
    const/16 v2, 0x3ea

    .line 493
    .line 494
    invoke-virtual {v1, v0, v2}, La/dmo;->s(Ljava/io/IOException;I)V

    .line 495
    .line 496
    .line 497
    goto/16 :goto_14

    .line 498
    .line 499
    :goto_9
    iget v2, v0, La/kbj;->a:I

    .line 500
    .line 501
    invoke-virtual {v1, v0, v2}, La/dmo;->s(Ljava/io/IOException;I)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_14

    .line 505
    .line 506
    :goto_a
    iget-boolean v2, v0, La/kq80;->a:Z

    .line 507
    .line 508
    iget-byte v5, v0, La/kq80;->b:B

    .line 509
    .line 510
    if-ne v5, v15, :cond_9

    .line 511
    .line 512
    if-eqz v2, :cond_8

    .line 513
    .line 514
    const/16 v2, 0xbb9

    .line 515
    .line 516
    :goto_b
    move v3, v2

    .line 517
    goto :goto_c

    .line 518
    :cond_8
    const/16 v2, 0xbbb

    .line 519
    .line 520
    goto :goto_b

    .line 521
    :cond_9
    if-ne v5, v4, :cond_b

    .line 522
    .line 523
    if-eqz v2, :cond_a

    .line 524
    .line 525
    const/16 v2, 0xbba

    .line 526
    .line 527
    goto :goto_b

    .line 528
    :cond_a
    const/16 v2, 0xbbc

    .line 529
    .line 530
    goto :goto_b

    .line 531
    :cond_b
    :goto_c
    invoke-virtual {v1, v0, v3}, La/dmo;->s(Ljava/io/IOException;I)V

    .line 532
    .line 533
    .line 534
    goto/16 :goto_14

    .line 535
    .line 536
    :goto_d
    iget v2, v0, La/xhl;->a:I

    .line 537
    .line 538
    invoke-virtual {v1, v0, v2}, La/dmo;->s(Ljava/io/IOException;I)V

    .line 539
    .line 540
    .line 541
    goto/16 :goto_14

    .line 542
    .line 543
    :goto_e
    iget-byte v3, v0, La/dlo;->c:B

    .line 544
    .line 545
    iget-object v5, v1, La/dmo;->q:La/pn30;

    .line 546
    .line 547
    if-ne v3, v15, :cond_e

    .line 548
    .line 549
    iget-object v3, v0, La/dlo;->h:La/vn30;

    .line 550
    .line 551
    if-nez v3, :cond_e

    .line 552
    .line 553
    iget-object v3, v1, La/dmo;->a:[La/ujf0;

    .line 554
    .line 555
    iget v6, v0, La/dlo;->e:I

    .line 556
    .line 557
    aget-object v3, v3, v6

    .line 558
    .line 559
    iget-object v6, v5, La/pn30;->i:La/nn30;

    .line 560
    .line 561
    :goto_f
    if-eqz v6, :cond_c

    .line 562
    .line 563
    invoke-virtual {v3, v6}, La/ujf0;->i(La/nn30;)Z

    .line 564
    .line 565
    .line 566
    move-result v7

    .line 567
    if-nez v7, :cond_c

    .line 568
    .line 569
    iget-object v6, v6, La/nn30;->m:La/nn30;

    .line 570
    .line 571
    goto :goto_f

    .line 572
    :cond_c
    if-nez v6, :cond_d

    .line 573
    .line 574
    invoke-virtual {v5}, La/pn30;->d()La/nn30;

    .line 575
    .line 576
    .line 577
    move-result-object v6

    .line 578
    :cond_d
    if-eqz v6, :cond_e

    .line 579
    .line 580
    iget-object v3, v6, La/nn30;->g:La/on30;

    .line 581
    .line 582
    iget-object v3, v3, La/on30;->a:La/vn30;

    .line 583
    .line 584
    invoke-virtual {v0, v3}, La/dlo;->a(La/vn30;)La/dlo;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    :cond_e
    iget v3, v0, La/dlo;->e:I

    .line 589
    .line 590
    iget-byte v6, v0, La/dlo;->c:B

    .line 591
    .line 592
    iget-object v7, v1, La/dmo;->g:La/q9o0;

    .line 593
    .line 594
    if-ne v6, v15, :cond_10

    .line 595
    .line 596
    iget-object v6, v0, La/dlo;->h:La/vn30;

    .line 597
    .line 598
    if-eqz v6, :cond_10

    .line 599
    .line 600
    invoke-virtual {v1, v3, v6}, La/dmo;->A(ILa/vn30;)Z

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    if-eqz v6, :cond_10

    .line 605
    .line 606
    iput-boolean v15, v1, La/dmo;->F1:Z

    .line 607
    .line 608
    invoke-virtual {v1}, La/dmo;->g()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v5, v3}, La/pn30;->k(I)La/nn30;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    iget-object v3, v5, La/pn30;->i:La/nn30;

    .line 616
    .line 617
    if-eq v3, v0, :cond_f

    .line 618
    .line 619
    :goto_10
    if-eqz v3, :cond_f

    .line 620
    .line 621
    iget-object v6, v3, La/nn30;->m:La/nn30;

    .line 622
    .line 623
    if-eq v6, v0, :cond_f

    .line 624
    .line 625
    move-object v3, v6

    .line 626
    goto :goto_10

    .line 627
    :cond_f
    invoke-virtual {v5, v3}, La/pn30;->s(La/nn30;)I

    .line 628
    .line 629
    .line 630
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 631
    .line 632
    iget v0, v0, La/yx90;->e:I

    .line 633
    .line 634
    if-eq v0, v4, :cond_19

    .line 635
    .line 636
    invoke-virtual {v1}, La/dmo;->C()V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v7, v2}, La/q9o0;->h(I)V

    .line 640
    .line 641
    .line 642
    goto/16 :goto_14

    .line 643
    .line 644
    :cond_10
    iget-object v2, v1, La/dmo;->B1:La/dlo;

    .line 645
    .line 646
    if-eqz v2, :cond_11

    .line 647
    .line 648
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 649
    .line 650
    .line 651
    iget-object v0, v1, La/dmo;->B1:La/dlo;

    .line 652
    .line 653
    :cond_11
    iget-byte v2, v0, La/dlo;->c:B

    .line 654
    .line 655
    if-ne v2, v15, :cond_15

    .line 656
    .line 657
    iget-object v2, v5, La/pn30;->i:La/nn30;

    .line 658
    .line 659
    invoke-virtual {v5}, La/pn30;->f()La/nn30;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    if-eq v2, v3, :cond_15

    .line 664
    .line 665
    iget-object v2, v5, La/pn30;->i:La/nn30;

    .line 666
    .line 667
    :goto_11
    if-eqz v2, :cond_12

    .line 668
    .line 669
    iget-object v3, v2, La/nn30;->g:La/on30;

    .line 670
    .line 671
    iget-object v3, v3, La/on30;->a:La/vn30;

    .line 672
    .line 673
    iget-object v4, v0, La/dlo;->h:La/vn30;

    .line 674
    .line 675
    invoke-virtual {v3, v4}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    if-nez v3, :cond_12

    .line 680
    .line 681
    iget-object v2, v2, La/nn30;->m:La/nn30;

    .line 682
    .line 683
    goto :goto_11

    .line 684
    :cond_12
    if-nez v2, :cond_13

    .line 685
    .line 686
    invoke-virtual {v5}, La/pn30;->d()La/nn30;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    :cond_13
    :goto_12
    iget-object v3, v5, La/pn30;->i:La/nn30;

    .line 691
    .line 692
    if-eq v3, v2, :cond_14

    .line 693
    .line 694
    invoke-virtual {v5}, La/pn30;->a()La/nn30;

    .line 695
    .line 696
    .line 697
    goto :goto_12

    .line 698
    :cond_14
    invoke-static {v3}, La/x0x;->F(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    iget v2, v11, Landroid/os/Message;->what:I

    .line 702
    .line 703
    invoke-virtual {v1, v2}, La/dmo;->E(I)V

    .line 704
    .line 705
    .line 706
    iget-object v2, v3, La/nn30;->g:La/on30;

    .line 707
    .line 708
    iget-object v3, v2, La/on30;->a:La/vn30;

    .line 709
    .line 710
    move-object v5, v3

    .line 711
    iget-wide v3, v2, La/on30;->b:J

    .line 712
    .line 713
    iget-wide v8, v2, La/on30;->d:J

    .line 714
    .line 715
    move-object v2, v5

    .line 716
    move-wide v5, v8

    .line 717
    const/4 v9, 0x1

    .line 718
    const/4 v10, 0x0

    .line 719
    move-object/from16 v16, v7

    .line 720
    .line 721
    move-wide v7, v3

    .line 722
    move-object/from16 v14, v16

    .line 723
    .line 724
    invoke-virtual/range {v1 .. v10}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    iput-object v2, v1, La/dmo;->i1:La/yx90;

    .line 729
    .line 730
    goto :goto_13

    .line 731
    :cond_15
    move-object v14, v7

    .line 732
    :goto_13
    iget-boolean v2, v0, La/dlo;->i:Z

    .line 733
    .line 734
    if-eqz v2, :cond_18

    .line 735
    .line 736
    iget-object v2, v1, La/dmo;->B1:La/dlo;

    .line 737
    .line 738
    if-eqz v2, :cond_16

    .line 739
    .line 740
    iget v2, v0, La/dlo;->a:I

    .line 741
    .line 742
    const/16 v3, 0x138c

    .line 743
    .line 744
    if-eq v2, v3, :cond_16

    .line 745
    .line 746
    const/16 v3, 0x138b

    .line 747
    .line 748
    if-ne v2, v3, :cond_18

    .line 749
    .line 750
    :cond_16
    const-string v2, "Recoverable renderer error"

    .line 751
    .line 752
    invoke-static {v13, v2, v0}, La/f1t0;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 753
    .line 754
    .line 755
    iget-object v2, v1, La/dmo;->B1:La/dlo;

    .line 756
    .line 757
    if-nez v2, :cond_17

    .line 758
    .line 759
    iput-object v0, v1, La/dmo;->B1:La/dlo;

    .line 760
    .line 761
    :cond_17
    const/16 v2, 0x19

    .line 762
    .line 763
    invoke-virtual {v14, v2, v0}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    iget-object v2, v14, La/q9o0;->a:Landroid/os/Handler;

    .line 768
    .line 769
    iget-object v3, v0, La/p9o0;->a:Landroid/os/Message;

    .line 770
    .line 771
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 775
    .line 776
    .line 777
    invoke-virtual {v0}, La/p9o0;->a()V

    .line 778
    .line 779
    .line 780
    goto :goto_14

    .line 781
    :cond_18
    invoke-static {v13, v12, v0}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 782
    .line 783
    .line 784
    const/4 v2, 0x0

    .line 785
    invoke-virtual {v1, v15, v2}, La/dmo;->v0(ZZ)V

    .line 786
    .line 787
    .line 788
    iget-object v2, v1, La/dmo;->i1:La/yx90;

    .line 789
    .line 790
    invoke-virtual {v2, v0}, La/yx90;->f(La/dlo;)La/yx90;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    iput-object v0, v1, La/dmo;->i1:La/yx90;

    .line 795
    .line 796
    :cond_19
    :goto_14
    iget v0, v11, Landroid/os/Message;->what:I

    .line 797
    .line 798
    invoke-virtual {v1, v0}, La/dmo;->E(I)V

    .line 799
    .line 800
    .line 801
    return v15

    .line 802
    nop

    .line 803
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i()V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/dmo;->o:La/l9o0;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v10

    .line 12
    iget-object v1, v0, La/dmo;->g:La/q9o0;

    .line 13
    .line 14
    const/4 v12, 0x2

    .line 15
    invoke-virtual {v1, v12}, La/q9o0;->g(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 19
    .line 20
    iget v2, v1, La/yx90;->e:I

    .line 21
    .line 22
    const/4 v13, 0x1

    .line 23
    if-eq v2, v13, :cond_9d

    .line 24
    .line 25
    const/4 v14, 0x4

    .line 26
    if-ne v2, v14, :cond_0

    .line 27
    .line 28
    goto/16 :goto_56

    .line 29
    .line 30
    :cond_0
    iget-object v1, v1, La/yx90;->a:La/bmq0;

    .line 31
    .line 32
    invoke-virtual {v1}, La/bmq0;->p()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v15, 0x0

    .line 37
    const/4 v8, 0x5

    .line 38
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    iget-object v1, v0, La/dmo;->r:La/jo30;

    .line 47
    .line 48
    iget-boolean v1, v1, La/jo30;->l:Z

    .line 49
    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    :cond_1
    move-wide/from16 v27, v10

    .line 53
    .line 54
    const/4 v14, 0x3

    .line 55
    move v11, v8

    .line 56
    goto/16 :goto_39

    .line 57
    .line 58
    :cond_2
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 59
    .line 60
    iget-wide v3, v0, La/dmo;->x1:J

    .line 61
    .line 62
    invoke-virtual {v1, v3, v4}, La/pn30;->r(J)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 66
    .line 67
    iget-object v3, v1, La/pn30;->l:La/nn30;

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    iget-object v4, v3, La/nn30;->g:La/on30;

    .line 72
    .line 73
    iget-boolean v4, v4, La/on30;->i:Z

    .line 74
    .line 75
    if-nez v4, :cond_3

    .line 76
    .line 77
    invoke-virtual {v3}, La/nn30;->g()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    iget-object v3, v1, La/pn30;->l:La/nn30;

    .line 84
    .line 85
    iget-object v3, v3, La/nn30;->g:La/on30;

    .line 86
    .line 87
    iget-wide v3, v3, La/on30;->e:J

    .line 88
    .line 89
    cmp-long v3, v3, v6

    .line 90
    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    iget v1, v1, La/pn30;->n:I

    .line 94
    .line 95
    const/16 v3, 0x64

    .line 96
    .line 97
    if-ge v1, v3, :cond_3

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    move-wide/from16 v25, v6

    .line 101
    .line 102
    move-wide/from16 v27, v10

    .line 103
    .line 104
    goto/16 :goto_9

    .line 105
    .line 106
    :cond_4
    :goto_0
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 107
    .line 108
    iget-wide v3, v0, La/dmo;->x1:J

    .line 109
    .line 110
    iget-object v5, v0, La/dmo;->i1:La/yx90;

    .line 111
    .line 112
    move-wide/from16 v25, v6

    .line 113
    .line 114
    iget-object v6, v1, La/pn30;->l:La/nn30;

    .line 115
    .line 116
    if-nez v6, :cond_5

    .line 117
    .line 118
    iget-object v3, v5, La/yx90;->a:La/bmq0;

    .line 119
    .line 120
    iget-object v4, v5, La/yx90;->b:La/vn30;

    .line 121
    .line 122
    iget-wide v6, v5, La/yx90;->c:J

    .line 123
    .line 124
    move-wide/from16 v27, v10

    .line 125
    .line 126
    iget-wide v9, v5, La/yx90;->s:J

    .line 127
    .line 128
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    move-object/from16 v16, v1

    .line 134
    .line 135
    move-object/from16 v17, v3

    .line 136
    .line 137
    move-object/from16 v18, v4

    .line 138
    .line 139
    move-wide/from16 v19, v6

    .line 140
    .line 141
    move-wide/from16 v21, v9

    .line 142
    .line 143
    invoke-virtual/range {v16 .. v24}, La/pn30;->h(La/bmq0;La/vn30;JJJ)La/on30;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move-wide/from16 v27, v10

    .line 149
    .line 150
    iget-object v5, v5, La/yx90;->a:La/bmq0;

    .line 151
    .line 152
    invoke-virtual {v1, v5, v6, v3, v4}, La/pn30;->e(La/bmq0;La/nn30;J)La/on30;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    :goto_1
    if-eqz v1, :cond_10

    .line 157
    .line 158
    iget-object v3, v0, La/dmo;->q:La/pn30;

    .line 159
    .line 160
    iget-object v4, v3, La/pn30;->l:La/nn30;

    .line 161
    .line 162
    if-nez v4, :cond_6

    .line 163
    .line 164
    const-wide v4, 0xe8d4a51000L

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    :goto_2
    move-wide/from16 v18, v4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    iget-wide v5, v4, La/nn30;->p:J

    .line 173
    .line 174
    iget-object v4, v4, La/nn30;->g:La/on30;

    .line 175
    .line 176
    iget-wide v9, v4, La/on30;->e:J

    .line 177
    .line 178
    add-long/2addr v5, v9

    .line 179
    iget-wide v9, v1, La/on30;->b:J

    .line 180
    .line 181
    sub-long v4, v5, v9

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :goto_3
    move v4, v2

    .line 185
    :goto_4
    iget-object v5, v3, La/pn30;->q:Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-ge v4, v5, :cond_9

    .line 192
    .line 193
    iget-object v5, v3, La/pn30;->q:Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    check-cast v5, La/nn30;

    .line 200
    .line 201
    iget-object v5, v5, La/nn30;->g:La/on30;

    .line 202
    .line 203
    iget-wide v6, v5, La/on30;->e:J

    .line 204
    .line 205
    iget-wide v9, v1, La/on30;->e:J

    .line 206
    .line 207
    cmp-long v16, v6, v25

    .line 208
    .line 209
    if-eqz v16, :cond_7

    .line 210
    .line 211
    cmp-long v6, v6, v9

    .line 212
    .line 213
    if-nez v6, :cond_8

    .line 214
    .line 215
    :cond_7
    iget-wide v6, v5, La/on30;->b:J

    .line 216
    .line 217
    iget-wide v9, v1, La/on30;->b:J

    .line 218
    .line 219
    cmp-long v6, v6, v9

    .line 220
    .line 221
    if-nez v6, :cond_8

    .line 222
    .line 223
    iget-object v5, v5, La/on30;->a:La/vn30;

    .line 224
    .line 225
    iget-object v6, v1, La/on30;->a:La/vn30;

    .line 226
    .line 227
    invoke-virtual {v5, v6}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_8

    .line 232
    .line 233
    iget-object v5, v3, La/pn30;->q:Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    check-cast v4, La/nn30;

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_9
    move-object v4, v15

    .line 246
    :goto_5
    if-nez v4, :cond_a

    .line 247
    .line 248
    iget-object v4, v3, La/pn30;->e:La/z9f;

    .line 249
    .line 250
    iget-object v4, v4, La/z9f;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v4, La/dmo;

    .line 253
    .line 254
    new-instance v16, La/nn30;

    .line 255
    .line 256
    iget-object v5, v4, La/dmo;->b:[La/j16;

    .line 257
    .line 258
    iget-object v6, v4, La/dmo;->d:La/syj;

    .line 259
    .line 260
    iget-object v7, v4, La/dmo;->f:La/xvj;

    .line 261
    .line 262
    iget-object v9, v4, La/dmo;->u:La/a4a0;

    .line 263
    .line 264
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    new-instance v10, La/lhf0;

    .line 268
    .line 269
    invoke-direct {v10, v7, v9}, La/lhf0;-><init>(La/xvj;La/a4a0;)V

    .line 270
    .line 271
    .line 272
    iget-object v7, v4, La/dmo;->r:La/jo30;

    .line 273
    .line 274
    iget-object v9, v4, La/dmo;->e:La/ucs0;

    .line 275
    .line 276
    iget-object v4, v4, La/dmo;->D1:La/flo;

    .line 277
    .line 278
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    move-object/from16 v23, v1

    .line 282
    .line 283
    move-object/from16 v17, v5

    .line 284
    .line 285
    move-object/from16 v20, v6

    .line 286
    .line 287
    move-object/from16 v22, v7

    .line 288
    .line 289
    move-object/from16 v24, v9

    .line 290
    .line 291
    move-object/from16 v21, v10

    .line 292
    .line 293
    invoke-direct/range {v16 .. v24}, La/nn30;-><init>([La/j16;JLa/syj;La/lhf0;La/jo30;La/on30;La/ucs0;)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v4, v16

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_a
    move-wide/from16 v5, v18

    .line 300
    .line 301
    iput-object v1, v4, La/nn30;->g:La/on30;

    .line 302
    .line 303
    iput-wide v5, v4, La/nn30;->p:J

    .line 304
    .line 305
    :goto_6
    iget-object v5, v3, La/pn30;->l:La/nn30;

    .line 306
    .line 307
    if-eqz v5, :cond_c

    .line 308
    .line 309
    iget-object v6, v5, La/nn30;->m:La/nn30;

    .line 310
    .line 311
    if-ne v4, v6, :cond_b

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_b
    invoke-virtual {v5}, La/nn30;->b()V

    .line 315
    .line 316
    .line 317
    iput-object v4, v5, La/nn30;->m:La/nn30;

    .line 318
    .line 319
    invoke-virtual {v5}, La/nn30;->c()V

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_c
    iput-object v4, v3, La/pn30;->i:La/nn30;

    .line 324
    .line 325
    iget-object v5, v3, La/pn30;->j:[La/nn30;

    .line 326
    .line 327
    invoke-static {v5, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iget-object v5, v3, La/pn30;->k:[La/nn30;

    .line 331
    .line 332
    invoke-static {v5, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    :goto_7
    iput-object v15, v3, La/pn30;->o:Ljava/lang/Object;

    .line 336
    .line 337
    iput-object v4, v3, La/pn30;->l:La/nn30;

    .line 338
    .line 339
    iget v5, v3, La/pn30;->n:I

    .line 340
    .line 341
    add-int/2addr v5, v13

    .line 342
    iput v5, v3, La/pn30;->n:I

    .line 343
    .line 344
    invoke-virtual {v3}, La/pn30;->q()V

    .line 345
    .line 346
    .line 347
    iget-boolean v3, v4, La/nn30;->d:Z

    .line 348
    .line 349
    if-nez v3, :cond_d

    .line 350
    .line 351
    iget-wide v5, v1, La/on30;->b:J

    .line 352
    .line 353
    iput-boolean v13, v4, La/nn30;->d:Z

    .line 354
    .line 355
    iget-object v3, v4, La/nn30;->a:La/f930;

    .line 356
    .line 357
    invoke-virtual {v3, v0, v5, v6}, La/f930;->r(La/ln30;J)V

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_d
    iget-boolean v3, v4, La/nn30;->e:Z

    .line 362
    .line 363
    if-eqz v3, :cond_e

    .line 364
    .line 365
    iget-object v3, v0, La/dmo;->g:La/q9o0;

    .line 366
    .line 367
    const/16 v5, 0x8

    .line 368
    .line 369
    iget-object v6, v4, La/nn30;->a:La/f930;

    .line 370
    .line 371
    invoke-virtual {v3, v5, v6}, La/q9o0;->c(ILjava/lang/Object;)La/p9o0;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-virtual {v3}, La/p9o0;->b()V

    .line 376
    .line 377
    .line 378
    :cond_e
    :goto_8
    iget-object v3, v0, La/dmo;->q:La/pn30;

    .line 379
    .line 380
    iget-object v3, v3, La/pn30;->i:La/nn30;

    .line 381
    .line 382
    if-ne v3, v4, :cond_f

    .line 383
    .line 384
    iget-wide v3, v1, La/on30;->b:J

    .line 385
    .line 386
    invoke-virtual {v0, v13, v3, v4}, La/dmo;->Q(ZJ)V

    .line 387
    .line 388
    .line 389
    :cond_f
    invoke-virtual {v0, v2}, La/dmo;->t(Z)V

    .line 390
    .line 391
    .line 392
    :cond_10
    :goto_9
    iget-boolean v1, v0, La/dmo;->p1:Z

    .line 393
    .line 394
    if-eqz v1, :cond_11

    .line 395
    .line 396
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 397
    .line 398
    iget-object v1, v1, La/pn30;->l:La/nn30;

    .line 399
    .line 400
    invoke-static {v1}, La/dmo;->y(La/nn30;)Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    iput-boolean v1, v0, La/dmo;->p1:Z

    .line 405
    .line 406
    invoke-virtual {v0}, La/dmo;->x0()V

    .line 407
    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_11
    invoke-virtual {v0}, La/dmo;->C()V

    .line 411
    .line 412
    .line 413
    :goto_a
    iget-object v6, v0, La/dmo;->q:La/pn30;

    .line 414
    .line 415
    iget-boolean v1, v0, La/dmo;->m1:Z

    .line 416
    .line 417
    const-wide/32 v9, 0x989680

    .line 418
    .line 419
    .line 420
    if-nez v1, :cond_13

    .line 421
    .line 422
    iget-boolean v1, v0, La/dmo;->y:Z

    .line 423
    .line 424
    if-eqz v1, :cond_13

    .line 425
    .line 426
    iget-boolean v1, v0, La/dmo;->F1:Z

    .line 427
    .line 428
    if-nez v1, :cond_13

    .line 429
    .line 430
    invoke-virtual {v0}, La/dmo;->e()Z

    .line 431
    .line 432
    .line 433
    move-result v1

    .line 434
    if-eqz v1, :cond_12

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_12
    invoke-virtual {v6}, La/pn30;->c()La/nn30;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    if-eqz v1, :cond_13

    .line 442
    .line 443
    invoke-virtual {v6}, La/pn30;->d()La/nn30;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    if-eq v1, v3, :cond_14

    .line 448
    .line 449
    :cond_13
    :goto_b
    move-wide/from16 v18, v9

    .line 450
    .line 451
    move v10, v2

    .line 452
    goto/16 :goto_11

    .line 453
    .line 454
    :cond_14
    iget-object v1, v1, La/nn30;->m:La/nn30;

    .line 455
    .line 456
    if-eqz v1, :cond_13

    .line 457
    .line 458
    iget-boolean v3, v1, La/nn30;->e:Z

    .line 459
    .line 460
    if-nez v3, :cond_15

    .line 461
    .line 462
    goto :goto_b

    .line 463
    :cond_15
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1}, La/nn30;->e()J

    .line 467
    .line 468
    .line 469
    move-result-wide v3

    .line 470
    move-wide/from16 v16, v3

    .line 471
    .line 472
    iget-wide v2, v0, La/dmo;->x1:J

    .line 473
    .line 474
    sub-long v3, v16, v2

    .line 475
    .line 476
    long-to-float v2, v3

    .line 477
    iget-object v3, v0, La/dmo;->m:La/cwj;

    .line 478
    .line 479
    invoke-virtual {v3}, La/cwj;->d()La/zx90;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    iget v3, v3, La/zx90;->a:F

    .line 484
    .line 485
    div-float/2addr v2, v3

    .line 486
    float-to-long v2, v2

    .line 487
    cmp-long v2, v2, v9

    .line 488
    .line 489
    if-lez v2, :cond_16

    .line 490
    .line 491
    move-wide/from16 v18, v9

    .line 492
    .line 493
    const/4 v10, 0x0

    .line 494
    goto/16 :goto_11

    .line 495
    .line 496
    :cond_16
    const/4 v2, 0x0

    .line 497
    :goto_c
    iget-object v3, v6, La/pn30;->k:[La/nn30;

    .line 498
    .line 499
    array-length v4, v3

    .line 500
    if-ge v2, v4, :cond_17

    .line 501
    .line 502
    aget-object v4, v3, v2

    .line 503
    .line 504
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    iget-object v4, v4, La/nn30;->m:La/nn30;

    .line 508
    .line 509
    aput-object v4, v3, v2

    .line 510
    .line 511
    invoke-virtual {v6}, La/pn30;->q()V

    .line 512
    .line 513
    .line 514
    add-int/lit8 v2, v2, 0x1

    .line 515
    .line 516
    goto :goto_c

    .line 517
    :cond_17
    iget-object v7, v0, La/dmo;->a:[La/ujf0;

    .line 518
    .line 519
    const/4 v2, 0x0

    .line 520
    invoke-virtual {v6}, La/pn30;->c()La/nn30;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    if-nez v1, :cond_18

    .line 525
    .line 526
    goto :goto_b

    .line 527
    :cond_18
    iget-object v3, v1, La/nn30;->o:La/ucs0;

    .line 528
    .line 529
    move v4, v2

    .line 530
    :goto_d
    array-length v5, v7

    .line 531
    if-ge v2, v5, :cond_1e

    .line 532
    .line 533
    invoke-virtual {v3, v2}, La/ucs0;->p(I)Z

    .line 534
    .line 535
    .line 536
    move-result v5

    .line 537
    if-eqz v5, :cond_1d

    .line 538
    .line 539
    aget-object v5, v7, v2

    .line 540
    .line 541
    iget-object v4, v5, La/ujf0;->f:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v4, La/j16;

    .line 544
    .line 545
    if-eqz v4, :cond_1c

    .line 546
    .line 547
    invoke-virtual {v5}, La/ujf0;->g()Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-nez v4, :cond_1c

    .line 552
    .line 553
    aget-object v4, v7, v2

    .line 554
    .line 555
    invoke-virtual {v4}, La/ujf0;->g()Z

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    xor-int/2addr v5, v13

    .line 560
    invoke-static {v5}, La/x0x;->K(Z)V

    .line 561
    .line 562
    .line 563
    iget-object v5, v4, La/ujf0;->e:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v5, La/j16;

    .line 566
    .line 567
    invoke-static {v5}, La/ujf0;->k(La/j16;)Z

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    if-eqz v5, :cond_19

    .line 572
    .line 573
    iput v14, v4, La/ujf0;->d:I

    .line 574
    .line 575
    :goto_e
    move-object v4, v3

    .line 576
    goto :goto_f

    .line 577
    :cond_19
    iget-object v5, v4, La/ujf0;->f:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v5, La/j16;

    .line 580
    .line 581
    if-eqz v5, :cond_1a

    .line 582
    .line 583
    iget-byte v5, v5, La/j16;->h:B

    .line 584
    .line 585
    if-eqz v5, :cond_1a

    .line 586
    .line 587
    iput v8, v4, La/ujf0;->d:I

    .line 588
    .line 589
    goto :goto_e

    .line 590
    :cond_1a
    iget v5, v4, La/ujf0;->d:I

    .line 591
    .line 592
    if-nez v5, :cond_1b

    .line 593
    .line 594
    iput v12, v4, La/ujf0;->d:I

    .line 595
    .line 596
    goto :goto_e

    .line 597
    :cond_1b
    const/4 v11, 0x3

    .line 598
    iput v11, v4, La/ujf0;->d:I

    .line 599
    .line 600
    goto :goto_e

    .line 601
    :goto_f
    const/4 v3, 0x0

    .line 602
    move-object/from16 v17, v4

    .line 603
    .line 604
    invoke-virtual {v1}, La/nn30;->e()J

    .line 605
    .line 606
    .line 607
    move-result-wide v4

    .line 608
    move-wide/from16 v18, v9

    .line 609
    .line 610
    const/4 v10, 0x0

    .line 611
    invoke-virtual/range {v0 .. v5}, La/dmo;->j(La/nn30;IZJ)V

    .line 612
    .line 613
    .line 614
    goto :goto_10

    .line 615
    :cond_1c
    move-object/from16 v17, v3

    .line 616
    .line 617
    move-wide/from16 v18, v9

    .line 618
    .line 619
    const/4 v10, 0x0

    .line 620
    goto :goto_10

    .line 621
    :cond_1d
    move-object/from16 v17, v3

    .line 622
    .line 623
    move-wide/from16 v18, v9

    .line 624
    .line 625
    move v10, v4

    .line 626
    :goto_10
    add-int/lit8 v2, v2, 0x1

    .line 627
    .line 628
    move v4, v10

    .line 629
    move-object/from16 v3, v17

    .line 630
    .line 631
    move-wide/from16 v9, v18

    .line 632
    .line 633
    goto :goto_d

    .line 634
    :cond_1e
    move-wide/from16 v18, v9

    .line 635
    .line 636
    move v10, v4

    .line 637
    invoke-virtual {v0}, La/dmo;->e()Z

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    if-eqz v2, :cond_1f

    .line 642
    .line 643
    iget-object v2, v1, La/nn30;->a:La/f930;

    .line 644
    .line 645
    invoke-virtual {v2}, La/f930;->h()J

    .line 646
    .line 647
    .line 648
    move-result-wide v2

    .line 649
    iput-wide v2, v0, La/dmo;->E1:J

    .line 650
    .line 651
    invoke-virtual {v1}, La/nn30;->g()Z

    .line 652
    .line 653
    .line 654
    move-result v2

    .line 655
    if-nez v2, :cond_1f

    .line 656
    .line 657
    invoke-virtual {v6, v1}, La/pn30;->s(La/nn30;)I

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0, v10}, La/dmo;->t(Z)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v0}, La/dmo;->C()V

    .line 664
    .line 665
    .line 666
    :cond_1f
    :goto_11
    iget-boolean v9, v0, La/dmo;->y:Z

    .line 667
    .line 668
    iget-object v1, v0, La/dmo;->a:[La/ujf0;

    .line 669
    .line 670
    iget-object v2, v0, La/dmo;->q:La/pn30;

    .line 671
    .line 672
    invoke-virtual {v2}, La/pn30;->d()La/nn30;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    if-nez v3, :cond_20

    .line 677
    .line 678
    goto/16 :goto_23

    .line 679
    .line 680
    :cond_20
    iget-object v4, v3, La/nn30;->m:La/nn30;

    .line 681
    .line 682
    if-eqz v4, :cond_21

    .line 683
    .line 684
    iget-boolean v4, v0, La/dmo;->m1:Z

    .line 685
    .line 686
    if-eqz v4, :cond_22

    .line 687
    .line 688
    :cond_21
    move-object v13, v1

    .line 689
    goto/16 :goto_1f

    .line 690
    .line 691
    :cond_22
    invoke-virtual {v2}, La/pn30;->d()La/nn30;

    .line 692
    .line 693
    .line 694
    move-result-object v4

    .line 695
    iget-boolean v5, v4, La/nn30;->e:Z

    .line 696
    .line 697
    if-nez v5, :cond_23

    .line 698
    .line 699
    goto/16 :goto_23

    .line 700
    .line 701
    :cond_23
    iget-object v5, v0, La/dmo;->a:[La/ujf0;

    .line 702
    .line 703
    array-length v6, v5

    .line 704
    move v7, v10

    .line 705
    :goto_12
    if-ge v7, v6, :cond_24

    .line 706
    .line 707
    aget-object v11, v5, v7

    .line 708
    .line 709
    iget-object v15, v11, La/ujf0;->e:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v15, La/j16;

    .line 712
    .line 713
    invoke-virtual {v11, v4, v15}, La/ujf0;->e(La/nn30;La/j16;)Z

    .line 714
    .line 715
    .line 716
    move-result v15

    .line 717
    if-eqz v15, :cond_40

    .line 718
    .line 719
    iget-object v15, v11, La/ujf0;->f:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v15, La/j16;

    .line 722
    .line 723
    invoke-virtual {v11, v4, v15}, La/ujf0;->e(La/nn30;La/j16;)Z

    .line 724
    .line 725
    .line 726
    move-result v11

    .line 727
    if-eqz v11, :cond_40

    .line 728
    .line 729
    add-int/lit8 v7, v7, 0x1

    .line 730
    .line 731
    const/4 v15, 0x0

    .line 732
    goto :goto_12

    .line 733
    :cond_24
    invoke-virtual {v0}, La/dmo;->e()Z

    .line 734
    .line 735
    .line 736
    move-result v4

    .line 737
    if-eqz v4, :cond_25

    .line 738
    .line 739
    invoke-virtual {v2}, La/pn30;->c()La/nn30;

    .line 740
    .line 741
    .line 742
    move-result-object v4

    .line 743
    invoke-virtual {v2}, La/pn30;->d()La/nn30;

    .line 744
    .line 745
    .line 746
    move-result-object v5

    .line 747
    if-eq v4, v5, :cond_40

    .line 748
    .line 749
    :cond_25
    iget-object v4, v3, La/nn30;->m:La/nn30;

    .line 750
    .line 751
    iget-boolean v5, v4, La/nn30;->e:Z

    .line 752
    .line 753
    if-nez v5, :cond_26

    .line 754
    .line 755
    iget-wide v5, v0, La/dmo;->x1:J

    .line 756
    .line 757
    invoke-virtual {v4}, La/nn30;->e()J

    .line 758
    .line 759
    .line 760
    move-result-wide v20

    .line 761
    cmp-long v4, v5, v20

    .line 762
    .line 763
    if-gez v4, :cond_26

    .line 764
    .line 765
    goto/16 :goto_23

    .line 766
    .line 767
    :cond_26
    iget-object v4, v3, La/nn30;->m:La/nn30;

    .line 768
    .line 769
    iget-boolean v5, v4, La/nn30;->e:Z

    .line 770
    .line 771
    if-eqz v5, :cond_27

    .line 772
    .line 773
    invoke-static {v5}, La/x0x;->K(Z)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v4}, La/nn30;->e()J

    .line 777
    .line 778
    .line 779
    move-result-wide v4

    .line 780
    iget-wide v6, v0, La/dmo;->x1:J

    .line 781
    .line 782
    sub-long/2addr v4, v6

    .line 783
    long-to-float v4, v4

    .line 784
    iget-object v5, v0, La/dmo;->m:La/cwj;

    .line 785
    .line 786
    invoke-virtual {v5}, La/cwj;->d()La/zx90;

    .line 787
    .line 788
    .line 789
    move-result-object v5

    .line 790
    iget v5, v5, La/zx90;->a:F

    .line 791
    .line 792
    div-float/2addr v4, v5

    .line 793
    float-to-long v4, v4

    .line 794
    cmp-long v4, v4, v18

    .line 795
    .line 796
    if-lez v4, :cond_27

    .line 797
    .line 798
    goto/16 :goto_23

    .line 799
    .line 800
    :cond_27
    iget-object v15, v3, La/nn30;->o:La/ucs0;

    .line 801
    .line 802
    move v4, v10

    .line 803
    :goto_13
    iget-object v5, v2, La/pn30;->j:[La/nn30;

    .line 804
    .line 805
    array-length v6, v5

    .line 806
    if-ge v4, v6, :cond_29

    .line 807
    .line 808
    iget-object v6, v2, La/pn30;->k:[La/nn30;

    .line 809
    .line 810
    aget-object v7, v6, v4

    .line 811
    .line 812
    aget-object v11, v5, v4

    .line 813
    .line 814
    if-eq v7, v11, :cond_28

    .line 815
    .line 816
    goto :goto_14

    .line 817
    :cond_28
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    iget-object v7, v11, La/nn30;->m:La/nn30;

    .line 821
    .line 822
    aput-object v7, v6, v4

    .line 823
    .line 824
    :goto_14
    aget-object v6, v5, v4

    .line 825
    .line 826
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    iget-object v6, v6, La/nn30;->m:La/nn30;

    .line 830
    .line 831
    aput-object v6, v5, v4

    .line 832
    .line 833
    invoke-virtual {v2}, La/pn30;->q()V

    .line 834
    .line 835
    .line 836
    aget-object v5, v5, v4

    .line 837
    .line 838
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    add-int/lit8 v4, v4, 0x1

    .line 842
    .line 843
    goto :goto_13

    .line 844
    :cond_29
    aget-object v11, v5, v10

    .line 845
    .line 846
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    iget-object v4, v11, La/nn30;->o:La/ucs0;

    .line 850
    .line 851
    iget-object v5, v0, La/dmo;->i1:La/yx90;

    .line 852
    .line 853
    iget-object v5, v5, La/yx90;->a:La/bmq0;

    .line 854
    .line 855
    iget-object v6, v11, La/nn30;->g:La/on30;

    .line 856
    .line 857
    iget-object v6, v6, La/on30;->a:La/vn30;

    .line 858
    .line 859
    iget-object v3, v3, La/nn30;->g:La/on30;

    .line 860
    .line 861
    iget-object v3, v3, La/on30;->a:La/vn30;

    .line 862
    .line 863
    move-object v7, v1

    .line 864
    move-object/from16 v18, v2

    .line 865
    .line 866
    move-object v1, v5

    .line 867
    move-object v2, v6

    .line 868
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    move-object/from16 v19, v7

    .line 874
    .line 875
    const/4 v7, 0x0

    .line 876
    move-object/from16 v20, v4

    .line 877
    .line 878
    move-object v4, v3

    .line 879
    move-object v3, v1

    .line 880
    move/from16 v22, v9

    .line 881
    .line 882
    move-object/from16 v29, v18

    .line 883
    .line 884
    move-object/from16 v13, v19

    .line 885
    .line 886
    move-object/from16 v14, v20

    .line 887
    .line 888
    move-wide/from16 v9, v25

    .line 889
    .line 890
    invoke-virtual/range {v0 .. v7}, La/dmo;->C0(La/bmq0;La/vn30;La/bmq0;La/vn30;JZ)V

    .line 891
    .line 892
    .line 893
    iget-boolean v1, v11, La/nn30;->e:Z

    .line 894
    .line 895
    const/4 v2, -0x2

    .line 896
    if-eqz v1, :cond_34

    .line 897
    .line 898
    if-eqz v22, :cond_2a

    .line 899
    .line 900
    iget-wide v3, v0, La/dmo;->E1:J

    .line 901
    .line 902
    cmp-long v1, v3, v9

    .line 903
    .line 904
    if-nez v1, :cond_2b

    .line 905
    .line 906
    :cond_2a
    iget-object v1, v11, La/nn30;->a:La/f930;

    .line 907
    .line 908
    invoke-virtual {v1}, La/f930;->h()J

    .line 909
    .line 910
    .line 911
    move-result-wide v3

    .line 912
    cmp-long v1, v3, v9

    .line 913
    .line 914
    if-eqz v1, :cond_34

    .line 915
    .line 916
    :cond_2b
    iput-wide v9, v0, La/dmo;->E1:J

    .line 917
    .line 918
    if-eqz v22, :cond_2c

    .line 919
    .line 920
    iget-boolean v1, v0, La/dmo;->F1:Z

    .line 921
    .line 922
    if-nez v1, :cond_2c

    .line 923
    .line 924
    const/4 v1, 0x1

    .line 925
    goto :goto_15

    .line 926
    :cond_2c
    const/4 v1, 0x0

    .line 927
    :goto_15
    if-eqz v1, :cond_2f

    .line 928
    .line 929
    const/4 v3, 0x0

    .line 930
    :goto_16
    array-length v4, v13

    .line 931
    if-ge v3, v4, :cond_2f

    .line 932
    .line 933
    invoke-virtual {v14, v3}, La/ucs0;->p(I)Z

    .line 934
    .line 935
    .line 936
    move-result v4

    .line 937
    iget-object v5, v14, La/ucs0;->d:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v5, [La/fmo;

    .line 940
    .line 941
    if-eqz v4, :cond_2e

    .line 942
    .line 943
    aget-object v4, v13, v3

    .line 944
    .line 945
    iget-object v4, v4, La/ujf0;->e:Ljava/lang/Object;

    .line 946
    .line 947
    check-cast v4, La/j16;

    .line 948
    .line 949
    iget-byte v4, v4, La/j16;->b:B

    .line 950
    .line 951
    if-ne v4, v2, :cond_2d

    .line 952
    .line 953
    goto :goto_17

    .line 954
    :cond_2d
    aget-object v4, v5, v3

    .line 955
    .line 956
    invoke-interface {v4}, La/fmo;->r()Landroidx/media3/common/b;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    iget-object v4, v4, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 961
    .line 962
    aget-object v5, v5, v3

    .line 963
    .line 964
    invoke-interface {v5}, La/fmo;->r()Landroidx/media3/common/b;

    .line 965
    .line 966
    .line 967
    move-result-object v5

    .line 968
    iget-object v5, v5, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 969
    .line 970
    invoke-static {v4, v5}, La/mg40;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 971
    .line 972
    .line 973
    move-result v4

    .line 974
    if-nez v4, :cond_2e

    .line 975
    .line 976
    aget-object v4, v13, v3

    .line 977
    .line 978
    invoke-virtual {v4}, La/ujf0;->g()Z

    .line 979
    .line 980
    .line 981
    move-result v4

    .line 982
    if-nez v4, :cond_2e

    .line 983
    .line 984
    const/4 v1, 0x0

    .line 985
    goto :goto_18

    .line 986
    :cond_2e
    :goto_17
    add-int/lit8 v3, v3, 0x1

    .line 987
    .line 988
    goto :goto_16

    .line 989
    :cond_2f
    :goto_18
    if-nez v1, :cond_34

    .line 990
    .line 991
    invoke-virtual {v11}, La/nn30;->e()J

    .line 992
    .line 993
    .line 994
    move-result-wide v1

    .line 995
    array-length v3, v13

    .line 996
    const/4 v4, 0x0

    .line 997
    :goto_19
    if-ge v4, v3, :cond_32

    .line 998
    .line 999
    aget-object v5, v13, v4

    .line 1000
    .line 1001
    iget-object v6, v5, La/ujf0;->f:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v6, La/j16;

    .line 1004
    .line 1005
    iget-object v7, v5, La/ujf0;->e:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v7, La/j16;

    .line 1008
    .line 1009
    invoke-static {v7}, La/ujf0;->k(La/j16;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v14

    .line 1013
    if-eqz v14, :cond_30

    .line 1014
    .line 1015
    iget v14, v5, La/ujf0;->d:I

    .line 1016
    .line 1017
    if-eq v14, v8, :cond_30

    .line 1018
    .line 1019
    if-eq v14, v12, :cond_30

    .line 1020
    .line 1021
    invoke-static {v7, v1, v2}, La/ujf0;->o(La/j16;J)V

    .line 1022
    .line 1023
    .line 1024
    :cond_30
    if-eqz v6, :cond_31

    .line 1025
    .line 1026
    iget-byte v7, v6, La/j16;->h:B

    .line 1027
    .line 1028
    if-eqz v7, :cond_31

    .line 1029
    .line 1030
    iget v5, v5, La/ujf0;->d:I

    .line 1031
    .line 1032
    const/4 v7, 0x4

    .line 1033
    if-eq v5, v7, :cond_31

    .line 1034
    .line 1035
    const/4 v7, 0x3

    .line 1036
    if-eq v5, v7, :cond_31

    .line 1037
    .line 1038
    move-object v5, v11

    .line 1039
    invoke-static {v6, v1, v2}, La/ujf0;->o(La/j16;J)V

    .line 1040
    .line 1041
    .line 1042
    goto :goto_1a

    .line 1043
    :cond_31
    move-object v5, v11

    .line 1044
    :goto_1a
    add-int/lit8 v4, v4, 0x1

    .line 1045
    .line 1046
    move-object v11, v5

    .line 1047
    goto :goto_19

    .line 1048
    :cond_32
    move-object v5, v11

    .line 1049
    invoke-virtual {v5}, La/nn30;->g()Z

    .line 1050
    .line 1051
    .line 1052
    move-result v1

    .line 1053
    if-nez v1, :cond_33

    .line 1054
    .line 1055
    move-object/from16 v1, v29

    .line 1056
    .line 1057
    invoke-virtual {v1, v5}, La/pn30;->s(La/nn30;)I

    .line 1058
    .line 1059
    .line 1060
    const/4 v1, 0x0

    .line 1061
    invoke-virtual {v0, v1}, La/dmo;->t(Z)V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v0}, La/dmo;->C()V

    .line 1065
    .line 1066
    .line 1067
    :cond_33
    move-wide/from16 v25, v9

    .line 1068
    .line 1069
    goto/16 :goto_23

    .line 1070
    .line 1071
    :cond_34
    move-object v5, v11

    .line 1072
    array-length v1, v13

    .line 1073
    const/4 v3, 0x0

    .line 1074
    :goto_1b
    if-ge v3, v1, :cond_33

    .line 1075
    .line 1076
    aget-object v4, v13, v3

    .line 1077
    .line 1078
    invoke-virtual {v5}, La/nn30;->e()J

    .line 1079
    .line 1080
    .line 1081
    move-result-wide v6

    .line 1082
    iget-object v8, v4, La/ujf0;->e:Ljava/lang/Object;

    .line 1083
    .line 1084
    check-cast v8, La/j16;

    .line 1085
    .line 1086
    move-wide/from16 v25, v9

    .line 1087
    .line 1088
    iget v9, v4, La/ujf0;->c:I

    .line 1089
    .line 1090
    invoke-virtual {v15, v9}, La/ucs0;->p(I)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v10

    .line 1094
    invoke-virtual {v14, v9}, La/ucs0;->p(I)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v20

    .line 1098
    iget-object v11, v4, La/ujf0;->f:Ljava/lang/Object;

    .line 1099
    .line 1100
    check-cast v11, La/j16;

    .line 1101
    .line 1102
    if-eqz v11, :cond_35

    .line 1103
    .line 1104
    iget v12, v4, La/ujf0;->d:I

    .line 1105
    .line 1106
    const/4 v2, 0x4

    .line 1107
    if-eq v12, v2, :cond_35

    .line 1108
    .line 1109
    const/4 v2, 0x3

    .line 1110
    if-eq v12, v2, :cond_36

    .line 1111
    .line 1112
    if-nez v12, :cond_37

    .line 1113
    .line 1114
    invoke-static {v8}, La/ujf0;->k(La/j16;)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v12

    .line 1118
    if-eqz v12, :cond_37

    .line 1119
    .line 1120
    goto :goto_1c

    .line 1121
    :cond_35
    const/4 v2, 0x3

    .line 1122
    :cond_36
    :goto_1c
    move-object v11, v8

    .line 1123
    :cond_37
    if-eqz v10, :cond_3a

    .line 1124
    .line 1125
    iget-boolean v10, v11, La/j16;->n:Z

    .line 1126
    .line 1127
    if-nez v10, :cond_3a

    .line 1128
    .line 1129
    iget-byte v8, v8, La/j16;->b:B

    .line 1130
    .line 1131
    const/4 v10, -0x2

    .line 1132
    if-ne v8, v10, :cond_38

    .line 1133
    .line 1134
    const/4 v8, 0x1

    .line 1135
    goto :goto_1d

    .line 1136
    :cond_38
    const/4 v8, 0x0

    .line 1137
    :goto_1d
    iget-object v12, v15, La/ucs0;->c:Ljava/lang/Object;

    .line 1138
    .line 1139
    check-cast v12, [La/tjf0;

    .line 1140
    .line 1141
    aget-object v12, v12, v9

    .line 1142
    .line 1143
    iget-object v2, v14, La/ucs0;->c:Ljava/lang/Object;

    .line 1144
    .line 1145
    check-cast v2, [La/tjf0;

    .line 1146
    .line 1147
    aget-object v2, v2, v9

    .line 1148
    .line 1149
    if-eqz v20, :cond_39

    .line 1150
    .line 1151
    invoke-static {v2, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v2

    .line 1155
    if-eqz v2, :cond_39

    .line 1156
    .line 1157
    if-nez v8, :cond_39

    .line 1158
    .line 1159
    invoke-virtual {v4}, La/ujf0;->g()Z

    .line 1160
    .line 1161
    .line 1162
    move-result v2

    .line 1163
    if-eqz v2, :cond_3b

    .line 1164
    .line 1165
    :cond_39
    invoke-static {v11, v6, v7}, La/ujf0;->o(La/j16;J)V

    .line 1166
    .line 1167
    .line 1168
    goto :goto_1e

    .line 1169
    :cond_3a
    const/4 v10, -0x2

    .line 1170
    :cond_3b
    :goto_1e
    add-int/lit8 v3, v3, 0x1

    .line 1171
    .line 1172
    move v2, v10

    .line 1173
    move-wide/from16 v9, v25

    .line 1174
    .line 1175
    const/4 v8, 0x5

    .line 1176
    const/4 v12, 0x2

    .line 1177
    goto :goto_1b

    .line 1178
    :goto_1f
    iget-object v1, v3, La/nn30;->g:La/on30;

    .line 1179
    .line 1180
    iget-boolean v1, v1, La/on30;->i:Z

    .line 1181
    .line 1182
    if-nez v1, :cond_3c

    .line 1183
    .line 1184
    iget-boolean v1, v0, La/dmo;->m1:Z

    .line 1185
    .line 1186
    if-eqz v1, :cond_40

    .line 1187
    .line 1188
    :cond_3c
    array-length v1, v13

    .line 1189
    const/4 v2, 0x0

    .line 1190
    :goto_20
    if-ge v2, v1, :cond_40

    .line 1191
    .line 1192
    aget-object v4, v13, v2

    .line 1193
    .line 1194
    invoke-virtual {v4, v3}, La/ujf0;->i(La/nn30;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v5

    .line 1198
    if-nez v5, :cond_3d

    .line 1199
    .line 1200
    goto :goto_22

    .line 1201
    :cond_3d
    invoke-virtual {v4, v3}, La/ujf0;->d(La/nn30;)La/j16;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v5

    .line 1205
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v5}, La/j16;->l()Z

    .line 1209
    .line 1210
    .line 1211
    move-result v5

    .line 1212
    if-eqz v5, :cond_3f

    .line 1213
    .line 1214
    iget-object v5, v3, La/nn30;->g:La/on30;

    .line 1215
    .line 1216
    iget-wide v5, v5, La/on30;->e:J

    .line 1217
    .line 1218
    cmp-long v7, v5, v25

    .line 1219
    .line 1220
    if-eqz v7, :cond_3e

    .line 1221
    .line 1222
    const-wide/high16 v7, -0x8000000000000000L

    .line 1223
    .line 1224
    cmp-long v7, v5, v7

    .line 1225
    .line 1226
    if-eqz v7, :cond_3e

    .line 1227
    .line 1228
    iget-wide v7, v3, La/nn30;->p:J

    .line 1229
    .line 1230
    add-long v6, v7, v5

    .line 1231
    .line 1232
    goto :goto_21

    .line 1233
    :cond_3e
    move-wide/from16 v6, v25

    .line 1234
    .line 1235
    :goto_21
    invoke-virtual {v4, v3}, La/ujf0;->d(La/nn30;)La/j16;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v4

    .line 1239
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1240
    .line 1241
    .line 1242
    invoke-static {v4, v6, v7}, La/ujf0;->o(La/j16;J)V

    .line 1243
    .line 1244
    .line 1245
    :cond_3f
    :goto_22
    add-int/lit8 v2, v2, 0x1

    .line 1246
    .line 1247
    goto :goto_20

    .line 1248
    :cond_40
    :goto_23
    iget-object v6, v0, La/dmo;->q:La/pn30;

    .line 1249
    .line 1250
    invoke-virtual {v6}, La/pn30;->d()La/nn30;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v1

    .line 1254
    if-eqz v1, :cond_49

    .line 1255
    .line 1256
    iget-object v2, v6, La/pn30;->i:La/nn30;

    .line 1257
    .line 1258
    if-eq v2, v1, :cond_49

    .line 1259
    .line 1260
    const/4 v2, 0x0

    .line 1261
    :goto_24
    iget-object v3, v0, La/dmo;->a:[La/ujf0;

    .line 1262
    .line 1263
    array-length v3, v3

    .line 1264
    if-ge v2, v3, :cond_49

    .line 1265
    .line 1266
    iget-object v3, v1, La/nn30;->h:[Z

    .line 1267
    .line 1268
    aget-boolean v3, v3, v2

    .line 1269
    .line 1270
    if-nez v3, :cond_48

    .line 1271
    .line 1272
    invoke-virtual {v6}, La/pn30;->d()La/nn30;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v1

    .line 1276
    iget-object v7, v1, La/nn30;->o:La/ucs0;

    .line 1277
    .line 1278
    iget-object v8, v0, La/dmo;->a:[La/ujf0;

    .line 1279
    .line 1280
    array-length v2, v8

    .line 1281
    const/4 v3, 0x0

    .line 1282
    const/4 v9, 0x1

    .line 1283
    :goto_25
    if-ge v3, v2, :cond_45

    .line 1284
    .line 1285
    aget-object v4, v8, v3

    .line 1286
    .line 1287
    invoke-virtual {v4}, La/ujf0;->c()I

    .line 1288
    .line 1289
    .line 1290
    move-result v5

    .line 1291
    iget-object v10, v0, La/dmo;->m:La/cwj;

    .line 1292
    .line 1293
    iget-object v11, v4, La/ujf0;->e:Ljava/lang/Object;

    .line 1294
    .line 1295
    check-cast v11, La/j16;

    .line 1296
    .line 1297
    invoke-virtual {v4, v11, v1, v7, v10}, La/ujf0;->m(La/j16;La/nn30;La/ucs0;La/cwj;)I

    .line 1298
    .line 1299
    .line 1300
    move-result v11

    .line 1301
    iget-object v12, v4, La/ujf0;->f:Ljava/lang/Object;

    .line 1302
    .line 1303
    check-cast v12, La/j16;

    .line 1304
    .line 1305
    invoke-virtual {v4, v12, v1, v7, v10}, La/ujf0;->m(La/j16;La/nn30;La/ucs0;La/cwj;)I

    .line 1306
    .line 1307
    .line 1308
    move-result v10

    .line 1309
    const/4 v12, 0x1

    .line 1310
    if-ne v11, v12, :cond_41

    .line 1311
    .line 1312
    move v11, v10

    .line 1313
    :cond_41
    and-int/lit8 v10, v11, 0x2

    .line 1314
    .line 1315
    if-eqz v10, :cond_43

    .line 1316
    .line 1317
    iget-boolean v10, v0, La/dmo;->u1:Z

    .line 1318
    .line 1319
    if-eqz v10, :cond_43

    .line 1320
    .line 1321
    if-nez v10, :cond_42

    .line 1322
    .line 1323
    goto :goto_26

    .line 1324
    :cond_42
    const/4 v10, 0x0

    .line 1325
    iput-boolean v10, v0, La/dmo;->u1:Z

    .line 1326
    .line 1327
    iget-object v10, v0, La/dmo;->i1:La/yx90;

    .line 1328
    .line 1329
    iget-boolean v10, v10, La/yx90;->p:Z

    .line 1330
    .line 1331
    if-eqz v10, :cond_43

    .line 1332
    .line 1333
    iget-object v10, v0, La/dmo;->g:La/q9o0;

    .line 1334
    .line 1335
    const/4 v12, 0x2

    .line 1336
    invoke-virtual {v10, v12}, La/q9o0;->h(I)V

    .line 1337
    .line 1338
    .line 1339
    :cond_43
    :goto_26
    iget v10, v0, La/dmo;->v1:I

    .line 1340
    .line 1341
    invoke-virtual {v4}, La/ujf0;->c()I

    .line 1342
    .line 1343
    .line 1344
    move-result v4

    .line 1345
    sub-int/2addr v5, v4

    .line 1346
    sub-int/2addr v10, v5

    .line 1347
    iput v10, v0, La/dmo;->v1:I

    .line 1348
    .line 1349
    and-int/lit8 v4, v11, 0x1

    .line 1350
    .line 1351
    if-eqz v4, :cond_44

    .line 1352
    .line 1353
    const/4 v4, 0x1

    .line 1354
    goto :goto_27

    .line 1355
    :cond_44
    const/4 v4, 0x0

    .line 1356
    :goto_27
    and-int/2addr v9, v4

    .line 1357
    add-int/lit8 v3, v3, 0x1

    .line 1358
    .line 1359
    goto :goto_25

    .line 1360
    :cond_45
    if-eqz v9, :cond_47

    .line 1361
    .line 1362
    const/4 v2, 0x0

    .line 1363
    :goto_28
    array-length v3, v8

    .line 1364
    if-ge v2, v3, :cond_47

    .line 1365
    .line 1366
    invoke-virtual {v7, v2}, La/ucs0;->p(I)Z

    .line 1367
    .line 1368
    .line 1369
    move-result v3

    .line 1370
    if-eqz v3, :cond_46

    .line 1371
    .line 1372
    aget-object v3, v8, v2

    .line 1373
    .line 1374
    invoke-virtual {v3, v1}, La/ujf0;->i(La/nn30;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v3

    .line 1378
    if-nez v3, :cond_46

    .line 1379
    .line 1380
    const/4 v3, 0x0

    .line 1381
    invoke-virtual {v1}, La/nn30;->e()J

    .line 1382
    .line 1383
    .line 1384
    move-result-wide v4

    .line 1385
    const/4 v11, 0x3

    .line 1386
    invoke-virtual/range {v0 .. v5}, La/dmo;->j(La/nn30;IZJ)V

    .line 1387
    .line 1388
    .line 1389
    goto :goto_29

    .line 1390
    :cond_46
    const/4 v11, 0x3

    .line 1391
    :goto_29
    add-int/lit8 v2, v2, 0x1

    .line 1392
    .line 1393
    goto :goto_28

    .line 1394
    :cond_47
    const/4 v11, 0x3

    .line 1395
    if-eqz v9, :cond_4a

    .line 1396
    .line 1397
    invoke-virtual {v6}, La/pn30;->d()La/nn30;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v1

    .line 1401
    invoke-virtual {v0, v1}, La/dmo;->a0(La/nn30;)V

    .line 1402
    .line 1403
    .line 1404
    goto :goto_2a

    .line 1405
    :cond_48
    const/4 v11, 0x3

    .line 1406
    add-int/lit8 v2, v2, 0x1

    .line 1407
    .line 1408
    goto/16 :goto_24

    .line 1409
    .line 1410
    :cond_49
    const/4 v11, 0x3

    .line 1411
    :cond_4a
    :goto_2a
    iget-object v10, v0, La/dmo;->a:[La/ujf0;

    .line 1412
    .line 1413
    iget-object v12, v0, La/dmo;->q:La/pn30;

    .line 1414
    .line 1415
    const/4 v2, 0x0

    .line 1416
    :goto_2b
    invoke-virtual {v0}, La/dmo;->s0()Z

    .line 1417
    .line 1418
    .line 1419
    move-result v1

    .line 1420
    if-nez v1, :cond_4c

    .line 1421
    .line 1422
    :cond_4b
    :goto_2c
    move v14, v11

    .line 1423
    const/4 v11, 0x5

    .line 1424
    goto/16 :goto_38

    .line 1425
    .line 1426
    :cond_4c
    iget-boolean v1, v0, La/dmo;->m1:Z

    .line 1427
    .line 1428
    if-eqz v1, :cond_4d

    .line 1429
    .line 1430
    goto :goto_2c

    .line 1431
    :cond_4d
    iget-object v1, v12, La/pn30;->i:La/nn30;

    .line 1432
    .line 1433
    if-nez v1, :cond_4e

    .line 1434
    .line 1435
    goto :goto_2c

    .line 1436
    :cond_4e
    iget-object v1, v1, La/nn30;->m:La/nn30;

    .line 1437
    .line 1438
    if-eqz v1, :cond_4b

    .line 1439
    .line 1440
    iget-wide v3, v0, La/dmo;->x1:J

    .line 1441
    .line 1442
    invoke-virtual {v1}, La/nn30;->e()J

    .line 1443
    .line 1444
    .line 1445
    move-result-wide v5

    .line 1446
    cmp-long v3, v3, v5

    .line 1447
    .line 1448
    if-ltz v3, :cond_4b

    .line 1449
    .line 1450
    const/4 v3, 0x0

    .line 1451
    :goto_2d
    iget-object v4, v0, La/dmo;->a:[La/ujf0;

    .line 1452
    .line 1453
    array-length v4, v4

    .line 1454
    if-ge v3, v4, :cond_50

    .line 1455
    .line 1456
    iget-object v4, v1, La/nn30;->h:[Z

    .line 1457
    .line 1458
    aget-boolean v4, v4, v3

    .line 1459
    .line 1460
    if-nez v4, :cond_4f

    .line 1461
    .line 1462
    goto :goto_2c

    .line 1463
    :cond_4f
    add-int/lit8 v3, v3, 0x1

    .line 1464
    .line 1465
    goto :goto_2d

    .line 1466
    :cond_50
    const/4 v1, -0x1

    .line 1467
    if-eqz v2, :cond_51

    .line 1468
    .line 1469
    invoke-virtual {v0, v1}, La/dmo;->E(I)V

    .line 1470
    .line 1471
    .line 1472
    :cond_51
    const/4 v2, 0x0

    .line 1473
    iput-boolean v2, v0, La/dmo;->F1:Z

    .line 1474
    .line 1475
    invoke-virtual {v12}, La/pn30;->a()La/nn30;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v13

    .line 1479
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1480
    .line 1481
    .line 1482
    iget-object v2, v0, La/dmo;->i1:La/yx90;

    .line 1483
    .line 1484
    iget-object v2, v2, La/yx90;->b:La/vn30;

    .line 1485
    .line 1486
    iget-object v2, v2, La/vn30;->a:Ljava/lang/Object;

    .line 1487
    .line 1488
    iget-object v3, v13, La/nn30;->g:La/on30;

    .line 1489
    .line 1490
    iget-object v3, v3, La/on30;->a:La/vn30;

    .line 1491
    .line 1492
    iget-object v3, v3, La/vn30;->a:Ljava/lang/Object;

    .line 1493
    .line 1494
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1495
    .line 1496
    .line 1497
    move-result v2

    .line 1498
    if-eqz v2, :cond_52

    .line 1499
    .line 1500
    iget-object v2, v0, La/dmo;->i1:La/yx90;

    .line 1501
    .line 1502
    iget-object v2, v2, La/yx90;->b:La/vn30;

    .line 1503
    .line 1504
    iget v3, v2, La/vn30;->b:I

    .line 1505
    .line 1506
    if-ne v3, v1, :cond_52

    .line 1507
    .line 1508
    iget-object v3, v13, La/nn30;->g:La/on30;

    .line 1509
    .line 1510
    iget-object v3, v3, La/on30;->a:La/vn30;

    .line 1511
    .line 1512
    iget v4, v3, La/vn30;->b:I

    .line 1513
    .line 1514
    if-ne v4, v1, :cond_52

    .line 1515
    .line 1516
    iget v1, v2, La/vn30;->e:I

    .line 1517
    .line 1518
    iget v2, v3, La/vn30;->e:I

    .line 1519
    .line 1520
    if-eq v1, v2, :cond_52

    .line 1521
    .line 1522
    const/4 v2, 0x1

    .line 1523
    goto :goto_2e

    .line 1524
    :cond_52
    const/4 v2, 0x0

    .line 1525
    :goto_2e
    iget-object v1, v13, La/nn30;->g:La/on30;

    .line 1526
    .line 1527
    iget-object v3, v1, La/on30;->a:La/vn30;

    .line 1528
    .line 1529
    move v4, v2

    .line 1530
    move-object v5, v3

    .line 1531
    iget-wide v2, v1, La/on30;->b:J

    .line 1532
    .line 1533
    iget-wide v6, v1, La/on30;->d:J

    .line 1534
    .line 1535
    const/16 v18, 0x1

    .line 1536
    .line 1537
    xor-int/lit8 v8, v4, 0x1

    .line 1538
    .line 1539
    const/4 v9, 0x0

    .line 1540
    move-object v1, v5

    .line 1541
    move-wide v4, v6

    .line 1542
    move-wide v6, v2

    .line 1543
    move v14, v11

    .line 1544
    const/4 v11, 0x5

    .line 1545
    invoke-virtual/range {v0 .. v9}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v1

    .line 1549
    iput-object v1, v0, La/dmo;->i1:La/yx90;

    .line 1550
    .line 1551
    invoke-virtual {v0}, La/dmo;->P()V

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v0}, La/dmo;->B0()V

    .line 1555
    .line 1556
    .line 1557
    const/4 v2, 0x0

    .line 1558
    :goto_2f
    array-length v1, v10

    .line 1559
    if-ge v2, v1, :cond_5c

    .line 1560
    .line 1561
    iget-boolean v1, v0, La/dmo;->y:Z

    .line 1562
    .line 1563
    if-nez v1, :cond_53

    .line 1564
    .line 1565
    const/4 v1, 0x0

    .line 1566
    goto :goto_30

    .line 1567
    :cond_53
    iget-object v1, v0, La/dmo;->a:[La/ujf0;

    .line 1568
    .line 1569
    aget-object v1, v1, v2

    .line 1570
    .line 1571
    invoke-virtual {v1}, La/ujf0;->g()Z

    .line 1572
    .line 1573
    .line 1574
    move-result v1

    .line 1575
    :goto_30
    if-eqz v1, :cond_5b

    .line 1576
    .line 1577
    iget-object v1, v12, La/pn30;->k:[La/nn30;

    .line 1578
    .line 1579
    aget-object v1, v1, v2

    .line 1580
    .line 1581
    if-eq v13, v1, :cond_54

    .line 1582
    .line 1583
    goto :goto_35

    .line 1584
    :cond_54
    aget-object v1, v10, v2

    .line 1585
    .line 1586
    iget v3, v1, La/ujf0;->d:I

    .line 1587
    .line 1588
    const/4 v7, 0x4

    .line 1589
    if-eq v3, v7, :cond_57

    .line 1590
    .line 1591
    if-ne v3, v11, :cond_55

    .line 1592
    .line 1593
    goto :goto_31

    .line 1594
    :cond_55
    const/4 v4, 0x2

    .line 1595
    if-ne v3, v4, :cond_56

    .line 1596
    .line 1597
    const/4 v4, 0x0

    .line 1598
    iput v4, v1, La/ujf0;->d:I

    .line 1599
    .line 1600
    goto :goto_35

    .line 1601
    :cond_56
    if-ne v3, v14, :cond_5b

    .line 1602
    .line 1603
    const/4 v3, 0x1

    .line 1604
    iput v3, v1, La/ujf0;->d:I

    .line 1605
    .line 1606
    goto :goto_35

    .line 1607
    :cond_57
    :goto_31
    if-ne v3, v11, :cond_58

    .line 1608
    .line 1609
    const/4 v3, 0x1

    .line 1610
    goto :goto_32

    .line 1611
    :cond_58
    const/4 v3, 0x0

    .line 1612
    :goto_32
    iget-object v4, v1, La/ujf0;->e:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast v4, La/j16;

    .line 1615
    .line 1616
    iget-object v5, v1, La/ujf0;->f:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast v5, La/j16;

    .line 1619
    .line 1620
    const/16 v6, 0x11

    .line 1621
    .line 1622
    if-eqz v3, :cond_59

    .line 1623
    .line 1624
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1625
    .line 1626
    .line 1627
    invoke-interface {v5, v6, v4}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 1628
    .line 1629
    .line 1630
    goto :goto_33

    .line 1631
    :cond_59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1632
    .line 1633
    .line 1634
    invoke-interface {v4, v6, v5}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 1635
    .line 1636
    .line 1637
    :goto_33
    iget v3, v1, La/ujf0;->d:I

    .line 1638
    .line 1639
    if-ne v3, v11, :cond_5a

    .line 1640
    .line 1641
    const/4 v3, 0x0

    .line 1642
    goto :goto_34

    .line 1643
    :cond_5a
    const/4 v3, 0x1

    .line 1644
    :goto_34
    iput v3, v1, La/ujf0;->d:I

    .line 1645
    .line 1646
    :cond_5b
    :goto_35
    add-int/lit8 v2, v2, 0x1

    .line 1647
    .line 1648
    goto :goto_2f

    .line 1649
    :cond_5c
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 1650
    .line 1651
    iget v1, v1, La/yx90;->e:I

    .line 1652
    .line 1653
    if-ne v1, v14, :cond_5d

    .line 1654
    .line 1655
    invoke-virtual {v0}, La/dmo;->u0()V

    .line 1656
    .line 1657
    .line 1658
    :cond_5d
    iget-object v1, v12, La/pn30;->i:La/nn30;

    .line 1659
    .line 1660
    iget-object v1, v1, La/nn30;->o:La/ucs0;

    .line 1661
    .line 1662
    const/4 v2, 0x0

    .line 1663
    :goto_36
    array-length v3, v10

    .line 1664
    if-ge v2, v3, :cond_61

    .line 1665
    .line 1666
    invoke-virtual {v1, v2}, La/ucs0;->p(I)Z

    .line 1667
    .line 1668
    .line 1669
    move-result v3

    .line 1670
    if-nez v3, :cond_5e

    .line 1671
    .line 1672
    goto :goto_37

    .line 1673
    :cond_5e
    aget-object v3, v10, v2

    .line 1674
    .line 1675
    iget-object v4, v3, La/ujf0;->f:Ljava/lang/Object;

    .line 1676
    .line 1677
    check-cast v4, La/j16;

    .line 1678
    .line 1679
    iget-object v3, v3, La/ujf0;->e:Ljava/lang/Object;

    .line 1680
    .line 1681
    check-cast v3, La/j16;

    .line 1682
    .line 1683
    invoke-static {v3}, La/ujf0;->k(La/j16;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v5

    .line 1687
    if-eqz v5, :cond_5f

    .line 1688
    .line 1689
    invoke-virtual {v3}, La/j16;->h()V

    .line 1690
    .line 1691
    .line 1692
    goto :goto_37

    .line 1693
    :cond_5f
    if-eqz v4, :cond_60

    .line 1694
    .line 1695
    iget-byte v3, v4, La/j16;->h:B

    .line 1696
    .line 1697
    if-eqz v3, :cond_60

    .line 1698
    .line 1699
    invoke-virtual {v4}, La/j16;->h()V

    .line 1700
    .line 1701
    .line 1702
    :cond_60
    :goto_37
    add-int/lit8 v2, v2, 0x1

    .line 1703
    .line 1704
    goto :goto_36

    .line 1705
    :cond_61
    move v11, v14

    .line 1706
    const/4 v2, 0x1

    .line 1707
    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    goto/16 :goto_2b

    .line 1713
    .line 1714
    :goto_38
    iget-object v1, v0, La/dmo;->D1:La/flo;

    .line 1715
    .line 1716
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1717
    .line 1718
    .line 1719
    :goto_39
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 1720
    .line 1721
    iget-object v1, v1, La/pn30;->i:La/nn30;

    .line 1722
    .line 1723
    if-nez v1, :cond_62

    .line 1724
    .line 1725
    move-wide/from16 v2, v27

    .line 1726
    .line 1727
    invoke-virtual {v0, v2, v3}, La/dmo;->U(J)V

    .line 1728
    .line 1729
    .line 1730
    return-void

    .line 1731
    :cond_62
    move-wide/from16 v2, v27

    .line 1732
    .line 1733
    const-string v4, "doSomeWork"

    .line 1734
    .line 1735
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v0}, La/dmo;->B0()V

    .line 1739
    .line 1740
    .line 1741
    iget-boolean v4, v1, La/nn30;->e:Z

    .line 1742
    .line 1743
    if-eqz v4, :cond_6e

    .line 1744
    .line 1745
    iget-object v4, v0, La/dmo;->o:La/l9o0;

    .line 1746
    .line 1747
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1748
    .line 1749
    .line 1750
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1751
    .line 1752
    .line 1753
    move-result-wide v4

    .line 1754
    invoke-static {v4, v5}, La/vtt0;->M(J)J

    .line 1755
    .line 1756
    .line 1757
    move-result-wide v4

    .line 1758
    iput-wide v4, v0, La/dmo;->y1:J

    .line 1759
    .line 1760
    iget-object v4, v1, La/nn30;->a:La/f930;

    .line 1761
    .line 1762
    iget-object v5, v0, La/dmo;->i1:La/yx90;

    .line 1763
    .line 1764
    iget-wide v5, v5, La/yx90;->s:J

    .line 1765
    .line 1766
    iget-wide v7, v0, La/dmo;->l:J

    .line 1767
    .line 1768
    sub-long/2addr v5, v7

    .line 1769
    invoke-virtual {v4, v5, v6}, La/f930;->m(J)V

    .line 1770
    .line 1771
    .line 1772
    const/4 v4, 0x0

    .line 1773
    const/4 v5, 0x0

    .line 1774
    const/4 v6, 0x1

    .line 1775
    const/4 v12, 0x1

    .line 1776
    :goto_3a
    iget-object v7, v0, La/dmo;->a:[La/ujf0;

    .line 1777
    .line 1778
    array-length v8, v7

    .line 1779
    if-ge v4, v8, :cond_6d

    .line 1780
    .line 1781
    aget-object v7, v7, v4

    .line 1782
    .line 1783
    invoke-virtual {v7}, La/ujf0;->c()I

    .line 1784
    .line 1785
    .line 1786
    move-result v8

    .line 1787
    if-nez v8, :cond_63

    .line 1788
    .line 1789
    const/4 v10, 0x0

    .line 1790
    invoke-virtual {v0, v4, v10}, La/dmo;->G(IZ)V

    .line 1791
    .line 1792
    .line 1793
    goto/16 :goto_40

    .line 1794
    .line 1795
    :cond_63
    iget-wide v8, v0, La/dmo;->x1:J

    .line 1796
    .line 1797
    iget-wide v14, v0, La/dmo;->y1:J

    .line 1798
    .line 1799
    iget-object v10, v7, La/ujf0;->f:Ljava/lang/Object;

    .line 1800
    .line 1801
    check-cast v10, La/j16;

    .line 1802
    .line 1803
    iget-object v13, v7, La/ujf0;->e:Ljava/lang/Object;

    .line 1804
    .line 1805
    check-cast v13, La/j16;

    .line 1806
    .line 1807
    invoke-static {v13}, La/ujf0;->k(La/j16;)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v20

    .line 1811
    if-eqz v20, :cond_64

    .line 1812
    .line 1813
    invoke-virtual {v13, v8, v9, v14, v15}, La/j16;->z(JJ)V

    .line 1814
    .line 1815
    .line 1816
    :cond_64
    if-eqz v10, :cond_65

    .line 1817
    .line 1818
    iget-byte v13, v10, La/j16;->h:B

    .line 1819
    .line 1820
    if-eqz v13, :cond_65

    .line 1821
    .line 1822
    invoke-virtual {v10, v8, v9, v14, v15}, La/j16;->z(JJ)V

    .line 1823
    .line 1824
    .line 1825
    :cond_65
    if-eqz v12, :cond_66

    .line 1826
    .line 1827
    invoke-virtual {v7}, La/ujf0;->f()Z

    .line 1828
    .line 1829
    .line 1830
    move-result v8

    .line 1831
    if-eqz v8, :cond_66

    .line 1832
    .line 1833
    const/4 v8, 0x1

    .line 1834
    goto :goto_3b

    .line 1835
    :cond_66
    const/4 v8, 0x0

    .line 1836
    :goto_3b
    iget-boolean v9, v0, La/dmo;->f1:Z

    .line 1837
    .line 1838
    if-eqz v9, :cond_68

    .line 1839
    .line 1840
    invoke-virtual {v7}, La/ujf0;->j()Z

    .line 1841
    .line 1842
    .line 1843
    move-result v9

    .line 1844
    if-eqz v9, :cond_68

    .line 1845
    .line 1846
    iget-object v9, v7, La/ujf0;->e:Ljava/lang/Object;

    .line 1847
    .line 1848
    check-cast v9, La/j16;

    .line 1849
    .line 1850
    iget-byte v9, v9, La/j16;->b:B

    .line 1851
    .line 1852
    const/4 v12, 0x2

    .line 1853
    if-eq v9, v12, :cond_67

    .line 1854
    .line 1855
    const/4 v10, 0x4

    .line 1856
    if-ne v9, v10, :cond_68

    .line 1857
    .line 1858
    :cond_67
    invoke-virtual {v7}, La/ujf0;->f()Z

    .line 1859
    .line 1860
    .line 1861
    move-result v9

    .line 1862
    if-nez v9, :cond_68

    .line 1863
    .line 1864
    const/4 v12, 0x1

    .line 1865
    goto :goto_3c

    .line 1866
    :cond_68
    move v12, v5

    .line 1867
    :goto_3c
    invoke-virtual {v7, v1}, La/ujf0;->d(La/nn30;)La/j16;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v5

    .line 1871
    if-eqz v5, :cond_6a

    .line 1872
    .line 1873
    invoke-virtual {v5}, La/j16;->l()Z

    .line 1874
    .line 1875
    .line 1876
    move-result v7

    .line 1877
    if-nez v7, :cond_6a

    .line 1878
    .line 1879
    invoke-virtual {v5}, La/j16;->o()Z

    .line 1880
    .line 1881
    .line 1882
    move-result v7

    .line 1883
    if-nez v7, :cond_6a

    .line 1884
    .line 1885
    invoke-virtual {v5}, La/j16;->m()Z

    .line 1886
    .line 1887
    .line 1888
    move-result v5

    .line 1889
    if-eqz v5, :cond_69

    .line 1890
    .line 1891
    goto :goto_3d

    .line 1892
    :cond_69
    const/4 v5, 0x0

    .line 1893
    goto :goto_3e

    .line 1894
    :cond_6a
    :goto_3d
    const/4 v5, 0x1

    .line 1895
    :goto_3e
    invoke-virtual {v0, v4, v5}, La/dmo;->G(IZ)V

    .line 1896
    .line 1897
    .line 1898
    if-eqz v6, :cond_6b

    .line 1899
    .line 1900
    if-eqz v5, :cond_6b

    .line 1901
    .line 1902
    const/4 v6, 0x1

    .line 1903
    goto :goto_3f

    .line 1904
    :cond_6b
    const/4 v6, 0x0

    .line 1905
    :goto_3f
    if-nez v5, :cond_6c

    .line 1906
    .line 1907
    invoke-virtual {v0, v4}, La/dmo;->F(I)V

    .line 1908
    .line 1909
    .line 1910
    :cond_6c
    move v5, v12

    .line 1911
    move v12, v8

    .line 1912
    :goto_40
    add-int/lit8 v4, v4, 0x1

    .line 1913
    .line 1914
    const/4 v14, 0x3

    .line 1915
    goto/16 :goto_3a

    .line 1916
    .line 1917
    :cond_6d
    iget-boolean v4, v0, La/dmo;->f1:Z

    .line 1918
    .line 1919
    if-eqz v4, :cond_6f

    .line 1920
    .line 1921
    if-nez v5, :cond_6f

    .line 1922
    .line 1923
    iget-object v4, v0, La/dmo;->g:La/q9o0;

    .line 1924
    .line 1925
    iget-object v4, v4, La/q9o0;->a:Landroid/os/Handler;

    .line 1926
    .line 1927
    const/16 v5, 0x25

    .line 1928
    .line 1929
    invoke-virtual {v4, v5}, Landroid/os/Handler;->hasMessages(I)Z

    .line 1930
    .line 1931
    .line 1932
    move-result v4

    .line 1933
    if-nez v4, :cond_6f

    .line 1934
    .line 1935
    iget-object v4, v0, La/dmo;->g:La/q9o0;

    .line 1936
    .line 1937
    invoke-virtual {v4, v5}, La/q9o0;->a(I)La/p9o0;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v4

    .line 1941
    invoke-virtual {v4}, La/p9o0;->b()V

    .line 1942
    .line 1943
    .line 1944
    goto :goto_41

    .line 1945
    :cond_6e
    iget-object v4, v1, La/nn30;->a:La/f930;

    .line 1946
    .line 1947
    invoke-virtual {v4}, La/f930;->l()V

    .line 1948
    .line 1949
    .line 1950
    const/4 v6, 0x1

    .line 1951
    const/4 v12, 0x1

    .line 1952
    :cond_6f
    :goto_41
    iget-object v4, v1, La/nn30;->g:La/on30;

    .line 1953
    .line 1954
    iget-wide v4, v4, La/on30;->e:J

    .line 1955
    .line 1956
    if-eqz v12, :cond_71

    .line 1957
    .line 1958
    iget-boolean v7, v1, La/nn30;->e:Z

    .line 1959
    .line 1960
    if-eqz v7, :cond_71

    .line 1961
    .line 1962
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    cmp-long v7, v4, v9

    .line 1968
    .line 1969
    if-eqz v7, :cond_70

    .line 1970
    .line 1971
    iget-object v7, v0, La/dmo;->i1:La/yx90;

    .line 1972
    .line 1973
    iget-wide v7, v7, La/yx90;->s:J

    .line 1974
    .line 1975
    cmp-long v4, v4, v7

    .line 1976
    .line 1977
    if-gtz v4, :cond_72

    .line 1978
    .line 1979
    :cond_70
    const/4 v4, 0x1

    .line 1980
    goto :goto_42

    .line 1981
    :cond_71
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    :cond_72
    const/4 v4, 0x0

    .line 1987
    :goto_42
    if-eqz v4, :cond_73

    .line 1988
    .line 1989
    iget-boolean v5, v0, La/dmo;->m1:Z

    .line 1990
    .line 1991
    if-eqz v5, :cond_73

    .line 1992
    .line 1993
    const/4 v5, 0x0

    .line 1994
    iput-boolean v5, v0, La/dmo;->m1:Z

    .line 1995
    .line 1996
    iget-object v7, v0, La/dmo;->i1:La/yx90;

    .line 1997
    .line 1998
    iget v7, v7, La/yx90;->n:I

    .line 1999
    .line 2000
    iget-object v8, v0, La/dmo;->j1:La/amo;

    .line 2001
    .line 2002
    invoke-virtual {v8, v5}, La/amo;->c(I)V

    .line 2003
    .line 2004
    .line 2005
    iget-object v8, v0, La/dmo;->z:La/x24;

    .line 2006
    .line 2007
    iget-object v12, v0, La/dmo;->i1:La/yx90;

    .line 2008
    .line 2009
    iget v12, v12, La/yx90;->e:I

    .line 2010
    .line 2011
    invoke-virtual {v8, v12, v5}, La/x24;->c(IZ)I

    .line 2012
    .line 2013
    .line 2014
    move-result v8

    .line 2015
    invoke-virtual {v0, v8, v7, v11, v5}, La/dmo;->A0(IIIZ)V

    .line 2016
    .line 2017
    .line 2018
    :cond_73
    if-eqz v4, :cond_75

    .line 2019
    .line 2020
    iget-object v4, v1, La/nn30;->g:La/on30;

    .line 2021
    .line 2022
    iget-boolean v4, v4, La/on30;->i:Z

    .line 2023
    .line 2024
    if-eqz v4, :cond_75

    .line 2025
    .line 2026
    const/4 v7, 0x4

    .line 2027
    invoke-virtual {v0, v7}, La/dmo;->o0(I)V

    .line 2028
    .line 2029
    .line 2030
    invoke-virtual {v0}, La/dmo;->w0()V

    .line 2031
    .line 2032
    .line 2033
    :cond_74
    const/4 v12, 0x1

    .line 2034
    goto/16 :goto_50

    .line 2035
    .line 2036
    :cond_75
    iget-object v4, v0, La/dmo;->i1:La/yx90;

    .line 2037
    .line 2038
    iget v5, v4, La/yx90;->e:I

    .line 2039
    .line 2040
    const/4 v12, 0x2

    .line 2041
    if-ne v5, v12, :cond_88

    .line 2042
    .line 2043
    iget-object v5, v0, La/dmo;->q:La/pn30;

    .line 2044
    .line 2045
    iget v7, v0, La/dmo;->v1:I

    .line 2046
    .line 2047
    if-nez v7, :cond_76

    .line 2048
    .line 2049
    invoke-virtual {v0}, La/dmo;->B()Z

    .line 2050
    .line 2051
    .line 2052
    move-result v4

    .line 2053
    move-wide/from16 v25, v9

    .line 2054
    .line 2055
    goto/16 :goto_4a

    .line 2056
    .line 2057
    :cond_76
    if-nez v6, :cond_78

    .line 2058
    .line 2059
    move-wide/from16 v25, v9

    .line 2060
    .line 2061
    :cond_77
    const/4 v4, 0x0

    .line 2062
    goto/16 :goto_4a

    .line 2063
    .line 2064
    :cond_78
    iget-boolean v7, v4, La/yx90;->g:Z

    .line 2065
    .line 2066
    if-nez v7, :cond_7b

    .line 2067
    .line 2068
    :cond_79
    :goto_43
    move-wide/from16 v25, v9

    .line 2069
    .line 2070
    :cond_7a
    :goto_44
    const/4 v4, 0x1

    .line 2071
    goto/16 :goto_4a

    .line 2072
    .line 2073
    :cond_7b
    iget-object v7, v5, La/pn30;->i:La/nn30;

    .line 2074
    .line 2075
    iget-object v4, v4, La/yx90;->a:La/bmq0;

    .line 2076
    .line 2077
    iget-object v8, v7, La/nn30;->g:La/on30;

    .line 2078
    .line 2079
    iget-object v8, v8, La/on30;->a:La/vn30;

    .line 2080
    .line 2081
    invoke-virtual {v0, v4, v8}, La/dmo;->t0(La/bmq0;La/vn30;)Z

    .line 2082
    .line 2083
    .line 2084
    move-result v4

    .line 2085
    if-eqz v4, :cond_7c

    .line 2086
    .line 2087
    iget-object v4, v0, La/dmo;->s:La/vvj;

    .line 2088
    .line 2089
    iget-wide v11, v4, La/vvj;->h:J

    .line 2090
    .line 2091
    goto :goto_45

    .line 2092
    :cond_7c
    move-wide v11, v9

    .line 2093
    :goto_45
    iget-object v4, v5, La/pn30;->l:La/nn30;

    .line 2094
    .line 2095
    invoke-virtual {v4}, La/nn30;->g()Z

    .line 2096
    .line 2097
    .line 2098
    move-result v5

    .line 2099
    if-eqz v5, :cond_7d

    .line 2100
    .line 2101
    iget-object v5, v4, La/nn30;->g:La/on30;

    .line 2102
    .line 2103
    iget-boolean v5, v5, La/on30;->i:Z

    .line 2104
    .line 2105
    if-eqz v5, :cond_7d

    .line 2106
    .line 2107
    const/4 v5, 0x1

    .line 2108
    goto :goto_46

    .line 2109
    :cond_7d
    const/4 v5, 0x0

    .line 2110
    :goto_46
    iget-object v8, v4, La/nn30;->g:La/on30;

    .line 2111
    .line 2112
    iget-object v8, v8, La/on30;->a:La/vn30;

    .line 2113
    .line 2114
    invoke-virtual {v8}, La/vn30;->c()Z

    .line 2115
    .line 2116
    .line 2117
    move-result v8

    .line 2118
    if-eqz v8, :cond_7e

    .line 2119
    .line 2120
    iget-boolean v8, v4, La/nn30;->e:Z

    .line 2121
    .line 2122
    if-nez v8, :cond_7e

    .line 2123
    .line 2124
    const/4 v8, 0x1

    .line 2125
    goto :goto_47

    .line 2126
    :cond_7e
    const/4 v8, 0x0

    .line 2127
    :goto_47
    if-nez v5, :cond_79

    .line 2128
    .line 2129
    if-eqz v8, :cond_7f

    .line 2130
    .line 2131
    goto :goto_43

    .line 2132
    :cond_7f
    invoke-virtual {v4}, La/nn30;->d()J

    .line 2133
    .line 2134
    .line 2135
    move-result-wide v4

    .line 2136
    invoke-virtual {v0, v4, v5}, La/dmo;->o(J)J

    .line 2137
    .line 2138
    .line 2139
    move-result-wide v4

    .line 2140
    iget-object v8, v0, La/dmo;->f:La/xvj;

    .line 2141
    .line 2142
    iget-object v13, v0, La/dmo;->u:La/a4a0;

    .line 2143
    .line 2144
    iget-object v14, v0, La/dmo;->i1:La/yx90;

    .line 2145
    .line 2146
    iget-object v14, v14, La/yx90;->a:La/bmq0;

    .line 2147
    .line 2148
    iget-object v7, v7, La/nn30;->g:La/on30;

    .line 2149
    .line 2150
    iget-object v7, v7, La/on30;->a:La/vn30;

    .line 2151
    .line 2152
    iget-object v15, v0, La/dmo;->m:La/cwj;

    .line 2153
    .line 2154
    invoke-virtual {v15}, La/cwj;->d()La/zx90;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v15

    .line 2158
    iget v15, v15, La/zx90;->a:F

    .line 2159
    .line 2160
    move-wide/from16 v25, v9

    .line 2161
    .line 2162
    iget-object v9, v0, La/dmo;->i1:La/yx90;

    .line 2163
    .line 2164
    iget-boolean v9, v9, La/yx90;->l:Z

    .line 2165
    .line 2166
    iget-boolean v9, v0, La/dmo;->n1:Z

    .line 2167
    .line 2168
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2169
    .line 2170
    .line 2171
    iget-object v7, v7, La/vn30;->a:Ljava/lang/Object;

    .line 2172
    .line 2173
    iget-object v10, v8, La/xvj;->b:La/amq0;

    .line 2174
    .line 2175
    invoke-virtual {v14, v7, v10}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v7

    .line 2179
    iget v7, v7, La/amq0;->c:I

    .line 2180
    .line 2181
    iget-object v10, v8, La/xvj;->a:Landroidx/media3/common/Timeline$Window;

    .line 2182
    .line 2183
    move-wide/from16 v27, v11

    .line 2184
    .line 2185
    const-wide/16 v11, 0x0

    .line 2186
    .line 2187
    invoke-virtual {v14, v7, v10, v11, v12}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v7

    .line 2191
    iget-object v7, v7, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 2192
    .line 2193
    iget-object v7, v7, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 2194
    .line 2195
    if-nez v7, :cond_81

    .line 2196
    .line 2197
    :cond_80
    const/4 v7, 0x0

    .line 2198
    goto :goto_48

    .line 2199
    :cond_81
    iget-object v7, v7, La/en30;->a:Landroid/net/Uri;

    .line 2200
    .line 2201
    invoke-virtual {v7}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v7

    .line 2205
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2206
    .line 2207
    .line 2208
    move-result v10

    .line 2209
    if-nez v10, :cond_82

    .line 2210
    .line 2211
    sget-object v10, La/xvj;->p:La/rcf0;

    .line 2212
    .line 2213
    invoke-virtual {v10, v7}, La/b4x;->contains(Ljava/lang/Object;)Z

    .line 2214
    .line 2215
    .line 2216
    move-result v7

    .line 2217
    if-eqz v7, :cond_80

    .line 2218
    .line 2219
    :cond_82
    const/4 v7, 0x1

    .line 2220
    :goto_48
    invoke-static {v15, v4, v5}, La/vtt0;->A(FJ)J

    .line 2221
    .line 2222
    .line 2223
    move-result-wide v4

    .line 2224
    if-eqz v9, :cond_84

    .line 2225
    .line 2226
    if-eqz v7, :cond_83

    .line 2227
    .line 2228
    iget-wide v9, v8, La/xvj;->k:J

    .line 2229
    .line 2230
    goto :goto_49

    .line 2231
    :cond_83
    iget-wide v9, v8, La/xvj;->j:J

    .line 2232
    .line 2233
    goto :goto_49

    .line 2234
    :cond_84
    if-eqz v7, :cond_85

    .line 2235
    .line 2236
    iget-wide v9, v8, La/xvj;->i:J

    .line 2237
    .line 2238
    goto :goto_49

    .line 2239
    :cond_85
    iget-wide v9, v8, La/xvj;->h:J

    .line 2240
    .line 2241
    :goto_49
    cmp-long v14, v27, v25

    .line 2242
    .line 2243
    if-eqz v14, :cond_86

    .line 2244
    .line 2245
    const-wide/16 v14, 0x2

    .line 2246
    .line 2247
    div-long v14, v27, v14

    .line 2248
    .line 2249
    invoke-static {v14, v15, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 2250
    .line 2251
    .line 2252
    move-result-wide v9

    .line 2253
    :cond_86
    cmp-long v11, v9, v11

    .line 2254
    .line 2255
    if-lez v11, :cond_7a

    .line 2256
    .line 2257
    cmp-long v4, v4, v9

    .line 2258
    .line 2259
    if-gez v4, :cond_7a

    .line 2260
    .line 2261
    if-nez v7, :cond_77

    .line 2262
    .line 2263
    iget-object v4, v8, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2264
    .line 2265
    invoke-virtual {v4, v13}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v4

    .line 2269
    check-cast v4, La/wvj;

    .line 2270
    .line 2271
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2272
    .line 2273
    .line 2274
    monitor-enter v4

    .line 2275
    :try_start_0
    iget v5, v4, La/wvj;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2276
    .line 2277
    monitor-exit v4

    .line 2278
    const/high16 v4, 0x10000

    .line 2279
    .line 2280
    mul-int/2addr v5, v4

    .line 2281
    iget-object v4, v8, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2282
    .line 2283
    invoke-virtual {v4, v13}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2284
    .line 2285
    .line 2286
    move-result-object v4

    .line 2287
    check-cast v4, La/wvj;

    .line 2288
    .line 2289
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2290
    .line 2291
    .line 2292
    iget v4, v4, La/wvj;->c:I

    .line 2293
    .line 2294
    if-lt v5, v4, :cond_77

    .line 2295
    .line 2296
    goto/16 :goto_44

    .line 2297
    .line 2298
    :catchall_0
    move-exception v0

    .line 2299
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2300
    throw v0

    .line 2301
    :goto_4a
    if-eqz v4, :cond_87

    .line 2302
    .line 2303
    const/4 v11, 0x3

    .line 2304
    invoke-virtual {v0, v11}, La/dmo;->o0(I)V

    .line 2305
    .line 2306
    .line 2307
    const/4 v4, 0x0

    .line 2308
    iput-object v4, v0, La/dmo;->B1:La/dlo;

    .line 2309
    .line 2310
    invoke-virtual {v0}, La/dmo;->s0()Z

    .line 2311
    .line 2312
    .line 2313
    move-result v4

    .line 2314
    if-eqz v4, :cond_74

    .line 2315
    .line 2316
    const/4 v10, 0x0

    .line 2317
    invoke-virtual {v0, v10, v10}, La/dmo;->D0(ZZ)V

    .line 2318
    .line 2319
    .line 2320
    iget-object v4, v0, La/dmo;->m:La/cwj;

    .line 2321
    .line 2322
    const/4 v12, 0x1

    .line 2323
    iput-boolean v12, v4, La/cwj;->b:Z

    .line 2324
    .line 2325
    iget-object v4, v4, La/cwj;->c:Ljava/lang/Object;

    .line 2326
    .line 2327
    check-cast v4, La/d4m0;

    .line 2328
    .line 2329
    invoke-virtual {v4}, La/d4m0;->f()V

    .line 2330
    .line 2331
    .line 2332
    invoke-virtual {v0}, La/dmo;->u0()V

    .line 2333
    .line 2334
    .line 2335
    goto/16 :goto_50

    .line 2336
    .line 2337
    :cond_87
    :goto_4b
    const/4 v12, 0x1

    .line 2338
    goto :goto_4c

    .line 2339
    :cond_88
    move-wide/from16 v25, v9

    .line 2340
    .line 2341
    goto :goto_4b

    .line 2342
    :goto_4c
    iget-object v4, v0, La/dmo;->i1:La/yx90;

    .line 2343
    .line 2344
    iget v4, v4, La/yx90;->e:I

    .line 2345
    .line 2346
    const/4 v11, 0x3

    .line 2347
    if-ne v4, v11, :cond_91

    .line 2348
    .line 2349
    iget v4, v0, La/dmo;->v1:I

    .line 2350
    .line 2351
    if-nez v4, :cond_89

    .line 2352
    .line 2353
    invoke-virtual {v0}, La/dmo;->B()Z

    .line 2354
    .line 2355
    .line 2356
    move-result v4

    .line 2357
    if-eqz v4, :cond_8a

    .line 2358
    .line 2359
    goto :goto_50

    .line 2360
    :cond_89
    if-nez v6, :cond_91

    .line 2361
    .line 2362
    :cond_8a
    invoke-virtual {v0}, La/dmo;->s0()Z

    .line 2363
    .line 2364
    .line 2365
    move-result v4

    .line 2366
    const/4 v10, 0x0

    .line 2367
    invoke-virtual {v0, v4, v10}, La/dmo;->D0(ZZ)V

    .line 2368
    .line 2369
    .line 2370
    const/4 v4, 0x2

    .line 2371
    invoke-virtual {v0, v4}, La/dmo;->o0(I)V

    .line 2372
    .line 2373
    .line 2374
    iget-boolean v4, v0, La/dmo;->n1:Z

    .line 2375
    .line 2376
    if-eqz v4, :cond_90

    .line 2377
    .line 2378
    iget-object v4, v0, La/dmo;->q:La/pn30;

    .line 2379
    .line 2380
    iget-object v4, v4, La/pn30;->i:La/nn30;

    .line 2381
    .line 2382
    :goto_4d
    if-eqz v4, :cond_8d

    .line 2383
    .line 2384
    iget-object v5, v4, La/nn30;->o:La/ucs0;

    .line 2385
    .line 2386
    iget-object v5, v5, La/ucs0;->d:Ljava/lang/Object;

    .line 2387
    .line 2388
    check-cast v5, [La/fmo;

    .line 2389
    .line 2390
    array-length v6, v5

    .line 2391
    const/4 v7, 0x0

    .line 2392
    :goto_4e
    if-ge v7, v6, :cond_8c

    .line 2393
    .line 2394
    aget-object v8, v5, v7

    .line 2395
    .line 2396
    if-eqz v8, :cond_8b

    .line 2397
    .line 2398
    invoke-interface {v8}, La/fmo;->u()V

    .line 2399
    .line 2400
    .line 2401
    :cond_8b
    add-int/lit8 v7, v7, 0x1

    .line 2402
    .line 2403
    goto :goto_4e

    .line 2404
    :cond_8c
    iget-object v4, v4, La/nn30;->m:La/nn30;

    .line 2405
    .line 2406
    goto :goto_4d

    .line 2407
    :cond_8d
    iget-object v4, v0, La/dmo;->s:La/vvj;

    .line 2408
    .line 2409
    iget-wide v5, v4, La/vvj;->h:J

    .line 2410
    .line 2411
    cmp-long v7, v5, v25

    .line 2412
    .line 2413
    if-nez v7, :cond_8e

    .line 2414
    .line 2415
    goto :goto_4f

    .line 2416
    :cond_8e
    iget-wide v7, v4, La/vvj;->b:J

    .line 2417
    .line 2418
    add-long/2addr v5, v7

    .line 2419
    iput-wide v5, v4, La/vvj;->h:J

    .line 2420
    .line 2421
    iget-wide v7, v4, La/vvj;->g:J

    .line 2422
    .line 2423
    cmp-long v9, v7, v25

    .line 2424
    .line 2425
    if-eqz v9, :cond_8f

    .line 2426
    .line 2427
    cmp-long v5, v5, v7

    .line 2428
    .line 2429
    if-lez v5, :cond_8f

    .line 2430
    .line 2431
    iput-wide v7, v4, La/vvj;->h:J

    .line 2432
    .line 2433
    :cond_8f
    move-wide/from16 v9, v25

    .line 2434
    .line 2435
    iput-wide v9, v4, La/vvj;->l:J

    .line 2436
    .line 2437
    :cond_90
    :goto_4f
    invoke-virtual {v0}, La/dmo;->w0()V

    .line 2438
    .line 2439
    .line 2440
    :cond_91
    :goto_50
    iget-object v4, v0, La/dmo;->i1:La/yx90;

    .line 2441
    .line 2442
    iget v4, v4, La/yx90;->e:I

    .line 2443
    .line 2444
    const/4 v5, 0x2

    .line 2445
    if-ne v4, v5, :cond_96

    .line 2446
    .line 2447
    const/4 v4, 0x0

    .line 2448
    :goto_51
    iget-object v5, v0, La/dmo;->a:[La/ujf0;

    .line 2449
    .line 2450
    array-length v6, v5

    .line 2451
    if-ge v4, v6, :cond_93

    .line 2452
    .line 2453
    aget-object v5, v5, v4

    .line 2454
    .line 2455
    invoke-virtual {v5, v1}, La/ujf0;->i(La/nn30;)Z

    .line 2456
    .line 2457
    .line 2458
    move-result v5

    .line 2459
    if-eqz v5, :cond_92

    .line 2460
    .line 2461
    invoke-virtual {v0, v4}, La/dmo;->F(I)V

    .line 2462
    .line 2463
    .line 2464
    :cond_92
    add-int/lit8 v4, v4, 0x1

    .line 2465
    .line 2466
    goto :goto_51

    .line 2467
    :cond_93
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 2468
    .line 2469
    iget-boolean v4, v1, La/yx90;->g:Z

    .line 2470
    .line 2471
    if-nez v4, :cond_96

    .line 2472
    .line 2473
    iget-wide v4, v1, La/yx90;->r:J

    .line 2474
    .line 2475
    const-wide/32 v6, 0x7a120

    .line 2476
    .line 2477
    .line 2478
    cmp-long v1, v4, v6

    .line 2479
    .line 2480
    if-gez v1, :cond_96

    .line 2481
    .line 2482
    iget-object v1, v0, La/dmo;->q:La/pn30;

    .line 2483
    .line 2484
    iget-object v1, v1, La/pn30;->l:La/nn30;

    .line 2485
    .line 2486
    invoke-static {v1}, La/dmo;->y(La/nn30;)Z

    .line 2487
    .line 2488
    .line 2489
    move-result v1

    .line 2490
    if-eqz v1, :cond_96

    .line 2491
    .line 2492
    invoke-virtual {v0}, La/dmo;->s0()Z

    .line 2493
    .line 2494
    .line 2495
    move-result v1

    .line 2496
    if-eqz v1, :cond_96

    .line 2497
    .line 2498
    iget-wide v4, v0, La/dmo;->C1:J

    .line 2499
    .line 2500
    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    cmp-long v1, v4, v25

    .line 2506
    .line 2507
    iget-object v4, v0, La/dmo;->o:La/l9o0;

    .line 2508
    .line 2509
    if-nez v1, :cond_94

    .line 2510
    .line 2511
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2512
    .line 2513
    .line 2514
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2515
    .line 2516
    .line 2517
    move-result-wide v4

    .line 2518
    iput-wide v4, v0, La/dmo;->C1:J

    .line 2519
    .line 2520
    goto :goto_52

    .line 2521
    :cond_94
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2522
    .line 2523
    .line 2524
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2525
    .line 2526
    .line 2527
    move-result-wide v4

    .line 2528
    iget-wide v6, v0, La/dmo;->C1:J

    .line 2529
    .line 2530
    sub-long/2addr v4, v6

    .line 2531
    const-wide/16 v6, 0xfa0

    .line 2532
    .line 2533
    cmp-long v1, v4, v6

    .line 2534
    .line 2535
    if-gez v1, :cond_95

    .line 2536
    .line 2537
    goto :goto_52

    .line 2538
    :cond_95
    new-instance v0, La/gum0;

    .line 2539
    .line 2540
    const/16 v1, 0xfa0

    .line 2541
    .line 2542
    const/4 v10, 0x0

    .line 2543
    invoke-direct {v0, v10, v1}, La/gum0;-><init>(II)V

    .line 2544
    .line 2545
    .line 2546
    throw v0

    .line 2547
    :cond_96
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    iput-wide v9, v0, La/dmo;->C1:J

    .line 2553
    .line 2554
    :goto_52
    invoke-virtual {v0}, La/dmo;->s0()Z

    .line 2555
    .line 2556
    .line 2557
    move-result v1

    .line 2558
    if-eqz v1, :cond_97

    .line 2559
    .line 2560
    iget-object v1, v0, La/dmo;->i1:La/yx90;

    .line 2561
    .line 2562
    iget v1, v1, La/yx90;->e:I

    .line 2563
    .line 2564
    const/4 v11, 0x3

    .line 2565
    if-ne v1, v11, :cond_97

    .line 2566
    .line 2567
    move v1, v12

    .line 2568
    goto :goto_53

    .line 2569
    :cond_97
    const/4 v1, 0x0

    .line 2570
    :goto_53
    iget-boolean v4, v0, La/dmo;->u1:Z

    .line 2571
    .line 2572
    if-eqz v4, :cond_98

    .line 2573
    .line 2574
    iget-boolean v4, v0, La/dmo;->t1:Z

    .line 2575
    .line 2576
    if-eqz v4, :cond_98

    .line 2577
    .line 2578
    if-eqz v1, :cond_98

    .line 2579
    .line 2580
    move v13, v12

    .line 2581
    goto :goto_54

    .line 2582
    :cond_98
    const/4 v13, 0x0

    .line 2583
    :goto_54
    iget-object v4, v0, La/dmo;->i1:La/yx90;

    .line 2584
    .line 2585
    iget-boolean v5, v4, La/yx90;->p:Z

    .line 2586
    .line 2587
    if-eq v5, v13, :cond_99

    .line 2588
    .line 2589
    invoke-virtual {v4, v13}, La/yx90;->i(Z)La/yx90;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v4

    .line 2593
    iput-object v4, v0, La/dmo;->i1:La/yx90;

    .line 2594
    .line 2595
    :cond_99
    const/4 v10, 0x0

    .line 2596
    iput-boolean v10, v0, La/dmo;->t1:Z

    .line 2597
    .line 2598
    if-nez v13, :cond_9c

    .line 2599
    .line 2600
    iget v4, v4, La/yx90;->e:I

    .line 2601
    .line 2602
    const/4 v7, 0x4

    .line 2603
    if-ne v4, v7, :cond_9a

    .line 2604
    .line 2605
    goto :goto_55

    .line 2606
    :cond_9a
    if-nez v1, :cond_9b

    .line 2607
    .line 2608
    const/4 v12, 0x2

    .line 2609
    if-eq v4, v12, :cond_9b

    .line 2610
    .line 2611
    const/4 v11, 0x3

    .line 2612
    if-ne v4, v11, :cond_9c

    .line 2613
    .line 2614
    iget v1, v0, La/dmo;->v1:I

    .line 2615
    .line 2616
    if-eqz v1, :cond_9c

    .line 2617
    .line 2618
    :cond_9b
    invoke-virtual {v0, v2, v3}, La/dmo;->U(J)V

    .line 2619
    .line 2620
    .line 2621
    :cond_9c
    :goto_55
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2622
    .line 2623
    .line 2624
    :cond_9d
    :goto_56
    return-void
.end method

.method public final i0(La/flo;)V
    .locals 2

    .line 1
    iput-object p1, p0, La/dmo;->D1:La/flo;

    .line 2
    .line 3
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 4
    .line 5
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 6
    .line 7
    iget-object p0, p0, La/dmo;->q:La/pn30;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La/pn30;->q:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    :goto_0
    iget-object v1, p0, La/pn30;->q:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ge v0, v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, La/pn30;->q:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/nn30;

    .line 44
    .line 45
    invoke-virtual {v1}, La/nn30;->i()V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iput-object p1, p0, La/pn30;->q:Ljava/util/ArrayList;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, La/pn30;->m:La/nn30;

    .line 55
    .line 56
    invoke-virtual {p0}, La/pn30;->p()V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final j(La/nn30;IZJ)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/dmo;->a:[La/ujf0;

    .line 6
    .line 7
    aget-object v10, v2, p2

    .line 8
    .line 9
    invoke-virtual {v10}, La/ujf0;->j()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, v10, La/ujf0;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, La/j16;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_a

    .line 20
    .line 21
    :cond_0
    iget-object v2, v0, La/dmo;->q:La/pn30;

    .line 22
    .line 23
    iget-object v2, v2, La/pn30;->i:La/nn30;

    .line 24
    .line 25
    const/4 v11, 0x1

    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    move v12, v11

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v12, 0x0

    .line 31
    :goto_0
    iget-object v2, v1, La/nn30;->o:La/ucs0;

    .line 32
    .line 33
    iget-object v5, v2, La/ucs0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, [La/tjf0;

    .line 36
    .line 37
    aget-object v5, v5, p2

    .line 38
    .line 39
    iget-object v2, v2, La/ucs0;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, [La/fmo;

    .line 42
    .line 43
    aget-object v2, v2, p2

    .line 44
    .line 45
    invoke-virtual {v0}, La/dmo;->s0()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    iget-object v6, v0, La/dmo;->i1:La/yx90;

    .line 52
    .line 53
    iget v6, v6, La/yx90;->e:I

    .line 54
    .line 55
    const/4 v7, 0x3

    .line 56
    if-ne v6, v7, :cond_2

    .line 57
    .line 58
    move v13, v11

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v13, 0x0

    .line 61
    :goto_1
    if-nez p3, :cond_3

    .line 62
    .line 63
    if-eqz v13, :cond_3

    .line 64
    .line 65
    move v14, v11

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    const/4 v14, 0x0

    .line 68
    :goto_2
    iget v6, v0, La/dmo;->v1:I

    .line 69
    .line 70
    add-int/2addr v6, v11

    .line 71
    iput v6, v0, La/dmo;->v1:I

    .line 72
    .line 73
    iget-object v6, v1, La/nn30;->c:[La/ixg0;

    .line 74
    .line 75
    aget-object v6, v6, p2

    .line 76
    .line 77
    iget-wide v7, v1, La/nn30;->p:J

    .line 78
    .line 79
    iget-object v9, v1, La/nn30;->g:La/on30;

    .line 80
    .line 81
    iget-object v9, v9, La/on30;->a:La/vn30;

    .line 82
    .line 83
    iget-object v15, v10, La/ujf0;->f:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v15, La/j16;

    .line 86
    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-interface {v2}, La/fmo;->length()I

    .line 90
    .line 91
    .line 92
    move-result v16

    .line 93
    move/from16 v4, v16

    .line 94
    .line 95
    :goto_3
    move-object/from16 v17, v3

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_4
    const/4 v4, 0x0

    .line 99
    goto :goto_3

    .line 100
    :goto_4
    new-array v3, v4, [Landroidx/media3/common/b;

    .line 101
    .line 102
    const/4 v11, 0x0

    .line 103
    :goto_5
    if-ge v11, v4, :cond_5

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v11}, La/fmo;->f(I)Landroidx/media3/common/b;

    .line 109
    .line 110
    .line 111
    move-result-object v18

    .line 112
    aput-object v18, v3, v11

    .line 113
    .line 114
    add-int/lit8 v11, v11, 0x1

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    iget v2, v10, La/ujf0;->d:I

    .line 118
    .line 119
    iget-object v11, v0, La/dmo;->m:La/cwj;

    .line 120
    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    const/4 v4, 0x2

    .line 124
    if-eq v2, v4, :cond_6

    .line 125
    .line 126
    const/4 v4, 0x5

    .line 127
    if-ne v2, v4, :cond_7

    .line 128
    .line 129
    :cond_6
    move-object v4, v6

    .line 130
    const/4 v15, 0x1

    .line 131
    goto :goto_7

    .line 132
    :cond_7
    const/4 v2, 0x1

    .line 133
    iput-boolean v2, v10, La/ujf0;->b:Z

    .line 134
    .line 135
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-byte v4, v15, La/j16;->h:B

    .line 139
    .line 140
    if-nez v4, :cond_8

    .line 141
    .line 142
    move v4, v2

    .line 143
    goto :goto_6

    .line 144
    :cond_8
    const/4 v4, 0x0

    .line 145
    :goto_6
    invoke-static {v4}, La/x0x;->K(Z)V

    .line 146
    .line 147
    .line 148
    iput-object v5, v15, La/j16;->d:La/tjf0;

    .line 149
    .line 150
    iput-object v9, v15, La/j16;->q:La/vn30;

    .line 151
    .line 152
    iput-byte v2, v15, La/j16;->h:B

    .line 153
    .line 154
    invoke-virtual {v15, v14, v12}, La/j16;->q(ZZ)V

    .line 155
    .line 156
    .line 157
    move-object v4, v15

    .line 158
    move v15, v2

    .line 159
    move-object v2, v4

    .line 160
    move-object v4, v6

    .line 161
    move-wide/from16 v5, p4

    .line 162
    .line 163
    invoke-virtual/range {v2 .. v9}, La/j16;->A([Landroidx/media3/common/b;La/ixg0;JJLa/vn30;)V

    .line 164
    .line 165
    .line 166
    move-object v4, v2

    .line 167
    move-wide v2, v5

    .line 168
    invoke-virtual {v4, v2, v3, v14, v15}, La/j16;->B(JZZ)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v11, v4}, La/cwj;->f(La/j16;)V

    .line 172
    .line 173
    .line 174
    goto :goto_9

    .line 175
    :goto_7
    iput-boolean v15, v10, La/ujf0;->a:Z

    .line 176
    .line 177
    move-object/from16 v2, v17

    .line 178
    .line 179
    iget-byte v6, v2, La/j16;->h:B

    .line 180
    .line 181
    if-nez v6, :cond_9

    .line 182
    .line 183
    move/from16 v16, v15

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_9
    const/16 v16, 0x0

    .line 187
    .line 188
    :goto_8
    invoke-static/range {v16 .. v16}, La/x0x;->K(Z)V

    .line 189
    .line 190
    .line 191
    iput-object v5, v2, La/j16;->d:La/tjf0;

    .line 192
    .line 193
    iput-object v9, v2, La/j16;->q:La/vn30;

    .line 194
    .line 195
    iput-byte v15, v2, La/j16;->h:B

    .line 196
    .line 197
    invoke-virtual {v2, v14, v12}, La/j16;->q(ZZ)V

    .line 198
    .line 199
    .line 200
    move-wide/from16 v5, p4

    .line 201
    .line 202
    invoke-virtual/range {v2 .. v9}, La/j16;->A([Landroidx/media3/common/b;La/ixg0;JJLa/vn30;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v5, v6, v14, v15}, La/j16;->B(JZZ)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v11, v2}, La/cwj;->f(La/j16;)V

    .line 209
    .line 210
    .line 211
    :goto_9
    new-instance v2, La/ylo;

    .line 212
    .line 213
    invoke-direct {v2, v0}, La/ylo;-><init>(La/dmo;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10, v1}, La/ujf0;->d(La/nn30;)La/j16;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    const/16 v1, 0xb

    .line 224
    .line 225
    invoke-interface {v0, v1, v2}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    if-eqz v13, :cond_a

    .line 229
    .line 230
    if-eqz v12, :cond_a

    .line 231
    .line 232
    invoke-virtual {v10}, La/ujf0;->p()V

    .line 233
    .line 234
    .line 235
    :cond_a
    :goto_a
    return-void
.end method

.method public final j0(I)V
    .locals 2

    .line 1
    iput p1, p0, La/dmo;->q1:I

    .line 2
    .line 3
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 4
    .line 5
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 6
    .line 7
    iget-object v1, p0, La/dmo;->q:La/pn30;

    .line 8
    .line 9
    iput p1, v1, La/pn30;->g:I

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/pn30;->w(La/bmq0;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 v0, p1, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, La/dmo;->V(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, La/dmo;->g()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, La/dmo;->t(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final k([ZJ)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/dmo;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 11
    .line 12
    invoke-virtual {v0}, La/pn30;->d()La/nn30;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v0, v2, La/nn30;->o:La/ucs0;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    move v3, v1

    .line 20
    :goto_0
    iget-object v7, p0, La/dmo;->a:[La/ujf0;

    .line 21
    .line 22
    array-length v4, v7

    .line 23
    if-ge v3, v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v3}, La/ucs0;->p(I)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    aget-object v4, v7, v3

    .line 32
    .line 33
    invoke-virtual {v4}, La/ujf0;->n()V

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v3, v1

    .line 40
    :goto_1
    array-length v1, v7

    .line 41
    if-ge v3, v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0, v3}, La/ucs0;->p(I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    aget-object v1, v7, v3

    .line 50
    .line 51
    invoke-virtual {v1, v2}, La/ujf0;->i(La/nn30;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    aget-boolean v4, p1, v3

    .line 58
    .line 59
    move-object v1, p0

    .line 60
    move-wide v5, p2

    .line 61
    invoke-virtual/range {v1 .. v6}, La/dmo;->j(La/nn30;IZJ)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v1, p0

    .line 66
    move-wide v5, p2

    .line 67
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    move-object p0, v1

    .line 70
    move-wide p2, v5

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    return-void
.end method

.method public final k0(Z)V
    .locals 4

    .line 1
    if-nez p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, La/dmo;->g1:La/cmo;

    .line 4
    .line 5
    const/16 v1, 0x25

    .line 6
    .line 7
    iget-object v2, p0, La/dmo;->g:La/q9o0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, La/dmo;->f1:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v2, La/q9o0;->a:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget v0, p0, La/dmo;->h1:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    iput v0, p0, La/dmo;->h1:I

    .line 28
    .line 29
    :cond_0
    iget v0, p0, La/dmo;->h1:I

    .line 30
    .line 31
    if-lez v0, :cond_1

    .line 32
    .line 33
    new-instance v3, La/ccf;

    .line 34
    .line 35
    invoke-direct {v3, p0, v0}, La/ccf;-><init>(La/dmo;I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, La/dmo;->x:La/q9o0;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, La/q9o0;->e(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    iput v0, p0, La/dmo;->h1:I

    .line 45
    .line 46
    iput-boolean v0, p0, La/dmo;->f1:Z

    .line 47
    .line 48
    invoke-virtual {v2, v1}, La/q9o0;->g(I)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, La/dmo;->g1:La/cmo;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0, v1}, La/dmo;->W(La/cmo;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    iput-object v1, p0, La/dmo;->g1:La/cmo;

    .line 60
    .line 61
    iput-boolean v0, p0, La/dmo;->f1:Z

    .line 62
    .line 63
    :cond_2
    iput-boolean p1, p0, La/dmo;->Z:Z

    .line 64
    .line 65
    invoke-virtual {p0}, La/dmo;->c()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final l(La/bmq0;Ljava/lang/Object;J)J
    .locals 3

    .line 1
    iget-object v0, p0, La/dmo;->k:La/amq0;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, La/amq0;->c:I

    .line 8
    .line 9
    iget-object p0, p0, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 10
    .line 11
    invoke-virtual {p1, p2, p0}, La/bmq0;->n(ILandroidx/media3/common/Timeline$Window;)V

    .line 12
    .line 13
    .line 14
    iget-wide p1, p0, Landroidx/media3/common/Timeline$Window;->e:J

    .line 15
    .line 16
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long p1, p1, v1

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/media3/common/Timeline$Window;->a()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-boolean p1, p0, Landroidx/media3/common/Timeline$Window;->h:Z

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-wide p1, p0, Landroidx/media3/common/Timeline$Window;->f:J

    .line 37
    .line 38
    cmp-long v1, p1, v1

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    add-long/2addr p1, v1

    .line 52
    :goto_0
    iget-wide v1, p0, Landroidx/media3/common/Timeline$Window;->e:J

    .line 53
    .line 54
    sub-long/2addr p1, v1

    .line 55
    invoke-static {p1, p2}, La/vtt0;->M(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide p0

    .line 59
    iget-wide v0, v0, La/amq0;->e:J

    .line 60
    .line 61
    add-long/2addr p3, v0

    .line 62
    sub-long/2addr p0, p3

    .line 63
    return-wide p0

    .line 64
    :cond_2
    :goto_1
    return-wide v1
.end method

.method public final l0(La/uch0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dmo;->Y:La/uch0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/dmo;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m(La/bmq0;)Landroid/util/Pair;
    .locals 11

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
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, La/yx90;->u:La/vn30;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-boolean v0, p0, La/dmo;->r1:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, La/bmq0;->a(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    iget-object v5, p0, La/dmo;->k:La/amq0;

    .line 27
    .line 28
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iget-object v4, p0, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, La/bmq0;->i(Landroidx/media3/common/Timeline$Window;La/amq0;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v4, p0, La/dmo;->i1:La/yx90;

    .line 41
    .line 42
    iget-object v6, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v9, 0x1

    .line 45
    const/4 v10, 0x0

    .line 46
    move-object v5, v3

    .line 47
    iget-object v3, p0, La/dmo;->q:La/pn30;

    .line 48
    .line 49
    const-wide/16 v7, 0x0

    .line 50
    .line 51
    invoke-virtual/range {v3 .. v10}, La/pn30;->u(La/yx90;La/bmq0;Ljava/lang/Object;JZZ)La/vn30;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move-object v3, v5

    .line 56
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Ljava/lang/Long;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    invoke-virtual {v0}, La/vn30;->c()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iget-object p1, v0, La/vn30;->a:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object p0, p0, La/dmo;->k:La/amq0;

    .line 73
    .line 74
    invoke-virtual {v3, p1, p0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 75
    .line 76
    .line 77
    iget p1, v0, La/vn30;->c:I

    .line 78
    .line 79
    iget v3, v0, La/vn30;->b:I

    .line 80
    .line 81
    invoke-virtual {p0, v3}, La/amq0;->e(I)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-ne p1, p0, :cond_2

    .line 86
    .line 87
    sget-object p0, La/uo;->c:La/uo;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-wide v1, v4

    .line 91
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0
.end method

.method public final m0(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, La/dmo;->r1:Z

    .line 2
    .line 3
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 4
    .line 5
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 6
    .line 7
    iget-object v1, p0, La/dmo;->q:La/pn30;

    .line 8
    .line 9
    iput-boolean p1, v1, La/pn30;->h:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/pn30;->w(La/bmq0;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 v0, p1, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, La/dmo;->V(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, La/dmo;->g()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, p1}, La/dmo;->t(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final n(La/nn30;I)J
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-wide/16 p0, 0x0

    .line 4
    .line 5
    return-wide p0

    .line 6
    :cond_0
    iget-boolean v0, p1, La/nn30;->e:Z

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 11
    .line 12
    aget-object v0, p0, p2

    .line 13
    .line 14
    invoke-virtual {v0, p1}, La/ujf0;->i(La/nn30;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    aget-object p0, p0, p2

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/ujf0;->d(La/nn30;)La/j16;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-wide p0, p0, La/j16;->m:J

    .line 31
    .line 32
    return-wide p0

    .line 33
    :cond_2
    :goto_0
    iget-wide p0, p1, La/nn30;->p:J

    .line 34
    .line 35
    return-wide p0
.end method

.method public final n0(La/itj0;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/dmo;->j1:La/amo;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, La/amo;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/dmo;->r:La/jo30;

    .line 8
    .line 9
    iget-object v1, v0, La/jo30;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p1, La/itj0;->b:[I

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    if-eq v2, v1, :cond_0

    .line 19
    .line 20
    new-instance v2, La/itj0;

    .line 21
    .line 22
    new-instance v3, Ljava/util/Random;

    .line 23
    .line 24
    iget-object p1, p1, La/itj0;->a:Ljava/util/Random;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    invoke-direct {v3, v4, v5}, Ljava/util/Random;-><init>(J)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, v3}, La/itj0;-><init>(Ljava/util/Random;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1}, La/itj0;->a(I)La/itj0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    iput-object p1, v0, La/jo30;->k:La/itj0;

    .line 41
    .line 42
    invoke-virtual {v0}, La/jo30;->b()La/bmq0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-virtual {p0, p1, v0}, La/dmo;->u(La/bmq0;Z)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final o(J)J
    .locals 7

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v0, v0, La/pn30;->l:La/nn30;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    iget-wide v3, p0, La/dmo;->x1:J

    .line 11
    .line 12
    iget-wide v5, v0, La/nn30;->p:J

    .line 13
    .line 14
    sub-long/2addr v3, v5

    .line 15
    sub-long/2addr p1, v3

    .line 16
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    return-wide p0
.end method

.method public final o0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 2
    .line 3
    iget v1, v0, La/yx90;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, La/dmo;->C1:J

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x3

    .line 18
    if-eq p1, v1, :cond_1

    .line 19
    .line 20
    iget-boolean v1, v0, La/yx90;->p:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, La/yx90;->i(Z)La/yx90;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/dmo;->i1:La/yx90;

    .line 30
    .line 31
    :cond_1
    invoke-virtual {v0, p1}, La/yx90;->h(I)La/yx90;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/dmo;->i1:La/yx90;

    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final p(I)V
    .locals 3

    .line 1
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 2
    .line 3
    iget-boolean v1, v0, La/yx90;->l:Z

    .line 4
    .line 5
    iget v2, v0, La/yx90;->n:I

    .line 6
    .line 7
    iget v0, v0, La/yx90;->m:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, v2, v0, v1}, La/dmo;->A0(IIIZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final p0(La/seu0;)V
    .locals 6

    .line 1
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_2

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    iget-object v3, v2, La/ujf0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/j16;

    .line 12
    .line 13
    iget-byte v4, v3, La/j16;->b:B

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    if-eq v4, v5, :cond_0

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    if-eq v4, v5, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v4, 0x7

    .line 23
    invoke-interface {v3, v4, p1}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v2, La/ujf0;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, La/j16;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v2, v4, p1}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    iget v0, p0, La/dmo;->G1:F

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/dmo;->r0(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q0(Ljava/lang/Object;La/brd;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/dmo;->a:[La/ujf0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    if-ge v2, v1, :cond_3

    .line 8
    .line 9
    aget-object v5, v0, v2

    .line 10
    .line 11
    iget-object v6, v5, La/ujf0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v6, La/j16;

    .line 14
    .line 15
    iget-byte v7, v6, La/j16;->b:B

    .line 16
    .line 17
    if-eq v7, v4, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    iget v4, v5, La/ujf0;->d:I

    .line 21
    .line 22
    const/4 v7, 0x5

    .line 23
    const/4 v8, 0x1

    .line 24
    if-eq v4, v7, :cond_2

    .line 25
    .line 26
    if-eq v4, v3, :cond_2

    .line 27
    .line 28
    if-ne v4, v8, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-interface {v6, v8, p1}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    :goto_1
    iget-object v3, v5, La/ujf0;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, La/j16;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {v3, v8, p1}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 49
    .line 50
    iget p1, p1, La/yx90;->e:I

    .line 51
    .line 52
    if-eq p1, v3, :cond_4

    .line 53
    .line 54
    if-ne p1, v4, :cond_5

    .line 55
    .line 56
    :cond_4
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 57
    .line 58
    invoke-virtual {p0, v4}, La/q9o0;->h(I)V

    .line 59
    .line 60
    .line 61
    :cond_5
    if-eqz p2, :cond_6

    .line 62
    .line 63
    invoke-virtual {p2}, La/brd;->c()Z

    .line 64
    .line 65
    .line 66
    :cond_6
    return-void
.end method

.method public final r(La/mn30;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v1, v0, La/pn30;->l:La/nn30;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, La/nn30;->a:La/f930;

    .line 8
    .line 9
    if-ne v1, p1, :cond_0

    .line 10
    .line 11
    iget-wide v1, p0, La/dmo;->x1:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, La/pn30;->r(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/dmo;->C()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, v0, La/pn30;->m:La/nn30;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, La/nn30;->a:La/f930;

    .line 25
    .line 26
    if-ne v0, p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, La/dmo;->D()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final r0(F)V
    .locals 6

    .line 1
    iput p1, p0, La/dmo;->G1:F

    .line 2
    .line 3
    iget-object v0, p0, La/dmo;->z:La/x24;

    .line 4
    .line 5
    iget v0, v0, La/x24;->g:F

    .line 6
    .line 7
    mul-float/2addr p1, v0

    .line 8
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 9
    .line 10
    array-length v0, p0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_2

    .line 13
    .line 14
    aget-object v2, p0, v1

    .line 15
    .line 16
    iget-object v3, v2, La/ujf0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, La/j16;

    .line 19
    .line 20
    iget-byte v4, v3, La/j16;->b:B

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v4, v5, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v5, 0x2

    .line 31
    invoke-interface {v3, v5, v4}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v2, La/ujf0;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, La/j16;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v2, v5, v3}, La/x8a0;->c(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method

.method public final s(Ljava/io/IOException;I)V
    .locals 2

    .line 1
    new-instance v0, La/dlo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1, p2}, La/dlo;-><init>(ILjava/lang/Exception;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/dmo;->q:La/pn30;

    .line 8
    .line 9
    iget-object p1, p1, La/pn30;->i:La/nn30;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, La/nn30;->g:La/on30;

    .line 14
    .line 15
    iget-object p1, p1, La/on30;->a:La/vn30;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La/dlo;->a(La/vn30;)La/dlo;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string p2, "Playback error"

    .line 24
    .line 25
    invoke-static {p1, p2, v0}, La/f1t0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v1}, La/dmo;->v0(ZZ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, La/yx90;->f(La/dlo;)La/yx90;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, La/dmo;->i1:La/yx90;

    .line 38
    .line 39
    return-void
.end method

.method public final s0()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/dmo;->i1:La/yx90;

    .line 2
    .line 3
    iget-boolean v0, p0, La/yx90;->l:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, p0, La/yx90;->n:I

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final t(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v0, v0, La/pn30;->l:La/nn30;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, La/dmo;->i1:La/yx90;

    .line 8
    .line 9
    iget-object v1, v1, La/yx90;->b:La/vn30;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, La/nn30;->g:La/on30;

    .line 13
    .line 14
    iget-object v1, v1, La/on30;->a:La/vn30;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, La/dmo;->i1:La/yx90;

    .line 17
    .line 18
    iget-object v2, v2, La/yx90;->k:La/vn30;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, La/dmo;->i1:La/yx90;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, La/yx90;->c(La/vn30;)La/yx90;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, La/dmo;->i1:La/yx90;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, La/dmo;->i1:La/yx90;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-wide v3, v1, La/yx90;->s:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, La/nn30;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_1
    iput-wide v3, v1, La/yx90;->q:J

    .line 46
    .line 47
    iget-object v1, p0, La/dmo;->i1:La/yx90;

    .line 48
    .line 49
    iget-wide v3, v1, La/yx90;->q:J

    .line 50
    .line 51
    invoke-virtual {p0, v3, v4}, La/dmo;->o(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, La/yx90;->r:J

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-boolean p1, v0, La/nn30;->e:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, v0, La/nn30;->g:La/on30;

    .line 68
    .line 69
    iget-object p1, p1, La/on30;->a:La/vn30;

    .line 70
    .line 71
    iget-object v0, v0, La/nn30;->o:La/ucs0;

    .line 72
    .line 73
    invoke-virtual {p0, p1, v0}, La/dmo;->y0(La/vn30;La/ucs0;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    return-void
.end method

.method public final t0(La/bmq0;La/vn30;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, La/vn30;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, La/bmq0;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p2, p2, La/vn30;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p0, La/dmo;->k:La/amq0;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p2, p2, La/amq0;->c:I

    .line 23
    .line 24
    iget-object p0, p0, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 25
    .line 26
    invoke-virtual {p1, p2, p0}, La/bmq0;->n(ILandroidx/media3/common/Timeline$Window;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/media3/common/Timeline$Window;->a()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-boolean p1, p0, Landroidx/media3/common/Timeline$Window;->h:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-wide p0, p0, Landroidx/media3/common/Timeline$Window;->e:J

    .line 40
    .line 41
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long p0, p0, v0

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public final u(La/bmq0;Z)V
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 4
    .line 5
    iget-object v3, v1, La/dmo;->w1:La/cmo;

    .line 6
    .line 7
    iget-object v9, v1, La/dmo;->q:La/pn30;

    .line 8
    .line 9
    iget v4, v1, La/dmo;->q1:I

    .line 10
    .line 11
    iget-boolean v5, v1, La/dmo;->r1:Z

    .line 12
    .line 13
    iget-object v2, v1, La/dmo;->j:Landroidx/media3/common/Timeline$Window;

    .line 14
    .line 15
    iget-object v8, v1, La/dmo;->k:La/amq0;

    .line 16
    .line 17
    iget-boolean v10, v1, La/dmo;->A:Z

    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, La/bmq0;->p()Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const/4 v12, 0x4

    .line 24
    const-wide/16 v13, 0x0

    .line 25
    .line 26
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    if-eqz v6, :cond_3

    .line 32
    .line 33
    sget-object v2, La/yx90;->u:La/vn30;

    .line 34
    .line 35
    iget-object v3, v0, La/yx90;->b:La/vn30;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    iget-wide v3, v0, La/yx90;->s:J

    .line 44
    .line 45
    cmp-long v3, v3, v13

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/16 v27, 0x0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_0
    const/16 v27, 0x1

    .line 54
    .line 55
    :goto_1
    if-eqz v27, :cond_2

    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    iget-object v3, v0, La/yx90;->a:La/bmq0;

    .line 60
    .line 61
    invoke-virtual {v3}, La/bmq0;->p()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_2

    .line 66
    .line 67
    iget-object v3, v0, La/yx90;->a:La/bmq0;

    .line 68
    .line 69
    iget-object v0, v0, La/yx90;->b:La/vn30;

    .line 70
    .line 71
    iget-object v0, v0, La/vn30;->a:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v3, v0, v8}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-boolean v0, v0, La/amq0;->f:Z

    .line 78
    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    const/16 v28, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    const/16 v28, 0x0

    .line 85
    .line 86
    :goto_2
    new-instance v18, La/bmo;

    .line 87
    .line 88
    const/16 v26, 0x0

    .line 89
    .line 90
    const/16 v29, 0x4

    .line 91
    .line 92
    const-wide/16 v20, 0x0

    .line 93
    .line 94
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    const/16 v24, 0x0

    .line 100
    .line 101
    const/16 v25, 0x1

    .line 102
    .line 103
    move-object/from16 v19, v2

    .line 104
    .line 105
    invoke-direct/range {v18 .. v29}, La/bmo;-><init>(La/vn30;JJZZZZZI)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v3, p1

    .line 109
    .line 110
    move-object/from16 v9, v18

    .line 111
    .line 112
    goto/16 :goto_20

    .line 113
    .line 114
    :cond_3
    iget-object v6, v0, La/yx90;->b:La/vn30;

    .line 115
    .line 116
    iget-object v15, v6, La/vn30;->a:Ljava/lang/Object;

    .line 117
    .line 118
    iget-object v7, v0, La/yx90;->a:La/bmq0;

    .line 119
    .line 120
    invoke-virtual {v7}, La/bmq0;->p()Z

    .line 121
    .line 122
    .line 123
    move-result v19

    .line 124
    if-nez v19, :cond_5

    .line 125
    .line 126
    iget-object v11, v6, La/vn30;->a:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {v7, v11, v8}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    iget-boolean v7, v7, La/amq0;->f:Z

    .line 133
    .line 134
    if-eqz v7, :cond_4

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    move-object v11, v9

    .line 138
    const/4 v9, 0x0

    .line 139
    goto :goto_4

    .line 140
    :cond_5
    :goto_3
    move-object v11, v9

    .line 141
    const/4 v9, 0x1

    .line 142
    :goto_4
    iget-object v7, v0, La/yx90;->b:La/vn30;

    .line 143
    .line 144
    invoke-virtual {v7}, La/vn30;->c()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-nez v7, :cond_7

    .line 149
    .line 150
    if-eqz v9, :cond_6

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_6
    iget-wide v13, v0, La/yx90;->s:J

    .line 154
    .line 155
    :goto_5
    move-wide/from16 v22, v13

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_7
    :goto_6
    iget-wide v13, v0, La/yx90;->c:J

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :goto_7
    const/4 v7, -0x1

    .line 162
    if-eqz v3, :cond_b

    .line 163
    .line 164
    move-object/from16 v24, v6

    .line 165
    .line 166
    move v6, v5

    .line 167
    move v5, v4

    .line 168
    const/4 v4, 0x1

    .line 169
    move v14, v7

    .line 170
    move-object/from16 v13, v24

    .line 171
    .line 172
    const-wide/16 v28, 0x1

    .line 173
    .line 174
    move-object v7, v2

    .line 175
    move-object/from16 v2, p1

    .line 176
    .line 177
    invoke-static/range {v2 .. v8}, La/dmo;->S(La/bmq0;La/cmo;ZIZLandroidx/media3/common/Timeline$Window;La/amq0;)Landroid/util/Pair;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-nez v4, :cond_8

    .line 182
    .line 183
    invoke-virtual {v2, v6}, La/bmq0;->a(Z)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    move v5, v3

    .line 188
    move-wide/from16 v3, v22

    .line 189
    .line 190
    const/4 v6, 0x1

    .line 191
    const/4 v14, 0x0

    .line 192
    const/16 v24, 0x0

    .line 193
    .line 194
    goto :goto_a

    .line 195
    :cond_8
    iget-wide v5, v3, La/cmo;->c:J

    .line 196
    .line 197
    cmp-long v3, v5, v16

    .line 198
    .line 199
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 200
    .line 201
    if-nez v3, :cond_9

    .line 202
    .line 203
    invoke-virtual {v2, v5, v8}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    iget v3, v3, La/amq0;->c:I

    .line 208
    .line 209
    move v5, v3

    .line 210
    move-wide/from16 v3, v22

    .line 211
    .line 212
    const/4 v6, 0x0

    .line 213
    goto :goto_8

    .line 214
    :cond_9
    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v3, Ljava/lang/Long;

    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide v3

    .line 222
    move-object v15, v5

    .line 223
    move v5, v14

    .line 224
    const/4 v6, 0x1

    .line 225
    :goto_8
    iget v14, v0, La/yx90;->e:I

    .line 226
    .line 227
    if-ne v14, v12, :cond_a

    .line 228
    .line 229
    const/4 v14, 0x1

    .line 230
    goto :goto_9

    .line 231
    :cond_a
    const/4 v14, 0x0

    .line 232
    :goto_9
    move/from16 v24, v14

    .line 233
    .line 234
    move v14, v6

    .line 235
    const/4 v6, 0x0

    .line 236
    :goto_a
    move/from16 v37, v6

    .line 237
    .line 238
    move/from16 v38, v14

    .line 239
    .line 240
    move/from16 v36, v24

    .line 241
    .line 242
    const/4 v14, -0x1

    .line 243
    move-wide/from16 v42, v3

    .line 244
    .line 245
    move-object v3, v7

    .line 246
    move-wide/from16 v6, v42

    .line 247
    .line 248
    goto/16 :goto_10

    .line 249
    .line 250
    :cond_b
    move-object v7, v2

    .line 251
    move-object v13, v6

    .line 252
    const-wide/16 v28, 0x1

    .line 253
    .line 254
    move-object/from16 v2, p1

    .line 255
    .line 256
    move v6, v5

    .line 257
    move v5, v4

    .line 258
    iget-object v3, v0, La/yx90;->a:La/bmq0;

    .line 259
    .line 260
    invoke-virtual {v3}, La/bmq0;->p()Z

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    if-eqz v3, :cond_c

    .line 265
    .line 266
    invoke-virtual {v2, v6}, La/bmq0;->a(Z)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    move v5, v3

    .line 271
    move-object v3, v7

    .line 272
    :goto_b
    move-wide/from16 v6, v22

    .line 273
    .line 274
    :goto_c
    const/4 v14, -0x1

    .line 275
    const/16 v36, 0x0

    .line 276
    .line 277
    const/16 v37, 0x0

    .line 278
    .line 279
    :goto_d
    const/16 v38, 0x0

    .line 280
    .line 281
    goto/16 :goto_10

    .line 282
    .line 283
    :cond_c
    invoke-virtual {v2, v15}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    const/4 v14, -0x1

    .line 288
    if-ne v3, v14, :cond_e

    .line 289
    .line 290
    move-object v3, v7

    .line 291
    iget-object v7, v0, La/yx90;->a:La/bmq0;

    .line 292
    .line 293
    move-object v4, v8

    .line 294
    move-object v8, v2

    .line 295
    move-object v2, v3

    .line 296
    move-object v3, v4

    .line 297
    move v4, v5

    .line 298
    move v5, v6

    .line 299
    move-object v6, v15

    .line 300
    invoke-static/range {v2 .. v8}, La/dmo;->T(Landroidx/media3/common/Timeline$Window;La/amq0;IZLjava/lang/Object;La/bmq0;La/bmq0;)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    move-object/from16 v42, v3

    .line 305
    .line 306
    move-object v3, v2

    .line 307
    move-object v2, v8

    .line 308
    move-object/from16 v8, v42

    .line 309
    .line 310
    if-ne v4, v14, :cond_d

    .line 311
    .line 312
    invoke-virtual {v2, v5}, La/bmq0;->a(Z)I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    move v7, v4

    .line 317
    const/4 v4, 0x1

    .line 318
    goto :goto_e

    .line 319
    :cond_d
    move v7, v4

    .line 320
    const/4 v4, 0x0

    .line 321
    :goto_e
    move/from16 v37, v4

    .line 322
    .line 323
    move-object v15, v6

    .line 324
    move v5, v7

    .line 325
    move-wide/from16 v6, v22

    .line 326
    .line 327
    const/4 v14, -0x1

    .line 328
    const/16 v36, 0x0

    .line 329
    .line 330
    goto :goto_d

    .line 331
    :cond_e
    move-object v3, v7

    .line 332
    move-object v6, v15

    .line 333
    cmp-long v4, v22, v16

    .line 334
    .line 335
    if-nez v4, :cond_f

    .line 336
    .line 337
    invoke-virtual {v2, v6, v8}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    iget v7, v4, La/amq0;->c:I

    .line 342
    .line 343
    move-object v15, v6

    .line 344
    move v5, v7

    .line 345
    goto :goto_b

    .line 346
    :cond_f
    if-eqz v9, :cond_12

    .line 347
    .line 348
    iget-object v4, v0, La/yx90;->a:La/bmq0;

    .line 349
    .line 350
    iget-object v5, v13, La/vn30;->a:Ljava/lang/Object;

    .line 351
    .line 352
    invoke-virtual {v4, v5, v8}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 353
    .line 354
    .line 355
    iget-object v4, v0, La/yx90;->a:La/bmq0;

    .line 356
    .line 357
    iget v5, v8, La/amq0;->c:I

    .line 358
    .line 359
    const-wide/16 v14, 0x0

    .line 360
    .line 361
    invoke-virtual {v4, v5, v3, v14, v15}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    iget v4, v4, Landroidx/media3/common/Timeline$Window;->m:I

    .line 366
    .line 367
    iget-object v5, v0, La/yx90;->a:La/bmq0;

    .line 368
    .line 369
    iget-object v7, v13, La/vn30;->a:Ljava/lang/Object;

    .line 370
    .line 371
    invoke-virtual {v5, v7}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-ne v4, v5, :cond_10

    .line 376
    .line 377
    iget-wide v4, v8, La/amq0;->e:J

    .line 378
    .line 379
    add-long v4, v22, v4

    .line 380
    .line 381
    invoke-virtual {v2, v6, v8}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    iget v6, v6, La/amq0;->c:I

    .line 386
    .line 387
    move-wide/from16 v42, v4

    .line 388
    .line 389
    move v5, v6

    .line 390
    move-wide/from16 v6, v42

    .line 391
    .line 392
    move-object v4, v8

    .line 393
    invoke-virtual/range {v2 .. v7}, La/bmq0;->i(Landroidx/media3/common/Timeline$Window;La/amq0;IJ)Landroid/util/Pair;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    iget-object v15, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v4, Ljava/lang/Long;

    .line 402
    .line 403
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 404
    .line 405
    .line 406
    move-result-wide v4

    .line 407
    goto :goto_f

    .line 408
    :cond_10
    invoke-virtual {v2, v6, v8}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    iget-wide v4, v4, La/amq0;->d:J

    .line 413
    .line 414
    cmp-long v4, v4, v16

    .line 415
    .line 416
    if-eqz v4, :cond_11

    .line 417
    .line 418
    iget-wide v4, v8, La/amq0;->d:J

    .line 419
    .line 420
    sub-long v26, v4, v28

    .line 421
    .line 422
    const-wide/16 v24, 0x0

    .line 423
    .line 424
    invoke-static/range {v22 .. v27}, La/vtt0;->j(JJJ)J

    .line 425
    .line 426
    .line 427
    move-result-wide v4

    .line 428
    move-object v15, v6

    .line 429
    goto :goto_f

    .line 430
    :cond_11
    move-object v15, v6

    .line 431
    move-wide/from16 v4, v22

    .line 432
    .line 433
    :goto_f
    move-wide v6, v4

    .line 434
    const/4 v5, -0x1

    .line 435
    const/4 v14, -0x1

    .line 436
    const/16 v36, 0x0

    .line 437
    .line 438
    const/16 v37, 0x0

    .line 439
    .line 440
    const/16 v38, 0x1

    .line 441
    .line 442
    goto :goto_10

    .line 443
    :cond_12
    move-object v15, v6

    .line 444
    move-wide/from16 v6, v22

    .line 445
    .line 446
    const/4 v5, -0x1

    .line 447
    goto/16 :goto_c

    .line 448
    .line 449
    :goto_10
    if-eq v5, v14, :cond_13

    .line 450
    .line 451
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    move-object v4, v8

    .line 457
    invoke-virtual/range {v2 .. v7}, La/bmq0;->i(Landroidx/media3/common/Timeline$Window;La/amq0;IJ)Landroid/util/Pair;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    iget-object v15, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 462
    .line 463
    iget-object v2, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v2, Ljava/lang/Long;

    .line 466
    .line 467
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 468
    .line 469
    .line 470
    move-result-wide v6

    .line 471
    move-object v3, v0

    .line 472
    move-object v0, v8

    .line 473
    move v8, v10

    .line 474
    move-object v2, v11

    .line 475
    move-wide/from16 v10, v16

    .line 476
    .line 477
    :goto_11
    move-object/from16 v4, p1

    .line 478
    .line 479
    move-object v5, v15

    .line 480
    goto :goto_12

    .line 481
    :cond_13
    move-object v3, v0

    .line 482
    move-object v0, v8

    .line 483
    move v8, v10

    .line 484
    move-object v2, v11

    .line 485
    move-wide v10, v6

    .line 486
    goto :goto_11

    .line 487
    :goto_12
    invoke-virtual/range {v2 .. v9}, La/pn30;->u(La/yx90;La/bmq0;Ljava/lang/Object;JZZ)La/vn30;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    move-object v15, v4

    .line 492
    move-object v4, v3

    .line 493
    move-object v3, v15

    .line 494
    move-object v15, v5

    .line 495
    iget v5, v2, La/vn30;->e:I

    .line 496
    .line 497
    if-eq v5, v14, :cond_15

    .line 498
    .line 499
    iget v8, v13, La/vn30;->e:I

    .line 500
    .line 501
    if-eq v8, v14, :cond_14

    .line 502
    .line 503
    if-lt v5, v8, :cond_14

    .line 504
    .line 505
    goto :goto_13

    .line 506
    :cond_14
    const/4 v5, 0x0

    .line 507
    goto :goto_14

    .line 508
    :cond_15
    :goto_13
    const/4 v5, 0x1

    .line 509
    :goto_14
    iget-object v8, v13, La/vn30;->a:Ljava/lang/Object;

    .line 510
    .line 511
    invoke-virtual {v8, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v8

    .line 515
    if-eqz v8, :cond_16

    .line 516
    .line 517
    invoke-virtual {v13}, La/vn30;->c()Z

    .line 518
    .line 519
    .line 520
    move-result v14

    .line 521
    if-nez v14, :cond_16

    .line 522
    .line 523
    invoke-virtual {v2}, La/vn30;->c()Z

    .line 524
    .line 525
    .line 526
    move-result v14

    .line 527
    if-nez v14, :cond_16

    .line 528
    .line 529
    if-eqz v5, :cond_16

    .line 530
    .line 531
    const/4 v5, 0x1

    .line 532
    goto :goto_15

    .line 533
    :cond_16
    const/4 v5, 0x0

    .line 534
    :goto_15
    if-nez v9, :cond_19

    .line 535
    .line 536
    cmp-long v9, v22, v10

    .line 537
    .line 538
    if-nez v9, :cond_19

    .line 539
    .line 540
    iget-object v9, v13, La/vn30;->a:Ljava/lang/Object;

    .line 541
    .line 542
    iget v14, v13, La/vn30;->b:I

    .line 543
    .line 544
    iget-object v12, v2, La/vn30;->a:Ljava/lang/Object;

    .line 545
    .line 546
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v9

    .line 550
    if-nez v9, :cond_17

    .line 551
    .line 552
    goto :goto_16

    .line 553
    :cond_17
    iget-object v9, v2, La/vn30;->a:Ljava/lang/Object;

    .line 554
    .line 555
    invoke-virtual {v3, v9, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v13}, La/vn30;->c()Z

    .line 559
    .line 560
    .line 561
    move-result v9

    .line 562
    if-eqz v9, :cond_18

    .line 563
    .line 564
    invoke-virtual {v0, v14}, La/amq0;->g(I)Z

    .line 565
    .line 566
    .line 567
    :cond_18
    invoke-virtual {v2}, La/vn30;->c()Z

    .line 568
    .line 569
    .line 570
    move-result v9

    .line 571
    if-eqz v9, :cond_19

    .line 572
    .line 573
    iget v9, v2, La/vn30;->b:I

    .line 574
    .line 575
    invoke-virtual {v0, v9}, La/amq0;->g(I)Z

    .line 576
    .line 577
    .line 578
    :cond_19
    :goto_16
    if-nez v5, :cond_1a

    .line 579
    .line 580
    goto :goto_17

    .line 581
    :cond_1a
    move-object v2, v13

    .line 582
    :goto_17
    invoke-virtual {v2}, La/vn30;->c()Z

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    if-eqz v5, :cond_1d

    .line 587
    .line 588
    invoke-virtual {v2, v13}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v5

    .line 592
    if-eqz v5, :cond_1b

    .line 593
    .line 594
    iget-wide v13, v4, La/yx90;->s:J

    .line 595
    .line 596
    move-wide/from16 v34, v10

    .line 597
    .line 598
    move-wide/from16 v32, v13

    .line 599
    .line 600
    goto/16 :goto_1a

    .line 601
    .line 602
    :cond_1b
    iget-object v5, v2, La/vn30;->a:Ljava/lang/Object;

    .line 603
    .line 604
    invoke-virtual {v3, v5, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 605
    .line 606
    .line 607
    iget v5, v2, La/vn30;->c:I

    .line 608
    .line 609
    iget v6, v2, La/vn30;->b:I

    .line 610
    .line 611
    invoke-virtual {v0, v6}, La/amq0;->e(I)I

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    if-ne v5, v6, :cond_1c

    .line 616
    .line 617
    sget-object v5, La/uo;->c:La/uo;

    .line 618
    .line 619
    :cond_1c
    move-wide/from16 v34, v10

    .line 620
    .line 621
    const-wide/16 v32, 0x0

    .line 622
    .line 623
    goto :goto_1a

    .line 624
    :cond_1d
    if-eqz v8, :cond_20

    .line 625
    .line 626
    invoke-virtual {v13}, La/vn30;->c()Z

    .line 627
    .line 628
    .line 629
    move-result v5

    .line 630
    if-eqz v5, :cond_20

    .line 631
    .line 632
    invoke-virtual {v3, v15, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 633
    .line 634
    .line 635
    move-result-object v5

    .line 636
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    sget-object v5, La/uo;->c:La/uo;

    .line 640
    .line 641
    iget v8, v13, La/vn30;->b:I

    .line 642
    .line 643
    invoke-virtual {v5, v8}, La/uo;->a(I)La/so;

    .line 644
    .line 645
    .line 646
    move-result-object v5

    .line 647
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    iget-wide v8, v4, La/yx90;->c:J

    .line 651
    .line 652
    cmp-long v12, v8, v16

    .line 653
    .line 654
    if-eqz v12, :cond_1e

    .line 655
    .line 656
    const-wide/16 v20, 0x0

    .line 657
    .line 658
    cmp-long v8, v20, v8

    .line 659
    .line 660
    if-gtz v8, :cond_1e

    .line 661
    .line 662
    goto :goto_19

    .line 663
    :cond_1e
    iget v8, v5, La/so;->a:I

    .line 664
    .line 665
    iget v9, v13, La/vn30;->c:I

    .line 666
    .line 667
    if-le v8, v9, :cond_20

    .line 668
    .line 669
    iget-object v5, v5, La/so;->d:[I

    .line 670
    .line 671
    aget v5, v5, v9

    .line 672
    .line 673
    const/4 v8, 0x2

    .line 674
    if-ne v5, v8, :cond_20

    .line 675
    .line 676
    invoke-virtual {v3, v15, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    iget-wide v8, v5, La/amq0;->d:J

    .line 681
    .line 682
    cmp-long v5, v8, v16

    .line 683
    .line 684
    if-eqz v5, :cond_1f

    .line 685
    .line 686
    sub-long v8, v8, v28

    .line 687
    .line 688
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 689
    .line 690
    .line 691
    move-result-wide v5

    .line 692
    move-wide v13, v5

    .line 693
    goto :goto_18

    .line 694
    :cond_1f
    move-wide v13, v6

    .line 695
    :goto_18
    move-wide/from16 v32, v13

    .line 696
    .line 697
    move-wide/from16 v34, v32

    .line 698
    .line 699
    goto :goto_1a

    .line 700
    :cond_20
    :goto_19
    move-wide/from16 v32, v6

    .line 701
    .line 702
    move-wide/from16 v34, v10

    .line 703
    .line 704
    :goto_1a
    iget-object v5, v4, La/yx90;->b:La/vn30;

    .line 705
    .line 706
    invoke-virtual {v2, v5}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    move-result v5

    .line 710
    if-eqz v5, :cond_22

    .line 711
    .line 712
    iget-wide v5, v4, La/yx90;->s:J

    .line 713
    .line 714
    cmp-long v5, v32, v5

    .line 715
    .line 716
    if-eqz v5, :cond_21

    .line 717
    .line 718
    goto :goto_1b

    .line 719
    :cond_21
    const/16 v39, 0x0

    .line 720
    .line 721
    goto :goto_1c

    .line 722
    :cond_22
    :goto_1b
    const/16 v39, 0x1

    .line 723
    .line 724
    :goto_1c
    iget-object v5, v4, La/yx90;->b:La/vn30;

    .line 725
    .line 726
    iget-object v5, v5, La/vn30;->a:Ljava/lang/Object;

    .line 727
    .line 728
    invoke-virtual {v3, v5}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 729
    .line 730
    .line 731
    move-result v5

    .line 732
    const/4 v14, -0x1

    .line 733
    if-ne v5, v14, :cond_23

    .line 734
    .line 735
    const/4 v5, 0x4

    .line 736
    goto :goto_1d

    .line 737
    :cond_23
    const/4 v5, 0x3

    .line 738
    :goto_1d
    iget-object v6, v2, La/vn30;->a:Ljava/lang/Object;

    .line 739
    .line 740
    iget-object v7, v4, La/yx90;->b:La/vn30;

    .line 741
    .line 742
    iget-object v7, v7, La/vn30;->a:Ljava/lang/Object;

    .line 743
    .line 744
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v6

    .line 748
    if-eqz v6, :cond_25

    .line 749
    .line 750
    iget v6, v2, La/vn30;->b:I

    .line 751
    .line 752
    if-eq v6, v14, :cond_25

    .line 753
    .line 754
    iget-object v6, v2, La/vn30;->a:Ljava/lang/Object;

    .line 755
    .line 756
    invoke-virtual {v3, v6, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 757
    .line 758
    .line 759
    move-result-object v6

    .line 760
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    sget-object v6, La/uo;->c:La/uo;

    .line 764
    .line 765
    iget v7, v2, La/vn30;->b:I

    .line 766
    .line 767
    invoke-virtual {v6, v7}, La/uo;->a(I)La/so;

    .line 768
    .line 769
    .line 770
    move-result-object v6

    .line 771
    iget v7, v2, La/vn30;->c:I

    .line 772
    .line 773
    iget-object v6, v6, La/so;->d:[I

    .line 774
    .line 775
    array-length v8, v6

    .line 776
    if-ge v7, v8, :cond_24

    .line 777
    .line 778
    aget v6, v6, v7

    .line 779
    .line 780
    const/4 v8, 0x2

    .line 781
    if-eq v6, v8, :cond_25

    .line 782
    .line 783
    :cond_24
    const/16 v41, 0x0

    .line 784
    .line 785
    goto :goto_1e

    .line 786
    :cond_25
    move/from16 v41, v5

    .line 787
    .line 788
    :goto_1e
    if-eqz v39, :cond_26

    .line 789
    .line 790
    if-eqz p2, :cond_26

    .line 791
    .line 792
    iget-object v5, v4, La/yx90;->a:La/bmq0;

    .line 793
    .line 794
    invoke-virtual {v5}, La/bmq0;->p()Z

    .line 795
    .line 796
    .line 797
    move-result v5

    .line 798
    if-nez v5, :cond_26

    .line 799
    .line 800
    iget-object v5, v4, La/yx90;->a:La/bmq0;

    .line 801
    .line 802
    iget-object v4, v4, La/yx90;->b:La/vn30;

    .line 803
    .line 804
    iget-object v4, v4, La/vn30;->a:Ljava/lang/Object;

    .line 805
    .line 806
    invoke-virtual {v5, v4, v0}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    iget-boolean v0, v0, La/amq0;->f:Z

    .line 811
    .line 812
    if-nez v0, :cond_26

    .line 813
    .line 814
    const/16 v40, 0x1

    .line 815
    .line 816
    goto :goto_1f

    .line 817
    :cond_26
    const/16 v40, 0x0

    .line 818
    .line 819
    :goto_1f
    new-instance v30, La/bmo;

    .line 820
    .line 821
    move-object/from16 v31, v2

    .line 822
    .line 823
    invoke-direct/range {v30 .. v41}, La/bmo;-><init>(La/vn30;JJZZZZZI)V

    .line 824
    .line 825
    .line 826
    move-object/from16 v9, v30

    .line 827
    .line 828
    :goto_20
    iget-object v8, v9, La/bmo;->a:La/vn30;

    .line 829
    .line 830
    iget-wide v10, v9, La/bmo;->b:J

    .line 831
    .line 832
    const/4 v12, 0x0

    .line 833
    :try_start_0
    iget-boolean v0, v9, La/bmo;->e:Z

    .line 834
    .line 835
    if-eqz v0, :cond_28

    .line 836
    .line 837
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 838
    .line 839
    iget v0, v0, La/yx90;->e:I

    .line 840
    .line 841
    const/4 v2, 0x1

    .line 842
    if-eq v0, v2, :cond_27

    .line 843
    .line 844
    const/4 v0, 0x4

    .line 845
    invoke-virtual {v1, v0}, La/dmo;->o0(I)V

    .line 846
    .line 847
    .line 848
    :cond_27
    const/4 v4, 0x0

    .line 849
    goto :goto_22

    .line 850
    :catchall_0
    move-exception v0

    .line 851
    move-object v13, v3

    .line 852
    :goto_21
    move-object v2, v8

    .line 853
    goto/16 :goto_2d

    .line 854
    .line 855
    :goto_22
    invoke-virtual {v1, v4, v4, v4, v2}, La/dmo;->O(ZZZZ)V

    .line 856
    .line 857
    .line 858
    :cond_28
    iget-object v0, v1, La/dmo;->a:[La/ujf0;

    .line 859
    .line 860
    array-length v2, v0

    .line 861
    const/4 v4, 0x0

    .line 862
    :goto_23
    if-ge v4, v2, :cond_2b

    .line 863
    .line 864
    aget-object v5, v0, v4

    .line 865
    .line 866
    iget-object v6, v5, La/ujf0;->e:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v6, La/j16;

    .line 869
    .line 870
    iget-object v7, v6, La/j16;->p:La/bmq0;

    .line 871
    .line 872
    invoke-virtual {v7, v3}, La/bmq0;->equals(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v7

    .line 876
    if-nez v7, :cond_29

    .line 877
    .line 878
    iput-object v3, v6, La/j16;->p:La/bmq0;

    .line 879
    .line 880
    invoke-virtual {v6}, La/j16;->G()V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v6}, La/j16;->x()V

    .line 884
    .line 885
    .line 886
    :cond_29
    iget-object v5, v5, La/ujf0;->f:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast v5, La/j16;

    .line 889
    .line 890
    if-eqz v5, :cond_2a

    .line 891
    .line 892
    iget-object v6, v5, La/j16;->p:La/bmq0;

    .line 893
    .line 894
    invoke-virtual {v6, v3}, La/bmq0;->equals(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v6

    .line 898
    if-nez v6, :cond_2a

    .line 899
    .line 900
    iput-object v3, v5, La/j16;->p:La/bmq0;

    .line 901
    .line 902
    invoke-virtual {v5}, La/j16;->G()V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v5}, La/j16;->x()V

    .line 906
    .line 907
    .line 908
    :cond_2a
    add-int/lit8 v4, v4, 0x1

    .line 909
    .line 910
    goto :goto_23

    .line 911
    :cond_2b
    iget-boolean v0, v9, La/bmo;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 912
    .line 913
    if-nez v0, :cond_30

    .line 914
    .line 915
    :try_start_1
    iget-object v0, v1, La/dmo;->a:[La/ujf0;

    .line 916
    .line 917
    array-length v0, v0

    .line 918
    new-array v6, v0, [J

    .line 919
    .line 920
    const/4 v0, 0x0

    .line 921
    :goto_24
    iget-object v2, v1, La/dmo;->a:[La/ujf0;

    .line 922
    .line 923
    array-length v4, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 924
    if-ge v0, v4, :cond_2c

    .line 925
    .line 926
    :try_start_2
    iget-object v2, v1, La/dmo;->q:La/pn30;

    .line 927
    .line 928
    iget-object v2, v2, La/pn30;->j:[La/nn30;

    .line 929
    .line 930
    aget-object v2, v2, v0

    .line 931
    .line 932
    invoke-virtual {v1, v2, v0}, La/dmo;->n(La/nn30;I)J

    .line 933
    .line 934
    .line 935
    move-result-wide v4

    .line 936
    aput-wide v4, v6, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 937
    .line 938
    add-int/lit8 v0, v0, 0x1

    .line 939
    .line 940
    goto :goto_24

    .line 941
    :cond_2c
    :try_start_3
    array-length v0, v2

    .line 942
    new-array v7, v0, [J

    .line 943
    .line 944
    const/4 v0, 0x0

    .line 945
    :goto_25
    iget-object v2, v1, La/dmo;->a:[La/ujf0;

    .line 946
    .line 947
    array-length v2, v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 948
    iget-object v4, v1, La/dmo;->q:La/pn30;

    .line 949
    .line 950
    if-ge v0, v2, :cond_2d

    .line 951
    .line 952
    :try_start_4
    iget-object v2, v4, La/pn30;->k:[La/nn30;

    .line 953
    .line 954
    aget-object v2, v2, v0

    .line 955
    .line 956
    invoke-virtual {v1, v2, v0}, La/dmo;->n(La/nn30;I)J

    .line 957
    .line 958
    .line 959
    move-result-wide v4

    .line 960
    aput-wide v4, v7, v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 961
    .line 962
    add-int/lit8 v0, v0, 0x1

    .line 963
    .line 964
    goto :goto_25

    .line 965
    :cond_2d
    move-object v2, v4

    .line 966
    :try_start_5
    iget-wide v4, v1, La/dmo;->x1:J

    .line 967
    .line 968
    invoke-virtual/range {v2 .. v7}, La/pn30;->x(La/bmq0;J[J[J)I

    .line 969
    .line 970
    .line 971
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 972
    move-object v7, v3

    .line 973
    and-int/lit8 v2, v0, 0x1

    .line 974
    .line 975
    if-eqz v2, :cond_2e

    .line 976
    .line 977
    const/4 v4, 0x0

    .line 978
    :try_start_6
    invoke-virtual {v1, v4}, La/dmo;->V(Z)V

    .line 979
    .line 980
    .line 981
    goto :goto_27

    .line 982
    :catchall_1
    move-exception v0

    .line 983
    :goto_26
    move-object v13, v7

    .line 984
    goto/16 :goto_21

    .line 985
    .line 986
    :cond_2e
    const/16 v19, 0x2

    .line 987
    .line 988
    and-int/lit8 v0, v0, 0x2

    .line 989
    .line 990
    if-eqz v0, :cond_2f

    .line 991
    .line 992
    invoke-virtual {v1}, La/dmo;->g()V

    .line 993
    .line 994
    .line 995
    :cond_2f
    :goto_27
    move-object v2, v8

    .line 996
    goto :goto_2a

    .line 997
    :catchall_2
    move-exception v0

    .line 998
    move-object v7, v3

    .line 999
    goto :goto_26

    .line 1000
    :cond_30
    move-object v7, v3

    .line 1001
    invoke-virtual {v7}, La/bmq0;->p()Z

    .line 1002
    .line 1003
    .line 1004
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 1005
    if-nez v0, :cond_2f

    .line 1006
    .line 1007
    :try_start_7
    iget-object v0, v1, La/dmo;->q:La/pn30;

    .line 1008
    .line 1009
    iget-object v0, v0, La/pn30;->i:La/nn30;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1010
    .line 1011
    :goto_28
    if-eqz v0, :cond_32

    .line 1012
    .line 1013
    :try_start_8
    iget-object v2, v0, La/nn30;->g:La/on30;

    .line 1014
    .line 1015
    iget-object v2, v2, La/on30;->a:La/vn30;

    .line 1016
    .line 1017
    invoke-virtual {v2, v8}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v2

    .line 1021
    if-eqz v2, :cond_31

    .line 1022
    .line 1023
    iget-object v2, v1, La/dmo;->q:La/pn30;

    .line 1024
    .line 1025
    iget-object v3, v0, La/nn30;->g:La/on30;

    .line 1026
    .line 1027
    invoke-virtual {v2, v7, v3}, La/pn30;->l(La/bmq0;La/on30;)La/on30;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v2

    .line 1031
    iput-object v2, v0, La/nn30;->g:La/on30;

    .line 1032
    .line 1033
    :cond_31
    iget-object v0, v0, La/nn30;->m:La/nn30;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 1034
    .line 1035
    goto :goto_28

    .line 1036
    :cond_32
    :try_start_9
    iget-boolean v6, v9, La/bmo;->d:Z

    .line 1037
    .line 1038
    invoke-virtual {v1}, La/dmo;->z()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1042
    move-object v2, v8

    .line 1043
    move-wide v3, v10

    .line 1044
    :try_start_a
    invoke-virtual/range {v1 .. v6}, La/dmo;->X(La/vn30;JZZ)J

    .line 1045
    .line 1046
    .line 1047
    move-result-wide v10
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1048
    goto :goto_2a

    .line 1049
    :catchall_3
    move-exception v0

    .line 1050
    move-wide v10, v3

    .line 1051
    :goto_29
    move-object v13, v7

    .line 1052
    goto/16 :goto_2d

    .line 1053
    .line 1054
    :catchall_4
    move-exception v0

    .line 1055
    move-object v2, v8

    .line 1056
    goto :goto_29

    .line 1057
    :goto_2a
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 1058
    .line 1059
    iget-object v4, v0, La/yx90;->a:La/bmq0;

    .line 1060
    .line 1061
    iget-object v5, v0, La/yx90;->b:La/vn30;

    .line 1062
    .line 1063
    iget-boolean v0, v9, La/bmo;->f:Z

    .line 1064
    .line 1065
    if-eqz v0, :cond_33

    .line 1066
    .line 1067
    move-wide v6, v10

    .line 1068
    goto :goto_2b

    .line 1069
    :cond_33
    move-wide/from16 v6, v16

    .line 1070
    .line 1071
    :goto_2b
    const/4 v8, 0x0

    .line 1072
    move-object v3, v2

    .line 1073
    move-object/from16 v2, p1

    .line 1074
    .line 1075
    invoke-virtual/range {v1 .. v8}, La/dmo;->C0(La/bmq0;La/vn30;La/bmq0;La/vn30;JZ)V

    .line 1076
    .line 1077
    .line 1078
    move-object v13, v2

    .line 1079
    move-object v2, v3

    .line 1080
    iget-boolean v0, v9, La/bmo;->g:Z

    .line 1081
    .line 1082
    if-nez v0, :cond_34

    .line 1083
    .line 1084
    iget-wide v3, v9, La/bmo;->c:J

    .line 1085
    .line 1086
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 1087
    .line 1088
    iget-wide v5, v0, La/yx90;->c:J

    .line 1089
    .line 1090
    cmp-long v0, v3, v5

    .line 1091
    .line 1092
    if-eqz v0, :cond_36

    .line 1093
    .line 1094
    :cond_34
    iget-wide v5, v9, La/bmo;->c:J

    .line 1095
    .line 1096
    iget-boolean v0, v9, La/bmo;->h:Z

    .line 1097
    .line 1098
    if-eqz v0, :cond_35

    .line 1099
    .line 1100
    move-wide v3, v10

    .line 1101
    move-wide v7, v3

    .line 1102
    goto :goto_2c

    .line 1103
    :cond_35
    iget-object v3, v1, La/dmo;->i1:La/yx90;

    .line 1104
    .line 1105
    iget-wide v3, v3, La/yx90;->d:J

    .line 1106
    .line 1107
    move-wide v7, v3

    .line 1108
    move-wide v3, v10

    .line 1109
    :goto_2c
    iget v10, v9, La/bmo;->i:I

    .line 1110
    .line 1111
    move v9, v0

    .line 1112
    invoke-virtual/range {v1 .. v10}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    iput-object v0, v1, La/dmo;->i1:La/yx90;

    .line 1117
    .line 1118
    :cond_36
    invoke-virtual {v1}, La/dmo;->P()V

    .line 1119
    .line 1120
    .line 1121
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 1122
    .line 1123
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 1124
    .line 1125
    invoke-virtual {v1, v13, v0}, La/dmo;->R(La/bmq0;La/bmq0;)V

    .line 1126
    .line 1127
    .line 1128
    iget-object v0, v1, La/dmo;->i1:La/yx90;

    .line 1129
    .line 1130
    invoke-virtual {v0, v13}, La/yx90;->j(La/bmq0;)La/yx90;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    iput-object v0, v1, La/dmo;->i1:La/yx90;

    .line 1135
    .line 1136
    invoke-virtual {v13}, La/bmq0;->p()Z

    .line 1137
    .line 1138
    .line 1139
    move-result v0

    .line 1140
    if-nez v0, :cond_37

    .line 1141
    .line 1142
    iput-object v12, v1, La/dmo;->w1:La/cmo;

    .line 1143
    .line 1144
    :cond_37
    const/4 v4, 0x0

    .line 1145
    invoke-virtual {v1, v4}, La/dmo;->t(Z)V

    .line 1146
    .line 1147
    .line 1148
    iget-object v0, v1, La/dmo;->g:La/q9o0;

    .line 1149
    .line 1150
    const/4 v8, 0x2

    .line 1151
    invoke-virtual {v0, v8}, La/q9o0;->h(I)V

    .line 1152
    .line 1153
    .line 1154
    return-void

    .line 1155
    :goto_2d
    iget-object v3, v1, La/dmo;->i1:La/yx90;

    .line 1156
    .line 1157
    iget-object v4, v3, La/yx90;->a:La/bmq0;

    .line 1158
    .line 1159
    iget-object v5, v3, La/yx90;->b:La/vn30;

    .line 1160
    .line 1161
    iget-boolean v3, v9, La/bmo;->f:Z

    .line 1162
    .line 1163
    if-eqz v3, :cond_38

    .line 1164
    .line 1165
    move-wide v6, v10

    .line 1166
    goto :goto_2e

    .line 1167
    :cond_38
    move-wide/from16 v6, v16

    .line 1168
    .line 1169
    :goto_2e
    const/4 v8, 0x0

    .line 1170
    move-object v3, v2

    .line 1171
    move-object v2, v13

    .line 1172
    invoke-virtual/range {v1 .. v8}, La/dmo;->C0(La/bmq0;La/vn30;La/bmq0;La/vn30;JZ)V

    .line 1173
    .line 1174
    .line 1175
    move-object v2, v3

    .line 1176
    iget-boolean v3, v9, La/bmo;->g:Z

    .line 1177
    .line 1178
    if-nez v3, :cond_39

    .line 1179
    .line 1180
    iget-wide v3, v9, La/bmo;->c:J

    .line 1181
    .line 1182
    iget-object v5, v1, La/dmo;->i1:La/yx90;

    .line 1183
    .line 1184
    iget-wide v5, v5, La/yx90;->c:J

    .line 1185
    .line 1186
    cmp-long v3, v3, v5

    .line 1187
    .line 1188
    if-eqz v3, :cond_3b

    .line 1189
    .line 1190
    :cond_39
    iget-wide v5, v9, La/bmo;->c:J

    .line 1191
    .line 1192
    iget-boolean v3, v9, La/bmo;->h:Z

    .line 1193
    .line 1194
    if-eqz v3, :cond_3a

    .line 1195
    .line 1196
    move-wide v7, v10

    .line 1197
    goto :goto_2f

    .line 1198
    :cond_3a
    iget-object v4, v1, La/dmo;->i1:La/yx90;

    .line 1199
    .line 1200
    iget-wide v7, v4, La/yx90;->d:J

    .line 1201
    .line 1202
    :goto_2f
    iget v4, v9, La/bmo;->i:I

    .line 1203
    .line 1204
    move v9, v3

    .line 1205
    move-wide/from16 v42, v10

    .line 1206
    .line 1207
    move v10, v4

    .line 1208
    move-wide/from16 v3, v42

    .line 1209
    .line 1210
    invoke-virtual/range {v1 .. v10}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v2

    .line 1214
    iput-object v2, v1, La/dmo;->i1:La/yx90;

    .line 1215
    .line 1216
    :cond_3b
    invoke-virtual {v1}, La/dmo;->P()V

    .line 1217
    .line 1218
    .line 1219
    iget-object v2, v1, La/dmo;->i1:La/yx90;

    .line 1220
    .line 1221
    iget-object v2, v2, La/yx90;->a:La/bmq0;

    .line 1222
    .line 1223
    invoke-virtual {v1, v13, v2}, La/dmo;->R(La/bmq0;La/bmq0;)V

    .line 1224
    .line 1225
    .line 1226
    iget-object v2, v1, La/dmo;->i1:La/yx90;

    .line 1227
    .line 1228
    invoke-virtual {v2, v13}, La/yx90;->j(La/bmq0;)La/yx90;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v2

    .line 1232
    iput-object v2, v1, La/dmo;->i1:La/yx90;

    .line 1233
    .line 1234
    invoke-virtual {v13}, La/bmq0;->p()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v2

    .line 1238
    if-nez v2, :cond_3c

    .line 1239
    .line 1240
    iput-object v12, v1, La/dmo;->w1:La/cmo;

    .line 1241
    .line 1242
    :cond_3c
    const/4 v4, 0x0

    .line 1243
    invoke-virtual {v1, v4}, La/dmo;->t(Z)V

    .line 1244
    .line 1245
    .line 1246
    iget-object v1, v1, La/dmo;->g:La/q9o0;

    .line 1247
    .line 1248
    const/4 v8, 0x2

    .line 1249
    invoke-virtual {v1, v8}, La/q9o0;->h(I)V

    .line 1250
    .line 1251
    .line 1252
    throw v0
.end method

.method public final u0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v0, v0, La/pn30;->i:La/nn30;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v0, v0, La/nn30;->o:La/ucs0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, La/dmo;->a:[La/ujf0;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-ge v1, v3, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0, v1}, La/ucs0;->p(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    aget-object v2, v2, v1

    .line 24
    .line 25
    invoke-virtual {v2}, La/ujf0;->p()V

    .line 26
    .line 27
    .line 28
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_2
    return-void
.end method

.method public final v(La/mn30;)V
    .locals 12

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v1, v0, La/pn30;->l:La/nn30;

    .line 4
    .line 5
    iget-object v2, p0, La/dmo;->m:La/cwj;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    iget-object v4, v1, La/nn30;->a:La/f930;

    .line 11
    .line 12
    if-ne v4, p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean p1, v1, La/nn30;->e:Z

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, La/cwj;->d()La/zx90;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget p1, p1, La/zx90;->a:F

    .line 26
    .line 27
    iget-object v2, p0, La/dmo;->i1:La/yx90;

    .line 28
    .line 29
    iget-object v4, v2, La/yx90;->a:La/bmq0;

    .line 30
    .line 31
    iget-boolean v2, v2, La/yx90;->l:Z

    .line 32
    .line 33
    invoke-virtual {v1, p1, v4, v2}, La/nn30;->f(FLa/bmq0;Z)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, v1, La/nn30;->g:La/on30;

    .line 37
    .line 38
    iget-object p1, p1, La/on30;->a:La/vn30;

    .line 39
    .line 40
    iget-object v2, v1, La/nn30;->o:La/ucs0;

    .line 41
    .line 42
    invoke-virtual {p0, p1, v2}, La/dmo;->y0(La/vn30;La/ucs0;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v0, La/pn30;->i:La/nn30;

    .line 46
    .line 47
    if-ne v1, p1, :cond_1

    .line 48
    .line 49
    iget-object p1, v1, La/nn30;->g:La/on30;

    .line 50
    .line 51
    iget-wide v4, p1, La/on30;->b:J

    .line 52
    .line 53
    invoke-virtual {p0, v3, v4, v5}, La/dmo;->Q(ZJ)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/dmo;->z()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    xor-int/2addr p1, v3

    .line 61
    invoke-static {p1}, La/x0x;->K(Z)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La/dmo;->a:[La/ujf0;

    .line 65
    .line 66
    array-length p1, p1

    .line 67
    new-array p1, p1, [Z

    .line 68
    .line 69
    invoke-virtual {v0}, La/pn30;->d()La/nn30;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, La/nn30;->e()J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    invoke-virtual {p0, p1, v2, v3}, La/dmo;->k([ZJ)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v1}, La/dmo;->a0(La/nn30;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 84
    .line 85
    iget-object v3, p1, La/yx90;->b:La/vn30;

    .line 86
    .line 87
    iget-object v0, v1, La/nn30;->g:La/on30;

    .line 88
    .line 89
    iget-wide v4, v0, La/on30;->b:J

    .line 90
    .line 91
    iget-wide v6, p1, La/yx90;->c:J

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    const/4 v11, 0x5

    .line 95
    move-wide v8, v4

    .line 96
    move-object v2, p0

    .line 97
    invoke-virtual/range {v2 .. v11}, La/dmo;->x(La/vn30;JJJZI)La/yx90;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    move-object v1, v2

    .line 102
    iput-object p0, v1, La/dmo;->i1:La/yx90;

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    move-object v1, p0

    .line 106
    :goto_0
    invoke-virtual {v1}, La/dmo;->C()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_2
    move-object v1, p0

    .line 111
    const/4 p0, 0x0

    .line 112
    :goto_1
    iget-object v4, v0, La/pn30;->q:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-ge p0, v4, :cond_4

    .line 119
    .line 120
    iget-object v4, v0, La/pn30;->q:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, La/nn30;

    .line 127
    .line 128
    iget-object v5, v4, La/nn30;->a:La/f930;

    .line 129
    .line 130
    if-ne v5, p1, :cond_3

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    const/4 v4, 0x0

    .line 137
    :goto_2
    if-eqz v4, :cond_5

    .line 138
    .line 139
    iget-boolean p0, v4, La/nn30;->e:Z

    .line 140
    .line 141
    xor-int/2addr p0, v3

    .line 142
    invoke-static {p0}, La/x0x;->K(Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, La/cwj;->d()La/zx90;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    iget p0, p0, La/zx90;->a:F

    .line 150
    .line 151
    iget-object v2, v1, La/dmo;->i1:La/yx90;

    .line 152
    .line 153
    iget-object v3, v2, La/yx90;->a:La/bmq0;

    .line 154
    .line 155
    iget-boolean v2, v2, La/yx90;->l:Z

    .line 156
    .line 157
    invoke-virtual {v4, p0, v3, v2}, La/nn30;->f(FLa/bmq0;Z)V

    .line 158
    .line 159
    .line 160
    iget-object p0, v0, La/pn30;->m:La/nn30;

    .line 161
    .line 162
    if-eqz p0, :cond_5

    .line 163
    .line 164
    iget-object p0, p0, La/nn30;->a:La/f930;

    .line 165
    .line 166
    if-ne p0, p1, :cond_5

    .line 167
    .line 168
    invoke-virtual {v1}, La/dmo;->D()V

    .line 169
    .line 170
    .line 171
    :cond_5
    return-void
.end method

.method public final v0(ZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, La/dmo;->s1:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v1

    .line 13
    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, La/dmo;->O(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, La/dmo;->j1:La/amo;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, La/amo;->c(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, La/dmo;->f:La/xvj;

    .line 22
    .line 23
    iget-object p2, p1, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    iget-object v0, p0, La/dmo;->u:La/a4a0;

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, La/wvj;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget v3, v2, La/wvj;->a:I

    .line 36
    .line 37
    sub-int/2addr v3, v1

    .line 38
    iput v3, v2, La/wvj;->a:I

    .line 39
    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, La/xvj;->c()V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, La/dmo;->i1:La/yx90;

    .line 49
    .line 50
    iget-boolean p1, p1, La/yx90;->l:Z

    .line 51
    .line 52
    iget-object p2, p0, La/dmo;->z:La/x24;

    .line 53
    .line 54
    invoke-virtual {p2, v1, p1}, La/x24;->c(IZ)I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, La/dmo;->o0(I)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final w(La/zx90;FZZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, La/dmo;->j1:La/amo;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, La/amo;->c(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, La/dmo;->i1:La/yx90;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, La/yx90;->g(La/zx90;)La/yx90;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, La/dmo;->i1:La/yx90;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, La/zx90;->a:F

    .line 20
    .line 21
    iget-object p4, p0, La/dmo;->q:La/pn30;

    .line 22
    .line 23
    iget-object p4, p4, La/pn30;->i:La/nn30;

    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-eqz p4, :cond_4

    .line 27
    .line 28
    iget-object v1, p4, La/nn30;->o:La/ucs0;

    .line 29
    .line 30
    iget-object v1, v1, La/ucs0;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, [La/fmo;

    .line 33
    .line 34
    array-length v2, v1

    .line 35
    :goto_1
    if-ge v0, v2, :cond_3

    .line 36
    .line 37
    aget-object v3, v1, v0

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-interface {v3, p3}, La/fmo;->i(F)V

    .line 42
    .line 43
    .line 44
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object p4, p4, La/nn30;->m:La/nn30;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 51
    .line 52
    array-length p3, p0

    .line 53
    :goto_2
    if-ge v0, p3, :cond_6

    .line 54
    .line 55
    aget-object p4, p0, v0

    .line 56
    .line 57
    iget v1, p1, La/zx90;->a:F

    .line 58
    .line 59
    iget-object v2, p4, La/ujf0;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, La/j16;

    .line 62
    .line 63
    invoke-virtual {v2, p2, v1}, La/j16;->C(FF)V

    .line 64
    .line 65
    .line 66
    iget-object p4, p4, La/ujf0;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p4, La/j16;

    .line 69
    .line 70
    if-eqz p4, :cond_5

    .line 71
    .line 72
    invoke-virtual {p4, p2, v1}, La/j16;->C(FF)V

    .line 73
    .line 74
    .line 75
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_6
    return-void
.end method

.method public final w0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/dmo;->m:La/cwj;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, La/cwj;->b:Z

    .line 5
    .line 6
    iget-object v0, v0, La/cwj;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/d4m0;

    .line 9
    .line 10
    iget-boolean v2, v0, La/d4m0;->b:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, La/d4m0;->e()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {v0, v2, v3}, La/d4m0;->c(J)V

    .line 19
    .line 20
    .line 21
    iput-boolean v1, v0, La/d4m0;->b:Z

    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, La/dmo;->a:[La/ujf0;

    .line 24
    .line 25
    array-length v0, p0

    .line 26
    :goto_0
    if-ge v1, v0, :cond_3

    .line 27
    .line 28
    aget-object v2, p0, v1

    .line 29
    .line 30
    iget-object v3, v2, La/ujf0;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, La/j16;

    .line 33
    .line 34
    iget-object v2, v2, La/ujf0;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, La/j16;

    .line 37
    .line 38
    invoke-static {v2}, La/ujf0;->k(La/j16;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-static {v2}, La/ujf0;->b(La/j16;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    if-eqz v3, :cond_2

    .line 48
    .line 49
    iget-byte v2, v3, La/j16;->h:B

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-static {v3}, La/ujf0;->b(La/j16;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    return-void
.end method

.method public final x(La/vn30;JJJZI)La/yx90;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v4, p4

    .line 6
    .line 7
    move/from16 v2, p9

    .line 8
    .line 9
    iget-boolean v3, v0, La/dmo;->A1:Z

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, La/dmo;->i1:La/yx90;

    .line 15
    .line 16
    iget-wide v8, v3, La/yx90;->s:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v0, La/dmo;->i1:La/yx90;

    .line 23
    .line 24
    iget-object v3, v3, La/yx90;->b:La/vn30;

    .line 25
    .line 26
    invoke-virtual {v1, v3}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v7

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 36
    :goto_1
    iput-boolean v3, v0, La/dmo;->A1:Z

    .line 37
    .line 38
    invoke-virtual {v0}, La/dmo;->P()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, La/dmo;->i1:La/yx90;

    .line 42
    .line 43
    iget-object v8, v3, La/yx90;->h:La/dcs0;

    .line 44
    .line 45
    iget-object v9, v3, La/yx90;->i:La/ucs0;

    .line 46
    .line 47
    iget-object v10, v3, La/yx90;->j:Ljava/util/List;

    .line 48
    .line 49
    iget-object v11, v0, La/dmo;->r:La/jo30;

    .line 50
    .line 51
    iget-boolean v11, v11, La/jo30;->l:Z

    .line 52
    .line 53
    if-eqz v11, :cond_10

    .line 54
    .line 55
    iget-object v3, v0, La/dmo;->q:La/pn30;

    .line 56
    .line 57
    iget-object v3, v3, La/pn30;->i:La/nn30;

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    sget-object v8, La/dcs0;->d:La/dcs0;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v8, v3, La/nn30;->n:La/dcs0;

    .line 65
    .line 66
    :goto_2
    if-nez v3, :cond_3

    .line 67
    .line 68
    iget-object v9, v0, La/dmo;->e:La/ucs0;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v9, v3, La/nn30;->o:La/ucs0;

    .line 72
    .line 73
    :goto_3
    iget-object v10, v9, La/ucs0;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v10, [La/fmo;

    .line 76
    .line 77
    new-instance v11, La/u3x;

    .line 78
    .line 79
    const/4 v12, 0x4

    .line 80
    invoke-direct {v11, v12}, La/r3x;-><init>(I)V

    .line 81
    .line 82
    .line 83
    array-length v12, v10

    .line 84
    move v13, v7

    .line 85
    move v14, v13

    .line 86
    :goto_4
    if-ge v13, v12, :cond_6

    .line 87
    .line 88
    aget-object v15, v10, v13

    .line 89
    .line 90
    if-eqz v15, :cond_5

    .line 91
    .line 92
    invoke-interface {v15, v7}, La/fmo;->f(I)Landroidx/media3/common/b;

    .line 93
    .line 94
    .line 95
    move-result-object v15

    .line 96
    iget-object v15, v15, Landroidx/media3/common/b;->m:La/ed40;

    .line 97
    .line 98
    if-nez v15, :cond_4

    .line 99
    .line 100
    new-instance v15, La/ed40;

    .line 101
    .line 102
    new-array v6, v7, [La/cd40;

    .line 103
    .line 104
    invoke-direct {v15, v6}, La/ed40;-><init>([La/cd40;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11, v15}, La/r3x;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_4
    invoke-virtual {v11, v15}, La/r3x;->b(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/4 v14, 0x1

    .line 115
    :cond_5
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    if-eqz v14, :cond_7

    .line 119
    .line 120
    invoke-virtual {v11}, La/u3x;->g()La/rcf0;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    :goto_6
    move-object v10, v6

    .line 125
    goto :goto_7

    .line 126
    :cond_7
    sget-object v6, La/b4x;->b:La/v3x;

    .line 127
    .line 128
    sget-object v6, La/rcf0;->e:La/rcf0;

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :goto_7
    if-eqz v3, :cond_8

    .line 132
    .line 133
    iget-object v6, v3, La/nn30;->g:La/on30;

    .line 134
    .line 135
    iget-wide v11, v6, La/on30;->d:J

    .line 136
    .line 137
    cmp-long v11, v11, v4

    .line 138
    .line 139
    if-eqz v11, :cond_8

    .line 140
    .line 141
    invoke-virtual {v6, v4, v5}, La/on30;->a(J)La/on30;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    iput-object v6, v3, La/nn30;->g:La/on30;

    .line 146
    .line 147
    :cond_8
    iget-object v3, v0, La/dmo;->a:[La/ujf0;

    .line 148
    .line 149
    invoke-virtual {v0}, La/dmo;->z()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_9

    .line 154
    .line 155
    goto :goto_b

    .line 156
    :cond_9
    iget-object v6, v0, La/dmo;->q:La/pn30;

    .line 157
    .line 158
    iget-object v6, v6, La/pn30;->i:La/nn30;

    .line 159
    .line 160
    if-eqz v6, :cond_f

    .line 161
    .line 162
    iget-object v6, v6, La/nn30;->o:La/ucs0;

    .line 163
    .line 164
    move v11, v7

    .line 165
    move v12, v11

    .line 166
    :goto_8
    array-length v13, v3

    .line 167
    if-ge v11, v13, :cond_c

    .line 168
    .line 169
    invoke-virtual {v6, v11}, La/ucs0;->p(I)Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-eqz v13, :cond_b

    .line 174
    .line 175
    aget-object v13, v3, v11

    .line 176
    .line 177
    iget-object v13, v13, La/ujf0;->e:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v13, La/j16;

    .line 180
    .line 181
    iget-byte v13, v13, La/j16;->b:B

    .line 182
    .line 183
    const/4 v14, 0x1

    .line 184
    if-eq v13, v14, :cond_a

    .line 185
    .line 186
    move v14, v7

    .line 187
    goto :goto_9

    .line 188
    :cond_a
    iget-object v13, v6, La/ucs0;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v13, [La/tjf0;

    .line 191
    .line 192
    aget-object v13, v13, v11

    .line 193
    .line 194
    iget-byte v13, v13, La/tjf0;->a:B

    .line 195
    .line 196
    if-eqz v13, :cond_b

    .line 197
    .line 198
    const/4 v12, 0x1

    .line 199
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_c
    const/4 v14, 0x1

    .line 203
    :goto_9
    if-eqz v12, :cond_d

    .line 204
    .line 205
    if-eqz v14, :cond_d

    .line 206
    .line 207
    const/4 v14, 0x1

    .line 208
    goto :goto_a

    .line 209
    :cond_d
    move v14, v7

    .line 210
    :goto_a
    iget-boolean v3, v0, La/dmo;->u1:Z

    .line 211
    .line 212
    if-ne v14, v3, :cond_e

    .line 213
    .line 214
    goto :goto_b

    .line 215
    :cond_e
    iput-boolean v14, v0, La/dmo;->u1:Z

    .line 216
    .line 217
    if-nez v14, :cond_f

    .line 218
    .line 219
    iget-object v3, v0, La/dmo;->i1:La/yx90;

    .line 220
    .line 221
    iget-boolean v3, v3, La/yx90;->p:Z

    .line 222
    .line 223
    if-eqz v3, :cond_f

    .line 224
    .line 225
    iget-object v3, v0, La/dmo;->g:La/q9o0;

    .line 226
    .line 227
    const/4 v6, 0x2

    .line 228
    invoke-virtual {v3, v6}, La/q9o0;->h(I)V

    .line 229
    .line 230
    .line 231
    :cond_f
    :goto_b
    move-object v11, v9

    .line 232
    move-object v12, v10

    .line 233
    move-object v10, v8

    .line 234
    goto :goto_c

    .line 235
    :cond_10
    iget-object v3, v3, La/yx90;->b:La/vn30;

    .line 236
    .line 237
    invoke-virtual {v1, v3}, La/vn30;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-nez v3, :cond_f

    .line 242
    .line 243
    sget-object v8, La/dcs0;->d:La/dcs0;

    .line 244
    .line 245
    iget-object v9, v0, La/dmo;->e:La/ucs0;

    .line 246
    .line 247
    sget-object v3, La/b4x;->b:La/v3x;

    .line 248
    .line 249
    sget-object v10, La/rcf0;->e:La/rcf0;

    .line 250
    .line 251
    goto :goto_b

    .line 252
    :goto_c
    if-eqz p8, :cond_13

    .line 253
    .line 254
    iget-object v3, v0, La/dmo;->j1:La/amo;

    .line 255
    .line 256
    iget-boolean v6, v3, La/amo;->e:Z

    .line 257
    .line 258
    if-eqz v6, :cond_12

    .line 259
    .line 260
    iget v6, v3, La/amo;->c:I

    .line 261
    .line 262
    const/4 v8, 0x5

    .line 263
    if-eq v6, v8, :cond_12

    .line 264
    .line 265
    if-ne v2, v8, :cond_11

    .line 266
    .line 267
    const/4 v6, 0x1

    .line 268
    goto :goto_d

    .line 269
    :cond_11
    move v6, v7

    .line 270
    :goto_d
    invoke-static {v6}, La/x0x;->A(Z)V

    .line 271
    .line 272
    .line 273
    goto :goto_e

    .line 274
    :cond_12
    const/4 v14, 0x1

    .line 275
    iput-boolean v14, v3, La/amo;->d:Z

    .line 276
    .line 277
    iput-boolean v14, v3, La/amo;->e:Z

    .line 278
    .line 279
    iput v2, v3, La/amo;->c:I

    .line 280
    .line 281
    :cond_13
    :goto_e
    iget-object v2, v0, La/dmo;->i1:La/yx90;

    .line 282
    .line 283
    iget-wide v6, v2, La/yx90;->q:J

    .line 284
    .line 285
    invoke-virtual {v0, v6, v7}, La/dmo;->o(J)J

    .line 286
    .line 287
    .line 288
    move-result-wide v8

    .line 289
    move-wide/from16 v6, p6

    .line 290
    .line 291
    move-object v0, v2

    .line 292
    move-wide/from16 v2, p2

    .line 293
    .line 294
    invoke-virtual/range {v0 .. v12}, La/yx90;->d(La/vn30;JJJJLa/dcs0;La/ucs0;Ljava/util/List;)La/yx90;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    return-object v0
.end method

.method public final x0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v0, v0, La/pn30;->l:La/nn30;

    .line 4
    .line 5
    iget-boolean v1, p0, La/dmo;->p1:Z

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, La/nn30;->a:La/f930;

    .line 12
    .line 13
    invoke-virtual {v0}, La/f930;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    :goto_1
    iget-object v1, p0, La/dmo;->i1:La/yx90;

    .line 24
    .line 25
    iget-boolean v2, v1, La/yx90;->g:Z

    .line 26
    .line 27
    if-eq v0, v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/yx90;->b(Z)La/yx90;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/dmo;->i1:La/yx90;

    .line 34
    .line 35
    :cond_2
    return-void
.end method

.method public final y0(La/vn30;La/ucs0;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/dmo;->q:La/pn30;

    .line 2
    .line 3
    iget-object v0, v0, La/pn30;->l:La/nn30;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, La/nn30;->d()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-virtual {p0, v1, v2}, La/dmo;->o(J)J

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, La/dmo;->i1:La/yx90;

    .line 16
    .line 17
    iget-object v1, v1, La/yx90;->a:La/bmq0;

    .line 18
    .line 19
    iget-object v0, v0, La/nn30;->g:La/on30;

    .line 20
    .line 21
    iget-object v0, v0, La/on30;->a:La/vn30;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, La/dmo;->t0(La/bmq0;La/vn30;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, La/dmo;->s:La/vvj;

    .line 30
    .line 31
    iget-wide v0, v0, La/vvj;->h:J

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, La/dmo;->i1:La/yx90;

    .line 34
    .line 35
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 36
    .line 37
    iget-object v1, p0, La/dmo;->m:La/cwj;

    .line 38
    .line 39
    invoke-virtual {v1}, La/cwj;->d()La/zx90;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget v1, v1, La/zx90;->a:F

    .line 44
    .line 45
    iget-object v1, p0, La/dmo;->i1:La/yx90;

    .line 46
    .line 47
    iget-boolean v1, v1, La/yx90;->l:Z

    .line 48
    .line 49
    iget-object p2, p2, La/ucs0;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, [La/fmo;

    .line 52
    .line 53
    iget-object v1, p0, La/dmo;->f:La/xvj;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v2, v1, La/xvj;->m:La/wcf0;

    .line 59
    .line 60
    iget-object p0, p0, La/dmo;->u:La/a4a0;

    .line 61
    .line 62
    iget-object v3, p0, La/a4a0;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v2, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Ljava/lang/Integer;

    .line 69
    .line 70
    const/4 v3, -0x1

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eq v4, v3, :cond_1

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move v2, v3

    .line 85
    :goto_0
    iget-object v4, v1, La/xvj;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 86
    .line 87
    invoke-virtual {v4, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/wvj;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    if-ne v2, v3, :cond_8

    .line 97
    .line 98
    iget-object p1, p1, La/vn30;->a:Ljava/lang/Object;

    .line 99
    .line 100
    iget-object v2, v1, La/xvj;->b:La/amq0;

    .line 101
    .line 102
    invoke-virtual {v0, p1, v2}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget p1, p1, La/amq0;->c:I

    .line 107
    .line 108
    iget-object v2, v1, La/xvj;->a:Landroidx/media3/common/Timeline$Window;

    .line 109
    .line 110
    const-wide/16 v3, 0x0

    .line 111
    .line 112
    invoke-virtual {v0, p1, v2, v3, v4}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object p1, p1, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 117
    .line 118
    iget-object p1, p1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    if-nez p1, :cond_3

    .line 122
    .line 123
    :cond_2
    move p1, v0

    .line 124
    goto :goto_1

    .line 125
    :cond_3
    iget-object p1, p1, La/en30;->a:Landroid/net/Uri;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-nez v2, :cond_4

    .line 136
    .line 137
    sget-object v2, La/xvj;->p:La/rcf0;

    .line 138
    .line 139
    invoke-virtual {v2, p1}, La/b4x;->contains(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_2

    .line 144
    .line 145
    :cond_4
    const/4 p1, 0x1

    .line 146
    :goto_1
    array-length v2, p2

    .line 147
    move v3, v0

    .line 148
    move v4, v3

    .line 149
    :goto_2
    const/high16 v5, 0xc80000

    .line 150
    .line 151
    if-ge v3, v2, :cond_7

    .line 152
    .line 153
    aget-object v6, p2, v3

    .line 154
    .line 155
    if-eqz v6, :cond_6

    .line 156
    .line 157
    invoke-interface {v6}, La/fmo;->n()La/ccs0;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    iget v6, v6, La/ccs0;->c:I

    .line 162
    .line 163
    const/high16 v7, 0x20000

    .line 164
    .line 165
    packed-switch v6, :pswitch_data_0

    .line 166
    .line 167
    .line 168
    invoke-static {}, La/e9d0;->o()V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_0
    move v5, v7

    .line 173
    goto :goto_3

    .line 174
    :pswitch_1
    const/high16 v5, 0x1900000

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :pswitch_2
    if-eqz p1, :cond_5

    .line 178
    .line 179
    const/high16 v5, 0x12c0000

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_5
    const/high16 v5, 0x7d00000

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :pswitch_3
    const/high16 v5, 0x89a0000

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :pswitch_4
    move v5, v0

    .line 189
    :goto_3
    :pswitch_5
    add-int/2addr v4, v5

    .line 190
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_7
    const/high16 p1, 0xc880000

    .line 194
    .line 195
    invoke-static {v4, v5, p1}, La/vtt0;->i(III)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    :cond_8
    iput v2, p0, La/wvj;->c:I

    .line 200
    .line 201
    invoke-virtual {v1}, La/xvj;->c()V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final z()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, La/dmo;->a:[La/ujf0;

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    iget-object v2, p0, La/dmo;->q:La/pn30;

    .line 9
    .line 10
    iget-object v3, v2, La/pn30;->i:La/nn30;

    .line 11
    .line 12
    iget-object v2, v2, La/pn30;->j:[La/nn30;

    .line 13
    .line 14
    aget-object v2, v2, v1

    .line 15
    .line 16
    if-eq v3, v2, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v0
.end method

.method public final z0(IILjava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/dmo;->j1:La/amo;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, La/amo;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/dmo;->r:La/jo30;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, La/jo30;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-ltz p1, :cond_0

    .line 16
    .line 17
    if-gt p1, p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-gt p2, v4, :cond_0

    .line 24
    .line 25
    move v4, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v4, v3

    .line 28
    :goto_0
    invoke-static {v4}, La/x0x;->A(Z)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    sub-int v5, p2, p1

    .line 36
    .line 37
    if-ne v4, v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v1, v3

    .line 41
    :goto_1
    invoke-static {v1}, La/x0x;->A(Z)V

    .line 42
    .line 43
    .line 44
    move v1, p1

    .line 45
    :goto_2
    if-ge v1, p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, La/io30;

    .line 52
    .line 53
    iget-object v4, v4, La/io30;->a:La/i930;

    .line 54
    .line 55
    sub-int v5, v1, p1

    .line 56
    .line 57
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Landroidx/media3/common/MediaItem;

    .line 62
    .line 63
    invoke-virtual {v4, v5}, La/i930;->r(Landroidx/media3/common/MediaItem;)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {v0}, La/jo30;->b()La/bmq0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p1, v3}, La/dmo;->u(La/bmq0;Z)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
