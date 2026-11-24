.class public final La/y87;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/ptt;

.field public k:B

.field public final synthetic l:La/f97;

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/f97;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/y87;->i:B

    iput-object p1, p0, La/y87;->l:La/f97;

    iput-object p2, p0, La/y87;->m:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/y87;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/y87;->m:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/y87;->l:La/f97;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/y87;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/y87;-><init>(La/f97;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/y87;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/y87;-><init>(La/f97;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/y87;->i:B

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
    invoke-virtual {p0, p1, p2}, La/y87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/y87;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/y87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/y87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/y87;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/y87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/y87;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/y87;->m:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v4, v0, La/y87;->l:La/f97;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    sget-object v8, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v9, v0, La/y87;->k:B

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v5, :cond_1

    .line 26
    .line 27
    if-ne v9, v6, :cond_0

    .line 28
    .line 29
    iget-object v0, v0, La/y87;->j:La/ptt;

    .line 30
    .line 31
    check-cast v0, La/cn7;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_7

    .line 42
    .line 43
    :cond_1
    iget-object v3, v0, La/y87;->j:La/ptt;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 v5, p1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget v3, La/f97;->R0:I

    .line 55
    .line 56
    iget-object v9, v1, La/ocj;->a:La/p7m0;

    .line 57
    .line 58
    :cond_3
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-object v10, v3

    .line 66
    check-cast v10, La/i77;

    .line 67
    .line 68
    const v38, -0x400001

    .line 69
    .line 70
    .line 71
    const/16 v39, 0x7ff

    .line 72
    .line 73
    const/4 v11, 0x0

    .line 74
    const/4 v12, 0x0

    .line 75
    const/4 v13, 0x0

    .line 76
    const/4 v14, 0x0

    .line 77
    const/4 v15, 0x0

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const/16 v19, 0x0

    .line 85
    .line 86
    const/16 v20, 0x0

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const/16 v22, 0x0

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v24, 0x0

    .line 95
    .line 96
    const/16 v25, 0x0

    .line 97
    .line 98
    const/16 v26, 0x0

    .line 99
    .line 100
    const/16 v27, 0x0

    .line 101
    .line 102
    const/16 v28, 0x1

    .line 103
    .line 104
    const/16 v29, 0x0

    .line 105
    .line 106
    const/16 v30, 0x0

    .line 107
    .line 108
    const/16 v31, 0x0

    .line 109
    .line 110
    const/16 v32, 0x0

    .line 111
    .line 112
    const/16 v33, 0x0

    .line 113
    .line 114
    const/16 v34, 0x0

    .line 115
    .line 116
    const/16 v35, 0x0

    .line 117
    .line 118
    const/16 v36, 0x0

    .line 119
    .line 120
    const/16 v37, 0x0

    .line 121
    .line 122
    invoke-static/range {v10 .. v39}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-virtual {v9, v3, v10}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    iget-object v3, v4, La/f97;->g0:La/ptt;

    .line 133
    .line 134
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    check-cast v9, La/i77;

    .line 139
    .line 140
    iget-object v9, v9, La/i77;->e:La/ql5;

    .line 141
    .line 142
    if-eqz v9, :cond_4

    .line 143
    .line 144
    iget-wide v9, v9, La/ql5;->a:J

    .line 145
    .line 146
    :goto_0
    move-wide v10, v9

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    iput-object v3, v0, La/y87;->j:La/ptt;

    .line 149
    .line 150
    iput-byte v5, v0, La/y87;->k:B

    .line 151
    .line 152
    invoke-virtual {v4, v0}, La/f97;->S(La/yje;)Ljava/io/Serializable;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    if-ne v5, v8, :cond_5

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_5
    :goto_1
    check-cast v5, La/ql5;

    .line 160
    .line 161
    iget-wide v9, v5, La/ql5;->a:J

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :goto_2
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, La/i77;

    .line 169
    .line 170
    iget-object v9, v5, La/i77;->l:La/wdj;

    .line 171
    .line 172
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, La/i77;

    .line 177
    .line 178
    iget-object v13, v5, La/i77;->m:Ljava/util/List;

    .line 179
    .line 180
    iget-object v5, v4, La/f97;->i0:La/k7u;

    .line 181
    .line 182
    iget-object v5, v5, La/k7u;->a:La/uzc;

    .line 183
    .line 184
    invoke-virtual {v5}, La/uzc;->b()La/jvn;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-virtual {v5}, La/jvn;->getId()I

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    iget-object v5, v4, La/f97;->p:Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 193
    .line 194
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    check-cast v14, La/i77;

    .line 199
    .line 200
    iget v14, v14, La/i77;->A:I

    .line 201
    .line 202
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    check-cast v15, La/i77;

    .line 207
    .line 208
    iget-object v15, v15, La/i77;->F:Ljava/util/List;

    .line 209
    .line 210
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-object/from16 v16, v5

    .line 214
    .line 215
    invoke-static/range {v9 .. v16}, La/ptt;->a(La/wdj;JILjava/util/List;ILjava/util/List;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)La/cn7;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    iget-object v5, v4, La/f97;->f0:La/hpi0;

    .line 220
    .line 221
    iput-object v7, v0, La/y87;->j:La/ptt;

    .line 222
    .line 223
    iput-byte v6, v0, La/y87;->k:B

    .line 224
    .line 225
    iget-object v5, v5, La/hpi0;->a:La/mii0;

    .line 226
    .line 227
    invoke-virtual {v5, v3, v0}, La/mii0;->V(La/cn7;La/zje;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    if-ne v0, v8, :cond_6

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    :goto_3
    if-ne v0, v8, :cond_7

    .line 237
    .line 238
    :goto_4
    move-object v7, v8

    .line 239
    goto :goto_7

    .line 240
    :cond_7
    :goto_5
    sget v0, La/f97;->R0:I

    .line 241
    .line 242
    invoke-virtual {v4, v2}, La/f97;->R(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v4, v0}, La/f97;->Y(Ljava/util/List;)Ljava/util/HashMap;

    .line 247
    .line 248
    .line 249
    move-result-object v30

    .line 250
    iget-object v2, v4, La/f97;->R:La/sqc;

    .line 251
    .line 252
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    check-cast v3, La/i77;

    .line 257
    .line 258
    iget-object v3, v3, La/i77;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 259
    .line 260
    invoke-virtual {v2, v3}, La/sqc;->a(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/ov7;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    invoke-virtual {v4, v0}, La/f97;->Z(Ljava/util/List;)La/qgv0;

    .line 265
    .line 266
    .line 267
    move-result-object v22

    .line 268
    iget-object v3, v1, La/ocj;->a:La/p7m0;

    .line 269
    .line 270
    :goto_6
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-object v5, v1

    .line 278
    check-cast v5, La/i77;

    .line 279
    .line 280
    const v33, -0x680081

    .line 281
    .line 282
    .line 283
    const/16 v34, 0x7fd

    .line 284
    .line 285
    const/4 v6, 0x0

    .line 286
    const/4 v7, 0x0

    .line 287
    const/4 v8, 0x0

    .line 288
    const/4 v9, 0x0

    .line 289
    const/4 v10, 0x0

    .line 290
    const/4 v12, 0x0

    .line 291
    const/4 v13, 0x0

    .line 292
    const/4 v14, 0x0

    .line 293
    const/4 v15, 0x0

    .line 294
    const/16 v16, 0x0

    .line 295
    .line 296
    const/16 v17, 0x0

    .line 297
    .line 298
    const/16 v18, 0x0

    .line 299
    .line 300
    const/16 v19, 0x0

    .line 301
    .line 302
    const/16 v21, 0x0

    .line 303
    .line 304
    const/16 v23, 0x0

    .line 305
    .line 306
    const/16 v24, 0x0

    .line 307
    .line 308
    const/16 v25, 0x0

    .line 309
    .line 310
    const/16 v26, 0x0

    .line 311
    .line 312
    const/16 v27, 0x0

    .line 313
    .line 314
    const/16 v28, 0x0

    .line 315
    .line 316
    const/16 v29, 0x0

    .line 317
    .line 318
    const/16 v31, 0x0

    .line 319
    .line 320
    const/16 v32, 0x0

    .line 321
    .line 322
    move-object/from16 v20, v0

    .line 323
    .line 324
    invoke-static/range {v5 .. v34}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {v3, v1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_8

    .line 333
    .line 334
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 335
    .line 336
    :goto_7
    return-object v7

    .line 337
    :cond_8
    move-object/from16 v0, v20

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :pswitch_0
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 341
    .line 342
    sget-object v8, La/wne;->a:La/wne;

    .line 343
    .line 344
    iget-byte v9, v0, La/y87;->k:B

    .line 345
    .line 346
    if-eqz v9, :cond_b

    .line 347
    .line 348
    if-eq v9, v5, :cond_a

    .line 349
    .line 350
    if-ne v9, v6, :cond_9

    .line 351
    .line 352
    iget-object v0, v0, La/y87;->j:La/ptt;

    .line 353
    .line 354
    check-cast v0, La/cn7;

    .line 355
    .line 356
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    goto/16 :goto_d

    .line 360
    .line 361
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_12

    .line 365
    .line 366
    :cond_a
    iget-object v3, v0, La/y87;->j:La/ptt;

    .line 367
    .line 368
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    move-object/from16 v9, p1

    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    sget v3, La/f97;->R0:I

    .line 378
    .line 379
    iget-object v3, v1, La/ocj;->a:La/p7m0;

    .line 380
    .line 381
    :cond_c
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    move-object v10, v9

    .line 389
    check-cast v10, La/i77;

    .line 390
    .line 391
    const/16 v38, -0x3

    .line 392
    .line 393
    const/16 v39, 0x7ff

    .line 394
    .line 395
    const/4 v11, 0x0

    .line 396
    const/4 v12, 0x1

    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const/16 v16, 0x0

    .line 401
    .line 402
    const/16 v17, 0x0

    .line 403
    .line 404
    const/16 v18, 0x0

    .line 405
    .line 406
    const/16 v19, 0x0

    .line 407
    .line 408
    const/16 v20, 0x0

    .line 409
    .line 410
    const/16 v21, 0x0

    .line 411
    .line 412
    const/16 v22, 0x0

    .line 413
    .line 414
    const/16 v23, 0x0

    .line 415
    .line 416
    const/16 v24, 0x0

    .line 417
    .line 418
    const/16 v25, 0x0

    .line 419
    .line 420
    const/16 v26, 0x0

    .line 421
    .line 422
    const/16 v27, 0x0

    .line 423
    .line 424
    const/16 v28, 0x0

    .line 425
    .line 426
    const/16 v29, 0x0

    .line 427
    .line 428
    const/16 v30, 0x0

    .line 429
    .line 430
    const/16 v31, 0x0

    .line 431
    .line 432
    const/16 v32, 0x0

    .line 433
    .line 434
    const/16 v33, 0x0

    .line 435
    .line 436
    const/16 v34, 0x0

    .line 437
    .line 438
    const/16 v35, 0x0

    .line 439
    .line 440
    const/16 v36, 0x0

    .line 441
    .line 442
    const/16 v37, 0x0

    .line 443
    .line 444
    invoke-static/range {v10 .. v39}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    invoke-virtual {v3, v9, v10}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v9

    .line 452
    if-eqz v9, :cond_c

    .line 453
    .line 454
    iget-object v3, v4, La/f97;->g0:La/ptt;

    .line 455
    .line 456
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    check-cast v9, La/i77;

    .line 461
    .line 462
    iget-object v9, v9, La/i77;->e:La/ql5;

    .line 463
    .line 464
    if-eqz v9, :cond_d

    .line 465
    .line 466
    :goto_8
    iget-wide v9, v9, La/ql5;->a:J

    .line 467
    .line 468
    move-wide v10, v9

    .line 469
    goto :goto_a

    .line 470
    :cond_d
    iput-object v3, v0, La/y87;->j:La/ptt;

    .line 471
    .line 472
    iput-byte v5, v0, La/y87;->k:B

    .line 473
    .line 474
    invoke-virtual {v4, v0}, La/f97;->S(La/yje;)Ljava/io/Serializable;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    if-ne v9, v8, :cond_e

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_e
    :goto_9
    check-cast v9, La/ql5;

    .line 482
    .line 483
    goto :goto_8

    .line 484
    :goto_a
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v9

    .line 488
    check-cast v9, La/i77;

    .line 489
    .line 490
    iget-object v9, v9, La/i77;->l:La/wdj;

    .line 491
    .line 492
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v12

    .line 496
    check-cast v12, La/i77;

    .line 497
    .line 498
    iget-object v13, v12, La/i77;->m:Ljava/util/List;

    .line 499
    .line 500
    iget-object v12, v4, La/f97;->i0:La/k7u;

    .line 501
    .line 502
    iget-object v12, v12, La/k7u;->a:La/uzc;

    .line 503
    .line 504
    invoke-virtual {v12}, La/uzc;->b()La/jvn;

    .line 505
    .line 506
    .line 507
    move-result-object v12

    .line 508
    invoke-virtual {v12}, La/jvn;->getId()I

    .line 509
    .line 510
    .line 511
    move-result v12

    .line 512
    iget-object v14, v4, La/f97;->p:Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 513
    .line 514
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v15

    .line 518
    check-cast v15, La/i77;

    .line 519
    .line 520
    iget v15, v15, La/i77;->A:I

    .line 521
    .line 522
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v16

    .line 526
    move-object/from16 v5, v16

    .line 527
    .line 528
    check-cast v5, La/i77;

    .line 529
    .line 530
    iget-object v5, v5, La/i77;->F:Ljava/util/List;

    .line 531
    .line 532
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    move-object/from16 v16, v14

    .line 536
    .line 537
    move v14, v15

    .line 538
    move-object v15, v5

    .line 539
    invoke-static/range {v9 .. v16}, La/ptt;->a(La/wdj;JILjava/util/List;ILjava/util/List;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)La/cn7;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    iget-object v5, v4, La/f97;->e0:La/npc;

    .line 544
    .line 545
    iput-object v7, v0, La/y87;->j:La/ptt;

    .line 546
    .line 547
    iput-byte v6, v0, La/y87;->k:B

    .line 548
    .line 549
    iget-object v5, v5, La/npc;->a:La/mii0;

    .line 550
    .line 551
    invoke-virtual {v5, v2, v3, v0}, La/mii0;->B(Ljava/lang/String;La/cn7;La/zje;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    if-ne v0, v8, :cond_f

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 559
    .line 560
    :goto_b
    if-ne v0, v8, :cond_10

    .line 561
    .line 562
    :goto_c
    move-object v7, v8

    .line 563
    goto/16 :goto_12

    .line 564
    .line 565
    :cond_10
    :goto_d
    iget-object v0, v4, La/f97;->p:Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 566
    .line 567
    instance-of v0, v0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 568
    .line 569
    if-eqz v0, :cond_11

    .line 570
    .line 571
    iget-object v0, v4, La/f97;->r:La/ctf0;

    .line 572
    .line 573
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 578
    .line 579
    const/4 v5, 0x1

    .line 580
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    const v5, 0x7f1309d9

    .line 585
    .line 586
    .line 587
    invoke-virtual {v0, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    :goto_e
    move-object v9, v0

    .line 592
    goto :goto_f

    .line 593
    :cond_11
    const-string v0, ""

    .line 594
    .line 595
    goto :goto_e

    .line 596
    :goto_f
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    check-cast v0, La/i77;

    .line 601
    .line 602
    iget-object v0, v0, La/i77;->t:Ljava/util/List;

    .line 603
    .line 604
    new-instance v3, Ljava/util/ArrayList;

    .line 605
    .line 606
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 607
    .line 608
    .line 609
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    :cond_12
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    if-eqz v5, :cond_13

    .line 618
    .line 619
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    move-object v6, v5

    .line 624
    check-cast v6, La/a5w;

    .line 625
    .line 626
    invoke-interface {v6}, La/a5w;->d()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v6

    .line 630
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result v6

    .line 634
    if-nez v6, :cond_12

    .line 635
    .line 636
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    goto :goto_10

    .line 640
    :cond_13
    iget-object v0, v4, La/f97;->R:La/sqc;

    .line 641
    .line 642
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    check-cast v2, La/i77;

    .line 647
    .line 648
    iget-object v2, v2, La/i77;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 649
    .line 650
    invoke-virtual {v0, v2}, La/sqc;->a(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/ov7;

    .line 651
    .line 652
    .line 653
    move-result-object v16

    .line 654
    invoke-virtual {v4, v3}, La/f97;->Z(Ljava/util/List;)La/qgv0;

    .line 655
    .line 656
    .line 657
    move-result-object v27

    .line 658
    invoke-virtual {v4, v3}, La/f97;->Y(Ljava/util/List;)Ljava/util/HashMap;

    .line 659
    .line 660
    .line 661
    move-result-object v35

    .line 662
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 663
    .line 664
    :goto_11
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    move-object v10, v1

    .line 672
    check-cast v10, La/i77;

    .line 673
    .line 674
    const v38, -0x280083

    .line 675
    .line 676
    .line 677
    const/16 v39, 0x7fd

    .line 678
    .line 679
    const/4 v11, 0x0

    .line 680
    const/4 v12, 0x0

    .line 681
    const/4 v13, 0x0

    .line 682
    const/4 v14, 0x0

    .line 683
    const/4 v15, 0x0

    .line 684
    const/16 v17, 0x0

    .line 685
    .line 686
    const/16 v18, 0x0

    .line 687
    .line 688
    const/16 v19, 0x0

    .line 689
    .line 690
    const/16 v20, 0x0

    .line 691
    .line 692
    const/16 v21, 0x0

    .line 693
    .line 694
    const/16 v22, 0x0

    .line 695
    .line 696
    const/16 v23, 0x0

    .line 697
    .line 698
    const/16 v24, 0x0

    .line 699
    .line 700
    const/16 v26, 0x0

    .line 701
    .line 702
    const/16 v28, 0x0

    .line 703
    .line 704
    const/16 v29, 0x0

    .line 705
    .line 706
    const/16 v30, 0x0

    .line 707
    .line 708
    const/16 v31, 0x0

    .line 709
    .line 710
    const/16 v32, 0x0

    .line 711
    .line 712
    const/16 v33, 0x0

    .line 713
    .line 714
    const/16 v34, 0x0

    .line 715
    .line 716
    const/16 v36, 0x0

    .line 717
    .line 718
    const/16 v37, 0x0

    .line 719
    .line 720
    move-object/from16 v25, v3

    .line 721
    .line 722
    invoke-static/range {v10 .. v39}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    if-eqz v1, :cond_14

    .line 731
    .line 732
    new-instance v0, La/f77;

    .line 733
    .line 734
    invoke-direct {v0, v9}, La/f77;-><init>(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v4, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 741
    .line 742
    :goto_12
    return-object v7

    .line 743
    :cond_14
    move-object/from16 v3, v25

    .line 744
    .line 745
    goto :goto_11

    .line 746
    nop

    .line 747
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
