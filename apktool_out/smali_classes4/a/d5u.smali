.class public final La/d5u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/q5u;

.field public final synthetic m:J

.field public final synthetic n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public o:La/kmq;

.field public p:Ljava/util/List;

.field public q:La/gmq;

.field public r:La/gmq;

.field public s:La/gmq;

.field public t:La/gmq;

.field public u:La/gmq;

.field public v:La/gmq;

.field public w:La/gmq;

.field public x:I

.field public y:Z


# direct methods
.method public constructor <init>(La/yje;La/q5u;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/d5u;->l:La/q5u;

    .line 2
    .line 3
    iput-wide p3, p0, La/d5u;->m:J

    .line 4
    .line 5
    iput-object p5, p0, La/d5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/d5u;

    .line 7
    .line 8
    iget-wide v3, p0, La/d5u;->m:J

    .line 9
    .line 10
    iget-object v5, p0, La/d5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 11
    .line 12
    iget-object v2, p0, La/d5u;->l:La/q5u;

    .line 13
    .line 14
    invoke-direct/range {v0 .. v5}, La/d5u;-><init>(La/yje;La/q5u;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/d5u;->j:La/kmq;

    .line 18
    .line 19
    iput-object p2, v0, La/d5u;->k:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, La/d5u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v5, La/d5u;->i:B

    .line 6
    .line 7
    const/4 v9, 0x3

    .line 8
    const/4 v10, 0x2

    .line 9
    const/4 v11, 0x1

    .line 10
    iget-object v13, v5, La/d5u;->l:La/q5u;

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0

    .line 23
    :pswitch_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_10

    .line 27
    .line 28
    :pswitch_1
    iget-boolean v0, v5, La/d5u;->y:Z

    .line 29
    .line 30
    iget-object v1, v5, La/d5u;->w:La/gmq;

    .line 31
    .line 32
    check-cast v1, La/gmq;

    .line 33
    .line 34
    iget-object v2, v5, La/d5u;->v:La/gmq;

    .line 35
    .line 36
    check-cast v2, La/gmq;

    .line 37
    .line 38
    iget-object v3, v5, La/d5u;->u:La/gmq;

    .line 39
    .line 40
    check-cast v3, La/gmq;

    .line 41
    .line 42
    iget-object v4, v5, La/d5u;->t:La/gmq;

    .line 43
    .line 44
    check-cast v4, La/gmq;

    .line 45
    .line 46
    iget-object v13, v5, La/d5u;->s:La/gmq;

    .line 47
    .line 48
    check-cast v13, La/gmq;

    .line 49
    .line 50
    iget-object v14, v5, La/d5u;->r:La/gmq;

    .line 51
    .line 52
    check-cast v14, La/gmq;

    .line 53
    .line 54
    iget-object v15, v5, La/d5u;->q:La/gmq;

    .line 55
    .line 56
    check-cast v15, La/gmq;

    .line 57
    .line 58
    iget-object v7, v5, La/d5u;->p:Ljava/util/List;

    .line 59
    .line 60
    iget-object v8, v5, La/d5u;->o:La/kmq;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move/from16 v20, v9

    .line 66
    .line 67
    move-object/from16 v22, v14

    .line 68
    .line 69
    move-object v9, v8

    .line 70
    move-object v14, v12

    .line 71
    move-object v8, v7

    .line 72
    move v7, v0

    .line 73
    move-object/from16 v0, p1

    .line 74
    .line 75
    goto/16 :goto_e

    .line 76
    .line 77
    :pswitch_2
    iget-boolean v0, v5, La/d5u;->y:Z

    .line 78
    .line 79
    iget v1, v5, La/d5u;->x:I

    .line 80
    .line 81
    iget-object v2, v5, La/d5u;->s:La/gmq;

    .line 82
    .line 83
    check-cast v2, La/gmq;

    .line 84
    .line 85
    iget-object v3, v5, La/d5u;->r:La/gmq;

    .line 86
    .line 87
    check-cast v3, La/gmq;

    .line 88
    .line 89
    iget-object v4, v5, La/d5u;->q:La/gmq;

    .line 90
    .line 91
    check-cast v4, La/gmq;

    .line 92
    .line 93
    iget-object v7, v5, La/d5u;->p:Ljava/util/List;

    .line 94
    .line 95
    iget-object v8, v5, La/d5u;->o:La/kmq;

    .line 96
    .line 97
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object/from16 v21, v2

    .line 101
    .line 102
    move-object/from16 v22, v3

    .line 103
    .line 104
    move-object/from16 v23, v4

    .line 105
    .line 106
    move/from16 v20, v9

    .line 107
    .line 108
    move v2, v1

    .line 109
    move-object v9, v8

    .line 110
    move-object/from16 v1, p1

    .line 111
    .line 112
    move-object v8, v7

    .line 113
    :goto_0
    move v7, v0

    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :pswitch_3
    iget-boolean v0, v5, La/d5u;->y:Z

    .line 117
    .line 118
    iget v1, v5, La/d5u;->x:I

    .line 119
    .line 120
    iget-object v2, v5, La/d5u;->r:La/gmq;

    .line 121
    .line 122
    check-cast v2, La/gmq;

    .line 123
    .line 124
    iget-object v3, v5, La/d5u;->q:La/gmq;

    .line 125
    .line 126
    check-cast v3, La/gmq;

    .line 127
    .line 128
    iget-object v4, v5, La/d5u;->p:Ljava/util/List;

    .line 129
    .line 130
    iget-object v7, v5, La/d5u;->o:La/kmq;

    .line 131
    .line 132
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move v8, v1

    .line 136
    move/from16 v20, v9

    .line 137
    .line 138
    move-object v1, v12

    .line 139
    move-object/from16 v9, p1

    .line 140
    .line 141
    goto/16 :goto_3

    .line 142
    .line 143
    :pswitch_4
    iget-boolean v0, v5, La/d5u;->y:Z

    .line 144
    .line 145
    iget v1, v5, La/d5u;->x:I

    .line 146
    .line 147
    iget-object v2, v5, La/d5u;->q:La/gmq;

    .line 148
    .line 149
    check-cast v2, La/gmq;

    .line 150
    .line 151
    iget-object v3, v5, La/d5u;->p:Ljava/util/List;

    .line 152
    .line 153
    iget-object v4, v5, La/d5u;->o:La/kmq;

    .line 154
    .line 155
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move v8, v1

    .line 159
    move-object v7, v4

    .line 160
    move-object/from16 v1, p1

    .line 161
    .line 162
    move-object v4, v3

    .line 163
    move-object v3, v2

    .line 164
    goto/16 :goto_2

    .line 165
    .line 166
    :pswitch_5
    iget-boolean v0, v5, La/d5u;->y:Z

    .line 167
    .line 168
    iget v1, v5, La/d5u;->x:I

    .line 169
    .line 170
    iget-object v2, v5, La/d5u;->p:Ljava/util/List;

    .line 171
    .line 172
    iget-object v3, v5, La/d5u;->o:La/kmq;

    .line 173
    .line 174
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    move v14, v0

    .line 178
    move v8, v1

    .line 179
    move-object v15, v2

    .line 180
    move-object v7, v3

    .line 181
    move-object/from16 v1, p1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :pswitch_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iget-object v7, v5, La/d5u;->j:La/kmq;

    .line 188
    .line 189
    iget-object v0, v5, La/d5u;->k:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    iget-object v0, v13, La/q5u;->j:La/lbu;

    .line 198
    .line 199
    invoke-virtual {v0}, La/lbu;->j()Z

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    iget-object v0, v13, La/q5u;->k:La/luu;

    .line 204
    .line 205
    iget-object v0, v0, La/luu;->a:La/nok0;

    .line 206
    .line 207
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    sget-object v1, La/sip;->c:La/sip;

    .line 212
    .line 213
    iput-object v12, v5, La/d5u;->j:La/kmq;

    .line 214
    .line 215
    iput-object v12, v5, La/d5u;->k:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v7, v5, La/d5u;->o:La/kmq;

    .line 218
    .line 219
    iput-object v15, v5, La/d5u;->p:Ljava/util/List;

    .line 220
    .line 221
    iput v8, v5, La/d5u;->x:I

    .line 222
    .line 223
    iput-boolean v14, v5, La/d5u;->y:Z

    .line 224
    .line 225
    iput-byte v11, v5, La/d5u;->i:B

    .line 226
    .line 227
    iget-wide v2, v5, La/d5u;->m:J

    .line 228
    .line 229
    iget-object v4, v5, La/d5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 230
    .line 231
    move-object v0, v13

    .line 232
    invoke-virtual/range {v0 .. v5}, La/q5u;->c(La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/zje;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    if-ne v1, v6, :cond_0

    .line 237
    .line 238
    goto/16 :goto_f

    .line 239
    .line 240
    :cond_0
    :goto_1
    move-object/from16 v16, v1

    .line 241
    .line 242
    check-cast v16, La/gmq;

    .line 243
    .line 244
    sget-object v1, La/sip;->b:La/sip;

    .line 245
    .line 246
    iput-object v12, v5, La/d5u;->j:La/kmq;

    .line 247
    .line 248
    iput-object v12, v5, La/d5u;->k:Ljava/lang/Object;

    .line 249
    .line 250
    iput-object v7, v5, La/d5u;->o:La/kmq;

    .line 251
    .line 252
    iput-object v15, v5, La/d5u;->p:Ljava/util/List;

    .line 253
    .line 254
    move-object/from16 v0, v16

    .line 255
    .line 256
    check-cast v0, La/gmq;

    .line 257
    .line 258
    iput-object v0, v5, La/d5u;->q:La/gmq;

    .line 259
    .line 260
    iput v8, v5, La/d5u;->x:I

    .line 261
    .line 262
    iput-boolean v14, v5, La/d5u;->y:Z

    .line 263
    .line 264
    iput-byte v10, v5, La/d5u;->i:B

    .line 265
    .line 266
    iget-wide v2, v5, La/d5u;->m:J

    .line 267
    .line 268
    iget-object v4, v5, La/d5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 269
    .line 270
    move-object v0, v13

    .line 271
    invoke-virtual/range {v0 .. v5}, La/q5u;->c(La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/zje;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-ne v1, v6, :cond_1

    .line 276
    .line 277
    goto/16 :goto_f

    .line 278
    .line 279
    :cond_1
    move v0, v14

    .line 280
    move-object v4, v15

    .line 281
    move-object/from16 v3, v16

    .line 282
    .line 283
    :goto_2
    move-object v2, v1

    .line 284
    check-cast v2, La/gmq;

    .line 285
    .line 286
    sget-object v1, La/sip;->c:La/sip;

    .line 287
    .line 288
    iget-object v14, v13, La/q5u;->p:La/n0o0;

    .line 289
    .line 290
    invoke-virtual {v14}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v14

    .line 294
    check-cast v14, La/sff0;

    .line 295
    .line 296
    iget-boolean v14, v14, La/sff0;->J1:Z

    .line 297
    .line 298
    iput-object v12, v5, La/d5u;->j:La/kmq;

    .line 299
    .line 300
    iput-object v12, v5, La/d5u;->k:Ljava/lang/Object;

    .line 301
    .line 302
    iput-object v7, v5, La/d5u;->o:La/kmq;

    .line 303
    .line 304
    iput-object v4, v5, La/d5u;->p:Ljava/util/List;

    .line 305
    .line 306
    move-object v15, v3

    .line 307
    check-cast v15, La/gmq;

    .line 308
    .line 309
    iput-object v15, v5, La/d5u;->q:La/gmq;

    .line 310
    .line 311
    move-object v15, v2

    .line 312
    check-cast v15, La/gmq;

    .line 313
    .line 314
    iput-object v15, v5, La/d5u;->r:La/gmq;

    .line 315
    .line 316
    iput v8, v5, La/d5u;->x:I

    .line 317
    .line 318
    iput-boolean v0, v5, La/d5u;->y:Z

    .line 319
    .line 320
    iput-byte v9, v5, La/d5u;->i:B

    .line 321
    .line 322
    move/from16 v17, v14

    .line 323
    .line 324
    iget-wide v14, v5, La/d5u;->m:J

    .line 325
    .line 326
    move/from16 v20, v9

    .line 327
    .line 328
    iget-object v9, v5, La/d5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 329
    .line 330
    move-object/from16 v16, v13

    .line 331
    .line 332
    move-object v13, v1

    .line 333
    move-object v1, v12

    .line 334
    move-object/from16 v12, v16

    .line 335
    .line 336
    move-object/from16 v16, v9

    .line 337
    .line 338
    invoke-virtual/range {v12 .. v17}, La/q5u;->a(La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)La/gmq;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    move-object v13, v12

    .line 343
    if-ne v9, v6, :cond_2

    .line 344
    .line 345
    goto/16 :goto_f

    .line 346
    .line 347
    :cond_2
    :goto_3
    check-cast v9, La/gmq;

    .line 348
    .line 349
    sget-object v12, La/sip;->b:La/sip;

    .line 350
    .line 351
    iget-object v14, v13, La/q5u;->p:La/n0o0;

    .line 352
    .line 353
    invoke-virtual {v14}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v14

    .line 357
    check-cast v14, La/sff0;

    .line 358
    .line 359
    iget-boolean v14, v14, La/sff0;->J1:Z

    .line 360
    .line 361
    iput-object v1, v5, La/d5u;->j:La/kmq;

    .line 362
    .line 363
    iput-object v1, v5, La/d5u;->k:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v7, v5, La/d5u;->o:La/kmq;

    .line 366
    .line 367
    iput-object v4, v5, La/d5u;->p:Ljava/util/List;

    .line 368
    .line 369
    move-object v15, v3

    .line 370
    check-cast v15, La/gmq;

    .line 371
    .line 372
    iput-object v15, v5, La/d5u;->q:La/gmq;

    .line 373
    .line 374
    move-object v15, v2

    .line 375
    check-cast v15, La/gmq;

    .line 376
    .line 377
    iput-object v15, v5, La/d5u;->r:La/gmq;

    .line 378
    .line 379
    move-object v15, v9

    .line 380
    check-cast v15, La/gmq;

    .line 381
    .line 382
    iput-object v15, v5, La/d5u;->s:La/gmq;

    .line 383
    .line 384
    iput v8, v5, La/d5u;->x:I

    .line 385
    .line 386
    iput-boolean v0, v5, La/d5u;->y:Z

    .line 387
    .line 388
    const/4 v15, 0x4

    .line 389
    iput-byte v15, v5, La/d5u;->i:B

    .line 390
    .line 391
    move/from16 v17, v14

    .line 392
    .line 393
    iget-wide v14, v5, La/d5u;->m:J

    .line 394
    .line 395
    iget-object v1, v5, La/d5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 396
    .line 397
    move-object/from16 v16, v13

    .line 398
    .line 399
    move-object v13, v12

    .line 400
    move-object/from16 v12, v16

    .line 401
    .line 402
    move-object/from16 v16, v1

    .line 403
    .line 404
    invoke-virtual/range {v12 .. v17}, La/q5u;->a(La/sip;JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)La/gmq;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    move-object v13, v12

    .line 409
    if-ne v1, v6, :cond_3

    .line 410
    .line 411
    goto/16 :goto_f

    .line 412
    .line 413
    :cond_3
    move-object/from16 v22, v2

    .line 414
    .line 415
    move-object/from16 v23, v3

    .line 416
    .line 417
    move v2, v8

    .line 418
    move-object/from16 v21, v9

    .line 419
    .line 420
    move-object v8, v4

    .line 421
    move-object v9, v7

    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :goto_4
    move-object/from16 v24, v1

    .line 425
    .line 426
    check-cast v24, La/gmq;

    .line 427
    .line 428
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 429
    .line 430
    iget-object v1, v5, La/d5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 431
    .line 432
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    const/16 v4, 0xc

    .line 437
    .line 438
    const-wide/16 v25, 0x24

    .line 439
    .line 440
    const-wide/16 v27, 0x1b

    .line 441
    .line 442
    const-wide/16 v29, 0x2e

    .line 443
    .line 444
    const-wide/16 v31, 0x2

    .line 445
    .line 446
    const-wide/16 v33, 0x1

    .line 447
    .line 448
    iget-wide v14, v5, La/d5u;->m:J

    .line 449
    .line 450
    if-eqz v3, :cond_4

    .line 451
    .line 452
    sget v3, La/gql0;->a:I

    .line 453
    .line 454
    invoke-static/range {v33 .. v34}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 455
    .line 456
    .line 457
    move-result-object v35

    .line 458
    invoke-static/range {v31 .. v32}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 459
    .line 460
    .line 461
    move-result-object v36

    .line 462
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 463
    .line 464
    .line 465
    move-result-object v37

    .line 466
    const-wide/16 v16, 0xf

    .line 467
    .line 468
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 469
    .line 470
    .line 471
    move-result-object v38

    .line 472
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 473
    .line 474
    .line 475
    move-result-object v39

    .line 476
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 477
    .line 478
    .line 479
    move-result-object v40

    .line 480
    filled-new-array/range {v35 .. v40}, [Ljava/lang/Long;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 489
    .line 490
    .line 491
    move-result-object v12

    .line 492
    invoke-interface {v3, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    if-eqz v3, :cond_4

    .line 497
    .line 498
    new-instance v12, La/n1;

    .line 499
    .line 500
    const/16 v17, 0xc

    .line 501
    .line 502
    const/16 v16, 0x0

    .line 503
    .line 504
    invoke-direct/range {v12 .. v17}, La/n1;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 505
    .line 506
    .line 507
    new-instance v3, La/vsg0;

    .line 508
    .line 509
    invoke-direct {v3, v12}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 510
    .line 511
    .line 512
    :goto_5
    move-object/from16 v35, v3

    .line 513
    .line 514
    goto :goto_6

    .line 515
    :cond_4
    const/16 v16, 0x0

    .line 516
    .line 517
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 518
    .line 519
    sget-object v3, La/iun;->a:La/iun;

    .line 520
    .line 521
    new-instance v12, La/j0g0;

    .line 522
    .line 523
    invoke-direct {v12, v3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    new-instance v3, La/eu4;

    .line 527
    .line 528
    invoke-direct {v3, v12, v4}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 529
    .line 530
    .line 531
    goto :goto_5

    .line 532
    :goto_6
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    if-eqz v3, :cond_5

    .line 537
    .line 538
    new-instance v12, La/c5u;

    .line 539
    .line 540
    const/16 v17, 0x1

    .line 541
    .line 542
    invoke-direct/range {v12 .. v17}, La/c5u;-><init>(La/q5u;JLa/yje;B)V

    .line 543
    .line 544
    .line 545
    new-instance v3, La/vsg0;

    .line 546
    .line 547
    invoke-direct {v3, v12}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 548
    .line 549
    .line 550
    :goto_7
    move-object/from16 v36, v3

    .line 551
    .line 552
    goto :goto_8

    .line 553
    :cond_5
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 554
    .line 555
    sget-object v3, La/iun;->a:La/iun;

    .line 556
    .line 557
    new-instance v12, La/j0g0;

    .line 558
    .line 559
    invoke-direct {v12, v3}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    new-instance v3, La/eu4;

    .line 563
    .line 564
    invoke-direct {v3, v12, v4}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 565
    .line 566
    .line 567
    goto :goto_7

    .line 568
    :goto_8
    iget-object v3, v13, La/q5u;->p:La/n0o0;

    .line 569
    .line 570
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    check-cast v3, La/sff0;

    .line 575
    .line 576
    iget-object v3, v3, La/sff0;->c:La/ech;

    .line 577
    .line 578
    iget-object v3, v3, La/ech;->q:La/n2o;

    .line 579
    .line 580
    sget-object v12, La/n2o;->c:La/n2o;

    .line 581
    .line 582
    if-ne v3, v12, :cond_6

    .line 583
    .line 584
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-nez v0, :cond_7

    .line 589
    .line 590
    :cond_6
    move-object/from16 v14, v16

    .line 591
    .line 592
    goto :goto_c

    .line 593
    :cond_7
    cmp-long v0, v14, v29

    .line 594
    .line 595
    if-nez v0, :cond_8

    .line 596
    .line 597
    new-instance v12, La/c5u;

    .line 598
    .line 599
    const/16 v17, 0x0

    .line 600
    .line 601
    invoke-direct/range {v12 .. v17}, La/c5u;-><init>(La/q5u;JLa/yje;B)V

    .line 602
    .line 603
    .line 604
    new-instance v0, La/vsg0;

    .line 605
    .line 606
    invoke-direct {v0, v12}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 607
    .line 608
    .line 609
    :goto_9
    move-object v12, v0

    .line 610
    move-object/from16 v14, v16

    .line 611
    .line 612
    goto :goto_d

    .line 613
    :cond_8
    cmp-long v0, v14, v33

    .line 614
    .line 615
    if-eqz v0, :cond_a

    .line 616
    .line 617
    cmp-long v0, v14, v31

    .line 618
    .line 619
    if-eqz v0, :cond_a

    .line 620
    .line 621
    const-wide/16 v0, 0x3d

    .line 622
    .line 623
    cmp-long v0, v14, v0

    .line 624
    .line 625
    if-eqz v0, :cond_a

    .line 626
    .line 627
    cmp-long v0, v14, v27

    .line 628
    .line 629
    if-eqz v0, :cond_a

    .line 630
    .line 631
    cmp-long v0, v14, v25

    .line 632
    .line 633
    if-nez v0, :cond_9

    .line 634
    .line 635
    goto :goto_a

    .line 636
    :cond_9
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 637
    .line 638
    sget-object v0, La/iun;->a:La/iun;

    .line 639
    .line 640
    new-instance v1, La/j0g0;

    .line 641
    .line 642
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    new-instance v0, La/eu4;

    .line 646
    .line 647
    invoke-direct {v0, v1, v4}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 648
    .line 649
    .line 650
    goto :goto_9

    .line 651
    :cond_a
    :goto_a
    new-instance v12, La/qe5;

    .line 652
    .line 653
    const/16 v17, 0x5

    .line 654
    .line 655
    invoke-direct/range {v12 .. v17}, La/qe5;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 656
    .line 657
    .line 658
    move-object/from16 v14, v16

    .line 659
    .line 660
    new-instance v0, La/vsg0;

    .line 661
    .line 662
    invoke-direct {v0, v12}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 663
    .line 664
    .line 665
    :goto_b
    move-object v12, v0

    .line 666
    goto :goto_d

    .line 667
    :goto_c
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 668
    .line 669
    sget-object v0, La/iun;->a:La/iun;

    .line 670
    .line 671
    new-instance v1, La/j0g0;

    .line 672
    .line 673
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    new-instance v0, La/eu4;

    .line 677
    .line 678
    invoke-direct {v0, v1, v4}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 679
    .line 680
    .line 681
    goto :goto_b

    .line 682
    :goto_d
    iput-object v14, v5, La/d5u;->j:La/kmq;

    .line 683
    .line 684
    iput-object v14, v5, La/d5u;->k:Ljava/lang/Object;

    .line 685
    .line 686
    iput-object v9, v5, La/d5u;->o:La/kmq;

    .line 687
    .line 688
    iput-object v8, v5, La/d5u;->p:Ljava/util/List;

    .line 689
    .line 690
    move-object/from16 v0, v23

    .line 691
    .line 692
    check-cast v0, La/gmq;

    .line 693
    .line 694
    iput-object v0, v5, La/d5u;->q:La/gmq;

    .line 695
    .line 696
    move-object/from16 v0, v22

    .line 697
    .line 698
    check-cast v0, La/gmq;

    .line 699
    .line 700
    iput-object v0, v5, La/d5u;->r:La/gmq;

    .line 701
    .line 702
    move-object/from16 v0, v21

    .line 703
    .line 704
    check-cast v0, La/gmq;

    .line 705
    .line 706
    iput-object v0, v5, La/d5u;->s:La/gmq;

    .line 707
    .line 708
    move-object/from16 v0, v24

    .line 709
    .line 710
    check-cast v0, La/gmq;

    .line 711
    .line 712
    iput-object v0, v5, La/d5u;->t:La/gmq;

    .line 713
    .line 714
    move-object/from16 v0, v35

    .line 715
    .line 716
    check-cast v0, La/gmq;

    .line 717
    .line 718
    iput-object v0, v5, La/d5u;->u:La/gmq;

    .line 719
    .line 720
    move-object/from16 v0, v36

    .line 721
    .line 722
    check-cast v0, La/gmq;

    .line 723
    .line 724
    iput-object v0, v5, La/d5u;->v:La/gmq;

    .line 725
    .line 726
    move-object v0, v12

    .line 727
    check-cast v0, La/gmq;

    .line 728
    .line 729
    iput-object v0, v5, La/d5u;->w:La/gmq;

    .line 730
    .line 731
    iput v2, v5, La/d5u;->x:I

    .line 732
    .line 733
    iput-boolean v7, v5, La/d5u;->y:Z

    .line 734
    .line 735
    const/4 v0, 0x5

    .line 736
    iput-byte v0, v5, La/d5u;->i:B

    .line 737
    .line 738
    iget-object v1, v5, La/d5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 739
    .line 740
    iget-wide v3, v5, La/d5u;->m:J

    .line 741
    .line 742
    move-object v0, v13

    .line 743
    invoke-virtual/range {v0 .. v5}, La/q5u;->b(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;IJLa/zje;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    if-ne v0, v6, :cond_b

    .line 748
    .line 749
    goto :goto_f

    .line 750
    :cond_b
    move-object v1, v12

    .line 751
    move-object/from16 v13, v21

    .line 752
    .line 753
    move-object/from16 v15, v23

    .line 754
    .line 755
    move-object/from16 v4, v24

    .line 756
    .line 757
    move-object/from16 v3, v35

    .line 758
    .line 759
    move-object/from16 v2, v36

    .line 760
    .line 761
    :goto_e
    check-cast v0, La/gmq;

    .line 762
    .line 763
    const/16 v12, 0x8

    .line 764
    .line 765
    new-array v12, v12, [La/gmq;

    .line 766
    .line 767
    const/16 v16, 0x0

    .line 768
    .line 769
    aput-object v15, v12, v16

    .line 770
    .line 771
    aput-object v22, v12, v11

    .line 772
    .line 773
    aput-object v13, v12, v10

    .line 774
    .line 775
    aput-object v4, v12, v20

    .line 776
    .line 777
    const/16 v19, 0x4

    .line 778
    .line 779
    aput-object v3, v12, v19

    .line 780
    .line 781
    const/16 v18, 0x5

    .line 782
    .line 783
    aput-object v2, v12, v18

    .line 784
    .line 785
    const/4 v2, 0x6

    .line 786
    aput-object v1, v12, v2

    .line 787
    .line 788
    const/4 v1, 0x7

    .line 789
    aput-object v0, v12, v1

    .line 790
    .line 791
    new-instance v0, La/oot;

    .line 792
    .line 793
    invoke-direct {v0, v12, v7, v8}, La/oot;-><init>([La/gmq;ZLjava/util/List;)V

    .line 794
    .line 795
    .line 796
    iput-object v14, v5, La/d5u;->j:La/kmq;

    .line 797
    .line 798
    iput-object v14, v5, La/d5u;->k:Ljava/lang/Object;

    .line 799
    .line 800
    iput-object v14, v5, La/d5u;->o:La/kmq;

    .line 801
    .line 802
    iput-object v14, v5, La/d5u;->p:Ljava/util/List;

    .line 803
    .line 804
    iput-object v14, v5, La/d5u;->q:La/gmq;

    .line 805
    .line 806
    iput-object v14, v5, La/d5u;->r:La/gmq;

    .line 807
    .line 808
    iput-object v14, v5, La/d5u;->s:La/gmq;

    .line 809
    .line 810
    iput-object v14, v5, La/d5u;->t:La/gmq;

    .line 811
    .line 812
    iput-object v14, v5, La/d5u;->u:La/gmq;

    .line 813
    .line 814
    iput-object v14, v5, La/d5u;->v:La/gmq;

    .line 815
    .line 816
    iput-object v14, v5, La/d5u;->w:La/gmq;

    .line 817
    .line 818
    iput-byte v2, v5, La/d5u;->i:B

    .line 819
    .line 820
    invoke-static {v9, v0, v5}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    if-ne v0, v6, :cond_c

    .line 825
    .line 826
    :goto_f
    return-object v6

    .line 827
    :cond_c
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 828
    .line 829
    return-object v0

    .line 830
    nop

    .line 831
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
