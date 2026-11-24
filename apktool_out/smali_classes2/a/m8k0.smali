.class public final La/m8k0;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public j:Ljava/lang/Object;

.field public k:Ljava/util/Iterator;

.field public l:I

.field public m:I

.field public n:B

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Ljava/util/Iterator;

.field public final synthetic s:Z

.field public final synthetic t:Z


# direct methods
.method public constructor <init>(IILjava/util/Iterator;ZZLa/yje;)V
    .locals 0

    .line 1
    iput p1, p0, La/m8k0;->p:I

    .line 2
    .line 3
    iput p2, p0, La/m8k0;->q:I

    .line 4
    .line 5
    iput-object p3, p0, La/m8k0;->r:Ljava/util/Iterator;

    .line 6
    .line 7
    iput-boolean p4, p0, La/m8k0;->s:Z

    .line 8
    .line 9
    iput-boolean p5, p0, La/m8k0;->t:Z

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/zzf0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/m8k0;

    .line 2
    .line 3
    iget-boolean v4, p0, La/m8k0;->s:Z

    .line 4
    .line 5
    iget-boolean v5, p0, La/m8k0;->t:Z

    .line 6
    .line 7
    iget v1, p0, La/m8k0;->p:I

    .line 8
    .line 9
    iget v2, p0, La/m8k0;->q:I

    .line 10
    .line 11
    iget-object v3, p0, La/m8k0;->r:Ljava/util/Iterator;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/m8k0;-><init>(IILjava/util/Iterator;ZZLa/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/m8k0;->o:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/fgi0;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/m8k0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/m8k0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/m8k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/m8k0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/fgi0;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/m8k0;->n:B

    .line 10
    .line 11
    iget-boolean v4, v0, La/m8k0;->t:Z

    .line 12
    .line 13
    const/4 v5, 0x5

    .line 14
    const/4 v6, 0x4

    .line 15
    const/4 v7, 0x3

    .line 16
    const/4 v8, 0x2

    .line 17
    iget-boolean v9, v0, La/m8k0;->s:Z

    .line 18
    .line 19
    iget v10, v0, La/m8k0;->q:I

    .line 20
    .line 21
    const/4 v11, 0x1

    .line 22
    iget v12, v0, La/m8k0;->p:I

    .line 23
    .line 24
    const/4 v13, 0x0

    .line 25
    if-eqz v3, :cond_6

    .line 26
    .line 27
    if-eq v3, v11, :cond_4

    .line 28
    .line 29
    if-eq v3, v8, :cond_3

    .line 30
    .line 31
    if-eq v3, v7, :cond_2

    .line 32
    .line 33
    if-eq v3, v6, :cond_1

    .line 34
    .line 35
    if-ne v3, v5, :cond_0

    .line 36
    .line 37
    iget-object v0, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, La/fcg0;

    .line 40
    .line 41
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_9

    .line 45
    .line 46
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v13

    .line 52
    :cond_1
    iget v3, v0, La/m8k0;->m:I

    .line 53
    .line 54
    iget v4, v0, La/m8k0;->l:I

    .line 55
    .line 56
    iget-object v7, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, La/fcg0;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7, v10}, La/fcg0;->e(I)V

    .line 64
    .line 65
    .line 66
    move-object/from16 v18, v13

    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_2
    iget v3, v0, La/m8k0;->m:I

    .line 71
    .line 72
    iget v8, v0, La/m8k0;->l:I

    .line 73
    .line 74
    iget-object v14, v0, La/m8k0;->k:Ljava/util/Iterator;

    .line 75
    .line 76
    iget-object v15, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v15, La/fcg0;

    .line 79
    .line 80
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v15, v10}, La/fcg0;->e(I)V

    .line 84
    .line 85
    .line 86
    move/from16 v16, v11

    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_3
    iget-object v0, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    iget v3, v0, La/m8k0;->m:I

    .line 96
    .line 97
    iget v5, v0, La/m8k0;->l:I

    .line 98
    .line 99
    iget-object v6, v0, La/m8k0;->k:Ljava/util/Iterator;

    .line 100
    .line 101
    iget-object v7, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v7, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    if-eqz v9, :cond_5

    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_5
    new-instance v7, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    .line 118
    .line 119
    :goto_1
    move v14, v3

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const/16 v3, 0x400

    .line 125
    .line 126
    if-le v12, v3, :cond_7

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    move v3, v12

    .line 130
    :goto_2
    sub-int v14, v10, v12

    .line 131
    .line 132
    iget-object v15, v0, La/m8k0;->r:Ljava/util/Iterator;

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    if-ltz v14, :cond_c

    .line 136
    .line 137
    new-instance v7, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    move v6, v5

    .line 143
    move v5, v3

    .line 144
    move v3, v6

    .line 145
    move-object v6, v15

    .line 146
    :cond_8
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eqz v9, :cond_a

    .line 151
    .line 152
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    if-lez v3, :cond_9

    .line 157
    .line 158
    add-int/lit8 v3, v3, -0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_9
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-ne v9, v12, :cond_8

    .line 169
    .line 170
    iput-object v1, v0, La/m8k0;->o:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v7, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v6, v0, La/m8k0;->k:Ljava/util/Iterator;

    .line 175
    .line 176
    iput v5, v0, La/m8k0;->l:I

    .line 177
    .line 178
    iput v14, v0, La/m8k0;->m:I

    .line 179
    .line 180
    iput-byte v11, v0, La/m8k0;->n:B

    .line 181
    .line 182
    invoke-virtual {v1, v0, v7}, La/fgi0;->a(La/yje;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    sget-object v0, La/wne;->a:La/wne;

    .line 186
    .line 187
    return-object v2

    .line 188
    :cond_a
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez v3, :cond_16

    .line 193
    .line 194
    if-nez v4, :cond_b

    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-ne v3, v12, :cond_16

    .line 201
    .line 202
    :cond_b
    iput-object v13, v0, La/m8k0;->o:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v13, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v13, v0, La/m8k0;->k:Ljava/util/Iterator;

    .line 207
    .line 208
    iput v5, v0, La/m8k0;->l:I

    .line 209
    .line 210
    iput v14, v0, La/m8k0;->m:I

    .line 211
    .line 212
    iput-byte v8, v0, La/m8k0;->n:B

    .line 213
    .line 214
    invoke-virtual {v1, v0, v7}, La/fgi0;->a(La/yje;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    sget-object v0, La/wne;->a:La/wne;

    .line 218
    .line 219
    return-object v2

    .line 220
    :cond_c
    new-instance v8, La/fcg0;

    .line 221
    .line 222
    move/from16 v16, v11

    .line 223
    .line 224
    new-array v11, v3, [Ljava/lang/Object;

    .line 225
    .line 226
    invoke-direct {v8, v5, v11}, La/fcg0;-><init>(I[Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v19, v8

    .line 230
    .line 231
    move v8, v3

    .line 232
    move v3, v14

    .line 233
    move-object v14, v15

    .line 234
    move-object/from16 v15, v19

    .line 235
    .line 236
    :goto_4
    iget v5, v15, La/fcg0;->c:I

    .line 237
    .line 238
    iget-object v11, v15, La/fcg0;->b:[Ljava/lang/Object;

    .line 239
    .line 240
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v17

    .line 244
    if-eqz v17, :cond_13

    .line 245
    .line 246
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v17

    .line 250
    invoke-virtual {v15}, La/fcg0;->b()I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eq v6, v5, :cond_12

    .line 255
    .line 256
    iget v6, v15, La/fcg0;->d:I

    .line 257
    .line 258
    move-object/from16 v18, v13

    .line 259
    .line 260
    iget v13, v15, La/fcg0;->e:I

    .line 261
    .line 262
    add-int/2addr v6, v13

    .line 263
    rem-int/2addr v6, v5

    .line 264
    aput-object v17, v11, v6

    .line 265
    .line 266
    add-int/lit8 v13, v13, 0x1

    .line 267
    .line 268
    iput v13, v15, La/fcg0;->e:I

    .line 269
    .line 270
    invoke-virtual {v15}, La/fcg0;->b()I

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    if-ne v6, v5, :cond_f

    .line 275
    .line 276
    iget v6, v15, La/fcg0;->e:I

    .line 277
    .line 278
    if-ge v6, v12, :cond_10

    .line 279
    .line 280
    shr-int/lit8 v6, v5, 0x1

    .line 281
    .line 282
    add-int/2addr v5, v6

    .line 283
    add-int/lit8 v5, v5, 0x1

    .line 284
    .line 285
    if-le v5, v12, :cond_d

    .line 286
    .line 287
    move v5, v12

    .line 288
    :cond_d
    iget v6, v15, La/fcg0;->d:I

    .line 289
    .line 290
    if-nez v6, :cond_e

    .line 291
    .line 292
    invoke-static {v11, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    goto :goto_5

    .line 297
    :cond_e
    new-array v5, v5, [Ljava/lang/Object;

    .line 298
    .line 299
    invoke-virtual {v15, v5}, La/fcg0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    :goto_5
    new-instance v6, La/fcg0;

    .line 304
    .line 305
    iget v11, v15, La/fcg0;->e:I

    .line 306
    .line 307
    invoke-direct {v6, v11, v5}, La/fcg0;-><init>(I[Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    move-object v15, v6

    .line 311
    :cond_f
    move-object/from16 v13, v18

    .line 312
    .line 313
    const/4 v6, 0x4

    .line 314
    goto :goto_4

    .line 315
    :cond_10
    if-eqz v9, :cond_11

    .line 316
    .line 317
    move-object v4, v15

    .line 318
    goto :goto_6

    .line 319
    :cond_11
    new-instance v4, Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-direct {v4, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 322
    .line 323
    .line 324
    :goto_6
    iput-object v1, v0, La/m8k0;->o:Ljava/lang/Object;

    .line 325
    .line 326
    iput-object v15, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 327
    .line 328
    iput-object v14, v0, La/m8k0;->k:Ljava/util/Iterator;

    .line 329
    .line 330
    iput v8, v0, La/m8k0;->l:I

    .line 331
    .line 332
    iput v3, v0, La/m8k0;->m:I

    .line 333
    .line 334
    iput-byte v7, v0, La/m8k0;->n:B

    .line 335
    .line 336
    invoke-virtual {v1, v0, v4}, La/fgi0;->a(La/yje;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    sget-object v0, La/wne;->a:La/wne;

    .line 340
    .line 341
    return-object v2

    .line 342
    :cond_12
    move-object/from16 v18, v13

    .line 343
    .line 344
    const-string v0, "ring buffer is full"

    .line 345
    .line 346
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    return-object v18

    .line 350
    :cond_13
    move-object/from16 v18, v13

    .line 351
    .line 352
    if-eqz v4, :cond_16

    .line 353
    .line 354
    move v4, v8

    .line 355
    move-object v7, v15

    .line 356
    :goto_7
    iget v5, v7, La/fcg0;->e:I

    .line 357
    .line 358
    if-le v5, v10, :cond_15

    .line 359
    .line 360
    if-eqz v9, :cond_14

    .line 361
    .line 362
    move-object v5, v7

    .line 363
    goto :goto_8

    .line 364
    :cond_14
    new-instance v5, Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 367
    .line 368
    .line 369
    :goto_8
    iput-object v1, v0, La/m8k0;->o:Ljava/lang/Object;

    .line 370
    .line 371
    iput-object v7, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 372
    .line 373
    move-object/from16 v6, v18

    .line 374
    .line 375
    iput-object v6, v0, La/m8k0;->k:Ljava/util/Iterator;

    .line 376
    .line 377
    iput v4, v0, La/m8k0;->l:I

    .line 378
    .line 379
    iput v3, v0, La/m8k0;->m:I

    .line 380
    .line 381
    const/4 v3, 0x4

    .line 382
    iput-byte v3, v0, La/m8k0;->n:B

    .line 383
    .line 384
    invoke-virtual {v1, v0, v5}, La/fgi0;->a(La/yje;Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    sget-object v0, La/wne;->a:La/wne;

    .line 388
    .line 389
    return-object v2

    .line 390
    :cond_15
    move-object/from16 v6, v18

    .line 391
    .line 392
    invoke-virtual {v7}, La/u1;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    if-nez v5, :cond_16

    .line 397
    .line 398
    iput-object v6, v0, La/m8k0;->o:Ljava/lang/Object;

    .line 399
    .line 400
    iput-object v6, v0, La/m8k0;->j:Ljava/lang/Object;

    .line 401
    .line 402
    iput-object v6, v0, La/m8k0;->k:Ljava/util/Iterator;

    .line 403
    .line 404
    iput v4, v0, La/m8k0;->l:I

    .line 405
    .line 406
    iput v3, v0, La/m8k0;->m:I

    .line 407
    .line 408
    const/4 v3, 0x5

    .line 409
    iput-byte v3, v0, La/m8k0;->n:B

    .line 410
    .line 411
    invoke-virtual {v1, v0, v7}, La/fgi0;->a(La/yje;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    sget-object v0, La/wne;->a:La/wne;

    .line 415
    .line 416
    return-object v2

    .line 417
    :cond_16
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 418
    .line 419
    return-object v0
.end method
