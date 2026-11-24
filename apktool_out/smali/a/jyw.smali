.class public final La/jyw;
.super La/fot0;
.source "SourceFile"


# static fields
.field public static final y:La/hyw;


# instance fields
.field public final r:Ljava/lang/Object;

.field public s:La/kyw;

.field public t:Landroid/graphics/Rect;

.field public u:Landroid/graphics/Matrix;

.field public v:La/tii0;

.field public w:La/o3x;

.field public x:La/uii0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/hyw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/jyw;->y:La/hyw;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La/myw;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La/fot0;-><init>(La/fpt0;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/jyw;->r:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/jyw;->x:La/uii0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La/uii0;->b()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, La/jyw;->x:La/uii0;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, La/jyw;->w:La/o3x;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, La/hzj;->a()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, La/jyw;->w:La/o3x;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, La/jyw;->r:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v2, p0, La/jyw;->s:La/kyw;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    iput-boolean v3, v2, La/kyw;->o:Z

    .line 30
    .line 31
    invoke-virtual {v2}, La/kyw;->c()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, La/jyw;->s:La/kyw;

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
.end method

.method public final B(Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/fot0;->B(Landroid/graphics/Matrix;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/jyw;->r:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, La/jyw;->s:La/kyw;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, p1}, La/kyw;->h(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    iput-object p1, p0, La/jyw;->u:Landroid/graphics/Matrix;

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
.end method

.method public final C(Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    iput-object p1, p0, La/fot0;->l:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-object v0, p0, La/jyw;->r:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, La/jyw;->s:La/kyw;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, p1}, La/kyw;->i(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iput-object p1, p0, La/jyw;->t:Landroid/graphics/Rect;

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public final G(La/myw;La/h55;)La/tii0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-static {}, La/ofm0;->m()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v2, La/h55;->a:Landroid/util/Size;

    .line 11
    .line 12
    invoke-static {}, La/jxv;->a()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    sget-object v5, La/bcq0;->B0:La/u15;

    .line 17
    .line 18
    invoke-interface {v1, v5, v4}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v5, v0, La/fot0;->i:La/fpt0;

    .line 28
    .line 29
    check-cast v5, La/myw;

    .line 30
    .line 31
    sget-object v6, La/myw;->b:La/u15;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-interface {v5, v6, v8}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v6, 0x1

    .line 49
    if-ne v5, v6, :cond_0

    .line 50
    .line 51
    iget-object v5, v0, La/fot0;->i:La/fpt0;

    .line 52
    .line 53
    check-cast v5, La/myw;

    .line 54
    .line 55
    sget-object v8, La/myw;->c:La/u15;

    .line 56
    .line 57
    const/4 v9, 0x6

    .line 58
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-interface {v5, v8, v9}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/4 v5, 0x4

    .line 74
    :goto_0
    sget-object v8, La/myw;->d:La/u15;

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    invoke-interface {v1, v8, v9}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    if-nez v8, :cond_10

    .line 82
    .line 83
    new-instance v8, La/ibe0;

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    iget-object v12, v0, La/fot0;->i:La/fpt0;

    .line 94
    .line 95
    invoke-interface {v12}, La/h0x;->k()I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    invoke-static {v10, v11, v12, v5}, La/g1x;->r(IIII)La/cgx0;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-direct {v8, v5}, La/ibe0;-><init>(La/e1x;)V

    .line 104
    .line 105
    .line 106
    iget-object v5, v0, La/jyw;->r:Ljava/lang/Object;

    .line 107
    .line 108
    monitor-enter v5

    .line 109
    :try_start_0
    invoke-virtual {v0}, La/jyw;->I()V

    .line 110
    .line 111
    .line 112
    iget-object v10, v0, La/jyw;->s:La/kyw;

    .line 113
    .line 114
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 115
    invoke-virtual {v0}, La/fot0;->d()La/s0a;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-eqz v5, :cond_1

    .line 120
    .line 121
    invoke-virtual {v0}, La/fot0;->d()La/s0a;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    iget-object v11, v0, La/fot0;->i:La/fpt0;

    .line 126
    .line 127
    check-cast v11, La/myw;

    .line 128
    .line 129
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    sget-object v13, La/myw;->g:La/u15;

    .line 132
    .line 133
    invoke-interface {v11, v13, v12}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    check-cast v11, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_1

    .line 144
    .line 145
    invoke-virtual {v0, v5, v7}, La/fot0;->i(La/s0a;Z)I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    rem-int/lit16 v5, v5, 0xb4

    .line 150
    .line 151
    if-eqz v5, :cond_1

    .line 152
    .line 153
    move v5, v6

    .line 154
    goto :goto_1

    .line 155
    :cond_1
    move v5, v7

    .line 156
    :goto_1
    if-eqz v5, :cond_2

    .line 157
    .line 158
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    goto :goto_2

    .line 163
    :cond_2
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    :goto_2
    if-eqz v5, :cond_3

    .line 168
    .line 169
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    goto :goto_3

    .line 174
    :cond_3
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    :goto_3
    invoke-virtual {v0}, La/jyw;->H()I

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    const/4 v13, 0x2

    .line 183
    const/16 v14, 0x23

    .line 184
    .line 185
    if-ne v12, v13, :cond_4

    .line 186
    .line 187
    move v12, v6

    .line 188
    goto :goto_4

    .line 189
    :cond_4
    move v12, v14

    .line 190
    :goto_4
    iget-object v15, v0, La/fot0;->i:La/fpt0;

    .line 191
    .line 192
    invoke-interface {v15}, La/h0x;->k()I

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    if-ne v15, v14, :cond_5

    .line 197
    .line 198
    invoke-virtual {v0}, La/jyw;->H()I

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    if-ne v15, v13, :cond_5

    .line 203
    .line 204
    move v13, v6

    .line 205
    goto :goto_5

    .line 206
    :cond_5
    move v13, v7

    .line 207
    :goto_5
    iget-object v15, v0, La/fot0;->i:La/fpt0;

    .line 208
    .line 209
    invoke-interface {v15}, La/h0x;->k()I

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    if-ne v15, v14, :cond_6

    .line 214
    .line 215
    invoke-virtual {v0}, La/jyw;->H()I

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    const/4 v6, 0x3

    .line 220
    if-ne v15, v6, :cond_6

    .line 221
    .line 222
    const/4 v6, 0x1

    .line 223
    goto :goto_6

    .line 224
    :cond_6
    move v6, v7

    .line 225
    :goto_6
    iget-object v15, v0, La/fot0;->i:La/fpt0;

    .line 226
    .line 227
    invoke-interface {v15}, La/h0x;->k()I

    .line 228
    .line 229
    .line 230
    move-result v15

    .line 231
    if-ne v15, v14, :cond_9

    .line 232
    .line 233
    invoke-virtual {v0}, La/fot0;->d()La/s0a;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    if-eqz v14, :cond_7

    .line 238
    .line 239
    invoke-virtual {v0}, La/fot0;->d()La/s0a;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    invoke-virtual {v0, v14, v7}, La/fot0;->i(La/s0a;Z)I

    .line 244
    .line 245
    .line 246
    move-result v14

    .line 247
    if-nez v14, :cond_8

    .line 248
    .line 249
    :cond_7
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 250
    .line 251
    iget-object v15, v0, La/fot0;->i:La/fpt0;

    .line 252
    .line 253
    check-cast v15, La/myw;

    .line 254
    .line 255
    sget-object v7, La/myw;->f:La/u15;

    .line 256
    .line 257
    invoke-interface {v15, v7, v9}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, Ljava/lang/Boolean;

    .line 262
    .line 263
    invoke-virtual {v14, v7}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-eqz v7, :cond_9

    .line 268
    .line 269
    :cond_8
    const/16 v16, 0x1

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_9
    const/16 v16, 0x0

    .line 273
    .line 274
    :goto_7
    if-nez v13, :cond_a

    .line 275
    .line 276
    if-eqz v16, :cond_b

    .line 277
    .line 278
    if-nez v6, :cond_b

    .line 279
    .line 280
    :cond_a
    new-instance v9, La/ibe0;

    .line 281
    .line 282
    invoke-virtual {v8}, La/ibe0;->G()I

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    invoke-static {v11, v5, v12, v6}, La/g1x;->r(IIII)La/cgx0;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-direct {v9, v5}, La/ibe0;-><init>(La/e1x;)V

    .line 291
    .line 292
    .line 293
    :cond_b
    if-eqz v9, :cond_c

    .line 294
    .line 295
    iget-object v5, v10, La/kyw;->n:Ljava/lang/Object;

    .line 296
    .line 297
    monitor-enter v5

    .line 298
    :try_start_1
    iput-object v9, v10, La/kyw;->d:La/ibe0;

    .line 299
    .line 300
    monitor-exit v5

    .line 301
    goto :goto_8

    .line 302
    :catchall_0
    move-exception v0

    .line 303
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 304
    throw v0

    .line 305
    :cond_c
    :goto_8
    invoke-virtual {v0}, La/jyw;->J()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v8, v10, v4}, La/ibe0;->o(La/d1x;Ljava/util/concurrent/Executor;)V

    .line 309
    .line 310
    .line 311
    iget-object v4, v2, La/h55;->a:Landroid/util/Size;

    .line 312
    .line 313
    invoke-static {v1, v4}, La/tii0;->d(La/fpt0;Landroid/util/Size;)La/tii0;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    iget-object v4, v2, La/h55;->f:La/drd;

    .line 318
    .line 319
    if-eqz v4, :cond_d

    .line 320
    .line 321
    iget-object v5, v1, La/sii0;->b:La/ucs0;

    .line 322
    .line 323
    invoke-virtual {v5, v4}, La/ucs0;->g(La/drd;)V

    .line 324
    .line 325
    .line 326
    :cond_d
    iget-object v4, v0, La/jyw;->w:La/o3x;

    .line 327
    .line 328
    if-eqz v4, :cond_e

    .line 329
    .line 330
    invoke-virtual {v4}, La/hzj;->a()V

    .line 331
    .line 332
    .line 333
    :cond_e
    new-instance v4, La/o3x;

    .line 334
    .line 335
    invoke-virtual {v8}, La/ibe0;->getSurface()Landroid/view/Surface;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    iget-object v6, v0, La/fot0;->i:La/fpt0;

    .line 340
    .line 341
    invoke-interface {v6}, La/h0x;->k()I

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    invoke-direct {v4, v5, v3, v6}, La/o3x;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 346
    .line 347
    .line 348
    iput-object v4, v0, La/jyw;->w:La/o3x;

    .line 349
    .line 350
    iget-object v3, v4, La/hzj;->e:La/wu9;

    .line 351
    .line 352
    invoke-static {v3}, La/ro4;->c0(La/ig00;)La/ig00;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    new-instance v4, La/llo;

    .line 357
    .line 358
    const/16 v5, 0x9

    .line 359
    .line 360
    invoke-direct {v4, v8, v9, v5}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 361
    .line 362
    .line 363
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-interface {v3, v4, v5}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 368
    .line 369
    .line 370
    iget v3, v2, La/h55;->d:I

    .line 371
    .line 372
    iput v3, v1, La/sii0;->h:I

    .line 373
    .line 374
    invoke-virtual {v0, v1, v2}, La/fot0;->a(La/tii0;La/h55;)V

    .line 375
    .line 376
    .line 377
    iget-object v3, v0, La/jyw;->w:La/o3x;

    .line 378
    .line 379
    iget-object v2, v2, La/h55;->c:La/agn;

    .line 380
    .line 381
    const/4 v4, -0x1

    .line 382
    invoke-virtual {v1, v3, v2, v4}, La/tii0;->b(La/hzj;La/agn;I)V

    .line 383
    .line 384
    .line 385
    iget-object v2, v0, La/jyw;->x:La/uii0;

    .line 386
    .line 387
    if-eqz v2, :cond_f

    .line 388
    .line 389
    invoke-virtual {v2}, La/uii0;->b()V

    .line 390
    .line 391
    .line 392
    :cond_f
    new-instance v2, La/uii0;

    .line 393
    .line 394
    new-instance v3, La/eyw;

    .line 395
    .line 396
    const/4 v4, 0x0

    .line 397
    invoke-direct {v3, v0, v10, v4}, La/eyw;-><init>(La/fot0;Ljava/lang/Object;B)V

    .line 398
    .line 399
    .line 400
    invoke-direct {v2, v3}, La/uii0;-><init>(La/vii0;)V

    .line 401
    .line 402
    .line 403
    iput-object v2, v0, La/jyw;->x:La/uii0;

    .line 404
    .line 405
    iput-object v2, v1, La/sii0;->f:La/uii0;

    .line 406
    .line 407
    return-object v1

    .line 408
    :catchall_1
    move-exception v0

    .line 409
    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 410
    throw v0

    .line 411
    :cond_10
    invoke-static {}, La/hny;->b()V

    .line 412
    .line 413
    .line 414
    return-object v9
.end method

.method public final H()I
    .locals 2

    .line 1
    iget-object p0, p0, La/fot0;->i:La/fpt0;

    .line 2
    .line 3
    check-cast p0, La/myw;

    .line 4
    .line 5
    sget-object v0, La/myw;->e:La/u15;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {p0, v0, v1}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final I()V
    .locals 6

    .line 1
    iget-object v0, p0, La/jyw;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/fot0;->i:La/fpt0;

    .line 5
    .line 6
    check-cast v1, La/myw;

    .line 7
    .line 8
    sget-object v2, La/myw;->b:La/u15;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-interface {v1, v2, v4}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v4, 0x1

    .line 26
    if-ne v2, v4, :cond_0

    .line 27
    .line 28
    new-instance v1, La/lyw;

    .line 29
    .line 30
    invoke-direct {v1}, La/kyw;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, La/jyw;->s:La/kyw;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance v2, La/pyw;

    .line 39
    .line 40
    invoke-static {}, La/jxv;->a()Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    sget-object v5, La/bcq0;->B0:La/u15;

    .line 45
    .line 46
    invoke-interface {v1, v5, v4}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 51
    .line 52
    invoke-direct {v2, v1}, La/pyw;-><init>(Ljava/util/concurrent/Executor;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, La/jyw;->s:La/kyw;

    .line 56
    .line 57
    move-object v1, v2

    .line 58
    :goto_0
    invoke-virtual {p0}, La/jyw;->H()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    iput v2, v1, La/kyw;->b:I

    .line 63
    .line 64
    iget-object v1, p0, La/jyw;->s:La/kyw;

    .line 65
    .line 66
    iget-object v2, p0, La/fot0;->i:La/fpt0;

    .line 67
    .line 68
    check-cast v2, La/myw;

    .line 69
    .line 70
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    sget-object v5, La/myw;->g:La/u15;

    .line 73
    .line 74
    invoke-interface {v2, v5, v4}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    iput-boolean v2, v1, La/kyw;->c:Z

    .line 85
    .line 86
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget-object v2, p0, La/fot0;->i:La/fpt0;

    .line 91
    .line 92
    check-cast v2, La/myw;

    .line 93
    .line 94
    sget-object v4, La/myw;->f:La/u15;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    invoke-interface {v2, v4, v5}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Ljava/lang/Boolean;

    .line 102
    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    invoke-interface {v1}, La/s0a;->h()La/n0a;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-interface {v2}, La/n0a;->o()La/kpd0;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const-class v4, Landroidx/camera/core/internal/compat/quirk/OnePixelShiftQuirk;

    .line 114
    .line 115
    invoke-virtual {v2, v4}, La/kpd0;->a(Ljava/lang/Class;)Z

    .line 116
    .line 117
    .line 118
    :cond_1
    iget-object v2, p0, La/jyw;->s:La/kyw;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    if-eqz v1, :cond_2

    .line 124
    .line 125
    iget-object v2, p0, La/jyw;->s:La/kyw;

    .line 126
    .line 127
    invoke-virtual {p0, v1, v3}, La/fot0;->i(La/s0a;Z)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    iput v1, v2, La/kyw;->a:I

    .line 132
    .line 133
    :cond_2
    iget-object v1, p0, La/jyw;->t:Landroid/graphics/Rect;

    .line 134
    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    iget-object v2, p0, La/jyw;->s:La/kyw;

    .line 138
    .line 139
    invoke-virtual {v2, v1}, La/kyw;->i(Landroid/graphics/Rect;)V

    .line 140
    .line 141
    .line 142
    :cond_3
    iget-object v1, p0, La/jyw;->u:Landroid/graphics/Matrix;

    .line 143
    .line 144
    if-eqz v1, :cond_4

    .line 145
    .line 146
    iget-object p0, p0, La/jyw;->s:La/kyw;

    .line 147
    .line 148
    invoke-virtual {p0, v1}, La/kyw;->h(Landroid/graphics/Matrix;)V

    .line 149
    .line 150
    .line 151
    :cond_4
    monitor-exit v0

    .line 152
    return-void

    .line 153
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    throw p0
.end method

.method public final J()V
    .locals 4

    .line 1
    iget-object v0, p0, La/jyw;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, La/fot0;->d()La/s0a;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, La/jyw;->s:La/kyw;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {p0, v1, v3}, La/fot0;->i(La/s0a;Z)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    iput p0, v2, La/kyw;->a:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0
.end method

.method public final g(ZLa/ipt0;)La/fpt0;
    .locals 3

    .line 1
    sget-object v0, La/jyw;->y:La/hyw;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/hyw;->a:La/myw;

    .line 7
    .line 8
    invoke-interface {v0}, La/fpt0;->v()La/hpt0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-interface {p2, v1, v2}, La/ipt0;->a(La/hpt0;I)La/drd;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-static {p2, v0}, La/drd;->r(La/drd;La/drd;)La/b780;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :cond_0
    if-nez p2, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-virtual {p0, p2}, La/fot0;->n(La/drd;)La/ept0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/gyw;

    .line 32
    .line 33
    new-instance p1, La/myw;

    .line 34
    .line 35
    iget-object p0, p0, La/gyw;->b:La/wy40;

    .line 36
    .line 37
    invoke-static {p0}, La/b780;->j(La/drd;)La/b780;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {p1, p0}, La/myw;-><init>(La/b780;)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/fot0;->h()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "ImageAnalysis:"

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final v(La/n0a;La/ept0;)La/fpt0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jyw;->r:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-interface {p2}, La/ept0;->e()La/fpt0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method

.method public final y(La/drd;)La/h55;
    .locals 3

    .line 1
    iget-object v0, p0, La/jyw;->v:La/tii0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/tii0;->a(La/drd;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/jyw;->v:La/tii0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/tii0;->c()La/xii0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, La/fot0;->E(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/fot0;->j:La/h55;

    .line 39
    .line 40
    invoke-virtual {p0}, La/h55;->b()La/qgd;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p1, p0, La/qgd;->g:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0}, La/qgd;->i()La/h55;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final z(La/h55;La/h55;)La/h55;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "onSuggestedStreamSpecUpdated: primaryStreamSpec = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ", secondaryStreamSpec "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string v0, "ImageAnalysis"

    .line 24
    .line 25
    invoke-static {v0, p2}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, La/fot0;->i:La/fpt0;

    .line 29
    .line 30
    check-cast p2, La/myw;

    .line 31
    .line 32
    invoke-virtual {p0}, La/fot0;->f()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p2, p1}, La/jyw;->G(La/myw;La/h55;)La/tii0;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iput-object p2, p0, La/jyw;->v:La/tii0;

    .line 40
    .line 41
    invoke-virtual {p2}, La/tii0;->c()La/xii0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    aget-object p2, p2, v1

    .line 57
    .line 58
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p0, p2}, La/fot0;->E(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    return-object p1
.end method
