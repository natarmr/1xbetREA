.class public final La/apn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic A:Z

.field public final synthetic B:J

.field public final synthetic Y:Ljava/lang/String;

.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:La/cu;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/Throwable;

.field public t:Z

.field public u:Z

.field public v:B

.field public final synthetic w:La/cu;

.field public final synthetic x:J

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public constructor <init>(La/cu;JZIZJLjava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/apn;->w:La/cu;

    .line 2
    .line 3
    iput-wide p2, p0, La/apn;->x:J

    .line 4
    .line 5
    iput-boolean p4, p0, La/apn;->y:Z

    .line 6
    .line 7
    iput p5, p0, La/apn;->z:I

    .line 8
    .line 9
    iput-boolean p6, p0, La/apn;->A:Z

    .line 10
    .line 11
    iput-wide p7, p0, La/apn;->B:J

    .line 12
    .line 13
    iput-object p9, p0, La/apn;->Y:Ljava/lang/String;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/apn;

    .line 2
    .line 3
    iget-wide v7, p0, La/apn;->B:J

    .line 4
    .line 5
    iget-object v9, p0, La/apn;->Y:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/apn;->w:La/cu;

    .line 8
    .line 9
    iget-wide v2, p0, La/apn;->x:J

    .line 10
    .line 11
    iget-boolean v4, p0, La/apn;->y:Z

    .line 12
    .line 13
    iget v5, p0, La/apn;->z:I

    .line 14
    .line 15
    iget-boolean v6, p0, La/apn;->A:Z

    .line 16
    .line 17
    move-object v10, p2

    .line 18
    invoke-direct/range {v0 .. v10}, La/apn;-><init>(La/cu;JZIZJLjava/lang/String;La/yje;)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/apn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/apn;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/apn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v1, La/apn;->v:B

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
    iget v0, v1, La/apn;->p:I

    .line 19
    .line 20
    iget v8, v1, La/apn;->o:I

    .line 21
    .line 22
    iget-wide v9, v1, La/apn;->l:J

    .line 23
    .line 24
    iget-boolean v11, v1, La/apn;->u:Z

    .line 25
    .line 26
    iget v12, v1, La/apn;->n:I

    .line 27
    .line 28
    iget-boolean v13, v1, La/apn;->t:Z

    .line 29
    .line 30
    iget-wide v14, v1, La/apn;->k:J

    .line 31
    .line 32
    iget v6, v1, La/apn;->m:I

    .line 33
    .line 34
    iget-wide v3, v1, La/apn;->j:J

    .line 35
    .line 36
    move/from16 v17, v6

    .line 37
    .line 38
    const/16 v16, 0x0

    .line 39
    .line 40
    iget-wide v5, v1, La/apn;->i:J

    .line 41
    .line 42
    iget-object v7, v1, La/apn;->s:Ljava/lang/Throwable;

    .line 43
    .line 44
    move/from16 v18, v0

    .line 45
    .line 46
    iget-object v0, v1, La/apn;->r:Ljava/lang/String;

    .line 47
    .line 48
    move-object/from16 v19, v0

    .line 49
    .line 50
    iget-object v0, v1, La/apn;->q:La/cu;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v1, v2

    .line 56
    move-wide/from16 v20, v3

    .line 57
    .line 58
    move-wide/from16 v22, v5

    .line 59
    .line 60
    move-object v3, v7

    .line 61
    move v5, v8

    .line 62
    move-wide v7, v14

    .line 63
    move/from16 v6, v17

    .line 64
    .line 65
    move-object/from16 v14, v19

    .line 66
    .line 67
    move-object v4, v0

    .line 68
    move v15, v12

    .line 69
    move/from16 v0, v18

    .line 70
    .line 71
    move-wide/from16 v29, v9

    .line 72
    .line 73
    move v10, v11

    .line 74
    move-wide/from16 v11, v29

    .line 75
    .line 76
    move v9, v13

    .line 77
    goto/16 :goto_10

    .line 78
    .line 79
    :cond_0
    const/16 v16, 0x0

    .line 80
    .line 81
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v16

    .line 87
    :cond_1
    const/16 v16, 0x0

    .line 88
    .line 89
    iget v0, v1, La/apn;->p:I

    .line 90
    .line 91
    iget v3, v1, La/apn;->o:I

    .line 92
    .line 93
    iget-wide v4, v1, La/apn;->l:J

    .line 94
    .line 95
    iget-boolean v6, v1, La/apn;->u:Z

    .line 96
    .line 97
    iget v7, v1, La/apn;->n:I

    .line 98
    .line 99
    iget-boolean v8, v1, La/apn;->t:Z

    .line 100
    .line 101
    iget-wide v9, v1, La/apn;->k:J

    .line 102
    .line 103
    iget v11, v1, La/apn;->m:I

    .line 104
    .line 105
    iget-wide v12, v1, La/apn;->j:J

    .line 106
    .line 107
    iget-wide v14, v1, La/apn;->i:J

    .line 108
    .line 109
    move/from16 v17, v0

    .line 110
    .line 111
    iget-object v0, v1, La/apn;->s:Ljava/lang/Throwable;

    .line 112
    .line 113
    move-object/from16 v18, v0

    .line 114
    .line 115
    iget-object v0, v1, La/apn;->r:Ljava/lang/String;

    .line 116
    .line 117
    move-object/from16 v19, v0

    .line 118
    .line 119
    iget-object v0, v1, La/apn;->q:La/cu;

    .line 120
    .line 121
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-wide/from16 v20, v12

    .line 125
    .line 126
    move-wide/from16 v22, v14

    .line 127
    .line 128
    move-object/from16 v14, v19

    .line 129
    .line 130
    move v15, v7

    .line 131
    move-wide/from16 v29, v4

    .line 132
    .line 133
    move-object v4, v0

    .line 134
    move v5, v3

    .line 135
    move/from16 v0, v17

    .line 136
    .line 137
    move-object/from16 v3, v18

    .line 138
    .line 139
    move/from16 v31, v6

    .line 140
    .line 141
    move-object v6, v2

    .line 142
    move v2, v8

    .line 143
    move-wide v7, v9

    .line 144
    move v9, v11

    .line 145
    move-wide/from16 v11, v29

    .line 146
    .line 147
    move/from16 v10, v31

    .line 148
    .line 149
    goto/16 :goto_d

    .line 150
    .line 151
    :cond_2
    const/16 v16, 0x0

    .line 152
    .line 153
    iget v3, v1, La/apn;->o:I

    .line 154
    .line 155
    iget-wide v4, v1, La/apn;->l:J

    .line 156
    .line 157
    iget-boolean v6, v1, La/apn;->u:Z

    .line 158
    .line 159
    iget v7, v1, La/apn;->n:I

    .line 160
    .line 161
    iget-boolean v8, v1, La/apn;->t:Z

    .line 162
    .line 163
    iget-wide v9, v1, La/apn;->k:J

    .line 164
    .line 165
    iget v11, v1, La/apn;->m:I

    .line 166
    .line 167
    iget-wide v12, v1, La/apn;->j:J

    .line 168
    .line 169
    iget-wide v14, v1, La/apn;->i:J

    .line 170
    .line 171
    move/from16 v17, v3

    .line 172
    .line 173
    iget-object v3, v1, La/apn;->s:Ljava/lang/Throwable;

    .line 174
    .line 175
    move-object/from16 v18, v3

    .line 176
    .line 177
    iget-object v3, v1, La/apn;->r:Ljava/lang/String;

    .line 178
    .line 179
    move-object/from16 v19, v3

    .line 180
    .line 181
    iget-object v3, v1, La/apn;->q:La/cu;

    .line 182
    .line 183
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    .line 185
    .line 186
    move-object/from16 v0, p1

    .line 187
    .line 188
    move-wide/from16 v22, v14

    .line 189
    .line 190
    move-object/from16 v14, v19

    .line 191
    .line 192
    move-wide/from16 v19, v12

    .line 193
    .line 194
    move/from16 v29, v6

    .line 195
    .line 196
    move-object v6, v2

    .line 197
    const/4 v2, 0x1

    .line 198
    move-wide/from16 v30, v9

    .line 199
    .line 200
    move/from16 v10, v29

    .line 201
    .line 202
    move v9, v11

    .line 203
    move-wide/from16 v11, v30

    .line 204
    .line 205
    goto/16 :goto_5

    .line 206
    .line 207
    :catchall_0
    move-exception v0

    .line 208
    move-wide/from16 v25, v12

    .line 209
    .line 210
    move-wide/from16 v27, v14

    .line 211
    .line 212
    move-wide v13, v4

    .line 213
    move v15, v7

    .line 214
    move/from16 v5, v17

    .line 215
    .line 216
    move-object/from16 v7, v18

    .line 217
    .line 218
    move-object v4, v3

    .line 219
    move-object v3, v0

    .line 220
    move-object/from16 v0, v19

    .line 221
    .line 222
    move/from16 v29, v6

    .line 223
    .line 224
    move-object v6, v2

    .line 225
    const/4 v2, 0x1

    .line 226
    move-wide/from16 v30, v9

    .line 227
    .line 228
    move/from16 v10, v29

    .line 229
    .line 230
    move v9, v11

    .line 231
    move-wide/from16 v11, v30

    .line 232
    .line 233
    goto/16 :goto_b

    .line 234
    .line 235
    :cond_3
    const/16 v16, 0x0

    .line 236
    .line 237
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    sget-wide v3, La/cag0;->a:J

    .line 241
    .line 242
    iget-object v0, v1, La/apn;->w:La/cu;

    .line 243
    .line 244
    iget-wide v5, v1, La/apn;->x:J

    .line 245
    .line 246
    iget-boolean v7, v1, La/apn;->y:Z

    .line 247
    .line 248
    iget v8, v1, La/apn;->z:I

    .line 249
    .line 250
    iget-boolean v9, v1, La/apn;->A:Z

    .line 251
    .line 252
    iget-wide v10, v1, La/apn;->B:J

    .line 253
    .line 254
    iget-object v12, v1, La/apn;->Y:Ljava/lang/String;

    .line 255
    .line 256
    const-wide/16 v13, 0x3

    .line 257
    .line 258
    move-wide/from16 v20, v3

    .line 259
    .line 260
    move v15, v8

    .line 261
    move-wide/from16 v22, v13

    .line 262
    .line 263
    move-object/from16 v3, v16

    .line 264
    .line 265
    move-object v4, v0

    .line 266
    move-object v14, v12

    .line 267
    const/4 v0, 0x1

    .line 268
    move-wide v11, v10

    .line 269
    move v10, v9

    .line 270
    move v9, v7

    .line 271
    move-wide v7, v5

    .line 272
    const/4 v5, 0x0

    .line 273
    const/4 v6, 0x1

    .line 274
    :goto_0
    if-eqz v0, :cond_11

    .line 275
    .line 276
    :try_start_1
    iget-object v13, v4, La/cu;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v13, La/ap80;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    .line 279
    .line 280
    move/from16 p1, v6

    .line 281
    .line 282
    :try_start_2
    iget-object v6, v4, La/cu;->c:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v6, La/knf0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    .line 285
    .line 286
    :try_start_3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 287
    .line 288
    .line 289
    :try_start_4
    iget-object v6, v4, La/cu;->c:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v6, La/knf0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 292
    .line 293
    :try_start_5
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 294
    .line 295
    .line 296
    :try_start_6
    iget-object v6, v4, La/cu;->c:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v6, La/knf0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 299
    .line 300
    :try_start_7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 301
    .line 302
    .line 303
    :try_start_8
    iget-object v6, v4, La/cu;->c:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v6, La/knf0;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 306
    .line 307
    :try_start_9
    invoke-virtual {v6}, La/knf0;->e()Z

    .line 308
    .line 309
    .line 310
    move-result v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 311
    move-object/from16 v17, v13

    .line 312
    .line 313
    move v13, v6

    .line 314
    move-object/from16 v6, v17

    .line 315
    .line 316
    move-object/from16 v17, v2

    .line 317
    .line 318
    move/from16 v2, p1

    .line 319
    .line 320
    :try_start_a
    invoke-virtual/range {v6 .. v14}, La/ap80;->a(JZZJZLjava/lang/String;)Ljava/util/Map;

    .line 321
    .line 322
    .line 323
    move-result-object v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 324
    :try_start_b
    iget-object v13, v4, La/cu;->d:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v13, La/vqc;

    .line 327
    .line 328
    if-eqz v9, :cond_4

    .line 329
    .line 330
    const-string v18, "Live"

    .line 331
    .line 332
    :goto_1
    move-object/from16 v24, v18

    .line 333
    .line 334
    goto :goto_3

    .line 335
    :catchall_1
    move-exception v0

    .line 336
    move/from16 p1, v2

    .line 337
    .line 338
    move-object/from16 v18, v3

    .line 339
    .line 340
    move-object/from16 v19, v4

    .line 341
    .line 342
    move-object/from16 v6, v17

    .line 343
    .line 344
    :goto_2
    move-wide/from16 v3, v20

    .line 345
    .line 346
    goto/16 :goto_8

    .line 347
    .line 348
    :cond_4
    const-string v18, "Line"
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 349
    .line 350
    goto :goto_1

    .line 351
    :goto_3
    :try_start_c
    iput-object v4, v1, La/apn;->q:La/cu;

    .line 352
    .line 353
    iput-object v14, v1, La/apn;->r:Ljava/lang/String;

    .line 354
    .line 355
    iput-object v3, v1, La/apn;->s:Ljava/lang/Throwable;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 356
    .line 357
    move-object/from16 v18, v3

    .line 358
    .line 359
    move-object/from16 v19, v4

    .line 360
    .line 361
    move-wide/from16 v3, v22

    .line 362
    .line 363
    :try_start_d
    iput-wide v3, v1, La/apn;->i:J
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 364
    .line 365
    move-wide/from16 v22, v3

    .line 366
    .line 367
    move-wide/from16 v3, v20

    .line 368
    .line 369
    :try_start_e
    iput-wide v3, v1, La/apn;->j:J

    .line 370
    .line 371
    iput v2, v1, La/apn;->m:I

    .line 372
    .line 373
    iput-wide v7, v1, La/apn;->k:J

    .line 374
    .line 375
    iput-boolean v9, v1, La/apn;->t:Z

    .line 376
    .line 377
    iput v15, v1, La/apn;->n:I

    .line 378
    .line 379
    iput-boolean v10, v1, La/apn;->u:Z

    .line 380
    .line 381
    iput-wide v11, v1, La/apn;->l:J

    .line 382
    .line 383
    iput v5, v1, La/apn;->o:I

    .line 384
    .line 385
    iput v0, v1, La/apn;->p:I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 386
    .line 387
    move/from16 p1, v2

    .line 388
    .line 389
    const/4 v2, 0x1

    .line 390
    :try_start_f
    iput-byte v2, v1, La/apn;->v:B

    .line 391
    .line 392
    iget-object v0, v13, La/vqc;->b:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v0, La/wgn;

    .line 395
    .line 396
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, La/hon;

    .line 401
    .line 402
    move-object/from16 v13, v24

    .line 403
    .line 404
    invoke-interface {v0, v13, v6, v1}, La/hon;->a(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 408
    move-object/from16 v6, v17

    .line 409
    .line 410
    if-ne v0, v6, :cond_5

    .line 411
    .line 412
    :goto_4
    move-object v1, v6

    .line 413
    goto/16 :goto_f

    .line 414
    .line 415
    :cond_5
    move-wide/from16 v29, v3

    .line 416
    .line 417
    move-object/from16 v3, v19

    .line 418
    .line 419
    move-wide/from16 v19, v29

    .line 420
    .line 421
    move/from16 v17, v5

    .line 422
    .line 423
    move-wide v4, v11

    .line 424
    move-wide v11, v7

    .line 425
    move v8, v9

    .line 426
    move v7, v15

    .line 427
    move/from16 v9, p1

    .line 428
    .line 429
    :goto_5
    :try_start_10
    check-cast v0, La/q16;

    .line 430
    .line 431
    invoke-virtual {v0}, La/q16;->a()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, La/i0t;

    .line 436
    .line 437
    iget-object v13, v0, La/i0t;->m:Ljava/util/List;

    .line 438
    .line 439
    if-eqz v13, :cond_7

    .line 440
    .line 441
    if-eqz v8, :cond_6

    .line 442
    .line 443
    sget-object v13, La/sip;->c:La/sip;

    .line 444
    .line 445
    goto :goto_6

    .line 446
    :catchall_2
    move-exception v0

    .line 447
    move-object v15, v3

    .line 448
    move-object v3, v0

    .line 449
    move-object v0, v14

    .line 450
    move-wide v13, v4

    .line 451
    move-object v4, v15

    .line 452
    move v15, v7

    .line 453
    move/from16 v5, v17

    .line 454
    .line 455
    move-object/from16 v7, v18

    .line 456
    .line 457
    move-wide/from16 v25, v19

    .line 458
    .line 459
    move-wide/from16 v27, v22

    .line 460
    .line 461
    goto/16 :goto_b

    .line 462
    .line 463
    :cond_6
    sget-object v13, La/sip;->b:La/sip;

    .line 464
    .line 465
    :goto_6
    invoke-static {v0, v13}, La/e3c;->M(La/i0t;La/sip;)La/nas;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    return-object v0

    .line 470
    :cond_7
    new-instance v0, La/ff5;

    .line 471
    .line 472
    move-object/from16 v13, v16

    .line 473
    .line 474
    invoke-direct {v0, v13}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 478
    :goto_7
    move-wide/from16 v25, v3

    .line 479
    .line 480
    move-object/from16 v4, v19

    .line 481
    .line 482
    move-wide/from16 v27, v22

    .line 483
    .line 484
    move-object v3, v0

    .line 485
    move-object v0, v14

    .line 486
    move-wide v13, v11

    .line 487
    move-wide v11, v7

    .line 488
    move v8, v9

    .line 489
    move-object/from16 v7, v18

    .line 490
    .line 491
    move/from16 v9, p1

    .line 492
    .line 493
    goto :goto_b

    .line 494
    :catchall_3
    move-exception v0

    .line 495
    move-object/from16 v6, v17

    .line 496
    .line 497
    goto :goto_7

    .line 498
    :catchall_4
    move-exception v0

    .line 499
    move/from16 p1, v2

    .line 500
    .line 501
    move-object/from16 v6, v17

    .line 502
    .line 503
    :goto_8
    const/4 v2, 0x1

    .line 504
    goto :goto_7

    .line 505
    :catchall_5
    move-exception v0

    .line 506
    move/from16 p1, v2

    .line 507
    .line 508
    move-wide/from16 v22, v3

    .line 509
    .line 510
    :goto_9
    move-object/from16 v6, v17

    .line 511
    .line 512
    :goto_a
    move-wide/from16 v3, v20

    .line 513
    .line 514
    goto :goto_8

    .line 515
    :catchall_6
    move-exception v0

    .line 516
    move/from16 p1, v2

    .line 517
    .line 518
    move-object/from16 v18, v3

    .line 519
    .line 520
    move-object/from16 v19, v4

    .line 521
    .line 522
    goto :goto_9

    .line 523
    :catchall_7
    move-exception v0

    .line 524
    move-object v6, v2

    .line 525
    move-object/from16 v18, v3

    .line 526
    .line 527
    move-object/from16 v19, v4

    .line 528
    .line 529
    goto :goto_a

    .line 530
    :catchall_8
    move-exception v0

    .line 531
    move-object v6, v2

    .line 532
    move-object/from16 v18, v3

    .line 533
    .line 534
    move-object/from16 v19, v4

    .line 535
    .line 536
    goto/16 :goto_2

    .line 537
    .line 538
    :catchall_9
    move-exception v0

    .line 539
    move-object/from16 v18, v3

    .line 540
    .line 541
    move-object/from16 v19, v4

    .line 542
    .line 543
    move/from16 p1, v6

    .line 544
    .line 545
    move-wide/from16 v3, v20

    .line 546
    .line 547
    move-object v6, v2

    .line 548
    goto :goto_8

    .line 549
    :goto_b
    invoke-static {v3}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 550
    .line 551
    .line 552
    move-result v17

    .line 553
    if-eqz v17, :cond_c

    .line 554
    .line 555
    if-nez v9, :cond_8

    .line 556
    .line 557
    new-instance v7, La/el50;

    .line 558
    .line 559
    invoke-direct {v7, v3}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 560
    .line 561
    .line 562
    move-object v2, v6

    .line 563
    move-object v3, v7

    .line 564
    move v6, v9

    .line 565
    move-wide/from16 v20, v25

    .line 566
    .line 567
    move-wide/from16 v22, v27

    .line 568
    .line 569
    const/16 v16, 0x0

    .line 570
    .line 571
    move v9, v8

    .line 572
    move-wide v7, v11

    .line 573
    move-wide v11, v13

    .line 574
    move-object v14, v0

    .line 575
    const/4 v0, 0x0

    .line 576
    goto/16 :goto_0

    .line 577
    .line 578
    :cond_8
    move-object/from16 p1, v3

    .line 579
    .line 580
    int-to-long v2, v5

    .line 581
    move-wide/from16 v18, v2

    .line 582
    .line 583
    move-wide/from16 v2, v27

    .line 584
    .line 585
    cmp-long v17, v18, v2

    .line 586
    .line 587
    if-gez v17, :cond_9

    .line 588
    .line 589
    move/from16 v17, v5

    .line 590
    .line 591
    const/4 v5, 0x1

    .line 592
    goto :goto_c

    .line 593
    :cond_9
    move/from16 v17, v5

    .line 594
    .line 595
    const/4 v5, 0x0

    .line 596
    :goto_c
    move-object/from16 v19, v6

    .line 597
    .line 598
    add-int/lit8 v6, v17, 0x1

    .line 599
    .line 600
    if-eqz v5, :cond_b

    .line 601
    .line 602
    iput-object v4, v1, La/apn;->q:La/cu;

    .line 603
    .line 604
    iput-object v0, v1, La/apn;->r:Ljava/lang/String;

    .line 605
    .line 606
    iput-object v7, v1, La/apn;->s:Ljava/lang/Throwable;

    .line 607
    .line 608
    iput-wide v2, v1, La/apn;->i:J

    .line 609
    .line 610
    move-wide/from16 v20, v2

    .line 611
    .line 612
    move-wide/from16 v2, v25

    .line 613
    .line 614
    iput-wide v2, v1, La/apn;->j:J

    .line 615
    .line 616
    iput v9, v1, La/apn;->m:I

    .line 617
    .line 618
    iput-wide v11, v1, La/apn;->k:J

    .line 619
    .line 620
    iput-boolean v8, v1, La/apn;->t:Z

    .line 621
    .line 622
    iput v15, v1, La/apn;->n:I

    .line 623
    .line 624
    iput-boolean v10, v1, La/apn;->u:Z

    .line 625
    .line 626
    iput-wide v13, v1, La/apn;->l:J

    .line 627
    .line 628
    iput v6, v1, La/apn;->o:I

    .line 629
    .line 630
    iput v5, v1, La/apn;->p:I

    .line 631
    .line 632
    move/from16 v18, v5

    .line 633
    .line 634
    const/4 v5, 0x2

    .line 635
    iput-byte v5, v1, La/apn;->v:B

    .line 636
    .line 637
    invoke-static {v2, v3, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    move/from16 v17, v6

    .line 642
    .line 643
    move-object/from16 v6, v19

    .line 644
    .line 645
    if-ne v5, v6, :cond_a

    .line 646
    .line 647
    goto/16 :goto_4

    .line 648
    .line 649
    :cond_a
    move/from16 v5, v17

    .line 650
    .line 651
    move-wide/from16 v22, v20

    .line 652
    .line 653
    move-wide/from16 v20, v2

    .line 654
    .line 655
    move-object v3, v7

    .line 656
    move v2, v8

    .line 657
    move-wide v7, v11

    .line 658
    move-wide v11, v13

    .line 659
    move-object v14, v0

    .line 660
    move/from16 v0, v18

    .line 661
    .line 662
    :goto_d
    move/from16 v16, v9

    .line 663
    .line 664
    move v9, v2

    .line 665
    move-object v2, v6

    .line 666
    move/from16 v6, v16

    .line 667
    .line 668
    const/16 v16, 0x0

    .line 669
    .line 670
    goto/16 :goto_0

    .line 671
    .line 672
    :cond_b
    move-wide/from16 v20, v2

    .line 673
    .line 674
    move/from16 v18, v5

    .line 675
    .line 676
    move/from16 v17, v6

    .line 677
    .line 678
    move-object/from16 v6, v19

    .line 679
    .line 680
    move-wide/from16 v2, v25

    .line 681
    .line 682
    new-instance v5, La/el50;

    .line 683
    .line 684
    move-object/from16 v7, p1

    .line 685
    .line 686
    invoke-direct {v5, v7}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 687
    .line 688
    .line 689
    move-wide/from16 v22, v20

    .line 690
    .line 691
    const/16 v16, 0x0

    .line 692
    .line 693
    move-wide/from16 v20, v2

    .line 694
    .line 695
    move-object v3, v5

    .line 696
    move-object v2, v6

    .line 697
    move v6, v9

    .line 698
    move/from16 v5, v17

    .line 699
    .line 700
    move v9, v8

    .line 701
    move-wide v7, v11

    .line 702
    move-wide v11, v13

    .line 703
    move-object v14, v0

    .line 704
    move/from16 v0, v18

    .line 705
    .line 706
    goto/16 :goto_0

    .line 707
    .line 708
    :cond_c
    move/from16 v17, v5

    .line 709
    .line 710
    move-wide/from16 v20, v27

    .line 711
    .line 712
    move-object v5, v3

    .line 713
    move-wide/from16 v2, v25

    .line 714
    .line 715
    invoke-static {v5}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 716
    .line 717
    .line 718
    move-result v18

    .line 719
    if-eqz v18, :cond_10

    .line 720
    .line 721
    move-object/from16 p1, v5

    .line 722
    .line 723
    move-wide/from16 v18, v13

    .line 724
    .line 725
    move/from16 v5, v17

    .line 726
    .line 727
    int-to-long v13, v5

    .line 728
    cmp-long v13, v13, v20

    .line 729
    .line 730
    if-gez v13, :cond_d

    .line 731
    .line 732
    const/4 v13, 0x1

    .line 733
    goto :goto_e

    .line 734
    :cond_d
    const/4 v13, 0x0

    .line 735
    :goto_e
    add-int/lit8 v5, v5, 0x1

    .line 736
    .line 737
    if-eqz v13, :cond_f

    .line 738
    .line 739
    iput-object v4, v1, La/apn;->q:La/cu;

    .line 740
    .line 741
    iput-object v0, v1, La/apn;->r:Ljava/lang/String;

    .line 742
    .line 743
    iput-object v7, v1, La/apn;->s:Ljava/lang/Throwable;

    .line 744
    .line 745
    move-object/from16 v17, v6

    .line 746
    .line 747
    move-object v14, v7

    .line 748
    move-wide/from16 v6, v20

    .line 749
    .line 750
    iput-wide v6, v1, La/apn;->i:J

    .line 751
    .line 752
    iput-wide v2, v1, La/apn;->j:J

    .line 753
    .line 754
    iput v9, v1, La/apn;->m:I

    .line 755
    .line 756
    iput-wide v11, v1, La/apn;->k:J

    .line 757
    .line 758
    iput-boolean v8, v1, La/apn;->t:Z

    .line 759
    .line 760
    iput v15, v1, La/apn;->n:I

    .line 761
    .line 762
    iput-boolean v10, v1, La/apn;->u:Z

    .line 763
    .line 764
    move-wide/from16 v6, v18

    .line 765
    .line 766
    iput-wide v6, v1, La/apn;->l:J

    .line 767
    .line 768
    iput v5, v1, La/apn;->o:I

    .line 769
    .line 770
    iput v13, v1, La/apn;->p:I

    .line 771
    .line 772
    move-object/from16 v18, v4

    .line 773
    .line 774
    const/4 v4, 0x3

    .line 775
    iput-byte v4, v1, La/apn;->v:B

    .line 776
    .line 777
    invoke-static {v2, v3, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    move-object/from16 v1, v17

    .line 782
    .line 783
    if-ne v4, v1, :cond_e

    .line 784
    .line 785
    :goto_f
    return-object v1

    .line 786
    :cond_e
    move v4, v9

    .line 787
    move v9, v8

    .line 788
    move-wide/from16 v22, v6

    .line 789
    .line 790
    move v6, v4

    .line 791
    move-wide v7, v11

    .line 792
    move-wide/from16 v11, v22

    .line 793
    .line 794
    move-object/from16 v4, v18

    .line 795
    .line 796
    move-wide/from16 v22, v20

    .line 797
    .line 798
    move-wide/from16 v20, v2

    .line 799
    .line 800
    move-object v3, v14

    .line 801
    move-object v14, v0

    .line 802
    move v0, v13

    .line 803
    :goto_10
    move-object v2, v1

    .line 804
    const/16 v16, 0x0

    .line 805
    .line 806
    :goto_11
    move-object/from16 v1, p0

    .line 807
    .line 808
    goto/16 :goto_0

    .line 809
    .line 810
    :cond_f
    move-object v1, v6

    .line 811
    move-wide/from16 v6, v18

    .line 812
    .line 813
    move-object/from16 v18, v4

    .line 814
    .line 815
    new-instance v4, La/dag0;

    .line 816
    .line 817
    move-object/from16 v14, p1

    .line 818
    .line 819
    invoke-direct {v4, v14}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 820
    .line 821
    .line 822
    move v14, v9

    .line 823
    move v9, v8

    .line 824
    move-wide/from16 v22, v6

    .line 825
    .line 826
    move v6, v14

    .line 827
    move-wide v7, v11

    .line 828
    move-wide/from16 v11, v22

    .line 829
    .line 830
    move-object v14, v0

    .line 831
    move v0, v13

    .line 832
    move-wide/from16 v22, v20

    .line 833
    .line 834
    const/16 v16, 0x0

    .line 835
    .line 836
    move-wide/from16 v20, v2

    .line 837
    .line 838
    move-object v3, v4

    .line 839
    move-object/from16 v4, v18

    .line 840
    .line 841
    move-object v2, v1

    .line 842
    goto :goto_11

    .line 843
    :cond_10
    move-object/from16 v18, v4

    .line 844
    .line 845
    move-object v1, v6

    .line 846
    move-wide v6, v13

    .line 847
    move-object v14, v5

    .line 848
    move/from16 v5, v17

    .line 849
    .line 850
    invoke-static {v14}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 851
    .line 852
    .line 853
    move v4, v9

    .line 854
    move v9, v8

    .line 855
    move-wide/from16 v22, v6

    .line 856
    .line 857
    move v6, v4

    .line 858
    move-wide v7, v11

    .line 859
    move-wide/from16 v11, v22

    .line 860
    .line 861
    move-object/from16 v4, v18

    .line 862
    .line 863
    move-wide/from16 v22, v20

    .line 864
    .line 865
    const/16 v16, 0x0

    .line 866
    .line 867
    move-wide/from16 v20, v2

    .line 868
    .line 869
    move-object v3, v14

    .line 870
    move-object v14, v0

    .line 871
    move-object v2, v1

    .line 872
    const/4 v0, 0x0

    .line 873
    goto :goto_11

    .line 874
    :cond_11
    move-object/from16 v18, v3

    .line 875
    .line 876
    if-nez v18, :cond_12

    .line 877
    .line 878
    const-string v0, "Unexpected error"

    .line 879
    .line 880
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    const/16 v16, 0x0

    .line 884
    .line 885
    return-object v16

    .line 886
    :cond_12
    throw v18
.end method
