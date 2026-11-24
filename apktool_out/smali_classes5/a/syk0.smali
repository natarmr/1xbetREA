.class public final La/syk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/tyk0;


# direct methods
.method public synthetic constructor <init>(La/tyk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/syk0;->i:B

    iput-object p1, p0, La/syk0;->k:La/tyk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/syk0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/syk0;->k:La/tyk0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/syk0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/syk0;-><init>(La/tyk0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/syk0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/syk0;-><init>(La/tyk0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/syk0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/syk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/syk0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/syk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/syk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/syk0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/syk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-byte v0, v7, La/syk0;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v8, 0x1

    .line 8
    const/4 v2, 0x2

    .line 9
    const/4 v3, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v4, v7, La/syk0;->j:B

    .line 16
    .line 17
    iget-object v5, v7, La/syk0;->k:La/tyk0;

    .line 18
    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    if-eq v4, v8, :cond_1

    .line 22
    .line 23
    if-ne v4, v2, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object/from16 v1, p1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v5, La/tyk0;->o:La/muu;

    .line 43
    .line 44
    invoke-virtual {v1}, La/muu;->a()La/p7m0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-byte v8, v7, La/syk0;->j:B

    .line 49
    .line 50
    invoke-static {v1, v7}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-ne v1, v0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    :goto_0
    check-cast v1, Ljava/util/List;

    .line 58
    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    sget-object v1, La/iun;->a:La/iun;

    .line 62
    .line 63
    :cond_4
    iget-object v3, v5, La/tyk0;->i:La/lg60;

    .line 64
    .line 65
    iget-object v4, v5, La/tyk0;->l:La/hot;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, La/hot;->a(Ljava/util/List;)D

    .line 71
    .line 72
    .line 73
    move-result-wide v8

    .line 74
    invoke-virtual {v3, v8, v9}, La/lg60;->a(D)V

    .line 75
    .line 76
    .line 77
    iget-object v1, v5, La/tyk0;->c:La/i5m0;

    .line 78
    .line 79
    iput-byte v2, v7, La/syk0;->j:B

    .line 80
    .line 81
    invoke-virtual {v1, v7}, La/i5m0;->b(La/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-ne v1, v0, :cond_5

    .line 86
    .line 87
    :goto_1
    move-object v3, v0

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_3
    return-object v3

    .line 92
    :pswitch_0
    sget-object v9, La/wne;->a:La/wne;

    .line 93
    .line 94
    iget-byte v0, v7, La/syk0;->j:B

    .line 95
    .line 96
    const/4 v10, 0x3

    .line 97
    iget-object v13, v7, La/syk0;->k:La/tyk0;

    .line 98
    .line 99
    if-eqz v0, :cond_9

    .line 100
    .line 101
    if-eq v0, v8, :cond_8

    .line 102
    .line 103
    if-eq v0, v2, :cond_7

    .line 104
    .line 105
    if-ne v0, v10, :cond_6

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_8

    .line 111
    .line 112
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_9

    .line 116
    .line 117
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v0, p1

    .line 121
    .line 122
    goto/16 :goto_6

    .line 123
    .line 124
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move-object/from16 v0, p1

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    new-instance v15, La/gvj0;

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const/16 v18, 0x19

    .line 145
    .line 146
    const/4 v12, 0x1

    .line 147
    const-class v14, La/tyk0;

    .line 148
    .line 149
    move-object v11, v15

    .line 150
    const-string v15, "handleGameError"

    .line 151
    .line 152
    const-string v16, "handleGameError(Ljava/lang/Throwable;)V"

    .line 153
    .line 154
    invoke-direct/range {v11 .. v18}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v13, La/tyk0;->v:La/mne;

    .line 158
    .line 159
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 160
    .line 161
    new-instance v4, La/oyk0;

    .line 162
    .line 163
    invoke-direct {v4, v13, v3, v10}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 164
    .line 165
    .line 166
    const/16 v19, 0xa

    .line 167
    .line 168
    const/16 v16, 0x0

    .line 169
    .line 170
    move-object v14, v0

    .line 171
    move-object/from16 v17, v1

    .line 172
    .line 173
    move-object/from16 v18, v4

    .line 174
    .line 175
    move-object v15, v11

    .line 176
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 177
    .line 178
    .line 179
    iget-object v0, v13, La/tyk0;->o:La/muu;

    .line 180
    .line 181
    invoke-virtual {v0}, La/muu;->a()La/p7m0;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iput-byte v8, v7, La/syk0;->j:B

    .line 186
    .line 187
    invoke-static {v0, v7}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-ne v0, v9, :cond_a

    .line 192
    .line 193
    goto/16 :goto_7

    .line 194
    .line 195
    :cond_a
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 196
    .line 197
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_b

    .line 202
    .line 203
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    new-instance v15, La/ejk0;

    .line 211
    .line 212
    const/16 v0, 0xe

    .line 213
    .line 214
    invoke-direct {v15, v0}, La/ejk0;-><init>(B)V

    .line 215
    .line 216
    .line 217
    new-instance v0, La/oyk0;

    .line 218
    .line 219
    const/4 v1, 0x4

    .line 220
    invoke-direct {v0, v13, v3, v1}, La/oyk0;-><init>(La/tyk0;La/yje;B)V

    .line 221
    .line 222
    .line 223
    const/16 v19, 0xe

    .line 224
    .line 225
    const/16 v16, 0x0

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    move-object/from16 v18, v0

    .line 230
    .line 231
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 232
    .line 233
    .line 234
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    goto/16 :goto_9

    .line 237
    .line 238
    :cond_b
    iget-object v1, v13, La/tyk0;->H:La/p7m0;

    .line 239
    .line 240
    :cond_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    move-object v4, v3

    .line 245
    check-cast v4, La/hlu0;

    .line 246
    .line 247
    const/4 v5, 0x0

    .line 248
    invoke-static {v4, v5, v5, v2}, La/hlu0;->a(La/hlu0;ZZI)La/hlu0;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_c

    .line 257
    .line 258
    new-instance v1, La/oc7;

    .line 259
    .line 260
    invoke-direct {v1, v5}, La/oc7;-><init>(Z)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v13, v1}, La/tyk0;->C(La/qc7;)V

    .line 264
    .line 265
    .line 266
    new-instance v1, La/ccs;

    .line 267
    .line 268
    invoke-direct {v1, v5}, La/ccs;-><init>(Z)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v13, v1}, La/tyk0;->D(La/dcs;)V

    .line 272
    .line 273
    .line 274
    iget-object v1, v13, La/tyk0;->p:La/jx90;

    .line 275
    .line 276
    new-instance v6, Ljava/util/ArrayList;

    .line 277
    .line 278
    const/16 v3, 0xa

    .line 279
    .line 280
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_d

    .line 296
    .line 297
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    check-cast v3, La/xxk0;

    .line 302
    .line 303
    new-instance v4, La/oo7;

    .line 304
    .line 305
    iget-object v5, v3, La/xxk0;->b:La/yxk0;

    .line 306
    .line 307
    invoke-static {v5}, La/tlb;->l0(La/yxk0;)I

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    iget-wide v11, v3, La/xxk0;->a:D

    .line 312
    .line 313
    invoke-direct {v4, v11, v12, v5}, La/oo7;-><init>(DI)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_d
    iput-byte v2, v7, La/syk0;->j:B

    .line 321
    .line 322
    iget-object v0, v1, La/jx90;->a:La/bzk0;

    .line 323
    .line 324
    iget-object v1, v1, La/jx90;->b:La/pbt;

    .line 325
    .line 326
    iget-object v1, v1, La/pbt;->a:La/j5t;

    .line 327
    .line 328
    iget-wide v2, v1, La/j5t;->o:D

    .line 329
    .line 330
    iget-object v4, v1, La/j5t;->q:La/ql5;

    .line 331
    .line 332
    if-eqz v4, :cond_10

    .line 333
    .line 334
    iget-wide v4, v4, La/ql5;->a:J

    .line 335
    .line 336
    iget-object v1, v1, La/j5t;->p:La/csr;

    .line 337
    .line 338
    move-wide/from16 v20, v4

    .line 339
    .line 340
    move-object v5, v1

    .line 341
    move-wide v1, v2

    .line 342
    move-wide/from16 v3, v20

    .line 343
    .line 344
    invoke-virtual/range {v0 .. v7}, La/bzk0;->a(DJLa/csr;Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    if-ne v0, v9, :cond_e

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_e
    :goto_6
    check-cast v0, La/vyk0;

    .line 352
    .line 353
    iget-object v1, v13, La/tyk0;->s:La/poi0;

    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iget-object v1, v1, La/poi0;->a:La/bzk0;

    .line 362
    .line 363
    iget-object v1, v1, La/bzk0;->d:La/uyk0;

    .line 364
    .line 365
    iput-object v0, v1, La/uyk0;->c:La/vyk0;

    .line 366
    .line 367
    iget-object v0, v13, La/tyk0;->f:La/fq;

    .line 368
    .line 369
    iput-byte v10, v7, La/syk0;->j:B

    .line 370
    .line 371
    sget-object v1, La/my5;->a:La/my5;

    .line 372
    .line 373
    invoke-virtual {v0, v1, v7}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    if-ne v0, v9, :cond_f

    .line 378
    .line 379
    :goto_7
    move-object v3, v9

    .line 380
    goto :goto_9

    .line 381
    :cond_f
    :goto_8
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    new-instance v0, La/jav0;

    .line 385
    .line 386
    invoke-direct {v0, v8}, La/jav0;-><init>(Z)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v13, v0}, La/tyk0;->E(La/lav0;)V

    .line 390
    .line 391
    .line 392
    new-instance v0, La/kav0;

    .line 393
    .line 394
    iget-object v1, v13, La/tyk0;->m:La/o1u;

    .line 395
    .line 396
    iget-object v1, v1, La/o1u;->a:La/bzk0;

    .line 397
    .line 398
    iget-object v1, v1, La/bzk0;->d:La/uyk0;

    .line 399
    .line 400
    iget-object v1, v1, La/uyk0;->c:La/vyk0;

    .line 401
    .line 402
    iget-object v1, v1, La/vyk0;->d:Ljava/util/List;

    .line 403
    .line 404
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, La/yxk0;

    .line 409
    .line 410
    invoke-direct {v0, v8, v1}, La/kav0;-><init>(ZLa/yxk0;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v13, v0}, La/tyk0;->E(La/lav0;)V

    .line 414
    .line 415
    .line 416
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    :goto_9
    return-object v3

    .line 419
    :cond_10
    new-instance v0, La/ss3;

    .line 420
    .line 421
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 422
    .line 423
    .line 424
    throw v0

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
