.class public final La/wg70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/ql5;

.field public k:D

.field public l:B

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:La/w46;


# direct methods
.method public synthetic constructor <init>(La/w46;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/wg70;->i:B

    iput-object p1, p0, La/wg70;->n:La/w46;

    iput-object p2, p0, La/wg70;->m:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/wg70;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/wg70;->m:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/wg70;->n:La/w46;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/wg70;

    .line 11
    .line 12
    check-cast p0, La/ji70;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, p0, v0, p2, v1}, La/wg70;-><init>(La/w46;Ljava/lang/String;La/yje;B)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    new-instance p1, La/wg70;

    .line 20
    .line 21
    check-cast p0, La/eh70;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/wg70;-><init>(La/w46;Ljava/lang/String;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wg70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wg70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wg70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wg70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wg70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wg70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wg70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wg70;->i:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v6, v0, La/wg70;->n:La/w46;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x2

    .line 15
    iget-object v10, v0, La/wg70;->m:Ljava/lang/String;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v6, La/ji70;

    .line 21
    .line 22
    iget-object v1, v6, La/ji70;->w:La/p7m0;

    .line 23
    .line 24
    iget-object v11, v6, La/ji70;->f:La/k1u;

    .line 25
    .line 26
    iget-object v12, v6, La/ji70;->e:La/l1u;

    .line 27
    .line 28
    sget-object v13, La/wne;->a:La/wne;

    .line 29
    .line 30
    iget-byte v14, v0, La/wg70;->l:B

    .line 31
    .line 32
    if-eqz v14, :cond_2

    .line 33
    .line 34
    if-eq v14, v7, :cond_1

    .line 35
    .line 36
    if-ne v14, v9, :cond_0

    .line 37
    .line 38
    iget-wide v2, v0, La/wg70;->k:D

    .line 39
    .line 40
    iget-object v0, v0, La/wg70;->j:La/ql5;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v4, v0

    .line 46
    move-object/from16 v0, p1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_b

    .line 53
    .line 54
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object/from16 v4, p1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-byte v7, v0, La/wg70;->l:B

    .line 64
    .line 65
    sget-object v4, La/ji70;->y:Lkotlin/text/Regex;

    .line 66
    .line 67
    invoke-virtual {v6, v0}, La/ji70;->z(La/zje;)Ljava/io/Serializable;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    if-ne v4, v13, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :goto_0
    check-cast v4, La/ql5;

    .line 75
    .line 76
    invoke-static {v10}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    :cond_4
    iput-object v4, v0, La/wg70;->j:La/ql5;

    .line 87
    .line 88
    iput-wide v2, v0, La/wg70;->k:D

    .line 89
    .line 90
    iput-byte v9, v0, La/wg70;->l:B

    .line 91
    .line 92
    sget-object v5, La/ji70;->y:Lkotlin/text/Regex;

    .line 93
    .line 94
    invoke-virtual {v6, v2, v3, v0}, La/ji70;->y(DLa/zje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-ne v0, v13, :cond_5

    .line 99
    .line 100
    :goto_1
    move-object v4, v13

    .line 101
    goto/16 :goto_b

    .line 102
    .line 103
    :cond_5
    :goto_2
    check-cast v0, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 106
    .line 107
    .line 108
    move-result-wide v19

    .line 109
    invoke-virtual {v12}, La/l1u;->a()D

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    cmpg-double v0, v2, v5

    .line 114
    .line 115
    if-lez v0, :cond_7

    .line 116
    .line 117
    iget-wide v5, v4, La/ql5;->b:D

    .line 118
    .line 119
    invoke-virtual {v12}, La/l1u;->a()D

    .line 120
    .line 121
    .line 122
    move-result-wide v13

    .line 123
    cmpg-double v0, v5, v13

    .line 124
    .line 125
    if-gez v0, :cond_6

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    move/from16 v21, v8

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    :goto_3
    move/from16 v21, v7

    .line 132
    .line 133
    :goto_4
    iget-wide v5, v4, La/ql5;->b:D

    .line 134
    .line 135
    cmpl-double v0, v2, v5

    .line 136
    .line 137
    if-gez v0, :cond_9

    .line 138
    .line 139
    invoke-virtual {v12}, La/l1u;->a()D

    .line 140
    .line 141
    .line 142
    move-result-wide v13

    .line 143
    cmpg-double v0, v5, v13

    .line 144
    .line 145
    if-ltz v0, :cond_9

    .line 146
    .line 147
    invoke-virtual {v11}, La/k1u;->a()D

    .line 148
    .line 149
    .line 150
    move-result-wide v5

    .line 151
    cmpl-double v0, v2, v5

    .line 152
    .line 153
    if-ltz v0, :cond_8

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    move/from16 v23, v8

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_9
    :goto_5
    move/from16 v23, v7

    .line 160
    .line 161
    :goto_6
    invoke-virtual {v11}, La/k1u;->a()D

    .line 162
    .line 163
    .line 164
    move-result-wide v5

    .line 165
    cmpl-double v0, v2, v5

    .line 166
    .line 167
    if-gez v0, :cond_b

    .line 168
    .line 169
    iget-wide v4, v4, La/ql5;->b:D

    .line 170
    .line 171
    invoke-virtual {v12}, La/l1u;->a()D

    .line 172
    .line 173
    .line 174
    move-result-wide v13

    .line 175
    cmpg-double v0, v4, v13

    .line 176
    .line 177
    if-gez v0, :cond_a

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_a
    move/from16 v22, v8

    .line 181
    .line 182
    goto :goto_8

    .line 183
    :cond_b
    :goto_7
    move/from16 v22, v7

    .line 184
    .line 185
    :goto_8
    cmpg-double v0, v19, v2

    .line 186
    .line 187
    if-nez v0, :cond_d

    .line 188
    .line 189
    sget-object v0, La/ji70;->y:Lkotlin/text/Regex;

    .line 190
    .line 191
    invoke-virtual {v0, v10}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_f

    .line 196
    .line 197
    :cond_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    move-object v2, v0

    .line 202
    check-cast v2, La/bi70;

    .line 203
    .line 204
    const/16 v16, 0x0

    .line 205
    .line 206
    const/16 v17, 0x1bff

    .line 207
    .line 208
    const-wide/16 v3, 0x0

    .line 209
    .line 210
    const-wide/16 v5, 0x0

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const-wide/16 v8, 0x0

    .line 214
    .line 215
    const/4 v10, 0x0

    .line 216
    const/4 v11, 0x0

    .line 217
    const/4 v12, 0x0

    .line 218
    const/4 v13, 0x0

    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    invoke-static/range {v2 .. v17}, La/bi70;->a(La/bi70;DDLjava/lang/String;DZZZZZZZI)La/bi70;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_c

    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    move-object v13, v0

    .line 237
    check-cast v13, La/bi70;

    .line 238
    .line 239
    invoke-virtual {v12}, La/l1u;->a()D

    .line 240
    .line 241
    .line 242
    move-result-wide v2

    .line 243
    invoke-virtual {v11}, La/k1u;->a()D

    .line 244
    .line 245
    .line 246
    move-result-wide v4

    .line 247
    cmpg-double v4, v19, v4

    .line 248
    .line 249
    if-gtz v4, :cond_e

    .line 250
    .line 251
    cmpg-double v2, v2, v19

    .line 252
    .line 253
    if-gtz v2, :cond_e

    .line 254
    .line 255
    move/from16 v25, v7

    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_e
    move/from16 v25, v8

    .line 259
    .line 260
    :goto_9
    const/16 v27, 0x0

    .line 261
    .line 262
    const/16 v28, 0x180f

    .line 263
    .line 264
    const-wide/16 v14, 0x0

    .line 265
    .line 266
    const-wide/16 v16, 0x0

    .line 267
    .line 268
    const/16 v18, 0x0

    .line 269
    .line 270
    const/16 v26, 0x0

    .line 271
    .line 272
    move/from16 v24, v21

    .line 273
    .line 274
    invoke-static/range {v13 .. v28}, La/bi70;->a(La/bi70;DDLjava/lang/String;DZZZZZZZI)La/bi70;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_d

    .line 283
    .line 284
    :cond_f
    :goto_a
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    :goto_b
    return-object v4

    .line 287
    :pswitch_0
    check-cast v6, La/eh70;

    .line 288
    .line 289
    iget-object v1, v6, La/eh70;->z:La/p7m0;

    .line 290
    .line 291
    iget-object v11, v6, La/eh70;->f:La/k1u;

    .line 292
    .line 293
    iget-object v12, v6, La/eh70;->e:La/l1u;

    .line 294
    .line 295
    sget-object v13, La/wne;->a:La/wne;

    .line 296
    .line 297
    iget-byte v14, v0, La/wg70;->l:B

    .line 298
    .line 299
    if-eqz v14, :cond_12

    .line 300
    .line 301
    if-eq v14, v7, :cond_11

    .line 302
    .line 303
    if-ne v14, v9, :cond_10

    .line 304
    .line 305
    iget-wide v2, v0, La/wg70;->k:D

    .line 306
    .line 307
    iget-object v0, v0, La/wg70;->j:La/ql5;

    .line 308
    .line 309
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    move-object v4, v0

    .line 313
    move-object/from16 v0, p1

    .line 314
    .line 315
    goto :goto_e

    .line 316
    :cond_10
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_17

    .line 320
    .line 321
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    move-object/from16 v4, p1

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iput-byte v7, v0, La/wg70;->l:B

    .line 331
    .line 332
    sget-object v4, La/eh70;->C:Lkotlin/text/Regex;

    .line 333
    .line 334
    invoke-virtual {v6, v0}, La/eh70;->A(La/zje;)Ljava/io/Serializable;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    if-ne v4, v13, :cond_13

    .line 339
    .line 340
    goto :goto_d

    .line 341
    :cond_13
    :goto_c
    check-cast v4, La/ql5;

    .line 342
    .line 343
    invoke-static {v10}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    if-eqz v5, :cond_14

    .line 348
    .line 349
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 350
    .line 351
    .line 352
    move-result-wide v2

    .line 353
    :cond_14
    iput-object v4, v0, La/wg70;->j:La/ql5;

    .line 354
    .line 355
    iput-wide v2, v0, La/wg70;->k:D

    .line 356
    .line 357
    iput-byte v9, v0, La/wg70;->l:B

    .line 358
    .line 359
    sget-object v5, La/eh70;->C:Lkotlin/text/Regex;

    .line 360
    .line 361
    invoke-virtual {v6, v2, v3, v0}, La/eh70;->z(DLa/zje;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    if-ne v0, v13, :cond_15

    .line 366
    .line 367
    :goto_d
    move-object v4, v13

    .line 368
    goto/16 :goto_17

    .line 369
    .line 370
    :cond_15
    :goto_e
    check-cast v0, Ljava/lang/Number;

    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 373
    .line 374
    .line 375
    move-result-wide v19

    .line 376
    invoke-virtual {v12}, La/l1u;->a()D

    .line 377
    .line 378
    .line 379
    move-result-wide v5

    .line 380
    cmpg-double v0, v2, v5

    .line 381
    .line 382
    if-lez v0, :cond_17

    .line 383
    .line 384
    iget-wide v5, v4, La/ql5;->b:D

    .line 385
    .line 386
    invoke-virtual {v12}, La/l1u;->a()D

    .line 387
    .line 388
    .line 389
    move-result-wide v13

    .line 390
    cmpg-double v0, v5, v13

    .line 391
    .line 392
    if-gez v0, :cond_16

    .line 393
    .line 394
    goto :goto_f

    .line 395
    :cond_16
    move/from16 v21, v8

    .line 396
    .line 397
    goto :goto_10

    .line 398
    :cond_17
    :goto_f
    move/from16 v21, v7

    .line 399
    .line 400
    :goto_10
    iget-wide v5, v4, La/ql5;->b:D

    .line 401
    .line 402
    cmpl-double v0, v2, v5

    .line 403
    .line 404
    if-gez v0, :cond_19

    .line 405
    .line 406
    invoke-virtual {v12}, La/l1u;->a()D

    .line 407
    .line 408
    .line 409
    move-result-wide v13

    .line 410
    cmpg-double v0, v5, v13

    .line 411
    .line 412
    if-ltz v0, :cond_19

    .line 413
    .line 414
    invoke-virtual {v11}, La/k1u;->a()D

    .line 415
    .line 416
    .line 417
    move-result-wide v5

    .line 418
    cmpl-double v0, v2, v5

    .line 419
    .line 420
    if-ltz v0, :cond_18

    .line 421
    .line 422
    goto :goto_11

    .line 423
    :cond_18
    move/from16 v23, v8

    .line 424
    .line 425
    goto :goto_12

    .line 426
    :cond_19
    :goto_11
    move/from16 v23, v7

    .line 427
    .line 428
    :goto_12
    invoke-virtual {v11}, La/k1u;->a()D

    .line 429
    .line 430
    .line 431
    move-result-wide v5

    .line 432
    cmpl-double v0, v2, v5

    .line 433
    .line 434
    if-gez v0, :cond_1b

    .line 435
    .line 436
    iget-wide v4, v4, La/ql5;->b:D

    .line 437
    .line 438
    invoke-virtual {v12}, La/l1u;->a()D

    .line 439
    .line 440
    .line 441
    move-result-wide v13

    .line 442
    cmpg-double v0, v4, v13

    .line 443
    .line 444
    if-gez v0, :cond_1a

    .line 445
    .line 446
    goto :goto_13

    .line 447
    :cond_1a
    move/from16 v22, v8

    .line 448
    .line 449
    goto :goto_14

    .line 450
    :cond_1b
    :goto_13
    move/from16 v22, v7

    .line 451
    .line 452
    :goto_14
    cmpg-double v0, v19, v2

    .line 453
    .line 454
    if-nez v0, :cond_1d

    .line 455
    .line 456
    sget-object v0, La/eh70;->C:Lkotlin/text/Regex;

    .line 457
    .line 458
    invoke-virtual {v0, v10}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_1f

    .line 463
    .line 464
    :cond_1c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    move-object v2, v0

    .line 469
    check-cast v2, La/tg70;

    .line 470
    .line 471
    const/16 v16, 0x0

    .line 472
    .line 473
    const/16 v17, 0x1bff

    .line 474
    .line 475
    const-wide/16 v3, 0x0

    .line 476
    .line 477
    const-wide/16 v5, 0x0

    .line 478
    .line 479
    const/4 v7, 0x0

    .line 480
    const-wide/16 v8, 0x0

    .line 481
    .line 482
    const/4 v10, 0x0

    .line 483
    const/4 v11, 0x0

    .line 484
    const/4 v12, 0x0

    .line 485
    const/4 v13, 0x0

    .line 486
    const/4 v14, 0x0

    .line 487
    const/4 v15, 0x0

    .line 488
    invoke-static/range {v2 .. v17}, La/tg70;->a(La/tg70;DDLjava/lang/String;DZZZZZZZI)La/tg70;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_1c

    .line 497
    .line 498
    goto :goto_16

    .line 499
    :cond_1d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    move-object v13, v0

    .line 504
    check-cast v13, La/tg70;

    .line 505
    .line 506
    invoke-virtual {v12}, La/l1u;->a()D

    .line 507
    .line 508
    .line 509
    move-result-wide v2

    .line 510
    invoke-virtual {v11}, La/k1u;->a()D

    .line 511
    .line 512
    .line 513
    move-result-wide v4

    .line 514
    cmpg-double v4, v19, v4

    .line 515
    .line 516
    if-gtz v4, :cond_1e

    .line 517
    .line 518
    cmpg-double v2, v2, v19

    .line 519
    .line 520
    if-gtz v2, :cond_1e

    .line 521
    .line 522
    move/from16 v25, v7

    .line 523
    .line 524
    goto :goto_15

    .line 525
    :cond_1e
    move/from16 v25, v8

    .line 526
    .line 527
    :goto_15
    const/16 v27, 0x0

    .line 528
    .line 529
    const/16 v28, 0x180f

    .line 530
    .line 531
    const-wide/16 v14, 0x0

    .line 532
    .line 533
    const-wide/16 v16, 0x0

    .line 534
    .line 535
    const/16 v18, 0x0

    .line 536
    .line 537
    const/16 v26, 0x0

    .line 538
    .line 539
    move/from16 v24, v21

    .line 540
    .line 541
    invoke-static/range {v13 .. v28}, La/tg70;->a(La/tg70;DDLjava/lang/String;DZZZZZZZI)La/tg70;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    if-eqz v0, :cond_1d

    .line 550
    .line 551
    :cond_1f
    :goto_16
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 552
    .line 553
    :goto_17
    return-object v4

    .line 554
    nop

    .line 555
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
