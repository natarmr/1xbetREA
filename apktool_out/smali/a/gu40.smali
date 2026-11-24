.class public final La/gu40;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/hie0;

.field public j:La/hie0;

.field public k:I

.field public l:B

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/jie0;

.field public final synthetic o:La/mie0;

.field public final synthetic p:La/mie0;

.field public final synthetic q:F

.field public final synthetic r:La/iu40;

.field public final synthetic s:F

.field public final synthetic t:La/sch0;


# direct methods
.method public constructor <init>(La/jie0;La/mie0;La/mie0;FLa/iu40;FLa/sch0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gu40;->n:La/jie0;

    .line 2
    .line 3
    iput-object p2, p0, La/gu40;->o:La/mie0;

    .line 4
    .line 5
    iput-object p3, p0, La/gu40;->p:La/mie0;

    .line 6
    .line 7
    iput p4, p0, La/gu40;->q:F

    .line 8
    .line 9
    iput-object p5, p0, La/gu40;->r:La/iu40;

    .line 10
    .line 11
    iput p6, p0, La/gu40;->s:F

    .line 12
    .line 13
    iput-object p7, p0, La/gu40;->t:La/sch0;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/gu40;

    .line 2
    .line 3
    iget v6, p0, La/gu40;->s:F

    .line 4
    .line 5
    iget-object v7, p0, La/gu40;->t:La/sch0;

    .line 6
    .line 7
    iget-object v1, p0, La/gu40;->n:La/jie0;

    .line 8
    .line 9
    iget-object v2, p0, La/gu40;->o:La/mie0;

    .line 10
    .line 11
    iget-object v3, p0, La/gu40;->p:La/mie0;

    .line 12
    .line 13
    iget v4, p0, La/gu40;->q:F

    .line 14
    .line 15
    iget-object v5, p0, La/gu40;->r:La/iu40;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, La/gu40;-><init>(La/jie0;La/mie0;La/mie0;FLa/iu40;FLa/sch0;La/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/gu40;->m:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/rch0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/gu40;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/gu40;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/gu40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    sget-object v8, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v7, La/gu40;->l:B

    .line 6
    .line 7
    iget-object v1, v7, La/gu40;->p:La/mie0;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object v2, v7, La/gu40;->n:La/jie0;

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    const/4 v4, 0x2

    .line 14
    const/4 v5, 0x1

    .line 15
    iget-object v9, v7, La/gu40;->o:La/mie0;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    if-eq v0, v5, :cond_2

    .line 20
    .line 21
    if-eq v0, v4, :cond_1

    .line 22
    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    iget-object v0, v7, La/gu40;->j:La/hie0;

    .line 26
    .line 27
    iget-object v10, v7, La/gu40;->i:La/hie0;

    .line 28
    .line 29
    iget-object v11, v7, La/gu40;->m:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v11, La/rch0;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move v12, v4

    .line 37
    move v15, v5

    .line 38
    move-object/from16 v16, v6

    .line 39
    .line 40
    move-object v4, v9

    .line 41
    move-object v14, v11

    .line 42
    move v9, v3

    .line 43
    move-object v3, v10

    .line 44
    move-object v10, v0

    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_1
    iget v0, v7, La/gu40;->k:I

    .line 56
    .line 57
    iget-object v10, v7, La/gu40;->i:La/hie0;

    .line 58
    .line 59
    iget-object v11, v7, La/gu40;->m:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v11, La/rch0;

    .line 62
    .line 63
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object/from16 v20, v1

    .line 67
    .line 68
    move-object/from16 v21, v2

    .line 69
    .line 70
    move v12, v4

    .line 71
    move v15, v5

    .line 72
    move-object/from16 v19, v9

    .line 73
    .line 74
    move-object v14, v11

    .line 75
    move v9, v3

    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_2
    iget-object v0, v7, La/gu40;->j:La/hie0;

    .line 79
    .line 80
    iget-object v10, v7, La/gu40;->i:La/hie0;

    .line 81
    .line 82
    iget-object v11, v7, La/gu40;->m:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v11, La/rch0;

    .line 85
    .line 86
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move v12, v4

    .line 90
    move v15, v5

    .line 91
    move-object/from16 v16, v6

    .line 92
    .line 93
    move-object v4, v9

    .line 94
    move-object v14, v11

    .line 95
    move v9, v3

    .line 96
    move-object v3, v10

    .line 97
    move-object v10, v0

    .line 98
    move-object/from16 v0, p1

    .line 99
    .line 100
    goto/16 :goto_8

    .line 101
    .line 102
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v7, La/gu40;->m:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, La/rch0;

    .line 108
    .line 109
    new-instance v10, La/hie0;

    .line 110
    .line 111
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-boolean v5, v10, La/hie0;->a:Z

    .line 115
    .line 116
    :goto_0
    move-object v14, v10

    .line 117
    :goto_1
    iget-boolean v10, v14, La/hie0;->a:Z

    .line 118
    .line 119
    if-eqz v10, :cond_c

    .line 120
    .line 121
    const/4 v10, 0x0

    .line 122
    iput-boolean v10, v14, La/hie0;->a:Z

    .line 123
    .line 124
    iget v11, v2, La/jie0;->a:F

    .line 125
    .line 126
    iget-object v12, v9, La/mie0;->a:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v12, La/l73;

    .line 129
    .line 130
    iget-object v12, v12, La/l73;->b:La/pz40;

    .line 131
    .line 132
    check-cast v12, La/hgk0;

    .line 133
    .line 134
    invoke-virtual {v12}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    check-cast v12, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    sub-float/2addr v11, v12

    .line 145
    iget-object v12, v1, La/mie0;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v12, La/eu40;

    .line 148
    .line 149
    iget-boolean v12, v12, La/eu40;->c:Z

    .line 150
    .line 151
    iget-object v13, v7, La/gu40;->r:La/iu40;

    .line 152
    .line 153
    if-nez v12, :cond_4

    .line 154
    .line 155
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    iget v15, v7, La/gu40;->q:F

    .line 160
    .line 161
    cmpg-float v12, v12, v15

    .line 162
    .line 163
    if-gez v12, :cond_5

    .line 164
    .line 165
    :cond_4
    move v12, v4

    .line 166
    move v15, v5

    .line 167
    move-object/from16 v16, v6

    .line 168
    .line 169
    move-object v4, v9

    .line 170
    move-object v10, v14

    .line 171
    move-object v14, v0

    .line 172
    move v9, v3

    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :cond_5
    invoke-static {v11}, Ljava/lang/Math;->signum(F)F

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    mul-float/2addr v11, v15

    .line 180
    invoke-virtual {v13, v0, v11}, La/iu40;->c(La/rch0;F)F

    .line 181
    .line 182
    .line 183
    iget-object v12, v9, La/mie0;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v12, La/l73;

    .line 186
    .line 187
    iget-object v13, v12, La/l73;->b:La/pz40;

    .line 188
    .line 189
    check-cast v13, La/hgk0;

    .line 190
    .line 191
    invoke-virtual {v13}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    check-cast v13, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    add-float/2addr v13, v11

    .line 202
    const/4 v11, 0x0

    .line 203
    const/16 v15, 0x1e

    .line 204
    .line 205
    invoke-static {v12, v13, v11, v15}, La/x4d0;->a0(La/l73;FFI)La/l73;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    iput-object v11, v9, La/mie0;->a:Ljava/lang/Object;

    .line 210
    .line 211
    iget v12, v2, La/jie0;->a:F

    .line 212
    .line 213
    iget-object v11, v11, La/l73;->b:La/pz40;

    .line 214
    .line 215
    check-cast v11, La/hgk0;

    .line 216
    .line 217
    invoke-virtual {v11}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    check-cast v11, Ljava/lang/Number;

    .line 222
    .line 223
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    sub-float/2addr v12, v11

    .line 228
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    iget v12, v7, La/gu40;->s:F

    .line 233
    .line 234
    div-float/2addr v11, v12

    .line 235
    invoke-static {v11}, La/si30;->b(F)I

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    const/16 v12, 0x64

    .line 240
    .line 241
    if-le v11, v12, :cond_6

    .line 242
    .line 243
    move v11, v12

    .line 244
    :cond_6
    iget-object v12, v9, La/mie0;->a:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v12, La/l73;

    .line 247
    .line 248
    iget v13, v2, La/jie0;->a:F

    .line 249
    .line 250
    new-instance v15, La/dg;

    .line 251
    .line 252
    move-object/from16 v16, v9

    .line 253
    .line 254
    move-object v9, v15

    .line 255
    const/16 v15, 0x17

    .line 256
    .line 257
    move/from16 v17, v10

    .line 258
    .line 259
    iget-object v10, v7, La/gu40;->r:La/iu40;

    .line 260
    .line 261
    move/from16 v18, v13

    .line 262
    .line 263
    iget-object v13, v7, La/gu40;->t:La/sch0;

    .line 264
    .line 265
    move v3, v11

    .line 266
    move-object v11, v1

    .line 267
    move v1, v3

    .line 268
    move-object v3, v12

    .line 269
    move-object v12, v2

    .line 270
    move-object v2, v3

    .line 271
    move-object/from16 v19, v16

    .line 272
    .line 273
    move/from16 v5, v17

    .line 274
    .line 275
    move/from16 v3, v18

    .line 276
    .line 277
    invoke-direct/range {v9 .. v15}, La/dg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 278
    .line 279
    .line 280
    move-object v13, v10

    .line 281
    move-object/from16 v20, v11

    .line 282
    .line 283
    move-object/from16 v21, v12

    .line 284
    .line 285
    move-object v10, v14

    .line 286
    iput-object v0, v7, La/gu40;->m:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v10, v7, La/gu40;->i:La/hie0;

    .line 289
    .line 290
    iput-object v6, v7, La/gu40;->j:La/hie0;

    .line 291
    .line 292
    iput v1, v7, La/gu40;->k:I

    .line 293
    .line 294
    iput-byte v4, v7, La/gu40;->l:B

    .line 295
    .line 296
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    new-instance v12, La/jie0;

    .line 300
    .line 301
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 302
    .line 303
    .line 304
    iget-object v11, v2, La/l73;->b:La/pz40;

    .line 305
    .line 306
    check-cast v11, La/hgk0;

    .line 307
    .line 308
    invoke-virtual {v11}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v11

    .line 312
    check-cast v11, Ljava/lang/Number;

    .line 313
    .line 314
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    iput v11, v12, La/jie0;->a:F

    .line 319
    .line 320
    new-instance v11, Ljava/lang/Float;

    .line 321
    .line 322
    invoke-direct {v11, v3}, Ljava/lang/Float;-><init>(F)V

    .line 323
    .line 324
    .line 325
    sget-object v3, La/ihn;->d:La/z73;

    .line 326
    .line 327
    invoke-static {v1, v5, v3, v4}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    move-object v5, v11

    .line 332
    new-instance v11, La/enm;

    .line 333
    .line 334
    const/16 v16, 0x15

    .line 335
    .line 336
    move-object v14, v0

    .line 337
    move-object v15, v9

    .line 338
    invoke-direct/range {v11 .. v16}, La/enm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 339
    .line 340
    .line 341
    move-object v0, v2

    .line 342
    move-object v2, v3

    .line 343
    const/4 v3, 0x1

    .line 344
    move v12, v4

    .line 345
    move-object v4, v11

    .line 346
    const/4 v9, 0x3

    .line 347
    const/4 v15, 0x1

    .line 348
    move v11, v1

    .line 349
    move-object v1, v5

    .line 350
    move-object v5, v7

    .line 351
    invoke-static/range {v0 .. v5}, La/hhm0;->p(La/l73;Ljava/lang/Float;La/j73;ZLkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    sget-object v1, La/wne;->a:La/wne;

    .line 356
    .line 357
    if-ne v0, v1, :cond_7

    .line 358
    .line 359
    goto :goto_2

    .line 360
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    :goto_2
    if-ne v0, v8, :cond_8

    .line 363
    .line 364
    goto/16 :goto_7

    .line 365
    .line 366
    :cond_8
    move v0, v11

    .line 367
    :goto_3
    iget-boolean v1, v10, La/hie0;->a:Z

    .line 368
    .line 369
    if-nez v1, :cond_a

    .line 370
    .line 371
    const-wide/16 v1, 0x32

    .line 372
    .line 373
    int-to-long v3, v0

    .line 374
    sub-long/2addr v1, v3

    .line 375
    iput-object v14, v7, La/gu40;->m:Ljava/lang/Object;

    .line 376
    .line 377
    iput-object v10, v7, La/gu40;->i:La/hie0;

    .line 378
    .line 379
    iput-object v10, v7, La/gu40;->j:La/hie0;

    .line 380
    .line 381
    iput-byte v9, v7, La/gu40;->l:B

    .line 382
    .line 383
    iget-object v0, v7, La/gu40;->r:La/iu40;

    .line 384
    .line 385
    iget-object v3, v7, La/gu40;->t:La/sch0;

    .line 386
    .line 387
    move-object/from16 v16, v6

    .line 388
    .line 389
    move-object/from16 v4, v19

    .line 390
    .line 391
    move-wide v5, v1

    .line 392
    move-object/from16 v1, v20

    .line 393
    .line 394
    move-object/from16 v2, v21

    .line 395
    .line 396
    invoke-static/range {v0 .. v7}, La/iu40;->e(La/iu40;La/mie0;La/jie0;La/sch0;La/mie0;JLa/zje;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    if-ne v0, v8, :cond_9

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_9
    move-object v3, v10

    .line 404
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    iput-boolean v0, v10, La/hie0;->a:Z

    .line 411
    .line 412
    :goto_5
    move-object v0, v14

    .line 413
    move v5, v15

    .line 414
    move-object/from16 v6, v16

    .line 415
    .line 416
    move-object v14, v3

    .line 417
    move v3, v9

    .line 418
    move-object v9, v4

    .line 419
    move v4, v12

    .line 420
    goto/16 :goto_1

    .line 421
    .line 422
    :cond_a
    move v3, v9

    .line 423
    move v4, v12

    .line 424
    move-object v0, v14

    .line 425
    move v5, v15

    .line 426
    move-object/from16 v9, v19

    .line 427
    .line 428
    move-object/from16 v1, v20

    .line 429
    .line 430
    move-object/from16 v2, v21

    .line 431
    .line 432
    goto/16 :goto_0

    .line 433
    .line 434
    :goto_6
    invoke-virtual {v13, v14, v11}, La/iu40;->c(La/rch0;F)F

    .line 435
    .line 436
    .line 437
    iput-object v14, v7, La/gu40;->m:Ljava/lang/Object;

    .line 438
    .line 439
    iput-object v10, v7, La/gu40;->i:La/hie0;

    .line 440
    .line 441
    iput-object v10, v7, La/gu40;->j:La/hie0;

    .line 442
    .line 443
    iput-byte v15, v7, La/gu40;->l:B

    .line 444
    .line 445
    iget-object v0, v7, La/gu40;->r:La/iu40;

    .line 446
    .line 447
    iget-object v3, v7, La/gu40;->t:La/sch0;

    .line 448
    .line 449
    const-wide/16 v5, 0x32

    .line 450
    .line 451
    invoke-static/range {v0 .. v7}, La/iu40;->e(La/iu40;La/mie0;La/jie0;La/sch0;La/mie0;JLa/zje;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    if-ne v0, v8, :cond_b

    .line 456
    .line 457
    :goto_7
    return-object v8

    .line 458
    :cond_b
    move-object v3, v10

    .line 459
    :goto_8
    check-cast v0, Ljava/lang/Boolean;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    iput-boolean v0, v10, La/hie0;->a:Z

    .line 466
    .line 467
    move-object/from16 v7, p0

    .line 468
    .line 469
    goto :goto_5

    .line 470
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 471
    .line 472
    return-object v0
.end method
