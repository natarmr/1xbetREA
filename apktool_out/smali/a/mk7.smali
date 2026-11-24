.class public final synthetic La/mk7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/fge0;La/iz40;La/iz40;Ljava/util/List;Ljava/util/List;La/iz40;Ljava/util/List;La/iz40;Ljava/util/Set;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/mk7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mk7;->b:Ljava/lang/Object;

    iput-object p2, p0, La/mk7;->c:Ljava/lang/Object;

    iput-object p3, p0, La/mk7;->d:Ljava/lang/Object;

    iput-object p4, p0, La/mk7;->e:Ljava/lang/Object;

    iput-object p5, p0, La/mk7;->f:Ljava/lang/Object;

    iput-object p6, p0, La/mk7;->g:Ljava/lang/Object;

    iput-object p7, p0, La/mk7;->h:Ljava/lang/Object;

    iput-object p8, p0, La/mk7;->i:Ljava/lang/Object;

    iput-object p9, p0, La/mk7;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;La/l7m0;Lkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/mk7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mk7;->b:Ljava/lang/Object;

    iput-object p2, p0, La/mk7;->c:Ljava/lang/Object;

    iput-object p3, p0, La/mk7;->j:Ljava/lang/Object;

    iput-object p4, p0, La/mk7;->d:Ljava/lang/Object;

    iput-object p5, p0, La/mk7;->e:Ljava/lang/Object;

    iput-object p6, p0, La/mk7;->f:Ljava/lang/Object;

    iput-object p7, p0, La/mk7;->g:Ljava/lang/Object;

    iput-object p8, p0, La/mk7;->h:Ljava/lang/Object;

    iput-object p9, p0, La/mk7;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mk7;->a:B

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, La/mk7;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v4, v1

    .line 12
    check-cast v4, La/fge0;

    .line 13
    .line 14
    iget-object v1, v0, La/mk7;->c:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v10, v1

    .line 17
    check-cast v10, La/iz40;

    .line 18
    .line 19
    iget-object v1, v0, La/mk7;->d:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v11, v1

    .line 22
    check-cast v11, La/iz40;

    .line 23
    .line 24
    iget-object v1, v0, La/mk7;->e:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, v1

    .line 27
    check-cast v5, Ljava/util/List;

    .line 28
    .line 29
    iget-object v1, v0, La/mk7;->f:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v6, v1

    .line 32
    check-cast v6, Ljava/util/List;

    .line 33
    .line 34
    iget-object v1, v0, La/mk7;->g:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v8, v1

    .line 37
    check-cast v8, La/iz40;

    .line 38
    .line 39
    iget-object v1, v0, La/mk7;->h:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v7, v1

    .line 42
    check-cast v7, Ljava/util/List;

    .line 43
    .line 44
    iget-object v1, v0, La/mk7;->i:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v9, v1

    .line 47
    check-cast v9, La/iz40;

    .line 48
    .line 49
    iget-object v0, v0, La/mk7;->j:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ljava/util/Set;

    .line 52
    .line 53
    move-object/from16 v1, p1

    .line 54
    .line 55
    check-cast v1, Ljava/lang/Long;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v12

    .line 61
    sget-object v1, La/fge0;->z:La/p7m0;

    .line 62
    .line 63
    iget-object v1, v4, La/fge0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter v1

    .line 66
    :try_start_0
    invoke-virtual {v4}, La/fge0;->D()Z

    .line 67
    .line 68
    .line 69
    move-result v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_11

    .line 70
    monitor-exit v1

    .line 71
    const/4 v1, 0x0

    .line 72
    if-eqz v14, :cond_2

    .line 73
    .line 74
    const-string v14, "Recomposer:animation"

    .line 75
    .line 76
    invoke-static {v14}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :try_start_1
    iget-object v14, v4, La/fge0;->a:La/o39;

    .line 80
    .line 81
    iget-object v14, v14, La/o39;->b:La/gr00;

    .line 82
    .line 83
    new-instance v15, La/bx;

    .line 84
    .line 85
    const/16 v16, 0x2

    .line 86
    .line 87
    const/16 v2, 0xd

    .line 88
    .line 89
    invoke-direct {v15, v2, v12, v13}, La/bx;-><init>(BJ)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v14, v15}, La/gr00;->m(Lkotlin/jvm/functions/Function1;)V

    .line 93
    .line 94
    .line 95
    sget-object v2, La/xfk0;->c:Ljava/lang/Object;

    .line 96
    .line 97
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    :try_start_2
    sget-object v12, La/xfk0;->j:La/x8v;

    .line 99
    .line 100
    iget-object v12, v12, La/nz40;->h:La/iz40;

    .line 101
    .line 102
    if-eqz v12, :cond_0

    .line 103
    .line 104
    invoke-virtual {v12}, La/iz40;->h()Z

    .line 105
    .line 106
    .line 107
    move-result v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 108
    if-ne v12, v3, :cond_0

    .line 109
    .line 110
    move v12, v3

    .line 111
    goto :goto_0

    .line 112
    :cond_0
    move v12, v1

    .line 113
    :goto_0
    :try_start_3
    monitor-exit v2

    .line 114
    if-eqz v12, :cond_1

    .line 115
    .line 116
    invoke-static {}, La/xfk0;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    :try_start_4
    monitor-exit v2

    .line 125
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 126
    :catchall_1
    move-exception v0

    .line 127
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_2
    const/16 v16, 0x2

    .line 132
    .line 133
    :goto_1
    const-string v2, "Recomposer:recompose"

    .line 134
    .line 135
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :try_start_5
    invoke-virtual {v4}, La/fge0;->O()Z

    .line 139
    .line 140
    .line 141
    iget-object v2, v4, La/fge0;->c:Ljava/lang/Object;

    .line 142
    .line 143
    monitor-enter v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_10

    .line 144
    :try_start_6
    iget-object v12, v4, La/fge0;->i:La/xz40;

    .line 145
    .line 146
    iget-object v13, v12, La/xz40;->a:[Ljava/lang/Object;

    .line 147
    .line 148
    iget v12, v12, La/xz40;->c:I

    .line 149
    .line 150
    move v14, v1

    .line 151
    :goto_2
    if-ge v14, v12, :cond_3

    .line 152
    .line 153
    aget-object v15, v13, v14

    .line 154
    .line 155
    check-cast v15, La/tld;

    .line 156
    .line 157
    invoke-interface {v5, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    add-int/lit8 v14, v14, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :catchall_2
    move-exception v0

    .line 164
    goto/16 :goto_26

    .line 165
    .line 166
    :cond_3
    iget-object v12, v4, La/fge0;->i:La/xz40;

    .line 167
    .line 168
    invoke-virtual {v12}, La/xz40;->g()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 169
    .line 170
    .line 171
    :try_start_7
    monitor-exit v2

    .line 172
    invoke-virtual {v10}, La/iz40;->b()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11}, La/iz40;->b()V

    .line 176
    .line 177
    .line 178
    :goto_3
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    const/4 v12, 0x0

    .line 183
    if-eqz v2, :cond_14

    .line 184
    .line 185
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-nez v2, :cond_4

    .line 190
    .line 191
    goto/16 :goto_19

    .line 192
    .line 193
    :cond_4
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    instance-of v2, v0, La/nz40;

    .line 198
    .line 199
    if-eqz v2, :cond_5

    .line 200
    .line 201
    new-instance v17, La/ios0;

    .line 202
    .line 203
    move-object/from16 v18, v0

    .line 204
    .line 205
    check-cast v18, La/nz40;

    .line 206
    .line 207
    const/16 v21, 0x1

    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const/16 v19, 0x0

    .line 212
    .line 213
    const/16 v20, 0x0

    .line 214
    .line 215
    invoke-direct/range {v17 .. v22}, La/ios0;-><init>(La/nz40;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_5
    new-instance v2, La/jos0;

    .line 220
    .line 221
    invoke-direct {v2, v0, v12, v3, v1}, La/jos0;-><init>(La/rfk0;Lkotlin/jvm/functions/Function1;ZZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_10

    .line 222
    .line 223
    .line 224
    move-object/from16 v17, v2

    .line 225
    .line 226
    :goto_4
    :try_start_8
    invoke-virtual/range {v17 .. v17}, La/rfk0;->j()La/rfk0;

    .line 227
    .line 228
    .line 229
    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 230
    :try_start_9
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 234
    if-nez v0, :cond_8

    .line 235
    .line 236
    :try_start_a
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    move v3, v1

    .line 241
    :goto_5
    if-ge v3, v0, :cond_6

    .line 242
    .line 243
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    check-cast v13, La/tld;

    .line 248
    .line 249
    invoke-virtual {v9, v13}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    add-int/lit8 v3, v3, 0x1

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :catchall_3
    move-exception v0

    .line 256
    goto :goto_7

    .line 257
    :cond_6
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    move v3, v1

    .line 262
    :goto_6
    if-ge v3, v0, :cond_7

    .line 263
    .line 264
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    check-cast v13, La/tld;

    .line 269
    .line 270
    invoke-virtual {v13}, La/tld;->j()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 271
    .line 272
    .line 273
    add-int/lit8 v3, v3, 0x1

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_7
    :try_start_b
    invoke-interface {v7}, Ljava/util/List;->clear()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 277
    .line 278
    .line 279
    goto :goto_9

    .line 280
    :catchall_4
    move-exception v0

    .line 281
    goto/16 :goto_17

    .line 282
    .line 283
    :goto_7
    :try_start_c
    invoke-virtual {v4, v0, v12}, La/fge0;->N(Ljava/lang/Throwable;La/tld;)V

    .line 284
    .line 285
    .line 286
    invoke-static/range {v4 .. v11}, La/ege0;->l(La/fge0;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/iz40;La/iz40;La/iz40;La/iz40;)V

    .line 287
    .line 288
    .line 289
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 290
    .line 291
    :try_start_d
    invoke-interface {v7}, Ljava/util/List;->clear()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 292
    .line 293
    .line 294
    :try_start_e
    invoke-static {v2}, La/rfk0;->q(La/rfk0;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 295
    .line 296
    .line 297
    goto/16 :goto_14

    .line 298
    .line 299
    :goto_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_25

    .line 303
    .line 304
    :catchall_5
    move-exception v0

    .line 305
    goto/16 :goto_18

    .line 306
    .line 307
    :catchall_6
    move-exception v0

    .line 308
    :try_start_f
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 309
    .line 310
    .line 311
    throw v0

    .line 312
    :cond_8
    :goto_9
    invoke-virtual {v8}, La/iz40;->h()Z

    .line 313
    .line 314
    .line 315
    move-result v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 316
    const-wide/16 v18, 0xff

    .line 317
    .line 318
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    if-eqz v0, :cond_d

    .line 324
    .line 325
    :try_start_10
    invoke-virtual {v9, v8}, La/iz40;->j(La/iz40;)V

    .line 326
    .line 327
    .line 328
    iget-object v0, v8, La/iz40;->b:[Ljava/lang/Object;

    .line 329
    .line 330
    iget-object v1, v8, La/iz40;->a:[J

    .line 331
    .line 332
    const/16 p1, 0x7

    .line 333
    .line 334
    array-length v3, v1

    .line 335
    add-int/lit8 v3, v3, -0x2

    .line 336
    .line 337
    const-wide/16 v22, 0x80

    .line 338
    .line 339
    if-ltz v3, :cond_c

    .line 340
    .line 341
    const/16 v24, 0x0

    .line 342
    .line 343
    :goto_a
    aget-wide v12, v1, v24

    .line 344
    .line 345
    const/16 v25, 0x8

    .line 346
    .line 347
    not-long v14, v12

    .line 348
    shl-long v14, v14, p1

    .line 349
    .line 350
    and-long/2addr v14, v12

    .line 351
    and-long v14, v14, v20

    .line 352
    .line 353
    cmp-long v14, v14, v20

    .line 354
    .line 355
    if-eqz v14, :cond_b

    .line 356
    .line 357
    sub-int v14, v24, v3

    .line 358
    .line 359
    not-int v14, v14

    .line 360
    ushr-int/lit8 v14, v14, 0x1f

    .line 361
    .line 362
    rsub-int/lit8 v15, v14, 0x8

    .line 363
    .line 364
    const/4 v14, 0x0

    .line 365
    :goto_b
    if-ge v14, v15, :cond_a

    .line 366
    .line 367
    and-long v26, v12, v18

    .line 368
    .line 369
    cmp-long v26, v26, v22

    .line 370
    .line 371
    if-gez v26, :cond_9

    .line 372
    .line 373
    shl-int/lit8 v26, v24, 0x3

    .line 374
    .line 375
    add-int v26, v26, v14

    .line 376
    .line 377
    aget-object v26, v0, v26

    .line 378
    .line 379
    check-cast v26, La/tld;

    .line 380
    .line 381
    invoke-virtual/range {v26 .. v26}, La/tld;->l()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 382
    .line 383
    .line 384
    goto :goto_c

    .line 385
    :catchall_7
    move-exception v0

    .line 386
    const/4 v14, 0x0

    .line 387
    goto :goto_d

    .line 388
    :cond_9
    :goto_c
    shr-long v12, v12, v25

    .line 389
    .line 390
    add-int/lit8 v14, v14, 0x1

    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_a
    move/from16 v12, v25

    .line 394
    .line 395
    if-ne v15, v12, :cond_c

    .line 396
    .line 397
    :cond_b
    move/from16 v12, v24

    .line 398
    .line 399
    if-eq v12, v3, :cond_c

    .line 400
    .line 401
    add-int/lit8 v24, v12, 0x1

    .line 402
    .line 403
    goto :goto_a

    .line 404
    :cond_c
    :try_start_11
    invoke-virtual {v8}, La/iz40;->b()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 405
    .line 406
    .line 407
    goto :goto_e

    .line 408
    :goto_d
    :try_start_12
    invoke-virtual {v4, v0, v14}, La/fge0;->N(Ljava/lang/Throwable;La/tld;)V

    .line 409
    .line 410
    .line 411
    invoke-static/range {v4 .. v11}, La/ege0;->l(La/fge0;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/iz40;La/iz40;La/iz40;La/iz40;)V

    .line 412
    .line 413
    .line 414
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 415
    .line 416
    :try_start_13
    invoke-virtual {v8}, La/iz40;->b()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 417
    .line 418
    .line 419
    :try_start_14
    invoke-static {v2}, La/rfk0;->q(La/rfk0;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_5

    .line 420
    .line 421
    .line 422
    goto/16 :goto_14

    .line 423
    .line 424
    :catchall_8
    move-exception v0

    .line 425
    :try_start_15
    invoke-virtual {v8}, La/iz40;->b()V

    .line 426
    .line 427
    .line 428
    throw v0

    .line 429
    :cond_d
    const/16 p1, 0x7

    .line 430
    .line 431
    const-wide/16 v22, 0x80

    .line 432
    .line 433
    :goto_e
    invoke-virtual {v9}, La/iz40;->h()Z

    .line 434
    .line 435
    .line 436
    move-result v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 437
    if-eqz v0, :cond_12

    .line 438
    .line 439
    :try_start_16
    iget-object v0, v9, La/iz40;->b:[Ljava/lang/Object;

    .line 440
    .line 441
    iget-object v1, v9, La/iz40;->a:[J

    .line 442
    .line 443
    array-length v3, v1

    .line 444
    add-int/lit8 v3, v3, -0x2

    .line 445
    .line 446
    if-ltz v3, :cond_11

    .line 447
    .line 448
    const/4 v12, 0x0

    .line 449
    :goto_f
    aget-wide v14, v1, v12

    .line 450
    .line 451
    move-object v13, v0

    .line 452
    move-object/from16 v24, v1

    .line 453
    .line 454
    not-long v0, v14

    .line 455
    shl-long v0, v0, p1

    .line 456
    .line 457
    and-long/2addr v0, v14

    .line 458
    and-long v0, v0, v20

    .line 459
    .line 460
    cmp-long v0, v0, v20

    .line 461
    .line 462
    if-eqz v0, :cond_10

    .line 463
    .line 464
    sub-int v0, v12, v3

    .line 465
    .line 466
    not-int v0, v0

    .line 467
    ushr-int/lit8 v0, v0, 0x1f

    .line 468
    .line 469
    const/16 v25, 0x8

    .line 470
    .line 471
    rsub-int/lit8 v0, v0, 0x8

    .line 472
    .line 473
    const/4 v1, 0x0

    .line 474
    :goto_10
    if-ge v1, v0, :cond_f

    .line 475
    .line 476
    and-long v26, v14, v18

    .line 477
    .line 478
    cmp-long v16, v26, v22

    .line 479
    .line 480
    if-gez v16, :cond_e

    .line 481
    .line 482
    shl-int/lit8 v16, v12, 0x3

    .line 483
    .line 484
    add-int v16, v16, v1

    .line 485
    .line 486
    aget-object v16, v13, v16

    .line 487
    .line 488
    check-cast v16, La/tld;

    .line 489
    .line 490
    invoke-virtual/range {v16 .. v16}, La/tld;->m()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_9

    .line 491
    .line 492
    .line 493
    :cond_e
    move/from16 v16, v1

    .line 494
    .line 495
    const/16 v1, 0x8

    .line 496
    .line 497
    goto :goto_11

    .line 498
    :catchall_9
    move-exception v0

    .line 499
    const/4 v14, 0x0

    .line 500
    goto :goto_13

    .line 501
    :goto_11
    shr-long/2addr v14, v1

    .line 502
    add-int/lit8 v16, v16, 0x1

    .line 503
    .line 504
    move/from16 v1, v16

    .line 505
    .line 506
    goto :goto_10

    .line 507
    :cond_f
    const/16 v1, 0x8

    .line 508
    .line 509
    if-ne v0, v1, :cond_11

    .line 510
    .line 511
    goto :goto_12

    .line 512
    :cond_10
    const/16 v1, 0x8

    .line 513
    .line 514
    :goto_12
    if-eq v12, v3, :cond_11

    .line 515
    .line 516
    add-int/lit8 v12, v12, 0x1

    .line 517
    .line 518
    move-object v0, v13

    .line 519
    move-object/from16 v1, v24

    .line 520
    .line 521
    goto :goto_f

    .line 522
    :cond_11
    :try_start_17
    invoke-virtual {v9}, La/iz40;->b()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_4

    .line 523
    .line 524
    .line 525
    goto :goto_15

    .line 526
    :goto_13
    :try_start_18
    invoke-virtual {v4, v0, v14}, La/fge0;->N(Ljava/lang/Throwable;La/tld;)V

    .line 527
    .line 528
    .line 529
    invoke-static/range {v4 .. v11}, La/ege0;->l(La/fge0;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/iz40;La/iz40;La/iz40;La/iz40;)V

    .line 530
    .line 531
    .line 532
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 533
    .line 534
    :try_start_19
    invoke-virtual {v9}, La/iz40;->b()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    .line 535
    .line 536
    .line 537
    :try_start_1a
    invoke-static {v2}, La/rfk0;->q(La/rfk0;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    .line 538
    .line 539
    .line 540
    :goto_14
    :try_start_1b
    invoke-virtual/range {v17 .. v17}, La/rfk0;->c()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_10

    .line 541
    .line 542
    .line 543
    goto/16 :goto_8

    .line 544
    .line 545
    :catchall_a
    move-exception v0

    .line 546
    :try_start_1c
    invoke-virtual {v9}, La/iz40;->b()V

    .line 547
    .line 548
    .line 549
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    .line 550
    :cond_12
    :goto_15
    :try_start_1d
    invoke-static {v2}, La/rfk0;->q(La/rfk0;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_5

    .line 551
    .line 552
    .line 553
    :try_start_1e
    invoke-virtual/range {v17 .. v17}, La/rfk0;->c()V

    .line 554
    .line 555
    .line 556
    iget-object v1, v4, La/fge0;->c:Ljava/lang/Object;

    .line 557
    .line 558
    monitor-enter v1
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_10

    .line 559
    :try_start_1f
    invoke-virtual {v4}, La/fge0;->C()La/m5a;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    if-nez v0, :cond_13

    .line 564
    .line 565
    goto :goto_16

    .line 566
    :cond_13
    const-string v0, "unexpected to get continuation here"

    .line 567
    .line 568
    invoke-static {v0}, La/ykd;->a(Ljava/lang/String;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_b

    .line 569
    .line 570
    .line 571
    :goto_16
    :try_start_20
    monitor-exit v1

    .line 572
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, La/rfk0;->m()V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v11}, La/iz40;->b()V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v10}, La/iz40;->b()V

    .line 583
    .line 584
    .line 585
    const/4 v14, 0x0

    .line 586
    iput-object v14, v4, La/fge0;->q:La/iz40;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_10

    .line 587
    .line 588
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    goto/16 :goto_25

    .line 594
    .line 595
    :catchall_b
    move-exception v0

    .line 596
    :try_start_21
    monitor-exit v1

    .line 597
    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_10

    .line 598
    :goto_17
    :try_start_22
    invoke-static {v2}, La/rfk0;->q(La/rfk0;)V

    .line 599
    .line 600
    .line 601
    throw v0
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_5

    .line 602
    :goto_18
    :try_start_23
    invoke-virtual/range {v17 .. v17}, La/rfk0;->c()V

    .line 603
    .line 604
    .line 605
    throw v0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_10

    .line 606
    :cond_14
    :goto_19
    :try_start_24
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 607
    .line 608
    .line 609
    move-result v1

    .line 610
    const/4 v2, 0x0

    .line 611
    :goto_1a
    if-ge v2, v1, :cond_16

    .line 612
    .line 613
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v12

    .line 617
    check-cast v12, La/tld;

    .line 618
    .line 619
    invoke-virtual {v4, v12, v10}, La/fge0;->M(La/tld;La/iz40;)La/tld;

    .line 620
    .line 621
    .line 622
    move-result-object v13

    .line 623
    if-eqz v13, :cond_15

    .line 624
    .line 625
    invoke-interface {v7, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    goto :goto_1b

    .line 629
    :catchall_c
    move-exception v0

    .line 630
    const/4 v14, 0x0

    .line 631
    goto/16 :goto_24

    .line 632
    .line 633
    :cond_15
    :goto_1b
    invoke-virtual {v11, v12}, La/iz40;->a(Ljava/lang/Object;)Z
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_c

    .line 634
    .line 635
    .line 636
    add-int/lit8 v2, v2, 0x1

    .line 637
    .line 638
    goto :goto_1a

    .line 639
    :cond_16
    :try_start_25
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v10}, La/iz40;->h()Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    if-nez v1, :cond_17

    .line 647
    .line 648
    iget-object v1, v4, La/fge0;->i:La/xz40;

    .line 649
    .line 650
    iget v1, v1, La/xz40;->c:I

    .line 651
    .line 652
    if-eqz v1, :cond_1d

    .line 653
    .line 654
    :cond_17
    iget-object v1, v4, La/fge0;->c:Ljava/lang/Object;

    .line 655
    .line 656
    monitor-enter v1
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_10

    .line 657
    :try_start_26
    invoke-virtual {v4}, La/fge0;->H()Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 662
    .line 663
    .line 664
    move-result v12

    .line 665
    const/4 v13, 0x0

    .line 666
    :goto_1c
    if-ge v13, v12, :cond_19

    .line 667
    .line 668
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v15

    .line 672
    check-cast v15, La/tld;

    .line 673
    .line 674
    invoke-virtual {v11, v15}, La/iz40;->c(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v17

    .line 678
    if-nez v17, :cond_18

    .line 679
    .line 680
    invoke-virtual {v15, v0}, La/tld;->z(Ljava/util/Set;)Z

    .line 681
    .line 682
    .line 683
    move-result v17

    .line 684
    if-eqz v17, :cond_18

    .line 685
    .line 686
    invoke-interface {v5, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    goto :goto_1d

    .line 690
    :catchall_d
    move-exception v0

    .line 691
    goto/16 :goto_23

    .line 692
    .line 693
    :cond_18
    :goto_1d
    add-int/lit8 v13, v13, 0x1

    .line 694
    .line 695
    goto :goto_1c

    .line 696
    :cond_19
    iget-object v2, v4, La/fge0;->i:La/xz40;

    .line 697
    .line 698
    iget v12, v2, La/xz40;->c:I
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_d

    .line 699
    .line 700
    const/4 v13, 0x0

    .line 701
    const/4 v15, 0x0

    .line 702
    :goto_1e
    iget-object v14, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 703
    .line 704
    if-ge v13, v12, :cond_1c

    .line 705
    .line 706
    :try_start_27
    aget-object v14, v14, v13

    .line 707
    .line 708
    check-cast v14, La/tld;

    .line 709
    .line 710
    invoke-virtual {v11, v14}, La/iz40;->c(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v17

    .line 714
    if-nez v17, :cond_1a

    .line 715
    .line 716
    invoke-interface {v5, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-result v17

    .line 720
    if-nez v17, :cond_1a

    .line 721
    .line 722
    invoke-interface {v5, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    add-int/lit8 v15, v15, 0x1

    .line 726
    .line 727
    goto :goto_1f

    .line 728
    :cond_1a
    if-lez v15, :cond_1b

    .line 729
    .line 730
    iget-object v14, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 731
    .line 732
    sub-int v17, v13, v15

    .line 733
    .line 734
    aget-object v18, v14, v13

    .line 735
    .line 736
    aput-object v18, v14, v17

    .line 737
    .line 738
    :cond_1b
    :goto_1f
    add-int/lit8 v13, v13, 0x1

    .line 739
    .line 740
    goto :goto_1e

    .line 741
    :cond_1c
    sub-int v13, v12, v15

    .line 742
    .line 743
    const/4 v15, 0x0

    .line 744
    invoke-static {v14, v13, v12, v15}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    iput v13, v2, La/xz40;->c:I
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_d

    .line 748
    .line 749
    :try_start_28
    monitor-exit v1

    .line 750
    :cond_1d
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 751
    .line 752
    .line 753
    move-result v1
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_10

    .line 754
    if-eqz v1, :cond_1f

    .line 755
    .line 756
    :try_start_29
    invoke-static {v6, v4}, La/ege0;->m(Ljava/util/List;La/fge0;)V

    .line 757
    .line 758
    .line 759
    :goto_20
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 760
    .line 761
    .line 762
    move-result v1

    .line 763
    if-nez v1, :cond_1f

    .line 764
    .line 765
    invoke-virtual {v4, v6, v10}, La/fge0;->L(Ljava/util/List;La/iz40;)Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v1

    .line 769
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 780
    .line 781
    .line 782
    move-result v2

    .line 783
    if-eqz v2, :cond_1e

    .line 784
    .line 785
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    invoke-virtual {v8, v2}, La/iz40;->k(Ljava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    goto :goto_21

    .line 793
    :cond_1e
    invoke-static {v6, v4}, La/ege0;->m(Ljava/util/List;La/fge0;)V
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_e

    .line 794
    .line 795
    .line 796
    goto :goto_20

    .line 797
    :catchall_e
    move-exception v0

    .line 798
    const/4 v14, 0x0

    .line 799
    goto :goto_22

    .line 800
    :cond_1f
    const/4 v1, 0x0

    .line 801
    goto/16 :goto_3

    .line 802
    .line 803
    :goto_22
    :try_start_2a
    invoke-virtual {v4, v0, v14}, La/fge0;->N(Ljava/lang/Throwable;La/tld;)V

    .line 804
    .line 805
    .line 806
    invoke-static/range {v4 .. v11}, La/ege0;->l(La/fge0;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/iz40;La/iz40;La/iz40;La/iz40;)V

    .line 807
    .line 808
    .line 809
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 810
    .line 811
    goto/16 :goto_8

    .line 812
    .line 813
    :goto_23
    monitor-exit v1

    .line 814
    throw v0
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_10

    .line 815
    :goto_24
    :try_start_2b
    invoke-virtual {v4, v0, v14}, La/fge0;->N(Ljava/lang/Throwable;La/tld;)V

    .line 816
    .line 817
    .line 818
    invoke-static/range {v4 .. v11}, La/ege0;->l(La/fge0;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/iz40;La/iz40;La/iz40;La/iz40;)V

    .line 819
    .line 820
    .line 821
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_f

    .line 822
    .line 823
    :try_start_2c
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 824
    .line 825
    .line 826
    goto/16 :goto_8

    .line 827
    .line 828
    :goto_25
    return-object v0

    .line 829
    :catchall_f
    move-exception v0

    .line 830
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 831
    .line 832
    .line 833
    throw v0

    .line 834
    :goto_26
    monitor-exit v2

    .line 835
    throw v0
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_10

    .line 836
    :catchall_10
    move-exception v0

    .line 837
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 838
    .line 839
    .line 840
    throw v0

    .line 841
    :catchall_11
    move-exception v0

    .line 842
    monitor-exit v1

    .line 843
    throw v0

    .line 844
    :pswitch_0
    const/16 v16, 0x2

    .line 845
    .line 846
    iget-object v1, v0, La/mk7;->b:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v1, La/l7m0;

    .line 849
    .line 850
    iget-object v2, v0, La/mk7;->c:Ljava/lang/Object;

    .line 851
    .line 852
    move-object v6, v2

    .line 853
    check-cast v6, La/l7m0;

    .line 854
    .line 855
    iget-object v2, v0, La/mk7;->j:Ljava/lang/Object;

    .line 856
    .line 857
    move-object v7, v2

    .line 858
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 859
    .line 860
    iget-object v2, v0, La/mk7;->d:Ljava/lang/Object;

    .line 861
    .line 862
    move-object v8, v2

    .line 863
    check-cast v8, La/l7m0;

    .line 864
    .line 865
    iget-object v2, v0, La/mk7;->e:Ljava/lang/Object;

    .line 866
    .line 867
    move-object v9, v2

    .line 868
    check-cast v9, La/l7m0;

    .line 869
    .line 870
    iget-object v2, v0, La/mk7;->f:Ljava/lang/Object;

    .line 871
    .line 872
    move-object v10, v2

    .line 873
    check-cast v10, La/l7m0;

    .line 874
    .line 875
    iget-object v2, v0, La/mk7;->g:Ljava/lang/Object;

    .line 876
    .line 877
    move-object v11, v2

    .line 878
    check-cast v11, La/l7m0;

    .line 879
    .line 880
    iget-object v2, v0, La/mk7;->h:Ljava/lang/Object;

    .line 881
    .line 882
    move-object v12, v2

    .line 883
    check-cast v12, La/l7m0;

    .line 884
    .line 885
    iget-object v0, v0, La/mk7;->i:Ljava/lang/Object;

    .line 886
    .line 887
    move-object v13, v0

    .line 888
    check-cast v13, La/l7m0;

    .line 889
    .line 890
    move-object/from16 v0, p1

    .line 891
    .line 892
    check-cast v0, La/hcz;

    .line 893
    .line 894
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v1

    .line 901
    check-cast v1, La/l7m0;

    .line 902
    .line 903
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    move-object v5, v1

    .line 908
    check-cast v5, Ljava/util/List;

    .line 909
    .line 910
    new-instance v1, La/nk7;

    .line 911
    .line 912
    invoke-direct {v1, v3}, La/nk7;-><init>(B)V

    .line 913
    .line 914
    .line 915
    new-instance v2, La/nk7;

    .line 916
    .line 917
    move/from16 v4, v16

    .line 918
    .line 919
    invoke-direct {v2, v4}, La/nk7;-><init>(B)V

    .line 920
    .line 921
    .line 922
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 923
    .line 924
    .line 925
    move-result v14

    .line 926
    new-instance v15, La/ci2;

    .line 927
    .line 928
    const/16 v4, 0x1c

    .line 929
    .line 930
    invoke-direct {v15, v1, v5, v4}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 931
    .line 932
    .line 933
    new-instance v1, La/ci2;

    .line 934
    .line 935
    const/16 v4, 0x1d

    .line 936
    .line 937
    invoke-direct {v1, v2, v5, v4}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 938
    .line 939
    .line 940
    new-instance v4, La/rk7;

    .line 941
    .line 942
    invoke-direct/range {v4 .. v13}, La/rk7;-><init>(Ljava/util/List;La/l7m0;Lkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 943
    .line 944
    .line 945
    new-instance v2, La/ugd;

    .line 946
    .line 947
    const v5, 0x2fd4df92

    .line 948
    .line 949
    .line 950
    invoke-direct {v2, v5, v3, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v0, v14, v15, v1, v2}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 954
    .line 955
    .line 956
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 957
    .line 958
    return-object v0

    .line 959
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
