.class public final La/jo6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Ljava/util/ArrayList;

.field public k:La/ch20;

.field public l:D

.field public m:B

.field public final synthetic n:Z

.field public final synthetic o:J

.field public final synthetic p:La/diu0;


# direct methods
.method public synthetic constructor <init>(BJLa/yje;La/diu0;Z)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/jo6;->i:B

    iput-object p5, p0, La/jo6;->p:La/diu0;

    iput-boolean p6, p0, La/jo6;->n:Z

    iput-wide p2, p0, La/jo6;->o:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/jo6;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/jo6;->p:La/diu0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/jo6;

    .line 9
    .line 10
    move-object v6, v0

    .line 11
    check-cast v6, La/vp6;

    .line 12
    .line 13
    iget-wide v3, p0, La/jo6;->o:J

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    iget-boolean v7, p0, La/jo6;->n:Z

    .line 17
    .line 18
    move-object v5, p2

    .line 19
    invoke-direct/range {v1 .. v7}, La/jo6;-><init>(BJLa/yje;La/diu0;Z)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    move-object v5, p2

    .line 24
    new-instance v2, La/jo6;

    .line 25
    .line 26
    move-object v7, v0

    .line 27
    check-cast v7, La/po6;

    .line 28
    .line 29
    move-object v6, v5

    .line 30
    iget-wide v4, p0, La/jo6;->o:J

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    iget-boolean v8, p0, La/jo6;->n:Z

    .line 34
    .line 35
    invoke-direct/range {v2 .. v8}, La/jo6;-><init>(BJLa/yje;La/diu0;Z)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jo6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jo6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jo6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jo6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jo6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jo6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jo6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 28

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    iget-byte v0, v11, La/jo6;->i:B

    .line 4
    .line 5
    const-string v12, ""

    .line 6
    .line 7
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v2, v11, La/jo6;->p:La/diu0;

    .line 10
    .line 11
    const/4 v15, 0x1

    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v0, v2

    .line 19
    check-cast v0, La/vp6;

    .line 20
    .line 21
    sget-object v2, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-byte v6, v11, La/jo6;->m:B

    .line 24
    .line 25
    if-eqz v6, :cond_3

    .line 26
    .line 27
    if-eq v6, v15, :cond_2

    .line 28
    .line 29
    if-eq v6, v3, :cond_1

    .line 30
    .line 31
    if-ne v6, v4, :cond_0

    .line 32
    .line 33
    iget-object v1, v11, La/jo6;->k:La/ch20;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v14, v0

    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :cond_1
    iget-wide v6, v11, La/jo6;->l:D

    .line 49
    .line 50
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v14, v0

    .line 54
    move-object v13, v2

    .line 55
    move-object/from16 v0, p1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    iget-object v1, v11, La/jo6;->j:Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object/from16 v6, p1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, La/vp6;->o:La/drt;

    .line 70
    .line 71
    invoke-virtual {v1}, La/drt;->a()Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v6, v0, La/vp6;->B:La/oif0;

    .line 76
    .line 77
    iput-object v1, v11, La/jo6;->j:Ljava/util/ArrayList;

    .line 78
    .line 79
    iput-byte v15, v11, La/jo6;->m:B

    .line 80
    .line 81
    invoke-virtual {v6, v11}, La/oif0;->z(La/zje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-ne v6, v2, :cond_4

    .line 86
    .line 87
    move-object v13, v2

    .line 88
    goto/16 :goto_3

    .line 89
    .line 90
    :cond_4
    :goto_0
    check-cast v6, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    move-object v8, v0

    .line 97
    iget-object v0, v8, La/vp6;->H:La/pwi;

    .line 98
    .line 99
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    check-cast v9, La/jp6;

    .line 104
    .line 105
    iget-object v9, v9, La/jp6;->o:La/jg7;

    .line 106
    .line 107
    iput-object v5, v11, La/jo6;->j:Ljava/util/ArrayList;

    .line 108
    .line 109
    iput-wide v6, v11, La/jo6;->l:D

    .line 110
    .line 111
    iput-byte v3, v11, La/jo6;->m:B

    .line 112
    .line 113
    move-wide/from16 v26, v6

    .line 114
    .line 115
    move v7, v4

    .line 116
    move-wide/from16 v3, v26

    .line 117
    .line 118
    move-object v10, v5

    .line 119
    const-wide/16 v5, 0x5f

    .line 120
    .line 121
    move/from16 v16, v7

    .line 122
    .line 123
    const-string v7, ""

    .line 124
    .line 125
    move-object/from16 v17, v8

    .line 126
    .line 127
    const/4 v8, 0x0

    .line 128
    move-object/from16 v18, v2

    .line 129
    .line 130
    move-object v2, v9

    .line 131
    iget-boolean v9, v11, La/jo6;->n:Z

    .line 132
    .line 133
    move-object/from16 v19, v10

    .line 134
    .line 135
    const/4 v10, 0x1

    .line 136
    move-object/from16 v14, v17

    .line 137
    .line 138
    move-object/from16 v13, v18

    .line 139
    .line 140
    invoke-virtual/range {v0 .. v11}, La/pwi;->q(Ljava/util/List;La/jg7;DJLjava/lang/String;ZZZLa/zje;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-ne v0, v13, :cond_5

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    move-wide v6, v3

    .line 148
    :goto_1
    move-object v1, v0

    .line 149
    check-cast v1, La/ch20;

    .line 150
    .line 151
    iget-object v0, v14, La/vp6;->J:La/bn6;

    .line 152
    .line 153
    iget-object v2, v1, La/ch20;->a:Ljava/lang/String;

    .line 154
    .line 155
    const/16 v25, 0x4

    .line 156
    .line 157
    iget-wide v3, v11, La/jo6;->o:J

    .line 158
    .line 159
    const/16 v23, 0x0

    .line 160
    .line 161
    move-object/from16 v20, v0

    .line 162
    .line 163
    move-object/from16 v24, v2

    .line 164
    .line 165
    move-wide/from16 v21, v3

    .line 166
    .line 167
    invoke-static/range {v20 .. v25}, La/bn6;->l(La/bn6;JLjava/lang/String;Ljava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    iget-object v0, v14, La/vp6;->K:La/au0;

    .line 171
    .line 172
    iget-object v2, v1, La/ch20;->a:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    if-eqz v2, :cond_6

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 181
    .line 182
    .line 183
    move-result-wide v2

    .line 184
    goto :goto_2

    .line 185
    :cond_6
    const-wide/16 v2, 0x0

    .line 186
    .line 187
    :goto_2
    invoke-virtual {v0, v12, v2, v3, v15}, La/au0;->r(Ljava/lang/String;JZ)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v14, La/vp6;->R:La/nrt;

    .line 191
    .line 192
    iget-wide v2, v1, La/ch20;->b:J

    .line 193
    .line 194
    const/4 v10, 0x0

    .line 195
    iput-object v10, v11, La/jo6;->j:Ljava/util/ArrayList;

    .line 196
    .line 197
    iput-object v1, v11, La/jo6;->k:La/ch20;

    .line 198
    .line 199
    iput-wide v6, v11, La/jo6;->l:D

    .line 200
    .line 201
    const/4 v4, 0x3

    .line 202
    iput-byte v4, v11, La/jo6;->m:B

    .line 203
    .line 204
    invoke-static {v0, v2, v3, v11}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-ne v0, v13, :cond_7

    .line 209
    .line 210
    :goto_3
    move-object v5, v13

    .line 211
    goto :goto_5

    .line 212
    :cond_7
    :goto_4
    check-cast v0, La/ql5;

    .line 213
    .line 214
    iget-object v11, v0, La/ql5;->f:Ljava/lang/String;

    .line 215
    .line 216
    new-instance v0, La/hp6;

    .line 217
    .line 218
    const/4 v2, 0x0

    .line 219
    invoke-direct {v0, v2}, La/hp6;-><init>(Z)V

    .line 220
    .line 221
    .line 222
    sget v2, La/vp6;->W:I

    .line 223
    .line 224
    invoke-virtual {v14, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    new-instance v2, La/fp6;

    .line 228
    .line 229
    iget-object v3, v1, La/ch20;->a:Ljava/lang/String;

    .line 230
    .line 231
    iget-wide v4, v1, La/ch20;->b:J

    .line 232
    .line 233
    iget-wide v6, v1, La/ch20;->f:D

    .line 234
    .line 235
    iget-object v8, v1, La/ch20;->d:Ljava/lang/String;

    .line 236
    .line 237
    iget-wide v0, v1, La/ch20;->e:D

    .line 238
    .line 239
    mul-double v9, v6, v0

    .line 240
    .line 241
    iget-object v0, v14, La/vp6;->S:La/reu;

    .line 242
    .line 243
    invoke-virtual {v0}, La/reu;->c()La/nwo0;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iget-boolean v12, v0, La/nwo0;->a:Z

    .line 248
    .line 249
    invoke-direct/range {v2 .. v12}, La/fp6;-><init>(Ljava/lang/String;JDLjava/lang/String;DLjava/lang/String;Z)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v14, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    :goto_5
    return-object v5

    .line 258
    :pswitch_0
    move-object v13, v2

    .line 259
    check-cast v13, La/po6;

    .line 260
    .line 261
    sget-object v14, La/wne;->a:La/wne;

    .line 262
    .line 263
    iget-byte v0, v11, La/jo6;->m:B

    .line 264
    .line 265
    if-eqz v0, :cond_b

    .line 266
    .line 267
    if-eq v0, v15, :cond_a

    .line 268
    .line 269
    if-eq v0, v3, :cond_9

    .line 270
    .line 271
    if-ne v0, v4, :cond_8

    .line 272
    .line 273
    iget-object v0, v11, La/jo6;->k:La/ch20;

    .line 274
    .line 275
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v1, p1

    .line 279
    .line 280
    goto/16 :goto_a

    .line 281
    .line 282
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const/4 v5, 0x0

    .line 286
    goto/16 :goto_b

    .line 287
    .line 288
    :cond_9
    iget-wide v0, v11, La/jo6;->l:D

    .line 289
    .line 290
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    move-wide v3, v0

    .line 294
    move-object/from16 v0, p1

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_a
    iget-object v0, v11, La/jo6;->j:Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    move-object/from16 v1, p1

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    iget-object v0, v13, La/po6;->b:La/drt;

    .line 309
    .line 310
    invoke-virtual {v0}, La/drt;->a()Ljava/util/ArrayList;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    iget-object v1, v13, La/po6;->p:La/oif0;

    .line 315
    .line 316
    iput-object v0, v11, La/jo6;->j:Ljava/util/ArrayList;

    .line 317
    .line 318
    iput-byte v15, v11, La/jo6;->m:B

    .line 319
    .line 320
    invoke-virtual {v1, v11}, La/oif0;->z(La/zje;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    if-ne v1, v14, :cond_c

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_c
    :goto_6
    check-cast v1, Ljava/lang/Number;

    .line 328
    .line 329
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 330
    .line 331
    .line 332
    move-result-wide v1

    .line 333
    move-object v5, v0

    .line 334
    iget-object v0, v13, La/po6;->v:La/pwi;

    .line 335
    .line 336
    iget-object v6, v13, La/po6;->U:La/p7m0;

    .line 337
    .line 338
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    check-cast v6, La/jg7;

    .line 343
    .line 344
    const/4 v10, 0x0

    .line 345
    iput-object v10, v11, La/jo6;->j:Ljava/util/ArrayList;

    .line 346
    .line 347
    iput-wide v1, v11, La/jo6;->l:D

    .line 348
    .line 349
    iput-byte v3, v11, La/jo6;->m:B

    .line 350
    .line 351
    move/from16 v16, v4

    .line 352
    .line 353
    move-wide v3, v1

    .line 354
    move-object v1, v5

    .line 355
    move-object v2, v6

    .line 356
    const-wide/16 v5, 0x5f

    .line 357
    .line 358
    const-string v7, ""

    .line 359
    .line 360
    const/4 v8, 0x0

    .line 361
    iget-boolean v9, v11, La/jo6;->n:Z

    .line 362
    .line 363
    const/4 v10, 0x1

    .line 364
    invoke-virtual/range {v0 .. v11}, La/pwi;->q(Ljava/util/List;La/jg7;DJLjava/lang/String;ZZZLa/zje;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-ne v0, v14, :cond_d

    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_d
    :goto_7
    check-cast v0, La/ch20;

    .line 372
    .line 373
    iget-object v5, v13, La/po6;->y:La/bn6;

    .line 374
    .line 375
    iget-object v9, v0, La/ch20;->a:Ljava/lang/String;

    .line 376
    .line 377
    const/4 v10, 0x4

    .line 378
    iget-wide v6, v11, La/jo6;->o:J

    .line 379
    .line 380
    const/4 v8, 0x0

    .line 381
    invoke-static/range {v5 .. v10}, La/bn6;->l(La/bn6;JLjava/lang/String;Ljava/lang/String;I)V

    .line 382
    .line 383
    .line 384
    iget-object v1, v13, La/po6;->z:La/au0;

    .line 385
    .line 386
    iget-object v2, v0, La/ch20;->a:Ljava/lang/String;

    .line 387
    .line 388
    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    if-eqz v2, :cond_e

    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 395
    .line 396
    .line 397
    move-result-wide v5

    .line 398
    goto :goto_8

    .line 399
    :cond_e
    const-wide/16 v5, 0x0

    .line 400
    .line 401
    :goto_8
    invoke-virtual {v1, v12, v5, v6, v15}, La/au0;->r(Ljava/lang/String;JZ)V

    .line 402
    .line 403
    .line 404
    iget-object v1, v13, La/po6;->H:La/nrt;

    .line 405
    .line 406
    iget-wide v5, v0, La/ch20;->b:J

    .line 407
    .line 408
    const/4 v10, 0x0

    .line 409
    iput-object v10, v11, La/jo6;->j:Ljava/util/ArrayList;

    .line 410
    .line 411
    iput-object v0, v11, La/jo6;->k:La/ch20;

    .line 412
    .line 413
    iput-wide v3, v11, La/jo6;->l:D

    .line 414
    .line 415
    const/4 v4, 0x3

    .line 416
    iput-byte v4, v11, La/jo6;->m:B

    .line 417
    .line 418
    invoke-static {v1, v5, v6, v11}, La/nrt;->a(La/nrt;JLa/yje;)Ljava/io/Serializable;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    if-ne v1, v14, :cond_f

    .line 423
    .line 424
    :goto_9
    move-object v5, v14

    .line 425
    goto :goto_b

    .line 426
    :cond_f
    :goto_a
    check-cast v1, La/ql5;

    .line 427
    .line 428
    iget-object v11, v1, La/ql5;->f:Ljava/lang/String;

    .line 429
    .line 430
    iget-object v1, v13, La/po6;->S:La/p7m0;

    .line 431
    .line 432
    new-instance v2, La/wn20;

    .line 433
    .line 434
    iget-object v3, v0, La/ch20;->a:Ljava/lang/String;

    .line 435
    .line 436
    iget-wide v4, v0, La/ch20;->b:J

    .line 437
    .line 438
    iget-wide v6, v0, La/ch20;->f:D

    .line 439
    .line 440
    iget-object v8, v0, La/ch20;->d:Ljava/lang/String;

    .line 441
    .line 442
    iget-wide v9, v0, La/ch20;->e:D

    .line 443
    .line 444
    mul-double/2addr v9, v6

    .line 445
    iget-object v0, v13, La/po6;->I:La/reu;

    .line 446
    .line 447
    invoke-virtual {v0}, La/reu;->c()La/nwo0;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    iget-boolean v12, v0, La/nwo0;->a:Z

    .line 452
    .line 453
    invoke-direct/range {v2 .. v12}, La/wn20;-><init>(Ljava/lang/String;JDLjava/lang/String;DLjava/lang/String;Z)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    const/4 v10, 0x0

    .line 460
    invoke-virtual {v1, v10, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    :goto_b
    return-object v5

    .line 466
    nop

    .line 467
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
