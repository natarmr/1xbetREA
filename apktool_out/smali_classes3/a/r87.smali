.class public final La/r87;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/f97;


# direct methods
.method public synthetic constructor <init>(La/f97;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r87;->i:B

    iput-object p1, p0, La/r87;->k:La/f97;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r87;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r87;->k:La/f97;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r87;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/r87;-><init>(La/f97;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/r87;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/r87;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/r87;-><init>(La/f97;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/r87;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/r87;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/r87;-><init>(La/f97;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/r87;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r87;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qkt0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/r87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r87;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ql5;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r87;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/sw00;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/r87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/r87;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/r87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r87;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/r87;->k:La/f97;

    .line 8
    .line 9
    iget-object v0, v0, La/r87;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, La/qkt0;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget v1, La/f97;->R0:I

    .line 22
    .line 23
    iget-object v0, v0, La/qkt0;->a:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v4, v0}, La/f97;->k0(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, v4, La/f97;->P0:La/bby;

    .line 32
    .line 33
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v3}, La/f97;->b0(Z)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    move-object v9, v0

    .line 43
    check-cast v9, La/ql5;

    .line 44
    .line 45
    sget-object v0, La/wne;->a:La/wne;

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 51
    .line 52
    iget-object v1, v4, La/f97;->z0:La/bst;

    .line 53
    .line 54
    iget-object v3, v4, La/f97;->u:La/pru;

    .line 55
    .line 56
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v9, v3}, La/bst;->d(La/ql5;La/sff0;)La/i4;

    .line 64
    .line 65
    .line 66
    move-result-object v31

    .line 67
    iget-object v1, v9, La/ql5;->i:La/txs0;

    .line 68
    .line 69
    invoke-virtual {v1}, La/txs0;->a()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    sget-object v1, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 76
    .line 77
    sget-object v3, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 78
    .line 79
    filled-new-array {v1, v3}, [Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, La/i77;

    .line 92
    .line 93
    iget-object v5, v5, La/i77;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 94
    .line 95
    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_2

    .line 100
    .line 101
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 102
    .line 103
    :cond_1
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-object v5, v0

    .line 111
    check-cast v5, La/i77;

    .line 112
    .line 113
    const/16 v33, -0x11

    .line 114
    .line 115
    const/16 v34, 0x7fb

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    const/4 v8, 0x0

    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v11, 0x0

    .line 122
    const/4 v12, 0x0

    .line 123
    const/4 v13, 0x0

    .line 124
    const/4 v14, 0x0

    .line 125
    const/4 v15, 0x0

    .line 126
    const/16 v16, 0x0

    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const/16 v19, 0x0

    .line 133
    .line 134
    const/16 v20, 0x0

    .line 135
    .line 136
    const/16 v21, 0x0

    .line 137
    .line 138
    const/16 v22, 0x0

    .line 139
    .line 140
    const/16 v23, 0x0

    .line 141
    .line 142
    const/16 v24, 0x0

    .line 143
    .line 144
    const/16 v25, 0x0

    .line 145
    .line 146
    const/16 v26, 0x0

    .line 147
    .line 148
    const/16 v27, 0x0

    .line 149
    .line 150
    const/16 v28, 0x0

    .line 151
    .line 152
    const/16 v29, 0x0

    .line 153
    .line 154
    const/16 v30, 0x0

    .line 155
    .line 156
    const/16 v32, 0x0

    .line 157
    .line 158
    invoke-static/range {v5 .. v34}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v3, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_1

    .line 167
    .line 168
    invoke-virtual {v4, v1}, La/f97;->M(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_2

    .line 172
    .line 173
    :cond_2
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, La/i77;

    .line 178
    .line 179
    iget-object v1, v1, La/i77;->e:La/ql5;

    .line 180
    .line 181
    if-eqz v1, :cond_5

    .line 182
    .line 183
    iget-wide v5, v9, La/ql5;->a:J

    .line 184
    .line 185
    iget-wide v7, v1, La/ql5;->a:J

    .line 186
    .line 187
    cmp-long v1, v5, v7

    .line 188
    .line 189
    if-nez v1, :cond_5

    .line 190
    .line 191
    iget-wide v5, v9, La/ql5;->b:D

    .line 192
    .line 193
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    check-cast v1, La/i77;

    .line 198
    .line 199
    iget-object v1, v1, La/i77;->e:La/ql5;

    .line 200
    .line 201
    if-eqz v1, :cond_3

    .line 202
    .line 203
    iget-wide v1, v1, La/ql5;->b:D

    .line 204
    .line 205
    new-instance v3, Ljava/lang/Double;

    .line 206
    .line 207
    invoke-direct {v3, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 208
    .line 209
    .line 210
    move-object v2, v3

    .line 211
    :cond_3
    invoke-static {v5, v6, v2}, Lkotlin/jvm/internal/Intrinsics;->a(DLjava/lang/Double;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_6

    .line 216
    .line 217
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 218
    .line 219
    :goto_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-object v5, v1

    .line 227
    check-cast v5, La/i77;

    .line 228
    .line 229
    const/16 v33, -0x11

    .line 230
    .line 231
    const/16 v34, 0x7fb

    .line 232
    .line 233
    const/4 v6, 0x0

    .line 234
    const/4 v7, 0x0

    .line 235
    const/4 v8, 0x0

    .line 236
    const/4 v10, 0x0

    .line 237
    const/4 v11, 0x0

    .line 238
    const/4 v12, 0x0

    .line 239
    const/4 v13, 0x0

    .line 240
    const/4 v14, 0x0

    .line 241
    const/4 v15, 0x0

    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const/16 v18, 0x0

    .line 247
    .line 248
    const/16 v19, 0x0

    .line 249
    .line 250
    const/16 v20, 0x0

    .line 251
    .line 252
    const/16 v21, 0x0

    .line 253
    .line 254
    const/16 v22, 0x0

    .line 255
    .line 256
    const/16 v23, 0x0

    .line 257
    .line 258
    const/16 v24, 0x0

    .line 259
    .line 260
    const/16 v25, 0x0

    .line 261
    .line 262
    const/16 v26, 0x0

    .line 263
    .line 264
    const/16 v27, 0x0

    .line 265
    .line 266
    const/16 v28, 0x0

    .line 267
    .line 268
    const/16 v29, 0x0

    .line 269
    .line 270
    const/16 v30, 0x0

    .line 271
    .line 272
    const/16 v32, 0x0

    .line 273
    .line 274
    invoke-static/range {v5 .. v34}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    move-object/from16 v3, v31

    .line 279
    .line 280
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_4

    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_4
    move-object/from16 v31, v3

    .line 288
    .line 289
    goto :goto_1

    .line 290
    :cond_5
    move-object/from16 v3, v31

    .line 291
    .line 292
    new-instance v0, La/t87;

    .line 293
    .line 294
    const/4 v1, 0x0

    .line 295
    invoke-direct {v0, v9, v3, v1}, La/t87;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4}, La/f97;->a0()V

    .line 302
    .line 303
    .line 304
    :cond_6
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0

    .line 307
    :pswitch_1
    check-cast v0, La/sw00;

    .line 308
    .line 309
    sget-object v1, La/wne;->a:La/wne;

    .line 310
    .line 311
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    sget v1, La/f97;->R0:I

    .line 315
    .line 316
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 317
    .line 318
    iget-object v5, v1, La/ocj;->a:La/p7m0;

    .line 319
    .line 320
    :cond_7
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    move-object v7, v6

    .line 328
    check-cast v7, La/i77;

    .line 329
    .line 330
    iget-boolean v15, v0, La/sw00;->a:Z

    .line 331
    .line 332
    const/16 v35, -0x401

    .line 333
    .line 334
    const/16 v36, 0x7ff

    .line 335
    .line 336
    const/4 v8, 0x0

    .line 337
    const/4 v9, 0x0

    .line 338
    const/4 v10, 0x0

    .line 339
    const/4 v11, 0x0

    .line 340
    const/4 v12, 0x0

    .line 341
    const/4 v13, 0x0

    .line 342
    const/4 v14, 0x0

    .line 343
    const/16 v16, 0x0

    .line 344
    .line 345
    const/16 v17, 0x0

    .line 346
    .line 347
    const/16 v18, 0x0

    .line 348
    .line 349
    const/16 v19, 0x0

    .line 350
    .line 351
    const/16 v20, 0x0

    .line 352
    .line 353
    const/16 v21, 0x0

    .line 354
    .line 355
    const/16 v22, 0x0

    .line 356
    .line 357
    const/16 v23, 0x0

    .line 358
    .line 359
    const/16 v24, 0x0

    .line 360
    .line 361
    const/16 v25, 0x0

    .line 362
    .line 363
    const/16 v26, 0x0

    .line 364
    .line 365
    const/16 v27, 0x0

    .line 366
    .line 367
    const/16 v28, 0x0

    .line 368
    .line 369
    const/16 v29, 0x0

    .line 370
    .line 371
    const/16 v30, 0x0

    .line 372
    .line 373
    const/16 v31, 0x0

    .line 374
    .line 375
    const/16 v32, 0x0

    .line 376
    .line 377
    const/16 v33, 0x0

    .line 378
    .line 379
    const/16 v34, 0x0

    .line 380
    .line 381
    invoke-static/range {v7 .. v36}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-virtual {v5, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    if-eqz v6, :cond_7

    .line 390
    .line 391
    iget-boolean v0, v0, La/sw00;->a:Z

    .line 392
    .line 393
    if-eqz v0, :cond_9

    .line 394
    .line 395
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 396
    .line 397
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    move-object v5, v1

    .line 405
    check-cast v5, La/i77;

    .line 406
    .line 407
    const/16 v33, -0x2

    .line 408
    .line 409
    const/16 v34, 0x7ff

    .line 410
    .line 411
    const/4 v6, 0x1

    .line 412
    const/4 v7, 0x0

    .line 413
    const/4 v8, 0x0

    .line 414
    const/4 v9, 0x0

    .line 415
    const/4 v10, 0x0

    .line 416
    const/4 v11, 0x0

    .line 417
    const/4 v12, 0x0

    .line 418
    const/4 v13, 0x0

    .line 419
    const/4 v14, 0x0

    .line 420
    const/4 v15, 0x0

    .line 421
    const/16 v16, 0x0

    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    const/16 v18, 0x0

    .line 426
    .line 427
    const/16 v19, 0x0

    .line 428
    .line 429
    const/16 v20, 0x0

    .line 430
    .line 431
    const/16 v21, 0x0

    .line 432
    .line 433
    const/16 v22, 0x0

    .line 434
    .line 435
    const/16 v23, 0x0

    .line 436
    .line 437
    const/16 v24, 0x0

    .line 438
    .line 439
    const/16 v25, 0x0

    .line 440
    .line 441
    const/16 v26, 0x0

    .line 442
    .line 443
    const/16 v27, 0x0

    .line 444
    .line 445
    const/16 v28, 0x0

    .line 446
    .line 447
    const/16 v29, 0x0

    .line 448
    .line 449
    const/16 v30, 0x0

    .line 450
    .line 451
    const/16 v31, 0x0

    .line 452
    .line 453
    const/16 v32, 0x0

    .line 454
    .line 455
    invoke-static/range {v5 .. v34}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    invoke-virtual {v0, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_8

    .line 464
    .line 465
    invoke-virtual {v4}, La/f97;->h0()V

    .line 466
    .line 467
    .line 468
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    new-instance v6, La/c87;

    .line 473
    .line 474
    const/16 v0, 0x10

    .line 475
    .line 476
    invoke-direct {v6, v4, v0}, La/c87;-><init>(La/f97;B)V

    .line 477
    .line 478
    .line 479
    new-instance v9, La/ya;

    .line 480
    .line 481
    const/16 v0, 0x8

    .line 482
    .line 483
    invoke-direct {v9, v4, v2, v0}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 484
    .line 485
    .line 486
    const/16 v10, 0xe

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    const/4 v8, 0x0

    .line 490
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    iput-object v0, v4, La/f97;->M0:La/bby;

    .line 495
    .line 496
    invoke-virtual {v4}, La/f97;->U()V

    .line 497
    .line 498
    .line 499
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    iget-object v0, v4, La/f97;->q:La/mne;

    .line 504
    .line 505
    iget-object v8, v0, La/mne;->b:La/dvj;

    .line 506
    .line 507
    new-instance v9, La/b04;

    .line 508
    .line 509
    const/4 v0, 0x2

    .line 510
    invoke-direct {v9, v0, v2, v3}, La/b04;-><init>(ILa/yje;B)V

    .line 511
    .line 512
    .line 513
    const/16 v10, 0xb

    .line 514
    .line 515
    const/4 v6, 0x0

    .line 516
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    iput-object v0, v4, La/f97;->P0:La/bby;

    .line 521
    .line 522
    goto :goto_3

    .line 523
    :cond_9
    iget-object v0, v4, La/f97;->L0:La/c4m0;

    .line 524
    .line 525
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 526
    .line 527
    .line 528
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 529
    .line 530
    return-object v0

    .line 531
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
