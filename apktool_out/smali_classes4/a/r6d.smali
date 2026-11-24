.class public final La/r6d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kmq;Ljava/util/List;Ljava/lang/Object;La/lie0;La/hie0;La/z2r0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/r6d;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/r6d;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/r6d;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/r6d;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/r6d;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, La/r6d;->f:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, La/r6d;->g:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Ljava/util/Set;La/kie0;La/vne;La/pxs0;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p3, 0x2

    iput-byte p3, p0, La/r6d;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r6d;->d:Ljava/lang/Object;

    iput-object p2, p0, La/r6d;->c:Ljava/lang/Object;

    iput-object p4, p0, La/r6d;->e:Ljava/lang/Object;

    iput-object p5, p0, La/r6d;->b:Ljava/lang/Object;

    iput-object p6, p0, La/r6d;->f:Ljava/lang/Object;

    iput-object p7, p0, La/r6d;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;La/hzb0;La/kmq;La/xdr;La/dby;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/r6d;->a:B

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r6d;->d:Ljava/lang/Object;

    iput-object p2, p0, La/r6d;->c:Ljava/lang/Object;

    iput-object p3, p0, La/r6d;->e:Ljava/lang/Object;

    iput-object p4, p0, La/r6d;->b:Ljava/lang/Object;

    iput-object p5, p0, La/r6d;->f:Ljava/lang/Object;

    iput-object p6, p0, La/r6d;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/r6d;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/r6d;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/r6d;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/r6d;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/r6d;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, La/r6d;->b:Ljava/lang/Object;

    .line 16
    .line 17
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    const/high16 v9, -0x80000000

    .line 20
    .line 21
    iget-object v10, v0, La/r6d;->c:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v12, 0x1

    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v2, p1

    .line 28
    .line 29
    check-cast v2, Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, La/r6d;->b(Ljava/util/List;La/yje;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :pswitch_0
    instance-of v2, v1, La/x2r0;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    move-object v2, v1

    .line 41
    check-cast v2, La/x2r0;

    .line 42
    .line 43
    iget v13, v2, La/x2r0;->j:I

    .line 44
    .line 45
    and-int v14, v13, v9

    .line 46
    .line 47
    if-eqz v14, :cond_0

    .line 48
    .line 49
    sub-int/2addr v13, v9

    .line 50
    iput v13, v2, La/x2r0;->j:I

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v2, La/x2r0;

    .line 54
    .line 55
    invoke-direct {v2, v0, v1}, La/x2r0;-><init>(La/r6d;La/yje;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    iget-object v0, v2, La/x2r0;->i:Ljava/lang/Object;

    .line 59
    .line 60
    sget-object v1, La/wne;->a:La/wne;

    .line 61
    .line 62
    iget v9, v2, La/x2r0;->j:I

    .line 63
    .line 64
    const/4 v13, 0x2

    .line 65
    if-eqz v9, :cond_3

    .line 66
    .line 67
    if-eq v9, v12, :cond_2

    .line 68
    .line 69
    if-ne v9, v13, :cond_1

    .line 70
    .line 71
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_14

    .line 75
    .line 76
    :cond_1
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v11, 0x0

    .line 80
    goto/16 :goto_15

    .line 81
    .line 82
    :cond_2
    iget-object v6, v2, La/x2r0;->q:Ljava/util/Collection;

    .line 83
    .line 84
    check-cast v6, Ljava/util/Collection;

    .line 85
    .line 86
    iget-object v7, v2, La/x2r0;->p:La/b4r0;

    .line 87
    .line 88
    iget-object v8, v2, La/x2r0;->o:Ljava/util/Iterator;

    .line 89
    .line 90
    iget-object v9, v2, La/x2r0;->n:Ljava/util/Collection;

    .line 91
    .line 92
    check-cast v9, Ljava/util/Collection;

    .line 93
    .line 94
    iget-object v14, v2, La/x2r0;->m:Ljava/util/List;

    .line 95
    .line 96
    iget-object v15, v2, La/x2r0;->l:La/kmq;

    .line 97
    .line 98
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object/from16 v30, v7

    .line 102
    .line 103
    move-object v7, v6

    .line 104
    move-object v6, v9

    .line 105
    move-object/from16 v9, v30

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    check-cast v7, La/kmq;

    .line 112
    .line 113
    move-object/from16 v0, p1

    .line 114
    .line 115
    check-cast v0, Ljava/util/List;

    .line 116
    .line 117
    check-cast v6, Ljava/util/List;

    .line 118
    .line 119
    new-instance v8, Ljava/util/ArrayList;

    .line 120
    .line 121
    const/16 v9, 0xa

    .line 122
    .line 123
    invoke-static {v6, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    move-object/from16 v30, v8

    .line 135
    .line 136
    move-object v8, v6

    .line 137
    move-object/from16 v6, v30

    .line 138
    .line 139
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-eqz v9, :cond_13

    .line 144
    .line 145
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    check-cast v9, La/b4r0;

    .line 150
    .line 151
    move-object v14, v5

    .line 152
    check-cast v14, La/z2r0;

    .line 153
    .line 154
    iget-object v14, v14, La/z2r0;->b:La/j3c;

    .line 155
    .line 156
    move-object v15, v14

    .line 157
    iget-wide v13, v9, La/b4r0;->a:J

    .line 158
    .line 159
    iget-wide v11, v9, La/b4r0;->b:J

    .line 160
    .line 161
    iput-object v7, v2, La/x2r0;->l:La/kmq;

    .line 162
    .line 163
    iput-object v0, v2, La/x2r0;->m:Ljava/util/List;

    .line 164
    .line 165
    move-object/from16 p1, v0

    .line 166
    .line 167
    move-object v0, v6

    .line 168
    check-cast v0, Ljava/util/Collection;

    .line 169
    .line 170
    iput-object v0, v2, La/x2r0;->n:Ljava/util/Collection;

    .line 171
    .line 172
    iput-object v8, v2, La/x2r0;->o:Ljava/util/Iterator;

    .line 173
    .line 174
    iput-object v9, v2, La/x2r0;->p:La/b4r0;

    .line 175
    .line 176
    iput-object v0, v2, La/x2r0;->q:Ljava/util/Collection;

    .line 177
    .line 178
    const/4 v0, 0x1

    .line 179
    iput v0, v2, La/x2r0;->j:I

    .line 180
    .line 181
    move-wide/from16 v17, v13

    .line 182
    .line 183
    move-object v14, v15

    .line 184
    move-wide/from16 v15, v17

    .line 185
    .line 186
    move-object/from16 v19, v2

    .line 187
    .line 188
    move-wide/from16 v17, v11

    .line 189
    .line 190
    invoke-virtual/range {v14 .. v19}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-ne v0, v1, :cond_4

    .line 195
    .line 196
    goto/16 :goto_13

    .line 197
    .line 198
    :cond_4
    move-object/from16 v14, p1

    .line 199
    .line 200
    move-object v15, v7

    .line 201
    move-object v7, v6

    .line 202
    :goto_2
    check-cast v0, La/ypl0;

    .line 203
    .line 204
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 205
    .line 206
    iget-object v11, v9, La/b4r0;->e:Ljava/util/List;

    .line 207
    .line 208
    new-instance v12, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    if-eqz v13, :cond_8

    .line 222
    .line 223
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    check-cast v13, La/nas;

    .line 228
    .line 229
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v16

    .line 233
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v17

    .line 237
    if-eqz v17, :cond_6

    .line 238
    .line 239
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v17

    .line 243
    move-object/from16 p1, v2

    .line 244
    .line 245
    move-object/from16 v2, v17

    .line 246
    .line 247
    check-cast v2, La/d0t;

    .line 248
    .line 249
    move-object/from16 v18, v3

    .line 250
    .line 251
    move-object/from16 v19, v4

    .line 252
    .line 253
    iget-wide v3, v13, La/nas;->a:J

    .line 254
    .line 255
    move-wide/from16 v20, v3

    .line 256
    .line 257
    iget-wide v2, v2, La/d0t;->a:J

    .line 258
    .line 259
    cmp-long v2, v20, v2

    .line 260
    .line 261
    if-nez v2, :cond_5

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_5
    move-object/from16 v2, p1

    .line 265
    .line 266
    move-object/from16 v3, v18

    .line 267
    .line 268
    move-object/from16 v4, v19

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_6
    move-object/from16 p1, v2

    .line 272
    .line 273
    move-object/from16 v18, v3

    .line 274
    .line 275
    move-object/from16 v19, v4

    .line 276
    .line 277
    const/16 v17, 0x0

    .line 278
    .line 279
    :goto_5
    move-object/from16 v2, v17

    .line 280
    .line 281
    check-cast v2, La/d0t;

    .line 282
    .line 283
    if-eqz v2, :cond_7

    .line 284
    .line 285
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    :cond_7
    move-object/from16 v2, p1

    .line 289
    .line 290
    move-object/from16 v3, v18

    .line 291
    .line 292
    move-object/from16 v4, v19

    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_8
    move-object/from16 p1, v2

    .line 296
    .line 297
    move-object/from16 v18, v3

    .line 298
    .line 299
    move-object/from16 v19, v4

    .line 300
    .line 301
    new-instance v20, La/eih;

    .line 302
    .line 303
    iget-wide v2, v9, La/b4r0;->a:J

    .line 304
    .line 305
    move-wide/from16 v21, v2

    .line 306
    .line 307
    iget-wide v2, v9, La/b4r0;->b:J

    .line 308
    .line 309
    iget-object v4, v9, La/b4r0;->c:Ljava/lang/String;

    .line 310
    .line 311
    const-wide/16 v16, 0x28

    .line 312
    .line 313
    cmp-long v11, v21, v16

    .line 314
    .line 315
    const-string v13, "/"

    .line 316
    .line 317
    move-wide/from16 v23, v2

    .line 318
    .line 319
    const-string v2, "https://"

    .line 320
    .line 321
    if-nez v11, :cond_d

    .line 322
    .line 323
    new-instance v11, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 326
    .line 327
    invoke-direct {v11, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    iget-object v3, v0, La/lel0;->a:Ljava/lang/String;

    .line 331
    .line 332
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 336
    .line 337
    .line 338
    move-result v26

    .line 339
    if-nez v26, :cond_9

    .line 340
    .line 341
    move-object/from16 v26, v4

    .line 342
    .line 343
    const/4 v4, 0x0

    .line 344
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 345
    .line 346
    .line 347
    move-object/from16 v29, v5

    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_9
    move-object/from16 v26, v4

    .line 351
    .line 352
    move-object/from16 v29, v5

    .line 353
    .line 354
    const/4 v4, 0x0

    .line 355
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v3, v5, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-nez v5, :cond_c

    .line 362
    .line 363
    invoke-static {v3, v2, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    if-eqz v5, :cond_a

    .line 368
    .line 369
    const/4 v5, 0x0

    .line 370
    goto :goto_7

    .line 371
    :cond_a
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    if-lez v4, :cond_b

    .line 376
    .line 377
    invoke-static {v11, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-nez v4, :cond_b

    .line 382
    .line 383
    const/16 v4, 0x2f

    .line 384
    .line 385
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    move/from16 v25, v4

    .line 389
    .line 390
    const/4 v5, 0x1

    .line 391
    goto :goto_6

    .line 392
    :cond_b
    const/4 v5, 0x1

    .line 393
    const/16 v25, 0x2f

    .line 394
    .line 395
    :goto_6
    new-array v4, v5, [C

    .line 396
    .line 397
    const/4 v5, 0x0

    .line 398
    aput-char v25, v4, v5

    .line 399
    .line 400
    invoke-static {v3, v4}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_c
    move v5, v4

    .line 409
    :goto_7
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    :goto_8
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    goto :goto_9

    .line 420
    :cond_d
    move-object/from16 v26, v4

    .line 421
    .line 422
    move-object/from16 v29, v5

    .line 423
    .line 424
    iget-object v3, v0, La/lel0;->a:Ljava/lang/String;

    .line 425
    .line 426
    :goto_9
    iget-wide v4, v9, La/b4r0;->a:J

    .line 427
    .line 428
    cmp-long v4, v4, v16

    .line 429
    .line 430
    if-nez v4, :cond_12

    .line 431
    .line 432
    new-instance v4, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 435
    .line 436
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    iget-object v0, v0, La/lel0;->j:Ljava/lang/String;

    .line 440
    .line 441
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 445
    .line 446
    .line 447
    move-result v5

    .line 448
    if-nez v5, :cond_e

    .line 449
    .line 450
    const/4 v5, 0x0

    .line 451
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 452
    .line 453
    .line 454
    goto :goto_d

    .line 455
    :cond_e
    const/4 v5, 0x0

    .line 456
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 457
    .line 458
    invoke-static {v0, v9, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 459
    .line 460
    .line 461
    move-result v9

    .line 462
    if-nez v9, :cond_11

    .line 463
    .line 464
    invoke-static {v0, v2, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    if-eqz v2, :cond_f

    .line 469
    .line 470
    const/4 v5, 0x0

    .line 471
    goto :goto_c

    .line 472
    :cond_f
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-lez v2, :cond_10

    .line 477
    .line 478
    invoke-static {v4, v13}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-nez v2, :cond_10

    .line 483
    .line 484
    const/16 v2, 0x2f

    .line 485
    .line 486
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    :goto_a
    const/4 v5, 0x1

    .line 490
    goto :goto_b

    .line 491
    :cond_10
    const/16 v2, 0x2f

    .line 492
    .line 493
    goto :goto_a

    .line 494
    :goto_b
    new-array v9, v5, [C

    .line 495
    .line 496
    const/4 v5, 0x0

    .line 497
    aput-char v2, v9, v5

    .line 498
    .line 499
    invoke-static {v0, v9}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    goto :goto_d

    .line 507
    :cond_11
    :goto_c
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    :goto_d
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    :goto_e
    move-object/from16 v27, v0

    .line 518
    .line 519
    move-object/from16 v28, v12

    .line 520
    .line 521
    move-object/from16 v25, v26

    .line 522
    .line 523
    move-object/from16 v26, v3

    .line 524
    .line 525
    goto :goto_f

    .line 526
    :cond_12
    iget-object v0, v0, La/lel0;->j:Ljava/lang/String;

    .line 527
    .line 528
    goto :goto_e

    .line 529
    :goto_f
    invoke-direct/range {v20 .. v28}, La/eih;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 530
    .line 531
    .line 532
    move-object/from16 v0, v20

    .line 533
    .line 534
    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-object/from16 v2, p1

    .line 538
    .line 539
    move-object v0, v14

    .line 540
    move-object v7, v15

    .line 541
    move-object/from16 v3, v18

    .line 542
    .line 543
    move-object/from16 v4, v19

    .line 544
    .line 545
    move-object/from16 v5, v29

    .line 546
    .line 547
    const/4 v12, 0x1

    .line 548
    const/4 v13, 0x2

    .line 549
    goto/16 :goto_1

    .line 550
    .line 551
    :cond_13
    move-object/from16 v18, v3

    .line 552
    .line 553
    move-object/from16 v19, v4

    .line 554
    .line 555
    check-cast v6, Ljava/util/List;

    .line 556
    .line 557
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 558
    .line 559
    instance-of v0, v10, La/g0g0;

    .line 560
    .line 561
    if-eqz v0, :cond_15

    .line 562
    .line 563
    invoke-static {v10}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    if-nez v3, :cond_14

    .line 568
    .line 569
    new-instance v3, Ljava/lang/Throwable;

    .line 570
    .line 571
    invoke-direct {v3}, Ljava/lang/Throwable;-><init>()V

    .line 572
    .line 573
    .line 574
    :cond_14
    new-instance v4, La/g0g0;

    .line 575
    .line 576
    invoke-direct {v4, v3}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 577
    .line 578
    .line 579
    move-object v9, v4

    .line 580
    goto :goto_10

    .line 581
    :cond_15
    move-object v9, v6

    .line 582
    :goto_10
    if-eqz v0, :cond_16

    .line 583
    .line 584
    :goto_11
    move-object v13, v6

    .line 585
    goto :goto_12

    .line 586
    :cond_16
    sget-object v6, La/iun;->a:La/iun;

    .line 587
    .line 588
    goto :goto_11

    .line 589
    :goto_12
    new-instance v8, La/c3g0;

    .line 590
    .line 591
    move-object/from16 v4, v19

    .line 592
    .line 593
    check-cast v4, La/lie0;

    .line 594
    .line 595
    iget-wide v10, v4, La/lie0;->a:J

    .line 596
    .line 597
    move-object/from16 v3, v18

    .line 598
    .line 599
    check-cast v3, La/hie0;

    .line 600
    .line 601
    iget-boolean v12, v3, La/hie0;->a:Z

    .line 602
    .line 603
    invoke-direct/range {v8 .. v13}, La/c3g0;-><init>(Ljava/lang/Object;JZLjava/util/List;)V

    .line 604
    .line 605
    .line 606
    const/4 v3, 0x0

    .line 607
    iput-object v3, v2, La/x2r0;->l:La/kmq;

    .line 608
    .line 609
    iput-object v3, v2, La/x2r0;->m:Ljava/util/List;

    .line 610
    .line 611
    iput-object v3, v2, La/x2r0;->n:Ljava/util/Collection;

    .line 612
    .line 613
    iput-object v3, v2, La/x2r0;->o:Ljava/util/Iterator;

    .line 614
    .line 615
    iput-object v3, v2, La/x2r0;->p:La/b4r0;

    .line 616
    .line 617
    iput-object v3, v2, La/x2r0;->q:Ljava/util/Collection;

    .line 618
    .line 619
    const/4 v0, 0x2

    .line 620
    iput v0, v2, La/x2r0;->j:I

    .line 621
    .line 622
    invoke-interface {v7, v8, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    if-ne v0, v1, :cond_17

    .line 627
    .line 628
    :goto_13
    move-object v11, v1

    .line 629
    goto :goto_15

    .line 630
    :cond_17
    :goto_14
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    :goto_15
    return-object v11

    .line 633
    :pswitch_1
    move-object/from16 v18, v3

    .line 634
    .line 635
    move-object/from16 v19, v4

    .line 636
    .line 637
    move-object/from16 v29, v5

    .line 638
    .line 639
    const/4 v3, 0x0

    .line 640
    instance-of v2, v1, La/q6d;

    .line 641
    .line 642
    if-eqz v2, :cond_18

    .line 643
    .line 644
    move-object v2, v1

    .line 645
    check-cast v2, La/q6d;

    .line 646
    .line 647
    iget v4, v2, La/q6d;->k:I

    .line 648
    .line 649
    and-int v5, v4, v9

    .line 650
    .line 651
    if-eqz v5, :cond_18

    .line 652
    .line 653
    sub-int/2addr v4, v9

    .line 654
    iput v4, v2, La/q6d;->k:I

    .line 655
    .line 656
    goto :goto_16

    .line 657
    :cond_18
    new-instance v2, La/q6d;

    .line 658
    .line 659
    invoke-direct {v2, v0, v1}, La/q6d;-><init>(La/r6d;La/yje;)V

    .line 660
    .line 661
    .line 662
    :goto_16
    iget-object v0, v2, La/q6d;->i:Ljava/lang/Object;

    .line 663
    .line 664
    sget-object v1, La/wne;->a:La/wne;

    .line 665
    .line 666
    iget v4, v2, La/q6d;->k:I

    .line 667
    .line 668
    if-eqz v4, :cond_1a

    .line 669
    .line 670
    const/4 v5, 0x1

    .line 671
    if-ne v4, v5, :cond_19

    .line 672
    .line 673
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    goto :goto_17

    .line 677
    :cond_19
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    move-object v11, v3

    .line 681
    goto :goto_18

    .line 682
    :cond_1a
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    check-cast v6, Lkotlin/coroutines/CoroutineContext;

    .line 686
    .line 687
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 688
    .line 689
    new-instance v11, La/uu3;

    .line 690
    .line 691
    move-object/from16 v12, v19

    .line 692
    .line 693
    check-cast v12, La/hzb0;

    .line 694
    .line 695
    move-object v13, v7

    .line 696
    check-cast v13, La/kmq;

    .line 697
    .line 698
    move-object/from16 v14, v18

    .line 699
    .line 700
    check-cast v14, La/xdr;

    .line 701
    .line 702
    move-object/from16 v16, v29

    .line 703
    .line 704
    check-cast v16, La/dby;

    .line 705
    .line 706
    const/16 v17, 0x0

    .line 707
    .line 708
    move-object/from16 v15, p1

    .line 709
    .line 710
    invoke-direct/range {v11 .. v17}, La/uu3;-><init>(La/hzb0;La/kmq;La/xdr;Ljava/lang/Object;La/dby;La/yje;)V

    .line 711
    .line 712
    .line 713
    const/4 v5, 0x1

    .line 714
    iput v5, v2, La/q6d;->k:I

    .line 715
    .line 716
    invoke-static {v6, v0, v10, v11, v2}, La/ntb;->d0(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    if-ne v0, v1, :cond_1b

    .line 721
    .line 722
    move-object v11, v1

    .line 723
    goto :goto_18

    .line 724
    :cond_1b
    :goto_17
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 725
    .line 726
    :goto_18
    return-object v11

    .line 727
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/util/List;La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/r6d;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    iget-object v1, p0, La/r6d;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/pxs0;

    .line 8
    .line 9
    instance-of v2, p2, La/oxs0;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v2, p2

    .line 14
    check-cast v2, La/oxs0;

    .line 15
    .line 16
    iget v3, v2, La/oxs0;->n:I

    .line 17
    .line 18
    const/high16 v4, -0x80000000

    .line 19
    .line 20
    and-int v5, v3, v4

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    iput v3, v2, La/oxs0;->n:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v2, La/oxs0;

    .line 29
    .line 30
    invoke-direct {v2, p0, p2}, La/oxs0;-><init>(La/r6d;La/yje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object p2, v2, La/oxs0;->l:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v3, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v4, v2, La/oxs0;->n:I

    .line 38
    .line 39
    const/4 v5, 0x3

    .line 40
    const/4 v6, 0x2

    .line 41
    const/4 v7, 0x1

    .line 42
    const/4 v8, 0x0

    .line 43
    if-eqz v4, :cond_4

    .line 44
    .line 45
    if-eq v4, v7, :cond_3

    .line 46
    .line 47
    if-eq v4, v6, :cond_2

    .line 48
    .line 49
    if-ne v4, v5, :cond_1

    .line 50
    .line 51
    iget-object p1, v2, La/oxs0;->k:La/o9c;

    .line 52
    .line 53
    iget-object v4, v2, La/oxs0;->i:Ljava/util/Iterator;

    .line 54
    .line 55
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v8

    .line 66
    :cond_2
    iget-object p1, v2, La/oxs0;->k:La/o9c;

    .line 67
    .line 68
    check-cast p1, Ljava/lang/Throwable;

    .line 69
    .line 70
    iget-object p1, v2, La/oxs0;->j:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v4, v2, La/oxs0;->i:Ljava/util/Iterator;

    .line 73
    .line 74
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_3
    iget-object p1, v2, La/oxs0;->k:La/o9c;

    .line 80
    .line 81
    check-cast p1, La/vne;

    .line 82
    .line 83
    iget-object p1, v2, La/oxs0;->j:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, v2, La/oxs0;->i:Ljava/util/Iterator;

    .line 86
    .line 87
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catchall_0
    move-exception p2

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    invoke-static {p2}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    move-object v9, v4

    .line 112
    check-cast v9, Ljava/lang/String;

    .line 113
    .line 114
    invoke-interface {v0, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    if-nez v9, :cond_5

    .line 119
    .line 120
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_7
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    move-object v4, p1

    .line 138
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-eqz p1, :cond_d

    .line 143
    .line 144
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Ljava/lang/String;

    .line 149
    .line 150
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    iget-object p2, p0, La/r6d;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p2, La/kie0;

    .line 156
    .line 157
    iget v9, p2, La/kie0;->a:I

    .line 158
    .line 159
    add-int/2addr v9, v7

    .line 160
    iput v9, p2, La/kie0;->a:I

    .line 161
    .line 162
    iget-object p2, p0, La/r6d;->f:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p2, Ljava/lang/String;

    .line 165
    .line 166
    iget-object v9, p0, La/r6d;->g:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v9, Ljava/lang/String;

    .line 169
    .line 170
    :try_start_1
    sget-object v10, La/j0g0;->b:La/e0g0;

    .line 171
    .line 172
    iput-object v4, v2, La/oxs0;->i:Ljava/util/Iterator;

    .line 173
    .line 174
    iput-object p1, v2, La/oxs0;->j:Ljava/lang/String;

    .line 175
    .line 176
    iput-object v8, v2, La/oxs0;->k:La/o9c;

    .line 177
    .line 178
    iput v7, v2, La/oxs0;->n:I

    .line 179
    .line 180
    invoke-virtual {v1, p1, p2, v9, v2}, La/pxs0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    if-ne p2, v3, :cond_9

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_9
    :goto_2
    check-cast p2, La/o9c;

    .line 188
    .line 189
    sget-object v9, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :goto_3
    sget-object v9, La/j0g0;->b:La/e0g0;

    .line 193
    .line 194
    new-instance v9, La/g0g0;

    .line 195
    .line 196
    invoke-direct {v9, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    move-object p2, v9

    .line 200
    :goto_4
    invoke-static {p2}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    if-nez v9, :cond_a

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_a
    iget-object p2, v1, La/pxs0;->a:La/azk;

    .line 208
    .line 209
    invoke-virtual {v9}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    const-string v10, "cause "

    .line 214
    .line 215
    invoke-static {v10, v9}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    iput-object v4, v2, La/oxs0;->i:Ljava/util/Iterator;

    .line 220
    .line 221
    iput-object p1, v2, La/oxs0;->j:Ljava/lang/String;

    .line 222
    .line 223
    iput-object v8, v2, La/oxs0;->k:La/o9c;

    .line 224
    .line 225
    iput v6, v2, La/oxs0;->n:I

    .line 226
    .line 227
    check-cast p2, La/o8f;

    .line 228
    .line 229
    const/4 v10, 0x0

    .line 230
    invoke-virtual {p2, v2, v9, v10}, La/o8f;->c(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    if-ne p2, v3, :cond_b

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_b
    :goto_5
    new-instance p2, La/o9c;

    .line 238
    .line 239
    invoke-direct {p2, p1, v7}, La/o9c;-><init>(Ljava/lang/String;Z)V

    .line 240
    .line 241
    .line 242
    :goto_6
    move-object p1, p2

    .line 243
    check-cast p1, La/o9c;

    .line 244
    .line 245
    iget-object p2, v1, La/pxs0;->g:La/qoj0;

    .line 246
    .line 247
    new-instance v9, La/czk;

    .line 248
    .line 249
    invoke-direct {v9, p1}, La/czk;-><init>(La/o9c;)V

    .line 250
    .line 251
    .line 252
    iput-object v4, v2, La/oxs0;->i:Ljava/util/Iterator;

    .line 253
    .line 254
    iput-object v8, v2, La/oxs0;->j:Ljava/lang/String;

    .line 255
    .line 256
    iput-object p1, v2, La/oxs0;->k:La/o9c;

    .line 257
    .line 258
    iput v5, v2, La/oxs0;->n:I

    .line 259
    .line 260
    invoke-virtual {p2, v9, v2}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    if-ne p2, v3, :cond_c

    .line 265
    .line 266
    :goto_7
    return-object v3

    .line 267
    :cond_c
    :goto_8
    invoke-virtual {p1}, La/o9c;->getBanned()Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    if-nez p1, :cond_8

    .line 272
    .line 273
    iget-object p0, p0, La/r6d;->b:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 276
    .line 277
    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 278
    .line 279
    .line 280
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object p0
.end method
