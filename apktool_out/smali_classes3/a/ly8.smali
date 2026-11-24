.class public final La/ly8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ty8;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(La/ty8;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ly8;->i:B

    iput-object p1, p0, La/ly8;->k:La/ty8;

    iput-wide p2, p0, La/ly8;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/ly8;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/ly8;

    .line 7
    .line 8
    iget-wide v2, p0, La/ly8;->l:J

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, La/ly8;->k:La/ty8;

    .line 12
    .line 13
    move-object v4, p2

    .line 14
    invoke-direct/range {v0 .. v5}, La/ly8;-><init>(La/ty8;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    move-object v4, p2

    .line 19
    new-instance v1, La/ly8;

    .line 20
    .line 21
    move-object v5, v4

    .line 22
    iget-wide v3, p0, La/ly8;->l:J

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    iget-object v2, p0, La/ly8;->k:La/ty8;

    .line 26
    .line 27
    invoke-direct/range {v1 .. v6}, La/ly8;-><init>(La/ty8;JLa/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ly8;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ly8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ly8;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ly8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ly8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ly8;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ly8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 21

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/ly8;->i:B

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    iget-wide v2, v5, La/ly8;->l:J

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v6, v5, La/ly8;->k:La/ty8;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v6, La/ty8;->p:La/uc0;

    .line 18
    .line 19
    iget-object v10, v6, La/ty8;->w:La/u58;

    .line 20
    .line 21
    sget-object v11, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v12, v5, La/ly8;->j:Z

    .line 24
    .line 25
    if-eqz v12, :cond_1

    .line 26
    .line 27
    if-ne v12, v7, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, La/yx8;

    .line 47
    .line 48
    iget-object v4, v4, La/yx8;->a:La/wx8;

    .line 49
    .line 50
    iget-object v4, v4, La/wx8;->c:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const/4 v12, 0x0

    .line 57
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v13

    .line 61
    if-eqz v13, :cond_3

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v13

    .line 67
    check-cast v13, La/mlr;

    .line 68
    .line 69
    iget-wide v13, v13, La/mlr;->a:J

    .line 70
    .line 71
    cmp-long v13, v13, v2

    .line 72
    .line 73
    if-nez v13, :cond_2

    .line 74
    .line 75
    move v1, v12

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    add-int/lit8 v12, v12, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    :goto_1
    new-instance v2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-direct {v2, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-ltz v1, :cond_4

    .line 90
    .line 91
    move-object v8, v2

    .line 92
    :cond_4
    if-eqz v8, :cond_b

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, La/yx8;

    .line 103
    .line 104
    iget-object v2, v2, La/yx8;->a:La/wx8;

    .line 105
    .line 106
    iget-object v2, v2, La/wx8;->c:Ljava/util/List;

    .line 107
    .line 108
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, La/mlr;

    .line 113
    .line 114
    if-nez v2, :cond_5

    .line 115
    .line 116
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    goto/16 :goto_5

    .line 119
    .line 120
    :cond_5
    add-int/lit8 v3, v1, 0x1

    .line 121
    .line 122
    invoke-virtual {v6}, La/ty8;->N()Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    const-string v8, "game_aggregator_call"

    .line 127
    .line 128
    move-object v13, v11

    .line 129
    iget-wide v11, v5, La/ly8;->l:J

    .line 130
    .line 131
    if-eqz v4, :cond_6

    .line 132
    .line 133
    iget-short v4, v0, La/uc0;->e:S

    .line 134
    .line 135
    int-to-long v14, v4

    .line 136
    move-object/from16 p1, v8

    .line 137
    .line 138
    iget-wide v7, v0, La/uc0;->b:J

    .line 139
    .line 140
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v16

    .line 148
    iget-object v7, v10, La/u58;->a:La/kt2;

    .line 149
    .line 150
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    const/16 v18, 0x20

    .line 157
    .line 158
    move-object v8, v13

    .line 159
    const-string v13, "brand_live"

    .line 160
    .line 161
    move-object v15, v4

    .line 162
    invoke-static/range {v10 .. v18}, La/u58;->a(La/u58;JLjava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;I)La/jo20;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    move-wide v12, v11

    .line 167
    move-object/from16 v11, p1

    .line 168
    .line 169
    invoke-interface {v7, v11, v4}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 170
    .line 171
    .line 172
    move-wide v11, v12

    .line 173
    goto :goto_2

    .line 174
    :cond_6
    move-wide/from16 v19, v11

    .line 175
    .line 176
    move-object v11, v8

    .line 177
    move-object v8, v13

    .line 178
    move-wide/from16 v12, v19

    .line 179
    .line 180
    iget-boolean v4, v0, La/uc0;->i:Z

    .line 181
    .line 182
    iget-short v7, v0, La/uc0;->e:S

    .line 183
    .line 184
    iget-wide v14, v0, La/uc0;->b:J

    .line 185
    .line 186
    if-eqz v4, :cond_7

    .line 187
    .line 188
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v16

    .line 192
    iget-object v4, v10, La/u58;->a:La/kt2;

    .line 193
    .line 194
    move-wide/from16 v17, v14

    .line 195
    .line 196
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    const/16 v18, 0x20

    .line 207
    .line 208
    move-object v7, v11

    .line 209
    move-wide v11, v12

    .line 210
    const-string v13, "search_aggregator_providers"

    .line 211
    .line 212
    invoke-static/range {v10 .. v18}, La/u58;->a(La/u58;JLjava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;I)La/jo20;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    invoke-interface {v4, v7, v13}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_7
    move-object v4, v11

    .line 221
    move-wide v11, v12

    .line 222
    move-wide/from16 v17, v14

    .line 223
    .line 224
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v16

    .line 228
    iget-object v13, v10, La/u58;->a:La/kt2;

    .line 229
    .line 230
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v14

    .line 234
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 235
    .line 236
    .line 237
    move-result-object v15

    .line 238
    const/16 v17, 0x0

    .line 239
    .line 240
    const/16 v18, 0x20

    .line 241
    .line 242
    move-object v7, v13

    .line 243
    const-string v13, "menu_aggregator_providers"

    .line 244
    .line 245
    invoke-static/range {v10 .. v18}, La/u58;->a(La/u58;JLjava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;I)La/jo20;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    invoke-interface {v7, v4, v13}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 250
    .line 251
    .line 252
    :goto_2
    iget-object v4, v10, La/u58;->a:La/kt2;

    .line 253
    .line 254
    const-string v7, "game_id"

    .line 255
    .line 256
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    const-string v13, "provbrand_prov_game"

    .line 261
    .line 262
    invoke-static {v7, v10, v4, v13}, La/h97;->x(Ljava/lang/String;Ljava/lang/Long;La/kt2;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    iget-object v4, v6, La/ty8;->A:La/ix0;

    .line 266
    .line 267
    long-to-int v7, v11

    .line 268
    iget-short v10, v0, La/uc0;->e:S

    .line 269
    .line 270
    iget-wide v13, v0, La/uc0;->b:J

    .line 271
    .line 272
    long-to-int v13, v13

    .line 273
    invoke-virtual {v6}, La/ty8;->N()Z

    .line 274
    .line 275
    .line 276
    move-result v14

    .line 277
    if-eqz v14, :cond_8

    .line 278
    .line 279
    const-string v14, "brand_live"

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_8
    iget-boolean v14, v0, La/uc0;->i:Z

    .line 283
    .line 284
    if-eqz v14, :cond_9

    .line 285
    .line 286
    const-string v14, "search_aggregator_providers"

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_9
    const-string v14, "menu_aggregator_providers"

    .line 290
    .line 291
    :goto_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v4, v4, La/ix0;->a:La/s1p;

    .line 295
    .line 296
    new-instance v15, La/yni0;

    .line 297
    .line 298
    invoke-direct {v15}, La/yni0;-><init>()V

    .line 299
    .line 300
    .line 301
    new-instance v9, La/i1p;

    .line 302
    .line 303
    move-object/from16 p1, v2

    .line 304
    .line 305
    const/4 v2, 0x2

    .line 306
    invoke-direct {v9, v7, v2}, La/i1p;-><init>(IB)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v15, v9}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    new-instance v2, La/i1p;

    .line 313
    .line 314
    const/4 v7, 0x0

    .line 315
    invoke-direct {v2, v10, v7}, La/i1p;-><init>(IB)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v15, v2}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    new-instance v2, La/i1p;

    .line 322
    .line 323
    const/4 v9, 0x1

    .line 324
    invoke-direct {v2, v3, v9}, La/i1p;-><init>(IB)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v15, v2}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    new-instance v2, La/h1p;

    .line 331
    .line 332
    int-to-float v3, v13

    .line 333
    invoke-direct {v2, v3, v7}, La/h1p;-><init>(FB)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v15, v2}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    new-instance v2, La/j1p;

    .line 340
    .line 341
    invoke-direct {v2, v14, v7}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v15, v2}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    invoke-static {v15}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    const-wide/16 v9, 0xbcb

    .line 352
    .line 353
    invoke-virtual {v4, v2, v9, v10}, La/s1p;->a(Ljava/util/Set;J)V

    .line 354
    .line 355
    .line 356
    iget-object v2, v6, La/ty8;->z:La/au0;

    .line 357
    .line 358
    iget-object v2, v2, La/au0;->a:La/s1p;

    .line 359
    .line 360
    const-wide/16 v3, 0x2ad2

    .line 361
    .line 362
    invoke-static {v11, v12, v2, v3, v4}, La/h97;->r(JLa/s1p;J)V

    .line 363
    .line 364
    .line 365
    iget-object v2, v6, La/ty8;->t:La/pw70;

    .line 366
    .line 367
    iget-short v3, v0, La/uc0;->e:S

    .line 368
    .line 369
    iget-boolean v0, v0, La/uc0;->i:Z

    .line 370
    .line 371
    const/4 v9, 0x1

    .line 372
    xor-int/2addr v0, v9

    .line 373
    invoke-virtual {v6, v1}, La/ty8;->P(I)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    iput-boolean v9, v5, La/ly8;->j:Z

    .line 378
    .line 379
    const/4 v4, 0x0

    .line 380
    const/16 v7, 0x22

    .line 381
    .line 382
    move-object v6, v5

    .line 383
    move v5, v0

    .line 384
    move-object v0, v2

    .line 385
    move-object v2, v1

    .line 386
    move-object/from16 v1, p1

    .line 387
    .line 388
    invoke-static/range {v0 .. v7}, La/pw70;->b(La/pw70;La/mlr;Ljava/lang/String;IZZLa/yje;I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    if-ne v0, v8, :cond_a

    .line 393
    .line 394
    goto :goto_5

    .line 395
    :cond_a
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    goto :goto_5

    .line 398
    :cond_b
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 399
    .line 400
    :goto_5
    return-object v8

    .line 401
    :pswitch_0
    const/4 v7, 0x0

    .line 402
    sget-object v9, La/wne;->a:La/wne;

    .line 403
    .line 404
    iget-boolean v0, v5, La/ly8;->j:Z

    .line 405
    .line 406
    if-eqz v0, :cond_d

    .line 407
    .line 408
    const/4 v10, 0x1

    .line 409
    if-ne v0, v10, :cond_c

    .line 410
    .line 411
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_8

    .line 415
    .line 416
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_9

    .line 420
    .line 421
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    check-cast v0, La/yx8;

    .line 429
    .line 430
    iget-object v0, v0, La/yx8;->a:La/wx8;

    .line 431
    .line 432
    iget-object v0, v0, La/wx8;->c:Ljava/util/List;

    .line 433
    .line 434
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    if-eqz v4, :cond_f

    .line 443
    .line 444
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    check-cast v4, La/mlr;

    .line 449
    .line 450
    iget-wide v10, v4, La/mlr;->a:J

    .line 451
    .line 452
    cmp-long v4, v10, v2

    .line 453
    .line 454
    if-nez v4, :cond_e

    .line 455
    .line 456
    move v1, v7

    .line 457
    goto :goto_7

    .line 458
    :cond_e
    add-int/lit8 v7, v7, 0x1

    .line 459
    .line 460
    goto :goto_6

    .line 461
    :cond_f
    :goto_7
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    check-cast v0, La/yx8;

    .line 466
    .line 467
    iget-object v0, v0, La/yx8;->a:La/wx8;

    .line 468
    .line 469
    iget-object v0, v0, La/wx8;->c:Ljava/util/List;

    .line 470
    .line 471
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    check-cast v0, La/mlr;

    .line 476
    .line 477
    if-nez v0, :cond_10

    .line 478
    .line 479
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 480
    .line 481
    goto :goto_9

    .line 482
    :cond_10
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    check-cast v4, La/yx8;

    .line 487
    .line 488
    iget-object v4, v4, La/yx8;->a:La/wx8;

    .line 489
    .line 490
    iget-object v4, v4, La/wx8;->d:Ljava/util/Set;

    .line 491
    .line 492
    new-instance v7, Ljava/lang/Long;

    .line 493
    .line 494
    invoke-direct {v7, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 495
    .line 496
    .line 497
    invoke-interface {v4, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    move-object v3, v0

    .line 502
    iget-object v0, v6, La/ty8;->B:La/xr;

    .line 503
    .line 504
    const/4 v10, 0x1

    .line 505
    xor-int/2addr v2, v10

    .line 506
    iget-object v4, v6, La/ty8;->p:La/uc0;

    .line 507
    .line 508
    iget-short v4, v4, La/uc0;->e:S

    .line 509
    .line 510
    invoke-virtual {v6, v1}, La/ty8;->P(I)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    iput-boolean v10, v5, La/ly8;->j:Z

    .line 515
    .line 516
    move/from16 v19, v4

    .line 517
    .line 518
    move-object v4, v1

    .line 519
    move-object v1, v3

    .line 520
    move/from16 v3, v19

    .line 521
    .line 522
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    if-ne v0, v9, :cond_11

    .line 527
    .line 528
    move-object v8, v9

    .line 529
    goto :goto_9

    .line 530
    :cond_11
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 531
    .line 532
    :goto_9
    return-object v8

    .line 533
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
