.class public final La/imq;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Ljava/lang/Throwable;

.field public synthetic l:J

.field public final synthetic m:Lkotlin/jvm/functions/Function1;

.field public final synthetic n:J

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:I

.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;JLjava/lang/String;ILjava/util/List;Ljava/util/List;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/imq;->i:B

    iput-object p1, p0, La/imq;->m:Lkotlin/jvm/functions/Function1;

    iput-wide p2, p0, La/imq;->n:J

    iput-object p4, p0, La/imq;->o:Ljava/lang/String;

    iput p5, p0, La/imq;->p:I

    iput-object p6, p0, La/imq;->q:Ljava/util/List;

    iput-object p7, p0, La/imq;->r:Ljava/util/List;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/imq;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/imq;->r:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, v0, La/imq;->q:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, v0, La/imq;->m:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    iget-wide v8, v0, La/imq;->n:J

    .line 14
    .line 15
    iget-object v13, v0, La/imq;->o:Ljava/lang/String;

    .line 16
    .line 17
    const-string v14, "ALARM1 from "

    .line 18
    .line 19
    const-string v15, " // "

    .line 20
    .line 21
    const-string v7, " retry // delay "

    .line 22
    .line 23
    const-wide/16 v16, 0x3e8

    .line 24
    .line 25
    const-string v11, " sec "

    .line 26
    .line 27
    iget v12, v0, La/imq;->p:I

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, La/imq;->k:Ljava/lang/Throwable;

    .line 33
    .line 34
    move-object/from16 v18, v11

    .line 35
    .line 36
    iget-wide v10, v0, La/imq;->l:J

    .line 37
    .line 38
    sget-object v6, La/wne;->a:La/wne;

    .line 39
    .line 40
    move-object/from16 v19, v3

    .line 41
    .line 42
    iget-byte v3, v0, La/imq;->j:B

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    move-object/from16 v20, v5

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    if-eq v3, v5, :cond_1

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    if-ne v3, v0, :cond_0

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_9

    .line 58
    .line 59
    :cond_0
    invoke-static/range {v20 .. v20}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    goto/16 :goto_b

    .line 64
    .line 65
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    mul-long v2, v8, v16

    .line 85
    .line 86
    iput-object v1, v0, La/imq;->k:Ljava/lang/Throwable;

    .line 87
    .line 88
    iput-wide v10, v0, La/imq;->l:J

    .line 89
    .line 90
    const/4 v5, 0x1

    .line 91
    iput-byte v5, v0, La/imq;->j:B

    .line 92
    .line 93
    invoke-static {v2, v3, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-ne v0, v6, :cond_3

    .line 98
    .line 99
    goto/16 :goto_8

    .line 100
    .line 101
    :cond_3
    :goto_0
    invoke-static {v10, v11, v14, v13, v15}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    move-object/from16 v3, v18

    .line 106
    .line 107
    invoke-static {v0, v7, v8, v9, v3}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    int-to-long v0, v12

    .line 123
    cmp-long v0, v10, v0

    .line 124
    .line 125
    if-gez v0, :cond_4

    .line 126
    .line 127
    const/4 v6, 0x1

    .line 128
    goto :goto_1

    .line 129
    :cond_4
    const/4 v6, 0x0

    .line 130
    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    goto/16 :goto_b

    .line 135
    .line 136
    :cond_5
    move-object/from16 v3, v18

    .line 137
    .line 138
    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_7

    .line 147
    .line 148
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    move-object/from16 p1, v4

    .line 153
    .line 154
    move-object v4, v5

    .line 155
    check-cast v4, Ljava/lang/Class;

    .line 156
    .line 157
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_6

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    move-object/from16 v4, p1

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_7
    const/4 v5, 0x0

    .line 168
    :goto_3
    check-cast v5, Ljava/lang/Class;

    .line 169
    .line 170
    if-eqz v5, :cond_8

    .line 171
    .line 172
    invoke-virtual {v5, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    goto :goto_4

    .line 177
    :cond_8
    const/4 v4, 0x0

    .line 178
    :goto_4
    instance-of v5, v1, La/zhi0;

    .line 179
    .line 180
    if-eqz v5, :cond_b

    .line 181
    .line 182
    move-object v5, v1

    .line 183
    check-cast v5, La/zhi0;

    .line 184
    .line 185
    move/from16 p1, v4

    .line 186
    .line 187
    iget v4, v5, La/zhi0;->a:I

    .line 188
    .line 189
    invoke-static {v4, v2}, La/rz4;->C(ILjava/util/List;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-nez v2, :cond_a

    .line 194
    .line 195
    iget-boolean v2, v5, La/zhi0;->e:Z

    .line 196
    .line 197
    if-eqz v2, :cond_9

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_9
    :goto_5
    const/4 v2, 0x0

    .line 201
    goto :goto_7

    .line 202
    :cond_a
    :goto_6
    const/4 v2, 0x1

    .line 203
    goto :goto_7

    .line 204
    :cond_b
    move/from16 p1, v4

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :goto_7
    int-to-long v4, v12

    .line 208
    cmp-long v4, v10, v4

    .line 209
    .line 210
    if-gez v4, :cond_d

    .line 211
    .line 212
    if-nez p1, :cond_d

    .line 213
    .line 214
    if-nez v2, :cond_d

    .line 215
    .line 216
    invoke-static {v10, v11, v14, v13, v15}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-static {v2, v7, v8, v9, v3}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 231
    .line 232
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    mul-long v8, v8, v16

    .line 236
    .line 237
    const/4 v1, 0x0

    .line 238
    iput-object v1, v0, La/imq;->k:Ljava/lang/Throwable;

    .line 239
    .line 240
    iput-wide v10, v0, La/imq;->l:J

    .line 241
    .line 242
    const/4 v1, 0x2

    .line 243
    iput-byte v1, v0, La/imq;->j:B

    .line 244
    .line 245
    invoke-static {v8, v9, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-ne v0, v6, :cond_c

    .line 250
    .line 251
    :goto_8
    move-object v10, v6

    .line 252
    goto :goto_b

    .line 253
    :cond_c
    :goto_9
    const/4 v6, 0x1

    .line 254
    goto :goto_a

    .line 255
    :cond_d
    const/4 v6, 0x0

    .line 256
    :goto_a
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    :goto_b
    return-object v10

    .line 261
    :pswitch_0
    move-object/from16 v19, v3

    .line 262
    .line 263
    move-object/from16 v20, v5

    .line 264
    .line 265
    move-object v3, v11

    .line 266
    iget-object v1, v0, La/imq;->k:Ljava/lang/Throwable;

    .line 267
    .line 268
    iget-wide v5, v0, La/imq;->l:J

    .line 269
    .line 270
    sget-object v10, La/wne;->a:La/wne;

    .line 271
    .line 272
    iget-byte v11, v0, La/imq;->j:B

    .line 273
    .line 274
    if-eqz v11, :cond_10

    .line 275
    .line 276
    const/4 v2, 0x1

    .line 277
    if-eq v11, v2, :cond_f

    .line 278
    .line 279
    const/4 v0, 0x2

    .line 280
    if-ne v11, v0, :cond_e

    .line 281
    .line 282
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_12

    .line 286
    .line 287
    :cond_e
    invoke-static/range {v20 .. v20}, La/jf4;->n(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const/4 v10, 0x0

    .line 291
    goto/16 :goto_14

    .line 292
    .line 293
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    move v2, v12

    .line 297
    const/4 v4, 0x1

    .line 298
    goto :goto_c

    .line 299
    :cond_10
    move-object/from16 v18, v2

    .line 300
    .line 301
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    check-cast v2, Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_13

    .line 315
    .line 316
    move v2, v12

    .line 317
    mul-long v11, v8, v16

    .line 318
    .line 319
    iput-object v1, v0, La/imq;->k:Ljava/lang/Throwable;

    .line 320
    .line 321
    iput-wide v5, v0, La/imq;->l:J

    .line 322
    .line 323
    const/4 v4, 0x1

    .line 324
    iput-byte v4, v0, La/imq;->j:B

    .line 325
    .line 326
    invoke-static {v11, v12, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    if-ne v0, v10, :cond_11

    .line 331
    .line 332
    goto/16 :goto_14

    .line 333
    .line 334
    :cond_11
    :goto_c
    invoke-static {v5, v6, v14, v13, v15}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v0, v7, v8, v9, v3}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 349
    .line 350
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    int-to-long v0, v2

    .line 354
    cmp-long v0, v5, v0

    .line 355
    .line 356
    if-gez v0, :cond_12

    .line 357
    .line 358
    move v6, v4

    .line 359
    goto :goto_d

    .line 360
    :cond_12
    const/4 v6, 0x0

    .line 361
    :goto_d
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    goto/16 :goto_14

    .line 366
    .line 367
    :cond_13
    move v2, v12

    .line 368
    const/4 v4, 0x1

    .line 369
    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    :goto_e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    if-eqz v12, :cond_15

    .line 378
    .line 379
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    move-object v4, v12

    .line 384
    check-cast v4, Ljava/lang/Class;

    .line 385
    .line 386
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    if-eqz v4, :cond_14

    .line 391
    .line 392
    goto :goto_f

    .line 393
    :cond_14
    const/4 v4, 0x1

    .line 394
    goto :goto_e

    .line 395
    :cond_15
    const/4 v12, 0x0

    .line 396
    :goto_f
    check-cast v12, Ljava/lang/Class;

    .line 397
    .line 398
    if-eqz v12, :cond_16

    .line 399
    .line 400
    invoke-virtual {v12, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    goto :goto_10

    .line 405
    :cond_16
    const/4 v4, 0x0

    .line 406
    :goto_10
    instance-of v11, v1, La/zhi0;

    .line 407
    .line 408
    if-eqz v11, :cond_17

    .line 409
    .line 410
    move-object v11, v1

    .line 411
    check-cast v11, La/zhi0;

    .line 412
    .line 413
    iget v11, v11, La/zhi0;->a:I

    .line 414
    .line 415
    move-object/from16 v12, v18

    .line 416
    .line 417
    invoke-static {v11, v12}, La/rz4;->C(ILjava/util/List;)Z

    .line 418
    .line 419
    .line 420
    move-result v11

    .line 421
    move/from16 p1, v11

    .line 422
    .line 423
    goto :goto_11

    .line 424
    :cond_17
    const/16 p1, 0x0

    .line 425
    .line 426
    :goto_11
    int-to-long v11, v2

    .line 427
    cmp-long v2, v5, v11

    .line 428
    .line 429
    if-gez v2, :cond_19

    .line 430
    .line 431
    if-nez v4, :cond_19

    .line 432
    .line 433
    if-nez p1, :cond_19

    .line 434
    .line 435
    invoke-static {v5, v6, v14, v13, v15}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    invoke-static {v2, v7, v8, v9, v3}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 450
    .line 451
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    mul-long v8, v8, v16

    .line 455
    .line 456
    const/4 v1, 0x0

    .line 457
    iput-object v1, v0, La/imq;->k:Ljava/lang/Throwable;

    .line 458
    .line 459
    iput-wide v5, v0, La/imq;->l:J

    .line 460
    .line 461
    const/4 v1, 0x2

    .line 462
    iput-byte v1, v0, La/imq;->j:B

    .line 463
    .line 464
    invoke-static {v8, v9, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    if-ne v0, v10, :cond_18

    .line 469
    .line 470
    goto :goto_14

    .line 471
    :cond_18
    :goto_12
    const/4 v6, 0x1

    .line 472
    goto :goto_13

    .line 473
    :cond_19
    const/4 v6, 0x0

    .line 474
    :goto_13
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 475
    .line 476
    .line 477
    move-result-object v10

    .line 478
    :goto_14
    return-object v10

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/imq;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    move-object p1, p2

    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v0, p3

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    move-object/from16 v10, p4

    .line 19
    .line 20
    check-cast v10, La/yje;

    .line 21
    .line 22
    new-instance v2, La/imq;

    .line 23
    .line 24
    iget-object v9, p0, La/imq;->r:Ljava/util/List;

    .line 25
    .line 26
    const/4 v11, 0x1

    .line 27
    iget-object v3, p0, La/imq;->m:Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iget-wide v4, p0, La/imq;->n:J

    .line 30
    .line 31
    iget-object v6, p0, La/imq;->o:Ljava/lang/String;

    .line 32
    .line 33
    iget v7, p0, La/imq;->p:I

    .line 34
    .line 35
    iget-object v8, p0, La/imq;->q:Ljava/util/List;

    .line 36
    .line 37
    invoke-direct/range {v2 .. v11}, La/imq;-><init>(Lkotlin/jvm/functions/Function1;JLjava/lang/String;ILjava/util/List;Ljava/util/List;La/yje;B)V

    .line 38
    .line 39
    .line 40
    iput-object p1, v2, La/imq;->k:Ljava/lang/Throwable;

    .line 41
    .line 42
    iput-wide v0, v2, La/imq;->l:J

    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    invoke-virtual {v2, p0}, La/imq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_0
    move-object v0, p3

    .line 52
    check-cast v0, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    move-object/from16 v10, p4

    .line 59
    .line 60
    check-cast v10, La/yje;

    .line 61
    .line 62
    new-instance v2, La/imq;

    .line 63
    .line 64
    iget-object v9, p0, La/imq;->r:Ljava/util/List;

    .line 65
    .line 66
    const/4 v11, 0x0

    .line 67
    iget-object v3, p0, La/imq;->m:Lkotlin/jvm/functions/Function1;

    .line 68
    .line 69
    iget-wide v4, p0, La/imq;->n:J

    .line 70
    .line 71
    iget-object v6, p0, La/imq;->o:Ljava/lang/String;

    .line 72
    .line 73
    iget v7, p0, La/imq;->p:I

    .line 74
    .line 75
    iget-object v8, p0, La/imq;->q:Ljava/util/List;

    .line 76
    .line 77
    invoke-direct/range {v2 .. v11}, La/imq;-><init>(Lkotlin/jvm/functions/Function1;JLjava/lang/String;ILjava/util/List;Ljava/util/List;La/yje;B)V

    .line 78
    .line 79
    .line 80
    iput-object p1, v2, La/imq;->k:Ljava/lang/Throwable;

    .line 81
    .line 82
    iput-wide v0, v2, La/imq;->l:J

    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {v2, p0}, La/imq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
