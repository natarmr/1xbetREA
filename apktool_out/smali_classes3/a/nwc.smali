.class public final La/nwc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/rwc;

.field public final synthetic k:Z

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/rwc;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nwc;->j:La/rwc;

    .line 2
    .line 3
    iput-boolean p2, p0, La/nwc;->k:Z

    .line 4
    .line 5
    iput p3, p0, La/nwc;->l:I

    .line 6
    .line 7
    iput-object p4, p0, La/nwc;->m:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p5, p0, La/nwc;->n:Z

    .line 10
    .line 11
    iput-object p6, p0, La/nwc;->o:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, La/nwc;->p:Ljava/lang/String;

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
    new-instance v0, La/nwc;

    .line 2
    .line 3
    iget-object v6, p0, La/nwc;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v7, p0, La/nwc;->p:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/nwc;->j:La/rwc;

    .line 8
    .line 9
    iget-boolean v2, p0, La/nwc;->k:Z

    .line 10
    .line 11
    iget v3, p0, La/nwc;->l:I

    .line 12
    .line 13
    iget-object v4, p0, La/nwc;->m:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v5, p0, La/nwc;->n:Z

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, La/nwc;-><init>(La/rwc;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;La/yje;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/nwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/nwc;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/nwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    sget-object v12, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v0, v11, La/nwc;->i:Z

    .line 6
    .line 7
    const/4 v13, 0x0

    .line 8
    const/4 v14, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v14

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v11, La/nwc;->j:La/rwc;

    .line 30
    .line 31
    iget-object v2, v0, La/rwc;->f:La/us3;

    .line 32
    .line 33
    iget-object v3, v0, La/rwc;->e:La/knf0;

    .line 34
    .line 35
    invoke-virtual {v2}, La/us3;->c()La/go3;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v0, v0, La/rwc;->b:La/do20;

    .line 40
    .line 41
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, La/go3;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    iput-boolean v1, v11, La/nwc;->i:Z

    .line 56
    .line 57
    iget-object v0, v0, La/do20;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, La/sza;

    .line 60
    .line 61
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/et5;

    .line 66
    .line 67
    new-instance v10, La/fk9;

    .line 68
    .line 69
    invoke-direct {v10, v13}, La/fk9;-><init>(Z)V

    .line 70
    .line 71
    .line 72
    const-string v2, "application/vnd.xenvelop+json"

    .line 73
    .line 74
    iget-boolean v3, v11, La/nwc;->k:Z

    .line 75
    .line 76
    move-object v1, v4

    .line 77
    iget v4, v11, La/nwc;->l:I

    .line 78
    .line 79
    const/16 v5, 0x54d

    .line 80
    .line 81
    iget-object v6, v11, La/nwc;->m:Ljava/lang/String;

    .line 82
    .line 83
    const/16 v7, 0x16

    .line 84
    .line 85
    iget-boolean v8, v11, La/nwc;->n:Z

    .line 86
    .line 87
    invoke-interface/range {v0 .. v11}, La/et5;->e(Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;IZLjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-ne v0, v12, :cond_2

    .line 92
    .line 93
    return-object v12

    .line 94
    :cond_2
    :goto_0
    check-cast v0, La/dx5;

    .line 95
    .line 96
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/Iterable;

    .line 101
    .line 102
    new-instance v1, Ljava/util/ArrayList;

    .line 103
    .line 104
    const/16 v2, 0xa

    .line 105
    .line 106
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_1b

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, La/lvc;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v4, v11, La/nwc;->o:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v5, v11, La/nwc;->p:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    sget-object v6, La/mvc;->b:La/cl5;

    .line 143
    .line 144
    iget-object v7, v3, La/lvc;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {v7}, La/cl5;->r(Ljava/lang/String;)La/mvc;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    iget-object v7, v3, La/lvc;->b:Ljava/lang/String;

    .line 154
    .line 155
    const-string v8, ""

    .line 156
    .line 157
    if-nez v7, :cond_3

    .line 158
    .line 159
    move-object v7, v8

    .line 160
    :cond_3
    iget-object v3, v3, La/lvc;->c:Ljava/util/List;

    .line 161
    .line 162
    if-eqz v3, :cond_1a

    .line 163
    .line 164
    new-instance v9, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-eqz v10, :cond_19

    .line 182
    .line 183
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    check-cast v10, La/l3b;

    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-object v12, v10, La/l3b;->a:Ljava/lang/Integer;

    .line 193
    .line 194
    if-eqz v12, :cond_4

    .line 195
    .line 196
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    move/from16 v16, v12

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_4
    move/from16 v16, v13

    .line 204
    .line 205
    :goto_3
    iget-object v12, v10, La/l3b;->b:Ljava/lang/String;

    .line 206
    .line 207
    if-eqz v12, :cond_5

    .line 208
    .line 209
    invoke-virtual {v4, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    goto :goto_4

    .line 214
    :cond_5
    move-object v12, v14

    .line 215
    :goto_4
    if-nez v12, :cond_6

    .line 216
    .line 217
    move-object/from16 v17, v8

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_6
    move-object/from16 v17, v12

    .line 221
    .line 222
    :goto_5
    iget-object v12, v10, La/l3b;->c:Ljava/lang/String;

    .line 223
    .line 224
    if-eqz v12, :cond_7

    .line 225
    .line 226
    invoke-virtual {v4, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    goto :goto_6

    .line 231
    :cond_7
    move-object v12, v14

    .line 232
    :goto_6
    if-nez v12, :cond_8

    .line 233
    .line 234
    move-object/from16 v18, v8

    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_8
    move-object/from16 v18, v12

    .line 238
    .line 239
    :goto_7
    iget-object v12, v10, La/l3b;->d:Ljava/lang/String;

    .line 240
    .line 241
    if-eqz v12, :cond_9

    .line 242
    .line 243
    invoke-virtual {v4, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    goto :goto_8

    .line 248
    :cond_9
    move-object v12, v14

    .line 249
    :goto_8
    if-nez v12, :cond_a

    .line 250
    .line 251
    move-object/from16 v19, v8

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_a
    move-object/from16 v19, v12

    .line 255
    .line 256
    :goto_9
    iget-object v12, v10, La/l3b;->e:Ljava/lang/String;

    .line 257
    .line 258
    if-eqz v12, :cond_b

    .line 259
    .line 260
    invoke-virtual {v4, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    goto :goto_a

    .line 265
    :cond_b
    move-object v12, v14

    .line 266
    :goto_a
    if-nez v12, :cond_c

    .line 267
    .line 268
    move-object/from16 v20, v8

    .line 269
    .line 270
    goto :goto_b

    .line 271
    :cond_c
    move-object/from16 v20, v12

    .line 272
    .line 273
    :goto_b
    iget-object v12, v10, La/l3b;->f:Ljava/lang/String;

    .line 274
    .line 275
    if-eqz v12, :cond_d

    .line 276
    .line 277
    invoke-virtual {v4, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    goto :goto_c

    .line 282
    :cond_d
    move-object v12, v14

    .line 283
    :goto_c
    if-nez v12, :cond_e

    .line 284
    .line 285
    move-object/from16 v21, v8

    .line 286
    .line 287
    goto :goto_d

    .line 288
    :cond_e
    move-object/from16 v21, v12

    .line 289
    .line 290
    :goto_d
    iget-object v12, v10, La/l3b;->g:Ljava/lang/String;

    .line 291
    .line 292
    if-eqz v12, :cond_f

    .line 293
    .line 294
    invoke-virtual {v4, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    goto :goto_e

    .line 299
    :cond_f
    move-object v12, v14

    .line 300
    :goto_e
    if-nez v12, :cond_10

    .line 301
    .line 302
    move-object/from16 v22, v8

    .line 303
    .line 304
    goto :goto_f

    .line 305
    :cond_10
    move-object/from16 v22, v12

    .line 306
    .line 307
    :goto_f
    sget-object v12, La/bp5;->b:La/yk5;

    .line 308
    .line 309
    iget-object v15, v10, La/l3b;->i:Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    sget-object v12, La/bp5;->c:[La/bp5;

    .line 315
    .line 316
    array-length v2, v12

    .line 317
    move v14, v13

    .line 318
    :goto_10
    if-ge v14, v2, :cond_13

    .line 319
    .line 320
    aget-object v13, v12, v14

    .line 321
    .line 322
    move-object/from16 v28, v0

    .line 323
    .line 324
    iget-byte v0, v13, La/bp5;->a:B

    .line 325
    .line 326
    move/from16 v23, v2

    .line 327
    .line 328
    if-nez v15, :cond_11

    .line 329
    .line 330
    goto :goto_11

    .line 331
    :cond_11
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-ne v0, v2, :cond_12

    .line 336
    .line 337
    goto :goto_12

    .line 338
    :cond_12
    :goto_11
    add-int/lit8 v14, v14, 0x1

    .line 339
    .line 340
    move/from16 v2, v23

    .line 341
    .line 342
    move-object/from16 v0, v28

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    goto :goto_10

    .line 346
    :cond_13
    move-object/from16 v28, v0

    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    :goto_12
    if-nez v13, :cond_14

    .line 350
    .line 351
    sget-object v13, La/bp5;->d:La/bp5;

    .line 352
    .line 353
    :cond_14
    move-object/from16 v23, v13

    .line 354
    .line 355
    iget-object v0, v10, La/l3b;->k:Ljava/lang/String;

    .line 356
    .line 357
    if-nez v0, :cond_15

    .line 358
    .line 359
    move-object v0, v8

    .line 360
    :cond_15
    const-string v2, "<p>"

    .line 361
    .line 362
    const/4 v12, 0x0

    .line 363
    invoke-static {v0, v2, v8, v12}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    const-string v13, "</p>"

    .line 368
    .line 369
    invoke-static {v0, v13, v8, v12}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v24

    .line 373
    iget-object v0, v10, La/l3b;->l:Ljava/lang/String;

    .line 374
    .line 375
    if-nez v0, :cond_16

    .line 376
    .line 377
    move-object v0, v8

    .line 378
    :cond_16
    invoke-static {v0, v2, v8, v12}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-static {v0, v13, v8, v12}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v25

    .line 386
    iget-object v0, v10, La/l3b;->j:Ljava/lang/String;

    .line 387
    .line 388
    if-eqz v0, :cond_17

    .line 389
    .line 390
    invoke-static {v0, v5}, La/uwc;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    goto :goto_13

    .line 395
    :cond_17
    const/4 v0, 0x0

    .line 396
    :goto_13
    if-nez v0, :cond_18

    .line 397
    .line 398
    move-object/from16 v27, v8

    .line 399
    .line 400
    goto :goto_14

    .line 401
    :cond_18
    move-object/from16 v27, v0

    .line 402
    .line 403
    :goto_14
    new-instance v15, La/uvc;

    .line 404
    .line 405
    const-string v26, ""

    .line 406
    .line 407
    invoke-direct/range {v15 .. v27}, La/uvc;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/bp5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move v13, v12

    .line 414
    move-object/from16 v0, v28

    .line 415
    .line 416
    const/16 v2, 0xa

    .line 417
    .line 418
    const/4 v14, 0x0

    .line 419
    goto/16 :goto_2

    .line 420
    .line 421
    :cond_19
    move-object/from16 v28, v0

    .line 422
    .line 423
    move v12, v13

    .line 424
    goto :goto_15

    .line 425
    :cond_1a
    move-object/from16 v28, v0

    .line 426
    .line 427
    move v12, v13

    .line 428
    sget-object v9, La/iun;->a:La/iun;

    .line 429
    .line 430
    :goto_15
    new-instance v0, La/awc;

    .line 431
    .line 432
    invoke-direct {v0, v6, v7, v9}, La/awc;-><init>(La/mvc;Ljava/lang/String;Ljava/util/List;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move v13, v12

    .line 439
    move-object/from16 v0, v28

    .line 440
    .line 441
    const/16 v2, 0xa

    .line 442
    .line 443
    const/4 v14, 0x0

    .line 444
    goto/16 :goto_1

    .line 445
    .line 446
    :cond_1b
    new-instance v0, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    :cond_1c
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    if-eqz v2, :cond_1d

    .line 460
    .line 461
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    move-object v3, v2

    .line 466
    check-cast v3, La/awc;

    .line 467
    .line 468
    iget-object v3, v3, La/awc;->c:Ljava/util/List;

    .line 469
    .line 470
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    if-nez v3, :cond_1c

    .line 475
    .line 476
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    goto :goto_16

    .line 480
    :cond_1d
    return-object v0
.end method
