.class public final La/lbb0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/sbb0;


# direct methods
.method public synthetic constructor <init>(La/sbb0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lbb0;->i:B

    iput-object p1, p0, La/lbb0;->k:La/sbb0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/lbb0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lbb0;->k:La/sbb0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/lbb0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/lbb0;-><init>(La/sbb0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/lbb0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/lbb0;-><init>(La/sbb0;La/yje;B)V

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
    iget-byte v0, p0, La/lbb0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lbb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lbb0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lbb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lbb0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lbb0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lbb0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lbb0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/lbb0;->k:La/sbb0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v7, v0, La/lbb0;->j:B

    .line 18
    .line 19
    if-eqz v7, :cond_2

    .line 20
    .line 21
    if-eq v7, v4, :cond_1

    .line 22
    .line 23
    if-ne v7, v5, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v2, La/sbb0;->m0:La/sff0;

    .line 38
    .line 39
    iget-boolean v3, v3, La/sff0;->O0:Z

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    iput-byte v4, v0, La/lbb0;->j:B

    .line 44
    .line 45
    invoke-virtual {v2, v0}, La/sbb0;->A(La/zje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-ne v0, v1, :cond_4

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iput-byte v5, v0, La/lbb0;->j:B

    .line 53
    .line 54
    invoke-virtual {v2, v0}, La/sbb0;->B(La/zje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-ne v0, v1, :cond_4

    .line 59
    .line 60
    :goto_1
    move-object v6, v1

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    :goto_3
    return-object v6

    .line 65
    :pswitch_0
    iget-object v1, v2, La/sbb0;->D0:La/p7m0;

    .line 66
    .line 67
    iget-object v7, v2, La/sbb0;->m0:La/sff0;

    .line 68
    .line 69
    sget-object v8, La/wne;->a:La/wne;

    .line 70
    .line 71
    iget-byte v9, v0, La/lbb0;->j:B

    .line 72
    .line 73
    if-eqz v9, :cond_7

    .line 74
    .line 75
    if-eq v9, v4, :cond_6

    .line 76
    .line 77
    if-ne v9, v5, :cond_5

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object/from16 v0, p1

    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_14

    .line 89
    .line 90
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move-object/from16 v3, p1

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iput-byte v4, v0, La/lbb0;->j:B

    .line 100
    .line 101
    invoke-virtual {v2, v0}, La/sbb0;->w(La/zje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-ne v3, v8, :cond_8

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_8
    :goto_4
    check-cast v3, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_9

    .line 115
    .line 116
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    goto/16 :goto_14

    .line 119
    .line 120
    :cond_9
    iput-byte v5, v0, La/lbb0;->j:B

    .line 121
    .line 122
    invoke-virtual {v2, v0}, La/sbb0;->y(La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-ne v0, v8, :cond_a

    .line 127
    .line 128
    :goto_5
    move-object v6, v8

    .line 129
    goto/16 :goto_14

    .line 130
    .line 131
    :cond_a
    :goto_6
    check-cast v0, Ljava/util/List;

    .line 132
    .line 133
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget-object v4, v7, La/sff0;->g:La/mum0;

    .line 138
    .line 139
    iget-object v4, v4, La/mum0;->m:La/ohb0;

    .line 140
    .line 141
    iget-object v4, v4, La/ohb0;->a:Ljava/lang/String;

    .line 142
    .line 143
    const-string v5, "smallCircles"

    .line 144
    .line 145
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-nez v4, :cond_b

    .line 150
    .line 151
    iget-object v4, v7, La/sff0;->g:La/mum0;

    .line 152
    .line 153
    iget-object v4, v4, La/mum0;->m:La/ohb0;

    .line 154
    .line 155
    iget-object v4, v4, La/ohb0;->a:Ljava/lang/String;

    .line 156
    .line 157
    const-string v5, "smallSquaresNoHeader"

    .line 158
    .line 159
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_c

    .line 164
    .line 165
    :cond_b
    sget-object v4, La/mz60;->g:La/mz60;

    .line 166
    .line 167
    invoke-virtual {v3, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    :cond_c
    invoke-virtual {v3, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 171
    .line 172
    .line 173
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    const/16 v5, 0x18

    .line 182
    .line 183
    sget-object v8, La/pd00;->a:La/pd00;

    .line 184
    .line 185
    if-eqz v4, :cond_e

    .line 186
    .line 187
    :cond_d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    move-object v9, v0

    .line 192
    check-cast v9, La/n7b0;

    .line 193
    .line 194
    iget-object v2, v9, La/n7b0;->c:La/oz60;

    .line 195
    .line 196
    iget-object v3, v7, La/sff0;->g:La/mum0;

    .line 197
    .line 198
    iget-object v3, v3, La/mum0;->m:La/ohb0;

    .line 199
    .line 200
    iget-object v3, v3, La/ohb0;->a:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v4, v7, La/sff0;->d:La/q1w0;

    .line 203
    .line 204
    iget-object v4, v4, La/q1w0;->a:La/dyv0;

    .line 205
    .line 206
    iget-object v4, v4, La/dyv0;->b:Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v2, v8, v3, v4, v5}, La/oz60;->a(La/oz60;La/td00;Ljava/lang/String;Ljava/lang/String;I)La/oz60;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    const/4 v13, 0x0

    .line 213
    const/16 v14, 0xb

    .line 214
    .line 215
    const/4 v10, 0x0

    .line 216
    const/4 v11, 0x0

    .line 217
    invoke-static/range {v9 .. v14}, La/n7b0;->a(La/n7b0;La/b9l0;La/dr5;La/oz60;La/td00;I)La/n7b0;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_d

    .line 226
    .line 227
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    goto/16 :goto_14

    .line 230
    .line 231
    :cond_e
    new-instance v4, Ljava/util/ArrayList;

    .line 232
    .line 233
    const/16 v9, 0xa

    .line 234
    .line 235
    invoke-static {v3, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .line 241
    .line 242
    const/4 v9, 0x0

    .line 243
    invoke-virtual {v3, v9}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    :goto_7
    move-object v11, v10

    .line 248
    check-cast v11, La/paw;

    .line 249
    .line 250
    invoke-virtual {v11}, La/paw;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    if-eqz v12, :cond_16

    .line 255
    .line 256
    invoke-virtual {v11}, La/paw;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    check-cast v11, La/mz60;

    .line 261
    .line 262
    iget-object v12, v2, La/sbb0;->d:La/ctf0;

    .line 263
    .line 264
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-object v13, v11, La/mz60;->b:La/a570;

    .line 268
    .line 269
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object v14, v11, La/mz60;->d:La/hds;

    .line 273
    .line 274
    invoke-static {v13}, La/x1x;->G(La/a570;)Z

    .line 275
    .line 276
    .line 277
    move-result v15

    .line 278
    invoke-static {v13}, La/x1x;->D(La/a570;)J

    .line 279
    .line 280
    .line 281
    move-result-wide v17

    .line 282
    if-eqz v15, :cond_10

    .line 283
    .line 284
    iget-boolean v13, v11, La/mz60;->e:Z

    .line 285
    .line 286
    if-eqz v13, :cond_f

    .line 287
    .line 288
    sget-object v13, La/v4s;->c:La/v4s;

    .line 289
    .line 290
    :goto_8
    move-object/from16 v19, v13

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_f
    sget-object v13, La/v4s;->a:La/v4s;

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_10
    sget-object v13, La/v4s;->b:La/v4s;

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :goto_9
    const/4 v13, 0x6

    .line 300
    if-eqz v15, :cond_11

    .line 301
    .line 302
    new-instance v9, La/n0x;

    .line 303
    .line 304
    iget-object v5, v14, La/hds;->a:Ljava/lang/String;

    .line 305
    .line 306
    invoke-direct {v9, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    const v5, 0x7f08061e

    .line 310
    .line 311
    .line 312
    :goto_a
    move-object/from16 v22, v9

    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_11
    new-instance v9, La/m0x;

    .line 316
    .line 317
    const v5, 0x7f08061e

    .line 318
    .line 319
    .line 320
    invoke-direct {v9, v5, v6, v13}, La/m0x;-><init>(ILa/bzw;I)V

    .line 321
    .line 322
    .line 323
    goto :goto_a

    .line 324
    :goto_b
    if-eqz v15, :cond_12

    .line 325
    .line 326
    new-instance v9, La/n0x;

    .line 327
    .line 328
    iget-object v5, v14, La/hds;->a:Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {v5}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-direct {v9, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    const v5, 0x7f08061e

    .line 338
    .line 339
    .line 340
    :goto_c
    move-object/from16 v23, v9

    .line 341
    .line 342
    goto :goto_d

    .line 343
    :cond_12
    new-instance v9, La/m0x;

    .line 344
    .line 345
    const v5, 0x7f08061e

    .line 346
    .line 347
    .line 348
    invoke-direct {v9, v5, v6, v13}, La/m0x;-><init>(ILa/bzw;I)V

    .line 349
    .line 350
    .line 351
    goto :goto_c

    .line 352
    :goto_d
    if-eqz v15, :cond_13

    .line 353
    .line 354
    new-instance v9, La/n0x;

    .line 355
    .line 356
    iget-object v5, v14, La/hds;->c:Ljava/lang/String;

    .line 357
    .line 358
    invoke-direct {v9, v5}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const v5, 0x7f08061e

    .line 362
    .line 363
    .line 364
    :goto_e
    move-object/from16 v20, v9

    .line 365
    .line 366
    goto :goto_f

    .line 367
    :cond_13
    new-instance v9, La/m0x;

    .line 368
    .line 369
    const v5, 0x7f08061e

    .line 370
    .line 371
    .line 372
    invoke-direct {v9, v5, v6, v13}, La/m0x;-><init>(ILa/bzw;I)V

    .line 373
    .line 374
    .line 375
    goto :goto_e

    .line 376
    :goto_f
    if-eqz v15, :cond_14

    .line 377
    .line 378
    new-instance v5, La/n0x;

    .line 379
    .line 380
    iget-object v9, v14, La/hds;->c:Ljava/lang/String;

    .line 381
    .line 382
    invoke-static {v9}, La/azw;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    invoke-direct {v5, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    move-object/from16 v21, v5

    .line 390
    .line 391
    goto :goto_10

    .line 392
    :cond_14
    new-instance v9, La/m0x;

    .line 393
    .line 394
    invoke-direct {v9, v5, v6, v13}, La/m0x;-><init>(ILa/bzw;I)V

    .line 395
    .line 396
    .line 397
    move-object/from16 v21, v9

    .line 398
    .line 399
    :goto_10
    if-eqz v15, :cond_15

    .line 400
    .line 401
    iget-object v5, v11, La/mz60;->a:Ljava/lang/String;

    .line 402
    .line 403
    move-object/from16 v24, v5

    .line 404
    .line 405
    const/4 v5, 0x0

    .line 406
    goto :goto_11

    .line 407
    :cond_15
    const/4 v5, 0x0

    .line 408
    new-array v9, v5, [Ljava/lang/Object;

    .line 409
    .line 410
    const v11, 0x7f1300e7

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v11, v9}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v9

    .line 417
    move-object/from16 v24, v9

    .line 418
    .line 419
    :goto_11
    new-instance v16, La/u4s;

    .line 420
    .line 421
    invoke-direct/range {v16 .. v24}, La/u4s;-><init>(JLa/v4s;La/o0x;La/o0x;La/o0x;La/o0x;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    move-object/from16 v9, v16

    .line 425
    .line 426
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move v9, v5

    .line 430
    const/16 v5, 0x18

    .line 431
    .line 432
    goto/16 :goto_7

    .line 433
    .line 434
    :cond_16
    new-instance v5, La/dab0;

    .line 435
    .line 436
    invoke-direct {v5, v4}, La/dab0;-><init>(Ljava/util/ArrayList;)V

    .line 437
    .line 438
    .line 439
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    :cond_17
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    move-object v9, v5

    .line 448
    check-cast v9, La/n7b0;

    .line 449
    .line 450
    iget-object v6, v9, La/n7b0;->c:La/oz60;

    .line 451
    .line 452
    iget-object v10, v2, La/sbb0;->k0:La/n4u;

    .line 453
    .line 454
    invoke-virtual {v10}, La/n4u;->f()Z

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    if-eqz v10, :cond_18

    .line 459
    .line 460
    move-object v10, v8

    .line 461
    goto :goto_12

    .line 462
    :cond_18
    new-instance v10, La/sd00;

    .line 463
    .line 464
    invoke-direct {v10, v3, v4}, La/sd00;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 465
    .line 466
    .line 467
    :goto_12
    iget-object v11, v7, La/sff0;->g:La/mum0;

    .line 468
    .line 469
    iget-object v11, v11, La/mum0;->m:La/ohb0;

    .line 470
    .line 471
    iget-object v11, v11, La/ohb0;->a:Ljava/lang/String;

    .line 472
    .line 473
    iget-object v12, v7, La/sff0;->d:La/q1w0;

    .line 474
    .line 475
    iget-object v12, v12, La/q1w0;->a:La/dyv0;

    .line 476
    .line 477
    iget-object v12, v12, La/dyv0;->b:Ljava/lang/String;

    .line 478
    .line 479
    const/16 v15, 0x18

    .line 480
    .line 481
    invoke-static {v6, v10, v11, v12, v15}, La/oz60;->a(La/oz60;La/td00;Ljava/lang/String;Ljava/lang/String;I)La/oz60;

    .line 482
    .line 483
    .line 484
    move-result-object v12

    .line 485
    const/4 v13, 0x0

    .line 486
    const/16 v14, 0xb

    .line 487
    .line 488
    const/4 v10, 0x0

    .line 489
    const/4 v11, 0x0

    .line 490
    invoke-static/range {v9 .. v14}, La/n7b0;->a(La/n7b0;La/b9l0;La/dr5;La/oz60;La/td00;I)La/n7b0;

    .line 491
    .line 492
    .line 493
    move-result-object v6

    .line 494
    invoke-virtual {v1, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v5

    .line 498
    if-eqz v5, :cond_17

    .line 499
    .line 500
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 501
    .line 502
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 503
    .line 504
    .line 505
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    :cond_19
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    if-eqz v3, :cond_1b

    .line 514
    .line 515
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    check-cast v3, La/mz60;

    .line 520
    .line 521
    iget-boolean v4, v3, La/mz60;->e:Z

    .line 522
    .line 523
    if-nez v4, :cond_1a

    .line 524
    .line 525
    iget-boolean v4, v3, La/mz60;->f:Z

    .line 526
    .line 527
    if-nez v4, :cond_19

    .line 528
    .line 529
    :cond_1a
    iget-object v3, v3, La/mz60;->b:La/a570;

    .line 530
    .line 531
    invoke-static {v3}, La/x1x;->D(La/a570;)J

    .line 532
    .line 533
    .line 534
    move-result-wide v3

    .line 535
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    goto :goto_13

    .line 543
    :cond_1b
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-nez v0, :cond_1c

    .line 548
    .line 549
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    iget-object v1, v2, La/sbb0;->j0:La/l570;

    .line 554
    .line 555
    new-instance v3, La/gab0;

    .line 556
    .line 557
    const/4 v4, 0x5

    .line 558
    invoke-direct {v3, v2, v4}, La/gab0;-><init>(La/sbb0;B)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1}, La/eiu0;->s()La/diu0;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const-string v4, "PopularOneXGamesViewModel.updateGamesWorkStatus"

    .line 576
    .line 577
    invoke-virtual {v1, v2, v0, v4, v3}, La/l570;->v(La/bvc;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 578
    .line 579
    .line 580
    :cond_1c
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 581
    .line 582
    :goto_14
    return-object v6

    .line 583
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
