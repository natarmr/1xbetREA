.class public final La/afu0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fhj;

.field public final b:La/ueu0;

.field public final c:La/br8;

.field public final d:La/tyc;

.field public final e:La/tyc;

.field public final f:La/z55;

.field public final g:La/veu0;

.field public final h:La/fiq;

.field public i:J

.field public j:J

.field public k:J

.field public l:La/qfu0;

.field public m:J


# direct methods
.method public constructor <init>(La/fhj;La/ueu0;La/veu0;La/fiq;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/afu0;->a:La/fhj;

    .line 5
    .line 6
    iput-object p2, p0, La/afu0;->b:La/ueu0;

    .line 7
    .line 8
    iput-object p3, p0, La/afu0;->g:La/veu0;

    .line 9
    .line 10
    iput-object p4, p0, La/afu0;->h:La/fiq;

    .line 11
    .line 12
    new-instance p1, La/br8;

    .line 13
    .line 14
    invoke-direct {p1}, La/br8;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/afu0;->c:La/br8;

    .line 18
    .line 19
    new-instance p1, La/tyc;

    .line 20
    .line 21
    const/4 p2, 0x7

    .line 22
    invoke-direct {p1, p2}, La/tyc;-><init>(B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/afu0;->d:La/tyc;

    .line 26
    .line 27
    new-instance p1, La/tyc;

    .line 28
    .line 29
    invoke-direct {p1, p2}, La/tyc;-><init>(B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/afu0;->e:La/tyc;

    .line 33
    .line 34
    new-instance p1, La/z55;

    .line 35
    .line 36
    invoke-direct {p1}, La/z55;-><init>()V

    .line 37
    .line 38
    .line 39
    const/16 p2, 0x10

    .line 40
    .line 41
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    const/4 p4, 0x1

    .line 46
    if-eq p3, p4, :cond_0

    .line 47
    .line 48
    const/16 p2, 0xf

    .line 49
    .line 50
    invoke-static {p2}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    shl-int/2addr p2, p4

    .line 55
    :cond_0
    const/4 p3, 0x0

    .line 56
    iput p3, p1, La/z55;->b:I

    .line 57
    .line 58
    const/4 v0, -0x1

    .line 59
    iput v0, p1, La/z55;->c:I

    .line 60
    .line 61
    iput p3, p1, La/z55;->d:I

    .line 62
    .line 63
    new-array p3, p2, [J

    .line 64
    .line 65
    iput-object p3, p1, La/z55;->f:Ljava/lang/Object;

    .line 66
    .line 67
    sub-int/2addr p2, p4

    .line 68
    iput p2, p1, La/z55;->e:I

    .line 69
    .line 70
    iput-object p1, p0, La/afu0;->f:La/z55;

    .line 71
    .line 72
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    iput-wide p1, p0, La/afu0;->i:J

    .line 78
    .line 79
    sget-object p3, La/qfu0;->d:La/qfu0;

    .line 80
    .line 81
    iput-object p3, p0, La/afu0;->l:La/qfu0;

    .line 82
    .line 83
    iput-wide p1, p0, La/afu0;->j:J

    .line 84
    .line 85
    iput-wide p1, p0, La/afu0;->k:J

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/afu0;->a:La/fhj;

    .line 4
    .line 5
    iget-object v2, v1, La/fhj;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/czj;

    .line 8
    .line 9
    :goto_0
    iget-object v3, v0, La/afu0;->f:La/z55;

    .line 10
    .line 11
    iget v4, v3, La/z55;->d:I

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-eqz v4, :cond_d

    .line 17
    .line 18
    iget-object v4, v3, La/z55;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, [J

    .line 21
    .line 22
    iget v5, v3, La/z55;->b:I

    .line 23
    .line 24
    aget-wide v7, v4, v5

    .line 25
    .line 26
    iget-object v4, v0, La/afu0;->e:La/tyc;

    .line 27
    .line 28
    invoke-virtual {v4, v7, v8}, La/tyc;->Y(J)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Long;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    iget-object v6, v0, La/afu0;->b:La/ueu0;

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v9

    .line 43
    iget-wide v11, v0, La/afu0;->m:J

    .line 44
    .line 45
    cmp-long v9, v9, v11

    .line 46
    .line 47
    if-eqz v9, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    iput-wide v9, v0, La/afu0;->m:J

    .line 54
    .line 55
    invoke-virtual {v6, v5}, La/ueu0;->e(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    const-wide/16 v9, 0x3e8

    .line 59
    .line 60
    mul-long/2addr v9, v7

    .line 61
    iget-object v4, v0, La/afu0;->h:La/fiq;

    .line 62
    .line 63
    invoke-virtual {v4, v9, v10}, La/fiq;->b(J)V

    .line 64
    .line 65
    .line 66
    iget-wide v13, v0, La/afu0;->m:J

    .line 67
    .line 68
    invoke-virtual {v4}, La/fiq;->a()J

    .line 69
    .line 70
    .line 71
    move-result-wide v17

    .line 72
    iget-wide v9, v4, La/fiq;->h:J

    .line 73
    .line 74
    move-object v4, v6

    .line 75
    iget-object v6, v0, La/afu0;->b:La/ueu0;

    .line 76
    .line 77
    const/4 v15, 0x0

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    iget-object v11, v0, La/afu0;->c:La/br8;

    .line 81
    .line 82
    move-wide/from16 v19, v9

    .line 83
    .line 84
    move-object/from16 v21, v11

    .line 85
    .line 86
    move-wide/from16 v9, p1

    .line 87
    .line 88
    move-wide/from16 v11, p3

    .line 89
    .line 90
    invoke-virtual/range {v6 .. v21}, La/ueu0;->a(JJJJZZJJLa/br8;)I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    move-object/from16 v9, v21

    .line 95
    .line 96
    const/4 v10, 0x4

    .line 97
    const/4 v11, 0x5

    .line 98
    if-eq v6, v11, :cond_2

    .line 99
    .line 100
    if-eq v6, v10, :cond_2

    .line 101
    .line 102
    iget-object v12, v0, La/afu0;->g:La/veu0;

    .line 103
    .line 104
    iget-wide v13, v9, La/br8;->b:J

    .line 105
    .line 106
    invoke-virtual {v12, v7, v8, v13, v14}, La/veu0;->a(JJ)V

    .line 107
    .line 108
    .line 109
    :cond_2
    const/4 v12, 0x3

    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x1

    .line 112
    if-eqz v6, :cond_6

    .line 113
    .line 114
    if-eq v6, v14, :cond_6

    .line 115
    .line 116
    if-eq v6, v5, :cond_5

    .line 117
    .line 118
    if-eq v6, v12, :cond_5

    .line 119
    .line 120
    if-eq v6, v10, :cond_4

    .line 121
    .line 122
    if-ne v6, v11, :cond_3

    .line 123
    .line 124
    return-void

    .line 125
    :cond_3
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_4
    iput-wide v7, v0, La/afu0;->j:J

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_5
    iput-wide v7, v0, La/afu0;->j:J

    .line 137
    .line 138
    invoke-virtual {v3}, La/z55;->n()J

    .line 139
    .line 140
    .line 141
    iget-object v3, v2, La/czj;->j:Ljava/util/concurrent/Executor;

    .line 142
    .line 143
    new-instance v4, La/bzj;

    .line 144
    .line 145
    invoke-direct {v4, v1, v14}, La/bzj;-><init>(La/fhj;B)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 149
    .line 150
    .line 151
    iget-object v3, v2, La/czj;->d:Ljava/util/ArrayDeque;

    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, La/tm30;

    .line 158
    .line 159
    iget-object v4, v3, La/tm30;->c:La/xm30;

    .line 160
    .line 161
    iget-object v5, v3, La/tm30;->a:La/dm30;

    .line 162
    .line 163
    iget v3, v3, La/tm30;->b:I

    .line 164
    .line 165
    const-string v6, "dropVideoBuffer"

    .line 166
    .line 167
    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v5, v3}, La/dm30;->k(I)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v13, v14}, La/xm30;->U0(II)V

    .line 177
    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_6
    iput-wide v7, v0, La/afu0;->j:J

    .line 182
    .line 183
    if-nez v6, :cond_7

    .line 184
    .line 185
    move v5, v14

    .line 186
    goto :goto_1

    .line 187
    :cond_7
    move v5, v13

    .line 188
    :goto_1
    invoke-virtual {v3}, La/z55;->n()J

    .line 189
    .line 190
    .line 191
    move-result-wide v6

    .line 192
    iget-object v3, v0, La/afu0;->d:La/tyc;

    .line 193
    .line 194
    invoke-virtual {v3, v6, v7}, La/tyc;->Y(J)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, La/qfu0;

    .line 199
    .line 200
    if-eqz v3, :cond_8

    .line 201
    .line 202
    sget-object v8, La/qfu0;->d:La/qfu0;

    .line 203
    .line 204
    invoke-virtual {v3, v8}, La/qfu0;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-nez v8, :cond_8

    .line 209
    .line 210
    iget-object v8, v0, La/afu0;->l:La/qfu0;

    .line 211
    .line 212
    invoke-virtual {v3, v8}, La/qfu0;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-nez v8, :cond_8

    .line 217
    .line 218
    iput-object v3, v0, La/afu0;->l:La/qfu0;

    .line 219
    .line 220
    new-instance v8, La/awq;

    .line 221
    .line 222
    invoke-direct {v8}, La/awq;-><init>()V

    .line 223
    .line 224
    .line 225
    iget v10, v3, La/qfu0;->a:I

    .line 226
    .line 227
    iput v10, v8, La/awq;->v:I

    .line 228
    .line 229
    iget v10, v3, La/qfu0;->b:I

    .line 230
    .line 231
    iput v10, v8, La/awq;->w:I

    .line 232
    .line 233
    const-string v10, "video/raw"

    .line 234
    .line 235
    invoke-static {v10}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    iput-object v10, v8, La/awq;->o:Ljava/lang/String;

    .line 240
    .line 241
    new-instance v10, Landroidx/media3/common/b;

    .line 242
    .line 243
    invoke-direct {v10, v8}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 244
    .line 245
    .line 246
    iput-object v10, v1, La/fhj;->a:Ljava/lang/Object;

    .line 247
    .line 248
    iget-object v8, v2, La/czj;->j:Ljava/util/concurrent/Executor;

    .line 249
    .line 250
    new-instance v10, La/a4e;

    .line 251
    .line 252
    const/16 v11, 0x15

    .line 253
    .line 254
    invoke-direct {v10, v1, v3, v11}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v8, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 258
    .line 259
    .line 260
    :cond_8
    if-eqz v5, :cond_9

    .line 261
    .line 262
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 263
    .line 264
    .line 265
    move-result-wide v8

    .line 266
    :goto_2
    move-wide/from16 v18, v8

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_9
    iget-wide v8, v9, La/br8;->c:J

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :goto_3
    iget v3, v4, La/ueu0;->e:I

    .line 273
    .line 274
    if-eq v3, v12, :cond_a

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_a
    move v14, v13

    .line 278
    :goto_4
    iput v12, v4, La/ueu0;->e:I

    .line 279
    .line 280
    iget-object v3, v4, La/ueu0;->k:La/l9o0;

    .line 281
    .line 282
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 286
    .line 287
    .line 288
    move-result-wide v8

    .line 289
    invoke-static {v8, v9}, La/vtt0;->M(J)J

    .line 290
    .line 291
    .line 292
    move-result-wide v8

    .line 293
    iput-wide v8, v4, La/ueu0;->g:J

    .line 294
    .line 295
    if-eqz v14, :cond_b

    .line 296
    .line 297
    iget-object v3, v2, La/czj;->f:Landroid/view/Surface;

    .line 298
    .line 299
    if-eqz v3, :cond_b

    .line 300
    .line 301
    iget-object v3, v2, La/czj;->j:Ljava/util/concurrent/Executor;

    .line 302
    .line 303
    new-instance v4, La/bzj;

    .line 304
    .line 305
    invoke-direct {v4, v1, v13}, La/bzj;-><init>(La/fhj;B)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 309
    .line 310
    .line 311
    :cond_b
    iget-object v3, v1, La/fhj;->a:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v3, Landroidx/media3/common/b;

    .line 314
    .line 315
    if-nez v3, :cond_c

    .line 316
    .line 317
    new-instance v3, La/awq;

    .line 318
    .line 319
    invoke-direct {v3}, La/awq;-><init>()V

    .line 320
    .line 321
    .line 322
    new-instance v4, Landroidx/media3/common/b;

    .line 323
    .line 324
    invoke-direct {v4, v3}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 325
    .line 326
    .line 327
    move-object/from16 v20, v4

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_c
    move-object/from16 v20, v3

    .line 331
    .line 332
    :goto_5
    iget-object v15, v2, La/czj;->k:La/seu0;

    .line 333
    .line 334
    const/16 v21, 0x0

    .line 335
    .line 336
    move-wide/from16 v16, v6

    .line 337
    .line 338
    invoke-interface/range {v15 .. v21}, La/seu0;->d(JJLandroidx/media3/common/b;Landroid/media/MediaFormat;)V

    .line 339
    .line 340
    .line 341
    move-wide/from16 v8, v18

    .line 342
    .line 343
    iget-object v3, v2, La/czj;->d:Ljava/util/ArrayDeque;

    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    check-cast v3, La/tm30;

    .line 350
    .line 351
    iget-object v4, v3, La/tm30;->c:La/xm30;

    .line 352
    .line 353
    iget-object v5, v3, La/tm30;->a:La/dm30;

    .line 354
    .line 355
    iget v3, v3, La/tm30;->b:I

    .line 356
    .line 357
    invoke-virtual {v4, v5, v3, v8, v9}, La/xm30;->P0(La/dm30;IJ)V

    .line 358
    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :cond_d
    invoke-static {}, La/itt0;->a()V

    .line 363
    .line 364
    .line 365
    return-void
.end method
