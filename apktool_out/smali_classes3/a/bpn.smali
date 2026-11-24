.class public final La/bpn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic A:I

.field public final synthetic B:J

.field public final synthetic Y:Ljava/lang/String;

.field public final synthetic Z:Z

.field public final synthetic f1:J

.field public final synthetic g1:B

.field public final synthetic h1:Z

.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:La/cu;

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/Throwable;

.field public v:Z

.field public w:Z

.field public x:B

.field public final synthetic y:I

.field public final synthetic z:La/cu;


# direct methods
.method public constructor <init>(ILa/cu;IJLjava/lang/String;ZJIZLa/yje;)V
    .locals 0

    .line 1
    iput p1, p0, La/bpn;->y:I

    .line 2
    .line 3
    iput-object p2, p0, La/bpn;->z:La/cu;

    .line 4
    .line 5
    iput p3, p0, La/bpn;->A:I

    .line 6
    .line 7
    iput-wide p4, p0, La/bpn;->B:J

    .line 8
    .line 9
    iput-object p6, p0, La/bpn;->Y:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p7, p0, La/bpn;->Z:Z

    .line 12
    .line 13
    iput-wide p8, p0, La/bpn;->f1:J

    .line 14
    .line 15
    iput-byte p10, p0, La/bpn;->g1:B

    .line 16
    .line 17
    iput-boolean p11, p0, La/bpn;->h1:Z

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p12}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    new-instance v0, La/bpn;

    .line 2
    .line 3
    iget-byte v10, p0, La/bpn;->g1:B

    .line 4
    .line 5
    iget-boolean v11, p0, La/bpn;->h1:Z

    .line 6
    .line 7
    iget v1, p0, La/bpn;->y:I

    .line 8
    .line 9
    iget-object v2, p0, La/bpn;->z:La/cu;

    .line 10
    .line 11
    iget v3, p0, La/bpn;->A:I

    .line 12
    .line 13
    iget-wide v4, p0, La/bpn;->B:J

    .line 14
    .line 15
    iget-object v6, p0, La/bpn;->Y:Ljava/lang/String;

    .line 16
    .line 17
    iget-boolean v7, p0, La/bpn;->Z:Z

    .line 18
    .line 19
    iget-wide v8, p0, La/bpn;->f1:J

    .line 20
    .line 21
    move-object v12, p2

    .line 22
    invoke-direct/range {v0 .. v12}, La/bpn;-><init>(ILa/cu;IJLjava/lang/String;ZJIZLa/yje;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/bpn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/bpn;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/bpn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v1, La/bpn;->x:B

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v7, 0x1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-eq v0, v7, :cond_2

    .line 13
    .line 14
    if-eq v0, v4, :cond_1

    .line 15
    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    iget v0, v1, La/bpn;->r:I

    .line 19
    .line 20
    iget v8, v1, La/bpn;->q:I

    .line 21
    .line 22
    iget-boolean v9, v1, La/bpn;->w:Z

    .line 23
    .line 24
    iget v10, v1, La/bpn;->p:I

    .line 25
    .line 26
    iget-wide v11, v1, La/bpn;->l:J

    .line 27
    .line 28
    iget-boolean v13, v1, La/bpn;->v:Z

    .line 29
    .line 30
    iget-wide v14, v1, La/bpn;->k:J

    .line 31
    .line 32
    iget v5, v1, La/bpn;->o:I

    .line 33
    .line 34
    iget v3, v1, La/bpn;->n:I

    .line 35
    .line 36
    iget v4, v1, La/bpn;->m:I

    .line 37
    .line 38
    const/16 v16, 0x0

    .line 39
    .line 40
    iget-wide v6, v1, La/bpn;->j:J

    .line 41
    .line 42
    move/from16 v17, v3

    .line 43
    .line 44
    move/from16 v18, v4

    .line 45
    .line 46
    iget-wide v3, v1, La/bpn;->i:J

    .line 47
    .line 48
    move/from16 v19, v0

    .line 49
    .line 50
    iget-object v0, v1, La/bpn;->u:Ljava/lang/Throwable;

    .line 51
    .line 52
    move-object/from16 v20, v0

    .line 53
    .line 54
    iget-object v0, v1, La/bpn;->t:Ljava/lang/String;

    .line 55
    .line 56
    move-object/from16 v21, v0

    .line 57
    .line 58
    iget-object v0, v1, La/bpn;->s:La/cu;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v1, v2

    .line 64
    move/from16 v28, v10

    .line 65
    .line 66
    move-wide/from16 v26, v11

    .line 67
    .line 68
    move/from16 v25, v13

    .line 69
    .line 70
    move-wide/from16 v22, v14

    .line 71
    .line 72
    move/from16 v13, v18

    .line 73
    .line 74
    move-object/from16 v24, v21

    .line 75
    .line 76
    move/from16 v21, v5

    .line 77
    .line 78
    move v14, v9

    .line 79
    move-object v5, v0

    .line 80
    move/from16 v0, v19

    .line 81
    .line 82
    move/from16 v19, v17

    .line 83
    .line 84
    move-wide/from16 v42, v3

    .line 85
    .line 86
    move v4, v8

    .line 87
    move-wide v8, v6

    .line 88
    move-object/from16 v3, v20

    .line 89
    .line 90
    move-wide/from16 v6, v42

    .line 91
    .line 92
    goto/16 :goto_13

    .line 93
    .line 94
    :cond_0
    const/16 v16, 0x0

    .line 95
    .line 96
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 97
    .line 98
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v16

    .line 102
    :cond_1
    const/16 v16, 0x0

    .line 103
    .line 104
    iget v0, v1, La/bpn;->r:I

    .line 105
    .line 106
    iget v3, v1, La/bpn;->q:I

    .line 107
    .line 108
    iget-boolean v4, v1, La/bpn;->w:Z

    .line 109
    .line 110
    iget v5, v1, La/bpn;->p:I

    .line 111
    .line 112
    iget-wide v6, v1, La/bpn;->l:J

    .line 113
    .line 114
    iget-boolean v8, v1, La/bpn;->v:Z

    .line 115
    .line 116
    iget-wide v9, v1, La/bpn;->k:J

    .line 117
    .line 118
    iget v11, v1, La/bpn;->o:I

    .line 119
    .line 120
    iget v12, v1, La/bpn;->n:I

    .line 121
    .line 122
    iget v13, v1, La/bpn;->m:I

    .line 123
    .line 124
    iget-wide v14, v1, La/bpn;->j:J

    .line 125
    .line 126
    move/from16 v17, v3

    .line 127
    .line 128
    move/from16 v18, v4

    .line 129
    .line 130
    iget-wide v3, v1, La/bpn;->i:J

    .line 131
    .line 132
    move/from16 v19, v0

    .line 133
    .line 134
    iget-object v0, v1, La/bpn;->u:Ljava/lang/Throwable;

    .line 135
    .line 136
    move-object/from16 v20, v0

    .line 137
    .line 138
    iget-object v0, v1, La/bpn;->t:Ljava/lang/String;

    .line 139
    .line 140
    move-object/from16 v21, v0

    .line 141
    .line 142
    iget-object v0, v1, La/bpn;->s:La/cu;

    .line 143
    .line 144
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move/from16 v28, v5

    .line 148
    .line 149
    move-wide/from16 v26, v6

    .line 150
    .line 151
    move/from16 v25, v8

    .line 152
    .line 153
    move-wide/from16 v22, v9

    .line 154
    .line 155
    move-wide v8, v14

    .line 156
    move/from16 v14, v18

    .line 157
    .line 158
    move-object/from16 v24, v21

    .line 159
    .line 160
    move-object v5, v0

    .line 161
    move-object v15, v2

    .line 162
    move-wide v6, v3

    .line 163
    move/from16 v21, v11

    .line 164
    .line 165
    move/from16 v4, v17

    .line 166
    .line 167
    move/from16 v0, v19

    .line 168
    .line 169
    move-object/from16 v3, v20

    .line 170
    .line 171
    :goto_0
    move/from16 v19, v12

    .line 172
    .line 173
    goto/16 :goto_f

    .line 174
    .line 175
    :cond_2
    const/16 v16, 0x0

    .line 176
    .line 177
    iget v3, v1, La/bpn;->q:I

    .line 178
    .line 179
    iget-boolean v4, v1, La/bpn;->w:Z

    .line 180
    .line 181
    iget v5, v1, La/bpn;->p:I

    .line 182
    .line 183
    iget-wide v6, v1, La/bpn;->l:J

    .line 184
    .line 185
    iget-boolean v8, v1, La/bpn;->v:Z

    .line 186
    .line 187
    iget-wide v9, v1, La/bpn;->k:J

    .line 188
    .line 189
    iget v11, v1, La/bpn;->o:I

    .line 190
    .line 191
    iget v12, v1, La/bpn;->n:I

    .line 192
    .line 193
    iget v13, v1, La/bpn;->m:I

    .line 194
    .line 195
    iget-wide v14, v1, La/bpn;->j:J

    .line 196
    .line 197
    move/from16 v17, v3

    .line 198
    .line 199
    move/from16 v18, v4

    .line 200
    .line 201
    iget-wide v3, v1, La/bpn;->i:J

    .line 202
    .line 203
    move-wide/from16 v19, v3

    .line 204
    .line 205
    iget-object v3, v1, La/bpn;->u:Ljava/lang/Throwable;

    .line 206
    .line 207
    iget-object v4, v1, La/bpn;->t:Ljava/lang/String;

    .line 208
    .line 209
    move-object/from16 v21, v3

    .line 210
    .line 211
    iget-object v3, v1, La/bpn;->s:La/cu;

    .line 212
    .line 213
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    .line 215
    .line 216
    move-object/from16 v0, p1

    .line 217
    .line 218
    move-wide/from16 v26, v6

    .line 219
    .line 220
    move-wide/from16 v6, v19

    .line 221
    .line 222
    move/from16 v42, v11

    .line 223
    .line 224
    move-object v11, v4

    .line 225
    move/from16 v4, v18

    .line 226
    .line 227
    move-wide/from16 v18, v14

    .line 228
    .line 229
    move v14, v13

    .line 230
    move v13, v12

    .line 231
    move/from16 v12, v42

    .line 232
    .line 233
    goto/16 :goto_5

    .line 234
    .line 235
    :catchall_0
    move-exception v0

    .line 236
    move/from16 p1, v17

    .line 237
    .line 238
    move-object/from16 v17, v2

    .line 239
    .line 240
    move v2, v8

    .line 241
    move/from16 v39, v11

    .line 242
    .line 243
    move-object v11, v4

    .line 244
    move/from16 v4, p1

    .line 245
    .line 246
    move-wide/from16 v40, v9

    .line 247
    .line 248
    move/from16 v10, v39

    .line 249
    .line 250
    move-wide v8, v14

    .line 251
    move-wide/from16 v14, v40

    .line 252
    .line 253
    move/from16 v41, v5

    .line 254
    .line 255
    move-wide/from16 v39, v6

    .line 256
    .line 257
    move/from16 p1, v18

    .line 258
    .line 259
    move-wide/from16 v6, v19

    .line 260
    .line 261
    move-object v5, v3

    .line 262
    :goto_1
    move-object v3, v0

    .line 263
    move-object/from16 v0, v21

    .line 264
    .line 265
    goto/16 :goto_d

    .line 266
    .line 267
    :cond_3
    const/16 v16, 0x0

    .line 268
    .line 269
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    sget-wide v3, La/cag0;->a:J

    .line 273
    .line 274
    iget v0, v1, La/bpn;->y:I

    .line 275
    .line 276
    iget-object v5, v1, La/bpn;->z:La/cu;

    .line 277
    .line 278
    iget v6, v1, La/bpn;->A:I

    .line 279
    .line 280
    iget-wide v7, v1, La/bpn;->B:J

    .line 281
    .line 282
    iget-object v9, v1, La/bpn;->Y:Ljava/lang/String;

    .line 283
    .line 284
    iget-boolean v10, v1, La/bpn;->Z:Z

    .line 285
    .line 286
    iget-wide v11, v1, La/bpn;->f1:J

    .line 287
    .line 288
    iget-byte v13, v1, La/bpn;->g1:B

    .line 289
    .line 290
    iget-boolean v14, v1, La/bpn;->h1:Z

    .line 291
    .line 292
    const-wide/16 v17, 0x3

    .line 293
    .line 294
    move/from16 v19, v0

    .line 295
    .line 296
    move/from16 v21, v6

    .line 297
    .line 298
    move-wide/from16 v22, v7

    .line 299
    .line 300
    move-object/from16 v24, v9

    .line 301
    .line 302
    move/from16 v25, v10

    .line 303
    .line 304
    move-wide/from16 v26, v11

    .line 305
    .line 306
    move/from16 v28, v13

    .line 307
    .line 308
    move-wide/from16 v6, v17

    .line 309
    .line 310
    const/4 v0, 0x1

    .line 311
    const/4 v13, 0x1

    .line 312
    move-wide v8, v3

    .line 313
    move-object/from16 v3, v16

    .line 314
    .line 315
    const/4 v4, 0x0

    .line 316
    :goto_2
    if-eqz v0, :cond_12

    .line 317
    .line 318
    :try_start_1
    iget-object v10, v5, La/cu;->c:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v10, La/knf0;

    .line 321
    .line 322
    invoke-virtual {v10}, La/knf0;->b()I

    .line 323
    .line 324
    .line 325
    move-result v20

    .line 326
    iget-object v10, v5, La/cu;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v10, La/knf0;

    .line 329
    .line 330
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object v10, v5, La/cu;->c:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v10, La/knf0;

    .line 336
    .line 337
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    iget-object v10, v5, La/cu;->c:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v10, La/knf0;

    .line 343
    .line 344
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-static/range {v19 .. v28}, La/k7x;->H(IIIJLjava/lang/String;ZJI)La/jo20;

    .line 348
    .line 349
    .line 350
    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_a

    .line 351
    move/from16 p1, v19

    .line 352
    .line 353
    move/from16 v19, v4

    .line 354
    .line 355
    move/from16 v4, p1

    .line 356
    .line 357
    move-object/from16 v17, v2

    .line 358
    .line 359
    move-object/from16 v18, v10

    .line 360
    .line 361
    move/from16 p1, v14

    .line 362
    .line 363
    move/from16 v10, v21

    .line 364
    .line 365
    move-wide/from16 v14, v22

    .line 366
    .line 367
    move-object/from16 v11, v24

    .line 368
    .line 369
    move/from16 v2, v25

    .line 370
    .line 371
    move/from16 v12, v28

    .line 372
    .line 373
    move/from16 v20, v0

    .line 374
    .line 375
    :try_start_2
    iget-object v0, v5, La/cu;->d:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, La/vqc;

    .line 378
    .line 379
    if-eqz p1, :cond_4

    .line 380
    .line 381
    const-string v21, "Live"

    .line 382
    .line 383
    :goto_3
    move-object/from16 v29, v21

    .line 384
    .line 385
    goto :goto_4

    .line 386
    :catchall_1
    move-exception v0

    .line 387
    move/from16 v25, v2

    .line 388
    .line 389
    move-object/from16 v21, v3

    .line 390
    .line 391
    goto/16 :goto_8

    .line 392
    .line 393
    :cond_4
    const-string v21, "Line"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 394
    .line 395
    goto :goto_3

    .line 396
    :goto_4
    :try_start_3
    iput-object v5, v1, La/bpn;->s:La/cu;

    .line 397
    .line 398
    iput-object v11, v1, La/bpn;->t:Ljava/lang/String;

    .line 399
    .line 400
    iput-object v3, v1, La/bpn;->u:Ljava/lang/Throwable;

    .line 401
    .line 402
    iput-wide v6, v1, La/bpn;->i:J

    .line 403
    .line 404
    iput-wide v8, v1, La/bpn;->j:J

    .line 405
    .line 406
    iput v13, v1, La/bpn;->m:I

    .line 407
    .line 408
    iput v4, v1, La/bpn;->n:I

    .line 409
    .line 410
    iput v10, v1, La/bpn;->o:I

    .line 411
    .line 412
    iput-wide v14, v1, La/bpn;->k:J

    .line 413
    .line 414
    iput-boolean v2, v1, La/bpn;->v:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 415
    .line 416
    move/from16 v25, v2

    .line 417
    .line 418
    move-object/from16 v21, v3

    .line 419
    .line 420
    move-wide/from16 v2, v26

    .line 421
    .line 422
    :try_start_4
    iput-wide v2, v1, La/bpn;->l:J

    .line 423
    .line 424
    iput v12, v1, La/bpn;->p:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 425
    .line 426
    move-wide/from16 v26, v2

    .line 427
    .line 428
    move/from16 v2, p1

    .line 429
    .line 430
    :try_start_5
    iput-boolean v2, v1, La/bpn;->w:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 431
    .line 432
    move/from16 v3, v19

    .line 433
    .line 434
    :try_start_6
    iput v3, v1, La/bpn;->q:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 435
    .line 436
    move/from16 p1, v2

    .line 437
    .line 438
    move/from16 v2, v20

    .line 439
    .line 440
    :try_start_7
    iput v2, v1, La/bpn;->r:I

    .line 441
    .line 442
    const/4 v2, 0x1

    .line 443
    iput-byte v2, v1, La/bpn;->x:B
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 444
    .line 445
    :try_start_8
    iget-object v0, v0, La/vqc;->b:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, La/wgn;

    .line 448
    .line 449
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    check-cast v0, La/hon;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 454
    .line 455
    move/from16 v19, v3

    .line 456
    .line 457
    move-object/from16 v2, v18

    .line 458
    .line 459
    move-object/from16 v3, v29

    .line 460
    .line 461
    :try_start_9
    invoke-interface {v0, v3, v2, v1}, La/hon;->b(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 465
    move-object/from16 v2, v17

    .line 466
    .line 467
    if-ne v0, v2, :cond_5

    .line 468
    .line 469
    move-object v1, v2

    .line 470
    goto/16 :goto_12

    .line 471
    .line 472
    :cond_5
    move-object v3, v5

    .line 473
    move v5, v12

    .line 474
    move/from16 v17, v19

    .line 475
    .line 476
    move-wide/from16 v18, v8

    .line 477
    .line 478
    move v12, v10

    .line 479
    move-wide v9, v14

    .line 480
    move/from16 v8, v25

    .line 481
    .line 482
    move v14, v13

    .line 483
    move v13, v4

    .line 484
    move/from16 v4, p1

    .line 485
    .line 486
    :goto_5
    :try_start_a
    check-cast v0, La/dx5;

    .line 487
    .line 488
    iget-object v15, v0, La/dx5;->b:Ljava/lang/Object;

    .line 489
    .line 490
    if-eqz v15, :cond_8

    .line 491
    .line 492
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    check-cast v0, La/su10;

    .line 497
    .line 498
    iget-object v15, v0, La/su10;->C:Ljava/util/List;

    .line 499
    .line 500
    if-eqz v15, :cond_7

    .line 501
    .line 502
    if-eqz v4, :cond_6

    .line 503
    .line 504
    sget-object v15, La/sip;->c:La/sip;

    .line 505
    .line 506
    :goto_6
    move-object/from16 v29, v15

    .line 507
    .line 508
    goto :goto_7

    .line 509
    :catchall_2
    move-exception v0

    .line 510
    move-wide/from16 v39, v9

    .line 511
    .line 512
    move v10, v12

    .line 513
    move v12, v13

    .line 514
    move v13, v14

    .line 515
    move-wide/from16 v14, v39

    .line 516
    .line 517
    move/from16 p1, v4

    .line 518
    .line 519
    move/from16 v41, v5

    .line 520
    .line 521
    move/from16 v4, v17

    .line 522
    .line 523
    move-wide/from16 v39, v26

    .line 524
    .line 525
    move-object/from16 v17, v2

    .line 526
    .line 527
    move-object v5, v3

    .line 528
    move v2, v8

    .line 529
    move-wide/from16 v8, v18

    .line 530
    .line 531
    goto/16 :goto_1

    .line 532
    .line 533
    :cond_6
    sget-object v15, La/sip;->b:La/sip;

    .line 534
    .line 535
    goto :goto_6

    .line 536
    :goto_7
    const-string v36, ""

    .line 537
    .line 538
    const-wide/16 v37, 0x0

    .line 539
    .line 540
    const-wide/16 v30, 0x0

    .line 541
    .line 542
    const-wide/16 v32, 0x0

    .line 543
    .line 544
    const-wide/16 v34, 0x0

    .line 545
    .line 546
    move-object/from16 v28, v0

    .line 547
    .line 548
    invoke-static/range {v28 .. v38}, La/g7x;->t(La/su10;La/sip;JJJLjava/lang/String;J)La/nas;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    return-object v0

    .line 553
    :cond_7
    new-instance v0, La/ff5;

    .line 554
    .line 555
    move-object/from16 v15, v16

    .line 556
    .line 557
    invoke-direct {v0, v15}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    throw v0

    .line 561
    :cond_8
    new-instance v0, La/ff5;

    .line 562
    .line 563
    const/4 v15, 0x0

    .line 564
    invoke-direct {v0, v15}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 568
    :catchall_3
    move-exception v0

    .line 569
    :goto_8
    move-object/from16 v2, v17

    .line 570
    .line 571
    goto :goto_9

    .line 572
    :catchall_4
    move-exception v0

    .line 573
    move/from16 v19, v3

    .line 574
    .line 575
    goto :goto_8

    .line 576
    :goto_9
    move-object v3, v0

    .line 577
    move-object/from16 v17, v2

    .line 578
    .line 579
    :goto_a
    move/from16 v41, v12

    .line 580
    .line 581
    move-object/from16 v0, v21

    .line 582
    .line 583
    move/from16 v2, v25

    .line 584
    .line 585
    move-wide/from16 v39, v26

    .line 586
    .line 587
    move v12, v4

    .line 588
    move/from16 v4, v19

    .line 589
    .line 590
    goto :goto_d

    .line 591
    :catchall_5
    move-exception v0

    .line 592
    :goto_b
    move/from16 v19, v3

    .line 593
    .line 594
    :goto_c
    move-object/from16 v2, v17

    .line 595
    .line 596
    move-object v3, v0

    .line 597
    goto :goto_a

    .line 598
    :catchall_6
    move-exception v0

    .line 599
    move/from16 p1, v2

    .line 600
    .line 601
    goto :goto_b

    .line 602
    :catchall_7
    move-exception v0

    .line 603
    move/from16 p1, v2

    .line 604
    .line 605
    goto :goto_c

    .line 606
    :catchall_8
    move-exception v0

    .line 607
    move-wide/from16 v26, v2

    .line 608
    .line 609
    goto :goto_c

    .line 610
    :catchall_9
    move-exception v0

    .line 611
    move/from16 v25, v2

    .line 612
    .line 613
    move-object/from16 v21, v3

    .line 614
    .line 615
    goto :goto_c

    .line 616
    :catchall_a
    move-exception v0

    .line 617
    move/from16 p1, v19

    .line 618
    .line 619
    move/from16 v19, v4

    .line 620
    .line 621
    move/from16 v4, p1

    .line 622
    .line 623
    move/from16 p1, v14

    .line 624
    .line 625
    move/from16 v10, v21

    .line 626
    .line 627
    move-wide/from16 v14, v22

    .line 628
    .line 629
    move-object/from16 v11, v24

    .line 630
    .line 631
    move/from16 v12, v28

    .line 632
    .line 633
    move-object/from16 v21, v3

    .line 634
    .line 635
    goto :goto_9

    .line 636
    :goto_d
    invoke-static {v3}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 637
    .line 638
    .line 639
    move-result v18

    .line 640
    if-eqz v18, :cond_d

    .line 641
    .line 642
    if-nez v13, :cond_9

    .line 643
    .line 644
    new-instance v0, La/el50;

    .line 645
    .line 646
    invoke-direct {v0, v3}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 647
    .line 648
    .line 649
    move-object v3, v0

    .line 650
    move/from16 v25, v2

    .line 651
    .line 652
    move/from16 v21, v10

    .line 653
    .line 654
    move-object/from16 v24, v11

    .line 655
    .line 656
    move/from16 v19, v12

    .line 657
    .line 658
    move-wide/from16 v22, v14

    .line 659
    .line 660
    move-object/from16 v2, v17

    .line 661
    .line 662
    move-wide/from16 v26, v39

    .line 663
    .line 664
    move/from16 v28, v41

    .line 665
    .line 666
    const/4 v0, 0x0

    .line 667
    const/16 v16, 0x0

    .line 668
    .line 669
    move/from16 v14, p1

    .line 670
    .line 671
    goto/16 :goto_2

    .line 672
    .line 673
    :cond_9
    move/from16 v19, v2

    .line 674
    .line 675
    move-object/from16 v18, v3

    .line 676
    .line 677
    int-to-long v2, v4

    .line 678
    cmp-long v2, v2, v6

    .line 679
    .line 680
    if-gez v2, :cond_a

    .line 681
    .line 682
    const/4 v2, 0x1

    .line 683
    goto :goto_e

    .line 684
    :cond_a
    const/4 v2, 0x0

    .line 685
    :goto_e
    add-int/lit8 v4, v4, 0x1

    .line 686
    .line 687
    if-eqz v2, :cond_c

    .line 688
    .line 689
    iput-object v5, v1, La/bpn;->s:La/cu;

    .line 690
    .line 691
    iput-object v11, v1, La/bpn;->t:Ljava/lang/String;

    .line 692
    .line 693
    iput-object v0, v1, La/bpn;->u:Ljava/lang/Throwable;

    .line 694
    .line 695
    iput-wide v6, v1, La/bpn;->i:J

    .line 696
    .line 697
    iput-wide v8, v1, La/bpn;->j:J

    .line 698
    .line 699
    iput v13, v1, La/bpn;->m:I

    .line 700
    .line 701
    iput v12, v1, La/bpn;->n:I

    .line 702
    .line 703
    iput v10, v1, La/bpn;->o:I

    .line 704
    .line 705
    iput-wide v14, v1, La/bpn;->k:J

    .line 706
    .line 707
    move/from16 v3, v19

    .line 708
    .line 709
    iput-boolean v3, v1, La/bpn;->v:Z

    .line 710
    .line 711
    move-wide/from16 v19, v14

    .line 712
    .line 713
    move-wide/from16 v14, v39

    .line 714
    .line 715
    iput-wide v14, v1, La/bpn;->l:J

    .line 716
    .line 717
    move-wide/from16 v21, v14

    .line 718
    .line 719
    move/from16 v14, v41

    .line 720
    .line 721
    iput v14, v1, La/bpn;->p:I

    .line 722
    .line 723
    move/from16 v15, p1

    .line 724
    .line 725
    iput-boolean v15, v1, La/bpn;->w:Z

    .line 726
    .line 727
    iput v4, v1, La/bpn;->q:I

    .line 728
    .line 729
    iput v2, v1, La/bpn;->r:I

    .line 730
    .line 731
    move/from16 p1, v2

    .line 732
    .line 733
    const/4 v2, 0x2

    .line 734
    iput-byte v2, v1, La/bpn;->x:B

    .line 735
    .line 736
    invoke-static {v8, v9, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    move/from16 v23, v15

    .line 741
    .line 742
    move-object/from16 v15, v17

    .line 743
    .line 744
    if-ne v2, v15, :cond_b

    .line 745
    .line 746
    move-object v1, v15

    .line 747
    goto/16 :goto_12

    .line 748
    .line 749
    :cond_b
    move/from16 v25, v3

    .line 750
    .line 751
    move-object/from16 v24, v11

    .line 752
    .line 753
    move/from16 v28, v14

    .line 754
    .line 755
    move-wide/from16 v26, v21

    .line 756
    .line 757
    move/from16 v14, v23

    .line 758
    .line 759
    move-object v3, v0

    .line 760
    move/from16 v21, v10

    .line 761
    .line 762
    move-wide/from16 v22, v19

    .line 763
    .line 764
    move/from16 v0, p1

    .line 765
    .line 766
    goto/16 :goto_0

    .line 767
    .line 768
    :goto_f
    move-object v2, v15

    .line 769
    const/16 v16, 0x0

    .line 770
    .line 771
    goto/16 :goto_2

    .line 772
    .line 773
    :cond_c
    move/from16 v23, p1

    .line 774
    .line 775
    move/from16 p1, v2

    .line 776
    .line 777
    move/from16 v3, v19

    .line 778
    .line 779
    move-wide/from16 v21, v39

    .line 780
    .line 781
    move-wide/from16 v19, v14

    .line 782
    .line 783
    move-object/from16 v15, v17

    .line 784
    .line 785
    move/from16 v14, v41

    .line 786
    .line 787
    new-instance v0, La/el50;

    .line 788
    .line 789
    move-object/from16 v2, v18

    .line 790
    .line 791
    invoke-direct {v0, v2}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 792
    .line 793
    .line 794
    move/from16 v25, v3

    .line 795
    .line 796
    move-object/from16 v24, v11

    .line 797
    .line 798
    move/from16 v28, v14

    .line 799
    .line 800
    move-object v2, v15

    .line 801
    move-wide/from16 v26, v21

    .line 802
    .line 803
    move/from16 v14, v23

    .line 804
    .line 805
    const/16 v16, 0x0

    .line 806
    .line 807
    move-object v3, v0

    .line 808
    move/from16 v21, v10

    .line 809
    .line 810
    move-wide/from16 v22, v19

    .line 811
    .line 812
    move/from16 v0, p1

    .line 813
    .line 814
    :goto_10
    move/from16 v19, v12

    .line 815
    .line 816
    goto/16 :goto_2

    .line 817
    .line 818
    :cond_d
    move-object/from16 v19, v3

    .line 819
    .line 820
    move v3, v2

    .line 821
    move-object/from16 v2, v19

    .line 822
    .line 823
    move/from16 v23, p1

    .line 824
    .line 825
    move-wide/from16 v19, v14

    .line 826
    .line 827
    move-object/from16 v15, v17

    .line 828
    .line 829
    move-wide/from16 v21, v39

    .line 830
    .line 831
    move/from16 v14, v41

    .line 832
    .line 833
    invoke-static {v2}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 834
    .line 835
    .line 836
    move-result v17

    .line 837
    if-eqz v17, :cond_11

    .line 838
    .line 839
    move/from16 v18, v14

    .line 840
    .line 841
    move-object/from16 v17, v15

    .line 842
    .line 843
    int-to-long v14, v4

    .line 844
    cmp-long v14, v14, v6

    .line 845
    .line 846
    if-gez v14, :cond_e

    .line 847
    .line 848
    const/4 v14, 0x1

    .line 849
    goto :goto_11

    .line 850
    :cond_e
    const/4 v14, 0x0

    .line 851
    :goto_11
    add-int/lit8 v4, v4, 0x1

    .line 852
    .line 853
    if-eqz v14, :cond_10

    .line 854
    .line 855
    iput-object v5, v1, La/bpn;->s:La/cu;

    .line 856
    .line 857
    iput-object v11, v1, La/bpn;->t:Ljava/lang/String;

    .line 858
    .line 859
    iput-object v0, v1, La/bpn;->u:Ljava/lang/Throwable;

    .line 860
    .line 861
    iput-wide v6, v1, La/bpn;->i:J

    .line 862
    .line 863
    iput-wide v8, v1, La/bpn;->j:J

    .line 864
    .line 865
    iput v13, v1, La/bpn;->m:I

    .line 866
    .line 867
    iput v12, v1, La/bpn;->n:I

    .line 868
    .line 869
    iput v10, v1, La/bpn;->o:I

    .line 870
    .line 871
    move-object v15, v5

    .line 872
    move-wide/from16 v24, v6

    .line 873
    .line 874
    move-wide/from16 v5, v19

    .line 875
    .line 876
    iput-wide v5, v1, La/bpn;->k:J

    .line 877
    .line 878
    iput-boolean v3, v1, La/bpn;->v:Z

    .line 879
    .line 880
    move-wide/from16 v5, v21

    .line 881
    .line 882
    iput-wide v5, v1, La/bpn;->l:J

    .line 883
    .line 884
    move/from16 v7, v18

    .line 885
    .line 886
    iput v7, v1, La/bpn;->p:I

    .line 887
    .line 888
    move/from16 v2, v23

    .line 889
    .line 890
    iput-boolean v2, v1, La/bpn;->w:Z

    .line 891
    .line 892
    iput v4, v1, La/bpn;->q:I

    .line 893
    .line 894
    iput v14, v1, La/bpn;->r:I

    .line 895
    .line 896
    move/from16 v18, v3

    .line 897
    .line 898
    const/4 v3, 0x3

    .line 899
    iput-byte v3, v1, La/bpn;->x:B

    .line 900
    .line 901
    invoke-static {v8, v9, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    move-object/from16 v1, v17

    .line 906
    .line 907
    if-ne v3, v1, :cond_f

    .line 908
    .line 909
    :goto_12
    return-object v1

    .line 910
    :cond_f
    move-object v3, v0

    .line 911
    move-wide/from16 v26, v5

    .line 912
    .line 913
    move/from16 v28, v7

    .line 914
    .line 915
    move/from16 v21, v10

    .line 916
    .line 917
    move v0, v14

    .line 918
    move-object v5, v15

    .line 919
    move-wide/from16 v22, v19

    .line 920
    .line 921
    move-wide/from16 v6, v24

    .line 922
    .line 923
    move v14, v2

    .line 924
    move-object/from16 v24, v11

    .line 925
    .line 926
    move/from16 v19, v12

    .line 927
    .line 928
    move/from16 v25, v18

    .line 929
    .line 930
    :goto_13
    move-object v2, v1

    .line 931
    const/16 v16, 0x0

    .line 932
    .line 933
    move-object/from16 v1, p0

    .line 934
    .line 935
    goto/16 :goto_2

    .line 936
    .line 937
    :cond_10
    move-object v15, v5

    .line 938
    move-wide/from16 v24, v6

    .line 939
    .line 940
    move-object/from16 v1, v17

    .line 941
    .line 942
    move/from16 v7, v18

    .line 943
    .line 944
    move-wide/from16 v5, v21

    .line 945
    .line 946
    move/from16 v18, v3

    .line 947
    .line 948
    new-instance v3, La/dag0;

    .line 949
    .line 950
    invoke-direct {v3, v2}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 951
    .line 952
    .line 953
    move-object v2, v1

    .line 954
    move-wide/from16 v26, v5

    .line 955
    .line 956
    move/from16 v28, v7

    .line 957
    .line 958
    move/from16 v21, v10

    .line 959
    .line 960
    move v0, v14

    .line 961
    move-object v5, v15

    .line 962
    move/from16 v14, v23

    .line 963
    .line 964
    move-wide/from16 v6, v24

    .line 965
    .line 966
    const/16 v16, 0x0

    .line 967
    .line 968
    move-object/from16 v1, p0

    .line 969
    .line 970
    move-object/from16 v24, v11

    .line 971
    .line 972
    move/from16 v25, v18

    .line 973
    .line 974
    move-wide/from16 v22, v19

    .line 975
    .line 976
    goto/16 :goto_10

    .line 977
    .line 978
    :cond_11
    move/from16 v18, v3

    .line 979
    .line 980
    move-wide/from16 v24, v6

    .line 981
    .line 982
    move v7, v14

    .line 983
    move-object v1, v15

    .line 984
    move-object v15, v5

    .line 985
    move-wide/from16 v5, v21

    .line 986
    .line 987
    invoke-static {v2}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 988
    .line 989
    .line 990
    move-object v3, v2

    .line 991
    move-wide/from16 v26, v5

    .line 992
    .line 993
    move/from16 v28, v7

    .line 994
    .line 995
    move/from16 v21, v10

    .line 996
    .line 997
    move-object v5, v15

    .line 998
    move/from16 v14, v23

    .line 999
    .line 1000
    move-wide/from16 v6, v24

    .line 1001
    .line 1002
    const/4 v0, 0x0

    .line 1003
    const/16 v16, 0x0

    .line 1004
    .line 1005
    move-object v2, v1

    .line 1006
    move-object/from16 v24, v11

    .line 1007
    .line 1008
    move/from16 v25, v18

    .line 1009
    .line 1010
    move-wide/from16 v22, v19

    .line 1011
    .line 1012
    move-object/from16 v1, p0

    .line 1013
    .line 1014
    goto/16 :goto_10

    .line 1015
    .line 1016
    :cond_12
    move-object/from16 v21, v3

    .line 1017
    .line 1018
    if-nez v21, :cond_13

    .line 1019
    .line 1020
    const-string v0, "Unexpected error"

    .line 1021
    .line 1022
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    const/16 v16, 0x0

    .line 1026
    .line 1027
    return-object v16

    .line 1028
    :cond_13
    throw v21
.end method
