.class public final La/x87;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/f97;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/f97;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/x87;->i:B

    iput-object p1, p0, La/x87;->k:La/f97;

    iput-object p2, p0, La/x87;->l:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/x87;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/x87;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/x87;->k:La/f97;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/x87;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/x87;-><init>(La/f97;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/x87;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/x87;-><init>(La/f97;Ljava/lang/String;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/x87;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/x87;-><init>(La/f97;Ljava/lang/String;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/x87;->i:B

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
    invoke-virtual {p0, p1, p2}, La/x87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/x87;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/x87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/x87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/x87;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/x87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/x87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/x87;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/x87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/x87;->i:B

    .line 4
    .line 5
    iget-object v1, v5, La/x87;->l:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v6, 0x2

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v7, v5, La/x87;->k:La/f97;

    .line 16
    .line 17
    iget-object v0, v7, La/f97;->r:La/ctf0;

    .line 18
    .line 19
    sget-object v13, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v8, v5, La/x87;->j:B

    .line 22
    .line 23
    const/4 v14, 0x0

    .line 24
    if-eqz v8, :cond_2

    .line 25
    .line 26
    if-eq v8, v4, :cond_1

    .line 27
    .line 28
    if-ne v8, v6, :cond_0

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v2, p1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v8, v7, La/f97;->D:La/p37;

    .line 49
    .line 50
    new-instance v9, La/e1k;

    .line 51
    .line 52
    invoke-direct {v9, v1, v14}, La/e1k;-><init>(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    const/4 v11, 0x0

    .line 56
    const/4 v12, 0x6

    .line 57
    const/4 v10, 0x0

    .line 58
    invoke-static/range {v7 .. v12}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v7, La/f97;->W:La/rrc;

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v8

    .line 67
    iput-byte v4, v5, La/x87;->j:B

    .line 68
    .line 69
    invoke-virtual {v2, v8, v9, v5}, La/rrc;->D(JLa/bnn0;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-ne v2, v13, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    :goto_0
    iget-object v2, v7, La/f97;->O:La/ocl;

    .line 77
    .line 78
    iput-byte v6, v5, La/x87;->j:B

    .line 79
    .line 80
    invoke-virtual {v2}, La/ocl;->j()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-ne v2, v13, :cond_4

    .line 85
    .line 86
    :goto_1
    move-object v2, v13

    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_4
    :goto_2
    move-object/from16 v34, v2

    .line 90
    .line 91
    check-cast v34, Ljava/util/List;

    .line 92
    .line 93
    sget v2, La/f97;->R0:I

    .line 94
    .line 95
    iget-object v2, v7, La/i3t0;->i:La/ocj;

    .line 96
    .line 97
    iget-object v8, v2, La/ocj;->a:La/p7m0;

    .line 98
    .line 99
    :cond_5
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-object v15, v2

    .line 107
    check-cast v15, La/i77;

    .line 108
    .line 109
    const v43, -0x800001

    .line 110
    .line 111
    .line 112
    const/16 v44, 0x7ff

    .line 113
    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0x0

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const/16 v23, 0x0

    .line 129
    .line 130
    const/16 v24, 0x0

    .line 131
    .line 132
    const/16 v25, 0x0

    .line 133
    .line 134
    const/16 v26, 0x0

    .line 135
    .line 136
    const/16 v27, 0x0

    .line 137
    .line 138
    const/16 v28, 0x0

    .line 139
    .line 140
    const/16 v29, 0x0

    .line 141
    .line 142
    const/16 v30, 0x0

    .line 143
    .line 144
    const/16 v31, 0x0

    .line 145
    .line 146
    const/16 v32, 0x0

    .line 147
    .line 148
    const/16 v33, 0x0

    .line 149
    .line 150
    const/16 v35, 0x0

    .line 151
    .line 152
    const/16 v36, 0x0

    .line 153
    .line 154
    const/16 v37, 0x0

    .line 155
    .line 156
    const/16 v38, 0x0

    .line 157
    .line 158
    const/16 v39, 0x0

    .line 159
    .line 160
    const/16 v40, 0x0

    .line 161
    .line 162
    const/16 v41, 0x0

    .line 163
    .line 164
    const/16 v42, 0x0

    .line 165
    .line 166
    invoke-static/range {v15 .. v44}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v8, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_5

    .line 175
    .line 176
    new-instance v2, La/d77;

    .line 177
    .line 178
    new-array v3, v14, [Ljava/lang/Object;

    .line 179
    .line 180
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 181
    .line 182
    invoke-static {v3, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    const v6, 0x7f131080

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v6, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 198
    .line 199
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const v5, 0x7f1309d9

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const v4, 0x7f080afc

    .line 211
    .line 212
    .line 213
    invoke-direct {v2, v4, v3, v0}, La/d77;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iget-object v8, v7, La/f97;->D:La/p37;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    new-instance v9, La/r1k;

    .line 225
    .line 226
    invoke-direct {v9, v1}, La/r1k;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const/4 v11, 0x0

    .line 230
    const/4 v12, 0x6

    .line 231
    const/4 v10, 0x0

    .line 232
    invoke-static/range {v7 .. v12}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v7, v1}, La/f97;->X(Ljava/lang/String;)La/n3w;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iget-object v8, v7, La/f97;->D:La/p37;

    .line 240
    .line 241
    new-instance v9, La/v0k;

    .line 242
    .line 243
    invoke-static {v0}, La/xkb;->N(La/n3w;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-static {v0}, La/xkb;->f0(La/n3w;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-direct {v9, v1, v14, v0}, La/v0k;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-static/range {v7 .. v12}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 255
    .line 256
    .line 257
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    :goto_3
    return-object v2

    .line 260
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 261
    .line 262
    iget-byte v7, v5, La/x87;->j:B

    .line 263
    .line 264
    iget-object v8, v5, La/x87;->k:La/f97;

    .line 265
    .line 266
    if-eqz v7, :cond_8

    .line 267
    .line 268
    if-eq v7, v4, :cond_7

    .line 269
    .line 270
    if-ne v7, v6, :cond_6

    .line 271
    .line 272
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    move-object/from16 v2, p1

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    iget-object v9, v8, La/f97;->D:La/p37;

    .line 290
    .line 291
    const/4 v12, 0x0

    .line 292
    const/4 v13, 0x6

    .line 293
    sget-object v10, La/c1k;->a:La/c1k;

    .line 294
    .line 295
    const/4 v11, 0x0

    .line 296
    invoke-static/range {v8 .. v13}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 297
    .line 298
    .line 299
    iget-object v2, v8, La/f97;->Y:La/znt;

    .line 300
    .line 301
    iput-byte v4, v5, La/x87;->j:B

    .line 302
    .line 303
    iget-object v2, v2, La/znt;->a:La/chf0;

    .line 304
    .line 305
    invoke-virtual {v2, v5}, La/chf0;->D(La/yje;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    if-ne v2, v0, :cond_9

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_9
    :goto_4
    check-cast v2, Ljava/lang/Number;

    .line 313
    .line 314
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 315
    .line 316
    .line 317
    move-result-wide v2

    .line 318
    const-wide/16 v9, 0x0

    .line 319
    .line 320
    cmp-long v2, v2, v9

    .line 321
    .line 322
    if-nez v2, :cond_a

    .line 323
    .line 324
    iput-byte v6, v5, La/x87;->j:B

    .line 325
    .line 326
    sget v2, La/f97;->R0:I

    .line 327
    .line 328
    invoke-virtual {v8, v1, v5}, La/f97;->i0(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    if-ne v1, v0, :cond_b

    .line 333
    .line 334
    :goto_5
    move-object v2, v0

    .line 335
    goto :goto_7

    .line 336
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    new-instance v0, La/p67;

    .line 340
    .line 341
    invoke-direct {v0, v1}, La/p67;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    sget v1, La/f97;->R0:I

    .line 345
    .line 346
    invoke-virtual {v8, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    :cond_b
    :goto_6
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 350
    .line 351
    :goto_7
    return-object v2

    .line 352
    :pswitch_1
    sget-object v7, La/wne;->a:La/wne;

    .line 353
    .line 354
    iget-byte v0, v5, La/x87;->j:B

    .line 355
    .line 356
    iget-object v8, v5, La/x87;->k:La/f97;

    .line 357
    .line 358
    if-eqz v0, :cond_e

    .line 359
    .line 360
    if-eq v0, v4, :cond_d

    .line 361
    .line 362
    if-ne v0, v6, :cond_c

    .line 363
    .line 364
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    move-object/from16 v0, p1

    .line 368
    .line 369
    goto :goto_a

    .line 370
    :cond_c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    move-object/from16 v0, p1

    .line 378
    .line 379
    goto :goto_8

    .line 380
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    iget-object v0, v8, La/f97;->T:La/khf0;

    .line 384
    .line 385
    sget-object v1, La/bm5;->c:La/bm5;

    .line 386
    .line 387
    iput-byte v4, v5, La/x87;->j:B

    .line 388
    .line 389
    invoke-static {v0, v1, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    if-ne v0, v7, :cond_f

    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_f
    :goto_8
    check-cast v0, La/ql5;

    .line 397
    .line 398
    iget-object v1, v8, La/f97;->a0:La/ot;

    .line 399
    .line 400
    sget-object v2, La/bm5;->c:La/bm5;

    .line 401
    .line 402
    invoke-virtual {v1, v2, v0}, La/ot;->a(La/bm5;La/ql5;)V

    .line 403
    .line 404
    .line 405
    iget-object v1, v8, La/f97;->b0:La/chf0;

    .line 406
    .line 407
    iget-wide v3, v0, La/ql5;->a:J

    .line 408
    .line 409
    iput-byte v6, v5, La/x87;->j:B

    .line 410
    .line 411
    iget-object v0, v1, La/chf0;->b:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v0, La/r7v;

    .line 414
    .line 415
    iget-object v1, v1, La/chf0;->c:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v1, La/x1u;

    .line 418
    .line 419
    invoke-virtual {v1}, La/x1u;->a()J

    .line 420
    .line 421
    .line 422
    move-result-wide v1

    .line 423
    iget-object v0, v0, La/r7v;->a:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v0, La/es;

    .line 426
    .line 427
    iget-object v6, v5, La/x87;->l:Ljava/lang/String;

    .line 428
    .line 429
    invoke-virtual/range {v0 .. v6}, La/es;->c(JJLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    if-ne v0, v7, :cond_10

    .line 434
    .line 435
    :goto_9
    move-object v2, v7

    .line 436
    goto :goto_b

    .line 437
    :cond_10
    :goto_a
    check-cast v0, La/tw4;

    .line 438
    .line 439
    iget-object v0, v0, La/tw4;->a:Ljava/lang/String;

    .line 440
    .line 441
    new-instance v1, La/z67;

    .line 442
    .line 443
    invoke-direct {v1, v0}, La/z67;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    sget v0, La/f97;->R0:I

    .line 447
    .line 448
    invoke-virtual {v8, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    :goto_b
    return-object v2

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
