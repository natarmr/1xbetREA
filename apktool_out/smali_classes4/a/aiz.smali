.class public final La/aiz;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Ljava/util/Collection;

.field public k:Ljava/util/Iterator;

.field public l:Ljava/util/Collection;

.field public m:J

.field public n:Z

.field public o:La/i3t0;

.field public final synthetic p:La/i3t0;


# direct methods
.method public synthetic constructor <init>(La/i3t0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/aiz;->i:B

    iput-object p1, p0, La/aiz;->p:La/i3t0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/aiz;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/aiz;->p:La/i3t0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/aiz;

    .line 9
    .line 10
    check-cast p0, La/els0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p0, p1, v1}, La/aiz;-><init>(La/i3t0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/aiz;

    .line 18
    .line 19
    check-cast p0, La/eiz;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p1, v1}, La/aiz;-><init>(La/i3t0;La/yje;B)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/aiz;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/aiz;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/aiz;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/aiz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/aiz;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/aiz;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/aiz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/aiz;->i:B

    .line 4
    .line 5
    const-string v6, "/"

    .line 6
    .line 7
    const-string v7, "https://"

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    iget-object v4, v5, La/aiz;->p:La/i3t0;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object v11, v4

    .line 22
    check-cast v11, La/els0;

    .line 23
    .line 24
    sget-object v12, La/wne;->a:La/wne;

    .line 25
    .line 26
    iget-boolean v0, v5, La/aiz;->n:Z

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    if-ne v0, v9, :cond_0

    .line 31
    .line 32
    iget-wide v0, v5, La/aiz;->m:J

    .line 33
    .line 34
    iget-object v2, v5, La/aiz;->l:Ljava/util/Collection;

    .line 35
    .line 36
    check-cast v2, Ljava/util/Collection;

    .line 37
    .line 38
    iget-object v3, v5, La/aiz;->k:Ljava/util/Iterator;

    .line 39
    .line 40
    iget-object v4, v5, La/aiz;->j:Ljava/util/Collection;

    .line 41
    .line 42
    check-cast v4, Ljava/util/Collection;

    .line 43
    .line 44
    iget-object v13, v5, La/aiz;->o:La/i3t0;

    .line 45
    .line 46
    check-cast v13, La/els0;

    .line 47
    .line 48
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v14, v3

    .line 52
    move-object v15, v13

    .line 53
    move-object v13, v4

    .line 54
    move-wide v3, v0

    .line 55
    move-object/from16 v0, p1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, La/gql0;->e()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v2, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    move-object v14, v0

    .line 84
    move-object v13, v2

    .line 85
    move-object v15, v11

    .line 86
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v3

    .line 102
    iget-object v0, v15, La/els0;->s:La/j3c;

    .line 103
    .line 104
    iget-object v1, v15, La/els0;->o:Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 105
    .line 106
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;->b:J

    .line 107
    .line 108
    iput-object v15, v5, La/aiz;->o:La/i3t0;

    .line 109
    .line 110
    move-object v8, v13

    .line 111
    check-cast v8, Ljava/util/Collection;

    .line 112
    .line 113
    iput-object v8, v5, La/aiz;->j:Ljava/util/Collection;

    .line 114
    .line 115
    iput-object v14, v5, La/aiz;->k:Ljava/util/Iterator;

    .line 116
    .line 117
    iput-object v8, v5, La/aiz;->l:Ljava/util/Collection;

    .line 118
    .line 119
    iput-wide v3, v5, La/aiz;->m:J

    .line 120
    .line 121
    iput-boolean v9, v5, La/aiz;->n:Z

    .line 122
    .line 123
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-ne v0, v12, :cond_2

    .line 128
    .line 129
    move-object v2, v12

    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :cond_2
    move-object v2, v13

    .line 133
    :goto_1
    check-cast v0, La/ypl0;

    .line 134
    .line 135
    new-instance v1, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilter;

    .line 136
    .line 137
    new-instance v8, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 140
    .line 141
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iget-object v9, v0, La/ypl0;->c:La/lel0;

    .line 145
    .line 146
    iget-object v9, v9, La/lel0;->a:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v17

    .line 155
    if-nez v17, :cond_3

    .line 156
    .line 157
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 158
    .line 159
    .line 160
    move-object/from16 v17, v12

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_3
    move-object/from16 v17, v12

    .line 164
    .line 165
    sget-object v12, La/ujn;->h:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v9, v12, v10}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    if-nez v12, :cond_6

    .line 172
    .line 173
    invoke-static {v9, v7, v10}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    if-eqz v12, :cond_4

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_4
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    if-lez v12, :cond_5

    .line 185
    .line 186
    invoke-static {v8, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    if-nez v12, :cond_5

    .line 191
    .line 192
    const/16 v12, 0x2f

    .line 193
    .line 194
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    move/from16 v18, v10

    .line 198
    .line 199
    move/from16 v16, v12

    .line 200
    .line 201
    const/4 v12, 0x1

    .line 202
    goto :goto_2

    .line 203
    :cond_5
    move/from16 v18, v10

    .line 204
    .line 205
    const/4 v12, 0x1

    .line 206
    const/16 v16, 0x2f

    .line 207
    .line 208
    :goto_2
    new-array v10, v12, [C

    .line 209
    .line 210
    aput-char v16, v10, v18

    .line 211
    .line 212
    invoke-static {v9, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_6
    :goto_3
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    :goto_4
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    iget-object v0, v0, La/ypl0;->b:Ljava/lang/String;

    .line 231
    .line 232
    invoke-direct {v1, v3, v4, v8, v0}, Lorg/xplatform/cyber/section/impl/transfers/presentation/dialogs/disciplinefilter/model/TransfersDisciplineFilter;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-object/from16 v12, v17

    .line 239
    .line 240
    const/4 v9, 0x1

    .line 241
    const/4 v10, 0x0

    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :cond_7
    move-object/from16 v28, v13

    .line 245
    .line 246
    check-cast v28, Ljava/util/List;

    .line 247
    .line 248
    sget v0, La/els0;->w:I

    .line 249
    .line 250
    iget-object v0, v11, La/i3t0;->i:La/ocj;

    .line 251
    .line 252
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 253
    .line 254
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-object/from16 v19, v1

    .line 262
    .line 263
    check-cast v19, La/pks0;

    .line 264
    .line 265
    const/16 v27, 0x0

    .line 266
    .line 267
    const/16 v29, 0x7ff

    .line 268
    .line 269
    const-wide/16 v20, 0x0

    .line 270
    .line 271
    const/16 v22, 0x0

    .line 272
    .line 273
    const/16 v23, 0x0

    .line 274
    .line 275
    const/16 v24, 0x0

    .line 276
    .line 277
    const/16 v25, 0x0

    .line 278
    .line 279
    const/16 v26, 0x0

    .line 280
    .line 281
    invoke-static/range {v19 .. v29}, La/pks0;->a(La/pks0;JLa/j0g0;La/ypl0;ZZLjava/lang/String;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;I)La/pks0;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eqz v1, :cond_8

    .line 290
    .line 291
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 292
    .line 293
    :goto_5
    return-object v2

    .line 294
    :pswitch_0
    move-object v8, v4

    .line 295
    check-cast v8, La/eiz;

    .line 296
    .line 297
    sget-object v9, La/wne;->a:La/wne;

    .line 298
    .line 299
    iget-boolean v0, v5, La/aiz;->n:Z

    .line 300
    .line 301
    if-eqz v0, :cond_a

    .line 302
    .line 303
    const/4 v12, 0x1

    .line 304
    if-ne v0, v12, :cond_9

    .line 305
    .line 306
    iget-wide v0, v5, La/aiz;->m:J

    .line 307
    .line 308
    iget-object v2, v5, La/aiz;->l:Ljava/util/Collection;

    .line 309
    .line 310
    check-cast v2, Ljava/util/Collection;

    .line 311
    .line 312
    iget-object v3, v5, La/aiz;->k:Ljava/util/Iterator;

    .line 313
    .line 314
    iget-object v4, v5, La/aiz;->j:Ljava/util/Collection;

    .line 315
    .line 316
    check-cast v4, Ljava/util/Collection;

    .line 317
    .line 318
    iget-object v10, v5, La/aiz;->o:La/i3t0;

    .line 319
    .line 320
    check-cast v10, La/eiz;

    .line 321
    .line 322
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    move-object v11, v3

    .line 326
    move-object v12, v10

    .line 327
    move-object v10, v4

    .line 328
    move-wide v3, v0

    .line 329
    move-object/from16 v0, p1

    .line 330
    .line 331
    goto/16 :goto_7

    .line 332
    .line 333
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_c

    .line 337
    .line 338
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    sget v0, La/gql0;->a:I

    .line 342
    .line 343
    const-wide/16 v2, 0x2e

    .line 344
    .line 345
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 346
    .line 347
    .line 348
    move-result-object v19

    .line 349
    const-wide/16 v2, 0x1

    .line 350
    .line 351
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 352
    .line 353
    .line 354
    move-result-object v20

    .line 355
    const-wide/16 v2, 0x2

    .line 356
    .line 357
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 358
    .line 359
    .line 360
    move-result-object v21

    .line 361
    const-wide/16 v2, 0x1b

    .line 362
    .line 363
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 364
    .line 365
    .line 366
    move-result-object v22

    .line 367
    const-wide/16 v2, 0x24

    .line 368
    .line 369
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 370
    .line 371
    .line 372
    move-result-object v23

    .line 373
    const-wide/16 v2, 0xf

    .line 374
    .line 375
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 376
    .line 377
    .line 378
    move-result-object v24

    .line 379
    const-wide/16 v2, 0x3d

    .line 380
    .line 381
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 382
    .line 383
    .line 384
    move-result-object v25

    .line 385
    filled-new-array/range {v19 .. v25}, [Ljava/lang/Long;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    new-instance v2, Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 400
    .line 401
    .line 402
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    move-object v11, v0

    .line 407
    move-object v10, v2

    .line 408
    move-object v12, v8

    .line 409
    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_10

    .line 414
    .line 415
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Ljava/lang/Number;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 422
    .line 423
    .line 424
    move-result-wide v3

    .line 425
    iget-object v0, v12, La/eiz;->s:La/j3c;

    .line 426
    .line 427
    iget-object v1, v12, La/eiz;->o:Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 428
    .line 429
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;->b:J

    .line 430
    .line 431
    iput-object v12, v5, La/aiz;->o:La/i3t0;

    .line 432
    .line 433
    move-object v13, v10

    .line 434
    check-cast v13, Ljava/util/Collection;

    .line 435
    .line 436
    iput-object v13, v5, La/aiz;->j:Ljava/util/Collection;

    .line 437
    .line 438
    iput-object v11, v5, La/aiz;->k:Ljava/util/Iterator;

    .line 439
    .line 440
    iput-object v13, v5, La/aiz;->l:Ljava/util/Collection;

    .line 441
    .line 442
    iput-wide v3, v5, La/aiz;->m:J

    .line 443
    .line 444
    const/4 v13, 0x1

    .line 445
    iput-boolean v13, v5, La/aiz;->n:Z

    .line 446
    .line 447
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    if-ne v0, v9, :cond_b

    .line 452
    .line 453
    move-object v2, v9

    .line 454
    goto/16 :goto_c

    .line 455
    .line 456
    :cond_b
    move-object v2, v10

    .line 457
    :goto_7
    check-cast v0, La/ypl0;

    .line 458
    .line 459
    new-instance v1, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;

    .line 460
    .line 461
    new-instance v5, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 464
    .line 465
    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    iget-object v13, v0, La/ypl0;->c:La/lel0;

    .line 469
    .line 470
    iget-object v13, v13, La/lel0;->a:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 476
    .line 477
    .line 478
    move-result v14

    .line 479
    if-nez v14, :cond_c

    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 483
    .line 484
    .line 485
    move v15, v14

    .line 486
    const/16 v16, 0x2f

    .line 487
    .line 488
    goto :goto_b

    .line 489
    :cond_c
    const/4 v14, 0x0

    .line 490
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 491
    .line 492
    invoke-static {v13, v15, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 493
    .line 494
    .line 495
    move-result v15

    .line 496
    if-nez v15, :cond_f

    .line 497
    .line 498
    invoke-static {v13, v7, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 499
    .line 500
    .line 501
    move-result v15

    .line 502
    if-eqz v15, :cond_d

    .line 503
    .line 504
    const/4 v15, 0x0

    .line 505
    :goto_8
    const/16 v16, 0x2f

    .line 506
    .line 507
    goto :goto_a

    .line 508
    :cond_d
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 509
    .line 510
    .line 511
    move-result v14

    .line 512
    if-lez v14, :cond_e

    .line 513
    .line 514
    invoke-static {v5, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 515
    .line 516
    .line 517
    move-result v14

    .line 518
    if-nez v14, :cond_e

    .line 519
    .line 520
    const/16 v14, 0x2f

    .line 521
    .line 522
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    move/from16 v16, v14

    .line 526
    .line 527
    const/4 v15, 0x1

    .line 528
    goto :goto_9

    .line 529
    :cond_e
    const/4 v15, 0x1

    .line 530
    const/16 v16, 0x2f

    .line 531
    .line 532
    :goto_9
    new-array v14, v15, [C

    .line 533
    .line 534
    const/4 v15, 0x0

    .line 535
    aput-char v16, v14, v15

    .line 536
    .line 537
    invoke-static {v13, v14}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v13

    .line 541
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    goto :goto_b

    .line 545
    :cond_f
    move v15, v14

    .line 546
    goto :goto_8

    .line 547
    :goto_a
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    :goto_b
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    iget-object v0, v0, La/ypl0;->b:Ljava/lang/String;

    .line 558
    .line 559
    invoke-direct {v1, v3, v4, v5, v0}, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-object/from16 v5, p0

    .line 566
    .line 567
    goto/16 :goto_6

    .line 568
    .line 569
    :cond_10
    move-object/from16 v25, v10

    .line 570
    .line 571
    check-cast v25, Ljava/util/List;

    .line 572
    .line 573
    sget v0, La/eiz;->E:I

    .line 574
    .line 575
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 576
    .line 577
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 578
    .line 579
    :cond_11
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    move-object/from16 v17, v1

    .line 587
    .line 588
    check-cast v17, La/ihz;

    .line 589
    .line 590
    const/16 v34, 0x0

    .line 591
    .line 592
    const v35, 0x1ff7f

    .line 593
    .line 594
    .line 595
    const-wide/16 v18, 0x0

    .line 596
    .line 597
    const/16 v20, 0x0

    .line 598
    .line 599
    const/16 v21, 0x0

    .line 600
    .line 601
    const/16 v22, 0x0

    .line 602
    .line 603
    const/16 v23, 0x0

    .line 604
    .line 605
    const/16 v24, 0x0

    .line 606
    .line 607
    const/16 v26, 0x0

    .line 608
    .line 609
    const/16 v27, 0x0

    .line 610
    .line 611
    const/16 v28, 0x0

    .line 612
    .line 613
    const/16 v29, 0x0

    .line 614
    .line 615
    const/16 v30, 0x0

    .line 616
    .line 617
    const/16 v31, 0x0

    .line 618
    .line 619
    const/16 v32, 0x0

    .line 620
    .line 621
    const/16 v33, 0x0

    .line 622
    .line 623
    invoke-static/range {v17 .. v35}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    if-eqz v1, :cond_11

    .line 632
    .line 633
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 634
    .line 635
    :goto_c
    return-object v2

    .line 636
    nop

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
