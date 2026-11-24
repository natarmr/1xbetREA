.class public final La/cot;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/util/List;

.field public synthetic k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cot;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/cot;->i:B

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, La/gxb;

    .line 8
    .line 9
    check-cast p2, Ljava/util/List;

    .line 10
    .line 11
    check-cast p3, Ljava/util/Map;

    .line 12
    .line 13
    check-cast p4, Ljava/util/Map;

    .line 14
    .line 15
    check-cast p5, La/yje;

    .line 16
    .line 17
    new-instance p0, La/cot;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {p0, v0, p5, v1}, La/cot;-><init>(ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/cot;->k:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p2, p0, La/cot;->j:Ljava/util/List;

    .line 26
    .line 27
    check-cast p3, Ljava/util/Map;

    .line 28
    .line 29
    iput-object p3, p0, La/cot;->l:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p4, Ljava/util/Map;

    .line 32
    .line 33
    iput-object p4, p0, La/cot;->m:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, La/cot;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 43
    .line 44
    check-cast p2, Ljava/util/List;

    .line 45
    .line 46
    check-cast p3, Ljava/util/List;

    .line 47
    .line 48
    check-cast p4, Ljava/util/List;

    .line 49
    .line 50
    check-cast p5, La/yje;

    .line 51
    .line 52
    new-instance p0, La/cot;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {p0, v0, p5, v1}, La/cot;-><init>(ILa/yje;B)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, La/cot;->j:Ljava/util/List;

    .line 59
    .line 60
    iput-object p2, p0, La/cot;->k:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p3, p0, La/cot;->l:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object p4, p0, La/cot;->m:Ljava/lang/Object;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/cot;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cot;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/cot;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/gxb;

    .line 11
    .line 12
    iget-object v2, v0, La/cot;->j:Ljava/util/List;

    .line 13
    .line 14
    iget-object v3, v0, La/cot;->l:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Ljava/util/Map;

    .line 17
    .line 18
    check-cast v3, Ljava/util/Map;

    .line 19
    .line 20
    iget-object v0, v0, La/cot;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/Map;

    .line 23
    .line 24
    check-cast v0, Ljava/util/Map;

    .line 25
    .line 26
    sget-object v4, La/wne;->a:La/wne;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/16 v5, 0xa

    .line 34
    .line 35
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_b

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    check-cast v6, La/a640;

    .line 57
    .line 58
    iget-object v7, v1, La/gxb;->i:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v7, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    invoke-static {v8}, La/wp20;->a(I)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const/16 v9, 0x10

    .line 69
    .line 70
    if-ge v8, v9, :cond_0

    .line 71
    .line 72
    move v8, v9

    .line 73
    :cond_0
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-direct {v9, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_1

    .line 87
    .line 88
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    move-object v10, v8

    .line 93
    check-cast v10, La/xrt0;

    .line 94
    .line 95
    invoke-virtual {v10}, La/xrt0;->a()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-interface {v9, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    iget v7, v1, La/gxb;->d:I

    .line 104
    .line 105
    iget v8, v1, La/gxb;->e:I

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6}, La/a640;->e()La/xrt0;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-virtual {v10}, La/xrt0;->a()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-virtual {v9, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    check-cast v9, La/xrt0;

    .line 129
    .line 130
    if-nez v9, :cond_2

    .line 131
    .line 132
    invoke-virtual {v6}, La/a640;->e()La/xrt0;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    :cond_2
    move-object v14, v9

    .line 137
    instance-of v9, v6, La/x540;

    .line 138
    .line 139
    if-eqz v9, :cond_3

    .line 140
    .line 141
    check-cast v6, La/x540;

    .line 142
    .line 143
    iget v9, v6, La/x540;->c:I

    .line 144
    .line 145
    instance-of v10, v14, La/srt0;

    .line 146
    .line 147
    invoke-static {v9, v7, v8, v10}, La/s0x;->A(IIIZ)La/x640;

    .line 148
    .line 149
    .line 150
    move-result-object v19

    .line 151
    iget v11, v6, La/x540;->c:I

    .line 152
    .line 153
    iget-object v12, v6, La/x540;->d:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v13, v6, La/x540;->e:La/ilf0;

    .line 156
    .line 157
    iget-object v15, v6, La/x540;->g:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v7, v6, La/x540;->h:Ljava/util/List;

    .line 160
    .line 161
    iget-object v8, v6, La/x540;->i:Ljava/util/List;

    .line 162
    .line 163
    iget-object v9, v6, La/x540;->j:Ljava/util/List;

    .line 164
    .line 165
    iget-object v6, v6, La/x540;->l:Ljava/util/Date;

    .line 166
    .line 167
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v10, La/x540;

    .line 183
    .line 184
    move-object/from16 v20, v6

    .line 185
    .line 186
    move-object/from16 v16, v7

    .line 187
    .line 188
    move-object/from16 v17, v8

    .line 189
    .line 190
    move-object/from16 v18, v9

    .line 191
    .line 192
    invoke-direct/range {v10 .. v20}, La/x540;-><init>(ILjava/lang/String;La/ilf0;La/xrt0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/x640;Ljava/util/Date;)V

    .line 193
    .line 194
    .line 195
    :goto_2
    move-object v6, v10

    .line 196
    goto/16 :goto_6

    .line 197
    .line 198
    :cond_3
    instance-of v9, v6, La/w540;

    .line 199
    .line 200
    if-eqz v9, :cond_4

    .line 201
    .line 202
    check-cast v6, La/w540;

    .line 203
    .line 204
    iget v9, v6, La/w540;->c:I

    .line 205
    .line 206
    instance-of v10, v14, La/srt0;

    .line 207
    .line 208
    invoke-static {v9, v7, v8, v10}, La/s0x;->A(IIIZ)La/x640;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    iget v12, v6, La/w540;->c:I

    .line 213
    .line 214
    iget-object v13, v6, La/w540;->d:La/s540;

    .line 215
    .line 216
    iget-object v14, v6, La/w540;->e:La/ilf0;

    .line 217
    .line 218
    iget-object v6, v6, La/w540;->g:Ljava/util/Date;

    .line 219
    .line 220
    new-instance v11, La/w540;

    .line 221
    .line 222
    move-object/from16 v16, v6

    .line 223
    .line 224
    invoke-direct/range {v11 .. v16}, La/w540;-><init>(ILa/s540;La/ilf0;La/x640;Ljava/util/Date;)V

    .line 225
    .line 226
    .line 227
    :goto_3
    move-object v6, v11

    .line 228
    goto/16 :goto_6

    .line 229
    .line 230
    :cond_4
    instance-of v9, v6, La/p540;

    .line 231
    .line 232
    if-eqz v9, :cond_6

    .line 233
    .line 234
    check-cast v6, La/p540;

    .line 235
    .line 236
    iget v9, v6, La/p540;->c:I

    .line 237
    .line 238
    instance-of v10, v14, La/srt0;

    .line 239
    .line 240
    invoke-static {v9, v7, v8, v10}, La/s0x;->A(IIIZ)La/x640;

    .line 241
    .line 242
    .line 243
    move-result-object v15

    .line 244
    iget-object v7, v6, La/p540;->k:Ljava/util/List;

    .line 245
    .line 246
    new-instance v8, Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-static {v7, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 249
    .line 250
    .line 251
    move-result v9

    .line 252
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    if-eqz v9, :cond_5

    .line 264
    .line 265
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    check-cast v9, La/o540;

    .line 270
    .line 271
    iget-object v10, v9, La/o540;->d:La/yos0;

    .line 272
    .line 273
    invoke-virtual {v10}, La/yos0;->a()La/qos0;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    invoke-static {v10, v3, v0}, La/s0x;->N(La/qos0;Ljava/util/Map;Ljava/util/Map;)La/yos0;

    .line 278
    .line 279
    .line 280
    move-result-object v19

    .line 281
    iget-object v10, v9, La/o540;->a:Ljava/lang/String;

    .line 282
    .line 283
    iget-wide v11, v9, La/o540;->b:J

    .line 284
    .line 285
    iget-object v9, v9, La/o540;->c:Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    new-instance v16, La/o540;

    .line 294
    .line 295
    move-object/from16 v21, v9

    .line 296
    .line 297
    move-object/from16 v20, v10

    .line 298
    .line 299
    move-wide/from16 v17, v11

    .line 300
    .line 301
    invoke-direct/range {v16 .. v21}, La/o540;-><init>(JLa/yos0;Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    move-object/from16 v9, v16

    .line 305
    .line 306
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_5
    iget v11, v6, La/p540;->c:I

    .line 311
    .line 312
    iget-object v12, v6, La/p540;->d:La/ilf0;

    .line 313
    .line 314
    iget-object v13, v6, La/p540;->e:Ljava/lang/String;

    .line 315
    .line 316
    iget-object v7, v6, La/p540;->h:Ljava/util/Date;

    .line 317
    .line 318
    iget-object v9, v6, La/p540;->i:Ljava/lang/String;

    .line 319
    .line 320
    iget-object v6, v6, La/p540;->j:Ljava/util/List;

    .line 321
    .line 322
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    new-instance v10, La/p540;

    .line 332
    .line 333
    move-object/from16 v18, v6

    .line 334
    .line 335
    move-object/from16 v16, v7

    .line 336
    .line 337
    move-object/from16 v19, v8

    .line 338
    .line 339
    move-object/from16 v17, v9

    .line 340
    .line 341
    invoke-direct/range {v10 .. v19}, La/p540;-><init>(ILa/ilf0;Ljava/lang/String;La/xrt0;La/x640;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :cond_6
    instance-of v9, v6, La/r540;

    .line 347
    .line 348
    if-eqz v9, :cond_8

    .line 349
    .line 350
    check-cast v6, La/r540;

    .line 351
    .line 352
    iget v9, v6, La/r540;->c:I

    .line 353
    .line 354
    instance-of v10, v14, La/srt0;

    .line 355
    .line 356
    invoke-static {v9, v7, v8, v10}, La/s0x;->A(IIIZ)La/x640;

    .line 357
    .line 358
    .line 359
    move-result-object v15

    .line 360
    iget-object v7, v6, La/r540;->k:Ljava/util/List;

    .line 361
    .line 362
    new-instance v8, Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-static {v7, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 365
    .line 366
    .line 367
    move-result v9

    .line 368
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    if-eqz v9, :cond_7

    .line 380
    .line 381
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    check-cast v9, La/q540;

    .line 386
    .line 387
    iget-object v10, v9, La/q540;->b:La/yos0;

    .line 388
    .line 389
    invoke-virtual {v10}, La/yos0;->a()La/qos0;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    invoke-static {v10, v3, v0}, La/s0x;->N(La/qos0;Ljava/util/Map;Ljava/util/Map;)La/yos0;

    .line 394
    .line 395
    .line 396
    move-result-object v19

    .line 397
    iget-object v10, v9, La/q540;->a:Ljava/lang/String;

    .line 398
    .line 399
    iget-wide v11, v9, La/q540;->c:J

    .line 400
    .line 401
    iget-object v9, v9, La/q540;->d:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    new-instance v16, La/q540;

    .line 410
    .line 411
    move-object/from16 v21, v9

    .line 412
    .line 413
    move-object/from16 v20, v10

    .line 414
    .line 415
    move-wide/from16 v17, v11

    .line 416
    .line 417
    invoke-direct/range {v16 .. v21}, La/q540;-><init>(JLa/yos0;Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    move-object/from16 v9, v16

    .line 421
    .line 422
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto :goto_5

    .line 426
    :cond_7
    iget v11, v6, La/r540;->c:I

    .line 427
    .line 428
    iget-object v12, v6, La/r540;->d:La/ilf0;

    .line 429
    .line 430
    iget-object v13, v6, La/r540;->e:Ljava/lang/String;

    .line 431
    .line 432
    iget-object v7, v6, La/r540;->h:Ljava/util/Date;

    .line 433
    .line 434
    iget-object v9, v6, La/r540;->i:Ljava/lang/String;

    .line 435
    .line 436
    iget-object v6, v6, La/r540;->j:Ljava/util/List;

    .line 437
    .line 438
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    new-instance v10, La/r540;

    .line 448
    .line 449
    move-object/from16 v18, v6

    .line 450
    .line 451
    move-object/from16 v16, v7

    .line 452
    .line 453
    move-object/from16 v19, v8

    .line 454
    .line 455
    move-object/from16 v17, v9

    .line 456
    .line 457
    invoke-direct/range {v10 .. v19}, La/r540;-><init>(ILa/ilf0;Ljava/lang/String;La/xrt0;La/x640;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 458
    .line 459
    .line 460
    goto/16 :goto_2

    .line 461
    .line 462
    :cond_8
    instance-of v9, v6, La/n540;

    .line 463
    .line 464
    if-eqz v9, :cond_9

    .line 465
    .line 466
    check-cast v6, La/n540;

    .line 467
    .line 468
    iget v9, v6, La/n540;->c:I

    .line 469
    .line 470
    const/4 v10, 0x0

    .line 471
    invoke-static {v9, v7, v8, v10}, La/s0x;->A(IIIZ)La/x640;

    .line 472
    .line 473
    .line 474
    move-result-object v15

    .line 475
    iget v12, v6, La/n540;->c:I

    .line 476
    .line 477
    iget-object v13, v6, La/n540;->d:La/m540;

    .line 478
    .line 479
    iget-object v14, v6, La/n540;->e:La/ilf0;

    .line 480
    .line 481
    iget-object v6, v6, La/n540;->g:Ljava/util/Date;

    .line 482
    .line 483
    new-instance v11, La/n540;

    .line 484
    .line 485
    move-object/from16 v16, v6

    .line 486
    .line 487
    invoke-direct/range {v11 .. v16}, La/n540;-><init>(ILa/m540;La/ilf0;La/x640;Ljava/util/Date;)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_3

    .line 491
    .line 492
    :cond_9
    instance-of v7, v6, La/y540;

    .line 493
    .line 494
    if-eqz v7, :cond_a

    .line 495
    .line 496
    :goto_6
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    goto/16 :goto_0

    .line 500
    .line 501
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 502
    .line 503
    .line 504
    const/4 v4, 0x0

    .line 505
    :cond_b
    return-object v4

    .line 506
    :pswitch_0
    iget-object v1, v0, La/cot;->j:Ljava/util/List;

    .line 507
    .line 508
    iget-object v2, v0, La/cot;->k:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v2, Ljava/util/List;

    .line 511
    .line 512
    iget-object v3, v0, La/cot;->l:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v3, Ljava/util/List;

    .line 515
    .line 516
    iget-object v0, v0, La/cot;->m:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, Ljava/util/List;

    .line 519
    .line 520
    sget-object v4, La/wne;->a:La/wne;

    .line 521
    .line 522
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    return-object v0

    .line 538
    nop

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
