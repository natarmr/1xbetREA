.class public final La/dk2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Ljava/lang/Object;

.field public k:B

.field public final synthetic l:Z

.field public final synthetic m:La/i3t0;

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(BJLa/yje;La/i3t0;Z)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/dk2;->i:B

    iput-boolean p6, p0, La/dk2;->l:Z

    iput-object p5, p0, La/dk2;->m:La/i3t0;

    iput-wide p2, p0, La/dk2;->n:J

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/dk2;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/dk2;->m:La/i3t0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/dk2;

    .line 9
    .line 10
    move-object v7, v1

    .line 11
    check-cast v7, La/qi2;

    .line 12
    .line 13
    iget-wide v4, p0, La/dk2;->n:J

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    iget-boolean v8, p0, La/dk2;->l:Z

    .line 17
    .line 18
    move-object v6, p1

    .line 19
    invoke-direct/range {v2 .. v8}, La/dk2;-><init>(BJLa/yje;La/i3t0;Z)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_0
    move-object v7, p1

    .line 24
    new-instance v3, La/dk2;

    .line 25
    .line 26
    move-object v8, v1

    .line 27
    check-cast v8, La/fk2;

    .line 28
    .line 29
    iget-wide v5, p0, La/dk2;->n:J

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    iget-boolean v9, p0, La/dk2;->l:Z

    .line 33
    .line 34
    invoke-direct/range {v3 .. v9}, La/dk2;-><init>(BJLa/yje;La/i3t0;Z)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :pswitch_1
    move-object v7, p1

    .line 39
    new-instance v3, La/dk2;

    .line 40
    .line 41
    move-object v8, v1

    .line 42
    check-cast v8, La/fk2;

    .line 43
    .line 44
    iget-wide v5, p0, La/dk2;->n:J

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    iget-boolean v9, p0, La/dk2;->l:Z

    .line 48
    .line 49
    invoke-direct/range {v3 .. v9}, La/dk2;-><init>(BJLa/yje;La/i3t0;Z)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dk2;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/dk2;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/dk2;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/dk2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/dk2;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/dk2;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/dk2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/dk2;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/dk2;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/dk2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-byte v0, v8, La/dk2;->i:B

    .line 4
    .line 5
    iget-boolean v1, v8, La/dk2;->l:Z

    .line 6
    .line 7
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v3, v8, La/dk2;->m:La/i3t0;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x2

    .line 13
    iget-wide v6, v8, La/dk2;->n:J

    .line 14
    .line 15
    const-wide/16 v9, 0x0

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v3, La/qi2;

    .line 22
    .line 23
    sget-object v12, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-byte v0, v8, La/dk2;->k:B

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    if-eq v0, v4, :cond_1

    .line 30
    .line 31
    if-ne v0, v5, :cond_0

    .line 32
    .line 33
    iget-object v0, v8, La/dk2;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, La/xde0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_1
    iget-object v0, v8, La/dk2;->j:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La/xcp;

    .line 46
    .line 47
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    if-eqz v1, :cond_8

    .line 56
    .line 57
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, La/ei2;

    .line 62
    .line 63
    iget-object v0, v0, La/ei2;->c:La/fqp0;

    .line 64
    .line 65
    instance-of v1, v0, La/cqp0;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    check-cast v0, La/cqp0;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move-object v0, v11

    .line 73
    :goto_1
    if-eqz v0, :cond_c

    .line 74
    .line 75
    iget-object v0, v0, La/cqp0;->a:Ljava/util/List;

    .line 76
    .line 77
    if-eqz v0, :cond_c

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    move-object v2, v1

    .line 94
    check-cast v2, La/xcp;

    .line 95
    .line 96
    iget-wide v13, v2, La/xcp;->a:J

    .line 97
    .line 98
    cmp-long v2, v13, v6

    .line 99
    .line 100
    if-nez v2, :cond_4

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    move-object v1, v11

    .line 104
    :goto_2
    check-cast v1, La/xcp;

    .line 105
    .line 106
    if-eqz v1, :cond_c

    .line 107
    .line 108
    iget-object v0, v1, La/xcp;->b:La/tnp0;

    .line 109
    .line 110
    iget-object v2, v3, La/qi2;->w:La/hcp0;

    .line 111
    .line 112
    iget-wide v5, v1, La/xcp;->a:J

    .line 113
    .line 114
    invoke-interface {v0}, La/tnp0;->c()J

    .line 115
    .line 116
    .line 117
    move-result-wide v13

    .line 118
    instance-of v3, v0, La/rnp0;

    .line 119
    .line 120
    if-eqz v3, :cond_6

    .line 121
    .line 122
    move-object v11, v0

    .line 123
    check-cast v11, La/rnp0;

    .line 124
    .line 125
    :cond_6
    if-eqz v11, :cond_7

    .line 126
    .line 127
    iget-wide v9, v11, La/rnp0;->c:J

    .line 128
    .line 129
    :cond_7
    iput-object v1, v8, La/dk2;->j:Ljava/lang/Object;

    .line 130
    .line 131
    iput-byte v4, v8, La/dk2;->k:B

    .line 132
    .line 133
    iget-boolean v3, v8, La/dk2;->l:Z

    .line 134
    .line 135
    move-object v0, v2

    .line 136
    move-wide v1, v5

    .line 137
    move-wide v6, v9

    .line 138
    move-wide v4, v13

    .line 139
    invoke-virtual/range {v0 .. v8}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-ne v0, v12, :cond_c

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, La/ei2;

    .line 151
    .line 152
    iget-object v0, v0, La/ei2;->c:La/fqp0;

    .line 153
    .line 154
    instance-of v1, v0, La/eqp0;

    .line 155
    .line 156
    if-eqz v1, :cond_9

    .line 157
    .line 158
    check-cast v0, La/eqp0;

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_9
    move-object v0, v11

    .line 162
    :goto_3
    if-eqz v0, :cond_c

    .line 163
    .line 164
    iget-object v0, v0, La/eqp0;->a:Ljava/util/List;

    .line 165
    .line 166
    if-eqz v0, :cond_c

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_b

    .line 177
    .line 178
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    move-object v2, v1

    .line 183
    check-cast v2, La/xde0;

    .line 184
    .line 185
    iget-wide v9, v2, La/xde0;->a:J

    .line 186
    .line 187
    cmp-long v2, v9, v6

    .line 188
    .line 189
    if-nez v2, :cond_a

    .line 190
    .line 191
    move-object v11, v1

    .line 192
    :cond_b
    check-cast v11, La/xde0;

    .line 193
    .line 194
    if-eqz v11, :cond_c

    .line 195
    .line 196
    iget-object v0, v3, La/qi2;->w:La/hcp0;

    .line 197
    .line 198
    iget-wide v1, v11, La/xde0;->a:J

    .line 199
    .line 200
    iget-object v3, v11, La/xde0;->b:Ljava/lang/Long;

    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 203
    .line 204
    .line 205
    move-result-wide v6

    .line 206
    iput-object v11, v8, La/dk2;->j:Ljava/lang/Object;

    .line 207
    .line 208
    iput-byte v5, v8, La/dk2;->k:B

    .line 209
    .line 210
    iget-boolean v3, v8, La/dk2;->l:Z

    .line 211
    .line 212
    const-wide/16 v4, 0x0

    .line 213
    .line 214
    invoke-virtual/range {v0 .. v8}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-ne v0, v12, :cond_c

    .line 219
    .line 220
    :goto_4
    move-object v11, v12

    .line 221
    goto :goto_6

    .line 222
    :cond_c
    :goto_5
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    :goto_6
    return-object v11

    .line 225
    :pswitch_0
    check-cast v3, La/fk2;

    .line 226
    .line 227
    sget-object v0, La/wne;->a:La/wne;

    .line 228
    .line 229
    iget-byte v12, v8, La/dk2;->k:B

    .line 230
    .line 231
    if-eqz v12, :cond_f

    .line 232
    .line 233
    if-eq v12, v4, :cond_e

    .line 234
    .line 235
    if-ne v12, v5, :cond_d

    .line 236
    .line 237
    iget-object v0, v8, La/dk2;->j:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, La/rbb;

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_f

    .line 246
    .line 247
    :cond_e
    iget-object v0, v8, La/dk2;->j:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, La/i5p;

    .line 250
    .line 251
    :goto_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_e

    .line 255
    .line 256
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    if-eqz v1, :cond_13

    .line 260
    .line 261
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, La/pj2;

    .line 266
    .line 267
    iget-object v1, v1, La/pj2;->c:La/nj2;

    .line 268
    .line 269
    instance-of v2, v1, La/kj2;

    .line 270
    .line 271
    if-eqz v2, :cond_10

    .line 272
    .line 273
    check-cast v1, La/kj2;

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_10
    move-object v1, v11

    .line 277
    :goto_8
    if-eqz v1, :cond_19

    .line 278
    .line 279
    iget-object v1, v1, La/kj2;->a:Ljava/util/List;

    .line 280
    .line 281
    if-eqz v1, :cond_19

    .line 282
    .line 283
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    :cond_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_12

    .line 292
    .line 293
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    move-object v5, v2

    .line 298
    check-cast v5, La/i5p;

    .line 299
    .line 300
    iget-wide v9, v5, La/i5p;->a:J

    .line 301
    .line 302
    cmp-long v5, v9, v6

    .line 303
    .line 304
    if-nez v5, :cond_11

    .line 305
    .line 306
    move-object v11, v2

    .line 307
    :cond_12
    check-cast v11, La/i5p;

    .line 308
    .line 309
    if-eqz v11, :cond_19

    .line 310
    .line 311
    new-instance v12, La/tj2;

    .line 312
    .line 313
    iget-wide v13, v11, La/i5p;->a:J

    .line 314
    .line 315
    iget-wide v1, v11, La/i5p;->m:J

    .line 316
    .line 317
    iget-object v5, v11, La/i5p;->e:Ljava/lang/String;

    .line 318
    .line 319
    iget-wide v6, v11, La/i5p;->b:J

    .line 320
    .line 321
    iget-wide v9, v11, La/i5p;->c:J

    .line 322
    .line 323
    iget-object v15, v11, La/i5p;->d:La/sgb;

    .line 324
    .line 325
    iget v4, v11, La/i5p;->k:I

    .line 326
    .line 327
    move/from16 v23, v4

    .line 328
    .line 329
    move-object/from16 v17, v5

    .line 330
    .line 331
    move-wide/from16 v18, v6

    .line 332
    .line 333
    move-wide/from16 v20, v9

    .line 334
    .line 335
    move-object/from16 v22, v15

    .line 336
    .line 337
    move-wide v15, v1

    .line 338
    invoke-direct/range {v12 .. v23}, La/tj2;-><init>(JJLjava/lang/String;JJLa/sgb;I)V

    .line 339
    .line 340
    .line 341
    iput-object v11, v8, La/dk2;->j:Ljava/lang/Object;

    .line 342
    .line 343
    const/4 v1, 0x1

    .line 344
    iput-byte v1, v8, La/dk2;->k:B

    .line 345
    .line 346
    invoke-virtual {v3, v12, v8}, La/fk2;->N(La/tj2;La/dk2;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    if-ne v1, v0, :cond_19

    .line 351
    .line 352
    goto/16 :goto_d

    .line 353
    .line 354
    :cond_13
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    check-cast v1, La/pj2;

    .line 359
    .line 360
    iget-object v1, v1, La/pj2;->c:La/nj2;

    .line 361
    .line 362
    instance-of v2, v1, La/mj2;

    .line 363
    .line 364
    if-eqz v2, :cond_14

    .line 365
    .line 366
    check-cast v1, La/mj2;

    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_14
    move-object v1, v11

    .line 370
    :goto_9
    if-eqz v1, :cond_19

    .line 371
    .line 372
    iget-object v1, v1, La/mj2;->a:Ljava/util/ArrayList;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    :cond_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_16

    .line 383
    .line 384
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    move-object v4, v2

    .line 389
    check-cast v4, La/rbb;

    .line 390
    .line 391
    iget-wide v12, v4, La/rbb;->a:J

    .line 392
    .line 393
    cmp-long v4, v12, v6

    .line 394
    .line 395
    if-nez v4, :cond_15

    .line 396
    .line 397
    move-object v11, v2

    .line 398
    :cond_16
    check-cast v11, La/rbb;

    .line 399
    .line 400
    if-eqz v11, :cond_19

    .line 401
    .line 402
    iget-object v1, v11, La/rbb;->p:Ljava/util/List;

    .line 403
    .line 404
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, La/ygs;

    .line 409
    .line 410
    if-eqz v1, :cond_17

    .line 411
    .line 412
    iget-wide v1, v1, La/ygs;->B:J

    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_17
    move-wide v1, v9

    .line 416
    :goto_a
    cmp-long v4, v1, v9

    .line 417
    .line 418
    iget-wide v13, v11, La/rbb;->a:J

    .line 419
    .line 420
    if-eqz v4, :cond_18

    .line 421
    .line 422
    new-instance v4, La/qgb;

    .line 423
    .line 424
    invoke-direct {v4, v13, v14, v1, v2}, La/qgb;-><init>(JJ)V

    .line 425
    .line 426
    .line 427
    :goto_b
    move-object/from16 v22, v4

    .line 428
    .line 429
    goto :goto_c

    .line 430
    :cond_18
    new-instance v4, La/rgb;

    .line 431
    .line 432
    invoke-direct {v4, v13, v14}, La/rgb;-><init>(J)V

    .line 433
    .line 434
    .line 435
    goto :goto_b

    .line 436
    :goto_c
    new-instance v12, La/tj2;

    .line 437
    .line 438
    iget-wide v6, v11, La/rbb;->b:J

    .line 439
    .line 440
    iget-object v4, v11, La/rbb;->c:Ljava/lang/String;

    .line 441
    .line 442
    iget-wide v9, v11, La/rbb;->n:J

    .line 443
    .line 444
    const/16 v23, -0x1

    .line 445
    .line 446
    move-wide/from16 v20, v1

    .line 447
    .line 448
    move-object/from16 v17, v4

    .line 449
    .line 450
    move-wide v15, v6

    .line 451
    move-wide/from16 v18, v9

    .line 452
    .line 453
    invoke-direct/range {v12 .. v23}, La/tj2;-><init>(JJLjava/lang/String;JJLa/sgb;I)V

    .line 454
    .line 455
    .line 456
    iput-object v11, v8, La/dk2;->j:Ljava/lang/Object;

    .line 457
    .line 458
    iput-byte v5, v8, La/dk2;->k:B

    .line 459
    .line 460
    invoke-virtual {v3, v12, v8}, La/fk2;->N(La/tj2;La/dk2;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    if-ne v1, v0, :cond_19

    .line 465
    .line 466
    :goto_d
    move-object v11, v0

    .line 467
    goto :goto_f

    .line 468
    :cond_19
    :goto_e
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 469
    .line 470
    :goto_f
    return-object v11

    .line 471
    :pswitch_1
    check-cast v3, La/fk2;

    .line 472
    .line 473
    sget-object v12, La/wne;->a:La/wne;

    .line 474
    .line 475
    iget-byte v0, v8, La/dk2;->k:B

    .line 476
    .line 477
    if-eqz v0, :cond_1c

    .line 478
    .line 479
    const/4 v4, 0x1

    .line 480
    if-eq v0, v4, :cond_1b

    .line 481
    .line 482
    if-ne v0, v5, :cond_1a

    .line 483
    .line 484
    iget-object v0, v8, La/dk2;->j:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v0, La/rbb;

    .line 487
    .line 488
    goto :goto_10

    .line 489
    :cond_1a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    goto/16 :goto_17

    .line 493
    .line 494
    :cond_1b
    iget-object v0, v8, La/dk2;->j:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v0, La/i5p;

    .line 497
    .line 498
    :goto_10
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    goto/16 :goto_16

    .line 502
    .line 503
    :cond_1c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    if-eqz v1, :cond_21

    .line 507
    .line 508
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    check-cast v0, La/pj2;

    .line 513
    .line 514
    iget-object v0, v0, La/pj2;->c:La/nj2;

    .line 515
    .line 516
    instance-of v1, v0, La/kj2;

    .line 517
    .line 518
    if-eqz v1, :cond_1d

    .line 519
    .line 520
    check-cast v0, La/kj2;

    .line 521
    .line 522
    goto :goto_11

    .line 523
    :cond_1d
    move-object v0, v11

    .line 524
    :goto_11
    if-eqz v0, :cond_27

    .line 525
    .line 526
    iget-object v0, v0, La/kj2;->a:Ljava/util/List;

    .line 527
    .line 528
    if-eqz v0, :cond_27

    .line 529
    .line 530
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    if-eqz v1, :cond_1f

    .line 539
    .line 540
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    move-object v2, v1

    .line 545
    check-cast v2, La/i5p;

    .line 546
    .line 547
    iget-wide v4, v2, La/i5p;->a:J

    .line 548
    .line 549
    cmp-long v2, v4, v6

    .line 550
    .line 551
    if-nez v2, :cond_1e

    .line 552
    .line 553
    move-object v11, v1

    .line 554
    :cond_1f
    check-cast v11, La/i5p;

    .line 555
    .line 556
    if-eqz v11, :cond_27

    .line 557
    .line 558
    iget-object v0, v3, La/fk2;->x:La/nv20;

    .line 559
    .line 560
    iget-wide v1, v11, La/i5p;->c:J

    .line 561
    .line 562
    new-instance v3, Ljava/lang/Long;

    .line 563
    .line 564
    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 565
    .line 566
    .line 567
    iput-object v11, v8, La/dk2;->j:Ljava/lang/Object;

    .line 568
    .line 569
    const/4 v1, 0x1

    .line 570
    iput-byte v1, v8, La/dk2;->k:B

    .line 571
    .line 572
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    new-instance v1, La/qgb;

    .line 576
    .line 577
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 578
    .line 579
    .line 580
    move-result-wide v2

    .line 581
    invoke-direct {v1, v6, v7, v2, v3}, La/qgb;-><init>(JJ)V

    .line 582
    .line 583
    .line 584
    iget-object v0, v0, La/nv20;->a:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v0, La/khf0;

    .line 587
    .line 588
    invoke-virtual {v0, v1, v8}, La/khf0;->D(La/sgb;La/zje;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    sget-object v1, La/wne;->a:La/wne;

    .line 593
    .line 594
    if-ne v0, v1, :cond_20

    .line 595
    .line 596
    goto :goto_12

    .line 597
    :cond_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    :goto_12
    if-ne v0, v12, :cond_27

    .line 600
    .line 601
    goto/16 :goto_15

    .line 602
    .line 603
    :cond_21
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    check-cast v0, La/pj2;

    .line 608
    .line 609
    iget-object v0, v0, La/pj2;->c:La/nj2;

    .line 610
    .line 611
    instance-of v1, v0, La/mj2;

    .line 612
    .line 613
    if-eqz v1, :cond_22

    .line 614
    .line 615
    check-cast v0, La/mj2;

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :cond_22
    move-object v0, v11

    .line 619
    :goto_13
    if-eqz v0, :cond_27

    .line 620
    .line 621
    iget-object v0, v0, La/mj2;->a:Ljava/util/ArrayList;

    .line 622
    .line 623
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    :cond_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    if-eqz v1, :cond_24

    .line 632
    .line 633
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    move-object v2, v1

    .line 638
    check-cast v2, La/rbb;

    .line 639
    .line 640
    iget-wide v13, v2, La/rbb;->a:J

    .line 641
    .line 642
    cmp-long v2, v13, v6

    .line 643
    .line 644
    if-nez v2, :cond_23

    .line 645
    .line 646
    move-object v11, v1

    .line 647
    :cond_24
    check-cast v11, La/rbb;

    .line 648
    .line 649
    if-eqz v11, :cond_27

    .line 650
    .line 651
    iget-object v0, v3, La/fk2;->w:La/fvt0;

    .line 652
    .line 653
    iget-wide v1, v11, La/rbb;->n:J

    .line 654
    .line 655
    iget-object v3, v11, La/rbb;->p:Ljava/util/List;

    .line 656
    .line 657
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    check-cast v3, La/ygs;

    .line 662
    .line 663
    if-eqz v3, :cond_25

    .line 664
    .line 665
    iget-wide v9, v3, La/ygs;->B:J

    .line 666
    .line 667
    :cond_25
    new-instance v3, Ljava/lang/Long;

    .line 668
    .line 669
    invoke-direct {v3, v9, v10}, Ljava/lang/Long;-><init>(J)V

    .line 670
    .line 671
    .line 672
    move-object v4, v3

    .line 673
    iget-boolean v3, v11, La/rbb;->m:Z

    .line 674
    .line 675
    iput-object v11, v8, La/dk2;->j:Ljava/lang/Object;

    .line 676
    .line 677
    iput-byte v5, v8, La/dk2;->k:B

    .line 678
    .line 679
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    move-object v5, v4

    .line 683
    new-instance v4, La/qgb;

    .line 684
    .line 685
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 686
    .line 687
    .line 688
    move-result-wide v9

    .line 689
    invoke-direct {v4, v6, v7, v9, v10}, La/qgb;-><init>(JJ)V

    .line 690
    .line 691
    .line 692
    iget-object v0, v0, La/fvt0;->a:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v0, La/nr;

    .line 695
    .line 696
    move-object v5, v8

    .line 697
    invoke-virtual/range {v0 .. v5}, La/nr;->u(JZLa/sgb;La/zje;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    sget-object v1, La/wne;->a:La/wne;

    .line 702
    .line 703
    if-ne v0, v1, :cond_26

    .line 704
    .line 705
    goto :goto_14

    .line 706
    :cond_26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 707
    .line 708
    :goto_14
    if-ne v0, v12, :cond_27

    .line 709
    .line 710
    :goto_15
    move-object v11, v12

    .line 711
    goto :goto_17

    .line 712
    :cond_27
    :goto_16
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 713
    .line 714
    :goto_17
    return-object v11

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
