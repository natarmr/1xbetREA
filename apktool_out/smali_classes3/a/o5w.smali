.class public final La/o5w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/q5w;

.field public final synthetic l:La/uv6;


# direct methods
.method public synthetic constructor <init>(La/q5w;La/uv6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/o5w;->i:B

    iput-object p1, p0, La/o5w;->k:La/q5w;

    iput-object p2, p0, La/o5w;->l:La/uv6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/o5w;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/o5w;->l:La/uv6;

    .line 4
    .line 5
    iget-object p0, p0, La/o5w;->k:La/q5w;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/o5w;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/o5w;-><init>(La/q5w;La/uv6;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/o5w;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/o5w;-><init>(La/q5w;La/uv6;La/yje;B)V

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
    iget-byte v0, p0, La/o5w;->i:B

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
    invoke-virtual {p0, p1, p2}, La/o5w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/o5w;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/o5w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/o5w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/o5w;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/o5w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o5w;->i:B

    .line 4
    .line 5
    const-string v3, ""

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v13, v0, La/o5w;->l:La/uv6;

    .line 16
    .line 17
    iget-object v1, v13, La/uv6;->W:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v9, v13, La/uv6;->t:J

    .line 20
    .line 21
    sget-object v11, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v12, v0, La/o5w;->j:Z

    .line 24
    .line 25
    iget-object v14, v0, La/o5w;->k:La/q5w;

    .line 26
    .line 27
    if-eqz v12, :cond_1

    .line 28
    .line 29
    if-ne v12, v7, :cond_0

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object/from16 v0, p1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v6, v14, La/q5w;->h:La/fvt0;

    .line 47
    .line 48
    iput-boolean v7, v0, La/o5w;->j:Z

    .line 49
    .line 50
    invoke-virtual {v6, v9, v10, v0}, La/fvt0;->v(JLa/zje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-ne v0, v11, :cond_2

    .line 55
    .line 56
    move-object v8, v11

    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_2
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_7

    .line 66
    .line 67
    iget-wide v6, v13, La/uv6;->h:J

    .line 68
    .line 69
    cmp-long v0, v6, v4

    .line 70
    .line 71
    if-lez v0, :cond_3

    .line 72
    .line 73
    :goto_1
    move-wide v11, v6

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-wide v6, v13, La/uv6;->i:J

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :goto_2
    iget-object v0, v14, La/q5w;->i:La/pv00;

    .line 79
    .line 80
    iget-object v4, v14, La/q5w;->v:La/i1w0;

    .line 81
    .line 82
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v16

    .line 86
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v15, La/vcm0;

    .line 90
    .line 91
    iget-wide v5, v13, La/uv6;->t:J

    .line 92
    .line 93
    iget-wide v7, v13, La/uv6;->f:J

    .line 94
    .line 95
    invoke-static {v13}, La/oa7;->b(La/uv6;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v22

    .line 99
    new-instance v2, La/y6p0;

    .line 100
    .line 101
    move-wide/from16 v17, v5

    .line 102
    .line 103
    iget-wide v5, v13, La/uv6;->n:J

    .line 104
    .line 105
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v6, v13, La/uv6;->m:Ljava/lang/String;

    .line 110
    .line 111
    move-object/from16 v19, v3

    .line 112
    .line 113
    iget-object v3, v13, La/uv6;->o:Ljava/util/List;

    .line 114
    .line 115
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/String;

    .line 120
    .line 121
    if-nez v3, :cond_4

    .line 122
    .line 123
    move-object/from16 v3, v19

    .line 124
    .line 125
    :cond_4
    move-wide/from16 v20, v7

    .line 126
    .line 127
    sget-object v7, La/iun;->a:La/iun;

    .line 128
    .line 129
    invoke-direct {v2, v7, v5, v6, v3}, La/y6p0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    new-instance v3, La/y6p0;

    .line 133
    .line 134
    iget-wide v5, v13, La/uv6;->q:J

    .line 135
    .line 136
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-object v6, v13, La/uv6;->p:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v8, v13, La/uv6;->r:Ljava/util/List;

    .line 143
    .line 144
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    check-cast v8, Ljava/lang/String;

    .line 149
    .line 150
    if-nez v8, :cond_5

    .line 151
    .line 152
    move-object/from16 v8, v19

    .line 153
    .line 154
    :cond_5
    invoke-direct {v3, v7, v5, v6, v8}, La/y6p0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v33, "0"

    .line 158
    .line 159
    const-string v34, "0"

    .line 160
    .line 161
    const-string v19, ""

    .line 162
    .line 163
    const-string v23, "0"

    .line 164
    .line 165
    const-string v24, "0"

    .line 166
    .line 167
    const/16 v27, 0x0

    .line 168
    .line 169
    const/16 v28, 0x0

    .line 170
    .line 171
    const/16 v29, 0x1

    .line 172
    .line 173
    const-string v30, ""

    .line 174
    .line 175
    const/16 v31, 0x1

    .line 176
    .line 177
    const/16 v32, 0x0

    .line 178
    .line 179
    move-object/from16 v25, v2

    .line 180
    .line 181
    move-object/from16 v26, v3

    .line 182
    .line 183
    invoke-direct/range {v15 .. v34}, La/vcm0;-><init>(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/y6p0;La/y6p0;IIZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v15}, La/pv00;->n(La/vcm0;)V

    .line 187
    .line 188
    .line 189
    invoke-static {}, La/gql0;->b()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iget v2, v13, La/uv6;->I:I

    .line 194
    .line 195
    int-to-long v2, v2

    .line 196
    invoke-static {v2, v3, v0}, La/axq;->y(JLjava/util/List;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_6

    .line 201
    .line 202
    new-instance v9, La/mz0;

    .line 203
    .line 204
    move-object v10, v14

    .line 205
    const/16 v14, 0x12

    .line 206
    .line 207
    invoke-direct/range {v9 .. v14}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v9}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_6
    move-object v0, v14

    .line 215
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-lez v2, :cond_7

    .line 220
    .line 221
    new-instance v2, La/k0w0;

    .line 222
    .line 223
    invoke-direct {v2, v4}, La/k0w0;-><init>(La/i1w0;)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v0, La/q5w;->k:La/yfm0;

    .line 227
    .line 228
    check-cast v0, La/zfm0;

    .line 229
    .line 230
    invoke-virtual {v0, v9, v10, v1}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 235
    .line 236
    .line 237
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 238
    .line 239
    const/4 v1, 0x0

    .line 240
    invoke-static {v4, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    :goto_3
    move-object v1, v0

    .line 245
    check-cast v1, La/paw;

    .line 246
    .line 247
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_7

    .line 252
    .line 253
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, La/oe50;

    .line 258
    .line 259
    invoke-virtual {v4, v1}, La/i1w0;->a(La/oe50;)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_7
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    :goto_5
    return-object v8

    .line 266
    :pswitch_0
    move-object/from16 v19, v3

    .line 267
    .line 268
    const/4 v1, 0x0

    .line 269
    iget-object v15, v0, La/o5w;->l:La/uv6;

    .line 270
    .line 271
    iget-wide v2, v15, La/uv6;->h:J

    .line 272
    .line 273
    iget v9, v15, La/uv6;->I:I

    .line 274
    .line 275
    iget-wide v10, v15, La/uv6;->i:J

    .line 276
    .line 277
    sget-object v12, La/wne;->a:La/wne;

    .line 278
    .line 279
    iget-boolean v13, v0, La/o5w;->j:Z

    .line 280
    .line 281
    iget-object v14, v0, La/o5w;->k:La/q5w;

    .line 282
    .line 283
    if-eqz v13, :cond_9

    .line 284
    .line 285
    if-ne v13, v7, :cond_8

    .line 286
    .line 287
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    move-object/from16 v0, p1

    .line 291
    .line 292
    move-wide/from16 v16, v4

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_8
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    const/4 v8, 0x0

    .line 299
    goto/16 :goto_f

    .line 300
    .line 301
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    iget-object v6, v14, La/q5w;->g:La/h3c;

    .line 305
    .line 306
    move-wide/from16 v16, v4

    .line 307
    .line 308
    iget-wide v4, v15, La/uv6;->t:J

    .line 309
    .line 310
    iput-boolean v7, v0, La/o5w;->j:Z

    .line 311
    .line 312
    invoke-virtual {v6, v4, v5, v0}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-ne v0, v12, :cond_a

    .line 317
    .line 318
    move-object v8, v12

    .line 319
    goto/16 :goto_f

    .line 320
    .line 321
    :cond_a
    :goto_6
    check-cast v0, Ljava/lang/Boolean;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    sget-object v4, La/q5w;->G:Ljava/util/List;

    .line 328
    .line 329
    invoke-virtual {v14}, La/q5w;->v()La/n3w;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    iget-object v4, v4, La/n3w;->J1:Ljava/util/List;

    .line 334
    .line 335
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    :cond_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    if-eqz v5, :cond_c

    .line 344
    .line 345
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    move-object v6, v5

    .line 350
    check-cast v6, La/su6;

    .line 351
    .line 352
    iget-wide v12, v6, La/su6;->i:J

    .line 353
    .line 354
    cmp-long v6, v12, v10

    .line 355
    .line 356
    if-nez v6, :cond_b

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_c
    const/4 v5, 0x0

    .line 360
    :goto_7
    check-cast v5, La/su6;

    .line 361
    .line 362
    if-eqz v5, :cond_d

    .line 363
    .line 364
    iget-boolean v4, v5, La/su6;->s1:Z

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_d
    move v4, v1

    .line 368
    :goto_8
    if-eqz v4, :cond_e

    .line 369
    .line 370
    invoke-virtual {v14}, La/q5w;->v()La/n3w;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-static {v4}, La/xkb;->H(La/n3w;)Z

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-eqz v4, :cond_e

    .line 379
    .line 380
    move v1, v7

    .line 381
    :cond_e
    if-eqz v1, :cond_f

    .line 382
    .line 383
    invoke-virtual {v14}, La/q5w;->v()La/n3w;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    iget-object v4, v4, La/n3w;->a:Ljava/lang/String;

    .line 388
    .line 389
    move-object/from16 v30, v4

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_f
    move-object/from16 v30, v19

    .line 393
    .line 394
    :goto_9
    if-eqz v5, :cond_10

    .line 395
    .line 396
    iget-wide v4, v5, La/su6;->h1:J

    .line 397
    .line 398
    goto :goto_a

    .line 399
    :cond_10
    move-wide/from16 v4, v16

    .line 400
    .line 401
    :goto_a
    if-eqz v1, :cond_11

    .line 402
    .line 403
    cmp-long v1, v4, v16

    .line 404
    .line 405
    if-eqz v1, :cond_11

    .line 406
    .line 407
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    move-object/from16 v31, v1

    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_11
    move-object/from16 v31, v19

    .line 415
    .line 416
    :goto_b
    iget-object v1, v14, La/q5w;->A:La/nhf0;

    .line 417
    .line 418
    iget-wide v4, v15, La/uv6;->t:J

    .line 419
    .line 420
    int-to-long v6, v9

    .line 421
    iget-wide v12, v15, La/uv6;->a:J

    .line 422
    .line 423
    iget-boolean v8, v15, La/uv6;->l:Z

    .line 424
    .line 425
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object v1, v1, La/nhf0;->b:Ljava/lang/Object;

    .line 432
    .line 433
    move-object/from16 v20, v1

    .line 434
    .line 435
    check-cast v20, La/bn6;

    .line 436
    .line 437
    const/16 v27, 0x0

    .line 438
    .line 439
    const-string v29, "bet_history"

    .line 440
    .line 441
    move-wide/from16 v21, v4

    .line 442
    .line 443
    move-wide/from16 v23, v6

    .line 444
    .line 445
    move/from16 v28, v8

    .line 446
    .line 447
    move-wide/from16 v25, v12

    .line 448
    .line 449
    invoke-virtual/range {v20 .. v31}, La/bn6;->e(JJJZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    iget-object v1, v14, La/q5w;->B:La/je;

    .line 453
    .line 454
    iget-wide v4, v15, La/uv6;->t:J

    .line 455
    .line 456
    int-to-long v6, v9

    .line 457
    iget-wide v8, v15, La/uv6;->a:J

    .line 458
    .line 459
    iget-boolean v12, v15, La/uv6;->l:Z

    .line 460
    .line 461
    const-string v39, "bet_history"

    .line 462
    .line 463
    move-object/from16 v32, v1

    .line 464
    .line 465
    move-wide/from16 v33, v4

    .line 466
    .line 467
    move-wide/from16 v35, v6

    .line 468
    .line 469
    move-wide/from16 v37, v8

    .line 470
    .line 471
    move/from16 v40, v12

    .line 472
    .line 473
    invoke-virtual/range {v32 .. v40}, La/je;->f(JJJLjava/lang/String;Z)V

    .line 474
    .line 475
    .line 476
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    iget-wide v4, v15, La/uv6;->t:J

    .line 481
    .line 482
    iget-wide v6, v15, La/uv6;->a:J

    .line 483
    .line 484
    const-wide/16 v8, 0x28

    .line 485
    .line 486
    cmp-long v8, v4, v8

    .line 487
    .line 488
    if-eqz v8, :cond_12

    .line 489
    .line 490
    move-object v9, v14

    .line 491
    goto :goto_c

    .line 492
    :cond_12
    invoke-virtual {v14}, La/eiu0;->s()La/diu0;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 497
    .line 498
    .line 499
    move-result-object v19

    .line 500
    new-instance v20, La/n5w;

    .line 501
    .line 502
    const/16 v26, 0x0

    .line 503
    .line 504
    const/16 v27, 0x3

    .line 505
    .line 506
    const/16 v21, 0x1

    .line 507
    .line 508
    const-class v23, La/q5w;

    .line 509
    .line 510
    const-string v24, "handleError"

    .line 511
    .line 512
    const-string v25, "handleError(Ljava/lang/Throwable;)V"

    .line 513
    .line 514
    move-object/from16 v22, v14

    .line 515
    .line 516
    invoke-direct/range {v20 .. v27}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v8, v20

    .line 520
    .line 521
    move-object/from16 v9, v22

    .line 522
    .line 523
    iget-object v12, v9, La/q5w;->t:La/mne;

    .line 524
    .line 525
    iget-object v12, v12, La/mne;->b:La/dvj;

    .line 526
    .line 527
    new-instance v20, La/j21;

    .line 528
    .line 529
    const/16 v27, 0x0

    .line 530
    .line 531
    const/16 v28, 0x3

    .line 532
    .line 533
    move-object/from16 v22, v1

    .line 534
    .line 535
    move-wide/from16 v23, v4

    .line 536
    .line 537
    move-wide/from16 v25, v6

    .line 538
    .line 539
    move-object/from16 v21, v9

    .line 540
    .line 541
    invoke-direct/range {v20 .. v28}, La/j21;-><init>(Ljava/lang/Object;Ljava/lang/String;JJLa/yje;B)V

    .line 542
    .line 543
    .line 544
    const/16 v24, 0xa

    .line 545
    .line 546
    const/16 v21, 0x0

    .line 547
    .line 548
    move-object/from16 v22, v12

    .line 549
    .line 550
    move-object/from16 v23, v20

    .line 551
    .line 552
    move-object/from16 v20, v8

    .line 553
    .line 554
    invoke-static/range {v19 .. v24}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 555
    .line 556
    .line 557
    :goto_c
    new-instance v1, Ljava/lang/Long;

    .line 558
    .line 559
    invoke-direct {v1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 563
    .line 564
    .line 565
    move-result-wide v2

    .line 566
    cmp-long v2, v2, v16

    .line 567
    .line 568
    if-lez v2, :cond_13

    .line 569
    .line 570
    move-object v8, v1

    .line 571
    goto :goto_d

    .line 572
    :cond_13
    const/4 v8, 0x0

    .line 573
    :goto_d
    if-eqz v8, :cond_14

    .line 574
    .line 575
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 576
    .line 577
    .line 578
    move-result-wide v10

    .line 579
    :cond_14
    move-wide v11, v10

    .line 580
    iget-object v1, v15, La/uv6;->k:La/mvn;

    .line 581
    .line 582
    sget-object v2, La/mvn;->a:La/mvn;

    .line 583
    .line 584
    if-ne v1, v2, :cond_15

    .line 585
    .line 586
    iget-boolean v1, v15, La/uv6;->S:Z

    .line 587
    .line 588
    if-nez v1, :cond_15

    .line 589
    .line 590
    iget-wide v4, v15, La/uv6;->i:J

    .line 591
    .line 592
    move-wide v13, v4

    .line 593
    goto :goto_e

    .line 594
    :cond_15
    move-wide/from16 v13, v16

    .line 595
    .line 596
    :goto_e
    iget-object v1, v9, La/q5w;->v:La/i1w0;

    .line 597
    .line 598
    move-object/from16 v21, v9

    .line 599
    .line 600
    new-instance v9, La/hd7;

    .line 601
    .line 602
    const/16 v17, 0x1

    .line 603
    .line 604
    move/from16 v16, v0

    .line 605
    .line 606
    move-object/from16 v10, v21

    .line 607
    .line 608
    invoke-direct/range {v9 .. v17}, La/hd7;-><init>(Ljava/lang/Object;JJLjava/lang/Object;ZB)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v1, v9}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 612
    .line 613
    .line 614
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    :goto_f
    return-object v8

    .line 617
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
