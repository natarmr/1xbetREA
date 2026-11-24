.class public final La/ktb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sbz;


# instance fields
.field public final a:I

.field public final b:La/nvu;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public d:La/p4e;

.field public e:La/a5n0;

.field public f:La/z4n0;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/Object;

.field public k:Z

.field public l:La/akq;

.field public m:Z

.field public n:J

.field public o:J

.field public p:J

.field public q:Z

.field public final synthetic r:La/o24;


# direct methods
.method public constructor <init>(La/o24;ILa/nvu;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ktb0;->r:La/o24;

    .line 5
    .line 6
    iput p2, p0, La/ktb0;->a:I

    .line 7
    .line 8
    iput-object p3, p0, La/ktb0;->b:La/nvu;

    .line 9
    .line 10
    iput-object p4, p0, La/ktb0;->c:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    sget-object p1, La/qlq0;->a:La/qlq0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object p1, La/rq40;->a:La/rq40;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, La/rq40;->b()J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    iput-wide p1, p0, La/ktb0;->p:J

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/ktb0;->m:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ktb0;->f:La/z4n0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/z4n0;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, La/ktb0;->f:La/z4n0;

    .line 10
    .line 11
    iget-object v1, p0, La/ktb0;->e:La/a5n0;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, La/a5n0;->a()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v0, p0, La/ktb0;->e:La/a5n0;

    .line 19
    .line 20
    iput-object v0, p0, La/ktb0;->l:La/akq;

    .line 21
    .line 22
    return-void
.end method

.method public final c(La/kfn0;)Z
    .locals 2

    .line 1
    iget-object v0, p0, La/ktb0;->r:La/o24;

    .line 2
    .line 3
    iget-boolean v0, v0, La/o24;->a:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-boolean v0, p0, La/ktb0;->m:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-string v0, "compose:lazy:prefetch:execute:urgent"

    .line 14
    .line 15
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0, p1}, La/ktb0;->d(La/kfn0;)Z

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, La/ktb0;->d(La/kfn0;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    :goto_0
    const-string p1, "compose:lazy:prefetch:execute:item"

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    invoke-static {v0, v1, p1}, La/ahy;->k0(JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return p0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/ktb0;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La/ktb0;->h:Z

    .line 7
    .line 8
    invoke-virtual {p0}, La/ktb0;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d(La/kfn0;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La/ktb0;->a:I

    .line 4
    .line 5
    int-to-long v2, v1

    .line 6
    const-string v4, "compose:lazy:prefetch:execute:item"

    .line 7
    .line 8
    invoke-static {v2, v3, v4}, La/ahy;->k0(JLjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v5, v0, La/ktb0;->r:La/o24;

    .line 12
    .line 13
    iget-object v5, v5, La/o24;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, La/gbz;

    .line 16
    .line 17
    iget-object v5, v5, La/gbz;->b:La/rip;

    .line 18
    .line 19
    invoke-virtual {v5}, La/rip;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, La/hbz;

    .line 24
    .line 25
    iget-boolean v6, v0, La/ktb0;->h:Z

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    if-nez v6, :cond_24

    .line 29
    .line 30
    invoke-interface {v5}, La/hbz;->b()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-ltz v1, :cond_24

    .line 35
    .line 36
    if-ge v1, v6, :cond_24

    .line 37
    .line 38
    invoke-interface {v5, v1}, La/hbz;->d(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v8, v0, La/ktb0;->j:Ljava/lang/Object;

    .line 43
    .line 44
    if-eqz v8, :cond_0

    .line 45
    .line 46
    invoke-virtual {v6, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-nez v8, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, La/ktb0;->b()V

    .line 53
    .line 54
    .line 55
    return v7

    .line 56
    :cond_0
    invoke-interface {v5, v1}, La/hbz;->a(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v5, v0, La/ktb0;->b:La/nvu;

    .line 61
    .line 62
    iget-object v8, v5, La/nvu;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, La/aa5;

    .line 65
    .line 66
    iget-object v9, v5, La/nvu;->c:Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v10, -0x1

    .line 69
    if-ne v9, v1, :cond_1

    .line 70
    .line 71
    if-eqz v8, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v8, v5, La/nvu;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, La/hz40;

    .line 77
    .line 78
    invoke-virtual {v8, v1}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-nez v9, :cond_2

    .line 83
    .line 84
    new-instance v9, La/aa5;

    .line 85
    .line 86
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput v10, v9, La/aa5;->e:I

    .line 90
    .line 91
    invoke-virtual {v8, v1, v9}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move-object v8, v9

    .line 95
    check-cast v8, La/aa5;

    .line 96
    .line 97
    iput-object v1, v5, La/nvu;->c:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v8, v5, La/nvu;->d:Ljava/lang/Object;

    .line 100
    .line 101
    :goto_0
    invoke-virtual {v0}, La/ktb0;->e()Z

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {p1 .. p1}, La/kfn0;->a()J

    .line 105
    .line 106
    .line 107
    move-result-wide v11

    .line 108
    iput-wide v11, v0, La/ktb0;->n:J

    .line 109
    .line 110
    sget-object v5, La/qlq0;->a:La/qlq0;

    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object v5, La/rq40;->a:La/rq40;

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {}, La/rq40;->b()J

    .line 121
    .line 122
    .line 123
    move-result-wide v13

    .line 124
    iput-wide v13, v0, La/ktb0;->p:J

    .line 125
    .line 126
    const-wide/16 v13, 0x0

    .line 127
    .line 128
    iput-wide v13, v0, La/ktb0;->o:J

    .line 129
    .line 130
    const-string v5, "compose:lazy:prefetch:available_time_nanos"

    .line 131
    .line 132
    invoke-static {v11, v12, v5}, La/ahy;->k0(JLjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, La/ktb0;->e()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_5

    .line 140
    .line 141
    iget-wide v11, v0, La/ktb0;->n:J

    .line 142
    .line 143
    move-wide v15, v13

    .line 144
    iget-wide v13, v8, La/aa5;->a:J

    .line 145
    .line 146
    iget-wide v9, v8, La/aa5;->b:J

    .line 147
    .line 148
    add-long/2addr v13, v9

    .line 149
    invoke-virtual {v0, v11, v12, v13, v14}, La/ktb0;->g(JJ)Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    if-eqz v9, :cond_3

    .line 154
    .line 155
    const-string v9, "compose:lazy:prefetch:compose"

    .line 156
    .line 157
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :try_start_0
    invoke-virtual {v0, v6, v1, v8}, La/ktb0;->f(Ljava/lang/Object;Ljava/lang/Object;La/aa5;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    .line 162
    .line 163
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_3
    :goto_1
    invoke-virtual {v0}, La/ktb0;->e()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-nez v1, :cond_6

    .line 177
    .line 178
    :cond_4
    const/16 v17, 0x1

    .line 179
    .line 180
    goto/16 :goto_e

    .line 181
    .line 182
    :cond_5
    move-wide v15, v13

    .line 183
    :cond_6
    iget-object v1, v0, La/ktb0;->f:La/z4n0;

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    if-eqz v1, :cond_8

    .line 187
    .line 188
    iget-wide v9, v0, La/ktb0;->n:J

    .line 189
    .line 190
    iget-wide v11, v8, La/aa5;->c:J

    .line 191
    .line 192
    invoke-virtual {v0, v9, v10, v11, v12}, La/ktb0;->g(JJ)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_4

    .line 197
    .line 198
    const-string v1, "compose:lazy:prefetch:apply"

    .line 199
    .line 200
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :try_start_1
    iget-object v1, v0, La/ktb0;->f:La/z4n0;

    .line 204
    .line 205
    if-eqz v1, :cond_7

    .line 206
    .line 207
    invoke-interface {v1}, La/z4n0;->apply()La/a5n0;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    iput-object v1, v0, La/ktb0;->e:La/a5n0;

    .line 212
    .line 213
    iput-object v6, v0, La/ktb0;->f:La/z4n0;

    .line 214
    .line 215
    const/4 v1, 0x1

    .line 216
    iput-boolean v1, v0, La/ktb0;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    .line 218
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, La/ktb0;->h()V

    .line 222
    .line 223
    .line 224
    iget-wide v9, v0, La/ktb0;->o:J

    .line 225
    .line 226
    iget-wide v11, v8, La/aa5;->c:J

    .line 227
    .line 228
    invoke-static {v9, v10, v11, v12}, La/aa5;->a(JJ)J

    .line 229
    .line 230
    .line 231
    move-result-wide v9

    .line 232
    iput-wide v9, v8, La/aa5;->c:J

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_7
    :try_start_2
    const-string v0, "Nothing to apply!"

    .line 236
    .line 237
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 238
    .line 239
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 243
    :catchall_1
    move-exception v0

    .line 244
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 245
    .line 246
    .line 247
    throw v0

    .line 248
    :cond_8
    :goto_2
    iget-boolean v1, v0, La/ktb0;->k:Z

    .line 249
    .line 250
    if-nez v1, :cond_b

    .line 251
    .line 252
    iget-wide v9, v0, La/ktb0;->n:J

    .line 253
    .line 254
    cmp-long v1, v9, v15

    .line 255
    .line 256
    if-lez v1, :cond_4

    .line 257
    .line 258
    const-string v1, "compose:lazy:prefetch:resolve-nested"

    .line 259
    .line 260
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :try_start_3
    iget-object v1, v0, La/ktb0;->e:La/a5n0;

    .line 264
    .line 265
    if-eqz v1, :cond_a

    .line 266
    .line 267
    new-instance v9, La/mie0;

    .line 268
    .line 269
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 270
    .line 271
    .line 272
    new-instance v10, La/cx2;

    .line 273
    .line 274
    const/16 v11, 0x8

    .line 275
    .line 276
    invoke-direct {v10, v9, v11}, La/cx2;-><init>(La/mie0;B)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v1, v10}, La/a5n0;->e(La/cx2;)V

    .line 280
    .line 281
    .line 282
    iget-object v1, v9, La/mie0;->a:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v1, Ljava/util/List;

    .line 285
    .line 286
    if-eqz v1, :cond_9

    .line 287
    .line 288
    new-instance v9, La/akq;

    .line 289
    .line 290
    invoke-direct {v9, v0, v1}, La/akq;-><init>(La/ktb0;Ljava/util/List;)V

    .line 291
    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_9
    move-object v9, v6

    .line 295
    :goto_3
    iput-object v9, v0, La/ktb0;->l:La/akq;

    .line 296
    .line 297
    const/4 v1, 0x1

    .line 298
    iput-boolean v1, v0, La/ktb0;->k:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 299
    .line 300
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :catchall_2
    move-exception v0

    .line 305
    goto :goto_4

    .line 306
    :cond_a
    :try_start_4
    const-string v0, "Should precompose before resolving nested prefetch states"

    .line 307
    .line 308
    invoke-static {v0}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 313
    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 314
    .line 315
    .line 316
    throw v0

    .line 317
    :cond_b
    :goto_5
    iget-object v1, v0, La/ktb0;->l:La/akq;

    .line 318
    .line 319
    if-eqz v1, :cond_17

    .line 320
    .line 321
    iget v9, v8, La/aa5;->e:I

    .line 322
    .line 323
    iget-boolean v10, v0, La/ktb0;->m:Z

    .line 324
    .line 325
    iget-object v11, v1, La/akq;->e:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v11, [Ljava/util/List;

    .line 328
    .line 329
    iget v12, v1, La/akq;->a:I

    .line 330
    .line 331
    iget-object v13, v1, La/akq;->d:Ljava/util/List;

    .line 332
    .line 333
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 334
    .line 335
    .line 336
    move-result v14

    .line 337
    if-lt v12, v14, :cond_c

    .line 338
    .line 339
    goto/16 :goto_c

    .line 340
    .line 341
    :cond_c
    iget-object v12, v1, La/akq;->f:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v12, La/ktb0;

    .line 344
    .line 345
    iget-boolean v12, v12, La/ktb0;->h:Z

    .line 346
    .line 347
    if-eqz v12, :cond_d

    .line 348
    .line 349
    const-string v12, "Should not execute nested prefetch on canceled request"

    .line 350
    .line 351
    invoke-static {v12}, La/adx;->c(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    :cond_d
    const-string v12, "compose:lazy:prefetch:update_nested_prefetch_count"

    .line 355
    .line 356
    invoke-static {v12}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    :try_start_5
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 360
    .line 361
    .line 362
    move-result v12

    .line 363
    move v14, v7

    .line 364
    :goto_6
    if-ge v14, v12, :cond_e

    .line 365
    .line 366
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v18

    .line 370
    move-object/from16 v5, v18

    .line 371
    .line 372
    check-cast v5, La/tbz;

    .line 373
    .line 374
    iput v9, v5, La/tbz;->d:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 375
    .line 376
    add-int/lit8 v14, v14, 0x1

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 380
    .line 381
    .line 382
    const-string v5, "compose:lazy:prefetch:nested"

    .line 383
    .line 384
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    :goto_7
    :try_start_6
    iget v5, v1, La/akq;->a:I

    .line 388
    .line 389
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    if-ge v5, v9, :cond_16

    .line 394
    .line 395
    iget v5, v1, La/akq;->a:I

    .line 396
    .line 397
    aget-object v5, v11, v5

    .line 398
    .line 399
    if-nez v5, :cond_11

    .line 400
    .line 401
    invoke-virtual/range {p1 .. p1}, La/kfn0;->a()J

    .line 402
    .line 403
    .line 404
    move-result-wide v19
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 405
    cmp-long v5, v19, v15

    .line 406
    .line 407
    if-gtz v5, :cond_f

    .line 408
    .line 409
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 410
    .line 411
    .line 412
    const/16 v17, 0x1

    .line 413
    .line 414
    return v17

    .line 415
    :cond_f
    :try_start_7
    iget v5, v1, La/akq;->a:I

    .line 416
    .line 417
    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v9

    .line 421
    check-cast v9, La/tbz;

    .line 422
    .line 423
    iget-object v12, v9, La/tbz;->a:Lkotlin/jvm/functions/Function1;

    .line 424
    .line 425
    if-nez v12, :cond_10

    .line 426
    .line 427
    sget-object v9, La/iun;->a:La/iun;

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_10
    new-instance v14, La/rbz;

    .line 431
    .line 432
    iget v6, v9, La/tbz;->d:I

    .line 433
    .line 434
    invoke-direct {v14, v9, v6}, La/rbz;-><init>(La/tbz;I)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v12, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    iget-object v6, v14, La/rbz;->b:Ljava/util/ArrayList;

    .line 441
    .line 442
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 443
    .line 444
    .line 445
    move-result v12

    .line 446
    iput v12, v9, La/tbz;->f:I

    .line 447
    .line 448
    move-object v9, v6

    .line 449
    :goto_8
    aput-object v9, v11, v5

    .line 450
    .line 451
    :cond_11
    iget v5, v1, La/akq;->a:I

    .line 452
    .line 453
    aget-object v5, v11, v5

    .line 454
    .line 455
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    :goto_9
    iget v6, v1, La/akq;->b:I

    .line 459
    .line 460
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 461
    .line 462
    .line 463
    move-result v9

    .line 464
    if-ge v6, v9, :cond_15

    .line 465
    .line 466
    iget v6, v1, La/akq;->b:I

    .line 467
    .line 468
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    check-cast v6, La/ktb0;

    .line 473
    .line 474
    if-eqz v10, :cond_13

    .line 475
    .line 476
    if-eqz v6, :cond_12

    .line 477
    .line 478
    move-object v9, v6

    .line 479
    goto :goto_a

    .line 480
    :cond_12
    const/4 v9, 0x0

    .line 481
    :goto_a
    if-eqz v9, :cond_13

    .line 482
    .line 483
    const/4 v12, 0x1

    .line 484
    iput-boolean v12, v9, La/ktb0;->m:Z

    .line 485
    .line 486
    goto :goto_b

    .line 487
    :cond_13
    const/4 v12, 0x1

    .line 488
    :goto_b
    iput-boolean v12, v1, La/akq;->c:Z

    .line 489
    .line 490
    move-object/from16 v9, p1

    .line 491
    .line 492
    invoke-virtual {v6, v9}, La/ktb0;->c(La/kfn0;)Z

    .line 493
    .line 494
    .line 495
    move-result v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 496
    if-eqz v6, :cond_14

    .line 497
    .line 498
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 499
    .line 500
    .line 501
    return v12

    .line 502
    :cond_14
    :try_start_8
    iget v6, v1, La/akq;->b:I

    .line 503
    .line 504
    add-int/2addr v6, v12

    .line 505
    iput v6, v1, La/akq;->b:I

    .line 506
    .line 507
    goto :goto_9

    .line 508
    :cond_15
    move-object/from16 v9, p1

    .line 509
    .line 510
    iput v7, v1, La/akq;->b:I

    .line 511
    .line 512
    iget v5, v1, La/akq;->a:I

    .line 513
    .line 514
    const/16 v17, 0x1

    .line 515
    .line 516
    add-int/lit8 v5, v5, 0x1

    .line 517
    .line 518
    iput v5, v1, La/akq;->a:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 519
    .line 520
    const/4 v6, 0x0

    .line 521
    goto/16 :goto_7

    .line 522
    .line 523
    :cond_16
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 524
    .line 525
    .line 526
    goto :goto_c

    .line 527
    :catchall_3
    move-exception v0

    .line 528
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 529
    .line 530
    .line 531
    throw v0

    .line 532
    :catchall_4
    move-exception v0

    .line 533
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 534
    .line 535
    .line 536
    throw v0

    .line 537
    :cond_17
    :goto_c
    iget-object v1, v0, La/ktb0;->l:La/akq;

    .line 538
    .line 539
    if-eqz v1, :cond_18

    .line 540
    .line 541
    iget-boolean v1, v1, La/akq;->c:Z

    .line 542
    .line 543
    const/4 v12, 0x1

    .line 544
    if-ne v1, v12, :cond_18

    .line 545
    .line 546
    invoke-virtual {v0}, La/ktb0;->h()V

    .line 547
    .line 548
    .line 549
    invoke-static {v2, v3, v4}, La/ahy;->k0(JLjava/lang/String;)V

    .line 550
    .line 551
    .line 552
    iget-object v1, v0, La/ktb0;->l:La/akq;

    .line 553
    .line 554
    if-eqz v1, :cond_18

    .line 555
    .line 556
    iput-boolean v7, v1, La/akq;->c:Z

    .line 557
    .line 558
    :cond_18
    iget-object v1, v0, La/ktb0;->d:La/p4e;

    .line 559
    .line 560
    iget-boolean v2, v0, La/ktb0;->g:Z

    .line 561
    .line 562
    if-nez v2, :cond_1d

    .line 563
    .line 564
    if-eqz v1, :cond_1d

    .line 565
    .line 566
    iget-wide v2, v0, La/ktb0;->n:J

    .line 567
    .line 568
    iget-wide v4, v8, La/aa5;->d:J

    .line 569
    .line 570
    invoke-virtual {v0, v2, v3, v4, v5}, La/ktb0;->g(JJ)Z

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    if-eqz v2, :cond_4

    .line 575
    .line 576
    const-string v2, "compose:lazy:prefetch:measure"

    .line 577
    .line 578
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    :try_start_9
    iget-wide v1, v1, La/p4e;->a:J

    .line 582
    .line 583
    iget-boolean v3, v0, La/ktb0;->h:Z

    .line 584
    .line 585
    if-eqz v3, :cond_19

    .line 586
    .line 587
    const-string v3, "Callers should check whether the request is still valid before calling performMeasure()"

    .line 588
    .line 589
    invoke-static {v3}, La/adx;->a(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    :cond_19
    iget-boolean v3, v0, La/ktb0;->g:Z

    .line 593
    .line 594
    if-eqz v3, :cond_1a

    .line 595
    .line 596
    const-string v3, "Request was already measured!"

    .line 597
    .line 598
    invoke-static {v3}, La/adx;->a(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    :cond_1a
    const/4 v12, 0x1

    .line 602
    iput-boolean v12, v0, La/ktb0;->g:Z

    .line 603
    .line 604
    iget-object v3, v0, La/ktb0;->e:La/a5n0;

    .line 605
    .line 606
    if-eqz v3, :cond_1c

    .line 607
    .line 608
    invoke-interface {v3}, La/a5n0;->c()I

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    move v5, v7

    .line 613
    :goto_d
    if-ge v5, v4, :cond_1b

    .line 614
    .line 615
    invoke-interface {v3, v5, v1, v2}, La/a5n0;->d(IJ)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 616
    .line 617
    .line 618
    add-int/lit8 v5, v5, 0x1

    .line 619
    .line 620
    goto :goto_d

    .line 621
    :cond_1b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v0}, La/ktb0;->h()V

    .line 625
    .line 626
    .line 627
    iget-wide v1, v0, La/ktb0;->o:J

    .line 628
    .line 629
    iget-wide v3, v8, La/aa5;->d:J

    .line 630
    .line 631
    invoke-static {v1, v2, v3, v4}, La/aa5;->a(JJ)J

    .line 632
    .line 633
    .line 634
    move-result-wide v1

    .line 635
    iput-wide v1, v8, La/aa5;->d:J

    .line 636
    .line 637
    iget-object v1, v0, La/ktb0;->c:Lkotlin/jvm/functions/Function1;

    .line 638
    .line 639
    if-eqz v1, :cond_1d

    .line 640
    .line 641
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    goto :goto_f

    .line 645
    :cond_1c
    :try_start_a
    const-string v0, "performComposition() must be called before performMeasure()"

    .line 646
    .line 647
    invoke-static {v0}, La/w6x;->i(Ljava/lang/String;)La/rsy;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 652
    :catchall_5
    move-exception v0

    .line 653
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 654
    .line 655
    .line 656
    throw v0

    .line 657
    :goto_e
    return v17

    .line 658
    :cond_1d
    :goto_f
    iget-object v1, v0, La/ktb0;->l:La/akq;

    .line 659
    .line 660
    iget-boolean v2, v0, La/ktb0;->g:Z

    .line 661
    .line 662
    if-eqz v2, :cond_23

    .line 663
    .line 664
    iget-boolean v0, v0, La/ktb0;->k:Z

    .line 665
    .line 666
    if-eqz v0, :cond_23

    .line 667
    .line 668
    if-eqz v1, :cond_23

    .line 669
    .line 670
    iget-object v0, v1, La/akq;->d:Ljava/util/List;

    .line 671
    .line 672
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 673
    .line 674
    .line 675
    move-result v1

    .line 676
    const v2, 0x7fffffff

    .line 677
    .line 678
    .line 679
    move v4, v2

    .line 680
    move v3, v7

    .line 681
    :goto_10
    if-ge v3, v1, :cond_1e

    .line 682
    .line 683
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    check-cast v5, La/tbz;

    .line 688
    .line 689
    iget v5, v5, La/tbz;->e:I

    .line 690
    .line 691
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    add-int/lit8 v3, v3, 0x1

    .line 696
    .line 697
    goto :goto_10

    .line 698
    :cond_1e
    if-ne v4, v2, :cond_1f

    .line 699
    .line 700
    move v4, v7

    .line 701
    :cond_1f
    iget v1, v8, La/aa5;->e:I

    .line 702
    .line 703
    const/4 v5, -0x1

    .line 704
    if-ne v1, v5, :cond_20

    .line 705
    .line 706
    move v1, v4

    .line 707
    goto :goto_11

    .line 708
    :cond_20
    mul-int/lit8 v1, v1, 0x3

    .line 709
    .line 710
    add-int/2addr v1, v4

    .line 711
    div-int/lit8 v1, v1, 0x4

    .line 712
    .line 713
    :goto_11
    iput v1, v8, La/aa5;->e:I

    .line 714
    .line 715
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 716
    .line 717
    .line 718
    move-result v1

    .line 719
    move v5, v2

    .line 720
    move v3, v7

    .line 721
    :goto_12
    if-ge v3, v1, :cond_21

    .line 722
    .line 723
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v6

    .line 727
    check-cast v6, La/tbz;

    .line 728
    .line 729
    iget v6, v6, La/tbz;->f:I

    .line 730
    .line 731
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 732
    .line 733
    .line 734
    move-result v5

    .line 735
    add-int/lit8 v3, v3, 0x1

    .line 736
    .line 737
    goto :goto_12

    .line 738
    :cond_21
    if-ne v5, v2, :cond_22

    .line 739
    .line 740
    move v5, v7

    .line 741
    :cond_22
    if-ge v5, v4, :cond_23

    .line 742
    .line 743
    move-wide v0, v15

    .line 744
    iput-wide v0, v8, La/aa5;->d:J

    .line 745
    .line 746
    :cond_23
    return v7

    .line 747
    :cond_24
    invoke-virtual {v0}, La/ktb0;->b()V

    .line 748
    .line 749
    .line 750
    return v7
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, La/ktb0;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, La/ktb0;->f:La/z4n0;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, La/z4n0;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ne p0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    return v1
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;La/aa5;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/ktb0;->f:La/z4n0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/ktb0;->r:La/o24;

    .line 6
    .line 7
    iget-object v1, v0, La/o24;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/gbz;

    .line 10
    .line 11
    iget v2, p0, La/ktb0;->a:I

    .line 12
    .line 13
    invoke-virtual {v1, v2, p1, p2}, La/gbz;->a(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget-object v0, v0, La/o24;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/b5n0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/b5n0;->a()La/r7z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, v0, La/r7z;->a:La/e7z;

    .line 26
    .line 27
    invoke-virtual {v1}, La/e7z;->I()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    new-instance p2, La/zpu;

    .line 34
    .line 35
    const/16 v1, 0x10

    .line 36
    .line 37
    invoke-direct {p2, v0, p1, v1}, La/zpu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    :goto_0
    move-object v0, p2

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 v1, 0x1

    .line 43
    invoke-virtual {v0, p1, p2, v1}, La/r7z;->l(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Z)V

    .line 44
    .line 45
    .line 46
    new-instance p2, La/edu;

    .line 47
    .line 48
    const/16 v1, 0x1a

    .line 49
    .line 50
    invoke-direct {p2, v0, p1, v1}, La/edu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_1
    iput-object v0, p0, La/ktb0;->f:La/z4n0;

    .line 55
    .line 56
    iput-object p1, p0, La/ktb0;->j:Ljava/lang/Object;

    .line 57
    .line 58
    :cond_1
    const/4 p1, 0x0

    .line 59
    iput-boolean p1, p0, La/ktb0;->q:Z

    .line 60
    .line 61
    :goto_2
    invoke-interface {v0}, La/z4n0;->a()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    iget-boolean p1, p0, La/ktb0;->q:Z

    .line 68
    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    new-instance p1, La/uq;

    .line 72
    .line 73
    const/16 p2, 0x18

    .line 74
    .line 75
    invoke-direct {p1, p0, p3, p2}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, p1}, La/z4n0;->b(La/uq;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    invoke-virtual {p0}, La/ktb0;->h()V

    .line 83
    .line 84
    .line 85
    iget-boolean p1, p0, La/ktb0;->q:Z

    .line 86
    .line 87
    iget-wide v0, p0, La/ktb0;->o:J

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    iget-wide p0, p3, La/aa5;->b:J

    .line 92
    .line 93
    invoke-static {v0, v1, p0, p1}, La/aa5;->a(JJ)J

    .line 94
    .line 95
    .line 96
    move-result-wide p0

    .line 97
    iput-wide p0, p3, La/aa5;->b:J

    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    iget-wide p0, p3, La/aa5;->a:J

    .line 101
    .line 102
    invoke-static {v0, v1, p0, p1}, La/aa5;->a(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide p0

    .line 106
    iput-wide p0, p3, La/aa5;->a:J

    .line 107
    .line 108
    return-void
.end method

.method public final g(JJ)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ktb0;->m:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-wide/16 p3, 0x0

    .line 6
    .line 7
    :cond_0
    cmp-long p0, p1, p3

    .line 8
    .line 9
    if-lez p0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final h()V
    .locals 7

    .line 1
    sget-object v0, La/qlq0;->a:La/qlq0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/rq40;->a:La/rq40;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, La/rq40;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iget-wide v3, p0, La/ktb0;->p:J

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, La/bfn;->b:La/bfn;

    .line 21
    .line 22
    invoke-static {v1, v2, v3, v4, v0}, La/xvw;->X(JJLa/bfn;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    sget-object v0, La/wen;->b:La/uen;

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    shr-long v5, v3, v0

    .line 30
    .line 31
    long-to-int v3, v3

    .line 32
    and-int/2addr v0, v3

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-wide v3, 0x8637bd05af6L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long v0, v5, v3

    .line 42
    .line 43
    if-lez v0, :cond_1

    .line 44
    .line 45
    const-wide v5, 0x7fffffffffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-wide v3, -0x8637bd05af6L

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    cmp-long v0, v5, v3

    .line 57
    .line 58
    if-gez v0, :cond_2

    .line 59
    .line 60
    const-wide/high16 v5, -0x8000000000000000L

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const-wide/32 v3, 0xf4240

    .line 64
    .line 65
    .line 66
    mul-long/2addr v5, v3

    .line 67
    :goto_0
    iput-wide v5, p0, La/ktb0;->o:J

    .line 68
    .line 69
    iget-wide v3, p0, La/ktb0;->n:J

    .line 70
    .line 71
    sub-long/2addr v3, v5

    .line 72
    iput-wide v3, p0, La/ktb0;->n:J

    .line 73
    .line 74
    iput-wide v1, p0, La/ktb0;->p:J

    .line 75
    .line 76
    const-string p0, "compose:lazy:prefetch:available_time_nanos"

    .line 77
    .line 78
    invoke-static {v3, v4, p0}, La/ahy;->k0(JLjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, La/ktb0;->d:La/p4e;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ktb0;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-boolean v2, p0, La/ktb0;->g:Z

    .line 8
    .line 9
    iget-boolean v3, p0, La/ktb0;->h:Z

    .line 10
    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v5, "HandleAndRequestImpl { index = "

    .line 14
    .line 15
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget p0, p0, La/ktb0;->a:I

    .line 19
    .line 20
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ", constraints = "

    .line 24
    .line 25
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ", isComposed = "

    .line 32
    .line 33
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, ", isMeasured = "

    .line 37
    .line 38
    const-string v0, ", isCanceled = "

    .line 39
    .line 40
    invoke-static {p0, v0, v4, v1, v2}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 41
    .line 42
    .line 43
    const-string p0, " }"

    .line 44
    .line 45
    invoke-static {v4, v3, p0}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
