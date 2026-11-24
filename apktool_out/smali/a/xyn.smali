.class public abstract La/xyn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, La/wv00;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/xyn;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(La/qov0;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/qov0;->a:La/cpv0;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, La/qov0;->e:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, La/qov0;->b(La/qov0;)Ljava/util/HashSet;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v2, p0, La/qov0;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    :goto_0
    if-nez v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, La/cpv0;->b:La/wsd;

    .line 53
    .line 54
    iget-object v2, v0, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, La/aeg0;->b()V

    .line 60
    .line 61
    .line 62
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v1, p0}, La/slb;->M(Landroidx/work/impl/WorkDatabase;La/wsd;La/qov0;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, La/xyn;->b(La/qov0;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-virtual {v2}, La/aeg0;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, La/aeg0;->m()V

    .line 76
    .line 77
    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    iget-object p0, v0, La/cpv0;->e:Ljava/util/List;

    .line 81
    .line 82
    invoke-static {v1, v2, p0}, La/m2h0;->b(La/wsd;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    return-void

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    invoke-virtual {v2}, La/aeg0;->m()V

    .line 88
    .line 89
    .line 90
    throw p0

    .line 91
    :cond_3
    const-string v0, "WorkContinuation has cycles ("

    .line 92
    .line 93
    const-string v1, ")"

    .line 94
    .line 95
    invoke-static {p0, v1, v0}, La/c99;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public static b(La/qov0;)Z
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, La/qov0;->b(La/qov0;)Ljava/util/HashSet;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, La/qov0;->a:La/cpv0;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v3, v2, La/cpv0;->b:La/wsd;

    .line 13
    .line 14
    iget-object v4, v0, La/qov0;->d:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    new-array v6, v5, [Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, [Ljava/lang/String;

    .line 27
    .line 28
    iget-object v6, v0, La/qov0;->b:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v7, v0, La/qov0;->c:La/zko;

    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v3, v2, La/cpv0;->d:La/fpv0;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    iget-object v3, v2, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    array-length v10, v1

    .line 53
    if-nez v10, :cond_0

    .line 54
    .line 55
    const/4 v10, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move v10, v5

    .line 58
    :goto_0
    xor-int/lit8 v12, v10, 0x1

    .line 59
    .line 60
    if-nez v10, :cond_6

    .line 61
    .line 62
    array-length v13, v1

    .line 63
    move v14, v5

    .line 64
    move/from16 v16, v14

    .line 65
    .line 66
    move/from16 v17, v16

    .line 67
    .line 68
    const/4 v15, 0x1

    .line 69
    :goto_1
    if-ge v14, v13, :cond_7

    .line 70
    .line 71
    aget-object v5, v1, v14

    .line 72
    .line 73
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v11, v5}, La/upv0;->e(Ljava/lang/String;)La/ppv0;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    if-nez v11, :cond_2

    .line 82
    .line 83
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v3, "Prerequisite "

    .line 90
    .line 91
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v3, " doesn\'t exist; not enqueuing"

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    sget-object v3, La/xyn;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v1, v3, v2}, La/wv00;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_1
    :goto_2
    const/4 v5, 0x0

    .line 112
    const/4 v7, 0x1

    .line 113
    goto/16 :goto_17

    .line 114
    .line 115
    :cond_2
    iget-object v5, v11, La/ppv0;->b:La/zov0;

    .line 116
    .line 117
    sget-object v11, La/zov0;->c:La/zov0;

    .line 118
    .line 119
    if-ne v5, v11, :cond_3

    .line 120
    .line 121
    const/4 v11, 0x1

    .line 122
    goto :goto_3

    .line 123
    :cond_3
    const/4 v11, 0x0

    .line 124
    :goto_3
    and-int/2addr v15, v11

    .line 125
    sget-object v11, La/zov0;->d:La/zov0;

    .line 126
    .line 127
    if-ne v5, v11, :cond_4

    .line 128
    .line 129
    const/16 v17, 0x1

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_4
    sget-object v11, La/zov0;->f:La/zov0;

    .line 133
    .line 134
    if-ne v5, v11, :cond_5

    .line 135
    .line 136
    const/16 v16, 0x1

    .line 137
    .line 138
    :cond_5
    :goto_4
    add-int/lit8 v14, v14, 0x1

    .line 139
    .line 140
    const/4 v5, 0x0

    .line 141
    goto :goto_1

    .line 142
    :cond_6
    const/4 v15, 0x1

    .line 143
    const/16 v16, 0x0

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    :cond_7
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-nez v5, :cond_17

    .line 152
    .line 153
    if-eqz v10, :cond_17

    .line 154
    .line 155
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v10, v6}, La/upv0;->f(Ljava/lang/String;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    if-nez v13, :cond_17

    .line 171
    .line 172
    sget-object v13, La/zko;->c:La/zko;

    .line 173
    .line 174
    if-eq v7, v13, :cond_c

    .line 175
    .line 176
    sget-object v13, La/zko;->d:La/zko;

    .line 177
    .line 178
    if-ne v7, v13, :cond_8

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_8
    sget-object v13, La/zko;->b:La/zko;

    .line 182
    .line 183
    if-ne v7, v13, :cond_a

    .line 184
    .line 185
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    :cond_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    if-eqz v13, :cond_a

    .line 194
    .line 195
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    check-cast v13, La/npv0;

    .line 200
    .line 201
    iget-object v13, v13, La/npv0;->b:La/zov0;

    .line 202
    .line 203
    sget-object v14, La/zov0;->a:La/zov0;

    .line 204
    .line 205
    if-eq v13, v14, :cond_1

    .line 206
    .line 207
    sget-object v14, La/zov0;->b:La/zov0;

    .line 208
    .line 209
    if-ne v13, v14, :cond_9

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance v7, La/i5a;

    .line 216
    .line 217
    const/4 v13, 0x1

    .line 218
    invoke-direct {v7, v3, v6, v2, v13}, La/i5a;-><init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;La/cpv0;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3, v7}, La/aeg0;->p(Ljava/lang/Runnable;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v13

    .line 236
    if-eqz v13, :cond_b

    .line 237
    .line 238
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v13

    .line 242
    check-cast v13, La/npv0;

    .line 243
    .line 244
    iget-object v13, v13, La/npv0;->a:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {v7, v13}, La/upv0;->c(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_b
    move-object/from16 v19, v3

    .line 251
    .line 252
    const/4 v3, 0x1

    .line 253
    goto/16 :goto_d

    .line 254
    .line 255
    :cond_c
    :goto_6
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->s()La/g7k;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    new-instance v12, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    if-eqz v13, :cond_11

    .line 273
    .line 274
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    check-cast v13, La/npv0;

    .line 279
    .line 280
    iget-object v14, v13, La/npv0;->a:Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-object v11, v1, La/g7k;->a:La/aeg0;

    .line 289
    .line 290
    move-object/from16 v18, v1

    .line 291
    .line 292
    new-instance v1, La/ka6;

    .line 293
    .line 294
    move-object/from16 v19, v3

    .line 295
    .line 296
    const/4 v3, 0x4

    .line 297
    invoke-direct {v1, v14, v3}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 298
    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    const/4 v14, 0x1

    .line 302
    invoke-static {v11, v14, v3, v1}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-nez v1, :cond_10

    .line 313
    .line 314
    iget-object v1, v13, La/npv0;->b:La/zov0;

    .line 315
    .line 316
    sget-object v3, La/zov0;->c:La/zov0;

    .line 317
    .line 318
    if-ne v1, v3, :cond_d

    .line 319
    .line 320
    const/4 v3, 0x1

    .line 321
    goto :goto_8

    .line 322
    :cond_d
    const/4 v3, 0x0

    .line 323
    :goto_8
    and-int/2addr v15, v3

    .line 324
    sget-object v3, La/zov0;->d:La/zov0;

    .line 325
    .line 326
    if-ne v1, v3, :cond_e

    .line 327
    .line 328
    const/16 v17, 0x1

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_e
    sget-object v3, La/zov0;->f:La/zov0;

    .line 332
    .line 333
    if-ne v1, v3, :cond_f

    .line 334
    .line 335
    const/16 v16, 0x1

    .line 336
    .line 337
    :cond_f
    :goto_9
    iget-object v1, v13, La/npv0;->a:Ljava/lang/String;

    .line 338
    .line 339
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    :cond_10
    move-object/from16 v1, v18

    .line 343
    .line 344
    move-object/from16 v3, v19

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_11
    move-object/from16 v19, v3

    .line 348
    .line 349
    sget-object v1, La/zko;->d:La/zko;

    .line 350
    .line 351
    if-ne v7, v1, :cond_15

    .line 352
    .line 353
    if-nez v16, :cond_12

    .line 354
    .line 355
    if-eqz v17, :cond_15

    .line 356
    .line 357
    :cond_12
    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-virtual {v1, v6}, La/upv0;->f(Ljava/lang/String;)Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    new-instance v7, Ljava/util/ArrayList;

    .line 366
    .line 367
    const/16 v10, 0xa

    .line 368
    .line 369
    invoke-static {v3, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v10

    .line 380
    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v11

    .line 384
    if-eqz v11, :cond_13

    .line 385
    .line 386
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    check-cast v11, La/npv0;

    .line 391
    .line 392
    iget-object v11, v11, La/npv0;->a:Ljava/lang/String;

    .line 393
    .line 394
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    goto :goto_a

    .line 398
    :cond_13
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    if-eqz v7, :cond_14

    .line 407
    .line 408
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    check-cast v7, La/npv0;

    .line 413
    .line 414
    iget-object v7, v7, La/npv0;->a:Ljava/lang/String;

    .line 415
    .line 416
    invoke-virtual {v1, v7}, La/upv0;->c(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    goto :goto_b

    .line 420
    :cond_14
    new-instance v12, Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 423
    .line 424
    .line 425
    const/16 v16, 0x0

    .line 426
    .line 427
    const/16 v17, 0x0

    .line 428
    .line 429
    :cond_15
    const/4 v3, 0x0

    .line 430
    new-array v1, v3, [Ljava/lang/String;

    .line 431
    .line 432
    invoke-interface {v12, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    check-cast v1, [Ljava/lang/String;

    .line 437
    .line 438
    array-length v3, v1

    .line 439
    if-lez v3, :cond_16

    .line 440
    .line 441
    const/4 v12, 0x1

    .line 442
    goto :goto_c

    .line 443
    :cond_16
    const/4 v12, 0x0

    .line 444
    :goto_c
    const/4 v3, 0x0

    .line 445
    goto :goto_d

    .line 446
    :cond_17
    move-object/from16 v19, v3

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :goto_d
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    move v13, v3

    .line 454
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-eqz v3, :cond_22

    .line 459
    .line 460
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    check-cast v3, La/lpv0;

    .line 465
    .line 466
    iget-object v7, v3, La/lpv0;->b:La/ppv0;

    .line 467
    .line 468
    iget-object v10, v3, La/lpv0;->a:Ljava/util/UUID;

    .line 469
    .line 470
    if-eqz v12, :cond_1a

    .line 471
    .line 472
    if-nez v15, :cond_1a

    .line 473
    .line 474
    if-eqz v17, :cond_18

    .line 475
    .line 476
    sget-object v11, La/zov0;->d:La/zov0;

    .line 477
    .line 478
    iput-object v11, v7, La/ppv0;->b:La/zov0;

    .line 479
    .line 480
    goto :goto_f

    .line 481
    :cond_18
    if-eqz v16, :cond_19

    .line 482
    .line 483
    sget-object v11, La/zov0;->f:La/zov0;

    .line 484
    .line 485
    iput-object v11, v7, La/ppv0;->b:La/zov0;

    .line 486
    .line 487
    goto :goto_f

    .line 488
    :cond_19
    sget-object v11, La/zov0;->e:La/zov0;

    .line 489
    .line 490
    iput-object v11, v7, La/ppv0;->b:La/zov0;

    .line 491
    .line 492
    goto :goto_f

    .line 493
    :cond_1a
    iput-wide v8, v7, La/ppv0;->n:J

    .line 494
    .line 495
    :goto_f
    iget-object v11, v7, La/ppv0;->b:La/zov0;

    .line 496
    .line 497
    sget-object v14, La/zov0;->a:La/zov0;

    .line 498
    .line 499
    if-ne v11, v14, :cond_1b

    .line 500
    .line 501
    const/4 v13, 0x1

    .line 502
    :cond_1b
    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 503
    .line 504
    .line 505
    move-result-object v11

    .line 506
    iget-object v14, v2, La/cpv0;->e:Ljava/util/List;

    .line 507
    .line 508
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    iget-object v14, v7, La/ppv0;->e:La/maj;

    .line 515
    .line 516
    move-object/from16 v18, v2

    .line 517
    .line 518
    const-string v2, "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME"

    .line 519
    .line 520
    invoke-virtual {v14, v2}, La/maj;->c(Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v14

    .line 524
    move-object/from16 v34, v4

    .line 525
    .line 526
    iget-object v4, v7, La/ppv0;->e:La/maj;

    .line 527
    .line 528
    move/from16 v35, v5

    .line 529
    .line 530
    const-string v5, "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME"

    .line 531
    .line 532
    invoke-virtual {v4, v5}, La/maj;->c(Ljava/lang/String;)Z

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    iget-object v5, v7, La/ppv0;->e:La/maj;

    .line 537
    .line 538
    move/from16 v20, v4

    .line 539
    .line 540
    const-string v4, "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME"

    .line 541
    .line 542
    invoke-virtual {v5, v4}, La/maj;->c(Ljava/lang/String;)Z

    .line 543
    .line 544
    .line 545
    move-result v4

    .line 546
    if-nez v14, :cond_1c

    .line 547
    .line 548
    if-eqz v20, :cond_1c

    .line 549
    .line 550
    if-eqz v4, :cond_1c

    .line 551
    .line 552
    iget-object v4, v7, La/ppv0;->c:Ljava/lang/String;

    .line 553
    .line 554
    new-instance v5, La/laj;

    .line 555
    .line 556
    const/4 v14, 0x0

    .line 557
    invoke-direct {v5, v14}, La/laj;-><init>(B)V

    .line 558
    .line 559
    .line 560
    iget-object v14, v7, La/ppv0;->e:La/maj;

    .line 561
    .line 562
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    iget-object v14, v14, La/maj;->a:Ljava/util/HashMap;

    .line 566
    .line 567
    invoke-virtual {v5, v14}, La/laj;->c(Ljava/util/Map;)V

    .line 568
    .line 569
    .line 570
    iget-object v14, v5, La/laj;->a:Ljava/util/LinkedHashMap;

    .line 571
    .line 572
    invoke-interface {v14, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v5}, La/laj;->a()La/maj;

    .line 576
    .line 577
    .line 578
    move-result-object v24

    .line 579
    const/16 v32, 0x0

    .line 580
    .line 581
    const v33, 0x1ffffeb

    .line 582
    .line 583
    .line 584
    const/16 v21, 0x0

    .line 585
    .line 586
    const/16 v22, 0x0

    .line 587
    .line 588
    const-string v23, "androidx.work.multiprocess.RemoteListenableDelegatingWorker"

    .line 589
    .line 590
    const/16 v25, 0x0

    .line 591
    .line 592
    const-wide/16 v26, 0x0

    .line 593
    .line 594
    const/16 v28, 0x0

    .line 595
    .line 596
    const/16 v29, 0x0

    .line 597
    .line 598
    const-wide/16 v30, 0x0

    .line 599
    .line 600
    move-object/from16 v20, v7

    .line 601
    .line 602
    invoke-static/range {v20 .. v33}, La/ppv0;->b(La/ppv0;Ljava/lang/String;La/zov0;Ljava/lang/String;La/maj;IJIIJII)La/ppv0;

    .line 603
    .line 604
    .line 605
    move-result-object v7

    .line 606
    goto :goto_10

    .line 607
    :cond_1c
    move-object/from16 v20, v7

    .line 608
    .line 609
    move-object/from16 v7, v20

    .line 610
    .line 611
    :goto_10
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 612
    .line 613
    const/16 v4, 0x19

    .line 614
    .line 615
    if-gt v2, v4, :cond_1d

    .line 616
    .line 617
    iget-object v2, v7, La/ppv0;->j:La/o4e;

    .line 618
    .line 619
    iget-object v4, v7, La/ppv0;->c:Ljava/lang/String;

    .line 620
    .line 621
    const-class v5, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 622
    .line 623
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v14

    .line 627
    invoke-static {v4, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v14

    .line 631
    if-nez v14, :cond_1d

    .line 632
    .line 633
    iget-boolean v14, v2, La/o4e;->e:Z

    .line 634
    .line 635
    if-nez v14, :cond_1e

    .line 636
    .line 637
    iget-boolean v2, v2, La/o4e;->f:Z

    .line 638
    .line 639
    if-eqz v2, :cond_1d

    .line 640
    .line 641
    goto :goto_11

    .line 642
    :cond_1d
    move-object/from16 v36, v7

    .line 643
    .line 644
    goto :goto_12

    .line 645
    :cond_1e
    :goto_11
    new-instance v2, La/laj;

    .line 646
    .line 647
    const/4 v14, 0x0

    .line 648
    invoke-direct {v2, v14}, La/laj;-><init>(B)V

    .line 649
    .line 650
    .line 651
    iget-object v14, v7, La/ppv0;->e:La/maj;

    .line 652
    .line 653
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    iget-object v14, v14, La/maj;->a:Ljava/util/HashMap;

    .line 657
    .line 658
    invoke-virtual {v2, v14}, La/laj;->c(Ljava/util/Map;)V

    .line 659
    .line 660
    .line 661
    const-string v14, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 662
    .line 663
    move-object/from16 v20, v5

    .line 664
    .line 665
    iget-object v5, v2, La/laj;->a:Ljava/util/LinkedHashMap;

    .line 666
    .line 667
    invoke-interface {v5, v14, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2}, La/laj;->a()La/maj;

    .line 671
    .line 672
    .line 673
    move-result-object v40

    .line 674
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v39

    .line 678
    const/16 v48, 0x0

    .line 679
    .line 680
    const v49, 0x1ffffeb

    .line 681
    .line 682
    .line 683
    const/16 v37, 0x0

    .line 684
    .line 685
    const/16 v38, 0x0

    .line 686
    .line 687
    const/16 v41, 0x0

    .line 688
    .line 689
    const-wide/16 v42, 0x0

    .line 690
    .line 691
    const/16 v44, 0x0

    .line 692
    .line 693
    const/16 v45, 0x0

    .line 694
    .line 695
    const-wide/16 v46, 0x0

    .line 696
    .line 697
    move-object/from16 v36, v7

    .line 698
    .line 699
    invoke-static/range {v36 .. v49}, La/ppv0;->b(La/ppv0;Ljava/lang/String;La/zov0;Ljava/lang/String;La/maj;IJIIJII)La/ppv0;

    .line 700
    .line 701
    .line 702
    move-result-object v7

    .line 703
    goto :goto_13

    .line 704
    :goto_12
    move-object/from16 v7, v36

    .line 705
    .line 706
    :goto_13
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    iget-object v2, v11, La/upv0;->a:La/aeg0;

    .line 710
    .line 711
    new-instance v4, La/zfv0;

    .line 712
    .line 713
    const/16 v5, 0xa

    .line 714
    .line 715
    invoke-direct {v4, v11, v7, v5}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 716
    .line 717
    .line 718
    const/4 v7, 0x1

    .line 719
    const/4 v14, 0x0

    .line 720
    invoke-static {v2, v14, v7, v4}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    const/16 v2, 0xb

    .line 724
    .line 725
    if-eqz v12, :cond_1f

    .line 726
    .line 727
    array-length v4, v1

    .line 728
    const/4 v7, 0x0

    .line 729
    :goto_14
    if-ge v7, v4, :cond_1f

    .line 730
    .line 731
    aget-object v11, v1, v7

    .line 732
    .line 733
    new-instance v14, La/b7k;

    .line 734
    .line 735
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v5

    .line 739
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    invoke-direct {v14, v5, v11}, La/b7k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->s()La/g7k;

    .line 746
    .line 747
    .line 748
    move-result-object v5

    .line 749
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    iget-object v11, v5, La/g7k;->a:La/aeg0;

    .line 753
    .line 754
    move-object/from16 v20, v1

    .line 755
    .line 756
    new-instance v1, La/ngh;

    .line 757
    .line 758
    invoke-direct {v1, v5, v14, v2}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 759
    .line 760
    .line 761
    const/4 v5, 0x1

    .line 762
    const/4 v14, 0x0

    .line 763
    invoke-static {v11, v14, v5, v1}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    add-int/lit8 v7, v7, 0x1

    .line 767
    .line 768
    move-object/from16 v1, v20

    .line 769
    .line 770
    const/16 v5, 0xa

    .line 771
    .line 772
    goto :goto_14

    .line 773
    :cond_1f
    move-object/from16 v20, v1

    .line 774
    .line 775
    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->z()La/zpv0;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    iget-object v3, v3, La/lpv0;->c:Ljava/util/Set;

    .line 787
    .line 788
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    check-cast v3, Ljava/lang/Iterable;

    .line 795
    .line 796
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 801
    .line 802
    .line 803
    move-result v5

    .line 804
    if-eqz v5, :cond_20

    .line 805
    .line 806
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v5

    .line 810
    check-cast v5, Ljava/lang/String;

    .line 811
    .line 812
    new-instance v7, La/ypv0;

    .line 813
    .line 814
    invoke-direct {v7, v5, v4}, La/ypv0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    iget-object v5, v1, La/zpv0;->a:La/aeg0;

    .line 818
    .line 819
    new-instance v11, La/zfv0;

    .line 820
    .line 821
    invoke-direct {v11, v1, v7, v2}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 822
    .line 823
    .line 824
    const/4 v7, 0x1

    .line 825
    const/4 v14, 0x0

    .line 826
    invoke-static {v5, v14, v7, v11}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    goto :goto_15

    .line 830
    :cond_20
    if-nez v35, :cond_21

    .line 831
    .line 832
    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->w()La/hpv0;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    new-instance v2, La/gpv0;

    .line 837
    .line 838
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v3

    .line 845
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    invoke-direct {v2, v6, v3}, La/gpv0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    iget-object v3, v1, La/hpv0;->a:La/aeg0;

    .line 855
    .line 856
    new-instance v4, La/zfv0;

    .line 857
    .line 858
    const/4 v5, 0x7

    .line 859
    invoke-direct {v4, v1, v2, v5}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 860
    .line 861
    .line 862
    const/4 v7, 0x1

    .line 863
    const/4 v14, 0x0

    .line 864
    invoke-static {v3, v14, v7, v4}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    goto :goto_16

    .line 868
    :cond_21
    const/4 v7, 0x1

    .line 869
    const/4 v14, 0x0

    .line 870
    :goto_16
    move-object/from16 v2, v18

    .line 871
    .line 872
    move-object/from16 v1, v20

    .line 873
    .line 874
    move-object/from16 v4, v34

    .line 875
    .line 876
    move/from16 v5, v35

    .line 877
    .line 878
    goto/16 :goto_e

    .line 879
    .line 880
    :cond_22
    const/4 v7, 0x1

    .line 881
    move v5, v13

    .line 882
    :goto_17
    iput-boolean v7, v0, La/qov0;->g:Z

    .line 883
    .line 884
    return v5
.end method
