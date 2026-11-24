.class public final La/fa60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/util/List;

.field public synthetic l:Ljava/util/List;

.field public synthetic m:Ljava/util/HashMap;

.field public final synthetic n:J

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/fa60;->i:B

    iput-object p1, p0, La/fa60;->o:Ljava/lang/Object;

    iput-wide p2, p0, La/fa60;->n:J

    const/4 p1, 0x5

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/fa60;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/fa60;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    check-cast p2, Ljava/util/List;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p3, Ljava/util/List;

    .line 13
    .line 14
    check-cast p4, Ljava/util/HashMap;

    .line 15
    .line 16
    move-object v6, p5

    .line 17
    check-cast v6, La/yje;

    .line 18
    .line 19
    new-instance v2, La/fa60;

    .line 20
    .line 21
    move-object v3, v1

    .line 22
    check-cast v3, La/rrd;

    .line 23
    .line 24
    iget-wide v4, p0, La/fa60;->n:J

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    invoke-direct/range {v2 .. v7}, La/fa60;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 28
    .line 29
    .line 30
    iput-object p1, v2, La/fa60;->j:Ljava/util/List;

    .line 31
    .line 32
    iput-object p2, v2, La/fa60;->k:Ljava/util/List;

    .line 33
    .line 34
    iput-object p3, v2, La/fa60;->l:Ljava/util/List;

    .line 35
    .line 36
    iput-object p4, v2, La/fa60;->m:Ljava/util/HashMap;

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    invoke-virtual {v2, p0}, La/fa60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast p3, Ljava/util/HashMap;

    .line 46
    .line 47
    check-cast p4, Ljava/util/List;

    .line 48
    .line 49
    move-object v6, p5

    .line 50
    check-cast v6, La/yje;

    .line 51
    .line 52
    new-instance v2, La/fa60;

    .line 53
    .line 54
    move-object v3, v1

    .line 55
    check-cast v3, La/pzu;

    .line 56
    .line 57
    iget-wide v4, p0, La/fa60;->n:J

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-direct/range {v2 .. v7}, La/fa60;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v2, La/fa60;->j:Ljava/util/List;

    .line 64
    .line 65
    iput-object p2, v2, La/fa60;->k:Ljava/util/List;

    .line 66
    .line 67
    iput-object p3, v2, La/fa60;->m:Ljava/util/HashMap;

    .line 68
    .line 69
    iput-object p4, v2, La/fa60;->l:Ljava/util/List;

    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    invoke-virtual {v2, p0}, La/fa60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 60

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fa60;->i:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    iget-object v3, v0, La/fa60;->o:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/fa60;->j:Ljava/util/List;

    .line 13
    .line 14
    iget-object v7, v0, La/fa60;->k:Ljava/util/List;

    .line 15
    .line 16
    iget-object v8, v0, La/fa60;->l:Ljava/util/List;

    .line 17
    .line 18
    iget-object v9, v0, La/fa60;->m:Ljava/util/HashMap;

    .line 19
    .line 20
    sget-object v10, La/wne;->a:La/wne;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    check-cast v3, La/rrd;

    .line 26
    .line 27
    new-instance v10, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 30
    .line 31
    .line 32
    move-result v11

    .line 33
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    if-eqz v12, :cond_7

    .line 45
    .line 46
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    check-cast v12, La/wr20;

    .line 51
    .line 52
    iget-wide v13, v12, La/wr20;->b:J

    .line 53
    .line 54
    new-instance v15, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-direct {v15, v13, v14}, Ljava/lang/Long;-><init>(J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v9, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v13

    .line 63
    check-cast v13, Ljava/lang/Boolean;

    .line 64
    .line 65
    if-eqz v13, :cond_0

    .line 66
    .line 67
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    move/from16 v19, v13

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    const/16 v19, 0x0

    .line 75
    .line 76
    :goto_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v13, v12, La/wr20;->a:Ljava/util/ArrayList;

    .line 83
    .line 84
    new-instance v15, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-static {v13, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v13

    .line 97
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    if-eqz v14, :cond_6

    .line 102
    .line 103
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v14

    .line 107
    check-cast v14, La/sr20;

    .line 108
    .line 109
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v4, v14, La/sr20;->a:Ljava/util/ArrayList;

    .line 113
    .line 114
    const/16 v20, 0x0

    .line 115
    .line 116
    iget-wide v5, v14, La/sr20;->e:J

    .line 117
    .line 118
    move-object/from16 v29, v1

    .line 119
    .line 120
    new-instance v1, Ljava/util/ArrayList;

    .line 121
    .line 122
    move-object/from16 p1, v11

    .line 123
    .line 124
    invoke-static {v4, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    invoke-direct {v1, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-eqz v11, :cond_3

    .line 140
    .line 141
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    check-cast v11, Ljava/util/List;

    .line 146
    .line 147
    move-object/from16 v16, v4

    .line 148
    .line 149
    new-instance v4, Ljava/util/ArrayList;

    .line 150
    .line 151
    move-object/from16 v17, v13

    .line 152
    .line 153
    invoke-static {v11, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    invoke-direct {v4, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    const/4 v13, 0x0

    .line 165
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v18

    .line 169
    if-eqz v18, :cond_2

    .line 170
    .line 171
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v18

    .line 175
    add-int/lit8 v21, v13, 0x1

    .line 176
    .line 177
    if-ltz v13, :cond_1

    .line 178
    .line 179
    move-object/from16 v13, v18

    .line 180
    .line 181
    check-cast v13, La/vr20;

    .line 182
    .line 183
    invoke-static {v8, v13, v5, v6}, La/yyw;->P(Ljava/util/List;La/vr20;J)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    move-object/from16 v30, v8

    .line 188
    .line 189
    invoke-static {v7, v13, v5, v6}, La/yyw;->P(Ljava/util/List;La/vr20;J)Z

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    move-wide/from16 v22, v5

    .line 194
    .line 195
    sget-object v5, La/uyc;->c:La/uyc;

    .line 196
    .line 197
    invoke-static {v13, v2, v8, v5}, La/tlb;->h0(La/vr20;ZZLa/uyc;)La/hao;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move/from16 v13, v21

    .line 205
    .line 206
    move-wide/from16 v5, v22

    .line 207
    .line 208
    move-object/from16 v8, v30

    .line 209
    .line 210
    const/16 v2, 0xa

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 214
    .line 215
    .line 216
    throw v20

    .line 217
    :cond_2
    move-wide/from16 v22, v5

    .line 218
    .line 219
    move-object/from16 v30, v8

    .line 220
    .line 221
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-object/from16 v4, v16

    .line 225
    .line 226
    move-object/from16 v13, v17

    .line 227
    .line 228
    const/16 v2, 0xa

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_3
    move-object/from16 v30, v8

    .line 232
    .line 233
    move-object/from16 v17, v13

    .line 234
    .line 235
    iget-boolean v2, v14, La/sr20;->d:Z

    .line 236
    .line 237
    iget-object v4, v14, La/sr20;->f:La/f07;

    .line 238
    .line 239
    sget-object v5, La/f07;->b:La/f07;

    .line 240
    .line 241
    if-ne v4, v5, :cond_4

    .line 242
    .line 243
    const/16 v27, 0x1

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_4
    const/16 v27, 0x0

    .line 247
    .line 248
    :goto_5
    iget-wide v5, v14, La/sr20;->b:J

    .line 249
    .line 250
    iget-object v8, v14, La/sr20;->c:Ljava/lang/String;

    .line 251
    .line 252
    sget-object v11, La/f07;->c:La/f07;

    .line 253
    .line 254
    if-ne v4, v11, :cond_5

    .line 255
    .line 256
    const/16 v28, 0x1

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_5
    const/16 v28, 0x0

    .line 260
    .line 261
    :goto_6
    new-instance v21, La/lu20;

    .line 262
    .line 263
    move-object/from16 v22, v1

    .line 264
    .line 265
    move/from16 v26, v2

    .line 266
    .line 267
    move-wide/from16 v23, v5

    .line 268
    .line 269
    move-object/from16 v25, v8

    .line 270
    .line 271
    invoke-direct/range {v21 .. v28}, La/lu20;-><init>(Ljava/util/ArrayList;JLjava/lang/String;ZZZ)V

    .line 272
    .line 273
    .line 274
    move-object/from16 v1, v21

    .line 275
    .line 276
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-object/from16 v11, p1

    .line 280
    .line 281
    move-object/from16 v13, v17

    .line 282
    .line 283
    move-object/from16 v1, v29

    .line 284
    .line 285
    move-object/from16 v8, v30

    .line 286
    .line 287
    const/16 v2, 0xa

    .line 288
    .line 289
    goto/16 :goto_2

    .line 290
    .line 291
    :cond_6
    move-object/from16 v29, v1

    .line 292
    .line 293
    move-object/from16 v30, v8

    .line 294
    .line 295
    move-object/from16 p1, v11

    .line 296
    .line 297
    const/16 v20, 0x0

    .line 298
    .line 299
    iget-wide v1, v12, La/wr20;->b:J

    .line 300
    .line 301
    iget-object v4, v12, La/wr20;->c:Ljava/lang/String;

    .line 302
    .line 303
    new-instance v14, La/ey20;

    .line 304
    .line 305
    move-wide/from16 v16, v1

    .line 306
    .line 307
    move-object/from16 v18, v4

    .line 308
    .line 309
    invoke-direct/range {v14 .. v19}, La/ey20;-><init>(Ljava/util/ArrayList;JLjava/lang/String;Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-object/from16 v1, v29

    .line 316
    .line 317
    const/16 v2, 0xa

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :cond_7
    move-object/from16 v29, v1

    .line 322
    .line 323
    const/16 v20, 0x0

    .line 324
    .line 325
    new-instance v1, Ljava/util/HashSet;

    .line 326
    .line 327
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-interface/range {v29 .. v29}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    if-eqz v4, :cond_8

    .line 339
    .line 340
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    check-cast v4, La/wr20;

    .line 345
    .line 346
    iget-wide v4, v4, La/wr20;->b:J

    .line 347
    .line 348
    new-instance v6, Ljava/lang/Long;

    .line 349
    .line 350
    invoke-direct {v6, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    iget-object v2, v3, La/rrd;->g:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v2, La/rrc;

    .line 363
    .line 364
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    :cond_9
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    iget-wide v12, v0, La/fa60;->n:J

    .line 377
    .line 378
    if-eqz v5, :cond_a

    .line 379
    .line 380
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    check-cast v5, Ljava/util/Map$Entry;

    .line 385
    .line 386
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    check-cast v6, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 393
    .line 394
    .line 395
    move-result-wide v15

    .line 396
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    check-cast v5, Ljava/lang/Boolean;

    .line 401
    .line 402
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-eqz v5, :cond_9

    .line 407
    .line 408
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    if-nez v5, :cond_9

    .line 417
    .line 418
    iget-object v5, v2, La/rrc;->b:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v5, La/fno;

    .line 421
    .line 422
    iget-object v11, v5, La/fno;->a:La/cno;

    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    invoke-virtual/range {v11 .. v16}, La/cno;->b(JZJ)V

    .line 426
    .line 427
    .line 428
    goto :goto_8

    .line 429
    :cond_a
    iget-object v0, v3, La/rrd;->f:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, La/bwl;

    .line 432
    .line 433
    iget-object v0, v0, La/bwl;->a:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v0, La/fno;

    .line 436
    .line 437
    iget-object v0, v0, La/fno;->a:La/cno;

    .line 438
    .line 439
    iget-object v0, v0, La/cno;->a:Ljava/util/LinkedHashMap;

    .line 440
    .line 441
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    check-cast v0, La/bno;

    .line 450
    .line 451
    if-eqz v0, :cond_b

    .line 452
    .line 453
    iget-boolean v0, v0, La/bno;->b:Z

    .line 454
    .line 455
    goto :goto_9

    .line 456
    :cond_b
    const/4 v0, 0x0

    .line 457
    :goto_9
    if-eqz v0, :cond_c

    .line 458
    .line 459
    goto/16 :goto_f

    .line 460
    .line 461
    :cond_c
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->S0(Ljava/lang/Iterable;)La/rx3;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    instance-of v1, v0, Ljava/util/Collection;

    .line 466
    .line 467
    if-eqz v1, :cond_d

    .line 468
    .line 469
    move-object v1, v0

    .line 470
    check-cast v1, Ljava/util/Collection;

    .line 471
    .line 472
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    if-eqz v1, :cond_d

    .line 477
    .line 478
    goto :goto_f

    .line 479
    :cond_d
    invoke-virtual {v0}, La/rx3;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    :goto_a
    move-object v1, v0

    .line 484
    check-cast v1, La/iil;

    .line 485
    .line 486
    iget-object v3, v1, La/iil;->b:Ljava/util/Iterator;

    .line 487
    .line 488
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    if-eqz v3, :cond_13

    .line 493
    .line 494
    invoke-virtual {v1}, La/iil;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    check-cast v1, Lkotlin/collections/IndexedValue;

    .line 499
    .line 500
    iget v3, v1, Lkotlin/collections/IndexedValue;->a:I

    .line 501
    .line 502
    iget-object v1, v1, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v1, La/ey20;

    .line 505
    .line 506
    iget-wide v4, v1, La/ey20;->b:J

    .line 507
    .line 508
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    invoke-virtual {v9, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    check-cast v1, Ljava/lang/Boolean;

    .line 517
    .line 518
    if-eqz v1, :cond_e

    .line 519
    .line 520
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    goto :goto_b

    .line 525
    :cond_e
    const/4 v1, 0x0

    .line 526
    :goto_b
    const/4 v4, 0x3

    .line 527
    if-ge v3, v4, :cond_f

    .line 528
    .line 529
    const/4 v3, 0x1

    .line 530
    goto :goto_c

    .line 531
    :cond_f
    const/4 v3, 0x0

    .line 532
    :goto_c
    if-ne v1, v3, :cond_10

    .line 533
    .line 534
    goto :goto_a

    .line 535
    :cond_10
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    const/4 v1, 0x0

    .line 540
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    if-eqz v3, :cond_13

    .line 545
    .line 546
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    add-int/lit8 v5, v1, 0x1

    .line 551
    .line 552
    if-ltz v1, :cond_12

    .line 553
    .line 554
    check-cast v3, La/ey20;

    .line 555
    .line 556
    iget-wide v6, v3, La/ey20;->b:J

    .line 557
    .line 558
    if-ge v1, v4, :cond_11

    .line 559
    .line 560
    const/4 v14, 0x1

    .line 561
    goto :goto_e

    .line 562
    :cond_11
    const/4 v14, 0x0

    .line 563
    :goto_e
    iget-object v1, v2, La/rrc;->b:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v1, La/fno;

    .line 566
    .line 567
    iget-object v11, v1, La/fno;->a:La/cno;

    .line 568
    .line 569
    move-wide v15, v6

    .line 570
    invoke-virtual/range {v11 .. v16}, La/cno;->b(JZJ)V

    .line 571
    .line 572
    .line 573
    move v1, v5

    .line 574
    goto :goto_d

    .line 575
    :cond_12
    invoke-static {}, La/q3d;->p()V

    .line 576
    .line 577
    .line 578
    throw v20

    .line 579
    :cond_13
    :goto_f
    return-object v10

    .line 580
    :pswitch_0
    const/16 v20, 0x0

    .line 581
    .line 582
    iget-object v1, v0, La/fa60;->j:Ljava/util/List;

    .line 583
    .line 584
    iget-object v2, v0, La/fa60;->k:Ljava/util/List;

    .line 585
    .line 586
    iget-object v5, v0, La/fa60;->m:Ljava/util/HashMap;

    .line 587
    .line 588
    iget-object v4, v0, La/fa60;->l:Ljava/util/List;

    .line 589
    .line 590
    sget-object v6, La/wne;->a:La/wne;

    .line 591
    .line 592
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    check-cast v3, La/pzu;

    .line 596
    .line 597
    new-instance v6, Ljava/util/ArrayList;

    .line 598
    .line 599
    const/16 v7, 0xa

    .line 600
    .line 601
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 602
    .line 603
    .line 604
    move-result v8

    .line 605
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 606
    .line 607
    .line 608
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 609
    .line 610
    .line 611
    move-result-object v7

    .line 612
    :goto_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 613
    .line 614
    .line 615
    move-result v8

    .line 616
    if-eqz v8, :cond_21

    .line 617
    .line 618
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v8

    .line 622
    check-cast v8, La/sr20;

    .line 623
    .line 624
    iget-wide v9, v8, La/sr20;->b:J

    .line 625
    .line 626
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 627
    .line 628
    .line 629
    move-result-object v9

    .line 630
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v9

    .line 634
    check-cast v9, Ljava/lang/Boolean;

    .line 635
    .line 636
    if-eqz v9, :cond_14

    .line 637
    .line 638
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 639
    .line 640
    .line 641
    move-result v9

    .line 642
    move/from16 v17, v9

    .line 643
    .line 644
    goto :goto_11

    .line 645
    :cond_14
    const/16 v17, 0x0

    .line 646
    .line 647
    :goto_11
    if-eqz v4, :cond_16

    .line 648
    .line 649
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v9

    .line 653
    if-eqz v9, :cond_16

    .line 654
    .line 655
    :cond_15
    const/16 v18, 0x0

    .line 656
    .line 657
    goto :goto_12

    .line 658
    :cond_16
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 659
    .line 660
    .line 661
    move-result-object v9

    .line 662
    :cond_17
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 663
    .line 664
    .line 665
    move-result v10

    .line 666
    if-eqz v10, :cond_15

    .line 667
    .line 668
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v10

    .line 672
    check-cast v10, La/vt20;

    .line 673
    .line 674
    iget-wide v11, v10, La/vt20;->a:J

    .line 675
    .line 676
    iget-wide v13, v8, La/sr20;->b:J

    .line 677
    .line 678
    cmp-long v11, v11, v13

    .line 679
    .line 680
    if-nez v11, :cond_17

    .line 681
    .line 682
    iget v10, v10, La/vt20;->c:I

    .line 683
    .line 684
    if-eqz v10, :cond_17

    .line 685
    .line 686
    const/16 v18, 0x1

    .line 687
    .line 688
    :goto_12
    sget-object v9, La/iun;->a:La/iun;

    .line 689
    .line 690
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    iget-object v10, v8, La/sr20;->a:Ljava/util/ArrayList;

    .line 697
    .line 698
    new-instance v11, Ljava/util/ArrayList;

    .line 699
    .line 700
    const/16 v12, 0xa

    .line 701
    .line 702
    invoke-static {v10, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 703
    .line 704
    .line 705
    move-result v13

    .line 706
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 710
    .line 711
    .line 712
    move-result-object v10

    .line 713
    :goto_13
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 714
    .line 715
    .line 716
    move-result v13

    .line 717
    if-eqz v13, :cond_1d

    .line 718
    .line 719
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v13

    .line 723
    check-cast v13, Ljava/util/List;

    .line 724
    .line 725
    new-instance v14, Ljava/util/ArrayList;

    .line 726
    .line 727
    invoke-static {v13, v12}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 728
    .line 729
    .line 730
    move-result v15

    .line 731
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 732
    .line 733
    .line 734
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 735
    .line 736
    .line 737
    move-result-object v12

    .line 738
    :goto_14
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 739
    .line 740
    .line 741
    move-result v13

    .line 742
    if-eqz v13, :cond_1c

    .line 743
    .line 744
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v13

    .line 748
    move-object/from16 v30, v13

    .line 749
    .line 750
    check-cast v30, La/vr20;

    .line 751
    .line 752
    move-object/from16 v19, v1

    .line 753
    .line 754
    move-object/from16 v21, v2

    .line 755
    .line 756
    iget-wide v1, v8, La/sr20;->e:J

    .line 757
    .line 758
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 759
    .line 760
    .line 761
    move-result-object v13

    .line 762
    :goto_15
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 763
    .line 764
    .line 765
    move-result v15

    .line 766
    if-eqz v15, :cond_19

    .line 767
    .line 768
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v15

    .line 772
    move-wide/from16 v31, v1

    .line 773
    .line 774
    move-object v1, v15

    .line 775
    check-cast v1, La/qu6;

    .line 776
    .line 777
    move-object/from16 p1, v12

    .line 778
    .line 779
    move-object v2, v13

    .line 780
    iget-wide v12, v1, La/qu6;->b:J

    .line 781
    .line 782
    move-wide/from16 v33, v12

    .line 783
    .line 784
    iget-wide v12, v1, La/qu6;->x:J

    .line 785
    .line 786
    move-wide/from16 v35, v12

    .line 787
    .line 788
    iget-wide v12, v1, La/qu6;->d:J

    .line 789
    .line 790
    move-object/from16 v16, v2

    .line 791
    .line 792
    iget-wide v1, v1, La/qu6;->t:D

    .line 793
    .line 794
    move-wide/from16 v39, v1

    .line 795
    .line 796
    move-wide/from16 v37, v12

    .line 797
    .line 798
    invoke-static/range {v30 .. v40}, La/n6x;->G(La/vr20;JJJJD)Z

    .line 799
    .line 800
    .line 801
    move-result v1

    .line 802
    move-object/from16 v13, v30

    .line 803
    .line 804
    if-eqz v1, :cond_18

    .line 805
    .line 806
    goto :goto_16

    .line 807
    :cond_18
    move-object/from16 v12, p1

    .line 808
    .line 809
    move-object/from16 v30, v13

    .line 810
    .line 811
    move-object/from16 v13, v16

    .line 812
    .line 813
    move-wide/from16 v1, v31

    .line 814
    .line 815
    goto :goto_15

    .line 816
    :cond_19
    move-object/from16 p1, v12

    .line 817
    .line 818
    move-object/from16 v13, v30

    .line 819
    .line 820
    move-object/from16 v15, v20

    .line 821
    .line 822
    :goto_16
    check-cast v15, La/qu6;

    .line 823
    .line 824
    if-eqz v15, :cond_1a

    .line 825
    .line 826
    const/4 v1, 0x1

    .line 827
    :goto_17
    move-object/from16 v22, v3

    .line 828
    .line 829
    goto :goto_18

    .line 830
    :cond_1a
    const/4 v1, 0x0

    .line 831
    goto :goto_17

    .line 832
    :goto_18
    iget-wide v2, v8, La/sr20;->e:J

    .line 833
    .line 834
    invoke-static {v9, v13, v2, v3}, La/n6x;->D(Ljava/util/List;La/vr20;J)Z

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    if-eqz v15, :cond_1b

    .line 839
    .line 840
    iget-object v3, v15, La/qu6;->F:La/ic9;

    .line 841
    .line 842
    iget-object v3, v3, La/ic9;->d:La/uyc;

    .line 843
    .line 844
    goto :goto_19

    .line 845
    :cond_1b
    sget-object v3, La/uyc;->c:La/uyc;

    .line 846
    .line 847
    :goto_19
    invoke-static {v13, v1, v2, v3}, La/tlb;->h0(La/vr20;ZZLa/uyc;)La/hao;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-object/from16 v12, p1

    .line 855
    .line 856
    move-object/from16 v1, v19

    .line 857
    .line 858
    move-object/from16 v2, v21

    .line 859
    .line 860
    move-object/from16 v3, v22

    .line 861
    .line 862
    goto :goto_14

    .line 863
    :cond_1c
    move-object/from16 v19, v1

    .line 864
    .line 865
    move-object/from16 v21, v2

    .line 866
    .line 867
    move-object/from16 v22, v3

    .line 868
    .line 869
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    const/16 v12, 0xa

    .line 873
    .line 874
    goto/16 :goto_13

    .line 875
    .line 876
    :cond_1d
    move-object/from16 v19, v1

    .line 877
    .line 878
    move-object/from16 v21, v2

    .line 879
    .line 880
    move-object/from16 v22, v3

    .line 881
    .line 882
    iget-wide v12, v8, La/sr20;->b:J

    .line 883
    .line 884
    iget-object v14, v8, La/sr20;->c:Ljava/lang/String;

    .line 885
    .line 886
    iget-object v1, v8, La/sr20;->f:La/f07;

    .line 887
    .line 888
    iget-boolean v15, v8, La/sr20;->d:Z

    .line 889
    .line 890
    new-instance v2, Ljava/util/ArrayList;

    .line 891
    .line 892
    const/16 v3, 0xa

    .line 893
    .line 894
    invoke-static {v11, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 895
    .line 896
    .line 897
    move-result v8

    .line 898
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 902
    .line 903
    .line 904
    move-result-object v8

    .line 905
    :goto_1a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 906
    .line 907
    .line 908
    move-result v9

    .line 909
    if-eqz v9, :cond_20

    .line 910
    .line 911
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v9

    .line 915
    check-cast v9, Ljava/util/List;

    .line 916
    .line 917
    new-instance v10, Ljava/util/ArrayList;

    .line 918
    .line 919
    invoke-static {v9, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 920
    .line 921
    .line 922
    move-result v11

    .line 923
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 924
    .line 925
    .line 926
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 927
    .line 928
    .line 929
    move-result-object v9

    .line 930
    :goto_1b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 931
    .line 932
    .line 933
    move-result v11

    .line 934
    if-eqz v11, :cond_1f

    .line 935
    .line 936
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v11

    .line 940
    check-cast v11, La/hao;

    .line 941
    .line 942
    iget-boolean v3, v11, La/hao;->h:Z

    .line 943
    .line 944
    if-eqz v3, :cond_1e

    .line 945
    .line 946
    iget-boolean v3, v11, La/hao;->o:Z

    .line 947
    .line 948
    if-eqz v3, :cond_1e

    .line 949
    .line 950
    move-object/from16 v16, v1

    .line 951
    .line 952
    iget v1, v11, La/hao;->a:I

    .line 953
    .line 954
    move-object/from16 p1, v7

    .line 955
    .line 956
    move-object/from16 v23, v8

    .line 957
    .line 958
    iget-wide v7, v11, La/hao;->b:J

    .line 959
    .line 960
    move-wide/from16 v32, v7

    .line 961
    .line 962
    iget-wide v7, v11, La/hao;->c:J

    .line 963
    .line 964
    move-wide/from16 v34, v7

    .line 965
    .line 966
    iget-wide v7, v11, La/hao;->d:D

    .line 967
    .line 968
    move-wide/from16 v36, v7

    .line 969
    .line 970
    iget-wide v7, v11, La/hao;->e:J

    .line 971
    .line 972
    move-wide/from16 v38, v7

    .line 973
    .line 974
    iget-wide v7, v11, La/hao;->f:D

    .line 975
    .line 976
    move/from16 v31, v1

    .line 977
    .line 978
    iget-object v1, v11, La/hao;->g:Ljava/lang/String;

    .line 979
    .line 980
    move-object/from16 v42, v1

    .line 981
    .line 982
    iget-object v1, v11, La/hao;->i:Ljava/lang/String;

    .line 983
    .line 984
    move-object/from16 v44, v1

    .line 985
    .line 986
    iget-object v1, v11, La/hao;->j:Ljava/lang/String;

    .line 987
    .line 988
    move-object/from16 v45, v1

    .line 989
    .line 990
    iget-object v1, v11, La/hao;->k:Ljava/lang/String;

    .line 991
    .line 992
    move-object/from16 v46, v1

    .line 993
    .line 994
    iget-object v1, v11, La/hao;->l:Ljava/lang/String;

    .line 995
    .line 996
    move-object/from16 v47, v1

    .line 997
    .line 998
    iget-object v1, v11, La/hao;->m:La/rh7;

    .line 999
    .line 1000
    move-object/from16 v48, v1

    .line 1001
    .line 1002
    iget-object v1, v11, La/hao;->n:La/ur20;

    .line 1003
    .line 1004
    move-object/from16 v49, v1

    .line 1005
    .line 1006
    iget-boolean v1, v11, La/hao;->p:Z

    .line 1007
    .line 1008
    move/from16 v51, v1

    .line 1009
    .line 1010
    iget-object v1, v11, La/hao;->q:La/uoy;

    .line 1011
    .line 1012
    move-object/from16 v52, v1

    .line 1013
    .line 1014
    iget-boolean v1, v11, La/hao;->r:Z

    .line 1015
    .line 1016
    move/from16 v53, v1

    .line 1017
    .line 1018
    iget v1, v11, La/hao;->s:I

    .line 1019
    .line 1020
    move/from16 v54, v1

    .line 1021
    .line 1022
    iget-object v1, v11, La/hao;->t:La/zfa0;

    .line 1023
    .line 1024
    move-object/from16 v55, v1

    .line 1025
    .line 1026
    iget-boolean v1, v11, La/hao;->u:Z

    .line 1027
    .line 1028
    move-wide/from16 v40, v7

    .line 1029
    .line 1030
    iget-wide v7, v11, La/hao;->v:J

    .line 1031
    .line 1032
    iget-object v11, v11, La/hao;->w:La/uyc;

    .line 1033
    .line 1034
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual/range {v55 .. v55}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    new-instance v30, La/hao;

    .line 1047
    .line 1048
    const/16 v43, 0x0

    .line 1049
    .line 1050
    move/from16 v56, v1

    .line 1051
    .line 1052
    move/from16 v50, v3

    .line 1053
    .line 1054
    move-wide/from16 v57, v7

    .line 1055
    .line 1056
    move-object/from16 v59, v11

    .line 1057
    .line 1058
    invoke-direct/range {v30 .. v59}, La/hao;-><init>(IJJDJDLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/rh7;La/ur20;ZZLa/uoy;ZILa/zfa0;ZJLa/uyc;)V

    .line 1059
    .line 1060
    .line 1061
    move-object/from16 v11, v30

    .line 1062
    .line 1063
    goto :goto_1c

    .line 1064
    :cond_1e
    move-object/from16 v16, v1

    .line 1065
    .line 1066
    move-object/from16 p1, v7

    .line 1067
    .line 1068
    move-object/from16 v23, v8

    .line 1069
    .line 1070
    :goto_1c
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    move-object/from16 v7, p1

    .line 1074
    .line 1075
    move-object/from16 v1, v16

    .line 1076
    .line 1077
    move-object/from16 v8, v23

    .line 1078
    .line 1079
    const/16 v3, 0xa

    .line 1080
    .line 1081
    goto/16 :goto_1b

    .line 1082
    .line 1083
    :cond_1f
    move-object/from16 v16, v1

    .line 1084
    .line 1085
    move-object/from16 p1, v7

    .line 1086
    .line 1087
    move-object/from16 v23, v8

    .line 1088
    .line 1089
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    const/16 v3, 0xa

    .line 1093
    .line 1094
    goto/16 :goto_1a

    .line 1095
    .line 1096
    :cond_20
    move-object/from16 v16, v1

    .line 1097
    .line 1098
    move-object/from16 p1, v7

    .line 1099
    .line 1100
    new-instance v10, La/ou20;

    .line 1101
    .line 1102
    move-object v11, v2

    .line 1103
    invoke-direct/range {v10 .. v18}, La/ou20;-><init>(Ljava/util/List;JLjava/lang/String;ZLa/f07;ZZ)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1107
    .line 1108
    .line 1109
    move-object/from16 v1, v19

    .line 1110
    .line 1111
    move-object/from16 v2, v21

    .line 1112
    .line 1113
    move-object/from16 v3, v22

    .line 1114
    .line 1115
    goto/16 :goto_10

    .line 1116
    .line 1117
    :cond_21
    move-object/from16 v19, v1

    .line 1118
    .line 1119
    move-object/from16 v22, v3

    .line 1120
    .line 1121
    invoke-static {v6, v4}, La/q8x;->C(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/List;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    new-instance v11, Ljava/util/ArrayList;

    .line 1126
    .line 1127
    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-static {v11, v4}, La/q8x;->F(Ljava/util/ArrayList;Ljava/util/List;)J

    .line 1131
    .line 1132
    .line 1133
    move-result-wide v1

    .line 1134
    new-instance v6, Ljava/util/HashSet;

    .line 1135
    .line 1136
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v3

    .line 1143
    :goto_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1144
    .line 1145
    .line 1146
    move-result v4

    .line 1147
    if-eqz v4, :cond_22

    .line 1148
    .line 1149
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v4

    .line 1153
    check-cast v4, La/ou20;

    .line 1154
    .line 1155
    iget-wide v7, v4, La/ou20;->b:J

    .line 1156
    .line 1157
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v4

    .line 1161
    invoke-virtual {v6, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1162
    .line 1163
    .line 1164
    goto :goto_1d

    .line 1165
    :cond_22
    move-object/from16 v4, v22

    .line 1166
    .line 1167
    iget-object v3, v4, La/pzu;->f:Ljava/lang/Object;

    .line 1168
    .line 1169
    move-object v9, v3

    .line 1170
    check-cast v9, La/b8u;

    .line 1171
    .line 1172
    iget-object v3, v4, La/pzu;->e:Ljava/lang/Object;

    .line 1173
    .line 1174
    move-object v10, v3

    .line 1175
    check-cast v10, La/a1d;

    .line 1176
    .line 1177
    iget-wide v7, v0, La/fa60;->n:J

    .line 1178
    .line 1179
    move-object v4, v11

    .line 1180
    invoke-static/range {v4 .. v10}, La/q8x;->N(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashSet;JLa/b8u;La/a1d;)V

    .line 1181
    .line 1182
    .line 1183
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    .line 1184
    .line 1185
    .line 1186
    move-result v0

    .line 1187
    if-eqz v0, :cond_23

    .line 1188
    .line 1189
    new-instance v0, La/ii6;

    .line 1190
    .line 1191
    invoke-direct {v0, v7, v8}, La/ii6;-><init>(J)V

    .line 1192
    .line 1193
    .line 1194
    goto :goto_1e

    .line 1195
    :cond_23
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1196
    .line 1197
    .line 1198
    move-result v0

    .line 1199
    if-nez v0, :cond_24

    .line 1200
    .line 1201
    new-instance v6, La/hi6;

    .line 1202
    .line 1203
    move-wide v9, v1

    .line 1204
    move-object v11, v4

    .line 1205
    invoke-direct/range {v6 .. v11}, La/hi6;-><init>(JJLjava/util/ArrayList;)V

    .line 1206
    .line 1207
    .line 1208
    move-object v0, v6

    .line 1209
    goto :goto_1e

    .line 1210
    :cond_24
    move-wide v9, v1

    .line 1211
    new-instance v0, La/gi6;

    .line 1212
    .line 1213
    invoke-direct {v0, v7, v8, v9, v10}, La/gi6;-><init>(JJ)V

    .line 1214
    .line 1215
    .line 1216
    :goto_1e
    return-object v0

    .line 1217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
