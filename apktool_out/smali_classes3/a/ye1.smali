.class public final La/ye1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/vne;

.field public k:La/qgd;

.field public l:I

.field public m:I

.field public n:J

.field public o:B

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/qgd;

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(La/qgd;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ye1;->i:B

    iput-object p1, p0, La/ye1;->q:La/qgd;

    iput-wide p2, p0, La/ye1;->r:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ye1;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/ye1;

    .line 7
    .line 8
    iget-wide v3, p0, La/ye1;->r:J

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v2, p0, La/ye1;->q:La/qgd;

    .line 12
    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, La/ye1;-><init>(La/qgd;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v1, La/ye1;->p:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    move-object v5, p2

    .line 21
    new-instance v2, La/ye1;

    .line 22
    .line 23
    move-object v6, v5

    .line 24
    iget-wide v4, p0, La/ye1;->r:J

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    iget-object v3, p0, La/ye1;->q:La/qgd;

    .line 28
    .line 29
    invoke-direct/range {v2 .. v7}, La/ye1;-><init>(La/qgd;JLa/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v2, La/ye1;->p:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v2

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ye1;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ye1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ye1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ye1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ye1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ye1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ye1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-byte v0, v8, La/ye1;->i:B

    .line 4
    .line 5
    const-string v11, "): "

    .line 6
    .line 7
    const-string v12, "error ("

    .line 8
    .line 9
    iget-wide v1, v8, La/ye1;->r:J

    .line 10
    .line 11
    iget-object v3, v8, La/ye1;->q:La/qgd;

    .line 12
    .line 13
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v14, 0x1

    .line 16
    const/4 v5, 0x2

    .line 17
    const/4 v6, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v0, v8, La/ye1;->p:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, La/vne;

    .line 24
    .line 25
    sget-object v7, La/wne;->a:La/wne;

    .line 26
    .line 27
    iget-byte v9, v8, La/ye1;->o:B

    .line 28
    .line 29
    if-eqz v9, :cond_2

    .line 30
    .line 31
    if-eq v9, v14, :cond_1

    .line 32
    .line 33
    if-ne v9, v5, :cond_0

    .line 34
    .line 35
    iget v0, v8, La/ye1;->m:I

    .line 36
    .line 37
    iget-wide v1, v8, La/ye1;->n:J

    .line 38
    .line 39
    iget v3, v8, La/ye1;->l:I

    .line 40
    .line 41
    iget-object v4, v8, La/ye1;->k:La/qgd;

    .line 42
    .line 43
    iget-object v9, v8, La/ye1;->j:La/vne;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object v10, v4

    .line 49
    move v4, v3

    .line 50
    move-wide v2, v1

    .line 51
    move-object v1, v10

    .line 52
    move v10, v0

    .line 53
    move-object v15, v6

    .line 54
    move-object v13, v7

    .line 55
    move/from16 v19, v14

    .line 56
    .line 57
    move v14, v5

    .line 58
    goto/16 :goto_c

    .line 59
    .line 60
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_f

    .line 64
    .line 65
    :cond_1
    iget v1, v8, La/ye1;->m:I

    .line 66
    .line 67
    iget-wide v2, v8, La/ye1;->n:J

    .line 68
    .line 69
    iget v4, v8, La/ye1;->l:I

    .line 70
    .line 71
    iget-object v9, v8, La/ye1;->k:La/qgd;

    .line 72
    .line 73
    iget-object v10, v8, La/ye1;->j:La/vne;

    .line 74
    .line 75
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    move-object/from16 v0, p1

    .line 79
    .line 80
    move-object v15, v6

    .line 81
    move-object v13, v7

    .line 82
    move/from16 v19, v14

    .line 83
    .line 84
    move v14, v5

    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object v15, v6

    .line 89
    move-object v13, v7

    .line 90
    move/from16 v19, v14

    .line 91
    .line 92
    move v14, v5

    .line 93
    goto/16 :goto_7

    .line 94
    .line 95
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-wide v9, v1

    .line 99
    move-object v1, v3

    .line 100
    move-wide v2, v9

    .line 101
    move-object v9, v0

    .line 102
    const/4 v4, 0x0

    .line 103
    const/4 v10, 0x0

    .line 104
    :goto_0
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_a

    .line 105
    .line 106
    :try_start_2
    iget-object v0, v1, La/qgd;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, La/he1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_9

    .line 109
    .line 110
    :try_start_3
    iget-object v5, v1, La/qgd;->f:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v5, La/btt0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    .line 113
    .line 114
    :try_start_4
    invoke-virtual {v5}, La/btt0;->a()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_7

    .line 118
    :try_start_5
    iget-object v13, v1, La/qgd;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v13, La/knf0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    .line 121
    .line 122
    :try_start_6
    invoke-virtual {v13}, La/knf0;->b()I

    .line 123
    .line 124
    .line 125
    move-result v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 126
    :try_start_7
    iget-object v15, v1, La/qgd;->d:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v15, La/knf0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 129
    .line 130
    :try_start_8
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iput-object v6, v8, La/ye1;->p:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v9, v8, La/ye1;->j:La/vne;

    .line 136
    .line 137
    iput-object v1, v8, La/ye1;->k:La/qgd;

    .line 138
    .line 139
    iput v4, v8, La/ye1;->l:I

    .line 140
    .line 141
    iput-wide v2, v8, La/ye1;->n:J

    .line 142
    .line 143
    iput v10, v8, La/ye1;->m:I

    .line 144
    .line 145
    iput-byte v14, v8, La/ye1;->o:B
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 146
    .line 147
    :try_start_9
    iget-object v0, v0, La/he1;->a:La/n0o0;

    .line 148
    .line 149
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, La/wd1;

    .line 154
    .line 155
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v13
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 159
    move-object v15, v6

    .line 160
    :try_start_a
    const-string v6, "application/vnd.xenvelop+json"
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 161
    .line 162
    move-object/from16 v18, v7

    .line 163
    .line 164
    :try_start_b
    new-instance v7, La/fk9;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 165
    .line 166
    const/4 v15, 0x0

    .line 167
    :try_start_c
    invoke-direct {v7, v15}, La/fk9;-><init>(Z)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 168
    .line 169
    .line 170
    move v15, v4

    .line 171
    const/16 v4, 0x16

    .line 172
    .line 173
    move-object/from16 v16, v1

    .line 174
    .line 175
    move-object v1, v5

    .line 176
    move-object v5, v13

    .line 177
    move/from16 v19, v14

    .line 178
    .line 179
    move-object/from16 v13, v18

    .line 180
    .line 181
    const/4 v14, 0x2

    .line 182
    move/from16 v18, v15

    .line 183
    .line 184
    const/4 v15, 0x0

    .line 185
    :try_start_d
    invoke-interface/range {v0 .. v8}, La/wd1;->d(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 189
    if-ne v0, v13, :cond_3

    .line 190
    .line 191
    goto/16 :goto_b

    .line 192
    .line 193
    :cond_3
    move v1, v10

    .line 194
    move/from16 v4, v18

    .line 195
    .line 196
    move-object v10, v9

    .line 197
    move-object/from16 v9, v16

    .line 198
    .line 199
    :goto_1
    :try_start_e
    check-cast v0, La/dx5;

    .line 200
    .line 201
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, La/c75;

    .line 206
    .line 207
    invoke-static {v0}, La/tke;->d0(La/c75;)Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 212
    .line 213
    goto/16 :goto_e

    .line 214
    .line 215
    :catchall_1
    move-exception v0

    .line 216
    goto/16 :goto_7

    .line 217
    .line 218
    :catchall_2
    move-exception v0

    .line 219
    goto :goto_4

    .line 220
    :catchall_3
    move-exception v0

    .line 221
    move-object/from16 v16, v1

    .line 222
    .line 223
    move/from16 v19, v14

    .line 224
    .line 225
    move-object/from16 v13, v18

    .line 226
    .line 227
    const/4 v14, 0x2

    .line 228
    const/4 v15, 0x0

    .line 229
    :goto_2
    move/from16 v18, v4

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :catchall_4
    move-exception v0

    .line 233
    move-object/from16 v16, v1

    .line 234
    .line 235
    move/from16 v19, v14

    .line 236
    .line 237
    move-object/from16 v13, v18

    .line 238
    .line 239
    const/4 v14, 0x2

    .line 240
    goto :goto_2

    .line 241
    :catchall_5
    move-exception v0

    .line 242
    move-object/from16 v16, v1

    .line 243
    .line 244
    move/from16 v18, v4

    .line 245
    .line 246
    :goto_3
    move-object v13, v7

    .line 247
    move/from16 v19, v14

    .line 248
    .line 249
    const/4 v14, 0x2

    .line 250
    goto :goto_4

    .line 251
    :catchall_6
    move-exception v0

    .line 252
    move-object/from16 v16, v1

    .line 253
    .line 254
    move/from16 v18, v4

    .line 255
    .line 256
    move-object v15, v6

    .line 257
    goto :goto_3

    .line 258
    :goto_4
    move v1, v10

    .line 259
    move/from16 v4, v18

    .line 260
    .line 261
    :goto_5
    move-object v10, v9

    .line 262
    move-object/from16 v9, v16

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :catchall_7
    move-exception v0

    .line 266
    move-object/from16 v16, v1

    .line 267
    .line 268
    move/from16 v18, v4

    .line 269
    .line 270
    move-object v15, v6

    .line 271
    move-object v13, v7

    .line 272
    move/from16 v19, v14

    .line 273
    .line 274
    const/4 v14, 0x2

    .line 275
    :goto_6
    move v1, v10

    .line 276
    goto :goto_5

    .line 277
    :catchall_8
    move-exception v0

    .line 278
    move-object/from16 v16, v1

    .line 279
    .line 280
    move/from16 v18, v4

    .line 281
    .line 282
    move-object v15, v6

    .line 283
    goto :goto_3

    .line 284
    :catchall_9
    move-exception v0

    .line 285
    move-object/from16 v16, v1

    .line 286
    .line 287
    move/from16 v18, v4

    .line 288
    .line 289
    move-object v15, v6

    .line 290
    move-object v13, v7

    .line 291
    move/from16 v19, v14

    .line 292
    .line 293
    move v14, v5

    .line 294
    goto :goto_4

    .line 295
    :catchall_a
    move-exception v0

    .line 296
    move-object/from16 v16, v1

    .line 297
    .line 298
    move/from16 v18, v4

    .line 299
    .line 300
    move-object v15, v6

    .line 301
    move-object v13, v7

    .line 302
    move/from16 v19, v14

    .line 303
    .line 304
    move v14, v5

    .line 305
    goto :goto_6

    .line 306
    :goto_7
    if-eqz v4, :cond_4

    .line 307
    .line 308
    instance-of v5, v0, La/zhi0;

    .line 309
    .line 310
    if-eqz v5, :cond_4

    .line 311
    .line 312
    move-object v5, v0

    .line 313
    check-cast v5, La/zhi0;

    .line 314
    .line 315
    iget-boolean v5, v5, La/zhi0;->e:Z

    .line 316
    .line 317
    if-eqz v5, :cond_4

    .line 318
    .line 319
    move/from16 v5, v19

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_4
    const/4 v5, 0x0

    .line 323
    :goto_8
    instance-of v6, v0, Ljava/util/concurrent/CancellationException;

    .line 324
    .line 325
    if-nez v6, :cond_b

    .line 326
    .line 327
    instance-of v6, v0, Ljava/net/ConnectException;

    .line 328
    .line 329
    if-nez v6, :cond_b

    .line 330
    .line 331
    if-nez v5, :cond_b

    .line 332
    .line 333
    instance-of v5, v0, La/zhi0;

    .line 334
    .line 335
    if-eqz v5, :cond_7

    .line 336
    .line 337
    move-object v5, v0

    .line 338
    check-cast v5, La/zhi0;

    .line 339
    .line 340
    iget-boolean v6, v5, La/zhi0;->f:Z

    .line 341
    .line 342
    if-nez v6, :cond_6

    .line 343
    .line 344
    iget-boolean v5, v5, La/zhi0;->e:Z

    .line 345
    .line 346
    if-eqz v5, :cond_5

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_5
    const/4 v5, 0x0

    .line 350
    goto :goto_a

    .line 351
    :cond_6
    :goto_9
    move/from16 v5, v19

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :cond_7
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    if-nez v5, :cond_5

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :goto_a
    add-int/lit8 v1, v1, 0x1

    .line 362
    .line 363
    const/4 v6, 0x3

    .line 364
    if-gt v1, v6, :cond_a

    .line 365
    .line 366
    if-eqz v5, :cond_8

    .line 367
    .line 368
    goto :goto_d

    .line 369
    :cond_8
    invoke-static {v1, v12, v11, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 374
    .line 375
    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    iput-object v15, v8, La/ye1;->p:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v10, v8, La/ye1;->j:La/vne;

    .line 381
    .line 382
    iput-object v9, v8, La/ye1;->k:La/qgd;

    .line 383
    .line 384
    iput v4, v8, La/ye1;->l:I

    .line 385
    .line 386
    iput-wide v2, v8, La/ye1;->n:J

    .line 387
    .line 388
    iput v1, v8, La/ye1;->m:I

    .line 389
    .line 390
    iput-byte v14, v8, La/ye1;->o:B

    .line 391
    .line 392
    const-wide/16 v5, 0xbb8

    .line 393
    .line 394
    invoke-static {v5, v6, v8}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-ne v0, v13, :cond_9

    .line 399
    .line 400
    :goto_b
    move-object v6, v13

    .line 401
    goto :goto_f

    .line 402
    :cond_9
    move-object/from16 v20, v10

    .line 403
    .line 404
    move v10, v1

    .line 405
    move-object v1, v9

    .line 406
    move-object/from16 v9, v20

    .line 407
    .line 408
    :goto_c
    move-object v7, v13

    .line 409
    move v5, v14

    .line 410
    move-object v6, v15

    .line 411
    move/from16 v14, v19

    .line 412
    .line 413
    goto/16 :goto_0

    .line 414
    .line 415
    :cond_a
    :goto_d
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 416
    .line 417
    new-instance v1, La/g0g0;

    .line 418
    .line 419
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 420
    .line 421
    .line 422
    move-object v0, v1

    .line 423
    :goto_e
    new-instance v6, La/j0g0;

    .line 424
    .line 425
    invoke-direct {v6, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :goto_f
    return-object v6

    .line 429
    :cond_b
    throw v0

    .line 430
    :pswitch_0
    move-object v15, v6

    .line 431
    move/from16 v19, v14

    .line 432
    .line 433
    move v14, v5

    .line 434
    iget-object v0, v8, La/ye1;->p:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v0, La/vne;

    .line 437
    .line 438
    sget-object v9, La/wne;->a:La/wne;

    .line 439
    .line 440
    iget-byte v5, v8, La/ye1;->o:B

    .line 441
    .line 442
    if-eqz v5, :cond_e

    .line 443
    .line 444
    move/from16 v6, v19

    .line 445
    .line 446
    if-eq v5, v6, :cond_d

    .line 447
    .line 448
    if-ne v5, v14, :cond_c

    .line 449
    .line 450
    iget v0, v8, La/ye1;->m:I

    .line 451
    .line 452
    iget-wide v1, v8, La/ye1;->n:J

    .line 453
    .line 454
    iget v3, v8, La/ye1;->l:I

    .line 455
    .line 456
    iget-object v4, v8, La/ye1;->k:La/qgd;

    .line 457
    .line 458
    iget-object v5, v8, La/ye1;->j:La/vne;

    .line 459
    .line 460
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    move-object/from16 v16, v11

    .line 464
    .line 465
    move v13, v14

    .line 466
    const/4 v7, 0x1

    .line 467
    const-wide/16 v10, 0xbb8

    .line 468
    .line 469
    const/4 v14, 0x0

    .line 470
    move-wide/from16 v20, v1

    .line 471
    .line 472
    move v2, v0

    .line 473
    move v1, v3

    .line 474
    move-object v0, v4

    .line 475
    :goto_10
    move-wide/from16 v3, v20

    .line 476
    .line 477
    goto/16 :goto_1a

    .line 478
    .line 479
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    move-object v6, v15

    .line 483
    goto/16 :goto_1d

    .line 484
    .line 485
    :cond_d
    iget v1, v8, La/ye1;->m:I

    .line 486
    .line 487
    iget-wide v2, v8, La/ye1;->n:J

    .line 488
    .line 489
    iget v4, v8, La/ye1;->l:I

    .line 490
    .line 491
    iget-object v5, v8, La/ye1;->k:La/qgd;

    .line 492
    .line 493
    iget-object v6, v8, La/ye1;->j:La/vne;

    .line 494
    .line 495
    :try_start_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 496
    .line 497
    .line 498
    move-object/from16 v0, p1

    .line 499
    .line 500
    const/4 v14, 0x0

    .line 501
    goto :goto_12

    .line 502
    :catchall_b
    move-exception v0

    .line 503
    const/4 v14, 0x0

    .line 504
    goto/16 :goto_15

    .line 505
    .line 506
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    move-object v10, v0

    .line 510
    move-object v13, v3

    .line 511
    move-wide v3, v1

    .line 512
    const/4 v1, 0x0

    .line 513
    const/4 v2, 0x0

    .line 514
    :goto_11
    :try_start_10
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 515
    .line 516
    iget-object v0, v13, La/qgd;->b:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, La/he1;

    .line 519
    .line 520
    iget-object v5, v13, La/qgd;->f:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v5, La/btt0;

    .line 523
    .line 524
    invoke-virtual {v5}, La/btt0;->a()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    iget-object v6, v13, La/qgd;->d:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v6, La/knf0;

    .line 531
    .line 532
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    iget-object v6, v13, La/qgd;->h:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v6, La/kuy;

    .line 538
    .line 539
    invoke-virtual {v6}, La/kuy;->a()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v6

    .line 543
    iput-object v15, v8, La/ye1;->p:Ljava/lang/Object;

    .line 544
    .line 545
    iput-object v10, v8, La/ye1;->j:La/vne;

    .line 546
    .line 547
    iput-object v13, v8, La/ye1;->k:La/qgd;

    .line 548
    .line 549
    iput v1, v8, La/ye1;->l:I

    .line 550
    .line 551
    iput-wide v3, v8, La/ye1;->n:J

    .line 552
    .line 553
    iput v2, v8, La/ye1;->m:I

    .line 554
    .line 555
    const/4 v7, 0x1

    .line 556
    iput-byte v7, v8, La/ye1;->o:B
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_12

    .line 557
    .line 558
    :try_start_11
    iget-object v0, v0, La/he1;->a:La/n0o0;

    .line 559
    .line 560
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    check-cast v0, La/wd1;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    .line 565
    .line 566
    move v7, v2

    .line 567
    :try_start_12
    const-string v2, "application/vnd.xenvelop+json"
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_10

    .line 568
    .line 569
    move/from16 v16, v7

    .line 570
    .line 571
    :try_start_13
    new-instance v7, La/fk9;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_f

    .line 572
    .line 573
    const/4 v14, 0x0

    .line 574
    :try_start_14
    invoke-direct {v7, v14}, La/fk9;-><init>(Z)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_e

    .line 575
    .line 576
    .line 577
    move/from16 v17, v1

    .line 578
    .line 579
    move-object v1, v5

    .line 580
    move-object v5, v6

    .line 581
    const/16 v6, 0x16

    .line 582
    .line 583
    :try_start_15
    invoke-interface/range {v0 .. v8}, La/wd1;->a(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILa/fk9;La/yje;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_d

    .line 587
    if-ne v0, v9, :cond_f

    .line 588
    .line 589
    goto/16 :goto_19

    .line 590
    .line 591
    :cond_f
    move-wide v2, v3

    .line 592
    move-object v6, v10

    .line 593
    move-object v5, v13

    .line 594
    move/from16 v1, v16

    .line 595
    .line 596
    move/from16 v4, v17

    .line 597
    .line 598
    :goto_12
    :try_start_16
    check-cast v0, La/k65;

    .line 599
    .line 600
    invoke-static {v0}, La/o2e;->g0(La/k65;)La/l65;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    iget-object v0, v0, La/l65;->a:Ljava/util/List;

    .line 605
    .line 606
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    .line 607
    .line 608
    goto/16 :goto_1c

    .line 609
    .line 610
    :catchall_c
    move-exception v0

    .line 611
    goto :goto_15

    .line 612
    :catchall_d
    move-exception v0

    .line 613
    goto :goto_13

    .line 614
    :catchall_e
    move-exception v0

    .line 615
    move/from16 v17, v1

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :catchall_f
    move-exception v0

    .line 619
    move/from16 v17, v1

    .line 620
    .line 621
    goto :goto_14

    .line 622
    :catchall_10
    move-exception v0

    .line 623
    move/from16 v17, v1

    .line 624
    .line 625
    move/from16 v16, v7

    .line 626
    .line 627
    goto :goto_14

    .line 628
    :catchall_11
    move-exception v0

    .line 629
    move/from16 v17, v1

    .line 630
    .line 631
    move/from16 v16, v2

    .line 632
    .line 633
    goto :goto_14

    .line 634
    :goto_13
    move-wide v2, v3

    .line 635
    move-object v6, v10

    .line 636
    move-object v5, v13

    .line 637
    move/from16 v1, v16

    .line 638
    .line 639
    move/from16 v4, v17

    .line 640
    .line 641
    goto :goto_15

    .line 642
    :catchall_12
    move-exception v0

    .line 643
    move/from16 v17, v1

    .line 644
    .line 645
    move/from16 v16, v2

    .line 646
    .line 647
    :goto_14
    const/4 v14, 0x0

    .line 648
    goto :goto_13

    .line 649
    :goto_15
    if-eqz v4, :cond_10

    .line 650
    .line 651
    instance-of v7, v0, La/zhi0;

    .line 652
    .line 653
    if-eqz v7, :cond_10

    .line 654
    .line 655
    move-object v7, v0

    .line 656
    check-cast v7, La/zhi0;

    .line 657
    .line 658
    iget-boolean v7, v7, La/zhi0;->e:Z

    .line 659
    .line 660
    if-eqz v7, :cond_10

    .line 661
    .line 662
    const/4 v7, 0x1

    .line 663
    goto :goto_16

    .line 664
    :cond_10
    move v7, v14

    .line 665
    :goto_16
    instance-of v10, v0, Ljava/util/concurrent/CancellationException;

    .line 666
    .line 667
    if-nez v10, :cond_17

    .line 668
    .line 669
    instance-of v10, v0, Ljava/net/ConnectException;

    .line 670
    .line 671
    if-nez v10, :cond_17

    .line 672
    .line 673
    if-nez v7, :cond_17

    .line 674
    .line 675
    instance-of v7, v0, La/zhi0;

    .line 676
    .line 677
    if-eqz v7, :cond_13

    .line 678
    .line 679
    move-object v7, v0

    .line 680
    check-cast v7, La/zhi0;

    .line 681
    .line 682
    iget-boolean v10, v7, La/zhi0;->f:Z

    .line 683
    .line 684
    if-nez v10, :cond_12

    .line 685
    .line 686
    iget-boolean v7, v7, La/zhi0;->e:Z

    .line 687
    .line 688
    if-eqz v7, :cond_11

    .line 689
    .line 690
    goto :goto_17

    .line 691
    :cond_11
    move/from16 v19, v14

    .line 692
    .line 693
    const/4 v7, 0x1

    .line 694
    goto :goto_18

    .line 695
    :cond_12
    :goto_17
    const/4 v7, 0x1

    .line 696
    const/16 v19, 0x1

    .line 697
    .line 698
    goto :goto_18

    .line 699
    :cond_13
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    if-nez v7, :cond_11

    .line 704
    .line 705
    goto :goto_17

    .line 706
    :goto_18
    add-int/2addr v1, v7

    .line 707
    const/4 v10, 0x3

    .line 708
    if-gt v1, v10, :cond_16

    .line 709
    .line 710
    if-eqz v19, :cond_14

    .line 711
    .line 712
    goto :goto_1b

    .line 713
    :cond_14
    invoke-static {v1, v12, v11, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    sget-object v13, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 718
    .line 719
    invoke-virtual {v13, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    iput-object v15, v8, La/ye1;->p:Ljava/lang/Object;

    .line 723
    .line 724
    iput-object v6, v8, La/ye1;->j:La/vne;

    .line 725
    .line 726
    iput-object v5, v8, La/ye1;->k:La/qgd;

    .line 727
    .line 728
    iput v4, v8, La/ye1;->l:I

    .line 729
    .line 730
    iput-wide v2, v8, La/ye1;->n:J

    .line 731
    .line 732
    iput v1, v8, La/ye1;->m:I

    .line 733
    .line 734
    const/4 v13, 0x2

    .line 735
    iput-byte v13, v8, La/ye1;->o:B

    .line 736
    .line 737
    move-object/from16 v16, v11

    .line 738
    .line 739
    const-wide/16 v10, 0xbb8

    .line 740
    .line 741
    invoke-static {v10, v11, v8}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    if-ne v0, v9, :cond_15

    .line 746
    .line 747
    :goto_19
    move-object v6, v9

    .line 748
    goto :goto_1d

    .line 749
    :cond_15
    move-wide/from16 v20, v2

    .line 750
    .line 751
    move v2, v1

    .line 752
    move v1, v4

    .line 753
    move-object v0, v5

    .line 754
    move-object v5, v6

    .line 755
    goto/16 :goto_10

    .line 756
    .line 757
    :goto_1a
    move-object v10, v5

    .line 758
    move v14, v13

    .line 759
    move-object/from16 v11, v16

    .line 760
    .line 761
    move-object v13, v0

    .line 762
    goto/16 :goto_11

    .line 763
    .line 764
    :cond_16
    :goto_1b
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 765
    .line 766
    new-instance v1, La/g0g0;

    .line 767
    .line 768
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 769
    .line 770
    .line 771
    move-object v0, v1

    .line 772
    :goto_1c
    new-instance v6, La/j0g0;

    .line 773
    .line 774
    invoke-direct {v6, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    :goto_1d
    return-object v6

    .line 778
    :cond_17
    throw v0

    .line 779
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
